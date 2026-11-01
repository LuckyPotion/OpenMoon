package com.moon;

import java.lang.invoke.MethodHandles;
import java.security.GeneralSecurityException;
import java.io.UnsupportedEncodingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import moom._c;

import com.moon.module.impl.AntiVoid;

/** Complete implementation for the source-backed JVM enum adapter.
 * EnumConstructor is a declaration-only javac symbol, never executed or packaged.
 * initialize() becomes the real <clinit>; all dynamic names, delegate allocations,
 * final field writes and checked exception propagation remain in their exact owner.
 */
public final class AntiVoidMode extends sourcebuild.EnumConstructor<com.moon.AntiVoidMode> implements com.moon.l8, com.moon.kS<com.moon.module.impl.AntiVoid> {
    public static AntiVoidMode POSITION;
    public static AntiVoidMode PACKET;
    public static AntiVoidMode WATCHDOG;
    private final String a;
    private final com.moon.e2<com.moon.module.impl.AntiVoid> b;
    private static AntiVoidMode[] c;

    private AntiVoidMode(java.lang.String enumName, int enumOrdinal, java.lang.String label, com.moon.e2<com.moon.module.impl.AntiVoid> delegate) {
        super(enumName, enumOrdinal);
        this.a = label;
        this.b = delegate;
    }

    private static void initialize() throws GeneralSecurityException, UnsupportedEncodingException {
        long key = _c.a(1219737255418575756L, 7367721895307100489L, MethodHandles.lookup().lookupClass()).a(58602491051846L) ^ 106557144607847L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
        byte[] keyBytes = new byte[8];
        keyBytes[0] = (byte)(key >>> 56);
        for (int i = 1; i < 8; i++) keyBytes[i] = (byte)(key << i * 8 >>> 56);
        cipher.init(2, factory.generateSecret(new DESKeySpec(keyBytes)), new IvParameterSpec(new byte[8]));
        String[] decoded = new String[6];
        int count = 0;
        {
            String packed = "7D\034z\u009b@\u00d4\013\u00e8J\u00f1\u00c6\u00c7 \005g\020\u00cf\u00b3\u0081\u00f5\r\u00d2\u00f0\u00e8\u00b8\u00b7\u00dd\u00f4\u0081\u00e4\002?\020u\u00e1\177-\u00f3\u00c0\005rd+\u00f5\u00e4\u0092\u0095\u00cd\u00ca\020-Q\u00f9\u0090\u00c4\u0094\025\020^\u00bf8\005\u00c3\f\u0084C";
            int limit = packed.length();
            int size = 16;
            int position = -1;
            while (true) {
                String block = packed.substring(++position, position + size);
                byte[] bytes = cipher.doFinal(block.getBytes("ISO-8859-1"));
                decoded[count++] = a(bytes).intern();
                position += size;
                if (position >= limit) break;
                size = packed.charAt(position);
            }
        }
        {
            String packed = "\u0099C\u0094f\u00a4\027\003\u00e9\b\u00f78Y\u00f8\u00ca\u00a4en";
            int limit = packed.length();
            int size = 8;
            int position = -1;
            while (true) {
                String block = packed.substring(++position, position + size);
                byte[] bytes = cipher.doFinal(block.getBytes("ISO-8859-1"));
                decoded[count++] = a(bytes).intern();
                position += size;
                if (position >= limit) break;
                size = packed.charAt(position);
            }
        }
        POSITION = new AntiVoidMode(decoded[0], 0, decoded[2], new fl());
        PACKET = new AntiVoidMode(decoded[4], 1, decoded[5], new fk());
        WATCHDOG = new AntiVoidMode(decoded[1], 2, decoded[3], new fm());
        c = a__Arraybr();
    }

    public static AntiVoidMode[] values() {
        return (AntiVoidMode[]) c.clone();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static AntiVoidMode valueOf(String name) {
        return (AntiVoidMode) (Object) Enum.valueOf((Class) AntiVoidMode.class, name);
    }

    @Override
    public String a__String() {
        return this.a;
    }

    @Override
    public com.moon.e2<com.moon.module.impl.AntiVoid> a() {
        return this.b;
    }

    private static AntiVoidMode[] a__Arraybr() {
        return new AntiVoidMode[] { POSITION, PACKET, WATCHDOG };
    }

    private static String a(byte[] bytes) {
        int count = 0;
        int length = bytes.length;
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            int value = bytes[i] & 255;
            if (value < 192) chars[count++] = (char)value;
            else if (value < 224) {
                char decoded = (char)((value & 31) << 6);
                decoded = (char)(decoded | (bytes[++i] & 63));
                chars[count++] = decoded;
            } else if (i < length - 2) {
                char decoded = (char)((value & 15) << 12);
                decoded = (char)(decoded | (bytes[++i] & 63) << 6);
                decoded = (char)(decoded | (bytes[++i] & 63));
                chars[count++] = decoded;
            }
        }
        return new String(chars, 0, count);
    }
}
