package moom;


public class AY extends moom.AV {

private static final long l;

private static final long m;

public AY(net.minecraft.entity.EntityLiving p0, net.minecraft.world.World p1) {
super(p0, p1);
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-3452928110575617800L)), ((long)(1785228597737068421L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(11102417766302L)))));
    long local0_life6 = (moom.AY.l ^ 100232837224817L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill473_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill473_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill473_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill473_13 = new byte[8];
    (__sourceSpill473_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill473_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation473_15 = __sourceSpill473_13;
    ((javax.crypto.Cipher)(__sourceSpill473_10)).init(((int)(__sourceSpill473_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill473_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation473_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3821224078076478844L;
    byte[] __sourceSpill473_19 = new byte[8];
    (__sourceSpill473_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill473_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill473_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill473_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill473_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill473_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill473_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill473_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill473_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill473_20)).doFinal(((byte[])(__sourceSpill473_19)));
    m = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b() {
int lexicalValue479_50_0;
    moom.AY lexicalValue479_84_0;
    int[] spill479_0;
    int spill479_1;
    moom.AY spill479_2;
    long life1_3;
    moom.DR life4_6;
    float life5_15;
    int[] life3_16;
    int life6_19;
    int life7_56;
    moom.DR life8_68;
    lexical_join_100: {
    lexical_join_95: {
    lexical_join_92: {
    lexical_join_50: {
    lexical_join_39: {
    life1_3 = (moom.AY.l ^ 125817450011720L);
    life4_6 = ((moom.AY)(this)).a__DR();
    spill479_0 = moom.AV.b__ArrayInt();
    life5_15 = (((net.minecraft.entity.EntityLiving)(((moom.AY)(this)).a)).G * ((net.minecraft.entity.EntityLiving)(((moom.AY)(this)).a)).G);
    life3_16 = spill479_0;
    life6_19 = ((int) moom.AY.m);
    spill479_1 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(life4_6)).c(((moom.DR)(((moom.AT)(((moom.AY)(this)).c)).a(((net.minecraft.entity.Entity)(((moom.AY)(this)).a)), ((int)(((moom.AT)(((moom.AY)(this)).c)).b())))))))), ((double)(((double) life5_15))));
    if (!((life3_16 != null))) {
        lexicalValue479_50_0 = spill479_1;
        break lexical_join_50;
    }
    if (!((spill479_1 < 0))) {
        break lexical_join_39;
    }
    ((moom.AT)(((moom.AY)(this)).c)).a__Void();
    }
    lexicalValue479_50_0 = java.lang.Math.min(((int)((((moom.AT)(((moom.AY)(this)).c)).b() + life6_19))), ((int)((((moom.AT)(((moom.AY)(this)).c)).a() - 1))));
    }
    life7_56 = lexicalValue479_50_0;
    lexical_cycle_51: while (true) {
    lexical_join_90: {
    lexical_join_89: {
    lexical_join_84: {
    if (!((life7_56 > ((moom.AT)(((moom.AY)(this)).c)).b()))) {
        break lexical_join_92;
    }
    life8_68 = ((moom.AT)(((moom.AY)(this)).c)).a(((net.minecraft.entity.Entity)(((moom.AY)(this)).a)), ((int)(life7_56)));
    if (!((life3_16 != null))) {
        break lexical_join_95;
    }
    if (!((life3_16 != null))) {
        break lexical_join_90;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(life8_68)).c(((moom.DR)(life4_6))))), ((double)(0x1.2p5d))) <= 0))) {
        break lexical_join_89;
    }
    spill479_2 = this;
    if (!((life3_16 != null))) {
        lexicalValue479_84_0 = spill479_2;
        break lexical_join_84;
    }
    if (!(((moom.AY)(spill479_2)).a(((moom.DR)(life4_6)), ((moom.DR)(life8_68)), ((int)(0)), ((int)(0)), ((int)(0))))) {
        break lexical_join_89;
    }
    lexicalValue479_84_0 = this;
    }
    ((moom.AT)(((moom.AY)(lexicalValue479_84_0)).c)).b(((int)(life7_56)));
    if (!((life3_16 == null))) {
        break lexical_join_92;
    }
    }
    life7_56 += -1;
    }
    if (!((life3_16 == null))) { continue lexical_cycle_51; }
    break lexical_cycle_51;
    }
    }
    ((moom.AY)(this)).a(((moom.DR)(life4_6)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_100;
    }
    moom.AV.b(((int[])(new int[5])));
    }
    return;
}


protected boolean b__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.AY)(this)).c__Boolean())) != 0);
}


protected void d() {
super.d();
    return;
}


protected moom.AU a__AU() {
return new moom.AU(new moom.IH());
}


protected boolean a(moom.DR p0, moom.DR p1, int p2, int p3, int p4) {
net.minecraft.util.MovingObjectPosition forwardValue1453_35_0;
    int forwardValue1453_41_0;
    int[] spill1453_0;
    net.minecraft.util.MovingObjectPosition spill1453_1;
    long life6_3;
    net.minecraft.util.MovingObjectPosition life9_28;
    int[] life8_29;
    forward_join_41: {
    forward_join_40: {
    forward_join_38: {
    forward_join_35: {
    life6_3 = (moom.AY.l ^ 23654322780031L);
    spill1453_0 = moom.AV.b__ArrayInt();
    life9_28 = ((net.minecraft.world.World)(((moom.AY)(this)).b)).a(((moom.DR)(p0)), ((moom.DR)(new moom.DR(((moom.DR)(p1)).a, (((moom.DR)(p1)).b + (((double) ((net.minecraft.entity.EntityLiving)(((moom.AY)(this)).a)).H) * 0x1.0p-1d)), ((moom.DR)(p1)).c))), ((boolean)(false)), ((boolean)(true)), ((boolean)(false)));
    life8_29 = spill1453_0;
    spill1453_1 = life9_28;
    if (!((life8_29 != null))) {
        forwardValue1453_35_0 = spill1453_1;
        break forward_join_35;
    }
    if (!((spill1453_1 != null))) {
        break forward_join_38;
    }
    forwardValue1453_35_0 = life9_28;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue1453_35_0)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.MISS))) {
        break forward_join_40;
    }
    }
    forwardValue1453_41_0 = 1;
    break forward_join_41;
    }
    forwardValue1453_41_0 = 0;
    }
    return ((forwardValue1453_41_0) != 0);
}


protected moom.DR a__DR() {
return new moom.DR(((net.minecraft.entity.EntityLiving)(((moom.AY)(this)).a)).n, (((net.minecraft.entity.EntityLiving)(((moom.AY)(this)).a)).o + (((double) ((net.minecraft.entity.EntityLiving)(((moom.AY)(this)).a)).H) * 0x1.0p-1d)), ((net.minecraft.entity.EntityLiving)(((moom.AY)(this)).a)).p);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
