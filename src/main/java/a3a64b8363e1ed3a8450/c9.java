package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class c9 extends moom.cT {

public static final moom.fx R;

public static final moom.fv S;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map X;

public c9() {
super(moom.fn.f, moom.fm.m);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.c9.R, moom.bs.DOWN)).a__fE(moom.c9.S, java.lang.Boolean.TRUE));
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.0000000000000p+0f, 0x1.0000000000000p+0f);
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(-3616540527224689868L)), ((long)(5518725833408060024L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(242773272565668L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.c9.T ^ 12987181892768L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill782_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill782_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill782_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill782_14 = new byte[8];
    (__sourceSpill782_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill782_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation782_16 = __sourceSpill782_14;
    ((javax.crypto.Cipher)(__sourceSpill782_11)).init(((int)(__sourceSpill782_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill782_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation782_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "0S>\033ÊÏE°v?Îú[i}Ü5á\036á"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill782_25 = local6_life21;
        int __sourceSpill782_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill782_25)).substring(((int)(__sourceSpill782_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill782_30 = local8_life19;
        int __sourceSpill782_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill782_33 = new byte[8];
        (__sourceSpill782_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill782_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill782_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill782_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill782_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill782_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill782_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill782_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill782_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill782_34)).doFinal(((byte[])(__sourceSpill782_33)));
        (__sourceSpill782_30)[__sourceSpill782_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    U = ((long[])(local8_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[3]));
    R = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite782_39())))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("enabled")))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.c9)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c9.R)), ((java.lang.Comparable)(moom.c9.a(((int)(p0)))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.c9.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(moom.c9.a__Boolean(((int)(p0)))))))));
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
return moom.v8.a(((net.minecraft.tileentity.TileEntity)(((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7036_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/c9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3032_33_0;
    int[] spill3032_0;
    boolean spill3032_1;
    long life2_3;
    int life5_5;
    int life5_14;
    int[] life4_15;
    forward_join_33: {
    forward_join_32: {
    life2_3 = (moom.c9.T ^ 103281005159078L);
    life5_5 = 0;
    spill3032_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_14 = (life5_5 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.c9.R))))))).a());
    life4_15 = spill3032_0;
    spill3032_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.c9.S))))))).booleanValue();
    if (!((life4_15 != null))) {
        forwardValue3032_33_0 = ((spill3032_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!((!spill3032_1))) {
        break forward_join_32;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic3032_11(19589, (6369323712174108767L ^ life2_3)));
    }
    forwardValue3032_33_0 = life5_14;
    }
    return forwardValue3032_33_0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27676;
      if (V[var3] == null) {
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
         long var5 = U[var3];
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
         Object[] var9 = (Object[])X.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               X.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/c9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.c9.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.c9)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public int c__Int() {
return 3;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    net.minecraft.tileentity.TileEntity life7_8;
    int[] life6_9;
    life4_3 = (moom.c9.T ^ 25979556654360L);
    int[] spill5863_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life6_9 = spill5863_0;
    if ((life6_9 != null)) {
        if ((((life7_8 instanceof moom.Cp) ? 1 : 0) != 0)) {
        moom.wy.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.inventory.IInventory)(((moom.Cp)(life7_8)))));
        ((net.minecraft.world.World)(p0)).d(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    }
        super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3033_13_0;
    int forwardValue3033_15_0;
    int forwardValue3033_34_0;
    boolean spill3033_0;
    int spill3033_1;
    long life4_3;
    int[] life6_5;
    int life7_18;
    forward_join_35: {
    forward_join_34: {
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life4_3 = (moom.c9.T ^ 83573214804115L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3033_0 = ((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3033_13_0 = ((spill3033_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3033_0))) {
        break forward_join_14;
    }
    forwardValue3033_13_0 = 1;
    }
    forwardValue3033_15_0 = forwardValue3033_13_0;
    break forward_join_15;
    }
    forwardValue3033_15_0 = 0;
    }
    life7_18 = forwardValue3033_15_0;
    spill3033_1 = life7_18;
    if (!((life6_5 != null))) {
        forwardValue3033_34_0 = spill3033_1;
        break forward_join_34;
    }
    if (!((spill3033_1 != ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.c9.S))))))).booleanValue()) ? 1 : 0)))) {
        break forward_join_35;
    }
    forwardValue3033_34_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c9.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life7_18))))))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3033_34_0);
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
moom.bs forwardValue3028_15_0;
    int[] spill3028_0;
    moom.bs spill3028_1;
    long life9_3;
    moom.bs life12_7;
    int[] life11_8;
    forward_join_16: {
    forward_join_15: {
    life9_3 = (moom.c9.T ^ 124319700444977L);
    spill3028_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_7 = ((moom.bs)(p2)).a__bs();
    life11_8 = spill3028_0;
    spill3028_1 = life12_7;
    if (!((life11_8 != null))) {
        forwardValue3028_15_0 = spill3028_1;
        break forward_join_15;
    }
    if (!((spill3028_1 == moom.bs.UP))) {
        break forward_join_16;
    }
    forwardValue3028_15_0 = moom.bs.DOWN;
    }
    life12_7 = forwardValue3028_15_0;
    }
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.c9)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c9.R)), ((java.lang.Comparable)(life12_7))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.c9.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.c9.R, moom.c9.S});
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Cp();
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
net.minecraft.tileentity.TileEntity forwardValue3029_26_0;
    int[] spill3029_0;
    net.minecraft.tileentity.TileEntity spill3029_1;
    long life6_3;
    int[] life8_12;
    net.minecraft.tileentity.TileEntity life9_19;
    forward_join_30: {
    forward_join_26: {
    life6_3 = (moom.c9.T ^ 5959644804927L);
    spill3029_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.EntityLivingBase)(p3)), ((net.minecraft.item.ItemStack)(p4)));
    life8_12 = spill3029_0;
    if (!(((net.minecraft.item.ItemStack)(p4)).f__Boolean())) {
        break forward_join_30;
    }
    life9_19 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3029_1 = life9_19;
    if (!((life8_12 != null))) {
        forwardValue3029_26_0 = spill3029_1;
        break forward_join_26;
    }
    if (!((((spill3029_1 instanceof moom.Cp) ? 1 : 0) != 0))) {
        break forward_join_30;
    }
    forwardValue3029_26_0 = life9_19;
    }
    ((moom.Cp)(((moom.Cp)(forwardValue3029_26_0)))).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p4)).b__String())));
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
return ((1) != 0);
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((moom.c9)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
((moom.c9)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.4p-1f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    float local7 = 0x1.0p-3f;
    ((moom.c9)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(local7)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.c9)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(local7)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.c9)(this)).a(((float)((0x1.0p0f - local7))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.c9)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)((0x1.0p0f - local7))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    ((moom.c9)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3030_28_0;
    boolean spill3030_0;
    int spill3030_1;
    long life9_3;
    int[] life11_5;
    net.minecraft.tileentity.TileEntity life12_17;
    forward_join_28: {
    forward_join_27: {
    life9_3 = (moom.c9.T ^ 34512037036780L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3030_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3030_28_0 = ((spill3030_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill3030_0))) {
        break forward_join_27;
    }
    life12_17 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3030_1 = ((life12_17 instanceof moom.Cp) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue3030_28_0 = spill3030_1;
        break forward_join_28;
    }
    if (!((spill3030_1 != 0))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.inventory.IInventory)(((moom.Cp)(life12_17)))));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.P)));
    }
    forwardValue3030_28_0 = 1;
    }
    return ((forwardValue3030_28_0) != 0);
}


public static moom.bs a__sourceReturn_5c5084b5c8(int p0) {
long local1 = (moom.c9.T ^ 32556985229273L);
    return moom.bs.a(((int)((p0 & __sourceIntrinsic_4059fcd1c032_originalDynamicSite1395_1(312, (3982297896456618143L ^ local1))))));
}


public static boolean a__Boolean(int p0) {
int forwardValue3031_22_0;
    int forwardValue3031_24_0;
    int spill3031_0;
    long life1_3;
    int[] life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    life1_3 = (moom.c9.T ^ 131704716200725L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3031_0 = (p0 & __sourceIntrinsic_415cae4db048_invokedynamic3031_2(18227, (1504112004866265691L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue3031_22_0 = spill3031_0;
        break forward_join_22;
    }
    if (!((spill3031_0 != __sourceIntrinsic_415cae4db048_invokedynamic3031_3(19589, (6369294996177213932L ^ life1_3))))) {
        break forward_join_23;
    }
    forwardValue3031_22_0 = 1;
    }
    forwardValue3031_24_0 = forwardValue3031_22_0;
    break forward_join_24;
    }
    forwardValue3031_24_0 = 0;
    }
    return ((forwardValue3031_24_0) != 0);
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
((moom.c9)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


public boolean r() {
return ((1) != 0);
}


private static boolean lambda$static$0(moom.bs p0) {
long local1 = (moom.c9.T ^ 88191002438822L);
    return ((((p0 != moom.bs.UP) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite782_39() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4059fcd1c032_originalDynamicSite1395_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_415cae4db048_invokedynamic3031_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_415cae4db048_invokedynamic3031_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7036_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3032_11(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
