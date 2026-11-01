package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class u5 extends moom.uc {

private final net.minecraft.entity.passive.EntityVillager c;

private net.minecraft.entity.passive.EntityVillager d;

private final net.minecraft.world.World e;

private int f;

net.minecraft.village.Village g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public u5(net.minecraft.entity.passive.EntityVillager p0) {
super();
    this.c = p0;
    this.e = p0.i;
    (this).a(3);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-7224500874352232719L)), ((long)(-8827554865028611071L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(108685515604535L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.u5.h ^ 76187503265039L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1575_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1575_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1575_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1575_14 = new byte[8];
    (__sourceSpill1575_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1575_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1575_16 = __sourceSpill1575_14;
    ((javax.crypto.Cipher)(__sourceSpill1575_11)).init(((int)(__sourceSpill1575_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1575_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1575_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Þ¾b->óm£\004ù\003\024Òº-(-|Ý>éò¯ãJÑtÒ¦úk*dK³\\\002"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1575_25 = local6_life21;
        int __sourceSpill1575_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1575_25)).substring(((int)(__sourceSpill1575_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1575_30 = local8_life19;
        int __sourceSpill1575_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1575_33 = new byte[8];
        (__sourceSpill1575_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1575_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1575_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1575_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1575_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1575_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1575_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1575_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1575_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1575_34)).doFinal(((byte[])(__sourceSpill1575_33)));
        (__sourceSpill1575_30)[__sourceSpill1575_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "7ót\020BdøªâTß¾Ã"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1575_38 = local6_life21;
        int __sourceSpill1575_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1575_38)).substring(((int)(__sourceSpill1575_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1575_43 = local8_life19;
        int __sourceSpill1575_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1575_46 = new byte[8];
        (__sourceSpill1575_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1575_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1575_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1575_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1575_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1575_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1575_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1575_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1575_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1575_47)).doFinal(((byte[])(__sourceSpill1575_46)));
        (__sourceSpill1575_43)[__sourceSpill1575_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


public void b__Void() {
this.g = ((net.minecraft.village.Village)(null));
    this.d = ((net.minecraft.entity.passive.EntityVillager)(null));
    ((net.minecraft.entity.passive.EntityVillager)(this.c)).n(((boolean)(false)));
    return;
}


public boolean b__Boolean() {
int forwardValue4122_13_0;
    int forwardValue4122_19_0;
    int forwardValue4122_26_0;
    int forwardValue4122_30_0;
    int forwardValue4122_32_0;
    int spill4122_0;
    long life1_3;
    int life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_26: {
    forward_join_19: {
    forward_join_13: {
    life1_3 = (moom.u5.h ^ 89717890002954L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4122_0 = this.f;
    if (!((life3_5 != 0))) {
        forwardValue4122_13_0 = spill4122_0;
        break forward_join_13;
    }
    if (!((spill4122_0 >= 0))) {
        break forward_join_31;
    }
    forwardValue4122_13_0 = ((this.f()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4122_19_0 = forwardValue4122_13_0;
        break forward_join_19;
    }
    if (!((forwardValue4122_13_0 != 0))) {
        break forward_join_31;
    }
    forwardValue4122_19_0 = ((net.minecraft.entity.passive.EntityVillager)(this.c)).q__sourceReturn_8abf5c6871();
    }
    if (!((life3_5 != 0))) {
        forwardValue4122_26_0 = forwardValue4122_19_0;
        break forward_join_26;
    }
    if (!((forwardValue4122_19_0 == 0))) {
        break forward_join_31;
    }
    forwardValue4122_26_0 = ((((net.minecraft.entity.passive.EntityVillager)(this.c)).a__sourceReturn_e5b9dbd68d(((boolean)(false)))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4122_30_0 = forwardValue4122_26_0;
        break forward_join_30;
    }
    if (!((forwardValue4122_26_0 != 0))) {
        break forward_join_31;
    }
    forwardValue4122_30_0 = 1;
    }
    forwardValue4122_32_0 = forwardValue4122_30_0;
    break forward_join_32;
    }
    forwardValue4122_32_0 = 0;
    }
    return ((forwardValue4122_32_0) != 0);
}


public void c() {
int forwardValue4123_42_0;
    int forwardValue4123_64_0;
    moom.u5 forwardValue4123_66_0;
    boolean spill4123_0;
    int spill4123_1;
    boolean spill4123_2;
    moom.u5 spill4123_3;
    long life1_3;
    int life3_11;
    forward_join_75: {
    forward_join_66: {
    forward_join_64: {
    forward_join_53: {
    forward_join_42: {
    forward_join_40: {
    life1_3 = (moom.u5.h ^ 4960366449321L);
    spill4123_0 = moom.uc.d();
    moom.u5 __stackOp4123_2_0 = this;
    ((moom.u5)(__stackOp4123_2_0)).f = ((int)((((moom.u5)(__stackOp4123_2_0)).f - 1)));
    life3_11 = ((spill4123_0) ? 1 : 0);
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.passive.EntityVillager)(this.c)).a__vt())).a(((net.minecraft.entity.Entity)(this.d)), ((float)(0x1.4p3f)), ((float)(0x1.ep4f)));
    spill4123_1 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.passive.EntityVillager)(this.c)).a(((net.minecraft.entity.Entity)(this.d))))), ((double)(0x1.2p1d)));
    if (!((life3_11 != 0))) {
        forwardValue4123_42_0 = spill4123_1;
        break forward_join_42;
    }
    if (!((spill4123_1 > 0))) {
        break forward_join_40;
    }
    ((moom.AV)(((net.minecraft.entity.passive.EntityVillager)(this.c)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(this.d)), ((double)(0x1.0p-2d)));
    if (!((life3_11 == 0))) {
        break forward_join_53;
    }
    }
    forwardValue4123_42_0 = this.f;
    }
    if (!((life3_11 != 0))) {
        forwardValue4123_64_0 = forwardValue4123_42_0;
        break forward_join_64;
    }
    if (!((forwardValue4123_42_0 == 0))) {
        break forward_join_53;
    }
    spill4123_2 = ((net.minecraft.entity.passive.EntityVillager)(this.d)).ad();
    if (!((life3_11 != 0))) {
        forwardValue4123_64_0 = ((spill4123_2) ? 1 : 0);
        break forward_join_64;
    }
    if (!(spill4123_2)) {
        break forward_join_53;
    }
    this.d__sourceReturn_da8c82d5d4();
    }
    spill4123_3 = this;
    if (!((life3_11 != 0))) {
        forwardValue4123_66_0 = spill4123_3;
        break forward_join_66;
    }
    forwardValue4123_64_0 = ((java.util.Random)(((net.minecraft.entity.passive.EntityVillager)(((moom.u5)(spill4123_3)).c)).a__Random())).nextInt(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4123_25(29395, (7172319893334179830L ^ life1_3)))));
    }
    if (!((forwardValue4123_64_0 == 0))) {
        break forward_join_75;
    }
    forwardValue4123_66_0 = this;
    }
    ((net.minecraft.world.World)(((moom.u5)(forwardValue4123_66_0)).e)).a(((net.minecraft.entity.Entity)(this.c)), ((byte)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4123_29(236, (3454139114292006346L ^ life1_3)))));
    }
    return;
}


private boolean f() {
int forwardValue4124_22_0;
    int forwardValue4124_31_0;
    int forwardValue4124_33_0;
    boolean spill4124_0;
    int spill4124_1;
    long life1_3;
    int life3_5;
    int life4_27;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_22: {
    forward_join_14: {
    life1_3 = (moom.u5.h ^ 13350876232043L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4124_0 = ((net.minecraft.village.Village)(this.g)).b__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4124_22_0 = ((spill4124_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill4124_0))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue4124_22_0 = ((int) (((double) ((float) ((net.minecraft.village.Village)(this.g)).b())) * 0x1.6666666666666p-2d));
    }
    life4_27 = forwardValue4124_22_0;
    spill4124_1 = ((net.minecraft.village.Village)(this.g)).d();
    if (!((life3_5 == 0))) {
        forwardValue4124_31_0 = spill4124_1;
        break forward_join_31;
    }
    if (!((spill4124_1 < life4_27))) {
        break forward_join_32;
    }
    forwardValue4124_31_0 = 1;
    }
    forwardValue4124_33_0 = forwardValue4124_31_0;
    break forward_join_33;
    }
    forwardValue4124_33_0 = 0;
    }
    return ((forwardValue4124_33_0) != 0);
}


private void d__sourceReturn_da8c82d5d4() {
long local1 = (moom.u5.h ^ 119062003571713L);
    net.minecraft.entity.passive.EntityVillager local3 = ((net.minecraft.entity.passive.EntityVillager)(this.c)).a__sV(((moom.sJ)(this.d)));
    ((net.minecraft.entity.passive.EntityVillager)(this.d)).l(((int)(__sourceIntrinsic_6cce62949456_originalDynamicSite1668_5(29646, (5878774483812724807L ^ local1)))));
    ((net.minecraft.entity.passive.EntityVillager)(this.c)).l(((int)(__sourceIntrinsic_6cce62949456_originalDynamicSite1668_8(22696, (5542066791814142756L ^ local1)))));
    ((net.minecraft.entity.passive.EntityVillager)(this.d)).p(((boolean)(false)));
    ((net.minecraft.entity.passive.EntityVillager)(this.c)).p(((boolean)(false)));
    ((net.minecraft.entity.passive.EntityVillager)(local3)).l(((int)(__sourceIntrinsic_6cce62949456_originalDynamicSite1668_14(30901, (2888981847567842109L ^ local1)))));
    ((net.minecraft.entity.passive.EntityVillager)(local3)).c(((double)(((net.minecraft.entity.passive.EntityVillager)(this.c)).n)), ((double)(((net.minecraft.entity.passive.EntityVillager)(this.c)).o)), ((double)(((net.minecraft.entity.passive.EntityVillager)(this.c)).p)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.world.World)(this.e)).b__Boolean(((net.minecraft.entity.Entity)(local3)));
    ((net.minecraft.world.World)(this.e)).a(((net.minecraft.entity.Entity)(local3)), ((byte)(__sourceIntrinsic_6cce62949456_originalDynamicSite1668_26(10421, (1863130878118128447L ^ local1)))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16353;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/u5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.u5.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9255_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/u5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4121_25_0;
    moom.u5 forwardValue4121_41_0;
    moom.u5 forwardValue4121_48_0;
    net.minecraft.entity.passive.EntityVillager forwardValue4121_85_0;
    int forwardValue4121_93_0;
    int forwardValue4121_97_0;
    int forwardValue4121_99_0;
    int forwardValue4121_101_0;
    int spill4121_0;
    moom.u5 spill4121_1;
    boolean spill4121_2;
    boolean spill4121_3;
    net.minecraft.entity.passive.EntityVillager spill4121_4;
    int spill4121_5;
    long life1_3;
    int life3_5;
    net.minecraft.entity.passive.EntityVillager life4_97;
    forward_join_101: {
    forward_join_100: {
    forward_join_99: {
    forward_join_98: {
    forward_join_97: {
    forward_join_93: {
    forward_join_85: {
    forward_join_80: {
    forward_join_48: {
    forward_join_47: {
    forward_join_41: {
    forward_join_28: {
    forward_join_25: {
    forward_join_14: {
    life1_3 = (moom.u5.h ^ 62854204512411L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4121_0 = ((net.minecraft.entity.passive.EntityVillager)(this.c)).q__sourceReturn_8abf5c6871();
    if (!((life3_5 != 0))) {
        forwardValue4121_25_0 = spill4121_0;
        break forward_join_25;
    }
    if (!((spill4121_0 != 0))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    spill4121_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue4121_41_0 = spill4121_1;
        break forward_join_41;
    }
    forwardValue4121_25_0 = ((java.util.Random)(((net.minecraft.entity.passive.EntityVillager)(((moom.u5)(spill4121_1)).c)).a__Random())).nextInt(((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4121_8(21433, (1790701173198754984L ^ life1_3)))));
    }
    if (!((forwardValue4121_25_0 != 0))) {
        break forward_join_28;
    }
    return ((0) != 0);
    }
    this.g = ((net.minecraft.village.Village)(((moom.EG)(((net.minecraft.world.World)(this.e)).a__EG())).a(((moom.DT)(new moom.DT(this.c))), ((int)(0)))));
    forwardValue4121_41_0 = this;
    }
    if (!((life3_5 != 0))) {
        forwardValue4121_48_0 = forwardValue4121_41_0;
        break forward_join_48;
    }
    if (!((((moom.u5)(forwardValue4121_41_0)).g == null))) {
        break forward_join_47;
    }
    return ((0) != 0);
    }
    forwardValue4121_48_0 = this;
    }
    spill4121_2 = ((moom.u5)(forwardValue4121_48_0)).f();
    if (!((life3_5 != 0))) {
        forwardValue4121_101_0 = ((spill4121_2) ? 1 : 0);
        break forward_join_101;
    }
    if (!(spill4121_2)) {
        break forward_join_100;
    }
    spill4121_3 = ((net.minecraft.entity.passive.EntityVillager)(this.c)).a__sourceReturn_e5b9dbd68d(((boolean)(true)));
    if (!((life3_5 != 0))) {
        forwardValue4121_101_0 = ((spill4121_3) ? 1 : 0);
        break forward_join_101;
    }
    if (!(spill4121_3)) {
        break forward_join_100;
    }
    life4_97 = ((net.minecraft.entity.passive.EntityVillager)(((net.minecraft.world.World)(this.e)).a(((java.lang.Class)(net.minecraft.entity.passive.EntityVillager.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.passive.EntityVillager)(this.c)).b())).b(((double)(0x1.0p3d)), ((double)(0x1.8p1d)), ((double)(0x1.0p3d))))), ((net.minecraft.entity.Entity)(this.c)))));
    spill4121_4 = life4_97;
    if (!((life3_5 != 0))) {
        forwardValue4121_85_0 = spill4121_4;
        break forward_join_85;
    }
    if (!((spill4121_4 == null))) {
        break forward_join_80;
    }
    return ((0) != 0);
    }
    this.d = ((net.minecraft.entity.passive.EntityVillager)(life4_97));
    forwardValue4121_85_0 = this.d;
    }
    spill4121_5 = ((net.minecraft.entity.passive.EntityVillager)(forwardValue4121_85_0)).q__sourceReturn_8abf5c6871();
    if (!((life3_5 != 0))) {
        forwardValue4121_93_0 = spill4121_5;
        break forward_join_93;
    }
    if (!((spill4121_5 == 0))) {
        break forward_join_98;
    }
    forwardValue4121_93_0 = ((((net.minecraft.entity.passive.EntityVillager)(this.d)).a__sourceReturn_e5b9dbd68d(((boolean)(true)))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4121_97_0 = forwardValue4121_93_0;
        break forward_join_97;
    }
    if (!((forwardValue4121_93_0 != 0))) {
        break forward_join_98;
    }
    forwardValue4121_97_0 = 1;
    }
    forwardValue4121_99_0 = forwardValue4121_97_0;
    break forward_join_99;
    }
    forwardValue4121_99_0 = 0;
    }
    return ((forwardValue4121_99_0) != 0);
    }
    forwardValue4121_101_0 = 0;
    }
    return ((forwardValue4121_101_0) != 0);
}


public void a__Void() {
long local1 = (moom.u5.h ^ 69295493537959L);
    this.f = ((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1669_1(10260, (4261536064017749821L ^ local1))));
    ((net.minecraft.entity.passive.EntityVillager)(this.c)).n(((boolean)(true)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4123_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4123_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1668_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1668_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1668_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1668_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9255_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4121_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1669_1(int a0, long a1) throws E;
}
