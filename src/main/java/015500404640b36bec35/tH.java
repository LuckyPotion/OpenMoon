package moom;


public class tH extends net.minecraft.entity.item.EntityMinecart {

private static final long bb;

private static final long db;

public tH(net.minecraft.world.World p0) {
super(p0);
}


public tH(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-7045018655273680582L)), ((long)(-2020197441361426411L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(273057307723170L)))));
    long local0_life6 = (moom.tH.bb ^ 60834211319437L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1026_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1026_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1026_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1026_13 = new byte[8];
    (__sourceSpill1026_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1026_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1026_15 = __sourceSpill1026_13;
    ((javax.crypto.Cipher)(__sourceSpill1026_10)).init(((int)(__sourceSpill1026_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1026_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1026_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6173930031664257437L;
    byte[] __sourceSpill1026_19 = new byte[8];
    (__sourceSpill1026_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1026_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1026_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1026_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1026_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1026_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1026_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1026_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1026_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1026_20)).doFinal(((byte[])(__sourceSpill1026_19)));
    db = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.Entity forwardValue4044_29_0;
    moom.tH forwardValue4044_39_0;
    int forwardValue4044_48_0;
    net.minecraft.entity.Entity spill4044_0;
    net.minecraft.entity.Entity spill4044_1;
    net.minecraft.entity.Entity spill4044_2;
    moom.tH spill4044_3;
    moom.tH spill4044_4;
    boolean spill4044_5;
    long life2_3;
    int life4_5;
    forward_join_48: {
    forward_join_47: {
    forward_join_39: {
    forward_join_38: {
    forward_join_29: {
    forward_join_25: {
    life2_3 = (moom.tH.bb ^ 64281178331475L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4044_0 = ((moom.tH)(this)).f;
    if (!((life4_5 != 0))) {
        forwardValue4044_29_0 = spill4044_0;
        break forward_join_29;
    }
    if (!((spill4044_0 != null))) {
        break forward_join_25;
    }
    spill4044_1 = ((moom.tH)(this)).f;
    if (!((life4_5 != 0))) {
        forwardValue4044_29_0 = spill4044_1;
        break forward_join_29;
    }
    if (!((((spill4044_1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_25;
    }
    spill4044_2 = ((moom.tH)(this)).f;
    if (!((life4_5 != 0))) {
        forwardValue4044_29_0 = spill4044_2;
        break forward_join_29;
    }
    if (!((spill4044_2 != p0))) {
        break forward_join_25;
    }
    return ((1) != 0);
    }
    spill4044_3 = this;
    if (!((life4_5 != 0))) {
        forwardValue4044_39_0 = spill4044_3;
        break forward_join_39;
    }
    forwardValue4044_29_0 = ((moom.tH)(spill4044_3)).f;
    }
    if (!((forwardValue4044_29_0 != null))) {
        break forward_join_38;
    }
    spill4044_4 = this;
    if (!((life4_5 != 0))) {
        forwardValue4044_39_0 = spill4044_4;
        break forward_join_39;
    }
    if (!((((moom.tH)(spill4044_4)).f != p0))) {
        break forward_join_38;
    }
    return ((0) != 0);
    }
    forwardValue4044_39_0 = this;
    }
    spill4044_5 = ((net.minecraft.world.World)(((moom.tH)(forwardValue4044_39_0)).i)).G;
    if (!((life4_5 != 0))) {
        forwardValue4044_48_0 = ((spill4044_5) ? 1 : 0);
        break forward_join_48;
    }
    if (!((!spill4044_5))) {
        break forward_join_47;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).b(((net.minecraft.entity.Entity)(this)));
    }
    forwardValue4044_48_0 = 1;
    }
    return ((forwardValue4044_48_0) != 0);
}


public net.minecraft.entity.item.EntityMinecart$EnumMinecartType a__aT() {
return net.minecraft.entity.item.EntityMinecart$EnumMinecartType.RIDEABLE;
}


public void a(int p0, int p1, int p2, boolean p3) {
moom.tH forwardValue4043_18_0;
    moom.tH forwardValue4043_35_0;
    moom.tH spill4043_0;
    long life5_3;
    int life7_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_18: {
    forward_join_17: {
    life5_3 = (moom.tH.bb ^ 82407651418437L);
    life7_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    if (!(p3)) {
        break forward_join_36;
    }
    spill4043_0 = this;
    if (!((life7_5 == 0))) {
        forwardValue4043_18_0 = spill4043_0;
        break forward_join_18;
    }
    if (!((((moom.tH)(spill4043_0)).f != null))) {
        break forward_join_17;
    }
    ((net.minecraft.entity.Entity)(((moom.tH)(this)).f)).b(((net.minecraft.entity.Entity)(null)));
    }
    forwardValue4043_18_0 = this;
    }
    if (!((life7_5 == 0))) {
        forwardValue4043_35_0 = forwardValue4043_18_0;
        break forward_join_35;
    }
    if (!((((moom.tH)(forwardValue4043_18_0)).j__sourceReturn_8abf5c6871() == 0))) {
        break forward_join_36;
    }
    ((moom.tH)(this)).h(((int)((-((moom.tH)(this)).k()))));
    ((moom.tH)(this)).g(((int)(((int) moom.tH.db))));
    ((moom.tH)(this)).c(((float)(0x1.9p5f)));
    forwardValue4043_35_0 = this;
    }
    ((moom.tH)(forwardValue4043_35_0)).q();
    }
    return;
}

}
