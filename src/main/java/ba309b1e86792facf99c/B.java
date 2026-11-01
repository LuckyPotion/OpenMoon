package com.moon;


class B extends com.google.protobuf.AbstractParser {

B() {
super();
}


public com.moon.ad a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
com.moon.aF local3 = com.moon.ad.b__aF();
    try {
        ((com.moon.aF)(local3)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
    } catch (com.google.protobuf.InvalidProtocolBufferException caught4_0) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(caught4_0)).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.aF)(local3)).c__ad())));
    } catch (com.google.protobuf.UninitializedMessageException caught4_1) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(((com.google.protobuf.UninitializedMessageException)(caught4_1)).asInvalidProtocolBufferException())).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.aF)(local3)).c__ad())));
    } catch (java.io.IOException caught4_2) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(new com.google.protobuf.InvalidProtocolBufferException(caught4_2))).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.aF)(local3)).c__ad())));
    }
    return ((com.moon.aF)(local3)).c__ad();
}


public java.lang.Object parsePartialFrom(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.B)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

}
