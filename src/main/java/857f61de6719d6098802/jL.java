package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jL {

public java.lang.String a;

public java.lang.String b;

public java.lang.String c;

public java.lang.String d;

public long e;

public int f;

public java.lang.String g;

public boolean h;

public java.lang.String i;

private moom.az j;

private java.lang.String k;

private boolean l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public jL(java.lang.String p0, java.lang.String p1, boolean p2) { super(); }


private static void __sourceConstructorBody_702f4482df3b967c(moom.jL receiver, java.lang.String p0, java.lang.String p1, boolean p2) throws Throwable {

long local4 = (moom.jL.m ^ 78526671418017L);

    moom.jL.__sourceConstructorInit_702f4482df3b967c_0(((moom.jL)(receiver)));

    ((moom.jL)(receiver)).f = ((int)(__sourceIntrinsic_702f4482df3b967c_originalDynamicSite2956_2(13255, (662570256378400292L ^ local4))));

    ((moom.jL)(receiver)).g = ((java.lang.String)("1.8.9"));

    ((moom.jL)(receiver)).j = ((moom.az)(moom.az.PROMPT));

    ((moom.jL)(receiver)).a = ((java.lang.String)(p0));

    ((moom.jL)(receiver)).b = ((java.lang.String)(p1));

    ((moom.jL)(receiver)).l = ((boolean)(p2));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_702f4482df3b967c_0(moom.jL a0) throws E;

static {
m = ((long)(((moom._a)(moom._c.a(((long)(-5840079035142094563L)), ((long)(8575383024121337665L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78424476733494L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jL.m ^ 54271045030021L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill894_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill894_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill894_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill894_14 = new byte[8];
    (__sourceSpill894_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill894_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation894_16 = __sourceSpill894_14;
    ((javax.crypto.Cipher)(__sourceSpill894_11)).init(((int)(__sourceSpill894_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill894_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation894_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÀO\024äðûcÜF|ÿPÇµØX"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill894_25 = local6_life21;
        int __sourceSpill894_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill894_25)).substring(((int)(__sourceSpill894_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill894_30 = local8_life19;
        int __sourceSpill894_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill894_33 = new byte[8];
        (__sourceSpill894_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill894_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill894_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill894_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill894_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill894_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill894_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill894_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill894_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill894_34)).doFinal(((byte[])(__sourceSpill894_33)));
        (__sourceSpill894_30)[__sourceSpill894_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.jL p0) {
this.b = ((java.lang.String)(((moom.jL)(p0)).b));
    this.a = ((java.lang.String)(((moom.jL)(p0)).a));
    ((moom.jL)(this)).a(((moom.az)(((moom.jL)(p0)).a__az())));
    this.k = ((java.lang.String)(((moom.jL)(p0)).k));
    this.l = ((boolean)__sourceIntrinsic_integerToBoolean((((((moom.jL)(p0)).l) ? 1 : 0))));
    return;
}


public boolean a__Boolean() {
return ((((this.l) ? 1 : 0)) != 0);
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4EAC;
        if (o[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = jL.n[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])p.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    p.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/jL", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jL.o[n4] = n6;
        }
        return o[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8141_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.nbt.NBTTagCompound a__yw() {
moom.jL forwardValue3680_31_0;
    moom.az forwardValue3680_45_0;
    moom.az forwardValue3680_45_1;
    net.minecraft.entity.Entity[] spill3680_0;
    moom.jL spill3680_1;
    moom.az spill3680_2;
    moom.az spill3680_3;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_8;
    net.minecraft.entity.Entity[] life3_9;
    forward_join_50: {
    forward_join_45: {
    forward_join_42: {
    forward_join_31: {
    forward_join_30: {
    life1_3 = (moom.jL.m ^ 104272510898085L);
    spill3680_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    life4_8 = new net.minecraft.nbt.NBTTagCompound();
    life3_9 = spill3680_0;
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("name")), ((java.lang.String)(this.a)));
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("ip")), ((java.lang.String)(this.b)));
    spill3680_1 = this;
    if (!((life3_9 == null))) {
        forwardValue3680_31_0 = spill3680_1;
        break forward_join_31;
    }
    if (!((((moom.jL)(spill3680_1)).k != null))) {
        break forward_join_30;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("icon")), ((java.lang.String)(this.k)));
    }
    forwardValue3680_31_0 = this;
    }
    spill3680_2 = ((moom.jL)(forwardValue3680_31_0)).j;
    spill3680_3 = moom.az.ENABLED;
    if (!((life3_9 == null))) {
        forwardValue3680_45_0 = spill3680_2;
        forwardValue3680_45_1 = spill3680_3;
        break forward_join_45;
    }
    if (!((spill3680_2 == spill3680_3))) {
        break forward_join_42;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("acceptTextures")), ((boolean)(true)));
    if (!((life3_9 != null))) {
        break forward_join_50;
    }
    }
    forwardValue3680_45_0 = this.j;
    forwardValue3680_45_1 = moom.az.DISABLED;
    }
    if (!((forwardValue3680_45_0 == forwardValue3680_45_1))) {
        break forward_join_50;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("acceptTextures")), ((boolean)(false)));
    }
    return life4_8;
}


public moom.az a__az() {
return this.j;
}


public void a(moom.az p0) {
this.j = ((moom.az)(p0));
    return;
}


public static moom.jL a(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue3679_37_0;
    int forwardValue3679_43_0;
    net.minecraft.entity.Entity[] spill3679_0;
    boolean spill3679_1;
    long life1_3;
    moom.jL life4_15;
    net.minecraft.entity.Entity[] life3_16;
    forward_join_57: {
    forward_join_54: {
    forward_join_49: {
    forward_join_43: {
    forward_join_37: {
    forward_join_33: {
    life1_3 = (moom.jL.m ^ 19982807446470L);
    spill3679_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    life4_15 = new moom.jL(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("name"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("ip"))), false);
    life3_16 = spill3679_0;
    spill3679_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("icon")), ((int)(__sourceIntrinsic_be09b35565d5_invokedynamic3679_4(20271, (35050125801173930L ^ life1_3)))));
    if (!((life3_16 == null))) {
        forwardValue3679_37_0 = ((spill3679_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill3679_1)) {
        break forward_join_33;
    }
    ((moom.jL)(life4_15)).a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("icon"))))));
    }
    forwardValue3679_37_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("acceptTextures")), ((int)(1)))) ? 1 : 0);
    }
    if (!((life3_16 == null))) {
        forwardValue3679_43_0 = forwardValue3679_37_0;
        break forward_join_43;
    }
    if (!((forwardValue3679_37_0 != 0))) {
        break forward_join_54;
    }
    forwardValue3679_43_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("acceptTextures")))) ? 1 : 0);
    }
    if (!((forwardValue3679_43_0 != 0))) {
        break forward_join_49;
    }
    ((moom.jL)(life4_15)).a(((moom.az)(moom.az.ENABLED)));
    if (!((life3_16 != null))) {
        break forward_join_57;
    }
    }
    ((moom.jL)(life4_15)).a(((moom.az)(moom.az.DISABLED)));
    if (!((life3_16 != null))) {
        break forward_join_57;
    }
    }
    ((moom.jL)(life4_15)).a(((moom.az)(moom.az.PROMPT)));
    }
    return life4_15;
}


public java.lang.String a() {
return this.k;
}


public void a(java.lang.String p0) {
this.k = ((java.lang.String)(p0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_702f4482df3b967c_originalDynamicSite2956_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8141_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be09b35565d5_invokedynamic3679_4(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
