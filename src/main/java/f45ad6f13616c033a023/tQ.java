package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tQ extends net.minecraft.entity.projectile.EntityFireball {

private static final long cb;

private static final long[] hb;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public tQ(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6) {
super(p0, p1, p2, p3, p4, p5, p6);
    (this).a__Void(0x1.4000000000000p-2f, 0x1.4000000000000p-2f);
}


public tQ(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, double p2, double p3, double p4) {
super(p0, p1, p2, p3, p4);
    (this).a__Void(0x1.4000000000000p-2f, 0x1.4000000000000p-2f);
}


public tQ(net.minecraft.world.World p0) {
super(p0);
    (this).a__Void(0x1.4000000000000p-2f, 0x1.4000000000000p-2f);
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-1575829819785087185L)), ((long)(3836479517101660012L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(18343470791716L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tQ.cb ^ 104414565234972L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1559_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1559_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1559_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1559_14 = new byte[8];
    (__sourceSpill1559_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1559_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1559_16 = __sourceSpill1559_14;
    ((javax.crypto.Cipher)(__sourceSpill1559_11)).init(((int)(__sourceSpill1559_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1559_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1559_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "4ñ¡åÙ\023~Iëgæ½z"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1559_25 = local6_life21;
        int __sourceSpill1559_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1559_25)).substring(((int)(__sourceSpill1559_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1559_30 = local8_life19;
        int __sourceSpill1559_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1559_33 = new byte[8];
        (__sourceSpill1559_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1559_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1559_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1559_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1559_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1559_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1559_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1559_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1559_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1559_34)).doFinal(((byte[])(__sourceSpill1559_33)));
        (__sourceSpill1559_30)[__sourceSpill1559_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "`C\177B)ï`°ö\022ä=«ôBÜ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1559_38 = local6_life21;
        int __sourceSpill1559_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1559_38)).substring(((int)(__sourceSpill1559_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1559_43 = local8_life19;
        int __sourceSpill1559_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1559_46 = new byte[8];
        (__sourceSpill1559_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1559_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1559_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1559_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1559_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1559_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1559_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1559_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1559_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1559_47)).doFinal(((byte[])(__sourceSpill1559_46)));
        (__sourceSpill1559_43)[__sourceSpill1559_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean b__sourceReturn_aae029aa0a() {
int forwardValue4068_19_0;
    int forwardValue4068_21_0;
    byte spill4068_0;
    long life1_3;
    int[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.tQ.cb ^ 23586254817743L);
    life3_5 = moom.h1.a__ArrayInt();
    spill4068_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_5f5fadf1ff21_invokedynamic4068_3(28243, (2924526129152135966L ^ life1_3)))));
    if (!((life3_5 != null))) {
        forwardValue4068_19_0 = ((int)(spill4068_0));
        break forward_join_19;
    }
    if (!((spill4068_0 == 1))) {
        break forward_join_20;
    }
    forwardValue4068_19_0 = 1;
    }
    forwardValue4068_21_0 = forwardValue4068_19_0;
    break forward_join_21;
    }
    forwardValue4068_21_0 = 0;
    }
    return ((forwardValue4068_21_0) != 0);
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9166_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25610;
      if (ib[var3] == null) {
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
         long var5 = hb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tQ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tQ.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void h(boolean p0) {
net.minecraft.entity.DataWatcher forwardValue4069_18_0;
    int forwardValue4069_18_1;
    int forwardValue4069_18_2;
    net.minecraft.entity.DataWatcher forwardValue4069_19_0;
    int forwardValue4069_19_1;
    net.minecraft.entity.DataWatcher forwardValue4069_20_0;
    int forwardValue4069_20_1;
    int forwardValue4069_20_2;
    net.minecraft.entity.DataWatcher spill4069_0;
    int spill4069_1;
    boolean spill4069_2;
    long life2_3;
    int[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.tQ.cb ^ 123936775720259L);
    life4_5 = moom.h1.a__ArrayInt();
    spill4069_0 = this.al;
    spill4069_1 = __sourceIntrinsic_8699ed5f13ef_invokedynamic4069_3(7880, (3579815371000325898L ^ life2_3));
    spill4069_2 = p0;
    if (!((life4_5 != null))) {
        forwardValue4069_18_0 = spill4069_0;
        forwardValue4069_18_1 = spill4069_1;
        forwardValue4069_18_2 = ((spill4069_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4069_2)) {
        forwardValue4069_19_0 = spill4069_0;
        forwardValue4069_19_1 = spill4069_1;
        break forward_join_19;
    }
    forwardValue4069_18_0 = spill4069_0;
    forwardValue4069_18_1 = spill4069_1;
    forwardValue4069_18_2 = 1;
    }
    forwardValue4069_20_0 = forwardValue4069_18_0;
    forwardValue4069_20_1 = forwardValue4069_18_1;
    forwardValue4069_20_2 = forwardValue4069_18_2;
    break forward_join_20;
    }
    forwardValue4069_20_0 = forwardValue4069_19_0;
    forwardValue4069_20_1 = forwardValue4069_19_1;
    forwardValue4069_20_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue4069_20_0)).b(((int)(forwardValue4069_20_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue4069_20_2)))))));
    return;
}


protected void d__Void() {
long local1 = (moom.tQ.cb ^ 44360980632134L);
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1652_2(7880, (3579895494236108815L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
return ((0) != 0);
}


protected float a() {
moom.tQ forwardValue4065_14_0;
    float forwardValue4065_15_0;
    moom.tQ spill4065_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.tQ.cb ^ 20725393806258L);
    life3_5 = moom.h1.a__ArrayInt();
    spill4065_0 = this;
    if (!((life3_5 != null))) {
        forwardValue4065_14_0 = spill4065_0;
        break forward_join_14;
    }
    if (!(((moom.tQ)(spill4065_0)).b__sourceReturn_aae029aa0a())) {
        break forward_join_13;
    }
    forwardValue4065_15_0 = 0x1.75c29p-1f;
    break forward_join_15;
    }
    forwardValue4065_14_0 = this;
    }
    forwardValue4065_15_0 = __sourceIntrinsic_76940a5779a0_call4065_3(forwardValue4065_14_0);
    }
    return forwardValue4065_15_0;
}


public float a(moom.Ei p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
int forwardValue4066_23_0;
    int[] spill4066_0;
    boolean spill4066_1;
    long life5_3;
    float life8_11;
    int[] life7_12;
    net.minecraft.block.Block life9_15;
    forward_join_28: {
    forward_join_23: {
    life5_3 = (moom.tQ.cb ^ 43453748483883L);
    spill4066_0 = moom.h1.a__ArrayInt();
    life8_11 = super.a(((moom.Ei)(p0)), ((net.minecraft.world.World)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)));
    life7_12 = spill4066_0;
    life9_15 = ((net.minecraft.block.state.IBlockState)(p3)).a__ch();
    spill4066_1 = ((moom.tQ)(this)).b__sourceReturn_aae029aa0a();
    if (!((life7_12 != null))) {
        forwardValue4066_23_0 = ((spill4066_1) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill4066_1)) {
        break forward_join_28;
    }
    forwardValue4066_23_0 = ((net.minecraft.entity.boss.EntityWither.a(((net.minecraft.block.Block)(life9_15)))) ? 1 : 0);
    }
    if (!((forwardValue4066_23_0 != 0))) {
        break forward_join_28;
    }
    life8_11 = java.lang.Math.min(((float)(0x1.99999ap-1f)), ((float)(life8_11)));
    }
    return life8_11;
}


protected void a(net.minecraft.util.MovingObjectPosition p0) {
net.minecraft.entity.Entity forwardValue4067_14_0;
    net.minecraft.entity.Entity forwardValue4067_50_0;
    int forwardValue4067_57_0;
    int forwardValue4067_61_0;
    net.minecraft.world.EnumDifficulty forwardValue4067_81_0;
    net.minecraft.world.EnumDifficulty forwardValue4067_81_1;
    moom.tQ spill4067_0;
    net.minecraft.entity.EntityLivingBase spill4067_1;
    boolean spill4067_2;
    net.minecraft.world.EnumDifficulty spill4067_3;
    net.minecraft.world.EnumDifficulty spill4067_4;
    long life2_3;
    int[] life4_5;
    int life5_94;
    forward_join_127: {
    forward_join_107: {
    forward_join_88: {
    forward_join_81: {
    forward_join_77: {
    forward_join_61: {
    forward_join_57: {
    forward_join_54: {
    forward_join_50: {
    forward_join_48: {
    forward_join_40: {
    forward_join_14: {
    life2_3 = (moom.tQ.cb ^ 104260739180309L);
    life4_5 = moom.h1.a__ArrayInt();
    spill4067_0 = this;
    if (!((life4_5 != null))) {
        forwardValue4067_14_0 = spill4067_0;
        break forward_join_14;
    }
    if (!((!((net.minecraft.world.World)(((moom.tQ)(spill4067_0)).i)).G))) {
        break forward_join_127;
    }
    forwardValue4067_14_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    }
    if (!((forwardValue4067_14_0 != null))) {
        break forward_join_107;
    }
    spill4067_1 = this.aJ;
    if (!((life4_5 != null))) {
        forwardValue4067_50_0 = spill4067_1;
        break forward_join_50;
    }
    if (!((spill4067_1 != null))) {
        break forward_join_48;
    }
    spill4067_2 = ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(p0)).e)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this.aJ))))), ((float)(0x1.0p3f)));
    if (!((life4_5 != null))) {
        forwardValue4067_57_0 = ((spill4067_2) ? 1 : 0);
        break forward_join_57;
    }
    if (!(spill4067_2)) {
        break forward_join_54;
    }
    if (!((!((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(p0)).e)).p__Boolean()))) {
        break forward_join_40;
    }
    ((net.minecraft.entity.EntityLivingBase)(this.aJ)).c(((float)(0x1.4p2f)));
    if (!((life4_5 == null))) {
        break forward_join_54;
    }
    }
    ((moom.tQ)(this)).a(((net.minecraft.entity.EntityLivingBase)(this.aJ)), ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(p0)).e)));
    if (!((life4_5 == null))) {
        break forward_join_54;
    }
    }
    forwardValue4067_50_0 = ((net.minecraft.util.MovingObjectPosition)(p0)).e;
    }
    ((net.minecraft.entity.Entity)(forwardValue4067_50_0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.l)), ((float)(0x1.4p2f)));
    }
    forwardValue4067_57_0 = ((((net.minecraft.util.MovingObjectPosition)(p0)).e instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue4067_61_0 = forwardValue4067_57_0;
        break forward_join_61;
    }
    if (!((forwardValue4067_57_0 != 0))) {
        break forward_join_107;
    }
    forwardValue4067_61_0 = 0;
    }
    life5_94 = forwardValue4067_61_0;
    spill4067_3 = ((net.minecraft.world.World)(this.i)).a__bB();
    spill4067_4 = net.minecraft.world.EnumDifficulty.NORMAL;
    if (!((life4_5 != null))) {
        forwardValue4067_81_0 = spill4067_3;
        forwardValue4067_81_1 = spill4067_4;
        break forward_join_81;
    }
    if (!((spill4067_3 == spill4067_4))) {
        break forward_join_77;
    }
    life5_94 = __sourceIntrinsic_791342a704ed_invokedynamic4067_26(7880, (3579835551523163484L ^ life2_3));
    if (!((life4_5 == null))) {
        break forward_join_88;
    }
    }
    forwardValue4067_81_0 = ((net.minecraft.world.World)(this.i)).a__bB();
    forwardValue4067_81_1 = net.minecraft.world.EnumDifficulty.HARD;
    }
    if (!((forwardValue4067_81_0 == forwardValue4067_81_1))) {
        break forward_join_88;
    }
    life5_94 = __sourceIntrinsic_791342a704ed_invokedynamic4067_30(21860, (5943746596934747889L ^ life2_3));
    }
    if (!((life5_94 > 0))) {
        break forward_join_107;
    }
    ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.util.MovingObjectPosition)(p0)).e)))).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.w)).I, (__sourceIntrinsic_791342a704ed_invokedynamic4067_35(19266, (2843525046463207636L ^ life2_3)) * life5_94), 1))));
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)(0x1.0p0f)), ((boolean)(false)), ((boolean)(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing"))))));
    ((moom.tQ)(this)).f__Void();
    }
    return;
}


public boolean m__Boolean() {
return ((0) != 0);
}


public boolean r__Boolean() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_5f5fadf1ff21_invokedynamic4068_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9166_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8699ed5f13ef_invokedynamic4069_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1652_2(int a0, long a1) throws E;

private static native <E extends Throwable> float __sourceIntrinsic_76940a5779a0_call4065_3(moom.tQ a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_791342a704ed_invokedynamic4067_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_791342a704ed_invokedynamic4067_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_791342a704ed_invokedynamic4067_35(int a0, long a1) throws E;
}
