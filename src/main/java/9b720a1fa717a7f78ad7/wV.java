package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wV extends moom.wU {

private static long o;

private static long[] p;

private static java.lang.Integer[] r;

private static java.util.Map s;

public wV() { super((net.minecraft.block.Block)null); }


private static void __sourceConstructorBody_0679c1008db6c8ca(moom.wV receiver) throws Throwable {

long local1 = (moom.wV.o ^ 121614338657741L);

    moom.wV.__sourceConstructorInit_0679c1008db6c8ca_0(((moom.wV)(receiver)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.co)));

    ((moom.wV)(receiver)).f = ((int)(__sourceIntrinsic_0679c1008db6c8ca_originalDynamicSite3478_3(18443, (5290411949037651798L ^ local1))));

    ((moom.wV)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.c)));

    ((moom.wV)(receiver)).a(((boolean)(true)));

    ((moom.wV)(receiver)).c(((int)(0)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_0679c1008db6c8ca_0(moom.wV a0, net.minecraft.block.Block a1) throws E;

static {
o = ((long)(((moom._a)(moom._c.a(((long)(6310961127460775056L)), ((long)(3522720334502258552L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(239965308737398L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wV.o ^ 85980927309651L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1641_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1641_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1641_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1641_14 = new byte[8];
    (__sourceSpill1641_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1641_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1641_16 = __sourceSpill1641_14;
    ((javax.crypto.Cipher)(__sourceSpill1641_11)).init(((int)(__sourceSpill1641_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1641_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1641_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "6&Y²\020Á2}sÍíÆÕ\000@\007ÙÍ\007'A6ä"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1641_25 = local6_life21;
        int __sourceSpill1641_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1641_25)).substring(((int)(__sourceSpill1641_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1641_30 = local8_life19;
        int __sourceSpill1641_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1641_33 = new byte[8];
        (__sourceSpill1641_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1641_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1641_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1641_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1641_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1641_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1641_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1641_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1641_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1641_34)).doFinal(((byte[])(__sourceSpill1641_33)));
        (__sourceSpill1641_30)[__sourceSpill1641_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "­Pooí6LR©ª\032+¹@"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1641_38 = local6_life21;
        int __sourceSpill1641_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1641_38)).substring(((int)(__sourceSpill1641_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1641_43 = local8_life19;
        int __sourceSpill1641_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1641_46 = new byte[8];
        (__sourceSpill1641_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1641_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1641_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1641_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1641_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1641_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1641_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1641_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1641_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1641_47)).doFinal(((byte[])(__sourceSpill1641_46)));
        (__sourceSpill1641_43)[__sourceSpill1641_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9558_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11292;
      if (r[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wV", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wV.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String d(net.minecraft.item.ItemStack p0) {
java.lang.String local2 = "item.banner.";
    net.minecraft.item.EnumDyeColor local3 = ((moom.wV)(this)).a(((net.minecraft.item.ItemStack)(p0)));
    local2 = __sourceIntrinsic_480a975002ff_originalDynamicSite476_2(local2, ((net.minecraft.item.EnumDyeColor)(local3)).b__String());
    return net.minecraft.util.StatCollector.a(((java.lang.String)(local2)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.creativetab.CreativeTabs a__q1() {
return net.minecraft.creativetab.CreativeTabs.c;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4386_31_0;
    int forwardValue4386_40_0;
    int forwardValue4386_47_0;
    int forwardValue4386_51_0;
    int forwardValue4386_117_0;
    boolean spill4386_0;
    int spill4386_1;
    long life9_3;
    int life11_5;
    int life12_93;
    net.minecraft.tileentity.TileEntity life12_129;
    forward_join_117: {
    forward_join_116: {
    forward_join_97: {
    forward_join_87: {
    forward_join_52: {
    forward_join_51: {
    forward_join_47: {
    forward_join_45: {
    forward_join_40: {
    forward_join_36: {
    forward_join_31: {
    forward_join_22: {
    forward_join_11: {
    life9_3 = (moom.wV.o ^ 17796448427757L);
    life11_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((p4 == moom.bs.DOWN))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    spill4386_0 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3))))).a__ch())).a__fn())).b__Boolean();
    if (!((life11_5 != 0))) {
        forwardValue4386_31_0 = ((spill4386_0) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill4386_0))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    p3 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    forwardValue4386_31_0 = ((((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4386_40_0 = forwardValue4386_31_0;
        break forward_join_40;
    }
    if (!((forwardValue4386_31_0 == 0))) {
        break forward_join_36;
    }
    return ((0) != 0);
    }
    forwardValue4386_40_0 = ((((net.minecraft.block.Block)(net.minecraft.init.Blocks.co)).b__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4386_47_0 = forwardValue4386_40_0;
        break forward_join_47;
    }
    if (!((forwardValue4386_40_0 == 0))) {
        break forward_join_45;
    }
    return ((0) != 0);
    }
    forwardValue4386_47_0 = ((((net.minecraft.world.World)(p2)).G) ? 1 : 0);
    }
    if (!((life11_5 != 0))) {
        forwardValue4386_51_0 = forwardValue4386_47_0;
        break forward_join_51;
    }
    if (!((forwardValue4386_47_0 != 0))) {
        break forward_join_52;
    }
    forwardValue4386_51_0 = 1;
    }
    return ((forwardValue4386_51_0) != 0);
    }
    if (!((p4 == moom.bs.UP))) {
        break forward_join_87;
    }
    life12_93 = (moom.Dr.b__Int(((double)((((double) (((((net.minecraft.entity.player.EntityPlayer)(p1)).w + 0x1.68p7f) * 0x1.0p4f) / 0x1.68p8f)) + 0x1.0p-1d)))) & __sourceIntrinsic_e8125218b12d_invokedynamic4386_25(27750, (6154937185320874015L ^ life9_3)));
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.co)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.de.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life12_93)))))))), ((int)(3)));
    if (!((life11_5 == 0))) {
        break forward_join_97;
    }
    }
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cp)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.df.R)), ((java.lang.Comparable)(p4))))), ((int)(3)));
    }
    net.minecraft.item.ItemStack __stackOp4386_37_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4386_37_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4386_37_0)).b - 1)));
    life12_129 = ((net.minecraft.world.World)(p2)).a__B9(((moom.DT)(p3)));
    spill4386_1 = ((life12_129 instanceof moom.Ca) ? 1 : 0);
    if (!((life11_5 != 0))) {
        forwardValue4386_117_0 = spill4386_1;
        break forward_join_117;
    }
    if (!((spill4386_1 != 0))) {
        break forward_join_116;
    }
    ((moom.Ca)(((moom.Ca)(life12_129)))).a__Void(((net.minecraft.item.ItemStack)(p0)));
    }
    forwardValue4386_117_0 = 1;
    }
    return ((forwardValue4386_117_0) != 0);
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
boolean spill1368_0;
    long life4_3;
    net.minecraft.item.EnumDyeColor[] life7_6;
    int life6_7;
    int life8_10;
    int life9_12;
    net.minecraft.item.EnumDyeColor life10_19;
    net.minecraft.nbt.NBTTagCompound life11_23;
    net.minecraft.nbt.NBTTagCompound life12_32;
    net.minecraft.item.ItemStack life13_44;
    lexical_join_55: {
    life4_3 = (moom.wV.o ^ 98647637904605L);
    spill1368_0 = net.minecraft.item.ItemStack.l();
    life7_6 = net.minecraft.item.EnumDyeColor.values();
    life6_7 = ((spill1368_0) ? 1 : 0);
    life8_10 = (life7_6).length;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life9_12 < life8_10))) {
        break lexical_join_55;
    }
    life10_19 = (life7_6)[life9_12];
    life11_23 = new net.minecraft.nbt.NBTTagCompound();
    moom.Ca.a(((net.minecraft.nbt.NBTTagCompound)(life11_23)), ((int)(((net.minecraft.item.EnumDyeColor)(life10_19)).b())), ((net.minecraft.nbt.NBTTagList)(null)));
    life12_32 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life12_32)).a(((java.lang.String)("BlockEntityTag")), ((net.minecraft.nbt.NBTBase)(life11_23)));
    life13_44 = new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.item.EnumDyeColor)(life10_19)).b());
    ((net.minecraft.item.ItemStack)(life13_44)).b(((net.minecraft.nbt.NBTTagCompound)(life12_32)));
    ((java.util.List)(p2)).add(((java.lang.Object)(life13_44)));
    life9_12 += 1;
    if (!((life6_7 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
int forwardValue4384_15_0;
    int spill4384_0;
    long life3_3;
    int life5_5;
    net.minecraft.item.EnumDyeColor life6_22;
    forward_join_16: {
    forward_join_15: {
    life3_3 = (moom.wV.o ^ 102927325003484L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4384_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue4384_15_0 = spill4384_0;
        break forward_join_15;
    }
    if (!((spill4384_0 == 0))) {
        break forward_join_16;
    }
    forwardValue4384_15_0 = __sourceIntrinsic_3a92510638ee_invokedynamic4384_3(25333, (7000587936404496060L ^ life3_3));
    }
    return forwardValue4384_15_0;
    }
    life6_22 = ((moom.wV)(this)).a(((net.minecraft.item.ItemStack)(p0)));
    return ((moom.fm)(((net.minecraft.item.EnumDyeColor)(life6_22)).a__fm())).L;
}


private net.minecraft.item.EnumDyeColor a(net.minecraft.item.ItemStack p0) {
net.minecraft.nbt.NBTTagCompound forwardValue4383_18_0;
    int forwardValue4383_31_0;
    boolean spill4383_0;
    net.minecraft.nbt.NBTTagCompound spill4383_1;
    boolean spill4383_2;
    long life2_3;
    net.minecraft.nbt.NBTTagCompound life5_9;
    java.lang.Object life6_11;
    int life4_12;
    net.minecraft.item.EnumDyeColor life6_33;
    forward_join_33: {
    forward_join_31: {
    forward_join_29: {
    forward_join_18: {
    life2_3 = (moom.wV.o ^ 88112195308757L);
    spill4383_0 = net.minecraft.item.ItemStack.l();
    life5_9 = ((net.minecraft.item.ItemStack)(p0)).a(((java.lang.String)("BlockEntityTag")), ((boolean)(false)));
    life6_11 = null;
    life4_12 = ((spill4383_0) ? 1 : 0);
    spill4383_1 = life5_9;
    if (!((life4_12 == 0))) {
        forwardValue4383_18_0 = spill4383_1;
        break forward_join_18;
    }
    if (!((spill4383_1 != null))) {
        break forward_join_29;
    }
    forwardValue4383_18_0 = life5_9;
    }
    spill4383_2 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue4383_18_0)).a__Boolean(((java.lang.String)("Base")));
    if (!((life4_12 == 0))) {
        forwardValue4383_31_0 = ((spill4383_2) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill4383_2)) {
        break forward_join_29;
    }
    life6_33 = net.minecraft.item.EnumDyeColor.a(((int)(((net.minecraft.nbt.NBTTagCompound)(life5_9)).a__Int(((java.lang.String)("Base"))))));
    break forward_join_33;
    }
    forwardValue4383_31_0 = ((net.minecraft.item.ItemStack)(p0)).c();
    }
    life6_33 = net.minecraft.item.EnumDyeColor.a(((int)(forwardValue4383_31_0)));
    }
    return life6_33;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List<java.lang.String> p2, boolean p3) {
net.minecraft.nbt.NBTTagCompound lexicalValue1369_16_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1369_23_0;
    java.lang.String lexicalValue1369_23_1;
    boolean spill1369_0;
    net.minecraft.nbt.NBTTagCompound spill1369_1;
    java.lang.String spill1369_2;
    long life5_3;
    net.minecraft.nbt.NBTTagCompound life8_9;
    int life7_10;
    net.minecraft.nbt.NBTTagList life9_38;
    int life10_40;
    net.minecraft.nbt.NBTTagCompound life11_55;
    net.minecraft.item.EnumDyeColor life12_60;
    moom.bq life13_65;
    lexical_join_73: {
    lexical_join_23: {
    lexical_join_16: {
    life5_3 = (moom.wV.o ^ 63300205709636L);
    spill1369_0 = net.minecraft.item.ItemStack.m();
    life8_9 = ((net.minecraft.item.ItemStack)(p0)).a(((java.lang.String)("BlockEntityTag")), ((boolean)(false)));
    life7_10 = ((spill1369_0) ? 1 : 0);
    spill1369_1 = life8_9;
    if (!((life7_10 != 0))) {
        lexicalValue1369_16_0 = spill1369_1;
        break lexical_join_16;
    }
    if (!((spill1369_1 != null))) {
        break lexical_join_73;
    }
    lexicalValue1369_16_0 = life8_9;
    }
    spill1369_2 = "Patterns";
    if (!((life7_10 != 0))) {
        lexicalValue1369_23_0 = lexicalValue1369_16_0;
        lexicalValue1369_23_1 = spill1369_2;
        break lexical_join_23;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(lexicalValue1369_16_0)).a__Boolean(((java.lang.String)(spill1369_2))))) {
        break lexical_join_73;
    }
    lexicalValue1369_23_0 = life8_9;
    lexicalValue1369_23_1 = "Patterns";
    }
    life9_38 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1369_23_0)).a(((java.lang.String)(lexicalValue1369_23_1)), ((int)(__sourceIntrinsic_9085c89dbf75_invokedynamic1369_5(31345, (8964939758960488866L ^ life5_3)))));
    life10_40 = 0;
    lexical_cycle_32: while (true) {
    lexical_join_71: {
    lexical_join_70: {
    if (!((life10_40 < ((net.minecraft.nbt.NBTTagList)(life9_38)).a__Int()))) {
        break lexical_join_73;
    }
    if (!((life10_40 < __sourceIntrinsic_9085c89dbf75_invokedynamic1369_8(5244, (6804094341253652398L ^ life5_3))))) {
        break lexical_join_73;
    }
    life11_55 = ((net.minecraft.nbt.NBTTagList)(life9_38)).a__yw(((int)(life10_40)));
    life12_60 = net.minecraft.item.EnumDyeColor.a(((int)(((net.minecraft.nbt.NBTTagCompound)(life11_55)).a__Int(((java.lang.String)("Color"))))));
    life13_65 = moom.bq.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life11_55)).a__String(((java.lang.String)("Pattern"))))));
    if (!((life7_10 != 0))) {
        break lexical_join_71;
    }
    if (!((life13_65 != null))) {
        break lexical_join_70;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_9085c89dbf75_invokedynamic1369_16(((moom.bq)(life13_65)).a(), ((net.minecraft.item.EnumDyeColor)(life12_60)).b__String())))))));
    }
    life10_40 += 1;
    }
    if (!((life7_10 == 0))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_0679c1008db6c8ca_originalDynamicSite3478_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9558_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_originalDynamicSite476_2(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8125218b12d_invokedynamic4386_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic4384_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9085c89dbf75_invokedynamic1369_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9085c89dbf75_invokedynamic1369_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic1369_16(java.lang.String a0, java.lang.String a1) throws E;
}
