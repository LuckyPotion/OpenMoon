package moom;


public class Mi {

private net.minecraft.block.state.IBlockState a;

private moom.DT b;

private int c;

private int d;

private int e;

private int f;

private float[] g;

private java.util.BitSet h;

private moom.kM i;

private moom.DX j;

private boolean[] k;

private boolean[] l;

private boolean[] m;

private moom.bs[] n;

private java.util.List<moom.lC> o;

private java.util.List<moom.lC> p;

private moom.lC[] q;

private moom.lC[] r;

private moom.lC[] s;

private moom.lC[] t;

private moom.lp u;

private moom.LZ[] v;

private boolean w;

private static net.minecraft.entity.Entity[] x;

private static long y;

public Mi(net.minecraft.block.state.IBlockState p0, moom.DT p1) { super(); }


private static void __sourceConstructorBody_30b2dabcf040fac6(moom.Mi receiver, net.minecraft.block.state.IBlockState p0, moom.DT p1) throws Throwable {

long local3_life1 = (moom.Mi.y ^ 121816003250934L);

    net.minecraft.entity.Entity[] __sourceSpill660_3 = moom.Mi.b__Arrayr3();

    moom.Mi.__sourceConstructorInit_30b2dabcf040fac6_0(((moom.Mi)(receiver)));

    net.minecraft.entity.Entity[] local5_life5 = __sourceSpill660_3;

    ((moom.Mi)(receiver)).c = ((int)(-1));

    ((moom.Mi)(receiver)).d = ((int)(-1));

    ((moom.Mi)(receiver)).e = ((int)(-1));

    ((moom.Mi)(receiver)).f = ((int)(-1));

    ((moom.Mi)(receiver)).g = ((float[])(new float[((moom.bs.VALUES).length * 2)]));

    ((moom.Mi)(receiver)).h = ((java.util.BitSet)(new java.util.BitSet(3)));

    ((moom.Mi)(receiver)).i = ((moom.kM)(new moom.kM()));

    ((moom.Mi)(receiver)).j = ((moom.DX)(null));

    ((moom.Mi)(receiver)).k = ((boolean[])(null));

    ((moom.Mi)(receiver)).l = ((boolean[])(null));

    ((moom.Mi)(receiver)).m = ((boolean[])(null));

    ((moom.Mi)(receiver)).n = ((moom.bs[])(null));

    ((moom.Mi)(receiver)).o = ((java.util.List)(new java.util.ArrayList()));

    ((moom.Mi)(receiver)).p = ((java.util.List)(new java.util.ArrayList()));

    ((moom.Mi)(receiver)).q = ((moom.lC[])(new moom.lC[1]));

    ((moom.Mi)(receiver)).r = ((moom.lC[])(new moom.lC[2]));

    ((moom.Mi)(receiver)).s = ((moom.lC[])(new moom.lC[3]));

    ((moom.Mi)(receiver)).t = ((moom.lC[])(new moom.lC[4]));

    ((moom.Mi)(receiver)).u = ((moom.lp)(null));

    ((moom.Mi)(receiver)).v = ((moom.LZ[])(new moom.LZ[(net.minecraft.util.EnumWorldBlockLayer.values()).length]));

    ((moom.Mi)(receiver)).w = ((boolean)(false));

    ((moom.Mi)(receiver)).a = ((net.minecraft.block.state.IBlockState)(p0));

    ((moom.Mi)(receiver)).b = ((moom.DT)(p1));

    if ((local5_life5 != null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));

    }

    return;

}



static {
y = ((long)(((moom._a)(moom._c.a(((long)(-6987572100372444908L)), ((long)(-816551303354442584L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(181054541901939L)))));
    if ((moom.Mi.b__Arrayr3() != null)) {
        moom.Mi.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
}

private static native <E extends Throwable> void __sourceConstructorInit_30b2dabcf040fac6_0(moom.Mi a0) throws E;

public boolean[] b__ArrayBoolean() {
boolean[] forwardValue2729_17_0;
    boolean[] spill2729_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.Mi.y ^ 97074533132040L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2729_0 = this.l;
    if (!((life3_5 == null))) {
        forwardValue2729_17_0 = spill2729_0;
        break forward_join_17;
    }
    if (!((spill2729_0 == null))) {
        break forward_join_15;
    }
    this.l = ((boolean[])(new boolean[4]));
    }
    forwardValue2729_17_0 = this.l;
    }
    return forwardValue2729_17_0;
}


public boolean b__Boolean() {
int forwardValue2730_22_0;
    moom.Mi forwardValue2730_29_0;
    int forwardValue2730_36_0;
    int forwardValue2730_36_1;
    int forwardValue2730_38_0;
    int forwardValue2730_40_0;
    int spill2730_0;
    int spill2730_1;
    boolean spill2730_2;
    moom.Mi spill2730_3;
    int spill2730_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_36: {
    forward_join_31: {
    forward_join_29: {
    forward_join_28: {
    forward_join_22: {
    life1_3 = (moom.Mi.y ^ 43017386339546L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2730_0 = this.f;
    spill2730_1 = -1;
    if (!((life3_5 == null))) {
        forwardValue2730_36_0 = spill2730_0;
        forwardValue2730_36_1 = spill2730_1;
        break forward_join_36;
    }
    if (!((spill2730_0 == spill2730_1))) {
        break forward_join_31;
    }
    spill2730_2 = moom.BU.p();
    if (!((life3_5 == null))) {
        forwardValue2730_22_0 = ((spill2730_2) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill2730_2)) {
        break forward_join_28;
    }
    spill2730_3 = this;
    if (!((life3_5 == null))) {
        forwardValue2730_29_0 = spill2730_3;
        break forward_join_29;
    }
    forwardValue2730_22_0 = ((((net.minecraft.block.state.IBlockState)(((moom.Mi)(spill2730_3)).a)).a__ch() instanceof moom.dH) ? 1 : 0);
    }
    if (!((forwardValue2730_22_0 != 0))) {
        break forward_join_28;
    }
    this.f = ((int)(1));
    if (!((life3_5 != null))) {
        break forward_join_31;
    }
    }
    forwardValue2730_29_0 = this;
    }
    ((moom.Mi)(forwardValue2730_29_0)).f = ((int)(0));
    }
    spill2730_4 = this.f;
    if (!((life3_5 == null))) {
        forwardValue2730_38_0 = spill2730_4;
        break forward_join_38;
    }
    forwardValue2730_36_0 = spill2730_4;
    forwardValue2730_36_1 = 1;
    }
    if (!((forwardValue2730_36_0 == forwardValue2730_36_1))) {
        break forward_join_39;
    }
    forwardValue2730_38_0 = 1;
    }
    forwardValue2730_40_0 = forwardValue2730_38_0;
    break forward_join_40;
    }
    forwardValue2730_40_0 = 0;
    }
    return ((forwardValue2730_40_0) != 0);
}


public static void b(net.minecraft.entity.Entity[] p0) {
x = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return moom.Mi.x;
}


public int b() {
net.minecraft.block.state.IBlockState forwardValue2728_20_0;
    int forwardValue2728_38_0;
    int spill2728_0;
    net.minecraft.block.state.IBlockState spill2728_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.block.state.IBlockState life5_16;
    moom.fB life4_30;
    forward_join_38: {
    forward_join_36: {
    forward_join_28: {
    forward_join_20: {
    life1_3 = (moom.Mi.y ^ 87897263534985L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2728_0 = this.d;
    if (!((life3_5 == null))) {
        forwardValue2728_38_0 = spill2728_0;
        break forward_join_38;
    }
    if (!((spill2728_0 < 0))) {
        break forward_join_36;
    }
    life5_16 = this.a;
    spill2728_1 = life5_16;
    if (!((life3_5 == null))) {
        forwardValue2728_20_0 = spill2728_1;
        break forward_join_20;
    }
    if (!((((spill2728_1 instanceof moom.fB) ? 1 : 0) != 0))) {
        break forward_join_28;
    }
    forwardValue2728_20_0 = life5_16;
    }
    life4_30 = ((moom.fB)(forwardValue2728_20_0));
    this.d = ((int)(((moom.fB)(life4_30)).c()));
    if (!((life3_5 != null))) {
        break forward_join_36;
    }
    }
    this.d = ((int)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.a)).a__ch())).b(((net.minecraft.block.state.IBlockState)(this.a)))));
    }
    forwardValue2728_38_0 = this.d;
    }
    return forwardValue2728_38_0;
}


public boolean[] c__ArrayBoolean() {
boolean[] forwardValue2731_17_0;
    boolean[] spill2731_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.Mi.y ^ 11467068496282L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2731_0 = this.m;
    if (!((life3_5 == null))) {
        forwardValue2731_17_0 = spill2731_0;
        break forward_join_17;
    }
    if (!((spill2731_0 == null))) {
        break forward_join_15;
    }
    this.m = ((boolean[])(new boolean[4]));
    }
    forwardValue2731_17_0 = this.m;
    }
    return forwardValue2731_17_0;
}


public boolean c() {
return ((((this.w) ? 1 : 0)) != 0);
}


public moom.lC[] a__ArraylC(moom.lC p0) {
(this.q)[0] = p0;
    return this.q;
}


public moom.lC[] a(moom.lC p0, moom.lC p1, moom.lC p2, moom.lC p3) {
(this.t)[0] = p0;
    (this.t)[1] = p1;
    (this.t)[2] = p2;
    (this.t)[3] = p3;
    return this.t;
}


public moom.lC[] a(moom.lC p0, moom.lC p1, moom.lC p2) {
(this.s)[0] = p0;
    (this.s)[1] = p1;
    (this.s)[2] = p2;
    return this.s;
}


public moom.lC[] a(moom.lC p0, moom.lC p1) {
(this.r)[0] = p0;
    (this.r)[1] = p1;
    return this.r;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(boolean p0) {
this.w = ((boolean)(p0));
    return;
}


public moom.LZ a(net.minecraft.util.EnumWorldBlockLayer p0) {
moom.LZ forwardValue2722_27_0;
    net.minecraft.entity.Entity[] spill2722_0;
    moom.LZ spill2722_1;
    long life2_3;
    moom.LZ life5_10;
    net.minecraft.entity.Entity[] life4_11;
    forward_join_27: {
    forward_join_26: {
    life2_3 = (moom.Mi.y ^ 106874349276315L);
    spill2722_0 = moom.Mi.b__Arrayr3();
    life5_10 = (this.v)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()];
    life4_11 = spill2722_0;
    spill2722_1 = life5_10;
    if (!((life4_11 == null))) {
        forwardValue2722_27_0 = spill2722_1;
        break forward_join_27;
    }
    if (!((spill2722_1 == null))) {
        break forward_join_26;
    }
    life5_10 = new moom.LZ();
    (this.v)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()] = life5_10;
    }
    forwardValue2722_27_0 = life5_10;
    }
    return forwardValue2722_27_0;
}


public void a(moom.lp p0) {
this.u = ((moom.lp)(p0));
    return;
}


public moom.lp a__lp() {
return this.u;
}


public java.util.List<moom.lC> a(moom.lC[] p0) {
java.util.List forwardValue2723_21_0;
    java.util.List spill2723_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_21: {
    forward_join_19: {
    life2_3 = (moom.Mi.y ^ 92150084317148L);
    life4_5 = moom.Mi.b__Arrayr3();
    spill2723_0 = this.p;
    if (!((life4_5 == null))) {
        forwardValue2723_21_0 = spill2723_0;
        break forward_join_21;
    }
    ((java.util.List)(spill2723_0)).clear();
    if (!((p0 != null))) {
        break forward_join_19;
    }
    ((java.util.List)(this.p)).addAll(((java.util.Collection)(java.util.Arrays.asList(((java.lang.Object[])(p0))))));
    }
    forwardValue2723_21_0 = this.p;
    }
    return forwardValue2723_21_0;
}


public java.util.BitSet a__BitSet() {
return this.h;
}


public moom.kM a__kM() {
return this.i;
}


public boolean a(java.util.List p0) {
int forwardValue2719_32_0;
    int forwardValue2719_35_0;
    int forwardValue2719_35_1;
    int forwardValue2719_37_0;
    int forwardValue2719_39_0;
    int spill2719_0;
    int spill2719_1;
    int spill2719_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_35: {
    forward_join_32: {
    forward_join_30: {
    forward_join_27: {
    life2_3 = (moom.Mi.y ^ 10147035477766L);
    life4_5 = moom.Mi.b__Arrayr3();
    spill2719_0 = this.e;
    spill2719_1 = -1;
    if (!((life4_5 == null))) {
        forwardValue2719_35_0 = spill2719_0;
        forwardValue2719_35_1 = spill2719_1;
        break forward_join_35;
    }
    if (!((spill2719_0 == spill2719_1))) {
        break forward_join_30;
    }
    spill2719_2 = ((java.util.List)(p0)).size();
    if (!((life4_5 == null))) {
        forwardValue2719_32_0 = spill2719_2;
        break forward_join_32;
    }
    if (!((spill2719_2 > 0))) {
        break forward_join_30;
    }
    if (!((((((java.util.List)(p0)).get(((int)(0))) instanceof moom.lD) ? 1 : 0) != 0))) {
        break forward_join_27;
    }
    this.e = ((int)(1));
    if (!((life4_5 != null))) {
        break forward_join_30;
    }
    }
    this.e = ((int)(0));
    }
    forwardValue2719_32_0 = this.e;
    }
    if (!((life4_5 == null))) {
        forwardValue2719_37_0 = forwardValue2719_32_0;
        break forward_join_37;
    }
    forwardValue2719_35_0 = forwardValue2719_32_0;
    forwardValue2719_35_1 = 1;
    }
    if (!((forwardValue2719_35_0 == forwardValue2719_35_1))) {
        break forward_join_38;
    }
    forwardValue2719_37_0 = 1;
    }
    forwardValue2719_39_0 = forwardValue2719_37_0;
    break forward_join_39;
    }
    forwardValue2719_39_0 = 0;
    }
    return ((forwardValue2719_39_0) != 0);
}


public boolean a(moom.lC p0) {
int forwardValue2720_24_0;
    int forwardValue2720_29_0;
    int forwardValue2720_31_0;
    int spill2720_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_24: {
    forward_join_22: {
    forward_join_19: {
    life2_3 = (moom.Mi.y ^ 39618676538542L);
    life4_5 = moom.Mi.b__Arrayr3();
    spill2720_0 = this.e;
    if (!((life4_5 == null))) {
        forwardValue2720_24_0 = spill2720_0;
        break forward_join_24;
    }
    if (!((spill2720_0 < 0))) {
        break forward_join_22;
    }
    if (!((((p0 instanceof moom.lD) ? 1 : 0) != 0))) {
        break forward_join_19;
    }
    this.e = ((int)(1));
    if (!((life4_5 != null))) {
        break forward_join_22;
    }
    }
    this.e = ((int)(0));
    }
    forwardValue2720_24_0 = this.e;
    }
    if (!((life4_5 == null))) {
        forwardValue2720_29_0 = forwardValue2720_24_0;
        break forward_join_29;
    }
    if (!((forwardValue2720_24_0 == 1))) {
        break forward_join_30;
    }
    forwardValue2720_29_0 = 1;
    }
    forwardValue2720_31_0 = forwardValue2720_29_0;
    break forward_join_31;
    }
    forwardValue2720_31_0 = 0;
    }
    return ((forwardValue2720_31_0) != 0);
}


public float[] a__ArrayFloat() {
return this.g;
}


public int a() {
net.minecraft.block.state.IBlockState forwardValue2718_20_0;
    int forwardValue2718_36_0;
    int spill2718_0;
    net.minecraft.block.state.IBlockState spill2718_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.block.state.IBlockState life5_16;
    moom.fB life4_30;
    forward_join_36: {
    forward_join_34: {
    forward_join_28: {
    forward_join_20: {
    life1_3 = (moom.Mi.y ^ 56031738664790L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2718_0 = this.c;
    if (!((life3_5 == null))) {
        forwardValue2718_36_0 = spill2718_0;
        break forward_join_36;
    }
    if (!((spill2718_0 < 0))) {
        break forward_join_34;
    }
    life5_16 = this.a;
    spill2718_1 = life5_16;
    if (!((life3_5 == null))) {
        forwardValue2718_20_0 = spill2718_1;
        break forward_join_20;
    }
    if (!((((spill2718_1 instanceof moom.fB) ? 1 : 0) != 0))) {
        break forward_join_28;
    }
    forwardValue2718_20_0 = life5_16;
    }
    life4_30 = ((moom.fB)(forwardValue2718_20_0));
    this.c = ((int)(((moom.fB)(life4_30)).a__sourceReturn_8abf5c6871()));
    if (!((life3_5 != null))) {
        break forward_join_34;
    }
    }
    this.c = ((int)(__sourceExactCall_4be9acdbe11525(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(this.a)).a__ch())))));
    }
    forwardValue2718_36_0 = this.c;
    }
    return forwardValue2718_36_0;
}


public void a(net.minecraft.block.state.IBlockState p0, moom.DT p1) {
moom.Mi forwardValue2721_37_0;
    moom.Mi spill2721_0;
    moom.Mi spill2721_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_39: {
    forward_join_37: {
    forward_join_18: {
    life3_3 = (moom.Mi.y ^ 125636098072284L);
    life5_5 = moom.Mi.b__Arrayr3();
    spill2721_0 = this;
    if (!((life5_5 == null))) {
        forwardValue2721_37_0 = spill2721_0;
        break forward_join_37;
    }
    if (!((((moom.Mi)(spill2721_0)).a == p0))) {
        break forward_join_18;
    }
    spill2721_1 = this;
    if (!((life5_5 == null))) {
        forwardValue2721_37_0 = spill2721_1;
        break forward_join_37;
    }
    if (!((((moom.Mi)(spill2721_1)).b != p1))) {
        break forward_join_39;
    }
    }
    this.a = ((net.minecraft.block.state.IBlockState)(p0));
    this.b = ((moom.DT)(p1));
    this.c = ((int)(-1));
    this.d = ((int)(-1));
    this.e = ((int)(-1));
    this.f = ((int)(-1));
    forwardValue2721_37_0 = this;
    }
    ((java.util.BitSet)(((moom.Mi)(forwardValue2721_37_0)).h)).clear();
    }
    return;
}


public boolean[] a__ArrayBoolean() {
boolean[] forwardValue2724_17_0;
    boolean[] spill2724_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.Mi.y ^ 9031036755997L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2724_0 = this.k;
    if (!((life3_5 == null))) {
        forwardValue2724_17_0 = spill2724_0;
        break forward_join_17;
    }
    if (!((spill2724_0 == null))) {
        break forward_join_15;
    }
    this.k = ((boolean[])(new boolean[4]));
    }
    forwardValue2724_17_0 = this.k;
    }
    return forwardValue2724_17_0;
}


public moom.bs[] a__Arraybs() {
moom.bs[] forwardValue2725_17_0;
    moom.bs[] spill2725_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.Mi.y ^ 61690967483086L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2725_0 = this.n;
    if (!((life3_5 == null))) {
        forwardValue2725_17_0 = spill2725_0;
        break forward_join_17;
    }
    if (!((spill2725_0 == null))) {
        break forward_join_15;
    }
    this.n = ((moom.bs[])(new moom.bs[4]));
    }
    forwardValue2725_17_0 = this.n;
    }
    return forwardValue2725_17_0;
}


public moom.bs[] a(moom.bs p0, moom.bs p1, moom.bs p2, moom.bs p3) {
java.lang.Object[] local5 = ((moom.Mi)(this)).a__Arraybs();
    (local5)[0] = p0;
    (local5)[1] = p1;
    (local5)[2] = p2;
    (local5)[3] = p3;
    return ((moom.bs[])(local5));
}


public java.util.List<moom.lC> a__List() {
return this.o;
}


public moom.DX a__DX() {
moom.DX forwardValue2727_21_0;
    moom.DX spill2727_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_19: {
    life1_3 = (moom.Mi.y ^ 54818527028266L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2727_0 = this.j;
    if (!((life3_5 == null))) {
        forwardValue2727_21_0 = spill2727_0;
        break forward_join_21;
    }
    if (!((spill2727_0 == null))) {
        break forward_join_19;
    }
    this.j = ((moom.DX)(new moom.DX(0, 0, 0)));
    }
    forwardValue2727_21_0 = this.j;
    }
    return forwardValue2727_21_0;
}


public net.minecraft.block.state.IBlockState a__fE() {
return this.a;
}


public boolean a__Boolean() {
int forwardValue2726_13_0;
    int forwardValue2726_15_0;
    int spill2726_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.Mi.y ^ 83488364814641L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2726_0 = this.e;
    if (!((life3_5 == null))) {
        forwardValue2726_13_0 = spill2726_0;
        break forward_join_13;
    }
    if (!((spill2726_0 == 1))) {
        break forward_join_14;
    }
    forwardValue2726_13_0 = 1;
    }
    forwardValue2726_15_0 = forwardValue2726_13_0;
    break forward_join_15;
    }
    forwardValue2726_15_0 = 0;
    }
    return ((forwardValue2726_15_0) != 0);
}


private static native int __sourceExactCall_4be9acdbe11525(net.minecraft.block.Block p0);
}
