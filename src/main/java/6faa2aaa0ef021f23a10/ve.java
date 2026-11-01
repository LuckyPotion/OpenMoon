package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class ve extends moom.uc {

private final net.minecraft.entity.monster.EntityGhast c;

public int d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public ve(net.minecraft.entity.monster.EntityGhast p0) {
super();
    this.c = p0;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-597777347915415624L)), ((long)(2410450893535933456L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(185254928111041L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ve.e ^ 88564594569377L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1626_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1626_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1626_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1626_14 = new byte[8];
    (__sourceSpill1626_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1626_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1626_16 = __sourceSpill1626_14;
    ((javax.crypto.Cipher)(__sourceSpill1626_11)).init(((int)(__sourceSpill1626_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1626_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1626_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "3ÝPñ!Si<j¹\016s´BÕkK¦}$Ð-/\013\002=á x"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1626_25 = local6_life21;
        int __sourceSpill1626_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1626_25)).substring(((int)(__sourceSpill1626_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1626_30 = local8_life19;
        int __sourceSpill1626_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1626_33 = new byte[8];
        (__sourceSpill1626_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1626_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1626_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1626_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1626_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1626_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1626_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1626_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1626_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1626_34)).doFinal(((byte[])(__sourceSpill1626_33)));
        (__sourceSpill1626_30)[__sourceSpill1626_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¹»ÞE)MÆb7üëËðÓã"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1626_38 = local6_life21;
        int __sourceSpill1626_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1626_38)).substring(((int)(__sourceSpill1626_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1626_43 = local8_life19;
        int __sourceSpill1626_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1626_46 = new byte[8];
        (__sourceSpill1626_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1626_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1626_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1626_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1626_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1626_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1626_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1626_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1626_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1626_47)).doFinal(((byte[])(__sourceSpill1626_46)));
        (__sourceSpill1626_43)[__sourceSpill1626_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


public void b__Void() {
((net.minecraft.entity.monster.EntityGhast)(this.c)).l(((boolean)(false)));
    return;
}


public void c() {
int forwardValue4316_71_0;
    int forwardValue4316_71_1;
    int forwardValue4316_206_0;
    moom.ve forwardValue4316_214_0;
    net.minecraft.entity.monster.EntityGhast forwardValue4316_226_0;
    int forwardValue4316_226_1;
    net.minecraft.entity.monster.EntityGhast forwardValue4316_227_0;
    net.minecraft.entity.monster.EntityGhast forwardValue4316_228_0;
    int forwardValue4316_228_1;
    net.minecraft.entity.Entity[] spill4316_0;
    int spill4316_1;
    boolean spill4316_2;
    int spill4316_3;
    int spill4316_4;
    moom.ve spill4316_5;
    net.minecraft.entity.monster.EntityGhast spill4316_6;
    int spill4316_7;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_7;
    double life5_10;
    net.minecraft.entity.Entity[] life3_11;
    net.minecraft.world.World life7_42;
    double life8_88;
    moom.DR life10_93;
    double life11_105;
    double life13_128;
    double life15_140;
    moom.tO life17_164;
    forward_join_228: {
    forward_join_227: {
    forward_join_226: {
    forward_join_214: {
    forward_join_213: {
    forward_join_206: {
    forward_join_202: {
    forward_join_200: {
    forward_join_71: {
    forward_join_64: {
    life1_3 = (moom.ve.e ^ 126943593567352L);
    life4_7 = ((net.minecraft.entity.monster.EntityGhast)(this.c)).d__sourceReturn_d30556f370();
    spill4316_0 = moom.vN.b();
    life5_10 = 0x1.0p6d;
    life3_11 = spill4316_0;
    spill4316_1 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.EntityLivingBase)(life4_7)).a(((net.minecraft.entity.Entity)(this.c))))), ((double)((life5_10 * life5_10))));
    if (!((life3_11 == null))) {
        forwardValue4316_206_0 = spill4316_1;
        break forward_join_206;
    }
    if (!((spill4316_1 < 0))) {
        break forward_join_202;
    }
    spill4316_2 = ((net.minecraft.entity.monster.EntityGhast)(this.c)).d__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(life4_7)));
    if (!((life3_11 == null))) {
        forwardValue4316_206_0 = ((spill4316_2) ? 1 : 0);
        break forward_join_206;
    }
    if (!(spill4316_2)) {
        break forward_join_202;
    }
    life7_42 = ((net.minecraft.entity.monster.EntityGhast)(this.c)).i;
    moom.ve __stackOp4316_12_0 = this;
    ((moom.ve)(__stackOp4316_12_0)).d = ((int)((((moom.ve)(__stackOp4316_12_0)).d + 1)));
    spill4316_3 = this.d;
    spill4316_4 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_16(31954, (4916373089644850779L ^ life1_3));
    if (!((life3_11 == null))) {
        forwardValue4316_71_0 = spill4316_3;
        forwardValue4316_71_1 = spill4316_4;
        break forward_join_71;
    }
    if (!((spill4316_3 == spill4316_4))) {
        break forward_join_64;
    }
    ((net.minecraft.world.World)(life7_42)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_17(25171, (144111895124422873L ^ life1_3)))), ((moom.DT)(new moom.DT(this.c))), ((int)(0)));
    }
    forwardValue4316_71_0 = this.d;
    forwardValue4316_71_1 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_21(17247, (4184309713252454864L ^ life1_3));
    }
    if (!((forwardValue4316_71_0 == forwardValue4316_71_1))) {
        break forward_join_200;
    }
    life8_88 = 0x1.0p2d;
    life10_93 = ((net.minecraft.entity.monster.EntityGhast)(this.c)).a__DR(((float)(0x1.0p0f)));
    life11_105 = (((net.minecraft.entity.EntityLivingBase)(life4_7)).n - (((net.minecraft.entity.monster.EntityGhast)(this.c)).n + (((moom.DR)(life10_93)).a * life8_88)));
    life13_128 = ((((moom.CA)(((net.minecraft.entity.EntityLivingBase)(life4_7)).b())).c + ((double) (((net.minecraft.entity.EntityLivingBase)(life4_7)).H / 0x1.0p1f))) - ((0x1.0p-1d + ((net.minecraft.entity.monster.EntityGhast)(this.c)).o) + ((double) (((net.minecraft.entity.monster.EntityGhast)(this.c)).H / 0x1.0p1f))));
    life15_140 = (((net.minecraft.entity.EntityLivingBase)(life4_7)).p - (((net.minecraft.entity.monster.EntityGhast)(this.c)).p + (((moom.DR)(life10_93)).c * life8_88)));
    ((net.minecraft.world.World)(life7_42)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_39(8391, (7853550073793147465L ^ life1_3)))), ((moom.DT)(new moom.DT(this.c))), ((int)(0)));
    life17_164 = new moom.tO(life7_42, this.c, life11_105, life13_128, life15_140);
    ((moom.tO)(life17_164)).aP = ((int)(((net.minecraft.entity.monster.EntityGhast)(this.c)).o__sourceReturn_8abf5c6871()));
    ((moom.tO)(life17_164)).n = ((double)((((net.minecraft.entity.monster.EntityGhast)(this.c)).n + (((moom.DR)(life10_93)).a * life8_88))));
    ((moom.tO)(life17_164)).o = ((double)(((((net.minecraft.entity.monster.EntityGhast)(this.c)).o + ((double) (((net.minecraft.entity.monster.EntityGhast)(this.c)).H / 0x1.0p1f))) + 0x1.0p-1d)));
    ((moom.tO)(life17_164)).p = ((double)((((net.minecraft.entity.monster.EntityGhast)(this.c)).p + (((moom.DR)(life10_93)).c * life8_88))));
    ((net.minecraft.world.World)(life7_42)).b__Boolean(((net.minecraft.entity.Entity)(life17_164)));
    this.d = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_60(23457, (5766034434413463850L ^ life1_3))));
    }
    if (!((life3_11 != null))) {
        break forward_join_213;
    }
    }
    spill4316_5 = this;
    if (!((life3_11 == null))) {
        forwardValue4316_214_0 = spill4316_5;
        break forward_join_214;
    }
    forwardValue4316_206_0 = ((moom.ve)(spill4316_5)).d;
    }
    if (!((forwardValue4316_206_0 > 0))) {
        break forward_join_213;
    }
    moom.ve __stackOp4316_63_0 = this;
    ((moom.ve)(__stackOp4316_63_0)).d = ((int)((((moom.ve)(__stackOp4316_63_0)).d - 1)));
    }
    forwardValue4316_214_0 = this;
    }
    spill4316_6 = ((moom.ve)(forwardValue4316_214_0)).c;
    spill4316_7 = this.d;
    if (!((life3_11 == null))) {
        forwardValue4316_226_0 = spill4316_6;
        forwardValue4316_226_1 = spill4316_7;
        break forward_join_226;
    }
    if (!((spill4316_7 > __sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_68(10715, (3161253433740491603L ^ life1_3))))) {
        forwardValue4316_227_0 = spill4316_6;
        break forward_join_227;
    }
    forwardValue4316_226_0 = spill4316_6;
    forwardValue4316_226_1 = 1;
    }
    forwardValue4316_228_0 = forwardValue4316_226_0;
    forwardValue4316_228_1 = forwardValue4316_226_1;
    break forward_join_228;
    }
    forwardValue4316_228_0 = forwardValue4316_227_0;
    forwardValue4316_228_1 = 0;
    }
    ((net.minecraft.entity.monster.EntityGhast)(forwardValue4316_228_0)).l(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4316_228_1))));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ve.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8270;
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
            throw new RuntimeException("moom/ve", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9486_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ve"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
long local1 = (moom.ve.e ^ 86710384074314L);
    return ((((((net.minecraft.entity.monster.EntityGhast)(this.c)).d__sourceReturn_d30556f370() != null) ? 1 : 0)) != 0);
}


public void a__Void() {
this.d = ((int)(0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4316_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9486_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
