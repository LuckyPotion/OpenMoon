package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class vh extends moom.uc {

private final net.minecraft.entity.monster.EntityGuardian c;

private int d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public vh(net.minecraft.entity.monster.EntityGuardian p0) {
super();
    this.c = p0;
    (this).a(3);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(6143440221712590477L)), ((long)(2921108537149889072L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(246452387291366L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.vh.e ^ 8123415333088L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1627_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1627_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1627_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1627_14 = new byte[8];
    (__sourceSpill1627_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1627_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1627_16 = __sourceSpill1627_14;
    ((javax.crypto.Cipher)(__sourceSpill1627_11)).init(((int)(__sourceSpill1627_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1627_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1627_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\025]\034\001rìn½¸Ç"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1627_25 = local6_life21;
        int __sourceSpill1627_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1627_25)).substring(((int)(__sourceSpill1627_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1627_30 = local8_life19;
        int __sourceSpill1627_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1627_33 = new byte[8];
        (__sourceSpill1627_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1627_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1627_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1627_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1627_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1627_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1627_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1627_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1627_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1627_34)).doFinal(((byte[])(__sourceSpill1627_33)));
        (__sourceSpill1627_30)[__sourceSpill1627_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\025þZ\tc=Ñ1\006#¼cX\r&*"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1627_38 = local6_life21;
        int __sourceSpill1627_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1627_38)).substring(((int)(__sourceSpill1627_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1627_43 = local8_life19;
        int __sourceSpill1627_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1627_46 = new byte[8];
        (__sourceSpill1627_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1627_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1627_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1627_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1627_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1627_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1627_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1627_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1627_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1627_47)).doFinal(((byte[])(__sourceSpill1627_46)));
        (__sourceSpill1627_43)[__sourceSpill1627_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public void b__Void() {
__sourceExactCall_826f7e3e624c61(((net.minecraft.entity.monster.EntityGuardian)(this.c)), ((int)(0)));
    ((net.minecraft.entity.monster.EntityGuardian)(this.c)).c(((net.minecraft.entity.EntityLivingBase)(null)));
    ((moom.u6)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).cc)).d__sourceReturn_da8c82d5d4();
    return;
}


public boolean b__Boolean() {
int forwardValue4320_14_0;
    int forwardValue4320_29_0;
    int forwardValue4320_31_0;
    boolean spill4320_0;
    int spill4320_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_14: {
    life1_3 = (moom.vh.e ^ 138561772385437L);
    life3_5 = moom.vN.b();
    spill4320_0 = super.b__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4320_14_0 = ((spill4320_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill4320_0)) {
        break forward_join_30;
    }
    forwardValue4320_14_0 = ((((net.minecraft.entity.monster.EntityGuardian)(this.c)).ad()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4320_29_0 = forwardValue4320_14_0;
        break forward_join_29;
    }
    if (!((forwardValue4320_14_0 == 0))) {
        break forward_join_28;
    }
    spill4320_1 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).a(((net.minecraft.entity.Entity)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).d__sourceReturn_d30556f370()))))), ((double)(0x1.2p3d)));
    if (!((life3_5 == null))) {
        forwardValue4320_29_0 = spill4320_1;
        break forward_join_29;
    }
    if (!((spill4320_1 > 0))) {
        break forward_join_30;
    }
    }
    forwardValue4320_29_0 = 1;
    }
    forwardValue4320_31_0 = forwardValue4320_29_0;
    break forward_join_31;
    }
    forwardValue4320_31_0 = 0;
    }
    return ((forwardValue4320_31_0) != 0);
}


public void c() {
int forestValue942_42_0;
    int forestValue942_67_0;
    net.minecraft.entity.monster.EntityGuardian forestValue942_89_0;
    int forestValue942_117_0;
    int forestValue942_133_0;
    int forestValue942_133_1;
    moom.vh forestValue942_144_0;
    net.minecraft.entity.Entity[] spill942_0;
    boolean spill942_1;
    int spill942_2;
    net.minecraft.entity.monster.EntityGuardian spill942_3;
    boolean spill942_4;
    moom.vh spill942_5;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_7;
    net.minecraft.entity.Entity[] life3_13;
    float life5_81;
    forest_join_145: {
    forest_join_144: {
    forest_join_143: {
    forest_join_133: {
    forest_join_124: {
    forest_join_117: {
    forest_join_97: {
    forest_join_89: {
    forest_join_87: {
    forest_join_67: {
    forest_join_65: {
    forest_join_42: {
    forest_join_34: {
    life1_3 = (moom.vh.e ^ 47410318349886L);
    life4_7 = ((net.minecraft.entity.monster.EntityGuardian)(this.c)).d__sourceReturn_d30556f370();
    spill942_0 = moom.vN.b();
    ((moom.AV)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).a__sourceReturn_407923443b())).c();
    life3_13 = spill942_0;
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).a__vt())).a(((net.minecraft.entity.Entity)(life4_7)), ((float)(0x1.68p6f)), ((float)(0x1.68p6f)));
    spill942_1 = ((net.minecraft.entity.monster.EntityGuardian)(this.c)).d__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(life4_7)));
    if (!((life3_13 == null))) {
        forestValue942_42_0 = ((spill942_1) ? 1 : 0);
        break forest_join_42;
    }
    if (!((!spill942_1))) {
        break forest_join_34;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(this.c)).c(((net.minecraft.entity.EntityLivingBase)(null)));
    if (!((life3_13 != null))) {
        break forest_join_145;
    }
    }
    moom.vh __stackOp942_15_0 = this;
    ((moom.vh)(__stackOp942_15_0)).d = ((int)((((moom.vh)(__stackOp942_15_0)).d + 1)));
    forestValue942_42_0 = this.d;
    }
    if (!((life3_13 == null))) {
        forestValue942_67_0 = forestValue942_42_0;
        break forest_join_67;
    }
    if (!((forestValue942_42_0 == 0))) {
        break forest_join_65;
    }
    __sourceExactCall_826f7e3e624c61(((net.minecraft.entity.monster.EntityGuardian)(this.c)), ((int)(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).d__sourceReturn_d30556f370())).e__Int())));
    ((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).i)).a(((net.minecraft.entity.Entity)(this.c)), ((byte)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic942_27(11725, (725381913828713461L ^ life1_3)))));
    if (!((life3_13 != null))) {
        break forest_join_143;
    }
    }
    forestValue942_67_0 = this.d;
    }
    spill942_2 = ((net.minecraft.entity.monster.EntityGuardian)(this.c)).s();
    if (!((life3_13 == null))) {
        forestValue942_133_0 = forestValue942_67_0;
        forestValue942_133_1 = spill942_2;
        break forest_join_133;
    }
    if (!((forestValue942_67_0 >= spill942_2))) {
        break forest_join_124;
    }
    life5_81 = 0x1.0p0f;
    spill942_3 = this.c;
    if (!((life3_13 == null))) {
        forestValue942_89_0 = spill942_3;
        break forest_join_89;
    }
    if (!((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityGuardian)(spill942_3)).i)).a__bB() == net.minecraft.world.EnumDifficulty.HARD))) {
        break forest_join_87;
    }
    life5_81 = (life5_81 + 0x1.0p1f);
    }
    forestValue942_89_0 = this.c;
    }
    spill942_4 = ((net.minecraft.entity.monster.EntityGuardian)(forestValue942_89_0)).ad();
    if (!((life3_13 == null))) {
        forestValue942_117_0 = ((spill942_4) ? 1 : 0);
        break forest_join_117;
    }
    if (!(spill942_4)) {
        break forest_join_97;
    }
    life5_81 = (life5_81 + 0x1.0p1f);
    }
    ((net.minecraft.entity.EntityLivingBase)(life4_7)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.b(((net.minecraft.entity.Entity)(this.c)), ((net.minecraft.entity.Entity)(this.c))))), ((float)(life5_81)));
    forestValue942_117_0 = ((((net.minecraft.entity.EntityLivingBase)(life4_7)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this.c))))), ((float)(((float) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).b()))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue942_117_0);
    ((net.minecraft.entity.monster.EntityGuardian)(this.c)).c(((net.minecraft.entity.EntityLivingBase)(null)));
    if (!((life3_13 != null))) {
        break forest_join_143;
    }
    }
    spill942_5 = this;
    if (!((life3_13 == null))) {
        forestValue942_144_0 = spill942_5;
        break forest_join_144;
    }
    forestValue942_133_0 = ((moom.vh)(spill942_5)).d;
    forestValue942_133_1 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic942_55(12095, (8209292760871624966L ^ life1_3));
    }
    if (!((forestValue942_133_0 >= forestValue942_133_1))) {
        break forest_join_143;
    }
    if (!(((this.d % __sourceIntrinsic_5b7380e7aa7c_invokedynamic942_57(72, (6222217456408415858L ^ life1_3))) == 0))) {
        break forest_join_143;
    }
    }
    forestValue942_144_0 = this;
    }
    __sourceIntrinsic_5b7380e7aa7c_call942_58(forestValue942_144_0);
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9491_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/vh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.vh.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15615;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/vh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4319_15_0;
    int forwardValue4319_20_0;
    int forwardValue4319_22_0;
    net.minecraft.entity.Entity[] spill4319_0;
    net.minecraft.entity.EntityLivingBase spill4319_1;
    boolean spill4319_2;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    net.minecraft.entity.Entity[] life3_9;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_15: {
    life1_3 = (moom.vh.e ^ 24971430992908L);
    spill4319_0 = moom.vN.b();
    life4_8 = ((net.minecraft.entity.monster.EntityGuardian)(this.c)).d__sourceReturn_d30556f370();
    life3_9 = spill4319_0;
    spill4319_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue4319_15_0 = spill4319_1;
        break forward_join_15;
    }
    if (!((spill4319_1 != null))) {
        break forward_join_21;
    }
    forwardValue4319_15_0 = life4_8;
    }
    spill4319_2 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4319_15_0)).p__Boolean();
    if (!((life3_9 == null))) {
        forwardValue4319_20_0 = ((spill4319_2) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4319_2)) {
        break forward_join_21;
    }
    forwardValue4319_20_0 = 1;
    }
    forwardValue4319_22_0 = forwardValue4319_20_0;
    break forward_join_22;
    }
    forwardValue4319_22_0 = 0;
    }
    return ((forwardValue4319_22_0) != 0);
}


public void a__Void() {
long local1 = (moom.vh.e ^ 18255264130096L);
    this.d = ((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1687_1(7654, (3789043542088114643L ^ local1))));
    ((moom.AV)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).a__sourceReturn_407923443b())).c();
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).a__vt())).a(((net.minecraft.entity.Entity)(((net.minecraft.entity.monster.EntityGuardian)(this.c)).d__sourceReturn_d30556f370())), ((float)(0x1.68p6f)), ((float)(0x1.68p6f)));
    ((net.minecraft.entity.monster.EntityGuardian)(this.c)).ad = ((boolean)(true));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9491_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1687_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic942_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic942_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic942_57(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_5b7380e7aa7c_call942_58(moom.vh a0) throws E;

private static native void __sourceExactCall_826f7e3e624c61(net.minecraft.entity.monster.EntityGuardian p0, int p1);
}
