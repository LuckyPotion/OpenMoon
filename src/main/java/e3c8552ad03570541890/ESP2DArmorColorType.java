package com.moon;

import java.lang.invoke.MethodHandles;
import java.security.GeneralSecurityException;
import java.io.UnsupportedEncodingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import moom._c;

/** Complete source implementation for the source-backed enum build adapter.
 * JVM enum header/final flags are supplied by the reviewed ABI metadata.
 * EnumConstructor is a compile-only symbol for java.lang.Enum(String,int).
 * initialize() becomes the actual <clinit>: no extra call frame or helper class runs.
 * Constant names remain dynamically decoded; do not replace them with field names.
 */
public final class ESP2DArmorColorType extends sourcebuild.EnumConstructor<com.moon.ESP2DArmorColorType> implements com.moon.l8 {
    public static ESP2DArmorColorType STATIC;
    public static ESP2DArmorColorType GRADIENT;
    private final String a;
    private static ESP2DArmorColorType[] b;

    private ESP2DArmorColorType(java.lang.String enumName, int enumOrdinal, java.lang.String label) {
        super(enumName, enumOrdinal);
        this.a = label;
    }

    private static void initialize() throws GeneralSecurityException, UnsupportedEncodingException {
        long key = _c.a(5458627851639016909L, 3515344425538208492L, MethodHandles.lookup().lookupClass()).a(40096554609514L) ^ 122937071273093L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
        byte[] keyBytes = new byte[8];
        keyBytes[0] = (byte)(key >>> 56);
        for (int i = 1; i < 8; i++) keyBytes[i] = (byte)(key << i * 8 >>> 56);
        cipher.init(2, factory.generateSecret(new DESKeySpec(keyBytes)), new IvParameterSpec(new byte[8]));
        String[] decoded = new String[4];
        int count = 0;
        {
            String packed = "\005+\022f\u00b7\032\u0098X\u00d6=I;\u00e5\u00d9/\u009d\b\u00e9\u00cf\u00f7\u00a9-Il\u009d";
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
            String packed = "W?\u009feB\023\u00bf:\020\u00b66\026tlC\u00e7\004\u00afD\034F\u00b6$\u00c5\\";
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
        STATIC = new ESP2DArmorColorType(decoded[1], 0, decoded[2]);
        GRADIENT = new ESP2DArmorColorType(decoded[0], 1, decoded[3]);
        b = a__ArraybR();
    }

    public static ESP2DArmorColorType[] values() {
        return (ESP2DArmorColorType[]) b.clone();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static ESP2DArmorColorType valueOf(String name) {
        return (ESP2DArmorColorType) (Object) Enum.valueOf((Class) ESP2DArmorColorType.class, name);
    }

    @Override
    public String a__String() {
        return this.a;
    }

    private static ESP2DArmorColorType[] a__ArraybR() {
        return new ESP2DArmorColorType[] { STATIC, GRADIENT };
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
