package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tC extends net.minecraft.entity.item.EntityMinecart {

private moom.qV aQ;

private int aR;

private static long bb;

private static long[] db;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

public tC(net.minecraft.world.World p0) {
super(p0);
    this.aQ = new moom.qW(this);
    this.aR = 0;
}


public tC(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
    this.aQ = new moom.qW(this);
    this.aR = 0;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(674324448658921742L)), ((long)(7304958706009247845L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(182784126718078L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tC.bb ^ 122560418757755L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1551_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1551_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1551_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1551_14 = new byte[8];
    (__sourceSpill1551_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1551_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1551_16 = __sourceSpill1551_14;
    ((javax.crypto.Cipher)(__sourceSpill1551_11)).init(((int)(__sourceSpill1551_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1551_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1551_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Eâu*Éì\n¶!ÄQ\034DÁ²ú"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1551_25 = local6_life21;
        int __sourceSpill1551_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1551_25)).substring(((int)(__sourceSpill1551_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1551_30 = local8_life19;
        int __sourceSpill1551_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1551_33 = new byte[8];
        (__sourceSpill1551_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1551_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1551_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1551_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1551_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1551_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1551_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1551_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1551_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1551_34)).doFinal(((byte[])(__sourceSpill1551_33)));
        (__sourceSpill1551_30)[__sourceSpill1551_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "±hëózhj£á³\"ÕX\n"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1551_38 = local6_life21;
        int __sourceSpill1551_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1551_38)).substring(((int)(__sourceSpill1551_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1551_43 = local8_life19;
        int __sourceSpill1551_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1551_46 = new byte[8];
        (__sourceSpill1551_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1551_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1551_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1551_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1551_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1551_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1551_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1551_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1551_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1551_47)).doFinal(((byte[])(__sourceSpill1551_46)));
        (__sourceSpill1551_43)[__sourceSpill1551_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceHandlerCall_7e8bcc19acfb271f6030(moom.tC a0, int a1, int a2, int a3, boolean a4) throws E;
private static final class __SourceHandler_7e8bcc19acfb271f6030 {

public static void f1220(moom.tC receiver, int p0, int p1, int p2, boolean p3) throws Throwable {
    int forwardValue1220_17_0;
    moom.tC forwardValue1220_25_0;
    boolean spill1220_0;
    moom.tC spill1220_1;
    long life5_3;
    int life7_5;
    forward_join_28: {
    forward_join_25: {
    forward_join_17: {
    life5_3 = (__fieldRead1220_0() ^ 80371784662331L);
    life7_5 = __call1220_1();
    spill1220_0 = p3;
    if (!((life7_5 != 0))) {
        forwardValue1220_17_0 = __integerCategory1220_2(spill1220_0);
        break forward_join_17;
    }
    if (!(spill1220_0)) {
        break forward_join_28;
    }
    spill1220_1 = receiver;
    if (!((life7_5 != 0))) {
        forwardValue1220_25_0 = spill1220_1;
        break forward_join_25;
    }
    forwardValue1220_17_0 = (__fieldRead1220_3(spill1220_1) - __fieldRead1220_4(receiver));
    }
    if (!((forwardValue1220_17_0 >= 4))) {
        break forward_join_28;
    }
    __call1220_7(__call1220_5(receiver), __fieldRead1220_6(receiver));
    forwardValue1220_25_0 = receiver;
    }
    __fieldWrite1220_9(forwardValue1220_25_0, __fieldRead1220_8(receiver));
    }
    return;
}
public static void h1220_0(moom.Oo p0) throws Throwable {
    throw __call1122000_0(p0);
}
public static void h1220_1(moom.Oo p0) throws Throwable {
    throw __call1122001_0(p0);
}
public static void h1220_2(moom.Oo p0) throws Throwable {
    throw __call1122002_0(p0);
}
public static void h1220_3(moom.Oo p0) throws Throwable {
    throw __call1122003_0(p0);
}
private static native long __fieldRead1220_0() throws Throwable;
private static native int __call1220_1() throws Throwable;
private static native int __integerCategory1220_2(boolean value) throws Throwable;
private static native int __fieldRead1220_3(moom.tC a0) throws Throwable;
private static native int __fieldRead1220_4(moom.tC a0) throws Throwable;
private static native moom.qV __call1220_5(moom.tC a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1220_6(moom.tC a0) throws Throwable;
private static native void __call1220_7(moom.qV a0, net.minecraft.world.World a1) throws Throwable;
private static native int __fieldRead1220_8(moom.tC a0) throws Throwable;
private static native void __fieldWrite1220_9(moom.tC a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1122000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1122001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1122002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1122003_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a37e05ee80952999cb13(moom.tC a0, int a1) throws E;
private static final class __SourceHandler_a37e05ee80952999cb13 {

public static void f504(moom.tC receiver, int p0) throws Throwable {
    int forwardValue504_37_0;
    int forwardValue504_37_1;
    int spill504_0;
    int spill504_1;
    int spill504_2;
    long life2_3;
    int life4_8;
    forward_join_49: {
    forward_join_37: {
    forward_join_31: {
    life2_3 = (__fieldRead504_0() ^ 129952510723221L);
    spill504_0 = __call504_1();
    __call504_2(receiver, p0);
    life4_8 = spill504_0;
    spill504_1 = p0;
    spill504_2 = __invokedynamic504_3(21102, (82546291085258534L ^ life2_3));
    if (!((life4_8 == 0))) {
        forwardValue504_37_0 = spill504_1;
        forwardValue504_37_1 = spill504_2;
        break forward_join_37;
    }
    if (!((spill504_1 == spill504_2))) {
        break forward_join_31;
    }
    __call504_9(__fieldRead504_4(receiver), __call504_8(__call504_7(__call504_5(receiver), __invokedynamic504_6(21102, (82546291085258534L ^ life2_3)))));
    break forward_join_49;
    }
    forwardValue504_37_0 = p0;
    forwardValue504_37_1 = __invokedynamic504_10(29020, (2228231781252533270L ^ life2_3));
    }
    if (!((forwardValue504_37_0 == forwardValue504_37_1))) {
        break forward_join_49;
    }
    __call504_15(__fieldRead504_11(receiver), __call504_14(__call504_12(receiver), __invokedynamic504_13(29020, (2228231781252533270L ^ life2_3))));
    }
    return;
}
public static void h504_0(java.lang.Throwable p0) throws Throwable {
    throw __call3050400_0(p0);
}
public static void h504_1(java.lang.Throwable p0, moom.tC p1, int p2, long p3, int p4) throws Throwable {
    java.lang.Throwable life6_2;
    life6_2 = p0;
    if ((p4 != 0)) {
        if ((p2 == __invokedynamic3050401_0(29020, (2228231781252533270L ^ p3)))) {
        __call3050401_5(__fieldRead3050401_1(p1), __call3050401_4(__call3050401_2(p1), __invokedynamic3050401_3(29020, (2228231781252533270L ^ p3))));
    } else {
        
    }
    } else {
        
    }
    return;
}
public static void h504_2(java.lang.Throwable p0) throws Throwable {
    throw __call3050402_0(p0);
}
public static void h504_3(java.lang.Throwable p0) throws Throwable {
    throw __call3050403_0(p0);
}
private static native long __fieldRead504_0() throws Throwable;
private static native int __call504_1() throws Throwable;
private static native void __call504_2(moom.tC a0, int a1) throws Throwable;
private static native int __invokedynamic504_3(int a0, long a1) throws Throwable;
private static native moom.qV __fieldRead504_4(moom.tC a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call504_5(moom.tC a0) throws Throwable;
private static native int __invokedynamic504_6(int a0, long a1) throws Throwable;
private static native java.lang.String __call504_7(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call504_8(java.lang.String a0) throws Throwable;
private static native void __call504_9(moom.qV a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native int __invokedynamic504_10(int a0, long a1) throws Throwable;
private static native moom.qV __fieldRead504_11(moom.tC a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call504_12(moom.tC a0) throws Throwable;
private static native int __invokedynamic504_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call504_14(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native void __call504_15(moom.qV a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3050400_0(java.lang.Throwable a0) throws Throwable;
private static native int __invokedynamic3050401_0(int a0, long a1) throws Throwable;
private static native moom.qV __fieldRead3050401_1(moom.tC a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call3050401_2(moom.tC a0) throws Throwable;
private static native int __invokedynamic3050401_3(int a0, long a1) throws Throwable;
private static native java.lang.String __call3050401_4(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native void __call3050401_5(moom.qV a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3050402_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3050403_0(java.lang.Throwable a0) throws Throwable;

}


public boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
((moom.qV)(this.aQ)).a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    return ((0) != 0);
}


public net.minecraft.block.state.IBlockState b__fE() {
return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bM)).a__fE();
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9116_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18966;
      if (ib[var3] == null) {
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
         long var5 = db[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tC.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (moom.tC.bb ^ 80998667488597L);
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((moom.qV)(this.aQ)).b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.DataWatcher)(((moom.tC)(this)).a__r1())).b(((int)(__sourceIntrinsic_01f4e1cd062e_originalDynamicSite1645_5(29020, (2228291592638940630L ^ local2)))), ((java.lang.Object)(((moom.qV)(((moom.tC)(this)).a__qV())).b__String())));
    ((net.minecraft.entity.DataWatcher)(((moom.tC)(this)).a__r1())).b(((int)(__sourceIntrinsic_01f4e1cd062e_originalDynamicSite1645_10(21102, (82609538416076518L ^ local2)))), ((java.lang.Object)(net.minecraft.util.IChatComponent$Serializer.a(((net.minecraft.util.IChatComponent)(((moom.qV)(((moom.tC)(this)).a__qV())).b__C5()))))));
    return;
}


public void f(int p0) { __sourceHandlerCall_a37e05ee80952999cb13(this, p0); }


protected void d__Void() {
long local1 = (moom.tC.bb ^ 67762143129862L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(((moom.tC)(this)).a__r1())).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1646_3(25762, (281998281270209658L ^ local1)))), ((java.lang.Object)("")));
    ((net.minecraft.entity.DataWatcher)(((moom.tC)(this)).a__r1())).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1646_6(5833, (4385343711371451923L ^ local1)))), ((java.lang.Object)("")));
    return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((moom.qV)(this.aQ)).a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}


public void a(int p0, int p1, int p2, boolean p3) { __sourceHandlerCall_7e8bcc19acfb271f6030(this, p0, p1, p2, p3); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public net.minecraft.entity.item.EntityMinecart$EnumMinecartType a__aT() {
return net.minecraft.entity.item.EntityMinecart$EnumMinecartType.COMMAND_BLOCK;
}


public moom.qV a__qV() {
return this.aQ;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9116_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_originalDynamicSite1645_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_originalDynamicSite1645_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1646_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1646_6(int a0, long a1) throws E;
}
