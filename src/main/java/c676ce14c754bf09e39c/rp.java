package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class rp extends moom.rd {

private boolean c;

private static final long d;

private static final long[] f;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

rp() {
super();
    this.c = true;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(1809898913843054675L)), ((long)(2492713078499950872L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(158196454071784L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.rp.d ^ 75183831486784L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1510_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1510_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1510_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1510_14 = new byte[8];
    (__sourceSpill1510_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1510_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1510_16 = __sourceSpill1510_14;
    ((javax.crypto.Cipher)(__sourceSpill1510_11)).init(((int)(__sourceSpill1510_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1510_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1510_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "§ÿCdN\006Çj&=\neaï\035"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1510_25 = local6_life21;
        int __sourceSpill1510_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1510_25)).substring(((int)(__sourceSpill1510_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1510_30 = local8_life19;
        int __sourceSpill1510_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1510_33 = new byte[8];
        (__sourceSpill1510_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1510_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1510_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1510_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1510_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1510_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1510_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1510_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1510_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1510_34)).doFinal(((byte[])(__sourceSpill1510_33)));
        (__sourceSpill1510_30)[__sourceSpill1510_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "â\n\000Ã]`3%PëKÑ\004õÆ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1510_38 = local6_life21;
        int __sourceSpill1510_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1510_38)).substring(((int)(__sourceSpill1510_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1510_43 = local8_life19;
        int __sourceSpill1510_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1510_46 = new byte[8];
        (__sourceSpill1510_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1510_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1510_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1510_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1510_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1510_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1510_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1510_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1510_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1510_47)).doFinal(((byte[])(__sourceSpill1510_46)));
        (__sourceSpill1510_43)[__sourceSpill1510_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19753;
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
         long var5 = f[var3];
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
            throw new RuntimeException("moom/rp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_d8ef046f468b78(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8967_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
int forwardValue3929_31_0;
    int forwardValue3929_36_0;
    int forwardValue3929_48_0;
    net.minecraft.item.ItemStack forwardValue3929_70_0;
    int forwardValue3929_99_0;
    net.minecraft.nbt.NBTTagCompound forwardValue3929_102_0;
    java.lang.String forwardValue3929_102_1;
    boolean spill3929_0;
    boolean spill3929_1;
    net.minecraft.item.ItemStack spill3929_2;
    boolean spill3929_3;
    net.minecraft.nbt.NBTTagCompound spill3929_4;
    java.lang.String spill3929_5;
    long life3_3;
    net.minecraft.world.World life6_7;
    moom.bs life7_11;
    int life5_12;
    moom.DT life8_17;
    net.minecraft.block.BlockSkull life9_19;
    net.minecraft.tileentity.TileEntity life10_70;
    com.mojang.authlib.GameProfile life11_87;
    net.minecraft.nbt.NBTTagCompound life12_101;
    java.lang.String life13_142;
    forward_join_149: {
    forward_join_146: {
    forward_join_144: {
    forward_join_138: {
    forward_join_124: {
    forward_join_119: {
    forward_join_113: {
    forward_join_102: {
    forward_join_99: {
    forward_join_89: {
    forward_join_70: {
    forward_join_48: {
    forward_join_36: {
    forward_join_31: {
    life3_3 = (moom.rp.d ^ 122603115581949L);
    spill3929_0 = moom.v5.c__Boolean();
    life6_7 = ((moom.ry)(p0)).a__Eu();
    life7_11 = __sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int())));
    life5_12 = ((spill3929_0) ? 1 : 0);
    life8_17 = ((moom.DT)(((moom.ry)(p0)).a__DT())).a(((moom.bs)(life7_11)));
    life9_19 = net.minecraft.init.Blocks.bT;
    spill3929_1 = ((net.minecraft.world.World)(life6_7)).a__Boolean(((moom.DT)(life8_17)));
    if (!((life5_12 == 0))) {
        forwardValue3929_31_0 = ((spill3929_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill3929_1)) {
        break forward_join_146;
    }
    forwardValue3929_31_0 = ((((net.minecraft.block.BlockSkull)(life9_19)).a__sourceReturn_fab76ee80a(((net.minecraft.world.World)(life6_7)), ((moom.DT)(life8_17)), ((net.minecraft.item.ItemStack)(p1)))) ? 1 : 0);
    }
    if (!((life5_12 == 0))) {
        forwardValue3929_36_0 = forwardValue3929_31_0;
        break forward_join_36;
    }
    if (!((forwardValue3929_31_0 != 0))) {
        break forward_join_146;
    }
    forwardValue3929_36_0 = ((((net.minecraft.world.World)(life6_7)).G) ? 1 : 0);
    }
    if (!((life5_12 == 0))) {
        forwardValue3929_48_0 = forwardValue3929_36_0;
        break forward_join_48;
    }
    if (!((forwardValue3929_36_0 == 0))) {
        break forward_join_149;
    }
    forwardValue3929_48_0 = ((((net.minecraft.world.World)(life6_7)).a(((moom.DT)(life8_17)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockSkull)(life9_19)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockSkull.R)), ((java.lang.Comparable)(moom.bs.UP))))), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3929_48_0);
    life10_70 = ((net.minecraft.world.World)(life6_7)).a__B9(((moom.DT)(life8_17)));
    if (!((life5_12 == 0))) {
        break forward_join_144;
    }
    if (!((((life10_70 instanceof net.minecraft.tileentity.TileEntitySkull) ? 1 : 0) != 0))) {
        break forward_join_138;
    }
    if (!((((net.minecraft.item.ItemStack)(p1)).c() == 3))) {
        break forward_join_119;
    }
    life11_87 = null;
    spill3929_2 = p1;
    if (!((life5_12 == 0))) {
        forwardValue3929_70_0 = spill3929_2;
        break forward_join_70;
    }
    if (!(((net.minecraft.item.ItemStack)(spill3929_2)).e__Boolean())) {
        break forward_join_113;
    }
    forwardValue3929_70_0 = p1;
    }
    life12_101 = ((net.minecraft.item.ItemStack)(forwardValue3929_70_0)).a__yw();
    spill3929_3 = ((net.minecraft.nbt.NBTTagCompound)(life12_101)).a__Boolean(((java.lang.String)("SkullOwner")), ((int)(__sourceIntrinsic_defb6adcd4c8_invokedynamic3929_27(14013, (8844790440838566594L ^ life3_3)))));
    if (!((life5_12 == 0))) {
        forwardValue3929_99_0 = ((spill3929_3) ? 1 : 0);
        break forward_join_99;
    }
    if (!(spill3929_3)) {
        break forward_join_89;
    }
    life11_87 = moom.yD.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(life12_101)).a__yw(((java.lang.String)("SkullOwner"))))));
    break forward_join_113;
    }
    spill3929_4 = life12_101;
    spill3929_5 = "SkullOwner";
    if (!((life5_12 == 0))) {
        forwardValue3929_102_0 = spill3929_4;
        forwardValue3929_102_1 = spill3929_5;
        break forward_join_102;
    }
    forwardValue3929_99_0 = ((((net.minecraft.nbt.NBTTagCompound)(spill3929_4)).a__Boolean(((java.lang.String)(spill3929_5)), ((int)(__sourceIntrinsic_defb6adcd4c8_invokedynamic3929_32(29060, (1471407277100914169L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue3929_99_0 != 0))) {
        break forward_join_113;
    }
    forwardValue3929_102_0 = life12_101;
    forwardValue3929_102_1 = "SkullOwner";
    }
    life13_142 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue3929_102_0)).a__String(((java.lang.String)(forwardValue3929_102_1)));
    if (!((!moom.DK.a__Boolean(((java.lang.String)(life13_142)))))) {
        break forward_join_113;
    }
    life11_87 = new com.mojang.authlib.GameProfile(null, life13_142);
    }
    ((net.minecraft.tileentity.TileEntitySkull)(((net.minecraft.tileentity.TileEntitySkull)(life10_70)))).a__Void(((com.mojang.authlib.GameProfile)(life11_87)));
    if (!((life5_12 != 0))) {
        break forward_join_124;
    }
    }
    ((net.minecraft.tileentity.TileEntitySkull)(((net.minecraft.tileentity.TileEntitySkull)(life10_70)))).a(((int)(((net.minecraft.item.ItemStack)(p1)).c())));
    }
    ((net.minecraft.tileentity.TileEntitySkull)(((net.minecraft.tileentity.TileEntitySkull)(life10_70)))).c(((int)((((moom.bs)(((moom.bs)(life7_11)).a__bs())).b() * 4))));
    ((net.minecraft.block.BlockSkull)(net.minecraft.init.Blocks.bT)).a(((net.minecraft.world.World)(life6_7)), ((moom.DT)(life8_17)), ((net.minecraft.tileentity.TileEntitySkull)(((net.minecraft.tileentity.TileEntitySkull)(life10_70)))));
    }
    net.minecraft.item.ItemStack __stackOp3929_49_0 = p1;
    ((net.minecraft.item.ItemStack)(__stackOp3929_49_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp3929_49_0)).b - 1)));
    }
    if (!((life5_12 != 0))) {
        break forward_join_149;
    }
    }
    this.c = ((boolean)(false));
    }
    return p1;
}


protected void a(moom.ry p0) {
long life2_3;
    int life4_5;
    forward_join_35: {
    forward_join_24: {
    forward_join_22: {
    life2_3 = (moom.rp.d ^ 110060366740195L);
    life4_5 = ((moom.v5.b__Boolean()) ? 1 : 0);
    if (!((life4_5 != 0))) { break forward_join_22; }
    if (!(this.c)) { break forward_join_24; }
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(__sourceIntrinsic_278d39e339b3_invokedynamic4542_5(3019, (7031183920781264043L ^ life2_3)))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    }
    if (!((life4_5 == 0))) { break forward_join_35; }
    }
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(__sourceIntrinsic_278d39e339b3_invokedynamic4542_9(14644, (7954703238227441238L ^ life2_3)))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8967_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_defb6adcd4c8_invokedynamic3929_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_defb6adcd4c8_invokedynamic3929_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_278d39e339b3_invokedynamic4542_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_278d39e339b3_invokedynamic4542_9(int a0, long a1) throws E;

private static native int __sourceExactCall_d8ef046f468b78(int p0, long p1);
private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
}
