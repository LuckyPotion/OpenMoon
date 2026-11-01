package moom;


public class Ku extends moom.Kp {

private static long f;

private static java.lang.String l;

public Ku() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_6c5f9e930fc6853a(moom.Ku receiver) throws Throwable {

long local1 = (moom.Ku.f ^ 24049845767783L);

    moom.Ku.__sourceConstructorInit_6c5f9e930fc6853a_0(((moom.Ku)(receiver)), ((java.lang.Object)(net.minecraft.entity.monster.EntityZombie.class)), ((java.lang.String)(moom.Ku.l)), ((float)(0x1.0p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6c5f9e930fc6853a_0(moom.Ku a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(3940943349747473306L)), ((long)(-7004686239232418168L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135819756269484L)))));
    long local0_life6 = (moom.Ku.f ^ 69736638119859L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill658_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill658_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill658_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill658_13 = new byte[8];
    (__sourceSpill658_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill658_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation658_15 = __sourceSpill658_13;
    ((javax.crypto.Cipher)(__sourceSpill658_10)).init(((int)(__sourceSpill658_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill658_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation658_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill658_19 = ((java.lang.String)("nH{ôJQ\0203")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill658_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill658_20)).doFinal(((byte[])(__sourceSpill658_19)));
    l = ((java.lang.String)(((java.lang.String)(moom.Ku.b(((byte[])(local4_life22))))).intern()));
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
        byte[] spill2960_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2960_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2960_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2960_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2960_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2960_2)[life4_9];
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
return new moom.iY();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.mZ local4 = new moom.mZ(local3);
    net.minecraft.client.renderer.entity.Render.a(((moom.mW)(local4)), ((moom.iT)(((moom.iT)(p0)))));
    ((moom.mZ)(local4)).m = ((moom.iQ)(p0));
    ((moom.mZ)(local4)).c = ((float)(p1));
    return local4;
}

}
