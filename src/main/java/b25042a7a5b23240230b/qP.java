package moom;


class qP {

double a;

double b;

private static final long c;

private static final long d;

qP() {
super();
}


qP(double p0, double p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(1185702516712088864L)), ((long)(6034015230109728976L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261600041152855L)))));
    long local0_life6 = (moom.qP.c ^ 86177275626897L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill973_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill973_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill973_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill973_13 = new byte[8];
    (__sourceSpill973_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill973_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation973_15 = __sourceSpill973_13;
    ((javax.crypto.Cipher)(__sourceSpill973_10)).init(((int)(__sourceSpill973_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill973_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation973_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7785706764178825383L;
    byte[] __sourceSpill973_19 = new byte[8];
    (__sourceSpill973_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill973_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill973_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill973_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill973_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill973_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill973_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill973_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill973_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill973_20)).doFinal(((byte[])(__sourceSpill973_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int a(net.minecraft.world.World p0) {
moom.DT forestValue492_20_0;
    boolean spill492_0;
    moom.DT spill492_1;
    long life2_3;
    moom.DT life5_13;
    int life4_14;
    forest_join_35: {
    life2_3 = (moom.qP.c ^ 3155374749167L);
    spill492_0 = moom.b7.c();
    life5_13 = new moom.DT(this.a, 0x1.0p8d, this.b);
    life4_14 = ((spill492_0) ? 1 : 0);
    forest_cycle_15: while (true) {
    if (!((((moom.DT)(life5_13)).b() > 0))) {
        break forest_join_35;
    }
    forestValue492_20_0 = ((moom.DT)(life5_13)).b__DT();
    forest_cycle_20: while (true) {
    life5_13 = forestValue492_20_0;
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life5_13))))).a__ch())).a__fn() != moom.fn.a))) {
        continue forest_cycle_15;
    }
    spill492_1 = life5_13;
    if (!((life4_14 != 0))) {
        forestValue492_20_0 = spill492_1;
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    break forest_cycle_15;
    }
    return (((moom.DT)(spill492_1)).b() + 1);
    }
    return ((int) moom.qP.d);
}


public boolean a__Boolean(net.minecraft.world.World p0) {
moom.fn lexicalValue1274_33_0;
    moom.fn lexicalValue1274_38_0;
    int lexicalValue1274_43_0;
    boolean spill1274_0;
    moom.fn spill1274_1;
    long life2_3;
    moom.DT life5_13;
    int life4_14;
    moom.fn life6_26;
    lexical_join_46: {
    life2_3 = (moom.qP.c ^ 126595804033661L);
    spill1274_0 = moom.b7.c();
    life5_13 = new moom.DT(this.a, 0x1.0p8d, this.b);
    life4_14 = ((spill1274_0) ? 1 : 0);
    lexical_cycle_15: while (true) {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_38: {
    lexical_join_33: {
    if (!((((moom.DT)(life5_13)).b() > 0))) {
        break lexical_join_46;
    }
    life5_13 = ((moom.DT)(life5_13)).b__DT();
    life6_26 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life5_13))))).a__ch())).a__fn();
    spill1274_1 = life6_26;
    if (!((life4_14 != 0))) {
        lexicalValue1274_33_0 = spill1274_1;
        break lexical_join_33;
    }
    if (!((spill1274_1 != moom.fn.a))) {
        break lexical_join_44;
    }
    lexicalValue1274_33_0 = life6_26;
    }
    if (!((life4_14 != 0))) {
        lexicalValue1274_38_0 = lexicalValue1274_33_0;
        break lexical_join_38;
    }
    if (!((!((moom.fn)(lexicalValue1274_33_0)).a__Boolean()))) {
        break lexical_join_42;
    }
    lexicalValue1274_38_0 = life6_26;
    }
    if (!((lexicalValue1274_38_0 != moom.fn.o))) {
        break lexical_join_42;
    }
    lexicalValue1274_43_0 = 1;
    break lexical_join_43;
    }
    lexicalValue1274_43_0 = 0;
    }
    return ((lexicalValue1274_43_0) != 0);
    }
    if (!((life4_14 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return ((0) != 0);
}


public void a(java.util.Random p0, double p1, double p2, double p3, double p4) {
this.a = ((double)(moom.Dr.a(((java.util.Random)(p0)), ((double)(p1)), ((double)(p3)))));
    this.b = ((double)(moom.Dr.a(((java.util.Random)(p0)), ((double)(p2)), ((double)(p4)))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


double a(moom.qP p0) {
double local2 = (this.a - ((moom.qP)(p0)).a);
    double local4 = (this.b - ((moom.qP)(p0)).b);
    return java.lang.Math.sqrt(((double)(((local2 * local2) + (local4 * local4)))));
}


void a__Void() {
double local1_life1 = ((double) this.a());
    this.a /= local1_life1;
    this.b /= local1_life1;
    return;
}


float a() {
return moom.Dr.a__Float(((double)(((this.a * this.a) + (this.b * this.b)))));
}


public void a__Void(moom.qP p0) {
this.a -= ((moom.qP)(p0)).a;
    this.b -= ((moom.qP)(p0)).b;
    return;
}


public boolean a(double p0, double p1, double p2, double p3) {
int forwardValue3848_26_0;
    int forwardValue3848_38_0;
    int forwardValue3848_52_0;
    int forwardValue3848_61_0;
    boolean spill3848_0;
    int spill3848_1;
    long life9_3;
    int life12_6;
    int life11_7;
    forward_join_61: {
    forward_join_60: {
    forward_join_52: {
    forward_join_48: {
    forward_join_38: {
    forward_join_34: {
    forward_join_26: {
    forward_join_22: {
    life9_3 = (moom.qP.c ^ 1403228264874L);
    spill3848_0 = moom.b7.c();
    life12_6 = 0;
    life11_7 = ((spill3848_0) ? 1 : 0);
    spill3848_1 = recovery.source.CarrierOps.dcmpg(((double)(this.a)), ((double)(p0)));
    if (!((life11_7 != 0))) {
        forwardValue3848_26_0 = spill3848_1;
        break forward_join_26;
    }
    if (!((spill3848_1 < 0))) {
        break forward_join_22;
    }
    this.a = ((double)(p0));
    life12_6 = 1;
    if (!((life11_7 == 0))) {
        break forward_join_34;
    }
    }
    forwardValue3848_26_0 = recovery.source.CarrierOps.dcmpl(((double)(this.a)), ((double)(p2)));
    }
    if (!((life11_7 != 0))) {
        forwardValue3848_38_0 = forwardValue3848_26_0;
        break forward_join_38;
    }
    if (!((forwardValue3848_26_0 > 0))) {
        break forward_join_34;
    }
    this.a = ((double)(p2));
    life12_6 = 1;
    }
    forwardValue3848_38_0 = recovery.source.CarrierOps.dcmpg(((double)(this.b)), ((double)(p1)));
    }
    if (!((life11_7 != 0))) {
        forwardValue3848_52_0 = forwardValue3848_38_0;
        break forward_join_52;
    }
    if (!((forwardValue3848_38_0 < 0))) {
        break forward_join_48;
    }
    this.b = ((double)(p1));
    life12_6 = 1;
    if (!((life11_7 == 0))) {
        break forward_join_60;
    }
    }
    forwardValue3848_52_0 = recovery.source.CarrierOps.dcmpl(((double)(this.b)), ((double)(p3)));
    }
    if (!((life11_7 != 0))) {
        forwardValue3848_61_0 = forwardValue3848_52_0;
        break forward_join_61;
    }
    if (!((forwardValue3848_52_0 > 0))) {
        break forward_join_60;
    }
    this.b = ((double)(p3));
    life12_6 = 1;
    }
    forwardValue3848_61_0 = life12_6;
    }
    return ((forwardValue3848_61_0) != 0);
}

}
