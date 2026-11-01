package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class uz extends moom.uc {

private final moom.sK c;

net.minecraft.world.World d;

private moom.sK e;

int f;

double g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public uz(moom.sK p0, double p1) {
super();
    this.c = p0;
    this.d = p0.i;
    this.g = p1;
    (this).a(3);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-5999559133515370731L)), ((long)(-4581436334247552887L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(18434853238770L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uz.h ^ 7164834560427L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1611_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1611_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1611_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1611_14 = new byte[8];
    (__sourceSpill1611_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1611_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1611_16 = __sourceSpill1611_14;
    ((javax.crypto.Cipher)(__sourceSpill1611_11)).init(((int)(__sourceSpill1611_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1611_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1611_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ün¡¯/ë`³ÀÝ\r\177Q¾\001ÈÜX\001ñcÆz,F§FvãvÓßd\nh©ç"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1611_25 = local6_life21;
        int __sourceSpill1611_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1611_25)).substring(((int)(__sourceSpill1611_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1611_30 = local8_life19;
        int __sourceSpill1611_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1611_33 = new byte[8];
        (__sourceSpill1611_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1611_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1611_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1611_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1611_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1611_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1611_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1611_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1611_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1611_34)).doFinal(((byte[])(__sourceSpill1611_33)));
        (__sourceSpill1611_30)[__sourceSpill1611_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ç\020:\026ó1\025\bÜêTiÍìq"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1611_38 = local6_life21;
        int __sourceSpill1611_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1611_38)).substring(((int)(__sourceSpill1611_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1611_43 = local8_life19;
        int __sourceSpill1611_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1611_46 = new byte[8];
        (__sourceSpill1611_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1611_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1611_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1611_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1611_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1611_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1611_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1611_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1611_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1611_47)).doFinal(((byte[])(__sourceSpill1611_46)));
        (__sourceSpill1611_43)[__sourceSpill1611_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


public void b__Void() {
this.e = ((moom.sK)(null));
    this.f = ((int)(0));
    return;
}


public boolean b__Boolean() {
int forwardValue4255_15_0;
    int forwardValue4255_20_0;
    int forwardValue4255_29_0;
    int forwardValue4255_31_0;
    boolean spill4255_0;
    long life1_3;
    int life3_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_20: {
    forward_join_15: {
    life1_3 = (moom.uz.h ^ 114866603944950L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4255_0 = ((moom.sK)(this.e)).p__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4255_15_0 = ((spill4255_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill4255_0)) {
        break forward_join_30;
    }
    forwardValue4255_15_0 = ((((moom.sK)(this.e)).ad()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue4255_20_0 = forwardValue4255_15_0;
        break forward_join_20;
    }
    if (!((forwardValue4255_15_0 != 0))) {
        break forward_join_30;
    }
    forwardValue4255_20_0 = this.f;
    }
    if (!((life3_5 == 0))) {
        forwardValue4255_29_0 = forwardValue4255_20_0;
        break forward_join_29;
    }
    if (!((forwardValue4255_20_0 < __sourceIntrinsic_74e88f4b4822_invokedynamic4255_10(31759, (8001263144252416196L ^ life1_3))))) {
        break forward_join_30;
    }
    forwardValue4255_29_0 = 1;
    }
    forwardValue4255_31_0 = forwardValue4255_29_0;
    break forward_join_31;
    }
    forwardValue4255_31_0 = 0;
    }
    return ((forwardValue4255_31_0) != 0);
}


public void c() {
int forwardValue4256_51_0;
    moom.uz forwardValue4256_53_0;
    boolean spill4256_0;
    int spill4256_1;
    moom.uz spill4256_2;
    long life1_3;
    int life3_25;
    forward_join_54: {
    forward_join_53: {
    forward_join_51: {
    life1_3 = (moom.uz.h ^ 67497710061909L);
    spill4256_0 = moom.uc.e();
    ((net.minecraft.entity.ai.EntityLookHelper)(((moom.sK)(this.c)).a__vt())).a(((net.minecraft.entity.Entity)(this.e)), ((float)(0x1.4p3f)), ((float)(((float) ((moom.sK)(this.c)).m__Int()))));
    ((moom.AV)(((moom.sK)(this.c)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(this.e)), ((double)(this.g)));
    life3_25 = ((spill4256_0) ? 1 : 0);
    moom.uz __stackOp4256_14_0 = this;
    ((moom.uz)(__stackOp4256_14_0)).f = ((int)((((moom.uz)(__stackOp4256_14_0)).f + 1)));
    spill4256_1 = this.f;
    if (!((life3_25 == 0))) {
        forwardValue4256_51_0 = spill4256_1;
        break forward_join_51;
    }
    if (!((spill4256_1 >= __sourceIntrinsic_5b7380e7aa7c_invokedynamic4256_18(2746, (3981586409689199825L ^ life1_3))))) {
        break forward_join_54;
    }
    spill4256_2 = this;
    if (!((life3_25 == 0))) {
        forwardValue4256_53_0 = spill4256_2;
        break forward_join_53;
    }
    forwardValue4256_51_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.sK)(((moom.uz)(spill4256_2)).c)).a(((net.minecraft.entity.Entity)(this.e))))), ((double)(0x1.2p3d)));
    }
    if (!((forwardValue4256_51_0 < 0))) {
        break forward_join_54;
    }
    forwardValue4256_53_0 = this;
    }
    ((moom.uz)(forwardValue4256_53_0)).d__sourceReturn_da8c82d5d4();
    }
    return;
}


private void d__sourceReturn_da8c82d5d4() {
net.minecraft.entity.player.EntityPlayer lexicalValue1340_33_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1340_37_0;
    int lexicalValue1340_94_0;
    int lexicalValue1340_226_0;
    boolean spill1340_0;
    net.minecraft.entity.player.EntityPlayer spill1340_1;
    net.minecraft.entity.player.EntityPlayer spill1340_2;
    int spill1340_3;
    boolean spill1340_4;
    long life1_3;
    moom.sJ life4_10;
    int life3_11;
    net.minecraft.entity.player.EntityPlayer life5_17;
    java.util.Random life6_116;
    int life7_118;
    double life8_130;
    double life10_135;
    double life12_140;
    double life14_155;
    double life16_165;
    double life18_180;
    lexical_join_227: {
    lexical_join_226: {
    lexical_join_192: {
    lexical_join_94: {
    lexical_join_48: {
    lexical_join_37: {
    lexical_join_33: {
    lexical_join_32: {
    life1_3 = (moom.uz.h ^ 112656967990324L);
    spill1340_0 = moom.uc.d();
    life4_10 = ((moom.sK)(this.c)).a(((moom.sJ)(this.e)));
    life3_11 = ((spill1340_0) ? 1 : 0);
    if (!((life4_10 != null))) {
        break lexical_join_227;
    }
    life5_17 = ((moom.sK)(this.c)).a__sourceReturn_5ebddff30c();
    spill1340_1 = life5_17;
    if (!((life3_11 != 0))) {
        lexicalValue1340_33_0 = spill1340_1;
        break lexical_join_33;
    }
    if (!((spill1340_1 == null))) {
        break lexical_join_32;
    }
    spill1340_2 = ((moom.sK)(this.e)).a__sourceReturn_5ebddff30c();
    if (!((life3_11 != 0))) {
        lexicalValue1340_33_0 = spill1340_2;
        break lexical_join_33;
    }
    if (!((spill1340_2 != null))) {
        break lexical_join_32;
    }
    life5_17 = ((moom.sK)(this.e)).a__sourceReturn_5ebddff30c();
    }
    lexicalValue1340_33_0 = life5_17;
    }
    if (!((life3_11 != 0))) {
        lexicalValue1340_37_0 = lexicalValue1340_33_0;
        break lexical_join_37;
    }
    if (!((lexicalValue1340_33_0 != null))) {
        break lexical_join_48;
    }
    lexicalValue1340_37_0 = life5_17;
    }
    ((net.minecraft.entity.player.EntityPlayer)(lexicalValue1340_37_0)).a(((moom.BY)(net.minecraft.stats.StatList.A)));
    spill1340_3 = ((this.c instanceof moom.sM) ? 1 : 0);
    if (!((life3_11 != 0))) {
        lexicalValue1340_94_0 = spill1340_3;
        break lexical_join_94;
    }
    if (!((spill1340_3 != 0))) {
        break lexical_join_48;
    }
    ((net.minecraft.entity.player.EntityPlayer)(life5_17)).a(((moom.BY)(net.minecraft.stats.AchievementList.H)));
    }
    ((moom.sK)(this.c)).l(((int)(__sourceIntrinsic_6cce62949456_invokedynamic1340_19(28238, (537942510445889L ^ life1_3)))));
    ((moom.sK)(this.e)).l(((int)(__sourceIntrinsic_6cce62949456_invokedynamic1340_22(23896, (4377311967407085142L ^ life1_3)))));
    ((moom.sK)(this.c)).Y__sourceReturn_da8c82d5d4();
    ((moom.sK)(this.e)).Y__sourceReturn_da8c82d5d4();
    ((moom.sJ)(life4_10)).l(((int)(__sourceIntrinsic_6cce62949456_invokedynamic1340_28(22419, (8919253139937336472L ^ life1_3)))));
    ((moom.sJ)(life4_10)).c(((double)(((moom.sK)(this.c)).n)), ((double)(((moom.sK)(this.c)).o)), ((double)(((moom.sK)(this.c)).p)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    lexicalValue1340_94_0 = ((((net.minecraft.world.World)(this.d)).b__Boolean(((net.minecraft.entity.Entity)(life4_10)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1340_94_0);
    life6_116 = ((moom.sK)(this.c)).a__Random();
    life7_118 = 0;
    lexical_cycle_101: while (true) {
    if (!((life7_118 < __sourceIntrinsic_6cce62949456_invokedynamic1340_43(4814, (1740710784548592066L ^ life1_3))))) {
        break lexical_join_192;
    }
    life8_130 = (((java.util.Random)(life6_116)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life10_135 = (((java.util.Random)(life6_116)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life12_140 = (((java.util.Random)(life6_116)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life14_155 = (((((java.util.Random)(life6_116)).nextDouble() * ((double) ((moom.sK)(this.c)).G)) * 0x1.0p1d) - ((double) ((moom.sK)(this.c)).G));
    life16_165 = (0x1.0p-1d + (((java.util.Random)(life6_116)).nextDouble() * ((double) ((moom.sK)(this.c)).H)));
    life18_180 = (((((java.util.Random)(life6_116)).nextDouble() * ((double) ((moom.sK)(this.c)).G)) * 0x1.0p1d) - ((double) ((moom.sK)(this.c)).G));
    ((net.minecraft.world.World)(this.d)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.HEART)), ((double)((((moom.sK)(this.c)).n + life14_155))), ((double)((((moom.sK)(this.c)).o + life16_165))), ((double)((((moom.sK)(this.c)).p + life18_180))), ((double)(life8_130)), ((double)(life10_135)), ((double)(life12_140)), ((int[])(new int[0])));
    life7_118 += 1;
    if (!((life3_11 != 0))) {
        break lexical_join_227;
    }
    if (!((life3_11 == 0))) { continue lexical_cycle_101; }
    break lexical_cycle_101;
    }
    }
    spill1340_4 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.d)).a__Ej())).a__Boolean(((java.lang.String)("doMobLoot")));
    if (!((life3_11 != 0))) {
        lexicalValue1340_226_0 = ((spill1340_4) ? 1 : 0);
        break lexical_join_226;
    }
    if (!(spill1340_4)) {
        break lexical_join_227;
    }
    lexicalValue1340_226_0 = ((((net.minecraft.world.World)(this.d)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(this.d, ((moom.sK)(this.c)).n, ((moom.sK)(this.c)).o, ((moom.sK)(this.c)).p, (((java.util.Random)(life6_116)).nextInt(((int)(__sourceIntrinsic_6cce62949456_invokedynamic1340_81(15468, (6762518187044403044L ^ life1_3))))) + 1)))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1340_226_0);
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9414_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19630;
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
            throw new RuntimeException("moom/uz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
moom.sK forwardValue4254_20_0;
    int forwardValue4254_24_0;
    moom.sK spill4254_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_20: {
    forward_join_14: {
    life1_3 = (moom.uz.h ^ 872002159463L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4254_0 = this.c;
    if (!((life3_5 != 0))) {
        forwardValue4254_20_0 = spill4254_0;
        break forward_join_20;
    }
    if (!((!((moom.sK)(spill4254_0)).ad()))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    this.e = ((moom.sK)(((moom.uz)(this)).a__sourceReturn_a406d8ce65()));
    forwardValue4254_20_0 = this.e;
    }
    if (!((forwardValue4254_20_0 != null))) {
        break forward_join_23;
    }
    forwardValue4254_24_0 = 1;
    break forward_join_24;
    }
    forwardValue4254_24_0 = 0;
    }
    return ((forwardValue4254_24_0) != 0);
}


private moom.sK a__sourceReturn_a406d8ce65() {
int lexicalValue1339_56_0;
    double lexicalValue1339_63_0;
    moom.sK lexicalValue1339_67_0;
    boolean spill1339_0;
    moom.sK spill1339_1;
    boolean spill1339_2;
    double spill1339_3;
    long life1_3;
    float life4_5;
    java.util.List life5_22;
    double life6_24;
    moom.sK life8_27;
    java.util.Iterator life9_30;
    int life3_31;
    moom.sK life10_38;
    lexical_join_67: {
    lexical_join_66: {
    life1_3 = (moom.uz.h ^ 8204794717077L);
    life4_5 = 0x1.0p3f;
    life5_22 = ((net.minecraft.world.World)(this.d)).a(((java.lang.Class)(((java.lang.Object)(this.c)).getClass())), ((moom.CA)(((moom.CA)(((moom.sK)(this.c)).b())).b(((double)(((double) life4_5))), ((double)(((double) life4_5))), ((double)(((double) life4_5)))))));
    life6_24 = 0x1.fffffffffffffp1023d;
    spill1339_0 = moom.uc.d();
    life8_27 = null;
    life9_30 = ((java.util.List)(life5_22)).iterator();
    life3_31 = ((spill1339_0) ? 1 : 0);
    lexical_cycle_32: while (true) {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_56: {
    if (!(((java.util.Iterator)(life9_30)).hasNext())) {
        break lexical_join_66;
    }
    life10_38 = ((moom.sK)(((java.util.Iterator)(life9_30)).next()));
    spill1339_1 = this.c;
    if (!((life3_31 != 0))) {
        lexicalValue1339_67_0 = spill1339_1;
        break lexical_join_67;
    }
    spill1339_2 = ((moom.sK)(spill1339_1)).a(((moom.sK)(life10_38)));
    if (!((life3_31 != 0))) {
        lexicalValue1339_56_0 = ((spill1339_2) ? 1 : 0);
        break lexical_join_56;
    }
    if (!(spill1339_2)) {
        break lexical_join_64;
    }
    spill1339_3 = ((moom.sK)(this.c)).a(((net.minecraft.entity.Entity)(life10_38)));
    if (!((life3_31 != 0))) {
        lexicalValue1339_63_0 = spill1339_3;
        break lexical_join_63;
    }
    lexicalValue1339_56_0 = recovery.source.CarrierOps.dcmpg(((double)(spill1339_3)), ((double)(life6_24)));
    }
    if (!((lexicalValue1339_56_0 < 0))) {
        break lexical_join_64;
    }
    life8_27 = life10_38;
    lexicalValue1339_63_0 = ((moom.sK)(this.c)).a(((net.minecraft.entity.Entity)(life10_38)));
    }
    life6_24 = lexicalValue1339_63_0;
    }
    if (!((life3_31 == 0))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    lexicalValue1339_67_0 = life8_27;
    }
    return lexicalValue1339_67_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic4255_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4256_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic1340_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic1340_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic1340_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic1340_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic1340_81(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9414_0() throws E;
}
