package com.moon;


class e extends com.google.protobuf.AbstractParser {

e() {
super();
}


public com.moon.G a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
com.moon.ai local3 = com.moon.G.b__ai();
    try {
        ((com.moon.ai)(local3)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
    } catch (com.google.protobuf.InvalidProtocolBufferException caught4_0) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(caught4_0)).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.ai)(local3)).c())));
    } catch (com.google.protobuf.UninitializedMessageException caught4_1) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(((com.google.protobuf.UninitializedMessageException)(caught4_1)).asInvalidProtocolBufferException())).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.ai)(local3)).c())));
    } catch (java.io.IOException caught4_2) {
        throw ((com.google.protobuf.InvalidProtocolBufferException)(new com.google.protobuf.InvalidProtocolBufferException(caught4_2))).setUnfinishedMessage(((com.google.protobuf.MessageLite)(((com.moon.ai)(local3)).c())));
    }
    return ((com.moon.ai)(local3)).c();
}


public java.lang.Object parsePartialFrom(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.e)(this)).a(((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)));
}

}
