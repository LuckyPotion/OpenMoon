package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ha extends com.moon.g9 {

private final com.moon.module.impl.StorageEsp h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public ha(com.moon.module.impl.ESP p0, com.moon.module.impl.StorageEsp p1) {
super(p0);
    this.h = p1;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(8094219460912270965L)), ((long)(-4611768317211667667L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(180346591253759L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ha.i ^ 21785889957410L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill132_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill132_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill132_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill132_14 = new byte[8];
    (__sourceSpill132_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill132_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation132_16 = __sourceSpill132_14;
    ((javax.crypto.Cipher)(__sourceSpill132_11)).init(((int)(__sourceSpill132_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill132_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation132_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "àñ¿0_¬\034¾\003\027\025å"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill132_25 = local6_life21;
        int __sourceSpill132_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill132_25)).substring(((int)(__sourceSpill132_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill132_30 = local8_life19;
        int __sourceSpill132_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill132_33 = new byte[8];
        (__sourceSpill132_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill132_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill132_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill132_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill132_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill132_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill132_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill132_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill132_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill132_34)).doFinal(((byte[])(__sourceSpill132_33)));
        (__sourceSpill132_30)[__sourceSpill132_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8404;
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
            throw new RuntimeException("com/moon/ha", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ha.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1421_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ha"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void(net.minecraft.tileentity.TileEntity p0) {
int forwardValue344_74_0;
    float forwardValue344_105_0;
    com.moon.ha forwardValue344_325_0;
    java.lang.String[] spill344_0;
    boolean spill344_1;
    com.moon.ha spill344_2;
    long life2_3;
    org.lwjgl.util.vector.Vector4f life5_6;
    float life6_9;
    float life7_12;
    float life8_16;
    java.lang.String[] life4_17;
    float life9_20;
    float life10_24;
    float life11_28;
    int life12_31;
    int life13_35;
    float life14_94;
    float life15_116;
    forward_join_339: {
    forward_join_334: {
    forward_join_325: {
    forward_join_324: {
    forward_join_105: {
    forward_join_104: {
    forward_join_74: {
    forward_join_66: {
    life2_3 = (com.moon.ha.i ^ 98201264422857L);
    life5_6 = ((net.minecraft.tileentity.TileEntity)(p0)).a__Vector4f();
    life6_9 = ((org.lwjgl.util.vector.Vector4f)(life5_6)).x;
    life7_12 = ((org.lwjgl.util.vector.Vector4f)(life5_6)).y;
    spill344_0 = moom.mS.a__ArrayString();
    life8_16 = ((org.lwjgl.util.vector.Vector4f)(life5_6)).z;
    life4_17 = spill344_0;
    life9_20 = ((org.lwjgl.util.vector.Vector4f)(life5_6)).w;
    life10_24 = (life8_16 - life6_9);
    life11_28 = (life9_20 - life7_12);
    life12_31 = ((java.awt.Color)(java.awt.Color.BLACK)).getRGB();
    life13_35 = ((com.moon.ha)(this)).a(((net.minecraft.tileentity.TileEntity)(p0)));
    spill344_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.h)).e())).getValue())))).booleanValue();
    if (!((life4_17 == null))) {
        forwardValue344_74_0 = ((spill344_1) ? 1 : 0);
        break forward_join_74;
    }
    if (!(spill344_1)) {
        break forward_join_66;
    }
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p0f))), ((float)((life7_12 + 0x1.0p0f))), ((float)((life10_24 - 0x1.0p1f))), ((float)((life11_28 - 0x1.0p1f))), ((int)(__sourceIntrinsic_e63fa011adf9_invokedynamic344_17(29134, (7127690798066679821L ^ life2_3))))))));
    }
    spill344_2 = this;
    if (!((life4_17 == null))) {
        forwardValue344_325_0 = spill344_2;
        break forward_join_325;
    }
    forwardValue344_74_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(((com.moon.ha)(spill344_2)).h)).c__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue344_74_0 != 0))) {
        break forward_join_324;
    }
    life14_94 = ((life8_16 - life6_9) / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.StorageEsp)(this.h)).a__kZ())).getValue())))).floatValue());
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.h)).d__kV())).getValue())))).booleanValue())) {
        break forward_join_104;
    }
    forwardValue344_105_0 = ((life9_20 - life7_12) / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.StorageEsp)(this.h)).a__kZ())).getValue())))).floatValue());
    break forward_join_105;
    }
    forwardValue344_105_0 = life14_94;
    }
    life15_116 = forwardValue344_105_0;
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_9)), ((float)(life7_12)), ((float)(life14_94)), ((float)(0x1.8p0f)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_9)), ((float)(life7_12)), ((float)(0x1.8p0f)), ((float)(life15_116)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - life14_94))), ((float)(life7_12)), ((float)(life14_94)), ((float)(0x1.8p0f)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - 0x1.8p0f))), ((float)(life7_12)), ((float)(0x1.8p0f)), ((float)(life15_116)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_9)), ((float)((life9_20 - 0x1.8p0f))), ((float)(life14_94)), ((float)(0x1.8p0f)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_9)), ((float)((life9_20 - life15_116))), ((float)(0x1.8p0f)), ((float)(life15_116)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - life14_94))), ((float)((life9_20 - 0x1.8p0f))), ((float)(life14_94)), ((float)(0x1.8p0f)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - 0x1.8p0f))), ((float)((life9_20 - life15_116))), ((float)(0x1.8p0f)), ((float)(life15_116)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p-1f))), ((float)((life7_12 + 0x1.0p-1f))), ((float)((life14_94 - 0x1.0p0f))), ((float)(0x1.0p-1f)), ((int)(life13_35))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p-1f))), ((float)((life7_12 + 0x1.0p-1f))), ((float)(0x1.0p-1f)), ((float)((life15_116 - 0x1.0p0f))), ((int)(life13_35))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(((life8_16 - life14_94) + 0x1.0p-1f))), ((float)((life7_12 + 0x1.0p-1f))), ((float)((life14_94 - 0x1.0p0f))), ((float)(0x1.0p-1f)), ((int)(life13_35))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - 0x1.0p0f))), ((float)((life7_12 + 0x1.0p-1f))), ((float)(0x1.0p-1f)), ((float)((life15_116 - 0x1.0p0f))), ((int)(life13_35))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p-1f))), ((float)((life9_20 - 0x1.0p0f))), ((float)((life14_94 - 0x1.0p0f))), ((float)(0x1.0p-1f)), ((int)(life13_35))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p-1f))), ((float)(((life9_20 - life15_116) + 0x1.0p-1f))), ((float)(0x1.0p-1f)), ((float)((life15_116 - 0x1.0p0f))), ((int)(life13_35))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(((life8_16 - life14_94) + 0x1.0p-1f))), ((float)((life9_20 - 0x1.0p0f))), ((float)((life14_94 - 0x1.0p0f))), ((float)(0x1.0p-1f)), ((int)(life13_35))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - 0x1.0p0f))), ((float)(((life9_20 - life15_116) + 0x1.0p-1f))), ((float)(0x1.0p-1f)), ((float)((life15_116 - 0x1.0p0f))), ((int)(life13_35))))));
    if (!((life4_17 != null))) {
        break forward_join_334;
    }
    }
    forwardValue344_325_0 = this;
    }
    ((com.moon.hW)(((com.moon.ha)(forwardValue344_325_0)).c)).a(((com.moon.iX)(com.moon.i4.a(((float)(life6_9)), ((float)(life7_12)), ((float)(life8_16)), ((float)(life9_20)), ((int)(life12_31)), ((int)(life13_35))))));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_339;
    }
    moom.mS.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) {
return (__sourceIntrinsic_booleanComparison((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.ha)(this)).a__lV())).b__kV())).getValue())))).booleanValue())) != 0);
}


public int a(net.minecraft.tileentity.TileEntity p0) {
int forwardValue343_33_0;
    int forwardValue343_36_0;
    int forwardValue343_47_0;
    int spill343_0;
    int spill343_1;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.tileentity.TileEntityChest life5_16;
    forward_join_47: {
    forward_join_46: {
    forward_join_36: {
    forward_join_34: {
    forward_join_33: {
    forward_join_27: {
    life2_3 = (com.moon.ha.i ^ 121244774440450L);
    life4_5 = moom.mS.a__ArrayString();
    spill343_0 = ((p0 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue343_36_0 = spill343_0;
        break forward_join_36;
    }
    if (!((spill343_0 != 0))) {
        break forward_join_34;
    }
    life5_16 = ((net.minecraft.tileentity.TileEntityChest)(p0));
    spill343_1 = ((net.minecraft.tileentity.TileEntityChest)(life5_16)).h();
    if (!((life4_5 == null))) {
        forwardValue343_33_0 = spill343_1;
        break forward_join_33;
    }
    if (!((spill343_1 == 1))) {
        break forward_join_27;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.StorageEsp)(this.h)).b__kX())).getValue())))).intValue();
    }
    forwardValue343_33_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.StorageEsp)(this.h)).a__kX())).getValue())))).intValue();
    }
    return forwardValue343_33_0;
    }
    forwardValue343_36_0 = ((p0 instanceof moom.Cg) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue343_47_0 = forwardValue343_36_0;
        break forward_join_47;
    }
    if (!((forwardValue343_36_0 != 0))) {
        break forward_join_46;
    }
    return ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.StorageEsp)(this.h)).c__kX())).getValue())))).intValue();
    }
    forwardValue343_47_0 = -1;
    }
    return forwardValue343_47_0;
}


public void a(net.minecraft.entity.Entity p0) {
int forwardValue342_77_0;
    float forwardValue342_108_0;
    com.moon.ha forwardValue342_331_0;
    java.lang.String[] spill342_0;
    boolean spill342_1;
    com.moon.ha spill342_2;
    long life2_3;
    org.lwjgl.util.vector.Vector4f life5_6;
    float life6_9;
    float life7_13;
    float life8_16;
    java.lang.String[] life4_17;
    float life9_20;
    float life10_24;
    float life11_28;
    int life12_31;
    int life13_38;
    float life14_97;
    float life15_119;
    forward_join_340: {
    forward_join_331: {
    forward_join_330: {
    forward_join_108: {
    forward_join_107: {
    forward_join_77: {
    forward_join_69: {
    life2_3 = (com.moon.ha.i ^ 139983100182267L);
    life5_6 = ((net.minecraft.entity.Entity)(p0)).a__Vector4f();
    life6_9 = ((org.lwjgl.util.vector.Vector4f)(life5_6)).x;
    spill342_0 = moom.mS.a__ArrayString();
    life7_13 = ((org.lwjgl.util.vector.Vector4f)(life5_6)).y;
    life8_16 = ((org.lwjgl.util.vector.Vector4f)(life5_6)).z;
    life4_17 = spill342_0;
    life9_20 = ((org.lwjgl.util.vector.Vector4f)(life5_6)).w;
    life10_24 = (life8_16 - life6_9);
    life11_28 = (life9_20 - life7_13);
    life12_31 = ((java.awt.Color)(java.awt.Color.BLACK)).getRGB();
    life13_38 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.ha)(this)).a__lV())).a__kX())).getValue())))).intValue();
    spill342_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.ha)(this)).a__lV())).e__kV())).getValue())))).booleanValue();
    if (!((life4_17 == null))) {
        forwardValue342_77_0 = ((spill342_1) ? 1 : 0);
        break forward_join_77;
    }
    if (!(spill342_1)) {
        break forward_join_69;
    }
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p0f))), ((float)((life7_13 + 0x1.0p0f))), ((float)((life10_24 - 0x1.0p1f))), ((float)((life11_28 - 0x1.0p1f))), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic342_21(27323, (3232109556944034379L ^ life2_3))))))));
    }
    spill342_2 = this;
    if (!((life4_17 == null))) {
        forwardValue342_331_0 = spill342_2;
        break forward_join_331;
    }
    forwardValue342_77_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.ha)(spill342_2)).a__lV())).c__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue342_77_0 != 0))) {
        break forward_join_330;
    }
    life14_97 = ((life8_16 - life6_9) / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ESP)(((com.moon.ha)(this)).a__lV())).a__kZ())).getValue())))).floatValue());
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.ha)(this)).a__lV())).d__kV())).getValue())))).booleanValue())) {
        break forward_join_107;
    }
    forwardValue342_108_0 = ((life9_20 - life7_13) / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ESP)(((com.moon.ha)(this)).a__lV())).a__kZ())).getValue())))).floatValue());
    break forward_join_108;
    }
    forwardValue342_108_0 = life14_97;
    }
    life15_119 = forwardValue342_108_0;
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_9)), ((float)(life7_13)), ((float)(life14_97)), ((float)(0x1.8p0f)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_9)), ((float)(life7_13)), ((float)(0x1.8p0f)), ((float)(life15_119)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - life14_97))), ((float)(life7_13)), ((float)(life14_97)), ((float)(0x1.8p0f)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - 0x1.8p0f))), ((float)(life7_13)), ((float)(0x1.8p0f)), ((float)(life15_119)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_9)), ((float)((life9_20 - 0x1.8p0f))), ((float)(life14_97)), ((float)(0x1.8p0f)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_9)), ((float)((life9_20 - life15_119))), ((float)(0x1.8p0f)), ((float)(life15_119)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - life14_97))), ((float)((life9_20 - 0x1.8p0f))), ((float)(life14_97)), ((float)(0x1.8p0f)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - 0x1.8p0f))), ((float)((life9_20 - life15_119))), ((float)(0x1.8p0f)), ((float)(life15_119)), ((int)(life12_31))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p-1f))), ((float)((life7_13 + 0x1.0p-1f))), ((float)((life14_97 - 0x1.0p0f))), ((float)(0x1.0p-1f)), ((int)(life13_38))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p-1f))), ((float)((life7_13 + 0x1.0p-1f))), ((float)(0x1.0p-1f)), ((float)((life15_119 - 0x1.0p0f))), ((int)(life13_38))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(((life8_16 - life14_97) + 0x1.0p-1f))), ((float)((life7_13 + 0x1.0p-1f))), ((float)((life14_97 - 0x1.0p0f))), ((float)(0x1.0p-1f)), ((int)(life13_38))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - 0x1.0p0f))), ((float)((life7_13 + 0x1.0p-1f))), ((float)(0x1.0p-1f)), ((float)((life15_119 - 0x1.0p0f))), ((int)(life13_38))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p-1f))), ((float)((life9_20 - 0x1.0p0f))), ((float)((life14_97 - 0x1.0p0f))), ((float)(0x1.0p-1f)), ((int)(life13_38))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_9 + 0x1.0p-1f))), ((float)(((life9_20 - life15_119) + 0x1.0p-1f))), ((float)(0x1.0p-1f)), ((float)((life15_119 - 0x1.0p0f))), ((int)(life13_38))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)(((life8_16 - life14_97) + 0x1.0p-1f))), ((float)((life9_20 - 0x1.0p0f))), ((float)((life14_97 - 0x1.0p0f))), ((float)(0x1.0p-1f)), ((int)(life13_38))))));
    ((com.moon.hW)(((com.moon.ha)(this)).c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life8_16 - 0x1.0p0f))), ((float)(((life9_20 - life15_119) + 0x1.0p-1f))), ((float)(0x1.0p-1f)), ((float)((life15_119 - 0x1.0p0f))), ((int)(life13_38))))));
    if (!((life4_17 != null))) {
        break forward_join_340;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    forwardValue342_331_0 = this;
    }
    ((com.moon.hW)(((com.moon.ha)(forwardValue342_331_0)).c)).a(((com.moon.iX)(com.moon.i4.a(((float)(life6_9)), ((float)(life7_13)), ((float)(life8_16)), ((float)(life9_20)), ((int)(life12_31)), ((int)(life13_38))))));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1421_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic342_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e63fa011adf9_invokedynamic344_17(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
