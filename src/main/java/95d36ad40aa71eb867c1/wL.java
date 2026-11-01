package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class wL extends moom.wB {

net.minecraft.world.World f;

moom.DT g;

moom.wk h;

private static long i;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

wL(moom.wk p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4, net.minecraft.world.World p5, moom.DT p6) { super((net.minecraft.inventory.IInventory)null, 0, 0, 0); }


private static void __sourceConstructorBody_ba5fd72302d14425(moom.wL receiver, moom.wk p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4, net.minecraft.world.World p5, moom.DT p6) throws Throwable {

((moom.wL)(receiver)).h = ((moom.wk)(p0));

    ((moom.wL)(receiver)).f = ((net.minecraft.world.World)(p5));

    ((moom.wL)(receiver)).g = ((moom.DT)(p6));

    moom.wL.__sourceConstructorInit_ba5fd72302d14425_0(((moom.wL)(receiver)), ((net.minecraft.inventory.IInventory)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)));

    return;

}



static {
i = ((long)(((moom._a)(moom._c.a(((long)(-7567728955508520997L)), ((long)(-8733332206524306680L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257026743000446L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wL.i ^ 111668837605098L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1086_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1086_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1086_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1086_14 = new byte[8];
    (__sourceSpill1086_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1086_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1086_16 = __sourceSpill1086_14;
    ((javax.crypto.Cipher)(__sourceSpill1086_11)).init(((int)(__sourceSpill1086_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1086_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1086_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "<ÛwçdËS0\017ÌÂÙ\002Õ]J4ÐÂÔ\t"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1086_25 = local6_life21;
        int __sourceSpill1086_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1086_25)).substring(((int)(__sourceSpill1086_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1086_30 = local8_life19;
        int __sourceSpill1086_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1086_33 = new byte[8];
        (__sourceSpill1086_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1086_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1086_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1086_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1086_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1086_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1086_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1086_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1086_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1086_34)).doFinal(((byte[])(__sourceSpill1086_33)));
        (__sourceSpill1086_30)[__sourceSpill1086_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_ba5fd72302d14425_0(moom.wL a0, net.minecraft.inventory.IInventory a1, int a2, int a3, int a4) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1AF;
        if (wL.l[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/wL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wL.l[n2] = n3;
        }
        return wL.l[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_60680867002937(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9538_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4364_23_0;
    int forwardValue4364_28_0;
    int forwardValue4364_32_0;
    int forwardValue4364_34_0;
    boolean spill4364_0;
    int spill4364_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_23: {
    forward_join_20: {
    life2_3 = (moom.wL.i ^ 135144395270538L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4364_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_5 == null))) {
        forwardValue4364_23_0 = ((spill4364_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!((!spill4364_0))) {
        break forward_join_20;
    }
    spill4364_1 = ((net.minecraft.entity.player.EntityPlayer)(p0)).b2;
    if (!((life4_5 == null))) {
        forwardValue4364_23_0 = spill4364_1;
        break forward_join_23;
    }
    if (!((spill4364_1 >= ((moom.wk)(this.h)).p))) {
        break forward_join_33;
    }
    }
    forwardValue4364_23_0 = ((moom.wk)(this.h)).p;
    }
    if (!((life4_5 == null))) {
        forwardValue4364_28_0 = forwardValue4364_23_0;
        break forward_join_28;
    }
    if (!((forwardValue4364_23_0 > 0))) {
        break forward_join_33;
    }
    forwardValue4364_28_0 = ((((moom.wL)(this)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4364_32_0 = forwardValue4364_28_0;
        break forward_join_32;
    }
    if (!((forwardValue4364_28_0 != 0))) {
        break forward_join_33;
    }
    forwardValue4364_32_0 = 1;
    }
    forwardValue4364_34_0 = forwardValue4364_32_0;
    break forward_join_34;
    }
    forwardValue4364_34_0 = 0;
    }
    return ((forwardValue4364_34_0) != 0);
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
return ((0) != 0);
}


public void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.item.ItemStack p1) {
int forwardValue4365_29_0;
    net.minecraft.item.ItemStack forwardValue4365_41_0;
    net.minecraft.item.ItemStack forwardValue4365_49_0;
    moom.wk forwardValue4365_74_0;
    int forwardValue4365_154_0;
    int forwardValue4365_173_0;
    net.minecraft.world.World forwardValue4365_176_0;
    boolean spill4365_0;
    moom.wk spill4365_1;
    net.minecraft.item.ItemStack spill4365_2;
    boolean spill4365_3;
    boolean spill4365_4;
    int spill4365_5;
    int spill4365_6;
    net.minecraft.world.World spill4365_7;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.item.ItemStack life6_44;
    net.minecraft.block.state.IBlockState life6_111;
    int life7_159;
    forward_join_185: {
    forward_join_176: {
    forward_join_173: {
    forward_join_168: {
    forward_join_166: {
    forward_join_154: {
    forward_join_143: {
    forward_join_78: {
    forward_join_74: {
    forward_join_72: {
    forward_join_70: {
    forward_join_64: {
    forward_join_49: {
    forward_join_41: {
    forward_join_29: {
    forward_join_18: {
    life3_3 = (moom.wL.i ^ 133216344993703L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4365_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life5_5 == null))) {
        forwardValue4365_29_0 = ((spill4365_0) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill4365_0))) {
        break forward_join_18;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).n(((int)((-((moom.wk)(this.h)).p))));
    }
    ((net.minecraft.inventory.IInventory)(((moom.wk)(this.h)).m)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(null)));
    spill4365_1 = this.h;
    if (!((life5_5 == null))) {
        forwardValue4365_74_0 = spill4365_1;
        break forward_join_74;
    }
    forwardValue4365_29_0 = ((moom.wk)(spill4365_1)).q;
    }
    if (!((forwardValue4365_29_0 > 0))) {
        break forward_join_72;
    }
    life6_44 = ((net.minecraft.inventory.IInventory)(((moom.wk)(this.h)).m)).a__xW(((int)(1)));
    spill4365_2 = life6_44;
    if (!((life5_5 == null))) {
        forwardValue4365_41_0 = spill4365_2;
        break forward_join_41;
    }
    if (!((spill4365_2 != null))) {
        break forward_join_64;
    }
    forwardValue4365_41_0 = life6_44;
    }
    if (!((life5_5 == null))) {
        forwardValue4365_49_0 = forwardValue4365_41_0;
        break forward_join_49;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4365_41_0)).b > ((moom.wk)(this.h)).q))) {
        break forward_join_64;
    }
    forwardValue4365_49_0 = life6_44;
    }
    net.minecraft.item.ItemStack __stackOp4365_19_0 = forwardValue4365_49_0;
    ((net.minecraft.item.ItemStack)(__stackOp4365_19_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4365_19_0)).b - ((moom.wk)(this.h)).q)));
    ((net.minecraft.inventory.IInventory)(((moom.wk)(this.h)).m)).a__Void(((int)(1)), ((net.minecraft.item.ItemStack)(life6_44)));
    if (!((life5_5 != null))) {
        break forward_join_70;
    }
    }
    ((net.minecraft.inventory.IInventory)(((moom.wk)(this.h)).m)).a__Void(((int)(1)), ((net.minecraft.item.ItemStack)(null)));
    }
    if (!((life5_5 != null))) {
        break forward_join_78;
    }
    }
    forwardValue4365_74_0 = this.h;
    }
    ((net.minecraft.inventory.IInventory)(((moom.wk)(forwardValue4365_74_0)).m)).a__Void(((int)(1)), ((net.minecraft.item.ItemStack)(null)));
    }
    ((moom.wk)(this.h)).p = ((int)(0));
    life6_111 = ((net.minecraft.world.World)(this.f)).a__fE(((moom.DT)(this.g)));
    spill4365_3 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life5_5 == null))) {
        forwardValue4365_173_0 = ((spill4365_3) ? 1 : 0);
        break forward_join_173;
    }
    if (!((!spill4365_3))) {
        break forward_join_168;
    }
    spill4365_4 = ((net.minecraft.world.World)(this.f)).G;
    if (!((life5_5 == null))) {
        forwardValue4365_173_0 = ((spill4365_4) ? 1 : 0);
        break forward_join_173;
    }
    if (!((!spill4365_4))) {
        break forward_join_168;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life6_111)).a__ch() == net.minecraft.init.Blocks.bU))) {
        break forward_join_168;
    }
    spill4365_5 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__Random())).nextFloat())), ((float)(0x1.eb851ep-4f)));
    if (!((life5_5 == null))) {
        forwardValue4365_173_0 = spill4365_5;
        break forward_join_173;
    }
    if (!((spill4365_5 < 0))) {
        break forward_join_168;
    }
    life7_159 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life6_111)).a(((net.minecraft.block.properties.IProperty)(moom.dv.S))))))).intValue();
    life7_159 += 1;
    spill4365_6 = life7_159;
    if (!((life5_5 == null))) {
        forwardValue4365_154_0 = spill4365_6;
        break forward_join_154;
    }
    if (!((spill4365_6 > 2))) {
        break forward_join_143;
    }
    ((net.minecraft.world.World)(this.f)).d__Boolean(((moom.DT)(this.g)));
    ((net.minecraft.world.World)(this.f)).b(((int)(__sourceIntrinsic_f16a6f918830_invokedynamic4365_57(1535, (3265262920464368121L ^ life3_3)))), ((moom.DT)(this.g)), ((int)(0)));
    if (!((life5_5 != null))) {
        break forward_join_166;
    }
    }
    forwardValue4365_154_0 = ((((net.minecraft.world.World)(this.f)).a(((moom.DT)(this.g)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life6_111)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dv.S)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life7_159)))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4365_154_0);
    ((net.minecraft.world.World)(this.f)).b(((int)(__sourceIntrinsic_f16a6f918830_invokedynamic4365_69(2625, (6393741452403707462L ^ life3_3)))), ((moom.DT)(this.g)), ((int)(0)));
    }
    if (!((life5_5 != null))) {
        break forward_join_185;
    }
    }
    spill4365_7 = this.f;
    if (!((life5_5 == null))) {
        forwardValue4365_176_0 = spill4365_7;
        break forward_join_176;
    }
    forwardValue4365_173_0 = ((((net.minecraft.world.World)(spill4365_7)).G) ? 1 : 0);
    }
    if (!((forwardValue4365_173_0 == 0))) {
        break forward_join_185;
    }
    forwardValue4365_176_0 = this.f;
    }
    ((net.minecraft.world.World)(forwardValue4365_176_0)).b(((int)(__sourceIntrinsic_f16a6f918830_invokedynamic4365_76(9231, (4668055230769504266L ^ life3_3)))), ((moom.DT)(this.g)), ((int)(0)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9538_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f16a6f918830_invokedynamic4365_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f16a6f918830_invokedynamic4365_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f16a6f918830_invokedynamic4365_76(int a0, long a1) throws E;

private static native int __sourceExactCall_60680867002937(int p0, long p1);
}
