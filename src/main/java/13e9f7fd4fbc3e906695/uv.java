package moom;


public class uv extends moom.uc {

moom.sK c;

moom.sK d;

double e;

private int f;

private static final long g;

private static final long h;

public uv(moom.sK p0, double p1) {
super();
    this.c = p0;
    this.e = p1;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(7345718732699774537L)), ((long)(98640849715291633L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(251310352325100L)))));
    long local0_life6 = (moom.uv.g ^ 50703502718354L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1062_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1062_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1062_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1062_13 = new byte[8];
    (__sourceSpill1062_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1062_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1062_15 = __sourceSpill1062_13;
    ((javax.crypto.Cipher)(__sourceSpill1062_10)).init(((int)(__sourceSpill1062_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1062_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1062_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5808104278246225389L;
    byte[] __sourceSpill1062_19 = new byte[8];
    (__sourceSpill1062_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1062_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1062_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1062_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1062_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1062_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1062_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1062_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1062_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1062_20)).doFinal(((byte[])(__sourceSpill1062_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b__Void() {
this.d = ((moom.sK)(null));
    return;
}


public boolean b__Boolean() {
int forwardValue4244_19_0;
    moom.sK forwardValue4244_24_0;
    int forwardValue4244_37_0;
    int forwardValue4244_41_0;
    int forwardValue4244_43_0;
    int spill4244_0;
    moom.sK spill4244_1;
    int spill4244_2;
    long life1_3;
    int life3_5;
    double life4_37;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_37: {
    forward_join_24: {
    forward_join_22: {
    forward_join_19: {
    forward_join_14: {
    life1_3 = (moom.uv.g ^ 85562121017457L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4244_0 = ((moom.sK)(this.c)).q__sourceReturn_8abf5c6871();
    if (!((life3_5 == 0))) {
        forwardValue4244_19_0 = spill4244_0;
        break forward_join_19;
    }
    if (!((spill4244_0 >= 0))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    spill4244_1 = this.d;
    if (!((life3_5 == 0))) {
        forwardValue4244_24_0 = spill4244_1;
        break forward_join_24;
    }
    forwardValue4244_19_0 = ((((moom.sK)(spill4244_1)).p__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4244_19_0 == 0))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    forwardValue4244_24_0 = this.c;
    }
    life4_37 = ((moom.sK)(forwardValue4244_24_0)).a(((net.minecraft.entity.Entity)(this.d)));
    spill4244_2 = recovery.source.CarrierOps.dcmpl(((double)(life4_37)), ((double)(0x1.2p3d)));
    if (!((life3_5 == 0))) {
        forwardValue4244_37_0 = spill4244_2;
        break forward_join_37;
    }
    if (!((spill4244_2 >= 0))) {
        break forward_join_42;
    }
    forwardValue4244_37_0 = recovery.source.CarrierOps.dcmpg(((double)(life4_37)), ((double)(0x1.0p8d)));
    }
    if (!((life3_5 == 0))) {
        forwardValue4244_41_0 = forwardValue4244_37_0;
        break forward_join_41;
    }
    if (!((forwardValue4244_37_0 <= 0))) {
        break forward_join_42;
    }
    forwardValue4244_41_0 = 1;
    }
    forwardValue4244_43_0 = forwardValue4244_41_0;
    break forward_join_43;
    }
    forwardValue4244_43_0 = 0;
    }
    return ((forwardValue4244_43_0) != 0);
}


public void c() {
int forwardValue4245_28_0;
    int spill4245_0;
    long life1_3;
    int life3_5;
    forward_join_29: {
    forward_join_28: {
    life1_3 = (moom.uv.g ^ 27258106657490L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    moom.uv __stackOp4245_3_0 = this;
    moom.uv __stackOp4245_5_0 = __stackOp4245_3_0;
    int __stackOp4245_5_1 = (((moom.uv)(__stackOp4245_3_0)).f - 1);
    spill4245_0 = __stackOp4245_5_1;
    ((moom.uv)(__stackOp4245_5_0)).f = ((int)(__stackOp4245_5_1));
    if (!((life3_5 != 0))) {
        forwardValue4245_28_0 = spill4245_0;
        break forward_join_28;
    }
    if (!((spill4245_0 <= 0))) {
        break forward_join_29;
    }
    this.f = ((int)(((int) moom.uv.h)));
    forwardValue4245_28_0 = ((((moom.AV)(((moom.sK)(this.c)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(this.d)), ((double)(this.e)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4245_28_0);
    }
    return;
}


public boolean a__Boolean() {
moom.sK lexicalValue1338_16_0;
    moom.sK lexicalValue1338_52_0;
    double lexicalValue1338_62_0;
    int lexicalValue1338_74_0;
    int lexicalValue1338_83_0;
    moom.sK spill1338_0;
    moom.sK spill1338_1;
    int spill1338_2;
    double spill1338_3;
    long life1_3;
    int life3_5;
    java.util.List life4_33;
    moom.sK life5_35;
    double life6_37;
    java.util.Iterator life8_40;
    moom.sK life9_47;
    double life10_68;
    lexical_join_83: {
    lexical_join_79: {
    lexical_join_74: {
    lexical_join_71: {
    lexical_join_67: {
    lexical_join_16: {
    lexical_join_14: {
    life1_3 = (moom.uv.g ^ 41103032758496L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill1338_0 = this.c;
    if (!((life3_5 == 0))) {
        lexicalValue1338_16_0 = spill1338_0;
        break lexical_join_16;
    }
    if (!((((moom.sK)(spill1338_0)).q__sourceReturn_8abf5c6871() >= 0))) {
        break lexical_join_14;
    }
    return ((0) != 0);
    }
    lexicalValue1338_16_0 = this.c;
    }
    life4_33 = ((net.minecraft.world.World)(((moom.sK)(lexicalValue1338_16_0)).i)).a(((java.lang.Class)(((java.lang.Object)(this.c)).getClass())), ((moom.CA)(((moom.CA)(((moom.sK)(this.c)).b())).b(((double)(0x1.0p3d)), ((double)(0x1.0p2d)), ((double)(0x1.0p3d))))));
    life5_35 = null;
    life6_37 = 0x1.fffffffffffffp1023d;
    life8_40 = ((java.util.List)(life4_33)).iterator();
    lexical_cycle_36: while (true) {
    lexical_join_65: {
    lexical_join_62: {
    lexical_join_52: {
    if (!(((java.util.Iterator)(life8_40)).hasNext())) {
        break lexical_join_67;
    }
    life9_47 = ((moom.sK)(((java.util.Iterator)(life8_40)).next()));
    spill1338_1 = life9_47;
    if (!((life3_5 == 0))) {
        lexicalValue1338_52_0 = spill1338_1;
        break lexical_join_52;
    }
    spill1338_2 = ((moom.sK)(spill1338_1)).q__sourceReturn_8abf5c6871();
    if (!((life3_5 == 0))) {
        lexicalValue1338_74_0 = spill1338_2;
        break lexical_join_74;
    }
    if (!((spill1338_2 >= 0))) {
        break lexical_join_65;
    }
    lexicalValue1338_52_0 = this.c;
    }
    life10_68 = ((moom.sK)(lexicalValue1338_52_0)).a(((net.minecraft.entity.Entity)(life9_47)));
    spill1338_3 = life10_68;
    if (!((life3_5 == 0))) {
        lexicalValue1338_62_0 = spill1338_3;
        break lexical_join_62;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1338_3)), ((double)(life6_37))) <= 0))) {
        break lexical_join_65;
    }
    lexicalValue1338_62_0 = life10_68;
    }
    life6_37 = lexicalValue1338_62_0;
    life5_35 = life9_47;
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    if (!((life5_35 == null))) {
        break lexical_join_71;
    }
    return ((0) != 0);
    }
    lexicalValue1338_74_0 = recovery.source.CarrierOps.dcmpg(((double)(life6_37)), ((double)(0x1.2p3d)));
    }
    if (!((life3_5 == 0))) {
        lexicalValue1338_83_0 = lexicalValue1338_74_0;
        break lexical_join_83;
    }
    if (!((lexicalValue1338_74_0 < 0))) {
        break lexical_join_79;
    }
    return ((0) != 0);
    }
    this.d = ((moom.sK)(life5_35));
    lexicalValue1338_83_0 = 1;
    }
    return ((lexicalValue1338_83_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
this.f = ((int)(0));
    return;
}

}
