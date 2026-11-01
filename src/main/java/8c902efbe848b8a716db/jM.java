package moom;


public class jM {

private static org.apache.logging.log4j.Logger a;

private net.minecraft.client.Minecraft b;

private java.util.List<moom.jL> c;

private static long d;

private static long e;

public jM(net.minecraft.client.Minecraft p0) {
super();
    this.c = com.google.common.collect.Lists.newArrayList();
    this.b = p0;
    (this).a__Void();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-1958073948973074044L)), ((long)(-1941149608740793371L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227430839538862L)))));
    long local0_life6 = (moom.jM.d ^ 40201919213450L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill895_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill895_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill895_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill895_13 = new byte[8];
    (__sourceSpill895_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill895_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation895_15 = __sourceSpill895_13;
    ((javax.crypto.Cipher)(__sourceSpill895_10)).init(((int)(__sourceSpill895_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill895_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation895_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1722417755937911033L;
    byte[] __sourceSpill895_19 = new byte[8];
    (__sourceSpill895_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill895_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill895_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill895_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill895_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill895_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill895_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill895_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill895_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill895_20)).doFinal(((byte[])(__sourceSpill895_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_eb0bccd7636cddedea84(moom.jM a0) throws E;
private static final class __SourceHandler_eb0bccd7636cddedea84 {

public static void f446(moom.jM receiver) throws Throwable {
    net.minecraft.nbt.NBTTagCompound lexicalValue446_24_0;
    net.minecraft.nbt.NBTTagCompound spill446_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.nbt.NBTTagCompound life4_17;
    net.minecraft.nbt.NBTTagList life5_31;
    int life6_33;
    lexical_join_48: {
    lexical_join_24: {
    lexical_join_23: {
    life1_3 = (__fieldRead446_0() ^ 3356211468575L);
    life3_5 = __call446_1();
    __call446_3(__fieldRead446_2(receiver));
    life4_17 = __call446_6(new java.io.File(__fieldRead446_5(__fieldRead446_4(receiver)), "servers.dat"));
    spill446_0 = life4_17;
    if (!((life3_5 == null))) {
        lexicalValue446_24_0 = spill446_0;
        break lexical_join_24;
    }
    if (!((spill446_0 == null))) {
        break lexical_join_23;
    }
    return;
    }
    lexicalValue446_24_0 = life4_17;
    }
    life5_31 = __call446_8(lexicalValue446_24_0, "servers", ((int) __fieldRead446_7()));
    life6_33 = 0;
    lexical_cycle_31: while (true) {
    if (!((life6_33 < __call446_9(life5_31)))) {
        break lexical_join_48;
    }
    __call446_13(__fieldRead446_10(receiver), __call446_12(__call446_11(life5_31, life6_33)));
    life6_33 += 1;
    if (!((life3_5 == null))) {
        break lexical_join_48;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    return;
}
public static void h446_0(java.lang.Exception p0) throws Throwable {
    throw __call2044600_0(p0);
}
public static void h446_1(java.lang.Exception p0) throws Throwable {
    throw __call2044601_0(p0);
}
public static void h446_2(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2044602_1(__fieldRead2044602_0(), "Couldn't load server list", local1);
    return;
}
private static native long __fieldRead446_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call446_1() throws Throwable;
private static native java.util.List __fieldRead446_2(moom.jM a0) throws Throwable;
private static native void __call446_3(java.util.List a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead446_4(moom.jM a0) throws Throwable;
private static native java.io.File __fieldRead446_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call446_6(java.io.File a0) throws Throwable;
private static native long __fieldRead446_7() throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call446_8(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call446_9(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.util.List __fieldRead446_10(moom.jM a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call446_11(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native moom.jL __call446_12(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native boolean __call446_13(java.util.List a0, moom.jL a1) throws Throwable;
private static native java.lang.Exception __call2044600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2044601_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2044602_0() throws Throwable;
private static native void __call2044602_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4973b6ebc120ca57880d(moom.jM a0) throws E;
private static final class __SourceHandler_4973b6ebc120ca57880d {

public static void f174(moom.jM receiver) throws Throwable {
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.nbt.NBTTagList life4_9;
    java.util.Iterator life5_13;
    moom.jL life6_20;
    net.minecraft.nbt.NBTTagCompound life5_35;
    lexical_join_46: {
    lexical_join_29: {
    life1_3 = (__fieldRead174_0() ^ 19213176109920L);
    life3_5 = __call174_1();
    life4_9 = new net.minecraft.nbt.NBTTagList();
    life5_13 = __call174_3(__fieldRead174_2(receiver));
    lexical_cycle_14: while (true) {
    if (!(__call174_4(life5_13))) {
        break lexical_join_29;
    }
    life6_20 = __cast174_6(__call174_5(life5_13));
    __call174_8(life4_9, __call174_7(life6_20));
    if (!((life3_5 == null))) {
        break lexical_join_46;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    life5_35 = new net.minecraft.nbt.NBTTagCompound();
    __call174_9(life5_35, "servers", life4_9);
    __call174_12(life5_35, new java.io.File(__fieldRead174_11(__fieldRead174_10(receiver)), "servers.dat"));
    }
    return;
}
public static void h174_0(java.lang.Exception p0) throws Throwable {
    throw __call2017400_0(p0);
}
public static void h174_1(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2017401_1(__fieldRead2017401_0(), "Couldn't save server list", local1);
    return;
}
private static native long __fieldRead174_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call174_1() throws Throwable;
private static native java.util.List __fieldRead174_2(moom.jM a0) throws Throwable;
private static native java.util.Iterator __call174_3(java.util.List a0) throws Throwable;
private static native boolean __call174_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call174_5(java.util.Iterator a0) throws Throwable;
private static native moom.jL __cast174_6(java.lang.Object a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call174_7(moom.jL a0) throws Throwable;
private static native void __call174_8(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call174_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead174_10(moom.jM a0) throws Throwable;
private static native java.io.File __fieldRead174_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call174_12(net.minecraft.nbt.NBTTagCompound a0, java.io.File a1) throws Throwable;
private static native java.lang.Exception __call2017400_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2017401_0() throws Throwable;
private static native void __call2017401_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a987bc92b58b686e23e9(moom.jL a0) throws E;
private static final class __SourceHandler_a987bc92b58b686e23e9 {

public static void f1069(moom.jL p0) throws Throwable {
    net.minecraft.entity.Entity[] spill1069_0;
    long life1_3;
    moom.jM life4_9;
    net.minecraft.entity.Entity[] life3_12;
    int life5_14;
    moom.jL life6_22;
    lexical_join_50: {
    lexical_join_48: {
    life1_3 = (__fieldRead1069_0() ^ 130242683461458L);
    spill1069_0 = __call1069_1();
    life4_9 = new moom.jM(__call1069_2());
    __call1069_3(life4_9);
    life3_12 = spill1069_0;
    life5_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_46: {
    lexical_join_45: {
    if (!((life5_14 < __call1069_4(life4_9)))) {
        break lexical_join_48;
    }
    life6_22 = __call1069_5(life4_9, life5_14);
    if (!((life3_12 == null))) {
        break lexical_join_50;
    }
    if (!((life3_12 == null))) {
        break lexical_join_46;
    }
    if (!(__call1069_8(__fieldRead1069_6(life6_22), __fieldRead1069_7(p0)))) {
        break lexical_join_45;
    }
    if (!(__call1069_11(__fieldRead1069_9(life6_22), __fieldRead1069_10(p0)))) {
        break lexical_join_45;
    }
    __call1069_12(life4_9, life5_14, p0);
    if (!((life3_12 != null))) {
        break lexical_join_48;
    }
    }
    life5_14 += 1;
    }
    if (!((life3_12 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    __call1069_13(life4_9);
    }
    return;
}
public static void h1069_0(moom.Oo p0) throws Throwable {
    throw __call1106900_0(p0);
}
public static void h1069_1(moom.Oo p0) throws Throwable {
    throw __call1106901_0(p0);
}
public static void h1069_2(moom.Oo p0) throws Throwable {
    throw __call1106902_0(p0);
}
public static void h1069_3(moom.Oo p0) throws Throwable {
    throw __call1106903_0(p0);
}
public static void h1069_4(moom.Oo p0) throws Throwable {
    throw __call1106904_0(p0);
}
private static native long __fieldRead1069_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1069_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call1069_2() throws Throwable;
private static native void __call1069_3(moom.jM a0) throws Throwable;
private static native int __call1069_4(moom.jM a0) throws Throwable;
private static native moom.jL __call1069_5(moom.jM a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead1069_6(moom.jL a0) throws Throwable;
private static native java.lang.String __fieldRead1069_7(moom.jL a0) throws Throwable;
private static native boolean __call1069_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1069_9(moom.jL a0) throws Throwable;
private static native java.lang.String __fieldRead1069_10(moom.jL a0) throws Throwable;
private static native boolean __call1069_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call1069_12(moom.jM a0, int a1, moom.jL a2) throws Throwable;
private static native void __call1069_13(moom.jM a0) throws Throwable;
private static native java.lang.Exception __call1106900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106904_0(moom.Oo a0) throws Throwable;

}


public static void b(moom.jL p0) { __sourceHandlerCall_a987bc92b58b686e23e9(p0); }


public void b() { __sourceHandlerCall_4973b6ebc120ca57880d(this); }


public void a(int p0, int p1) {
java.lang.Object local3 = ((moom.jM)(this)).a(((int)(p0)));
    ((java.util.List)(this.c)).set(((int)(p0)), ((java.lang.Object)(((moom.jM)(this)).a(((int)(p1))))));
    ((java.util.List)(this.c)).set(((int)(p1)), ((java.lang.Object)(local3)));
    ((moom.jM)(this)).b();
    return;
}


public void a(int p0, moom.jL p1) {
((java.util.List)(this.c)).set(((int)(p0)), ((java.lang.Object)(p1)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a__Void() { __sourceHandlerCall_eb0bccd7636cddedea84(this); }


public moom.jL a(int p0) {
return ((moom.jL)(((java.util.List)(this.c)).get(((int)(p0)))));
}


public void a__Void(int p0) {
((java.util.List)(this.c)).remove(((int)(p0)));
    return;
}


public void a(moom.jL p0) {
((java.util.List)(this.c)).add(((java.lang.Object)(p0)));
    return;
}


public int a() {
return ((java.util.List)(this.c)).size();
}

}
