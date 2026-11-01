package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class zW implements moom.yK<moom.y2> {

private int a;

private byte b;

private byte c;

private int d;

private byte e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public zW() {
super();
}


public zW(int p0, net.minecraft.potion.PotionEffect p1) { super(); }


private static void __sourceConstructorBody_fc9458947a2b67ff(moom.zW receiver, int p0, net.minecraft.potion.PotionEffect p1) throws Throwable {

moom.zW forwardValue518_50_0;

    int forwardValue518_50_1;

    moom.zW forwardValue518_51_0;

    moom.zW forwardValue518_52_0;

    int forwardValue518_52_1;

    int[] spill518_0;

    moom.zW spill518_1;

    boolean spill518_2;

    long life3_3;

    int[] life5_42;

    forward_join_52: {

    forward_join_51: {

    forward_join_50: {

    life3_3 = (moom.zW.f ^ 21796074061305L);

    spill518_0 = moom.zN.b__ArrayInt();

    moom.zW.__sourceConstructorInit_fc9458947a2b67ff_0(((moom.zW)(receiver)));

    ((moom.zW)(receiver)).a = ((int)(p0));

    ((moom.zW)(receiver)).b = ((byte)(((byte) (((net.minecraft.potion.PotionEffect)(p1)).a() & __sourceIntrinsic_fc9458947a2b67ff_invokedynamic518_5(10065, (759514681121420773L ^ life3_3))))));

    ((moom.zW)(receiver)).c = ((byte)(((byte) (((net.minecraft.potion.PotionEffect)(p1)).c() & __sourceIntrinsic_fc9458947a2b67ff_invokedynamic518_8(19396, (1848535010041485683L ^ life3_3))))));

    ((moom.zW)(receiver)).d = ((int)(java.lang.Math.min(((int)(((net.minecraft.potion.PotionEffect)(p1)).b())), ((int)(__sourceIntrinsic_fc9458947a2b67ff_invokedynamic518_11(30382, (563443721605145627L ^ life3_3)))))));

    life5_42 = spill518_0;

    spill518_1 = receiver;

    spill518_2 = ((net.minecraft.potion.PotionEffect)(p1)).b__Boolean();

    if (!((life5_42 == null))) {

        forwardValue518_50_0 = spill518_1;

        forwardValue518_50_1 = ((spill518_2) ? 1 : 0);

        break forward_join_50;

    }

    if (!(spill518_2)) {

        forwardValue518_51_0 = spill518_1;

        break forward_join_51;

    }

    forwardValue518_50_0 = spill518_1;

    forwardValue518_50_1 = 1;

    }

    forwardValue518_52_0 = forwardValue518_50_0;

    forwardValue518_52_1 = forwardValue518_50_1;

    break forward_join_52;

    }

    forwardValue518_52_0 = forwardValue518_51_0;

    forwardValue518_52_1 = 0;

    }

    ((moom.zW)(forwardValue518_52_0)).e = ((byte)(((byte) forwardValue518_52_1)));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(-7661253827372404103L)), ((long)(164338008001011373L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219985355204160L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.zW.f ^ 12075240780016L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1730_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1730_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1730_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1730_14 = new byte[8];
    (__sourceSpill1730_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1730_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1730_16 = __sourceSpill1730_14;
    ((javax.crypto.Cipher)(__sourceSpill1730_11)).init(((int)(__sourceSpill1730_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1730_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1730_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\004\006Æþ\022\006\0336?lEÅ¥"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1730_25 = local6_life21;
        int __sourceSpill1730_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1730_25)).substring(((int)(__sourceSpill1730_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1730_30 = local8_life19;
        int __sourceSpill1730_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1730_33 = new byte[8];
        (__sourceSpill1730_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1730_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1730_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1730_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1730_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1730_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1730_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1730_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1730_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1730_34)).doFinal(((byte[])(__sourceSpill1730_33)));
        (__sourceSpill1730_30)[__sourceSpill1730_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "BA\006VD Z\\ß`\0173^ïÂä"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1730_38 = local6_life21;
        int __sourceSpill1730_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1730_38)).substring(((int)(__sourceSpill1730_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1730_43 = local8_life19;
        int __sourceSpill1730_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1730_46 = new byte[8];
        (__sourceSpill1730_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1730_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1730_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1730_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1730_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1730_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1730_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1730_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1730_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1730_47)).doFinal(((byte[])(__sourceSpill1730_46)));
        (__sourceSpill1730_43)[__sourceSpill1730_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_fc9458947a2b67ff_0(moom.zW a0) throws E;

public byte b() {
return this.c;
}


public int b__Int() {
return this.d;
}


public boolean b__Boolean() {
int forwardValue4598_12_0;
    int forwardValue4598_14_0;
    byte spill4598_0;
    long life1_3;
    int[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.zW.f ^ 133585407509481L);
    life3_5 = moom.zN.b__ArrayInt();
    spill4598_0 = this.e;
    if (!((life3_5 == null))) {
        forwardValue4598_12_0 = ((int)(spill4598_0));
        break forward_join_12;
    }
    if (!((spill4598_0 != 0))) {
        break forward_join_13;
    }
    forwardValue4598_12_0 = 1;
    }
    forwardValue4598_14_0 = forwardValue4598_12_0;
    break forward_join_14;
    }
    forwardValue4598_14_0 = 0;
    }
    return ((forwardValue4598_14_0) != 0);
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.e)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.c = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.e = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31282;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/zW", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.zW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9885_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/zW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a__Int() {
return this.a;
}


public byte a() {
return this.b;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zW)(this)));
    return;
}


public boolean a__Boolean() {
int forwardValue4597_17_0;
    int forwardValue4597_19_0;
    int spill4597_0;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.zW.f ^ 80465786443688L);
    life3_5 = moom.zN.b__ArrayInt();
    spill4597_0 = this.d;
    if (!((life3_5 == null))) {
        forwardValue4597_17_0 = spill4597_0;
        break forward_join_17;
    }
    if (!((spill4597_0 == __sourceIntrinsic_1a14968dced5_invokedynamic4597_3(20240, (4312170535364573175L ^ life1_3))))) {
        break forward_join_18;
    }
    forwardValue4597_17_0 = 1;
    }
    forwardValue4597_19_0 = forwardValue4597_17_0;
    break forward_join_19;
    }
    forwardValue4597_19_0 = 0;
    }
    return ((forwardValue4597_19_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_fc9458947a2b67ff_invokedynamic518_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc9458947a2b67ff_invokedynamic518_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc9458947a2b67ff_invokedynamic518_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9885_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4597_3(int a0, long a1) throws E;
}
