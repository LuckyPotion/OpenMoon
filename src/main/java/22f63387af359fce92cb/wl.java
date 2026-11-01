package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wl extends moom.v8 {

public moom.wx k;

public net.minecraft.inventory.IInventory l;

private net.minecraft.world.World m;

private moom.DT n;

private static long o;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public wl(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1, moom.DT p2) { super(); }


private static void __sourceConstructorBody_4752c7044c93100b(moom.wl receiver, net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1, moom.DT p2) throws Throwable {

int __initValue758_110_0;

    int __initValue758_182_0;

    long local4_life2;

    net.minecraft.entity.Entity[] local6_life18;

    int local7_life19;

    int local8_life21;

    init_join_225: {

    init_join_221: {

    init_join_182: {

    init_join_181: {

    init_join_110: {

    init_join_109: {

    local4_life2 = (moom.wl.o ^ 40693473875876L);

    moom.wl.__sourceConstructorInit_4752c7044c93100b_0(((moom.wl)(receiver)));

    ((moom.wl)(receiver)).k = ((moom.wx)(new moom.wx(((moom.v8) receiver), 3, 3)));

    ((moom.wl)(receiver)).l = ((net.minecraft.inventory.IInventory)(new moom.ww()));

    net.minecraft.entity.Entity[] __sourceSpill758_8 = moom.v8.b__Arrayr3();

    ((moom.wl)(receiver)).m = ((net.minecraft.world.World)(p1));

    ((moom.wl)(receiver)).n = ((moom.DT)(p2));

    ((moom.wl)(receiver)).a(((moom.wB)(new moom.wM(((net.minecraft.entity.player.InventoryPlayer)(p0)).d, ((moom.wl)(receiver)).k, ((moom.wl)(receiver)).l, 0, __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_14(30831, (6501436853551393798L ^ local4_life2)), __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_16(14250, (4045577942977029066L ^ local4_life2))))));

    local6_life18 = __sourceSpill758_8;

    local7_life19 = 0;

    init_cycle_52: while (true) {

    init_join_107: {

    init_join_106: {

    if (!((local7_life19 < 3))) {

        break init_join_109;

    }

    int __sourceSpill758_20 = 0;

    if (!((local6_life18 == null))) {

        __initValue758_110_0 = __sourceSpill758_20;

        break init_join_110;

    }

    local8_life21 = __sourceSpill758_20;

    init_cycle_59: while (true) {

    if (!((local8_life21 < 3))) {

        break init_join_106;

    }

    ((moom.wl)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) ((moom.wl)(receiver)).k), (local8_life21 + (local7_life19 * 3)), (__sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_24(19197, (1515824056164605591L ^ local4_life2)) + (local8_life21 * __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_26(18490, (9046216259825654868L ^ local4_life2)))), (__sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_28(4646, (1252668645365712455L ^ local4_life2)) + (local7_life19 * __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_30(10562, (3958379627088559392L ^ local4_life2))))))));

    local8_life21 += 1;

    if (!((local6_life18 == null))) {

        break init_join_107;

    }

    if (!((local6_life18 != null))) { continue init_cycle_59; }

    break init_cycle_59;

    }

    }

    local7_life19 += 1;

    }

    if (!((local6_life18 != null))) { continue init_cycle_52; }

    break init_cycle_52;

    }

    }

    __initValue758_110_0 = 0;

    }

    local7_life19 = __initValue758_110_0;

    init_cycle_111: while (true) {

    init_join_179: {

    init_join_178: {

    if (!((local7_life19 < 3))) {

        break init_join_181;

    }

    int __sourceSpill758_32 = 0;

    if (!((local6_life18 == null))) {

        __initValue758_182_0 = __sourceSpill758_32;

        break init_join_182;

    }

    local8_life21 = __sourceSpill758_32;

    init_cycle_118: while (true) {

    if (!((local8_life21 < __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_34(11232, (5963394321864671119L ^ local4_life2))))) {

        break init_join_178;

    }

    ((moom.wl)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), ((local8_life21 + (local7_life19 * __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_36(32757, (2267539376600869785L ^ local4_life2)))) + __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_38(32757, (2267539376600869785L ^ local4_life2))), (__sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_40(27574, (4873053799400013790L ^ local4_life2)) + (local8_life21 * __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_42(10562, (3958379627088559392L ^ local4_life2)))), (__sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_44(13937, (1856629602037867034L ^ local4_life2)) + (local7_life19 * __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_46(10562, (3958379627088559392L ^ local4_life2))))))));

    local8_life21 += 1;

    if (!((local6_life18 == null))) {

        break init_join_179;

    }

    if (!((local6_life18 != null))) { continue init_cycle_118; }

    break init_cycle_118;

    }

    }

    local7_life19 += 1;

    }

    if (!((local6_life18 != null))) { continue init_cycle_111; }

    break init_cycle_111;

    }

    }

    __initValue758_182_0 = 0;

    }

    local7_life19 = __initValue758_182_0;

    init_cycle_183: while (true) {

    if (!((local7_life19 < __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_49(32757, (2267539376600869785L ^ local4_life2))))) {

        break init_join_221;

    }

    ((moom.wl)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), local7_life19, (__sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_51(3226, (2069238486221658359L ^ local4_life2)) + (local7_life19 * __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_53(10562, (3958379627088559392L ^ local4_life2)))), __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_55(13833, (3641907372782133870L ^ local4_life2))))));

    local7_life19 += 1;

    if (!((local6_life18 == null))) {

        break init_join_225;

    }

    if (!((local6_life18 != null))) { continue init_cycle_183; }

    break init_cycle_183;

    }

    }

    ((moom.wl)(receiver)).a__Void(((net.minecraft.inventory.IInventory)(((moom.wl)(receiver)).k)));

    }

    return;

}



static {
o = ((long)(((moom._a)(moom._c.a(((long)(3486991794465119777L)), ((long)(-6872629123388656191L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(235420981701638L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wl.o ^ 4152362581580L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1654_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1654_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1654_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1654_14 = new byte[8];
    (__sourceSpill1654_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1654_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1654_16 = __sourceSpill1654_14;
    ((javax.crypto.Cipher)(__sourceSpill1654_11)).init(((int)(__sourceSpill1654_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1654_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1654_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[18];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Çÿ~y\037m;-d+èâÊñ\031SbùK¿vñùñO\fd£\fáÆ®X\0031WÛIï¾Ié\007l¹7J\032âµâ5h:?`¬*\024/üÐ¾^Òvå\031Ò>Wm¯r2Fÿ`-å\006|ûÖÀõ;`äÅ:è¶Æeu_X\nöC\r$®úh\026Ô­·õ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1654_25 = local6_life21;
        int __sourceSpill1654_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1654_25)).substring(((int)(__sourceSpill1654_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1654_30 = local8_life19;
        int __sourceSpill1654_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1654_33 = new byte[8];
        (__sourceSpill1654_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1654_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1654_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1654_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1654_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1654_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1654_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1654_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1654_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1654_34)).doFinal(((byte[])(__sourceSpill1654_33)));
        (__sourceSpill1654_30)[__sourceSpill1654_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "pÕzè¶h|¬\037ªæÁ¥ú"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1654_38 = local6_life21;
        int __sourceSpill1654_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1654_38)).substring(((int)(__sourceSpill1654_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1654_43 = local8_life19;
        int __sourceSpill1654_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1654_46 = new byte[8];
        (__sourceSpill1654_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1654_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1654_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1654_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1654_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1654_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1654_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1654_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1654_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1654_47)).doFinal(((byte[])(__sourceSpill1654_46)));
        (__sourceSpill1654_43)[__sourceSpill1654_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[18]));
}

private static native <E extends Throwable> void __sourceConstructorInit_4752c7044c93100b_0(moom.wl a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9609_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14684;
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
            throw new RuntimeException("moom/wl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wl.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4424_40_0;
    int forwardValue4424_42_0;
    int spill4424_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    life2_3 = (moom.wl.o ^ 77877967401300L);
    life4_5 = moom.v8.b__Arrayr3();
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.m)).a__fE(((moom.DT)(this.n))))).a__ch() == net.minecraft.init.Blocks.ai))) {
        break forward_join_41;
    }
    spill4424_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(this.n)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.n)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.n)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 == null))) {
        forwardValue4424_40_0 = spill4424_0;
        break forward_join_40;
    }
    if (!((spill4424_0 <= 0))) {
        break forward_join_41;
    }
    forwardValue4424_40_0 = 1;
    }
    forwardValue4424_42_0 = forwardValue4424_40_0;
    break forward_join_42;
    }
    forwardValue4424_42_0 = 0;
    }
    return ((forwardValue4424_42_0) != 0);
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
int lexicalValue1379_16_0;
    net.minecraft.entity.Entity[] spill1379_0;
    boolean spill1379_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    int life5_19;
    net.minecraft.item.ItemStack life6_31;
    lexical_join_41: {
    lexical_join_16: {
    life2_3 = (moom.wl.o ^ 112576063577214L);
    spill1379_0 = moom.v8.b__Arrayr3();
    super.a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    life4_8 = spill1379_0;
    spill1379_1 = ((net.minecraft.world.World)(this.m)).G;
    if (!((life4_8 == null))) {
        lexicalValue1379_16_0 = ((spill1379_1) ? 1 : 0);
        break lexical_join_16;
    }
    if (!((!spill1379_1))) {
        break lexical_join_41;
    }
    lexicalValue1379_16_0 = 0;
    }
    life5_19 = lexicalValue1379_16_0;
    lexical_cycle_17: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life5_19 < __sourceIntrinsic_62126deb9d7d_invokedynamic1379_6(32757, (2267466123656618051L ^ life2_3))))) {
        break lexical_join_41;
    }
    life6_31 = ((moom.wx)(this.k)).b__xW(((int)(life5_19)));
    if (!((life4_8 == null))) {
        break lexical_join_39;
    }
    if (!((life6_31 != null))) {
        break lexical_join_38;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.item.ItemStack)(life6_31)), ((boolean)(false)));
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
((net.minecraft.inventory.IInventory)(this.l)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.crafting.CraftingManager)(net.minecraft.item.crafting.CraftingManager.a__xX())).a(((moom.wx)(this.k)), ((net.minecraft.world.World)(this.m))))));
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, moom.wB p1) {
int forwardValue4423_19_0;
    int forwardValue4423_21_0;
    boolean spill4423_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life3_3 = (moom.wl.o ^ 111532745605141L);
    life5_5 = moom.v8.b__Arrayr3();
    if (!((((moom.wB)(p1)).b != this.l))) {
        break forward_join_20;
    }
    spill4423_0 = super.a(((net.minecraft.item.ItemStack)(p0)), ((moom.wB)(p1)));
    if (!((life5_5 == null))) {
        forwardValue4423_19_0 = ((spill4423_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4423_0)) {
        break forward_join_20;
    }
    forwardValue4423_19_0 = 1;
    }
    forwardValue4423_21_0 = forwardValue4423_19_0;
    break forward_join_21;
    }
    forwardValue4423_21_0 = 0;
    }
    return ((forwardValue4423_21_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4422_19_0;
    moom.wB forwardValue4422_24_0;
    int forwardValue4422_57_0;
    int forwardValue4422_101_0;
    int forwardValue4422_101_1;
    int forwardValue4422_144_0;
    int forwardValue4422_151_0;
    net.minecraft.entity.Entity[] spill4422_0;
    moom.wB spill4422_1;
    int spill4422_2;
    int spill4422_3;
    int spill4422_4;
    int spill4422_5;
    boolean spill4422_6;
    int spill4422_7;
    int spill4422_8;
    boolean spill4422_9;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    net.minecraft.entity.Entity[] life5_7;
    moom.wB life7_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_170: {
    forward_join_166: {
    forward_join_159: {
    forward_join_157: {
    forward_join_151: {
    forward_join_149: {
    forward_join_144: {
    forward_join_130: {
    forward_join_101: {
    forward_join_93: {
    forward_join_57: {
    forward_join_56: {
    forward_join_50: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wl.o ^ 119860970389195L);
    spill4422_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life5_7 = spill4422_0;
    life7_13 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    spill4422_1 = life7_13;
    if (!((life5_7 == null))) {
        forwardValue4422_19_0 = spill4422_1;
        break forward_join_19;
    }
    if (!((spill4422_1 != null))) {
        break forward_join_170;
    }
    forwardValue4422_19_0 = life7_13;
    }
    if (!((life5_7 == null))) {
        forwardValue4422_24_0 = forwardValue4422_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4422_19_0)).a__Boolean())) {
        break forward_join_170;
    }
    forwardValue4422_24_0 = life7_13;
    }
    life8_34 = ((moom.wB)(forwardValue4422_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4422_2 = p1;
    if (!((life5_7 == null))) {
        forwardValue4422_57_0 = spill4422_2;
        break forward_join_57;
    }
    if (!((spill4422_2 == 0))) {
        break forward_join_56;
    }
    if (!((!((moom.wl)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4422_8(11915, (5770332347831407495L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4422_9(15396, (3603301709095485750L ^ life3_3)))), ((boolean)(true)))))) {
        break forward_join_50;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.item.ItemStack)(life8_34)), ((net.minecraft.item.ItemStack)(life6_6)));
    if (!((life5_7 != null))) {
        break forward_join_149;
    }
    }
    forwardValue4422_57_0 = p1;
    }
    spill4422_3 = __sourceIntrinsic_245d151687c8_invokedynamic4422_12(27898, (1436223796913639920L ^ life3_3));
    if (!((life5_7 == null))) {
        forwardValue4422_101_0 = forwardValue4422_57_0;
        forwardValue4422_101_1 = spill4422_3;
        break forward_join_101;
    }
    if (!((forwardValue4422_57_0 >= spill4422_3))) {
        break forward_join_93;
    }
    spill4422_4 = p1;
    spill4422_5 = __sourceIntrinsic_245d151687c8_invokedynamic4422_13(9562, (4553779432801359945L ^ life3_3));
    if (!((life5_7 == null))) {
        forwardValue4422_101_0 = spill4422_4;
        forwardValue4422_101_1 = spill4422_5;
        break forward_join_101;
    }
    if (!((spill4422_4 < spill4422_5))) {
        break forward_join_93;
    }
    spill4422_6 = ((moom.wl)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4422_14(31662, (2166533118010492583L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4422_15(21824, (1038092706147969099L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4422_151_0 = ((spill4422_6) ? 1 : 0);
        break forward_join_151;
    }
    if (!((!spill4422_6))) {
        break forward_join_149;
    }
    return null;
    }
    spill4422_7 = p1;
    if (!((life5_7 == null))) {
        forwardValue4422_144_0 = spill4422_7;
        break forward_join_144;
    }
    forwardValue4422_101_0 = spill4422_7;
    forwardValue4422_101_1 = __sourceIntrinsic_245d151687c8_invokedynamic4422_18(31662, (2166533118010492583L ^ life3_3));
    }
    if (!((forwardValue4422_101_0 >= forwardValue4422_101_1))) {
        break forward_join_130;
    }
    spill4422_8 = p1;
    if (!((life5_7 == null))) {
        forwardValue4422_144_0 = spill4422_8;
        break forward_join_144;
    }
    if (!((spill4422_8 < __sourceIntrinsic_245d151687c8_invokedynamic4422_19(21824, (1038092706147969099L ^ life3_3))))) {
        break forward_join_130;
    }
    spill4422_9 = ((moom.wl)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4422_20(27898, (1436223796913639920L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4422_21(31662, (2166533118010492583L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4422_151_0 = ((spill4422_9) ? 1 : 0);
        break forward_join_151;
    }
    if (!((!spill4422_9))) {
        break forward_join_149;
    }
    return null;
    }
    forwardValue4422_144_0 = ((((moom.wl)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4422_24(27898, (1436223796913639920L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4422_25(21824, (1038092706147969099L ^ life3_3)))), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4422_151_0 = forwardValue4422_144_0;
        break forward_join_151;
    }
    if (!((forwardValue4422_144_0 == 0))) {
        break forward_join_149;
    }
    return null;
    }
    forwardValue4422_151_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4422_151_0 == 0))) {
        break forward_join_157;
    }
    ((moom.wB)(life7_13)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_7 != null))) {
        break forward_join_159;
    }
    }
    ((moom.wB)(life7_13)).a__Void();
    }
    if (!((((net.minecraft.item.ItemStack)(life8_34)).b == ((net.minecraft.item.ItemStack)(life6_6)).b))) {
        break forward_join_166;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life8_34)));
    }
    return life6_6;
}


private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4752c7044c93100b_originalDynamicSite758_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_62126deb9d7d_invokedynamic1379_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4422_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9609_0() throws E;
}
