package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class uC extends moom.uc {

private final moom.sI c;

private final double d;

protected int e;

private int f;

private int g;

protected moom.DT h;

private boolean i;

private final int j;

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map s;

public uC(moom.sI p0, double p1, int p2) {
super();
    this.h = moom.DT.f;
    this.c = p0;
    this.d = p1;
    this.j = p2;
    (this).a(5);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-5746831495853069604L)), ((long)(-5175133954482474944L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(230341091895327L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uC.p ^ 126043445160897L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1581_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1581_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1581_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1581_14 = new byte[8];
    (__sourceSpill1581_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1581_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1581_16 = __sourceSpill1581_14;
    ((javax.crypto.Cipher)(__sourceSpill1581_11)).init(((int)(__sourceSpill1581_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1581_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1581_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\034®¬ò7\031ü§Ã\003G\n[<O`êí[¾\n«"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1581_25 = local6_life21;
        int __sourceSpill1581_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1581_25)).substring(((int)(__sourceSpill1581_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1581_30 = local8_life19;
        int __sourceSpill1581_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1581_33 = new byte[8];
        (__sourceSpill1581_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1581_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1581_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1581_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1581_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1581_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1581_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1581_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1581_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1581_34)).doFinal(((byte[])(__sourceSpill1581_33)));
        (__sourceSpill1581_30)[__sourceSpill1581_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ä¢Ës\002ÐLX©[ó½üX"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1581_38 = local6_life21;
        int __sourceSpill1581_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1581_38)).substring(((int)(__sourceSpill1581_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1581_43 = local8_life19;
        int __sourceSpill1581_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1581_46 = new byte[8];
        (__sourceSpill1581_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1581_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1581_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1581_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1581_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1581_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1581_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1581_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1581_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1581_47)).doFinal(((byte[])(__sourceSpill1581_46)));
        (__sourceSpill1581_43)[__sourceSpill1581_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


public void b__Void() {
return;
}


public boolean b__Boolean() {
int forwardValue4143_23_0;
    int forwardValue4143_23_1;
    int forwardValue4143_31_0;
    int forwardValue4143_35_0;
    int forwardValue4143_37_0;
    int spill4143_0;
    int spill4143_1;
    int spill4143_2;
    long life1_3;
    int life3_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_31: {
    forward_join_23: {
    life1_3 = (moom.uC.p ^ 37084790799573L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4143_0 = this.f;
    spill4143_1 = (-this.g);
    if (!((life3_5 != 0))) {
        forwardValue4143_23_0 = spill4143_0;
        forwardValue4143_23_1 = spill4143_1;
        break forward_join_23;
    }
    if (!((spill4143_0 >= spill4143_1))) {
        break forward_join_36;
    }
    spill4143_2 = this.f;
    if (!((life3_5 != 0))) {
        forwardValue4143_31_0 = spill4143_2;
        break forward_join_31;
    }
    forwardValue4143_23_0 = spill4143_2;
    forwardValue4143_23_1 = __sourceIntrinsic_74e88f4b4822_invokedynamic4143_6(14123, (8862764073593815721L ^ life1_3));
    }
    if (!((forwardValue4143_23_0 <= forwardValue4143_23_1))) {
        break forward_join_36;
    }
    forwardValue4143_31_0 = ((((moom.uC)(this)).a(((net.minecraft.world.World)(((moom.sI)(this.c)).i)), ((moom.DT)(this.h)))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4143_35_0 = forwardValue4143_31_0;
        break forward_join_35;
    }
    if (!((forwardValue4143_31_0 != 0))) {
        break forward_join_36;
    }
    forwardValue4143_35_0 = 1;
    }
    forwardValue4143_37_0 = forwardValue4143_35_0;
    break forward_join_37;
    }
    forwardValue4143_37_0 = 0;
    }
    return ((forwardValue4143_37_0) != 0);
}


public void c() {
int forwardValue4144_63_0;
    moom.uC forwardValue4144_70_0;
    moom.uC spill4144_0;
    int spill4144_1;
    long life1_3;
    int life3_5;
    forward_join_75: {
    forward_join_70: {
    forward_join_66: {
    forward_join_63: {
    life1_3 = (moom.uC.p ^ 128237118152310L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4144_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4144_70_0 = spill4144_0;
        break forward_join_70;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.sI)(((moom.uC)(spill4144_0)).c)).b(((moom.DT)(((moom.DT)(this.h)).a__DT()))))), ((double)(0x1.0p0d))) > 0))) {
        break forward_join_66;
    }
    this.i = ((boolean)(false));
    moom.uC __stackOp4144_9_0 = this;
    ((moom.uC)(__stackOp4144_9_0)).f = ((int)((((moom.uC)(__stackOp4144_9_0)).f + 1)));
    spill4144_1 = (this.f % __sourceIntrinsic_5b7380e7aa7c_invokedynamic4144_13(9301, (1729524874943705970L ^ life1_3)));
    if (!((life3_5 != 0))) {
        forwardValue4144_63_0 = spill4144_1;
        break forward_join_63;
    }
    if (!((spill4144_1 == 0))) {
        break forward_join_75;
    }
    forwardValue4144_63_0 = ((((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((double)((((double) ((float) ((moom.DT)(this.h)).a())) + 0x1.0p-1d))), ((double)(((double) (((moom.DT)(this.h)).b() + 1)))), ((double)((((double) ((float) ((moom.DT)(this.h)).c())) + 0x1.0p-1d))), ((double)(this.d)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4144_63_0);
    if (!((life3_5 == 0))) {
        break forward_join_75;
    }
    }
    this.i = ((boolean)(true));
    forwardValue4144_70_0 = this;
    }
    moom.uC __stackOp4144_27_0 = forwardValue4144_70_0;
    ((moom.uC)(__stackOp4144_27_0)).f = ((int)((((moom.uC)(__stackOp4144_27_0)).f - 1)));
    }
    return;
}


protected boolean f() {
return ((((this.i) ? 1 : 0)) != 0);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uC.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26080;
      if (r[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/uC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
}


public boolean a__Boolean() {
int forwardValue4142_38_0;
    int spill4142_0;
    long life1_3;
    int life3_5;
    forward_join_38: {
    forward_join_19: {
    life1_3 = (moom.uC.p ^ 80303166510148L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4142_0 = this.e;
    if (!((life3_5 == 0))) {
        forwardValue4142_38_0 = spill4142_0;
        break forward_join_38;
    }
    if (!((spill4142_0 > 0))) {
        break forward_join_19;
    }
    moom.uC __stackOp4142_4_0 = this;
    ((moom.uC)(__stackOp4142_4_0)).e = ((int)((((moom.uC)(__stackOp4142_4_0)).e - 1)));
    return ((0) != 0);
    }
    this.e = ((int)((__sourceIntrinsic_1a14968dced5_invokedynamic4142_8(19386, (5206568223018636973L ^ life1_3)) + ((java.util.Random)(((moom.sI)(this.c)).a__Random())).nextInt(((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4142_11(9682, (6122445022924912838L ^ life1_3))))))));
    forwardValue4142_38_0 = ((this.g()) ? 1 : 0);
    }
    return ((forwardValue4142_38_0) != 0);
}


public void a__Void() {
long local1 = (moom.uC.p ^ 87022319987832L);
    ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((double)((((double) ((float) ((moom.DT)(this.h)).a())) + 0x1.0p-1d))), ((double)(((double) (((moom.DT)(this.h)).b() + 1)))), ((double)((((double) ((float) ((moom.DT)(this.h)).c())) + 0x1.0p-1d))), ((double)(this.d)));
    this.f = ((int)(0));
    this.g = ((int)((((java.util.Random)(((moom.sI)(this.c)).a__Random())).nextInt(((int)((((java.util.Random)(((moom.sI)(this.c)).a__Random())).nextInt(((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1672_16(27583, (5185339859574312597L ^ local1))))) + __sourceIntrinsic_b82a5b29b709_originalDynamicSite1672_18(14123, (8862717279697572356L ^ local1)))))) + __sourceIntrinsic_b82a5b29b709_originalDynamicSite1672_20(14123, (8862717279697572356L ^ local1)))));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9282_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected abstract boolean a(net.minecraft.world.World p0, moom.DT p1);

private boolean g() {
int forestValue508_26_0;
    int forestValue508_26_1;
    int forestValue508_46_0;
    int forestValue508_46_1;
    int forestValue508_48_0;
    int forestValue508_50_0;
    int forestValue508_82_0;
    int forestValue508_89_0;
    int forestValue508_91_0;
    int forestValue508_95_0;
    int forestValue508_102_0;
    int forestValue508_104_0;
    int forestValue508_111_0;
    int forestValue508_118_0;
    int forestValue508_120_0;
    int forestValue508_130_0;
    boolean spill508_0;
    int spill508_1;
    int spill508_2;
    int spill508_3;
    int spill508_4;
    int spill508_5;
    boolean spill508_6;
    boolean spill508_7;
    long life1_3;
    int life4_6;
    int life3_7;
    moom.DT life5_13;
    int life6_15;
    int life7_22;
    int life8_30;
    int life9_53;
    moom.DT life10_64;
    forest_join_130: {
    forest_join_129: {
    forest_join_124: {
    life1_3 = (moom.uC.p ^ 84370819769385L);
    spill508_0 = moom.uc.d();
    life4_6 = 1;
    life3_7 = ((spill508_0) ? 1 : 0);
    life5_13 = new moom.DT(this.c);
    life6_15 = 0;
    forest_cycle_16: while (true) {
    forest_join_120: {
    forest_join_118: {
    forest_join_117: {
    forest_join_111: {
    forest_join_110: {
    if (!((life6_15 <= 1))) {
        break forest_join_129;
    }
    spill508_1 = 0;
    if (!((life3_7 != 0))) {
        forestValue508_130_0 = spill508_1;
        break forest_join_130;
    }
    life7_22 = spill508_1;
    forest_cycle_23: while (true) {
    forest_join_107: {
    forestValue508_26_0 = life7_22;
    forestValue508_26_1 = this.j;
    forest_cycle_26: while (true) {
    if (!((forestValue508_26_0 < forestValue508_26_1))) {
        break forest_join_110;
    }
    spill508_2 = 0;
    if (!((life3_7 != 0))) {
        forestValue508_111_0 = spill508_2;
        break forest_join_111;
    }
    life8_30 = spill508_2;
    forest_cycle_31: while (true) {
    forest_join_104: {
    forest_join_102: {
    forest_join_101: {
    forest_join_95: {
    forest_join_94: {
    forest_join_50: {
    forest_join_49: {
    forest_join_48: {
    forest_join_46: {
    if (!((life8_30 <= life7_22))) {
        break forest_join_107;
    }
    spill508_3 = life8_30;
    spill508_4 = life7_22;
    if (!((life3_7 != 0))) {
        forestValue508_26_0 = spill508_3;
        forestValue508_26_1 = spill508_4;
        continue forest_cycle_26;
    }
    if (!((life3_7 != 0))) {
        forestValue508_46_0 = spill508_3;
        forestValue508_46_1 = spill508_4;
        break forest_join_46;
    }
    if (!((spill508_3 < spill508_4))) {
        break forest_join_49;
    }
    spill508_5 = life8_30;
    if (!((life3_7 != 0))) {
        forestValue508_48_0 = spill508_5;
        break forest_join_48;
    }
    forestValue508_46_0 = spill508_5;
    forestValue508_46_1 = (-life7_22);
    }
    if (!((forestValue508_46_0 > forestValue508_46_1))) {
        break forest_join_49;
    }
    forestValue508_48_0 = life7_22;
    }
    forestValue508_50_0 = forestValue508_48_0;
    break forest_join_50;
    }
    forestValue508_50_0 = 0;
    }
    life9_53 = forestValue508_50_0;
    forest_cycle_51: while (true) {
    forest_join_91: {
    forest_join_89: {
    forest_join_88: {
    forest_join_82: {
    forest_join_81: {
    if (!((life9_53 <= life7_22))) {
        break forest_join_94;
    }
    life10_64 = ((moom.DT)(life5_13)).a(((int)(life8_30)), ((int)((life6_15 - 1))), ((int)(life9_53)));
    spill508_6 = ((moom.sI)(this.c)).a__Boolean(((moom.DT)(life10_64)));
    if (!((life3_7 != 0))) {
        forestValue508_95_0 = ((spill508_6) ? 1 : 0);
        break forest_join_95;
    }
    if (!((life3_7 != 0))) {
        forestValue508_82_0 = ((spill508_6) ? 1 : 0);
        break forest_join_82;
    }
    if (!(spill508_6)) {
        break forest_join_81;
    }
    spill508_7 = ((moom.uC)(this)).a(((net.minecraft.world.World)(((moom.sI)(this.c)).i)), ((moom.DT)(life10_64)));
    if (!((life3_7 != 0))) {
        forestValue508_82_0 = ((spill508_7) ? 1 : 0);
        break forest_join_82;
    }
    if (!(spill508_7)) {
        break forest_join_81;
    }
    break forest_join_124;
    }
    forestValue508_82_0 = life9_53;
    }
    if (!((life3_7 != 0))) {
        forestValue508_89_0 = forestValue508_82_0;
        break forest_join_89;
    }
    if (!((forestValue508_82_0 > 0))) {
        break forest_join_88;
    }
    forestValue508_91_0 = (-life9_53);
    break forest_join_91;
    }
    forestValue508_89_0 = 1;
    }
    forestValue508_91_0 = (forestValue508_89_0 - life9_53);
    }
    life9_53 = forestValue508_91_0;
    if (!((life3_7 == 0))) {
        continue forest_cycle_51;
    }
    break forest_cycle_51;
    }
    }
    forestValue508_95_0 = life8_30;
    }
    if (!((life3_7 != 0))) {
        forestValue508_102_0 = forestValue508_95_0;
        break forest_join_102;
    }
    if (!((forestValue508_95_0 > 0))) {
        break forest_join_101;
    }
    forestValue508_104_0 = (-life8_30);
    break forest_join_104;
    }
    forestValue508_102_0 = 1;
    }
    forestValue508_104_0 = (forestValue508_102_0 - life8_30);
    }
    life8_30 = forestValue508_104_0;
    if (!((life3_7 == 0))) {
        continue forest_cycle_31;
    }
    break forest_cycle_31;
    }
    break forest_cycle_26;
    }
    }
    life7_22 += 1;
    if (!((life3_7 == 0))) {
        continue forest_cycle_23;
    }
    break forest_cycle_23;
    }
    }
    forestValue508_111_0 = life6_15;
    }
    if (!((life3_7 != 0))) {
        forestValue508_118_0 = forestValue508_111_0;
        break forest_join_118;
    }
    if (!((forestValue508_111_0 > 0))) {
        break forest_join_117;
    }
    forestValue508_120_0 = (-life6_15);
    break forest_join_120;
    }
    forestValue508_118_0 = 1;
    }
    forestValue508_120_0 = (forestValue508_118_0 - life6_15);
    }
    life6_15 = forestValue508_120_0;
    if (!((life3_7 == 0))) {
        continue forest_cycle_16;
    }
    break forest_cycle_16;
    }
    break forest_join_129;
    }
    this.h = ((moom.DT)(life10_64));
    return ((1) != 0);
    }
    forestValue508_130_0 = 0;
    }
    return ((forestValue508_130_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9282_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4142_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4142_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1672_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1672_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1672_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic4143_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4144_13(int a0, long a1) throws E;
}
