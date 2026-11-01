package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class we extends moom.v8 {

public net.minecraft.inventory.IInventory k;

private net.minecraft.world.World l;

private moom.DT m;

private java.util.Random n;

public int o;

public int[] p;

public int[] q;

private static long r;

private static long[] s;

private static java.lang.Integer[] u;

private static java.util.Map y;

public we(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1) {
this(((net.minecraft.entity.player.InventoryPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((moom.DT)(moom.DT.f)));
    return;
}


public we(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1, moom.DT p2) { super(); }


private static void __sourceConstructorBody_8955a704f2d56f0a(moom.we receiver, net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1, moom.DT p2) throws Throwable {

int __initValue751_169_0;

    long local4_life2;

    net.minecraft.entity.Entity[] local6_life6;

    int local7_life35;

    int local8_life37;

    init_join_206: {

    init_join_169: {

    init_join_168: {

    local4_life2 = (moom.we.r ^ 12120887523874L);

    net.minecraft.entity.Entity[] __sourceSpill751_4 = moom.v8.b__Arrayr3();

    moom.we.__sourceConstructorInit_8955a704f2d56f0a_0(((moom.we)(receiver)));

    local6_life6 = __sourceSpill751_4;

    ((moom.we)(receiver)).k = ((net.minecraft.inventory.IInventory)(new moom.wt(receiver, "Enchant", true, 2)));

    ((moom.we)(receiver)).n = ((java.util.Random)(new java.util.Random()));

    ((moom.we)(receiver)).p = ((int[])(new int[3]));

    moom.we __sourceSpill751_10 = receiver;

    int[] __stackOp751_11_0 = new int[3];

    int[] __sourceSpill751_12 = __stackOp751_11_0;

    (__stackOp751_11_0)[0] = -1;

    int[] __stackOp751_13_0 = __sourceSpill751_12;

    int[] __sourceSpill751_14 = __stackOp751_13_0;

    (__stackOp751_13_0)[1] = -1;

    int[] __stackOp751_15_0 = __sourceSpill751_14;

    int[] __sourceSpill751_16 = __stackOp751_15_0;

    (__stackOp751_15_0)[2] = -1;

    ((moom.we)(__sourceSpill751_10)).q = ((int[])(__sourceSpill751_16));

    ((moom.we)(receiver)).l = ((net.minecraft.world.World)(p1));

    ((moom.we)(receiver)).m = ((moom.DT)(p2));

    ((moom.we)(receiver)).o = ((int)(__sourceExactCall_5a21bf66ab78fc(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.InventoryPlayer)(p0)).d)))));

    ((moom.we)(receiver)).a(((moom.wB)(new moom.wG(receiver, ((moom.we)(receiver)).k, 0, __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_25(21575, (8218118955856170048L ^ local4_life2)), __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_27(15855, (1033035471420450281L ^ local4_life2))))));

    ((moom.we)(receiver)).a(((moom.wB)(new moom.wH(receiver, ((moom.we)(receiver)).k, 1, __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_31(8388, (7044357300527331535L ^ local4_life2)), __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_33(25191, (4401133987528194666L ^ local4_life2))))));

    local7_life35 = 0;

    init_cycle_95: while (true) {

    init_join_166: {

    init_join_165: {

    if (!((local7_life35 < 3))) {

        break init_join_168;

    }

    int __sourceSpill751_36 = 0;

    if (!((local6_life6 == null))) {

        __initValue751_169_0 = __sourceSpill751_36;

        break init_join_169;

    }

    local8_life37 = __sourceSpill751_36;

    init_cycle_102: while (true) {

    if (!((local8_life37 < __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_39(20058, (4168947222985807455L ^ local4_life2))))) {

        break init_join_165;

    }

    ((moom.we)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), ((local8_life37 + (local7_life35 * __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_41(7238, (4764769708402066498L ^ local4_life2)))) + __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_43(7238, (4764769708402066498L ^ local4_life2))), (__sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_45(16296, (3463594425873819554L ^ local4_life2)) + (local8_life37 * __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_47(12275, (3971681900381763579L ^ local4_life2)))), (__sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_49(23379, (5340684106119873373L ^ local4_life2)) + (local7_life35 * __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_51(15014, (8544441501296190133L ^ local4_life2))))))));

    local8_life37 += 1;

    if (!((local6_life6 == null))) {

        break init_join_166;

    }

    if (!((local6_life6 != null))) { continue init_cycle_102; }

    break init_cycle_102;

    }

    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));

    }

    local7_life35 += 1;

    }

    if (!((local6_life6 != null))) { continue init_cycle_95; }

    break init_cycle_95;

    }

    }

    __initValue751_169_0 = 0;

    }

    local7_life35 = __initValue751_169_0;

    init_cycle_170: while (true) {

    if (!((local7_life35 < __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_55(7238, (4764769708402066498L ^ local4_life2))))) {

        break init_join_206;

    }

    ((moom.we)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), local7_life35, (__sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_57(16296, (3463594425873819554L ^ local4_life2)) + (local7_life35 * __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_59(15014, (8544441501296190133L ^ local4_life2)))), __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_61(24369, (4994372537052071728L ^ local4_life2))))));

    local7_life35 += 1;

    if (!((local6_life6 != null))) { continue init_cycle_170; }

    break init_cycle_170;

    }

    }

    return;

}



static {
r = ((long)(((moom._a)(moom._c.a(((long)(951283320424840976L)), ((long)(-3917171401110964412L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(10911328848238L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.we.r ^ 49902712647993L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1647_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1647_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1647_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1647_14 = new byte[8];
    (__sourceSpill1647_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1647_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1647_16 = __sourceSpill1647_14;
    ((javax.crypto.Cipher)(__sourceSpill1647_11)).init(((int)(__sourceSpill1647_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1647_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1647_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[18];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "»g\005?Ý¢)\0279\022´Ik7\017+fG®l_BÆîì£\177¾CÒKû\n­g1I9d# TóªPÞáàx!5Ð./\016:\020\002QOsNô|â¬Ù\177Lëå¼5c\nÄÝBDuÈa)\f°\\Ï·DföÉ%Í'\017é\000Ãæ|æ#¤³Ð½Ü\\\020¢Ó6"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1647_25 = local6_life21;
        int __sourceSpill1647_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1647_25)).substring(((int)(__sourceSpill1647_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1647_30 = local8_life19;
        int __sourceSpill1647_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1647_33 = new byte[8];
        (__sourceSpill1647_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1647_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1647_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1647_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1647_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1647_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1647_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1647_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1647_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1647_34)).doFinal(((byte[])(__sourceSpill1647_33)));
        (__sourceSpill1647_30)[__sourceSpill1647_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "w~®Òúá^*Q¹_õD"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1647_38 = local6_life21;
        int __sourceSpill1647_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1647_38)).substring(((int)(__sourceSpill1647_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1647_43 = local8_life19;
        int __sourceSpill1647_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1647_46 = new byte[8];
        (__sourceSpill1647_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1647_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1647_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1647_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1647_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1647_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1647_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1647_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1647_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1647_47)).doFinal(((byte[])(__sourceSpill1647_46)));
        (__sourceSpill1647_43)[__sourceSpill1647_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[18]));
}

private static native <E extends Throwable> void __sourceConstructorInit_8955a704f2d56f0a_0(moom.we a0) throws E;

public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4404_40_0;
    int forwardValue4404_42_0;
    int spill4404_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    life2_3 = (moom.we.r ^ 90726858905754L);
    life4_5 = moom.v8.b__Arrayr3();
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.l)).a__fE(((moom.DT)(this.m))))).a__ch() == net.minecraft.init.Blocks.br))) {
        break forward_join_41;
    }
    spill4404_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(this.m)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.m)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.m)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 == null))) {
        forwardValue4404_40_0 = spill4404_0;
        break forward_join_40;
    }
    if (!((spill4404_0 <= 0))) {
        break forward_join_41;
    }
    forwardValue4404_40_0 = 1;
    }
    forwardValue4404_42_0 = forwardValue4404_40_0;
    break forward_join_42;
    }
    forwardValue4404_42_0 = 0;
    }
    return ((forwardValue4404_42_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9578_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/we"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29051;
      if (u[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/we", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.we.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__Void(int p0, int p1) {
int forwardValue4402_23_0;
    int forwardValue4402_24_0;
    int forwardValue4402_24_1;
    int forwardValue4402_34_0;
    int forwardValue4402_34_1;
    int forwardValue4402_43_0;
    int forwardValue4402_43_1;
    int spill4402_0;
    int spill4402_1;
    int spill4402_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_57: {
    forward_join_53: {
    forward_join_43: {
    forward_join_34: {
    forward_join_32: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (moom.we.r ^ 54477288658213L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4402_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue4402_23_0 = spill4402_0;
        break forward_join_23;
    }
    if (!((spill4402_0 >= 0))) {
        break forward_join_22;
    }
    spill4402_1 = p0;
    spill4402_2 = 2;
    if (!((life5_5 == null))) {
        forwardValue4402_24_0 = spill4402_1;
        forwardValue4402_24_1 = spill4402_2;
        break forward_join_24;
    }
    if (!((spill4402_1 <= spill4402_2))) {
        break forward_join_22;
    }
    (this.p)[p0] = p1;
    if (!((life5_5 != null))) {
        break forward_join_57;
    }
    }
    forwardValue4402_23_0 = p0;
    }
    forwardValue4402_24_0 = forwardValue4402_23_0;
    forwardValue4402_24_1 = 3;
    }
    if (!((life5_5 == null))) {
        forwardValue4402_34_0 = forwardValue4402_24_0;
        forwardValue4402_34_1 = forwardValue4402_24_1;
        break forward_join_34;
    }
    if (!((forwardValue4402_24_0 == forwardValue4402_24_1))) {
        break forward_join_32;
    }
    this.o = ((int)(p1));
    if (!((life5_5 != null))) {
        break forward_join_57;
    }
    }
    forwardValue4402_34_0 = p0;
    forwardValue4402_34_1 = 4;
    }
    if (!((life5_5 == null))) {
        forwardValue4402_43_0 = forwardValue4402_34_0;
        forwardValue4402_43_1 = forwardValue4402_34_1;
        break forward_join_43;
    }
    if (!((forwardValue4402_34_0 >= forwardValue4402_34_1))) {
        break forward_join_53;
    }
    forwardValue4402_43_0 = p0;
    forwardValue4402_43_1 = __sourceIntrinsic_02b72693edd3_invokedynamic4402_4(7916, (5174832742461368802L ^ life3_3));
    }
    if (!((forwardValue4402_43_0 <= forwardValue4402_43_1))) {
        break forward_join_53;
    }
    (this.q)[(p0 - 4)] = p1;
    if (!((life5_5 != null))) {
        break forward_join_57;
    }
    }
    super.a__Void(((int)(p0)), ((int)(p1)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
net.minecraft.entity.Entity[] spill1373_0;
    long life1_3;
    java.util.Iterator life4_10;
    net.minecraft.entity.Entity[] life3_11;
    net.minecraft.inventory.ICrafting life5_18;
    lexical_join_85: {
    life1_3 = (moom.we.r ^ 59308255098105L);
    super.a__Void();
    spill1373_0 = moom.v8.b__Arrayr3();
    life4_10 = ((java.util.List)(this.h)).iterator();
    life3_11 = spill1373_0;
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life4_10)).hasNext())) {
        break lexical_join_85;
    }
    life5_18 = ((net.minecraft.inventory.ICrafting)(((java.util.Iterator)(life4_10)).next()));
    ((net.minecraft.inventory.ICrafting)(life5_18)).a(((moom.v8)(this)), ((int)(0)), ((int)((this.p)[0])));
    ((net.minecraft.inventory.ICrafting)(life5_18)).a(((moom.v8)(this)), ((int)(1)), ((int)((this.p)[1])));
    ((net.minecraft.inventory.ICrafting)(life5_18)).a(((moom.v8)(this)), ((int)(2)), ((int)((this.p)[2])));
    ((net.minecraft.inventory.ICrafting)(life5_18)).a(((moom.v8)(this)), ((int)(3)), ((int)((this.o & __sourceIntrinsic_b82a5b29b709_invokedynamic1373_15(3265, (9088315812484651541L ^ life1_3))))));
    ((net.minecraft.inventory.ICrafting)(life5_18)).a(((moom.v8)(this)), ((int)(4)), ((int)((this.q)[0])));
    ((net.minecraft.inventory.ICrafting)(life5_18)).a(((moom.v8)(this)), ((int)(5)), ((int)((this.q)[1])));
    ((net.minecraft.inventory.ICrafting)(life5_18)).a(((moom.v8)(this)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic1373_21(7916, (5174836688663480382L ^ life1_3)))), ((int)((this.q)[2])));
    if (!((life3_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return;
}


public void a(net.minecraft.inventory.ICrafting p0) {
long local2 = (moom.we.r ^ 139826570041182L);
    super.a(((net.minecraft.inventory.ICrafting)(p0)));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((int)(0)), ((int)((this.p)[0])));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((int)(1)), ((int)((this.p)[1])));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((int)(2)), ((int)((this.p)[2])));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((int)(3)), ((int)((this.o & __sourceIntrinsic_476477106c8c_originalDynamicSite1695_9(16310, (7119153436012546760L ^ local2))))));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((int)(4)), ((int)((this.q)[0])));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((int)(5)), ((int)((this.q)[1])));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((int)(__sourceIntrinsic_476477106c8c_originalDynamicSite1695_15(20446, (892591740124166830L ^ local2)))), ((int)((this.q)[2])));
    return;
}


public int a__sourceReturn_8abf5c6871() {
net.minecraft.item.ItemStack forwardValue4396_18_0;
    int forwardValue4396_19_0;
    net.minecraft.entity.Entity[] spill4396_0;
    net.minecraft.item.ItemStack spill4396_1;
    long life1_3;
    net.minecraft.item.ItemStack life4_9;
    net.minecraft.entity.Entity[] life3_10;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.we.r ^ 97652978977700L);
    spill4396_0 = moom.v8.b__Arrayr3();
    life4_9 = ((net.minecraft.inventory.IInventory)(this.k)).a__xW(((int)(1)));
    life3_10 = spill4396_0;
    spill4396_1 = life4_9;
    if (!((life3_10 == null))) {
        forwardValue4396_18_0 = spill4396_1;
        break forward_join_18;
    }
    if (!((spill4396_1 == null))) {
        break forward_join_17;
    }
    forwardValue4396_19_0 = 0;
    break forward_join_19;
    }
    forwardValue4396_18_0 = life4_9;
    }
    forwardValue4396_19_0 = ((net.minecraft.item.ItemStack)(forwardValue4396_18_0)).b;
    }
    return forwardValue4396_19_0;
}


private java.util.List<moom.D3> a(net.minecraft.item.ItemStack p0, int p1, int p2) {
java.util.List forwardValue4399_43_0;
    net.minecraft.entity.Entity[] spill4399_0;
    java.util.List spill4399_1;
    java.util.List spill4399_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_13;
    java.util.List life7_19;
    forward_join_43: {
    forward_join_42: {
    life4_3 = (moom.we.r ^ 99723992936387L);
    spill4399_0 = moom.v8.b__Arrayr3();
    ((java.util.Random)(this.n)).setSeed(((long)(((long) (this.o + p1)))));
    life6_13 = spill4399_0;
    life7_19 = moom.rV.a(((java.util.Random)(this.n)), ((net.minecraft.item.ItemStack)(p0)), ((int)(p2)));
    if (!((((net.minecraft.item.ItemStack)(p0)).a__wQ() == net.minecraft.init.Items.aL))) {
        break forward_join_42;
    }
    spill4399_1 = life7_19;
    if (!((life6_13 == null))) {
        forwardValue4399_43_0 = spill4399_1;
        break forward_join_43;
    }
    if (!((spill4399_1 != null))) {
        break forward_join_42;
    }
    spill4399_2 = life7_19;
    if (!((life6_13 == null))) {
        forwardValue4399_43_0 = spill4399_2;
        break forward_join_43;
    }
    if (!((((java.util.List)(spill4399_2)).size() > 1))) {
        break forward_join_42;
    }
    ((java.util.List)(life7_19)).remove(((int)(((java.util.Random)(this.n)).nextInt(((int)(((java.util.List)(life7_19)).size()))))));
    }
    forwardValue4399_43_0 = life7_19;
    }
    return forwardValue4399_43_0;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0, int p1) {
net.minecraft.item.ItemStack lexicalValue1372_25_0;
    int lexicalValue1372_42_0;
    int lexicalValue1372_65_0;
    int lexicalValue1372_71_0;
    int lexicalValue1372_90_0;
    int lexicalValue1372_138_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1372_156_0;
    int lexicalValue1372_170_0;
    int lexicalValue1372_172_0;
    net.minecraft.entity.Entity[] spill1372_0;
    net.minecraft.item.ItemStack spill1372_1;
    int spill1372_2;
    boolean spill1372_3;
    int spill1372_4;
    int spill1372_5;
    int spill1372_6;
    net.minecraft.entity.player.EntityPlayer spill1372_7;
    long life3_3;
    net.minecraft.item.ItemStack life6_8;
    net.minecraft.item.ItemStack life7_14;
    int life8_18;
    net.minecraft.entity.Entity[] life5_19;
    java.util.List life9_126;
    int life10_136;
    java.util.Iterator life11_160;
    moom.D3 life12_167;
    lexical_join_172: {
    lexical_join_171: {
    lexical_join_170: {
    lexical_join_169: {
    lexical_join_165: {
    lexical_join_156: {
    lexical_join_155: {
    lexical_join_138: {
    lexical_join_133: {
    lexical_join_103: {
    lexical_join_98: {
    lexical_join_90: {
    lexical_join_89: {
    lexical_join_71: {
    lexical_join_68: {
    lexical_join_65: {
    lexical_join_62: {
    lexical_join_42: {
    lexical_join_38: {
    lexical_join_30: {
    lexical_join_25: {
    life3_3 = (moom.we.r ^ 12050405465275L);
    life6_8 = ((net.minecraft.inventory.IInventory)(this.k)).a__xW(((int)(0)));
    spill1372_0 = moom.v8.b__Arrayr3();
    life7_14 = ((net.minecraft.inventory.IInventory)(this.k)).a__xW(((int)(1)));
    life8_18 = (p1 + 1);
    life5_19 = spill1372_0;
    spill1372_1 = life7_14;
    if (!((life5_19 == null))) {
        lexicalValue1372_25_0 = spill1372_1;
        break lexical_join_25;
    }
    if (!((spill1372_1 != null))) {
        break lexical_join_30;
    }
    lexicalValue1372_25_0 = life7_14;
    }
    spill1372_2 = ((net.minecraft.item.ItemStack)(lexicalValue1372_25_0)).b;
    if (!((life5_19 == null))) {
        lexicalValue1372_42_0 = spill1372_2;
        break lexical_join_42;
    }
    if (!((spill1372_2 < life8_18))) {
        break lexical_join_38;
    }
    }
    spill1372_3 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life5_19 == null))) {
        lexicalValue1372_42_0 = ((spill1372_3) ? 1 : 0);
        break lexical_join_42;
    }
    if (!((!spill1372_3))) {
        break lexical_join_38;
    }
    return ((0) != 0);
    }
    lexicalValue1372_42_0 = (this.p)[p1];
    }
    if (!((life5_19 == null))) {
        lexicalValue1372_172_0 = lexicalValue1372_42_0;
        break lexical_join_172;
    }
    if (!((lexicalValue1372_42_0 > 0))) {
        break lexical_join_171;
    }
    if (!((life6_8 != null))) {
        break lexical_join_171;
    }
    spill1372_4 = ((net.minecraft.entity.player.EntityPlayer)(p0)).b2;
    if (!((life5_19 == null))) {
        lexicalValue1372_65_0 = spill1372_4;
        break lexical_join_65;
    }
    if (!((spill1372_4 >= life8_18))) {
        break lexical_join_62;
    }
    spill1372_5 = ((net.minecraft.entity.player.EntityPlayer)(p0)).b2;
    if (!((life5_19 == null))) {
        lexicalValue1372_71_0 = spill1372_5;
        break lexical_join_71;
    }
    if (!((spill1372_5 < (this.p)[p1]))) {
        break lexical_join_68;
    }
    }
    lexicalValue1372_65_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d) ? 1 : 0);
    }
    if (!((life5_19 == null))) {
        lexicalValue1372_172_0 = lexicalValue1372_65_0;
        break lexical_join_172;
    }
    if (!((lexicalValue1372_65_0 != 0))) {
        break lexical_join_171;
    }
    }
    lexicalValue1372_71_0 = ((((net.minecraft.world.World)(this.l)).G) ? 1 : 0);
    }
    if (!((life5_19 == null))) {
        lexicalValue1372_170_0 = lexicalValue1372_71_0;
        break lexical_join_170;
    }
    if (!((lexicalValue1372_71_0 == 0))) {
        break lexical_join_169;
    }
    life9_126 = ((moom.we)(this)).a(((net.minecraft.item.ItemStack)(life6_8)), ((int)(p1)), ((int)((this.p)[p1])));
    if (!((((net.minecraft.item.ItemStack)(life6_8)).a__wQ() == net.minecraft.init.Items.aL))) {
        break lexical_join_89;
    }
    lexicalValue1372_90_0 = 1;
    break lexical_join_90;
    }
    lexicalValue1372_90_0 = 0;
    }
    life10_136 = lexicalValue1372_90_0;
    if (!((life5_19 == null))) {
        break lexical_join_98;
    }
    if (!((life9_126 != null))) {
        break lexical_join_169;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).m(((int)(life8_18)));
    }
    if (!((life10_136 != 0))) {
        break lexical_join_103;
    }
    ((net.minecraft.item.ItemStack)(life6_8)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bS)));
    }
    life11_160 = ((java.util.List)(life9_126)).iterator();
    lexical_cycle_106: while (true) {
    lexical_join_131: {
    lexical_join_125: {
    lexical_join_123: {
    if (!(((java.util.Iterator)(life11_160)).hasNext())) {
        break lexical_join_133;
    }
    life12_167 = ((moom.D3)(((java.util.Iterator)(life11_160)).next()));
    if (!((life5_19 == null))) {
        break lexical_join_123;
    }
    spill1372_6 = life10_136;
    if (!((life5_19 == null))) {
        lexicalValue1372_138_0 = spill1372_6;
        break lexical_join_138;
    }
    if (!((spill1372_6 != 0))) {
        break lexical_join_125;
    }
    ((moom.xg)(net.minecraft.init.Items.bS)).a(((net.minecraft.item.ItemStack)(life6_8)), ((moom.D3)(life12_167)));
    }
    if (!((life5_19 != null))) {
        break lexical_join_131;
    }
    }
    ((net.minecraft.item.ItemStack)(life6_8)).a(((net.minecraft.enchantment.Enchantment)(((moom.D3)(life12_167)).c)), ((int)(((moom.D3)(life12_167)).d)));
    }
    if (!((life5_19 != null))) { continue lexical_cycle_106; }
    break lexical_cycle_106;
    }
    }
    spill1372_7 = p0;
    if (!((life5_19 == null))) {
        lexicalValue1372_156_0 = spill1372_7;
        break lexical_join_156;
    }
    lexicalValue1372_138_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill1372_7)).b1)).d) ? 1 : 0);
    }
    if (!((lexicalValue1372_138_0 == 0))) {
        break lexical_join_155;
    }
    net.minecraft.item.ItemStack __stackOp1372_40_0 = life7_14;
    ((net.minecraft.item.ItemStack)(__stackOp1372_40_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1372_40_0)).b - life8_18)));
    if (!((life5_19 == null))) {
        break lexical_join_165;
    }
    if (!((((net.minecraft.item.ItemStack)(life7_14)).b <= 0))) {
        break lexical_join_155;
    }
    ((net.minecraft.inventory.IInventory)(this.k)).a__Void(((int)(1)), ((net.minecraft.item.ItemStack)(null)));
    }
    lexicalValue1372_156_0 = p0;
    }
    ((net.minecraft.entity.player.EntityPlayer)(lexicalValue1372_156_0)).a(((moom.BY)(net.minecraft.stats.StatList.W)));
    ((net.minecraft.inventory.IInventory)(this.k)).a__Void();
    this.o = ((int)(((net.minecraft.entity.player.EntityPlayer)(p0)).p__sourceReturn_8abf5c6871()));
    }
    ((moom.we)(this)).a__Void(((net.minecraft.inventory.IInventory)(this.k)));
    }
    lexicalValue1372_170_0 = 1;
    }
    return ((lexicalValue1372_170_0) != 0);
    }
    lexicalValue1372_172_0 = 0;
    }
    return ((lexicalValue1372_172_0) != 0);
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
int lexicalValue1371_16_0;
    net.minecraft.entity.Entity[] spill1371_0;
    boolean spill1371_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    int life5_19;
    net.minecraft.item.ItemStack life6_29;
    lexical_join_39: {
    lexical_join_16: {
    life2_3 = (moom.we.r ^ 125570732062128L);
    spill1371_0 = moom.v8.b__Arrayr3();
    super.a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    life4_8 = spill1371_0;
    spill1371_1 = ((net.minecraft.world.World)(this.l)).G;
    if (!((life4_8 == null))) {
        lexicalValue1371_16_0 = ((spill1371_1) ? 1 : 0);
        break lexical_join_16;
    }
    if (!((!spill1371_1))) {
        break lexical_join_39;
    }
    lexicalValue1371_16_0 = 0;
    }
    life5_19 = lexicalValue1371_16_0;
    lexical_cycle_17: while (true) {
    lexical_join_37: {
    lexical_join_36: {
    if (!((life5_19 < ((net.minecraft.inventory.IInventory)(this.k)).b__Int()))) {
        break lexical_join_39;
    }
    life6_29 = ((net.minecraft.inventory.IInventory)(this.k)).b__xW(((int)(life5_19)));
    if (!((life4_8 == null))) {
        break lexical_join_37;
    }
    if (!((life6_29 != null))) {
        break lexical_join_36;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.item.ItemStack)(life6_29)), ((boolean)(false)));
    }
    life5_19 += 1;
    }
    if (!((life4_8 != null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


public void a__Void(net.minecraft.inventory.IInventory p0) {
net.minecraft.inventory.IInventory forestValue516_13_0;
    net.minecraft.item.ItemStack forestValue516_21_0;
    int forestValue516_32_0;
    int forestValue516_36_0;
    int forestValue516_64_0;
    int forestValue516_78_0;
    net.minecraft.world.World forestValue516_91_0;
    moom.DT forestValue516_91_1;
    net.minecraft.block.Block forestValue516_113_0;
    net.minecraft.block.Block forestValue516_113_1;
    int forestValue516_120_0;
    net.minecraft.block.Block forestValue516_151_0;
    net.minecraft.block.Block forestValue516_151_1;
    net.minecraft.block.Block forestValue516_168_0;
    net.minecraft.block.Block forestValue516_168_1;
    net.minecraft.block.Block forestValue516_185_0;
    net.minecraft.block.Block forestValue516_185_1;
    int forestValue516_200_0;
    moom.we forestValue516_254_0;
    java.lang.Object forestValue516_278_0;
    int forestValue516_300_0;
    int forestValue516_300_1;
    moom.we forestValue516_311_0;
    java.lang.Object forestValue516_335_0;
    moom.we forestValue516_361_0;
    int forestValue516_365_0;
    net.minecraft.inventory.IInventory spill516_0;
    net.minecraft.item.ItemStack spill516_1;
    boolean spill516_2;
    boolean spill516_3;
    int spill516_4;
    int spill516_5;
    int spill516_6;
    net.minecraft.world.World spill516_7;
    moom.DT spill516_8;
    net.minecraft.block.Block spill516_9;
    net.minecraft.block.Block spill516_10;
    int spill516_11;
    net.minecraft.block.Block spill516_12;
    net.minecraft.block.Block spill516_13;
    int spill516_14;
    int spill516_15;
    moom.we spill516_16;
    java.util.List spill516_17;
    moom.we spill516_18;
    java.util.List spill516_19;
    int spill516_20;
    int spill516_21;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.item.ItemStack life5_19;
    int life6_48;
    int life7_50;
    int life8_61;
    int life7_272;
    int life7_322;
    java.util.List life8_353;
    moom.D3 life9_379;
    java.util.List life8_428;
    moom.D3 life9_454;
    int life6_489;
    forest_join_382: {
    forest_join_365: {
    forest_join_364: {
    forest_join_361: {
    forest_join_360: {
    forest_join_300: {
    forest_join_239: {
    forest_join_200: {
    forest_join_193: {
    forest_join_32: {
    forest_join_21: {
    forest_join_13: {
    life2_3 = (moom.we.r ^ 100772357801467L);
    life4_5 = moom.v8.b__Arrayr3();
    spill516_0 = p0;
    if (!((life4_5 == null))) {
        forestValue516_13_0 = spill516_0;
        break forest_join_13;
    }
    if (!((spill516_0 == this.k))) {
        break forest_join_382;
    }
    forestValue516_13_0 = p0;
    }
    life5_19 = ((net.minecraft.inventory.IInventory)(forestValue516_13_0)).a__xW(((int)(0)));
    spill516_1 = life5_19;
    if (!((life4_5 == null))) {
        forestValue516_21_0 = spill516_1;
        break forest_join_21;
    }
    if (!((spill516_1 != null))) {
        break forest_join_364;
    }
    forestValue516_21_0 = life5_19;
    }
    spill516_2 = ((net.minecraft.item.ItemStack)(forestValue516_21_0)).h();
    if (!((life4_5 == null))) {
        forestValue516_365_0 = ((spill516_2) ? 1 : 0);
        break forest_join_365;
    }
    if (!(spill516_2)) {
        break forest_join_364;
    }
    spill516_3 = ((net.minecraft.world.World)(this.l)).G;
    if (!((life4_5 == null))) {
        forestValue516_32_0 = ((spill516_3) ? 1 : 0);
        break forest_join_32;
    }
    if (!((!spill516_3))) {
        break forest_join_382;
    }
    forestValue516_32_0 = 0;
    }
    life6_48 = forestValue516_32_0;
    life7_50 = -1;
    forest_cycle_35: while (true) {
    forest_join_190: {
    forestValue516_36_0 = life7_50;
    forest_cycle_36: while (true) {
    if (!((forestValue516_36_0 <= 1))) {
        break forest_join_193;
    }
    spill516_4 = -1;
    if (!((life4_5 == null))) {
        forestValue516_200_0 = spill516_4;
        break forest_join_200;
    }
    life8_61 = spill516_4;
    forest_cycle_42: while (true) {
    forest_join_187: {
    forest_join_185: {
    forest_join_172: {
    forest_join_168: {
    forest_join_155: {
    forest_join_151: {
    forest_join_138: {
    forest_join_120: {
    forest_join_115: {
    forest_join_113: {
    forest_join_98: {
    forest_join_91: {
    forest_join_78: {
    forest_join_64: {
    forest_join_55: {
    if (!((life8_61 <= 1))) {
        break forest_join_190;
    }
    spill516_5 = life7_50;
    if (!((life4_5 == null))) {
        forestValue516_36_0 = spill516_5;
        continue forest_cycle_36;
    }
    if (!((life4_5 == null))) {
        forestValue516_64_0 = spill516_5;
        break forest_join_64;
    }
    if (!((spill516_5 == 0))) {
        break forest_join_55;
    }
    spill516_6 = life8_61;
    if (!((life4_5 == null))) {
        forestValue516_64_0 = spill516_6;
        break forest_join_64;
    }
    if (!((spill516_6 != 0))) {
        break forest_join_187;
    }
    }
    forestValue516_64_0 = ((((net.minecraft.world.World)(this.l)).a__Boolean(((moom.DT)(((moom.DT)(this.m)).a(((int)(life8_61)), ((int)(0)), ((int)(life7_50))))))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forestValue516_78_0 = forestValue516_64_0;
        break forest_join_78;
    }
    if (!((forestValue516_64_0 != 0))) {
        break forest_join_187;
    }
    spill516_7 = this.l;
    spill516_8 = ((moom.DT)(this.m)).a(((int)(life8_61)), ((int)(1)), ((int)(life7_50)));
    if (!((life4_5 == null))) {
        forestValue516_91_0 = spill516_7;
        forestValue516_91_1 = spill516_8;
        break forest_join_91;
    }
    forestValue516_78_0 = ((((net.minecraft.world.World)(spill516_7)).a__Boolean(((moom.DT)(spill516_8)))) ? 1 : 0);
    }
    if (!((forestValue516_78_0 != 0))) {
        break forest_join_187;
    }
    forestValue516_91_0 = this.l;
    forestValue516_91_1 = ((moom.DT)(this.m)).a(((int)((life8_61 * 2))), ((int)(0)), ((int)((life7_50 * 2))));
    }
    spill516_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forestValue516_91_0)).a__fE(((moom.DT)(forestValue516_91_1))))).a__ch();
    spill516_10 = net.minecraft.init.Blocks.X;
    if (!((life4_5 == null))) {
        forestValue516_113_0 = spill516_9;
        forestValue516_113_1 = spill516_10;
        break forest_join_113;
    }
    if (!((spill516_9 == spill516_10))) {
        break forest_join_98;
    }
    life6_48 += 1;
    }
    forestValue516_113_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.l)).a__fE(((moom.DT)(((moom.DT)(this.m)).a(((int)((life8_61 * 2))), ((int)(1)), ((int)((life7_50 * 2))))))))).a__ch();
    forestValue516_113_1 = net.minecraft.init.Blocks.X;
    }
    if (!((forestValue516_113_0 == forestValue516_113_1))) {
        break forest_join_115;
    }
    life6_48 += 1;
    }
    spill516_11 = life8_61;
    if (!((life4_5 == null))) {
        forestValue516_120_0 = spill516_11;
        break forest_join_120;
    }
    if (!((spill516_11 != 0))) {
        break forest_join_187;
    }
    forestValue516_120_0 = life7_50;
    }
    if (!((forestValue516_120_0 != 0))) {
        break forest_join_187;
    }
    spill516_12 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.l)).a__fE(((moom.DT)(((moom.DT)(this.m)).a(((int)((life8_61 * 2))), ((int)(0)), ((int)(life7_50)))))))).a__ch();
    spill516_13 = net.minecraft.init.Blocks.X;
    if (!((life4_5 == null))) {
        forestValue516_151_0 = spill516_12;
        forestValue516_151_1 = spill516_13;
        break forest_join_151;
    }
    if (!((spill516_12 == spill516_13))) {
        break forest_join_138;
    }
    life6_48 += 1;
    }
    forestValue516_151_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.l)).a__fE(((moom.DT)(((moom.DT)(this.m)).a(((int)((life8_61 * 2))), ((int)(1)), ((int)(life7_50)))))))).a__ch();
    forestValue516_151_1 = net.minecraft.init.Blocks.X;
    }
    if (!((life4_5 == null))) {
        forestValue516_168_0 = forestValue516_151_0;
        forestValue516_168_1 = forestValue516_151_1;
        break forest_join_168;
    }
    if (!((forestValue516_151_0 == forestValue516_151_1))) {
        break forest_join_155;
    }
    life6_48 += 1;
    }
    forestValue516_168_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.l)).a__fE(((moom.DT)(((moom.DT)(this.m)).a(((int)(life8_61)), ((int)(0)), ((int)((life7_50 * 2))))))))).a__ch();
    forestValue516_168_1 = net.minecraft.init.Blocks.X;
    }
    if (!((life4_5 == null))) {
        forestValue516_185_0 = forestValue516_168_0;
        forestValue516_185_1 = forestValue516_168_1;
        break forest_join_185;
    }
    if (!((forestValue516_168_0 == forestValue516_168_1))) {
        break forest_join_172;
    }
    life6_48 += 1;
    }
    forestValue516_185_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.l)).a__fE(((moom.DT)(((moom.DT)(this.m)).a(((int)(life8_61)), ((int)(1)), ((int)((life7_50 * 2))))))))).a__ch();
    forestValue516_185_1 = net.minecraft.init.Blocks.X;
    }
    if (!((forestValue516_185_0 == forestValue516_185_1))) {
        break forest_join_187;
    }
    life6_48 += 1;
    }
    life8_61 += 1;
    if (!((life4_5 != null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_36;
    }
    }
    life7_50 += 1;
    if (!((life4_5 != null))) {
        continue forest_cycle_35;
    }
    break forest_cycle_35;
    }
    }
    ((java.util.Random)(this.n)).setSeed(((long)(((long) this.o))));
    forestValue516_200_0 = 0;
    }
    life7_272 = forestValue516_200_0;
    forest_cycle_201: while (true) {
    forest_join_237: {
    forest_join_236: {
    if (!((life7_272 < 3))) {
        break forest_join_239;
    }
    (this.p)[life7_272] = moom.rV.a(((java.util.Random)(this.n)), ((int)(life7_272)), ((int)(life6_48)), ((net.minecraft.item.ItemStack)(life5_19)));
    (this.q)[life7_272] = -1;
    if (!((life4_5 == null))) {
        break forest_join_237;
    }
    spill516_14 = (this.p)[life7_272];
    spill516_15 = (life7_272 + 1);
    if (!((life4_5 == null))) {
        forestValue516_300_0 = spill516_14;
        forestValue516_300_1 = spill516_15;
        break forest_join_300;
    }
    if (!((spill516_14 < spill516_15))) {
        break forest_join_236;
    }
    (this.p)[life7_272] = 0;
    }
    life7_272 += 1;
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_201;
    }
    break forest_cycle_201;
    }
    }
    life7_322 = 0;
    forest_cycle_241: while (true) {
    forest_join_297: {
    forest_join_296: {
    forest_join_278: {
    forest_join_254: {
    if (!((life7_322 < 3))) {
        break forest_join_360;
    }
    spill516_16 = this;
    if (!((life4_5 == null))) {
        forestValue516_361_0 = spill516_16;
        break forest_join_361;
    }
    if (!((life4_5 == null))) {
        forestValue516_254_0 = spill516_16;
        break forest_join_254;
    }
    if (!(((((moom.we)(spill516_16)).p)[life7_322] > 0))) {
        break forest_join_296;
    }
    forestValue516_254_0 = this;
    }
    life8_353 = ((moom.we)(forestValue516_254_0)).a(((net.minecraft.item.ItemStack)(life5_19)), ((int)(life7_322)), ((int)((this.p)[life7_322])));
    if (!((life4_5 == null))) {
        break forest_join_297;
    }
    if (!((life8_353 != null))) {
        break forest_join_296;
    }
    spill516_17 = life8_353;
    if (!((life4_5 == null))) {
        forestValue516_278_0 = spill516_17;
        break forest_join_278;
    }
    if (!((!((java.util.List)(spill516_17)).isEmpty()))) {
        break forest_join_296;
    }
    forestValue516_278_0 = ((java.util.List)(life8_353)).get(((int)(((java.util.Random)(this.n)).nextInt(((int)(((java.util.List)(life8_353)).size()))))));
    }
    life9_379 = ((moom.D3)(forestValue516_278_0));
    (this.q)[life7_322] = (((net.minecraft.enchantment.Enchantment)(((moom.D3)(life9_379)).c)).C | (((moom.D3)(life9_379)).d << __sourceIntrinsic_abdbec025829_invokedynamic516_77(18477, (8045388715332890615L ^ life2_3))));
    }
    life7_322 += 1;
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_241;
    }
    break forest_cycle_241;
    }
    break forest_join_360;
    }
    forest_cycle_300: while (true) {
    forest_join_357: {
    forest_join_354: {
    forest_join_353: {
    forest_join_335: {
    forest_join_311: {
    if (!((forestValue516_300_0 < forestValue516_300_1))) {
        break forest_join_360;
    }
    spill516_18 = this;
    if (!((life4_5 == null))) {
        forestValue516_361_0 = spill516_18;
        break forest_join_361;
    }
    if (!((life4_5 == null))) {
        forestValue516_311_0 = spill516_18;
        break forest_join_311;
    }
    if (!(((((moom.we)(spill516_18)).p)[life7_272] > 0))) {
        break forest_join_353;
    }
    forestValue516_311_0 = this;
    }
    life8_428 = ((moom.we)(forestValue516_311_0)).a(((net.minecraft.item.ItemStack)(life5_19)), ((int)(life7_272)), ((int)((this.p)[life7_272])));
    if (!((life4_5 == null))) {
        break forest_join_354;
    }
    if (!((life8_428 != null))) {
        break forest_join_353;
    }
    spill516_19 = life8_428;
    if (!((life4_5 == null))) {
        forestValue516_335_0 = spill516_19;
        break forest_join_335;
    }
    if (!((!((java.util.List)(spill516_19)).isEmpty()))) {
        break forest_join_353;
    }
    forestValue516_335_0 = ((java.util.List)(life8_428)).get(((int)(((java.util.Random)(this.n)).nextInt(((int)(((java.util.List)(life8_428)).size()))))));
    }
    life9_454 = ((moom.D3)(forestValue516_335_0));
    (this.q)[life7_272] = (((net.minecraft.enchantment.Enchantment)(((moom.D3)(life9_454)).c)).C | (((moom.D3)(life9_454)).d << __sourceIntrinsic_abdbec025829_invokedynamic516_91(18477, (8045388715332890615L ^ life2_3))));
    }
    life7_272 += 1;
    }
    if (!((life4_5 != null))) {
        break forest_join_357;
    }
    break forest_join_360;
    }
    spill516_20 = life7_272;
    spill516_21 = 3;
    forestValue516_300_0 = spill516_20;
    forestValue516_300_1 = spill516_21;
    continue forest_cycle_300;
    }
    }
    forestValue516_361_0 = this;
    }
    ((moom.we)(forestValue516_361_0)).a__Void();
    if (!((life4_5 != null))) {
        break forest_join_382;
    }
    }
    forestValue516_365_0 = 0;
    }
    life6_489 = forestValue516_365_0;
    forest_cycle_366: while (true) {
    if (!((life6_489 < 3))) {
        break forest_join_382;
    }
    (this.p)[life6_489] = 0;
    (this.q)[life6_489] = -1;
    life6_489 += 1;
    if (!((life4_5 != null))) {
        continue forest_cycle_366;
    }
    break forest_cycle_366;
    }
    }
    return;
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4398_19_0;
    moom.wB forwardValue4398_24_0;
    int forwardValue4398_49_0;
    int forwardValue4398_63_0;
    java.lang.Object forwardValue4398_96_0;
    int forwardValue4398_108_0;
    int forwardValue4398_115_0;
    int forwardValue4398_139_0;
    int forwardValue4398_142_0;
    int forwardValue4398_142_1;
    int forwardValue4398_165_0;
    net.minecraft.entity.Entity[] spill4398_0;
    moom.wB spill4398_1;
    int spill4398_2;
    boolean spill4398_3;
    net.minecraft.item.Item spill4398_4;
    net.minecraft.item.EnumDyeColor spill4398_5;
    boolean spill4398_6;
    boolean spill4398_7;
    int spill4398_8;
    int spill4398_9;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    net.minecraft.entity.Entity[] life5_7;
    moom.wB life7_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_184: {
    forward_join_180: {
    forward_join_173: {
    forward_join_171: {
    forward_join_165: {
    forward_join_163: {
    forward_join_142: {
    forward_join_139: {
    forward_join_137: {
    forward_join_115: {
    forward_join_113: {
    forward_join_111: {
    forward_join_108: {
    forward_join_96: {
    forward_join_92: {
    forward_join_68: {
    forward_join_63: {
    forward_join_49: {
    forward_join_48: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.we.r ^ 133405176534789L);
    spill4398_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life5_7 = spill4398_0;
    life7_13 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    spill4398_1 = life7_13;
    if (!((life5_7 == null))) {
        forwardValue4398_19_0 = spill4398_1;
        break forward_join_19;
    }
    if (!((spill4398_1 != null))) {
        break forward_join_184;
    }
    forwardValue4398_19_0 = life7_13;
    }
    if (!((life5_7 == null))) {
        forwardValue4398_24_0 = forwardValue4398_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4398_19_0)).a__Boolean())) {
        break forward_join_184;
    }
    forwardValue4398_24_0 = life7_13;
    }
    life8_34 = ((moom.wB)(forwardValue4398_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4398_2 = p1;
    if (!((life5_7 == null))) {
        forwardValue4398_49_0 = spill4398_2;
        break forward_join_49;
    }
    if (!((spill4398_2 == 0))) {
        break forward_join_48;
    }
    spill4398_3 = ((moom.we)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(2)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4398_8(27660, (3036507201985993003L ^ life3_3)))), ((boolean)(true)));
    if (!((life5_7 == null))) {
        forwardValue4398_165_0 = ((spill4398_3) ? 1 : 0);
        break forward_join_165;
    }
    if (!((!spill4398_3))) {
        break forward_join_163;
    }
    return null;
    }
    forwardValue4398_49_0 = p1;
    }
    if (!((life5_7 == null))) {
        forwardValue4398_63_0 = forwardValue4398_49_0;
        break forward_join_63;
    }
    if (!((forwardValue4398_49_0 == 1))) {
        break forward_join_68;
    }
    forwardValue4398_63_0 = ((((moom.we)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(2)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4398_11(29129, (3855197261863699708L ^ life3_3)))), ((boolean)(true)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4398_165_0 = forwardValue4398_63_0;
        break forward_join_165;
    }
    if (!((forwardValue4398_63_0 == 0))) {
        break forward_join_163;
    }
    return null;
    }
    spill4398_4 = ((net.minecraft.item.ItemStack)(life8_34)).a__wQ();
    if (!((life5_7 == null))) {
        forwardValue4398_96_0 = spill4398_4;
        break forward_join_96;
    }
    if (!((spill4398_4 == net.minecraft.init.Items.aW))) {
        break forward_join_92;
    }
    spill4398_5 = net.minecraft.item.EnumDyeColor.a(((int)(((net.minecraft.item.ItemStack)(life8_34)).c())));
    if (!((life5_7 == null))) {
        forwardValue4398_96_0 = spill4398_5;
        break forward_join_96;
    }
    if (!((spill4398_5 == net.minecraft.item.EnumDyeColor.BLUE))) {
        break forward_join_92;
    }
    spill4398_6 = ((moom.we)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(1)), ((int)(2)), ((boolean)(true)));
    if (!((life5_7 == null))) {
        forwardValue4398_165_0 = ((spill4398_6) ? 1 : 0);
        break forward_join_165;
    }
    if (!((!spill4398_6))) {
        break forward_join_163;
    }
    return null;
    }
    forwardValue4398_96_0 = ((java.util.List)(this.b)).get(((int)(0)));
    }
    spill4398_7 = ((moom.wB)(((moom.wB)(forwardValue4398_96_0)))).a__Boolean();
    if (!((life5_7 == null))) {
        forwardValue4398_108_0 = ((spill4398_7) ? 1 : 0);
        break forward_join_108;
    }
    if (!((!spill4398_7))) {
        break forward_join_111;
    }
    forwardValue4398_108_0 = ((((moom.wB)(((moom.wB)(((java.util.List)(this.b)).get(((int)(0))))))).a__Boolean(((net.minecraft.item.ItemStack)(life8_34)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4398_115_0 = forwardValue4398_108_0;
        break forward_join_115;
    }
    if (!((forwardValue4398_108_0 == 0))) {
        break forward_join_113;
    }
    }
    return null;
    }
    forwardValue4398_115_0 = ((((net.minecraft.item.ItemStack)(life8_34)).e__Boolean()) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4398_139_0 = forwardValue4398_115_0;
        break forward_join_139;
    }
    if (!((forwardValue4398_115_0 != 0))) {
        break forward_join_137;
    }
    spill4398_8 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    spill4398_9 = 1;
    if (!((life5_7 == null))) {
        forwardValue4398_142_0 = spill4398_8;
        forwardValue4398_142_1 = spill4398_9;
        break forward_join_142;
    }
    if (!((spill4398_8 == spill4398_9))) {
        break forward_join_137;
    }
    ((moom.wB)(((moom.wB)(((java.util.List)(this.b)).get(((int)(0))))))).b(((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(life8_34)).a__xW())));
    ((net.minecraft.item.ItemStack)(life8_34)).b = ((int)(0));
    if (!((life5_7 != null))) {
        break forward_join_163;
    }
    }
    forwardValue4398_139_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((life5_7 == null))) {
        forwardValue4398_165_0 = forwardValue4398_139_0;
        break forward_join_165;
    }
    forwardValue4398_142_0 = forwardValue4398_139_0;
    forwardValue4398_142_1 = 1;
    }
    if (!((forwardValue4398_142_0 >= forwardValue4398_142_1))) {
        break forward_join_163;
    }
    ((moom.wB)(((moom.wB)(((java.util.List)(this.b)).get(((int)(0))))))).b(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(life8_34)).a__wQ(), 1, ((net.minecraft.item.ItemStack)(life8_34)).c()))));
    net.minecraft.item.ItemStack __stackOp4398_47_0 = life8_34;
    ((net.minecraft.item.ItemStack)(__stackOp4398_47_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4398_47_0)).b - 1)));
    }
    forwardValue4398_165_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4398_165_0 == 0))) {
        break forward_join_171;
    }
    ((moom.wB)(life7_13)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_7 != null))) {
        break forward_join_173;
    }
    }
    ((moom.wB)(life7_13)).a__Void();
    }
    if (!((((net.minecraft.item.ItemStack)(life8_34)).b == ((net.minecraft.item.ItemStack)(life6_6)).b))) {
        break forward_join_180;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life8_34)));
    }
    return life6_6;
}


private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8955a704f2d56f0a_originalDynamicSite751_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4398_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4398_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_476477106c8c_originalDynamicSite1695_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_476477106c8c_originalDynamicSite1695_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1373_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1373_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_invokedynamic4402_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_abdbec025829_invokedynamic516_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_abdbec025829_invokedynamic516_91(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9578_0() throws E;

private static native int __sourceExactCall_5a21bf66ab78fc(net.minecraft.entity.player.EntityPlayer p0);
}
