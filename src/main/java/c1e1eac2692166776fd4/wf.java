package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wf extends moom.v8 {

private net.minecraft.inventory.IInventory k;

private int l;

private int m;

private int n;

private int o;

private static long p;

private static long[] q;

private static java.lang.Integer[] r;

private static java.util.Map s;

public wf(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1) { super(); }


private static void __sourceConstructorBody_50e96a3a2a73cb74(moom.wf receiver, net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1) throws Throwable {

int __initValue752_140_0;

    long local3_life2;

    int local6_life23;

    net.minecraft.entity.Entity[] local5_life24;

    int local7_life26;

    init_join_177: {

    init_join_140: {

    init_join_139: {

    local3_life2 = (moom.wf.p ^ 7161664626130L);

    net.minecraft.entity.Entity[] __sourceSpill752_4 = moom.v8.b__Arrayr3();

    moom.wf.__sourceConstructorInit_50e96a3a2a73cb74_0(((moom.wf)(receiver)));

    ((moom.wf)(receiver)).k = ((net.minecraft.inventory.IInventory)(p1));

    ((moom.wf)(receiver)).a(((moom.wB)(new moom.wB(p1, 0, __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_8(1247, (4438448633614088028L ^ local3_life2)), __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_10(7170, (3913649515090685824L ^ local3_life2))))));

    ((moom.wf)(receiver)).a(((moom.wB)(new moom.wN(p1, 1, __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_13(24168, (5546296345083702768L ^ local3_life2)), __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_15(28759, (5046660923875247058L ^ local3_life2))))));

    ((moom.wf)(receiver)).a(((moom.wB)(new moom.wO(((net.minecraft.entity.player.InventoryPlayer)(p0)).d, p1, 2, __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_19(16962, (6590487712618443204L ^ local3_life2)), __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_21(29091, (2499517571897246250L ^ local3_life2))))));

    local6_life23 = 0;

    local5_life24 = __sourceSpill752_4;

    init_cycle_69: while (true) {

    init_join_137: {

    init_join_136: {

    if (!((local6_life23 < 3))) {

        break init_join_139;

    }

    int __sourceSpill752_25 = 0;

    if (!((local5_life24 == null))) {

        __initValue752_140_0 = __sourceSpill752_25;

        break init_join_140;

    }

    local7_life26 = __sourceSpill752_25;

    init_cycle_76: while (true) {

    if (!((local7_life26 < __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_28(25943, (3626419036359186131L ^ local3_life2))))) {

        break init_join_136;

    }

    ((moom.wf)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), ((local7_life26 + (local6_life23 * __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_30(18866, (8573551066498890301L ^ local3_life2)))) + __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_32(18866, (8573551066498890301L ^ local3_life2))), (__sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_34(18793, (2429260292037933797L ^ local3_life2)) + (local7_life26 * __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_36(9971, (1137411238516331899L ^ local3_life2)))), (__sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_38(25485, (3862481349915627526L ^ local3_life2)) + (local6_life23 * __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_40(29989, (8329398501915903656L ^ local3_life2))))))));

    local7_life26 += 1;

    if (!((local5_life24 == null))) {

        break init_join_137;

    }

    if (!((local5_life24 != null))) { continue init_cycle_76; }

    break init_cycle_76;

    }

    }

    local6_life23 += 1;

    }

    if (!((local5_life24 != null))) { continue init_cycle_69; }

    break init_cycle_69;

    }

    }

    __initValue752_140_0 = 0;

    }

    local6_life23 = __initValue752_140_0;

    init_cycle_141: while (true) {

    if (!((local6_life23 < __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_43(18866, (8573551066498890301L ^ local3_life2))))) {

        break init_join_177;

    }

    ((moom.wf)(receiver)).a(((moom.wB)(new moom.wB(((net.minecraft.inventory.IInventory) p0), local6_life23, (__sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_45(19331, (1008498608366811139L ^ local3_life2)) + (local6_life23 * __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_47(29989, (8329398501915903656L ^ local3_life2)))), __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_49(3545, (3352605752279285335L ^ local3_life2))))));

    local6_life23 += 1;

    if (!((local5_life24 != null))) { continue init_cycle_141; }

    break init_cycle_141;

    }

    }

    return;

}



static {
p = ((long)(((moom._a)(moom._c.a(((long)(1956501649013787438L)), ((long)(5649369819107439885L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(8232869094483L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wf.p ^ 37069426454659L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1648_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1648_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1648_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1648_14 = new byte[8];
    (__sourceSpill1648_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1648_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1648_16 = __sourceSpill1648_14;
    ((javax.crypto.Cipher)(__sourceSpill1648_11)).init(((int)(__sourceSpill1648_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1648_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1648_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[18];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¢×KäÒ\004\177èâÅh\000|rðÌØÞ.²<\033*w??H'æptè\025þù\\ªçSÊánª²ßL\005\001¯\007WéW$s6^C´+Oh_}\177 !ôK@¢¶>Ì\033çéI/»Q¡Mû¬9;CÈ>\013)H/\027|H·ÎGEÑÁÀ["))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1648_25 = local6_life21;
        int __sourceSpill1648_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1648_25)).substring(((int)(__sourceSpill1648_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1648_30 = local8_life19;
        int __sourceSpill1648_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1648_33 = new byte[8];
        (__sourceSpill1648_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1648_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1648_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1648_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1648_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1648_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1648_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1648_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1648_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1648_34)).doFinal(((byte[])(__sourceSpill1648_33)));
        (__sourceSpill1648_30)[__sourceSpill1648_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "0\025¢kb­V\rs¤)ÊmÛ<"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1648_38 = local6_life21;
        int __sourceSpill1648_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1648_38)).substring(((int)(__sourceSpill1648_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1648_43 = local8_life19;
        int __sourceSpill1648_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1648_46 = new byte[8];
        (__sourceSpill1648_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1648_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1648_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1648_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1648_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1648_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1648_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1648_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1648_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1648_47)).doFinal(((byte[])(__sourceSpill1648_46)));
        (__sourceSpill1648_43)[__sourceSpill1648_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[18]));
}

private static native <E extends Throwable> void __sourceConstructorInit_50e96a3a2a73cb74_0(moom.wf a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9587_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14976;
      if (r[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wf.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b(net.minecraft.entity.player.EntityPlayer p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.inventory.IInventory)(this.k)).a(((net.minecraft.entity.player.EntityPlayer)(p0))))) != 0);
}


public void a__Void() {
int lexicalValue1375_44_0;
    int lexicalValue1375_44_1;
    int lexicalValue1375_61_0;
    int lexicalValue1375_61_1;
    int lexicalValue1375_78_0;
    int lexicalValue1375_78_1;
    moom.wf lexicalValue1375_108_0;
    net.minecraft.entity.Entity[] spill1375_0;
    moom.wf spill1375_1;
    int spill1375_2;
    int spill1375_3;
    long life1_3;
    java.util.Iterator life4_10;
    net.minecraft.entity.Entity[] life3_11;
    net.minecraft.inventory.ICrafting life5_18;
    lexical_join_108: {
    lexical_join_89: {
    life1_3 = (moom.wf.p ^ 38995568636792L);
    spill1375_0 = moom.v8.b__Arrayr3();
    super.a__Void();
    life4_10 = ((java.util.List)(this.h)).iterator();
    life3_11 = spill1375_0;
    lexical_cycle_12: while (true) {
    lexical_join_87: {
    lexical_join_78: {
    lexical_join_72: {
    lexical_join_61: {
    lexical_join_55: {
    lexical_join_44: {
    lexical_join_38: {
    if (!(((java.util.Iterator)(life4_10)).hasNext())) {
        break lexical_join_89;
    }
    life5_18 = ((net.minecraft.inventory.ICrafting)(((java.util.Iterator)(life4_10)).next()));
    spill1375_1 = this;
    if (!((life3_11 == null))) {
        lexicalValue1375_108_0 = spill1375_1;
        break lexical_join_108;
    }
    spill1375_2 = ((moom.wf)(spill1375_1)).l;
    spill1375_3 = __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(2)));
    if (!((life3_11 == null))) {
        lexicalValue1375_44_0 = spill1375_2;
        lexicalValue1375_44_1 = spill1375_3;
        break lexical_join_44;
    }
    if (!((spill1375_2 != spill1375_3))) {
        break lexical_join_38;
    }
    __sourceExactCall_65b387bcac2c28(((net.minecraft.inventory.ICrafting)(life5_18)), ((moom.v8)(this)), ((int)(2)), ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(2))))));
    }
    lexicalValue1375_44_0 = this.n;
    lexicalValue1375_44_1 = __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(0)));
    }
    if (!((life3_11 == null))) {
        lexicalValue1375_61_0 = lexicalValue1375_44_0;
        lexicalValue1375_61_1 = lexicalValue1375_44_1;
        break lexical_join_61;
    }
    if (!((lexicalValue1375_44_0 != lexicalValue1375_44_1))) {
        break lexical_join_55;
    }
    __sourceExactCall_65b387bcac2c28(((net.minecraft.inventory.ICrafting)(life5_18)), ((moom.v8)(this)), ((int)(0)), ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(0))))));
    }
    lexicalValue1375_61_0 = this.o;
    lexicalValue1375_61_1 = __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(1)));
    }
    if (!((life3_11 == null))) {
        lexicalValue1375_78_0 = lexicalValue1375_61_0;
        lexicalValue1375_78_1 = lexicalValue1375_61_1;
        break lexical_join_78;
    }
    if (!((lexicalValue1375_61_0 != lexicalValue1375_61_1))) {
        break lexical_join_72;
    }
    __sourceExactCall_65b387bcac2c28(((net.minecraft.inventory.ICrafting)(life5_18)), ((moom.v8)(this)), ((int)(1)), ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(1))))));
    }
    lexicalValue1375_78_0 = this.m;
    lexicalValue1375_78_1 = __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(3)));
    }
    if (!((lexicalValue1375_78_0 != lexicalValue1375_78_1))) {
        break lexical_join_87;
    }
    __sourceExactCall_65b387bcac2c28(((net.minecraft.inventory.ICrafting)(life5_18)), ((moom.v8)(this)), ((int)(3)), ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(3))))));
    }
    if (!((life3_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    this.l = ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(2)))));
    this.n = ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(0)))));
    this.o = ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(1)))));
    lexicalValue1375_108_0 = this;
    }
    ((moom.wf)(lexicalValue1375_108_0)).m = ((int)(__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.k)), ((int)(3)))));
    return;
}


public void a(net.minecraft.inventory.ICrafting p0) {
super.a(((net.minecraft.inventory.ICrafting)(p0)));
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((net.minecraft.inventory.IInventory)(this.k)));
    return;
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4405_19_0;
    moom.wB forwardValue4405_24_0;
    int forwardValue4405_57_0;
    int forwardValue4405_57_1;
    net.minecraft.item.ItemStack forwardValue4405_80_0;
    int forwardValue4405_96_0;
    int forwardValue4405_136_0;
    int forwardValue4405_136_1;
    int forwardValue4405_171_0;
    int forwardValue4405_178_0;
    net.minecraft.entity.Entity[] spill4405_0;
    moom.wB spill4405_1;
    int spill4405_2;
    int spill4405_3;
    int spill4405_4;
    int spill4405_5;
    net.minecraft.item.ItemStack spill4405_6;
    boolean spill4405_7;
    boolean spill4405_8;
    boolean spill4405_9;
    int spill4405_10;
    int spill4405_11;
    int spill4405_12;
    boolean spill4405_13;
    int spill4405_14;
    int spill4405_15;
    boolean spill4405_16;
    long life3_3;
    net.minecraft.item.ItemStack life6_6;
    moom.wB life7_12;
    net.minecraft.entity.Entity[] life5_13;
    net.minecraft.item.ItemStack life8_34;
    forward_join_197: {
    forward_join_193: {
    forward_join_186: {
    forward_join_184: {
    forward_join_178: {
    forward_join_176: {
    forward_join_171: {
    forward_join_161: {
    forward_join_136: {
    forward_join_128: {
    forward_join_96: {
    forward_join_95: {
    forward_join_80: {
    forward_join_79: {
    forward_join_57: {
    forward_join_53: {
    forward_join_47: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (moom.wf.p ^ 122953275969668L);
    spill4405_0 = moom.v8.b__Arrayr3();
    life6_6 = null;
    life7_12 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    life5_13 = spill4405_0;
    spill4405_1 = life7_12;
    if (!((life5_13 == null))) {
        forwardValue4405_19_0 = spill4405_1;
        break forward_join_19;
    }
    if (!((spill4405_1 != null))) {
        break forward_join_197;
    }
    forwardValue4405_19_0 = life7_12;
    }
    if (!((life5_13 == null))) {
        forwardValue4405_24_0 = forwardValue4405_19_0;
        break forward_join_24;
    }
    if (!(((moom.wB)(forwardValue4405_19_0)).a__Boolean())) {
        break forward_join_197;
    }
    forwardValue4405_24_0 = life7_12;
    }
    life8_34 = ((moom.wB)(forwardValue4405_24_0)).a__xW();
    life6_6 = ((net.minecraft.item.ItemStack)(life8_34)).a__xW();
    spill4405_2 = p1;
    spill4405_3 = 2;
    if (!((life5_13 == null))) {
        forwardValue4405_57_0 = spill4405_2;
        forwardValue4405_57_1 = spill4405_3;
        break forward_join_57;
    }
    if (!((spill4405_2 == spill4405_3))) {
        break forward_join_53;
    }
    if (!((!((moom.wf)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(3)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4405_8(7986, (8809707995924586981L ^ life3_3)))), ((boolean)(true)))))) {
        break forward_join_47;
    }
    return null;
    }
    ((moom.wB)(life7_12)).a(((net.minecraft.item.ItemStack)(life8_34)), ((net.minecraft.item.ItemStack)(life6_6)));
    if (!((life5_13 != null))) {
        break forward_join_176;
    }
    }
    spill4405_4 = p1;
    if (!((life5_13 == null))) {
        forwardValue4405_171_0 = spill4405_4;
        break forward_join_171;
    }
    forwardValue4405_57_0 = spill4405_4;
    forwardValue4405_57_1 = 1;
    }
    if (!((forwardValue4405_57_0 != forwardValue4405_57_1))) {
        break forward_join_161;
    }
    spill4405_5 = p1;
    if (!((life5_13 == null))) {
        forwardValue4405_171_0 = spill4405_5;
        break forward_join_171;
    }
    if (!((spill4405_5 != 0))) {
        break forward_join_161;
    }
    spill4405_6 = ((moom.xY)(moom.xY.a__xY())).a__xW(((net.minecraft.item.ItemStack)(life8_34)));
    if (!((life5_13 == null))) {
        forwardValue4405_80_0 = spill4405_6;
        break forward_join_80;
    }
    if (!((spill4405_6 != null))) {
        break forward_join_79;
    }
    spill4405_7 = ((moom.wf)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(0)), ((int)(1)), ((boolean)(false)));
    if (!((life5_13 == null))) {
        forwardValue4405_178_0 = ((spill4405_7) ? 1 : 0);
        break forward_join_178;
    }
    if (!((!spill4405_7))) {
        break forward_join_176;
    }
    return null;
    }
    forwardValue4405_80_0 = life8_34;
    }
    spill4405_8 = net.minecraft.tileentity.TileEntityFurnace.a__Boolean(((net.minecraft.item.ItemStack)(forwardValue4405_80_0)));
    if (!((life5_13 == null))) {
        forwardValue4405_96_0 = ((spill4405_8) ? 1 : 0);
        break forward_join_96;
    }
    if (!(spill4405_8)) {
        break forward_join_95;
    }
    spill4405_9 = ((moom.wf)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(1)), ((int)(2)), ((boolean)(false)));
    if (!((life5_13 == null))) {
        forwardValue4405_178_0 = ((spill4405_9) ? 1 : 0);
        break forward_join_178;
    }
    if (!((!spill4405_9))) {
        break forward_join_176;
    }
    return null;
    }
    forwardValue4405_96_0 = p1;
    }
    spill4405_10 = 3;
    if (!((life5_13 == null))) {
        forwardValue4405_136_0 = forwardValue4405_96_0;
        forwardValue4405_136_1 = spill4405_10;
        break forward_join_136;
    }
    if (!((forwardValue4405_96_0 >= spill4405_10))) {
        break forward_join_128;
    }
    spill4405_11 = p1;
    spill4405_12 = __sourceIntrinsic_245d151687c8_invokedynamic4405_19(9164, (7330244955619581213L ^ life3_3));
    if (!((life5_13 == null))) {
        forwardValue4405_136_0 = spill4405_11;
        forwardValue4405_136_1 = spill4405_12;
        break forward_join_136;
    }
    if (!((spill4405_11 < spill4405_12))) {
        break forward_join_128;
    }
    spill4405_13 = ((moom.wf)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4405_20(7686, (5067831295717597385L ^ life3_3)))), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4405_21(29203, (3811812991757552847L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_13 == null))) {
        forwardValue4405_178_0 = ((spill4405_13) ? 1 : 0);
        break forward_join_178;
    }
    if (!((!spill4405_13))) {
        break forward_join_176;
    }
    return null;
    }
    spill4405_14 = p1;
    if (!((life5_13 == null))) {
        forwardValue4405_178_0 = spill4405_14;
        break forward_join_178;
    }
    forwardValue4405_136_0 = spill4405_14;
    forwardValue4405_136_1 = __sourceIntrinsic_245d151687c8_invokedynamic4405_24(7686, (5067831295717597385L ^ life3_3));
    }
    if (!((forwardValue4405_136_0 >= forwardValue4405_136_1))) {
        break forward_join_176;
    }
    spill4405_15 = p1;
    if (!((life5_13 == null))) {
        forwardValue4405_178_0 = spill4405_15;
        break forward_join_178;
    }
    if (!((spill4405_15 < __sourceIntrinsic_245d151687c8_invokedynamic4405_25(29203, (3811812991757552847L ^ life3_3))))) {
        break forward_join_176;
    }
    spill4405_16 = ((moom.wf)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(3)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4405_26(7686, (5067831295717597385L ^ life3_3)))), ((boolean)(false)));
    if (!((life5_13 == null))) {
        forwardValue4405_178_0 = ((spill4405_16) ? 1 : 0);
        break forward_join_178;
    }
    if (!((!spill4405_16))) {
        break forward_join_176;
    }
    return null;
    }
    forwardValue4405_171_0 = ((((moom.wf)(this)).a(((net.minecraft.item.ItemStack)(life8_34)), ((int)(3)), ((int)(__sourceIntrinsic_245d151687c8_invokedynamic4405_29(29203, (3811812991757552847L ^ life3_3)))), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life5_13 == null))) {
        forwardValue4405_178_0 = forwardValue4405_171_0;
        break forward_join_178;
    }
    if (!((forwardValue4405_171_0 == 0))) {
        break forward_join_176;
    }
    return null;
    }
    forwardValue4405_178_0 = ((net.minecraft.item.ItemStack)(life8_34)).b;
    }
    if (!((forwardValue4405_178_0 == 0))) {
        break forward_join_184;
    }
    ((moom.wB)(life7_12)).b(((net.minecraft.item.ItemStack)(null)));
    if (!((life5_13 != null))) {
        break forward_join_186;
    }
    }
    ((moom.wB)(life7_12)).a__Void();
    }
    if (!((((net.minecraft.item.ItemStack)(life8_34)).b == ((net.minecraft.item.ItemStack)(life6_6)).b))) {
        break forward_join_193;
    }
    return null;
    }
    ((moom.wB)(life7_12)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life8_34)));
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


private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50e96a3a2a73cb74_originalDynamicSite752_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4405_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4405_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4405_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4405_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4405_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4405_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4405_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_245d151687c8_invokedynamic4405_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9587_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_cdf7df5ac5b665(net.minecraft.inventory.IInventory p0, int p1);
private static native void __sourceExactCall_65b387bcac2c28(net.minecraft.inventory.ICrafting p0, moom.v8 p1, int p2, int p3);
}
