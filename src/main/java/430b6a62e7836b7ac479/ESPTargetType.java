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
public final class ESPTargetType extends sourcebuild.EnumConstructor<com.moon.ESPTargetType> implements com.moon.l8 {
    public static ESPTargetType PLAYER;
    public static ESPTargetType ANIMAL;
    public static ESPTargetType MOB;
    public static ESPTargetType INVISIBLE;
    private final String a;
    private static ESPTargetType[] b;

    private ESPTargetType(java.lang.String enumName, int enumOrdinal, java.lang.String label) {
        super(enumName, enumOrdinal);
        this.a = label;
    }

    private static void initialize() throws GeneralSecurityException, UnsupportedEncodingException {
        long key = _c.a(-4704238793501663147L, 787467170439916968L, MethodHandles.lookup().lookupClass()).a(33285160418591L) ^ 134966534740499L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
        byte[] keyBytes = new byte[8];
        keyBytes[0] = (byte)(key >>> 56);
        for (int i = 1; i < 8; i++) keyBytes[i] = (byte)(key << i * 8 >>> 56);
        cipher.init(2, factory.generateSecret(new DESKeySpec(keyBytes)), new IvParameterSpec(new byte[8]));
        String[] decoded = new String[8];
        int count = 0;
        {
            String packed = "J\u00aa\u00b1\u00d0\u00e0w\u00a3o\b\b.3{\u00a4\u00ee\u00e0z\b\u00a5 \u00d8sr\u00c0\u00ba\u00cb\020\u00edtZ\0037\u00d4<\u00d0\u00f5:\u00e3\u00f9\u00ca\u00d0\u00f3\u00f5\b\t1a\000U3=\000\b\u00fd\025e\u00af\u00eb\\\u0099\"";
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
            String packed = "_NYzd\000\u0087\u00b3\u00f7X\u0082\u00ca\u00db\007\u0086\u00f9\b\n7-\u00a0\u008e\u009fkH";
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
        PLAYER = new ESPTargetType(decoded[1], 0, decoded[5]);
        ANIMAL = new ESPTargetType(decoded[0], 1, decoded[4]);
        MOB = new ESPTargetType(decoded[7], 2, decoded[2]);
        INVISIBLE = new ESPTargetType(decoded[6], 3, decoded[3]);
        b = a__ArraybV();
    }

    public static ESPTargetType[] values() {
        return (ESPTargetType[]) b.clone();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static ESPTargetType valueOf(String name) {
        return (ESPTargetType) (Object) Enum.valueOf((Class) ESPTargetType.class, name);
    }

    @Override
    public String a__String() {
        return this.a;
    }

    private static ESPTargetType[] a__ArraybV() {
        return new ESPTargetType[] { PLAYER, ANIMAL, MOB, INVISIBLE };
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
