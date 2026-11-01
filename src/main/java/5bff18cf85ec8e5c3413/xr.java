package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xr extends moom.xp {

private final boolean w;

private static final long x;

private static final long[] A;

private static final java.lang.Integer[] H;

private static final java.util.Map I;

public xr(boolean p0) {
super(0, 0x0.0p+0f, false);
    this.w = p0;
}


static {
x = ((long)(((moom._a)(moom._c.a(((long)(-4644580119898719854L)), ((long)(252202555559534724L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(17309452624452L)))));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xr.x ^ 31505974781175L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1117_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1117_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1117_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1117_14 = new byte[8];
    (__sourceSpill1117_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1117_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1117_16 = __sourceSpill1117_14;
    ((javax.crypto.Cipher)(__sourceSpill1117_11)).init(((int)(__sourceSpill1117_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1117_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1117_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "­\r×\003\026\0169¿Ó½;qjM ×h*÷-\0305\017"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1117_25 = local6_life21;
        int __sourceSpill1117_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1117_25)).substring(((int)(__sourceSpill1117_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1117_30 = local8_life19;
        int __sourceSpill1117_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1117_33 = new byte[8];
        (__sourceSpill1117_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1117_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1117_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1117_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1117_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1117_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1117_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1117_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1117_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1117_34)).doFinal(((byte[])(__sourceSpill1117_33)));
        (__sourceSpill1117_30)[__sourceSpill1117_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    A = ((long[])(local8_life19));
    H = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
java.lang.String forwardValue4540_20_0;
    java.lang.String forwardValue4540_20_1;
    int forwardValue4540_20_2;
    java.lang.String forwardValue4540_23_0;
    java.lang.String forwardValue4540_23_1;
    java.lang.String forwardValue4540_24_0;
    java.lang.String forwardValue4540_24_1;
    java.lang.String forwardValue4540_24_2;
    boolean spill4540_0;
    java.lang.String spill4540_1;
    java.lang.String spill4540_2;
    boolean spill4540_3;
    long life2_3;
    net.minecraft.item.ItemFishFood$FishType life5_7;
    int life4_8;
    forward_join_24: {
    forward_join_23: {
    forward_join_20: {
    life2_3 = (moom.xr.x ^ 7302525111322L);
    spill4540_0 = net.minecraft.item.ItemStack.m();
    life5_7 = net.minecraft.item.ItemFishFood$FishType.a(((net.minecraft.item.ItemStack)(p0)));
    life4_8 = ((spill4540_0) ? 1 : 0);
    spill4540_1 = ((moom.xr)(this)).a__String();
    spill4540_2 = ((net.minecraft.item.ItemFishFood$FishType)(life5_7)).a__String();
    spill4540_3 = this.w;
    if (!((life4_8 != 0))) {
        forwardValue4540_20_0 = spill4540_1;
        forwardValue4540_20_1 = spill4540_2;
        forwardValue4540_20_2 = ((spill4540_3) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4540_3)) {
        forwardValue4540_23_0 = spill4540_1;
        forwardValue4540_23_1 = spill4540_2;
        break forward_join_23;
    }
    forwardValue4540_20_0 = spill4540_1;
    forwardValue4540_20_1 = spill4540_2;
    forwardValue4540_20_2 = ((((net.minecraft.item.ItemFishFood$FishType)(life5_7)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4540_20_2 != 0))) {
        forwardValue4540_23_0 = forwardValue4540_20_0;
        forwardValue4540_23_1 = forwardValue4540_20_1;
        break forward_join_23;
    }
    forwardValue4540_24_0 = forwardValue4540_20_0;
    forwardValue4540_24_1 = forwardValue4540_20_1;
    forwardValue4540_24_2 = "cooked";
    break forward_join_24;
    }
    forwardValue4540_24_0 = forwardValue4540_23_0;
    forwardValue4540_24_1 = forwardValue4540_23_1;
    forwardValue4540_24_2 = "raw";
    }
    return __sourceIntrinsic_33df8f166dd6_invokedynamic4540_10(forwardValue4540_24_0, forwardValue4540_24_1, forwardValue4540_24_2);
}


protected void b__Void(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
long life4_3;
    net.minecraft.item.ItemFishFood$FishType life7_7;
    int life6_8;
    life4_3 = (moom.xr.x ^ 51071460890324L);
    boolean spill7950_0 = net.minecraft.item.ItemStack.m();
    life7_7 = net.minecraft.item.ItemFishFood$FishType.a(((net.minecraft.item.ItemStack)(p0)));
    life6_8 = ((spill7950_0) ? 1 : 0);
    if ((life6_8 != 0)) {
        if ((life7_7 == net.minecraft.item.ItemFishFood$FishType.PUFFERFISH)) {
        ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v)).I, __sourceIntrinsic_07c62d08f495_invokedynamic7950_7(10068, (2908689218879837008L ^ life4_3)), 3))));
        ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.t)).I, __sourceIntrinsic_07c62d08f495_invokedynamic7950_11(9042, (8393430320377943892L ^ life4_3)), 2))));
        ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.l)).I, __sourceIntrinsic_07c62d08f495_invokedynamic7950_15(13788, (889563055501754843L ^ life4_3)), 1))));
    }
        super.b__Void(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)));
    }
    return;
}


public int b(net.minecraft.item.ItemStack p0) {
int forwardValue4539_18_0;
    net.minecraft.item.ItemFishFood$FishType forwardValue4539_23_0;
    int forwardValue4539_24_0;
    boolean spill4539_0;
    boolean spill4539_1;
    net.minecraft.item.ItemFishFood$FishType spill4539_2;
    long life2_3;
    net.minecraft.item.ItemFishFood$FishType life5_7;
    int life4_8;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life2_3 = (moom.xr.x ^ 27205269438300L);
    spill4539_0 = net.minecraft.item.ItemStack.m();
    life5_7 = net.minecraft.item.ItemFishFood$FishType.a(((net.minecraft.item.ItemStack)(p0)));
    life4_8 = ((spill4539_0) ? 1 : 0);
    spill4539_1 = this.w;
    if (!((life4_8 != 0))) {
        forwardValue4539_18_0 = ((spill4539_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4539_1)) {
        break forward_join_22;
    }
    spill4539_2 = life5_7;
    if (!((life4_8 != 0))) {
        forwardValue4539_23_0 = spill4539_2;
        break forward_join_23;
    }
    forwardValue4539_18_0 = ((((net.minecraft.item.ItemFishFood$FishType)(spill4539_2)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4539_18_0 != 0))) {
        break forward_join_22;
    }
    forwardValue4539_24_0 = ((net.minecraft.item.ItemFishFood$FishType)(life5_7)).c();
    break forward_join_24;
    }
    forwardValue4539_23_0 = life5_7;
    }
    forwardValue4539_24_0 = ((net.minecraft.item.ItemFishFood$FishType)(forwardValue4539_23_0)).b__Int();
    }
    return forwardValue4539_24_0;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9761_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10114;
      if (H[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = A[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])I.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               I.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         H[var3] = var15;
      }

      return H[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xr.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String c(net.minecraft.item.ItemStack p0) {
long local2 = (moom.xr.x ^ 83485859702702L);
    return ((net.minecraft.item.ItemFishFood$FishType.a(((net.minecraft.item.ItemStack)(p0))) == net.minecraft.item.ItemFishFood$FishType.PUFFERFISH) ? "+0-1+2+3+13&4-4" : null);
}


public float a(net.minecraft.item.ItemStack p0) {
int forwardValue4538_18_0;
    net.minecraft.item.ItemFishFood$FishType forwardValue4538_23_0;
    float forwardValue4538_24_0;
    boolean spill4538_0;
    boolean spill4538_1;
    net.minecraft.item.ItemFishFood$FishType spill4538_2;
    long life2_3;
    net.minecraft.item.ItemFishFood$FishType life5_7;
    int life4_8;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life2_3 = (moom.xr.x ^ 94049435263703L);
    spill4538_0 = net.minecraft.item.ItemStack.l();
    life5_7 = net.minecraft.item.ItemFishFood$FishType.a(((net.minecraft.item.ItemStack)(p0)));
    life4_8 = ((spill4538_0) ? 1 : 0);
    spill4538_1 = this.w;
    if (!((life4_8 == 0))) {
        forwardValue4538_18_0 = ((spill4538_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4538_1)) {
        break forward_join_22;
    }
    spill4538_2 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue4538_23_0 = spill4538_2;
        break forward_join_23;
    }
    forwardValue4538_18_0 = ((((net.minecraft.item.ItemFishFood$FishType)(spill4538_2)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4538_18_0 != 0))) {
        break forward_join_22;
    }
    forwardValue4538_24_0 = ((net.minecraft.item.ItemFishFood$FishType)(life5_7)).b();
    break forward_join_24;
    }
    forwardValue4538_23_0 = life5_7;
    }
    forwardValue4538_24_0 = ((net.minecraft.item.ItemFishFood$FishType)(forwardValue4538_23_0)).a();
    }
    return forwardValue4538_24_0;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int lexicalValue1421_39_0;
    boolean spill1421_0;
    boolean spill1421_1;
    boolean spill1421_2;
    long life4_3;
    net.minecraft.item.ItemFishFood$FishType[] life7_6;
    int life6_7;
    int life8_10;
    int life9_12;
    net.minecraft.item.ItemFishFood$FishType life10_19;
    lexical_join_43: {
    life4_3 = (moom.xr.x ^ 4392144709381L);
    spill1421_0 = net.minecraft.item.ItemStack.l();
    life7_6 = net.minecraft.item.ItemFishFood$FishType.values();
    life6_7 = ((spill1421_0) ? 1 : 0);
    life8_10 = (life7_6).length;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_30: {
    if (!((life9_12 < life8_10))) {
        break lexical_join_43;
    }
    life10_19 = (life7_6)[life9_12];
    spill1421_1 = this.w;
    if (!((life6_7 == 0))) {
        lexicalValue1421_39_0 = ((spill1421_1) ? 1 : 0);
        break lexical_join_39;
    }
    if (!(spill1421_1)) {
        break lexical_join_30;
    }
    spill1421_2 = ((net.minecraft.item.ItemFishFood$FishType)(life10_19)).a__Boolean();
    if (!((life6_7 == 0))) {
        lexicalValue1421_39_0 = ((spill1421_2) ? 1 : 0);
        break lexical_join_39;
    }
    if (!(spill1421_2)) {
        break lexical_join_40;
    }
    }
    lexicalValue1421_39_0 = ((((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(this, 1, ((net.minecraft.item.ItemFishFood$FishType)(life10_19)).a__Int()))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1421_39_0);
    }
    life9_12 += 1;
    if (!((life6_7 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33df8f166dd6_invokedynamic4540_10(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07c62d08f495_invokedynamic7950_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07c62d08f495_invokedynamic7950_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07c62d08f495_invokedynamic7950_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9761_0() throws E;
}
