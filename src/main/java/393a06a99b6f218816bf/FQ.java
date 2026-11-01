package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FQ extends net.minecraft.world.gen.structure.MapGenStructure {

private java.util.List<net.minecraft.world.biome.BiomeGenBase> g;

private boolean h;

private moom.Ee[] i;

private double j;

private int k;

private static long m;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

public FQ() { super(); }


private static void __sourceConstructorBody_5506e32212b9f547(moom.FQ receiver) throws Throwable {

int forestValue389_54_0;

    net.minecraft.entity.Entity[] spill389_0;

    int spill389_1;

    long life1_3;

    net.minecraft.entity.Entity[] life3_11;

    net.minecraft.world.biome.BiomeGenBase[] life4_26;

    int life5_29;

    int life6_31;

    net.minecraft.world.biome.BiomeGenBase life7_38;

    forest_join_58: {

    life1_3 = (moom.FQ.m ^ 37402782008437L);

    moom.FQ.__sourceConstructorInit_5506e32212b9f547_0(((moom.FQ)(receiver)));

    spill389_0 = moom.G4.b();

    ((moom.FQ)(receiver)).i = ((moom.Ee[])(new moom.Ee[3]));

    life3_11 = spill389_0;

    ((moom.FQ)(receiver)).j = ((double)(0x1.0p5d));

    ((moom.FQ)(receiver)).k = ((int)(__sourceIntrinsic_5506e32212b9f547_invokedynamic389_5(8614, (4636874062233789518L ^ life1_3))));

    ((moom.FQ)(receiver)).g = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    life4_26 = net.minecraft.world.biome.BiomeGenBase.a__ArrayES();

    life5_29 = (life4_26).length;

    life6_31 = 0;

    forest_cycle_32: while (true) {

    forest_join_56: {

    forest_join_55: {

    forest_join_54: {

    if (!((life6_31 < life5_29))) {

        break forest_join_58;

    }

    life7_38 = (life4_26)[life6_31];

    if (!((life3_11 != null))) {

        break forest_join_56;

    }

    if (!((life7_38 != null))) {

        break forest_join_55;

    }

    spill389_1 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.world.biome.BiomeGenBase)(life7_38)).ap)), ((float)(0x0.0p0f)));

    if (!((life3_11 != null))) {

        forestValue389_54_0 = spill389_1;

        break forest_join_54;

    }

    if (!((spill389_1 > 0))) {

        break forest_join_55;

    }

    forestValue389_54_0 = ((((java.util.List)(((moom.FQ)(receiver)).g)).add(((java.lang.Object)(life7_38)))) ? 1 : 0);

    }

    recovery.source.CarrierOps.discard(forestValue389_54_0);

    }

    life6_31 += 1;

    }

    if (!((life3_11 == null))) {

        continue forest_cycle_32;

    }

    break forest_cycle_32;

    }

    }

    return;

}



public FQ(java.util.Map<java.lang.String, java.lang.String> p0) { this(); }


private static void __sourceConstructorBody_248305da91a7d26d(moom.FQ receiver, java.util.Map p0) throws Throwable {

boolean __initValue487_43_0;

    boolean __initValue487_64_0;

    long local2_life2;

    java.util.Iterator local5_life8;

    net.minecraft.entity.Entity[] local4_life9;

    java.util.Map.Entry local6_life13;

    init_join_76: {

    local2_life2 = (moom.FQ.m ^ 10183823502450L);

    net.minecraft.entity.Entity[] __sourceSpill487_4 = moom.G4.b();

    moom.FQ.__sourceConstructorInit_248305da91a7d26d_0(((moom.FQ)(receiver)));

    local5_life8 = ((java.util.Set)(((java.util.Map)(p0)).entrySet())).iterator();

    local4_life9 = __sourceSpill487_4;

    init_cycle_12: while (true) {

    init_join_74: {

    init_join_64: {

    init_join_59: {

    init_join_43: {

    init_join_38: {

    if (!(((java.util.Iterator)(local5_life8)).hasNext())) {

        break init_join_76;

    }

    local6_life13 = ((java.util.Map.Entry)(((java.util.Iterator)(local5_life8)).next()));

    boolean __sourceSpill487_17 = ((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getKey())))).equals(((java.lang.Object)("distance")));

    if (!((local4_life9 != null))) {

        __initValue487_43_0 = __sourceSpill487_17;

        break init_join_43;

    }

    if (!(__sourceSpill487_17)) {

        break init_join_38;

    }

    ((moom.FQ)(receiver)).j = ((double)(moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getValue())))), ((double)(((moom.FQ)(receiver)).j)), ((double)(0x1.0p0d)))));

    if (!((local4_life9 == null))) {

        break init_join_74;

    }

    }

    __initValue487_43_0 = ((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getKey())))).equals(((java.lang.Object)("count")));

    }

    boolean __sourceSpill487_26 = __initValue487_43_0;

    if (!((local4_life9 != null))) {

        __initValue487_64_0 = __sourceSpill487_26;

        break init_join_64;

    }

    if (!(__sourceSpill487_26)) {

        break init_join_59;

    }

    ((moom.FQ)(receiver)).i = ((moom.Ee[])(new moom.Ee[moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getValue())))), ((int)((((moom.FQ)(receiver)).i).length)), ((int)(1)))]));

    if (!((local4_life9 == null))) {

        break init_join_74;

    }

    }

    __initValue487_64_0 = ((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getKey())))).equals(((java.lang.Object)("spread")));

    }

    if (!(__initValue487_64_0)) {

        break init_join_74;

    }

    ((moom.FQ)(receiver)).k = ((int)(moom.Dr.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(local6_life13)).getValue())))), ((int)(((moom.FQ)(receiver)).k)), ((int)(1)))));

    }

    if (!((local4_life9 == null))) { continue init_cycle_12; }

    break init_cycle_12;

    }

    }

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(-2212146499970649922L)), ((long)(6621470999856742009L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(259983731986648L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FQ.m ^ 8238501148898L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill747_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill747_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill747_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill747_14 = new byte[8];
    (__sourceSpill747_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill747_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation747_16 = __sourceSpill747_14;
    ((javax.crypto.Cipher)(__sourceSpill747_11)).init(((int)(__sourceSpill747_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill747_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation747_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "hð0ÉÈòÉ'1$ó\032Ýo2I\017J"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill747_25 = local6_life21;
        int __sourceSpill747_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill747_25)).substring(((int)(__sourceSpill747_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill747_30 = local8_life19;
        int __sourceSpill747_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill747_33 = new byte[8];
        (__sourceSpill747_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill747_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill747_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill747_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill747_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill747_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill747_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill747_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill747_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill747_34)).doFinal(((byte[])(__sourceSpill747_33)));
        (__sourceSpill747_30)[__sourceSpill747_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "êÞêÖ\023s¹¸×ª²ýÉb"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill747_38 = local6_life21;
        int __sourceSpill747_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill747_38)).substring(((int)(__sourceSpill747_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill747_43 = local8_life19;
        int __sourceSpill747_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill747_46 = new byte[8];
        (__sourceSpill747_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill747_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill747_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill747_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill747_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill747_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill747_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill747_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill747_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill747_47)).doFinal(((byte[])(__sourceSpill747_46)));
        (__sourceSpill747_43)[__sourceSpill747_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5506e32212b9f547_0(moom.FQ a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_248305da91a7d26d_0(moom.FQ a0) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FQ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2B89;
        if (t[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = s[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])u.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    u.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/FQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FQ.t[n2] = n3;
        }
        return t[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4504_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected moom.Ir a(int p0, int p1) {
moom.Iu lexicalValue646_40_0;
    moom.Iu lexicalValue646_44_0;
    net.minecraft.entity.Entity[] spill646_0;
    moom.Iu spill646_1;
    long life3_3;
    moom.Iu life6_14;
    net.minecraft.entity.Entity[] life5_15;
    lexical_join_44: {
    lexical_join_43: {
    life3_3 = (moom.FQ.m ^ 113628903039785L);
    spill646_0 = moom.G4.b();
    life6_14 = new moom.Iu(this.c, this.b, p0, p1);
    life5_15 = spill646_0;
    lexical_cycle_16: while (true) {
    lexical_join_40: {
    lexical_join_31: {
    if (!((!((java.util.LinkedList)(((moom.Iu)(life6_14)).a__LinkedList())).isEmpty()))) {
        break lexical_join_31;
    }
    spill646_1 = life6_14;
    if (!((life5_15 != null))) {
        lexicalValue646_40_0 = spill646_1;
        break lexical_join_40;
    }
    if (!((life5_15 != null))) {
        lexicalValue646_44_0 = spill646_1;
        break lexical_join_44;
    }
    if (!((((moom.HQ)(((moom.HQ)(((java.util.LinkedList)(((moom.Iu)(spill646_1)).a__LinkedList())).get(((int)(0))))))).h == null))) {
        break lexical_join_43;
    }
    }
    lexicalValue646_40_0 = new moom.Iu(this.c, this.b, p0, p1);
    }
    life6_14 = lexicalValue646_40_0;
    if (!((life5_15 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue646_44_0 = life6_14;
    }
    return lexicalValue646_44_0;
}


public java.lang.String a() {
return "Stronghold";
}


protected boolean a__Boolean(int p0, int p1) {
moom.FQ lexicalValue647_162_0;
    int lexicalValue647_191_0;
    int lexicalValue647_196_0;
    moom.FQ spill647_0;
    int spill647_1;
    int spill647_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.util.Random life6_17;
    double life7_29;
    int life9_31;
    int life10_33;
    double life11_52;
    int life13_59;
    int life14_66;
    moom.DT life15_97;
    moom.Ee[] life6_175;
    int life7_178;
    int life8_180;
    moom.Ee life9_187;
    lexical_join_196: {
    lexical_join_195: {
    lexical_join_162: {
    lexical_join_161: {
    lexical_join_158: {
    life3_3 = (moom.FQ.m ^ 22457785168353L);
    life5_5 = moom.G4.b();
    spill647_0 = this;
    if (!((life5_5 != null))) {
        lexicalValue647_162_0 = spill647_0;
        break lexical_join_162;
    }
    if (!((!((moom.FQ)(spill647_0)).h))) {
        break lexical_join_161;
    }
    life6_17 = new java.util.Random();
    ((java.util.Random)(life6_17)).setSeed(((long)(((net.minecraft.world.World)(this.c)).a__Long())));
    life7_29 = ((((java.util.Random)(life6_17)).nextDouble() * 0x1.921fb54442d18p1d) * 0x1.0p1d);
    life9_31 = 1;
    life10_33 = 0;
    lexical_cycle_31: while (true) {
    lexical_join_156: {
    lexical_join_155: {
    lexical_join_131: {
    lexical_join_111: {
    if (!((life10_33 < (this.i).length))) {
        break lexical_join_158;
    }
    life11_52 = ((((0x1.4p0d * ((double) life9_31)) + ((java.util.Random)(life6_17)).nextDouble()) * this.j) * ((double) life9_31));
    life13_59 = ((int) java.lang.Math.round(((double)((java.lang.Math.cos(((double)(life7_29))) * life11_52)))));
    life14_66 = ((int) java.lang.Math.round(((double)((java.lang.Math.sin(((double)(life7_29))) * life11_52)))));
    life15_97 = ((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.world.World)(this.c)).a__Ff())).a(((int)(((life13_59 << 4) + __sourceIntrinsic_c86802429962_invokedynamic647_16(32558, (3370902771362303829L ^ life3_3))))), ((int)(((life14_66 << 4) + __sourceIntrinsic_c86802429962_invokedynamic647_17(5583, (2867006283380155831L ^ life3_3))))), ((int)(__sourceIntrinsic_c86802429962_invokedynamic647_18(21539, (1942205542802728025L ^ life3_3)))), ((java.util.List)(this.g)), ((java.util.Random)(life6_17)));
    if (!((life5_5 != null))) {
        break lexical_join_161;
    }
    if (!((life5_5 != null))) {
        break lexical_join_131;
    }
    if (!((life15_97 != null))) {
        break lexical_join_111;
    }
    life13_59 = (((moom.DT)(life15_97)).a() >> 4);
    life14_66 = (((moom.DT)(life15_97)).c() >> 4);
    }
    (this.i)[life10_33] = new moom.Ee(life13_59, life14_66);
    life7_29 = (life7_29 + ((0x1.921fb54442d18p2d * ((double) life9_31)) / ((double) this.k)));
    }
    if (!((life5_5 != null))) {
        break lexical_join_156;
    }
    if (!((life10_33 == this.k))) {
        break lexical_join_155;
    }
    life9_31 = (life9_31 + (2 + ((java.util.Random)(life6_17)).nextInt(((int)(5)))));
    moom.FQ __stackOp647_27_0 = this;
    ((moom.FQ)(__stackOp647_27_0)).k = ((int)((((moom.FQ)(__stackOp647_27_0)).k + (1 + ((java.util.Random)(life6_17)).nextInt(((int)(2)))))));
    }
    life10_33 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    this.h = ((boolean)(true));
    }
    lexicalValue647_162_0 = this;
    }
    life6_175 = ((moom.FQ)(lexicalValue647_162_0)).i;
    life7_178 = (life6_175).length;
    life8_180 = 0;
    lexical_cycle_169: while (true) {
    lexical_join_193: {
    lexical_join_192: {
    lexical_join_191: {
    if (!((life8_180 < life7_178))) {
        break lexical_join_195;
    }
    life9_187 = (life6_175)[life8_180];
    if (!((life5_5 != null))) {
        break lexical_join_193;
    }
    spill647_1 = p0;
    if (!((life5_5 != null))) {
        lexicalValue647_196_0 = spill647_1;
        break lexical_join_196;
    }
    if (!((spill647_1 == ((moom.Ee)(life9_187)).a))) {
        break lexical_join_192;
    }
    spill647_2 = p1;
    if (!((life5_5 != null))) {
        lexicalValue647_191_0 = spill647_2;
        break lexical_join_191;
    }
    if (!((spill647_2 == ((moom.Ee)(life9_187)).b))) {
        break lexical_join_192;
    }
    lexicalValue647_191_0 = 1;
    }
    return ((lexicalValue647_191_0) != 0);
    }
    life8_180 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_169; }
    break lexical_cycle_169;
    }
    }
    lexicalValue647_196_0 = 0;
    }
    return ((lexicalValue647_196_0) != 0);
}


protected java.util.List<moom.DT> a__List() {
net.minecraft.entity.Entity[] spill648_0;
    long life1_3;
    java.util.ArrayList life4_5;
    moom.Ee[] life5_8;
    int life6_12;
    int life7_14;
    net.minecraft.entity.Entity[] life3_15;
    moom.Ee life8_22;
    lexical_join_40: {
    life1_3 = (moom.FQ.m ^ 30199283304023L);
    life4_5 = com.google.common.collect.Lists.newArrayList();
    life5_8 = this.i;
    spill648_0 = moom.G4.b();
    life6_12 = (life5_8).length;
    life7_14 = 0;
    life3_15 = spill648_0;
    lexical_cycle_16: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life7_14 < life6_12))) {
        break lexical_join_40;
    }
    life8_22 = (life5_8)[life7_14];
    if (!((life3_15 != null))) {
        break lexical_join_38;
    }
    if (!((life8_22 != null))) {
        break lexical_join_37;
    }
    ((java.util.List)(life4_5)).add(((java.lang.Object)(((moom.Ee)(life8_22)).a(((int)(__sourceIntrinsic_4b3d0be45f41_invokedynamic648_4(25399, (7532870042400875768L ^ life1_3))))))));
    }
    life7_14 += 1;
    }
    if (!((life3_15 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return life4_5;
}


private static native <E extends Throwable> int __sourceIntrinsic_5506e32212b9f547_invokedynamic389_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic647_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic647_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c86802429962_invokedynamic647_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b3d0be45f41_invokedynamic648_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4504_0() throws E;
}
