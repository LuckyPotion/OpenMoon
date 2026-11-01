package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class zu implements moom.yK<moom.y2> {

private int a;

private boolean b;

private net.minecraft.world.WorldSettings$GameType c;

private int d;

private net.minecraft.world.EnumDifficulty e;

private int f;

private net.minecraft.world.WorldType g;

private boolean h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public zu() {
super();
}


public zu(int p0, net.minecraft.world.WorldSettings$GameType p1, boolean p2, int p3, net.minecraft.world.EnumDifficulty p4, int p5, net.minecraft.world.WorldType p6, boolean p7) {
super();
    this.a = p0;
    this.d = p3;
    this.e = p4;
    this.c = p1;
    this.f = p5;
    this.b = p2;
    this.g = p6;
    this.h = p7;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(6514665116377850864L)), ((long)(-6965609569490006948L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(7892917195667L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.zu.i ^ 136304248903387L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1739_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1739_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1739_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1739_14 = new byte[8];
    (__sourceSpill1739_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1739_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1739_16 = __sourceSpill1739_14;
    ((javax.crypto.Cipher)(__sourceSpill1739_11)).init(((int)(__sourceSpill1739_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1739_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1739_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "G\f(øï7hµÁ_Å\037îf¨"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1739_25 = local6_life21;
        int __sourceSpill1739_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1739_25)).substring(((int)(__sourceSpill1739_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1739_30 = local8_life19;
        int __sourceSpill1739_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1739_33 = new byte[8];
        (__sourceSpill1739_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1739_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1739_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1739_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1739_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1739_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1739_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1739_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1739_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1739_34)).doFinal(((byte[])(__sourceSpill1739_33)));
        (__sourceSpill1739_30)[__sourceSpill1739_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ">.ã>1\034k\007`¦Um\t\006Í"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1739_38 = local6_life21;
        int __sourceSpill1739_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1739_38)).substring(((int)(__sourceSpill1739_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1739_43 = local8_life19;
        int __sourceSpill1739_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1739_46 = new byte[8];
        (__sourceSpill1739_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1739_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1739_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1739_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1739_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1739_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1739_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1739_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1739_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1739_47)).doFinal(((byte[])(__sourceSpill1739_46)));
        (__sourceSpill1739_43)[__sourceSpill1739_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public boolean b__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public int b() {
return this.d;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long life2_3;
    int life5_13;
    int[] life4_14;
    life2_3 = (moom.zu.i ^ 101316140923694L);
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.a)));
    int[] spill8063_0 = moom.zN.b__ArrayInt();
    life5_13 = ((net.minecraft.world.WorldSettings$GameType)(this.c)).a();
    life4_14 = spill8063_0;
    if ((life4_14 == null)) {
        if (this.b) {
        life5_13 = (life5_13 | __sourceIntrinsic_0875c19f50e0_invokedynamic8063_7(21605, (9100818555983746037L ^ life2_3)));
    }
        ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(life5_13)));
        ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.d)));
        ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(((net.minecraft.world.EnumDifficulty)(this.e)).a())));
        ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.f)));
        ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((net.minecraft.world.WorldType)(this.g)).a__String())));
        ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)(this.h)));
    }
    return;
}


public int c() {
return this.f;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zu)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9906_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/zu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.zu.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27250;
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
            throw new RuntimeException("moom/zu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zu)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
moom.zu forwardValue4611_30_0;
    int forwardValue4611_30_1;
    moom.zu forwardValue4611_31_0;
    moom.zu forwardValue4611_32_0;
    int forwardValue4611_32_1;
    moom.zu forwardValue4611_77_0;
    int[] spill4611_0;
    moom.zu spill4611_1;
    int spill4611_2;
    moom.zu spill4611_3;
    long life2_3;
    int life5_11;
    int[] life4_12;
    int life5_46;
    forward_join_77: {
    forward_join_76: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (moom.zu.i ^ 47212206205095L);
    this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    spill4611_0 = moom.zN.b__ArrayInt();
    life5_11 = ((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte();
    life4_12 = spill4611_0;
    spill4611_1 = this;
    spill4611_2 = (life5_11 & __sourceIntrinsic_ba748fb9d83f_invokedynamic4611_5(11315, (8667532009853810728L ^ life2_3)));
    if (!((life4_12 == null))) {
        forwardValue4611_30_0 = spill4611_1;
        forwardValue4611_30_1 = spill4611_2;
        break forward_join_30;
    }
    if (!((spill4611_2 == __sourceIntrinsic_ba748fb9d83f_invokedynamic4611_6(11315, (8667532009853810728L ^ life2_3))))) {
        forwardValue4611_31_0 = spill4611_1;
        break forward_join_31;
    }
    forwardValue4611_30_0 = spill4611_1;
    forwardValue4611_30_1 = 1;
    }
    forwardValue4611_32_0 = forwardValue4611_30_0;
    forwardValue4611_32_1 = forwardValue4611_30_1;
    break forward_join_32;
    }
    forwardValue4611_32_0 = forwardValue4611_31_0;
    forwardValue4611_32_1 = 0;
    }
    ((moom.zu)(forwardValue4611_32_0)).b = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4611_32_1)));
    life5_46 = (life5_11 & __sourceIntrinsic_ba748fb9d83f_invokedynamic4611_8(29380, (3737968133860009692L ^ life2_3)));
    this.c = ((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.a(((int)(life5_46)))));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.e = ((net.minecraft.world.EnumDifficulty)(net.minecraft.world.EnumDifficulty.a(((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte())))));
    this.f = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    this.g = ((net.minecraft.world.WorldType)(net.minecraft.world.WorldType.a(((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(__sourceIntrinsic_ba748fb9d83f_invokedynamic4611_18(21104, (885931922958157418L ^ life2_3))))))))));
    spill4611_3 = this;
    if (!((life4_12 == null))) {
        forwardValue4611_77_0 = spill4611_3;
        break forward_join_77;
    }
    if (!((((moom.zu)(spill4611_3)).g == null))) {
        break forward_join_76;
    }
    this.g = ((net.minecraft.world.WorldType)(net.minecraft.world.WorldType.b));
    }
    forwardValue4611_77_0 = this;
    }
    ((moom.zu)(forwardValue4611_77_0)).h = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    return;
}


public net.minecraft.world.WorldSettings$GameType a__bE() {
return this.c;
}


public net.minecraft.world.EnumDifficulty a__bB() {
return this.e;
}


public net.minecraft.world.WorldType a__EL() {
return this.g;
}


private static native <E extends Throwable> int __sourceIntrinsic_0875c19f50e0_invokedynamic8063_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9906_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic4611_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic4611_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic4611_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_invokedynamic4611_18(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
