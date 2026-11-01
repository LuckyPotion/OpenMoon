package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class Z extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oX {

private static final long serialVersionUID = 0L;

private byte a;

private static final com.moon.Z b;

private static final com.google.protobuf.Parser<com.moon.Z> c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

private Z(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.a = -1;
}


private Z() {
super();
    this.a = -1;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(6294178010485881425L)), ((long)(5435042011066103140L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57139289061796L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.Z.d ^ 73468551396579L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill0_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill0_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill0_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill0_14 = new byte[8];
    (__sourceSpill0_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill0_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation0_16 = __sourceSpill0_14;
    ((javax.crypto.Cipher)(__sourceSpill0_11)).init(((int)(__sourceSpill0_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill0_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation0_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Õ\030a;ÖáG\rµ\017¨WJ$B\000ÄÌ~l`"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill0_25 = local6_life21;
        int __sourceSpill0_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill0_25)).substring(((int)(__sourceSpill0_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill0_30 = local8_life19;
        int __sourceSpill0_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill0_33 = new byte[8];
        (__sourceSpill0_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill0_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill0_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill0_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill0_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill0_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill0_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill0_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill0_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill0_34)).doFinal(((byte[])(__sourceSpill0_33)));
        (__sourceSpill0_30)[__sourceSpill0_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[3]));
    b = ((com.moon.Z)(new com.moon.Z()));
    c = ((com.google.protobuf.Parser)(new com.moon.x()));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue0_14_0;
    java.lang.Object forwardValue0_23_0;
    int forwardValue0_36_0;
    java.lang.Object spill0_0;
    boolean spill0_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.Z life5_34;
    forward_join_36: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (com.moon.Z.d ^ 43272990563222L);
    life4_5 = com.moon.oF.b();
    spill0_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue0_14_0 = spill0_0;
        break forward_join_14;
    }
    if (!((spill0_0 == this))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue0_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue0_23_0 = forwardValue0_14_0;
        break forward_join_23;
    }
    if (!((((forwardValue0_14_0 instanceof com.moon.Z) ? 1 : 0) == 0))) {
        break forward_join_22;
    }
    return super.equals(((java.lang.Object)(p0)));
    }
    forwardValue0_23_0 = p0;
    }
    life5_34 = ((com.moon.Z)(forwardValue0_23_0));
    spill0_1 = ((com.google.protobuf.UnknownFieldSet)(((com.moon.Z)(this)).getUnknownFields())).equals(((java.lang.Object)(((com.moon.Z)(life5_34)).getUnknownFields())));
    if (!((life4_5 == null))) {
        forwardValue0_36_0 = ((spill0_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill0_1))) {
        break forward_join_35;
    }
    return ((0) != 0);
    }
    forwardValue0_36_0 = 1;
    }
    return ((forwardValue0_36_0) != 0);
}


public int hashCode() {
int forwardValue2_19_0;
    int spill2_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_47;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (com.moon.Z.d ^ 119430158164385L);
    life3_5 = com.moon.oF.b();
    spill2_0 = ((com.moon.Z)(this)).memoizedHashCode;
    if (!((life3_5 == null))) {
        forwardValue2_19_0 = spill2_0;
        break forward_join_19;
    }
    if (!((spill2_0 != 0))) {
        break forward_join_14;
    }
    return ((com.moon.Z)(this)).memoizedHashCode;
    }
    forwardValue2_19_0 = __sourceIntrinsic_1861091996aa_invokedynamic2_4(19901, (3541323219933524982L ^ life1_3));
    }
    life4_24 = forwardValue2_19_0;
    life4_35 = ((__sourceIntrinsic_1861091996aa_invokedynamic2_5(14708, (4329834984003995454L ^ life1_3)) * life4_24) + ((java.lang.Object)(com.moon.Z.a())).hashCode());
    life4_47 = ((__sourceIntrinsic_1861091996aa_invokedynamic2_8(15734, (4505902751063212862L ^ life1_3)) * life4_35) + ((com.google.protobuf.UnknownFieldSet)(((com.moon.Z)(this)).getUnknownFields())).hashCode());
    ((com.moon.Z)(this)).memoizedHashCode = ((int)(life4_47));
    return life4_47;
}


public static com.moon.aB b__aB() {
return ((com.moon.Z)(com.moon.Z.b)).c();
}


public com.moon.Z b() {
return com.moon.Z.b;
}


public static com.moon.Z b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.Z)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.Z.c)), ((java.io.InputStream)(p0)))));
}


public static com.moon.Z b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.Z)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.Z.c)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.aB c() {
long local1 = (com.moon.Z.d ^ 54681411387020L);
    return ((this == com.moon.Z.b) ? new com.moon.aB() : ((com.moon.aB)(new com.moon.aB())).a(((com.moon.Z)(this))));
}


public static com.google.protobuf.Parser<com.moon.Z> a__Parser() {
return com.moon.Z.c;
}


public com.moon.aB a__aB() {
return com.moon.Z.b__aB();
}


public static com.moon.Z a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.Z)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Z.c)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Z a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.Z)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Z.c)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


private static int a(int p0, long p1) {
int n3 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1518;
        if (f[n3] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l3 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l4);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/Z", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Z.f[n3] = n4;
        }
        return f[n3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral238_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/Z"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.moon.Z a__Z() {
return com.moon.Z.b;
}


protected com.moon.aB a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.aB local2 = new com.moon.aB(p0);
    return local2;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.Z.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.moon.aB a(com.moon.Z p0) {
return ((com.moon.aB)(((com.moon.Z)(com.moon.Z.b)).c())).a(((com.moon.Z)(p0)));
}


public static com.moon.Z a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Z)(((com.google.protobuf.Parser)(com.moon.Z.c)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Z a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Z)(((com.google.protobuf.Parser)(com.moon.Z.c)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.Z a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Z)(((com.google.protobuf.Parser)(com.moon.Z.c)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Z a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Z)(((com.google.protobuf.Parser)(com.moon.Z.c)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a() {
return com.moon.o3.a;
}


public static com.moon.Z a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.Z)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Z.c)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Z a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.Z)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Z.c)), ((java.io.InputStream)(p0)))));
}


public static com.moon.Z a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Z)(((com.google.protobuf.Parser)(com.moon.Z.c)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Z a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Z)(((com.google.protobuf.Parser)(com.moon.Z.c)).parseFrom(((byte[])(p0)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.Z();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException {
((com.google.protobuf.UnknownFieldSet)(((com.moon.Z)(this)).getUnknownFields())).writeTo(((com.google.protobuf.CodedOutputStream)(p0)));
    return;
}


public final boolean isInitialized() {
int forwardValue3_17_0;
    int forwardValue3_26_0;
    java.lang.String[] spill3_0;
    int spill3_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (com.moon.Z.d ^ 6433501020507L);
    spill3_0 = com.moon.oF.b();
    life4_7 = this.a;
    life3_8 = spill3_0;
    spill3_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue3_17_0 = spill3_1;
        break forward_join_17;
    }
    if (!((spill3_1 == 1))) {
        break forward_join_16;
    }
    return ((1) != 0);
    }
    forwardValue3_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue3_26_0 = forwardValue3_17_0;
        break forward_join_26;
    }
    if (!((forwardValue3_17_0 == 0))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    this.a = ((byte)(1));
    forwardValue3_26_0 = 1;
    }
    return ((forwardValue3_26_0) != 0);
}


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.o3.b)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.Z.class)), ((java.lang.Class)(com.moon.aB.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return this.c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return this.c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return this.b();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return this.b();
}


public com.google.protobuf.Parser<com.moon.Z> getParserForType() {
return com.moon.Z.c;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return ((com.moon.Z)(this)).unknownFields;
}


public int getSerializedSize() {
int forwardValue1_22_0;
    int forwardValue1_22_1;
    java.lang.String[] spill1_0;
    int spill1_1;
    int spill1_2;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_22;
    int life4_28;
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.Z.d ^ 76791365571122L);
    spill1_0 = com.moon.oF.b();
    life4_7 = ((com.moon.Z)(this)).memoizedSize;
    life3_8 = spill1_0;
    spill1_1 = life4_7;
    spill1_2 = -1;
    if (!((life3_8 == null))) {
        forwardValue1_22_0 = spill1_1;
        forwardValue1_22_1 = spill1_2;
        break forward_join_22;
    }
    if (!((spill1_1 != spill1_2))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_22 = 0;
    forwardValue1_22_0 = life4_22;
    forwardValue1_22_1 = ((com.google.protobuf.UnknownFieldSet)(((com.moon.Z)(this)).getUnknownFields())).getSerializedSize();
    }
    life4_28 = (forwardValue1_22_0 + forwardValue1_22_1);
    ((com.moon.Z)(this)).memoizedSize = ((int)(life4_28));
    return life4_28;
}


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return this.a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.Z)(this)).a__aB();
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.Z)(this)).a__aB();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral238_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic2_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic2_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic2_8(int a0, long a1) throws E;
}
