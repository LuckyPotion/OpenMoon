package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class uF extends moom.uC {

private net.minecraft.entity.passive.EntityRabbit k;

private boolean l;

private boolean m;

private static long n;

private static long[] o;

private static java.lang.Integer[] t;

private static java.util.Map u;

public uF(net.minecraft.entity.passive.EntityRabbit p0) { super((moom.sI)null, 0.0D, 0); }


private static void __sourceConstructorBody_ee97b6703f846dd8(moom.uF receiver, net.minecraft.entity.passive.EntityRabbit p0) throws Throwable {

long local2 = (moom.uF.n ^ 83531240989968L);

    moom.uF.__sourceConstructorInit_ee97b6703f846dd8_0(((moom.uF)(receiver)), ((net.minecraft.entity.passive.EntityRabbit)(p0)), ((double)(0x1.666666p-1d)), ((int)(__sourceIntrinsic_ee97b6703f846dd8_originalDynamicSite3390_1(24625, (8155259629811576464L ^ local2)))));

    ((moom.uF)(receiver)).m = ((boolean)(false));

    ((moom.uF)(receiver)).k = ((net.minecraft.entity.passive.EntityRabbit)(p0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ee97b6703f846dd8_0(moom.uF a0, net.minecraft.entity.passive.EntityRabbit a1, double a2, int a3) throws E;

static {
n = ((long)(((moom._a)(moom._c.a(((long)(-5665569535827245258L)), ((long)(6465278756442110533L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(196909412189874L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uF.n ^ 67623776658149L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1584_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1584_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1584_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1584_14 = new byte[8];
    (__sourceSpill1584_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1584_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1584_16 = __sourceSpill1584_14;
    ((javax.crypto.Cipher)(__sourceSpill1584_11)).init(((int)(__sourceSpill1584_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1584_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1584_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ô\007i[õ¿Z\002§õvÄ\036i&"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1584_25 = local6_life21;
        int __sourceSpill1584_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1584_25)).substring(((int)(__sourceSpill1584_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1584_30 = local8_life19;
        int __sourceSpill1584_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1584_33 = new byte[8];
        (__sourceSpill1584_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1584_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1584_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1584_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1584_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1584_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1584_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1584_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1584_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1584_34)).doFinal(((byte[])(__sourceSpill1584_33)));
        (__sourceSpill1584_30)[__sourceSpill1584_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "°\026\034YBÝÝ_\033Û\024x°³\037"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1584_38 = local6_life21;
        int __sourceSpill1584_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1584_38)).substring(((int)(__sourceSpill1584_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1584_43 = local8_life19;
        int __sourceSpill1584_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1584_46 = new byte[8];
        (__sourceSpill1584_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1584_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1584_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1584_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1584_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1584_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1584_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1584_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1584_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1584_47)).doFinal(((byte[])(__sourceSpill1584_46)));
        (__sourceSpill1584_43)[__sourceSpill1584_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9292_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28990;
      if (t[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/uF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uF.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__Boolean() {
int forwardValue4155_13_0;
    int forwardValue4155_17_0;
    int forwardValue4155_19_0;
    boolean spill4155_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.uF.n ^ 28853836270315L);
    life3_5 = moom.vR.b();
    spill4155_0 = this.m;
    if (!((life3_5 != 0))) {
        forwardValue4155_13_0 = ((spill4155_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill4155_0)) {
        break forward_join_18;
    }
    forwardValue4155_13_0 = ((super.b__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4155_17_0 = forwardValue4155_13_0;
        break forward_join_17;
    }
    if (!((forwardValue4155_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue4155_17_0 = 1;
    }
    forwardValue4155_19_0 = forwardValue4155_17_0;
    break forward_join_19;
    }
    forwardValue4155_19_0 = 0;
    }
    return ((forwardValue4155_19_0) != 0);
}


public void b__Void() {
super.b__Void();
    return;
}


public void c() {
moom.uF forwardValue4156_41_0;
    int forwardValue4156_70_0;
    int forwardValue4156_89_0;
    moom.uF forwardValue4156_97_0;
    int spill4156_0;
    moom.uF spill4156_1;
    moom.uF spill4156_2;
    int spill4156_3;
    long life1_3;
    int life3_34;
    net.minecraft.world.World life4_49;
    moom.DT life5_53;
    net.minecraft.block.state.IBlockState life6_57;
    net.minecraft.block.Block life7_60;
    forward_join_103: {
    forward_join_97: {
    forward_join_93: {
    forward_join_89: {
    forward_join_70: {
    forward_join_41: {
    life1_3 = (moom.uF.n ^ 87024371411016L);
    spill4156_0 = moom.vR.b();
    super.c();
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.passive.EntityRabbit)(this.k)).a__vt())).a(((double)((((double) ((moom.DT)(this.h)).a()) + 0x1.0p-1d))), ((double)(((double) (((moom.DT)(this.h)).b() + 1)))), ((double)((((double) ((moom.DT)(this.h)).c()) + 0x1.0p-1d))), ((float)(0x1.4p3f)), ((float)(((float) ((net.minecraft.entity.passive.EntityRabbit)(this.k)).m__Int()))));
    life3_34 = spill4156_0;
    spill4156_1 = this;
    if (!((life3_34 != 0))) {
        forwardValue4156_41_0 = spill4156_1;
        break forward_join_41;
    }
    if (!(((moom.uF)(spill4156_1)).f())) {
        break forward_join_103;
    }
    forwardValue4156_41_0 = this;
    }
    life4_49 = ((net.minecraft.entity.passive.EntityRabbit)(((moom.uF)(forwardValue4156_41_0)).k)).i;
    life5_53 = ((moom.DT)(this.h)).a__DT();
    life6_57 = ((net.minecraft.world.World)(life4_49)).a__fE(((moom.DT)(life5_53)));
    life7_60 = ((net.minecraft.block.state.IBlockState)(life6_57)).a__ch();
    spill4156_2 = this;
    if (!((life3_34 != 0))) {
        forwardValue4156_97_0 = spill4156_2;
        break forward_join_97;
    }
    if (!(((moom.uF)(spill4156_2)).m)) {
        break forward_join_93;
    }
    spill4156_3 = ((life7_60 instanceof moom.cw) ? 1 : 0);
    if (!((life3_34 != 0))) {
        forwardValue4156_70_0 = spill4156_3;
        break forward_join_70;
    }
    if (!((spill4156_3 != 0))) {
        break forward_join_93;
    }
    forwardValue4156_70_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life6_57)).a(((net.minecraft.block.properties.IProperty)(moom.cw.R))))))).intValue();
    }
    if (!((life3_34 != 0))) {
        forwardValue4156_89_0 = forwardValue4156_70_0;
        break forward_join_89;
    }
    if (!((forwardValue4156_70_0 == __sourceIntrinsic_5b7380e7aa7c_invokedynamic4156_27(18998, (2720292945708337612L ^ life1_3))))) {
        break forward_join_93;
    }
    ((net.minecraft.world.World)(life4_49)).a(((moom.DT)(life5_53)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)));
    forwardValue4156_89_0 = ((((net.minecraft.world.World)(life4_49)).b(((moom.DT)(life5_53)), ((boolean)(true)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4156_89_0);
    ((net.minecraft.entity.passive.EntityRabbit)(this.k)).ad__sourceReturn_da8c82d5d4();
    }
    this.m = ((boolean)(false));
    forwardValue4156_97_0 = this;
    }
    ((moom.uF)(forwardValue4156_97_0)).e = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4156_37(7939, (9104787604262624507L ^ life1_3))));
    }
    return;
}


public void a__Void() {
super.a__Void();
    return;
}


public boolean a__Boolean() {
moom.uF forwardValue4154_26_0;
    int forwardValue4154_32_0;
    int spill4154_0;
    moom.uF spill4154_1;
    long life1_3;
    int life3_5;
    forward_join_32: {
    forward_join_30: {
    forward_join_26: {
    forward_join_22: {
    life1_3 = (moom.uF.n ^ 125952044016250L);
    life3_5 = moom.vR.c();
    spill4154_0 = this.e;
    if (!((life3_5 == 0))) {
        forwardValue4154_32_0 = spill4154_0;
        break forward_join_32;
    }
    if (!((spill4154_0 <= 0))) {
        break forward_join_30;
    }
    spill4154_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue4154_26_0 = spill4154_1;
        break forward_join_26;
    }
    if (!((!((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityRabbit)(((moom.uF)(spill4154_1)).k)).i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")))))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    this.m = ((boolean)(false));
    forwardValue4154_26_0 = this;
    }
    ((moom.uF)(forwardValue4154_26_0)).l = ((boolean)(__sourceExactCall_aef8cb6178de60(((net.minecraft.entity.passive.EntityRabbit)(this.k)))));
    }
    forwardValue4154_32_0 = ((super.a__Boolean()) ? 1 : 0);
    }
    return ((forwardValue4154_32_0) != 0);
}


protected boolean a(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue4153_60_0;
    int spill4153_0;
    int spill4153_1;
    int spill4153_2;
    boolean spill4153_3;
    boolean spill4153_4;
    long life3_3;
    net.minecraft.block.Block life6_9;
    int life5_10;
    net.minecraft.block.state.IBlockState life7_25;
    net.minecraft.block.Block life6_28;
    forward_join_60: {
    forward_join_59: {
    forward_join_19: {
    life3_3 = (moom.uF.n ^ 117097723492285L);
    spill4153_0 = moom.vR.b();
    life6_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    life5_10 = spill4153_0;
    if (!((life5_10 != 0))) {
        break forward_join_19;
    }
    if (!((life6_9 == net.minecraft.init.Blocks.ak))) {
        break forward_join_59;
    }
    p1 = ((moom.DT)(p1)).a__DT();
    }
    life7_25 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life6_28 = ((net.minecraft.block.state.IBlockState)(life7_25)).a__ch();
    spill4153_1 = ((life6_28 instanceof moom.cw) ? 1 : 0);
    if (!((life5_10 != 0))) {
        forwardValue4153_60_0 = spill4153_1;
        break forward_join_60;
    }
    if (!((spill4153_1 != 0))) {
        break forward_join_59;
    }
    spill4153_2 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life7_25)).a(((net.minecraft.block.properties.IProperty)(moom.cw.R))))))).intValue();
    if (!((life5_10 != 0))) {
        forwardValue4153_60_0 = spill4153_2;
        break forward_join_60;
    }
    if (!((spill4153_2 == __sourceIntrinsic_a8ffddd0fe52_invokedynamic4153_13(3759, (3573223559413584545L ^ life3_3))))) {
        break forward_join_59;
    }
    spill4153_3 = this.l;
    if (!((life5_10 != 0))) {
        forwardValue4153_60_0 = ((spill4153_3) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill4153_3)) {
        break forward_join_59;
    }
    spill4153_4 = this.m;
    if (!((life5_10 != 0))) {
        forwardValue4153_60_0 = ((spill4153_4) ? 1 : 0);
        break forward_join_60;
    }
    if (!((!spill4153_4))) {
        break forward_join_59;
    }
    this.m = ((boolean)(true));
    return ((1) != 0);
    }
    forwardValue4153_60_0 = 0;
    }
    return ((forwardValue4153_60_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_ee97b6703f846dd8_originalDynamicSite3390_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9292_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4156_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4156_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a8ffddd0fe52_invokedynamic4153_13(int a0, long a1) throws E;

private static native boolean __sourceExactCall_aef8cb6178de60(net.minecraft.entity.passive.EntityRabbit p0);
}
