package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class h2 extends moom.h1 {

public int y;

moom.gK z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public h2(moom.gK p0) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_5ba47923a4be07b7(moom.h2 receiver, moom.gK p0) throws Throwable {

long local2 = (moom.h2.A ^ 85947785738204L);

    ((moom.h2)(receiver)).z = ((moom.gK)(p0));

    moom.h2.__sourceConstructorInit_5ba47923a4be07b7_0(((moom.h2)(receiver)), ((net.minecraft.client.Minecraft)(((moom.gK)(p0)).i)), ((int)(((moom.gK)(p0)).k)), ((int)(((moom.gK)(p0)).l)), ((int)(__sourceIntrinsic_5ba47923a4be07b7_originalDynamicSite2331_5(4011, (7903689034095527865L ^ local2)))), ((int)((((moom.gK)(p0)).l - __sourceIntrinsic_5ba47923a4be07b7_originalDynamicSite2331_7(15953, (8981287092684699210L ^ local2))))), ((int)(__sourceIntrinsic_5ba47923a4be07b7_originalDynamicSite2331_8(12580, (8638427335565850939L ^ local2)))));

    ((moom.h2)(receiver)).y = ((int)(-1));

    return;

}



static {
A = ((long)(((moom._a)(moom._c.a(((long)(-489015271044371575L)), ((long)(2144553602643052085L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(89385020785231L)))));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.h2.A ^ 84559317651496L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1240_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1240_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1240_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1240_14 = new byte[8];
    (__sourceSpill1240_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1240_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1240_16 = __sourceSpill1240_14;
    ((javax.crypto.Cipher)(__sourceSpill1240_11)).init(((int)(__sourceSpill1240_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1240_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1240_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¹Ô\000\001\002WTíuuð¯Å5±`-±ÖÕrøA¡I\037Oj\027(bSÚû\035bzÙH\025¤u\006\022âP\n\r43qÎ\016q"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1240_25 = local6_life21;
        int __sourceSpill1240_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1240_25)).substring(((int)(__sourceSpill1240_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1240_30 = local8_life19;
        int __sourceSpill1240_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1240_33 = new byte[8];
        (__sourceSpill1240_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1240_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1240_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1240_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1240_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1240_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1240_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1240_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1240_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1240_34)).doFinal(((byte[])(__sourceSpill1240_33)));
        (__sourceSpill1240_30)[__sourceSpill1240_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¶éÔ\013­<\003\007ñ¶j0ÈÚ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1240_38 = local6_life21;
        int __sourceSpill1240_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1240_38)).substring(((int)(__sourceSpill1240_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1240_43 = local8_life19;
        int __sourceSpill1240_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1240_46 = new byte[8];
        (__sourceSpill1240_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1240_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1240_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1240_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1240_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1240_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1240_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1240_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1240_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1240_47)).doFinal(((byte[])(__sourceSpill1240_46)));
        (__sourceSpill1240_43)[__sourceSpill1240_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    B = ((long[])(local8_life19));
    C = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5ba47923a4be07b7_0(moom.h2 a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected int f() {
long local1 = (moom.h2.A ^ 133039424621609L);
    return (this.b - __sourceIntrinsic_d5f736cb4191_originalDynamicSite1466_2(30567, (1957117776066790529L ^ local1)));
}


private void d(int p0, int p1) {
((moom.h2)(this)).d(((int)(p0)), ((int)(p1)), ((int)(0)), ((int)(0)));
    return;
}


private void d(int p0, int p1, int p2, int p3) {
long local5 = (moom.h2.A ^ 9067350922387L);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.a)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.Gui.b)));
    float local7 = 0x1.0p-7f;
    float local8 = 0x1.0p-7f;
    int local9 = __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_6(9132, (3893244511951440127L ^ local5));
    int local10 = __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_7(7853, (5571675743600768508L ^ local5));
    net.minecraft.client.renderer.Tessellator local11 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local12 = ((net.minecraft.client.renderer.Tessellator)(local11)).a__lw();
    ((moom.lw)(local12)).a(((int)(__sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_10(32588, (145112554623865882L ^ local5)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) p0))), ((double)(((double) (p1 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_13(7853, (5571675743600768508L ^ local5)))))), ((double)(((double) ((moom.gK)(this.z)).d)))))).a(((double)(((double) (((float) p2) * 0x1.0p-7f)))), ((double)(((double) (((float) (p3 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_17(7853, (5571675743600768508L ^ local5)))) * 0x1.0p-7f))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_20(7853, (5571675743600768508L ^ local5)))))), ((double)(((double) (p1 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_21(7853, (5571675743600768508L ^ local5)))))), ((double)(((double) ((moom.gK)(this.z)).d)))))).a(((double)(((double) (((float) (p2 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_25(7853, (5571675743600768508L ^ local5)))) * 0x1.0p-7f)))), ((double)(((double) (((float) (p3 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_26(7853, (5571675743600768508L ^ local5)))) * 0x1.0p-7f))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_29(7853, (5571675743600768508L ^ local5)))))), ((double)(((double) p1))), ((double)(((double) ((moom.gK)(this.z)).d)))))).a(((double)(((double) (((float) (p2 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_33(7853, (5571675743600768508L ^ local5)))) * 0x1.0p-7f)))), ((double)(((double) (((float) p3) * 0x1.0p-7f))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(((double) ((moom.gK)(this.z)).d)))))).a(((double)(((double) (((float) p2) * 0x1.0p-7f)))), ((double)(((double) (((float) p3) * 0x1.0p-7f))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local11)).a__Void();
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.h2.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7798_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/h2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9661;
      if (C[var3] == null) {
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
         long var5 = B[var3];
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
         Object[] var9 = (Object[])D.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               D.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/h2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private void a(int p0, int p1, net.minecraft.item.ItemStack p2) {
((moom.h2)(this)).d(((int)((p0 + 1))), ((int)((p1 + 1))));
    moom.kZ.y();
    if ((p2 != null)) {
        if ((((net.minecraft.item.ItemStack)(p2)).a__wQ() != null)) {
        moom.lt.c();
        ((net.minecraft.client.renderer.entity.RenderItem)(((moom.gK)(this.z)).j)).a(((net.minecraft.item.ItemStack)(p2)), ((float)(((float) (p0 + 2)))), ((float)(((float) (p1 + 2)))));
        moom.lt.a();
    }
    }
    moom.kZ.z();
    return;
}


protected int a() {
return ((java.util.List)(((moom.FG)(((moom.gK)(this.z)).x)).a__List())).size();
}


protected void a(int p0, boolean p1, int p2, int p3) {
this.y = ((int)(p0));
    ((moom.gK)(this.z)).a();
    return;
}


protected boolean a__Boolean(int p0) {
return ((((p0 == this.y) ? 1 : 0)) != 0);
}


protected void a__Void() {
return;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
net.minecraft.item.ItemStack forwardValue3580_44_0;
    java.lang.String forwardValue3580_52_0;
    long life7_3;
    net.minecraft.world.gen.FlatLayerInfo life9_19;
    net.minecraft.block.state.IBlockState life10_22;
    net.minecraft.block.Block life11_25;
    net.minecraft.item.Item life12_28;
    net.minecraft.item.ItemStack life13_49;
    java.lang.String life14_59;
    java.lang.String life15_147;
    forward_join_162: {
    forward_join_151: {
    forward_join_130: {
    forward_join_86: {
    forward_join_72: {
    forward_join_70: {
    forward_join_67: {
    forward_join_52: {
    forward_join_49: {
    forward_join_44: {
    forward_join_43: {
    life7_3 = (moom.h2.A ^ 110135302581418L);
    life9_19 = ((net.minecraft.world.gen.FlatLayerInfo)(((java.util.List)(((moom.FG)(((moom.gK)(this.z)).x)).a__List())).get(((int)(((((java.util.List)(((moom.FG)(((moom.gK)(this.z)).x)).a__List())).size() - p0) - 1))))));
    life10_22 = ((net.minecraft.world.gen.FlatLayerInfo)(life9_19)).a__fE();
    life11_25 = ((net.minecraft.block.state.IBlockState)(life10_22)).a__ch();
    life12_28 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(life11_25)));
    if (!((life11_25 != net.minecraft.init.Blocks.a))) {
        break forward_join_43;
    }
    if (!((life12_28 != null))) {
        break forward_join_43;
    }
    forwardValue3580_44_0 = new net.minecraft.item.ItemStack(life12_28, 1, ((net.minecraft.block.Block)(life11_25)).b(((net.minecraft.block.state.IBlockState)(life10_22))));
    break forward_join_44;
    }
    forwardValue3580_44_0 = null;
    }
    life13_49 = forwardValue3580_44_0;
    if (!((life13_49 == null))) {
        break forward_join_49;
    }
    forwardValue3580_52_0 = "Air";
    break forward_join_52;
    }
    forwardValue3580_52_0 = ((net.minecraft.item.Item)(life12_28)).d(((net.minecraft.item.ItemStack)(life13_49)));
    }
    life14_59 = forwardValue3580_52_0;
    if (!((life12_28 == null))) {
        break forward_join_86;
    }
    if (!((life11_25 != net.minecraft.init.Blocks.j))) {
        break forward_join_70;
    }
    if (!((life11_25 != net.minecraft.init.Blocks.i))) {
        break forward_join_70;
    }
    if (!((life11_25 != net.minecraft.init.Blocks.l))) {
        break forward_join_67;
    }
    if (!((life11_25 == net.minecraft.init.Blocks.k))) {
        break forward_join_72;
    }
    }
    life12_28 = net.minecraft.init.Items.ay;
    break forward_join_72;
    }
    life12_28 = net.minecraft.init.Items.ax;
    }
    if (!((life12_28 != null))) {
        break forward_join_86;
    }
    life13_49 = new net.minecraft.item.ItemStack(life12_28, 1, ((net.minecraft.block.Block)(life11_25)).b(((net.minecraft.block.state.IBlockState)(life10_22))));
    life14_59 = ((net.minecraft.block.Block)(life11_25)).a__String();
    }
    ((moom.h2)(this)).a(((int)(p1)), ((int)(p2)), ((net.minecraft.item.ItemStack)(life13_49)));
    ((net.minecraft.client.gui.FontRenderer)(((moom.gK)(this.z)).p)).b(((java.lang.String)(life14_59)), ((float)(((float) ((p1 + __sourceIntrinsic_499f7b7391d8_invokedynamic3580_27(7853, (5571794434189069765L ^ life7_3))) + 5)))), ((float)(((float) (p2 + 3)))), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic3580_28(4760, (4709322811761328627L ^ life7_3)))));
    if (!((p0 == 0))) {
        break forward_join_130;
    }
    life15_147 = moom.oO.a(((java.lang.String)("createWorld.customize.flat.layer.top")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((net.minecraft.world.gen.FlatLayerInfo)(life9_19)).a())))})));
    break forward_join_162;
    }
    if (!((p0 == (((java.util.List)(((moom.FG)(((moom.gK)(this.z)).x)).a__List())).size() - 1)))) {
        break forward_join_151;
    }
    life15_147 = moom.oO.a(((java.lang.String)("createWorld.customize.flat.layer.bottom")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((net.minecraft.world.gen.FlatLayerInfo)(life9_19)).a())))})));
    break forward_join_162;
    }
    life15_147 = moom.oO.a(((java.lang.String)("createWorld.customize.flat.layer")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((net.minecraft.world.gen.FlatLayerInfo)(life9_19)).a())))})));
    }
    ((net.minecraft.client.gui.FontRenderer)(((moom.gK)(this.z)).p)).b(((java.lang.String)(life15_147)), ((float)(((float) (((p1 + 2) + __sourceIntrinsic_499f7b7391d8_invokedynamic3580_45(1712, (2901869385521796574L ^ life7_3))) - ((net.minecraft.client.gui.FontRenderer)(((moom.gK)(this.z)).p)).a(((java.lang.String)(life15_147))))))), ((float)(((float) (p2 + 3)))), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic3580_49(6372, (7178219212469078920L ^ life7_3)))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5ba47923a4be07b7_originalDynamicSite2331_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ba47923a4be07b7_originalDynamicSite2331_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ba47923a4be07b7_originalDynamicSite2331_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic3580_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic3580_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic3580_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic3580_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7798_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1467_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1466_2(int a0, long a1) throws E;
}
