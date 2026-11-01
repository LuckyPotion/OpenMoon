package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wa extends moom.v8 {

private net.minecraft.inventory.IInventory k;

private moom.wD l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public wa(net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1) { super(); }


private static void __sourceConstructorBody_4849776a9895bf20(moom.wa receiver, net.minecraft.inventory.IInventory p0, net.minecraft.inventory.IInventory p1) throws Throwable {

int __initValue747_109_0;

    long local3_life2;

    net.minecraft.entity.Entity[] local5_life16;

    int local6_life19;

    int local7_life22;

    int local8_life23;

    int local9_life25;

    init_join_144: {

    init_join_109: {

    init_join_108: {

    local3_life2 = (moom.wa.m ^ 125519546767180L);

    moom.wa.__sourceConstructorInit_4849776a9895bf20_0(((moom.wa)(receiver)));

    ((moom.wa)(receiver)).k = ((net.minecraft.inventory.IInventory)(p1));

    net.minecraft.entity.Entity[] __sourceSpill747_10 = moom.v8.b__Arrayr3();

    moom.wa __sourceSpill747_11 = receiver;

    moom.wa __stackOp747_12_0 = receiver;

    moom.wD __stackOp747_12_1 = new moom.wD(p1, 0, __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_7(24239, (2908769865174730720L ^ local3_life2)), __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_9(28835, (3812117604591167969L ^ local3_life2)));

    moom.wD __sourceSpill747_14 = __stackOp747_12_1;

    ((moom.wa)(__stackOp747_12_0)).l = ((moom.wD)(__stackOp747_12_1));

    ((moom.wa)(__sourceSpill747_11)).a(((moom.wB)(__sourceSpill747_14)));

    local5_life16 = __sourceSpill747_10;

    local6_life19 = __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_18(29627, (6542613683225619196L ^ local3_life2));

    local7_life22 = __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_21(23372, (8928840301489734157L ^ local3_life2));

    local8_life23 = 0;

    init_cycle_46: while (true) {

    init_join_106: {

    init_join_105: {

    if (!((local8_life23 < 3))) {

        break init_join_108;

    }

    int __sourceSpill747_24 = 0;

    if (!((local5_life16 == null))) {

        __initValue747_109_0 = __sourceSpill747_24;

        break init_join_109;

    }

    local9_life25 = __sourceSpill747_24;

    init_cycle_53: while (true) {

    if (!((local9_life25 < __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_27(18778, (2339056267317956628L ^ local3_life2))))) {

        break init_join_105;

    }

    ((moom.wa)(receiver)).a(((moom.wB)(new moom.wB(p0, ((local9_life25 + (local8_life23 * __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_29(4920, (4304656273262316149L ^ local3_life2)))) + __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_31(4920, (4304656273262316149L ^ local3_life2))), (local6_life19 + (local9_life25 * __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_33(24886, (3587183318699735152L ^ local3_life2)))), (local7_life22 + (local8_life23 * __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_35(14811, (6867668679036903576L ^ local3_life2))))))));

    local9_life25 += 1;

    if (!((local5_life16 == null))) {

        break init_join_106;

    }

    if (!((local5_life16 != null))) { continue init_cycle_53; }

    break init_cycle_53;

    }

    }

    local8_life23 += 1;

    }

    if (!((local5_life16 != null))) { continue init_cycle_46; }

    break init_cycle_46;

    }

    }

    __initValue747_109_0 = 0;

    }

    local8_life23 = __initValue747_109_0;

    init_cycle_110: while (true) {

    if (!((local8_life23 < __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_38(4920, (4304656273262316149L ^ local3_life2))))) {

        break init_join_144;

    }

    ((moom.wa)(receiver)).a(((moom.wB)(new moom.wB(p0, local8_life23, (local6_life19 + (local8_life23 * __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_40(14811, (6867668679036903576L ^ local3_life2)))), (__sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_42(1716, (7494968893869662207L ^ local3_life2)) + local7_life22)))));

    local8_life23 += 1;

    if (!((local5_life16 != null))) { continue init_cycle_110; }

    break init_cycle_110;

    }

    }

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(2989691986777632956L)), ((long)(-9202366562140967764L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44292057303354L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wa.m ^ 87541712777864L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1643_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1643_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1643_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1643_14 = new byte[8];
    (__sourceSpill1643_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1643_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1643_16 = __sourceSpill1643_14;
    ((javax.crypto.Cipher)(__sourceSpill1643_11)).init(((int)(__sourceSpill1643_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1643_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1643_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ßD\025Yh²\rú[o\022<ÝYî£\000É- ¹\027k\" ý¦Õ®UG\017qÆðP1\036ÄJ±GQ±Âþr\003:Í&\037(n\034\024O>\013B`\035úC9`@'\021\0226Ç\t)Ñ£Dç"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1643_25 = local6_life21;
        int __sourceSpill1643_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1643_25)).substring(((int)(__sourceSpill1643_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1643_30 = local8_life19;
        int __sourceSpill1643_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1643_33 = new byte[8];
        (__sourceSpill1643_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1643_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1643_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1643_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1643_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1643_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1643_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1643_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1643_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1643_34)).doFinal(((byte[])(__sourceSpill1643_33)));
        (__sourceSpill1643_30)[__sourceSpill1643_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "o\027_ ~ÿd¹Å+\004äO¹¹,"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1643_38 = local6_life21;
        int __sourceSpill1643_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1643_38)).substring(((int)(__sourceSpill1643_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1643_43 = local8_life19;
        int __sourceSpill1643_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1643_46 = new byte[8];
        (__sourceSpill1643_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1643_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1643_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1643_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1643_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1643_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1643_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1643_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1643_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1643_47)).doFinal(((byte[])(__sourceSpill1643_46)));
        (__sourceSpill1643_43)[__sourceSpill1643_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceConstructorInit_4849776a9895bf20_0(moom.wa a0) throws E;

public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.inventory.IInventory)(this.k)).a(((net.minecraft.entity.player.EntityPlayer)(p0))))) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9567_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wa"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wa.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14002;
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
            throw new RuntimeException("moom/wa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4391_19_0;
    moom.wB forwardValue4391_24_0;
    int forwardValue4391_55_0;
    int forwardValue4391_83_0;
    int forwardValue4391_84_0;
    int forwardValue4391_84_1;
    int forwardValue4391_123_0;
    int forwardValue4391_123_1;
    int forwardValue4391_158_0;
    int forwardValue4391_165_0;
    net.minecraft.entity.Entity[] spill4391_0;
    moom.wB spill4391_1;
    int spill4391_2;
    boolean spill4391_3;
    int spill4391_4;
    int spill4391_5;
    boolean spill4391_6;
    int spill4391_7;
    int spill4391_8;
    boolean spill4391_9;
    int spill4391_10;
    int spill4391_11;
    boolean spill4391_12;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    moom.wB life7_12;
    net.minecraft.entity.Entity[] life5_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_184: {
    forward_join_180: {
    forward_join_173: {
    forward_join_171: {
    forward_join_165: {
    forward_join_163: {
    forward_join_158: {
    forward_join_148: {
    forward_join_123: {
    forward_join_115: {
    forward_join_84: {
    forward_join_83: {
    forward_join_82: {
    forward_join_55: {
    forward_join_52: {
    forward_join_46: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wa.m ^ 49186264005862L);
    spill4391_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life7_12 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    life5_13 = spill4391_0;
    spill4391_1 = life7_12;
    if (!((life5_13 == null))) {
        forwardValue4391_19_0 = spill4391_1;
        break forward_join_19;
    }
    if (!((spill4391_1 != null))) {
        break forward_join_184;
    }
    forwardValue4391_19_0 = life7_12;
    }
    if (!((life5_13 == null))) {
        forwardValue4391_24_0 = forwardValue4391_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4391_19_0)).a__Boolean())) {
        break forward_join_184;
    }
    forwardValue4391_24_0 = life7_12;
    }
    life8_34 = ((moom.wB)(forwardValue4391_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4391_2 = p1;
    if (!((life5_13 == null))) {
        forwardValue4391_55_0 = spill4391_2;
        break forward_join_55;
    }
    if (!((spill4391_2 == 0))) {
        break forward_join_52;
    }
    if (!((!((moom.wa)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(1)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4391_8(4286, (9005138744506933844L ^ life3_3)))), ((boolean)(true)))))) {
        break forward_join_46;
    }
    return null;
    }
    ((moom.wB)(life7_12)).a(((net.minecraft.item.ItemStack)(life8_34)), ((net.minecraft.item.ItemStack)(life6_6)));
    if (!((life5_13 != null))) {
        break forward_join_163;
    }
    }
    forwardValue4391_55_0 = ((((moom.wD)(this.l)).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_13 == null))) {
        forwardValue4391_83_0 = forwardValue4391_55_0;
        break forward_join_83;
    }
    if (!((forwardValue4391_55_0 == 0))) {
        break forward_join_82;
    }
    spill4391_3 = ((moom.wD)(this.l)).a__Boolean(((net.minecraft.item.ItemStack)(life8_34)));
    if (!((life5_13 == null))) {
        forwardValue4391_83_0 = ((spill4391_3) ? 1 : 0);
        break forward_join_83;
    }
    if (!(spill4391_3)) {
        break forward_join_82;
    }
    spill4391_4 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    spill4391_5 = 1;
    if (!((life5_13 == null))) {
        forwardValue4391_84_0 = spill4391_4;
        forwardValue4391_84_1 = spill4391_5;
        break forward_join_84;
    }
    if (!((spill4391_4 == spill4391_5))) {
        break forward_join_82;
    }
    spill4391_6 = ((moom.wa)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(0)), ((int)(1)), ((boolean)(false)));
    if (!((life5_13 == null))) {
        forwardValue4391_165_0 = ((spill4391_6) ? 1 : 0);
        break forward_join_165;
    }
    if (!((!spill4391_6))) {
        break forward_join_163;
    }
    return null;
    }
    forwardValue4391_83_0 = p1;
    }
    forwardValue4391_84_0 = forwardValue4391_83_0;
    forwardValue4391_84_1 = 1;
    }
    if (!((life5_13 == null))) {
        forwardValue4391_123_0 = forwardValue4391_84_0;
        forwardValue4391_123_1 = forwardValue4391_84_1;
        break forward_join_123;
    }
    if (!((forwardValue4391_84_0 >= forwardValue4391_84_1))) {
        break forward_join_115;
    }
    spill4391_7 = p1;
    spill4391_8 = __sourceIntrinsic_245d151687c8_invokedynamic4391_20(9329, (8844615257311925918L ^ life3_3));
    if (!((life5_13 == null))) {
        forwardValue4391_123_0 = spill4391_7;
        forwardValue4391_123_1 = spill4391_8;
        break forward_join_123;
    }
    if (!((spill4391_7 < spill4391_8))) {
        break forward_join_115;
    }
    spill4391_9 = ((moom.wa)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4391_21(5461, (7215351076164822963L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4391_22(26059, (5022714306119800613L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_13 == null))) {
        forwardValue4391_165_0 = ((spill4391_9) ? 1 : 0);
        break forward_join_165;
    }
    if (!((!spill4391_9))) {
        break forward_join_163;
    }
    return null;
    }
    spill4391_10 = p1;
    if (!((life5_13 == null))) {
        forwardValue4391_158_0 = spill4391_10;
        break forward_join_158;
    }
    forwardValue4391_123_0 = spill4391_10;
    forwardValue4391_123_1 = __sourceIntrinsic_245d151687c8_invokedynamic4391_25(5461, (7215351076164822963L ^ life3_3));
    }
    if (!((forwardValue4391_123_0 >= forwardValue4391_123_1))) {
        break forward_join_148;
    }
    spill4391_11 = p1;
    if (!((life5_13 == null))) {
        forwardValue4391_158_0 = spill4391_11;
        break forward_join_158;
    }
    if (!((spill4391_11 < __sourceIntrinsic_245d151687c8_invokedynamic4391_26(26059, (5022714306119800613L ^ life3_3))))) {
        break forward_join_148;
    }
    spill4391_12 = ((moom.wa)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(1)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4391_27(5461, (7215351076164822963L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_13 == null))) {
        forwardValue4391_165_0 = ((spill4391_12) ? 1 : 0);
        break forward_join_165;
    }
    if (!((!spill4391_12))) {
        break forward_join_163;
    }
    return null;
    }
    forwardValue4391_158_0 = ((((moom.wa)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(1)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4391_30(26059, (5022714306119800613L ^ life3_3)))), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_13 == null))) {
        forwardValue4391_165_0 = forwardValue4391_158_0;
        break forward_join_165;
    }
    if (!((forwardValue4391_158_0 == 0))) {
        break forward_join_163;
    }
    return null;
    }
    forwardValue4391_165_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4391_165_0 == 0))) {
        break forward_join_171;
    }
    ((moom.wB)(life7_12)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_13 != null))) {
        break forward_join_173;
    }
    }
    ((moom.wB)(life7_12)).a__Void();
    }
    if (!((((net.minecraft.item.ItemStack)(life8_34)).b == ((net.minecraft.item.ItemStack)(life6_6)).b))) {
        break forward_join_180;
    }
    return null;
    }
    ((moom.wB)(life7_12)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life8_34)));
    }
    return life6_6;
}


public void a(net.minecraft.inventory.ICrafting p0) {
super.a(((net.minecraft.inventory.ICrafting)(p0)));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((net.minecraft.inventory.IInventory)(this.k)));
    return;
}


public void a__Void(int p0, int p1) {
((net.minecraft.inventory.IInventory)(this.k)).a__Void(((int)(p0)), ((int)(p1)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.inventory.IInventory a__sourceReturn_6fb8138116() {
return this.k;
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.player.EntityPlayer forwardValue4390_14_0;
    net.minecraft.entity.Entity[] spill4390_0;
    net.minecraft.entity.player.EntityPlayer spill4390_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.item.ItemStack life5_26;
    forward_join_31: {
    forward_join_14: {
    life2_3 = (moom.wa.m ^ 43827842997843L);
    spill4390_0 = moom.v8.b__Arrayr3();
    super.a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    life4_8 = spill4390_0;
    spill4390_1 = p0;
    if (!((life4_8 == null))) {
        forwardValue4390_14_0 = spill4390_1;
        break forward_join_14;
    }
    if (!((spill4390_1 != null))) {
        break forward_join_31;
    }
    forwardValue4390_14_0 = p0;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(forwardValue4390_14_0)).i)).G))) {
        break forward_join_31;
    }
    life5_26 = ((moom.wD)(this.l)).a(((int)(((moom.wD)(this.l)).a())));
    if (!((life5_26 != null))) {
        break forward_join_31;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.item.ItemStack)(life5_26)), ((boolean)(false)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4849776a9895bf20_originalDynamicSite747_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4391_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4391_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4391_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4391_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4391_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4391_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4391_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4391_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9567_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
