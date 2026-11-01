package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wU extends net.minecraft.item.Item {

protected final net.minecraft.block.Block n;

private static final long q;

private static final long[] t;

private static final java.lang.Integer[] u;

private static final java.util.Map v;

public wU(net.minecraft.block.Block p0) {
super();
    this.n = p0;
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(45006799051176052L)), ((long)(2633766828930993665L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(164436451536353L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wU.q ^ 37744946092446L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1088_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1088_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1088_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1088_14 = new byte[8];
    (__sourceSpill1088_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1088_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1088_16 = __sourceSpill1088_14;
    ((javax.crypto.Cipher)(__sourceSpill1088_11)).init(((int)(__sourceSpill1088_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1088_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1088_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "p\022'ñëC%\\\f@Î¶"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1088_25 = local6_life21;
        int __sourceSpill1088_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1088_25)).substring(((int)(__sourceSpill1088_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1088_30 = local8_life19;
        int __sourceSpill1088_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1088_33 = new byte[8];
        (__sourceSpill1088_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1088_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1088_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1088_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1088_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1088_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1088_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1088_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1088_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1088_34)).doFinal(((byte[])(__sourceSpill1088_33)));
        (__sourceSpill1088_30)[__sourceSpill1088_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    t = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9554_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.item.Item b(java.lang.String p0) {
return ((moom.wU)(this)).a__sourceReturn_6a6569f730(((java.lang.String)(p0)));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wU.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2F58;
        if (u[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = t[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])v.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    v.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/wU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wU.u[n2] = n3;
        }
        return u[n2];
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
return ((net.minecraft.block.Block)(this.n)).b__String();
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4379_26_0;
    int forwardValue4379_36_0;
    int forwardValue4379_50_0;
    net.minecraft.block.Block forwardValue4379_97_0;
    int forwardValue4379_185_0;
    int forwardValue4379_187_0;
    boolean spill4379_0;
    boolean spill4379_1;
    boolean spill4379_2;
    net.minecraft.block.Block spill4379_3;
    long life9_3;
    net.minecraft.block.state.IBlockState life12_7;
    net.minecraft.block.Block life13_11;
    int life11_12;
    int life14_73;
    net.minecraft.block.state.IBlockState life15_85;
    net.minecraft.block.state.IBlockState life15_100;
    forward_join_187: {
    forward_join_186: {
    forward_join_185: {
    forward_join_184: {
    forward_join_178: {
    forward_join_140: {
    forward_join_103: {
    forward_join_97: {
    forward_join_50: {
    forward_join_41: {
    forward_join_36: {
    forward_join_31: {
    forward_join_26: {
    forward_join_24: {
    life9_3 = (moom.wU.q ^ 133318648508842L);
    life12_7 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    spill4379_0 = net.minecraft.item.ItemStack.m();
    life13_11 = ((net.minecraft.block.state.IBlockState)(life12_7)).a__ch();
    life11_12 = ((spill4379_0) ? 1 : 0);
    spill4379_1 = ((net.minecraft.block.Block)(life13_11)).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)));
    if (!((life11_12 != 0))) {
        forwardValue4379_26_0 = ((spill4379_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill4379_1))) {
        break forward_join_24;
    }
    p3 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    }
    forwardValue4379_26_0 = ((net.minecraft.item.ItemStack)(p0)).b;
    }
    if (!((life11_12 != 0))) {
        forwardValue4379_36_0 = forwardValue4379_26_0;
        break forward_join_36;
    }
    if (!((forwardValue4379_26_0 == 0))) {
        break forward_join_31;
    }
    return ((0) != 0);
    }
    forwardValue4379_36_0 = ((((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_12 != 0))) {
        forwardValue4379_50_0 = forwardValue4379_36_0;
        break forward_join_50;
    }
    if (!((forwardValue4379_36_0 == 0))) {
        break forward_join_41;
    }
    return ((0) != 0);
    }
    forwardValue4379_50_0 = ((((net.minecraft.world.World)(p2)).a(((net.minecraft.block.Block)(this.n)), ((moom.DT)(p3)), ((boolean)(false)), ((moom.bs)(p4)), ((net.minecraft.entity.Entity)(null)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_12 != 0))) {
        forwardValue4379_187_0 = forwardValue4379_50_0;
        break forward_join_187;
    }
    if (!((forwardValue4379_50_0 != 0))) {
        break forward_join_186;
    }
    life14_73 = ((moom.wU)(this)).a(((int)(((net.minecraft.item.ItemStack)(p0)).c())));
    life15_85 = ((net.minecraft.block.Block)(this.n)).a(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)), ((int)(life14_73)), ((net.minecraft.entity.EntityLivingBase)(p1)));
    spill4379_2 = ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life15_85)), ((int)(3)));
    if (!((life11_12 != 0))) {
        forwardValue4379_185_0 = ((spill4379_2) ? 1 : 0);
        break forward_join_185;
    }
    if (!(spill4379_2)) {
        break forward_join_184;
    }
    life15_100 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    spill4379_3 = ((net.minecraft.block.state.IBlockState)(life15_100)).a__ch();
    if (!((life11_12 != 0))) {
        forwardValue4379_97_0 = spill4379_3;
        break forward_join_97;
    }
    if (!((spill4379_3 == this.n))) {
        break forward_join_103;
    }
    __sourceExactCall_ad1443227f6f4a(((net.minecraft.world.World)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((moom.DT)(p3)), ((net.minecraft.item.ItemStack)(p0)));
    forwardValue4379_97_0 = this.n;
    }
    ((net.minecraft.block.Block)(forwardValue4379_97_0)).a(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life15_100)), ((net.minecraft.entity.EntityLivingBase)(p1)), ((net.minecraft.item.ItemStack)(p0)));
    }
    if (!((((com.moon.o4)(com.moon.o4.a__o4())).b() != __sourceIntrinsic_e8125218b12d_invokedynamic4379_30(21758, (7114261316668623811L ^ life9_3))))) {
        break forward_join_140;
    }
    ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).I)).a(((moom.DT)(__sourceExactCall_85f83ee78344f7(((moom.DT)(p3)), ((double)(0x1.0p-1d)), ((double)(0x1.0p-1d)), ((double)(0x1.0p-1d))))), ((java.lang.String)(((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).c())), ((float)(((((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).a() + 0x1.0p0f) / 0x1.0p1f))), ((float)((((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).b() * 0x1.99999ap-1f))), ((boolean)(false)));
    if (!((life11_12 == 0))) {
        break forward_join_178;
    }
    }
    ((net.minecraft.world.World)(p2)).a(((double)(((double) (((float) ((moom.DT)(p3)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p3)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p3)).c()) + 0x1.0p-1f)))), ((java.lang.String)(((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).c())), ((float)(((((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).a() + 0x1.0p0f) / 0x1.0p1f))), ((float)((((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).b() * 0x1.99999ap-1f))));
    }
    net.minecraft.item.ItemStack __stackOp4379_57_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4379_57_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4379_57_0)).b - 1)));
    }
    forwardValue4379_185_0 = 1;
    }
    return ((forwardValue4379_185_0) != 0);
    }
    forwardValue4379_187_0 = 0;
    }
    return ((forwardValue4379_187_0) != 0);
}


public static boolean a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.item.ItemStack p3) {
int forwardValue4381_40_0;
    int forwardValue4381_48_0;
    int forwardValue4381_52_0;
    int forwardValue4381_102_0;
    boolean spill4381_0;
    boolean spill4381_1;
    boolean spill4381_2;
    boolean spill4381_3;
    boolean spill4381_4;
    long life4_3;
    moom.Bl life7_6;
    int life6_7;
    net.minecraft.tileentity.TileEntity life8_42;
    net.minecraft.nbt.NBTTagCompound life9_86;
    net.minecraft.nbt.NBTTagCompound life10_90;
    net.minecraft.nbt.NBTTagCompound life11_99;
    forward_join_102: {
    forward_join_101: {
    forward_join_53: {
    forward_join_52: {
    forward_join_48: {
    forward_join_40: {
    life4_3 = (moom.wU.q ^ 112049432077542L);
    spill4381_0 = net.minecraft.item.ItemStack.m();
    life7_6 = moom.Bl.a__Bl();
    life6_7 = ((spill4381_0) ? 1 : 0);
    if (!((life7_6 != null))) {
        break forward_join_101;
    }
    spill4381_1 = ((net.minecraft.item.ItemStack)(p3)).e__Boolean();
    if (!((life6_7 != 0))) {
        forwardValue4381_102_0 = ((spill4381_1) ? 1 : 0);
        break forward_join_102;
    }
    if (!(spill4381_1)) {
        break forward_join_101;
    }
    spill4381_2 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p3)).a__yw())).a__Boolean(((java.lang.String)("BlockEntityTag")), ((int)(__sourceIntrinsic_3e620b6940da_invokedynamic4381_7(10729, (52306687001256857L ^ life4_3)))));
    if (!((life6_7 != 0))) {
        forwardValue4381_102_0 = ((spill4381_2) ? 1 : 0);
        break forward_join_102;
    }
    if (!(spill4381_2)) {
        break forward_join_101;
    }
    life8_42 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p2)));
    if (!((life8_42 != null))) {
        break forward_join_101;
    }
    spill4381_3 = ((net.minecraft.world.World)(p0)).G;
    if (!((life6_7 != 0))) {
        forwardValue4381_40_0 = ((spill4381_3) ? 1 : 0);
        break forward_join_40;
    }
    if (!((!spill4381_3))) {
        break forward_join_53;
    }
    forwardValue4381_40_0 = ((((net.minecraft.tileentity.TileEntity)(life8_42)).g__Boolean()) ? 1 : 0);
    }
    if (!((life6_7 != 0))) {
        forwardValue4381_48_0 = forwardValue4381_40_0;
        break forward_join_48;
    }
    if (!((forwardValue4381_40_0 != 0))) {
        break forward_join_53;
    }
    forwardValue4381_48_0 = ((((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(life7_6)).a__BA())).b__Boolean(((com.mojang.authlib.GameProfile)(((net.minecraft.entity.player.EntityPlayer)(p1)).a__sourceReturn_cd99b948a0())))) ? 1 : 0);
    }
    if (!((life6_7 != 0))) {
        forwardValue4381_52_0 = forwardValue4381_48_0;
        break forward_join_52;
    }
    if (!((forwardValue4381_48_0 == 0))) {
        break forward_join_53;
    }
    forwardValue4381_52_0 = 0;
    }
    return ((forwardValue4381_52_0) != 0);
    }
    life9_86 = new net.minecraft.nbt.NBTTagCompound();
    life10_90 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(life9_86)).a__yn()));
    ((net.minecraft.tileentity.TileEntity)(life8_42)).b(((net.minecraft.nbt.NBTTagCompound)(life9_86)));
    life11_99 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p3)).a__yw())).a__yn(((java.lang.String)("BlockEntityTag")))));
    ((net.minecraft.nbt.NBTTagCompound)(life9_86)).a(((net.minecraft.nbt.NBTTagCompound)(life11_99)));
    ((net.minecraft.nbt.NBTTagCompound)(life9_86)).a__Void(((java.lang.String)("x")), ((int)(((moom.DT)(p2)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(life9_86)).a__Void(((java.lang.String)("y")), ((int)(((moom.DT)(p2)).b())));
    ((net.minecraft.nbt.NBTTagCompound)(life9_86)).a__Void(((java.lang.String)("z")), ((int)(((moom.DT)(p2)).c())));
    spill4381_4 = ((net.minecraft.nbt.NBTTagCompound)(life9_86)).equals(((java.lang.Object)(life10_90)));
    if (!((life6_7 != 0))) {
        forwardValue4381_102_0 = ((spill4381_4) ? 1 : 0);
        break forward_join_102;
    }
    if (!((!spill4381_4))) {
        break forward_join_101;
    }
    ((net.minecraft.tileentity.TileEntity)(life8_42)).a__Void(((net.minecraft.nbt.NBTTagCompound)(life9_86)));
    ((net.minecraft.tileentity.TileEntity)(life8_42)).a__Void();
    return ((1) != 0);
    }
    forwardValue4381_102_0 = 0;
    }
    return ((forwardValue4381_102_0) != 0);
}


public moom.wU a__sourceReturn_6a6569f730(java.lang.String p0) {
super.b(((java.lang.String)(p0)));
    return this;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((net.minecraft.block.Block)(this.n)).a(((net.minecraft.item.Item)(p0)), ((net.minecraft.creativetab.CreativeTabs)(p1)), ((java.util.List)(p2)));
    return;
}


public java.lang.String a__String() {
return ((net.minecraft.block.Block)(this.n)).b__String();
}


public net.minecraft.creativetab.CreativeTabs a__q1() {
return ((net.minecraft.block.Block)(this.n)).a__q1();
}


public net.minecraft.block.Block a__ch() {
return this.n;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, net.minecraft.entity.player.EntityPlayer p3, net.minecraft.item.ItemStack p4) {
net.minecraft.block.Block forwardValue4380_21_0;
    int forwardValue4380_40_0;
    boolean spill4380_0;
    net.minecraft.block.Block spill4380_1;
    boolean spill4380_2;
    long life6_3;
    net.minecraft.block.Block life9_9;
    int life8_10;
    forward_join_40: {
    forward_join_31: {
    forward_join_21: {
    forward_join_20: {
    life6_3 = (moom.wU.q ^ 87807496056792L);
    spill4380_0 = net.minecraft.item.ItemStack.m();
    life9_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    life8_10 = ((spill4380_0) ? 1 : 0);
    spill4380_1 = life9_9;
    if (!((life8_10 != 0))) {
        forwardValue4380_21_0 = spill4380_1;
        break forward_join_21;
    }
    if (!((spill4380_1 == net.minecraft.init.Blocks.aH))) {
        break forward_join_20;
    }
    p2 = moom.bs.UP;
    if (!((life8_10 == 0))) {
        break forward_join_31;
    }
    }
    forwardValue4380_21_0 = life9_9;
    }
    spill4380_2 = ((net.minecraft.block.Block)(forwardValue4380_21_0)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life8_10 != 0))) {
        forwardValue4380_40_0 = ((spill4380_2) ? 1 : 0);
        break forward_join_40;
    }
    if (!((!spill4380_2))) {
        break forward_join_31;
    }
    p1 = ((moom.DT)(p1)).a(((moom.bs)(p2)));
    }
    forwardValue4380_40_0 = ((((net.minecraft.world.World)(p0)).a(((net.minecraft.block.Block)(this.n)), ((moom.DT)(p1)), ((boolean)(false)), ((moom.bs)(p2)), ((net.minecraft.entity.Entity)(null)), ((net.minecraft.item.ItemStack)(p4)))) ? 1 : 0);
    }
    return ((forwardValue4380_40_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9554_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8125218b12d_invokedynamic4379_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3e620b6940da_invokedynamic4381_7(int a0, long a1) throws E;

private static native boolean __sourceExactCall_ad1443227f6f4a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.item.ItemStack p3);
private static native moom.DT __sourceExactCall_85f83ee78344f7(moom.DT p0, double p1, double p2, double p3);
}
