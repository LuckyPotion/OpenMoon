package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wh extends moom.v8 {

private net.minecraft.inventory.IInventory k;

private net.minecraft.entity.passive.EntityHorse l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public wh(net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1, net.minecraft.entity.passive.EntityHorse p2, net.minecraft.entity.player.EntityPlayer p3) { super(); }


private static void __sourceConstructorBody_217e6b4379ac51b1(moom.wh receiver, net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1, net.minecraft.entity.passive.EntityHorse p2, net.minecraft.entity.player.EntityPlayer p3) throws Throwable {

int forestValue512_134_0;

    int forestValue512_208_0;

    net.minecraft.entity.Entity[] spill512_0;

    boolean spill512_1;

    int spill512_2;

    int spill512_3;

    long life5_3;

    net.minecraft.entity.Entity[] life7_13;

    int life8_15;

    int life9_28;

    int life10_75;

    int life11_82;

    int life10_136;

    int life11_143;

    int life10_211;

    forest_join_247: {

    forest_join_208: {

    forest_join_207: {

    forest_join_134: {

    forest_join_133: {

    life5_3 = (moom.wh.m ^ 814133527926L);

    moom.wh.__sourceConstructorInit_217e6b4379ac51b1_0(((moom.wh)(receiver)));

    ((moom.wh)(receiver)).k = ((net.minecraft.inventory.IInventory)(p1));

    spill512_0 = moom.v8.b__Arrayr3();

    ((moom.wh)(receiver)).l = ((net.minecraft.entity.passive.EntityHorse)(p2));

    life7_13 = spill512_0;

    life8_15 = 3;

    ((net.minecraft.inventory.IInventory)(p1)).b(((net.minecraft.entity.player.EntityPlayer)(p3)));

    life9_28 = ((life8_15 - 4) * __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_6(32155, (2307397588869682573L ^ life5_3)));

    ((moom.wh)(receiver)).a(((moom.wB)(new moom.wI(receiver, p1, 0, __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_7(11513, (5903679815582631145L ^ life5_3)), __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_8(1148, (96384810494487657L ^ life5_3))))));

    ((moom.wh)(receiver)).a(((moom.wB)(new moom.wJ(receiver, p1, 1, __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_10(5893, (8875811186325749530L ^ life5_3)), __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_11(18636, (3400777369837215966L ^ life5_3)), p2))));

    spill512_1 = ((net.minecraft.entity.passive.EntityHorse)(p2)).ai__Boolean();

    if (!((life7_13 == null))) {

        forestValue512_134_0 = ((spill512_1) ? 1 : 0);

        break forest_join_134;

    }

    if (!(spill512_1)) {

        break forest_join_133;

    }

    life10_75 = 0;

    forest_cycle_75: while (true) {

    forest_join_131: {

    forest_join_130: {

    if (!((life10_75 < life8_15))) {

        break forest_join_133;

    }

    spill512_2 = 0;

    if (!((life7_13 == null))) {

        forestValue512_134_0 = spill512_2;

        break forest_join_134;

    }

    life11_82 = spill512_2;

    forest_cycle_82: while (true) {

    if (!((life11_82 < 5))) {

        break forest_join_130;

    }

    ((moom.wh)(receiver)).a(((moom.wB)(new moom.wB(p1, ((2 + life11_82) + (life10_75 * 5)), (__sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_15(5669, (5337924984649678385L ^ life5_3)) + (life11_82 * __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_16(1148, (96384810494487657L ^ life5_3)))), (__sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_17(1148, (96384810494487657L ^ life5_3)) + (life10_75 * __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_18(1148, (96384810494487657L ^ life5_3))))))));

    life11_82 += 1;

    if (!((life7_13 == null))) {

        break forest_join_131;

    }

    if (!((life7_13 != null))) {

        continue forest_cycle_82;

    }

    break forest_cycle_82;

    }

    }

    life10_75 += 1;

    }

    if (!((life7_13 != null))) {

        continue forest_cycle_75;

    }

    break forest_cycle_75;

    }

    }

    forestValue512_134_0 = 0;

    }

    life10_136 = forestValue512_134_0;

    forest_cycle_135: while (true) {

    forest_join_205: {

    forest_join_204: {

    if (!((life10_136 < 3))) {

        break forest_join_207;

    }

    spill512_3 = 0;

    if (!((life7_13 == null))) {

        forestValue512_208_0 = spill512_3;

        break forest_join_208;

    }

    life11_143 = spill512_3;

    forest_cycle_142: while (true) {

    if (!((life11_143 < __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_20(25340, (7602761224322517743L ^ life5_3))))) {

        break forest_join_204;

    }

    ((moom.wh)(receiver)).a(((moom.wB)(new moom.wB(p0, ((life11_143 + (life10_136 * __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_21(6202, (4456473432294912036L ^ life5_3)))) + __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_22(6202, (4456473432294912036L ^ life5_3))), (__sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_23(5893, (8875811186325749530L ^ life5_3)) + (life11_143 * __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_24(1148, (96384810494487657L ^ life5_3)))), ((__sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_25(32455, (5797344387576567504L ^ life5_3)) + (life10_136 * __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_26(1148, (96384810494487657L ^ life5_3)))) + life9_28)))));

    life11_143 += 1;

    if (!((life7_13 == null))) {

        break forest_join_205;

    }

    if (!((life7_13 != null))) {

        continue forest_cycle_142;

    }

    break forest_cycle_142;

    }

    }

    life10_136 += 1;

    }

    if (!((life7_13 != null))) {

        continue forest_cycle_135;

    }

    break forest_cycle_135;

    }

    }

    forestValue512_208_0 = 0;

    }

    life10_211 = forestValue512_208_0;

    forest_cycle_209: while (true) {

    if (!((life10_211 < __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_28(6202, (4456473432294912036L ^ life5_3))))) {

        break forest_join_247;

    }

    ((moom.wh)(receiver)).a(((moom.wB)(new moom.wB(p0, life10_211, (__sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_29(5893, (8875811186325749530L ^ life5_3)) + (life10_211 * __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_30(1148, (96384810494487657L ^ life5_3)))), (__sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_31(14982, (8142875363257701015L ^ life5_3)) + life9_28)))));

    life10_211 += 1;

    if (!((life7_13 != null))) {

        continue forest_cycle_209;

    }

    break forest_cycle_209;

    }

    }

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(4659054598248630598L)), ((long)(7171390520156341545L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(102696048845656L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wh.m ^ 115702204759006L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1650_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1650_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1650_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1650_14 = new byte[8];
    (__sourceSpill1650_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1650_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1650_16 = __sourceSpill1650_14;
    ((javax.crypto.Cipher)(__sourceSpill1650_11)).init(((int)(__sourceSpill1650_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1650_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1650_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ù¾¯¶èW\tl;T°±¦\030wéÏl½_M#økkh\bvÓ\b7]£æMº\022O¼ÿ¢@\002[ÄÃ)§åý\nS×^Æ\016\033"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1650_25 = local6_life21;
        int __sourceSpill1650_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1650_25)).substring(((int)(__sourceSpill1650_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1650_30 = local8_life19;
        int __sourceSpill1650_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1650_33 = new byte[8];
        (__sourceSpill1650_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1650_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1650_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1650_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1650_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1650_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1650_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1650_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1650_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1650_34)).doFinal(((byte[])(__sourceSpill1650_33)));
        (__sourceSpill1650_30)[__sourceSpill1650_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ðkI\023©P\021Íñ«!Ì\022Sf"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1650_38 = local6_life21;
        int __sourceSpill1650_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1650_38)).substring(((int)(__sourceSpill1650_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1650_43 = local8_life19;
        int __sourceSpill1650_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1650_46 = new byte[8];
        (__sourceSpill1650_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1650_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1650_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1650_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1650_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1650_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1650_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1650_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1650_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1650_47)).doFinal(((byte[])(__sourceSpill1650_46)));
        (__sourceSpill1650_43)[__sourceSpill1650_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> void __sourceConstructorInit_217e6b4379ac51b1_0(moom.wh a0) throws E;

private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5959;
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
            throw new RuntimeException("moom/wh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wh.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4409_16_0;
    int forwardValue4409_25_0;
    int forwardValue4409_29_0;
    int forwardValue4409_31_0;
    boolean spill4409_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_16: {
    life2_3 = (moom.wh.m ^ 116670199706086L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4409_0 = ((net.minecraft.inventory.IInventory)(this.k)).a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4409_16_0 = ((spill4409_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill4409_0)) {
        break forward_join_30;
    }
    forwardValue4409_16_0 = ((((net.minecraft.entity.passive.EntityHorse)(this.l)).p__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4409_25_0 = forwardValue4409_16_0;
        break forward_join_25;
    }
    if (!((forwardValue4409_16_0 != 0))) {
        break forward_join_30;
    }
    forwardValue4409_25_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.passive.EntityHorse)(this.l)).a__Float(((net.minecraft.entity.Entity)(p0))))), ((float)(0x1.0p3f)));
    }
    if (!((life4_5 == null))) {
        forwardValue4409_29_0 = forwardValue4409_25_0;
        break forward_join_29;
    }
    if (!((forwardValue4409_25_0 < 0))) {
        break forward_join_30;
    }
    forwardValue4409_29_0 = 1;
    }
    forwardValue4409_31_0 = forwardValue4409_29_0;
    break forward_join_31;
    }
    forwardValue4409_31_0 = 0;
    }
    return ((forwardValue4409_31_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9593_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4408_19_0;
    moom.wB forwardValue4408_24_0;
    int forwardValue4408_56_0;
    int forwardValue4408_82_0;
    int forwardValue4408_99_0;
    int forwardValue4408_111_0;
    int forwardValue4408_118_0;
    net.minecraft.entity.Entity[] spill4408_0;
    moom.wB spill4408_1;
    int spill4408_2;
    boolean spill4408_3;
    boolean spill4408_4;
    boolean spill4408_5;
    boolean spill4408_6;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    net.minecraft.entity.Entity[] life5_7;
    moom.wB life7_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_126: {
    forward_join_124: {
    forward_join_118: {
    forward_join_116: {
    forward_join_114: {
    forward_join_111: {
    forward_join_99: {
    forward_join_96: {
    forward_join_82: {
    forward_join_77: {
    forward_join_56: {
    forward_join_51: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wh.m ^ 72341406482041L);
    spill4408_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life5_7 = spill4408_0;
    life7_13 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    spill4408_1 = life7_13;
    if (!((life5_7 == null))) {
        forwardValue4408_19_0 = spill4408_1;
        break forward_join_19;
    }
    if (!((spill4408_1 != null))) {
        break forward_join_126;
    }
    forwardValue4408_19_0 = life7_13;
    }
    if (!((life5_7 == null))) {
        forwardValue4408_24_0 = forwardValue4408_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4408_19_0)).a__Boolean())) {
        break forward_join_126;
    }
    forwardValue4408_24_0 = life7_13;
    }
    life8_34 = ((moom.wB)(forwardValue4408_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4408_2 = p1;
    if (!((life5_7 == null))) {
        forwardValue4408_56_0 = spill4408_2;
        break forward_join_56;
    }
    if (!((spill4408_2 < ((net.minecraft.inventory.IInventory)(this.k)).b__Int()))) {
        break forward_join_51;
    }
    spill4408_3 = ((moom.wh)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(((net.minecraft.inventory.IInventory)(this.k)).b__Int())), ((int)(((java.util.List)(this.b)).size())), ((boolean)(true)));
    if (!((life5_7 == null))) {
        forwardValue4408_118_0 = ((spill4408_3) ? 1 : 0);
        break forward_join_118;
    }
    if (!((!spill4408_3))) {
        break forward_join_116;
    }
    return null;
    }
    forwardValue4408_56_0 = ((((moom.wB)(((moom.wh)(this)).a__wB(((int)(1))))).a__Boolean(((net.minecraft.item.ItemStack)(life8_34)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4408_82_0 = forwardValue4408_56_0;
        break forward_join_82;
    }
    if (!((forwardValue4408_56_0 != 0))) {
        break forward_join_77;
    }
    spill4408_4 = ((moom.wB)(((moom.wh)(this)).a__wB(((int)(1))))).a__Boolean();
    if (!((life5_7 == null))) {
        forwardValue4408_82_0 = ((spill4408_4) ? 1 : 0);
        break forward_join_82;
    }
    if (!((!spill4408_4))) {
        break forward_join_77;
    }
    spill4408_5 = ((moom.wh)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(1)), ((int)(2)), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4408_118_0 = ((spill4408_5) ? 1 : 0);
        break forward_join_118;
    }
    if (!((!spill4408_5))) {
        break forward_join_116;
    }
    return null;
    }
    forwardValue4408_82_0 = ((((moom.wB)(((moom.wh)(this)).a__wB(((int)(0))))).a__Boolean(((net.minecraft.item.ItemStack)(life8_34)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4408_99_0 = forwardValue4408_82_0;
        break forward_join_99;
    }
    if (!((forwardValue4408_82_0 != 0))) {
        break forward_join_96;
    }
    spill4408_6 = ((moom.wh)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(0)), ((int)(1)), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4408_118_0 = ((spill4408_6) ? 1 : 0);
        break forward_join_118;
    }
    if (!((!spill4408_6))) {
        break forward_join_116;
    }
    return null;
    }
    forwardValue4408_99_0 = ((net.minecraft.inventory.IInventory)(this.k)).b__Int();
    }
    if (!((life5_7 == null))) {
        forwardValue4408_111_0 = forwardValue4408_99_0;
        break forward_join_111;
    }
    if (!((forwardValue4408_99_0 > 2))) {
        break forward_join_114;
    }
    forwardValue4408_111_0 = ((((moom.wh)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(2)), ((int)(((net.minecraft.inventory.IInventory)(this.k)).b__Int())), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4408_118_0 = forwardValue4408_111_0;
        break forward_join_118;
    }
    if (!((forwardValue4408_111_0 == 0))) {
        break forward_join_116;
    }
    }
    return null;
    }
    forwardValue4408_118_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4408_118_0 == 0))) {
        break forward_join_124;
    }
    ((moom.wB)(life7_13)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_7 != null))) {
        break forward_join_126;
    }
    }
    ((moom.wB)(life7_13)).a__Void();
    }
    return life6_6;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
__sourceExactCall_d64c5fb3eacd06(this, ((net.minecraft.entity.player.EntityPlayer)(p0)));
    __sourceExactCall_42b50db9a9d492(((net.minecraft.inventory.IInventory)(this.k)), ((net.minecraft.entity.player.EntityPlayer)(p0)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_217e6b4379ac51b1_invokedynamic512_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9593_0() throws E;

private static native void __sourceExactCall_d64c5fb3eacd06(moom.v8 p0, net.minecraft.entity.player.EntityPlayer p1);
private static native void __sourceExactCall_42b50db9a9d492(net.minecraft.inventory.IInventory p0, net.minecraft.entity.player.EntityPlayer p1);
}
