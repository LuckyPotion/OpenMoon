package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wi extends moom.v8 {

private net.minecraft.entity.IMerchant k;

private moom.wA l;

private net.minecraft.world.World m;

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public wi(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.IMerchant p1, net.minecraft.world.World p2) { super(); }


private static void __sourceConstructorBody_64e3f2f913f1945d(moom.wi receiver, net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.IMerchant p1, net.minecraft.world.World p2) throws Throwable {

int __initValue755_155_0;

    long local4_life2;

    net.minecraft.entity.Entity[] local6_life16;

    int local7_life30;

    int local8_life32;

    init_join_192: {

    init_join_155: {

    init_join_154: {

    local4_life2 = (moom.wi.n ^ 131565721931286L);

    moom.wi.__sourceConstructorInit_64e3f2f913f1945d_0(((moom.wi)(receiver)));

    ((moom.wi)(receiver)).k = ((net.minecraft.entity.IMerchant)(p1));

    net.minecraft.entity.Entity[] __sourceSpill755_7 = moom.v8.b__Arrayr3();

    ((moom.wi)(receiver)).m = ((net.minecraft.world.World)(p2));

    ((moom.wi)(receiver)).l = ((moom.wA)(new moom.wA(((net.minecraft.entity.player.InventoryPlayer)(p0)).d, p1)));

    ((moom.wi)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) ((moom.wi)(receiver)).l), 0, __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_12(5584, (6070552465456416641L ^ local4_life2)), __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_14(11143, (1433558140042836435L ^ local4_life2))))));

    local6_life16 = __sourceSpill755_7;

    ((moom.wi)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) ((moom.wi)(receiver)).l), 1, __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_19(8512, (3155166672342217501L ^ local4_life2)), __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_21(15443, (3497976591528750592L ^ local4_life2))))));

    ((moom.wi)(receiver)).a(((moom.wB)(new moom.wP(((net.minecraft.entity.player.InventoryPlayer)(p0)).d, p1, ((moom.wi)(receiver)).l, 2, __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_26(12963, (2614201507461193976L ^ local4_life2)), __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_28(15443, (3497976591528750592L ^ local4_life2))))));

    local7_life30 = 0;

    init_cycle_84: while (true) {

    init_join_152: {

    init_join_151: {

    if (!((local7_life30 < 3))) {

        break init_join_154;

    }

    int __sourceSpill755_31 = 0;

    if (!((local6_life16 == null))) {

        __initValue755_155_0 = __sourceSpill755_31;

        break init_join_155;

    }

    local8_life32 = __sourceSpill755_31;

    init_cycle_91: while (true) {

    if (!((local8_life32 < __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_34(18197, (270647307012085056L ^ local4_life2))))) {

        break init_join_151;

    }

    ((moom.wi)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), ((local8_life32 + (local7_life30 * __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_36(8937, (5140055251316437169L ^ local4_life2)))) + __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_38(8937, (5140055251316437169L ^ local4_life2))), (__sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_40(18230, (8039724378002888036L ^ local4_life2)) + (local8_life32 * __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_42(5968, (2675744809480144135L ^ local4_life2)))), (__sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_44(15403, (6499030678729944692L ^ local4_life2)) + (local7_life30 * __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_46(25542, (125635828943303066L ^ local4_life2))))))));

    local8_life32 += 1;

    if (!((local6_life16 == null))) {

        break init_join_152;

    }

    if (!((local6_life16 != null))) { continue init_cycle_91; }

    break init_cycle_91;

    }

    }

    local7_life30 += 1;

    }

    if (!((local6_life16 != null))) { continue init_cycle_84; }

    break init_cycle_84;

    }

    }

    __initValue755_155_0 = 0;

    }

    local7_life30 = __initValue755_155_0;

    init_cycle_156: while (true) {

    if (!((local7_life30 < __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_49(8937, (5140055251316437169L ^ local4_life2))))) {

        break init_join_192;

    }

    ((moom.wi)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), local7_life30, (__sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_51(7551, (3895138385308405551L ^ local4_life2)) + (local7_life30 * __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_53(25542, (125635828943303066L ^ local4_life2)))), __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_55(2393, (2389685577161235207L ^ local4_life2))))));

    local7_life30 += 1;

    if (!((local6_life16 != null))) { continue init_cycle_156; }

    break init_cycle_156;

    }

    }

    return;

}



static {
n = ((long)(((moom._a)(moom._c.a(((long)(8886137757360298010L)), ((long)(7543184724446635784L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(71294262591178L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wi.n ^ 3642844658239L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1651_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1651_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1651_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1651_14 = new byte[8];
    (__sourceSpill1651_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1651_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1651_16 = __sourceSpill1651_14;
    ((javax.crypto.Cipher)(__sourceSpill1651_11)).init(((int)(__sourceSpill1651_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1651_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1651_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[17];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "0ÇsY)Ñnáú\033Z/×®¸\027\000*°ÒhiÛÈ¬CýÝ8ò¶l`|ý)=¥ßfºµ\024¬ò±Ò£ß\032âRïñ3£vÎ\025-ü@ã9M6Rs#\002«X9k\017B~ÚáÂÀ¯RN<k#ýüêjh\030®x4¦[\017{ò Ú©µ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1651_25 = local6_life21;
        int __sourceSpill1651_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1651_25)).substring(((int)(__sourceSpill1651_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1651_30 = local8_life19;
        int __sourceSpill1651_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1651_33 = new byte[8];
        (__sourceSpill1651_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1651_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1651_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1651_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1651_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1651_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1651_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1651_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1651_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1651_34)).doFinal(((byte[])(__sourceSpill1651_33)));
        (__sourceSpill1651_30)[__sourceSpill1651_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "x~\037Ê­KÃ§\024\005\027\037\r+ %"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1651_38 = local6_life21;
        int __sourceSpill1651_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1651_38)).substring(((int)(__sourceSpill1651_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1651_43 = local8_life19;
        int __sourceSpill1651_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1651_46 = new byte[8];
        (__sourceSpill1651_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1651_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1651_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1651_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1651_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1651_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1651_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1651_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1651_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1651_47)).doFinal(((byte[])(__sourceSpill1651_46)));
        (__sourceSpill1651_43)[__sourceSpill1651_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[17]));
}

private static native <E extends Throwable> void __sourceConstructorInit_64e3f2f913f1945d_0(moom.wi a0) throws E;

public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
long local2 = (moom.wi.n ^ 69091413357108L);
    return ((((((net.minecraft.entity.IMerchant)(this.k)).a__tn() == p0) ? 1 : 0)) != 0);
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26040;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wi.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9595_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void(net.minecraft.inventory.IInventory p0) {
((moom.wA)(this.l)).c__Void();
    super.a__Void(((net.minecraft.inventory.IInventory)(p0)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
super.a__Void();
    return;
}


public void a(net.minecraft.inventory.ICrafting p0) {
super.a(((net.minecraft.inventory.ICrafting)(p0)));
    return;
}


public moom.wA a__sourceReturn_67261f1639() {
return this.l;
}


public void a__Void(int p0, int p1) {
return;
}


public void a__sourceReturn_d00df7729d(int p0) {
((moom.wA)(this.l)).a__Void(((int)(p0)));
    return;
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4411_19_0;
    moom.wB forwardValue4411_24_0;
    int forwardValue4411_54_0;
    int forwardValue4411_103_0;
    int forwardValue4411_103_1;
    int forwardValue4411_138_0;
    int forwardValue4411_145_0;
    net.minecraft.entity.Entity[] spill4411_0;
    moom.wB spill4411_1;
    int spill4411_2;
    int spill4411_3;
    int spill4411_4;
    int spill4411_5;
    int spill4411_6;
    int spill4411_7;
    boolean spill4411_8;
    int spill4411_9;
    int spill4411_10;
    boolean spill4411_11;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    net.minecraft.entity.Entity[] life5_7;
    moom.wB life7_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_164: {
    forward_join_160: {
    forward_join_153: {
    forward_join_151: {
    forward_join_145: {
    forward_join_143: {
    forward_join_138: {
    forward_join_128: {
    forward_join_103: {
    forward_join_95: {
    forward_join_54: {
    forward_join_53: {
    forward_join_47: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wi.n ^ 23097113361835L);
    spill4411_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life5_7 = spill4411_0;
    life7_13 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    spill4411_1 = life7_13;
    if (!((life5_7 == null))) {
        forwardValue4411_19_0 = spill4411_1;
        break forward_join_19;
    }
    if (!((spill4411_1 != null))) {
        break forward_join_164;
    }
    forwardValue4411_19_0 = life7_13;
    }
    if (!((life5_7 == null))) {
        forwardValue4411_24_0 = forwardValue4411_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4411_19_0)).a__Boolean())) {
        break forward_join_164;
    }
    forwardValue4411_24_0 = life7_13;
    }
    life8_34 = ((moom.wB)(forwardValue4411_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4411_2 = p1;
    if (!((life5_7 == null))) {
        forwardValue4411_54_0 = spill4411_2;
        break forward_join_54;
    }
    if (!((spill4411_2 == 2))) {
        break forward_join_53;
    }
    if (!((!((moom.wi)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(3)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4411_8(19193, (836712549258488605L ^ life3_3)))), ((boolean)(true)))))) {
        break forward_join_47;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.item.ItemStack)(life8_34)), ((net.minecraft.item.ItemStack)(life6_6)));
    if (!((life5_7 != null))) {
        break forward_join_143;
    }
    }
    forwardValue4411_54_0 = p1;
    }
    if (!((life5_7 == null))) {
        forwardValue4411_138_0 = forwardValue4411_54_0;
        break forward_join_138;
    }
    if (!((forwardValue4411_54_0 != 0))) {
        break forward_join_128;
    }
    spill4411_3 = p1;
    if (!((life5_7 == null))) {
        forwardValue4411_138_0 = spill4411_3;
        break forward_join_138;
    }
    if (!((spill4411_3 != 1))) {
        break forward_join_128;
    }
    spill4411_4 = p1;
    spill4411_5 = 3;
    if (!((life5_7 == null))) {
        forwardValue4411_103_0 = spill4411_4;
        forwardValue4411_103_1 = spill4411_5;
        break forward_join_103;
    }
    if (!((spill4411_4 >= spill4411_5))) {
        break forward_join_95;
    }
    spill4411_6 = p1;
    spill4411_7 = __sourceIntrinsic_245d151687c8_invokedynamic4411_11(62, (2633292313401270729L ^ life3_3));
    if (!((life5_7 == null))) {
        forwardValue4411_103_0 = spill4411_6;
        forwardValue4411_103_1 = spill4411_7;
        break forward_join_103;
    }
    if (!((spill4411_6 < spill4411_7))) {
        break forward_join_95;
    }
    spill4411_8 = ((moom.wi)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4411_12(11083, (6380579000057596588L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4411_13(18707, (3142807609137752312L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4411_145_0 = ((spill4411_8) ? 1 : 0);
        break forward_join_145;
    }
    if (!((!spill4411_8))) {
        break forward_join_143;
    }
    return null;
    }
    spill4411_9 = p1;
    if (!((life5_7 == null))) {
        forwardValue4411_145_0 = spill4411_9;
        break forward_join_145;
    }
    forwardValue4411_103_0 = spill4411_9;
    forwardValue4411_103_1 = __sourceIntrinsic_245d151687c8_invokedynamic4411_16(11083, (6380579000057596588L ^ life3_3));
    }
    if (!((forwardValue4411_103_0 >= forwardValue4411_103_1))) {
        break forward_join_143;
    }
    spill4411_10 = p1;
    if (!((life5_7 == null))) {
        forwardValue4411_145_0 = spill4411_10;
        break forward_join_145;
    }
    if (!((spill4411_10 < __sourceIntrinsic_245d151687c8_invokedynamic4411_17(18707, (3142807609137752312L ^ life3_3))))) {
        break forward_join_143;
    }
    spill4411_11 = ((moom.wi)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(3)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4411_18(11083, (6380579000057596588L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4411_145_0 = ((spill4411_11) ? 1 : 0);
        break forward_join_145;
    }
    if (!((!spill4411_11))) {
        break forward_join_143;
    }
    return null;
    }
    forwardValue4411_138_0 = ((((moom.wi)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(3)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4411_21(18707, (3142807609137752312L ^ life3_3)))), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4411_145_0 = forwardValue4411_138_0;
        break forward_join_145;
    }
    if (!((forwardValue4411_138_0 == 0))) {
        break forward_join_143;
    }
    return null;
    }
    forwardValue4411_145_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4411_145_0 == 0))) {
        break forward_join_151;
    }
    ((moom.wB)(life7_13)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_7 != null))) {
        break forward_join_153;
    }
    }
    ((moom.wB)(life7_13)).a__Void();
    }
    if (!((((net.minecraft.item.ItemStack)(life8_34)).b == ((net.minecraft.item.ItemStack)(life6_6)).b))) {
        break forward_join_160;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life8_34)));
    }
    return life6_6;
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
moom.wi forwardValue4410_23_0;
    net.minecraft.item.ItemStack forwardValue4410_42_0;
    net.minecraft.entity.Entity[] spill4410_0;
    moom.wi spill4410_1;
    net.minecraft.item.ItemStack spill4410_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.item.ItemStack life5_32;
    forward_join_48: {
    forward_join_42: {
    forward_join_36: {
    forward_join_23: {
    life2_3 = (moom.wi.n ^ 33405483147038L);
    spill4410_0 = moom.v8.b__Arrayr3();
    super.a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    life4_8 = spill4410_0;
    ((net.minecraft.entity.IMerchant)(this.k)).a__Void(((net.minecraft.entity.player.EntityPlayer)(null)));
    super.a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    spill4410_1 = this;
    if (!((life4_8 == null))) {
        forwardValue4410_23_0 = spill4410_1;
        break forward_join_23;
    }
    if (!((!((net.minecraft.world.World)(((moom.wi)(spill4410_1)).m)).G))) {
        break forward_join_48;
    }
    forwardValue4410_23_0 = this;
    }
    life5_32 = ((moom.wA)(((moom.wi)(forwardValue4410_23_0)).l)).b__xW(((int)(0)));
    spill4410_2 = life5_32;
    if (!((life4_8 == null))) {
        forwardValue4410_42_0 = spill4410_2;
        break forward_join_42;
    }
    if (!((spill4410_2 != null))) {
        break forward_join_36;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.item.ItemStack)(life5_32)), ((boolean)(false)));
    }
    life5_32 = ((moom.wA)(this.l)).b__xW(((int)(1)));
    forwardValue4410_42_0 = life5_32;
    }
    if (!((forwardValue4410_42_0 != null))) {
        break forward_join_48;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.item.ItemStack)(life5_32)), ((boolean)(false)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_64e3f2f913f1945d_originalDynamicSite755_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4411_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4411_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4411_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4411_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4411_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4411_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4411_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4411_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9595_0() throws E;
}
