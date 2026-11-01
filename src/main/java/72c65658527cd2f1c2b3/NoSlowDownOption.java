package com.moon;

import java.lang.invoke.MethodHandles;
import java.security.GeneralSecurityException;
import java.io.UnsupportedEncodingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import moom._c;

/** Complete implementation for the source-backed JVM enum adapter.
 * EnumConstructor is a declaration-only javac symbol, never executed or packaged.
 * initialize() becomes the real <clinit>; all dynamic names, delegate allocations,
 * final field writes and checked exception propagation remain in their exact owner.
 */
public final class NoSlowDownOption extends sourcebuild.EnumConstructor<com.moon.NoSlowDownOption> implements com.moon.l8 {
    public static NoSlowDownOption SWORDS;
    public static NoSlowDownOption CONSUMABLE;
    public static NoSlowDownOption BOW;
    public static NoSlowDownOption SNEAKING;
    public static NoSlowDownOption SPRINTING;
    public static NoSlowDownOption BLOCKS;
    private final String a;
    private static NoSlowDownOption[] b;
    private static long c;
    private static long d;

    private NoSlowDownOption(java.lang.String enumName, int enumOrdinal, java.lang.String label) {
        super(enumName, enumOrdinal);
        this.a = label;
    }

    private static void initialize() throws GeneralSecurityException, UnsupportedEncodingException {
        c = _c.a(6375565696836557897L, 3184385717116521628L, MethodHandles.lookup().lookupClass()).a(65132993646697L);
        long key = c ^ 92077078476265L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
        byte[] keyBytes = new byte[8];
        keyBytes[0] = (byte)(key >>> 56);
        for (int i = 1; i < 8; i++) keyBytes[i] = (byte)(key << i * 8 >>> 56);
        cipher.init(2, factory.generateSecret(new DESKeySpec(keyBytes)), new IvParameterSpec(new byte[8]));
        String[] decoded = new String[12];
        int count = 0;
        {
            String packed = "\u00b5\u0092\u00aa\u00ab}\u00f5t*\020\036u1;\u00e3\u00b9_*g\u00fet\036Y\u00ee\002G\020\u008e^KM\u00a1w\u00be\u00cej\u00f2\036\u00d9\u00ab=\020 \b\033:K\u00cc7\u00c0C\u00fc\b\u008f`k1F\u00c1\u0084\030\020\u00a0\u00c0\u0098O\u00c1\u0099[\034\u00ab\u00a9\u00c2\u0083\u00b3\u00b2\u00b4Z\020y|\u00b0t\u00bdn<\u00b04\u00e3\u00a6\u0091\u0091v[\u00b2\020\u00f8y8| l9(\u00e6|\u008b\u00eb\u00f2\037\u00f9\u00e7\b\u00f1Y.TL\u00c9\025a\b\u0095Z$N~^\016\u00a1";
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
            String packed = "\u00ad\u00aa\t\u0099S&z\013\u00eeu\u00b5G#\u00dc\u00e3y\b\u00e8\u0096X\u0097\u00f3\u00fa\u009eX";
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
        Cipher numberCipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory numberFactory = SecretKeyFactory.getInstance("DES");
        byte[] numberKey = new byte[8];
        numberKey[0] = (byte)(key >>> 56);
        for (int i = 1; i < 8; i++) numberKey[i] = (byte)(key << i * 8 >>> 56);
        numberCipher.init(2, numberFactory.generateSecret(new DESKeySpec(numberKey)), new IvParameterSpec(new byte[8]));
        long encryptedNumber = -6659503480955088687L;
        byte[] number = numberCipher.doFinal(new byte[]{
            (byte)(encryptedNumber >>> 56), (byte)(encryptedNumber >>> 48), (byte)(encryptedNumber >>> 40), (byte)(encryptedNumber >>> 32),
            (byte)(encryptedNumber >>> 24), (byte)(encryptedNumber >>> 16), (byte)(encryptedNumber >>> 8), (byte)encryptedNumber});
        d = (number[0] & 255L) << 56 | (number[1] & 255L) << 48 | (number[2] & 255L) << 40 | (number[3] & 255L) << 32
            | (number[4] & 255L) << 24 | (number[5] & 255L) << 16 | (number[6] & 255L) << 8 | number[7] & 255L;
        SWORDS = new NoSlowDownOption(decoded[4], 0, decoded[0]);
        CONSUMABLE = new NoSlowDownOption(decoded[5], 1, decoded[1]);
        BOW = new NoSlowDownOption(decoded[3], 2, decoded[11]);
        SNEAKING = new NoSlowDownOption(decoded[10], 3, decoded[6]);
        SPRINTING = new NoSlowDownOption(decoded[2], 4, decoded[7]);
        BLOCKS = new NoSlowDownOption(decoded[9], 5, decoded[8]);
        b = a__Arraybv();
    }

    public static NoSlowDownOption[] values() {
        return (NoSlowDownOption[]) b.clone();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static NoSlowDownOption valueOf(String name) {
        return (NoSlowDownOption) (Object) Enum.valueOf((Class) NoSlowDownOption.class, name);
    }

    @Override
    public String a__String() {
        return this.a;
    }

    private static NoSlowDownOption[] a__Arraybv() {
        // Stage008 a__Arraybv PC 0..7 reads c even though the XOR result is unused.
        long unused = c ^ 97552981262795L;
        // PC 8..12 converts the decrypted long d to int; this is NOT a guessed length 6.
        NoSlowDownOption[] result = new NoSlowDownOption[(int) d];
        result[0] = SWORDS;
        result[1] = CONSUMABLE;
        result[2] = BOW;
        result[3] = SNEAKING;
        result[4] = SPRINTING;
        result[5] = BLOCKS;
        return result;
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
