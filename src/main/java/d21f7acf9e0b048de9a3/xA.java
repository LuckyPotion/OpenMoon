package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xA extends net.minecraft.item.ItemMapBase {

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

protected xA() {
super();
    (this).a(true);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-8247951721358041592L)), ((long)(2023937050813125176L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261925527150022L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xA.n ^ 98275299146091L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1670_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1670_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1670_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1670_14 = new byte[8];
    (__sourceSpill1670_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1670_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1670_16 = __sourceSpill1670_14;
    ((javax.crypto.Cipher)(__sourceSpill1670_11)).init(((int)(__sourceSpill1670_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1670_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1670_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[14];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "À£$VhÑouS\"'\000CX _ÅøD\r[ª¼\005'ë2ðë\bý\021\033µî%\033Ö§\021ñ\013ê¢¢¡*¨¡Í¿]¢OM¸ëý/êoìÃÅW2\"R\r+\024ËÊôÿè:\020o¨»!aR"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1670_25 = local6_life21;
        int __sourceSpill1670_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1670_25)).substring(((int)(__sourceSpill1670_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1670_30 = local8_life19;
        int __sourceSpill1670_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1670_33 = new byte[8];
        (__sourceSpill1670_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1670_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1670_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1670_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1670_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1670_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1670_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1670_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1670_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1670_34)).doFinal(((byte[])(__sourceSpill1670_33)));
        (__sourceSpill1670_30)[__sourceSpill1670_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "~\023º÷\016Øm'Q®FêÇ0"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1670_38 = local6_life21;
        int __sourceSpill1670_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1670_38)).substring(((int)(__sourceSpill1670_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1670_43 = local8_life19;
        int __sourceSpill1670_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1670_46 = new byte[8];
        (__sourceSpill1670_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1670_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1670_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1670_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1670_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1670_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1670_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1670_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1670_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1670_47)).doFinal(((byte[])(__sourceSpill1670_46)));
        (__sourceSpill1670_43)[__sourceSpill1670_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[14]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9673_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2143;
        if (p[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/xA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xA.p[n2] = n3;
        }
        return p[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xA.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.world.storage.MapData a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1) {
int forwardValue4474_32_0;
    net.minecraft.world.storage.MapData forwardValue4474_71_0;
    boolean spill4474_0;
    net.minecraft.world.storage.MapData spill4474_1;
    boolean spill4474_2;
    long life3_3;
    java.lang.String life6_8;
    net.minecraft.world.storage.MapData life7_14;
    int life5_15;
    java.lang.String life6_45;
    forward_join_71: {
    forward_join_70: {
    forward_join_32: {
    life3_3 = (moom.xA.n ^ 101607240839528L);
    spill4474_0 = net.minecraft.item.ItemStack.l();
    life6_8 = __sourceIntrinsic_c0a84654501c_invokedynamic4474_3(((net.minecraft.item.ItemStack)(p0)).c());
    life7_14 = ((net.minecraft.world.storage.MapData)(((net.minecraft.world.World)(p1)).a(((java.lang.Class)(net.minecraft.world.storage.MapData.class)), ((java.lang.String)(life6_8)))));
    life5_15 = ((spill4474_0) ? 1 : 0);
    spill4474_1 = life7_14;
    if (!((life5_15 == 0))) {
        forwardValue4474_71_0 = spill4474_1;
        break forward_join_71;
    }
    if (!((spill4474_1 == null))) {
        break forward_join_70;
    }
    spill4474_2 = ((net.minecraft.world.World)(p1)).G;
    if (!((life5_15 == 0))) {
        forwardValue4474_32_0 = ((spill4474_2) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill4474_2))) {
        break forward_join_70;
    }
    ((net.minecraft.item.ItemStack)(p0)).a__Void(((int)(((net.minecraft.world.World)(p1)).a(((java.lang.String)("map"))))));
    forwardValue4474_32_0 = ((net.minecraft.item.ItemStack)(p0)).c();
    }
    life6_45 = __sourceIntrinsic_c0a84654501c_invokedynamic4474_13(forwardValue4474_32_0);
    life7_14 = new net.minecraft.world.storage.MapData(life6_45);
    ((net.minecraft.world.storage.MapData)(life7_14)).f = ((byte)(__sourceIntrinsic_c0a84654501c_invokedynamic4474_14(18881, (5504747715618360377L ^ life3_3))));
    ((net.minecraft.world.storage.MapData)(life7_14)).a(((double)(((double) ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(p1)).a__IX())).a__Int()))), ((double)(((double) ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(p1)).a__IX())).c__Int()))), ((int)(((net.minecraft.world.storage.MapData)(life7_14)).f)));
    ((net.minecraft.world.storage.MapData)(life7_14)).e = ((byte)(((byte) ((moom.EA)(((net.minecraft.world.World)(p1)).v)).b())));
    ((net.minecraft.world.storage.MapData)(life7_14)).a();
    ((net.minecraft.world.World)(p1)).a(((java.lang.String)(life6_45)), ((net.minecraft.world.WorldSavedData)(life7_14)));
    }
    forwardValue4474_71_0 = life7_14;
    }
    return forwardValue4474_71_0;
}


public static net.minecraft.world.storage.MapData a(int p0, net.minecraft.world.World p1) {
net.minecraft.world.storage.MapData forwardValue4473_29_0;
    boolean spill4473_0;
    net.minecraft.world.storage.MapData spill4473_1;
    long life2_3;
    java.lang.String life5_7;
    int life4_8;
    net.minecraft.world.storage.MapData life6_14;
    forward_join_29: {
    forward_join_28: {
    life2_3 = (moom.xA.n ^ 10816198436008L);
    spill4473_0 = net.minecraft.item.ItemStack.m();
    life5_7 = __sourceIntrinsic_794d454a8d60_invokedynamic4473_2(p0);
    life4_8 = ((spill4473_0) ? 1 : 0);
    life6_14 = ((net.minecraft.world.storage.MapData)(((net.minecraft.world.World)(p1)).a(((java.lang.Class)(net.minecraft.world.storage.MapData.class)), ((java.lang.String)(life5_7)))));
    spill4473_1 = life6_14;
    if (!((life4_8 != 0))) {
        forwardValue4473_29_0 = spill4473_1;
        break forward_join_29;
    }
    if (!((spill4473_1 == null))) {
        break forward_join_28;
    }
    life6_14 = new net.minecraft.world.storage.MapData(life5_7);
    ((net.minecraft.world.World)(p1)).a(((java.lang.String)(life5_7)), ((net.minecraft.world.WorldSavedData)(life6_14)));
    }
    forwardValue4473_29_0 = life6_14;
    }
    return forwardValue4473_29_0;
}


public void a__Void(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue4477_15_0;
    net.minecraft.world.storage.MapData forwardValue4477_68_0;
    boolean spill4477_0;
    net.minecraft.world.storage.MapData spill4477_1;
    long life4_3;
    int life6_5;
    net.minecraft.world.storage.MapData life7_26;
    net.minecraft.world.storage.MapData life8_38;
    forward_join_75: {
    forward_join_68: {
    forward_join_53: {
    forward_join_15: {
    life4_3 = (moom.xA.n ^ 75616290195079L);
    life6_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4477_0 = ((net.minecraft.item.ItemStack)(p0)).e__Boolean();
    if (!((life6_5 == 0))) {
        forwardValue4477_15_0 = ((spill4477_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill4477_0)) {
        break forward_join_75;
    }
    forwardValue4477_15_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p0)).a__yw())).b__Boolean(((java.lang.String)("map_is_scaling")))) ? 1 : 0);
    }
    if (!((forwardValue4477_15_0 != 0))) {
        break forward_join_75;
    }
    life7_26 = ((moom.xA)(net.minecraft.init.Items.a3)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p1)));
    ((net.minecraft.item.ItemStack)(p0)).a__Void(((int)(((net.minecraft.world.World)(p1)).a(((java.lang.String)("map"))))));
    life8_38 = new net.minecraft.world.storage.MapData(__sourceIntrinsic_9f3210dc01f6_invokedynamic4477_13(((net.minecraft.item.ItemStack)(p0)).c()));
    ((net.minecraft.world.storage.MapData)(life8_38)).f = ((byte)(((byte) (((net.minecraft.world.storage.MapData)(life7_26)).f + 1))));
    spill4477_1 = life8_38;
    if (!((life6_5 == 0))) {
        forwardValue4477_68_0 = spill4477_1;
        break forward_join_68;
    }
    if (!((((net.minecraft.world.storage.MapData)(spill4477_1)).f > 4))) {
        break forward_join_53;
    }
    ((net.minecraft.world.storage.MapData)(life8_38)).f = ((byte)(__sourceIntrinsic_9f3210dc01f6_invokedynamic4477_17(20346, (4232567693824933221L ^ life4_3))));
    }
    ((net.minecraft.world.storage.MapData)(life8_38)).a(((double)(((double) ((net.minecraft.world.storage.MapData)(life7_26)).c))), ((double)(((double) ((net.minecraft.world.storage.MapData)(life7_26)).d))), ((int)(((net.minecraft.world.storage.MapData)(life8_38)).f)));
    ((net.minecraft.world.storage.MapData)(life8_38)).e = ((byte)(((net.minecraft.world.storage.MapData)(life7_26)).e));
    forwardValue4477_68_0 = life8_38;
    }
    ((net.minecraft.world.storage.MapData)(forwardValue4477_68_0)).a();
    ((net.minecraft.world.World)(p1)).a(((java.lang.String)(__sourceIntrinsic_9f3210dc01f6_invokedynamic4477_27(((net.minecraft.item.ItemStack)(p0)).c()))), ((net.minecraft.world.WorldSavedData)(life8_38)));
    }
    return;
}


public moom.yK a__sourceReturn_5511132723(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
return ((net.minecraft.world.storage.MapData)(((moom.xA)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p1))))).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)));
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.Entity p2, int p3, boolean p4) {
int forwardValue4475_27_0;
    int spill4475_0;
    long life6_3;
    int life8_5;
    net.minecraft.world.storage.MapData life9_13;
    net.minecraft.entity.player.EntityPlayer life10_24;
    forward_join_33: {
    forward_join_27: {
    forward_join_26: {
    life6_3 = (moom.xA.n ^ 5653675990081L);
    life8_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((!((net.minecraft.world.World)(p1)).G))) {
        break forward_join_33;
    }
    life9_13 = ((moom.xA)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p1)));
    spill4475_0 = ((p2 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life8_5 != 0))) {
        forwardValue4475_27_0 = spill4475_0;
        break forward_join_27;
    }
    if (!((spill4475_0 != 0))) {
        break forward_join_26;
    }
    life10_24 = ((net.minecraft.entity.player.EntityPlayer)(p2));
    ((net.minecraft.world.storage.MapData)(life9_13)).a(((net.minecraft.entity.player.EntityPlayer)(life10_24)), ((net.minecraft.item.ItemStack)(p0)));
    }
    forwardValue4475_27_0 = ((p4) ? 1 : 0);
    }
    if (!((forwardValue4475_27_0 != 0))) {
        break forward_join_33;
    }
    ((moom.xA)(this)).a(((net.minecraft.world.World)(p1)), ((net.minecraft.entity.Entity)(p2)), ((net.minecraft.world.storage.MapData)(life9_13)));
    }
    return;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List<java.lang.String> p2, boolean p3) {
long life5_3;
    net.minecraft.world.storage.MapData life8_10;
    int life7_11;
    forward_join_36: {
    forward_join_22: {
    life5_3 = (moom.xA.n ^ 10488707412500L);
    boolean spill5098_0 = net.minecraft.item.ItemStack.m();
    life8_10 = ((moom.xA)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(p1)).i)));
    life7_11 = ((spill5098_0) ? 1 : 0);
    if (!(p3)) { break forward_join_36; }
    if (!((life8_10 == null))) { break forward_join_22; }
    ((java.util.List)(p2)).add(((java.lang.Object)("Unknown map")));
    if (!((life7_11 == 0))) { break forward_join_36; }
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic5098_7((1 << ((net.minecraft.world.storage.MapData)(life8_10)).f)))));
    ((java.util.List)(p2)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic5098_10(((net.minecraft.world.storage.MapData)(life8_10)).f))));
    }
    return;
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, net.minecraft.world.storage.MapData p2) {
int forestValue519_16_0;
    int forestValue519_23_0;
    int forestValue519_77_0;
    int forestValue519_98_0;
    int forestValue519_125_0;
    int forestValue519_146_0;
    int forestValue519_156_0;
    int forestValue519_156_1;
    int forestValue519_165_0;
    int forestValue519_165_1;
    int forestValue519_170_0;
    int forestValue519_170_1;
    int forestValue519_194_0;
    int forestValue519_196_0;
    int forestValue519_276_0;
    int forestValue519_338_0;
    int forestValue519_351_0;
    int forestValue519_351_1;
    int forestValue519_400_0;
    int forestValue519_409_0;
    int forestValue519_411_0;
    int forestValue519_465_0;
    int forestValue519_477_0;
    int forestValue519_513_0;
    int forestValue519_517_0;
    int forestValue519_556_0;
    int forestValue519_566_0;
    int forestValue519_581_0;
    int forestValue519_604_0;
    int spill519_0;
    boolean spill519_1;
    int spill519_2;
    int spill519_3;
    int spill519_4;
    int spill519_5;
    int spill519_6;
    boolean spill519_7;
    int spill519_8;
    int spill519_9;
    int spill519_10;
    int spill519_11;
    int spill519_12;
    int spill519_13;
    boolean spill519_14;
    boolean spill519_15;
    int spill519_16;
    int spill519_17;
    int spill519_18;
    int spill519_19;
    long life4_3;
    int life6_5;
    int life7_31;
    int life8_34;
    int life9_37;
    int life10_52;
    int life11_67;
    int life12_75;
    moom.IN life13_95;
    int life14_103;
    int life15_109;
    double life16_151;
    int life18_157;
    int life19_214;
    int life20_218;
    int life21_244;
    int life22_258;
    int life23_272;
    com.google.common.collect.HashMultiset life24_274;
    net.minecraft.world.chunk.Chunk life25_283;
    int life26_299;
    int life27_307;
    int life28_309;
    double life29_311;
    int life31_331;
    int life31_349;
    moom.DU life31_409;
    int life32_411;
    int life33_422;
    int life34_438;
    net.minecraft.block.state.IBlockState life35_441;
    int life36_509;
    net.minecraft.block.Block life37_521;
    int life28_575;
    double life31_597;
    int life33_599;
    moom.fm life34_631;
    double life31_653;
    int life35_741;
    int life36_749;
    forest_join_643: {
    forest_join_78: {
    forest_join_77: {
    forest_join_23: {
    forest_join_16: {
    life4_3 = (moom.xA.n ^ 72664641240727L);
    life6_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill519_0 = ((moom.EA)(((net.minecraft.world.World)(p0)).v)).b();
    if (!((life6_5 == 0))) {
        forestValue519_16_0 = spill519_0;
        break forest_join_16;
    }
    if (!((spill519_0 == ((net.minecraft.world.storage.MapData)(p2)).e))) {
        break forest_join_643;
    }
    forestValue519_16_0 = ((p1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life6_5 == 0))) {
        forestValue519_23_0 = forestValue519_16_0;
        break forest_join_23;
    }
    if (!((forestValue519_16_0 != 0))) {
        break forest_join_643;
    }
    forestValue519_23_0 = (1 << ((net.minecraft.world.storage.MapData)(p2)).f);
    }
    life7_31 = forestValue519_23_0;
    life8_34 = ((net.minecraft.world.storage.MapData)(p2)).c;
    life9_37 = ((net.minecraft.world.storage.MapData)(p2)).d;
    life10_52 = ((moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(p1)).n - ((double) life8_34))))) / life7_31) + __sourceIntrinsic_987705a1fc40_invokedynamic519_12(32621, (348224188389668197L ^ life4_3)));
    life11_67 = ((moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(p1)).p - ((double) life9_37))))) / life7_31) + __sourceIntrinsic_987705a1fc40_invokedynamic519_15(23340, (5450501369730273578L ^ life4_3)));
    life12_75 = (__sourceIntrinsic_987705a1fc40_invokedynamic519_16(1311, (3427707084261871380L ^ life4_3)) / life7_31);
    spill519_1 = ((moom.EA)(((net.minecraft.world.World)(p0)).v)).e();
    if (!((life6_5 == 0))) {
        forestValue519_77_0 = ((spill519_1) ? 1 : 0);
        break forest_join_77;
    }
    if (!(spill519_1)) {
        break forest_join_78;
    }
    forestValue519_77_0 = (life12_75 / 2);
    }
    life12_75 = forestValue519_77_0;
    }
    life13_95 = ((net.minecraft.world.storage.MapData)(p2)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p1)))));
    moom.IN __stackOp519_22_0 = life13_95;
    ((moom.IN)(__stackOp519_22_0)).h = ((int)((((moom.IN)(__stackOp519_22_0)).h + 1)));
    life14_103 = 0;
    life15_109 = ((life10_52 - life12_75) + 1);
    forest_cycle_97: while (true) {
    forest_join_640: {
    forestValue519_98_0 = life15_109;
    forest_cycle_98: while (true) {
    forest_join_125: {
    forest_join_124: {
    if (!((forestValue519_98_0 < (life10_52 + life12_75)))) {
        break forest_join_643;
    }
    spill519_2 = (life15_109 & __sourceIntrinsic_987705a1fc40_invokedynamic519_25(6164, (9145880172631872017L ^ life4_3)));
    if (!((life6_5 == 0))) {
        forestValue519_125_0 = spill519_2;
        break forest_join_125;
    }
    if (!((spill519_2 != (((moom.IN)(life13_95)).h & __sourceIntrinsic_987705a1fc40_invokedynamic519_27(24525, (7846399212617504192L ^ life4_3)))))) {
        break forest_join_124;
    }
    spill519_3 = life14_103;
    if (!((life6_5 == 0))) {
        forestValue519_125_0 = spill519_3;
        break forest_join_125;
    }
    if (!((spill519_3 != 0))) {
        break forest_join_640;
    }
    }
    forestValue519_125_0 = 0;
    }
    life14_103 = forestValue519_125_0;
    life16_151 = 0x0.0p0d;
    life18_157 = ((life11_67 - life12_75) - 1);
    forest_cycle_134: while (true) {
    forest_join_638: {
    forest_join_637: {
    forest_join_604: {
    forest_join_592: {
    forest_join_581: {
    forest_join_566: {
    forest_join_563: {
    forest_join_561: {
    forest_join_556: {
    forest_join_553: {
    forest_join_518: {
    forest_join_517: {
    forest_join_513: {
    forest_join_510: {
    forest_join_477: {
    forest_join_472: {
    forest_join_343: {
    forest_join_339: {
    forest_join_338: {
    forest_join_324: {
    forest_join_276: {
    forest_join_196: {
    forest_join_195: {
    forest_join_194: {
    forest_join_170: {
    forest_join_165: {
    forest_join_156: {
    forest_join_146: {
    if (!((life18_157 < (life11_67 + life12_75)))) {
        break forest_join_640;
    }
    spill519_4 = life15_109;
    if (!((life6_5 == 0))) {
        forestValue519_98_0 = spill519_4;
        continue forest_cycle_98;
    }
    if (!((life6_5 == 0))) {
        forestValue519_146_0 = spill519_4;
        break forest_join_146;
    }
    if (!((spill519_4 >= 0))) {
        break forest_join_637;
    }
    forestValue519_146_0 = life18_157;
    }
    spill519_5 = -1;
    if (!((life6_5 == 0))) {
        forestValue519_156_0 = forestValue519_146_0;
        forestValue519_156_1 = spill519_5;
        break forest_join_156;
    }
    if (!((forestValue519_146_0 >= spill519_5))) {
        break forest_join_637;
    }
    forestValue519_156_0 = life15_109;
    forestValue519_156_1 = __sourceIntrinsic_987705a1fc40_invokedynamic519_28(8351, (6932518147240979089L ^ life4_3));
    }
    if (!((life6_5 == 0))) {
        forestValue519_165_0 = forestValue519_156_0;
        forestValue519_165_1 = forestValue519_156_1;
        break forest_join_165;
    }
    if (!((forestValue519_156_0 < forestValue519_156_1))) {
        break forest_join_637;
    }
    forestValue519_165_0 = life18_157;
    forestValue519_165_1 = __sourceIntrinsic_987705a1fc40_invokedynamic519_29(8351, (6932518147240979089L ^ life4_3));
    }
    if (!((life6_5 == 0))) {
        forestValue519_170_0 = forestValue519_165_0;
        forestValue519_170_1 = forestValue519_165_1;
        break forest_join_170;
    }
    if (!((forestValue519_165_0 < forestValue519_165_1))) {
        break forest_join_637;
    }
    forestValue519_170_0 = life15_109;
    forestValue519_170_1 = life10_52;
    }
    life19_214 = (forestValue519_170_0 - forestValue519_170_1);
    life20_218 = (life18_157 - life11_67);
    spill519_6 = ((life19_214 * life19_214) + (life20_218 * life20_218));
    if (!((life6_5 == 0))) {
        forestValue519_194_0 = spill519_6;
        break forest_join_194;
    }
    if (!((spill519_6 > ((life12_75 - 2) * (life12_75 - 2))))) {
        break forest_join_195;
    }
    forestValue519_194_0 = 1;
    }
    forestValue519_196_0 = forestValue519_194_0;
    break forest_join_196;
    }
    forestValue519_196_0 = 0;
    }
    life21_244 = forestValue519_196_0;
    life22_258 = ((((life8_34 / life7_31) + life15_109) - __sourceIntrinsic_987705a1fc40_invokedynamic519_30(23340, (5450501369730273578L ^ life4_3))) * life7_31);
    life23_272 = ((((life9_37 / life7_31) + life18_157) - __sourceIntrinsic_987705a1fc40_invokedynamic519_31(23340, (5450501369730273578L ^ life4_3))) * life7_31);
    life24_274 = com.google.common.collect.HashMultiset.create();
    life25_283 = ((net.minecraft.world.World)(p0)).a__Fk(((moom.DT)(new moom.DT(life22_258, 0, life23_272))));
    if (!((life6_5 == 0))) {
        break forest_join_638;
    }
    if (!((!((net.minecraft.world.chunk.Chunk)(life25_283)).a__Boolean()))) {
        break forest_join_637;
    }
    life26_299 = (life22_258 & __sourceIntrinsic_987705a1fc40_invokedynamic519_35(24525, (7846399212617504192L ^ life4_3)));
    life27_307 = (life23_272 & __sourceIntrinsic_987705a1fc40_invokedynamic519_36(24525, (7846399212617504192L ^ life4_3)));
    life28_309 = 0;
    life29_311 = 0x0.0p0d;
    spill519_7 = ((moom.EA)(((net.minecraft.world.World)(p0)).v)).e();
    if (!((life6_5 == 0))) {
        forestValue519_276_0 = ((spill519_7) ? 1 : 0);
        break forest_join_276;
    }
    if (!(spill519_7)) {
        break forest_join_343;
    }
    forestValue519_276_0 = (life22_258 + (life23_272 * __sourceIntrinsic_987705a1fc40_invokedynamic519_40(28469, (4619152351072855356L ^ life4_3))));
    }
    life31_331 = forestValue519_276_0;
    life31_349 = (((life31_331 * life31_331) * __sourceIntrinsic_987705a1fc40_invokedynamic519_41(5700, (8922745276839451716L ^ life4_3))) + (life31_331 * __sourceIntrinsic_987705a1fc40_invokedynamic519_42(3419, (8662056960665470815L ^ life4_3))));
    spill519_8 = ((life31_349 >> __sourceIntrinsic_987705a1fc40_invokedynamic519_43(12258, (4796864721635239406L ^ life4_3))) & 1);
    if (!((life6_5 == 0))) {
        forestValue519_338_0 = spill519_8;
        break forest_join_338;
    }
    if (!((spill519_8 == 0))) {
        break forest_join_324;
    }
    ((com.google.common.collect.Multiset)(life24_274)).add(((java.lang.Object)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fm(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.DIRT)))))))), ((int)(__sourceIntrinsic_987705a1fc40_invokedynamic519_51(31592, (3967715042014179682L ^ life4_3)))));
    if (!((life6_5 != 0))) {
        break forest_join_339;
    }
    }
    forestValue519_338_0 = ((com.google.common.collect.Multiset)(life24_274)).add(((java.lang.Object)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fm(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ex.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockStone$EnumType.STONE)))))))), ((int)(__sourceIntrinsic_987705a1fc40_invokedynamic519_60(27741, (288672332400371292L ^ life4_3)))));
    }
    recovery.source.CarrierOps.discard(forestValue519_338_0);
    }
    life29_311 = 0x1.9p6d;
    if (!((life6_5 != 0))) {
        break forest_join_472;
    }
    }
    life31_409 = new moom.DU();
    life32_411 = 0;
    forest_cycle_349: while (true) {
    forest_join_469: {
    forestValue519_351_0 = life32_411;
    forestValue519_351_1 = life7_31;
    forest_cycle_351: while (true) {
    if (!((forestValue519_351_0 < forestValue519_351_1))) {
        break forest_join_472;
    }
    spill519_9 = 0;
    if (!((life6_5 == 0))) {
        forestValue519_477_0 = spill519_9;
        break forest_join_477;
    }
    life33_422 = spill519_9;
    forest_cycle_356: while (true) {
    forest_join_465: {
    forest_join_449: {
    forest_join_411: {
    if (!((life33_422 < life7_31))) {
        break forest_join_469;
    }
    life34_438 = (((net.minecraft.world.chunk.Chunk)(life25_283)).a(((int)((life32_411 + life26_299))), ((int)((life33_422 + life27_307)))) + 1);
    life35_441 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    spill519_10 = life34_438;
    if (!((life6_5 == 0))) {
        forestValue519_465_0 = spill519_10;
        break forest_join_465;
    }
    spill519_11 = 1;
    if (!((life6_5 == 0))) {
        forestValue519_351_0 = spill519_10;
        forestValue519_351_1 = spill519_11;
        continue forest_cycle_351;
    }
    if (!((spill519_10 > spill519_11))) {
        break forest_join_449;
    }
    forest_cycle_380: while (true) {
    forest_join_405: {
    life34_438 += -1;
    life35_441 = ((net.minecraft.world.chunk.Chunk)(life25_283)).a__fE(((moom.DT)(((moom.DU)(life31_409)).a(((int)((life32_411 + life26_299))), ((int)(life34_438)), ((int)((life33_422 + life27_307)))))));
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life35_441)).a__ch())).a__fm(((net.minecraft.block.state.IBlockState)(life35_441))) == moom.fm.b))) {
        break forest_join_405;
    }
    forestValue519_400_0 = life34_438;
    forest_cycle_400: while (true) {
    if (!((forestValue519_400_0 <= 0))) {
        continue forest_cycle_380;
    }
    spill519_12 = life34_438;
    if (!((life6_5 == 0))) {
        forestValue519_400_0 = spill519_12;
        continue forest_cycle_400;
    }
    break forest_cycle_400;
    }
    forestValue519_411_0 = spill519_12;
    break forest_join_411;
    }
    forest_cycle_405: while (true) {
    forest_join_409: {
    spill519_13 = life34_438;
    if (!((life6_5 == 0))) {
        forestValue519_409_0 = spill519_13;
        break forest_join_409;
    }
    forestValue519_411_0 = spill519_13;
    break forest_join_411;
    }
    if (!((forestValue519_409_0 <= 0))) {
        continue forest_cycle_380;
    }
    continue forest_cycle_405;
    }
    }
    }
    if (!((life6_5 == 0))) {
        forestValue519_465_0 = forestValue519_411_0;
        break forest_join_465;
    }
    if (!((forestValue519_411_0 > 0))) {
        break forest_join_449;
    }
    spill519_14 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life35_441)).a__ch())).a__fn())).a__Boolean();
    if (!((life6_5 == 0))) {
        forestValue519_465_0 = ((spill519_14) ? 1 : 0);
        break forest_join_465;
    }
    if (!(spill519_14)) {
        break forest_join_449;
    }
    life36_509 = (life34_438 - 1);
    forest_cycle_425: while (true) {
    forest_join_447: {
    life37_521 = ((net.minecraft.world.chunk.Chunk)(life25_283)).b__ch(((int)((life32_411 + life26_299))), ((int)((life36_509--))), ((int)((life33_422 + life27_307))));
    life28_309 += 1;
    if (!((life36_509 > 0))) {
        break forest_join_449;
    }
    spill519_15 = ((moom.fn)(((net.minecraft.block.Block)(life37_521)).a__fn())).a__Boolean();
    if (!((life6_5 == 0))) {
        forestValue519_465_0 = ((spill519_15) ? 1 : 0);
        break forest_join_465;
    }
    if (!((!spill519_15))) {
        break forest_join_447;
    }
    if (!((life6_5 != 0))) {
        break forest_join_449;
    }
    }
    if (!((life6_5 != 0))) {
        continue forest_cycle_425;
    }
    break forest_cycle_425;
    }
    }
    life29_311 = (life29_311 + (((double) life34_438) / ((double) (life7_31 * life7_31))));
    forestValue519_465_0 = ((((com.google.common.collect.Multiset)(life24_274)).add(((java.lang.Object)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life35_441)).a__ch())).a__fm(((net.minecraft.block.state.IBlockState)(life35_441))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue519_465_0);
    life33_422 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_356;
    }
    break forest_cycle_356;
    }
    break forest_cycle_351;
    }
    }
    life32_411 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_349;
    }
    break forest_cycle_349;
    }
    }
    forestValue519_477_0 = (life28_309 / (life7_31 * life7_31));
    }
    life28_575 = forestValue519_477_0;
    life31_597 = ((((life29_311 - life16_151) * 0x1.0p2d) / ((double) (life7_31 + 4))) + ((((double) ((life15_109 + life18_157) & 1)) - 0x1.0p-1d) * 0x1.999999999999ap-2d));
    life33_599 = 1;
    spill519_16 = recovery.source.CarrierOps.dcmpl(((double)(life31_597)), ((double)(0x1.3333333333333p-1d)));
    if (!((life6_5 == 0))) {
        forestValue519_513_0 = spill519_16;
        break forest_join_513;
    }
    if (!((spill519_16 > 0))) {
        break forest_join_510;
    }
    life33_599 = 2;
    }
    forestValue519_513_0 = recovery.source.CarrierOps.dcmpg(((double)(life31_597)), ((double)(-0x1.3333333333333p-1d)));
    }
    if (!((life6_5 == 0))) {
        forestValue519_517_0 = forestValue519_513_0;
        break forest_join_517;
    }
    if (!((forestValue519_513_0 < 0))) {
        break forest_join_518;
    }
    forestValue519_517_0 = 0;
    }
    life33_599 = forestValue519_517_0;
    }
    life34_631 = ((moom.fm)(com.google.common.collect.Iterables.getFirst(((java.lang.Iterable)(com.google.common.collect.Multisets.copyHighestCountFirst(((com.google.common.collect.Multiset)(life24_274))))), ((java.lang.Object)(moom.fm.b)))));
    if (!((life6_5 == 0))) {
        break forest_join_563;
    }
    if (!((life34_631 == moom.fm.n))) {
        break forest_join_561;
    }
    life31_653 = ((((double) life28_575) * 0x1.999999999999ap-4d) + (((double) ((life15_109 + life18_157) & 1)) * 0x1.999999999999ap-3d));
    life33_599 = 1;
    spill519_17 = recovery.source.CarrierOps.dcmpg(((double)(life31_653)), ((double)(0x1.0p-1d)));
    if (!((life6_5 == 0))) {
        forestValue519_556_0 = spill519_17;
        break forest_join_556;
    }
    if (!((spill519_17 < 0))) {
        break forest_join_553;
    }
    life33_599 = 2;
    }
    forestValue519_556_0 = recovery.source.CarrierOps.dcmpl(((double)(life31_653)), ((double)(0x1.ccccccccccccdp-1d)));
    }
    if (!((life6_5 == 0))) {
        forestValue519_566_0 = forestValue519_556_0;
        break forest_join_566;
    }
    if (!((forestValue519_556_0 > 0))) {
        break forest_join_561;
    }
    life33_599 = 0;
    }
    life16_151 = life29_311;
    }
    if (!((life6_5 == 0))) {
        break forest_join_638;
    }
    forestValue519_566_0 = life18_157;
    }
    if (!((forestValue519_566_0 >= 0))) {
        break forest_join_637;
    }
    spill519_18 = ((life19_214 * life19_214) + (life20_218 * life20_218));
    if (!((life6_5 == 0))) {
        forestValue519_581_0 = spill519_18;
        break forest_join_581;
    }
    if (!((spill519_18 < (life12_75 * life12_75)))) {
        break forest_join_637;
    }
    forestValue519_581_0 = life21_244;
    }
    if (!((life6_5 == 0))) {
        forestValue519_604_0 = forestValue519_581_0;
        break forest_join_604;
    }
    if (!((forestValue519_581_0 != 0))) {
        break forest_join_592;
    }
    spill519_19 = ((life15_109 + life18_157) & 1);
    if (!((life6_5 == 0))) {
        forestValue519_604_0 = spill519_19;
        break forest_join_604;
    }
    if (!((spill519_19 != 0))) {
        break forest_join_637;
    }
    }
    forestValue519_604_0 = ((int)((((net.minecraft.world.storage.MapData)(p2)).g)[(life15_109 + (life18_157 * __sourceIntrinsic_987705a1fc40_invokedynamic519_94(8351, (6932518147240979089L ^ life4_3))))]));
    }
    life35_741 = forestValue519_604_0;
    life36_749 = ((byte) ((((moom.fm)(life34_631)).M * 4) + life33_599));
    if (!((life6_5 == 0))) {
        break forest_join_638;
    }
    if (!((life35_741 != life36_749))) {
        break forest_join_637;
    }
    (((net.minecraft.world.storage.MapData)(p2)).g)[(life15_109 + (life18_157 * __sourceIntrinsic_987705a1fc40_invokedynamic519_98(8351, (6932518147240979089L ^ life4_3))))] = ((byte)(life36_749));
    ((net.minecraft.world.storage.MapData)(p2)).a(((int)(life15_109)), ((int)(life18_157)));
    life14_103 = 1;
    }
    life18_157 += 1;
    }
    if (!((life6_5 != 0))) {
        continue forest_cycle_134;
    }
    break forest_cycle_134;
    }
    break forest_cycle_98;
    }
    }
    life15_109 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_97;
    }
    break forest_cycle_97;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_794d454a8d60_invokedynamic4473_2(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic5098_7(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic5098_10(byte a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0a84654501c_invokedynamic4474_3(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0a84654501c_invokedynamic4474_13(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a84654501c_invokedynamic4474_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_987705a1fc40_invokedynamic519_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9f3210dc01f6_invokedynamic4477_13(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f3210dc01f6_invokedynamic4477_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9f3210dc01f6_invokedynamic4477_27(int a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9673_0() throws E;
}
