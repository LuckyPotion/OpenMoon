package com.moon;


class a extends com.google.protobuf.AbstractParser {

a() {
super();
}


public com.moon.C a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
com.moon.ae local3 = com.moon.C.b__ae();
    try {
        ((com.moon.ae)(local3)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
    } catch (com.google.protobuf.InvalidProtocolBufferException caught4_0) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(caught4_0)).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.ae)(local3)).c__C())));
    } catch (com.google.protobuf.UninitializedMessageException caught4_1) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(((com.google.protobuf.UninitializedMessageException)(caught4_1)).asInvalidProtocolBufferException())).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.ae)(local3)).c__C())));
    } catch (java.io.IOException caught4_2) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(new com.google.protobuf.InvalidProtocolBufferException(caught4_2))).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.ae)(local3)).c__C())));
    }
    return ((com.moon.ae)(local3)).c__C();
}


public java.lang.Object parsePartialFrom(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.a)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

}
