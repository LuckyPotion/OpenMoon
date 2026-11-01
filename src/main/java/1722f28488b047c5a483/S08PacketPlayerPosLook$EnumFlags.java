package net.minecraft.network.play.server;


public class S08PacketPlayerPosLook$EnumFlags extends sourcebuild.EnumConstructor<net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags> {

public static net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags X;

public static net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags Y;

public static net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags Z;

public static net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags Y_ROT;

public static net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags X_ROT;

private int a;

private static net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags[] b;

private static long c;

private S08PacketPlayerPosLook$EnumFlags(java.lang.String p0, int p1, int p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(8278162894098126577L)), ((long)(-884015702512528668L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(217577245697961L)))));
    X = ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(new net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags("X", 0, 0)));
    Y = ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(new net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags("Y", 1, 1)));
    Z = ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(new net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags("Z", 2, 2)));
    Y_ROT = ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(new net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags("Y_ROT", 3, 3)));
    X_ROT = ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(new net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags("X_ROT", 4, 4)));
    b = ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags[])(net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.a__Arraybh()));
}


public static net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags[] values() {
return ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags[])(((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags[])(net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.b)).clone()));
}


public static net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags valueOf(java.lang.String p0) {
return ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags[] a__Arraybh() {
return new net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags[] {net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.X, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.Y, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.Z, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.Y_ROT, net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.X_ROT};
}


public static int a(java.util.Set<net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags> p0) {
int lexicalValue1640_28_0;
    int[] spill1640_0;
    int spill1640_1;
    long life1_3;
    int life4_6;
    int[] life3_7;
    java.util.Iterator life5_10;
    net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags life6_17;
    lexical_join_28: {
    lexical_join_27: {
    life1_3 = (net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.c ^ 21226174335026L);
    spill1640_0 = moom.zN.b__ArrayInt();
    life4_6 = 0;
    life3_7 = spill1640_0;
    life5_10 = ((java.util.Set)(p0)).iterator();
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life5_10)).hasNext())) {
        break lexical_join_27;
    }
    life6_17 = ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(((java.util.Iterator)(life5_10)).next()));
    spill1640_1 = (life4_6 | ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(life6_17)).a());
    if (!((life3_7 == null))) {
        lexicalValue1640_28_0 = spill1640_1;
        break lexical_join_28;
    }
    life4_6 = spill1640_1;
    if (!((life3_7 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue1640_28_0 = life4_6;
    }
    return lexicalValue1640_28_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.util.Set<net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags> a(int p0) {
int[] spill1639_0;
    long life1_3;
    java.util.EnumSet life4_7;
    net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags[] life5_9;
    int[] life3_10;
    int life6_13;
    int life7_15;
    net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags life8_22;
    lexical_join_36: {
    life1_3 = (net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.c ^ 54127623904687L);
    spill1639_0 = moom.zN.b__ArrayInt();
    life4_7 = java.util.EnumSet.noneOf(((java.lang.Class)(net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.class)));
    life5_9 = net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.values();
    life3_10 = spill1639_0;
    life6_13 = (life5_9).length;
    life7_15 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life7_15 < life6_13))) {
        break lexical_join_36;
    }
    life8_22 = (life5_9)[life7_15];
    if (!((life3_10 == null))) {
        break lexical_join_34;
    }
    if (!(((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(life8_22)).a__Boolean(((int)(p0))))) {
        break lexical_join_33;
    }
    ((java.util.Set)(life4_7)).add(((java.lang.Object)(life8_22)));
    }
    life7_15 += 1;
    }
    if (!((life3_10 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return life4_7;
}


private boolean a__Boolean(int p0) {
int forwardValue5537_16_0;
    int forwardValue5537_18_0;
    int spill5537_0;
    long life2_3;
    int[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags.c ^ 72780905152837L);
    life4_5 = moom.zN.b__ArrayInt();
    spill5537_0 = (p0 & ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(this)).a());
    if (!((life4_5 == null))) {
        forwardValue5537_16_0 = spill5537_0;
        break forward_join_16;
    }
    if (!((spill5537_0 == ((net.minecraft.network.play.server.S08PacketPlayerPosLook$EnumFlags)(this)).a()))) {
        break forward_join_17;
    }
    forwardValue5537_16_0 = 1;
    }
    forwardValue5537_18_0 = forwardValue5537_16_0;
    break forward_join_18;
    }
    forwardValue5537_18_0 = 0;
    }
    return ((forwardValue5537_18_0) != 0);
}


private int a() {
return (1 << this.a);
}

}
