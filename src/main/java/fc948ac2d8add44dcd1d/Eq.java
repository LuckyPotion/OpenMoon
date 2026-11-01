package moom;


public class Eq {

public static final moom.Eq a;

private final java.lang.String b;

private static final long c;

private static final long d;

public Eq(java.lang.String p0) {
super();
    this.b = p0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(6804296230966975304L)), ((long)(-78439061416492328L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(151259343458517L)))));
    long local0_life6 = (moom.Eq.c ^ 48144709749026L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill525_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill525_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill525_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill525_13 = new byte[8];
    (__sourceSpill525_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill525_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation525_15 = __sourceSpill525_13;
    ((javax.crypto.Cipher)(__sourceSpill525_10)).init(((int)(__sourceSpill525_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill525_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation525_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6349884239349020698L;
    byte[] __sourceSpill525_19 = new byte[8];
    (__sourceSpill525_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill525_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill525_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill525_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill525_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill525_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill525_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill525_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill525_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill525_20)).doFinal(((byte[])(__sourceSpill525_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((moom.Eq)(new moom.Eq("")));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.Eq a(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue1841_16_0;
    java.lang.String forwardValue1841_16_1;
    net.minecraft.nbt.NBTTagCompound spill1841_0;
    java.lang.String spill1841_1;
    long life1_3;
    java.lang.String life3_5;
    java.lang.String life4_23;
    forward_join_23: {
    forward_join_16: {
    life1_3 = (moom.Eq.c ^ 19356609106357L);
    life3_5 = net.minecraft.world.World.c__String();
    spill1841_0 = p0;
    spill1841_1 = "Lock";
    if (!((life3_5 == null))) {
        forwardValue1841_16_0 = spill1841_0;
        forwardValue1841_16_1 = spill1841_1;
        break forward_join_16;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill1841_0)).a__Boolean(((java.lang.String)(spill1841_1)), ((int)(((int) moom.Eq.d)))))) {
        break forward_join_23;
    }
    forwardValue1841_16_0 = p0;
    forwardValue1841_16_1 = "Lock";
    }
    life4_23 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue1841_16_0)).a__String(((java.lang.String)(forwardValue1841_16_1)));
    return new moom.Eq(life4_23);
    }
    return moom.Eq.a;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Lock")), ((java.lang.String)(this.b)));
    return;
}


public java.lang.String a() {
return this.b;
}


public boolean a__Boolean() {
java.lang.String forwardValue1842_13_0;
    int forwardValue1842_18_0;
    int forwardValue1842_20_0;
    java.lang.String spill1842_0;
    boolean spill1842_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.Eq.c ^ 6267481303368L);
    life3_5 = net.minecraft.world.World.c__String();
    spill1842_0 = this.b;
    if (!((life3_5 == null))) {
        forwardValue1842_13_0 = spill1842_0;
        break forward_join_13;
    }
    if (!((spill1842_0 != null))) {
        break forward_join_17;
    }
    forwardValue1842_13_0 = this.b;
    }
    spill1842_1 = ((java.lang.String)(forwardValue1842_13_0)).isEmpty();
    if (!((life3_5 == null))) {
        forwardValue1842_18_0 = ((spill1842_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill1842_1)) {
        break forward_join_19;
    }
    }
    forwardValue1842_18_0 = 1;
    }
    forwardValue1842_20_0 = forwardValue1842_18_0;
    break forward_join_20;
    }
    forwardValue1842_20_0 = 0;
    }
    return ((forwardValue1842_20_0) != 0);
}

}
