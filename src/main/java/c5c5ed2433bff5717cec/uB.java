package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class uB extends moom.uc {

private moom.sI c;

private double d;

private moom.AT e;

private moom.Ea f;

private boolean g;

private java.util.List<moom.Ea> h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public uB(moom.sI p0, double p1, boolean p2) { super(); }


private static void __sourceConstructorBody_17ee09a5a9c8a1bc(moom.uB receiver, moom.sI p0, double p1, boolean p2) throws Throwable {

long local5 = (moom.uB.i ^ 99874026696765L);

    moom.uB.__sourceConstructorInit_17ee09a5a9c8a1bc_0(((moom.uB)(receiver)));

    ((moom.uB)(receiver)).h = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.uB)(receiver)).c = ((moom.sI)(p0));

    ((moom.uB)(receiver)).d = ((double)(p1));

    ((moom.uB)(receiver)).g = ((boolean)(p2));

    ((moom.uB)(receiver)).a(((int)(1)));

    if ((((__sourceExactCall_61e3a024849730(((moom.sI)(p0))) instanceof moom.AW) ? 1 : 0) == 0)) {

        throw new java.lang.IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_17ee09a5a9c8a1bc_0(moom.uB a0) throws E;

static {
i = ((long)(((moom._a)(moom._c.a(((long)(-5099063468258239495L)), ((long)(-5976944103911378528L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219362742584843L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uB.i ^ 80402456812518L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1580_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1580_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1580_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1580_14 = new byte[8];
    (__sourceSpill1580_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1580_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1580_16 = __sourceSpill1580_14;
    ((javax.crypto.Cipher)(__sourceSpill1580_11)).init(((int)(__sourceSpill1580_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1580_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1580_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ËÕq­PÍò\022\"3ªJ@C'\003"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1580_25 = local6_life21;
        int __sourceSpill1580_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1580_25)).substring(((int)(__sourceSpill1580_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1580_30 = local8_life19;
        int __sourceSpill1580_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1580_33 = new byte[8];
        (__sourceSpill1580_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1580_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1580_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1580_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1580_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1580_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1580_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1580_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1580_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1580_34)).doFinal(((byte[])(__sourceSpill1580_33)));
        (__sourceSpill1580_30)[__sourceSpill1580_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "^6Â ý3}\030(M\\Ó\023ºA"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1580_38 = local6_life21;
        int __sourceSpill1580_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1580_38)).substring(((int)(__sourceSpill1580_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1580_43 = local8_life19;
        int __sourceSpill1580_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1580_46 = new byte[8];
        (__sourceSpill1580_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1580_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1580_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1580_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1580_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1580_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1580_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1580_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1580_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1580_47)).doFinal(((byte[])(__sourceSpill1580_46)));
        (__sourceSpill1580_43)[__sourceSpill1580_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public void b__Void() {
int forwardValue4140_29_0;
    boolean spill4140_0;
    int spill4140_1;
    long life1_3;
    int life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_24: {
    life1_3 = (moom.uB.i ^ 138616219697234L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4140_0 = ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4140_29_0 = ((spill4140_0) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill4140_0))) {
        break forward_join_24;
    }
    spill4140_1 = recovery.source.CarrierOps.dcmpg(((double)(((moom.sI)(this.c)).a(((moom.DT)(((moom.Ea)(this.f)).a__DT()))))), ((double)(0x1.0p4d)));
    if (!((life3_5 == 0))) {
        forwardValue4140_29_0 = spill4140_1;
        break forward_join_29;
    }
    if (!((spill4140_1 < 0))) {
        break forward_join_30;
    }
    }
    forwardValue4140_29_0 = ((((java.util.List)(this.h)).add(((java.lang.Object)(this.f)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4140_29_0);
    }
    return;
}


public boolean b__Boolean() {
moom.sI forwardValue4139_17_0;
    int forwardValue4139_36_0;
    int forwardValue4139_38_0;
    moom.sI spill4139_0;
    int spill4139_1;
    long life1_3;
    int life3_5;
    float life4_25;
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.uB.i ^ 57625304512715L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4139_0 = this.c;
    if (!((life3_5 == 0))) {
        forwardValue4139_17_0 = spill4139_0;
        break forward_join_17;
    }
    if (!(((moom.AV)(((moom.sI)(spill4139_0)).a__sourceReturn_407923443b())).a__Boolean())) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    forwardValue4139_17_0 = this.c;
    }
    life4_25 = (((moom.sI)(forwardValue4139_17_0)).G + 0x1.0p2f);
    spill4139_1 = recovery.source.CarrierOps.dcmpl(((double)(((moom.sI)(this.c)).a(((moom.DT)(((moom.Ea)(this.f)).a__DT()))))), ((double)(((double) (life4_25 * life4_25)))));
    if (!((life3_5 == 0))) {
        forwardValue4139_36_0 = spill4139_1;
        break forward_join_36;
    }
    if (!((spill4139_1 > 0))) {
        break forward_join_37;
    }
    forwardValue4139_36_0 = 1;
    }
    forwardValue4139_38_0 = forwardValue4139_36_0;
    break forward_join_38;
    }
    forwardValue4139_38_0 = 0;
    }
    return ((forwardValue4139_38_0) != 0);
}


private void d__sourceReturn_da8c82d5d4() {
java.lang.Object forwardValue4141_21_0;
    java.util.List spill4141_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    life1_3 = (moom.uB.i ^ 77639444187382L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4141_0 = this.h;
    if (!((life3_5 != 0))) {
        forwardValue4141_21_0 = spill4141_0;
        break forward_join_21;
    }
    if (!((((java.util.List)(spill4141_0)).size() > __sourceIntrinsic_6cce62949456_invokedynamic4141_5(22891, (4765097226310206279L ^ life1_3))))) {
        break forward_join_22;
    }
    forwardValue4141_21_0 = ((java.util.List)(this.h)).remove(((int)(0)));
    }
    recovery.source.CarrierOps.discard(forwardValue4141_21_0);
    }
    return;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31348;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/uB", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9275_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uB.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a__Boolean() {
moom.uB forwardValue4138_23_0;
    net.minecraft.world.World forwardValue4138_25_0;
    moom.uB forwardValue4138_53_0;
    moom.uB forwardValue4138_81_0;
    int forwardValue4138_142_0;
    boolean spill4138_0;
    moom.uB spill4138_1;
    net.minecraft.world.World spill4138_2;
    moom.uB spill4138_3;
    moom.uB spill4138_4;
    long life1_3;
    int life3_7;
    net.minecraft.village.Village life4_44;
    moom.AW life5_77;
    int life6_80;
    moom.DR life7_137;
    forward_join_142: {
    forward_join_141: {
    forward_join_136: {
    forward_join_118: {
    forward_join_81: {
    forward_join_80: {
    forward_join_53: {
    forward_join_52: {
    forward_join_45: {
    forward_join_40: {
    forward_join_25: {
    forward_join_23: {
    forward_join_22: {
    life1_3 = (moom.uB.i ^ 102098346758234L);
    spill4138_0 = moom.uc.e();
    ((moom.uB)(this)).d__sourceReturn_da8c82d5d4();
    life3_7 = ((spill4138_0) ? 1 : 0);
    spill4138_1 = this;
    if (!((life3_7 == 0))) {
        forwardValue4138_23_0 = spill4138_1;
        break forward_join_23;
    }
    if (!(((moom.uB)(spill4138_1)).g)) {
        break forward_join_22;
    }
    spill4138_2 = ((moom.sI)(this.c)).i;
    if (!((life3_7 == 0))) {
        forwardValue4138_25_0 = spill4138_2;
        break forward_join_25;
    }
    if (!(((net.minecraft.world.World)(spill4138_2)).e__Boolean())) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    forwardValue4138_23_0 = this;
    }
    forwardValue4138_25_0 = ((moom.sI)(((moom.uB)(forwardValue4138_23_0)).c)).i;
    }
    life4_44 = ((moom.EG)(((net.minecraft.world.World)(forwardValue4138_25_0)).a__EG())).a(((moom.DT)(new moom.DT(this.c))), ((int)(0)));
    if (!((life3_7 == 0))) {
        break forward_join_45;
    }
    if (!((life4_44 == null))) {
        break forward_join_40;
    }
    return ((0) != 0);
    }
    this.f = ((moom.Ea)(((moom.uB)(this)).a(((net.minecraft.village.Village)(life4_44)))));
    }
    spill4138_3 = this;
    if (!((life3_7 == 0))) {
        forwardValue4138_53_0 = spill4138_3;
        break forward_join_53;
    }
    if (!((((moom.uB)(spill4138_3)).f == null))) {
        break forward_join_52;
    }
    return ((0) != 0);
    }
    forwardValue4138_53_0 = this;
    }
    life5_77 = ((moom.AW)(((moom.sI)(((moom.uB)(forwardValue4138_53_0)).c)).a__sourceReturn_407923443b()));
    life6_80 = ((((moom.AW)(life5_77)).e()) ? 1 : 0);
    ((moom.AW)(life5_77)).b(((boolean)(false)));
    this.e = ((moom.AT)(((moom.AW)(life5_77)).a(((moom.DT)(((moom.Ea)(this.f)).a__DT())))));
    ((moom.AW)(life5_77)).b(((boolean)__sourceIntrinsic_integerToBoolean((life6_80))));
    spill4138_4 = this;
    if (!((life3_7 == 0))) {
        forwardValue4138_81_0 = spill4138_4;
        break forward_join_81;
    }
    if (!((((moom.uB)(spill4138_4)).e != null))) {
        break forward_join_80;
    }
    return ((1) != 0);
    }
    forwardValue4138_81_0 = this;
    }
    life7_137 = moom.vA.a(((moom.sI)(((moom.uB)(forwardValue4138_81_0)).c)), ((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4138_33(30990, (268972199263566733L ^ life1_3)))), ((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4138_34(11442, (3485546145279422000L ^ life1_3)))), ((moom.DR)(new moom.DR(((double) ((moom.DT)(((moom.Ea)(this.f)).a__DT())).a()), ((double) ((moom.DT)(((moom.Ea)(this.f)).a__DT())).b()), ((double) ((moom.DT)(((moom.Ea)(this.f)).a__DT())).c())))));
    if (!((life3_7 == 0))) {
        break forward_join_136;
    }
    if (!((life7_137 == null))) {
        break forward_join_118;
    }
    return ((0) != 0);
    }
    ((moom.AW)(life5_77)).b(((boolean)(false)));
    this.e = ((moom.AT)(((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((double)(((moom.DR)(life7_137)).a)), ((double)(((moom.DR)(life7_137)).b)), ((double)(((moom.DR)(life7_137)).c)))));
    ((moom.AW)(life5_77)).b(((boolean)__sourceIntrinsic_integerToBoolean((life6_80))));
    }
    if (!((this.e != null))) {
        break forward_join_141;
    }
    forwardValue4138_142_0 = 1;
    break forward_join_142;
    }
    forwardValue4138_142_0 = 0;
    }
    return ((forwardValue4138_142_0) != 0);
}


public void a__Void() {
((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((moom.AT)(this.e)), ((double)(this.d)));
    return;
}


private moom.Ea a(net.minecraft.village.Village p0) {
int lexicalValue1329_50_0;
    int lexicalValue1329_56_0;
    moom.Ea lexicalValue1329_60_0;
    boolean spill1329_0;
    moom.Ea spill1329_1;
    int spill1329_2;
    long life2_3;
    moom.Ea life5_6;
    int life4_7;
    int life6_13;
    java.util.Iterator life7_17;
    moom.Ea life8_24;
    int life9_41;
    lexical_join_60: {
    lexical_join_59: {
    life2_3 = (moom.uB.i ^ 77906303824932L);
    spill1329_0 = moom.uc.d();
    life5_6 = null;
    life4_7 = ((spill1329_0) ? 1 : 0);
    life6_13 = __sourceIntrinsic_807a3d7b184c_invokedynamic1329_3(10799, (8118849414686526672L ^ life2_3));
    life7_17 = ((java.util.List)(((net.minecraft.village.Village)(p0)).a__List())).iterator();
    lexical_cycle_18: while (true) {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_50: {
    if (!(((java.util.Iterator)(life7_17)).hasNext())) {
        break lexical_join_59;
    }
    life8_24 = ((moom.Ea)(((java.util.Iterator)(life7_17)).next()));
    spill1329_1 = life8_24;
    if (!((life4_7 != 0))) {
        lexicalValue1329_60_0 = spill1329_1;
        break lexical_join_60;
    }
    life9_41 = ((moom.Ea)(spill1329_1)).a(((int)(moom.Dr.b__Int(((double)(((moom.sI)(this.c)).n))))), ((int)(moom.Dr.b__Int(((double)(((moom.sI)(this.c)).o))))), ((int)(moom.Dr.b__Int(((double)(((moom.sI)(this.c)).p))))));
    spill1329_2 = life9_41;
    if (!((life4_7 != 0))) {
        lexicalValue1329_50_0 = spill1329_2;
        break lexical_join_50;
    }
    if (!((spill1329_2 < life6_13))) {
        break lexical_join_57;
    }
    lexicalValue1329_50_0 = ((((moom.uB)(this)).a(((moom.Ea)(life8_24)))) ? 1 : 0);
    }
    if (!((life4_7 != 0))) {
        lexicalValue1329_56_0 = lexicalValue1329_50_0;
        break lexical_join_56;
    }
    if (!((lexicalValue1329_50_0 == 0))) {
        break lexical_join_57;
    }
    life5_6 = life8_24;
    lexicalValue1329_56_0 = life9_41;
    }
    life6_13 = lexicalValue1329_56_0;
    }
    if (!((life4_7 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1329_60_0 = life5_6;
    }
    return lexicalValue1329_60_0;
}


private boolean a(moom.Ea p0) {
int lexicalValue1328_28_0;
    int lexicalValue1328_32_0;
    boolean spill1328_0;
    boolean spill1328_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    moom.Ea life6_16;
    lexical_join_32: {
    lexical_join_31: {
    life2_3 = (moom.uB.i ^ 107613781466171L);
    spill1328_0 = moom.uc.d();
    life5_8 = ((java.util.List)(this.h)).iterator();
    life4_9 = ((spill1328_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_29: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_31;
    }
    life6_16 = ((moom.Ea)(((java.util.Iterator)(life5_8)).next()));
    spill1328_1 = ((moom.DT)(((moom.Ea)(p0)).a__DT())).equals(((java.lang.Object)(((moom.Ea)(life6_16)).a__DT())));
    if (!((life4_9 != 0))) {
        lexicalValue1328_32_0 = ((spill1328_1) ? 1 : 0);
        break lexical_join_32;
    }
    if (!((life4_9 != 0))) {
        lexicalValue1328_28_0 = ((spill1328_1) ? 1 : 0);
        break lexical_join_28;
    }
    if (!(spill1328_1)) {
        break lexical_join_29;
    }
    lexicalValue1328_28_0 = 1;
    }
    return ((lexicalValue1328_28_0) != 0);
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1328_32_0 = 0;
    }
    return ((lexicalValue1328_32_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic4141_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9275_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4138_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4138_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_807a3d7b184c_invokedynamic1329_3(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native moom.AV __sourceExactCall_61e3a024849730(moom.sI p0);
}
