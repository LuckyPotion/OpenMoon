package moom;


class rs extends moom.rd {

private static final long c;

private static final long d;

rs() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(5269710739532707811L)), ((long)(1768373979259636333L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(253229592856103L)))));
    long local0_life6 = (moom.rs.c ^ 82289149812569L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1002_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1002_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1002_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1002_13 = new byte[8];
    (__sourceSpill1002_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1002_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1002_15 = __sourceSpill1002_13;
    ((javax.crypto.Cipher)(__sourceSpill1002_10)).init(((int)(__sourceSpill1002_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1002_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1002_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5193520250795693669L;
    byte[] __sourceSpill1002_19 = new byte[8];
    (__sourceSpill1002_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1002_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1002_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1002_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1002_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1002_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1002_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1002_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1002_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1002_20)).doFinal(((byte[])(__sourceSpill1002_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
moom.bs local3 = __sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int())));
    double local4 = (((moom.ry)(p0)).a() + ((double) ((moom.bs)(local3)).c()));
    double local6 = ((double) (((float) ((moom.DT)(((moom.ry)(p0)).a__DT())).b()) + 0x1.99999ap-3f));
    double local8 = (((moom.ry)(p0)).c() + ((double) ((moom.bs)(local3)).e()));
    net.minecraft.entity.item.EntityFireworkRocket local10 = new net.minecraft.entity.item.EntityFireworkRocket(((moom.ry)(p0)).a__Eu(), local4, local6, local8, p1);
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b__Boolean(((net.minecraft.entity.Entity)(local10)));
    ((net.minecraft.item.ItemStack)(p1)).a(((int)(1)));
    return p1;
}


protected void a(moom.ry p0) {
long local2 = (moom.rs.c ^ 113985002801801L);
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(((int) moom.rs.d))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    return;
}


private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
}
