package moom;


public class Iu extends moom.Ir {

private static long e;

private static long f;

public Iu() {
super();
}


public Iu(net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) { super(0, 0); }


private static void __sourceConstructorBody_21242921c90cf70c(moom.Iu receiver, net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) throws Throwable {

init_join_72: {

    init_join_64: {

    long local5_life2 = (moom.Iu.e ^ 100101406625933L);

    net.minecraft.entity.Entity[] __sourceSpill514_4 = moom.G4.b();

    moom.Iu.__sourceConstructorInit_21242921c90cf70c_0(((moom.Iu)(receiver)), ((int)(p2)), ((int)(p3)));

    net.minecraft.entity.Entity[] local7_life6 = __sourceSpill514_4;

    net.minecraft.world.gen.structure.StructureStrongholdPieces.b();

    moom.HQ local8_life8 = new moom.HQ(0, p1, ((p2 << 4) + 2), ((p3 << 4) + 2));

    ((java.util.LinkedList)(((moom.Iu)(receiver)).a)).add(((java.lang.Object)(local8_life8)));

    ((moom.HQ)(local8_life8)).a(((moom.G4)(local8_life8)), ((java.util.List)(((moom.Iu)(receiver)).a)), ((java.util.Random)(p1)));

    java.util.List local9_life14 = ((moom.HQ)(local8_life8)).i;

    init_cycle_41: while (true) {

    if (!((!((java.util.List)(local9_life14)).isEmpty()))) {

        break init_join_64;

    }

    int local10_life18 = ((java.util.Random)(p1)).nextInt(((int)(((java.util.List)(local9_life14)).size())));

    moom.G4 local11_life21 = ((moom.G4)(((java.util.List)(local9_life14)).remove(((int)(local10_life18)))));

    ((moom.G4)(local11_life21)).a(((moom.G4)(local8_life8)), ((java.util.List)(((moom.Iu)(receiver)).a)), ((java.util.Random)(p1)));

    if (!((local7_life6 != null))) {

        break init_join_72;

    }

    if (!((local7_life6 == null))) { continue init_cycle_41; }

    break init_cycle_41;

    }

    }

    ((moom.Iu)(receiver)).a__Void();

    ((moom.Iu)(receiver)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((int)(((int) moom.Iu.f))));

    }

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(26158581132821563L)), ((long)(6981825264881845237L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(128841623177286L)))));
    long local0_life6 = (moom.Iu.e ^ 127051237197200L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill584_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill584_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill584_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill584_13 = new byte[8];
    (__sourceSpill584_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill584_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation584_15 = __sourceSpill584_13;
    ((javax.crypto.Cipher)(__sourceSpill584_10)).init(((int)(__sourceSpill584_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill584_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation584_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7622969914754245646L;
    byte[] __sourceSpill584_19 = new byte[8];
    (__sourceSpill584_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill584_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill584_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill584_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill584_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill584_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill584_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill584_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill584_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill584_20)).doFinal(((byte[])(__sourceSpill584_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_21242921c90cf70c_0(moom.Iu a0, int a1, int a2) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}

}
