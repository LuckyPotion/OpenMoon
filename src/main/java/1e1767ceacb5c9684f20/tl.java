package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tl extends moom.tk {

public float bX;

public float bY;

public float bZ;

public float b0;

public float b1;

public float b2;

public float b3;

public float b4;

private float b5;

private float b6;

private float b7;

private float b8;

private float b9;

private float b_;

private static final long cb;

private static final long[] kb;

private static final java.lang.Integer[] ub;

private static final java.util.Map vb;

public tl(net.minecraft.world.World p0) {
super(p0);
    (this).a__Void(0x1.e666660000000p-1f, 0x1.e666660000000p-1f);
    (this.ah).setSeed(((long) ((1 + (this).e__Int()))));
    this.b6 = ((0x1.0000000000000p+0f / ((this.ah).nextFloat() + 0x1.0000000000000p+0f)) * 0x1.99999a0000000p-3f);
    (this.bJ).a(0, new moom.vn(this));
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(4299740793644520168L)), ((long)(1280761187434896704L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(266122824299822L)))));
    vb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tl.cb ^ 66574803902677L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1036_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1036_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1036_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1036_14 = new byte[8];
    (__sourceSpill1036_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1036_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1036_16 = __sourceSpill1036_14;
    ((javax.crypto.Cipher)(__sourceSpill1036_11)).init(((int)(__sourceSpill1036_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1036_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1036_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "³â\0131eDcq{Æ\"8\177±±pQ\n*Yj"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1036_25 = local6_life21;
        int __sourceSpill1036_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1036_25)).substring(((int)(__sourceSpill1036_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1036_30 = local8_life19;
        int __sourceSpill1036_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1036_33 = new byte[8];
        (__sourceSpill1036_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1036_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1036_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1036_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1036_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1036_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1036_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1036_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1036_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1036_34)).doFinal(((byte[])(__sourceSpill1036_33)));
        (__sourceSpill1036_30)[__sourceSpill1036_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    kb = ((long[])(local8_life19));
    ub = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


protected java.lang.String i__String() {
return null;
}


protected void b(boolean p0, int p1) {
int spill1322_0;
    long life3_3;
    int life6_13;
    int life5_14;
    int life7_16;
    lexical_join_34: {
    life3_3 = (moom.tl.cb ^ 101487227851477L);
    spill1322_0 = moom.vR.c();
    life6_13 = (((java.util.Random)(((moom.tl)(this)).ah)).nextInt(((int)((3 + p1)))) + 1);
    life5_14 = spill1322_0;
    life7_16 = 0;
    lexical_cycle_17: while (true) {
    if (!((life7_16 < life6_13))) {
        break lexical_join_34;
    }
    ((moom.tl)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).b()))), ((float)(0x0.0p0f)));
    life7_16 += 1;
    if (!((life5_14 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(float p0, float p1, float p2) {
this.b8 = ((float)(p0));
    this.b9 = ((float)(p1));
    this.b_ = ((float)(p2));
    return;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30753;
      if (ub[var3] == null) {
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
         long var5 = kb[var3];
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
         Object[] var9 = (Object[])vb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               vb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ub[var3] = var15;
      }

      return ub[var3];
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral9200_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void e(float p0, float p1) {
((moom.tl)(this)).b__Void(((double)(((moom.tl)(this)).t)), ((double)(((moom.tl)(this)).u)), ((double)(((moom.tl)(this)).v)));
    return;
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tl.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public float e__Float() {
return (((moom.tl)(this)).H * 0x1.0p-1f);
}


protected java.lang.String c__String() {
return null;
}


protected java.lang.String h__String() {
return null;
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.99999ap-2f;
}


protected net.minecraft.item.Item a__wQ() {
return null;
}


static boolean a(moom.tl p0) {
return ((((((moom.tl)(p0)).ai) ? 1 : 0)) != 0);
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.tl)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p3d)));
    return;
}


public void a(byte p0) {
long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (moom.tl.cb ^ 140226165251726L);
    life4_5 = moom.vR.c();
    if (!((life4_5 == 0))) { break forward_join_18; }
    if (!((p0 == __sourceIntrinsic_6121ff5511c4_invokedynamic4715_2(22644, (302791367409191579L ^ life2_3))))) { break forward_join_20; }
    this.b1 = ((float)(0x0.0p0f));
    }
    if (!((life4_5 != 0))) { break forward_join_23; }
    }
    super.a(((byte)(p0)));
    }
    return;
}


protected boolean g__Boolean() {
return ((0) != 0);
}


public boolean j__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(((moom.tl)(this)).i)).a(((moom.CA)(((moom.CA)(((moom.tl)(this)).b())).b(((double)(0x0.0p0d)), ((double)(-0x1.333334p-1d)), ((double)(0x0.0p0d))))), ((moom.fn)(moom.fn.h)), ((net.minecraft.entity.Entity)(this))))) != 0);
}


public boolean N__Boolean() {
int forwardValue4093_20_0;
    int forwardValue4093_25_0;
    int forwardValue4093_29_0;
    int forwardValue4093_31_0;
    int spill4093_0;
    long life1_3;
    int life3_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_20: {
    life1_3 = (moom.tl.cb ^ 38102146618657L);
    life3_5 = moom.vR.b();
    spill4093_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.tl)(this)).o)), ((double)(0x1.68p5d)));
    if (!((life3_5 != 0))) {
        forwardValue4093_20_0 = spill4093_0;
        break forward_join_20;
    }
    if (!((spill4093_0 > 0))) {
        break forward_join_30;
    }
    forwardValue4093_20_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.tl)(this)).o)), ((double)(((double) ((net.minecraft.world.World)(((moom.tl)(this)).i)).c()))));
    }
    if (!((life3_5 != 0))) {
        forwardValue4093_25_0 = forwardValue4093_20_0;
        break forward_join_25;
    }
    if (!((forwardValue4093_20_0 < 0))) {
        break forward_join_30;
    }
    forwardValue4093_25_0 = ((super.N__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4093_29_0 = forwardValue4093_25_0;
        break forward_join_29;
    }
    if (!((forwardValue4093_25_0 != 0))) {
        break forward_join_30;
    }
    forwardValue4093_29_0 = 1;
    }
    forwardValue4093_31_0 = forwardValue4093_29_0;
    break forward_join_31;
    }
    forwardValue4093_31_0 = 0;
    }
    return ((forwardValue4093_31_0) != 0);
}


public boolean Y() {
int forwardValue4094_28_0;
    int forwardValue4094_30_0;
    int spill4094_0;
    int spill4094_1;
    int spill4094_2;
    long life1_3;
    int life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    life1_3 = (moom.tl.cb ^ 102580893298935L);
    life3_5 = moom.vR.c();
    spill4094_0 = recovery.source.CarrierOps.fcmpl(((float)(this.b8)), ((float)(0x0.0p0f)));
    if (!((life3_5 == 0))) {
        forwardValue4094_28_0 = spill4094_0;
        break forward_join_28;
    }
    if (!((spill4094_0 == 0))) {
        break forward_join_27;
    }
    spill4094_1 = recovery.source.CarrierOps.fcmpl(((float)(this.b9)), ((float)(0x0.0p0f)));
    if (!((life3_5 == 0))) {
        forwardValue4094_28_0 = spill4094_1;
        break forward_join_28;
    }
    if (!((spill4094_1 == 0))) {
        break forward_join_27;
    }
    spill4094_2 = recovery.source.CarrierOps.fcmpl(((float)(this.b_)), ((float)(0x0.0p0f)));
    if (!((life3_5 == 0))) {
        forwardValue4094_28_0 = spill4094_2;
        break forward_join_28;
    }
    if (!((spill4094_2 != 0))) {
        break forward_join_29;
    }
    }
    forwardValue4094_28_0 = 1;
    }
    forwardValue4094_30_0 = forwardValue4094_28_0;
    break forward_join_30;
    }
    forwardValue4094_30_0 = 0;
    }
    return ((forwardValue4094_30_0) != 0);
}


public void G() {
int forwardValue4092_68_0;
    moom.tl forwardValue4092_81_0;
    int forwardValue4092_91_0;
    moom.tl forwardValue4092_138_0;
    float forwardValue4092_138_1;
    moom.tl forwardValue4092_151_0;
    moom.tl forwardValue4092_187_0;
    int forwardValue4092_276_0;
    moom.tl forwardValue4092_296_0;
    int spill4092_0;
    int spill4092_1;
    boolean spill4092_2;
    moom.tl spill4092_3;
    moom.tl spill4092_4;
    moom.tl spill4092_5;
    float spill4092_6;
    moom.tl spill4092_7;
    moom.tl spill4092_8;
    long life1_3;
    int life3_15;
    float life4_135;
    float life4_246;
    forward_join_309: {
    forward_join_296: {
    forward_join_295: {
    forward_join_276: {
    forward_join_261: {
    forward_join_187: {
    forward_join_186: {
    forward_join_156: {
    forward_join_151: {
    forward_join_141: {
    forward_join_139: {
    forward_join_138: {
    forward_join_133: {
    forward_join_91: {
    forward_join_89: {
    forward_join_81: {
    forward_join_80: {
    forward_join_68: {
    forward_join_50: {
    life1_3 = (moom.tl.cb ^ 20949701058775L);
    super.G();
    spill4092_0 = moom.vR.b();
    this.bY = ((float)(this.bX));
    this.b0 = ((float)(this.bZ));
    life3_15 = spill4092_0;
    this.b2 = ((float)(this.b1));
    this.b4 = ((float)(this.b3));
    moom.tl __stackOp4092_11_0 = this;
    ((moom.tl)(__stackOp4092_11_0)).b1 = ((float)((((moom.tl)(__stackOp4092_11_0)).b1 + this.b6)));
    spill4092_1 = recovery.source.CarrierOps.dcmpl(((double)(((double) this.b1))), ((double)(0x1.921fb54442d18p2d)));
    if (!((life3_15 != 0))) {
        forwardValue4092_91_0 = spill4092_1;
        break forward_join_91;
    }
    if (!((spill4092_1 > 0))) {
        break forward_join_89;
    }
    spill4092_2 = ((net.minecraft.world.World)(((moom.tl)(this)).i)).G;
    if (!((life3_15 != 0))) {
        forwardValue4092_68_0 = ((spill4092_2) ? 1 : 0);
        break forward_join_68;
    }
    if (!(spill4092_2)) {
        break forward_join_50;
    }
    this.b1 = ((float)(0x1.921fb6p2f));
    if (!((life3_15 == 0))) {
        break forward_join_89;
    }
    }
    this.b1 = ((float)(((float) (((double) this.b1) - 0x1.921fb54442d18p2d))));
    spill4092_3 = this;
    if (!((life3_15 != 0))) {
        forwardValue4092_81_0 = spill4092_3;
        break forward_join_81;
    }
    forwardValue4092_68_0 = ((java.util.Random)(((moom.tl)(spill4092_3)).ah)).nextInt(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic4092_24(24944, (3561493654985346501L ^ life1_3)))));
    }
    if (!((forwardValue4092_68_0 == 0))) {
        break forward_join_80;
    }
    this.b6 = ((float)(((0x1.0p0f / (((java.util.Random)(((moom.tl)(this)).ah)).nextFloat() + 0x1.0p0f)) * 0x1.99999ap-3f)));
    }
    forwardValue4092_81_0 = this;
    }
    ((net.minecraft.world.World)(((moom.tl)(forwardValue4092_81_0)).i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_c7b45e3c376e_invokedynamic4092_30(7154, (214048502109796166L ^ life1_3)))));
    }
    forwardValue4092_91_0 = ((((moom.tl)(this)).ai) ? 1 : 0);
    }
    if (!((life3_15 != 0))) {
        forwardValue4092_276_0 = forwardValue4092_91_0;
        break forward_join_276;
    }
    if (!((forwardValue4092_91_0 != 0))) {
        break forward_join_261;
    }
    spill4092_4 = this;
    if (!((life3_15 != 0))) {
        forwardValue4092_151_0 = spill4092_4;
        break forward_join_151;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((moom.tl)(spill4092_4)).b1)), ((float)(0x1.921fb6p1f))) < 0))) {
        break forward_join_141;
    }
    life4_135 = (this.b1 / 0x1.921fb6p1f);
    spill4092_5 = this;
    spill4092_6 = ((moom.Dr.a(((float)(((life4_135 * life4_135) * 0x1.921fb6p1f)))) * 0x1.921fb6p1f) * 0x1.0p-2f);
    if (!((life3_15 != 0))) {
        forwardValue4092_138_0 = spill4092_5;
        forwardValue4092_138_1 = spill4092_6;
        break forward_join_138;
    }
    ((moom.tl)(spill4092_5)).b3 = ((float)(spill4092_6));
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) life4_135))), ((double)(0x1.8p-1d))) > 0))) {
        break forward_join_133;
    }
    this.b5 = ((float)(0x1.0p0f));
    this.b7 = ((float)(0x1.0p0f));
    if (!((life3_15 == 0))) {
        break forward_join_139;
    }
    }
    moom.tl __stackOp4092_42_0 = this;
    forwardValue4092_138_0 = __stackOp4092_42_0;
    forwardValue4092_138_1 = (((moom.tl)(__stackOp4092_42_0)).b7 * 0x1.99999ap-1f);
    }
    ((moom.tl)(forwardValue4092_138_0)).b7 = ((float)(forwardValue4092_138_1));
    }
    if (!((life3_15 == 0))) {
        break forward_join_156;
    }
    }
    this.b3 = ((float)(0x0.0p0f));
    moom.tl __stackOp4092_46_0 = this;
    ((moom.tl)(__stackOp4092_46_0)).b5 = ((float)((((moom.tl)(__stackOp4092_46_0)).b5 * 0x1.ccccccp-1f)));
    forwardValue4092_151_0 = this;
    }
    moom.tl __stackOp4092_49_0 = forwardValue4092_151_0;
    ((moom.tl)(__stackOp4092_49_0)).b7 = ((float)((((moom.tl)(__stackOp4092_49_0)).b7 * 0x1.fae148p-1f)));
    }
    spill4092_7 = this;
    if (!((life3_15 != 0))) {
        forwardValue4092_187_0 = spill4092_7;
        break forward_join_187;
    }
    if (!((!((net.minecraft.world.World)(((moom.tl)(spill4092_7)).i)).G))) {
        break forward_join_186;
    }
    ((moom.tl)(this)).t = ((double)(((double) (this.b8 * this.b5))));
    ((moom.tl)(this)).u = ((double)(((double) (this.b9 * this.b5))));
    ((moom.tl)(this)).v = ((double)(((double) (this.b_ * this.b5))));
    }
    forwardValue4092_187_0 = this;
    }
    life4_246 = moom.Dr.a__Float(((double)(((((moom.tl)(forwardValue4092_187_0)).t * ((moom.tl)(this)).t) + (((moom.tl)(this)).v * ((moom.tl)(this)).v)))));
    moom.tl __stackOp4092_68_0 = this;
    ((moom.tl)(__stackOp4092_68_0)).a2 = ((float)((((moom.tl)(__stackOp4092_68_0)).a2 + (((((-((float) moom.Dr.b(((double)(((moom.tl)(this)).t)), ((double)(((moom.tl)(this)).v))))) * 0x1.68p7f) / 0x1.921fb6p1f) - ((moom.tl)(this)).a2) * 0x1.99999ap-4f))));
    ((moom.tl)(this)).w = ((float)(((moom.tl)(this)).a2));
    this.bZ = ((float)(((float) (((double) this.bZ) + ((0x1.921fb54442d18p1d * ((double) this.b7)) * 0x1.8p0d)))));
    moom.tl __stackOp4092_80_0 = this;
    ((moom.tl)(__stackOp4092_80_0)).bX = ((float)((((moom.tl)(__stackOp4092_80_0)).bX + (((((-((float) moom.Dr.b(((double)(((double) life4_246))), ((double)(((moom.tl)(this)).u))))) * 0x1.68p7f) / 0x1.921fb6p1f) - this.bX) * 0x1.99999ap-4f))));
    if (!((life3_15 == 0))) {
        break forward_join_309;
    }
    }
    this.b3 = ((float)(((moom.Dr.d(((float)(moom.Dr.a(((float)(this.b1)))))) * 0x1.921fb6p1f) * 0x1.0p-2f)));
    spill4092_8 = this;
    if (!((life3_15 != 0))) {
        forwardValue4092_296_0 = spill4092_8;
        break forward_join_296;
    }
    forwardValue4092_276_0 = ((((net.minecraft.world.World)(((moom.tl)(spill4092_8)).i)).G) ? 1 : 0);
    }
    if (!((forwardValue4092_276_0 == 0))) {
        break forward_join_295;
    }
    ((moom.tl)(this)).t = ((double)(0x0.0p0d));
    moom.tl __stackOp4092_94_0 = this;
    ((moom.tl)(__stackOp4092_94_0)).u = ((double)((((moom.tl)(__stackOp4092_94_0)).u - 0x1.47ae147ae147bp-4d)));
    moom.tl __stackOp4092_97_0 = this;
    ((moom.tl)(__stackOp4092_97_0)).u = ((double)((((moom.tl)(__stackOp4092_97_0)).u * 0x1.f5c29p-1d)));
    ((moom.tl)(this)).v = ((double)(0x0.0p0d));
    }
    forwardValue4092_296_0 = this;
    }
    ((moom.tl)(forwardValue4092_296_0)).bX = ((float)(((float) (((double) this.bX) + (((double) (-0x1.68p6f - this.bX)) * 0x1.47ae147ae147bp-6d)))));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral9200_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic4715_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4092_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4092_30(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
