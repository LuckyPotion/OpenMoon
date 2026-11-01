package net.minecraft.world.gen.structure;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ComponentScatteredFeaturePieces$JunglePyramid extends net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature {

private boolean i;

private boolean j;

private boolean k;

private boolean l;

private static java.util.List<moom.D5> m;

private static java.util.List<moom.D5> n;

private static moom.H_ o;

private static long q;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map w;

public ComponentScatteredFeaturePieces$JunglePyramid() {
super();
}


public ComponentScatteredFeaturePieces$JunglePyramid(java.util.Random p0, int p1, int p2) { super((java.util.Random)null, 0, 0, 0, 0, 0, 0); }

private static void __sourceConstructorBody_9ceb9249117e105c(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid receiver, java.util.Random p0, int p1, int p2) throws Throwable {
long local4 = (net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.q ^ 66396116858697L);
    net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.__sourceConstructorInit_9ceb9249117e105c_0(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(receiver)), ((java.util.Random)(p0)), ((int)(p1)), ((int)(__sourceIntrinsic_9ceb9249117e105c_originalDynamicSite4030_1(11873, (7380069771400364034L ^ local4)))), ((int)(p2)), ((int)(__sourceIntrinsic_9ceb9249117e105c_originalDynamicSite4030_2(5229, (6786794965333342725L ^ local4)))), ((int)(__sourceIntrinsic_9ceb9249117e105c_originalDynamicSite4030_3(11749, (93296201300427650L ^ local4)))), ((int)(__sourceIntrinsic_9ceb9249117e105c_originalDynamicSite4030_4(22481, (8232729816780093875L ^ local4)))));
    return;
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(-6948870955865082138L)), ((long)(3811451583009552065L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260662497718127L)))));
    long local11_life6 = (net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.q ^ 2507360937364L);
    w = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1953_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1953_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1953_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1953_14 = new byte[8];
    (__sourceSpill1953_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1953_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1953_16 = __sourceSpill1953_14;
    ((javax.crypto.Cipher)(__sourceSpill1953_11)).init(((int)(__sourceSpill1953_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1953_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1953_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[28];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "¨RýFà<´Ìiÿ*Õ-¿©\"|X\b%lY\031§(b\025Ï&,ÿ³jhk|Èª\0204$¥\020\017XÀçöøR\024dwØ`\tÎ³LØ ´{´¬¿yâ\006?/>\002\b£M\037?Ù-H\001\bp8Vtæ¿¶K\022b\031GØ¤ñEµÁ ¼K\013©K1\005\0315\023ä\025sØ\024\007Lª\021K\024Ý\031H,¬^n\022 vÅP¼æàtö9º\022X»\034¿^¤Ã¸Ió¾Ø\rþC\005C\021,Bd\017v.Ï\023ó¹\nÈ#c\017"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1953_25 = local4_life21;
        int __sourceSpill1953_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1953_25)).substring(((int)(__sourceSpill1953_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1953_30 = local6_life19;
        int __sourceSpill1953_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1953_33 = new byte[8];
        (__sourceSpill1953_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1953_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1953_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1953_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1953_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1953_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1953_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1953_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1953_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1953_34)).doFinal(((byte[])(__sourceSpill1953_33)));
        (__sourceSpill1953_30)[__sourceSpill1953_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Ô´ ý¨­ú¶=õ¢üK\\W"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1953_38 = local4_life21;
        int __sourceSpill1953_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1953_38)).substring(((int)(__sourceSpill1953_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1953_43 = local6_life19;
        int __sourceSpill1953_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1953_46 = new byte[8];
        (__sourceSpill1953_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1953_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1953_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1953_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1953_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1953_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1953_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1953_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1953_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1953_47)).doFinal(((byte[])(__sourceSpill1953_46)));
        (__sourceSpill1953_43)[__sourceSpill1953_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    t = ((long[])(local6_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[28]));
    moom.D5[] __sourceSpill1953_54 = new moom.D5[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_52(9929, (2487716022091373165L ^ local11_life6))];
    (__sourceSpill1953_54)[0] = new moom.D5(net.minecraft.init.Items.i, 0, 1, 3, 3);
    (__sourceSpill1953_54)[1] = new moom.D5(net.minecraft.init.Items.j, 0, 1, 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_56(9929, (2487716022091373165L ^ local11_life6)));
    (__sourceSpill1953_54)[2] = new moom.D5(net.minecraft.init.Items.k, 0, 2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_58(32416, (7281854482406900252L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_59(8985, (5501245688376876975L ^ local11_life6)));
    (__sourceSpill1953_54)[3] = new moom.D5(net.minecraft.init.Items.bD, 0, 1, 3, 2);
    (__sourceSpill1953_54)[4] = new moom.D5(net.minecraft.init.Items.aX, 0, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_62(8343, (6909128042032127026L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_63(20112, (3730775115491553833L ^ local11_life6)));
    (__sourceSpill1953_54)[5] = new moom.D5(net.minecraft.init.Items.bi, 0, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_65(32416, (7281854482406900252L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_66(29512, (1646088062543007718L ^ local11_life6)));
    (__sourceSpill1953_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_67(8343, (6909128042032127026L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aA, 0, 1, 1, 3);
    (__sourceSpill1953_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_69(32416, (7281854482406900252L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.bZ, 0, 1, 1, 1);
    (__sourceSpill1953_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_71(23615, (8693997763947536528L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b0, 0, 1, 1, 1);
    (__sourceSpill1953_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_73(2086, (5581439911843230868L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b1, 0, 1, 1, 1);
    m = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill1953_54)))));
    moom.D5[] __sourceSpill1953_80 = new moom.D5[1];
    (__sourceSpill1953_80)[0] = new moom.D5(net.minecraft.init.Items.g, 0, 2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_78(32416, (7281854482406900252L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_79(21684, (8647612590789863436L ^ local11_life6)));
    n = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill1953_80)))));
    o = ((moom.H_)(new moom.H_()));
}

private static native <E extends Throwable> void __sourceConstructorInit_9ceb9249117e105c_0(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid a0, java.util.Random a1, int a2, int a3, int a4, int a5, int a6, int a7) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.i = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("placedMainChest")))));
    this.j = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("placedHiddenChest")))));
    this.k = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("placedTrap1")))));
    this.l = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("placedTrap2")))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17991;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])w.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               w.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/G7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12709_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/G7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("placedMainChest")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.i) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("placedHiddenChest")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.j) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("placedTrap1")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.k) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("placedTrap2")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.l) ? 1 : 0)))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue75_20_0;
    int lexicalValue75_1393_0;
    int lexicalValue75_2153_0;
    int lexicalValue75_2220_0;
    int lexicalValue75_2843_0;
    int lexicalValue75_2884_0;
    boolean spill75_0;
    int spill75_1;
    boolean spill75_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_25;
    int life8_30;
    int life9_35;
    int life10_40;
    int life11_595;
    int life11_705;
    int life12_716;
    int life11_1404;
    int life11_1545;
    lexical_join_2884: {
    lexical_join_2883: {
    lexical_join_2843: {
    lexical_join_2256: {
    lexical_join_2220: {
    lexical_join_2178: {
    lexical_join_2153: {
    lexical_join_1930: {
    lexical_join_1907: {
    lexical_join_1592: {
    lexical_join_1567: {
    lexical_join_1565: {
    lexical_join_1530: {
    lexical_join_1468: {
    lexical_join_1393: {
    lexical_join_787: {
    lexical_join_696: {
    lexical_join_671: {
    lexical_join_20: {
    lexical_join_16: {
    life4_3 = (net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.q ^ 108198874446917L);
    life6_5 = moom.G4.b();
    spill75_0 = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)));
    if (!((life6_5 != null))) {
        lexicalValue75_20_0 = ((spill75_0) ? 1 : 0);
        break lexical_join_20;
    }
    if (!((!spill75_0))) {
        break lexical_join_16;
    }
    return ((0) != 0);
    }
    lexicalValue75_20_0 = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(3)));
    }
    life7_25 = lexicalValue75_20_0;
    life8_30 = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(2)));
    life9_35 = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(0)));
    life10_40 = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)), ((int)(1)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_13(30711, (1585555958628733590L ^ life4_3)))), ((int)(0)), ((int)((this.e - 1))), ((int)(0)), ((int)((this.g - 1))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_18(2784, (5192956264763043739L ^ life4_3)))), ((int)(2)), ((int)(2)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_21(14251, (3473204899219509959L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_22(2086, (5581404872579231045L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_23(14251, (3473204899219509959L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(3)), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_26(11353, (1897137190386043168L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_29(2086, (5581404872579231045L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_30(2086, (5581404872579231045L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_31(28971, (1984725379878442076L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_34(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_35(27768, (1227393221899798786L ^ life4_3)))), ((int)(1)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_38(4106, (2563456533959587191L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_39(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_40(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_41(20172, (7727480360078240686L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_44(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_45(14251, (3473204899219509959L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_48(9929, (2487751321507038140L ^ life4_3)))), ((int)(3)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_49(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_50(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_51(14251, (3473204899219509959L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(3)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_54(2086, (5581404872579231045L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_55(14251, (3473204899219509959L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_58(8343, (6909163354030441955L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_59(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_60(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_61(14251, (3473204899219509959L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_64(1267, (1419590947338002841L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_65(3708, (3512223326283705088L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_66(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_67(28971, (1984725379878442076L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_70(23615, (8693962447385557313L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_71(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_72(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_73(9929, (2487751321507038140L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_76(23615, (8693962447385557313L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_77(28971, (1984725379878442076L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_79(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_80(32416, (7281819486054865869L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_81(2086, (5581404872579231045L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_83(2086, (5581404872579231045L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_84(14251, (3473204899219509959L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_86(8343, (6909163354030441955L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_87(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_88(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_89(2086, (5581404872579231045L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_91(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_92(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_93(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_94(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_95(23615, (8693962447385557313L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_97(8343, (6909163354030441955L ^ life4_3)))), ((int)(2)), ((int)(2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_99(14251, (3473204899219509959L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_100(8343, (6909163354030441955L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_101(14251, (3473204899219509959L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_103(8343, (6909163354030441955L ^ life4_3)))), ((int)(5)), ((int)(1)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_105(20172, (7727480360078240686L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_106(8343, (6909163354030441955L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_107(20172, (7727480360078240686L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(1)), ((int)(5)), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_114(9929, (2487751321507038140L ^ life4_3)))), ((int)(5)), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_118(2086, (5581404872579231045L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_122(9929, (2487751321507038140L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_123(2086, (5581404872579231045L ^ life4_3)))), ((moom.G2)(p2)));
    life11_595 = 0;
    lexical_cycle_591: while (true) {
    if (!((life11_595 <= __sourceIntrinsic_5ac1d031d896_invokedynamic75_125(1598, (2733037164100854622L ^ life4_3))))) {
        break lexical_join_671;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(4)), ((int)(life11_595)), ((int)(2)), ((int)(5)), ((int)(life11_595)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(4)), ((int)(life11_595)), ((int)(4)), ((int)(5)), ((int)(life11_595)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_130(32416, (7281819486054865869L ^ life4_3)))), ((int)(4)), ((int)(life11_595)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_131(32416, (7281819486054865869L ^ life4_3)))), ((int)(5)), ((int)(life11_595)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_134(2086, (5581404872579231045L ^ life4_3)))), ((int)(4)), ((int)(life11_595)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_135(2086, (5581404872579231045L ^ life4_3)))), ((int)(5)), ((int)(life11_595)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    life11_595 += 14;
    if (!((life6_5 != null))) {
        break lexical_join_696;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_591; }
    break lexical_cycle_591;
    }
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_138(8343, (6909163354030441955L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_139(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_140(8343, (6909163354030441955L ^ life4_3)))), ((int)(0)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    }
    life11_705 = 0;
    lexical_cycle_698: while (true) {
    lexical_join_785: {
    lexical_join_734: {
    if (!((life11_705 <= __sourceIntrinsic_5ac1d031d896_invokedynamic75_143(28971, (1984725379878442076L ^ life4_3))))) {
        break lexical_join_787;
    }
    spill75_1 = 2;
    if (!((life6_5 != null))) {
        lexicalValue75_1393_0 = spill75_1;
        break lexical_join_1393;
    }
    life12_716 = spill75_1;
    lexical_cycle_709: while (true) {
    if (!((life12_716 <= __sourceIntrinsic_5ac1d031d896_invokedynamic75_144(14251, (3473204899219509959L ^ life4_3))))) {
        break lexical_join_734;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_705)), ((int)(4)), ((int)(life12_716)), ((int)(life11_705)), ((int)(5)), ((int)(life12_716)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    life12_716 += 2;
    if (!((life6_5 != null))) {
        break lexical_join_785;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_709; }
    break lexical_cycle_709;
    }
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_705)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_147(8343, (6909163354030441955L ^ life4_3)))), ((int)(5)), ((int)(life11_705)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_148(8343, (6909163354030441955L ^ life4_3)))), ((int)(5)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_705)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_151(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_152(2086, (5581404872579231045L ^ life4_3)))), ((int)(life11_705)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_153(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_154(2086, (5581404872579231045L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    life11_705 += 11;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_698; }
    break lexical_cycle_698;
    }
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_157(32416, (7281819486054865869L ^ life4_3)))), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_158(2086, (5581404872579231045L ^ life4_3)))), ((int)(2)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_161(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_162(32416, (7281819486054865869L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_163(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_164(2086, (5581404872579231045L ^ life4_3)))), ((int)(2)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_167(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_168(14251, (3473204899219509959L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_169(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_170(14251, (3473204899219509959L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_173(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_174(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_175(14251, (3473204899219509959L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_176(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_177(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_178(14251, (3473204899219509959L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_181(2086, (5581404872579231045L ^ life4_3)))), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_182(2086, (5581404872579231045L ^ life4_3)))), ((int)(4)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_185(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_186(2086, (5581404872579231045L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_187(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_188(2086, (5581404872579231045L ^ life4_3)))), ((int)(4)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_191(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_192(9929, (2487751321507038140L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_193(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_194(9929, (2487751321507038140L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_197(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_198(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_199(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_200(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_201(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_202(9929, (2487751321507038140L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_205(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_206(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_207(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_208(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_209(32416, (7281819486054865869L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_214(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_215(8343, (6909163354030441955L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_219(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_220(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_221(8343, (6909163354030441955L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life8_30))))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_225(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_226(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life8_30))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_230(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_231(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_232(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(4)), ((int)(0)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(5)), ((int)(0)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_242(8343, (6909163354030441955L ^ life4_3)))), ((int)(0)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_246(32416, (7281819486054865869L ^ life4_3)))), ((int)(0)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_250(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_254(2086, (5581404872579231045L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_258(9929, (2487751321507038140L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_262(32416, (7281819486054865869L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_263(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_267(32416, (7281819486054865869L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_268(2086, (5581404872579231045L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life7_25))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_272(32416, (7281819486054865869L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_273(9929, (2487751321507038140L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_275(2086, (5581404872579231045L ^ life4_3)))), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_276(2086, (5581404872579231045L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_279(32416, (7281819486054865869L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_280(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_281(32416, (7281819486054865869L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_282(2086, (5581404872579231045L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_285(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_286(32416, (7281819486054865869L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_287(9929, (2487751321507038140L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_290(8343, (6909163354030441955L ^ life4_3)))), ((int)(4)), ((int)(5)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life9_35))))), ((int)(4)), ((int)(4)), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life10_40))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_298(32416, (7281819486054865869L ^ life4_3)))), ((int)(4)), ((int)(5)), ((moom.G2)(p2)));
    lexicalValue75_1393_0 = 0;
    }
    life11_1404 = lexicalValue75_1393_0;
    lexical_cycle_1394: while (true) {
    if (!((life11_1404 < 4))) {
        break lexical_join_1468;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life8_30))))), ((int)(5)), ((int)((-life11_1404))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic75_302(8343, (6909163354030441955L ^ life4_3)) + life11_1404))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aw)).b__fE(((int)(life8_30))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_306(8343, (6909163354030441955L ^ life4_3)))), ((int)((-life11_1404))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic75_307(8343, (6909163354030441955L ^ life4_3)) + life11_1404))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)((-life11_1404))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic75_309(32416, (7281819486054865869L ^ life4_3)) + life11_1404))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_310(8343, (6909163354030441955L ^ life4_3)))), ((int)((-life11_1404))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic75_311(2086, (5581404872579231045L ^ life4_3)) + life11_1404))));
    life11_1404 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_1530;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_1394; }
    break lexical_cycle_1394;
    }
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_313(20190, (3471002516545039291L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_314(14251, (3473204899219509959L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_315(9929, (2487751321507038140L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_316(20172, (7727480360078240686L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_318(20528, (3313106770311738696L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_319(20172, (7727480360078240686L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_321(20528, (3313106770311738696L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_322(2086, (5581404872579231045L ^ life4_3)))), ((int)(-1)), ((int)(5)));
    }
    life11_1545 = 1;
    lexical_cycle_1532: while (true) {
    if (!((life11_1545 <= __sourceIntrinsic_5ac1d031d896_invokedynamic75_324(20172, (7727480360078240686L ^ life4_3))))) {
        break lexical_join_1565;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_325(20528, (3313106770311738696L ^ life4_3)))), ((int)(life11_1545)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_326(7577, (859498304281393391L ^ life4_3)))), ((int)(life11_1545)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    life11_1545 += 2;
    if (!((life6_5 != null))) {
        break lexical_join_1567;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_1532; }
    break lexical_cycle_1532;
    }
    }
    life11_1545 = 2;
    }
    lexical_cycle_1567: while (true) {
    if (!((life11_1545 <= __sourceIntrinsic_5ac1d031d896_invokedynamic75_329(14251, (3473204899219509959L ^ life4_3))))) {
        break lexical_join_1592;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(-1)), ((int)(life11_1545)), ((int)(3)), ((int)(-1)), ((int)(life11_1545)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    life11_1545 += 2;
    if (!((life6_5 != null))) {
        break lexical_join_1907;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_1567; }
    break lexical_cycle_1567;
    }
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_332(28359, (147351841018792865L ^ life4_3)))), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_333(28359, (147351841018792865L ^ life4_3)))), ((int)(1)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_336(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_337(28359, (147351841018792865L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_338(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_339(28359, (147351841018792865L ^ life4_3)))), ((int)(1)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_342(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_343(20528, (3313106770311738696L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_344(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_345(20528, (3313106770311738696L ^ life4_3)))), ((int)(1)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_348(8343, (6909163354030441955L ^ life4_3)))), ((int)(-1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_349(8343, (6909163354030441955L ^ life4_3)))), ((int)(-1)), ((int)(1)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eE)(net.minecraft.init.Blocks.bG)).b__fE(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bG)), ((int)(((moom.bs)(moom.bs.EAST)).b())))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_361(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_362(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eE)(net.minecraft.init.Blocks.bG)).b__fE(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bG)), ((int)(((moom.bs)(moom.bs.WEST)).b())))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_373(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_374(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bH)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_381(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_382(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bH)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_389(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_390(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_394(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_395(32416, (7281819486054865869L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_399(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_400(8343, (6909163354030441955L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_404(20528, (3313106770311738696L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_408(20528, (3313106770311738696L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_412(20528, (3313106770311738696L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_416(20528, (3313106770311738696L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_420(20528, (3313106770311738696L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_424(20528, (3313106770311738696L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_428(20528, (3313106770311738696L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    }
    spill75_2 = this.k;
    if (!((life6_5 != null))) {
        lexicalValue75_2153_0 = ((spill75_2) ? 1 : 0);
        break lexical_join_2153;
    }
    if (!((!spill75_2))) {
        break lexical_join_1930;
    }
    this.k = ((boolean)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_432(28359, (147351841018792865L ^ life4_3)))), ((int)(1)), ((int)(((moom.bs)(moom.bs.NORTH)).a())), ((java.util.List)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.n)), ((int)(2)))));
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)).b__fE(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_439(8985, (5501210584654808702L ^ life4_3))))))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_441(28359, (147351841018792865L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eE)(net.minecraft.init.Blocks.bG)).b__fE(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bG)), ((int)(((moom.bs)(moom.bs.NORTH)).b())))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_452(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_453(20528, (3313106770311738696L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eE)(net.minecraft.init.Blocks.bG)).b__fE(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bG)), ((int)(((moom.bs)(moom.bs.SOUTH)).b())))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eE.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_464(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_465(20528, (3313106770311738696L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bH)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_472(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_473(20528, (3313106770311738696L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bH)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_480(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_481(20528, (3313106770311738696L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bH)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eD.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_488(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_489(20528, (3313106770311738696L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_493(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_494(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_495(8343, (6909163354030441955L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_499(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_500(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_501(8343, (6909163354030441955L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_505(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_506(20528, (3313106770311738696L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_510(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_511(20528, (3313106770311738696L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_515(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_516(28359, (147351841018792865L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    lexicalValue75_2153_0 = ((this.l) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue75_2220_0 = lexicalValue75_2153_0;
        break lexical_join_2220;
    }
    if (!((lexicalValue75_2153_0 == 0))) {
        break lexical_join_2178;
    }
    this.l = ((boolean)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_520(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_521(28359, (147351841018792865L ^ life4_3)))), ((int)(3)), ((int)(((moom.bs)(moom.bs.WEST)).a())), ((java.util.List)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.n)), ((int)(2)))));
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)).b__fE(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_528(8985, (5501210584654808702L ^ life4_3))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_530(23615, (8693962447385557313L ^ life4_3)))), ((int)(-1)), ((int)(3)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)).b__fE(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_533(8985, (5501210584654808702L ^ life4_3))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_535(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_536(28359, (147351841018792865L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    lexicalValue75_2220_0 = ((this.i) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue75_2843_0 = lexicalValue75_2220_0;
        break lexical_join_2843;
    }
    if (!((lexicalValue75_2220_0 == 0))) {
        break lexical_join_2256;
    }
    this.i = ((boolean)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_540(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_541(20528, (3313106770311738696L ^ life4_3)))), ((int)(3)), ((java.util.List)(moom.D5.a(((java.util.List)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.m)), ((moom.D5[])(new moom.D5[] {((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)))}))))), ((int)((2 + ((java.util.Random)(p1)).nextInt(((int)(5)))))))));
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_551(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_552(20528, (3313106770311738696L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_556(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_557(20528, (3313106770311738696L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_561(20528, (3313106770311738696L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_565(28359, (147351841018792865L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(5)), ((int)(-1)), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_572(8343, (6909163354030441955L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_573(20528, (3313106770311738696L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_577(32416, (7281819486054865869L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_578(28359, (147351841018792865L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_582(32416, (7281819486054865869L ^ life4_3)))), ((int)(-1)), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_586(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_587(20528, (3313106770311738696L ^ life4_3)))), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_589(2086, (5581404872579231045L ^ life4_3)))), ((int)(-1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_590(2086, (5581404872579231045L ^ life4_3)))), ((int)(-1)), ((int)(5)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_593(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_594(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_595(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_596(9929, (2487751321507038140L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_597(9929, (2487751321507038140L ^ life4_3)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).b__fE(((int)(moom.ey.U))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_602(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_603(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_604(28971, (1984725379878442076L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).b__fE(((int)(moom.ey.U))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_609(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_610(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_611(28971, (1984725379878442076L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a5)).b__fE(((int)(moom.ey.U))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_616(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_617(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_618(28971, (1984725379878442076L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ay)).b__fE(((int)(moom.dK.a(((moom.bs)(moom.bs.a(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ay)), ((int)(((moom.bs)(moom.bs.NORTH)).a())))))))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_628(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_629(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_630(14251, (3473204899219509959L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ay)).b__fE(((int)(moom.dK.a(((moom.bs)(moom.bs.a(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ay)), ((int)(((moom.bs)(moom.bs.NORTH)).a())))))))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_640(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_641(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_642(14251, (3473204899219509959L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ay)).b__fE(((int)(moom.dK.a(((moom.bs)(moom.bs.a(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ay)), ((int)(((moom.bs)(moom.bs.NORTH)).a())))))))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_652(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_653(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_654(14251, (3473204899219509959L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_656(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_657(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_658(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_659(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_660(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_661(9929, (2487751321507038140L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_664(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_665(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_666(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_667(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_668(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_669(9929, (2487751321507038140L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.o)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_674(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_675(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_676(2086, (5581404872579231045L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_680(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_681(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_682(2086, (5581404872579231045L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_686(23615, (8693962447385557313L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_687(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_688(9929, (2487751321507038140L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.d9)(net.minecraft.init.Blocks.af)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_692(9929, (2487751321507038140L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_693(2086, (5581404872579231045L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockPistonBase)(net.minecraft.init.Blocks.F)).b__fE(((int)(((moom.bs)(moom.bs.UP)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_699(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_700(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_701(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockPistonBase)(net.minecraft.init.Blocks.F)).b__fE(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.F)), ((int)(((moom.bs)(moom.bs.WEST)).a())))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_709(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_710(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_711(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockPistonBase)(net.minecraft.init.Blocks.F)).b__fE(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.F)), ((int)(((moom.bs)(moom.bs.WEST)).a())))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_719(9929, (2487751321507038140L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_720(23615, (8693962447385557313L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockRedstoneRepeater)(net.minecraft.init.Blocks.a1)).b__fE(((int)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a1)), ((int)(((moom.bs)(moom.bs.NORTH)).b())))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_728(9929, (2487751321507038140L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_729(28359, (147351841018792865L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_730(9929, (2487751321507038140L ^ life4_3)))), ((moom.G2)(p2)));
    lexicalValue75_2843_0 = ((this.j) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue75_2884_0 = lexicalValue75_2843_0;
        break lexical_join_2884;
    }
    if (!((lexicalValue75_2843_0 == 0))) {
        break lexical_join_2883;
    }
    this.j = ((boolean)(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_734(2086, (5581404872579231045L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_735(20528, (3313106770311738696L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic75_736(9929, (2487751321507038140L ^ life4_3)))), ((java.util.List)(moom.D5.a(((java.util.List)(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid.m)), ((moom.D5[])(new moom.D5[] {((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)))}))))), ((int)((2 + ((java.util.Random)(p1)).nextInt(((int)(5)))))))));
    }
    lexicalValue75_2884_0 = 1;
    }
    return ((lexicalValue75_2884_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1953_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ceb9249117e105c_originalDynamicSite4030_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ceb9249117e105c_originalDynamicSite4030_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ceb9249117e105c_originalDynamicSite4030_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ceb9249117e105c_originalDynamicSite4030_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12709_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_201(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_202(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_208(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_214(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_215(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_220(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_221(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_231(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_242(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_250(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_258(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_262(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_263(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_267(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_268(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_272(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_273(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_275(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_276(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_279(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_280(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_281(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_282(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_285(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_286(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_287(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_290(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_298(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_302(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_306(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_307(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_309(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_310(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_311(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_313(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_314(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_315(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_316(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_318(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_319(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_321(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_322(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_324(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_325(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_326(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_329(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_332(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_333(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_336(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_337(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_338(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_339(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_342(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_343(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_344(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_345(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_348(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_349(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_361(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_362(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_373(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_374(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_381(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_382(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_389(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_390(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_394(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_395(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_399(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_400(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_404(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_408(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_412(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_416(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_420(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_424(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_428(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_432(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_439(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_441(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_452(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_453(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_464(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_465(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_472(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_473(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_480(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_481(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_488(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_489(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_493(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_494(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_495(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_499(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_500(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_501(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_505(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_506(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_510(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_511(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_515(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_516(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_520(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_521(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_528(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_530(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_533(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_535(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_536(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_540(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_541(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_551(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_552(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_556(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_557(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_561(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_565(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_572(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_573(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_577(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_578(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_582(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_586(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_587(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_589(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_590(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_593(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_594(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_595(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_596(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_597(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_602(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_603(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_604(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_609(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_610(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_611(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_616(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_617(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_618(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_628(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_629(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_630(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_640(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_641(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_642(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_652(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_653(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_654(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_656(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_657(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_658(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_659(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_660(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_661(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_664(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_665(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_666(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_667(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_668(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_669(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_674(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_675(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_676(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_680(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_681(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_682(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_686(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_687(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_688(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_692(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_693(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_699(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_700(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_701(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_709(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_710(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_711(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_719(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_720(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_728(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_729(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_730(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_734(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_735(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic75_736(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
