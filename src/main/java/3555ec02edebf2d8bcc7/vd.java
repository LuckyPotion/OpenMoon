package moom;


class vd extends moom.uc {

private final net.minecraft.entity.monster.EntityEnderman c;

private static final long d;

private static final long e;

public vd(net.minecraft.entity.monster.EntityEnderman p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(178583988376962944L)), ((long)(-827167790237729695L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(153049333197329L)))));
    long local0_life6 = (moom.vd.d ^ 122049066678389L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1076_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1076_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1076_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1076_13 = new byte[8];
    (__sourceSpill1076_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1076_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1076_15 = __sourceSpill1076_13;
    ((javax.crypto.Cipher)(__sourceSpill1076_10)).init(((int)(__sourceSpill1076_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1076_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1076_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 4859637067855953012L;
    byte[] __sourceSpill1076_19 = new byte[8];
    (__sourceSpill1076_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1076_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1076_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1076_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1076_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1076_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1076_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1076_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1076_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1076_20)).doFinal(((byte[])(__sourceSpill1076_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void c() {
int forwardValue4315_77_0;
    net.minecraft.entity.Entity[] spill4315_0;
    boolean spill4315_1;
    long life1_3;
    java.util.Random life4_7;
    net.minecraft.world.World life5_11;
    int life6_23;
    int life7_34;
    net.minecraft.entity.Entity[] life3_35;
    int life8_47;
    moom.DT life9_54;
    net.minecraft.block.state.IBlockState life10_58;
    net.minecraft.block.Block life11_61;
    forward_join_78: {
    forward_join_77: {
    life1_3 = (moom.vd.d ^ 77996365102757L);
    life4_7 = ((net.minecraft.entity.monster.EntityEnderman)(this.c)).a__Random();
    life5_11 = ((net.minecraft.entity.monster.EntityEnderman)(this.c)).i;
    life6_23 = moom.Dr.b__Int(((double)(((((net.minecraft.entity.monster.EntityEnderman)(this.c)).n - 0x1.0p1d) + (((java.util.Random)(life4_7)).nextDouble() * 0x1.0p2d)))));
    spill4315_0 = moom.vN.b();
    life7_34 = moom.Dr.b__Int(((double)((((net.minecraft.entity.monster.EntityEnderman)(this.c)).o + (((java.util.Random)(life4_7)).nextDouble() * 0x1.8p1d)))));
    life3_35 = spill4315_0;
    life8_47 = moom.Dr.b__Int(((double)(((((net.minecraft.entity.monster.EntityEnderman)(this.c)).p - 0x1.0p1d) + (((java.util.Random)(life4_7)).nextDouble() * 0x1.0p2d)))));
    life9_54 = new moom.DT(life6_23, life7_34, life8_47);
    life10_58 = ((net.minecraft.world.World)(life5_11)).a__fE(((moom.DT)(life9_54)));
    life11_61 = ((net.minecraft.block.state.IBlockState)(life10_58)).a__ch();
    spill4315_1 = ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).contains(((java.lang.Object)(life11_61)));
    if (!((life3_35 == null))) {
        forwardValue4315_77_0 = ((spill4315_1) ? 1 : 0);
        break forward_join_77;
    }
    if (!(spill4315_1)) {
        break forward_join_78;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this.c)).a(((net.minecraft.block.state.IBlockState)(life10_58)));
    forwardValue4315_77_0 = ((((net.minecraft.world.World)(life5_11)).a(((moom.DT)(life9_54)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4315_77_0);
    }
    return;
}


public boolean a__Boolean() {
net.minecraft.entity.monster.EntityEnderman forwardValue4314_17_0;
    net.minecraft.entity.monster.EntityEnderman forwardValue4314_26_0;
    int forwardValue4314_34_0;
    int forwardValue4314_36_0;
    net.minecraft.entity.monster.EntityEnderman spill4314_0;
    int spill4314_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    forward_join_17: {
    life1_3 = (moom.vd.d ^ 135547016950935L);
    life3_5 = moom.vN.b();
    spill4314_0 = this.c;
    if (!((life3_5 == null))) {
        forwardValue4314_17_0 = spill4314_0;
        break forward_join_17;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityEnderman)(spill4314_0)).i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing"))))) {
        break forward_join_35;
    }
    forwardValue4314_17_0 = this.c;
    }
    if (!((life3_5 == null))) {
        forwardValue4314_26_0 = forwardValue4314_17_0;
        break forward_join_26;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.entity.monster.EntityEnderman)(forwardValue4314_17_0)).a__sourceReturn_474a78d617())).a__ch())).a__fn() == moom.fn.a))) {
        break forward_join_35;
    }
    forwardValue4314_26_0 = this.c;
    }
    spill4314_1 = ((java.util.Random)(((net.minecraft.entity.monster.EntityEnderman)(forwardValue4314_26_0)).a__Random())).nextInt(((int)(((int) moom.vd.e))));
    if (!((life3_5 == null))) {
        forwardValue4314_34_0 = spill4314_1;
        break forward_join_34;
    }
    if (!((spill4314_1 == 0))) {
        break forward_join_35;
    }
    forwardValue4314_34_0 = 1;
    }
    forwardValue4314_36_0 = forwardValue4314_34_0;
    break forward_join_36;
    }
    forwardValue4314_36_0 = 0;
    }
    return ((forwardValue4314_36_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
