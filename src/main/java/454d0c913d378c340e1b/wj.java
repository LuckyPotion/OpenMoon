package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wj extends moom.v8 {

public moom.wx k;

public net.minecraft.inventory.IInventory l;

public boolean m;

private net.minecraft.entity.player.EntityPlayer n;

private static long o;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public wj(net.minecraft.entity.player.InventoryPlayer p0, boolean p1, net.minecraft.entity.player.EntityPlayer p2) { super(); }


private static void __sourceConstructorBody_22c6d1204fbb78b2(moom.wj receiver, net.minecraft.entity.player.InventoryPlayer p0, boolean p1, net.minecraft.entity.player.EntityPlayer p2) throws Throwable {

int __initValue756_110_0;

    int __initValue756_223_0;

    long local4_life2;

    net.minecraft.entity.Entity[] local6_life7;

    int local7_life19;

    int local8_life21;

    init_join_266: {

    init_join_262: {

    init_join_223: {

    init_join_222: {

    init_join_156: {

    init_join_154: {

    init_join_110: {

    init_join_109: {

    local4_life2 = (moom.wj.o ^ 65852381750382L);

    net.minecraft.entity.Entity[] __sourceSpill756_4 = moom.v8.b__Arrayr3();

    moom.wj.__sourceConstructorInit_22c6d1204fbb78b2_0(((moom.wj)(receiver)));

    ((moom.wj)(receiver)).k = ((moom.wx)(new moom.wx(((moom.v8) receiver), 2, 2)));

    local6_life7 = __sourceSpill756_4;

    ((moom.wj)(receiver)).l = ((net.minecraft.inventory.IInventory)(new moom.ww()));

    ((moom.wj)(receiver)).m = ((boolean)(p1));

    ((moom.wj)(receiver)).n = ((net.minecraft.entity.player.EntityPlayer)(p2));

    ((moom.wj)(receiver)).a(((moom.wB)(new moom.wM(((net.minecraft.entity.player.InventoryPlayer)(p0)).d, ((moom.wj)(receiver)).k, ((moom.wj)(receiver)).l, 0, __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_15(13681, (8745779367882890864L ^ local4_life2)), __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_17(32389, (4872125130730198401L ^ local4_life2))))));

    local7_life19 = 0;

    init_cycle_52: while (true) {

    init_join_107: {

    init_join_106: {

    if (!((local7_life19 < 2))) {

        break init_join_109;

    }

    int __sourceSpill756_20 = 0;

    if (!((local6_life7 == null))) {

        __initValue756_110_0 = __sourceSpill756_20;

        break init_join_110;

    }

    local8_life21 = __sourceSpill756_20;

    init_cycle_59: while (true) {

    if (!((local8_life21 < 2))) {

        break init_join_106;

    }

    ((moom.wj)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) ((moom.wj)(receiver)).k), (local8_life21 + (local7_life19 * 2)), (__sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_24(7888, (3590227489870132700L ^ local4_life2)) + (local8_life21 * __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_26(13883, (6096910480754187577L ^ local4_life2)))), (__sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_28(19859, (685474765915317914L ^ local4_life2)) + (local7_life19 * __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_30(9999, (5729765404289862671L ^ local4_life2))))))));

    local8_life21 += 1;

    if (!((local6_life7 == null))) {

        break init_join_107;

    }

    if (!((local6_life7 != null))) { continue init_cycle_59; }

    break init_cycle_59;

    }

    }

    local7_life19 += 1;

    }

    if (!((local6_life7 != null))) { continue init_cycle_52; }

    break init_cycle_52;

    }

    }

    __initValue756_110_0 = 0;

    }

    local7_life19 = __initValue756_110_0;

    init_cycle_111: while (true) {

    if (!((local7_life19 < 4))) {

        break init_join_154;

    }

    local8_life21 = local7_life19;

    ((moom.wj)(receiver)).a(((moom.wB)(new moom.wK(receiver, ((net.minecraft.inventory.IInventory) p0), ((((net.minecraft.entity.player.InventoryPlayer)(p0)).b__Int() - 1) - local7_life19), __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_34(15307, (81210876803354829L ^ local4_life2)), (__sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_36(30047, (8253079995109760597L ^ local4_life2)) + (local7_life19 * __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_38(9999, (5729765404289862671L ^ local4_life2)))), local8_life21))));

    local7_life19 += 1;

    if (!((local6_life7 == null))) {

        break init_join_156;

    }

    if (!((local6_life7 != null))) { continue init_cycle_111; }

    break init_cycle_111;

    }

    }

    local7_life19 = 0;

    }

    init_cycle_156: while (true) {

    init_join_220: {

    init_join_219: {

    if (!((local7_life19 < 3))) {

        break init_join_222;

    }

    int __sourceSpill756_40 = 0;

    if (!((local6_life7 == null))) {

        __initValue756_223_0 = __sourceSpill756_40;

        break init_join_223;

    }

    local8_life21 = __sourceSpill756_40;

    init_cycle_163: while (true) {

    if (!((local8_life21 < __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_42(22591, (8945367166870188860L ^ local4_life2))))) {

        break init_join_219;

    }

    ((moom.wj)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), (local8_life21 + ((local7_life19 + 1) * __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_44(8824, (2099740282536364407L ^ local4_life2)))), (__sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_46(30047, (8253079995109760597L ^ local4_life2)) + (local8_life21 * __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_48(9999, (5729765404289862671L ^ local4_life2)))), (__sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_50(6731, (6726795762305118542L ^ local4_life2)) + (local7_life19 * __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_52(9999, (5729765404289862671L ^ local4_life2))))))));

    local8_life21 += 1;

    if (!((local6_life7 == null))) {

        break init_join_220;

    }

    if (!((local6_life7 != null))) { continue init_cycle_163; }

    break init_cycle_163;

    }

    }

    local7_life19 += 1;

    }

    if (!((local6_life7 != null))) { continue init_cycle_156; }

    break init_cycle_156;

    }

    }

    __initValue756_223_0 = 0;

    }

    local7_life19 = __initValue756_223_0;

    init_cycle_224: while (true) {

    if (!((local7_life19 < __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_55(8824, (2099740282536364407L ^ local4_life2))))) {

        break init_join_262;

    }

    ((moom.wj)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), local7_life19, (__sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_57(30047, (8253079995109760597L ^ local4_life2)) + (local7_life19 * __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_59(9999, (5729765404289862671L ^ local4_life2)))), __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_61(21634, (2679731181071990666L ^ local4_life2))))));

    local7_life19 += 1;

    if (!((local6_life7 == null))) {

        break init_join_266;

    }

    if (!((local6_life7 != null))) { continue init_cycle_224; }

    break init_cycle_224;

    }

    }

    ((moom.wj)(receiver)).a__Void(((net.minecraft.inventory.IInventory)(((moom.wj)(receiver)).k)));

    }

    return;

}



static {
o = ((long)(((moom._a)(moom._c.a(((long)(1917568569807923021L)), ((long)(4885908401500664293L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(88635094674193L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wj.o ^ 59844109094083L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1652_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1652_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1652_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1652_14 = new byte[8];
    (__sourceSpill1652_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1652_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1652_16 = __sourceSpill1652_14;
    ((javax.crypto.Cipher)(__sourceSpill1652_11)).init(((int)(__sourceSpill1652_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1652_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1652_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ü\\7ÂÆµÐ\\óxaW½OI;\031¤Òì¢Ö³¸þ§Ü\004ÝGùm³k?,\025ºëõº¯]\031T!|ý$÷\003Dî¾3N\016öpGhNîóø8Ä\033B;¾\007_¬\001SÛj\036âÐ\"(³Å\007!àLÎÜ("))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1652_25 = local6_life21;
        int __sourceSpill1652_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1652_25)).substring(((int)(__sourceSpill1652_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1652_30 = local8_life19;
        int __sourceSpill1652_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1652_33 = new byte[8];
        (__sourceSpill1652_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1652_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1652_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1652_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1652_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1652_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1652_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1652_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1652_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1652_34)).doFinal(((byte[])(__sourceSpill1652_33)));
        (__sourceSpill1652_30)[__sourceSpill1652_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "×P¡Q:e\006Ç*óÁÇ=\013"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1652_38 = local6_life21;
        int __sourceSpill1652_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1652_38)).substring(((int)(__sourceSpill1652_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1652_43 = local8_life19;
        int __sourceSpill1652_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1652_46 = new byte[8];
        (__sourceSpill1652_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1652_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1652_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1652_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1652_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1652_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1652_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1652_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1652_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1652_47)).doFinal(((byte[])(__sourceSpill1652_46)));
        (__sourceSpill1652_43)[__sourceSpill1652_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[15]));
}

private static native <E extends Throwable> void __sourceConstructorInit_22c6d1204fbb78b2_0(moom.wj a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9598_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27615;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wj.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
return ((1) != 0);
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.Entity[] spill1376_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    int life5_10;
    net.minecraft.item.ItemStack life6_18;
    lexical_join_38: {
    lexical_join_33: {
    life2_3 = (moom.wj.o ^ 76022705128019L);
    spill1376_0 = moom.v8.b__Arrayr3();
    super.a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    life4_8 = spill1376_0;
    life5_10 = 0;
    lexical_cycle_11: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life5_10 < 4))) {
        break lexical_join_33;
    }
    life6_18 = ((moom.wx)(this.k)).b__xW(((int)(life5_10)));
    if (!((life4_8 == null))) {
        break lexical_join_38;
    }
    if (!((life4_8 == null))) {
        break lexical_join_31;
    }
    if (!((life6_18 != null))) {
        break lexical_join_30;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.item.ItemStack)(life6_18)), ((boolean)(false)));
    }
    life5_10 += 1;
    }
    if (!((life4_8 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    ((net.minecraft.inventory.IInventory)(this.l)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(null)));
    }
    return;
}


public void a__Void(net.minecraft.inventory.IInventory p0) {
((net.minecraft.inventory.IInventory)(this.l)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.crafting.CraftingManager)(net.minecraft.item.crafting.CraftingManager.a__xX())).a(((moom.wx)(this.k)), ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(this.n)).i))))));
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, moom.wB p1) {
int forwardValue4414_19_0;
    int forwardValue4414_21_0;
    boolean spill4414_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life3_3 = (moom.wj.o ^ 77204180229688L);
    life5_5 = moom.v8.b__Arrayr3();
    if (!((((moom.wB)(p1)).b != this.l))) {
        break forward_join_20;
    }
    spill4414_0 = super.a(((net.minecraft.item.ItemStack)(p0)), ((moom.wB)(p1)));
    if (!((life5_5 == null))) {
        forwardValue4414_19_0 = ((spill4414_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4414_0)) {
        break forward_join_20;
    }
    forwardValue4414_19_0 = 1;
    }
    forwardValue4414_21_0 = forwardValue4414_19_0;
    break forward_join_21;
    }
    forwardValue4414_21_0 = 0;
    }
    return ((forwardValue4414_21_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4413_19_0;
    moom.wB forwardValue4413_24_0;
    int forwardValue4413_57_0;
    int forwardValue4413_89_0;
    int forwardValue4413_89_1;
    int forwardValue4413_121_0;
    int forwardValue4413_159_0;
    int forwardValue4413_203_0;
    int forwardValue4413_203_1;
    int forwardValue4413_246_0;
    int forwardValue4413_253_0;
    net.minecraft.entity.Entity[] spill4413_0;
    moom.wB spill4413_1;
    int spill4413_2;
    int spill4413_3;
    int spill4413_4;
    int spill4413_5;
    boolean spill4413_6;
    int spill4413_7;
    int spill4413_8;
    boolean spill4413_9;
    boolean spill4413_10;
    int spill4413_11;
    int spill4413_12;
    int spill4413_13;
    boolean spill4413_14;
    int spill4413_15;
    int spill4413_16;
    boolean spill4413_17;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    net.minecraft.entity.Entity[] life5_7;
    moom.wB life7_13;
    net.minecraft.item.ItemStack life8_34;
    int life9_207;
    forward_join_272: {
    forward_join_268: {
    forward_join_261: {
    forward_join_259: {
    forward_join_253: {
    forward_join_251: {
    forward_join_246: {
    forward_join_232: {
    forward_join_203: {
    forward_join_195: {
    forward_join_159: {
    forward_join_158: {
    forward_join_156: {
    forward_join_121: {
    forward_join_118: {
    forward_join_89: {
    forward_join_85: {
    forward_join_57: {
    forward_join_56: {
    forward_join_50: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wj.o ^ 86054176415974L);
    spill4413_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life5_7 = spill4413_0;
    life7_13 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    spill4413_1 = life7_13;
    if (!((life5_7 == null))) {
        forwardValue4413_19_0 = spill4413_1;
        break forward_join_19;
    }
    if (!((spill4413_1 != null))) {
        break forward_join_272;
    }
    forwardValue4413_19_0 = life7_13;
    }
    if (!((life5_7 == null))) {
        forwardValue4413_24_0 = forwardValue4413_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4413_19_0)).a__Boolean())) {
        break forward_join_272;
    }
    forwardValue4413_24_0 = life7_13;
    }
    life8_34 = ((moom.wB)(forwardValue4413_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4413_2 = p1;
    if (!((life5_7 == null))) {
        forwardValue4413_57_0 = spill4413_2;
        break forward_join_57;
    }
    if (!((spill4413_2 == 0))) {
        break forward_join_56;
    }
    if (!((!((moom.wj)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_8(8824, (2099718702561168895L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_9(30131, (7462301311344040496L ^ life3_3)))), ((boolean)(true)))))) {
        break forward_join_50;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.item.ItemStack)(life8_34)), ((net.minecraft.item.ItemStack)(life6_6)));
    if (!((life5_7 != null))) {
        break forward_join_251;
    }
    }
    forwardValue4413_57_0 = p1;
    }
    spill4413_3 = 1;
    if (!((life5_7 == null))) {
        forwardValue4413_89_0 = forwardValue4413_57_0;
        forwardValue4413_89_1 = spill4413_3;
        break forward_join_89;
    }
    if (!((forwardValue4413_57_0 >= spill4413_3))) {
        break forward_join_85;
    }
    spill4413_4 = p1;
    spill4413_5 = 5;
    if (!((life5_7 == null))) {
        forwardValue4413_89_0 = spill4413_4;
        forwardValue4413_89_1 = spill4413_5;
        break forward_join_89;
    }
    if (!((spill4413_4 < spill4413_5))) {
        break forward_join_85;
    }
    spill4413_6 = ((moom.wj)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_12(8824, (2099718702561168895L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_13(32500, (2754304141923832178L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4413_253_0 = ((spill4413_6) ? 1 : 0);
        break forward_join_253;
    }
    if (!((!spill4413_6))) {
        break forward_join_251;
    }
    return null;
    }
    spill4413_7 = p1;
    if (!((life5_7 == null))) {
        forwardValue4413_121_0 = spill4413_7;
        break forward_join_121;
    }
    forwardValue4413_89_0 = spill4413_7;
    forwardValue4413_89_1 = 5;
    }
    if (!((forwardValue4413_89_0 >= forwardValue4413_89_1))) {
        break forward_join_118;
    }
    spill4413_8 = p1;
    if (!((life5_7 == null))) {
        forwardValue4413_121_0 = spill4413_8;
        break forward_join_121;
    }
    if (!((spill4413_8 < __sourceIntrinsic_245d151687c8_invokedynamic4413_16(8824, (2099718702561168895L ^ life3_3))))) {
        break forward_join_118;
    }
    spill4413_9 = ((moom.wj)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_17(8824, (2099718702561168895L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_18(32500, (2754304141923832178L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4413_253_0 = ((spill4413_9) ? 1 : 0);
        break forward_join_253;
    }
    if (!((!spill4413_9))) {
        break forward_join_251;
    }
    return null;
    }
    forwardValue4413_121_0 = ((((net.minecraft.item.ItemStack)(life6_6)).a__wQ() instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4413_159_0 = forwardValue4413_121_0;
        break forward_join_159;
    }
    if (!((forwardValue4413_121_0 != 0))) {
        break forward_join_158;
    }
    spill4413_10 = ((moom.wB)(((moom.wB)(((java.util.List)(this.b)).get(((int)((5 + ((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemStack)(life6_6)).a__wQ())))).q)))))))).a__Boolean();
    if (!((life5_7 == null))) {
        forwardValue4413_159_0 = ((spill4413_10) ? 1 : 0);
        break forward_join_159;
    }
    if (!((!spill4413_10))) {
        break forward_join_158;
    }
    life9_207 = (5 + ((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemStack)(life6_6)).a__wQ())))).q);
    if (!((!((moom.wj)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(life9_207)), ((int)((life9_207 + 1))), ((boolean)(false)))))) {
        break forward_join_156;
    }
    return null;
    }
    if (!((life5_7 != null))) {
        break forward_join_251;
    }
    }
    forwardValue4413_159_0 = p1;
    }
    spill4413_11 = __sourceIntrinsic_245d151687c8_invokedynamic4413_35(8824, (2099718702561168895L ^ life3_3));
    if (!((life5_7 == null))) {
        forwardValue4413_203_0 = forwardValue4413_159_0;
        forwardValue4413_203_1 = spill4413_11;
        break forward_join_203;
    }
    if (!((forwardValue4413_159_0 >= spill4413_11))) {
        break forward_join_195;
    }
    spill4413_12 = p1;
    spill4413_13 = __sourceIntrinsic_245d151687c8_invokedynamic4413_36(16313, (1625772397306974268L ^ life3_3));
    if (!((life5_7 == null))) {
        forwardValue4413_203_0 = spill4413_12;
        forwardValue4413_203_1 = spill4413_13;
        break forward_join_203;
    }
    if (!((spill4413_12 < spill4413_13))) {
        break forward_join_195;
    }
    spill4413_14 = ((moom.wj)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_37(16313, (1625772397306974268L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_38(32500, (2754304141923832178L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4413_253_0 = ((spill4413_14) ? 1 : 0);
        break forward_join_253;
    }
    if (!((!spill4413_14))) {
        break forward_join_251;
    }
    return null;
    }
    spill4413_15 = p1;
    if (!((life5_7 == null))) {
        forwardValue4413_246_0 = spill4413_15;
        break forward_join_246;
    }
    forwardValue4413_203_0 = spill4413_15;
    forwardValue4413_203_1 = __sourceIntrinsic_245d151687c8_invokedynamic4413_41(16313, (1625772397306974268L ^ life3_3));
    }
    if (!((forwardValue4413_203_0 >= forwardValue4413_203_1))) {
        break forward_join_232;
    }
    spill4413_16 = p1;
    if (!((life5_7 == null))) {
        forwardValue4413_246_0 = spill4413_16;
        break forward_join_246;
    }
    if (!((spill4413_16 < __sourceIntrinsic_245d151687c8_invokedynamic4413_42(32500, (2754304141923832178L ^ life3_3))))) {
        break forward_join_232;
    }
    spill4413_17 = ((moom.wj)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_43(8824, (2099718702561168895L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_44(16313, (1625772397306974268L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4413_253_0 = ((spill4413_17) ? 1 : 0);
        break forward_join_253;
    }
    if (!((!spill4413_17))) {
        break forward_join_251;
    }
    return null;
    }
    forwardValue4413_246_0 = ((((moom.wj)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_47(8824, (2099718702561168895L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4413_48(32500, (2754304141923832178L ^ life3_3)))), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4413_253_0 = forwardValue4413_246_0;
        break forward_join_253;
    }
    if (!((forwardValue4413_246_0 == 0))) {
        break forward_join_251;
    }
    return null;
    }
    forwardValue4413_253_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4413_253_0 == 0))) {
        break forward_join_259;
    }
    ((moom.wB)(life7_13)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_7 != null))) {
        break forward_join_261;
    }
    }
    ((moom.wB)(life7_13)).a__Void();
    }
    if (!((((net.minecraft.item.ItemStack)(life8_34)).b == ((net.minecraft.item.ItemStack)(life6_6)).b))) {
        break forward_join_268;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life8_34)));
    }
    return life6_6;
}


private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c6d1204fbb78b2_originalDynamicSite756_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4413_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9598_0() throws E;
}
