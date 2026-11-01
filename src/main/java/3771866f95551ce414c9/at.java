package com.moon;


public final class at extends com.google.protobuf.GeneratedMessageV3.Builder<com.moon.at> implements com.moon.oP {

private int a;

private static long b;

private at() {
super();
    this.a = 0;
}


private at(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
super(p0);
    this.a = ((int)(0));
    return;
}


static {
com.moon.at.b = (moom._c.a(-9073629906529597671L, 6418314842538431248L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(255347565646919L);
}

private static native <E extends Throwable> com.moon.at __sourceHandlerCall_bb682d3f64db5d7983c6(com.moon.at a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2) throws E;
private static final class __SourceHandler_bb682d3f64db5d7983c6 {

public static com.moon.at f27(com.moon.at receiver, com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws Throwable {
    int lexicalValue27_40_0;
    int lexicalValue27_44_0;
    int spill27_0;
    long life3_3;
    java.lang.String[] life5_5;
    int life6_15;
    int life7_20;
    lexical_join_49: {
    lexical_join_47: {
    lexical_join_12: {
    life3_3 = (__fieldRead27_0() ^ 118511221913278L);
    life5_5 = __call27_1();
    if (!((p1 == null))) {
        break lexical_join_12;
    }
    throw new java.lang.NullPointerException();
    }
    life6_15 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_40: {
    lexical_join_35: {
    lexical_join_29: {
    lexical_join_25: {
    if (!((life6_15 == 0))) {
        break lexical_join_47;
    }
    life7_20 = __call27_2(p0);
    if (!((life5_5 == null))) {
        break lexical_join_49;
    }
    spill27_0 = life7_20;
    if (!((life5_5 == null))) {
        lexicalValue27_40_0 = spill27_0;
        break lexical_join_40;
    }
    switch (spill27_0) {
case 0:
{
        break lexical_join_25;
    }
case 8:
{
        break lexical_join_29;
    }
default:
{
        break lexical_join_35;
    }
}
    }
    life6_15 = 1;
    if (!((life5_5 != null))) {
        break lexical_join_45;
    }
    }
    __fieldWrite27_4(receiver, __call27_3(p0));
    if (!((life5_5 != null))) {
        break lexical_join_45;
    }
    }
    lexicalValue27_40_0 = __integerCategory27_6(__call27_5(receiver, p0, p1, life7_20));
    }
    if (!((life5_5 == null))) {
        lexicalValue27_44_0 = lexicalValue27_40_0;
        break lexical_join_44;
    }
    if (!((lexicalValue27_40_0 == 0))) {
        break lexical_join_45;
    }
    lexicalValue27_44_0 = 1;
    }
    life6_15 = lexicalValue27_44_0;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    __call27_7(receiver);
    }
    return receiver;
}
public static com.moon.at h27_0(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002700_0(p0);
}
public static com.moon.at h27_1(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002701_0(p0);
}
public static com.moon.at h27_2(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002702_0(p0);
}
public static com.moon.at h27_3(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002703_0(p0);
}
public static com.moon.at h27_4(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002704_0(p0);
}
public static com.moon.at h27_5(com.google.protobuf.InvalidProtocolBufferException p0) throws Throwable {
    throw __call3002705_0(p0);
}
public static com.moon.at h27_6(com.google.protobuf.InvalidProtocolBufferException p0, int p1) throws Throwable {
    com.google.protobuf.InvalidProtocolBufferException life1_2;
    life1_2 = p0;
    throw __call3002706_0(life1_2);
}
public static com.moon.at h27_7(java.lang.Throwable p0, com.moon.at p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3002707_0(p1);
    throw life2_2;
}
private static native long __fieldRead27_0() throws Throwable;
private static native java.lang.String[] __call27_1() throws Throwable;
private static native int __call27_2(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native int __call27_3(com.google.protobuf.CodedInputStream a0) throws Throwable;
private static native void __fieldWrite27_4(com.moon.at a0, int a1) throws Throwable;
private static native boolean __call27_5(com.moon.at a0, com.google.protobuf.CodedInputStream a1, com.google.protobuf.ExtensionRegistryLite a2, int a3) throws Throwable;
private static native int __integerCategory27_6(boolean value) throws Throwable;
private static native void __call27_7(com.moon.at a0) throws Throwable;
private static native java.lang.Exception __call3002700_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002701_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002702_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002703_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002704_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.lang.Exception __call3002705_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native java.io.IOException __call3002706_0(com.google.protobuf.InvalidProtocolBufferException a0) throws Throwable;
private static native void __call3002707_0(com.moon.at a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.at __sourceHandlerCall_cd8111e5b63d63853ff1(com.moon.at a0, com.google.protobuf.Message a1) throws E;
private static final class __SourceHandler_cd8111e5b63d63853ff1 {

public static com.moon.at f517(com.moon.at receiver, com.google.protobuf.Message p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead517_0() ^ 33003388286746L);
    life4_5 = __call517_1();
    if ((life4_5 == null)) {
        if ((__instanceOf517_2(p0) != 0)) {
        return __call517_4(receiver, __cast517_3(p0));
    }
        __call517_5(receiver, p0);
    }
    return receiver;
}
public static void h517_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1051700_0(p0);
}
public static void h517_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1051701_0(p0);
}
private static native long __fieldRead517_0() throws Throwable;
private static native java.lang.String[] __call517_1() throws Throwable;
private static native int __instanceOf517_2(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.R __cast517_3(com.google.protobuf.Message a0) throws Throwable;
private static native com.moon.at __call517_4(com.moon.at a0, com.moon.R a1) throws Throwable;
private static native com.google.protobuf.AbstractMessage.Builder __call517_5(com.moon.at a0, com.google.protobuf.Message a1) throws Throwable;
private static native java.lang.Exception __call1051700_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1051701_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.at __sourceHandlerCall_3d8242751c02a74cfa4a(com.moon.at a0, com.moon.R a1) throws E;
private static final class __SourceHandler_3d8242751c02a74cfa4a {

public static com.moon.at f401(com.moon.at receiver, com.moon.R p0) throws Throwable {
    com.moon.R forwardValue401_14_0;
    com.moon.R spill401_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_21: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead401_0() ^ 53413422917677L);
    life4_5 = __call401_1();
    spill401_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue401_14_0 = spill401_0;
        break forward_join_14;
    }
    if (!((spill401_0 == __call401_2()))) {
        break forward_join_13;
    }
    return receiver;
    }
    forwardValue401_14_0 = p0;
    }
    if (!((__fieldRead401_3(forwardValue401_14_0) != 0))) {
        break forward_join_21;
    }
    __call401_5(receiver, __call401_4(p0));
    }
    __call401_7(receiver, __call401_6(p0));
    __call401_8(receiver);
    return receiver;
}
public static void h401_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1040100_0(p0);
}
public static void h401_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1040101_0(p0);
}
public static void h401_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1040102_0(p0);
}
private static native long __fieldRead401_0() throws Throwable;
private static native java.lang.String[] __call401_1() throws Throwable;
private static native com.moon.R __call401_2() throws Throwable;
private static native int __fieldRead401_3(com.moon.R a0) throws Throwable;
private static native int __call401_4(com.moon.R a0) throws Throwable;
private static native com.moon.at __call401_5(com.moon.at a0, int a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call401_6(com.moon.R a0) throws Throwable;
private static native com.moon.at __call401_7(com.moon.at a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native void __call401_8(com.moon.at a0) throws Throwable;
private static native java.lang.Exception __call1040100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1040101_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1040102_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.at __sourceHandlerCall_30683171d75221bd1135(com.moon.at a0, com.moon.ck a1) throws E;
private static final class __SourceHandler_30683171d75221bd1135 {

public static com.moon.at f519(com.moon.at receiver, com.moon.ck p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_5;
    life2_3 = (__fieldRead519_0() ^ 114010436795506L);
    life4_5 = __call519_1();
    if ((life4_5 == null)) {
        if ((p0 == null)) {
        throw new java.lang.NullPointerException();
    }
        __fieldWrite519_3(receiver, __call519_2(p0));
        __call519_4(receiver);
    }
    return receiver;
}
public static void h519_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1051900_0(p0);
}
public static void h519_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1051901_0(p0);
}
private static native long __fieldRead519_0() throws Throwable;
private static native java.lang.String[] __call519_1() throws Throwable;
private static native int __call519_2(com.moon.ck a0) throws Throwable;
private static native void __fieldWrite519_3(com.moon.at a0, int a1) throws Throwable;
private static native void __call519_4(com.moon.at a0) throws Throwable;
private static native java.lang.Exception __call1051900_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1051901_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ck __sourceHandlerCall_7f899b33707217334e05(com.moon.at a0) throws E;
private static final class __SourceHandler_7f899b33707217334e05 {

public static com.moon.ck f402(com.moon.at receiver) throws Throwable {
    com.moon.ck forwardValue402_15_0;
    com.moon.ck forwardValue402_17_0;
    java.lang.String[] spill402_0;
    com.moon.ck spill402_1;
    long life1_3;
    com.moon.ck life4_8;
    java.lang.String[] life3_9;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead402_0() ^ 14524183480377L);
    spill402_0 = __call402_1();
    life4_8 = __call402_3(__fieldRead402_2(receiver));
    life3_9 = spill402_0;
    spill402_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue402_15_0 = spill402_1;
        break forward_join_15;
    }
    if (!((spill402_1 == null))) {
        break forward_join_16;
    }
    forwardValue402_15_0 = __fieldRead402_4();
    }
    forwardValue402_17_0 = forwardValue402_15_0;
    break forward_join_17;
    }
    forwardValue402_17_0 = life4_8;
    }
    return forwardValue402_17_0;
}
public static void h402_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1040200_0(p0);
}
private static native long __fieldRead402_0() throws Throwable;
private static native java.lang.String[] __call402_1() throws Throwable;
private static native int __fieldRead402_2(com.moon.at a0) throws Throwable;
private static native com.moon.ck __call402_3(int a0) throws Throwable;
private static native com.moon.ck __fieldRead402_4() throws Throwable;
private static native java.lang.Exception __call1040200_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.R __sourceHandlerCall_27c5c2240bfe0f6e9154(com.moon.at a0) throws E;
private static final class __SourceHandler_27c5c2240bfe0f6e9154 {

public static com.moon.R f403(com.moon.at receiver) throws Throwable {
    com.moon.R forwardValue403_18_0;
    java.lang.String[] spill403_0;
    com.moon.R spill403_1;
    long life1_3;
    com.moon.R life4_7;
    java.lang.String[] life3_8;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead403_0() ^ 10712363727779L);
    spill403_0 = __call403_1();
    life4_7 = __call403_2(receiver);
    life3_8 = spill403_0;
    spill403_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue403_18_0 = spill403_1;
        break forward_join_18;
    }
    if (!((!__call403_3(spill403_1)))) {
        break forward_join_17;
    }
    throw __call403_4(life4_7);
    }
    forwardValue403_18_0 = life4_7;
    }
    return forwardValue403_18_0;
}
public static void h403_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1040300_0(p0);
}
public static void h403_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1040301_0(p0);
}
private static native long __fieldRead403_0() throws Throwable;
private static native java.lang.String[] __call403_1() throws Throwable;
private static native com.moon.R __call403_2(com.moon.at a0) throws Throwable;
private static native boolean __call403_3(com.moon.R a0) throws Throwable;
private static native com.google.protobuf.UninitializedMessageException __call403_4(com.moon.R a0) throws Throwable;
private static native java.lang.Exception __call1040300_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call1040301_0(java.lang.NullPointerException a0) throws Throwable;

}


public final com.moon.at b(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.at)(super.mergeUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public com.moon.R b() { return __sourceHandlerCall_27c5c2240bfe0f6e9154(this); }


public com.moon.at b__at() {
return ((com.moon.at)(super.clone()));
}


public com.moon.at b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.at)(super.addRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.at c__at() {
this.a = ((int)(0));
    ((com.moon.at)(this)).onChanged();
    return this;
}


public com.moon.R c() {
com.moon.R local1 = new com.moon.R(this);
    ((com.moon.R)(local1)).a = ((int)(this.a));
    ((com.moon.at)(this)).onBuilt();
    return local1;
}


public com.moon.at a(com.moon.ck p0) { return __sourceHandlerCall_30683171d75221bd1135(this, p0); }


public final com.moon.at a(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.at)(super.setUnknownFields(((com.google.protobuf.UnknownFieldSet)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.o;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public com.moon.at a(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.at)(super.clearField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)))));
}


public com.moon.at a(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.at)(super.clearOneof(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)))));
}


public com.moon.at a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return __sourceHandlerCall_bb682d3f64db5d7983c6(this, p0, p1); }


public com.moon.at a(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.at)(super.setRepeatedField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)))));
}


public com.moon.at a(com.moon.R p0) { return __sourceHandlerCall_3d8242751c02a74cfa4a(this, p0); }


public com.moon.at a(com.google.protobuf.Message p0) { return __sourceHandlerCall_cd8111e5b63d63853ff1(this, p0); }


public com.moon.R a__R() {
return com.moon.R.a__R();
}


public com.moon.at a__at() {
super.clear();
    this.a = ((int)(0));
    return this;
}


public com.moon.at a(int p0) {
this.a = ((int)(p0));
    ((com.moon.at)(this)).onChanged();
    return this;
}


public int a() {
return this.a;
}


public com.moon.at a(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.at)(super.setField(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)))));
}


public com.moon.ck a__ck() { return __sourceHandlerCall_7f899b33707217334e05(this); }


public final boolean isInitialized() {
return ((1) != 0);
}


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.p)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.R.class)), ((java.lang.Class)(com.moon.at.class)));
}


public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
return com.moon.oF.o;
}


public com.google.protobuf.AbstractMessageLite.Builder clone__AbstractMessageLiteInnerBuilder__sourceBridge_4fc5aa391f() {
return ((com.moon.at)(this)).b__at();
}

public com.google.protobuf.Message.Builder clone__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.at)(this)).b__at();
}

public com.google.protobuf.AbstractMessage.Builder clone__sourceBridge_36d0769a6a() {
return ((com.moon.at)(this)).b__at();
}

public com.moon.at clone() { return ((com.moon.at)(this.clone__sourceBridge_36d0769a6a())); }
public com.google.protobuf.MessageLite.Builder clone__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.at)(this)).b__at();
}

public com.google.protobuf.GeneratedMessageV3.Builder clone__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.at)(this)).b__at();
}

public java.lang.Object clone__Object__sourceBridge_0502b11602() throws java.lang.CloneNotSupportedException {
return ((com.moon.at)(this)).b__at();
}

public com.google.protobuf.GeneratedMessageV3.Builder clear__GeneratedMessageV3InnerBuilder__sourceBridge_2dd0ad8dc0() {
return ((com.moon.at)(this)).a__at();
}

public com.google.protobuf.Message.Builder clear__MessageInnerBuilder__sourceBridge_23266bf05e() {
return ((com.moon.at)(this)).a__at();
}

public com.google.protobuf.AbstractMessage.Builder clear__sourceBridge_36d0769a6a() {
return ((com.moon.at)(this)).a__at();
}

public com.moon.at clear() { return ((com.moon.at)(this.clear__sourceBridge_36d0769a6a())); }
public com.google.protobuf.MessageLite.Builder clear__MessageLiteInnerBuilder__sourceBridge_9503009a6c() {
return ((com.moon.at)(this)).a__at();
}

public com.google.protobuf.MessageLite build__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.at)(this)).b();
}

public com.google.protobuf.Message build__sourceBridge_561eee1e9a() {
return ((com.moon.at)(this)).b();
}

public com.google.protobuf.Message build() { return ((com.google.protobuf.Message)(this.build__sourceBridge_561eee1e9a())); }
public com.google.protobuf.Message.Builder clearField__MessageInnerBuilder__sourceBridge_23e4b7b587(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder clearField__sourceBridge_e3938d6ecd(com.google.protobuf.Descriptors.FieldDescriptor p0) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)));
}

public com.moon.at clearField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0) { return ((com.moon.at)(this.clearField__sourceBridge_e3938d6ecd(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder setRepeatedField__MessageInnerBuilder__sourceBridge_9e9db7eb5f(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setRepeatedField__sourceBridge_6dda4cebb2(com.google.protobuf.Descriptors.FieldDescriptor p0, int p1, java.lang.Object p2) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((int)(p1)), ((java.lang.Object)(p2)));
}

public com.moon.at setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, int __bridgeParam1, java.lang.Object __bridgeParam2) { return ((com.moon.at)(this.setRepeatedField__sourceBridge_6dda4cebb2(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((int)(__bridgeParam1)), ((java.lang.Object)(__bridgeParam2))))); }
public com.google.protobuf.GeneratedMessageV3.Builder setUnknownFields__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.at)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.at setUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.at)(this.setUnknownFields__sourceBridge_c1a02174d9(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder setUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.at)(this)).a(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.Message.Builder mergeUnknownFields__MessageInnerBuilder__sourceBridge_0115284766(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.at)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder mergeUnknownFields__sourceBridge_1d37e78876(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.at)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.moon.at mergeUnknownFields(com.google.protobuf.UnknownFieldSet __bridgeParam0) { return ((com.moon.at)(this.mergeUnknownFields__sourceBridge_1d37e78876(((com.google.protobuf.UnknownFieldSet)(__bridgeParam0))))); }
public com.google.protobuf.GeneratedMessageV3.Builder mergeUnknownFields__GeneratedMessageV3InnerBuilder__sourceBridge_c1a02174d9(com.google.protobuf.UnknownFieldSet p0) {
return ((com.moon.at)(this)).b(((com.google.protobuf.UnknownFieldSet)(p0)));
}

public com.google.protobuf.MessageLite buildPartial__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.at)(this)).c();
}

public com.google.protobuf.Message buildPartial__sourceBridge_561eee1e9a() {
return ((com.moon.at)(this)).c();
}

public com.google.protobuf.Message buildPartial() { return ((com.google.protobuf.Message)(this.buildPartial__sourceBridge_561eee1e9a())); }
public com.google.protobuf.GeneratedMessageV3.Builder clearOneof__GeneratedMessageV3InnerBuilder__sourceBridge_cca806b01c(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.AbstractMessage.Builder clearOneof__sourceBridge_5f25fbcda8(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.moon.at clearOneof(com.google.protobuf.Descriptors.OneofDescriptor __bridgeParam0) { return ((com.moon.at)(this.clearOneof__sourceBridge_5f25fbcda8(((com.google.protobuf.Descriptors.OneofDescriptor)(__bridgeParam0))))); }
public com.google.protobuf.Message.Builder clearOneof__MessageInnerBuilder__sourceBridge_ea7c504747(com.google.protobuf.Descriptors.OneofDescriptor p0) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Descriptors.OneofDescriptor)(p0)));
}

public com.google.protobuf.GeneratedMessageV3.Builder setField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.at setField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.at)(this.setField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder setField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.Message.Builder addRepeatedField__MessageInnerBuilder__sourceBridge_d5d25498d5(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.at)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.google.protobuf.GeneratedMessageV3.Builder addRepeatedField__sourceBridge_0269b32b8b(com.google.protobuf.Descriptors.FieldDescriptor p0, java.lang.Object p1) {
return ((com.moon.at)(this)).b(((com.google.protobuf.Descriptors.FieldDescriptor)(p0)), ((java.lang.Object)(p1)));
}

public com.moon.at addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor __bridgeParam0, java.lang.Object __bridgeParam1) { return ((com.moon.at)(this.addRepeatedField__sourceBridge_0269b32b8b(((com.google.protobuf.Descriptors.FieldDescriptor)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
public com.google.protobuf.AbstractMessageLite.Builder mergeFrom__AbstractMessageLiteInnerBuilder__sourceBridge_b3429bd776(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.at)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_0e6f230f8a(com.google.protobuf.Message p0) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.moon.at mergeFrom(com.google.protobuf.Message __bridgeParam0) { return ((com.moon.at)(this.mergeFrom__sourceBridge_0e6f230f8a(((com.google.protobuf.Message)(__bridgeParam0))))); }
public com.google.protobuf.MessageLite.Builder mergeFrom__MessageLiteInnerBuilder__sourceBridge_1f3030ddff(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.at)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.AbstractMessage.Builder mergeFrom__sourceBridge_811039b404(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.at)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.moon.at mergeFrom(com.google.protobuf.CodedInputStream __bridgeParam0, com.google.protobuf.ExtensionRegistryLite __bridgeParam1) throws java.io.IOException { return ((com.moon.at)(this.mergeFrom__sourceBridge_811039b404(((com.google.protobuf.CodedInputStream)(__bridgeParam0)), ((com.google.protobuf.ExtensionRegistryLite)(__bridgeParam1))))); }
public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_d24d40278a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.at)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

public com.google.protobuf.Message.Builder mergeFrom__MessageInnerBuilder__sourceBridge_21f2600f58(com.google.protobuf.Message p0) {
return ((com.moon.at)(this)).a(((com.google.protobuf.Message)(p0)));
}

public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite__sourceBridge_99b74750a2() {
return ((com.moon.at)(this)).a__R();
}

public com.google.protobuf.Message getDefaultInstanceForType__sourceBridge_561eee1e9a() {
return ((com.moon.at)(this)).a__R();
}

public com.google.protobuf.Message getDefaultInstanceForType() { return ((com.google.protobuf.Message)(this.getDefaultInstanceForType__sourceBridge_561eee1e9a())); }
}
