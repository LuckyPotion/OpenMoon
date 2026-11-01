package net.minecraft.client.audio;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class MusicTicker$MusicType extends sourcebuild.EnumConstructor<net.minecraft.client.audio.MusicTicker$MusicType> {

public static net.minecraft.client.audio.MusicTicker$MusicType MENU;

public static net.minecraft.client.audio.MusicTicker$MusicType GAME;

public static net.minecraft.client.audio.MusicTicker$MusicType CREATIVE;

public static net.minecraft.client.audio.MusicTicker$MusicType CREDITS;

public static net.minecraft.client.audio.MusicTicker$MusicType NETHER;

public static net.minecraft.client.audio.MusicTicker$MusicType END_BOSS;

public static net.minecraft.client.audio.MusicTicker$MusicType END;

private moom.DD a;

private int b;

private int c;

private static net.minecraft.client.audio.MusicTicker$MusicType[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private MusicTicker$MusicType(java.lang.String p0, int p1, moom.DD p2, int p3, int p4) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(4411529201838167584L)), ((long)(-1157401751956326204L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(17359171323237L)))));
    long local11_life6 = (net.minecraft.client.audio.MusicTicker$MusicType.e ^ 46475519447247L);
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1761_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1761_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1761_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1761_14 = new byte[8];
    (__sourceSpill1761_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1761_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1761_16 = __sourceSpill1761_14;
    ((javax.crypto.Cipher)(__sourceSpill1761_11)).init(((int)(__sourceSpill1761_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1761_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1761_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[15];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "ÿ\024\nü\031ü¨é\037¨FõáHãnÉ<ñ§ÍGKZ©Êé\n¹\177²\f_øÐÌe4¢Ò8×\005çnè>³¯dF £\033$o^¥_Å+n½dqý(E_6¢FX]Í_\0168 °Anõ<O{V<\022Hy)"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1761_25 = local4_life21;
        int __sourceSpill1761_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1761_25)).substring(((int)(__sourceSpill1761_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1761_30 = local6_life19;
        int __sourceSpill1761_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1761_33 = new byte[8];
        (__sourceSpill1761_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1761_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1761_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1761_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1761_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1761_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1761_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1761_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1761_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1761_34)).doFinal(((byte[])(__sourceSpill1761_33)));
        (__sourceSpill1761_30)[__sourceSpill1761_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Ç­Hàv\027fFHH§r"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1761_38 = local4_life21;
        int __sourceSpill1761_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1761_38)).substring(((int)(__sourceSpill1761_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1761_43 = local6_life19;
        int __sourceSpill1761_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1761_46 = new byte[8];
        (__sourceSpill1761_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1761_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1761_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1761_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1761_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1761_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1761_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1761_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1761_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1761_47)).doFinal(((byte[])(__sourceSpill1761_46)));
        (__sourceSpill1761_43)[__sourceSpill1761_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    f = ((long[])(local6_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[15]));
    MENU = ((net.minecraft.client.audio.MusicTicker$MusicType)(new net.minecraft.client.audio.MusicTicker$MusicType("MENU", 0, new moom.DD("minecraft:music.menu"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_52(23209, (2152628717241715217L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_53(2640, (2269037158869768935L ^ local11_life6)))));
    GAME = ((net.minecraft.client.audio.MusicTicker$MusicType)(new net.minecraft.client.audio.MusicTicker$MusicType("GAME", 1, new moom.DD("minecraft:music.game"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_55(3934, (2213510288947748844L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_56(17170, (1017987417399677860L ^ local11_life6)))));
    CREATIVE = ((net.minecraft.client.audio.MusicTicker$MusicType)(new net.minecraft.client.audio.MusicTicker$MusicType("CREATIVE", 2, new moom.DD("minecraft:music.game.creative"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_58(12933, (1924083589762163252L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_59(30328, (6740440582165817037L ^ local11_life6)))));
    CREDITS = ((net.minecraft.client.audio.MusicTicker$MusicType)(new net.minecraft.client.audio.MusicTicker$MusicType("CREDITS", 3, new moom.DD("minecraft:music.game.end.credits"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_61(3908, (4894834123877163007L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_62(6544, (7381991046713018671L ^ local11_life6)))));
    NETHER = ((net.minecraft.client.audio.MusicTicker$MusicType)(new net.minecraft.client.audio.MusicTicker$MusicType("NETHER", 4, new moom.DD("minecraft:music.game.nether"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_64(18234, (24515446749714311L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_65(12429, (1466892260684275764L ^ local11_life6)))));
    END_BOSS = ((net.minecraft.client.audio.MusicTicker$MusicType)(new net.minecraft.client.audio.MusicTicker$MusicType("END_BOSS", 5, new moom.DD("minecraft:music.game.end.dragon"), 0, 0)));
    END = ((net.minecraft.client.audio.MusicTicker$MusicType)(new net.minecraft.client.audio.MusicTicker$MusicType("END", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_68(16937, (8128208167823987351L ^ local11_life6)), new moom.DD("minecraft:music.game.end"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_69(27085, (1119608049974475133L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_70(16114, (6728554977175187016L ^ local11_life6)))));
    d = ((net.minecraft.client.audio.MusicTicker$MusicType[])(net.minecraft.client.audio.MusicTicker$MusicType.a__Arrayav()));
}


public static net.minecraft.client.audio.MusicTicker$MusicType[] values() {
return ((net.minecraft.client.audio.MusicTicker$MusicType[])(((net.minecraft.client.audio.MusicTicker$MusicType[])(net.minecraft.client.audio.MusicTicker$MusicType.d)).clone()));
}


public static net.minecraft.client.audio.MusicTicker$MusicType valueOf(java.lang.String p0) {
return ((net.minecraft.client.audio.MusicTicker$MusicType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.audio.MusicTicker$MusicType.class)), ((java.lang.String)(p0)))));
}


public int b() {
return this.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10136_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/av"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.audio.MusicTicker$MusicType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14983;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/av", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public moom.DD a__DD() {
return this.a;
}


private static net.minecraft.client.audio.MusicTicker$MusicType[] a__Arrayav() {
long local0_life1 = (net.minecraft.client.audio.MusicTicker$MusicType.e ^ 67031294228221L);
    net.minecraft.client.audio.MusicTicker$MusicType[] __sourceSharedArray1032_4 = new net.minecraft.client.audio.MusicTicker$MusicType[__sourceIntrinsic_452ed013b161_originalDynamicSite1032_2(2860, (8585870253515636130L ^ local0_life1))];
    __sourceSharedArray1032_4[0] = net.minecraft.client.audio.MusicTicker$MusicType.MENU;
    __sourceSharedArray1032_4[1] = net.minecraft.client.audio.MusicTicker$MusicType.GAME;
    __sourceSharedArray1032_4[2] = net.minecraft.client.audio.MusicTicker$MusicType.CREATIVE;
    __sourceSharedArray1032_4[3] = net.minecraft.client.audio.MusicTicker$MusicType.CREDITS;
    __sourceSharedArray1032_4[4] = net.minecraft.client.audio.MusicTicker$MusicType.NETHER;
    __sourceSharedArray1032_4[5] = net.minecraft.client.audio.MusicTicker$MusicType.END_BOSS;
    __sourceSharedArray1032_4[__sourceIntrinsic_452ed013b161_originalDynamicSite1032_10(24507, (6679478078907820349L ^ local0_life1))] = net.minecraft.client.audio.MusicTicker$MusicType.END;
    return __sourceSharedArray1032_4;
}


public int a() {
return this.b;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1761_70(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10136_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_452ed013b161_originalDynamicSite1032_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_452ed013b161_originalDynamicSite1032_10(int a0, long a1) throws E;
}
