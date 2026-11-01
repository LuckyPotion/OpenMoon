package com.moon;


public class kf extends com.moon.kd<moom.zv> {

private static long c;

private static java.lang.String d;

public kf(java.lang.Class<moom.zv> p0) {
super(p0);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(4588793287807983969L)), ((long)(-9078626909876214491L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202314859071050L)))));
    long local0_life6 = (com.moon.kf.c ^ 63026083852204L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill214_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill214_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill214_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill214_13 = new byte[8];
    (__sourceSpill214_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill214_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation214_15 = __sourceSpill214_13;
    ((javax.crypto.Cipher)(__sourceSpill214_10)).init(((int)(__sourceSpill214_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill214_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation214_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill214_19 = ((java.lang.String)("ªmÓ1#å")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill214_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill214_20)).doFinal(((byte[])(__sourceSpill214_19)));
    d = ((java.lang.String)(((java.lang.String)(com.moon.kf.a(((byte[])(local4_life22))))).intern()));
}

private static native <E extends Throwable> org.luaj.vm2.LuaTable __sourceHandlerCall_96c65c05a654a768b800(com.moon.kf a0, moom.zv a1) throws E;
private static final class __SourceHandler_96c65c05a654a768b800 {

public static org.luaj.vm2.LuaTable f106(com.moon.kf receiver, moom.zv p0) throws Throwable {
    org.luaj.vm2.LuaTable spill106_0;
    long life2_3;
    org.luaj.vm2.LuaTable life4_7;
    life2_3 = (__fieldRead106_0() ^ 109223309551512L);
    org.luaj.vm2.LuaTable __stackOp106_2_0 = __sourceUninitializedNEW106_1();
    spill106_0 = __stackOp106_2_0;
    __explicitNewInit106_3(__stackOp106_2_0);
    life4_7 = spill106_0;
    __call106_8(life4_7, __fieldRead106_4(), __call106_7(__call106_6(__call106_5(p0))));
    return life4_7;
}
private static native long __fieldRead106_0() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW106_1() throws Throwable;
private static native void __explicitNewInit106_3(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __fieldRead106_4() throws Throwable;
private static native net.minecraft.util.IChatComponent __call106_5(moom.zv a0) throws Throwable;
private static native java.lang.String __call106_6(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native org.luaj.vm2.LuaString __call106_7(java.lang.String a0) throws Throwable;
private static native void __call106_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaString a2) throws Throwable;

}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill631_0 = p0;
        life4_9 += 1;
        life5_44 = (spill631_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill631_1 = p0;
        life4_9 += 1;
        life5_76 = (spill631_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill631_2 = p0;
        life4_9 += 1;
        life5_91 = (spill631_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(org.luaj.vm2.LuaTable p0, moom.zv p1) {
return;
}


public org.luaj.vm2.LuaTable a(moom.zv p0) { return __sourceHandlerCall_96c65c05a654a768b800(this, p0); }

}
