package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiScreenDemo extends net.minecraft.client.gui.GuiScreen {

private static org.apache.logging.log4j.Logger w;

private static moom.DD x;

private static long y;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

public GuiScreenDemo() {
super();
}


static {
y = ((long)(((moom._a)(moom._c.a(((long)(-4228617328263411303L)), ((long)(1281601956528025420L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(61998187681515L)))));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiScreenDemo.y ^ 38108828101850L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1784_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1784_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1784_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1784_14 = new byte[8];
    (__sourceSpill1784_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1784_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1784_16 = __sourceSpill1784_14;
    ((javax.crypto.Cipher)(__sourceSpill1784_11)).init(((int)(__sourceSpill1784_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1784_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1784_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[24];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ë»M¨\tFziCÃ,ñÈ'ZñvçµMÇÕv\002MH\b\033Ë¹ZÖs¯\000\021\004Jf2¾hÞ\032íÅ*=ÉH{86\003û½YõL'[2?F´ÿjÜÇ}\r²ÃD\"PíÚ#YUÒö>\022ÔË&¤üºÓ-x>è2q<LÖQÙ¼Úè1f%\022á.Õß²Ë|!çìg*×ÄeHi \033¤ªt¸Uû\016\013Ë·­ó ïm\031«\031\031\034LÓ\022¼\034Éf¤"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1784_25 = local6_life21;
        int __sourceSpill1784_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1784_25)).substring(((int)(__sourceSpill1784_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1784_30 = local8_life19;
        int __sourceSpill1784_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1784_33 = new byte[8];
        (__sourceSpill1784_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1784_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1784_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1784_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1784_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1784_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1784_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1784_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1784_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1784_34)).doFinal(((byte[])(__sourceSpill1784_33)));
        (__sourceSpill1784_30)[__sourceSpill1784_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¦Ñ¡L×Dè×\002YH@ X"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1784_38 = local6_life21;
        int __sourceSpill1784_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1784_38)).substring(((int)(__sourceSpill1784_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1784_43 = local8_life19;
        int __sourceSpill1784_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1784_46 = new byte[8];
        (__sourceSpill1784_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1784_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1784_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1784_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1784_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1784_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1784_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1784_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1784_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1784_47)).doFinal(((byte[])(__sourceSpill1784_46)));
        (__sourceSpill1784_43)[__sourceSpill1784_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    z = ((long[])(local8_life19));
    A = ((java.lang.Integer[])(new java.lang.Integer[24]));
    w = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    x = ((moom.DD)(new moom.DD("textures/gui/demo_background.png")));
}

private static native <E extends Throwable> void __sourceHandlerCall_be1fb4ede16e95ae3bd8(net.minecraft.client.gui.GuiScreenDemo a0, moom.gc a1) throws E;
private static final class __SourceHandler_be1fb4ede16e95ae3bd8 {

public static void f564(net.minecraft.client.gui.GuiScreenDemo receiver, moom.gc p0) throws Throwable {
    java.lang.Class spill564_0;
    java.lang.String spill564_1;
    java.lang.Class[] spill564_2;
    java.lang.reflect.Method spill564_3;
    java.lang.Object spill564_4;
    java.lang.Object[] spill564_5;
    java.lang.Class life2_8;
    java.lang.Object life3_18;
    forest_join_48: {
    forest_join_41: {
    forest_join_3: {
    switch (__fieldRead564_0(p0)) {
case 1:
{
        break forest_join_3;
    }
case 2:
{
        break forest_join_41;
    }
default:
{
        break forest_join_48;
    }
}
    }
    __fieldWrite564_1(p0, 0);
    life2_8 = __call564_2("java.awt.Desktop");
    life3_18 = __call564_4(__call564_3(life2_8, "getDesktop", new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill564_0 = life2_8;
    spill564_1 = "browse";
    java.lang.Class[] __stackOp564_5_0 = new java.lang.Class[1];
    spill564_2 = __stackOp564_5_0;
    (__stackOp564_5_0)[0] = __classLiteral564_6();
    spill564_3 = __call564_7(spill564_0, spill564_1, spill564_2);
    spill564_4 = life3_18;
    java.lang.Object[] __stackOp564_8_0 = new java.lang.Object[1];
    spill564_5 = __stackOp564_8_0;
    (__stackOp564_8_0)[0] = new java.net.URI("http://www.minecraft.net/store?source=demo");
    __call564_9(spill564_3, spill564_4, spill564_5);
    break forest_join_48;
    }
    __call564_11(__fieldRead564_10(receiver), null);
    __call564_13(__fieldRead564_12(receiver));
    }
    return;
}
public static void h564_0(java.lang.Throwable p0, java.lang.Class p1) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    __call3056400_1(__fieldRead3056400_0(), "Couldn't open link", life1_2);
    return;
}
private static native int __fieldRead564_0(moom.gc a0) throws Throwable;
private static native void __fieldWrite564_1(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Class __call564_2(java.lang.String a0) throws Throwable;
private static native java.lang.reflect.Method __call564_3(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call564_4(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Class __classLiteral564_6() throws Throwable;
private static native java.lang.reflect.Method __call564_7(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call564_9(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead564_10(net.minecraft.client.gui.GuiScreenDemo a0) throws Throwable;
private static native void __call564_11(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead564_12(net.minecraft.client.gui.GuiScreenDemo a0) throws Throwable;
private static native void __call564_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3056400_0() throws Throwable;
private static native void __call3056400_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;

}


public void i() {
long local1 = (net.minecraft.client.gui.GuiScreenDemo.y ^ 115647814545162L);
    super.i();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.GuiScreenDemo.x)));
    int local3 = ((this.k - __sourceIntrinsic_c85abf990348_originalDynamicSite1794_8(6458, (4584154714491569754L ^ local1))) / 2);
    int local4 = ((this.l - __sourceIntrinsic_c85abf990348_originalDynamicSite1794_10(16902, (7466025178253139298L ^ local1))) / 2);
    ((net.minecraft.client.gui.GuiScreenDemo)(this)).b(((int)(local3)), ((int)(local4)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_c85abf990348_originalDynamicSite1794_11(643, (3412352162792136189L ^ local1)))), ((int)(__sourceIntrinsic_c85abf990348_originalDynamicSite1794_12(22095, (5553496318952835387L ^ local1)))));
    return;
}


public void c__Void() {
long local1 = (net.minecraft.client.gui.GuiScreenDemo.y ^ 114585064203290L);
    ((java.util.List)(this.m)).clear();
    int local3 = __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_3(3743, (3708134521346693885L ^ local1));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(1, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_6(25179, (2639852054803805746L ^ local1))), (((this.l / 2) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_8(20568, (5271425180946973755L ^ local1))) + local3), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_9(31730, (6973091264150892420L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_10(8753, (4931978383075423828L ^ local1)), moom.oO.a(((java.lang.String)("demo.help.buy")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(2, ((this.k / 2) + 2), (((this.l / 2) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_16(4798, (4230517738148398814L ^ local1))) + local3), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_17(4873, (7763960190550050686L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_18(27584, (5962692559268511656L ^ local1)), moom.oO.a(((java.lang.String)("demo.help.later")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18197;
      if (A[var3] == null) {
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
         long var5 = z[var3];
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
         Object[] var9 = (Object[])B.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               B.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/g3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiScreenDemo.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10372_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiScreenDemo.y ^ 93915546771868L);
    ((net.minecraft.client.gui.GuiScreenDemo)(this)).i();
    int local6 = (((this.k - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_3(643, (3412356818270720875L ^ local4))) / 2) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_4(22929, (8494383357784836208L ^ local4)));
    int local7 = (((this.l - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_6(22095, (5553438885846304685L ^ local4))) / 2) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_7(13339, (4697288857745532402L ^ local4)));
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("demo.help.title")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(((float) local6))), ((float)(((float) local7))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_10(10696, (7841947298794584104L ^ local4)))));
    local7 = (local7 + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_12(32619, (8151699309232451207L ^ local4)));
    net.minecraft.client.settings.GameSettings local8 = ((net.minecraft.client.Minecraft)(this.i)).W;
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("demo.help.movementShort")), ((java.lang.Object[])(new java.lang.Object[] {net.minecraft.client.settings.GameSettings.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(local8)).al)).b()))), net.minecraft.client.settings.GameSettings.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(local8)).am)).b()))), net.minecraft.client.settings.GameSettings.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(local8)).an)).b()))), net.minecraft.client.settings.GameSettings.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(local8)).ao)).b())))}))))), ((float)(((float) local6))), ((float)(((float) local7))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_29(24912, (5890677882773270691L ^ local4)))));
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("demo.help.movementMouse")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(((float) local6))), ((float)(((float) (local7 + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_33(7200, (544888467662638541L ^ local4)))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_34(29076, (4446537438483636350L ^ local4)))));
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("demo.help.jump")), ((java.lang.Object[])(new java.lang.Object[] {net.minecraft.client.settings.GameSettings.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(local8)).ap)).b())))}))))), ((float)(((float) local6))), ((float)(((float) (local7 + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_41(11241, (7272213182843763230L ^ local4)))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_42(29076, (4446537438483636350L ^ local4)))));
    ((net.minecraft.client.gui.FontRenderer)(this.p)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("demo.help.inventory")), ((java.lang.Object[])(new java.lang.Object[] {net.minecraft.client.settings.GameSettings.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(local8)).as)).b())))}))))), ((float)(((float) local6))), ((float)(((float) (local7 + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_49(7229, (8052999959245163977L ^ local4)))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_50(29076, (4446537438483636350L ^ local4)))));
    ((net.minecraft.client.gui.FontRenderer)(this.p)).a(((java.lang.String)(moom.oO.a(((java.lang.String)("demo.help.fullWrapped")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)(local6)), ((int)((local7 + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_54(24706, (5809526149093978473L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_55(792, (2656844929189843711L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_56(2139, (5820353165324884398L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_be1fb4ede16e95ae3bd8(this, p0); }


public void g() {
super.g();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1796_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10372_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1795_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c85abf990348_originalDynamicSite1794_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c85abf990348_originalDynamicSite1794_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c85abf990348_originalDynamicSite1794_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c85abf990348_originalDynamicSite1794_12(int a0, long a1) throws E;
}
