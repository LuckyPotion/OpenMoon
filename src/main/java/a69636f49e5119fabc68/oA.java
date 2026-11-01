package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class oA extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<net.minecraft.tileentity.TileEntitySkull> {

private static moom.DD f;

private static moom.DD g;

private static moom.DD h;

private static moom.DD i;

public static moom.oA j;

private moom.jq k;

public moom.jq l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public oA() { super(); }


private static void __sourceConstructorBody_0ca65ae0dd05e5a2(moom.oA receiver) throws Throwable {

long local1 = (moom.oA.m ^ 7706029680012L);

    moom.oA.__sourceConstructorInit_0ca65ae0dd05e5a2_0(((moom.oA)(receiver)));

    ((moom.oA)(receiver)).k = ((moom.jq)(new moom.jq(0, 0, __sourceIntrinsic_0ca65ae0dd05e5a2_originalDynamicSite3153_2(23249, (336706094384513612L ^ local1)), __sourceIntrinsic_0ca65ae0dd05e5a2_originalDynamicSite3153_3(8105, (7817306759302891318L ^ local1)))));

    ((moom.oA)(receiver)).l = ((moom.jq)(new moom.jr()));

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(-1123913227696949723L)), ((long)(-1618908229150784536L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(209130930488668L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.oA.m ^ 72916436174286L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1435_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1435_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1435_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1435_14 = new byte[8];
    (__sourceSpill1435_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1435_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1435_16 = __sourceSpill1435_14;
    ((javax.crypto.Cipher)(__sourceSpill1435_11)).init(((int)(__sourceSpill1435_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1435_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1435_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "n.H¹l¾Y\fÅ_^\fm4¨TcvGêË TÅÍ\022ýÃ/¾ÆôH÷Ö¿\ríï¾ÇÂÝ\030À"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1435_25 = local6_life21;
        int __sourceSpill1435_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1435_25)).substring(((int)(__sourceSpill1435_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1435_30 = local8_life19;
        int __sourceSpill1435_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1435_33 = new byte[8];
        (__sourceSpill1435_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1435_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1435_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1435_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1435_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1435_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1435_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1435_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1435_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1435_34)).doFinal(((byte[])(__sourceSpill1435_33)));
        (__sourceSpill1435_30)[__sourceSpill1435_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "`^­²U³Úm\030»è`ä"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1435_38 = local6_life21;
        int __sourceSpill1435_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1435_38)).substring(((int)(__sourceSpill1435_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1435_43 = local8_life19;
        int __sourceSpill1435_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1435_46 = new byte[8];
        (__sourceSpill1435_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1435_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1435_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1435_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1435_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1435_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1435_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1435_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1435_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1435_47)).doFinal(((byte[])(__sourceSpill1435_46)));
        (__sourceSpill1435_43)[__sourceSpill1435_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[8]));
    f = ((moom.DD)(new moom.DD("textures/entity/skeleton/skeleton.png")));
    g = ((moom.DD)(new moom.DD("textures/entity/skeleton/wither_skeleton.png")));
    h = ((moom.DD)(new moom.DD("textures/entity/zombie/zombie.png")));
    i = ((moom.DD)(new moom.DD("textures/entity/creeper/creeper.png")));
}

private static native <E extends Throwable> void __sourceConstructorInit_0ca65ae0dd05e5a2_0(moom.oA a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(moom.oo p0) {
super.a(((moom.oo)(p0)));
    j = ((moom.oA)(this));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1013;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/oA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.oA.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8539_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.tileentity.TileEntitySkull p0, double p1, double p2, double p3, float p4, int p5) {
long local10 = (moom.oA.m ^ 26439988981672L);
    moom.bs local12 = moom.bs.a(((int)((((net.minecraft.tileentity.TileEntitySkull)(p0)).e() & __sourceIntrinsic_a748977dd67b_originalDynamicSite1573_2(30463, (6467772070819193922L ^ local10))))));
    ((moom.oA)(this)).a(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))), ((moom.bs)(local12)), ((float)((((float) (((net.minecraft.tileentity.TileEntitySkull)(p0)).b() * __sourceIntrinsic_a748977dd67b_originalDynamicSite1573_5(17183, (3498714244720316833L ^ local10)))) / 0x1.0p4f))), ((int)(((net.minecraft.tileentity.TileEntitySkull)(p0)).a__sourceReturn_8abf5c6871())), ((com.mojang.authlib.GameProfile)(((net.minecraft.tileentity.TileEntitySkull)(p0)).a__GameProfile())), ((int)(p5)));
    return;
}


public void a(float p0, float p1, float p2, moom.bs p3, float p4, int p5, com.mojang.authlib.GameProfile p6, int p7) {
int spill100124_0;

    long spill100124_1;

    int spill100124_2;

    long life9_3;

    moom.jq life11_6;

    moom.DD life12_57;

    net.minecraft.client.Minecraft life13_61;

    java.util.Map life14_66;

    java.util.UUID life15_83;

    float life12_163;

    forest_join_195: {

    forest_join_162: {

    forest_join_154: {

    forest_join_141: {

    forest_join_128: {

    forest_join_115: {

    forest_join_104: {

    forest_join_94: {

    forest_join_91: {

    forest_join_87: {

    forest_join_81: {

    forest_join_53: {

    forest_join_46: {

    forest_join_42: {

    forest_join_38: {

    forest_join_36: {

    life9_3 = (moom.oA.m ^ 60266391047284L);

    life11_6 = this.k;

    if (!((p7 >= 0))) {

        break forest_join_36;

    }

    ((moom.oA)(this)).b(((moom.DD)((moom.oA.a)[p7])));

    moom.kZ.l(((int)(__sourceIntrinsic_70ac95b58505_invokedynamic100124_4(17554, (2866679213193197046L ^ life9_3)))));

    spill100124_0 = 23827;

    moom.kZ.B();

    spill100124_1 = (1716429310381943920L ^ life9_3);

    moom.kZ.a(((float)(0x1.0p2f)), ((float)(0x1.0p1f)), ((float)(0x1.0p0f)));

    moom.kZ.b(((float)(0x1.0p-4f)), ((float)(0x1.0p-4f)), ((float)(0x1.0p-4f)));

    moom.kZ.l(((int)(__sourceIntrinsic_70ac95b58505_invokedynamic100124_9(spill100124_0, spill100124_1))));

    break forest_join_94;

    }

    switch (p5) {

case 0:

default:

{

        break forest_join_38;

    }

case 1:

{

        break forest_join_42;

    }

case 2:

{

        break forest_join_46;

    }

case 3:

{

        break forest_join_53;

    }

case 4:

{

        break forest_join_91;

    }

}

    }

    ((moom.oA)(this)).b(((moom.DD)(moom.oA.f)));

    break forest_join_94;

    }

    ((moom.oA)(this)).b(((moom.DD)(moom.oA.g)));

    break forest_join_94;

    }

    ((moom.oA)(this)).b(((moom.DD)(moom.oA.h)));

    life11_6 = this.l;

    break forest_join_94;

    }

    life11_6 = this.l;

    life12_57 = moom.oJ.a();

    if (!((p6 != null))) {

        break forest_join_87;

    }

    life13_61 = net.minecraft.client.Minecraft.a__fM();

    life14_66 = ((moom.o6)(((net.minecraft.client.Minecraft)(life13_61)).a__o6())).a(((com.mojang.authlib.GameProfile)(p6)));

    if (!(((java.util.Map)(life14_66)).containsKey(((java.lang.Object)(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type.SKIN))))) {

        break forest_join_81;

    }

    life12_57 = ((moom.o6)(((net.minecraft.client.Minecraft)(life13_61)).a__o6())).a(((com.mojang.authlib.minecraft.MinecraftProfileTexture)(((com.mojang.authlib.minecraft.MinecraftProfileTexture)(((java.util.Map)(life14_66)).get(((java.lang.Object)(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type.SKIN))))))), ((com.mojang.authlib.minecraft.MinecraftProfileTexture.Type)(com.mojang.authlib.minecraft.MinecraftProfileTexture.Type.SKIN)));

    break forest_join_87;

    }

    life15_83 = net.minecraft.entity.player.EntityPlayer.a(((com.mojang.authlib.GameProfile)(p6)));

    life12_57 = moom.oJ.a__DD(((java.util.UUID)(life15_83)));

    }

    ((moom.oA)(this)).b(((moom.DD)(life12_57)));

    break forest_join_94;

    }

    ((moom.oA)(this)).b(((moom.DD)(moom.oA.i)));

    }

    moom.kZ.B();

    moom.kZ.p();

    if (!((p3 != moom.bs.UP))) {

        break forest_join_154;

    }

    switch ((moom.op.a)[((moom.bs)(p3)).ordinal()]) {

case 1:

{

        break forest_join_104;

    }

case 2:

{

        break forest_join_115;

    }

case 3:

{

        break forest_join_128;

    }

case 4:

default:

{

        break forest_join_141;

    }

}

    }

    moom.kZ.b(((float)((p0 + 0x1.0p-1f))), ((float)((p1 + 0x1.0p-2f))), ((float)((p2 + 0x1.7ae148p-1f))));

    break forest_join_162;

    }

    moom.kZ.b(((float)((p0 + 0x1.0p-1f))), ((float)((p1 + 0x1.0p-2f))), ((float)((p2 + 0x1.0a3d7p-2f))));

    p4 = 0x1.68p7f;

    break forest_join_162;

    }

    moom.kZ.b(((float)((p0 + 0x1.7ae148p-1f))), ((float)((p1 + 0x1.0p-2f))), ((float)((p2 + 0x1.0p-1f))));

    p4 = 0x1.0ep8f;

    break forest_join_162;

    }

    moom.kZ.b(((float)((p0 + 0x1.0a3d7p-2f))), ((float)((p1 + 0x1.0p-2f))), ((float)((p2 + 0x1.0p-1f))));

    p4 = 0x1.68p6f;

    break forest_join_162;

    }

    moom.kZ.b(((float)((p0 + 0x1.0p-1f))), ((float)(p1)), ((float)((p2 + 0x1.0p-1f))));

    }

    life12_163 = 0x1.0p-4f;

    moom.kZ.y();

    moom.kZ.a(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x1.0p0f)));

    moom.kZ.d__Void();

    ((moom.iQ)(life11_6)).a(((net.minecraft.entity.Entity)(null)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(p4)), ((float)(0x0.0p0f)), ((float)(life12_163)));

    moom.kZ.C();

    if (!((p7 >= 0))) {

        break forest_join_195;

    }

    moom.kZ.l(((int)(__sourceIntrinsic_70ac95b58505_invokedynamic100124_51(14678, (7750978143950768182L ^ life9_3)))));

    spill100124_2 = 30377;

    moom.kZ.C();

    moom.kZ.l(((int)(__sourceIntrinsic_70ac95b58505_invokedynamic100124_54(spill100124_2, (8109520100261578703L ^ life9_3)))));

    }

    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_0ca65ae0dd05e5a2_originalDynamicSite3153_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0ca65ae0dd05e5a2_originalDynamicSite3153_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_70ac95b58505_invokedynamic100124_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_70ac95b58505_invokedynamic100124_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_70ac95b58505_invokedynamic100124_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_70ac95b58505_invokedynamic100124_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8539_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a748977dd67b_originalDynamicSite1573_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a748977dd67b_originalDynamicSite1573_5(int a0, long a1) throws E;
}
