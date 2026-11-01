package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fz {

private net.minecraft.world.World a;

private moom.DT b;

private moom.DT c;

private moom.bs d;

private java.util.List<moom.DT> e;

private java.util.List<moom.DT> f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public fz(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, boolean p3) { super(); }


private static void __sourceConstructorBody_17c81362b285802e(moom.fz receiver, net.minecraft.world.World p0, moom.DT p1, moom.bs p2, boolean p3) throws Throwable {

forward_join_44: {

    forward_join_38: {

    forward_join_34: {

    long local5_life2 = (moom.fz.g ^ 33212076367997L);

    moom.fz.__sourceConstructorInit_17c81362b285802e_0(((moom.fz)(receiver)));

    ((moom.fz)(receiver)).e = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    net.minecraft.entity.Entity[] __sourceSpill652_9 = moom.fA.b();

    ((moom.fz)(receiver)).f = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.fz)(receiver)).a = ((net.minecraft.world.World)(p0));

    ((moom.fz)(receiver)).b = ((moom.DT)(p1));

    net.minecraft.entity.Entity[] local7_life12 = __sourceSpill652_9;

    if (!((local7_life12 == null))) { break forward_join_38; }

    if (!(p3)) { break forward_join_34; }

    ((moom.fz)(receiver)).d = ((moom.bs)(p2));

    ((moom.fz)(receiver)).c = ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(p2)))));

    if (!((local7_life12 != null))) { break forward_join_44; }

    }

    ((moom.fz)(receiver)).d = ((moom.bs)(((moom.bs)(p2)).a__bs()));

    }

    ((moom.fz)(receiver)).c = ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(p2)), ((int)(2)))));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_17c81362b285802e_0(moom.fz a0) throws E;

static {
g = ((long)(((moom._a)(moom._c.a(((long)(1581789615823470928L)), ((long)(-7479012534276676635L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(118942609615272L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.fz.g ^ 130058085166507L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill843_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill843_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill843_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill843_14 = new byte[8];
    (__sourceSpill843_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill843_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation843_16 = __sourceSpill843_14;
    ((javax.crypto.Cipher)(__sourceSpill843_11)).init(((int)(__sourceSpill843_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill843_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation843_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "yß ù14rêì!Ú"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill843_25 = local6_life21;
        int __sourceSpill843_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill843_25)).substring(((int)(__sourceSpill843_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill843_30 = local8_life19;
        int __sourceSpill843_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill843_33 = new byte[8];
        (__sourceSpill843_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill843_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill843_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill843_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill843_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill843_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill843_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill843_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill843_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill843_34)).doFinal(((byte[])(__sourceSpill843_33)));
        (__sourceSpill843_30)[__sourceSpill843_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private boolean b(moom.DT p0) {
int lexicalValue1172_37_0;
    net.minecraft.entity.Entity[] spill1172_0;
    boolean spill1172_1;
    long life2_3;
    moom.bs[] life5_6;
    int life6_9;
    int life7_11;
    net.minecraft.entity.Entity[] life4_12;
    moom.bs life8_19;
    lexical_join_41: {
    life2_3 = (moom.fz.g ^ 13245362042648L);
    spill1172_0 = moom.fA.b();
    life5_6 = moom.bs.values();
    life6_9 = (life5_6).length;
    life7_11 = 0;
    life4_12 = spill1172_0;
    lexical_cycle_13: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life7_11 < life6_9))) {
        break lexical_join_41;
    }
    life8_19 = (life5_6)[life7_11];
    if (!((life4_12 == null))) {
        break lexical_join_39;
    }
    if (!((((moom.bs)(life8_19)).a__bt() != ((moom.bs)(this.d)).a__bt()))) {
        break lexical_join_38;
    }
    spill1172_1 = ((moom.fz)(this)).a(((moom.DT)(((moom.DT)(p0)).a(((moom.bs)(life8_19))))));
    if (!((life4_12 == null))) {
        lexicalValue1172_37_0 = ((spill1172_1) ? 1 : 0);
        break lexical_join_37;
    }
    if (!((!spill1172_1))) {
        break lexical_join_38;
    }
    lexicalValue1172_37_0 = 0;
    }
    return ((lexicalValue1172_37_0) != 0);
    }
    life7_11 += 1;
    }
    if (!((life4_12 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return ((1) != 0);
}


public java.util.List<moom.DT> b() {
return this.f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25146;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/fz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.fz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7650_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/fz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(int p0, int p1) {
java.lang.Object local3 = com.google.common.collect.Lists.newArrayList();
    java.lang.Object local4 = com.google.common.collect.Lists.newArrayList();
    java.lang.Object local5 = com.google.common.collect.Lists.newArrayList();
    ((java.util.List)(local3)).addAll(((java.util.Collection)(((java.util.List)(this.e)).subList(((int)(0)), ((int)(p1))))));
    ((java.util.List)(local4)).addAll(((java.util.Collection)(((java.util.List)(this.e)).subList(((int)((((java.util.List)(this.e)).size() - p0))), ((int)(((java.util.List)(this.e)).size()))))));
    ((java.util.List)(local5)).addAll(((java.util.Collection)(((java.util.List)(this.e)).subList(((int)(p1)), ((int)((((java.util.List)(this.e)).size() - p0)))))));
    ((java.util.List)(this.e)).clear();
    ((java.util.List)(this.e)).addAll(((java.util.Collection)(local3)));
    ((java.util.List)(this.e)).addAll(((java.util.Collection)(local4)));
    ((java.util.List)(this.e)).addAll(((java.util.Collection)(local5)));
    return;
}


public java.util.List<moom.DT> a() {
return this.e;
}


private boolean a(moom.DT p0) {
net.minecraft.block.Block lexicalValue1170_21_0;
    int lexicalValue1170_37_0;
    int lexicalValue1170_46_0;
    int lexicalValue1170_52_0;
    int lexicalValue1170_67_0;
    net.minecraft.block.Block lexicalValue1170_91_0;
    int lexicalValue1170_116_0;
    int lexicalValue1170_125_0;
    int lexicalValue1170_129_0;
    int lexicalValue1170_203_0;
    net.minecraft.block.Block lexicalValue1170_224_0;
    int lexicalValue1170_231_0;
    int lexicalValue1170_242_0;
    int lexicalValue1170_245_0;
    int lexicalValue1170_266_0;
    int lexicalValue1170_266_1;
    int lexicalValue1170_273_0;
    net.minecraft.entity.Entity[] spill1170_0;
    net.minecraft.block.Block spill1170_1;
    boolean spill1170_2;
    int spill1170_3;
    net.minecraft.block.Block spill1170_4;
    boolean spill1170_5;
    boolean spill1170_6;
    int spill1170_7;
    boolean spill1170_8;
    net.minecraft.block.Block spill1170_9;
    boolean spill1170_10;
    int spill1170_11;
    int spill1170_12;
    long life2_3;
    net.minecraft.block.Block life5_10;
    net.minecraft.entity.Entity[] life4_11;
    int life6_72;
    moom.DT life7_103;
    int life7_182;
    int life8_186;
    moom.DT life9_215;
    int life10_220;
    int life11_234;
    moom.DT life12_245;
    lexical_join_154: {
    lexical_join_152: {
    lexical_join_129: {
    lexical_join_128: {
    lexical_join_68: {
    lexical_join_67: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_46: {
    lexical_join_42: {
    lexical_join_37: {
    lexical_join_33: {
    lexical_join_21: {
    lexical_join_20: {
    life2_3 = (moom.fz.g ^ 94381080685965L);
    spill1170_0 = moom.fA.b();
    life5_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(p0))))).a__ch();
    life4_11 = spill1170_0;
    spill1170_1 = life5_10;
    if (!((life4_11 == null))) {
        lexicalValue1170_21_0 = spill1170_1;
        break lexical_join_21;
    }
    if (!((((net.minecraft.block.Block)(spill1170_1)).a__fn() == moom.fn.a))) {
        break lexical_join_20;
    }
    return ((1) != 0);
    }
    lexicalValue1170_21_0 = life5_10;
    }
    spill1170_2 = net.minecraft.block.BlockPistonBase.a(((net.minecraft.block.Block)(lexicalValue1170_21_0)), ((net.minecraft.world.World)(this.a)), ((moom.DT)(p0)), ((moom.bs)(this.d)), ((boolean)(false)));
    if (!((life4_11 == null))) {
        lexicalValue1170_37_0 = ((spill1170_2) ? 1 : 0);
        break lexical_join_37;
    }
    if (!((!spill1170_2))) {
        break lexical_join_33;
    }
    return ((1) != 0);
    }
    lexicalValue1170_37_0 = ((((moom.DT)(p0)).equals(((java.lang.Object)(this.b)))) ? 1 : 0);
    }
    if (!((life4_11 == null))) {
        lexicalValue1170_46_0 = lexicalValue1170_37_0;
        break lexical_join_46;
    }
    if (!((lexicalValue1170_37_0 != 0))) {
        break lexical_join_42;
    }
    return ((1) != 0);
    }
    lexicalValue1170_46_0 = ((((java.util.List)(this.e)).contains(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((life4_11 == null))) {
        lexicalValue1170_52_0 = lexicalValue1170_46_0;
        break lexical_join_52;
    }
    if (!((lexicalValue1170_46_0 != 0))) {
        break lexical_join_51;
    }
    return ((1) != 0);
    }
    lexicalValue1170_52_0 = 1;
    }
    life6_72 = lexicalValue1170_52_0;
    spill1170_3 = (life6_72 + ((java.util.List)(this.e)).size());
    if (!((life4_11 == null))) {
        lexicalValue1170_67_0 = spill1170_3;
        break lexical_join_67;
    }
    if (!((spill1170_3 > __sourceIntrinsic_b3264b808749_invokedynamic1170_23(12298, (4805668915820253282L ^ life2_3))))) {
        break lexical_join_68;
    }
    lexicalValue1170_67_0 = 0;
    }
    return ((lexicalValue1170_67_0) != 0);
    }
    lexical_cycle_68: while (true) {
    lexical_join_126: {
    lexical_join_125: {
    lexical_join_116: {
    lexical_join_110: {
    lexical_join_91: {
    if (!((life5_10 == net.minecraft.init.Blocks.ci))) {
        break lexical_join_128;
    }
    life7_103 = ((moom.DT)(p0)).a(((moom.bs)(((moom.bs)(this.d)).a__bs())), ((int)(life6_72)));
    life5_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(life7_103))))).a__ch();
    spill1170_4 = life5_10;
    if (!((life4_11 == null))) {
        lexicalValue1170_91_0 = spill1170_4;
        break lexical_join_91;
    }
    if (!((((net.minecraft.block.Block)(spill1170_4)).a__fn() != moom.fn.a))) {
        break lexical_join_128;
    }
    lexicalValue1170_91_0 = life5_10;
    }
    spill1170_5 = net.minecraft.block.BlockPistonBase.a(((net.minecraft.block.Block)(lexicalValue1170_91_0)), ((net.minecraft.world.World)(this.a)), ((moom.DT)(life7_103)), ((moom.bs)(this.d)), ((boolean)(false)));
    if (!((life4_11 == null))) {
        lexicalValue1170_129_0 = ((spill1170_5) ? 1 : 0);
        break lexical_join_129;
    }
    if (!(spill1170_5)) {
        break lexical_join_128;
    }
    spill1170_6 = ((moom.DT)(life7_103)).equals(((java.lang.Object)(this.b)));
    if (!((life4_11 == null))) {
        lexicalValue1170_116_0 = ((spill1170_6) ? 1 : 0);
        break lexical_join_116;
    }
    if (!(spill1170_6)) {
        break lexical_join_110;
    }
    if (!((life4_11 != null))) {
        break lexical_join_128;
    }
    }
    life6_72 += 1;
    lexicalValue1170_116_0 = (life6_72 + ((java.util.List)(this.e)).size());
    }
    if (!((life4_11 == null))) {
        lexicalValue1170_125_0 = lexicalValue1170_116_0;
        break lexical_join_125;
    }
    if (!((lexicalValue1170_116_0 > __sourceIntrinsic_b3264b808749_invokedynamic1170_43(4169, (7665280312710098976L ^ life2_3))))) {
        break lexical_join_126;
    }
    lexicalValue1170_125_0 = 0;
    }
    return ((lexicalValue1170_125_0) != 0);
    }
    if (!((life4_11 != null))) { continue lexical_cycle_68; }
    break lexical_cycle_68;
    }
    }
    lexicalValue1170_129_0 = 0;
    }
    life7_182 = lexicalValue1170_129_0;
    life8_186 = (life6_72 - 1);
    lexical_cycle_134: while (true) {
    if (!((life8_186 >= 0))) {
        break lexical_join_152;
    }
    ((java.util.List)(this.e)).add(((java.lang.Object)(((moom.DT)(p0)).a(((moom.bs)(((moom.bs)(this.d)).a__bs())), ((int)(life8_186))))));
    life7_182 += 1;
    life8_186 += -1;
    if (!((life4_11 == null))) {
        break lexical_join_154;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_134; }
    break lexical_cycle_134;
    }
    }
    life8_186 = 1;
    }
    lexical_cycle_154: while (true) {
    lexical_join_273: {
    lexical_join_269: {
    lexical_join_266: {
    lexical_join_256: {
    lexical_join_245: {
    lexical_join_243: {
    lexical_join_242: {
    lexical_join_241: {
    lexical_join_231: {
    lexical_join_224: {
    lexical_join_223: {
    lexical_join_209: {
    lexical_join_207: {
    life9_215 = ((moom.DT)(p0)).a(((moom.bs)(this.d)), ((int)(life8_186)));
    life10_220 = ((java.util.List)(this.e)).indexOf(((java.lang.Object)(life9_215)));
    if (!((life10_220 > -1))) {
        break lexical_join_209;
    }
    ((moom.fz)(this)).a(((int)(life7_182)), ((int)(life10_220)));
    spill1170_7 = 0;
    if (!((life4_11 == null))) {
        lexicalValue1170_231_0 = spill1170_7;
        break lexical_join_231;
    }
    life11_234 = spill1170_7;
    lexical_cycle_176: while (true) {
    lexical_join_205: {
    lexical_join_204: {
    lexical_join_203: {
    if (!((life11_234 <= (life10_220 + life7_182)))) {
        break lexical_join_207;
    }
    life12_245 = ((moom.DT)(((java.util.List)(this.e)).get(((int)(life11_234)))));
    if (!((life4_11 == null))) {
        break lexical_join_205;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(life12_245))))).a__ch() == net.minecraft.init.Blocks.ci))) {
        break lexical_join_204;
    }
    spill1170_8 = ((moom.fz)(this)).b(((moom.DT)(life12_245)));
    if (!((life4_11 == null))) {
        lexicalValue1170_203_0 = ((spill1170_8) ? 1 : 0);
        break lexical_join_203;
    }
    if (!((!spill1170_8))) {
        break lexical_join_204;
    }
    lexicalValue1170_203_0 = 0;
    }
    return ((lexicalValue1170_203_0) != 0);
    }
    life11_234 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_176; }
    break lexical_cycle_176;
    }
    }
    return ((1) != 0);
    }
    life5_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(life9_215))))).a__ch();
    spill1170_9 = life5_10;
    if (!((life4_11 == null))) {
        lexicalValue1170_224_0 = spill1170_9;
        break lexical_join_224;
    }
    if (!((((net.minecraft.block.Block)(spill1170_9)).a__fn() == moom.fn.a))) {
        break lexical_join_223;
    }
    return ((1) != 0);
    }
    lexicalValue1170_224_0 = life5_10;
    }
    lexicalValue1170_231_0 = ((net.minecraft.block.BlockPistonBase.a(((net.minecraft.block.Block)(lexicalValue1170_224_0)), ((net.minecraft.world.World)(this.a)), ((moom.DT)(life9_215)), ((moom.bs)(this.d)), ((boolean)(true)))) ? 1 : 0);
    }
    if (!((life4_11 == null))) {
        lexicalValue1170_242_0 = lexicalValue1170_231_0;
        break lexical_join_242;
    }
    if (!((lexicalValue1170_231_0 != 0))) {
        break lexical_join_241;
    }
    spill1170_10 = ((moom.DT)(life9_215)).equals(((java.lang.Object)(this.b)));
    if (!((life4_11 == null))) {
        lexicalValue1170_245_0 = ((spill1170_10) ? 1 : 0);
        break lexical_join_245;
    }
    if (!(spill1170_10)) {
        break lexical_join_243;
    }
    }
    lexicalValue1170_242_0 = 0;
    }
    return ((lexicalValue1170_242_0) != 0);
    }
    lexicalValue1170_245_0 = ((net.minecraft.block.Block)(life5_10)).e__Int();
    }
    spill1170_11 = 1;
    if (!((life4_11 == null))) {
        lexicalValue1170_266_0 = lexicalValue1170_245_0;
        lexicalValue1170_266_1 = spill1170_11;
        break lexical_join_266;
    }
    if (!((lexicalValue1170_245_0 == spill1170_11))) {
        break lexical_join_256;
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(life9_215)));
    return ((1) != 0);
    }
    spill1170_12 = ((java.util.List)(this.e)).size();
    if (!((life4_11 == null))) {
        lexicalValue1170_273_0 = spill1170_12;
        break lexical_join_273;
    }
    lexicalValue1170_266_0 = spill1170_12;
    lexicalValue1170_266_1 = __sourceIntrinsic_b3264b808749_invokedynamic1170_86(4169, (7665280312710098976L ^ life2_3));
    }
    if (!((lexicalValue1170_266_0 >= lexicalValue1170_266_1))) {
        break lexical_join_269;
    }
    return ((0) != 0);
    }
    lexicalValue1170_273_0 = ((((java.util.List)(this.e)).add(((java.lang.Object)(life9_215)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1170_273_0);
    life7_182 += 1;
    life8_186 += 1;
    continue lexical_cycle_154;
    }
}


public boolean a__Boolean() {
int lexicalValue1171_46_0;
    int lexicalValue1171_53_0;
    moom.fz lexicalValue1171_57_0;
    moom.fz lexicalValue1171_77_0;
    int lexicalValue1171_83_0;
    int lexicalValue1171_92_0;
    net.minecraft.entity.Entity[] spill1171_0;
    boolean spill1171_1;
    int spill1171_2;
    moom.fz spill1171_3;
    moom.fz spill1171_4;
    boolean spill1171_5;
    int spill1171_6;
    long life1_3;
    net.minecraft.entity.Entity[] life3_8;
    net.minecraft.block.Block life4_18;
    java.util.Iterator life5_75;
    moom.DT life6_82;
    lexical_join_92: {
    lexical_join_86: {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_53: {
    lexical_join_47: {
    lexical_join_46: {
    lexical_join_39: {
    life1_3 = (moom.fz.g ^ 5999601066163L);
    spill1171_0 = moom.fA.b();
    ((java.util.List)(this.e)).clear();
    life3_8 = spill1171_0;
    ((java.util.List)(this.f)).clear();
    life4_18 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(this.c))))).a__ch();
    spill1171_1 = net.minecraft.block.BlockPistonBase.a(((net.minecraft.block.Block)(life4_18)), ((net.minecraft.world.World)(this.a)), ((moom.DT)(this.c)), ((moom.bs)(this.d)), ((boolean)(false)));
    if (!((life3_8 == null))) {
        lexicalValue1171_53_0 = ((spill1171_1) ? 1 : 0);
        break lexical_join_53;
    }
    if (!((!spill1171_1))) {
        break lexical_join_47;
    }
    spill1171_2 = ((net.minecraft.block.Block)(life4_18)).e__Int();
    if (!((life3_8 == null))) {
        lexicalValue1171_46_0 = spill1171_2;
        break lexical_join_46;
    }
    if (!((spill1171_2 != 1))) {
        break lexical_join_39;
    }
    return ((0) != 0);
    }
    ((java.util.List)(this.f)).add(((java.lang.Object)(this.c)));
    lexicalValue1171_46_0 = 1;
    }
    return ((lexicalValue1171_46_0) != 0);
    }
    spill1171_3 = this;
    if (!((life3_8 == null))) {
        lexicalValue1171_57_0 = spill1171_3;
        break lexical_join_57;
    }
    lexicalValue1171_53_0 = ((((moom.fz)(spill1171_3)).a(((moom.DT)(this.c)))) ? 1 : 0);
    }
    if (!((lexicalValue1171_53_0 == 0))) {
        break lexical_join_56;
    }
    return ((0) != 0);
    }
    lexicalValue1171_57_0 = this;
    }
    life5_75 = ((java.util.List)(((moom.fz)(lexicalValue1171_57_0)).e)).iterator();
    lexical_cycle_60: while (true) {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_77: {
    if (!(((java.util.Iterator)(life5_75)).hasNext())) {
        break lexical_join_86;
    }
    life6_82 = ((moom.DT)(((java.util.Iterator)(life5_75)).next()));
    spill1171_4 = this;
    if (!((life3_8 == null))) {
        lexicalValue1171_77_0 = spill1171_4;
        break lexical_join_77;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.fz)(spill1171_4)).a)).a__fE(((moom.DT)(life6_82))))).a__ch() == net.minecraft.init.Blocks.ci))) {
        break lexical_join_84;
    }
    lexicalValue1171_77_0 = this;
    }
    spill1171_5 = ((moom.fz)(lexicalValue1171_77_0)).b(((moom.DT)(life6_82)));
    if (!((life3_8 == null))) {
        lexicalValue1171_83_0 = ((spill1171_5) ? 1 : 0);
        break lexical_join_83;
    }
    if (!((!spill1171_5))) {
        break lexical_join_84;
    }
    lexicalValue1171_83_0 = 0;
    }
    return ((lexicalValue1171_83_0) != 0);
    }
    if (!((life3_8 != null))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    spill1171_6 = 1;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue1171_92_0 = spill1171_6;
        break lexical_join_92;
    }
    moom.fA.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));
    lexicalValue1171_92_0 = spill1171_6;
    }
    return ((lexicalValue1171_92_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7650_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b3264b808749_invokedynamic1170_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b3264b808749_invokedynamic1170_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b3264b808749_invokedynamic1170_86(int a0, long a1) throws E;
}
