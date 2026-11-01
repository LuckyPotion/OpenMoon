package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gU extends net.minecraft.client.gui.GuiScreen {

protected net.minecraft.client.gui.GuiScreen w;

private moom.h4 x;

private final net.minecraft.client.settings.GameSettings y;

private final net.minecraft.client.resources.LanguageManager z;

private moom.gi A;

private moom.gi B;

private static final long C;

private static final long[] D;

private static final java.lang.Integer[] E;

private static final java.util.Map F;

public gU(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1, net.minecraft.client.resources.LanguageManager p2) {
super();
    this.w = p0;
    this.y = p1;
    this.z = p2;
}


static {
C = ((long)(((moom._a)(moom._c.a(((long)(3123491476437132511L)), ((long)(4290928078310289333L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(58719163440724L)))));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gU.C ^ 8232273449789L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1220_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1220_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1220_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1220_14 = new byte[8];
    (__sourceSpill1220_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1220_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1220_16 = __sourceSpill1220_14;
    ((javax.crypto.Cipher)(__sourceSpill1220_11)).init(((int)(__sourceSpill1220_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1220_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1220_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\003ÁÕ;wnÑµ{Möú*»%¸¤²F|±?¾õùQÉõàßñÕfµã!ÌÆí^É§\027× \002ÉÔ×7Æ\023g\035N\001Õþ_@_´n\024²D\036©Ø3·\\(ø×!"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1220_25 = local6_life21;
        int __sourceSpill1220_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1220_25)).substring(((int)(__sourceSpill1220_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1220_30 = local8_life19;
        int __sourceSpill1220_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1220_33 = new byte[8];
        (__sourceSpill1220_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1220_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1220_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1220_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1220_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1220_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1220_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1220_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1220_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1220_34)).doFinal(((byte[])(__sourceSpill1220_33)));
        (__sourceSpill1220_30)[__sourceSpill1220_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ð¶qq»\035*¹~3¿ãDåÇ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1220_38 = local6_life21;
        int __sourceSpill1220_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1220_38)).substring(((int)(__sourceSpill1220_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1220_43 = local8_life19;
        int __sourceSpill1220_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1220_46 = new byte[8];
        (__sourceSpill1220_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1220_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1220_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1220_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1220_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1220_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1220_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1220_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1220_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1220_47)).doFinal(((byte[])(__sourceSpill1220_46)));
        (__sourceSpill1220_43)[__sourceSpill1220_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    D = ((long[])(local8_life19));
    E = ((java.lang.Integer[])(new java.lang.Integer[13]));
}


public void e() throws java.io.IOException {
super.e();
    ((moom.h4)(this.x)).c__Void();
    return;
}


public void c__Void() {
long life1_3;
    life1_3 = (moom.gU.C ^ 127798628926083L);
    java.util.List spill374_0 = ((moom.gU)(this)).m;
    moom.gU __stackOp374_11_0 = this;
    moom.gi __stackOp374_11_1 = new moom.gi(__sourceIntrinsic_7ac46ee229a8_invokedynamic374_2(20718, (4742945547768677847L ^ life1_3)), ((((moom.gU)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic374_4(24770, (4623020971143362034L ^ life1_3))), (((moom.gU)(this)).l - __sourceIntrinsic_7ac46ee229a8_invokedynamic374_6(7263, (2962809868621547879L ^ life1_3))), net.minecraft.client.settings.GameSettings$Options.FORCE_UNICODE_FONT, ((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.FORCE_UNICODE_FONT))));
    moom.gi spill374_1 = __stackOp374_11_1;
    ((moom.gU)(__stackOp374_11_0)).A = ((moom.gi)(__stackOp374_11_1));
    ((java.util.List)(spill374_0)).add(((java.lang.Object)(spill374_1)));
    java.util.List spill374_2 = ((moom.gU)(this)).m;
    moom.gU __stackOp374_22_0 = this;
    moom.gi __stackOp374_22_1 = new moom.gi(__sourceIntrinsic_7ac46ee229a8_invokedynamic374_15(15126, (8252153434786836004L ^ life1_3)), (((((moom.gU)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic374_17(20759, (110132452206134308L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic374_18(13728, (3877824830741848221L ^ life1_3))), (((moom.gU)(this)).l - __sourceIntrinsic_7ac46ee229a8_invokedynamic374_20(6904, (4002517784965648327L ^ life1_3))), moom.oO.a(((java.lang.String)("gui.done")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gi spill374_3 = __stackOp374_22_1;
    ((moom.gU)(__stackOp374_22_0)).B = ((moom.gi)(__stackOp374_22_1));
    ((java.util.List)(spill374_2)).add(((java.lang.Object)(spill374_3)));
    this.x = ((moom.h4)(new moom.h4(this, ((moom.gU)(this)).i)));
    ((moom.h4)(this.x)).c(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic374_28(30489, (2871128363712242216L ^ life1_3)))), ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic374_29(790, (5177780862001288749L ^ life1_3)))));
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x464E;
        if (E[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = D[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])F.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    F.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/gU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gU.E[n2] = n3;
        }
        return E[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gU.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7745_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.gU.C ^ 80710742361861L);
    ((moom.h4)(this.x)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.gU)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.gU)(this)).p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("options.language")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((((moom.gU)(this)).k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_6(14758, (2801155866272737562L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_7(26558, (5165679684518541069L ^ local4)))));
    ((moom.gU)(this)).a(((net.minecraft.client.gui.FontRenderer)(((moom.gU)(this)).p)), ((java.lang.String)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_11(moom.oO.a(((java.lang.String)("options.languageWarning")), ((java.lang.Object[])(new java.lang.Object[0])))))), ((int)((((moom.gU)(this)).k / 2))), ((int)((((moom.gU)(this)).l - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_14(10955, (8726957104280156785L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_15(12175, (2670401737355902775L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
moom.ir life2_34;
    int life3_37;
    int life4_40;
    forest_join_52: {
    forest_join_48: {
    forest_join_13: {
    forest_join_7: {
    forest_join_6: {
    if (!(((moom.gc)(p0)).m)) {
        break forest_join_52;
    }
    switch (((moom.gc)(p0)).l) {
case 5:
{
        break forest_join_6;
    }
case 6:
{
        break forest_join_7;
    }
case 100:
{
        break forest_join_13;
    }
default:
{
        break forest_join_48;
    }
}
    }
    break forest_join_52;
    }
    ((net.minecraft.client.Minecraft)(((moom.gU)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.w)));
    break forest_join_52;
    }
    if (!((((p0 instanceof moom.gi) ? 1 : 0) != 0))) {
        break forest_join_52;
    }
    ((net.minecraft.client.settings.GameSettings)(this.y)).a(((net.minecraft.client.settings.GameSettings$Options)(((moom.gi)(((moom.gi)(p0)))).b())), ((int)(1)));
    ((moom.gc)(p0)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.FORCE_UNICODE_FONT)))));
    life2_34 = new moom.ir(((moom.gU)(this)).i);
    life3_37 = ((moom.ir)(life2_34)).a__Int();
    life4_40 = ((moom.ir)(life2_34)).b__Int();
    ((moom.gU)(this)).a(((net.minecraft.client.Minecraft)(((moom.gU)(this)).i)), ((int)(life3_37)), ((int)(life4_40)));
    break forest_join_52;
    }
    ((moom.h4)(this.x)).a(((moom.gc)(p0)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_11(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1458_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7745_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic374_29(int a0, long a1) throws E;
}
