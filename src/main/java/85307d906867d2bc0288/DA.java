package moom;


public class DA<K, V> extends moom.Dy<K, V> {

private final V c;

private static final long d;

public DA(V p0) {
super();
    this.c = p0;
}


static {
d = (moom._c.a(-570843145924479309L, 985570082715028328L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(53576450608804L);
}


public V a__Object(K p0) {
java.lang.Object forwardValue1687_16_0;
    java.lang.Object forwardValue1687_18_0;
    boolean spill1687_0;
    java.lang.Object spill1687_1;
    long life2_3;
    java.lang.Object life5_8;
    int life4_9;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.DA.d ^ 102749816513917L);
    spill1687_0 = moom.DS.b__Boolean();
    life5_8 = super.a__Object((((K)((java.lang.Object)(p0)))));
    life4_9 = ((spill1687_0) ? 1 : 0);
    spill1687_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1687_16_0 = spill1687_1;
        break forward_join_16;
    }
    if (!((spill1687_1 == null))) {
        break forward_join_17;
    }
    forwardValue1687_16_0 = this.c;
    }
    forwardValue1687_18_0 = forwardValue1687_16_0;
    break forward_join_18;
    }
    forwardValue1687_18_0 = life5_8;
    }
    return ((V)(forwardValue1687_18_0));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
