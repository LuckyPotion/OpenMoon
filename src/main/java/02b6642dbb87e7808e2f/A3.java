package moom;


public class A3 extends net.minecraft.potion.Potion {

private static final long S;

public A3(int p0, moom.DD p1, boolean p2, int p3) {
super(p0, p1, p2, p3);
}


static {
S = (moom._c.a(2045988493370262932L, -4442011807195688236L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(143629434669049L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((1) != 0);
}


public boolean a__Boolean(int p0, int p1) {
int forwardValue1403_12_0;
    int forwardValue1403_14_0;
    int spill1403_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (moom.A3.S ^ 46747419366541L);
    life5_5 = net.minecraft.potion.PotionEffect.b__ArrayString();
    spill1403_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue1403_12_0 = spill1403_0;
        break forward_join_12;
    }
    if (!((spill1403_0 >= 1))) {
        break forward_join_13;
    }
    forwardValue1403_12_0 = 1;
    }
    forwardValue1403_14_0 = forwardValue1403_12_0;
    break forward_join_14;
    }
    forwardValue1403_14_0 = 0;
    }
    return ((forwardValue1403_14_0) != 0);
}

}
