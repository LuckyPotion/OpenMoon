package moom;


class vc extends moom.uc {

private final net.minecraft.entity.monster.EntityEnderman c;

private static final long d;

private static final long e;

public vc(net.minecraft.entity.monster.EntityEnderman p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2209132467592887300L)), ((long)(5666736636670913613L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(244315168959657L)))));
    long local0_life6 = (moom.vc.d ^ 6705367845368L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1075_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1075_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1075_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1075_13 = new byte[8];
    (__sourceSpill1075_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1075_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1075_15 = __sourceSpill1075_13;
    ((javax.crypto.Cipher)(__sourceSpill1075_10)).init(((int)(__sourceSpill1075_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1075_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1075_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8599083739457989752L;
    byte[] __sourceSpill1075_19 = new byte[8];
    (__sourceSpill1075_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1075_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1075_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1075_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1075_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1075_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1075_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1075_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1075_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1075_20)).doFinal(((byte[])(__sourceSpill1075_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void c() {
int forwardValue4313_86_0;
    net.minecraft.entity.Entity[] spill4313_0;
    boolean spill4313_1;
    long life1_3;
    java.util.Random life4_8;
    net.minecraft.world.World life5_12;
    int life6_24;
    int life7_34;
    net.minecraft.entity.Entity[] life3_35;
    int life8_47;
    moom.DT life9_54;
    net.minecraft.block.Block life10_59;
    net.minecraft.block.Block life11_65;
    forward_join_92: {
    forward_join_86: {
    life1_3 = (moom.vc.d ^ 129572980358598L);
    spill4313_0 = moom.vN.b();
    life4_8 = ((net.minecraft.entity.monster.EntityEnderman)(this.c)).a__Random();
    life5_12 = ((net.minecraft.entity.monster.EntityEnderman)(this.c)).i;
    life6_24 = moom.Dr.b__Int(((double)(((((net.minecraft.entity.monster.EntityEnderman)(this.c)).n - 0x1.0p0d) + (((java.util.Random)(life4_8)).nextDouble() * 0x1.0p1d)))));
    life7_34 = moom.Dr.b__Int(((double)((((net.minecraft.entity.monster.EntityEnderman)(this.c)).o + (((java.util.Random)(life4_8)).nextDouble() * 0x1.0p1d)))));
    life3_35 = spill4313_0;
    life8_47 = moom.Dr.b__Int(((double)(((((net.minecraft.entity.monster.EntityEnderman)(this.c)).p - 0x1.0p0d) + (((java.util.Random)(life4_8)).nextDouble() * 0x1.0p1d)))));
    life9_54 = new moom.DT(life6_24, life7_34, life8_47);
    life10_59 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(life5_12)).a__fE(((moom.DT)(life9_54))))).a__ch();
    life11_65 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(life5_12)).a__fE(((moom.DT)(((moom.DT)(life9_54)).b__DT()))))).a__ch();
    spill4313_1 = ((moom.vc)(this)).a(((net.minecraft.world.World)(life5_12)), ((moom.DT)(life9_54)), ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.entity.monster.EntityEnderman)(this.c)).a__sourceReturn_474a78d617())).a__ch())), ((net.minecraft.block.Block)(life10_59)), ((net.minecraft.block.Block)(life11_65)));
    if (!((life3_35 == null))) {
        forwardValue4313_86_0 = ((spill4313_1) ? 1 : 0);
        break forward_join_86;
    }
    if (!(spill4313_1)) {
        break forward_join_92;
    }
    forwardValue4313_86_0 = ((((net.minecraft.world.World)(life5_12)).a(((moom.DT)(life9_54)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.entity.monster.EntityEnderman)(this.c)).a__sourceReturn_474a78d617())), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4313_86_0);
    ((net.minecraft.entity.monster.EntityEnderman)(this.c)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.Block p2, net.minecraft.block.Block p3, net.minecraft.block.Block p4) {
net.minecraft.block.Block forwardValue4311_14_0;
    moom.fn forwardValue4311_24_0;
    moom.fn forwardValue4311_24_1;
    net.minecraft.block.Block forwardValue4311_26_0;
    int forwardValue4311_31_0;
    int forwardValue4311_33_0;
    net.minecraft.block.Block spill4311_0;
    moom.fn spill4311_1;
    moom.fn spill4311_2;
    net.minecraft.block.Block spill4311_3;
    boolean spill4311_4;
    long life6_3;
    net.minecraft.entity.Entity[] life8_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_26: {
    forward_join_24: {
    forward_join_14: {
    life6_3 = (moom.vc.d ^ 120011754482561L);
    life8_5 = moom.vN.b();
    spill4311_0 = p2;
    if (!((life8_5 == null))) {
        forwardValue4311_14_0 = spill4311_0;
        break forward_join_14;
    }
    if (!(((net.minecraft.block.Block)(spill4311_0)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))))) {
        break forward_join_32;
    }
    forwardValue4311_14_0 = p3;
    }
    spill4311_1 = ((net.minecraft.block.Block)(forwardValue4311_14_0)).a__fn();
    spill4311_2 = moom.fn.a;
    if (!((life8_5 == null))) {
        forwardValue4311_24_0 = spill4311_1;
        forwardValue4311_24_1 = spill4311_2;
        break forward_join_24;
    }
    if (!((spill4311_1 == spill4311_2))) {
        break forward_join_32;
    }
    spill4311_3 = p4;
    if (!((life8_5 == null))) {
        forwardValue4311_26_0 = spill4311_3;
        break forward_join_26;
    }
    forwardValue4311_24_0 = ((net.minecraft.block.Block)(spill4311_3)).a__fn();
    forwardValue4311_24_1 = moom.fn.a;
    }
    if (!((forwardValue4311_24_0 != forwardValue4311_24_1))) {
        break forward_join_32;
    }
    forwardValue4311_26_0 = p4;
    }
    spill4311_4 = ((net.minecraft.block.Block)(forwardValue4311_26_0)).g();
    if (!((life8_5 == null))) {
        forwardValue4311_31_0 = ((spill4311_4) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill4311_4)) {
        break forward_join_32;
    }
    forwardValue4311_31_0 = 1;
    }
    forwardValue4311_33_0 = forwardValue4311_31_0;
    break forward_join_33;
    }
    forwardValue4311_33_0 = 0;
    }
    return ((forwardValue4311_33_0) != 0);
}


public boolean a__Boolean() {
net.minecraft.entity.monster.EntityEnderman forwardValue4312_17_0;
    net.minecraft.entity.monster.EntityEnderman forwardValue4312_26_0;
    int forwardValue4312_34_0;
    int forwardValue4312_36_0;
    net.minecraft.entity.monster.EntityEnderman spill4312_0;
    int spill4312_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    forward_join_17: {
    life1_3 = (moom.vc.d ^ 79645892311028L);
    life3_5 = moom.vN.b();
    spill4312_0 = this.c;
    if (!((life3_5 == null))) {
        forwardValue4312_17_0 = spill4312_0;
        break forward_join_17;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityEnderman)(spill4312_0)).i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing"))))) {
        break forward_join_35;
    }
    forwardValue4312_17_0 = this.c;
    }
    if (!((life3_5 == null))) {
        forwardValue4312_26_0 = forwardValue4312_17_0;
        break forward_join_26;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.entity.monster.EntityEnderman)(forwardValue4312_17_0)).a__sourceReturn_474a78d617())).a__ch())).a__fn() != moom.fn.a))) {
        break forward_join_35;
    }
    forwardValue4312_26_0 = this.c;
    }
    spill4312_1 = ((java.util.Random)(((net.minecraft.entity.monster.EntityEnderman)(forwardValue4312_26_0)).a__Random())).nextInt(((int)(((int) moom.vc.e))));
    if (!((life3_5 == null))) {
        forwardValue4312_34_0 = spill4312_1;
        break forward_join_34;
    }
    if (!((spill4312_1 == 0))) {
        break forward_join_35;
    }
    forwardValue4312_34_0 = 1;
    }
    forwardValue4312_36_0 = forwardValue4312_34_0;
    break forward_join_36;
    }
    forwardValue4312_36_0 = 0;
    }
    return ((forwardValue4312_36_0) != 0);
}

}
