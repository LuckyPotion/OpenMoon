package net.minecraft.client.resources.model;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ModelRotation extends sourcebuild.EnumConstructor<net.minecraft.client.resources.model.ModelRotation> implements moom.I0, moom.I2 {

public static net.minecraft.client.resources.model.ModelRotation X0_Y0;

public static net.minecraft.client.resources.model.ModelRotation X0_Y90;

public static net.minecraft.client.resources.model.ModelRotation X0_Y180;

public static net.minecraft.client.resources.model.ModelRotation X0_Y270;

public static net.minecraft.client.resources.model.ModelRotation X90_Y0;

public static net.minecraft.client.resources.model.ModelRotation X90_Y90;

public static net.minecraft.client.resources.model.ModelRotation X90_Y180;

public static net.minecraft.client.resources.model.ModelRotation X90_Y270;

public static net.minecraft.client.resources.model.ModelRotation X180_Y0;

public static net.minecraft.client.resources.model.ModelRotation X180_Y90;

public static net.minecraft.client.resources.model.ModelRotation X180_Y180;

public static net.minecraft.client.resources.model.ModelRotation X180_Y270;

public static net.minecraft.client.resources.model.ModelRotation X270_Y0;

public static net.minecraft.client.resources.model.ModelRotation X270_Y90;

public static net.minecraft.client.resources.model.ModelRotation X270_Y180;

public static net.minecraft.client.resources.model.ModelRotation X270_Y270;

private static java.util.Map<java.lang.Integer, net.minecraft.client.resources.model.ModelRotation> a;

private int b;

private org.lwjgl.util.vector.Matrix4f c;

private int d;

private int e;

private static net.minecraft.client.resources.model.ModelRotation[] f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

private ModelRotation(java.lang.String p0, int p1, int p2, int p3) { super((java.lang.String)null, 0); }

private static void __sourceConstructorBody_e7e1fedc6b4c61db(net.minecraft.client.resources.model.ModelRotation receiver, java.lang.String p0, int p1, int p2, int p3) throws Throwable {
long local5_life2 = (net.minecraft.client.resources.model.ModelRotation.g ^ 24330021270962L);
    net.minecraft.client.resources.model.ModelRotation.__sourceConstructorInit_e7e1fedc6b4c61db_0(((net.minecraft.client.resources.model.ModelRotation)(receiver)), ((java.lang.String)(p0)), ((int)(p1)));
    ((net.minecraft.client.resources.model.ModelRotation)(receiver)).b = ((int)(net.minecraft.client.resources.model.ModelRotation.a(((int)(p2)), ((int)(p3)))));
    ((net.minecraft.client.resources.model.ModelRotation)(receiver)).c = ((org.lwjgl.util.vector.Matrix4f)(new org.lwjgl.util.vector.Matrix4f()));
    org.lwjgl.util.vector.Matrix4f local7_life7 = new org.lwjgl.util.vector.Matrix4f();
    ((org.lwjgl.util.vector.Matrix4f)(local7_life7)).setIdentity();
    org.lwjgl.util.vector.Matrix4f.rotate(((float)((((float) (-p2)) * 0x1.1df46a0000000p-6F))), ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(0x1.0p0f, 0x0.0p0f, 0x0.0p0f))), ((org.lwjgl.util.vector.Matrix4f)(local7_life7)), ((org.lwjgl.util.vector.Matrix4f)(local7_life7)));
    ((net.minecraft.client.resources.model.ModelRotation)(receiver)).d = ((int)(moom.Dr.a(((int)((p2 / __sourceIntrinsic_e7e1fedc6b4c61db_originalDynamicSite474_12(23425, (3398041621588117259L ^ local5_life2))))))));
    org.lwjgl.util.vector.Matrix4f local8_life15 = new org.lwjgl.util.vector.Matrix4f();
    ((org.lwjgl.util.vector.Matrix4f)(local8_life15)).setIdentity();
    org.lwjgl.util.vector.Matrix4f.rotate(((float)((((float) (-p3)) * 0x1.1df46a0000000p-6F))), ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(0x0.0p0f, 0x1.0p0f, 0x0.0p0f))), ((org.lwjgl.util.vector.Matrix4f)(local8_life15)), ((org.lwjgl.util.vector.Matrix4f)(local8_life15)));
    ((net.minecraft.client.resources.model.ModelRotation)(receiver)).e = ((int)(moom.Dr.a(((int)((p3 / __sourceIntrinsic_e7e1fedc6b4c61db_originalDynamicSite474_20(23425, (3398041621588117259L ^ local5_life2))))))));
    org.lwjgl.util.vector.Matrix4f.mul(((org.lwjgl.util.vector.Matrix4f)(local8_life15)), ((org.lwjgl.util.vector.Matrix4f)(local7_life7)), ((org.lwjgl.util.vector.Matrix4f)(((net.minecraft.client.resources.model.ModelRotation)(receiver)).c)));
    return;
}


private static void initialize() {
g = ((long)(((moom._a)(moom._c.a(((long)(7860192236623967216L)), ((long)(6293686582637809964L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(46362554881683L)))));
    long local11_life6 = (net.minecraft.client.resources.model.ModelRotation.g ^ 50385187779860L);
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1180_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1180_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1180_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1180_14 = new byte[8];
    (__sourceSpill1180_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1180_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1180_16 = __sourceSpill1180_14;
    ((javax.crypto.Cipher)(__sourceSpill1180_11)).init(((int)(__sourceSpill1180_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1180_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1180_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[29];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "µB9ë°1^ø\031Î®/\007³ËÞñ.\026\003r>\005Ö\034ú\036A·vs÷³EÕd\níe_+Vs\034¢;Ñ¦»!u;Â£w#72+ÚB*48ðãh\003n2®7û¬Hóºøç\005\021Íû\033!ñ;\033ê×LÏ;ü\022ÁÊ£ù\003¬Â×\\\177®°Án&Ð]À?vp±\022ð\033yÅ\r´\rK°M¨¬\036]\f¨\001\rO/Ê4N¤Ô]\020YÉàüÒHq*ÆüAw½\002ÀSÛ0æbÿ6!\bp@x\035tçR\032º\003:6_qé\nGxå\037\\Ãa&"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1180_25 = local4_life21;
        int __sourceSpill1180_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1180_25)).substring(((int)(__sourceSpill1180_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1180_30 = local6_life19;
        int __sourceSpill1180_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1180_33 = new byte[8];
        (__sourceSpill1180_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1180_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1180_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1180_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1180_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1180_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1180_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1180_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1180_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1180_34)).doFinal(((byte[])(__sourceSpill1180_33)));
        (__sourceSpill1180_30)[__sourceSpill1180_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "G\177À\0206=k?Æ@\033~V"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1180_38 = local4_life21;
        int __sourceSpill1180_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1180_38)).substring(((int)(__sourceSpill1180_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1180_43 = local6_life19;
        int __sourceSpill1180_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1180_46 = new byte[8];
        (__sourceSpill1180_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1180_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1180_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1180_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1180_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1180_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1180_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1180_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1180_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1180_47)).doFinal(((byte[])(__sourceSpill1180_46)));
        (__sourceSpill1180_43)[__sourceSpill1180_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    h = ((long[])(local6_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[29]));
    X0_Y0 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X0_Y0", 0, 0, 0)));
    X0_Y90 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X0_Y90", 1, 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_53(20616, (5642476505299242170L ^ local11_life6)))));
    X0_Y180 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X0_Y180", 2, 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_55(31927, (354363984547930251L ^ local11_life6)))));
    X0_Y270 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X0_Y270", 3, 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_57(22447, (6338986342268455820L ^ local11_life6)))));
    X90_Y0 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X90_Y0", 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_59(23425, (3398105737681881005L ^ local11_life6)), 0)));
    X90_Y90 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X90_Y90", 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_61(23425, (3398105737681881005L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_62(23425, (3398105737681881005L ^ local11_life6)))));
    X90_Y180 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X90_Y180", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_64(7101, (2640345949471508354L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_65(23425, (3398105737681881005L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_66(22807, (5040228746173498670L ^ local11_life6)))));
    X90_Y270 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X90_Y270", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_68(6537, (5991400249558631841L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_69(23425, (3398105737681881005L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_70(21240, (1883816224058789592L ^ local11_life6)))));
    X180_Y0 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X180_Y0", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_72(8459, (3255998451053083957L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_73(22807, (5040228746173498670L ^ local11_life6)), 0)));
    X180_Y90 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X180_Y90", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_75(18333, (7531799763175496639L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_76(22807, (5040228746173498670L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_77(23425, (3398105737681881005L ^ local11_life6)))));
    X180_Y180 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X180_Y180", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_79(204, (4005685551008783589L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_80(22807, (5040228746173498670L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_81(22807, (5040228746173498670L ^ local11_life6)))));
    X180_Y270 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X180_Y270", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_83(25721, (7861352994835888212L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_84(22807, (5040228746173498670L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_85(21240, (1883816224058789592L ^ local11_life6)))));
    X270_Y0 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X270_Y0", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_87(29238, (2494077316681231873L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_88(21240, (1883816224058789592L ^ local11_life6)), 0)));
    X270_Y90 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X270_Y90", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_90(18300, (7281152587916106589L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_91(21240, (1883816224058789592L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_92(23425, (3398105737681881005L ^ local11_life6)))));
    X270_Y180 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X270_Y180", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_94(24630, (5254762860666649616L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_95(21240, (1883816224058789592L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_96(22807, (5040228746173498670L ^ local11_life6)))));
    X270_Y270 = ((net.minecraft.client.resources.model.ModelRotation)(new net.minecraft.client.resources.model.ModelRotation("X270_Y270", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_98(2662, (5212168776905791067L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_99(21240, (1883816224058789592L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_100(21240, (1883816224058789592L ^ local11_life6)))));
    f = ((net.minecraft.client.resources.model.ModelRotation[])(net.minecraft.client.resources.model.ModelRotation.a__ArrayaL()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    net.minecraft.client.resources.model.ModelRotation[] local13_life107 = net.minecraft.client.resources.model.ModelRotation.values();
    int local14_life108 = (local13_life107).length;
    int local15_life109 = 0;
    while ((local15_life109 < local14_life108)) {
        net.minecraft.client.resources.model.ModelRotation local16_life110 = (local13_life107)[local15_life109];
        ((java.util.Map)(net.minecraft.client.resources.model.ModelRotation.a)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.client.resources.model.ModelRotation)(local16_life110)).b))))), ((java.lang.Object)(local16_life110)));
        local15_life109 += 1;
    }
}

private static native <E extends Throwable> void __sourceConstructorInit_e7e1fedc6b4c61db_0(net.minecraft.client.resources.model.ModelRotation a0, java.lang.String a1, int a2) throws E;

public static net.minecraft.client.resources.model.ModelRotation[] values() {
return ((net.minecraft.client.resources.model.ModelRotation[])(((net.minecraft.client.resources.model.ModelRotation[])(net.minecraft.client.resources.model.ModelRotation.f)).clone()));
}


public static net.minecraft.client.resources.model.ModelRotation valueOf(java.lang.String p0) {
return ((net.minecraft.client.resources.model.ModelRotation)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.resources.model.ModelRotation.class)), ((java.lang.String)(p0)))));
}


public int b(moom.bs p0, int p1) {
moom.bs lexicalValue1507_22_0;
    int spill1507_0;
    moom.bs spill1507_1;
    long life3_3;
    int life6_6;
    int life5_7;
    moom.bs life7_25;
    int life8_27;
    lexical_join_49: {
    lexical_join_38: {
    lexical_join_22: {
    lexical_join_21: {
    life3_3 = (net.minecraft.client.resources.model.ModelRotation.g ^ 134042449526357L);
    spill1507_0 = __sourceExactCall_5c5d6a17b3677f();
    life6_6 = p1;
    life5_7 = spill1507_0;
    spill1507_1 = p0;
    if (!((life5_7 == 0))) {
        lexicalValue1507_22_0 = spill1507_1;
        break lexical_join_22;
    }
    if (!((((moom.bs)(spill1507_1)).a__bt() == net.minecraft.util.EnumFacing$Axis.X))) {
        break lexical_join_21;
    }
    life6_6 = ((p1 + this.d) % 4);
    }
    lexicalValue1507_22_0 = p0;
    }
    life7_25 = lexicalValue1507_22_0;
    life8_27 = 0;
    lexical_cycle_25: while (true) {
    if (!((life8_27 < this.d))) {
        break lexical_join_38;
    }
    life7_25 = ((moom.bs)(life7_25)).a(((net.minecraft.util.EnumFacing$Axis)(net.minecraft.util.EnumFacing$Axis.X)));
    life8_27 += 1;
    if (!((life5_7 == 0))) {
        break lexical_join_49;
    }
    if (!((life5_7 != 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    if (!((((moom.bs)(life7_25)).a__bt() == net.minecraft.util.EnumFacing$Axis.Y))) {
        break lexical_join_49;
    }
    life6_6 = ((life6_6 + this.e) % 4);
    }
    return life6_6;
}


public moom.bs b(moom.bs p0) {
moom.bs lexicalValue1506_45_0;
    int spill1506_0;
    moom.bs spill1506_1;
    moom.bs spill1506_2;
    long life2_3;
    moom.bs life5_5;
    int life6_8;
    int life4_9;
    int life6_36;
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_23: {
    life2_3 = (net.minecraft.client.resources.model.ModelRotation.g ^ 99442225205912L);
    life5_5 = p0;
    spill1506_0 = moom.DE.c();
    life6_8 = 0;
    life4_9 = spill1506_0;
    lexical_cycle_10: while (true) {
    if (!((life6_8 < this.d))) {
        break lexical_join_23;
    }
    life5_5 = ((moom.bs)(life5_5)).a(((net.minecraft.util.EnumFacing$Axis)(net.minecraft.util.EnumFacing$Axis.X)));
    life6_8 += 1;
    if (!((life4_9 != 0))) {
        break lexical_join_44;
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    spill1506_1 = life5_5;
    if (!((life4_9 != 0))) {
        lexicalValue1506_45_0 = spill1506_1;
        break lexical_join_45;
    }
    if (!((((moom.bs)(spill1506_1)).a__bt() != net.minecraft.util.EnumFacing$Axis.Y))) {
        break lexical_join_44;
    }
    life6_36 = 0;
    lexical_cycle_31: while (true) {
    if (!((life6_36 < this.e))) {
        break lexical_join_44;
    }
    spill1506_2 = ((moom.bs)(life5_5)).a(((net.minecraft.util.EnumFacing$Axis)(net.minecraft.util.EnumFacing$Axis.Y)));
    if (!((life4_9 != 0))) {
        lexicalValue1506_45_0 = spill1506_2;
        break lexical_join_45;
    }
    life5_5 = spill1506_2;
    life6_36 += 1;
    if (!((life4_9 == 0))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    lexicalValue1506_45_0 = life5_5;
    }
    return lexicalValue1506_45_0;
}


public org.lwjgl.util.vector.Matrix4f b() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10920_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static net.minecraft.client.resources.model.ModelRotation[] a__ArrayaL() {
long local0_life1 = (net.minecraft.client.resources.model.ModelRotation.g ^ 5839532176297L);
    net.minecraft.client.resources.model.ModelRotation[] __sourceSharedArray1083_4 = new net.minecraft.client.resources.model.ModelRotation[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_2(26865, (2069448110072984166L ^ local0_life1))];
    __sourceSharedArray1083_4[0] = net.minecraft.client.resources.model.ModelRotation.X0_Y0;
    __sourceSharedArray1083_4[1] = net.minecraft.client.resources.model.ModelRotation.X0_Y90;
    __sourceSharedArray1083_4[2] = net.minecraft.client.resources.model.ModelRotation.X0_Y180;
    __sourceSharedArray1083_4[3] = net.minecraft.client.resources.model.ModelRotation.X0_Y270;
    __sourceSharedArray1083_4[4] = net.minecraft.client.resources.model.ModelRotation.X90_Y0;
    __sourceSharedArray1083_4[5] = net.minecraft.client.resources.model.ModelRotation.X90_Y90;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_10(13968, (1883173356955347991L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X90_Y180;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_12(28331, (6805870103985648674L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X90_Y270;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_14(5191, (2578159434446933706L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X180_Y0;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_16(28228, (6395725954108421330L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X180_Y90;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_18(14048, (8905077657884372072L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X180_Y180;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_20(22793, (5508703132946187138L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X180_Y270;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_22(28878, (3743056420486998594L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X270_Y0;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_24(28084, (5865592176498538278L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X270_Y90;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_26(1568, (6658026595958037670L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X270_Y180;
    __sourceSharedArray1083_4[__sourceIntrinsic_7352b557c513_originalDynamicSite1083_28(1583, (6534418675520904362L ^ local0_life1))] = net.minecraft.client.resources.model.ModelRotation.X270_Y270;
    return __sourceSharedArray1083_4;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7192;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/aL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_dfa73c276d34fb(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, int p1) {
long local2 = (net.minecraft.client.resources.model.ModelRotation.g ^ 89028426205253L);
    return ((p0 * __sourceIntrinsic_90f211e43b08_originalDynamicSite1849_1(23429, (177503451630631674L ^ local2))) + p1);
}


public static net.minecraft.client.resources.model.ModelRotation a__aL(int p0, int p1) {
long local2 = (net.minecraft.client.resources.model.ModelRotation.g ^ 6992919197243L);
    return ((net.minecraft.client.resources.model.ModelRotation)(((java.util.Map)(net.minecraft.client.resources.model.ModelRotation.a)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(__sourceExactCall_5ceb2c0f9825bd(((int)(moom.Dr.b(((int)(p0)), ((int)(__sourceIntrinsic_0bd72ab05396_originalDynamicSite1850_2(19601, (6065233038408356749L ^ local2))))))), ((int)(moom.Dr.b(((int)(p1)), ((int)(__sourceIntrinsic_0bd72ab05396_originalDynamicSite1850_4(23429, (177550057935438980L ^ local2))))))))))))))));
}


public com.google.common.base.Optional<moom.I3> a(com.google.common.base.Optional<? extends moom.IZ> p0) {
return null;
}


public org.lwjgl.util.vector.Matrix4f a() {
return null;
}


public moom.bs a(moom.bs p0) {
return ((net.minecraft.client.resources.model.ModelRotation)(this)).b(((moom.bs)(p0)));
}


public int a(moom.bs p0, int p1) {
return ((net.minecraft.client.resources.model.ModelRotation)(this)).b(((moom.bs)(p0)), ((int)(p1)));
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1180_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7e1fedc6b4c61db_originalDynamicSite474_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7e1fedc6b4c61db_originalDynamicSite474_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_originalDynamicSite1849_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10920_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7352b557c513_originalDynamicSite1083_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0bd72ab05396_originalDynamicSite1850_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0bd72ab05396_originalDynamicSite1850_4(int a0, long a1) throws E;

private static native int __sourceExactCall_5c5d6a17b3677f();
private static native int __sourceExactCall_dfa73c276d34fb(int p0, long p1);
private static native int __sourceExactCall_5ceb2c0f9825bd(int p0, int p1);
}
