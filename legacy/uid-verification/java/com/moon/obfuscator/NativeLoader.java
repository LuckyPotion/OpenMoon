package com.moon.obfuscator;




import java.nio.file.Files;


import java.nio.file.StandardCopyOption;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import java.io.File;
public class NativeLoader {

private static int MIN_PREFIX_LENGTH = 3;

public static java.lang.String NATIVE_FOLDER_PATH_PREFIX = "moon-temp";

private static java.io.File temporaryDir;

static boolean $assertionsDisabled;

public NativeLoader() {
super();
}


static {
$assertionsDisabled = ((boolean)__sourceIntrinsic_integerToBoolean((((!((java.lang.Class)(com.moon.obfuscator.NativeLoader.class)).desiredAssertionStatus()) ? 1 : 0))));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_b9486f4f01b5b883ee49() throws E;
private static final class __SourceHandler_b9486f4f01b5b883ee49 {

public static boolean f152() throws Throwable {
    return __call152_2(__call152_1(__call152_0()), "posix");
}
public static boolean h152_0(java.lang.RuntimeException p0) throws Throwable {
    java.lang.RuntimeException local1 = p0;
    return false;
}
private static native java.nio.file.FileSystem __call152_0() throws Throwable;
private static native java.util.Set __call152_1(java.nio.file.FileSystem a0) throws Throwable;
private static native boolean __call152_2(java.util.Set a0, java.lang.String a1) throws Throwable;

}


private static java.io.File createTempDirectory() {
java.lang.String local0 = java.lang.System.getProperty(((java.lang.String)("java.io.tmpdir")));
    java.io.File local1 = new java.io.File(local0, "moon-temp");
    ((java.io.File)(local1)).mkdir();
    return local1;
}


public static void loadLibraryFromJar(java.lang.String p0) throws java.io.IOException {
String[] parts = p0.split("/");
        String filename = parts.length > 1 ? parts[parts.length - 1] : null;
        if (temporaryDir == null) {
            temporaryDir = NativeLoader.createTempDirectory();
            temporaryDir.deleteOnExit();
        }
        if (!$assertionsDisabled && filename == null) throw new java.lang.AssertionError();
        File temp = new File(temporaryDir, filename);
        try {
            InputStream is = NativeLoader.class.getResourceAsStream(p0);
            Throwable primary = null;
            try {
                Files.copy(is, temp.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Throwable caught) {
                primary = caught;
                throw caught;
            } finally {
                if (is != null) {
                    if (primary != null) {
                        try { is.close(); }
                        catch (Throwable suppressed) { primary.addSuppressed(suppressed); }
                    } else {
                        is.close();
                    }
                }
            }
        }
        catch (IOException e) {
            FileUtils.deleteQuietly((File)temp);
            throw e;
        }
        catch (NullPointerException e) {
            FileUtils.deleteQuietly((File)temp);
            throw new FileNotFoundException("File " + p0 + " was not found inside JAR.");
        }
        try {
            System.load(temp.getAbsolutePath());
        }
        finally {
            if (NativeLoader.isPosixCompliant()) {
                FileUtils.deleteQuietly((File)temp);
            } else {
                temp.deleteOnExit();
            }
        }
}


private static boolean isPosixCompliant() { return __sourceHandlerCall_b9486f4f01b5b883ee49(); }


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
