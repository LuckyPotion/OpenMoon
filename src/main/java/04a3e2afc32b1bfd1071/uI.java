package moom;


public class uI extends moom.uc {

net.minecraft.world.World c;

net.minecraft.entity.EntityLiving d;

net.minecraft.entity.EntityLivingBase e;

int f;

private static final long g;

private static final long h;

public uI(net.minecraft.entity.EntityLiving p0) {
super();
    this.d = p0;
    this.c = p0.i;
    (this).a(3);
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-3627483637443326824L)), ((long)(6509865812588780088L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24148844769436L)))));
    long local0_life6 = (moom.uI.g ^ 111126943633800L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1046_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1046_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1046_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1046_13 = new byte[8];
    (__sourceSpill1046_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1046_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1046_15 = __sourceSpill1046_13;
    ((javax.crypto.Cipher)(__sourceSpill1046_10)).init(((int)(__sourceSpill1046_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1046_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1046_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 4211732891220526239L;
    byte[] __sourceSpill1046_19 = new byte[8];
    (__sourceSpill1046_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1046_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1046_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1046_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1046_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1046_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1046_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1046_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1046_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1046_20)).doFinal(((byte[])(__sourceSpill1046_19)));
    h = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b__Void() {
this.e = ((net.minecraft.entity.EntityLivingBase)(null));
    ((moom.AV)(((net.minecraft.entity.EntityLiving)(this.d)).a__sourceReturn_407923443b())).c();
    return;
}


public boolean b__Boolean() {
int forwardValue4161_19_0;
    int forwardValue4161_26_0;
    int forwardValue4161_35_0;
    int forwardValue4161_37_0;
    boolean spill4161_0;
    boolean spill4161_1;
    long life1_3;
    int life3_5;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    forward_join_19: {
    life1_3 = (moom.uI.g ^ 13778647323448L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4161_0 = ((net.minecraft.entity.EntityLivingBase)(this.e)).p__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4161_19_0 = ((spill4161_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4161_0)) {
        break forward_join_36;
    }
    forwardValue4161_19_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLiving)(this.d)).a(((net.minecraft.entity.Entity)(this.e))))), ((double)(0x1.c2p7d)));
    }
    if (!((life3_5 != 0))) {
        forwardValue4161_26_0 = forwardValue4161_19_0;
        break forward_join_26;
    }
    if (!((forwardValue4161_19_0 <= 0))) {
        break forward_join_36;
    }
    forwardValue4161_26_0 = ((((moom.AV)(((net.minecraft.entity.EntityLiving)(this.d)).a__sourceReturn_407923443b())).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4161_35_0 = forwardValue4161_26_0;
        break forward_join_35;
    }
    if (!((forwardValue4161_26_0 != 0))) {
        break forward_join_34;
    }
    spill4161_1 = ((moom.uI)(this)).a__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4161_35_0 = ((spill4161_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill4161_1)) {
        break forward_join_36;
    }
    }
    forwardValue4161_35_0 = 1;
    }
    forwardValue4161_37_0 = forwardValue4161_35_0;
    break forward_join_37;
    }
    forwardValue4161_37_0 = 0;
    }
    return ((forwardValue4161_37_0) != 0);
}


public void c() {
int forwardValue4162_62_0;
    int forwardValue4162_86_0;
    int forwardValue4162_91_0;
    int forwardValue4162_103_0;
    boolean spill4162_0;
    int spill4162_1;
    int spill4162_2;
    long life1_3;
    int life3_13;
    double life4_26;
    double life6_40;
    double life8_42;
    forward_join_104: {
    forward_join_103: {
    forward_join_91: {
    forward_join_86: {
    forward_join_67: {
    forward_join_62: {
    forward_join_59: {
    life1_3 = (moom.uI.g ^ 98491811951003L);
    spill4162_0 = moom.uc.d();
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.EntityLiving)(this.d)).a__vt())).a(((net.minecraft.entity.Entity)(this.e)), ((float)(0x1.ep4f)), ((float)(0x1.ep4f)));
    life3_13 = ((spill4162_0) ? 1 : 0);
    life4_26 = ((double) (((((net.minecraft.entity.EntityLiving)(this.d)).G * 0x1.0p1f) * ((net.minecraft.entity.EntityLiving)(this.d)).G) * 0x1.0p1f));
    life6_40 = ((net.minecraft.entity.EntityLiving)(this.d)).a(((double)(((net.minecraft.entity.EntityLivingBase)(this.e)).n)), ((double)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(this.e)).b())).c)), ((double)(((net.minecraft.entity.EntityLivingBase)(this.e)).p)));
    life8_42 = 0x1.999999999999ap-1d;
    spill4162_1 = recovery.source.CarrierOps.dcmpl(((double)(life6_40)), ((double)(life4_26)));
    if (!((life3_13 != 0))) {
        forwardValue4162_62_0 = spill4162_1;
        break forward_join_62;
    }
    if (!((spill4162_1 > 0))) {
        break forward_join_59;
    }
    spill4162_2 = recovery.source.CarrierOps.dcmpg(((double)(life6_40)), ((double)(0x1.0p4d)));
    if (!((life3_13 != 0))) {
        forwardValue4162_62_0 = spill4162_2;
        break forward_join_62;
    }
    if (!((spill4162_2 < 0))) {
        break forward_join_59;
    }
    life8_42 = 0x1.547ae147ae148p0d;
    if (!((life3_13 == 0))) {
        break forward_join_67;
    }
    }
    forwardValue4162_62_0 = recovery.source.CarrierOps.dcmpg(((double)(life6_40)), ((double)(0x1.c2p7d)));
    }
    if (!((life3_13 != 0))) {
        forwardValue4162_86_0 = forwardValue4162_62_0;
        break forward_join_86;
    }
    if (!((forwardValue4162_62_0 < 0))) {
        break forward_join_67;
    }
    life8_42 = 0x1.3333333333333p-1d;
    }
    ((moom.AV)(((net.minecraft.entity.EntityLiving)(this.d)).a__sourceReturn_407923443b())).a(((net.minecraft.entity.Entity)(this.e)), ((double)(life8_42)));
    this.f = ((int)(java.lang.Math.max(((int)((this.f - 1))), ((int)(0)))));
    forwardValue4162_86_0 = recovery.source.CarrierOps.dcmpg(((double)(life6_40)), ((double)(life4_26)));
    }
    if (!((life3_13 != 0))) {
        forwardValue4162_91_0 = forwardValue4162_86_0;
        break forward_join_91;
    }
    if (!((forwardValue4162_86_0 <= 0))) {
        break forward_join_104;
    }
    forwardValue4162_91_0 = this.f;
    }
    if (!((life3_13 != 0))) {
        forwardValue4162_103_0 = forwardValue4162_91_0;
        break forward_join_103;
    }
    if (!((forwardValue4162_91_0 == 0))) {
        break forward_join_104;
    }
    this.f = ((int)(((int) moom.uI.h)));
    forwardValue4162_103_0 = ((((net.minecraft.entity.EntityLiving)(this.d)).c__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(this.e)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4162_103_0);
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    int life3_9;
    life1_3 = (moom.uI.g ^ 110206295997353L);
    boolean spill7560_0 = moom.uc.d();
    life4_8 = ((net.minecraft.entity.EntityLiving)(this.d)).d__sourceReturn_d30556f370();
    life3_9 = ((spill7560_0) ? 1 : 0);
    if ((life3_9 != 0)) {
        if ((life4_8 == null)) {
        return false;
    }
        this.e = ((net.minecraft.entity.EntityLivingBase)(life4_8));
    }
    return true;
}

}
