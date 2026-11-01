package net.minecraft.client.model;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ModelOcelot extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

public moom.jD l;

public moom.jD m;

public moom.jD n;

public moom.jD o;

public moom.jD p;

int q;

private static long r;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

public ModelOcelot() { super(); }


private static void __sourceConstructorBody_8293f8d3bdca5111(net.minecraft.client.model.ModelOcelot receiver) throws Throwable {

long local1 = (net.minecraft.client.model.ModelOcelot.r ^ 21897387371802L);

    net.minecraft.client.model.ModelOcelot.__sourceConstructorInit_8293f8d3bdca5111_0(((net.minecraft.client.model.ModelOcelot)(receiver)));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).q = ((int)(1));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).a(((java.lang.String)("head.main")), ((int)(0)), ((int)(0)));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).a(((java.lang.String)("head.nose")), ((int)(0)), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_4(23852, (7169984082766001208L ^ local1)))));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).a(((java.lang.String)("head.ear1")), ((int)(0)), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_6(20001, (8788222136180172605L ^ local1)))));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).a(((java.lang.String)("head.ear2")), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_8(9936, (1123214979141078990L ^ local1)))), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_9(2043, (647271827257634531L ^ local1)))));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).o = ((moom.jD)(new moom.jD(receiver, "head")));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).o)).a(((java.lang.String)("main")), ((float)(-0x1.4p1f)), ((float)(-0x1.0p1f)), ((float)(-0x1.8p1f)), ((int)(5)), ((int)(4)), ((int)(5)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).o)).a(((java.lang.String)("nose")), ((float)(-0x1.8p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p2f)), ((int)(3)), ((int)(2)), ((int)(2)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).o)).a(((java.lang.String)("ear1")), ((float)(-0x1.0p1f)), ((float)(-0x1.8p1f)), ((float)(0x0.0p0f)), ((int)(1)), ((int)(1)), ((int)(2)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).o)).a(((java.lang.String)("ear2")), ((float)(0x1.0p0f)), ((float)(-0x1.8p1f)), ((float)(0x0.0p0f)), ((int)(1)), ((int)(1)), ((int)(2)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).o)).a(((float)(0x0.0p0f)), ((float)(0x1.ep3f)), ((float)(-0x1.2p3f)));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).p = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_22(7178, (1335491268587107586L ^ local1)), 0)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).p)).a(((float)(-0x1.0p1f)), ((float)(0x1.8p1f)), ((float)(-0x1.0p3f)), ((int)(4)), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_25(20620, (8045346047777569174L ^ local1)))), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_26(20470, (6347269976226391783L ^ local1)))), ((float)(0x0.0p0f)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).p)).a(((float)(0x0.0p0f)), ((float)(0x1.8p3f)), ((float)(-0x1.4p3f)));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).m = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_30(29999, (6233545030734175284L ^ local1)))));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).m)).a(((float)(-0x1.0p-1f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(1)), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_33(979, (129293508729612997L ^ local1)))), ((int)(1)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).m)).h = ((float)(0x1.ccccccp-1f));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).m)).a(((float)(0x0.0p0f)), ((float)(0x1.ep3f)), ((float)(0x1.0p3f)));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).n = ((moom.jD)(new moom.jD(receiver, 4, __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_39(21561, (5896990796131958054L ^ local1)))));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).n)).a(((float)(-0x1.0p-1f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(1)), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_42(30307, (6602233312318578550L ^ local1)))), ((int)(1)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).n)).a(((float)(0x0.0p0f)), ((float)(0x1.4p4f)), ((float)(0x1.cp3f)));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).i = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_46(30307, (6602233312318578550L ^ local1)), __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_47(17608, (5871217281050930648L ^ local1)))));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).i)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_50(20470, (6347269976226391783L ^ local1)))), ((int)(2)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).i)).a(((float)(0x1.19999ap0f)), ((float)(0x1.2p4f)), ((float)(0x1.4p2f)));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).j = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_54(30307, (6602233312318578550L ^ local1)), __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_55(31822, (5424690197959923036L ^ local1)))));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).j)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_58(20470, (6347269976226391783L ^ local1)))), ((int)(2)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).j)).a(((float)(-0x1.19999ap0f)), ((float)(0x1.2p4f)), ((float)(0x1.4p2f)));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).k = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_62(21006, (431377676163676951L ^ local1)), 0)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).k)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_65(2043, (647271827257634531L ^ local1)))), ((int)(2)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).k)).a(((float)(0x1.333334p0f)), ((float)(0x1.b9999ap3f)), ((float)(-0x1.4p2f)));

    ((net.minecraft.client.model.ModelOcelot)(receiver)).l = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_69(32557, (1026361632974198334L ^ local1)), 0)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).l)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_72(2043, (647271827257634531L ^ local1)))), ((int)(2)));

    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(receiver)).l)).a(((float)(-0x1.333334p0f)), ((float)(0x1.b9999ap3f)), ((float)(-0x1.4p2f)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_8293f8d3bdca5111_0(net.minecraft.client.model.ModelOcelot a0) throws E;

static {
r = ((long)(((moom._a)(moom._c.a(((long)(-4561970492120786921L)), ((long)(-2223529843517066235L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213601849290506L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.model.ModelOcelot.r ^ 75054426684006L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1795_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1795_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1795_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1795_14 = new byte[8];
    (__sourceSpill1795_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1795_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1795_16 = __sourceSpill1795_14;
    ((javax.crypto.Cipher)(__sourceSpill1795_11)).init(((int)(__sourceSpill1795_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1795_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1795_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[17];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¡:vM\r\\D\nôY&«®+õMÕ\023>\0021\033áàO#OºògÓ`À6w8lRR}Ló\013Ò%Åù£\021³\005vt\035Y\035ÝéN\005\036t\000mþ@·m m\r³-E´Ûé5/¶aÐ\032\037â0.®íeNO4Íªä\000ÇO^BÙèK\003."))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1795_25 = local6_life21;
        int __sourceSpill1795_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1795_25)).substring(((int)(__sourceSpill1795_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1795_30 = local8_life19;
        int __sourceSpill1795_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1795_33 = new byte[8];
        (__sourceSpill1795_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1795_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1795_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1795_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1795_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1795_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1795_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1795_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1795_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1795_34)).doFinal(((byte[])(__sourceSpill1795_33)));
        (__sourceSpill1795_30)[__sourceSpill1795_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "h/@öÜ\001\"vÀ)Ly¡û\013¢"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1795_38 = local6_life21;
        int __sourceSpill1795_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1795_38)).substring(((int)(__sourceSpill1795_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1795_43 = local8_life19;
        int __sourceSpill1795_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1795_46 = new byte[8];
        (__sourceSpill1795_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1795_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1795_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1795_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1795_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1795_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1795_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1795_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1795_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1795_47)).doFinal(((byte[])(__sourceSpill1795_46)));
        (__sourceSpill1795_43)[__sourceSpill1795_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[17]));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13894;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.model.ModelOcelot.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10429_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
int forwardValue4800_31_0;
    int forwardValue4800_31_1;
    int forwardValue4800_152_0;
    int forwardValue4800_152_1;
    net.minecraft.client.model.ModelOcelot forwardValue4800_167_0;
    net.minecraft.entity.Entity[] spill4800_0;
    int spill4800_1;
    int spill4800_2;
    net.minecraft.client.model.ModelOcelot spill4800_3;
    long life8_3;
    net.minecraft.entity.Entity[] life10_11;
    forward_join_177: {
    forward_join_167: {
    forward_join_166: {
    forward_join_152: {
    forward_join_99: {
    forward_join_31: {
    life8_3 = (net.minecraft.client.model.ModelOcelot.r ^ 17102504478678L);
    spill4800_0 = moom.iQ.b();
    ((moom.jD)(this.o)).h = ((float)((p4 / 0x1.ca5dcp5f)));
    life10_11 = spill4800_0;
    ((moom.jD)(this.o)).i = ((float)((p3 / 0x1.ca5dcp5f)));
    spill4800_1 = this.q;
    spill4800_2 = 3;
    if (!((life10_11 != null))) {
        forwardValue4800_31_0 = spill4800_1;
        forwardValue4800_31_1 = spill4800_2;
        break forward_join_31;
    }
    if (!((spill4800_1 != spill4800_2))) {
        break forward_join_177;
    }
    ((moom.jD)(this.p)).h = ((float)(0x1.921fb6p0f));
    forwardValue4800_31_0 = this.q;
    forwardValue4800_31_1 = 2;
    }
    if (!((life10_11 != null))) {
        forwardValue4800_152_0 = forwardValue4800_31_0;
        forwardValue4800_152_1 = forwardValue4800_31_1;
        break forward_join_152;
    }
    if (!((forwardValue4800_31_0 == forwardValue4800_31_1))) {
        break forward_join_99;
    }
    ((moom.jD)(this.i)).h = ((float)(((moom.Dr.b(((float)((p0 * 0x1.55182ap-1f)))) * 0x1.0p0f) * p1)));
    ((moom.jD)(this.j)).h = ((float)(((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.333334p-2f)))) * 0x1.0p0f) * p1)));
    ((moom.jD)(this.k)).h = ((float)(((moom.Dr.b(((float)((((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f) + 0x1.333334p-2f)))) * 0x1.0p0f) * p1)));
    ((moom.jD)(this.l)).h = ((float)(((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f)))) * 0x1.0p0f) * p1)));
    ((moom.jD)(this.n)).h = ((float)((0x1.ba5616p0f + ((0x1.41b2f8p-2f * moom.Dr.b(((float)(p0)))) * p1))));
    if (!((life10_11 == null))) {
        break forward_join_177;
    }
    }
    ((moom.jD)(this.i)).h = ((float)(((moom.Dr.b(((float)((p0 * 0x1.55182ap-1f)))) * 0x1.0p0f) * p1)));
    ((moom.jD)(this.j)).h = ((float)(((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f)))) * 0x1.0p0f) * p1)));
    ((moom.jD)(this.k)).h = ((float)(((moom.Dr.b(((float)(((p0 * 0x1.55182ap-1f) + 0x1.921fb6p1f)))) * 0x1.0p0f) * p1)));
    ((moom.jD)(this.l)).h = ((float)(((moom.Dr.b(((float)((p0 * 0x1.55182ap-1f)))) * 0x1.0p0f) * p1)));
    spill4800_3 = this;
    if (!((life10_11 != null))) {
        forwardValue4800_167_0 = spill4800_3;
        break forward_join_167;
    }
    forwardValue4800_152_0 = ((net.minecraft.client.model.ModelOcelot)(spill4800_3)).q;
    forwardValue4800_152_1 = 1;
    }
    if (!((forwardValue4800_152_0 == forwardValue4800_152_1))) {
        break forward_join_166;
    }
    ((moom.jD)(this.n)).h = ((float)((0x1.ba5616p0f + ((0x1.921fb6p-1f * moom.Dr.b(((float)(p0)))) * p1))));
    if (!((life10_11 == null))) {
        break forward_join_177;
    }
    }
    forwardValue4800_167_0 = this;
    }
    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(forwardValue4800_167_0)).n)).h = ((float)((0x1.ba5616p0f + ((0x1.e28c76p-2f * moom.Dr.b(((float)(p0)))) * p1))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
net.minecraft.client.model.ModelOcelot forwardValue4801_123_0;
    net.minecraft.entity.Entity[] spill4801_0;
    net.minecraft.client.model.ModelOcelot spill4801_1;
    long life8_3;
    net.minecraft.entity.Entity[] life10_14;
    float life11_24;
    forward_join_126: {
    forward_join_123: {
    forward_join_94: {
    life8_3 = (net.minecraft.client.model.ModelOcelot.r ^ 123233663257598L);
    spill4801_0 = moom.iQ.b();
    ((net.minecraft.client.model.ModelOcelot)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    life10_14 = spill4801_0;
    spill4801_1 = this;
    if (!((life10_14 != null))) {
        forwardValue4801_123_0 = spill4801_1;
        break forward_join_123;
    }
    if (!(((net.minecraft.client.model.ModelOcelot)(spill4801_1)).c)) {
        break forward_join_94;
    }
    life11_24 = 0x1.0p1f;
    moom.kZ.B();
    moom.kZ.a(((float)((0x1.8p0f / life11_24))), ((float)((0x1.8p0f / life11_24))), ((float)((0x1.8p0f / life11_24))));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.4p3f * p6))), ((float)((0x1.0p2f * p6))));
    ((moom.jD)(this.o)).a(((float)(p6)));
    moom.kZ.C();
    moom.kZ.B();
    moom.kZ.a(((float)((0x1.0p0f / life11_24))), ((float)((0x1.0p0f / life11_24))), ((float)((0x1.0p0f / life11_24))));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.8p4f * p6))), ((float)(0x0.0p0f)));
    ((moom.jD)(this.p)).a(((float)(p6)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    ((moom.jD)(this.k)).a(((float)(p6)));
    ((moom.jD)(this.l)).a(((float)(p6)));
    ((moom.jD)(this.m)).a(((float)(p6)));
    ((moom.jD)(this.n)).a(((float)(p6)));
    moom.kZ.C();
    if (!((life10_14 == null))) {
        break forward_join_126;
    }
    }
    ((moom.jD)(this.o)).a(((float)(p6)));
    ((moom.jD)(this.p)).a(((float)(p6)));
    ((moom.jD)(this.m)).a(((float)(p6)));
    ((moom.jD)(this.n)).a(((float)(p6)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    ((moom.jD)(this.k)).a(((float)(p6)));
    forwardValue4801_123_0 = this;
    }
    ((moom.jD)(((net.minecraft.client.model.ModelOcelot)(forwardValue4801_123_0)).l)).a(((float)(p6)));
    }
    return;
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
int forwardValue4802_132_0;
    int forwardValue4802_167_0;
    net.minecraft.entity.Entity[] spill4802_0;
    moom.jD spill4802_1;
    float spill4802_2;
    moom.jD spill4802_3;
    float spill4802_4;
    moom.jD spill4802_5;
    float spill4802_6;
    moom.jD spill4802_7;
    float spill4802_8;
    boolean spill4802_9;
    moom.jD spill4802_10;
    float spill4802_11;
    moom.jD spill4802_12;
    float spill4802_13;
    moom.jD spill4802_14;
    float spill4802_15;
    moom.jD spill4802_16;
    float spill4802_17;
    moom.jD spill4802_18;
    float spill4802_19;
    moom.jD spill4802_20;
    float spill4802_21;
    long life5_3;
    net.minecraft.entity.passive.EntityOcelot life8_7;
    net.minecraft.entity.Entity[] life7_8;
    forward_join_296: {
    forward_join_293: {
    forward_join_167: {
    forward_join_165: {
    forward_join_132: {
    forward_join_130: {
    life5_3 = (net.minecraft.client.model.ModelOcelot.r ^ 121069456103140L);
    spill4802_0 = moom.iQ.b();
    life8_7 = ((net.minecraft.entity.passive.EntityOcelot)(p0));
    life7_8 = spill4802_0;
    ((moom.jD)(this.p)).f = ((float)(0x1.8p3f));
    ((moom.jD)(this.p)).g = ((float)(-0x1.4p3f));
    ((moom.jD)(this.o)).f = ((float)(0x1.ep3f));
    ((moom.jD)(this.o)).g = ((float)(-0x1.2p3f));
    ((moom.jD)(this.m)).f = ((float)(0x1.ep3f));
    ((moom.jD)(this.m)).g = ((float)(0x1.0p3f));
    ((moom.jD)(this.n)).f = ((float)(0x1.4p4f));
    ((moom.jD)(this.n)).g = ((float)(0x1.cp3f));
    spill4802_1 = this.k;
    moom.jD __stackOp4802_21_0 = this.l;
    float __stackOp4802_21_1 = 0x1.b9999ap3f;
    spill4802_2 = __stackOp4802_21_1;
    ((moom.jD)(__stackOp4802_21_0)).f = ((float)(__stackOp4802_21_1));
    ((moom.jD)(spill4802_1)).f = ((float)(spill4802_2));
    spill4802_3 = this.k;
    moom.jD __stackOp4802_26_0 = this.l;
    float __stackOp4802_26_1 = -0x1.4p2f;
    spill4802_4 = __stackOp4802_26_1;
    ((moom.jD)(__stackOp4802_26_0)).g = ((float)(__stackOp4802_26_1));
    ((moom.jD)(spill4802_3)).g = ((float)(spill4802_4));
    spill4802_5 = this.i;
    moom.jD __stackOp4802_31_0 = this.j;
    float __stackOp4802_31_1 = 0x1.2p4f;
    spill4802_6 = __stackOp4802_31_1;
    ((moom.jD)(__stackOp4802_31_0)).f = ((float)(__stackOp4802_31_1));
    ((moom.jD)(spill4802_5)).f = ((float)(spill4802_6));
    spill4802_7 = this.i;
    moom.jD __stackOp4802_36_0 = this.j;
    float __stackOp4802_36_1 = 0x1.4p2f;
    spill4802_8 = __stackOp4802_36_1;
    ((moom.jD)(__stackOp4802_36_0)).g = ((float)(__stackOp4802_36_1));
    ((moom.jD)(spill4802_7)).g = ((float)(spill4802_8));
    ((moom.jD)(this.m)).h = ((float)(0x1.ccccccp-1f));
    spill4802_9 = ((net.minecraft.entity.passive.EntityOcelot)(life8_7)).t__Boolean();
    if (!((life7_8 != null))) {
        forwardValue4802_132_0 = ((spill4802_9) ? 1 : 0);
        break forward_join_132;
    }
    if (!(spill4802_9)) {
        break forward_join_130;
    }
    moom.jD __stackOp4802_44_0 = this.p;
    ((moom.jD)(__stackOp4802_44_0)).f = ((float)((((moom.jD)(__stackOp4802_44_0)).f + 0x1.0p0f)));
    moom.jD __stackOp4802_48_0 = this.o;
    ((moom.jD)(__stackOp4802_48_0)).f = ((float)((((moom.jD)(__stackOp4802_48_0)).f + 0x1.0p1f)));
    moom.jD __stackOp4802_52_0 = this.m;
    ((moom.jD)(__stackOp4802_52_0)).f = ((float)((((moom.jD)(__stackOp4802_52_0)).f + 0x1.0p0f)));
    moom.jD __stackOp4802_56_0 = this.n;
    ((moom.jD)(__stackOp4802_56_0)).f = ((float)((((moom.jD)(__stackOp4802_56_0)).f - 0x1.0p2f)));
    moom.jD __stackOp4802_60_0 = this.n;
    ((moom.jD)(__stackOp4802_60_0)).g = ((float)((((moom.jD)(__stackOp4802_60_0)).g + 0x1.0p1f)));
    ((moom.jD)(this.m)).h = ((float)(0x1.921fb6p0f));
    ((moom.jD)(this.n)).h = ((float)(0x1.921fb6p0f));
    this.q = ((int)(0));
    if (!((life7_8 == null))) {
        break forward_join_296;
    }
    }
    forwardValue4802_132_0 = ((((net.minecraft.entity.passive.EntityOcelot)(life8_7)).u__Boolean()) ? 1 : 0);
    }
    if (!((life7_8 != null))) {
        forwardValue4802_167_0 = forwardValue4802_132_0;
        break forward_join_167;
    }
    if (!((forwardValue4802_132_0 != 0))) {
        break forward_join_165;
    }
    ((moom.jD)(this.n)).f = ((float)(((moom.jD)(this.m)).f));
    moom.jD __stackOp4802_75_0 = this.n;
    ((moom.jD)(__stackOp4802_75_0)).g = ((float)((((moom.jD)(__stackOp4802_75_0)).g + 0x1.0p1f)));
    ((moom.jD)(this.m)).h = ((float)(0x1.921fb6p0f));
    ((moom.jD)(this.n)).h = ((float)(0x1.921fb6p0f));
    this.q = ((int)(__sourceIntrinsic_c3ff9c6d6beb_invokedynamic4802_82(30965, (8775719748950796828L ^ life5_3))));
    if (!((life7_8 == null))) {
        break forward_join_296;
    }
    }
    forwardValue4802_167_0 = ((((net.minecraft.entity.passive.EntityOcelot)(life8_7)).af()) ? 1 : 0);
    }
    if (!((forwardValue4802_167_0 != 0))) {
        break forward_join_293;
    }
    ((moom.jD)(this.p)).h = ((float)(0x1.921fb6p-1f));
    moom.jD __stackOp4802_89_0 = this.p;
    ((moom.jD)(__stackOp4802_89_0)).f = ((float)((((moom.jD)(__stackOp4802_89_0)).f - 0x1.0p2f)));
    moom.jD __stackOp4802_93_0 = this.p;
    ((moom.jD)(__stackOp4802_93_0)).g = ((float)((((moom.jD)(__stackOp4802_93_0)).g + 0x1.4p2f)));
    moom.jD __stackOp4802_97_0 = this.o;
    ((moom.jD)(__stackOp4802_97_0)).f = ((float)((((moom.jD)(__stackOp4802_97_0)).f - 0x1.a66666p1f)));
    moom.jD __stackOp4802_101_0 = this.o;
    ((moom.jD)(__stackOp4802_101_0)).g = ((float)((((moom.jD)(__stackOp4802_101_0)).g + 0x1.0p0f)));
    moom.jD __stackOp4802_105_0 = this.m;
    ((moom.jD)(__stackOp4802_105_0)).f = ((float)((((moom.jD)(__stackOp4802_105_0)).f + 0x1.0p3f)));
    moom.jD __stackOp4802_109_0 = this.m;
    ((moom.jD)(__stackOp4802_109_0)).g = ((float)((((moom.jD)(__stackOp4802_109_0)).g - 0x1.0p1f)));
    moom.jD __stackOp4802_113_0 = this.n;
    ((moom.jD)(__stackOp4802_113_0)).f = ((float)((((moom.jD)(__stackOp4802_113_0)).f + 0x1.0p1f)));
    moom.jD __stackOp4802_117_0 = this.n;
    ((moom.jD)(__stackOp4802_117_0)).g = ((float)((((moom.jD)(__stackOp4802_117_0)).g - 0x1.99999ap-1f)));
    ((moom.jD)(this.m)).h = ((float)(0x1.ba5616p0f));
    ((moom.jD)(this.n)).h = ((float)(0x1.55ce28p1f));
    spill4802_10 = this.k;
    moom.jD __stackOp4802_126_0 = this.l;
    float __stackOp4802_126_1 = -0x1.41b2f8p-3f;
    spill4802_11 = __stackOp4802_126_1;
    ((moom.jD)(__stackOp4802_126_0)).h = ((float)(__stackOp4802_126_1));
    ((moom.jD)(spill4802_10)).h = ((float)(spill4802_11));
    spill4802_12 = this.k;
    moom.jD __stackOp4802_131_0 = this.l;
    float __stackOp4802_131_1 = 0x1.f9999ap3f;
    spill4802_13 = __stackOp4802_131_1;
    ((moom.jD)(__stackOp4802_131_0)).f = ((float)(__stackOp4802_131_1));
    ((moom.jD)(spill4802_12)).f = ((float)(spill4802_13));
    spill4802_14 = this.k;
    moom.jD __stackOp4802_136_0 = this.l;
    float __stackOp4802_136_1 = -0x1.cp2f;
    spill4802_15 = __stackOp4802_136_1;
    ((moom.jD)(__stackOp4802_136_0)).g = ((float)(__stackOp4802_136_1));
    ((moom.jD)(spill4802_14)).g = ((float)(spill4802_15));
    spill4802_16 = this.i;
    moom.jD __stackOp4802_141_0 = this.j;
    float __stackOp4802_141_1 = -0x1.921fb6p0f;
    spill4802_17 = __stackOp4802_141_1;
    ((moom.jD)(__stackOp4802_141_0)).h = ((float)(__stackOp4802_141_1));
    ((moom.jD)(spill4802_16)).h = ((float)(spill4802_17));
    spill4802_18 = this.i;
    moom.jD __stackOp4802_146_0 = this.j;
    float __stackOp4802_146_1 = 0x1.5p4f;
    spill4802_19 = __stackOp4802_146_1;
    ((moom.jD)(__stackOp4802_146_0)).f = ((float)(__stackOp4802_146_1));
    ((moom.jD)(spill4802_18)).f = ((float)(spill4802_19));
    spill4802_20 = this.i;
    moom.jD __stackOp4802_151_0 = this.j;
    float __stackOp4802_151_1 = 0x1.0p0f;
    spill4802_21 = __stackOp4802_151_1;
    ((moom.jD)(__stackOp4802_151_0)).g = ((float)(__stackOp4802_151_1));
    ((moom.jD)(spill4802_20)).g = ((float)(spill4802_21));
    this.q = ((int)(__sourceIntrinsic_c3ff9c6d6beb_invokedynamic4802_154(23872, (4322929382838603683L ^ life5_3))));
    if (!((life7_8 == null))) {
        break forward_join_296;
    }
    }
    this.q = ((int)(1));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8293f8d3bdca5111_originalDynamicSite3718_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10429_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c3ff9c6d6beb_invokedynamic4802_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c3ff9c6d6beb_invokedynamic4802_154(int a0, long a1) throws E;
}
