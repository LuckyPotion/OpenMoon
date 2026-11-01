package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class oy extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<net.minecraft.tileentity.TileEntityPiston> {

private final net.minecraft.client.renderer.BlockRendererDispatcher f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public oy() {
super();
    this.f = (net.minecraft.client.Minecraft.a__fM()).a__kP();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-7338077368001283108L)), ((long)(-7287648886698902508L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195694511799484L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.oy.g ^ 119481482949818L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1449_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1449_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1449_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1449_14 = new byte[8];
    (__sourceSpill1449_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1449_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1449_16 = __sourceSpill1449_14;
    ((javax.crypto.Cipher)(__sourceSpill1449_11)).init(((int)(__sourceSpill1449_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1449_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1449_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ñì\177-åyw\004\\ãçB\032§ïoò&ê¡\037"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1449_25 = local6_life21;
        int __sourceSpill1449_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1449_25)).substring(((int)(__sourceSpill1449_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1449_30 = local8_life19;
        int __sourceSpill1449_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1449_33 = new byte[8];
        (__sourceSpill1449_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1449_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1449_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1449_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1449_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1449_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1449_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1449_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1449_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1449_34)).doFinal(((byte[])(__sourceSpill1449_33)));
        (__sourceSpill1449_30)[__sourceSpill1449_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = " \fxÅ1ÐþY¨kâ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1449_38 = local6_life21;
        int __sourceSpill1449_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1449_38)).substring(((int)(__sourceSpill1449_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1449_43 = local8_life19;
        int __sourceSpill1449_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1449_46 = new byte[8];
        (__sourceSpill1449_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1449_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1449_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1449_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1449_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1449_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1449_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1449_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1449_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1449_47)).doFinal(((byte[])(__sourceSpill1449_46)));
        (__sourceSpill1449_43)[__sourceSpill1449_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8623_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.oy.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13929;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/oy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


public void a(net.minecraft.tileentity.TileEntityPiston p0, double p1, double p2, double p3, float p4, int p5) {
net.minecraft.block.BlockPistonExtension$EnumPistonType forwardValue3827_149_0;
    net.minecraft.block.state.IBlockState forwardValue3827_172_0;
    moom.fv forwardValue3827_172_1;
    net.minecraft.block.state.IBlockState forwardValue3827_173_0;
    moom.fv forwardValue3827_173_1;
    int forwardValue3827_173_2;
    int spill3827_0;
    net.minecraft.block.state.IBlockState spill3827_1;
    moom.fv spill3827_2;
    long life10_3;
    moom.DT life12_6;
    net.minecraft.block.state.IBlockState life13_9;
    net.minecraft.block.Block life14_12;
    net.minecraft.client.renderer.Tessellator life15_27;
    moom.lw life16_30;
    net.minecraft.world.World life17_110;
    net.minecraft.block.state.IBlockState life13_127;
    net.minecraft.block.BlockPistonExtension$EnumPistonType life18_165;
    net.minecraft.block.state.IBlockState life19_177;
    net.minecraft.block.state.IBlockState life19_193;
    forward_join_261: {
    forward_join_253: {
    forward_join_237: {
    forward_join_173: {
    forward_join_172: {
    forward_join_149: {
    forward_join_148: {
    forward_join_137: {
    forward_join_60: {
    forward_join_54: {
    life10_3 = (moom.oy.g ^ 70115703641021L);
    life12_6 = ((net.minecraft.tileentity.TileEntityPiston)(p0)).a__DT();
    life13_9 = ((net.minecraft.tileentity.TileEntityPiston)(p0)).a__fE();
    life14_12 = ((net.minecraft.block.state.IBlockState)(life13_9)).a__ch();
    if (!((((net.minecraft.block.Block)(life14_12)).a__fn() != moom.fn.a))) {
        break forward_join_261;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.tileentity.TileEntityPiston)(p0)).a(((float)(p4))))), ((float)(0x1.0p0f))) < 0))) {
        break forward_join_261;
    }
    life15_27 = net.minecraft.client.renderer.Tessellator.a();
    life16_30 = ((net.minecraft.client.renderer.Tessellator)(life15_27)).a__lw();
    ((moom.oy)(this)).b(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    spill3827_0 = 25968;
    moom.lt.a();
    moom.kZ.b(((int)(__sourceIntrinsic_6bbbe7972239_invokedynamic3827_13(spill3827_0, (4873846092372615250L ^ life10_3)))), ((int)(__sourceIntrinsic_6bbbe7972239_invokedynamic3827_14(21766, (3246473939588452387L ^ life10_3)))));
    moom.kZ.l();
    moom.kZ.p();
    if (!(net.minecraft.client.Minecraft.f__Boolean())) {
        break forward_join_54;
    }
    moom.kZ.j(((int)(__sourceIntrinsic_6bbbe7972239_invokedynamic3827_19(1963, (3706618525200761483L ^ life10_3)))));
    break forward_join_60;
    }
    moom.kZ.j(((int)(__sourceIntrinsic_6bbbe7972239_invokedynamic3827_21(12480, (1905426624295269859L ^ life10_3)))));
    }
    ((moom.lw)(life16_30)).a(((int)(__sourceIntrinsic_6bbbe7972239_invokedynamic3827_23(24258, (8973185389435526115L ^ life10_3)))), ((moom.oD)(moom.oB.a)));
    ((moom.lw)(life16_30)).b(((double)(((double) ((((float) p1) - ((float) ((moom.DT)(life12_6)).a())) + ((net.minecraft.tileentity.TileEntityPiston)(p0)).b(((float)(p4))))))), ((double)(((double) ((((float) p2) - ((float) ((moom.DT)(life12_6)).b())) + ((net.minecraft.tileentity.TileEntityPiston)(p0)).c(((float)(p4))))))), ((double)(((double) ((((float) p3) - ((float) ((moom.DT)(life12_6)).c())) + ((net.minecraft.tileentity.TileEntityPiston)(p0)).d(((float)(p4))))))));
    life17_110 = ((moom.oy)(this)).a__Eu();
    if (!((life14_12 == net.minecraft.init.Blocks.K))) {
        break forward_join_137;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.tileentity.TileEntityPiston)(p0)).a(((float)(p4))))), ((float)(0x1.0p-1f))) < 0))) {
        break forward_join_137;
    }
    life13_127 = ((net.minecraft.block.state.IBlockState)(life13_9)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dY.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
    ((moom.kK)(((net.minecraft.client.renderer.BlockRendererDispatcher)(this.f)).a())).a(((net.minecraft.world.IBlockAccess)(life17_110)), ((net.minecraft.client.resources.model.IBakedModel)(((net.minecraft.client.renderer.BlockRendererDispatcher)(this.f)).a(((net.minecraft.block.state.IBlockState)(life13_127)), ((net.minecraft.world.IBlockAccess)(life17_110)), ((moom.DT)(life12_6))))), ((net.minecraft.block.state.IBlockState)(life13_127)), ((moom.DT)(life12_6)), ((moom.lw)(life16_30)), ((boolean)(true)));
    break forward_join_253;
    }
    if (!(((net.minecraft.tileentity.TileEntityPiston)(p0)).c__Boolean())) {
        break forward_join_237;
    }
    if (!((!((net.minecraft.tileentity.TileEntityPiston)(p0)).b__Boolean()))) {
        break forward_join_237;
    }
    if (!((life14_12 == net.minecraft.init.Blocks.F))) {
        break forward_join_148;
    }
    forwardValue3827_149_0 = net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY;
    break forward_join_149;
    }
    forwardValue3827_149_0 = net.minecraft.block.BlockPistonExtension$EnumPistonType.DEFAULT;
    }
    life18_165 = forwardValue3827_149_0;
    life19_177 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dY)(net.minecraft.init.Blocks.K)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dY.R)), ((java.lang.Comparable)(life18_165))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dY.Q)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.block.state.IBlockState)(life13_9)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q))))))));
    spill3827_1 = life19_177;
    spill3827_2 = moom.dY.S;
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.tileentity.TileEntityPiston)(p0)).a(((float)(p4))))), ((float)(0x1.0p-1f))) >= 0))) {
        forwardValue3827_172_0 = spill3827_1;
        forwardValue3827_172_1 = spill3827_2;
        break forward_join_172;
    }
    forwardValue3827_173_0 = spill3827_1;
    forwardValue3827_173_1 = spill3827_2;
    forwardValue3827_173_2 = 1;
    break forward_join_173;
    }
    forwardValue3827_173_0 = forwardValue3827_172_0;
    forwardValue3827_173_1 = forwardValue3827_172_1;
    forwardValue3827_173_2 = 0;
    }
    life19_193 = ((net.minecraft.block.state.IBlockState)(forwardValue3827_173_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3827_173_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3827_173_2)))))));
    ((moom.kK)(((net.minecraft.client.renderer.BlockRendererDispatcher)(this.f)).a())).a(((net.minecraft.world.IBlockAccess)(life17_110)), ((net.minecraft.client.resources.model.IBakedModel)(((net.minecraft.client.renderer.BlockRendererDispatcher)(this.f)).a(((net.minecraft.block.state.IBlockState)(life19_193)), ((net.minecraft.world.IBlockAccess)(life17_110)), ((moom.DT)(life12_6))))), ((net.minecraft.block.state.IBlockState)(life19_193)), ((moom.DT)(life12_6)), ((moom.lw)(life16_30)), ((boolean)(true)));
    ((moom.lw)(life16_30)).b(((double)(((double) (((float) p1) - ((float) ((moom.DT)(life12_6)).a()))))), ((double)(((double) (((float) p2) - ((float) ((moom.DT)(life12_6)).b()))))), ((double)(((double) (((float) p3) - ((float) ((moom.DT)(life12_6)).c()))))));
    ((net.minecraft.block.state.IBlockState)(life13_9)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
    ((moom.kK)(((net.minecraft.client.renderer.BlockRendererDispatcher)(this.f)).a())).a(((net.minecraft.world.IBlockAccess)(life17_110)), ((net.minecraft.client.resources.model.IBakedModel)(((net.minecraft.client.renderer.BlockRendererDispatcher)(this.f)).a(((net.minecraft.block.state.IBlockState)(life13_9)), ((net.minecraft.world.IBlockAccess)(life17_110)), ((moom.DT)(life12_6))))), ((net.minecraft.block.state.IBlockState)(life13_9)), ((moom.DT)(life12_6)), ((moom.lw)(life16_30)), ((boolean)(true)));
    break forward_join_253;
    }
    ((moom.kK)(((net.minecraft.client.renderer.BlockRendererDispatcher)(this.f)).a())).a(((net.minecraft.world.IBlockAccess)(life17_110)), ((net.minecraft.client.resources.model.IBakedModel)(((net.minecraft.client.renderer.BlockRendererDispatcher)(this.f)).a(((net.minecraft.block.state.IBlockState)(life13_9)), ((net.minecraft.world.IBlockAccess)(life17_110)), ((moom.DT)(life12_6))))), ((net.minecraft.block.state.IBlockState)(life13_9)), ((moom.DT)(life12_6)), ((moom.lw)(life16_30)), ((boolean)(false)));
    }
    ((moom.lw)(life16_30)).b(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    ((net.minecraft.client.renderer.Tessellator)(life15_27)).a__Void();
    moom.lt.b();
    }
    return;
}


public void a__sourceBridge_42179a2d44(net.minecraft.tileentity.TileEntity p0, double p1, double p2, double p3, float p4, int p5) {
((moom.oy)(this)).a(((net.minecraft.tileentity.TileEntityPiston)(((net.minecraft.tileentity.TileEntityPiston)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((int)(p5)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8623_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6bbbe7972239_invokedynamic3827_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6bbbe7972239_invokedynamic3827_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6bbbe7972239_invokedynamic3827_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6bbbe7972239_invokedynamic3827_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6bbbe7972239_invokedynamic3827_23(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
