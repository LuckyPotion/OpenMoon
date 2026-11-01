package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wd extends moom.v8 {

private net.minecraft.inventory.IInventory k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public wd(net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1) { super(); }


private static void __sourceConstructorBody_f4e1c66cfca44e96(moom.wd receiver, net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1) throws Throwable {

int __initValue750_70_0;

    int __initValue750_142_0;

    long local3_life2;

    int local6_life7;

    net.minecraft.entity.Entity[] local5_life8;

    int local7_life10;

    init_join_179: {

    init_join_142: {

    init_join_141: {

    init_join_70: {

    init_join_69: {

    local3_life2 = (moom.wd.l ^ 4399582792753L);

    moom.wd.__sourceConstructorInit_f4e1c66cfca44e96_0(((moom.wd)(receiver)));

    ((moom.wd)(receiver)).k = ((net.minecraft.inventory.IInventory)(p1));

    net.minecraft.entity.Entity[] __sourceSpill750_6 = moom.v8.b__Arrayr3();

    local6_life7 = 0;

    local5_life8 = __sourceSpill750_6;

    init_cycle_13: while (true) {

    init_join_67: {

    init_join_66: {

    if (!((local6_life7 < 3))) {

        break init_join_69;

    }

    int __sourceSpill750_9 = 0;

    if (!((local5_life8 == null))) {

        __initValue750_70_0 = __sourceSpill750_9;

        break init_join_70;

    }

    local7_life10 = __sourceSpill750_9;

    init_cycle_20: while (true) {

    if (!((local7_life10 < 3))) {

        break init_join_66;

    }

    ((moom.wd)(receiver)).a(((moom.wB)(new moom.wB(p1, (local7_life10 + (local6_life7 * 3)), (__sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_12(27557, (6645215585707215443L ^ local3_life2)) + (local7_life10 * __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_14(32401, (1898955524079411045L ^ local3_life2)))), (__sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_16(22273, (3613481686428874482L ^ local3_life2)) + (local6_life7 * __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_18(14597, (1312861883407472880L ^ local3_life2))))))));

    local7_life10 += 1;

    if (!((local5_life8 == null))) {

        break init_join_67;

    }

    if (!((local5_life8 != null))) { continue init_cycle_20; }

    break init_cycle_20;

    }

    }

    local6_life7 += 1;

    }

    if (!((local5_life8 != null))) { continue init_cycle_13; }

    break init_cycle_13;

    }

    }

    __initValue750_70_0 = 0;

    }

    local6_life7 = __initValue750_70_0;

    init_cycle_71: while (true) {

    init_join_139: {

    init_join_138: {

    if (!((local6_life7 < 3))) {

        break init_join_141;

    }

    int __sourceSpill750_20 = 0;

    if (!((local5_life8 == null))) {

        __initValue750_142_0 = __sourceSpill750_20;

        break init_join_142;

    }

    local7_life10 = __sourceSpill750_20;

    init_cycle_78: while (true) {

    if (!((local7_life10 < __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_22(15958, (5466871981651763108L ^ local3_life2))))) {

        break init_join_138;

    }

    ((moom.wd)(receiver)).a(((moom.wB)(new moom.wB(p0, ((local7_life10 + (local6_life7 * __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_24(20813, (2892816533202464947L ^ local3_life2)))) + __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_26(20813, (2892816533202464947L ^ local3_life2))), (__sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_28(21538, (4168643140525454814L ^ local3_life2)) + (local7_life10 * __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_30(14597, (1312861883407472880L ^ local3_life2)))), (__sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_32(21399, (98656455310045800L ^ local3_life2)) + (local6_life7 * __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_34(14597, (1312861883407472880L ^ local3_life2))))))));

    local7_life10 += 1;

    if (!((local5_life8 == null))) {

        break init_join_139;

    }

    if (!((local5_life8 != null))) { continue init_cycle_78; }

    break init_cycle_78;

    }

    }

    local6_life7 += 1;

    }

    if (!((local5_life8 != null))) { continue init_cycle_71; }

    break init_cycle_71;

    }

    }

    __initValue750_142_0 = 0;

    }

    local6_life7 = __initValue750_142_0;

    init_cycle_143: while (true) {

    if (!((local6_life7 < __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_37(20813, (2892816533202464947L ^ local3_life2))))) {

        break init_join_179;

    }

    ((moom.wd)(receiver)).a(((moom.wB)(new moom.wB(p0, local6_life7, (__sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_39(4720, (1938728625936774017L ^ local3_life2)) + (local6_life7 * __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_41(14597, (1312861883407472880L ^ local3_life2)))), __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_43(11259, (8891985893108845068L ^ local3_life2))))));

    local6_life7 += 1;

    if (!((local5_life8 != null))) { continue init_cycle_143; }

    break init_cycle_143;

    }

    }

    return;

}



static {
l = ((long)(((moom._a)(moom._c.a(((long)(-7972544731075999270L)), ((long)(-4625048423158410587L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(169628271369738L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wd.l ^ 44782234025620L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1646_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1646_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1646_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1646_14 = new byte[8];
    (__sourceSpill1646_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1646_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1646_16 = __sourceSpill1646_14;
    ((javax.crypto.Cipher)(__sourceSpill1646_11)).init(((int)(__sourceSpill1646_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1646_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1646_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "+!Í\0170Ýs\007HJÚ¸\005p\005\001^ß),­BcÁ\020zÞnýâ~0\001~ß#\034uÅi{\001\bko\037çeDTf\037ñDD\020_ÅSæJ»¦"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1646_25 = local6_life21;
        int __sourceSpill1646_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1646_25)).substring(((int)(__sourceSpill1646_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1646_30 = local8_life19;
        int __sourceSpill1646_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1646_33 = new byte[8];
        (__sourceSpill1646_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1646_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1646_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1646_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1646_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1646_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1646_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1646_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1646_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1646_34)).doFinal(((byte[])(__sourceSpill1646_33)));
        (__sourceSpill1646_30)[__sourceSpill1646_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Çhìâ\027KRx\fÌìü²U|4"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1646_38 = local6_life21;
        int __sourceSpill1646_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1646_38)).substring(((int)(__sourceSpill1646_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1646_43 = local8_life19;
        int __sourceSpill1646_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1646_46 = new byte[8];
        (__sourceSpill1646_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1646_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1646_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1646_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1646_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1646_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1646_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1646_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1646_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1646_47)).doFinal(((byte[])(__sourceSpill1646_46)));
        (__sourceSpill1646_43)[__sourceSpill1646_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> void __sourceConstructorInit_f4e1c66cfca44e96_0(moom.wd a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9575_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31438;
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
            throw new RuntimeException("moom/wd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wd.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.inventory.IInventory)(this.k)).a(((net.minecraft.entity.player.EntityPlayer)(p0))))) != 0);
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4395_19_0;
    moom.wB forwardValue4395_24_0;
    int forwardValue4395_67_0;
    int forwardValue4395_74_0;
    net.minecraft.entity.Entity[] spill4395_0;
    moom.wB spill4395_1;
    int spill4395_2;
    boolean spill4395_3;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    net.minecraft.entity.Entity[] life5_7;
    moom.wB life7_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_93: {
    forward_join_89: {
    forward_join_82: {
    forward_join_80: {
    forward_join_74: {
    forward_join_72: {
    forward_join_67: {
    forward_join_57: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wd.l ^ 11197420884822L);
    spill4395_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life5_7 = spill4395_0;
    life7_13 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    spill4395_1 = life7_13;
    if (!((life5_7 == null))) {
        forwardValue4395_19_0 = spill4395_1;
        break forward_join_19;
    }
    if (!((spill4395_1 != null))) {
        break forward_join_93;
    }
    forwardValue4395_19_0 = life7_13;
    }
    if (!((life5_7 == null))) {
        forwardValue4395_24_0 = forwardValue4395_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4395_19_0)).a__Boolean())) {
        break forward_join_93;
    }
    forwardValue4395_24_0 = life7_13;
    }
    life8_34 = ((moom.wB)(forwardValue4395_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4395_2 = p1;
    if (!((life5_7 == null))) {
        forwardValue4395_67_0 = spill4395_2;
        break forward_join_67;
    }
    if (!((spill4395_2 < __sourceIntrinsic_245d151687c8_invokedynamic4395_8(20813, (2892814406091173844L ^ life3_3))))) {
        break forward_join_57;
    }
    spill4395_3 = ((moom.wd)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4395_9(20813, (2892814406091173844L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4395_10(32171, (2940369425527522108L ^ life3_3)))), ((boolean)(true)));
    if (!((life5_7 == null))) {
        forwardValue4395_74_0 = ((spill4395_3) ? 1 : 0);
        break forward_join_74;
    }
    if (!((!spill4395_3))) {
        break forward_join_72;
    }
    return null;
    }
    forwardValue4395_67_0 = ((((moom.wd)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(0)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4395_13(20813, (2892814406091173844L ^ life3_3)))), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4395_74_0 = forwardValue4395_67_0;
        break forward_join_74;
    }
    if (!((forwardValue4395_67_0 == 0))) {
        break forward_join_72;
    }
    return null;
    }
    forwardValue4395_74_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4395_74_0 == 0))) {
        break forward_join_80;
    }
    ((moom.wB)(life7_13)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_7 != null))) {
        break forward_join_82;
    }
    }
    ((moom.wB)(life7_13)).a__Void();
    }
    if (!((((net.minecraft.item.ItemStack)(life8_34)).b == ((net.minecraft.item.ItemStack)(life6_6)).b))) {
        break forward_join_89;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life8_34)));
    }
    return life6_6;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4e1c66cfca44e96_originalDynamicSite750_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4395_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4395_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4395_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4395_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9575_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
