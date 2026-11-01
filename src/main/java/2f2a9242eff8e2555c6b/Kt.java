package moom;


public class Kt extends moom.Kp {

private static long f;

private static java.lang.String l;

public Kt() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }


private static void __sourceConstructorBody_98c3ea5380246294(moom.Kt receiver) throws Throwable {

long local1 = (moom.Kt.f ^ 68155981672706L);

    moom.Kt.__sourceConstructorInit_98c3ea5380246294_0(((moom.Kt)(receiver)), ((java.lang.Object)(net.minecraft.entity.monster.EntitySkeleton.class)), ((java.lang.String)(moom.Kt.l)), ((float)(0x1.666666p-1f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_98c3ea5380246294_0(moom.Kt a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-454353258270122502L)), ((long)(5037659363951261780L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(69941113535692L)))));
    long local0_life6 = (moom.Kt.f ^ 47133622250329L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill657_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill657_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill657_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill657_13 = new byte[8];
    (__sourceSpill657_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill657_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation657_15 = __sourceSpill657_13;
    ((javax.crypto.Cipher)(__sourceSpill657_10)).init(((int)(__sourceSpill657_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill657_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation657_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill657_19 = ((java.lang.String)("\013ò\037\020m¦Ú<ðr\"")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill657_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill657_20)).doFinal(((byte[])(__sourceSpill657_19)));
    l = ((java.lang.String)(((java.lang.String)(moom.Kt.b(((byte[])(local4_life22))))).intern()));
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
        byte[] spill2959_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2959_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2959_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2959_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2959_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2959_2)[life4_9];
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
return new moom.iZ();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    moom.mY local4 = new moom.mY(local3);
    net.minecraft.client.renderer.entity.Render.a(((moom.mW)(local4)), ((moom.iT)(((moom.iT)(p0)))));
    ((moom.mY)(local4)).m = ((moom.iQ)(p0));
    ((moom.mY)(local4)).c = ((float)(p1));
    return local4;
}

}
