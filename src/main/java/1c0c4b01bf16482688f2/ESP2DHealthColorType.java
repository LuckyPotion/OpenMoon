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
public final class ESP2DHealthColorType extends sourcebuild.EnumConstructor<com.moon.ESP2DHealthColorType> implements com.moon.l8 {
    public static ESP2DHealthColorType NORMAL;
    public static ESP2DHealthColorType GRADIENT;
    public static ESP2DHealthColorType STATIC;
    private final String a;
    private static ESP2DHealthColorType[] b;

    private ESP2DHealthColorType(java.lang.String enumName, int enumOrdinal, java.lang.String label) {
        super(enumName, enumOrdinal);
        this.a = label;
    }

    private static void initialize() throws GeneralSecurityException, UnsupportedEncodingException {
        long key = _c.a(7030298524829863388L, -1318084007124726784L, MethodHandles.lookup().lookupClass()).a(65883314790614L) ^ 85885270909135L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
        byte[] keyBytes = new byte[8];
        keyBytes[0] = (byte)(key >>> 56);
        for (int i = 1; i < 8; i++) keyBytes[i] = (byte)(key << i * 8 >>> 56);
        cipher.init(2, factory.generateSecret(new DESKeySpec(keyBytes)), new IvParameterSpec(new byte[8]));
        String[] decoded = new String[6];
        int count = 0;
        {
            String packed = "\u00c4\024\u00f8\u00cc6\u00fb\u00f2\u0086\020Q\u00b2\u00a4\u008c\u00f6G\021\f\u00b64\027\u00a3\u00d3\u00cd\u00dae\b7\u00e9\025\u009f6d%N\020\u00e4\u00c5\u00e7\u00f7\u00b8MVF\031\u0092\026\u00beV\u00fe\u00db\u00b4";
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
        {
            String packed = "\u00cc\u00b0\006\u00ae2\u0094\u00fcZ\b\u00b6u\u009b\u00e9\u00f2\u0091\034\u009e";
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
        NORMAL = new ESP2DHealthColorType(decoded[2], 0, decoded[5]);
        GRADIENT = new ESP2DHealthColorType(decoded[3], 1, decoded[1]);
        STATIC = new ESP2DHealthColorType(decoded[0], 2, decoded[4]);
        b = a__ArraybT();
    }

    public static ESP2DHealthColorType[] values() {
        return (ESP2DHealthColorType[]) b.clone();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static ESP2DHealthColorType valueOf(String name) {
        return (ESP2DHealthColorType) (Object) Enum.valueOf((Class) ESP2DHealthColorType.class, name);
    }

    @Override
    public String a__String() {
        return this.a;
    }

    private static ESP2DHealthColorType[] a__ArraybT() {
        return new ESP2DHealthColorType[] { NORMAL, GRADIENT, STATIC };
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
