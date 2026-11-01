package net.minecraft.item;


public class ItemFishFood$FishType extends sourcebuild.EnumConstructor<net.minecraft.item.ItemFishFood$FishType> {

public static net.minecraft.item.ItemFishFood$FishType COD;

public static net.minecraft.item.ItemFishFood$FishType SALMON;

public static net.minecraft.item.ItemFishFood$FishType CLOWNFISH;

public static net.minecraft.item.ItemFishFood$FishType PUFFERFISH;

private static java.util.Map<java.lang.Integer, net.minecraft.item.ItemFishFood$FishType> a;

private int b;

private java.lang.String c;

private int d;

private float e;

private int f;

private float g;

private boolean h;

private static net.minecraft.item.ItemFishFood$FishType[] i;

private static long j;

private ItemFishFood$FishType(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4, float p5) {
super(p0, p1);
    this.h = false;
    this.b = p2;
    this.c = p3;
    this.d = p4;
    this.e = p5;
    this.f = 0;
    this.g = 0x0.0p+0f;
    this.h = false;
}


private ItemFishFood$FishType(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4, float p5, int p6, float p7) {
super(p0, p1);
    this.h = false;
    this.b = p2;
    this.c = p3;
    this.d = p4;
    this.e = p5;
    this.f = p6;
    this.g = p7;
    this.h = true;
}


private static void initialize() {
j = ((long)(((moom._a)(moom._c.a(((long)(3169943174232552845L)), ((long)(8047699946348761760L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(256435540232360L)))));
    long local6_life6 = (net.minecraft.item.ItemFishFood$FishType.j ^ 86996890511590L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill1199_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1199_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1199_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1199_13 = new byte[8];
    (__sourceSpill1199_13)[0] = ((byte) ((int) (local6_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill1199_13)[local2_life14] = ((byte) ((int) ((local6_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation1199_15 = __sourceSpill1199_13;
    ((javax.crypto.Cipher)(__sourceSpill1199_10)).init(((int)(__sourceSpill1199_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1199_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1199_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local3_life18 = 3553940447602950800L;
    byte[] __sourceSpill1199_19 = new byte[8];
    (__sourceSpill1199_19)[0] = ((byte) ((int) (local3_life18 >>> 56)));
    (__sourceSpill1199_19)[1] = ((byte) ((int) (local3_life18 >>> 48)));
    (__sourceSpill1199_19)[2] = ((byte) ((int) (local3_life18 >>> 40)));
    (__sourceSpill1199_19)[3] = ((byte) ((int) (local3_life18 >>> 32)));
    (__sourceSpill1199_19)[4] = ((byte) ((int) (local3_life18 >>> 24)));
    (__sourceSpill1199_19)[5] = ((byte) ((int) (local3_life18 >>> 16)));
    (__sourceSpill1199_19)[6] = ((byte) ((int) (local3_life18 >>> 8)));
    (__sourceSpill1199_19)[7] = ((byte) ((int) local3_life18));
    javax.crypto.Cipher __sourceSpill1199_20 = local1_life8;
    byte[] local5_life22 = ((javax.crypto.Cipher)(__sourceSpill1199_20)).doFinal(((byte[])(__sourceSpill1199_19)));
    long local0_life23 = (((((((((((long) (local5_life22)[0]) & 255L) << 56) | ((((long) (local5_life22)[1]) & 255L) << 48)) | ((((long) (local5_life22)[2]) & 255L) << 40)) | ((((long) (local5_life22)[3]) & 255L) << 32)) | ((((long) (local5_life22)[4]) & 255L) << 24)) | ((((long) (local5_life22)[5]) & 255L) << 16)) | ((((long) (local5_life22)[6]) & 255L) << 8)) | (((long) (local5_life22)[7]) & 255L));
    COD = ((net.minecraft.item.ItemFishFood$FishType)(new net.minecraft.item.ItemFishFood$FishType("COD", 0, 0, "cod", 2, 0x1.99999ap-4f, 5, 0x1.333334p-1f)));
    SALMON = ((net.minecraft.item.ItemFishFood$FishType)(new net.minecraft.item.ItemFishFood$FishType("SALMON", 1, 1, "salmon", 2, 0x1.99999ap-4f, ((int) local0_life23), 0x1.99999ap-1f)));
    CLOWNFISH = ((net.minecraft.item.ItemFishFood$FishType)(new net.minecraft.item.ItemFishFood$FishType("CLOWNFISH", 2, 2, "clownfish", 1, 0x1.99999ap-4f)));
    PUFFERFISH = ((net.minecraft.item.ItemFishFood$FishType)(new net.minecraft.item.ItemFishFood$FishType("PUFFERFISH", 3, 3, "pufferfish", 1, 0x1.99999ap-4f)));
    i = ((net.minecraft.item.ItemFishFood$FishType[])(net.minecraft.item.ItemFishFood$FishType.a__Arraya6()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    net.minecraft.item.ItemFishFood$FishType[] local8_life33 = net.minecraft.item.ItemFishFood$FishType.values();
    int local9_life34 = (local8_life33).length;
    int local10_life35 = 0;
    while ((local10_life35 < local9_life34)) {
        net.minecraft.item.ItemFishFood$FishType local11_life36 = (local8_life33)[local10_life35];
        ((java.util.Map)(net.minecraft.item.ItemFishFood$FishType.a)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.item.ItemFishFood$FishType)(local11_life36)).a__Int()))))), ((java.lang.Object)(local11_life36)));
        local10_life35 += 1;
    }
}


public static net.minecraft.item.ItemFishFood$FishType[] values() {
return ((net.minecraft.item.ItemFishFood$FishType[])(((net.minecraft.item.ItemFishFood$FishType[])(net.minecraft.item.ItemFishFood$FishType.i)).clone()));
}


public static net.minecraft.item.ItemFishFood$FishType valueOf(java.lang.String p0) {
return ((net.minecraft.item.ItemFishFood$FishType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.item.ItemFishFood$FishType.class)), ((java.lang.String)(p0)))));
}


public int b__Int() {
return this.d;
}


public float b() {
return this.g;
}


public int c() {
return this.f;
}


public static net.minecraft.item.ItemFishFood$FishType a(net.minecraft.item.ItemStack p0) {
int forwardValue5476_14_0;
    net.minecraft.item.ItemFishFood$FishType forwardValue5476_17_0;
    int spill5476_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life1_3 = (net.minecraft.item.ItemFishFood$FishType.j ^ 78093246810293L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5476_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof moom.xr) ? 1 : 0);
    if (!((life3_5 == 0))) {
        forwardValue5476_14_0 = spill5476_0;
        break forward_join_14;
    }
    if (!((spill5476_0 != 0))) {
        break forward_join_16;
    }
    forwardValue5476_14_0 = ((net.minecraft.item.ItemStack)(p0)).c();
    }
    forwardValue5476_17_0 = net.minecraft.item.ItemFishFood$FishType.a(((int)(forwardValue5476_14_0)));
    break forward_join_17;
    }
    forwardValue5476_17_0 = net.minecraft.item.ItemFishFood$FishType.COD;
    }
    return forwardValue5476_17_0;
}


private static net.minecraft.item.ItemFishFood$FishType[] a__Arraya6() {
return new net.minecraft.item.ItemFishFood$FishType[] {net.minecraft.item.ItemFishFood$FishType.COD, net.minecraft.item.ItemFishFood$FishType.SALMON, net.minecraft.item.ItemFishFood$FishType.CLOWNFISH, net.minecraft.item.ItemFishFood$FishType.PUFFERFISH};
}


public int a__Int() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public float a() {
return this.e;
}


public java.lang.String a__String() {
return this.c;
}


public boolean a__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public static net.minecraft.item.ItemFishFood$FishType a(int p0) {
net.minecraft.item.ItemFishFood$FishType forwardValue5475_17_0;
    net.minecraft.item.ItemFishFood$FishType forwardValue5475_19_0;
    boolean spill5475_0;
    net.minecraft.item.ItemFishFood$FishType spill5475_1;
    long life1_3;
    net.minecraft.item.ItemFishFood$FishType life4_10;
    int life3_11;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.item.ItemFishFood$FishType.j ^ 56912477646738L);
    spill5475_0 = net.minecraft.item.ItemStack.l();
    life4_10 = ((net.minecraft.item.ItemFishFood$FishType)(((java.util.Map)(net.minecraft.item.ItemFishFood$FishType.a)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
    life3_11 = ((spill5475_0) ? 1 : 0);
    spill5475_1 = life4_10;
    if (!((life3_11 == 0))) {
        forwardValue5475_17_0 = spill5475_1;
        break forward_join_17;
    }
    if (!((spill5475_1 == null))) {
        break forward_join_18;
    }
    forwardValue5475_17_0 = net.minecraft.item.ItemFishFood$FishType.COD;
    }
    forwardValue5475_19_0 = forwardValue5475_17_0;
    break forward_join_19;
    }
    forwardValue5475_19_0 = life4_10;
    }
    return forwardValue5475_19_0;
}

}
