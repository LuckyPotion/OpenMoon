package moom;


public class Cd extends net.minecraft.tileentity.TileEntity implements net.minecraft.util.ITickable {

private static final long l;

private static final long m;

public Cd() {
super();
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-2610579034786867275L)), ((long)(7632191047288483912L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(247801482492448L)))));
    long local0_life6 = (moom.Cd.l ^ 54856115273223L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill504_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill504_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill504_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill504_13 = new byte[8];
    (__sourceSpill504_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill504_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation504_15 = __sourceSpill504_13;
    ((javax.crypto.Cipher)(__sourceSpill504_10)).init(((int)(__sourceSpill504_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill504_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation504_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7331170069261138336L;
    byte[] __sourceSpill504_19 = new byte[8];
    (__sourceSpill504_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill504_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill504_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill504_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill504_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill504_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill504_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill504_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill504_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill504_20)).doFinal(((byte[])(__sourceSpill504_19)));
    m = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void c__Void() {
net.minecraft.world.World forwardValue1623_13_0;
    int forwardValue1623_24_0;
    int forwardValue1623_36_0;
    net.minecraft.block.Block forwardValue1623_39_0;
    net.minecraft.world.World spill1623_0;
    boolean spill1623_1;
    net.minecraft.block.Block spill1623_2;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_45: {
    forward_join_39: {
    forward_join_36: {
    forward_join_24: {
    forward_join_13: {
    life1_3 = (moom.Cd.l ^ 94076754253285L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1623_0 = ((moom.Cd)(this)).d;
    if (!((life3_5 != null))) {
        forwardValue1623_13_0 = spill1623_0;
        break forward_join_13;
    }
    if (!((spill1623_0 != null))) {
        break forward_join_45;
    }
    forwardValue1623_13_0 = ((moom.Cd)(this)).d;
    }
    spill1623_1 = ((net.minecraft.world.World)(forwardValue1623_13_0)).G;
    if (!((life3_5 != null))) {
        forwardValue1623_24_0 = ((spill1623_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!((!spill1623_1))) {
        break forward_join_45;
    }
    forwardValue1623_24_0 = recovery.source.CarrierOps.lcmp(((long)((((net.minecraft.world.World)(((moom.Cd)(this)).d)).b__Long() % moom.Cd.m))), ((long)(0L)));
    }
    if (!((life3_5 != null))) {
        forwardValue1623_36_0 = forwardValue1623_24_0;
        break forward_join_36;
    }
    if (!((forwardValue1623_24_0 == 0))) {
        break forward_join_45;
    }
    ((moom.Cd)(this)).h = ((net.minecraft.block.Block)(((moom.Cd)(this)).a__ch()));
    spill1623_2 = ((moom.Cd)(this)).h;
    if (!((life3_5 != null))) {
        forwardValue1623_39_0 = spill1623_2;
        break forward_join_39;
    }
    forwardValue1623_36_0 = ((spill1623_2 instanceof moom.c1) ? 1 : 0);
    }
    if (!((forwardValue1623_36_0 != 0))) {
        break forward_join_45;
    }
    forwardValue1623_39_0 = ((moom.Cd)(this)).h;
    }
    ((moom.c1)(((moom.c1)(forwardValue1623_39_0)))).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(((moom.Cd)(this)).d)), ((moom.DT)(((moom.Cd)(this)).e)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
