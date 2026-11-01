package net.minecraft.entity.player;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class InventoryPlayer implements net.minecraft.inventory.IInventory {

public net.minecraft.item.ItemStack[] a;

public net.minecraft.item.ItemStack[] b;

public int c;

public net.minecraft.entity.player.EntityPlayer d;

private net.minecraft.item.ItemStack e;

public boolean f;

private static boolean g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public InventoryPlayer(net.minecraft.entity.player.EntityPlayer p0) { super(); }

private static void __sourceConstructorBody_512c959274d329ae(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
long local2 = (net.minecraft.entity.player.InventoryPlayer.h ^ 117731435368787L);
    net.minecraft.entity.player.InventoryPlayer.__sourceConstructorInit_512c959274d329ae_0(((net.minecraft.entity.player.InventoryPlayer)(receiver)));
    ((net.minecraft.entity.player.InventoryPlayer)(receiver)).a = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[__sourceIntrinsic_512c959274d329ae_originalDynamicSite3897_2(21341, (265502410625415046L ^ local2))]));
    ((net.minecraft.entity.player.InventoryPlayer)(receiver)).b = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[4]));
    ((net.minecraft.entity.player.InventoryPlayer)(receiver)).d = ((net.minecraft.entity.player.EntityPlayer)(p0));
    return;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-7283050973568310932L)), ((long)(1930028657993760605L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272575854474280L)))));
    int __sourceSpill1889_6 = 1;
    k = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.entity.player.InventoryPlayer.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1889_6))));
    long local0_life9 = (net.minecraft.entity.player.InventoryPlayer.h ^ 57529825486341L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1889_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1889_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1889_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1889_16 = new byte[8];
    (__sourceSpill1889_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1889_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1889_18 = __sourceSpill1889_16;
    ((javax.crypto.Cipher)(__sourceSpill1889_13)).init(((int)(__sourceSpill1889_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1889_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1889_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[10];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "4\023\021xGí\023<U0\004õ¶ÈõYÊUÛÏ¾>m´0{$×/\0309L¥Û~¡ü\036\031ü\020È\023N\022&6±\005C»<Ä5"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1889_27 = local6_life23;
        int __sourceSpill1889_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1889_27)).substring(((int)(__sourceSpill1889_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1889_32 = local8_life21;
        int __sourceSpill1889_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1889_35 = new byte[8];
        (__sourceSpill1889_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1889_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1889_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1889_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1889_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1889_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1889_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1889_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1889_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1889_36)).doFinal(((byte[])(__sourceSpill1889_35)));
        (__sourceSpill1889_32)[__sourceSpill1889_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "Æb½Ë\017©l&DK¸EÑ=ÍB"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1889_40 = local6_life23;
        int __sourceSpill1889_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1889_40)).substring(((int)(__sourceSpill1889_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1889_45 = local8_life21;
        int __sourceSpill1889_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1889_48 = new byte[8];
        (__sourceSpill1889_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1889_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1889_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1889_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1889_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1889_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1889_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1889_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1889_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1889_49)).doFinal(((byte[])(__sourceSpill1889_48)));
        (__sourceSpill1889_45)[__sourceSpill1889_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    i = ((long[])(local8_life21));
    j = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> void __sourceConstructorInit_512c959274d329ae_0(net.minecraft.entity.player.InventoryPlayer a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_22638a6ad0c8e724ff13(net.minecraft.entity.player.InventoryPlayer a0, float a1) throws E;
private static final class __SourceHandler_22638a6ad0c8e724ff13 {

public static void f595(net.minecraft.entity.player.InventoryPlayer receiver, float p0) throws Throwable {
    int lexicalValue595_19_0;
    net.minecraft.item.ItemStack lexicalValue595_36_0;
    int lexicalValue595_57_0;
    boolean spill595_0;
    int spill595_1;
    net.minecraft.item.ItemStack spill595_2;
    int spill595_3;
    long life2_3;
    float life1_8;
    int life4_9;
    int life5_22;
    lexical_join_66: {
    lexical_join_19: {
    lexical_join_18: {
    life2_3 = (__fieldRead595_0() ^ 41683770199840L);
    spill595_0 = __call595_1();
    life1_8 = (p0 / 0x1.0p2f);
    life4_9 = __integerCategory595_2(spill595_0);
    spill595_1 = __numericCompare595_3(life1_8, 0x1.0p0f);
    if (!((life4_9 != 0))) {
        lexicalValue595_19_0 = spill595_1;
        break lexical_join_19;
    }
    if (!((spill595_1 < 0))) {
        break lexical_join_18;
    }
    life1_8 = 0x1.0p0f;
    }
    lexicalValue595_19_0 = 0;
    }
    life5_22 = lexicalValue595_19_0;
    lexical_cycle_20: while (true) {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_57: {
    lexical_join_36: {
    if (!((life5_22 < (__fieldRead595_4(receiver)).length))) {
        break lexical_join_66;
    }
    spill595_2 = (__fieldRead595_5(receiver))[life5_22];
    if (!((life4_9 != 0))) {
        lexicalValue595_36_0 = spill595_2;
        break lexical_join_36;
    }
    if (!((spill595_2 != null))) {
        break lexical_join_63;
    }
    lexicalValue595_36_0 = (__fieldRead595_6(receiver))[life5_22];
    }
    spill595_3 = __instanceOf595_8(__call595_7(lexicalValue595_36_0));
    if (!((life4_9 != 0))) {
        lexicalValue595_57_0 = spill595_3;
        break lexical_join_57;
    }
    if (!((spill595_3 != 0))) {
        break lexical_join_63;
    }
    __call595_11((__fieldRead595_9(receiver))[life5_22], ((int) life1_8), __fieldRead595_10(receiver));
    if (!((life4_9 != 0))) {
        break lexical_join_64;
    }
    lexicalValue595_57_0 = __fieldRead595_13((__fieldRead595_12(receiver))[life5_22]);
    }
    if (!((lexicalValue595_57_0 == 0))) {
        break lexical_join_63;
    }
    (__fieldRead595_14(receiver))[life5_22] = null;
    }
    life5_22 += 1;
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return;
}
public static void h595_0(moom.Oo p0) throws Throwable {
    throw __call2059500_0(p0);
}
public static void h595_1(moom.Oo p0) throws Throwable {
    throw __call2059501_0(p0);
}
public static void h595_2(moom.Oo p0) throws Throwable {
    throw __call2059502_0(p0);
}
public static void h595_3(moom.Oo p0) throws Throwable {
    throw __call2059503_0(p0);
}
public static void h595_4(moom.Oo p0) throws Throwable {
    throw __call2059504_0(p0);
}
public static void h595_5(moom.Oo p0) throws Throwable {
    throw __call2059505_0(p0);
}
public static void h595_6(moom.Oo p0) throws Throwable {
    throw __call2059506_0(p0);
}
private static native long __fieldRead595_0() throws Throwable;
private static native boolean __call595_1() throws Throwable;
private static native int __integerCategory595_2(boolean value) throws Throwable;
private static native int __numericCompare595_3(float a0, float a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead595_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead595_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead595_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.Item __call595_7(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __instanceOf595_8(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead595_9(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead595_10(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call595_11(net.minecraft.item.ItemStack a0, int a1, net.minecraft.entity.player.EntityPlayer a2) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead595_12(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead595_13(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead595_14(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call2059500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2059506_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceHandlerCall_1722712a7694bb62e0d9(net.minecraft.entity.player.InventoryPlayer a0, int a1, int a2) throws E;
private static final class __SourceHandler_1722712a7694bb62e0d9 {

public static net.minecraft.item.ItemStack f1575(net.minecraft.entity.player.InventoryPlayer receiver, int p0, int p1) throws Throwable {
    int forwardValue1575_16_0;
    int forwardValue1575_29_0;
    int forwardValue1575_29_1;
    net.minecraft.item.ItemStack forwardValue1575_40_0;
    net.minecraft.item.ItemStack forwardValue1575_60_0;
    net.minecraft.item.ItemStack forwardValue1575_73_0;
    boolean spill1575_0;
    int spill1575_1;
    int spill1575_2;
    net.minecraft.item.ItemStack spill1575_3;
    net.minecraft.item.ItemStack spill1575_4;
    long life3_3;
    net.minecraft.item.ItemStack[] life6_7;
    int life5_8;
    net.minecraft.item.ItemStack life7_65;
    net.minecraft.item.ItemStack life7_77;
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_60: {
    forward_join_55: {
    forward_join_40: {
    forward_join_31: {
    forward_join_29: {
    forward_join_16: {
    forward_join_15: {
    life3_3 = (__fieldRead1575_0() ^ 135609554498356L);
    spill1575_0 = __call1575_1();
    life6_7 = __fieldRead1575_2(receiver);
    life5_8 = __integerCategory1575_3(spill1575_0);
    spill1575_1 = p0;
    if (!((life5_8 != 0))) {
        forwardValue1575_16_0 = spill1575_1;
        break forward_join_16;
    }
    if (!((spill1575_1 < 0))) {
        break forward_join_15;
    }
    return null;
    }
    forwardValue1575_16_0 = p0;
    }
    spill1575_2 = (__fieldRead1575_4(receiver)).length;
    if (!((life5_8 != 0))) {
        forwardValue1575_29_0 = forwardValue1575_16_0;
        forwardValue1575_29_1 = spill1575_2;
        break forward_join_29;
    }
    if (!((forwardValue1575_16_0 >= spill1575_2))) {
        break forward_join_31;
    }
    life6_7 = __fieldRead1575_5(receiver);
    forwardValue1575_29_0 = p0;
    forwardValue1575_29_1 = (__fieldRead1575_6(receiver)).length;
    }
    p0 = (forwardValue1575_29_0 - forwardValue1575_29_1);
    }
    spill1575_3 = (life6_7)[p0];
    if (!((life5_8 != 0))) {
        forwardValue1575_40_0 = spill1575_3;
        break forward_join_40;
    }
    if (!((spill1575_3 != null))) {
        break forward_join_74;
    }
    forwardValue1575_40_0 = (life6_7)[p0];
    }
    if (!((life5_8 != 0))) {
        forwardValue1575_60_0 = forwardValue1575_40_0;
        break forward_join_60;
    }
    if (!((__fieldRead1575_7(forwardValue1575_40_0) <= p1))) {
        break forward_join_55;
    }
    life7_65 = (life6_7)[p0];
    (life6_7)[p0] = null;
    return life7_65;
    }
    forwardValue1575_60_0 = __call1575_8((life6_7)[p0], p1);
    }
    life7_77 = forwardValue1575_60_0;
    spill1575_4 = (life6_7)[p0];
    if (!((life5_8 != 0))) {
        forwardValue1575_73_0 = spill1575_4;
        break forward_join_73;
    }
    if (!((__fieldRead1575_9(spill1575_4) == 0))) {
        break forward_join_72;
    }
    (life6_7)[p0] = null;
    }
    forwardValue1575_73_0 = life7_77;
    }
    return forwardValue1575_73_0;
    }
    return null;
}
public static void h1575_0(moom.Oo p0) throws Throwable {
    throw __call1157500_0(p0);
}
public static void h1575_1(moom.Oo p0) throws Throwable {
    throw __call1157501_0(p0);
}
public static void h1575_2(moom.Oo p0) throws Throwable {
    throw __call1157502_0(p0);
}
public static void h1575_3(moom.Oo p0) throws Throwable {
    throw __call1157503_0(p0);
}
public static void h1575_4(moom.Oo p0) throws Throwable {
    throw __call1157504_0(p0);
}
public static void h1575_5(moom.Oo p0) throws Throwable {
    throw __call1157505_0(p0);
}
public static void h1575_6(moom.Oo p0) throws Throwable {
    throw __call1157506_0(p0);
}
public static void h1575_7(moom.Oo p0) throws Throwable {
    throw __call1157507_0(p0);
}
private static native long __fieldRead1575_0() throws Throwable;
private static native boolean __call1575_1() throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1575_2(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __integerCategory1575_3(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1575_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1575_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1575_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1575_7(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1575_8(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native int __fieldRead1575_9(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.Throwable __call1157500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157507_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_e34f49d5570ff678f585(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.block.Block a1, int a2) throws E;
private static final class __SourceHandler_e34f49d5570ff678f585 {

public static float f2835(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.block.Block p0, int p1) throws Throwable {
    long life3_3;
    float life5_5;
    life3_3 = (__fieldRead2835_0() ^ 97147131507477L);
    life5_5 = 0x1.0p0f;
    if ((p1 < 0)) {
        return life5_5;
    }
    if (((__fieldRead2835_1(receiver))[p1] != null)) {
        life5_5 = (life5_5 * __call2835_3((__fieldRead2835_2(receiver))[p1], p0));
    }
    return life5_5;
}
public static void h2835_0(moom.Oo p0) throws Throwable {
    throw __call1283500_0(p0);
}
private static native long __fieldRead2835_0() throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead2835_1(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead2835_2(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native float __call2835_3(net.minecraft.item.ItemStack a0, net.minecraft.block.Block a1) throws Throwable;
private static native java.lang.Throwable __call1283500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0b2f1d997bfd8e5cc93b(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.entity.player.EntityPlayer a1) throws E;
private static final class __SourceHandler_0b2f1d997bfd8e5cc93b {

public static boolean f1576(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
    int forwardValue1576_18_0;
    int forwardValue1576_22_0;
    int forwardValue1576_24_0;
    boolean spill1576_0;
    long life2_3;
    int life4_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life2_3 = (__fieldRead1576_0() ^ 44464252785032L);
    life4_5 = __integerCategory1576_2(__call1576_1());
    spill1576_0 = __fieldRead1576_4(__fieldRead1576_3(receiver));
    if (!((life4_5 != 0))) {
        forwardValue1576_18_0 = __integerCategory1576_5(spill1576_0);
        break forward_join_18;
    }
    if (!((!spill1576_0))) {
        break forward_join_23;
    }
    forwardValue1576_18_0 = __numericCompare1576_8(__call1576_7(p0, __fieldRead1576_6(receiver)), 0x1.0p6d);
    }
    if (!((life4_5 != 0))) {
        forwardValue1576_22_0 = forwardValue1576_18_0;
        break forward_join_22;
    }
    if (!((forwardValue1576_18_0 <= 0))) {
        break forward_join_23;
    }
    forwardValue1576_22_0 = 1;
    }
    forwardValue1576_24_0 = forwardValue1576_22_0;
    break forward_join_24;
    }
    forwardValue1576_24_0 = 0;
    }
    return __integerCategory1576_9(forwardValue1576_24_0);
}
public static void h1576_0(moom.Oo p0) throws Throwable {
    throw __call1157600_0(p0);
}
public static void h1576_1(moom.Oo p0) throws Throwable {
    throw __call1157601_0(p0);
}
public static void h1576_2(moom.Oo p0) throws Throwable {
    throw __call1157602_0(p0);
}
private static native long __fieldRead1576_0() throws Throwable;
private static native boolean __call1576_1() throws Throwable;
private static native int __integerCategory1576_2(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead1576_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __fieldRead1576_4(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __integerCategory1576_5(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead1576_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native double __call1576_7(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native int __numericCompare1576_8(double a0, double a1) throws Throwable;
private static native boolean __integerCategory1576_9(int value) throws Throwable;
private static native java.lang.Throwable __call1157600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c23a06bc3214e2817280(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.entity.player.InventoryPlayer a1) throws E;
private static final class __SourceHandler_c23a06bc3214e2817280 {

public static void f1577(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.entity.player.InventoryPlayer p0) throws Throwable {
    boolean spill1577_0;
    long life2_3;
    int life5_6;
    int life4_7;
    lexical_join_52: {
    lexical_join_48: {
    lexical_join_29: {
    lexical_join_27: {
    life2_3 = (__fieldRead1577_0() ^ 62029822228337L);
    spill1577_0 = __call1577_1();
    life5_6 = 0;
    life4_7 = __integerCategory1577_2(spill1577_0);
    lexical_cycle_8: while (true) {
    if (!((life5_6 < (__fieldRead1577_3(receiver)).length))) {
        break lexical_join_27;
    }
    (__fieldRead1577_4(receiver))[life5_6] = __call1577_6((__fieldRead1577_5(p0))[life5_6]);
    life5_6 += 1;
    if (!((life4_7 != 0))) {
        break lexical_join_29;
    }
    if (!((life4_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    life5_6 = 0;
    }
    lexical_cycle_29: while (true) {
    if (!((life5_6 < (__fieldRead1577_7(receiver)).length))) {
        break lexical_join_48;
    }
    (__fieldRead1577_8(receiver))[life5_6] = __call1577_10((__fieldRead1577_9(p0))[life5_6]);
    life5_6 += 1;
    if (!((life4_7 != 0))) {
        break lexical_join_52;
    }
    if (!((life4_7 == 0))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    __fieldWrite1577_12(receiver, __fieldRead1577_11(p0));
    }
    return;
}
public static void h1577_0(moom.Oo p0) throws Throwable {
    throw __call1157700_0(p0);
}
public static void h1577_1(moom.Oo p0) throws Throwable {
    throw __call1157701_0(p0);
}
public static void h1577_2(moom.Oo p0) throws Throwable {
    throw __call1157702_0(p0);
}
private static native long __fieldRead1577_0() throws Throwable;
private static native boolean __call1577_1() throws Throwable;
private static native int __integerCategory1577_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1577_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1577_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1577_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1577_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1577_7(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1577_8(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1577_9(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call1577_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead1577_11(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __fieldWrite1577_12(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1157700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157702_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_9d59db0ef32548d15a53(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1) throws E;
private static final class __SourceHandler_9d59db0ef32548d15a53 {

public static int f1578(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.Item p0) throws Throwable {
    net.minecraft.item.ItemStack lexicalValue1578_24_0;
    boolean spill1578_0;
    net.minecraft.item.ItemStack spill1578_1;
    long life2_3;
    int life5_6;
    int life4_7;
    lexical_join_32: {
    life2_3 = (__fieldRead1578_0() ^ 126143987349812L);
    spill1578_0 = __call1578_1();
    life5_6 = 0;
    life4_7 = __integerCategory1578_2(spill1578_0);
    lexical_cycle_8: while (true) {
    lexical_join_29: {
    lexical_join_24: {
    if (!((life5_6 < (__fieldRead1578_3(receiver)).length))) {
        break lexical_join_32;
    }
    spill1578_1 = (__fieldRead1578_4(receiver))[life5_6];
    if (!((life4_7 == 0))) {
        lexicalValue1578_24_0 = spill1578_1;
        break lexical_join_24;
    }
    if (!((spill1578_1 != null))) {
        break lexical_join_29;
    }
    lexicalValue1578_24_0 = (__fieldRead1578_5(receiver))[life5_6];
    }
    if (!((__call1578_6(lexicalValue1578_24_0) == p0))) {
        break lexical_join_29;
    }
    return life5_6;
    }
    life5_6 += 1;
    if (!((life4_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return -1;
}
public static void h1578_0(moom.Oo p0) throws Throwable {
    throw __call1157800_0(p0);
}
public static void h1578_1(moom.Oo p0) throws Throwable {
    throw __call1157801_0(p0);
}
public static void h1578_2(moom.Oo p0) throws Throwable {
    throw __call1157802_0(p0);
}
private static native long __fieldRead1578_0() throws Throwable;
private static native boolean __call1578_1() throws Throwable;
private static native int __integerCategory1578_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1578_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1578_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1578_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.Item __call1578_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.Throwable __call1157800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_82d3c14ee4da7bead121(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1, int a2) throws E;
private static final class __SourceHandler_82d3c14ee4da7bead121 {

public static int f1579(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.Item p0, int p1) throws Throwable {
    net.minecraft.item.ItemStack lexicalValue1579_24_0;
    net.minecraft.item.ItemStack lexicalValue1579_33_0;
    int lexicalValue1579_39_0;
    boolean spill1579_0;
    net.minecraft.item.ItemStack spill1579_1;
    int spill1579_2;
    long life3_3;
    int life6_6;
    int life5_7;
    lexical_join_43: {
    life3_3 = (__fieldRead1579_0() ^ 101270651105375L);
    spill1579_0 = __call1579_1();
    life6_6 = 0;
    life5_7 = __integerCategory1579_2(spill1579_0);
    lexical_cycle_8: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_33: {
    lexical_join_24: {
    if (!((life6_6 < (__fieldRead1579_3(receiver)).length))) {
        break lexical_join_43;
    }
    spill1579_1 = (__fieldRead1579_4(receiver))[life6_6];
    if (!((life5_7 == 0))) {
        lexicalValue1579_24_0 = spill1579_1;
        break lexical_join_24;
    }
    if (!((spill1579_1 != null))) {
        break lexical_join_40;
    }
    lexicalValue1579_24_0 = (__fieldRead1579_5(receiver))[life6_6];
    }
    if (!((life5_7 == 0))) {
        lexicalValue1579_33_0 = lexicalValue1579_24_0;
        break lexical_join_33;
    }
    if (!((__call1579_6(lexicalValue1579_24_0) == p0))) {
        break lexical_join_40;
    }
    lexicalValue1579_33_0 = (__fieldRead1579_7(receiver))[life6_6];
    }
    spill1579_2 = __call1579_8(lexicalValue1579_33_0);
    if (!((life5_7 == 0))) {
        lexicalValue1579_39_0 = spill1579_2;
        break lexical_join_39;
    }
    if (!((spill1579_2 == p1))) {
        break lexical_join_40;
    }
    lexicalValue1579_39_0 = life6_6;
    }
    return lexicalValue1579_39_0;
    }
    life6_6 += 1;
    if (!((life5_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return -1;
}
public static void h1579_0(moom.Oo p0) throws Throwable {
    throw __call1157900_0(p0);
}
public static void h1579_1(moom.Oo p0) throws Throwable {
    throw __call1157901_0(p0);
}
public static void h1579_2(moom.Oo p0) throws Throwable {
    throw __call1157902_0(p0);
}
public static void h1579_3(moom.Oo p0) throws Throwable {
    throw __call1157903_0(p0);
}
public static void h1579_4(moom.Oo p0) throws Throwable {
    throw __call1157904_0(p0);
}
public static void h1579_5(moom.Oo p0) throws Throwable {
    throw __call1157905_0(p0);
}
private static native long __fieldRead1579_0() throws Throwable;
private static native boolean __call1579_1() throws Throwable;
private static native int __integerCategory1579_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1579_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1579_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1579_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.Item __call1579_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1579_7(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call1579_8(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.Throwable __call1157900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1157905_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_0a0b89bed65c0fb9d23d(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1, int a2, int a3, net.minecraft.nbt.NBTTagCompound a4) throws E;
private static final class __SourceHandler_0a0b89bed65c0fb9d23d {

public static int f257(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.Item p0, int p1, int p2, net.minecraft.nbt.NBTTagCompound p3) throws Throwable {
    net.minecraft.item.Item lexicalValue257_32_0;
    int lexicalValue257_42_0;
    int lexicalValue257_42_1;
    net.minecraft.nbt.NBTTagCompound lexicalValue257_48_0;
    int lexicalValue257_56_0;
    int lexicalValue257_65_0;
    int lexicalValue257_68_0;
    int lexicalValue257_100_0;
    int lexicalValue257_104_0;
    int lexicalValue257_109_0;
    net.minecraft.item.Item lexicalValue257_137_0;
    int lexicalValue257_147_0;
    int lexicalValue257_147_1;
    net.minecraft.nbt.NBTTagCompound lexicalValue257_153_0;
    int lexicalValue257_161_0;
    int lexicalValue257_170_0;
    int lexicalValue257_173_0;
    int lexicalValue257_205_0;
    int lexicalValue257_209_0;
    int lexicalValue257_214_0;
    net.minecraft.item.ItemStack lexicalValue257_220_0;
    net.minecraft.item.Item lexicalValue257_228_0;
    int lexicalValue257_243_0;
    int lexicalValue257_243_1;
    int lexicalValue257_245_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue257_251_0;
    int lexicalValue257_262_0;
    int lexicalValue257_272_0;
    int lexicalValue257_276_0;
    int lexicalValue257_302_0;
    int lexicalValue257_313_0;
    boolean spill257_0;
    net.minecraft.item.ItemStack spill257_1;
    net.minecraft.item.Item spill257_2;
    int spill257_3;
    int spill257_4;
    net.minecraft.nbt.NBTTagCompound spill257_5;
    boolean spill257_6;
    int spill257_7;
    net.minecraft.item.ItemStack spill257_8;
    net.minecraft.item.Item spill257_9;
    int spill257_10;
    int spill257_11;
    net.minecraft.nbt.NBTTagCompound spill257_12;
    boolean spill257_13;
    int spill257_14;
    net.minecraft.item.Item spill257_15;
    int spill257_16;
    int spill257_17;
    int spill257_18;
    net.minecraft.nbt.NBTTagCompound spill257_19;
    boolean spill257_20;
    int spill257_21;
    int spill257_22;
    int spill257_23;
    long life5_3;
    int life8_6;
    int life9_8;
    int life7_9;
    net.minecraft.item.ItemStack life10_19;
    int life11_106;
    int life9_173;
    net.minecraft.item.ItemStack life10_183;
    int life11_270;
    int life9_427;
    lexical_join_313: {
    lexical_join_312: {
    lexical_join_302: {
    lexical_join_301: {
    lexical_join_276: {
    lexical_join_272: {
    lexical_join_269: {
    lexical_join_262: {
    lexical_join_261: {
    lexical_join_251: {
    lexical_join_246: {
    lexical_join_245: {
    lexical_join_243: {
    lexical_join_232: {
    lexical_join_228: {
    lexical_join_220: {
    lexical_join_218: {
    lexical_join_113: {
    life5_3 = (__fieldRead257_0() ^ 20933641467475L);
    spill257_0 = __call257_1();
    life8_6 = 0;
    life9_8 = 0;
    life7_9 = __integerCategory257_2(spill257_0);
    lexical_cycle_10: while (true) {
    lexical_join_111: {
    lexical_join_110: {
    lexical_join_109: {
    lexical_join_104: {
    lexical_join_100: {
    lexical_join_99: {
    lexical_join_68: {
    lexical_join_65: {
    lexical_join_62: {
    lexical_join_56: {
    lexical_join_55: {
    lexical_join_48: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_34: {
    lexical_join_32: {
    if (!((life9_8 < (__fieldRead257_3(receiver)).length))) {
        break lexical_join_113;
    }
    life10_19 = (__fieldRead257_4(receiver))[life9_8];
    if (!((life7_9 != 0))) {
        break lexical_join_111;
    }
    spill257_1 = life10_19;
    if (!((life7_9 != 0))) {
        lexicalValue257_220_0 = spill257_1;
        break lexical_join_220;
    }
    if (!((spill257_1 != null))) {
        break lexical_join_110;
    }
    spill257_2 = p0;
    if (!((life7_9 != 0))) {
        lexicalValue257_32_0 = spill257_2;
        break lexical_join_32;
    }
    if (!((spill257_2 != null))) {
        break lexical_join_34;
    }
    lexicalValue257_32_0 = __call257_5(life10_19);
    }
    if (!((lexicalValue257_32_0 == p0))) {
        break lexical_join_110;
    }
    }
    spill257_3 = p1;
    spill257_4 = -1;
    if (!((life7_9 != 0))) {
        lexicalValue257_42_0 = spill257_3;
        lexicalValue257_42_1 = spill257_4;
        break lexical_join_42;
    }
    if (!((spill257_3 > spill257_4))) {
        break lexical_join_43;
    }
    lexicalValue257_42_0 = __call257_6(life10_19);
    lexicalValue257_42_1 = p1;
    }
    if (!((lexicalValue257_42_0 == lexicalValue257_42_1))) {
        break lexical_join_110;
    }
    }
    spill257_5 = p3;
    if (!((life7_9 != 0))) {
        lexicalValue257_48_0 = spill257_5;
        break lexical_join_48;
    }
    if (!((spill257_5 != null))) {
        break lexical_join_55;
    }
    lexicalValue257_48_0 = p3;
    }
    spill257_6 = __call257_8(lexicalValue257_48_0, __call257_7(life10_19), 1);
    if (!((life7_9 != 0))) {
        lexicalValue257_56_0 = __integerCategory257_9(spill257_6);
        break lexical_join_56;
    }
    if (!(spill257_6)) {
        break lexical_join_110;
    }
    }
    lexicalValue257_56_0 = p2;
    }
    if (!((life7_9 != 0))) {
        lexicalValue257_65_0 = lexicalValue257_56_0;
        break lexical_join_65;
    }
    if (!((lexicalValue257_56_0 <= 0))) {
        break lexical_join_62;
    }
    lexicalValue257_68_0 = __fieldRead257_10(life10_19);
    break lexical_join_68;
    }
    lexicalValue257_65_0 = (p2 - life8_6);
    }
    lexicalValue257_68_0 = __call257_12(lexicalValue257_65_0, __fieldRead257_11(life10_19));
    }
    life11_106 = lexicalValue257_68_0;
    life8_6 = (life8_6 + life11_106);
    if (!((life7_9 != 0))) {
        break lexical_join_111;
    }
    if (!((p2 != 0))) {
        break lexical_join_110;
    }
    net.minecraft.item.ItemStack __stackOp257_14_0 = (__fieldRead257_13(receiver))[life9_8];
    __fieldWrite257_16(__stackOp257_14_0, (__fieldRead257_15(__stackOp257_14_0) - life11_106));
    spill257_7 = __fieldRead257_18((__fieldRead257_17(receiver))[life9_8]);
    if (!((life7_9 != 0))) {
        lexicalValue257_100_0 = spill257_7;
        break lexical_join_100;
    }
    if (!((spill257_7 == 0))) {
        break lexical_join_99;
    }
    (__fieldRead257_19(receiver))[life9_8] = null;
    }
    lexicalValue257_100_0 = p2;
    }
    if (!((life7_9 != 0))) {
        lexicalValue257_104_0 = lexicalValue257_100_0;
        break lexical_join_104;
    }
    if (!((lexicalValue257_100_0 > 0))) {
        break lexical_join_110;
    }
    lexicalValue257_104_0 = life8_6;
    }
    if (!((life7_9 != 0))) {
        lexicalValue257_109_0 = lexicalValue257_104_0;
        break lexical_join_109;
    }
    if (!((lexicalValue257_104_0 >= p2))) {
        break lexical_join_110;
    }
    lexicalValue257_109_0 = life8_6;
    }
    return lexicalValue257_109_0;
    }
    life9_8 += 1;
    }
    if (!((life7_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    life9_173 = 0;
    lexical_cycle_115: while (true) {
    lexical_join_216: {
    lexical_join_215: {
    lexical_join_214: {
    lexical_join_209: {
    lexical_join_205: {
    lexical_join_204: {
    lexical_join_173: {
    lexical_join_170: {
    lexical_join_167: {
    lexical_join_161: {
    lexical_join_160: {
    lexical_join_153: {
    lexical_join_148: {
    lexical_join_147: {
    lexical_join_139: {
    lexical_join_137: {
    if (!((life9_173 < (__fieldRead257_20(receiver)).length))) {
        break lexical_join_218;
    }
    life10_183 = (__fieldRead257_21(receiver))[life9_173];
    if (!((life7_9 != 0))) {
        break lexical_join_216;
    }
    spill257_8 = life10_183;
    if (!((life7_9 != 0))) {
        lexicalValue257_220_0 = spill257_8;
        break lexical_join_220;
    }
    if (!((spill257_8 != null))) {
        break lexical_join_215;
    }
    spill257_9 = p0;
    if (!((life7_9 != 0))) {
        lexicalValue257_137_0 = spill257_9;
        break lexical_join_137;
    }
    if (!((spill257_9 != null))) {
        break lexical_join_139;
    }
    lexicalValue257_137_0 = __call257_22(life10_183);
    }
    if (!((lexicalValue257_137_0 == p0))) {
        break lexical_join_215;
    }
    }
    spill257_10 = p1;
    spill257_11 = -1;
    if (!((life7_9 != 0))) {
        lexicalValue257_147_0 = spill257_10;
        lexicalValue257_147_1 = spill257_11;
        break lexical_join_147;
    }
    if (!((spill257_10 > spill257_11))) {
        break lexical_join_148;
    }
    lexicalValue257_147_0 = __call257_23(life10_183);
    lexicalValue257_147_1 = p1;
    }
    if (!((lexicalValue257_147_0 == lexicalValue257_147_1))) {
        break lexical_join_215;
    }
    }
    spill257_12 = p3;
    if (!((life7_9 != 0))) {
        lexicalValue257_153_0 = spill257_12;
        break lexical_join_153;
    }
    if (!((spill257_12 != null))) {
        break lexical_join_160;
    }
    lexicalValue257_153_0 = p3;
    }
    spill257_13 = __call257_25(lexicalValue257_153_0, __call257_24(life10_183), 0);
    if (!((life7_9 != 0))) {
        lexicalValue257_161_0 = __integerCategory257_26(spill257_13);
        break lexical_join_161;
    }
    if (!(spill257_13)) {
        break lexical_join_215;
    }
    }
    lexicalValue257_161_0 = p2;
    }
    if (!((life7_9 != 0))) {
        lexicalValue257_170_0 = lexicalValue257_161_0;
        break lexical_join_170;
    }
    if (!((lexicalValue257_161_0 <= 0))) {
        break lexical_join_167;
    }
    lexicalValue257_173_0 = __fieldRead257_27(life10_183);
    break lexical_join_173;
    }
    lexicalValue257_170_0 = (p2 - life8_6);
    }
    lexicalValue257_173_0 = __call257_29(lexicalValue257_170_0, __fieldRead257_28(life10_183));
    }
    life11_270 = lexicalValue257_173_0;
    life8_6 = (life8_6 + life11_270);
    if (!((life7_9 != 0))) {
        break lexical_join_216;
    }
    if (!((p2 != 0))) {
        break lexical_join_215;
    }
    net.minecraft.item.ItemStack __stackOp257_31_0 = (__fieldRead257_30(receiver))[life9_173];
    __fieldWrite257_33(__stackOp257_31_0, (__fieldRead257_32(__stackOp257_31_0) - life11_270));
    spill257_14 = __fieldRead257_35((__fieldRead257_34(receiver))[life9_173]);
    if (!((life7_9 != 0))) {
        lexicalValue257_205_0 = spill257_14;
        break lexical_join_205;
    }
    if (!((spill257_14 == 0))) {
        break lexical_join_204;
    }
    (__fieldRead257_36(receiver))[life9_173] = null;
    }
    lexicalValue257_205_0 = p2;
    }
    if (!((life7_9 != 0))) {
        lexicalValue257_209_0 = lexicalValue257_205_0;
        break lexical_join_209;
    }
    if (!((lexicalValue257_205_0 > 0))) {
        break lexical_join_215;
    }
    lexicalValue257_209_0 = life8_6;
    }
    if (!((life7_9 != 0))) {
        lexicalValue257_214_0 = lexicalValue257_209_0;
        break lexical_join_214;
    }
    if (!((lexicalValue257_209_0 >= p2))) {
        break lexical_join_215;
    }
    lexicalValue257_214_0 = life8_6;
    }
    return lexicalValue257_214_0;
    }
    life9_173 += 1;
    }
    if (!((life7_9 == 0))) { continue lexical_cycle_115; }
    break lexical_cycle_115;
    }
    }
    lexicalValue257_220_0 = __fieldRead257_37(receiver);
    }
    if (!((lexicalValue257_220_0 != null))) {
        break lexical_join_312;
    }
    spill257_15 = p0;
    if (!((life7_9 != 0))) {
        lexicalValue257_228_0 = spill257_15;
        break lexical_join_228;
    }
    if (!((spill257_15 != null))) {
        break lexical_join_232;
    }
    lexicalValue257_228_0 = __call257_39(__fieldRead257_38(receiver));
    }
    if (!((lexicalValue257_228_0 != p0))) {
        break lexical_join_232;
    }
    return life8_6;
    }
    spill257_16 = p1;
    spill257_17 = -1;
    if (!((life7_9 != 0))) {
        lexicalValue257_243_0 = spill257_16;
        lexicalValue257_243_1 = spill257_17;
        break lexical_join_243;
    }
    if (!((spill257_16 > spill257_17))) {
        break lexical_join_246;
    }
    spill257_18 = __call257_41(__fieldRead257_40(receiver));
    if (!((life7_9 != 0))) {
        lexicalValue257_245_0 = spill257_18;
        break lexical_join_245;
    }
    lexicalValue257_243_0 = spill257_18;
    lexicalValue257_243_1 = p1;
    }
    if (!((lexicalValue257_243_0 != lexicalValue257_243_1))) {
        break lexical_join_246;
    }
    lexicalValue257_245_0 = life8_6;
    }
    return lexicalValue257_245_0;
    }
    spill257_19 = p3;
    if (!((life7_9 != 0))) {
        lexicalValue257_251_0 = spill257_19;
        break lexical_join_251;
    }
    if (!((spill257_19 != null))) {
        break lexical_join_261;
    }
    lexicalValue257_251_0 = p3;
    }
    spill257_20 = __call257_44(lexicalValue257_251_0, __call257_43(__fieldRead257_42(receiver)), 0);
    if (!((life7_9 != 0))) {
        lexicalValue257_262_0 = __integerCategory257_45(spill257_20);
        break lexical_join_262;
    }
    if (!((!spill257_20))) {
        break lexical_join_261;
    }
    return life8_6;
    }
    lexicalValue257_262_0 = p2;
    }
    if (!((life7_9 != 0))) {
        lexicalValue257_272_0 = lexicalValue257_262_0;
        break lexical_join_272;
    }
    if (!((lexicalValue257_262_0 <= 0))) {
        break lexical_join_269;
    }
    lexicalValue257_276_0 = __fieldRead257_47(__fieldRead257_46(receiver));
    break lexical_join_276;
    }
    lexicalValue257_272_0 = (p2 - life8_6);
    }
    lexicalValue257_276_0 = __call257_50(lexicalValue257_272_0, __fieldRead257_49(__fieldRead257_48(receiver)));
    }
    life9_427 = lexicalValue257_276_0;
    life8_6 = (life8_6 + life9_427);
    spill257_21 = p2;
    if (!((life7_9 != 0))) {
        lexicalValue257_313_0 = spill257_21;
        break lexical_join_313;
    }
    if (!((spill257_21 != 0))) {
        break lexical_join_312;
    }
    net.minecraft.item.ItemStack __stackOp257_52_0 = __fieldRead257_51(receiver);
    __fieldWrite257_54(__stackOp257_52_0, (__fieldRead257_53(__stackOp257_52_0) - life9_427));
    spill257_22 = __fieldRead257_56(__fieldRead257_55(receiver));
    if (!((life7_9 != 0))) {
        lexicalValue257_302_0 = spill257_22;
        break lexical_join_302;
    }
    if (!((spill257_22 == 0))) {
        break lexical_join_301;
    }
    __fieldWrite257_57(receiver, null);
    }
    lexicalValue257_302_0 = p2;
    }
    if (!((life7_9 != 0))) {
        lexicalValue257_313_0 = lexicalValue257_302_0;
        break lexical_join_313;
    }
    if (!((lexicalValue257_302_0 > 0))) {
        break lexical_join_312;
    }
    spill257_23 = life8_6;
    if (!((life7_9 != 0))) {
        lexicalValue257_313_0 = spill257_23;
        break lexical_join_313;
    }
    if (!((spill257_23 >= p2))) {
        break lexical_join_312;
    }
    return life8_6;
    }
    lexicalValue257_313_0 = life8_6;
    }
    return lexicalValue257_313_0;
}
public static void h257_0(moom.Oo p0) throws Throwable {
    throw __call1025700_0(p0);
}
public static void h257_1(moom.Oo p0) throws Throwable {
    throw __call1025701_0(p0);
}
public static void h257_2(moom.Oo p0) throws Throwable {
    throw __call1025702_0(p0);
}
public static void h257_3(moom.Oo p0) throws Throwable {
    throw __call1025703_0(p0);
}
public static void h257_4(moom.Oo p0) throws Throwable {
    throw __call1025704_0(p0);
}
public static void h257_5(moom.Oo p0) throws Throwable {
    throw __call1025705_0(p0);
}
public static void h257_6(moom.Oo p0) throws Throwable {
    throw __call1025706_0(p0);
}
public static void h257_7(moom.Oo p0) throws Throwable {
    throw __call1025707_0(p0);
}
public static void h257_8(moom.Oo p0) throws Throwable {
    throw __call1025708_0(p0);
}
public static void h257_9(moom.Oo p0) throws Throwable {
    throw __call1025709_0(p0);
}
public static void h257_10(moom.Oo p0) throws Throwable {
    throw __call1025710_0(p0);
}
public static void h257_11(moom.Oo p0) throws Throwable {
    throw __call1025711_0(p0);
}
public static void h257_12(moom.Oo p0) throws Throwable {
    throw __call1025712_0(p0);
}
public static void h257_13(moom.Oo p0) throws Throwable {
    throw __call1025713_0(p0);
}
public static void h257_14(moom.Oo p0) throws Throwable {
    throw __call1025714_0(p0);
}
public static void h257_15(moom.Oo p0) throws Throwable {
    throw __call1025715_0(p0);
}
public static void h257_16(moom.Oo p0) throws Throwable {
    throw __call1025716_0(p0);
}
public static void h257_17(moom.Oo p0) throws Throwable {
    throw __call1025717_0(p0);
}
public static void h257_18(moom.Oo p0) throws Throwable {
    throw __call1025718_0(p0);
}
public static void h257_19(moom.Oo p0) throws Throwable {
    throw __call1025719_0(p0);
}
public static void h257_20(moom.Oo p0) throws Throwable {
    throw __call1025720_0(p0);
}
public static void h257_21(moom.Oo p0) throws Throwable {
    throw __call1025721_0(p0);
}
public static void h257_22(moom.Oo p0) throws Throwable {
    throw __call1025722_0(p0);
}
public static void h257_23(moom.Oo p0) throws Throwable {
    throw __call1025723_0(p0);
}
public static void h257_24(moom.Oo p0) throws Throwable {
    throw __call1025724_0(p0);
}
public static void h257_25(moom.Oo p0) throws Throwable {
    throw __call1025725_0(p0);
}
public static void h257_26(moom.Oo p0) throws Throwable {
    throw __call1025726_0(p0);
}
public static void h257_27(moom.Oo p0) throws Throwable {
    throw __call1025727_0(p0);
}
public static void h257_28(moom.Oo p0) throws Throwable {
    throw __call1025728_0(p0);
}
public static void h257_29(moom.Oo p0) throws Throwable {
    throw __call1025729_0(p0);
}
public static void h257_30(moom.Oo p0) throws Throwable {
    throw __call1025730_0(p0);
}
public static void h257_31(moom.Oo p0) throws Throwable {
    throw __call1025731_0(p0);
}
public static void h257_32(moom.Oo p0) throws Throwable {
    throw __call1025732_0(p0);
}
public static void h257_33(moom.Oo p0) throws Throwable {
    throw __call1025733_0(p0);
}
public static void h257_34(moom.Oo p0) throws Throwable {
    throw __call1025734_0(p0);
}
public static void h257_35(moom.Oo p0) throws Throwable {
    throw __call1025735_0(p0);
}
public static void h257_36(moom.Oo p0) throws Throwable {
    throw __call1025736_0(p0);
}
public static void h257_37(moom.Oo p0) throws Throwable {
    throw __call1025737_0(p0);
}
public static void h257_38(moom.Oo p0) throws Throwable {
    throw __call1025738_0(p0);
}
public static void h257_39(moom.Oo p0) throws Throwable {
    throw __call1025739_0(p0);
}
public static void h257_40(moom.Oo p0) throws Throwable {
    throw __call1025740_0(p0);
}
public static void h257_41(moom.Oo p0) throws Throwable {
    throw __call1025741_0(p0);
}
public static void h257_42(moom.Oo p0) throws Throwable {
    throw __call1025742_0(p0);
}
public static void h257_43(moom.Oo p0) throws Throwable {
    throw __call1025743_0(p0);
}
public static void h257_44(moom.Oo p0) throws Throwable {
    throw __call1025744_0(p0);
}
public static void h257_45(moom.Oo p0) throws Throwable {
    throw __call1025745_0(p0);
}
public static void h257_46(moom.Oo p0) throws Throwable {
    throw __call1025746_0(p0);
}
public static void h257_47(moom.Oo p0) throws Throwable {
    throw __call1025747_0(p0);
}
public static void h257_48(moom.Oo p0) throws Throwable {
    throw __call1025748_0(p0);
}
public static void h257_49(moom.Oo p0) throws Throwable {
    throw __call1025749_0(p0);
}
public static void h257_50(moom.Oo p0) throws Throwable {
    throw __call1025750_0(p0);
}
public static void h257_51(moom.Oo p0) throws Throwable {
    throw __call1025751_0(p0);
}
public static void h257_52(moom.Oo p0) throws Throwable {
    throw __call1025752_0(p0);
}
public static void h257_53(moom.Oo p0) throws Throwable {
    throw __call1025753_0(p0);
}
public static void h257_54(moom.Oo p0) throws Throwable {
    throw __call1025754_0(p0);
}
public static void h257_55(moom.Oo p0) throws Throwable {
    throw __call1025755_0(p0);
}
public static void h257_56(moom.Oo p0) throws Throwable {
    throw __call1025756_0(p0);
}
public static void h257_57(moom.Oo p0) throws Throwable {
    throw __call1025757_0(p0);
}
public static void h257_58(moom.Oo p0) throws Throwable {
    throw __call1025758_0(p0);
}
public static void h257_59(moom.Oo p0) throws Throwable {
    throw __call1025759_0(p0);
}
private static native long __fieldRead257_0() throws Throwable;
private static native boolean __call257_1() throws Throwable;
private static native int __integerCategory257_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.Item __call257_5(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call257_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call257_7(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call257_8(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1, int a2) throws Throwable;
private static native int __integerCategory257_9(boolean value) throws Throwable;
private static native int __fieldRead257_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead257_11(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call257_12(int a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_13(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead257_15(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite257_16(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_17(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead257_18(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_19(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_20(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_21(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.Item __call257_22(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call257_23(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call257_24(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call257_25(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1, int a2) throws Throwable;
private static native int __integerCategory257_26(boolean value) throws Throwable;
private static native int __fieldRead257_27(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead257_28(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call257_29(int a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_30(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead257_32(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite257_33(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_34(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead257_35(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead257_36(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead257_37(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead257_38(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.Item __call257_39(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead257_40(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call257_41(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead257_42(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call257_43(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call257_44(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1, int a2) throws Throwable;
private static native int __integerCategory257_45(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead257_46(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead257_47(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead257_48(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead257_49(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call257_50(int a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead257_51(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead257_53(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite257_54(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead257_55(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead257_56(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite257_57(net.minecraft.entity.player.InventoryPlayer a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call1025700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025708_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025709_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025710_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025711_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025712_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025713_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025714_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025715_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025716_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025717_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025718_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025719_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025720_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025721_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025722_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025723_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025724_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025725_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025726_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025727_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025728_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025729_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025730_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025731_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025732_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025733_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025734_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025735_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025736_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025737_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025738_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025739_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025740_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025741_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025742_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025743_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025744_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025745_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025746_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025747_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025748_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025749_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025750_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025751_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025752_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025753_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025754_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025755_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025756_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025757_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025758_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025759_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c5d647e3c666441f5c3c(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1, int a2, boolean a3, boolean a4) throws E;
private static final class __SourceHandler_c5d647e3c666441f5c3c {

public static void f1581(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.Item p0, int p1, boolean p2, boolean p3) throws Throwable {
    int forwardValue1581_17_0;
    int forwardValue1581_21_0;
    int forwardValue1581_41_0;
    int forwardValue1581_52_0;
    net.minecraft.item.ItemStack forwardValue1581_66_0;
    int forwardValue1581_85_0;
    int forwardValue1581_108_0;
    boolean spill1581_0;
    boolean spill1581_1;
    int spill1581_2;
    int spill1581_3;
    int spill1581_4;
    net.minecraft.item.ItemStack spill1581_5;
    boolean spill1581_6;
    int spill1581_7;
    int spill1581_8;
    long life5_3;
    net.minecraft.item.ItemStack life8_7;
    int life7_8;
    int life9_27;
    int life10_70;
    int life11_130;
    int life12_143;
    forward_join_120: {
    forward_join_109: {
    forward_join_108: {
    forward_join_107: {
    forward_join_85: {
    forward_join_81: {
    forward_join_66: {
    forward_join_61: {
    forward_join_52: {
    forward_join_41: {
    forward_join_40: {
    forward_join_21: {
    forward_join_18: {
    forward_join_17: {
    life5_3 = (__fieldRead1581_0() ^ 50571952853905L);
    spill1581_0 = __call1581_1();
    life8_7 = __call1581_2(receiver);
    life7_8 = __integerCategory1581_3(spill1581_0);
    spill1581_1 = p2;
    if (!((life7_8 != 0))) {
        forwardValue1581_17_0 = __integerCategory1581_4(spill1581_1);
        break forward_join_17;
    }
    if (!(spill1581_1)) {
        break forward_join_18;
    }
    forwardValue1581_17_0 = __call1581_5(receiver, p0, p1);
    }
    forwardValue1581_21_0 = forwardValue1581_17_0;
    break forward_join_21;
    }
    forwardValue1581_21_0 = __call1581_6(receiver, p0);
    }
    life9_27 = forwardValue1581_21_0;
    spill1581_2 = life9_27;
    if (!((life7_8 != 0))) {
        forwardValue1581_41_0 = spill1581_2;
        break forward_join_41;
    }
    if (!((spill1581_2 >= 0))) {
        break forward_join_40;
    }
    spill1581_3 = life9_27;
    if (!((life7_8 != 0))) {
        forwardValue1581_41_0 = spill1581_3;
        break forward_join_41;
    }
    if (!((spill1581_3 < __invokedynamic1581_7(5920, (3904610492972986680L ^ life5_3))))) {
        break forward_join_40;
    }
    __fieldWrite1581_8(receiver, life9_27);
    if (!((life7_8 == 0))) {
        break forward_join_120;
    }
    }
    forwardValue1581_41_0 = __integerCategory1581_9(p3);
    }
    if (!((forwardValue1581_41_0 != 0))) {
        break forward_join_120;
    }
    if (!((p0 != null))) {
        break forward_join_120;
    }
    life10_70 = __call1581_10(receiver);
    spill1581_4 = life10_70;
    if (!((life7_8 != 0))) {
        forwardValue1581_52_0 = spill1581_4;
        break forward_join_52;
    }
    if (!((spill1581_4 >= 0))) {
        break forward_join_61;
    }
    forwardValue1581_52_0 = life10_70;
    }
    if (!((forwardValue1581_52_0 < __invokedynamic1581_11(5920, (3904610492972986680L ^ life5_3))))) {
        break forward_join_61;
    }
    __fieldWrite1581_12(receiver, life10_70);
    }
    spill1581_5 = life8_7;
    if (!((life7_8 != 0))) {
        forwardValue1581_66_0 = spill1581_5;
        break forward_join_66;
    }
    if (!((spill1581_5 != null))) {
        break forward_join_81;
    }
    forwardValue1581_66_0 = life8_7;
    }
    spill1581_6 = __call1581_13(forwardValue1581_66_0);
    if (!((life7_8 != 0))) {
        forwardValue1581_85_0 = __integerCategory1581_14(spill1581_6);
        break forward_join_85;
    }
    if (!(spill1581_6)) {
        break forward_join_81;
    }
    spill1581_7 = __call1581_17(receiver, __call1581_15(life8_7), __call1581_16(life8_7));
    if (!((life7_8 != 0))) {
        forwardValue1581_85_0 = spill1581_7;
        break forward_join_85;
    }
    if (!((spill1581_7 != __fieldRead1581_18(receiver)))) {
        break forward_join_120;
    }
    }
    forwardValue1581_85_0 = __call1581_19(receiver, p0, p1);
    }
    life11_130 = forwardValue1581_85_0;
    spill1581_8 = life11_130;
    if (!((life7_8 != 0))) {
        forwardValue1581_108_0 = spill1581_8;
        break forward_join_108;
    }
    if (!((spill1581_8 >= 0))) {
        break forward_join_107;
    }
    life12_143 = __fieldRead1581_21((__fieldRead1581_20(receiver))[life11_130]);
    (__fieldRead1581_22(receiver))[life11_130] = (__fieldRead1581_23(receiver))[__fieldRead1581_24(receiver)];
    if (!((life7_8 == 0))) {
        break forward_join_109;
    }
    }
    forwardValue1581_108_0 = 1;
    }
    life12_143 = forwardValue1581_108_0;
    }
    (__fieldRead1581_25(receiver))[__fieldRead1581_26(receiver)] = new net.minecraft.item.ItemStack(p0, life12_143, p1);
    }
    return;
}
public static void h1581_0(moom.Oo p0) throws Throwable {
    throw __call1158100_0(p0);
}
public static void h1581_1(moom.Oo p0) throws Throwable {
    throw __call1158101_0(p0);
}
public static void h1581_2(moom.Oo p0) throws Throwable {
    throw __call1158102_0(p0);
}
public static void h1581_3(moom.Oo p0) throws Throwable {
    throw __call1158103_0(p0);
}
public static void h1581_4(moom.Oo p0) throws Throwable {
    throw __call1158104_0(p0);
}
public static void h1581_5(moom.Oo p0) throws Throwable {
    throw __call1158105_0(p0);
}
public static void h1581_6(moom.Oo p0) throws Throwable {
    throw __call1158106_0(p0);
}
public static void h1581_7(moom.Oo p0) throws Throwable {
    throw __call1158107_0(p0);
}
public static void h1581_8(moom.Oo p0) throws Throwable {
    throw __call1158108_0(p0);
}
public static void h1581_9(moom.Oo p0) throws Throwable {
    throw __call1158109_0(p0);
}
public static void h1581_10(moom.Oo p0) throws Throwable {
    throw __call1158110_0(p0);
}
public static void h1581_11(moom.Oo p0) throws Throwable {
    throw __call1158111_0(p0);
}
public static void h1581_12(moom.Oo p0) throws Throwable {
    throw __call1158112_0(p0);
}
public static void h1581_13(moom.Oo p0) throws Throwable {
    throw __call1158113_0(p0);
}
public static void h1581_14(moom.Oo p0) throws Throwable {
    throw __call1158114_0(p0);
}
public static void h1581_15(moom.Oo p0) throws Throwable {
    throw __call1158115_0(p0);
}
public static void h1581_16(moom.Oo p0) throws Throwable {
    throw __call1158116_0(p0);
}
private static native long __fieldRead1581_0() throws Throwable;
private static native boolean __call1581_1() throws Throwable;
private static native net.minecraft.item.ItemStack __call1581_2(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __integerCategory1581_3(boolean value) throws Throwable;
private static native int __integerCategory1581_4(boolean value) throws Throwable;
private static native int __call1581_5(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1, int a2) throws Throwable;
private static native int __call1581_6(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1) throws Throwable;
private static native int __invokedynamic1581_7(int a0, long a1) throws Throwable;
private static native void __fieldWrite1581_8(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native int __integerCategory1581_9(boolean value) throws Throwable;
private static native int __call1581_10(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __invokedynamic1581_11(int a0, long a1) throws Throwable;
private static native void __fieldWrite1581_12(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native boolean __call1581_13(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory1581_14(boolean value) throws Throwable;
private static native net.minecraft.item.Item __call1581_15(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1581_16(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1581_17(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1, int a2) throws Throwable;
private static native int __fieldRead1581_18(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call1581_19(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1, int a2) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1581_20(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1581_21(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1581_22(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1581_23(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1581_24(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1581_25(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1581_26(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call1158100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158109_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158110_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158111_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158112_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158113_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158114_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158115_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158116_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_537d4bbfcad4d825a027(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_537d4bbfcad4d825a027 {

public static int f1582(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    net.minecraft.item.ItemStack lexicalValue1582_24_0;
    net.minecraft.item.ItemStack lexicalValue1582_34_0;
    int lexicalValue1582_43_0;
    int lexicalValue1582_60_0;
    int lexicalValue1582_60_1;
    int lexicalValue1582_66_0;
    int lexicalValue1582_85_0;
    int lexicalValue1582_89_0;
    boolean spill1582_0;
    net.minecraft.item.ItemStack spill1582_1;
    boolean spill1582_2;
    int spill1582_3;
    int spill1582_4;
    int spill1582_5;
    long life2_3;
    int life5_6;
    int life4_7;
    lexical_join_93: {
    life2_3 = (__fieldRead1582_0() ^ 50404170692402L);
    spill1582_0 = __call1582_1();
    life5_6 = 0;
    life4_7 = __integerCategory1582_2(spill1582_0);
    lexical_cycle_8: while (true) {
    lexical_join_90: {
    lexical_join_89: {
    lexical_join_85: {
    lexical_join_79: {
    lexical_join_66: {
    lexical_join_60: {
    lexical_join_43: {
    lexical_join_34: {
    lexical_join_24: {
    if (!((life5_6 < (__fieldRead1582_3(receiver)).length))) {
        break lexical_join_93;
    }
    spill1582_1 = (__fieldRead1582_4(receiver))[life5_6];
    if (!((life4_7 == 0))) {
        lexicalValue1582_24_0 = spill1582_1;
        break lexical_join_24;
    }
    if (!((spill1582_1 != null))) {
        break lexical_join_90;
    }
    lexicalValue1582_24_0 = (__fieldRead1582_5(receiver))[life5_6];
    }
    if (!((life4_7 == 0))) {
        lexicalValue1582_34_0 = lexicalValue1582_24_0;
        break lexical_join_34;
    }
    if (!((__call1582_6(lexicalValue1582_24_0) == __call1582_7(p0)))) {
        break lexical_join_90;
    }
    lexicalValue1582_34_0 = (__fieldRead1582_8(receiver))[life5_6];
    }
    spill1582_2 = __call1582_9(lexicalValue1582_34_0);
    if (!((life4_7 == 0))) {
        lexicalValue1582_43_0 = __integerCategory1582_10(spill1582_2);
        break lexical_join_43;
    }
    if (!(spill1582_2)) {
        break lexical_join_90;
    }
    lexicalValue1582_43_0 = __fieldRead1582_12((__fieldRead1582_11(receiver))[life5_6]);
    }
    spill1582_3 = __call1582_14((__fieldRead1582_13(receiver))[life5_6]);
    if (!((life4_7 == 0))) {
        lexicalValue1582_60_0 = lexicalValue1582_43_0;
        lexicalValue1582_60_1 = spill1582_3;
        break lexical_join_60;
    }
    if (!((lexicalValue1582_43_0 < spill1582_3))) {
        break lexical_join_90;
    }
    spill1582_4 = __fieldRead1582_16((__fieldRead1582_15(receiver))[life5_6]);
    if (!((life4_7 == 0))) {
        lexicalValue1582_66_0 = spill1582_4;
        break lexical_join_66;
    }
    lexicalValue1582_60_0 = spill1582_4;
    lexicalValue1582_60_1 = __call1582_17(receiver);
    }
    if (!((lexicalValue1582_60_0 < lexicalValue1582_60_1))) {
        break lexical_join_90;
    }
    lexicalValue1582_66_0 = __integerCategory1582_20(__call1582_19((__fieldRead1582_18(receiver))[life5_6]));
    }
    if (!((life4_7 == 0))) {
        lexicalValue1582_85_0 = lexicalValue1582_66_0;
        break lexical_join_85;
    }
    if (!((lexicalValue1582_66_0 != 0))) {
        break lexical_join_79;
    }
    spill1582_5 = __call1582_22((__fieldRead1582_21(receiver))[life5_6]);
    if (!((life4_7 == 0))) {
        lexicalValue1582_85_0 = spill1582_5;
        break lexical_join_85;
    }
    if (!((spill1582_5 == __call1582_23(p0)))) {
        break lexical_join_90;
    }
    }
    lexicalValue1582_85_0 = __integerCategory1582_26(__call1582_25((__fieldRead1582_24(receiver))[life5_6], p0));
    }
    if (!((life4_7 == 0))) {
        lexicalValue1582_89_0 = lexicalValue1582_85_0;
        break lexical_join_89;
    }
    if (!((lexicalValue1582_85_0 != 0))) {
        break lexical_join_90;
    }
    lexicalValue1582_89_0 = life5_6;
    }
    return lexicalValue1582_89_0;
    }
    life5_6 += 1;
    if (!((life4_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return -1;
}
public static void h1582_0(moom.Oo p0) throws Throwable {
    throw __call1158200_0(p0);
}
public static void h1582_1(moom.Oo p0) throws Throwable {
    throw __call1158201_0(p0);
}
public static void h1582_2(moom.Oo p0) throws Throwable {
    throw __call1158202_0(p0);
}
public static void h1582_3(moom.Oo p0) throws Throwable {
    throw __call1158203_0(p0);
}
public static void h1582_4(moom.Oo p0) throws Throwable {
    throw __call1158204_0(p0);
}
public static void h1582_5(moom.Oo p0) throws Throwable {
    throw __call1158205_0(p0);
}
public static void h1582_6(moom.Oo p0) throws Throwable {
    throw __call1158206_0(p0);
}
public static void h1582_7(moom.Oo p0) throws Throwable {
    throw __call1158207_0(p0);
}
public static void h1582_8(moom.Oo p0) throws Throwable {
    throw __call1158208_0(p0);
}
public static void h1582_9(moom.Oo p0) throws Throwable {
    throw __call1158209_0(p0);
}
public static void h1582_10(moom.Oo p0) throws Throwable {
    throw __call1158210_0(p0);
}
public static void h1582_11(moom.Oo p0) throws Throwable {
    throw __call1158211_0(p0);
}
public static void h1582_12(moom.Oo p0) throws Throwable {
    throw __call1158212_0(p0);
}
public static void h1582_13(moom.Oo p0) throws Throwable {
    throw __call1158213_0(p0);
}
public static void h1582_14(moom.Oo p0) throws Throwable {
    throw __call1158214_0(p0);
}
private static native long __fieldRead1582_0() throws Throwable;
private static native boolean __call1582_1() throws Throwable;
private static native int __integerCategory1582_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.Item __call1582_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __call1582_7(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_8(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call1582_9(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory1582_10(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_11(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1582_12(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_13(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call1582_14(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_15(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1582_16(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1582_17(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_18(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call1582_19(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory1582_20(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_21(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call1582_22(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call1582_23(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1582_24(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call1582_25(net.minecraft.item.ItemStack a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __integerCategory1582_26(boolean value) throws Throwable;
private static native java.lang.Throwable __call1158200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158214_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagList __sourceHandlerCall_d5480d1ba642d25800ca(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.nbt.NBTTagList a1) throws E;
private static final class __SourceHandler_d5480d1ba642d25800ca {

public static net.minecraft.nbt.NBTTagList f1123(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.nbt.NBTTagList p0) throws Throwable {
    net.minecraft.item.ItemStack forestValue1123_83_0;
    boolean spill1123_0;
    net.minecraft.item.ItemStack spill1123_1;
    net.minecraft.item.ItemStack spill1123_2;
    long life2_3;
    int life5_6;
    int life4_7;
    net.minecraft.nbt.NBTTagCompound life6_28;
    int life5_50;
    net.minecraft.nbt.NBTTagCompound life6_68;
    net.minecraft.nbt.NBTTagCompound life6_100;
    forest_join_123: {
    forest_join_83: {
    forest_join_42: {
    life2_3 = (__fieldRead1123_0() ^ 128076349782516L);
    spill1123_0 = __call1123_1();
    life5_6 = 0;
    life4_7 = __integerCategory1123_2(spill1123_0);
    forest_cycle_8: while (true) {
    forest_join_39: {
    if (!((life5_6 < (__fieldRead1123_3(receiver)).length))) {
        break forest_join_42;
    }
    spill1123_1 = (__fieldRead1123_4(receiver))[life5_6];
    if (!((life4_7 != 0))) {
        forestValue1123_83_0 = spill1123_1;
        break forest_join_83;
    }
    if (!((spill1123_1 != null))) {
        break forest_join_39;
    }
    life6_28 = new net.minecraft.nbt.NBTTagCompound();
    __call1123_5(life6_28, "Slot", ((byte) life5_6));
    __call1123_7((__fieldRead1123_6(receiver))[life5_6], life6_28);
    __call1123_8(p0, life6_28);
    }
    life5_6 += 1;
    if (!((life4_7 == 0))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    life5_50 = 0;
    forest_cycle_44: while (true) {
    forest_join_79: {
    if (!((life5_50 < (__fieldRead1123_9(receiver)).length))) {
        break forest_join_123;
    }
    if (!(((__fieldRead1123_10(receiver))[life5_50] != null))) {
        break forest_join_79;
    }
    life6_68 = new net.minecraft.nbt.NBTTagCompound();
    __call1123_12(life6_68, "Slot", ((byte) (life5_50 + __invokedynamic1123_11(24630, (1549213753911127109L ^ life2_3)))));
    __call1123_14((__fieldRead1123_13(receiver))[life5_50], life6_68);
    __call1123_15(p0, life6_68);
    }
    life5_50 += 1;
    if (!((life4_7 == 0))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    break forest_join_123;
    }
    forest_cycle_83: while (true) {
    forest_join_113: {
    forest_join_109: {
    if (!((forestValue1123_83_0 != null))) {
        break forest_join_109;
    }
    life6_100 = new net.minecraft.nbt.NBTTagCompound();
    __call1123_17(life6_100, "Slot", ((byte) (life5_6 + __invokedynamic1123_16(24630, (1549213753911127109L ^ life2_3)))));
    __call1123_19((__fieldRead1123_18(receiver))[life5_6], life6_100);
    __call1123_20(p0, life6_100);
    }
    life5_6 += 1;
    if (!((life4_7 == 0))) {
        break forest_join_113;
    }
    break forest_join_123;
    }
    if (!((life5_6 < (__fieldRead1123_21(receiver)).length))) {
        break forest_join_123;
    }
    spill1123_2 = (__fieldRead1123_22(receiver))[life5_6];
    forestValue1123_83_0 = spill1123_2;
    continue forest_cycle_83;
    }
    }
    return p0;
}
public static net.minecraft.nbt.NBTTagList h1123_0(moom.Oo p0) throws Throwable {
    throw __call3112300_0(p0);
}
private static native long __fieldRead1123_0() throws Throwable;
private static native boolean __call1123_1() throws Throwable;
private static native int __integerCategory1123_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1123_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1123_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call1123_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte a2) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1123_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1123_7(net.minecraft.item.ItemStack a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1123_8(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1123_9(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1123_10(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __invokedynamic1123_11(int a0, long a1) throws Throwable;
private static native void __call1123_12(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte a2) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1123_13(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1123_14(net.minecraft.item.ItemStack a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1123_15(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native int __invokedynamic1123_16(int a0, long a1) throws Throwable;
private static native void __call1123_17(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte a2) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1123_18(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1123_19(net.minecraft.item.ItemStack a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1123_20(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1123_21(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1123_22(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call3112300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e5f98176860d5e8468a0(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.block.Block a1, int a2) throws E;
private static final class __SourceHandler_e5f98176860d5e8468a0 {

public static boolean f1584(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.block.Block p0, int p1) throws Throwable {
    int forwardValue1584_13_0;
    net.minecraft.item.ItemStack forwardValue1584_23_0;
    int forwardValue1584_29_0;
    int forwardValue1584_31_0;
    boolean spill1584_0;
    net.minecraft.item.ItemStack spill1584_1;
    boolean spill1584_2;
    long life3_3;
    int life5_5;
    net.minecraft.item.ItemStack life6_20;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life3_3 = (__fieldRead1584_0() ^ 60290642100248L);
    life5_5 = __integerCategory1584_2(__call1584_1());
    spill1584_0 = __call1584_4(__call1584_3(p0));
    if (!((life5_5 == 0))) {
        forwardValue1584_13_0 = __integerCategory1584_5(spill1584_0);
        break forward_join_13;
    }
    if (!(spill1584_0)) {
        break forward_join_14;
    }
    forwardValue1584_13_0 = 1;
    }
    return __integerCategory1584_6(forwardValue1584_13_0);
    }
    life6_20 = __call1584_7(receiver, p1);
    spill1584_1 = life6_20;
    if (!((life5_5 == 0))) {
        forwardValue1584_23_0 = spill1584_1;
        break forward_join_23;
    }
    if (!((spill1584_1 != null))) {
        break forward_join_30;
    }
    forwardValue1584_23_0 = life6_20;
    }
    spill1584_2 = __call1584_8(forwardValue1584_23_0, p0);
    if (!((life5_5 == 0))) {
        forwardValue1584_29_0 = __integerCategory1584_9(spill1584_2);
        break forward_join_29;
    }
    if (!(spill1584_2)) {
        break forward_join_30;
    }
    forwardValue1584_29_0 = 1;
    }
    forwardValue1584_31_0 = forwardValue1584_29_0;
    break forward_join_31;
    }
    forwardValue1584_31_0 = 0;
    }
    return __integerCategory1584_10(forwardValue1584_31_0);
}
public static void h1584_0(moom.Oo p0) throws Throwable {
    throw __call1158400_0(p0);
}
public static void h1584_1(moom.Oo p0) throws Throwable {
    throw __call1158401_0(p0);
}
public static void h1584_2(moom.Oo p0) throws Throwable {
    throw __call1158402_0(p0);
}
private static native long __fieldRead1584_0() throws Throwable;
private static native boolean __call1584_1() throws Throwable;
private static native int __integerCategory1584_2(boolean value) throws Throwable;
private static native moom.fn __call1584_3(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1584_4(moom.fn a0) throws Throwable;
private static native int __integerCategory1584_5(boolean value) throws Throwable;
private static native boolean __integerCategory1584_6(int value) throws Throwable;
private static native net.minecraft.item.ItemStack __call1584_7(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native boolean __call1584_8(net.minecraft.item.ItemStack a0, net.minecraft.block.Block a1) throws Throwable;
private static native int __integerCategory1584_9(boolean value) throws Throwable;
private static native boolean __integerCategory1584_10(int value) throws Throwable;
private static native java.lang.Throwable __call1158400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2ed35f6d16bbffd3dae8(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1) throws E;
private static final class __SourceHandler_2ed35f6d16bbffd3dae8 {

public static boolean f1124(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.Item p0) throws Throwable {
    int forestValue1124_26_0;
    int forestValue1124_35_0;
    boolean spill1124_0;
    int spill1124_1;
    int spill1124_2;
    long life2_3;
    int life5_8;
    int life4_9;
    forest_join_35: {
    forest_join_34: {
    forest_join_26: {
    forest_join_16: {
    life2_3 = (__fieldRead1124_0() ^ 10676211081602L);
    spill1124_0 = __call1124_1();
    life5_8 = __call1124_2(receiver, p0);
    life4_9 = __integerCategory1124_3(spill1124_0);
    spill1124_1 = life5_8;
    if (!((life4_9 != 0))) {
        forestValue1124_26_0 = spill1124_1;
        break forest_join_26;
    }
    if (!((spill1124_1 < 0))) {
        break forest_join_16;
    }
    return __integerCategory1124_4(0);
    }
    net.minecraft.item.ItemStack __stackOp1124_6_0 = (__fieldRead1124_5(receiver))[life5_8];
    net.minecraft.item.ItemStack __stackOp1124_8_0 = __stackOp1124_6_0;
    int __stackOp1124_8_1 = (__fieldRead1124_7(__stackOp1124_6_0) - 1);
    spill1124_2 = __stackOp1124_8_1;
    __fieldWrite1124_9(__stackOp1124_8_0, __stackOp1124_8_1);
    forestValue1124_26_0 = spill1124_2;
    }
    if (!((life4_9 != 0))) {
        forestValue1124_35_0 = forestValue1124_26_0;
        break forest_join_35;
    }
    if (!((forestValue1124_26_0 <= 0))) {
        break forest_join_34;
    }
    (__fieldRead1124_10(receiver))[life5_8] = null;
    }
    forestValue1124_35_0 = 1;
    }
    return __integerCategory1124_11(forestValue1124_35_0);
}
public static boolean h1124_0(moom.Oo p0) throws Throwable {
    throw __call3112400_0(p0);
}
public static boolean h1124_1(moom.Oo p0) throws Throwable {
    throw __call3112401_0(p0);
}
public static boolean h1124_2(moom.Oo p0) throws Throwable {
    throw __call3112402_0(p0);
}
public static boolean h1124_3(moom.Oo p0) throws Throwable {
    throw __call3112403_0(p0);
}
private static native long __fieldRead1124_0() throws Throwable;
private static native boolean __call1124_1() throws Throwable;
private static native int __call1124_2(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1) throws Throwable;
private static native int __integerCategory1124_3(boolean value) throws Throwable;
private static native boolean __integerCategory1124_4(int value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1124_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1124_7(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite1124_9(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1124_10(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __integerCategory1124_11(int value) throws Throwable;
private static native java.lang.Throwable __call3112400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_45eae113c4b054fa0338(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_45eae113c4b054fa0338 {

public static boolean f682(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    net.minecraft.item.ItemStack forestValue682_11_0;
    net.minecraft.item.ItemStack forestValue682_21_0;
    int forestValue682_57_0;
    int forestValue682_66_0;
    int forestValue682_68_0;
    int forestValue682_83_0;
    int forestValue682_83_1;
    int forestValue682_96_0;
    int forestValue682_96_1;
    int forestValue682_98_0;
    int forestValue682_110_0;
    int forestValue682_110_1;
    int forestValue682_123_0;
    int forestValue682_123_1;
    int forestValue682_128_0;
    int forestValue682_128_1;
    int forestValue682_145_0;
    int forestValue682_148_0;
    int forestValue682_148_1;
    int forestValue682_150_0;
    int forestValue682_152_0;
    net.minecraft.item.ItemStack spill682_0;
    int spill682_1;
    net.minecraft.item.ItemStack spill682_2;
    boolean spill682_3;
    int spill682_4;
    int spill682_5;
    int spill682_6;
    int spill682_7;
    int spill682_8;
    int spill682_9;
    int spill682_10;
    int spill682_11;
    int spill682_12;
    int spill682_13;
    boolean spill682_14;
    long life2_3;
    int life4_5;
    int life5_42;
    int life5_96;
    forest_join_152: {
    forest_join_151: {
    forest_join_150: {
    forest_join_148: {
    forest_join_145: {
    forest_join_143: {
    forest_join_128: {
    forest_join_98: {
    forest_join_69: {
    forest_join_68: {
    forest_join_67: {
    forest_join_66: {
    forest_join_65: {
    forest_join_57: {
    forest_join_53: {
    forest_join_21: {
    forest_join_11: {
    life2_3 = (__fieldRead682_0() ^ 63021533624742L);
    life4_5 = __integerCategory682_2(__call682_1());
    spill682_0 = p0;
    if (!((life4_5 != 0))) {
        forestValue682_11_0 = spill682_0;
        break forest_join_11;
    }
    if (!((spill682_0 != null))) {
        break forest_join_67;
    }
    forestValue682_11_0 = p0;
    }
    spill682_1 = __fieldRead682_3(forestValue682_11_0);
    if (!((life4_5 != 0))) {
        forestValue682_68_0 = spill682_1;
        break forest_join_68;
    }
    if (!((spill682_1 != 0))) {
        break forest_join_67;
    }
    spill682_2 = p0;
    if (!((life4_5 != 0))) {
        forestValue682_21_0 = spill682_2;
        break forest_join_21;
    }
    if (!((__call682_4(spill682_2) != null))) {
        break forest_join_67;
    }
    forestValue682_21_0 = p0;
    }
    spill682_3 = __call682_5(forestValue682_21_0);
    if (!((life4_5 != 0))) {
        forestValue682_98_0 = __integerCategory682_6(spill682_3);
        break forest_join_98;
    }
    if (!(spill682_3)) {
        break forest_join_69;
    }
    life5_42 = __call682_7(receiver);
    spill682_4 = life5_42;
    if (!((life4_5 != 0))) {
        forestValue682_57_0 = spill682_4;
        break forest_join_57;
    }
    if (!((spill682_4 >= 0))) {
        break forest_join_53;
    }
    (__fieldRead682_8(receiver))[life5_42] = __call682_9(p0);
    __fieldWrite682_12((__fieldRead682_10(receiver))[life5_42], __invokedynamic682_11(1676, (2480952963390311086L ^ life2_3)));
    __fieldWrite682_13(p0, 0);
    return __integerCategory682_14(1);
    }
    forestValue682_57_0 = __integerCategory682_18(__fieldRead682_17(__fieldRead682_16(__fieldRead682_15(receiver))));
    }
    if (!((life4_5 != 0))) {
        forestValue682_66_0 = forestValue682_57_0;
        break forest_join_66;
    }
    if (!((forestValue682_57_0 != 0))) {
        break forest_join_65;
    }
    __fieldWrite682_19(p0, 0);
    return __integerCategory682_20(1);
    }
    forestValue682_66_0 = 0;
    }
    return __integerCategory682_21(forestValue682_66_0);
    }
    forestValue682_68_0 = 0;
    }
    return __integerCategory682_22(forestValue682_68_0);
    }
    forest_cycle_69: while (true) {
    forest_join_90: {
    life5_96 = __fieldRead682_23(p0);
    __fieldWrite682_25(p0, __call682_24(receiver, p0));
    if (!((__fieldRead682_26(p0) > 0))) {
        break forest_join_90;
    }
    forestValue682_83_0 = __fieldRead682_27(p0);
    forestValue682_83_1 = life5_96;
    forest_cycle_83: while (true) {
    if (!((forestValue682_83_0 >= forestValue682_83_1))) {
        continue forest_cycle_69;
    }
    spill682_5 = __fieldRead682_28(p0);
    spill682_6 = life5_96;
    if (!((life4_5 != 0))) {
        forestValue682_83_0 = spill682_5;
        forestValue682_83_1 = spill682_6;
        continue forest_cycle_83;
    }
    break forest_cycle_83;
    }
    forestValue682_128_0 = spill682_5;
    forestValue682_128_1 = spill682_6;
    break forest_join_128;
    }
    forest_cycle_90: while (true) {
    forest_join_96: {
    spill682_7 = __fieldRead682_29(p0);
    spill682_8 = life5_96;
    if (!((life4_5 != 0))) {
        forestValue682_96_0 = spill682_7;
        forestValue682_96_1 = spill682_8;
        break forest_join_96;
    }
    forestValue682_128_0 = spill682_7;
    forestValue682_128_1 = spill682_8;
    break forest_join_128;
    }
    if (!((forestValue682_96_0 >= forestValue682_96_1))) {
        continue forest_cycle_69;
    }
    continue forest_cycle_90;
    }
    }
    }
    forest_cycle_98: while (true) {
    forest_join_125: {
    forest_join_117: {
    life5_96 = forestValue682_98_0;
    __fieldWrite682_31(p0, __call682_30(receiver, p0));
    if (!((__fieldRead682_32(p0) > 0))) {
        break forest_join_117;
    }
    forestValue682_110_0 = __fieldRead682_33(p0);
    forestValue682_110_1 = life5_96;
    forest_cycle_110: while (true) {
    if (!((forestValue682_110_0 >= forestValue682_110_1))) {
        break forest_join_125;
    }
    spill682_9 = __fieldRead682_34(p0);
    spill682_10 = life5_96;
    if (!((life4_5 != 0))) {
        forestValue682_110_0 = spill682_9;
        forestValue682_110_1 = spill682_10;
        continue forest_cycle_110;
    }
    break forest_cycle_110;
    }
    forestValue682_128_0 = spill682_9;
    forestValue682_128_1 = spill682_10;
    break forest_join_128;
    }
    forest_cycle_117: while (true) {
    forest_join_123: {
    spill682_11 = __fieldRead682_35(p0);
    spill682_12 = life5_96;
    if (!((life4_5 != 0))) {
        forestValue682_123_0 = spill682_11;
        forestValue682_123_1 = spill682_12;
        break forest_join_123;
    }
    forestValue682_128_0 = spill682_11;
    forestValue682_128_1 = spill682_12;
    break forest_join_128;
    }
    if (!((forestValue682_123_0 >= forestValue682_123_1))) {
        break forest_join_125;
    }
    continue forest_cycle_117;
    }
    }
    spill682_13 = __fieldRead682_36(p0);
    forestValue682_98_0 = spill682_13;
    continue forest_cycle_98;
    }
    }
    if (!((life4_5 != 0))) {
        forestValue682_148_0 = forestValue682_128_0;
        forestValue682_148_1 = forestValue682_128_1;
        break forest_join_148;
    }
    if (!((forestValue682_128_0 == forestValue682_128_1))) {
        break forest_join_143;
    }
    spill682_14 = __fieldRead682_39(__fieldRead682_38(__fieldRead682_37(receiver)));
    if (!((life4_5 != 0))) {
        forestValue682_145_0 = __integerCategory682_40(spill682_14);
        break forest_join_145;
    }
    if (!(spill682_14)) {
        break forest_join_143;
    }
    __fieldWrite682_41(p0, 0);
    return __integerCategory682_42(1);
    }
    forestValue682_145_0 = __fieldRead682_43(p0);
    }
    if (!((life4_5 != 0))) {
        forestValue682_150_0 = forestValue682_145_0;
        break forest_join_150;
    }
    forestValue682_148_0 = forestValue682_145_0;
    forestValue682_148_1 = life5_96;
    }
    if (!((forestValue682_148_0 < forestValue682_148_1))) {
        break forest_join_151;
    }
    forestValue682_150_0 = 1;
    }
    forestValue682_152_0 = forestValue682_150_0;
    break forest_join_152;
    }
    forestValue682_152_0 = 0;
    }
    return __integerCategory682_44(forestValue682_152_0);
}
public static boolean h682_0(java.lang.Throwable p0) throws Throwable {
    throw __call3068200_0(p0);
}
public static boolean h682_1(java.lang.Throwable p0) throws Throwable {
    throw __call3068201_0(p0);
}
public static boolean h682_2(java.lang.Throwable p0) throws Throwable {
    throw __call3068202_0(p0);
}
public static boolean h682_3(java.lang.Throwable p0) throws Throwable {
    throw __call3068203_0(p0);
}
public static boolean h682_4(java.lang.Throwable p0) throws Throwable {
    throw __call3068204_0(p0);
}
public static boolean h682_5(java.lang.Throwable p0) throws Throwable {
    throw __call3068205_0(p0);
}
public static boolean h682_6(java.lang.Throwable p0) throws Throwable {
    throw __call3068206_0(p0);
}
public static boolean h682_7(java.lang.Throwable p0) throws Throwable {
    throw __call3068207_0(p0);
}
public static boolean h682_8(java.lang.Throwable p0) throws Throwable {
    throw __call3068208_0(p0);
}
public static boolean h682_9(java.lang.Throwable p0) throws Throwable {
    throw __call3068209_0(p0);
}
public static boolean h682_10(java.lang.Throwable p0) throws Throwable {
    throw __call3068210_0(p0);
}
public static boolean h682_11(java.lang.Throwable p0) throws Throwable {
    throw __call3068211_0(p0);
}
public static boolean h682_12(java.lang.Throwable p0, net.minecraft.item.ItemStack p1, int p2) throws Throwable {
    moom.qZ spill3068212_0;
    java.lang.String spill3068212_1;
    net.minecraft.item.ItemStack spill3068212_2;
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    moom.qZ life4_10;
    life2_2 = p0;
    life3_6 = __call3068212_0(life2_2, "Adding item to inventory");
    life4_10 = __call3068212_1(life3_6, "Item being added");
    __call3068212_5(life4_10, "Item ID", __call3068212_4(__call3068212_3(__call3068212_2(p1))));
    __call3068212_8(life4_10, "Item data", __call3068212_7(__call3068212_6(p1)));
    spill3068212_0 = life4_10;
    spill3068212_1 = "Item name";
    net.minecraft.item.ItemStack __stackOp3068212_9_0 = p1;
    spill3068212_2 = __stackOp3068212_9_0;
    __call3068212_10(__stackOp3068212_9_0);
    __call3068212_12(spill3068212_0, spill3068212_1, __invokedynamic3068212_11(spill3068212_2));
    throw new moom.Oo(life3_6);
}
private static native long __fieldRead682_0() throws Throwable;
private static native boolean __call682_1() throws Throwable;
private static native int __integerCategory682_2(boolean value) throws Throwable;
private static native int __fieldRead682_3(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.Item __call682_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call682_5(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory682_6(boolean value) throws Throwable;
private static native int __call682_7(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead682_8(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call682_9(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead682_10(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __invokedynamic682_11(int a0, long a1) throws Throwable;
private static native void __fieldWrite682_12(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native void __fieldWrite682_13(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native boolean __integerCategory682_14(int value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead682_15(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead682_16(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __fieldRead682_17(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory682_18(boolean value) throws Throwable;
private static native void __fieldWrite682_19(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native boolean __integerCategory682_20(int value) throws Throwable;
private static native boolean __integerCategory682_21(int value) throws Throwable;
private static native boolean __integerCategory682_22(int value) throws Throwable;
private static native int __fieldRead682_23(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call682_24(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __fieldWrite682_25(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native int __fieldRead682_26(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead682_27(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead682_28(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead682_29(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call682_30(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __fieldWrite682_31(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native int __fieldRead682_32(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead682_33(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead682_34(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead682_35(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead682_36(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead682_37(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead682_38(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native boolean __fieldRead682_39(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory682_40(boolean value) throws Throwable;
private static native void __fieldWrite682_41(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native boolean __integerCategory682_42(int value) throws Throwable;
private static native int __fieldRead682_43(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __integerCategory682_44(int value) throws Throwable;
private static native java.lang.Throwable __call3068200_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068201_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068202_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068203_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068204_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068205_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068206_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068207_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068208_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068209_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068210_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3068211_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3068212_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3068212_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call3068212_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call3068212_3(net.minecraft.item.Item a0) throws Throwable;
private static native java.lang.Integer __call3068212_4(int a0) throws Throwable;
private static native void __call3068212_5(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __call3068212_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.lang.Integer __call3068212_7(int a0) throws Throwable;
private static native void __call3068212_8(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Object __call3068212_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic3068212_11(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call3068212_12(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.util.IChatComponent __sourceHandlerCall_8c5d06020b6ad54ff3b6(net.minecraft.entity.player.InventoryPlayer a0) throws E;
private static final class __SourceHandler_8c5d06020b6ad54ff3b6 {

public static net.minecraft.util.IChatComponent f567(net.minecraft.entity.player.InventoryPlayer receiver) throws Throwable {
    moom.CJ forwardValue567_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_13: {
    life1_3 = (__fieldRead567_0() ^ 129566696290405L);
    if (!(__call567_1(receiver))) {
        break forward_join_13;
    }
    forwardValue567_20_0 = new moom.CM(__call567_2(receiver));
    break forward_join_20;
    }
    forwardValue567_20_0 = new moom.CN(__call567_3(receiver), new java.lang.Object[0]);
    }
    return forwardValue567_20_0;
}
public static net.minecraft.util.IChatComponent h567_0(moom.Oo p0) throws Throwable {
    throw __call2056700_0(p0);
}
private static native long __fieldRead567_0() throws Throwable;
private static native boolean __call567_1(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.String __call567_2(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.String __call567_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call2056700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dbd856bf1323fe7f653d(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws E;
private static final class __SourceHandler_dbd856bf1323fe7f653d {

public static void f1585(net.minecraft.entity.player.InventoryPlayer receiver, int p0) throws Throwable {
    int lexicalValue1585_13_0;
    int lexicalValue1585_17_0;
    int spill1585_0;
    long life2_3;
    int life4_5;
    com.moon.et life5_29;
    int life6_38;
    com.moon.dN life7_63;
    lexical_join_69: {
    lexical_join_65: {
    lexical_join_50: {
    lexical_join_40: {
    lexical_join_18: {
    lexical_join_17: {
    lexical_join_13: {
    lexical_join_12: {
    life2_3 = (__fieldRead1585_0() ^ 76390077654593L);
    life4_5 = __integerCategory1585_2(__call1585_1());
    spill1585_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue1585_13_0 = spill1585_0;
        break lexical_join_13;
    }
    if (!((spill1585_0 > 0))) {
        break lexical_join_12;
    }
    p0 = 1;
    }
    lexicalValue1585_13_0 = p0;
    }
    if (!((life4_5 != 0))) {
        lexicalValue1585_17_0 = lexicalValue1585_13_0;
        break lexical_join_17;
    }
    if (!((lexicalValue1585_13_0 < 0))) {
        break lexical_join_18;
    }
    lexicalValue1585_17_0 = -1;
    }
    p0 = lexicalValue1585_17_0;
    }
    life5_29 = new com.moon.et(__fieldRead1585_3(receiver));
    __call1585_6(__call1585_5(__call1585_4()), life5_29);
    life6_38 = (__call1585_7(life5_29) - p0);
    lexical_cycle_33: while (true) {
    if (!((life6_38 < 0))) {
        break lexical_join_40;
    }
    life6_38 += 9;
    if (!((life4_5 != 0))) {
        break lexical_join_50;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    lexical_cycle_40: while (true) {
    if (!((life6_38 >= __invokedynamic1585_8(5920, (3904513163643749608L ^ life2_3))))) {
        break lexical_join_50;
    }
    life6_38 += -9;
    if (!((life4_5 == 0))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    life7_63 = new com.moon.dN(life6_38);
    __call1585_11(__call1585_10(__call1585_9()), life7_63);
    if (!((life4_5 != 0))) {
        break lexical_join_69;
    }
    if (!(__call1585_12(life7_63))) {
        break lexical_join_65;
    }
    return;
    }
    __fieldWrite1585_14(receiver, __call1585_13(life7_63));
    }
    return;
}
public static void h1585_0(moom.Oo p0) throws Throwable {
    throw __call1158500_0(p0);
}
public static void h1585_1(moom.Oo p0) throws Throwable {
    throw __call1158501_0(p0);
}
public static void h1585_2(moom.Oo p0) throws Throwable {
    throw __call1158502_0(p0);
}
public static void h1585_3(moom.Oo p0) throws Throwable {
    throw __call1158503_0(p0);
}
public static void h1585_4(moom.Oo p0) throws Throwable {
    throw __call1158504_0(p0);
}
private static native long __fieldRead1585_0() throws Throwable;
private static native boolean __call1585_1() throws Throwable;
private static native int __integerCategory1585_2(boolean value) throws Throwable;
private static native int __fieldRead1585_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call1585_4() throws Throwable;
private static native com.moon.events.EventBus __call1585_5(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1585_6(com.moon.events.EventBus a0, com.moon.et a1) throws Throwable;
private static native int __call1585_7(com.moon.et a0) throws Throwable;
private static native int __invokedynamic1585_8(int a0, long a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call1585_9() throws Throwable;
private static native com.moon.events.EventBus __call1585_10(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1585_11(com.moon.events.EventBus a0, com.moon.dN a1) throws Throwable;
private static native boolean __call1585_12(com.moon.dN a0) throws Throwable;
private static native int __call1585_13(com.moon.dN a0) throws Throwable;
private static native void __fieldWrite1585_14(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1158500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158504_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_03b6c044cc8b08622c4b(net.minecraft.entity.player.InventoryPlayer a0, int a1, net.minecraft.item.ItemStack a2) throws E;
private static final class __SourceHandler_03b6c044cc8b08622c4b {

public static void f2849(net.minecraft.entity.player.InventoryPlayer receiver, int p0, net.minecraft.item.ItemStack p1) throws Throwable {
    long life3_3;
    net.minecraft.item.ItemStack[] life6_7;
    int life5_8;
    life3_3 = (__fieldRead2849_0() ^ 94625173330695L);
    boolean spill2849_0 = __call2849_1();
    life6_7 = __fieldRead2849_2(receiver);
    life5_8 = __integerCategory2849_3(spill2849_0);
    if ((life5_8 == 0)) {
        if ((p0 >= (life6_7).length)) {
        p0 = (p0 - (life6_7).length);
        life6_7 = __fieldRead2849_4(receiver);
    }
        (life6_7)[p0] = p1;
    }
    return;
}
public static void h2849_0(moom.Oo p0) throws Throwable {
    throw __call1284900_0(p0);
}
private static native long __fieldRead2849_0() throws Throwable;
private static native boolean __call2849_1() throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead2849_2(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __integerCategory2849_3(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead2849_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call1284900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b2d7ddb8085b69ce2e45(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.nbt.NBTTagList a1) throws E;
private static final class __SourceHandler_b2d7ddb8085b69ce2e45 {

public static void f1586(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.nbt.NBTTagList p0) throws Throwable {
    int lexicalValue1586_62_0;
    int lexicalValue1586_67_0;
    int lexicalValue1586_67_1;
    int lexicalValue1586_80_0;
    int lexicalValue1586_80_1;
    boolean spill1586_0;
    int spill1586_1;
    int spill1586_2;
    int spill1586_3;
    long life2_3;
    int life4_17;
    int life5_19;
    net.minecraft.nbt.NBTTagCompound life6_27;
    int life7_37;
    net.minecraft.item.ItemStack life8_40;
    lexical_join_95: {
    life2_3 = (__fieldRead1586_0() ^ 133860730000371L);
    __fieldWrite1586_2(receiver, new net.minecraft.item.ItemStack[__invokedynamic1586_1(29402, (7936858699825566895L ^ life2_3))]);
    spill1586_0 = __call1586_3();
    __fieldWrite1586_4(receiver, new net.minecraft.item.ItemStack[4]);
    life4_17 = __integerCategory1586_5(spill1586_0);
    life5_19 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_93: {
    lexical_join_92: {
    lexical_join_80: {
    lexical_join_67: {
    lexical_join_62: {
    lexical_join_61: {
    if (!((life5_19 < __call1586_6(p0)))) {
        break lexical_join_95;
    }
    life6_27 = __call1586_7(p0, life5_19);
    life7_37 = (__call1586_8(life6_27, "Slot") & __invokedynamic1586_9(29103, (1060369022795470814L ^ life2_3)));
    life8_40 = __call1586_10(life6_27);
    if (!((life4_17 == 0))) {
        break lexical_join_93;
    }
    if (!((life8_40 != null))) {
        break lexical_join_92;
    }
    spill1586_1 = life7_37;
    if (!((life4_17 == 0))) {
        lexicalValue1586_62_0 = spill1586_1;
        break lexical_join_62;
    }
    if (!((spill1586_1 >= 0))) {
        break lexical_join_61;
    }
    spill1586_2 = life7_37;
    spill1586_3 = (__fieldRead1586_11(receiver)).length;
    if (!((life4_17 == 0))) {
        lexicalValue1586_67_0 = spill1586_2;
        lexicalValue1586_67_1 = spill1586_3;
        break lexical_join_67;
    }
    if (!((spill1586_2 < spill1586_3))) {
        break lexical_join_61;
    }
    (__fieldRead1586_12(receiver))[life7_37] = life8_40;
    }
    lexicalValue1586_62_0 = life7_37;
    }
    lexicalValue1586_67_0 = lexicalValue1586_62_0;
    lexicalValue1586_67_1 = __invokedynamic1586_13(12118, (4286355196563884320L ^ life2_3));
    }
    if (!((life4_17 == 0))) {
        lexicalValue1586_80_0 = lexicalValue1586_67_0;
        lexicalValue1586_80_1 = lexicalValue1586_67_1;
        break lexical_join_80;
    }
    if (!((lexicalValue1586_67_0 >= lexicalValue1586_67_1))) {
        break lexical_join_92;
    }
    lexicalValue1586_80_0 = life7_37;
    lexicalValue1586_80_1 = ((__fieldRead1586_14(receiver)).length + __invokedynamic1586_15(12118, (4286355196563884320L ^ life2_3)));
    }
    if (!((lexicalValue1586_80_0 < lexicalValue1586_80_1))) {
        break lexical_join_92;
    }
    (__fieldRead1586_16(receiver))[(life7_37 - __invokedynamic1586_17(12118, (4286355196563884320L ^ life2_3)))] = life8_40;
    }
    life5_19 += 1;
    }
    if (!((life4_17 != 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return;
}
public static void h1586_0(moom.Oo p0) throws Throwable {
    throw __call1158600_0(p0);
}
public static void h1586_1(moom.Oo p0) throws Throwable {
    throw __call1158601_0(p0);
}
public static void h1586_2(moom.Oo p0) throws Throwable {
    throw __call1158602_0(p0);
}
public static void h1586_3(moom.Oo p0) throws Throwable {
    throw __call1158603_0(p0);
}
public static void h1586_4(moom.Oo p0) throws Throwable {
    throw __call1158604_0(p0);
}
public static void h1586_5(moom.Oo p0) throws Throwable {
    throw __call1158605_0(p0);
}
public static void h1586_6(moom.Oo p0) throws Throwable {
    throw __call1158606_0(p0);
}
public static void h1586_7(moom.Oo p0) throws Throwable {
    throw __call1158607_0(p0);
}
public static void h1586_8(moom.Oo p0) throws Throwable {
    throw __call1158608_0(p0);
}
private static native long __fieldRead1586_0() throws Throwable;
private static native int __invokedynamic1586_1(int a0, long a1) throws Throwable;
private static native void __fieldWrite1586_2(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack[] a1) throws Throwable;
private static native boolean __call1586_3() throws Throwable;
private static native void __fieldWrite1586_4(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack[] a1) throws Throwable;
private static native int __integerCategory1586_5(boolean value) throws Throwable;
private static native int __call1586_6(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1586_7(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native byte __call1586_8(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1586_9(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call1586_10(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1586_11(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1586_12(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __invokedynamic1586_13(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1586_14(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __invokedynamic1586_15(int a0, long a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1586_16(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __invokedynamic1586_17(int a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1158600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158608_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceHandlerCall_2006e0720bcc12db89ce(net.minecraft.entity.player.InventoryPlayer a0) throws E;
private static final class __SourceHandler_2006e0720bcc12db89ce {

public static net.minecraft.item.ItemStack f1587(net.minecraft.entity.player.InventoryPlayer receiver) throws Throwable {
    int forwardValue1587_20_0;
    net.minecraft.entity.player.InventoryPlayer forwardValue1587_22_0;
    net.minecraft.item.ItemStack forwardValue1587_28_0;
    int spill1587_0;
    net.minecraft.entity.player.InventoryPlayer spill1587_1;
    long life1_3;
    int life3_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_22: {
    forward_join_20: {
    life1_3 = (__fieldRead1587_0() ^ 9403307809117L);
    life3_5 = __integerCategory1587_2(__call1587_1());
    spill1587_0 = __fieldRead1587_3(receiver);
    if (!((life3_5 != 0))) {
        forwardValue1587_20_0 = spill1587_0;
        break forward_join_20;
    }
    if (!((spill1587_0 < __invokedynamic1587_4(5920, (3904572488091286516L ^ life1_3))))) {
        break forward_join_27;
    }
    spill1587_1 = receiver;
    if (!((life3_5 != 0))) {
        forwardValue1587_22_0 = spill1587_1;
        break forward_join_22;
    }
    forwardValue1587_20_0 = __fieldRead1587_5(spill1587_1);
    }
    if (!((forwardValue1587_20_0 >= 0))) {
        break forward_join_27;
    }
    forwardValue1587_22_0 = receiver;
    }
    forwardValue1587_28_0 = (__fieldRead1587_6(forwardValue1587_22_0))[__fieldRead1587_7(receiver)];
    break forward_join_28;
    }
    forwardValue1587_28_0 = null;
    }
    return forwardValue1587_28_0;
}
public static void h1587_0(moom.Oo p0) throws Throwable {
    throw __call1158700_0(p0);
}
public static void h1587_1(moom.Oo p0) throws Throwable {
    throw __call1158701_0(p0);
}
public static void h1587_2(moom.Oo p0) throws Throwable {
    throw __call1158702_0(p0);
}
private static native long __fieldRead1587_0() throws Throwable;
private static native boolean __call1587_1() throws Throwable;
private static native int __integerCategory1587_2(boolean value) throws Throwable;
private static native int __fieldRead1587_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __invokedynamic1587_4(int a0, long a1) throws Throwable;
private static native int __fieldRead1587_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1587_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1587_7(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call1158700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158702_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceHandlerCall_d36847abbaa2ad405d97(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws E;
private static final class __SourceHandler_d36847abbaa2ad405d97 {

public static net.minecraft.item.ItemStack f1588(net.minecraft.entity.player.InventoryPlayer receiver, int p0) throws Throwable {
    int forwardValue1588_22_0;
    int forwardValue1588_22_1;
    int spill1588_0;
    int spill1588_1;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack[] life5_14;
    forward_join_27: {
    forward_join_22: {
    forward_join_10: {
    life2_3 = (__fieldRead1588_0() ^ 37904572688135L);
    life4_5 = __integerCategory1588_2(__call1588_1());
    if (!((p0 < 0))) {
        break forward_join_10;
    }
    return null;
    }
    life5_14 = __fieldRead1588_3(receiver);
    spill1588_0 = p0;
    spill1588_1 = (life5_14).length;
    if (!((life4_5 == 0))) {
        forwardValue1588_22_0 = spill1588_0;
        forwardValue1588_22_1 = spill1588_1;
        break forward_join_22;
    }
    if (!((spill1588_0 >= spill1588_1))) {
        break forward_join_27;
    }
    forwardValue1588_22_0 = p0;
    forwardValue1588_22_1 = (life5_14).length;
    }
    p0 = (forwardValue1588_22_0 - forwardValue1588_22_1);
    life5_14 = __fieldRead1588_4(receiver);
    }
    return (life5_14)[p0];
}
public static void h1588_0(moom.Oo p0) throws Throwable {
    throw __call1158800_0(p0);
}
public static void h1588_1(moom.Oo p0) throws Throwable {
    throw __call1158801_0(p0);
}
public static void h1588_2(moom.Oo p0) throws Throwable {
    throw __call1158802_0(p0);
}
private static native long __fieldRead1588_0() throws Throwable;
private static native boolean __call1588_1() throws Throwable;
private static native int __integerCategory1588_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1588_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1588_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call1158800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1158802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1d5b81aa34a5fa8901da(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1) throws E;
private static final class __SourceHandler_1d5b81aa34a5fa8901da {

public static boolean f1589(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.Item p0) throws Throwable {
    int forwardValue1589_15_0;
    int forwardValue1589_17_0;
    boolean spill1589_0;
    int spill1589_1;
    long life2_3;
    int life5_8;
    int life4_9;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (__fieldRead1589_0() ^ 98141265903751L);
    spill1589_0 = __call1589_1();
    life5_8 = __call1589_2(receiver, p0);
    life4_9 = __integerCategory1589_3(spill1589_0);
    spill1589_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1589_15_0 = spill1589_1;
        break forward_join_15;
    }
    if (!((spill1589_1 >= 0))) {
        break forward_join_16;
    }
    forwardValue1589_15_0 = 1;
    }
    forwardValue1589_17_0 = forwardValue1589_15_0;
    break forward_join_17;
    }
    forwardValue1589_17_0 = 0;
    }
    return __integerCategory1589_4(forwardValue1589_17_0);
}
public static void h1589_0(moom.Oo p0) throws Throwable {
    throw __call1158900_0(p0);
}
private static native long __fieldRead1589_0() throws Throwable;
private static native boolean __call1589_1() throws Throwable;
private static native int __call1589_2(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1) throws Throwable;
private static native int __integerCategory1589_3(boolean value) throws Throwable;
private static native boolean __integerCategory1589_4(int value) throws Throwable;
private static native java.lang.Throwable __call1158900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_8b9f13d8f1e3f562f8d2(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_8b9f13d8f1e3f562f8d2 {

public static int f259(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    int forwardValue259_24_0;
    net.minecraft.item.ItemStack forwardValue259_46_0;
    int forwardValue259_72_0;
    int forwardValue259_95_0;
    int forwardValue259_122_0;
    boolean spill259_0;
    int spill259_1;
    net.minecraft.item.ItemStack spill259_2;
    boolean spill259_3;
    int spill259_4;
    long life2_3;
    net.minecraft.item.Item life5_7;
    int life6_10;
    int life4_11;
    int life7_15;
    int life8_93;
    forward_join_122: {
    forward_join_121: {
    forward_join_95: {
    forward_join_94: {
    forward_join_72: {
    forward_join_59: {
    forward_join_46: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (__fieldRead259_0() ^ 103815840114732L);
    spill259_0 = __call259_1();
    life5_7 = __call259_2(p0);
    life6_10 = __fieldRead259_3(p0);
    life4_11 = __integerCategory259_4(spill259_0);
    life7_15 = __call259_5(receiver, p0);
    spill259_1 = life7_15;
    if (!((life4_11 != 0))) {
        forwardValue259_24_0 = spill259_1;
        break forward_join_24;
    }
    if (!((spill259_1 < 0))) {
        break forward_join_23;
    }
    life7_15 = __call259_6(receiver);
    }
    forwardValue259_24_0 = life7_15;
    }
    if (!((life4_11 != 0))) {
        forwardValue259_122_0 = forwardValue259_24_0;
        break forward_join_122;
    }
    if (!((forwardValue259_24_0 >= 0))) {
        break forward_join_121;
    }
    spill259_2 = (__fieldRead259_7(receiver))[life7_15];
    if (!((life4_11 != 0))) {
        forwardValue259_46_0 = spill259_2;
        break forward_join_46;
    }
    if (!((spill259_2 == null))) {
        break forward_join_59;
    }
    (__fieldRead259_8(receiver))[life7_15] = new net.minecraft.item.ItemStack(life5_7, 0, __call259_9(p0));
    forwardValue259_46_0 = p0;
    }
    spill259_3 = __call259_10(forwardValue259_46_0);
    if (!((life4_11 != 0))) {
        forwardValue259_72_0 = __integerCategory259_11(spill259_3);
        break forward_join_72;
    }
    if (!(spill259_3)) {
        break forward_join_59;
    }
    __call259_16((__fieldRead259_12(receiver))[life7_15], __cast259_15(__call259_14(__call259_13(p0))));
    }
    forwardValue259_72_0 = __call259_21(life6_10, (__call259_18((__fieldRead259_17(receiver))[life7_15]) - __fieldRead259_20((__fieldRead259_19(receiver))[life7_15])));
    }
    life8_93 = forwardValue259_72_0;
    spill259_4 = life8_93;
    if (!((life4_11 != 0))) {
        forwardValue259_95_0 = spill259_4;
        break forward_join_95;
    }
    if (!((spill259_4 > (__call259_22(receiver) - __fieldRead259_24((__fieldRead259_23(receiver))[life7_15]))))) {
        break forward_join_94;
    }
    life8_93 = (__call259_25(receiver) - __fieldRead259_27((__fieldRead259_26(receiver))[life7_15]));
    }
    forwardValue259_95_0 = life8_93;
    }
    if (!((life4_11 != 0))) {
        forwardValue259_122_0 = forwardValue259_95_0;
        break forward_join_122;
    }
    if (!((forwardValue259_95_0 != 0))) {
        break forward_join_121;
    }
    life6_10 = (life6_10 - life8_93);
    net.minecraft.item.ItemStack __stackOp259_29_0 = (__fieldRead259_28(receiver))[life7_15];
    __fieldWrite259_31(__stackOp259_29_0, (__fieldRead259_30(__stackOp259_29_0) + life8_93));
    __fieldWrite259_34((__fieldRead259_32(receiver))[life7_15], __invokedynamic259_33(24736, (3248076043775163660L ^ life2_3)));
    }
    forwardValue259_122_0 = life6_10;
    }
    return forwardValue259_122_0;
}
public static void h259_0(moom.Oo p0) throws Throwable {
    throw __call1025900_0(p0);
}
public static void h259_1(moom.Oo p0) throws Throwable {
    throw __call1025901_0(p0);
}
public static void h259_2(moom.Oo p0) throws Throwable {
    throw __call1025902_0(p0);
}
public static void h259_3(moom.Oo p0) throws Throwable {
    throw __call1025903_0(p0);
}
public static void h259_4(moom.Oo p0) throws Throwable {
    throw __call1025904_0(p0);
}
public static void h259_5(moom.Oo p0) throws Throwable {
    throw __call1025905_0(p0);
}
public static void h259_6(moom.Oo p0) throws Throwable {
    throw __call1025906_0(p0);
}
public static void h259_7(moom.Oo p0) throws Throwable {
    throw __call1025907_0(p0);
}
public static void h259_8(moom.Oo p0) throws Throwable {
    throw __call1025908_0(p0);
}
private static native long __fieldRead259_0() throws Throwable;
private static native boolean __call259_1() throws Throwable;
private static native net.minecraft.item.Item __call259_2(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __fieldRead259_3(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory259_4(boolean value) throws Throwable;
private static native int __call259_5(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __call259_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead259_7(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead259_8(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call259_9(net.minecraft.item.ItemStack a0) throws Throwable;
private static native boolean __call259_10(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory259_11(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead259_12(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call259_13(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call259_14(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast259_15(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __call259_16(net.minecraft.item.ItemStack a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead259_17(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call259_18(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead259_19(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead259_20(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call259_21(int a0, int a1) throws Throwable;
private static native int __call259_22(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead259_23(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead259_24(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call259_25(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead259_26(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead259_27(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead259_28(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead259_30(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite259_31(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead259_32(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __invokedynamic259_33(int a0, long a1) throws Throwable;
private static native void __fieldWrite259_34(net.minecraft.item.ItemStack a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1025900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1025908_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fecb98b1d20c839c3623(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.ItemStack a1) throws E;
private static final class __SourceHandler_fecb98b1d20c839c3623 {

public static boolean f1121(net.minecraft.entity.player.InventoryPlayer receiver, net.minecraft.item.ItemStack p0) throws Throwable {
    int forestValue1121_39_0;
    net.minecraft.item.ItemStack forestValue1121_72_0;
    int forestValue1121_96_0;
    boolean spill1121_0;
    net.minecraft.item.ItemStack spill1121_1;
    boolean spill1121_2;
    boolean spill1121_3;
    boolean spill1121_4;
    net.minecraft.item.ItemStack spill1121_5;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_7;
    int life6_10;
    int life4_11;
    int life7_13;
    net.minecraft.item.ItemStack life8_22;
    net.minecraft.item.ItemStack[] life5_56;
    int life6_59;
    int life7_61;
    net.minecraft.item.ItemStack life8_70;
    forest_join_97: {
    forest_join_96: {
    forest_join_95: {
    forest_join_72: {
    forest_join_71: {
    forest_join_70: {
    forest_join_40: {
    forest_join_39: {
    forest_join_38: {
    life2_3 = (__fieldRead1121_0() ^ 15131940959867L);
    spill1121_0 = __call1121_1();
    life5_7 = __fieldRead1121_2(receiver);
    life6_10 = (life5_7).length;
    life4_11 = __integerCategory1121_3(spill1121_0);
    life7_13 = 0;
    forest_cycle_14: while (true) {
    forest_join_35: {
    forest_join_34: {
    if (!((life7_13 < life6_10))) {
        break forest_join_40;
    }
    life8_22 = (life5_7)[life7_13];
    if (!((life4_11 != 0))) {
        break forest_join_35;
    }
    spill1121_1 = life8_22;
    if (!((life4_11 != 0))) {
        forestValue1121_72_0 = spill1121_1;
        break forest_join_72;
    }
    if (!((spill1121_1 != null))) {
        break forest_join_34;
    }
    spill1121_2 = __call1121_4(life8_22, p0);
    if (!((life4_11 != 0))) {
        forestValue1121_39_0 = __integerCategory1121_5(spill1121_2);
        break forest_join_39;
    }
    if (!(spill1121_2)) {
        break forest_join_34;
    }
    break forest_join_38;
    }
    life7_13 += 1;
    }
    if (!((life4_11 == 0))) {
        continue forest_cycle_14;
    }
    break forest_cycle_14;
    }
    break forest_join_40;
    }
    forestValue1121_39_0 = 1;
    }
    return __integerCategory1121_6(forestValue1121_39_0);
    }
    life5_56 = __fieldRead1121_7(receiver);
    life6_59 = (life5_56).length;
    life7_61 = 0;
    forest_cycle_48: while (true) {
    forest_join_67: {
    forest_join_66: {
    if (!((life7_61 < life6_59))) {
        break forest_join_97;
    }
    life8_70 = (life5_56)[life7_61];
    if (!((life4_11 != 0))) {
        break forest_join_67;
    }
    if (!((life8_70 != null))) {
        break forest_join_66;
    }
    spill1121_3 = __call1121_8(life8_70, p0);
    if (!((life4_11 != 0))) {
        forestValue1121_96_0 = __integerCategory1121_9(spill1121_3);
        break forest_join_96;
    }
    if (!(spill1121_3)) {
        break forest_join_66;
    }
    break forest_join_70;
    }
    life7_61 += 1;
    }
    if (!((life4_11 == 0))) {
        continue forest_cycle_48;
    }
    break forest_cycle_48;
    }
    break forest_join_71;
    }
    break forest_join_95;
    }
    break forest_join_97;
    }
    forest_cycle_72: while (true) {
    forest_join_80: {
    if (!((forestValue1121_72_0 != null))) {
        break forest_join_80;
    }
    spill1121_4 = __call1121_10(life8_22, p0);
    if (!((life4_11 != 0))) {
        forestValue1121_96_0 = __integerCategory1121_11(spill1121_4);
        break forest_join_96;
    }
    if (!(spill1121_4)) {
        break forest_join_80;
    }
    break forest_join_95;
    }
    life7_13 += 1;
    forest_cycle_81: while (true) {
    forest_join_84: {
    if (!((life4_11 == 0))) {
        break forest_join_84;
    }
    break forest_join_97;
    }
    if (!((life7_13 < life6_10))) {
        break forest_join_97;
    }
    life8_22 = (life5_7)[life7_13];
    if (!((life4_11 != 0))) {
        continue forest_cycle_81;
    }
    break forest_cycle_81;
    }
    spill1121_5 = life8_22;
    forestValue1121_72_0 = spill1121_5;
    continue forest_cycle_72;
    }
    }
    forestValue1121_96_0 = 1;
    }
    return __integerCategory1121_12(forestValue1121_96_0);
    }
    return __integerCategory1121_13(0);
}
public static boolean h1121_0(moom.Oo p0) throws Throwable {
    throw __call3112100_0(p0);
}
public static boolean h1121_1(moom.Oo p0) throws Throwable {
    throw __call3112101_0(p0);
}
public static boolean h1121_2(moom.Oo p0) throws Throwable {
    throw __call3112102_0(p0);
}
public static boolean h1121_3(moom.Oo p0) throws Throwable {
    throw __call3112103_0(p0);
}
public static boolean h1121_4(moom.Oo p0) throws Throwable {
    throw __call3112104_0(p0);
}
public static boolean h1121_5(moom.Oo p0) throws Throwable {
    throw __call3112105_0(p0);
}
public static boolean h1121_6(moom.Oo p0) throws Throwable {
    throw __call3112106_0(p0);
}
private static native long __fieldRead1121_0() throws Throwable;
private static native boolean __call1121_1() throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1121_2(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __integerCategory1121_3(boolean value) throws Throwable;
private static native boolean __call1121_4(net.minecraft.item.ItemStack a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __integerCategory1121_5(boolean value) throws Throwable;
private static native boolean __integerCategory1121_6(int value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1121_7(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call1121_8(net.minecraft.item.ItemStack a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __integerCategory1121_9(boolean value) throws Throwable;
private static native boolean __call1121_10(net.minecraft.item.ItemStack a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __integerCategory1121_11(boolean value) throws Throwable;
private static native boolean __integerCategory1121_12(int value) throws Throwable;
private static native boolean __integerCategory1121_13(int value) throws Throwable;
private static native java.lang.Throwable __call3112100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112106_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceHandlerCall_1d8c3caa4efb7ec73363(net.minecraft.entity.player.InventoryPlayer a0) throws E;
private static final class __SourceHandler_1d8c3caa4efb7ec73363 {

public static net.minecraft.item.ItemStack f1592(net.minecraft.entity.player.InventoryPlayer receiver) throws Throwable {
    int forwardValue1592_28_0;
    net.minecraft.item.ItemStack forwardValue1592_36_0;
    boolean spill1592_0;
    int spill1592_1;
    long life1_3;
    com.moon.eN life4_9;
    int life3_15;
    forward_join_36: {
    forward_join_35: {
    forward_join_28: {
    life1_3 = (__fieldRead1592_0() ^ 18643985677381L);
    life4_9 = new com.moon.eN(__fieldRead1592_1(receiver));
    spill1592_0 = __call1592_2();
    __call1592_5(__call1592_4(__call1592_3()), life4_9);
    life3_15 = __integerCategory1592_6(spill1592_0);
    spill1592_1 = __call1592_7(life4_9);
    if (!((life3_15 != 0))) {
        forwardValue1592_28_0 = spill1592_1;
        break forward_join_28;
    }
    if (!((spill1592_1 < __invokedynamic1592_8(5920, (3904563170228264684L ^ life1_3))))) {
        break forward_join_35;
    }
    forwardValue1592_28_0 = __call1592_9(life4_9);
    }
    if (!((forwardValue1592_28_0 >= 0))) {
        break forward_join_35;
    }
    forwardValue1592_36_0 = (__fieldRead1592_10(receiver))[__call1592_11(life4_9)];
    break forward_join_36;
    }
    forwardValue1592_36_0 = null;
    }
    return forwardValue1592_36_0;
}
public static void h1592_0(moom.Oo p0) throws Throwable {
    throw __call1159200_0(p0);
}
public static void h1592_1(moom.Oo p0) throws Throwable {
    throw __call1159201_0(p0);
}
public static void h1592_2(moom.Oo p0) throws Throwable {
    throw __call1159202_0(p0);
}
private static native long __fieldRead1592_0() throws Throwable;
private static native int __fieldRead1592_1(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call1592_2() throws Throwable;
private static native com.moon.runtime.ClientContext __call1592_3() throws Throwable;
private static native com.moon.events.EventBus __call1592_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1592_5(com.moon.events.EventBus a0, com.moon.eN a1) throws Throwable;
private static native int __integerCategory1592_6(boolean value) throws Throwable;
private static native int __call1592_7(com.moon.eN a0) throws Throwable;
private static native int __invokedynamic1592_8(int a0, long a1) throws Throwable;
private static native int __call1592_9(com.moon.eN a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1592_10(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __call1592_11(com.moon.eN a0) throws Throwable;
private static native java.lang.Throwable __call1159200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceHandlerCall_385f4f23959101c2dc67(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws E;
private static final class __SourceHandler_385f4f23959101c2dc67 {

public static net.minecraft.item.ItemStack f1593(net.minecraft.entity.player.InventoryPlayer receiver, int p0) throws Throwable {
    int forwardValue1593_23_0;
    int forwardValue1593_23_1;
    net.minecraft.item.ItemStack forwardValue1593_34_0;
    boolean spill1593_0;
    int spill1593_1;
    int spill1593_2;
    net.minecraft.item.ItemStack spill1593_3;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_7;
    int life4_8;
    net.minecraft.item.ItemStack life6_43;
    forward_join_41: {
    forward_join_34: {
    forward_join_25: {
    forward_join_23: {
    life2_3 = (__fieldRead1593_0() ^ 21894359413372L);
    spill1593_0 = __call1593_1();
    life5_7 = __fieldRead1593_2(receiver);
    life4_8 = __integerCategory1593_3(spill1593_0);
    spill1593_1 = p0;
    spill1593_2 = (__fieldRead1593_4(receiver)).length;
    if (!((life4_8 != 0))) {
        forwardValue1593_23_0 = spill1593_1;
        forwardValue1593_23_1 = spill1593_2;
        break forward_join_23;
    }
    if (!((spill1593_1 >= spill1593_2))) {
        break forward_join_25;
    }
    life5_7 = __fieldRead1593_5(receiver);
    forwardValue1593_23_0 = p0;
    forwardValue1593_23_1 = (__fieldRead1593_6(receiver)).length;
    }
    p0 = (forwardValue1593_23_0 - forwardValue1593_23_1);
    }
    spill1593_3 = (life5_7)[p0];
    if (!((life4_8 != 0))) {
        forwardValue1593_34_0 = spill1593_3;
        break forward_join_34;
    }
    if (!((spill1593_3 != null))) {
        break forward_join_41;
    }
    forwardValue1593_34_0 = (life5_7)[p0];
    }
    life6_43 = forwardValue1593_34_0;
    (life5_7)[p0] = null;
    return life6_43;
    }
    return null;
}
public static void h1593_0(moom.Oo p0) throws Throwable {
    throw __call1159300_0(p0);
}
public static void h1593_1(moom.Oo p0) throws Throwable {
    throw __call1159301_0(p0);
}
public static void h1593_2(moom.Oo p0) throws Throwable {
    throw __call1159302_0(p0);
}
private static native long __fieldRead1593_0() throws Throwable;
private static native boolean __call1593_1() throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1593_2(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __integerCategory1593_3(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1593_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1593_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1593_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call1159300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_443229518a872f7f1f25() throws E;
private static final class __SourceHandler_443229518a872f7f1f25 {

public static boolean f2858() throws Throwable {
    int life0_1;
    life0_1 = __integerCategory2858_1(__call2858_0());
    if ((life0_1 == 0)) {
        return true;
    }
    return false;
}
public static void h2858_0(moom.Oo p0) throws Throwable {
    throw __call1285800_0(p0);
}
private static native boolean __call2858_0() throws Throwable;
private static native int __integerCategory2858_1(boolean value) throws Throwable;
private static native java.lang.Throwable __call1285800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d928e4f48b81680ab41f(net.minecraft.entity.player.InventoryPlayer a0) throws E;
private static final class __SourceHandler_d928e4f48b81680ab41f {

public static void f1594(net.minecraft.entity.player.InventoryPlayer receiver) throws Throwable {
    net.minecraft.item.ItemStack lexicalValue1594_24_0;
    net.minecraft.item.ItemStack lexicalValue1594_37_0;
    net.minecraft.world.World lexicalValue1594_37_1;
    net.minecraft.entity.player.EntityPlayer lexicalValue1594_37_2;
    int lexicalValue1594_37_3;
    int lexicalValue1594_37_4;
    net.minecraft.item.ItemStack lexicalValue1594_38_0;
    net.minecraft.world.World lexicalValue1594_38_1;
    net.minecraft.entity.player.EntityPlayer lexicalValue1594_38_2;
    int lexicalValue1594_38_3;
    net.minecraft.item.ItemStack lexicalValue1594_39_0;
    net.minecraft.world.World lexicalValue1594_39_1;
    net.minecraft.entity.player.EntityPlayer lexicalValue1594_39_2;
    int lexicalValue1594_39_3;
    int lexicalValue1594_39_4;
    boolean spill1594_0;
    net.minecraft.item.ItemStack spill1594_1;
    net.minecraft.world.World spill1594_2;
    net.minecraft.entity.player.EntityPlayer spill1594_3;
    int spill1594_4;
    int spill1594_5;
    long life1_3;
    int life4_6;
    int life3_7;
    lexical_join_43: {
    life1_3 = (__fieldRead1594_0() ^ 51207989564751L);
    spill1594_0 = __call1594_1();
    life4_6 = 0;
    life3_7 = __integerCategory1594_2(spill1594_0);
    lexical_cycle_8: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_24: {
    if (!((life4_6 < (__fieldRead1594_3(receiver)).length))) {
        break lexical_join_43;
    }
    spill1594_1 = (__fieldRead1594_4(receiver))[life4_6];
    if (!((life3_7 != 0))) {
        lexicalValue1594_24_0 = spill1594_1;
        break lexical_join_24;
    }
    if (!((spill1594_1 != null))) {
        break lexical_join_40;
    }
    lexicalValue1594_24_0 = (__fieldRead1594_5(receiver))[life4_6];
    }
    spill1594_2 = __fieldRead1594_7(__fieldRead1594_6(receiver));
    spill1594_3 = __fieldRead1594_8(receiver);
    spill1594_4 = life4_6;
    spill1594_5 = __fieldRead1594_9(receiver);
    if (!((life3_7 != 0))) {
        lexicalValue1594_37_0 = lexicalValue1594_24_0;
        lexicalValue1594_37_1 = spill1594_2;
        lexicalValue1594_37_2 = spill1594_3;
        lexicalValue1594_37_3 = spill1594_4;
        lexicalValue1594_37_4 = spill1594_5;
        break lexical_join_37;
    }
    if (!((spill1594_5 == life4_6))) {
        lexicalValue1594_38_0 = lexicalValue1594_24_0;
        lexicalValue1594_38_1 = spill1594_2;
        lexicalValue1594_38_2 = spill1594_3;
        lexicalValue1594_38_3 = spill1594_4;
        break lexical_join_38;
    }
    lexicalValue1594_37_0 = lexicalValue1594_24_0;
    lexicalValue1594_37_1 = spill1594_2;
    lexicalValue1594_37_2 = spill1594_3;
    lexicalValue1594_37_3 = spill1594_4;
    lexicalValue1594_37_4 = 1;
    }
    lexicalValue1594_39_0 = lexicalValue1594_37_0;
    lexicalValue1594_39_1 = lexicalValue1594_37_1;
    lexicalValue1594_39_2 = lexicalValue1594_37_2;
    lexicalValue1594_39_3 = lexicalValue1594_37_3;
    lexicalValue1594_39_4 = lexicalValue1594_37_4;
    break lexical_join_39;
    }
    lexicalValue1594_39_0 = lexicalValue1594_38_0;
    lexicalValue1594_39_1 = lexicalValue1594_38_1;
    lexicalValue1594_39_2 = lexicalValue1594_38_2;
    lexicalValue1594_39_3 = lexicalValue1594_38_3;
    lexicalValue1594_39_4 = 0;
    }
    __call1594_10(lexicalValue1594_39_0, lexicalValue1594_39_1, lexicalValue1594_39_2, lexicalValue1594_39_3, lexicalValue1594_39_4);
    }
    life4_6 += 1;
    if (!((life3_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}
public static void h1594_0(moom.Oo p0) throws Throwable {
    throw __call1159400_0(p0);
}
public static void h1594_1(moom.Oo p0) throws Throwable {
    throw __call1159401_0(p0);
}
public static void h1594_2(moom.Oo p0) throws Throwable {
    throw __call1159402_0(p0);
}
public static void h1594_3(moom.Oo p0) throws Throwable {
    throw __call1159403_0(p0);
}
private static native long __fieldRead1594_0() throws Throwable;
private static native boolean __call1594_1() throws Throwable;
private static native int __integerCategory1594_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1594_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1594_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1594_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead1594_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1594_7(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead1594_8(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead1594_9(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call1594_10(net.minecraft.item.ItemStack a0, net.minecraft.world.World a1, net.minecraft.entity.player.EntityPlayer a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1159400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_458dc4500cc76922d1be(net.minecraft.entity.player.InventoryPlayer a0) throws E;
private static final class __SourceHandler_458dc4500cc76922d1be {

public static void f1122(net.minecraft.entity.player.InventoryPlayer receiver) throws Throwable {
    net.minecraft.item.ItemStack[] forestValue1122_35_0;
    int forestValue1122_35_1;
    net.minecraft.item.ItemStack[] forestValue1122_67_0;
    int forestValue1122_67_1;
    net.minecraft.item.ItemStack forestValue1122_73_0;
    net.minecraft.item.ItemStack[] forestValue1122_87_0;
    int forestValue1122_87_1;
    net.minecraft.item.ItemStack[] forestValue1122_119_0;
    int forestValue1122_119_1;
    net.minecraft.item.ItemStack[] forestValue1122_122_0;
    int forestValue1122_122_1;
    boolean spill1122_0;
    net.minecraft.item.ItemStack[] spill1122_1;
    int spill1122_2;
    net.minecraft.item.ItemStack spill1122_3;
    net.minecraft.item.ItemStack[] spill1122_4;
    int spill1122_5;
    net.minecraft.item.ItemStack[] spill1122_6;
    int spill1122_7;
    net.minecraft.item.ItemStack[] spill1122_8;
    int spill1122_9;
    net.minecraft.item.ItemStack spill1122_10;
    long life1_3;
    int life4_6;
    int life3_7;
    int life4_51;
    forest_join_124: {
    forest_join_73: {
    forest_join_40: {
    life1_3 = (__fieldRead1122_0() ^ 128542043915834L);
    spill1122_0 = __call1122_1();
    life4_6 = 0;
    life3_7 = __integerCategory1122_2(spill1122_0);
    forest_cycle_8: while (true) {
    forest_join_37: {
    forest_join_35: {
    if (!((life4_6 < (__fieldRead1122_3(receiver)).length))) {
        break forest_join_40;
    }
    spill1122_1 = __fieldRead1122_4(receiver);
    spill1122_2 = life4_6;
    if (!((life3_7 == 0))) {
        forestValue1122_35_0 = spill1122_1;
        forestValue1122_35_1 = spill1122_2;
        break forest_join_35;
    }
    spill1122_3 = (spill1122_1)[spill1122_2];
    if (!((life3_7 == 0))) {
        forestValue1122_73_0 = spill1122_3;
        break forest_join_73;
    }
    if (!((spill1122_3 != null))) {
        break forest_join_37;
    }
    __call1122_7(__fieldRead1122_5(receiver), (__fieldRead1122_6(receiver))[life4_6], 1, 0);
    forestValue1122_35_0 = __fieldRead1122_8(receiver);
    forestValue1122_35_1 = life4_6;
    }
    (forestValue1122_35_0)[forestValue1122_35_1] = null;
    }
    life4_6 += 1;
    if (!((life3_7 != 0))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    life4_51 = 0;
    forest_cycle_42: while (true) {
    forest_join_69: {
    forest_join_67: {
    if (!((life4_51 < (__fieldRead1122_9(receiver)).length))) {
        break forest_join_124;
    }
    spill1122_4 = __fieldRead1122_10(receiver);
    spill1122_5 = life4_51;
    if (!((life3_7 == 0))) {
        forestValue1122_67_0 = spill1122_4;
        forestValue1122_67_1 = spill1122_5;
        break forest_join_67;
    }
    if (!(((spill1122_4)[spill1122_5] != null))) {
        break forest_join_69;
    }
    __call1122_13(__fieldRead1122_11(receiver), (__fieldRead1122_12(receiver))[life4_51], 1, 0);
    forestValue1122_67_0 = __fieldRead1122_14(receiver);
    forestValue1122_67_1 = life4_51;
    }
    (forestValue1122_67_0)[forestValue1122_67_1] = null;
    }
    life4_51 += 1;
    if (!((life3_7 != 0))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_join_124;
    }
    forest_cycle_73: while (true) {
    forest_join_122: {
    forest_join_104: {
    if (!((forestValue1122_73_0 != null))) {
        break forest_join_104;
    }
    __call1122_17(__fieldRead1122_15(receiver), (__fieldRead1122_16(receiver))[life4_6], 1, 0);
    forestValue1122_87_0 = __fieldRead1122_18(receiver);
    forestValue1122_87_1 = life4_6;
    forest_cycle_87: while (true) {
    forest_join_93: {
    (forestValue1122_87_0)[forestValue1122_87_1] = null;
    life4_6 += 1;
    if (!((life3_7 != 0))) {
        break forest_join_93;
    }
    break forest_join_124;
    }
    if (!((life4_6 < (__fieldRead1122_19(receiver)).length))) {
        break forest_join_124;
    }
    spill1122_6 = __fieldRead1122_20(receiver);
    spill1122_7 = life4_6;
    if (!((life3_7 == 0))) {
        forestValue1122_87_0 = spill1122_6;
        forestValue1122_87_1 = spill1122_7;
        continue forest_cycle_87;
    }
    break forest_cycle_87;
    }
    forestValue1122_122_0 = spill1122_6;
    forestValue1122_122_1 = spill1122_7;
    break forest_join_122;
    }
    forest_cycle_104: while (true) {
    forest_join_119: {
    forest_join_108: {
    life4_6 += 1;
    if (!((life3_7 != 0))) {
        break forest_join_108;
    }
    break forest_join_124;
    }
    if (!((life4_6 < (__fieldRead1122_21(receiver)).length))) {
        break forest_join_124;
    }
    spill1122_8 = __fieldRead1122_22(receiver);
    spill1122_9 = life4_6;
    if (!((life3_7 == 0))) {
        forestValue1122_119_0 = spill1122_8;
        forestValue1122_119_1 = spill1122_9;
        break forest_join_119;
    }
    forestValue1122_122_0 = spill1122_8;
    forestValue1122_122_1 = spill1122_9;
    break forest_join_122;
    }
    (forestValue1122_119_0)[forestValue1122_119_1] = null;
    continue forest_cycle_104;
    }
    }
    spill1122_10 = (forestValue1122_122_0)[forestValue1122_122_1];
    forestValue1122_73_0 = spill1122_10;
    continue forest_cycle_73;
    }
    }
    return;
}
public static void h1122_0(moom.Oo p0) throws Throwable {
    throw __call3112200_0(p0);
}
public static void h1122_1(moom.Oo p0) throws Throwable {
    throw __call3112201_0(p0);
}
public static void h1122_2(moom.Oo p0) throws Throwable {
    throw __call3112202_0(p0);
}
public static void h1122_3(moom.Oo p0) throws Throwable {
    throw __call3112203_0(p0);
}
public static void h1122_4(moom.Oo p0) throws Throwable {
    throw __call3112204_0(p0);
}
private static native long __fieldRead1122_0() throws Throwable;
private static native boolean __call1122_1() throws Throwable;
private static native int __integerCategory1122_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead1122_5(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_6(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call1122_7(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_8(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_9(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_10(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead1122_11(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_12(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call1122_13(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_14(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead1122_15(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_16(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call1122_17(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.item.ItemStack a1, int a2, int a3) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_18(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_19(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_20(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_21(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1122_22(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call3112200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3112204_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_030449941ccb499a55b0(net.minecraft.entity.player.InventoryPlayer a0) throws E;
private static final class __SourceHandler_030449941ccb499a55b0 {

public static int f1596(net.minecraft.entity.player.InventoryPlayer receiver) throws Throwable {
    boolean spill1596_0;
    long life1_3;
    int life4_6;
    int life3_7;
    lexical_join_23: {
    life1_3 = (__fieldRead1596_0() ^ 49412392685232L);
    spill1596_0 = __call1596_1();
    life4_6 = 0;
    life3_7 = __integerCategory1596_2(spill1596_0);
    lexical_cycle_8: while (true) {
    lexical_join_20: {
    if (!((life4_6 < (__fieldRead1596_3(receiver)).length))) {
        break lexical_join_23;
    }
    if (!(((__fieldRead1596_4(receiver))[life4_6] == null))) {
        break lexical_join_20;
    }
    return life4_6;
    }
    life4_6 += 1;
    if (!((life3_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return -1;
}
public static void h1596_0(moom.Oo p0) throws Throwable {
    throw __call1159600_0(p0);
}
private static native long __fieldRead1596_0() throws Throwable;
private static native boolean __call1596_1() throws Throwable;
private static native int __integerCategory1596_2(boolean value) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1596_3(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1596_4(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native java.lang.Throwable __call1159600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_3668fa07dc01af8b3a56(net.minecraft.entity.player.InventoryPlayer a0) throws E;
private static final class __SourceHandler_3668fa07dc01af8b3a56 {

public static int f1597(net.minecraft.entity.player.InventoryPlayer receiver) throws Throwable {
    int lexicalValue1597_37_0;
    boolean spill1597_0;
    int spill1597_1;
    long life1_3;
    int life4_5;
    net.minecraft.item.ItemStack[] life5_8;
    int life6_11;
    int life7_14;
    int life3_15;
    net.minecraft.item.ItemStack life8_22;
    int life9_49;
    lexical_join_45: {
    life1_3 = (__fieldRead1597_0() ^ 29686562286113L);
    life4_5 = 0;
    life5_8 = __fieldRead1597_1(receiver);
    life6_11 = (life5_8).length;
    spill1597_0 = __call1597_2();
    life7_14 = 0;
    life3_15 = __integerCategory1597_3(spill1597_0);
    lexical_cycle_16: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_37: {
    if (!((life7_14 < life6_11))) {
        break lexical_join_45;
    }
    life8_22 = (life5_8)[life7_14];
    if (!((life3_15 == 0))) {
        break lexical_join_43;
    }
    if (!((life8_22 != null))) {
        break lexical_join_42;
    }
    spill1597_1 = __instanceOf1597_5(__call1597_4(life8_22));
    if (!((life3_15 == 0))) {
        lexicalValue1597_37_0 = spill1597_1;
        break lexical_join_37;
    }
    if (!((spill1597_1 != 0))) {
        break lexical_join_42;
    }
    lexicalValue1597_37_0 = __fieldRead1597_8(__cast1597_7(__call1597_6(life8_22)));
    }
    life9_49 = lexicalValue1597_37_0;
    life4_5 = (life4_5 + life9_49);
    }
    life7_14 += 1;
    }
    if (!((life3_15 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return life4_5;
}
public static void h1597_0(moom.Oo p0) throws Throwable {
    throw __call1159700_0(p0);
}
public static void h1597_1(moom.Oo p0) throws Throwable {
    throw __call1159701_0(p0);
}
public static void h1597_2(moom.Oo p0) throws Throwable {
    throw __call1159702_0(p0);
}
public static void h1597_3(moom.Oo p0) throws Throwable {
    throw __call1159703_0(p0);
}
private static native long __fieldRead1597_0() throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead1597_1(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native boolean __call1597_2() throws Throwable;
private static native int __integerCategory1597_3(boolean value) throws Throwable;
private static native net.minecraft.item.Item __call1597_4(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __instanceOf1597_5(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.item.Item __call1597_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.item.ItemArmor __cast1597_7(net.minecraft.item.Item a0) throws Throwable;
private static native int __fieldRead1597_8(net.minecraft.item.ItemArmor a0) throws Throwable;
private static native java.lang.Throwable __call1159700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1159703_0(moom.Oo a0) throws Throwable;

}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_fecb98b1d20c839c3623(this, p0); }


private int b(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_8b9f13d8f1e3f562f8d2(this, p0); }


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public boolean b(net.minecraft.item.Item p0) { return __sourceHandlerCall_1d5b81aa34a5fa8901da(this, p0); }


public net.minecraft.item.ItemStack b__xW(int p0) { return __sourceHandlerCall_385f4f23959101c2dc67(this, p0); }


public int b__Int() {
return ((this.a).length + 4);
}


public static boolean b__Boolean() {
return ((((net.minecraft.entity.player.InventoryPlayer.g) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
g = ((boolean)(p0));
    return;
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.a)), ((java.lang.Object)(null)));
    java.util.Arrays.fill(((java.lang.Object[])(this.b)), ((java.lang.Object)(null)));
    return;
}


public net.minecraft.item.ItemStack b__xW() { return __sourceHandlerCall_1d8c3caa4efb7ec73363(this); }


public static int e() {
long local0 = (net.minecraft.entity.player.InventoryPlayer.h ^ 100707586943682L);
    return __sourceIntrinsic_c4b63a62bb23_originalDynamicSite2012_1(14705, (8283307858398864944L ^ local0));
}


public boolean e__Boolean() {
return ((0) != 0);
}


public int c__Int() {
long local1 = (net.minecraft.entity.player.InventoryPlayer.h ^ 95609374034772L);
    return __sourceIntrinsic_240e736e888e_originalDynamicSite2013_1(346, (8665960907598905231L ^ local1));
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public static boolean c__Boolean() { return __sourceHandlerCall_443229518a872f7f1f25(); }


public net.minecraft.item.ItemStack c(int p0) {
return (this.b)[p0];
}


public net.minecraft.item.ItemStack c__xW() {
return this.e;
}


public void c__Void() { __sourceHandlerCall_d928e4f48b81680ab41f(this); }


public int f() { return __sourceHandlerCall_030449941ccb499a55b0(this); }


public void d__Void() { __sourceHandlerCall_458dc4500cc76922d1be(this); }


public int d__Int() {
return 0;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


public void a(net.minecraft.entity.player.InventoryPlayer p0) { __sourceHandlerCall_c23a06bc3214e2817280(this, p0); }


public void a__Void(int p0, int p1) {
return;
}


public int a(net.minecraft.item.Item p0, int p1, int p2, net.minecraft.nbt.NBTTagCompound p3) { return __sourceHandlerCall_0a0b89bed65c0fb9d23d(this, p0, p1, p2, p3); }


public void a__Void(int p0) { __sourceHandlerCall_dbd856bf1323fe7f653d(this, p0); }


public void a(net.minecraft.item.Item p0, int p1, boolean p2, boolean p3) { __sourceHandlerCall_c5d647e3c666441f5c3c(this, p0, p1, p2, p3); }


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public net.minecraft.item.ItemStack a__xW() { return __sourceHandlerCall_2006e0720bcc12db89ce(this); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6946;
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
         long var5 = i[var3];
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
            throw new RuntimeException("moom/v0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.player.InventoryPlayer.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11838_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/v0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private int a(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_537d4bbfcad4d825a027(this, p0); }


private int a(net.minecraft.item.Item p0, int p1) { return __sourceHandlerCall_82d3c14ee4da7bead121(this, p0, p1); }


private int a(net.minecraft.item.Item p0) { return __sourceHandlerCall_9d59db0ef32548d15a53(this, p0); }


public net.minecraft.item.ItemStack a__xW(int p0) { return __sourceHandlerCall_d36847abbaa2ad405d97(this, p0); }


public java.lang.String a__String() {
return "container.inventory";
}


public net.minecraft.item.ItemStack a(int p0, int p1) { return __sourceHandlerCall_1722712a7694bb62e0d9(this, p0, p1); }


public net.minecraft.util.IChatComponent a__C5() { return __sourceHandlerCall_8c5d06020b6ad54ff3b6(this); }


public float a(net.minecraft.block.Block p0, int p1) { return __sourceHandlerCall_e34f49d5570ff678f585(this, p0, p1); }


public net.minecraft.nbt.NBTTagList a(net.minecraft.nbt.NBTTagList p0) { return __sourceHandlerCall_d5480d1ba642d25800ca(this, p0); }


public void a__Void(net.minecraft.nbt.NBTTagList p0) { __sourceHandlerCall_b2d7ddb8085b69ce2e45(this, p0); }


public void a__Void(int p0, net.minecraft.item.ItemStack p1) { __sourceHandlerCall_03b6c044cc8b08622c4b(this, p0, p1); }


public void a(float p0) { __sourceHandlerCall_22638a6ad0c8e724ff13(this, p0); }


public void a__Void() {
this.f = ((boolean)(true));
    return;
}


public void a__Void(net.minecraft.item.ItemStack p0) {
this.e = ((net.minecraft.item.ItemStack)(p0));
    return;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) { return __sourceHandlerCall_0b2f1d997bfd8e5cc93b(this, p0); }


public boolean a__Boolean(net.minecraft.item.ItemStack p0) { return __sourceHandlerCall_45eae113c4b054fa0338(this, p0); }


public boolean a__Boolean(net.minecraft.item.Item p0) { return __sourceHandlerCall_2ed35f6d16bbffd3dae8(this, p0); }


public boolean a__Boolean(net.minecraft.block.Block p0, int p1) { return __sourceHandlerCall_e5f98176860d5e8468a0(this, p0, p1); }


public int g() { return __sourceHandlerCall_3668fa07dc01af8b3a56(this); }


private static native <E extends Throwable> int __sourceIntrinsic_512c959274d329ae_originalDynamicSite3897_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11838_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_240e736e888e_originalDynamicSite2013_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_originalDynamicSite2012_1(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
