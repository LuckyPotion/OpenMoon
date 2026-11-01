package net.minecraft.nbt;


public abstract class NBTBase {

public static final java.lang.String[] a;

private static java.lang.String b;

private static final long f;

public NBTBase() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(4897483650804648149L)), ((long)(-286457171276245728L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(124257080834708L)))));
    long local11_life6 = (net.minecraft.nbt.NBTBase.f ^ 3889275725033L);
    if ((net.minecraft.nbt.NBTBase.b() != null)) {
        net.minecraft.nbt.NBTBase.b(((java.lang.String)("PiNmUb")));
    }
    javax.crypto.Cipher local1_life10;
    javax.crypto.Cipher __sourceSpill1905_12 = (local1_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1905_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1905_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1905_15 = new byte[8];
    (__sourceSpill1905_15)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local2_life16 = 1;
    while ((local2_life16 < 8)) {
        (__sourceSpill1905_15)[local2_life16] = ((byte) ((int) ((local11_life6 << (local2_life16 * 8)) >>> 56)));
        local2_life16 += 1;
    }
    byte[] __sourcePreallocation1905_17 = __sourceSpill1905_15;
    ((javax.crypto.Cipher)(__sourceSpill1905_12)).init(((int)(__sourceSpill1905_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1905_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1905_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life20 = new long[7];
    int local4_life21 = 0;
    java.lang.String local5_life22;
    int local6_life24 = ((java.lang.String)((local5_life22 = "Jø\027£mÙÃ Ú\004ìo¼Nï® þ0nëg³H\003\036ç@\"w´¾\fØ"))).length();
    int local3_life25 = 0;
    do {
        java.lang.String __sourceSpill1905_26 = local5_life22;
        int __sourceSpill1905_27 = local3_life25;
        local3_life25 += 8;
        byte[] local7_life30 = ((java.lang.String)(((java.lang.String)(__sourceSpill1905_26)).substring(((int)(__sourceSpill1905_27)), ((int)(local3_life25))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1905_31 = local0_life20;
        int __sourceSpill1905_32 = local4_life21;
        local4_life21 += 1;
        long local8_life33 = (((((((((((long) (local7_life30)[0]) & 255L) << 56) | ((((long) (local7_life30)[1]) & 255L) << 48)) | ((((long) (local7_life30)[2]) & 255L) << 40)) | ((((long) (local7_life30)[3]) & 255L) << 32)) | ((((long) (local7_life30)[4]) & 255L) << 24)) | ((((long) (local7_life30)[5]) & 255L) << 16)) | ((((long) (local7_life30)[6]) & 255L) << 8)) | (((long) (local7_life30)[7]) & 255L));
        byte[] __sourceSpill1905_34 = new byte[8];
        (__sourceSpill1905_34)[0] = ((byte) ((int) (local8_life33 >>> 56)));
        (__sourceSpill1905_34)[1] = ((byte) ((int) (local8_life33 >>> 48)));
        (__sourceSpill1905_34)[2] = ((byte) ((int) (local8_life33 >>> 40)));
        (__sourceSpill1905_34)[3] = ((byte) ((int) (local8_life33 >>> 32)));
        (__sourceSpill1905_34)[4] = ((byte) ((int) (local8_life33 >>> 24)));
        (__sourceSpill1905_34)[5] = ((byte) ((int) (local8_life33 >>> 16)));
        (__sourceSpill1905_34)[6] = ((byte) ((int) (local8_life33 >>> 8)));
        (__sourceSpill1905_34)[7] = ((byte) ((int) local8_life33));
        javax.crypto.Cipher __sourceSpill1905_35 = local1_life10;
        byte[] local10_life37 = ((javax.crypto.Cipher)(__sourceSpill1905_35)).doFinal(((byte[])(__sourceSpill1905_34)));
        (__sourceSpill1905_31)[__sourceSpill1905_32] = (((((((((((long) (local10_life37)[0]) & 255L) << 56) | ((((long) (local10_life37)[1]) & 255L) << 48)) | ((((long) (local10_life37)[2]) & 255L) << 40)) | ((((long) (local10_life37)[3]) & 255L) << 32)) | ((((long) (local10_life37)[4]) & 255L) << 24)) | ((((long) (local10_life37)[5]) & 255L) << 16)) | ((((long) (local10_life37)[6]) & 255L) << 8)) | (((long) (local10_life37)[7]) & 255L));
    } while ((!(local3_life25 >= local6_life24)));
    local6_life24 = ((java.lang.String)((local5_life22 = "ËÅÕX³:ÐR\f/"))).length();
    local3_life25 = 0;
    do {
        java.lang.String __sourceSpill1905_39 = local5_life22;
        int __sourceSpill1905_40 = local3_life25;
        local3_life25 += 8;
        byte[] local7_life43 = ((java.lang.String)(((java.lang.String)(__sourceSpill1905_39)).substring(((int)(__sourceSpill1905_40)), ((int)(local3_life25))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1905_44 = local0_life20;
        int __sourceSpill1905_45 = local4_life21;
        local4_life21 += 1;
        long local8_life46 = (((((((((((long) (local7_life43)[0]) & 255L) << 56) | ((((long) (local7_life43)[1]) & 255L) << 48)) | ((((long) (local7_life43)[2]) & 255L) << 40)) | ((((long) (local7_life43)[3]) & 255L) << 32)) | ((((long) (local7_life43)[4]) & 255L) << 24)) | ((((long) (local7_life43)[5]) & 255L) << 16)) | ((((long) (local7_life43)[6]) & 255L) << 8)) | (((long) (local7_life43)[7]) & 255L));
        byte[] __sourceSpill1905_47 = new byte[8];
        (__sourceSpill1905_47)[0] = ((byte) ((int) (local8_life46 >>> 56)));
        (__sourceSpill1905_47)[1] = ((byte) ((int) (local8_life46 >>> 48)));
        (__sourceSpill1905_47)[2] = ((byte) ((int) (local8_life46 >>> 40)));
        (__sourceSpill1905_47)[3] = ((byte) ((int) (local8_life46 >>> 32)));
        (__sourceSpill1905_47)[4] = ((byte) ((int) (local8_life46 >>> 24)));
        (__sourceSpill1905_47)[5] = ((byte) ((int) (local8_life46 >>> 16)));
        (__sourceSpill1905_47)[6] = ((byte) ((int) (local8_life46 >>> 8)));
        (__sourceSpill1905_47)[7] = ((byte) ((int) local8_life46));
        javax.crypto.Cipher __sourceSpill1905_48 = local1_life10;
        byte[] local10_life50 = ((javax.crypto.Cipher)(__sourceSpill1905_48)).doFinal(((byte[])(__sourceSpill1905_47)));
        (__sourceSpill1905_44)[__sourceSpill1905_45] = (((((((((((long) (local10_life50)[0]) & 255L) << 56) | ((((long) (local10_life50)[1]) & 255L) << 48)) | ((((long) (local10_life50)[2]) & 255L) << 40)) | ((((long) (local10_life50)[3]) & 255L) << 32)) | ((((long) (local10_life50)[4]) & 255L) << 24)) | ((((long) (local10_life50)[5]) & 255L) << 16)) | ((((long) (local10_life50)[6]) & 255L) << 8)) | (((long) (local10_life50)[7]) & 255L));
    } while ((!(local3_life25 >= local6_life24)));
    java.lang.String[] __sourceSpill1905_51 = new java.lang.String[((int) (local0_life20)[6])];
    (__sourceSpill1905_51)[0] = "END";
    (__sourceSpill1905_51)[1] = "BYTE";
    (__sourceSpill1905_51)[2] = "SHORT";
    (__sourceSpill1905_51)[3] = "INT";
    (__sourceSpill1905_51)[4] = "LONG";
    (__sourceSpill1905_51)[5] = "FLOAT";
    (__sourceSpill1905_51)[((int) (local0_life20)[0])] = "DOUBLE";
    (__sourceSpill1905_51)[((int) (local0_life20)[2])] = "BYTE[]";
    (__sourceSpill1905_51)[((int) (local0_life20)[3])] = "STRING";
    (__sourceSpill1905_51)[((int) (local0_life20)[1])] = "LIST";
    (__sourceSpill1905_51)[((int) (local0_life20)[4])] = "COMPOUND";
    (__sourceSpill1905_51)[((int) (local0_life20)[5])] = "INT[]";
    a = ((java.lang.String[])(__sourceSpill1905_51));
}


public boolean equals(java.lang.Object p0) {
int forwardValue5534_17_0;
    int forwardValue5534_26_0;
    int forwardValue5534_28_0;
    int spill5534_0;
    byte spill5534_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTBase life5_16;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.nbt.NBTBase.f ^ 57217237680073L);
    life4_5 = net.minecraft.nbt.NBTBase.b();
    spill5534_0 = ((p0 instanceof net.minecraft.nbt.NBTBase) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue5534_17_0 = spill5534_0;
        break forward_join_17;
    }
    if (!((spill5534_0 != 0))) {
        break forward_join_16;
    }
    life5_16 = ((net.minecraft.nbt.NBTBase)(p0));
    if (!((life4_5 != null))) {
        break forward_join_18;
    }
    }
    forwardValue5534_17_0 = 0;
    }
    return ((forwardValue5534_17_0) != 0);
    }
    spill5534_1 = this.a();
    if (!((life4_5 == null))) {
        forwardValue5534_26_0 = ((int)(spill5534_1));
        break forward_join_26;
    }
    if (!((spill5534_1 == ((net.minecraft.nbt.NBTBase)(life5_16)).a()))) {
        break forward_join_27;
    }
    forwardValue5534_26_0 = 1;
    }
    forwardValue5534_28_0 = forwardValue5534_26_0;
    break forward_join_28;
    }
    forwardValue5534_28_0 = 0;
    }
    return ((forwardValue5534_28_0) != 0);
}


public abstract java.lang.String toString();

public int hashCode() {
return this.a();
}


public static void b(java.lang.String p0) {
net.minecraft.nbt.NBTBase.b = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return net.minecraft.nbt.NBTBase.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected java.lang.String a__String() {
return ((net.minecraft.nbt.NBTBase)(this)).toString();
}


abstract void a(java.io.DataOutput p0) throws java.io.IOException;

abstract void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException;

public abstract byte a();

protected static net.minecraft.nbt.NBTBase a(byte p0) {
long life1_3;
    forest_join_54: {
    forest_join_50: {
    forest_join_46: {
    forest_join_42: {
    forest_join_38: {
    forest_join_34: {
    forest_join_30: {
    forest_join_26: {
    forest_join_22: {
    forest_join_18: {
    forest_join_14: {
    forest_join_10: {
    forest_join_6: {
    life1_3 = (net.minecraft.nbt.NBTBase.f ^ 96442885069233L);
    switch (((int)(p0))) {
case 0:
{
        break forest_join_6;
    }
case 1:
{
        break forest_join_10;
    }
case 2:
{
        break forest_join_14;
    }
case 3:
{
        break forest_join_18;
    }
case 4:
{
        break forest_join_22;
    }
case 5:
{
        break forest_join_26;
    }
case 6:
{
        break forest_join_30;
    }
case 7:
{
        break forest_join_34;
    }
case 8:
{
        break forest_join_38;
    }
case 9:
{
        break forest_join_42;
    }
case 10:
{
        break forest_join_46;
    }
case 11:
{
        break forest_join_50;
    }
default:
{
        break forest_join_54;
    }
}
    }
    return new moom.yx();
    }
    return new moom.yp();
    }
    return new moom.yu();
    }
    return new moom.ys();
    }
    return new moom.yt();
    }
    return new moom.yr();
    }
    return new moom.yq();
    }
    return new moom.yv();
    }
    return new moom.yA();
    }
    return new net.minecraft.nbt.NBTTagList();
    }
    return new net.minecraft.nbt.NBTTagCompound();
    }
    return new moom.yy();
    }
    return null;
}


public abstract net.minecraft.nbt.NBTBase a__yn();

public boolean a__Boolean() {
return ((0) != 0);
}

}
