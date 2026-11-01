package net.minecraft.world.storage;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class MapData extends net.minecraft.world.WorldSavedData {

public int c;

public int d;

public byte e;

public byte f;

public byte[] g;

public java.util.List<moom.IN> h;

private java.util.Map<net.minecraft.entity.player.EntityPlayer, moom.IN> i;

public java.util.Map<java.lang.String, moom.DY> j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

private static long o;

public MapData(java.lang.String p0) { super((java.lang.String)null); }


private static void __sourceConstructorBody_ca5a37c9e57bd482(net.minecraft.world.storage.MapData receiver, java.lang.String p0) throws Throwable {

long local2 = (net.minecraft.world.storage.MapData.k ^ 107779599177381L);

    net.minecraft.world.storage.MapData.__sourceConstructorInit_ca5a37c9e57bd482_0(((net.minecraft.world.storage.MapData)(receiver)), ((java.lang.String)(p0)));

    ((net.minecraft.world.storage.MapData)(receiver)).g = ((byte[])(new byte[__sourceIntrinsic_ca5a37c9e57bd482_originalDynamicSite4041_2(23831, (72190670478259027L ^ local2))]));

    ((net.minecraft.world.storage.MapData)(receiver)).h = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((net.minecraft.world.storage.MapData)(receiver)).i = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((net.minecraft.world.storage.MapData)(receiver)).j = ((java.util.Map)(com.google.common.collect.Maps.newLinkedHashMap()));

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(-5988845717751045500L)), ((long)(-531367996803418475L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(249090210163963L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (net.minecraft.world.storage.MapData.k ^ 121022152619504L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill1223_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1223_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1223_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1223_14 = new byte[8];
    (__sourceSpill1223_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill1223_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation1223_16 = __sourceSpill1223_14;
    ((javax.crypto.Cipher)(__sourceSpill1223_11)).init(((int)(__sourceSpill1223_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1223_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1223_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[15];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "/Ò$Ï^HIùè©t.µBqµ\020\001°°*.ÈïÊ\026è}\007°9ruâ$×wi¯ k\177eÚÆºÌøµk\003h:Åê9þò´{fUëG\0321ÚÃìM1\004¾\032\023þhY±û^Ô\b\037ñ%nê¹OèØ"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1223_25 = local11_life21;
        int __sourceSpill1223_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1223_25)).substring(((int)(__sourceSpill1223_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1223_30 = local13_life19;
        int __sourceSpill1223_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill1223_33 = new byte[8];
        (__sourceSpill1223_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill1223_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill1223_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill1223_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill1223_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill1223_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill1223_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill1223_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill1223_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill1223_34)).doFinal(((byte[])(__sourceSpill1223_33)));
        (__sourceSpill1223_30)[__sourceSpill1223_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "ó\027@£Jü®\007\001\000lÄõ.Ò"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1223_38 = local11_life21;
        int __sourceSpill1223_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1223_38)).substring(((int)(__sourceSpill1223_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1223_43 = local13_life19;
        int __sourceSpill1223_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill1223_46 = new byte[8];
        (__sourceSpill1223_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill1223_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill1223_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill1223_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill1223_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill1223_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill1223_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill1223_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill1223_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill1223_47)).doFinal(((byte[])(__sourceSpill1223_46)));
        (__sourceSpill1223_43)[__sourceSpill1223_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    l = ((long[])(local13_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[15]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill1223_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1223_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1223_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1223_58 = new byte[8];
    (__sourceSpill1223_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill1223_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation1223_60 = __sourceSpill1223_58;
    ((javax.crypto.Cipher)(__sourceSpill1223_55)).init(((int)(__sourceSpill1223_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1223_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1223_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = 119365002923715626L;
    byte[] __sourceSpill1223_64 = new byte[8];
    (__sourceSpill1223_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill1223_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill1223_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill1223_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill1223_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill1223_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill1223_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill1223_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill1223_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill1223_65)).doFinal(((byte[])(__sourceSpill1223_64)));
    o = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_ca5a37c9e57bd482_0(net.minecraft.world.storage.MapData a0, java.lang.String a1) throws E;

public void b(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (net.minecraft.world.storage.MapData.k ^ 116492864274238L);
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("dimension")), ((byte)(this.e)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("xCenter")), ((int)(this.c)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("zCenter")), ((int)(this.d)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("scale")), ((byte)(this.f)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("width")), ((short)(__sourceIntrinsic_ac4a479fad6b_originalDynamicSite2079_9(17009, (2746262477230867887L ^ local2)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("height")), ((short)(__sourceIntrinsic_ac4a479fad6b_originalDynamicSite2079_11(17009, (2746262477230867887L ^ local2)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("colors")), ((byte[])(this.g)));
    return;
}


public moom.IN a(net.minecraft.entity.player.EntityPlayer p0) {
moom.IN forwardValue5856_34_0;
    java.lang.String spill5856_0;
    moom.IN spill5856_1;
    long life2_3;
    moom.IN life5_10;
    java.lang.String life4_11;
    forward_join_34: {
    forward_join_33: {
    life2_3 = (net.minecraft.world.storage.MapData.k ^ 49442007503439L);
    spill5856_0 = net.minecraft.world.storage.WorldInfo.c__String();
    life5_10 = ((moom.IN)(((java.util.Map)(this.i)).get(((java.lang.Object)(p0)))));
    life4_11 = spill5856_0;
    spill5856_1 = life5_10;
    if (!((life4_11 != null))) {
        forwardValue5856_34_0 = spill5856_1;
        break forward_join_34;
    }
    if (!((spill5856_1 == null))) {
        break forward_join_33;
    }
    life5_10 = new moom.IN(this, p0);
    ((java.util.Map)(this.i)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life5_10)));
    ((java.util.List)(this.h)).add(((java.lang.Object)(life5_10)));
    }
    forwardValue5856_34_0 = life5_10;
    }
    return forwardValue5856_34_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27982;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/EI", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.storage.MapData.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12742_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(double p0, double p1, int p2) {
long local6 = (net.minecraft.world.storage.MapData.k ^ 81200744968550L);
    int local8 = (__sourceIntrinsic_a50d5745fc8c_originalDynamicSite2080_1(17009, (2746227125115718647L ^ local6)) * (1 << p2));
    int local9 = moom.Dr.b__Int(((double)(((p0 + 0x1.0p6d) / ((double) local8)))));
    int local10 = moom.Dr.b__Int(((double)(((p1 + 0x1.0p6d) / ((double) local8)))));
    this.c = ((int)((((local9 * local8) + (local8 / 2)) - __sourceIntrinsic_a50d5745fc8c_originalDynamicSite2080_4(16997, (5015764843850501095L ^ local6)))));
    this.d = ((int)((((local10 * local8) + (local8 / 2)) - __sourceIntrinsic_a50d5745fc8c_originalDynamicSite2080_6(4117, (6217791342979799444L ^ local6)))));
    return;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
int forestValue735_57_0;
    int forestValue735_57_1;
    int forestValue735_100_0;
    int forestValue735_120_0;
    int forestValue735_135_0;
    java.lang.String spill735_0;
    int spill735_1;
    int spill735_2;
    int spill735_3;
    int spill735_4;
    int spill735_5;
    long life2_3;
    java.lang.String life4_10;
    int life5_37;
    int life6_41;
    byte[] life7_71;
    int life8_89;
    int life9_99;
    int life10_101;
    int life11_108;
    int life12_127;
    int life13_134;
    forest_join_166: {
    forest_join_65: {
    forest_join_57: {
    life2_3 = (net.minecraft.world.storage.MapData.k ^ 107785278005865L);
    spill735_0 = net.minecraft.world.storage.WorldInfo.c__String();
    this.e = ((byte)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("dimension")))));
    life4_10 = spill735_0;
    this.c = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("xCenter")))));
    this.d = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("zCenter")))));
    this.f = ((byte)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("scale")))));
    this.f = ((byte)(((byte) moom.Dr.a(((int)(this.f)), ((int)(0)), ((int)(4))))));
    life5_37 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("width")));
    life6_41 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("height")));
    spill735_1 = life5_37;
    spill735_2 = __sourceIntrinsic_658b606e7852_invokedynamic735_15(10629, (6230154959841915654L ^ life2_3));
    if (!((life4_10 != null))) {
        forestValue735_57_0 = spill735_1;
        forestValue735_57_1 = spill735_2;
        break forest_join_57;
    }
    if (!((spill735_1 == spill735_2))) {
        break forest_join_65;
    }
    forestValue735_57_0 = life6_41;
    forestValue735_57_1 = __sourceIntrinsic_658b606e7852_invokedynamic735_16(17009, (2746251123020699896L ^ life2_3));
    }
    if (!((forestValue735_57_0 == forestValue735_57_1))) {
        break forest_join_65;
    }
    this.g = ((byte[])(((net.minecraft.nbt.NBTTagCompound)(p0)).a__ArrayByte(((java.lang.String)("colors")))));
    if (!((life4_10 == null))) {
        break forest_join_166;
    }
    }
    life7_71 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__ArrayByte(((java.lang.String)("colors")));
    this.g = ((byte[])(new byte[__sourceIntrinsic_658b606e7852_invokedynamic735_20(31860, (8298095500767799028L ^ life2_3))]));
    life8_89 = ((__sourceIntrinsic_658b606e7852_invokedynamic735_22(17009, (2746251123020699896L ^ life2_3)) - life5_37) / 2);
    life9_99 = ((__sourceIntrinsic_658b606e7852_invokedynamic735_23(17009, (2746251123020699896L ^ life2_3)) - life6_41) / 2);
    life10_101 = 0;
    forest_cycle_99: while (true) {
    forest_join_163: {
    forestValue735_100_0 = life10_101;
    forest_cycle_100: while (true) {
    forest_join_120: {
    forest_join_119: {
    if (!((forestValue735_100_0 < life6_41))) {
        break forest_join_166;
    }
    life11_108 = (life10_101 + life9_99);
    spill735_3 = life11_108;
    if (!((life4_10 != null))) {
        forestValue735_120_0 = spill735_3;
        break forest_join_120;
    }
    if (!((spill735_3 < 0))) {
        break forest_join_119;
    }
    spill735_4 = life11_108;
    if (!((life4_10 != null))) {
        forestValue735_120_0 = spill735_4;
        break forest_join_120;
    }
    if (!((spill735_4 < __sourceIntrinsic_658b606e7852_invokedynamic735_24(17009, (2746251123020699896L ^ life2_3))))) {
        break forest_join_163;
    }
    }
    forestValue735_120_0 = 0;
    }
    life12_127 = forestValue735_120_0;
    forest_cycle_121: while (true) {
    forest_join_160: {
    forest_join_141: {
    forest_join_135: {
    if (!((life12_127 < life5_37))) {
        break forest_join_163;
    }
    life13_134 = (life12_127 + life8_89);
    spill735_5 = life13_134;
    if (!((life4_10 != null))) {
        forestValue735_100_0 = spill735_5;
        continue forest_cycle_100;
    }
    if (!((life4_10 != null))) {
        forestValue735_135_0 = spill735_5;
        break forest_join_135;
    }
    if (!((spill735_5 < 0))) {
        break forest_join_141;
    }
    forestValue735_135_0 = life13_134;
    }
    if (!((forestValue735_135_0 < __sourceIntrinsic_658b606e7852_invokedynamic735_25(17009, (2746251123020699896L ^ life2_3))))) {
        break forest_join_160;
    }
    }
    (this.g)[(life13_134 + (life11_108 * __sourceIntrinsic_658b606e7852_invokedynamic735_27(17009, (2746251123020699896L ^ life2_3))))] = (life7_71)[(life12_127 + (life10_101 * life5_37))];
    }
    life12_127 += 1;
    if (!((life4_10 == null))) {
        continue forest_cycle_121;
    }
    break forest_cycle_121;
    }
    break forest_cycle_100;
    }
    }
    life10_101 += 1;
    if (!((life4_10 == null))) {
        continue forest_cycle_99;
    }
    break forest_cycle_99;
    }
    }
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.item.ItemStack p1) {
int lexicalValue1768_34_0;
    int lexicalValue1768_44_0;
    int lexicalValue1768_79_0;
    int lexicalValue1768_85_0;
    int lexicalValue1768_119_0;
    int lexicalValue1768_125_0;
    int lexicalValue1768_160_0;
    int lexicalValue1768_174_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1768_183_0;
    java.lang.String lexicalValue1768_183_1;
    int lexicalValue1768_183_2;
    boolean spill1768_0;
    boolean spill1768_1;
    boolean spill1768_2;
    boolean spill1768_3;
    net.minecraft.nbt.NBTTagCompound spill1768_4;
    java.lang.String spill1768_5;
    int spill1768_6;
    long life3_3;
    java.lang.String life5_5;
    moom.IN life6_21;
    int life6_53;
    moom.IN life7_64;
    net.minecraft.entity.item.EntityItemFrame life6_175;
    moom.DT life7_178;
    net.minecraft.nbt.NBTTagList life6_241;
    int life7_243;
    net.minecraft.nbt.NBTTagCompound life8_251;
    lexical_join_226: {
    lexical_join_183: {
    lexical_join_174: {
    lexical_join_160: {
    lexical_join_158: {
    lexical_join_125: {
    lexical_join_123: {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_34: {
    lexical_join_30: {
    life3_3 = (net.minecraft.world.storage.MapData.k ^ 45637649693307L);
    life5_5 = net.minecraft.world.storage.WorldInfo.c__String();
    spill1768_0 = ((java.util.Map)(this.i)).containsKey(((java.lang.Object)(p0)));
    if (!((life5_5 != null))) {
        lexicalValue1768_34_0 = ((spill1768_0) ? 1 : 0);
        break lexical_join_34;
    }
    if (!((!spill1768_0))) {
        break lexical_join_30;
    }
    life6_21 = new moom.IN(this, p0);
    ((java.util.Map)(this.i)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life6_21)));
    ((java.util.List)(this.h)).add(((java.lang.Object)(life6_21)));
    }
    lexicalValue1768_34_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).b__Boolean(((net.minecraft.item.ItemStack)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        lexicalValue1768_44_0 = lexicalValue1768_34_0;
        break lexical_join_44;
    }
    if (!((lexicalValue1768_34_0 == 0))) {
        break lexical_join_43;
    }
    ((java.util.Map)(this.j)).remove(((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__String())));
    }
    lexicalValue1768_44_0 = 0;
    }
    life6_53 = lexicalValue1768_44_0;
    lexical_cycle_45: while (true) {
    lexical_join_120: {
    lexical_join_119: {
    lexical_join_109: {
    lexical_join_85: {
    lexical_join_79: {
    lexical_join_77: {
    if (!((life6_53 < ((java.util.List)(this.h)).size()))) {
        break lexical_join_123;
    }
    life7_64 = ((moom.IN)(((java.util.List)(this.h)).get(((int)(life6_53)))));
    spill1768_1 = ((net.minecraft.entity.player.EntityPlayer)(((moom.IN)(life7_64)).a)).F;
    if (!((life5_5 != null))) {
        lexicalValue1768_125_0 = ((spill1768_1) ? 1 : 0);
        break lexical_join_125;
    }
    if (!((life5_5 != null))) {
        lexicalValue1768_119_0 = ((spill1768_1) ? 1 : 0);
        break lexical_join_119;
    }
    if (!((!spill1768_1))) {
        break lexical_join_109;
    }
    spill1768_2 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(((moom.IN)(life7_64)).a)).bD)).b__Boolean(((net.minecraft.item.ItemStack)(p1)));
    if (!((life5_5 != null))) {
        lexicalValue1768_79_0 = ((spill1768_2) ? 1 : 0);
        break lexical_join_79;
    }
    if (!((!spill1768_2))) {
        break lexical_join_77;
    }
    spill1768_3 = ((net.minecraft.item.ItemStack)(p1)).k();
    if (!((life5_5 != null))) {
        lexicalValue1768_119_0 = ((spill1768_3) ? 1 : 0);
        break lexical_join_119;
    }
    if (!(spill1768_3)) {
        break lexical_join_109;
    }
    }
    lexicalValue1768_79_0 = ((((net.minecraft.item.ItemStack)(p1)).k()) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        lexicalValue1768_85_0 = lexicalValue1768_79_0;
        break lexical_join_85;
    }
    if (!((lexicalValue1768_79_0 == 0))) {
        break lexical_join_120;
    }
    lexicalValue1768_85_0 = ((net.minecraft.entity.player.EntityPlayer)(((moom.IN)(life7_64)).a)).af;
    }
    if (!((lexicalValue1768_85_0 == this.e))) {
        break lexical_join_120;
    }
    ((net.minecraft.world.storage.MapData)(this)).a(((int)(0)), ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(((moom.IN)(life7_64)).a)).i)), ((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(((moom.IN)(life7_64)).a)).a__String())), ((double)(((net.minecraft.entity.player.EntityPlayer)(((moom.IN)(life7_64)).a)).n)), ((double)(((net.minecraft.entity.player.EntityPlayer)(((moom.IN)(life7_64)).a)).p)), ((double)(((double) ((net.minecraft.entity.player.EntityPlayer)(((moom.IN)(life7_64)).a)).w))));
    if (!((life5_5 == null))) {
        break lexical_join_120;
    }
    }
    ((java.util.Map)(this.i)).remove(((java.lang.Object)(((moom.IN)(life7_64)).a)));
    lexicalValue1768_119_0 = ((((java.util.List)(this.h)).remove(((java.lang.Object)(life7_64)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1768_119_0);
    }
    life6_53 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    lexicalValue1768_125_0 = ((((net.minecraft.item.ItemStack)(p1)).k()) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        lexicalValue1768_160_0 = lexicalValue1768_125_0;
        break lexical_join_160;
    }
    if (!((lexicalValue1768_125_0 != 0))) {
        break lexical_join_158;
    }
    life6_175 = ((net.minecraft.item.ItemStack)(p1)).a__sE();
    life7_178 = ((net.minecraft.entity.item.EntityItemFrame)(life6_175)).b__DT();
    ((net.minecraft.world.storage.MapData)(this)).a(((int)(1)), ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(p0)).i)), ((java.lang.String)(__sourceIntrinsic_f16a6f918830_invokedynamic1768_59(((net.minecraft.entity.item.EntityItemFrame)(life6_175)).e__Int()))), ((double)(((double) ((moom.DT)(life7_178)).a()))), ((double)(((double) ((moom.DT)(life7_178)).c()))), ((double)(((double) (((moom.bs)(((net.minecraft.entity.item.EntityItemFrame)(life6_175)).aG)).b() * __sourceIntrinsic_f16a6f918830_invokedynamic1768_64(16503, (3213508820513047266L ^ life3_3)))))));
    }
    lexicalValue1768_160_0 = ((((net.minecraft.item.ItemStack)(p1)).e__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        lexicalValue1768_174_0 = lexicalValue1768_160_0;
        break lexical_join_174;
    }
    if (!((lexicalValue1768_160_0 != 0))) {
        break lexical_join_226;
    }
    spill1768_4 = ((net.minecraft.item.ItemStack)(p1)).a__yw();
    spill1768_5 = "Decorations";
    spill1768_6 = __sourceIntrinsic_f16a6f918830_invokedynamic1768_69(19687, (756460426925887098L ^ life3_3));
    if (!((life5_5 != null))) {
        lexicalValue1768_183_0 = spill1768_4;
        lexicalValue1768_183_1 = spill1768_5;
        lexicalValue1768_183_2 = spill1768_6;
        break lexical_join_183;
    }
    lexicalValue1768_174_0 = ((((net.minecraft.nbt.NBTTagCompound)(spill1768_4)).a__Boolean(((java.lang.String)(spill1768_5)), ((int)(spill1768_6)))) ? 1 : 0);
    }
    if (!((lexicalValue1768_174_0 != 0))) {
        break lexical_join_226;
    }
    lexicalValue1768_183_0 = ((net.minecraft.item.ItemStack)(p1)).a__yw();
    lexicalValue1768_183_1 = "Decorations";
    lexicalValue1768_183_2 = __sourceIntrinsic_f16a6f918830_invokedynamic1768_73(8574, (1572123484122260455L ^ life3_3));
    }
    life6_241 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1768_183_0)).a(((java.lang.String)(lexicalValue1768_183_1)), ((int)(lexicalValue1768_183_2)));
    life7_243 = 0;
    lexical_cycle_187: while (true) {
    lexical_join_224: {
    lexical_join_223: {
    if (!((life7_243 < ((net.minecraft.nbt.NBTTagList)(life6_241)).a__Int()))) {
        break lexical_join_226;
    }
    life8_251 = ((net.minecraft.nbt.NBTTagList)(life6_241)).a__yw(((int)(life7_243)));
    if (!((life5_5 != null))) {
        break lexical_join_224;
    }
    if (!((!((java.util.Map)(this.j)).containsKey(((java.lang.Object)(((net.minecraft.nbt.NBTTagCompound)(life8_251)).a__String(((java.lang.String)("id"))))))))) {
        break lexical_join_223;
    }
    ((net.minecraft.world.storage.MapData)(this)).a(((int)(((net.minecraft.nbt.NBTTagCompound)(life8_251)).b__sourceReturn_d4c7a9581c(((java.lang.String)("type"))))), ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(p0)).i)), ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life8_251)).a__String(((java.lang.String)("id"))))), ((double)(((net.minecraft.nbt.NBTTagCompound)(life8_251)).a__Double(((java.lang.String)("x"))))), ((double)(((net.minecraft.nbt.NBTTagCompound)(life8_251)).a__Double(((java.lang.String)("z"))))), ((double)(((net.minecraft.nbt.NBTTagCompound)(life8_251)).a__Double(((java.lang.String)("rot"))))));
    }
    life7_243 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_187; }
    break lexical_cycle_187;
    }
    }
    return;
}


private void a(int p0, net.minecraft.world.World p1, java.lang.String p2, double p3, double p4, double p5) {
double forwardValue76_93_0;
    double forwardValue76_93_1;
    double forwardValue76_94_0;
    double forwardValue76_95_0;
    double forwardValue76_95_1;
    int forwardValue76_154_0;
    int forwardValue76_161_0;
    int forwardValue76_177_0;
    int forwardValue76_200_0;
    int forwardValue76_216_0;
    int forwardValue76_230_0;
    int forwardValue76_239_0;
    java.lang.Object forwardValue76_252_0;
    java.lang.String spill76_0;
    int spill76_1;
    int spill76_2;
    int spill76_3;
    int spill76_4;
    double spill76_5;
    double spill76_6;
    net.minecraft.world.storage.MapData spill76_7;
    int spill76_8;
    long life10_3;
    int life13_8;
    float life14_18;
    float life15_28;
    int life16_37;
    int life17_47;
    java.lang.String life12_48;
    int life18_54;
    double life8_126;
    int life19_134;
    int life20_149;
    forward_join_252: {
    forward_join_240: {
    forward_join_239: {
    forward_join_230: {
    forward_join_226: {
    forward_join_216: {
    forward_join_212: {
    forward_join_200: {
    forward_join_195: {
    forward_join_177: {
    forward_join_170: {
    forward_join_164: {
    forward_join_161: {
    forward_join_154: {
    forward_join_150: {
    forward_join_95: {
    forward_join_94: {
    forward_join_93: {
    life10_3 = (net.minecraft.world.storage.MapData.k ^ 28934454736793L);
    life13_8 = (1 << this.f);
    life14_18 = (((float) (p3 - ((double) this.c))) / ((float) life13_8));
    life15_28 = (((float) (p4 - ((double) this.d))) / ((float) life13_8));
    life16_37 = ((byte) ((int) (((double) (life14_18 * 0x1.0p1f)) + 0x1.0p-1d)));
    spill76_0 = net.minecraft.world.storage.WorldInfo.c__String();
    life17_47 = ((byte) ((int) (((double) (life15_28 * 0x1.0p1f)) + 0x1.0p-1d)));
    life12_48 = spill76_0;
    life18_54 = __sourceIntrinsic_c35812c66efa_invokedynamic76_5(17070, (4982900952483155416L ^ life10_3));
    spill76_1 = recovery.source.CarrierOps.fcmpl(((float)(life14_18)), ((float)(((float) (-life18_54)))));
    if (!((life12_48 != null))) {
        forwardValue76_154_0 = spill76_1;
        break forward_join_154;
    }
    if (!((spill76_1 >= 0))) {
        break forward_join_150;
    }
    spill76_2 = recovery.source.CarrierOps.fcmpl(((float)(life15_28)), ((float)(((float) (-life18_54)))));
    if (!((life12_48 != null))) {
        forwardValue76_154_0 = spill76_2;
        break forward_join_154;
    }
    if (!((spill76_2 >= 0))) {
        break forward_join_150;
    }
    spill76_3 = recovery.source.CarrierOps.fcmpg(((float)(life14_18)), ((float)(((float) life18_54))));
    if (!((life12_48 != null))) {
        forwardValue76_154_0 = spill76_3;
        break forward_join_154;
    }
    if (!((spill76_3 <= 0))) {
        break forward_join_150;
    }
    spill76_4 = recovery.source.CarrierOps.fcmpg(((float)(life15_28)), ((float)(((float) life18_54))));
    if (!((life12_48 != null))) {
        forwardValue76_154_0 = spill76_4;
        break forward_join_154;
    }
    if (!((spill76_4 <= 0))) {
        break forward_join_150;
    }
    spill76_5 = p5;
    spill76_6 = p5;
    if (!((life12_48 != null))) {
        forwardValue76_93_0 = spill76_5;
        forwardValue76_93_1 = spill76_6;
        break forward_join_93;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill76_6)), ((double)(0x0.0p0d))) < 0))) {
        forwardValue76_94_0 = spill76_5;
        break forward_join_94;
    }
    forwardValue76_93_0 = spill76_5;
    forwardValue76_93_1 = -0x1.0p3d;
    }
    forwardValue76_95_0 = forwardValue76_93_0;
    forwardValue76_95_1 = forwardValue76_93_1;
    break forward_join_95;
    }
    forwardValue76_95_0 = forwardValue76_94_0;
    forwardValue76_95_1 = 0x1.0p3d;
    }
    life8_126 = (forwardValue76_95_0 + forwardValue76_95_1);
    life19_134 = ((byte) ((int) ((life8_126 * 0x1.0p4d) / 0x1.68p8d)));
    spill76_7 = this;
    if (!((life12_48 != null))) {
        forwardValue76_252_0 = spill76_7;
        break forward_join_252;
    }
    if (!((((net.minecraft.world.storage.MapData)(spill76_7)).e < 0))) {
        break forward_join_240;
    }
    life20_149 = ((int) (((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(p1)).a__IX())).c__Long() / net.minecraft.world.storage.MapData.o));
    life19_134 = ((byte) (((((life20_149 * life20_149) * __sourceIntrinsic_c35812c66efa_invokedynamic76_15(26416, (2982444450366548044L ^ life10_3))) + (life20_149 * __sourceIntrinsic_c35812c66efa_invokedynamic76_16(14450, (2796662880841807624L ^ life10_3)))) >> __sourceIntrinsic_c35812c66efa_invokedynamic76_17(31337, (4603463723786925340L ^ life10_3))) & __sourceIntrinsic_c35812c66efa_invokedynamic76_18(13151, (140257792810236974L ^ life10_3))));
    if (!((life12_48 == null))) {
        break forward_join_240;
    }
    }
    forwardValue76_154_0 = recovery.source.CarrierOps.fcmpl(((float)(java.lang.Math.abs(((float)(life14_18))))), ((float)(0x1.4p8f)));
    }
    if (!((life12_48 != null))) {
        forwardValue76_161_0 = forwardValue76_154_0;
        break forward_join_161;
    }
    if (!((forwardValue76_154_0 < 0))) {
        break forward_join_164;
    }
    forwardValue76_161_0 = recovery.source.CarrierOps.fcmpl(((float)(java.lang.Math.abs(((float)(life15_28))))), ((float)(0x1.4p8f)));
    }
    if (!((life12_48 != null))) {
        forwardValue76_177_0 = forwardValue76_161_0;
        break forward_join_177;
    }
    if (!((forwardValue76_161_0 >= 0))) {
        break forward_join_170;
    }
    }
    ((java.util.Map)(this.j)).remove(((java.lang.Object)(p2)));
    return;
    }
    p0 = __sourceIntrinsic_c35812c66efa_invokedynamic76_25(4578, (3039293393515421334L ^ life10_3));
    forwardValue76_177_0 = 0;
    }
    life19_134 = forwardValue76_177_0;
    spill76_8 = recovery.source.CarrierOps.fcmpg(((float)(life14_18)), ((float)(((float) (-life18_54)))));
    if (!((life12_48 != null))) {
        forwardValue76_200_0 = spill76_8;
        break forward_join_200;
    }
    if (!((spill76_8 <= 0))) {
        break forward_join_195;
    }
    life16_37 = ((byte) ((int) (((double) (life18_54 * 2)) + 0x1.4p1d)));
    }
    forwardValue76_200_0 = recovery.source.CarrierOps.fcmpg(((float)(life15_28)), ((float)(((float) (-life18_54)))));
    }
    if (!((life12_48 != null))) {
        forwardValue76_216_0 = forwardValue76_200_0;
        break forward_join_216;
    }
    if (!((forwardValue76_200_0 <= 0))) {
        break forward_join_212;
    }
    life17_47 = ((byte) ((int) (((double) (life18_54 * 2)) + 0x1.4p1d)));
    }
    forwardValue76_216_0 = recovery.source.CarrierOps.fcmpl(((float)(life14_18)), ((float)(((float) life18_54))));
    }
    if (!((life12_48 != null))) {
        forwardValue76_230_0 = forwardValue76_216_0;
        break forward_join_230;
    }
    if (!((forwardValue76_216_0 >= 0))) {
        break forward_join_226;
    }
    life16_37 = ((byte) ((life18_54 * 2) + 1));
    }
    forwardValue76_230_0 = recovery.source.CarrierOps.fcmpl(((float)(life15_28)), ((float)(((float) life18_54))));
    }
    if (!((life12_48 != null))) {
        forwardValue76_239_0 = forwardValue76_230_0;
        break forward_join_239;
    }
    if (!((forwardValue76_230_0 >= 0))) {
        break forward_join_240;
    }
    forwardValue76_239_0 = ((int)(((byte) ((life18_54 * 2) + 1))));
    }
    life17_47 = forwardValue76_239_0;
    }
    forwardValue76_252_0 = ((java.util.Map)(this.j)).put(((java.lang.Object)(p2)), ((java.lang.Object)(new moom.DY(((byte) p0), ((byte)(life16_37)), ((byte)(life17_47)), ((byte)(life19_134))))));
    }
    recovery.source.CarrierOps.discard(forwardValue76_252_0);
    return;
}


public moom.yK a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
moom.IN forwardValue5858_19_0;
    moom.yK forwardValue5858_21_0;
    java.lang.String spill5858_0;
    moom.IN spill5858_1;
    long life4_3;
    moom.IN life7_10;
    java.lang.String life6_11;
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    life4_3 = (net.minecraft.world.storage.MapData.k ^ 68478589656379L);
    spill5858_0 = net.minecraft.world.storage.WorldInfo.c__String();
    life7_10 = ((moom.IN)(((java.util.Map)(this.i)).get(((java.lang.Object)(p2)))));
    life6_11 = spill5858_0;
    spill5858_1 = life7_10;
    if (!((life6_11 != null))) {
        forwardValue5858_19_0 = spill5858_1;
        break forward_join_19;
    }
    if (!((spill5858_1 == null))) {
        break forward_join_18;
    }
    forwardValue5858_21_0 = null;
    break forward_join_21;
    }
    forwardValue5858_19_0 = life7_10;
    }
    forwardValue5858_21_0 = ((moom.IN)(forwardValue5858_19_0)).a(((net.minecraft.item.ItemStack)(p0)));
    }
    return forwardValue5858_21_0;
}


public void a(int p0, int p1) {
java.lang.String spill1767_0;
    long life3_3;
    java.lang.String life5_7;
    java.util.Iterator life6_11;
    moom.IN life7_18;
    lexical_join_25: {
    life3_3 = (net.minecraft.world.storage.MapData.k ^ 115759312252808L);
    spill1767_0 = net.minecraft.world.storage.WorldInfo.c__String();
    super.a();
    life5_7 = spill1767_0;
    life6_11 = ((java.util.List)(this.h)).iterator();
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life6_11)).hasNext())) {
        break lexical_join_25;
    }
    life7_18 = ((moom.IN)(((java.util.Iterator)(life6_11)).next()));
    ((moom.IN)(life7_18)).a(((int)(p0)), ((int)(p1)));
    if (!((life5_7 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_ca5a37c9e57bd482_originalDynamicSite4041_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a50d5745fc8c_originalDynamicSite2080_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a50d5745fc8c_originalDynamicSite2080_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a50d5745fc8c_originalDynamicSite2080_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c35812c66efa_invokedynamic76_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c35812c66efa_invokedynamic76_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c35812c66efa_invokedynamic76_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c35812c66efa_invokedynamic76_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c35812c66efa_invokedynamic76_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c35812c66efa_invokedynamic76_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12742_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f16a6f918830_invokedynamic1768_59(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f16a6f918830_invokedynamic1768_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f16a6f918830_invokedynamic1768_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f16a6f918830_invokedynamic1768_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic735_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic735_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic735_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic735_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic735_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic735_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic735_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic735_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac4a479fad6b_originalDynamicSite2079_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac4a479fad6b_originalDynamicSite2079_11(int a0, long a1) throws E;
}
