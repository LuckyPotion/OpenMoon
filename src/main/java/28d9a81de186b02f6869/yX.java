package moom;


public class yX implements moom.yK<moom.yV> {

private byte[] a;

private byte[] b;

private static long c;

public yX() { super(); }


private static void __sourceConstructorBody_6865868ee2b4de92(moom.yX receiver) throws Throwable {

long local1_life1 = (moom.yX.c ^ 473123894703L);

    moom.yX.__sourceConstructorInit_6865868ee2b4de92_0(((moom.yX)(receiver)));

    ((moom.yX)(receiver)).a = ((byte[])(new byte[0]));

    int[] __sourceSpill850_6 = moom.yW.b();

    ((moom.yX)(receiver)).b = ((byte[])(new byte[0]));

    int[] local3_life7 = __sourceSpill850_6;

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        moom.yW.b(((int[])(new int[2])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6865868ee2b4de92_0(moom.yX a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_4ca0c05487b6a61b_0(moom.yX a0) throws E;

public yX(javax.crypto.SecretKey p0, java.security.PublicKey p1, byte[] p2) { super(); }


private static void __sourceConstructorBody_4ca0c05487b6a61b(moom.yX receiver, javax.crypto.SecretKey p0, java.security.PublicKey p1, byte[] p2) throws Throwable {

long local4_life1 = (moom.yX.c ^ 9751043960814L);

    int[] __sourceSpill851_3 = moom.yW.b();

    moom.yX.__sourceConstructorInit_4ca0c05487b6a61b_0(((moom.yX)(receiver)));

    int[] local6_life5 = __sourceSpill851_3;

    ((moom.yX)(receiver)).a = ((byte[])(new byte[0]));

    ((moom.yX)(receiver)).b = ((byte[])(new byte[0]));

    ((moom.yX)(receiver)).a = ((byte[])(net.minecraft.util.CryptManager.a(((java.security.Key)(p1)), ((byte[])(((javax.crypto.SecretKey)(p0)).getEncoded())))));

    ((moom.yX)(receiver)).b = ((byte[])(net.minecraft.util.CryptManager.a(((java.security.Key)(p1)), ((byte[])(p2)))));

    if ((local6_life5 != null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));

    }

    return;

}



static {
moom.yX.c = (moom._c.a(-9040129131926517135L, -3056005754422384776L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(153393515738184L);
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((byte[])(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((byte[])(this.b)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public byte[] a__ArrayByte(java.security.PrivateKey p0) {
java.security.PrivateKey forwardValue4559_14_0;
    byte[] forwardValue4559_17_0;
    java.security.PrivateKey spill4559_0;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.yX.c ^ 10490185694079L);
    life4_5 = moom.yW.b();
    spill4559_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue4559_14_0 = spill4559_0;
        break forward_join_14;
    }
    if (!((spill4559_0 == null))) {
        break forward_join_13;
    }
    forwardValue4559_17_0 = this.b;
    break forward_join_17;
    }
    forwardValue4559_14_0 = p0;
    }
    forwardValue4559_17_0 = net.minecraft.util.CryptManager.b(((java.security.Key)(forwardValue4559_14_0)), ((byte[])(this.b)));
    }
    return forwardValue4559_17_0;
}


public javax.crypto.SecretKey a(java.security.PrivateKey p0) {
return net.minecraft.util.CryptManager.a(((java.security.PrivateKey)(p0)), ((byte[])(this.a)));
}


public void a(moom.yV p0) {
((moom.yV)(p0)).a(((moom.yX)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((byte[])(((net.minecraft.network.PacketBuffer)(p0)).a__ArrayByte()));
    this.b = ((byte[])(((net.minecraft.network.PacketBuffer)(p0)).a__ArrayByte()));
    return;
}

}
