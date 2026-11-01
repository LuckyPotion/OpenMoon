package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class yf extends moom.ye {

private static long g;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public yf() { super(0, 0, (net.minecraft.item.ItemStack[])null, (net.minecraft.item.ItemStack)null); __sourceHandlerCall_f6e2b93d03aec6965552(this); }


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-3307127703769239655L)), ((long)(-6461750338960108060L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(110341999518809L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.yf.g ^ 125376413685158L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1711_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1711_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1711_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1711_14 = new byte[8];
    (__sourceSpill1711_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1711_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1711_16 = __sourceSpill1711_14;
    ((javax.crypto.Cipher)(__sourceSpill1711_11)).init(((int)(__sourceSpill1711_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1711_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1711_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ó\037²Nµì0ù>©\023YÄ<6E$é\017Ù\007£"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1711_25 = local6_life21;
        int __sourceSpill1711_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1711_25)).substring(((int)(__sourceSpill1711_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1711_30 = local8_life19;
        int __sourceSpill1711_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1711_33 = new byte[8];
        (__sourceSpill1711_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1711_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1711_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1711_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1711_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1711_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1711_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1711_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1711_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1711_34)).doFinal(((byte[])(__sourceSpill1711_33)));
        (__sourceSpill1711_30)[__sourceSpill1711_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ýñú{~\026ð)ÿ\036ÀõO"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1711_38 = local6_life21;
        int __sourceSpill1711_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1711_38)).substring(((int)(__sourceSpill1711_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1711_43 = local8_life19;
        int __sourceSpill1711_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1711_46 = new byte[8];
        (__sourceSpill1711_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1711_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1711_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1711_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1711_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1711_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1711_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1711_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1711_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1711_47)).doFinal(((byte[])(__sourceSpill1711_46)));
        (__sourceSpill1711_43)[__sourceSpill1711_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceHandlerCall_f6e2b93d03aec6965552(moom.yf a0) throws E;
private static final class __SourceHandler_f6e2b93d03aec6965552 {

public static void f513(moom.yf receiver) throws Throwable {
    moom.yf spill513_0;
    int spill513_1;
    int spill513_2;
    net.minecraft.item.ItemStack[] spill513_3;
    net.minecraft.item.ItemStack[] spill513_4;
    net.minecraft.item.ItemStack[] spill513_5;
    net.minecraft.item.ItemStack[] spill513_6;
    net.minecraft.item.ItemStack[] spill513_7;
    net.minecraft.item.ItemStack[] spill513_8;
    net.minecraft.item.ItemStack[] spill513_9;
    net.minecraft.item.ItemStack[] spill513_10;
    net.minecraft.item.ItemStack[] spill513_11;
    long life1_3;
    life1_3 = (__fieldRead513_0() ^ 49585119726753L);
    spill513_0 = receiver;
    spill513_1 = 3;
    spill513_2 = 3;
    net.minecraft.item.ItemStack[] __stackOp513_2_0 = new net.minecraft.item.ItemStack[__invokedynamic513_1(17368, (3605635743584785550L ^ life1_3))];
    spill513_3 = __stackOp513_2_0;
    (__stackOp513_2_0)[0] = new net.minecraft.item.ItemStack(__fieldRead513_3());
    net.minecraft.item.ItemStack[] __stackOp513_4_0 = spill513_3;
    spill513_4 = __stackOp513_4_0;
    (__stackOp513_4_0)[1] = new net.minecraft.item.ItemStack(__fieldRead513_5());
    net.minecraft.item.ItemStack[] __stackOp513_6_0 = spill513_4;
    spill513_5 = __stackOp513_6_0;
    (__stackOp513_6_0)[2] = new net.minecraft.item.ItemStack(__fieldRead513_7());
    net.minecraft.item.ItemStack[] __stackOp513_8_0 = spill513_5;
    spill513_6 = __stackOp513_8_0;
    (__stackOp513_8_0)[3] = new net.minecraft.item.ItemStack(__fieldRead513_9());
    net.minecraft.item.ItemStack[] __stackOp513_10_0 = spill513_6;
    spill513_7 = __stackOp513_10_0;
    (__stackOp513_10_0)[4] = new net.minecraft.item.ItemStack(__fieldRead513_11(), 0, __invokedynamic513_12(2913, (1013040977885944886L ^ life1_3)));
    net.minecraft.item.ItemStack[] __stackOp513_13_0 = spill513_7;
    spill513_8 = __stackOp513_13_0;
    (__stackOp513_13_0)[5] = new net.minecraft.item.ItemStack(__fieldRead513_14());
    net.minecraft.item.ItemStack[] __stackOp513_15_0 = spill513_8;
    spill513_9 = __stackOp513_15_0;
    (__stackOp513_15_0)[__invokedynamic513_16(7412, (2757874753104333728L ^ life1_3))] = new net.minecraft.item.ItemStack(__fieldRead513_17());
    net.minecraft.item.ItemStack[] __stackOp513_18_0 = spill513_9;
    spill513_10 = __stackOp513_18_0;
    (__stackOp513_18_0)[__invokedynamic513_19(4497, (6336621037907592900L ^ life1_3))] = new net.minecraft.item.ItemStack(__fieldRead513_20());
    net.minecraft.item.ItemStack[] __stackOp513_21_0 = spill513_10;
    spill513_11 = __stackOp513_21_0;
    (__stackOp513_21_0)[__invokedynamic513_22(29926, (111805285357822900L ^ life1_3))] = new net.minecraft.item.ItemStack(__fieldRead513_23());
    __directSuperInit513_25(spill513_0, spill513_1, spill513_2, spill513_11, new net.minecraft.item.ItemStack(__fieldRead513_24(), 0, 0));
    return;
}
private static native long __fieldRead513_0() throws Throwable;
private static native int __invokedynamic513_1(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __fieldRead513_3() throws Throwable;
private static native net.minecraft.item.Item __fieldRead513_5() throws Throwable;
private static native net.minecraft.item.Item __fieldRead513_7() throws Throwable;
private static native net.minecraft.item.Item __fieldRead513_9() throws Throwable;
private static native moom.xA __fieldRead513_11() throws Throwable;
private static native int __invokedynamic513_12(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __fieldRead513_14() throws Throwable;
private static native int __invokedynamic513_16(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __fieldRead513_17() throws Throwable;
private static native int __invokedynamic513_19(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __fieldRead513_20() throws Throwable;
private static native int __invokedynamic513_22(int a0, long a1) throws Throwable;
private static native net.minecraft.item.Item __fieldRead513_23() throws Throwable;
private static native moom.xz __fieldRead513_24() throws Throwable;
private static native void __directSuperInit513_25(moom.yf a0, int a1, int a2, net.minecraft.item.ItemStack[] a3, net.minecraft.item.ItemStack a4) throws Throwable;

}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9817_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.yf.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8326;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/yf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
int lexicalValue1433_14_0;
    net.minecraft.item.ItemStack lexicalValue1433_44_0;
    net.minecraft.item.ItemStack lexicalValue1433_49_0;
    net.minecraft.world.storage.MapData lexicalValue1433_62_0;
    int lexicalValue1433_68_0;
    int lexicalValue1433_70_0;
    boolean spill1433_0;
    net.minecraft.item.ItemStack spill1433_1;
    net.minecraft.item.ItemStack spill1433_2;
    net.minecraft.world.storage.MapData spill1433_3;
    byte spill1433_4;
    long life3_3;
    java.lang.String life5_5;
    net.minecraft.item.ItemStack life6_19;
    int life7_21;
    net.minecraft.item.ItemStack life8_41;
    net.minecraft.world.storage.MapData life7_79;
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_62: {
    lexical_join_52: {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_15: {
    lexical_join_14: {
    life3_3 = (moom.yf.g ^ 57949675818445L);
    life5_5 = moom.ye.b();
    spill1433_0 = super.a(((moom.wx)(p0)), ((net.minecraft.world.World)(p1)));
    if (!((life5_5 == null))) {
        lexicalValue1433_14_0 = ((spill1433_0) ? 1 : 0);
        break lexical_join_14;
    }
    if (!((!spill1433_0))) {
        break lexical_join_15;
    }
    lexicalValue1433_14_0 = 0;
    }
    return ((lexicalValue1433_14_0) != 0);
    }
    life6_19 = null;
    life7_21 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_44: {
    if (!((life7_21 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_48;
    }
    spill1433_1 = life6_19;
    if (!((life5_5 == null))) {
        lexicalValue1433_49_0 = spill1433_1;
        break lexical_join_49;
    }
    if (!((life5_5 == null))) {
        lexicalValue1433_49_0 = spill1433_1;
        break lexical_join_49;
    }
    if (!((spill1433_1 == null))) {
        break lexical_join_48;
    }
    life8_41 = ((moom.wx)(p0)).a__xW(((int)(life7_21)));
    if (!((life5_5 == null))) {
        break lexical_join_46;
    }
    if (!((life8_41 != null))) {
        break lexical_join_45;
    }
    spill1433_2 = life8_41;
    if (!((life5_5 == null))) {
        lexicalValue1433_44_0 = spill1433_2;
        break lexical_join_44;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1433_2)).a__wQ() == net.minecraft.init.Items.a3))) {
        break lexical_join_45;
    }
    lexicalValue1433_44_0 = life8_41;
    }
    life6_19 = lexicalValue1433_44_0;
    }
    life7_21 += 1;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1433_49_0 = life6_19;
    }
    if (!((lexicalValue1433_49_0 == null))) {
        break lexical_join_52;
    }
    return ((0) != 0);
    }
    life7_79 = ((moom.xA)(net.minecraft.init.Items.a3)).a(((net.minecraft.item.ItemStack)(life6_19)), ((net.minecraft.world.World)(p1)));
    spill1433_3 = life7_79;
    if (!((life5_5 == null))) {
        lexicalValue1433_62_0 = spill1433_3;
        break lexical_join_62;
    }
    if (!((spill1433_3 != null))) {
        break lexical_join_69;
    }
    lexicalValue1433_62_0 = life7_79;
    }
    spill1433_4 = ((net.minecraft.world.storage.MapData)(lexicalValue1433_62_0)).f;
    if (!((life5_5 == null))) {
        lexicalValue1433_68_0 = ((int)(spill1433_4));
        break lexical_join_68;
    }
    if (!((spill1433_4 < 4))) {
        break lexical_join_69;
    }
    lexicalValue1433_68_0 = 1;
    }
    lexicalValue1433_70_0 = lexicalValue1433_68_0;
    break lexical_join_70;
    }
    lexicalValue1433_70_0 = 0;
    }
    return ((lexicalValue1433_70_0) != 0);
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
net.minecraft.item.ItemStack lexicalValue1434_35_0;
    net.minecraft.item.ItemStack lexicalValue1434_46_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1434_57_0;
    net.minecraft.item.ItemStack lexicalValue1434_65_0;
    java.lang.String spill1434_0;
    net.minecraft.item.ItemStack spill1434_1;
    net.minecraft.item.ItemStack spill1434_2;
    net.minecraft.nbt.NBTTagCompound spill1434_3;
    net.minecraft.item.ItemStack spill1434_4;
    long life2_3;
    net.minecraft.item.ItemStack life5_5;
    int life6_8;
    java.lang.String life4_9;
    net.minecraft.item.ItemStack life7_29;
    lexical_join_65: {
    lexical_join_57: {
    lexical_join_55: {
    lexical_join_46: {
    lexical_join_39: {
    life2_3 = (moom.yf.g ^ 87106300792342L);
    life5_5 = null;
    spill1434_0 = moom.ye.b();
    life6_8 = 0;
    life4_9 = spill1434_0;
    lexical_cycle_10: while (true) {
    lexical_join_37: {
    lexical_join_36: {
    lexical_join_35: {
    if (!((life6_8 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_39;
    }
    spill1434_1 = life5_5;
    if (!((life4_9 == null))) {
        lexicalValue1434_46_0 = spill1434_1;
        break lexical_join_46;
    }
    if (!((life4_9 == null))) {
        lexicalValue1434_46_0 = spill1434_1;
        break lexical_join_46;
    }
    if (!((spill1434_1 == null))) {
        break lexical_join_39;
    }
    life7_29 = ((moom.wx)(p0)).a__xW(((int)(life6_8)));
    if (!((life4_9 == null))) {
        break lexical_join_37;
    }
    if (!((life7_29 != null))) {
        break lexical_join_36;
    }
    spill1434_2 = life7_29;
    if (!((life4_9 == null))) {
        lexicalValue1434_35_0 = spill1434_2;
        break lexical_join_35;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1434_2)).a__wQ() == net.minecraft.init.Items.a3))) {
        break lexical_join_36;
    }
    lexicalValue1434_35_0 = life7_29;
    }
    life5_5 = lexicalValue1434_35_0;
    }
    life6_8 += 1;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    life5_5 = ((net.minecraft.item.ItemStack)(life5_5)).a__xW();
    ((net.minecraft.item.ItemStack)(life5_5)).b = ((int)(1));
    lexicalValue1434_46_0 = life5_5;
    }
    spill1434_3 = ((net.minecraft.item.ItemStack)(lexicalValue1434_46_0)).a__yw();
    if (!((life4_9 == null))) {
        lexicalValue1434_57_0 = spill1434_3;
        break lexical_join_57;
    }
    if (!((spill1434_3 == null))) {
        break lexical_join_55;
    }
    ((net.minecraft.item.ItemStack)(life5_5)).b(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound())));
    }
    lexicalValue1434_57_0 = ((net.minecraft.item.ItemStack)(life5_5)).a__yw();
    }
    ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1434_57_0)).a(((java.lang.String)("map_is_scaling")), ((boolean)(true)));
    spill1434_4 = life5_5;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue1434_65_0 = spill1434_4;
        break lexical_join_65;
    }
    moom.ye.b(((java.lang.String)("krWxG")));
    lexicalValue1434_65_0 = spill1434_4;
    }
    return lexicalValue1434_65_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_7ddff02174cc_invokedynamic513_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ddff02174cc_invokedynamic513_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ddff02174cc_invokedynamic513_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ddff02174cc_invokedynamic513_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ddff02174cc_invokedynamic513_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9817_0() throws E;
}
