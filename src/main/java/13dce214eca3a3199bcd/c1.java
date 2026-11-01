package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class c1 extends moom.cT {

public static final moom.fy R;

private final boolean S;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map X;

public c1(boolean p0) {
super(moom.fn.d);
    this.S = p0;
    (this).a__Void(((this.M).a__fE()).a__fE(moom.c1.R, java.lang.Integer.valueOf(0)));
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.8000000000000p-2f, 0x1.0000000000000p+0f);
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
    (this).c(0x1.99999a0000000p-3f);
    (this).a(moom.c1.f);
    (this).b("daylightDetector");
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(919918671345089937L)), ((long)(-560277459202289324L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(269477903128168L)))));
    long local11_life6 = (moom.c1.T ^ 95820632960281L);
    X = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill778_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill778_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill778_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill778_14 = new byte[8];
    (__sourceSpill778_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill778_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation778_16 = __sourceSpill778_14;
    ((javax.crypto.Cipher)(__sourceSpill778_11)).init(((int)(__sourceSpill778_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill778_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation778_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[2];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "anõÁYE\004TöÙsÌøt"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill778_25 = local4_life21;
        int __sourceSpill778_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill778_25)).substring(((int)(__sourceSpill778_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill778_30 = local6_life19;
        int __sourceSpill778_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill778_33 = new byte[8];
        (__sourceSpill778_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill778_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill778_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill778_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill778_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill778_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill778_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill778_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill778_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill778_34)).doFinal(((byte[])(__sourceSpill778_33)));
        (__sourceSpill778_30)[__sourceSpill778_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    U = ((long[])(local6_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[2]));
    R = ((moom.fy)(moom.fy.a(((java.lang.String)("power")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite778_39(612, (5390760322777634530L ^ local11_life6)))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7006_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/c1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.c1)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c1.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.c1.R))))))).intValue();
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.c1.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8444;
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
            throw new RuntimeException("moom/c1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


public void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.world.World forwardValue3005_13_0;
    float forwardValue3005_35_0;
    float forwardValue3005_37_0;
    int forwardValue3005_80_0;
    int forwardValue3005_93_0;
    net.minecraft.world.World spill3005_0;
    float spill3005_1;
    boolean spill3005_2;
    long life3_3;
    int[] life5_5;
    net.minecraft.block.state.IBlockState life6_21;
    int life7_29;
    float life8_33;
    float life9_49;
    float life8_57;
    int life7_64;
    int life7_73;
    forward_join_94: {
    forward_join_93: {
    forward_join_80: {
    forward_join_75: {
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_13: {
    life3_3 = (moom.c1.T ^ 1269979743388L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3005_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue3005_13_0 = spill3005_0;
        break forward_join_13;
    }
    if (!((!((moom.EA)(((net.minecraft.world.World)(spill3005_0)).v)).e()))) {
        break forward_join_94;
    }
    forwardValue3005_13_0 = p0;
    }
    life6_21 = ((net.minecraft.world.World)(forwardValue3005_13_0)).a__fE(((moom.DT)(p1)));
    life7_29 = (((net.minecraft.world.World)(p0)).b(((net.minecraft.world.EnumSkyBlock)(net.minecraft.world.EnumSkyBlock.SKY)), ((moom.DT)(p1))) - ((net.minecraft.world.World)(p0)).f());
    life8_33 = ((net.minecraft.world.World)(p0)).c(((float)(0x1.0p0f)));
    spill3005_1 = life8_33;
    if (!((life5_5 != null))) {
        forwardValue3005_35_0 = spill3005_1;
        break forward_join_35;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill3005_1)), ((float)(0x1.921fb6p1f))) < 0))) {
        break forward_join_36;
    }
    forwardValue3005_35_0 = 0x0.0p0f;
    }
    forwardValue3005_37_0 = forwardValue3005_35_0;
    break forward_join_37;
    }
    forwardValue3005_37_0 = 0x1.921fb6p2f;
    }
    life9_49 = forwardValue3005_37_0;
    life8_57 = (life8_33 + ((life9_49 - life8_33) * 0x1.99999ap-3f));
    life7_64 = java.lang.Math.round(((float)((((float) life7_29) * moom.Dr.b(((float)(life8_57)))))));
    life7_73 = moom.Dr.a(((int)(life7_64)), ((int)(0)), ((int)(__sourceIntrinsic_6d923203f1ab_invokedynamic3005_12(5976, (4944605154301143642L ^ life3_3)))));
    spill3005_2 = this.S;
    if (!((life5_5 != null))) {
        forwardValue3005_80_0 = ((spill3005_2) ? 1 : 0);
        break forward_join_80;
    }
    if (!(spill3005_2)) {
        break forward_join_75;
    }
    life7_73 = (__sourceIntrinsic_6d923203f1ab_invokedynamic3005_16(5976, (4944605154301143642L ^ life3_3)) - life7_73);
    }
    forwardValue3005_80_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life6_21)).a(((net.minecraft.block.properties.IProperty)(moom.c1.R))))))).intValue();
    }
    if (!((life5_5 != null))) {
        forwardValue3005_93_0 = forwardValue3005_80_0;
        break forward_join_93;
    }
    if (!((forwardValue3005_80_0 != life7_73))) {
        break forward_join_94;
    }
    forwardValue3005_93_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life6_21)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c1.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life7_73)))))))), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3005_93_0);
    }
    return;
}


public int c__Int() {
return 3;
}


public boolean l() {
return ((1) != 0);
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
moom.c1 forwardValue3003_12_0;
    moom.c1 spill3003_0;
    long life4_3;
    int[] life6_5;
    forward_join_16: {
    forward_join_12: {
    life4_3 = (moom.c1.T ^ 39551306110195L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3003_0 = this;
    if (!((life6_5 != null))) {
        forwardValue3003_12_0 = spill3003_0;
        break forward_join_12;
    }
    if (!((!((moom.c1)(spill3003_0)).S))) {
        break forward_join_16;
    }
    forwardValue3003_12_0 = this;
    }
    __sourceIntrinsic_3e6a1ebf0001_call3003_3(forwardValue3003_12_0, p0, p1, p2);
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.c1.R});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.c1.R))))))).intValue();
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((moom.c1)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.8p-2f)), ((float)(0x1.0p0f)));
    return;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b0)));
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Cd();
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b0)));
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3004_52_0;
    int forwardValue3004_58_0;
    int forwardValue3004_69_0;
    boolean spill3004_0;
    boolean spill3004_1;
    boolean spill3004_2;
    long life9_3;
    int[] life11_5;
    forward_join_69: {
    forward_join_59: {
    forward_join_58: {
    forward_join_57: {
    forward_join_52: {
    forward_join_40: {
    life9_3 = (moom.c1.T ^ 120907179026926L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3004_0 = ((net.minecraft.entity.player.EntityPlayer)(p3)).T__Boolean();
    if (!((life11_5 != null))) {
        forwardValue3004_69_0 = ((spill3004_0) ? 1 : 0);
        break forward_join_69;
    }
    if (!(spill3004_0)) {
        break forward_join_59;
    }
    spill3004_1 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3004_58_0 = ((spill3004_1) ? 1 : 0);
        break forward_join_58;
    }
    if (!((!spill3004_1))) {
        break forward_join_57;
    }
    spill3004_2 = this.S;
    if (!((life11_5 != null))) {
        forwardValue3004_52_0 = ((spill3004_2) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill3004_2)) {
        break forward_join_40;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.c1)(net.minecraft.init.Blocks.b0)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c1.R)), ((java.lang.Comparable)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.c1.R)))))))))), ((int)(4)));
    ((moom.c1)(net.minecraft.init.Blocks.b0)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life11_5 == null))) {
        break forward_join_57;
    }
    }
    forwardValue3004_52_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.c1)(net.minecraft.init.Blocks.b1)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.c1.R)), ((java.lang.Comparable)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.c1.R)))))))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3004_52_0);
    ((moom.c1)(net.minecraft.init.Blocks.b1)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    forwardValue3004_58_0 = 1;
    }
    return ((forwardValue3004_58_0) != 0);
    }
    forwardValue3004_69_0 = ((super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p3)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)))) ? 1 : 0);
    }
    return ((forwardValue3004_69_0) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite778_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7006_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d923203f1ab_invokedynamic3005_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d923203f1ab_invokedynamic3005_16(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_3e6a1ebf0001_call3003_3(moom.c1 a0, net.minecraft.item.Item a1, net.minecraft.creativetab.CreativeTabs a2, java.util.List a3) throws E;
}
