package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class x6 implements net.minecraft.item.crafting.IRecipe {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

private x6() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-5459581548796088540L)), ((long)(4372061037399033872L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(4931464544157L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.x6.a ^ 42589916147184L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1667_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1667_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1667_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1667_14 = new byte[8];
    (__sourceSpill1667_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1667_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1667_16 = __sourceSpill1667_14;
    ((javax.crypto.Cipher)(__sourceSpill1667_11)).init(((int)(__sourceSpill1667_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1667_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1667_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "q\t*¬QóÔ c\027«ýYÕJj¾îDâèk¹äý´\020Éb"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1667_25 = local6_life21;
        int __sourceSpill1667_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1667_25)).substring(((int)(__sourceSpill1667_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1667_30 = local8_life19;
        int __sourceSpill1667_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1667_33 = new byte[8];
        (__sourceSpill1667_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1667_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1667_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1667_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1667_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1667_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1667_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1667_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1667_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1667_34)).doFinal(((byte[])(__sourceSpill1667_33)));
        (__sourceSpill1667_30)[__sourceSpill1667_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\025ö0Ss\005l×/Ê^\026"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1667_38 = local6_life21;
        int __sourceSpill1667_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1667_38)).substring(((int)(__sourceSpill1667_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1667_43 = local8_life19;
        int __sourceSpill1667_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1667_46 = new byte[8];
        (__sourceSpill1667_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1667_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1667_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1667_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1667_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1667_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1667_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1667_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1667_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1667_47)).doFinal(((byte[])(__sourceSpill1667_46)));
        (__sourceSpill1667_43)[__sourceSpill1667_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


private moom.bq a(moom.wx p0) {
net.minecraft.item.Item lexicalValue1398_65_0;
    net.minecraft.item.Item lexicalValue1398_65_1;
    int lexicalValue1398_75_0;
    int lexicalValue1398_90_0;
    int lexicalValue1398_94_0;
    int lexicalValue1398_99_0;
    int lexicalValue1398_103_0;
    int lexicalValue1398_108_0;
    int lexicalValue1398_137_0;
    net.minecraft.item.ItemStack lexicalValue1398_151_0;
    net.minecraft.item.Item lexicalValue1398_159_0;
    net.minecraft.item.Item lexicalValue1398_159_1;
    int lexicalValue1398_192_0;
    int lexicalValue1398_192_1;
    int lexicalValue1398_199_0;
    int lexicalValue1398_217_0;
    int lexicalValue1398_226_0;
    int lexicalValue1398_228_0;
    java.lang.String spill1398_0;
    boolean spill1398_1;
    int spill1398_2;
    net.minecraft.item.Item spill1398_3;
    net.minecraft.item.Item spill1398_4;
    int spill1398_5;
    int spill1398_6;
    boolean spill1398_7;
    int spill1398_8;
    net.minecraft.item.ItemStack spill1398_9;
    net.minecraft.item.Item spill1398_10;
    net.minecraft.item.Item spill1398_11;
    int spill1398_12;
    int spill1398_13;
    int spill1398_14;
    int spill1398_15;
    char spill1398_16;
    char spill1398_17;
    long life2_3;
    moom.bq[] life5_5;
    int life6_9;
    java.lang.String life4_10;
    int life7_12;
    moom.bq life8_19;
    int life9_29;
    int life10_39;
    int life11_41;
    int life12_43;
    net.minecraft.item.ItemStack life13_63;
    int life10_178;
    int life11_180;
    int life12_203;
    int life13_207;
    net.minecraft.item.ItemStack life14_211;
    lexical_join_234: {
    life2_3 = (moom.x6.a ^ 74438542307692L);
    life5_5 = moom.bq.values();
    spill1398_0 = moom.ye.b();
    life6_9 = (life5_5).length;
    life4_10 = spill1398_0;
    life7_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_232: {
    lexical_join_231: {
    lexical_join_228: {
    lexical_join_227: {
    lexical_join_226: {
    lexical_join_225: {
    lexical_join_223: {
    lexical_join_108: {
    lexical_join_106: {
    lexical_join_104: {
    lexical_join_103: {
    lexical_join_99: {
    lexical_join_98: {
    if (!((life7_12 < life6_9))) {
        break lexical_join_234;
    }
    life8_19 = (life5_5)[life7_12];
    if (!((life4_10 == null))) {
        break lexical_join_232;
    }
    if (!(((moom.bq)(life8_19)).a__Boolean())) {
        break lexical_join_231;
    }
    life9_29 = 1;
    spill1398_1 = ((moom.bq)(life8_19)).b__Boolean();
    if (!((life4_10 == null))) {
        lexicalValue1398_108_0 = ((spill1398_1) ? 1 : 0);
        break lexical_join_108;
    }
    if (!(spill1398_1)) {
        break lexical_join_106;
    }
    life10_39 = 0;
    life11_41 = 0;
    life12_43 = 0;
    lexical_cycle_38: while (true) {
    lexical_join_96: {
    lexical_join_95: {
    lexical_join_94: {
    lexical_join_93: {
    lexical_join_90: {
    lexical_join_89: {
    lexical_join_78: {
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_65: {
    if (!((life12_43 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_98;
    }
    spill1398_2 = life9_29;
    if (!((life4_10 == null))) {
        lexicalValue1398_99_0 = spill1398_2;
        break lexical_join_99;
    }
    if (!((life4_10 == null))) {
        lexicalValue1398_99_0 = spill1398_2;
        break lexical_join_99;
    }
    if (!((spill1398_2 != 0))) {
        break lexical_join_98;
    }
    life13_63 = ((moom.wx)(p0)).a__xW(((int)(life12_43)));
    if (!((life4_10 == null))) {
        break lexical_join_96;
    }
    if (!((life13_63 != null))) {
        break lexical_join_95;
    }
    spill1398_3 = ((net.minecraft.item.ItemStack)(life13_63)).a__wQ();
    spill1398_4 = net.minecraft.init.Items.ci;
    if (!((life4_10 == null))) {
        lexicalValue1398_65_0 = spill1398_3;
        lexicalValue1398_65_1 = spill1398_4;
        break lexical_join_65;
    }
    if (!((spill1398_3 != spill1398_4))) {
        break lexical_join_95;
    }
    lexicalValue1398_65_0 = ((net.minecraft.item.ItemStack)(life13_63)).a__wQ();
    lexicalValue1398_65_1 = net.minecraft.init.Items.aW;
    }
    if (!((lexicalValue1398_65_0 == lexicalValue1398_65_1))) {
        break lexical_join_78;
    }
    spill1398_5 = life11_41;
    if (!((life4_10 == null))) {
        lexicalValue1398_75_0 = spill1398_5;
        break lexical_join_75;
    }
    if (!((spill1398_5 != 0))) {
        break lexical_join_74;
    }
    life9_29 = 0;
    if (!((life4_10 != null))) {
        break lexical_join_98;
    }
    }
    lexicalValue1398_75_0 = 1;
    }
    life11_41 = lexicalValue1398_75_0;
    if (!((life4_10 != null))) {
        break lexical_join_95;
    }
    }
    spill1398_6 = life10_39;
    if (!((life4_10 == null))) {
        lexicalValue1398_90_0 = spill1398_6;
        break lexical_join_90;
    }
    if (!((spill1398_6 == 0))) {
        break lexical_join_89;
    }
    spill1398_7 = ((net.minecraft.item.ItemStack)(life13_63)).b(((net.minecraft.item.ItemStack)(((moom.bq)(life8_19)).a__xW())));
    if (!((life4_10 == null))) {
        lexicalValue1398_94_0 = ((spill1398_7) ? 1 : 0);
        break lexical_join_94;
    }
    if (!((!spill1398_7))) {
        break lexical_join_93;
    }
    }
    lexicalValue1398_90_0 = 0;
    }
    life9_29 = lexicalValue1398_90_0;
    if (!((life4_10 != null))) {
        break lexical_join_98;
    }
    }
    lexicalValue1398_94_0 = 1;
    }
    life10_39 = lexicalValue1398_94_0;
    }
    life12_43 += 1;
    }
    if (!((life4_10 != null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    lexicalValue1398_99_0 = life10_39;
    }
    if (!((life4_10 == null))) {
        lexicalValue1398_103_0 = lexicalValue1398_99_0;
        break lexical_join_103;
    }
    if (!((lexicalValue1398_99_0 == 0))) {
        break lexical_join_104;
    }
    lexicalValue1398_103_0 = 0;
    }
    life9_29 = lexicalValue1398_103_0;
    }
    if (!((life4_10 != null))) {
        break lexical_join_227;
    }
    }
    lexicalValue1398_108_0 = ((moom.wx)(p0)).b__Int();
    }
    if (!((life4_10 == null))) {
        lexicalValue1398_226_0 = lexicalValue1398_108_0;
        break lexical_join_226;
    }
    if (!((lexicalValue1398_108_0 == ((((moom.bq)(life8_19)).a__ArrayString()).length * ((java.lang.String)((((moom.bq)(life8_19)).a__ArrayString())[0])).length())))) {
        break lexical_join_225;
    }
    life10_178 = -1;
    life11_180 = 0;
    lexical_cycle_124: while (true) {
    lexical_join_220: {
    lexical_join_217: {
    lexical_join_202: {
    lexical_join_199: {
    lexical_join_197: {
    lexical_join_192: {
    lexical_join_179: {
    lexical_join_164: {
    lexical_join_159: {
    lexical_join_151: {
    lexical_join_137: {
    if (!((life11_180 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_223;
    }
    spill1398_8 = life9_29;
    if (!((life4_10 == null))) {
        lexicalValue1398_228_0 = spill1398_8;
        break lexical_join_228;
    }
    if (!((life4_10 == null))) {
        lexicalValue1398_137_0 = spill1398_8;
        break lexical_join_137;
    }
    if (!((spill1398_8 != 0))) {
        break lexical_join_223;
    }
    lexicalValue1398_137_0 = (life11_180 / 3);
    }
    life12_203 = lexicalValue1398_137_0;
    life13_207 = (life11_180 % 3);
    life14_211 = ((moom.wx)(p0)).a__xW(((int)(life11_180)));
    spill1398_9 = life14_211;
    if (!((life4_10 == null))) {
        lexicalValue1398_151_0 = spill1398_9;
        break lexical_join_151;
    }
    if (!((spill1398_9 != null))) {
        break lexical_join_202;
    }
    lexicalValue1398_151_0 = life14_211;
    }
    spill1398_10 = ((net.minecraft.item.ItemStack)(lexicalValue1398_151_0)).a__wQ();
    spill1398_11 = net.minecraft.init.Items.ci;
    if (!((life4_10 == null))) {
        lexicalValue1398_159_0 = spill1398_10;
        lexicalValue1398_159_1 = spill1398_11;
        break lexical_join_159;
    }
    if (!((spill1398_10 != spill1398_11))) {
        break lexical_join_202;
    }
    lexicalValue1398_159_0 = ((net.minecraft.item.ItemStack)(life14_211)).a__wQ();
    lexicalValue1398_159_1 = net.minecraft.init.Items.aW;
    }
    if (!((lexicalValue1398_159_0 != lexicalValue1398_159_1))) {
        break lexical_join_164;
    }
    life9_29 = 0;
    if (!((life4_10 != null))) {
        break lexical_join_223;
    }
    }
    spill1398_12 = life10_178;
    spill1398_13 = -1;
    if (!((life4_10 == null))) {
        lexicalValue1398_192_0 = spill1398_12;
        lexicalValue1398_192_1 = spill1398_13;
        break lexical_join_192;
    }
    if (!((spill1398_12 != spill1398_13))) {
        break lexical_join_179;
    }
    spill1398_14 = life10_178;
    spill1398_15 = ((net.minecraft.item.ItemStack)(life14_211)).c();
    if (!((life4_10 == null))) {
        lexicalValue1398_192_0 = spill1398_14;
        lexicalValue1398_192_1 = spill1398_15;
        break lexical_join_192;
    }
    if (!((spill1398_14 != spill1398_15))) {
        break lexical_join_179;
    }
    life9_29 = 0;
    if (!((life4_10 != null))) {
        break lexical_join_223;
    }
    }
    spill1398_16 = ((java.lang.String)((((moom.bq)(life8_19)).a__ArrayString())[life12_203])).charAt(((int)(life13_207)));
    if (!((life4_10 == null))) {
        lexicalValue1398_199_0 = ((int)(spill1398_16));
        break lexical_join_199;
    }
    lexicalValue1398_192_0 = ((int)(spill1398_16));
    lexicalValue1398_192_1 = __sourceIntrinsic_aa367d59f2e7_invokedynamic1398_29(28719, (5714427453565634094L ^ life2_3));
    }
    if (!((lexicalValue1398_192_0 == lexicalValue1398_192_1))) {
        break lexical_join_197;
    }
    life9_29 = 0;
    if (!((life4_10 != null))) {
        break lexical_join_223;
    }
    }
    lexicalValue1398_199_0 = ((net.minecraft.item.ItemStack)(life14_211)).c();
    }
    life10_178 = lexicalValue1398_199_0;
    if (!((life4_10 != null))) {
        break lexical_join_220;
    }
    }
    spill1398_17 = ((java.lang.String)((((moom.bq)(life8_19)).a__ArrayString())[life12_203])).charAt(((int)(life13_207)));
    if (!((life4_10 == null))) {
        lexicalValue1398_217_0 = ((int)(spill1398_17));
        break lexical_join_217;
    }
    if (!((spill1398_17 != __sourceIntrinsic_aa367d59f2e7_invokedynamic1398_35(19202, (7189478168947997954L ^ life2_3))))) {
        break lexical_join_220;
    }
    lexicalValue1398_217_0 = 0;
    }
    life9_29 = lexicalValue1398_217_0;
    if (!((life4_10 != null))) {
        break lexical_join_223;
    }
    }
    life11_180 += 1;
    if (!((life4_10 != null))) { continue lexical_cycle_124; }
    break lexical_cycle_124;
    }
    }
    if (!((life4_10 != null))) {
        break lexical_join_227;
    }
    }
    lexicalValue1398_226_0 = 0;
    }
    life9_29 = lexicalValue1398_226_0;
    }
    lexicalValue1398_228_0 = life9_29;
    }
    if (!((lexicalValue1398_228_0 != 0))) {
        break lexical_join_231;
    }
    return life8_19;
    }
    life7_12 += 1;
    }
    if (!((life4_10 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4891;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = b[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/x6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.x6.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9663_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/x6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
int lexicalValue1399_36_0;
    int lexicalValue1399_47_0;
    int lexicalValue1399_56_0;
    int lexicalValue1399_64_0;
    java.lang.String spill1399_0;
    int spill1399_1;
    int spill1399_2;
    long life3_3;
    int life6_6;
    java.lang.String life5_7;
    int life7_9;
    net.minecraft.item.ItemStack life8_17;
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_51: {
    life3_3 = (moom.x6.a ^ 39482608132815L);
    spill1399_0 = moom.ye.b();
    life6_6 = 0;
    life5_7 = spill1399_0;
    life7_9 = 0;
    lexical_cycle_10: while (true) {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_46: {
    lexical_join_36: {
    lexical_join_34: {
    if (!((life7_9 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_51;
    }
    life8_17 = ((moom.wx)(p0)).a__xW(((int)(life7_9)));
    if (!((life5_7 == null))) {
        break lexical_join_57;
    }
    if (!((life5_7 == null))) {
        break lexical_join_49;
    }
    if (!((life8_17 != null))) {
        break lexical_join_48;
    }
    if (!((((net.minecraft.item.ItemStack)(life8_17)).a__wQ() == net.minecraft.init.Items.ci))) {
        break lexical_join_48;
    }
    spill1399_1 = life6_6;
    if (!((life5_7 == null))) {
        lexicalValue1399_36_0 = spill1399_1;
        break lexical_join_36;
    }
    if (!((spill1399_1 != 0))) {
        break lexical_join_34;
    }
    return ((0) != 0);
    }
    lexicalValue1399_36_0 = moom.Ca.b(((net.minecraft.item.ItemStack)(life8_17)));
    }
    if (!((life5_7 == null))) {
        lexicalValue1399_47_0 = lexicalValue1399_36_0;
        break lexical_join_47;
    }
    if (!((lexicalValue1399_36_0 >= __sourceIntrinsic_02959d7480d7_invokedynamic1399_8(30488, (6333646633916469950L ^ life3_3))))) {
        break lexical_join_46;
    }
    return ((0) != 0);
    }
    lexicalValue1399_47_0 = 1;
    }
    life6_6 = lexicalValue1399_47_0;
    }
    life7_9 += 1;
    }
    if (!((life5_7 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    spill1399_2 = life6_6;
    if (!((life5_7 == null))) {
        lexicalValue1399_56_0 = spill1399_2;
        break lexical_join_56;
    }
    if (!((spill1399_2 == 0))) {
        break lexical_join_57;
    }
    lexicalValue1399_56_0 = 0;
    }
    return ((lexicalValue1399_56_0) != 0);
    }
    if (!((this.a(((moom.wx)(p0))) != null))) {
        break lexical_join_63;
    }
    lexicalValue1399_64_0 = 1;
    break lexical_join_64;
    }
    lexicalValue1399_64_0 = 0;
    }
    return ((lexicalValue1399_64_0) != 0);
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
net.minecraft.item.ItemStack forestValue944_33_0;
    net.minecraft.item.ItemStack forestValue944_68_0;
    net.minecraft.item.ItemStack forestValue944_76_0;
    net.minecraft.nbt.NBTTagCompound forestValue944_100_0;
    java.lang.String forestValue944_100_1;
    int forestValue944_100_2;
    java.lang.String spill944_0;
    net.minecraft.item.ItemStack spill944_1;
    net.minecraft.item.ItemStack spill944_2;
    net.minecraft.item.ItemStack spill944_3;
    net.minecraft.nbt.NBTTagCompound spill944_4;
    java.lang.String spill944_5;
    int spill944_6;
    long life2_3;
    net.minecraft.item.ItemStack life5_6;
    java.lang.String life4_7;
    int life6_9;
    net.minecraft.item.ItemStack life7_17;
    moom.bq life6_45;
    int life7_49;
    int life8_51;
    net.minecraft.item.ItemStack life9_59;
    net.minecraft.nbt.NBTTagCompound life8_90;
    java.lang.Object life9_92;
    net.minecraft.nbt.NBTTagList life9_114;
    net.minecraft.nbt.NBTTagCompound life10_127;
    forest_join_127: {
    forest_join_111: {
    forest_join_103: {
    forest_join_100: {
    forest_join_76: {
    forest_join_75: {
    forest_join_37: {
    forest_join_33: {
    forest_join_31: {
    life2_3 = (moom.x6.a ^ 97193820119316L);
    spill944_0 = moom.ye.b();
    life5_6 = null;
    life4_7 = spill944_0;
    life6_9 = 0;
    forest_cycle_10: while (true) {
    forest_join_30: {
    forest_join_29: {
    if (!((life6_9 < ((moom.wx)(p0)).b__Int()))) {
        break forest_join_37;
    }
    life7_17 = ((moom.wx)(p0)).a__xW(((int)(life6_9)));
    if (!((life4_7 == null))) {
        break forest_join_30;
    }
    if (!((life7_17 != null))) {
        break forest_join_29;
    }
    spill944_1 = life7_17;
    if (!((life4_7 == null))) {
        forestValue944_33_0 = spill944_1;
        break forest_join_33;
    }
    if (!((((net.minecraft.item.ItemStack)(spill944_1)).a__wQ() == net.minecraft.init.Items.ci))) {
        break forest_join_29;
    }
    break forest_join_31;
    }
    life6_9 += 1;
    }
    continue forest_cycle_10;
    }
    }
    forestValue944_33_0 = ((net.minecraft.item.ItemStack)(life7_17)).a__xW();
    }
    life5_6 = forestValue944_33_0;
    ((net.minecraft.item.ItemStack)(life5_6)).b = ((int)(1));
    }
    life6_45 = this.a(((moom.wx)(p0)));
    if (!((life6_45 != null))) {
        break forest_join_127;
    }
    life7_49 = 0;
    life8_51 = 0;
    forest_cycle_47: while (true) {
    forest_join_73: {
    forest_join_72: {
    forest_join_68: {
    if (!((life8_51 < ((moom.wx)(p0)).b__Int()))) {
        break forest_join_75;
    }
    life9_59 = ((moom.wx)(p0)).a__xW(((int)(life8_51)));
    if (!((life4_7 == null))) {
        break forest_join_73;
    }
    spill944_2 = life9_59;
    if (!((life4_7 == null))) {
        forestValue944_76_0 = spill944_2;
        break forest_join_76;
    }
    if (!((spill944_2 != null))) {
        break forest_join_72;
    }
    spill944_3 = life9_59;
    if (!((life4_7 == null))) {
        forestValue944_68_0 = spill944_3;
        break forest_join_68;
    }
    if (!((((net.minecraft.item.ItemStack)(spill944_3)).a__wQ() == net.minecraft.init.Items.aW))) {
        break forest_join_72;
    }
    forestValue944_68_0 = life9_59;
    }
    life7_49 = ((net.minecraft.item.ItemStack)(forestValue944_68_0)).c();
    if (!((life4_7 != null))) {
        break forest_join_75;
    }
    }
    life8_51 += 1;
    }
    if (!((life4_7 != null))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    }
    forestValue944_76_0 = life5_6;
    }
    life8_90 = ((net.minecraft.item.ItemStack)(forestValue944_76_0)).a(((java.lang.String)("BlockEntityTag")), ((boolean)(true)));
    life9_92 = null;
    spill944_4 = life8_90;
    spill944_5 = "Patterns";
    spill944_6 = __sourceIntrinsic_5f85d79003c1_invokedynamic944_15(6234, (5988206846165892645L ^ life2_3));
    if (!((life4_7 == null))) {
        forestValue944_100_0 = spill944_4;
        forestValue944_100_1 = spill944_5;
        forestValue944_100_2 = spill944_6;
        break forest_join_100;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill944_4)).a__Boolean(((java.lang.String)(spill944_5)), ((int)(spill944_6))))) {
        break forest_join_103;
    }
    forestValue944_100_0 = life8_90;
    forestValue944_100_1 = "Patterns";
    forestValue944_100_2 = __sourceIntrinsic_5f85d79003c1_invokedynamic944_17(3738, (3801536826533554404L ^ life2_3));
    }
    life9_114 = ((net.minecraft.nbt.NBTTagCompound)(forestValue944_100_0)).a(((java.lang.String)(forestValue944_100_1)), ((int)(forestValue944_100_2)));
    break forest_join_111;
    }
    life9_114 = new net.minecraft.nbt.NBTTagList();
    ((net.minecraft.nbt.NBTTagCompound)(life8_90)).a(((java.lang.String)("Patterns")), ((net.minecraft.nbt.NBTBase)(life9_114)));
    }
    life10_127 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life10_127)).a(((java.lang.String)("Pattern")), ((java.lang.String)(((moom.bq)(life6_45)).b())));
    ((net.minecraft.nbt.NBTTagCompound)(life10_127)).a__Void(((java.lang.String)("Color")), ((int)(life7_49)));
    ((net.minecraft.nbt.NBTTagList)(life9_114)).a(((net.minecraft.nbt.NBTBase)(life10_127)));
    }
    return life5_6;
}


public int a() {
long local1 = (moom.x6.a ^ 89299718877043L);
    return __sourceIntrinsic_8aebf151eadb_originalDynamicSite1699_1(1057, (4800018273814867002L ^ local1));
}


public net.minecraft.item.ItemStack a__xW() {
return null;
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0) {
java.lang.String spill1400_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_8;
    int life6_10;
    java.lang.String life4_11;
    net.minecraft.item.ItemStack life7_19;
    lexical_join_40: {
    life2_3 = (moom.x6.a ^ 58105227478715L);
    spill1400_0 = moom.ye.b();
    life5_8 = new net.minecraft.item.ItemStack[((moom.wx)(p0)).b__Int()];
    life6_10 = 0;
    life4_11 = spill1400_0;
    lexical_cycle_12: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life6_10 < (life5_8).length))) {
        break lexical_join_40;
    }
    life7_19 = ((moom.wx)(p0)).a__xW(((int)(life6_10)));
    if (!((life4_11 == null))) {
        break lexical_join_38;
    }
    if (!((life7_19 != null))) {
        break lexical_join_37;
    }
    if (!(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).f())) {
        break lexical_join_37;
    }
    (life5_8)[life6_10] = new net.minecraft.item.ItemStack(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).b__wQ());
    }
    life6_10 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life5_8;
}


private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite1699_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9663_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa367d59f2e7_invokedynamic1398_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa367d59f2e7_invokedynamic1398_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02959d7480d7_invokedynamic1399_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f85d79003c1_invokedynamic944_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f85d79003c1_invokedynamic944_17(int a0, long a1) throws E;
}
