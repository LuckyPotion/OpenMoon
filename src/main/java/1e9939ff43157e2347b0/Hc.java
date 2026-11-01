package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
abstract class Hc extends moom.G4 {

protected static final java.util.List<moom.D5> e;

private static final long k;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public Hc() {
super();
}


protected Hc(int p0) {
super(p0);
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-8384588452624185999L)), ((long)(6424520446928032829L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(153027116469988L)))));
    long local11_life6 = (moom.Hc.k ^ 68349381641349L);
    o = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill830_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill830_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill830_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill830_14 = new byte[8];
    (__sourceSpill830_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill830_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation830_16 = __sourceSpill830_14;
    ((javax.crypto.Cipher)(__sourceSpill830_11)).init(((int)(__sourceSpill830_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill830_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation830_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[14];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "fûöä\035e&\007¿f©4%&4\026^Ä*(ª ®4\034\036í\nÔ\fT;»ÃÝÝt\0320qJ¾î\0200Ä\004Z®a\n¬¾8\034î±KAwÄÈÃD@Cn\030ëÜ;Í&Â5çC4×\037"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill830_25 = local4_life21;
        int __sourceSpill830_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill830_25)).substring(((int)(__sourceSpill830_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill830_30 = local6_life19;
        int __sourceSpill830_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill830_33 = new byte[8];
        (__sourceSpill830_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill830_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill830_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill830_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill830_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill830_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill830_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill830_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill830_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill830_34)).doFinal(((byte[])(__sourceSpill830_33)));
        (__sourceSpill830_30)[__sourceSpill830_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "6\\þÇ\013úKã\002\tØ\020j \035"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill830_38 = local4_life21;
        int __sourceSpill830_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill830_38)).substring(((int)(__sourceSpill830_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill830_43 = local6_life19;
        int __sourceSpill830_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill830_46 = new byte[8];
        (__sourceSpill830_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill830_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill830_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill830_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill830_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill830_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill830_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill830_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill830_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill830_47)).doFinal(((byte[])(__sourceSpill830_46)));
        (__sourceSpill830_43)[__sourceSpill830_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    m = ((long[])(local6_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[14]));
    moom.D5[] __sourceSpill830_54 = new moom.D5[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_52(11676, (8480314417526175321L ^ local11_life6))];
    (__sourceSpill830_54)[0] = new moom.D5(net.minecraft.init.Items.i, 0, 1, 3, 5);
    (__sourceSpill830_54)[1] = new moom.D5(net.minecraft.init.Items.j, 0, 1, 5, 5);
    (__sourceSpill830_54)[2] = new moom.D5(net.minecraft.init.Items.k, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_57(20465, (3402174017383404593L ^ local11_life6)));
    (__sourceSpill830_54)[3] = new moom.D5(net.minecraft.init.Items.B, 0, 1, 1, 5);
    (__sourceSpill830_54)[4] = new moom.D5(net.minecraft.init.Items.ah, 0, 1, 1, 5);
    (__sourceSpill830_54)[5] = new moom.D5(net.minecraft.init.Items.d, 0, 1, 1, 5);
    (__sourceSpill830_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_61(32168, (6099552955632854635L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.bn, 0, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_63(1810, (350336099643546846L ^ local11_life6)), 5);
    (__sourceSpill830_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_64(3832, (7078689530373428542L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aA, 0, 1, 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_66(18614, (7484482805744636793L ^ local11_life6)));
    (__sourceSpill830_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_67(7413, (486741904936486705L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b0, 0, 1, 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_69(18285, (2982794585880272035L ^ local11_life6)));
    (__sourceSpill830_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_70(27178, (276421706139349485L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.bZ, 0, 1, 1, 5);
    (__sourceSpill830_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_72(18614, (7484482805744636793L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b1, 0, 1, 1, 3);
    (__sourceSpill830_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_74(25193, (5890480611354556840L ^ local11_life6))] = new moom.D5(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Z))), 0, 2, 4, 2);
    e = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill830_54)))));
}


protected moom.G4 b(moom.Hl p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, boolean p5) {
long life7_3;
    forward_join_63: {
    forward_join_38: {
    forward_join_13: {
    life7_3 = (moom.Hc.k ^ 26585302436861L);
    if (!((((moom.Hc)(this)).b != null))) {
        break forward_join_63;
    }
    switch ((moom.Ie.a)[((moom.bs)(((moom.Hc)(this)).b)).ordinal()]) {
case 1:
case 2:
{
        break forward_join_13;
    }
case 3:
case 4:
{
        break forward_join_38;
    }
default:
{
        break forward_join_63;
    }
}
    }
    return ((moom.Hc)(this)).a(((moom.Hl)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hc)(this)).a)).a - 1))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).b + p3))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).c + p4))), ((moom.bs)(moom.bs.WEST)), ((int)(((moom.Hc)(this)).a())), ((boolean)(p5)));
    }
    return ((moom.Hc)(this)).a(((moom.Hl)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hc)(this)).a)).a + p4))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).b + p3))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(((moom.Hc)(this)).a())), ((boolean)(p5)));
    }
    return null;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected moom.G4 c(moom.Hl p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, boolean p5) {
long life7_3;
    forward_join_63: {
    forward_join_38: {
    forward_join_13: {
    life7_3 = (moom.Hc.k ^ 101716901934940L);
    if (!((((moom.Hc)(this)).b != null))) {
        break forward_join_63;
    }
    switch ((moom.Ie.a)[((moom.bs)(((moom.Hc)(this)).b)).ordinal()]) {
case 1:
case 2:
{
        break forward_join_13;
    }
case 3:
case 4:
{
        break forward_join_38;
    }
default:
{
        break forward_join_63;
    }
}
    }
    return ((moom.Hc)(this)).a(((moom.Hl)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hc)(this)).a)).d + 1))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).b + p3))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).c + p4))), ((moom.bs)(moom.bs.EAST)), ((int)(((moom.Hc)(this)).a())), ((boolean)(p5)));
    }
    return ((moom.Hc)(this)).a(((moom.Hl)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hc)(this)).a)).a + p4))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).b + p3))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(((moom.Hc)(this)).a())), ((boolean)(p5)));
    }
    return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected static boolean a(moom.G2 p0) {
moom.G2 forwardValue2120_11_0;
    int forwardValue2120_21_0;
    int forwardValue2120_23_0;
    moom.G2 spill2120_0;
    int spill2120_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_11: {
    life1_3 = (moom.Hc.k ^ 87663702068540L);
    life3_5 = moom.G4.b();
    spill2120_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2120_11_0 = spill2120_0;
        break forward_join_11;
    }
    if (!((spill2120_0 != null))) {
        break forward_join_22;
    }
    forwardValue2120_11_0 = p0;
    }
    spill2120_1 = ((moom.G2)(forwardValue2120_11_0)).b;
    if (!((life3_5 != null))) {
        forwardValue2120_21_0 = spill2120_1;
        break forward_join_21;
    }
    if (!((spill2120_1 > __sourceIntrinsic_bf326bccd126_invokedynamic2120_3(32448, (597028656177835186L ^ life1_3))))) {
        break forward_join_22;
    }
    forwardValue2120_21_0 = 1;
    }
    forwardValue2120_23_0 = forwardValue2120_21_0;
    break forward_join_23;
    }
    forwardValue2120_23_0 = 0;
    }
    return ((forwardValue2120_23_0) != 0);
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1F31;
        if (Hc.n[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Hc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hc.n[n2] = n3;
        }
        return Hc.n[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_38e150d0614ea3(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4819_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private int a(java.util.List<moom.If> p0) {
int lexicalValue756_39_0;
    int lexicalValue756_39_1;
    int lexicalValue756_40_0;
    int lexicalValue756_44_0;
    int lexicalValue756_48_0;
    int lexicalValue756_50_0;
    net.minecraft.entity.Entity[] spill756_0;
    int spill756_1;
    int spill756_2;
    int spill756_3;
    long life2_3;
    int life5_6;
    net.minecraft.entity.Entity[] life4_7;
    int life6_9;
    java.util.Iterator life7_12;
    moom.If life8_19;
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_44: {
    lexical_join_43: {
    life2_3 = (moom.Hc.k ^ 32137677344565L);
    spill756_0 = moom.G4.b();
    life5_6 = 0;
    life4_7 = spill756_0;
    life6_9 = 0;
    life7_12 = ((java.util.List)(p0)).iterator();
    lexical_cycle_13: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_36: {
    if (!(((java.util.Iterator)(life7_12)).hasNext())) {
        break lexical_join_43;
    }
    life8_19 = ((moom.If)(((java.util.Iterator)(life7_12)).next()));
    spill756_1 = ((moom.If)(life8_19)).d;
    if (!((life4_7 != null))) {
        lexicalValue756_44_0 = spill756_1;
        break lexical_join_44;
    }
    if (!((life4_7 != null))) {
        lexicalValue756_40_0 = spill756_1;
        break lexical_join_40;
    }
    if (!((spill756_1 > 0))) {
        break lexical_join_36;
    }
    spill756_2 = ((moom.If)(life8_19)).c;
    spill756_3 = ((moom.If)(life8_19)).d;
    if (!((life4_7 != null))) {
        lexicalValue756_39_0 = spill756_2;
        lexicalValue756_39_1 = spill756_3;
        break lexical_join_39;
    }
    if (!((spill756_2 < spill756_3))) {
        break lexical_join_36;
    }
    life5_6 = 1;
    }
    lexicalValue756_39_0 = life6_9;
    lexicalValue756_39_1 = ((moom.If)(life8_19)).b;
    }
    lexicalValue756_40_0 = (lexicalValue756_39_0 + lexicalValue756_39_1);
    }
    life6_9 = lexicalValue756_40_0;
    if (!((life4_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue756_44_0 = life5_6;
    }
    if (!((life4_7 != null))) {
        lexicalValue756_48_0 = lexicalValue756_44_0;
        break lexical_join_48;
    }
    if (!((lexicalValue756_44_0 != 0))) {
        break lexical_join_49;
    }
    lexicalValue756_48_0 = life6_9;
    }
    lexicalValue756_50_0 = lexicalValue756_48_0;
    break lexical_join_50;
    }
    lexicalValue756_50_0 = -1;
    }
    return lexicalValue756_50_0;
}


private moom.Hc a(moom.Hl p0, java.util.List<moom.If> p1, java.util.List<moom.G4> p2, java.util.Random p3, int p4, int p5, int p6, moom.bs p7, int p8) {
int forestValue282_15_0;
    int forestValue282_24_0;
    int forestValue282_26_0;
    int forestValue282_30_0;
    int forestValue282_40_0;
    int forestValue282_67_0;
    moom.If forestValue282_69_0;
    moom.If forestValue282_82_0;
    moom.Hc forestValue282_120_0;
    net.minecraft.entity.Entity[] spill282_0;
    int spill282_1;
    int spill282_2;
    int spill282_3;
    moom.If spill282_4;
    moom.If spill282_5;
    moom.Hl spill282_6;
    long life10_3;
    int life13_8;
    net.minecraft.entity.Entity[] life12_9;
    int life14_29;
    int life15_31;
    int life16_45;
    java.util.Iterator life17_48;
    moom.If life18_55;
    moom.Hc life19_103;
    forest_join_121: {
    forest_join_120: {
    forest_join_119: {
    forest_join_112: {
    forest_join_101: {
    forest_join_26: {
    forest_join_25: {
    forest_join_24: {
    forest_join_15: {
    life10_3 = (moom.Hc.k ^ 126527811356472L);
    spill282_0 = moom.G4.b();
    life13_8 = __sourceExactCall_28713f8cdf8812(((moom.Hc)(this)), ((java.util.List)(p1)));
    life12_9 = spill282_0;
    spill282_1 = life13_8;
    if (!((life12_9 != null))) {
        forestValue282_15_0 = spill282_1;
        break forest_join_15;
    }
    if (!((spill282_1 > 0))) {
        break forest_join_25;
    }
    forestValue282_15_0 = p8;
    }
    if (!((life12_9 != null))) {
        forestValue282_24_0 = forestValue282_15_0;
        break forest_join_24;
    }
    if (!((forestValue282_15_0 <= __sourceIntrinsic_bb0326b3c5a4_invokedynamic282_3(4905, (2905397282073037662L ^ life10_3))))) {
        break forest_join_25;
    }
    forestValue282_24_0 = 1;
    }
    forestValue282_26_0 = forestValue282_24_0;
    break forest_join_26;
    }
    forestValue282_26_0 = 0;
    }
    life14_29 = forestValue282_26_0;
    life15_31 = 0;
    forest_cycle_29: while (true) {
    forest_join_98: {
    forestValue282_30_0 = life15_31;
    forest_cycle_30: while (true) {
    forest_join_40: {
    if (!((forestValue282_30_0 < 5))) {
        break forest_join_121;
    }
    spill282_2 = life14_29;
    if (!((life12_9 != null))) {
        forestValue282_40_0 = spill282_2;
        break forest_join_40;
    }
    if (!((spill282_2 != 0))) {
        break forest_join_121;
    }
    life15_31 += 1;
    forestValue282_40_0 = ((java.util.Random)(p3)).nextInt(((int)(life13_8)));
    }
    life16_45 = forestValue282_40_0;
    life17_48 = ((java.util.List)(p1)).iterator();
    forest_cycle_44: while (true) {
    forest_join_96: {
    forest_join_82: {
    forest_join_81: {
    forest_join_69: {
    forest_join_67: {
    if (!(((java.util.Iterator)(life17_48)).hasNext())) {
        break forest_join_98;
    }
    life18_55 = ((moom.If)(((java.util.Iterator)(life17_48)).next()));
    life16_45 = (life16_45 - ((moom.If)(life18_55)).b);
    spill282_3 = life16_45;
    if (!((life12_9 != null))) {
        forestValue282_30_0 = spill282_3;
        continue forest_cycle_30;
    }
    if (!((life12_9 != null))) {
        forestValue282_67_0 = spill282_3;
        break forest_join_67;
    }
    if (!((spill282_3 < 0))) {
        break forest_join_96;
    }
    spill282_4 = life18_55;
    if (!((life12_9 != null))) {
        forestValue282_69_0 = spill282_4;
        break forest_join_69;
    }
    forestValue282_67_0 = ((__sourceExactCall_db70b5c4973d39(((moom.If)(spill282_4)), ((int)(p8)))) ? 1 : 0);
    }
    if (!((forestValue282_67_0 != 0))) {
        break forest_join_98;
    }
    forestValue282_69_0 = life18_55;
    }
    if (!((life12_9 != null))) {
        forestValue282_82_0 = forestValue282_69_0;
        break forest_join_82;
    }
    if (!((forestValue282_69_0 == ((moom.Hl)(p0)).f))) {
        break forest_join_81;
    }
    spill282_5 = life18_55;
    if (!((life12_9 != null))) {
        forestValue282_82_0 = spill282_5;
        break forest_join_82;
    }
    if (!((!((moom.If)(spill282_5)).e))) {
        break forest_join_81;
    }
    if (!((life12_9 == null))) {
        break forest_join_98;
    }
    }
    forestValue282_82_0 = life18_55;
    }
    life19_103 = __sourceExactCall_f400a448f46809(((moom.If)(forestValue282_82_0)), ((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
    if (!((life12_9 != null))) {
        break forest_join_112;
    }
    if (!((life19_103 != null))) {
        break forest_join_96;
    }
    break forest_join_101;
    }
    if (!((life12_9 == null))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    break forest_cycle_30;
    }
    }
    if (!((life12_9 == null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    break forest_join_121;
    }
    moom.If __stackOp282_15_0 = life18_55;
    ((moom.If)(__stackOp282_15_0)).c = ((int)((((moom.If)(__stackOp282_15_0)).c + 1)));
    spill282_6 = p0;
    if (!((life12_9 != null))) {
        forestValue282_120_0 = spill282_6;
        break forest_join_120;
    }
    ((moom.Hl)(spill282_6)).f = ((moom.If)(life18_55));
    }
    if (!((!__sourceExactCall_c55b541f0f0292(((moom.If)(life18_55)))))) {
        break forest_join_119;
    }
    ((java.util.List)(p1)).remove(((java.lang.Object)(life18_55)));
    }
    forestValue282_120_0 = life19_103;
    }
    return forestValue282_120_0;
    }
    return __sourceExactCall_924cd4d95c2fee(((java.util.List)(p2)), ((java.util.Random)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((moom.bs)(p7)), ((int)(p8)));
}


private moom.G4 a(moom.Hl p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7, boolean p8) {
int forwardValue2122_31_0;
    int forwardValue2122_31_1;
    moom.Hc forwardValue2122_68_0;
    int spill2122_0;
    int spill2122_1;
    moom.Hc spill2122_2;
    long life10_3;
    net.minecraft.entity.Entity[] life12_5;
    java.util.List life13_40;
    moom.Hc life14_59;
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_40: {
    forward_join_31: {
    life10_3 = (moom.Hc.k ^ 94791122581485L);
    life12_5 = moom.G4.b();
    spill2122_0 = java.lang.Math.abs(((int)((p3 - ((moom.G2)(((moom.Hl)(p0)).a__G2())).a))));
    spill2122_1 = __sourceIntrinsic_4dd0797eb2db_invokedynamic2122_5(29342, (4462556437681396276L ^ life10_3));
    if (!((life12_5 != null))) {
        forwardValue2122_31_0 = spill2122_0;
        forwardValue2122_31_1 = spill2122_1;
        break forward_join_31;
    }
    if (!((spill2122_0 <= spill2122_1))) {
        break forward_join_69;
    }
    forwardValue2122_31_0 = java.lang.Math.abs(((int)((p5 - ((moom.G2)(((moom.Hl)(p0)).a__G2())).c))));
    forwardValue2122_31_1 = __sourceIntrinsic_4dd0797eb2db_invokedynamic2122_9(1941, (5874349665301049136L ^ life10_3));
    }
    if (!((forwardValue2122_31_0 <= forwardValue2122_31_1))) {
        break forward_join_69;
    }
    life13_40 = ((moom.Hl)(p0)).g;
    if (!(p8)) {
        break forward_join_40;
    }
    life13_40 = ((moom.Hl)(p0)).h;
    }
    life14_59 = ((moom.Hc)(this)).a(((moom.Hl)(p0)), ((java.util.List)(life13_40)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)((p7 + 1))));
    spill2122_2 = life14_59;
    if (!((life12_5 != null))) {
        forwardValue2122_68_0 = spill2122_2;
        break forward_join_68;
    }
    if (!((spill2122_2 != null))) {
        break forward_join_67;
    }
    ((java.util.List)(p1)).add(((java.lang.Object)(life14_59)));
    ((java.util.List)(((moom.Hl)(p0)).i)).add(((java.lang.Object)(life14_59)));
    }
    forwardValue2122_68_0 = life14_59;
    }
    return forwardValue2122_68_0;
    }
    return __sourceExactCall_924cd4d95c2fee(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)(p7)));
}


protected moom.G4 a(moom.Hl p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, boolean p5) {
long life7_3;
    forward_join_117: {
    forward_join_91: {
    forward_join_65: {
    forward_join_39: {
    forward_join_13: {
    life7_3 = (moom.Hc.k ^ 94946569619684L);
    if (!((((moom.Hc)(this)).b != null))) {
        break forward_join_117;
    }
    switch ((moom.Ie.a)[((moom.bs)(((moom.Hc)(this)).b)).ordinal()]) {
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_39;
    }
case 3:
{
        break forward_join_65;
    }
case 4:
{
        break forward_join_91;
    }
default:
{
        break forward_join_117;
    }
}
    }
    return ((moom.Hc)(this)).a(((moom.Hl)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hc)(this)).a)).a + p3))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).b + p4))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).c - 1))), ((moom.bs)(((moom.Hc)(this)).b)), ((int)(((moom.Hc)(this)).a())), ((boolean)(p5)));
    }
    return ((moom.Hc)(this)).a(((moom.Hl)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hc)(this)).a)).a + p3))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).b + p4))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).f + 1))), ((moom.bs)(((moom.Hc)(this)).b)), ((int)(((moom.Hc)(this)).a())), ((boolean)(p5)));
    }
    return ((moom.Hc)(this)).a(((moom.Hl)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hc)(this)).a)).a - 1))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).b + p4))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).c + p3))), ((moom.bs)(((moom.Hc)(this)).b)), ((int)(((moom.Hc)(this)).a())), ((boolean)(p5)));
    }
    return ((moom.Hc)(this)).a(((moom.Hl)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hc)(this)).a)).d + 1))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).b + p4))), ((int)((((moom.G2)(((moom.Hc)(this)).a)).c + p3))), ((moom.bs)(((moom.Hc)(this)).b)), ((int)(((moom.Hc)(this)).a())), ((boolean)(p5)));
    }
    return null;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite830_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4819_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf326bccd126_invokedynamic2120_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb0326b3c5a4_invokedynamic282_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4dd0797eb2db_invokedynamic2122_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4dd0797eb2db_invokedynamic2122_9(int a0, long a1) throws E;

private static native int __sourceExactCall_38e150d0614ea3(int p0, long p1);
private static native moom.Hm __sourceExactCall_924cd4d95c2fee(java.util.List p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6);

private static native int __sourceExactCall_28713f8cdf8812(moom.Hc p0, java.util.List p1);
private static native boolean __sourceExactCall_db70b5c4973d39(moom.If p0, int p1);
private static native moom.Hc __sourceExactCall_f400a448f46809(moom.If p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7);
private static native boolean __sourceExactCall_c55b541f0f0292(moom.If p0);
}
