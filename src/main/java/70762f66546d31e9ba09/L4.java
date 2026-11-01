package moom;


public class L4 implements net.minecraft.world.IBlockAccess {

private moom.Ec a;

private int b;

private int c;

private int d;

private int e;

private int f;

private int g;

private int h;

private int[] i;

private net.minecraft.block.state.IBlockState[] j;

private int k;

private boolean l;

private static moom.NC m;

private static moom.NC n;

private static long o;

public L4(moom.Ec p0, moom.DT p1, moom.DT p2, int p3) { super(); }


private static void __sourceConstructorBody_07508edc403c844c(moom.L4 receiver, moom.Ec p0, moom.DT p1, moom.DT p2, int p3) throws Throwable {

long local5_life1 = (moom.L4.o ^ 53671146441628L);

    java.lang.String[] __sourceSpill623_3 = __sourceExactCall_7fb8207a1d9353();

    moom.L4.__sourceConstructorInit_07508edc403c844c_0(((moom.L4)(receiver)));

    ((moom.L4)(receiver)).l = ((boolean)(moom.BU.ay()));

    ((moom.L4)(receiver)).a = ((moom.Ec)(p0));

    int local8_life9 = ((((moom.DT)(p1)).a() - p3) >> 4);

    int local9_life11 = ((__sourceExactCall_83272ff1cb0754(((moom.DT)(p1))) - p3) >> 4);

    int local10_life13 = ((((moom.DT)(p1)).c() - p3) >> 4);

    java.lang.String[] local7_life14 = __sourceSpill623_3;

    int local11_life16 = ((((moom.DT)(p2)).a() + p3) >> 4);

    int local12_life18 = ((__sourceExactCall_83272ff1cb0754(((moom.DT)(p2))) + p3) >> 4);

    int local13_life20 = ((((moom.DT)(p2)).c() + p3) >> 4);

    ((moom.L4)(receiver)).e = ((int)((((local11_life16 - local8_life9) + 1) << 4)));

    ((moom.L4)(receiver)).f = ((int)((((local12_life18 - local9_life11) + 1) << 4)));

    ((moom.L4)(receiver)).g = ((int)((((local13_life20 - local10_life13) + 1) << 4)));

    ((moom.L4)(receiver)).h = ((int)((((moom.L4)(receiver)).e * ((moom.L4)(receiver)).f)));

    ((moom.L4)(receiver)).k = ((int)(((((moom.L4)(receiver)).e * ((moom.L4)(receiver)).f) * ((moom.L4)(receiver)).g)));

    ((moom.L4)(receiver)).b = ((int)((local8_life9 << 4)));

    ((moom.L4)(receiver)).c = ((int)((local9_life11 << 4)));

    ((moom.L4)(receiver)).d = ((int)((local10_life13 << 4)));

    if ((local7_life14 != null)) {

        __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_07508edc403c844c_0(moom.L4 a0) throws E;

static {
o = ((long)(((moom._a)(moom._c.a(((long)(-3263314215085023092L)), ((long)(-3902855617313522264L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(266928921639513L)))));
    long local11_life6 = (moom.L4.o ^ 140289361587913L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill662_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill662_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill662_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill662_13 = new byte[8];
    (__sourceSpill662_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill662_13)[local2_life14] = ((byte) ((int) ((local11_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation662_15 = __sourceSpill662_13;
    ((javax.crypto.Cipher)(__sourceSpill662_10)).init(((int)(__sourceSpill662_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill662_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation662_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life18 = new long[2];
    int local4_life19 = 0;
    java.lang.String local5_life20;
    int local6_life22 = ((java.lang.String)((local5_life20 = "rã¢¿o\005Rué6\001úú\031û"))).length();
    int local3_life23 = 0;
    do {
        java.lang.String __sourceSpill662_24 = local5_life20;
        int __sourceSpill662_25 = local3_life23;
        local3_life23 += 8;
        byte[] local7_life28 = ((java.lang.String)(((java.lang.String)(__sourceSpill662_24)).substring(((int)(__sourceSpill662_25)), ((int)(local3_life23))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill662_29 = local0_life18;
        int __sourceSpill662_30 = local4_life19;
        local4_life19 += 1;
        long local8_life31 = (((((((((((long) (local7_life28)[0]) & 255L) << 56) | ((((long) (local7_life28)[1]) & 255L) << 48)) | ((((long) (local7_life28)[2]) & 255L) << 40)) | ((((long) (local7_life28)[3]) & 255L) << 32)) | ((((long) (local7_life28)[4]) & 255L) << 24)) | ((((long) (local7_life28)[5]) & 255L) << 16)) | ((((long) (local7_life28)[6]) & 255L) << 8)) | (((long) (local7_life28)[7]) & 255L));
        byte[] __sourceSpill662_32 = new byte[8];
        (__sourceSpill662_32)[0] = ((byte) ((int) (local8_life31 >>> 56)));
        (__sourceSpill662_32)[1] = ((byte) ((int) (local8_life31 >>> 48)));
        (__sourceSpill662_32)[2] = ((byte) ((int) (local8_life31 >>> 40)));
        (__sourceSpill662_32)[3] = ((byte) ((int) (local8_life31 >>> 32)));
        (__sourceSpill662_32)[4] = ((byte) ((int) (local8_life31 >>> 24)));
        (__sourceSpill662_32)[5] = ((byte) ((int) (local8_life31 >>> 16)));
        (__sourceSpill662_32)[6] = ((byte) ((int) (local8_life31 >>> 8)));
        (__sourceSpill662_32)[7] = ((byte) ((int) local8_life31));
        javax.crypto.Cipher __sourceSpill662_33 = local1_life8;
        byte[] local10_life35 = ((javax.crypto.Cipher)(__sourceSpill662_33)).doFinal(((byte[])(__sourceSpill662_32)));
        (__sourceSpill662_29)[__sourceSpill662_30] = (((((((((((long) (local10_life35)[0]) & 255L) << 56) | ((((long) (local10_life35)[1]) & 255L) << 48)) | ((((long) (local10_life35)[2]) & 255L) << 40)) | ((((long) (local10_life35)[3]) & 255L) << 32)) | ((((long) (local10_life35)[4]) & 255L) << 24)) | ((((long) (local10_life35)[5]) & 255L) << 16)) | ((((long) (local10_life35)[6]) & 255L) << 8)) | (((long) (local10_life35)[7]) & 255L));
    } while ((!(local3_life23 >= local6_life22)));
    m = ((moom.NC)(new moom.NC(java.lang.Integer.TYPE, ((int) (local0_life18)[1]))));
    n = ((moom.NC)(new moom.NC(net.minecraft.block.state.IBlockState.class, ((int) (local0_life18)[0]))));
}


private int b(moom.DT p0, int p1) {
int forwardValue2545_30_0;
    java.lang.String[] spill2545_0;
    boolean spill2545_1;
    boolean spill2545_2;
    long life3_3;
    int life6_10;
    java.lang.String[] life5_11;
    forward_join_30: {
    forward_join_29: {
    life3_3 = (moom.L4.o ^ 55752292669770L);
    spill2545_0 = __sourceExactCall_7fb8207a1d9353();
    life6_10 = ((moom.Ec)(this.a)).a(((moom.DT)(p0)), ((int)(p1)));
    life5_11 = spill2545_0;
    spill2545_1 = this.l;
    if (!((life5_11 == null))) {
        forwardValue2545_30_0 = ((spill2545_1) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill2545_1)) {
        break forward_join_29;
    }
    spill2545_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((moom.L4)(this)).a__fE(((moom.DT)(p0))))).a__ch())).j();
    if (!((life5_11 == null))) {
        forwardValue2545_30_0 = ((spill2545_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!((!spill2545_2))) {
        break forward_join_29;
    }
    life6_10 = moom.JF.a(((moom.DT)(p0)), ((int)(life6_10)));
    }
    forwardValue2545_30_0 = life6_10;
    }
    return forwardValue2545_30_0;
}


public void b() {
((moom.NC)(moom.L4.m)).a(((java.lang.Object)(this.i)));
    this.i = ((int[])(null));
    ((moom.NC)(moom.L4.n)).a(((java.lang.Object)(this.j)));
    this.j = ((net.minecraft.block.state.IBlockState[])(null));
    return;
}


public boolean d__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.Ec)(this.a)).d__Boolean())) != 0);
}


public net.minecraft.tileentity.TileEntity a__B9(moom.DT p0) {
return ((moom.Ec)(this.a)).a__B9(((moom.DT)(p0)));
}


public net.minecraft.world.WorldType a__EL() {
return ((moom.Ec)(this.a)).a__EL();
}


public boolean a__Boolean(moom.DT p0) {
return (__sourceIntrinsic_booleanComparison((((moom.Ec)(this.a)).a__Boolean(((moom.DT)(p0))))) != 0);
}


private int a(moom.DT p0) {
int forwardValue2541_49_0;
    int forwardValue2541_64_0;
    int forwardValue2541_64_1;
    int forwardValue2541_67_0;
    int forwardValue2541_69_0;
    int forwardValue2541_71_0;
    java.lang.String[] spill2541_0;
    int spill2541_1;
    int spill2541_2;
    int spill2541_3;
    int spill2541_4;
    int spill2541_5;
    int spill2541_6;
    long life2_3;
    int life5_10;
    java.lang.String[] life4_11;
    int life6_36;
    int life7_61;
    forward_join_71: {
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    forward_join_64: {
    forward_join_49: {
    life2_3 = (moom.L4.o ^ 113885480874709L);
    spill2541_0 = __sourceExactCall_7fb8207a1d9353();
    life5_10 = (((moom.DT)(p0)).a() - this.b);
    life4_11 = spill2541_0;
    spill2541_1 = life5_10;
    if (!((life4_11 == null))) {
        forwardValue2541_71_0 = spill2541_1;
        break forward_join_71;
    }
    if (!((spill2541_1 >= 0))) {
        break forward_join_70;
    }
    spill2541_2 = life5_10;
    if (!((life4_11 == null))) {
        forwardValue2541_71_0 = spill2541_2;
        break forward_join_71;
    }
    if (!((spill2541_2 < this.e))) {
        break forward_join_70;
    }
    life6_36 = (((moom.DT)(p0)).b() - this.c);
    spill2541_3 = life6_36;
    if (!((life4_11 == null))) {
        forwardValue2541_69_0 = spill2541_3;
        break forward_join_69;
    }
    if (!((spill2541_3 >= 0))) {
        break forward_join_68;
    }
    spill2541_4 = life6_36;
    if (!((life4_11 == null))) {
        forwardValue2541_69_0 = spill2541_4;
        break forward_join_69;
    }
    if (!((spill2541_4 < this.f))) {
        break forward_join_68;
    }
    life7_61 = (((moom.DT)(p0)).c() - this.d);
    spill2541_5 = life7_61;
    if (!((life4_11 == null))) {
        forwardValue2541_49_0 = spill2541_5;
        break forward_join_49;
    }
    if (!((spill2541_5 >= 0))) {
        break forward_join_66;
    }
    forwardValue2541_49_0 = life7_61;
    }
    spill2541_6 = this.g;
    if (!((life4_11 == null))) {
        forwardValue2541_64_0 = forwardValue2541_49_0;
        forwardValue2541_64_1 = spill2541_6;
        break forward_join_64;
    }
    if (!((forwardValue2541_49_0 < spill2541_6))) {
        break forward_join_66;
    }
    forwardValue2541_64_0 = ((life7_61 * this.h) + (life6_36 * this.e));
    forwardValue2541_64_1 = life5_10;
    }
    forwardValue2541_67_0 = (forwardValue2541_64_0 + forwardValue2541_64_1);
    break forward_join_67;
    }
    forwardValue2541_67_0 = -1;
    }
    return forwardValue2541_67_0;
    }
    forwardValue2541_69_0 = -1;
    }
    return forwardValue2541_69_0;
    }
    forwardValue2541_71_0 = -1;
    }
    return forwardValue2541_71_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
int[] forwardValue2543_20_0;
    net.minecraft.block.state.IBlockState[] forwardValue2543_36_0;
    int[] spill2543_0;
    net.minecraft.block.state.IBlockState[] spill2543_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_36: {
    forward_join_34: {
    forward_join_20: {
    forward_join_18: {
    life1_3 = (moom.L4.o ^ 139224433533609L);
    life3_5 = __sourceExactCall_7fb8207a1d9353();
    spill2543_0 = this.i;
    if (!((life3_5 == null))) {
        forwardValue2543_20_0 = spill2543_0;
        break forward_join_20;
    }
    if (!((spill2543_0 == null))) {
        break forward_join_18;
    }
    this.i = ((int[])(((int[])(((moom.NC)(moom.L4.m)).a(((int)(this.k)))))));
    }
    forwardValue2543_20_0 = this.i;
    }
    java.util.Arrays.fill(((int[])(forwardValue2543_20_0)), ((int)(-1)));
    spill2543_1 = this.j;
    if (!((life3_5 == null))) {
        forwardValue2543_36_0 = spill2543_1;
        break forward_join_36;
    }
    if (!((spill2543_1 == null))) {
        break forward_join_34;
    }
    this.j = ((net.minecraft.block.state.IBlockState[])(((net.minecraft.block.state.IBlockState[])(((moom.NC)(moom.L4.n)).a(((int)(this.k)))))));
    }
    forwardValue2543_36_0 = this.j;
    }
    java.util.Arrays.fill(((java.lang.Object[])(forwardValue2543_36_0)), ((java.lang.Object)(null)));
    return;
}


public net.minecraft.block.state.IBlockState a__fE(moom.DT p0) {
int forwardValue2544_15_0;
    net.minecraft.block.state.IBlockState forwardValue2544_43_0;
    moom.L4 forwardValue2544_45_0;
    java.lang.String[] spill2544_0;
    int spill2544_1;
    moom.L4 spill2544_2;
    net.minecraft.block.state.IBlockState spill2544_3;
    long life2_3;
    int life5_8;
    java.lang.String[] life4_9;
    net.minecraft.block.state.IBlockState life6_36;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_15: {
    life2_3 = (moom.L4.o ^ 67541939397979L);
    spill2544_0 = __sourceExactCall_7fb8207a1d9353();
    life5_8 = ((moom.L4)(this)).a(((moom.DT)(p0)));
    life4_9 = spill2544_0;
    spill2544_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2544_15_0 = spill2544_1;
        break forward_join_15;
    }
    if (!((spill2544_1 >= 0))) {
        break forward_join_44;
    }
    forwardValue2544_15_0 = life5_8;
    }
    if (!((forwardValue2544_15_0 < this.k))) {
        break forward_join_44;
    }
    spill2544_2 = this;
    if (!((life4_9 == null))) {
        forwardValue2544_45_0 = spill2544_2;
        break forward_join_45;
    }
    if (!((((moom.L4)(spill2544_2)).j != null))) {
        break forward_join_44;
    }
    life6_36 = (this.j)[life5_8];
    spill2544_3 = life6_36;
    if (!((life4_9 == null))) {
        forwardValue2544_43_0 = spill2544_3;
        break forward_join_43;
    }
    if (!((spill2544_3 == null))) {
        break forward_join_42;
    }
    life6_36 = ((moom.Ec)(this.a)).a__fE(((moom.DT)(p0)));
    (this.j)[life5_8] = life6_36;
    }
    forwardValue2544_43_0 = life6_36;
    }
    return forwardValue2544_43_0;
    }
    forwardValue2544_45_0 = this;
    }
    return ((moom.Ec)(((moom.L4)(forwardValue2544_45_0)).a)).a__fE(((moom.DT)(p0)));
}


public int a(moom.DT p0, int p1) {
int forwardValue2542_46_0;
    moom.L4 forwardValue2542_48_0;
    int forwardValue2542_51_0;
    java.lang.String[] spill2542_0;
    int spill2542_1;
    int spill2542_2;
    moom.L4 spill2542_3;
    int spill2542_4;
    long life3_3;
    int life6_8;
    java.lang.String[] life5_9;
    int life7_44;
    forward_join_51: {
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    life3_3 = (moom.L4.o ^ 128450222898485L);
    spill2542_0 = __sourceExactCall_7fb8207a1d9353();
    life6_8 = ((moom.L4)(this)).a(((moom.DT)(p0)));
    life5_9 = spill2542_0;
    spill2542_1 = life6_8;
    if (!((life5_9 == null))) {
        forwardValue2542_51_0 = spill2542_1;
        break forward_join_51;
    }
    if (!((spill2542_1 >= 0))) {
        break forward_join_47;
    }
    spill2542_2 = life6_8;
    if (!((life5_9 == null))) {
        forwardValue2542_51_0 = spill2542_2;
        break forward_join_51;
    }
    if (!((spill2542_2 < this.k))) {
        break forward_join_47;
    }
    spill2542_3 = this;
    if (!((life5_9 == null))) {
        forwardValue2542_48_0 = spill2542_3;
        break forward_join_48;
    }
    if (!((((moom.L4)(spill2542_3)).i != null))) {
        break forward_join_47;
    }
    life7_44 = (this.i)[life6_8];
    spill2542_4 = life7_44;
    if (!((life5_9 == null))) {
        forwardValue2542_46_0 = spill2542_4;
        break forward_join_46;
    }
    if (!((spill2542_4 == -1))) {
        break forward_join_45;
    }
    life7_44 = ((moom.L4)(this)).b(((moom.DT)(p0)), ((int)(p1)));
    (this.i)[life6_8] = life7_44;
    }
    forwardValue2542_46_0 = life7_44;
    }
    return forwardValue2542_46_0;
    }
    forwardValue2542_48_0 = this;
    }
    forwardValue2542_51_0 = ((moom.L4)(forwardValue2542_48_0)).b(((moom.DT)(p0)), ((int)(p1)));
    }
    return forwardValue2542_51_0;
}


public net.minecraft.world.biome.BiomeGenBase a__ES(moom.DT p0) {
return ((moom.Ec)(this.a)).a__ES(((moom.DT)(p0)));
}


public int a(moom.DT p0, moom.bs p1) {
return ((moom.Ec)(this.a)).a(((moom.DT)(p0)), ((moom.bs)(p1)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native java.lang.String[] __sourceExactCall_7fb8207a1d9353();

private static native int __sourceExactCall_83272ff1cb0754(moom.DT p0);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
