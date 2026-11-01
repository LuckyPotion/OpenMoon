package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xa extends net.minecraft.item.Item {

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public xa() { super(); }


private static void __sourceConstructorBody_42aeee9536405cf8(moom.xa receiver) throws Throwable {

long local1 = (moom.xa.n ^ 29186901794921L);

    moom.xa.__sourceConstructorInit_42aeee9536405cf8_0(((moom.xa)(receiver)));

    ((moom.xa)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.e)));

    ((moom.xa)(receiver)).b(((int)(1)));

    ((moom.xa)(receiver)).c(((int)(__sourceIntrinsic_42aeee9536405cf8_originalDynamicSite3545_5(17201, (7050497622814631624L ^ local1)))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_42aeee9536405cf8_0(moom.xa a0) throws E;

static {
n = ((long)(((moom._a)(moom._c.a(((long)(-2607658942920453030L)), ((long)(4932245222713762917L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(262400175942992L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xa.n ^ 48435087999219L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1107_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1107_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1107_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1107_14 = new byte[8];
    (__sourceSpill1107_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1107_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1107_16 = __sourceSpill1107_14;
    ((javax.crypto.Cipher)(__sourceSpill1107_11)).init(((int)(__sourceSpill1107_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1107_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1107_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = ">µXÆ\037ßI£-\007*³»jÝBb{lfï"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1107_25 = local6_life21;
        int __sourceSpill1107_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1107_25)).substring(((int)(__sourceSpill1107_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1107_30 = local8_life19;
        int __sourceSpill1107_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1107_33 = new byte[8];
        (__sourceSpill1107_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1107_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1107_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1107_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1107_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1107_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1107_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1107_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1107_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1107_34)).doFinal(((byte[])(__sourceSpill1107_33)));
        (__sourceSpill1107_30)[__sourceSpill1107_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6575;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xa.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9713_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xa"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean c__Boolean() {
return ((1) != 0);
}


public boolean d__Boolean() {
return ((1) != 0);
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.entity.player.EntityPlayer forwardValue4507_69_0;
    net.minecraft.item.ItemStack forwardValue4507_75_0;
    net.minecraft.entity.player.EntityPlayer spill4507_0;
    net.minecraft.item.ItemStack spill4507_1;
    net.minecraft.item.ItemStack spill4507_2;
    long life4_3;
    int life6_5;
    net.minecraft.entity.Entity life8_16;
    net.minecraft.entity.passive.EntityPig life7_27;
    net.minecraft.item.ItemStack life8_82;
    forward_join_75: {
    forward_join_74: {
    forward_join_69: {
    forward_join_68: {
    life4_3 = (moom.xa.n ^ 10385321446627L);
    life6_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4507_0 = p2;
    if (!((life6_5 == 0))) {
        forwardValue4507_69_0 = spill4507_0;
        break forward_join_69;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill4507_0)).s__Boolean())) {
        break forward_join_68;
    }
    life8_16 = ((net.minecraft.entity.player.EntityPlayer)(p2)).g;
    if (!((life6_5 == 0))) {
        break forward_join_74;
    }
    if (!((((life8_16 instanceof net.minecraft.entity.passive.EntityPig) ? 1 : 0) != 0))) {
        break forward_join_68;
    }
    life7_27 = ((net.minecraft.entity.passive.EntityPig)(life8_16));
    if (!((life6_5 == 0))) {
        break forward_join_74;
    }
    if (!(((moom.uk)(((net.minecraft.entity.passive.EntityPig)(life7_27)).a__sourceReturn_3358aa1956())).g())) {
        break forward_join_68;
    }
    spill4507_1 = p0;
    if (!((life6_5 == 0))) {
        forwardValue4507_75_0 = spill4507_1;
        break forward_join_75;
    }
    if (!(((((net.minecraft.item.ItemStack)(spill4507_1)).d() - ((net.minecraft.item.ItemStack)(p0)).c()) >= __sourceIntrinsic_69c34d036b8d_invokedynamic4507_11(8626, (3697785160877697218L ^ life4_3))))) {
        break forward_join_68;
    }
    ((moom.uk)(((net.minecraft.entity.passive.EntityPig)(life7_27)).a__sourceReturn_3358aa1956())).d__sourceReturn_da8c82d5d4();
    ((net.minecraft.item.ItemStack)(p0)).a(((int)(__sourceIntrinsic_69c34d036b8d_invokedynamic4507_14(10036, (1894520011182534213L ^ life4_3)))), ((net.minecraft.entity.EntityLivingBase)(p2)));
    spill4507_2 = p0;
    if (!((life6_5 == 0))) {
        forwardValue4507_75_0 = spill4507_2;
        break forward_join_75;
    }
    if (!((((net.minecraft.item.ItemStack)(spill4507_2)).b == 0))) {
        break forward_join_68;
    }
    life8_82 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aR);
    ((net.minecraft.item.ItemStack)(life8_82)).b(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p0)).a__yw())));
    return life8_82;
    }
    forwardValue4507_69_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4507_69_0)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    forwardValue4507_75_0 = p0;
    }
    return forwardValue4507_75_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_42aeee9536405cf8_originalDynamicSite3545_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9713_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69c34d036b8d_invokedynamic4507_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69c34d036b8d_invokedynamic4507_14(int a0, long a1) throws E;
}
