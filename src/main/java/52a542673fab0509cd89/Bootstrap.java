package com.moon.obfuscator;


public class Bootstrap {

public static void main(java.lang.String[] p0) {
com.moon.obfuscator.NativeLoader.loadLibraryFromJar(((java.lang.String)("/natives/moon-native.dll")));
    __sourceExactCall_startMain(((java.lang.String[])(p0)));
    return;
}


public static native void registerNativesForClass(int p0);

private static native void __sourceExactCall_startMain(java.lang.String[] arguments);
}
