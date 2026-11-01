package moom;


public class ut extends moom.uc {

private final net.minecraft.entity.passive.EntityVillager c;

private net.minecraft.entity.monster.EntityIronGolem d;

private int e;

private boolean f;

private static final long g;

private static final long h;

public ut(net.minecraft.entity.passive.EntityVillager p0) {
super();
    this.c = p0;
    (this).a(3);
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-1263728924325191140L)), ((long)(3540250866096063528L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175307644736392L)))));
    long local0_life6 = (moom.ut.g ^ 132882613589926L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1060_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1060_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1060_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1060_13 = new byte[8];
    (__sourceSpill1060_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1060_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1060_15 = __sourceSpill1060_13;
    ((javax.crypto.Cipher)(__sourceSpill1060_10)).init(((int)(__sourceSpill1060_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1060_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1060_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 8435574321978782789L;
    byte[] __sourceSpill1060_19 = new byte[8];
    (__sourceSpill1060_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1060_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1060_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1060_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1060_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1060_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1060_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1060_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1060_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1060_20)).doFinal(((byte[])(__sourceSpill1060_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b__Void() {
this.d = ((net.minecraft.entity.monster.EntityIronGolem)(null));
    ((moom.AV)(((net.minecraft.entity.passive.EntityVillager)(this.c)).a__sourceReturn_407923443b())).c();
    return;
}


public boolean b__Boolean() {
int forwardValue4237_13_0;
    int forwardValue4237_15_0;
    int spill4237_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.ut.g ^ 8901669429690L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4237_0 = ((net.minecraft.entity.monster.EntityIronGolem)(this.d)).r__sourceReturn_8abf5c6871();
    if (!((life3_5 != 0))) {
        forwardValue4237_13_0 = spill4237_0;
        break forward_join_13;
    }
    if (!((spill4237_0 > 0))) {
        break forward_join_14;
    }
    forwardValue4237_13_0 = 1;
    }
    forwardValue4237_15_0 = forwardValue4237_13_0;
    break forward_join_15;
    }
    forwardValue4237_15_0 = 0;
    }
    return ((forwardValue4237_15_0) != 0);
}


public void c() {
int forwardValue4238_35_0;
    int forwardValue4238_47_0;
    net.minecraft.entity.passive.EntityVillager forwardValue4238_54_0;
    boolean spill4238_0;
    int spill4238_1;
    net.minecraft.entity.passive.EntityVillager spill4238_2;
    long life1_3;
    int life3_13;
    forward_join_56: {
    forward_join_54: {
    forward_join_47: {
    forward_join_35: {
    forward_join_33: {
    life1_3 = (moom.ut.g ^ 102269258285849L);
    spill4238_0 = moom.uc.e();
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.passive.EntityVillager)(this.c)).a__vt())).a(((net.minecraft.entity.Entity)(this.d)), ((float)(0x1.ep4f)), ((float)(0x1.ep4f)));
    life3_13 = ((spill4238_0) ? 1 : 0);
    spill4238_1 = ((net.minecraft.entity.monster.EntityIronGolem)(this.d)).r__sourceReturn_8abf5c6871();
    if (!((life3_13 == 0))) {
        forwardValue4238_35_0 = spill4238_1;
        break forward_join_35;
    }
    if (!((spill4238_1 == this.e))) {
        break forward_join_33;
    }
    ((moom.AV)(((net.minecraft.entity.passive.EntityVillager)(this.c)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(this.d)), ((double)(0x1.0p-1d)));
    this.f = ((boolean)(true));
    }
    forwardValue4238_35_0 = ((this.f) ? 1 : 0);
    }
    if (!((life3_13 == 0))) {
        forwardValue4238_47_0 = forwardValue4238_35_0;
        break forward_join_47;
    }
    if (!((forwardValue4238_35_0 != 0))) {
        break forward_join_56;
    }
    spill4238_2 = this.c;
    if (!((life3_13 == 0))) {
        forwardValue4238_54_0 = spill4238_2;
        break forward_join_54;
    }
    forwardValue4238_47_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.passive.EntityVillager)(spill4238_2)).a(((net.minecraft.entity.Entity)(this.d))))), ((double)(0x1.0p2d)));
    }
    if (!((forwardValue4238_47_0 < 0))) {
        break forward_join_56;
    }
    ((net.minecraft.entity.monster.EntityIronGolem)(this.d)).l(((boolean)(false)));
    forwardValue4238_54_0 = this.c;
    }
    ((moom.AV)(((net.minecraft.entity.passive.EntityVillager)(forwardValue4238_54_0)).a__sourceReturn_407923443b())).c();
    }
    return;
}


public boolean a__Boolean() {
int lexicalValue1336_20_0;
    net.minecraft.world.World lexicalValue1336_26_0;
    java.util.List lexicalValue1336_44_0;
    int lexicalValue1336_73_0;
    int spill1336_0;
    net.minecraft.world.World spill1336_1;
    java.util.List spill1336_2;
    int spill1336_3;
    long life1_3;
    int life3_5;
    java.util.List life4_45;
    java.util.Iterator life5_60;
    net.minecraft.entity.monster.EntityIronGolem life6_67;
    lexical_join_73: {
    lexical_join_72: {
    lexical_join_67: {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_26: {
    lexical_join_23: {
    lexical_join_20: {
    lexical_join_14: {
    life1_3 = (moom.ut.g ^ 106291391809835L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill1336_0 = ((net.minecraft.entity.passive.EntityVillager)(this.c)).q__sourceReturn_8abf5c6871();
    if (!((life3_5 == 0))) {
        lexicalValue1336_20_0 = spill1336_0;
        break lexical_join_20;
    }
    if (!((spill1336_0 >= 0))) {
        break lexical_join_14;
    }
    return ((0) != 0);
    }
    spill1336_1 = ((net.minecraft.entity.passive.EntityVillager)(this.c)).i;
    if (!((life3_5 == 0))) {
        lexicalValue1336_26_0 = spill1336_1;
        break lexical_join_26;
    }
    lexicalValue1336_20_0 = ((((net.minecraft.world.World)(spill1336_1)).e__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1336_20_0 == 0))) {
        break lexical_join_23;
    }
    return ((0) != 0);
    }
    lexicalValue1336_26_0 = ((net.minecraft.entity.passive.EntityVillager)(this.c)).i;
    }
    life4_45 = ((net.minecraft.world.World)(lexicalValue1336_26_0)).a(((java.lang.Class)(net.minecraft.entity.monster.EntityIronGolem.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.passive.EntityVillager)(this.c)).b())).b(((double)(0x1.8p2d)), ((double)(0x1.0p1d)), ((double)(0x1.8p2d))))));
    spill1336_2 = life4_45;
    if (!((life3_5 == 0))) {
        lexicalValue1336_44_0 = spill1336_2;
        break lexical_join_44;
    }
    if (!(((java.util.List)(spill1336_2)).isEmpty())) {
        break lexical_join_43;
    }
    return ((0) != 0);
    }
    lexicalValue1336_44_0 = life4_45;
    }
    life5_60 = ((java.util.List)(lexicalValue1336_44_0)).iterator();
    lexical_cycle_46: while (true) {
    lexical_join_65: {
    lexical_join_63: {
    if (!(((java.util.Iterator)(life5_60)).hasNext())) {
        break lexical_join_67;
    }
    life6_67 = ((net.minecraft.entity.monster.EntityIronGolem)(((java.util.Iterator)(life5_60)).next()));
    if (!((life3_5 == 0))) {
        break lexical_join_63;
    }
    spill1336_3 = ((net.minecraft.entity.monster.EntityIronGolem)(life6_67)).r__sourceReturn_8abf5c6871();
    if (!((life3_5 == 0))) {
        lexicalValue1336_73_0 = spill1336_3;
        break lexical_join_73;
    }
    if (!((spill1336_3 > 0))) {
        break lexical_join_65;
    }
    this.d = ((net.minecraft.entity.monster.EntityIronGolem)(life6_67));
    }
    if (!((life3_5 != 0))) {
        break lexical_join_67;
    }
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    if (!((this.d != null))) {
        break lexical_join_72;
    }
    lexicalValue1336_73_0 = 1;
    break lexical_join_73;
    }
    lexicalValue1336_73_0 = 0;
    }
    return ((lexicalValue1336_73_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
long local1 = (moom.ut.g ^ 112732613931287L);
    this.e = ((int)(((java.util.Random)(((net.minecraft.entity.passive.EntityVillager)(this.c)).a__Random())).nextInt(((int)(((int) moom.ut.h))))));
    this.f = ((boolean)(false));
    ((moom.AV)(((net.minecraft.entity.monster.EntityIronGolem)(this.d)).a__sourceReturn_407923443b())).c();
    return;
}

}
