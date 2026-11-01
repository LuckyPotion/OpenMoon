package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;



















import moom.DT;















import net.minecraft.block.BlockPlanks$EnumType;








import net.minecraft.world.World;


import moom.bs;
import java.util.Map;
import net.minecraft.block.state.IBlockState;
public class c2 extends moom.cT {

public static final moom.fx R;

public static final moom.fv S;

public static final moom.DA<net.minecraft.item.Item, moom.rx> T;

protected java.util.Random U;

private static final long X;

private static final long[] Z;

private static final java.lang.Integer[] bb;

private static final java.util.Map fb;

protected c2() {
super(moom.fn.e);
    this.U = new java.util.Random();
    (this).a__Void((((this.M).a__fE()).a__fE(moom.c2.R, moom.bs.NORTH)).a__fE(moom.c2.S, java.lang.Boolean.FALSE));
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
}


static {
X = ((long)(((moom._a)(moom._c.a(((long)(-7084024266112185509L)), ((long)(-6180674656269444852L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(191853448880074L)))));
    fb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.c2.X ^ 121578973566700L);
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
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "piÒ#*¯â¶\016÷9ÄÓ"))).length();
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
    local7_life23 = ((java.lang.String)((local6_life21 = "Ýa<(\t¤éÃ«|Z®ÁZ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1116_38 = local6_life21;
        int __sourceSpill1116_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1116_38)).substring(((int)(__sourceSpill1116_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1116_43 = local8_life19;
        int __sourceSpill1116_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1116_46 = new byte[8];
        (__sourceSpill1116_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1116_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1116_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1116_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1116_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1116_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1116_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1116_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1116_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1116_47)).doFinal(((byte[])(__sourceSpill1116_46)));
        (__sourceSpill1116_43)[__sourceSpill1116_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Z = ((long[])(local8_life19));
    bb = ((java.lang.Integer[])(new java.lang.Integer[4]));
    R = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("triggered")))));
    T = ((moom.DA)(new moom.DA(new moom.rd())));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3012_24_0;
    moom.fv forwardValue3012_24_1;
    int forwardValue3012_24_2;
    net.minecraft.block.state.IBlockState forwardValue3012_25_0;
    moom.fv forwardValue3012_25_1;
    net.minecraft.block.state.IBlockState forwardValue3012_26_0;
    moom.fv forwardValue3012_26_1;
    int forwardValue3012_26_2;
    net.minecraft.block.state.IBlockState spill3012_0;
    moom.fv spill3012_1;
    int spill3012_2;
    long life2_3;
    int[] life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (moom.c2.X ^ 3052552897708L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3012_0 = ((net.minecraft.block.state.IBlockState)(((moom.c2)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c2.R)), ((java.lang.Comparable)(__sourceExactCall_b9f266c58b58a2(((int)(p0))))));
    spill3012_1 = moom.c2.S;
    spill3012_2 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3012_7(17733, (8548767973099026962L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue3012_24_0 = spill3012_0;
        forwardValue3012_24_1 = spill3012_1;
        forwardValue3012_24_2 = spill3012_2;
        break forward_join_24;
    }
    if (!((spill3012_2 > 0))) {
        forwardValue3012_25_0 = spill3012_0;
        forwardValue3012_25_1 = spill3012_1;
        break forward_join_25;
    }
    forwardValue3012_24_0 = spill3012_0;
    forwardValue3012_24_1 = spill3012_1;
    forwardValue3012_24_2 = 1;
    }
    forwardValue3012_26_0 = forwardValue3012_24_0;
    forwardValue3012_26_1 = forwardValue3012_24_1;
    forwardValue3012_26_2 = forwardValue3012_24_2;
    break forward_join_26;
    }
    forwardValue3012_26_0 = forwardValue3012_25_0;
    forwardValue3012_26_1 = forwardValue3012_25_1;
    forwardValue3012_26_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3012_26_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3012_26_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3012_26_2)))))));
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
return __sourceExactCall_fc4d6397039c78(((net.minecraft.tileentity.TileEntity)(((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1))))));
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
long local5 = (moom.c2.X ^ 48616709006971L);
    if ((((((net.minecraft.world.World)(p0)).G) ? 1 : 0) == 0)) {
        ((moom.c2)(this)).b__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7011_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/c2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3010_33_0;
    int[] spill3010_0;
    boolean spill3010_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_15;
    forward_join_33: {
    forward_join_32: {
    life2_3 = (moom.c2.X ^ 15885391413158L);
    spill3010_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill3010_0;
    life5_15 = (life5_6 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.c2.R))))))).a());
    spill3010_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.c2.S))))))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue3010_33_0 = ((spill3010_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill3010_1)) {
        break forward_join_32;
    }
    life5_15 = (life5_15 | __sourceIntrinsic_8db5871551d4_invokedynamic3010_11(13884, (3443960850811859554L ^ life2_3)));
    }
    forwardValue3010_33_0 = life5_15;
    }
    return forwardValue3010_33_0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5273;
      if (bb[var3] == null) {
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
         long var5 = Z[var3];
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
         Object[] var9 = (Object[])fb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               fb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/c2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         bb[var3] = var15;
      }

      return bb[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_d81bdde5d0ab28(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
super.b__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    ((moom.c2)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


protected void b__Void(net.minecraft.world.World p0, moom.DT p1) {
moom.Cm forwardValue3011_21_0;
    moom.rx forwardValue3011_52_0;
    moom.Cm forwardValue3011_63_0;
    int forwardValue3011_63_1;
    moom.Cm forwardValue3011_64_0;
    int forwardValue3011_64_1;
    net.minecraft.item.ItemStack forwardValue3011_64_2;
    int[] spill3011_0;
    moom.Cm spill3011_1;
    moom.rx spill3011_2;
    moom.Cm spill3011_3;
    int spill3011_4;
    long life3_3;
    moom.fd life6_10;
    int[] life5_11;
    moom.Cm life7_15;
    int life8_25;
    net.minecraft.item.ItemStack life9_50;
    moom.rx life10_54;
    net.minecraft.item.ItemStack life11_70;
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_52: {
    forward_join_38: {
    forward_join_36: {
    forward_join_21: {
    life3_3 = (moom.c2.X ^ 31667737618467L);
    spill3011_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_10 = new moom.fd(p0, p1);
    life5_11 = spill3011_0;
    life7_15 = ((moom.Cm)(((moom.fd)(life6_10)).a__B9()));
    spill3011_1 = life7_15;
    if (!((life5_11 != null))) {
        forwardValue3011_21_0 = spill3011_1;
        break forward_join_21;
    }
    if (!((spill3011_1 != null))) {
        break forward_join_65;
    }
    forwardValue3011_21_0 = life7_15;
    }
    life8_25 = ((moom.Cm)(forwardValue3011_21_0)).h();
    if (!((life5_11 != null))) {
        break forward_join_36;
    }
    if (!((life8_25 < 0))) {
        break forward_join_38;
    }
    ((net.minecraft.world.World)(p0)).b(((int)(__sourceIntrinsic_d135d2a2a358_invokedynamic3011_5(5431, (6905990674357962478L ^ life3_3)))), ((moom.DT)(p1)), ((int)(0)));
    }
    if (!((life5_11 == null))) {
        break forward_join_65;
    }
    }
    life9_50 = ((moom.Cm)(life7_15)).a__xW(((int)(life8_25)));
    life10_54 = ((moom.c2)(this)).a(((net.minecraft.item.ItemStack)(life9_50)));
    spill3011_2 = life10_54;
    if (!((life5_11 != null))) {
        forwardValue3011_52_0 = spill3011_2;
        break forward_join_52;
    }
    if (!((spill3011_2 != moom.rx.a))) {
        break forward_join_65;
    }
    forwardValue3011_52_0 = life10_54;
    }
    life11_70 = ((moom.rx)(forwardValue3011_52_0)).a(((moom.ry)(life6_10)), ((net.minecraft.item.ItemStack)(life9_50)));
    spill3011_3 = life7_15;
    spill3011_4 = life8_25;
    if (!((((net.minecraft.item.ItemStack)(life11_70)).b <= 0))) {
        forwardValue3011_63_0 = spill3011_3;
        forwardValue3011_63_1 = spill3011_4;
        break forward_join_63;
    }
    forwardValue3011_64_0 = spill3011_3;
    forwardValue3011_64_1 = spill3011_4;
    forwardValue3011_64_2 = null;
    break forward_join_64;
    }
    forwardValue3011_64_0 = forwardValue3011_63_0;
    forwardValue3011_64_1 = forwardValue3011_63_1;
    forwardValue3011_64_2 = life11_70;
    }
    ((moom.Cm)(forwardValue3011_64_0)).a__Void(((int)(forwardValue3011_64_1)), ((net.minecraft.item.ItemStack)(forwardValue3011_64_2)));
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    net.minecraft.tileentity.TileEntity life7_8;
    int[] life6_9;
    life4_3 = (moom.c2.X ^ 75027554611224L);
    int[] spill5841_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life6_9 = spill5841_0;
    if ((life6_9 != null)) {
        if ((((life7_8 instanceof moom.Cm) ? 1 : 0) != 0)) {
        moom.wy.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.inventory.IInventory)(((moom.Cm)(life7_8)))));
        ((net.minecraft.world.World)(p0)).d(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    }
        super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public int c__Int() {
return 3;
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
block4: {
            boolean bl;
            bs bs2;
            block8: {
                bs bs3;
                bs bs4;
                boolean bl2;
                boolean bl3;
                int[] nArray;
                block11: {
                    block12: {
                        boolean bl4;
                        block13: {
                            boolean bl5;
                            block10: {
                                block9: {
                                    bs bs5;
                                    bs bs6;
                                    boolean bl6;
                                    boolean bl7;
                                    block5: {
                                        block6: {
                                            boolean bl8;
                                            block7: {
                                                long l = moom.c2.X ^ 0x3B6DACCEDA60L;
                                                nArray = BlockPlanks$EnumType.b__ArrayInt();
                                                if (p0.G) break block4;
                                                bs2 = p2.a(moom.c2.R);
                                                bl7 = p0.a__fE(p1.c__DT()).a__ch().a__Boolean();
                                                bl6 = p0.a__fE(p1.d__DT()).a__ch().a__Boolean();
                                                bs6 = bs2;
                                                bs5 = bs.NORTH;
                                                if (nArray == null) break block5;
                                                if (bs6 != bs5) break block6;
                                                bl8 = bl7;
                                                if (nArray == null) break block7;
                                                if (!bl8) break block6;
                                                bl8 = bl6;
                                            }
                                            if (bl8) break block6;
                                            bs2 = bs.SOUTH;
                                            if (nArray != null) break block8;
                                        }
                                        bs6 = bs2;
                                        bs5 = bs.SOUTH;
                                    }
                                    if (bs6 != bs5) break block9;
                                    bl5 = bl6;
                                    if (nArray == null) break block10;
                                    if (!bl5) break block9;
                                    bl5 = bl7;
                                    if (nArray == null) break block10;
                                    if (bl5) break block9;
                                    bs2 = bs.NORTH;
                                    if (nArray != null) break block8;
                                }
                                bl5 = p0.a__fE(p1.e()).a__ch().a__Boolean();
                            }
                            bl3 = bl5;
                            bl2 = p0.a__fE(p1.f()).a__ch().a__Boolean();
                            bs4 = bs2;
                            bs3 = bs.WEST;
                            if (nArray == null) break block11;
                            if (bs4 != bs3) break block12;
                            bl4 = bl3;
                            if (nArray == null) break block13;
                            if (!bl4) break block12;
                            bl4 = bl2;
                        }
                        if (bl4) break block12;
                        bs2 = bs.EAST;
                        if (nArray != null) break block8;
                    }
                    bs4 = bs2;
                    bs3 = bs.EAST;
                }
                if (bs4 != bs3) break block8;
                bl = bl2;
                if (nArray == null) break block4;
                if (!bl) break block8;
                bl = bl3;
                if (nArray == null) break block4;
                if (!bl) {
                    bs2 = bs.WEST;
                }
            }
            bl = p0.a(p1, p2.a__fE(moom.c2.R, bs2).a__fE(moom.c2.S, Boolean.FALSE), 2);
        }
}


public static moom.rB a(moom.ry p0) {
moom.bs local1 = __sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int())));
    double local2 = (((moom.ry)(p0)).a() + (0x1.6666666666666p-1d * ((double) ((moom.bs)(local1)).c())));
    double local4 = (((moom.ry)(p0)).b() + (0x1.6666666666666p-1d * ((double) ((moom.bs)(local1)).d())));
    double local6 = (((moom.ry)(p0)).c() + (0x1.6666666666666p-1d * ((double) ((moom.bs)(local1)).e())));
    return new moom.rC(local2, local4, local6);
}


public int a(net.minecraft.world.World p0) {
return 4;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.entity.player.EntityPlayer forwardValue3009_35_0;
    int forwardValue3009_38_0;
    boolean spill3009_0;
    int spill3009_1;
    net.minecraft.entity.player.EntityPlayer spill3009_2;
    long life9_3;
    int[] life11_5;
    net.minecraft.tileentity.TileEntity life12_17;
    forward_join_38: {
    forward_join_37: {
    forward_join_35: {
    forward_join_34: {
    life9_3 = (moom.c2.X ^ 84658456240108L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3009_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3009_38_0 = ((spill3009_0) ? 1 : 0);
        break forward_join_38;
    }
    if (!((!spill3009_0))) {
        break forward_join_37;
    }
    life12_17 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill3009_1 = ((life12_17 instanceof moom.Cm) ? 1 : 0);
    if (!((life11_5 != null))) {
        forwardValue3009_38_0 = spill3009_1;
        break forward_join_38;
    }
    if (!((spill3009_1 != 0))) {
        break forward_join_37;
    }
    spill3009_2 = p3;
    if (!((life11_5 != null))) {
        forwardValue3009_35_0 = spill3009_2;
        break forward_join_35;
    }
    ((net.minecraft.entity.player.EntityPlayer)(spill3009_2)).a(((net.minecraft.inventory.IInventory)(((moom.Cm)(life12_17)))));
    if (!((((life12_17 instanceof moom.Cn) ? 1 : 0) != 0))) {
        break forward_join_34;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.O)));
    if (!((life11_5 == null))) {
        break forward_join_37;
    }
    }
    forwardValue3009_35_0 = p3;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue3009_35_0)).a(((moom.BY)(net.minecraft.stats.StatList.Q)));
    }
    forwardValue3009_38_0 = 1;
    }
    return ((forwardValue3009_38_0) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.c2.R, moom.c2.S});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3007_20_0;
    int forwardValue3007_22_0;
    int forwardValue3007_56_0;
    int forwardValue3007_60_0;
    int forwardValue3007_71_0;
    boolean spill3007_0;
    boolean spill3007_1;
    int spill3007_2;
    int spill3007_3;
    long life5_3;
    int[] life7_5;
    int life8_31;
    int life9_37;
    forward_join_72: {
    forward_join_71: {
    forward_join_60: {
    forward_join_56: {
    forward_join_55: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (moom.c2.X ^ 62961222245114L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3007_0 = ((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forwardValue3007_20_0 = ((spill3007_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill3007_0))) {
        break forward_join_19;
    }
    spill3007_1 = ((net.minecraft.world.World)(p0)).l(((moom.DT)(((moom.DT)(p1)).a__DT())));
    if (!((life7_5 != null))) {
        forwardValue3007_20_0 = ((spill3007_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill3007_1)) {
        break forward_join_21;
    }
    }
    forwardValue3007_20_0 = 1;
    }
    forwardValue3007_22_0 = forwardValue3007_20_0;
    break forward_join_22;
    }
    forwardValue3007_22_0 = 0;
    }
    life8_31 = forwardValue3007_22_0;
    life9_37 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.c2.S))))))).booleanValue()) ? 1 : 0);
    spill3007_2 = life8_31;
    if (!((life7_5 != null))) {
        forwardValue3007_56_0 = spill3007_2;
        break forward_join_56;
    }
    if (!((spill3007_2 != 0))) {
        break forward_join_55;
    }
    spill3007_3 = life9_37;
    if (!((life7_5 != null))) {
        forwardValue3007_56_0 = spill3007_3;
        break forward_join_56;
    }
    if (!((spill3007_3 == 0))) {
        break forward_join_55;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.c2)(this)).a(((net.minecraft.world.World)(p0))))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c2.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(4)));
    if (!((life7_5 == null))) {
        break forward_join_72;
    }
    }
    forwardValue3007_56_0 = life8_31;
    }
    if (!((life7_5 != null))) {
        forwardValue3007_60_0 = forwardValue3007_56_0;
        break forward_join_60;
    }
    if (!((forwardValue3007_56_0 == 0))) {
        break forward_join_72;
    }
    forwardValue3007_60_0 = life9_37;
    }
    if (!((life7_5 != null))) {
        forwardValue3007_71_0 = forwardValue3007_60_0;
        break forward_join_71;
    }
    if (!((forwardValue3007_60_0 != 0))) {
        break forward_join_72;
    }
    forwardValue3007_71_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c2.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3007_71_0);
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
net.minecraft.world.World forwardValue3008_25_0;
    moom.DT forwardValue3008_25_1;
    net.minecraft.tileentity.TileEntity forwardValue3008_33_0;
    net.minecraft.world.World spill3008_0;
    moom.DT spill3008_1;
    net.minecraft.tileentity.TileEntity spill3008_2;
    long life6_3;
    int[] life8_5;
    net.minecraft.tileentity.TileEntity life9_32;
    forward_join_37: {
    forward_join_33: {
    forward_join_25: {
    life6_3 = (moom.c2.X ^ 95622984215103L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3008_0 = p0;
    spill3008_1 = p1;
    if (!((life8_5 != null))) {
        forwardValue3008_25_0 = spill3008_0;
        forwardValue3008_25_1 = spill3008_1;
        break forward_join_25;
    }
    ((net.minecraft.world.World)(spill3008_0)).a(((moom.DT)(spill3008_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c2.R)), ((java.lang.Comparable)(__sourceExactCall_2e9c4ebea5d664(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.EntityLivingBase)(p3)))))))), ((int)(2)));
    if (!(((net.minecraft.item.ItemStack)(p4)).f__Boolean())) {
        break forward_join_37;
    }
    forwardValue3008_25_0 = p0;
    forwardValue3008_25_1 = p1;
    }
    life9_32 = ((net.minecraft.world.World)(forwardValue3008_25_0)).a__B9(((moom.DT)(forwardValue3008_25_1)));
    spill3008_2 = life9_32;
    if (!((life8_5 != null))) {
        forwardValue3008_33_0 = spill3008_2;
        break forward_join_33;
    }
    if (!((((spill3008_2 instanceof moom.Cm) ? 1 : 0) != 0))) {
        break forward_join_37;
    }
    forwardValue3008_33_0 = life9_32;
    }
    ((moom.Cm)(((moom.Cm)(forwardValue3008_33_0)))).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p4)).b__String())));
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.c2)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c2.R)), ((java.lang.Comparable)(__sourceExactCall_2e9c4ebea5d664(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.EntityLivingBase)(p7)))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.c2.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Cm();
}


public net.minecraft.block.state.IBlockState a__fE(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.c2)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c2.R)), ((java.lang.Comparable)(moom.bs.SOUTH)));
}


protected moom.rx a(net.minecraft.item.ItemStack p0) {
moom.DA forwardValue3006_13_0;
    moom.DA forwardValue3006_14_0;
    net.minecraft.item.ItemStack forwardValue3006_14_1;
    moom.DA forwardValue3006_15_0;
    net.minecraft.item.Item forwardValue3006_15_1;
    moom.DA spill3006_0;
    net.minecraft.item.ItemStack spill3006_1;
    long life2_3;
    int[] life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.c2.X ^ 120567210136320L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3006_0 = moom.c2.T;
    spill3006_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue3006_14_0 = spill3006_0;
        forwardValue3006_14_1 = spill3006_1;
        break forward_join_14;
    }
    if (!((spill3006_1 == null))) {
        forwardValue3006_13_0 = spill3006_0;
        break forward_join_13;
    }
    forwardValue3006_15_0 = spill3006_0;
    forwardValue3006_15_1 = null;
    break forward_join_15;
    }
    forwardValue3006_14_0 = forwardValue3006_13_0;
    forwardValue3006_14_1 = p0;
    }
    forwardValue3006_15_0 = forwardValue3006_14_0;
    forwardValue3006_15_1 = ((net.minecraft.item.ItemStack)(forwardValue3006_14_1)).a__wQ();
    }
    return ((moom.rx)(((moom.DA)(forwardValue3006_15_0)).a__Object(((java.lang.Object)(forwardValue3006_15_1)))));
}


public static moom.bs a__sourceReturn_5c5084b5c8(int p0) {
long local1 = (moom.c2.X ^ 43552256755893L);
    return __sourceExactCall_e942200b9dad46(((int)((p0 & __sourceIntrinsic_4059fcd1c032_originalDynamicSite1394_1(17444, (6339563182269626216L ^ local1))))));
}


public boolean r() {
return ((1) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3012_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7011_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3010_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d135d2a2a358_invokedynamic3011_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4059fcd1c032_originalDynamicSite1394_1(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
private static native int __sourceExactCall_fc4d6397039c78(net.minecraft.tileentity.TileEntity p0);
private static native int __sourceExactCall_d81bdde5d0ab28(int p0, long p1);
private static native moom.bs __sourceExactCall_2e9c4ebea5d664(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.EntityLivingBase p2);
private static native moom.bs __sourceExactCall_e942200b9dad46(int p0);
}
