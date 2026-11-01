package moom;


public class fn {

public static final moom.fn a;

public static final moom.fn b;

public static final moom.fn c;

public static final moom.fn d;

public static final moom.fn e;

public static final moom.fn f;

public static final moom.fn g;

public static final moom.fn h;

public static final moom.fn i;

public static final moom.fn j;

public static final moom.fn k;

public static final moom.fn l;

public static final moom.fn m;

public static final moom.fn n;

public static final moom.fn o;

public static final moom.fn p;

public static final moom.fn q;

public static final moom.fn r;

public static final moom.fn s;

public static final moom.fn t;

public static final moom.fn u;

public static final moom.fn v;

public static final moom.fn w;

public static final moom.fn x;

public static final moom.fn y;

public static final moom.fn z;

public static final moom.fn A;

public static final moom.fn B;

public static final moom.fn C;

public static final moom.fn D;

public static final moom.fn E;

public static final moom.fn F;

public static final moom.fn G;

public static final moom.fn H;

public static final moom.fn I;

private boolean J;

private boolean K;

private boolean L;

private final moom.fm M;

private boolean N;

private int O;

private boolean P;

private static net.minecraft.entity.Entity[] Q;

private static final long R;

private static final long S;

public fn(moom.fm p0) {
super();
    this.N = true;
    this.M = p0;
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-7307883229709884811L)), ((long)(-3527101305612547156L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(111443777411079L)))));
    java.lang.Object __sourceSpill840_6 = null;
    long local0_life7 = (moom.fn.R ^ 26468877923320L);
    moom.fn.b(((net.minecraft.entity.Entity[])(__sourceSpill840_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill840_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill840_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill840_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill840_15 = new byte[8];
    (__sourceSpill840_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill840_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation840_17 = __sourceSpill840_15;
    ((javax.crypto.Cipher)(__sourceSpill840_12)).init(((int)(__sourceSpill840_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill840_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation840_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 2813837248992492367L;
    byte[] __sourceSpill840_21 = new byte[8];
    (__sourceSpill840_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill840_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill840_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill840_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill840_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill840_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill840_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill840_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill840_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill840_22)).doFinal(((byte[])(__sourceSpill840_21)));
    S = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
    a = ((moom.fn)(new moom.fs(moom.fm.b)));
    b = ((moom.fn)(new moom.fn(moom.fm.c)));
    c = ((moom.fn)(new moom.fn(moom.fm.l)));
    d = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.o))).c()));
    e = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.m))).b()));
    f = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.h))).b()));
    g = ((moom.fn)(((moom.fn)(((moom.fn)(new moom.fn(moom.fm.h))).b())).f()));
    h = ((moom.fn)(((moom.fp)(new moom.fp(moom.fm.n))).e()));
    i = ((moom.fn)(((moom.fp)(new moom.fp(moom.fm.f))).e()));
    j = ((moom.fn)(((moom.fn)(((moom.fn)(((moom.fn)(new moom.fn(moom.fm.i))).c())).a__fn())).e()));
    k = ((moom.fn)(((moom.fq)(new moom.fq(moom.fm.i))).e()));
    l = ((moom.fn)(((moom.fn)(((moom.fn)(((moom.fq)(new moom.fq(moom.fm.i))).c())).e())).d()));
    m = ((moom.fn)(new moom.fn(moom.fm.t)));
    n = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.e))).c()));
    o = ((moom.fn)(((moom.fs)(new moom.fs(moom.fm.b))).e()));
    p = ((moom.fn)(new moom.fn(moom.fm.d)));
    q = ((moom.fn)(((moom.fq)(new moom.fq(moom.fm.b))).e()));
    r = ((moom.fn)(((moom.fq)(new moom.fq(moom.fm.e))).c()));
    s = ((moom.fn)(((moom.fn)(((moom.fn)(new moom.fn(moom.fm.b))).a__fn())).g()));
    t = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.b))).g()));
    u = ((moom.fn)(((moom.fn)(((moom.fn)(new moom.fn(moom.fm.f))).c())).a__fn()));
    v = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.i))).e()));
    w = ((moom.fn)(((moom.fn)(((moom.fn)(new moom.fn(moom.fm.g))).a__fn())).g()));
    x = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.g))).g()));
    y = ((moom.fn)(((moom.fn)(((moom.fn)(((moom.fn)(((moom.fq)(new moom.fq(moom.fm.j))).d())).a__fn())).b())).e()));
    z = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.j))).b()));
    A = ((moom.fn)(((moom.fn)(((moom.fn)(new moom.fn(moom.fm.i))).a__fn())).e()));
    B = ((moom.fn)(new moom.fn(moom.fm.k)));
    C = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.i))).e()));
    D = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.i))).e()));
    E = ((moom.fn)(((moom.fr)(new moom.fr(moom.fm.b))).f()));
    F = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.b))).e()));
    G = ((moom.fn)(((moom.fn)(((moom.fo)(new moom.fo(moom.fm.e))).b())).e()));
    H = ((moom.fn)(((moom.fn)(new moom.fn(moom.fm.m))).f()));
    I = ((moom.fn)(((moom.fn)(((moom.fn)(new moom.fn(moom.fm.b))).b())).f()));
}


protected moom.fn b() {
this.N = ((boolean)(false));
    return this;
}


public static void b(net.minecraft.entity.Entity[] p0) {
moom.fn.Q = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return moom.fn.Q;
}


public boolean b__Boolean() {
return ((1) != 0);
}


protected moom.fn e() {
this.O = ((int)(1));
    return this;
}


public boolean e__Boolean() {
return ((((this.J) ? 1 : 0)) != 0);
}


protected moom.fn c() {
this.J = ((boolean)(true));
    return this;
}


public boolean c__Boolean() {
return ((1) != 0);
}


public boolean h() {
return ((((this.N) ? 1 : 0)) != 0);
}


protected moom.fn f() {
long local1 = (moom.fn.R ^ 95877896809028L);
    this.O = ((int)(((int) moom.fn.S)));
    return this;
}


public boolean f__Boolean() {
return ((((this.K) ? 1 : 0)) != 0);
}


public moom.fn d() {
this.K = ((boolean)(true));
    return this;
}


public boolean d__Boolean() {
return ((1) != 0);
}


public moom.fm a__fm() {
return this.M;
}


public boolean a__Boolean() {
return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.O;
}


private moom.fn a__fn() {
this.L = ((boolean)(true));
    return this;
}


public boolean g__Boolean() {
int forwardValue3544_13_0;
    int forwardValue3544_17_0;
    int forwardValue3544_19_0;
    boolean spill3544_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.fn.R ^ 7439573289374L);
    life3_5 = moom.fm.b();
    spill3544_0 = this.L;
    if (!((life3_5 != 0))) {
        forwardValue3544_13_0 = ((spill3544_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3544_0))) {
        break forward_join_18;
    }
    forwardValue3544_13_0 = ((((moom.fn)(this)).d__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue3544_17_0 = forwardValue3544_13_0;
        break forward_join_17;
    }
    if (!((forwardValue3544_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue3544_17_0 = 1;
    }
    forwardValue3544_19_0 = forwardValue3544_17_0;
    break forward_join_19;
    }
    forwardValue3544_19_0 = 0;
    }
    return ((forwardValue3544_19_0) != 0);
}


protected moom.fn g() {
this.P = ((boolean)(true));
    return this;
}

}
