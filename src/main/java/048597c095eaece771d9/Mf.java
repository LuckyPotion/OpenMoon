package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Mf {

private final net.minecraft.client.Minecraft a;

private boolean b;

private boolean c;

int d;

private moom.DR e;

float f;

private boolean g;

private int h;

private moom.DR i;

private double j;

private double k;

private double l;

private int m;

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public Mf(net.minecraft.client.Minecraft p0) {
super();
    this.b = false;
    this.c = false;
    this.g = false;
    this.h = 0;
    this.i = new moom.DR(-0x1.0000000000000p+0d, -0x1.0000000000000p+0d, -0x1.0000000000000p+0d);
    this.j = 0x0.0p+0d;
    this.k = 0x0.0p+0d;
    this.l = 0x0.0p+0d;
    this.m = -1;
    this.a = p0;
    this.m = net.minecraft.client.renderer.GLAllocation.a(1);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-8543233085244961507L)), ((long)(-3382854031750611759L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24952328209534L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Mf.n ^ 9452781700933L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill704_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill704_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill704_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill704_14 = new byte[8];
    (__sourceSpill704_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill704_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation704_16 = __sourceSpill704_14;
    ((javax.crypto.Cipher)(__sourceSpill704_11)).init(((int)(__sourceSpill704_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill704_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation704_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "±N¤se¶¼\004È·ZWjº"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill704_25 = local6_life21;
        int __sourceSpill704_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill704_25)).substring(((int)(__sourceSpill704_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill704_30 = local8_life19;
        int __sourceSpill704_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill704_33 = new byte[8];
        (__sourceSpill704_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill704_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill704_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill704_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill704_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill704_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill704_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill704_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill704_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill704_34)).doFinal(((byte[])(__sourceSpill704_33)));
        (__sourceSpill704_30)[__sourceSpill704_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b() {
org.lwjgl.opengl.GL11.glEndList();
    this.g = ((boolean)__sourceIntrinsic_integerToBoolean((((this.c) ? 1 : 0))));
    this.h = ((int)(this.d));
    this.i = ((moom.DR)(this.e));
    this.j = ((double)(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.a)).a__r3())).k));
    this.k = ((double)(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.a)).a__r3())).l));
    this.l = ((double)(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(this.a)).a__r3())).m));
    this.b = ((boolean)(true));
    moom.kZ.D();
    return;
}


public void c() {
long life1_3;
    net.minecraft.entity.Entity life4_7;
    double life5_20;
    double life7_33;
    double life9_46;
    double life11_57;
    float life13_68;
    float life14_74;
    float life15_80;
    net.minecraft.entity.Entity[] life3_82;
    forward_join_118: {
    forward_join_108: {
    forward_join_101: {
    forward_join_99: {
    life1_3 = (moom.Mf.n ^ 85094661479017L);
    life4_7 = ((net.minecraft.client.Minecraft)(this.a)).a__r3();
    life5_20 = (((net.minecraft.entity.Entity)(life4_7)).k + ((((net.minecraft.entity.Entity)(life4_7)).n - ((net.minecraft.entity.Entity)(life4_7)).k) * ((double) this.f)));
    life7_33 = (((net.minecraft.entity.Entity)(life4_7)).l + ((((net.minecraft.entity.Entity)(life4_7)).o - ((net.minecraft.entity.Entity)(life4_7)).l) * ((double) this.f)));
    life9_46 = (((net.minecraft.entity.Entity)(life4_7)).m + ((((net.minecraft.entity.Entity)(life4_7)).p - ((net.minecraft.entity.Entity)(life4_7)).m) * ((double) this.f)));
    life11_57 = ((double) (((float) (this.d - this.h)) + this.f));
    net.minecraft.entity.Entity[] spill3209_0 = moom.Mi.b__Arrayr3();
    life13_68 = ((float) ((life5_20 - this.j) + (life11_57 * 0x1.eb851eb851eb8p-6d)));
    life14_74 = ((float) (life7_33 - this.k));
    life15_80 = ((float) (life9_46 - this.l));
    moom.kZ.B();
    life3_82 = spill3209_0;
    if (!((life3_82 == null))) { break forward_join_99; }
    if (!(this.c)) { break forward_join_101; }
    moom.kZ.b(((float)(((-life13_68) / 0x1.8p3f))), ((float)((-life14_74))), ((float)(((-life15_80) / 0x1.8p3f))));
    }
    if (!((life3_82 != null))) { break forward_join_108; }
    }
    moom.kZ.b(((float)((-life13_68))), ((float)((-life14_74))), ((float)((-life15_80))));
    }
    moom.kZ.p(((int)(this.m)));
    moom.kZ.C();
    moom.kZ.D();
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) { break forward_join_118; }
    moom.Mi.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));
    }
    return;
}


public void d() {
this.b = ((boolean)(false));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x58A2;
        if (p[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Mf", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Mf.p[n4] = n6;
        }
        return p[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Mf.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6399_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(boolean p0, int p1, float p2, moom.DR p3) {
this.c = ((boolean)(p0));
    this.d = ((int)(p1));
    this.f = ((float)(p2));
    this.e = ((moom.DR)(p3));
    return;
}


public boolean a__Boolean() {
int forwardValue2716_15_0;
    int forwardValue2716_34_0;
    int forwardValue2716_34_1;
    int forwardValue2716_47_0;
    int forwardValue2716_62_0;
    int forwardValue2716_79_0;
    moom.Mf forwardValue2716_83_0;
    int forwardValue2716_106_0;
    int forwardValue2716_108_0;
    int forwardValue2716_129_0;
    int forwardValue2716_131_0;
    int forwardValue2716_138_0;
    int forwardValue2716_140_0;
    boolean spill2716_0;
    boolean spill2716_1;
    int spill2716_2;
    moom.Mf spill2716_3;
    int spill2716_4;
    int spill2716_5;
    int spill2716_6;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.entity.Entity life4_115;
    int life5_141;
    int life6_167;
    forward_join_140: {
    forward_join_139: {
    forward_join_138: {
    forward_join_131: {
    forward_join_130: {
    forward_join_129: {
    forward_join_108: {
    forward_join_107: {
    forward_join_106: {
    forward_join_83: {
    forward_join_82: {
    forward_join_79: {
    forward_join_67: {
    forward_join_62: {
    forward_join_52: {
    forward_join_47: {
    forward_join_37: {
    forward_join_34: {
    forward_join_22: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.Mf.n ^ 87773771647165L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2716_0 = this.b;
    if (!((life3_5 == null))) {
        forwardValue2716_15_0 = ((spill2716_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill2716_0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue2716_15_0 = ((this.c) ? 1 : 0);
    }
    spill2716_1 = this.g;
    if (!((life3_5 == null))) {
        forwardValue2716_34_0 = forwardValue2716_15_0;
        forwardValue2716_34_1 = ((spill2716_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!((forwardValue2716_15_0 != ((spill2716_1) ? 1 : 0)))) {
        break forward_join_22;
    }
    return ((1) != 0);
    }
    spill2716_2 = this.d;
    if (!((life3_5 == null))) {
        forwardValue2716_47_0 = spill2716_2;
        break forward_join_47;
    }
    forwardValue2716_34_0 = spill2716_2;
    forwardValue2716_34_1 = (this.h + __sourceIntrinsic_1a14968dced5_invokedynamic2716_12(32489, (4882933310259327901L ^ life1_3)));
    }
    if (!((forwardValue2716_34_0 >= forwardValue2716_34_1))) {
        break forward_join_37;
    }
    return ((1) != 0);
    }
    forwardValue2716_47_0 = recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)((((moom.DR)(this.e)).a - ((moom.DR)(this.i)).a)))))), ((double)(0x1.89374bc6a7efap-9d)));
    }
    if (!((life3_5 == null))) {
        forwardValue2716_62_0 = forwardValue2716_47_0;
        break forward_join_62;
    }
    if (!((forwardValue2716_47_0 > 0))) {
        break forward_join_52;
    }
    return ((1) != 0);
    }
    forwardValue2716_62_0 = recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)((((moom.DR)(this.e)).b - ((moom.DR)(this.i)).b)))))), ((double)(0x1.89374bc6a7efap-9d)));
    }
    if (!((life3_5 == null))) {
        forwardValue2716_79_0 = forwardValue2716_62_0;
        break forward_join_79;
    }
    if (!((forwardValue2716_62_0 > 0))) {
        break forward_join_67;
    }
    return ((1) != 0);
    }
    spill2716_3 = this;
    if (!((life3_5 == null))) {
        forwardValue2716_83_0 = spill2716_3;
        break forward_join_83;
    }
    forwardValue2716_79_0 = recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)((((moom.DR)(((moom.Mf)(spill2716_3)).e)).c - ((moom.DR)(this.i)).c)))))), ((double)(0x1.89374bc6a7efap-9d)));
    }
    if (!((forwardValue2716_79_0 > 0))) {
        break forward_join_82;
    }
    return ((1) != 0);
    }
    forwardValue2716_83_0 = this;
    }
    life4_115 = ((net.minecraft.client.Minecraft)(((moom.Mf)(forwardValue2716_83_0)).a)).a__r3();
    spill2716_4 = recovery.source.CarrierOps.dcmpg(((double)((this.k + ((double) ((net.minecraft.entity.Entity)(life4_115)).e__Float())))), ((double)((0x1.0p7d + ((double) (((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.a)).W)).bf * 0x1.0p7f))))));
    if (!((life3_5 == null))) {
        forwardValue2716_106_0 = spill2716_4;
        break forward_join_106;
    }
    if (!((spill2716_4 < 0))) {
        break forward_join_107;
    }
    forwardValue2716_106_0 = 1;
    }
    forwardValue2716_108_0 = forwardValue2716_106_0;
    break forward_join_108;
    }
    forwardValue2716_108_0 = 0;
    }
    life5_141 = forwardValue2716_108_0;
    spill2716_5 = recovery.source.CarrierOps.dcmpg(((double)((((net.minecraft.entity.Entity)(life4_115)).l + ((double) ((net.minecraft.entity.Entity)(life4_115)).e__Float())))), ((double)((0x1.0p7d + ((double) (((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.a)).W)).bf * 0x1.0p7f))))));
    if (!((life3_5 == null))) {
        forwardValue2716_129_0 = spill2716_5;
        break forward_join_129;
    }
    if (!((spill2716_5 < 0))) {
        break forward_join_130;
    }
    forwardValue2716_129_0 = 1;
    }
    forwardValue2716_131_0 = forwardValue2716_129_0;
    break forward_join_131;
    }
    forwardValue2716_131_0 = 0;
    }
    life6_167 = forwardValue2716_131_0;
    spill2716_6 = life6_167;
    if (!((life3_5 == null))) {
        forwardValue2716_138_0 = spill2716_6;
        break forward_join_138;
    }
    if (!((spill2716_6 != life5_141))) {
        break forward_join_139;
    }
    forwardValue2716_138_0 = 1;
    }
    forwardValue2716_140_0 = forwardValue2716_138_0;
    break forward_join_140;
    }
    forwardValue2716_140_0 = 0;
    }
    return ((forwardValue2716_140_0) != 0);
}


public void a() {
long local1_life2 = (moom.Mf.n ^ 10285693278195L);
    org.lwjgl.opengl.GL11.glNewList(((int)(this.m)), ((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite592_5(29162, (6070699979836498897L ^ local1_life2)))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite592_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6399_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic2716_12(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
