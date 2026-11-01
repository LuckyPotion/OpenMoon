package moom;


public class th extends net.minecraft.entity.monster.EntitySlime {

private static final long cb;

private static final long ub;

public th(net.minecraft.world.World p0) {
super(p0);
    this.ak = true;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-4311647945496365243L)), ((long)(3814259243501449876L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(225412852517944L)))));
    long local0_life6 = (moom.th.cb ^ 75811549065762L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1034_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1034_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1034_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1034_13 = new byte[8];
    (__sourceSpill1034_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1034_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1034_15 = __sourceSpill1034_13;
    ((javax.crypto.Cipher)(__sourceSpill1034_10)).init(((int)(__sourceSpill1034_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1034_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1034_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -1079282287881770749L;
    byte[] __sourceSpill1034_19 = new byte[8];
    (__sourceSpill1034_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1034_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1034_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1034_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1034_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1034_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1034_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1034_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1034_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1034_20)).doFinal(((byte[])(__sourceSpill1034_19)));
    ub = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


protected void D__sourceReturn_da8c82d5d4() {
((moom.th)(this)).u = ((double)(((double) (0x1.ae147ap-2f + (((float) ((moom.th)(this)).o__sourceReturn_8abf5c6871()) * 0x1.99999ap-4f)))));
    ((moom.th)(this)).ad = ((boolean)(true));
    return;
}


protected void F__sourceReturn_da8c82d5d4() {
((moom.th)(this)).u = ((double)(((double) (0x1.c28f5cp-3f + (((float) ((moom.th)(this)).o__sourceReturn_8abf5c6871()) * 0x1.99999ap-5f)))));
    ((moom.th)(this)).ad = ((boolean)(true));
    return;
}


protected java.lang.String b__sourceReturn_0e30dfc966() {
long local1 = (moom.th.cb ^ 103172257459208L);
    return ((((moom.th)(this)).o__sourceReturn_8abf5c6871() > 1) ? "mob.magmacube.big" : "mob.magmacube.small");
}


protected void b(boolean p0, int p1) {
int lexicalValue1321_22_0;
    int lexicalValue1321_22_1;
    int lexicalValue1321_38_0;
    net.minecraft.entity.Entity[] spill1321_0;
    int spill1321_1;
    int spill1321_2;
    int spill1321_3;
    long life3_3;
    net.minecraft.item.Item life6_7;
    net.minecraft.entity.Entity[] life5_8;
    int life7_32;
    int life8_50;
    lexical_join_50: {
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_22: {
    life3_3 = (moom.th.cb ^ 27294277729087L);
    spill1321_0 = moom.vN.b();
    life6_7 = ((moom.th)(this)).a__wQ();
    life5_8 = spill1321_0;
    if (!((life6_7 != null))) {
        break lexical_join_50;
    }
    spill1321_1 = ((moom.th)(this)).o__sourceReturn_8abf5c6871();
    spill1321_2 = 1;
    if (!((life5_8 == null))) {
        lexicalValue1321_22_0 = spill1321_1;
        lexicalValue1321_22_1 = spill1321_2;
        break lexical_join_22;
    }
    if (!((spill1321_1 > spill1321_2))) {
        break lexical_join_50;
    }
    lexicalValue1321_22_0 = ((java.util.Random)(((moom.th)(this)).ah)).nextInt(((int)(4)));
    lexicalValue1321_22_1 = 2;
    }
    life7_32 = (lexicalValue1321_22_0 - lexicalValue1321_22_1);
    spill1321_3 = p1;
    if (!((life5_8 == null))) {
        lexicalValue1321_38_0 = spill1321_3;
        break lexical_join_38;
    }
    if (!((spill1321_3 > 0))) {
        break lexical_join_37;
    }
    life7_32 = (life7_32 + ((java.util.Random)(((moom.th)(this)).ah)).nextInt(((int)((p1 + 1)))));
    }
    lexicalValue1321_38_0 = 0;
    }
    life8_50 = lexicalValue1321_38_0;
    lexical_cycle_39: while (true) {
    if (!((life8_50 < life7_32))) {
        break lexical_join_50;
    }
    ((moom.th)(this)).a(((net.minecraft.item.Item)(life6_7)), ((int)(1)));
    life8_50 += 1;
    if (!((life5_8 != null))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void d(float p0, float p1) {
return;
}


public int d__Int() {
return (((moom.th)(this)).o__sourceReturn_8abf5c6871() * 3);
}


protected net.minecraft.util.EnumParticleTypes a__sourceReturn_9e1ef7b70b() {
return net.minecraft.util.EnumParticleTypes.FLAME;
}


public int a__Int(float p0) {
long local2 = (moom.th.cb ^ 83091164571647L);
    return ((int) moom.th.ub);
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.th)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.99999ap-3d)));
    return;
}


protected net.minecraft.entity.monster.EntitySlime a__tg() {
return new moom.th(((moom.th)(this)).i);
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.bt;
}


public float a(float p0) {
return 0x1.0p0f;
}


protected int p__sourceReturn_8abf5c6871() {
return (super.p__sourceReturn_8abf5c6871() * 4);
}


protected int q__sourceReturn_8abf5c6871() {
return (super.q__sourceReturn_8abf5c6871() + 2);
}


public boolean r__Boolean() {
return ((0) != 0);
}


public boolean N__Boolean() {
long local1 = (moom.th.cb ^ 112394990402763L);
    return ((((((net.minecraft.world.World)(((moom.th)(this)).i)).a__bB() != net.minecraft.world.EnumDifficulty.PEACEFUL) ? 1 : 0)) != 0);
}


protected boolean Y() {
return ((1) != 0);
}


protected void W__sourceReturn_da8c82d5d4() {
this.bX *= 0x1.ccccccp-1f;
    return;
}


public boolean O__Boolean() {
int forwardValue4089_22_0;
    int forwardValue4089_30_0;
    int forwardValue4089_34_0;
    int forwardValue4089_36_0;
    boolean spill4089_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_22: {
    life1_3 = (moom.th.cb ^ 3185281205310L);
    life3_5 = moom.vN.b();
    spill4089_0 = ((net.minecraft.world.World)(((moom.th)(this)).i)).a(((moom.CA)(((moom.th)(this)).b())), ((net.minecraft.entity.Entity)(this)));
    if (!((life3_5 == null))) {
        forwardValue4089_22_0 = ((spill4089_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill4089_0)) {
        break forward_join_35;
    }
    forwardValue4089_22_0 = ((((java.util.List)(((net.minecraft.world.World)(((moom.th)(this)).i)).a(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.th)(this)).b()))))).isEmpty()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4089_30_0 = forwardValue4089_22_0;
        break forward_join_30;
    }
    if (!((forwardValue4089_22_0 != 0))) {
        break forward_join_35;
    }
    forwardValue4089_30_0 = ((((net.minecraft.world.World)(((moom.th)(this)).i)).c(((moom.CA)(((moom.th)(this)).b())))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4089_34_0 = forwardValue4089_30_0;
        break forward_join_34;
    }
    if (!((forwardValue4089_30_0 == 0))) {
        break forward_join_35;
    }
    forwardValue4089_34_0 = 1;
    }
    forwardValue4089_36_0 = forwardValue4089_34_0;
    break forward_join_36;
    }
    forwardValue4089_36_0 = 0;
    }
    return ((forwardValue4089_36_0) != 0);
}


protected boolean aa() {
return ((1) != 0);
}

}
