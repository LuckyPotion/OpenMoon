package moom;


public class Ch extends net.minecraft.tileentity.TileEntity {

private net.minecraft.item.Item l;

private int m;

private static final long n;

private static final long o;

public Ch() {
super();
}


public Ch(net.minecraft.item.Item p0, int p1) {
super();
    this.l = p0;
    this.m = p1;
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(319653767018571468L)), ((long)(-765876874833447948L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(203750803257069L)))));
    long local0_life6 = (moom.Ch.n ^ 102955289803909L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill507_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill507_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill507_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill507_13 = new byte[8];
    (__sourceSpill507_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill507_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation507_15 = __sourceSpill507_13;
    ((javax.crypto.Cipher)(__sourceSpill507_10)).init(((int)(__sourceSpill507_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill507_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation507_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8144455298192527096L;
    byte[] __sourceSpill507_19 = new byte[8];
    (__sourceSpill507_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill507_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill507_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill507_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill507_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill507_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill507_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill507_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill507_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill507_20)).doFinal(((byte[])(__sourceSpill507_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue1633_23_0;
    java.lang.String forwardValue1633_23_1;
    net.minecraft.nbt.NBTTagCompound forwardValue1633_24_0;
    java.lang.String forwardValue1633_24_1;
    moom.DD forwardValue1633_24_2;
    net.minecraft.nbt.NBTTagCompound forwardValue1633_25_0;
    java.lang.String forwardValue1633_25_1;
    java.lang.String forwardValue1633_25_2;
    java.lang.String[] spill1633_0;
    net.minecraft.nbt.NBTTagCompound spill1633_1;
    java.lang.String spill1633_2;
    moom.DD spill1633_3;
    long life2_3;
    moom.DD life5_13;
    java.lang.String[] life4_14;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (moom.Ch.n ^ 114078249703934L);
    spill1633_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_13 = ((moom.DD)(((moom.DB)(net.minecraft.item.Item.a)).b(((java.lang.Object)(this.l)))));
    life4_14 = spill1633_0;
    spill1633_1 = p0;
    spill1633_2 = "Item";
    spill1633_3 = life5_13;
    if (!((life4_14 != null))) {
        forwardValue1633_24_0 = spill1633_1;
        forwardValue1633_24_1 = spill1633_2;
        forwardValue1633_24_2 = spill1633_3;
        break forward_join_24;
    }
    if (!((spill1633_3 == null))) {
        forwardValue1633_23_0 = spill1633_1;
        forwardValue1633_23_1 = spill1633_2;
        break forward_join_23;
    }
    forwardValue1633_25_0 = spill1633_1;
    forwardValue1633_25_1 = spill1633_2;
    forwardValue1633_25_2 = "";
    break forward_join_25;
    }
    forwardValue1633_24_0 = forwardValue1633_23_0;
    forwardValue1633_24_1 = forwardValue1633_23_1;
    forwardValue1633_24_2 = life5_13;
    }
    forwardValue1633_25_0 = forwardValue1633_24_0;
    forwardValue1633_25_1 = forwardValue1633_24_1;
    forwardValue1633_25_2 = ((moom.DD)(forwardValue1633_24_2)).toString();
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue1633_25_0)).a(((java.lang.String)(forwardValue1633_25_1)), ((java.lang.String)(forwardValue1633_25_2)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Data")), ((int)(this.m)));
    return;
}


public int a__sourceReturn_8abf5c6871() {
return this.m;
}


public net.minecraft.item.Item a__wQ() {
return this.l;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.item.Item p0, int p1) {
this.l = ((net.minecraft.item.Item)(p0));
    this.m = ((int)(p1));
    return;
}


public moom.yK a__yK() {
net.minecraft.nbt.NBTTagCompound local1 = new net.minecraft.nbt.NBTTagCompound();
    ((moom.Ch)(this)).b(((net.minecraft.nbt.NBTTagCompound)(local1)));
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a__Void(((java.lang.String)("Item")));
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a__Void(((java.lang.String)("Item")), ((int)(net.minecraft.item.Item.a(((net.minecraft.item.Item)(this.l))))));
    return new moom.Am(this.e, 5, local1);
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
moom.Ch forwardValue1632_27_0;
    net.minecraft.nbt.NBTTagCompound forwardValue1632_27_1;
    moom.Ch spill1632_0;
    net.minecraft.nbt.NBTTagCompound spill1632_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_31: {
    forward_join_27: {
    forward_join_25: {
    life2_3 = (moom.Ch.n ^ 7680815077631L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1632_0 = this;
    spill1632_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue1632_27_0 = spill1632_0;
        forwardValue1632_27_1 = spill1632_1;
        break forward_join_27;
    }
    __sourceIntrinsic_03d9340fa09f_call1632_2(spill1632_0, spill1632_1);
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Item")), ((int)(((int) moom.Ch.o)))))) {
        break forward_join_25;
    }
    this.l = ((net.minecraft.item.Item)(net.minecraft.item.Item.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("Item"))))))));
    if (!((life4_5 == null))) {
        break forward_join_31;
    }
    }
    forwardValue1632_27_0 = this;
    forwardValue1632_27_1 = p0;
    }
    ((moom.Ch)(forwardValue1632_27_0)).l = ((net.minecraft.item.Item)(net.minecraft.item.Item.a__wQ(((int)(((net.minecraft.nbt.NBTTagCompound)(forwardValue1632_27_1)).a__Int(((java.lang.String)("Item"))))))));
    }
    this.m = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Data")))));
    return;
}


private static native <E extends Throwable> void __sourceIntrinsic_03d9340fa09f_call1632_2(moom.Ch a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
}
