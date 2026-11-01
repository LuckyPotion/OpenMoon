package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiRenameWorld extends net.minecraft.client.gui.GuiScreen {

private final net.minecraft.client.gui.GuiScreen w;

private moom.hJ x;

private final java.lang.String y;

private static final long z;

private static final long[] A;

private static final java.lang.Integer[] B;

private static final java.util.Map C;

public GuiRenameWorld(net.minecraft.client.gui.GuiScreen p0, java.lang.String p1) {
super();
    this.w = p0;
    this.y = p1;
}


static {
z = ((long)(((moom._a)(moom._c.a(((long)(-4226056775960174606L)), ((long)(5888706882081520068L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(20999960822904L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiRenameWorld.z ^ 127618704349483L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1780_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1780_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1780_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1780_14 = new byte[8];
    (__sourceSpill1780_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1780_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1780_16 = __sourceSpill1780_14;
    ((javax.crypto.Cipher)(__sourceSpill1780_11)).init(((int)(__sourceSpill1780_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1780_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1780_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ºï&ø-ÈïÒÃ³)bÝ\020´©ÚÔºã\032+áÊí©r\034á]äã%/|¾a \005ÒPî\030¢\b\\äò+ë_\016nQ[Ê\036¦à\035ûð®AMåLs\000×ý\006ItqS%ý\025%bk\034µ[Û\023ã¹Dùbi~"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1780_25 = local6_life21;
        int __sourceSpill1780_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1780_25)).substring(((int)(__sourceSpill1780_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1780_30 = local8_life19;
        int __sourceSpill1780_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1780_33 = new byte[8];
        (__sourceSpill1780_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1780_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1780_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1780_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1780_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1780_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1780_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1780_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1780_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1780_34)).doFinal(((byte[])(__sourceSpill1780_33)));
        (__sourceSpill1780_30)[__sourceSpill1780_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "øÄ¥.MYø!Ä(\bè±ºR"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1780_38 = local6_life21;
        int __sourceSpill1780_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1780_38)).substring(((int)(__sourceSpill1780_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1780_43 = local8_life19;
        int __sourceSpill1780_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1780_46 = new byte[8];
        (__sourceSpill1780_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1780_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1780_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1780_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1780_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1780_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1780_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1780_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1780_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1780_47)).doFinal(((byte[])(__sourceSpill1780_46)));
        (__sourceSpill1780_43)[__sourceSpill1780_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    A = ((long[])(local8_life19));
    B = ((java.lang.Integer[])(new java.lang.Integer[15]));
}


public void c__Void() {
long local1_life2 = (net.minecraft.client.gui.GuiRenameWorld.z ^ 108087575989775L);
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(true)));
    ((java.util.List)(((net.minecraft.client.gui.GuiRenameWorld)(this)).m)).clear();
    ((java.util.List)(((net.minecraft.client.gui.GuiRenameWorld)(this)).m)).add(((java.lang.Object)(new moom.gc(0, ((((net.minecraft.client.gui.GuiRenameWorld)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_9(30893, (8500009858471710367L ^ local1_life2))), (((((net.minecraft.client.gui.GuiRenameWorld)(this)).l / 4) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_12(25590, (1841943284987876810L ^ local1_life2))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_14(2787, (1612695708323790045L ^ local1_life2))), moom.oO.a(((java.lang.String)("selectWorld.renameButton")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(((net.minecraft.client.gui.GuiRenameWorld)(this)).m)).add(((java.lang.Object)(new moom.gc(1, ((((net.minecraft.client.gui.GuiRenameWorld)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_20(30893, (8500009858471710367L ^ local1_life2))), (((((net.minecraft.client.gui.GuiRenameWorld)(this)).l / 4) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_23(1075, (7587671187574338050L ^ local1_life2))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_25(10872, (6950352082789145665L ^ local1_life2))), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    net.minecraft.world.storage.ISaveFormat local3_life30 = ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiRenameWorld)(this)).i)).a__IK();
    net.minecraft.world.storage.WorldInfo local4_life33 = ((net.minecraft.world.storage.ISaveFormat)(local3_life30)).a(((java.lang.String)(this.y)));
    java.lang.String local5_life35 = ((net.minecraft.world.storage.WorldInfo)(local4_life33)).a__String();
    this.x = ((moom.hJ)(new moom.hJ(2, ((net.minecraft.client.gui.GuiRenameWorld)(this)).p, ((((net.minecraft.client.gui.GuiRenameWorld)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_39(30893, (8500009858471710367L ^ local1_life2))), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_41(23009, (4779561557072408539L ^ local1_life2)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_43(3058, (2799235466926079428L ^ local1_life2)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_45(2987, (4235786206752816536L ^ local1_life2)))));
    ((moom.hJ)(this.x)).b(((boolean)(true)));
    ((moom.hJ)(this.x)).a(((java.lang.String)(local5_life35)));
    return;
}


public void h() {
org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiRenameWorld.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25933;
      if (B[var3] == null) {
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
         long var5 = A[var3];
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
         Object[] var9 = (Object[])C.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               C.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gZ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         B[var3] = var15;
      }

      return B[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10322_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
net.minecraft.world.storage.ISaveFormat life2_24;
    if (((moom.gc)(p0)).m) {
        if ((((moom.gc)(p0)).l == 1)) {
        ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiRenameWorld)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.w)));
    } else {
        if ((((moom.gc)(p0)).l == 0)) {
        life2_24 = ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiRenameWorld)(this)).i)).a__IK();
        ((net.minecraft.world.storage.ISaveFormat)(life2_24)).a(((java.lang.String)(this.y)), ((java.lang.String)(((java.lang.String)(((moom.hJ)(this.x)).a__String())).trim())));
        ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiRenameWorld)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.w)));
    }
    }
    }
    return;
}


protected void a(char p0, int p1) throws java.io.IOException {
moom.gc forwardValue4797_23_0;
    moom.gc forwardValue4797_24_0;
    int forwardValue4797_24_1;
    moom.gc spill4797_0;
    long life3_3;
    forward_join_46: {
    forward_join_39: {
    forward_join_24: {
    forward_join_23: {
    life3_3 = (net.minecraft.client.gui.GuiRenameWorld.z ^ 116848787591746L);
    ((moom.hJ)(this.x)).a(((char)(p0)), ((int)(p1)));
    spill4797_0 = ((moom.gc)(((java.util.List)(((net.minecraft.client.gui.GuiRenameWorld)(this)).m)).get(((int)(0)))));
    if (!((((java.lang.String)(((java.lang.String)(((moom.hJ)(this.x)).a__String())).trim())).length() > 0))) {
        forwardValue4797_23_0 = spill4797_0;
        break forward_join_23;
    }
    forwardValue4797_24_0 = spill4797_0;
    forwardValue4797_24_1 = 1;
    break forward_join_24;
    }
    forwardValue4797_24_0 = forwardValue4797_23_0;
    forwardValue4797_24_1 = 0;
    }
    ((moom.gc)(forwardValue4797_24_0)).m = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4797_24_1)));
    if (!((p1 != __sourceIntrinsic_f7d59ba1def0_invokedynamic4797_11(27257, (4874272973164511236L ^ life3_3))))) {
        break forward_join_39;
    }
    if (!((p1 == __sourceIntrinsic_f7d59ba1def0_invokedynamic4797_12(8216, (2928806783598578280L ^ life3_3))))) {
        break forward_join_46;
    }
    }
    ((net.minecraft.client.gui.GuiRenameWorld)(this)).a__Void(((moom.gc)(((moom.gc)(((java.util.List)(((net.minecraft.client.gui.GuiRenameWorld)(this)).m)).get(((int)(0))))))));
    }
    return;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    ((moom.hJ)(this.x)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiRenameWorld.z ^ 104533486455689L);
    ((net.minecraft.client.gui.GuiRenameWorld)(this)).i();
    ((net.minecraft.client.gui.GuiRenameWorld)(this)).a(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiRenameWorld)(this)).p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("selectWorld.renameTitle")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((((net.minecraft.client.gui.GuiRenameWorld)(this)).k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_5(29414, (3296371018895278431L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_6(23029, (8606401887383775816L ^ local4)))));
    ((net.minecraft.client.gui.GuiRenameWorld)(this)).b(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiRenameWorld)(this)).p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("selectWorld.enterName")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(((((net.minecraft.client.gui.GuiRenameWorld)(this)).k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_11(24228, (4254996423101050134L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_12(31685, (3544733024641697908L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_13(6745, (8262203695012456935L ^ local4)))));
    ((moom.hJ)(this.x)).d__Void();
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


public void g() {
((moom.hJ)(this.x)).a__Void();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic4797_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic4797_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1790_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10322_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite794_45(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
