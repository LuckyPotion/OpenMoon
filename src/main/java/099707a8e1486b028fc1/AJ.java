package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class AJ implements moom.yK<moom.y2> {

private java.lang.String a;

private java.lang.String b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public AJ() {
super();
}

private static native <E extends Throwable> void __sourceConstructorInit_49339896759a68fa_0(moom.AJ a0) throws E;

public AJ(java.lang.String p0, java.lang.String p1) { super(); }


private static void __sourceConstructorBody_49339896759a68fa(moom.AJ receiver, java.lang.String p0, java.lang.String p1) throws Throwable {

long local3 = (moom.AJ.c ^ 101489088938380L);

    moom.AJ.__sourceConstructorInit_49339896759a68fa_0(((moom.AJ)(receiver)));

    ((moom.AJ)(receiver)).a = ((java.lang.String)(p0));

    ((moom.AJ)(receiver)).b = ((java.lang.String)(p1));

    if ((((java.lang.String)(p1)).length() > __sourceIntrinsic_49339896759a68fa_originalDynamicSite1796_5(19961, (9143791176013926218L ^ local3)))) {

        throw new java.lang.IllegalArgumentException(__sourceIntrinsic_49339896759a68fa_originalDynamicSite1796_7(((java.lang.String)(p1)).length()));

    }

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(2981009175388630373L)), ((long)(6587163526267851732L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(171735519122779L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.AJ.c ^ 45317917588720L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill467_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill467_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill467_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill467_14 = new byte[8];
    (__sourceSpill467_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill467_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation467_16 = __sourceSpill467_14;
    ((javax.crypto.Cipher)(__sourceSpill467_11)).init(((int)(__sourceSpill467_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill467_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation467_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ðg¼%\006Õ'ñÁH1â×Ä[BMµ¹Xb"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill467_25 = local6_life21;
        int __sourceSpill467_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill467_25)).substring(((int)(__sourceSpill467_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill467_30 = local8_life19;
        int __sourceSpill467_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill467_33 = new byte[8];
        (__sourceSpill467_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill467_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill467_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill467_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill467_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill467_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill467_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill467_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill467_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill467_34)).doFinal(((byte[])(__sourceSpill467_33)));
        (__sourceSpill467_30)[__sourceSpill467_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public moom.AJ b(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public java.lang.String b() {
return this.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.b)));
    return;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2BBB;
        if (e[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l3 = d[n4];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l4);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/AJ", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AJ.e[n4] = n6;
        }
        return e[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.AJ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3664_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/AJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.AJ.c ^ 29278576039661L);
    this.a = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_originalDynamicSite1050_1(19803, (5762745017005791371L ^ local2)))))));
    this.b = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_originalDynamicSite1050_4(30157, (8208686394000039966L ^ local2)))))));
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.AJ)(this)));
    return;
}


public java.lang.String a() {
return this.a;
}


public moom.AJ a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}


private static native <E extends Throwable> int __sourceIntrinsic_49339896759a68fa_originalDynamicSite1796_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_49339896759a68fa_originalDynamicSite1796_7(int a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3664_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_originalDynamicSite1050_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_originalDynamicSite1050_4(int a0, long a1) throws E;
}
