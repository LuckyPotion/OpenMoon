package moom;


public class DX extends moom.DT {

private int p;

private int q;

private int r;

private final int s;

private moom.DX[] t;

private boolean u;

private static final long x;

private static final long E;

public DX(int p0, int p1, int p2, int p3) {
super(0, 0, 0);
    this.p = p0;
    this.q = p1;
    this.r = p2;
    this.s = p3;
}


public DX(double p0, double p1, double p2) {
this(moom.Dr.b__Int(((double)(p0))), moom.Dr.b__Int(((double)(p1))), moom.Dr.b__Int(((double)(p2))));
    return;
}


public DX(int p0, int p1, int p2) {
this(p0, p1, p2, 0);
}


static {
x = ((long)(((moom._a)(moom._c.a(((long)(6440078096367071852L)), ((long)(-2751688295057497140L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195332487728628L)))));
    long local0_life6 = (moom.DX.x ^ 29208240829361L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill514_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill514_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill514_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill514_13 = new byte[8];
    (__sourceSpill514_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill514_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation514_15 = __sourceSpill514_13;
    ((javax.crypto.Cipher)(__sourceSpill514_10)).init(((int)(__sourceSpill514_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill514_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation514_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6400052685764800938L;
    byte[] __sourceSpill514_19 = new byte[8];
    (__sourceSpill514_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill514_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill514_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill514_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill514_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill514_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill514_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill514_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill514_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill514_20)).doFinal(((byte[])(__sourceSpill514_19)));
    E = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public moom.DT b(moom.bs p0) {
return ((moom.DX)(this)).a(((moom.bs)(p0)));
}


public int b() {
return this.q;
}


public static java.lang.Iterable c(moom.DT p0, moom.DT p1) {
moom.DT local2 = new moom.DT(java.lang.Math.min(((int)(((moom.DT)(p0)).a())), ((int)(((moom.DT)(p1)).a()))), java.lang.Math.min(((int)(((moom.DT)(p0)).b())), ((int)(((moom.DT)(p1)).b()))), java.lang.Math.min(((int)(((moom.DT)(p0)).c())), ((int)(((moom.DT)(p1)).c()))));
    moom.DT local3 = new moom.DT(java.lang.Math.max(((int)(((moom.DT)(p0)).a())), ((int)(((moom.DT)(p1)).a()))), java.lang.Math.max(((int)(((moom.DT)(p0)).b())), ((int)(((moom.DT)(p1)).b()))), java.lang.Math.max(((int)(((moom.DT)(p0)).c())), ((int)(((moom.DT)(p1)).c()))));
    return new moom.I_(local2, local3);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public int c() {
return this.r;
}


public moom.DT a(moom.bs p0, int p1) {
long local3 = (moom.DX.x ^ 47082606314118L);
    return ((p1 == 1) ? ((moom.DX)(this)).a(((moom.bs)(p0))) : super.a(((moom.bs)(p0)), ((int)(p1))));
}


private void a__Void() {
moom.DX lexicalValue555_54_0;
    net.minecraft.entity.Entity[] spill555_0;
    moom.DX spill555_1;
    long life1_3;
    int life4_6;
    net.minecraft.entity.Entity[] life3_7;
    moom.DX life5_16;
    moom.bs life6_32;
    int life7_38;
    int life8_44;
    int life9_50;
    lexical_join_54: {
    lexical_join_53: {
    life1_3 = (moom.DX.x ^ 114947953216581L);
    spill555_0 = moom.JM.b__Arrayr3();
    life4_6 = 0;
    life3_7 = spill555_0;
    lexical_cycle_8: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    if (!((life4_6 < ((int) moom.DX.E)))) {
        break lexical_join_53;
    }
    life5_16 = (this.t)[life4_6];
    if (!((life3_7 != null))) {
        break lexical_join_51;
    }
    spill555_1 = life5_16;
    if (!((life3_7 != null))) {
        lexicalValue555_54_0 = spill555_1;
        break lexical_join_54;
    }
    if (!((spill555_1 != null))) {
        break lexical_join_50;
    }
    life6_32 = (moom.bs.VALUES)[life4_6];
    life7_38 = (this.p + ((moom.bs)(life6_32)).c());
    life8_44 = (this.q + ((moom.bs)(life6_32)).d());
    life9_50 = (this.r + ((moom.bs)(life6_32)).e());
    ((moom.DX)(life5_16)).a__Void(((int)(life7_38)), ((int)(life8_44)), ((int)(life9_50)));
    }
    life4_6 += 1;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue555_54_0 = this;
    }
    ((moom.DX)(lexicalValue555_54_0)).u = ((boolean)(false));
    return;
}


public moom.DX a(int p0, int p1, int p2) {
((moom.DX)(this)).a__Void(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return this;
}


public int a() {
return this.p;
}


public moom.DX a__sourceReturn_dc5930eda7(moom.DS p0) {
((moom.DX)(this)).a__Void(((int)(((moom.DS)(p0)).a())), ((int)(((moom.DS)(p0)).b())), ((int)(((moom.DS)(p0)).c())));
    return this;
}


public void a__sourceReturn_a59262c0f0(double p0, double p1, double p2) {
((moom.DX)(this)).a__Void(((int)(moom.Dr.b__Int(((double)(p0))))), ((int)(moom.Dr.b__Int(((double)(p1))))), ((int)(moom.Dr.b__Int(((double)(p2))))));
    return;
}


public void a__Void(int p0, int p1, int p2) {
this.p = ((int)(p0));
    this.q = ((int)(p1));
    this.r = ((int)(p2));
    this.u = ((boolean)(true));
    return;
}


public moom.DT a(moom.bs p0) {
moom.DX forwardValue1700_17_0;
    moom.DX forwardValue1700_27_0;
    int forwardValue1700_35_0;
    moom.DX forwardValue1700_80_0;
    moom.DX spill1700_0;
    boolean spill1700_1;
    moom.DX spill1700_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_52;
    moom.DX life6_57;
    int life7_70;
    int life8_76;
    int life9_82;
    forward_join_80: {
    forward_join_79: {
    forward_join_35: {
    forward_join_33: {
    forward_join_27: {
    forward_join_26: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.DX.x ^ 4012103764640L);
    life4_5 = moom.JM.b__Arrayr3();
    spill1700_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1700_17_0 = spill1700_0;
        break forward_join_17;
    }
    if (!((((moom.DX)(spill1700_0)).s <= 0))) {
        break forward_join_16;
    }
    return super.a(((moom.bs)(p0)), ((int)(1)));
    }
    forwardValue1700_17_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue1700_27_0 = forwardValue1700_17_0;
        break forward_join_27;
    }
    if (!((((moom.DX)(forwardValue1700_17_0)).t == null))) {
        break forward_join_26;
    }
    this.t = ((moom.DX[])(new moom.DX[(moom.bs.VALUES).length]));
    }
    forwardValue1700_27_0 = this;
    }
    spill1700_1 = ((moom.DX)(forwardValue1700_27_0)).u;
    if (!((life4_5 != null))) {
        forwardValue1700_35_0 = ((spill1700_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill1700_1)) {
        break forward_join_33;
    }
    ((moom.DX)(this)).a__Void();
    }
    forwardValue1700_35_0 = ((moom.bs)(p0)).a();
    }
    life5_52 = forwardValue1700_35_0;
    life6_57 = (this.t)[life5_52];
    spill1700_2 = life6_57;
    if (!((life4_5 != null))) {
        forwardValue1700_80_0 = spill1700_2;
        break forward_join_80;
    }
    if (!((spill1700_2 == null))) {
        break forward_join_79;
    }
    life7_70 = (this.p + ((moom.bs)(p0)).c());
    life8_76 = (this.q + ((moom.bs)(p0)).d());
    life9_82 = (this.r + ((moom.bs)(p0)).e());
    life6_57 = new moom.DX(life7_70, life8_76, life9_82, (this.s - 1));
    (this.t)[life5_52] = life6_57;
    }
    forwardValue1700_80_0 = life6_57;
    }
    return forwardValue1700_80_0;
}


public moom.DT g() {
return new moom.DT(this.p, this.q, this.r);
}

}
