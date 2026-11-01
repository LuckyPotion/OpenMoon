package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dc extends moom.cT {

public static final moom.fx R;

public static final moom.fw<net.minecraft.block.BlockPistonExtension$EnumPistonType> S;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map X;

public dc() {
super(moom.fn.H);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.dc.R, moom.bs.NORTH)).a__fE(moom.dc.S, net.minecraft.block.BlockPistonExtension$EnumPistonType.DEFAULT));
    (this).c(-0x1.0000000000000p+0f);
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(-3915332218547632443L)), ((long)(-7244827871228947368L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(266397510205891L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dc.T ^ 115017577402539L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill813_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill813_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill813_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill813_14 = new byte[8];
    (__sourceSpill813_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill813_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation813_16 = __sourceSpill813_14;
    ((javax.crypto.Cipher)(__sourceSpill813_11)).init(((int)(__sourceSpill813_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill813_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation813_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "±h®ªAiÙrbð\003YîD"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill813_25 = local6_life21;
        int __sourceSpill813_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill813_25)).substring(((int)(__sourceSpill813_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill813_30 = local8_life19;
        int __sourceSpill813_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill813_33 = new byte[8];
        (__sourceSpill813_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill813_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill813_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill813_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill813_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill813_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill813_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill813_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill813_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill813_34)).doFinal(((byte[])(__sourceSpill813_33)));
        (__sourceSpill813_30)[__sourceSpill813_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    U = ((long[])(local8_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[2]));
    R = ((moom.fx)(moom.dY.Q));
    S = ((moom.fw)(moom.dY.R));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7350_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.dc.T ^ 120154310927543L);
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dc)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dc.R)), ((java.lang.Comparable)(moom.dY.a(((int)(p0)))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dc.S)), ((java.lang.Comparable)((((p0 & __sourceIntrinsic_819466f05fee_invokedynamic6242_6(28017, (2990586406492731093L ^ local2))) > 0) ? net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY : net.minecraft.block.BlockPistonExtension$EnumPistonType.DEFAULT))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3303_32_0;
    int[] spill3303_0;
    int spill3303_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_17;
    forward_join_32: {
    forward_join_31: {
    life2_3 = (moom.dc.T ^ 107699430563773L);
    spill3303_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill3303_0;
    spill3303_1 = (life5_6 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dc.R))))))).a());
    if (!((life4_7 != null))) {
        forwardValue3303_32_0 = spill3303_1;
        break forward_join_32;
    }
    life5_17 = spill3303_1;
    if (!((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dc.S))) == net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY))) {
        break forward_join_31;
    }
    life5_17 = (life5_17 | __sourceIntrinsic_8db5871551d4_invokedynamic3303_9(16263, (3903286038626459432L ^ life2_3)));
    }
    forwardValue3303_32_0 = life5_17;
    }
    return forwardValue3303_32_0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dc.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28776;
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
            throw new RuntimeException("moom/dc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return ((0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.tileentity.TileEntity forwardValue3304_16_0;
    int[] spill3304_0;
    net.minecraft.tileentity.TileEntity spill3304_1;
    long life4_3;
    net.minecraft.tileentity.TileEntity life7_8;
    int[] life6_9;
    forward_join_25: {
    forward_join_20: {
    forward_join_16: {
    life4_3 = (moom.dc.T ^ 48093297643523L);
    spill3304_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life6_9 = spill3304_0;
    spill3304_1 = life7_8;
    if (!((life6_9 != null))) {
        forwardValue3304_16_0 = spill3304_1;
        break forward_join_16;
    }
    if (!((((spill3304_1 instanceof net.minecraft.tileentity.TileEntityPiston) ? 1 : 0) != 0))) {
        break forward_join_20;
    }
    forwardValue3304_16_0 = life7_8;
    }
    ((net.minecraft.tileentity.TileEntityPiston)(((net.minecraft.tileentity.TileEntityPiston)(forwardValue3304_16_0)))).b();
    if (!((life6_9 == null))) {
        break forward_join_25;
    }
    }
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
return ((0) != 0);
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return null;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, moom.bs p4) {
net.minecraft.block.Block forwardValue3298_14_0;
    net.minecraft.block.Block forwardValue3298_21_0;
    moom.CA forwardValue3298_33_0;
    net.minecraft.block.Block spill3298_0;
    moom.CA spill3298_1;
    long life6_3;
    int[] life8_5;
    moom.CA life9_37;
    double life10_51;
    double life12_54;
    double life14_57;
    double life16_60;
    double life18_63;
    double life20_66;
    forward_join_131: {
    forward_join_121: {
    forward_join_112: {
    forward_join_98: {
    forward_join_89: {
    forward_join_75: {
    forward_join_66: {
    forward_join_64: {
    forward_join_33: {
    forward_join_32: {
    forward_join_21: {
    forward_join_14: {
    life6_3 = (moom.dc.T ^ 39411189587522L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3298_0 = ((net.minecraft.block.state.IBlockState)(p2)).a__ch();
    if (!((life8_5 != null))) {
        forwardValue3298_14_0 = spill3298_0;
        break forward_join_14;
    }
    if (!((spill3298_0 != this))) {
        break forward_join_131;
    }
    forwardValue3298_14_0 = ((net.minecraft.block.state.IBlockState)(p2)).a__ch();
    }
    if (!((life8_5 != null))) {
        forwardValue3298_21_0 = forwardValue3298_14_0;
        break forward_join_21;
    }
    if (!((((net.minecraft.block.Block)(forwardValue3298_14_0)).a__fn() != moom.fn.a))) {
        break forward_join_131;
    }
    forwardValue3298_21_0 = ((net.minecraft.block.state.IBlockState)(p2)).a__ch();
    }
    life9_37 = ((net.minecraft.block.Block)(forwardValue3298_21_0)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    spill3298_1 = life9_37;
    if (!((life8_5 != null))) {
        forwardValue3298_33_0 = spill3298_1;
        break forward_join_33;
    }
    if (!((spill3298_1 == null))) {
        break forward_join_32;
    }
    return null;
    }
    forwardValue3298_33_0 = life9_37;
    }
    life10_51 = ((moom.CA)(forwardValue3298_33_0)).b;
    life12_54 = ((moom.CA)(life9_37)).c;
    life14_57 = ((moom.CA)(life9_37)).d;
    life16_60 = ((moom.CA)(life9_37)).e;
    life18_63 = ((moom.CA)(life9_37)).f;
    life20_66 = ((moom.CA)(life9_37)).g;
    if (!((life8_5 != null))) {
        break forward_join_64;
    }
    if (!((((moom.bs)(p4)).c() < 0))) {
        break forward_join_66;
    }
    life10_51 = (life10_51 - ((double) (((float) ((moom.bs)(p4)).c()) * p3)));
    }
    if (!((life8_5 == null))) {
        break forward_join_75;
    }
    }
    life16_60 = (life16_60 - ((double) (((float) ((moom.bs)(p4)).c()) * p3)));
    }
    if (!((((moom.bs)(p4)).d() < 0))) {
        break forward_join_89;
    }
    life12_54 = (life12_54 - ((double) (((float) ((moom.bs)(p4)).d()) * p3)));
    if (!((life8_5 == null))) {
        break forward_join_98;
    }
    }
    life18_63 = (life18_63 - ((double) (((float) ((moom.bs)(p4)).d()) * p3)));
    }
    if (!((((moom.bs)(p4)).e() < 0))) {
        break forward_join_112;
    }
    life14_57 = (life14_57 - ((double) (((float) ((moom.bs)(p4)).e()) * p3)));
    if (!((life8_5 == null))) {
        break forward_join_121;
    }
    }
    life20_66 = (life20_66 - ((double) (((float) ((moom.bs)(p4)).e()) * p3)));
    }
    return new moom.CA(life10_51, life12_54, life14_57, life16_60, life18_63, life20_66);
    }
    return null;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
net.minecraft.world.World forwardValue3299_12_0;
    net.minecraft.world.World spill3299_0;
    long life5_3;
    int[] life7_5;
    forward_join_15: {
    forward_join_12: {
    life5_3 = (moom.dc.T ^ 95393037220577L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3299_0 = p0;
    if (!((life7_5 != null))) {
        forwardValue3299_12_0 = spill3299_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill3299_0)).G))) {
        break forward_join_15;
    }
    forwardValue3299_12_0 = p0;
    }
    ((net.minecraft.world.World)(forwardValue3299_12_0)).a__B9(((moom.DT)(p1)));
    }
    return;
}


public static net.minecraft.tileentity.TileEntity a(net.minecraft.block.state.IBlockState p0, moom.bs p1, boolean p2, boolean p3) {
return new net.minecraft.tileentity.TileEntityPiston(p0, p1, p2, p3);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dc.R, moom.dc.S});
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return null;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
net.minecraft.tileentity.TileEntityPiston forwardValue3297_19_0;
    net.minecraft.tileentity.TileEntityPiston spill3297_0;
    long life6_3;
    int[] life8_5;
    net.minecraft.tileentity.TileEntityPiston life9_13;
    net.minecraft.block.state.IBlockState life10_23;
    forward_join_28: {
    forward_join_19: {
    life6_3 = (moom.dc.T ^ 80064287894340L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_28;
    }
    life9_13 = ((moom.dc)(this)).a__sourceReturn_f153c49252(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    spill3297_0 = life9_13;
    if (!((life8_5 != null))) {
        forwardValue3297_19_0 = spill3297_0;
        break forward_join_19;
    }
    if (!((spill3297_0 != null))) {
        break forward_join_28;
    }
    forwardValue3297_19_0 = life9_13;
    }
    life10_23 = ((net.minecraft.tileentity.TileEntityPiston)(forwardValue3297_19_0)).a__fE();
    ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life10_23)).a__ch())).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life10_23)), ((int)(0)));
    }
    return;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return null;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.world.World forwardValue3300_19_0;
    moom.DT forwardValue3300_19_1;
    int forwardValue3300_24_0;
    boolean spill3300_0;
    net.minecraft.world.World spill3300_1;
    moom.DT spill3300_2;
    long life9_3;
    int[] life11_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life9_3 = (moom.dc.T ^ 39024952066039L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3300_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue3300_24_0 = ((spill3300_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!((!spill3300_0))) {
        break forward_join_23;
    }
    spill3300_1 = p0;
    spill3300_2 = p1;
    if (!((life11_5 != null))) {
        forwardValue3300_19_0 = spill3300_1;
        forwardValue3300_19_1 = spill3300_2;
        break forward_join_19;
    }
    if (!((((net.minecraft.world.World)(spill3300_1)).a__B9(((moom.DT)(spill3300_2))) == null))) {
        break forward_join_23;
    }
    forwardValue3300_19_0 = p0;
    forwardValue3300_19_1 = p1;
    }
    ((net.minecraft.world.World)(forwardValue3300_19_0)).d__Boolean(((moom.DT)(forwardValue3300_19_1)));
    return ((1) != 0);
    }
    forwardValue3300_24_0 = 0;
    }
    return ((forwardValue3300_24_0) != 0);
}


private net.minecraft.tileentity.TileEntityPiston a__sourceReturn_f153c49252(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.tileentity.TileEntity forwardValue3295_16_0;
    net.minecraft.tileentity.TileEntityPiston forwardValue3295_19_0;
    int[] spill3295_0;
    net.minecraft.tileentity.TileEntity spill3295_1;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_8;
    int[] life5_9;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (moom.dc.T ^ 124747731959445L);
    spill3295_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__B9(((moom.DT)(p1)));
    life5_9 = spill3295_0;
    spill3295_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue3295_16_0 = spill3295_1;
        break forward_join_16;
    }
    if (!((((spill3295_1 instanceof net.minecraft.tileentity.TileEntityPiston) ? 1 : 0) != 0))) {
        break forward_join_18;
    }
    forwardValue3295_16_0 = life6_8;
    }
    forwardValue3295_19_0 = ((net.minecraft.tileentity.TileEntityPiston)(forwardValue3295_16_0));
    break forward_join_19;
    }
    forwardValue3295_19_0 = null;
    }
    return forwardValue3295_19_0;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.tileentity.TileEntityPiston forwardValue3301_16_0;
    net.minecraft.block.Block forwardValue3301_27_0;
    net.minecraft.block.Block forwardValue3301_55_0;
    net.minecraft.block.BlockPistonBase forwardValue3301_55_1;
    int[] spill3301_0;
    net.minecraft.tileentity.TileEntityPiston spill3301_1;
    net.minecraft.block.Block spill3301_2;
    net.minecraft.block.Block spill3301_3;
    net.minecraft.block.BlockPistonBase spill3301_4;
    long life3_3;
    net.minecraft.tileentity.TileEntityPiston life6_9;
    int[] life5_10;
    net.minecraft.block.state.IBlockState life7_20;
    net.minecraft.block.Block life8_23;
    float life9_45;
    moom.bs life10_80;
    forward_join_127: {
    forward_join_58: {
    forward_join_56: {
    forward_join_55: {
    forward_join_48: {
    forward_join_44: {
    forward_join_31: {
    forward_join_30: {
    forward_join_27: {
    forward_join_16: {
    life3_3 = (moom.dc.T ^ 111959356566584L);
    spill3301_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_9 = ((moom.dc)(this)).a__sourceReturn_f153c49252(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    life5_10 = spill3301_0;
    spill3301_1 = life6_9;
    if (!((life5_10 != null))) {
        forwardValue3301_16_0 = spill3301_1;
        break forward_join_16;
    }
    if (!((spill3301_1 != null))) {
        break forward_join_127;
    }
    forwardValue3301_16_0 = life6_9;
    }
    life7_20 = ((net.minecraft.tileentity.TileEntityPiston)(forwardValue3301_16_0)).a__fE();
    life8_23 = ((net.minecraft.block.state.IBlockState)(life7_20)).a__ch();
    spill3301_2 = life8_23;
    if (!((life5_10 != null))) {
        forwardValue3301_27_0 = spill3301_2;
        break forward_join_27;
    }
    if (!((spill3301_2 != this))) {
        break forward_join_30;
    }
    forwardValue3301_27_0 = life8_23;
    }
    if (!((((net.minecraft.block.Block)(forwardValue3301_27_0)).a__fn() == moom.fn.a))) {
        break forward_join_31;
    }
    }
    return;
    }
    life9_45 = ((net.minecraft.tileentity.TileEntityPiston)(life6_9)).a(((float)(0x0.0p0f)));
    if (!((life5_10 != null))) {
        break forward_join_48;
    }
    if (!(((net.minecraft.tileentity.TileEntityPiston)(life6_9)).b__Boolean())) {
        break forward_join_44;
    }
    life9_45 = (0x1.0p0f - life9_45);
    }
    ((net.minecraft.block.Block)(life8_23)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    }
    spill3301_3 = life8_23;
    spill3301_4 = net.minecraft.init.Blocks.J;
    if (!((life5_10 != null))) {
        forwardValue3301_55_0 = spill3301_3;
        forwardValue3301_55_1 = spill3301_4;
        break forward_join_55;
    }
    if (!((spill3301_3 != spill3301_4))) {
        break forward_join_56;
    }
    forwardValue3301_55_0 = life8_23;
    forwardValue3301_55_1 = net.minecraft.init.Blocks.F;
    }
    if (!((forwardValue3301_55_0 == forwardValue3301_55_1))) {
        break forward_join_58;
    }
    }
    life9_45 = 0x0.0p0f;
    }
    life10_80 = ((net.minecraft.tileentity.TileEntityPiston)(life6_9)).a__sourceReturn_7c12d77acb();
    ((moom.dc)(this)).B = ((double)((((net.minecraft.block.Block)(life8_23)).a() - ((double) (((float) ((moom.bs)(life10_80)).c()) * life9_45)))));
    ((moom.dc)(this)).C = ((double)((((net.minecraft.block.Block)(life8_23)).c() - ((double) (((float) ((moom.bs)(life10_80)).d()) * life9_45)))));
    ((moom.dc)(this)).D = ((double)((((net.minecraft.block.Block)(life8_23)).e() - ((double) (((float) ((moom.bs)(life10_80)).e()) * life9_45)))));
    ((moom.dc)(this)).E = ((double)((((net.minecraft.block.Block)(life8_23)).b() - ((double) (((float) ((moom.bs)(life10_80)).c()) * life9_45)))));
    ((moom.dc)(this)).F = ((double)((((net.minecraft.block.Block)(life8_23)).d() - ((double) (((float) ((moom.bs)(life10_80)).d()) * life9_45)))));
    ((moom.dc)(this)).G = ((double)((((net.minecraft.block.Block)(life8_23)).f() - ((double) (((float) ((moom.bs)(life10_80)).e()) * life9_45)))));
    }
    return;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.tileentity.TileEntityPiston forwardValue3296_18_0;
    int[] spill3296_0;
    net.minecraft.tileentity.TileEntityPiston spill3296_1;
    long life4_3;
    net.minecraft.tileentity.TileEntityPiston life7_9;
    int[] life6_10;
    float life8_25;
    forward_join_28: {
    forward_join_18: {
    forward_join_17: {
    life4_3 = (moom.dc.T ^ 77738130480553L);
    spill3296_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = ((moom.dc)(this)).a__sourceReturn_f153c49252(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    life6_10 = spill3296_0;
    spill3296_1 = life7_9;
    if (!((life6_10 != null))) {
        forwardValue3296_18_0 = spill3296_1;
        break forward_join_18;
    }
    if (!((spill3296_1 == null))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue3296_18_0 = life7_9;
    }
    life8_25 = ((net.minecraft.tileentity.TileEntityPiston)(forwardValue3296_18_0)).a(((float)(0x0.0p0f)));
    if (!(((net.minecraft.tileentity.TileEntityPiston)(life7_9)).b__Boolean())) {
        break forward_join_28;
    }
    life8_25 = (0x1.0p0f - life8_25);
    }
    return ((moom.dc)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.tileentity.TileEntityPiston)(life7_9)).a__fE())), ((float)(life8_25)), ((moom.bs)(((net.minecraft.tileentity.TileEntityPiston)(life7_9)).a__sourceReturn_7c12d77acb())));
}


public void a__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3302_29_0;
    int forwardValue3302_35_0;
    int[] spill3302_0;
    int spill3302_1;
    long life4_3;
    moom.DT life7_11;
    net.minecraft.block.state.IBlockState life8_16;
    int[] life6_17;
    forward_join_36: {
    forward_join_35: {
    forward_join_29: {
    life4_3 = (moom.dc.T ^ 135821682158984L);
    life7_11 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dc.R))))))).a__bs())));
    spill3302_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_16 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life7_11)));
    life6_17 = spill3302_0;
    spill3302_1 = ((((net.minecraft.block.state.IBlockState)(life8_16)).a__ch() instanceof net.minecraft.block.BlockPistonBase) ? 1 : 0);
    if (!((life6_17 != null))) {
        forwardValue3302_29_0 = spill3302_1;
        break forward_join_29;
    }
    if (!((spill3302_1 != 0))) {
        break forward_join_36;
    }
    forwardValue3302_29_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life8_16)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life6_17 != null))) {
        forwardValue3302_35_0 = forwardValue3302_29_0;
        break forward_join_35;
    }
    if (!((forwardValue3302_29_0 != 0))) {
        break forward_join_36;
    }
    forwardValue3302_35_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(life7_11)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3302_35_0);
    }
    return;
}


public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World p0, moom.DT p1, moom.DR p2, moom.DR p3) {
return null;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7350_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic6242_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3303_9(int a0, long a1) throws E;
}
