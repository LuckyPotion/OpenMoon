package net.minecraft.entity.passive;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityVillager extends moom.sJ implements net.minecraft.entity.IMerchant, net.minecraft.entity.INpc {

private int b_;

private boolean ca;

private boolean cb;

net.minecraft.village.Village cc;

private net.minecraft.entity.player.EntityPlayer cd;

private moom.OF ce;

private int cf;

private boolean cg;

private boolean ch;

private int ci;

private java.lang.String cj;

public int ck;

public int cl;

private boolean cm;

private boolean cn;

private moom.wq co;

private static net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] cp;

private static long ib;

private static long[] jb;

private static java.lang.Integer[] kb;

private static java.util.Map xb;

public EntityVillager(net.minecraft.world.World p0) {
this(((net.minecraft.world.World)(p0)), ((int)(0)));
    return;
}


public EntityVillager(net.minecraft.world.World p0, int p1) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_ac2c268a52c386d0(net.minecraft.entity.passive.EntityVillager receiver, net.minecraft.world.World p0, int p1) throws Throwable {
long local3_life1 = (net.minecraft.entity.passive.EntityVillager.ib ^ 43121973059169L);
    net.minecraft.entity.passive.EntityVillager.__sourceConstructorInit_ac2c268a52c386d0_0(((net.minecraft.entity.passive.EntityVillager)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.passive.EntityVillager)(receiver)).co = ((moom.wq)(new moom.wq("Items", false, __sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_3(2312, (6363891040237123137L ^ local3_life1)))));
    ((net.minecraft.entity.passive.EntityVillager)(receiver)).m(((int)(p1)));
    ((net.minecraft.entity.passive.EntityVillager)(receiver)).a__Void(((float)(0x1.333334p-1f)), ((float)(0x1.ccccccp0f)));
    ((moom.AW)(((moom.AW)(__sourceExactCall_360e838a3e1f70(((net.minecraft.entity.passive.EntityVillager)(receiver))))))).b(((boolean)(true)));
    ((moom.AW)(((moom.AW)(__sourceExactCall_360e838a3e1f70(((net.minecraft.entity.passive.EntityVillager)(receiver))))))).a(((boolean)(true)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)).a(((int)(0)), ((moom.uc)(new moom.uQ(receiver))));
    int __sourceSpill943_19 = moom.vR.b();
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uh(receiver, net.minecraft.entity.monster.EntityZombie.class, 0x1.0p3f, 0x1.3333333333333p-1d, 0x1.3333333333333p-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.u4(receiver))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)), ((int)(1)), ((moom.uc)(new moom.u9(receiver))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)), ((int)(2)), ((moom.uc)(new moom.uA(receiver))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)), ((int)(3)), ((moom.uc)(new moom.uM(receiver))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)), ((int)(4)), ((moom.uc)(new moom.uo(receiver, true))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)), ((int)(5)), ((moom.uc)(new moom.uG(receiver, 0x1.3333333333333p-1d))));
    int local5_life32 = __sourceSpill943_19;
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)).a(((int)(__sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_34(25127, (860848056509996411L ^ local3_life1)))), ((moom.uc)(new moom.u5(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)).a(((int)(__sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_37(13000, (4624066330955238807L ^ local3_life1)))), ((moom.uc)(new moom.ut(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)).a(((int)(__sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_40(2510, (3213428157961467543L ^ local3_life1)))), ((moom.uc)(new moom.u_(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.8p1f, 0x1.0p0f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)).a(((int)(__sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_44(2510, (3213428157961467543L ^ local3_life1)))), ((moom.uc)(new moom.va(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)).a(((int)(__sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_47(2510, (3213428157961467543L ^ local3_life1)))), ((moom.uc)(new moom.u6(receiver, 0x1.3333333333333p-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(receiver)).bJ)).a(((int)(__sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_50(14047, (9172655532494899586L ^ local3_life1)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.EntityLiving.class, 0x1.0p3f))));
    ((net.minecraft.entity.passive.EntityVillager)(receiver)).i(((boolean)(true)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        local5_life32 += 1;
        moom.vR.b(((int)(local5_life32)));
    }
    return;
}


static {
javax.crypto.Cipher forestValue562_36_0;
    int forestValue562_36_1;
    javax.crypto.SecretKeyFactory forestValue562_36_2;
    byte[] forestValue562_36_3;
    javax.crypto.Cipher forestValue562_53_0;
    int forestValue562_53_1;
    javax.crypto.SecretKeyFactory forestValue562_53_2;
    byte[] forestValue562_53_3;
    long[] forestValue562_157_0;
    int forestValue562_157_1;
    long forestValue562_157_2;
    int forestValue562_157_3;
    long[] forestValue562_300_0;
    int forestValue562_300_1;
    long forestValue562_300_2;
    long[] forestValue562_312_0;
    int forestValue562_312_1;
    long forestValue562_312_2;
    javax.crypto.Cipher spill562_0;
    int spill562_1;
    javax.crypto.SecretKeyFactory spill562_2;
    byte[] spill562_3;
    byte[] spill562_4;
    java.lang.String spill562_5;
    int spill562_6;
    int spill562_7;
    long spill562_8;
    byte[] spill562_9;
    byte[] spill562_10;
    byte[] spill562_11;
    byte[] spill562_12;
    byte[] spill562_13;
    byte[] spill562_14;
    byte[] spill562_15;
    byte[] spill562_16;
    long spill562_17;
    int spill562_18;
    java.lang.String spill562_19;
    int spill562_20;
    long[] spill562_21;
    int spill562_22;
    long spill562_23;
    int spill562_24;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_25;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_26;
    int spill562_27;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_28;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_29;
    int spill562_30;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_31;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_32;
    int spill562_33;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_34;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_35;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_36;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_37;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_38;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_39;
    int spill562_40;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_41;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_42;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_43;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_44;
    int spill562_45;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_46;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_47;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_48;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_49;
    int spill562_50;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_51;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_52;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_53;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_54;
    int spill562_55;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_56;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_57;
    int spill562_58;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_59;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_60;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_61;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_62;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_63;
    int spill562_64;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_65;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_66;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_67;
    int spill562_68;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_69;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_70;
    int spill562_71;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_72;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_73;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_74;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_75;
    int spill562_76;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_77;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_78;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_79;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_80;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_81;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_82;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_83;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_84;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_85;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_86;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_87;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_88;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_89;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_90;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_91;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_92;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_93;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_94;
    int spill562_95;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_96;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_97;
    int spill562_98;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_99;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_100;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_101;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_102;
    int spill562_103;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_104;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_105;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_106;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_107;
    int spill562_108;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_109;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_110;
    int spill562_111;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_112;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_113;
    int spill562_114;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_115;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_116;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_117;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_118;
    int spill562_119;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_120;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_121;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_122;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_123;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_124;
    int spill562_125;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_126;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_127;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_128;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_129;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_130;
    int spill562_131;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_132;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_133;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_134;
    int spill562_135;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_136;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_137;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_138;
    int spill562_139;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_140;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_141;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_142;
    int spill562_143;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_144;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_145;
    int spill562_146;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_147;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_148;
    int spill562_149;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_150;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_151;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_152;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_153;
    int spill562_154;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_155;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_156;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_157;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_158;
    int spill562_159;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_160;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_161;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_162;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_163;
    int spill562_164;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_165;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_166;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_167;
    int spill562_168;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_169;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_170;
    int spill562_171;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_172;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_173;
    int spill562_174;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_175;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_176;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_177;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_178;
    int spill562_179;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_180;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_181;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_182;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_183;
    int spill562_184;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_185;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_186;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_187;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_188;
    int spill562_189;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_190;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_191;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_192;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_193;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_194;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_195;
    int spill562_196;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_197;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_198;
    int spill562_199;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_200;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_201;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_202;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_203;
    int spill562_204;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_205;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_206;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_207;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_208;
    int spill562_209;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_210;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_211;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_212;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_213;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_214;
    int spill562_215;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_216;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_217;
    int spill562_218;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_219;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_220;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_221;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_222;
    int spill562_223;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_224;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_225;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_226;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_227;
    int spill562_228;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_229;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_230;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_231;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] spill562_232;
    int spill562_233;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_234;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_235;
    int spill562_236;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_237;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_238;
    int spill562_239;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_240;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_241;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_242;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_243;
    int spill562_244;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_245;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_246;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_247;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_248;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] spill562_249;
    int spill562_250;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_251;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_252;
    int spill562_253;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_254;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_255;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_256;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_257;
    int spill562_258;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_259;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_260;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] spill562_261;
    int spill562_262;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] spill562_263;
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
    ib = ((long)(((moom._a)(moom._c.a(((long)(-2273208993482452461L)), ((long)(6815688603761400916L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114365129197267L)))));
    life11_11 = (net.minecraft.entity.passive.EntityVillager.ib ^ 109785781036275L);
    xb = ((java.util.Map)(new java.util.HashMap(13)));
    spill562_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill562_1 = 2;
    spill562_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp562_9_0 = new byte[8];
    spill562_3 = __stackOp562_9_0;
    (__stackOp562_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue562_36_0 = spill562_0;
    forestValue562_36_1 = spill562_1;
    forestValue562_36_2 = spill562_2;
    forestValue562_36_3 = spill562_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue562_53_0 = forestValue562_36_0;
        forestValue562_53_1 = forestValue562_36_1;
        forestValue562_53_2 = forestValue562_36_2;
        forestValue562_53_3 = forestValue562_36_3;
        break forest_join_53;
    }
    byte[] __stackOp562_10_0 = forestValue562_36_3;
    spill562_4 = __stackOp562_10_0;
    (__stackOp562_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue562_36_3 = spill562_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue562_53_0)).init(((int)(forestValue562_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue562_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue562_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[57];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "\033¸±=¥=ò¦P=9Kv\002Dþ¹às&¾9\bÂþ\bø­³­Ëº*9îIùKî·zù-Å$ÜmÏ\\¤¥\"u\023{7Ìcm\016\022,».¬ç]àÓtüøn\000¯Êsñ$ÂWñ³Ê5^Gî\177CZ3¼£~YvOÌ\024¿g¾ææÇn÷\tJ%A][¸®K\004\007'p¸4õNiú\023ßç¤\003Ç¢Ú27~µ\tbG¿\007Ô \rnÐ\020\0266Z9â;q ä²Å:ÅªF²\\Õ,³½n\026!*K÷\033_+\033·?`Ï×\004«Ù7Z¿²4\\{#°\rÓ³:ÁL RSÙ¯âÆk-\000àé`É%,þ\0206ÃQ\"\004è§Ó`óuÑQ?\020|ñP¢P%-Nkî(vQ¿Í»V#.Ì×\020FRæ¹ü·\033o8V÷NhOÌ­Iá©ó/m`æIK×L\001ÁèoÍÜ^¼\027 ùQJ/ÔÄÁ6n\fµ\001û\017K:^B\007ò«~DéDþ¹\177¯]W\016ÚW\003\fé÷³£FÁä\005ÈÚîûì3½¦M)ryÄÄP&£7eÔ5v|GV3éêÚUÂkñQGëQìO\034Ös¡Ó"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill562_5 = life4_71;
    spill562_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill562_5)).substring(((int)(spill562_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue562_157_0 = life6_66;
    forestValue562_157_1 = (life3_68++);
    forestValue562_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue562_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp562_16_0 = forestValue562_157_2;
    int __stackOp562_16_1 = forestValue562_157_3;
    spill562_7 = __stackOp562_16_1;
    spill562_8 = __stackOp562_16_0;
    recovery.source.CarrierOps.discard(__stackOp562_16_1);
    life8_160 = spill562_8;
    byte[] __stackOp562_18_0 = new byte[8];
    spill562_9 = __stackOp562_18_0;
    (__stackOp562_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp562_19_0 = spill562_9;
    spill562_10 = __stackOp562_19_0;
    (__stackOp562_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp562_20_0 = spill562_10;
    spill562_11 = __stackOp562_20_0;
    (__stackOp562_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp562_21_0 = spill562_11;
    spill562_12 = __stackOp562_21_0;
    (__stackOp562_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp562_22_0 = spill562_12;
    spill562_13 = __stackOp562_22_0;
    (__stackOp562_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp562_23_0 = spill562_13;
    spill562_14 = __stackOp562_23_0;
    (__stackOp562_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp562_24_0 = spill562_14;
    spill562_15 = __stackOp562_24_0;
    (__stackOp562_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp562_25_0 = spill562_15;
    spill562_16 = __stackOp562_25_0;
    (__stackOp562_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp562_26_0 = spill562_16;
    javax.crypto.Cipher __stackOp562_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp562_26_1)).doFinal(((byte[])(__stackOp562_26_0)));
    int __stackOp562_28_0 = spill562_7;
    long __stackOp562_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill562_17 = __stackOp562_28_1;
    spill562_18 = __stackOp562_28_0;
    recovery.source.CarrierOps.discard(__stackOp562_28_1);
    switch (spill562_18) {
default:
{
        forestValue562_300_0 = forestValue562_157_0;
        forestValue562_300_1 = forestValue562_157_1;
        forestValue562_300_2 = spill562_17;
        break forest_join_300;
    }
case 0:
{
        forestValue562_312_0 = forestValue562_157_0;
        forestValue562_312_1 = forestValue562_157_1;
        forestValue562_312_2 = spill562_17;
        break forest_join_312;
    }
}
    }
    (forestValue562_300_0)[forestValue562_300_1] = forestValue562_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "Ý_A\032\0137ÔÆySRSai"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue562_312_0)[forestValue562_312_1] = forestValue562_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill562_19 = life4_71;
    spill562_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill562_19)).substring(((int)(spill562_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill562_21 = life6_66;
    spill562_22 = (life3_68++);
    spill562_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill562_24 = 0;
    forestValue562_157_0 = spill562_21;
    forestValue562_157_1 = spill562_22;
    forestValue562_157_2 = spill562_23;
    forestValue562_157_3 = spill562_24;
    continue forest_cycle_157;
    }
    }
    }
    jb = ((long[])(life6_66));
    kb = ((java.lang.Integer[])(new java.lang.Integer[57]));
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] __stackOp562_35_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[5][][][];
    spill562_25 = __stackOp562_35_0;
    spill562_26 = __stackOp562_35_0;
    spill562_27 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_36_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[4][][];
    spill562_28 = __stackOp562_36_0;
    spill562_29 = __stackOp562_36_0;
    spill562_30 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_37_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[4][];
    spill562_31 = __stackOp562_37_0;
    spill562_32 = __stackOp562_37_0;
    spill562_33 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_38_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[4];
    spill562_34 = __stackOp562_38_0;
    (__stackOp562_38_0)[0] = new moom.vS(net.minecraft.init.Items.O, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_40(29857, (571551287229624681L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_41(24055, (7436137832784336920L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_42_0 = spill562_34;
    spill562_35 = __stackOp562_42_0;
    (__stackOp562_42_0)[1] = new moom.vS(net.minecraft.init.Items.bH, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_44(2402, (7265614336991775899L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_45(30429, (6150242555327755065L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_46_0 = spill562_35;
    spill562_36 = __stackOp562_46_0;
    (__stackOp562_46_0)[2] = new moom.vS(net.minecraft.init.Items.bG, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_48(11691, (4475638105217788009L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_49(16545, (206505524960200040L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_50_0 = spill562_36;
    spill562_37 = __stackOp562_50_0;
    (__stackOp562_50_0)[3] = new moom.vX(net.minecraft.init.Items.P, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_52(21303, (970162467545454313L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_53(1146, (791488778263609747L ^ life11_11))));
    (spill562_32)[spill562_33] = spill562_37;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_54_0 = spill562_31;
    spill562_38 = __stackOp562_54_0;
    spill562_39 = __stackOp562_54_0;
    spill562_40 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_55_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_41 = __stackOp562_55_0;
    (__stackOp562_55_0)[0] = new moom.vS(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU))), new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_58(2312, (6363957695418453203L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_59(27503, (7220817720611352208L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_60_0 = spill562_41;
    spill562_42 = __stackOp562_60_0;
    (__stackOp562_60_0)[1] = new moom.vX(net.minecraft.init.Items.bP, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_62(28613, (7739937026655889929L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_63(13486, (8483478002452099397L ^ life11_11))));
    (spill562_39)[spill562_40] = spill562_42;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_64_0 = spill562_38;
    spill562_43 = __stackOp562_64_0;
    spill562_44 = __stackOp562_64_0;
    spill562_45 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_65_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_46 = __stackOp562_65_0;
    (__stackOp562_65_0)[0] = new moom.vS(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a_))), new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_68(635, (3169205330340628410L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_69(13865, (6794229419396428785L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_70_0 = spill562_46;
    spill562_47 = __stackOp562_70_0;
    (__stackOp562_70_0)[1] = new moom.vX(net.minecraft.init.Items.e, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_72(3132, (9150462919710755281L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_73(22615, (755736017426816400L ^ life11_11))));
    (spill562_44)[spill562_45] = spill562_47;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_74_0 = spill562_43;
    spill562_48 = __stackOp562_74_0;
    spill562_49 = __stackOp562_74_0;
    spill562_50 = 3;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_75_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_51 = __stackOp562_75_0;
    (__stackOp562_75_0)[0] = new moom.vX(net.minecraft.init.Items.a2, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_77(18417, (7040706445792084512L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_78(13803, (7089296852716023809L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_79_0 = spill562_51;
    spill562_52 = __stackOp562_79_0;
    (__stackOp562_79_0)[1] = new moom.vX(net.minecraft.init.Items.aZ, new moom.DO(1, 1));
    (spill562_49)[spill562_50] = spill562_52;
    (spill562_29)[spill562_30] = spill562_48;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_81_0 = spill562_28;
    spill562_53 = __stackOp562_81_0;
    spill562_54 = __stackOp562_81_0;
    spill562_55 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_82_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2][];
    spill562_56 = __stackOp562_82_0;
    spill562_57 = __stackOp562_82_0;
    spill562_58 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_83_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[3];
    spill562_59 = __stackOp562_83_0;
    (__stackOp562_83_0)[0] = new moom.vS(net.minecraft.init.Items.F, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_85(11691, (4475638105217788009L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_86(29829, (5104748592102453587L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_87_0 = spill562_59;
    spill562_60 = __stackOp562_87_0;
    (__stackOp562_87_0)[1] = new moom.vS(net.minecraft.init.Items.h, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_89(11817, (6236419077065337845L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_90(11374, (1660411124881549756L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_91_0 = spill562_60;
    spill562_61 = __stackOp562_91_0;
    (__stackOp562_91_0)[2] = new net.minecraft.entity.passive.EntityVillager$ItemAndEmeraldToItem(net.minecraft.init.Items.aU, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_93(9596, (6858869411981484176L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_94(25127, (860781670817933289L ^ life11_11))), net.minecraft.init.Items.aV, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_96(25127, (860781670817933289L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_97(25127, (860781670817933289L ^ life11_11))));
    (spill562_57)[spill562_58] = spill562_61;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_98_0 = spill562_56;
    spill562_62 = __stackOp562_98_0;
    spill562_63 = __stackOp562_98_0;
    spill562_64 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_99_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[1];
    spill562_65 = __stackOp562_99_0;
    (__stackOp562_99_0)[0] = new moom.vW(net.minecraft.init.Items.aR, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_101(13000, (4623999677886789381L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_102(2312, (6363957695418453203L ^ life11_11))));
    (spill562_63)[spill562_64] = spill562_65;
    (spill562_54)[spill562_55] = spill562_62;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_103_0 = spill562_53;
    spill562_66 = __stackOp562_103_0;
    spill562_67 = __stackOp562_103_0;
    spill562_68 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_104_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2][];
    spill562_69 = __stackOp562_104_0;
    spill562_70 = __stackOp562_104_0;
    spill562_71 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_105_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_72 = __stackOp562_105_0;
    (__stackOp562_105_0)[0] = new moom.vS(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_108(11817, (6236419077065337845L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_109(21100, (9135088217290938294L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_110_0 = spill562_72;
    spill562_73 = __stackOp562_110_0;
    (__stackOp562_110_0)[1] = new moom.vX(net.minecraft.init.Items.a4, new moom.DO(3, 4));
    (spill562_70)[spill562_71] = spill562_73;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_112_0 = spill562_69;
    spill562_74 = __stackOp562_112_0;
    spill562_75 = __stackOp562_112_0;
    spill562_76 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_114_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_113(11817, (6236419077065337845L ^ life11_11))];
    spill562_77 = __stackOp562_114_0;
    (__stackOp562_114_0)[0] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, 0), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_117_0 = spill562_77;
    spill562_78 = __stackOp562_117_0;
    (__stackOp562_117_0)[1] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, 1), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_120_0 = spill562_78;
    spill562_79 = __stackOp562_120_0;
    (__stackOp562_120_0)[2] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, 2), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_123_0 = spill562_79;
    spill562_80 = __stackOp562_123_0;
    (__stackOp562_123_0)[3] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, 3), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_126_0 = spill562_80;
    spill562_81 = __stackOp562_126_0;
    (__stackOp562_126_0)[4] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, 4), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_129_0 = spill562_81;
    spill562_82 = __stackOp562_129_0;
    (__stackOp562_129_0)[5] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, 5), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_132_0 = spill562_82;
    spill562_83 = __stackOp562_132_0;
    (__stackOp562_132_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_133(25127, (860781670817933289L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_136(25127, (860781670817933289L ^ life11_11))), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_137_0 = spill562_83;
    spill562_84 = __stackOp562_137_0;
    (__stackOp562_137_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_138(13000, (4623999677886789381L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_141(13000, (4623999677886789381L ^ life11_11))), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_142_0 = spill562_84;
    spill562_85 = __stackOp562_142_0;
    (__stackOp562_142_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_143(2312, (6363957695418453203L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_146(2312, (6363957695418453203L ^ life11_11))), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_147_0 = spill562_85;
    spill562_86 = __stackOp562_147_0;
    (__stackOp562_147_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_148(8731, (1067743245286795230L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_151(2510, (3213361228925619205L ^ life11_11))), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_152_0 = spill562_86;
    spill562_87 = __stackOp562_152_0;
    (__stackOp562_152_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_153(7253, (1504271303101864321L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_156(14047, (9172589420626932496L ^ life11_11))), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_157_0 = spill562_87;
    spill562_88 = __stackOp562_157_0;
    (__stackOp562_157_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_158(3561, (8715500185001642004L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_161(25592, (2246446137460303366L ^ life11_11))), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_162_0 = spill562_88;
    spill562_89 = __stackOp562_162_0;
    (__stackOp562_162_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_163(13865, (6794229419396428785L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_166(13865, (6794229419396428785L ^ life11_11))), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_167_0 = spill562_89;
    spill562_90 = __stackOp562_167_0;
    (__stackOp562_167_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_168(27503, (7220817720611352208L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_171(27503, (7220817720611352208L ^ life11_11))), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_172_0 = spill562_90;
    spill562_91 = __stackOp562_172_0;
    (__stackOp562_172_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_173(29319, (8017892078606301033L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_176(29319, (8017892078606301033L ^ life11_11))), new moom.DO(1, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_177_0 = spill562_91;
    spill562_92 = __stackOp562_177_0;
    (__stackOp562_177_0)[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_178(11691, (4475638105217788009L ^ life11_11))] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_181(11691, (4475638105217788009L ^ life11_11))), new moom.DO(1, 2));
    (spill562_75)[spill562_76] = spill562_92;
    (spill562_67)[spill562_68] = spill562_74;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_182_0 = spill562_66;
    spill562_93 = __stackOp562_182_0;
    spill562_94 = __stackOp562_182_0;
    spill562_95 = 3;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_183_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2][];
    spill562_96 = __stackOp562_183_0;
    spill562_97 = __stackOp562_183_0;
    spill562_98 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_184_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_99 = __stackOp562_184_0;
    (__stackOp562_184_0)[0] = new moom.vS(net.minecraft.init.Items.F, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_186(11691, (4475638105217788009L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_187(29829, (5104748592102453587L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_188_0 = spill562_99;
    spill562_100 = __stackOp562_188_0;
    (__stackOp562_188_0)[1] = new moom.vX(net.minecraft.init.Items.g, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_190(20283, (2056513312430754526L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_191(20982, (3119140826213258283L ^ life11_11))));
    (spill562_97)[spill562_98] = spill562_100;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_192_0 = spill562_96;
    spill562_101 = __stackOp562_192_0;
    spill562_102 = __stackOp562_192_0;
    spill562_103 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_193_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_104 = __stackOp562_193_0;
    (__stackOp562_193_0)[0] = new moom.vX(net.minecraft.init.Items.f, new moom.DO(2, 3));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_195_0 = spill562_104;
    spill562_105 = __stackOp562_195_0;
    (__stackOp562_195_0)[1] = new net.minecraft.entity.passive.EntityVillager$ItemAndEmeraldToItem(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.n))), new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_198(14047, (9172589420626932496L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_199(14047, (9172589420626932496L ^ life11_11))), net.minecraft.init.Items.ak, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_201(25127, (860781670817933289L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_202(14047, (9172589420626932496L ^ life11_11))));
    (spill562_102)[spill562_103] = spill562_105;
    (spill562_94)[spill562_95] = spill562_101;
    (spill562_26)[spill562_27] = spill562_93;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] __stackOp562_203_0 = spill562_25;
    spill562_106 = __stackOp562_203_0;
    spill562_107 = __stackOp562_203_0;
    spill562_108 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_204_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[1][][];
    spill562_109 = __stackOp562_204_0;
    spill562_110 = __stackOp562_204_0;
    spill562_111 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_206_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[__sourceIntrinsic_eb8803ad1f63_invokedynamic562_205(25127, (860781670817933289L ^ life11_11))][];
    spill562_112 = __stackOp562_206_0;
    spill562_113 = __stackOp562_206_0;
    spill562_114 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_207_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_115 = __stackOp562_207_0;
    (__stackOp562_207_0)[0] = new moom.vS(net.minecraft.init.Items.aK, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_209(15967, (6108287117504838538L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_210(25145, (2501238378226722794L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_211_0 = spill562_115;
    spill562_116 = __stackOp562_211_0;
    (__stackOp562_211_0)[1] = new moom.vV();
    (spill562_113)[spill562_114] = spill562_116;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_212_0 = spill562_112;
    spill562_117 = __stackOp562_212_0;
    spill562_118 = __stackOp562_212_0;
    spill562_119 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_213_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[3];
    spill562_120 = __stackOp562_213_0;
    (__stackOp562_213_0)[0] = new moom.vS(net.minecraft.init.Items.aL, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_215(2312, (6363957695418453203L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_216(14047, (9172589420626932496L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_217_0 = spill562_120;
    spill562_121 = __stackOp562_217_0;
    (__stackOp562_217_0)[1] = new moom.vX(net.minecraft.init.Items.aQ, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_219(14047, (9172589420626932496L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_220(13865, (6794229419396428785L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_221_0 = spill562_121;
    spill562_122 = __stackOp562_221_0;
    (__stackOp562_221_0)[2] = new moom.vX(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X))), new moom.DO(3, 4));
    (spill562_118)[spill562_119] = spill562_122;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_224_0 = spill562_117;
    spill562_123 = __stackOp562_224_0;
    spill562_124 = __stackOp562_224_0;
    spill562_125 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_225_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[3];
    spill562_126 = __stackOp562_225_0;
    (__stackOp562_225_0)[0] = new moom.vS(net.minecraft.init.Items.bC, new moom.DO(2, 2));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_227_0 = spill562_126;
    spill562_127 = __stackOp562_227_0;
    (__stackOp562_227_0)[1] = new moom.vX(net.minecraft.init.Items.aS, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_229(14047, (9172589420626932496L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_230(13865, (6794229419396428785L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_231_0 = spill562_127;
    spill562_128 = __stackOp562_231_0;
    (__stackOp562_231_0)[2] = new moom.vX(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.w))), new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_234(10846, (8463370509381332925L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_235(13555, (3696690214809268500L ^ life11_11))));
    (spill562_124)[spill562_125] = spill562_128;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_236_0 = spill562_123;
    spill562_129 = __stackOp562_236_0;
    spill562_130 = __stackOp562_236_0;
    spill562_131 = 3;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_237_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[1];
    spill562_132 = __stackOp562_237_0;
    (__stackOp562_237_0)[0] = new moom.vV();
    (spill562_130)[spill562_131] = spill562_132;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_238_0 = spill562_129;
    spill562_133 = __stackOp562_238_0;
    spill562_134 = __stackOp562_238_0;
    spill562_135 = 4;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_239_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[1];
    spill562_136 = __stackOp562_239_0;
    (__stackOp562_239_0)[0] = new moom.vV();
    (spill562_134)[spill562_135] = spill562_136;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_240_0 = spill562_133;
    spill562_137 = __stackOp562_240_0;
    spill562_138 = __stackOp562_240_0;
    spill562_139 = 5;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_241_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[1];
    spill562_140 = __stackOp562_241_0;
    (__stackOp562_241_0)[0] = new moom.vX(net.minecraft.init.Items.b3, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_243(29829, (5104748592102453587L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_244(21100, (9135088217290938294L ^ life11_11))));
    (spill562_138)[spill562_139] = spill562_140;
    (spill562_110)[spill562_111] = spill562_137;
    (spill562_107)[spill562_108] = spill562_109;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] __stackOp562_245_0 = spill562_106;
    spill562_141 = __stackOp562_245_0;
    spill562_142 = __stackOp562_245_0;
    spill562_143 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_246_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[1][][];
    spill562_144 = __stackOp562_246_0;
    spill562_145 = __stackOp562_246_0;
    spill562_146 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_247_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[4][];
    spill562_147 = __stackOp562_247_0;
    spill562_148 = __stackOp562_247_0;
    spill562_149 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_248_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_150 = __stackOp562_248_0;
    (__stackOp562_248_0)[0] = new moom.vS(net.minecraft.init.Items.bi, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_250(6685, (8308070226404433883L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_251(8605, (8371295884117337193L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_252_0 = spill562_150;
    spill562_151 = __stackOp562_252_0;
    (__stackOp562_252_0)[1] = new moom.vS(net.minecraft.init.Items.k, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_254(2312, (6363957695418453203L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_255(14047, (9172589420626932496L ^ life11_11))));
    (spill562_148)[spill562_149] = spill562_151;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_256_0 = spill562_147;
    spill562_152 = __stackOp562_256_0;
    spill562_153 = __stackOp562_256_0;
    spill562_154 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_257_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_155 = __stackOp562_257_0;
    (__stackOp562_257_0)[0] = new moom.vX(net.minecraft.init.Items.aC, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_259(18987, (6535522351466745809L ^ life11_11)), -1));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_260_0 = spill562_155;
    spill562_156 = __stackOp562_260_0;
    (__stackOp562_260_0)[1] = new moom.vX(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b()), new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_264(13486, (8483478002452099397L ^ life11_11)), -1));
    (spill562_153)[spill562_154] = spill562_156;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_265_0 = spill562_152;
    spill562_157 = __stackOp562_265_0;
    spill562_158 = __stackOp562_265_0;
    spill562_159 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_266_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_160 = __stackOp562_266_0;
    (__stackOp562_266_0)[0] = new moom.vX(net.minecraft.init.Items.bw, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_268(13000, (4623999677886789381L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_269(25592, (2246446137460303366L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_270_0 = spill562_160;
    spill562_161 = __stackOp562_270_0;
    (__stackOp562_270_0)[1] = new moom.vX(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aX))), new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_273(13555, (3696690214809268500L ^ life11_11)), -1));
    (spill562_158)[spill562_159] = spill562_161;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_274_0 = spill562_157;
    spill562_162 = __stackOp562_274_0;
    spill562_163 = __stackOp562_274_0;
    spill562_164 = 3;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_275_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[1];
    spill562_165 = __stackOp562_275_0;
    (__stackOp562_275_0)[0] = new moom.vX(net.minecraft.init.Items.bz, new moom.DO(3, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_277(25592, (2246446137460303366L ^ life11_11))));
    (spill562_163)[spill562_164] = spill562_165;
    (spill562_145)[spill562_146] = spill562_162;
    (spill562_142)[spill562_143] = spill562_144;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] __stackOp562_278_0 = spill562_141;
    spill562_166 = __stackOp562_278_0;
    spill562_167 = __stackOp562_278_0;
    spill562_168 = 3;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_279_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[3][][];
    spill562_169 = __stackOp562_279_0;
    spill562_170 = __stackOp562_279_0;
    spill562_171 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_280_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[4][];
    spill562_172 = __stackOp562_280_0;
    spill562_173 = __stackOp562_280_0;
    spill562_174 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_281_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_175 = __stackOp562_281_0;
    (__stackOp562_281_0)[0] = new moom.vS(net.minecraft.init.Items.h, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_283(11817, (6236419077065337845L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_284(15967, (6108287117504838538L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_285_0 = spill562_175;
    spill562_176 = __stackOp562_285_0;
    (__stackOp562_285_0)[1] = new moom.vX(net.minecraft.init.Items.Y, new moom.DO(4, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_287(25127, (860781670817933289L ^ life11_11))));
    (spill562_173)[spill562_174] = spill562_176;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_288_0 = spill562_172;
    spill562_177 = __stackOp562_288_0;
    spill562_178 = __stackOp562_288_0;
    spill562_179 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_289_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_180 = __stackOp562_289_0;
    (__stackOp562_289_0)[0] = new moom.vS(net.minecraft.init.Items.j, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_291(13000, (4623999677886789381L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_292(2510, (3213361228925619205L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_293_0 = spill562_180;
    spill562_181 = __stackOp562_293_0;
    (__stackOp562_293_0)[1] = new moom.vX(net.minecraft.init.Items.Z, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_295(14047, (9172589420626932496L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_296(29319, (8017892078606301033L ^ life11_11))));
    (spill562_178)[spill562_179] = spill562_181;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_297_0 = spill562_177;
    spill562_182 = __stackOp562_297_0;
    spill562_183 = __stackOp562_297_0;
    spill562_184 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_298_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_185 = __stackOp562_298_0;
    (__stackOp562_298_0)[0] = new moom.vS(net.minecraft.init.Items.i, new moom.DO(3, 4));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_300_0 = spill562_185;
    spill562_186 = __stackOp562_300_0;
    (__stackOp562_300_0)[1] = new moom.vW(net.minecraft.init.Items.ad, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_302(11817, (6236419077065337845L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_303(16545, (206505524960200040L ^ life11_11))));
    (spill562_183)[spill562_184] = spill562_186;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_304_0 = spill562_182;
    spill562_187 = __stackOp562_304_0;
    spill562_188 = __stackOp562_304_0;
    spill562_189 = 3;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_305_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[4];
    spill562_190 = __stackOp562_305_0;
    (__stackOp562_305_0)[0] = new moom.vX(net.minecraft.init.Items.X, new moom.DO(5, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_307(13000, (4623999677886789381L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_308_0 = spill562_190;
    spill562_191 = __stackOp562_308_0;
    (__stackOp562_308_0)[1] = new moom.vX(net.minecraft.init.Items.W, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_310(2510, (3213361228925619205L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_311(25592, (2246446137460303366L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_312_0 = spill562_191;
    spill562_192 = __stackOp562_312_0;
    (__stackOp562_312_0)[2] = new moom.vX(net.minecraft.init.Items.U, new moom.DO(5, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_314(13000, (4623999677886789381L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_315_0 = spill562_192;
    spill562_193 = __stackOp562_315_0;
    (__stackOp562_315_0)[3] = new moom.vX(net.minecraft.init.Items.V, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_317(25592, (2246446137460303366L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_318(11691, (4475638105217788009L ^ life11_11))));
    (spill562_188)[spill562_189] = spill562_193;
    (spill562_170)[spill562_171] = spill562_187;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_319_0 = spill562_169;
    spill562_194 = __stackOp562_319_0;
    spill562_195 = __stackOp562_319_0;
    spill562_196 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_320_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[3][];
    spill562_197 = __stackOp562_320_0;
    spill562_198 = __stackOp562_320_0;
    spill562_199 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_321_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_200 = __stackOp562_321_0;
    (__stackOp562_321_0)[0] = new moom.vS(net.minecraft.init.Items.h, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_323(11817, (6236419077065337845L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_324(15967, (6108287117504838538L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_325_0 = spill562_200;
    spill562_201 = __stackOp562_325_0;
    (__stackOp562_325_0)[1] = new moom.vX(net.minecraft.init.Items.c, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_327(25127, (860781670817933289L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_328(2312, (6363957695418453203L ^ life11_11))));
    (spill562_198)[spill562_199] = spill562_201;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_329_0 = spill562_197;
    spill562_202 = __stackOp562_329_0;
    spill562_203 = __stackOp562_329_0;
    spill562_204 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_330_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_205 = __stackOp562_330_0;
    (__stackOp562_330_0)[0] = new moom.vS(net.minecraft.init.Items.j, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_332(13000, (4623999677886789381L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_333(2510, (3213361228925619205L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_334_0 = spill562_205;
    spill562_206 = __stackOp562_334_0;
    (__stackOp562_334_0)[1] = new moom.vW(net.minecraft.init.Items.l, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_336(2510, (3213361228925619205L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_337(14047, (9172589420626932496L ^ life11_11))));
    (spill562_203)[spill562_204] = spill562_206;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_338_0 = spill562_202;
    spill562_207 = __stackOp562_338_0;
    spill562_208 = __stackOp562_338_0;
    spill562_209 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_339_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[3];
    spill562_210 = __stackOp562_339_0;
    (__stackOp562_339_0)[0] = new moom.vS(net.minecraft.init.Items.i, new moom.DO(3, 4));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_341_0 = spill562_210;
    spill562_211 = __stackOp562_341_0;
    (__stackOp562_341_0)[1] = new moom.vW(net.minecraft.init.Items.u, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_343(13865, (6794229419396428785L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_344(11691, (4475638105217788009L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_345_0 = spill562_211;
    spill562_212 = __stackOp562_345_0;
    (__stackOp562_345_0)[2] = new moom.vW(net.minecraft.init.Items.x, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_347(2510, (3213361228925619205L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_348(13865, (6794229419396428785L ^ life11_11))));
    (spill562_208)[spill562_209] = spill562_212;
    (spill562_195)[spill562_196] = spill562_207;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_349_0 = spill562_194;
    spill562_213 = __stackOp562_349_0;
    spill562_214 = __stackOp562_349_0;
    spill562_215 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_350_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[3][];
    spill562_216 = __stackOp562_350_0;
    spill562_217 = __stackOp562_350_0;
    spill562_218 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_351_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_219 = __stackOp562_351_0;
    (__stackOp562_351_0)[0] = new moom.vS(net.minecraft.init.Items.h, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_353(11817, (6236419077065337845L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_354(15967, (6108287117504838538L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_355_0 = spill562_219;
    spill562_220 = __stackOp562_355_0;
    (__stackOp562_355_0)[1] = new moom.vW(net.minecraft.init.Items.a, new moom.DO(5, __sourceIntrinsic_eb8803ad1f63_invokedynamic562_357(13000, (4623999677886789381L ^ life11_11))));
    (spill562_217)[spill562_218] = spill562_220;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_358_0 = spill562_216;
    spill562_221 = __stackOp562_358_0;
    spill562_222 = __stackOp562_358_0;
    spill562_223 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_359_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_224 = __stackOp562_359_0;
    (__stackOp562_359_0)[0] = new moom.vS(net.minecraft.init.Items.j, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_361(13000, (4623999677886789381L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_362(2510, (3213361228925619205L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_363_0 = spill562_224;
    spill562_225 = __stackOp562_363_0;
    (__stackOp562_363_0)[1] = new moom.vW(net.minecraft.init.Items.b, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_365(2510, (3213361228925619205L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_366(25592, (2246446137460303366L ^ life11_11))));
    (spill562_222)[spill562_223] = spill562_225;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_367_0 = spill562_221;
    spill562_226 = __stackOp562_367_0;
    spill562_227 = __stackOp562_367_0;
    spill562_228 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_368_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_229 = __stackOp562_368_0;
    (__stackOp562_368_0)[0] = new moom.vS(net.minecraft.init.Items.i, new moom.DO(3, 4));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_370_0 = spill562_229;
    spill562_230 = __stackOp562_370_0;
    (__stackOp562_370_0)[1] = new moom.vW(net.minecraft.init.Items.w, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_372(13865, (6794229419396428785L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_373(11691, (4475638105217788009L ^ life11_11))));
    (spill562_227)[spill562_228] = spill562_230;
    (spill562_214)[spill562_215] = spill562_226;
    (spill562_167)[spill562_168] = spill562_213;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][][] __stackOp562_374_0 = spill562_166;
    spill562_231 = __stackOp562_374_0;
    spill562_232 = __stackOp562_374_0;
    spill562_233 = 4;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_375_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2][][];
    spill562_234 = __stackOp562_375_0;
    spill562_235 = __stackOp562_375_0;
    spill562_236 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_376_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2][];
    spill562_237 = __stackOp562_376_0;
    spill562_238 = __stackOp562_376_0;
    spill562_239 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_377_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_240 = __stackOp562_377_0;
    (__stackOp562_377_0)[0] = new moom.vS(net.minecraft.init.Items.al, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_379(29319, (8017892078606301033L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_380(3710, (2139840529167240097L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_381_0 = spill562_240;
    spill562_241 = __stackOp562_381_0;
    (__stackOp562_381_0)[1] = new moom.vS(net.minecraft.init.Items.a_, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_383(29319, (8017892078606301033L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_384(3710, (2139840529167240097L ^ life11_11))));
    (spill562_238)[spill562_239] = spill562_241;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_385_0 = spill562_237;
    spill562_242 = __stackOp562_385_0;
    spill562_243 = __stackOp562_385_0;
    spill562_244 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_386_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[3];
    spill562_245 = __stackOp562_386_0;
    (__stackOp562_386_0)[0] = new moom.vS(net.minecraft.init.Items.h, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_388(11817, (6236419077065337845L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_389(15967, (6108287117504838538L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_390_0 = spill562_245;
    spill562_246 = __stackOp562_390_0;
    (__stackOp562_390_0)[1] = new moom.vX(net.minecraft.init.Items.am, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_392(8884, (3042785674725386070L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_393(10846, (8463370509381332925L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_394_0 = spill562_246;
    spill562_247 = __stackOp562_394_0;
    (__stackOp562_394_0)[2] = new moom.vX(net.minecraft.init.Items.ba, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_396(15648, (4624325290081581280L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_397(27644, (3201588825625996826L ^ life11_11))));
    (spill562_243)[spill562_244] = spill562_247;
    (spill562_235)[spill562_236] = spill562_242;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] __stackOp562_398_0 = spill562_234;
    spill562_248 = __stackOp562_398_0;
    spill562_249 = __stackOp562_398_0;
    spill562_250 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_399_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[3][];
    spill562_251 = __stackOp562_399_0;
    spill562_252 = __stackOp562_399_0;
    spill562_253 = 0;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_400_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[2];
    spill562_254 = __stackOp562_400_0;
    (__stackOp562_400_0)[0] = new moom.vS(net.minecraft.init.Items.aF, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_402(2510, (3213361228925619205L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_403(13865, (6794229419396428785L ^ life11_11))));
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_404_0 = spill562_254;
    spill562_255 = __stackOp562_404_0;
    (__stackOp562_404_0)[1] = new moom.vX(net.minecraft.init.Items.S, new moom.DO(2, 4));
    (spill562_252)[spill562_253] = spill562_255;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_406_0 = spill562_251;
    spill562_256 = __stackOp562_406_0;
    spill562_257 = __stackOp562_406_0;
    spill562_258 = 1;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_407_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[1];
    spill562_259 = __stackOp562_407_0;
    (__stackOp562_407_0)[0] = new moom.vW(net.minecraft.init.Items.R, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_409(13000, (4623999677886789381L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_410(13865, (6794229419396428785L ^ life11_11))));
    (spill562_257)[spill562_258] = spill562_259;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] __stackOp562_411_0 = spill562_256;
    spill562_260 = __stackOp562_411_0;
    spill562_261 = __stackOp562_411_0;
    spill562_262 = 2;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] __stackOp562_412_0 = new net.minecraft.entity.passive.EntityVillager$ITradeList[1];
    spill562_263 = __stackOp562_412_0;
    (__stackOp562_412_0)[0] = new moom.vX(net.minecraft.init.Items.aA, new moom.DO(__sourceIntrinsic_eb8803ad1f63_invokedynamic562_414(2312, (6363957695418453203L ^ life11_11)), __sourceIntrinsic_eb8803ad1f63_invokedynamic562_415(14047, (9172589420626932496L ^ life11_11))));
    (spill562_261)[spill562_262] = spill562_263;
    (spill562_249)[spill562_250] = spill562_260;
    (spill562_232)[spill562_233] = spill562_248;
    cp = ((net.minecraft.entity.passive.EntityVillager$ITradeList[][][][])(spill562_231));
}

private static native <E extends Throwable> void __sourceConstructorInit_ac2c268a52c386d0_0(net.minecraft.entity.passive.EntityVillager a0, net.minecraft.world.World a1) throws E;

public boolean S__Boolean() {
return ((0) != 0);
}


private void Z__sourceReturn_da8c82d5d4() {
net.minecraft.entity.passive.EntityVillager lexicalValue1608_39_0;
    net.minecraft.entity.passive.EntityVillager lexicalValue1608_52_0;
    int lexicalValue1608_70_0;
    int spill1608_0;
    net.minecraft.entity.passive.EntityVillager spill1608_1;
    net.minecraft.entity.passive.EntityVillager spill1608_2;
    net.minecraft.entity.passive.EntityVillager spill1608_3;
    int spill1608_4;
    long life1_3;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][][] life4_9;
    int life3_10;
    int life5_76;
    int life6_81;
    net.minecraft.entity.passive.EntityVillager$ITradeList[][] life7_85;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] life8_100;
    net.minecraft.entity.passive.EntityVillager$ITradeList[] life9_102;
    int life10_105;
    int life11_107;
    net.minecraft.entity.passive.EntityVillager$ITradeList life12_114;
    lexical_join_100: {
    lexical_join_70: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_41: {
    lexical_join_39: {
    lexical_join_29: {
    life1_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 133002067486594L);
    spill1608_0 = moom.vR.c();
    life4_9 = (net.minecraft.entity.passive.EntityVillager.cp)[((net.minecraft.entity.passive.EntityVillager)(this)).r__sourceReturn_8abf5c6871()];
    life3_10 = spill1608_0;
    spill1608_1 = this;
    if (!((life3_10 == 0))) {
        lexicalValue1608_39_0 = spill1608_1;
        break lexical_join_39;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill1608_1)).ck != 0))) {
        break lexical_join_29;
    }
    spill1608_2 = this;
    if (!((life3_10 == 0))) {
        lexicalValue1608_39_0 = spill1608_2;
        break lexical_join_39;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill1608_2)).cl != 0))) {
        break lexical_join_29;
    }
    net.minecraft.entity.passive.EntityVillager __stackOp1608_6_0 = this;
    ((net.minecraft.entity.passive.EntityVillager)(__stackOp1608_6_0)).cl = ((int)((((net.minecraft.entity.passive.EntityVillager)(__stackOp1608_6_0)).cl + 1)));
    if (!((life3_10 != 0))) {
        break lexical_join_41;
    }
    }
    this.ck = ((int)((((java.util.Random)(this.ah)).nextInt(((int)((life4_9).length))) + 1)));
    lexicalValue1608_39_0 = this;
    }
    ((net.minecraft.entity.passive.EntityVillager)(lexicalValue1608_39_0)).cl = ((int)(1));
    }
    spill1608_3 = this;
    if (!((life3_10 == 0))) {
        lexicalValue1608_52_0 = spill1608_3;
        break lexical_join_52;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill1608_3)).ce == null))) {
        break lexical_join_51;
    }
    this.ce = ((moom.OF)(new moom.OF()));
    }
    lexicalValue1608_52_0 = this;
    }
    life5_76 = (((net.minecraft.entity.passive.EntityVillager)(lexicalValue1608_52_0)).ck - 1);
    life6_81 = (this.cl - 1);
    life7_85 = (life4_9)[life5_76];
    spill1608_4 = life6_81;
    if (!((life3_10 == 0))) {
        lexicalValue1608_70_0 = spill1608_4;
        break lexical_join_70;
    }
    if (!((spill1608_4 >= 0))) {
        break lexical_join_100;
    }
    lexicalValue1608_70_0 = life6_81;
    }
    if (!((lexicalValue1608_70_0 < (life7_85).length))) {
        break lexical_join_100;
    }
    life8_100 = (life7_85)[life6_81];
    life9_102 = life8_100;
    life10_105 = (life9_102).length;
    life11_107 = 0;
    lexical_cycle_84: while (true) {
    if (!((life11_107 < life10_105))) {
        break lexical_join_100;
    }
    life12_114 = (life9_102)[life11_107];
    ((net.minecraft.entity.passive.EntityVillager$ITradeList)(life12_114)).a(((moom.OF)(this.ce)), ((java.util.Random)(this.ah)));
    life11_107 += 1;
    if (!((life3_10 != 0))) { continue lexical_cycle_84; }
    break lexical_cycle_84;
    }
    }
    return;
}


protected java.lang.String i__String() {
long local1 = (net.minecraft.entity.passive.EntityVillager.ib ^ 79762056382740L);
    return ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.passive.EntityVillager)(this)).af()) != 0) ? "mob.villager.haggle" : "mob.villager.idle");
}


public boolean b__Boolean(int p0, net.minecraft.item.ItemStack p1) {
int forwardValue5351_22_0;
    int forwardValue5351_42_0;
    boolean spill5351_0;
    int spill5351_1;
    int spill5351_2;
    long life3_3;
    int life5_5;
    int life6_27;
    forward_join_42: {
    forward_join_41: {
    forward_join_22: {
    forward_join_15: {
    life3_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 28398991662530L);
    life5_5 = moom.vR.b();
    spill5351_0 = super.b__Boolean(((int)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    if (!((life5_5 != 0))) {
        forwardValue5351_22_0 = ((spill5351_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill5351_0)) {
        break forward_join_15;
    }
    return ((1) != 0);
    }
    forwardValue5351_22_0 = (p0 - __sourceIntrinsic_7722627b66bb_invokedynamic5351_5(3890, (7028915402612143103L ^ life3_3)));
    }
    life6_27 = forwardValue5351_22_0;
    spill5351_1 = life6_27;
    if (!((life5_5 != 0))) {
        forwardValue5351_42_0 = spill5351_1;
        break forward_join_42;
    }
    if (!((spill5351_1 >= 0))) {
        break forward_join_41;
    }
    spill5351_2 = life6_27;
    if (!((life5_5 != 0))) {
        forwardValue5351_42_0 = spill5351_2;
        break forward_join_42;
    }
    if (!((spill5351_2 < ((moom.wq)(this.co)).b__Int()))) {
        break forward_join_41;
    }
    ((moom.wq)(this.co)).a__Void(((int)(life6_27)), ((net.minecraft.item.ItemStack)(p1)));
    return ((1) != 0);
    }
    forwardValue5351_42_0 = 0;
    }
    return ((forwardValue5351_42_0) != 0);
}


public void b(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.EntityLivingBase forwardValue5350_15_0;
    net.minecraft.entity.EntityLivingBase forwardValue5350_23_0;
    int forwardValue5350_28_0;
    int forwardValue5350_51_0;
    net.minecraft.entity.passive.EntityVillager forwardValue5350_53_0;
    int spill5350_0;
    net.minecraft.entity.passive.EntityVillager spill5350_1;
    int spill5350_2;
    boolean spill5350_3;
    net.minecraft.entity.passive.EntityVillager spill5350_4;
    long life2_3;
    int life4_8;
    int life5_43;
    forward_join_61: {
    forward_join_53: {
    forward_join_51: {
    forward_join_40: {
    forward_join_28: {
    forward_join_23: {
    forward_join_15: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 80782459878295L);
    spill5350_0 = moom.vR.c();
    super.b(((net.minecraft.entity.EntityLivingBase)(p0)));
    life4_8 = spill5350_0;
    spill5350_1 = this;
    if (!((life4_8 == 0))) {
        forwardValue5350_15_0 = spill5350_1;
        break forward_join_15;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill5350_1)).cc != null))) {
        break forward_join_61;
    }
    forwardValue5350_15_0 = p0;
    }
    if (!((life4_8 == 0))) {
        forwardValue5350_23_0 = forwardValue5350_15_0;
        break forward_join_23;
    }
    if (!((forwardValue5350_15_0 != null))) {
        break forward_join_61;
    }
    ((net.minecraft.village.Village)(this.cc)).a__Void(((net.minecraft.entity.EntityLivingBase)(p0)));
    forwardValue5350_23_0 = p0;
    }
    spill5350_2 = ((forwardValue5350_23_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_8 == 0))) {
        forwardValue5350_28_0 = spill5350_2;
        break forward_join_28;
    }
    if (!((spill5350_2 != 0))) {
        break forward_join_61;
    }
    forwardValue5350_28_0 = -1;
    }
    life5_43 = forwardValue5350_28_0;
    spill5350_3 = ((net.minecraft.entity.passive.EntityVillager)(this)).c__Boolean();
    if (!((life4_8 == 0))) {
        forwardValue5350_51_0 = ((spill5350_3) ? 1 : 0);
        break forward_join_51;
    }
    if (!(spill5350_3)) {
        break forward_join_40;
    }
    life5_43 = __sourceIntrinsic_a628b713ec83_invokedynamic5350_9(13555, (3696719221602365040L ^ life2_3));
    }
    ((net.minecraft.village.Village)(this.cc)).a(((java.lang.String)(((net.minecraft.entity.EntityLivingBase)(p0)).a__String())), ((int)(life5_43)));
    spill5350_4 = this;
    if (!((life4_8 == 0))) {
        forwardValue5350_53_0 = spill5350_4;
        break forward_join_53;
    }
    forwardValue5350_51_0 = ((((net.minecraft.entity.passive.EntityVillager)(spill5350_4)).p__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5350_51_0 != 0))) {
        break forward_join_61;
    }
    forwardValue5350_53_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityVillager)(forwardValue5350_53_0)).i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_a628b713ec83_invokedynamic5350_16(27503, (7220771947776012788L ^ life2_3)))));
    }
    return;
}


public boolean ad() {
return ((((this.ca) ? 1 : 0)) != 0);
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20375;
      if (kb[var3] == null) {
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
         long var5 = jb[var3];
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
         Object[] var9 = (Object[])xb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               xb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sV", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         kb[var3] = var15;
      }

      return kb[var3];
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_f17a2d20d02cf9(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public float e__Float() {
long local1 = (net.minecraft.entity.passive.EntityVillager.ib ^ 58252480938939L);
    float local3 = 0x1.9eb852p0f;
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.passive.EntityVillager)(this)).c__Boolean()) != 0)) {
        local3 = ((float) (((double) local3) - 0x1.9eb851eb851ecp-1d));
    }
    return local3;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11674_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean ae() {
return ((((this.cb) ? 1 : 0)) != 0);
}


protected java.lang.String c__String() {
return "mob.villager.hit";
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound lexicalValue1613_62_0;
    java.lang.String lexicalValue1613_62_1;
    int lexicalValue1613_62_2;
    int spill1613_0;
    net.minecraft.nbt.NBTTagCompound spill1613_1;
    java.lang.String spill1613_2;
    int spill1613_3;
    long life2_3;
    int life4_13;
    net.minecraft.nbt.NBTTagCompound life5_51;
    net.minecraft.nbt.NBTTagList life5_66;
    int life6_68;
    net.minecraft.item.ItemStack life7_77;
    lexical_join_94: {
    lexical_join_89: {
    lexical_join_62: {
    lexical_join_55: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 81479127306293L);
    spill1613_0 = moom.vR.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.passive.EntityVillager)(this)).m(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Profession"))))));
    life4_13 = spill1613_0;
    this.ci = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Riches")))));
    this.ck = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Career")))));
    this.cl = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CareerLevel")))));
    this.ch = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Willing")))));
    spill1613_1 = p0;
    spill1613_2 = "Offers";
    spill1613_3 = __sourceIntrinsic_01f4e1cd062e_invokedynamic1613_13(14047, (9172632570686539734L ^ life2_3));
    if (!((life4_13 != 0))) {
        lexicalValue1613_62_0 = spill1613_1;
        lexicalValue1613_62_1 = spill1613_2;
        lexicalValue1613_62_2 = spill1613_3;
        break lexical_join_62;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill1613_1)).a__Boolean(((java.lang.String)(spill1613_2)), ((int)(spill1613_3))))) {
        break lexical_join_55;
    }
    life5_51 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("Offers")));
    this.ce = ((moom.OF)(new moom.OF(life5_51)));
    }
    lexicalValue1613_62_0 = p0;
    lexicalValue1613_62_1 = "Inventory";
    lexicalValue1613_62_2 = __sourceIntrinsic_01f4e1cd062e_invokedynamic1613_17(14047, (9172632570686539734L ^ life2_3));
    }
    life5_66 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1613_62_0)).a(((java.lang.String)(lexicalValue1613_62_1)), ((int)(lexicalValue1613_62_2)));
    life6_68 = 0;
    lexical_cycle_66: while (true) {
    lexical_join_87: {
    lexical_join_86: {
    if (!((life6_68 < ((net.minecraft.nbt.NBTTagList)(life5_66)).a__Int()))) {
        break lexical_join_89;
    }
    life7_77 = __sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_66)).a__yw(((int)(life6_68))))));
    if (!((life4_13 != 0))) {
        break lexical_join_94;
    }
    if (!((life4_13 != 0))) {
        break lexical_join_87;
    }
    if (!((life7_77 != null))) {
        break lexical_join_86;
    }
    ((moom.wq)(this.co)).a(((net.minecraft.item.ItemStack)(life7_77)));
    }
    life6_68 += 1;
    }
    if (!((life4_13 == 0))) { continue lexical_cycle_66; }
    break lexical_cycle_66;
    }
    }
    ((net.minecraft.entity.passive.EntityVillager)(this)).i(((boolean)(true)));
    ((net.minecraft.entity.passive.EntityVillager)(this)).Y__sourceReturn_da8c82d5d4();
    }
    return;
}


private boolean c__sourceReturn_9a6ad9dfe5(int p0) {
int lexicalValue1612_12_0;
    int lexicalValue1612_14_0;
    net.minecraft.item.Item lexicalValue1612_48_0;
    net.minecraft.item.Item lexicalValue1612_48_1;
    net.minecraft.item.Item lexicalValue1612_68_0;
    net.minecraft.item.Item lexicalValue1612_68_1;
    net.minecraft.item.ItemStack lexicalValue1612_70_0;
    int lexicalValue1612_82_0;
    int lexicalValue1612_84_0;
    net.minecraft.item.ItemStack lexicalValue1612_92_0;
    int lexicalValue1612_104_0;
    int spill1612_0;
    net.minecraft.item.Item spill1612_1;
    net.minecraft.item.Item spill1612_2;
    int spill1612_3;
    int spill1612_4;
    net.minecraft.item.ItemStack spill1612_5;
    int spill1612_6;
    net.minecraft.item.ItemStack spill1612_7;
    int spill1612_8;
    long life2_3;
    int life4_5;
    int life5_17;
    int life6_19;
    net.minecraft.item.ItemStack life7_29;
    lexical_join_108: {
    lexical_join_14: {
    lexical_join_13: {
    lexical_join_12: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 63443328517995L);
    life4_5 = moom.vR.b();
    spill1612_0 = ((net.minecraft.entity.passive.EntityVillager)(this)).r__sourceReturn_8abf5c6871();
    if (!((life4_5 != 0))) {
        lexicalValue1612_12_0 = spill1612_0;
        break lexical_join_12;
    }
    if (!((spill1612_0 == 0))) {
        break lexical_join_13;
    }
    lexicalValue1612_12_0 = 1;
    }
    lexicalValue1612_14_0 = lexicalValue1612_12_0;
    break lexical_join_14;
    }
    lexicalValue1612_14_0 = 0;
    }
    life5_17 = lexicalValue1612_14_0;
    life6_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_106: {
    lexical_join_105: {
    lexical_join_104: {
    lexical_join_92: {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_81: {
    lexical_join_70: {
    lexical_join_68: {
    lexical_join_63: {
    lexical_join_48: {
    lexical_join_45: {
    if (!((life6_19 < ((moom.wq)(this.co)).b__Int()))) {
        break lexical_join_108;
    }
    life7_29 = ((moom.wq)(this.co)).a__xW(((int)(life6_19)));
    if (!((life4_5 != 0))) {
        break lexical_join_106;
    }
    if (!((life7_29 != null))) {
        break lexical_join_105;
    }
    spill1612_1 = ((net.minecraft.item.ItemStack)(life7_29)).a__wQ();
    spill1612_2 = net.minecraft.init.Items.P;
    if (!((life4_5 != 0))) {
        lexicalValue1612_48_0 = spill1612_1;
        lexicalValue1612_48_1 = spill1612_2;
        break lexical_join_48;
    }
    if (!((spill1612_1 == spill1612_2))) {
        break lexical_join_45;
    }
    spill1612_3 = ((net.minecraft.item.ItemStack)(life7_29)).b;
    if (!((life4_5 != 0))) {
        lexicalValue1612_82_0 = spill1612_3;
        break lexical_join_82;
    }
    if (!((spill1612_3 < (3 * p0)))) {
        break lexical_join_81;
    }
    }
    lexicalValue1612_48_0 = ((net.minecraft.item.ItemStack)(life7_29)).a__wQ();
    lexicalValue1612_48_1 = net.minecraft.init.Items.bH;
    }
    if (!((life4_5 != 0))) {
        lexicalValue1612_68_0 = lexicalValue1612_48_0;
        lexicalValue1612_68_1 = lexicalValue1612_48_1;
        break lexical_join_68;
    }
    if (!((lexicalValue1612_48_0 == lexicalValue1612_48_1))) {
        break lexical_join_63;
    }
    spill1612_4 = ((net.minecraft.item.ItemStack)(life7_29)).b;
    if (!((life4_5 != 0))) {
        lexicalValue1612_82_0 = spill1612_4;
        break lexical_join_82;
    }
    if (!((spill1612_4 < (__sourceIntrinsic_63673aced462_invokedynamic1612_13(13865, (6794148164272410729L ^ life2_3)) * p0)))) {
        break lexical_join_81;
    }
    }
    spill1612_5 = life7_29;
    if (!((life4_5 != 0))) {
        lexicalValue1612_70_0 = spill1612_5;
        break lexical_join_70;
    }
    lexicalValue1612_68_0 = ((net.minecraft.item.ItemStack)(spill1612_5)).a__wQ();
    lexicalValue1612_68_1 = net.minecraft.init.Items.bG;
    }
    if (!((lexicalValue1612_68_0 == lexicalValue1612_68_1))) {
        break lexical_join_83;
    }
    lexicalValue1612_70_0 = life7_29;
    }
    spill1612_6 = ((net.minecraft.item.ItemStack)(lexicalValue1612_70_0)).b;
    if (!((life4_5 != 0))) {
        lexicalValue1612_84_0 = spill1612_6;
        break lexical_join_84;
    }
    if (!((spill1612_6 >= (__sourceIntrinsic_63673aced462_invokedynamic1612_17(13865, (6794148164272410729L ^ life2_3)) * p0)))) {
        break lexical_join_83;
    }
    }
    lexicalValue1612_82_0 = 1;
    }
    return ((lexicalValue1612_82_0) != 0);
    }
    lexicalValue1612_84_0 = life5_17;
    }
    if (!((lexicalValue1612_84_0 != 0))) {
        break lexical_join_105;
    }
    spill1612_7 = life7_29;
    if (!((life4_5 != 0))) {
        lexicalValue1612_92_0 = spill1612_7;
        break lexical_join_92;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1612_7)).a__wQ() == net.minecraft.init.Items.O))) {
        break lexical_join_105;
    }
    lexicalValue1612_92_0 = life7_29;
    }
    spill1612_8 = ((net.minecraft.item.ItemStack)(lexicalValue1612_92_0)).b;
    if (!((life4_5 != 0))) {
        lexicalValue1612_104_0 = spill1612_8;
        break lexical_join_104;
    }
    if (!((spill1612_8 >= (__sourceIntrinsic_63673aced462_invokedynamic1612_22(2510, (3213456227449859997L ^ life2_3)) * p0)))) {
        break lexical_join_105;
    }
    lexicalValue1612_104_0 = 1;
    }
    return ((lexicalValue1612_104_0) != 0);
    }
    life6_19 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return ((0) != 0);
}


public void n(boolean p0) {
this.ca = ((boolean)(p0));
    return;
}


protected java.lang.String h__String() {
return "mob.villager.death";
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound lexicalValue1614_42_0;
    java.lang.String lexicalValue1614_42_1;
    net.minecraft.entity.passive.EntityVillager lexicalValue1614_42_2;
    int spill1614_0;
    net.minecraft.nbt.NBTTagCompound spill1614_1;
    java.lang.String spill1614_2;
    net.minecraft.entity.passive.EntityVillager spill1614_3;
    long life2_3;
    int life4_13;
    net.minecraft.nbt.NBTTagList life5_54;
    int life6_56;
    net.minecraft.item.ItemStack life7_66;
    lexical_join_81: {
    lexical_join_77: {
    lexical_join_45: {
    lexical_join_42: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 131383722740542L);
    spill1614_0 = moom.vR.b();
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Profession")), ((int)(((net.minecraft.entity.passive.EntityVillager)(this)).r__sourceReturn_8abf5c6871())));
    life4_13 = spill1614_0;
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Riches")), ((int)(this.ci)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Career")), ((int)(this.ck)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CareerLevel")), ((int)(this.cl)));
    spill1614_1 = p0;
    spill1614_2 = "Willing";
    spill1614_3 = this;
    if (!((life4_13 != 0))) {
        lexicalValue1614_42_0 = spill1614_1;
        lexicalValue1614_42_1 = spill1614_2;
        lexicalValue1614_42_2 = spill1614_3;
        break lexical_join_42;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill1614_1)).a(((java.lang.String)(spill1614_2)), ((boolean)(((net.minecraft.entity.passive.EntityVillager)(spill1614_3)).ch)));
    if (!((this.ce != null))) {
        break lexical_join_45;
    }
    lexicalValue1614_42_0 = p0;
    lexicalValue1614_42_1 = "Offers";
    lexicalValue1614_42_2 = this;
    }
    ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1614_42_0)).a(((java.lang.String)(lexicalValue1614_42_1)), ((net.minecraft.nbt.NBTBase)(((moom.OF)(((net.minecraft.entity.passive.EntityVillager)(lexicalValue1614_42_2)).ce)).a())));
    }
    life5_54 = new net.minecraft.nbt.NBTTagList();
    life6_56 = 0;
    lexical_cycle_51: while (true) {
    lexical_join_75: {
    lexical_join_74: {
    if (!((life6_56 < ((moom.wq)(this.co)).b__Int()))) {
        break lexical_join_77;
    }
    life7_66 = ((moom.wq)(this.co)).a__xW(((int)(life6_56)));
    if (!((life4_13 != 0))) {
        break lexical_join_81;
    }
    if (!((life4_13 != 0))) {
        break lexical_join_75;
    }
    if (!((life7_66 != null))) {
        break lexical_join_74;
    }
    ((net.minecraft.nbt.NBTTagList)(life5_54)).a(((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(life7_66)).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    }
    life6_56 += 1;
    }
    if (!((life4_13 == 0))) { continue lexical_cycle_51; }
    break lexical_cycle_51;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Inventory")), ((net.minecraft.nbt.NBTBase)(life5_54)));
    }
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.passive.EntityVillager.ib ^ 68243620719718L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1992_3(1830, (8143056474458933866L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    return;
}


public void a__sourceReturn_481e10a41f(net.minecraft.item.ItemStack p0) {
int forwardValue5341_16_0;
    net.minecraft.entity.passive.EntityVillager forwardValue5341_27_0;
    net.minecraft.entity.passive.EntityVillager forwardValue5341_45_0;
    boolean spill5341_0;
    net.minecraft.entity.passive.EntityVillager spill5341_1;
    long life2_3;
    int life4_5;
    forward_join_51: {
    forward_join_45: {
    forward_join_44: {
    forward_join_27: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 86066173113080L);
    life4_5 = moom.vR.c();
    spill5341_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 == 0))) {
        forwardValue5341_16_0 = ((spill5341_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill5341_0))) {
        break forward_join_51;
    }
    spill5341_1 = this;
    if (!((life4_5 == 0))) {
        forwardValue5341_27_0 = spill5341_1;
        break forward_join_27;
    }
    forwardValue5341_16_0 = ((net.minecraft.entity.passive.EntityVillager)(spill5341_1)).bC;
    }
    if (!((forwardValue5341_16_0 > ((-((net.minecraft.entity.passive.EntityVillager)(this)).l()) + __sourceIntrinsic_5f56e65a234d_invokedynamic5341_7(8002, (3078498167020735641L ^ life2_3)))))) {
        break forward_join_51;
    }
    forwardValue5341_27_0 = this;
    }
    if (!((life4_5 == 0))) {
        forwardValue5341_45_0 = forwardValue5341_27_0;
        break forward_join_45;
    }
    ((net.minecraft.entity.passive.EntityVillager)(forwardValue5341_27_0)).bC = ((int)((-((net.minecraft.entity.passive.EntityVillager)(this)).l())));
    if (!((p0 != null))) {
        break forward_join_44;
    }
    ((net.minecraft.entity.passive.EntityVillager)(this)).a(((java.lang.String)("mob.villager.yes")), ((float)(((net.minecraft.entity.passive.EntityVillager)(this)).f__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.passive.EntityVillager)(this)).g__sourceReturn_bc607678b6())));
    if (!((life4_5 != 0))) {
        break forward_join_51;
    }
    }
    forwardValue5341_45_0 = this;
    }
    ((net.minecraft.entity.passive.EntityVillager)(forwardValue5341_45_0)).a(((java.lang.String)("mob.villager.no")), ((float)(((net.minecraft.entity.passive.EntityVillager)(this)).f__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.passive.EntityVillager)(this)).g__sourceReturn_bc607678b6())));
    }
    return;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
p1 = super.a(((moom.Eh)(p0)), ((net.minecraft.entity.IEntityLivingData)(p1)));
    ((net.minecraft.entity.passive.EntityVillager)(this)).m(((int)(((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextInt(((int)(5))))));
    ((net.minecraft.entity.passive.EntityVillager)(this)).Y__sourceReturn_da8c82d5d4();
    return p1;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.passive.EntityVillager a__sV(moom.sJ p0) {
net.minecraft.entity.passive.EntityVillager local2 = new net.minecraft.entity.passive.EntityVillager(this.i);
    ((net.minecraft.entity.passive.EntityVillager)(local2)).a(((moom.Eh)(((net.minecraft.world.World)(this.i)).a__Eh(((moom.DT)(new moom.DT(local2)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    return local2;
}


private void a(net.minecraft.util.EnumParticleTypes p0) {
int spill1609_0;
    long life2_3;
    int life5_6;
    int life4_7;
    double life6_16;
    double life8_22;
    double life10_28;
    lexical_join_85: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 94013708253361L);
    spill1609_0 = moom.vR.b();
    life5_6 = 0;
    life4_7 = spill1609_0;
    lexical_cycle_8: while (true) {
    if (!((life5_6 < 5))) {
        break lexical_join_85;
    }
    life6_16 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life8_22 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life10_28 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(p0)), ((double)(((this.n + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(((this.o + 0x1.0p0d) + ((double) (((java.util.Random)(this.ah)).nextFloat() * this.H))))), ((double)(((this.p + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(life6_16)), ((double)(life8_22)), ((double)(life10_28)), ((int[])(new int[0])));
    life5_6 += 1;
    if (!((life4_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public void a(byte p0) {
int forestValue672_26_0;
    int forestValue672_26_1;
    int forestValue672_40_0;
    int forestValue672_40_1;
    byte spill672_0;
    int spill672_1;
    long life2_3;
    int life4_5;
    forest_join_49: {
    forest_join_46: {
    forest_join_40: {
    forest_join_34: {
    forest_join_26: {
    forest_join_20: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 97071972746340L);
    life4_5 = moom.vR.b();
    spill672_0 = p0;
    spill672_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic672_2(8431, (1266214728642921916L ^ life2_3));
    if (!((life4_5 != 0))) {
        forestValue672_26_0 = ((int)(spill672_0));
        forestValue672_26_1 = spill672_1;
        break forest_join_26;
    }
    if (!((spill672_0 == spill672_1))) {
        break forest_join_20;
    }
    ((net.minecraft.entity.passive.EntityVillager)(this)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.HEART)));
    if (!((life4_5 == 0))) {
        break forest_join_49;
    }
    }
    forestValue672_26_0 = ((int)(p0));
    forestValue672_26_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic672_6(13078, (7766322968988718658L ^ life2_3));
    }
    if (!((life4_5 != 0))) {
        forestValue672_40_0 = forestValue672_26_0;
        forestValue672_40_1 = forestValue672_26_1;
        break forest_join_40;
    }
    if (!((forestValue672_26_0 == forestValue672_26_1))) {
        break forest_join_34;
    }
    ((net.minecraft.entity.passive.EntityVillager)(this)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.VILLAGER_ANGRY)));
    if (!((life4_5 == 0))) {
        break forest_join_49;
    }
    }
    forestValue672_40_0 = ((int)(p0));
    forestValue672_40_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic672_10(2899, (8205623459635080764L ^ life2_3));
    }
    if (!((forestValue672_40_0 == forestValue672_40_1))) {
        break forest_join_46;
    }
    ((net.minecraft.entity.passive.EntityVillager)(this)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.VILLAGER_HAPPY)));
    if (!((life4_5 == 0))) {
        break forest_join_49;
    }
    }
    super.a(((byte)(p0)));
    }
    return;
}


protected void a(net.minecraft.entity.item.EntityItem p0) {
net.minecraft.entity.passive.EntityVillager forwardValue5338_19_0;
    net.minecraft.item.ItemStack forwardValue5338_32_0;
    int spill5338_0;
    net.minecraft.entity.passive.EntityVillager spill5338_1;
    net.minecraft.item.ItemStack spill5338_2;
    long life2_3;
    net.minecraft.item.ItemStack life5_7;
    int life4_8;
    net.minecraft.item.Item life6_11;
    net.minecraft.item.ItemStack life7_28;
    forward_join_35: {
    forward_join_32: {
    forward_join_31: {
    forward_join_19: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 47444552486154L);
    spill5338_0 = moom.vR.b();
    life5_7 = ((net.minecraft.entity.item.EntityItem)(p0)).a__xW();
    life4_8 = spill5338_0;
    life6_11 = ((net.minecraft.item.ItemStack)(life5_7)).a__wQ();
    spill5338_1 = this;
    if (!((life4_8 != 0))) {
        forwardValue5338_19_0 = spill5338_1;
        break forward_join_19;
    }
    if (!(((net.minecraft.entity.passive.EntityVillager)(spill5338_1)).a(((net.minecraft.item.Item)(life6_11))))) {
        break forward_join_35;
    }
    forwardValue5338_19_0 = this;
    }
    life7_28 = ((moom.wq)(((net.minecraft.entity.passive.EntityVillager)(forwardValue5338_19_0)).co)).a(((net.minecraft.item.ItemStack)(life5_7)));
    spill5338_2 = life7_28;
    if (!((life4_8 != 0))) {
        forwardValue5338_32_0 = spill5338_2;
        break forward_join_32;
    }
    if (!((spill5338_2 == null))) {
        break forward_join_31;
    }
    ((net.minecraft.entity.item.EntityItem)(p0)).f__Void();
    if (!((life4_8 == 0))) {
        break forward_join_35;
    }
    }
    forwardValue5338_32_0 = life5_7;
    }
    ((net.minecraft.item.ItemStack)(forwardValue5338_32_0)).b = ((int)(((net.minecraft.item.ItemStack)(life7_28)).b));
    }
    return;
}


public moom.sJ a(moom.sJ p0) {
return ((net.minecraft.entity.passive.EntityVillager)(this)).a__sV(((moom.sJ)(p0)));
}


private boolean a(net.minecraft.item.Item p0) {
net.minecraft.item.Item forwardValue5340_13_0;
    net.minecraft.item.Item forwardValue5340_13_1;
    net.minecraft.item.Item forwardValue5340_18_0;
    net.minecraft.item.Item forwardValue5340_18_1;
    net.minecraft.item.Item forwardValue5340_23_0;
    net.minecraft.item.Item forwardValue5340_23_1;
    net.minecraft.item.Item forwardValue5340_28_0;
    net.minecraft.item.Item forwardValue5340_28_1;
    int forwardValue5340_32_0;
    net.minecraft.item.Item spill5340_0;
    net.minecraft.item.Item spill5340_1;
    long life2_3;
    int life4_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_29: {
    forward_join_28: {
    forward_join_23: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 5475664398496L);
    life4_5 = moom.vR.c();
    spill5340_0 = p0;
    spill5340_1 = net.minecraft.init.Items.P;
    if (!((life4_5 == 0))) {
        forwardValue5340_13_0 = spill5340_0;
        forwardValue5340_13_1 = spill5340_1;
        break forward_join_13;
    }
    if (!((spill5340_0 != spill5340_1))) {
        break forward_join_29;
    }
    forwardValue5340_13_0 = p0;
    forwardValue5340_13_1 = net.minecraft.init.Items.bH;
    }
    if (!((life4_5 == 0))) {
        forwardValue5340_18_0 = forwardValue5340_13_0;
        forwardValue5340_18_1 = forwardValue5340_13_1;
        break forward_join_18;
    }
    if (!((forwardValue5340_13_0 != forwardValue5340_13_1))) {
        break forward_join_29;
    }
    forwardValue5340_18_0 = p0;
    forwardValue5340_18_1 = net.minecraft.init.Items.bG;
    }
    if (!((life4_5 == 0))) {
        forwardValue5340_23_0 = forwardValue5340_18_0;
        forwardValue5340_23_1 = forwardValue5340_18_1;
        break forward_join_23;
    }
    if (!((forwardValue5340_18_0 != forwardValue5340_18_1))) {
        break forward_join_29;
    }
    forwardValue5340_23_0 = p0;
    forwardValue5340_23_1 = net.minecraft.init.Items.O;
    }
    if (!((life4_5 == 0))) {
        forwardValue5340_28_0 = forwardValue5340_23_0;
        forwardValue5340_28_1 = forwardValue5340_23_1;
        break forward_join_28;
    }
    if (!((forwardValue5340_23_0 != forwardValue5340_23_1))) {
        break forward_join_29;
    }
    forwardValue5340_28_0 = p0;
    forwardValue5340_28_1 = net.minecraft.init.Items.N;
    }
    if (!((forwardValue5340_28_0 == forwardValue5340_28_1))) {
        break forward_join_31;
    }
    }
    forwardValue5340_32_0 = 1;
    break forward_join_32;
    }
    forwardValue5340_32_0 = 0;
    }
    return ((forwardValue5340_32_0) != 0);
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityVillager)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-1d)));
    return;
}


public moom.wq a__wq() {
return this.co;
}


public void a(moom.tu p0) {
int forwardValue5337_14_0;
    int forwardValue5337_65_0;
    boolean spill5337_0;
    boolean spill5337_1;
    long life2_3;
    int life4_5;
    moom.ta life5_26;
    forward_join_68: {
    forward_join_65: {
    forward_join_61: {
    forward_join_14: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 48753698698447L);
    life4_5 = moom.vR.c();
    spill5337_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 == 0))) {
        forwardValue5337_14_0 = ((spill5337_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill5337_0))) {
        break forward_join_68;
    }
    forwardValue5337_14_0 = ((this.F) ? 1 : 0);
    }
    if (!((forwardValue5337_14_0 == 0))) {
        break forward_join_68;
    }
    life5_26 = new moom.ta(this.i);
    ((moom.ta)(life5_26)).c(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)(this.w)), ((float)(this.x)));
    ((moom.ta)(life5_26)).a(((moom.Eh)(((net.minecraft.world.World)(this.i)).a__Eh(((moom.DT)(new moom.DT(life5_26)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    ((moom.ta)(life5_26)).j(((boolean)(((net.minecraft.entity.passive.EntityVillager)(this)).U__Boolean())));
    spill5337_1 = ((net.minecraft.entity.passive.EntityVillager)(this)).e__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5337_65_0 = ((spill5337_1) ? 1 : 0);
        break forward_join_65;
    }
    if (!(spill5337_1)) {
        break forward_join_61;
    }
    ((moom.ta)(life5_26)).a(((java.lang.String)(((net.minecraft.entity.passive.EntityVillager)(this)).g__String())));
    ((moom.ta)(life5_26)).f(((boolean)(((net.minecraft.entity.passive.EntityVillager)(this)).B())));
    }
    forwardValue5337_65_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life5_26)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5337_65_0);
    ((net.minecraft.entity.passive.EntityVillager)(this)).f__Void();
    }
    return;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack forwardValue5346_15_0;
    int forwardValue5346_21_0;
    net.minecraft.entity.passive.EntityVillager forwardValue5346_59_0;
    int forwardValue5346_68_0;
    int forwardValue5346_72_0;
    int spill5346_0;
    net.minecraft.item.ItemStack spill5346_1;
    int spill5346_2;
    boolean spill5346_3;
    boolean spill5346_4;
    boolean spill5346_5;
    boolean spill5346_6;
    net.minecraft.entity.passive.EntityVillager spill5346_7;
    int spill5346_8;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    int life6_26;
    forward_join_72: {
    forward_join_69: {
    forward_join_68: {
    forward_join_64: {
    forward_join_59: {
    forward_join_58: {
    forward_join_21: {
    forward_join_20: {
    forward_join_15: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 116408912633485L);
    spill5346_0 = moom.vR.c();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill5346_0;
    spill5346_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue5346_15_0 = spill5346_1;
        break forward_join_15;
    }
    if (!((spill5346_1 != null))) {
        break forward_join_20;
    }
    forwardValue5346_15_0 = life5_8;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5346_15_0)).a__wQ() == net.minecraft.init.Items.by))) {
        break forward_join_20;
    }
    forwardValue5346_21_0 = 1;
    break forward_join_21;
    }
    forwardValue5346_21_0 = 0;
    }
    life6_26 = forwardValue5346_21_0;
    spill5346_2 = life6_26;
    if (!((life4_9 == 0))) {
        forwardValue5346_72_0 = spill5346_2;
        break forward_join_72;
    }
    if (!((spill5346_2 == 0))) {
        break forward_join_69;
    }
    spill5346_3 = ((net.minecraft.entity.passive.EntityVillager)(this)).p__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5346_72_0 = ((spill5346_3) ? 1 : 0);
        break forward_join_72;
    }
    if (!(spill5346_3)) {
        break forward_join_69;
    }
    spill5346_4 = ((net.minecraft.entity.passive.EntityVillager)(this)).af();
    if (!((life4_9 == 0))) {
        forwardValue5346_72_0 = ((spill5346_4) ? 1 : 0);
        break forward_join_72;
    }
    if (!((!spill5346_4))) {
        break forward_join_69;
    }
    spill5346_5 = ((net.minecraft.entity.passive.EntityVillager)(this)).c__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue5346_72_0 = ((spill5346_5) ? 1 : 0);
        break forward_join_72;
    }
    if (!((!spill5346_5))) {
        break forward_join_69;
    }
    spill5346_6 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_9 == 0))) {
        forwardValue5346_68_0 = ((spill5346_6) ? 1 : 0);
        break forward_join_68;
    }
    if (!((!spill5346_6))) {
        break forward_join_64;
    }
    spill5346_7 = this;
    if (!((life4_9 == 0))) {
        forwardValue5346_59_0 = spill5346_7;
        break forward_join_59;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill5346_7)).ce != null))) {
        break forward_join_58;
    }
    spill5346_8 = ((moom.OF)(this.ce)).size();
    if (!((life4_9 == 0))) {
        forwardValue5346_68_0 = spill5346_8;
        break forward_join_68;
    }
    if (!((spill5346_8 > 0))) {
        break forward_join_64;
    }
    }
    forwardValue5346_59_0 = this;
    }
    ((net.minecraft.entity.passive.EntityVillager)(forwardValue5346_59_0)).a__Void(((net.minecraft.entity.player.EntityPlayer)(p0)));
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.entity.IMerchant)(this)));
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((moom.BY)(net.minecraft.stats.StatList.F)));
    forwardValue5346_68_0 = 1;
    }
    return ((forwardValue5346_68_0) != 0);
    }
    forwardValue5346_72_0 = ((super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    return ((forwardValue5346_72_0) != 0);
}


public void a(net.minecraft.village.MerchantRecipe p0) {
net.minecraft.entity.passive.EntityVillager forwardValue5344_54_0;
    net.minecraft.entity.passive.EntityVillager forwardValue5344_66_0;
    net.minecraft.village.MerchantRecipe forwardValue5344_85_0;
    int forwardValue5344_106_0;
    int spill5344_0;
    net.minecraft.entity.passive.EntityVillager spill5344_1;
    net.minecraft.village.MerchantRecipe spill5344_2;
    boolean spill5344_3;
    long life2_3;
    int life4_7;
    int life5_26;
    forward_join_107: {
    forward_join_106: {
    forward_join_85: {
    forward_join_84: {
    forward_join_69: {
    forward_join_68: {
    forward_join_66: {
    forward_join_65: {
    forward_join_54: {
    forward_join_53: {
    forward_join_40: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 21089063480236L);
    spill5344_0 = moom.vR.c();
    ((net.minecraft.village.MerchantRecipe)(p0)).a__Void();
    life4_7 = spill5344_0;
    this.bC = ((int)((-((net.minecraft.entity.passive.EntityVillager)(this)).l())));
    ((net.minecraft.entity.passive.EntityVillager)(this)).a(((java.lang.String)("mob.villager.yes")), ((float)(((net.minecraft.entity.passive.EntityVillager)(this)).f__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.passive.EntityVillager)(this)).g__sourceReturn_bc607678b6())));
    life5_26 = (3 + ((java.util.Random)(this.ah)).nextInt(((int)(4))));
    if (!((life4_7 == 0))) {
        break forward_join_53;
    }
    if (!((((net.minecraft.village.MerchantRecipe)(p0)).a() != 1))) {
        break forward_join_40;
    }
    spill5344_1 = this;
    if (!((life4_7 == 0))) {
        forwardValue5344_54_0 = spill5344_1;
        break forward_join_54;
    }
    if (!((((java.util.Random)(((net.minecraft.entity.passive.EntityVillager)(spill5344_1)).ah)).nextInt(((int)(5))) == 0))) {
        break forward_join_69;
    }
    }
    this.cf = ((int)(__sourceIntrinsic_68fad084dd4d_invokedynamic5344_13(24568, (8725424537675879751L ^ life2_3))));
    this.cg = ((boolean)(true));
    this.ch = ((boolean)(true));
    }
    forwardValue5344_54_0 = this;
    }
    if (!((life4_7 == 0))) {
        forwardValue5344_66_0 = forwardValue5344_54_0;
        break forward_join_66;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(forwardValue5344_54_0)).cd != null))) {
        break forward_join_65;
    }
    this.cj = ((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this.cd)).a__String()));
    if (!((life4_7 != 0))) {
        break forward_join_68;
    }
    }
    forwardValue5344_66_0 = this;
    }
    ((net.minecraft.entity.passive.EntityVillager)(forwardValue5344_66_0)).cj = ((java.lang.String)(null));
    }
    life5_26 += 5;
    }
    spill5344_2 = p0;
    if (!((life4_7 == 0))) {
        forwardValue5344_85_0 = spill5344_2;
        break forward_join_85;
    }
    if (!((((net.minecraft.item.ItemStack)(((net.minecraft.village.MerchantRecipe)(spill5344_2)).a__xW())).a__wQ() == net.minecraft.init.Items.bD))) {
        break forward_join_84;
    }
    net.minecraft.entity.passive.EntityVillager __stackOp5344_25_0 = this;
    ((net.minecraft.entity.passive.EntityVillager)(__stackOp5344_25_0)).ci = ((int)((((net.minecraft.entity.passive.EntityVillager)(__stackOp5344_25_0)).ci + ((net.minecraft.item.ItemStack)(((net.minecraft.village.MerchantRecipe)(p0)).a__xW())).b)));
    }
    forwardValue5344_85_0 = p0;
    }
    spill5344_3 = ((net.minecraft.village.MerchantRecipe)(forwardValue5344_85_0)).c__Boolean();
    if (!((life4_7 == 0))) {
        forwardValue5344_106_0 = ((spill5344_3) ? 1 : 0);
        break forward_join_106;
    }
    if (!(spill5344_3)) {
        break forward_join_107;
    }
    forwardValue5344_106_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(this.i, this.n, (this.o + 0x1.0p-1d), this.p, life5_26))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5344_106_0);
    }
    return;
}


public boolean a__sourceReturn_e5b9dbd68d(boolean p0) {
net.minecraft.item.ItemStack lexicalValue1610_41_0;
    net.minecraft.item.ItemStack lexicalValue1610_63_0;
    net.minecraft.item.Item lexicalValue1610_67_0;
    net.minecraft.item.Item lexicalValue1610_67_1;
    net.minecraft.item.ItemStack lexicalValue1610_75_0;
    int lexicalValue1610_97_0;
    net.minecraft.entity.passive.EntityVillager lexicalValue1610_116_0;
    int lexicalValue1610_117_0;
    boolean spill1610_0;
    boolean spill1610_1;
    boolean spill1610_2;
    net.minecraft.entity.passive.EntityVillager spill1610_3;
    net.minecraft.item.ItemStack spill1610_4;
    net.minecraft.item.Item spill1610_5;
    net.minecraft.item.Item spill1610_6;
    net.minecraft.item.ItemStack spill1610_7;
    net.minecraft.item.ItemStack spill1610_8;
    int spill1610_9;
    long life2_3;
    int life4_5;
    int life5_36;
    int life6_38;
    net.minecraft.item.ItemStack life7_50;
    lexical_join_117: {
    lexical_join_116: {
    lexical_join_115: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 130520056373442L);
    life4_5 = moom.vR.c();
    spill1610_0 = this.ch;
    if (!((life4_5 == 0))) {
        lexicalValue1610_117_0 = ((spill1610_0) ? 1 : 0);
        break lexical_join_117;
    }
    if (!((!spill1610_0))) {
        break lexical_join_115;
    }
    spill1610_1 = p0;
    if (!((life4_5 == 0))) {
        lexicalValue1610_117_0 = ((spill1610_1) ? 1 : 0);
        break lexical_join_117;
    }
    if (!(spill1610_1)) {
        break lexical_join_115;
    }
    spill1610_2 = ((net.minecraft.entity.passive.EntityVillager)(this)).ag();
    if (!((life4_5 == 0))) {
        lexicalValue1610_117_0 = ((spill1610_2) ? 1 : 0);
        break lexical_join_117;
    }
    if (!(spill1610_2)) {
        break lexical_join_115;
    }
    life5_36 = 0;
    life6_38 = 0;
    lexical_cycle_24: while (true) {
    lexical_join_112: {
    lexical_join_97: {
    lexical_join_96: {
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_67: {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_41: {
    if (!((life6_38 < ((moom.wq)(this.co)).b__Int()))) {
        break lexical_join_115;
    }
    spill1610_3 = this;
    if (!((life4_5 == 0))) {
        lexicalValue1610_116_0 = spill1610_3;
        break lexical_join_116;
    }
    life7_50 = ((moom.wq)(((net.minecraft.entity.passive.EntityVillager)(spill1610_3)).co)).a__xW(((int)(life6_38)));
    spill1610_4 = life7_50;
    if (!((life4_5 == 0))) {
        lexicalValue1610_41_0 = spill1610_4;
        break lexical_join_41;
    }
    if (!((spill1610_4 != null))) {
        break lexical_join_96;
    }
    lexicalValue1610_41_0 = life7_50;
    }
    spill1610_5 = ((net.minecraft.item.ItemStack)(lexicalValue1610_41_0)).a__wQ();
    spill1610_6 = net.minecraft.init.Items.P;
    if (!((life4_5 == 0))) {
        lexicalValue1610_67_0 = spill1610_5;
        lexicalValue1610_67_1 = spill1610_6;
        break lexical_join_67;
    }
    if (!((spill1610_5 == spill1610_6))) {
        break lexical_join_62;
    }
    spill1610_7 = life7_50;
    if (!((life4_5 == 0))) {
        lexicalValue1610_63_0 = spill1610_7;
        break lexical_join_63;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1610_7)).b >= 3))) {
        break lexical_join_62;
    }
    life5_36 = 1;
    ((moom.wq)(this.co)).a(((int)(life6_38)), ((int)(3)));
    if (!((life4_5 != 0))) {
        break lexical_join_96;
    }
    }
    lexicalValue1610_63_0 = life7_50;
    }
    if (!((life4_5 == 0))) {
        lexicalValue1610_75_0 = lexicalValue1610_63_0;
        break lexical_join_75;
    }
    lexicalValue1610_67_0 = ((net.minecraft.item.ItemStack)(lexicalValue1610_63_0)).a__wQ();
    lexicalValue1610_67_1 = net.minecraft.init.Items.bH;
    }
    if (!((lexicalValue1610_67_0 != lexicalValue1610_67_1))) {
        break lexical_join_74;
    }
    spill1610_8 = life7_50;
    if (!((life4_5 == 0))) {
        lexicalValue1610_75_0 = spill1610_8;
        break lexical_join_75;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1610_8)).a__wQ() == net.minecraft.init.Items.bG))) {
        break lexical_join_96;
    }
    }
    lexicalValue1610_75_0 = life7_50;
    }
    spill1610_9 = ((net.minecraft.item.ItemStack)(lexicalValue1610_75_0)).b;
    if (!((life4_5 == 0))) {
        lexicalValue1610_97_0 = spill1610_9;
        break lexical_join_97;
    }
    if (!((spill1610_9 >= __sourceIntrinsic_f467e5a17865_invokedynamic1610_21(13865, (6794215245410973632L ^ life2_3))))) {
        break lexical_join_96;
    }
    life5_36 = 1;
    ((moom.wq)(this.co)).a(((int)(life6_38)), ((int)(__sourceIntrinsic_f467e5a17865_invokedynamic1610_23(13865, (6794215245410973632L ^ life2_3)))));
    }
    lexicalValue1610_97_0 = life5_36;
    }
    if (!((lexicalValue1610_97_0 != 0))) {
        break lexical_join_112;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_f467e5a17865_invokedynamic1610_26(3710, (2139817800705576848L ^ life2_3)))));
    this.ch = ((boolean)(true));
    if (!((life4_5 != 0))) {
        break lexical_join_115;
    }
    }
    life6_38 += 1;
    if (!((life4_5 != 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue1610_116_0 = this;
    }
    lexicalValue1610_117_0 = ((((net.minecraft.entity.passive.EntityVillager)(lexicalValue1610_116_0)).ch) ? 1 : 0);
    }
    return ((lexicalValue1610_117_0) != 0);
}


public void a__Void(net.minecraft.entity.player.EntityPlayer p0) {
this.cd = ((net.minecraft.entity.player.EntityPlayer)(p0));
    return;
}


public net.minecraft.entity.player.EntityPlayer a__tn() {
return this.cd;
}


public net.minecraft.util.IChatComponent a__C5() {
java.lang.String forwardValue545_14_0;
    net.minecraft.entity.passive.EntityVillager forwardValue545_42_0;
    int forwardValue545_52_0;
    int forwardValue545_62_0;
    int forwardValue545_62_1;
    int forwardValue545_71_0;
    int forwardValue545_71_1;
    int forwardValue545_80_0;
    int forwardValue545_80_1;
    int forwardValue545_102_0;
    int forwardValue545_102_1;
    int forwardValue545_111_0;
    int forwardValue545_111_1;
    int forwardValue545_127_0;
    int forwardValue545_127_1;
    int spill545_0;
    java.lang.String spill545_1;
    net.minecraft.entity.passive.EntityVillager spill545_2;
    int spill545_3;
    int spill545_4;
    int spill545_5;
    int spill545_6;
    int spill545_7;
    int spill545_8;
    long life1_3;
    java.lang.String life4_7;
    int life3_8;
    moom.CM life5_23;
    java.lang.String life5_53;
    moom.CN life6_171;
    forward_join_155: {
    forward_join_130: {
    forward_join_127: {
    forward_join_124: {
    forward_join_115: {
    forward_join_111: {
    forward_join_108: {
    forward_join_102: {
    forward_join_99: {
    forward_join_90: {
    forward_join_87: {
    forward_join_84: {
    forward_join_80: {
    forward_join_77: {
    forward_join_71: {
    forward_join_68: {
    forward_join_62: {
    forward_join_59: {
    forward_join_52: {
    forward_join_50: {
    forward_join_43: {
    forward_join_42: {
    forward_join_36: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 18240690632814L);
    spill545_0 = moom.vR.b();
    life4_7 = ((net.minecraft.entity.passive.EntityVillager)(this)).g__String();
    life3_8 = spill545_0;
    spill545_1 = life4_7;
    if (!((life3_8 != 0))) {
        forwardValue545_14_0 = spill545_1;
        break forward_join_14;
    }
    if (!((spill545_1 != null))) {
        break forward_join_36;
    }
    forwardValue545_14_0 = life4_7;
    }
    if (!((((java.lang.String)(forwardValue545_14_0)).length() > 0))) {
        break forward_join_36;
    }
    life5_23 = new moom.CM(life4_7);
    ((moom.CO)(((moom.CM)(life5_23)).a__CO())).a(((moom.v3)(((net.minecraft.entity.passive.EntityVillager)(this)).a__v3())));
    ((moom.CO)(((moom.CM)(life5_23)).a__CO())).a(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.passive.EntityVillager)(this)).a__UUID())).toString())));
    return life5_23;
    }
    spill545_2 = this;
    if (!((life3_8 != 0))) {
        forwardValue545_42_0 = spill545_2;
        break forward_join_42;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill545_2)).ce == null))) {
        break forward_join_43;
    }
    forwardValue545_42_0 = this;
    }
    ((net.minecraft.entity.passive.EntityVillager)(forwardValue545_42_0)).Z__sourceReturn_da8c82d5d4();
    }
    life5_53 = null;
    spill545_3 = ((net.minecraft.entity.passive.EntityVillager)(this)).r__sourceReturn_8abf5c6871();
    if (!((life3_8 != 0))) {
        forwardValue545_52_0 = spill545_3;
        break forward_join_52;
    }
    switch (spill545_3) {
case 0:
{
        break forward_join_50;
    }
case 1:
{
        break forward_join_84;
    }
case 2:
{
        break forward_join_87;
    }
case 3:
{
        break forward_join_90;
    }
case 4:
{
        break forward_join_115;
    }
default:
{
        break forward_join_130;
    }
}
    }
    forwardValue545_52_0 = this.ck;
    }
    spill545_4 = 1;
    if (!((life3_8 != 0))) {
        forwardValue545_62_0 = forwardValue545_52_0;
        forwardValue545_62_1 = spill545_4;
        break forward_join_62;
    }
    if (!((forwardValue545_52_0 == spill545_4))) {
        break forward_join_59;
    }
    life5_53 = "farmer";
    break forward_join_130;
    }
    forwardValue545_62_0 = this.ck;
    forwardValue545_62_1 = 2;
    }
    if (!((life3_8 != 0))) {
        forwardValue545_71_0 = forwardValue545_62_0;
        forwardValue545_71_1 = forwardValue545_62_1;
        break forward_join_71;
    }
    if (!((forwardValue545_62_0 == forwardValue545_62_1))) {
        break forward_join_68;
    }
    life5_53 = "fisherman";
    break forward_join_130;
    }
    forwardValue545_71_0 = this.ck;
    forwardValue545_71_1 = 3;
    }
    if (!((life3_8 != 0))) {
        forwardValue545_80_0 = forwardValue545_71_0;
        forwardValue545_80_1 = forwardValue545_71_1;
        break forward_join_80;
    }
    if (!((forwardValue545_71_0 == forwardValue545_71_1))) {
        break forward_join_77;
    }
    life5_53 = "shepherd";
    break forward_join_130;
    }
    forwardValue545_80_0 = this.ck;
    forwardValue545_80_1 = 4;
    }
    if (!((forwardValue545_80_0 == forwardValue545_80_1))) {
        break forward_join_130;
    }
    life5_53 = "fletcher";
    break forward_join_130;
    }
    life5_53 = "librarian";
    break forward_join_130;
    }
    life5_53 = "cleric";
    break forward_join_130;
    }
    spill545_5 = this.ck;
    spill545_6 = 1;
    if (!((life3_8 != 0))) {
        forwardValue545_102_0 = spill545_5;
        forwardValue545_102_1 = spill545_6;
        break forward_join_102;
    }
    if (!((spill545_5 == spill545_6))) {
        break forward_join_99;
    }
    life5_53 = "armor";
    break forward_join_130;
    }
    forwardValue545_102_0 = this.ck;
    forwardValue545_102_1 = 2;
    }
    if (!((life3_8 != 0))) {
        forwardValue545_111_0 = forwardValue545_102_0;
        forwardValue545_111_1 = forwardValue545_102_1;
        break forward_join_111;
    }
    if (!((forwardValue545_102_0 == forwardValue545_102_1))) {
        break forward_join_108;
    }
    life5_53 = "weapon";
    break forward_join_130;
    }
    forwardValue545_111_0 = this.ck;
    forwardValue545_111_1 = 3;
    }
    if (!((forwardValue545_111_0 == forwardValue545_111_1))) {
        break forward_join_130;
    }
    life5_53 = "tool";
    break forward_join_130;
    }
    spill545_7 = this.ck;
    spill545_8 = 1;
    if (!((life3_8 != 0))) {
        forwardValue545_127_0 = spill545_7;
        forwardValue545_127_1 = spill545_8;
        break forward_join_127;
    }
    if (!((spill545_7 == spill545_8))) {
        break forward_join_124;
    }
    life5_53 = "butcher";
    break forward_join_130;
    }
    forwardValue545_127_0 = this.ck;
    forwardValue545_127_1 = 2;
    }
    if (!((forwardValue545_127_0 == forwardValue545_127_1))) {
        break forward_join_130;
    }
    life5_53 = "leather";
    }
    if (!((life5_53 != null))) {
        break forward_join_155;
    }
    life6_171 = new moom.CN(__sourceIntrinsic_6e581d8d1b3b_invokedynamic545_23(life5_53), new java.lang.Object[0]);
    ((moom.CO)(((moom.CN)(life6_171)).a__CO())).a(((moom.v3)(((net.minecraft.entity.passive.EntityVillager)(this)).a__v3())));
    ((moom.CO)(((moom.CN)(life6_171)).a__CO())).a(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.passive.EntityVillager)(this)).a__UUID())).toString())));
    return life6_171;
    }
    return super.a__C5();
}


public void a(moom.OF p0) {
return;
}


public moom.OF a__sourceReturn_71345e1ee6(net.minecraft.entity.player.EntityPlayer p0) {
moom.OF forwardValue5339_15_0;
    moom.OF spill5339_0;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 57978787415968L);
    life4_5 = moom.vR.b();
    spill5339_0 = this.ce;
    if (!((life4_5 != 0))) {
        forwardValue5339_15_0 = spill5339_0;
        break forward_join_15;
    }
    if (!((spill5339_0 == null))) {
        break forward_join_13;
    }
    __sourceExactCall_59bba6cdbcc6e9(((net.minecraft.entity.passive.EntityVillager)(this)));
    }
    forwardValue5339_15_0 = this.ce;
    }
    return forwardValue5339_15_0;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
net.minecraft.entity.Entity forwardValue5342_19_0;
    int forwardValue5342_38_0;
    net.minecraft.entity.passive.EntityVillager forwardValue5342_58_0;
    net.minecraft.entity.passive.EntityVillager spill5342_0;
    net.minecraft.entity.Entity spill5342_1;
    int spill5342_2;
    long life2_3;
    int life4_5;
    net.minecraft.entity.Entity life5_16;
    net.minecraft.entity.player.EntityPlayer life6_67;
    forward_join_60: {
    forward_join_58: {
    forward_join_57: {
    forward_join_44: {
    forward_join_38: {
    forward_join_36: {
    forward_join_19: {
    life2_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 120155256779086L);
    life4_5 = moom.vR.b();
    spill5342_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue5342_58_0 = spill5342_0;
        break forward_join_58;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill5342_0)).cc != null))) {
        break forward_join_57;
    }
    life5_16 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    spill5342_1 = life5_16;
    if (!((life4_5 != 0))) {
        forwardValue5342_19_0 = spill5342_1;
        break forward_join_19;
    }
    if (!((spill5342_1 != null))) {
        break forward_join_44;
    }
    forwardValue5342_19_0 = life5_16;
    }
    spill5342_2 = ((forwardValue5342_19_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue5342_38_0 = spill5342_2;
        break forward_join_38;
    }
    if (!((spill5342_2 != 0))) {
        break forward_join_36;
    }
    ((net.minecraft.village.Village)(this.cc)).a(((java.lang.String)(((net.minecraft.entity.Entity)(life5_16)).a__String())), ((int)(__sourceIntrinsic_1cc68e538389_invokedynamic5342_7(13486, (8483463199224521976L ^ life2_3)))));
    if (!((life4_5 == 0))) {
        break forward_join_57;
    }
    }
    forwardValue5342_38_0 = ((life5_16 instanceof moom.vP) ? 1 : 0);
    }
    if (!((forwardValue5342_38_0 != 0))) {
        break forward_join_57;
    }
    ((net.minecraft.village.Village)(this.cc)).f();
    if (!((life4_5 == 0))) {
        break forward_join_57;
    }
    }
    life6_67 = ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(0x1.0p4d)));
    if (!((life4_5 != 0))) {
        break forward_join_60;
    }
    if (!((life6_67 != null))) {
        break forward_join_57;
    }
    ((net.minecraft.village.Village)(this.cc)).f();
    }
    forwardValue5342_58_0 = this;
    }
    __sourceIntrinsic_1cc68e538389_call5342_16(forwardValue5342_58_0, p0);
    }
    return;
}


public void m(int p0) {
long local2 = (net.minecraft.entity.passive.EntityVillager.ib ^ 19252319740413L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_29d7b230e97e_originalDynamicSite1993_2(11817, (6236434626595122939L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    return;
}


public void o(boolean p0) {
this.cb = ((boolean)(p0));
    return;
}


public void p(boolean p0) {
this.ch = ((boolean)(p0));
    return;
}


public int r__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.passive.EntityVillager.ib ^ 104702268281771L);
    return java.lang.Math.max(((int)((((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_32ebc3e426ba_originalDynamicSite1994_2(11817, (6236371658581089453L ^ local1))))) % 5))), ((int)(0)));
}


protected boolean M() {
return ((0) != 0);
}


protected void X__sourceReturn_da8c82d5d4() {
net.minecraft.entity.passive.EntityVillager forwardValue5333_25_0;
    net.minecraft.entity.passive.EntityVillager spill5333_0;
    long life1_3;
    int life3_5;
    forward_join_25: {
    forward_join_24: {
    life1_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 128936772596497L);
    life3_5 = moom.vR.b();
    spill5333_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5333_25_0 = spill5333_0;
        break forward_join_25;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill5333_0)).r__sourceReturn_8abf5c6871() == 0))) {
        break forward_join_24;
    }
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(__sourceIntrinsic_296ab52b3f54_invokedynamic5333_4(31097, (7856891264413805393L ^ life1_3)))), ((moom.uc)(new moom.uD(this, 0x1.3333333333333p-1d))));
    }
    forwardValue5333_25_0 = this;
    }
    __sourceIntrinsic_296ab52b3f54_call5333_6(forwardValue5333_25_0);
    return;
}


private void Y__sourceReturn_da8c82d5d4() {
int forwardValue5334_16_0;
    int forwardValue5334_38_0;
    net.minecraft.entity.passive.EntityVillager forwardValue5334_40_0;
    boolean spill5334_0;
    net.minecraft.entity.passive.EntityVillager spill5334_1;
    long life1_3;
    int life3_5;
    forward_join_52: {
    forward_join_40: {
    forward_join_38: {
    forward_join_34: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 100726412149708L);
    life3_5 = moom.vR.c();
    spill5334_0 = this.cn;
    if (!((life3_5 == 0))) {
        forwardValue5334_16_0 = ((spill5334_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill5334_0))) {
        break forward_join_52;
    }
    this.cn = ((boolean)(true));
    forwardValue5334_16_0 = ((((net.minecraft.entity.passive.EntityVillager)(this)).c__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5334_38_0 = forwardValue5334_16_0;
        break forward_join_38;
    }
    if (!((forwardValue5334_16_0 != 0))) {
        break forward_join_34;
    }
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(__sourceIntrinsic_5910df8f1d95_invokedynamic5334_8(2312, (6363983794801290220L ^ life1_3)))), ((moom.uc)(new moom.uL(this, 0x1.47ae147ae147bp-2d))));
    if (!((life3_5 != 0))) {
        break forward_join_52;
    }
    }
    spill5334_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue5334_40_0 = spill5334_1;
        break forward_join_40;
    }
    forwardValue5334_38_0 = ((net.minecraft.entity.passive.EntityVillager)(spill5334_1)).r__sourceReturn_8abf5c6871();
    }
    if (!((forwardValue5334_38_0 == 0))) {
        break forward_join_52;
    }
    forwardValue5334_40_0 = this;
    }
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityVillager)(forwardValue5334_40_0)).bJ)).a(((int)(__sourceIntrinsic_5910df8f1d95_invokedynamic5334_12(25127, (860790178140897494L ^ life1_3)))), ((moom.uc)(new moom.uD(this, 0x1.3333333333333p-1d))));
    }
    return;
}


protected void R() {
net.minecraft.village.Village lexicalValue1607_65_0;
    int lexicalValue1607_91_0;
    net.minecraft.village.MerchantRecipe lexicalValue1607_132_0;
    int lexicalValue1607_184_0;
    net.minecraft.entity.passive.EntityVillager lexicalValue1607_186_0;
    net.minecraft.entity.passive.EntityVillager lexicalValue1607_199_0;
    int spill1607_0;
    net.minecraft.village.Village spill1607_1;
    boolean spill1607_2;
    net.minecraft.entity.passive.EntityVillager spill1607_3;
    net.minecraft.entity.passive.EntityVillager spill1607_4;
    net.minecraft.entity.passive.EntityVillager spill1607_5;
    net.minecraft.entity.passive.EntityVillager spill1607_6;
    net.minecraft.village.MerchantRecipe spill1607_7;
    boolean spill1607_8;
    net.minecraft.entity.passive.EntityVillager spill1607_9;
    net.minecraft.entity.passive.EntityVillager spill1607_10;
    long life1_3;
    int life3_5;
    moom.DT life4_23;
    moom.DT life5_78;
    java.util.Iterator life4_155;
    net.minecraft.village.MerchantRecipe life5_162;
    lexical_join_199: {
    lexical_join_198: {
    lexical_join_186: {
    lexical_join_185: {
    lexical_join_184: {
    lexical_join_154: {
    lexical_join_91: {
    lexical_join_87: {
    lexical_join_65: {
    lexical_join_63: {
    life1_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 28942498647959L);
    life3_5 = moom.vR.c();
    net.minecraft.entity.passive.EntityVillager __stackOp1607_2_0 = this;
    net.minecraft.entity.passive.EntityVillager __stackOp1607_4_0 = __stackOp1607_2_0;
    int __stackOp1607_4_1 = (((net.minecraft.entity.passive.EntityVillager)(__stackOp1607_2_0)).b_ - 1);
    spill1607_0 = __stackOp1607_4_1;
    ((net.minecraft.entity.passive.EntityVillager)(__stackOp1607_4_0)).b_ = ((int)(__stackOp1607_4_1));
    if (!((life3_5 == 0))) {
        lexicalValue1607_91_0 = spill1607_0;
        break lexical_join_91;
    }
    if (!((spill1607_0 <= 0))) {
        break lexical_join_87;
    }
    life4_23 = new moom.DT(this);
    ((moom.EG)(((net.minecraft.world.World)(this.i)).a__EG())).a__Void(((moom.DT)(life4_23)));
    this.b_ = ((int)((__sourceIntrinsic_ebf98100c39e_invokedynamic1607_9(32725, (5450346545913729354L ^ life1_3)) + ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic1607_11(8475, (6560660151306637214L ^ life1_3))))))));
    this.cc = ((net.minecraft.village.Village)(((moom.EG)(((net.minecraft.world.World)(this.i)).a__EG())).a(((moom.DT)(life4_23)), ((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic1607_16(24177, (2224847395167219965L ^ life1_3)))))));
    spill1607_1 = this.cc;
    if (!((life3_5 == 0))) {
        lexicalValue1607_65_0 = spill1607_1;
        break lexical_join_65;
    }
    if (!((spill1607_1 == null))) {
        break lexical_join_63;
    }
    ((net.minecraft.entity.passive.EntityVillager)(this)).W__sourceReturn_da8c82d5d4();
    if (!((life3_5 != 0))) {
        break lexical_join_87;
    }
    }
    lexicalValue1607_65_0 = this.cc;
    }
    life5_78 = ((net.minecraft.village.Village)(lexicalValue1607_65_0)).a__DT();
    ((net.minecraft.entity.passive.EntityVillager)(this)).a(((moom.DT)(life5_78)), ((int)(((int) ((float) ((net.minecraft.village.Village)(this.cc)).a())))));
    spill1607_2 = this.cm;
    if (!((life3_5 == 0))) {
        lexicalValue1607_91_0 = ((spill1607_2) ? 1 : 0);
        break lexical_join_91;
    }
    if (!(spill1607_2)) {
        break lexical_join_87;
    }
    this.cm = ((boolean)(false));
    ((net.minecraft.village.Village)(this.cc)).b(((int)(5)));
    }
    spill1607_3 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1607_199_0 = spill1607_3;
        break lexical_join_199;
    }
    lexicalValue1607_91_0 = ((((net.minecraft.entity.passive.EntityVillager)(spill1607_3)).af()) ? 1 : 0);
    }
    if (!((lexicalValue1607_91_0 == 0))) {
        break lexical_join_198;
    }
    spill1607_4 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1607_199_0 = spill1607_4;
        break lexical_join_199;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill1607_4)).cf > 0))) {
        break lexical_join_198;
    }
    net.minecraft.entity.passive.EntityVillager __stackOp1607_34_0 = this;
    ((net.minecraft.entity.passive.EntityVillager)(__stackOp1607_34_0)).cf = ((int)((((net.minecraft.entity.passive.EntityVillager)(__stackOp1607_34_0)).cf - 1)));
    spill1607_5 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1607_199_0 = spill1607_5;
        break lexical_join_199;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill1607_5)).cf <= 0))) {
        break lexical_join_198;
    }
    spill1607_6 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1607_186_0 = spill1607_6;
        break lexical_join_186;
    }
    if (!(((net.minecraft.entity.passive.EntityVillager)(spill1607_6)).cg)) {
        break lexical_join_185;
    }
    life4_155 = ((moom.OF)(this.ce)).iterator();
    lexical_cycle_117: while (true) {
    lexical_join_152: {
    lexical_join_132: {
    if (!(((java.util.Iterator)(life4_155)).hasNext())) {
        break lexical_join_154;
    }
    life5_162 = ((net.minecraft.village.MerchantRecipe)(((java.util.Iterator)(life4_155)).next()));
    spill1607_7 = life5_162;
    if (!((life3_5 == 0))) {
        lexicalValue1607_132_0 = spill1607_7;
        break lexical_join_132;
    }
    spill1607_8 = ((net.minecraft.village.MerchantRecipe)(spill1607_7)).b__Boolean();
    if (!((life3_5 == 0))) {
        lexicalValue1607_184_0 = ((spill1607_8) ? 1 : 0);
        break lexical_join_184;
    }
    if (!(spill1607_8)) {
        break lexical_join_152;
    }
    lexicalValue1607_132_0 = life5_162;
    }
    ((net.minecraft.village.MerchantRecipe)(lexicalValue1607_132_0)).a(((int)(((((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic1607_47(25127, (860862447427652749L ^ life1_3))))) + ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic1607_50(25127, (860862447427652749L ^ life1_3)))))) + 2))));
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_117; }
    break lexical_cycle_117;
    }
    }
    ((net.minecraft.entity.passive.EntityVillager)(this)).Z__sourceReturn_da8c82d5d4();
    this.cg = ((boolean)(false));
    spill1607_9 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1607_186_0 = spill1607_9;
        break lexical_join_186;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill1607_9)).cc != null))) {
        break lexical_join_185;
    }
    spill1607_10 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1607_186_0 = spill1607_10;
        break lexical_join_186;
    }
    if (!((((net.minecraft.entity.passive.EntityVillager)(spill1607_10)).cj != null))) {
        break lexical_join_185;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_ebf98100c39e_invokedynamic1607_58(29319, (8017884902737058829L ^ life1_3)))));
    lexicalValue1607_184_0 = ((net.minecraft.village.Village)(this.cc)).a(((java.lang.String)(this.cj)), ((int)(1)));
    }
    recovery.source.CarrierOps.discard(lexicalValue1607_184_0);
    }
    lexicalValue1607_186_0 = this;
    }
    ((net.minecraft.entity.passive.EntityVillager)(lexicalValue1607_186_0)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).I, __sourceIntrinsic_ebf98100c39e_invokedynamic1607_66(12352, (6690907011933822707L ^ life1_3)), 0))));
    }
    lexicalValue1607_199_0 = this;
    }
    __sourceIntrinsic_ebf98100c39e_call1607_68(lexicalValue1607_199_0);
    return;
}


public boolean ai() {
int forwardValue5348_12_0;
    int forwardValue5348_14_0;
    int forwardValue5348_28_0;
    int forwardValue5348_32_0;
    int forwardValue5348_36_0;
    int forwardValue5348_38_0;
    int spill5348_0;
    int spill5348_1;
    boolean spill5348_2;
    long life1_3;
    int life3_5;
    int life4_17;
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_32: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 19177962260417L);
    life3_5 = moom.vR.b();
    spill5348_0 = ((net.minecraft.entity.passive.EntityVillager)(this)).r__sourceReturn_8abf5c6871();
    if (!((life3_5 != 0))) {
        forwardValue5348_12_0 = spill5348_0;
        break forward_join_12;
    }
    if (!((spill5348_0 == 0))) {
        break forward_join_13;
    }
    forwardValue5348_12_0 = 1;
    }
    forwardValue5348_14_0 = forwardValue5348_12_0;
    break forward_join_14;
    }
    forwardValue5348_14_0 = 0;
    }
    life4_17 = forwardValue5348_14_0;
    spill5348_1 = life4_17;
    if (!((life3_5 != 0))) {
        forwardValue5348_32_0 = spill5348_1;
        break forward_join_32;
    }
    if (!((spill5348_1 != 0))) {
        break forward_join_29;
    }
    spill5348_2 = ((net.minecraft.entity.passive.EntityVillager)(this)).c__sourceReturn_9a6ad9dfe5(((int)(5)));
    if (!((life3_5 != 0))) {
        forwardValue5348_28_0 = ((spill5348_2) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill5348_2))) {
        break forward_join_27;
    }
    forwardValue5348_38_0 = 1;
    break forward_join_38;
    }
    forwardValue5348_28_0 = 0;
    }
    forwardValue5348_38_0 = forwardValue5348_28_0;
    break forward_join_38;
    }
    forwardValue5348_32_0 = ((((net.minecraft.entity.passive.EntityVillager)(this)).c__sourceReturn_9a6ad9dfe5(((int)(1)))) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue5348_36_0 = forwardValue5348_32_0;
        break forward_join_36;
    }
    if (!((forwardValue5348_32_0 == 0))) {
        break forward_join_37;
    }
    forwardValue5348_36_0 = 1;
    }
    forwardValue5348_38_0 = forwardValue5348_36_0;
    break forward_join_38;
    }
    forwardValue5348_38_0 = 0;
    }
    return ((forwardValue5348_38_0) != 0);
}


public boolean aj() {
net.minecraft.item.Item lexicalValue1611_31_0;
    net.minecraft.item.Item lexicalValue1611_31_1;
    net.minecraft.item.Item lexicalValue1611_37_0;
    net.minecraft.item.Item lexicalValue1611_37_1;
    int spill1611_0;
    net.minecraft.item.Item spill1611_1;
    net.minecraft.item.Item spill1611_2;
    long life1_3;
    int life4_6;
    int life3_7;
    net.minecraft.item.ItemStack life5_17;
    lexical_join_43: {
    life1_3 = (net.minecraft.entity.passive.EntityVillager.ib ^ 9104218783723L);
    spill1611_0 = moom.vR.b();
    life4_6 = 0;
    life3_7 = spill1611_0;
    lexical_cycle_8: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_31: {
    if (!((life4_6 < ((moom.wq)(this.co)).b__Int()))) {
        break lexical_join_43;
    }
    life5_17 = ((moom.wq)(this.co)).a__xW(((int)(life4_6)));
    if (!((life3_7 != 0))) {
        break lexical_join_41;
    }
    if (!((life5_17 != null))) {
        break lexical_join_40;
    }
    spill1611_1 = ((net.minecraft.item.ItemStack)(life5_17)).a__wQ();
    spill1611_2 = net.minecraft.init.Items.N;
    if (!((life3_7 != 0))) {
        lexicalValue1611_31_0 = spill1611_1;
        lexicalValue1611_31_1 = spill1611_2;
        break lexical_join_31;
    }
    if (!((spill1611_1 != spill1611_2))) {
        break lexical_join_38;
    }
    lexicalValue1611_31_0 = ((net.minecraft.item.ItemStack)(life5_17)).a__wQ();
    lexicalValue1611_31_1 = net.minecraft.init.Items.bH;
    }
    if (!((life3_7 != 0))) {
        lexicalValue1611_37_0 = lexicalValue1611_31_0;
        lexicalValue1611_37_1 = lexicalValue1611_31_1;
        break lexical_join_37;
    }
    if (!((lexicalValue1611_31_0 != lexicalValue1611_31_1))) {
        break lexical_join_38;
    }
    lexicalValue1611_37_0 = ((net.minecraft.item.ItemStack)(life5_17)).a__wQ();
    lexicalValue1611_37_1 = net.minecraft.init.Items.bG;
    }
    if (!((lexicalValue1611_37_0 == lexicalValue1611_37_1))) {
        break lexical_join_40;
    }
    }
    return ((1) != 0);
    }
    life4_6 += 1;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return ((0) != 0);
}


public boolean ag() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.passive.EntityVillager)(this)).c__sourceReturn_9a6ad9dfe5(((int)(1))))) != 0);
}


public boolean ah() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.passive.EntityVillager)(this)).c__sourceReturn_9a6ad9dfe5(((int)(2))))) != 0);
}


public void aa__sourceReturn_da8c82d5d4() {
this.cm = ((boolean)(true));
    return;
}


public boolean af() {
long local1 = (net.minecraft.entity.passive.EntityVillager.ib ^ 77413945719377L);
    return ((((this.cd != null) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_199(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_201(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_202(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_215(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_216(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_220(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_229(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_235(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_243(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_250(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_251(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_255(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_259(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_264(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_268(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_269(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_273(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_277(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_283(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_284(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_287(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_291(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_292(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_295(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_296(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_302(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_303(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_307(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_310(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_311(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_314(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_317(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_318(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_323(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_324(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_327(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_328(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_332(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_333(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_336(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_337(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_343(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_344(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_347(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_348(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_353(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_354(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_357(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_361(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_362(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_365(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_366(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_372(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_373(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_379(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_380(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_383(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_384(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_388(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_389(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_392(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_393(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_396(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_397(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_402(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_403(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_409(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_410(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_414(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic562_415(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac2c268a52c386d0_originalDynamicSite943_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1607_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1607_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1607_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1607_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1607_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1607_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1607_66(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_ebf98100c39e_call1607_68(net.minecraft.entity.passive.EntityVillager a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_296ab52b3f54_invokedynamic5333_4(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_296ab52b3f54_call5333_6(net.minecraft.entity.passive.EntityVillager a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5910df8f1d95_invokedynamic5334_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5910df8f1d95_invokedynamic5334_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic672_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic672_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic672_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f56e65a234d_invokedynamic5341_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1cc68e538389_invokedynamic5342_7(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_1cc68e538389_call5342_16(net.minecraft.entity.passive.EntityVillager a0, net.minecraft.util.DamageSource a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68fad084dd4d_invokedynamic5344_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f467e5a17865_invokedynamic1610_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f467e5a17865_invokedynamic1610_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f467e5a17865_invokedynamic1610_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6e581d8d1b3b_invokedynamic545_23(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a628b713ec83_invokedynamic5350_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a628b713ec83_invokedynamic5350_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic5351_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63673aced462_invokedynamic1612_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63673aced462_invokedynamic1612_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63673aced462_invokedynamic1612_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1613_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1613_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1992_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11674_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_29d7b230e97e_originalDynamicSite1993_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ebc3e426ba_originalDynamicSite1994_2(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_f17a2d20d02cf9(int p0, long p1);
private static native net.minecraft.item.ItemStack __sourceExactCall_b20cc06766c170(net.minecraft.nbt.NBTTagCompound p0);
private static native void __sourceExactCall_59bba6cdbcc6e9(net.minecraft.entity.passive.EntityVillager p0);

private static native void __sourceExactCall_ae34dbea601cc3(net.minecraft.entity.ai.EntityAITasks p0, int p1, moom.uc p2);

private static native moom.AV __sourceExactCall_360e838a3e1f70(net.minecraft.entity.passive.EntityVillager p0);
}
