package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class zm implements moom.yK<moom.y3> {

private boolean a;

private boolean b;

private boolean c;

private boolean d;

private float e;

private float f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public zm(boolean p0, boolean p1, boolean p2, boolean p3, float p4, float p5) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
}


public zm(net.minecraft.entity.player.PlayerCapabilities p0) {
super();
    (this).a__Void(p0.a);
    (this).b__Void(p0.b);
    (this).c__Void(p0.c);
    (this).d__Void(p0.d);
    (this).a__Void((p0).a());
    (this).b__Void((p0).b());
}


public zm() {
super();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(1350759182761331428L)), ((long)(-9173803051510399019L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(83682799162267L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.zm.g ^ 92011113930836L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1147_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1147_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1147_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1147_14 = new byte[8];
    (__sourceSpill1147_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1147_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1147_16 = __sourceSpill1147_14;
    ((javax.crypto.Cipher)(__sourceSpill1147_11)).init(((int)(__sourceSpill1147_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1147_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1147_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "(-\n±BBóJ:.Uòª"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1147_25 = local6_life21;
        int __sourceSpill1147_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1147_25)).substring(((int)(__sourceSpill1147_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1147_30 = local8_life19;
        int __sourceSpill1147_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1147_33 = new byte[8];
        (__sourceSpill1147_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1147_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1147_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1147_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1147_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1147_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1147_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1147_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1147_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1147_34)).doFinal(((byte[])(__sourceSpill1147_33)));
        (__sourceSpill1147_30)[__sourceSpill1147_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public boolean b__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public void b__Void(boolean p0) {
this.b = ((boolean)(p0));
    return;
}


public float b() {
return this.f;
}


public void b__Void(float p0) {
this.f = ((float)(p0));
    return;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int forwardValue4608_20_0;
    int forwardValue4608_30_0;
    int forwardValue4608_40_0;
    int forwardValue4608_51_0;
    boolean spill4608_0;
    boolean spill4608_1;
    long life2_3;
    int life5_6;
    int life4_7;
    forward_join_52: {
    forward_join_51: {
    forward_join_40: {
    forward_join_38: {
    forward_join_30: {
    forward_join_28: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (moom.zm.g ^ 90085638167853L);
    spill4608_0 = moom.y7.j();
    life5_6 = 0;
    life4_7 = ((spill4608_0) ? 1 : 0);
    spill4608_1 = ((moom.zm)(this)).a__Boolean();
    if (!((life4_7 == 0))) {
        forwardValue4608_20_0 = ((spill4608_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4608_1)) {
        break forward_join_18;
    }
    life5_6 = ((byte) (life5_6 | 1));
    }
    forwardValue4608_20_0 = ((((moom.zm)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((life4_7 == 0))) {
        forwardValue4608_30_0 = forwardValue4608_20_0;
        break forward_join_30;
    }
    if (!((forwardValue4608_20_0 != 0))) {
        break forward_join_28;
    }
    life5_6 = ((byte) (life5_6 | 2));
    }
    forwardValue4608_30_0 = ((((moom.zm)(this)).c()) ? 1 : 0);
    }
    if (!((life4_7 == 0))) {
        forwardValue4608_40_0 = forwardValue4608_30_0;
        break forward_join_40;
    }
    if (!((forwardValue4608_30_0 != 0))) {
        break forward_join_38;
    }
    life5_6 = ((byte) (life5_6 | 4));
    }
    forwardValue4608_40_0 = ((((moom.zm)(this)).d()) ? 1 : 0);
    }
    if (!((life4_7 == 0))) {
        forwardValue4608_51_0 = forwardValue4608_40_0;
        break forward_join_51;
    }
    if (!((forwardValue4608_40_0 != 0))) {
        break forward_join_52;
    }
    forwardValue4608_51_0 = ((int)(((byte) (life5_6 | __sourceIntrinsic_0875c19f50e0_invokedynamic4608_11(18986, (1164184909970271132L ^ life2_3))))));
    }
    life5_6 = forwardValue4608_51_0;
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(life5_6)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.f)));
    return;
}


public moom.zm b(float p0) {
this.f = ((float)(p0));
    return this;
}


public moom.zm b(boolean p0) {
this.b = ((boolean)(p0));
    return this;
}


public boolean e() {
return ((((this.a) ? 1 : 0)) != 0);
}


public boolean c() {
return ((((this.c) ? 1 : 0)) != 0);
}


public void c__Void(boolean p0) {
this.c = ((boolean)(p0));
    return;
}


public moom.zm c(boolean p0) {
this.c = ((boolean)(p0));
    return this;
}


public boolean h() {
return ((((this.d) ? 1 : 0)) != 0);
}


public boolean f() {
return ((((this.b) ? 1 : 0)) != 0);
}


public boolean d() {
return ((((this.d) ? 1 : 0)) != 0);
}


public void d__Void(boolean p0) {
this.d = ((boolean)(p0));
    return;
}


public moom.zm d(boolean p0) {
this.d = ((boolean)(p0));
    return this;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
moom.zm forwardValue4607_17_0;
    int forwardValue4607_17_1;
    moom.zm forwardValue4607_18_0;
    moom.zm forwardValue4607_19_0;
    int forwardValue4607_19_1;
    moom.zm forwardValue4607_28_0;
    int forwardValue4607_28_1;
    moom.zm forwardValue4607_29_0;
    moom.zm forwardValue4607_30_0;
    int forwardValue4607_30_1;
    moom.zm forwardValue4607_39_0;
    int forwardValue4607_39_1;
    moom.zm forwardValue4607_40_0;
    moom.zm forwardValue4607_41_0;
    int forwardValue4607_41_1;
    moom.zm forwardValue4607_54_0;
    int forwardValue4607_54_1;
    moom.zm forwardValue4607_55_0;
    moom.zm forwardValue4607_56_0;
    int forwardValue4607_56_1;
    boolean spill4607_0;
    moom.zm spill4607_1;
    int spill4607_2;
    moom.zm spill4607_3;
    int spill4607_4;
    moom.zm spill4607_5;
    int spill4607_6;
    moom.zm spill4607_7;
    int spill4607_8;
    long life2_3;
    int life5_7;
    int life4_8;
    forward_join_70: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.zm.g ^ 43135432855204L);
    spill4607_0 = moom.y7.i();
    life5_7 = ((net.minecraft.network.PacketBuffer)(p0)).readByte();
    life4_8 = ((spill4607_0) ? 1 : 0);
    spill4607_1 = this;
    spill4607_2 = (life5_7 & 1);
    if (!((life4_8 != 0))) {
        forwardValue4607_17_0 = spill4607_1;
        forwardValue4607_17_1 = spill4607_2;
        break forward_join_17;
    }
    if (!((spill4607_2 > 0))) {
        forwardValue4607_18_0 = spill4607_1;
        break forward_join_18;
    }
    forwardValue4607_17_0 = spill4607_1;
    forwardValue4607_17_1 = 1;
    }
    forwardValue4607_19_0 = forwardValue4607_17_0;
    forwardValue4607_19_1 = forwardValue4607_17_1;
    break forward_join_19;
    }
    forwardValue4607_19_0 = forwardValue4607_18_0;
    forwardValue4607_19_1 = 0;
    }
    ((moom.zm)(forwardValue4607_19_0)).a__Void(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4607_19_1))));
    spill4607_3 = this;
    spill4607_4 = (life5_7 & 2);
    if (!((life4_8 != 0))) {
        forwardValue4607_28_0 = spill4607_3;
        forwardValue4607_28_1 = spill4607_4;
        break forward_join_28;
    }
    if (!((spill4607_4 > 0))) {
        forwardValue4607_29_0 = spill4607_3;
        break forward_join_29;
    }
    forwardValue4607_28_0 = spill4607_3;
    forwardValue4607_28_1 = 1;
    }
    forwardValue4607_30_0 = forwardValue4607_28_0;
    forwardValue4607_30_1 = forwardValue4607_28_1;
    break forward_join_30;
    }
    forwardValue4607_30_0 = forwardValue4607_29_0;
    forwardValue4607_30_1 = 0;
    }
    ((moom.zm)(forwardValue4607_30_0)).b__Void(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4607_30_1))));
    spill4607_5 = this;
    spill4607_6 = (life5_7 & 4);
    if (!((life4_8 != 0))) {
        forwardValue4607_39_0 = spill4607_5;
        forwardValue4607_39_1 = spill4607_6;
        break forward_join_39;
    }
    if (!((spill4607_6 > 0))) {
        forwardValue4607_40_0 = spill4607_5;
        break forward_join_40;
    }
    forwardValue4607_39_0 = spill4607_5;
    forwardValue4607_39_1 = 1;
    }
    forwardValue4607_41_0 = forwardValue4607_39_0;
    forwardValue4607_41_1 = forwardValue4607_39_1;
    break forward_join_41;
    }
    forwardValue4607_41_0 = forwardValue4607_40_0;
    forwardValue4607_41_1 = 0;
    }
    ((moom.zm)(forwardValue4607_41_0)).c__Void(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4607_41_1))));
    spill4607_7 = this;
    spill4607_8 = (life5_7 & __sourceIntrinsic_ba748fb9d83f_invokedynamic4607_7(378, (2582217496764511044L ^ life2_3)));
    if (!((life4_8 != 0))) {
        forwardValue4607_54_0 = spill4607_7;
        forwardValue4607_54_1 = spill4607_8;
        break forward_join_54;
    }
    if (!((spill4607_8 > 0))) {
        forwardValue4607_55_0 = spill4607_7;
        break forward_join_55;
    }
    forwardValue4607_54_0 = spill4607_7;
    forwardValue4607_54_1 = 1;
    }
    forwardValue4607_56_0 = forwardValue4607_54_0;
    forwardValue4607_56_1 = forwardValue4607_54_1;
    break forward_join_56;
    }
    forwardValue4607_56_0 = forwardValue4607_55_0;
    forwardValue4607_56_1 = 0;
    }
    ((moom.zm)(forwardValue4607_56_0)).d__Void(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4607_56_1))));
    ((moom.zm)(this)).a__Void(((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat())));
    ((moom.zm)(this)).b__Void(((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat())));
    if (!((life4_8 == 0))) {
        break forward_join_70;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zm)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zm)(this)));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19543;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/zm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.zm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9898_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/zm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public float a() {
return this.e;
}


public moom.zm a(boolean p0) {
this.a = ((boolean)(p0));
    return this;
}


public void a__Void(boolean p0) {
this.a = ((boolean)(p0));
    return;
}


public moom.zm a(float p0) {
this.e = ((float)(p0));
    return this;
}


public void a__Void(float p0) {
this.e = ((float)(p0));
    return;
}


public boolean a__Boolean() {
return ((((this.a) ? 1 : 0)) != 0);
}


public boolean g() {
return ((((this.c) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_0875c19f50e0_invokedynamic4608_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic4607_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9898_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
