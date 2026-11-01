package com.moon;

import java.lang.invoke.MethodHandles;
import java.security.GeneralSecurityException;
import java.io.UnsupportedEncodingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import moom._c;

import com.moon.module.impl.LongJump;

/** Complete implementation for the source-backed JVM enum adapter.
 * EnumConstructor is a declaration-only javac symbol, never executed or packaged.
 * initialize() becomes the real <clinit>; all dynamic names, delegate allocations,
 * final field writes and checked exception propagation remain in their exact owner.
 */
public final class LongJumpMode extends sourcebuild.EnumConstructor<com.moon.LongJumpMode> implements com.moon.l8, com.moon.kS<com.moon.module.impl.LongJump> {
    public static LongJumpMode VANILLA;
    public static LongJumpMode VULCAN;
    private final String a;
    private final com.moon.e2<com.moon.module.impl.LongJump> b;
    private static LongJumpMode[] c;

    private LongJumpMode(java.lang.String enumName, int enumOrdinal, java.lang.String label, com.moon.e2<com.moon.module.impl.LongJump> delegate) {
        super(enumName, enumOrdinal);
        this.a = label;
        this.b = delegate;
    }

    private static void initialize() throws GeneralSecurityException, UnsupportedEncodingException {
        long key = _c.a(-5713675293675652712L, 1474719870092625109L, MethodHandles.lookup().lookupClass()).a(116865211316996L) ^ 123384772114960L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
        byte[] keyBytes = new byte[8];
        keyBytes[0] = (byte)(key >>> 56);
        for (int i = 1; i < 8; i++) keyBytes[i] = (byte)(key << i * 8 >>> 56);
        cipher.init(2, factory.generateSecret(new DESKeySpec(keyBytes)), new IvParameterSpec(new byte[8]));
        String[] decoded = new String[4];
        int count = 0;
        {
            String packed = "<\u009b\u00bf\u00bf\u00deY\u00e0\u00ad\bW\r\u008c\u00db\u008a\u00ba7;";
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
            String packed = ")\021\u00a2r\u00ae\u00d7G\024\b>|\u00e9\u00ea8eN\u00af";
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
        VANILLA = new LongJumpMode(decoded[1], 0, decoded[0], new fu());
        VULCAN = new LongJumpMode(decoded[2], 1, decoded[3], new fv());
        c = a__Arraybt();
    }

    public static LongJumpMode[] values() {
        return (LongJumpMode[]) c.clone();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static LongJumpMode valueOf(String name) {
        return (LongJumpMode) (Object) Enum.valueOf((Class) LongJumpMode.class, name);
    }

    @Override
    public String a__String() {
        return this.a;
    }

    @Override
    public com.moon.e2<com.moon.module.impl.LongJump> a() {
        return this.b;
    }

    private static LongJumpMode[] a__Arraybt() {
        return new LongJumpMode[] { VANILLA, VULCAN };
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
