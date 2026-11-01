package net.minecraft.item.crafting;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CraftingManager {

private static net.minecraft.item.crafting.CraftingManager a;

private java.util.List<net.minecraft.item.crafting.IRecipe> b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private CraftingManager() { super(); }


private static void __sourceConstructorBody_0042ef34bdac4ed4(net.minecraft.item.crafting.CraftingManager receiver) throws Throwable {

net.minecraft.item.crafting.CraftingManager spill568_0;

    net.minecraft.item.ItemStack spill568_1;

    java.lang.Object[] spill568_2;

    java.lang.Object[] spill568_3;

    java.lang.Object[] spill568_4;

    net.minecraft.item.crafting.CraftingManager spill568_5;

    net.minecraft.item.ItemStack spill568_6;

    java.lang.Object[] spill568_7;

    java.lang.Object[] spill568_8;

    java.lang.Object[] spill568_9;

    java.lang.Object[] spill568_10;

    net.minecraft.item.crafting.CraftingManager spill568_11;

    net.minecraft.item.ItemStack spill568_12;

    java.lang.Object[] spill568_13;

    java.lang.Object[] spill568_14;

    java.lang.Object[] spill568_15;

    net.minecraft.item.crafting.CraftingManager spill568_16;

    net.minecraft.item.ItemStack spill568_17;

    java.lang.Object[] spill568_18;

    java.lang.Object[] spill568_19;

    java.lang.Object[] spill568_20;

    java.lang.Object[] spill568_21;

    java.lang.Object[] spill568_22;

    java.lang.Object[] spill568_23;

    net.minecraft.item.crafting.CraftingManager spill568_24;

    net.minecraft.item.ItemStack spill568_25;

    java.lang.Object[] spill568_26;

    java.lang.Object[] spill568_27;

    java.lang.Object[] spill568_28;

    java.lang.Object[] spill568_29;

    java.lang.Object[] spill568_30;

    java.lang.Object[] spill568_31;

    net.minecraft.item.crafting.CraftingManager spill568_32;

    net.minecraft.item.ItemStack spill568_33;

    java.lang.Object[] spill568_34;

    java.lang.Object[] spill568_35;

    java.lang.Object[] spill568_36;

    java.lang.Object[] spill568_37;

    java.lang.Object[] spill568_38;

    java.lang.Object[] spill568_39;

    net.minecraft.item.crafting.CraftingManager spill568_40;

    net.minecraft.item.ItemStack spill568_41;

    java.lang.Object[] spill568_42;

    java.lang.Object[] spill568_43;

    java.lang.Object[] spill568_44;

    java.lang.Object[] spill568_45;

    java.lang.Object[] spill568_46;

    java.lang.Object[] spill568_47;

    net.minecraft.item.crafting.CraftingManager spill568_48;

    net.minecraft.item.ItemStack spill568_49;

    java.lang.Object[] spill568_50;

    java.lang.Object[] spill568_51;

    java.lang.Object[] spill568_52;

    java.lang.Object[] spill568_53;

    java.lang.Object[] spill568_54;

    java.lang.Object[] spill568_55;

    net.minecraft.item.crafting.CraftingManager spill568_56;

    net.minecraft.item.ItemStack spill568_57;

    java.lang.Object[] spill568_58;

    java.lang.Object[] spill568_59;

    java.lang.Object[] spill568_60;

    java.lang.Object[] spill568_61;

    java.lang.Object[] spill568_62;

    java.lang.Object[] spill568_63;

    net.minecraft.item.crafting.CraftingManager spill568_64;

    net.minecraft.item.ItemStack spill568_65;

    java.lang.Object[] spill568_66;

    java.lang.Object[] spill568_67;

    java.lang.Object[] spill568_68;

    java.lang.Object[] spill568_69;

    net.minecraft.item.crafting.CraftingManager spill568_70;

    net.minecraft.item.ItemStack spill568_71;

    java.lang.Object[] spill568_72;

    java.lang.Object[] spill568_73;

    java.lang.Object[] spill568_74;

    java.lang.Object[] spill568_75;

    net.minecraft.item.crafting.CraftingManager spill568_76;

    net.minecraft.item.ItemStack spill568_77;

    java.lang.Object[] spill568_78;

    java.lang.Object[] spill568_79;

    java.lang.Object[] spill568_80;

    java.lang.Object[] spill568_81;

    net.minecraft.item.crafting.CraftingManager spill568_82;

    net.minecraft.item.ItemStack spill568_83;

    java.lang.Object[] spill568_84;

    java.lang.Object[] spill568_85;

    java.lang.Object[] spill568_86;

    java.lang.Object[] spill568_87;

    java.lang.Object[] spill568_88;

    java.lang.Object[] spill568_89;

    net.minecraft.item.crafting.CraftingManager spill568_90;

    net.minecraft.item.ItemStack spill568_91;

    java.lang.Object[] spill568_92;

    java.lang.Object[] spill568_93;

    java.lang.Object[] spill568_94;

    java.lang.Object[] spill568_95;

    java.lang.Object[] spill568_96;

    java.lang.Object[] spill568_97;

    net.minecraft.item.crafting.CraftingManager spill568_98;

    net.minecraft.item.ItemStack spill568_99;

    java.lang.Object[] spill568_100;

    java.lang.Object[] spill568_101;

    java.lang.Object[] spill568_102;

    java.lang.Object[] spill568_103;

    java.lang.Object[] spill568_104;

    java.lang.Object[] spill568_105;

    net.minecraft.item.crafting.CraftingManager spill568_106;

    net.minecraft.item.ItemStack spill568_107;

    java.lang.Object[] spill568_108;

    java.lang.Object[] spill568_109;

    java.lang.Object[] spill568_110;

    java.lang.Object[] spill568_111;

    java.lang.Object[] spill568_112;

    java.lang.Object[] spill568_113;

    net.minecraft.item.crafting.CraftingManager spill568_114;

    net.minecraft.item.ItemStack spill568_115;

    java.lang.Object[] spill568_116;

    java.lang.Object[] spill568_117;

    java.lang.Object[] spill568_118;

    java.lang.Object[] spill568_119;

    java.lang.Object[] spill568_120;

    java.lang.Object[] spill568_121;

    net.minecraft.item.crafting.CraftingManager spill568_122;

    net.minecraft.item.ItemStack spill568_123;

    java.lang.Object[] spill568_124;

    java.lang.Object[] spill568_125;

    java.lang.Object[] spill568_126;

    java.lang.Object[] spill568_127;

    java.lang.Object[] spill568_128;

    java.lang.Object[] spill568_129;

    net.minecraft.item.crafting.CraftingManager spill568_130;

    net.minecraft.item.ItemStack spill568_131;

    java.lang.Object[] spill568_132;

    java.lang.Object[] spill568_133;

    java.lang.Object[] spill568_134;

    java.lang.Object[] spill568_135;

    java.lang.Object[] spill568_136;

    java.lang.Object[] spill568_137;

    java.lang.Object[] spill568_138;

    net.minecraft.item.crafting.CraftingManager spill568_139;

    net.minecraft.item.ItemStack spill568_140;

    java.lang.Object[] spill568_141;

    java.lang.Object[] spill568_142;

    java.lang.Object[] spill568_143;

    java.lang.Object[] spill568_144;

    java.lang.Object[] spill568_145;

    java.lang.Object[] spill568_146;

    java.lang.Object[] spill568_147;

    net.minecraft.item.crafting.CraftingManager spill568_148;

    net.minecraft.item.ItemStack spill568_149;

    java.lang.Object[] spill568_150;

    java.lang.Object[] spill568_151;

    java.lang.Object[] spill568_152;

    java.lang.Object[] spill568_153;

    java.lang.Object[] spill568_154;

    java.lang.Object[] spill568_155;

    java.lang.Object[] spill568_156;

    net.minecraft.item.crafting.CraftingManager spill568_157;

    net.minecraft.item.ItemStack spill568_158;

    java.lang.Object[] spill568_159;

    java.lang.Object[] spill568_160;

    java.lang.Object[] spill568_161;

    java.lang.Object[] spill568_162;

    java.lang.Object[] spill568_163;

    java.lang.Object[] spill568_164;

    java.lang.Object[] spill568_165;

    net.minecraft.item.crafting.CraftingManager spill568_166;

    net.minecraft.item.ItemStack spill568_167;

    java.lang.Object[] spill568_168;

    java.lang.Object[] spill568_169;

    java.lang.Object[] spill568_170;

    java.lang.Object[] spill568_171;

    net.minecraft.item.crafting.CraftingManager spill568_172;

    net.minecraft.item.ItemStack spill568_173;

    java.lang.Object[] spill568_174;

    java.lang.Object[] spill568_175;

    java.lang.Object[] spill568_176;

    net.minecraft.item.crafting.CraftingManager spill568_177;

    net.minecraft.item.ItemStack spill568_178;

    java.lang.Object[] spill568_179;

    java.lang.Object[] spill568_180;

    java.lang.Object[] spill568_181;

    java.lang.Object[] spill568_182;

    net.minecraft.item.crafting.CraftingManager spill568_183;

    net.minecraft.item.ItemStack spill568_184;

    java.lang.Object[] spill568_185;

    java.lang.Object[] spill568_186;

    java.lang.Object[] spill568_187;

    java.lang.Object[] spill568_188;

    net.minecraft.item.crafting.CraftingManager spill568_189;

    net.minecraft.item.ItemStack spill568_190;

    java.lang.Object[] spill568_191;

    java.lang.Object[] spill568_192;

    java.lang.Object[] spill568_193;

    java.lang.Object[] spill568_194;

    net.minecraft.item.crafting.CraftingManager spill568_195;

    net.minecraft.item.ItemStack spill568_196;

    java.lang.Object[] spill568_197;

    java.lang.Object[] spill568_198;

    java.lang.Object[] spill568_199;

    java.lang.Object[] spill568_200;

    net.minecraft.item.crafting.CraftingManager spill568_201;

    net.minecraft.item.ItemStack spill568_202;

    java.lang.Object[] spill568_203;

    java.lang.Object[] spill568_204;

    java.lang.Object[] spill568_205;

    java.lang.Object[] spill568_206;

    net.minecraft.item.crafting.CraftingManager spill568_207;

    net.minecraft.item.ItemStack spill568_208;

    java.lang.Object[] spill568_209;

    java.lang.Object[] spill568_210;

    java.lang.Object[] spill568_211;

    java.lang.Object[] spill568_212;

    java.lang.Object[] spill568_213;

    java.lang.Object[] spill568_214;

    java.lang.Object[] spill568_215;

    net.minecraft.item.crafting.CraftingManager spill568_216;

    net.minecraft.item.ItemStack spill568_217;

    java.lang.Object[] spill568_218;

    java.lang.Object[] spill568_219;

    java.lang.Object[] spill568_220;

    net.minecraft.item.crafting.CraftingManager spill568_221;

    net.minecraft.item.ItemStack spill568_222;

    java.lang.Object[] spill568_223;

    java.lang.Object[] spill568_224;

    java.lang.Object[] spill568_225;

    net.minecraft.item.crafting.CraftingManager spill568_226;

    net.minecraft.item.ItemStack spill568_227;

    java.lang.Object[] spill568_228;

    java.lang.Object[] spill568_229;

    java.lang.Object[] spill568_230;

    net.minecraft.item.crafting.CraftingManager spill568_231;

    net.minecraft.item.ItemStack spill568_232;

    java.lang.Object[] spill568_233;

    java.lang.Object[] spill568_234;

    java.lang.Object[] spill568_235;

    net.minecraft.item.crafting.CraftingManager spill568_236;

    net.minecraft.item.ItemStack spill568_237;

    java.lang.Object[] spill568_238;

    java.lang.Object[] spill568_239;

    java.lang.Object[] spill568_240;

    net.minecraft.item.crafting.CraftingManager spill568_241;

    net.minecraft.item.ItemStack spill568_242;

    java.lang.Object[] spill568_243;

    java.lang.Object[] spill568_244;

    java.lang.Object[] spill568_245;

    net.minecraft.item.crafting.CraftingManager spill568_246;

    net.minecraft.item.ItemStack spill568_247;

    java.lang.Object[] spill568_248;

    java.lang.Object[] spill568_249;

    java.lang.Object[] spill568_250;

    net.minecraft.item.crafting.CraftingManager spill568_251;

    net.minecraft.item.ItemStack spill568_252;

    java.lang.Object[] spill568_253;

    java.lang.Object[] spill568_254;

    java.lang.Object[] spill568_255;

    net.minecraft.item.crafting.CraftingManager spill568_256;

    net.minecraft.item.ItemStack spill568_257;

    java.lang.Object[] spill568_258;

    java.lang.Object[] spill568_259;

    java.lang.Object[] spill568_260;

    net.minecraft.item.crafting.CraftingManager spill568_261;

    net.minecraft.item.ItemStack spill568_262;

    java.lang.Object[] spill568_263;

    java.lang.Object[] spill568_264;

    java.lang.Object[] spill568_265;

    net.minecraft.item.crafting.CraftingManager spill568_266;

    net.minecraft.item.ItemStack spill568_267;

    java.lang.Object[] spill568_268;

    java.lang.Object[] spill568_269;

    java.lang.Object[] spill568_270;

    net.minecraft.item.crafting.CraftingManager spill568_271;

    net.minecraft.item.ItemStack spill568_272;

    java.lang.Object[] spill568_273;

    java.lang.Object[] spill568_274;

    java.lang.Object[] spill568_275;

    net.minecraft.item.crafting.CraftingManager spill568_276;

    net.minecraft.item.ItemStack spill568_277;

    java.lang.Object[] spill568_278;

    java.lang.Object[] spill568_279;

    java.lang.Object[] spill568_280;

    net.minecraft.item.crafting.CraftingManager spill568_281;

    net.minecraft.item.ItemStack spill568_282;

    java.lang.Object[] spill568_283;

    java.lang.Object[] spill568_284;

    java.lang.Object[] spill568_285;

    net.minecraft.item.crafting.CraftingManager spill568_286;

    net.minecraft.item.ItemStack spill568_287;

    java.lang.Object[] spill568_288;

    java.lang.Object[] spill568_289;

    java.lang.Object[] spill568_290;

    java.lang.Object[] spill568_291;

    java.lang.Object[] spill568_292;

    net.minecraft.item.crafting.CraftingManager spill568_293;

    net.minecraft.item.ItemStack spill568_294;

    java.lang.Object[] spill568_295;

    java.lang.Object[] spill568_296;

    java.lang.Object[] spill568_297;

    java.lang.Object[] spill568_298;

    java.lang.Object[] spill568_299;

    net.minecraft.item.crafting.CraftingManager spill568_300;

    net.minecraft.item.ItemStack spill568_301;

    java.lang.Object[] spill568_302;

    java.lang.Object[] spill568_303;

    java.lang.Object[] spill568_304;

    java.lang.Object[] spill568_305;

    java.lang.Object[] spill568_306;

    net.minecraft.item.crafting.CraftingManager spill568_307;

    net.minecraft.item.ItemStack spill568_308;

    java.lang.Object[] spill568_309;

    java.lang.Object[] spill568_310;

    java.lang.Object[] spill568_311;

    java.lang.Object[] spill568_312;

    java.lang.Object[] spill568_313;

    net.minecraft.item.crafting.CraftingManager spill568_314;

    net.minecraft.item.ItemStack spill568_315;

    java.lang.Object[] spill568_316;

    java.lang.Object[] spill568_317;

    java.lang.Object[] spill568_318;

    java.lang.Object[] spill568_319;

    java.lang.Object[] spill568_320;

    net.minecraft.item.crafting.CraftingManager spill568_321;

    net.minecraft.item.ItemStack spill568_322;

    java.lang.Object[] spill568_323;

    java.lang.Object[] spill568_324;

    java.lang.Object[] spill568_325;

    java.lang.Object[] spill568_326;

    java.lang.Object[] spill568_327;

    net.minecraft.item.crafting.CraftingManager spill568_328;

    net.minecraft.item.ItemStack spill568_329;

    java.lang.Object[] spill568_330;

    java.lang.Object[] spill568_331;

    java.lang.Object[] spill568_332;

    java.lang.Object[] spill568_333;

    java.lang.Object[] spill568_334;

    net.minecraft.item.crafting.CraftingManager spill568_335;

    net.minecraft.item.ItemStack spill568_336;

    java.lang.Object[] spill568_337;

    java.lang.Object[] spill568_338;

    java.lang.Object[] spill568_339;

    java.lang.Object[] spill568_340;

    net.minecraft.item.crafting.CraftingManager spill568_341;

    net.minecraft.item.ItemStack spill568_342;

    java.lang.Object[] spill568_343;

    java.lang.Object[] spill568_344;

    java.lang.Object[] spill568_345;

    java.lang.Object[] spill568_346;

    java.lang.Object[] spill568_347;

    net.minecraft.item.crafting.CraftingManager spill568_348;

    net.minecraft.item.ItemStack spill568_349;

    java.lang.Object[] spill568_350;

    java.lang.Object[] spill568_351;

    java.lang.Object[] spill568_352;

    java.lang.Object[] spill568_353;

    net.minecraft.item.crafting.CraftingManager spill568_354;

    net.minecraft.item.ItemStack spill568_355;

    java.lang.Object[] spill568_356;

    java.lang.Object[] spill568_357;

    java.lang.Object[] spill568_358;

    java.lang.Object[] spill568_359;

    java.lang.Object[] spill568_360;

    java.lang.Object[] spill568_361;

    java.lang.Object[] spill568_362;

    net.minecraft.item.crafting.CraftingManager spill568_363;

    net.minecraft.item.ItemStack spill568_364;

    java.lang.Object[] spill568_365;

    java.lang.Object[] spill568_366;

    java.lang.Object[] spill568_367;

    java.lang.Object[] spill568_368;

    java.lang.Object[] spill568_369;

    java.lang.Object[] spill568_370;

    java.lang.Object[] spill568_371;

    java.lang.Object[] spill568_372;

    java.lang.Object[] spill568_373;

    java.lang.Object[] spill568_374;

    java.lang.Object[] spill568_375;

    net.minecraft.item.crafting.CraftingManager spill568_376;

    net.minecraft.item.ItemStack spill568_377;

    java.lang.Object[] spill568_378;

    java.lang.Object[] spill568_379;

    java.lang.Object[] spill568_380;

    net.minecraft.item.crafting.CraftingManager spill568_381;

    net.minecraft.item.ItemStack spill568_382;

    java.lang.Object[] spill568_383;

    java.lang.Object[] spill568_384;

    java.lang.Object[] spill568_385;

    net.minecraft.item.crafting.CraftingManager spill568_386;

    net.minecraft.item.ItemStack spill568_387;

    java.lang.Object[] spill568_388;

    java.lang.Object[] spill568_389;

    java.lang.Object[] spill568_390;

    net.minecraft.item.crafting.CraftingManager spill568_391;

    net.minecraft.item.ItemStack spill568_392;

    java.lang.Object[] spill568_393;

    java.lang.Object[] spill568_394;

    java.lang.Object[] spill568_395;

    net.minecraft.item.crafting.CraftingManager spill568_396;

    net.minecraft.item.ItemStack spill568_397;

    java.lang.Object[] spill568_398;

    java.lang.Object[] spill568_399;

    java.lang.Object[] spill568_400;

    net.minecraft.item.crafting.CraftingManager spill568_401;

    net.minecraft.item.ItemStack spill568_402;

    java.lang.Object[] spill568_403;

    java.lang.Object[] spill568_404;

    java.lang.Object[] spill568_405;

    net.minecraft.item.crafting.CraftingManager spill568_406;

    net.minecraft.item.ItemStack spill568_407;

    java.lang.Object[] spill568_408;

    java.lang.Object[] spill568_409;

    java.lang.Object[] spill568_410;

    net.minecraft.item.crafting.CraftingManager spill568_411;

    net.minecraft.item.ItemStack spill568_412;

    java.lang.Object[] spill568_413;

    java.lang.Object[] spill568_414;

    java.lang.Object[] spill568_415;

    java.lang.Object[] spill568_416;

    net.minecraft.item.crafting.CraftingManager spill568_417;

    net.minecraft.item.ItemStack spill568_418;

    java.lang.Object[] spill568_419;

    java.lang.Object[] spill568_420;

    java.lang.Object[] spill568_421;

    java.lang.Object[] spill568_422;

    java.lang.Object[] spill568_423;

    java.lang.Object[] spill568_424;

    net.minecraft.item.crafting.CraftingManager spill568_425;

    net.minecraft.item.ItemStack spill568_426;

    java.lang.Object[] spill568_427;

    java.lang.Object[] spill568_428;

    java.lang.Object[] spill568_429;

    java.lang.Object[] spill568_430;

    java.lang.Object[] spill568_431;

    java.lang.Object[] spill568_432;

    net.minecraft.item.crafting.CraftingManager spill568_433;

    net.minecraft.item.ItemStack spill568_434;

    java.lang.Object[] spill568_435;

    java.lang.Object[] spill568_436;

    java.lang.Object[] spill568_437;

    java.lang.Object[] spill568_438;

    net.minecraft.item.crafting.CraftingManager spill568_439;

    net.minecraft.item.ItemStack spill568_440;

    java.lang.Object[] spill568_441;

    java.lang.Object[] spill568_442;

    java.lang.Object[] spill568_443;

    java.lang.Object[] spill568_444;

    net.minecraft.item.crafting.CraftingManager spill568_445;

    net.minecraft.item.ItemStack spill568_446;

    java.lang.Object[] spill568_447;

    java.lang.Object[] spill568_448;

    java.lang.Object[] spill568_449;

    java.lang.Object[] spill568_450;

    java.lang.Object[] spill568_451;

    java.lang.Object[] spill568_452;

    java.lang.Object[] spill568_453;

    net.minecraft.item.crafting.CraftingManager spill568_454;

    net.minecraft.item.ItemStack spill568_455;

    java.lang.Object[] spill568_456;

    java.lang.Object[] spill568_457;

    java.lang.Object[] spill568_458;

    java.lang.Object[] spill568_459;

    java.lang.Object[] spill568_460;

    java.lang.Object[] spill568_461;

    java.lang.Object[] spill568_462;

    java.lang.Object[] spill568_463;

    java.lang.Object[] spill568_464;

    net.minecraft.item.crafting.CraftingManager spill568_465;

    net.minecraft.item.ItemStack spill568_466;

    java.lang.Object[] spill568_467;

    java.lang.Object[] spill568_468;

    java.lang.Object[] spill568_469;

    java.lang.Object[] spill568_470;

    java.lang.Object[] spill568_471;

    java.lang.Object[] spill568_472;

    java.lang.Object[] spill568_473;

    java.lang.Object[] spill568_474;

    java.lang.Object[] spill568_475;

    net.minecraft.item.crafting.CraftingManager spill568_476;

    net.minecraft.item.ItemStack spill568_477;

    java.lang.Object[] spill568_478;

    java.lang.Object[] spill568_479;

    java.lang.Object[] spill568_480;

    java.lang.Object[] spill568_481;

    java.lang.Object[] spill568_482;

    java.lang.Object[] spill568_483;

    java.lang.Object[] spill568_484;

    java.lang.Object[] spill568_485;

    java.lang.Object[] spill568_486;

    net.minecraft.item.crafting.CraftingManager spill568_487;

    net.minecraft.item.ItemStack spill568_488;

    java.lang.Object[] spill568_489;

    java.lang.Object[] spill568_490;

    java.lang.Object[] spill568_491;

    java.lang.Object[] spill568_492;

    net.minecraft.item.crafting.CraftingManager spill568_493;

    net.minecraft.item.ItemStack spill568_494;

    java.lang.Object[] spill568_495;

    java.lang.Object[] spill568_496;

    java.lang.Object[] spill568_497;

    java.lang.Object[] spill568_498;

    java.lang.Object[] spill568_499;

    net.minecraft.item.crafting.CraftingManager spill568_500;

    net.minecraft.item.ItemStack spill568_501;

    java.lang.Object[] spill568_502;

    java.lang.Object[] spill568_503;

    java.lang.Object[] spill568_504;

    java.lang.Object[] spill568_505;

    java.lang.Object[] spill568_506;

    java.lang.Object[] spill568_507;

    net.minecraft.item.crafting.CraftingManager spill568_508;

    net.minecraft.item.ItemStack spill568_509;

    java.lang.Object[] spill568_510;

    java.lang.Object[] spill568_511;

    java.lang.Object[] spill568_512;

    java.lang.Object[] spill568_513;

    java.lang.Object[] spill568_514;

    java.lang.Object[] spill568_515;

    net.minecraft.item.crafting.CraftingManager spill568_516;

    net.minecraft.item.ItemStack spill568_517;

    java.lang.Object[] spill568_518;

    java.lang.Object[] spill568_519;

    java.lang.Object[] spill568_520;

    java.lang.Object[] spill568_521;

    java.lang.Object[] spill568_522;

    java.lang.Object[] spill568_523;

    net.minecraft.item.crafting.CraftingManager spill568_524;

    net.minecraft.item.ItemStack spill568_525;

    java.lang.Object[] spill568_526;

    java.lang.Object[] spill568_527;

    java.lang.Object[] spill568_528;

    java.lang.Object[] spill568_529;

    java.lang.Object[] spill568_530;

    java.lang.Object[] spill568_531;

    net.minecraft.item.crafting.CraftingManager spill568_532;

    net.minecraft.item.ItemStack spill568_533;

    java.lang.Object[] spill568_534;

    java.lang.Object[] spill568_535;

    java.lang.Object[] spill568_536;

    java.lang.Object[] spill568_537;

    java.lang.Object[] spill568_538;

    java.lang.Object[] spill568_539;

    net.minecraft.item.crafting.CraftingManager spill568_540;

    net.minecraft.item.ItemStack spill568_541;

    java.lang.Object[] spill568_542;

    java.lang.Object[] spill568_543;

    java.lang.Object[] spill568_544;

    java.lang.Object[] spill568_545;

    java.lang.Object[] spill568_546;

    java.lang.Object[] spill568_547;

    net.minecraft.item.crafting.CraftingManager spill568_548;

    net.minecraft.item.ItemStack spill568_549;

    java.lang.Object[] spill568_550;

    java.lang.Object[] spill568_551;

    java.lang.Object[] spill568_552;

    java.lang.Object[] spill568_553;

    net.minecraft.item.crafting.CraftingManager spill568_554;

    net.minecraft.item.ItemStack spill568_555;

    java.lang.Object[] spill568_556;

    java.lang.Object[] spill568_557;

    java.lang.Object[] spill568_558;

    java.lang.Object[] spill568_559;

    net.minecraft.item.crafting.CraftingManager spill568_560;

    net.minecraft.item.ItemStack spill568_561;

    java.lang.Object[] spill568_562;

    java.lang.Object[] spill568_563;

    java.lang.Object[] spill568_564;

    java.lang.Object[] spill568_565;

    net.minecraft.item.crafting.CraftingManager spill568_566;

    net.minecraft.item.ItemStack spill568_567;

    java.lang.Object[] spill568_568;

    java.lang.Object[] spill568_569;

    net.minecraft.item.crafting.CraftingManager spill568_570;

    net.minecraft.item.ItemStack spill568_571;

    java.lang.Object[] spill568_572;

    java.lang.Object[] spill568_573;

    java.lang.Object[] spill568_574;

    net.minecraft.item.crafting.CraftingManager spill568_575;

    net.minecraft.item.ItemStack spill568_576;

    java.lang.Object[] spill568_577;

    java.lang.Object[] spill568_578;

    java.lang.Object[] spill568_579;

    java.lang.Object[] spill568_580;

    java.lang.Object[] spill568_581;

    net.minecraft.item.crafting.CraftingManager spill568_582;

    net.minecraft.item.ItemStack spill568_583;

    java.lang.Object[] spill568_584;

    java.lang.Object[] spill568_585;

    java.lang.Object[] spill568_586;

    java.lang.Object[] spill568_587;

    java.lang.Object[] spill568_588;

    net.minecraft.item.crafting.CraftingManager spill568_589;

    net.minecraft.item.ItemStack spill568_590;

    java.lang.Object[] spill568_591;

    java.lang.Object[] spill568_592;

    java.lang.Object[] spill568_593;

    java.lang.Object[] spill568_594;

    java.lang.Object[] spill568_595;

    net.minecraft.item.crafting.CraftingManager spill568_596;

    net.minecraft.item.ItemStack spill568_597;

    java.lang.Object[] spill568_598;

    java.lang.Object[] spill568_599;

    java.lang.Object[] spill568_600;

    java.lang.Object[] spill568_601;

    java.lang.Object[] spill568_602;

    net.minecraft.item.crafting.CraftingManager spill568_603;

    net.minecraft.item.ItemStack spill568_604;

    java.lang.Object[] spill568_605;

    java.lang.Object[] spill568_606;

    java.lang.Object[] spill568_607;

    java.lang.Object[] spill568_608;

    java.lang.Object[] spill568_609;

    net.minecraft.item.crafting.CraftingManager spill568_610;

    net.minecraft.item.ItemStack spill568_611;

    java.lang.Object[] spill568_612;

    java.lang.Object[] spill568_613;

    java.lang.Object[] spill568_614;

    java.lang.Object[] spill568_615;

    java.lang.Object[] spill568_616;

    net.minecraft.item.crafting.CraftingManager spill568_617;

    net.minecraft.item.ItemStack spill568_618;

    java.lang.Object[] spill568_619;

    java.lang.Object[] spill568_620;

    java.lang.Object[] spill568_621;

    java.lang.Object[] spill568_622;

    java.lang.Object[] spill568_623;

    java.lang.Object[] spill568_624;

    java.lang.Object[] spill568_625;

    net.minecraft.item.crafting.CraftingManager spill568_626;

    net.minecraft.item.ItemStack spill568_627;

    java.lang.Object[] spill568_628;

    java.lang.Object[] spill568_629;

    java.lang.Object[] spill568_630;

    java.lang.Object[] spill568_631;

    java.lang.Object[] spill568_632;

    java.lang.Object[] spill568_633;

    net.minecraft.item.crafting.CraftingManager spill568_634;

    net.minecraft.item.ItemStack spill568_635;

    java.lang.Object[] spill568_636;

    java.lang.Object[] spill568_637;

    java.lang.Object[] spill568_638;

    java.lang.Object[] spill568_639;

    java.lang.Object[] spill568_640;

    net.minecraft.item.crafting.CraftingManager spill568_641;

    net.minecraft.item.ItemStack spill568_642;

    java.lang.Object[] spill568_643;

    java.lang.Object[] spill568_644;

    java.lang.Object[] spill568_645;

    java.lang.Object[] spill568_646;

    java.lang.Object[] spill568_647;

    net.minecraft.item.crafting.CraftingManager spill568_648;

    net.minecraft.item.ItemStack spill568_649;

    java.lang.Object[] spill568_650;

    java.lang.Object[] spill568_651;

    java.lang.Object[] spill568_652;

    java.lang.Object[] spill568_653;

    java.lang.Object[] spill568_654;

    net.minecraft.item.crafting.CraftingManager spill568_655;

    net.minecraft.item.ItemStack spill568_656;

    java.lang.Object[] spill568_657;

    java.lang.Object[] spill568_658;

    java.lang.Object[] spill568_659;

    java.lang.Object[] spill568_660;

    java.lang.Object[] spill568_661;

    net.minecraft.item.crafting.CraftingManager spill568_662;

    net.minecraft.item.ItemStack spill568_663;

    java.lang.Object[] spill568_664;

    java.lang.Object[] spill568_665;

    java.lang.Object[] spill568_666;

    java.lang.Object[] spill568_667;

    java.lang.Object[] spill568_668;

    net.minecraft.item.crafting.CraftingManager spill568_669;

    net.minecraft.item.ItemStack spill568_670;

    java.lang.Object[] spill568_671;

    java.lang.Object[] spill568_672;

    java.lang.Object[] spill568_673;

    java.lang.Object[] spill568_674;

    java.lang.Object[] spill568_675;

    net.minecraft.item.crafting.CraftingManager spill568_676;

    net.minecraft.item.ItemStack spill568_677;

    java.lang.Object[] spill568_678;

    java.lang.Object[] spill568_679;

    java.lang.Object[] spill568_680;

    java.lang.Object[] spill568_681;

    java.lang.Object[] spill568_682;

    net.minecraft.item.crafting.CraftingManager spill568_683;

    net.minecraft.item.ItemStack spill568_684;

    java.lang.Object[] spill568_685;

    java.lang.Object[] spill568_686;

    java.lang.Object[] spill568_687;

    java.lang.Object[] spill568_688;

    java.lang.Object[] spill568_689;

    java.lang.Object[] spill568_690;

    java.lang.Object[] spill568_691;

    net.minecraft.item.crafting.CraftingManager spill568_692;

    net.minecraft.item.ItemStack spill568_693;

    java.lang.Object[] spill568_694;

    java.lang.Object[] spill568_695;

    java.lang.Object[] spill568_696;

    java.lang.Object[] spill568_697;

    java.lang.Object[] spill568_698;

    java.lang.Object[] spill568_699;

    java.lang.Object[] spill568_700;

    net.minecraft.item.crafting.CraftingManager spill568_701;

    net.minecraft.item.ItemStack spill568_702;

    java.lang.Object[] spill568_703;

    java.lang.Object[] spill568_704;

    java.lang.Object[] spill568_705;

    java.lang.Object[] spill568_706;

    java.lang.Object[] spill568_707;

    java.lang.Object[] spill568_708;

    java.lang.Object[] spill568_709;

    net.minecraft.item.crafting.CraftingManager spill568_710;

    net.minecraft.item.ItemStack spill568_711;

    java.lang.Object[] spill568_712;

    java.lang.Object[] spill568_713;

    java.lang.Object[] spill568_714;

    java.lang.Object[] spill568_715;

    java.lang.Object[] spill568_716;

    java.lang.Object[] spill568_717;

    java.lang.Object[] spill568_718;

    net.minecraft.item.crafting.CraftingManager spill568_719;

    net.minecraft.item.ItemStack spill568_720;

    java.lang.Object[] spill568_721;

    java.lang.Object[] spill568_722;

    java.lang.Object[] spill568_723;

    java.lang.Object[] spill568_724;

    java.lang.Object[] spill568_725;

    java.lang.Object[] spill568_726;

    java.lang.Object[] spill568_727;

    net.minecraft.item.crafting.CraftingManager spill568_728;

    net.minecraft.item.ItemStack spill568_729;

    java.lang.Object[] spill568_730;

    java.lang.Object[] spill568_731;

    java.lang.Object[] spill568_732;

    java.lang.Object[] spill568_733;

    java.lang.Object[] spill568_734;

    java.lang.Object[] spill568_735;

    java.lang.Object[] spill568_736;

    net.minecraft.item.crafting.CraftingManager spill568_737;

    net.minecraft.item.ItemStack spill568_738;

    java.lang.Object[] spill568_739;

    java.lang.Object[] spill568_740;

    java.lang.Object[] spill568_741;

    java.lang.Object[] spill568_742;

    java.lang.Object[] spill568_743;

    java.lang.Object[] spill568_744;

    net.minecraft.item.crafting.CraftingManager spill568_745;

    net.minecraft.item.ItemStack spill568_746;

    java.lang.Object[] spill568_747;

    java.lang.Object[] spill568_748;

    java.lang.Object[] spill568_749;

    java.lang.Object[] spill568_750;

    java.lang.Object[] spill568_751;

    java.lang.Object[] spill568_752;

    java.lang.Object[] spill568_753;

    java.lang.Object[] spill568_754;

    java.lang.Object[] spill568_755;

    net.minecraft.item.crafting.CraftingManager spill568_756;

    net.minecraft.item.ItemStack spill568_757;

    java.lang.Object[] spill568_758;

    java.lang.Object[] spill568_759;

    java.lang.Object[] spill568_760;

    java.lang.Object[] spill568_761;

    java.lang.Object[] spill568_762;

    java.lang.Object[] spill568_763;

    net.minecraft.item.crafting.CraftingManager spill568_764;

    net.minecraft.item.ItemStack spill568_765;

    java.lang.Object[] spill568_766;

    java.lang.Object[] spill568_767;

    java.lang.Object[] spill568_768;

    java.lang.Object[] spill568_769;

    java.lang.Object[] spill568_770;

    java.lang.Object[] spill568_771;

    java.lang.Object[] spill568_772;

    java.lang.Object[] spill568_773;

    net.minecraft.item.crafting.CraftingManager spill568_774;

    net.minecraft.item.ItemStack spill568_775;

    java.lang.Object[] spill568_776;

    java.lang.Object[] spill568_777;

    java.lang.Object[] spill568_778;

    java.lang.Object[] spill568_779;

    java.lang.Object[] spill568_780;

    java.lang.Object[] spill568_781;

    java.lang.Object[] spill568_782;

    java.lang.Object[] spill568_783;

    java.lang.Object[] spill568_784;

    net.minecraft.item.crafting.CraftingManager spill568_785;

    net.minecraft.item.ItemStack spill568_786;

    java.lang.Object[] spill568_787;

    java.lang.Object[] spill568_788;

    java.lang.Object[] spill568_789;

    java.lang.Object[] spill568_790;

    java.lang.Object[] spill568_791;

    java.lang.Object[] spill568_792;

    java.lang.Object[] spill568_793;

    net.minecraft.item.crafting.CraftingManager spill568_794;

    net.minecraft.item.ItemStack spill568_795;

    java.lang.Object[] spill568_796;

    java.lang.Object[] spill568_797;

    java.lang.Object[] spill568_798;

    java.lang.Object[] spill568_799;

    java.lang.Object[] spill568_800;

    java.lang.Object[] spill568_801;

    java.lang.Object[] spill568_802;

    net.minecraft.item.crafting.CraftingManager spill568_803;

    net.minecraft.item.ItemStack spill568_804;

    java.lang.Object[] spill568_805;

    java.lang.Object[] spill568_806;

    java.lang.Object[] spill568_807;

    java.lang.Object[] spill568_808;

    java.lang.Object[] spill568_809;

    java.lang.Object[] spill568_810;

    java.lang.Object[] spill568_811;

    net.minecraft.item.crafting.CraftingManager spill568_812;

    net.minecraft.item.ItemStack spill568_813;

    java.lang.Object[] spill568_814;

    java.lang.Object[] spill568_815;

    java.lang.Object[] spill568_816;

    net.minecraft.item.crafting.CraftingManager spill568_817;

    net.minecraft.item.ItemStack spill568_818;

    java.lang.Object[] spill568_819;

    java.lang.Object[] spill568_820;

    java.lang.Object[] spill568_821;

    net.minecraft.item.crafting.CraftingManager spill568_822;

    net.minecraft.item.ItemStack spill568_823;

    java.lang.Object[] spill568_824;

    java.lang.Object[] spill568_825;

    java.lang.Object[] spill568_826;

    net.minecraft.item.crafting.CraftingManager spill568_827;

    net.minecraft.item.ItemStack spill568_828;

    java.lang.Object[] spill568_829;

    java.lang.Object[] spill568_830;

    java.lang.Object[] spill568_831;

    net.minecraft.item.crafting.CraftingManager spill568_832;

    net.minecraft.item.ItemStack spill568_833;

    java.lang.Object[] spill568_834;

    java.lang.Object[] spill568_835;

    java.lang.Object[] spill568_836;

    net.minecraft.item.crafting.CraftingManager spill568_837;

    net.minecraft.item.ItemStack spill568_838;

    java.lang.Object[] spill568_839;

    java.lang.Object[] spill568_840;

    java.lang.Object[] spill568_841;

    net.minecraft.item.crafting.CraftingManager spill568_842;

    net.minecraft.item.ItemStack spill568_843;

    java.lang.Object[] spill568_844;

    java.lang.Object[] spill568_845;

    java.lang.Object[] spill568_846;

    java.lang.Object[] spill568_847;

    java.lang.Object[] spill568_848;

    java.lang.Object[] spill568_849;

    java.lang.Object[] spill568_850;

    java.lang.Object[] spill568_851;

    java.lang.Object[] spill568_852;

    net.minecraft.item.crafting.CraftingManager spill568_853;

    net.minecraft.item.ItemStack spill568_854;

    java.lang.Object[] spill568_855;

    java.lang.Object[] spill568_856;

    java.lang.Object[] spill568_857;

    java.lang.Object[] spill568_858;

    java.lang.Object[] spill568_859;

    java.lang.Object[] spill568_860;

    java.lang.Object[] spill568_861;

    net.minecraft.item.crafting.CraftingManager spill568_862;

    net.minecraft.item.ItemStack spill568_863;

    java.lang.Object[] spill568_864;

    java.lang.Object[] spill568_865;

    java.lang.Object[] spill568_866;

    java.lang.Object[] spill568_867;

    java.lang.Object[] spill568_868;

    java.lang.Object[] spill568_869;

    java.lang.Object[] spill568_870;

    java.lang.Object[] spill568_871;

    java.lang.Object[] spill568_872;

    java.lang.Object[] spill568_873;

    java.lang.Object[] spill568_874;

    net.minecraft.item.crafting.CraftingManager spill568_875;

    net.minecraft.item.ItemStack spill568_876;

    java.lang.Object[] spill568_877;

    java.lang.Object[] spill568_878;

    java.lang.Object[] spill568_879;

    java.lang.Object[] spill568_880;

    java.lang.Object[] spill568_881;

    java.lang.Object[] spill568_882;

    net.minecraft.item.crafting.CraftingManager spill568_883;

    net.minecraft.item.ItemStack spill568_884;

    java.lang.Object[] spill568_885;

    java.lang.Object[] spill568_886;

    java.lang.Object[] spill568_887;

    java.lang.Object[] spill568_888;

    java.lang.Object[] spill568_889;

    java.lang.Object[] spill568_890;

    net.minecraft.item.crafting.CraftingManager spill568_891;

    net.minecraft.item.ItemStack spill568_892;

    java.lang.Object[] spill568_893;

    java.lang.Object[] spill568_894;

    java.lang.Object[] spill568_895;

    java.lang.Object[] spill568_896;

    java.lang.Object[] spill568_897;

    java.lang.Object[] spill568_898;

    java.lang.Object[] spill568_899;

    java.lang.Object[] spill568_900;

    java.lang.Object[] spill568_901;

    net.minecraft.item.crafting.CraftingManager spill568_902;

    net.minecraft.item.ItemStack spill568_903;

    java.lang.Object[] spill568_904;

    java.lang.Object[] spill568_905;

    java.lang.Object[] spill568_906;

    java.lang.Object[] spill568_907;

    java.lang.Object[] spill568_908;

    java.lang.Object[] spill568_909;

    java.lang.Object[] spill568_910;

    net.minecraft.item.crafting.CraftingManager spill568_911;

    net.minecraft.item.ItemStack spill568_912;

    java.lang.Object[] spill568_913;

    java.lang.Object[] spill568_914;

    java.lang.Object[] spill568_915;

    java.lang.Object[] spill568_916;

    net.minecraft.item.crafting.CraftingManager spill568_917;

    net.minecraft.item.ItemStack spill568_918;

    java.lang.Object[] spill568_919;

    java.lang.Object[] spill568_920;

    net.minecraft.item.crafting.CraftingManager spill568_921;

    net.minecraft.item.ItemStack spill568_922;

    java.lang.Object[] spill568_923;

    java.lang.Object[] spill568_924;

    java.lang.Object[] spill568_925;

    net.minecraft.item.crafting.CraftingManager spill568_926;

    net.minecraft.item.ItemStack spill568_927;

    java.lang.Object[] spill568_928;

    java.lang.Object[] spill568_929;

    java.lang.Object[] spill568_930;

    net.minecraft.item.crafting.CraftingManager spill568_931;

    net.minecraft.item.ItemStack spill568_932;

    java.lang.Object[] spill568_933;

    java.lang.Object[] spill568_934;

    java.lang.Object[] spill568_935;

    java.lang.Object[] spill568_936;

    java.lang.Object[] spill568_937;

    java.lang.Object[] spill568_938;

    java.lang.Object[] spill568_939;

    java.lang.Object[] spill568_940;

    java.lang.Object[] spill568_941;

    net.minecraft.item.crafting.CraftingManager spill568_942;

    net.minecraft.item.ItemStack spill568_943;

    java.lang.Object[] spill568_944;

    java.lang.Object[] spill568_945;

    java.lang.Object[] spill568_946;

    java.lang.Object[] spill568_947;

    java.lang.Object[] spill568_948;

    java.lang.Object[] spill568_949;

    java.lang.Object[] spill568_950;

    net.minecraft.item.crafting.CraftingManager spill568_951;

    net.minecraft.item.ItemStack spill568_952;

    java.lang.Object[] spill568_953;

    java.lang.Object[] spill568_954;

    java.lang.Object[] spill568_955;

    java.lang.Object[] spill568_956;

    java.lang.Object[] spill568_957;

    java.lang.Object[] spill568_958;

    java.lang.Object[] spill568_959;

    long life1_3;

    life1_3 = (net.minecraft.item.crafting.CraftingManager.c ^ 6513942177195L);

    net.minecraft.item.crafting.CraftingManager.__sourceConstructorInit_0042ef34bdac4ed4_0(((net.minecraft.item.crafting.CraftingManager)(receiver)));

    ((net.minecraft.item.crafting.CraftingManager)(receiver)).b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.yc)(new moom.yc())).a(((net.minecraft.item.crafting.CraftingManager)(receiver)));

    ((moom.yd)(new moom.yd())).a(((net.minecraft.item.crafting.CraftingManager)(receiver)));

    ((moom.ya)(new moom.ya())).a(((net.minecraft.item.crafting.CraftingManager)(receiver)));

    ((moom.x_)(new moom.x_())).a(((net.minecraft.item.crafting.CraftingManager)(receiver)));

    ((moom.x8)(new moom.x8())).a(((net.minecraft.item.crafting.CraftingManager)(receiver)));

    ((moom.x3)(new moom.x3())).a(((net.minecraft.item.crafting.CraftingManager)(receiver)));

    ((moom.x9)(new moom.x9())).a(((net.minecraft.item.crafting.CraftingManager)(receiver)));

    ((java.util.List)(((net.minecraft.item.crafting.CraftingManager)(receiver)).b)).add(((java.lang.Object)(new moom.x4())));

    ((java.util.List)(((net.minecraft.item.crafting.CraftingManager)(receiver)).b)).add(((java.lang.Object)(new moom.x0())));

    ((java.util.List)(((net.minecraft.item.crafting.CraftingManager)(receiver)).b)).add(((java.lang.Object)(new moom.yb())));

    ((java.util.List)(((net.minecraft.item.crafting.CraftingManager)(receiver)).b)).add(((java.lang.Object)(new moom.yf())));

    ((java.util.List)(((net.minecraft.item.crafting.CraftingManager)(receiver)).b)).add(((java.lang.Object)(new moom.x1())));

    ((java.util.List)(((net.minecraft.item.crafting.CraftingManager)(receiver)).b)).add(((java.lang.Object)(new moom.x2())));

    ((moom.x5)(new moom.x5())).a(((net.minecraft.item.crafting.CraftingManager)(receiver)));

    spill568_0 = receiver;

    spill568_1 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aK, 3);

    java.lang.Object[] __stackOp568_25_0 = new java.lang.Object[3];

    spill568_2 = __stackOp568_25_0;

    (__stackOp568_25_0)[0] = "###";

    java.lang.Object[] __stackOp568_26_0 = spill568_2;

    spill568_3 = __stackOp568_26_0;

    (__stackOp568_26_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_27(31628, (2427966605294066408L ^ life1_3)))));

    java.lang.Object[] __stackOp568_29_0 = spill568_3;

    spill568_4 = __stackOp568_29_0;

    (__stackOp568_29_0)[2] = net.minecraft.init.Items.aJ;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_0)).a(((net.minecraft.item.ItemStack)(spill568_1)), ((java.lang.Object[])(spill568_4)));

    spill568_5 = receiver;

    spill568_6 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aL, 1);

    java.lang.Object[] __stackOp568_33_0 = new java.lang.Object[4];

    spill568_7 = __stackOp568_33_0;

    (__stackOp568_33_0)[0] = net.minecraft.init.Items.aK;

    java.lang.Object[] __stackOp568_35_0 = spill568_7;

    spill568_8 = __stackOp568_35_0;

    (__stackOp568_35_0)[1] = net.minecraft.init.Items.aK;

    java.lang.Object[] __stackOp568_37_0 = spill568_8;

    spill568_9 = __stackOp568_37_0;

    (__stackOp568_37_0)[2] = net.minecraft.init.Items.aK;

    java.lang.Object[] __stackOp568_39_0 = spill568_9;

    spill568_10 = __stackOp568_39_0;

    (__stackOp568_39_0)[3] = net.minecraft.init.Items.aF;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_5)).a__Void(((net.minecraft.item.ItemStack)(spill568_6)), ((java.lang.Object[])(spill568_10)));

    spill568_11 = receiver;

    spill568_12 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bB, 1);

    java.lang.Object[] __stackOp568_43_0 = new java.lang.Object[3];

    spill568_13 = __stackOp568_43_0;

    (__stackOp568_43_0)[0] = net.minecraft.init.Items.aL;

    java.lang.Object[] __stackOp568_45_0 = spill568_13;

    spill568_14 = __stackOp568_45_0;

    (__stackOp568_45_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).b());

    java.lang.Object[] __stackOp568_49_0 = spill568_14;

    spill568_15 = __stackOp568_49_0;

    (__stackOp568_49_0)[2] = net.minecraft.init.Items.G;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_11)).a__Void(((net.minecraft.item.ItemStack)(spill568_12)), ((java.lang.Object[])(spill568_15)));

    spill568_16 = receiver;

    spill568_17 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aO, 3);

    java.lang.Object[] __stackOp568_54_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_53(29499, (1969542352943305289L ^ life1_3))];

    spill568_18 = __stackOp568_54_0;

    (__stackOp568_54_0)[0] = "W#W";

    java.lang.Object[] __stackOp568_55_0 = spill568_18;

    spill568_19 = __stackOp568_55_0;

    (__stackOp568_55_0)[1] = "W#W";

    java.lang.Object[] __stackOp568_56_0 = spill568_19;

    spill568_20 = __stackOp568_56_0;

    (__stackOp568_56_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_57(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_59_0 = spill568_20;

    spill568_21 = __stackOp568_59_0;

    (__stackOp568_59_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_61_0 = spill568_21;

    spill568_22 = __stackOp568_61_0;

    (__stackOp568_61_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_62(22616, (404217891143612673L ^ life1_3)))));

    java.lang.Object[] __stackOp568_64_0 = spill568_22;

    spill568_23 = __stackOp568_64_0;

    (__stackOp568_64_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_16)).a(((net.minecraft.item.ItemStack)(spill568_17)), ((java.lang.Object[])(spill568_23)));

    spill568_24 = receiver;

    spill568_25 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aQ, 3);

    java.lang.Object[] __stackOp568_71_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_70(10364, (4263641638854854914L ^ life1_3))];

    spill568_26 = __stackOp568_71_0;

    (__stackOp568_71_0)[0] = "W#W";

    java.lang.Object[] __stackOp568_72_0 = spill568_26;

    spill568_27 = __stackOp568_72_0;

    (__stackOp568_72_0)[1] = "W#W";

    java.lang.Object[] __stackOp568_73_0 = spill568_27;

    spill568_28 = __stackOp568_73_0;

    (__stackOp568_73_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_74(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_76_0 = spill568_28;

    spill568_29 = __stackOp568_76_0;

    (__stackOp568_76_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_78_0 = spill568_29;

    spill568_30 = __stackOp568_78_0;

    (__stackOp568_78_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_79(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_81_0 = spill568_30;

    spill568_31 = __stackOp568_81_0;

    (__stackOp568_81_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_24)).a(((net.minecraft.item.ItemStack)(spill568_25)), ((java.lang.Object[])(spill568_31)));

    spill568_32 = receiver;

    spill568_33 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aP, 3);

    java.lang.Object[] __stackOp568_88_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_87(10364, (4263641638854854914L ^ life1_3))];

    spill568_34 = __stackOp568_88_0;

    (__stackOp568_88_0)[0] = "W#W";

    java.lang.Object[] __stackOp568_89_0 = spill568_34;

    spill568_35 = __stackOp568_89_0;

    (__stackOp568_89_0)[1] = "W#W";

    java.lang.Object[] __stackOp568_90_0 = spill568_35;

    spill568_36 = __stackOp568_90_0;

    (__stackOp568_90_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_91(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_93_0 = spill568_36;

    spill568_37 = __stackOp568_93_0;

    (__stackOp568_93_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_95_0 = spill568_37;

    spill568_38 = __stackOp568_95_0;

    (__stackOp568_95_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_96(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_98_0 = spill568_38;

    spill568_39 = __stackOp568_98_0;

    (__stackOp568_98_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_32)).a(((net.minecraft.item.ItemStack)(spill568_33)), ((java.lang.Object[])(spill568_39)));

    spill568_40 = receiver;

    spill568_41 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aR, 3);

    java.lang.Object[] __stackOp568_105_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_104(10364, (4263641638854854914L ^ life1_3))];

    spill568_42 = __stackOp568_105_0;

    (__stackOp568_105_0)[0] = "W#W";

    java.lang.Object[] __stackOp568_106_0 = spill568_42;

    spill568_43 = __stackOp568_106_0;

    (__stackOp568_106_0)[1] = "W#W";

    java.lang.Object[] __stackOp568_107_0 = spill568_43;

    spill568_44 = __stackOp568_107_0;

    (__stackOp568_107_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_108(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_110_0 = spill568_44;

    spill568_45 = __stackOp568_110_0;

    (__stackOp568_110_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_112_0 = spill568_45;

    spill568_46 = __stackOp568_112_0;

    (__stackOp568_112_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_113(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_115_0 = spill568_46;

    spill568_47 = __stackOp568_115_0;

    (__stackOp568_115_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_40)).a(((net.minecraft.item.ItemStack)(spill568_41)), ((java.lang.Object[])(spill568_47)));

    spill568_48 = receiver;

    spill568_49 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aT, 3);

    java.lang.Object[] __stackOp568_122_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_121(10364, (4263641638854854914L ^ life1_3))];

    spill568_50 = __stackOp568_122_0;

    (__stackOp568_122_0)[0] = "W#W";

    java.lang.Object[] __stackOp568_123_0 = spill568_50;

    spill568_51 = __stackOp568_123_0;

    (__stackOp568_123_0)[1] = "W#W";

    java.lang.Object[] __stackOp568_124_0 = spill568_51;

    spill568_52 = __stackOp568_124_0;

    (__stackOp568_124_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_125(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_127_0 = spill568_52;

    spill568_53 = __stackOp568_127_0;

    (__stackOp568_127_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_129_0 = spill568_53;

    spill568_54 = __stackOp568_129_0;

    (__stackOp568_129_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_130(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_132_0 = spill568_54;

    spill568_55 = __stackOp568_132_0;

    (__stackOp568_132_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a()) - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_48)).a(((net.minecraft.item.ItemStack)(spill568_49)), ((java.lang.Object[])(spill568_55)));

    spill568_56 = receiver;

    spill568_57 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aS, 3);

    java.lang.Object[] __stackOp568_139_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_138(10364, (4263641638854854914L ^ life1_3))];

    spill568_58 = __stackOp568_139_0;

    (__stackOp568_139_0)[0] = "W#W";

    java.lang.Object[] __stackOp568_140_0 = spill568_58;

    spill568_59 = __stackOp568_140_0;

    (__stackOp568_140_0)[1] = "W#W";

    java.lang.Object[] __stackOp568_141_0 = spill568_59;

    spill568_60 = __stackOp568_141_0;

    (__stackOp568_141_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_142(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_144_0 = spill568_60;

    spill568_61 = __stackOp568_144_0;

    (__stackOp568_144_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_146_0 = spill568_61;

    spill568_62 = __stackOp568_146_0;

    (__stackOp568_146_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_147(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_149_0 = spill568_62;

    spill568_63 = __stackOp568_149_0;

    (__stackOp568_149_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a()) - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_56)).a(((net.minecraft.item.ItemStack)(spill568_57)), ((java.lang.Object[])(spill568_63)));

    spill568_64 = receiver;

    spill568_65 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bO, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_155(10364, (4263641638854854914L ^ life1_3)), ((moom.at)(moom.at.NORMAL)).a());

    java.lang.Object[] __stackOp568_158_0 = new java.lang.Object[4];

    spill568_66 = __stackOp568_158_0;

    (__stackOp568_158_0)[0] = "###";

    java.lang.Object[] __stackOp568_159_0 = spill568_66;

    spill568_67 = __stackOp568_159_0;

    (__stackOp568_159_0)[1] = "###";

    java.lang.Object[] __stackOp568_160_0 = spill568_67;

    spill568_68 = __stackOp568_160_0;

    (__stackOp568_160_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_161(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_163_0 = spill568_68;

    spill568_69 = __stackOp568_163_0;

    (__stackOp568_163_0)[3] = net.minecraft.init.Blocks.e;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_64)).a(((net.minecraft.item.ItemStack)(spill568_65)), ((java.lang.Object[])(spill568_69)));

    spill568_70 = receiver;

    spill568_71 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bO, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_167(10364, (4263641638854854914L ^ life1_3)), ((moom.at)(moom.at.MOSSY)).a());

    java.lang.Object[] __stackOp568_170_0 = new java.lang.Object[4];

    spill568_72 = __stackOp568_170_0;

    (__stackOp568_170_0)[0] = "###";

    java.lang.Object[] __stackOp568_171_0 = spill568_72;

    spill568_73 = __stackOp568_171_0;

    (__stackOp568_171_0)[1] = "###";

    java.lang.Object[] __stackOp568_172_0 = spill568_73;

    spill568_74 = __stackOp568_172_0;

    (__stackOp568_172_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_173(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_175_0 = spill568_74;

    spill568_75 = __stackOp568_175_0;

    (__stackOp568_175_0)[3] = net.minecraft.init.Blocks.Y;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_70)).a(((net.minecraft.item.ItemStack)(spill568_71)), ((java.lang.Object[])(spill568_75)));

    spill568_76 = receiver;

    spill568_77 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bo, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_179(10364, (4263641638854854914L ^ life1_3)));

    java.lang.Object[] __stackOp568_180_0 = new java.lang.Object[4];

    spill568_78 = __stackOp568_180_0;

    (__stackOp568_180_0)[0] = "###";

    java.lang.Object[] __stackOp568_181_0 = spill568_78;

    spill568_79 = __stackOp568_181_0;

    (__stackOp568_181_0)[1] = "###";

    java.lang.Object[] __stackOp568_182_0 = spill568_79;

    spill568_80 = __stackOp568_182_0;

    (__stackOp568_182_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_183(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_185_0 = spill568_80;

    spill568_81 = __stackOp568_185_0;

    (__stackOp568_185_0)[3] = net.minecraft.init.Blocks.bn;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_76)).a(((net.minecraft.item.ItemStack)(spill568_77)), ((java.lang.Object[])(spill568_81)));

    spill568_82 = receiver;

    spill568_83 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bd, 1);

    java.lang.Object[] __stackOp568_190_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_189(10364, (4263641638854854914L ^ life1_3))];

    spill568_84 = __stackOp568_190_0;

    (__stackOp568_190_0)[0] = "#W#";

    java.lang.Object[] __stackOp568_191_0 = spill568_84;

    spill568_85 = __stackOp568_191_0;

    (__stackOp568_191_0)[1] = "#W#";

    java.lang.Object[] __stackOp568_192_0 = spill568_85;

    spill568_86 = __stackOp568_192_0;

    (__stackOp568_192_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_193(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_195_0 = spill568_86;

    spill568_87 = __stackOp568_195_0;

    (__stackOp568_195_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_197_0 = spill568_87;

    spill568_88 = __stackOp568_197_0;

    (__stackOp568_197_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_198(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_200_0 = spill568_88;

    spill568_89 = __stackOp568_200_0;

    (__stackOp568_200_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_82)).a(((net.minecraft.item.ItemStack)(spill568_83)), ((java.lang.Object[])(spill568_89)));

    spill568_90 = receiver;

    spill568_91 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bf, 1);

    java.lang.Object[] __stackOp568_207_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_206(10364, (4263641638854854914L ^ life1_3))];

    spill568_92 = __stackOp568_207_0;

    (__stackOp568_207_0)[0] = "#W#";

    java.lang.Object[] __stackOp568_208_0 = spill568_92;

    spill568_93 = __stackOp568_208_0;

    (__stackOp568_208_0)[1] = "#W#";

    java.lang.Object[] __stackOp568_209_0 = spill568_93;

    spill568_94 = __stackOp568_209_0;

    (__stackOp568_209_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_210(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_212_0 = spill568_94;

    spill568_95 = __stackOp568_212_0;

    (__stackOp568_212_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_214_0 = spill568_95;

    spill568_96 = __stackOp568_214_0;

    (__stackOp568_214_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_215(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_217_0 = spill568_96;

    spill568_97 = __stackOp568_217_0;

    (__stackOp568_217_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_90)).a(((net.minecraft.item.ItemStack)(spill568_91)), ((java.lang.Object[])(spill568_97)));

    spill568_98 = receiver;

    spill568_99 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.be, 1);

    java.lang.Object[] __stackOp568_224_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_223(10364, (4263641638854854914L ^ life1_3))];

    spill568_100 = __stackOp568_224_0;

    (__stackOp568_224_0)[0] = "#W#";

    java.lang.Object[] __stackOp568_225_0 = spill568_100;

    spill568_101 = __stackOp568_225_0;

    (__stackOp568_225_0)[1] = "#W#";

    java.lang.Object[] __stackOp568_226_0 = spill568_101;

    spill568_102 = __stackOp568_226_0;

    (__stackOp568_226_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_227(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_229_0 = spill568_102;

    spill568_103 = __stackOp568_229_0;

    (__stackOp568_229_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_231_0 = spill568_103;

    spill568_104 = __stackOp568_231_0;

    (__stackOp568_231_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_232(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_234_0 = spill568_104;

    spill568_105 = __stackOp568_234_0;

    (__stackOp568_234_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_98)).a(((net.minecraft.item.ItemStack)(spill568_99)), ((java.lang.Object[])(spill568_105)));

    spill568_106 = receiver;

    spill568_107 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bg, 1);

    java.lang.Object[] __stackOp568_241_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_240(10364, (4263641638854854914L ^ life1_3))];

    spill568_108 = __stackOp568_241_0;

    (__stackOp568_241_0)[0] = "#W#";

    java.lang.Object[] __stackOp568_242_0 = spill568_108;

    spill568_109 = __stackOp568_242_0;

    (__stackOp568_242_0)[1] = "#W#";

    java.lang.Object[] __stackOp568_243_0 = spill568_109;

    spill568_110 = __stackOp568_243_0;

    (__stackOp568_243_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_244(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_246_0 = spill568_110;

    spill568_111 = __stackOp568_246_0;

    (__stackOp568_246_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_248_0 = spill568_111;

    spill568_112 = __stackOp568_248_0;

    (__stackOp568_248_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_249(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_251_0 = spill568_112;

    spill568_113 = __stackOp568_251_0;

    (__stackOp568_251_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_106)).a(((net.minecraft.item.ItemStack)(spill568_107)), ((java.lang.Object[])(spill568_113)));

    spill568_114 = receiver;

    spill568_115 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bi, 1);

    java.lang.Object[] __stackOp568_258_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_257(10364, (4263641638854854914L ^ life1_3))];

    spill568_116 = __stackOp568_258_0;

    (__stackOp568_258_0)[0] = "#W#";

    java.lang.Object[] __stackOp568_259_0 = spill568_116;

    spill568_117 = __stackOp568_259_0;

    (__stackOp568_259_0)[1] = "#W#";

    java.lang.Object[] __stackOp568_260_0 = spill568_117;

    spill568_118 = __stackOp568_260_0;

    (__stackOp568_260_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_261(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_263_0 = spill568_118;

    spill568_119 = __stackOp568_263_0;

    (__stackOp568_263_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_265_0 = spill568_119;

    spill568_120 = __stackOp568_265_0;

    (__stackOp568_265_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_266(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_268_0 = spill568_120;

    spill568_121 = __stackOp568_268_0;

    (__stackOp568_268_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a()) - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_114)).a(((net.minecraft.item.ItemStack)(spill568_115)), ((java.lang.Object[])(spill568_121)));

    spill568_122 = receiver;

    spill568_123 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bh, 1);

    java.lang.Object[] __stackOp568_275_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_274(10364, (4263641638854854914L ^ life1_3))];

    spill568_124 = __stackOp568_275_0;

    (__stackOp568_275_0)[0] = "#W#";

    java.lang.Object[] __stackOp568_276_0 = spill568_124;

    spill568_125 = __stackOp568_276_0;

    (__stackOp568_276_0)[1] = "#W#";

    java.lang.Object[] __stackOp568_277_0 = spill568_125;

    spill568_126 = __stackOp568_277_0;

    (__stackOp568_277_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_278(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_280_0 = spill568_126;

    spill568_127 = __stackOp568_280_0;

    (__stackOp568_280_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_282_0 = spill568_127;

    spill568_128 = __stackOp568_282_0;

    (__stackOp568_282_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_283(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_285_0 = spill568_128;

    spill568_129 = __stackOp568_285_0;

    (__stackOp568_285_0)[5] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a()) - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_122)).a(((net.minecraft.item.ItemStack)(spill568_123)), ((java.lang.Object[])(spill568_129)));

    spill568_130 = receiver;

    spill568_131 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aN, 1);

    java.lang.Object[] __stackOp568_292_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_291(26282, (4648044235846993879L ^ life1_3))];

    spill568_132 = __stackOp568_292_0;

    (__stackOp568_292_0)[0] = "###";

    java.lang.Object[] __stackOp568_293_0 = spill568_132;

    spill568_133 = __stackOp568_293_0;

    (__stackOp568_293_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_294_0 = spill568_133;

    spill568_134 = __stackOp568_294_0;

    (__stackOp568_294_0)[2] = "###";

    java.lang.Object[] __stackOp568_295_0 = spill568_134;

    spill568_135 = __stackOp568_295_0;

    (__stackOp568_295_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_296(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_298_0 = spill568_135;

    spill568_136 = __stackOp568_298_0;

    (__stackOp568_298_0)[4] = net.minecraft.init.Blocks.f;

    java.lang.Object[] __stackOp568_300_0 = spill568_136;

    spill568_137 = __stackOp568_300_0;

    (__stackOp568_300_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_301(9472, (6758672880581543013L ^ life1_3)))));

    java.lang.Object[] __stackOp568_303_0 = spill568_137;

    spill568_138 = __stackOp568_303_0;

    (__stackOp568_303_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_304(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.i;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_130)).a(((net.minecraft.item.ItemStack)(spill568_131)), ((java.lang.Object[])(spill568_138)));

    spill568_139 = receiver;

    spill568_140 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.b2, 2);

    java.lang.Object[] __stackOp568_309_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_308(29300, (5045997084862698253L ^ life1_3))];

    spill568_141 = __stackOp568_309_0;

    (__stackOp568_309_0)[0] = "~~ ";

    java.lang.Object[] __stackOp568_310_0 = spill568_141;

    spill568_142 = __stackOp568_310_0;

    (__stackOp568_310_0)[1] = "~O ";

    java.lang.Object[] __stackOp568_311_0 = spill568_142;

    spill568_143 = __stackOp568_311_0;

    (__stackOp568_311_0)[2] = "  ~";

    java.lang.Object[] __stackOp568_312_0 = spill568_143;

    spill568_144 = __stackOp568_312_0;

    (__stackOp568_312_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_313(31989, (2117459401307282838L ^ life1_3)))));

    java.lang.Object[] __stackOp568_315_0 = spill568_144;

    spill568_145 = __stackOp568_315_0;

    (__stackOp568_315_0)[4] = net.minecraft.init.Items.F;

    java.lang.Object[] __stackOp568_317_0 = spill568_145;

    spill568_146 = __stackOp568_317_0;

    (__stackOp568_317_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_318(12353, (2673181204212257071L ^ life1_3)))));

    java.lang.Object[] __stackOp568_320_0 = spill568_146;

    spill568_147 = __stackOp568_320_0;

    (__stackOp568_320_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_321(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aM;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_139)).a(((net.minecraft.item.ItemStack)(spill568_140)), ((java.lang.Object[])(spill568_147)));

    spill568_148 = receiver;

    spill568_149 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.B, 1);

    java.lang.Object[] __stackOp568_326_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_325(29300, (5045997084862698253L ^ life1_3))];

    spill568_150 = __stackOp568_326_0;

    (__stackOp568_326_0)[0] = "###";

    java.lang.Object[] __stackOp568_327_0 = spill568_150;

    spill568_151 = __stackOp568_327_0;

    (__stackOp568_327_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_328_0 = spill568_151;

    spill568_152 = __stackOp568_328_0;

    (__stackOp568_328_0)[2] = "###";

    java.lang.Object[] __stackOp568_329_0 = spill568_152;

    spill568_153 = __stackOp568_329_0;

    (__stackOp568_329_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_330(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_332_0 = spill568_153;

    spill568_154 = __stackOp568_332_0;

    (__stackOp568_332_0)[4] = net.minecraft.init.Blocks.f;

    java.lang.Object[] __stackOp568_334_0 = spill568_154;

    spill568_155 = __stackOp568_334_0;

    (__stackOp568_334_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_335(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_337_0 = spill568_155;

    spill568_156 = __stackOp568_337_0;

    (__stackOp568_337_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_338(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aC;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_148)).a(((net.minecraft.item.ItemStack)(spill568_149)), ((java.lang.Object[])(spill568_156)));

    spill568_157 = receiver;

    spill568_158 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.X, 1);

    java.lang.Object[] __stackOp568_343_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_342(29300, (5045997084862698253L ^ life1_3))];

    spill568_159 = __stackOp568_343_0;

    (__stackOp568_343_0)[0] = "###";

    java.lang.Object[] __stackOp568_344_0 = spill568_159;

    spill568_160 = __stackOp568_344_0;

    (__stackOp568_344_0)[1] = "XXX";

    java.lang.Object[] __stackOp568_345_0 = spill568_160;

    spill568_161 = __stackOp568_345_0;

    (__stackOp568_345_0)[2] = "###";

    java.lang.Object[] __stackOp568_346_0 = spill568_161;

    spill568_162 = __stackOp568_346_0;

    (__stackOp568_346_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_347(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_349_0 = spill568_162;

    spill568_163 = __stackOp568_349_0;

    (__stackOp568_349_0)[4] = net.minecraft.init.Blocks.f;

    java.lang.Object[] __stackOp568_351_0 = spill568_163;

    spill568_164 = __stackOp568_351_0;

    (__stackOp568_351_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_352(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_354_0 = spill568_164;

    spill568_165 = __stackOp568_354_0;

    (__stackOp568_354_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_355(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aL;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_157)).a(((net.minecraft.item.ItemStack)(spill568_158)), ((java.lang.Object[])(spill568_165)));

    spill568_166 = receiver;

    spill568_167 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aJ, 1);

    java.lang.Object[] __stackOp568_359_0 = new java.lang.Object[4];

    spill568_168 = __stackOp568_359_0;

    (__stackOp568_359_0)[0] = "##";

    java.lang.Object[] __stackOp568_360_0 = spill568_168;

    spill568_169 = __stackOp568_360_0;

    (__stackOp568_360_0)[1] = "##";

    java.lang.Object[] __stackOp568_361_0 = spill568_169;

    spill568_170 = __stackOp568_361_0;

    (__stackOp568_361_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_362(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_364_0 = spill568_170;

    spill568_171 = __stackOp568_364_0;

    (__stackOp568_364_0)[3] = net.minecraft.init.Items.aD;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_166)).a(((net.minecraft.item.ItemStack)(spill568_167)), ((java.lang.Object[])(spill568_171)));

    spill568_172 = receiver;

    spill568_173 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aH, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_368(10364, (4263641638854854914L ^ life1_3)));

    java.lang.Object[] __stackOp568_369_0 = new java.lang.Object[3];

    spill568_174 = __stackOp568_369_0;

    (__stackOp568_369_0)[0] = "###";

    java.lang.Object[] __stackOp568_370_0 = spill568_174;

    spill568_175 = __stackOp568_370_0;

    (__stackOp568_370_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_371(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_373_0 = spill568_175;

    spill568_176 = __stackOp568_373_0;

    (__stackOp568_373_0)[2] = net.minecraft.init.Blocks.aJ;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_172)).a(((net.minecraft.item.ItemStack)(spill568_173)), ((java.lang.Object[])(spill568_176)));

    spill568_177 = receiver;

    spill568_178 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aL, 1);

    java.lang.Object[] __stackOp568_377_0 = new java.lang.Object[4];

    spill568_179 = __stackOp568_377_0;

    (__stackOp568_377_0)[0] = "##";

    java.lang.Object[] __stackOp568_378_0 = spill568_179;

    spill568_180 = __stackOp568_378_0;

    (__stackOp568_378_0)[1] = "##";

    java.lang.Object[] __stackOp568_379_0 = spill568_180;

    spill568_181 = __stackOp568_379_0;

    (__stackOp568_379_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_380(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_382_0 = spill568_181;

    spill568_182 = __stackOp568_382_0;

    (__stackOp568_382_0)[3] = net.minecraft.init.Items.aI;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_177)).a(((net.minecraft.item.ItemStack)(spill568_178)), ((java.lang.Object[])(spill568_182)));

    spill568_183 = receiver;

    spill568_184 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.V, 1);

    java.lang.Object[] __stackOp568_386_0 = new java.lang.Object[4];

    spill568_185 = __stackOp568_386_0;

    (__stackOp568_386_0)[0] = "##";

    java.lang.Object[] __stackOp568_387_0 = spill568_185;

    spill568_186 = __stackOp568_387_0;

    (__stackOp568_387_0)[1] = "##";

    java.lang.Object[] __stackOp568_388_0 = spill568_186;

    spill568_187 = __stackOp568_388_0;

    (__stackOp568_388_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_389(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_391_0 = spill568_187;

    spill568_188 = __stackOp568_391_0;

    (__stackOp568_391_0)[3] = net.minecraft.init.Items.aH;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_183)).a(((net.minecraft.item.ItemStack)(spill568_184)), ((java.lang.Object[])(spill568_188)));

    spill568_189 = receiver;

    spill568_190 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aX, 1);

    java.lang.Object[] __stackOp568_395_0 = new java.lang.Object[4];

    spill568_191 = __stackOp568_395_0;

    (__stackOp568_395_0)[0] = "##";

    java.lang.Object[] __stackOp568_396_0 = spill568_191;

    spill568_192 = __stackOp568_396_0;

    (__stackOp568_396_0)[1] = "##";

    java.lang.Object[] __stackOp568_397_0 = spill568_192;

    spill568_193 = __stackOp568_397_0;

    (__stackOp568_397_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_398(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_400_0 = spill568_193;

    spill568_194 = __stackOp568_400_0;

    (__stackOp568_400_0)[3] = net.minecraft.init.Items.aT;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_189)).a(((net.minecraft.item.ItemStack)(spill568_190)), ((java.lang.Object[])(spill568_194)));

    spill568_195 = receiver;

    spill568_196 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b5, 1);

    java.lang.Object[] __stackOp568_404_0 = new java.lang.Object[4];

    spill568_197 = __stackOp568_404_0;

    (__stackOp568_404_0)[0] = "##";

    java.lang.Object[] __stackOp568_405_0 = spill568_197;

    spill568_198 = __stackOp568_405_0;

    (__stackOp568_405_0)[1] = "##";

    java.lang.Object[] __stackOp568_406_0 = spill568_198;

    spill568_199 = __stackOp568_406_0;

    (__stackOp568_406_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_407(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_409_0 = spill568_199;

    spill568_200 = __stackOp568_409_0;

    (__stackOp568_409_0)[3] = net.minecraft.init.Items.bV;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_195)).a(((net.minecraft.item.ItemStack)(spill568_196)), ((java.lang.Object[])(spill568_200)));

    spill568_201 = receiver;

    spill568_202 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.L, 1);

    java.lang.Object[] __stackOp568_413_0 = new java.lang.Object[4];

    spill568_203 = __stackOp568_413_0;

    (__stackOp568_413_0)[0] = "##";

    java.lang.Object[] __stackOp568_414_0 = spill568_203;

    spill568_204 = __stackOp568_414_0;

    (__stackOp568_414_0)[1] = "##";

    java.lang.Object[] __stackOp568_415_0 = spill568_204;

    spill568_205 = __stackOp568_415_0;

    (__stackOp568_415_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_416(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_418_0 = spill568_205;

    spill568_206 = __stackOp568_418_0;

    (__stackOp568_418_0)[3] = net.minecraft.init.Items.F;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_201)).a(((net.minecraft.item.ItemStack)(spill568_202)), ((java.lang.Object[])(spill568_206)));

    spill568_207 = receiver;

    spill568_208 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.W, 1);

    java.lang.Object[] __stackOp568_423_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_422(29300, (5045997084862698253L ^ life1_3))];

    spill568_209 = __stackOp568_423_0;

    (__stackOp568_423_0)[0] = "X#X";

    java.lang.Object[] __stackOp568_424_0 = spill568_209;

    spill568_210 = __stackOp568_424_0;

    (__stackOp568_424_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_425_0 = spill568_210;

    spill568_211 = __stackOp568_425_0;

    (__stackOp568_425_0)[2] = "X#X";

    java.lang.Object[] __stackOp568_426_0 = spill568_211;

    spill568_212 = __stackOp568_426_0;

    (__stackOp568_426_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_427(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_429_0 = spill568_212;

    spill568_213 = __stackOp568_429_0;

    (__stackOp568_429_0)[4] = net.minecraft.init.Items.H;

    java.lang.Object[] __stackOp568_431_0 = spill568_213;

    spill568_214 = __stackOp568_431_0;

    (__stackOp568_431_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_432(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_434_0 = spill568_214;

    spill568_215 = __stackOp568_434_0;

    (__stackOp568_434_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_435(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Blocks.m;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_207)).a(((net.minecraft.item.ItemStack)(spill568_208)), ((java.lang.Object[])(spill568_215)));

    spill568_216 = receiver;

    spill568_217 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_439(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.COBBLESTONE)).a());

    java.lang.Object[] __stackOp568_442_0 = new java.lang.Object[3];

    spill568_218 = __stackOp568_442_0;

    (__stackOp568_442_0)[0] = "###";

    java.lang.Object[] __stackOp568_443_0 = spill568_218;

    spill568_219 = __stackOp568_443_0;

    (__stackOp568_443_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_444(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_446_0 = spill568_219;

    spill568_220 = __stackOp568_446_0;

    (__stackOp568_446_0)[2] = net.minecraft.init.Blocks.e;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_216)).a(((net.minecraft.item.ItemStack)(spill568_217)), ((java.lang.Object[])(spill568_220)));

    spill568_221 = receiver;

    spill568_222 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_450(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.STONE)).a());

    java.lang.Object[] __stackOp568_453_0 = new java.lang.Object[3];

    spill568_223 = __stackOp568_453_0;

    (__stackOp568_453_0)[0] = "###";

    java.lang.Object[] __stackOp568_454_0 = spill568_223;

    spill568_224 = __stackOp568_454_0;

    (__stackOp568_454_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_455(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_457_0 = spill568_224;

    spill568_225 = __stackOp568_457_0;

    (__stackOp568_457_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.STONE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_221)).a(((net.minecraft.item.ItemStack)(spill568_222)), ((java.lang.Object[])(spill568_225)));

    spill568_226 = receiver;

    spill568_227 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_463(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SAND)).a());

    java.lang.Object[] __stackOp568_466_0 = new java.lang.Object[3];

    spill568_228 = __stackOp568_466_0;

    (__stackOp568_466_0)[0] = "###";

    java.lang.Object[] __stackOp568_467_0 = spill568_228;

    spill568_229 = __stackOp568_467_0;

    (__stackOp568_467_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_468(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_470_0 = spill568_229;

    spill568_230 = __stackOp568_470_0;

    (__stackOp568_470_0)[2] = net.minecraft.init.Blocks.A;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_226)).a(((net.minecraft.item.ItemStack)(spill568_227)), ((java.lang.Object[])(spill568_230)));

    spill568_231 = receiver;

    spill568_232 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_474(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.BRICK)).a());

    java.lang.Object[] __stackOp568_477_0 = new java.lang.Object[3];

    spill568_233 = __stackOp568_477_0;

    (__stackOp568_477_0)[0] = "###";

    java.lang.Object[] __stackOp568_478_0 = spill568_233;

    spill568_234 = __stackOp568_478_0;

    (__stackOp568_478_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_479(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_481_0 = spill568_234;

    spill568_235 = __stackOp568_481_0;

    (__stackOp568_481_0)[2] = net.minecraft.init.Blocks.V;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_231)).a(((net.minecraft.item.ItemStack)(spill568_232)), ((java.lang.Object[])(spill568_235)));

    spill568_236 = receiver;

    spill568_237 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_485(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SMOOTHBRICK)).a());

    java.lang.Object[] __stackOp568_488_0 = new java.lang.Object[3];

    spill568_238 = __stackOp568_488_0;

    (__stackOp568_488_0)[0] = "###";

    java.lang.Object[] __stackOp568_489_0 = spill568_238;

    spill568_239 = __stackOp568_489_0;

    (__stackOp568_489_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_490(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_492_0 = spill568_239;

    spill568_240 = __stackOp568_492_0;

    (__stackOp568_492_0)[2] = net.minecraft.init.Blocks.a5;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_236)).a(((net.minecraft.item.ItemStack)(spill568_237)), ((java.lang.Object[])(spill568_240)));

    spill568_241 = receiver;

    spill568_242 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_496(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.NETHERBRICK)).a());

    java.lang.Object[] __stackOp568_499_0 = new java.lang.Object[3];

    spill568_243 = __stackOp568_499_0;

    (__stackOp568_499_0)[0] = "###";

    java.lang.Object[] __stackOp568_500_0 = spill568_243;

    spill568_244 = __stackOp568_500_0;

    (__stackOp568_500_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_501(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_503_0 = spill568_244;

    spill568_245 = __stackOp568_503_0;

    (__stackOp568_503_0)[2] = net.minecraft.init.Blocks.bn;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_241)).a(((net.minecraft.item.ItemStack)(spill568_242)), ((java.lang.Object[])(spill568_245)));

    spill568_246 = receiver;

    spill568_247 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_507(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.QUARTZ)).a());

    java.lang.Object[] __stackOp568_510_0 = new java.lang.Object[3];

    spill568_248 = __stackOp568_510_0;

    (__stackOp568_510_0)[0] = "###";

    java.lang.Object[] __stackOp568_511_0 = spill568_248;

    spill568_249 = __stackOp568_511_0;

    (__stackOp568_511_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_512(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_514_0 = spill568_249;

    spill568_250 = __stackOp568_514_0;

    (__stackOp568_514_0)[2] = net.minecraft.init.Blocks.b5;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_246)).a(((net.minecraft.item.ItemStack)(spill568_247)), ((java.lang.Object[])(spill568_250)));

    spill568_251 = receiver;

    spill568_252 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ct, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_518(10364, (4263641638854854914L ^ life1_3)), ((moom.aq)(moom.aq.RED_SANDSTONE)).a());

    java.lang.Object[] __stackOp568_521_0 = new java.lang.Object[3];

    spill568_253 = __stackOp568_521_0;

    (__stackOp568_521_0)[0] = "###";

    java.lang.Object[] __stackOp568_522_0 = spill568_253;

    spill568_254 = __stackOp568_522_0;

    (__stackOp568_522_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_523(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_525_0 = spill568_254;

    spill568_255 = __stackOp568_525_0;

    (__stackOp568_525_0)[2] = net.minecraft.init.Blocks.cq;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_251)).a(((net.minecraft.item.ItemStack)(spill568_252)), ((java.lang.Object[])(spill568_255)));

    spill568_256 = receiver;

    spill568_257 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bB, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_529(10364, (4263641638854854914L ^ life1_3)), 0);

    java.lang.Object[] __stackOp568_530_0 = new java.lang.Object[3];

    spill568_258 = __stackOp568_530_0;

    (__stackOp568_530_0)[0] = "###";

    java.lang.Object[] __stackOp568_531_0 = spill568_258;

    spill568_259 = __stackOp568_531_0;

    (__stackOp568_531_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_532(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_534_0 = spill568_259;

    spill568_260 = __stackOp568_534_0;

    (__stackOp568_534_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_256)).a(((net.minecraft.item.ItemStack)(spill568_257)), ((java.lang.Object[])(spill568_260)));

    spill568_261 = receiver;

    spill568_262 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bB, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_540(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a());

    java.lang.Object[] __stackOp568_543_0 = new java.lang.Object[3];

    spill568_263 = __stackOp568_543_0;

    (__stackOp568_543_0)[0] = "###";

    java.lang.Object[] __stackOp568_544_0 = spill568_263;

    spill568_264 = __stackOp568_544_0;

    (__stackOp568_544_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_545(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_547_0 = spill568_264;

    spill568_265 = __stackOp568_547_0;

    (__stackOp568_547_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_261)).a(((net.minecraft.item.ItemStack)(spill568_262)), ((java.lang.Object[])(spill568_265)));

    spill568_266 = receiver;

    spill568_267 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bB, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_553(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a());

    java.lang.Object[] __stackOp568_556_0 = new java.lang.Object[3];

    spill568_268 = __stackOp568_556_0;

    (__stackOp568_556_0)[0] = "###";

    java.lang.Object[] __stackOp568_557_0 = spill568_268;

    spill568_269 = __stackOp568_557_0;

    (__stackOp568_557_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_558(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_560_0 = spill568_269;

    spill568_270 = __stackOp568_560_0;

    (__stackOp568_560_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_266)).a(((net.minecraft.item.ItemStack)(spill568_267)), ((java.lang.Object[])(spill568_270)));

    spill568_271 = receiver;

    spill568_272 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bB, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_566(10364, (4263641638854854914L ^ life1_3)), ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a());

    java.lang.Object[] __stackOp568_569_0 = new java.lang.Object[3];

    spill568_273 = __stackOp568_569_0;

    (__stackOp568_569_0)[0] = "###";

    java.lang.Object[] __stackOp568_570_0 = spill568_273;

    spill568_274 = __stackOp568_570_0;

    (__stackOp568_570_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_571(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_573_0 = spill568_274;

    spill568_275 = __stackOp568_573_0;

    (__stackOp568_573_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_271)).a(((net.minecraft.item.ItemStack)(spill568_272)), ((java.lang.Object[])(spill568_275)));

    spill568_276 = receiver;

    spill568_277 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bB, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_579(10364, (4263641638854854914L ^ life1_3)), ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a()) - 4));

    java.lang.Object[] __stackOp568_582_0 = new java.lang.Object[3];

    spill568_278 = __stackOp568_582_0;

    (__stackOp568_582_0)[0] = "###";

    java.lang.Object[] __stackOp568_583_0 = spill568_278;

    spill568_279 = __stackOp568_583_0;

    (__stackOp568_583_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_584(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_586_0 = spill568_279;

    spill568_280 = __stackOp568_586_0;

    (__stackOp568_586_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a()) - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_276)).a(((net.minecraft.item.ItemStack)(spill568_277)), ((java.lang.Object[])(spill568_280)));

    spill568_281 = receiver;

    spill568_282 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bB, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_592(10364, (4263641638854854914L ^ life1_3)), ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a()) - 4));

    java.lang.Object[] __stackOp568_595_0 = new java.lang.Object[3];

    spill568_283 = __stackOp568_595_0;

    (__stackOp568_595_0)[0] = "###";

    java.lang.Object[] __stackOp568_596_0 = spill568_283;

    spill568_284 = __stackOp568_596_0;

    (__stackOp568_596_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_597(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_599_0 = spill568_284;

    spill568_285 = __stackOp568_599_0;

    (__stackOp568_599_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a()) - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_281)).a(((net.minecraft.item.ItemStack)(spill568_282)), ((java.lang.Object[])(spill568_285)));

    spill568_286 = receiver;

    spill568_287 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.au, 3);

    java.lang.Object[] __stackOp568_605_0 = new java.lang.Object[5];

    spill568_288 = __stackOp568_605_0;

    (__stackOp568_605_0)[0] = "# #";

    java.lang.Object[] __stackOp568_606_0 = spill568_288;

    spill568_289 = __stackOp568_606_0;

    (__stackOp568_606_0)[1] = "###";

    java.lang.Object[] __stackOp568_607_0 = spill568_289;

    spill568_290 = __stackOp568_607_0;

    (__stackOp568_607_0)[2] = "# #";

    java.lang.Object[] __stackOp568_608_0 = spill568_290;

    spill568_291 = __stackOp568_608_0;

    (__stackOp568_608_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_609(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_611_0 = spill568_291;

    spill568_292 = __stackOp568_611_0;

    (__stackOp568_611_0)[4] = net.minecraft.init.Items.y;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_286)).a(((net.minecraft.item.ItemStack)(spill568_287)), ((java.lang.Object[])(spill568_292)));

    spill568_293 = receiver;

    spill568_294 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aq, 3);

    java.lang.Object[] __stackOp568_615_0 = new java.lang.Object[5];

    spill568_295 = __stackOp568_615_0;

    (__stackOp568_615_0)[0] = "##";

    java.lang.Object[] __stackOp568_616_0 = spill568_295;

    spill568_296 = __stackOp568_616_0;

    (__stackOp568_616_0)[1] = "##";

    java.lang.Object[] __stackOp568_617_0 = spill568_296;

    spill568_297 = __stackOp568_617_0;

    (__stackOp568_617_0)[2] = "##";

    java.lang.Object[] __stackOp568_618_0 = spill568_297;

    spill568_298 = __stackOp568_618_0;

    (__stackOp568_618_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_619(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_621_0 = spill568_298;

    spill568_299 = __stackOp568_621_0;

    (__stackOp568_621_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_293)).a(((net.minecraft.item.ItemStack)(spill568_294)), ((java.lang.Object[])(spill568_299)));

    spill568_300 = receiver;

    spill568_301 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.ar, 3);

    java.lang.Object[] __stackOp568_627_0 = new java.lang.Object[5];

    spill568_302 = __stackOp568_627_0;

    (__stackOp568_627_0)[0] = "##";

    java.lang.Object[] __stackOp568_628_0 = spill568_302;

    spill568_303 = __stackOp568_628_0;

    (__stackOp568_628_0)[1] = "##";

    java.lang.Object[] __stackOp568_629_0 = spill568_303;

    spill568_304 = __stackOp568_629_0;

    (__stackOp568_629_0)[2] = "##";

    java.lang.Object[] __stackOp568_630_0 = spill568_304;

    spill568_305 = __stackOp568_630_0;

    (__stackOp568_630_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_631(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_633_0 = spill568_305;

    spill568_306 = __stackOp568_633_0;

    (__stackOp568_633_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_300)).a(((net.minecraft.item.ItemStack)(spill568_301)), ((java.lang.Object[])(spill568_306)));

    spill568_307 = receiver;

    spill568_308 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.as, 3);

    java.lang.Object[] __stackOp568_639_0 = new java.lang.Object[5];

    spill568_309 = __stackOp568_639_0;

    (__stackOp568_639_0)[0] = "##";

    java.lang.Object[] __stackOp568_640_0 = spill568_309;

    spill568_310 = __stackOp568_640_0;

    (__stackOp568_640_0)[1] = "##";

    java.lang.Object[] __stackOp568_641_0 = spill568_310;

    spill568_311 = __stackOp568_641_0;

    (__stackOp568_641_0)[2] = "##";

    java.lang.Object[] __stackOp568_642_0 = spill568_311;

    spill568_312 = __stackOp568_642_0;

    (__stackOp568_642_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_643(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_645_0 = spill568_312;

    spill568_313 = __stackOp568_645_0;

    (__stackOp568_645_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_307)).a(((net.minecraft.item.ItemStack)(spill568_308)), ((java.lang.Object[])(spill568_313)));

    spill568_314 = receiver;

    spill568_315 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.at, 3);

    java.lang.Object[] __stackOp568_651_0 = new java.lang.Object[5];

    spill568_316 = __stackOp568_651_0;

    (__stackOp568_651_0)[0] = "##";

    java.lang.Object[] __stackOp568_652_0 = spill568_316;

    spill568_317 = __stackOp568_652_0;

    (__stackOp568_652_0)[1] = "##";

    java.lang.Object[] __stackOp568_653_0 = spill568_317;

    spill568_318 = __stackOp568_653_0;

    (__stackOp568_653_0)[2] = "##";

    java.lang.Object[] __stackOp568_654_0 = spill568_318;

    spill568_319 = __stackOp568_654_0;

    (__stackOp568_654_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_655(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_657_0 = spill568_319;

    spill568_320 = __stackOp568_657_0;

    (__stackOp568_657_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_314)).a(((net.minecraft.item.ItemStack)(spill568_315)), ((java.lang.Object[])(spill568_320)));

    spill568_321 = receiver;

    spill568_322 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.au, 3);

    java.lang.Object[] __stackOp568_663_0 = new java.lang.Object[5];

    spill568_323 = __stackOp568_663_0;

    (__stackOp568_663_0)[0] = "##";

    java.lang.Object[] __stackOp568_664_0 = spill568_323;

    spill568_324 = __stackOp568_664_0;

    (__stackOp568_664_0)[1] = "##";

    java.lang.Object[] __stackOp568_665_0 = spill568_324;

    spill568_325 = __stackOp568_665_0;

    (__stackOp568_665_0)[2] = "##";

    java.lang.Object[] __stackOp568_666_0 = spill568_325;

    spill568_326 = __stackOp568_666_0;

    (__stackOp568_666_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_667(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_669_0 = spill568_326;

    spill568_327 = __stackOp568_669_0;

    (__stackOp568_669_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_321)).a(((net.minecraft.item.ItemStack)(spill568_322)), ((java.lang.Object[])(spill568_327)));

    spill568_328 = receiver;

    spill568_329 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.av, 3);

    java.lang.Object[] __stackOp568_675_0 = new java.lang.Object[5];

    spill568_330 = __stackOp568_675_0;

    (__stackOp568_675_0)[0] = "##";

    java.lang.Object[] __stackOp568_676_0 = spill568_330;

    spill568_331 = __stackOp568_676_0;

    (__stackOp568_676_0)[1] = "##";

    java.lang.Object[] __stackOp568_677_0 = spill568_331;

    spill568_332 = __stackOp568_677_0;

    (__stackOp568_677_0)[2] = "##";

    java.lang.Object[] __stackOp568_678_0 = spill568_332;

    spill568_333 = __stackOp568_678_0;

    (__stackOp568_678_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_679(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_681_0 = spill568_333;

    spill568_334 = __stackOp568_681_0;

    (__stackOp568_681_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_328)).a(((net.minecraft.item.ItemStack)(spill568_329)), ((java.lang.Object[])(spill568_334)));

    spill568_335 = receiver;

    spill568_336 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a3, 2);

    java.lang.Object[] __stackOp568_687_0 = new java.lang.Object[4];

    spill568_337 = __stackOp568_687_0;

    (__stackOp568_687_0)[0] = "###";

    java.lang.Object[] __stackOp568_688_0 = spill568_337;

    spill568_338 = __stackOp568_688_0;

    (__stackOp568_688_0)[1] = "###";

    java.lang.Object[] __stackOp568_689_0 = spill568_338;

    spill568_339 = __stackOp568_689_0;

    (__stackOp568_689_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_690(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_692_0 = spill568_339;

    spill568_340 = __stackOp568_692_0;

    (__stackOp568_692_0)[3] = net.minecraft.init.Blocks.f;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_335)).a(((net.minecraft.item.ItemStack)(spill568_336)), ((java.lang.Object[])(spill568_340)));

    spill568_341 = receiver;

    spill568_342 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aB, 3);

    java.lang.Object[] __stackOp568_696_0 = new java.lang.Object[5];

    spill568_343 = __stackOp568_696_0;

    (__stackOp568_696_0)[0] = "##";

    java.lang.Object[] __stackOp568_697_0 = spill568_343;

    spill568_344 = __stackOp568_697_0;

    (__stackOp568_697_0)[1] = "##";

    java.lang.Object[] __stackOp568_698_0 = spill568_344;

    spill568_345 = __stackOp568_698_0;

    (__stackOp568_698_0)[2] = "##";

    java.lang.Object[] __stackOp568_699_0 = spill568_345;

    spill568_346 = __stackOp568_699_0;

    (__stackOp568_699_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_700(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_702_0 = spill568_346;

    spill568_347 = __stackOp568_702_0;

    (__stackOp568_702_0)[4] = net.minecraft.init.Items.j;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_341)).a(((net.minecraft.item.ItemStack)(spill568_342)), ((java.lang.Object[])(spill568_347)));

    spill568_348 = receiver;

    spill568_349 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ca, 1);

    java.lang.Object[] __stackOp568_706_0 = new java.lang.Object[4];

    spill568_350 = __stackOp568_706_0;

    (__stackOp568_706_0)[0] = "##";

    java.lang.Object[] __stackOp568_707_0 = spill568_350;

    spill568_351 = __stackOp568_707_0;

    (__stackOp568_707_0)[1] = "##";

    java.lang.Object[] __stackOp568_708_0 = spill568_351;

    spill568_352 = __stackOp568_708_0;

    (__stackOp568_708_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_709(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_711_0 = spill568_352;

    spill568_353 = __stackOp568_711_0;

    (__stackOp568_711_0)[3] = net.minecraft.init.Items.j;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_348)).a(((net.minecraft.item.ItemStack)(spill568_349)), ((java.lang.Object[])(spill568_353)));

    spill568_354 = receiver;

    spill568_355 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.ap, 3);

    java.lang.Object[] __stackOp568_716_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_715(29300, (5045997084862698253L ^ life1_3))];

    spill568_356 = __stackOp568_716_0;

    (__stackOp568_716_0)[0] = "###";

    java.lang.Object[] __stackOp568_717_0 = spill568_356;

    spill568_357 = __stackOp568_717_0;

    (__stackOp568_717_0)[1] = "###";

    java.lang.Object[] __stackOp568_718_0 = spill568_357;

    spill568_358 = __stackOp568_718_0;

    (__stackOp568_718_0)[2] = " X ";

    java.lang.Object[] __stackOp568_719_0 = spill568_358;

    spill568_359 = __stackOp568_719_0;

    (__stackOp568_719_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_720(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_722_0 = spill568_359;

    spill568_360 = __stackOp568_722_0;

    (__stackOp568_722_0)[4] = net.minecraft.init.Blocks.f;

    java.lang.Object[] __stackOp568_724_0 = spill568_360;

    spill568_361 = __stackOp568_724_0;

    (__stackOp568_724_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_725(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_727_0 = spill568_361;

    spill568_362 = __stackOp568_727_0;

    (__stackOp568_727_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_728(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.y;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_354)).a(((net.minecraft.item.ItemStack)(spill568_355)), ((java.lang.Object[])(spill568_362)));

    spill568_363 = receiver;

    spill568_364 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aZ, 1);

    java.lang.Object[] __stackOp568_733_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_732(250, (833864079500255635L ^ life1_3))];

    spill568_365 = __stackOp568_733_0;

    (__stackOp568_733_0)[0] = "AAA";

    java.lang.Object[] __stackOp568_734_0 = spill568_365;

    spill568_366 = __stackOp568_734_0;

    (__stackOp568_734_0)[1] = "BEB";

    java.lang.Object[] __stackOp568_735_0 = spill568_366;

    spill568_367 = __stackOp568_735_0;

    (__stackOp568_735_0)[2] = "CCC";

    java.lang.Object[] __stackOp568_736_0 = spill568_367;

    spill568_368 = __stackOp568_736_0;

    (__stackOp568_736_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_737(19587, (4335943822839016921L ^ life1_3)))));

    java.lang.Object[] __stackOp568_739_0 = spill568_368;

    spill568_369 = __stackOp568_739_0;

    (__stackOp568_739_0)[4] = net.minecraft.init.Items.aG;

    java.lang.Object[] __stackOp568_741_0 = spill568_369;

    spill568_370 = __stackOp568_741_0;

    (__stackOp568_741_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_742(27448, (2174436629443496543L ^ life1_3)))));

    java.lang.Object[] __stackOp568_744_0 = spill568_370;

    spill568_371 = __stackOp568_744_0;

    (__stackOp568_744_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_745(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aY;

    java.lang.Object[] __stackOp568_747_0 = spill568_371;

    spill568_372 = __stackOp568_747_0;

    (__stackOp568_747_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_748(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_749(16165, (4032935220162108999L ^ life1_3)))));

    java.lang.Object[] __stackOp568_751_0 = spill568_372;

    spill568_373 = __stackOp568_751_0;

    (__stackOp568_751_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_752(1477, (3134081854248461463L ^ life1_3))] = net.minecraft.init.Items.O;

    java.lang.Object[] __stackOp568_754_0 = spill568_373;

    spill568_374 = __stackOp568_754_0;

    (__stackOp568_754_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_755(12739, (4964711919568261278L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_756(6604, (4536338850390128806L ^ life1_3)))));

    java.lang.Object[] __stackOp568_758_0 = spill568_374;

    spill568_375 = __stackOp568_758_0;

    (__stackOp568_758_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_759(6880, (3813767694242823103L ^ life1_3))] = net.minecraft.init.Items.aP;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_363)).a(((net.minecraft.item.ItemStack)(spill568_364)), ((java.lang.Object[])(spill568_375)));

    spill568_376 = receiver;

    spill568_377 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aY, 1);

    java.lang.Object[] __stackOp568_763_0 = new java.lang.Object[3];

    spill568_378 = __stackOp568_763_0;

    (__stackOp568_763_0)[0] = "#";

    java.lang.Object[] __stackOp568_764_0 = spill568_378;

    spill568_379 = __stackOp568_764_0;

    (__stackOp568_764_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_765(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_767_0 = spill568_379;

    spill568_380 = __stackOp568_767_0;

    (__stackOp568_767_0)[2] = net.minecraft.init.Items.aJ;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_376)).a(((net.minecraft.item.ItemStack)(spill568_377)), ((java.lang.Object[])(spill568_380)));

    spill568_381 = receiver;

    spill568_382 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 4, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a());

    java.lang.Object[] __stackOp568_773_0 = new java.lang.Object[3];

    spill568_383 = __stackOp568_773_0;

    (__stackOp568_773_0)[0] = "#";

    java.lang.Object[] __stackOp568_774_0 = spill568_383;

    spill568_384 = __stackOp568_774_0;

    (__stackOp568_774_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_775(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_777_0 = spill568_384;

    spill568_385 = __stackOp568_777_0;

    (__stackOp568_777_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.r, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_381)).a(((net.minecraft.item.ItemStack)(spill568_382)), ((java.lang.Object[])(spill568_385)));

    spill568_386 = receiver;

    spill568_387 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 4, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a());

    java.lang.Object[] __stackOp568_785_0 = new java.lang.Object[3];

    spill568_388 = __stackOp568_785_0;

    (__stackOp568_785_0)[0] = "#";

    java.lang.Object[] __stackOp568_786_0 = spill568_388;

    spill568_389 = __stackOp568_786_0;

    (__stackOp568_786_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_787(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_789_0 = spill568_389;

    spill568_390 = __stackOp568_789_0;

    (__stackOp568_789_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.r, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_386)).a(((net.minecraft.item.ItemStack)(spill568_387)), ((java.lang.Object[])(spill568_390)));

    spill568_391 = receiver;

    spill568_392 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 4, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a());

    java.lang.Object[] __stackOp568_797_0 = new java.lang.Object[3];

    spill568_393 = __stackOp568_797_0;

    (__stackOp568_797_0)[0] = "#";

    java.lang.Object[] __stackOp568_798_0 = spill568_393;

    spill568_394 = __stackOp568_798_0;

    (__stackOp568_798_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_799(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_801_0 = spill568_394;

    spill568_395 = __stackOp568_801_0;

    (__stackOp568_801_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.r, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_391)).a(((net.minecraft.item.ItemStack)(spill568_392)), ((java.lang.Object[])(spill568_395)));

    spill568_396 = receiver;

    spill568_397 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 4, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a());

    java.lang.Object[] __stackOp568_809_0 = new java.lang.Object[3];

    spill568_398 = __stackOp568_809_0;

    (__stackOp568_809_0)[0] = "#";

    java.lang.Object[] __stackOp568_810_0 = spill568_398;

    spill568_399 = __stackOp568_810_0;

    (__stackOp568_810_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_811(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_813_0 = spill568_399;

    spill568_400 = __stackOp568_813_0;

    (__stackOp568_813_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.r, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_396)).a(((net.minecraft.item.ItemStack)(spill568_397)), ((java.lang.Object[])(spill568_400)));

    spill568_401 = receiver;

    spill568_402 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 4, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a()) - 4));

    java.lang.Object[] __stackOp568_821_0 = new java.lang.Object[3];

    spill568_403 = __stackOp568_821_0;

    (__stackOp568_821_0)[0] = "#";

    java.lang.Object[] __stackOp568_822_0 = spill568_403;

    spill568_404 = __stackOp568_822_0;

    (__stackOp568_822_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_823(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_825_0 = spill568_404;

    spill568_405 = __stackOp568_825_0;

    (__stackOp568_825_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.s, 1, (((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a() - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_401)).a(((net.minecraft.item.ItemStack)(spill568_402)), ((java.lang.Object[])(spill568_405)));

    spill568_406 = receiver;

    spill568_407 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 4, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a()) - 4));

    java.lang.Object[] __stackOp568_833_0 = new java.lang.Object[3];

    spill568_408 = __stackOp568_833_0;

    (__stackOp568_833_0)[0] = "#";

    java.lang.Object[] __stackOp568_834_0 = spill568_408;

    spill568_409 = __stackOp568_834_0;

    (__stackOp568_834_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_835(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_837_0 = spill568_409;

    spill568_410 = __stackOp568_837_0;

    (__stackOp568_837_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.s, 1, (((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a() - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_406)).a(((net.minecraft.item.ItemStack)(spill568_407)), ((java.lang.Object[])(spill568_410)));

    spill568_411 = receiver;

    spill568_412 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.y, 4);

    java.lang.Object[] __stackOp568_843_0 = new java.lang.Object[4];

    spill568_413 = __stackOp568_843_0;

    (__stackOp568_843_0)[0] = "#";

    java.lang.Object[] __stackOp568_844_0 = spill568_413;

    spill568_414 = __stackOp568_844_0;

    (__stackOp568_844_0)[1] = "#";

    java.lang.Object[] __stackOp568_845_0 = spill568_414;

    spill568_415 = __stackOp568_845_0;

    (__stackOp568_845_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_846(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_848_0 = spill568_415;

    spill568_416 = __stackOp568_848_0;

    (__stackOp568_848_0)[3] = net.minecraft.init.Blocks.f;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_411)).a(((net.minecraft.item.ItemStack)(spill568_412)), ((java.lang.Object[])(spill568_416)));

    spill568_417 = receiver;

    spill568_418 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aa, 4);

    java.lang.Object[] __stackOp568_853_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_852(10364, (4263641638854854914L ^ life1_3))];

    spill568_419 = __stackOp568_853_0;

    (__stackOp568_853_0)[0] = "X";

    java.lang.Object[] __stackOp568_854_0 = spill568_419;

    spill568_420 = __stackOp568_854_0;

    (__stackOp568_854_0)[1] = "#";

    java.lang.Object[] __stackOp568_855_0 = spill568_420;

    spill568_421 = __stackOp568_855_0;

    (__stackOp568_855_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_856(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_858_0 = spill568_421;

    spill568_422 = __stackOp568_858_0;

    (__stackOp568_858_0)[3] = net.minecraft.init.Items.h;

    java.lang.Object[] __stackOp568_860_0 = spill568_422;

    spill568_423 = __stackOp568_860_0;

    (__stackOp568_860_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_861(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_863_0 = spill568_423;

    spill568_424 = __stackOp568_863_0;

    (__stackOp568_863_0)[5] = net.minecraft.init.Items.y;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_417)).a(((net.minecraft.item.ItemStack)(spill568_418)), ((java.lang.Object[])(spill568_424)));

    spill568_425 = receiver;

    spill568_426 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aa, 4);

    java.lang.Object[] __stackOp568_868_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_867(10364, (4263641638854854914L ^ life1_3))];

    spill568_427 = __stackOp568_868_0;

    (__stackOp568_868_0)[0] = "X";

    java.lang.Object[] __stackOp568_869_0 = spill568_427;

    spill568_428 = __stackOp568_869_0;

    (__stackOp568_869_0)[1] = "#";

    java.lang.Object[] __stackOp568_870_0 = spill568_428;

    spill568_429 = __stackOp568_870_0;

    (__stackOp568_870_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_871(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_873_0 = spill568_429;

    spill568_430 = __stackOp568_873_0;

    (__stackOp568_873_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.h, 1, 1);

    java.lang.Object[] __stackOp568_875_0 = spill568_430;

    spill568_431 = __stackOp568_875_0;

    (__stackOp568_875_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_876(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_878_0 = spill568_431;

    spill568_432 = __stackOp568_878_0;

    (__stackOp568_878_0)[5] = net.minecraft.init.Items.y;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_425)).a(((net.minecraft.item.ItemStack)(spill568_426)), ((java.lang.Object[])(spill568_432)));

    spill568_433 = receiver;

    spill568_434 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.z, 4);

    java.lang.Object[] __stackOp568_882_0 = new java.lang.Object[4];

    spill568_435 = __stackOp568_882_0;

    (__stackOp568_882_0)[0] = "# #";

    java.lang.Object[] __stackOp568_883_0 = spill568_435;

    spill568_436 = __stackOp568_883_0;

    (__stackOp568_883_0)[1] = " # ";

    java.lang.Object[] __stackOp568_884_0 = spill568_436;

    spill568_437 = __stackOp568_884_0;

    (__stackOp568_884_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_885(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_887_0 = spill568_437;

    spill568_438 = __stackOp568_887_0;

    (__stackOp568_887_0)[3] = net.minecraft.init.Blocks.f;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_433)).a(((net.minecraft.item.ItemStack)(spill568_434)), ((java.lang.Object[])(spill568_438)));

    spill568_439 = receiver;

    spill568_440 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bp, 3);

    java.lang.Object[] __stackOp568_891_0 = new java.lang.Object[4];

    spill568_441 = __stackOp568_891_0;

    (__stackOp568_891_0)[0] = "# #";

    java.lang.Object[] __stackOp568_892_0 = spill568_441;

    spill568_442 = __stackOp568_892_0;

    (__stackOp568_892_0)[1] = " # ";

    java.lang.Object[] __stackOp568_893_0 = spill568_442;

    spill568_443 = __stackOp568_893_0;

    (__stackOp568_893_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_894(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_896_0 = spill568_443;

    spill568_444 = __stackOp568_896_0;

    (__stackOp568_896_0)[3] = net.minecraft.init.Blocks.w;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_439)).a(((net.minecraft.item.ItemStack)(spill568_440)), ((java.lang.Object[])(spill568_444)));

    spill568_445 = receiver;

    spill568_446 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.av, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_900(21661, (616937474663970241L ^ life1_3)));

    java.lang.Object[] __stackOp568_902_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_901(29300, (5045997084862698253L ^ life1_3))];

    spill568_447 = __stackOp568_902_0;

    (__stackOp568_902_0)[0] = "X X";

    java.lang.Object[] __stackOp568_903_0 = spill568_447;

    spill568_448 = __stackOp568_903_0;

    (__stackOp568_903_0)[1] = "X#X";

    java.lang.Object[] __stackOp568_904_0 = spill568_448;

    spill568_449 = __stackOp568_904_0;

    (__stackOp568_904_0)[2] = "X X";

    java.lang.Object[] __stackOp568_905_0 = spill568_449;

    spill568_450 = __stackOp568_905_0;

    (__stackOp568_905_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_906(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_908_0 = spill568_450;

    spill568_451 = __stackOp568_908_0;

    (__stackOp568_908_0)[4] = net.minecraft.init.Items.j;

    java.lang.Object[] __stackOp568_910_0 = spill568_451;

    spill568_452 = __stackOp568_910_0;

    (__stackOp568_910_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_911(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_913_0 = spill568_452;

    spill568_453 = __stackOp568_913_0;

    (__stackOp568_913_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_914(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.y;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_445)).a(((net.minecraft.item.ItemStack)(spill568_446)), ((java.lang.Object[])(spill568_453)));

    spill568_454 = receiver;

    spill568_455 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.D, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_918(10364, (4263641638854854914L ^ life1_3)));

    java.lang.Object[] __stackOp568_920_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_919(3215, (9141013569948331491L ^ life1_3))];

    spill568_456 = __stackOp568_920_0;

    (__stackOp568_920_0)[0] = "X X";

    java.lang.Object[] __stackOp568_921_0 = spill568_456;

    spill568_457 = __stackOp568_921_0;

    (__stackOp568_921_0)[1] = "X#X";

    java.lang.Object[] __stackOp568_922_0 = spill568_457;

    spill568_458 = __stackOp568_922_0;

    (__stackOp568_922_0)[2] = "XRX";

    java.lang.Object[] __stackOp568_923_0 = spill568_458;

    spill568_459 = __stackOp568_923_0;

    (__stackOp568_923_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_924(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_926_0 = spill568_459;

    spill568_460 = __stackOp568_926_0;

    (__stackOp568_926_0)[4] = net.minecraft.init.Items.k;

    java.lang.Object[] __stackOp568_928_0 = spill568_460;

    spill568_461 = __stackOp568_928_0;

    (__stackOp568_928_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_929(13452, (5410489262456509933L ^ life1_3)))));

    java.lang.Object[] __stackOp568_931_0 = spill568_461;

    spill568_462 = __stackOp568_931_0;

    (__stackOp568_931_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_932(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aC;

    java.lang.Object[] __stackOp568_934_0 = spill568_462;

    spill568_463 = __stackOp568_934_0;

    (__stackOp568_934_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_935(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_936(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_938_0 = spill568_463;

    spill568_464 = __stackOp568_938_0;

    (__stackOp568_938_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_939(25077, (8770264046436302982L ^ life1_3))] = net.minecraft.init.Items.y;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_454)).a(((net.minecraft.item.ItemStack)(spill568_455)), ((java.lang.Object[])(spill568_464)));

    spill568_465 = receiver;

    spill568_466 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b7, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_943(10364, (4263641638854854914L ^ life1_3)));

    java.lang.Object[] __stackOp568_945_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_944(3215, (9141013569948331491L ^ life1_3))];

    spill568_467 = __stackOp568_945_0;

    (__stackOp568_945_0)[0] = "XSX";

    java.lang.Object[] __stackOp568_946_0 = spill568_467;

    spill568_468 = __stackOp568_946_0;

    (__stackOp568_946_0)[1] = "X#X";

    java.lang.Object[] __stackOp568_947_0 = spill568_468;

    spill568_469 = __stackOp568_947_0;

    (__stackOp568_947_0)[2] = "XSX";

    java.lang.Object[] __stackOp568_948_0 = spill568_469;

    spill568_470 = __stackOp568_948_0;

    (__stackOp568_948_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_949(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_951_0 = spill568_470;

    spill568_471 = __stackOp568_951_0;

    (__stackOp568_951_0)[4] = net.minecraft.init.Items.j;

    java.lang.Object[] __stackOp568_953_0 = spill568_471;

    spill568_472 = __stackOp568_953_0;

    (__stackOp568_953_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_954(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_956_0 = spill568_472;

    spill568_473 = __stackOp568_956_0;

    (__stackOp568_956_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_957(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Blocks.aF;

    java.lang.Object[] __stackOp568_959_0 = spill568_473;

    spill568_474 = __stackOp568_959_0;

    (__stackOp568_959_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_960(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_961(18837, (2463889091992250606L ^ life1_3)))));

    java.lang.Object[] __stackOp568_963_0 = spill568_474;

    spill568_475 = __stackOp568_963_0;

    (__stackOp568_963_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_964(25077, (8770264046436302982L ^ life1_3))] = net.minecraft.init.Items.y;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_465)).a(((net.minecraft.item.ItemStack)(spill568_466)), ((java.lang.Object[])(spill568_475)));

    spill568_476 = receiver;

    spill568_477 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.E, __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_968(10364, (4263641638854854914L ^ life1_3)));

    java.lang.Object[] __stackOp568_970_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_969(3215, (9141013569948331491L ^ life1_3))];

    spill568_478 = __stackOp568_970_0;

    (__stackOp568_970_0)[0] = "X X";

    java.lang.Object[] __stackOp568_971_0 = spill568_478;

    spill568_479 = __stackOp568_971_0;

    (__stackOp568_971_0)[1] = "X#X";

    java.lang.Object[] __stackOp568_972_0 = spill568_479;

    spill568_480 = __stackOp568_972_0;

    (__stackOp568_972_0)[2] = "XRX";

    java.lang.Object[] __stackOp568_973_0 = spill568_480;

    spill568_481 = __stackOp568_973_0;

    (__stackOp568_973_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_974(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_976_0 = spill568_481;

    spill568_482 = __stackOp568_976_0;

    (__stackOp568_976_0)[4] = net.minecraft.init.Items.j;

    java.lang.Object[] __stackOp568_978_0 = spill568_482;

    spill568_483 = __stackOp568_978_0;

    (__stackOp568_978_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_979(4256, (6728135325182407112L ^ life1_3)))));

    java.lang.Object[] __stackOp568_981_0 = spill568_483;

    spill568_484 = __stackOp568_981_0;

    (__stackOp568_981_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_982(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aC;

    java.lang.Object[] __stackOp568_984_0 = spill568_484;

    spill568_485 = __stackOp568_984_0;

    (__stackOp568_984_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_985(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_986(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_988_0 = spill568_485;

    spill568_486 = __stackOp568_988_0;

    (__stackOp568_988_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_989(25077, (8770264046436302982L ^ life1_3))] = net.minecraft.init.Blocks.az;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_476)).a(((net.minecraft.item.ItemStack)(spill568_477)), ((java.lang.Object[])(spill568_486)));

    spill568_487 = receiver;

    spill568_488 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.az, 1);

    java.lang.Object[] __stackOp568_993_0 = new java.lang.Object[4];

    spill568_489 = __stackOp568_993_0;

    (__stackOp568_993_0)[0] = "# #";

    java.lang.Object[] __stackOp568_994_0 = spill568_489;

    spill568_490 = __stackOp568_994_0;

    (__stackOp568_994_0)[1] = "###";

    java.lang.Object[] __stackOp568_995_0 = spill568_490;

    spill568_491 = __stackOp568_995_0;

    (__stackOp568_995_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_996(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_998_0 = spill568_491;

    spill568_492 = __stackOp568_998_0;

    (__stackOp568_998_0)[3] = net.minecraft.init.Items.j;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_487)).a(((net.minecraft.item.ItemStack)(spill568_488)), ((java.lang.Object[])(spill568_492)));

    spill568_493 = receiver;

    spill568_494 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bv, 1);

    java.lang.Object[] __stackOp568_1002_0 = new java.lang.Object[5];

    spill568_495 = __stackOp568_1002_0;

    (__stackOp568_1002_0)[0] = "# #";

    java.lang.Object[] __stackOp568_1003_0 = spill568_495;

    spill568_496 = __stackOp568_1003_0;

    (__stackOp568_1003_0)[1] = "# #";

    java.lang.Object[] __stackOp568_1004_0 = spill568_496;

    spill568_497 = __stackOp568_1004_0;

    (__stackOp568_1004_0)[2] = "###";

    java.lang.Object[] __stackOp568_1005_0 = spill568_497;

    spill568_498 = __stackOp568_1005_0;

    (__stackOp568_1005_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1006(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1008_0 = spill568_498;

    spill568_499 = __stackOp568_1008_0;

    (__stackOp568_1008_0)[4] = net.minecraft.init.Items.j;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_493)).a(((net.minecraft.item.ItemStack)(spill568_494)), ((java.lang.Object[])(spill568_499)));

    spill568_500 = receiver;

    spill568_501 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bu, 1);

    java.lang.Object[] __stackOp568_1013_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1012(10364, (4263641638854854914L ^ life1_3))];

    spill568_502 = __stackOp568_1013_0;

    (__stackOp568_1013_0)[0] = " B ";

    java.lang.Object[] __stackOp568_1014_0 = spill568_502;

    spill568_503 = __stackOp568_1014_0;

    (__stackOp568_1014_0)[1] = "###";

    java.lang.Object[] __stackOp568_1015_0 = spill568_503;

    spill568_504 = __stackOp568_1015_0;

    (__stackOp568_1015_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1016(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1018_0 = spill568_504;

    spill568_505 = __stackOp568_1018_0;

    (__stackOp568_1018_0)[3] = net.minecraft.init.Blocks.e;

    java.lang.Object[] __stackOp568_1020_0 = spill568_505;

    spill568_506 = __stackOp568_1020_0;

    (__stackOp568_1020_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1021(19904, (8361264700248550573L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1023_0 = spill568_506;

    spill568_507 = __stackOp568_1023_0;

    (__stackOp568_1023_0)[5] = net.minecraft.init.Items.bk;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_500)).a(((net.minecraft.item.ItemStack)(spill568_501)), ((java.lang.Object[])(spill568_507)));

    spill568_508 = receiver;

    spill568_509 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aZ, 1);

    java.lang.Object[] __stackOp568_1028_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1027(10364, (4263641638854854914L ^ life1_3))];

    spill568_510 = __stackOp568_1028_0;

    (__stackOp568_1028_0)[0] = "A";

    java.lang.Object[] __stackOp568_1029_0 = spill568_510;

    spill568_511 = __stackOp568_1029_0;

    (__stackOp568_1029_0)[1] = "B";

    java.lang.Object[] __stackOp568_1030_0 = spill568_511;

    spill568_512 = __stackOp568_1030_0;

    (__stackOp568_1030_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1031(31329, (1863880397801970459L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1033_0 = spill568_512;

    spill568_513 = __stackOp568_1033_0;

    (__stackOp568_1033_0)[3] = net.minecraft.init.Blocks.aU;

    java.lang.Object[] __stackOp568_1035_0 = spill568_513;

    spill568_514 = __stackOp568_1035_0;

    (__stackOp568_1035_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1036(19904, (8361264700248550573L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1038_0 = spill568_514;

    spill568_515 = __stackOp568_1038_0;

    (__stackOp568_1038_0)[5] = net.minecraft.init.Blocks.aa;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_508)).a(((net.minecraft.item.ItemStack)(spill568_509)), ((java.lang.Object[])(spill568_515)));

    spill568_516 = receiver;

    spill568_517 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aN, 1);

    java.lang.Object[] __stackOp568_1043_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1042(10364, (4263641638854854914L ^ life1_3))];

    spill568_518 = __stackOp568_1043_0;

    (__stackOp568_1043_0)[0] = "A";

    java.lang.Object[] __stackOp568_1044_0 = spill568_518;

    spill568_519 = __stackOp568_1044_0;

    (__stackOp568_1044_0)[1] = "B";

    java.lang.Object[] __stackOp568_1045_0 = spill568_519;

    spill568_520 = __stackOp568_1045_0;

    (__stackOp568_1045_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1046(31329, (1863880397801970459L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1048_0 = spill568_520;

    spill568_521 = __stackOp568_1048_0;

    (__stackOp568_1048_0)[3] = net.minecraft.init.Blocks.ae;

    java.lang.Object[] __stackOp568_1050_0 = spill568_521;

    spill568_522 = __stackOp568_1050_0;

    (__stackOp568_1050_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1051(19904, (8361264700248550573L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1053_0 = spill568_522;

    spill568_523 = __stackOp568_1053_0;

    (__stackOp568_1053_0)[5] = net.minecraft.init.Items.az;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_516)).a(((net.minecraft.item.ItemStack)(spill568_517)), ((java.lang.Object[])(spill568_523)));

    spill568_524 = receiver;

    spill568_525 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aO, 1);

    java.lang.Object[] __stackOp568_1058_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1057(10364, (4263641638854854914L ^ life1_3))];

    spill568_526 = __stackOp568_1058_0;

    (__stackOp568_1058_0)[0] = "A";

    java.lang.Object[] __stackOp568_1059_0 = spill568_526;

    spill568_527 = __stackOp568_1059_0;

    (__stackOp568_1059_0)[1] = "B";

    java.lang.Object[] __stackOp568_1060_0 = spill568_527;

    spill568_528 = __stackOp568_1060_0;

    (__stackOp568_1060_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1061(31329, (1863880397801970459L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1063_0 = spill568_528;

    spill568_529 = __stackOp568_1063_0;

    (__stackOp568_1063_0)[3] = net.minecraft.init.Blocks.al;

    java.lang.Object[] __stackOp568_1065_0 = spill568_529;

    spill568_530 = __stackOp568_1065_0;

    (__stackOp568_1065_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1066(19904, (8361264700248550573L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1068_0 = spill568_530;

    spill568_531 = __stackOp568_1068_0;

    (__stackOp568_1068_0)[5] = net.minecraft.init.Items.az;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_524)).a(((net.minecraft.item.ItemStack)(spill568_525)), ((java.lang.Object[])(spill568_531)));

    spill568_532 = receiver;

    spill568_533 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bW, 1);

    java.lang.Object[] __stackOp568_1073_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1072(10364, (4263641638854854914L ^ life1_3))];

    spill568_534 = __stackOp568_1073_0;

    (__stackOp568_1073_0)[0] = "A";

    java.lang.Object[] __stackOp568_1074_0 = spill568_534;

    spill568_535 = __stackOp568_1074_0;

    (__stackOp568_1074_0)[1] = "B";

    java.lang.Object[] __stackOp568_1075_0 = spill568_535;

    spill568_536 = __stackOp568_1075_0;

    (__stackOp568_1075_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1076(31329, (1863880397801970459L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1078_0 = spill568_536;

    spill568_537 = __stackOp568_1078_0;

    (__stackOp568_1078_0)[3] = net.minecraft.init.Blocks.W;

    java.lang.Object[] __stackOp568_1080_0 = spill568_537;

    spill568_538 = __stackOp568_1080_0;

    (__stackOp568_1080_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1081(19904, (8361264700248550573L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1083_0 = spill568_538;

    spill568_539 = __stackOp568_1083_0;

    (__stackOp568_1083_0)[5] = net.minecraft.init.Items.az;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_532)).a(((net.minecraft.item.ItemStack)(spill568_533)), ((java.lang.Object[])(spill568_539)));

    spill568_540 = receiver;

    spill568_541 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bX, 1);

    java.lang.Object[] __stackOp568_1088_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1087(10364, (4263641638854854914L ^ life1_3))];

    spill568_542 = __stackOp568_1088_0;

    (__stackOp568_1088_0)[0] = "A";

    java.lang.Object[] __stackOp568_1089_0 = spill568_542;

    spill568_543 = __stackOp568_1089_0;

    (__stackOp568_1089_0)[1] = "B";

    java.lang.Object[] __stackOp568_1090_0 = spill568_543;

    spill568_544 = __stackOp568_1090_0;

    (__stackOp568_1090_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1091(31329, (1863880397801970459L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1093_0 = spill568_544;

    spill568_545 = __stackOp568_1093_0;

    (__stackOp568_1093_0)[3] = net.minecraft.init.Blocks.b4;

    java.lang.Object[] __stackOp568_1095_0 = spill568_545;

    spill568_546 = __stackOp568_1095_0;

    (__stackOp568_1095_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1096(19904, (8361264700248550573L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1098_0 = spill568_546;

    spill568_547 = __stackOp568_1098_0;

    (__stackOp568_1098_0)[5] = net.minecraft.init.Items.az;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_540)).a(((net.minecraft.item.ItemStack)(spill568_541)), ((java.lang.Object[])(spill568_547)));

    spill568_548 = receiver;

    spill568_549 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aE, 1);

    java.lang.Object[] __stackOp568_1102_0 = new java.lang.Object[4];

    spill568_550 = __stackOp568_1102_0;

    (__stackOp568_1102_0)[0] = "# #";

    java.lang.Object[] __stackOp568_1103_0 = spill568_550;

    spill568_551 = __stackOp568_1103_0;

    (__stackOp568_1103_0)[1] = "###";

    java.lang.Object[] __stackOp568_1104_0 = spill568_551;

    spill568_552 = __stackOp568_1104_0;

    (__stackOp568_1104_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1105(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1107_0 = spill568_552;

    spill568_553 = __stackOp568_1107_0;

    (__stackOp568_1107_0)[3] = net.minecraft.init.Blocks.f;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_548)).a(((net.minecraft.item.ItemStack)(spill568_549)), ((java.lang.Object[])(spill568_553)));

    spill568_554 = receiver;

    spill568_555 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aw, 1);

    java.lang.Object[] __stackOp568_1111_0 = new java.lang.Object[4];

    spill568_556 = __stackOp568_1111_0;

    (__stackOp568_1111_0)[0] = "# #";

    java.lang.Object[] __stackOp568_1112_0 = spill568_556;

    spill568_557 = __stackOp568_1112_0;

    (__stackOp568_1112_0)[1] = " # ";

    java.lang.Object[] __stackOp568_1113_0 = spill568_557;

    spill568_558 = __stackOp568_1113_0;

    (__stackOp568_1113_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1114(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1116_0 = spill568_558;

    spill568_559 = __stackOp568_1116_0;

    (__stackOp568_1116_0)[3] = net.minecraft.init.Items.j;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_554)).a(((net.minecraft.item.ItemStack)(spill568_555)), ((java.lang.Object[])(spill568_559)));

    spill568_560 = receiver;

    spill568_561 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bF, 1);

    java.lang.Object[] __stackOp568_1120_0 = new java.lang.Object[4];

    spill568_562 = __stackOp568_1120_0;

    (__stackOp568_1120_0)[0] = "# #";

    java.lang.Object[] __stackOp568_1121_0 = spill568_562;

    spill568_563 = __stackOp568_1121_0;

    (__stackOp568_1121_0)[1] = " # ";

    java.lang.Object[] __stackOp568_1122_0 = spill568_563;

    spill568_564 = __stackOp568_1122_0;

    (__stackOp568_1122_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1123(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1125_0 = spill568_564;

    spill568_565 = __stackOp568_1125_0;

    (__stackOp568_1125_0)[3] = net.minecraft.init.Items.aH;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_560)).a(((net.minecraft.item.ItemStack)(spill568_561)), ((java.lang.Object[])(spill568_565)));

    spill568_566 = receiver;

    spill568_567 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.d, 1);

    java.lang.Object[] __stackOp568_1129_0 = new java.lang.Object[2];

    spill568_568 = __stackOp568_1129_0;

    (__stackOp568_1129_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.j, 1);

    java.lang.Object[] __stackOp568_1131_0 = spill568_568;

    spill568_569 = __stackOp568_1131_0;

    (__stackOp568_1131_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.ak, 1);

    ((net.minecraft.item.crafting.CraftingManager)(spill568_566)).a__Void(((net.minecraft.item.ItemStack)(spill568_567)), ((java.lang.Object[])(spill568_569)));

    spill568_570 = receiver;

    spill568_571 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.P, 1);

    java.lang.Object[] __stackOp568_1135_0 = new java.lang.Object[3];

    spill568_572 = __stackOp568_1135_0;

    (__stackOp568_1135_0)[0] = "###";

    java.lang.Object[] __stackOp568_1136_0 = spill568_572;

    spill568_573 = __stackOp568_1136_0;

    (__stackOp568_1136_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1137(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1139_0 = spill568_573;

    spill568_574 = __stackOp568_1139_0;

    (__stackOp568_1139_0)[2] = net.minecraft.init.Items.O;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_570)).a(((net.minecraft.item.ItemStack)(spill568_571)), ((java.lang.Object[])(spill568_574)));

    spill568_575 = receiver;

    spill568_576 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ad, 4);

    java.lang.Object[] __stackOp568_1143_0 = new java.lang.Object[5];

    spill568_577 = __stackOp568_1143_0;

    (__stackOp568_1143_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1144_0 = spill568_577;

    spill568_578 = __stackOp568_1144_0;

    (__stackOp568_1144_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1145_0 = spill568_578;

    spill568_579 = __stackOp568_1145_0;

    (__stackOp568_1145_0)[2] = "###";

    java.lang.Object[] __stackOp568_1146_0 = spill568_579;

    spill568_580 = __stackOp568_1146_0;

    (__stackOp568_1146_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1147(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1149_0 = spill568_580;

    spill568_581 = __stackOp568_1149_0;

    (__stackOp568_1149_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_575)).a(((net.minecraft.item.ItemStack)(spill568_576)), ((java.lang.Object[])(spill568_581)));

    spill568_582 = receiver;

    spill568_583 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bK, 4);

    java.lang.Object[] __stackOp568_1155_0 = new java.lang.Object[5];

    spill568_584 = __stackOp568_1155_0;

    (__stackOp568_1155_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1156_0 = spill568_584;

    spill568_585 = __stackOp568_1156_0;

    (__stackOp568_1156_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1157_0 = spill568_585;

    spill568_586 = __stackOp568_1157_0;

    (__stackOp568_1157_0)[2] = "###";

    java.lang.Object[] __stackOp568_1158_0 = spill568_586;

    spill568_587 = __stackOp568_1158_0;

    (__stackOp568_1158_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1159(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1161_0 = spill568_587;

    spill568_588 = __stackOp568_1161_0;

    (__stackOp568_1161_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_582)).a(((net.minecraft.item.ItemStack)(spill568_583)), ((java.lang.Object[])(spill568_588)));

    spill568_589 = receiver;

    spill568_590 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bJ, 4);

    java.lang.Object[] __stackOp568_1167_0 = new java.lang.Object[5];

    spill568_591 = __stackOp568_1167_0;

    (__stackOp568_1167_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1168_0 = spill568_591;

    spill568_592 = __stackOp568_1168_0;

    (__stackOp568_1168_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1169_0 = spill568_592;

    spill568_593 = __stackOp568_1169_0;

    (__stackOp568_1169_0)[2] = "###";

    java.lang.Object[] __stackOp568_1170_0 = spill568_593;

    spill568_594 = __stackOp568_1170_0;

    (__stackOp568_1170_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1171(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1173_0 = spill568_594;

    spill568_595 = __stackOp568_1173_0;

    (__stackOp568_1173_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_589)).a(((net.minecraft.item.ItemStack)(spill568_590)), ((java.lang.Object[])(spill568_595)));

    spill568_596 = receiver;

    spill568_597 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bL, 4);

    java.lang.Object[] __stackOp568_1179_0 = new java.lang.Object[5];

    spill568_598 = __stackOp568_1179_0;

    (__stackOp568_1179_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1180_0 = spill568_598;

    spill568_599 = __stackOp568_1180_0;

    (__stackOp568_1180_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1181_0 = spill568_599;

    spill568_600 = __stackOp568_1181_0;

    (__stackOp568_1181_0)[2] = "###";

    java.lang.Object[] __stackOp568_1182_0 = spill568_600;

    spill568_601 = __stackOp568_1182_0;

    (__stackOp568_1182_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1183(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1185_0 = spill568_601;

    spill568_602 = __stackOp568_1185_0;

    (__stackOp568_1185_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_596)).a(((net.minecraft.item.ItemStack)(spill568_597)), ((java.lang.Object[])(spill568_602)));

    spill568_603 = receiver;

    spill568_604 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cg, 4);

    java.lang.Object[] __stackOp568_1191_0 = new java.lang.Object[5];

    spill568_605 = __stackOp568_1191_0;

    (__stackOp568_1191_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1192_0 = spill568_605;

    spill568_606 = __stackOp568_1192_0;

    (__stackOp568_1192_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1193_0 = spill568_606;

    spill568_607 = __stackOp568_1193_0;

    (__stackOp568_1193_0)[2] = "###";

    java.lang.Object[] __stackOp568_1194_0 = spill568_607;

    spill568_608 = __stackOp568_1194_0;

    (__stackOp568_1194_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1195(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1197_0 = spill568_608;

    spill568_609 = __stackOp568_1197_0;

    (__stackOp568_1197_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a()) - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_603)).a(((net.minecraft.item.ItemStack)(spill568_604)), ((java.lang.Object[])(spill568_609)));

    spill568_610 = receiver;

    spill568_611 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ch, 4);

    java.lang.Object[] __stackOp568_1203_0 = new java.lang.Object[5];

    spill568_612 = __stackOp568_1203_0;

    (__stackOp568_1203_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1204_0 = spill568_612;

    spill568_613 = __stackOp568_1204_0;

    (__stackOp568_1204_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1205_0 = spill568_613;

    spill568_614 = __stackOp568_1205_0;

    (__stackOp568_1205_0)[2] = "###";

    java.lang.Object[] __stackOp568_1206_0 = spill568_614;

    spill568_615 = __stackOp568_1206_0;

    (__stackOp568_1206_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1207(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1209_0 = spill568_615;

    spill568_616 = __stackOp568_1209_0;

    (__stackOp568_1209_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.f, 1, ((4 + ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a()) - 4));

    ((net.minecraft.item.crafting.CraftingManager)(spill568_610)).a(((net.minecraft.item.ItemStack)(spill568_611)), ((java.lang.Object[])(spill568_616)));

    spill568_617 = receiver;

    spill568_618 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aR, 1);

    java.lang.Object[] __stackOp568_1216_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1215(29300, (5045997084862698253L ^ life1_3))];

    spill568_619 = __stackOp568_1216_0;

    (__stackOp568_1216_0)[0] = "  #";

    java.lang.Object[] __stackOp568_1217_0 = spill568_619;

    spill568_620 = __stackOp568_1217_0;

    (__stackOp568_1217_0)[1] = " #X";

    java.lang.Object[] __stackOp568_1218_0 = spill568_620;

    spill568_621 = __stackOp568_1218_0;

    (__stackOp568_1218_0)[2] = "# X";

    java.lang.Object[] __stackOp568_1219_0 = spill568_621;

    spill568_622 = __stackOp568_1219_0;

    (__stackOp568_1219_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1220(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1222_0 = spill568_622;

    spill568_623 = __stackOp568_1222_0;

    (__stackOp568_1222_0)[4] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_1224_0 = spill568_623;

    spill568_624 = __stackOp568_1224_0;

    (__stackOp568_1224_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1225(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1227_0 = spill568_624;

    spill568_625 = __stackOp568_1227_0;

    (__stackOp568_1227_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1228(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.F;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_617)).a(((net.minecraft.item.ItemStack)(spill568_618)), ((java.lang.Object[])(spill568_625)));

    spill568_626 = receiver;

    spill568_627 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bN, 1);

    java.lang.Object[] __stackOp568_1233_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1232(10364, (4263641638854854914L ^ life1_3))];

    spill568_628 = __stackOp568_1233_0;

    (__stackOp568_1233_0)[0] = "# ";

    java.lang.Object[] __stackOp568_1234_0 = spill568_628;

    spill568_629 = __stackOp568_1234_0;

    (__stackOp568_1234_0)[1] = " X";

    java.lang.Object[] __stackOp568_1235_0 = spill568_629;

    spill568_630 = __stackOp568_1235_0;

    (__stackOp568_1235_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1236(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1238_0 = spill568_630;

    spill568_631 = __stackOp568_1238_0;

    (__stackOp568_1238_0)[3] = net.minecraft.init.Items.aR;

    java.lang.Object[] __stackOp568_1240_0 = spill568_631;

    spill568_632 = __stackOp568_1240_0;

    (__stackOp568_1240_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1241(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1243_0 = spill568_632;

    spill568_633 = __stackOp568_1243_0;

    (__stackOp568_1243_0)[5] = net.minecraft.init.Items.bG;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_626)).a(((net.minecraft.item.ItemStack)(spill568_627)), ((java.lang.Object[])(spill568_633)));

    spill568_634 = receiver;

    spill568_635 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aw, 4);

    java.lang.Object[] __stackOp568_1247_0 = new java.lang.Object[5];

    spill568_636 = __stackOp568_1247_0;

    (__stackOp568_1247_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1248_0 = spill568_636;

    spill568_637 = __stackOp568_1248_0;

    (__stackOp568_1248_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1249_0 = spill568_637;

    spill568_638 = __stackOp568_1249_0;

    (__stackOp568_1249_0)[2] = "###";

    java.lang.Object[] __stackOp568_1250_0 = spill568_638;

    spill568_639 = __stackOp568_1250_0;

    (__stackOp568_1250_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1251(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1253_0 = spill568_639;

    spill568_640 = __stackOp568_1253_0;

    (__stackOp568_1253_0)[4] = net.minecraft.init.Blocks.e;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_634)).a(((net.minecraft.item.ItemStack)(spill568_635)), ((java.lang.Object[])(spill568_640)));

    spill568_641 = receiver;

    spill568_642 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bj, 4);

    java.lang.Object[] __stackOp568_1257_0 = new java.lang.Object[5];

    spill568_643 = __stackOp568_1257_0;

    (__stackOp568_1257_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1258_0 = spill568_643;

    spill568_644 = __stackOp568_1258_0;

    (__stackOp568_1258_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1259_0 = spill568_644;

    spill568_645 = __stackOp568_1259_0;

    (__stackOp568_1259_0)[2] = "###";

    java.lang.Object[] __stackOp568_1260_0 = spill568_645;

    spill568_646 = __stackOp568_1260_0;

    (__stackOp568_1260_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1261(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1263_0 = spill568_646;

    spill568_647 = __stackOp568_1263_0;

    (__stackOp568_1263_0)[4] = net.minecraft.init.Blocks.V;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_641)).a(((net.minecraft.item.ItemStack)(spill568_642)), ((java.lang.Object[])(spill568_647)));

    spill568_648 = receiver;

    spill568_649 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bk, 4);

    java.lang.Object[] __stackOp568_1267_0 = new java.lang.Object[5];

    spill568_650 = __stackOp568_1267_0;

    (__stackOp568_1267_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1268_0 = spill568_650;

    spill568_651 = __stackOp568_1268_0;

    (__stackOp568_1268_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1269_0 = spill568_651;

    spill568_652 = __stackOp568_1269_0;

    (__stackOp568_1269_0)[2] = "###";

    java.lang.Object[] __stackOp568_1270_0 = spill568_652;

    spill568_653 = __stackOp568_1270_0;

    (__stackOp568_1270_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1271(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1273_0 = spill568_653;

    spill568_654 = __stackOp568_1273_0;

    (__stackOp568_1273_0)[4] = net.minecraft.init.Blocks.a5;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_648)).a(((net.minecraft.item.ItemStack)(spill568_649)), ((java.lang.Object[])(spill568_654)));

    spill568_655 = receiver;

    spill568_656 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bp, 4);

    java.lang.Object[] __stackOp568_1277_0 = new java.lang.Object[5];

    spill568_657 = __stackOp568_1277_0;

    (__stackOp568_1277_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1278_0 = spill568_657;

    spill568_658 = __stackOp568_1278_0;

    (__stackOp568_1278_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1279_0 = spill568_658;

    spill568_659 = __stackOp568_1279_0;

    (__stackOp568_1279_0)[2] = "###";

    java.lang.Object[] __stackOp568_1280_0 = spill568_659;

    spill568_660 = __stackOp568_1280_0;

    (__stackOp568_1280_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1281(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1283_0 = spill568_660;

    spill568_661 = __stackOp568_1283_0;

    (__stackOp568_1283_0)[4] = net.minecraft.init.Blocks.bn;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_655)).a(((net.minecraft.item.ItemStack)(spill568_656)), ((java.lang.Object[])(spill568_661)));

    spill568_662 = receiver;

    spill568_663 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bD, 4);

    java.lang.Object[] __stackOp568_1287_0 = new java.lang.Object[5];

    spill568_664 = __stackOp568_1287_0;

    (__stackOp568_1287_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1288_0 = spill568_664;

    spill568_665 = __stackOp568_1288_0;

    (__stackOp568_1288_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1289_0 = spill568_665;

    spill568_666 = __stackOp568_1289_0;

    (__stackOp568_1289_0)[2] = "###";

    java.lang.Object[] __stackOp568_1290_0 = spill568_666;

    spill568_667 = __stackOp568_1290_0;

    (__stackOp568_1290_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1291(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1293_0 = spill568_667;

    spill568_668 = __stackOp568_1293_0;

    (__stackOp568_1293_0)[4] = net.minecraft.init.Blocks.A;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_662)).a(((net.minecraft.item.ItemStack)(spill568_663)), ((java.lang.Object[])(spill568_668)));

    spill568_669 = receiver;

    spill568_670 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cr, 4);

    java.lang.Object[] __stackOp568_1297_0 = new java.lang.Object[5];

    spill568_671 = __stackOp568_1297_0;

    (__stackOp568_1297_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1298_0 = spill568_671;

    spill568_672 = __stackOp568_1298_0;

    (__stackOp568_1298_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1299_0 = spill568_672;

    spill568_673 = __stackOp568_1299_0;

    (__stackOp568_1299_0)[2] = "###";

    java.lang.Object[] __stackOp568_1300_0 = spill568_673;

    spill568_674 = __stackOp568_1300_0;

    (__stackOp568_1300_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1301(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1303_0 = spill568_674;

    spill568_675 = __stackOp568_1303_0;

    (__stackOp568_1303_0)[4] = net.minecraft.init.Blocks.cq;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_669)).a(((net.minecraft.item.ItemStack)(spill568_670)), ((java.lang.Object[])(spill568_675)));

    spill568_676 = receiver;

    spill568_677 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b6, 4);

    java.lang.Object[] __stackOp568_1307_0 = new java.lang.Object[5];

    spill568_678 = __stackOp568_1307_0;

    (__stackOp568_1307_0)[0] = "#  ";

    java.lang.Object[] __stackOp568_1308_0 = spill568_678;

    spill568_679 = __stackOp568_1308_0;

    (__stackOp568_1308_0)[1] = "## ";

    java.lang.Object[] __stackOp568_1309_0 = spill568_679;

    spill568_680 = __stackOp568_1309_0;

    (__stackOp568_1309_0)[2] = "###";

    java.lang.Object[] __stackOp568_1310_0 = spill568_680;

    spill568_681 = __stackOp568_1310_0;

    (__stackOp568_1310_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1311(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1313_0 = spill568_681;

    spill568_682 = __stackOp568_1313_0;

    (__stackOp568_1313_0)[4] = net.minecraft.init.Blocks.b5;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_676)).a(((net.minecraft.item.ItemStack)(spill568_677)), ((java.lang.Object[])(spill568_682)));

    spill568_683 = receiver;

    spill568_684 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.an, 1);

    java.lang.Object[] __stackOp568_1318_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1317(29300, (5045997084862698253L ^ life1_3))];

    spill568_685 = __stackOp568_1318_0;

    (__stackOp568_1318_0)[0] = "###";

    java.lang.Object[] __stackOp568_1319_0 = spill568_685;

    spill568_686 = __stackOp568_1319_0;

    (__stackOp568_1319_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1320_0 = spill568_686;

    spill568_687 = __stackOp568_1320_0;

    (__stackOp568_1320_0)[2] = "###";

    java.lang.Object[] __stackOp568_1321_0 = spill568_687;

    spill568_688 = __stackOp568_1321_0;

    (__stackOp568_1321_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1322(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1324_0 = spill568_688;

    spill568_689 = __stackOp568_1324_0;

    (__stackOp568_1324_0)[4] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_1326_0 = spill568_689;

    spill568_690 = __stackOp568_1326_0;

    (__stackOp568_1326_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1327(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1329_0 = spill568_690;

    spill568_691 = __stackOp568_1329_0;

    (__stackOp568_1329_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1330(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Blocks.L;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_683)).a(((net.minecraft.item.ItemStack)(spill568_684)), ((java.lang.Object[])(spill568_691)));

    spill568_692 = receiver;

    spill568_693 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bE, 1);

    java.lang.Object[] __stackOp568_1335_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1334(29300, (5045997084862698253L ^ life1_3))];

    spill568_694 = __stackOp568_1335_0;

    (__stackOp568_1335_0)[0] = "###";

    java.lang.Object[] __stackOp568_1336_0 = spill568_694;

    spill568_695 = __stackOp568_1336_0;

    (__stackOp568_1336_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1337_0 = spill568_695;

    spill568_696 = __stackOp568_1337_0;

    (__stackOp568_1337_0)[2] = "###";

    java.lang.Object[] __stackOp568_1338_0 = spill568_696;

    spill568_697 = __stackOp568_1338_0;

    (__stackOp568_1338_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1339(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1341_0 = spill568_697;

    spill568_698 = __stackOp568_1341_0;

    (__stackOp568_1341_0)[4] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_1343_0 = spill568_698;

    spill568_699 = __stackOp568_1343_0;

    (__stackOp568_1343_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1344(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1346_0 = spill568_699;

    spill568_700 = __stackOp568_1346_0;

    (__stackOp568_1346_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1347(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aF;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_692)).a(((net.minecraft.item.ItemStack)(spill568_693)), ((java.lang.Object[])(spill568_700)));

    spill568_701 = receiver;

    spill568_702 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.ao, 1, 0);

    java.lang.Object[] __stackOp568_1352_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1351(29300, (5045997084862698253L ^ life1_3))];

    spill568_703 = __stackOp568_1352_0;

    (__stackOp568_1352_0)[0] = "###";

    java.lang.Object[] __stackOp568_1353_0 = spill568_703;

    spill568_704 = __stackOp568_1353_0;

    (__stackOp568_1353_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1354_0 = spill568_704;

    spill568_705 = __stackOp568_1354_0;

    (__stackOp568_1354_0)[2] = "###";

    java.lang.Object[] __stackOp568_1355_0 = spill568_705;

    spill568_706 = __stackOp568_1355_0;

    (__stackOp568_1355_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1356(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1358_0 = spill568_706;

    spill568_707 = __stackOp568_1358_0;

    (__stackOp568_1358_0)[4] = net.minecraft.init.Items.k;

    java.lang.Object[] __stackOp568_1360_0 = spill568_707;

    spill568_708 = __stackOp568_1360_0;

    (__stackOp568_1360_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1361(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1363_0 = spill568_708;

    spill568_709 = __stackOp568_1363_0;

    (__stackOp568_1363_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1364(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.e;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_701)).a(((net.minecraft.item.ItemStack)(spill568_702)), ((java.lang.Object[])(spill568_709)));

    spill568_710 = receiver;

    spill568_711 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.ao, 1, 1);

    java.lang.Object[] __stackOp568_1369_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1368(29300, (5045997084862698253L ^ life1_3))];

    spill568_712 = __stackOp568_1369_0;

    (__stackOp568_1369_0)[0] = "###";

    java.lang.Object[] __stackOp568_1370_0 = spill568_712;

    spill568_713 = __stackOp568_1370_0;

    (__stackOp568_1370_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1371_0 = spill568_713;

    spill568_714 = __stackOp568_1371_0;

    (__stackOp568_1371_0)[2] = "###";

    java.lang.Object[] __stackOp568_1372_0 = spill568_714;

    spill568_715 = __stackOp568_1372_0;

    (__stackOp568_1372_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1373(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1375_0 = spill568_715;

    spill568_716 = __stackOp568_1375_0;

    (__stackOp568_1375_0)[4] = net.minecraft.init.Blocks.R;

    java.lang.Object[] __stackOp568_1377_0 = spill568_716;

    spill568_717 = __stackOp568_1377_0;

    (__stackOp568_1377_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1378(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1380_0 = spill568_717;

    spill568_718 = __stackOp568_1380_0;

    (__stackOp568_1380_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1381(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.e;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_710)).a(((net.minecraft.item.ItemStack)(spill568_711)), ((java.lang.Object[])(spill568_718)));

    spill568_719 = receiver;

    spill568_720 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bL, 1, 0);

    java.lang.Object[] __stackOp568_1386_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1385(29300, (5045997084862698253L ^ life1_3))];

    spill568_721 = __stackOp568_1386_0;

    (__stackOp568_1386_0)[0] = "###";

    java.lang.Object[] __stackOp568_1387_0 = spill568_721;

    spill568_722 = __stackOp568_1387_0;

    (__stackOp568_1387_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1388_0 = spill568_722;

    spill568_723 = __stackOp568_1388_0;

    (__stackOp568_1388_0)[2] = "###";

    java.lang.Object[] __stackOp568_1389_0 = spill568_723;

    spill568_724 = __stackOp568_1389_0;

    (__stackOp568_1389_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1390(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1392_0 = spill568_724;

    spill568_725 = __stackOp568_1392_0;

    (__stackOp568_1392_0)[4] = net.minecraft.init.Items.bm;

    java.lang.Object[] __stackOp568_1394_0 = spill568_725;

    spill568_726 = __stackOp568_1394_0;

    (__stackOp568_1394_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1395(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1397_0 = spill568_726;

    spill568_727 = __stackOp568_1397_0;

    (__stackOp568_1397_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1398(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.bG;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_719)).a(((net.minecraft.item.ItemStack)(spill568_720)), ((java.lang.Object[])(spill568_727)));

    spill568_728 = receiver;

    spill568_729 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bx, 1);

    java.lang.Object[] __stackOp568_1403_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1402(29300, (5045997084862698253L ^ life1_3))];

    spill568_730 = __stackOp568_1403_0;

    (__stackOp568_1403_0)[0] = "###";

    java.lang.Object[] __stackOp568_1404_0 = spill568_730;

    spill568_731 = __stackOp568_1404_0;

    (__stackOp568_1404_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1405_0 = spill568_731;

    spill568_732 = __stackOp568_1405_0;

    (__stackOp568_1405_0)[2] = "###";

    java.lang.Object[] __stackOp568_1406_0 = spill568_732;

    spill568_733 = __stackOp568_1406_0;

    (__stackOp568_1406_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1407(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1409_0 = spill568_733;

    spill568_734 = __stackOp568_1409_0;

    (__stackOp568_1409_0)[4] = net.minecraft.init.Items.bm;

    java.lang.Object[] __stackOp568_1411_0 = spill568_734;

    spill568_735 = __stackOp568_1411_0;

    (__stackOp568_1411_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1412(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1414_0 = spill568_735;

    spill568_736 = __stackOp568_1414_0;

    (__stackOp568_1414_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1415(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.a5;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_728)).a(((net.minecraft.item.ItemStack)(spill568_729)), ((java.lang.Object[])(spill568_736)));

    spill568_737 = receiver;

    spill568_738 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ay, 1);

    java.lang.Object[] __stackOp568_1420_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1419(10364, (4263641638854854914L ^ life1_3))];

    spill568_739 = __stackOp568_1420_0;

    (__stackOp568_1420_0)[0] = "X";

    java.lang.Object[] __stackOp568_1421_0 = spill568_739;

    spill568_740 = __stackOp568_1421_0;

    (__stackOp568_1421_0)[1] = "#";

    java.lang.Object[] __stackOp568_1422_0 = spill568_740;

    spill568_741 = __stackOp568_1422_0;

    (__stackOp568_1422_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1423(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1425_0 = spill568_741;

    spill568_742 = __stackOp568_1425_0;

    (__stackOp568_1425_0)[3] = net.minecraft.init.Blocks.e;

    java.lang.Object[] __stackOp568_1427_0 = spill568_742;

    spill568_743 = __stackOp568_1427_0;

    (__stackOp568_1427_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1428(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1430_0 = spill568_743;

    spill568_744 = __stackOp568_1430_0;

    (__stackOp568_1430_0)[5] = net.minecraft.init.Items.y;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_737)).a(((net.minecraft.item.ItemStack)(spill568_738)), ((java.lang.Object[])(spill568_744)));

    spill568_745 = receiver;

    spill568_746 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bG, 2);

    java.lang.Object[] __stackOp568_1435_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1434(3215, (9141013569948331491L ^ life1_3))];

    spill568_747 = __stackOp568_1435_0;

    (__stackOp568_1435_0)[0] = "I";

    java.lang.Object[] __stackOp568_1436_0 = spill568_747;

    spill568_748 = __stackOp568_1436_0;

    (__stackOp568_1436_0)[1] = "S";

    java.lang.Object[] __stackOp568_1437_0 = spill568_748;

    spill568_749 = __stackOp568_1437_0;

    (__stackOp568_1437_0)[2] = "#";

    java.lang.Object[] __stackOp568_1438_0 = spill568_749;

    spill568_750 = __stackOp568_1438_0;

    (__stackOp568_1438_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1439(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1441_0 = spill568_750;

    spill568_751 = __stackOp568_1441_0;

    (__stackOp568_1441_0)[4] = net.minecraft.init.Blocks.f;

    java.lang.Object[] __stackOp568_1443_0 = spill568_751;

    spill568_752 = __stackOp568_1443_0;

    (__stackOp568_1443_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1444(24817, (2095224195325182362L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1446_0 = spill568_752;

    spill568_753 = __stackOp568_1446_0;

    (__stackOp568_1446_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1447(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_1449_0 = spill568_753;

    spill568_754 = __stackOp568_1449_0;

    (__stackOp568_1449_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1450(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1451(30353, (5908282300297959409L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1453_0 = spill568_754;

    spill568_755 = __stackOp568_1453_0;

    (__stackOp568_1453_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1454(25077, (8770264046436302982L ^ life1_3))] = net.minecraft.init.Items.j;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_745)).a(((net.minecraft.item.ItemStack)(spill568_746)), ((java.lang.Object[])(spill568_755)));

    spill568_756 = receiver;

    spill568_757 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aF, 1);

    java.lang.Object[] __stackOp568_1459_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1458(10364, (4263641638854854914L ^ life1_3))];

    spill568_758 = __stackOp568_1459_0;

    (__stackOp568_1459_0)[0] = "X";

    java.lang.Object[] __stackOp568_1460_0 = spill568_758;

    spill568_759 = __stackOp568_1460_0;

    (__stackOp568_1460_0)[1] = "#";

    java.lang.Object[] __stackOp568_1461_0 = spill568_759;

    spill568_760 = __stackOp568_1461_0;

    (__stackOp568_1461_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1462(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1464_0 = spill568_760;

    spill568_761 = __stackOp568_1464_0;

    (__stackOp568_1464_0)[3] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_1466_0 = spill568_761;

    spill568_762 = __stackOp568_1466_0;

    (__stackOp568_1466_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1467(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1469_0 = spill568_762;

    spill568_763 = __stackOp568_1469_0;

    (__stackOp568_1469_0)[5] = net.minecraft.init.Items.aC;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_756)).a(((net.minecraft.item.ItemStack)(spill568_757)), ((java.lang.Object[])(spill568_763)));

    spill568_764 = receiver;

    spill568_765 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.a1, 1);

    java.lang.Object[] __stackOp568_1474_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1473(25077, (8770264046436302982L ^ life1_3))];

    spill568_766 = __stackOp568_1474_0;

    (__stackOp568_1474_0)[0] = "#X#";

    java.lang.Object[] __stackOp568_1475_0 = spill568_766;

    spill568_767 = __stackOp568_1475_0;

    (__stackOp568_1475_0)[1] = "III";

    java.lang.Object[] __stackOp568_1476_0 = spill568_767;

    spill568_768 = __stackOp568_1476_0;

    (__stackOp568_1476_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1477(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1479_0 = spill568_768;

    spill568_769 = __stackOp568_1479_0;

    (__stackOp568_1479_0)[3] = net.minecraft.init.Blocks.aF;

    java.lang.Object[] __stackOp568_1481_0 = spill568_769;

    spill568_770 = __stackOp568_1481_0;

    (__stackOp568_1481_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1482(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1484_0 = spill568_770;

    spill568_771 = __stackOp568_1484_0;

    (__stackOp568_1484_0)[5] = net.minecraft.init.Items.aC;

    java.lang.Object[] __stackOp568_1486_0 = spill568_771;

    spill568_772 = __stackOp568_1486_0;

    (__stackOp568_1486_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1487(10364, (4263641638854854914L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1488(22288, (344927230075369024L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1490_0 = spill568_772;

    spill568_773 = __stackOp568_1490_0;

    (__stackOp568_1490_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1491(29300, (5045997084862698253L ^ life1_3))] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.STONE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_764)).a(((net.minecraft.item.ItemStack)(spill568_765)), ((java.lang.Object[])(spill568_773)));

    spill568_774 = receiver;

    spill568_775 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bT, 1);

    java.lang.Object[] __stackOp568_1498_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1497(3215, (9141013569948331491L ^ life1_3))];

    spill568_776 = __stackOp568_1498_0;

    (__stackOp568_1498_0)[0] = " # ";

    java.lang.Object[] __stackOp568_1499_0 = spill568_776;

    spill568_777 = __stackOp568_1499_0;

    (__stackOp568_1499_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1500_0 = spill568_777;

    spill568_778 = __stackOp568_1500_0;

    (__stackOp568_1500_0)[2] = "III";

    java.lang.Object[] __stackOp568_1501_0 = spill568_778;

    spill568_779 = __stackOp568_1501_0;

    (__stackOp568_1501_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1502(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1504_0 = spill568_779;

    spill568_780 = __stackOp568_1504_0;

    (__stackOp568_1504_0)[4] = net.minecraft.init.Blocks.aF;

    java.lang.Object[] __stackOp568_1506_0 = spill568_780;

    spill568_781 = __stackOp568_1506_0;

    (__stackOp568_1506_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1507(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1509_0 = spill568_781;

    spill568_782 = __stackOp568_1509_0;

    (__stackOp568_1509_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1510(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.bV;

    java.lang.Object[] __stackOp568_1512_0 = spill568_782;

    spill568_783 = __stackOp568_1512_0;

    (__stackOp568_1512_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1513(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1514(22288, (344927230075369024L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1516_0 = spill568_783;

    spill568_784 = __stackOp568_1516_0;

    (__stackOp568_1516_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1517(25077, (8770264046436302982L ^ life1_3))] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.STONE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_774)).a(((net.minecraft.item.ItemStack)(spill568_775)), ((java.lang.Object[])(spill568_784)));

    spill568_785 = receiver;

    spill568_786 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aS, 1);

    java.lang.Object[] __stackOp568_1524_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1523(29300, (5045997084862698253L ^ life1_3))];

    spill568_787 = __stackOp568_1524_0;

    (__stackOp568_1524_0)[0] = " # ";

    java.lang.Object[] __stackOp568_1525_0 = spill568_787;

    spill568_788 = __stackOp568_1525_0;

    (__stackOp568_1525_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1526_0 = spill568_788;

    spill568_789 = __stackOp568_1526_0;

    (__stackOp568_1526_0)[2] = " # ";

    java.lang.Object[] __stackOp568_1527_0 = spill568_789;

    spill568_790 = __stackOp568_1527_0;

    (__stackOp568_1527_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1528(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1530_0 = spill568_790;

    spill568_791 = __stackOp568_1530_0;

    (__stackOp568_1530_0)[4] = net.minecraft.init.Items.k;

    java.lang.Object[] __stackOp568_1532_0 = spill568_791;

    spill568_792 = __stackOp568_1532_0;

    (__stackOp568_1532_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1533(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1535_0 = spill568_792;

    spill568_793 = __stackOp568_1535_0;

    (__stackOp568_1535_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1536(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aC;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_785)).a(((net.minecraft.item.ItemStack)(spill568_786)), ((java.lang.Object[])(spill568_793)));

    spill568_794 = receiver;

    spill568_795 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aQ, 1);

    java.lang.Object[] __stackOp568_1541_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1540(29300, (5045997084862698253L ^ life1_3))];

    spill568_796 = __stackOp568_1541_0;

    (__stackOp568_1541_0)[0] = " # ";

    java.lang.Object[] __stackOp568_1542_0 = spill568_796;

    spill568_797 = __stackOp568_1542_0;

    (__stackOp568_1542_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1543_0 = spill568_797;

    spill568_798 = __stackOp568_1543_0;

    (__stackOp568_1543_0)[2] = " # ";

    java.lang.Object[] __stackOp568_1544_0 = spill568_798;

    spill568_799 = __stackOp568_1544_0;

    (__stackOp568_1544_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1545(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1547_0 = spill568_799;

    spill568_800 = __stackOp568_1547_0;

    (__stackOp568_1547_0)[4] = net.minecraft.init.Items.j;

    java.lang.Object[] __stackOp568_1549_0 = spill568_800;

    spill568_801 = __stackOp568_1549_0;

    (__stackOp568_1549_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1550(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1552_0 = spill568_801;

    spill568_802 = __stackOp568_1552_0;

    (__stackOp568_1552_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1553(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aC;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_794)).a(((net.minecraft.item.ItemStack)(spill568_795)), ((java.lang.Object[])(spill568_802)));

    spill568_803 = receiver;

    spill568_804 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bK, 1);

    java.lang.Object[] __stackOp568_1558_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1557(29300, (5045997084862698253L ^ life1_3))];

    spill568_805 = __stackOp568_1558_0;

    (__stackOp568_1558_0)[0] = "###";

    java.lang.Object[] __stackOp568_1559_0 = spill568_805;

    spill568_806 = __stackOp568_1559_0;

    (__stackOp568_1559_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1560_0 = spill568_806;

    spill568_807 = __stackOp568_1560_0;

    (__stackOp568_1560_0)[2] = "###";

    java.lang.Object[] __stackOp568_1561_0 = spill568_807;

    spill568_808 = __stackOp568_1561_0;

    (__stackOp568_1561_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1562(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1564_0 = spill568_808;

    spill568_809 = __stackOp568_1564_0;

    (__stackOp568_1564_0)[4] = net.minecraft.init.Items.aK;

    java.lang.Object[] __stackOp568_1566_0 = spill568_809;

    spill568_810 = __stackOp568_1566_0;

    (__stackOp568_1566_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1567(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1569_0 = spill568_810;

    spill568_811 = __stackOp568_1569_0;

    (__stackOp568_1569_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1570(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aQ;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_803)).a(((net.minecraft.item.ItemStack)(spill568_804)), ((java.lang.Object[])(spill568_811)));

    spill568_812 = receiver;

    spill568_813 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aG, 1);

    java.lang.Object[] __stackOp568_1574_0 = new java.lang.Object[3];

    spill568_814 = __stackOp568_1574_0;

    (__stackOp568_1574_0)[0] = "#";

    java.lang.Object[] __stackOp568_1575_0 = spill568_814;

    spill568_815 = __stackOp568_1575_0;

    (__stackOp568_1575_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1576(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1578_0 = spill568_815;

    spill568_816 = __stackOp568_1578_0;

    (__stackOp568_1578_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.STONE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_812)).a(((net.minecraft.item.ItemStack)(spill568_813)), ((java.lang.Object[])(spill568_816)));

    spill568_817 = receiver;

    spill568_818 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bS, 1);

    java.lang.Object[] __stackOp568_1584_0 = new java.lang.Object[3];

    spill568_819 = __stackOp568_1584_0;

    (__stackOp568_1584_0)[0] = "#";

    java.lang.Object[] __stackOp568_1585_0 = spill568_819;

    spill568_820 = __stackOp568_1585_0;

    (__stackOp568_1585_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1586(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1588_0 = spill568_820;

    spill568_821 = __stackOp568_1588_0;

    (__stackOp568_1588_0)[2] = net.minecraft.init.Blocks.f;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_817)).a(((net.minecraft.item.ItemStack)(spill568_818)), ((java.lang.Object[])(spill568_821)));

    spill568_822 = receiver;

    spill568_823 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.az, 1);

    java.lang.Object[] __stackOp568_1592_0 = new java.lang.Object[3];

    spill568_824 = __stackOp568_1592_0;

    (__stackOp568_1592_0)[0] = "##";

    java.lang.Object[] __stackOp568_1593_0 = spill568_824;

    spill568_825 = __stackOp568_1593_0;

    (__stackOp568_1593_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1594(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1596_0 = spill568_825;

    spill568_826 = __stackOp568_1596_0;

    (__stackOp568_1596_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.STONE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_822)).a(((net.minecraft.item.ItemStack)(spill568_823)), ((java.lang.Object[])(spill568_826)));

    spill568_827 = receiver;

    spill568_828 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aB, 1);

    java.lang.Object[] __stackOp568_1602_0 = new java.lang.Object[3];

    spill568_829 = __stackOp568_1602_0;

    (__stackOp568_1602_0)[0] = "##";

    java.lang.Object[] __stackOp568_1603_0 = spill568_829;

    spill568_830 = __stackOp568_1603_0;

    (__stackOp568_1603_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1604(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1606_0 = spill568_830;

    spill568_831 = __stackOp568_1606_0;

    (__stackOp568_1606_0)[2] = net.minecraft.init.Blocks.f;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_827)).a(((net.minecraft.item.ItemStack)(spill568_828)), ((java.lang.Object[])(spill568_831)));

    spill568_832 = receiver;

    spill568_833 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bX, 1);

    java.lang.Object[] __stackOp568_1610_0 = new java.lang.Object[3];

    spill568_834 = __stackOp568_1610_0;

    (__stackOp568_1610_0)[0] = "##";

    java.lang.Object[] __stackOp568_1611_0 = spill568_834;

    spill568_835 = __stackOp568_1611_0;

    (__stackOp568_1611_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1612(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1614_0 = spill568_835;

    spill568_836 = __stackOp568_1614_0;

    (__stackOp568_1614_0)[2] = net.minecraft.init.Items.j;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_832)).a(((net.minecraft.item.ItemStack)(spill568_833)), ((java.lang.Object[])(spill568_836)));

    spill568_837 = receiver;

    spill568_838 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bW, 1);

    java.lang.Object[] __stackOp568_1618_0 = new java.lang.Object[3];

    spill568_839 = __stackOp568_1618_0;

    (__stackOp568_1618_0)[0] = "##";

    java.lang.Object[] __stackOp568_1619_0 = spill568_839;

    spill568_840 = __stackOp568_1619_0;

    (__stackOp568_1619_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1620(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1622_0 = spill568_840;

    spill568_841 = __stackOp568_1622_0;

    (__stackOp568_1622_0)[2] = net.minecraft.init.Items.k;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_837)).a(((net.minecraft.item.ItemStack)(spill568_838)), ((java.lang.Object[])(spill568_841)));

    spill568_842 = receiver;

    spill568_843 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.z, 1);

    java.lang.Object[] __stackOp568_1627_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1626(3215, (9141013569948331491L ^ life1_3))];

    spill568_844 = __stackOp568_1627_0;

    (__stackOp568_1627_0)[0] = "###";

    java.lang.Object[] __stackOp568_1628_0 = spill568_844;

    spill568_845 = __stackOp568_1628_0;

    (__stackOp568_1628_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1629_0 = spill568_845;

    spill568_846 = __stackOp568_1629_0;

    (__stackOp568_1629_0)[2] = "#R#";

    java.lang.Object[] __stackOp568_1630_0 = spill568_846;

    spill568_847 = __stackOp568_1630_0;

    (__stackOp568_1630_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1631(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1633_0 = spill568_847;

    spill568_848 = __stackOp568_1633_0;

    (__stackOp568_1633_0)[4] = net.minecraft.init.Blocks.e;

    java.lang.Object[] __stackOp568_1635_0 = spill568_848;

    spill568_849 = __stackOp568_1635_0;

    (__stackOp568_1635_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1636(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1638_0 = spill568_849;

    spill568_850 = __stackOp568_1638_0;

    (__stackOp568_1638_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1639(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.f;

    java.lang.Object[] __stackOp568_1641_0 = spill568_850;

    spill568_851 = __stackOp568_1641_0;

    (__stackOp568_1641_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1642(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1643(4256, (6728135325182407112L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1645_0 = spill568_851;

    spill568_852 = __stackOp568_1645_0;

    (__stackOp568_1645_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1646(25077, (8770264046436302982L ^ life1_3))] = net.minecraft.init.Items.aC;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_842)).a(((net.minecraft.item.ItemStack)(spill568_843)), ((java.lang.Object[])(spill568_852)));

    spill568_853 = receiver;

    spill568_854 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b8, 1);

    java.lang.Object[] __stackOp568_1651_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1650(29300, (5045997084862698253L ^ life1_3))];

    spill568_855 = __stackOp568_1651_0;

    (__stackOp568_1651_0)[0] = "###";

    java.lang.Object[] __stackOp568_1652_0 = spill568_855;

    spill568_856 = __stackOp568_1652_0;

    (__stackOp568_1652_0)[1] = "# #";

    java.lang.Object[] __stackOp568_1653_0 = spill568_856;

    spill568_857 = __stackOp568_1653_0;

    (__stackOp568_1653_0)[2] = "#R#";

    java.lang.Object[] __stackOp568_1654_0 = spill568_857;

    spill568_858 = __stackOp568_1654_0;

    (__stackOp568_1654_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1655(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1657_0 = spill568_858;

    spill568_859 = __stackOp568_1657_0;

    (__stackOp568_1657_0)[4] = net.minecraft.init.Blocks.e;

    java.lang.Object[] __stackOp568_1659_0 = spill568_859;

    spill568_860 = __stackOp568_1659_0;

    (__stackOp568_1659_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1660(4256, (6728135325182407112L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1662_0 = spill568_860;

    spill568_861 = __stackOp568_1662_0;

    (__stackOp568_1662_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1663(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aC;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_853)).a(((net.minecraft.item.ItemStack)(spill568_854)), ((java.lang.Object[])(spill568_861)));

    spill568_862 = receiver;

    spill568_863 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.J, 1);

    java.lang.Object[] __stackOp568_1668_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1667(29017, (2145013500850819112L ^ life1_3))];

    spill568_864 = __stackOp568_1668_0;

    (__stackOp568_1668_0)[0] = "TTT";

    java.lang.Object[] __stackOp568_1669_0 = spill568_864;

    spill568_865 = __stackOp568_1669_0;

    (__stackOp568_1669_0)[1] = "#X#";

    java.lang.Object[] __stackOp568_1670_0 = spill568_865;

    spill568_866 = __stackOp568_1670_0;

    (__stackOp568_1670_0)[2] = "#R#";

    java.lang.Object[] __stackOp568_1671_0 = spill568_866;

    spill568_867 = __stackOp568_1671_0;

    (__stackOp568_1671_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1672(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1674_0 = spill568_867;

    spill568_868 = __stackOp568_1674_0;

    (__stackOp568_1674_0)[4] = net.minecraft.init.Blocks.e;

    java.lang.Object[] __stackOp568_1676_0 = spill568_868;

    spill568_869 = __stackOp568_1676_0;

    (__stackOp568_1676_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1677(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1679_0 = spill568_869;

    spill568_870 = __stackOp568_1679_0;

    (__stackOp568_1679_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1680(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.j;

    java.lang.Object[] __stackOp568_1682_0 = spill568_870;

    spill568_871 = __stackOp568_1682_0;

    (__stackOp568_1682_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1683(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1684(4256, (6728135325182407112L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1686_0 = spill568_871;

    spill568_872 = __stackOp568_1686_0;

    (__stackOp568_1686_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1687(25077, (8770264046436302982L ^ life1_3))] = net.minecraft.init.Items.aC;

    java.lang.Object[] __stackOp568_1689_0 = spill568_872;

    spill568_873 = __stackOp568_1689_0;

    (__stackOp568_1689_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1690(3215, (9141013569948331491L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1691(10486, (2328752019220564392L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1693_0 = spill568_873;

    spill568_874 = __stackOp568_1693_0;

    (__stackOp568_1693_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1694(3680, (757276045100986168L ^ life1_3))] = net.minecraft.init.Blocks.f;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_862)).a(((net.minecraft.item.ItemStack)(spill568_863)), ((java.lang.Object[])(spill568_874)));

    spill568_875 = receiver;

    spill568_876 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.F, 1);

    java.lang.Object[] __stackOp568_1699_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1698(10364, (4263641638854854914L ^ life1_3))];

    spill568_877 = __stackOp568_1699_0;

    (__stackOp568_1699_0)[0] = "S";

    java.lang.Object[] __stackOp568_1700_0 = spill568_877;

    spill568_878 = __stackOp568_1700_0;

    (__stackOp568_1700_0)[1] = "P";

    java.lang.Object[] __stackOp568_1701_0 = spill568_878;

    spill568_879 = __stackOp568_1701_0;

    (__stackOp568_1701_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1702(24817, (2095224195325182362L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1704_0 = spill568_879;

    spill568_880 = __stackOp568_1704_0;

    (__stackOp568_1704_0)[3] = net.minecraft.init.Items.aM;

    java.lang.Object[] __stackOp568_1706_0 = spill568_880;

    spill568_881 = __stackOp568_1706_0;

    (__stackOp568_1706_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1707(16569, (6755750189372826053L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1709_0 = spill568_881;

    spill568_882 = __stackOp568_1709_0;

    (__stackOp568_1709_0)[5] = net.minecraft.init.Blocks.J;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_875)).a(((net.minecraft.item.ItemStack)(spill568_876)), ((java.lang.Object[])(spill568_882)));

    spill568_883 = receiver;

    spill568_884 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.a0, 1);

    java.lang.Object[] __stackOp568_1714_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1713(10364, (4263641638854854914L ^ life1_3))];

    spill568_885 = __stackOp568_1714_0;

    (__stackOp568_1714_0)[0] = "###";

    java.lang.Object[] __stackOp568_1715_0 = spill568_885;

    spill568_886 = __stackOp568_1715_0;

    (__stackOp568_1715_0)[1] = "XXX";

    java.lang.Object[] __stackOp568_1716_0 = spill568_886;

    spill568_887 = __stackOp568_1716_0;

    (__stackOp568_1716_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1717(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1719_0 = spill568_887;

    spill568_888 = __stackOp568_1719_0;

    (__stackOp568_1719_0)[3] = net.minecraft.init.Blocks.L;

    java.lang.Object[] __stackOp568_1721_0 = spill568_888;

    spill568_889 = __stackOp568_1721_0;

    (__stackOp568_1721_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1722(23202, (7623647726128135127L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1724_0 = spill568_889;

    spill568_890 = __stackOp568_1724_0;

    (__stackOp568_1724_0)[5] = net.minecraft.init.Blocks.f;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_883)).a(((net.minecraft.item.ItemStack)(spill568_884)), ((java.lang.Object[])(spill568_890)));

    spill568_891 = receiver;

    spill568_892 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.br, 1);

    java.lang.Object[] __stackOp568_1729_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1728(3215, (9141013569948331491L ^ life1_3))];

    spill568_893 = __stackOp568_1729_0;

    (__stackOp568_1729_0)[0] = " B ";

    java.lang.Object[] __stackOp568_1730_0 = spill568_893;

    spill568_894 = __stackOp568_1730_0;

    (__stackOp568_1730_0)[1] = "D#D";

    java.lang.Object[] __stackOp568_1731_0 = spill568_894;

    spill568_895 = __stackOp568_1731_0;

    (__stackOp568_1731_0)[2] = "###";

    java.lang.Object[] __stackOp568_1732_0 = spill568_895;

    spill568_896 = __stackOp568_1732_0;

    (__stackOp568_1732_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1733(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1735_0 = spill568_896;

    spill568_897 = __stackOp568_1735_0;

    (__stackOp568_1735_0)[4] = net.minecraft.init.Blocks.Z;

    java.lang.Object[] __stackOp568_1737_0 = spill568_897;

    spill568_898 = __stackOp568_1737_0;

    (__stackOp568_1737_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1738(19904, (8361264700248550573L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1740_0 = spill568_898;

    spill568_899 = __stackOp568_1740_0;

    (__stackOp568_1740_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1741(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.aL;

    java.lang.Object[] __stackOp568_1743_0 = spill568_899;

    spill568_900 = __stackOp568_1743_0;

    (__stackOp568_1743_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1744(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1745(7192, (4968357110423010663L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1747_0 = spill568_900;

    spill568_901 = __stackOp568_1747_0;

    (__stackOp568_1747_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1748(25077, (8770264046436302982L ^ life1_3))] = net.minecraft.init.Items.i;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_891)).a(((net.minecraft.item.ItemStack)(spill568_892)), ((java.lang.Object[])(spill568_901)));

    spill568_902 = receiver;

    spill568_903 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bU, 1);

    java.lang.Object[] __stackOp568_1753_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1752(29300, (5045997084862698253L ^ life1_3))];

    spill568_904 = __stackOp568_1753_0;

    (__stackOp568_1753_0)[0] = "III";

    java.lang.Object[] __stackOp568_1754_0 = spill568_904;

    spill568_905 = __stackOp568_1754_0;

    (__stackOp568_1754_0)[1] = " i ";

    java.lang.Object[] __stackOp568_1755_0 = spill568_905;

    spill568_906 = __stackOp568_1755_0;

    (__stackOp568_1755_0)[2] = "iii";

    java.lang.Object[] __stackOp568_1756_0 = spill568_906;

    spill568_907 = __stackOp568_1756_0;

    (__stackOp568_1756_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1757(22288, (344927230075369024L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1759_0 = spill568_907;

    spill568_908 = __stackOp568_1759_0;

    (__stackOp568_1759_0)[4] = net.minecraft.init.Blocks.S;

    java.lang.Object[] __stackOp568_1761_0 = spill568_908;

    spill568_909 = __stackOp568_1761_0;

    (__stackOp568_1761_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1762(6280, (6721767863626545627L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1764_0 = spill568_909;

    spill568_910 = __stackOp568_1764_0;

    (__stackOp568_1764_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1765(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.j;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_902)).a(((net.minecraft.item.ItemStack)(spill568_903)), ((java.lang.Object[])(spill568_910)));

    spill568_911 = receiver;

    spill568_912 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aF);

    java.lang.Object[] __stackOp568_1769_0 = new java.lang.Object[4];

    spill568_913 = __stackOp568_1769_0;

    (__stackOp568_1769_0)[0] = "##";

    java.lang.Object[] __stackOp568_1770_0 = spill568_913;

    spill568_914 = __stackOp568_1770_0;

    (__stackOp568_1770_0)[1] = "##";

    java.lang.Object[] __stackOp568_1771_0 = spill568_914;

    spill568_915 = __stackOp568_1771_0;

    (__stackOp568_1771_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1772(11899, (3807270898253500163L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1774_0 = spill568_915;

    spill568_916 = __stackOp568_1774_0;

    (__stackOp568_1774_0)[3] = net.minecraft.init.Items.bh;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_911)).a(((net.minecraft.item.ItemStack)(spill568_912)), ((java.lang.Object[])(spill568_916)));

    spill568_917 = receiver;

    spill568_918 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bw, 1);

    java.lang.Object[] __stackOp568_1778_0 = new java.lang.Object[2];

    spill568_919 = __stackOp568_1778_0;

    (__stackOp568_1778_0)[0] = net.minecraft.init.Items.bj;

    java.lang.Object[] __stackOp568_1780_0 = spill568_919;

    spill568_920 = __stackOp568_1780_0;

    (__stackOp568_1780_0)[1] = net.minecraft.init.Items.bs;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_917)).a__Void(((net.minecraft.item.ItemStack)(spill568_918)), ((java.lang.Object[])(spill568_920)));

    spill568_921 = receiver;

    spill568_922 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bA, 3);

    java.lang.Object[] __stackOp568_1784_0 = new java.lang.Object[3];

    spill568_923 = __stackOp568_1784_0;

    (__stackOp568_1784_0)[0] = net.minecraft.init.Items.H;

    java.lang.Object[] __stackOp568_1786_0 = spill568_923;

    spill568_924 = __stackOp568_1786_0;

    (__stackOp568_1786_0)[1] = net.minecraft.init.Items.bs;

    java.lang.Object[] __stackOp568_1788_0 = spill568_924;

    spill568_925 = __stackOp568_1788_0;

    (__stackOp568_1788_0)[2] = net.minecraft.init.Items.h;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_921)).a__Void(((net.minecraft.item.ItemStack)(spill568_922)), ((java.lang.Object[])(spill568_925)));

    spill568_926 = receiver;

    spill568_927 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bA, 3);

    java.lang.Object[] __stackOp568_1792_0 = new java.lang.Object[3];

    spill568_928 = __stackOp568_1792_0;

    (__stackOp568_1792_0)[0] = net.minecraft.init.Items.H;

    java.lang.Object[] __stackOp568_1794_0 = spill568_928;

    spill568_929 = __stackOp568_1794_0;

    (__stackOp568_1794_0)[1] = net.minecraft.init.Items.bs;

    java.lang.Object[] __stackOp568_1796_0 = spill568_929;

    spill568_930 = __stackOp568_1796_0;

    (__stackOp568_1796_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.h, 1, 1);

    ((net.minecraft.item.crafting.CraftingManager)(spill568_926)).a__Void(((net.minecraft.item.ItemStack)(spill568_927)), ((java.lang.Object[])(spill568_930)));

    spill568_931 = receiver;

    spill568_932 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b0);

    java.lang.Object[] __stackOp568_1801_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1800(3215, (9141013569948331491L ^ life1_3))];

    spill568_933 = __stackOp568_1801_0;

    (__stackOp568_1801_0)[0] = "GGG";

    java.lang.Object[] __stackOp568_1802_0 = spill568_933;

    spill568_934 = __stackOp568_1802_0;

    (__stackOp568_1802_0)[1] = "QQQ";

    java.lang.Object[] __stackOp568_1803_0 = spill568_934;

    spill568_935 = __stackOp568_1803_0;

    (__stackOp568_1803_0)[2] = "WWW";

    java.lang.Object[] __stackOp568_1804_0 = spill568_935;

    spill568_936 = __stackOp568_1804_0;

    (__stackOp568_1804_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1805(24065, (8324513899701010266L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1807_0 = spill568_936;

    spill568_937 = __stackOp568_1807_0;

    (__stackOp568_1807_0)[4] = net.minecraft.init.Blocks.w;

    java.lang.Object[] __stackOp568_1809_0 = spill568_937;

    spill568_938 = __stackOp568_1809_0;

    (__stackOp568_1809_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1810(6394, (3325621887160531341L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1812_0 = spill568_938;

    spill568_939 = __stackOp568_1812_0;

    (__stackOp568_1812_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1813(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Items.bV;

    java.lang.Object[] __stackOp568_1815_0 = spill568_939;

    spill568_940 = __stackOp568_1815_0;

    (__stackOp568_1815_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1816(29300, (5045997084862698253L ^ life1_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1817(26401, (7515633800711521870L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1819_0 = spill568_940;

    spill568_941 = __stackOp568_1819_0;

    (__stackOp568_1819_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1820(25077, (8770264046436302982L ^ life1_3))] = net.minecraft.init.Blocks.bB;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_931)).a(((net.minecraft.item.ItemStack)(spill568_932)), ((java.lang.Object[])(spill568_941)));

    spill568_942 = receiver;

    spill568_943 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b4);

    java.lang.Object[] __stackOp568_1825_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1824(29300, (5045997084862698253L ^ life1_3))];

    spill568_944 = __stackOp568_1825_0;

    (__stackOp568_1825_0)[0] = "I I";

    java.lang.Object[] __stackOp568_1826_0 = spill568_944;

    spill568_945 = __stackOp568_1826_0;

    (__stackOp568_1826_0)[1] = "ICI";

    java.lang.Object[] __stackOp568_1827_0 = spill568_945;

    spill568_946 = __stackOp568_1827_0;

    (__stackOp568_1827_0)[2] = " I ";

    java.lang.Object[] __stackOp568_1828_0 = spill568_946;

    spill568_947 = __stackOp568_1828_0;

    (__stackOp568_1828_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1829(22288, (344927230075369024L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1831_0 = spill568_947;

    spill568_948 = __stackOp568_1831_0;

    (__stackOp568_1831_0)[4] = net.minecraft.init.Items.j;

    java.lang.Object[] __stackOp568_1833_0 = spill568_948;

    spill568_949 = __stackOp568_1833_0;

    (__stackOp568_1833_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1834(28176, (5287716147805933430L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1836_0 = spill568_949;

    spill568_950 = __stackOp568_1836_0;

    (__stackOp568_1836_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1837(10364, (4263641638854854914L ^ life1_3))] = net.minecraft.init.Blocks.ae;

    ((net.minecraft.item.crafting.CraftingManager)(spill568_942)).a(((net.minecraft.item.ItemStack)(spill568_943)), ((java.lang.Object[])(spill568_950)));

    spill568_951 = receiver;

    spill568_952 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bY, 1);

    java.lang.Object[] __stackOp568_1842_0 = new java.lang.Object[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1841(29300, (5045997084862698253L ^ life1_3))];

    spill568_953 = __stackOp568_1842_0;

    (__stackOp568_1842_0)[0] = "///";

    java.lang.Object[] __stackOp568_1843_0 = spill568_953;

    spill568_954 = __stackOp568_1843_0;

    (__stackOp568_1843_0)[1] = " / ";

    java.lang.Object[] __stackOp568_1844_0 = spill568_954;

    spill568_955 = __stackOp568_1844_0;

    (__stackOp568_1844_0)[2] = "/_/";

    java.lang.Object[] __stackOp568_1845_0 = spill568_955;

    spill568_956 = __stackOp568_1845_0;

    (__stackOp568_1845_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1846(27370, (8160354567595772828L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1848_0 = spill568_956;

    spill568_957 = __stackOp568_1848_0;

    (__stackOp568_1848_0)[4] = net.minecraft.init.Items.y;

    java.lang.Object[] __stackOp568_1850_0 = spill568_957;

    spill568_958 = __stackOp568_1850_0;

    (__stackOp568_1850_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1851(12039, (2688514733285772915L ^ life1_3)))));

    java.lang.Object[] __stackOp568_1853_0 = spill568_958;

    spill568_959 = __stackOp568_1853_0;

    (__stackOp568_1853_0)[__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1854(10364, (4263641638854854914L ^ life1_3))] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, 1, ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.STONE)).a());

    ((net.minecraft.item.crafting.CraftingManager)(spill568_951)).a(((net.minecraft.item.ItemStack)(spill568_952)), ((java.lang.Object[])(spill568_959)));

    ((java.util.List)(((net.minecraft.item.crafting.CraftingManager)(receiver)).b)).sort(((java.util.Comparator)(__sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1860())));

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(-8944195679206642587L)), ((long)(3401683997202772408L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(130495673840558L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.item.crafting.CraftingManager.c ^ 108609530684305L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1904_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1904_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1904_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1904_14 = new byte[8];
    (__sourceSpill1904_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1904_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1904_16 = __sourceSpill1904_14;
    ((javax.crypto.Cipher)(__sourceSpill1904_11)).init(((int)(__sourceSpill1904_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1904_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1904_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[43];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "5Ì^ñ3õw¢å¦\0334o®ä^M\013R¶¡óÿ\006TRµ+d1ñ\035¾½u\003Ö\021&kV2=±üp@Æº$WÉEzÂ»ÚK\fxt=\004òôJ³«zø\031Ð!ô\024\017ÂÅzæ\005yÉââPí\033;Ý\022v=çEvyÇ\000.qdá¢æ\031õ20­\031Æèl¡\177YÏEÖ:f=üùÅátÚÓ|éÑäº·\023Ç_\177û\001²SÐÄUÒ\027äs-EhµÒ\004ÀÊVìº\020q\025àaspúEÿY÷5¾é\013K\001êÜÞ>¼-\037\fpÌ¢rC*ùÐXñ\034Ö×¤I´duÑ!p\025cÜm\n\nH¯Ï\031*¹0;wÒ&\033(\177yr\001[#àÌ\021Ðóè\\â0\007_âB<;'iË\f\0074PâÒã(ÑAkèµ(8Y¸@X¼dZ\025\n@$ròÁNóÒ¨Þ_\177\013\fg¦Ê"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1904_25 = local6_life21;
        int __sourceSpill1904_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1904_25)).substring(((int)(__sourceSpill1904_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1904_30 = local8_life19;
        int __sourceSpill1904_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1904_33 = new byte[8];
        (__sourceSpill1904_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1904_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1904_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1904_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1904_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1904_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1904_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1904_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1904_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1904_34)).doFinal(((byte[])(__sourceSpill1904_33)));
        (__sourceSpill1904_30)[__sourceSpill1904_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "vÎ\032ëÀø§\031q\022ìE~Æ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1904_38 = local6_life21;
        int __sourceSpill1904_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1904_38)).substring(((int)(__sourceSpill1904_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1904_43 = local8_life19;
        int __sourceSpill1904_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1904_46 = new byte[8];
        (__sourceSpill1904_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1904_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1904_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1904_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1904_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1904_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1904_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1904_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1904_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1904_47)).doFinal(((byte[])(__sourceSpill1904_46)));
        (__sourceSpill1904_43)[__sourceSpill1904_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[43]));
    a = ((net.minecraft.item.crafting.CraftingManager)(new net.minecraft.item.crafting.CraftingManager()));
}

private static native <E extends Throwable> void __sourceConstructorInit_0042ef34bdac4ed4_0(net.minecraft.item.crafting.CraftingManager a0) throws E;

private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public java.util.List<net.minecraft.item.crafting.IRecipe> a() {
return this.b;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23993;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xX", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.item.crafting.CraftingManager.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11976_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.item.crafting.IRecipe p0) {
((java.util.List)(this.b)).add(((java.lang.Object)(p0)));
    return;
}


public void a__Void(net.minecraft.item.ItemStack p0, java.lang.Object[] p1) {
long local3 = (net.minecraft.item.crafting.CraftingManager.c ^ 31105437951570L);
    java.util.ArrayList local5 = com.google.common.collect.Lists.newArrayList();
    java.lang.Object[] local6 = p1;
    int local7 = (local6).length;
    int local8 = 0;
    while ((local8 < local7)) {
        java.lang.Object local9 = (local6)[local8];
        if ((((local9 instanceof net.minecraft.item.ItemStack) ? 1 : 0) != 0)) {
        ((java.util.List)(local5)).add(((java.lang.Object)(((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(local9)))).a__xW())));
    } else {
        if ((((local9 instanceof net.minecraft.item.Item) ? 1 : 0) != 0)) {
        ((java.util.List)(local5)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(((net.minecraft.item.Item)(local9))))));
    } else {
        if ((((local9 instanceof net.minecraft.block.Block) ? 1 : 0) == 0)) {
        throw new java.lang.IllegalArgumentException(__sourceIntrinsic_92035f483beb_invokedynamic10086_12(((java.lang.Class)(((java.lang.Object)(local9)).getClass())).getName()));
    }
        ((java.util.List)(local5)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(((net.minecraft.block.Block)(local9))))));
    }
    }
        local8 += 1;
    }
    ((java.util.List)(this.b)).add(((java.lang.Object)(new moom.yg(p0, local5))));
    return;
}


public moom.ye a(net.minecraft.item.ItemStack p0, java.lang.Object[] p1) {
long life3_3;
    int life6_5;
    int life7_7;
    int life8_9;
    java.lang.String[] life9_20;
    java.lang.StringBuilder life10_24;
    java.lang.String[] life11_26;
    int life12_29;
    int life13_31;
    java.lang.String life14_38;
    java.lang.String life5_51;
    java.lang.StringBuilder life9_56;
    java.lang.String life10_67;
    java.util.HashMap life9_81;
    java.lang.Character life10_90;
    net.minecraft.item.ItemStack life11_92;
    net.minecraft.item.ItemStack[] life10_160;
    int life11_162;
    int life12_171;
    moom.ye life11_202;
    life3_3 = (net.minecraft.item.crafting.CraftingManager.c ^ 35233917587826L);
    life6_5 = 0;
    life7_7 = 0;
    life8_9 = 0;
    if (((((p1)[life6_5] instanceof java.lang.String[]) ? 1 : 0) != 0)) {
        life9_20 = ((java.lang.String[])((p1)[(life6_5++)]));
        life10_24 = new java.lang.StringBuilder();
        life11_26 = life9_20;
        life12_29 = (life11_26).length;
        life13_31 = 0;
        loop_region_32: while ((life13_31 < life12_29)) {
        life14_38 = (life11_26)[life13_31];
        life8_9 += 1;
        life7_7 = ((java.lang.String)(life14_38)).length();
        ((java.lang.StringBuilder)(life10_24)).append(((java.lang.String)(life14_38)));
        life13_31 += 1;
    }
        life5_51 = ((java.lang.StringBuilder)(life10_24)).toString();
    } else {
        life9_56 = new java.lang.StringBuilder();
        loop_region_57: while (((((p1)[life6_5] instanceof java.lang.String) ? 1 : 0) != 0)) {
        life10_67 = ((java.lang.String)((p1)[(life6_5++)]));
        life8_9 += 1;
        life7_7 = ((java.lang.String)(life10_67)).length();
        ((java.lang.StringBuilder)(life9_56)).append(((java.lang.String)(life10_67)));
    }
        life5_51 = ((java.lang.StringBuilder)(life9_56)).toString();
    }
    life9_81 = com.google.common.collect.Maps.newHashMap();
    loop_region_82: while ((life6_5 < (p1).length)) {
        life10_90 = ((java.lang.Character)((p1)[life6_5]));
        life11_92 = null;
        if (((((p1)[(life6_5 + 1)] instanceof net.minecraft.item.Item) ? 1 : 0) != 0)) {
        life11_92 = new net.minecraft.item.ItemStack(((net.minecraft.item.Item)((p1)[(life6_5 + 1)])));
    } else {
        if (((((p1)[(life6_5 + 1)] instanceof net.minecraft.block.Block) ? 1 : 0) != 0)) {
        life11_92 = new net.minecraft.item.ItemStack(((net.minecraft.block.Block)((p1)[(life6_5 + 1)])), 1, __sourceIntrinsic_8bf83bbab01e_invokedynamic6189_17(32643, (7912958847025392170L ^ life3_3)));
    } else {
        if (((((p1)[(life6_5 + 1)] instanceof net.minecraft.item.ItemStack) ? 1 : 0) != 0)) {
        life11_92 = ((net.minecraft.item.ItemStack)((p1)[(life6_5 + 1)]));
    }
    }
    }
        ((java.util.Map)(life9_81)).put(((java.lang.Object)(life10_90)), ((java.lang.Object)(life11_92)));
        life6_5 += 2;
    }
    life10_160 = new net.minecraft.item.ItemStack[(life7_7 * life8_9)];
    life11_162 = 0;
    loop_region_163: while ((life11_162 < (life7_7 * life8_9))) {
        life12_171 = ((int)(((java.lang.String)(life5_51)).charAt(((int)(life11_162)))));
        if (((java.util.Map)(life9_81)).containsKey(((java.lang.Object)(java.lang.Character.valueOf(((char)(life12_171))))))) {
        (life10_160)[life11_162] = ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(((java.util.Map)(life9_81)).get(((java.lang.Object)(java.lang.Character.valueOf(((char)(life12_171)))))))))).a__xW();
    } else {
        (life10_160)[life11_162] = null;
    }
        life11_162 += 1;
    }
    life11_202 = new moom.ye(life7_7, life8_9, life10_160, p0);
    ((java.util.List)(this.b)).add(((java.lang.Object)(life11_202)));
    return life11_202;
}


public static net.minecraft.item.crafting.CraftingManager a__xX() {
return net.minecraft.item.crafting.CraftingManager.a;
}


public net.minecraft.item.ItemStack a(moom.wx p0, net.minecraft.world.World p1) {
net.minecraft.item.crafting.IRecipe lexicalValue1637_26_0;
    moom.wx lexicalValue1637_26_1;
    java.lang.String spill1637_0;
    net.minecraft.item.crafting.IRecipe spill1637_1;
    moom.wx spill1637_2;
    long life3_3;
    java.util.Iterator life6_8;
    java.lang.String life5_9;
    net.minecraft.item.crafting.IRecipe life7_16;
    lexical_join_30: {
    life3_3 = (net.minecraft.item.crafting.CraftingManager.c ^ 49153377982422L);
    spill1637_0 = moom.ye.b();
    life6_8 = ((java.util.List)(this.b)).iterator();
    life5_9 = spill1637_0;
    lexical_cycle_10: while (true) {
    lexical_join_28: {
    lexical_join_26: {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_30;
    }
    life7_16 = ((net.minecraft.item.crafting.IRecipe)(((java.util.Iterator)(life6_8)).next()));
    spill1637_1 = life7_16;
    spill1637_2 = p0;
    if (!((life5_9 == null))) {
        lexicalValue1637_26_0 = spill1637_1;
        lexicalValue1637_26_1 = spill1637_2;
        break lexical_join_26;
    }
    if (!(((net.minecraft.item.crafting.IRecipe)(spill1637_1)).a(((moom.wx)(spill1637_2)), ((net.minecraft.world.World)(p1))))) {
        break lexical_join_28;
    }
    lexicalValue1637_26_0 = life7_16;
    lexicalValue1637_26_1 = p0;
    }
    return ((net.minecraft.item.crafting.IRecipe)(lexicalValue1637_26_0)).a__xW(((moom.wx)(lexicalValue1637_26_1)));
    }
    if (!((life5_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return null;
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0, net.minecraft.world.World p1) {
net.minecraft.item.crafting.IRecipe lexicalValue1638_28_0;
    moom.wx lexicalValue1638_28_1;
    int lexicalValue1638_34_0;
    net.minecraft.item.ItemStack[] lexicalValue1638_54_0;
    java.lang.String spill1638_0;
    net.minecraft.item.crafting.IRecipe spill1638_1;
    moom.wx spill1638_2;
    boolean spill1638_3;
    net.minecraft.item.ItemStack[] spill1638_4;
    long life3_3;
    java.util.Iterator life6_8;
    java.lang.String life5_9;
    net.minecraft.item.crafting.IRecipe life7_16;
    net.minecraft.item.ItemStack[] life6_44;
    int life7_46;
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_34: {
    lexical_join_32: {
    life3_3 = (net.minecraft.item.crafting.CraftingManager.c ^ 101799170323885L);
    spill1638_0 = moom.ye.b();
    life6_8 = ((java.util.List)(this.b)).iterator();
    life5_9 = spill1638_0;
    lexical_cycle_10: while (true) {
    lexical_join_30: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_32;
    }
    life7_16 = ((net.minecraft.item.crafting.IRecipe)(((java.util.Iterator)(life6_8)).next()));
    spill1638_1 = life7_16;
    spill1638_2 = p0;
    if (!((life5_9 == null))) {
        lexicalValue1638_28_0 = spill1638_1;
        lexicalValue1638_28_1 = spill1638_2;
        break lexical_join_28;
    }
    spill1638_3 = ((net.minecraft.item.crafting.IRecipe)(spill1638_1)).a(((moom.wx)(spill1638_2)), ((net.minecraft.world.World)(p1)));
    if (!((life5_9 == null))) {
        lexicalValue1638_34_0 = ((spill1638_3) ? 1 : 0);
        break lexical_join_34;
    }
    if (!(spill1638_3)) {
        break lexical_join_30;
    }
    lexicalValue1638_28_0 = life7_16;
    lexicalValue1638_28_1 = p0;
    }
    return ((net.minecraft.item.crafting.IRecipe)(lexicalValue1638_28_0)).a__ArrayxW(((moom.wx)(lexicalValue1638_28_1)));
    }
    if (!((life5_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1638_34_0 = ((moom.wx)(p0)).b__Int();
    }
    life6_44 = new net.minecraft.item.ItemStack[lexicalValue1638_34_0];
    life7_46 = 0;
    lexical_cycle_38: while (true) {
    if (!((life7_46 < (life6_44).length))) {
        break lexical_join_53;
    }
    spill1638_4 = life6_44;
    if (!((life5_9 == null))) {
        lexicalValue1638_54_0 = spill1638_4;
        break lexical_join_54;
    }
    (spill1638_4)[life7_46] = ((moom.wx)(p0)).a__xW(((int)(life7_46)));
    life7_46 += 1;
    if (!((life5_9 != null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    lexicalValue1638_54_0 = life6_44;
    }
    return lexicalValue1638_54_0;
}


private static int lambda$new$0(net.minecraft.item.crafting.IRecipe p0, net.minecraft.item.crafting.IRecipe p1) {
int forwardValue5532_20_0;
    int forwardValue5532_32_0;
    int forwardValue5532_35_0;
    int spill5532_0;
    int spill5532_1;
    int spill5532_2;
    long life2_3;
    java.lang.String life4_5;
    forward_join_35: {
    forward_join_32: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (net.minecraft.item.crafting.CraftingManager.c ^ 27165635014934L);
    life4_5 = moom.ye.b();
    spill5532_0 = ((p0 instanceof moom.yg) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue5532_20_0 = spill5532_0;
        break forward_join_20;
    }
    if (!((spill5532_0 != 0))) {
        break forward_join_18;
    }
    spill5532_1 = ((p1 instanceof moom.ye) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue5532_20_0 = spill5532_1;
        break forward_join_20;
    }
    if (!((spill5532_1 != 0))) {
        break forward_join_18;
    }
    forwardValue5532_35_0 = 1;
    break forward_join_35;
    }
    forwardValue5532_20_0 = ((p1 instanceof moom.yg) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue5532_32_0 = forwardValue5532_20_0;
        break forward_join_32;
    }
    if (!((forwardValue5532_20_0 != 0))) {
        break forward_join_30;
    }
    spill5532_2 = ((p0 instanceof moom.ye) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue5532_32_0 = spill5532_2;
        break forward_join_32;
    }
    if (!((spill5532_2 != 0))) {
        break forward_join_30;
    }
    forwardValue5532_35_0 = -1;
    break forward_join_35;
    }
    forwardValue5532_32_0 = ((net.minecraft.item.crafting.IRecipe)(p1)).a();
    }
    forwardValue5532_35_0 = java.lang.Integer.compare(((int)(forwardValue5532_32_0)), ((int)(((net.minecraft.item.crafting.IRecipe)(p0)).a())));
    }
    return forwardValue5532_35_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_193(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_215(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_223(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_249(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_257(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_261(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_266(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_274(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_278(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_283(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_291(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_296(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_301(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_304(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_308(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_313(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_318(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_321(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_325(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_330(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_335(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_338(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_342(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_347(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_352(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_355(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_362(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_368(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_371(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_380(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_389(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_398(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_407(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_416(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_422(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_427(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_432(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_435(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_439(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_444(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_450(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_455(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_463(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_468(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_474(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_479(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_485(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_490(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_496(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_501(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_507(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_512(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_518(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_523(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_529(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_532(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_540(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_545(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_553(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_558(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_566(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_571(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_579(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_584(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_592(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_597(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_609(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_619(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_631(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_643(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_655(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_667(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_679(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_690(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_700(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_709(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_715(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_720(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_725(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_728(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_732(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_737(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_742(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_745(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_748(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_749(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_752(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_755(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_756(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_759(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_765(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_775(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_787(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_799(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_811(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_823(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_835(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_846(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_852(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_856(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_861(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_867(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_871(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_876(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_885(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_894(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_900(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_901(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_906(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_911(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_914(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_918(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_919(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_924(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_929(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_932(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_935(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_936(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_939(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_943(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_944(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_949(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_954(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_957(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_960(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_961(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_964(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_968(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_969(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_974(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_979(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_982(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_985(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_986(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_989(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_996(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1006(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1012(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1016(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1021(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1027(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1031(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1036(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1042(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1046(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1051(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1057(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1061(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1066(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1072(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1076(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1081(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1087(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1091(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1096(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1215(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1220(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1236(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1241(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1251(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1261(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1271(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1281(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1291(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1301(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1311(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1317(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1322(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1327(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1330(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1334(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1339(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1344(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1347(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1351(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1356(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1361(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1364(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1368(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1373(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1378(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1381(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1385(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1390(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1395(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1398(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1402(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1407(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1412(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1415(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1419(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1423(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1428(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1434(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1439(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1444(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1447(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1450(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1451(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1454(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1458(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1462(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1467(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1473(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1477(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1482(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1487(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1488(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1491(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1497(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1502(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1507(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1510(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1513(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1514(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1517(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1523(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1528(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1533(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1536(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1540(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1545(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1550(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1553(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1557(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1562(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1567(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1570(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1576(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1586(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1594(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1604(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1612(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1620(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1626(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1631(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1636(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1639(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1642(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1643(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1646(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1650(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1655(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1660(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1663(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1667(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1672(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1677(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1680(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1683(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1684(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1687(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1690(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1691(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1694(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1698(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1702(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1707(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1713(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1717(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1722(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1728(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1733(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1738(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1741(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1744(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1745(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1748(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1752(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1757(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1762(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1765(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1772(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1800(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1805(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1810(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1813(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1816(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1817(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1820(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1824(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1829(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1834(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1837(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1841(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1846(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1851(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1854(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.Comparator __sourceIntrinsic_0042ef34bdac4ed4_invokedynamic568_1860() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11976_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8bf83bbab01e_invokedynamic6189_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_92035f483beb_invokedynamic10086_12(java.lang.String a0) throws E;
}
