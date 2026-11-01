package com.moon;


public class kh extends com.moon.kd<moom.zL> {

private static final long c;

private static final java.lang.String d;

public kh(java.lang.Class<moom.zL> p0) {
super(p0);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(8610737806086402420L)), ((long)(6178922619836111592L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(29233285469890L)))));
    long local0_life6 = (com.moon.kh.c ^ 32942156762175L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill216_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill216_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill216_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill216_13 = new byte[8];
    (__sourceSpill216_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill216_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation216_15 = __sourceSpill216_13;
    ((javax.crypto.Cipher)(__sourceSpill216_10)).init(((int)(__sourceSpill216_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill216_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation216_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill216_19 = ((java.lang.String)("ÀéZª^þÁsCpÉ³")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill216_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill216_20)).doFinal(((byte[])(__sourceSpill216_19)));
    d = ((java.lang.String)(((java.lang.String)(com.moon.kh.a(((byte[])(local4_life22))))).intern()));
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
        byte[] spill633_0 = p0;
        life4_9 += 1;
        life5_44 = (spill633_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill633_1 = p0;
        life4_9 += 1;
        life5_76 = (spill633_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill633_2 = p0;
        life4_9 += 1;
        life5_91 = (spill633_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public org.luaj.vm2.LuaTable a__sourceBridge_39790ff3c2(moom.yK p0) {
return ((com.moon.kh)(this)).a(((moom.zL)(((moom.zL)(p0)))));
}


public void a__sourceBridge_bab6a6134e(org.luaj.vm2.LuaTable p0, moom.yK p1) {
((com.moon.kh)(this)).a(((org.luaj.vm2.LuaTable)(p0)), ((moom.zL)(((moom.zL)(p1)))));
}


public void a(org.luaj.vm2.LuaTable p0, moom.zL p1) {
int local3 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("x"))))).toint();
    int local4 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("y"))))).toint();
    int local5 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("z"))))).toint();
    ((moom.zL)(p1)).b(((int)(local3)));
    ((moom.zL)(p1)).c(((int)(local4)));
    ((moom.zL)(p1)).d(((int)(local5)));
    return;
}


public org.luaj.vm2.LuaTable a(moom.zL p0) {
long local2_life2 = (com.moon.kh.c ^ 59109833051928L);
    org.luaj.vm2.LuaTable local4_life3 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(com.moon.kh.d)), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zL)(p0)).a()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)("x")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zL)(p0)).b()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)("y")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zL)(p0)).c()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)("z")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.zL)(p0)).d()))))));
    return local4_life3;
}



}
