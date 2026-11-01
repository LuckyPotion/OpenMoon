package net.minecraft.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class EntityLiving extends net.minecraft.entity.EntityLivingBase {

public int bC;

protected int bD;

private net.minecraft.entity.ai.EntityLookHelper bE;

protected net.minecraft.entity.ai.EntityMoveHelper bF;

protected net.minecraft.entity.ai.EntityJumpHelper bG;

private moom.tY bH;

protected moom.AV bI;

protected net.minecraft.entity.ai.EntityAITasks bJ;

protected net.minecraft.entity.ai.EntityAITasks bK;

private net.minecraft.entity.EntityLivingBase bL;

private net.minecraft.entity.ai.EntitySenses bM;

private net.minecraft.item.ItemStack[] bN;

protected float[] bO;

private boolean bP;

private boolean bQ;

private boolean bR;

private net.minecraft.entity.Entity bS;

private net.minecraft.nbt.NBTTagCompound bT;

private java.util.UUID bU;

private java.lang.String bV;

private static boolean bW;

private static long gb;

private static long[] rb;

private static java.lang.Integer[] sb;

private static java.util.Map tb;

public EntityLiving(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_3af19cb2ce00bbb1(net.minecraft.entity.EntityLiving receiver, net.minecraft.world.World p0) throws Throwable {

long life2_3;

    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 71081720069811L);

    net.minecraft.entity.EntityLiving.__sourceConstructorInit_3af19cb2ce00bbb1_0(((net.minecraft.entity.EntityLiving)(receiver)), ((net.minecraft.world.World)(p0)));

    ((net.minecraft.entity.EntityLiving)(receiver)).bN = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[5]));

    ((net.minecraft.entity.EntityLiving)(receiver)).bO = ((float[])(new float[5]));

    ((net.minecraft.entity.EntityLiving)(receiver)).bU = ((java.util.UUID)(null));

    ((net.minecraft.entity.EntityLiving)(receiver)).bV = ((java.lang.String)(null));

    ((net.minecraft.entity.EntityLiving)(receiver)).bJ = ((net.minecraft.entity.ai.EntityAITasks)(new net.minecraft.entity.ai.EntityAITasks((((p0 != null) && (((net.minecraft.world.World)(p0)).D != null)) ? ((net.minecraft.world.World)(p0)).D : null))));

    ((net.minecraft.entity.EntityLiving)(receiver)).bK = ((net.minecraft.entity.ai.EntityAITasks)(new net.minecraft.entity.ai.EntityAITasks((((p0 != null) && (((net.minecraft.world.World)(p0)).D != null)) ? ((net.minecraft.world.World)(p0)).D : null))));

    ((net.minecraft.entity.EntityLiving)(receiver)).bE = ((net.minecraft.entity.ai.EntityLookHelper)(new net.minecraft.entity.ai.EntityLookHelper(receiver)));

    ((net.minecraft.entity.EntityLiving)(receiver)).bF = ((net.minecraft.entity.ai.EntityMoveHelper)(new net.minecraft.entity.ai.EntityMoveHelper(receiver)));

    ((net.minecraft.entity.EntityLiving)(receiver)).bG = ((net.minecraft.entity.ai.EntityJumpHelper)(new net.minecraft.entity.ai.EntityJumpHelper(receiver)));

    ((net.minecraft.entity.EntityLiving)(receiver)).bH = ((moom.tY)(new moom.tY(receiver)));

    ((net.minecraft.entity.EntityLiving)(receiver)).bI = ((moom.AV)(__sourceExactCall_f6e11a183ad44e(((net.minecraft.entity.EntityLiving)(receiver)), ((net.minecraft.world.World)(p0)))));

    ((net.minecraft.entity.EntityLiving)(receiver)).bM = ((net.minecraft.entity.ai.EntitySenses)(new net.minecraft.entity.ai.EntitySenses(receiver)));

    java.util.Arrays.fill(((float[])(((net.minecraft.entity.EntityLiving)(receiver)).bO)), ((float)(0x1.5c28f6p-4f)));

    return;

}



static {
gb = ((long)(((moom._a)(moom._c.a(((long)(-6735232345373205010L)), ((long)(-6275054314242476183L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(39295050950195L)))));
    tb = ((java.util.Map)(new java.util.HashMap(13)));
    int __sourceSpill1850_7 = 0;
    long local0_life8 = (net.minecraft.entity.EntityLiving.gb ^ 113223779771345L);
    net.minecraft.entity.EntityLiving.k(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1850_7))));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1850_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1850_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1850_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1850_16 = new byte[8];
    (__sourceSpill1850_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1850_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1850_18 = __sourceSpill1850_16;
    ((javax.crypto.Cipher)(__sourceSpill1850_13)).init(((int)(__sourceSpill1850_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1850_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1850_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[19];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "$/(\\e\001Ö\001ØnhgÉ\032ÀèGÜæ\022®¼¢#,3ÝÎÿ¦ÿäSp\034ÕV\003h\031#y^­80?0¶Ô`\021</B{\017@\027L1M0Ü¶6\022X¼x\001³â1ª(ÉaÊ6EÛÑ3îáu³³uÛ²ê¥}ãú¤ó-Ýª´õâzê{xbà¿)¤Ø&i\\"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1850_27 = local6_life23;
        int __sourceSpill1850_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1850_27)).substring(((int)(__sourceSpill1850_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1850_32 = local8_life21;
        int __sourceSpill1850_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1850_35 = new byte[8];
        (__sourceSpill1850_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1850_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1850_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1850_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1850_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1850_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1850_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1850_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1850_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1850_36)).doFinal(((byte[])(__sourceSpill1850_35)));
        (__sourceSpill1850_32)[__sourceSpill1850_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "\035Wë<¯à\001!\023e8xÙ"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1850_40 = local6_life23;
        int __sourceSpill1850_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1850_40)).substring(((int)(__sourceSpill1850_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1850_45 = local8_life21;
        int __sourceSpill1850_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1850_48 = new byte[8];
        (__sourceSpill1850_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1850_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1850_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1850_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1850_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1850_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1850_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1850_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1850_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1850_49)).doFinal(((byte[])(__sourceSpill1850_48)));
        (__sourceSpill1850_45)[__sourceSpill1850_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    rb = ((long[])(local8_life21));
    sb = ((java.lang.Integer[])(new java.lang.Integer[19]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3af19cb2ce00bbb1_0(net.minecraft.entity.EntityLiving a0, net.minecraft.world.World a1) throws E;

public boolean S__Boolean() {
int forwardValue4904_13_0;
    int forwardValue4904_17_0;
    int forwardValue4904_19_0;
    boolean spill4904_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 83786381239937L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4904_0 = ((net.minecraft.entity.EntityLiving)(this)).T__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4904_13_0 = ((spill4904_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill4904_0))) {
        break forward_join_18;
    }
    forwardValue4904_13_0 = ((this instanceof moom.vP) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue4904_17_0 = forwardValue4904_13_0;
        break forward_join_17;
    }
    if (!((forwardValue4904_13_0 == 0))) {
        break forward_join_18;
    }
    forwardValue4904_17_0 = 1;
    }
    forwardValue4904_19_0 = forwardValue4904_17_0;
    break forward_join_19;
    }
    forwardValue4904_19_0 = 0;
    }
    return ((forwardValue4904_19_0) != 0);
}


public void S() {
this.bQ = ((boolean)(true));
    return;
}


private void V() {
net.minecraft.entity.EntityLiving forwardValue4908_34_0;
    int spill4908_0;
    net.minecraft.entity.EntityLiving spill4908_1;
    long life1_3;
    int life3_11;
    float life4_23;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 102942425799964L);
    spill4908_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    net.minecraft.entity.EntityLiving __stackOp4908_2_0 = this;
    ((net.minecraft.entity.EntityLiving)(__stackOp4908_2_0)).a_ = ((int)((((net.minecraft.entity.EntityLiving)(__stackOp4908_2_0)).a_ + 1)));
    life3_11 = spill4908_0;
    spill4908_1 = this;
    if (!((life3_11 != 0))) {
        forwardValue4908_34_0 = spill4908_1;
        break forward_join_34;
    }
    if (!((((spill4908_1 instanceof moom.sZ) ? 1 : 0) != 0))) {
        break forward_join_33;
    }
    life4_23 = ((net.minecraft.entity.EntityLiving)(this)).a(((float)(0x1.0p0f)));
    if (!((life3_11 != 0))) {
        break forward_join_35;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life4_23)), ((float)(0x1.0p-1f))) > 0))) {
        break forward_join_33;
    }
    net.minecraft.entity.EntityLiving __stackOp4908_8_0 = this;
    ((net.minecraft.entity.EntityLiving)(__stackOp4908_8_0)).a_ = ((int)((((net.minecraft.entity.EntityLiving)(__stackOp4908_8_0)).a_ + 2)));
    }
    forwardValue4908_34_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(forwardValue4908_34_0)).Q();
    }
    return;
}


private boolean V__Boolean() {
int forwardValue4909_15_0;
    int forwardValue4909_24_0;
    net.minecraft.entity.EntityLiving forwardValue4909_33_0;
    net.minecraft.world.World forwardValue4909_42_0;
    java.lang.Object forwardValue4909_54_0;
    int forwardValue4909_93_0;
    int forwardValue4909_95_0;
    boolean spill4909_0;
    net.minecraft.entity.EntityLiving spill4909_1;
    net.minecraft.world.World spill4909_2;
    java.util.List spill4909_3;
    boolean spill4909_4;
    long life1_3;
    int life3_5;
    net.minecraft.world.World life4_49;
    net.minecraft.entity.Entity life5_80;
    double life6_91;
    double life8_102;
    double life10_110;
    forward_join_95: {
    forward_join_94: {
    forward_join_93: {
    forward_join_54: {
    forward_join_50: {
    forward_join_42: {
    forward_join_41: {
    forward_join_33: {
    forward_join_32: {
    forward_join_24: {
    forward_join_20: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 75605483522286L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4909_0 = ((net.minecraft.entity.EntityLiving)(this)).c__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4909_15_0 = ((spill4909_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill4909_0)) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue4909_15_0 = this.aO;
    }
    if (!((life3_5 == 0))) {
        forwardValue4909_24_0 = forwardValue4909_15_0;
        break forward_join_24;
    }
    if (!((forwardValue4909_15_0 > 0))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    spill4909_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue4909_33_0 = spill4909_1;
        break forward_join_33;
    }
    forwardValue4909_24_0 = ((net.minecraft.entity.EntityLiving)(spill4909_1)).S;
    }
    if (!((forwardValue4909_24_0 < __sourceIntrinsic_592c60c4d568_invokedynamic4909_8(7271, (7956572496101964411L ^ life1_3))))) {
        break forward_join_32;
    }
    return ((0) != 0);
    }
    forwardValue4909_33_0 = this;
    }
    life4_49 = ((net.minecraft.entity.EntityLiving)(forwardValue4909_33_0)).a__Eu();
    spill4909_2 = life4_49;
    if (!((life3_5 == 0))) {
        forwardValue4909_42_0 = spill4909_2;
        break forward_join_42;
    }
    if (!((spill4909_2 == null))) {
        break forward_join_41;
    }
    return ((0) != 0);
    }
    forwardValue4909_42_0 = life4_49;
    }
    spill4909_3 = ((net.minecraft.world.World)(forwardValue4909_42_0)).i;
    if (!((life3_5 == 0))) {
        forwardValue4909_54_0 = spill4909_3;
        break forward_join_54;
    }
    if (!((((java.util.List)(spill4909_3)).size() != 1))) {
        break forward_join_50;
    }
    return ((0) != 0);
    }
    forwardValue4909_54_0 = ((java.util.List)(((net.minecraft.world.World)(life4_49)).i)).get(((int)(0)));
    }
    life5_80 = ((net.minecraft.entity.Entity)(forwardValue4909_54_0));
    life6_91 = java.lang.Math.max(((double)((java.lang.Math.abs(((double)((this.n - ((net.minecraft.entity.Entity)(life5_80)).n)))) - 0x1.0p4d))), ((double)(0x0.0p0d)));
    life8_102 = java.lang.Math.max(((double)((java.lang.Math.abs(((double)((this.p - ((net.minecraft.entity.Entity)(life5_80)).p)))) - 0x1.0p4d))), ((double)(0x0.0p0d)));
    life10_110 = ((life6_91 * life6_91) + (life8_102 * life8_102));
    spill4909_4 = ((net.minecraft.entity.EntityLiving)(this)).a(((double)(life10_110)));
    if (!((life3_5 == 0))) {
        forwardValue4909_93_0 = ((spill4909_4) ? 1 : 0);
        break forward_join_93;
    }
    if (!((!spill4909_4))) {
        break forward_join_94;
    }
    forwardValue4909_93_0 = 1;
    }
    forwardValue4909_95_0 = forwardValue4909_93_0;
    break forward_join_95;
    }
    forwardValue4909_95_0 = 0;
    }
    return ((forwardValue4909_95_0) != 0);
}


protected java.lang.String i__String() {
return null;
}


public int i__sourceReturn_8abf5c6871() {
net.minecraft.entity.EntityLiving forwardValue4929_14_0;
    int forwardValue4929_42_0;
    net.minecraft.entity.EntityLiving spill4929_0;
    int spill4929_1;
    long life1_3;
    int life3_5;
    int life4_26;
    int life4_37;
    forward_join_42: {
    forward_join_39: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 49719432480540L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4929_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue4929_14_0 = spill4929_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.entity.EntityLiving)(spill4929_0)).d__sourceReturn_d30556f370() == null))) {
        break forward_join_13;
    }
    return 3;
    }
    forwardValue4929_14_0 = this;
    }
    life4_26 = ((int) (((net.minecraft.entity.EntityLiving)(forwardValue4929_14_0)).b__sourceReturn_bc607678b6() - (((net.minecraft.entity.EntityLiving)(this)).a() * 0x1.51eb86p-2f)));
    life4_37 = (life4_26 - ((3 - ((net.minecraft.world.EnumDifficulty)(((net.minecraft.world.World)(this.i)).a__bB())).a()) * 4));
    spill4929_1 = life4_37;
    if (!((life3_5 == 0))) {
        forwardValue4929_42_0 = spill4929_1;
        break forward_join_42;
    }
    if (!((spill4929_1 < 0))) {
        break forward_join_39;
    }
    life4_37 = 0;
    }
    forwardValue4929_42_0 = (life4_37 + 3);
    }
    return forwardValue4929_42_0;
}


public void i(boolean p0) {
this.bP = ((boolean)(p0));
    return;
}


public boolean b__Boolean(int p0, net.minecraft.item.ItemStack p1) {
int forwardValue4923_27_0;
    int forwardValue4923_27_1;
    int forwardValue4923_41_0;
    net.minecraft.item.ItemStack forwardValue4923_47_0;
    int forwardValue4923_68_0;
    int forwardValue4923_70_0;
    int spill4923_0;
    int spill4923_1;
    int spill4923_2;
    int spill4923_3;
    net.minecraft.item.ItemStack spill4923_4;
    int spill4923_5;
    int spill4923_6;
    int spill4923_7;
    long life3_3;
    int life5_5;
    int life6_19;
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_63: {
    forward_join_47: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_27: {
    forward_join_19: {
    life3_3 = (net.minecraft.entity.EntityLiving.gb ^ 74777639828683L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4923_0 = p0;
    spill4923_1 = __sourceIntrinsic_7722627b66bb_invokedynamic4923_2(6687, (1661487335522945070L ^ life3_3));
    if (!((life5_5 != 0))) {
        forwardValue4923_27_0 = spill4923_0;
        forwardValue4923_27_1 = spill4923_1;
        break forward_join_27;
    }
    if (!((spill4923_0 == spill4923_1))) {
        break forward_join_19;
    }
    life6_19 = 0;
    if (!((life5_5 == 0))) {
        break forward_join_42;
    }
    }
    forwardValue4923_27_0 = (p0 - __sourceIntrinsic_7722627b66bb_invokedynamic4923_3(9493, (389775691684673336L ^ life3_3)));
    forwardValue4923_27_1 = 1;
    }
    life6_19 = (forwardValue4923_27_0 + forwardValue4923_27_1);
    spill4923_2 = life6_19;
    if (!((life5_5 != 0))) {
        forwardValue4923_41_0 = spill4923_2;
        break forward_join_41;
    }
    if (!((spill4923_2 >= 0))) {
        break forward_join_40;
    }
    spill4923_3 = life6_19;
    if (!((life5_5 != 0))) {
        forwardValue4923_41_0 = spill4923_3;
        break forward_join_41;
    }
    if (!((spill4923_3 >= (this.bN).length))) {
        break forward_join_42;
    }
    }
    forwardValue4923_41_0 = 0;
    }
    return ((forwardValue4923_41_0) != 0);
    }
    spill4923_4 = p1;
    if (!((life5_5 != 0))) {
        forwardValue4923_47_0 = spill4923_4;
        break forward_join_47;
    }
    if (!((spill4923_4 != null))) {
        break forward_join_63;
    }
    forwardValue4923_47_0 = p1;
    }
    spill4923_5 = __sourceExactCall_f21b3836e04476(((net.minecraft.item.ItemStack)(forwardValue4923_47_0)));
    if (!((life5_5 != 0))) {
        forwardValue4923_68_0 = spill4923_5;
        break forward_join_68;
    }
    if (!((spill4923_5 != life6_19))) {
        break forward_join_63;
    }
    spill4923_6 = life6_19;
    if (!((life5_5 != 0))) {
        forwardValue4923_70_0 = spill4923_6;
        break forward_join_70;
    }
    if (!((spill4923_6 == 4))) {
        break forward_join_69;
    }
    spill4923_7 = ((((net.minecraft.item.ItemStack)(p1)).a__wQ() instanceof moom.wU) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue4923_70_0 = spill4923_7;
        break forward_join_70;
    }
    if (!((spill4923_7 != 0))) {
        break forward_join_69;
    }
    }
    ((net.minecraft.entity.EntityLiving)(this)).b(((int)(life6_19)), ((net.minecraft.item.ItemStack)(p1)));
    forwardValue4923_68_0 = 1;
    }
    return ((forwardValue4923_68_0) != 0);
    }
    forwardValue4923_70_0 = 0;
    }
    return ((forwardValue4923_70_0) != 0);
}


public final boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.Entity forwardValue4924_15_0;
    net.minecraft.entity.EntityLiving forwardValue4924_18_0;
    net.minecraft.entity.EntityLiving forwardValue4924_26_0;
    int forwardValue4924_26_1;
    int forwardValue4924_26_2;
    net.minecraft.entity.EntityLiving forwardValue4924_27_0;
    int forwardValue4924_27_1;
    net.minecraft.entity.EntityLiving forwardValue4924_28_0;
    int forwardValue4924_28_1;
    int forwardValue4924_28_2;
    net.minecraft.item.ItemStack forwardValue4924_40_0;
    int forwardValue4924_70_0;
    int forwardValue4924_75_0;
    int forwardValue4924_93_0;
    int forwardValue4924_101_0;
    net.minecraft.entity.EntityLiving spill4924_0;
    net.minecraft.entity.EntityLiving spill4924_1;
    int spill4924_2;
    boolean spill4924_3;
    net.minecraft.item.ItemStack spill4924_4;
    boolean spill4924_5;
    int spill4924_6;
    boolean spill4924_7;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_49;
    forward_join_101: {
    forward_join_98: {
    forward_join_93: {
    forward_join_90: {
    forward_join_75: {
    forward_join_71: {
    forward_join_70: {
    forward_join_59: {
    forward_join_40: {
    forward_join_31: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_18: {
    forward_join_15: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 114324151515460L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4924_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue4924_15_0 = spill4924_0;
        break forward_join_15;
    }
    if (!(((net.minecraft.entity.EntityLiving)(spill4924_0)).T__Boolean())) {
        break forward_join_31;
    }
    spill4924_1 = this;
    if (!((life4_5 == 0))) {
        forwardValue4924_18_0 = spill4924_1;
        break forward_join_18;
    }
    forwardValue4924_15_0 = ((net.minecraft.entity.EntityLiving)(spill4924_1)).c__sourceReturn_09c029d8c3();
    }
    if (!((forwardValue4924_15_0 == p0))) {
        break forward_join_31;
    }
    forwardValue4924_18_0 = this;
    }
    spill4924_2 = 1;
    spill4924_3 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_5 == 0))) {
        forwardValue4924_26_0 = forwardValue4924_18_0;
        forwardValue4924_26_1 = spill4924_2;
        forwardValue4924_26_2 = ((spill4924_3) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill4924_3))) {
        forwardValue4924_27_0 = forwardValue4924_18_0;
        forwardValue4924_27_1 = spill4924_2;
        break forward_join_27;
    }
    forwardValue4924_26_0 = forwardValue4924_18_0;
    forwardValue4924_26_1 = spill4924_2;
    forwardValue4924_26_2 = 1;
    }
    forwardValue4924_28_0 = forwardValue4924_26_0;
    forwardValue4924_28_1 = forwardValue4924_26_1;
    forwardValue4924_28_2 = forwardValue4924_26_2;
    break forward_join_28;
    }
    forwardValue4924_28_0 = forwardValue4924_27_0;
    forwardValue4924_28_1 = forwardValue4924_27_1;
    forwardValue4924_28_2 = 0;
    }
    ((net.minecraft.entity.EntityLiving)(forwardValue4924_28_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4924_28_1))), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4924_28_2))));
    return ((1) != 0);
    }
    life5_49 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    spill4924_4 = life5_49;
    if (!((life4_5 == 0))) {
        forwardValue4924_40_0 = spill4924_4;
        break forward_join_40;
    }
    if (!((spill4924_4 != null))) {
        break forward_join_90;
    }
    forwardValue4924_40_0 = life5_49;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4924_40_0)).a__wQ() == net.minecraft.init.Items.b2))) {
        break forward_join_90;
    }
    spill4924_5 = ((net.minecraft.entity.EntityLiving)(this)).S__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue4924_93_0 = ((spill4924_5) ? 1 : 0);
        break forward_join_93;
    }
    if (!(spill4924_5)) {
        break forward_join_90;
    }
    spill4924_6 = ((this instanceof moom.sS) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue4924_70_0 = spill4924_6;
        break forward_join_70;
    }
    if (!((spill4924_6 != 0))) {
        break forward_join_59;
    }
    spill4924_7 = ((moom.sS)(((moom.sS)(this)))).ae();
    if (!((life4_5 == 0))) {
        forwardValue4924_75_0 = ((spill4924_7) ? 1 : 0);
        break forward_join_75;
    }
    if (!((!spill4924_7))) {
        break forward_join_71;
    }
    }
    ((net.minecraft.entity.EntityLiving)(this)).a(((net.minecraft.entity.Entity)(p0)), ((boolean)(true)));
    net.minecraft.item.ItemStack __stackOp4924_20_0 = life5_49;
    ((net.minecraft.item.ItemStack)(__stackOp4924_20_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4924_20_0)).b - 1)));
    forwardValue4924_70_0 = 1;
    }
    return ((forwardValue4924_70_0) != 0);
    }
    forwardValue4924_75_0 = ((((moom.sS)(((moom.sS)(this)))).b__sourceReturn_55fa5355bc(((net.minecraft.entity.EntityLivingBase)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue4924_93_0 = forwardValue4924_75_0;
        break forward_join_93;
    }
    if (!((forwardValue4924_75_0 != 0))) {
        break forward_join_90;
    }
    ((net.minecraft.entity.EntityLiving)(this)).a(((net.minecraft.entity.Entity)(p0)), ((boolean)(true)));
    net.minecraft.item.ItemStack __stackOp4924_28_0 = life5_49;
    ((net.minecraft.item.ItemStack)(__stackOp4924_28_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4924_28_0)).b - 1)));
    return ((1) != 0);
    }
    forwardValue4924_93_0 = ((((net.minecraft.entity.EntityLiving)(this)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue4924_101_0 = forwardValue4924_93_0;
        break forward_join_101;
    }
    if (!((forwardValue4924_93_0 != 0))) {
        break forward_join_98;
    }
    return ((1) != 0);
    }
    forwardValue4924_101_0 = ((super.b__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    return ((forwardValue4924_101_0) != 0);
}


protected void b(moom.Eh p0) {
net.minecraft.entity.EntityLiving lexicalValue1530_15_0;
    int lexicalValue1530_45_0;
    java.util.Random lexicalValue1530_69_0;
    int spill1530_0;
    net.minecraft.entity.EntityLiving spill1530_1;
    int spill1530_2;
    java.util.Random spill1530_3;
    long life2_3;
    float life5_7;
    int life4_8;
    int life6_57;
    net.minecraft.item.ItemStack life7_64;
    lexical_join_89: {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_15: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 84948533392800L);
    spill1530_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_7 = ((moom.Eh)(p0)).b();
    life4_8 = spill1530_0;
    spill1530_1 = this;
    if (!((life4_8 == 0))) {
        lexicalValue1530_15_0 = spill1530_1;
        break lexical_join_15;
    }
    if (!((((net.minecraft.entity.EntityLiving)(spill1530_1)).a__xW() != null))) {
        break lexical_join_44;
    }
    lexicalValue1530_15_0 = this;
    }
    spill1530_2 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.entity.EntityLiving)(lexicalValue1530_15_0)).ah)).nextFloat())), ((float)((0x1.0p-2f * life5_7))));
    if (!((life4_8 == 0))) {
        lexicalValue1530_45_0 = spill1530_2;
        break lexical_join_45;
    }
    if (!((spill1530_2 < 0))) {
        break lexical_join_44;
    }
    moom.rV.a__xW(((java.util.Random)(this.ah)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLiving)(this)).a__xW())), ((int)(((int) (0x1.4p2f + (life5_7 * ((float) ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_75ba9b926b76_invokedynamic1530_10(7428, (4330797632217630293L ^ life2_3))))))))))));
    }
    lexicalValue1530_45_0 = 0;
    }
    life6_57 = lexicalValue1530_45_0;
    lexical_cycle_46: while (true) {
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_69: {
    if (!((life6_57 < 4))) {
        break lexical_join_89;
    }
    life7_64 = ((net.minecraft.entity.EntityLiving)(this)).b__sourceReturn_7f6f0b7f03(((int)(life6_57)));
    if (!((life4_8 == 0))) {
        break lexical_join_87;
    }
    if (!((life7_64 != null))) {
        break lexical_join_86;
    }
    spill1530_3 = this.ah;
    if (!((life4_8 == 0))) {
        lexicalValue1530_69_0 = spill1530_3;
        break lexical_join_69;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(spill1530_3)).nextFloat())), ((float)((0x1.0p-1f * life5_7)))) < 0))) {
        break lexical_join_86;
    }
    lexicalValue1530_69_0 = this.ah;
    }
    moom.rV.a__xW(((java.util.Random)(lexicalValue1530_69_0)), ((net.minecraft.item.ItemStack)(life7_64)), ((int)(((int) (0x1.4p2f + (life5_7 * ((float) ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_75ba9b926b76_invokedynamic1530_19(13742, (8375478838956289782L ^ life2_3))))))))))));
    }
    life6_57 += 1;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    return;
}


public net.minecraft.item.ItemStack b__sourceReturn_7f6f0b7f03(int p0) {
return (this.bN)[(p0 + 1)];
}


protected void b(boolean p0, int p1) {
int lexicalValue1531_30_0;
    int spill1531_0;
    int spill1531_1;
    long life3_3;
    net.minecraft.item.Item life6_7;
    int life5_8;
    int life7_15;
    int life8_33;
    lexical_join_42: {
    lexical_join_30: {
    lexical_join_29: {
    life3_3 = (net.minecraft.entity.EntityLiving.gb ^ 42169364457782L);
    spill1531_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life6_7 = ((net.minecraft.entity.EntityLiving)(this)).a__wQ();
    life5_8 = spill1531_0;
    if (!((life6_7 != null))) {
        break lexical_join_42;
    }
    life7_15 = ((java.util.Random)(this.ah)).nextInt(((int)(3)));
    spill1531_1 = p1;
    if (!((life5_8 == 0))) {
        lexicalValue1531_30_0 = spill1531_1;
        break lexical_join_30;
    }
    if (!((spill1531_1 > 0))) {
        break lexical_join_29;
    }
    life7_15 = (life7_15 + ((java.util.Random)(this.ah)).nextInt(((int)((p1 + 1)))));
    }
    lexicalValue1531_30_0 = 0;
    }
    life8_33 = lexicalValue1531_30_0;
    lexical_cycle_31: while (true) {
    if (!((life8_33 < life7_15))) {
        break lexical_join_42;
    }
    ((net.minecraft.entity.EntityLiving)(this)).a(((net.minecraft.item.Item)(life6_7)), ((int)(1)));
    life8_33 += 1;
    if (!((life5_8 != 0))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    return;
}


public void b(int p0, net.minecraft.item.ItemStack p1) {
(this.bN)[p0] = p1;
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral11170_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
int lexicalValue1532_34_0;
    int lexicalValue1532_74_0;
    int lexicalValue1532_109_0;
    net.minecraft.entity.EntityLiving lexicalValue1532_125_0;
    int spill1532_0;
    boolean spill1532_1;
    net.minecraft.entity.EntityLiving spill1532_2;
    long life2_3;
    int life4_8;
    net.minecraft.nbt.NBTTagList life5_54;
    int life6_56;
    net.minecraft.nbt.NBTTagList life5_96;
    int life6_98;
    lexical_join_125: {
    lexical_join_124: {
    lexical_join_109: {
    lexical_join_105: {
    lexical_join_100: {
    lexical_join_74: {
    lexical_join_66: {
    lexical_join_34: {
    lexical_join_21: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 26166938792252L);
    spill1532_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill1532_0;
    spill1532_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("CanPickUpLoot")), ((int)(1)));
    if (!((life4_8 == 0))) {
        lexicalValue1532_34_0 = ((spill1532_1) ? 1 : 0);
        break lexical_join_34;
    }
    if (!(spill1532_1)) {
        break lexical_join_21;
    }
    ((net.minecraft.entity.EntityLiving)(this)).i(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("CanPickUpLoot"))))));
    }
    this.bQ = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("PersistenceRequired")))));
    lexicalValue1532_34_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Equipment")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1532_9(26668, (3553841231341484009L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        lexicalValue1532_74_0 = lexicalValue1532_34_0;
        break lexical_join_74;
    }
    if (!((lexicalValue1532_34_0 != 0))) {
        break lexical_join_66;
    }
    life5_54 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Equipment")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1532_12(16012, (7767762382628888899L ^ life2_3)))));
    life6_56 = 0;
    lexical_cycle_48: while (true) {
    if (!((life6_56 < (this.bN).length))) {
        break lexical_join_66;
    }
    (this.bN)[life6_56] = __sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_54)).a__yw(((int)(life6_56))))));
    life6_56 += 1;
    if (!((life4_8 == 0))) {
        break lexical_join_105;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    lexicalValue1532_74_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("DropChances")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1532_18(31528, (2400723990513673440L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        lexicalValue1532_109_0 = lexicalValue1532_74_0;
        break lexical_join_109;
    }
    if (!((lexicalValue1532_74_0 != 0))) {
        break lexical_join_100;
    }
    life5_96 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("DropChances")), ((int)(5)));
    life6_98 = 0;
    lexical_cycle_84: while (true) {
    if (!((life6_98 < ((net.minecraft.nbt.NBTTagList)(life5_96)).a__Int()))) {
        break lexical_join_100;
    }
    (this.bO)[life6_98] = ((net.minecraft.nbt.NBTTagList)(life5_96)).a__Float(((int)(life6_98)));
    life6_98 += 1;
    if (!((life4_8 == 0))) {
        break lexical_join_105;
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_84; }
    break lexical_cycle_84;
    }
    }
    this.bR = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Leashed")))));
    }
    spill1532_2 = this;
    if (!((life4_8 == 0))) {
        lexicalValue1532_125_0 = spill1532_2;
        break lexical_join_125;
    }
    lexicalValue1532_109_0 = ((((net.minecraft.entity.EntityLiving)(spill1532_2)).bR) ? 1 : 0);
    }
    if (!((lexicalValue1532_109_0 != 0))) {
        break lexical_join_124;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Leash")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1532_29(27257, (1299424103037695418L ^ life2_3))))))) {
        break lexical_join_124;
    }
    this.bT = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("Leash")))));
    }
    lexicalValue1532_125_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(lexicalValue1532_125_0)).j(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("NoAI"))))));
    return;
}


public net.minecraft.entity.Entity c__sourceReturn_09c029d8c3() {
return this.bS;
}


public void c(net.minecraft.entity.EntityLivingBase p0) {
this.bL = ((net.minecraft.entity.EntityLivingBase)(p0));
    return;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_0b93efe4aa879c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24918;
      if (sb[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = rb[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])tb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               tb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sH", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         sb[var3] = var15;
      }

      return sb[var3];
}


public int n__Int() {
return 4;
}


public void h__Void() {
net.minecraft.entity.EntityLiving forwardValue4928_44_0;
    int spill4928_0;
    net.minecraft.entity.EntityLiving spill4928_1;
    net.minecraft.entity.EntityLiving spill4928_2;
    int spill4928_3;
    int spill4928_4;
    long life1_3;
    int life3_12;
    forward_join_44: {
    forward_join_43: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 37340864854734L);
    super.h__Void();
    spill4928_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("mobBaseTick")));
    life3_12 = spill4928_0;
    spill4928_1 = this;
    if (!((life3_12 == 0))) {
        forwardValue4928_44_0 = spill4928_1;
        break forward_join_44;
    }
    if (!(((net.minecraft.entity.EntityLiving)(spill4928_1)).p__Boolean())) {
        break forward_join_43;
    }
    spill4928_2 = this;
    if (!((life3_12 == 0))) {
        forwardValue4928_44_0 = spill4928_2;
        break forward_join_44;
    }
    spill4928_3 = ((java.util.Random)(((net.minecraft.entity.EntityLiving)(spill4928_2)).ah)).nextInt(((int)(__sourceIntrinsic_455b93f512d4_invokedynamic4928_8(11965, (6636175571263912581L ^ life1_3)))));
    net.minecraft.entity.EntityLiving __stackOp4928_10_0 = this;
    net.minecraft.entity.EntityLiving __stackOp4928_12_0 = __stackOp4928_10_0;
    int __stackOp4928_12_1 = ((net.minecraft.entity.EntityLiving)(__stackOp4928_10_0)).bC;
    spill4928_4 = __stackOp4928_12_1;
    ((net.minecraft.entity.EntityLiving)(__stackOp4928_12_0)).bC = ((int)((__stackOp4928_12_1 + 1)));
    if (!((spill4928_3 < spill4928_4))) {
        break forward_join_43;
    }
    this.bC = ((int)((-((net.minecraft.entity.EntityLiving)(this)).l())));
    ((net.minecraft.entity.EntityLiving)(this)).O();
    }
    forwardValue4928_44_0 = this;
    }
    ((moom.A9)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(forwardValue4928_44_0)).i)).D)).b();
    return;
}


public void h(float p0) {
this.bk = ((float)(p0));
    return;
}


private static moom.Oo f(moom.Oo p0) {
return p0;
}


public void f(float p0) {
super.f(((float)(p0)));
    ((net.minecraft.entity.EntityLiving)(this)).h(((float)(p0)));
    return;
}


public int l() {
long local1 = (net.minecraft.entity.EntityLiving.gb ^ 93064736356852L);
    return __sourceIntrinsic_d0e131a72963_originalDynamicSite1875_1(21139, (3468361018055755164L ^ local1));
}


public net.minecraft.entity.EntityLivingBase d__sourceReturn_d30556f370() {
return this.bL;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.EntityLiving.gb ^ 109708860099951L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1876_3(15977, (6137874170441981434L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
int lexicalValue1533_137_0;
    net.minecraft.entity.Entity lexicalValue1533_140_0;
    net.minecraft.entity.EntityLiving lexicalValue1533_163_0;
    int spill1533_0;
    net.minecraft.entity.EntityLiving spill1533_1;
    int spill1533_2;
    net.minecraft.entity.Entity spill1533_3;
    long life2_3;
    int life4_8;
    net.minecraft.nbt.NBTTagList life5_22;
    net.minecraft.item.ItemStack[] life6_25;
    int life7_28;
    int life8_30;
    net.minecraft.item.ItemStack life9_37;
    net.minecraft.nbt.NBTTagCompound life10_41;
    net.minecraft.nbt.NBTTagList life6_74;
    float[] life7_77;
    int life8_80;
    int life9_82;
    float life10_89;
    net.minecraft.nbt.NBTTagCompound life7_124;
    moom.DT life8_172;
    lexical_join_170: {
    lexical_join_163: {
    lexical_join_162: {
    lexical_join_158: {
    lexical_join_140: {
    lexical_join_137: {
    lexical_join_132: {
    lexical_join_101: {
    lexical_join_92: {
    lexical_join_62: {
    lexical_join_58: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 46903349242423L);
    spill1533_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill1533_0;
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("CanPickUpLoot")), ((boolean)(((net.minecraft.entity.EntityLiving)(this)).Q__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("PersistenceRequired")), ((boolean)(this.bQ)));
    life5_22 = new net.minecraft.nbt.NBTTagList();
    life6_25 = this.bN;
    life7_28 = (life6_25).length;
    life8_30 = 0;
    lexical_cycle_31: while (true) {
    lexical_join_56: {
    lexical_join_52: {
    if (!((life8_30 < life7_28))) {
        break lexical_join_58;
    }
    life9_37 = (life6_25)[life8_30];
    life10_41 = new net.minecraft.nbt.NBTTagCompound();
    if (!((life4_8 != 0))) {
        break lexical_join_62;
    }
    if (!((life4_8 != 0))) {
        break lexical_join_56;
    }
    if (!((life9_37 != null))) {
        break lexical_join_52;
    }
    ((net.minecraft.item.ItemStack)(life9_37)).a__yw(((net.minecraft.nbt.NBTTagCompound)(life10_41)));
    }
    ((net.minecraft.nbt.NBTTagList)(life5_22)).a(((net.minecraft.nbt.NBTBase)(life10_41)));
    life8_30 += 1;
    }
    if (!((life4_8 == 0))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Equipment")), ((net.minecraft.nbt.NBTBase)(life5_22)));
    }
    life6_74 = new net.minecraft.nbt.NBTTagList();
    life7_77 = this.bO;
    life8_80 = (life7_77).length;
    life9_82 = 0;
    lexical_cycle_74: while (true) {
    if (!((life9_82 < life8_80))) {
        break lexical_join_92;
    }
    life10_89 = (life7_77)[life9_82];
    ((net.minecraft.nbt.NBTTagList)(life6_74)).a(((net.minecraft.nbt.NBTBase)(new moom.yr(life10_89))));
    life9_82 += 1;
    if (!((life4_8 != 0))) {
        break lexical_join_101;
    }
    if (!((life4_8 == 0))) { continue lexical_cycle_74; }
    break lexical_cycle_74;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("DropChances")), ((net.minecraft.nbt.NBTBase)(life6_74)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Leashed")), ((boolean)(this.bR)));
    }
    spill1533_1 = this;
    if (!((life4_8 != 0))) {
        lexicalValue1533_163_0 = spill1533_1;
        break lexical_join_163;
    }
    if (!((((net.minecraft.entity.EntityLiving)(spill1533_1)).bS != null))) {
        break lexical_join_162;
    }
    life7_124 = new net.minecraft.nbt.NBTTagCompound();
    spill1533_2 = ((this.bS instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_8 != 0))) {
        lexicalValue1533_137_0 = spill1533_2;
        break lexical_join_137;
    }
    if (!((spill1533_2 != 0))) {
        break lexical_join_132;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life7_124)).a(((java.lang.String)("UUIDMost")), ((long)(((java.util.UUID)(((net.minecraft.entity.Entity)(this.bS)).a__UUID())).getMostSignificantBits())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_124)).a(((java.lang.String)("UUIDLeast")), ((long)(((java.util.UUID)(((net.minecraft.entity.Entity)(this.bS)).a__UUID())).getLeastSignificantBits())));
    if (!((life4_8 == 0))) {
        break lexical_join_158;
    }
    }
    spill1533_3 = this.bS;
    if (!((life4_8 != 0))) {
        lexicalValue1533_140_0 = spill1533_3;
        break lexical_join_140;
    }
    lexicalValue1533_137_0 = ((spill1533_3 instanceof net.minecraft.entity.EntityHanging) ? 1 : 0);
    }
    if (!((lexicalValue1533_137_0 != 0))) {
        break lexical_join_158;
    }
    lexicalValue1533_140_0 = this.bS;
    }
    life8_172 = ((net.minecraft.entity.EntityHanging)(((net.minecraft.entity.EntityHanging)(lexicalValue1533_140_0)))).b__DT();
    ((net.minecraft.nbt.NBTTagCompound)(life7_124)).a__Void(((java.lang.String)("X")), ((int)(((moom.DT)(life8_172)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_124)).a__Void(((java.lang.String)("Y")), ((int)(((moom.DT)(life8_172)).b())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_124)).a__Void(((java.lang.String)("Z")), ((int)(((moom.DT)(life8_172)).c())));
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Leash")), ((net.minecraft.nbt.NBTBase)(life7_124)));
    }
    lexicalValue1533_163_0 = this;
    }
    if (!(((net.minecraft.entity.EntityLiving)(lexicalValue1533_163_0)).U__Boolean())) {
        break lexical_join_170;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("NoAI")), ((boolean)(((net.minecraft.entity.EntityLiving)(this)).U__Boolean())));
    }
    return;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.EntityLiving)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c))))).a(((moom.vB)(new moom.vB("Random spawn bonus", (((java.util.Random)(this.ah)).nextGaussian() * 0x1.999999999999ap-5d), 1))));
    return p1;
}


public net.minecraft.entity.ai.EntityJumpHelper a__vr() {
return this.bG;
}


public void a(int p0, float p1) {
(this.bO)[p0] = p1;
    return;
}


public moom.AV a__sourceReturn_407923443b() {
return this.bI;
}


protected void a(boolean p0, int p1) {
int lexicalValue1529_27_0;
    int lexicalValue1529_29_0;
    int lexicalValue1529_55_0;
    int lexicalValue1529_59_0;
    int lexicalValue1529_64_0;
    int lexicalValue1529_77_0;
    int lexicalValue1529_102_0;
    int lexicalValue1529_102_1;
    int lexicalValue1529_104_0;
    int spill1529_0;
    int spill1529_1;
    boolean spill1529_2;
    int spill1529_3;
    int spill1529_4;
    int spill1529_5;
    int spill1529_6;
    long life3_3;
    int life6_6;
    int life5_7;
    net.minecraft.item.ItemStack life7_16;
    int life8_32;
    int life9_113;
    int life10_126;
    lexical_join_116: {
    life3_3 = (net.minecraft.entity.EntityLiving.gb ^ 122098686849245L);
    spill1529_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life6_6 = 0;
    life5_7 = spill1529_0;
    lexical_cycle_8: while (true) {
    lexical_join_114: {
    lexical_join_113: {
    lexical_join_108: {
    lexical_join_105: {
    lexical_join_104: {
    lexical_join_102: {
    lexical_join_98: {
    lexical_join_77: {
    lexical_join_64: {
    lexical_join_59: {
    lexical_join_55: {
    lexical_join_42: {
    lexical_join_29: {
    lexical_join_28: {
    lexical_join_27: {
    if (!((life6_6 < (((net.minecraft.entity.EntityLiving)(this)).a__ArrayxW()).length))) {
        break lexical_join_116;
    }
    life7_16 = ((net.minecraft.entity.EntityLiving)(this)).a__xW(((int)(life6_6)));
    spill1529_1 = recovery.source.CarrierOps.fcmpl(((float)((this.bO)[life6_6])), ((float)(0x1.0p0f)));
    if (!((life5_7 == 0))) {
        lexicalValue1529_27_0 = spill1529_1;
        break lexical_join_27;
    }
    if (!((spill1529_1 > 0))) {
        break lexical_join_28;
    }
    lexicalValue1529_27_0 = 1;
    }
    lexicalValue1529_29_0 = lexicalValue1529_27_0;
    break lexical_join_29;
    }
    lexicalValue1529_29_0 = 0;
    }
    life8_32 = lexicalValue1529_29_0;
    if (!((life5_7 == 0))) {
        break lexical_join_114;
    }
    if (!((life7_16 != null))) {
        break lexical_join_113;
    }
    spill1529_2 = p0;
    if (!((life5_7 == 0))) {
        lexicalValue1529_55_0 = ((spill1529_2) ? 1 : 0);
        break lexical_join_55;
    }
    if (!((!spill1529_2))) {
        break lexical_join_42;
    }
    spill1529_3 = life8_32;
    if (!((life5_7 == 0))) {
        lexicalValue1529_55_0 = spill1529_3;
        break lexical_join_55;
    }
    if (!((spill1529_3 != 0))) {
        break lexical_join_113;
    }
    }
    lexicalValue1529_55_0 = recovery.source.CarrierOps.fcmpg(((float)((((java.util.Random)(this.ah)).nextFloat() - (((float) p1) * 0x1.47ae14p-7f)))), ((float)((this.bO)[life6_6])));
    }
    if (!((life5_7 == 0))) {
        lexicalValue1529_59_0 = lexicalValue1529_55_0;
        break lexical_join_59;
    }
    if (!((lexicalValue1529_55_0 < 0))) {
        break lexical_join_113;
    }
    lexicalValue1529_59_0 = life8_32;
    }
    if (!((life5_7 == 0))) {
        lexicalValue1529_64_0 = lexicalValue1529_59_0;
        break lexical_join_64;
    }
    if (!((lexicalValue1529_59_0 == 0))) {
        break lexical_join_108;
    }
    lexicalValue1529_64_0 = ((((net.minecraft.item.ItemStack)(life7_16)).b__Boolean()) ? 1 : 0);
    }
    if (!((life5_7 == 0))) {
        lexicalValue1529_77_0 = lexicalValue1529_64_0;
        break lexical_join_77;
    }
    if (!((lexicalValue1529_64_0 != 0))) {
        break lexical_join_108;
    }
    lexicalValue1529_77_0 = java.lang.Math.max(((int)((((net.minecraft.item.ItemStack)(life7_16)).d() - __sourceIntrinsic_cf52cd97ad90_invokedynamic1529_14(3122, (7889302180512502282L ^ life3_3))))), ((int)(1)));
    }
    life9_113 = lexicalValue1529_77_0;
    life10_126 = (((net.minecraft.item.ItemStack)(life7_16)).d() - ((java.util.Random)(this.ah)).nextInt(((int)((((java.util.Random)(this.ah)).nextInt(((int)(life9_113))) + 1)))));
    spill1529_4 = life10_126;
    spill1529_5 = life9_113;
    if (!((life5_7 == 0))) {
        lexicalValue1529_102_0 = spill1529_4;
        lexicalValue1529_102_1 = spill1529_5;
        break lexical_join_102;
    }
    if (!((spill1529_4 > spill1529_5))) {
        break lexical_join_98;
    }
    life10_126 = life9_113;
    }
    spill1529_6 = life10_126;
    if (!((life5_7 == 0))) {
        lexicalValue1529_104_0 = spill1529_6;
        break lexical_join_104;
    }
    lexicalValue1529_102_0 = spill1529_6;
    lexicalValue1529_102_1 = 1;
    }
    if (!((lexicalValue1529_102_0 < lexicalValue1529_102_1))) {
        break lexical_join_105;
    }
    lexicalValue1529_104_0 = 1;
    }
    life10_126 = lexicalValue1529_104_0;
    }
    ((net.minecraft.item.ItemStack)(life7_16)).a__Void(((int)(life10_126)));
    }
    ((net.minecraft.entity.EntityLiving)(this)).a(((net.minecraft.item.ItemStack)(life7_16)), ((float)(0x0.0p0f)));
    }
    life6_6 += 1;
    }
    if (!((life5_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


protected void a(moom.Eh p0) {
int lexicalValue1527_21_0;
    float lexicalValue1527_30_0;
    int lexicalValue1527_45_0;
    int lexicalValue1527_54_0;
    int lexicalValue1527_59_0;
    int lexicalValue1527_76_0;
    int spill1527_0;
    int spill1527_1;
    int spill1527_2;
    long life2_3;
    int life4_5;
    int life5_27;
    float life6_38;
    int life7_76;
    net.minecraft.item.ItemStack life8_82;
    net.minecraft.item.Item life9_115;
    lexical_join_103: {
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_54: {
    lexical_join_49: {
    lexical_join_45: {
    lexical_join_40: {
    lexical_join_30: {
    lexical_join_29: {
    lexical_join_21: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 2252236544939L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill1527_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)((0x1.333334p-3f * ((moom.Eh)(p0)).b()))));
    if (!((life4_5 != 0))) {
        lexicalValue1527_21_0 = spill1527_0;
        break lexical_join_21;
    }
    if (!((spill1527_0 < 0))) {
        break lexical_join_103;
    }
    lexicalValue1527_21_0 = ((java.util.Random)(this.ah)).nextInt(((int)(2)));
    }
    life5_27 = lexicalValue1527_21_0;
    if (!((((net.minecraft.world.World)(this.i)).a__bB() == net.minecraft.world.EnumDifficulty.HARD))) {
        break lexical_join_29;
    }
    lexicalValue1527_30_0 = 0x1.99999ap-4f;
    break lexical_join_30;
    }
    lexicalValue1527_30_0 = 0x1.0p-2f;
    }
    life6_38 = lexicalValue1527_30_0;
    spill1527_1 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.851eb8p-4f)));
    if (!((life4_5 != 0))) {
        lexicalValue1527_45_0 = spill1527_1;
        break lexical_join_45;
    }
    if (!((spill1527_1 < 0))) {
        break lexical_join_40;
    }
    life5_27 += 1;
    }
    lexicalValue1527_45_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.851eb8p-4f)));
    }
    if (!((life4_5 != 0))) {
        lexicalValue1527_54_0 = lexicalValue1527_45_0;
        break lexical_join_54;
    }
    if (!((lexicalValue1527_45_0 < 0))) {
        break lexical_join_49;
    }
    life5_27 += 1;
    }
    lexicalValue1527_54_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.851eb8p-4f)));
    }
    if (!((life4_5 != 0))) {
        lexicalValue1527_59_0 = lexicalValue1527_54_0;
        break lexical_join_59;
    }
    if (!((lexicalValue1527_54_0 < 0))) {
        break lexical_join_58;
    }
    life5_27 += 1;
    }
    lexicalValue1527_59_0 = 3;
    }
    life7_76 = lexicalValue1527_59_0;
    lexical_cycle_60: while (true) {
    lexical_join_101: {
    lexical_join_100: {
    lexical_join_79: {
    lexical_join_76: {
    if (!((life7_76 >= 0))) {
        break lexical_join_103;
    }
    life8_82 = ((net.minecraft.entity.EntityLiving)(this)).b__sourceReturn_7f6f0b7f03(((int)(life7_76)));
    spill1527_2 = life7_76;
    if (!((life4_5 != 0))) {
        lexicalValue1527_76_0 = spill1527_2;
        break lexical_join_76;
    }
    if (!((spill1527_2 < 3))) {
        break lexical_join_79;
    }
    lexicalValue1527_76_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(life6_38)));
    }
    if (!((lexicalValue1527_76_0 < 0))) {
        break lexical_join_79;
    }
    if (!((life4_5 == 0))) {
        break lexical_join_103;
    }
    }
    if (!((life8_82 == null))) {
        break lexical_join_100;
    }
    life9_115 = __sourceExactCall_ef5ea23ab7bef5(((int)((life7_76 + 1))), ((int)(life5_27)));
    if (!((life4_5 != 0))) {
        break lexical_join_101;
    }
    if (!((life9_115 != null))) {
        break lexical_join_100;
    }
    ((net.minecraft.entity.EntityLiving)(this)).b(((int)((life7_76 + 1))), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life9_115))));
    }
    life7_76 += -1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    return;
}


public static int a(net.minecraft.item.ItemStack p0) {
net.minecraft.item.Item forwardValue525_18_0;
    net.minecraft.item.Item forwardValue525_18_1;
    net.minecraft.item.Item forwardValue525_21_0;
    int forwardValue525_41_0;
    net.minecraft.item.Item spill525_0;
    net.minecraft.item.Item spill525_1;
    net.minecraft.item.Item spill525_2;
    int spill525_3;
    int spill525_4;
    long life1_3;
    int life3_5;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_38: {
    forward_join_36: {
    forward_join_34: {
    forward_join_32: {
    forward_join_21: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 28918562489279L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill525_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    spill525_1 = __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU)));
    if (!((life3_5 != 0))) {
        forwardValue525_18_0 = spill525_0;
        forwardValue525_18_1 = spill525_1;
        break forward_join_18;
    }
    if (!((spill525_0 != spill525_1))) {
        break forward_join_42;
    }
    spill525_2 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    if (!((life3_5 != 0))) {
        forwardValue525_21_0 = spill525_2;
        break forward_join_21;
    }
    forwardValue525_18_0 = spill525_2;
    forwardValue525_18_1 = net.minecraft.init.Items.bM;
    }
    if (!((forwardValue525_18_0 != forwardValue525_18_1))) {
        break forward_join_42;
    }
    forwardValue525_21_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    }
    spill525_3 = ((forwardValue525_21_0 instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue525_41_0 = spill525_3;
        break forward_join_41;
    }
    if (!((spill525_3 != 0))) {
        break forward_join_40;
    }
    spill525_4 = ((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemStack)(p0)).a__wQ())))).q;
    if (!((life3_5 != 0))) {
        forwardValue525_41_0 = spill525_4;
        break forward_join_41;
    }
    switch (spill525_4) {
case 0:
{
        break forward_join_32;
    }
case 1:
{
        break forward_join_34;
    }
case 2:
{
        break forward_join_36;
    }
case 3:
{
        break forward_join_38;
    }
default:
{
        break forward_join_40;
    }
}
    }
    return 4;
    }
    return 3;
    }
    return 2;
    }
    return 1;
    }
    forwardValue525_41_0 = 0;
    }
    return forwardValue525_41_0;
    }
    return 4;
}


public static net.minecraft.item.Item a(int p0, int p1) {
int forwardValue524_11_0;
    int forwardValue524_17_0;
    int forwardValue524_25_0;
    int forwardValue524_25_1;
    int forwardValue524_32_0;
    int forwardValue524_32_1;
    int forwardValue524_41_0;
    int forwardValue524_41_1;
    int forwardValue524_45_0;
    int forwardValue524_51_0;
    int forwardValue524_59_0;
    int forwardValue524_59_1;
    int forwardValue524_66_0;
    int forwardValue524_66_1;
    int forwardValue524_75_0;
    int forwardValue524_75_1;
    int forwardValue524_79_0;
    int forwardValue524_85_0;
    int forwardValue524_93_0;
    int forwardValue524_93_1;
    int forwardValue524_100_0;
    int forwardValue524_100_1;
    int forwardValue524_109_0;
    int forwardValue524_109_1;
    int forwardValue524_113_0;
    int forwardValue524_119_0;
    int forwardValue524_127_0;
    int forwardValue524_127_1;
    int forwardValue524_134_0;
    int forwardValue524_134_1;
    int forwardValue524_141_0;
    int forwardValue524_141_1;
    int spill524_0;
    int spill524_1;
    int spill524_2;
    int spill524_3;
    int spill524_4;
    int spill524_5;
    int spill524_6;
    int spill524_7;
    long life2_3;
    int life4_5;
    forward_join_144: {
    forward_join_141: {
    forward_join_139: {
    forward_join_134: {
    forward_join_132: {
    forward_join_127: {
    forward_join_125: {
    forward_join_119: {
    forward_join_118: {
    forward_join_113: {
    forward_join_112: {
    forward_join_109: {
    forward_join_105: {
    forward_join_100: {
    forward_join_98: {
    forward_join_93: {
    forward_join_91: {
    forward_join_85: {
    forward_join_84: {
    forward_join_79: {
    forward_join_78: {
    forward_join_75: {
    forward_join_71: {
    forward_join_66: {
    forward_join_64: {
    forward_join_59: {
    forward_join_57: {
    forward_join_51: {
    forward_join_50: {
    forward_join_45: {
    forward_join_44: {
    forward_join_41: {
    forward_join_37: {
    forward_join_32: {
    forward_join_30: {
    forward_join_25: {
    forward_join_23: {
    forward_join_17: {
    forward_join_16: {
    forward_join_11: {
    forward_join_10: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 21839409558262L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill524_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue524_11_0 = spill524_0;
        break forward_join_11;
    }
    switch (spill524_0) {
case 4:
{
        break forward_join_10;
    }
case 3:
{
        break forward_join_44;
    }
case 2:
{
        break forward_join_78;
    }
case 1:
{
        break forward_join_112;
    }
default:
{
        break forward_join_144;
    }
}
    }
    forwardValue524_11_0 = p1;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_17_0 = forwardValue524_11_0;
        break forward_join_17;
    }
    if (!((forwardValue524_11_0 == 0))) {
        break forward_join_16;
    }
    return net.minecraft.init.Items.Q;
    }
    forwardValue524_17_0 = p1;
    }
    spill524_1 = 1;
    if (!((life4_5 != 0))) {
        forwardValue524_25_0 = forwardValue524_17_0;
        forwardValue524_25_1 = spill524_1;
        break forward_join_25;
    }
    if (!((forwardValue524_17_0 == spill524_1))) {
        break forward_join_23;
    }
    return net.minecraft.init.Items.ag;
    }
    forwardValue524_25_0 = p1;
    forwardValue524_25_1 = 2;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_32_0 = forwardValue524_25_0;
        forwardValue524_32_1 = forwardValue524_25_1;
        break forward_join_32;
    }
    if (!((forwardValue524_25_0 == forwardValue524_25_1))) {
        break forward_join_30;
    }
    return net.minecraft.init.Items.U;
    }
    forwardValue524_32_0 = p1;
    forwardValue524_32_1 = 3;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_41_0 = forwardValue524_32_0;
        forwardValue524_41_1 = forwardValue524_32_1;
        break forward_join_41;
    }
    if (!((forwardValue524_32_0 == forwardValue524_32_1))) {
        break forward_join_37;
    }
    return net.minecraft.init.Items.Y;
    }
    spill524_2 = p1;
    if (!((life4_5 != 0))) {
        forwardValue524_45_0 = spill524_2;
        break forward_join_45;
    }
    forwardValue524_41_0 = spill524_2;
    forwardValue524_41_1 = 4;
    }
    if (!((forwardValue524_41_0 == forwardValue524_41_1))) {
        break forward_join_44;
    }
    return net.minecraft.init.Items.ac;
    }
    forwardValue524_45_0 = p1;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_51_0 = forwardValue524_45_0;
        break forward_join_51;
    }
    if (!((forwardValue524_45_0 == 0))) {
        break forward_join_50;
    }
    return net.minecraft.init.Items.R;
    }
    forwardValue524_51_0 = p1;
    }
    spill524_3 = 1;
    if (!((life4_5 != 0))) {
        forwardValue524_59_0 = forwardValue524_51_0;
        forwardValue524_59_1 = spill524_3;
        break forward_join_59;
    }
    if (!((forwardValue524_51_0 == spill524_3))) {
        break forward_join_57;
    }
    return net.minecraft.init.Items.ah;
    }
    forwardValue524_59_0 = p1;
    forwardValue524_59_1 = 2;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_66_0 = forwardValue524_59_0;
        forwardValue524_66_1 = forwardValue524_59_1;
        break forward_join_66;
    }
    if (!((forwardValue524_59_0 == forwardValue524_59_1))) {
        break forward_join_64;
    }
    return net.minecraft.init.Items.V;
    }
    forwardValue524_66_0 = p1;
    forwardValue524_66_1 = 3;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_75_0 = forwardValue524_66_0;
        forwardValue524_75_1 = forwardValue524_66_1;
        break forward_join_75;
    }
    if (!((forwardValue524_66_0 == forwardValue524_66_1))) {
        break forward_join_71;
    }
    return net.minecraft.init.Items.Z;
    }
    spill524_4 = p1;
    if (!((life4_5 != 0))) {
        forwardValue524_79_0 = spill524_4;
        break forward_join_79;
    }
    forwardValue524_75_0 = spill524_4;
    forwardValue524_75_1 = 4;
    }
    if (!((forwardValue524_75_0 == forwardValue524_75_1))) {
        break forward_join_78;
    }
    return net.minecraft.init.Items.ad;
    }
    forwardValue524_79_0 = p1;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_85_0 = forwardValue524_79_0;
        break forward_join_85;
    }
    if (!((forwardValue524_79_0 == 0))) {
        break forward_join_84;
    }
    return net.minecraft.init.Items.S;
    }
    forwardValue524_85_0 = p1;
    }
    spill524_5 = 1;
    if (!((life4_5 != 0))) {
        forwardValue524_93_0 = forwardValue524_85_0;
        forwardValue524_93_1 = spill524_5;
        break forward_join_93;
    }
    if (!((forwardValue524_85_0 == spill524_5))) {
        break forward_join_91;
    }
    return net.minecraft.init.Items.ai;
    }
    forwardValue524_93_0 = p1;
    forwardValue524_93_1 = 2;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_100_0 = forwardValue524_93_0;
        forwardValue524_100_1 = forwardValue524_93_1;
        break forward_join_100;
    }
    if (!((forwardValue524_93_0 == forwardValue524_93_1))) {
        break forward_join_98;
    }
    return net.minecraft.init.Items.W;
    }
    forwardValue524_100_0 = p1;
    forwardValue524_100_1 = 3;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_109_0 = forwardValue524_100_0;
        forwardValue524_109_1 = forwardValue524_100_1;
        break forward_join_109;
    }
    if (!((forwardValue524_100_0 == forwardValue524_100_1))) {
        break forward_join_105;
    }
    return net.minecraft.init.Items.aa;
    }
    spill524_6 = p1;
    if (!((life4_5 != 0))) {
        forwardValue524_113_0 = spill524_6;
        break forward_join_113;
    }
    forwardValue524_109_0 = spill524_6;
    forwardValue524_109_1 = 4;
    }
    if (!((forwardValue524_109_0 == forwardValue524_109_1))) {
        break forward_join_112;
    }
    return net.minecraft.init.Items.ae;
    }
    forwardValue524_113_0 = p1;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_119_0 = forwardValue524_113_0;
        break forward_join_119;
    }
    if (!((forwardValue524_113_0 == 0))) {
        break forward_join_118;
    }
    return net.minecraft.init.Items.T;
    }
    forwardValue524_119_0 = p1;
    }
    spill524_7 = 1;
    if (!((life4_5 != 0))) {
        forwardValue524_127_0 = forwardValue524_119_0;
        forwardValue524_127_1 = spill524_7;
        break forward_join_127;
    }
    if (!((forwardValue524_119_0 == spill524_7))) {
        break forward_join_125;
    }
    return net.minecraft.init.Items.aj;
    }
    forwardValue524_127_0 = p1;
    forwardValue524_127_1 = 2;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_134_0 = forwardValue524_127_0;
        forwardValue524_134_1 = forwardValue524_127_1;
        break forward_join_134;
    }
    if (!((forwardValue524_127_0 == forwardValue524_127_1))) {
        break forward_join_132;
    }
    return net.minecraft.init.Items.X;
    }
    forwardValue524_134_0 = p1;
    forwardValue524_134_1 = 3;
    }
    if (!((life4_5 != 0))) {
        forwardValue524_141_0 = forwardValue524_134_0;
        forwardValue524_141_1 = forwardValue524_134_1;
        break forward_join_141;
    }
    if (!((forwardValue524_134_0 == forwardValue524_134_1))) {
        break forward_join_139;
    }
    return net.minecraft.init.Items.ab;
    }
    forwardValue524_141_0 = p1;
    forwardValue524_141_1 = 4;
    }
    if (!((forwardValue524_141_0 == forwardValue524_141_1))) {
        break forward_join_144;
    }
    return net.minecraft.init.Items.af;
    }
    return null;
}


protected int a(net.minecraft.entity.player.EntityPlayer p0) {
int lexicalValue1528_44_0;
    int lexicalValue1528_52_0;
    int spill1528_0;
    int spill1528_1;
    long life2_3;
    int life4_5;
    int life5_16;
    net.minecraft.item.ItemStack[] life6_19;
    int life7_21;
    lexical_join_52: {
    lexical_join_50: {
    lexical_join_48: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 32040752463138L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill1528_0 = this.bD;
    if (!((life4_5 == 0))) {
        lexicalValue1528_52_0 = spill1528_0;
        break lexical_join_52;
    }
    if (!((spill1528_0 > 0))) {
        break lexical_join_50;
    }
    life5_16 = this.bD;
    life6_19 = ((net.minecraft.entity.EntityLiving)(this)).a__ArrayxW();
    life7_21 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_45: {
    lexical_join_44: {
    if (!((life7_21 < (life6_19).length))) {
        break lexical_join_48;
    }
    if (!(((life6_19)[life7_21] != null))) {
        break lexical_join_45;
    }
    spill1528_1 = recovery.source.CarrierOps.fcmpg(((float)((this.bO)[life7_21])), ((float)(0x1.0p0f)));
    if (!((life4_5 == 0))) {
        lexicalValue1528_44_0 = spill1528_1;
        break lexical_join_44;
    }
    if (!((spill1528_1 <= 0))) {
        break lexical_join_45;
    }
    lexicalValue1528_44_0 = (life5_16 + (1 + ((java.util.Random)(this.ah)).nextInt(((int)(3)))));
    }
    life5_16 = lexicalValue1528_44_0;
    }
    life7_21 += 1;
    if (!((life4_5 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return life5_16;
    }
    lexicalValue1528_52_0 = this.bD;
    }
    return lexicalValue1528_52_0;
}


public net.minecraft.entity.ai.EntityLookHelper a__vt() {
return this.bE;
}


protected moom.AV a__sourceReturn_8101e02423(net.minecraft.world.World p0) {
return new moom.AW(this, p0);
}


public moom.Bj a__Bj() {
net.minecraft.entity.EntityLiving forwardValue4920_23_0;
    int spill4920_0;
    net.minecraft.entity.EntityLiving spill4920_1;
    long life1_3;
    java.util.UUID life4_7;
    int life3_8;
    forward_join_23: {
    forward_join_22: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 42056265147832L);
    spill4920_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life4_7 = ((net.minecraft.entity.EntityLiving)(this)).a__UUID();
    life3_8 = spill4920_0;
    spill4920_1 = this;
    if (!((life3_8 == 0))) {
        forwardValue4920_23_0 = spill4920_1;
        break forward_join_23;
    }
    if (!((((net.minecraft.entity.EntityLiving)(spill4920_1)).bU != life4_7))) {
        break forward_join_22;
    }
    this.bU = ((java.util.UUID)(life4_7));
    this.bV = ((java.lang.String)(((java.util.UUID)(life4_7)).toString()));
    }
    forwardValue4920_23_0 = this;
    }
    return ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(forwardValue4920_23_0)).i)).a__Bh())).c(((java.lang.String)(this.bV)));
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLiving)(this)).a__vE())).b(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c))))).a(((double)(0x1.0p4d)));
    return;
}


public boolean a(java.lang.Class<? extends net.minecraft.entity.EntityLivingBase> p0) {
long local2 = (net.minecraft.entity.EntityLiving.gb ^ 113421082194454L);
    return ((((p0 != net.minecraft.entity.monster.EntityGhast.class) ? 1 : 0)) != 0);
}


protected boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
return ((0) != 0);
}


public void a(boolean p0, boolean p1) {
int forwardValue4919_20_0;
    int forwardValue4919_35_0;
    int forwardValue4919_39_0;
    int forwardValue4919_47_0;
    net.minecraft.world.World forwardValue4919_50_0;
    boolean spill4919_0;
    boolean spill4919_1;
    net.minecraft.world.World spill4919_2;
    long life3_3;
    int life5_5;
    forward_join_60: {
    forward_join_50: {
    forward_join_47: {
    forward_join_39: {
    forward_join_35: {
    forward_join_32: {
    forward_join_20: {
    life3_3 = (net.minecraft.entity.EntityLiving.gb ^ 62888811820066L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4919_0 = this.bR;
    if (!((life5_5 == 0))) {
        forwardValue4919_20_0 = ((spill4919_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4919_0)) {
        break forward_join_60;
    }
    this.bR = ((boolean)(false));
    this.bS = ((net.minecraft.entity.Entity)(null));
    forwardValue4919_20_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue4919_35_0 = forwardValue4919_20_0;
        break forward_join_35;
    }
    if (!((forwardValue4919_20_0 == 0))) {
        break forward_join_32;
    }
    spill4919_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue4919_35_0 = ((spill4919_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill4919_1)) {
        break forward_join_32;
    }
    ((net.minecraft.entity.EntityLiving)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.b2)), ((int)(1)));
    }
    forwardValue4919_35_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue4919_39_0 = forwardValue4919_35_0;
        break forward_join_39;
    }
    if (!((forwardValue4919_35_0 == 0))) {
        break forward_join_60;
    }
    forwardValue4919_39_0 = ((p0) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue4919_47_0 = forwardValue4919_39_0;
        break forward_join_47;
    }
    if (!((forwardValue4919_39_0 != 0))) {
        break forward_join_60;
    }
    spill4919_2 = this.i;
    if (!((life5_5 == 0))) {
        forwardValue4919_50_0 = spill4919_2;
        break forward_join_50;
    }
    forwardValue4919_47_0 = ((spill4919_2 instanceof net.minecraft.world.WorldServer) ? 1 : 0);
    }
    if (!((forwardValue4919_47_0 != 0))) {
        break forward_join_60;
    }
    forwardValue4919_50_0 = this.i;
    }
    ((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(forwardValue4919_50_0)))).a__t2())).a(((net.minecraft.entity.Entity)(this)), ((moom.yK)(new moom.zU(1, this, null))));
    }
    return;
}


public net.minecraft.entity.ai.EntityMoveHelper a__vu() {
return this.bF;
}


public void a(net.minecraft.entity.Entity p0, boolean p1) {
int forwardValue4914_19_0;
    int forwardValue4914_27_0;
    net.minecraft.world.World forwardValue4914_30_0;
    int spill4914_0;
    boolean spill4914_1;
    net.minecraft.world.World spill4914_2;
    long life3_3;
    int life5_11;
    forward_join_41: {
    forward_join_30: {
    forward_join_27: {
    forward_join_19: {
    life3_3 = (net.minecraft.entity.EntityLiving.gb ^ 69857600629369L);
    this.bR = ((boolean)(true));
    spill4914_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    this.bS = ((net.minecraft.entity.Entity)(p0));
    life5_11 = spill4914_0;
    spill4914_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_11 == 0))) {
        forwardValue4914_19_0 = ((spill4914_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4914_1))) {
        break forward_join_41;
    }
    forwardValue4914_19_0 = ((p1) ? 1 : 0);
    }
    if (!((life5_11 == 0))) {
        forwardValue4914_27_0 = forwardValue4914_19_0;
        break forward_join_27;
    }
    if (!((forwardValue4914_19_0 != 0))) {
        break forward_join_41;
    }
    spill4914_2 = this.i;
    if (!((life5_11 == 0))) {
        forwardValue4914_30_0 = spill4914_2;
        break forward_join_30;
    }
    forwardValue4914_27_0 = ((spill4914_2 instanceof net.minecraft.world.WorldServer) ? 1 : 0);
    }
    if (!((forwardValue4914_27_0 != 0))) {
        break forward_join_41;
    }
    forwardValue4914_30_0 = this.i;
    }
    ((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(forwardValue4914_30_0)))).a__t2())).a(((net.minecraft.entity.Entity)(this)), ((moom.yK)(new moom.zU(1, this, this.bS))));
    }
    return;
}


private float a__sourceReturn_ef9a6720f7(float p0, float p1, float p2) {
int forwardValue4910_25_0;
    float forwardValue4910_31_0;
    float forwardValue4910_31_1;
    int spill4910_0;
    int spill4910_1;
    float spill4910_2;
    float spill4910_3;
    long life4_3;
    float life7_9;
    int life6_10;
    forward_join_31: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    life4_3 = (net.minecraft.entity.EntityLiving.gb ^ 18138904411301L);
    spill4910_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life7_9 = moom.Dr.e(((float)((p1 - p0))));
    life6_10 = spill4910_0;
    spill4910_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_9)), ((float)(p2)));
    if (!((life6_10 == 0))) {
        forwardValue4910_25_0 = spill4910_1;
        break forward_join_25;
    }
    if (!((spill4910_1 > 0))) {
        break forward_join_19;
    }
    life7_9 = p2;
    }
    spill4910_2 = life7_9;
    spill4910_3 = (-p2);
    if (!((life6_10 == 0))) {
        forwardValue4910_31_0 = spill4910_2;
        forwardValue4910_31_1 = spill4910_3;
        break forward_join_31;
    }
    forwardValue4910_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill4910_2)), ((float)(spill4910_3)));
    }
    if (!((forwardValue4910_25_0 < 0))) {
        break forward_join_29;
    }
    life7_9 = (-p2);
    }
    forwardValue4910_31_0 = p0;
    forwardValue4910_31_1 = life7_9;
    }
    return (forwardValue4910_31_0 + forwardValue4910_31_1);
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2) {
net.minecraft.entity.Entity forwardValue4913_43_0;
    int spill4913_0;
    net.minecraft.entity.Entity spill4913_1;
    long life4_3;
    double life7_9;
    double life9_16;
    int life6_17;
    net.minecraft.entity.EntityLivingBase life13_28;
    double life11_42;
    double life13_74;
    float life15_85;
    float life16_95;
    forward_join_59: {
    forward_join_43: {
    forward_join_42: {
    life4_3 = (net.minecraft.entity.EntityLiving.gb ^ 106612933437860L);
    life7_9 = (((net.minecraft.entity.Entity)(p0)).n - this.n);
    spill4913_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life9_16 = (((net.minecraft.entity.Entity)(p0)).p - this.p);
    life6_17 = spill4913_0;
    spill4913_1 = p0;
    if (!((life6_17 != 0))) {
        forwardValue4913_43_0 = spill4913_1;
        break forward_join_43;
    }
    if (!((((spill4913_1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_42;
    }
    life13_28 = ((net.minecraft.entity.EntityLivingBase)(p0));
    life11_42 = ((((net.minecraft.entity.EntityLivingBase)(life13_28)).o + ((double) __sourceExactCall_f4e7fff2f8c1c1(((net.minecraft.entity.EntityLivingBase)(life13_28))))) - (this.o + ((double) __sourceExactCall_41c71eb6078f5d(((net.minecraft.entity.EntityLiving)(this))))));
    if (!((life6_17 == 0))) {
        break forward_join_59;
    }
    }
    forwardValue4913_43_0 = p0;
    }
    life11_42 = (((((moom.CA)(((net.minecraft.entity.Entity)(forwardValue4913_43_0)).b())).c + ((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).f) / 0x1.0p1d) - (this.o + ((double) __sourceExactCall_41c71eb6078f5d(((net.minecraft.entity.EntityLiving)(this))))));
    }
    life13_74 = ((double) moom.Dr.a__Float(((double)(((life7_9 * life7_9) + (life9_16 * life9_16))))));
    life15_85 = (((float) ((moom.Dr.b(((double)(life9_16)), ((double)(life7_9))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)) - 0x1.68p6f);
    life16_95 = ((float) (-((moom.Dr.b(((double)(life11_42)), ((double)(life13_74))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)));
    this.x = ((float)(((net.minecraft.entity.EntityLiving)(this)).a__sourceReturn_ef9a6720f7(((float)(this.x)), ((float)(life16_95)), ((float)(p2)))));
    this.w = ((float)(((net.minecraft.entity.EntityLiving)(this)).a__sourceReturn_ef9a6720f7(((float)(this.w)), ((float)(life15_85)), ((float)(p1)))));
    return;
}


protected net.minecraft.item.Item a__wQ() {
return null;
}


protected boolean a__Boolean(net.minecraft.item.ItemStack p0) {
return ((1) != 0);
}


protected void a(net.minecraft.entity.item.EntityItem p0) {
int forwardValue4915_18_0;
    net.minecraft.item.Item forwardValue4915_47_0;
    int forwardValue4915_84_0;
    int forwardValue4915_86_0;
    int forwardValue4915_91_0;
    int forwardValue4915_103_0;
    int forwardValue4915_107_0;
    int forwardValue4915_109_0;
    int forwardValue4915_115_0;
    int forwardValue4915_131_0;
    int forwardValue4915_135_0;
    int forwardValue4915_137_0;
    int forwardValue4915_141_0;
    int forwardValue4915_149_0;
    net.minecraft.item.Item forwardValue4915_162_0;
    int forwardValue4915_197_0;
    int forwardValue4915_199_0;
    int forwardValue4915_208_0;
    int forwardValue4915_208_1;
    int forwardValue4915_216_0;
    int forwardValue4915_220_0;
    int forwardValue4915_222_0;
    int forwardValue4915_226_0;
    int forwardValue4915_234_0;
    net.minecraft.entity.EntityLiving forwardValue4915_253_0;
    net.minecraft.item.ItemStack forwardValue4915_258_0;
    net.minecraft.entity.item.EntityItem forwardValue4915_296_0;
    int spill4915_0;
    int spill4915_1;
    int spill4915_2;
    net.minecraft.item.Item spill4915_3;
    net.minecraft.item.Item spill4915_4;
    int spill4915_5;
    int spill4915_6;
    int spill4915_7;
    int spill4915_8;
    boolean spill4915_9;
    int spill4915_10;
    boolean spill4915_11;
    net.minecraft.item.Item spill4915_12;
    net.minecraft.item.Item spill4915_13;
    int spill4915_14;
    int spill4915_15;
    int spill4915_16;
    int spill4915_17;
    int spill4915_18;
    int spill4915_19;
    boolean spill4915_20;
    int spill4915_21;
    net.minecraft.item.ItemStack spill4915_22;
    net.minecraft.entity.EntityLiving spill4915_23;
    net.minecraft.entity.item.EntityItem spill4915_24;
    long life2_3;
    net.minecraft.item.ItemStack life5_7;
    int life4_8;
    int life6_11;
    int life7_24;
    net.minecraft.item.ItemStack life8_28;
    net.minecraft.item.Item life13_74;
    moom.xP life11_85;
    net.minecraft.item.Item life13_88;
    moom.xP life12_99;
    net.minecraft.item.Item life11_264;
    net.minecraft.item.ItemArmor life9_275;
    net.minecraft.item.Item life11_278;
    net.minecraft.item.ItemArmor life10_289;
    net.minecraft.entity.player.EntityPlayer life9_439;
    forward_join_297: {
    forward_join_296: {
    forward_join_295: {
    forward_join_279: {
    forward_join_258: {
    forward_join_257: {
    forward_join_253: {
    forward_join_234: {
    forward_join_227: {
    forward_join_226: {
    forward_join_225: {
    forward_join_222: {
    forward_join_221: {
    forward_join_220: {
    forward_join_219: {
    forward_join_216: {
    forward_join_208: {
    forward_join_202: {
    forward_join_199: {
    forward_join_198: {
    forward_join_197: {
    forward_join_162: {
    forward_join_160: {
    forward_join_149: {
    forward_join_144: {
    forward_join_141: {
    forward_join_140: {
    forward_join_137: {
    forward_join_136: {
    forward_join_135: {
    forward_join_131: {
    forward_join_115: {
    forward_join_112: {
    forward_join_109: {
    forward_join_108: {
    forward_join_107: {
    forward_join_106: {
    forward_join_103: {
    forward_join_91: {
    forward_join_89: {
    forward_join_86: {
    forward_join_85: {
    forward_join_84: {
    forward_join_47: {
    forward_join_45: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 130773882858499L);
    spill4915_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life5_7 = ((net.minecraft.entity.item.EntityItem)(p0)).a__xW();
    life4_8 = spill4915_0;
    life6_11 = __sourceExactCall_f21b3836e04476(((net.minecraft.item.ItemStack)(life5_7)));
    spill4915_1 = life6_11;
    if (!((life4_8 != 0))) {
        forwardValue4915_18_0 = spill4915_1;
        break forward_join_18;
    }
    if (!((spill4915_1 > -1))) {
        break forward_join_297;
    }
    forwardValue4915_18_0 = 1;
    }
    life7_24 = forwardValue4915_18_0;
    life8_28 = ((net.minecraft.entity.EntityLiving)(this)).a__xW(((int)(life6_11)));
    if (!((life8_28 != null))) {
        break forward_join_227;
    }
    spill4915_2 = life6_11;
    if (!((life4_8 != 0))) {
        forwardValue4915_149_0 = spill4915_2;
        break forward_join_149;
    }
    if (!((spill4915_2 == 0))) {
        break forward_join_144;
    }
    spill4915_3 = ((net.minecraft.item.ItemStack)(life5_7)).a__wQ();
    if (!((life4_8 != 0))) {
        forwardValue4915_47_0 = spill4915_3;
        break forward_join_47;
    }
    if (!((((spill4915_3 instanceof moom.xP) ? 1 : 0) != 0))) {
        break forward_join_45;
    }
    spill4915_4 = ((net.minecraft.item.ItemStack)(life8_28)).a__wQ();
    if (!((life4_8 != 0))) {
        forwardValue4915_47_0 = spill4915_4;
        break forward_join_47;
    }
    if (!((((spill4915_4 instanceof moom.xP) ? 1 : 0) == 0))) {
        break forward_join_45;
    }
    life7_24 = 1;
    if (!((life4_8 == 0))) {
        break forward_join_227;
    }
    }
    forwardValue4915_47_0 = ((net.minecraft.item.ItemStack)(life5_7)).a__wQ();
    }
    life13_74 = forwardValue4915_47_0;
    spill4915_5 = ((life13_74 instanceof moom.xP) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forwardValue4915_115_0 = spill4915_5;
        break forward_join_115;
    }
    if (!((spill4915_5 != 0))) {
        break forward_join_112;
    }
    life11_85 = ((moom.xP)(life13_74));
    life13_88 = ((net.minecraft.item.ItemStack)(life8_28)).a__wQ();
    spill4915_6 = ((life13_88 instanceof moom.xP) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forwardValue4915_115_0 = spill4915_6;
        break forward_join_115;
    }
    if (!((spill4915_6 != 0))) {
        break forward_join_112;
    }
    life12_99 = ((moom.xP)(life13_88));
    spill4915_7 = recovery.source.CarrierOps.fcmpl(((float)(((moom.xP)(life11_85)).a__sourceReturn_bc607678b6())), ((float)(((moom.xP)(life12_99)).a__sourceReturn_bc607678b6())));
    if (!((life4_8 != 0))) {
        forwardValue4915_91_0 = spill4915_7;
        break forward_join_91;
    }
    if (!((spill4915_7 != 0))) {
        break forward_join_89;
    }
    spill4915_8 = recovery.source.CarrierOps.fcmpl(((float)(((moom.xP)(life11_85)).a__sourceReturn_bc607678b6())), ((float)(((moom.xP)(life12_99)).a__sourceReturn_bc607678b6())));
    if (!((life4_8 != 0))) {
        forwardValue4915_84_0 = spill4915_8;
        break forward_join_84;
    }
    if (!((spill4915_8 > 0))) {
        break forward_join_85;
    }
    forwardValue4915_84_0 = 1;
    }
    forwardValue4915_86_0 = forwardValue4915_84_0;
    break forward_join_86;
    }
    forwardValue4915_86_0 = 0;
    }
    life7_24 = forwardValue4915_86_0;
    if (!((life4_8 == 0))) {
        break forward_join_227;
    }
    }
    forwardValue4915_91_0 = ((net.minecraft.item.ItemStack)(life5_7)).c();
    }
    if (!((life4_8 != 0))) {
        forwardValue4915_107_0 = forwardValue4915_91_0;
        break forward_join_107;
    }
    if (!((forwardValue4915_91_0 <= ((net.minecraft.item.ItemStack)(life8_28)).c()))) {
        break forward_join_106;
    }
    spill4915_9 = ((net.minecraft.item.ItemStack)(life5_7)).e__Boolean();
    if (!((life4_8 != 0))) {
        forwardValue4915_103_0 = ((spill4915_9) ? 1 : 0);
        break forward_join_103;
    }
    if (!(spill4915_9)) {
        break forward_join_108;
    }
    forwardValue4915_103_0 = ((((net.minecraft.item.ItemStack)(life8_28)).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forwardValue4915_107_0 = forwardValue4915_103_0;
        break forward_join_107;
    }
    if (!((forwardValue4915_103_0 == 0))) {
        break forward_join_108;
    }
    }
    forwardValue4915_107_0 = 1;
    }
    forwardValue4915_109_0 = forwardValue4915_107_0;
    break forward_join_109;
    }
    forwardValue4915_109_0 = 0;
    }
    life7_24 = forwardValue4915_109_0;
    if (!((life4_8 == 0))) {
        break forward_join_227;
    }
    }
    forwardValue4915_115_0 = ((((net.minecraft.item.ItemStack)(life5_7)).a__wQ() instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forwardValue4915_141_0 = forwardValue4915_115_0;
        break forward_join_141;
    }
    if (!((forwardValue4915_115_0 != 0))) {
        break forward_join_140;
    }
    spill4915_10 = ((((net.minecraft.item.ItemStack)(life8_28)).a__wQ() instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forwardValue4915_141_0 = spill4915_10;
        break forward_join_141;
    }
    if (!((spill4915_10 != 0))) {
        break forward_join_140;
    }
    spill4915_11 = ((net.minecraft.item.ItemStack)(life5_7)).e__Boolean();
    if (!((life4_8 != 0))) {
        forwardValue4915_131_0 = ((spill4915_11) ? 1 : 0);
        break forward_join_131;
    }
    if (!(spill4915_11)) {
        break forward_join_136;
    }
    forwardValue4915_131_0 = ((((net.minecraft.item.ItemStack)(life8_28)).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forwardValue4915_135_0 = forwardValue4915_131_0;
        break forward_join_135;
    }
    if (!((forwardValue4915_131_0 == 0))) {
        break forward_join_136;
    }
    forwardValue4915_135_0 = 1;
    }
    forwardValue4915_137_0 = forwardValue4915_135_0;
    break forward_join_137;
    }
    forwardValue4915_137_0 = 0;
    }
    life7_24 = forwardValue4915_137_0;
    if (!((life4_8 == 0))) {
        break forward_join_227;
    }
    }
    forwardValue4915_141_0 = 0;
    }
    life7_24 = forwardValue4915_141_0;
    if (!((life4_8 == 0))) {
        break forward_join_227;
    }
    }
    spill4915_12 = ((net.minecraft.item.ItemStack)(life5_7)).a__wQ();
    if (!((life4_8 != 0))) {
        forwardValue4915_162_0 = spill4915_12;
        break forward_join_162;
    }
    forwardValue4915_149_0 = ((spill4915_12 instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    }
    if (!((forwardValue4915_149_0 != 0))) {
        break forward_join_160;
    }
    spill4915_13 = ((net.minecraft.item.ItemStack)(life8_28)).a__wQ();
    if (!((life4_8 != 0))) {
        forwardValue4915_162_0 = spill4915_13;
        break forward_join_162;
    }
    if (!((((spill4915_13 instanceof net.minecraft.item.ItemArmor) ? 1 : 0) == 0))) {
        break forward_join_160;
    }
    life7_24 = 1;
    if (!((life4_8 == 0))) {
        break forward_join_227;
    }
    }
    forwardValue4915_162_0 = ((net.minecraft.item.ItemStack)(life5_7)).a__wQ();
    }
    life11_264 = forwardValue4915_162_0;
    spill4915_14 = ((life11_264 instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forwardValue4915_226_0 = spill4915_14;
        break forward_join_226;
    }
    if (!((spill4915_14 != 0))) {
        break forward_join_225;
    }
    life9_275 = ((net.minecraft.item.ItemArmor)(life11_264));
    life11_278 = ((net.minecraft.item.ItemStack)(life8_28)).a__wQ();
    spill4915_15 = ((life11_278 instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forwardValue4915_226_0 = spill4915_15;
        break forward_join_226;
    }
    if (!((spill4915_15 != 0))) {
        break forward_join_225;
    }
    life10_289 = ((net.minecraft.item.ItemArmor)(life11_278));
    spill4915_16 = ((net.minecraft.item.ItemArmor)(life9_275)).r;
    spill4915_17 = ((net.minecraft.item.ItemArmor)(life10_289)).r;
    if (!((life4_8 != 0))) {
        forwardValue4915_208_0 = spill4915_16;
        forwardValue4915_208_1 = spill4915_17;
        break forward_join_208;
    }
    if (!((spill4915_16 != spill4915_17))) {
        break forward_join_202;
    }
    spill4915_18 = ((net.minecraft.item.ItemArmor)(life9_275)).r;
    if (!((life4_8 != 0))) {
        forwardValue4915_197_0 = spill4915_18;
        break forward_join_197;
    }
    if (!((spill4915_18 > ((net.minecraft.item.ItemArmor)(life10_289)).r))) {
        break forward_join_198;
    }
    forwardValue4915_197_0 = 1;
    }
    forwardValue4915_199_0 = forwardValue4915_197_0;
    break forward_join_199;
    }
    forwardValue4915_199_0 = 0;
    }
    life7_24 = forwardValue4915_199_0;
    if (!((life4_8 == 0))) {
        break forward_join_227;
    }
    }
    spill4915_19 = ((net.minecraft.item.ItemStack)(life5_7)).c();
    if (!((life4_8 != 0))) {
        forwardValue4915_220_0 = spill4915_19;
        break forward_join_220;
    }
    forwardValue4915_208_0 = spill4915_19;
    forwardValue4915_208_1 = ((net.minecraft.item.ItemStack)(life8_28)).c();
    }
    if (!((forwardValue4915_208_0 <= forwardValue4915_208_1))) {
        break forward_join_219;
    }
    spill4915_20 = ((net.minecraft.item.ItemStack)(life5_7)).e__Boolean();
    if (!((life4_8 != 0))) {
        forwardValue4915_216_0 = ((spill4915_20) ? 1 : 0);
        break forward_join_216;
    }
    if (!(spill4915_20)) {
        break forward_join_221;
    }
    forwardValue4915_216_0 = ((((net.minecraft.item.ItemStack)(life8_28)).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forwardValue4915_220_0 = forwardValue4915_216_0;
        break forward_join_220;
    }
    if (!((forwardValue4915_216_0 == 0))) {
        break forward_join_221;
    }
    }
    forwardValue4915_220_0 = 1;
    }
    forwardValue4915_222_0 = forwardValue4915_220_0;
    break forward_join_222;
    }
    forwardValue4915_222_0 = 0;
    }
    life7_24 = forwardValue4915_222_0;
    if (!((life4_8 == 0))) {
        break forward_join_227;
    }
    }
    forwardValue4915_226_0 = 0;
    }
    life7_24 = forwardValue4915_226_0;
    }
    spill4915_21 = life7_24;
    if (!((life4_8 != 0))) {
        forwardValue4915_234_0 = spill4915_21;
        break forward_join_234;
    }
    if (!((spill4915_21 != 0))) {
        break forward_join_297;
    }
    forwardValue4915_234_0 = ((((net.minecraft.entity.EntityLiving)(this)).a__Boolean(((net.minecraft.item.ItemStack)(life5_7)))) ? 1 : 0);
    }
    if (!((forwardValue4915_234_0 != 0))) {
        break forward_join_297;
    }
    spill4915_22 = life8_28;
    if (!((life4_8 != 0))) {
        forwardValue4915_258_0 = spill4915_22;
        break forward_join_258;
    }
    if (!((spill4915_22 != null))) {
        break forward_join_257;
    }
    spill4915_23 = this;
    if (!((life4_8 != 0))) {
        forwardValue4915_253_0 = spill4915_23;
        break forward_join_253;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)((((java.util.Random)(((net.minecraft.entity.EntityLiving)(spill4915_23)).ah)).nextFloat() - 0x1.99999ap-4f))), ((float)((this.bO)[life6_11]))) < 0))) {
        break forward_join_257;
    }
    forwardValue4915_253_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(forwardValue4915_253_0)).a(((net.minecraft.item.ItemStack)(life8_28)), ((float)(0x0.0p0f)));
    }
    forwardValue4915_258_0 = life5_7;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4915_258_0)).a__wQ() == net.minecraft.init.Items.i))) {
        break forward_join_279;
    }
    spill4915_24 = p0;
    if (!((life4_8 != 0))) {
        forwardValue4915_296_0 = spill4915_24;
        break forward_join_296;
    }
    if (!((((net.minecraft.entity.item.EntityItem)(spill4915_24)).c__sourceReturn_0e30dfc966() != null))) {
        break forward_join_279;
    }
    life9_439 = ((net.minecraft.world.World)(this.i)).a__tn(((java.lang.String)(((net.minecraft.entity.item.EntityItem)(p0)).c__sourceReturn_0e30dfc966())));
    if (!((life4_8 != 0))) {
        break forward_join_295;
    }
    if (!((life9_439 != null))) {
        break forward_join_279;
    }
    ((net.minecraft.entity.player.EntityPlayer)(life9_439)).a(((moom.BY)(net.minecraft.stats.AchievementList.x)));
    }
    ((net.minecraft.entity.EntityLiving)(this)).b(((int)(life6_11)), ((net.minecraft.item.ItemStack)(life5_7)));
    (this.bO)[life6_11] = 0x1.0p1f;
    this.bQ = ((boolean)(true));
    ((net.minecraft.entity.EntityLiving)(this)).b(((net.minecraft.entity.Entity)(p0)), ((int)(1)));
    }
    forwardValue4915_296_0 = p0;
    }
    ((net.minecraft.entity.item.EntityItem)(forwardValue4915_296_0)).f__Void();
    }
    return;
}


protected float a__sourceReturn_e70c882bc6(float p0, float p1) {
((moom.tY)(this.bH)).a();
    return p1;
}


public net.minecraft.item.ItemStack[] a__ArrayxW() {
return this.bN;
}


public net.minecraft.entity.ai.EntitySenses a__vz() {
return this.bM;
}


public net.minecraft.item.ItemStack a__xW() {
return (this.bN)[0];
}


public void a(byte p0) {
long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 6184569660781L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    if (!((life4_5 == 0))) { break forward_join_17; }
    if (!((p0 == __sourceIntrinsic_6121ff5511c4_invokedynamic5546_2(30594, (7950623666701859857L ^ life2_3))))) { break forward_join_19; }
    ((net.minecraft.entity.EntityLiving)(this)).P();
    }
    if (!((life4_5 != 0))) { break forward_join_22; }
    }
    super.a(((byte)(p0)));
    }
    return;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return (this.bN)[p0];
}


public int m__Int() {
long local1 = (net.minecraft.entity.EntityLiving.gb ^ 79015082428140L);
    return __sourceIntrinsic_a55dda021a68_originalDynamicSite1877_1(23343, (6267348423657435940L ^ local1));
}


public float k() {
return 0x1.0p0f;
}


public static void k(boolean p0) {
bW = ((boolean)(p0));
    return;
}


public void g__Void() {
int forwardValue4927_26_0;
    net.minecraft.entity.EntityLiving forwardValue4927_28_0;
    boolean spill4927_0;
    boolean spill4927_1;
    net.minecraft.entity.EntityLiving spill4927_2;
    long life1_3;
    int life3_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_26: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 38754409520712L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4927_0 = moom.BU.ar();
    if (!((life3_5 != 0))) {
        forwardValue4927_26_0 = ((spill4927_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill4927_0)) {
        break forward_join_19;
    }
    spill4927_1 = ((net.minecraft.entity.EntityLiving)(this)).V__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4927_26_0 = ((spill4927_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill4927_1)) {
        break forward_join_19;
    }
    ((net.minecraft.entity.EntityLiving)(this)).V();
    if (!((life3_5 == 0))) {
        break forward_join_29;
    }
    }
    super.g__Void();
    spill4927_2 = this;
    if (!((life3_5 != 0))) {
        forwardValue4927_28_0 = spill4927_2;
        break forward_join_28;
    }
    forwardValue4927_26_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(spill4927_2)).i)).G) ? 1 : 0);
    }
    if (!((forwardValue4927_26_0 == 0))) {
        break forward_join_29;
    }
    forwardValue4927_28_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(forwardValue4927_28_0)).T();
    }
    return;
}


public void j(boolean p0) {
net.minecraft.entity.DataWatcher forwardValue4930_18_0;
    int forwardValue4930_18_1;
    int forwardValue4930_18_2;
    net.minecraft.entity.DataWatcher forwardValue4930_19_0;
    int forwardValue4930_19_1;
    net.minecraft.entity.DataWatcher forwardValue4930_20_0;
    int forwardValue4930_20_1;
    int forwardValue4930_20_2;
    net.minecraft.entity.DataWatcher spill4930_0;
    int spill4930_1;
    boolean spill4930_2;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.EntityLiving.gb ^ 57676992387356L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4930_0 = this.al;
    spill4930_1 = __sourceIntrinsic_b5913f5f2202_invokedynamic4930_3(15977, (6137926607211022729L ^ life2_3));
    spill4930_2 = p0;
    if (!((life4_5 == 0))) {
        forwardValue4930_18_0 = spill4930_0;
        forwardValue4930_18_1 = spill4930_1;
        forwardValue4930_18_2 = ((spill4930_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4930_2)) {
        forwardValue4930_19_0 = spill4930_0;
        forwardValue4930_19_1 = spill4930_1;
        break forward_join_19;
    }
    forwardValue4930_18_0 = spill4930_0;
    forwardValue4930_18_1 = spill4930_1;
    forwardValue4930_18_2 = 1;
    }
    forwardValue4930_20_0 = forwardValue4930_18_0;
    forwardValue4930_20_1 = forwardValue4930_18_1;
    forwardValue4930_20_2 = forwardValue4930_18_2;
    break forward_join_20;
    }
    forwardValue4930_20_0 = forwardValue4930_19_0;
    forwardValue4930_20_1 = forwardValue4930_19_1;
    forwardValue4930_20_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue4930_20_0)).b(((int)(forwardValue4930_20_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue4930_20_2)))))));
    return;
}


public boolean U__Boolean() {
int forwardValue4907_18_0;
    int forwardValue4907_20_0;
    byte spill4907_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 96981791210594L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4907_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_b3e1a2d723a8_invokedynamic4907_3(19654, (2286152145311620691L ^ life1_3)))));
    if (!((life3_5 == 0))) {
        forwardValue4907_18_0 = ((int)(spill4907_0));
        break forward_join_18;
    }
    if (!((spill4907_0 != 0))) {
        break forward_join_19;
    }
    forwardValue4907_18_0 = 1;
    }
    forwardValue4907_20_0 = forwardValue4907_18_0;
    break forward_join_20;
    }
    forwardValue4907_20_0 = 0;
    }
    return ((forwardValue4907_20_0) != 0);
}


private void U() {
int lexicalValue1526_92_0;
    net.minecraft.entity.EntityLiving lexicalValue1526_153_0;
    net.minecraft.entity.EntityLiving lexicalValue1526_157_0;
    net.minecraft.entity.EntityLiving spill1526_0;
    net.minecraft.entity.EntityLiving spill1526_1;
    boolean spill1526_2;
    boolean spill1526_3;
    net.minecraft.entity.EntityLiving spill1526_4;
    net.minecraft.entity.EntityLiving spill1526_5;
    net.minecraft.entity.EntityLiving spill1526_6;
    long life1_3;
    int life3_5;
    java.util.UUID life4_64;
    java.util.Iterator life5_76;
    net.minecraft.entity.EntityLivingBase life6_83;
    moom.DT life4_183;
    moom.sD life5_188;
    lexical_join_159: {
    lexical_join_157: {
    lexical_join_156: {
    lexical_join_153: {
    lexical_join_152: {
    lexical_join_150: {
    lexical_join_147: {
    lexical_join_92: {
    lexical_join_81: {
    lexical_join_79: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 56722896719722L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill1526_0 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1526_157_0 = spill1526_0;
        break lexical_join_157;
    }
    if (!(((net.minecraft.entity.EntityLiving)(spill1526_0)).bR)) {
        break lexical_join_156;
    }
    spill1526_1 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1526_157_0 = spill1526_1;
        break lexical_join_157;
    }
    if (!((((net.minecraft.entity.EntityLiving)(spill1526_1)).bT != null))) {
        break lexical_join_156;
    }
    spill1526_2 = ((net.minecraft.nbt.NBTTagCompound)(this.bT)).a__Boolean(((java.lang.String)("UUIDMost")), ((int)(4)));
    if (!((life3_5 == 0))) {
        lexicalValue1526_92_0 = ((spill1526_2) ? 1 : 0);
        break lexical_join_92;
    }
    if (!(spill1526_2)) {
        break lexical_join_81;
    }
    spill1526_3 = ((net.minecraft.nbt.NBTTagCompound)(this.bT)).a__Boolean(((java.lang.String)("UUIDLeast")), ((int)(4)));
    if (!((life3_5 == 0))) {
        lexicalValue1526_92_0 = ((spill1526_3) ? 1 : 0);
        break lexical_join_92;
    }
    if (!(spill1526_3)) {
        break lexical_join_81;
    }
    life4_64 = new java.util.UUID(((net.minecraft.nbt.NBTTagCompound)(this.bT)).a__Long(((java.lang.String)("UUIDMost"))), ((net.minecraft.nbt.NBTTagCompound)(this.bT)).a__Long(((java.lang.String)("UUIDLeast"))));
    life5_76 = ((java.util.List)(((net.minecraft.world.World)(this.i)).a(((java.lang.Class)(net.minecraft.entity.EntityLivingBase.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.EntityLiving)(this)).b())).b(((double)(0x1.4p3d)), ((double)(0x1.4p3d)), ((double)(0x1.4p3d)))))))).iterator();
    lexical_cycle_56: while (true) {
    lexical_join_77: {
    lexical_join_75: {
    if (!(((java.util.Iterator)(life5_76)).hasNext())) {
        break lexical_join_79;
    }
    life6_83 = ((net.minecraft.entity.EntityLivingBase)(((java.util.Iterator)(life5_76)).next()));
    if (!((life3_5 == 0))) {
        break lexical_join_159;
    }
    if (!((life3_5 == 0))) {
        break lexical_join_75;
    }
    if (!(((java.util.UUID)(((net.minecraft.entity.EntityLivingBase)(life6_83)).a__UUID())).equals(((java.lang.Object)(life4_64))))) {
        break lexical_join_77;
    }
    this.bS = ((net.minecraft.entity.Entity)(life6_83));
    }
    if (!((life3_5 != 0))) {
        break lexical_join_79;
    }
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_56; }
    break lexical_cycle_56;
    }
    }
    if (!((life3_5 != 0))) {
        break lexical_join_156;
    }
    }
    spill1526_4 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1526_153_0 = spill1526_4;
        break lexical_join_153;
    }
    lexicalValue1526_92_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.entity.EntityLiving)(spill1526_4)).bT)).a__Boolean(((java.lang.String)("X")), ((int)(__sourceIntrinsic_31f9c3d4f601_invokedynamic1526_27(20043, (4279883298904453084L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((lexicalValue1526_92_0 != 0))) {
        break lexical_join_152;
    }
    spill1526_5 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1526_153_0 = spill1526_5;
        break lexical_join_153;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.entity.EntityLiving)(spill1526_5)).bT)).a__Boolean(((java.lang.String)("Y")), ((int)(__sourceIntrinsic_31f9c3d4f601_invokedynamic1526_31(20043, (4279883298904453084L ^ life1_3))))))) {
        break lexical_join_152;
    }
    spill1526_6 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1526_153_0 = spill1526_6;
        break lexical_join_153;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.entity.EntityLiving)(spill1526_6)).bT)).a__Boolean(((java.lang.String)("Z")), ((int)(__sourceIntrinsic_31f9c3d4f601_invokedynamic1526_34(20043, (4279883298904453084L ^ life1_3))))))) {
        break lexical_join_152;
    }
    life4_183 = new moom.DT(((net.minecraft.nbt.NBTTagCompound)(this.bT)).a__Int(((java.lang.String)("X"))), ((net.minecraft.nbt.NBTTagCompound)(this.bT)).a__Int(((java.lang.String)("Y"))), ((net.minecraft.nbt.NBTTagCompound)(this.bT)).a__Int(((java.lang.String)("Z"))));
    life5_188 = __sourceExactCall_f69d4e9671f191(((net.minecraft.world.World)(this.i)), ((moom.DT)(life4_183)));
    if (!((life3_5 == 0))) {
        break lexical_join_150;
    }
    if (!((life5_188 == null))) {
        break lexical_join_147;
    }
    life5_188 = __sourceExactCall_33b38c64c634b6(((net.minecraft.world.World)(this.i)), ((moom.DT)(life4_183)));
    }
    this.bS = ((net.minecraft.entity.Entity)(life5_188));
    }
    if (!((life3_5 != 0))) {
        break lexical_join_156;
    }
    }
    lexicalValue1526_153_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(lexicalValue1526_153_0)).a(((boolean)(false)), ((boolean)(true)));
    }
    lexicalValue1526_157_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(lexicalValue1526_157_0)).bT = ((net.minecraft.nbt.NBTTagCompound)(null));
    }
    return;
}


public boolean L__Boolean() {
int forwardValue4900_13_0;
    int forwardValue4900_17_0;
    int forwardValue4900_19_0;
    boolean spill4900_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 90395455621628L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4900_0 = super.L__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4900_13_0 = ((spill4900_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill4900_0)) {
        break forward_join_18;
    }
    forwardValue4900_13_0 = ((((net.minecraft.entity.EntityLiving)(this)).U__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4900_17_0 = forwardValue4900_13_0;
        break forward_join_17;
    }
    if (!((forwardValue4900_13_0 == 0))) {
        break forward_join_18;
    }
    forwardValue4900_17_0 = 1;
    }
    forwardValue4900_19_0 = forwardValue4900_17_0;
    break forward_join_19;
    }
    forwardValue4900_19_0 = 0;
    }
    return ((forwardValue4900_19_0) != 0);
}


public boolean N__Boolean() {
return ((1) != 0);
}


public void N() {
return;
}


protected boolean M() {
return ((1) != 0);
}


public void P() {
net.minecraft.world.World lexicalValue1525_113_0;
    net.minecraft.world.World spill1525_0;
    long life1_3;
    int life3_5;
    int life4_16;
    double life5_29;
    double life7_35;
    double life9_41;
    double life11_43;
    lexical_join_120: {
    lexical_join_113: {
    lexical_join_111: {
    lexical_join_109: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 90092766590993L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill1525_0 = this.i;
    if (!((life3_5 == 0))) {
        lexicalValue1525_113_0 = spill1525_0;
        break lexical_join_113;
    }
    if (!(((net.minecraft.world.World)(spill1525_0)).G)) {
        break lexical_join_111;
    }
    life4_16 = 0;
    lexical_cycle_14: while (true) {
    if (!((life4_16 < __sourceIntrinsic_44bfa09b42f9_invokedynamic1525_4(30594, (7950575686116794733L ^ life1_3))))) {
        break lexical_join_109;
    }
    life5_29 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life7_35 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life9_41 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life11_43 = 0x1.4p3d;
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_NORMAL)), ((double)((((this.n + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)) - (life5_29 * life11_43)))), ((double)(((this.o + ((double) (((java.util.Random)(this.ah)).nextFloat() * this.H))) - (life7_35 * life11_43)))), ((double)((((this.p + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)) - (life9_41 * life11_43)))), ((double)(life5_29)), ((double)(life7_35)), ((double)(life9_41)), ((int[])(new int[0])));
    life4_16 += 1;
    if (!((life3_5 == 0))) {
        break lexical_join_120;
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    if (!((life3_5 != 0))) {
        break lexical_join_120;
    }
    }
    lexicalValue1525_113_0 = this.i;
    }
    ((net.minecraft.world.World)(lexicalValue1525_113_0)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_44bfa09b42f9_invokedynamic1525_29(30594, (7950575686116794733L ^ life1_3)))));
    }
    return;
}


public boolean P__Boolean() {
return ((0) != 0);
}


public static boolean X() {
int local0 = __sourceIntrinsic_booleanToInteger(net.minecraft.entity.EntityLiving.W());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


protected void T() {
net.minecraft.entity.EntityLiving forwardValue4905_14_0;
    int forwardValue4905_22_0;
    net.minecraft.entity.Entity forwardValue4905_31_0;
    net.minecraft.entity.EntityLiving forwardValue4905_39_0;
    net.minecraft.entity.EntityLiving spill4905_0;
    boolean spill4905_1;
    net.minecraft.entity.EntityLiving spill4905_2;
    net.minecraft.entity.EntityLiving spill4905_3;
    net.minecraft.entity.EntityLiving spill4905_4;
    long life1_3;
    int life3_5;
    forward_join_42: {
    forward_join_39: {
    forward_join_38: {
    forward_join_31: {
    forward_join_27: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 25948859144851L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4905_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue4905_14_0 = spill4905_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.entity.EntityLiving)(spill4905_0)).bT != null))) {
        break forward_join_13;
    }
    ((net.minecraft.entity.EntityLiving)(this)).U();
    }
    forwardValue4905_14_0 = this;
    }
    spill4905_1 = ((net.minecraft.entity.EntityLiving)(forwardValue4905_14_0)).bR;
    if (!((life3_5 == 0))) {
        forwardValue4905_22_0 = ((spill4905_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill4905_1)) {
        break forward_join_42;
    }
    spill4905_2 = this;
    if (!((life3_5 == 0))) {
        forwardValue4905_31_0 = spill4905_2;
        break forward_join_31;
    }
    forwardValue4905_22_0 = ((((net.minecraft.entity.EntityLiving)(spill4905_2)).p__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4905_22_0 == 0))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.EntityLiving)(this)).a(((boolean)(true)), ((boolean)(true)));
    }
    spill4905_3 = this;
    if (!((life3_5 == 0))) {
        forwardValue4905_39_0 = spill4905_3;
        break forward_join_39;
    }
    forwardValue4905_31_0 = ((net.minecraft.entity.EntityLiving)(spill4905_3)).bS;
    }
    if (!((forwardValue4905_31_0 != null))) {
        break forward_join_38;
    }
    spill4905_4 = this;
    if (!((life3_5 == 0))) {
        forwardValue4905_39_0 = spill4905_4;
        break forward_join_39;
    }
    if (!(((net.minecraft.entity.Entity)(((net.minecraft.entity.EntityLiving)(spill4905_4)).bS)).F)) {
        break forward_join_42;
    }
    }
    forwardValue4905_39_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(forwardValue4905_39_0)).a(((boolean)(true)), ((boolean)(true)));
    }
    return;
}


public boolean T__Boolean() {
return ((((this.bR) ? 1 : 0)) != 0);
}


public static boolean W() {
return ((((net.minecraft.entity.EntityLiving.bW) ? 1 : 0)) != 0);
}


protected final void H() {
this.a_ += 1;
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("checkDespawn")));
    ((net.minecraft.entity.EntityLiving)(this)).Q();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("sensing")));
    ((net.minecraft.entity.ai.EntitySenses)(this.bM)).a();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("targetSelector")));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("goalSelector")));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("navigation")));
    ((moom.AV)(this.bI)).a__Void();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("mob tick")));
    ((net.minecraft.entity.EntityLiving)(this)).R();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("controls")));
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("move")));
    ((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).a__Void();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b(((java.lang.String)("look")));
    ((net.minecraft.entity.ai.EntityLookHelper)(this.bE)).a__Void();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b(((java.lang.String)("jump")));
    ((net.minecraft.entity.ai.EntityJumpHelper)(this.bG)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    return;
}


protected void R() {
return;
}


public boolean R__Boolean() {
return ((((this.bQ) ? 1 : 0)) != 0);
}


public boolean Q__Boolean() {
return ((((this.bP) ? 1 : 0)) != 0);
}


protected void Q() {
net.minecraft.entity.EntityLiving forwardValue4903_17_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4903_27_0;
    int forwardValue4903_71_0;
    int forwardValue4903_108_0;
    net.minecraft.entity.EntityLiving spill4903_0;
    net.minecraft.entity.player.EntityPlayer spill4903_1;
    boolean spill4903_2;
    int spill4903_3;
    int spill4903_4;
    int spill4903_5;
    boolean spill4903_6;
    long life1_3;
    int life3_5;
    net.minecraft.entity.player.EntityPlayer life4_30;
    double life5_43;
    double life7_49;
    double life9_55;
    double life11_67;
    forward_join_112: {
    forward_join_108: {
    forward_join_105: {
    forward_join_71: {
    forward_join_69: {
    forward_join_27: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 117565289619779L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4903_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4903_17_0 = spill4903_0;
        break forward_join_17;
    }
    if (!(((net.minecraft.entity.EntityLiving)(spill4903_0)).bQ)) {
        break forward_join_16;
    }
    this.a_ = ((int)(0));
    if (!((life3_5 == 0))) {
        break forward_join_112;
    }
    }
    forwardValue4903_17_0 = this;
    }
    life4_30 = ((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(forwardValue4903_17_0)).i)).a(((net.minecraft.entity.Entity)(this)), ((double)(-0x1.0p0d)));
    spill4903_1 = life4_30;
    if (!((life3_5 != 0))) {
        forwardValue4903_27_0 = spill4903_1;
        break forward_join_27;
    }
    if (!((spill4903_1 != null))) {
        break forward_join_112;
    }
    forwardValue4903_27_0 = life4_30;
    }
    life5_43 = (((net.minecraft.entity.Entity)(forwardValue4903_27_0)).n - this.n);
    life7_49 = (((net.minecraft.entity.Entity)(life4_30)).o - this.o);
    life9_55 = (((net.minecraft.entity.Entity)(life4_30)).p - this.p);
    life11_67 = (((life5_43 * life5_43) + (life7_49 * life7_49)) + (life9_55 * life9_55));
    spill4903_2 = ((net.minecraft.entity.EntityLiving)(this)).M();
    if (!((life3_5 != 0))) {
        forwardValue4903_71_0 = ((spill4903_2) ? 1 : 0);
        break forward_join_71;
    }
    if (!(spill4903_2)) {
        break forward_join_69;
    }
    spill4903_3 = recovery.source.CarrierOps.dcmpl(((double)(life11_67)), ((double)(0x1.0p14d)));
    if (!((life3_5 != 0))) {
        forwardValue4903_71_0 = spill4903_3;
        break forward_join_71;
    }
    if (!((spill4903_3 > 0))) {
        break forward_join_69;
    }
    ((net.minecraft.entity.EntityLiving)(this)).f__Void();
    }
    forwardValue4903_71_0 = this.a_;
    }
    if (!((life3_5 != 0))) {
        forwardValue4903_108_0 = forwardValue4903_71_0;
        break forward_join_108;
    }
    if (!((forwardValue4903_71_0 > __sourceIntrinsic_78336f0616ae_invokedynamic4903_17(5835, (595666046027405693L ^ life1_3))))) {
        break forward_join_105;
    }
    spill4903_4 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_78336f0616ae_invokedynamic4903_19(25420, (4549900388662537471L ^ life1_3)))));
    if (!((life3_5 != 0))) {
        forwardValue4903_108_0 = spill4903_4;
        break forward_join_108;
    }
    if (!((spill4903_4 == 0))) {
        break forward_join_105;
    }
    spill4903_5 = recovery.source.CarrierOps.dcmpl(((double)(life11_67)), ((double)(0x1.0p10d)));
    if (!((life3_5 != 0))) {
        forwardValue4903_108_0 = spill4903_5;
        break forward_join_108;
    }
    if (!((spill4903_5 > 0))) {
        break forward_join_105;
    }
    spill4903_6 = ((net.minecraft.entity.EntityLiving)(this)).M();
    if (!((life3_5 != 0))) {
        forwardValue4903_108_0 = ((spill4903_6) ? 1 : 0);
        break forward_join_108;
    }
    if (!(spill4903_6)) {
        break forward_join_105;
    }
    ((net.minecraft.entity.EntityLiving)(this)).f__Void();
    if (!((life3_5 == 0))) {
        break forward_join_112;
    }
    }
    forwardValue4903_108_0 = recovery.source.CarrierOps.dcmpg(((double)(life11_67)), ((double)(0x1.0p10d)));
    }
    if (!((forwardValue4903_108_0 < 0))) {
        break forward_join_112;
    }
    this.a_ = ((int)(0));
    }
    return;
}


public boolean O__Boolean() {
int forwardValue4901_22_0;
    int forwardValue4901_30_0;
    int forwardValue4901_34_0;
    int forwardValue4901_36_0;
    boolean spill4901_0;
    long life1_3;
    int life3_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_22: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 66438879073847L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4901_0 = ((net.minecraft.world.World)(this.i)).a(((moom.CA)(((net.minecraft.entity.EntityLiving)(this)).b())), ((net.minecraft.entity.Entity)(this)));
    if (!((life3_5 != 0))) {
        forwardValue4901_22_0 = ((spill4901_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill4901_0)) {
        break forward_join_35;
    }
    forwardValue4901_22_0 = ((((java.util.List)(((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((net.minecraft.entity.EntityLiving)(this)).b()))))).isEmpty()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4901_30_0 = forwardValue4901_22_0;
        break forward_join_30;
    }
    if (!((forwardValue4901_22_0 != 0))) {
        break forward_join_35;
    }
    forwardValue4901_30_0 = ((((net.minecraft.world.World)(this.i)).c(((moom.CA)(((net.minecraft.entity.EntityLiving)(this)).b())))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4901_34_0 = forwardValue4901_30_0;
        break forward_join_34;
    }
    if (!((forwardValue4901_30_0 == 0))) {
        break forward_join_35;
    }
    forwardValue4901_34_0 = 1;
    }
    forwardValue4901_36_0 = forwardValue4901_34_0;
    break forward_join_36;
    }
    forwardValue4901_36_0 = 0;
    }
    return ((forwardValue4901_36_0) != 0);
}


public void O() {
long local1 = (net.minecraft.entity.EntityLiving.gb ^ 89031759852838L);
    java.lang.Object local3 = ((net.minecraft.entity.EntityLiving)(this)).i__String();
    if ((local3 != null)) {
        ((net.minecraft.entity.EntityLiving)(this)).a(((java.lang.String)(local3)), ((float)(((net.minecraft.entity.EntityLiving)(this)).f__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.EntityLiving)(this)).g__sourceReturn_bc607678b6())));
    }
    return;
}


public void G() {
net.minecraft.entity.item.EntityItem lexicalValue1524_64_0;
    net.minecraft.entity.item.EntityItem lexicalValue1524_69_0;
    net.minecraft.entity.EntityLiving lexicalValue1524_77_0;
    net.minecraft.world.World lexicalValue1524_78_0;
    int spill1524_0;
    net.minecraft.world.World spill1524_1;
    net.minecraft.entity.EntityLiving spill1524_2;
    net.minecraft.entity.EntityLiving spill1524_3;
    net.minecraft.world.World spill1524_4;
    net.minecraft.entity.item.EntityItem spill1524_5;
    long life1_3;
    int life3_12;
    java.util.Iterator life4_69;
    net.minecraft.entity.item.EntityItem life5_76;
    lexical_join_80: {
    lexical_join_78: {
    lexical_join_77: {
    lexical_join_76: {
    life1_3 = (net.minecraft.entity.EntityLiving.gb ^ 115563555330868L);
    super.G();
    spill1524_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("looting")));
    life3_12 = spill1524_0;
    spill1524_1 = this.i;
    if (!((life3_12 != 0))) {
        lexicalValue1524_78_0 = spill1524_1;
        break lexical_join_78;
    }
    if (!((!((net.minecraft.world.World)(spill1524_1)).G))) {
        break lexical_join_76;
    }
    spill1524_2 = this;
    if (!((life3_12 != 0))) {
        lexicalValue1524_77_0 = spill1524_2;
        break lexical_join_77;
    }
    if (!(((net.minecraft.entity.EntityLiving)(spill1524_2)).Q__Boolean())) {
        break lexical_join_76;
    }
    spill1524_3 = this;
    if (!((life3_12 != 0))) {
        lexicalValue1524_77_0 = spill1524_3;
        break lexical_join_77;
    }
    if (!((!((net.minecraft.entity.EntityLiving)(spill1524_3)).a9))) {
        break lexical_join_76;
    }
    spill1524_4 = this.i;
    if (!((life3_12 != 0))) {
        lexicalValue1524_78_0 = spill1524_4;
        break lexical_join_78;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(spill1524_4)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing"))))) {
        break lexical_join_76;
    }
    life4_69 = ((java.util.List)(((net.minecraft.world.World)(this.i)).a(((java.lang.Class)(net.minecraft.entity.item.EntityItem.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.EntityLiving)(this)).b())).b(((double)(0x1.0p0d)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)))))))).iterator();
    lexical_cycle_49: while (true) {
    lexical_join_74: {
    lexical_join_69: {
    lexical_join_64: {
    if (!(((java.util.Iterator)(life4_69)).hasNext())) {
        break lexical_join_76;
    }
    life5_76 = ((net.minecraft.entity.item.EntityItem)(((java.util.Iterator)(life4_69)).next()));
    if (!((life3_12 != 0))) {
        break lexical_join_80;
    }
    spill1524_5 = life5_76;
    if (!((life3_12 != 0))) {
        lexicalValue1524_64_0 = spill1524_5;
        break lexical_join_64;
    }
    if (!((!((net.minecraft.entity.item.EntityItem)(spill1524_5)).F))) {
        break lexical_join_74;
    }
    lexicalValue1524_64_0 = life5_76;
    }
    if (!((life3_12 != 0))) {
        lexicalValue1524_69_0 = lexicalValue1524_64_0;
        break lexical_join_69;
    }
    if (!((((net.minecraft.entity.item.EntityItem)(lexicalValue1524_64_0)).a__xW() != null))) {
        break lexical_join_74;
    }
    lexicalValue1524_69_0 = life5_76;
    }
    if (!((!((net.minecraft.entity.item.EntityItem)(lexicalValue1524_69_0)).b__Boolean()))) {
        break lexical_join_74;
    }
    ((net.minecraft.entity.EntityLiving)(this)).a(((net.minecraft.entity.item.EntityItem)(life5_76)));
    }
    if (!((life3_12 == 0))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    lexicalValue1524_77_0 = this;
    }
    lexicalValue1524_78_0 = ((net.minecraft.entity.EntityLiving)(lexicalValue1524_77_0)).i;
    }
    ((moom.A9)(((net.minecraft.world.World)(lexicalValue1524_78_0)).D)).b();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_44bfa09b42f9_invokedynamic1525_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_44bfa09b42f9_invokedynamic1525_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78336f0616ae_invokedynamic4903_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78336f0616ae_invokedynamic4903_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31f9c3d4f601_invokedynamic1526_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31f9c3d4f601_invokedynamic1526_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31f9c3d4f601_invokedynamic1526_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b3e1a2d723a8_invokedynamic4907_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_592c60c4d568_invokedynamic4909_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic5546_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cf52cd97ad90_invokedynamic1529_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_75ba9b926b76_invokedynamic1530_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_75ba9b926b76_invokedynamic1530_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic4923_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic4923_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral11170_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1532_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1532_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1532_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1532_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1876_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_455b93f512d4_invokedynamic4928_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b5913f5f2202_invokedynamic4930_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d0e131a72963_originalDynamicSite1875_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55dda021a68_originalDynamicSite1877_1(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_f21b3836e04476(net.minecraft.item.ItemStack p0);
private static native net.minecraft.item.ItemStack __sourceExactCall_b20cc06766c170(net.minecraft.nbt.NBTTagCompound p0);
private static native int __sourceExactCall_0b93efe4aa879c(int p0, long p1);
private static native net.minecraft.item.Item __sourceExactCall_ef5ea23ab7bef5(int p0, int p1);
private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
private static native moom.sD __sourceExactCall_f69d4e9671f191(net.minecraft.world.World p0, moom.DT p1);
private static native moom.sD __sourceExactCall_33b38c64c634b6(net.minecraft.world.World p0, moom.DT p1);

private static native float __sourceExactCall_f4e7fff2f8c1c1(net.minecraft.entity.EntityLivingBase p0);

private static native float __sourceExactCall_41c71eb6078f5d(net.minecraft.entity.EntityLiving p0);

private static native moom.AV __sourceExactCall_f6e11a183ad44e(net.minecraft.entity.EntityLiving p0, net.minecraft.world.World p1);
}
