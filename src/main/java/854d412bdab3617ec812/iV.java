package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iV extends moom.iU {

public moom.jD t;

public moom.jD u;

public moom.jD v;

public moom.jD w;

private static long x;

private static long[] G;

private static java.lang.Integer[] H;

private static java.util.Map I;

public iV() {
this(((float)(0x0.0p0f)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_a6492a75a3430713_0(moom.iV a0, float a1, int a2, int a3) throws E;

public iV(float p0) { super(0.0F, 0, 0); }


private static void __sourceConstructorBody_a6492a75a3430713(moom.iV receiver, float p0) throws Throwable {

long local2 = (moom.iV.x ^ 32281049976210L);

    moom.iV.__sourceConstructorInit_a6492a75a3430713_0(((moom.iV)(receiver)), ((float)(p0)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_1(13429, (5589679762947755694L ^ local2)))), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_2(13406, (2588736624331738753L ^ local2)))));

    ((moom.iV)(receiver)).i = ((moom.jD)(new moom.jD(receiver, 0, 0)));

    ((moom.jD)(((moom.iV)(receiver)).i)).a(((float)(-0x1.0p0f)), ((float)(-0x1.cp2f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_6(12656, (4829645896756546494L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).i)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    ((moom.iV)(receiver)).k = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_10(2668, (514231640282394784L ^ local2)))));

    ((moom.jD)(((moom.iV)(receiver)).k)).a(((float)(-0x1.8p2f)), ((float)(0x0.0p0f)), ((float)(-0x1.8p0f)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_13(7790, (1394575479288456378L ^ local2)))), ((int)(3)), ((int)(3)), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).k)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    ((moom.iV)(receiver)).l = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_17(27014, (5021351550322250576L ^ local2)), 0)));

    ((moom.jD)(((moom.iV)(receiver)).l)).a(((float)(-0x1.0p1f)), ((float)(-0x1.0p1f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_20(2138, (5648512355454218880L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).l)).a(((float)(-0x1.4p2f)), ((float)(0x1.0p1f)), ((float)(0x0.0p0f)));

    ((moom.iV)(receiver)).m = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_24(4347, (3220134426990078505L ^ local2)), __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_25(24819, (6057619786753317423L ^ local2)))));

    ((moom.jD)(((moom.iV)(receiver)).m)).m = ((boolean)(true));

    ((moom.jD)(((moom.iV)(receiver)).m)).a(((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_30(2138, (5648512355454218880L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).m)).a(((float)(0x1.4p2f)), ((float)(0x1.0p1f)), ((float)(0x0.0p0f)));

    ((moom.iV)(receiver)).n = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_34(1778, (2486244688115825711L ^ local2)), 0)));

    ((moom.jD)(((moom.iV)(receiver)).n)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_37(13817, (965655225067228967L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).n)).a(((float)(-0x1.e66666p0f)), ((float)(0x1.8p3f)), ((float)(0x0.0p0f)));

    ((moom.iV)(receiver)).o = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_41(20508, (1553540000238480068L ^ local2)), __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_42(17876, (503535214380039941L ^ local2)))));

    ((moom.jD)(((moom.iV)(receiver)).o)).m = ((boolean)(true));

    ((moom.jD)(((moom.iV)(receiver)).o)).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_47(18434, (695807748597428945L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).o)).a(((float)(0x1.e66666p0f)), ((float)(0x1.8p3f)), ((float)(0x0.0p0f)));

    ((moom.iV)(receiver)).t = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_51(17876, (503535214380039941L ^ local2)), 0)));

    ((moom.jD)(((moom.iV)(receiver)).t)).a(((float)(-0x1.8p1f)), ((float)(0x1.8p1f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_54(20290, (1769310830080931215L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).t)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    ((moom.jD)(((moom.iV)(receiver)).t)).n = ((boolean)(true));

    ((moom.iV)(receiver)).u = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_60(31211, (8545028947052823356L ^ local2)), __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_61(17876, (503535214380039941L ^ local2)))));

    ((moom.jD)(((moom.iV)(receiver)).u)).a(((float)(0x1.0p0f)), ((float)(0x1.8p1f)), ((float)(-0x1.0p0f)), ((int)(2)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_64(20290, (1769310830080931215L ^ local2)))), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).u)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    ((moom.iV)(receiver)).v = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_68(16456, (464165864837233304L ^ local2)))));

    ((moom.jD)(((moom.iV)(receiver)).v)).a(((float)(-0x1.0p2f)), ((float)(0x1.4p3f)), ((float)(-0x1.0p0f)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_71(16117, (6026009173564671008L ^ local2)))), ((int)(2)), ((int)(2)), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).v)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    ((moom.iV)(receiver)).w = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_75(7555, (8756886013191546714L ^ local2)))));

    ((moom.jD)(((moom.iV)(receiver)).w)).a(((float)(-0x1.8p2f)), ((float)(0x1.6p3f)), ((float)(-0x1.8p2f)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_78(2138, (5648512355454218880L ^ local2)))), ((int)(1)), ((int)(__sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_79(2138, (5648512355454218880L ^ local2)))), ((float)(p0)));

    ((moom.jD)(((moom.iV)(receiver)).w)).a(((float)(0x0.0p0f)), ((float)(0x1.8p3f)), ((float)(0x0.0p0f)));

    return;

}



static {
x = ((long)(((moom._a)(moom._c.a(((long)(-6857912482339070868L)), ((long)(-963847122212681320L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(178609325185540L)))));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.iV.x ^ 125314943705103L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1297_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1297_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1297_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1297_14 = new byte[8];
    (__sourceSpill1297_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1297_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1297_16 = __sourceSpill1297_14;
    ((javax.crypto.Cipher)(__sourceSpill1297_11)).init(((int)(__sourceSpill1297_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1297_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1297_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¡U;\005T\r\\åçÛ\003Õ\\:Æ:.³EôË§èA}jîÖ[\005\027\017±ùié¦é­&E$\024Ò`\001°Kí·/\\¢N\t:çR$.GA)+øÿ[}÷Ã åIE[Ø^Ø[ÀÄ°\r` \n\022³èìá\0316÷ÆÉy$9\013\025¯þÚ\f\006H\021Ô¬dÞâ\003Än¶"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1297_25 = local6_life21;
        int __sourceSpill1297_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1297_25)).substring(((int)(__sourceSpill1297_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1297_30 = local8_life19;
        int __sourceSpill1297_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1297_33 = new byte[8];
        (__sourceSpill1297_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1297_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1297_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1297_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1297_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1297_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1297_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1297_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1297_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1297_34)).doFinal(((byte[])(__sourceSpill1297_33)));
        (__sourceSpill1297_30)[__sourceSpill1297_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¿ømÆ5QG¡æRé&Ã\024\f"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1297_38 = local6_life21;
        int __sourceSpill1297_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1297_38)).substring(((int)(__sourceSpill1297_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1297_43 = local8_life19;
        int __sourceSpill1297_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1297_46 = new byte[8];
        (__sourceSpill1297_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1297_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1297_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1297_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1297_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1297_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1297_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1297_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1297_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1297_47)).doFinal(((byte[])(__sourceSpill1297_46)));
        (__sourceSpill1297_43)[__sourceSpill1297_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    G = ((long[])(local8_life19));
    H = ((java.lang.Integer[])(new java.lang.Integer[19]));
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral8025_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x21D4;
        if (H[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = G[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])I.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    I.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iV", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iV.H[n2] = n4;
        }
        return H[n2];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iV.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
net.minecraft.entity.Entity forwardValue3629_21_0;
    moom.jD forwardValue3629_41_0;
    int forwardValue3629_41_1;
    moom.jD forwardValue3629_42_0;
    moom.jD forwardValue3629_43_0;
    int forwardValue3629_43_1;
    net.minecraft.entity.Entity[] spill3629_0;
    net.minecraft.entity.Entity spill3629_1;
    moom.jD spill3629_2;
    boolean spill3629_3;
    long life8_3;
    net.minecraft.entity.Entity[] life10_14;
    net.minecraft.entity.item.EntityArmorStand life11_28;
    float life12_146;
    float life13_156;
    float life14_166;
    forward_join_174: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_21: {
    life8_3 = (moom.iV.x ^ 63773097501448L);
    spill3629_0 = moom.iQ.b();
    super.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((net.minecraft.entity.Entity)(p6)));
    life10_14 = spill3629_0;
    spill3629_1 = p6;
    if (!((life10_14 != null))) {
        forwardValue3629_21_0 = spill3629_1;
        break forward_join_21;
    }
    if (!((((spill3629_1 instanceof net.minecraft.entity.item.EntityArmorStand) ? 1 : 0) != 0))) {
        break forward_join_174;
    }
    forwardValue3629_21_0 = p6;
    }
    life11_28 = ((net.minecraft.entity.item.EntityArmorStand)(forwardValue3629_21_0));
    ((moom.jD)(this.m)).n = ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).O__Boolean()));
    ((moom.jD)(this.l)).n = ((boolean)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).O__Boolean()));
    spill3629_2 = this.w;
    spill3629_3 = ((net.minecraft.entity.item.EntityArmorStand)(life11_28)).P__Boolean();
    if (!((life10_14 != null))) {
        forwardValue3629_41_0 = spill3629_2;
        forwardValue3629_41_1 = ((spill3629_3) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill3629_3))) {
        forwardValue3629_42_0 = spill3629_2;
        break forward_join_42;
    }
    forwardValue3629_41_0 = spill3629_2;
    forwardValue3629_41_1 = 1;
    }
    forwardValue3629_43_0 = forwardValue3629_41_0;
    forwardValue3629_43_1 = forwardValue3629_41_1;
    break forward_join_43;
    }
    forwardValue3629_43_0 = forwardValue3629_42_0;
    forwardValue3629_43_1 = 0;
    }
    ((moom.jD)(forwardValue3629_43_0)).n = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3629_43_1)));
    ((moom.jD)(this.o)).a(((float)(0x1.e66666p0f)), ((float)(0x1.8p3f)), ((float)(0x0.0p0f)));
    ((moom.jD)(this.n)).a(((float)(-0x1.e66666p0f)), ((float)(0x1.8p3f)), ((float)(0x0.0p0f)));
    ((moom.jD)(this.t)).h = ((float)((0x1.1df46ap-6f * ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).b__sourceReturn_6a331ccf0b())).a())));
    ((moom.jD)(this.t)).i = ((float)((0x1.1df46ap-6f * ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).b__sourceReturn_6a331ccf0b())).b())));
    ((moom.jD)(this.t)).j = ((float)((0x1.1df46ap-6f * ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).b__sourceReturn_6a331ccf0b())).c())));
    ((moom.jD)(this.u)).h = ((float)((0x1.1df46ap-6f * ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).b__sourceReturn_6a331ccf0b())).a())));
    ((moom.jD)(this.u)).i = ((float)((0x1.1df46ap-6f * ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).b__sourceReturn_6a331ccf0b())).b())));
    ((moom.jD)(this.u)).j = ((float)((0x1.1df46ap-6f * ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).b__sourceReturn_6a331ccf0b())).c())));
    ((moom.jD)(this.v)).h = ((float)((0x1.1df46ap-6f * ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).b__sourceReturn_6a331ccf0b())).a())));
    ((moom.jD)(this.v)).i = ((float)((0x1.1df46ap-6f * ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).b__sourceReturn_6a331ccf0b())).b())));
    ((moom.jD)(this.v)).j = ((float)((0x1.1df46ap-6f * ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).b__sourceReturn_6a331ccf0b())).c())));
    life12_146 = ((((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).e__DF())).a() + ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).f__sourceReturn_6a331ccf0b())).a()) / 0x1.0p1f);
    life13_156 = ((((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).e__DF())).b() + ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).f__sourceReturn_6a331ccf0b())).b()) / 0x1.0p1f);
    life14_166 = ((((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).e__DF())).c() + ((net.minecraft.util.Rotations)(((net.minecraft.entity.item.EntityArmorStand)(life11_28)).f__sourceReturn_6a331ccf0b())).c()) / 0x1.0p1f);
    ((moom.jD)(this.w)).h = ((float)(0x0.0p0f));
    ((moom.jD)(this.w)).i = ((float)((0x1.1df46ap-6f * (-((net.minecraft.entity.Entity)(p6)).w))));
    ((moom.jD)(this.w)).j = ((float)(0x0.0p0f));
    }
    return;
}


public void a(float p0) {
int local2 = ((((moom.jD)(this.l)).n) ? 1 : 0);
    ((moom.jD)(this.l)).n = ((boolean)(true));
    super.a(((float)(p0)));
    ((moom.jD)(this.l)).n = ((boolean)__sourceIntrinsic_integerToBoolean((local2)));
    return;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
int forwardValue3630_43_0;
    net.minecraft.entity.Entity[] spill3630_0;
    boolean spill3630_1;
    long life8_3;
    net.minecraft.entity.Entity[] life10_14;
    float life11_25;
    forward_join_48: {
    forward_join_43: {
    forward_join_41: {
    life8_3 = (moom.iV.x ^ 76524420067104L);
    spill3630_0 = moom.iQ.b();
    super.a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)));
    life10_14 = spill3630_0;
    moom.kZ.B();
    spill3630_1 = this.c;
    if (!((life10_14 != null))) {
        forwardValue3630_43_0 = ((spill3630_1) ? 1 : 0);
        break forward_join_43;
    }
    if (!(spill3630_1)) {
        break forward_join_41;
    }
    life11_25 = 0x1.0p1f;
    moom.kZ.a(((float)((0x1.0p0f / life11_25))), ((float)((0x1.0p0f / life11_25))), ((float)((0x1.0p0f / life11_25))));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.8p4f * p6))), ((float)(0x0.0p0f)));
    if (!((life10_14 == null))) {
        break forward_join_48;
    }
    }
    forwardValue3630_43_0 = ((((net.minecraft.entity.Entity)(p0)).t__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue3630_43_0 != 0))) {
        break forward_join_48;
    }
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.99999ap-3f)), ((float)(0x0.0p0f)));
    }
    ((moom.jD)(this.t)).a(((float)(p6)));
    ((moom.jD)(this.u)).a(((float)(p6)));
    ((moom.jD)(this.v)).a(((float)(p6)));
    ((moom.jD)(this.w)).a(((float)(p6)));
    moom.kZ.C();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6492a75a3430713_originalDynamicSite2901_79(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral8025_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
