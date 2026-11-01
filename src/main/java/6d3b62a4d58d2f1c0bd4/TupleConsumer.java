package com.moon.commons.consumer;


public interface TupleConsumer<K, V> {

public abstract void accept(K p0, V p1);

public default com.moon.commons.consumer.TupleConsumer<K, V> andThen(com.moon.commons.consumer.TupleConsumer<? super K, ? super V> p0) {
java.util.Objects.requireNonNull(((java.lang.Object)(p0)));
    return __SourceIntrinsics_6d3b62a4d58d2f1c0bd4.__sourceIntrinsic_d693dbc9546b_originalDynamicSite357_1(this, p0);
}


private void lambda$andThen$0(com.moon.commons.consumer.TupleConsumer p0, java.lang.Object p1, java.lang.Object p2) {
((com.moon.commons.consumer.TupleConsumer)(this)).accept(((java.lang.Object)(p1)), ((java.lang.Object)(p2)));
    ((com.moon.commons.consumer.TupleConsumer)(p0)).accept(((java.lang.Object)(p1)), ((java.lang.Object)(p2)));
    return;
}

}
