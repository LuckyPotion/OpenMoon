package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xY {

private static moom.xY a;

private java.util.Map<net.minecraft.item.ItemStack, net.minecraft.item.ItemStack> b;

private java.util.Map<net.minecraft.item.ItemStack, java.lang.Float> c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private xY() { super(); }


private static void __sourceConstructorBody_0598a88185f3398f(moom.xY receiver) throws Throwable {

long local1_life1 = (moom.xY.d ^ 32345730741620L);

    moom.xY.__sourceConstructorInit_0598a88185f3398f_0(((moom.xY)(receiver)));

    ((moom.xY)(receiver)).b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((moom.xY)(receiver)).c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.p)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.j))), ((float)(0x1.666666p-1f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.o)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.k))), ((float)(0x1.0p0f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ag)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.i))), ((float)(0x1.0p0f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.m)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.w))), ((float)(0x1.99999ap-4f)));

    ((moom.xY)(receiver)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.al)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.am))), ((float)(0x1.666666p-2f)));

    ((moom.xY)(receiver)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a8)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.a9))), ((float)(0x1.666666p-2f)));

    ((moom.xY)(receiver)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a_)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.ba))), ((float)(0x1.666666p-2f)));

    ((moom.xY)(receiver)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bd)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.be))), ((float)(0x1.666666p-2f)));

    ((moom.xY)(receiver)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bb)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bc))), ((float)(0x1.666666p-2f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b))), ((float)(0x1.99999ap-4f)));

    ((moom.xY)(receiver)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a5, 1, moom.ey.R))), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a5, 1, moom.ey.T))), ((float)(0x1.99999ap-4f)));

    ((moom.xY)(receiver)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aI)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aH))), ((float)(0x1.333334p-2f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aL)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cd))), ((float)(0x1.666666p-2f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aK)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GREEN)).b()))), ((float)(0x1.99999ap-3f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.h, 1, 1))), ((float)(0x1.333334p-3f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.s)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.h, 1, 1))), ((float)(0x1.333334p-3f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bE)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bD))), ((float)(0x1.0p0f)));

    ((moom.xY)(receiver)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bH)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bI))), ((float)(0x1.666666p-2f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aV)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bU))), ((float)(0x1.99999ap-4f)));

    ((moom.xY)(receiver)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.v, 1, 1))), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.v, 1, 0))), ((float)(0x1.333334p-3f)));

    net.minecraft.item.ItemFishFood$FishType[] local3_life72 = net.minecraft.item.ItemFishFood$FishType.values();

    int local4_life73 = (local3_life72).length;

    int local5_life74 = 0;

    while ((local5_life74 < local4_life73)) {

        net.minecraft.item.ItemFishFood$FishType local6_life75 = (local3_life72)[local5_life74];

        if (((net.minecraft.item.ItemFishFood$FishType)(local6_life75)).a__Boolean()) {

        ((moom.xY)(receiver)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aU, 1, ((net.minecraft.item.ItemFishFood$FishType)(local6_life75)).a__Int()))), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aV, 1, ((net.minecraft.item.ItemFishFood$FishType)(local6_life75)).a__Int()))), ((float)(0x1.666666p-2f)));

    }

        local5_life74 += 1;

    }

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.q)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.h))), ((float)(0x1.99999ap-4f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aC)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aC))), ((float)(0x1.666666p-1f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.x)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b()))), ((float)(0x1.99999ap-3f)));

    ((moom.xY)(receiver)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b3)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bV))), ((float)(0x1.99999ap-3f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_0598a88185f3398f_0(moom.xY a0) throws E;

static {
d = ((long)(((moom._a)(moom._c.a(((long)(2372212968956009396L)), ((long)(807083657148067772L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(66011409314594L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xY.d ^ 120058250883101L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1106_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1106_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1106_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1106_14 = new byte[8];
    (__sourceSpill1106_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1106_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1106_16 = __sourceSpill1106_14;
    ((javax.crypto.Cipher)(__sourceSpill1106_11)).init(((int)(__sourceSpill1106_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1106_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1106_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "µ5\033d\035\033½!3Q\020Ùm"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1106_25 = local6_life21;
        int __sourceSpill1106_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1106_25)).substring(((int)(__sourceSpill1106_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1106_30 = local8_life19;
        int __sourceSpill1106_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1106_33 = new byte[8];
        (__sourceSpill1106_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1106_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1106_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1106_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1106_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1106_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1106_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1106_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1106_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1106_34)).doFinal(((byte[])(__sourceSpill1106_33)));
        (__sourceSpill1106_30)[__sourceSpill1106_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((moom.xY)(new moom.xY()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public float a(net.minecraft.item.ItemStack p0) {
java.lang.Object lexicalValue1410_29_0;
    java.lang.String spill1410_0;
    moom.xY spill1410_1;
    long life2_3;
    java.util.Iterator life5_9;
    java.lang.String life4_10;
    java.util.Map.Entry life6_17;
    lexical_join_34: {
    life2_3 = (moom.xY.d ^ 53452774335268L);
    spill1410_0 = moom.ye.b();
    life5_9 = ((java.util.Set)(((java.util.Map)(this.c)).entrySet())).iterator();
    life4_10 = spill1410_0;
    lexical_cycle_11: while (true) {
    lexical_join_32: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life5_9)).hasNext())) {
        break lexical_join_34;
    }
    life6_17 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_9)).next()));
    spill1410_1 = this;
    if (!((life4_10 == null))) {
        lexicalValue1410_29_0 = spill1410_1;
        break lexical_join_29;
    }
    if (!(((moom.xY)(spill1410_1)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(((java.util.Map.Entry)(life6_17)).getKey()))))))) {
        break lexical_join_32;
    }
    lexicalValue1410_29_0 = ((java.util.Map.Entry)(life6_17)).getValue();
    }
    return ((java.lang.Float)(((java.lang.Float)(lexicalValue1410_29_0)))).floatValue();
    }
    if (!((life4_10 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return 0x0.0p0f;
}


public java.util.Map<net.minecraft.item.ItemStack, net.minecraft.item.ItemStack> a() {
return this.b;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15822;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xY", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9709_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static moom.xY a__xY() {
return moom.xY.a;
}


public void a(net.minecraft.block.Block p0, net.minecraft.item.ItemStack p1, float p2) {
((moom.xY)(this)).a(((net.minecraft.item.Item)(net.minecraft.item.Item.a(((net.minecraft.block.Block)(p0))))), ((net.minecraft.item.ItemStack)(p1)), ((float)(p2)));
    return;
}


public void a(net.minecraft.item.Item p0, net.minecraft.item.ItemStack p1, float p2) {
long local4 = (moom.xY.d ^ 63783486473510L);
    ((moom.xY)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p0, 1, __sourceIntrinsic_50716d5a0728_originalDynamicSite1702_1(30437, (7240270727896301232L ^ local4))))), ((net.minecraft.item.ItemStack)(p1)), ((float)(p2)));
    return;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1, float p2) {
((java.util.Map)(this.b)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    ((java.util.Map)(this.c)).put(((java.lang.Object)(p1)), ((java.lang.Object)(java.lang.Float.valueOf(((float)(p2))))));
    return;
}


public net.minecraft.item.ItemStack a__xW(net.minecraft.item.ItemStack p0) {
java.lang.Object lexicalValue1411_29_0;
    java.lang.String spill1411_0;
    moom.xY spill1411_1;
    long life2_3;
    java.util.Iterator life5_9;
    java.lang.String life4_10;
    java.util.Map.Entry life6_17;
    lexical_join_33: {
    life2_3 = (moom.xY.d ^ 3045726185251L);
    spill1411_0 = moom.ye.b();
    life5_9 = ((java.util.Set)(((java.util.Map)(this.b)).entrySet())).iterator();
    life4_10 = spill1411_0;
    lexical_cycle_11: while (true) {
    lexical_join_31: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life5_9)).hasNext())) {
        break lexical_join_33;
    }
    life6_17 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_9)).next()));
    spill1411_1 = this;
    if (!((life4_10 == null))) {
        lexicalValue1411_29_0 = spill1411_1;
        break lexical_join_29;
    }
    if (!(((moom.xY)(spill1411_1)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(((java.util.Map.Entry)(life6_17)).getKey()))))))) {
        break lexical_join_31;
    }
    lexicalValue1411_29_0 = ((java.util.Map.Entry)(life6_17)).getValue();
    }
    return ((net.minecraft.item.ItemStack)(lexicalValue1411_29_0));
    }
    if (!((life4_10 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return null;
}


private boolean a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue4505_14_0;
    int forwardValue4505_31_0;
    int forwardValue4505_33_0;
    net.minecraft.item.ItemStack spill4505_0;
    int spill4505_1;
    int spill4505_2;
    long life3_3;
    java.lang.String life5_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_14: {
    life3_3 = (moom.xY.d ^ 124073894848193L);
    life5_5 = moom.ye.b();
    spill4505_0 = p1;
    if (!((life5_5 == null))) {
        forwardValue4505_14_0 = spill4505_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.item.ItemStack)(spill4505_0)).a__wQ() == ((net.minecraft.item.ItemStack)(p0)).a__wQ()))) {
        break forward_join_32;
    }
    forwardValue4505_14_0 = p1;
    }
    spill4505_1 = ((net.minecraft.item.ItemStack)(forwardValue4505_14_0)).c();
    if (!((life5_5 == null))) {
        forwardValue4505_31_0 = spill4505_1;
        break forward_join_31;
    }
    if (!((spill4505_1 != __sourceIntrinsic_0603dfbbc4ad_invokedynamic4505_5(10680, (3371483296574784011L ^ life3_3))))) {
        break forward_join_30;
    }
    spill4505_2 = ((net.minecraft.item.ItemStack)(p1)).c();
    if (!((life5_5 == null))) {
        forwardValue4505_31_0 = spill4505_2;
        break forward_join_31;
    }
    if (!((spill4505_2 == ((net.minecraft.item.ItemStack)(p0)).c()))) {
        break forward_join_32;
    }
    }
    forwardValue4505_31_0 = 1;
    }
    forwardValue4505_33_0 = forwardValue4505_31_0;
    break forward_join_33;
    }
    forwardValue4505_33_0 = 0;
    }
    return ((forwardValue4505_33_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9709_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50716d5a0728_originalDynamicSite1702_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0603dfbbc4ad_invokedynamic4505_5(int a0, long a1) throws E;
}
