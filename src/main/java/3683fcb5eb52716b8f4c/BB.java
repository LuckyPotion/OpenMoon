package moom;


public class BB extends net.minecraft.server.management.ServerConfigurationManager {

private net.minecraft.nbt.NBTTagCompound w;

private static long x;

private static long C;

public BB(net.minecraft.server.integrated.IntegratedServer p0) { super((moom.Bl)null); }

private static void __sourceConstructorBody_cf837157efd6cb9f(moom.BB receiver, net.minecraft.server.integrated.IntegratedServer p0) throws Throwable {
long local2 = (moom.BB.x ^ 104063124138112L);
    moom.BB.__sourceConstructorInit_cf837157efd6cb9f_0(((moom.BB)(receiver)), ((net.minecraft.server.integrated.IntegratedServer)(p0)));
    ((moom.BB)(receiver)).a(((int)(((int) moom.BB.C))));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_cf837157efd6cb9f_0(moom.BB a0, net.minecraft.server.integrated.IntegratedServer a1) throws E;

static {
x = ((long)(((moom._a)(moom._c.a(((long)(35815460327405335L)), ((long)(-3504177336675709592L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121377219133529L)))));
    long local0_life6 = (moom.BB.x ^ 65195509338154L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill485_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill485_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill485_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill485_13 = new byte[8];
    (__sourceSpill485_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill485_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation485_15 = __sourceSpill485_13;
    ((javax.crypto.Cipher)(__sourceSpill485_10)).init(((int)(__sourceSpill485_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill485_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation485_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5008912823416442973L;
    byte[] __sourceSpill485_19 = new byte[8];
    (__sourceSpill485_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill485_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill485_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill485_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill485_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill485_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill485_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill485_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill485_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill485_20)).doFinal(((byte[])(__sourceSpill485_19)));
    C = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.nbt.NBTTagCompound a__yw() {
return this.w;
}


protected void a__Void(net.minecraft.entity.player.EntityPlayerMP p0) {
long local2 = (moom.BB.x ^ 33040870421180L);
    net.minecraft.entity.Entity[] local4 = net.minecraft.server.integrated.IntegratedServer.a__Arrayr3();
    if ((local4 == null)) {
        if (((java.lang.String)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__String())).equals(((java.lang.Object)(((net.minecraft.server.integrated.IntegratedServer)(((moom.BB)(this)).a__Bm())).e__String())))) {
        this.w = ((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()));
        ((net.minecraft.entity.player.EntityPlayerMP)(p0)).a(((net.minecraft.nbt.NBTTagCompound)(this.w)));
    }
        super.a__Void(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    }
    return;
}


public moom.Bl a__Bl() {
return ((moom.BB)(this)).a__Bm();
}


public java.lang.String a(java.net.SocketAddress p0, com.mojang.authlib.GameProfile p1) {
moom.BB forwardValue1486_23_0;
    java.lang.String forwardValue1486_26_0;
    moom.BB spill1486_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_26: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (moom.BB.x ^ 107499573642887L);
    life5_5 = net.minecraft.server.integrated.IntegratedServer.a__Arrayr3();
    if (!(((java.lang.String)(((com.mojang.authlib.GameProfile)(p1)).getName())).equalsIgnoreCase(((java.lang.String)(((net.minecraft.server.integrated.IntegratedServer)(((moom.BB)(this)).a__Bm())).e__String()))))) {
        break forward_join_22;
    }
    spill1486_0 = this;
    if (!((life5_5 == null))) {
        forwardValue1486_23_0 = spill1486_0;
        break forward_join_23;
    }
    if (!((((moom.BB)(spill1486_0)).a__tr(((java.lang.String)(((com.mojang.authlib.GameProfile)(p1)).getName()))) != null))) {
        break forward_join_22;
    }
    forwardValue1486_26_0 = "That name is already taken.";
    break forward_join_26;
    }
    forwardValue1486_23_0 = this;
    }
    forwardValue1486_26_0 = __sourceIntrinsic_69c84345a285_call1486_8(forwardValue1486_23_0, p0, p1);
    }
    return forwardValue1486_26_0;
}


public net.minecraft.server.integrated.IntegratedServer a__Bm() {
return ((net.minecraft.server.integrated.IntegratedServer)(super.a__Bl()));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69c84345a285_call1486_8(moom.BB a0, java.net.SocketAddress a1, com.mojang.authlib.GameProfile a2) throws E;
}
