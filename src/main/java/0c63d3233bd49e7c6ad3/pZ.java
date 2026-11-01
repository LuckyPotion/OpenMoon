package moom;


public class pZ extends net.minecraft.command.CommandBase {

private static long c;

private static long d;

public pZ() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(7331783750948944463L)), ((long)(6384549356078467352L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(156930704800427L)))));
    long local0_life6 = (moom.pZ.c ^ 53077669299908L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill963_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill963_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill963_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill963_13 = new byte[8];
    (__sourceSpill963_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill963_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation963_15 = __sourceSpill963_13;
    ((javax.crypto.Cipher)(__sourceSpill963_10)).init(((int)(__sourceSpill963_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill963_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation963_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -3435372772545981764L;
    byte[] __sourceSpill963_19 = new byte[8];
    (__sourceSpill963_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill963_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill963_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill963_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill963_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill963_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill963_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill963_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill963_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill963_20)).doFinal(((byte[])(__sourceSpill963_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceHandlerCall_bfb767b38613f7cfd844(moom.pZ a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_bfb767b38613f7cfd844 {

public static void f150(moom.pZ receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue150_42_0;
    int forwardValue150_44_0;
    int forwardValue150_55_0;
    int forwardValue150_57_0;
    int forwardValue150_85_0;
    int forwardValue150_113_0;
    int forwardValue150_120_0;
    net.minecraft.item.ItemStack forwardValue150_122_0;
    net.minecraft.entity.item.EntityItem forwardValue150_138_0;
    net.minecraft.command.ICommandSender forwardValue150_164_0;
    int spill150_0;
    int spill150_1;
    int spill150_2;
    int spill150_3;
    net.minecraft.item.ItemStack spill150_4;
    net.minecraft.entity.item.EntityItem spill150_5;
    net.minecraft.entity.item.EntityItem spill150_6;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_24;
    net.minecraft.item.Item life7_30;
    int life8_52;
    int life9_71;
    net.minecraft.item.ItemStack life10_78;
    java.lang.String life11_93;
    int life11_116;
    net.minecraft.entity.item.EntityItem life12_178;
    net.minecraft.entity.item.EntityItem life12_201;
    forward_join_164: {
    forward_join_163: {
    forward_join_141: {
    forward_join_139: {
    forward_join_138: {
    forward_join_122: {
    forward_join_120: {
    forward_join_113: {
    forward_join_112: {
    forward_join_85: {
    forward_join_81: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_17: {
    life3_3 = (__fieldRead150_0() ^ 106054282334365L);
    life5_5 = __integerCategory150_2(__call150_1());
    if (!(((p1).length < 2))) {
        break forward_join_17;
    }
    throw new moom.cc("commands.give.usage", new java.lang.Object[0]);
    }
    life6_24 = __call150_3(p0, (p1)[0]);
    life7_30 = __call150_4(p0, (p1)[1]);
    spill150_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue150_42_0 = spill150_0;
        break forward_join_42;
    }
    if (!((spill150_0 >= 3))) {
        break forward_join_43;
    }
    forwardValue150_42_0 = __call150_6((p1)[2], 1, ((int) __fieldRead150_5()));
    }
    forwardValue150_44_0 = forwardValue150_42_0;
    break forward_join_44;
    }
    forwardValue150_44_0 = 1;
    }
    life8_52 = forwardValue150_44_0;
    spill150_1 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue150_55_0 = spill150_1;
        break forward_join_55;
    }
    if (!((spill150_1 >= 4))) {
        break forward_join_56;
    }
    forwardValue150_55_0 = __call150_7((p1)[3]);
    }
    forwardValue150_57_0 = forwardValue150_55_0;
    break forward_join_57;
    }
    forwardValue150_57_0 = 0;
    }
    life9_71 = forwardValue150_57_0;
    life10_78 = new net.minecraft.item.ItemStack(life7_30, life8_52, life9_71);
    spill150_2 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue150_85_0 = spill150_2;
        break forward_join_85;
    }
    if (!((spill150_2 >= 5))) {
        break forward_join_81;
    }
    life11_93 = __call150_9(__call150_8(p0, p1, 4));
    __call150_11(life10_78, __call150_10(life11_93));
    }
    forwardValue150_85_0 = __integerCategory150_14(__call150_13(__fieldRead150_12(life6_24), life10_78));
    }
    life11_116 = forwardValue150_85_0;
    spill150_3 = life11_116;
    if (!((life5_5 == 0))) {
        forwardValue150_113_0 = spill150_3;
        break forward_join_113;
    }
    if (!((spill150_3 != 0))) {
        break forward_join_112;
    }
    __call150_20(__fieldRead150_15(life6_24), life6_24, "random.pop", 0x1.99999ap-3f, ((((__call150_17(__call150_16(life6_24)) - __call150_19(__call150_18(life6_24))) * 0x1.666666p-1f) + 0x1.0p0f) * 0x1.0p1f));
    __call150_22(__fieldRead150_21(life6_24));
    }
    forwardValue150_113_0 = life11_116;
    }
    if (!((life5_5 == 0))) {
        forwardValue150_120_0 = forwardValue150_113_0;
        break forward_join_120;
    }
    if (!((forwardValue150_113_0 != 0))) {
        break forward_join_141;
    }
    spill150_4 = life10_78;
    if (!((life5_5 == 0))) {
        forwardValue150_122_0 = spill150_4;
        break forward_join_122;
    }
    forwardValue150_120_0 = __fieldRead150_23(spill150_4);
    }
    if (!((forwardValue150_120_0 <= 0))) {
        break forward_join_141;
    }
    forwardValue150_122_0 = life10_78;
    }
    __fieldWrite150_24(forwardValue150_122_0, 1);
    __call150_26(p0, __fieldRead150_25(), life8_52);
    life12_178 = __call150_27(life6_24, life10_78, 0);
    spill150_5 = life12_178;
    if (!((life5_5 == 0))) {
        forwardValue150_138_0 = spill150_5;
        break forward_join_138;
    }
    if (!((spill150_5 != null))) {
        break forward_join_139;
    }
    forwardValue150_138_0 = life12_178;
    }
    __call150_28(forwardValue150_138_0);
    }
    if (!((life5_5 != 0))) {
        break forward_join_163;
    }
    }
    __call150_31(p0, __fieldRead150_29(), (life8_52 - __fieldRead150_30(life10_78)));
    life12_201 = __call150_32(life6_24, life10_78, 0);
    spill150_6 = life12_201;
    if (!((life5_5 == 0))) {
        forwardValue150_164_0 = spill150_6;
        break forward_join_164;
    }
    if (!((spill150_6 != null))) {
        break forward_join_163;
    }
    __call150_33(life12_201);
    __call150_35(life12_201, __call150_34(life6_24));
    }
    forwardValue150_164_0 = p0;
    }
    __call150_39(forwardValue150_164_0, receiver, "commands.give.success", new java.lang.Object[] {__call150_36(life10_78), __call150_37(life8_52), __call150_38(life6_24)});
    return;
}
public static void h150_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015000_0(p0);
}
public static void h150_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015001_0(p0);
}
public static void h150_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015002_0(p0);
}
public static void h150_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015003_0(p0);
}
public static void h150_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015004_0(p0);
}
public static void h150_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015005_0(p0);
}
public static void h150_6(net.minecraft.nbt.NBTException p0, net.minecraft.entity.item.EntityItem p1) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.give.tagError", new java.lang.Object[] {__call3015006_0(life1_2)});
}
public static void h150_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015007_0(p0);
}
public static void h150_8(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015008_0(p0);
}
public static void h150_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015009_0(p0);
}
public static void h150_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015010_0(p0);
}
public static void h150_11(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015011_0(p0);
}
public static void h150_12(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015012_0(p0);
}
public static void h150_13(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015013_0(p0);
}
public static void h150_14(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015014_0(p0);
}
private static native long __fieldRead150_0() throws Throwable;
private static native boolean __call150_1() throws Throwable;
private static native int __integerCategory150_2(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call150_3(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call150_4(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native long __fieldRead150_5() throws Throwable;
private static native int __call150_6(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __call150_7(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call150_8(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call150_9(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call150_10(java.lang.String a0) throws Throwable;
private static native void __call150_11(net.minecraft.item.ItemStack a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead150_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call150_13(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __integerCategory150_14(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead150_15(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.util.Random __call150_16(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __call150_17(java.util.Random a0) throws Throwable;
private static native java.util.Random __call150_18(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native float __call150_19(java.util.Random a0) throws Throwable;
private static native void __call150_20(net.minecraft.world.World a0, net.minecraft.entity.player.EntityPlayerMP a1, java.lang.String a2, float a3, float a4) throws Throwable;
private static native moom.v8 __fieldRead150_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call150_22(moom.v8 a0) throws Throwable;
private static native int __fieldRead150_23(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite150_24(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead150_25() throws Throwable;
private static native void __call150_26(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call150_27(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native void __call150_28(net.minecraft.entity.item.EntityItem a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead150_29() throws Throwable;
private static native int __fieldRead150_30(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call150_31(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call150_32(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native void __call150_33(net.minecraft.entity.item.EntityItem a0) throws Throwable;
private static native java.lang.String __call150_34(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call150_35(net.minecraft.entity.item.EntityItem a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call150_36(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.Integer __call150_37(int a0) throws Throwable;
private static native java.lang.String __call150_38(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call150_39(net.minecraft.command.ICommandSender a0, moom.pZ a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3015000_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015001_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015002_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015003_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015004_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015005_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3015006_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015007_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015008_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015009_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015010_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015011_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015012_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015013_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015014_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_911797e2c46e0dbc319c(moom.pZ a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_911797e2c46e0dbc319c {

public static java.util.List f1134(moom.pZ receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1134_22_0;
    int forwardValue1134_22_1;
    java.lang.String[] forwardValue1134_24_0;
    java.util.List forwardValue1134_29_0;
    int spill1134_0;
    int spill1134_1;
    java.lang.String[] spill1134_2;
    long life4_3;
    int life6_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_22: {
    forward_join_17: {
    life4_3 = (__fieldRead1134_0() ^ 43415626432798L);
    life6_5 = __integerCategory1134_2(__call1134_1());
    spill1134_0 = (p1).length;
    spill1134_1 = 1;
    if (!((life6_5 != 0))) {
        forwardValue1134_22_0 = spill1134_0;
        forwardValue1134_22_1 = spill1134_1;
        break forward_join_22;
    }
    if (!((spill1134_0 == spill1134_1))) {
        break forward_join_17;
    }
    forwardValue1134_29_0 = __call1134_4(p1, __call1134_3(receiver));
    break forward_join_29;
    }
    spill1134_2 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1134_24_0 = spill1134_2;
        break forward_join_24;
    }
    forwardValue1134_22_0 = (spill1134_2).length;
    forwardValue1134_22_1 = 2;
    }
    if (!((forwardValue1134_22_0 == forwardValue1134_22_1))) {
        break forward_join_28;
    }
    forwardValue1134_24_0 = p1;
    }
    forwardValue1134_29_0 = __call1134_7(forwardValue1134_24_0, __call1134_6(__fieldRead1134_5()));
    break forward_join_29;
    }
    forwardValue1134_29_0 = null;
    }
    return forwardValue1134_29_0;
}
public static void h1134_0(moom.Oo p0) throws Throwable {
    throw __call1113400_0(p0);
}
public static void h1134_1(moom.Oo p0) throws Throwable {
    throw __call1113401_0(p0);
}
public static void h1134_2(moom.Oo p0) throws Throwable {
    throw __call1113402_0(p0);
}
private static native long __fieldRead1134_0() throws Throwable;
private static native boolean __call1134_1() throws Throwable;
private static native int __integerCategory1134_2(boolean value) throws Throwable;
private static native java.lang.String[] __call1134_3(moom.pZ a0) throws Throwable;
private static native java.util.List __call1134_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native moom.DB __fieldRead1134_5() throws Throwable;
private static native java.util.Set __call1134_6(moom.DB a0) throws Throwable;
private static native java.util.List __call1134_7(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.lang.Exception __call1113400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1113401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1113402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_59911084a629020f6d37(moom.pZ a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_59911084a629020f6d37 {

public static boolean f1135(moom.pZ receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1135_11_0;
    int forwardValue1135_13_0;
    int spill1135_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1135_0() ^ 35016624337157L);
    life5_5 = __integerCategory1135_2(__call1135_1());
    spill1135_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1135_11_0 = spill1135_0;
        break forward_join_11;
    }
    if (!((spill1135_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1135_11_0 = 1;
    }
    forwardValue1135_13_0 = forwardValue1135_11_0;
    break forward_join_13;
    }
    forwardValue1135_13_0 = 0;
    }
    return __integerCategory1135_3(forwardValue1135_13_0);
}
public static void h1135_0(moom.Oo p0) throws Throwable {
    throw __call1113500_0(p0);
}
private static native long __fieldRead1135_0() throws Throwable;
private static native boolean __call1135_1() throws Throwable;
private static native int __integerCategory1135_2(boolean value) throws Throwable;
private static native boolean __integerCategory1135_3(int value) throws Throwable;
private static native java.lang.Exception __call1113500_0(moom.Oo a0) throws Throwable;

}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_911797e2c46e0dbc319c(this, p0, p1, p2); }


protected java.lang.String[] a__ArrayString() {
return ((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString();
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_59911084a629020f6d37(this, p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__String() {
return "give";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.give.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_bfb767b38613f7cfd844(this, p0, p1); }

}
