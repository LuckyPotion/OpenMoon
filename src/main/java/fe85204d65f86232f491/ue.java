package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ue extends moom.uc {

net.minecraft.world.World c;

protected moom.sI d;

int e;

double f;

boolean g;

moom.AT h;

java.lang.Class<? extends net.minecraft.entity.Entity> i;

private int j;

private double k;

private double l;

private double m;

private static final long n;

private static final long[] p;

private static final java.lang.Integer[] q;

private static final java.util.Map r;

public ue(moom.sI p0, java.lang.Class<? extends net.minecraft.entity.Entity> p1, double p2, boolean p3) {
this(p0, p2, p3);
    this.i = p1;
}


public ue(moom.sI p0, double p1, boolean p2) {
super();
    this.d = p0;
    this.c = p0.i;
    this.f = p1;
    this.g = p2;
    (this).a(3);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-222719048351847723L)), ((long)(-1029252787391267864L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189061412933641L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ue.n ^ 73850525712718L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1597_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1597_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1597_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1597_14 = new byte[8];
    (__sourceSpill1597_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1597_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1597_16 = __sourceSpill1597_14;
    ((javax.crypto.Cipher)(__sourceSpill1597_11)).init(((int)(__sourceSpill1597_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1597_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1597_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¨9t~¹e÷\025»¯«¿\030"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1597_25 = local6_life21;
        int __sourceSpill1597_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1597_25)).substring(((int)(__sourceSpill1597_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1597_30 = local8_life19;
        int __sourceSpill1597_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1597_33 = new byte[8];
        (__sourceSpill1597_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1597_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1597_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1597_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1597_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1597_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1597_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1597_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1597_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1597_34)).doFinal(((byte[])(__sourceSpill1597_33)));
        (__sourceSpill1597_30)[__sourceSpill1597_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "æ>\b\031\007o2üáyíQüó"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1597_38 = local6_life21;
        int __sourceSpill1597_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1597_38)).substring(((int)(__sourceSpill1597_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1597_43 = local8_life19;
        int __sourceSpill1597_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1597_46 = new byte[8];
        (__sourceSpill1597_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1597_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1597_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1597_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1597_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1597_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1597_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1597_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1597_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1597_47)).doFinal(((byte[])(__sourceSpill1597_46)));
        (__sourceSpill1597_43)[__sourceSpill1597_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public void b__Void() {
((moom.AV)(((moom.sI)(this.d)).a__sourceReturn_407923443b())).c();
    return;
}


public boolean b__Boolean() {
net.minecraft.entity.EntityLivingBase forestValue940_15_0;
    int forestValue940_21_0;
    int forestValue940_37_0;
    int forestValue940_41_0;
    int forestValue940_43_0;
    boolean spill940_0;
    net.minecraft.entity.EntityLivingBase spill940_1;
    boolean spill940_2;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    int life3_9;
    forest_join_43: {
    forest_join_42: {
    forest_join_41: {
    forest_join_40: {
    forest_join_37: {
    forest_join_30: {
    forest_join_21: {
    forest_join_15: {
    life1_3 = (moom.ue.n ^ 3382117045754L);
    spill940_0 = moom.uc.d();
    life4_8 = ((moom.sI)(this.d)).d__sourceReturn_d30556f370();
    life3_9 = ((spill940_0) ? 1 : 0);
    spill940_1 = life4_8;
    if (!((life3_9 != 0))) {
        forestValue940_15_0 = spill940_1;
        break forest_join_15;
    }
    if (!((spill940_1 != null))) {
        break forest_join_42;
    }
    forestValue940_15_0 = life4_8;
    }
    spill940_2 = ((net.minecraft.entity.EntityLivingBase)(forestValue940_15_0)).p__Boolean();
    if (!((life3_9 != 0))) {
        forestValue940_21_0 = ((spill940_2) ? 1 : 0);
        break forest_join_21;
    }
    if (!(spill940_2)) {
        break forest_join_42;
    }
    forestValue940_21_0 = ((this.g) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forestValue940_37_0 = forestValue940_21_0;
        break forest_join_37;
    }
    if (!((forestValue940_21_0 == 0))) {
        break forest_join_30;
    }
    if (!((!((moom.AV)(((moom.sI)(this.d)).a__sourceReturn_407923443b())).a__Boolean()))) {
        break forest_join_42;
    }
    break forest_join_40;
    }
    forestValue940_37_0 = ((((moom.sI)(this.d)).a__Boolean(((moom.DT)(new moom.DT(life4_8))))) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forestValue940_41_0 = forestValue940_37_0;
        break forest_join_41;
    }
    if (!((forestValue940_37_0 != 0))) {
        break forest_join_42;
    }
    }
    forestValue940_41_0 = 1;
    }
    forestValue940_43_0 = forestValue940_41_0;
    break forest_join_43;
    }
    forestValue940_43_0 = 0;
    }
    return ((forestValue940_43_0) != 0);
}


public void c() {
int forwardValue4199_53_0;
    int forwardValue4199_87_0;
    int forwardValue4199_128_0;
    int forwardValue4199_146_0;
    int forwardValue4199_162_0;
    int forwardValue4199_186_0;
    int forwardValue4199_193_0;
    moom.ue forwardValue4199_202_0;
    moom.sI forwardValue4199_212_0;
    boolean spill4199_0;
    boolean spill4199_1;
    boolean spill4199_2;
    int spill4199_3;
    int spill4199_4;
    int spill4199_5;
    int spill4199_6;
    moom.ue spill4199_7;
    moom.sI spill4199_8;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_7;
    double life5_26;
    double life7_30;
    int life3_31;
    forward_join_215: {
    forward_join_212: {
    forward_join_210: {
    forward_join_202: {
    forward_join_193: {
    forward_join_186: {
    forward_join_175: {
    forward_join_162: {
    forward_join_155: {
    forward_join_146: {
    forward_join_143: {
    forward_join_128: {
    forward_join_99: {
    forward_join_87: {
    forward_join_77: {
    forward_join_53: {
    forward_join_51: {
    life1_3 = (moom.ue.n ^ 94594707847001L);
    life4_7 = ((moom.sI)(this.d)).d__sourceReturn_d30556f370();
    ((net.minecraft.entity.ai.EntityLookHelper)(((moom.sI)(this.d)).a__vt())).a(((net.minecraft.entity.Entity)(life4_7)), ((float)(0x1.ep4f)), ((float)(0x1.ep4f)));
    spill4199_0 = moom.uc.d();
    life5_26 = ((moom.sI)(this.d)).a(((double)(((net.minecraft.entity.EntityLivingBase)(life4_7)).n)), ((double)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(life4_7)).b())).c)), ((double)(((net.minecraft.entity.EntityLivingBase)(life4_7)).p)));
    life7_30 = ((moom.ue)(this)).a(((net.minecraft.entity.EntityLivingBase)(life4_7)));
    life3_31 = ((spill4199_0) ? 1 : 0);
    moom.ue __stackOp4199_15_0 = this;
    ((moom.ue)(__stackOp4199_15_0)).j = ((int)((((moom.ue)(__stackOp4199_15_0)).j - 1)));
    spill4199_1 = this.g;
    if (!((life3_31 != 0))) {
        forwardValue4199_53_0 = ((spill4199_1) ? 1 : 0);
        break forward_join_53;
    }
    if (!((!spill4199_1))) {
        break forward_join_51;
    }
    spill4199_2 = ((net.minecraft.entity.ai.EntitySenses)(((moom.sI)(this.d)).a__vz())).a(((net.minecraft.entity.Entity)(life4_7)));
    if (!((life3_31 != 0))) {
        forwardValue4199_186_0 = ((spill4199_2) ? 1 : 0);
        break forward_join_186;
    }
    if (!(spill4199_2)) {
        break forward_join_175;
    }
    }
    forwardValue4199_53_0 = this.j;
    }
    if (!((life3_31 != 0))) {
        forwardValue4199_186_0 = forwardValue4199_53_0;
        break forward_join_186;
    }
    if (!((forwardValue4199_53_0 <= 0))) {
        break forward_join_175;
    }
    spill4199_3 = recovery.source.CarrierOps.dcmpl(((double)(this.k)), ((double)(0x0.0p0d)));
    if (!((life3_31 != 0))) {
        forwardValue4199_87_0 = spill4199_3;
        break forward_join_87;
    }
    if (!((spill4199_3 == 0))) {
        break forward_join_77;
    }
    spill4199_4 = recovery.source.CarrierOps.dcmpl(((double)(this.l)), ((double)(0x0.0p0d)));
    if (!((life3_31 != 0))) {
        forwardValue4199_87_0 = spill4199_4;
        break forward_join_87;
    }
    if (!((spill4199_4 == 0))) {
        break forward_join_77;
    }
    spill4199_5 = recovery.source.CarrierOps.dcmpl(((double)(this.m)), ((double)(0x0.0p0d)));
    if (!((life3_31 != 0))) {
        forwardValue4199_128_0 = spill4199_5;
        break forward_join_128;
    }
    if (!((spill4199_5 != 0))) {
        break forward_join_99;
    }
    }
    forwardValue4199_87_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLivingBase)(life4_7)).a(((double)(this.k)), ((double)(this.l)), ((double)(this.m))))), ((double)(0x1.0p0d)));
    }
    if (!((life3_31 != 0))) {
        forwardValue4199_128_0 = forwardValue4199_87_0;
        break forward_join_128;
    }
    if (!((forwardValue4199_87_0 < 0))) {
        break forward_join_99;
    }
    spill4199_6 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((moom.sI)(this.d)).a__Random())).nextFloat())), ((float)(0x1.99999ap-5f)));
    if (!((life3_31 != 0))) {
        forwardValue4199_186_0 = spill4199_6;
        break forward_join_186;
    }
    if (!((spill4199_6 < 0))) {
        break forward_join_175;
    }
    }
    this.k = ((double)(((net.minecraft.entity.EntityLivingBase)(life4_7)).n));
    this.l = ((double)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(life4_7)).b())).c));
    this.m = ((double)(((net.minecraft.entity.EntityLivingBase)(life4_7)).p));
    this.j = ((int)((4 + ((java.util.Random)(((moom.sI)(this.d)).a__Random())).nextInt(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4199_49(13958, (4851520061742861742L ^ life1_3))))))));
    forwardValue4199_128_0 = recovery.source.CarrierOps.dcmpl(((double)(life5_26)), ((double)(0x1.0p10d)));
    }
    if (!((life3_31 != 0))) {
        forwardValue4199_146_0 = forwardValue4199_128_0;
        break forward_join_146;
    }
    if (!((forwardValue4199_128_0 > 0))) {
        break forward_join_143;
    }
    moom.ue __stackOp4199_53_0 = this;
    ((moom.ue)(__stackOp4199_53_0)).j = ((int)((((moom.ue)(__stackOp4199_53_0)).j + __sourceIntrinsic_5b7380e7aa7c_invokedynamic4199_55(2183, (8462343028961932204L ^ life1_3)))));
    if (!((life3_31 == 0))) {
        break forward_join_155;
    }
    }
    forwardValue4199_146_0 = recovery.source.CarrierOps.dcmpl(((double)(life5_26)), ((double)(0x1.0p8d)));
    }
    if (!((life3_31 != 0))) {
        forwardValue4199_162_0 = forwardValue4199_146_0;
        break forward_join_162;
    }
    if (!((forwardValue4199_146_0 > 0))) {
        break forward_join_155;
    }
    moom.ue __stackOp4199_58_0 = this;
    ((moom.ue)(__stackOp4199_58_0)).j = ((int)((((moom.ue)(__stackOp4199_58_0)).j + 5)));
    }
    forwardValue4199_162_0 = ((((moom.AV)(((moom.sI)(this.d)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(life4_7)), ((double)(this.f)))) ? 1 : 0);
    }
    if (!((life3_31 != 0))) {
        forwardValue4199_186_0 = forwardValue4199_162_0;
        break forward_join_186;
    }
    if (!((forwardValue4199_162_0 == 0))) {
        break forward_join_175;
    }
    moom.ue __stackOp4199_66_0 = this;
    ((moom.ue)(__stackOp4199_66_0)).j = ((int)((((moom.ue)(__stackOp4199_66_0)).j + __sourceIntrinsic_5b7380e7aa7c_invokedynamic4199_68(26900, (5116917023058170429L ^ life1_3)))));
    }
    this.e = ((int)(java.lang.Math.max(((int)((this.e - 1))), ((int)(0)))));
    forwardValue4199_186_0 = recovery.source.CarrierOps.dcmpg(((double)(life5_26)), ((double)(life7_30)));
    }
    if (!((life3_31 != 0))) {
        forwardValue4199_193_0 = forwardValue4199_186_0;
        break forward_join_193;
    }
    if (!((forwardValue4199_186_0 <= 0))) {
        break forward_join_215;
    }
    spill4199_7 = this;
    if (!((life3_31 != 0))) {
        forwardValue4199_202_0 = spill4199_7;
        break forward_join_202;
    }
    forwardValue4199_193_0 = ((moom.ue)(spill4199_7)).e;
    }
    if (!((forwardValue4199_193_0 == 0))) {
        break forward_join_215;
    }
    this.e = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4199_75(14030, (7411141117405711844L ^ life1_3))));
    forwardValue4199_202_0 = this;
    }
    spill4199_8 = ((moom.ue)(forwardValue4199_202_0)).d;
    if (!((life3_31 != 0))) {
        forwardValue4199_212_0 = spill4199_8;
        break forward_join_212;
    }
    if (!((((moom.sI)(spill4199_8)).a__xW() != null))) {
        break forward_join_210;
    }
    ((moom.sI)(this.d)).B__sourceReturn_da8c82d5d4();
    }
    forwardValue4199_212_0 = this.d;
    }
    ((moom.sI)(forwardValue4199_212_0)).c__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(life4_7)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2542;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ue", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ue.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9347_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ue"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4197_17_0;
    int forwardValue4197_22_0;
    moom.ue forwardValue4197_46_0;
    int forwardValue4197_51_0;
    boolean spill4197_0;
    net.minecraft.entity.EntityLivingBase spill4197_1;
    boolean spill4197_2;
    moom.ue spill4197_3;
    moom.ue spill4197_4;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    int life3_9;
    forward_join_51: {
    forward_join_50: {
    forward_join_46: {
    forward_join_38: {
    forward_join_23: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.ue.n ^ 118335033081195L);
    spill4197_0 = moom.uc.d();
    life4_8 = ((moom.sI)(this.d)).d__sourceReturn_d30556f370();
    life3_9 = ((spill4197_0) ? 1 : 0);
    spill4197_1 = life4_8;
    if (!((life3_9 != 0))) {
        forwardValue4197_17_0 = spill4197_1;
        break forward_join_17;
    }
    if (!((spill4197_1 == null))) {
        break forward_join_16;
    }
    return ((0) != 0);
    }
    forwardValue4197_17_0 = life4_8;
    }
    spill4197_2 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4197_17_0)).p__Boolean();
    if (!((life3_9 != 0))) {
        forwardValue4197_22_0 = ((spill4197_2) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill4197_2))) {
        break forward_join_23;
    }
    forwardValue4197_22_0 = 0;
    }
    return ((forwardValue4197_22_0) != 0);
    }
    spill4197_3 = this;
    if (!((life3_9 != 0))) {
        forwardValue4197_46_0 = spill4197_3;
        break forward_join_46;
    }
    if (!((((moom.ue)(spill4197_3)).i != null))) {
        break forward_join_38;
    }
    spill4197_4 = this;
    if (!((life3_9 != 0))) {
        forwardValue4197_46_0 = spill4197_4;
        break forward_join_46;
    }
    if (!((!((java.lang.Class)(((moom.ue)(spill4197_4)).i)).isAssignableFrom(((java.lang.Class)(((java.lang.Object)(life4_8)).getClass())))))) {
        break forward_join_38;
    }
    return ((0) != 0);
    }
    this.h = ((moom.AT)(((moom.AV)(((moom.sI)(this.d)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(life4_8)))));
    forwardValue4197_46_0 = this;
    }
    if (!((((moom.ue)(forwardValue4197_46_0)).h != null))) {
        break forward_join_50;
    }
    forwardValue4197_51_0 = 1;
    break forward_join_51;
    }
    forwardValue4197_51_0 = 0;
    }
    return ((forwardValue4197_51_0) != 0);
}


protected double a(net.minecraft.entity.EntityLivingBase p0) {
return ((double) ((((((moom.sI)(this.d)).G * 0x1.0p1f) * ((moom.sI)(this.d)).G) * 0x1.0p1f) + ((net.minecraft.entity.EntityLivingBase)(p0)).G));
}


public void a__Void() {
((moom.AV)(((moom.sI)(this.d)).a__sourceReturn_407923443b())).a(((moom.AT)(this.h)), ((double)(this.f)));
    this.j = ((int)(0));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9347_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4199_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4199_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4199_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4199_75(int a0, long a1) throws E;
}
