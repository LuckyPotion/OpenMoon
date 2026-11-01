package moom;


public abstract class AV {

protected net.minecraft.entity.EntityLiving a;

protected net.minecraft.world.World b;

protected moom.AT c;

protected double d;

private final net.minecraft.entity.ai.attributes.IAttributeInstance e;

private int f;

private int g;

private moom.DR h;

private float i;

private final moom.AU j;

private static int[] k;

private static final long o;

private static final long r;

public AV(net.minecraft.entity.EntityLiving p0, net.minecraft.world.World p1) {
super();
    this.h = new moom.DR(0x0.0p+0d, 0x0.0p+0d, 0x0.0p+0d);
    this.i = 0x1.0000000000000p+0f;
    this.a = p0;
    this.b = p1;
    this.e = (p0).a(net.minecraft.entity.SharedMonsterAttributes.c);
    this.j = (this).a__AU();
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(649820378219997212L)), ((long)(804677505640462300L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272786204426098L)))));
    int[] __sourceSpill471_6 = new int[2];
    long local0_life7 = (moom.AV.o ^ 138537378822360L);
    moom.AV.b(((int[])(__sourceSpill471_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill471_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill471_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill471_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill471_15 = new byte[8];
    (__sourceSpill471_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill471_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation471_17 = __sourceSpill471_15;
    ((javax.crypto.Cipher)(__sourceSpill471_12)).init(((int)(__sourceSpill471_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill471_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation471_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -6681805490605059356L;
    byte[] __sourceSpill471_21 = new byte[8];
    (__sourceSpill471_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill471_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill471_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill471_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill471_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill471_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill471_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill471_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill471_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill471_22)).doFinal(((byte[])(__sourceSpill471_21)));
    r = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


protected abstract boolean b__Boolean();

protected void b() {
int lexicalValue473_36_0;
    moom.AV lexicalValue473_46_0;
    int lexicalValue473_101_0;
    moom.AV lexicalValue473_129_0;
    moom.AV lexicalValue473_139_0;
    moom.DR lexicalValue473_139_1;
    int[] spill473_0;
    moom.AV spill473_1;
    int spill473_2;
    int spill473_3;
    moom.AV spill473_4;
    moom.DR spill473_5;
    long life1_3;
    moom.DR life4_6;
    int life5_11;
    int[] life3_12;
    int life6_16;
    float life6_67;
    int life7_71;
    moom.DR life8_81;
    int life8_122;
    int life9_126;
    lexical_join_139: {
    lexical_join_137: {
    lexical_join_101: {
    lexical_join_90: {
    lexical_join_46: {
    lexical_join_45: {
    life1_3 = (moom.AV.o ^ 130386567558114L);
    life4_6 = ((moom.AV)(this)).a__DR();
    spill473_0 = moom.AV.b__ArrayInt();
    life5_11 = ((moom.AT)(this.c)).a();
    life3_12 = spill473_0;
    life6_16 = ((moom.AT)(this.c)).b();
    lexical_cycle_17: while (true) {
    lexical_join_42: {
    lexical_join_36: {
    if (!((life6_16 < ((moom.AT)(this.c)).a()))) {
        break lexical_join_45;
    }
    spill473_1 = this;
    if (!((life3_12 != null))) {
        lexicalValue473_46_0 = spill473_1;
        break lexical_join_46;
    }
    spill473_2 = ((moom.AZ)(((moom.AT)(((moom.AV)(spill473_1)).c)).a(((int)(life6_16))))).b;
    if (!((life3_12 != null))) {
        lexicalValue473_36_0 = spill473_2;
        break lexical_join_36;
    }
    if (!((spill473_2 != ((int) ((moom.DR)(life4_6)).b)))) {
        break lexical_join_42;
    }
    lexicalValue473_36_0 = life6_16;
    }
    life5_11 = lexicalValue473_36_0;
    if (!((life3_12 == null))) {
        break lexical_join_45;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    life6_16 += 1;
    if (!((life3_12 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue473_46_0 = this;
    }
    life6_67 = ((((net.minecraft.entity.EntityLiving)(((moom.AV)(lexicalValue473_46_0)).a)).G * ((net.minecraft.entity.EntityLiving)(this.a)).G) * this.i);
    life7_71 = ((moom.AT)(this.c)).b();
    lexical_cycle_60: while (true) {
    lexical_join_88: {
    lexical_join_87: {
    if (!((life7_71 < life5_11))) {
        break lexical_join_90;
    }
    life8_81 = ((moom.AT)(this.c)).a(((net.minecraft.entity.Entity)(this.a)), ((int)(life7_71)));
    if (!((life3_12 != null))) {
        break lexical_join_88;
    }
    spill473_3 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(life4_6)).c(((moom.DR)(life8_81))))), ((double)(((double) life6_67))));
    if (!((life3_12 != null))) {
        lexicalValue473_101_0 = spill473_3;
        break lexical_join_101;
    }
    if (!((spill473_3 < 0))) {
        break lexical_join_87;
    }
    ((moom.AT)(this.c)).b(((int)((life7_71 + 1))));
    }
    life7_71 += 1;
    }
    if (!((life3_12 == null))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    life7_71 = moom.Dr.b__Int(((float)(((net.minecraft.entity.EntityLiving)(this.a)).G)));
    lexicalValue473_101_0 = (((int) ((net.minecraft.entity.EntityLiving)(this.a)).H) + 1);
    }
    life8_122 = lexicalValue473_101_0;
    life9_126 = (life5_11 - 1);
    lexical_cycle_106: while (true) {
    lexical_join_134: {
    lexical_join_129: {
    if (!((life9_126 >= ((moom.AT)(this.c)).b()))) {
        break lexical_join_137;
    }
    spill473_4 = this;
    if (!((life3_12 != null))) {
        lexicalValue473_129_0 = spill473_4;
        break lexical_join_129;
    }
    spill473_5 = life4_6;
    if (!((life3_12 != null))) {
        lexicalValue473_139_0 = spill473_4;
        lexicalValue473_139_1 = spill473_5;
        break lexical_join_139;
    }
    if (!(((moom.AV)(spill473_4)).a(((moom.DR)(spill473_5)), ((moom.DR)(((moom.AT)(this.c)).a(((net.minecraft.entity.Entity)(this.a)), ((int)(life9_126))))), ((int)(life7_71)), ((int)(life8_122)), ((int)(life7_71))))) {
        break lexical_join_134;
    }
    lexicalValue473_129_0 = this;
    }
    ((moom.AT)(((moom.AV)(lexicalValue473_129_0)).c)).b(((int)(life9_126)));
    if (!((life3_12 == null))) {
        break lexical_join_137;
    }
    }
    life9_126 += -1;
    if (!((life3_12 == null))) { continue lexical_cycle_106; }
    break lexical_cycle_106;
    }
    }
    lexicalValue473_139_0 = this;
    lexicalValue473_139_1 = life4_6;
    }
    ((moom.AV)(lexicalValue473_139_0)).a(((moom.DR)(lexicalValue473_139_1)));
    return;
}


public static void b(int[] p0) {
moom.AV.k = ((int[])(p0));
    return;
}


public static int[] b__ArrayInt() {
return moom.AV.k;
}


public void c() {
this.c = ((moom.AT)(null));
    return;
}


protected boolean c__Boolean() {
int forwardValue1445_19_0;
    int forwardValue1445_21_0;
    boolean spill1445_0;
    boolean spill1445_1;
    long life1_3;
    int[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.AV.o ^ 35150229127750L);
    life3_5 = moom.AV.b__ArrayInt();
    spill1445_0 = ((net.minecraft.entity.EntityLiving)(this.a)).j__Boolean();
    if (!((life3_5 != null))) {
        forwardValue1445_19_0 = ((spill1445_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill1445_0))) {
        break forward_join_18;
    }
    spill1445_1 = ((net.minecraft.entity.EntityLiving)(this.a)).l__Boolean();
    if (!((life3_5 != null))) {
        forwardValue1445_19_0 = ((spill1445_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill1445_1)) {
        break forward_join_20;
    }
    }
    forwardValue1445_19_0 = 1;
    }
    forwardValue1445_21_0 = forwardValue1445_19_0;
    break forward_join_21;
    }
    forwardValue1445_21_0 = 0;
    }
    return ((forwardValue1445_21_0) != 0);
}


protected void d() {
return;
}


protected abstract moom.DR a__DR();

public boolean a(double p0, double p1, double p2, double p3) {
java.lang.Object local9 = this.a(((double)(((double) moom.Dr.b__Int(((double)(p0)))))), ((double)(((double) ((int) p1)))), ((double)(((double) moom.Dr.b__Int(((double)(p2)))))));
    return (__sourceIntrinsic_booleanComparison((this.a(((moom.AT)(local9)), ((double)(p3))))) != 0);
}


public final moom.AT a(double p0, double p1, double p2) {
return this.a(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(p0))), ((int) p1), moom.Dr.b__Int(((double)(p2)))))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected abstract moom.AU a__AU();

public void a(double p0) {
this.d = ((double)(p0));
    return;
}


public float a() {
return ((float) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(this.e)).b());
}


protected abstract boolean a(moom.DR p0, moom.DR p1, int p2, int p3, int p4);

public moom.AT a__AT() {
return this.c;
}


public boolean a(moom.AT p0, double p1) {
moom.AT forwardValue1437_16_0;
    int forwardValue1437_32_0;
    moom.AV forwardValue1437_39_0;
    moom.AT spill1437_0;
    boolean spill1437_1;
    moom.AV spill1437_2;
    long life4_3;
    int[] life6_5;
    moom.DR life7_56;
    forward_join_39: {
    forward_join_35: {
    forward_join_32: {
    forward_join_25: {
    forward_join_16: {
    forward_join_15: {
    life4_3 = (moom.AV.o ^ 126708223605352L);
    life6_5 = moom.AV.b__ArrayInt();
    spill1437_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue1437_16_0 = spill1437_0;
        break forward_join_16;
    }
    if (!((spill1437_0 == null))) {
        break forward_join_15;
    }
    this.c = ((moom.AT)(null));
    return ((0) != 0);
    }
    forwardValue1437_16_0 = p0;
    }
    spill1437_1 = ((moom.AT)(forwardValue1437_16_0)).a(((moom.AT)(this.c)));
    if (!((life6_5 != null))) {
        forwardValue1437_32_0 = ((spill1437_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill1437_1))) {
        break forward_join_25;
    }
    this.c = ((moom.AT)(p0));
    }
    this.d();
    spill1437_2 = this;
    if (!((life6_5 != null))) {
        forwardValue1437_39_0 = spill1437_2;
        break forward_join_39;
    }
    forwardValue1437_32_0 = ((moom.AT)(((moom.AV)(spill1437_2)).c)).a();
    }
    if (!((forwardValue1437_32_0 == 0))) {
        break forward_join_35;
    }
    return ((0) != 0);
    }
    this.d = ((double)(p1));
    forwardValue1437_39_0 = this;
    }
    life7_56 = ((moom.AV)(forwardValue1437_39_0)).a__DR();
    this.g = ((int)(this.f));
    this.h = ((moom.DR)(life7_56));
    return ((1) != 0);
}


public boolean a(net.minecraft.entity.Entity p0, double p1) {
int forwardValue1441_20_0;
    int forwardValue1441_22_0;
    int[] spill1441_0;
    boolean spill1441_1;
    long life4_3;
    moom.AT life7_8;
    int[] life6_9;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life4_3 = (moom.AV.o ^ 74724269838464L);
    spill1441_0 = moom.AV.b__ArrayInt();
    life7_8 = this.a(((net.minecraft.entity.Entity)(p0)));
    life6_9 = spill1441_0;
    if (!((life7_8 != null))) {
        break forward_join_21;
    }
    spill1441_1 = this.a(((moom.AT)(life7_8)), ((double)(p1)));
    if (!((life6_9 != null))) {
        forwardValue1441_20_0 = ((spill1441_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill1441_1)) {
        break forward_join_21;
    }
    forwardValue1441_20_0 = 1;
    }
    forwardValue1441_22_0 = forwardValue1441_20_0;
    break forward_join_22;
    }
    forwardValue1441_22_0 = 0;
    }
    return ((forwardValue1441_22_0) != 0);
}


public moom.AT a(net.minecraft.entity.Entity p0) {
moom.AV forwardValue1440_14_0;
    moom.AV spill1440_0;
    long life2_3;
    int[] life4_5;
    float life5_20;
    moom.DT life6_32;
    int life7_37;
    moom.Ec life8_57;
    moom.AT life9_66;
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.AV.o ^ 64639229811796L);
    life4_5 = moom.AV.b__ArrayInt();
    spill1440_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1440_14_0 = spill1440_0;
        break forward_join_14;
    }
    if (!((!((moom.AV)(spill1440_0)).b__Boolean()))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue1440_14_0 = this;
    }
    life5_20 = ((moom.AV)(forwardValue1440_14_0)).a();
    ((moom.A9)(((net.minecraft.world.World)(this.b)).D)).a__Void(((java.lang.String)("pathfind")));
    life6_32 = ((moom.DT)(new moom.DT(this.a))).a__DT();
    life7_37 = ((int) (life5_20 + 0x1.0p4f));
    life8_57 = new moom.Ec(this.b, ((moom.DT)(life6_32)).a(((int)((-life7_37))), ((int)((-life7_37))), ((int)((-life7_37)))), ((moom.DT)(life6_32)).a(((int)(life7_37)), ((int)(life7_37)), ((int)(life7_37))), 0);
    life9_66 = ((moom.AU)(this.j)).a(((net.minecraft.world.IBlockAccess)(life8_57)), ((net.minecraft.entity.Entity)(this.a)), ((net.minecraft.entity.Entity)(p0)), ((float)(life5_20)));
    ((moom.A9)(((net.minecraft.world.World)(this.b)).D)).b();
    return life9_66;
}


public void a(float p0) {
this.i = ((float)(p0));
    return;
}


public boolean a__Boolean() {
moom.AT forwardValue1442_13_0;
    int forwardValue1442_18_0;
    int forwardValue1442_20_0;
    moom.AT spill1442_0;
    boolean spill1442_1;
    long life1_3;
    int[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.AV.o ^ 8658347617397L);
    life3_5 = moom.AV.b__ArrayInt();
    spill1442_0 = this.c;
    if (!((life3_5 != null))) {
        forwardValue1442_13_0 = spill1442_0;
        break forward_join_13;
    }
    if (!((spill1442_0 != null))) {
        break forward_join_17;
    }
    forwardValue1442_13_0 = this.c;
    }
    spill1442_1 = ((moom.AT)(forwardValue1442_13_0)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue1442_18_0 = ((spill1442_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill1442_1)) {
        break forward_join_19;
    }
    }
    forwardValue1442_18_0 = 1;
    }
    forwardValue1442_20_0 = forwardValue1442_18_0;
    break forward_join_20;
    }
    forwardValue1442_20_0 = 0;
    }
    return ((forwardValue1442_20_0) != 0);
}


protected void a(moom.DR p0) {
int forwardValue1438_22_0;
    int spill1438_0;
    long life2_3;
    int[] life4_5;
    forward_join_32: {
    forward_join_25: {
    forward_join_22: {
    life2_3 = (moom.AV.o ^ 105589801600803L);
    life4_5 = moom.AV.b__ArrayInt();
    spill1438_0 = (this.f - this.g);
    if (!((life4_5 != null))) {
        forwardValue1438_22_0 = spill1438_0;
        break forward_join_22;
    }
    if (!((spill1438_0 > ((int) moom.AV.r)))) {
        break forward_join_32;
    }
    forwardValue1438_22_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).c(((moom.DR)(this.h))))), ((double)(0x1.2p1d)));
    }
    if (!((forwardValue1438_22_0 < 0))) {
        break forward_join_25;
    }
    this.c();
    }
    this.g = ((int)(this.f));
    this.h = ((moom.DR)(p0));
    }
    return;
}


public moom.AT a(moom.DT p0) {
moom.AV forwardValue1439_14_0;
    moom.AV spill1439_0;
    long life2_3;
    int[] life4_5;
    float life5_20;
    moom.DT life6_31;
    int life7_36;
    moom.Ec life8_56;
    moom.AT life9_65;
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.AV.o ^ 93949359896319L);
    life4_5 = moom.AV.b__ArrayInt();
    spill1439_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1439_14_0 = spill1439_0;
        break forward_join_14;
    }
    if (!((!((moom.AV)(spill1439_0)).b__Boolean()))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue1439_14_0 = this;
    }
    life5_20 = ((moom.AV)(forwardValue1439_14_0)).a();
    ((moom.A9)(((net.minecraft.world.World)(this.b)).D)).a__Void(((java.lang.String)("pathfind")));
    life6_31 = new moom.DT(this.a);
    life7_36 = ((int) (life5_20 + 0x1.0p3f));
    life8_56 = new moom.Ec(this.b, ((moom.DT)(life6_31)).a(((int)((-life7_36))), ((int)((-life7_36))), ((int)((-life7_36)))), ((moom.DT)(life6_31)).a(((int)(life7_36)), ((int)(life7_36)), ((int)(life7_36))), 0);
    life9_65 = ((moom.AU)(this.j)).a(((net.minecraft.world.IBlockAccess)(life8_56)), ((net.minecraft.entity.Entity)(this.a)), ((moom.DT)(p0)), ((float)(life5_20)));
    ((moom.A9)(((net.minecraft.world.World)(this.b)).D)).b();
    return life9_65;
}


public void a__Void() {
int lexicalValue472_21_0;
    moom.AV lexicalValue472_27_0;
    moom.AV lexicalValue472_93_0;
    int lexicalValue472_96_0;
    moom.AV lexicalValue472_98_0;
    int[] spill472_0;
    boolean spill472_1;
    moom.AV spill472_2;
    int spill472_3;
    int spill472_4;
    boolean spill472_5;
    int spill472_6;
    int spill472_7;
    long life1_3;
    int[] life3_11;
    moom.DR life4_66;
    moom.DR life5_75;
    moom.DR life4_153;
    moom.CA life5_175;
    java.util.List life6_186;
    double life7_188;
    moom.CA life5_194;
    java.util.Iterator life9_197;
    moom.CA life10_204;
    lexical_join_177: {
    lexical_join_163: {
    lexical_join_98: {
    lexical_join_96: {
    lexical_join_93: {
    lexical_join_92: {
    lexical_join_27: {
    lexical_join_26: {
    lexical_join_21: {
    life1_3 = (moom.AV.o ^ 58723314630801L);
    spill472_0 = moom.AV.b__ArrayInt();
    moom.AV __stackOp472_2_0 = this;
    ((moom.AV)(__stackOp472_2_0)).f = ((int)((((moom.AV)(__stackOp472_2_0)).f + 1)));
    life3_11 = spill472_0;
    spill472_1 = ((moom.AV)(this)).a__Boolean();
    if (!((life3_11 != null))) {
        lexicalValue472_21_0 = ((spill472_1) ? 1 : 0);
        break lexical_join_21;
    }
    if (!((!spill472_1))) {
        break lexical_join_177;
    }
    spill472_2 = this;
    if (!((life3_11 != null))) {
        lexicalValue472_27_0 = spill472_2;
        break lexical_join_27;
    }
    lexicalValue472_21_0 = ((((moom.AV)(spill472_2)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue472_21_0 != 0))) {
        break lexical_join_26;
    }
    this.b();
    if (!((life3_11 == null))) {
        break lexical_join_92;
    }
    }
    lexicalValue472_27_0 = this;
    }
    if (!((life3_11 != null))) {
        lexicalValue472_93_0 = lexicalValue472_27_0;
        break lexical_join_93;
    }
    if (!((((moom.AV)(lexicalValue472_27_0)).c != null))) {
        break lexical_join_92;
    }
    spill472_3 = ((moom.AT)(this.c)).b();
    if (!((life3_11 != null))) {
        lexicalValue472_96_0 = spill472_3;
        break lexical_join_96;
    }
    if (!((spill472_3 < ((moom.AT)(this.c)).a()))) {
        break lexical_join_92;
    }
    life4_66 = ((moom.AV)(this)).a__DR();
    life5_75 = ((moom.AT)(this.c)).a(((net.minecraft.entity.Entity)(this.a)), ((int)(((moom.AT)(this.c)).b())));
    spill472_4 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(life4_66)).b)), ((double)(((moom.DR)(life5_75)).b)));
    if (!((life3_11 != null))) {
        lexicalValue472_96_0 = spill472_4;
        break lexical_join_96;
    }
    if (!((spill472_4 > 0))) {
        break lexical_join_92;
    }
    spill472_5 = ((net.minecraft.entity.EntityLiving)(this.a)).A;
    if (!((life3_11 != null))) {
        lexicalValue472_96_0 = ((spill472_5) ? 1 : 0);
        break lexical_join_96;
    }
    if (!((!spill472_5))) {
        break lexical_join_92;
    }
    spill472_6 = moom.Dr.b__Int(((double)(((moom.DR)(life4_66)).a)));
    if (!((life3_11 != null))) {
        lexicalValue472_96_0 = spill472_6;
        break lexical_join_96;
    }
    if (!((spill472_6 == moom.Dr.b__Int(((double)(((moom.DR)(life5_75)).a)))))) {
        break lexical_join_92;
    }
    spill472_7 = moom.Dr.b__Int(((double)(((moom.DR)(life4_66)).c)));
    if (!((life3_11 != null))) {
        lexicalValue472_96_0 = spill472_7;
        break lexical_join_96;
    }
    if (!((spill472_7 == moom.Dr.b__Int(((double)(((moom.DR)(life5_75)).c)))))) {
        break lexical_join_92;
    }
    ((moom.AT)(this.c)).b(((int)((((moom.AT)(this.c)).b() + 1))));
    }
    lexicalValue472_93_0 = this;
    }
    if (!((life3_11 != null))) {
        lexicalValue472_98_0 = lexicalValue472_93_0;
        break lexical_join_98;
    }
    lexicalValue472_96_0 = ((((moom.AV)(lexicalValue472_93_0)).a__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue472_96_0 == 0))) {
        break lexical_join_177;
    }
    lexicalValue472_98_0 = this;
    }
    life4_153 = ((moom.AT)(((moom.AV)(lexicalValue472_98_0)).c)).a(((net.minecraft.entity.Entity)(this.a)));
    if (!((life4_153 != null))) {
        break lexical_join_177;
    }
    life5_175 = ((moom.CA)(new moom.CA(((moom.DR)(life4_153)).a, ((moom.DR)(life4_153)).b, ((moom.DR)(life4_153)).c, ((moom.DR)(life4_153)).a, ((moom.DR)(life4_153)).b, ((moom.DR)(life4_153)).c))).b(((double)(0x1.0p-1d)), ((double)(0x1.0p-1d)), ((double)(0x1.0p-1d)));
    life6_186 = ((net.minecraft.world.World)(this.b)).a(((net.minecraft.entity.Entity)(this.a)), ((moom.CA)(((moom.CA)(life5_175)).a(((double)(0x0.0p0d)), ((double)(-0x1.0p0d)), ((double)(0x0.0p0d))))));
    life7_188 = -0x1.0p0d;
    life5_194 = ((moom.CA)(life5_175)).c(((double)(0x0.0p0d)), ((double)(0x1.0p0d)), ((double)(0x0.0p0d)));
    life9_197 = ((java.util.List)(life6_186)).iterator();
    lexical_cycle_147: while (true) {
    if (!(((java.util.Iterator)(life9_197)).hasNext())) {
        break lexical_join_163;
    }
    life10_204 = ((moom.CA)(((java.util.Iterator)(life9_197)).next()));
    life7_188 = ((moom.CA)(life10_204)).b(((moom.CA)(life5_194)), ((double)(life7_188)));
    if (!((life3_11 != null))) {
        break lexical_join_177;
    }
    if (!((life3_11 == null))) { continue lexical_cycle_147; }
    break lexical_cycle_147;
    }
    }
    ((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.EntityLiving)(this.a)).a__vu())).a(((double)(((moom.DR)(life4_153)).a)), ((double)((((moom.DR)(life4_153)).b + life7_188))), ((double)(((moom.DR)(life4_153)).c)), ((double)(this.d)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
