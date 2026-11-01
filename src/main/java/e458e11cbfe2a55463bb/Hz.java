package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hz extends moom.Hs {

private moom.Il p;

private moom.Il q;

private java.util.List<moom.Hs> r;

private static long t;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

public Hz() {
super();
    this.r = com.google.common.collect.Lists.newArrayList();
}


public Hz(java.util.Random p0, int p1, int p2, moom.bs p3) { super(0); }


private static void __sourceConstructorBody_c789e1359a803fce(moom.Hz receiver, java.util.Random p0, int p1, int p2, moom.bs p3) throws Throwable {

int forestValue396_130_0;

    int forestValue396_144_0;

    int forestValue396_178_0;

    moom.G2 forestValue396_269_0;

    net.minecraft.entity.Entity[] spill396_0;

    boolean spill396_1;

    boolean spill396_2;

    moom.G2 spill396_3;

    long life5_3;

    net.minecraft.entity.Entity[] life7_11;

    java.util.List life8_53;

    java.util.ArrayList life9_82;

    java.util.Iterator life10_127;

    moom.Il life11_134;

    java.util.Iterator life12_150;

    moom.Ik life13_159;

    int life10_181;

    int life11_194;

    int life12_207;

    java.util.Iterator life13_211;

    moom.Hs life14_218;

    moom.G2 life13_273;

    moom.G2 life14_325;

    moom.G2 life15_389;

    int life16_392;

    forest_join_269: {

    forest_join_226: {

    forest_join_178: {

    forest_join_175: {

    life5_3 = (moom.Hz.t ^ 130954455352133L);

    moom.Hz.__sourceConstructorInit_c789e1359a803fce_0(((moom.Hz)(receiver)), ((int)(0)));

    spill396_0 = moom.G4.b();

    ((moom.Hz)(receiver)).r = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    life7_11 = spill396_0;

    ((moom.Hz)(receiver)).b = ((moom.bs)(p3));

    ((moom.Hz)(receiver)).a = ((moom.G2)(new moom.G2(p1, __sourceIntrinsic_c789e1359a803fce_invokedynamic396_6(26817, (4173761483351968956L ^ life5_3)), p2, ((p1 + __sourceIntrinsic_c789e1359a803fce_invokedynamic396_7(12585, (7585773020388431111L ^ life5_3))) - 1), __sourceIntrinsic_c789e1359a803fce_invokedynamic396_8(5943, (2224636527099622144L ^ life5_3)), ((p2 + __sourceIntrinsic_c789e1359a803fce_invokedynamic396_9(12585, (7585773020388431111L ^ life5_3))) - 1))));

    life8_53 = ((moom.Hz)(receiver)).a(((java.util.Random)(p0)));

    ((moom.Il)(((moom.Hz)(receiver)).p)).d = ((boolean)(true));

    ((java.util.List)(((moom.Hz)(receiver)).r)).add(((java.lang.Object)(new moom.Hy(((moom.Hz)(receiver)).b, ((moom.Hz)(receiver)).p))));

    ((java.util.List)(((moom.Hz)(receiver)).r)).add(((java.lang.Object)(new moom.HA(((moom.Hz)(receiver)).b, ((moom.Hz)(receiver)).q, p0))));

    life9_82 = com.google.common.collect.Lists.newArrayList();

    ((java.util.List)(life9_82)).add(((java.lang.Object)(new moom.In())));

    ((java.util.List)(life9_82)).add(((java.lang.Object)(new moom.Ip())));

    ((java.util.List)(life9_82)).add(((java.lang.Object)(new moom.Iq())));

    ((java.util.List)(life9_82)).add(((java.lang.Object)(new moom.Im())));

    ((java.util.List)(life9_82)).add(((java.lang.Object)(new moom.Io())));

    ((java.util.List)(life9_82)).add(((java.lang.Object)(new moom.Ij())));

    ((java.util.List)(life9_82)).add(((java.lang.Object)(new moom.Ii())));

    life10_127 = ((java.util.List)(life8_53)).iterator();

    forest_cycle_128: while (true) {

    forest_join_173: {

    forestValue396_130_0 = ((((java.util.Iterator)(life10_127)).hasNext()) ? 1 : 0);

    forest_cycle_130: while (true) {

    forest_join_144: {

    if (!((forestValue396_130_0 != 0))) {

        break forest_join_175;

    }

    life11_134 = ((moom.Il)(((java.util.Iterator)(life10_127)).next()));

    spill396_1 = ((moom.Il)(life11_134)).d;

    if (!((life7_11 != null))) {

        forestValue396_178_0 = ((spill396_1) ? 1 : 0);

        break forest_join_178;

    }

    if (!((life7_11 != null))) {

        forestValue396_144_0 = ((spill396_1) ? 1 : 0);

        break forest_join_144;

    }

    if (!((!spill396_1))) {

        break forest_join_173;

    }

    forestValue396_144_0 = ((((moom.Il)(life11_134)).a__Boolean()) ? 1 : 0);

    }

    if (!((forestValue396_144_0 == 0))) {

        break forest_join_173;

    }

    life12_150 = ((java.util.List)(life9_82)).iterator();

    forest_cycle_148: while (true) {

    forest_join_153: {

    if (!((!((java.util.Iterator)(life12_150)).hasNext()))) {

        break forest_join_153;

    }

    if (!((life7_11 == null))) {

        continue forest_cycle_128;

    }

    }

    life13_159 = ((moom.Ik)(((java.util.Iterator)(life12_150)).next()));

    if (!(((moom.Ik)(life13_159)).a(((moom.Il)(life11_134))))) {

        continue forest_cycle_148;

    }

    break forest_cycle_148;

    }

    spill396_2 = ((java.util.List)(((moom.Hz)(receiver)).r)).add(((java.lang.Object)(((moom.Ik)(life13_159)).a(((moom.bs)(((moom.Hz)(receiver)).b)), ((moom.Il)(life11_134)), ((java.util.Random)(p0))))));

    if (!((life7_11 != null))) {

        forestValue396_130_0 = ((spill396_2) ? 1 : 0);

        continue forest_cycle_130;

    }

    break forest_cycle_130;

    }

    recovery.source.CarrierOps.discard(spill396_2);

    }

    if (!((life7_11 == null))) {

        continue forest_cycle_128;

    }

    break forest_cycle_128;

    }

    }

    forestValue396_178_0 = ((moom.G2)(((moom.Hz)(receiver)).a)).b;

    }

    life10_181 = forestValue396_178_0;

    life11_194 = ((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_53(26337, (489309596651078350L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_54(26759, (1703438255570734268L ^ life5_3)))));

    life12_207 = ((moom.Hz)(receiver)).b(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_56(26337, (489309596651078350L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_57(26759, (1703438255570734268L ^ life5_3)))));

    life13_211 = ((java.util.List)(((moom.Hz)(receiver)).r)).iterator();

    forest_cycle_209: while (true) {

    if (!(((java.util.Iterator)(life13_211)).hasNext())) {

        break forest_join_226;

    }

    life14_218 = ((moom.Hs)(((java.util.Iterator)(life13_211)).next()));

    spill396_3 = ((moom.Hs)(life14_218)).a__G2();

    if (!((life7_11 != null))) {

        forestValue396_269_0 = spill396_3;

        break forest_join_269;

    }

    ((moom.G2)(spill396_3)).a(((int)(life11_194)), ((int)(life10_181)), ((int)(life12_207)));

    if (!((life7_11 == null))) {

        continue forest_cycle_209;

    }

    break forest_cycle_209;

    }

    }

    forestValue396_269_0 = moom.G2.a(((int)(((moom.Hz)(receiver)).a(((int)(1)), ((int)(1))))), ((int)(((moom.Hz)(receiver)).a(((int)(1))))), ((int)(((moom.Hz)(receiver)).b(((int)(1)), ((int)(1))))), ((int)(((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_69(22845, (3901384533217541384L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_70(26687, (3457536582456593447L ^ life5_3))))))), ((int)(((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_72(25276, (6242410353912039165L ^ life5_3))))))), ((int)(((moom.Hz)(receiver)).b(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_74(22845, (3901384533217541384L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_75(26687, (3457536582456593447L ^ life5_3))))))));

    }

    life13_273 = forestValue396_269_0;

    life14_325 = moom.G2.a(((int)(((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_78(19000, (3932435090794704419L ^ life5_3)))), ((int)(1))))), ((int)(((moom.Hz)(receiver)).a(((int)(1))))), ((int)(((moom.Hz)(receiver)).b(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_81(19000, (3932435090794704419L ^ life5_3)))), ((int)(1))))), ((int)(((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_83(8270, (6763755567746090092L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_84(26687, (3457536582456593447L ^ life5_3))))))), ((int)(((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_86(25276, (6242410353912039165L ^ life5_3))))))), ((int)(((moom.Hz)(receiver)).b(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_88(8270, (6763755567746090092L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_89(26687, (3457536582456593447L ^ life5_3))))))));

    life15_389 = moom.G2.a(((int)(((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_92(26759, (1703438255570734268L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_93(26759, (1703438255570734268L ^ life5_3))))))), ((int)(((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_95(9304, (2195229983204606068L ^ life5_3))))))), ((int)(((moom.Hz)(receiver)).b(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_97(26759, (1703438255570734268L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_98(26759, (1703438255570734268L ^ life5_3))))))), ((int)(((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_100(13753, (7860863277978554840L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_101(13753, (7860863277978554840L ^ life5_3))))))), ((int)(((moom.Hz)(receiver)).a(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_103(28703, (5227071585189516322L ^ life5_3))))))), ((int)(((moom.Hz)(receiver)).b(((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_105(13753, (7860863277978554840L ^ life5_3)))), ((int)(__sourceIntrinsic_c789e1359a803fce_invokedynamic396_106(13753, (7860863277978554840L ^ life5_3))))))));

    life16_392 = ((java.util.Random)(p0)).nextInt();

    ((java.util.List)(((moom.Hz)(receiver)).r)).add(((java.lang.Object)(new moom.HE(((moom.Hz)(receiver)).b, life13_273, (life16_392++)))));

    ((java.util.List)(((moom.Hz)(receiver)).r)).add(((java.lang.Object)(new moom.HE(((moom.Hz)(receiver)).b, life14_325, (life16_392++)))));

    ((java.util.List)(((moom.Hz)(receiver)).r)).add(((java.lang.Object)(new moom.HB(((moom.Hz)(receiver)).b, life15_389))));

    return;

}



static {
t = ((long)(((moom._a)(moom._c.a(((long)(-2565431414188325872L)), ((long)(6997468486814825669L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(253359123593991L)))));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hz.t ^ 123969833345262L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill852_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill852_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill852_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill852_14 = new byte[8];
    (__sourceSpill852_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill852_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation852_16 = __sourceSpill852_14;
    ((javax.crypto.Cipher)(__sourceSpill852_11)).init(((int)(__sourceSpill852_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill852_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation852_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[109];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\036½)ööê\r_££Â¼\032d¸\000c\006;gr\034\t|Â»{ú´\177[¥\fW$z<\031K*1®Î6ëò@¡|%L6úá¯öT},\bâ,\020`¯¿\024Eh;ad\027*#w_#Å×ô¿¶)\000$zÉå,Ôª(8\023eµ¹DÕ ·¥*^xã\037³YPâ\bù\"ótÖÙæ\000ÈùÍ\037ò{ú;\020\005q\002\021\000xþvò3Öv \007¢^Æ\017I \026f¾­<IQ$*Oô½{\nÌ·\037.\tc_!ðj¸º\026\0079¡\026*ñø|(¥¼¡lÔZ?Êz´é't7Bv$=\000\036ÐiG\030u¶áðW7þ¾ß,\005nÌ·zmlg­1ú¯\"\fùñ+¯ê{ËÙÖø÷9Éj§òÌ:/ÁåF \027åßnUc4ç\016ªT§U|üÙÏP\t¤EmÔKÑ¢eoVÃf®\b\013{¾Z\t«ë-kçJ3\035¯+Ý]1ðÜ4\027>7ÙâðË\020U{\nÂ\026ñ2òcÉ¶åßñr%m0\004®ÑZ\020±ê\035ü¸gn¨Îâ|ú_Ï\\\035öÿÄ\\Lç2}ì*´ï`t\006*'eg7¾dÑÆH71o¡oÑ%¿Ns\004µþV\177éK>H.ÙKîû&ãÌP©!\016\030jhÜY1ÐÕ÷uwUXë¦øoíîhY\"\\\007×8¤¾û^cBs1 Á+þ,Hï\"bÆ¥©s0èLæ\022\037Ë1.¥\00512Op×\035ÆÑ>çòs\035>dËæâÞ\023\031\033¯ù.÷)®f¡='æ¬ô¥\002à¯w8g\030+Ëìô\033/Ö¬^4\bo\031 dÍåxU\026\tß\025Ç<\013¤M\tíÙ\t\006\027}Óê¶½ÞôÀbOy\fð@4È:À\031FeM¤\tåKuÄÿ ÆJ7É^Û\005Ù\001Á¬ûñÂl;%v\016ç{\023âãa*Ô\t2É\022+Ú\030ÏBdé\001D\013YeíëE\020¸_^ÓD\025Nl mËþRãÇÝÌCpéòXÙ>Ëð\032ªÚ'R\boÊìñ>j\b\ry\017_%¶ï@'Ý\000ÇO\177ü®\016Äû@6¼ê*D-¢/É·ùå÷§èÄ|Owe\032¸oÈ­Kóü?i\rLá}ÑrîGWmÁ+Ýõs5\000y`H+\037ÿF\024"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill852_25 = local6_life21;
        int __sourceSpill852_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill852_25)).substring(((int)(__sourceSpill852_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill852_30 = local8_life19;
        int __sourceSpill852_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill852_33 = new byte[8];
        (__sourceSpill852_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill852_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill852_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill852_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill852_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill852_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill852_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill852_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill852_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill852_34)).doFinal(((byte[])(__sourceSpill852_33)));
        (__sourceSpill852_30)[__sourceSpill852_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "©ðÈý\013=üA®®\017'³ðò"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill852_38 = local6_life21;
        int __sourceSpill852_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill852_38)).substring(((int)(__sourceSpill852_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill852_43 = local8_life19;
        int __sourceSpill852_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill852_46 = new byte[8];
        (__sourceSpill852_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill852_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill852_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill852_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill852_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill852_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill852_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill852_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill852_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill852_47)).doFinal(((byte[])(__sourceSpill852_46)));
        (__sourceSpill852_43)[__sourceSpill852_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    z = ((long[])(local8_life19));
    A = ((java.lang.Integer[])(new java.lang.Integer[109]));
}

private static native <E extends Throwable> void __sourceConstructorInit_c789e1359a803fce_0(moom.Hz a0, int a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4884_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void b(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue781_573_0;
    boolean spill781_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_579;
    int life7_748;
    lexical_join_1205: {
    lexical_join_1178: {
    lexical_join_838: {
    lexical_join_732: {
    lexical_join_692: {
    lexical_join_636: {
    lexical_join_634: {
    lexical_join_573: {
    life4_3 = (moom.Hz.t ^ 31983306931686L);
    life6_5 = moom.G4.b();
    spill781_0 = ((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_2(30099, (3134409073555746583L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_3(22146, (3649116882175069292L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_4(10075, (2615541379936648603L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_5(26687, (3457578413358887556L ^ life4_3)))));
    if (!((life6_5 != null))) {
        lexicalValue781_573_0 = ((spill781_0) ? 1 : 0);
        break lexical_join_573;
    }
    if (!(spill781_0)) {
        break lexical_join_1205;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_8(30099, (3134409073555746583L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_9(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_10(10075, (2615541379936648603L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_11(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_15(7927, (2850206463411307618L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_16(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_17(24225, (8553545987996222526L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_18(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_20(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_21(9283, (3564101332549041887L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_22(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_23(4586, (5560232243413568307L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_24(9283, (3564101332549041887L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_25(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_29(28703, (5227029784485997185L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_30(24738, (9079519369072491048L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_31(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_32(28584, (854854300548773140L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_33(24738, (9079519369072491048L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_34(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_38(20218, (2888446572893258L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_39(28997, (606734624596044676L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_40(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_41(25245, (2716567721460971533L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_42(28997, (606734624596044676L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_43(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_47(30099, (3134409073555746583L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_48(28128, (299283326643844920L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_49(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_50(10075, (2615541379936648603L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_51(26337, (489214989198769261L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_52(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_56(20218, (2888446572893258L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_57(23108, (520132175230828785L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_58(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_59(20008, (2146241149034009775L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_60(23108, (520132175230828785L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_61(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_65(28703, (5227029784485997185L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_66(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_67(20612, (5139290474185886273L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_68(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_72(26687, (3457578413358887556L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_73(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_74(4586, (5560232243413568307L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_75(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_79(26759, (1703414120074981919L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_80(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_81(9730, (2524272118485941420L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_82(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_86(16846, (6886035905024924457L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_87(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_88(5322, (5689535719936773637L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_89(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_93(22845, (3901501135207039915L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_94(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_95(24479, (1200087700924892474L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_96(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_100(2864, (2712925890445464039L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_101(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_102(21946, (8781691678375087913L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_103(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_107(28142, (6993621713649121092L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_108(22146, (3649116882175069292L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_109(15758, (2772852061058656056L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_110(26687, (3457578413358887556L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_115(2242, (1926626609426813479L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_116(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_119(22676, (3080863491164373593L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_120(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_123(9730, (2524272118485941420L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_124(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_127(16846, (6886035905024924457L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_128(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_131(31484, (1540280559691046944L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_132(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_135(12758, (2134967600825199369L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_136(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    lexicalValue781_573_0 = 0;
    }
    life7_579 = lexicalValue781_573_0;
    lexical_cycle_574: while (true) {
    if (!((life7_579 < __sourceIntrinsic_63850b85fc99_invokedynamic781_138(28128, (299283326643844920L ^ life4_3))))) {
        break lexical_join_634;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_140(160, (4252319998218951203L ^ life4_3)) - life7_579))), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_141(23108, (520132175230828785L ^ life4_3)) + life7_579))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_142(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_145(9996, (8079168306379619714L ^ life4_3)) + life7_579))), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_146(23108, (520132175230828785L ^ life4_3)) + life7_579))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_147(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    life7_579 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_636;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_574; }
    break lexical_cycle_574;
    }
    }
    life7_579 = 0;
    }
    lexical_cycle_636: while (true) {
    if (!((life7_579 < 4))) {
        break lexical_join_692;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_150(160, (4252319998218951203L ^ life4_3)) - life7_579))), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_151(26337, (489214989198769261L ^ life4_3)) + life7_579))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_152(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_155(9996, (8079168306379619714L ^ life4_3)) + life7_579))), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_156(26337, (489214989198769261L ^ life4_3)) + life7_579))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_157(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    life7_579 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_732;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_636; }
    break lexical_cycle_636;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_160(160, (4252319998218951203L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_161(9283, (3564101332549041887L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_162(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_165(9996, (8079168306379619714L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_166(9283, (3564101332549041887L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_167(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    }
    life7_748 = 0;
    lexical_cycle_734: while (true) {
    if (!((life7_748 < 3))) {
        break lexical_join_838;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_170(26759, (1703414120074981919L ^ life4_3)) - (life7_748 * 2)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_171(25276, (6242293820647225438L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_172(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_175(26759, (1703414120074981919L ^ life4_3)) - (life7_748 * 2)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_176(26337, (489214989198769261L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_177(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_180(13753, (7860768769302196091L ^ life4_3)) + (life7_748 * 2)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_181(25276, (6242293820647225438L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_182(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.g)), ((int)((__sourceIntrinsic_63850b85fc99_invokedynamic781_185(13753, (7860768769302196091L ^ life4_3)) + (life7_748 * 2)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_186(26337, (489214989198769261L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_187(26687, (3457578413358887556L ^ life4_3)))), ((moom.G2)(p2)));
    life7_748 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_1178;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_734; }
    break lexical_cycle_734;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_189(30099, (3134409073555746583L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_190(9304, (2195342113998929623L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_191(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_192(10075, (2615541379936648603L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_193(30099, (3134409073555746583L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_194(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_196(30099, (3134409073555746583L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_197(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_198(30099, (3134409073555746583L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_199(23108, (520132175230828785L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_200(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_202(20218, (2888446572893258L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_203(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_204(20218, (2888446572893258L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_205(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_207(28703, (5227029784485997185L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_208(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_209(22146, (3649116882175069292L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_210(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_212(26687, (3457578413358887556L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_213(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_214(26687, (3457578413358887556L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_215(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_217(26759, (1703414120074981919L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_218(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_219(26759, (1703414120074981919L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_220(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_222(22845, (3901501135207039915L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_223(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_224(10995, (3273550280187998240L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_225(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_227(10075, (2615541379936648603L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_228(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_229(10075, (2615541379936648603L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_230(23108, (520132175230828785L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_231(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_233(20008, (2146241149034009775L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_234(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_235(20008, (2146241149034009775L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_236(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_238(26246, (2821151856981359654L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_239(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_240(20612, (5139290474185886273L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_241(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_243(4586, (5560232243413568307L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_244(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_245(4586, (5560232243413568307L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_246(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_248(17255, (4222168147962370525L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_249(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_250(19000, (3932410955299262592L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_251(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_253(13753, (7860768769302196091L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_254(26687, (3457578413358887556L ^ life4_3)))), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_255(13753, (7860768769302196091L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_63850b85fc99_invokedynamic781_256(26687, (3457578413358887556L ^ life4_3)))), ((boolean)(false)));
    }
    return;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4D34;
        if (A[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = z[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])B.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Hz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hz.A[n2] = n3;
        }
        return A[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_89acfc28927eb8(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void e(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forestValue284_233_0;
    int forestValue284_437_0;
    int forestValue284_505_0;
    int forestValue284_571_0;
    int forestValue284_571_1;
    int forestValue284_580_0;
    int forestValue284_580_1;
    int forestValue284_589_0;
    int forestValue284_589_1;
    int forestValue284_598_0;
    int forestValue284_598_1;
    int forestValue284_810_0;
    int forestValue284_810_1;
    boolean spill284_0;
    int spill284_1;
    int spill284_2;
    int spill284_3;
    int spill284_4;
    int spill284_5;
    int spill284_6;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_133;
    int life7_352;
    int life7_539;
    int life7_825;
    forest_join_931: {
    forest_join_894: {
    forest_join_857: {
    forest_join_810: {
    forest_join_762: {
    forest_join_505: {
    forest_join_437: {
    forest_join_414: {
    forest_join_386: {
    forest_join_380: {
    forest_join_233: {
    forest_join_210: {
    forest_join_182: {
    forest_join_176: {
    life4_3 = (moom.Hz.t ^ 88735419535434L);
    life6_5 = moom.G4.b();
    spill284_0 = ((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_2(28128, (299218051151256212L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_3(26687, (3457502951295967016L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_4(9304, (2195260346989581179L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_5(17392, (7865142356501525745L ^ life4_3)))));
    if (!((life6_5 != null))) {
        forestValue284_233_0 = ((spill284_0) ? 1 : 0);
        break forest_join_233;
    }
    if (!(spill284_0)) {
        break forest_join_210;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_8(28128, (299218051151256212L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_9(26687, (3457502951295967016L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_10(9304, (2195260346989581179L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_11(17392, (7865142356501525745L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_15(28128, (299218051151256212L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_16(26687, (3457502951295967016L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_17(9304, (2195260346989581179L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_18(28997, (606790023726417448L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_19(17392, (7865142356501525745L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_21(24738, (9079436482134202244L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_22(25276, (6242367911492048370L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_23(26687, (3457502951295967016L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_24(9304, (2195260346989581179L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_25(25276, (6242367911492048370L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_26(31267, (860729804684774717L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    life7_133 = 0;
    forest_cycle_131: while (true) {
    if (!((life7_133 < 4))) {
        break forest_join_176;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((life7_133 + __sourceIntrinsic_ee6d176bf27a_invokedynamic284_30(28128, (299218051151256212L ^ life4_3))))), ((int)((life7_133 + 5))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_31(26687, (3457502951295967016L ^ life4_3)))), ((int)((life7_133 + __sourceIntrinsic_ee6d176bf27a_invokedynamic284_32(28128, (299218051151256212L ^ life4_3))))), ((int)((life7_133 + 5))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_33(1516, (128054029744354047L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_133 += 1;
    if (!((life6_5 != null))) {
        break forest_join_182;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_131;
    }
    break forest_cycle_131;
    }
    }
    life7_133 = __sourceIntrinsic_ee6d176bf27a_invokedynamic284_37(26687, (3457502951295967016L ^ life4_3));
    }
    forest_cycle_182: while (true) {
    if (!((life7_133 <= __sourceIntrinsic_ee6d176bf27a_invokedynamic284_38(29256, (3372191367145768285L ^ life4_3))))) {
        break forest_join_210;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_40(9283, (3564166883925562227L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_41(26337, (489282477654921665L ^ life4_3)))), ((int)(life7_133)), ((moom.G2)(p2)));
    life7_133 += 3;
    if (!((life6_5 != null))) {
        break forest_join_414;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_182;
    }
    break forest_cycle_182;
    }
    }
    forestValue284_233_0 = ((((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_43(24506, (3026784672180168845L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_44(26687, (3457502951295967016L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_45(17392, (7865142356501525745L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_46(8346, (777967482135844848L ^ life4_3)))))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forestValue284_437_0 = forestValue284_233_0;
        break forest_join_437;
    }
    if (!((forestValue284_233_0 != 0))) {
        break forest_join_414;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_49(12733, (830551200671237813L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_50(26687, (3457502951295967016L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_51(17392, (7865142356501525745L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_52(17392, (7865142356501525745L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_56(12733, (830551200671237813L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_57(26687, (3457502951295967016L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_58(17392, (7865142356501525745L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_59(28997, (606790023726417448L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_60(17392, (7865142356501525745L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_62(12733, (830551200671237813L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_63(25276, (6242367911492048370L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_64(26687, (3457502951295967016L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_65(21804, (3211130646911377998L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_66(25276, (6242367911492048370L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_67(31267, (860729804684774717L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    life7_352 = 0;
    forest_cycle_335: while (true) {
    if (!((life7_352 < 4))) {
        break forest_join_380;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_ee6d176bf27a_invokedynamic284_71(17392, (7865142356501525745L ^ life4_3)) - life7_352))), ((int)((life7_352 + 5))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_72(26687, (3457502951295967016L ^ life4_3)))), ((int)((__sourceIntrinsic_ee6d176bf27a_invokedynamic284_73(17392, (7865142356501525745L ^ life4_3)) - life7_352))), ((int)((life7_352 + 5))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_74(8346, (777967482135844848L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_352 += 1;
    if (!((life6_5 != null))) {
        break forest_join_386;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_335;
    }
    break forest_cycle_335;
    }
    }
    life7_352 = __sourceIntrinsic_ee6d176bf27a_invokedynamic284_78(26687, (3457502951295967016L ^ life4_3));
    }
    forest_cycle_386: while (true) {
    if (!((life7_352 <= __sourceIntrinsic_ee6d176bf27a_invokedynamic284_79(12343, (2698082221643368193L ^ life4_3))))) {
        break forest_join_414;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_81(12343, (2698082221643368193L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_82(26337, (489282477654921665L ^ life4_3)))), ((int)(life7_352)), ((moom.G2)(p2)));
    life7_352 += 3;
    if (!((life6_5 != null))) {
        break forest_join_931;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_386;
    }
    break forest_cycle_386;
    }
    }
    forestValue284_437_0 = ((((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_84(25276, (6242367911492048370L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_85(12733, (830551200671237813L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_86(28088, (2374504524819487410L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_87(8346, (777967482135844848L ^ life4_3)))))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forestValue284_505_0 = forestValue284_437_0;
        break forest_join_505;
    }
    if (!((forestValue284_437_0 != 0))) {
        break forest_join_931;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_90(17391, (3529381825355773156L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_91(12733, (830551200671237813L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_92(15563, (4596445200663481342L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_93(17392, (7865142356501525745L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_97(17391, (3529381825355773156L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_98(12733, (830551200671237813L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_99(15563, (4596445200663481342L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_100(28997, (606790023726417448L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_101(17392, (7865142356501525745L ^ life4_3)))), ((boolean)(false)));
    forestValue284_505_0 = __sourceIntrinsic_ee6d176bf27a_invokedynamic284_103(9283, (3564166883925562227L ^ life4_3));
    }
    life7_539 = forestValue284_505_0;
    forest_cycle_506: while (true) {
    forest_join_759: {
    forest_join_743: {
    forest_join_599: {
    forest_join_598: {
    forest_join_589: {
    forest_join_580: {
    forest_join_571: {
    if (!((life7_539 <= __sourceIntrinsic_ee6d176bf27a_invokedynamic284_104(12343, (2698082221643368193L ^ life4_3))))) {
        break forest_join_762;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_106(26337, (489282477654921665L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_107(12343, (2698082221643368193L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_110(26337, (489282477654921665L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_111(3926, (7472215635273005178L ^ life4_3)))), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        break forest_join_743;
    }
    spill284_1 = life7_539;
    spill284_2 = __sourceIntrinsic_ee6d176bf27a_invokedynamic284_113(9283, (3564166883925562227L ^ life4_3));
    if (!((life6_5 != null))) {
        forestValue284_810_0 = spill284_1;
        forestValue284_810_1 = spill284_2;
        break forest_join_810;
    }
    if (!((spill284_1 != spill284_2))) {
        break forest_join_599;
    }
    spill284_3 = life7_539;
    spill284_4 = __sourceIntrinsic_ee6d176bf27a_invokedynamic284_114(18494, (189034520882642756L ^ life4_3));
    if (!((life6_5 != null))) {
        forestValue284_571_0 = spill284_3;
        forestValue284_571_1 = spill284_4;
        break forest_join_571;
    }
    if (!((spill284_3 != spill284_4))) {
        break forest_join_599;
    }
    forestValue284_571_0 = life7_539;
    forestValue284_571_1 = __sourceIntrinsic_ee6d176bf27a_invokedynamic284_115(10995, (3273467118371249548L ^ life4_3));
    }
    if (!((life6_5 != null))) {
        forestValue284_580_0 = forestValue284_571_0;
        forestValue284_580_1 = forestValue284_571_1;
        break forest_join_580;
    }
    if (!((forestValue284_571_0 != forestValue284_571_1))) {
        break forest_join_599;
    }
    forestValue284_580_0 = life7_539;
    forestValue284_580_1 = __sourceIntrinsic_ee6d176bf27a_invokedynamic284_116(17255, (4222241393840026737L ^ life4_3));
    }
    if (!((life6_5 != null))) {
        forestValue284_589_0 = forestValue284_580_0;
        forestValue284_589_1 = forestValue284_580_1;
        break forest_join_589;
    }
    if (!((forestValue284_580_0 != forestValue284_580_1))) {
        break forest_join_599;
    }
    forestValue284_589_0 = life7_539;
    forestValue284_589_1 = __sourceIntrinsic_ee6d176bf27a_invokedynamic284_117(26817, (4173722339659538355L ^ life4_3));
    }
    if (!((life6_5 != null))) {
        forestValue284_598_0 = forestValue284_589_0;
        forestValue284_598_1 = forestValue284_589_1;
        break forest_join_598;
    }
    if (!((forestValue284_589_0 != forestValue284_589_1))) {
        break forest_join_599;
    }
    forestValue284_598_0 = life7_539;
    forestValue284_598_1 = __sourceIntrinsic_ee6d176bf27a_invokedynamic284_118(12343, (2698082221643368193L ^ life4_3));
    }
    if (!((forestValue284_598_0 == forestValue284_598_1))) {
        break forest_join_759;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_120(26337, (489282477654921665L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_121(7765, (8050109760247900456L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_124(26337, (489282477654921665L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_125(17392, (7865142356501525745L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_128(28997, (606790023726417448L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_129(12343, (2698082221643368193L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_132(28997, (606790023726417448L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_133(17376, (737472556886226095L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_136(28997, (606790023726417448L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_137(28486, (1358072922805491832L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_140(28997, (606790023726417448L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_141(3926, (7472215635273005178L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_144(24738, (9079436482134202244L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_145(2961, (2460173550635990229L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_148(24738, (9079436482134202244L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_149(17392, (7865142356501525745L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_152(9283, (3564166883925562227L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_153(15050, (5794359922340138449L ^ life4_3)))), ((moom.G2)(p2)));
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_539)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_156(9283, (3564166883925562227L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_157(4982, (335414956230255671L ^ life4_3)))), ((moom.G2)(p2)));
    }
    life7_539 += 3;
    if (!((life6_5 == null))) {
        continue forest_cycle_506;
    }
    break forest_cycle_506;
    }
    }
    life7_825 = 0;
    forest_cycle_764: while (true) {
    if (!((life7_825 < 3))) {
        break forest_join_857;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_ee6d176bf27a_invokedynamic284_159(25276, (6242367911492048370L ^ life4_3)) + life7_825))), ((int)((5 + life7_825))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_160(8346, (777967482135844848L ^ life4_3)))), ((int)((__sourceIntrinsic_ee6d176bf27a_invokedynamic284_161(4982, (335414956230255671L ^ life4_3)) - life7_825))), ((int)((5 + life7_825))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_162(8346, (777967482135844848L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    life7_825 += 1;
    if (!((life6_5 != null))) {
        break forest_join_894;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_764;
    }
    break forest_cycle_764;
    }
    break forest_join_857;
    }
    forest_cycle_810: while (true) {
    forest_join_854: {
    if (!((forestValue284_810_0 < forestValue284_810_1))) {
        break forest_join_857;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_ee6d176bf27a_invokedynamic284_166(25276, (6242367911492048370L ^ life4_3)) + life7_539))), ((int)((5 + life7_539))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_167(8346, (777967482135844848L ^ life4_3)))), ((int)((__sourceIntrinsic_ee6d176bf27a_invokedynamic284_168(4982, (335414956230255671L ^ life4_3)) - life7_539))), ((int)((5 + life7_539))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_169(8346, (777967482135844848L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    life7_539 += 1;
    if (!((life6_5 != null))) {
        break forest_join_894;
    }
    if (!((life6_5 == null))) {
        break forest_join_854;
    }
    break forest_join_857;
    }
    spill284_5 = life7_539;
    spill284_6 = 3;
    forestValue284_810_0 = spill284_5;
    forestValue284_810_1 = spill284_6;
    continue forest_cycle_810;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_173(24738, (9079436482134202244L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_174(25276, (6242367911492048370L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_175(8346, (777967482135844848L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_176(17376, (737472556886226095L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_177(25276, (6242367911492048370L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_178(8346, (777967482135844848L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_182(17391, (3529381825355773156L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_183(25276, (6242367911492048370L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_184(12733, (830551200671237813L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_185(15563, (4596445200663481342L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_186(25276, (6242367911492048370L ^ life4_3)))), ((int)(__sourceIntrinsic_ee6d176bf27a_invokedynamic284_187(31267, (860729804684774717L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    }
    return;
}


private void c(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue782_93_0;
    boolean spill782_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_99;
    lexical_join_871: {
    lexical_join_834: {
    lexical_join_298: {
    lexical_join_93: {
    life4_3 = (moom.Hz.t ^ 88653330284583L);
    life6_5 = moom.G4.b();
    spill782_0 = ((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_2(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_3(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_4(4586, (5560156031456229106L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_5(4586, (5560156031456229106L ^ life4_3)))));
    if (!((life6_5 != null))) {
        lexicalValue782_93_0 = ((spill782_0) ? 1 : 0);
        break lexical_join_93;
    }
    if (!(spill782_0)) {
        break lexical_join_871;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_8(26687, (3457502862625984325L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_9(26759, (1703472997619421150L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_10(4586, (5560156031456229106L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_11(4586, (5560156031456229106L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_15(26687, (3457502862625984325L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_16(26759, (1703472997619421150L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_17(4586, (5560156031456229106L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_18(22845, (3901426980354784874L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_19(4586, (5560156031456229106L ^ life4_3)))), ((boolean)(false)));
    lexicalValue782_93_0 = 0;
    }
    life7_99 = lexicalValue782_93_0;
    lexical_cycle_94: while (true) {
    if (!((life7_99 < 4))) {
        break lexical_join_298;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_21(26687, (3457502862625984325L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_22(9304, (2195260395893752598L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_23(26687, (3457502862625984325L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_24(4586, (5560156031456229106L ^ life4_3)) - life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_25(9304, (2195260395893752598L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_26(26687, (3457502862625984325L ^ life4_3)) + life7_99))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_30(26687, (3457502862625984325L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_31(9304, (2195260395893752598L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_32(4586, (5560156031456229106L ^ life4_3)) - life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_33(4586, (5560156031456229106L ^ life4_3)) - life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_34(9304, (2195260395893752598L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_35(4586, (5560156031456229106L ^ life4_3)) - life7_99))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_39(26687, (3457502862625984325L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_40(9304, (2195260395893752598L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_41(26759, (1703472997619421150L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_42(26687, (3457502862625984325L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_43(9304, (2195260395893752598L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_44(13753, (7860824498660610746L ^ life4_3)) - life7_99))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_48(4586, (5560156031456229106L ^ life4_3)) - life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_49(9304, (2195260395893752598L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_50(26759, (1703472997619421150L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_51(4586, (5560156031456229106L ^ life4_3)) - life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_52(9304, (2195260395893752598L ^ life4_3)) + life7_99))), ((int)((__sourceIntrinsic_9814609660c3_invokedynamic782_53(13753, (7860824498660610746L ^ life4_3)) - life7_99))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_99 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_834;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_94; }
    break lexical_cycle_94;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_57(31484, (1540337405636402657L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_58(20218, (2830904616118667L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_59(31484, (1540337405636402657L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_60(12758, (2134882210359023304L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_61(20218, (2830904616118667L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_62(12758, (2134882210359023304L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_66(31484, (1540337405636402657L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_67(28703, (5227111618555139904L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_68(31484, (1540337405636402657L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_69(31484, (1540337405636402657L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_70(25670, (2652894706636964705L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_71(31484, (1540337405636402657L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_75(12758, (2134882210359023304L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_76(28703, (5227111618555139904L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_77(31484, (1540337405636402657L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_78(12758, (2134882210359023304L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_79(25670, (2652894706636964705L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_80(31484, (1540337405636402657L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_84(31484, (1540337405636402657L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_85(28703, (5227111618555139904L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_86(12758, (2134882210359023304L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_87(31484, (1540337405636402657L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_88(25670, (2652894706636964705L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_89(12758, (2134882210359023304L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_93(12758, (2134882210359023304L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_94(28703, (5227111618555139904L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_95(12758, (2134882210359023304L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_96(12758, (2134882210359023304L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_97(25670, (2652894706636964705L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_98(12758, (2134882210359023304L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_103(9730, (2524348583975682413L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_104(22146, (3649052386867704237L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_105(9730, (2524348583975682413L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_108(30079, (8798091289939104366L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_109(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_110(30079, (8798091289939104366L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.i)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_113(30079, (8798091289939104366L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_114(22146, (3649052386867704237L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_115(30079, (8798091289939104366L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_118(9730, (2524348583975682413L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_119(22146, (3649052386867704237L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_120(16846, (6886092463249811176L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_123(30079, (8798091289939104366L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_124(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_125(24814, (2822403442205345668L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.i)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_128(30079, (8798091289939104366L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_129(22146, (3649052386867704237L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_130(24814, (2822403442205345668L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_133(16846, (6886092463249811176L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_134(22146, (3649052386867704237L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_135(16846, (6886092463249811176L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_138(24814, (2822403442205345668L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_139(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_140(24814, (2822403442205345668L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.i)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_143(24814, (2822403442205345668L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_144(22146, (3649052386867704237L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_145(24814, (2822403442205345668L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_148(16846, (6886092463249811176L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_149(22146, (3649052386867704237L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_150(9730, (2524348583975682413L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_153(24814, (2822403442205345668L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_154(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_155(30079, (8798091289939104366L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.i)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_158(24814, (2822403442205345668L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_159(22146, (3649052386867704237L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_160(30079, (8798091289939104366L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_162(160, (4252254798428383202L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_163(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_164(30079, (8798091289939104366L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_165(9996, (8079094288983425091L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_166(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_167(30079, (8798091289939104366L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_171(30079, (8798091289939104366L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_172(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_173(160, (4252254798428383202L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_174(30079, (8798091289939104366L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_175(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_176(9996, (8079094288983425091L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_180(160, (4252254798428383202L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_181(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_182(24814, (2822403442205345668L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_183(9996, (8079094288983425091L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_184(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_185(24814, (2822403442205345668L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_189(24814, (2822403442205345668L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_190(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_191(160, (4252254798428383202L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_192(24814, (2822403442205345668L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_193(26687, (3457502862625984325L ^ life4_3)))), ((int)(__sourceIntrinsic_9814609660c3_invokedynamic782_194(9996, (8079094288983425091L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    }
    return;
}


private void f(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue785_280_0;
    int lexicalValue785_531_0;
    int lexicalValue785_632_0;
    boolean spill785_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_170;
    int life7_433;
    int life7_662;
    lexical_join_722: {
    lexical_join_696: {
    lexical_join_690: {
    lexical_join_632: {
    lexical_join_531: {
    lexical_join_508: {
    lexical_join_480: {
    lexical_join_474: {
    lexical_join_280: {
    lexical_join_257: {
    lexical_join_229: {
    lexical_join_223: {
    life4_3 = (moom.Hz.t ^ 59680175210894L);
    life6_5 = moom.G4.b();
    spill785_0 = ((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_2(17077, (5930577021980943386L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_3(10541, (8474847866391351184L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_4(31587, (6583722098337947074L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_5(1672, (4504680851986309224L ^ life4_3)))));
    if (!((life6_5 != null))) {
        lexicalValue785_280_0 = ((spill785_0) ? 1 : 0);
        break lexical_join_280;
    }
    if (!(spill785_0)) {
        break lexical_join_257;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_8(17391, (3529279360261498144L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_9(26687, (3457606103583526636L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_10(22146, (3649163822644342788L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_11(15563, (4596412142375492154L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_15(17391, (3529279360261498144L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_16(7720, (4747538746781956328L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_17(22146, (3649163822644342788L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_18(17391, (3529279360261498144L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_19(15563, (4596412142375492154L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_21(15341, (4122987298784435521L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_22(4540, (3980332666872592209L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_23(26759, (1703369238035893879L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_24(22146, (3649163822644342788L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_25(9283, (3564053844471431863L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_26(25380, (5901834104535483821L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_30(18494, (189136985857928832L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_31(9283, (3564053844471431863L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_32(26687, (3457606103583526636L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_33(22146, (3649163822644342788L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_34(9283, (3564053844471431863L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_35(26687, (3457606103583526636L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_170 = 0;
    lexical_cycle_168: while (true) {
    if (!((life7_170 < 4))) {
        break lexical_join_223;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((life7_170 + __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_39(17391, (3529279360261498144L ^ life4_3))))), ((int)((life7_170 + __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_40(28504, (6298471093196360156L ^ life4_3))))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_41(26687, (3457606103583526636L ^ life4_3)))), ((int)((life7_170 + __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_42(17391, (3529279360261498144L ^ life4_3))))), ((int)((life7_170 + __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_43(26337, (489239936214237189L ^ life4_3))))), ((int)((__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_44(15563, (4596412142375492154L ^ life4_3)) - life7_170))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_170 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_229;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_168; }
    break lexical_cycle_168;
    }
    }
    life7_170 = __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_48(1858, (5222388353389748686L ^ life4_3));
    }
    lexical_cycle_229: while (true) {
    if (!((life7_170 <= __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_49(26817, (4173830431160471159L ^ life4_3))))) {
        break lexical_join_257;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_51(27485, (629881076783582618L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_52(11684, (3063151523666643756L ^ life4_3)))), ((int)(life7_170)), ((moom.G2)(p2)));
    life7_170 += 3;
    if (!((life6_5 != null))) {
        break lexical_join_508;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_229; }
    break lexical_cycle_229;
    }
    }
    lexicalValue785_280_0 = ((((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_54(14019, (7250022964760170554L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_55(26687, (3457606103583526636L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_56(15563, (4596412142375492154L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_57(15563, (4596412142375492154L ^ life4_3)))))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue785_531_0 = lexicalValue785_280_0;
        break lexical_join_531;
    }
    if (!((lexicalValue785_280_0 != 0))) {
        break lexical_join_508;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_60(26246, (2821107123387072590L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_61(26687, (3457606103583526636L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_62(15563, (4596412142375492154L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_63(15563, (4596412142375492154L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_67(26246, (2821107123387072590L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_68(26759, (1703369238035893879L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_69(15563, (4596412142375492154L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_70(17391, (3529279360261498144L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_71(15563, (4596412142375492154L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_73(26246, (2821107123387072590L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_74(9283, (3564053844471431863L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_75(26759, (1703369238035893879L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_76(26817, (4173830431160471159L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_77(9283, (3564053844471431863L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_78(26817, (4173830431160471159L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_82(26246, (2821107123387072590L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_83(9283, (3564053844471431863L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_84(26687, (3457606103583526636L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_85(26817, (4173830431160471159L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_86(9283, (3564053844471431863L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_87(26687, (3457606103583526636L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_433 = 0;
    lexical_cycle_419: while (true) {
    if (!((life7_433 < 4))) {
        break lexical_join_474;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_91(15563, (4596412142375492154L ^ life4_3)) - life7_433))), ((int)((life7_433 + __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_92(26337, (489239936214237189L ^ life4_3))))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_93(26687, (3457606103583526636L ^ life4_3)))), ((int)((__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_94(15563, (4596412142375492154L ^ life4_3)) - life7_433))), ((int)((life7_433 + __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_95(26337, (489239936214237189L ^ life4_3))))), ((int)((__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_96(15563, (4596412142375492154L ^ life4_3)) - life7_433))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_433 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_480;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_419; }
    break lexical_cycle_419;
    }
    }
    life7_433 = __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_100(22845, (3901456265180463043L ^ life4_3));
    }
    lexical_cycle_480: while (true) {
    if (!((life7_433 <= __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_101(26817, (4173830431160471159L ^ life4_3))))) {
        break lexical_join_508;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_103(2338, (7750813256848207809L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_104(9304, (2195301772142920383L ^ life4_3)))), ((int)(life7_433)), ((moom.G2)(p2)));
    life7_433 += 3;
    if (!((life6_5 != null))) {
        break lexical_join_722;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_480; }
    break lexical_cycle_480;
    }
    }
    lexicalValue785_531_0 = ((((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_106(17865, (4934726699446903606L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_107(26246, (2821107123387072590L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_108(17918, (3617897619283944247L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_109(15563, (4596412142375492154L ^ life4_3)))))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue785_632_0 = lexicalValue785_531_0;
        break lexical_join_632;
    }
    if (!((lexicalValue785_531_0 != 0))) {
        break lexical_join_722;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_112(26687, (3457606103583526636L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_113(26246, (2821107123387072590L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_114(16552, (4083533336099366525L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_115(15563, (4596412142375492154L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_119(26687, (3457606103583526636L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_120(26246, (2821107123387072590L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_121(4586, (5560189164321240923L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_122(17391, (3529279360261498144L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_123(15563, (4596412142375492154L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_125(26687, (3457606103583526636L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_126(9283, (3564053844471431863L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_127(26246, (2821107123387072590L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_128(4586, (5560189164321240923L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_129(9283, (3564053844471431863L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_130(26817, (4173830431160471159L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    lexicalValue785_632_0 = 0;
    }
    life7_662 = lexicalValue785_632_0;
    lexical_cycle_633: while (true) {
    if (!((life7_662 < 4))) {
        break lexical_join_690;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_134(30099, (3134368056248898431L ^ life4_3)) + life7_662))), ((int)((life7_662 + __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_135(26337, (489239936214237189L ^ life4_3))))), ((int)((__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_136(15563, (4596412142375492154L ^ life4_3)) - life7_662))), ((int)((__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_137(10075, (2615586803812680179L ^ life4_3)) - life7_662))), ((int)((life7_662 + __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_138(26337, (489239936214237189L ^ life4_3))))), ((int)((__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_139(15563, (4596412142375492154L ^ life4_3)) - life7_662))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_662 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_696;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_633; }
    break lexical_cycle_633;
    }
    }
    life7_662 = __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_143(26687, (3457606103583526636L ^ life4_3));
    }
    lexical_cycle_696: while (true) {
    if (!((life7_662 <= __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_144(4586, (5560189164321240923L ^ life4_3))))) {
        break lexical_join_722;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life7_662)), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_146(9304, (2195301772142920383L ^ life4_3)))), ((int)(__sourceIntrinsic_e66e16d6a5f8_invokedynamic785_147(26957, (7864210370876051372L ^ life4_3)))), ((moom.G2)(p2)));
    life7_662 += 3;
    if (!((life6_5 == null))) { continue lexical_cycle_696; }
    break lexical_cycle_696;
    }
    }
    return;
}


private void d(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue783_286_0;
    int lexicalValue783_550_0;
    int lexicalValue783_614_0;
    boolean spill783_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_109;
    int life7_193;
    int life7_397;
    int life7_647;
    lexical_join_658: {
    lexical_join_614: {
    lexical_join_550: {
    lexical_join_531: {
    lexical_join_502: {
    lexical_join_457: {
    lexical_join_433: {
    lexical_join_427: {
    lexical_join_286: {
    lexical_join_263: {
    lexical_join_242: {
    lexical_join_217: {
    lexical_join_180: {
    lexical_join_168: {
    lexical_join_148: {
    lexical_join_142: {
    life4_3 = (moom.Hz.t ^ 87727297185761L);
    life6_5 = moom.G4.b();
    spill783_0 = ((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_2(26687, (3457528526865401987L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_3(23108, (520081824964524790L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_4(375, (8299757924185334200L ^ life4_3)))));
    if (!((life6_5 != null))) {
        lexicalValue783_286_0 = ((spill783_0) ? 1 : 0);
        break lexical_join_286;
    }
    if (!(spill783_0)) {
        break lexical_join_263;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_7(26687, (3457528526865401987L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_8(23108, (520081824964524790L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_9(6793, (2709358477118241349L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_13(26687, (3457528526865401987L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_14(23108, (520081824964524790L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_15(28128, (299232393234648383L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_16(25886, (4479181514389063080L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_18(26687, (3457528526865401987L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_19(23108, (520081824964524790L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_20(23943, (5261161504512752963L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    life7_109 = 0;
    lexical_cycle_107: while (true) {
    if (!((life7_109 < 4))) {
        break lexical_join_142;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_109)), ((int)((life7_109 + 1))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_24(26687, (3457528526865401987L ^ life4_3)))), ((int)(life7_109)), ((int)((life7_109 + 1))), ((int)((__sourceIntrinsic_7340921e3271_invokedynamic783_25(25886, (4479181514389063080L ^ life4_3)) - life7_109))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_109 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_148;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_107; }
    break lexical_cycle_107;
    }
    }
    life7_109 = __sourceIntrinsic_7340921e3271_invokedynamic783_29(22845, (3901445778015238572L ^ life4_3));
    }
    lexical_cycle_148: while (true) {
    if (!((life7_109 < __sourceIntrinsic_7340921e3271_invokedynamic783_30(31267, (860735427715799702L ^ life4_3))))) {
        break lexical_join_168;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(5)), ((int)(5)), ((int)(life7_109)), ((moom.G2)(p2)));
    life7_109 += 3;
    if (!((life6_5 != null))) {
        break lexical_join_180;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_148; }
    break lexical_cycle_148;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_34(15820, (4398027675743706384L ^ life4_3)))), ((moom.G2)(p2)));
    }
    life7_193 = 0;
    lexical_cycle_182: while (true) {
    if (!((life7_193 < 4))) {
        break lexical_join_217;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_193)), ((int)((life7_193 + 1))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_36(26687, (3457528526865401987L ^ life4_3)))), ((int)(life7_193)), ((int)((life7_193 + 1))), ((int)((__sourceIntrinsic_7340921e3271_invokedynamic783_37(25886, (4479181514389063080L ^ life4_3)) - life7_193))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_193 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_242;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_182; }
    break lexical_cycle_182;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_41(3926, (7472241414862729169L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_42(23108, (520081824964524790L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_43(3926, (7472241414862729169L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_47(651, (6960841866738524760L ^ life4_3)))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_48(31267, (860735427715799702L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    }
    lexicalValue783_286_0 = ((((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_52(28486, (1358054491905986515L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_53(26687, (3457528526865401987L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_54(12585, (7585799608020193699L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_55(12585, (7585799608020193699L ^ life4_3)))))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue783_550_0 = lexicalValue783_286_0;
        break lexical_join_550;
    }
    if (!((lexicalValue783_286_0 != 0))) {
        break lexical_join_531;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_58(28486, (1358054491905986515L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_59(26687, (3457528526865401987L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_60(25886, (4479181514389063080L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_61(25886, (4479181514389063080L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_65(28486, (1358054491905986515L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_66(26687, (3457528526865401987L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_67(25886, (4479181514389063080L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_68(28128, (299232393234648383L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_69(25886, (4479181514389063080L ^ life4_3)))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_71(28486, (1358054491905986515L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_72(26687, (3457528526865401987L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_73(31267, (860735427715799702L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_74(31267, (860735427715799702L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    life7_397 = 0;
    lexical_cycle_380: while (true) {
    if (!((life7_397 < 4))) {
        break lexical_join_427;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_7340921e3271_invokedynamic783_78(25886, (4479181514389063080L ^ life4_3)) - life7_397))), ((int)((life7_397 + 1))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_79(26687, (3457528526865401987L ^ life4_3)))), ((int)((__sourceIntrinsic_7340921e3271_invokedynamic783_80(25886, (4479181514389063080L ^ life4_3)) - life7_397))), ((int)((life7_397 + 1))), ((int)((__sourceIntrinsic_7340921e3271_invokedynamic783_81(25886, (4479181514389063080L ^ life4_3)) - life7_397))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_397 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_433;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_380; }
    break lexical_cycle_380;
    }
    }
    life7_397 = __sourceIntrinsic_7340921e3271_invokedynamic783_85(22845, (3901445778015238572L ^ life4_3));
    }
    lexical_cycle_433: while (true) {
    if (!((life7_397 < __sourceIntrinsic_7340921e3271_invokedynamic783_86(31267, (860735427715799702L ^ life4_3))))) {
        break lexical_join_457;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_88(3926, (7472241414862729169L ^ life4_3)))), ((int)(5)), ((int)(life7_397)), ((moom.G2)(p2)));
    life7_397 += 3;
    if (!((life6_5 != null))) {
        break lexical_join_502;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_433; }
    break lexical_cycle_433;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_91(3926, (7472241414862729169L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_92(3926, (7472241414862729169L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_94(28486, (1358054491905986515L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_95(3926, (7472241414862729169L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_96(31267, (860735427715799702L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_97(3926, (7472241414862729169L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_101(3926, (7472241414862729169L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_102(28486, (1358054491905986515L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_103(3926, (7472241414862729169L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_104(31267, (860735427715799702L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    }
    lexicalValue783_550_0 = ((((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_108(28486, (1358054491905986515L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_109(25886, (4479181514389063080L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_110(25886, (4479181514389063080L ^ life4_3)))))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        lexicalValue783_614_0 = lexicalValue783_550_0;
        break lexical_join_614;
    }
    if (!((lexicalValue783_550_0 != 0))) {
        break lexical_join_658;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_113(28128, (299232393234648383L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_114(28486, (1358054491905986515L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_115(24906, (2273018304956006800L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_116(25886, (4479181514389063080L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_120(28128, (299232393234648383L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_121(28486, (1358054491905986515L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_122(17392, (7865121342153892698L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_123(28997, (606823980656824707L ^ life4_3)))), ((int)(__sourceIntrinsic_7340921e3271_invokedynamic783_124(25886, (4479181514389063080L ^ life4_3)))), ((boolean)(false)));
    lexicalValue783_614_0 = 0;
    }
    life7_647 = lexicalValue783_614_0;
    lexical_cycle_615: while (true) {
    if (!((life7_647 < 4))) {
        break lexical_join_658;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((life7_647 + 1))), ((int)((life7_647 + 1))), ((int)((__sourceIntrinsic_7340921e3271_invokedynamic783_126(25886, (4479181514389063080L ^ life4_3)) - life7_647))), ((int)((__sourceIntrinsic_7340921e3271_invokedynamic783_127(16289, (2773906566318841708L ^ life4_3)) - life7_647))), ((int)((life7_647 + 1))), ((int)((__sourceIntrinsic_7340921e3271_invokedynamic783_128(25886, (4479181514389063080L ^ life4_3)) - life7_647))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life7_647 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_615; }
    break lexical_cycle_615;
    }
    }
    return;
}


private void a(boolean p0, int p1, net.minecraft.world.World p2, java.util.Random p3, moom.G2 p4) {
int lexicalValue779_81_0;
    int lexicalValue779_515_0;
    int lexicalValue779_517_0;
    int lexicalValue779_527_0;
    int lexicalValue779_533_0;
    int lexicalValue779_618_0;
    int lexicalValue779_622_0;
    net.minecraft.entity.Entity[] spill779_0;
    boolean spill779_1;
    boolean spill779_2;
    boolean spill779_3;
    boolean spill779_4;
    long life6_3;
    int life9_10;
    net.minecraft.entity.Entity[] life8_11;
    int life10_87;
    int life10_531;
    int life11_552;
    int life12_558;
    int life13_661;
    lexical_join_716: {
    lexical_join_679: {
    lexical_join_634: {
    lexical_join_584: {
    lexical_join_582: {
    lexical_join_562: {
    lexical_join_556: {
    lexical_join_533: {
    lexical_join_527: {
    lexical_join_526: {
    lexical_join_517: {
    lexical_join_515: {
    lexical_join_514: {
    lexical_join_502: {
    lexical_join_312: {
    lexical_join_81: {
    life6_3 = (moom.Hz.t ^ 63098478120763L);
    spill779_0 = moom.G4.b();
    life9_10 = __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_2(22569, (8504355268882870359L ^ life6_3));
    life8_11 = spill779_0;
    spill779_1 = ((moom.Hz)(this)).a(((moom.G2)(p4)), ((int)(p1)), ((int)(0)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_3(22845, (3901470679298912630L ^ life6_3))))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_4(22146, (3649147209210347185L ^ life6_3)))));
    if (!((life8_11 != null))) {
        lexicalValue779_81_0 = ((spill779_1) ? 1 : 0);
        break lexical_join_81;
    }
    if (!(spill779_1)) {
        break lexical_join_716;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)(p1)), ((int)(0)), ((int)(0)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_7(10995, (3273510923020944125L ^ life6_3))))), ((int)(0)), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_8(22146, (3649147209210347185L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)(p1)), ((int)(1)), ((int)(0)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_12(10995, (3273510923020944125L ^ life6_3))))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_13(28212, (2048786906851903066L ^ life6_3)))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_14(22146, (3649147209210347185L ^ life6_3)))), ((boolean)(false)));
    lexicalValue779_81_0 = 0;
    }
    life10_87 = lexicalValue779_81_0;
    lexical_cycle_82: while (true) {
    if (!((life10_87 < 4))) {
        break lexical_join_312;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)((p1 + life10_87))), ((int)((life10_87 + 1))), ((int)(life10_87)), ((int)((p1 + life10_87))), ((int)((life10_87 + 1))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_16(22146, (3649147209210347185L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)(((p1 + life10_87) + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_20(25054, (7973675941404215713L ^ life6_3))))), ((int)((life10_87 + 5))), ((int)((life10_87 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_21(28128, (299314468586227173L ^ life6_3))))), ((int)(((p1 + life10_87) + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_22(28128, (299314468586227173L ^ life6_3))))), ((int)((life10_87 + 5))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_23(22146, (3649147209210347185L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)(((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_27(4634, (5874880133293636211L ^ life6_3))) - life10_87))), ((int)((life10_87 + 5))), ((int)((life10_87 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_28(28128, (299314468586227173L ^ life6_3))))), ((int)(((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_29(28703, (5226998636555442268L ^ life6_3))) - life10_87))), ((int)((life10_87 + 5))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_30(22146, (3649147209210347185L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)(((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_34(10995, (3273510923020944125L ^ life6_3))) - life10_87))), ((int)((life10_87 + 1))), ((int)(life10_87)), ((int)(((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_35(10995, (3273510923020944125L ^ life6_3))) - life10_87))), ((int)((life10_87 + 1))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_36(22146, (3649147209210347185L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)(((p1 + life10_87) + 1))), ((int)((life10_87 + 1))), ((int)(life10_87)), ((int)(((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_40(22845, (3901470679298912630L ^ life6_3))) - life10_87))), ((int)((life10_87 + 1))), ((int)(life10_87)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)(((p1 + life10_87) + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_44(19243, (1971330765881811756L ^ life6_3))))), ((int)((life10_87 + 5))), ((int)((life10_87 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_45(28128, (299314468586227173L ^ life6_3))))), ((int)(((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_46(13350, (7076844071490608253L ^ life6_3))) - life10_87))), ((int)((life10_87 + 5))), ((int)((life10_87 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_47(28128, (299314468586227173L ^ life6_3))))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    life10_87 += 1;
    if (!((life8_11 != null))) {
        break lexical_join_502;
    }
    if (!((life8_11 == null))) { continue lexical_cycle_82; }
    break lexical_cycle_82;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)((p1 + 4))), ((int)(4)), ((int)(4)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_51(32531, (5649549941763053424L ^ life6_3))))), ((int)(4)), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_52(22146, (3649147209210347185L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_56(28128, (299314468586227173L ^ life6_3))))), ((int)(4)), ((int)(4)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_57(28703, (5226998636555442268L ^ life6_3))))), ((int)(4)), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_58(23108, (520100889383973420L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_62(18494, (189147002025025589L ^ life6_3))))), ((int)(4)), ((int)(4)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_63(22146, (3649147209210347185L ^ life6_3))))), ((int)(4)), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_64(22146, (3649147209210347185L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_68(5695, (3032819909950242350L ^ life6_3))))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_69(25276, (6242324837515201155L ^ life6_3)))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_70(24738, (9079479737031723253L ^ life6_3)))), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_71(9304, (2195302991431879690L ^ life6_3))))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_72(25276, (6242324837515201155L ^ life6_3)))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_73(22146, (3649147209210347185L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_78(9283, (3564070457905695746L ^ life6_3))))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_79(26337, (489254109103722160L ^ life6_3)))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_80(9283, (3564070457905695746L ^ life6_3)))), ((moom.G2)(p4)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_83(9283, (3564070457905695746L ^ life6_3))))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_84(26337, (489254109103722160L ^ life6_3)))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_85(30099, (3134377831156882890L ^ life6_3)))), ((moom.G2)(p4)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_88(9283, (3564070457905695746L ^ life6_3))))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_89(26337, (489254109103722160L ^ life6_3)))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_90(18494, (189147002025025589L ^ life6_3)))), ((moom.G2)(p4)));
    }
    spill779_2 = p0;
    if (!((life8_11 != null))) {
        lexicalValue779_515_0 = ((spill779_2) ? 1 : 0);
        break lexical_join_515;
    }
    if (!(spill779_2)) {
        break lexical_join_514;
    }
    lexicalValue779_517_0 = (p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_93(25670, (2652778975721491581L ^ life6_3)));
    break lexical_join_517;
    }
    lexicalValue779_515_0 = p1;
    }
    lexicalValue779_517_0 = (lexicalValue779_515_0 + 5);
    }
    life10_531 = lexicalValue779_517_0;
    spill779_3 = p0;
    if (!((life8_11 != null))) {
        lexicalValue779_527_0 = ((spill779_3) ? 1 : 0);
        break lexical_join_527;
    }
    if (!(spill779_3)) {
        break lexical_join_526;
    }
    lexicalValue779_533_0 = (p1 + 5);
    break lexical_join_533;
    }
    lexicalValue779_527_0 = p1;
    }
    lexicalValue779_533_0 = (lexicalValue779_527_0 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_95(25670, (2652778975721491581L ^ life6_3)));
    }
    life11_552 = lexicalValue779_533_0;
    life12_558 = __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_96(22146, (3649147209210347185L ^ life6_3));
    lexical_cycle_540: while (true) {
    if (!((life12_558 >= 5))) {
        break lexical_join_556;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life10_531)), ((int)(5)), ((int)(life12_558)), ((moom.G2)(p4)));
    life12_558 += -3;
    if (!((life8_11 != null))) {
        break lexical_join_562;
    }
    if (!((life8_11 == null))) { continue lexical_cycle_540; }
    break lexical_cycle_540;
    }
    }
    life12_558 = __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_99(25670, (2652778975721491581L ^ life6_3));
    }
    lexical_cycle_562: while (true) {
    if (!((life12_558 >= __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_100(28128, (299314468586227173L ^ life6_3))))) {
        break lexical_join_582;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life11_552)), ((int)(5)), ((int)(life12_558)), ((moom.G2)(p4)));
    life12_558 += -3;
    if (!((life8_11 != null))) {
        break lexical_join_584;
    }
    if (!((life8_11 == null))) { continue lexical_cycle_562; }
    break lexical_cycle_562;
    }
    }
    life12_558 = 0;
    }
    lexical_cycle_584: while (true) {
    lexical_join_622: {
    lexical_join_618: {
    lexical_join_611: {
    if (!((life12_558 < 4))) {
        break lexical_join_634;
    }
    if (!((life8_11 != null))) {
        break lexical_join_679;
    }
    spill779_4 = p0;
    if (!((life8_11 != null))) {
        lexicalValue779_618_0 = ((spill779_4) ? 1 : 0);
        break lexical_join_618;
    }
    if (!(spill779_4)) {
        break lexical_join_611;
    }
    lexicalValue779_622_0 = (p1 + (__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_104(10995, (3273510923020944125L ^ life6_3)) - (__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_105(28703, (5226998636555442268L ^ life6_3)) - (life12_558 * 3))));
    break lexical_join_622;
    }
    lexicalValue779_618_0 = (p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_106(28703, (5226998636555442268L ^ life6_3)));
    }
    lexicalValue779_622_0 = (lexicalValue779_618_0 - (life12_558 * 3));
    }
    life13_661 = lexicalValue779_622_0;
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life13_661)), ((int)(5)), ((int)(5)), ((moom.G2)(p4)));
    life12_558 += 1;
    if (!((life8_11 == null))) { continue lexical_cycle_584; }
    break lexical_cycle_584;
    }
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((net.minecraft.block.state.IBlockState)(moom.Hz.h)), ((int)(life11_552)), ((int)(5)), ((int)(5)), ((moom.G2)(p4)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_111(24738, (9079479737031723253L ^ life6_3))))), ((int)(1)), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_112(9283, (3564070457905695746L ^ life6_3)))), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_113(9304, (2195302991431879690L ^ life6_3))))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_114(28128, (299314468586227173L ^ life6_3)))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_115(9283, (3564070457905695746L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p2)), ((moom.G2)(p4)), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_119(9283, (3564070457905695746L ^ life6_3))))), ((int)(1)), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_120(24738, (9079479737031723253L ^ life6_3)))), ((int)((p1 + __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_121(9283, (3564070457905695746L ^ life6_3))))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_122(28128, (299314468586227173L ^ life6_3)))), ((int)(__sourceIntrinsic_8a98d2e70ef9_invokedynamic779_123(9304, (2195302991431879690L ^ life6_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    }
    return;
}


private java.util.List<moom.Il> a(java.util.Random p0) {
int forestValue283_48_0;
    int forestValue283_82_0;
    int forestValue283_121_0;
    int forestValue283_123_0;
    int forestValue283_135_0;
    int forestValue283_191_0;
    int forestValue283_195_0;
    int forestValue283_200_0;
    int forestValue283_204_0;
    int forestValue283_210_0;
    int forestValue283_210_1;
    moom.Il forestValue283_256_0;
    moom.Il forestValue283_433_0;
    int forestValue283_457_0;
    int forestValue283_457_1;
    int forestValue283_473_0;
    int forestValue283_485_0;
    moom.Il forestValue283_528_0;
    int forestValue283_547_0;
    net.minecraft.entity.Entity[] spill283_0;
    int spill283_1;
    int spill283_2;
    int spill283_3;
    int spill283_4;
    moom.Il spill283_5;
    int spill283_6;
    int spill283_7;
    int spill283_8;
    moom.Il spill283_9;
    int spill283_10;
    int spill283_11;
    int spill283_12;
    boolean spill283_13;
    moom.Il spill283_14;
    moom.Il spill283_15;
    long life2_3;
    moom.Il[] life5_11;
    int life6_13;
    net.minecraft.entity.Entity[] life4_14;
    int life7_21;
    int life8_26;
    int life9_31;
    int life6_49;
    int life7_56;
    int life8_61;
    int life9_66;
    int life6_84;
    int life7_91;
    int life8_96;
    int life9_101;
    int life6_124;
    int life7_129;
    int life8_136;
    int life9_144;
    moom.bs[] life10_156;
    int life11_159;
    int life12_161;
    moom.bs life13_168;
    int life14_173;
    int life15_178;
    int life16_183;
    int life17_227;
    moom.Il life6_285;
    moom.Il life7_300;
    moom.Il life8_315;
    java.util.ArrayList life9_421;
    moom.Il[] life10_423;
    int life11_426;
    int life12_428;
    moom.Il life13_435;
    int life10_460;
    java.util.Iterator life11_463;
    moom.Il life12_470;
    int life13_472;
    int life14_476;
    int life15_497;
    int life16_511;
    forest_join_547: {
    forest_join_536: {
    forest_join_433: {
    forest_join_432: {
    forest_join_256: {
    forest_join_253: {
    forest_join_121: {
    forest_join_115: {
    forest_join_82: {
    forest_join_81: {
    forest_join_48: {
    forest_join_47: {
    life2_3 = (moom.Hz.t ^ 83369264682644L);
    spill283_0 = moom.G4.b();
    life5_11 = new moom.Il[__sourceIntrinsic_b4d8d8845656_invokedynamic283_2(21367, (5109408440707343000L ^ life2_3))];
    life6_13 = 0;
    life4_14 = spill283_0;
    forest_cycle_15: while (true) {
    forest_join_45: {
    forest_join_44: {
    if (!((life6_13 < 5))) {
        break forest_join_47;
    }
    spill283_1 = 0;
    if (!((life4_14 != null))) {
        forestValue283_48_0 = spill283_1;
        break forest_join_48;
    }
    life7_21 = spill283_1;
    forest_cycle_22: while (true) {
    if (!((life7_21 < 4))) {
        break forest_join_44;
    }
    life8_26 = 0;
    life9_31 = __sourceExactCall_3f00afd7c1d4df(((int)(life6_13)), ((int)(life8_26)), ((int)(life7_21)));
    (life5_11)[life9_31] = new moom.Il(life9_31);
    life7_21 += 1;
    if (!((life4_14 != null))) {
        break forest_join_45;
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_22;
    }
    break forest_cycle_22;
    }
    }
    life6_13 += 1;
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    forestValue283_48_0 = 0;
    }
    life6_49 = forestValue283_48_0;
    forest_cycle_49: while (true) {
    forest_join_79: {
    forest_join_78: {
    if (!((life6_49 < 5))) {
        break forest_join_81;
    }
    spill283_2 = 0;
    if (!((life4_14 != null))) {
        forestValue283_82_0 = spill283_2;
        break forest_join_82;
    }
    life7_56 = spill283_2;
    forest_cycle_56: while (true) {
    if (!((life7_56 < 4))) {
        break forest_join_78;
    }
    life8_61 = 1;
    life9_66 = __sourceExactCall_3f00afd7c1d4df(((int)(life6_49)), ((int)(life8_61)), ((int)(life7_56)));
    (life5_11)[life9_66] = new moom.Il(life9_66);
    life7_56 += 1;
    if (!((life4_14 != null))) {
        break forest_join_79;
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    }
    life6_49 += 1;
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    }
    forestValue283_82_0 = 1;
    }
    life6_84 = forestValue283_82_0;
    forest_cycle_83: while (true) {
    forest_join_113: {
    forest_join_112: {
    if (!((life6_84 < 4))) {
        break forest_join_115;
    }
    spill283_3 = 0;
    if (!((life4_14 != null))) {
        forestValue283_121_0 = spill283_3;
        break forest_join_121;
    }
    life7_91 = spill283_3;
    forest_cycle_90: while (true) {
    if (!((life7_91 < 2))) {
        break forest_join_112;
    }
    life8_96 = 2;
    life9_101 = __sourceExactCall_3f00afd7c1d4df(((int)(life6_84)), ((int)(life8_96)), ((int)(life7_91)));
    (life5_11)[life9_101] = new moom.Il(life9_101);
    life7_91 += 1;
    if (!((life4_14 != null))) {
        break forest_join_113;
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_90;
    }
    break forest_cycle_90;
    }
    }
    life6_84 += 1;
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_83;
    }
    break forest_cycle_83;
    }
    }
    this.p = ((moom.Il)((life5_11)[moom.Hz.k]));
    forestValue283_121_0 = 0;
    }
    life6_124 = forestValue283_121_0;
    forest_cycle_122: while (true) {
    forest_join_250: {
    forestValue283_123_0 = life6_124;
    forest_cycle_123: while (true) {
    if (!((forestValue283_123_0 < 5))) {
        break forest_join_253;
    }
    life7_129 = 0;
    forest_cycle_127: while (true) {
    forest_join_247: {
    if (!((life7_129 < 5))) {
        break forest_join_250;
    }
    spill283_4 = 0;
    if (!((life4_14 != null))) {
        forestValue283_123_0 = spill283_4;
        continue forest_cycle_123;
    }
    life8_136 = spill283_4;
    forest_cycle_134: while (true) {
    forest_join_245: {
    forest_join_244: {
    forestValue283_135_0 = life8_136;
    forest_cycle_135: while (true) {
    if (!((forestValue283_135_0 < 3))) {
        break forest_join_247;
    }
    life9_144 = __sourceExactCall_3f00afd7c1d4df(((int)(life6_124)), ((int)(life8_136)), ((int)(life7_129)));
    if (!((life4_14 != null))) {
        break forest_join_245;
    }
    spill283_5 = (life5_11)[life9_144];
    if (!((life4_14 != null))) {
        forestValue283_256_0 = spill283_5;
        break forest_join_256;
    }
    if (!((spill283_5 != null))) {
        break forest_join_244;
    }
    life10_156 = moom.bs.values();
    life11_159 = (life10_156).length;
    life12_161 = 0;
    forest_cycle_157: while (true) {
    forest_join_242: {
    forest_join_241: {
    forest_join_233: {
    forest_join_210: {
    forest_join_204: {
    forest_join_200: {
    forest_join_195: {
    forest_join_191: {
    if (!((life12_161 < life11_159))) {
        break forest_join_244;
    }
    life13_168 = (life10_156)[life12_161];
    life14_173 = (life6_124 + ((moom.bs)(life13_168)).c());
    life15_178 = (life8_136 + ((moom.bs)(life13_168)).d());
    life16_183 = (life7_129 + ((moom.bs)(life13_168)).e());
    if (!((life4_14 != null))) {
        break forest_join_242;
    }
    spill283_6 = life14_173;
    if (!((life4_14 != null))) {
        forestValue283_135_0 = spill283_6;
        continue forest_cycle_135;
    }
    if (!((spill283_6 >= 0))) {
        break forest_join_241;
    }
    spill283_7 = life14_173;
    if (!((life4_14 != null))) {
        forestValue283_191_0 = spill283_7;
        break forest_join_191;
    }
    if (!((spill283_7 < 5))) {
        break forest_join_241;
    }
    forestValue283_191_0 = life16_183;
    }
    if (!((life4_14 != null))) {
        forestValue283_195_0 = forestValue283_191_0;
        break forest_join_195;
    }
    if (!((forestValue283_191_0 >= 0))) {
        break forest_join_241;
    }
    forestValue283_195_0 = life16_183;
    }
    if (!((life4_14 != null))) {
        forestValue283_200_0 = forestValue283_195_0;
        break forest_join_200;
    }
    if (!((forestValue283_195_0 < 5))) {
        break forest_join_241;
    }
    forestValue283_200_0 = life15_178;
    }
    if (!((life4_14 != null))) {
        forestValue283_204_0 = forestValue283_200_0;
        break forest_join_204;
    }
    if (!((forestValue283_200_0 >= 0))) {
        break forest_join_241;
    }
    forestValue283_204_0 = life15_178;
    }
    spill283_8 = 3;
    if (!((life4_14 != null))) {
        forestValue283_210_0 = forestValue283_204_0;
        forestValue283_210_1 = spill283_8;
        break forest_join_210;
    }
    if (!((forestValue283_204_0 < spill283_8))) {
        break forest_join_241;
    }
    forestValue283_210_0 = life14_173;
    forestValue283_210_1 = life15_178;
    }
    life17_227 = __sourceExactCall_3f00afd7c1d4df(((int)(forestValue283_210_0)), ((int)(forestValue283_210_1)), ((int)(life16_183)));
    if (!((life4_14 != null))) {
        break forest_join_242;
    }
    if (!(((life5_11)[life17_227] != null))) {
        break forest_join_241;
    }
    if (!((life16_183 != life7_129))) {
        break forest_join_233;
    }
    ((moom.Il)((life5_11)[life9_144])).a(((moom.bs)(((moom.bs)(life13_168)).a__bs())), ((moom.Il)((life5_11)[life17_227])));
    if (!((life4_14 == null))) {
        break forest_join_241;
    }
    }
    ((moom.Il)((life5_11)[life9_144])).a(((moom.bs)(life13_168)), ((moom.Il)((life5_11)[life17_227])));
    }
    life12_161 += 1;
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_157;
    }
    break forest_cycle_157;
    }
    break forest_cycle_135;
    }
    }
    life8_136 += 1;
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_134;
    }
    break forest_cycle_134;
    }
    }
    life7_129 += 1;
    if (!((life4_14 == null))) {
        continue forest_cycle_127;
    }
    break forest_cycle_127;
    }
    break forest_cycle_123;
    }
    }
    life6_124 += 1;
    if (!((life4_14 == null))) {
        continue forest_cycle_122;
    }
    break forest_cycle_122;
    }
    }
    forestValue283_256_0 = (life5_11)[moom.Hz.l];
    }
    ((moom.Il)(forestValue283_256_0)).a(((moom.bs)(moom.bs.UP)), ((moom.Il)((life6_285 = new moom.Il(__sourceIntrinsic_b4d8d8845656_invokedynamic283_19(20301, (3794164378479951549L ^ life2_3)))))));
    ((moom.Il)((life5_11)[moom.Hz.m])).a(((moom.bs)(moom.bs.SOUTH)), ((moom.Il)((life7_300 = new moom.Il(__sourceIntrinsic_b4d8d8845656_invokedynamic283_23(13783, (1843949617731568759L ^ life2_3)))))));
    ((moom.Il)((life5_11)[moom.Hz.n])).a(((moom.bs)(moom.bs.SOUTH)), ((moom.Il)((life8_315 = new moom.Il(__sourceIntrinsic_b4d8d8845656_invokedynamic283_27(11532, (2833036429488299153L ^ life2_3)))))));
    ((moom.Il)(life6_285)).d = ((boolean)(true));
    ((moom.Il)(life7_300)).d = ((boolean)(true));
    ((moom.Il)(life8_315)).d = ((boolean)(true));
    ((moom.Il)(this.p)).e = ((boolean)(true));
    this.q = ((moom.Il)((life5_11)[__sourceExactCall_3f00afd7c1d4df(((int)(((java.util.Random)(p0)).nextInt(((int)(4))))), ((int)(0)), ((int)(2)))]));
    ((moom.Il)(this.q)).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)(this.q)).b)[((moom.bs)(moom.bs.EAST)).a()])).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)(this.q)).b)[((moom.bs)(moom.bs.NORTH)).a()])).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)((((moom.Il)(this.q)).b)[((moom.bs)(moom.bs.EAST)).a()])).b)[((moom.bs)(moom.bs.NORTH)).a()])).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)(this.q)).b)[((moom.bs)(moom.bs.UP)).a()])).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)((((moom.Il)(this.q)).b)[((moom.bs)(moom.bs.EAST)).a()])).b)[((moom.bs)(moom.bs.UP)).a()])).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)((((moom.Il)(this.q)).b)[((moom.bs)(moom.bs.NORTH)).a()])).b)[((moom.bs)(moom.bs.UP)).a()])).d = ((boolean)(true));
    ((moom.Il)((((moom.Il)((((moom.Il)((((moom.Il)(this.q)).b)[((moom.bs)(moom.bs.EAST)).a()])).b)[((moom.bs)(moom.bs.NORTH)).a()])).b)[((moom.bs)(moom.bs.UP)).a()])).d = ((boolean)(true));
    life9_421 = com.google.common.collect.Lists.newArrayList();
    life10_423 = life5_11;
    life11_426 = (life10_423).length;
    life12_428 = 0;
    forest_cycle_410: while (true) {
    forest_join_430: {
    forest_join_429: {
    if (!((life12_428 < life11_426))) {
        break forest_join_432;
    }
    life13_435 = (life10_423)[life12_428];
    if (!((life4_14 != null))) {
        break forest_join_430;
    }
    spill283_9 = life13_435;
    if (!((life4_14 != null))) {
        forestValue283_433_0 = spill283_9;
        break forest_join_433;
    }
    if (!((spill283_9 != null))) {
        break forest_join_429;
    }
    ((moom.Il)(life13_435)).a__Void();
    ((java.util.List)(life9_421)).add(((java.lang.Object)(life13_435)));
    }
    life12_428 += 1;
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_410;
    }
    break forest_cycle_410;
    }
    }
    forestValue283_433_0 = life6_285;
    }
    ((moom.Il)(forestValue283_433_0)).a__Void();
    java.util.Collections.shuffle(((java.util.List)(life9_421)), ((java.util.Random)(p0)));
    life10_460 = 1;
    life11_463 = ((java.util.List)(life9_421)).iterator();
    forest_cycle_442: while (true) {
    forest_join_534: {
    if (!(((java.util.Iterator)(life11_463)).hasNext())) {
        break forest_join_536;
    }
    life12_470 = ((moom.Il)(((java.util.Iterator)(life11_463)).next()));
    life13_472 = 0;
    spill283_10 = 0;
    if (!((life4_14 != null))) {
        forestValue283_547_0 = spill283_10;
        break forest_join_547;
    }
    life14_476 = spill283_10;
    forest_cycle_455: while (true) {
    forest_join_532: {
    forest_join_528: {
    forest_join_519: {
    forest_join_485: {
    forest_join_473: {
    forestValue283_457_0 = life13_472;
    forestValue283_457_1 = 2;
    forest_cycle_457: while (true) {
    if (!((forestValue283_457_0 < forestValue283_457_1))) {
        break forest_join_534;
    }
    spill283_11 = life14_476;
    if (!((life4_14 != null))) {
        forestValue283_473_0 = spill283_11;
        break forest_join_473;
    }
    spill283_12 = 5;
    if (!((life4_14 != null))) {
        forestValue283_457_0 = spill283_11;
        forestValue283_457_1 = spill283_12;
        continue forest_cycle_457;
    }
    break forest_cycle_457;
    }
    if (!((spill283_11 < spill283_12))) {
        break forest_join_534;
    }
    life14_476 += 1;
    forestValue283_473_0 = ((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_b4d8d8845656_invokedynamic283_98(23108, (520086254938712963L ^ life2_3)))));
    }
    life15_497 = forestValue283_473_0;
    spill283_13 = (((moom.Il)(life12_470)).c)[life15_497];
    if (!((life4_14 != null))) {
        forestValue283_485_0 = ((spill283_13) ? 1 : 0);
        break forest_join_485;
    }
    if (!(spill283_13)) {
        break forest_join_532;
    }
    forestValue283_485_0 = ((moom.bs)(((moom.bs)(__sourceExactCall_e942200b9dad46(((int)(life15_497))))).a__bs())).a();
    }
    life16_511 = forestValue283_485_0;
    (((moom.Il)(life12_470)).c)[life15_497] = ((0) != 0);
    (((moom.Il)((((moom.Il)(life12_470)).b)[life15_497])).c)[life16_511] = ((0) != 0);
    spill283_14 = life12_470;
    if (!((life4_14 != null))) {
        forestValue283_528_0 = spill283_14;
        break forest_join_528;
    }
    if (!(((moom.Il)(spill283_14)).a(((int)((life10_460++)))))) {
        break forest_join_519;
    }
    spill283_15 = (((moom.Il)(life12_470)).b)[life15_497];
    if (!((life4_14 != null))) {
        forestValue283_528_0 = spill283_15;
        break forest_join_528;
    }
    if (!(((moom.Il)(spill283_15)).a(((int)((life10_460++)))))) {
        break forest_join_519;
    }
    life13_472 += 1;
    if (!((life4_14 == null))) {
        break forest_join_532;
    }
    }
    (((moom.Il)(life12_470)).c)[life15_497] = ((1) != 0);
    forestValue283_528_0 = (((moom.Il)(life12_470)).b)[life15_497];
    }
    (((moom.Il)(forestValue283_528_0)).c)[life16_511] = ((1) != 0);
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_455;
    }
    break forest_cycle_455;
    }
    }
    if (!((life4_14 == null))) {
        continue forest_cycle_442;
    }
    break forest_cycle_442;
    }
    }
    ((java.util.List)(life9_421)).add(((java.lang.Object)(life6_285)));
    ((java.util.List)(life9_421)).add(((java.lang.Object)(life7_300)));
    forestValue283_547_0 = ((((java.util.List)(life9_421)).add(((java.lang.Object)(life8_315)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue283_547_0);
    return life9_421;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forestValue675_89_0;
    int forestValue675_129_0;
    int forestValue675_129_1;
    int forestValue675_130_0;
    int forestValue675_184_0;
    int forestValue675_188_0;
    int forestValue675_204_0;
    moom.Hz forestValue675_344_0;
    int forestValue675_368_0;
    int forestValue675_372_0;
    net.minecraft.entity.Entity[] spill675_0;
    int spill675_1;
    int spill675_2;
    int spill675_3;
    int spill675_4;
    int spill675_5;
    moom.Hz spill675_6;
    boolean spill675_7;
    long life4_3;
    int life7_16;
    net.minecraft.entity.Entity[] life6_60;
    int life8_87;
    int life9_98;
    int life10_133;
    int life11_141;
    int life12_143;
    int life13_150;
    int life8_211;
    java.util.Iterator life8_354;
    moom.Hs life9_361;
    forest_join_372: {
    forest_join_371: {
    forest_join_344: {
    forest_join_343: {
    forest_join_204: {
    forest_join_203: {
    life4_3 = (moom.Hz.t ^ 14186417228157L);
    life7_16 = (java.lang.Math.max(((int)(((net.minecraft.world.World)(p0)).c())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic675_2(14658, (7992833472024876912L ^ life4_3))))) - ((moom.G2)(this.a)).b);
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic675_6(12585, (7585873371702337343L ^ life4_3)))), ((int)(life7_16)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic675_7(12585, (7585873371702337343L ^ life4_3)))), ((boolean)(false)));
    spill675_0 = moom.G4.b();
    ((moom.Hz)(this)).a(((boolean)(false)), ((int)(0)), ((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((boolean)(true)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic675_11(25177, (1278948935255346286L ^ life4_3)))), ((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)));
    life6_60 = spill675_0;
    ((moom.Hz)(this)).b(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)));
    ((moom.Hz)(this)).c(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)));
    ((moom.Hz)(this)).d(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)));
    ((moom.Hz)(this)).e(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)));
    ((moom.Hz)(this)).f(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)));
    life8_87 = 0;
    forest_cycle_88: while (true) {
    forest_join_200: {
    forestValue675_89_0 = life8_87;
    forest_cycle_89: while (true) {
    if (!((forestValue675_89_0 < __sourceIntrinsic_5ac1d031d896_invokedynamic675_19(28128, (299301806116455331L ^ life4_3))))) {
        break forest_join_203;
    }
    spill675_1 = 0;
    if (!((life6_60 != null))) {
        forestValue675_204_0 = spill675_1;
        break forest_join_204;
    }
    life9_98 = spill675_1;
    forest_cycle_99: while (true) {
    forest_join_198: {
    forest_join_197: {
    forest_join_188: {
    forest_join_184: {
    forest_join_183: {
    forest_join_130: {
    forest_join_129: {
    forest_join_123: {
    if (!((life9_98 < __sourceIntrinsic_5ac1d031d896_invokedynamic675_20(28128, (299301806116455331L ^ life4_3))))) {
        break forest_join_200;
    }
    spill675_2 = life9_98;
    if (!((life6_60 != null))) {
        forestValue675_89_0 = spill675_2;
        continue forest_cycle_89;
    }
    if (!((life6_60 != null))) {
        forestValue675_130_0 = spill675_2;
        break forest_join_130;
    }
    if (!((spill675_2 == 0))) {
        break forest_join_123;
    }
    spill675_3 = life8_87;
    spill675_4 = 3;
    if (!((life6_60 != null))) {
        forestValue675_129_0 = spill675_3;
        forestValue675_129_1 = spill675_4;
        break forest_join_129;
    }
    if (!((spill675_3 == spill675_4))) {
        break forest_join_123;
    }
    life9_98 = __sourceIntrinsic_5ac1d031d896_invokedynamic675_21(23108, (520148734346753130L ^ life4_3));
    }
    forestValue675_129_0 = life8_87;
    forestValue675_129_1 = __sourceIntrinsic_5ac1d031d896_invokedynamic675_22(26337, (489233752132995318L ^ life4_3));
    }
    forestValue675_130_0 = (forestValue675_129_0 * forestValue675_129_1);
    }
    life10_133 = forestValue675_130_0;
    life11_141 = (life9_98 * __sourceIntrinsic_5ac1d031d896_invokedynamic675_23(26337, (489233752132995318L ^ life4_3)));
    life12_143 = 0;
    forest_cycle_141: while (true) {
    forest_join_181: {
    forest_join_180: {
    if (!((life12_143 < 4))) {
        break forest_join_183;
    }
    spill675_5 = 0;
    if (!((life6_60 != null))) {
        forestValue675_184_0 = spill675_5;
        break forest_join_184;
    }
    life13_150 = spill675_5;
    forest_cycle_148: while (true) {
    if (!((life13_150 < 4))) {
        break forest_join_180;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)((life10_133 + life12_143))), ((int)(0)), ((int)((life11_141 + life13_150))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)((life10_133 + life12_143))), ((int)(-1)), ((int)((life11_141 + life13_150))), ((moom.G2)(p2)));
    life13_150 += 1;
    if (!((life6_60 != null))) {
        break forest_join_181;
    }
    if (!((life6_60 == null))) {
        continue forest_cycle_148;
    }
    break forest_cycle_148;
    }
    }
    life12_143 += 1;
    }
    if (!((life6_60 == null))) {
        continue forest_cycle_141;
    }
    break forest_cycle_141;
    }
    }
    forestValue675_184_0 = life8_87;
    }
    if (!((life6_60 != null))) {
        forestValue675_188_0 = forestValue675_184_0;
        break forest_join_188;
    }
    if (!((forestValue675_184_0 != 0))) {
        break forest_join_197;
    }
    forestValue675_188_0 = life8_87;
    }
    if (!((forestValue675_188_0 != __sourceIntrinsic_5ac1d031d896_invokedynamic675_28(23108, (520148734346753130L ^ life4_3))))) {
        break forest_join_197;
    }
    life9_98 += 6;
    if (!((life6_60 == null))) {
        break forest_join_198;
    }
    }
    life9_98 += 1;
    }
    if (!((life6_60 == null))) {
        continue forest_cycle_99;
    }
    break forest_cycle_99;
    }
    break forest_cycle_89;
    }
    }
    life8_87 += 1;
    if (!((life6_60 == null))) {
        continue forest_cycle_88;
    }
    break forest_cycle_88;
    }
    }
    forestValue675_204_0 = 0;
    }
    life8_211 = forestValue675_204_0;
    forest_cycle_205: while (true) {
    if (!((life8_211 < 5))) {
        break forest_join_343;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((-1 - life8_211))), ((int)((life8_211 * 2))), ((int)((-1 - life8_211))), ((int)((-1 - life8_211))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic675_29(22845, (3901519623840167728L ^ life4_3)))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic675_30(12585, (7585873371702337343L ^ life4_3)) + life8_211))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic675_32(12585, (7585873371702337343L ^ life4_3)) + life8_211))), ((int)((life8_211 * 2))), ((int)((-1 - life8_211))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic675_33(12585, (7585873371702337343L ^ life4_3)) + life8_211))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic675_34(22845, (3901519623840167728L ^ life4_3)))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic675_35(12585, (7585873371702337343L ^ life4_3)) + life8_211))), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((-life8_211))), ((int)((life8_211 * 2))), ((int)((-1 - life8_211))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic675_37(25886, (4479248698715851572L ^ life4_3)) + life8_211))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic675_38(22845, (3901519623840167728L ^ life4_3)))), ((int)((-1 - life8_211))), ((boolean)(false)));
    spill675_6 = this;
    if (!((life6_60 != null))) {
        forestValue675_344_0 = spill675_6;
        break forest_join_344;
    }
    ((moom.Hz)(spill675_6)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((-life8_211))), ((int)((life8_211 * 2))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic675_40(12585, (7585873371702337343L ^ life4_3)) + life8_211))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic675_41(25886, (4479248698715851572L ^ life4_3)) + life8_211))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic675_42(22845, (3901519623840167728L ^ life4_3)))), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic675_43(12585, (7585873371702337343L ^ life4_3)) + life8_211))), ((boolean)(false)));
    life8_211 += 1;
    if (!((life6_60 == null))) {
        continue forest_cycle_205;
    }
    break forest_cycle_205;
    }
    }
    forestValue675_344_0 = this;
    }
    life8_354 = ((java.util.List)(((moom.Hz)(forestValue675_344_0)).r)).iterator();
    forest_cycle_347: while (true) {
    forest_join_369: {
    forest_join_368: {
    if (!(((java.util.Iterator)(life8_354)).hasNext())) {
        break forest_join_371;
    }
    life9_361 = ((moom.Hs)(((java.util.Iterator)(life8_354)).next()));
    spill675_7 = ((moom.G2)(((moom.Hs)(life9_361)).a__G2())).a__Boolean(((moom.G2)(p2)));
    if (!((life6_60 != null))) {
        forestValue675_372_0 = ((spill675_7) ? 1 : 0);
        break forest_join_372;
    }
    if (!((life6_60 != null))) {
        forestValue675_368_0 = ((spill675_7) ? 1 : 0);
        break forest_join_368;
    }
    if (!(spill675_7)) {
        break forest_join_369;
    }
    forestValue675_368_0 = ((((moom.Hs)(life9_361)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue675_368_0);
    }
    if (!((life6_60 == null))) {
        continue forest_cycle_347;
    }
    break forest_cycle_347;
    }
    }
    forestValue675_372_0 = 1;
    }
    return ((forestValue675_372_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue778_56_0;
    boolean spill778_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_62;
    lexical_join_320: {
    lexical_join_56: {
    life4_3 = (moom.Hz.t ^ 51801165628884L);
    life6_5 = moom.G4.b();
    spill778_0 = ((moom.Hz)(this)).a(((moom.G2)(p2)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_2(26759, (1703359117369952813L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_3(13753, (7860819322414536521L ^ life4_3)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_4(28703, (5227010036938232499L ^ life4_3)))));
    if (!((life6_5 != null))) {
        lexicalValue778_56_0 = ((spill778_0) ? 1 : 0);
        break lexical_join_56;
    }
    if (!(spill778_0)) {
        break lexical_join_320;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_7(31484, (1540265193012287506L ^ life4_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_8(12758, (2134952183157822267L ^ life4_3)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_9(25276, (6242313587457343596L ^ life4_3)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_10(22146, (3649171830718821470L ^ life4_3)))), ((boolean)(false)));
    lexicalValue778_56_0 = 0;
    }
    life7_62 = lexicalValue778_56_0;
    lexical_cycle_57: while (true) {
    if (!((life7_62 < 4))) {
        break lexical_join_320;
    }
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_12(10995, (3273499727589148690L ^ life4_3)))), ((int)(2)), ((int)((5 + (life7_62 * 4)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_13(10995, (3273499727589148690L ^ life4_3)))), ((int)(4)), ((int)((5 + (life7_62 * 4)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_17(26759, (1703359117369952813L ^ life4_3)))), ((int)(4)), ((int)((5 + (life7_62 * 4)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_18(22845, (3901481319480884121L ^ life4_3)))), ((int)(4)), ((int)((5 + (life7_62 * 4)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_23(31484, (1540265193012287506L ^ life4_3)))), ((int)(5)), ((int)((5 + (life7_62 * 4)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_26(9730, (2524327051967628446L ^ life4_3)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_27(23108, (520116826333837507L ^ life4_3)))), ((int)((5 + (life7_62 * 4)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.i)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_30(9730, (2524327051967628446L ^ life4_3)))), ((int)(5)), ((int)((5 + (life7_62 * 4)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_32(17255, (4222148315240882671L ^ life4_3)))), ((int)(2)), ((int)((5 + (life7_62 * 4)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_33(17255, (4222148315240882671L ^ life4_3)))), ((int)(4)), ((int)((5 + (life7_62 * 4)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_37(19000, (3932355952560433330L ^ life4_3)))), ((int)(4)), ((int)((5 + (life7_62 * 4)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_38(13753, (7860819322414536521L ^ life4_3)))), ((int)(4)), ((int)((5 + (life7_62 * 4)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((boolean)(false)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_43(12758, (2134952183157822267L ^ life4_3)))), ((int)(5)), ((int)((5 + (life7_62 * 4)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.f)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_46(16846, (6886055651885114139L ^ life4_3)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_47(23108, (520116826333837507L ^ life4_3)))), ((int)((5 + (life7_62 * 4)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hz.i)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_50(16846, (6886055651885114139L ^ life4_3)))), ((int)(5)), ((int)((5 + (life7_62 * 4)))), ((moom.G2)(p2)));
    ((moom.Hz)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_52(30079, (8798176408403072925L ^ life4_3)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_53(23108, (520116826333837507L ^ life4_3)))), ((int)((5 + (life7_62 * 4)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_54(24814, (2822436761214141047L ^ life4_3)))), ((int)(__sourceIntrinsic_e92bb1c78a77_invokedynamic778_55(23108, (520116826333837507L ^ life4_3)))), ((int)((5 + (life7_62 * 4)))), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((net.minecraft.block.state.IBlockState)(moom.Hz.e)), ((boolean)(false)));
    life7_62 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c789e1359a803fce_invokedynamic396_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4d8d8845656_invokedynamic283_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4d8d8845656_invokedynamic283_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4d8d8845656_invokedynamic283_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4d8d8845656_invokedynamic283_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4d8d8845656_invokedynamic283_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92bb1c78a77_invokedynamic778_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a98d2e70ef9_invokedynamic779_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic675_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4884_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_202(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_208(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_213(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_214(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_215(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_217(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_218(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_220(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_222(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_223(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_229(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_231(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_235(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_236(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_241(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_243(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_245(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_248(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_249(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_250(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_251(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_253(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_255(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63850b85fc99_invokedynamic781_256(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9814609660c3_invokedynamic782_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7340921e3271_invokedynamic783_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee6d176bf27a_invokedynamic284_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e66e16d6a5f8_invokedynamic785_147(int a0, long a1) throws E;

private static native int __sourceExactCall_89acfc28927eb8(int p0, long p1);
private static native int __sourceExactCall_3f00afd7c1d4df(int p0, int p1, int p2);
private static native moom.bs __sourceExactCall_e942200b9dad46(int p0);
}
