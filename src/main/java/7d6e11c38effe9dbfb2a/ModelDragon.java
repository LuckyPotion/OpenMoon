package net.minecraft.client.model;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ModelDragon extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

public moom.jD l;

public moom.jD m;

public moom.jD n;

public moom.jD o;

public moom.jD p;

public moom.jD q;

public moom.jD r;

public moom.jD s;

public moom.jD t;

private float u;

private static long v;

private static long[] w;

private static java.lang.Integer[] x;

private static java.util.Map y;

public ModelDragon(float p0) { super(); }


private static void __sourceConstructorBody_fbb99b4868178f51(net.minecraft.client.model.ModelDragon receiver, float p0) throws Throwable {

long local2 = (net.minecraft.client.model.ModelDragon.v ^ 103300331257787L);

    net.minecraft.client.model.ModelDragon.__sourceConstructorInit_fbb99b4868178f51_0(((net.minecraft.client.model.ModelDragon)(receiver)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).f = ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_2(3943, (7721740541227720731L ^ local2))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).g = ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_4(7023, (3274975035159245826L ^ local2))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("body.body")), ((int)(0)), ((int)(0)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("wing.skin")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_7(6865, (7375283502372943291L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_8(24419, (8784778198902353982L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("wingtip.skin")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_10(27774, (4008299629294846748L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_11(3911, (2550437403770085428L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("rearleg.main")), ((int)(0)), ((int)(0)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("rearfoot.main")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_14(16518, (2040069890431201255L ^ local2)))), ((int)(0)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("rearlegtip.main")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_16(16590, (4844233501258559394L ^ local2)))), ((int)(0)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("head.upperhead")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_18(27942, (7991801067342889559L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_19(8595, (7675435416720559846L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("wing.bone")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_21(27942, (7991801067342889559L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_22(9234, (676999088850619205L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("head.upperlip")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_24(8752, (4342887951611088207L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_25(7181, (3911499970798842708L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("jaw.jaw")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_27(31291, (9032713376314234189L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_28(1288, (2288319960864614994L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("frontleg.main")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_30(27942, (7991801067342889559L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_31(26902, (8132063649385842249L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("wingtip.bone")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_33(27942, (7991801067342889559L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_34(1104, (8777090968678263604L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("frontfoot.main")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_36(30795, (1509524636113245982L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_37(13191, (1589869033463766227L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("neck.box")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_39(29334, (8754674236556942817L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_40(13191, (1589869033463766227L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("frontlegtip.main")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_42(3509, (1707679603004302038L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_43(17052, (1324043556011716070L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("body.scale")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_45(24508, (7798896693142434030L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_46(93, (8263976472631144230L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("head.scale")), ((int)(0)), ((int)(0)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("neck.scale")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_49(1768, (1562182754713397660L ^ local2)))), ((int)(0)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).a(((java.lang.String)("head.nostril")), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_51(27942, (7991801067342889559L ^ local2)))), ((int)(0)));

    float local4 = -0x1.0p4f;

    ((net.minecraft.client.model.ModelDragon)(receiver)).i = ((moom.jD)(new moom.jD(receiver, "head")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).i)).a(((java.lang.String)("upperlip")), ((float)(-0x1.8p2f)), ((float)(-0x1.0p0f)), ((float)((-0x1.0p3f + local4))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_55(28226, (655900031844155693L ^ local2)))), ((int)(5)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_56(2692, (6347597422123640316L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).i)).a(((java.lang.String)("upperhead")), ((float)(-0x1.0p3f)), ((float)(-0x1.0p3f)), ((float)((0x1.8p2f + local4))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_59(2608, (899714872800765291L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_60(2608, (899714872800765291L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_61(2608, (899714872800765291L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).i)).m = ((boolean)(true));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).i)).a(((java.lang.String)("scale")), ((float)(-0x1.4p2f)), ((float)(-0x1.8p3f)), ((float)((0x1.8p3f + local4))), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_66(18525, (5011364001298229006L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).i)).a(((java.lang.String)("nostril")), ((float)(-0x1.4p2f)), ((float)(-0x1.8p1f)), ((float)((-0x1.8p2f + local4))), ((int)(2)), ((int)(2)), ((int)(4)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).i)).m = ((boolean)(false));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).i)).a(((java.lang.String)("scale")), ((float)(0x1.8p1f)), ((float)(-0x1.8p3f)), ((float)((0x1.8p3f + local4))), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_73(18525, (5011364001298229006L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).i)).a(((java.lang.String)("nostril")), ((float)(0x1.8p1f)), ((float)(-0x1.8p1f)), ((float)((-0x1.8p2f + local4))), ((int)(2)), ((int)(2)), ((int)(4)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).k = ((moom.jD)(new moom.jD(receiver, "jaw")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).k)).a(((float)(0x0.0p0f)), ((float)(0x1.0p2f)), ((float)((0x1.0p3f + local4))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).k)).a(((java.lang.String)("jaw")), ((float)(-0x1.8p2f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p4f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_81(28226, (655900031844155693L ^ local2)))), ((int)(4)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_82(2608, (899714872800765291L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).i)).a(((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).k)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).j = ((moom.jD)(new moom.jD(receiver, "neck")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).j)).a(((java.lang.String)("box")), ((float)(-0x1.4p2f)), ((float)(-0x1.4p2f)), ((float)(-0x1.4p2f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_89(4173, (625035283775160115L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_90(4173, (625035283775160115L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_91(4173, (625035283775160115L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).j)).a(((java.lang.String)("scale")), ((float)(-0x1.0p0f)), ((float)(-0x1.2p3f)), ((float)(-0x1.8p1f)), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_94(18525, (5011364001298229006L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).l = ((moom.jD)(new moom.jD(receiver, "body")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).l)).a(((float)(0x0.0p0f)), ((float)(0x1.0p2f)), ((float)(0x1.0p3f)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).l)).a(((java.lang.String)("body")), ((float)(-0x1.8p3f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p4f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_100(9341, (5093530737096608534L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_101(21571, (1726583100361784091L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_102(12646, (6911188052516462107L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).l)).a(((java.lang.String)("scale")), ((float)(-0x1.0p0f)), ((float)(-0x1.8p2f)), ((float)(-0x1.4p3f)), ((int)(2)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_105(18525, (5011364001298229006L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_106(28226, (655900031844155693L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).l)).a(((java.lang.String)("scale")), ((float)(-0x1.0p0f)), ((float)(-0x1.8p2f)), ((float)(0x1.4p3f)), ((int)(2)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_109(18525, (5011364001298229006L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_110(28226, (655900031844155693L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).l)).a(((java.lang.String)("scale")), ((float)(-0x1.0p0f)), ((float)(-0x1.8p2f)), ((float)(0x1.ep4f)), ((int)(2)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_113(18525, (5011364001298229006L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_114(28226, (655900031844155693L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).s = ((moom.jD)(new moom.jD(receiver, "wing")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).s)).a(((float)(-0x1.8p3f)), ((float)(0x1.4p2f)), ((float)(0x1.0p1f)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).s)).a(((java.lang.String)("bone")), ((float)(-0x1.cp5f)), ((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_120(1191, (4549580885258398656L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_121(30012, (553183957071829582L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_122(11292, (1396728863680545610L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).s)).a(((java.lang.String)("skin")), ((float)(-0x1.cp5f)), ((float)(0x0.0p0f)), ((float)(0x1.0p1f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_125(31155, (1410563188278499011L ^ local2)))), ((int)(0)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_126(31155, (1410563188278499011L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).t = ((moom.jD)(new moom.jD(receiver, "wingtip")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).t)).a(((float)(-0x1.cp5f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).t)).a(((java.lang.String)("bone")), ((float)(-0x1.cp5f)), ((float)(-0x1.0p1f)), ((float)(-0x1.0p1f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_132(31155, (1410563188278499011L ^ local2)))), ((int)(4)), ((int)(4)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).t)).a(((java.lang.String)("skin")), ((float)(-0x1.cp5f)), ((float)(0x0.0p0f)), ((float)(0x1.0p1f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_135(31155, (1410563188278499011L ^ local2)))), ((int)(0)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_136(31155, (1410563188278499011L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).s)).a(((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).t)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).n = ((moom.jD)(new moom.jD(receiver, "frontleg")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).n)).a(((float)(-0x1.8p3f)), ((float)(0x1.4p4f)), ((float)(0x1.0p1f)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).n)).a(((java.lang.String)("main")), ((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((float)(-0x1.0p2f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_145(11292, (1396728863680545610L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_146(21571, (1726583100361784091L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_147(11292, (1396728863680545610L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).p = ((moom.jD)(new moom.jD(receiver, "frontlegtip")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).p)).a(((float)(0x0.0p0f)), ((float)(0x1.4p4f)), ((float)(-0x1.0p0f)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).p)).a(((java.lang.String)("main")), ((float)(-0x1.8p1f)), ((float)(-0x1.0p0f)), ((float)(-0x1.8p1f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_153(18525, (5011364001298229006L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_154(21571, (1726583100361784091L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_155(18525, (5011364001298229006L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).n)).a(((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).p)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).r = ((moom.jD)(new moom.jD(receiver, "frontfoot")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).r)).a(((float)(0x0.0p0f)), ((float)(0x1.7p4f)), ((float)(0x0.0p0f)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).r)).a(((java.lang.String)("main")), ((float)(-0x1.0p2f)), ((float)(0x0.0p0f)), ((float)(-0x1.8p3f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_164(11292, (1396728863680545610L ^ local2)))), ((int)(4)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_165(2608, (899714872800765291L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).p)).a(((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).r)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).m = ((moom.jD)(new moom.jD(receiver, "rearleg")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).m)).a(((float)(-0x1.0p4f)), ((float)(0x1.0p4f)), ((float)(0x1.5p5f)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).m)).a(((java.lang.String)("main")), ((float)(-0x1.0p3f)), ((float)(-0x1.0p2f)), ((float)(-0x1.0p3f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_174(2608, (899714872800765291L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_175(11013, (966661545457828972L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_176(2608, (899714872800765291L ^ local2)))));

    ((net.minecraft.client.model.ModelDragon)(receiver)).o = ((moom.jD)(new moom.jD(receiver, "rearlegtip")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).o)).a(((float)(0x0.0p0f)), ((float)(0x1.0p5f)), ((float)(-0x1.0p2f)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).o)).a(((java.lang.String)("main")), ((float)(-0x1.8p2f)), ((float)(-0x1.0p1f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_182(28226, (655900031844155693L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_183(5610, (2738383484665920143L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_184(28226, (655900031844155693L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).m)).a(((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).o)));

    ((net.minecraft.client.model.ModelDragon)(receiver)).q = ((moom.jD)(new moom.jD(receiver, "rearfoot")));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).q)).a(((float)(0x0.0p0f)), ((float)(0x1.fp4f)), ((float)(0x1.0p2f)));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).q)).a(((java.lang.String)("main")), ((float)(-0x1.2p3f)), ((float)(0x0.0p0f)), ((float)(-0x1.4p4f)), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_193(87, (280033370163834679L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_194(18525, (5011364001298229006L ^ local2)))), ((int)(__sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_195(21571, (1726583100361784091L ^ local2)))));

    ((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).o)).a(((moom.jD)(((net.minecraft.client.model.ModelDragon)(receiver)).q)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_fbb99b4868178f51_0(net.minecraft.client.model.ModelDragon a0) throws E;

static {
v = ((long)(((moom._a)(moom._c.a(((long)(-4314717467110748548L)), ((long)(8399451079336743896L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135403721298343L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.model.ModelDragon.v ^ 87429506910067L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1794_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1794_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1794_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1794_14 = new byte[8];
    (__sourceSpill1794_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1794_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1794_16 = __sourceSpill1794_14;
    ((javax.crypto.Cipher)(__sourceSpill1794_11)).init(((int)(__sourceSpill1794_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1794_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1794_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[46];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "9á·1ÏÌ\033F,@seZìßZóíC\005\022ò`°ûÍÝ¶JöÁ0Ø´jÉÀBÿ\005½À\026^ª\\kf%PEXC0À\017t:Á\033_Î\023\001sá0~ÔX\023WDÍúÞ9\032\004´\022\037fÆ8\0164áS÷¦Z\006Âøä)\020\t\030ÑÞví\024<uPQw\003öèx.&nl\033cË¡7«,w\022\"Í¹^°b×*k¡´[º\007MÚ\006~BÊ¯ß>÷ ÊÐQhëfè¾7íÔW¢o×èåÍí<$ð9W-`lßÜ}-ÒZ»~ñ3x\\¤6ê*Ãº\024uöaSÏµ×\ráá1¶,\036Gÿ\bßÉF»t\rE\021\023U1L\000i3\013#_jC³näi°n¤Ò\n,É;K(Ô\034ÉÑ5?cá\000})îú\0045¡ÓjîfÚ\033\n'~q­?RY¹\022\026Ñ7_Â´ï\025Ö6Ç\007g\022Û<^=í{-rýD\037M\034\026ð³\030Ï"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1794_25 = local6_life21;
        int __sourceSpill1794_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1794_25)).substring(((int)(__sourceSpill1794_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1794_30 = local8_life19;
        int __sourceSpill1794_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1794_33 = new byte[8];
        (__sourceSpill1794_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1794_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1794_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1794_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1794_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1794_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1794_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1794_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1794_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1794_34)).doFinal(((byte[])(__sourceSpill1794_33)));
        (__sourceSpill1794_30)[__sourceSpill1794_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ò\t«\022)`àElSgX"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1794_38 = local6_life21;
        int __sourceSpill1794_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1794_38)).substring(((int)(__sourceSpill1794_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1794_43 = local8_life19;
        int __sourceSpill1794_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1794_46 = new byte[8];
        (__sourceSpill1794_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1794_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1794_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1794_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1794_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1794_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1794_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1794_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1794_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1794_47)).doFinal(((byte[])(__sourceSpill1794_46)));
        (__sourceSpill1794_43)[__sourceSpill1794_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    w = ((long[])(local8_life19));
    x = ((java.lang.Integer[])(new java.lang.Integer[46]));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13566;
      if (x[var3] == null) {
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
         long var5 = w[var3];
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
         Object[] var9 = (Object[])y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/i8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         x[var3] = var15;
      }

      return x[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.model.ModelDragon.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10426_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/i8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
int lexicalValue1487_511_0;
    net.minecraft.entity.Entity[] spill1487_0;
    int spill1487_1;
    long life8_3;
    net.minecraft.entity.boss.EntityDragon life11_7;
    float life12_19;
    float life13_47;
    float life13_59;
    float life14_75;
    float life15_77;
    float life16_79;
    double[] life17_89;
    net.minecraft.entity.Entity[] life10_90;
    float life18_112;
    float life19_127;
    float life14_131;
    float life20_137;
    float life14_139;
    float life21_141;
    int life22_143;
    double[] life23_154;
    float life24_166;
    double[] life22_313;
    int life23_378;
    float life24_388;
    float life23_536;
    float life20_542;
    float life14_544;
    float life21_546;
    float life15_548;
    double[] life17_558;
    int life24_560;
    double[] life22_579;
    lexical_join_711: {
    lexical_join_710: {
    lexical_join_511: {
    lexical_join_505: {
    lexical_join_305: {
    lexical_join_293: {
    life8_3 = (net.minecraft.client.model.ModelDragon.v ^ 132914079931777L);
    moom.kZ.B();
    life11_7 = ((net.minecraft.entity.boss.EntityDragon)(p0));
    life12_19 = (((net.minecraft.entity.boss.EntityDragon)(life11_7)).b_ + ((((net.minecraft.entity.boss.EntityDragon)(life11_7)).ca - ((net.minecraft.entity.boss.EntityDragon)(life11_7)).b_) * this.u));
    ((moom.jD)(this.k)).h = ((float)((((float) (java.lang.Math.sin(((double)(((double) ((life12_19 * 0x1.921fb6p1f) * 0x1.0p1f))))) + 0x1.0p0d)) * 0x1.99999ap-3f)));
    life13_47 = ((float) (java.lang.Math.sin(((double)(((double) (((life12_19 * 0x1.921fb6p1f) * 0x1.0p1f) - 0x1.0p0f))))) + 0x1.0p0d));
    life13_59 = ((((life13_47 * life13_47) * 0x1.0p0f) + (life13_47 * 0x1.0p1f)) * 0x1.99999ap-5f);
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((life13_59 - 0x1.0p1f))), ((float)(-0x1.8p1f)));
    spill1487_0 = moom.iQ.b();
    moom.kZ.b(((float)((life13_59 * 0x1.0p1f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    life14_75 = -0x1.ep4f;
    life15_77 = 0x0.0p0f;
    life16_79 = 0x1.8p0f;
    life17_89 = ((net.minecraft.entity.boss.EntityDragon)(life11_7)).a__sourceReturn_59e90b7c78(((int)(__sourceIntrinsic_335cac213604_invokedynamic1487_14(20318, (5585213649381163532L ^ life8_3)))), ((float)(this.u)));
    life10_90 = spill1487_0;
    life18_112 = ((net.minecraft.client.model.ModelDragon)(this)).a(((double)(((((net.minecraft.entity.boss.EntityDragon)(life11_7)).a__sourceReturn_59e90b7c78(((int)(5)), ((float)(this.u))))[0] - (((net.minecraft.entity.boss.EntityDragon)(life11_7)).a__sourceReturn_59e90b7c78(((int)(__sourceIntrinsic_335cac213604_invokedynamic1487_19(20383, (2512682805204878044L ^ life8_3)))), ((float)(this.u))))[0]))));
    life19_127 = ((net.minecraft.client.model.ModelDragon)(this)).a(((double)(((((net.minecraft.entity.boss.EntityDragon)(life11_7)).a__sourceReturn_59e90b7c78(((int)(5)), ((float)(this.u))))[0] + ((double) (life18_112 / 0x1.0p1f))))));
    life14_131 = (life14_75 + 0x1.0p1f);
    life20_137 = ((life12_19 * 0x1.921fb6p1f) * 0x1.0p1f);
    life14_139 = 0x1.4p4f;
    life21_141 = -0x1.8p3f;
    life22_143 = 0;
    lexical_cycle_144: while (true) {
    if (!((life22_143 < 5))) {
        break lexical_join_293;
    }
    life23_154 = ((net.minecraft.entity.boss.EntityDragon)(life11_7)).a__sourceReturn_59e90b7c78(((int)((5 - life22_143))), ((float)(this.u)));
    life24_166 = (((float) java.lang.Math.cos(((double)(((double) ((((float) life22_143) * 0x1.ccccccp-2f) + life20_137)))))) * 0x1.333334p-3f);
    ((moom.jD)(this.j)).i = ((float)((((((net.minecraft.client.model.ModelDragon)(this)).a(((double)(((life23_154)[0] - (life17_89)[0])))) * 0x1.921fb6p1f) / 0x1.68p7f) * life16_79)));
    ((moom.jD)(this.j)).h = ((float)((life24_166 + ((((((float) ((life23_154)[1] - (life17_89)[1])) * 0x1.921fb6p1f) / 0x1.68p7f) * life16_79) * 0x1.4p2f))));
    ((moom.jD)(this.j)).j = ((float)(((((-((net.minecraft.client.model.ModelDragon)(this)).a(((double)(((life23_154)[0] - ((double) life19_127)))))) * 0x1.921fb6p1f) / 0x1.68p7f) * life16_79)));
    ((moom.jD)(this.j)).f = ((float)(life14_139));
    ((moom.jD)(this.j)).g = ((float)(life21_141));
    ((moom.jD)(this.j)).e = ((float)(life15_77));
    life14_139 = ((float) (((double) life14_139) + (java.lang.Math.sin(((double)(((double) ((moom.jD)(this.j)).h)))) * 0x1.4p3d)));
    life21_141 = ((float) (((double) life21_141) - ((java.lang.Math.cos(((double)(((double) ((moom.jD)(this.j)).i)))) * java.lang.Math.cos(((double)(((double) ((moom.jD)(this.j)).h))))) * 0x1.4p3d)));
    life15_77 = ((float) (((double) life15_77) - ((java.lang.Math.sin(((double)(((double) ((moom.jD)(this.j)).i)))) * java.lang.Math.cos(((double)(((double) ((moom.jD)(this.j)).h))))) * 0x1.4p3d)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    life22_143 += 1;
    if (!((life10_90 != null))) {
        break lexical_join_305;
    }
    if (!((life10_90 == null))) { continue lexical_cycle_144; }
    break lexical_cycle_144;
    }
    }
    ((moom.jD)(this.i)).f = ((float)(life14_139));
    ((moom.jD)(this.i)).g = ((float)(life21_141));
    ((moom.jD)(this.i)).e = ((float)(life15_77));
    }
    life22_313 = ((net.minecraft.entity.boss.EntityDragon)(life11_7)).a__sourceReturn_59e90b7c78(((int)(0)), ((float)(this.u)));
    ((moom.jD)(this.i)).i = ((float)(((((net.minecraft.client.model.ModelDragon)(this)).a(((double)(((life22_313)[0] - (life17_89)[0])))) * 0x1.921fb6p1f) / 0x1.68p7f)));
    ((moom.jD)(this.i)).j = ((float)((((-((net.minecraft.client.model.ModelDragon)(this)).a(((double)(((life22_313)[0] - ((double) life19_127)))))) * 0x1.921fb6p1f) / 0x1.68p7f)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    moom.kZ.B();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((((-life18_112) * life16_79) * 0x1.0p0f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f)));
    ((moom.jD)(this.l)).j = ((float)(0x0.0p0f));
    ((moom.jD)(this.l)).a(((float)(p6)));
    life23_378 = 0;
    lexical_cycle_376: while (true) {
    lexical_join_503: {
    lexical_join_502: {
    if (!((life23_378 < 2))) {
        break lexical_join_505;
    }
    moom.kZ.o();
    life24_388 = ((life12_19 * 0x1.921fb6p1f) * 0x1.0p1f);
    ((moom.jD)(this.s)).h = ((float)((0x1.0p-3f - (((float) java.lang.Math.cos(((double)(((double) life24_388))))) * 0x1.99999ap-3f))));
    ((moom.jD)(this.s)).i = ((float)(0x1.0p-2f));
    ((moom.jD)(this.s)).j = ((float)((((float) (java.lang.Math.sin(((double)(((double) life24_388)))) + 0x1.0p-3d)) * 0x1.99999ap-1f)));
    ((moom.jD)(this.t)).j = ((float)(((-((float) (java.lang.Math.sin(((double)(((double) (life24_388 + 0x1.0p1f))))) + 0x1.0p-1d))) * 0x1.8p-1f)));
    ((moom.jD)(this.m)).h = ((float)((0x1.0p0f + (life13_59 * 0x1.99999ap-4f))));
    ((moom.jD)(this.o)).h = ((float)((0x1.0p-1f + (life13_59 * 0x1.99999ap-4f))));
    ((moom.jD)(this.q)).h = ((float)((0x1.8p-1f + (life13_59 * 0x1.99999ap-4f))));
    ((moom.jD)(this.n)).h = ((float)((0x1.4cccccp0f + (life13_59 * 0x1.99999ap-4f))));
    ((moom.jD)(this.p)).h = ((float)((-0x1.0p-1f - (life13_59 * 0x1.99999ap-4f))));
    ((moom.jD)(this.r)).h = ((float)((0x1.8p-1f + (life13_59 * 0x1.99999ap-4f))));
    ((moom.jD)(this.s)).a(((float)(p6)));
    ((moom.jD)(this.n)).a(((float)(p6)));
    ((moom.jD)(this.m)).a(((float)(p6)));
    moom.kZ.a(((float)(-0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life10_90 != null))) {
        break lexical_join_503;
    }
    spill1487_1 = life23_378;
    if (!((life10_90 != null))) {
        lexicalValue1487_511_0 = spill1487_1;
        break lexical_join_511;
    }
    if (!((spill1487_1 == 0))) {
        break lexical_join_502;
    }
    moom.kZ.e(((int)(__sourceIntrinsic_335cac213604_invokedynamic1487_115(27220, (534709512708597512L ^ life8_3)))));
    }
    life23_378 += 1;
    }
    if (!((life10_90 == null))) { continue lexical_cycle_376; }
    break lexical_cycle_376;
    }
    }
    moom.kZ.C();
    lexicalValue1487_511_0 = __sourceIntrinsic_335cac213604_invokedynamic1487_118(8365, (3667184710488321483L ^ life8_3));
    }
    moom.kZ.e(((int)(lexicalValue1487_511_0)));
    moom.kZ.p();
    life23_536 = ((-((float) java.lang.Math.sin(((double)(((double) ((life12_19 * 0x1.921fb6p1f) * 0x1.0p1f))))))) * 0x0.0p0f);
    life20_542 = ((life12_19 * 0x1.921fb6p1f) * 0x1.0p1f);
    life14_544 = 0x1.4p3f;
    life21_546 = 0x1.ep5f;
    life15_548 = 0x0.0p0f;
    life17_558 = ((net.minecraft.entity.boss.EntityDragon)(life11_7)).a__sourceReturn_59e90b7c78(((int)(__sourceIntrinsic_335cac213604_invokedynamic1487_122(4803, (1878919991264370599L ^ life8_3)))), ((float)(this.u)));
    life24_560 = 0;
    lexical_cycle_549: while (true) {
    if (!((life24_560 < __sourceIntrinsic_335cac213604_invokedynamic1487_125(3132, (8984074353789288808L ^ life8_3))))) {
        break lexical_join_710;
    }
    life22_579 = ((net.minecraft.entity.boss.EntityDragon)(life11_7)).a__sourceReturn_59e90b7c78(((int)((__sourceIntrinsic_335cac213604_invokedynamic1487_126(28226, (655868081565115159L ^ life8_3)) + life24_560))), ((float)(this.u)));
    life23_536 = ((float) (((double) life23_536) + (java.lang.Math.sin(((double)(((double) ((((float) life24_560) * 0x1.ccccccp-2f) + life20_542))))) * 0x1.99999ap-5d)));
    ((moom.jD)(this.j)).i = ((float)(((((((net.minecraft.client.model.ModelDragon)(this)).a(((double)(((life22_579)[0] - (life17_558)[0])))) * life16_79) + 0x1.68p7f) * 0x1.921fb6p1f) / 0x1.68p7f)));
    ((moom.jD)(this.j)).h = ((float)((life23_536 + ((((((float) ((life22_579)[1] - (life17_558)[1])) * 0x1.921fb6p1f) / 0x1.68p7f) * life16_79) * 0x1.4p2f))));
    ((moom.jD)(this.j)).j = ((float)((((((net.minecraft.client.model.ModelDragon)(this)).a(((double)(((life22_579)[0] - ((double) life19_127))))) * 0x1.921fb6p1f) / 0x1.68p7f) * life16_79)));
    ((moom.jD)(this.j)).f = ((float)(life14_544));
    ((moom.jD)(this.j)).g = ((float)(life21_546));
    ((moom.jD)(this.j)).e = ((float)(life15_548));
    life14_544 = ((float) (((double) life14_544) + (java.lang.Math.sin(((double)(((double) ((moom.jD)(this.j)).h)))) * 0x1.4p3d)));
    life21_546 = ((float) (((double) life21_546) - ((java.lang.Math.cos(((double)(((double) ((moom.jD)(this.j)).i)))) * java.lang.Math.cos(((double)(((double) ((moom.jD)(this.j)).h))))) * 0x1.4p3d)));
    life15_548 = ((float) (((double) life15_548) - ((java.lang.Math.sin(((double)(((double) ((moom.jD)(this.j)).i)))) * java.lang.Math.cos(((double)(((double) ((moom.jD)(this.j)).h))))) * 0x1.4p3d)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    life24_560 += 1;
    if (!((life10_90 != null))) {
        break lexical_join_711;
    }
    if (!((life10_90 == null))) { continue lexical_cycle_549; }
    break lexical_cycle_549;
    }
    }
    moom.kZ.C();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
this.u = ((float)(p3));
    return;
}


private float a(double p0) {
double lexicalValue1486_31_0;
    double spill1486_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_18: {
    life3_3 = (net.minecraft.client.model.ModelDragon.v ^ 98273878365634L);
    life5_5 = moom.iQ.b();
    lexical_cycle_6: while (true) {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x1.68p7d))) >= 0))) {
        break lexical_join_18;
    }
    p0 = (p0 - 0x1.68p8d);
    if (!((life5_5 != null))) {
        break lexical_join_30;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    lexical_cycle_18: while (true) {
    if (!((recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(-0x1.68p7d))) < 0))) {
        break lexical_join_30;
    }
    spill1486_0 = (p0 + 0x1.68p8d);
    if (!((life5_5 != null))) {
        lexicalValue1486_31_0 = spill1486_0;
        break lexical_join_31;
    }
    p0 = spill1486_0;
    if (!((life5_5 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1486_31_0 = p0;
    }
    return ((float) lexicalValue1486_31_0);
}


private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbb99b4868178f51_originalDynamicSite3716_195(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10426_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335cac213604_invokedynamic1487_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335cac213604_invokedynamic1487_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335cac213604_invokedynamic1487_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335cac213604_invokedynamic1487_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335cac213604_invokedynamic1487_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335cac213604_invokedynamic1487_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335cac213604_invokedynamic1487_126(int a0, long a1) throws E;
}
