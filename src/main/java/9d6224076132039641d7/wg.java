package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wg extends moom.v8 {

private net.minecraft.inventory.IInventory k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public wg(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1, net.minecraft.entity.player.EntityPlayer p2) { super(); }


private static void __sourceConstructorBody_67e1b634939cfcdb(moom.wg receiver, net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1, net.minecraft.entity.player.EntityPlayer p2) throws Throwable {

int __initValue753_126_0;

    long local4_life2;

    net.minecraft.entity.Entity[] local6_life8;

    int local7_life11;

    int local8_life12;

    int local9_life22;

    init_join_165: {

    init_join_126: {

    init_join_125: {

    init_join_59: {

    init_join_57: {

    local4_life2 = (moom.wg.l ^ 50851401971300L);

    net.minecraft.entity.Entity[] __sourceSpill753_4 = moom.v8.b__Arrayr3();

    moom.wg.__sourceConstructorInit_67e1b634939cfcdb_0(((moom.wg)(receiver)));

    ((moom.wg)(receiver)).k = ((net.minecraft.inventory.IInventory)(p1));

    ((net.minecraft.inventory.IInventory)(p1)).b(((net.minecraft.entity.player.EntityPlayer)(p2)));

    local6_life8 = __sourceSpill753_4;

    local7_life11 = __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_10(12479, (4145998263768623672L ^ local4_life2));

    local8_life12 = 0;

    init_cycle_22: while (true) {

    if (!((local8_life12 < ((net.minecraft.inventory.IInventory)(p1)).b__Int()))) {

        break init_join_57;

    }

    ((moom.wg)(receiver)).a(((moom.wB)(new moom.wB(p1, local8_life12, (__sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_15(7891, (2221769073028727894L ^ local4_life2)) + (local8_life12 * __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_17(11391, (8922182634996512508L ^ local4_life2)))), __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_19(15539, (6717410903116916273L ^ local4_life2))))));

    local8_life12 += 1;

    if (!((local6_life8 == null))) {

        break init_join_59;

    }

    if (!((local6_life8 != null))) { continue init_cycle_22; }

    break init_cycle_22;

    }

    }

    local8_life12 = 0;

    }

    init_cycle_59: while (true) {

    init_join_123: {

    init_join_122: {

    if (!((local8_life12 < 3))) {

        break init_join_125;

    }

    int __sourceSpill753_21 = 0;

    if (!((local6_life8 == null))) {

        __initValue753_126_0 = __sourceSpill753_21;

        break init_join_126;

    }

    local9_life22 = __sourceSpill753_21;

    init_cycle_66: while (true) {

    if (!((local9_life22 < __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_24(4269, (1232565949951543853L ^ local4_life2))))) {

        break init_join_122;

    }

    ((moom.wg)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), ((local9_life22 + (local8_life12 * __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_26(16260, (905973395238462729L ^ local4_life2)))) + __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_28(16260, (905973395238462729L ^ local4_life2))), (__sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_30(6499, (5552164550817416165L ^ local4_life2)) + (local9_life22 * __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_32(21847, (8199461043139268566L ^ local4_life2)))), ((local8_life12 * __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_34(21847, (8199461043139268566L ^ local4_life2))) + local7_life11)))));

    local9_life22 += 1;

    if (!((local6_life8 == null))) {

        break init_join_123;

    }

    if (!((local6_life8 != null))) { continue init_cycle_66; }

    break init_cycle_66;

    }

    }

    local8_life12 += 1;

    }

    if (!((local6_life8 != null))) { continue init_cycle_59; }

    break init_cycle_59;

    }

    }

    __initValue753_126_0 = 0;

    }

    local8_life12 = __initValue753_126_0;

    init_cycle_127: while (true) {

    if (!((local8_life12 < __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_37(16260, (905973395238462729L ^ local4_life2))))) {

        break init_join_165;

    }

    ((moom.wg)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), local8_life12, (__sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_39(31541, (7391775540658135481L ^ local4_life2)) + (local8_life12 * __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_41(21847, (8199461043139268566L ^ local4_life2)))), (__sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_43(5352, (2813882270545546860L ^ local4_life2)) + local7_life11)))));

    local8_life12 += 1;

    if (!((local6_life8 != null))) { continue init_cycle_127; }

    break init_cycle_127;

    }

    }

    return;

}



static {
l = ((long)(((moom._a)(moom._c.a(((long)(-1964308743309663494L)), ((long)(7378489374213510736L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(15250671481344L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wg.l ^ 50001188028035L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1649_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1649_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1649_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1649_14 = new byte[8];
    (__sourceSpill1649_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1649_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1649_16 = __sourceSpill1649_14;
    ((javax.crypto.Cipher)(__sourceSpill1649_11)).init(((int)(__sourceSpill1649_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1649_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1649_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "FJÂV\rá2[\024bsÑÏ\017¬7)³\tS­\022½\020_J«Ðê\024NÄòRlkãµÁWB \034dég«Þ¡àl9N£kÔ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1649_25 = local6_life21;
        int __sourceSpill1649_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1649_25)).substring(((int)(__sourceSpill1649_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1649_30 = local8_life19;
        int __sourceSpill1649_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1649_33 = new byte[8];
        (__sourceSpill1649_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1649_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1649_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1649_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1649_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1649_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1649_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1649_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1649_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1649_34)).doFinal(((byte[])(__sourceSpill1649_33)));
        (__sourceSpill1649_30)[__sourceSpill1649_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "H\023úë\0335d~x«C=8÷"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1649_38 = local6_life21;
        int __sourceSpill1649_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1649_38)).substring(((int)(__sourceSpill1649_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1649_43 = local8_life19;
        int __sourceSpill1649_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1649_46 = new byte[8];
        (__sourceSpill1649_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1649_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1649_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1649_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1649_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1649_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1649_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1649_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1649_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1649_47)).doFinal(((byte[])(__sourceSpill1649_46)));
        (__sourceSpill1649_43)[__sourceSpill1649_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> void __sourceConstructorInit_67e1b634939cfcdb_0(moom.wg a0) throws E;

private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4632;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wg.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.inventory.IInventory)(this.k)).a(((net.minecraft.entity.player.EntityPlayer)(p0))))) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9590_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4407_19_0;
    moom.wB forwardValue4407_24_0;
    int forwardValue4407_59_0;
    int forwardValue4407_66_0;
    net.minecraft.entity.Entity[] spill4407_0;
    moom.wB spill4407_1;
    int spill4407_2;
    boolean spill4407_3;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    moom.wB life7_12;
    net.minecraft.entity.Entity[] life5_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_74: {
    forward_join_72: {
    forward_join_66: {
    forward_join_64: {
    forward_join_59: {
    forward_join_51: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wg.l ^ 50802449873575L);
    spill4407_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life7_12 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    life5_13 = spill4407_0;
    spill4407_1 = life7_12;
    if (!((life5_13 == null))) {
        forwardValue4407_19_0 = spill4407_1;
        break forward_join_19;
    }
    if (!((spill4407_1 != null))) {
        break forward_join_74;
    }
    forwardValue4407_19_0 = life7_12;
    }
    if (!((life5_13 == null))) {
        forwardValue4407_24_0 = forwardValue4407_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4407_19_0)).a__Boolean())) {
        break forward_join_74;
    }
    forwardValue4407_24_0 = life7_12;
    }
    life8_34 = ((moom.wB)(forwardValue4407_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4407_2 = p1;
    if (!((life5_13 == null))) {
        forwardValue4407_59_0 = spill4407_2;
        break forward_join_59;
    }
    if (!((spill4407_2 < ((net.minecraft.inventory.IInventory)(this.k)).b__Int()))) {
        break forward_join_51;
    }
    spill4407_3 = ((moom.wg)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(((net.minecraft.inventory.IInventory)(this.k)).b__Int())), ((int)(((java.util.List)(this.b)).size())), ((boolean)(true)));
    if (!((life5_13 == null))) {
        forwardValue4407_66_0 = ((spill4407_3) ? 1 : 0);
        break forward_join_66;
    }
    if (!((!spill4407_3))) {
        break forward_join_64;
    }
    return null;
    }
    forwardValue4407_59_0 = ((((moom.wg)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(0)), ((int)(((net.minecraft.inventory.IInventory)(this.k)).b__Int())), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_13 == null))) {
        forwardValue4407_66_0 = forwardValue4407_59_0;
        break forward_join_66;
    }
    if (!((forwardValue4407_59_0 == 0))) {
        break forward_join_64;
    }
    return null;
    }
    forwardValue4407_66_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4407_66_0 == 0))) {
        break forward_join_72;
    }
    ((moom.wB)(life7_12)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_13 != null))) {
        break forward_join_74;
    }
    }
    ((moom.wB)(life7_12)).a__Void();
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


private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67e1b634939cfcdb_originalDynamicSite753_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9590_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native void __sourceExactCall_d64c5fb3eacd06(moom.v8 p0, net.minecraft.entity.player.EntityPlayer p1);
private static native void __sourceExactCall_42b50db9a9d492(net.minecraft.inventory.IInventory p0, net.minecraft.entity.player.EntityPlayer p1);
}
