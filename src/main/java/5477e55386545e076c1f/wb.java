package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wb extends moom.v8 {

private net.minecraft.inventory.IInventory k;

private moom.wB l;

private int m;

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public wb(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1) { super(); }


private static void __sourceConstructorBody_e9c10860695ae83b(moom.wb receiver, net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1) throws Throwable {

int __initValue748_163_0;

    long local3_life2;

    int local6_life31;

    net.minecraft.entity.Entity[] local5_life32;

    int local7_life34;

    init_join_200: {

    init_join_163: {

    init_join_162: {

    local3_life2 = (moom.wb.n ^ 101640891080103L);

    moom.wb.__sourceConstructorInit_e9c10860695ae83b_0(((moom.wb)(receiver)));

    ((moom.wb)(receiver)).k = ((net.minecraft.inventory.IInventory)(p1));

    ((moom.wb)(receiver)).a(((moom.wB)(new moom.wF(((net.minecraft.entity.player.InventoryPlayer)(p0)).d, p1, 0, __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_7(16955, (549975018200160495L ^ local3_life2)), __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_9(17698, (2870869624772714488L ^ local3_life2))))));

    ((moom.wb)(receiver)).a(((moom.wB)(new moom.wF(((net.minecraft.entity.player.InventoryPlayer)(p0)).d, p1, 1, __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_13(170, (9141306405364308577L ^ local3_life2)), __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_15(16531, (2464757016269380161L ^ local3_life2))))));

    net.minecraft.entity.Entity[] __sourceSpill748_24 = moom.v8.b__Arrayr3();

    ((moom.wb)(receiver)).a(((moom.wB)(new moom.wF(((net.minecraft.entity.player.InventoryPlayer)(p0)).d, p1, 2, __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_20(653, (9068487674054907984L ^ local3_life2)), __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_22(12442, (7178333925044759117L ^ local3_life2))))));

    ((moom.wb)(receiver)).l = ((moom.wB)(((moom.wb)(receiver)).a(((moom.wB)(new moom.wE(p1, 3, __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_26(2954, (7174992737698287956L ^ local3_life2)), __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_28(7977, (6030187513364514296L ^ local3_life2))))))));

    local6_life31 = 0;

    local5_life32 = __sourceSpill748_24;

    init_cycle_92: while (true) {

    init_join_160: {

    init_join_159: {

    if (!((local6_life31 < 3))) {

        break init_join_162;

    }

    int __sourceSpill748_33 = 0;

    if (!((local5_life32 == null))) {

        __initValue748_163_0 = __sourceSpill748_33;

        break init_join_163;

    }

    local7_life34 = __sourceSpill748_33;

    init_cycle_99: while (true) {

    if (!((local7_life34 < __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_36(1848, (7631696284100763107L ^ local3_life2))))) {

        break init_join_159;

    }

    ((moom.wb)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), ((local7_life34 + (local6_life31 * __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_38(30338, (6345055322291465306L ^ local3_life2)))) + __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_40(30338, (6345055322291465306L ^ local3_life2))), (__sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_42(1450, (6903238264224030582L ^ local3_life2)) + (local7_life34 * __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_44(29241, (5021148992784754918L ^ local3_life2)))), (__sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_46(20354, (1940799298111821143L ^ local3_life2)) + (local6_life31 * __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_48(6713, (950259318160851168L ^ local3_life2))))))));

    local7_life34 += 1;

    if (!((local5_life32 == null))) {

        break init_join_160;

    }

    if (!((local5_life32 != null))) { continue init_cycle_99; }

    break init_cycle_99;

    }

    }

    local6_life31 += 1;

    }

    if (!((local5_life32 != null))) { continue init_cycle_92; }

    break init_cycle_92;

    }

    }

    __initValue748_163_0 = 0;

    }

    local6_life31 = __initValue748_163_0;

    init_cycle_164: while (true) {

    if (!((local6_life31 < __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_51(30338, (6345055322291465306L ^ local3_life2))))) {

        break init_join_200;

    }

    ((moom.wb)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), local6_life31, (__sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_53(22803, (7024240476634399683L ^ local3_life2)) + (local6_life31 * __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_55(6713, (950259318160851168L ^ local3_life2)))), __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_57(4915, (4839758758958959098L ^ local3_life2))))));

    local6_life31 += 1;

    if (!((local5_life32 != null))) { continue init_cycle_164; }

    break init_cycle_164;

    }

    }

    return;

}



static {
n = ((long)(((moom._a)(moom._c.a(((long)(-4438698511650286556L)), ((long)(859152163467424301L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257858078350037L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wb.n ^ 122435861188142L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1644_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1644_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1644_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1644_14 = new byte[8];
    (__sourceSpill1644_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1644_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1644_16 = __sourceSpill1644_14;
    ((javax.crypto.Cipher)(__sourceSpill1644_11)).init(((int)(__sourceSpill1644_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1644_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1644_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[20];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "éÈJW\f½ÐHAc½ÛQÁCäÊ}D©Î-eV\002¦eËíh\024óQ$)=\013ÛûJÚ\034\027=Ã#\037\022Ä´}©\000ãð\177\035pÛ9ßªNäµlÏm\033î:&\031ÐfáÇò1RB³;®u·¦^ø\017Ø<È¿S?5¦Z_+6`ñJ,\fÇÚ%jº\037Ç¨«\031\"d\034<ÃtÞW"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1644_25 = local6_life21;
        int __sourceSpill1644_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1644_25)).substring(((int)(__sourceSpill1644_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1644_30 = local8_life19;
        int __sourceSpill1644_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1644_33 = new byte[8];
        (__sourceSpill1644_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1644_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1644_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1644_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1644_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1644_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1644_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1644_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1644_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1644_34)).doFinal(((byte[])(__sourceSpill1644_33)));
        (__sourceSpill1644_30)[__sourceSpill1644_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "õ¦¿ªîC|!ñ;ï"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1644_38 = local6_life21;
        int __sourceSpill1644_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1644_38)).substring(((int)(__sourceSpill1644_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1644_43 = local8_life19;
        int __sourceSpill1644_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1644_46 = new byte[8];
        (__sourceSpill1644_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1644_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1644_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1644_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1644_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1644_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1644_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1644_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1644_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1644_47)).doFinal(((byte[])(__sourceSpill1644_46)));
        (__sourceSpill1644_43)[__sourceSpill1644_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[20]));
}

private static native <E extends Throwable> void __sourceConstructorInit_e9c10860695ae83b_0(moom.wb a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9570_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4537;
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
            throw new RuntimeException("moom/wb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wb.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.inventory.IInventory)(this.k)).a(((net.minecraft.entity.player.EntityPlayer)(p0))))) != 0);
}


public void a__Void() {
moom.wb lexicalValue1370_39_0;
    net.minecraft.entity.Entity[] spill1370_0;
    moom.wb spill1370_1;
    long life1_3;
    java.util.Iterator life4_10;
    net.minecraft.entity.Entity[] life3_11;
    net.minecraft.inventory.ICrafting life5_18;
    lexical_join_39: {
    lexical_join_38: {
    life1_3 = (moom.wb.n ^ 64293135610215L);
    spill1370_0 = moom.v8.b__Arrayr3();
    super.a__Void();
    life4_10 = ((java.util.List)(this.h)).iterator();
    life3_11 = spill1370_0;
    lexical_cycle_12: while (true) {
    lexical_join_36: {
    if (!(((java.util.Iterator)(life4_10)).hasNext())) {
        break lexical_join_38;
    }
    life5_18 = ((net.minecraft.inventory.ICrafting)(((java.util.Iterator)(life4_10)).next()));
    spill1370_1 = this;
    if (!((life3_11 == null))) {
        lexicalValue1370_39_0 = spill1370_1;
        break lexical_join_39;
    }
    if (!((((moom.wb)(spill1370_1)).m != __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(0)))))) {
        break lexical_join_36;
    }
    __sourceExactCall_65b387bcac2c28(((net.minecraft.inventory.ICrafting)(life5_18)), ((moom.v8)(this)), ((int)(0)), ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(0))))));
    }
    if (!((life3_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1370_39_0 = this;
    }
    ((moom.wb)(lexicalValue1370_39_0)).m = ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(0)))));
    return;
}


public void a(net.minecraft.inventory.ICrafting p0) {
super.a(((net.minecraft.inventory.ICrafting)(p0)));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((net.minecraft.inventory.IInventory)(this.k)));
    return;
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4392_19_0;
    moom.wB forwardValue4392_24_0;
    int forwardValue4392_39_0;
    int forwardValue4392_69_0;
    int forwardValue4392_84_0;
    int forwardValue4392_124_0;
    int forwardValue4392_124_1;
    int forwardValue4392_159_0;
    int forwardValue4392_174_0;
    int forwardValue4392_183_0;
    net.minecraft.entity.Entity[] spill4392_0;
    moom.wB spill4392_1;
    int spill4392_2;
    int spill4392_3;
    boolean spill4392_4;
    boolean spill4392_5;
    boolean spill4392_6;
    boolean spill4392_7;
    int spill4392_8;
    int spill4392_9;
    int spill4392_10;
    boolean spill4392_11;
    int spill4392_12;
    int spill4392_13;
    boolean spill4392_14;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    net.minecraft.entity.Entity[] life5_7;
    moom.wB life7_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_202: {
    forward_join_198: {
    forward_join_191: {
    forward_join_189: {
    forward_join_183: {
    forward_join_181: {
    forward_join_177: {
    forward_join_174: {
    forward_join_164: {
    forward_join_159: {
    forward_join_149: {
    forward_join_124: {
    forward_join_116: {
    forward_join_84: {
    forward_join_83: {
    forward_join_69: {
    forward_join_67: {
    forward_join_39: {
    forward_join_38: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wb.n ^ 130693687464603L);
    spill4392_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life5_7 = spill4392_0;
    life7_13 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    spill4392_1 = life7_13;
    if (!((life5_7 == null))) {
        forwardValue4392_19_0 = spill4392_1;
        break forward_join_19;
    }
    if (!((spill4392_1 != null))) {
        break forward_join_202;
    }
    forwardValue4392_19_0 = life7_13;
    }
    if (!((life5_7 == null))) {
        forwardValue4392_24_0 = forwardValue4392_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4392_19_0)).a__Boolean())) {
        break forward_join_202;
    }
    forwardValue4392_24_0 = life7_13;
    }
    life8_34 = ((moom.wB)(forwardValue4392_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4392_2 = p1;
    if (!((life5_7 == null))) {
        forwardValue4392_39_0 = spill4392_2;
        break forward_join_39;
    }
    if (!((spill4392_2 >= 0))) {
        break forward_join_38;
    }
    spill4392_3 = p1;
    if (!((life5_7 == null))) {
        forwardValue4392_174_0 = spill4392_3;
        break forward_join_174;
    }
    if (!((spill4392_3 > 2))) {
        break forward_join_164;
    }
    }
    forwardValue4392_39_0 = p1;
    }
    if (!((life5_7 == null))) {
        forwardValue4392_174_0 = forwardValue4392_39_0;
        break forward_join_174;
    }
    if (!((forwardValue4392_39_0 != 3))) {
        break forward_join_164;
    }
    spill4392_4 = ((moom.wB)(this.l)).a__Boolean();
    if (!((life5_7 == null))) {
        forwardValue4392_69_0 = ((spill4392_4) ? 1 : 0);
        break forward_join_69;
    }
    if (!((!spill4392_4))) {
        break forward_join_67;
    }
    spill4392_5 = ((moom.wB)(this.l)).a__Boolean(((net.minecraft.item.ItemStack)(life8_34)));
    if (!((life5_7 == null))) {
        forwardValue4392_69_0 = ((spill4392_5) ? 1 : 0);
        break forward_join_69;
    }
    if (!(spill4392_5)) {
        break forward_join_67;
    }
    spill4392_6 = ((moom.wb)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(3)), ((int)(4)), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4392_183_0 = ((spill4392_6) ? 1 : 0);
        break forward_join_183;
    }
    if (!((!spill4392_6))) {
        break forward_join_181;
    }
    return null;
    }
    forwardValue4392_69_0 = ((__sourceExactCall_65b5292fd5912d(((net.minecraft.item.ItemStack)(life6_6)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4392_84_0 = forwardValue4392_69_0;
        break forward_join_84;
    }
    if (!((forwardValue4392_69_0 != 0))) {
        break forward_join_83;
    }
    spill4392_7 = ((moom.wb)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(0)), ((int)(3)), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4392_183_0 = ((spill4392_7) ? 1 : 0);
        break forward_join_183;
    }
    if (!((!spill4392_7))) {
        break forward_join_181;
    }
    return null;
    }
    forwardValue4392_84_0 = p1;
    }
    spill4392_8 = 4;
    if (!((life5_7 == null))) {
        forwardValue4392_124_0 = forwardValue4392_84_0;
        forwardValue4392_124_1 = spill4392_8;
        break forward_join_124;
    }
    if (!((forwardValue4392_84_0 >= spill4392_8))) {
        break forward_join_116;
    }
    spill4392_9 = p1;
    spill4392_10 = __sourceIntrinsic_245d151687c8_invokedynamic4392_20(15757, (5480274102891079783L ^ life3_3));
    if (!((life5_7 == null))) {
        forwardValue4392_124_0 = spill4392_9;
        forwardValue4392_124_1 = spill4392_10;
        break forward_join_124;
    }
    if (!((spill4392_9 < spill4392_10))) {
        break forward_join_116;
    }
    spill4392_11 = ((moom.wb)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4392_21(7123, (254839148652318268L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4392_22(12851, (1161428684478244805L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4392_183_0 = ((spill4392_11) ? 1 : 0);
        break forward_join_183;
    }
    if (!((!spill4392_11))) {
        break forward_join_181;
    }
    return null;
    }
    spill4392_12 = p1;
    if (!((life5_7 == null))) {
        forwardValue4392_159_0 = spill4392_12;
        break forward_join_159;
    }
    forwardValue4392_124_0 = spill4392_12;
    forwardValue4392_124_1 = __sourceIntrinsic_245d151687c8_invokedynamic4392_25(7123, (254839148652318268L ^ life3_3));
    }
    if (!((forwardValue4392_124_0 >= forwardValue4392_124_1))) {
        break forward_join_149;
    }
    spill4392_13 = p1;
    if (!((life5_7 == null))) {
        forwardValue4392_159_0 = spill4392_13;
        break forward_join_159;
    }
    if (!((spill4392_13 < __sourceIntrinsic_245d151687c8_invokedynamic4392_26(29271, (2221790115036473251L ^ life3_3))))) {
        break forward_join_149;
    }
    spill4392_14 = ((moom.wb)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(4)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4392_27(7123, (254839148652318268L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_7 == null))) {
        forwardValue4392_183_0 = ((spill4392_14) ? 1 : 0);
        break forward_join_183;
    }
    if (!((!spill4392_14))) {
        break forward_join_181;
    }
    return null;
    }
    forwardValue4392_159_0 = ((((moom.wb)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(4)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4392_30(29271, (2221790115036473251L ^ life3_3)))), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_7 == null))) {
        forwardValue4392_183_0 = forwardValue4392_159_0;
        break forward_join_183;
    }
    if (!((forwardValue4392_159_0 == 0))) {
        break forward_join_181;
    }
    return null;
    }
    forwardValue4392_174_0 = ((((moom.wb)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(4)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4392_33(29271, (2221790115036473251L ^ life3_3)))), ((boolean)(true)))) ? 1 : 0);
    }
    if (!((forwardValue4392_174_0 == 0))) {
        break forward_join_177;
    }
    return null;
    }
    ((moom.wB)(life7_13)).a(((net.minecraft.item.ItemStack)(life8_34)), ((net.minecraft.item.ItemStack)(life6_6)));
    }
    forwardValue4392_183_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4392_183_0 == 0))) {
        break forward_join_189;
    }
    __sourceExactCall_b5392aba8737a5(((moom.wB)(life7_13)), ((net.minecraft.item.ItemStack)(null)));
    if (!((life5_7 != null))) {
        break forward_join_191;
    }
    }
    ((moom.wB)(life7_13)).a__Void();
    }
    if (!((((net.minecraft.item.ItemStack)(life8_34)).b == ((net.minecraft.item.ItemStack)(life6_6)).b))) {
        break forward_join_198;
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


public void a__Void(int p0, int p1) {
((net.minecraft.inventory.IInventory)(this.k)).a__Void(((int)(p0)), ((int)(p1)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9c10860695ae83b_originalDynamicSite748_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4392_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4392_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4392_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4392_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4392_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4392_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4392_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4392_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9570_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native boolean __sourceExactCall_65b5292fd5912d(net.minecraft.item.ItemStack p0);
private static native void __sourceExactCall_b5392aba8737a5(moom.wB p0, net.minecraft.item.ItemStack p1);

private static native int __sourceExactCall_cdf7df5ac5b665(net.minecraft.inventory.IInventory p0, int p1);
private static native void __sourceExactCall_65b387bcac2c28(net.minecraft.inventory.ICrafting p0, moom.v8 p1, int p2, int p3);
}
