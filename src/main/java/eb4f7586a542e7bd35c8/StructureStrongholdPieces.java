package net.minecraft.world.gen.structure;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class StructureStrongholdPieces {

private static final moom.IA[] a;

private static java.util.List<moom.IA> b;

private static java.lang.Class<? extends moom.HF> c;

static int d;

private static final moom.Ia e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public StructureStrongholdPieces() {
super();
}


static {
javax.crypto.Cipher forestValue584_36_0;
    int forestValue584_36_1;
    javax.crypto.SecretKeyFactory forestValue584_36_2;
    byte[] forestValue584_36_3;
    javax.crypto.Cipher forestValue584_53_0;
    int forestValue584_53_1;
    javax.crypto.SecretKeyFactory forestValue584_53_2;
    byte[] forestValue584_53_3;
    long[] forestValue584_157_0;
    int forestValue584_157_1;
    long forestValue584_157_2;
    int forestValue584_157_3;
    long[] forestValue584_300_0;
    int forestValue584_300_1;
    long forestValue584_300_2;
    long[] forestValue584_312_0;
    int forestValue584_312_1;
    long forestValue584_312_2;
    javax.crypto.Cipher spill584_0;
    int spill584_1;
    javax.crypto.SecretKeyFactory spill584_2;
    byte[] spill584_3;
    byte[] spill584_4;
    java.lang.String spill584_5;
    int spill584_6;
    int spill584_7;
    long spill584_8;
    byte[] spill584_9;
    byte[] spill584_10;
    byte[] spill584_11;
    byte[] spill584_12;
    byte[] spill584_13;
    byte[] spill584_14;
    byte[] spill584_15;
    byte[] spill584_16;
    long spill584_17;
    int spill584_18;
    java.lang.String spill584_19;
    int spill584_20;
    long[] spill584_21;
    int spill584_22;
    long spill584_23;
    int spill584_24;
    moom.IA[] spill584_25;
    moom.IA[] spill584_26;
    moom.IA[] spill584_27;
    moom.IA[] spill584_28;
    moom.IA[] spill584_29;
    moom.IA[] spill584_30;
    moom.IA[] spill584_31;
    moom.IA[] spill584_32;
    moom.IA[] spill584_33;
    moom.IA[] spill584_34;
    moom.IA[] spill584_35;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    forest_join_399: {
    forest_join_53: {
    f = ((long)(((moom._a)(moom._c.a(((long)(3228112887541746509L)), ((long)(-5649656379488812336L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(51532177354422L)))));
    life11_11 = (net.minecraft.world.gen.structure.StructureStrongholdPieces.f ^ 80147719839135L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    spill584_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill584_1 = 2;
    spill584_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp584_9_0 = new byte[8];
    spill584_3 = __stackOp584_9_0;
    (__stackOp584_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue584_36_0 = spill584_0;
    forestValue584_36_1 = spill584_1;
    forestValue584_36_2 = spill584_2;
    forestValue584_36_3 = spill584_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue584_53_0 = forestValue584_36_0;
        forestValue584_53_1 = forestValue584_36_1;
        forestValue584_53_2 = forestValue584_36_2;
        forestValue584_53_3 = forestValue584_36_3;
        break forest_join_53;
    }
    byte[] __stackOp584_10_0 = forestValue584_36_3;
    spill584_4 = __stackOp584_10_0;
    (__stackOp584_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue584_36_3 = spill584_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue584_53_0)).init(((int)(forestValue584_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue584_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue584_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[14];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "G\fÃæÂ®\022}\001nÑÀòË\001\0277á±%ë¸X}\027w\tÿ]Ê/$ªñ\020²°JV·\004è\0309Ó¸{M^Öá!\035æ\006^|U¼³ù?Îj=_²=¼éçûKµù5ö«\003ÙjÇg"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill584_5 = life4_71;
    spill584_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill584_5)).substring(((int)(spill584_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue584_157_0 = life6_66;
    forestValue584_157_1 = (life3_68++);
    forestValue584_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue584_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp584_16_0 = forestValue584_157_2;
    int __stackOp584_16_1 = forestValue584_157_3;
    spill584_7 = __stackOp584_16_1;
    spill584_8 = __stackOp584_16_0;
    recovery.source.CarrierOps.discard(__stackOp584_16_1);
    life8_160 = spill584_8;
    byte[] __stackOp584_18_0 = new byte[8];
    spill584_9 = __stackOp584_18_0;
    (__stackOp584_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp584_19_0 = spill584_9;
    spill584_10 = __stackOp584_19_0;
    (__stackOp584_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp584_20_0 = spill584_10;
    spill584_11 = __stackOp584_20_0;
    (__stackOp584_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp584_21_0 = spill584_11;
    spill584_12 = __stackOp584_21_0;
    (__stackOp584_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp584_22_0 = spill584_12;
    spill584_13 = __stackOp584_22_0;
    (__stackOp584_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp584_23_0 = spill584_13;
    spill584_14 = __stackOp584_23_0;
    (__stackOp584_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp584_24_0 = spill584_14;
    spill584_15 = __stackOp584_24_0;
    (__stackOp584_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp584_25_0 = spill584_15;
    spill584_16 = __stackOp584_25_0;
    (__stackOp584_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp584_26_0 = spill584_16;
    javax.crypto.Cipher __stackOp584_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp584_26_1)).doFinal(((byte[])(__stackOp584_26_0)));
    int __stackOp584_28_0 = spill584_7;
    long __stackOp584_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill584_17 = __stackOp584_28_1;
    spill584_18 = __stackOp584_28_0;
    recovery.source.CarrierOps.discard(__stackOp584_28_1);
    switch (spill584_18) {
default:
{
        forestValue584_300_0 = forestValue584_157_0;
        forestValue584_300_1 = forestValue584_157_1;
        forestValue584_300_2 = spill584_17;
        break forest_join_300;
    }
case 0:
{
        forestValue584_312_0 = forestValue584_157_0;
        forestValue584_312_1 = forestValue584_157_1;
        forestValue584_312_2 = spill584_17;
        break forest_join_312;
    }
}
    }
    (forestValue584_300_0)[forestValue584_300_1] = forestValue584_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "\0237\033ð8\037=\035¤Ì\007[I"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue584_312_0)[forestValue584_312_1] = forestValue584_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill584_19 = life4_71;
    spill584_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill584_19)).substring(((int)(spill584_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill584_21 = life6_66;
    spill584_22 = (life3_68++);
    spill584_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill584_24 = 0;
    forestValue584_157_0 = spill584_21;
    forestValue584_157_1 = spill584_22;
    forestValue584_157_2 = spill584_23;
    forestValue584_157_3 = spill584_24;
    continue forest_cycle_157;
    }
    }
    }
    g = ((long[])(life6_66));
    h = ((java.lang.Integer[])(new java.lang.Integer[14]));
    moom.IA[] __stackOp584_36_0 = new moom.IA[__sourceIntrinsic_eb8803ad1f63_invokedynamic584_35(13602, (8152830620207729406L ^ life11_11))];
    spill584_25 = __stackOp584_36_0;
    (__stackOp584_36_0)[0] = new moom.IA(moom.HS.class, __sourceIntrinsic_eb8803ad1f63_invokedynamic584_38(3486, (7718255988032008779L ^ life11_11)), 0);
    moom.IA[] __stackOp584_39_0 = spill584_25;
    spill584_26 = __stackOp584_39_0;
    (__stackOp584_39_0)[1] = new moom.IA(moom.HN.class, 5, 5);
    moom.IA[] __stackOp584_41_0 = spill584_26;
    spill584_27 = __stackOp584_41_0;
    (__stackOp584_41_0)[2] = new moom.IA(moom.HJ.class, __sourceIntrinsic_eb8803ad1f63_invokedynamic584_43(967, (4395746133500754961L ^ life11_11)), 0);
    moom.IA[] __stackOp584_44_0 = spill584_27;
    spill584_28 = __stackOp584_44_0;
    (__stackOp584_44_0)[3] = new moom.IA(moom.HK.class, __sourceIntrinsic_eb8803ad1f63_invokedynamic584_46(5138, (4607732277966990277L ^ life11_11)), 0);
    moom.IA[] __stackOp584_47_0 = spill584_28;
    spill584_29 = __stackOp584_47_0;
    (__stackOp584_47_0)[4] = new moom.IA(moom.HO.class, __sourceIntrinsic_eb8803ad1f63_invokedynamic584_49(7873, (2558735821343514898L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic584_50(27938, (2132854346922824440L ^ life11_11)));
    moom.IA[] __stackOp584_51_0 = spill584_29;
    spill584_30 = __stackOp584_51_0;
    (__stackOp584_51_0)[5] = new moom.IA(moom.HR.class, 5, 5);
    moom.IA[] __stackOp584_53_0 = spill584_30;
    spill584_31 = __stackOp584_53_0;
    (__stackOp584_53_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic584_54(25198, (8455808277259918774L ^ life11_11))] = new moom.IA(moom.HP.class, 5, 5);
    moom.IA[] __stackOp584_56_0 = spill584_31;
    spill584_32 = __stackOp584_56_0;
    (__stackOp584_56_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic584_57(30798, (1420527555331458965L ^ life11_11))] = new moom.IA(net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.class, 5, 4);
    moom.IA[] __stackOp584_59_0 = spill584_32;
    spill584_33 = __stackOp584_59_0;
    (__stackOp584_59_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic584_60(6149, (7442468117815191516L ^ life11_11))] = new moom.IA(moom.HG.class, 5, 4);
    moom.IA[] __stackOp584_62_0 = spill584_33;
    spill584_34 = __stackOp584_62_0;
    (__stackOp584_62_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic584_63(20411, (3871281611335970927L ^ life11_11))] = new moom.IB(moom.HL.class, __sourceIntrinsic_eb8803ad1f63_invokedynamic584_65(17053, (4866139060849655117L ^ life11_11)), 2);
    moom.IA[] __stackOp584_66_0 = spill584_34;
    spill584_35 = __stackOp584_66_0;
    (__stackOp584_66_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic584_67(17053, (4866139060849655117L ^ life11_11))] = new moom.IC(moom.HM.class, __sourceIntrinsic_eb8803ad1f63_invokedynamic584_69(5138, (4607732277966990277L ^ life11_11)), 1);
    a = ((moom.IA[])(spill584_35));
    e = ((moom.Ia)(new moom.Ia()));
}


public static void b() {
net.minecraft.entity.Entity[] spill1766_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_7;
    moom.IA[] life3_9;
    int life4_12;
    int life5_14;
    moom.IA life6_21;
    lexical_join_36: {
    lexical_join_34: {
    life0_3 = (net.minecraft.world.gen.structure.StructureStrongholdPieces.f ^ 61469778828528L);
    spill1766_0 = moom.G4.b();
    b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    life2_7 = spill1766_0;
    life3_9 = net.minecraft.world.gen.structure.StructureStrongholdPieces.a;
    life4_12 = (life3_9).length;
    life5_14 = 0;
    lexical_cycle_15: while (true) {
    if (!((life5_14 < life4_12))) {
        break lexical_join_34;
    }
    life6_21 = (life3_9)[life5_14];
    ((moom.IA)(life6_21)).c = ((int)(0));
    ((java.util.List)(net.minecraft.world.gen.structure.StructureStrongholdPieces.b)).add(((java.lang.Object)(life6_21)));
    life5_14 += 1;
    if (!((life2_7 != null))) {
        break lexical_join_36;
    }
    if (!((life2_7 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    c = ((java.lang.Class)(null));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.gen.structure.StructureStrongholdPieces.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26640;
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
            throw new RuntimeException("moom/Iy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12734_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Iy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a() {
moom.G1.b(((java.lang.Class)(moom.HG.class)), ((java.lang.String)("SHCC")));
    moom.G1.b(((java.lang.Class)(moom.HH.class)), ((java.lang.String)("SHFC")));
    moom.G1.b(((java.lang.Class)(net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.class)), ((java.lang.String)("SH5C")));
    moom.G1.b(((java.lang.Class)(moom.HJ.class)), ((java.lang.String)("SHLT")));
    moom.G1.b(((java.lang.Class)(moom.HL.class)), ((java.lang.String)("SHLi")));
    moom.G1.b(((java.lang.Class)(moom.HM.class)), ((java.lang.String)("SHPR")));
    moom.G1.b(((java.lang.Class)(moom.HN.class)), ((java.lang.String)("SHPH")));
    moom.G1.b(((java.lang.Class)(moom.HK.class)), ((java.lang.String)("SHRT")));
    moom.G1.b(((java.lang.Class)(moom.HO.class)), ((java.lang.String)("SHRC")));
    moom.G1.b(((java.lang.Class)(moom.HP.class)), ((java.lang.String)("SHSD")));
    moom.G1.b(((java.lang.Class)(moom.HQ.class)), ((java.lang.String)("SHStart")));
    moom.G1.b(((java.lang.Class)(moom.HS.class)), ((java.lang.String)("SHS")));
    moom.G1.b(((java.lang.Class)(moom.HR.class)), ((java.lang.String)("SHSSD")));
    return;
}


private static boolean a__Boolean() {
int lexicalValue1764_39_0;
    int lexicalValue1764_39_1;
    int lexicalValue1764_40_0;
    int lexicalValue1764_44_0;
    net.minecraft.entity.Entity[] spill1764_0;
    int spill1764_1;
    int spill1764_2;
    int spill1764_3;
    long life0_3;
    int life3_6;
    net.minecraft.entity.Entity[] life2_7;
    java.util.Iterator life4_12;
    moom.IA life5_19;
    lexical_join_44: {
    lexical_join_43: {
    life0_3 = (net.minecraft.world.gen.structure.StructureStrongholdPieces.f ^ 140003614158533L);
    spill1764_0 = moom.G4.b();
    life3_6 = 0;
    life2_7 = spill1764_0;
    d = ((int)(0));
    life4_12 = ((java.util.List)(net.minecraft.world.gen.structure.StructureStrongholdPieces.b)).iterator();
    lexical_cycle_13: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_36: {
    if (!(((java.util.Iterator)(life4_12)).hasNext())) {
        break lexical_join_43;
    }
    life5_19 = ((moom.IA)(((java.util.Iterator)(life4_12)).next()));
    spill1764_1 = ((moom.IA)(life5_19)).d;
    if (!((life2_7 != null))) {
        lexicalValue1764_44_0 = spill1764_1;
        break lexical_join_44;
    }
    if (!((life2_7 != null))) {
        lexicalValue1764_40_0 = spill1764_1;
        break lexical_join_40;
    }
    if (!((spill1764_1 > 0))) {
        break lexical_join_36;
    }
    spill1764_2 = ((moom.IA)(life5_19)).c;
    spill1764_3 = ((moom.IA)(life5_19)).d;
    if (!((life2_7 != null))) {
        lexicalValue1764_39_0 = spill1764_2;
        lexicalValue1764_39_1 = spill1764_3;
        break lexical_join_39;
    }
    if (!((spill1764_2 < spill1764_3))) {
        break lexical_join_36;
    }
    life3_6 = 1;
    }
    lexicalValue1764_39_0 = net.minecraft.world.gen.structure.StructureStrongholdPieces.d;
    lexicalValue1764_39_1 = ((moom.IA)(life5_19)).b;
    }
    lexicalValue1764_40_0 = (lexicalValue1764_39_0 + lexicalValue1764_39_1);
    }
    d = ((int)(lexicalValue1764_40_0));
    if (!((life2_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1764_44_0 = life3_6;
    }
    return ((lexicalValue1764_44_0) != 0);
}


private static moom.HF a(java.lang.Class<? extends moom.HF> p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
java.lang.Class forestValue733_25_0;
    java.lang.Class forestValue733_25_1;
    java.lang.Class forestValue733_40_0;
    java.lang.Class forestValue733_40_1;
    java.lang.Class forestValue733_55_0;
    java.lang.Class forestValue733_55_1;
    java.lang.Class forestValue733_70_0;
    java.lang.Class forestValue733_70_1;
    java.lang.Class forestValue733_85_0;
    java.lang.Class forestValue733_85_1;
    java.lang.Class forestValue733_100_0;
    java.lang.Class forestValue733_100_1;
    java.lang.Class forestValue733_115_0;
    java.lang.Class forestValue733_115_1;
    java.lang.Class forestValue733_130_0;
    java.lang.Class forestValue733_130_1;
    java.lang.Class forestValue733_145_0;
    java.lang.Class forestValue733_145_1;
    java.lang.Class forestValue733_160_0;
    java.lang.Class forestValue733_160_1;
    net.minecraft.entity.Entity[] spill733_0;
    java.lang.Class spill733_1;
    java.lang.Class spill733_2;
    long life8_3;
    moom.HF life11_6;
    net.minecraft.entity.Entity[] life10_7;
    forest_join_170: {
    forest_join_160: {
    forest_join_158: {
    forest_join_145: {
    forest_join_143: {
    forest_join_130: {
    forest_join_128: {
    forest_join_115: {
    forest_join_113: {
    forest_join_100: {
    forest_join_98: {
    forest_join_85: {
    forest_join_83: {
    forest_join_70: {
    forest_join_68: {
    forest_join_55: {
    forest_join_53: {
    forest_join_40: {
    forest_join_38: {
    forest_join_25: {
    forest_join_23: {
    life8_3 = (net.minecraft.world.gen.structure.StructureStrongholdPieces.f ^ 21844910537623L);
    spill733_0 = moom.G4.b();
    life11_6 = null;
    life10_7 = spill733_0;
    spill733_1 = p0;
    spill733_2 = moom.HS.class;
    if (!((life10_7 != null))) {
        forestValue733_25_0 = spill733_1;
        forestValue733_25_1 = spill733_2;
        break forest_join_25;
    }
    if (!((spill733_1 == spill733_2))) {
        break forest_join_23;
    }
    life11_6 = moom.HS.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_25_0 = p0;
    forestValue733_25_1 = moom.HN.class;
    }
    if (!((life10_7 != null))) {
        forestValue733_40_0 = forestValue733_25_0;
        forestValue733_40_1 = forestValue733_25_1;
        break forest_join_40;
    }
    if (!((forestValue733_25_0 == forestValue733_25_1))) {
        break forest_join_38;
    }
    life11_6 = moom.HN.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_40_0 = p0;
    forestValue733_40_1 = moom.HJ.class;
    }
    if (!((life10_7 != null))) {
        forestValue733_55_0 = forestValue733_40_0;
        forestValue733_55_1 = forestValue733_40_1;
        break forest_join_55;
    }
    if (!((forestValue733_40_0 == forestValue733_40_1))) {
        break forest_join_53;
    }
    life11_6 = moom.HJ.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_55_0 = p0;
    forestValue733_55_1 = moom.HK.class;
    }
    if (!((life10_7 != null))) {
        forestValue733_70_0 = forestValue733_55_0;
        forestValue733_70_1 = forestValue733_55_1;
        break forest_join_70;
    }
    if (!((forestValue733_55_0 == forestValue733_55_1))) {
        break forest_join_68;
    }
    life11_6 = moom.HK.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_70_0 = p0;
    forestValue733_70_1 = moom.HO.class;
    }
    if (!((life10_7 != null))) {
        forestValue733_85_0 = forestValue733_70_0;
        forestValue733_85_1 = forestValue733_70_1;
        break forest_join_85;
    }
    if (!((forestValue733_70_0 == forestValue733_70_1))) {
        break forest_join_83;
    }
    life11_6 = moom.HO.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_85_0 = p0;
    forestValue733_85_1 = moom.HR.class;
    }
    if (!((life10_7 != null))) {
        forestValue733_100_0 = forestValue733_85_0;
        forestValue733_100_1 = forestValue733_85_1;
        break forest_join_100;
    }
    if (!((forestValue733_85_0 == forestValue733_85_1))) {
        break forest_join_98;
    }
    life11_6 = moom.HR.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_100_0 = p0;
    forestValue733_100_1 = moom.HP.class;
    }
    if (!((life10_7 != null))) {
        forestValue733_115_0 = forestValue733_100_0;
        forestValue733_115_1 = forestValue733_100_1;
        break forest_join_115;
    }
    if (!((forestValue733_100_0 == forestValue733_100_1))) {
        break forest_join_113;
    }
    life11_6 = moom.HP.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_115_0 = p0;
    forestValue733_115_1 = net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.class;
    }
    if (!((life10_7 != null))) {
        forestValue733_130_0 = forestValue733_115_0;
        forestValue733_130_1 = forestValue733_115_1;
        break forest_join_130;
    }
    if (!((forestValue733_115_0 == forestValue733_115_1))) {
        break forest_join_128;
    }
    life11_6 = net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_130_0 = p0;
    forestValue733_130_1 = moom.HG.class;
    }
    if (!((life10_7 != null))) {
        forestValue733_145_0 = forestValue733_130_0;
        forestValue733_145_1 = forestValue733_130_1;
        break forest_join_145;
    }
    if (!((forestValue733_130_0 == forestValue733_130_1))) {
        break forest_join_143;
    }
    life11_6 = moom.HG.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_145_0 = p0;
    forestValue733_145_1 = moom.HL.class;
    }
    if (!((life10_7 != null))) {
        forestValue733_160_0 = forestValue733_145_0;
        forestValue733_160_1 = forestValue733_145_1;
        break forest_join_160;
    }
    if (!((forestValue733_145_0 == forestValue733_145_1))) {
        break forest_join_158;
    }
    life11_6 = moom.HL.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    break forest_join_170;
    }
    forestValue733_160_0 = p0;
    forestValue733_160_1 = moom.HM.class;
    }
    if (!((forestValue733_160_0 == forestValue733_160_1))) {
        break forest_join_170;
    }
    life11_6 = moom.HM.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    }
    return life11_6;
}


private static moom.HF a__HF(moom.HQ p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
java.lang.Class forestValue734_15_0;
    moom.HF forestValue734_31_0;
    int forestValue734_35_0;
    int forestValue734_70_0;
    moom.IA forestValue734_72_0;
    moom.IA forestValue734_80_0;
    moom.HF forestValue734_119_0;
    java.util.List forestValue734_121_0;
    moom.G2 forestValue734_133_0;
    java.lang.Class spill734_0;
    moom.HF spill734_1;
    java.util.List spill734_2;
    int spill734_3;
    moom.IA spill734_4;
    moom.HQ spill734_5;
    moom.G2 spill734_6;
    long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    moom.HF life11_24;
    int life11_35;
    int life12_43;
    java.util.Iterator life13_48;
    moom.IA life14_55;
    moom.HF life15_97;
    moom.G2 life12_139;
    forest_join_144: {
    forest_join_133: {
    forest_join_121: {
    forest_join_120: {
    forest_join_119: {
    forest_join_118: {
    forest_join_111: {
    forest_join_100: {
    forest_join_32: {
    forest_join_31: {
    forest_join_15: {
    forest_join_10: {
    life8_3 = (net.minecraft.world.gen.structure.StructureStrongholdPieces.f ^ 113570268341464L);
    life10_5 = moom.G4.b();
    if (!((!net.minecraft.world.gen.structure.StructureStrongholdPieces.a__Boolean()))) {
        break forest_join_10;
    }
    return null;
    }
    spill734_0 = net.minecraft.world.gen.structure.StructureStrongholdPieces.c;
    if (!((life10_5 != null))) {
        forestValue734_15_0 = spill734_0;
        break forest_join_15;
    }
    if (!((spill734_0 != null))) {
        break forest_join_32;
    }
    forestValue734_15_0 = net.minecraft.world.gen.structure.StructureStrongholdPieces.c;
    }
    life11_24 = net.minecraft.world.gen.structure.StructureStrongholdPieces.a(((java.lang.Class)(forestValue734_15_0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    c = ((java.lang.Class)(null));
    spill734_1 = life11_24;
    if (!((life10_5 != null))) {
        forestValue734_31_0 = spill734_1;
        break forest_join_31;
    }
    if (!((spill734_1 != null))) {
        break forest_join_32;
    }
    forestValue734_31_0 = life11_24;
    }
    return forestValue734_31_0;
    }
    life11_35 = 0;
    forest_cycle_34: while (true) {
    forest_join_97: {
    forestValue734_35_0 = life11_35;
    forest_cycle_35: while (true) {
    if (!((forestValue734_35_0 < 5))) {
        break forest_join_120;
    }
    life11_35 += 1;
    life12_43 = ((java.util.Random)(p2)).nextInt(((int)(net.minecraft.world.gen.structure.StructureStrongholdPieces.d)));
    spill734_2 = net.minecraft.world.gen.structure.StructureStrongholdPieces.b;
    if (!((life10_5 != null))) {
        forestValue734_121_0 = spill734_2;
        break forest_join_121;
    }
    life13_48 = ((java.util.List)(spill734_2)).iterator();
    forest_cycle_47: while (true) {
    forest_join_95: {
    forest_join_80: {
    forest_join_79: {
    forest_join_72: {
    forest_join_70: {
    if (!(((java.util.Iterator)(life13_48)).hasNext())) {
        break forest_join_97;
    }
    life14_55 = ((moom.IA)(((java.util.Iterator)(life13_48)).next()));
    life12_43 = (life12_43 - ((moom.IA)(life14_55)).b);
    spill734_3 = life12_43;
    if (!((life10_5 != null))) {
        forestValue734_35_0 = spill734_3;
        continue forest_cycle_35;
    }
    if (!((life10_5 != null))) {
        forestValue734_70_0 = spill734_3;
        break forest_join_70;
    }
    if (!((spill734_3 < 0))) {
        break forest_join_95;
    }
    spill734_4 = life14_55;
    if (!((life10_5 != null))) {
        forestValue734_72_0 = spill734_4;
        break forest_join_72;
    }
    forestValue734_70_0 = ((((moom.IA)(spill734_4)).a(((int)(p7)))) ? 1 : 0);
    }
    if (!((forestValue734_70_0 != 0))) {
        break forest_join_97;
    }
    forestValue734_72_0 = life14_55;
    }
    if (!((life10_5 != null))) {
        forestValue734_80_0 = forestValue734_72_0;
        break forest_join_80;
    }
    if (!((forestValue734_72_0 == ((moom.HQ)(p0)).g))) {
        break forest_join_79;
    }
    if (!((life10_5 == null))) {
        break forest_join_97;
    }
    }
    forestValue734_80_0 = life14_55;
    }
    life15_97 = net.minecraft.world.gen.structure.StructureStrongholdPieces.a(((java.lang.Class)(((moom.IA)(forestValue734_80_0)).a)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
    if (!((life10_5 != null))) {
        break forest_join_111;
    }
    if (!((life15_97 != null))) {
        break forest_join_95;
    }
    break forest_join_100;
    }
    if (!((life10_5 == null))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    break forest_cycle_35;
    }
    }
    if (!((life10_5 == null))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    break forest_join_120;
    }
    moom.IA __stackOp734_20_0 = life14_55;
    ((moom.IA)(__stackOp734_20_0)).c = ((int)((((moom.IA)(__stackOp734_20_0)).c + 1)));
    spill734_5 = p0;
    if (!((life10_5 != null))) {
        forestValue734_119_0 = spill734_5;
        break forest_join_119;
    }
    ((moom.HQ)(spill734_5)).g = ((moom.IA)(life14_55));
    }
    if (!((!((moom.IA)(life14_55)).a()))) {
        break forest_join_118;
    }
    ((java.util.List)(net.minecraft.world.gen.structure.StructureStrongholdPieces.b)).remove(((java.lang.Object)(life14_55)));
    }
    forestValue734_119_0 = life15_97;
    }
    return forestValue734_119_0;
    }
    forestValue734_121_0 = p1;
    }
    life12_139 = moom.HH.a(((java.util.List)(forestValue734_121_0)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)));
    spill734_6 = life12_139;
    if (!((life10_5 != null))) {
        forestValue734_133_0 = spill734_6;
        break forest_join_133;
    }
    if (!((spill734_6 != null))) {
        break forest_join_144;
    }
    forestValue734_133_0 = life12_139;
    }
    if (!((((moom.G2)(forestValue734_133_0)).b > 1))) {
        break forest_join_144;
    }
    return new moom.HH(p7, p2, life12_139, p6);
    }
    return null;
}


private static moom.G4 a(moom.HQ p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
int forwardValue646_28_0;
    int forwardValue646_28_1;
    int forwardValue646_42_0;
    int forwardValue646_42_1;
    moom.HF forwardValue646_69_0;
    int spill646_0;
    int spill646_1;
    moom.HF spill646_2;
    long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    moom.HF life11_65;
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_42: {
    forward_join_28: {
    forward_join_17: {
    life8_3 = (net.minecraft.world.gen.structure.StructureStrongholdPieces.f ^ 100091171310803L);
    life10_5 = moom.G4.b();
    spill646_0 = p7;
    spill646_1 = __sourceIntrinsic_2460da0eaf8a_invokedynamic646_2(13213, (1464298622822817024L ^ life8_3));
    if (!((life10_5 != null))) {
        forwardValue646_28_0 = spill646_0;
        forwardValue646_28_1 = spill646_1;
        break forward_join_28;
    }
    if (!((spill646_0 > spill646_1))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue646_28_0 = java.lang.Math.abs(((int)((p3 - ((moom.G2)(((moom.HQ)(p0)).a__G2())).a))));
    forwardValue646_28_1 = __sourceIntrinsic_2460da0eaf8a_invokedynamic646_6(19405, (3123631315889218908L ^ life8_3));
    }
    if (!((life10_5 != null))) {
        forwardValue646_42_0 = forwardValue646_28_0;
        forwardValue646_42_1 = forwardValue646_28_1;
        break forward_join_42;
    }
    if (!((forwardValue646_28_0 <= forwardValue646_28_1))) {
        break forward_join_70;
    }
    forwardValue646_42_0 = java.lang.Math.abs(((int)((p5 - ((moom.G2)(((moom.HQ)(p0)).a__G2())).c))));
    forwardValue646_42_1 = __sourceIntrinsic_2460da0eaf8a_invokedynamic646_10(1571, (6245708264892016829L ^ life8_3));
    }
    if (!((forwardValue646_42_0 <= forwardValue646_42_1))) {
        break forward_join_70;
    }
    life11_65 = net.minecraft.world.gen.structure.StructureStrongholdPieces.a__HF(((moom.HQ)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)((p7 + 1))));
    spill646_2 = life11_65;
    if (!((life10_5 != null))) {
        forwardValue646_69_0 = spill646_2;
        break forward_join_69;
    }
    if (!((spill646_2 != null))) {
        break forward_join_68;
    }
    ((java.util.List)(p1)).add(((java.lang.Object)(life11_65)));
    ((java.util.List)(((moom.HQ)(p0)).i)).add(((java.lang.Object)(life11_65)));
    }
    forwardValue646_69_0 = life11_65;
    }
    return forwardValue646_69_0;
    }
    return null;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic584_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12734_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2460da0eaf8a_invokedynamic646_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2460da0eaf8a_invokedynamic646_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2460da0eaf8a_invokedynamic646_10(int a0, long a1) throws E;
}
