package com.moon.commons.consumer;


public interface TriConsumer<T, V, K> {

public abstract void accept(T p0, V p1, K p2);

public default com.moon.commons.consumer.TriConsumer<T, V, K> andThen(com.moon.commons.consumer.TriConsumer<? super T, ? super V, ? super K> p0) {
java.util.Objects.requireNonNull(((java.lang.Object)(p0)));
    return __SourceIntrinsics_f91ba12d493698fe1a59.__sourceIntrinsic_de0e2c4444db_originalDynamicSite356_1(this, p0);
}


private void lambda$andThen$0(com.moon.commons.consumer.TriConsumer p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3) {
((com.moon.commons.consumer.TriConsumer)(this)).accept(((java.lang.Object)(p1)), ((java.lang.Object)(p2)), ((java.lang.Object)(p3)));
    ((com.moon.commons.consumer.TriConsumer)(p0)).accept(((java.lang.Object)(p1)), ((java.lang.Object)(p2)), ((java.lang.Object)(p3)));
    return;
}

}
