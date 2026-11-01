package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wc extends moom.v8 {

private net.minecraft.inventory.IInventory k;

private int l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public wc(net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1, net.minecraft.entity.player.EntityPlayer p2) { super(); }


private static void __sourceConstructorBody_f245623befec1dcb(moom.wc receiver, net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1, net.minecraft.entity.player.EntityPlayer p2) throws Throwable {

int __initValue749_103_0;

    int __initValue749_177_0;

    long local4_life2;

    net.minecraft.entity.Entity[] local6_life11;

    int local7_life16;

    int local8_life17;

    int local9_life20;

    init_join_216: {

    init_join_177: {

    init_join_176: {

    init_join_103: {

    init_join_102: {

    local4_life2 = (moom.wc.m ^ 953981768147L);

    net.minecraft.entity.Entity[] __sourceSpill749_4 = moom.v8.b__Arrayr3();

    moom.wc.__sourceConstructorInit_f245623befec1dcb_0(((moom.wc)(receiver)));

    ((moom.wc)(receiver)).k = ((net.minecraft.inventory.IInventory)(p1));

    ((moom.wc)(receiver)).l = ((int)((((net.minecraft.inventory.IInventory)(p1)).b__Int() / __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_9(4967, (100784559460791701L ^ local4_life2)))));

    local6_life11 = __sourceSpill749_4;

    ((net.minecraft.inventory.IInventory)(p1)).b(((net.minecraft.entity.player.EntityPlayer)(p2)));

    local7_life16 = ((((moom.wc)(receiver)).l - 4) * __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_15(16176, (3800285409104009665L ^ local4_life2)));

    local8_life17 = 0;

    init_cycle_37: while (true) {

    init_join_100: {

    init_join_99: {

    if (!((local8_life17 < ((moom.wc)(receiver)).l))) {

        break init_join_102;

    }

    int __sourceSpill749_19 = 0;

    if (!((local6_life11 == null))) {

        __initValue749_103_0 = __sourceSpill749_19;

        break init_join_103;

    }

    local9_life20 = __sourceSpill749_19;

    init_cycle_45: while (true) {

    if (!((local9_life20 < __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_22(3594, (3239915367338223868L ^ local4_life2))))) {

        break init_join_99;

    }

    ((moom.wc)(receiver)).a(((moom.wB)(new moom.wB(p1, (local9_life20 + (local8_life17 * __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_24(3594, (3239915367338223868L ^ local4_life2)))), (__sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_26(17098, (2476989539083117625L ^ local4_life2)) + (local9_life20 * __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_28(25997, (1434534728506557306L ^ local4_life2)))), (__sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_30(25997, (1434534728506557306L ^ local4_life2)) + (local8_life17 * __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_32(25997, (1434534728506557306L ^ local4_life2))))))));

    local9_life20 += 1;

    if (!((local6_life11 == null))) {

        break init_join_100;

    }

    if (!((local6_life11 != null))) { continue init_cycle_45; }

    break init_cycle_45;

    }

    }

    local8_life17 += 1;

    }

    if (!((local6_life11 != null))) { continue init_cycle_37; }

    break init_cycle_37;

    }

    }

    __initValue749_103_0 = 0;

    }

    local8_life17 = __initValue749_103_0;

    init_cycle_104: while (true) {

    init_join_174: {

    init_join_173: {

    if (!((local8_life17 < 3))) {

        break init_join_176;

    }

    int __sourceSpill749_34 = 0;

    if (!((local6_life11 == null))) {

        __initValue749_177_0 = __sourceSpill749_34;

        break init_join_177;

    }

    local9_life20 = __sourceSpill749_34;

    init_cycle_111: while (true) {

    if (!((local9_life20 < __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_36(3594, (3239915367338223868L ^ local4_life2))))) {

        break init_join_173;

    }

    ((moom.wc)(receiver)).a(((moom.wB)(new moom.wB(p0, ((local9_life20 + (local8_life17 * __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_38(3594, (3239915367338223868L ^ local4_life2)))) + __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_40(3594, (3239915367338223868L ^ local4_life2))), (__sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_42(2826, (8360932575018626558L ^ local4_life2)) + (local9_life20 * __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_44(25997, (1434534728506557306L ^ local4_life2)))), ((__sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_46(24733, (5126486676274464365L ^ local4_life2)) + (local8_life17 * __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_48(25997, (1434534728506557306L ^ local4_life2)))) + local7_life16)))));

    local9_life20 += 1;

    if (!((local6_life11 == null))) {

        break init_join_174;

    }

    if (!((local6_life11 != null))) { continue init_cycle_111; }

    break init_cycle_111;

    }

    }

    local8_life17 += 1;

    }

    if (!((local6_life11 != null))) { continue init_cycle_104; }

    break init_cycle_104;

    }

    }

    __initValue749_177_0 = 0;

    }

    local8_life17 = __initValue749_177_0;

    init_cycle_178: while (true) {

    if (!((local8_life17 < __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_51(3594, (3239915367338223868L ^ local4_life2))))) {

        break init_join_216;

    }

    ((moom.wc)(receiver)).a(((moom.wB)(new moom.wB(p0, local8_life17, (__sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_53(2826, (8360932575018626558L ^ local4_life2)) + (local8_life17 * __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_55(25997, (1434534728506557306L ^ local4_life2)))), (__sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_57(24398, (8109657959567456699L ^ local4_life2)) + local7_life16)))));

    local8_life17 += 1;

    if (!((local6_life11 != null))) { continue init_cycle_178; }

    break init_cycle_178;

    }

    }

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(4527267354413731448L)), ((long)(-3034350361174830548L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80878250263644L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wc.m ^ 59346696739609L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1645_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1645_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1645_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1645_14 = new byte[8];
    (__sourceSpill1645_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1645_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1645_16 = __sourceSpill1645_14;
    ((javax.crypto.Cipher)(__sourceSpill1645_11)).init(((int)(__sourceSpill1645_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1645_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1645_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ö\007\035/T[±S\003Q­Ñs\005©.ábÛäl\030èÞöAÙ±ÃKKú\027¸´Û;Ö"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1645_25 = local6_life21;
        int __sourceSpill1645_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1645_25)).substring(((int)(__sourceSpill1645_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1645_30 = local8_life19;
        int __sourceSpill1645_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1645_33 = new byte[8];
        (__sourceSpill1645_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1645_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1645_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1645_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1645_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1645_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1645_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1645_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1645_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1645_34)).doFinal(((byte[])(__sourceSpill1645_33)));
        (__sourceSpill1645_30)[__sourceSpill1645_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "è\006Â9izÞKFÐ$ÄWSJ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1645_38 = local6_life21;
        int __sourceSpill1645_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1645_38)).substring(((int)(__sourceSpill1645_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1645_43 = local8_life19;
        int __sourceSpill1645_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1645_46 = new byte[8];
        (__sourceSpill1645_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1645_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1645_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1645_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1645_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1645_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1645_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1645_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1645_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1645_47)).doFinal(((byte[])(__sourceSpill1645_46)));
        (__sourceSpill1645_43)[__sourceSpill1645_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_f245623befec1dcb_0(moom.wc a0) throws E;

private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18187;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.inventory.IInventory)(this.k)).a(((net.minecraft.entity.player.EntityPlayer)(p0))))) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wc.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9573_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4394_19_0;
    moom.wB forwardValue4394_24_0;
    int forwardValue4394_74_0;
    int forwardValue4394_81_0;
    net.minecraft.entity.Entity[] spill4394_0;
    moom.wB spill4394_1;
    int spill4394_2;
    boolean spill4394_3;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    net.minecraft.entity.Entity[] life5_7;
    moom.wB life7_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_89: {
    forward_join_87: {
    forward_join_81: {
    forward_join_79: {
    forward_join_74: {
    forward_join_61: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wc.m ^ 103462179058800L);
    spill4394_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life5_7 = spill4394_0;
    life7_13 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    spill4394_1 = life7_13;
    if (!((life5_7 == null))) {
        forwardValue4394_19_0 = spill4394_1;
        break forward_join_19;
    }
    if (!((spill4394_1 != null))) {
        break forward_join_89;
    }
    forwardValue4394_19_0 = life7_13;
    }
    if (!((life5_7 == null))) {
        forwardValue4394_24_0 = forwardValue4394_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4394_19_0)).a__Boolean())) {
        break forward_join_89;
    }
    forwardValue4394_24_0 = life7_13;
    }
    life8_34 = ((moom.wB)(forwardValue4394_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4394_2 = p1;
    if (!((life5_7 == null))) {
        forwardValue4394_74_0 = spill4394_2;
        break forward_join_74;
    }
    if (!((spill4394_2 < (this.l * __sourceIntrinsic_245d151687c8_invokedynamic4394_9(3594, (3239815582611574111L ^ life3_3)))))) {
        break forward_join_61;
    }
    spill4394_3 = ((moom.wc)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)((this.l * __sourceIntrinsic_245d151687c8_invokedynamic4394_11(3594, (3239815582611574111L ^ life3_3))))), ((int)(((java.util.List)(this.b)).size())), ((boolean)(true)));
    if (!((life5_7 == null))) {
        forwardValue4394_81_0 = ((spill4394_3) ? 1 : 0);
        break forward_join_81;
    }
    if (!((!spill4394_3))) {
        break forward_join_79;
    }
    return null;
    }
    forwardValue4394_74_0 = ((((moom.wc)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(0)), ((int)((this.l * __sourceIntrinsic_245d151687c8_invokedynamic4394_17(3594, (3239815582611574111L ^ life3_3))))), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4394_81_0 = forwardValue4394_74_0;
        break forward_join_81;
    }
    if (!((forwardValue4394_74_0 == 0))) {
        break forward_join_79;
    }
    return null;
    }
    forwardValue4394_81_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4394_81_0 == 0))) {
        break forward_join_87;
    }
    ((moom.wB)(life7_13)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_7 != null))) {
        break forward_join_89;
    }
    }
    ((moom.wB)(life7_13)).a__Void();
    }
    return life6_6;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.inventory.IInventory a__sourceReturn_6fb8138116() {
return this.k;
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
__sourceExactCall_d64c5fb3eacd06(this, ((net.minecraft.entity.player.EntityPlayer)(p0)));
    __sourceExactCall_42b50db9a9d492(((net.minecraft.inventory.IInventory)(this.k)), ((net.minecraft.entity.player.EntityPlayer)(p0)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f245623befec1dcb_originalDynamicSite749_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4394_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4394_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4394_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9573_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native void __sourceExactCall_d64c5fb3eacd06(moom.v8 p0, net.minecraft.entity.player.EntityPlayer p1);
private static native void __sourceExactCall_42b50db9a9d492(net.minecraft.inventory.IInventory p0, net.minecraft.entity.player.EntityPlayer p1);
}
