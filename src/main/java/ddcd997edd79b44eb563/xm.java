package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xm extends net.minecraft.item.Item {

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public xm() {
super();
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-5353490144252342403L)), ((long)(-3981575005345224855L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147551723252582L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xm.n ^ 135247016255421L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1691_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1691_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1691_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1691_14 = new byte[8];
    (__sourceSpill1691_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1691_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1691_16 = __sourceSpill1691_14;
    ((javax.crypto.Cipher)(__sourceSpill1691_11)).init(((int)(__sourceSpill1691_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1691_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1691_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "<\"\006¦;B¨Ëë®Á\f´ùCõ#è\0078MÚÙJ¢ÿÁá3\007Ä\027¡ñÛªN.ó\030"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1691_25 = local6_life21;
        int __sourceSpill1691_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1691_25)).substring(((int)(__sourceSpill1691_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1691_30 = local8_life19;
        int __sourceSpill1691_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1691_33 = new byte[8];
        (__sourceSpill1691_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1691_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1691_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1691_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1691_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1691_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1691_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1691_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1691_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1691_34)).doFinal(((byte[])(__sourceSpill1691_33)));
        (__sourceSpill1691_30)[__sourceSpill1691_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ö/ôÑ\004ô}A^\nwBðÍ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1691_38 = local6_life21;
        int __sourceSpill1691_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1691_38)).substring(((int)(__sourceSpill1691_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1691_43 = local8_life19;
        int __sourceSpill1691_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1691_46 = new byte[8];
        (__sourceSpill1691_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1691_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1691_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1691_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1691_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1691_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1691_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1691_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1691_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1691_47)).doFinal(((byte[])(__sourceSpill1691_46)));
        (__sourceSpill1691_43)[__sourceSpill1691_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17824;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xm.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9745_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static net.minecraft.nbt.NBTBase a(net.minecraft.item.ItemStack p0, java.lang.String p1) {
net.minecraft.item.ItemStack forwardValue4529_12_0;
    net.minecraft.nbt.NBTBase forwardValue4529_23_0;
    net.minecraft.item.ItemStack spill4529_0;
    net.minecraft.nbt.NBTTagCompound spill4529_1;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagCompound life5_21;
    forward_join_24: {
    forward_join_23: {
    forward_join_12: {
    life2_3 = (moom.xm.n ^ 114519271836727L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4529_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue4529_12_0 = spill4529_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.item.ItemStack)(spill4529_0)).e__Boolean())) {
        break forward_join_24;
    }
    forwardValue4529_12_0 = p0;
    }
    life5_21 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(forwardValue4529_12_0)).a__yw())).a__yw(((java.lang.String)("Explosion")));
    spill4529_1 = life5_21;
    if (!((life4_5 != 0))) {
        forwardValue4529_23_0 = spill4529_1;
        break forward_join_23;
    }
    if (!((spill4529_1 != null))) {
        break forward_join_24;
    }
    forwardValue4529_23_0 = ((net.minecraft.nbt.NBTTagCompound)(life5_21)).a__yn(((java.lang.String)(p1)));
    }
    return forwardValue4529_23_0;
    }
    return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
int lexicalValue1419_15_0;
    int lexicalValue1419_35_0;
    int lexicalValue1419_50_0;
    int spill1419_0;
    int spill1419_1;
    int spill1419_2;
    long life3_3;
    int life5_5;
    net.minecraft.nbt.NBTBase life6_25;
    moom.yy life7_36;
    int[] life8_50;
    int life9_67;
    int life10_69;
    int life11_71;
    int[] life12_73;
    int life13_76;
    int life14_78;
    int life15_85;
    lexical_join_131: {
    lexical_join_116: {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_30: {
    lexical_join_16: {
    lexical_join_15: {
    life3_3 = (moom.xm.n ^ 136079590380380L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill1419_0 = p1;
    if (!((life5_5 == 0))) {
        lexicalValue1419_15_0 = spill1419_0;
        break lexical_join_15;
    }
    if (!((spill1419_0 != 1))) {
        break lexical_join_16;
    }
    lexicalValue1419_15_0 = super.a(((net.minecraft.item.ItemStack)(p0)), ((int)(p1)));
    }
    return lexicalValue1419_15_0;
    }
    life6_25 = moom.xm.a(((net.minecraft.item.ItemStack)(p0)), ((java.lang.String)("Colors")));
    spill1419_1 = ((life6_25 instanceof moom.yy) ? 1 : 0);
    if (!((life5_5 == 0))) {
        lexicalValue1419_35_0 = spill1419_1;
        break lexical_join_35;
    }
    if (!((spill1419_1 != 0))) {
        break lexical_join_30;
    }
    life7_36 = ((moom.yy)(life6_25));
    if (!((life5_5 != 0))) {
        break lexical_join_36;
    }
    }
    lexicalValue1419_35_0 = __sourceIntrinsic_3a92510638ee_invokedynamic1419_7(31030, (38310892554955968L ^ life3_3));
    }
    return lexicalValue1419_35_0;
    }
    life8_50 = ((moom.yy)(life7_36)).a__ArrayInt();
    spill1419_2 = (life8_50).length;
    if (!((life5_5 == 0))) {
        lexicalValue1419_50_0 = spill1419_2;
        break lexical_join_50;
    }
    if (!((spill1419_2 == 1))) {
        break lexical_join_49;
    }
    return (life8_50)[0];
    }
    lexicalValue1419_50_0 = 0;
    }
    life9_67 = lexicalValue1419_50_0;
    life10_69 = 0;
    life11_71 = 0;
    life12_73 = life8_50;
    life13_76 = (life12_73).length;
    life14_78 = 0;
    lexical_cycle_62: while (true) {
    if (!((life14_78 < life13_76))) {
        break lexical_join_116;
    }
    life15_85 = (life12_73)[life14_78];
    life9_67 = (life9_67 + ((life15_85 & __sourceIntrinsic_3a92510638ee_invokedynamic1419_9(23965, (6859140456068024429L ^ life3_3))) >> __sourceIntrinsic_3a92510638ee_invokedynamic1419_10(10991, (8376366834659622684L ^ life3_3))));
    life10_69 = (life10_69 + ((life15_85 & __sourceIntrinsic_3a92510638ee_invokedynamic1419_11(31506, (8374956732205674211L ^ life3_3))) >> __sourceIntrinsic_3a92510638ee_invokedynamic1419_12(22342, (5051766571804164785L ^ life3_3))));
    life11_71 = (life11_71 + (life15_85 & __sourceIntrinsic_3a92510638ee_invokedynamic1419_13(10606, (917525885793991834L ^ life3_3))));
    life14_78 += 1;
    if (!((life5_5 == 0))) {
        break lexical_join_131;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_62; }
    break lexical_cycle_62;
    }
    }
    life9_67 = (life9_67 / (life8_50).length);
    life10_69 = (life10_69 / (life8_50).length);
    life11_71 = (life11_71 / (life8_50).length);
    }
    return (((life9_67 << __sourceIntrinsic_3a92510638ee_invokedynamic1419_14(10991, (8376366834659622684L ^ life3_3))) | (life10_69 << __sourceIntrinsic_3a92510638ee_invokedynamic1419_15(7111, (7078577146334170677L ^ life3_3)))) | life11_71);
}


public static void a(net.minecraft.nbt.NBTTagCompound p0, java.util.List<java.lang.String> p1) {
int forestValue521_33_0;
    int forestValue521_58_0;
    int forestValue521_58_1;
    int forestValue521_76_0;
    int forestValue521_93_0;
    int forestValue521_121_0;
    int[] forestValue521_125_0;
    int forestValue521_149_0;
    int forestValue521_149_1;
    int forestValue521_167_0;
    int forestValue521_187_0;
    int forestValue521_215_0;
    int forestValue521_219_0;
    int forestValue521_232_0;
    int forestValue521_241_0;
    boolean spill521_0;
    int spill521_1;
    int spill521_2;
    int[] spill521_3;
    int spill521_4;
    int spill521_5;
    int spill521_6;
    int spill521_7;
    int spill521_8;
    int spill521_9;
    int spill521_10;
    int spill521_11;
    int spill521_12;
    long life2_3;
    int life5_8;
    int life4_9;
    int[] life6_42;
    int life7_50;
    java.lang.StringBuilder life8_54;
    int[] life9_56;
    int life10_59;
    int life11_61;
    int life12_68;
    int life13_85;
    int life14_87;
    int[] life7_137;
    int life8_145;
    java.lang.StringBuilder life9_152;
    int[] life10_154;
    int life11_157;
    int life12_159;
    int life13_166;
    int life14_183;
    int life15_185;
    int life8_238;
    int life9_253;
    forest_join_242: {
    forest_join_241: {
    forest_join_232: {
    forest_join_229: {
    forest_join_219: {
    forest_join_216: {
    forest_join_215: {
    forest_join_211: {
    forest_join_125: {
    forest_join_122: {
    forest_join_121: {
    forest_join_117: {
    forest_join_34: {
    forest_join_33: {
    forest_join_28: {
    life2_3 = (moom.xm.n ^ 79729884108724L);
    spill521_0 = net.minecraft.item.ItemStack.m();
    life5_8 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Type")));
    life4_9 = ((spill521_0) ? 1 : 0);
    spill521_1 = life5_8;
    if (!((life4_9 != 0))) {
        forestValue521_33_0 = spill521_1;
        break forest_join_33;
    }
    if (!((spill521_1 >= 0))) {
        break forest_join_28;
    }
    spill521_2 = life5_8;
    if (!((life4_9 != 0))) {
        forestValue521_33_0 = spill521_2;
        break forest_join_33;
    }
    if (!((spill521_2 <= 4))) {
        break forest_join_28;
    }
    ((java.util.List)(p1)).add(((java.lang.Object)(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_a0af69b01913_invokedynamic521_4(life5_8)))))).trim())));
    if (!((life4_9 == 0))) {
        break forest_join_34;
    }
    }
    forestValue521_33_0 = ((((java.util.List)(p1)).add(((java.lang.Object)(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)("item.fireworksCharge.type"))))).trim())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue521_33_0);
    }
    life6_42 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__ArrayInt(((java.lang.String)("Colors")));
    spill521_3 = life6_42;
    if (!((life4_9 != 0))) {
        forestValue521_125_0 = spill521_3;
        break forest_join_125;
    }
    if (!(((spill521_3).length > 0))) {
        break forest_join_122;
    }
    life7_50 = 1;
    life8_54 = new java.lang.StringBuilder();
    life9_56 = life6_42;
    life10_59 = (life9_56).length;
    life11_61 = 0;
    forest_cycle_56: while (true) {
    forest_join_114: {
    forest_join_107: {
    forestValue521_58_0 = life11_61;
    forestValue521_58_1 = life10_59;
    forest_cycle_58: while (true) {
    forest_join_76: {
    forest_join_73: {
    if (!((forestValue521_58_0 < forestValue521_58_1))) {
        break forest_join_117;
    }
    life12_68 = (life9_56)[life11_61];
    spill521_4 = life7_50;
    if (!((life4_9 != 0))) {
        forestValue521_121_0 = spill521_4;
        break forest_join_121;
    }
    if (!((life4_9 != 0))) {
        forestValue521_76_0 = spill521_4;
        break forest_join_76;
    }
    if (!((spill521_4 == 0))) {
        break forest_join_73;
    }
    ((java.lang.StringBuilder)(life8_54)).append(((java.lang.String)(", ")));
    }
    life7_50 = 0;
    forestValue521_76_0 = 0;
    }
    life13_85 = forestValue521_76_0;
    life14_87 = 0;
    forest_cycle_79: while (true) {
    forest_join_104: {
    forest_join_93: {
    if (!((life14_87 < (moom.xd.n).length))) {
        break forest_join_107;
    }
    spill521_5 = life12_68;
    if (!((life4_9 != 0))) {
        forestValue521_93_0 = spill521_5;
        break forest_join_93;
    }
    spill521_6 = (moom.xd.n)[life14_87];
    if (!((life4_9 != 0))) {
        forestValue521_58_0 = spill521_5;
        forestValue521_58_1 = spill521_6;
        continue forest_cycle_58;
    }
    if (!((spill521_5 == spill521_6))) {
        break forest_join_104;
    }
    forestValue521_93_0 = 1;
    }
    life13_85 = forestValue521_93_0;
    ((java.lang.StringBuilder)(life8_54)).append(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_a0af69b01913_invokedynamic521_19(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.a(((int)(life14_87))))).b__String())))))));
    if (!((life4_9 == 0))) {
        break forest_join_107;
    }
    }
    life14_87 += 1;
    if (!((life4_9 == 0))) {
        continue forest_cycle_79;
    }
    break forest_cycle_79;
    }
    break forest_cycle_58;
    }
    }
    if (!((life13_85 == 0))) {
        break forest_join_114;
    }
    ((java.lang.StringBuilder)(life8_54)).append(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)("item.fireworksCharge.customColor"))))));
    }
    life11_61 += 1;
    if (!((life4_9 == 0))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    }
    forestValue521_121_0 = ((((java.util.List)(p1)).add(((java.lang.Object)(((java.lang.StringBuilder)(life8_54)).toString())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue521_121_0);
    }
    forestValue521_125_0 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__ArrayInt(((java.lang.String)("FadeColors")));
    }
    life7_137 = forestValue521_125_0;
    spill521_7 = (life7_137).length;
    if (!((life4_9 != 0))) {
        forestValue521_219_0 = spill521_7;
        break forest_join_219;
    }
    if (!((spill521_7 > 0))) {
        break forest_join_216;
    }
    life8_145 = 1;
    life9_152 = new java.lang.StringBuilder(__sourceIntrinsic_a0af69b01913_invokedynamic521_30(net.minecraft.util.StatCollector.a(((java.lang.String)("item.fireworksCharge.fadeTo")))));
    life10_154 = life7_137;
    life11_157 = (life10_154).length;
    life12_159 = 0;
    forest_cycle_147: while (true) {
    forest_join_208: {
    forest_join_201: {
    forestValue521_149_0 = life12_159;
    forestValue521_149_1 = life11_157;
    forest_cycle_149: while (true) {
    forest_join_167: {
    forest_join_164: {
    if (!((forestValue521_149_0 < forestValue521_149_1))) {
        break forest_join_211;
    }
    life13_166 = (life10_154)[life12_159];
    spill521_8 = life8_145;
    if (!((life4_9 != 0))) {
        forestValue521_215_0 = spill521_8;
        break forest_join_215;
    }
    if (!((life4_9 != 0))) {
        forestValue521_167_0 = spill521_8;
        break forest_join_167;
    }
    if (!((spill521_8 == 0))) {
        break forest_join_164;
    }
    ((java.lang.StringBuilder)(life9_152)).append(((java.lang.String)(", ")));
    }
    life8_145 = 0;
    forestValue521_167_0 = 0;
    }
    life14_183 = forestValue521_167_0;
    life15_185 = 0;
    forest_cycle_170: while (true) {
    forest_join_198: {
    forest_join_187: {
    if (!((life15_185 < __sourceIntrinsic_a0af69b01913_invokedynamic521_32(731, (4268485506561708998L ^ life2_3))))) {
        break forest_join_201;
    }
    spill521_9 = life13_166;
    if (!((life4_9 != 0))) {
        forestValue521_187_0 = spill521_9;
        break forest_join_187;
    }
    spill521_10 = (moom.xd.n)[life15_185];
    if (!((life4_9 != 0))) {
        forestValue521_149_0 = spill521_9;
        forestValue521_149_1 = spill521_10;
        continue forest_cycle_149;
    }
    if (!((spill521_9 == spill521_10))) {
        break forest_join_198;
    }
    forestValue521_187_0 = 1;
    }
    life14_183 = forestValue521_187_0;
    ((java.lang.StringBuilder)(life9_152)).append(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_a0af69b01913_invokedynamic521_36(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.a(((int)(life15_185))))).b__String())))))));
    if (!((life4_9 == 0))) {
        break forest_join_201;
    }
    }
    life15_185 += 1;
    if (!((life4_9 == 0))) {
        continue forest_cycle_170;
    }
    break forest_cycle_170;
    }
    break forest_cycle_149;
    }
    }
    if (!((life14_183 == 0))) {
        break forest_join_208;
    }
    ((java.lang.StringBuilder)(life9_152)).append(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)("item.fireworksCharge.customColor"))))));
    }
    life12_159 += 1;
    if (!((life4_9 == 0))) {
        continue forest_cycle_147;
    }
    break forest_cycle_147;
    }
    }
    forestValue521_215_0 = ((((java.util.List)(p1)).add(((java.lang.Object)(((java.lang.StringBuilder)(life9_152)).toString())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue521_215_0);
    }
    forestValue521_219_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Trail")))) ? 1 : 0);
    }
    life8_238 = forestValue521_219_0;
    spill521_11 = life8_238;
    if (!((life4_9 != 0))) {
        forestValue521_232_0 = spill521_11;
        break forest_join_232;
    }
    if (!((spill521_11 != 0))) {
        break forest_join_229;
    }
    ((java.util.List)(p1)).add(((java.lang.Object)(net.minecraft.util.StatCollector.a(((java.lang.String)("item.fireworksCharge.trail"))))));
    }
    forestValue521_232_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Flicker")))) ? 1 : 0);
    }
    life9_253 = forestValue521_232_0;
    spill521_12 = life9_253;
    if (!((life4_9 != 0))) {
        forestValue521_241_0 = spill521_12;
        break forest_join_241;
    }
    if (!((spill521_12 != 0))) {
        break forest_join_242;
    }
    forestValue521_241_0 = ((((java.util.List)(p1)).add(((java.lang.Object)(net.minecraft.util.StatCollector.a(((java.lang.String)("item.fireworksCharge.flicker"))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue521_241_0);
    }
    return;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List<java.lang.String> p2, boolean p3) {
net.minecraft.item.ItemStack forwardValue4530_12_0;
    net.minecraft.nbt.NBTTagCompound forwardValue4530_21_0;
    net.minecraft.item.ItemStack spill4530_0;
    net.minecraft.nbt.NBTTagCompound spill4530_1;
    long life5_3;
    int life7_5;
    net.minecraft.nbt.NBTTagCompound life8_21;
    forward_join_23: {
    forward_join_21: {
    forward_join_12: {
    life5_3 = (moom.xm.n ^ 34969208956100L);
    life7_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4530_0 = p0;
    if (!((life7_5 != 0))) {
        forwardValue4530_12_0 = spill4530_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.item.ItemStack)(spill4530_0)).e__Boolean())) {
        break forward_join_23;
    }
    forwardValue4530_12_0 = p0;
    }
    life8_21 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(forwardValue4530_12_0)).a__yw())).a__yw(((java.lang.String)("Explosion")));
    spill4530_1 = life8_21;
    if (!((life7_5 != 0))) {
        forwardValue4530_21_0 = spill4530_1;
        break forward_join_21;
    }
    if (!((spill4530_1 != null))) {
        break forward_join_23;
    }
    forwardValue4530_21_0 = life8_21;
    }
    moom.xm.a(((net.minecraft.nbt.NBTTagCompound)(forwardValue4530_21_0)), ((java.util.List)(p2)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic1419_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic1419_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic1419_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic1419_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic1419_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic1419_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic1419_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic1419_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a0af69b01913_invokedynamic521_4(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a0af69b01913_invokedynamic521_19(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a0af69b01913_invokedynamic521_30(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0af69b01913_invokedynamic521_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a0af69b01913_invokedynamic521_36(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9745_0() throws E;
}
