package moom;


public class uo extends moom.um {

boolean i;

int j;

private static final long k;

private static final long m;

public uo(net.minecraft.entity.EntityLiving p0, boolean p1) {
super(p0);
    this.c = p0;
    this.i = p1;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(7893538725398869035L)), ((long)(-2465086384696015840L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227934506902513L)))));
    long local0_life6 = (moom.uo.k ^ 132140151091552L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1059_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1059_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1059_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1059_13 = new byte[8];
    (__sourceSpill1059_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1059_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1059_15 = __sourceSpill1059_13;
    ((javax.crypto.Cipher)(__sourceSpill1059_10)).init(((int)(__sourceSpill1059_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1059_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1059_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1818613581722975498L;
    byte[] __sourceSpill1059_19 = new byte[8];
    (__sourceSpill1059_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1059_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1059_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1059_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1059_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1059_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1059_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1059_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1059_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1059_20)).doFinal(((byte[])(__sourceSpill1059_19)));
    m = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b__Void() {
moom.uo forwardValue4221_12_0;
    moom.uo spill4221_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_12: {
    life1_3 = (moom.uo.k ^ 9584086643027L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4221_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4221_12_0 = spill4221_0;
        break forward_join_12;
    }
    if (!(((moom.uo)(spill4221_0)).i)) {
        break forward_join_20;
    }
    forwardValue4221_12_0 = this;
    }
    ((net.minecraft.block.BlockDoor)(((moom.uo)(forwardValue4221_12_0)).e)).a(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(((moom.uo)(this)).c)).i)), ((moom.DT)(((moom.uo)(this)).d)), ((boolean)(false)));
    }
    return;
}


public boolean b__Boolean() {
int forwardValue4220_13_0;
    int forwardValue4220_18_0;
    int forwardValue4220_22_0;
    int forwardValue4220_24_0;
    boolean spill4220_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.uo.k ^ 73450606774730L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4220_0 = this.i;
    if (!((life3_5 != 0))) {
        forwardValue4220_13_0 = ((spill4220_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill4220_0)) {
        break forward_join_23;
    }
    forwardValue4220_13_0 = this.j;
    }
    if (!((life3_5 != 0))) {
        forwardValue4220_18_0 = forwardValue4220_13_0;
        break forward_join_18;
    }
    if (!((forwardValue4220_13_0 > 0))) {
        break forward_join_23;
    }
    forwardValue4220_18_0 = ((super.b__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4220_22_0 = forwardValue4220_18_0;
        break forward_join_22;
    }
    if (!((forwardValue4220_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue4220_22_0 = 1;
    }
    forwardValue4220_24_0 = forwardValue4220_22_0;
    break forward_join_24;
    }
    forwardValue4220_24_0 = 0;
    }
    return ((forwardValue4220_24_0) != 0);
}


public void c() {
this.j -= 1;
    super.c();
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
long local1 = (moom.uo.k ^ 48732894861671L);
    this.j = ((int)(((int) moom.uo.m)));
    ((net.minecraft.block.BlockDoor)(((moom.uo)(this)).e)).a(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(((moom.uo)(this)).c)).i)), ((moom.DT)(((moom.uo)(this)).d)), ((boolean)(true)));
    return;
}

}
