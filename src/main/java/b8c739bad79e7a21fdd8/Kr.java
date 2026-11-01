package moom;


public class Kr extends moom.Kp {

private static long f;

private static java.lang.String l;

public Kr() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_bdfae93dfc82984c(moom.Kr receiver) throws Throwable {

long local1 = (moom.Kr.f ^ 69202957780974L);

    moom.Kr.__sourceConstructorInit_bdfae93dfc82984c_0(((moom.Kr)(receiver)), ((java.lang.Object)(net.minecraft.entity.monster.EntityEnderman.class)), ((java.lang.String)(moom.Kr.l)), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_bdfae93dfc82984c_0(moom.Kr a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(1951834261993525283L)), ((long)(-7710795927723068628L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221302575440963L)))));
    long local0_life6 = (moom.Kr.f ^ 87397139587186L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill655_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill655_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill655_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill655_13 = new byte[8];
    (__sourceSpill655_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill655_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation655_15 = __sourceSpill655_13;
    ((javax.crypto.Cipher)(__sourceSpill655_10)).init(((int)(__sourceSpill655_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill655_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation655_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill655_19 = ((java.lang.String)("Âî\017à\027\007 ëtþè")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill655_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill655_20)).doFinal(((byte[])(__sourceSpill655_19)));
    l = ((java.lang.String)(((java.lang.String)(moom.Kr.b(((byte[])(local4_life22))))).intern()));
}


private static java.lang.String b(byte[] p0) {
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
        byte[] spill2957_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2957_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2957_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2957_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2957_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2957_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public moom.iQ a__iQ() {
return new moom.iW(0x0.0p0f);
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.m5 local4 = new moom.m5(local3);
    ((moom.m5)(local4)).m = ((moom.iQ)(p0));
    ((moom.m5)(local4)).c = ((float)(p1));
    return local4;
}

}
