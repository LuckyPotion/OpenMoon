package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wk extends moom.v8 {

private static org.apache.logging.log4j.Logger k;

private net.minecraft.inventory.IInventory l;

private net.minecraft.inventory.IInventory m;

private net.minecraft.world.World n;

private moom.DT o;

public int p;

private int q;

private java.lang.String r;

private net.minecraft.entity.player.EntityPlayer s;

private static long u;

private static long[] y;

private static java.lang.Integer[] z;

private static java.util.Map A;

public wk(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
this(((net.minecraft.entity.player.InventoryPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((moom.DT)(moom.DT.f)), ((net.minecraft.entity.player.EntityPlayer)(p2)));
    return;
}


public wk(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.entity.player.EntityPlayer p3) { super(); }

private static void __sourceConstructorBody_4012780bfc8d0b5a(moom.wk receiver, net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.entity.player.EntityPlayer p3) throws Throwable {
int __initValue757_164_0;
    long local5_life2;
    net.minecraft.entity.Entity[] local7_life9;
    int local8_life30;
    int local9_life32;
    init_join_206: {
    init_join_201: {
    init_join_164: {
    init_join_163: {
    local5_life2 = (moom.wk.u ^ 61559416129602L);
    moom.wk.__sourceConstructorInit_4012780bfc8d0b5a_0(((moom.wk)(receiver)));
    ((moom.wk)(receiver)).l = ((net.minecraft.inventory.IInventory)(new moom.ww()));
    net.minecraft.entity.Entity[] __sourceSpill757_7 = moom.v8.b__Arrayr3();
    ((moom.wk)(receiver)).m = ((net.minecraft.inventory.IInventory)(new moom.wu(receiver, "Repair", true, 2)));
    ((moom.wk)(receiver)).o = ((moom.DT)(p2));
    local7_life9 = __sourceSpill757_7;
    ((moom.wk)(receiver)).n = ((net.minecraft.world.World)(p1));
    ((moom.wk)(receiver)).s = ((net.minecraft.entity.player.EntityPlayer)(p3));
    ((moom.wk)(receiver)).a(((moom.wB)(new moom.wB(((moom.wk)(receiver)).m, 0, __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_14(21388, (2668474230812702566L ^ local5_life2)), __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_16(6120, (734066662837138182L ^ local5_life2))))));
    ((moom.wk)(receiver)).a(((moom.wB)(new moom.wB(((moom.wk)(receiver)).m, 1, __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_20(17533, (5129697342915305624L ^ local5_life2)), __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_22(14979, (1437024597818416751L ^ local5_life2))))));
    ((moom.wk)(receiver)).a(((moom.wB)(new moom.wL(receiver, ((moom.wk)(receiver)).l, 2, __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_26(26915, (3808822562264534466L ^ local5_life2)), __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_28(14979, (1437024597818416751L ^ local5_life2)), p1, p2))));
    local8_life30 = 0;
    init_cycle_93: while (true) {
    init_join_161: {
    init_join_160: {
    if (!((local8_life30 < 3))) {
        break init_join_163;
    }
    int __sourceSpill757_31 = 0;
    if (!((local7_life9 == null))) {
        __initValue757_164_0 = __sourceSpill757_31;
        break init_join_164;
    }
    local9_life32 = __sourceSpill757_31;
    init_cycle_100: while (true) {
    if (!((local9_life32 < __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_34(26289, (8037490309903532636L ^ local5_life2))))) {
        break init_join_160;
    }
    ((moom.wk)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), ((local9_life32 + (local8_life30 * __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_36(5797, (8960602098711704142L ^ local5_life2)))) + __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_38(5797, (8960602098711704142L ^ local5_life2))), (__sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_40(3303, (6635292560178194449L ^ local5_life2)) + (local9_life32 * __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_42(19075, (1822004194884382307L ^ local5_life2)))), (__sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_44(10258, (282957282542357735L ^ local5_life2)) + (local8_life30 * __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_46(21089, (8999846449851201161L ^ local5_life2))))))));
    local9_life32 += 1;
    if (!((local7_life9 == null))) {
        break init_join_161;
    }
    if (!((local7_life9 != null))) { continue init_cycle_100; }
    break init_cycle_100;
    }
    }
    local8_life30 += 1;
    }
    if (!((local7_life9 != null))) { continue init_cycle_93; }
    break init_cycle_93;
    }
    }
    __initValue757_164_0 = 0;
    }
    local8_life30 = __initValue757_164_0;
    init_cycle_165: while (true) {
    if (!((local8_life30 < __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_49(5797, (8960602098711704142L ^ local5_life2))))) {
        break init_join_201;
    }
    ((moom.wk)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), local8_life30, (__sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_51(14898, (6089545834813038277L ^ local5_life2)) + (local8_life30 * __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_53(21089, (8999846449851201161L ^ local5_life2)))), __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_55(4697, (3606729459787904688L ^ local5_life2))))));
    local8_life30 += 1;
    if (!((local7_life9 != null))) { continue init_cycle_165; }
    break init_cycle_165;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break init_join_206;
    }
    moom.v8.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));
    }
    return;
}


static {
u = ((long)(((moom._a)(moom._c.a(((long)(3778483785799294308L)), ((long)(8165910019809725201L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121707051125117L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wk.u ^ 39577365256664L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1653_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1653_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1653_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1653_14 = new byte[8];
    (__sourceSpill1653_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1653_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1653_16 = __sourceSpill1653_14;
    ((javax.crypto.Cipher)(__sourceSpill1653_11)).init(((int)(__sourceSpill1653_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1653_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1653_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ù#2ÞíÖWð¾\003ï\013*ëÞ\025Wn\007z°bfÓ1\003Ùëðr9úpÃåPk}E-^·í\025ÿ==G\034!æX\032?fj]Î=\003\007tÒ6|C^ÜÙ®\034¿ÁÉü¢Ä$)aþÙºàì}\007@¦\032f0\025A:Ñu©\035¶$õùh\tÛ(`Ç\032±Ë\036"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1653_25 = local6_life21;
        int __sourceSpill1653_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1653_25)).substring(((int)(__sourceSpill1653_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1653_30 = local8_life19;
        int __sourceSpill1653_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1653_33 = new byte[8];
        (__sourceSpill1653_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1653_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1653_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1653_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1653_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1653_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1653_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1653_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1653_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1653_34)).doFinal(((byte[])(__sourceSpill1653_33)));
        (__sourceSpill1653_30)[__sourceSpill1653_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Löi«¶qÜVÁîdX¢"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1653_38 = local6_life21;
        int __sourceSpill1653_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1653_38)).substring(((int)(__sourceSpill1653_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1653_43 = local8_life19;
        int __sourceSpill1653_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1653_46 = new byte[8];
        (__sourceSpill1653_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1653_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1653_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1653_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1653_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1653_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1653_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1653_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1653_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1653_47)).doFinal(((byte[])(__sourceSpill1653_46)));
        (__sourceSpill1653_43)[__sourceSpill1653_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    y = ((long[])(local8_life19));
    z = ((java.lang.Integer[])(new java.lang.Integer[19]));
    k = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceConstructorInit_4012780bfc8d0b5a_0(moom.wk a0) throws E;

private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15610;
      if (z[var3] == null) {
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
         long var5 = y[var3];
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
         Object[] var9 = (Object[])A.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               A.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         z[var3] = var15;
      }

      return z[var3];
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4419_40_0;
    int forwardValue4419_42_0;
    int spill4419_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    life2_3 = (moom.wk.u ^ 100119340555167L);
    life4_5 = moom.v8.b__Arrayr3();
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.n)).a__fE(((moom.DT)(this.o))))).a__ch() == net.minecraft.init.Blocks.bU))) {
        break forward_join_41;
    }
    spill4419_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(this.o)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.o)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.o)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 == null))) {
        forwardValue4419_40_0 = spill4419_0;
        break forward_join_40;
    }
    if (!((spill4419_0 <= 0))) {
        break forward_join_41;
    }
    forwardValue4419_40_0 = 1;
    }
    forwardValue4419_42_0 = forwardValue4419_40_0;
    break forward_join_42;
    }
    forwardValue4419_42_0 = 0;
    }
    return ((forwardValue4419_42_0) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wk.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9603_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void c() {
net.minecraft.item.ItemStack forestValue517_50_0;
    int forestValue517_71_0;
    int forestValue517_72_0;
    net.minecraft.item.ItemStack forestValue517_72_1;
    int forestValue517_73_0;
    int forestValue517_73_1;
    int forestValue517_94_0;
    int forestValue517_96_0;
    int forestValue517_132_0;
    int forestValue517_146_0;
    int forestValue517_146_1;
    int forestValue517_169_0;
    net.minecraft.item.ItemStack forestValue517_180_0;
    int forestValue517_197_0;
    int forestValue517_207_0;
    int forestValue517_247_0;
    net.minecraft.item.ItemStack forestValue517_255_0;
    java.lang.Object forestValue517_284_0;
    int forestValue517_306_0;
    int forestValue517_306_1;
    int forestValue517_326_0;
    int forestValue517_350_0;
    int forestValue517_354_0;
    int forestValue517_363_0;
    int forestValue517_379_0;
    int forestValue517_402_0;
    int forestValue517_418_0;
    moom.wk forestValue517_422_0;
    int forestValue517_447_0;
    int forestValue517_467_0;
    int forestValue517_473_0;
    int forestValue517_474_0;
    int forestValue517_474_1;
    int forestValue517_500_0;
    int forestValue517_507_0;
    int forestValue517_507_1;
    int forestValue517_512_0;
    net.minecraft.item.ItemStack forestValue517_520_0;
    int forestValue517_539_0;
    int forestValue517_539_1;
    net.minecraft.item.ItemStack forestValue517_542_0;
    net.minecraft.entity.Entity[] spill517_0;
    net.minecraft.item.ItemStack spill517_1;
    int spill517_2;
    net.minecraft.item.ItemStack spill517_3;
    moom.wk spill517_4;
    int spill517_5;
    boolean spill517_6;
    boolean spill517_7;
    int spill517_8;
    int spill517_9;
    int spill517_10;
    net.minecraft.item.ItemStack spill517_11;
    boolean spill517_12;
    net.minecraft.item.ItemStack spill517_13;
    int spill517_14;
    int spill517_15;
    net.minecraft.enchantment.Enchantment spill517_16;
    int spill517_17;
    int spill517_18;
    boolean spill517_19;
    int spill517_20;
    int spill517_21;
    int spill517_22;
    int spill517_23;
    int spill517_24;
    boolean spill517_25;
    boolean spill517_26;
    int spill517_27;
    int spill517_28;
    int spill517_29;
    net.minecraft.item.ItemStack spill517_30;
    net.minecraft.item.ItemStack spill517_31;
    int spill517_32;
    int spill517_33;
    long life1_3;
    int life4_6;
    int life5_8;
    int life6_10;
    int life7_12;
    int life8_14;
    int life9_16;
    int life10_18;
    net.minecraft.item.ItemStack life11_23;
    net.minecraft.entity.Entity[] life3_24;
    int life12_29;
    int life13_31;
    int life14_33;
    net.minecraft.item.ItemStack life15_53;
    net.minecraft.item.ItemStack life16_58;
    java.util.Map life17_61;
    int life18_63;
    int life13_78;
    int life18_104;
    int life19_128;
    int life20_144;
    int life21_162;
    int life19_232;
    int life20_238;
    int life21_255;
    int life22_259;
    int life23_264;
    java.util.Map life19_283;
    java.util.Iterator life20_287;
    int life21_295;
    net.minecraft.enchantment.Enchantment life22_298;
    int life23_316;
    int life24_323;
    int life25_332;
    int life24_341;
    int life26_345;
    java.util.Iterator life27_365;
    int life28_373;
    int life27_420;
    int life19_578;
    forest_join_554: {
    forest_join_547: {
    forest_join_542: {
    forest_join_539: {
    forest_join_535: {
    forest_join_520: {
    forest_join_515: {
    forest_join_512: {
    forest_join_507: {
    forest_join_500: {
    forest_join_498: {
    forest_join_474: {
    forest_join_473: {
    forest_join_472: {
    forest_join_467: {
    forest_join_461: {
    forest_join_447: {
    forest_join_442: {
    forest_join_422: {
    forest_join_421: {
    forest_join_255: {
    forest_join_254: {
    forest_join_247: {
    forest_join_246: {
    forest_join_207: {
    forest_join_197: {
    forest_join_193: {
    forest_join_184: {
    forest_join_180: {
    forest_join_169: {
    forest_join_168: {
    forest_join_163: {
    forest_join_132: {
    forest_join_131: {
    forest_join_96: {
    forest_join_95: {
    forest_join_94: {
    forest_join_73: {
    forest_join_72: {
    forest_join_71: {
    forest_join_50: {
    forest_join_48: {
    life1_3 = (moom.wk.u ^ 103308784615604L);
    spill517_0 = moom.v8.b__Arrayr3();
    life4_6 = 0;
    life5_8 = 1;
    life6_10 = 1;
    life7_12 = 1;
    life8_14 = 2;
    life9_16 = 1;
    life10_18 = 1;
    life11_23 = ((net.minecraft.inventory.IInventory)(this.m)).a__xW(((int)(0)));
    life3_24 = spill517_0;
    this.p = ((int)(1));
    life12_29 = 0;
    life13_31 = 0;
    life14_33 = 0;
    spill517_1 = life11_23;
    if (!((life3_24 == null))) {
        forestValue517_50_0 = spill517_1;
        break forest_join_50;
    }
    if (!((spill517_1 == null))) {
        break forest_join_48;
    }
    ((net.minecraft.inventory.IInventory)(this.l)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(null)));
    this.p = ((int)(0));
    if (!((life3_24 != null))) {
        break forest_join_554;
    }
    }
    forestValue517_50_0 = ((net.minecraft.item.ItemStack)(life11_23)).a__xW();
    }
    life15_53 = forestValue517_50_0;
    life16_58 = ((net.minecraft.inventory.IInventory)(this.m)).a__xW(((int)(1)));
    life17_61 = moom.rV.a(((net.minecraft.item.ItemStack)(life15_53)));
    life18_63 = 0;
    spill517_2 = (life13_31 + ((net.minecraft.item.ItemStack)(life11_23)).f());
    spill517_3 = life16_58;
    if (!((life3_24 == null))) {
        forestValue517_72_0 = spill517_2;
        forestValue517_72_1 = spill517_3;
        break forest_join_72;
    }
    if (!((spill517_3 == null))) {
        forestValue517_71_0 = spill517_2;
        break forest_join_71;
    }
    forestValue517_73_0 = spill517_2;
    forestValue517_73_1 = 0;
    break forest_join_73;
    }
    forestValue517_72_0 = forestValue517_71_0;
    forestValue517_72_1 = life16_58;
    }
    forestValue517_73_0 = forestValue517_72_0;
    forestValue517_73_1 = ((net.minecraft.item.ItemStack)(forestValue517_72_1)).f();
    }
    life13_78 = (forestValue517_73_0 + forestValue517_73_1);
    spill517_4 = this;
    if (!((life3_24 == null))) {
        forestValue517_422_0 = spill517_4;
        break forest_join_422;
    }
    ((moom.wk)(spill517_4)).q = ((int)(0));
    if (!((life16_58 != null))) {
        break forest_join_421;
    }
    if (!((((net.minecraft.item.ItemStack)(life16_58)).a__wQ() == net.minecraft.init.Items.bS))) {
        break forest_join_95;
    }
    spill517_5 = ((net.minecraft.nbt.NBTTagList)(((moom.xg)(net.minecraft.init.Items.bS)).a__yz(((net.minecraft.item.ItemStack)(life16_58))))).a__Int();
    if (!((life3_24 == null))) {
        forestValue517_94_0 = spill517_5;
        break forest_join_94;
    }
    if (!((spill517_5 > 0))) {
        break forest_join_95;
    }
    forestValue517_94_0 = 1;
    }
    forestValue517_96_0 = forestValue517_94_0;
    break forest_join_96;
    }
    forestValue517_96_0 = 0;
    }
    life18_104 = forestValue517_96_0;
    spill517_6 = ((net.minecraft.item.ItemStack)(life15_53)).b__Boolean();
    if (!((life3_24 == null))) {
        forestValue517_169_0 = ((spill517_6) ? 1 : 0);
        break forest_join_169;
    }
    if (!(spill517_6)) {
        break forest_join_168;
    }
    spill517_7 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life15_53)).a__wQ())).a(((net.minecraft.item.ItemStack)(life11_23)), ((net.minecraft.item.ItemStack)(life16_58)));
    if (!((life3_24 == null))) {
        forestValue517_169_0 = ((spill517_7) ? 1 : 0);
        break forest_join_169;
    }
    if (!(spill517_7)) {
        break forest_join_168;
    }
    life19_128 = java.lang.Math.min(((int)(((net.minecraft.item.ItemStack)(life15_53)).b())), ((int)((((net.minecraft.item.ItemStack)(life15_53)).d() / 4))));
    spill517_8 = life19_128;
    if (!((life3_24 == null))) {
        forestValue517_132_0 = spill517_8;
        break forest_join_132;
    }
    if (!((spill517_8 <= 0))) {
        break forest_join_131;
    }
    ((net.minecraft.inventory.IInventory)(this.l)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(null)));
    this.p = ((int)(0));
    return;
    }
    forestValue517_132_0 = 0;
    }
    life20_144 = forestValue517_132_0;
    forest_cycle_133: while (true) {
    forest_join_146: {
    if (!((life19_128 > 0))) {
        break forest_join_163;
    }
    spill517_9 = life20_144;
    spill517_10 = ((net.minecraft.item.ItemStack)(life16_58)).b;
    if (!((life3_24 == null))) {
        forestValue517_474_0 = spill517_9;
        forestValue517_474_1 = spill517_10;
        break forest_join_474;
    }
    if (!((life3_24 == null))) {
        forestValue517_146_0 = spill517_9;
        forestValue517_146_1 = spill517_10;
        break forest_join_146;
    }
    if (!((spill517_9 < spill517_10))) {
        break forest_join_163;
    }
    forestValue517_146_0 = ((net.minecraft.item.ItemStack)(life15_53)).b();
    forestValue517_146_1 = life19_128;
    }
    life21_162 = (forestValue517_146_0 - forestValue517_146_1);
    ((net.minecraft.item.ItemStack)(life15_53)).a__Void(((int)(life21_162)));
    life12_29 += 1;
    life19_128 = java.lang.Math.min(((int)(((net.minecraft.item.ItemStack)(life15_53)).b())), ((int)((((net.minecraft.item.ItemStack)(life15_53)).d() / 4))));
    life20_144 += 1;
    if (!((life3_24 != null))) {
        continue forest_cycle_133;
    }
    break forest_cycle_133;
    }
    }
    this.q = ((int)(life20_144));
    if (!((life3_24 != null))) {
        break forest_join_421;
    }
    }
    forestValue517_169_0 = life18_104;
    }
    if (!((life3_24 == null))) {
        forestValue517_197_0 = forestValue517_169_0;
        break forest_join_197;
    }
    if (!((forestValue517_169_0 == 0))) {
        break forest_join_193;
    }
    spill517_11 = life15_53;
    if (!((life3_24 == null))) {
        forestValue517_180_0 = spill517_11;
        break forest_join_180;
    }
    if (!((((net.minecraft.item.ItemStack)(spill517_11)).a__wQ() == ((net.minecraft.item.ItemStack)(life16_58)).a__wQ()))) {
        break forest_join_184;
    }
    forestValue517_180_0 = life15_53;
    }
    spill517_12 = ((net.minecraft.item.ItemStack)(forestValue517_180_0)).b__Boolean();
    if (!((life3_24 == null))) {
        forestValue517_197_0 = ((spill517_12) ? 1 : 0);
        break forest_join_197;
    }
    if (!((!spill517_12))) {
        break forest_join_193;
    }
    }
    ((net.minecraft.inventory.IInventory)(this.l)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(null)));
    this.p = ((int)(0));
    return;
    }
    spill517_13 = life15_53;
    if (!((life3_24 == null))) {
        forestValue517_255_0 = spill517_13;
        break forest_join_255;
    }
    forestValue517_197_0 = ((((net.minecraft.item.ItemStack)(spill517_13)).b__Boolean()) ? 1 : 0);
    }
    if (!((forestValue517_197_0 != 0))) {
        break forest_join_254;
    }
    spill517_14 = life18_104;
    if (!((life3_24 == null))) {
        forestValue517_207_0 = spill517_14;
        break forest_join_207;
    }
    if (!((spill517_14 == 0))) {
        break forest_join_254;
    }
    forestValue517_207_0 = (((net.minecraft.item.ItemStack)(life11_23)).d() - ((net.minecraft.item.ItemStack)(life11_23)).b());
    }
    life19_232 = forestValue517_207_0;
    life20_238 = (((net.minecraft.item.ItemStack)(life16_58)).d() - ((net.minecraft.item.ItemStack)(life16_58)).b());
    life21_255 = (life20_238 + ((((net.minecraft.item.ItemStack)(life15_53)).d() * __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_52(17980, (1270362285557393965L ^ life1_3))) / __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_53(31384, (9126125940595529356L ^ life1_3))));
    life22_259 = (life19_232 + life21_255);
    life23_264 = (((net.minecraft.item.ItemStack)(life15_53)).d() - life22_259);
    spill517_15 = life23_264;
    if (!((life3_24 == null))) {
        forestValue517_247_0 = spill517_15;
        break forest_join_247;
    }
    if (!((spill517_15 < 0))) {
        break forest_join_246;
    }
    life23_264 = 0;
    }
    forestValue517_247_0 = life23_264;
    }
    if (!((forestValue517_247_0 < ((net.minecraft.item.ItemStack)(life15_53)).c()))) {
        break forest_join_254;
    }
    ((net.minecraft.item.ItemStack)(life15_53)).a__Void(((int)(life23_264)));
    life12_29 += 2;
    }
    forestValue517_255_0 = life16_58;
    }
    life19_283 = moom.rV.a(((net.minecraft.item.ItemStack)(forestValue517_255_0)));
    life20_287 = ((java.util.Set)(((java.util.Map)(life19_283)).keySet())).iterator();
    forest_cycle_261: while (true) {
    forest_join_419: {
    forest_join_418: {
    forest_join_413: {
    forest_join_403: {
    forest_join_402: {
    forest_join_401: {
    forest_join_397: {
    forest_join_395: {
    forest_join_393: {
    forest_join_385: {
    forest_join_379: {
    forest_join_371: {
    forest_join_363: {
    forest_join_358: {
    forest_join_327: {
    forest_join_326: {
    forest_join_325: {
    forest_join_308: {
    forest_join_306: {
    forest_join_304: {
    forest_join_284: {
    if (!(((java.util.Iterator)(life20_287)).hasNext())) {
        break forest_join_421;
    }
    life21_295 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Iterator)(life20_287)).next())))).intValue();
    life22_298 = net.minecraft.enchantment.Enchantment.a__rD(((int)(life21_295)));
    if (!((life3_24 == null))) {
        break forest_join_442;
    }
    spill517_16 = life22_298;
    if (!((life3_24 == null))) {
        forestValue517_284_0 = spill517_16;
        break forest_join_284;
    }
    if (!((spill517_16 != null))) {
        break forest_join_419;
    }
    forestValue517_284_0 = ((java.util.Map)(life17_61)).getOrDefault(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life21_295))))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    }
    life23_316 = ((java.lang.Integer)(((java.lang.Integer)(forestValue517_284_0)))).intValue();
    life24_323 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(life19_283)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life21_295)))))))))).intValue();
    spill517_17 = life23_316;
    spill517_18 = life24_323;
    if (!((life3_24 == null))) {
        forestValue517_306_0 = spill517_17;
        forestValue517_306_1 = spill517_18;
        break forest_join_306;
    }
    if (!((spill517_17 == spill517_18))) {
        break forest_join_304;
    }
    life24_323 += 1;
    life25_332 = life24_323;
    if (!((life3_24 != null))) {
        break forest_join_308;
    }
    }
    forestValue517_306_0 = life24_323;
    forestValue517_306_1 = life23_316;
    }
    life25_332 = java.lang.Math.max(((int)(forestValue517_306_0)), ((int)(forestValue517_306_1)));
    }
    life24_341 = life25_332;
    life26_345 = ((((net.minecraft.enchantment.Enchantment)(life22_298)).a(((net.minecraft.item.ItemStack)(life11_23)))) ? 1 : 0);
    spill517_19 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(this.s)).b1)).d;
    if (!((life3_24 == null))) {
        forestValue517_326_0 = ((spill517_19) ? 1 : 0);
        break forest_join_326;
    }
    if (!((!spill517_19))) {
        break forest_join_325;
    }
    if (!((((net.minecraft.item.ItemStack)(life11_23)).a__wQ() == net.minecraft.init.Items.bS))) {
        break forest_join_327;
    }
    }
    forestValue517_326_0 = 1;
    }
    life26_345 = forestValue517_326_0;
    }
    life27_365 = ((java.util.Set)(((java.util.Map)(life17_61)).keySet())).iterator();
    forest_cycle_331: while (true) {
    forest_join_356: {
    forest_join_354: {
    forest_join_350: {
    if (!(((java.util.Iterator)(life27_365)).hasNext())) {
        break forest_join_358;
    }
    life28_373 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Iterator)(life27_365)).next())))).intValue();
    spill517_20 = life28_373;
    if (!((life3_24 == null))) {
        forestValue517_350_0 = spill517_20;
        break forest_join_350;
    }
    spill517_21 = life21_295;
    if (!((life3_24 == null))) {
        forestValue517_474_0 = spill517_20;
        forestValue517_474_1 = spill517_21;
        break forest_join_474;
    }
    if (!((spill517_20 != spill517_21))) {
        break forest_join_356;
    }
    forestValue517_350_0 = ((((net.minecraft.enchantment.Enchantment)(life22_298)).a(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.a__rD(((int)(life28_373))))))) ? 1 : 0);
    }
    if (!((life3_24 == null))) {
        forestValue517_354_0 = forestValue517_350_0;
        break forest_join_354;
    }
    if (!((forestValue517_350_0 == 0))) {
        break forest_join_356;
    }
    forestValue517_354_0 = 0;
    }
    life26_345 = forestValue517_354_0;
    life12_29 += 1;
    }
    if (!((life3_24 != null))) {
        continue forest_cycle_331;
    }
    break forest_cycle_331;
    }
    }
    spill517_22 = life26_345;
    if (!((life3_24 == null))) {
        forestValue517_363_0 = spill517_22;
        break forest_join_363;
    }
    if (!((spill517_22 != 0))) {
        break forest_join_419;
    }
    forestValue517_363_0 = life24_341;
    }
    if (!((life3_24 == null))) {
        forestValue517_379_0 = forestValue517_363_0;
        break forest_join_379;
    }
    if (!((forestValue517_363_0 > ((net.minecraft.enchantment.Enchantment)(life22_298)).c()))) {
        break forest_join_371;
    }
    life24_341 = ((net.minecraft.enchantment.Enchantment)(life22_298)).c();
    }
    ((java.util.Map)(life17_61)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life21_295))))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(life24_341))))));
    forestValue517_379_0 = 0;
    }
    life27_420 = forestValue517_379_0;
    spill517_23 = ((net.minecraft.enchantment.Enchantment)(life22_298)).a();
    if (!((life3_24 == null))) {
        forestValue517_402_0 = spill517_23;
        break forest_join_402;
    }
    switch (spill517_23) {
case 1:
{
        break forest_join_385;
    }
case 2:
{
        break forest_join_393;
    }
case 3:
case 4:
case 6:
case 7:
case 8:
case 9:
default:
{
        break forest_join_395;
    }
case 5:
{
        break forest_join_397;
    }
case 10:
{
        break forest_join_401;
    }
}
    }
    life27_420 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_98(14898, (6089433657107600947L ^ life1_3));
    if (!((life3_24 != null))) {
        break forest_join_403;
    }
    }
    life27_420 = 4;
    }
    if (!((life3_24 != null))) {
        break forest_join_403;
    }
    }
    life27_420 = 2;
    if (!((life3_24 != null))) {
        break forest_join_403;
    }
    }
    forestValue517_402_0 = 1;
    }
    life27_420 = forestValue517_402_0;
    }
    spill517_24 = life18_104;
    if (!((life3_24 == null))) {
        forestValue517_418_0 = spill517_24;
        break forest_join_418;
    }
    if (!((spill517_24 != 0))) {
        break forest_join_413;
    }
    life27_420 = java.lang.Math.max(((int)(1)), ((int)((life27_420 / 2))));
    }
    forestValue517_418_0 = (life12_29 + (life27_420 * life24_341));
    }
    life12_29 = forestValue517_418_0;
    }
    if (!((life3_24 != null))) {
        continue forest_cycle_261;
    }
    break forest_cycle_261;
    }
    }
    forestValue517_422_0 = this;
    }
    spill517_25 = org.apache.commons.lang3.StringUtils.isBlank(((java.lang.CharSequence)(((moom.wk)(forestValue517_422_0)).r)));
    if (!((life3_24 == null))) {
        forestValue517_447_0 = ((spill517_25) ? 1 : 0);
        break forest_join_447;
    }
    if (!(spill517_25)) {
        break forest_join_442;
    }
    spill517_26 = ((net.minecraft.item.ItemStack)(life11_23)).f__Boolean();
    if (!((life3_24 == null))) {
        forestValue517_467_0 = ((spill517_26) ? 1 : 0);
        break forest_join_467;
    }
    if (!(spill517_26)) {
        break forest_join_461;
    }
    life14_33 = 1;
    life12_29 = (life12_29 + life14_33);
    ((net.minecraft.item.ItemStack)(life15_53)).a__Void();
    if (!((life3_24 != null))) {
        break forest_join_461;
    }
    }
    forestValue517_447_0 = ((((java.lang.String)(this.r)).equals(((java.lang.Object)(((net.minecraft.item.ItemStack)(life11_23)).b__String())))) ? 1 : 0);
    }
    if (!((life3_24 == null))) {
        forestValue517_467_0 = forestValue517_447_0;
        break forest_join_467;
    }
    if (!((forestValue517_447_0 == 0))) {
        break forest_join_461;
    }
    life14_33 = 1;
    life12_29 = (life12_29 + life14_33);
    ((net.minecraft.item.ItemStack)(life15_53)).a(((java.lang.String)(this.r)));
    }
    this.p = ((int)((life13_78 + life12_29)));
    forestValue517_467_0 = life12_29;
    }
    if (!((life3_24 == null))) {
        forestValue517_473_0 = forestValue517_467_0;
        break forest_join_473;
    }
    if (!((forestValue517_467_0 <= 0))) {
        break forest_join_472;
    }
    life15_53 = null;
    }
    forestValue517_473_0 = life14_33;
    }
    forestValue517_474_0 = forestValue517_473_0;
    forestValue517_474_1 = life12_29;
    }
    if (!((life3_24 == null))) {
        forestValue517_507_0 = forestValue517_474_0;
        forestValue517_507_1 = forestValue517_474_1;
        break forest_join_507;
    }
    if (!((forestValue517_474_0 == forestValue517_474_1))) {
        break forest_join_498;
    }
    spill517_27 = life14_33;
    if (!((life3_24 == null))) {
        forestValue517_500_0 = spill517_27;
        break forest_join_500;
    }
    if (!((spill517_27 > 0))) {
        break forest_join_498;
    }
    spill517_28 = this.p;
    spill517_29 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_114(3248, (8850072480492839074L ^ life1_3));
    if (!((life3_24 == null))) {
        forestValue517_507_0 = spill517_28;
        forestValue517_507_1 = spill517_29;
        break forest_join_507;
    }
    if (!((spill517_28 >= spill517_29))) {
        break forest_join_498;
    }
    this.p = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic517_115(20131, (2736311668255531706L ^ life1_3))));
    }
    forestValue517_500_0 = this.p;
    }
    if (!((life3_24 == null))) {
        forestValue517_512_0 = forestValue517_500_0;
        break forest_join_512;
    }
    forestValue517_507_0 = forestValue517_500_0;
    forestValue517_507_1 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_118(3032, (1339714263558907848L ^ life1_3));
    }
    if (!((forestValue517_507_0 >= forestValue517_507_1))) {
        break forest_join_515;
    }
    forestValue517_512_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(this.s)).b1)).d) ? 1 : 0);
    }
    if (!((forestValue517_512_0 == 0))) {
        break forest_join_515;
    }
    life15_53 = null;
    }
    spill517_30 = life15_53;
    if (!((life3_24 == null))) {
        forestValue517_520_0 = spill517_30;
        break forest_join_520;
    }
    if (!((spill517_30 != null))) {
        break forest_join_547;
    }
    forestValue517_520_0 = life15_53;
    }
    life19_578 = ((net.minecraft.item.ItemStack)(forestValue517_520_0)).f();
    spill517_31 = life16_58;
    if (!((life3_24 == null))) {
        forestValue517_542_0 = spill517_31;
        break forest_join_542;
    }
    if (!((spill517_31 != null))) {
        break forest_join_535;
    }
    spill517_32 = life19_578;
    spill517_33 = ((net.minecraft.item.ItemStack)(life16_58)).f();
    if (!((life3_24 == null))) {
        forestValue517_539_0 = spill517_32;
        forestValue517_539_1 = spill517_33;
        break forest_join_539;
    }
    if (!((spill517_32 < spill517_33))) {
        break forest_join_535;
    }
    life19_578 = ((net.minecraft.item.ItemStack)(life16_58)).f();
    }
    forestValue517_539_0 = (life19_578 * 2);
    forestValue517_539_1 = 1;
    }
    life19_578 = (forestValue517_539_0 + forestValue517_539_1);
    forestValue517_542_0 = life15_53;
    }
    ((net.minecraft.item.ItemStack)(forestValue517_542_0)).b(((int)(life19_578)));
    moom.rV.a(((java.util.Map)(life17_61)), ((net.minecraft.item.ItemStack)(life15_53)));
    }
    ((net.minecraft.inventory.IInventory)(this.l)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(life15_53)));
    ((moom.wk)(this)).a__Void();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.inventory.ICrafting p0) {
super.a(((net.minecraft.inventory.ICrafting)(p0)));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((int)(0)), ((int)(this.p)));
    return;
}


public void a__Void(net.minecraft.inventory.IInventory p0) {
moom.wk forwardValue4418_16_0;
    moom.wk spill4418_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.wk.u ^ 90347910711038L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4418_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4418_16_0 = spill4418_0;
        break forward_join_16;
    }
    __sourceIntrinsic_abdbec025829_call4418_2(spill4418_0, p0);
    if (!((p0 == this.m))) {
        break forward_join_17;
    }
    forwardValue4418_16_0 = this;
    }
    ((moom.wk)(forwardValue4418_16_0)).c();
    }
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
int lexicalValue1377_16_0;
    net.minecraft.entity.Entity[] spill1377_0;
    boolean spill1377_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    int life5_19;
    net.minecraft.item.ItemStack life6_29;
    lexical_join_39: {
    lexical_join_16: {
    life2_3 = (moom.wk.u ^ 136036938692277L);
    spill1377_0 = moom.v8.b__Arrayr3();
    super.a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    life4_8 = spill1377_0;
    spill1377_1 = ((net.minecraft.world.World)(this.n)).G;
    if (!((life4_8 == null))) {
        lexicalValue1377_16_0 = ((spill1377_1) ? 1 : 0);
        break lexical_join_16;
    }
    if (!((!spill1377_1))) {
        break lexical_join_39;
    }
    lexicalValue1377_16_0 = 0;
    }
    life5_19 = lexicalValue1377_16_0;
    lexical_cycle_17: while (true) {
    lexical_join_37: {
    lexical_join_36: {
    if (!((life5_19 < ((net.minecraft.inventory.IInventory)(this.m)).b__Int()))) {
        break lexical_join_39;
    }
    life6_29 = ((net.minecraft.inventory.IInventory)(this.m)).b__xW(((int)(life5_19)));
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


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4417_19_0;
    moom.wB forwardValue4417_24_0;
    int forwardValue4417_54_0;
    int forwardValue4417_97_0;
    int forwardValue4417_104_0;
    net.minecraft.entity.Entity[] spill4417_0;
    moom.wB spill4417_1;
    int spill4417_2;
    int spill4417_3;
    int spill4417_4;
    int spill4417_5;
    boolean spill4417_6;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    net.minecraft.entity.Entity[] life5_7;
    moom.wB life7_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_123: {
    forward_join_119: {
    forward_join_112: {
    forward_join_110: {
    forward_join_104: {
    forward_join_102: {
    forward_join_97: {
    forward_join_87: {
    forward_join_54: {
    forward_join_53: {
    forward_join_47: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wk.u ^ 124081464693760L);
    spill4417_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life5_7 = spill4417_0;
    life7_13 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    spill4417_1 = life7_13;
    if (!((life5_7 == null))) {
        forwardValue4417_19_0 = spill4417_1;
        break forward_join_19;
    }
    if (!((spill4417_1 != null))) {
        break forward_join_123;
    }
    forwardValue4417_19_0 = life7_13;
    }
    if (!((life5_7 == null))) {
        forwardValue4417_24_0 = forwardValue4417_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4417_19_0)).a__Boolean())) {
        break forward_join_123;
    }
    forwardValue4417_24_0 = life7_13;
    }
    life8_34 = ((moom.wB)(forwardValue4417_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4417_2 = p1;
    if (!((life5_7 == null))) {
        forwardValue4417_54_0 = spill4417_2;
        break forward_join_54;
    }
    if (!((spill4417_2 == 2))) {
        break forward_join_53;
    }
    if (!((!((moom.wk)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(3)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4417_8(21004, (5657792897583590061L ^ life3_3)))), ((boolean)(true)))))) {
        break forward_join_47;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.item.ItemStack)(life8_34)), ((net.minecraft.item.ItemStack)(life6_6)));
    if (!((life5_7 != null))) {
        break forward_join_102;
    }
    }
    forwardValue4417_54_0 = p1;
    }
    if (!((life5_7 == null))) {
        forwardValue4417_97_0 = forwardValue4417_54_0;
        break forward_join_97;
    }
    if (!((forwardValue4417_54_0 != 0))) {
        break forward_join_87;
    }
    spill4417_3 = p1;
    if (!((life5_7 == null))) {
        forwardValue4417_97_0 = spill4417_3;
        break forward_join_97;
    }
    if (!((spill4417_3 != 1))) {
        break forward_join_87;
    }
    spill4417_4 = p1;
    if (!((life5_7 == null))) {
        forwardValue4417_104_0 = spill4417_4;
        break forward_join_104;
    }
    if (!((spill4417_4 >= 3))) {
        break forward_join_102;
    }
    spill4417_5 = p1;
    if (!((life5_7 == null))) {
        forwardValue4417_104_0 = spill4417_5;
        break forward_join_104;
    }
    if (!((spill4417_5 < __sourceIntrinsic_245d151687c8_invokedynamic4417_11(20131, (2736352227725161998L ^ life3_3))))) {
        break forward_join_102;
    }
    spill4417_6 = ((moom.wk)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(0)), ((int)(2)), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4417_104_0 = ((spill4417_6) ? 1 : 0);
        break forward_join_104;
    }
    if (!((!spill4417_6))) {
        break forward_join_102;
    }
    return null;
    }
    forwardValue4417_97_0 = ((((moom.wk)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(3)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4417_14(20131, (2736352227725161998L ^ life3_3)))), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4417_104_0 = forwardValue4417_97_0;
        break forward_join_104;
    }
    if (!((forwardValue4417_97_0 == 0))) {
        break forward_join_102;
    }
    return null;
    }
    forwardValue4417_104_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4417_104_0 == 0))) {
        break forward_join_110;
    }
    ((moom.wB)(life7_13)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_7 != null))) {
        break forward_join_112;
    }
    }
    ((moom.wB)(life7_13)).a__Void();
    }
    if (!((((net.minecraft.item.ItemStack)(life8_34)).b == ((net.minecraft.item.ItemStack)(life6_6)).b))) {
        break forward_join_119;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life8_34)));
    }
    return life6_6;
}


public void a(java.lang.String p0) {
moom.wk forwardValue4415_36_0;
    net.minecraft.entity.Entity[] spill4415_0;
    moom.wk spill4415_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.item.ItemStack life5_23;
    forward_join_36: {
    forward_join_35: {
    forward_join_30: {
    forward_join_28: {
    life2_3 = (moom.wk.u ^ 48329500778456L);
    spill4415_0 = moom.v8.b__Arrayr3();
    this.r = ((java.lang.String)(p0));
    life4_8 = spill4415_0;
    spill4415_1 = this;
    if (!((life4_8 == null))) {
        forwardValue4415_36_0 = spill4415_1;
        break forward_join_36;
    }
    if (!(((moom.wB)(((moom.wk)(spill4415_1)).a__wB(((int)(2))))).a__Boolean())) {
        break forward_join_35;
    }
    life5_23 = ((moom.wB)(((moom.wk)(this)).a__wB(((int)(2))))).a__xW();
    if (!((life4_8 == null))) {
        break forward_join_28;
    }
    if (!(org.apache.commons.lang3.StringUtils.isBlank(((java.lang.CharSequence)(p0))))) {
        break forward_join_30;
    }
    ((net.minecraft.item.ItemStack)(life5_23)).a__Void();
    }
    if (!((life4_8 != null))) {
        break forward_join_35;
    }
    }
    ((net.minecraft.item.ItemStack)(life5_23)).a(((java.lang.String)(this.r)));
    }
    forwardValue4415_36_0 = this;
    }
    ((moom.wk)(forwardValue4415_36_0)).c();
    return;
}


public void a__Void(int p0, int p1) {
long local3 = (moom.wk.u ^ 61602128238112L);
    if ((p0 == 0)) {
        this.p = ((int)(p1));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4012780bfc8d0b5a_originalDynamicSite757_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4417_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4417_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4417_14(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_abdbec025829_call4418_2(moom.wk a0, net.minecraft.inventory.IInventory a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9603_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic517_118(int a0, long a1) throws E;
}
