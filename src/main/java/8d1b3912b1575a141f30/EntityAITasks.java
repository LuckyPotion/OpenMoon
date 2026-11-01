package net.minecraft.entity.ai;


public class EntityAITasks {

private static org.apache.logging.log4j.Logger a;

private java.util.List<moom.vq> b;

private java.util.List<moom.vq> c;

private moom.A9 d;

private int e;

private int f;

private static long g;

private static long h;

public EntityAITasks(moom.A9 p0) { super(); }


private static void __sourceConstructorBody_652a9dfbee52dee9(net.minecraft.entity.ai.EntityAITasks receiver, moom.A9 p0) throws Throwable {

long local2 = (net.minecraft.entity.ai.EntityAITasks.g ^ 88375745642273L);

    net.minecraft.entity.ai.EntityAITasks.__sourceConstructorInit_652a9dfbee52dee9_0(((net.minecraft.entity.ai.EntityAITasks)(receiver)));

    ((net.minecraft.entity.ai.EntityAITasks)(receiver)).b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((net.minecraft.entity.ai.EntityAITasks)(receiver)).c = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((net.minecraft.entity.ai.EntityAITasks)(receiver)).f = ((int)(((int) net.minecraft.entity.ai.EntityAITasks.h)));

    ((net.minecraft.entity.ai.EntityAITasks)(receiver)).d = ((moom.A9)(p0));

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(-8675525086832288432L)), ((long)(3748081333663053460L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(31194276714732L)))));
    long local0_life6 = (net.minecraft.entity.ai.EntityAITasks.g ^ 125618248021715L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1190_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1190_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1190_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1190_13 = new byte[8];
    (__sourceSpill1190_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1190_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1190_15 = __sourceSpill1190_13;
    ((javax.crypto.Cipher)(__sourceSpill1190_10)).init(((int)(__sourceSpill1190_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1190_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1190_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4806703790299944472L;
    byte[] __sourceSpill1190_19 = new byte[8];
    (__sourceSpill1190_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1190_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1190_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1190_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1190_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1190_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1190_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1190_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1190_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1190_20)).doFinal(((byte[])(__sourceSpill1190_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceConstructorInit_652a9dfbee52dee9_0(net.minecraft.entity.ai.EntityAITasks a0) throws E;

private boolean b(moom.vq p0) {
moom.vq lexicalValue1553_23_0;
    int lexicalValue1553_40_0;
    int lexicalValue1553_44_0;
    int lexicalValue1553_48_0;
    int lexicalValue1553_55_0;
    int lexicalValue1553_59_0;
    boolean spill1553_0;
    moom.vq spill1553_1;
    int spill1553_2;
    boolean spill1553_3;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    moom.vq life6_16;
    lexical_join_62: {
    life2_3 = (net.minecraft.entity.ai.EntityAITasks.g ^ 109164901422984L);
    spill1553_0 = moom.uc.d();
    life5_8 = ((java.util.List)(this.b)).iterator();
    life4_9 = ((spill1553_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_55: {
    lexical_join_48: {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_40: {
    lexical_join_23: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_62;
    }
    life6_16 = ((moom.vq)(((java.util.Iterator)(life5_8)).next()));
    spill1553_1 = life6_16;
    if (!((life4_9 != 0))) {
        lexicalValue1553_23_0 = spill1553_1;
        break lexical_join_23;
    }
    if (!((spill1553_1 != p0))) {
        break lexical_join_60;
    }
    lexicalValue1553_23_0 = p0;
    }
    spill1553_2 = ((moom.vq)(lexicalValue1553_23_0)).b;
    if (!((life4_9 != 0))) {
        lexicalValue1553_48_0 = spill1553_2;
        break lexical_join_48;
    }
    if (!((spill1553_2 >= ((moom.vq)(life6_16)).b))) {
        break lexical_join_45;
    }
    spill1553_3 = ((net.minecraft.entity.ai.EntityAITasks)(this)).a(((moom.vq)(p0)), ((moom.vq)(life6_16)));
    if (!((life4_9 != 0))) {
        lexicalValue1553_40_0 = ((spill1553_3) ? 1 : 0);
        break lexical_join_40;
    }
    if (!((!spill1553_3))) {
        break lexical_join_60;
    }
    lexicalValue1553_40_0 = ((((java.util.List)(this.c)).contains(((java.lang.Object)(life6_16)))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        lexicalValue1553_44_0 = lexicalValue1553_40_0;
        break lexical_join_44;
    }
    if (!((lexicalValue1553_40_0 != 0))) {
        break lexical_join_60;
    }
    lexicalValue1553_44_0 = 0;
    }
    return ((lexicalValue1553_44_0) != 0);
    }
    lexicalValue1553_48_0 = ((((moom.uc)(((moom.vq)(life6_16)).a)).c__Boolean()) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        lexicalValue1553_55_0 = lexicalValue1553_48_0;
        break lexical_join_55;
    }
    if (!((lexicalValue1553_48_0 == 0))) {
        break lexical_join_60;
    }
    lexicalValue1553_55_0 = ((((java.util.List)(this.c)).contains(((java.lang.Object)(life6_16)))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        lexicalValue1553_59_0 = lexicalValue1553_55_0;
        break lexical_join_59;
    }
    if (!((lexicalValue1553_55_0 != 0))) {
        break lexical_join_60;
    }
    lexicalValue1553_59_0 = 0;
    }
    return ((lexicalValue1553_59_0) != 0);
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return ((1) != 0);
}


private boolean a(moom.vq p0, moom.vq p1) {
int forwardValue4988_17_0;
    int forwardValue4988_19_0;
    int spill4988_0;
    long life3_3;
    int life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life3_3 = (net.minecraft.entity.ai.EntityAITasks.g ^ 101342599348547L);
    life5_5 = ((moom.uc.e()) ? 1 : 0);
    spill4988_0 = (((moom.uc)(((moom.vq)(p0)).a)).a() & ((moom.uc)(((moom.vq)(p1)).a)).a());
    if (!((life5_5 == 0))) {
        forwardValue4988_17_0 = spill4988_0;
        break forward_join_17;
    }
    if (!((spill4988_0 == 0))) {
        break forward_join_18;
    }
    forwardValue4988_17_0 = 1;
    }
    forwardValue4988_19_0 = forwardValue4988_17_0;
    break forward_join_19;
    }
    forwardValue4988_19_0 = 0;
    }
    return ((forwardValue4988_19_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0, moom.uc p1) {
((java.util.List)(this.b)).add(((java.lang.Object)(new moom.vq(p0, p1))));
    return;
}


public void a(moom.uc p0) {
int lexicalValue1552_36_0;
    boolean spill1552_0;
    boolean spill1552_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    moom.vq life6_16;
    moom.uc life7_19;
    lexical_join_41: {
    life2_3 = (net.minecraft.entity.ai.EntityAITasks.g ^ 28383224167563L);
    spill1552_0 = moom.uc.e();
    life5_8 = ((java.util.List)(this.b)).iterator();
    life4_9 = ((spill1552_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_39: {
    lexical_join_37: {
    lexical_join_36: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_41;
    }
    life6_16 = ((moom.vq)(((java.util.Iterator)(life5_8)).next()));
    life7_19 = ((moom.vq)(life6_16)).a;
    if (!((life7_19 == p0))) {
        break lexical_join_39;
    }
    spill1552_1 = ((java.util.List)(this.c)).contains(((java.lang.Object)(life6_16)));
    if (!((life4_9 == 0))) {
        lexicalValue1552_36_0 = ((spill1552_1) ? 1 : 0);
        break lexical_join_36;
    }
    if (!(spill1552_1)) {
        break lexical_join_37;
    }
    ((moom.uc)(life7_19)).b__Void();
    lexicalValue1552_36_0 = ((((java.util.List)(this.c)).remove(((java.lang.Object)(life6_16)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1552_36_0);
    }
    ((java.util.Iterator)(life5_8)).remove();
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a() {
int forestValue659_54_0;
    int forestValue659_70_0;
    int forestValue659_84_0;
    int forestValue659_94_0;
    net.minecraft.entity.ai.EntityAITasks forestValue659_100_0;
    int forestValue659_151_0;
    boolean spill659_0;
    net.minecraft.entity.ai.EntityAITasks spill659_1;
    int spill659_2;
    int spill659_3;
    boolean spill659_4;
    boolean spill659_5;
    boolean spill659_6;
    boolean spill659_7;
    long life1_3;
    int life3_9;
    java.util.Iterator life4_31;
    moom.vq life5_46;
    int life6_51;
    java.util.Iterator life4_138;
    moom.vq life5_147;
    java.util.Iterator life4_181;
    moom.vq life5_191;
    moom.vq life5_206;
    forest_join_170: {
    forest_join_167: {
    forest_join_151: {
    forest_join_125: {
    forest_join_100: {
    forest_join_99: {
    forest_join_97: {
    life1_3 = (net.minecraft.entity.ai.EntityAITasks.g ^ 114056653510566L);
    spill659_0 = moom.uc.d();
    ((moom.A9)(this.d)).a__Void(((java.lang.String)("goalSetup")));
    life3_9 = ((spill659_0) ? 1 : 0);
    spill659_1 = this;
    if (!((life3_9 != 0))) {
        forestValue659_100_0 = spill659_1;
        break forest_join_100;
    }
    net.minecraft.entity.ai.EntityAITasks __stackOp659_5_0 = spill659_1;
    net.minecraft.entity.ai.EntityAITasks __stackOp659_7_0 = __stackOp659_5_0;
    int __stackOp659_7_1 = ((net.minecraft.entity.ai.EntityAITasks)(__stackOp659_5_0)).e;
    spill659_2 = __stackOp659_7_1;
    ((net.minecraft.entity.ai.EntityAITasks)(__stackOp659_7_0)).e = ((int)((__stackOp659_7_1 + 1)));
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    if (!(((spill659_2 % 3) == 0))) {
        break forest_join_99;
    }
    life4_31 = ((java.util.List)(this.b)).iterator();
    forest_cycle_29: while (true) {
    forest_join_95: {
    forest_join_94: {
    forest_join_84: {
    forest_join_75: {
    forest_join_73: {
    forest_join_70: {
    forest_join_63: {
    forest_join_54: {
    forest_join_51: {
    forest_join_36: {
    if (!((!((java.util.Iterator)(life4_31)).hasNext()))) {
        break forest_join_36;
    }
    if (!((life3_9 != 0))) {
        continue forest_cycle_29;
    }
    if (!((life3_9 == 0))) {
        break forest_join_97;
    }
    }
    life5_46 = ((moom.vq)(((java.util.Iterator)(life4_31)).next()));
    life6_51 = ((((java.util.List)(this.c)).contains(((java.lang.Object)(life5_46)))) ? 1 : 0);
    spill659_3 = life6_51;
    if (!((life3_9 != 0))) {
        forestValue659_54_0 = spill659_3;
        break forest_join_54;
    }
    if (!((spill659_3 == 0))) {
        break forest_join_51;
    }
    if (!((life3_9 == 0))) {
        break forest_join_75;
    }
    }
    forestValue659_54_0 = ((((net.minecraft.entity.ai.EntityAITasks)(this)).b(((moom.vq)(life5_46)))) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forestValue659_70_0 = forestValue659_54_0;
        break forest_join_70;
    }
    if (!((forestValue659_54_0 != 0))) {
        break forest_join_63;
    }
    spill659_4 = ((net.minecraft.entity.ai.EntityAITasks)(this)).a(((moom.vq)(life5_46)));
    if (!((life3_9 != 0))) {
        forestValue659_70_0 = ((spill659_4) ? 1 : 0);
        break forest_join_70;
    }
    if (!((!spill659_4))) {
        break forest_join_73;
    }
    }
    ((moom.uc)(((moom.vq)(life5_46)).a)).b__Void();
    forestValue659_70_0 = ((((java.util.List)(this.c)).remove(((java.lang.Object)(life5_46)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue659_70_0);
    if (!((life3_9 == 0))) {
        break forest_join_75;
    }
    }
    if (!((life3_9 == 0))) {
        continue forest_cycle_29;
    }
    }
    spill659_5 = ((net.minecraft.entity.ai.EntityAITasks)(this)).b(((moom.vq)(life5_46)));
    if (!((life3_9 != 0))) {
        forestValue659_84_0 = ((spill659_5) ? 1 : 0);
        break forest_join_84;
    }
    if (!(spill659_5)) {
        break forest_join_95;
    }
    forestValue659_84_0 = ((((moom.uc)(((moom.vq)(life5_46)).a)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forestValue659_94_0 = forestValue659_84_0;
        break forest_join_94;
    }
    if (!((forestValue659_84_0 != 0))) {
        break forest_join_95;
    }
    ((moom.uc)(((moom.vq)(life5_46)).a)).a__Void();
    forestValue659_94_0 = ((((java.util.List)(this.c)).add(((java.lang.Object)(life5_46)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue659_94_0);
    }
    if (!((life3_9 == 0))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    }
    if (!((life3_9 == 0))) {
        break forest_join_125;
    }
    }
    forestValue659_100_0 = this;
    }
    life4_138 = ((java.util.List)(((net.minecraft.entity.ai.EntityAITasks)(forestValue659_100_0)).c)).iterator();
    forest_cycle_103: while (true) {
    forest_join_123: {
    forest_join_121: {
    if (!(((java.util.Iterator)(life4_138)).hasNext())) {
        break forest_join_125;
    }
    life5_147 = ((moom.vq)(((java.util.Iterator)(life4_138)).next()));
    if (!((life3_9 != 0))) {
        break forest_join_121;
    }
    spill659_6 = ((net.minecraft.entity.ai.EntityAITasks)(this)).a(((moom.vq)(life5_147)));
    if (!((life3_9 != 0))) {
        forestValue659_151_0 = ((spill659_6) ? 1 : 0);
        break forest_join_151;
    }
    if (!((!spill659_6))) {
        break forest_join_123;
    }
    ((moom.uc)(((moom.vq)(life5_147)).a)).b__Void();
    }
    ((java.util.Iterator)(life4_138)).remove();
    }
    if (!((life3_9 == 0))) {
        continue forest_cycle_103;
    }
    break forest_cycle_103;
    }
    }
    ((moom.A9)(this.d)).b();
    ((moom.A9)(this.d)).a__Void(((java.lang.String)("goalTick")));
    life4_181 = ((java.util.List)(this.c)).iterator();
    forest_cycle_136: while (true) {
    if (!(((java.util.Iterator)(life4_181)).hasNext())) {
        break forest_join_167;
    }
    life5_191 = ((moom.vq)(((java.util.Iterator)(life4_181)).next()));
    ((moom.uc)(((moom.vq)(life5_191)).a)).c();
    if (!((life3_9 != 0))) {
        break forest_join_170;
    }
    if (!((life3_9 == 0))) {
        continue forest_cycle_136;
    }
    break forest_cycle_136;
    }
    break forest_join_167;
    }
    forest_cycle_151: while (true) {
    forest_join_164: {
    if (!((forestValue659_151_0 != 0))) {
        break forest_join_167;
    }
    life5_206 = ((moom.vq)(((java.util.Iterator)(life4_138)).next()));
    ((moom.uc)(((moom.vq)(life5_206)).a)).c();
    if (!((life3_9 != 0))) {
        break forest_join_170;
    }
    if (!((life3_9 == 0))) {
        break forest_join_164;
    }
    break forest_join_167;
    }
    spill659_7 = ((java.util.Iterator)(life4_138)).hasNext();
    forestValue659_151_0 = ((spill659_7) ? 1 : 0);
    continue forest_cycle_151;
    }
    }
    ((moom.A9)(this.d)).b();
    }
    return;
}


private boolean a(moom.vq p0) {
return (__sourceIntrinsic_booleanComparison((((moom.uc)(((moom.vq)(p0)).a)).b__Boolean())) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
