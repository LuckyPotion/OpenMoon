package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class vb extends moom.uc {

private final net.minecraft.entity.monster.EntityBlaze c;

private int d;

private int e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public vb(net.minecraft.entity.monster.EntityBlaze p0) {
super();
    this.c = p0;
    (this).a(3);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(3013436309395476349L)), ((long)(721622996524233977L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(249822099478162L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.vb.f ^ 43445736870622L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1623_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1623_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1623_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1623_14 = new byte[8];
    (__sourceSpill1623_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1623_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1623_16 = __sourceSpill1623_14;
    ((javax.crypto.Cipher)(__sourceSpill1623_11)).init(((int)(__sourceSpill1623_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1623_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1623_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Õá\003Xé|ìDYÂ£ª\023QE\013õ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1623_25 = local6_life21;
        int __sourceSpill1623_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1623_25)).substring(((int)(__sourceSpill1623_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1623_30 = local8_life19;
        int __sourceSpill1623_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1623_33 = new byte[8];
        (__sourceSpill1623_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1623_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1623_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1623_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1623_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1623_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1623_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1623_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1623_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1623_34)).doFinal(((byte[])(__sourceSpill1623_33)));
        (__sourceSpill1623_30)[__sourceSpill1623_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "c%\033\nû\007\005C4U\036·ò\n"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1623_38 = local6_life21;
        int __sourceSpill1623_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1623_38)).substring(((int)(__sourceSpill1623_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1623_43 = local8_life19;
        int __sourceSpill1623_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1623_46 = new byte[8];
        (__sourceSpill1623_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1623_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1623_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1623_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1623_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1623_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1623_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1623_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1623_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1623_47)).doFinal(((byte[])(__sourceSpill1623_46)));
        (__sourceSpill1623_43)[__sourceSpill1623_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


public void b__Void() {
((net.minecraft.entity.monster.EntityBlaze)(this.c)).l(((boolean)(false)));
    return;
}


public void c() {
moom.vb lexicalValue1361_45_0;
    int lexicalValue1361_62_0;
    double lexicalValue1361_68_0;
    double lexicalValue1361_68_1;
    int lexicalValue1361_133_0;
    int lexicalValue1361_133_1;
    moom.vb lexicalValue1361_154_0;
    moom.vb lexicalValue1361_254_0;
    net.minecraft.entity.Entity[] spill1361_0;
    int spill1361_1;
    moom.vb spill1361_2;
    double spill1361_3;
    double spill1361_4;
    moom.vb spill1361_5;
    int spill1361_6;
    int spill1361_7;
    moom.vb spill1361_8;
    moom.vb spill1361_9;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_13;
    double life5_19;
    net.minecraft.entity.Entity[] life3_20;
    double life7_90;
    double life9_111;
    double life11_118;
    float life13_216;
    int life14_244;
    moom.tP life15_275;
    lexical_join_277: {
    lexical_join_262: {
    lexical_join_260: {
    lexical_join_254: {
    lexical_join_253: {
    lexical_join_157: {
    lexical_join_154: {
    lexical_join_143: {
    lexical_join_133: {
    lexical_join_128: {
    lexical_join_68: {
    lexical_join_62: {
    lexical_join_57: {
    lexical_join_45: {
    lexical_join_44: {
    life1_3 = (moom.vb.f ^ 112694564869223L);
    moom.vb __stackOp1361_1_0 = this;
    ((moom.vb)(__stackOp1361_1_0)).e = ((int)((((moom.vb)(__stackOp1361_1_0)).e - 1)));
    life4_13 = ((net.minecraft.entity.monster.EntityBlaze)(this.c)).d__sourceReturn_d30556f370();
    spill1361_0 = moom.vN.b();
    life5_19 = ((net.minecraft.entity.monster.EntityBlaze)(this.c)).a(((net.minecraft.entity.Entity)(life4_13)));
    life3_20 = spill1361_0;
    spill1361_1 = recovery.source.CarrierOps.dcmpg(((double)(life5_19)), ((double)(0x1.0p2d)));
    if (!((life3_20 == null))) {
        lexicalValue1361_62_0 = spill1361_1;
        break lexical_join_62;
    }
    if (!((spill1361_1 < 0))) {
        break lexical_join_57;
    }
    spill1361_2 = this;
    if (!((life3_20 == null))) {
        lexicalValue1361_45_0 = spill1361_2;
        break lexical_join_45;
    }
    if (!((((moom.vb)(spill1361_2)).e <= 0))) {
        break lexical_join_44;
    }
    this.e = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_11(12063, (2886894646182031985L ^ life1_3))));
    ((net.minecraft.entity.monster.EntityBlaze)(this.c)).c__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(life4_13)));
    }
    lexicalValue1361_45_0 = this;
    }
    ((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.monster.EntityBlaze)(((moom.vb)(lexicalValue1361_45_0)).c)).a__vu())).a(((double)(((net.minecraft.entity.EntityLivingBase)(life4_13)).n)), ((double)(((net.minecraft.entity.EntityLivingBase)(life4_13)).o)), ((double)(((net.minecraft.entity.EntityLivingBase)(life4_13)).p)), ((double)(0x1.0p0d)));
    if (!((life3_20 != null))) {
        break lexical_join_277;
    }
    }
    spill1361_3 = life5_19;
    spill1361_4 = 0x1.0p8d;
    if (!((life3_20 == null))) {
        lexicalValue1361_68_0 = spill1361_3;
        lexicalValue1361_68_1 = spill1361_4;
        break lexical_join_68;
    }
    lexicalValue1361_62_0 = recovery.source.CarrierOps.dcmpg(((double)(spill1361_3)), ((double)(spill1361_4)));
    }
    if (!((lexicalValue1361_62_0 < 0))) {
        break lexical_join_262;
    }
    lexicalValue1361_68_0 = ((net.minecraft.entity.EntityLivingBase)(life4_13)).n;
    lexicalValue1361_68_1 = ((net.minecraft.entity.monster.EntityBlaze)(this.c)).n;
    }
    life7_90 = (lexicalValue1361_68_0 - lexicalValue1361_68_1);
    life9_111 = ((((moom.CA)(((net.minecraft.entity.EntityLivingBase)(life4_13)).b())).c + ((double) (((net.minecraft.entity.EntityLivingBase)(life4_13)).H / 0x1.0p1f))) - (((net.minecraft.entity.monster.EntityBlaze)(this.c)).o + ((double) (((net.minecraft.entity.monster.EntityBlaze)(this.c)).H / 0x1.0p1f))));
    life11_118 = (((net.minecraft.entity.EntityLivingBase)(life4_13)).p - ((net.minecraft.entity.monster.EntityBlaze)(this.c)).p);
    spill1361_5 = this;
    if (!((life3_20 == null))) {
        lexicalValue1361_254_0 = spill1361_5;
        break lexical_join_254;
    }
    if (!((((moom.vb)(spill1361_5)).e <= 0))) {
        break lexical_join_253;
    }
    moom.vb __stackOp1361_36_0 = this;
    ((moom.vb)(__stackOp1361_36_0)).d = ((int)((((moom.vb)(__stackOp1361_36_0)).d + 1)));
    spill1361_6 = this.d;
    spill1361_7 = 1;
    if (!((life3_20 == null))) {
        lexicalValue1361_133_0 = spill1361_6;
        lexicalValue1361_133_1 = spill1361_7;
        break lexical_join_133;
    }
    if (!((spill1361_6 == spill1361_7))) {
        break lexical_join_128;
    }
    this.e = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_40(4820, (4066094601447837625L ^ life1_3))));
    ((net.minecraft.entity.monster.EntityBlaze)(this.c)).l(((boolean)(true)));
    if (!((life3_20 != null))) {
        break lexical_join_157;
    }
    }
    spill1361_8 = this;
    if (!((life3_20 == null))) {
        lexicalValue1361_154_0 = spill1361_8;
        break lexical_join_154;
    }
    lexicalValue1361_133_0 = ((moom.vb)(spill1361_8)).d;
    lexicalValue1361_133_1 = 4;
    }
    if (!((lexicalValue1361_133_0 <= lexicalValue1361_133_1))) {
        break lexical_join_143;
    }
    this.e = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_45(19319, (6657777050734253592L ^ life1_3))));
    if (!((life3_20 != null))) {
        break lexical_join_157;
    }
    }
    this.e = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_47(30592, (175936199122086635L ^ life1_3))));
    this.d = ((int)(0));
    lexicalValue1361_154_0 = this;
    }
    ((net.minecraft.entity.monster.EntityBlaze)(((moom.vb)(lexicalValue1361_154_0)).c)).l(((boolean)(false)));
    }
    spill1361_9 = this;
    if (!((life3_20 == null))) {
        lexicalValue1361_254_0 = spill1361_9;
        break lexical_join_254;
    }
    if (!((((moom.vb)(spill1361_9)).d > 1))) {
        break lexical_join_253;
    }
    life13_216 = (moom.Dr.c(((float)(moom.Dr.a__Float(((double)(life5_19)))))) * 0x1.0p-1f);
    ((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityBlaze)(this.c)).i)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_57(12514, (4655658261988650382L ^ life1_3)))), ((moom.DT)(new moom.DT(((int) ((net.minecraft.entity.monster.EntityBlaze)(this.c)).n), ((int) ((net.minecraft.entity.monster.EntityBlaze)(this.c)).o), ((int) ((net.minecraft.entity.monster.EntityBlaze)(this.c)).p)))), ((int)(0)));
    life14_244 = 0;
    lexical_cycle_197: while (true) {
    if (!((life14_244 < 1))) {
        break lexical_join_253;
    }
    life15_275 = new moom.tP(((net.minecraft.entity.monster.EntityBlaze)(this.c)).i, this.c, (life7_90 + (((java.util.Random)(((net.minecraft.entity.monster.EntityBlaze)(this.c)).a__Random())).nextGaussian() * ((double) life13_216))), life9_111, (life11_118 + (((java.util.Random)(((net.minecraft.entity.monster.EntityBlaze)(this.c)).a__Random())).nextGaussian() * ((double) life13_216))));
    ((moom.tP)(life15_275)).o = ((double)(((((net.minecraft.entity.monster.EntityBlaze)(this.c)).o + ((double) (((net.minecraft.entity.monster.EntityBlaze)(this.c)).H / 0x1.0p1f))) + 0x1.0p-1d)));
    ((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityBlaze)(this.c)).i)).b__Boolean(((net.minecraft.entity.Entity)(life15_275)));
    life14_244 += 1;
    if (!((life3_20 == null))) {
        break lexical_join_260;
    }
    if (!((life3_20 != null))) { continue lexical_cycle_197; }
    break lexical_cycle_197;
    }
    }
    lexicalValue1361_254_0 = this;
    }
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.monster.EntityBlaze)(((moom.vb)(lexicalValue1361_254_0)).c)).a__vt())).a(((net.minecraft.entity.Entity)(life4_13)), ((float)(0x1.4p3f)), ((float)(0x1.4p3f)));
    }
    if (!((life3_20 != null))) {
        break lexical_join_277;
    }
    }
    ((moom.AV)(((net.minecraft.entity.monster.EntityBlaze)(this.c)).a__sourceReturn_407923443b())).c();
    ((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.monster.EntityBlaze)(this.c)).a__vu())).a(((double)(((net.minecraft.entity.EntityLivingBase)(life4_13)).n)), ((double)(((net.minecraft.entity.EntityLivingBase)(life4_13)).o)), ((double)(((net.minecraft.entity.EntityLivingBase)(life4_13)).p)), ((double)(0x1.0p0d)));
    }
    super.c();
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.vb.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28586;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/vb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9478_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/vb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4309_15_0;
    int forwardValue4309_20_0;
    int forwardValue4309_22_0;
    net.minecraft.entity.Entity[] spill4309_0;
    net.minecraft.entity.EntityLivingBase spill4309_1;
    boolean spill4309_2;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    net.minecraft.entity.Entity[] life3_9;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_15: {
    life1_3 = (moom.vb.f ^ 100975518473813L);
    spill4309_0 = moom.vN.b();
    life4_8 = ((net.minecraft.entity.monster.EntityBlaze)(this.c)).d__sourceReturn_d30556f370();
    life3_9 = spill4309_0;
    spill4309_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue4309_15_0 = spill4309_1;
        break forward_join_15;
    }
    if (!((spill4309_1 != null))) {
        break forward_join_21;
    }
    forwardValue4309_15_0 = life4_8;
    }
    spill4309_2 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4309_15_0)).p__Boolean();
    if (!((life3_9 == null))) {
        forwardValue4309_20_0 = ((spill4309_2) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4309_2)) {
        break forward_join_21;
    }
    forwardValue4309_20_0 = 1;
    }
    forwardValue4309_22_0 = forwardValue4309_20_0;
    break forward_join_22;
    }
    forwardValue4309_22_0 = 0;
    }
    return ((forwardValue4309_22_0) != 0);
}


public void a__Void() {
this.d = ((int)(0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic1361_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9478_0() throws E;
}
