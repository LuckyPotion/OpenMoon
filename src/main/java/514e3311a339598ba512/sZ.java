package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class sZ extends moom.sI implements moom.vP {

private static int b4;

private static long ib;

private static long[] ub;

private static java.lang.Integer[] vb;

private static java.util.Map wb;

public sZ(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_c698b0facc29cdce(moom.sZ receiver, net.minecraft.world.World p0) throws Throwable {

long local2 = (moom.sZ.ib ^ 122771397021198L);

    moom.sZ.__sourceConstructorInit_c698b0facc29cdce_0(((moom.sZ)(receiver)), ((net.minecraft.world.World)(p0)));

    ((moom.sZ)(receiver)).bD = ((int)(__sourceIntrinsic_c698b0facc29cdce_originalDynamicSite3286_2(8901, (6793644574224719010L ^ local2))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c698b0facc29cdce_0(moom.sZ a0, net.minecraft.world.World a1) throws E;

static {
ib = ((long)(((moom._a)(moom._c.a(((long)(-8662494093685722739L)), ((long)(7413875253609665489L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175379836826070L)))));
    int __sourceSpill1526_6 = 38;
    wb = ((java.util.Map)(new java.util.HashMap(13)));
    moom.sZ.k(((int)(__sourceSpill1526_6)));
    long local0_life9 = (moom.sZ.ib ^ 122655148439631L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1526_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1526_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1526_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1526_16 = new byte[8];
    (__sourceSpill1526_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1526_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1526_18 = __sourceSpill1526_16;
    ((javax.crypto.Cipher)(__sourceSpill1526_13)).init(((int)(__sourceSpill1526_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1526_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1526_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[4];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = " «+jÍª×±ÿHtì#i"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1526_27 = local6_life23;
        int __sourceSpill1526_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1526_27)).substring(((int)(__sourceSpill1526_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1526_32 = local8_life21;
        int __sourceSpill1526_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1526_35 = new byte[8];
        (__sourceSpill1526_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1526_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1526_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1526_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1526_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1526_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1526_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1526_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1526_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1526_36)).doFinal(((byte[])(__sourceSpill1526_35)));
        (__sourceSpill1526_32)[__sourceSpill1526_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "×Ë¬ }\033Gg0z\024îÆ×"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1526_40 = local6_life23;
        int __sourceSpill1526_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1526_40)).substring(((int)(__sourceSpill1526_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1526_45 = local8_life21;
        int __sourceSpill1526_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1526_48 = new byte[8];
        (__sourceSpill1526_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1526_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1526_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1526_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1526_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1526_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1526_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1526_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1526_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1526_49)).doFinal(((byte[])(__sourceSpill1526_48)));
        (__sourceSpill1526_45)[__sourceSpill1526_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    ub = ((long[])(local8_life21));
    vb = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected java.lang.String e__String() {
return "game.hostile.swim.splash";
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
int forwardValue3989_38_0;
    int forwardValue3989_91_0;
    int forwardValue3989_104_0;
    net.minecraft.entity.Entity[] spill3989_0;
    int spill3989_1;
    int spill3989_2;
    int spill3989_3;
    long life2_3;
    float life5_10;
    int life6_12;
    net.minecraft.entity.Entity[] life4_13;
    int life7_41;
    int life8_106;
    forward_join_104: {
    forward_join_103: {
    forward_join_99: {
    forward_join_91: {
    forward_join_89: {
    forward_join_38: {
    forward_join_33: {
    life2_3 = (moom.sZ.ib ^ 65020924277734L);
    spill3989_0 = moom.vN.b();
    life5_10 = ((float) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.sZ)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).b());
    life6_12 = 0;
    life4_13 = spill3989_0;
    spill3989_1 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_13 == null))) {
        forwardValue3989_38_0 = spill3989_1;
        break forward_join_38;
    }
    if (!((spill3989_1 != 0))) {
        break forward_join_33;
    }
    life5_10 = (life5_10 + moom.rV.a(((net.minecraft.item.ItemStack)(((moom.sZ)(this)).a__xW())), ((net.minecraft.entity.EnumCreatureAttribute)(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))).a__aR()))));
    life6_12 = (life6_12 + moom.rV.a(((net.minecraft.entity.EntityLivingBase)(this))));
    }
    forwardValue3989_38_0 = ((((net.minecraft.entity.Entity)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this))))), ((float)(life5_10)))) ? 1 : 0);
    }
    life7_41 = forwardValue3989_38_0;
    spill3989_2 = life7_41;
    if (!((life4_13 == null))) {
        forwardValue3989_104_0 = spill3989_2;
        break forward_join_104;
    }
    if (!((spill3989_2 != 0))) {
        break forward_join_103;
    }
    spill3989_3 = life6_12;
    if (!((life4_13 == null))) {
        forwardValue3989_91_0 = spill3989_3;
        break forward_join_91;
    }
    if (!((spill3989_3 > 0))) {
        break forward_join_89;
    }
    ((net.minecraft.entity.Entity)(p0)).c(((double)(((double) (((-moom.Dr.a(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f))))) * ((float) life6_12)) * 0x1.0p-1f)))), ((double)(0x1.999999999999ap-4d)), ((double)(((double) ((moom.Dr.b(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f)))) * ((float) life6_12)) * 0x1.0p-1f)))));
    moom.sZ __stackOp3989_19_0 = this;
    ((moom.sZ)(__stackOp3989_19_0)).t = ((double)((((moom.sZ)(__stackOp3989_19_0)).t * 0x1.3333333333333p-1d)));
    moom.sZ __stackOp3989_22_0 = this;
    ((moom.sZ)(__stackOp3989_22_0)).v = ((double)((((moom.sZ)(__stackOp3989_22_0)).v * 0x1.3333333333333p-1d)));
    }
    forwardValue3989_91_0 = moom.rV.b(((net.minecraft.entity.EntityLivingBase)(this)));
    }
    life8_106 = forwardValue3989_91_0;
    if (!((life8_106 > 0))) {
        break forward_join_99;
    }
    ((net.minecraft.entity.Entity)(p0)).b(((int)((life8_106 * 4))));
    }
    ((moom.sZ)(this)).a(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.Entity)(p0)));
    }
    forwardValue3989_104_0 = life7_41;
    }
    return ((forwardValue3989_104_0) != 0);
}


protected java.lang.String c__String() {
return "game.hostile.hurt";
}


protected java.lang.String h__String() {
return "game.hostile.die";
}


protected boolean d__Boolean() {
return ((1) != 0);
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9043_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6520;
      if (vb[var3] == null) {
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
         long var5 = ub[var3];
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
         Object[] var9 = (Object[])wb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               wb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sZ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         vb[var3] = var15;
      }

      return vb[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_4bceb961e14d6d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected java.lang.String d__String() {
return "game.hostile.swim";
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue3987_18_0;
    int forwardValue3987_27_0;
    boolean spill3987_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.entity.Entity life6_31;
    forward_join_27: {
    forward_join_26: {
    forward_join_18: {
    forward_join_14: {
    life3_3 = (moom.sZ.ib ^ 15275222193935L);
    life5_5 = moom.vN.b();
    spill3987_0 = ((moom.sZ)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == null))) {
        forwardValue3987_18_0 = ((spill3987_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3987_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue3987_18_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue3987_27_0 = forwardValue3987_18_0;
        break forward_join_27;
    }
    if (!((forwardValue3987_18_0 != 0))) {
        break forward_join_26;
    }
    life6_31 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    return ((1) != 0);
    }
    forwardValue3987_27_0 = 0;
    }
    return ((forwardValue3987_27_0) != 0);
}


protected java.lang.String a__String(int p0) {
long local2 = (moom.sZ.ib ^ 101792154373507L);
    return ((p0 > 4) ? "game.hostile.hurt.fall.big" : "game.hostile.hurt.fall.small");
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((moom.sZ)(this)).a__vE())).b(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f)));
    return;
}


public float a__sourceReturn_8d24afb582(moom.DT p0) {
return (0x1.0p-1f - ((net.minecraft.world.World)(this.i)).a(((moom.DT)(p0))));
}


public static void k(int p0) {
b4 = ((int)(p0));
    return;
}


public void g__Void() {
net.minecraft.world.World forwardValue3990_18_0;
    moom.sZ forwardValue3990_22_0;
    net.minecraft.entity.Entity[] spill3990_0;
    net.minecraft.world.World spill3990_1;
    moom.sZ spill3990_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life1_3 = (moom.sZ.ib ^ 104314905606393L);
    spill3990_0 = moom.vN.b();
    super.g__Void();
    life3_7 = spill3990_0;
    spill3990_1 = this.i;
    if (!((life3_7 == null))) {
        forwardValue3990_18_0 = spill3990_1;
        break forward_join_18;
    }
    if (!((!((net.minecraft.world.World)(spill3990_1)).G))) {
        break forward_join_23;
    }
    spill3990_2 = this;
    if (!((life3_7 == null))) {
        forwardValue3990_22_0 = spill3990_2;
        break forward_join_22;
    }
    forwardValue3990_18_0 = ((moom.sZ)(spill3990_2)).i;
    }
    if (!((((net.minecraft.world.World)(forwardValue3990_18_0)).a__bB() == net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break forward_join_23;
    }
    forwardValue3990_22_0 = this;
    }
    ((moom.sZ)(forwardValue3990_22_0)).f__Void();
    }
    return;
}


public static int q__sourceReturn_8abf5c6871() {
return moom.sZ.b4;
}


public static int r__sourceReturn_8abf5c6871() {
int local0 = __sourceExactCall_ea2573d3bcb2e3();
    if ((local0 == 0)) {
        return 42;
    }
    return 0;
}


public boolean N__Boolean() {
moom.sZ forwardValue3986_14_0;
    int forwardValue3986_20_0;
    int forwardValue3986_24_0;
    int forwardValue3986_26_0;
    moom.sZ spill3986_0;
    boolean spill3986_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    forward_join_14: {
    life1_3 = (moom.sZ.ib ^ 41029236017267L);
    life3_5 = moom.vN.b();
    spill3986_0 = this;
    if (!((life3_5 == null))) {
        forwardValue3986_14_0 = spill3986_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.world.World)(((moom.sZ)(spill3986_0)).i)).a__bB() != net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break forward_join_25;
    }
    forwardValue3986_14_0 = this;
    }
    spill3986_1 = ((moom.sZ)(forwardValue3986_14_0)).ab();
    if (!((life3_5 == null))) {
        forwardValue3986_20_0 = ((spill3986_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill3986_1)) {
        break forward_join_25;
    }
    forwardValue3986_20_0 = ((super.N__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue3986_24_0 = forwardValue3986_20_0;
        break forward_join_24;
    }
    if (!((forwardValue3986_20_0 != 0))) {
        break forward_join_25;
    }
    forwardValue3986_24_0 = 1;
    }
    forwardValue3986_26_0 = forwardValue3986_24_0;
    break forward_join_26;
    }
    forwardValue3986_26_0 = 0;
    }
    return ((forwardValue3986_26_0) != 0);
}


protected boolean ab() {
int forwardValue3988_39_0;
    int forwardValue3988_68_0;
    int forwardValue3988_80_0;
    int forwardValue3988_82_0;
    net.minecraft.entity.Entity[] spill3988_0;
    int spill3988_1;
    boolean spill3988_2;
    long life1_3;
    moom.DT life4_15;
    net.minecraft.entity.Entity[] life3_16;
    int life5_44;
    int life6_57;
    forward_join_82: {
    forward_join_81: {
    forward_join_80: {
    forward_join_68: {
    forward_join_67: {
    forward_join_39: {
    forward_join_35: {
    life1_3 = (moom.sZ.ib ^ 2280926816857L);
    spill3988_0 = moom.vN.b();
    life4_15 = new moom.DT(this.n, ((moom.CA)(((moom.sZ)(this)).b())).c, this.p);
    life3_16 = spill3988_0;
    spill3988_1 = ((net.minecraft.world.World)(this.i)).b(((net.minecraft.world.EnumSkyBlock)(net.minecraft.world.EnumSkyBlock.SKY)), ((moom.DT)(life4_15)));
    if (!((life3_16 == null))) {
        forwardValue3988_39_0 = spill3988_1;
        break forward_join_39;
    }
    if (!((spill3988_1 > ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_cbe0a5f620c8_invokedynamic3988_10(2572, (3729307358703849535L ^ life1_3)))))))) {
        break forward_join_35;
    }
    return ((0) != 0);
    }
    forwardValue3988_39_0 = ((net.minecraft.world.World)(this.i)).b(((moom.DT)(life4_15)));
    }
    life5_44 = forwardValue3988_39_0;
    spill3988_2 = ((net.minecraft.world.World)(this.i)).f__Boolean();
    if (!((life3_16 == null))) {
        forwardValue3988_68_0 = ((spill3988_2) ? 1 : 0);
        break forward_join_68;
    }
    if (!(spill3988_2)) {
        break forward_join_67;
    }
    life6_57 = ((net.minecraft.world.World)(this.i)).f();
    ((net.minecraft.world.World)(this.i)).b(((int)(__sourceIntrinsic_cbe0a5f620c8_invokedynamic3988_21(2136, (8124567379976000106L ^ life1_3)))));
    life5_44 = ((net.minecraft.world.World)(this.i)).b(((moom.DT)(life4_15)));
    ((net.minecraft.world.World)(this.i)).b(((int)(life6_57)));
    }
    forwardValue3988_68_0 = life5_44;
    }
    if (!((life3_16 == null))) {
        forwardValue3988_80_0 = forwardValue3988_68_0;
        break forward_join_80;
    }
    if (!((forwardValue3988_68_0 <= ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_cbe0a5f620c8_invokedynamic3988_28(2663, (7656124803234140246L ^ life1_3)))))))) {
        break forward_join_81;
    }
    forwardValue3988_80_0 = 1;
    }
    forwardValue3988_82_0 = forwardValue3988_80_0;
    break forward_join_82;
    }
    forwardValue3988_82_0 = 0;
    }
    return ((forwardValue3988_82_0) != 0);
}


public void G() {
long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    float life4_11;
    life1_3 = (moom.sZ.ib ^ 23065024970117L);
    net.minecraft.entity.Entity[] spill3985_0 = moom.vN.b();
    ((moom.sZ)(this)).C();
    life3_7 = spill3985_0;
    life4_11 = ((moom.sZ)(this)).a(((float)(0x1.0p0f)));
    if ((life3_7 == null)) {
        if ((recovery.source.CarrierOps.fcmpl(((float)(life4_11)), ((float)(0x1.0p-1f))) > 0)) {
        moom.sZ __stackOp3985_5_0 = this;
        ((moom.sZ)(__stackOp3985_5_0)).a_ = ((int)((((moom.sZ)(__stackOp3985_5_0)).a_ + 2)));
    }
        super.G();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_c698b0facc29cdce_originalDynamicSite3286_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9043_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbe0a5f620c8_invokedynamic3988_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbe0a5f620c8_invokedynamic3988_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbe0a5f620c8_invokedynamic3988_28(int a0, long a1) throws E;

private static native int __sourceExactCall_4bceb961e14d6d(int p0, long p1);
private static native int __sourceExactCall_ea2573d3bcb2e3();
}
