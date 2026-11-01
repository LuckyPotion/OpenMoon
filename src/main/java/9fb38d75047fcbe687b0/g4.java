package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g4 extends com.moon.gZ {

private final java.util.List<com.moon.g9> c;

private com.moon.hW d;

private com.moon.hW e;

private com.moon.hW f;

private com.moon.hW g;

private com.moon.module.impl.StorageEsp h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public g4(com.moon.module.impl.ESP p0, com.moon.module.impl.StorageEsp p1) {
super(p0);
    this.c = new java.util.ArrayList();
    this.h = p1;
    (this).d();
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-4473355888351277292L)), ((long)(6406701332666694028L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(98768598926730L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.g4.i ^ 37523343185826L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill195_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill195_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill195_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill195_14 = new byte[8];
    (__sourceSpill195_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill195_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation195_16 = __sourceSpill195_14;
    ((javax.crypto.Cipher)(__sourceSpill195_11)).init(((int)(__sourceSpill195_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill195_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation195_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "3\t\fÄÁx\030-2\"ë`àü Ý\022óTïM²´m!"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill195_25 = local6_life21;
        int __sourceSpill195_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill195_25)).substring(((int)(__sourceSpill195_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill195_30 = local8_life19;
        int __sourceSpill195_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill195_33 = new byte[8];
        (__sourceSpill195_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill195_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill195_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill195_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill195_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill195_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill195_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill195_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill195_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill195_34)).doFinal(((byte[])(__sourceSpill195_33)));
        (__sourceSpill195_30)[__sourceSpill195_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ø-\006J^¤¥#¯ej\026KB"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill195_38 = local6_life21;
        int __sourceSpill195_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill195_38)).substring(((int)(__sourceSpill195_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill195_43 = local8_life19;
        int __sourceSpill195_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill195_46 = new byte[8];
        (__sourceSpill195_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill195_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill195_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill195_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill195_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill195_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill195_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill195_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill195_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill195_47)).doFinal(((byte[])(__sourceSpill195_46)));
        (__sourceSpill195_43)[__sourceSpill195_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1191_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/g4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20352;
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
            throw new RuntimeException("com/moon/g4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.g4.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b__Void() {
com.moon.hW forestValue100002_26_0;
    com.moon.hW forestValue100002_35_0;
    com.moon.hW forestValue100002_46_0;
    com.moon.g4 forestValue100002_88_0;
    int forestValue100002_109_0;
    int forestValue100002_126_0;
    net.minecraft.entity.Entity forestValue100002_128_0;
    com.moon.g9 forestValue100002_171_0;
    net.minecraft.entity.Entity forestValue100002_171_1;
    int forestValue100002_182_0;
    int forestValue100002_191_0;
    int forestValue100002_199_0;
    net.minecraft.tileentity.TileEntity forestValue100002_211_0;
    com.moon.g9 forestValue100002_234_0;
    boolean spill100002_0;
    com.moon.hW spill100002_1;
    com.moon.g4 spill100002_2;
    boolean spill100002_3;
    boolean spill100002_4;
    boolean spill100002_5;
    net.minecraft.entity.Entity spill100002_6;
    com.moon.g9 spill100002_7;
    net.minecraft.entity.Entity spill100002_8;
    boolean spill100002_9;
    net.minecraft.tileentity.TileEntity spill100002_10;
    com.moon.g9 spill100002_11;
    int spill100002_12;
    long life1_3;
    com.moon.jm life4_8;
    com.moon.jb life5_13;
    int life3_14;
    java.util.Iterator life6_117;
    net.minecraft.entity.Entity life7_124;
    java.util.Iterator life8_148;
    com.moon.g9 life9_155;
    java.util.Iterator life6_215;
    net.minecraft.tileentity.TileEntity life7_222;
    java.util.Iterator life8_239;
    com.moon.g9 life9_246;
    com.moon.ha life10_257;
    forest_join_263: {
    forest_join_191: {
    forest_join_182: {
    forest_join_179: {
    forest_join_88: {
    forest_join_51: {
    forest_join_46: {
    forest_join_42: {
    forest_join_35: {
    forest_join_33: {
    forest_join_26: {
    forest_join_24: {
    life1_3 = (com.moon.g4.i ^ 96940937552409L);
    life4_8 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.VERDANA)));
    spill100002_0 = net.minecraft.creativetab.CreativeTabs.d();
    life5_13 = ((com.moon.je)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__je())).a();
    life3_14 = ((spill100002_0) ? 1 : 0);
    spill100002_1 = this.d;
    if (!((life3_14 == 0))) {
        forestValue100002_26_0 = spill100002_1;
        break forest_join_26;
    }
    if (!((spill100002_1 != null))) {
        break forest_join_24;
    }
    ((com.moon.hY)(((com.moon.hW)(this.d)).a__hY())).g();
    }
    forestValue100002_26_0 = this.e;
    }
    if (!((life3_14 == 0))) {
        forestValue100002_35_0 = forestValue100002_26_0;
        break forest_join_35;
    }
    if (!((forestValue100002_26_0 != null))) {
        break forest_join_33;
    }
    ((com.moon.hY)(((com.moon.hW)(this.e)).a__hY())).g();
    }
    forestValue100002_35_0 = this.f;
    }
    if (!((life3_14 == 0))) {
        forestValue100002_46_0 = forestValue100002_35_0;
        break forest_join_46;
    }
    if (!((forestValue100002_35_0 != null))) {
        break forest_join_42;
    }
    ((com.moon.hY)(((com.moon.hW)(this.f)).a__hY())).g();
    }
    spill100002_2 = this;
    if (!((life3_14 == 0))) {
        forestValue100002_88_0 = spill100002_2;
        break forest_join_88;
    }
    forestValue100002_46_0 = ((com.moon.g4)(spill100002_2)).g;
    }
    if (!((forestValue100002_46_0 != null))) {
        break forest_join_51;
    }
    ((com.moon.hY)(((com.moon.hW)(this.g)).a__hY())).g();
    }
    this.d = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a__hX())).c())).a()));
    this.f = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.GRADIENT))))).a__hX())).c())).a()));
    this.e = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life4_8))))).a__hX())).c())).a()));
    this.g = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TEXTURE))))).a(((com.moon.jb)(life5_13))))).a__hX())).c())).a()));
    forestValue100002_88_0 = this;
    }
    spill100002_3 = ((com.moon.module.impl.ESP)(((com.moon.g4)(forestValue100002_88_0)).a())).isEnabled();
    if (!((life3_14 == 0))) {
        forestValue100002_182_0 = ((spill100002_3) ? 1 : 0);
        break forest_join_182;
    }
    if (!(spill100002_3)) {
        break forest_join_179;
    }
    spill100002_4 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g4)(this)).a())).a__kV())).getValue())))).booleanValue();
    if (!((life3_14 == 0))) {
        forestValue100002_182_0 = ((spill100002_4) ? 1 : 0);
        break forest_join_182;
    }
    if (!(spill100002_4)) {
        break forest_join_179;
    }
    life6_117 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.g4.a)).I)).c)).iterator();
    forest_cycle_107: while (true) {
    forest_join_177: {
    forestValue100002_109_0 = ((((java.util.Iterator)(life6_117)).hasNext()) ? 1 : 0);
    forest_cycle_109: while (true) {
    forest_join_128: {
    forest_join_126: {
    if (!((forestValue100002_109_0 != 0))) {
        break forest_join_179;
    }
    life7_124 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life6_117)).next()));
    spill100002_5 = ((com.moon.g4)(this)).a(((net.minecraft.entity.Entity)(life7_124)));
    if (!((life3_14 == 0))) {
        forestValue100002_182_0 = ((spill100002_5) ? 1 : 0);
        break forest_join_182;
    }
    if (!((life3_14 == 0))) {
        forestValue100002_126_0 = ((spill100002_5) ? 1 : 0);
        break forest_join_126;
    }
    if (!(spill100002_5)) {
        break forest_join_177;
    }
    spill100002_6 = life7_124;
    if (!((life3_14 == 0))) {
        forestValue100002_128_0 = spill100002_6;
        break forest_join_128;
    }
    forestValue100002_126_0 = ((com.moon.nG.a(((net.minecraft.entity.Entity)(spill100002_6)))) ? 1 : 0);
    }
    if (!((forestValue100002_126_0 != 0))) {
        break forest_join_177;
    }
    forestValue100002_128_0 = life7_124;
    }
    if (!((((net.minecraft.entity.Entity)(forestValue100002_128_0)).a__Vector4f() != null))) {
        break forest_join_177;
    }
    life8_148 = ((java.util.List)(this.c)).iterator();
    forest_cycle_134: while (true) {
    forest_join_172: {
    forest_join_171: {
    if (!(((java.util.Iterator)(life8_148)).hasNext())) {
        break forest_join_177;
    }
    life9_155 = ((com.moon.g9)(((java.util.Iterator)(life8_148)).next()));
    spill100002_7 = life9_155;
    spill100002_8 = life7_124;
    if (!((life3_14 == 0))) {
        forestValue100002_171_0 = spill100002_7;
        forestValue100002_171_1 = spill100002_8;
        break forest_join_171;
    }
    spill100002_9 = ((com.moon.g9)(spill100002_7)).a__Boolean(((net.minecraft.entity.Entity)(spill100002_8)));
    if (!((life3_14 == 0))) {
        forestValue100002_109_0 = ((spill100002_9) ? 1 : 0);
        continue forest_cycle_109;
    }
    if (!(spill100002_9)) {
        break forest_join_172;
    }
    ((com.moon.g9)(life9_155)).a(((com.moon.hW)(this.d)));
    ((com.moon.g9)(life9_155)).b(((com.moon.hW)(this.e)));
    ((com.moon.g9)(life9_155)).c(((com.moon.hW)(this.f)));
    ((com.moon.g9)(life9_155)).d(((com.moon.hW)(this.g)));
    forestValue100002_171_0 = life9_155;
    forestValue100002_171_1 = life7_124;
    }
    ((com.moon.g9)(forestValue100002_171_0)).a(((net.minecraft.entity.Entity)(forestValue100002_171_1)));
    }
    if (!((life3_14 != 0))) {
        continue forest_cycle_134;
    }
    break forest_cycle_134;
    }
    break forest_cycle_109;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    if (!((life3_14 != 0))) {
        continue forest_cycle_107;
    }
    break forest_cycle_107;
    }
    }
    forestValue100002_182_0 = ((((com.moon.module.impl.StorageEsp)(this.h)).isEnabled()) ? 1 : 0);
    }
    if (!((life3_14 == 0))) {
        forestValue100002_191_0 = forestValue100002_182_0;
        break forest_join_191;
    }
    if (!((forestValue100002_182_0 != 0))) {
        break forest_join_263;
    }
    forestValue100002_191_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.h)).a__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue100002_191_0 != 0))) {
        break forest_join_263;
    }
    life6_215 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.g4.a)).I)).e)).iterator();
    forest_cycle_197: while (true) {
    forest_join_261: {
    forestValue100002_199_0 = ((((java.util.Iterator)(life6_215)).hasNext()) ? 1 : 0);
    forest_cycle_199: while (true) {
    forest_join_215: {
    forest_join_211: {
    if (!((forestValue100002_199_0 != 0))) {
        break forest_join_263;
    }
    life7_222 = ((net.minecraft.tileentity.TileEntity)(((java.util.Iterator)(life6_215)).next()));
    spill100002_10 = life7_222;
    if (!((life3_14 == 0))) {
        forestValue100002_211_0 = spill100002_10;
        break forest_join_211;
    }
    if (!(com.moon.nG.a(((moom.CA)(((net.minecraft.tileentity.TileEntity)(spill100002_10)).a()))))) {
        continue forest_cycle_197;
    }
    forestValue100002_211_0 = life7_222;
    }
    if (!((((net.minecraft.tileentity.TileEntity)(forestValue100002_211_0)).a__Vector4f() == null))) {
        break forest_join_215;
    }
    if (!((life3_14 != 0))) {
        continue forest_cycle_197;
    }
    }
    life8_239 = ((java.util.List)(this.c)).iterator();
    forest_cycle_219: while (true) {
    forest_join_259: {
    forest_join_234: {
    if (!(((java.util.Iterator)(life8_239)).hasNext())) {
        break forest_join_261;
    }
    life9_246 = ((com.moon.g9)(((java.util.Iterator)(life8_239)).next()));
    spill100002_11 = life9_246;
    if (!((life3_14 == 0))) {
        forestValue100002_234_0 = spill100002_11;
        break forest_join_234;
    }
    spill100002_12 = ((spill100002_11 instanceof com.moon.ha) ? 1 : 0);
    if (!((life3_14 == 0))) {
        forestValue100002_199_0 = spill100002_12;
        continue forest_cycle_199;
    }
    if (!((spill100002_12 != 0))) {
        break forest_join_259;
    }
    forestValue100002_234_0 = life9_246;
    }
    life10_257 = ((com.moon.ha)(forestValue100002_234_0));
    ((com.moon.g9)(life9_246)).a(((com.moon.hW)(this.d)));
    ((com.moon.g9)(life9_246)).b(((com.moon.hW)(this.e)));
    ((com.moon.g9)(life9_246)).c(((com.moon.hW)(this.f)));
    ((com.moon.g9)(life9_246)).d(((com.moon.hW)(this.g)));
    ((com.moon.ha)(life10_257)).a__Void(((net.minecraft.tileentity.TileEntity)(life7_222)));
    }
    if (!((life3_14 != 0))) {
        continue forest_cycle_219;
    }
    break forest_cycle_219;
    }
    break forest_cycle_199;
    }
    }
    if (!((life3_14 != 0))) {
        continue forest_cycle_197;
    }
    break forest_cycle_197;
    }
    }
    return;
}


public void c__Void() {
return;
}


private void d() {
((java.util.List)(this.c)).add(((java.lang.Object)(new com.moon.ha(((com.moon.g4)(this)).a(), this.h))));
    ((java.util.List)(this.c)).add(((java.lang.Object)(new com.moon.hb(((com.moon.g4)(this)).a()))));
    ((java.util.List)(this.c)).add(((java.lang.Object)(new com.moon.g_(((com.moon.g4)(this)).a()))));
    ((java.util.List)(this.c)).add(((java.lang.Object)(new com.moon.hc(((com.moon.g4)(this)).a()))));
    ((java.util.List)(this.c)).add(((java.lang.Object)(new com.moon.he(((com.moon.g4)(this)).a()))));
    ((java.util.List)(this.c)).add(((java.lang.Object)(new com.moon.hd(((com.moon.g4)(this)).a()))));
    return;
}


public void a__Void() {
java.util.Iterator forestValue57_94_0;
    int forestValue57_117_0;
    net.minecraft.entity.Entity forestValue57_146_0;
    net.minecraft.item.ItemStack forestValue57_155_0;
    float forestValue57_184_0;
    float forestValue57_184_1;
    float forestValue57_185_0;
    float forestValue57_186_0;
    float forestValue57_186_1;
    float forestValue57_199_0;
    float forestValue57_199_1;
    float forestValue57_200_0;
    float forestValue57_201_0;
    float forestValue57_201_1;
    com.moon.g4 forestValue57_252_0;
    com.moon.hW forestValue57_261_0;
    com.moon.hW forestValue57_269_0;
    com.moon.hW forestValue57_277_0;
    com.moon.hW forestValue57_282_0;
    int forestValue57_290_0;
    com.moon.g4 spill57_0;
    com.moon.g4 spill57_1;
    com.moon.g4 spill57_2;
    int spill57_3;
    long spill57_4;
    int spill57_5;
    java.util.Iterator spill57_6;
    boolean spill57_7;
    net.minecraft.entity.Entity spill57_8;
    net.minecraft.item.ItemStack spill57_9;
    float spill57_10;
    float spill57_11;
    float spill57_12;
    float spill57_13;
    float spill57_14;
    float spill57_15;
    com.moon.hW spill57_16;
    long life1_3;
    int life3_5;
    com.moon.jb life4_38;
    java.util.Iterator life5_97;
    net.minecraft.entity.Entity life6_106;
    org.lwjgl.util.vector.Vector4f life7_109;
    float life8_130;
    float life9_133;
    float life10_136;
    float life11_139;
    float life12_143;
    float life13_147;
    net.minecraft.entity.player.EntityPlayer life14_157;
    net.minecraft.item.ItemStack life15_167;
    float life16_177;
    float life17_218;
    forest_join_291: {
    forest_join_290: {
    forest_join_289: {
    forest_join_283: {
    forest_join_282: {
    forest_join_277: {
    forest_join_275: {
    forest_join_269: {
    forest_join_267: {
    forest_join_261: {
    forest_join_259: {
    forest_join_252: {
    forest_join_250: {
    forest_join_248: {
    forest_join_230: {
    life1_3 = (com.moon.g4.i ^ 130090365684943L);
    life3_5 = ((net.minecraft.creativetab.CreativeTabs.e()) ? 1 : 0);
    spill57_0 = this;
    if (!((life3_5 != 0))) {
        forestValue57_252_0 = spill57_0;
        break forest_join_252;
    }
    if (!(((com.moon.module.impl.ESP)(((com.moon.g4)(spill57_0)).a())).isEnabled())) {
        break forest_join_250;
    }
    spill57_1 = this;
    if (!((life3_5 != 0))) {
        forestValue57_252_0 = spill57_1;
        break forest_join_252;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g4)(spill57_1)).a())).k__kV())).getValue())))).booleanValue())) {
        break forest_join_250;
    }
    spill57_2 = this;
    if (!((life3_5 != 0))) {
        forestValue57_252_0 = spill57_2;
        break forest_join_252;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g4)(spill57_2)).a())).l())).getValue())))).booleanValue())) {
        break forest_join_250;
    }
    life4_38 = ((com.moon.je)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__je())).a();
    spill57_3 = 8413;
    net.minecraft.client.gui.Gui.a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(0)));
    spill57_4 = (4116371732427312267L ^ life1_3);
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(com.moon.g4.a)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    ((net.minecraft.client.renderer.texture.ITextureObject)(((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(com.moon.g4.a)).a__ok())).a(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k))))).a(((boolean)(false)), ((boolean)(false)));
    ((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(com.moon.g4.a)).R)).j();
    moom.lt.c();
    moom.kZ.j();
    moom.kZ.y();
    moom.kZ.d__Void();
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic57_35(spill57_3, spill57_4))), ((float)(0x1.99999ap-4f)));
    spill57_5 = 8525;
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic57_38(spill57_5, (8972428712777682202L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic57_39(21428, (3718631081044967393L ^ life1_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.a(((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    life5_97 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.g4.a)).I)).c)).iterator();
    forest_cycle_93: while (true) {
    forest_join_228: {
    forest_join_201: {
    forest_join_200: {
    forest_join_199: {
    forest_join_186: {
    forest_join_185: {
    forest_join_184: {
    forest_join_155: {
    forest_join_146: {
    forest_join_120: {
    forest_join_117: {
    forestValue57_94_0 = life5_97;
    forest_cycle_94: while (true) {
    if (!(((java.util.Iterator)(forestValue57_94_0)).hasNext())) {
        break forest_join_230;
    }
    spill57_6 = life5_97;
    if (!((life3_5 != 0))) {
        forestValue57_94_0 = spill57_6;
        continue forest_cycle_94;
    }
    break forest_cycle_94;
    }
    life6_106 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(spill57_6)).next()));
    life7_109 = ((net.minecraft.entity.Entity)(life6_106)).a__Vector4f();
    if (!((life3_5 != 0))) {
        break forest_join_248;
    }
    if (!((life7_109 != null))) {
        continue forest_cycle_93;
    }
    spill57_7 = ((com.moon.g4)(this)).a(((net.minecraft.entity.Entity)(life6_106)));
    if (!((life3_5 != 0))) {
        forestValue57_117_0 = ((spill57_7) ? 1 : 0);
        break forest_join_117;
    }
    if (!(spill57_7)) {
        continue forest_cycle_93;
    }
    forestValue57_117_0 = ((com.moon.nG.a(((net.minecraft.entity.Entity)(life6_106)))) ? 1 : 0);
    }
    if (!((forestValue57_117_0 == 0))) {
        break forest_join_120;
    }
    if (!((life3_5 == 0))) {
        continue forest_cycle_93;
    }
    }
    life8_130 = ((org.lwjgl.util.vector.Vector4f)(life7_109)).x;
    life9_133 = ((org.lwjgl.util.vector.Vector4f)(life7_109)).y;
    life10_136 = ((org.lwjgl.util.vector.Vector4f)(life7_109)).z;
    life11_139 = ((org.lwjgl.util.vector.Vector4f)(life7_109)).w;
    life12_143 = (life10_136 - life8_130);
    life13_147 = (life11_139 - life9_133);
    spill57_8 = life6_106;
    if (!((life3_5 != 0))) {
        forestValue57_146_0 = spill57_8;
        break forest_join_146;
    }
    if (!((((spill57_8 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forest_join_228;
    }
    forestValue57_146_0 = life6_106;
    }
    life14_157 = ((net.minecraft.entity.player.EntityPlayer)(forestValue57_146_0));
    spill57_9 = ((net.minecraft.entity.player.EntityPlayer)(life14_157)).a__xW();
    if (!((life3_5 != 0))) {
        forestValue57_155_0 = spill57_9;
        break forest_join_155;
    }
    if (!((spill57_9 != null))) {
        break forest_join_228;
    }
    forestValue57_155_0 = ((net.minecraft.entity.player.EntityPlayer)(life14_157)).a__xW();
    }
    life15_167 = forestValue57_155_0;
    life16_177 = (((life8_130 + (life12_143 / 0x1.0p1f)) - 0x1.0p2f) * 0x1.0p1f);
    spill57_10 = (life9_133 + life13_147);
    spill57_11 = 0x1.0p1f;
    if (!((life3_5 != 0))) {
        forestValue57_184_0 = spill57_10;
        forestValue57_184_1 = spill57_11;
        break forest_join_184;
    }
    spill57_12 = (spill57_10 + spill57_11);
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g4)(this)).a())).m())).getValue())))).booleanValue())) {
        forestValue57_185_0 = spill57_12;
        break forest_join_185;
    }
    forestValue57_184_0 = spill57_12;
    forestValue57_184_1 = (((com.moon.jb)(life4_38)).a() + 0x1.0p1f);
    }
    forestValue57_186_0 = forestValue57_184_0;
    forestValue57_186_1 = forestValue57_184_1;
    break forest_join_186;
    }
    forestValue57_186_0 = forestValue57_185_0;
    forestValue57_186_1 = 0x0.0p0f;
    }
    spill57_13 = (forestValue57_186_0 + forestValue57_186_1);
    spill57_14 = 0x1.0p1f;
    if (!((life3_5 != 0))) {
        forestValue57_199_0 = spill57_13;
        forestValue57_199_1 = spill57_14;
        break forest_join_199;
    }
    spill57_15 = (spill57_13 * spill57_14);
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g4)(this)).a())).j__kV())).getValue())))).booleanValue())) {
        forestValue57_200_0 = spill57_15;
        break forest_join_200;
    }
    forestValue57_199_0 = spill57_15;
    forestValue57_199_1 = 0x1.4p1f;
    }
    forestValue57_201_0 = forestValue57_199_0;
    forestValue57_201_1 = forestValue57_199_1;
    break forest_join_201;
    }
    forestValue57_201_0 = forestValue57_200_0;
    forestValue57_201_1 = 0x0.0p0f;
    }
    life17_218 = (forestValue57_201_0 + forestValue57_201_1);
    ((com.moon.g4)(this)).a(((net.minecraft.item.ItemStack)(life15_167)), ((float)((life16_177 + 0x1.0p0f))), ((float)((life17_218 + 0x1.0p0f))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic57_74(3541, (3472416586116047239L ^ life1_3)))));
    ((com.moon.g4)(this)).a(((net.minecraft.item.ItemStack)(life15_167)), ((float)(life16_177)), ((float)(life17_218)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g4)(this)).a())).g__kX())).getValue())))).intValue())));
    }
    if (!((life3_5 == 0))) {
        continue forest_cycle_93;
    }
    break forest_cycle_93;
    }
    }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.a(((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((float)(0x1.0p0f)));
    moom.kZ.c__Void();
    moom.kZ.z();
    moom.kZ.f();
    moom.lt.a();
    ((net.minecraft.client.renderer.texture.ITextureObject)(((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(com.moon.g4.a)).a__ok())).a(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k))))).a__Void();
    }
    moom.kZ.i(((int)(0)));
    }
    moom.kZ.l();
    forestValue57_252_0 = this;
    }
    spill57_16 = ((com.moon.g4)(forestValue57_252_0)).d;
    if (!((life3_5 != 0))) {
        forestValue57_261_0 = spill57_16;
        break forest_join_261;
    }
    if (!((spill57_16 != null))) {
        break forest_join_259;
    }
    ((com.moon.hW)(this.d)).b();
    }
    forestValue57_261_0 = this.e;
    }
    if (!((life3_5 != 0))) {
        forestValue57_269_0 = forestValue57_261_0;
        break forest_join_269;
    }
    if (!((forestValue57_261_0 != null))) {
        break forest_join_267;
    }
    ((com.moon.hW)(this.e)).b();
    }
    forestValue57_269_0 = this.f;
    }
    if (!((life3_5 != 0))) {
        forestValue57_277_0 = forestValue57_269_0;
        break forest_join_277;
    }
    if (!((forestValue57_269_0 != null))) {
        break forest_join_275;
    }
    ((com.moon.hW)(this.f)).b();
    }
    forestValue57_277_0 = this.g;
    }
    if (!((life3_5 != 0))) {
        forestValue57_282_0 = forestValue57_277_0;
        break forest_join_282;
    }
    if (!((forestValue57_277_0 != null))) {
        break forest_join_283;
    }
    forestValue57_282_0 = this.g;
    }
    ((com.moon.hW)(forestValue57_282_0)).b();
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forest_join_291;
    }
    if (!((life3_5 != 0))) {
        break forest_join_289;
    }
    forestValue57_290_0 = 0;
    break forest_join_290;
    }
    forestValue57_290_0 = 1;
    }
    net.minecraft.creativetab.CreativeTabs.b(((boolean)__sourceIntrinsic_integerToBoolean((forestValue57_290_0))));
    }
    return;
}


private void a(net.minecraft.item.ItemStack p0, float p1, float p2, int p3) {
long local5_life2 = (com.moon.g4.i ^ 57650223576351L);
    moom.kZ.a(((boolean)(false)), ((boolean)(false)), ((boolean)(false)), ((boolean)(true)));
    ((net.minecraft.client.renderer.entity.RenderItem)(((net.minecraft.client.Minecraft)(com.moon.g4.a)).a__nv())).b(((net.minecraft.item.ItemStack)(p0)), ((float)(p1)), ((float)(p2)));
    moom.kZ.a(((boolean)(true)), ((boolean)(true)), ((boolean)(true)), ((boolean)(true)));
    org.lwjgl.opengl.GL11C.glDepthFunc(((int)(__sourceIntrinsic_ad5c1a5ebc00_originalDynamicSite22_9(20730, (3645747767671489918L ^ local5_life2)))));
    com.moon.nR.a(((float)((p1 - 1103626240))), ((float)((p2 - 1103626240))), ((float)(1112014848)), ((float)(1112014848)), ((int)(p3)));
    org.lwjgl.opengl.GL11C.glDepthFunc(((int)(__sourceIntrinsic_ad5c1a5ebc00_originalDynamicSite22_17(6734, (2963526954877767629L ^ local5_life2)))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((1) != 0);
}


private int a__sourceReturn_8abf5c6871() {
return ((org.lwjgl.opengl.DisplayMode)(org.lwjgl.opengl.Display.getDesktopDisplayMode())).getFrequency();
}


private static native <E extends Throwable> int __sourceIntrinsic_ad5c1a5ebc00_originalDynamicSite22_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ad5c1a5ebc00_originalDynamicSite22_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic57_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic57_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic57_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic57_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1191_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
