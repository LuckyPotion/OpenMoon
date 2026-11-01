package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hK extends net.minecraft.client.gui.Gui {

private static final moom.DD f;

private final net.minecraft.client.Minecraft g;

private int h;

private int i;

private java.lang.String j;

private java.lang.String k;

private moom.BZ l;

private long m;

private final net.minecraft.client.renderer.entity.RenderItem n;

private boolean o;

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map s;

private static final long t;

public hK(net.minecraft.client.Minecraft p0) {
super();
    this.g = p0;
    this.n = (p0).a__nv();
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-4966466678118444277L)), ((long)(-3965524752731811140L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(167687765898776L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.hK.p ^ 64265544930354L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill865_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill865_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill865_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill865_14 = new byte[8];
    (__sourceSpill865_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill865_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation865_16 = __sourceSpill865_14;
    ((javax.crypto.Cipher)(__sourceSpill865_11)).init(((int)(__sourceSpill865_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill865_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation865_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[19];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "\002ìÓÚÍÑ«\b\"z:EÚó{û\004V¡\b\037»\006.é\032\\èT'£àYÑà¥\bÅéøøóh-4\024éfÉæ\037ßÓ\003Ü\022´o­\033H&;æ{\023q0\b ¢T-\fµÁ3·:\".Â#2¤ì\177áãût!\026\032]~ýÐ\032^Úãy×N8ÀQó(^c\034]\032¬/$Ë¹çpo"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill865_25 = local11_life21;
        int __sourceSpill865_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill865_25)).substring(((int)(__sourceSpill865_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill865_30 = local13_life19;
        int __sourceSpill865_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill865_33 = new byte[8];
        (__sourceSpill865_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill865_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill865_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill865_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill865_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill865_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill865_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill865_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill865_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill865_34)).doFinal(((byte[])(__sourceSpill865_33)));
        (__sourceSpill865_30)[__sourceSpill865_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "\033â\013sm\177`§íºî¦í\027\\"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill865_38 = local11_life21;
        int __sourceSpill865_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill865_38)).substring(((int)(__sourceSpill865_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill865_43 = local13_life19;
        int __sourceSpill865_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill865_46 = new byte[8];
        (__sourceSpill865_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill865_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill865_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill865_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill865_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill865_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill865_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill865_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill865_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill865_47)).doFinal(((byte[])(__sourceSpill865_46)));
        (__sourceSpill865_43)[__sourceSpill865_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    q = ((long[])(local13_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[19]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill865_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill865_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill865_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill865_58 = new byte[8];
    (__sourceSpill865_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill865_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation865_60 = __sourceSpill865_58;
    ((javax.crypto.Cipher)(__sourceSpill865_55)).init(((int)(__sourceSpill865_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill865_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation865_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = 5635402480872125564L;
    byte[] __sourceSpill865_64 = new byte[8];
    (__sourceSpill865_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill865_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill865_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill865_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill865_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill865_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill865_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill865_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill865_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill865_65)).doFinal(((byte[])(__sourceSpill865_64)));
    t = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
    f = ((moom.DD)(new moom.DD("textures/gui/achievement/achievement_background.png")));
}


public void b() {
long life1_3;
    double life3_28;
    double life5_66;
    double life5_78;
    double life5_82;
    double life5_92;
    double life5_96;
    int life7_105;
    int life8_111;
    forward_join_245: {
    forward_join_216: {
    forward_join_164: {
    forward_join_75: {
    forward_join_61: {
    forward_join_44: {
    forward_join_38: {
    forward_join_34: {
    life1_3 = (moom.hK.p ^ 19530905238484L);
    if (!((this.l != null))) { break forward_join_245; }
    if (!((recovery.source.CarrierOps.lcmp(((long)(this.m)), ((long)(0L))) != 0))) { break forward_join_245; }
    if (!((((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K != null))) { break forward_join_245; }
    life3_28 = (((double) (net.minecraft.client.Minecraft.a__Long() - this.m)) / 0x1.77p11d);
    if (!((!this.o))) { break forward_join_38; }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life3_28)), ((double)(0x0.0p0d))) >= 0))) { break forward_join_34; }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life3_28)), ((double)(0x1.0p0d))) > 0))) { break forward_join_44; }
    }
    this.m = ((long)(0L));
    return;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life3_28)), ((double)(0x1.0p-1d))) > 0))) { break forward_join_44; }
    life3_28 = 0x1.0p-1d;
    }
    ((moom.hK)(this)).a();
    moom.kZ.i();
    moom.kZ.a(((boolean)(false)));
    life5_66 = (life3_28 * 0x1.0p1d);
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life5_66)), ((double)(0x1.0p0d))) > 0))) { break forward_join_61; }
    life5_66 = (0x1.0p1d - life5_66);
    }
    life5_78 = (life5_66 * 0x1.0p2d);
    life5_82 = (0x1.0p0d - life5_78);
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life5_82)), ((double)(0x0.0p0d))) < 0))) { break forward_join_75; }
    life5_82 = 0x0.0p0d;
    }
    life5_92 = (life5_82 * life5_82);
    life5_96 = (life5_92 * life5_92);
    life7_105 = (this.h - __sourceIntrinsic_938da207dded_invokedynamic4181_19(13615, (2713387851035088084L ^ life1_3)));
    life8_111 = (-((int) (life5_96 * 0x1.2p5d)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.u();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.g)).a__ok())).a__Void(((moom.DD)(moom.hK.f)));
    moom.kZ.f();
    ((moom.hK)(this)).b(((int)(life7_105)), ((int)(life8_111)), ((int)(__sourceIntrinsic_938da207dded_invokedynamic4181_27(6333, (5289954677552593225L ^ life1_3)))), ((int)(__sourceIntrinsic_938da207dded_invokedynamic4181_28(31596, (4967085911820360348L ^ life1_3)))), ((int)(__sourceIntrinsic_938da207dded_invokedynamic4181_29(22000, (6405014250328749063L ^ life1_3)))), ((int)(__sourceIntrinsic_938da207dded_invokedynamic4181_30(28245, (924865483433496491L ^ life1_3)))));
    if (!(this.o)) { break forward_join_164; }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(this.k)), ((int)((life7_105 + __sourceIntrinsic_938da207dded_invokedynamic4181_36(29080, (1137544955446579305L ^ life1_3))))), ((int)((life8_111 + __sourceIntrinsic_938da207dded_invokedynamic4181_37(12472, (325436404829884738L ^ life1_3))))), ((int)(__sourceIntrinsic_938da207dded_invokedynamic4181_38(11022, (5503785833909717757L ^ life1_3)))), ((int)(-1)));
    break forward_join_216;
    }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).b(((java.lang.String)(this.j)), ((float)(((float) (life7_105 + __sourceIntrinsic_938da207dded_invokedynamic4181_43(6190, (7420740860465527244L ^ life1_3)))))), ((float)(((float) (life8_111 + __sourceIntrinsic_938da207dded_invokedynamic4181_44(29121, (4928596721507586103L ^ life1_3)))))), ((int)(__sourceIntrinsic_938da207dded_invokedynamic4181_45(1941, (9159030968849311340L ^ life1_3)))));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).b(((java.lang.String)(this.k)), ((float)(((float) (life7_105 + __sourceIntrinsic_938da207dded_invokedynamic4181_50(6190, (7420740860465527244L ^ life1_3)))))), ((float)(((float) (life8_111 + __sourceIntrinsic_938da207dded_invokedynamic4181_51(14419, (2249196149565397409L ^ life1_3)))))), ((int)(-1)));
    }
    moom.lt.c();
    moom.kZ.f();
    moom.kZ.y();
    moom.kZ.g();
    moom.kZ.e();
    ((net.minecraft.client.renderer.entity.RenderItem)(this.n)).a(((net.minecraft.item.ItemStack)(((moom.BZ)(this.l)).s)), ((int)((life7_105 + __sourceIntrinsic_938da207dded_invokedynamic4181_61(15534, (5854920247256751438L ^ life1_3))))), ((int)((life8_111 + __sourceIntrinsic_938da207dded_invokedynamic4181_62(15270, (7213653115500141139L ^ life1_3))))));
    moom.kZ.f();
    moom.kZ.a(((boolean)(true)));
    moom.kZ.j();
    }
    return;
}


public void b(moom.BZ p0) {
long local2 = (moom.hK.p ^ 70390186790455L);
    this.j = ((java.lang.String)(((net.minecraft.util.IChatComponent)(((moom.BZ)(p0)).a__C5())).b()));
    this.k = ((java.lang.String)(((moom.BZ)(p0)).a__sourceReturn_0e30dfc966()));
    this.m = ((long)((net.minecraft.client.Minecraft.a__Long() + moom.hK.t)));
    this.l = ((moom.BZ)(p0));
    this.o = ((boolean)(true));
    return;
}


public void c() {
this.l = ((moom.BZ)(null));
    this.m = ((long)(0L));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7891_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12009;
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
            throw new RuntimeException("moom/hK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.BZ p0) {
this.j = ((java.lang.String)(moom.oO.a(((java.lang.String)("achievement.get")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.k = ((java.lang.String)(((net.minecraft.util.IChatComponent)(((moom.BZ)(p0)).a__C5())).b()));
    this.m = ((long)(net.minecraft.client.Minecraft.a__Long()));
    this.l = ((moom.BZ)(p0));
    this.o = ((boolean)(false));
    return;
}


private void a() {
long local1 = (moom.hK.p ^ 52459522094084L);
    moom.kZ.b(((int)(0)), ((int)(0)), ((int)(((net.minecraft.client.Minecraft)(this.g)).G)), ((int)(((net.minecraft.client.Minecraft)(this.g)).H)));
    moom.kZ.l(((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_6(4016, (5794334271434842527L ^ local1)))));
    moom.kZ.A();
    moom.kZ.l(((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_9(22781, (4347439866474706641L ^ local1)))));
    moom.kZ.A();
    this.h = ((int)(((net.minecraft.client.Minecraft)(this.g)).G));
    this.i = ((int)(((net.minecraft.client.Minecraft)(this.g)).H));
    moom.ir local3 = new moom.ir(this.g);
    this.h = ((int)(((moom.ir)(local3)).a__Int()));
    this.i = ((int)(((moom.ir)(local3)).b__Int()));
    moom.kZ.k(((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_23(11942, (3740785852220227735L ^ local1)))));
    moom.kZ.l(((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_25(27813, (346023178489299592L ^ local1)))));
    moom.kZ.A();
    moom.kZ.a(((double)(0x0.0p0d)), ((double)(((double) this.h))), ((double)(((double) this.i))), ((double)(0x0.0p0d)), ((double)(0x1.f4p9d)), ((double)(0x1.77p11d)));
    moom.kZ.l(((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_31(30181, (3253220902704454605L ^ local1)))));
    moom.kZ.A();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.f4p10f)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic4181_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7891_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite1486_31(int a0, long a1) throws E;
}
