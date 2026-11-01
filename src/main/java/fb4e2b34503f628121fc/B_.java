package moom;


public class B_ extends net.minecraft.tileentity.TileEntity {

private net.minecraft.item.ItemStack l;

private static final long m;

private static final long n;

public B_() {
super();
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(1073540943029943596L)), ((long)(606480930522580892L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(205590956443237L)))));
    long local0_life6 = (moom.B_.m ^ 74775450018825L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill489_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill489_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill489_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill489_13 = new byte[8];
    (__sourceSpill489_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill489_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation489_15 = __sourceSpill489_13;
    ((javax.crypto.Cipher)(__sourceSpill489_10)).init(((int)(__sourceSpill489_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill489_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation489_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 88719605254637334L;
    byte[] __sourceSpill489_19 = new byte[8];
    (__sourceSpill489_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill489_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill489_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill489_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill489_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill489_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill489_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill489_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill489_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill489_20)).doFinal(((byte[])(__sourceSpill489_19)));
    n = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (moom.B_.m ^ 86868175429264L);
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    if ((((moom.B_)(this)).a__sourceReturn_bd21db05da() != null)) {
        ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("RecordItem")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(((moom.B_)(this)).a__sourceReturn_bd21db05da())).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.item.ItemStack p0) {
this.l = ((net.minecraft.item.ItemStack)(p0));
    ((moom.B_)(this)).a__Void();
    return;
}


public net.minecraft.item.ItemStack a__sourceReturn_bd21db05da() {
return this.l;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue1507_28_0;
    int[] spill1507_0;
    boolean spill1507_1;
    long life2_3;
    int[] life4_8;
    forward_join_40: {
    forward_join_28: {
    forward_join_25: {
    life2_3 = (moom.B_.m ^ 50840323809169L);
    spill1507_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill1507_0;
    spill1507_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("RecordItem")), ((int)(((int) moom.B_.n))));
    if (!((life4_8 != null))) {
        forwardValue1507_28_0 = ((spill1507_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill1507_1)) {
        break forward_join_25;
    }
    ((moom.B_)(this)).a(((net.minecraft.item.ItemStack)(net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("RecordItem")))))))));
    if (!((life4_8 == null))) {
        break forward_join_40;
    }
    }
    forwardValue1507_28_0 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Record")));
    }
    if (!((forwardValue1507_28_0 > 0))) {
        break forward_join_40;
    }
    ((moom.B_)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a__wQ(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Record")))))), 1, 0))));
    }
    return;
}

}
