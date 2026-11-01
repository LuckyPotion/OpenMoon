package moom;


public class N9 {

private static final long a;

public N9() {
super();
}


static {
a = (moom._c.a(9019731370863575241L, 629131090480057365L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(78938069665787L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static double a(int p0) {
double local1 = (((double) p0) / 0x1.0p12d);
    local1 = (local1 * 0x1.fd70a3d70a3d7p-1d);
    double local3 = ((local1 * 0x1.0p1d) - 0x1.0p0d);
    local3 = moom.Dr.a(((double)(local3)), ((double)(-0x1.0p0d)), ((double)(0x1.0p0d)));
    return ((double) moom.Dr.a__Float(((double)((0x1.0p0d - (local3 * local3))))));
}


public static double a(moom.mp p0) {
int local1 = moom.N9.a__Int(((moom.mp)(p0)));
    return moom.N9.a(((int)(local1)));
}


public static int a__Int(moom.mp p0) {
moom.Fs forwardValue2773_31_0;
    int forwardValue2773_32_0;
    int spill2773_0;
    moom.Fs spill2773_1;
    long life1_3;
    moom.Fs[] life4_8;
    int life3_9;
    int life5_21;
    moom.Fs life6_25;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_14: {
    life1_3 = (moom.N9.a ^ 126778057244274L);
    spill2773_0 = moom.Ob.b();
    life4_8 = ((net.minecraft.world.chunk.Chunk)(((moom.mp)(p0)).a__Fk())).a__ArrayFs();
    life3_9 = spill2773_0;
    if (!((life4_8 == null))) {
        break forward_join_14;
    }
    return 0;
    }
    life5_21 = (((moom.DT)(((moom.mp)(p0)).a__DT())).b() >> 4);
    life6_25 = (life4_8)[life5_21];
    spill2773_1 = life6_25;
    if (!((life3_9 == 0))) {
        forwardValue2773_31_0 = spill2773_1;
        break forward_join_31;
    }
    if (!((spill2773_1 == null))) {
        break forward_join_30;
    }
    forwardValue2773_32_0 = 0;
    break forward_join_32;
    }
    forwardValue2773_31_0 = life6_25;
    }
    forwardValue2773_32_0 = ((moom.Fs)(forwardValue2773_31_0)).b();
    }
    return forwardValue2773_32_0;
}

}
