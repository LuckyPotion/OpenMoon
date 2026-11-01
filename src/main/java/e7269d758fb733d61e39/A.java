package com.moon;


class A extends com.google.protobuf.AbstractParser {

A() {
super();
}


public com.moon.ac a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
com.moon.aE local3 = com.moon.ac.b__aE();
    try {
        ((com.moon.aE)(local3)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
    } catch (com.google.protobuf.InvalidProtocolBufferException caught4_0) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(caught4_0)).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.aE)(local3)).c__ac())));
    } catch (com.google.protobuf.UninitializedMessageException caught4_1) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(((com.google.protobuf.UninitializedMessageException)(caught4_1)).asInvalidProtocolBufferException())).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.aE)(local3)).c__ac())));
    } catch (java.io.IOException caught4_2) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(new com.google.protobuf.InvalidProtocolBufferException(caught4_2))).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.aE)(local3)).c__ac())));
    }
    return ((com.moon.aE)(local3)).c__ac();
}


public java.lang.Object parsePartialFrom(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.A)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

}
