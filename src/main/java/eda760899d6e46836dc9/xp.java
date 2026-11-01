package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xp extends net.minecraft.item.Item {

public int n;

private int o;

private float p;

private boolean q;

private boolean r;

private int s;

private int t;

private int u;

private float v;

private static long z;

private static long[] E;

private static java.lang.Integer[] F;

private static java.util.Map G;

public xp(int p0, float p1, boolean p2) { super(); }


private static void __sourceConstructorBody_7e7ec741d8ee0463(moom.xp receiver, int p0, float p1, boolean p2) throws Throwable {

long local4 = (moom.xp.z ^ 82453184691765L);

    moom.xp.__sourceConstructorInit_7e7ec741d8ee0463_0(((moom.xp)(receiver)));

    ((moom.xp)(receiver)).n = ((int)(__sourceIntrinsic_7e7ec741d8ee0463_originalDynamicSite3561_2(3717, (6317710727287851680L ^ local4))));

    ((moom.xp)(receiver)).o = ((int)(p0));

    ((moom.xp)(receiver)).q = ((boolean)(p2));

    ((moom.xp)(receiver)).p = ((float)(p1));

    ((moom.xp)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.h)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_7e7ec741d8ee0463_0(moom.xp a0) throws E;

public xp(int p0, boolean p1) {
this(((int)(p0)), ((float)(0x1.333334p-1f)), ((boolean)(p1)));
    return;
}


static {
z = ((long)(((moom._a)(moom._c.a(((long)(-795569170757804167L)), ((long)(-1774469827472332139L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(242497231443625L)))));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xp.z ^ 90189819109385L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1116_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1116_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1116_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1116_14 = new byte[8];
    (__sourceSpill1116_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1116_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1116_16 = __sourceSpill1116_14;
    ((javax.crypto.Cipher)(__sourceSpill1116_11)).init(((int)(__sourceSpill1116_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1116_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1116_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "«ÎzÒ\005¤ÔË\022&\023\030ÖðÝ\021\020\006pcá"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1116_25 = local6_life21;
        int __sourceSpill1116_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1116_25)).substring(((int)(__sourceSpill1116_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1116_30 = local8_life19;
        int __sourceSpill1116_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1116_33 = new byte[8];
        (__sourceSpill1116_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1116_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1116_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1116_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1116_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1116_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1116_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1116_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1116_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1116_34)).doFinal(((byte[])(__sourceSpill1116_33)));
        (__sourceSpill1116_30)[__sourceSpill1116_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    E = ((long[])(local8_life19));
    F = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public boolean i() {
return ((((this.q) ? 1 : 0)) != 0);
}


public int b(net.minecraft.item.ItemStack p0) {
return this.o;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9752_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15541;
      if (F[var3] == null) {
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
         long var5 = E[var3];
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
         Object[] var9 = (Object[])G.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               G.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         F[var3] = var15;
      }

      return F[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xp.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b__Void(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue4534_13_0;
    int forwardValue4534_22_0;
    boolean spill4534_0;
    long life4_3;
    int life6_5;
    forward_join_40: {
    forward_join_22: {
    forward_join_13: {
    life4_3 = (moom.xp.z ^ 2726607361312L);
    life6_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4534_0 = ((net.minecraft.world.World)(p1)).G;
    if (!((life6_5 == 0))) {
        forwardValue4534_13_0 = ((spill4534_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill4534_0))) {
        break forward_join_40;
    }
    forwardValue4534_13_0 = this.s;
    }
    if (!((life6_5 == 0))) {
        forwardValue4534_22_0 = forwardValue4534_13_0;
        break forward_join_22;
    }
    if (!((forwardValue4534_13_0 > 0))) {
        break forward_join_40;
    }
    forwardValue4534_22_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.world.World)(p1)).u)).nextFloat())), ((float)(this.v)));
    }
    if (!((forwardValue4534_22_0 < 0))) {
        break forward_join_40;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(this.s, (this.t * __sourceIntrinsic_07c62d08f495_invokedynamic4534_12(17930, (158918797857597753L ^ life4_3))), this.u))));
    }
    return;
}


public net.minecraft.item.ItemStack b(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
p0.b -= 1;
    ((net.minecraft.util.FoodStats)(((net.minecraft.entity.player.EntityPlayer)(p2)).a__C2())).a(((moom.xp)(this)), ((net.minecraft.item.ItemStack)(p0)));
    ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.Entity)(p2)), ((java.lang.String)("random.burp")), ((float)(0x1.0p-1f)), ((float)(((((java.util.Random)(((net.minecraft.world.World)(p1)).u)).nextFloat() * 0x1.99999ap-4f) + 0x1.ccccccp-1f))));
    ((moom.xp)(this)).b__Void(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)));
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    return p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a__Int(net.minecraft.item.ItemStack p0) {
long local2 = (moom.xp.z ^ 22373884788954L);
    return __sourceIntrinsic_43fb644d1c12_originalDynamicSite1707_1(9940, (7274472566486064159L ^ local2));
}


public float a(net.minecraft.item.ItemStack p0) {
return this.p;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.entity.player.EntityPlayer forwardValue4533_14_0;
    net.minecraft.entity.player.EntityPlayer spill4533_0;
    long life4_3;
    int life6_5;
    forward_join_19: {
    forward_join_14: {
    life4_3 = (moom.xp.z ^ 17633682626170L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4533_0 = p2;
    if (!((life6_5 != 0))) {
        forwardValue4533_14_0 = spill4533_0;
        break forward_join_14;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill4533_0)).a__Boolean(((boolean)(this.r))))) {
        break forward_join_19;
    }
    forwardValue4533_14_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4533_14_0)).b(((net.minecraft.item.ItemStack)(p0)), ((int)(((moom.xp)(this)).a__Int(((net.minecraft.item.ItemStack)(p0))))));
    }
    return p0;
}


public moom.a1 a__a1(net.minecraft.item.ItemStack p0) {
return moom.a1.EAT;
}


public moom.xp a(int p0, int p1, int p2, float p3) {
this.s = ((int)(p0));
    this.t = ((int)(p1));
    this.u = ((int)(p2));
    this.v = ((float)(p3));
    return this;
}


public moom.xp a__sourceReturn_cc010b59bf() {
this.r = ((boolean)(true));
    return this;
}


private static native <E extends Throwable> int __sourceIntrinsic_7e7ec741d8ee0463_originalDynamicSite3561_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9752_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07c62d08f495_invokedynamic4534_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_43fb644d1c12_originalDynamicSite1707_1(int a0, long a1) throws E;
}
