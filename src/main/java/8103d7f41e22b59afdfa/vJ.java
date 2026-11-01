package moom;


public final class vJ {

public static float a;

public static int b;

public static java.lang.String c;

public static boolean d;

private static net.minecraft.entity.Entity[] e;

private static final long f;

private static final long g;

public vJ() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(8872522529353502108L)), ((long)(4560681325446324681L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221294238555078L)))));
    java.lang.Object __sourceSpill1071_6 = null;
    long local0_life7 = (moom.vJ.f ^ 69963318938138L);
    moom.vJ.b(((net.minecraft.entity.Entity[])(__sourceSpill1071_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill1071_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1071_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1071_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1071_15 = new byte[8];
    (__sourceSpill1071_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill1071_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation1071_17 = __sourceSpill1071_15;
    ((javax.crypto.Cipher)(__sourceSpill1071_12)).init(((int)(__sourceSpill1071_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1071_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1071_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -5518225313623690727L;
    byte[] __sourceSpill1071_21 = new byte[8];
    (__sourceSpill1071_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill1071_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill1071_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill1071_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill1071_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill1071_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill1071_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill1071_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill1071_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill1071_22)).doFinal(((byte[])(__sourceSpill1071_21)));
    g = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static net.minecraft.entity.Entity[] b() {
return moom.vJ.e;
}


public static void b(net.minecraft.entity.Entity[] p0) {
moom.vJ.e = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static void a(net.minecraft.entity.boss.IBossDisplayData p0, boolean p1) {
long local2 = (moom.vJ.f ^ 39921999741293L);
    moom.vJ.a = ((float)((__sourceExactCall_9eb97cb89f5297(((net.minecraft.entity.boss.IBossDisplayData)(p0))) / ((net.minecraft.entity.boss.IBossDisplayData)(p0)).a())));
    moom.vJ.b = ((int)(((int) moom.vJ.g)));
    moom.vJ.c = ((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.entity.boss.IBossDisplayData)(p0)).a__C5())).c()));
    moom.vJ.d = ((boolean)(p1));
    return;
}


private static native float __sourceExactCall_9eb97cb89f5297(net.minecraft.entity.boss.IBossDisplayData p0);
}
