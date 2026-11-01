package net.minecraft.village;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class MerchantRecipe {

private net.minecraft.item.ItemStack a;

private net.minecraft.item.ItemStack b;

private net.minecraft.item.ItemStack c;

private int d;

private int e;

private boolean f;

private static boolean g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public MerchantRecipe(net.minecraft.item.ItemStack p0, net.minecraft.item.Item p1) {
this(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p1))));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_b3431a29449b2483_0(net.minecraft.village.MerchantRecipe a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2, net.minecraft.item.ItemStack a3, int a4, int a5) throws E;

public MerchantRecipe(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
this(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.item.ItemStack)(null)), ((net.minecraft.item.ItemStack)(p1)));
    return;
}


public MerchantRecipe(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1, net.minecraft.item.ItemStack p2, int p3, int p4) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = true;
}


public MerchantRecipe(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1, net.minecraft.item.ItemStack p2) { this((net.minecraft.item.ItemStack)null, (net.minecraft.item.ItemStack)null, (net.minecraft.item.ItemStack)null, 0, 0); }


private static void __sourceConstructorBody_b3431a29449b2483(net.minecraft.village.MerchantRecipe receiver, net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1, net.minecraft.item.ItemStack p2) throws Throwable {

long local4_life1 = (net.minecraft.village.MerchantRecipe.h ^ 14604485057894L);

    net.minecraft.village.MerchantRecipe.__sourceConstructorInit_b3431a29449b2483_0(((net.minecraft.village.MerchantRecipe)(receiver)), ((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.item.ItemStack)(p1)), ((net.minecraft.item.ItemStack)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_b3431a29449b2483_originalDynamicSite1164_2(14873, (6028999426195422321L ^ local4_life1)))));

    return;

}



public MerchantRecipe(net.minecraft.nbt.NBTTagCompound p0) {
super();
    (this).a(p0);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-6087290680234110304L)), ((long)(-2848825961175905539L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(109233165113257L)))));
    int __sourceSpill1936_6 = 0;
    k = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.village.MerchantRecipe.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1936_6))));
    long local0_life9 = (net.minecraft.village.MerchantRecipe.h ^ 100345317968375L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1936_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1936_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1936_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1936_16 = new byte[8];
    (__sourceSpill1936_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1936_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1936_18 = __sourceSpill1936_16;
    ((javax.crypto.Cipher)(__sourceSpill1936_13)).init(((int)(__sourceSpill1936_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1936_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1936_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[5];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "º\006:/'1ü\016ù@W y\t\004zÂGvm½"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1936_27 = local6_life23;
        int __sourceSpill1936_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1936_27)).substring(((int)(__sourceSpill1936_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1936_32 = local8_life21;
        int __sourceSpill1936_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1936_35 = new byte[8];
        (__sourceSpill1936_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1936_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1936_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1936_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1936_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1936_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1936_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1936_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1936_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1936_36)).doFinal(((byte[])(__sourceSpill1936_35)));
        (__sourceSpill1936_32)[__sourceSpill1936_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "øU\b\003={ã´pL»¬ô>"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1936_40 = local6_life23;
        int __sourceSpill1936_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1936_40)).substring(((int)(__sourceSpill1936_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1936_45 = local8_life21;
        int __sourceSpill1936_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1936_48 = new byte[8];
        (__sourceSpill1936_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1936_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1936_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1936_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1936_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1936_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1936_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1936_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1936_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1936_49)).doFinal(((byte[])(__sourceSpill1936_48)));
        (__sourceSpill1936_45)[__sourceSpill1936_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    i = ((long[])(local8_life21));
    j = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


public int b() {
return this.e;
}


public boolean b__Boolean() {
int forwardValue5753_14_0;
    int forwardValue5753_16_0;
    int spill5753_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (net.minecraft.village.MerchantRecipe.h ^ 42907531909842L);
    life3_5 = ((net.minecraft.village.MerchantRecipe.e()) ? 1 : 0);
    spill5753_0 = this.d;
    if (!((life3_5 != 0))) {
        forwardValue5753_14_0 = spill5753_0;
        break forward_join_14;
    }
    if (!((spill5753_0 >= this.e))) {
        break forward_join_15;
    }
    forwardValue5753_14_0 = 1;
    }
    forwardValue5753_16_0 = forwardValue5753_14_0;
    break forward_join_16;
    }
    forwardValue5753_16_0 = 0;
    }
    return ((forwardValue5753_16_0) != 0);
}


public void b__Void() {
this.d = ((int)(this.e));
    return;
}


public static void b(boolean p0) {
g = ((boolean)(p0));
    return;
}


public net.minecraft.item.ItemStack b__xW() {
return this.b;
}


public static boolean e() {
int local0 = __sourceIntrinsic_booleanToInteger(net.minecraft.village.MerchantRecipe.d());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public net.minecraft.item.ItemStack c() {
return this.c;
}


public boolean c__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


public static boolean d() {
return ((((net.minecraft.village.MerchantRecipe.g) ? 1 : 0)) != 0);
}


public net.minecraft.item.ItemStack a__xW() {
return this.a;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12388_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/D8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26238;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/D8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.village.MerchantRecipe.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__Void() {
this.d += 1;
    return;
}


public void a(int p0) {
this.e += p0;
    return;
}


public boolean a__Boolean() {
long local1 = (net.minecraft.village.MerchantRecipe.h ^ 78022094234006L);
    return ((((this.b != null) ? 1 : 0)) != 0);
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5752_47_0;
    int forwardValue5752_63_0;
    boolean spill5752_0;
    boolean spill5752_1;
    long life2_3;
    net.minecraft.nbt.NBTTagCompound life5_8;
    int life4_9;
    net.minecraft.nbt.NBTTagCompound life6_17;
    forward_join_93: {
    forward_join_90: {
    forward_join_78: {
    forward_join_71: {
    forward_join_63: {
    forward_join_55: {
    forward_join_47: {
    forward_join_39: {
    life2_3 = (net.minecraft.village.MerchantRecipe.h ^ 82258745783109L);
    spill5752_0 = net.minecraft.village.MerchantRecipe.d();
    life5_8 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("buy")));
    life4_9 = ((spill5752_0) ? 1 : 0);
    this.a = ((net.minecraft.item.ItemStack)(net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(life5_8)))));
    life6_17 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("sell")));
    this.c = ((net.minecraft.item.ItemStack)(net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(life6_17)))));
    spill5752_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("buyB")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic5752_9(8515, (1188134233784600846L ^ life2_3)))));
    if (!((life4_9 == 0))) {
        forwardValue5752_47_0 = ((spill5752_1) ? 1 : 0);
        break forward_join_47;
    }
    if (!(spill5752_1)) {
        break forward_join_39;
    }
    this.b = ((net.minecraft.item.ItemStack)(net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("buyB"))))))));
    }
    forwardValue5752_47_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("uses")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic5752_15(28735, (3120387679510960245L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue5752_63_0 = forwardValue5752_47_0;
        break forward_join_63;
    }
    if (!((forwardValue5752_47_0 != 0))) {
        break forward_join_55;
    }
    this.d = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("uses")))));
    }
    forwardValue5752_63_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("maxUses")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic5752_20(29604, (3579922629421997037L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue5752_63_0 != 0))) {
        break forward_join_71;
    }
    this.e = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("maxUses")))));
    if (!((life4_9 != 0))) {
        break forward_join_78;
    }
    }
    this.e = ((int)(__sourceIntrinsic_658b606e7852_invokedynamic5752_25(13242, (6878030212800863218L ^ life2_3))));
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("rewardExp")), ((int)(1))))) {
        break forward_join_90;
    }
    this.f = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("rewardExp")))));
    if (!((life4_9 != 0))) {
        break forward_join_93;
    }
    }
    this.f = ((boolean)(true));
    }
    return;
}


public net.minecraft.nbt.NBTTagCompound a__yw() {
long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_8;
    int life3_9;
    life1_3 = (net.minecraft.village.MerchantRecipe.h ^ 28749113061985L);
    boolean spill10258_0 = net.minecraft.village.MerchantRecipe.e();
    life4_8 = new net.minecraft.nbt.NBTTagCompound();
    life3_9 = ((spill10258_0) ? 1 : 0);
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("buy")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(this.a)).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("sell")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(this.c)).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    if ((life3_9 != 0)) {
        if ((this.b != null)) {
        ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("buyB")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(this.b)).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    }
        ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a__Void(((java.lang.String)("uses")), ((int)(this.d)));
        ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a__Void(((java.lang.String)("maxUses")), ((int)(this.e)));
        ((net.minecraft.nbt.NBTTagCompound)(life4_8)).a(((java.lang.String)("rewardExp")), ((boolean)(this.f)));
    }
    return life4_8;
}


public int a() {
return this.d;
}


private static native <E extends Throwable> int __sourceIntrinsic_b3431a29449b2483_originalDynamicSite1164_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12388_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic5752_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic5752_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic5752_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic5752_25(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
