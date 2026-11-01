package moom;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

/** Complete source recipe. CompleteGrBuild lowers explicit compile intrinsics and
 * initialize() to the exact JVM members; these native declarations are not runtime natives.
 * Metadata restores static-final flags. All seven method bodies are newly compiled. */
public class Gr extends FY {
    private final Block c;
    private static long d;
    private static long[] e;
    private static Integer[] f;
    private static Map g;

    public Gr(Block block) {
        this.c = block;
    }

    /** Compile intrinsic: the adapter emits the exact REF_invokeStatic LDC. */
    private static native <E extends Throwable> MethodHandle __sourceIntrinsic_Gr_resolverHandleConstant() throws E;

    private static CallSite a(MethodHandles.Lookup lookup, String name, MethodType type) {
        MutableCallSite site = new MutableCallSite(type);
        try {
            site.setTarget(MethodHandles.explicitCastArguments(
                MethodHandles.insertArguments(
                    __sourceIntrinsic_Gr_resolverHandleConstant().asCollector(Object[].class, type.parameterCount()),
                    0, lookup, site, name), type));
        } catch (Exception failure) {
            throw new RuntimeException(new StringBuilder().append("moom/Gr").append(" : ")
                .append(name).append(" : ").append(type.toString()).toString(), failure);
        }
        return site;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite site, String name, Object[] arguments) {
        int selector = (Integer) arguments[0];
        long key = (Long) arguments[1];
        int value = a(selector, key);
        MethodHandle constant = MethodHandles.constant(Integer.TYPE, value);
        site.setTarget(MethodHandles.dropArguments(constant, 0, Integer.TYPE, Long.TYPE));
        return value;
    }

    private static int a(int selector, long key) {
        int index = selector ^ (int) (key & 0x7fffL) ^ 0x6ac0;
        if (f[index] == null) {
            byte[] keyBytes = new byte[] {
                (byte) (key >>> 56), (byte) (key >>> 48), (byte) (key >>> 40), (byte) (key >>> 32),
                (byte) (key >>> 24), (byte) (key >>> 16), (byte) (key >>> 8), (byte) key
            };
            long ciphertext = e[index];
            byte[] ciphertextBytes = new byte[] {
                (byte) (ciphertext >>> 56), (byte) (ciphertext >>> 48), (byte) (ciphertext >>> 40), (byte) (ciphertext >>> 32),
                (byte) (ciphertext >>> 24), (byte) (ciphertext >>> 16), (byte) (ciphertext >>> 8), (byte) ciphertext
            };
            Long threadId = Thread.currentThread().getId();
            Object[] context = (Object[]) g.get(threadId);
            byte[] decodedBytes;
            try {
                if (context == null) {
                    context = new Object[3];
                    context[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    context[1] = SecretKeyFactory.getInstance("DES");
                    context[2] = new IvParameterSpec(new byte[8]);
                    g.put(threadId, context);
                }
                DESKeySpec keySpec = new DESKeySpec(keyBytes);
                SecretKey secret = ((SecretKeyFactory) context[1]).generateSecret(keySpec);
                Cipher cipher = (Cipher) context[0];
                cipher.init(2, secret, (IvParameterSpec) context[2]);
                decodedBytes = cipher.doFinal(ciphertextBytes);
            } catch (Exception failure) {
                throw new RuntimeException("moom/Gr", failure);
            }
            int value = (decodedBytes[4] & 255) << 24 | (decodedBytes[5] & 255) << 16
                | (decodedBytes[6] & 255) << 8 | decodedBytes[7] & 255;
            f[index] = value;
        }
        return f[index];
    }

    private static Oo a(Oo failure) {
        return failure;
    }

    private static void __sourceInitializeGr() throws Exception {
        d = _c.a(4061246431891227800L, -983941004033321628L,
                MethodHandles.lookup().lookupClass()).a(222732068431037L);
        g = new HashMap(13);
        long key = d ^ 111897089229416L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
        byte[] keyBytes = new byte[8];
        keyBytes[0] = (byte) (key >>> 56);
        for (int i = 1; i < 8; i++) {
            keyBytes[i] = (byte) (key << i * 8 >>> 56);
        }
        cipher.init(2, factory.generateSecret(new DESKeySpec(keyBytes)),
                new IvParameterSpec(new byte[8]));
        long[] values = new long[11];
        int next = 0;
        // Original PC 134: packed block 1; 9 entries.
        {
            String packed = "\u00b9\\B\u00ac\u0080_#'\u00ed\u00ba\u00ae!\u00be\u00d9K\u00e7q\u00db\u00f6\u00e3\u00d32W\u00d4\024*G\023e\u00d3\024\u00bc6\\\u00f5Gg\u00a0:\u00da\u00b4\006\007\u0099\u009c\u00d1\u00b6\u00a9\u00e4z'\u00b9u\u00e6L\007\u00f4\030\001\u00a1x\u00bd?Q,\u00d5\u00b4\u00ef\u008e`q\002";
            int limit = packed.length();
            int offset = 0;
            do {
                byte[] encoded = packed.substring(offset, offset += 8).getBytes("ISO-8859-1");
                int index = next++;
                long ciphertext = ((long) encoded[0] & 255L) << 56 |
                    ((long) encoded[1] & 255L) << 48 |
                    ((long) encoded[2] & 255L) << 40 |
                    ((long) encoded[3] & 255L) << 32 |
                    ((long) encoded[4] & 255L) << 24 |
                    ((long) encoded[5] & 255L) << 16 |
                    ((long) encoded[6] & 255L) << 8 |
                    ((long) encoded[7] & 255L);
                byte[] plaintext = cipher.doFinal(new byte[] {
                    (byte) (ciphertext >>> 56), (byte) (ciphertext >>> 48),
                    (byte) (ciphertext >>> 40), (byte) (ciphertext >>> 32),
                    (byte) (ciphertext >>> 24), (byte) (ciphertext >>> 16),
                    (byte) (ciphertext >>> 8), (byte) ciphertext
                });
                values[index] = ((long) plaintext[0] & 255L) << 56 |
                    ((long) plaintext[1] & 255L) << 48 |
                    ((long) plaintext[2] & 255L) << 40 |
                    ((long) plaintext[3] & 255L) << 32 |
                    ((long) plaintext[4] & 255L) << 24 |
                    ((long) plaintext[5] & 255L) << 16 |
                    ((long) plaintext[6] & 255L) << 8 |
                    ((long) plaintext[7] & 255L);
            } while (offset < limit);
        }
        // Original PC 287: packed block 2; 2 entries.
        {
            String packed = "\u00ba\u00bb\u00fd\u00fc\u00ea\u008f:\u0094\u00ff\u009af1\u0085\u00bf\u0090\024";
            int limit = packed.length();
            int offset = 0;
            do {
                byte[] encoded = packed.substring(offset, offset += 8).getBytes("ISO-8859-1");
                int index = next++;
                long ciphertext = ((long) encoded[0] & 255L) << 56 |
                    ((long) encoded[1] & 255L) << 48 |
                    ((long) encoded[2] & 255L) << 40 |
                    ((long) encoded[3] & 255L) << 32 |
                    ((long) encoded[4] & 255L) << 24 |
                    ((long) encoded[5] & 255L) << 16 |
                    ((long) encoded[6] & 255L) << 8 |
                    ((long) encoded[7] & 255L);
                byte[] plaintext = cipher.doFinal(new byte[] {
                    (byte) (ciphertext >>> 56), (byte) (ciphertext >>> 48),
                    (byte) (ciphertext >>> 40), (byte) (ciphertext >>> 32),
                    (byte) (ciphertext >>> 24), (byte) (ciphertext >>> 16),
                    (byte) (ciphertext >>> 8), (byte) ciphertext
                });
                values[index] = ((long) plaintext[0] & 255L) << 56 |
                    ((long) plaintext[1] & 255L) << 48 |
                    ((long) plaintext[2] & 255L) << 40 |
                    ((long) plaintext[3] & 255L) << 32 |
                    ((long) plaintext[4] & 255L) << 24 |
                    ((long) plaintext[5] & 255L) << 16 |
                    ((long) plaintext[6] & 255L) << 8 |
                    ((long) plaintext[7] & 255L);
            } while (offset < limit);
        }
        e = values;
        f = new Integer[11];
    }

    private static native <E extends Throwable> int __sourceIntrinsic_Gr_height(DT position) throws E;
    private static native <E extends Throwable> DT __sourceIntrinsic_Gr_downOne(DT position) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt22(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt37(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt139(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt308(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt335(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt361(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt470(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt488(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt552(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt579(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt606(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt627(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt645(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt691(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt721(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt739(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt803(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt821(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt869(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt897(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt917(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt979(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt999(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1047(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1075(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1093(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1157(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1175(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1418(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1445(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1472(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1493(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1511(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1616(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1643(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1670(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1691(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1709(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1962(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt1989(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2016(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2037(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2055(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2101(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2131(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2149(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2213(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2231(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2279(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2307(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2327(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2389(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2409(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2457(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2485(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2503(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2567(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2585(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2822(int selector, long key) throws E;
    private static native <E extends Throwable> int __sourceIntrinsic_Gr_indyAt2849(int selector, long key) throws E;
    public boolean a__Boolean(World var1, Random var2, DT var3) {
      long var4 = d ^ 69594541901176L;
      int[] marker = FY.b();
      var3 = var3.a(__sourceIntrinsic_Gr_indyAt22(15456, 6535263635253679061L ^ var4), 0, __sourceIntrinsic_Gr_indyAt37(31376, 6098060976475051311L ^ var4));

      // PCs 48..144: the null path carries an int/boolean onto NEWARRAY.
      int maskSize;
      while (true) {
         if (__sourceIntrinsic_Gr_height(var3) > 5) {
            int air = var1.a__Boolean(var3) ? 1 : 0;
            if (marker == null) { maskSize = air; break; }
            if (air != 0) { var3 = __sourceIntrinsic_Gr_downOne(var3); continue; }
         }
         maskSize = __sourceIntrinsic_Gr_height(var3);
         break;
      }
      if (marker != null) {
         if (maskSize <= 4) return false;
         var3 = var3.b(4);
         maskSize = __sourceIntrinsic_Gr_indyAt139(5162, 3009740423937948564L ^ var4);
      }
      boolean[] var7 = new boolean[maskSize];
      int boundaryStart = 0;
      {
         int var8 = var2.nextInt(4) + 4;

         for (int var9 = 0; var9 < var8; var9++) {
            double var10 = var2.nextDouble() * 6.0 + 3.0;
            double var12 = var2.nextDouble() * 4.0 + 2.0;
            double var14 = var2.nextDouble() * 6.0 + 3.0;
            double var16 = var2.nextDouble() * (16.0 - var10 - 2.0) + 1.0 + var10 / 2.0;
            double var18 = var2.nextDouble() * (8.0 - var12 - 4.0) + 2.0 + var12 / 2.0;
            double var20 = var2.nextDouble() * (16.0 - var14 - 2.0) + 1.0 + var14 / 2.0;

            // PC 292 takes the null marker to the boundary loop with value 1.
            if (marker == null) { boundaryStart = 1; break; }
            for (int var22 = 1; var22 < __sourceIntrinsic_Gr_indyAt308(22974, 5064868568689456646L ^ var4); var22++) {
               for (int var23 = 1; var23 < __sourceIntrinsic_Gr_indyAt335(3960, 6355652060002705605L ^ var4); var23++) {
                  for (int var24 = 1; var24 < __sourceIntrinsic_Gr_indyAt361(64, 6691692827543302137L ^ var4); var24++) {
                     double var25 = (var22 - var16) / (var10 / 2.0);
                     double var27 = (var24 - var18) / (var12 / 2.0);
                     double var29 = (var23 - var20) / (var14 / 2.0);
                     double var31 = var25 * var25 + var27 * var27 + var29 * var29;
                     if (var31 < 1.0) {
                        var7[(var22 * __sourceIntrinsic_Gr_indyAt470(15837, 7891224533467550315L ^ var4) + var23) * __sourceIntrinsic_Gr_indyAt488(13583, 3906013663038888632L ^ var4) + var24] = true;
                     }
                  }
               }
            }
         }

         for (int var35 = boundaryStart; var35 < __sourceIntrinsic_Gr_indyAt552(32420, 634831675046138142L ^ var4); var35++) {
            if (marker == null) break;
            for (int var40 = 0; var40 < __sourceIntrinsic_Gr_indyAt579(32420, 634831675046138142L ^ var4); var40++) {
               for (int var11 = 0; var11 < __sourceIntrinsic_Gr_indyAt606(9515, 7228645178260638352L ^ var4); var11++) {
                  boolean var49 = !var7[(var35 * __sourceIntrinsic_Gr_indyAt627(32420, 634831675046138142L ^ var4) + var40) * __sourceIntrinsic_Gr_indyAt645(9515, 7228645178260638352L ^ var4) + var11]
                     && (
                        var35 < __sourceIntrinsic_Gr_indyAt691(3960, 6355652060002705605L ^ var4)
                              && var7[((var35 + 1) * __sourceIntrinsic_Gr_indyAt721(32420, 634831675046138142L ^ var4) + var40) * __sourceIntrinsic_Gr_indyAt739(9515, 7228645178260638352L ^ var4) + var11]
                           || var35 > 0
                              && var7[((var35 - 1) * __sourceIntrinsic_Gr_indyAt803(32420, 634831675046138142L ^ var4) + var40) * __sourceIntrinsic_Gr_indyAt821(9515, 7228645178260638352L ^ var4) + var11]
                           || var40 < __sourceIntrinsic_Gr_indyAt869(3960, 6355652060002705605L ^ var4)
                              && var7[(var35 * __sourceIntrinsic_Gr_indyAt897(32420, 634831675046138142L ^ var4) + var40 + 1) * __sourceIntrinsic_Gr_indyAt917(9515, 7228645178260638352L ^ var4) + var11]
                           || var40 > 0
                              && var7[(var35 * __sourceIntrinsic_Gr_indyAt979(32420, 634831675046138142L ^ var4) + (var40 - 1)) * __sourceIntrinsic_Gr_indyAt999(9515, 7228645178260638352L ^ var4) + var11]
                           || var11 < __sourceIntrinsic_Gr_indyAt1047(22376, 6957713467185477844L ^ var4)
                              && var7[(var35 * __sourceIntrinsic_Gr_indyAt1075(32420, 634831675046138142L ^ var4) + var40) * __sourceIntrinsic_Gr_indyAt1093(9515, 7228645178260638352L ^ var4) + var11 + 1]
                           || var11 > 0
                              && var7[(var35 * __sourceIntrinsic_Gr_indyAt1157(32420, 634831675046138142L ^ var4) + var40) * __sourceIntrinsic_Gr_indyAt1175(9515, 7228645178260638352L ^ var4) + (var11 - 1)]
                     );
                  if (var49) {
                     fn var13 = var1.a__fE(var3.a(var35, var11, var40)).a__ch().a__fn();
                     if (var11 >= 4 && var13.a__Boolean()) {
                        return false;
                     }

                     if (var11 < 4 && !var13.b__Boolean() && var1.a__fE(var3.a(var35, var11, var40)).a__ch() != this.c) {
                        return false;
                     }
                  }
               }
            }
         }

         for (int var36 = 0; var36 < __sourceIntrinsic_Gr_indyAt1418(32420, 634831675046138142L ^ var4); var36++) {
            if (marker == null) break;
            for (int var41 = 0; var41 < __sourceIntrinsic_Gr_indyAt1445(32420, 634831675046138142L ^ var4); var41++) {
               for (int var45 = 0; var45 < __sourceIntrinsic_Gr_indyAt1472(9515, 7228645178260638352L ^ var4); var45++) {
                  if (var7[(var36 * __sourceIntrinsic_Gr_indyAt1493(32420, 634831675046138142L ^ var4) + var41) * __sourceIntrinsic_Gr_indyAt1511(9515, 7228645178260638352L ^ var4) + var45]) {
                     var1.a(var3.a(var36, var45, var41), var45 >= 4 ? Blocks.a.a__fE() : this.c.a__fE(), 2);
                  }
               }
            }
         }

         for (int var37 = 0; var37 < __sourceIntrinsic_Gr_indyAt1616(32420, 634831675046138142L ^ var4); var37++) {
            if (marker == null) return false;
            for (int var42 = 0; var42 < __sourceIntrinsic_Gr_indyAt1643(32420, 634831675046138142L ^ var4); var42++) {
               for (int var46 = 4; var46 < __sourceIntrinsic_Gr_indyAt1670(9515, 7228645178260638352L ^ var4); var46++) {
                  if (var7[(var37 * __sourceIntrinsic_Gr_indyAt1691(32420, 634831675046138142L ^ var4) + var42) * __sourceIntrinsic_Gr_indyAt1709(9515, 7228645178260638352L ^ var4) + var46]) {
                     DT var50 = var3.a(var37, var46 - 1, var42);
                     if (var1.a__fE(var50).a__ch() == Blocks.d && var1.b(EnumSkyBlock.SKY, var3.a(var37, var46, var42)) > 0) {
                        BiomeGenBase var52 = var1.a__ES(var50);
                        if (var52.am.a__ch() == Blocks.bl) {
                           var1.a(var50, Blocks.bl.a__fE(), 2);
                        } else {
                           var1.a(var50, Blocks.c.a__fE(), 2);
                        }
                     }
                  }
               }
            }
         }

         // PC 1935 sends the already evaluated material and fn.i to PC 2805.
         fn material = this.c.a__fn();
         fn comparison = fn.i;
         if (marker != null) {
         if (material == comparison) {
            for (int var38 = 0; var38 < __sourceIntrinsic_Gr_indyAt1962(32420, 634831675046138142L ^ var4); var38++) {
               for (int var43 = 0; var43 < __sourceIntrinsic_Gr_indyAt1989(32420, 634831675046138142L ^ var4); var43++) {
                  for (int var47 = 0; var47 < __sourceIntrinsic_Gr_indyAt2016(9515, 7228645178260638352L ^ var4); var47++) {
                     boolean var51 = !var7[(var38 * __sourceIntrinsic_Gr_indyAt2037(32420, 634831675046138142L ^ var4) + var43) * __sourceIntrinsic_Gr_indyAt2055(9515, 7228645178260638352L ^ var4) + var47]
                        && (
                           var38 < __sourceIntrinsic_Gr_indyAt2101(3960, 6355652060002705605L ^ var4)
                                 && var7[((var38 + 1) * __sourceIntrinsic_Gr_indyAt2131(32420, 634831675046138142L ^ var4) + var43) * __sourceIntrinsic_Gr_indyAt2149(9515, 7228645178260638352L ^ var4) + var47]
                              || var38 > 0
                                 && var7[((var38 - 1) * __sourceIntrinsic_Gr_indyAt2213(32420, 634831675046138142L ^ var4) + var43) * __sourceIntrinsic_Gr_indyAt2231(9515, 7228645178260638352L ^ var4) + var47]
                              || var43 < __sourceIntrinsic_Gr_indyAt2279(3960, 6355652060002705605L ^ var4)
                                 && var7[(var38 * __sourceIntrinsic_Gr_indyAt2307(32420, 634831675046138142L ^ var4) + var43 + 1) * __sourceIntrinsic_Gr_indyAt2327(9515, 7228645178260638352L ^ var4) + var47]
                              || var43 > 0
                                 && var7[(var38 * __sourceIntrinsic_Gr_indyAt2389(32420, 634831675046138142L ^ var4) + (var43 - 1)) * __sourceIntrinsic_Gr_indyAt2409(9515, 7228645178260638352L ^ var4) + var47]
                              || var47 < __sourceIntrinsic_Gr_indyAt2457(22376, 6957713467185477844L ^ var4)
                                 && var7[(var38 * __sourceIntrinsic_Gr_indyAt2485(32420, 634831675046138142L ^ var4) + var43) * __sourceIntrinsic_Gr_indyAt2503(9515, 7228645178260638352L ^ var4) + var47 + 1]
                              || var47 > 0
                                 && var7[(var38 * __sourceIntrinsic_Gr_indyAt2567(32420, 634831675046138142L ^ var4) + var43) * __sourceIntrinsic_Gr_indyAt2585(9515, 7228645178260638352L ^ var4) + (var47 - 1)]
                        );
                     if (var51 && (var47 < 4 || var2.nextInt(2) != 0) && var1.a__fE(var3.a(var38, var47, var43)).a__ch().a__fn().b__Boolean()) {
                        var1.a(var3.a(var38, var47, var43), Blocks.b.a__fE(), 2);
                     }
                  }
               }
            }
         }

         material = this.c.a__fn();
         comparison = fn.h;
         }
         if (material == comparison) {
            for (int var39 = 0; var39 < __sourceIntrinsic_Gr_indyAt2822(32420, 634831675046138142L ^ var4); var39++) {
            if (marker == null) return false;
               for (int var44 = 0; var44 < __sourceIntrinsic_Gr_indyAt2849(32420, 634831675046138142L ^ var4); var44++) {
                  byte var48 = 4;
                  if (var1.h(var3.a(var39, var48, var44))) {
                     var1.a(var3.a(var39, var48, var44), Blocks.aI.a__fE(), 2);
                  }
               }
            }
         }

         return true;
      }
   }

}
