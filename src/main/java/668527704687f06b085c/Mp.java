package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Mp implements moom.Mu {

private moom.b3 a;

private int b;

private int c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

public Mp(moom.b3 p0, moom.b0 p1, int p2, int p3, int p4, moom.b1 p5, moom.b2 p6, java.nio.ByteBuffer p7, int p8, boolean p9, boolean p10) { super(); }


private static void __sourceConstructorBody_5e3d3c534b8e2db2(moom.Mp receiver, moom.b3 p0, moom.b0 p1, int p2, int p3, int p4, moom.b1 p5, moom.b2 p6, java.nio.ByteBuffer p7, int p8, boolean p9, boolean p10) throws Throwable {

int forwardValue210016_31_0;

    int forwardValue210016_37_0;

    int forwardValue210016_47_0;

    int forwardValue210016_53_0;

    int forwardValue210016_329_0;

    int spill210016_0;

    boolean spill210016_1;

    boolean spill210016_2;

    int spill210016_3;

    long life12_3;

    int life14_21;

    int life15_40;

    int life16_59;

    forward_join_329: {

    forward_join_327: {

    forward_join_262: {

    forward_join_182: {

    forward_join_115: {

    forward_join_61: {

    forward_join_53: {

    forward_join_48: {

    forward_join_47: {

    forward_join_37: {

    forward_join_32: {

    forward_join_31: {

    life12_3 = (moom.Mp.d ^ 45718442724306L);

    spill210016_0 = moom.MS.b();

    moom.Mp.__sourceConstructorInit_5e3d3c534b8e2db2_0(((moom.Mp)(receiver)));

    ((moom.Mp)(receiver)).a = ((moom.b3)(p0));

    ((moom.Mp)(receiver)).b = ((int)(p8));

    ((moom.Mp)(receiver)).c = ((int)(org.lwjgl.opengl.GL11.glGenTextures()));

    org.lwjgl.opengl.GL11.glBindTexture(((int)(((moom.Mp)(receiver)).c())), ((int)(((moom.Mp)(receiver)).c)));

    life14_21 = spill210016_0;

    spill210016_1 = p10;

    if (!((life14_21 == 0))) {

        forwardValue210016_31_0 = ((spill210016_1) ? 1 : 0);

        break forward_join_31;

    }

    if (!(spill210016_1)) {

        break forward_join_32;

    }

    forwardValue210016_31_0 = __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_11(30057, (2747201097170590985L ^ life12_3));

    }

    forwardValue210016_37_0 = forwardValue210016_31_0;

    break forward_join_37;

    }

    forwardValue210016_37_0 = __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_12(8473, (6316546345729608043L ^ life12_3));

    }

    life15_40 = forwardValue210016_37_0;

    spill210016_2 = p9;

    if (!((life14_21 == 0))) {

        forwardValue210016_47_0 = ((spill210016_2) ? 1 : 0);

        break forward_join_47;

    }

    if (!(spill210016_2)) {

        break forward_join_48;

    }

    forwardValue210016_47_0 = __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_14(7367, (8205638310375421091L ^ life12_3));

    }

    forwardValue210016_53_0 = forwardValue210016_47_0;

    break forward_join_53;

    }

    forwardValue210016_53_0 = __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_15(25696, (1220625375515282458L ^ life12_3));

    }

    life16_59 = forwardValue210016_53_0;

    spill210016_3 = (moom.Mq.a)[((moom.b3)(p0)).ordinal()];

    if (!((life14_21 == 0))) {

        forwardValue210016_329_0 = spill210016_3;

        break forward_join_329;

    }

    switch (spill210016_3) {

case 1:

{

        break forward_join_61;

    }

case 2:

{

        break forward_join_115;

    }

case 3:

{

        break forward_join_182;

    }

case 4:

{

        break forward_join_262;

    }

default:

{

        break forward_join_327;

    }

}

    }

    org.lwjgl.opengl.GL11.glTexImage1D(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_18(4618, (5134313886643550841L ^ life12_3)))), ((int)(0)), ((int)(((moom.b0)(p1)).a())), ((int)(p2)), ((int)(0)), ((int)(((moom.b1)(p5)).a())), ((int)(((moom.b2)(p6)).a())), ((java.nio.ByteBuffer)(p7)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_23(6709, (6188351915532087877L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_24(29677, (2552209278181940124L ^ life12_3)))), ((int)(life15_40)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_26(6709, (6188351915532087877L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_27(11029, (7338907370957390688L ^ life12_3)))), ((int)(life16_59)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_29(6709, (6188351915532087877L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_30(32464, (7782395916333717160L ^ life12_3)))), ((int)(life16_59)));

    if (!((life14_21 != 0))) {

        break forward_join_327;

    }

    }

    org.lwjgl.opengl.GL11.glTexImage2D(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_32(21892, (8081086932384366075L ^ life12_3)))), ((int)(0)), ((int)(((moom.b0)(p1)).a())), ((int)(p2)), ((int)(p3)), ((int)(0)), ((int)(((moom.b1)(p5)).a())), ((int)(((moom.b2)(p6)).a())), ((java.nio.ByteBuffer)(p7)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_37(12382, (7035898349720950818L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_38(20417, (607814566435727287L ^ life12_3)))), ((int)(life15_40)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_40(12382, (7035898349720950818L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_41(10630, (1248393876010189297L ^ life12_3)))), ((int)(life15_40)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_43(12382, (7035898349720950818L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_44(14932, (7929596073057473077L ^ life12_3)))), ((int)(life16_59)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_46(12382, (7035898349720950818L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_47(20170, (967348935309207217L ^ life12_3)))), ((int)(life16_59)));

    if (!((life14_21 != 0))) {

        break forward_join_327;

    }

    }

    org.lwjgl.opengl.GL12.glTexImage3D(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_49(7871, (8831161875447576257L ^ life12_3)))), ((int)(0)), ((int)(((moom.b0)(p1)).a())), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(0)), ((int)(((moom.b1)(p5)).a())), ((int)(((moom.b2)(p6)).a())), ((java.nio.ByteBuffer)(p7)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_54(31117, (5756553718156530158L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_55(20417, (607814566435727287L ^ life12_3)))), ((int)(life15_40)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_57(31117, (5756553718156530158L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_58(6085, (8804503187039584188L ^ life12_3)))), ((int)(life15_40)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_60(31117, (5756553718156530158L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_61(2975, (5881805369352807421L ^ life12_3)))), ((int)(life15_40)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_63(31117, (5756553718156530158L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_64(14932, (7929596073057473077L ^ life12_3)))), ((int)(life16_59)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_66(31117, (5756553718156530158L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_67(20170, (967348935309207217L ^ life12_3)))), ((int)(life16_59)));

    if (!((life14_21 != 0))) {

        break forward_join_327;

    }

    }

    org.lwjgl.opengl.GL11.glTexImage2D(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_69(20227, (8995515753621923710L ^ life12_3)))), ((int)(0)), ((int)(((moom.b0)(p1)).a())), ((int)(p2)), ((int)(p3)), ((int)(0)), ((int)(((moom.b1)(p5)).a())), ((int)(((moom.b2)(p6)).a())), ((java.nio.ByteBuffer)(p7)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_74(12083, (193497756215592775L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_75(20417, (607814566435727287L ^ life12_3)))), ((int)(life15_40)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_77(12083, (193497756215592775L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_78(6085, (8804503187039584188L ^ life12_3)))), ((int)(life15_40)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_80(12083, (193497756215592775L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_81(14932, (7929596073057473077L ^ life12_3)))), ((int)(life16_59)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_83(12083, (193497756215592775L ^ life12_3)))), ((int)(__sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_84(20170, (967348935309207217L ^ life12_3)))), ((int)(life16_59)));

    }

    forwardValue210016_329_0 = ((moom.Mp)(receiver)).c();

    }

    org.lwjgl.opengl.GL11.glBindTexture(((int)(forwardValue210016_329_0)), ((int)(0)));

    return;

}



static {
d = ((long)(((moom._a)(moom._c.a(((long)(9060627533614922105L)), ((long)(8881942165862388301L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(96891600757341L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Mp.d ^ 95827343524921L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1027_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1027_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1027_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1027_14 = new byte[8];
    (__sourceSpill1027_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1027_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1027_16 = __sourceSpill1027_14;
    ((javax.crypto.Cipher)(__sourceSpill1027_11)).init(((int)(__sourceSpill1027_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1027_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1027_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[21];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ït(@P/EÔþËóNIüVö5\002äz\037ý\007,©\r\035Á¿©14Õø\002{Iy<»k\tM{\004°ï\031â\006k;b²d³n!_e|ÈäÑ¢5[âá\002bXA((°íúÅæ´O:\025KÛ\020Gû&(I¾qÃÅP\n\026L£\bc·ó¹§5\024\006S^O\0274ÊÛúUÊCfjj\030Æ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1027_25 = local6_life21;
        int __sourceSpill1027_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1027_25)).substring(((int)(__sourceSpill1027_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1027_30 = local8_life19;
        int __sourceSpill1027_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1027_33 = new byte[8];
        (__sourceSpill1027_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1027_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1027_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1027_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1027_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1027_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1027_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1027_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1027_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1027_34)).doFinal(((byte[])(__sourceSpill1027_33)));
        (__sourceSpill1027_30)[__sourceSpill1027_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "~è\027ùVÃ\024:V­Ú¾P[òO"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1027_38 = local6_life21;
        int __sourceSpill1027_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1027_38)).substring(((int)(__sourceSpill1027_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1027_43 = local8_life19;
        int __sourceSpill1027_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1027_46 = new byte[8];
        (__sourceSpill1027_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1027_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1027_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1027_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1027_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1027_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1027_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1027_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1027_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1027_47)).doFinal(((byte[])(__sourceSpill1027_46)));
        (__sourceSpill1027_43)[__sourceSpill1027_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[21]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5e3d3c534b8e2db2_0(moom.Mp a0) throws E;

public int b() {
return this.b;
}


public int c() {
return ((moom.b3)(this.a)).a();
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4CCD;
        if (f[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = e[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Mp", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Mp.f[n4] = n8;
        }
        return f[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Mp.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6459_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
int forwardValue2749_13_0;
    int spill2749_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.Mp.d ^ 77381398546913L);
    life3_5 = moom.MS.c();
    spill2749_0 = this.c;
    if (!((life3_5 != 0))) {
        forwardValue2749_13_0 = spill2749_0;
        break forward_join_13;
    }
    if (!((spill2749_0 > 0))) {
        break forward_join_17;
    }
    forwardValue2749_13_0 = this.c;
    }
    org.lwjgl.opengl.GL11.glDeleteTextures(((int)(forwardValue2749_13_0)));
    this.c = ((int)(0));
    }
    return;
}


public int a() {
return this.c;
}


private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e3d3c534b8e2db2_invokedynamic210016_84(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6459_0() throws E;
}
