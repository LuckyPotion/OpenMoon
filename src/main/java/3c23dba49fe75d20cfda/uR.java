package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class uR extends moom.uc {

protected final moom.sI c;

protected boolean d;

private final boolean e;

private int f;

private int g;

private int h;

private static final long s;

private static final long[] u;

private static final java.lang.Integer[] v;

private static final java.util.Map w;

public uR(moom.sI p0, boolean p1) {
this(p0, p1, false);
}


public uR(moom.sI p0, boolean p1, boolean p2) {
super();
    this.c = p0;
    this.d = p1;
    this.e = p2;
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(-8068131934605409595L)), ((long)(-4962181832794667035L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(32976599047368L)))));
    w = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uR.s ^ 139047375596272L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1049_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1049_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1049_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1049_14 = new byte[8];
    (__sourceSpill1049_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1049_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1049_16 = __sourceSpill1049_14;
    ((javax.crypto.Cipher)(__sourceSpill1049_11)).init(((int)(__sourceSpill1049_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1049_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1049_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "s¥¹\027);ÊnpþväÂ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1049_25 = local6_life21;
        int __sourceSpill1049_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1049_25)).substring(((int)(__sourceSpill1049_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1049_30 = local8_life19;
        int __sourceSpill1049_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1049_33 = new byte[8];
        (__sourceSpill1049_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1049_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1049_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1049_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1049_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1049_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1049_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1049_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1049_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1049_34)).doFinal(((byte[])(__sourceSpill1049_33)));
        (__sourceSpill1049_30)[__sourceSpill1049_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    u = ((long[])(local8_life19));
    v = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b__Void() {
((moom.sI)(this.c)).c(((net.minecraft.entity.EntityLivingBase)(null)));
    return;
}


public boolean b__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4181_17_0;
    int forwardValue4181_22_0;
    moom.Bj forwardValue4181_35_0;
    int forwardValue4181_57_0;
    int forwardValue4181_80_0;
    int forwardValue4181_92_0;
    int forwardValue4181_103_0;
    int forwardValue4181_105_0;
    boolean spill4181_0;
    net.minecraft.entity.EntityLivingBase spill4181_1;
    boolean spill4181_2;
    moom.Bj spill4181_3;
    int spill4181_4;
    boolean spill4181_5;
    int spill4181_6;
    boolean spill4181_7;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    int life3_9;
    moom.Bj life5_34;
    moom.Bj life6_37;
    double life7_54;
    forward_join_105: {
    forward_join_104: {
    forward_join_103: {
    forward_join_102: {
    forward_join_92: {
    forward_join_90: {
    forward_join_80: {
    forward_join_73: {
    forward_join_57: {
    forward_join_55: {
    forward_join_39: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.uR.s ^ 131831176368832L);
    spill4181_0 = moom.uc.d();
    life4_8 = ((moom.sI)(this.c)).d__sourceReturn_d30556f370();
    life3_9 = ((spill4181_0) ? 1 : 0);
    spill4181_1 = life4_8;
    if (!((life3_9 != 0))) {
        forwardValue4181_17_0 = spill4181_1;
        break forward_join_17;
    }
    if (!((spill4181_1 == null))) {
        break forward_join_16;
    }
    return ((0) != 0);
    }
    forwardValue4181_17_0 = life4_8;
    }
    spill4181_2 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4181_17_0)).p__Boolean();
    if (!((life3_9 != 0))) {
        forwardValue4181_22_0 = ((spill4181_2) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill4181_2))) {
        break forward_join_23;
    }
    forwardValue4181_22_0 = 0;
    }
    return ((forwardValue4181_22_0) != 0);
    }
    life5_34 = ((moom.sI)(this.c)).a__Bj();
    life6_37 = ((net.minecraft.entity.EntityLivingBase)(life4_8)).a__Bj();
    spill4181_3 = life5_34;
    if (!((life3_9 != 0))) {
        forwardValue4181_35_0 = spill4181_3;
        break forward_join_35;
    }
    if (!((spill4181_3 != null))) {
        break forward_join_39;
    }
    forwardValue4181_35_0 = life6_37;
    }
    if (!((forwardValue4181_35_0 == life5_34))) {
        break forward_join_39;
    }
    return ((0) != 0);
    }
    life7_54 = ((moom.uR)(this)).a__sourceReturn_fedcb3e4d3();
    spill4181_4 = recovery.source.CarrierOps.dcmpl(((double)(((moom.sI)(this.c)).a(((net.minecraft.entity.Entity)(life4_8))))), ((double)((life7_54 * life7_54))));
    if (!((life3_9 != 0))) {
        forwardValue4181_57_0 = spill4181_4;
        break forward_join_57;
    }
    if (!((spill4181_4 > 0))) {
        break forward_join_55;
    }
    return ((0) != 0);
    }
    forwardValue4181_57_0 = ((this.d) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forwardValue4181_92_0 = forwardValue4181_57_0;
        break forward_join_92;
    }
    if (!((forwardValue4181_57_0 != 0))) {
        break forward_join_90;
    }
    spill4181_5 = ((net.minecraft.entity.ai.EntitySenses)(((moom.sI)(this.c)).a__vz())).a(((net.minecraft.entity.Entity)(life4_8)));
    if (!((life3_9 != 0))) {
        forwardValue4181_80_0 = ((spill4181_5) ? 1 : 0);
        break forward_join_80;
    }
    if (!(spill4181_5)) {
        break forward_join_73;
    }
    this.h = ((int)(0));
    if (!((life3_9 == 0))) {
        break forward_join_90;
    }
    }
    moom.uR __stackOp4181_25_0 = this;
    moom.uR __stackOp4181_27_0 = __stackOp4181_25_0;
    int __stackOp4181_27_1 = (((moom.uR)(__stackOp4181_25_0)).h + 1);
    spill4181_6 = __stackOp4181_27_1;
    ((moom.uR)(__stackOp4181_27_0)).h = ((int)(__stackOp4181_27_1));
    forwardValue4181_80_0 = spill4181_6;
    }
    if (!((life3_9 != 0))) {
        forwardValue4181_92_0 = forwardValue4181_80_0;
        break forward_join_92;
    }
    if (!((forwardValue4181_80_0 > __sourceIntrinsic_74e88f4b4822_invokedynamic4181_29(3601, (3267196951674280937L ^ life1_3))))) {
        break forward_join_90;
    }
    return ((0) != 0);
    }
    forwardValue4181_92_0 = ((life4_8 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forwardValue4181_103_0 = forwardValue4181_92_0;
        break forward_join_103;
    }
    if (!((forwardValue4181_92_0 != 0))) {
        break forward_join_102;
    }
    spill4181_7 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life4_8)))).b1)).a;
    if (!((life3_9 != 0))) {
        forwardValue4181_103_0 = ((spill4181_7) ? 1 : 0);
        break forward_join_103;
    }
    if (!((!spill4181_7))) {
        break forward_join_104;
    }
    }
    forwardValue4181_103_0 = 1;
    }
    forwardValue4181_105_0 = forwardValue4181_103_0;
    break forward_join_105;
    }
    forwardValue4181_105_0 = 0;
    }
    return ((forwardValue4181_105_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uR.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17822;
      if (v[var3] == null) {
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
         long var5 = u[var3];
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
         Object[] var9 = (Object[])w.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               w.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/uR", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         v[var3] = var15;
      }

      return v[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9323_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected double a__sourceReturn_fedcb3e4d3() {
net.minecraft.entity.ai.attributes.IAttributeInstance forwardValue4177_18_0;
    double forwardValue4177_19_0;
    boolean spill4177_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill4177_1;
    long life1_3;
    net.minecraft.entity.ai.attributes.IAttributeInstance life4_9;
    int life3_10;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.uR.s ^ 23369083665131L);
    spill4177_0 = moom.uc.e();
    life4_9 = ((moom.sI)(this.c)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c)));
    life3_10 = ((spill4177_0) ? 1 : 0);
    spill4177_1 = life4_9;
    if (!((life3_10 == 0))) {
        forwardValue4177_18_0 = spill4177_1;
        break forward_join_18;
    }
    if (!((spill4177_1 == null))) {
        break forward_join_17;
    }
    forwardValue4177_19_0 = 0x1.0p4d;
    break forward_join_19;
    }
    forwardValue4177_18_0 = life4_9;
    }
    forwardValue4177_19_0 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(forwardValue4177_18_0)).b();
    }
    return forwardValue4177_19_0;
}


public void a__Void() {
this.f = ((int)(0));
    this.g = ((int)(0));
    this.h = ((int)(0));
    return;
}


public static boolean a(net.minecraft.entity.EntityLiving p0, net.minecraft.entity.EntityLivingBase p1, boolean p2, boolean p3) {
net.minecraft.entity.EntityLivingBase forwardValue4178_13_0;
    net.minecraft.entity.EntityLivingBase forwardValue4178_20_0;
    int forwardValue4178_32_0;
    net.minecraft.entity.EntityLiving forwardValue4178_36_0;
    moom.Bj forwardValue4178_46_0;
    net.minecraft.entity.EntityLivingBase forwardValue4178_80_0;
    int forwardValue4178_88_0;
    int forwardValue4178_105_0;
    int forwardValue4178_116_0;
    int forwardValue4178_118_0;
    net.minecraft.entity.EntityLivingBase spill4178_0;
    boolean spill4178_1;
    net.minecraft.entity.EntityLiving spill4178_2;
    moom.Bj spill4178_3;
    int spill4178_4;
    boolean spill4178_5;
    net.minecraft.entity.EntityLivingBase spill4178_6;
    net.minecraft.entity.EntityLiving spill4178_7;
    boolean spill4178_8;
    boolean spill4178_9;
    boolean spill4178_10;
    long life4_3;
    int life6_5;
    moom.Bj life7_57;
    moom.Bj life8_60;
    forward_join_118: {
    forward_join_117: {
    forward_join_116: {
    forward_join_115: {
    forward_join_105: {
    forward_join_104: {
    forward_join_88: {
    forward_join_86: {
    forward_join_80: {
    forward_join_79: {
    forward_join_50: {
    forward_join_46: {
    forward_join_36: {
    forward_join_35: {
    forward_join_32: {
    forward_join_26: {
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    forward_join_12: {
    life4_3 = (moom.uR.s ^ 103299767830157L);
    life6_5 = ((moom.uc.d()) ? 1 : 0);
    spill4178_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue4178_13_0 = spill4178_0;
        break forward_join_13;
    }
    if (!((spill4178_0 == null))) {
        break forward_join_12;
    }
    return ((0) != 0);
    }
    forwardValue4178_13_0 = p1;
    }
    if (!((life6_5 != 0))) {
        forwardValue4178_20_0 = forwardValue4178_13_0;
        break forward_join_20;
    }
    if (!((forwardValue4178_13_0 == p0))) {
        break forward_join_19;
    }
    return ((0) != 0);
    }
    forwardValue4178_20_0 = p1;
    }
    spill4178_1 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4178_20_0)).p__Boolean();
    if (!((life6_5 != 0))) {
        forwardValue4178_32_0 = ((spill4178_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill4178_1))) {
        break forward_join_26;
    }
    return ((0) != 0);
    }
    spill4178_2 = p0;
    if (!((life6_5 != 0))) {
        forwardValue4178_36_0 = spill4178_2;
        break forward_join_36;
    }
    forwardValue4178_32_0 = ((((net.minecraft.entity.EntityLiving)(spill4178_2)).a(((java.lang.Class)(((java.lang.Object)(p1)).getClass())))) ? 1 : 0);
    }
    if (!((forwardValue4178_32_0 == 0))) {
        break forward_join_35;
    }
    return ((0) != 0);
    }
    forwardValue4178_36_0 = p0;
    }
    life7_57 = ((net.minecraft.entity.EntityLiving)(forwardValue4178_36_0)).a__Bj();
    life8_60 = ((net.minecraft.entity.EntityLivingBase)(p1)).a__Bj();
    spill4178_3 = life7_57;
    if (!((life6_5 != 0))) {
        forwardValue4178_46_0 = spill4178_3;
        break forward_join_46;
    }
    if (!((spill4178_3 != null))) {
        break forward_join_50;
    }
    forwardValue4178_46_0 = life8_60;
    }
    if (!((forwardValue4178_46_0 == life7_57))) {
        break forward_join_50;
    }
    return ((0) != 0);
    }
    spill4178_4 = ((p0 instanceof net.minecraft.entity.IEntityOwnable) ? 1 : 0);
    if (!((life6_5 != 0))) {
        forwardValue4178_88_0 = spill4178_4;
        break forward_join_88;
    }
    if (!((spill4178_4 != 0))) {
        break forward_join_86;
    }
    spill4178_5 = org.apache.commons.lang3.StringUtils.isNotEmpty(((java.lang.CharSequence)(__sourceExactCall_db618e8f841801(((net.minecraft.entity.IEntityOwnable)(((net.minecraft.entity.IEntityOwnable)(p0))))))));
    if (!((life6_5 != 0))) {
        forwardValue4178_88_0 = ((spill4178_5) ? 1 : 0);
        break forward_join_88;
    }
    if (!(spill4178_5)) {
        break forward_join_86;
    }
    spill4178_6 = p1;
    if (!((life6_5 != 0))) {
        forwardValue4178_80_0 = spill4178_6;
        break forward_join_80;
    }
    if (!((((spill4178_6 instanceof net.minecraft.entity.IEntityOwnable) ? 1 : 0) != 0))) {
        break forward_join_79;
    }
    spill4178_7 = p0;
    if (!((life6_5 != 0))) {
        forwardValue4178_80_0 = spill4178_7;
        break forward_join_80;
    }
    if (!(((java.lang.String)(__sourceExactCall_db618e8f841801(((net.minecraft.entity.IEntityOwnable)(((net.minecraft.entity.IEntityOwnable)(spill4178_7))))))).equals(((java.lang.Object)(__sourceExactCall_db618e8f841801(((net.minecraft.entity.IEntityOwnable)(((net.minecraft.entity.IEntityOwnable)(p1)))))))))) {
        break forward_join_79;
    }
    return ((0) != 0);
    }
    forwardValue4178_80_0 = p1;
    }
    if (!((forwardValue4178_80_0 == ((net.minecraft.entity.IEntityOwnable)(((net.minecraft.entity.IEntityOwnable)(p0)))).b__r3()))) {
        break forward_join_104;
    }
    return ((0) != 0);
    }
    forwardValue4178_88_0 = ((p1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue4178_105_0 = forwardValue4178_88_0;
        break forward_join_105;
    }
    if (!((forwardValue4178_88_0 != 0))) {
        break forward_join_104;
    }
    spill4178_8 = p2;
    if (!((life6_5 != 0))) {
        forwardValue4178_105_0 = ((spill4178_8) ? 1 : 0);
        break forward_join_105;
    }
    if (!((!spill4178_8))) {
        break forward_join_104;
    }
    spill4178_9 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p1)))).b1)).a;
    if (!((life6_5 != 0))) {
        forwardValue4178_105_0 = ((spill4178_9) ? 1 : 0);
        break forward_join_105;
    }
    if (!(spill4178_9)) {
        break forward_join_104;
    }
    return ((0) != 0);
    }
    forwardValue4178_105_0 = ((p3) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue4178_116_0 = forwardValue4178_105_0;
        break forward_join_116;
    }
    if (!((forwardValue4178_105_0 != 0))) {
        break forward_join_115;
    }
    spill4178_10 = ((net.minecraft.entity.ai.EntitySenses)(((net.minecraft.entity.EntityLiving)(p0)).a__vz())).a(((net.minecraft.entity.Entity)(p1)));
    if (!((life6_5 != 0))) {
        forwardValue4178_116_0 = ((spill4178_10) ? 1 : 0);
        break forward_join_116;
    }
    if (!(spill4178_10)) {
        break forward_join_117;
    }
    }
    forwardValue4178_116_0 = 1;
    }
    forwardValue4178_118_0 = forwardValue4178_116_0;
    break forward_join_118;
    }
    forwardValue4178_118_0 = 0;
    }
    return ((forwardValue4178_118_0) != 0);
}


protected boolean a(net.minecraft.entity.EntityLivingBase p0, boolean p1) {
int forwardValue4180_25_0;
    int forwardValue4180_32_0;
    int forwardValue4180_50_0;
    moom.uR forwardValue4180_61_0;
    int forwardValue4180_61_1;
    moom.uR forwardValue4180_62_0;
    moom.uR forwardValue4180_63_0;
    int forwardValue4180_63_1;
    int forwardValue4180_66_0;
    int forwardValue4180_71_0;
    int forwardValue4180_73_0;
    int forwardValue4180_75_0;
    boolean spill4180_0;
    int spill4180_1;
    moom.uR spill4180_2;
    boolean spill4180_3;
    long life3_3;
    int life5_5;
    forward_join_75: {
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_71: {
    forward_join_66: {
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_50: {
    forward_join_48: {
    forward_join_32: {
    forward_join_30: {
    forward_join_25: {
    forward_join_18: {
    life3_3 = (moom.uR.s ^ 103011660002348L);
    life5_5 = ((moom.uc.d()) ? 1 : 0);
    spill4180_0 = moom.uR.a(((net.minecraft.entity.EntityLiving)(this.c)), ((net.minecraft.entity.EntityLivingBase)(p0)), ((boolean)(p1)), ((boolean)(this.d)));
    if (!((life5_5 != 0))) {
        forwardValue4180_25_0 = ((spill4180_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill4180_0))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    forwardValue4180_25_0 = ((((moom.sI)(this.c)).a__Boolean(((moom.DT)(new moom.DT(p0))))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue4180_32_0 = forwardValue4180_25_0;
        break forward_join_32;
    }
    if (!((forwardValue4180_25_0 == 0))) {
        break forward_join_30;
    }
    return ((0) != 0);
    }
    forwardValue4180_32_0 = ((this.e) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue4180_75_0 = forwardValue4180_32_0;
        break forward_join_75;
    }
    if (!((forwardValue4180_32_0 != 0))) {
        break forward_join_74;
    }
    moom.uR __stackOp4180_14_0 = this;
    moom.uR __stackOp4180_16_0 = __stackOp4180_14_0;
    int __stackOp4180_16_1 = (((moom.uR)(__stackOp4180_14_0)).g - 1);
    spill4180_1 = __stackOp4180_16_1;
    ((moom.uR)(__stackOp4180_16_0)).g = ((int)(__stackOp4180_16_1));
    if (!((life5_5 != 0))) {
        forwardValue4180_50_0 = spill4180_1;
        break forward_join_50;
    }
    if (!((spill4180_1 <= 0))) {
        break forward_join_48;
    }
    this.f = ((int)(0));
    }
    forwardValue4180_50_0 = this.f;
    }
    if (!((life5_5 != 0))) {
        forwardValue4180_66_0 = forwardValue4180_50_0;
        break forward_join_66;
    }
    if (!((forwardValue4180_50_0 == 0))) {
        break forward_join_64;
    }
    spill4180_2 = this;
    spill4180_3 = ((moom.uR)(this)).a(((net.minecraft.entity.EntityLivingBase)(p0)));
    if (!((life5_5 != 0))) {
        forwardValue4180_61_0 = spill4180_2;
        forwardValue4180_61_1 = ((spill4180_3) ? 1 : 0);
        break forward_join_61;
    }
    if (!(spill4180_3)) {
        forwardValue4180_62_0 = spill4180_2;
        break forward_join_62;
    }
    forwardValue4180_61_0 = spill4180_2;
    forwardValue4180_61_1 = 1;
    }
    forwardValue4180_63_0 = forwardValue4180_61_0;
    forwardValue4180_63_1 = forwardValue4180_61_1;
    break forward_join_63;
    }
    forwardValue4180_63_0 = forwardValue4180_62_0;
    forwardValue4180_63_1 = 2;
    }
    ((moom.uR)(forwardValue4180_63_0)).f = ((int)(forwardValue4180_63_1));
    }
    forwardValue4180_66_0 = this.f;
    }
    if (!((life5_5 != 0))) {
        forwardValue4180_71_0 = forwardValue4180_66_0;
        break forward_join_71;
    }
    if (!((forwardValue4180_66_0 != 2))) {
        break forward_join_72;
    }
    forwardValue4180_71_0 = 1;
    }
    forwardValue4180_73_0 = forwardValue4180_71_0;
    break forward_join_73;
    }
    forwardValue4180_73_0 = 0;
    }
    return ((forwardValue4180_73_0) != 0);
    }
    forwardValue4180_75_0 = 1;
    }
    return ((forwardValue4180_75_0) != 0);
}


private boolean a(net.minecraft.entity.EntityLivingBase p0) {
moom.AT forwardValue4179_32_0;
    moom.AZ forwardValue4179_41_0;
    int forwardValue4179_68_0;
    int forwardValue4179_70_0;
    boolean spill4179_0;
    moom.AT spill4179_1;
    moom.AZ spill4179_2;
    int spill4179_3;
    long life2_3;
    moom.AT life5_23;
    int life4_24;
    moom.AZ life6_38;
    int life7_56;
    int life8_63;
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_41: {
    forward_join_40: {
    forward_join_32: {
    forward_join_31: {
    life2_3 = (moom.uR.s ^ 71991450468878L);
    spill4179_0 = moom.uc.d();
    this.g = ((int)((__sourceIntrinsic_989ebad77604_invokedynamic4179_2(30575, (6828620632725893720L ^ life2_3)) + ((java.util.Random)(((moom.sI)(this.c)).a__Random())).nextInt(((int)(5))))));
    life5_23 = ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(p0)));
    life4_24 = ((spill4179_0) ? 1 : 0);
    spill4179_1 = life5_23;
    if (!((life4_24 != 0))) {
        forwardValue4179_32_0 = spill4179_1;
        break forward_join_32;
    }
    if (!((spill4179_1 == null))) {
        break forward_join_31;
    }
    return ((0) != 0);
    }
    forwardValue4179_32_0 = life5_23;
    }
    life6_38 = ((moom.AT)(forwardValue4179_32_0)).a__AZ();
    spill4179_2 = life6_38;
    if (!((life4_24 != 0))) {
        forwardValue4179_41_0 = spill4179_2;
        break forward_join_41;
    }
    if (!((spill4179_2 == null))) {
        break forward_join_40;
    }
    return ((0) != 0);
    }
    forwardValue4179_41_0 = life6_38;
    }
    life7_56 = (((moom.AZ)(forwardValue4179_41_0)).a - moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLivingBase)(p0)).n))));
    life8_63 = (((moom.AZ)(life6_38)).c - moom.Dr.b__Int(((double)(((net.minecraft.entity.EntityLivingBase)(p0)).p))));
    spill4179_3 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((life7_56 * life7_56) + (life8_63 * life8_63))))), ((double)(0x1.2p1d)));
    if (!((life4_24 != 0))) {
        forwardValue4179_68_0 = spill4179_3;
        break forward_join_68;
    }
    if (!((spill4179_3 <= 0))) {
        break forward_join_69;
    }
    forwardValue4179_68_0 = 1;
    }
    forwardValue4179_70_0 = forwardValue4179_68_0;
    break forward_join_70;
    }
    forwardValue4179_70_0 = 0;
    }
    return ((forwardValue4179_70_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9323_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_989ebad77604_invokedynamic4179_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic4181_29(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_db618e8f841801(net.minecraft.entity.IEntityOwnable p0);
}
