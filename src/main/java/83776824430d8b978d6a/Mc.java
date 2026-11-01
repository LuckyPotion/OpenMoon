package moom;


public class Mc implements net.minecraft.client.renderer.entity.layers.LayerRenderer {

private moom.nr a;

private static final long b;

private static final java.lang.String c;

public Mc(moom.nr p0) {
super();
    this.a = null;
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(935346247453131701L)), ((long)(-3328031893556907732L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(42543888141646L)))));
    long local0_life6 = (moom.Mc.b ^ 127168200551212L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill702_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill702_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill702_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill702_13 = new byte[8];
    (__sourceSpill702_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill702_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation702_15 = __sourceSpill702_13;
    ((javax.crypto.Cipher)(__sourceSpill702_10)).init(((int)(__sourceSpill702_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill702_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation702_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill702_19 = ((java.lang.String)(">\bqÜhê²yR0A¼)9õ)ì\023y$&©XçàLn)")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill702_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill702_20)).doFinal(((byte[])(__sourceSpill702_19)));
    c = ((java.lang.String)(((java.lang.String)(moom.Mc.a(((byte[])(local4_life22))))).intern()));
}


public static void a(java.util.Map p0) {
java.lang.Object lexicalValue965_32_0;
    int lexicalValue965_46_0;
    java.lang.String spill965_0;
    java.lang.Object spill965_1;
    int spill965_2;
    long life1_3;
    java.util.Set life4_7;
    java.lang.String life3_8;
    int life5_10;
    java.util.Iterator life6_13;
    java.lang.Object life7_19;
    java.lang.Object life8_23;
    moom.nr life9_39;
    lexical_join_49: {
    lexical_join_46: {
    lexical_join_45: {
    life1_3 = (moom.Mc.b ^ 74337650084414L);
    spill965_0 = moom.L_.b();
    life4_7 = ((java.util.Map)(p0)).keySet();
    life3_8 = spill965_0;
    life5_10 = 0;
    life6_13 = ((java.util.Set)(life4_7)).iterator();
    lexical_cycle_14: while (true) {
    lexical_join_43: {
    lexical_join_32: {
    if (!(((java.util.Iterator)(life6_13)).hasNext())) {
        break lexical_join_45;
    }
    life7_19 = ((java.util.Iterator)(life6_13)).next();
    life8_23 = ((java.util.Map)(p0)).get(((java.lang.Object)(life7_19)));
    spill965_1 = life8_23;
    if (!((life3_8 == null))) {
        lexicalValue965_32_0 = spill965_1;
        break lexical_join_32;
    }
    spill965_2 = ((spill965_1 instanceof moom.nr) ? 1 : 0);
    if (!((life3_8 == null))) {
        lexicalValue965_46_0 = spill965_2;
        break lexical_join_46;
    }
    if (!((spill965_2 != 0))) {
        break lexical_join_43;
    }
    lexicalValue965_32_0 = life8_23;
    }
    life9_39 = ((moom.nr)(lexicalValue965_32_0));
    ((moom.nr)(life9_39)).a(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(new moom.Mc(life9_39))));
    life5_10 = 1;
    }
    if (!((life3_8 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue965_46_0 = life5_10;
    }
    if (!((lexicalValue965_46_0 == 0))) {
        break lexical_join_49;
    }
    moom.BU.c(((java.lang.String)(moom.Mc.c)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill3203_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3203_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3203_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3203_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3203_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3203_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean a__Boolean() {
return ((0) != 0);
}


protected void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2) {
int forwardValue2712_14_0;
    net.minecraft.entity.EntityLivingBase forwardValue2712_16_0;
    boolean spill2712_0;
    net.minecraft.entity.EntityLivingBase spill2712_1;
    long life4_3;
    java.lang.String life6_5;
    moom.to life7_26;
    moom.iX life8_37;
    forward_join_35: {
    forward_join_16: {
    forward_join_14: {
    life4_3 = (moom.Mc.b ^ 100619098559453L);
    life6_5 = moom.L_.b();
    spill2712_0 = moom.BU.aj();
    if (!((life6_5 == null))) {
        forwardValue2712_14_0 = ((spill2712_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill2712_0)) {
        break forward_join_35;
    }
    spill2712_1 = p0;
    if (!((life6_5 == null))) {
        forwardValue2712_16_0 = spill2712_1;
        break forward_join_16;
    }
    forwardValue2712_14_0 = ((spill2712_1 instanceof moom.to) ? 1 : 0);
    }
    if (!((forwardValue2712_14_0 != 0))) {
        break forward_join_35;
    }
    forwardValue2712_16_0 = p0;
    }
    life7_26 = ((moom.to)(forwardValue2712_16_0));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.z();
    moom.kZ.o();
    life8_37 = ((moom.nr)(this.a)).a__iX();
    moom.L9.a(((moom.iT)(life8_37)), ((moom.to)(life7_26)), ((float)(p1)), ((float)(p2)));
    moom.kZ.p();
    }
    return;
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
this.a(((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p7)), ((float)(p3)));
    return;
}

}
