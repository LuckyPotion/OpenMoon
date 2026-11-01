package moom;


public class uM extends moom.uc {

private moom.sI c;

private moom.Ea d;

private static long e;

private static long f;

public uM(moom.sI p0) { super(); }


private static void __sourceConstructorBody_968cff58a9666dce(moom.uM receiver, moom.sI p0) throws Throwable {

long local2 = (moom.uM.e ^ 71917697358726L);

    moom.uM.__sourceConstructorInit_968cff58a9666dce_0(((moom.uM)(receiver)));

    ((moom.uM)(receiver)).c = ((moom.sI)(p0));

    if ((((__sourceExactCall_61e3a024849730(((moom.sI)(p0))) instanceof moom.AW) ? 1 : 0) == 0)) {

        throw new java.lang.IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_968cff58a9666dce_0(moom.uM a0) throws E;

static {
e = ((long)(((moom._a)(moom._c.a(((long)(-5305950673759502104L)), ((long)(-7006215434933851456L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(193893140592640L)))));
    long local0_life6 = (moom.uM.e ^ 66166173284765L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1047_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1047_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1047_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1047_13 = new byte[8];
    (__sourceSpill1047_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1047_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1047_15 = __sourceSpill1047_13;
    ((javax.crypto.Cipher)(__sourceSpill1047_10)).init(((int)(__sourceSpill1047_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1047_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1047_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -1870891799086979379L;
    byte[] __sourceSpill1047_19 = new byte[8];
    (__sourceSpill1047_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1047_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1047_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1047_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1047_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1047_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1047_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1047_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1047_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1047_20)).doFinal(((byte[])(__sourceSpill1047_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b__Void() {
((moom.AW)(((moom.AW)(((moom.sI)(this.c)).a__sourceReturn_407923443b())))).b(((boolean)(true)));
    ((moom.AW)(((moom.AW)(((moom.sI)(this.c)).a__sourceReturn_407923443b())))).c(((boolean)(true)));
    this.d = ((moom.Ea)(null));
    return;
}


public boolean b__Boolean() {
int forwardValue4170_16_0;
    int forwardValue4170_27_0;
    int forwardValue4170_31_0;
    int forwardValue4170_33_0;
    boolean spill4170_0;
    long life1_3;
    int life3_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_27: {
    forward_join_16: {
    life1_3 = (moom.uM.e ^ 34405414939536L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4170_0 = ((net.minecraft.world.World)(((moom.sI)(this.c)).i)).e__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4170_16_0 = ((spill4170_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4170_0))) {
        break forward_join_32;
    }
    forwardValue4170_16_0 = ((((moom.Ea)(this.d)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4170_27_0 = forwardValue4170_16_0;
        break forward_join_27;
    }
    if (!((forwardValue4170_16_0 == 0))) {
        break forward_join_32;
    }
    forwardValue4170_27_0 = ((((moom.Ea)(this.d)).a__Boolean(((moom.DT)(new moom.DT(this.c))))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue4170_31_0 = forwardValue4170_27_0;
        break forward_join_31;
    }
    if (!((forwardValue4170_27_0 != 0))) {
        break forward_join_32;
    }
    forwardValue4170_31_0 = 1;
    }
    forwardValue4170_33_0 = forwardValue4170_31_0;
    break forward_join_33;
    }
    forwardValue4170_33_0 = 0;
    }
    return ((forwardValue4170_33_0) != 0);
}


public void c() {
((moom.Ea)(this.d)).b__Void();
    return;
}


public boolean a__Boolean() {
int forwardValue4169_14_0;
    moom.Ea forwardValue4169_48_0;
    int forwardValue4169_57_0;
    int forwardValue4169_59_0;
    boolean spill4169_0;
    moom.Ea spill4169_1;
    int spill4169_2;
    long life1_3;
    int life3_5;
    moom.DT life4_23;
    net.minecraft.village.Village life5_32;
    forward_join_59: {
    forward_join_58: {
    forward_join_57: {
    forward_join_48: {
    forward_join_41: {
    forward_join_36: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.uM.e ^ 131914870014721L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4169_0 = ((net.minecraft.world.World)(((moom.sI)(this.c)).i)).e__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4169_14_0 = ((spill4169_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill4169_0)) {
        break forward_join_15;
    }
    forwardValue4169_14_0 = 0;
    }
    return ((forwardValue4169_14_0) != 0);
    }
    life4_23 = new moom.DT(this.c);
    life5_32 = ((moom.EG)(((net.minecraft.world.World)(((moom.sI)(this.c)).i)).a__EG())).a(((moom.DT)(life4_23)), ((int)(((int) moom.uM.f))));
    if (!((life3_5 != 0))) {
        break forward_join_41;
    }
    if (!((life5_32 == null))) {
        break forward_join_36;
    }
    return ((0) != 0);
    }
    this.d = ((moom.Ea)(((net.minecraft.village.Village)(life5_32)).a(((moom.DT)(life4_23)))));
    }
    spill4169_1 = this.d;
    if (!((life3_5 != 0))) {
        forwardValue4169_48_0 = spill4169_1;
        break forward_join_48;
    }
    if (!((spill4169_1 != null))) {
        break forward_join_58;
    }
    forwardValue4169_48_0 = this.d;
    }
    spill4169_2 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((moom.Ea)(forwardValue4169_48_0)).b(((moom.DT)(life4_23)))))), ((double)(0x1.2p1d)));
    if (!((life3_5 != 0))) {
        forwardValue4169_57_0 = spill4169_2;
        break forward_join_57;
    }
    if (!((spill4169_2 < 0))) {
        break forward_join_58;
    }
    forwardValue4169_57_0 = 1;
    }
    forwardValue4169_59_0 = forwardValue4169_57_0;
    break forward_join_59;
    }
    forwardValue4169_59_0 = 0;
    }
    return ((forwardValue4169_59_0) != 0);
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public void a__Void() {
((moom.AW)(((moom.AW)(((moom.sI)(this.c)).a__sourceReturn_407923443b())))).b(((boolean)(false)));
    ((moom.AW)(((moom.AW)(((moom.sI)(this.c)).a__sourceReturn_407923443b())))).c(((boolean)(false)));
    return;
}


private static native moom.AV __sourceExactCall_61e3a024849730(moom.sI p0);
}
