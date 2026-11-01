package net.minecraft.client;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Map;
public class Minecraft implements net.minecraft.util.IThreadListener, net.minecraft.profiler.IPlayerUsage {

public static boolean a;

private static org.apache.logging.log4j.Logger b;

private static moom.DD c;

private static java.util.List<org.lwjgl.opengl.DisplayMode> d;

public static byte[] e;

private static net.minecraft.client.Minecraft f;

private static int g;

public java.io.File h;

public moom.C3 i;

public moom.A9 j;

public moom.oK k;

public moom.DM l;

private java.io.File m;

private com.mojang.authlib.properties.PropertyMap n;

private com.mojang.authlib.properties.PropertyMap o;

private boolean p;

private net.minecraft.profiler.PlayerUsageSnooper q;

private int r;

private int s;

private java.io.File t;

private java.lang.String u;

private java.net.Proxy v;

private boolean w;

private boolean x;

private net.minecraft.client.resources.data.IMetadataSerializer y;

private java.util.List<net.minecraft.client.resources.IResourcePack> z;

private com.mojang.authlib.minecraft.MinecraftSessionService A;

private java.util.Queue<java.util.concurrent.FutureTask<?>> B;

private long C;

private java.lang.Thread D;

private java.util.Queue<java.lang.Runnable> E;

public moom.jI F;

public int G;

public int H;

public net.minecraft.client.multiplayer.WorldClient I;

public net.minecraft.client.renderer.RenderGlobal J;

public net.minecraft.client.entity.EntityPlayerSP K;

public net.minecraft.entity.Entity L;

public net.minecraft.client.particle.EffectRenderer M;

public net.minecraft.client.gui.FontRenderer N;

public net.minecraft.client.gui.FontRenderer O;

public net.minecraft.client.gui.GuiScreen P;

public moom.fL Q;

public net.minecraft.client.renderer.EntityRenderer R;

public moom.hK S;

public net.minecraft.client.gui.GuiIngame T;

public boolean U;

public net.minecraft.util.MovingObjectPosition V;

public net.minecraft.client.settings.GameSettings W;

public moom.Dt X;

public boolean Y;

public java.lang.String Z;

public boolean aa;

public boolean ab;

public boolean ac;

public boolean ad;

long ae;

long af;

volatile boolean ag;

long ah;

int ai;

long aj;

private net.minecraft.util.Session ak;

private moom.jL al;

private net.minecraft.client.renderer.texture.TextureManager am;

private boolean an;

private boolean ao;

private moom.qY ap;

private boolean aq;

private net.minecraft.client.renderer.entity.RenderManager ar;

private net.minecraft.client.renderer.entity.RenderItem as;

private moom.lm at;

private net.minecraft.entity.Entity au;

private boolean av;

private com.moon.module.impl.AutoClicker aw;

public int ax;

private net.minecraft.server.integrated.IntegratedServer ay;

private net.minecraft.world.storage.ISaveFormat az;

public int aA;

private java.lang.String aB;

private int aC;

private int aD;

private net.minecraft.network.NetworkManager aE;

private boolean aF;

private long aG;

private moom.oP aH;

private net.minecraft.client.resources.ResourcePackRepository aI;

private net.minecraft.client.resources.LanguageManager aJ;

private net.minecraft.client.shader.Framebuffer aK;

private net.minecraft.client.renderer.texture.TextureMap aL;

private net.minecraft.client.audio.SoundHandler aM;

private moom.fS aN;

private moom.DD aO;

private moom.o6 aP;

private net.minecraft.client.resources.model.ModelManager aQ;

private net.minecraft.client.renderer.BlockRendererDispatcher aR;

private java.lang.String aS;

private com.moon.nW aT;

private java.lang.Thread aU;

private static int[] aV;

private static long cb;

private static long[] gb;

private static java.lang.Integer[] hb;

private static java.util.Map ib;

private static long[] jb;

private static java.lang.Long[] kb;

private static java.util.Map lb;

public Minecraft(moom.iJ p0) { super(); __sourceHandlerCall_96df789153caadd533ad(this, p0); }


static { __sourceHandlerCall_004e40c64fbe48e0a8d2(); }

private static native <E extends Throwable> void __sourceHandlerCall_004e40c64fbe48e0a8d2() throws E;
private static final class __SourceHandler_004e40c64fbe48e0a8d2 {

public static void f400019() throws Throwable {
    javax.crypto.Cipher forestValue400019_39_0;
    int forestValue400019_39_1;
    javax.crypto.SecretKeyFactory forestValue400019_39_2;
    byte[] forestValue400019_39_3;
    javax.crypto.Cipher forestValue400019_56_0;
    int forestValue400019_56_1;
    javax.crypto.SecretKeyFactory forestValue400019_56_2;
    byte[] forestValue400019_56_3;
    long[] forestValue400019_160_0;
    int forestValue400019_160_1;
    long forestValue400019_160_2;
    int forestValue400019_160_3;
    long[] forestValue400019_303_0;
    int forestValue400019_303_1;
    long forestValue400019_303_2;
    long[] forestValue400019_315_0;
    int forestValue400019_315_1;
    long forestValue400019_315_2;
    javax.crypto.Cipher forestValue400019_431_0;
    int forestValue400019_431_1;
    javax.crypto.SecretKeyFactory forestValue400019_431_2;
    byte[] forestValue400019_431_3;
    javax.crypto.Cipher forestValue400019_448_0;
    int forestValue400019_448_1;
    javax.crypto.SecretKeyFactory forestValue400019_448_2;
    byte[] forestValue400019_448_3;
    long[] forestValue400019_552_0;
    int forestValue400019_552_1;
    long forestValue400019_552_2;
    int forestValue400019_552_3;
    long[] forestValue400019_695_0;
    int forestValue400019_695_1;
    long forestValue400019_695_2;
    long[] forestValue400019_707_0;
    int forestValue400019_707_1;
    long forestValue400019_707_2;
    int forestValue400019_805_0;
    int[] spill400019_0;
    javax.crypto.Cipher spill400019_1;
    int spill400019_2;
    javax.crypto.SecretKeyFactory spill400019_3;
    byte[] spill400019_4;
    byte[] spill400019_5;
    java.lang.String spill400019_6;
    int spill400019_7;
    int spill400019_8;
    long spill400019_9;
    long spill400019_10;
    int spill400019_11;
    java.lang.String spill400019_12;
    int spill400019_13;
    long[] spill400019_14;
    int spill400019_15;
    long spill400019_16;
    int spill400019_17;
    javax.crypto.Cipher spill400019_18;
    int spill400019_19;
    javax.crypto.SecretKeyFactory spill400019_20;
    byte[] spill400019_21;
    byte[] spill400019_22;
    java.lang.String spill400019_23;
    int spill400019_24;
    int spill400019_25;
    long spill400019_26;
    long spill400019_27;
    int spill400019_28;
    java.lang.String spill400019_29;
    int spill400019_30;
    long[] spill400019_31;
    int spill400019_32;
    long spill400019_33;
    int spill400019_34;
    long life22_11;
    javax.crypto.Cipher life11_23;
    int life12_38;
    long[] life17_69;
    int life14_71;
    java.lang.String life15_74;
    int life16_76;
    int life13_78;
    byte[] life18_86;
    long life19_163;
    byte[] life21_231;
    byte[] life18_328;
    javax.crypto.Cipher life0_417;
    int life1_432;
    long[] life6_463;
    int life3_465;
    java.lang.String life4_468;
    int life5_470;
    int life2_472;
    byte[] life7_480;
    long life8_557;
    byte[] life10_625;
    byte[] life7_722;
    forest_join_805: {
    forest_join_804: {
    forest_join_794: {
    forest_join_448: {
    forest_join_402: {
    forest_join_56: {
    __fieldWrite400019_4(__call400019_3(__call400019_2(4903335263384110660L, 2549358314462119641L, __call400019_1(__call400019_0())), 194490522260812L));
    life22_11 = (__fieldRead400019_5() ^ 533899452564L);
    spill400019_0 = new int[3];
    __fieldWrite400019_6(new java.util.HashMap(13));
    __call400019_7(spill400019_0);
    spill400019_1 = (life11_23 = __call400019_8("DES/CBC/NoPadding"));
    spill400019_2 = 2;
    spill400019_3 = __call400019_9("DES");
    byte[] __stackOp400019_10_0 = new byte[8];
    spill400019_4 = __stackOp400019_10_0;
    (__stackOp400019_10_0)[0] = ((byte) ((int) (life22_11 >>> 56)));
    life12_38 = 1;
    forestValue400019_39_0 = spill400019_1;
    forestValue400019_39_1 = spill400019_2;
    forestValue400019_39_2 = spill400019_3;
    forestValue400019_39_3 = spill400019_4;
    forest_cycle_39: while (true) {
    if (!((life12_38 < 8))) {
        forestValue400019_56_0 = forestValue400019_39_0;
        forestValue400019_56_1 = forestValue400019_39_1;
        forestValue400019_56_2 = forestValue400019_39_2;
        forestValue400019_56_3 = forestValue400019_39_3;
        break forest_join_56;
    }
    byte[] __stackOp400019_11_0 = forestValue400019_39_3;
    spill400019_5 = __stackOp400019_11_0;
    (__stackOp400019_11_0)[life12_38] = ((byte) ((int) ((life22_11 << (life12_38 * 8)) >>> 56)));
    life12_38 += 1;
    forestValue400019_39_3 = spill400019_5;
    continue forest_cycle_39;
    }
    }
    __call400019_13(forestValue400019_56_0, forestValue400019_56_1, __call400019_12(forestValue400019_56_2, new javax.crypto.spec.DESKeySpec(forestValue400019_56_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life17_69 = new long[86];
    life14_71 = 0;
    life16_76 = __call400019_14((life15_74 = "Ü5ÔvüO\0252\022.Ù\020r\024¸\030î¦q¬ä ·\025Ãø(¶\002ÕÖí2r/[\fB\n\b\t[0þJ*Ït\023l·\020)&¿cüô§?\036_úè,Ä½\000ÂÝ>\rÌ÷=º»\0273Ç%p²@Ì\021|ñ½6Ïø'E\034F»phhðd¼õ¿Ob}jÆUEºào\022¾,l³T$êÑû@=º)W°®9©É=xs&Ñ:ûfd\006hìnß.|^.Ìe¡Òù½Ýêoe&´Øt\nëi5QàK'ëB¿ImÙ¸eâ±ë¡AT`E:\"`w@îi\004Õ\\o\034\032ù\tQîÀWQ#\031sÓ¼^Ü$e¿µÛH{¶\032KÛxDðtè^\\Zÿý\002\rtÜÂ\\÷­_®CÓr:Tò\026ß­\"Ãr-A×È\034Ý}ªh\bU¥K!¸k×\002U¬\023÷Á¼R\np¬:ù1Ó/·Ì\tèÞcÇ<Òæwú\n\017\0372¸\\Æ\034Ë\bú<í9­<\035Éær6T¿iØ¥\177ÊX±1\026QC©C|Æ\f¸DW5¬+mA*òJ«'bÒ \f=2ÐÒX2¦2\035õ2¸éÎ?\037´r» wÍÃ¸¢\006\bcµ\013¼°ÈI\021uÎ\024£ÑY\023Ro\022\025®Kj<\007Ö?¯ðÎç¶ïÆ-+»\016ÛAýüÎ\034}o\000\002{\t¿@ç¯Âúg¯\004­õqü/\030Lð¢#¹äÇY°öÌ\001\030\032ç\032\017ck »B¦G\005káÖÌ×\001bÓ¯CÚÚÁqAdÿÞ\1774M1óQ9\023ÉEð\f_ýÁëÎ}\006ÓÔ\021A[\030À9éZélÄÙe§vÝ\0174K±#JÃ \017×\\(ó_\001XçÛLÆ);¶%WX¤\\K-/5lv\177w\003#@j6ï.û;@o·Ivb2ãÀn:i´Å\001g«ÞéÌ"));
    life13_78 = 0;
    forest_cycle_79: while (true) {
    spill400019_6 = life15_74;
    spill400019_7 = life13_78;
    life13_78 += 8;
    life18_86 = __call400019_16(__call400019_15(spill400019_6, spill400019_7, life13_78), "ISO-8859-1");
    forestValue400019_160_0 = life17_69;
    forestValue400019_160_1 = (life14_71++);
    forestValue400019_160_2 = (((((((((((long) (life18_86)[0]) & 255L) << 56) | ((((long) (life18_86)[1]) & 255L) << 48)) | ((((long) (life18_86)[2]) & 255L) << 40)) | ((((long) (life18_86)[3]) & 255L) << 32)) | ((((long) (life18_86)[4]) & 255L) << 24)) | ((((long) (life18_86)[5]) & 255L) << 16)) | ((((long) (life18_86)[6]) & 255L) << 8)) | (((long) (life18_86)[7]) & 255L));
    forestValue400019_160_3 = -1;
    forest_cycle_160: while (true) {
    forest_join_320: {
    forest_join_315: {
    forest_join_303: {
    long __stackOp400019_17_0 = forestValue400019_160_2;
    int __stackOp400019_17_1 = forestValue400019_160_3;
    spill400019_8 = __stackOp400019_17_1;
    spill400019_9 = __stackOp400019_17_0;
    __discardScalar400019_18(__stackOp400019_17_1);
    life19_163 = spill400019_9;
    byte[] __stackOp400019_19_0 = new byte[] {((byte) ((int) (life19_163 >>> 56))), ((byte) ((int) (life19_163 >>> 48))), ((byte) ((int) (life19_163 >>> 40))), ((byte) ((int) (life19_163 >>> 32))), ((byte) ((int) (life19_163 >>> 24))), ((byte) ((int) (life19_163 >>> 16))), ((byte) ((int) (life19_163 >>> 8))), ((byte) ((int) life19_163))};
    javax.crypto.Cipher __stackOp400019_19_1 = life11_23;
    life21_231 = __call400019_20(__stackOp400019_19_1, __stackOp400019_19_0);
    int __stackOp400019_21_0 = spill400019_8;
    long __stackOp400019_21_1 = (((((((((((long) (life21_231)[0]) & 255L) << 56) | ((((long) (life21_231)[1]) & 255L) << 48)) | ((((long) (life21_231)[2]) & 255L) << 40)) | ((((long) (life21_231)[3]) & 255L) << 32)) | ((((long) (life21_231)[4]) & 255L) << 24)) | ((((long) (life21_231)[5]) & 255L) << 16)) | ((((long) (life21_231)[6]) & 255L) << 8)) | (((long) (life21_231)[7]) & 255L));
    spill400019_10 = __stackOp400019_21_1;
    spill400019_11 = __stackOp400019_21_0;
    __discardWide400019_22(__stackOp400019_21_1);
    switch (spill400019_11) {
default:
{
        forestValue400019_303_0 = forestValue400019_160_0;
        forestValue400019_303_1 = forestValue400019_160_1;
        forestValue400019_303_2 = spill400019_10;
        break forest_join_303;
    }
case 0:
{
        forestValue400019_315_0 = forestValue400019_160_0;
        forestValue400019_315_1 = forestValue400019_160_1;
        forestValue400019_315_2 = spill400019_10;
        break forest_join_315;
    }
}
    }
    (forestValue400019_303_0)[forestValue400019_303_1] = forestValue400019_303_2;
    if (!((life13_78 >= life16_76))) {
        continue forest_cycle_79;
    }
    life16_76 = __call400019_23((life15_74 = "Ç\030Úßö,MÚc¤¨hç^O"));
    life13_78 = 0;
    break forest_join_320;
    }
    (forestValue400019_315_0)[forestValue400019_315_1] = forestValue400019_315_2;
    if (!((life13_78 >= life16_76))) {
        break forest_join_320;
    }
    break forest_join_402;
    }
    spill400019_12 = life15_74;
    spill400019_13 = life13_78;
    life13_78 += 8;
    life18_328 = __call400019_25(__call400019_24(spill400019_12, spill400019_13, life13_78), "ISO-8859-1");
    spill400019_14 = life17_69;
    spill400019_15 = (life14_71++);
    spill400019_16 = (((((((((((long) (life18_328)[0]) & 255L) << 56) | ((((long) (life18_328)[1]) & 255L) << 48)) | ((((long) (life18_328)[2]) & 255L) << 40)) | ((((long) (life18_328)[3]) & 255L) << 32)) | ((((long) (life18_328)[4]) & 255L) << 24)) | ((((long) (life18_328)[5]) & 255L) << 16)) | ((((long) (life18_328)[6]) & 255L) << 8)) | (((long) (life18_328)[7]) & 255L));
    spill400019_17 = 0;
    forestValue400019_160_0 = spill400019_14;
    forestValue400019_160_1 = spill400019_15;
    forestValue400019_160_2 = spill400019_16;
    forestValue400019_160_3 = spill400019_17;
    continue forest_cycle_160;
    }
    }
    }
    __fieldWrite400019_26(life17_69);
    __fieldWrite400019_27(new java.lang.Integer[86]);
    __fieldWrite400019_28(new java.util.HashMap(13));
    spill400019_18 = (life0_417 = __call400019_29("DES/CBC/NoPadding"));
    spill400019_19 = 2;
    spill400019_20 = __call400019_30("DES");
    byte[] __stackOp400019_31_0 = new byte[8];
    spill400019_21 = __stackOp400019_31_0;
    (__stackOp400019_31_0)[0] = ((byte) ((int) (life22_11 >>> 56)));
    life1_432 = 1;
    forestValue400019_431_0 = spill400019_18;
    forestValue400019_431_1 = spill400019_19;
    forestValue400019_431_2 = spill400019_20;
    forestValue400019_431_3 = spill400019_21;
    forest_cycle_431: while (true) {
    if (!((life1_432 < 8))) {
        forestValue400019_448_0 = forestValue400019_431_0;
        forestValue400019_448_1 = forestValue400019_431_1;
        forestValue400019_448_2 = forestValue400019_431_2;
        forestValue400019_448_3 = forestValue400019_431_3;
        break forest_join_448;
    }
    byte[] __stackOp400019_32_0 = forestValue400019_431_3;
    spill400019_22 = __stackOp400019_32_0;
    (__stackOp400019_32_0)[life1_432] = ((byte) ((int) ((life22_11 << (life1_432 * 8)) >>> 56)));
    life1_432 += 1;
    forestValue400019_431_3 = spill400019_22;
    continue forest_cycle_431;
    }
    }
    __call400019_34(forestValue400019_448_0, forestValue400019_448_1, __call400019_33(forestValue400019_448_2, new javax.crypto.spec.DESKeySpec(forestValue400019_448_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life6_463 = new long[11];
    life3_465 = 0;
    life5_470 = __call400019_35((life4_468 = "ï]QeÝ\030\035|\021\024\036äØz\013ÅÓ|\000Î¹@¤Föûî·ôÕeéù_:~Å?\006c <×&4ÕfµM{hÅko\bæ®"));
    life2_472 = 0;
    forest_cycle_471: while (true) {
    spill400019_23 = life4_468;
    spill400019_24 = life2_472;
    life2_472 += 8;
    life7_480 = __call400019_37(__call400019_36(spill400019_23, spill400019_24, life2_472), "ISO-8859-1");
    forestValue400019_552_0 = life6_463;
    forestValue400019_552_1 = (life3_465++);
    forestValue400019_552_2 = (((((((((((long) (life7_480)[0]) & 255L) << 56) | ((((long) (life7_480)[1]) & 255L) << 48)) | ((((long) (life7_480)[2]) & 255L) << 40)) | ((((long) (life7_480)[3]) & 255L) << 32)) | ((((long) (life7_480)[4]) & 255L) << 24)) | ((((long) (life7_480)[5]) & 255L) << 16)) | ((((long) (life7_480)[6]) & 255L) << 8)) | (((long) (life7_480)[7]) & 255L));
    forestValue400019_552_3 = -1;
    forest_cycle_552: while (true) {
    forest_join_712: {
    forest_join_707: {
    forest_join_695: {
    long __stackOp400019_38_0 = forestValue400019_552_2;
    int __stackOp400019_38_1 = forestValue400019_552_3;
    spill400019_25 = __stackOp400019_38_1;
    spill400019_26 = __stackOp400019_38_0;
    __discardScalar400019_39(__stackOp400019_38_1);
    life8_557 = spill400019_26;
    byte[] __stackOp400019_40_0 = new byte[] {((byte) ((int) (life8_557 >>> 56))), ((byte) ((int) (life8_557 >>> 48))), ((byte) ((int) (life8_557 >>> 40))), ((byte) ((int) (life8_557 >>> 32))), ((byte) ((int) (life8_557 >>> 24))), ((byte) ((int) (life8_557 >>> 16))), ((byte) ((int) (life8_557 >>> 8))), ((byte) ((int) life8_557))};
    javax.crypto.Cipher __stackOp400019_40_1 = life0_417;
    life10_625 = __call400019_41(__stackOp400019_40_1, __stackOp400019_40_0);
    int __stackOp400019_42_0 = spill400019_25;
    long __stackOp400019_42_1 = (((((((((((long) (life10_625)[0]) & 255L) << 56) | ((((long) (life10_625)[1]) & 255L) << 48)) | ((((long) (life10_625)[2]) & 255L) << 40)) | ((((long) (life10_625)[3]) & 255L) << 32)) | ((((long) (life10_625)[4]) & 255L) << 24)) | ((((long) (life10_625)[5]) & 255L) << 16)) | ((((long) (life10_625)[6]) & 255L) << 8)) | (((long) (life10_625)[7]) & 255L));
    spill400019_27 = __stackOp400019_42_1;
    spill400019_28 = __stackOp400019_42_0;
    __discardWide400019_43(__stackOp400019_42_1);
    switch (spill400019_28) {
default:
{
        forestValue400019_695_0 = forestValue400019_552_0;
        forestValue400019_695_1 = forestValue400019_552_1;
        forestValue400019_695_2 = spill400019_27;
        break forest_join_695;
    }
case 0:
{
        forestValue400019_707_0 = forestValue400019_552_0;
        forestValue400019_707_1 = forestValue400019_552_1;
        forestValue400019_707_2 = spill400019_27;
        break forest_join_707;
    }
}
    }
    (forestValue400019_695_0)[forestValue400019_695_1] = forestValue400019_695_2;
    if (!((life2_472 >= life5_470))) {
        continue forest_cycle_471;
    }
    life5_470 = __call400019_44((life4_468 = "&ôuÖ|é\022ï´¹3q"));
    life2_472 = 0;
    break forest_join_712;
    }
    (forestValue400019_707_0)[forestValue400019_707_1] = forestValue400019_707_2;
    if (!((life2_472 >= life5_470))) {
        break forest_join_712;
    }
    break forest_join_794;
    }
    spill400019_29 = life4_468;
    spill400019_30 = life2_472;
    life2_472 += 8;
    life7_722 = __call400019_46(__call400019_45(spill400019_29, spill400019_30, life2_472), "ISO-8859-1");
    spill400019_31 = life6_463;
    spill400019_32 = (life3_465++);
    spill400019_33 = (((((((((((long) (life7_722)[0]) & 255L) << 56) | ((((long) (life7_722)[1]) & 255L) << 48)) | ((((long) (life7_722)[2]) & 255L) << 40)) | ((((long) (life7_722)[3]) & 255L) << 32)) | ((((long) (life7_722)[4]) & 255L) << 24)) | ((((long) (life7_722)[5]) & 255L) << 16)) | ((((long) (life7_722)[6]) & 255L) << 8)) | (((long) (life7_722)[7]) & 255L));
    spill400019_34 = 0;
    forestValue400019_552_0 = spill400019_31;
    forestValue400019_552_1 = spill400019_32;
    forestValue400019_552_2 = spill400019_33;
    forestValue400019_552_3 = spill400019_34;
    continue forest_cycle_552;
    }
    }
    }
    __fieldWrite400019_47(life6_463);
    __fieldWrite400019_48(new java.lang.Long[11]);
    if (!((__call400019_49() == __fieldRead400019_50()))) {
        break forest_join_804;
    }
    forestValue400019_805_0 = 1;
    break forest_join_805;
    }
    forestValue400019_805_0 = 0;
    }
    __fieldWrite400019_51(forestValue400019_805_0);
    __fieldWrite400019_53(__call400019_52());
    __fieldWrite400019_54(new moom.DD("textures/gui/title/mojang.png"));
    __fieldWrite400019_60(__call400019_59(new org.lwjgl.opengl.DisplayMode[] {new org.lwjgl.opengl.DisplayMode(__invokedynamic400019_55(19811, (1085600943160388150L ^ life22_11)), __invokedynamic400019_56(14754, (6245471384528002706L ^ life22_11))), new org.lwjgl.opengl.DisplayMode(__invokedynamic400019_57(26314, (7770993693120840173L ^ life22_11)), __invokedynamic400019_58(22318, (4592223715190075432L ^ life22_11)))}));
    __fieldWrite400019_62(new byte[__invokedynamic400019_61(1604, (161362511382028615L ^ life22_11))]);
    return;
}
public static void h400019_0(moom.Oo p0) throws Throwable {
    throw __call43001900_0(p0);
}
private static native java.lang.invoke.MethodHandles.Lookup __call400019_0() throws Throwable;
private static native java.lang.Class __call400019_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call400019_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call400019_3(moom._a a0, long a1) throws Throwable;
private static native void __fieldWrite400019_4(long a0) throws Throwable;
private static native long __fieldRead400019_5() throws Throwable;
private static native void __fieldWrite400019_6(java.util.HashMap a0) throws Throwable;
private static native void __call400019_7(int[] a0) throws Throwable;
private static native javax.crypto.Cipher __call400019_8(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call400019_9(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call400019_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call400019_13(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call400019_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __call400019_15(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call400019_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar400019_18(int a0) throws Throwable;
private static native byte[] __call400019_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide400019_22(long a0) throws Throwable;
private static native int __call400019_23(java.lang.String a0) throws Throwable;
private static native java.lang.String __call400019_24(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call400019_25(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite400019_26(long[] a0) throws Throwable;
private static native void __fieldWrite400019_27(java.lang.Integer[] a0) throws Throwable;
private static native void __fieldWrite400019_28(java.util.HashMap a0) throws Throwable;
private static native javax.crypto.Cipher __call400019_29(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call400019_30(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call400019_33(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call400019_34(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call400019_35(java.lang.String a0) throws Throwable;
private static native java.lang.String __call400019_36(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call400019_37(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar400019_39(int a0) throws Throwable;
private static native byte[] __call400019_41(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide400019_43(long a0) throws Throwable;
private static native int __call400019_44(java.lang.String a0) throws Throwable;
private static native java.lang.String __call400019_45(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call400019_46(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite400019_47(long[] a0) throws Throwable;
private static native void __fieldWrite400019_48(java.lang.Long[] a0) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __call400019_49() throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead400019_50() throws Throwable;
private static native void __fieldWrite400019_51(int a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __call400019_52() throws Throwable;
private static native void __fieldWrite400019_53(org.apache.logging.log4j.Logger a0) throws Throwable;
private static native void __fieldWrite400019_54(moom.DD a0) throws Throwable;
private static native int __invokedynamic400019_55(int a0, long a1) throws Throwable;
private static native int __invokedynamic400019_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic400019_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic400019_58(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call400019_59(org.lwjgl.opengl.DisplayMode[] a0) throws Throwable;
private static native void __fieldWrite400019_60(java.util.ArrayList a0) throws Throwable;
private static native int __invokedynamic400019_61(int a0, long a1) throws Throwable;
private static native void __fieldWrite400019_62(byte[] a0) throws Throwable;
private static native java.lang.Throwable __call43001900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_96df789153caadd533ad(net.minecraft.client.Minecraft a0, moom.iJ a1) throws E;
private static final class __SourceHandler_96df789153caadd533ad {

public static void f526(net.minecraft.client.Minecraft receiver, moom.iJ p0) throws Throwable {
    net.minecraft.client.Minecraft forwardValue526_168_0;
    net.minecraft.client.Minecraft forwardValue526_170_0;
    net.minecraft.client.main.GameConfiguration$UserInformation forwardValue526_170_1;
    net.minecraft.client.Minecraft forwardValue526_171_0;
    java.net.Proxy forwardValue526_171_1;
    net.minecraft.client.Minecraft forwardValue526_215_0;
    int forwardValue526_215_1;
    net.minecraft.client.Minecraft forwardValue526_216_0;
    net.minecraft.client.Minecraft forwardValue526_217_0;
    int forwardValue526_217_1;
    net.minecraft.client.Minecraft forwardValue526_228_0;
    int forwardValue526_228_1;
    net.minecraft.client.Minecraft forwardValue526_229_0;
    net.minecraft.client.Minecraft forwardValue526_230_0;
    int forwardValue526_230_1;
    int[] spill526_0;
    net.minecraft.client.Minecraft spill526_1;
    net.minecraft.client.main.GameConfiguration$UserInformation spill526_2;
    net.minecraft.client.Minecraft spill526_3;
    int spill526_4;
    net.minecraft.client.Minecraft spill526_5;
    int spill526_6;
    long life2_3;
    int[] life4_90;
    forward_join_279: {
    forward_join_274: {
    forward_join_271: {
    forward_join_230: {
    forward_join_229: {
    forward_join_228: {
    forward_join_217: {
    forward_join_216: {
    forward_join_215: {
    forward_join_171: {
    forward_join_170: {
    forward_join_168: {
    life2_3 = (__fieldRead526_0() ^ 63028998975798L);
    __directSuperInit526_1(receiver);
    __fieldWrite526_2(receiver, new moom.C3());
    __fieldWrite526_3(receiver, new moom.A9());
    __fieldWrite526_4(receiver, new moom.DM(0x1.4p4f));
    __fieldWrite526_5(receiver, 1);
    __fieldWrite526_7(receiver, new net.minecraft.profiler.PlayerUsageSnooper("client", receiver, __call526_6()));
    __fieldWrite526_8(receiver, new net.minecraft.client.resources.data.IMetadataSerializer());
    __fieldWrite526_10(receiver, __call526_9());
    __fieldWrite526_12(receiver, __call526_11());
    __fieldWrite526_13(receiver, 0L);
    __fieldWrite526_15(receiver, __call526_14());
    __fieldWrite526_16(receiver, new java.util.ArrayDeque());
    spill526_0 = __call526_17();
    __fieldWrite526_18(receiver, "");
    __fieldWrite526_19(receiver, 0);
    __fieldWrite526_20(receiver, 0);
    __fieldWrite526_21(receiver, 0);
    __fieldWrite526_22(receiver, 1);
    __fieldWrite526_24(receiver, __call526_23());
    __fieldWrite526_26(receiver, __call526_25());
    __fieldWrite526_27(receiver, 1);
    __fieldWrite526_29(receiver, __call526_28());
    __fieldWrite526_31(receiver, __invokedynamic526_30(22974, (6955044472826958034L ^ life2_3)));
    life4_90 = spill526_0;
    __fieldWrite526_32(receiver, 0);
    __fieldWrite526_34(receiver, __invokedynamic526_33(22974, (6955044472826958034L ^ life2_3)));
    __fieldWrite526_35(receiver, "root");
    __fieldWrite526_36(receiver, new com.moon.nW());
    __fieldWrite526_37(receiver, null);
    __fieldWrite526_38(receiver);
    __fieldWrite526_41(receiver, __fieldRead526_40(__fieldRead526_39(p0)));
    __fieldWrite526_44(receiver, __fieldRead526_43(__fieldRead526_42(p0)));
    __fieldWrite526_47(receiver, __fieldRead526_46(__fieldRead526_45(p0)));
    __fieldWrite526_50(receiver, __fieldRead526_49(__fieldRead526_48(p0)));
    __fieldWrite526_53(receiver, __fieldRead526_52(__fieldRead526_51(p0)));
    __fieldWrite526_56(receiver, __fieldRead526_55(__fieldRead526_54(p0)));
    __fieldWrite526_62(receiver, new moom.oK(__call526_61(new moom.oX(__fieldRead526_58(__fieldRead526_57(p0)), __fieldRead526_60(__fieldRead526_59(p0))))));
    spill526_1 = receiver;
    spill526_2 = __fieldRead526_63(p0);
    if (!((life4_90 != null))) {
        forwardValue526_170_0 = spill526_1;
        forwardValue526_170_1 = spill526_2;
        break forward_join_170;
    }
    if (!((__fieldRead526_64(spill526_2) == null))) {
        forwardValue526_168_0 = spill526_1;
        break forward_join_168;
    }
    forwardValue526_171_0 = spill526_1;
    forwardValue526_171_1 = __fieldRead526_65();
    break forward_join_171;
    }
    forwardValue526_170_0 = forwardValue526_168_0;
    forwardValue526_170_1 = __fieldRead526_66(p0);
    }
    forwardValue526_171_0 = forwardValue526_170_0;
    forwardValue526_171_1 = __fieldRead526_67(forwardValue526_170_1);
    }
    __fieldWrite526_68(forwardValue526_171_0, forwardValue526_171_1);
    __fieldWrite526_74(receiver, __call526_73(new com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService(__fieldRead526_70(__fieldRead526_69(p0)), __call526_72(__call526_71()))));
    __fieldWrite526_77(receiver, __fieldRead526_76(__fieldRead526_75(p0)));
    __call526_82(__fieldRead526_78(), __invokedynamic526_81(__call526_80(__fieldRead526_79(receiver))));
    __call526_87(__fieldRead526_83(), __invokedynamic526_86(__call526_85(__fieldRead526_84(receiver))));
    __fieldWrite526_90(receiver, __fieldRead526_89(__fieldRead526_88(p0)));
    spill526_3 = receiver;
    spill526_4 = __fieldRead526_92(__fieldRead526_91(p0));
    if (!((life4_90 != null))) {
        forwardValue526_215_0 = spill526_3;
        forwardValue526_215_1 = spill526_4;
        break forward_join_215;
    }
    if (!((spill526_4 > 0))) {
        forwardValue526_216_0 = spill526_3;
        break forward_join_216;
    }
    forwardValue526_215_0 = spill526_3;
    forwardValue526_215_1 = __fieldRead526_94(__fieldRead526_93(p0));
    }
    forwardValue526_217_0 = forwardValue526_215_0;
    forwardValue526_217_1 = forwardValue526_215_1;
    break forward_join_217;
    }
    forwardValue526_217_0 = forwardValue526_216_0;
    forwardValue526_217_1 = 1;
    }
    __fieldWrite526_95(forwardValue526_217_0, forwardValue526_217_1);
    spill526_5 = receiver;
    spill526_6 = __fieldRead526_97(__fieldRead526_96(p0));
    if (!((life4_90 != null))) {
        forwardValue526_228_0 = spill526_5;
        forwardValue526_228_1 = spill526_6;
        break forward_join_228;
    }
    if (!((spill526_6 > 0))) {
        forwardValue526_229_0 = spill526_5;
        break forward_join_229;
    }
    forwardValue526_228_0 = spill526_5;
    forwardValue526_228_1 = __fieldRead526_99(__fieldRead526_98(p0));
    }
    forwardValue526_230_0 = forwardValue526_228_0;
    forwardValue526_230_1 = forwardValue526_228_1;
    break forward_join_230;
    }
    forwardValue526_230_0 = forwardValue526_229_0;
    forwardValue526_230_1 = 1;
    }
    __fieldWrite526_100(forwardValue526_230_0, forwardValue526_230_1);
    __fieldWrite526_103(receiver, __fieldRead526_102(__fieldRead526_101(p0)));
    __fieldWrite526_106(receiver, __fieldRead526_105(__fieldRead526_104(p0)));
    __fieldWrite526_109(receiver, __fieldRead526_108(__fieldRead526_107(p0)));
    __fieldWrite526_111(receiver, __call526_110());
    __fieldWrite526_112(receiver, new net.minecraft.server.integrated.IntegratedServer(receiver));
    if (!((life4_90 != null))) {
        break forward_join_274;
    }
    if (!((__fieldRead526_114(__fieldRead526_113(p0)) != null))) {
        break forward_join_271;
    }
    __fieldWrite526_117(receiver, __fieldRead526_116(__fieldRead526_115(p0)));
    __fieldWrite526_120(receiver, __fieldRead526_119(__fieldRead526_118(p0)));
    }
    __call526_121(0);
    __call526_122();
    }
    if (!((__call526_123() != null))) {
        break forward_join_279;
    }
    __call526_124(new int[3]);
    }
    return;
}
public static void h526_0(moom.Oo p0) throws Throwable {
    throw __call3052600_0(p0);
}
public static void h526_1(moom.Oo p0) throws Throwable {
    throw __call3052601_0(p0);
}
public static void h526_2(moom.Oo p0) throws Throwable {
    throw __call3052602_0(p0);
}
public static void h526_3(moom.Oo p0) throws Throwable {
    throw __call3052603_0(p0);
}
public static void h526_4(moom.Oo p0) throws Throwable {
    throw __call3052604_0(p0);
}
public static void h526_5(moom.Oo p0) throws Throwable {
    throw __call3052605_0(p0);
}
public static void h526_6(moom.Oo p0) throws Throwable {
    throw __call3052606_0(p0);
}
public static void h526_7(moom.Oo p0) throws Throwable {
    throw __call3052607_0(p0);
}
public static void h526_8(moom.Oo p0) throws Throwable {
    throw __call3052608_0(p0);
}
private static native long __fieldRead526_0() throws Throwable;
private static native void __directSuperInit526_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite526_2(net.minecraft.client.Minecraft a0, moom.C3 a1) throws Throwable;
private static native void __fieldWrite526_3(net.minecraft.client.Minecraft a0, moom.A9 a1) throws Throwable;
private static native void __fieldWrite526_4(net.minecraft.client.Minecraft a0, moom.DM a1) throws Throwable;
private static native void __fieldWrite526_5(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native long __call526_6() throws Throwable;
private static native void __fieldWrite526_7(net.minecraft.client.Minecraft a0, net.minecraft.profiler.PlayerUsageSnooper a1) throws Throwable;
private static native void __fieldWrite526_8(net.minecraft.client.Minecraft a0, net.minecraft.client.resources.data.IMetadataSerializer a1) throws Throwable;
private static native java.util.ArrayList __call526_9() throws Throwable;
private static native void __fieldWrite526_10(net.minecraft.client.Minecraft a0, java.util.ArrayList a1) throws Throwable;
private static native java.util.ArrayDeque __call526_11() throws Throwable;
private static native void __fieldWrite526_12(net.minecraft.client.Minecraft a0, java.util.ArrayDeque a1) throws Throwable;
private static native void __fieldWrite526_13(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native java.lang.Thread __call526_14() throws Throwable;
private static native void __fieldWrite526_15(net.minecraft.client.Minecraft a0, java.lang.Thread a1) throws Throwable;
private static native void __fieldWrite526_16(net.minecraft.client.Minecraft a0, java.util.ArrayDeque a1) throws Throwable;
private static native int[] __call526_17() throws Throwable;
private static native void __fieldWrite526_18(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite526_19(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native void __fieldWrite526_20(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native void __fieldWrite526_21(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native void __fieldWrite526_22(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native long __call526_23() throws Throwable;
private static native void __fieldWrite526_24(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native long __call526_25() throws Throwable;
private static native void __fieldWrite526_26(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native void __fieldWrite526_27(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native long __call526_28() throws Throwable;
private static native void __fieldWrite526_29(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native long __invokedynamic526_30(int a0, long a1) throws Throwable;
private static native void __fieldWrite526_31(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native void __fieldWrite526_32(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native long __invokedynamic526_33(int a0, long a1) throws Throwable;
private static native void __fieldWrite526_34(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native void __fieldWrite526_35(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite526_36(net.minecraft.client.Minecraft a0, com.moon.nW a1) throws Throwable;
private static native void __fieldWrite526_37(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite526_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$FolderInformation __fieldRead526_39(moom.iJ a0) throws Throwable;
private static native java.io.File __fieldRead526_40(net.minecraft.client.main.GameConfiguration$FolderInformation a0) throws Throwable;
private static native void __fieldWrite526_41(net.minecraft.client.Minecraft a0, java.io.File a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$FolderInformation __fieldRead526_42(moom.iJ a0) throws Throwable;
private static native java.io.File __fieldRead526_43(net.minecraft.client.main.GameConfiguration$FolderInformation a0) throws Throwable;
private static native void __fieldWrite526_44(net.minecraft.client.Minecraft a0, java.io.File a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$FolderInformation __fieldRead526_45(moom.iJ a0) throws Throwable;
private static native java.io.File __fieldRead526_46(net.minecraft.client.main.GameConfiguration$FolderInformation a0) throws Throwable;
private static native void __fieldWrite526_47(net.minecraft.client.Minecraft a0, java.io.File a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$GameInformation __fieldRead526_48(moom.iJ a0) throws Throwable;
private static native java.lang.String __fieldRead526_49(net.minecraft.client.main.GameConfiguration$GameInformation a0) throws Throwable;
private static native void __fieldWrite526_50(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$UserInformation __fieldRead526_51(moom.iJ a0) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __fieldRead526_52(net.minecraft.client.main.GameConfiguration$UserInformation a0) throws Throwable;
private static native void __fieldWrite526_53(net.minecraft.client.Minecraft a0, com.mojang.authlib.properties.PropertyMap a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$UserInformation __fieldRead526_54(moom.iJ a0) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __fieldRead526_55(net.minecraft.client.main.GameConfiguration$UserInformation a0) throws Throwable;
private static native void __fieldWrite526_56(net.minecraft.client.Minecraft a0, com.mojang.authlib.properties.PropertyMap a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$FolderInformation __fieldRead526_57(moom.iJ a0) throws Throwable;
private static native java.io.File __fieldRead526_58(net.minecraft.client.main.GameConfiguration$FolderInformation a0) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$FolderInformation __fieldRead526_59(moom.iJ a0) throws Throwable;
private static native java.lang.String __fieldRead526_60(net.minecraft.client.main.GameConfiguration$FolderInformation a0) throws Throwable;
private static native java.util.Map __call526_61(moom.oX a0) throws Throwable;
private static native void __fieldWrite526_62(net.minecraft.client.Minecraft a0, moom.oK a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$UserInformation __fieldRead526_63(moom.iJ a0) throws Throwable;
private static native java.net.Proxy __fieldRead526_64(net.minecraft.client.main.GameConfiguration$UserInformation a0) throws Throwable;
private static native java.net.Proxy __fieldRead526_65() throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$UserInformation __fieldRead526_66(moom.iJ a0) throws Throwable;
private static native java.net.Proxy __fieldRead526_67(net.minecraft.client.main.GameConfiguration$UserInformation a0) throws Throwable;
private static native void __fieldWrite526_68(net.minecraft.client.Minecraft a0, java.net.Proxy a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$UserInformation __fieldRead526_69(moom.iJ a0) throws Throwable;
private static native java.net.Proxy __fieldRead526_70(net.minecraft.client.main.GameConfiguration$UserInformation a0) throws Throwable;
private static native java.util.UUID __call526_71() throws Throwable;
private static native java.lang.String __call526_72(java.util.UUID a0) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __call526_73(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService a0) throws Throwable;
private static native void __fieldWrite526_74(net.minecraft.client.Minecraft a0, com.mojang.authlib.minecraft.MinecraftSessionService a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$UserInformation __fieldRead526_75(moom.iJ a0) throws Throwable;
private static native net.minecraft.util.Session __fieldRead526_76(net.minecraft.client.main.GameConfiguration$UserInformation a0) throws Throwable;
private static native void __fieldWrite526_77(net.minecraft.client.Minecraft a0, net.minecraft.util.Session a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead526_78() throws Throwable;
private static native net.minecraft.util.Session __fieldRead526_79(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call526_80(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __invokedynamic526_81(java.lang.String a0) throws Throwable;
private static native void __call526_82(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead526_83() throws Throwable;
private static native net.minecraft.util.Session __fieldRead526_84(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call526_85(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __invokedynamic526_86(java.lang.String a0) throws Throwable;
private static native void __call526_87(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$GameInformation __fieldRead526_88(moom.iJ a0) throws Throwable;
private static native boolean __fieldRead526_89(net.minecraft.client.main.GameConfiguration$GameInformation a0) throws Throwable;
private static native void __fieldWrite526_90(net.minecraft.client.Minecraft a0, boolean a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$DisplayInformation __fieldRead526_91(moom.iJ a0) throws Throwable;
private static native int __fieldRead526_92(net.minecraft.client.main.GameConfiguration$DisplayInformation a0) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$DisplayInformation __fieldRead526_93(moom.iJ a0) throws Throwable;
private static native int __fieldRead526_94(net.minecraft.client.main.GameConfiguration$DisplayInformation a0) throws Throwable;
private static native void __fieldWrite526_95(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$DisplayInformation __fieldRead526_96(moom.iJ a0) throws Throwable;
private static native int __fieldRead526_97(net.minecraft.client.main.GameConfiguration$DisplayInformation a0) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$DisplayInformation __fieldRead526_98(moom.iJ a0) throws Throwable;
private static native int __fieldRead526_99(net.minecraft.client.main.GameConfiguration$DisplayInformation a0) throws Throwable;
private static native void __fieldWrite526_100(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$DisplayInformation __fieldRead526_101(moom.iJ a0) throws Throwable;
private static native int __fieldRead526_102(net.minecraft.client.main.GameConfiguration$DisplayInformation a0) throws Throwable;
private static native void __fieldWrite526_103(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$DisplayInformation __fieldRead526_104(moom.iJ a0) throws Throwable;
private static native int __fieldRead526_105(net.minecraft.client.main.GameConfiguration$DisplayInformation a0) throws Throwable;
private static native void __fieldWrite526_106(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$DisplayInformation __fieldRead526_107(moom.iJ a0) throws Throwable;
private static native boolean __fieldRead526_108(net.minecraft.client.main.GameConfiguration$DisplayInformation a0) throws Throwable;
private static native void __fieldWrite526_109(net.minecraft.client.Minecraft a0, boolean a1) throws Throwable;
private static native boolean __call526_110() throws Throwable;
private static native void __fieldWrite526_111(net.minecraft.client.Minecraft a0, boolean a1) throws Throwable;
private static native void __fieldWrite526_112(net.minecraft.client.Minecraft a0, net.minecraft.server.integrated.IntegratedServer a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$ServerInformation __fieldRead526_113(moom.iJ a0) throws Throwable;
private static native java.lang.String __fieldRead526_114(net.minecraft.client.main.GameConfiguration$ServerInformation a0) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$ServerInformation __fieldRead526_115(moom.iJ a0) throws Throwable;
private static native java.lang.String __fieldRead526_116(net.minecraft.client.main.GameConfiguration$ServerInformation a0) throws Throwable;
private static native void __fieldWrite526_117(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.main.GameConfiguration$ServerInformation __fieldRead526_118(moom.iJ a0) throws Throwable;
private static native int __fieldRead526_119(net.minecraft.client.main.GameConfiguration$ServerInformation a0) throws Throwable;
private static native void __fieldWrite526_120(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native void __call526_121(int a0) throws Throwable;
private static native void __call526_122() throws Throwable;
private static native java.lang.String[] __call526_123() throws Throwable;
private static native void __call526_124(int[] a0) throws Throwable;
private static native java.lang.Throwable __call3052600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3052601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3052602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3052603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3052604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3052605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3052606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3052607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3052608_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_6bf1ded848dcd087d19b() throws E;
private static final class __SourceHandler_6bf1ded848dcd087d19b {

public static int f1253() throws Throwable {
    int lexicalValue1253_65_0;
    int lexicalValue1253_69_0;
    int[] spill1253_0;
    int spill1253_1;
    long life0_3;
    int life3_10;
    int[] life2_11;
    int life4_53;
    lexical_join_69: {
    lexical_join_68: {
    life0_3 = (__fieldRead1253_0() ^ 133618176839724L);
    spill1253_0 = __call1253_1();
    life3_10 = __invokedynamic1253_2(31653, (8975078296276315183L ^ life0_3));
    life2_11 = spill1253_0;
    lexical_cycle_12: while (true) {
    lexical_join_65: {
    lexical_join_62: {
    if (!((life3_10 > 0))) {
        break lexical_join_68;
    }
    __call1253_8(__invokedynamic1253_3(411, (3202700850431645233L ^ life0_3)), 0, __invokedynamic1253_4(27751, (3705791054826585063L ^ life0_3)), life3_10, life3_10, 0, __invokedynamic1253_5(19253, (4056201851497290899L ^ life0_3)), __invokedynamic1253_6(920, (3966414514579428407L ^ life0_3)), __cast1253_7(null));
    life4_53 = __call1253_11(__invokedynamic1253_9(16812, (7467040136246105659L ^ life0_3)), 0, __invokedynamic1253_10(27362, (5577091215982509409L ^ life0_3)));
    spill1253_1 = life4_53;
    if (!((life2_11 != null))) {
        lexicalValue1253_69_0 = spill1253_1;
        break lexical_join_69;
    }
    if (!((life2_11 != null))) {
        lexicalValue1253_65_0 = spill1253_1;
        break lexical_join_65;
    }
    if (!((spill1253_1 != 0))) {
        break lexical_join_62;
    }
    return life3_10;
    }
    lexicalValue1253_65_0 = (life3_10 >> 1);
    }
    life3_10 = lexicalValue1253_65_0;
    if (!((life2_11 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1253_69_0 = -1;
    }
    return lexicalValue1253_69_0;
}
public static void h1253_0(moom.Oo p0) throws Throwable {
    throw __call1125300_0(p0);
}
public static void h1253_1(moom.Oo p0) throws Throwable {
    throw __call1125301_0(p0);
}
public static void h1253_2(moom.Oo p0) throws Throwable {
    throw __call1125302_0(p0);
}
private static native long __fieldRead1253_0() throws Throwable;
private static native int[] __call1253_1() throws Throwable;
private static native int __invokedynamic1253_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1253_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic1253_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1253_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1253_6(int a0, long a1) throws Throwable;
private static native java.nio.ByteBuffer __cast1253_7(java.lang.Object a0) throws Throwable;
private static native void __call1253_8(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.ByteBuffer a8) throws Throwable;
private static native int __invokedynamic1253_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic1253_10(int a0, long a1) throws Throwable;
private static native int __call1253_11(int a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1125300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5f14101fb414f99cf2df(net.minecraft.client.Minecraft a0, int a1) throws E;
private static final class __SourceHandler_5f14101fb414f99cf2df {

public static void f1254(net.minecraft.client.Minecraft receiver, int p0) throws Throwable {
    java.util.List forwardValue1254_17_0;
    java.lang.Object forwardValue1254_24_0;
    int forwardValue1254_40_0;
    int forwardValue1254_54_0;
    int forwardValue1254_66_0;
    int forwardValue1254_74_0;
    net.minecraft.client.Minecraft forwardValue1254_81_0;
    int[] spill1254_0;
    java.util.List spill1254_1;
    int spill1254_2;
    int spill1254_3;
    net.minecraft.client.Minecraft spill1254_4;
    long life2_3;
    java.util.List life5_10;
    int[] life4_11;
    moom.A_ life6_34;
    int life7_61;
    forward_join_90: {
    forward_join_81: {
    forward_join_80: {
    forward_join_74: {
    forward_join_66: {
    forward_join_54: {
    forward_join_52: {
    forward_join_50: {
    forward_join_40: {
    forward_join_24: {
    forward_join_17: {
    life2_3 = (__fieldRead1254_0() ^ 47761478659123L);
    spill1254_0 = __call1254_1();
    life5_10 = __call1254_4(__fieldRead1254_2(receiver), __fieldRead1254_3(receiver));
    life4_11 = spill1254_0;
    spill1254_1 = life5_10;
    if (!((life4_11 != null))) {
        forwardValue1254_17_0 = spill1254_1;
        break forward_join_17;
    }
    if (!((spill1254_1 != null))) {
        break forward_join_90;
    }
    forwardValue1254_17_0 = life5_10;
    }
    if (!((life4_11 != null))) {
        forwardValue1254_24_0 = forwardValue1254_17_0;
        break forward_join_24;
    }
    if (!((!__call1254_5(forwardValue1254_17_0)))) {
        break forward_join_90;
    }
    forwardValue1254_24_0 = __call1254_6(life5_10, 0);
    }
    life6_34 = __cast1254_7(forwardValue1254_24_0);
    spill1254_2 = p0;
    if (!((life4_11 != null))) {
        forwardValue1254_54_0 = spill1254_2;
        break forward_join_54;
    }
    if (!((spill1254_2 == 0))) {
        break forward_join_52;
    }
    spill1254_3 = __call1254_9(__fieldRead1254_8(life6_34));
    if (!((life4_11 != null))) {
        forwardValue1254_40_0 = spill1254_3;
        break forward_join_40;
    }
    if (!((spill1254_3 > 0))) {
        break forward_join_90;
    }
    forwardValue1254_40_0 = __call1254_11(__fieldRead1254_10(receiver), ".");
    }
    life7_61 = forwardValue1254_40_0;
    if (!((life7_61 >= 0))) {
        break forward_join_50;
    }
    __fieldWrite1254_14(receiver, __call1254_13(__fieldRead1254_12(receiver), 0, life7_61));
    }
    if (!((life4_11 == null))) {
        break forward_join_90;
    }
    }
    p0 += -1;
    forwardValue1254_54_0 = p0;
    }
    if (!((life4_11 != null))) {
        forwardValue1254_66_0 = forwardValue1254_54_0;
        break forward_join_66;
    }
    if (!((forwardValue1254_54_0 < __call1254_15(life5_10)))) {
        break forward_join_90;
    }
    forwardValue1254_66_0 = __integerCategory1254_20(__call1254_19(__fieldRead1254_18(__cast1254_17(__call1254_16(life5_10, p0))), "unspecified"));
    }
    if (!((life4_11 != null))) {
        forwardValue1254_74_0 = forwardValue1254_66_0;
        break forward_join_74;
    }
    if (!((forwardValue1254_66_0 == 0))) {
        break forward_join_90;
    }
    spill1254_4 = receiver;
    if (!((life4_11 != null))) {
        forwardValue1254_81_0 = spill1254_4;
        break forward_join_81;
    }
    forwardValue1254_74_0 = __call1254_22(__fieldRead1254_21(spill1254_4));
    }
    if (!((forwardValue1254_74_0 > 0))) {
        break forward_join_80;
    }
    __fieldWrite1254_25(receiver, __invokedynamic1254_24(__fieldRead1254_23(receiver)));
    }
    forwardValue1254_81_0 = receiver;
    }
    __fieldWrite1254_31(forwardValue1254_81_0, __invokedynamic1254_30(__fieldRead1254_26(receiver), __fieldRead1254_29(__cast1254_28(__call1254_27(life5_10, p0)))));
    }
    return;
}
public static void h1254_0(moom.Oo p0) throws Throwable {
    throw __call1125400_0(p0);
}
public static void h1254_1(moom.Oo p0) throws Throwable {
    throw __call1125401_0(p0);
}
public static void h1254_2(moom.Oo p0) throws Throwable {
    throw __call1125402_0(p0);
}
public static void h1254_3(moom.Oo p0) throws Throwable {
    throw __call1125403_0(p0);
}
public static void h1254_4(moom.Oo p0) throws Throwable {
    throw __call1125404_0(p0);
}
public static void h1254_5(moom.Oo p0) throws Throwable {
    throw __call1125405_0(p0);
}
public static void h1254_6(moom.Oo p0) throws Throwable {
    throw __call1125406_0(p0);
}
public static void h1254_7(moom.Oo p0) throws Throwable {
    throw __call1125407_0(p0);
}
public static void h1254_8(moom.Oo p0) throws Throwable {
    throw __call1125408_0(p0);
}
public static void h1254_9(moom.Oo p0) throws Throwable {
    throw __call1125409_0(p0);
}
public static void h1254_10(moom.Oo p0) throws Throwable {
    throw __call1125410_0(p0);
}
public static void h1254_11(moom.Oo p0) throws Throwable {
    throw __call1125411_0(p0);
}
public static void h1254_12(moom.Oo p0) throws Throwable {
    throw __call1125412_0(p0);
}
public static void h1254_13(moom.Oo p0) throws Throwable {
    throw __call1125413_0(p0);
}
public static void h1254_14(moom.Oo p0) throws Throwable {
    throw __call1125414_0(p0);
}
private static native long __fieldRead1254_0() throws Throwable;
private static native int[] __call1254_1() throws Throwable;
private static native moom.A9 __fieldRead1254_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead1254_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __call1254_4(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __call1254_5(java.util.List a0) throws Throwable;
private static native java.lang.Object __call1254_6(java.util.List a0, int a1) throws Throwable;
private static native moom.A_ __cast1254_7(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead1254_8(moom.A_ a0) throws Throwable;
private static native int __call1254_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead1254_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1254_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1254_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call1254_13(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite1254_14(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native int __call1254_15(java.util.List a0) throws Throwable;
private static native java.lang.Object __call1254_16(java.util.List a0, int a1) throws Throwable;
private static native moom.A_ __cast1254_17(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead1254_18(moom.A_ a0) throws Throwable;
private static native boolean __call1254_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1254_20(boolean value) throws Throwable;
private static native java.lang.String __fieldRead1254_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1254_22(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead1254_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __invokedynamic1254_24(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1254_25(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1254_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Object __call1254_27(java.util.List a0, int a1) throws Throwable;
private static native moom.A_ __cast1254_28(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead1254_29(moom.A_ a0) throws Throwable;
private static native java.lang.String __invokedynamic1254_30(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite1254_31(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1125400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125413_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125414_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_484c1813d48e365bbfc5(net.minecraft.client.Minecraft a0, int a1, int a2) throws E;
private static final class __SourceHandler_484c1813d48e365bbfc5 {

public static void f1255(net.minecraft.client.Minecraft receiver, int p0, int p1) throws Throwable {
    net.minecraft.client.Minecraft forwardValue1255_41_0;
    net.minecraft.client.Minecraft forwardValue1255_52_0;
    int[] spill1255_0;
    net.minecraft.client.Minecraft spill1255_1;
    long life3_3;
    int[] life5_10;
    moom.ir life6_34;
    forward_join_52: {
    forward_join_51: {
    forward_join_41: {
    forward_join_40: {
    life3_3 = (__fieldRead1255_0() ^ 19137429502569L);
    spill1255_0 = __call1255_1();
    __fieldWrite1255_3(receiver, __call1255_2(1, p0));
    life5_10 = spill1255_0;
    __fieldWrite1255_5(receiver, __call1255_4(1, p1));
    __call1255_8(__call1255_7(__call1255_6()), new com.moon.eS());
    spill1255_1 = receiver;
    if (!((life5_10 != null))) {
        forwardValue1255_41_0 = spill1255_1;
        break forward_join_41;
    }
    if (!((__fieldRead1255_9(spill1255_1) != null))) {
        break forward_join_40;
    }
    life6_34 = new moom.ir(receiver);
    __call1255_13(__fieldRead1255_10(receiver), receiver, __call1255_11(life6_34), __call1255_12(life6_34));
    }
    forwardValue1255_41_0 = receiver;
    }
    if (!((life5_10 != null))) {
        forwardValue1255_52_0 = forwardValue1255_41_0;
        break forward_join_52;
    }
    if (!((__fieldRead1255_14(forwardValue1255_41_0) == null))) {
        break forward_join_51;
    }
    __fieldWrite1255_15(receiver, new moom.fL(receiver));
    }
    forwardValue1255_52_0 = receiver;
    }
    __call1255_16(forwardValue1255_52_0);
    return;
}
public static void h1255_0(moom.Oo p0) throws Throwable {
    throw __call1125500_0(p0);
}
public static void h1255_1(moom.Oo p0) throws Throwable {
    throw __call1125501_0(p0);
}
public static void h1255_2(moom.Oo p0) throws Throwable {
    throw __call1125502_0(p0);
}
private static native long __fieldRead1255_0() throws Throwable;
private static native int[] __call1255_1() throws Throwable;
private static native int __call1255_2(int a0, int a1) throws Throwable;
private static native void __fieldWrite1255_3(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __call1255_4(int a0, int a1) throws Throwable;
private static native void __fieldWrite1255_5(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call1255_6() throws Throwable;
private static native com.moon.events.EventBus __call1255_7(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call1255_8(com.moon.events.EventBus a0, com.moon.eS a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1255_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1255_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1255_11(moom.ir a0) throws Throwable;
private static native int __call1255_12(moom.ir a0) throws Throwable;
private static native void __call1255_13(net.minecraft.client.gui.GuiScreen a0, net.minecraft.client.Minecraft a1, int a2, int a3) throws Throwable;
private static native moom.fL __fieldRead1255_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1255_15(net.minecraft.client.Minecraft a0, moom.fL a1) throws Throwable;
private static native void __call1255_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Throwable __call1125500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125502_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_20ea1058d105435a3ea6(net.minecraft.client.Minecraft a0, long a1) throws E;
private static final class __SourceHandler_20ea1058d105435a3ea6 {

public static void f1256(net.minecraft.client.Minecraft receiver, long p0) throws Throwable {
    moom.A9 lexicalValue1256_14_0;
    int lexicalValue1256_508_0;
    java.lang.String lexicalValue1256_518_0;
    java.lang.String lexicalValue1256_610_0;
    moom.A9 spill1256_0;
    int spill1256_1;
    int spill1256_2;
    long spill1256_3;
    int spill1256_4;
    long spill1256_5;
    boolean spill1256_6;
    java.lang.String spill1256_7;
    java.lang.String spill1256_8;
    long life3_3;
    int[] life5_5;
    java.util.List life6_23;
    moom.A_ life7_29;
    net.minecraft.client.renderer.Tessellator life8_73;
    moom.lw life9_76;
    int life10_78;
    int life11_89;
    int life12_96;
    double life13_226;
    java.util.Iterator life15_229;
    moom.A_ life16_236;
    int life17_244;
    int life18_255;
    int life19_269;
    int life20_283;
    int life21_291;
    int life22_312;
    float life23_332;
    float life24_338;
    float life25_346;
    int life22_385;
    float life23_405;
    float life24_411;
    float life25_419;
    java.text.DecimalFormat life15_501;
    java.lang.String life16_504;
    int life17_545;
    java.lang.String life16_576;
    int life18_602;
    moom.A_ life19_611;
    java.lang.String life20_613;
    java.lang.String life20_642;
    java.lang.String life20_682;
    java.lang.String life20_730;
    lexical_join_740: {
    lexical_join_519: {
    lexical_join_518: {
    lexical_join_514: {
    lexical_join_508: {
    lexical_join_503: {
    lexical_join_485: {
    lexical_join_14: {
    life3_3 = (__fieldRead1256_0() ^ 53419386256726L);
    life5_5 = __call1256_1();
    spill1256_0 = __fieldRead1256_2(receiver);
    if (!((life5_5 != null))) {
        lexicalValue1256_14_0 = spill1256_0;
        break lexical_join_14;
    }
    if (!(__fieldRead1256_3(spill1256_0))) {
        break lexical_join_740;
    }
    lexicalValue1256_14_0 = __fieldRead1256_4(receiver);
    }
    life6_23 = __call1256_6(lexicalValue1256_14_0, __fieldRead1256_5(receiver));
    spill1256_1 = 17470;
    life7_29 = __cast1256_8(__call1256_7(life6_23, 0));
    __call1256_10(__invokedynamic1256_9(spill1256_1, (8346166638924234463L ^ life3_3)));
    __call1256_12(__invokedynamic1256_11(15494, (8002625055973541474L ^ life3_3)));
    spill1256_2 = 25380;
    __call1256_13();
    spill1256_3 = (6028394243258374575L ^ life3_3);
    __call1256_14();
    __call1256_17(0x0.0p0d, ((double) __fieldRead1256_15(receiver)), ((double) __fieldRead1256_16(receiver)), 0x0.0p0d, 0x1.f4p9d, 0x1.77p11d);
    __call1256_19(__invokedynamic1256_18(spill1256_2, spill1256_3));
    spill1256_4 = 22589;
    __call1256_20();
    spill1256_5 = (1676811905013965566L ^ life3_3);
    __call1256_21(0x0.0p0f, 0x0.0p0f, -0x1.f4p10f);
    __call1256_22(0x1.0p0f);
    __call1256_23();
    life8_73 = __call1256_24();
    life9_76 = __call1256_25(life8_73);
    life10_78 = __invokedynamic1256_26(spill1256_4, spill1256_5);
    life11_89 = ((__fieldRead1256_27(receiver) - life10_78) - __invokedynamic1256_28(17238, (496854267537160613L ^ life3_3)));
    life12_96 = (__fieldRead1256_29(receiver) - (life10_78 * 2));
    __call1256_30();
    __call1256_33(life9_76, __invokedynamic1256_31(30632, (5496579858574331180L ^ life3_3)), __fieldRead1256_32());
    __call1256_37(__call1256_36(__call1256_34(life9_76, ((double) (((float) life11_89) - (((float) life10_78) * 0x1.19999ap0f))), ((double) ((((float) life12_96) - (((float) life10_78) * 0x1.333334p-1f)) - 0x1.0p4f)), 0x0.0p0d), __invokedynamic1256_35(22466, (8989005035209354547L ^ life3_3)), 0, 0, 0));
    __call1256_41(__call1256_40(__call1256_38(life9_76, ((double) (((float) life11_89) - (((float) life10_78) * 0x1.19999ap0f))), ((double) (life12_96 + (life10_78 * 2))), 0x0.0p0d), __invokedynamic1256_39(20590, (8264032527330896558L ^ life3_3)), 0, 0, 0));
    __call1256_45(__call1256_44(__call1256_42(life9_76, ((double) (((float) life11_89) + (((float) life10_78) * 0x1.19999ap0f))), ((double) (life12_96 + (life10_78 * 2))), 0x0.0p0d), __invokedynamic1256_43(20590, (8264032527330896558L ^ life3_3)), 0, 0, 0));
    __call1256_49(__call1256_48(__call1256_46(life9_76, ((double) (((float) life11_89) + (((float) life10_78) * 0x1.19999ap0f))), ((double) ((((float) life12_96) - (((float) life10_78) * 0x1.333334p-1f)) - 0x1.0p4f)), 0x0.0p0d), __invokedynamic1256_47(20590, (8264032527330896558L ^ life3_3)), 0, 0, 0));
    __call1256_50(life8_73);
    __call1256_51();
    life13_226 = 0x0.0p0d;
    life15_229 = __call1256_52(life6_23);
    lexical_cycle_224: while (true) {
    lexical_join_483: {
    lexical_join_476: {
    lexical_join_375: {
    lexical_join_369: {
    if (!(__call1256_53(life15_229))) {
        break lexical_join_485;
    }
    life16_236 = __cast1256_55(__call1256_54(life15_229));
    life17_244 = (__call1256_57((__fieldRead1256_56(life16_236) / 0x1.0p2d)) + 1);
    __call1256_60(life9_76, __invokedynamic1256_58(20292, (440321754585822632L ^ life3_3)), __fieldRead1256_59());
    life18_255 = __call1256_61(life16_236);
    life19_269 = ((life18_255 >> __invokedynamic1256_62(369, (8157862333519608713L ^ life3_3))) & __invokedynamic1256_63(16959, (8633577055565871332L ^ life3_3)));
    life20_283 = ((life18_255 >> __invokedynamic1256_64(265, (6225852879772302291L ^ life3_3))) & __invokedynamic1256_65(16959, (8633577055565871332L ^ life3_3)));
    life21_291 = (life18_255 & __invokedynamic1256_66(16959, (8633577055565871332L ^ life3_3)));
    __call1256_70(__call1256_69(__call1256_67(life9_76, ((double) life11_89), ((double) life12_96), 0x0.0p0d), life19_269, life20_283, life21_291, __invokedynamic1256_68(16959, (8633577055565871332L ^ life3_3))));
    if (!((life5_5 != null))) {
        break lexical_join_740;
    }
    life22_312 = life17_244;
    lexical_cycle_307: while (true) {
    if (!((life22_312 >= 0))) {
        break lexical_join_369;
    }
    life23_332 = ((float) ((((life13_226 + ((__fieldRead1256_71(life16_236) * ((double) life22_312)) / ((double) life17_244))) * 0x1.921fb54442d18p1d) * 0x1.0p1d) / 0x1.9p6d));
    life24_338 = (__call1256_72(life23_332) * ((float) life10_78));
    life25_346 = ((__call1256_73(life23_332) * ((float) life10_78)) * 0x1.0p-1f);
    __call1256_77(__call1256_76(__call1256_74(life9_76, ((double) (((float) life11_89) + life24_338)), ((double) (((float) life12_96) - life25_346)), 0x0.0p0d), life19_269, life20_283, life21_291, __invokedynamic1256_75(16959, (8633577055565871332L ^ life3_3))));
    life22_312 += -1;
    if (!((life5_5 != null))) {
        break lexical_join_375;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_307; }
    break lexical_cycle_307;
    }
    }
    __call1256_78(life8_73);
    __call1256_80(life9_76, 5, __fieldRead1256_79());
    }
    life22_385 = life17_244;
    lexical_cycle_377: while (true) {
    if (!((life22_385 >= 0))) {
        break lexical_join_476;
    }
    life23_405 = ((float) ((((life13_226 + ((__fieldRead1256_81(life16_236) * ((double) life22_385)) / ((double) life17_244))) * 0x1.921fb54442d18p1d) * 0x1.0p1d) / 0x1.9p6d));
    life24_411 = (__call1256_82(life23_405) * ((float) life10_78));
    life25_419 = ((__call1256_83(life23_405) * ((float) life10_78)) * 0x1.0p-1f);
    __call1256_87(__call1256_86(__call1256_84(life9_76, ((double) (((float) life11_89) + life24_411)), ((double) (((float) life12_96) - life25_419)), 0x0.0p0d), (life19_269 >> 1), (life20_283 >> 1), (life21_291 >> 1), __invokedynamic1256_85(16959, (8633577055565871332L ^ life3_3))));
    __call1256_91(__call1256_90(__call1256_88(life9_76, ((double) (((float) life11_89) + life24_411)), ((double) ((((float) life12_96) - life25_419) + 0x1.4p3f)), 0x0.0p0d), (life19_269 >> 1), (life20_283 >> 1), (life21_291 >> 1), __invokedynamic1256_89(16959, (8633577055565871332L ^ life3_3))));
    life22_385 += -1;
    if (!((life5_5 != null))) {
        break lexical_join_483;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_377; }
    break lexical_cycle_377;
    }
    }
    __call1256_92(life8_73);
    life13_226 = (life13_226 + __fieldRead1256_93(life16_236));
    }
    if (!((life5_5 == null))) { continue lexical_cycle_224; }
    break lexical_cycle_224;
    }
    }
    life15_501 = new java.text.DecimalFormat("##0.00");
    __call1256_94();
    life16_504 = "";
    spill1256_6 = __call1256_96(__fieldRead1256_95(life7_29), "unspecified");
    if (!((life5_5 != null))) {
        lexicalValue1256_508_0 = __integerCategory1256_97(spill1256_6);
        break lexical_join_508;
    }
    if (!((!spill1256_6))) {
        break lexical_join_503;
    }
    life16_504 = __invokedynamic1256_98(life16_504);
    }
    spill1256_7 = __fieldRead1256_99(life7_29);
    if (!((life5_5 != null))) {
        lexicalValue1256_518_0 = spill1256_7;
        break lexical_join_518;
    }
    lexicalValue1256_508_0 = __call1256_100(spill1256_7);
    }
    if (!((lexicalValue1256_508_0 == 0))) {
        break lexical_join_514;
    }
    life16_504 = __invokedynamic1256_101(life16_504);
    if (!((life5_5 == null))) {
        break lexical_join_519;
    }
    }
    lexicalValue1256_518_0 = __invokedynamic1256_103(life16_504, __fieldRead1256_102(life7_29));
    }
    life16_504 = lexicalValue1256_518_0;
    }
    life17_545 = __invokedynamic1256_104(27588, (4176119394398753094L ^ life3_3));
    __call1256_107(__fieldRead1256_105(receiver), life16_504, ((float) (life11_89 - life10_78)), ((float) ((life12_96 - (life10_78 / 2)) - __invokedynamic1256_106(14855, (4092423805611245719L ^ life3_3)))), life17_545);
    __call1256_115(__fieldRead1256_108(receiver), (life16_576 = __invokedynamic1256_111(__call1256_110(life15_501, __fieldRead1256_109(life7_29)))), ((float) ((life11_89 + life10_78) - __call1256_113(__fieldRead1256_112(receiver), life16_576))), ((float) ((life12_96 - (life10_78 / 2)) - __invokedynamic1256_114(14855, (4092423805611245719L ^ life3_3)))), life17_545);
    life18_602 = 0;
    lexical_cycle_582: while (true) {
    lexical_join_611: {
    lexical_join_610: {
    lexical_join_605: {
    if (!((life18_602 < __call1256_116(life6_23)))) {
        break lexical_join_740;
    }
    life19_611 = __cast1256_118(__call1256_117(life6_23, life18_602));
    life20_613 = "";
    spill1256_8 = __fieldRead1256_119(life19_611);
    if (!((life5_5 != null))) {
        lexicalValue1256_610_0 = spill1256_8;
        break lexical_join_610;
    }
    if (!(__call1256_120(spill1256_8, "unspecified"))) {
        break lexical_join_605;
    }
    life20_613 = __invokedynamic1256_121(life20_613);
    if (!((life5_5 == null))) {
        break lexical_join_611;
    }
    }
    lexicalValue1256_610_0 = __invokedynamic1256_122(life20_613, (life18_602 + 1));
    }
    life20_613 = lexicalValue1256_610_0;
    }
    life20_642 = __invokedynamic1256_124(life20_613, __fieldRead1256_123(life19_611));
    __call1256_129(__fieldRead1256_125(receiver), life20_642, ((float) (life11_89 - life10_78)), ((float) (((life12_96 + (life10_78 / 2)) + (life18_602 * __invokedynamic1256_126(265, (6225852879772302291L ^ life3_3)))) + __invokedynamic1256_127(15792, (6144148475698972516L ^ life3_3)))), __call1256_128(life19_611));
    __call1256_140(__fieldRead1256_130(receiver), (life20_682 = __invokedynamic1256_133(__call1256_132(life15_501, __fieldRead1256_131(life19_611)))), ((float) (((life11_89 + life10_78) - __invokedynamic1256_134(28665, (7787747217710339391L ^ life3_3))) - __call1256_136(__fieldRead1256_135(receiver), life20_682))), ((float) (((life12_96 + (life10_78 / 2)) + (life18_602 * __invokedynamic1256_137(265, (6225852879772302291L ^ life3_3)))) + __invokedynamic1256_138(15792, (6144148475698972516L ^ life3_3)))), __call1256_139(life19_611));
    __call1256_150(__fieldRead1256_141(receiver), (life20_730 = __invokedynamic1256_144(__call1256_143(life15_501, __fieldRead1256_142(life19_611)))), ((float) ((life11_89 + life10_78) - __call1256_146(__fieldRead1256_145(receiver), life20_730))), ((float) (((life12_96 + (life10_78 / 2)) + (life18_602 * __invokedynamic1256_147(265, (6225852879772302291L ^ life3_3)))) + __invokedynamic1256_148(15792, (6144148475698972516L ^ life3_3)))), __call1256_149(life19_611));
    life18_602 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_582; }
    break lexical_cycle_582;
    }
    }
    return;
}
public static void h1256_0(moom.Oo p0) throws Throwable {
    throw __call1125600_0(p0);
}
public static void h1256_1(moom.Oo p0) throws Throwable {
    throw __call1125601_0(p0);
}
public static void h1256_2(moom.Oo p0) throws Throwable {
    throw __call1125602_0(p0);
}
public static void h1256_3(moom.Oo p0) throws Throwable {
    throw __call1125603_0(p0);
}
public static void h1256_4(moom.Oo p0) throws Throwable {
    throw __call1125604_0(p0);
}
public static void h1256_5(moom.Oo p0) throws Throwable {
    throw __call1125605_0(p0);
}
public static void h1256_6(moom.Oo p0) throws Throwable {
    throw __call1125606_0(p0);
}
public static void h1256_7(moom.Oo p0) throws Throwable {
    throw __call1125607_0(p0);
}
public static void h1256_8(moom.Oo p0) throws Throwable {
    throw __call1125608_0(p0);
}
private static native long __fieldRead1256_0() throws Throwable;
private static native int[] __call1256_1() throws Throwable;
private static native moom.A9 __fieldRead1256_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1256_3(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead1256_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead1256_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __call1256_6(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call1256_7(java.util.List a0, int a1) throws Throwable;
private static native moom.A_ __cast1256_8(java.lang.Object a0) throws Throwable;
private static native int __invokedynamic1256_9(int a0, long a1) throws Throwable;
private static native void __call1256_10(int a0) throws Throwable;
private static native int __invokedynamic1256_11(int a0, long a1) throws Throwable;
private static native void __call1256_12(int a0) throws Throwable;
private static native void __call1256_13() throws Throwable;
private static native void __call1256_14() throws Throwable;
private static native int __fieldRead1256_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1256_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1256_17(double a0, double a1, double a2, double a3, double a4, double a5) throws Throwable;
private static native int __invokedynamic1256_18(int a0, long a1) throws Throwable;
private static native void __call1256_19(int a0) throws Throwable;
private static native void __call1256_20() throws Throwable;
private static native void __call1256_21(float a0, float a1, float a2) throws Throwable;
private static native void __call1256_22(float a0) throws Throwable;
private static native void __call1256_23() throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call1256_24() throws Throwable;
private static native moom.lw __call1256_25(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic1256_26(int a0, long a1) throws Throwable;
private static native int __fieldRead1256_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic1256_28(int a0, long a1) throws Throwable;
private static native int __fieldRead1256_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1256_30() throws Throwable;
private static native int __invokedynamic1256_31(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead1256_32() throws Throwable;
private static native void __call1256_33(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.lw __call1256_34(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic1256_35(int a0, long a1) throws Throwable;
private static native moom.lw __call1256_36(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1256_37(moom.lw a0) throws Throwable;
private static native moom.lw __call1256_38(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic1256_39(int a0, long a1) throws Throwable;
private static native moom.lw __call1256_40(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1256_41(moom.lw a0) throws Throwable;
private static native moom.lw __call1256_42(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic1256_43(int a0, long a1) throws Throwable;
private static native moom.lw __call1256_44(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1256_45(moom.lw a0) throws Throwable;
private static native moom.lw __call1256_46(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic1256_47(int a0, long a1) throws Throwable;
private static native moom.lw __call1256_48(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1256_49(moom.lw a0) throws Throwable;
private static native void __call1256_50(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call1256_51() throws Throwable;
private static native java.util.Iterator __call1256_52(java.util.List a0) throws Throwable;
private static native boolean __call1256_53(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1256_54(java.util.Iterator a0) throws Throwable;
private static native moom.A_ __cast1256_55(java.lang.Object a0) throws Throwable;
private static native double __fieldRead1256_56(moom.A_ a0) throws Throwable;
private static native int __call1256_57(double a0) throws Throwable;
private static native int __invokedynamic1256_58(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead1256_59() throws Throwable;
private static native void __call1256_60(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __call1256_61(moom.A_ a0) throws Throwable;
private static native int __invokedynamic1256_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic1256_63(int a0, long a1) throws Throwable;
private static native int __invokedynamic1256_64(int a0, long a1) throws Throwable;
private static native int __invokedynamic1256_65(int a0, long a1) throws Throwable;
private static native int __invokedynamic1256_66(int a0, long a1) throws Throwable;
private static native moom.lw __call1256_67(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic1256_68(int a0, long a1) throws Throwable;
private static native moom.lw __call1256_69(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1256_70(moom.lw a0) throws Throwable;
private static native double __fieldRead1256_71(moom.A_ a0) throws Throwable;
private static native float __call1256_72(float a0) throws Throwable;
private static native float __call1256_73(float a0) throws Throwable;
private static native moom.lw __call1256_74(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic1256_75(int a0, long a1) throws Throwable;
private static native moom.lw __call1256_76(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1256_77(moom.lw a0) throws Throwable;
private static native void __call1256_78(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native moom.oD __fieldRead1256_79() throws Throwable;
private static native void __call1256_80(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native double __fieldRead1256_81(moom.A_ a0) throws Throwable;
private static native float __call1256_82(float a0) throws Throwable;
private static native float __call1256_83(float a0) throws Throwable;
private static native moom.lw __call1256_84(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic1256_85(int a0, long a1) throws Throwable;
private static native moom.lw __call1256_86(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1256_87(moom.lw a0) throws Throwable;
private static native moom.lw __call1256_88(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native int __invokedynamic1256_89(int a0, long a1) throws Throwable;
private static native moom.lw __call1256_90(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1256_91(moom.lw a0) throws Throwable;
private static native void __call1256_92(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native double __fieldRead1256_93(moom.A_ a0) throws Throwable;
private static native void __call1256_94() throws Throwable;
private static native java.lang.String __fieldRead1256_95(moom.A_ a0) throws Throwable;
private static native boolean __call1256_96(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1256_97(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1256_98(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead1256_99(moom.A_ a0) throws Throwable;
private static native int __call1256_100(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic1256_101(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead1256_102(moom.A_ a0) throws Throwable;
private static native java.lang.String __invokedynamic1256_103(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1256_104(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1256_105(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic1256_106(int a0, long a1) throws Throwable;
private static native int __call1256_107(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1256_108(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1256_109(moom.A_ a0) throws Throwable;
private static native java.lang.String __call1256_110(java.text.DecimalFormat a0, double a1) throws Throwable;
private static native java.lang.String __invokedynamic1256_111(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1256_112(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1256_113(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1256_114(int a0, long a1) throws Throwable;
private static native int __call1256_115(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native int __call1256_116(java.util.List a0) throws Throwable;
private static native java.lang.Object __call1256_117(java.util.List a0, int a1) throws Throwable;
private static native moom.A_ __cast1256_118(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead1256_119(moom.A_ a0) throws Throwable;
private static native boolean __call1256_120(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic1256_121(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic1256_122(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead1256_123(moom.A_ a0) throws Throwable;
private static native java.lang.String __invokedynamic1256_124(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1256_125(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic1256_126(int a0, long a1) throws Throwable;
private static native int __invokedynamic1256_127(int a0, long a1) throws Throwable;
private static native int __call1256_128(moom.A_ a0) throws Throwable;
private static native int __call1256_129(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1256_130(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1256_131(moom.A_ a0) throws Throwable;
private static native java.lang.String __call1256_132(java.text.DecimalFormat a0, double a1) throws Throwable;
private static native java.lang.String __invokedynamic1256_133(java.lang.String a0) throws Throwable;
private static native int __invokedynamic1256_134(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1256_135(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1256_136(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1256_137(int a0, long a1) throws Throwable;
private static native int __invokedynamic1256_138(int a0, long a1) throws Throwable;
private static native int __call1256_139(moom.A_ a0) throws Throwable;
private static native int __call1256_140(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1256_141(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead1256_142(moom.A_ a0) throws Throwable;
private static native java.lang.String __call1256_143(java.text.DecimalFormat a0, double a1) throws Throwable;
private static native java.lang.String __invokedynamic1256_144(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1256_145(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1256_146(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1256_147(int a0, long a1) throws Throwable;
private static native int __invokedynamic1256_148(int a0, long a1) throws Throwable;
private static native int __call1256_149(moom.A_ a0) throws Throwable;
private static native int __call1256_150(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1125600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125608_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.nio.ByteBuffer __sourceHandlerCall_7d316aa8771f3ac4afe2(net.minecraft.client.Minecraft a0, java.io.InputStream a1) throws E;
private static final class __SourceHandler_7d316aa8771f3ac4afe2 {

public static java.nio.ByteBuffer f1257(net.minecraft.client.Minecraft receiver, java.io.InputStream p0) throws Throwable {
    int[] spill1257_0;
    long life2_3;
    java.awt.image.BufferedImage life5_6;
    int[] life6_19;
    java.nio.ByteBuffer life7_25;
    int[] life8_27;
    int life9_30;
    int life10_33;
    int[] life4_34;
    int life11_41;
    lexical_join_74: {
    lexical_join_71: {
    life2_3 = (__fieldRead1257_0() ^ 84540545740272L);
    life5_6 = __call1257_1(p0);
    life6_19 = __call1257_5(life5_6, 0, 0, __call1257_2(life5_6), __call1257_3(life5_6), null, 0, __call1257_4(life5_6));
    life7_25 = __call1257_6((4 * (life6_19).length));
    life8_27 = life6_19;
    life9_30 = (life8_27).length;
    spill1257_0 = __call1257_7();
    life10_33 = 0;
    life4_34 = spill1257_0;
    lexical_cycle_35: while (true) {
    if (!((life10_33 < life9_30))) {
        break lexical_join_71;
    }
    life11_41 = (life8_27)[life10_33];
    __call1257_11(life7_25, ((life11_41 << __invokedynamic1257_8(372, (6760050833073777413L ^ life2_3))) | ((life11_41 >> __invokedynamic1257_9(14022, (7893156590833867953L ^ life2_3))) & __invokedynamic1257_10(16959, (8633643344247875650L ^ life2_3)))));
    life10_33 += 1;
    if (!((life4_34 != null))) {
        break lexical_join_74;
    }
    if (!((life4_34 == null))) { continue lexical_cycle_35; }
    break lexical_cycle_35;
    }
    }
    __call1257_12(life7_25);
    }
    return life7_25;
}
public static void h1257_0(java.io.IOException p0) throws Throwable {
    throw __call1125700_0(p0);
}
private static native long __fieldRead1257_0() throws Throwable;
private static native java.awt.image.BufferedImage __call1257_1(java.io.InputStream a0) throws Throwable;
private static native int __call1257_2(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call1257_3(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call1257_4(java.awt.image.BufferedImage a0) throws Throwable;
private static native int[] __call1257_5(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, java.lang.Object a5, int a6, int a7) throws Throwable;
private static native java.nio.ByteBuffer __call1257_6(int a0) throws Throwable;
private static native int[] __call1257_7() throws Throwable;
private static native int __invokedynamic1257_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1257_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic1257_10(int a0, long a1) throws Throwable;
private static native java.nio.ByteBuffer __call1257_11(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call1257_12(java.nio.ByteBuffer a0) throws Throwable;
private static native java.lang.Throwable __call1125700_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_37b58dc0c53ca651bf7f(net.minecraft.client.Minecraft a0, java.lang.String a1) throws E;
private static final class __SourceHandler_37b58dc0c53ca651bf7f {

public static void f1258(net.minecraft.client.Minecraft receiver, java.lang.String p0) throws Throwable {
    int forwardValue1258_16_0;
    int[] spill1258_0;
    int spill1258_1;
    long life2_3;
    int life5_9;
    int[] life4_10;
    java.lang.String life6_20;
    forward_join_30: {
    forward_join_16: {
    life2_3 = (__fieldRead1258_0() ^ 81730108309814L);
    __call1258_1(receiver);
    spill1258_0 = __call1258_2();
    life5_9 = __call1258_3();
    life4_10 = spill1258_0;
    spill1258_1 = life5_9;
    if (!((life4_10 != null))) {
        forwardValue1258_16_0 = spill1258_1;
        break forward_join_16;
    }
    if (!((spill1258_1 != 0))) {
        break forward_join_30;
    }
    forwardValue1258_16_0 = life5_9;
    }
    life6_20 = __call1258_4(forwardValue1258_16_0);
    __call1258_6(__fieldRead1258_5(), "########## GL ERROR ##########");
    __call1258_9(__fieldRead1258_7(), __invokedynamic1258_8(p0));
    __call1258_12(__fieldRead1258_10(), __invokedynamic1258_11(life5_9, life6_20));
    }
    return;
}
public static void h1258_0(moom.Oo p0) throws Throwable {
    throw __call1125800_0(p0);
}
private static native long __fieldRead1258_0() throws Throwable;
private static native java.lang.Object __call1258_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int[] __call1258_2() throws Throwable;
private static native int __call1258_3() throws Throwable;
private static native java.lang.String __call1258_4(int a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1258_5() throws Throwable;
private static native void __call1258_6(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1258_7() throws Throwable;
private static native java.lang.String __invokedynamic1258_8(java.lang.String a0) throws Throwable;
private static native void __call1258_9(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1258_10() throws Throwable;
private static native java.lang.String __invokedynamic1258_11(int a0, java.lang.String a1) throws Throwable;
private static native void __call1258_12(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1125800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d510cf33735a15fc0135(net.minecraft.client.Minecraft a0, java.lang.String a1, java.lang.String a2, moom.EK a3) throws E;
private static final class __SourceHandler_d510cf33735a15fc0135 {

public static void f532(net.minecraft.client.Minecraft receiver, java.lang.String p0, java.lang.String p1, moom.EK p2) throws Throwable {
    moom.EK forestValue532_34_0;
    moom.EK forestValue532_41_0;
    int[] spill532_0;
    moom.EK spill532_1;
    long life4_3;
    net.minecraft.world.storage.ISaveHandler life7_12;
    net.minecraft.world.storage.WorldInfo life8_16;
    int[] life6_17;
    java.lang.String life9_76;
    java.net.SocketAddress life9_116;
    net.minecraft.network.NetworkManager life10_119;
    forest_join_102: {
    forest_join_99: {
    forest_join_42: {
    forest_join_41: {
    forest_join_34: {
    forest_join_33: {
    life4_3 = (__fieldRead532_0() ^ 113563741274902L);
    __call532_1(receiver, null);
    life7_12 = __call532_3(__fieldRead532_2(receiver), p0, 0);
    spill532_0 = __call532_4();
    life8_16 = __call532_5(life7_12);
    life6_17 = spill532_0;
    if (!((life8_16 == null))) {
        break forest_join_33;
    }
    spill532_1 = p2;
    if (!((life6_17 != null))) {
        forestValue532_34_0 = spill532_1;
        break forest_join_34;
    }
    if (!((spill532_1 != null))) {
        break forest_join_33;
    }
    life8_16 = new net.minecraft.world.storage.WorldInfo(p2, p0);
    __call532_6(life7_12, life8_16);
    }
    forestValue532_34_0 = p2;
    }
    if (!((life6_17 != null))) {
        forestValue532_41_0 = forestValue532_34_0;
        break forest_join_41;
    }
    if (!((forestValue532_34_0 == null))) {
        break forest_join_42;
    }
    forestValue532_41_0 = new moom.EK(life8_16);
    }
    p2 = forestValue532_41_0;
    }
    __fieldWrite532_7(receiver, new net.minecraft.server.integrated.IntegratedServer(receiver, p0, p1, p2));
    __call532_9(__fieldRead532_8(receiver));
    __fieldWrite532_10(receiver, 1);
    __call532_13(__fieldRead532_11(receiver), __call532_12("menu.loadingLevel", new java.lang.Object[0]));
    forest_cycle_64: while (true) {
    forest_join_91: {
    forest_join_87: {
    forest_join_85: {
    if (!((!__call532_15(__fieldRead532_14(receiver))))) {
        break forest_join_99;
    }
    life9_76 = __call532_17(__fieldRead532_16(receiver));
    if (!((life6_17 != null))) {
        break forest_join_102;
    }
    if (!((life6_17 != null))) {
        break forest_join_85;
    }
    if (!((life9_76 != null))) {
        break forest_join_87;
    }
    __call532_20(__fieldRead532_18(receiver), __call532_19(life9_76, new java.lang.Object[0]));
    }
    if (!((life6_17 == null))) {
        break forest_join_91;
    }
    }
    __call532_22(__fieldRead532_21(receiver), "");
    }
    __call532_24(__invokedynamic532_23(5206, (7831055847527690005L ^ life4_3)));
    if (!((life6_17 == null))) {
        continue forest_cycle_64;
    }
    break forest_cycle_64;
    }
    }
    __call532_25(receiver, null);
    }
    life9_116 = __call532_28(__call532_27(__fieldRead532_26(receiver)));
    life10_119 = __call532_29(life9_116);
    __call532_30(life10_119, new net.minecraft.client.network.NetHandlerLoginClient(life10_119, receiver, null));
    __call532_34(life10_119, new moom.yT(__invokedynamic532_31(24262, (5004438011108825712L ^ life4_3)), __call532_32(life9_116), 0, __fieldRead532_33()));
    __call532_37(life10_119, new moom.yW(__call532_36(__call532_35(receiver))));
    __fieldWrite532_38(receiver, life10_119);
    return;
}
public static void h532_0(java.lang.Throwable p0) throws Throwable {
    throw __call3053200_0(p0);
}
public static void h532_1(java.lang.Throwable p0) throws Throwable {
    throw __call3053201_0(p0);
}
public static void h532_2(java.lang.Throwable p0) throws Throwable {
    throw __call3053202_0(p0);
}
public static void h532_3(java.lang.Throwable p0) throws Throwable {
    throw __call3053203_0(p0);
}
public static void h532_4(java.lang.Throwable p0, java.lang.String p1, java.lang.String p2, net.minecraft.network.NetworkManager p3) throws Throwable {
    java.lang.Throwable life4_2;
    moom.qY life3_6;
    moom.qZ life5_10;
    life4_2 = p0;
    life3_6 = __call3053204_0(life4_2, "Starting integrated server");
    life5_10 = __call3053204_1(life3_6, "Starting integrated server");
    __call3053204_2(life5_10, "Level ID", p1);
    __call3053204_3(life5_10, "Level Name", p2);
    throw new moom.Oo(life3_6);
}
public static void h532_5(java.lang.Throwable p0) throws Throwable {
    throw __call3053205_0(p0);
}
public static void h532_6(java.lang.Throwable p0) throws Throwable {
    throw __call3053206_0(p0);
}
public static void h532_7(java.lang.Throwable p0) throws Throwable {
    throw __call3053207_0(p0);
}
public static void h532_8(java.lang.Throwable p0) throws Throwable {
    throw __call3053208_0(p0);
}
public static void h532_9(java.lang.InterruptedException p0, net.minecraft.client.Minecraft p1, long p2, int[] p3, net.minecraft.network.NetworkManager p4) throws Throwable {
    java.lang.InterruptedException life5_2;
    java.lang.String life6_13;
    java.net.SocketAddress life6_51;
    net.minecraft.network.NetworkManager life5_54;
    forest_join_42: {
    forest_join_39: {
    life5_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_32: {
    forest_join_28: {
    forest_join_26: {
    forest_join_5: {
    if (!((p3 == null))) {
        break forest_join_5;
    }
    break forest_join_39;
    }
    if (!((!__call3053209_1(__fieldRead3053209_0(p1))))) {
        break forest_join_39;
    }
    life6_13 = __call3053209_3(__fieldRead3053209_2(p1));
    if (!((p3 != null))) {
        break forest_join_42;
    }
    if (!((p3 != null))) {
        break forest_join_26;
    }
    if (!((life6_13 != null))) {
        break forest_join_28;
    }
    __call3053209_6(__fieldRead3053209_4(p1), __call3053209_5(life6_13, new java.lang.Object[0]));
    }
    if (!((p3 == null))) {
        break forest_join_32;
    }
    }
    __call3053209_8(__fieldRead3053209_7(p1), "");
    }
    __call3053209_10(__invokedynamic3053209_9(5206, (7831055847527690005L ^ p2)));
    continue forest_cycle_2;
    }
    }
    __call3053209_11(p1, null);
    }
    life6_51 = __call3053209_14(__call3053209_13(__fieldRead3053209_12(p1)));
    life5_54 = __call3053209_15(life6_51);
    __call3053209_16(life5_54, new net.minecraft.client.network.NetHandlerLoginClient(life5_54, p1, null));
    __call3053209_20(life5_54, new moom.yT(__invokedynamic3053209_17(24262, (5004438011108825712L ^ p2)), __call3053209_18(life6_51), 0, __fieldRead3053209_19()));
    __call3053209_23(life5_54, new moom.yW(__call3053209_22(__call3053209_21(p1))));
    __fieldWrite3053209_24(p1, life5_54);
    return;
}
private static native long __fieldRead532_0() throws Throwable;
private static native void __call532_1(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __fieldRead532_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.storage.ISaveHandler __call532_3(net.minecraft.world.storage.ISaveFormat a0, java.lang.String a1, int a2) throws Throwable;
private static native int[] __call532_4() throws Throwable;
private static native net.minecraft.world.storage.WorldInfo __call532_5(net.minecraft.world.storage.ISaveHandler a0) throws Throwable;
private static native void __call532_6(net.minecraft.world.storage.ISaveHandler a0, net.minecraft.world.storage.WorldInfo a1) throws Throwable;
private static native void __fieldWrite532_7(net.minecraft.client.Minecraft a0, net.minecraft.server.integrated.IntegratedServer a1) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead532_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call532_9(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __fieldWrite532_10(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native moom.fL __fieldRead532_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call532_12(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call532_13(moom.fL a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead532_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call532_15(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead532_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call532_17(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.fL __fieldRead532_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call532_19(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call532_20(moom.fL a0, java.lang.String a1) throws Throwable;
private static native moom.fL __fieldRead532_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call532_22(moom.fL a0, java.lang.String a1) throws Throwable;
private static native long __invokedynamic532_23(int a0, long a1) throws Throwable;
private static native void __call532_24(long a0) throws Throwable;
private static native void __call532_25(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead532_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.network.NetworkSystem __call532_27(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.net.SocketAddress __call532_28(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __call532_29(java.net.SocketAddress a0) throws Throwable;
private static native void __call532_30(net.minecraft.network.NetworkManager a0, net.minecraft.client.network.NetHandlerLoginClient a1) throws Throwable;
private static native int __invokedynamic532_31(int a0, long a1) throws Throwable;
private static native java.lang.String __call532_32(java.net.SocketAddress a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __fieldRead532_33() throws Throwable;
private static native void __call532_34(net.minecraft.network.NetworkManager a0, moom.yT a1) throws Throwable;
private static native net.minecraft.util.Session __call532_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call532_36(net.minecraft.util.Session a0) throws Throwable;
private static native void __call532_37(net.minecraft.network.NetworkManager a0, moom.yW a1) throws Throwable;
private static native void __fieldWrite532_38(net.minecraft.client.Minecraft a0, net.minecraft.network.NetworkManager a1) throws Throwable;
private static native java.lang.Throwable __call3053200_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053201_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053202_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053203_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3053204_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3053204_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3053204_2(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3053204_3(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Throwable __call3053205_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053206_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053207_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053208_0(java.lang.Throwable a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead3053209_0(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call3053209_1(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead3053209_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call3053209_3(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.fL __fieldRead3053209_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call3053209_5(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call3053209_6(moom.fL a0, java.lang.String a1) throws Throwable;
private static native moom.fL __fieldRead3053209_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053209_8(moom.fL a0, java.lang.String a1) throws Throwable;
private static native long __invokedynamic3053209_9(int a0, long a1) throws Throwable;
private static native void __call3053209_10(long a0) throws Throwable;
private static native void __call3053209_11(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead3053209_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.network.NetworkSystem __call3053209_13(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.net.SocketAddress __call3053209_14(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __call3053209_15(java.net.SocketAddress a0) throws Throwable;
private static native void __call3053209_16(net.minecraft.network.NetworkManager a0, net.minecraft.client.network.NetHandlerLoginClient a1) throws Throwable;
private static native int __invokedynamic3053209_17(int a0, long a1) throws Throwable;
private static native java.lang.String __call3053209_18(java.net.SocketAddress a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __fieldRead3053209_19() throws Throwable;
private static native void __call3053209_20(net.minecraft.network.NetworkManager a0, moom.yT a1) throws Throwable;
private static native net.minecraft.util.Session __call3053209_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call3053209_22(net.minecraft.util.Session a0) throws Throwable;
private static native void __call3053209_23(net.minecraft.network.NetworkManager a0, moom.yW a1) throws Throwable;
private static native void __fieldWrite3053209_24(net.minecraft.client.Minecraft a0, net.minecraft.network.NetworkManager a1) throws Throwable;

}

private static native <E extends Throwable> com.google.common.util.concurrent.ListenableFuture __sourceHandlerCall_73ba850a2e2ad5dea135(net.minecraft.client.Minecraft a0, java.util.concurrent.Callable a1) throws E;
private static final class __SourceHandler_73ba850a2e2ad5dea135 {

public static com.google.common.util.concurrent.ListenableFuture f533(net.minecraft.client.Minecraft receiver, java.util.concurrent.Callable p0) throws Throwable {
    java.lang.Object forestValue533_33_0;
    int[] spill533_0;
    net.minecraft.client.Minecraft spill533_1;
    com.google.common.util.concurrent.ListenableFutureTask spill533_2;
    long life2_3;
    int[] life4_8;
    com.google.common.util.concurrent.ListenableFutureTask life5_17;
    java.util.Queue life6_21;
    forest_join_33: {
    forest_join_31: {
    life2_3 = (__fieldRead533_0() ^ 85996615090032L);
    spill533_0 = __call533_1();
    __call533_2(p0);
    life4_8 = spill533_0;
    spill533_1 = receiver;
    if (!((life4_8 != null))) {
        forestValue533_33_0 = spill533_1;
        break forest_join_33;
    }
    if (!((!__call533_3(spill533_1)))) {
        break forest_join_31;
    }
    life5_17 = __call533_4(p0);
    __monitorEnter533_6((life6_21 = __fieldRead533_5(receiver)));
    __call533_8(__fieldRead533_7(receiver), life5_17);
    spill533_2 = life5_17;
    __monitorExit533_9(life6_21);
    return spill533_2;
    }
    forestValue533_33_0 = __call533_10(p0);
    }
    return __call533_11(forestValue533_33_0);
}
public static com.google.common.util.concurrent.ListenableFuture h533_0(java.lang.Exception p0) throws Throwable {
    throw __call3053300_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h533_1(java.lang.Throwable p0, java.util.Queue p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3053301_0(p1);
    throw life2_2;
}
public static com.google.common.util.concurrent.ListenableFuture h533_2(java.lang.Exception p0, com.google.common.util.concurrent.ListenableFutureTask p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    return __call3053302_0(life1_2);
}
private static native long __fieldRead533_0() throws Throwable;
private static native int[] __call533_1() throws Throwable;
private static native java.lang.Object __call533_2(java.util.concurrent.Callable a0) throws Throwable;
private static native boolean __call533_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFutureTask __call533_4(java.util.concurrent.Callable a0) throws Throwable;
private static native java.util.Queue __fieldRead533_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __monitorEnter533_6(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead533_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call533_8(java.util.Queue a0, com.google.common.util.concurrent.ListenableFutureTask a1) throws Throwable;
private static native void __monitorExit533_9(java.util.Queue a0) throws Throwable;
private static native java.lang.Object __call533_10(java.util.concurrent.Callable a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call533_11(java.lang.Object a0) throws Throwable;
private static native java.lang.Throwable __call3053300_0(java.lang.Exception a0) throws Throwable;
private static native void __monitorExit3053301_0(java.util.Queue a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call3053302_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> moom.qY __sourceHandlerCall_ae36b49c998fc0c8198d(net.minecraft.client.Minecraft a0, moom.qY a1) throws E;
private static final class __SourceHandler_ae36b49c998fc0c8198d {

public static moom.qY f1259(net.minecraft.client.Minecraft receiver, moom.qY p0) throws Throwable {
    moom.qY forwardValue1259_77_0;
    int[] spill1259_0;
    moom.qY spill1259_1;
    long life2_3;
    int[] life4_26;
    forward_join_77: {
    forward_join_76: {
    life2_3 = (__fieldRead1259_0() ^ 8461216829769L);
    __call1259_3(__call1259_1(p0), "Launched Version", __invokedynamic1259_2(receiver));
    spill1259_0 = __call1259_4();
    __call1259_7(__call1259_5(p0), "LWJGL", __invokedynamic1259_6());
    __call1259_10(__call1259_8(p0), "OpenGL", __invokedynamic1259_9());
    __call1259_13(__call1259_11(p0), "GL Caps", __invokedynamic1259_12());
    life4_26 = spill1259_0;
    __call1259_16(__call1259_14(p0), "Using VBOs", __invokedynamic1259_15(receiver));
    __call1259_19(__call1259_17(p0), "Is Modded", __invokedynamic1259_18());
    __call1259_22(__call1259_20(p0), "Type", __invokedynamic1259_21());
    __call1259_25(__call1259_23(p0), "Resource Packs", __invokedynamic1259_24(receiver));
    __call1259_28(__call1259_26(p0), "Current Language", __invokedynamic1259_27(receiver));
    __call1259_31(__call1259_29(p0), "Profiler Position", __invokedynamic1259_30(receiver));
    spill1259_1 = p0;
    if (!((life4_26 != null))) {
        forwardValue1259_77_0 = spill1259_1;
        break forward_join_77;
    }
    __call1259_34(__call1259_32(spill1259_1), "CPU", __invokedynamic1259_33());
    if (!((__fieldRead1259_35(receiver) != null))) {
        break forward_join_76;
    }
    __call1259_37(__fieldRead1259_36(receiver), p0);
    }
    forwardValue1259_77_0 = p0;
    }
    return forwardValue1259_77_0;
}
public static void h1259_0(moom.Oo p0) throws Throwable {
    throw __call1125900_0(p0);
}
public static void h1259_1(moom.Oo p0) throws Throwable {
    throw __call1125901_0(p0);
}
private static native long __fieldRead1259_0() throws Throwable;
private static native moom.qZ __call1259_1(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1259_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native int[] __call1259_4() throws Throwable;
private static native moom.qZ __call1259_5(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_6() throws Throwable;
private static native void __call1259_7(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.qZ __call1259_8(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_9() throws Throwable;
private static native void __call1259_10(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.qZ __call1259_11(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_12() throws Throwable;
private static native void __call1259_13(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.qZ __call1259_14(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1259_16(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.qZ __call1259_17(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_18() throws Throwable;
private static native void __call1259_19(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.qZ __call1259_20(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_21() throws Throwable;
private static native void __call1259_22(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.qZ __call1259_23(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1259_25(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.qZ __call1259_26(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1259_28(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.qZ __call1259_29(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1259_31(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.qZ __call1259_32(moom.qY a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1259_33() throws Throwable;
private static native void __call1259_34(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1259_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1259_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qZ __call1259_37(net.minecraft.client.multiplayer.WorldClient a0, moom.qY a1) throws Throwable;
private static native java.lang.Throwable __call1125900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1125901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0c33137498cd063ee89b(net.minecraft.client.Minecraft a0, moom.yK a1) throws E;
private static final class __SourceHandler_0c33137498cd063ee89b {

public static void f534(net.minecraft.client.Minecraft receiver, moom.yK p0) throws Throwable {
    long life2_3;
    int[] life4_5;
    net.minecraft.network.NetworkManager life5_9;
    moom.yE life6_12;
    life2_3 = (__fieldRead534_0() ^ 137436349833386L);
    life4_5 = __call534_1();
    life5_9 = __call534_3(__call534_2(receiver));
    life6_12 = __call534_4(life5_9);
    if ((life4_5 != null)) {
        if (__call534_6(__call534_5(life5_9))) {
        __call534_7(p0, life6_12);
    } else {
        
    }
    } else {
        
    }
    return;
}
public static void h534_0(moom.On p0) throws Throwable {
    throw __call3053400_0(p0);
}
public static void h534_1(moom.On p0) throws Throwable {
    moom.On life1_2;
    life1_2 = p0;
    return;
}
public static void h534_2(java.lang.Exception p0) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3053402_0(life1_2);
    return;
}
public static void h534_3(java.lang.Exception p0, net.minecraft.network.NetworkManager p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3053403_0(life1_2);
    return;
}
private static native long __fieldRead534_0() throws Throwable;
private static native int[] __call534_1() throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call534_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __call534_3(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native moom.yE __call534_4(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.Channel __call534_5(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native boolean __call534_6(io.netty.channel.Channel a0) throws Throwable;
private static native void __call534_7(moom.yK a0, moom.yE a1) throws Throwable;
private static native java.lang.Throwable __call3053400_0(moom.On a0) throws Throwable;
private static native void __call3053402_0(java.lang.Exception a0) throws Throwable;
private static native void __call3053403_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8334e3bab4640965b5d4(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws E;
private static final class __SourceHandler_8334e3bab4640965b5d4 {

public static void f20(net.minecraft.client.Minecraft receiver, net.minecraft.client.gui.GuiScreen p0) throws Throwable {
    net.minecraft.client.gui.GuiScreen forestValue20_15_0;
    net.minecraft.client.gui.GuiScreen forestValue20_28_0;
    net.minecraft.client.gui.GuiScreen forestValue20_44_0;
    int forestValue20_47_0;
    net.minecraft.client.gui.GuiScreen forestValue20_62_0;
    net.minecraft.client.gui.GuiScreen spill20_0;
    int spill20_1;
    long life2_3;
    int[] life4_5;
    moom.ir life5_97;
    int life6_100;
    int life7_103;
    forest_join_91: {
    forest_join_89: {
    forest_join_86: {
    forest_join_62: {
    forest_join_56: {
    forest_join_47: {
    forest_join_44: {
    forest_join_43: {
    forest_join_28: {
    forest_join_27: {
    forest_join_15: {
    forest_join_14: {
    life2_3 = (__fieldRead20_0() ^ 57624305613580L);
    life4_5 = __call20_1();
    spill20_0 = __fieldRead20_2(receiver);
    if (!((life4_5 != null))) {
        forestValue20_15_0 = spill20_0;
        break forest_join_15;
    }
    if (!((spill20_0 != null))) {
        break forest_join_14;
    }
    __call20_4(__fieldRead20_3(receiver));
    }
    forestValue20_15_0 = p0;
    }
    if (!((life4_5 != null))) {
        forestValue20_28_0 = forestValue20_15_0;
        break forest_join_28;
    }
    if (!((forestValue20_15_0 == null))) {
        break forest_join_27;
    }
    if (!((__fieldRead20_5(receiver) == null))) {
        break forest_join_27;
    }
    p0 = new net.minecraft.client.gui.GuiMainMenu();
    if (!((life4_5 == null))) {
        break forest_join_43;
    }
    }
    forestValue20_28_0 = p0;
    }
    if (!((life4_5 != null))) {
        forestValue20_44_0 = forestValue20_28_0;
        break forest_join_44;
    }
    if (!((forestValue20_28_0 == null))) {
        break forest_join_43;
    }
    spill20_1 = __numericCompare20_8(__call20_7(__fieldRead20_6(receiver)), 0x0.0p0f);
    if (!((life4_5 != null))) {
        forestValue20_47_0 = spill20_1;
        break forest_join_47;
    }
    if (!((spill20_1 <= 0))) {
        break forest_join_43;
    }
    p0 = new net.minecraft.client.gui.GuiGameOver();
    }
    forestValue20_44_0 = p0;
    }
    if (!((life4_5 != null))) {
        forestValue20_62_0 = forestValue20_44_0;
        break forest_join_62;
    }
    forestValue20_47_0 = __instanceOf20_9(forestValue20_44_0);
    }
    if (!((forestValue20_47_0 != 0))) {
        break forest_join_56;
    }
    __fieldWrite20_11(__fieldRead20_10(receiver), 0);
    __call20_14(__call20_13(__fieldRead20_12(receiver)));
    }
    __fieldWrite20_15(receiver, p0);
    if (!((life4_5 != null))) {
        break forest_join_89;
    }
    forestValue20_62_0 = p0;
    }
    if (!((forestValue20_62_0 != null))) {
        break forest_join_86;
    }
    __call20_16(receiver);
    life5_97 = new moom.ir(receiver);
    life6_100 = __call20_17(life5_97);
    life7_103 = __call20_18(life5_97);
    __call20_19(p0, receiver, life6_100, life7_103);
    __fieldWrite20_20(receiver, 0);
    if (!((life4_5 == null))) {
        break forest_join_91;
    }
    }
    __call20_22(__fieldRead20_21(receiver));
    }
    __call20_23(receiver);
    }
    return;
}
public static void h20_0(moom.Oo p0) throws Throwable {
    throw __call3002000_0(p0);
}
public static void h20_1(moom.Oo p0) throws Throwable {
    throw __call3002001_0(p0);
}
public static void h20_2(moom.Oo p0) throws Throwable {
    throw __call3002002_0(p0);
}
public static void h20_3(moom.Oo p0) throws Throwable {
    throw __call3002003_0(p0);
}
public static void h20_4(moom.Oo p0) throws Throwable {
    throw __call3002004_0(p0);
}
public static void h20_5(moom.Oo p0) throws Throwable {
    throw __call3002005_0(p0);
}
public static void h20_6(moom.Oo p0) throws Throwable {
    throw __call3002006_0(p0);
}
public static void h20_7(moom.Oo p0) throws Throwable {
    throw __call3002007_0(p0);
}
public static void h20_8(moom.Oo p0) throws Throwable {
    throw __call3002008_0(p0);
}
public static void h20_9(moom.Oo p0) throws Throwable {
    throw __call3002009_0(p0);
}
public static void h20_10(moom.Oo p0) throws Throwable {
    throw __call3002010_0(p0);
}
public static void h20_11(moom.Oo p0) throws Throwable {
    throw __call3002011_0(p0);
}
private static native long __fieldRead20_0() throws Throwable;
private static native int[] __call20_1() throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead20_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead20_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call20_4(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead20_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead20_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call20_7(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __numericCompare20_8(float a0, float a1) throws Throwable;
private static native int __instanceOf20_9(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead20_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite20_11(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead20_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call20_13(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call20_14(moom.gB a0) throws Throwable;
private static native void __fieldWrite20_15(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native void __call20_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call20_17(moom.ir a0) throws Throwable;
private static native int __call20_18(moom.ir a0) throws Throwable;
private static native void __call20_19(net.minecraft.client.gui.GuiScreen a0, net.minecraft.client.Minecraft a1, int a2, int a3) throws Throwable;
private static native void __fieldWrite20_20(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead20_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call20_22(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native void __call20_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Throwable __call3002000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002011_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bfebd81fe6ec8851c1aa(net.minecraft.client.Minecraft a0, net.minecraft.client.multiplayer.WorldClient a1, java.lang.String a2) throws E;
private static final class __SourceHandler_bfebd81fe6ec8851c1aa {

public static void f1260(net.minecraft.client.Minecraft receiver, net.minecraft.client.multiplayer.WorldClient p0, java.lang.String p1) throws Throwable {
    net.minecraft.client.network.NetHandlerPlayClient forwardValue1260_18_0;
    net.minecraft.client.Minecraft forwardValue1260_43_0;
    moom.fL forwardValue1260_63_0;
    net.minecraft.client.multiplayer.WorldClient forwardValue1260_95_0;
    net.minecraft.client.Minecraft forwardValue1260_106_0;
    net.minecraft.client.Minecraft forwardValue1260_115_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue1260_143_0;
    net.minecraft.client.network.NetHandlerPlayClient spill1260_0;
    net.minecraft.client.Minecraft spill1260_1;
    net.minecraft.client.Minecraft spill1260_2;
    moom.fL spill1260_3;
    net.minecraft.client.multiplayer.WorldClient spill1260_4;
    net.minecraft.client.multiplayer.WorldClient spill1260_5;
    net.minecraft.client.Minecraft spill1260_6;
    net.minecraft.client.entity.EntityPlayerSP spill1260_7;
    long life3_3;
    int[] life5_5;
    net.minecraft.client.network.NetHandlerPlayClient life6_15;
    forward_join_166: {
    forward_join_163: {
    forward_join_160: {
    forward_join_143: {
    forward_join_133: {
    forward_join_115: {
    forward_join_114: {
    forward_join_106: {
    forward_join_105: {
    forward_join_95: {
    forward_join_86: {
    forward_join_65: {
    forward_join_63: {
    forward_join_52: {
    forward_join_46: {
    forward_join_43: {
    forward_join_36: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (__fieldRead1260_0() ^ 40726349755594L);
    life5_5 = __call1260_1();
    if (!((life5_5 != null))) {
        break forward_join_52;
    }
    if (!((p0 == null))) {
        break forward_join_46;
    }
    life6_15 = __call1260_2(receiver);
    spill1260_0 = life6_15;
    if (!((life5_5 != null))) {
        forwardValue1260_18_0 = spill1260_0;
        break forward_join_18;
    }
    if (!((spill1260_0 != null))) {
        break forward_join_19;
    }
    forwardValue1260_18_0 = life6_15;
    }
    __call1260_3(forwardValue1260_18_0);
    }
    spill1260_1 = receiver;
    if (!((life5_5 != null))) {
        forwardValue1260_43_0 = spill1260_1;
        break forward_join_43;
    }
    if (!((__fieldRead1260_4(spill1260_1) != null))) {
        break forward_join_36;
    }
    spill1260_2 = receiver;
    if (!((life5_5 != null))) {
        forwardValue1260_43_0 = spill1260_2;
        break forward_join_43;
    }
    if (!(__call1260_6(__fieldRead1260_5(spill1260_2)))) {
        break forward_join_36;
    }
    __call1260_8(__fieldRead1260_7(receiver));
    __call1260_10(__fieldRead1260_9(receiver));
    }
    __fieldWrite1260_11(receiver, null);
    __call1260_13(__fieldRead1260_12(receiver));
    forwardValue1260_43_0 = receiver;
    }
    __call1260_16(__call1260_15(__fieldRead1260_14(forwardValue1260_43_0)));
    }
    __fieldWrite1260_17(receiver, null);
    __fieldWrite1260_18(receiver, null);
    }
    spill1260_3 = __fieldRead1260_19(receiver);
    if (!((life5_5 != null))) {
        forwardValue1260_63_0 = spill1260_3;
        break forward_join_63;
    }
    if (!((spill1260_3 != null))) {
        break forward_join_65;
    }
    __call1260_21(__fieldRead1260_20(receiver), p1);
    forwardValue1260_63_0 = __fieldRead1260_22(receiver);
    }
    __call1260_23(forwardValue1260_63_0, "");
    }
    spill1260_4 = p0;
    if (!((life5_5 != null))) {
        forwardValue1260_95_0 = spill1260_4;
        break forward_join_95;
    }
    if (!((spill1260_4 == null))) {
        break forward_join_86;
    }
    spill1260_5 = __fieldRead1260_24(receiver);
    if (!((life5_5 != null))) {
        forwardValue1260_95_0 = spill1260_5;
        break forward_join_95;
    }
    if (!((spill1260_5 != null))) {
        break forward_join_86;
    }
    __call1260_26(__fieldRead1260_25(receiver));
    __call1260_28(__fieldRead1260_27(receiver));
    __call1260_29(receiver, null);
    __fieldWrite1260_30(receiver, 0);
    }
    __call1260_32(__fieldRead1260_31(receiver));
    __fieldWrite1260_33(receiver, p0);
    if (!((life5_5 != null))) {
        break forward_join_163;
    }
    forwardValue1260_95_0 = p0;
    }
    if (!((forwardValue1260_95_0 != null))) {
        break forward_join_160;
    }
    spill1260_6 = receiver;
    if (!((life5_5 != null))) {
        forwardValue1260_106_0 = spill1260_6;
        break forward_join_106;
    }
    if (!((__fieldRead1260_34(spill1260_6) != null))) {
        break forward_join_105;
    }
    __call1260_36(__fieldRead1260_35(receiver), p0);
    }
    forwardValue1260_106_0 = receiver;
    }
    if (!((life5_5 != null))) {
        forwardValue1260_115_0 = forwardValue1260_106_0;
        break forward_join_115;
    }
    if (!((__fieldRead1260_37(forwardValue1260_106_0) != null))) {
        break forward_join_114;
    }
    __call1260_39(__fieldRead1260_38(receiver), p0);
    }
    forwardValue1260_115_0 = receiver;
    }
    spill1260_7 = __fieldRead1260_40(forwardValue1260_115_0);
    if (!((life5_5 != null))) {
        forwardValue1260_143_0 = spill1260_7;
        break forward_join_143;
    }
    if (!((spill1260_7 == null))) {
        break forward_join_133;
    }
    __fieldWrite1260_43(receiver, __call1260_42(__fieldRead1260_41(receiver), p0, new moom.B2()));
    __call1260_46(__fieldRead1260_44(receiver), __fieldRead1260_45(receiver));
    }
    __call1260_48(__fieldRead1260_47(receiver));
    __call1260_50(p0, __fieldRead1260_49(receiver));
    forwardValue1260_143_0 = __fieldRead1260_51(receiver);
    }
    __fieldWrite1260_53(forwardValue1260_143_0, new moom.Dv(__fieldRead1260_52(receiver)));
    __call1260_56(__fieldRead1260_54(receiver), __fieldRead1260_55(receiver));
    __fieldWrite1260_58(receiver, __fieldRead1260_57(receiver));
    if (!((life5_5 == null))) {
        break forward_join_166;
    }
    }
    __call1260_60(__fieldRead1260_59(receiver));
    }
    __fieldWrite1260_61(receiver, null);
    }
    __fieldWrite1260_62(receiver, 0L);
    return;
}
public static void h1260_0(moom.Oo p0) throws Throwable {
    throw __call1126000_0(p0);
}
public static void h1260_1(moom.Oo p0) throws Throwable {
    throw __call1126001_0(p0);
}
public static void h1260_2(moom.Oo p0) throws Throwable {
    throw __call1126002_0(p0);
}
public static void h1260_3(moom.Oo p0) throws Throwable {
    throw __call1126003_0(p0);
}
public static void h1260_4(moom.Oo p0) throws Throwable {
    throw __call1126004_0(p0);
}
public static void h1260_5(moom.Oo p0) throws Throwable {
    throw __call1126005_0(p0);
}
public static void h1260_6(moom.Oo p0) throws Throwable {
    throw __call1126006_0(p0);
}
public static void h1260_7(moom.Oo p0) throws Throwable {
    throw __call1126007_0(p0);
}
public static void h1260_8(moom.Oo p0) throws Throwable {
    throw __call1126008_0(p0);
}
public static void h1260_9(moom.Oo p0) throws Throwable {
    throw __call1126009_0(p0);
}
public static void h1260_10(moom.Oo p0) throws Throwable {
    throw __call1126010_0(p0);
}
public static void h1260_11(moom.Oo p0) throws Throwable {
    throw __call1126011_0(p0);
}
public static void h1260_12(moom.Oo p0) throws Throwable {
    throw __call1126012_0(p0);
}
public static void h1260_13(moom.Oo p0) throws Throwable {
    throw __call1126013_0(p0);
}
public static void h1260_14(moom.Oo p0) throws Throwable {
    throw __call1126014_0(p0);
}
public static void h1260_15(moom.Oo p0) throws Throwable {
    throw __call1126015_0(p0);
}
public static void h1260_16(moom.Oo p0) throws Throwable {
    throw __call1126016_0(p0);
}
public static void h1260_17(moom.Oo p0) throws Throwable {
    throw __call1126017_0(p0);
}
public static void h1260_18(moom.Oo p0) throws Throwable {
    throw __call1126018_0(p0);
}
public static void h1260_19(moom.Oo p0) throws Throwable {
    throw __call1126019_0(p0);
}
public static void h1260_20(moom.Oo p0) throws Throwable {
    throw __call1126020_0(p0);
}
private static native long __fieldRead1260_0() throws Throwable;
private static native int[] __call1260_1() throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call1260_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_3(net.minecraft.client.network.NetHandlerPlayClient a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1260_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1260_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1260_6(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1260_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_8(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1260_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_10(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native void __fieldWrite1260_11(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native moom.hK __fieldRead1260_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_13(moom.hK a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead1260_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.MapItemRenderer __call1260_15(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call1260_16(net.minecraft.client.gui.MapItemRenderer a0) throws Throwable;
private static native void __fieldWrite1260_17(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite1260_18(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native moom.fL __fieldRead1260_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.fL __fieldRead1260_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_21(moom.fL a0, java.lang.String a1) throws Throwable;
private static native moom.fL __fieldRead1260_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_23(moom.fL a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1260_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead1260_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_26(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1260_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_28(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call1260_29(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite1260_30(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead1260_31(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_32(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native void __fieldWrite1260_33(net.minecraft.client.Minecraft a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead1260_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead1260_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_36(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead1260_37(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead1260_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_39(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.client.multiplayer.WorldClient a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1260_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.jI __fieldRead1260_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __call1260_42(moom.jI a0, net.minecraft.client.multiplayer.WorldClient a1, moom.B2 a2) throws Throwable;
private static native void __fieldWrite1260_43(net.minecraft.client.Minecraft a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native moom.jI __fieldRead1260_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1260_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_46(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1260_47(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_48(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1260_49(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1260_50(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1260_51(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1260_52(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1260_53(net.minecraft.client.entity.EntityPlayerSP a0, moom.Dv a1) throws Throwable;
private static native moom.jI __fieldRead1260_54(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1260_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_56(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1260_57(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1260_58(net.minecraft.client.Minecraft a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.world.storage.ISaveFormat __fieldRead1260_59(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1260_60(net.minecraft.world.storage.ISaveFormat a0) throws Throwable;
private static native void __fieldWrite1260_61(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite1260_62(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1126000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126020_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_798cdf07f09b2e5c8fe7(net.minecraft.client.Minecraft a0, net.minecraft.client.renderer.texture.TextureManager a1) throws E;
private static final class __SourceHandler_798cdf07f09b2e5c8fe7 {

public static void f100140(net.minecraft.client.Minecraft receiver, net.minecraft.client.renderer.texture.TextureManager p0) throws Throwable {
    int spill100140_0;
    long spill100140_1;
    int spill100140_2;
    long spill100140_3;
    long life2_3;
    moom.ir life4_8;
    int life5_11;
    net.minecraft.client.shader.Framebuffer life6_24;
    java.lang.Object life7_62;
    java.io.InputStream life7_67;
    net.minecraft.client.renderer.Tessellator life8_86;
    moom.lw life9_89;
    int life10_238;
    int life11_244;
    life2_3 = (__fieldRead100140_0() ^ 138169429876525L);
    life4_8 = new moom.ir(receiver);
    life5_11 = __call100140_1(life4_8);
    life6_24 = new net.minecraft.client.shader.Framebuffer((__call100140_2(life4_8) * life5_11), (__call100140_3(life4_8) * life5_11), true);
    __call100140_4(life6_24, 0);
    __call100140_6(__invokedynamic100140_5(27384, (7615475814085472773L ^ life2_3)));
    __call100140_7();
    __call100140_10(0x0.0p0d, ((double) __call100140_8(life4_8)), ((double) __call100140_9(life4_8)), 0x0.0p0d, 0x1.f4p9d, 0x1.77p11d);
    __call100140_12(__invokedynamic100140_11(16465, (1609101703934613700L ^ life2_3)));
    __call100140_13();
    __call100140_14(0x0.0p0f, 0x0.0p0f, -0x1.f4p10f);
    __call100140_15();
    __call100140_16();
    __call100140_17();
    __call100140_18();
    life7_62 = null;
    life7_67 = __call100140_21(__fieldRead100140_19(receiver), __fieldRead100140_20());
    __fieldWrite100140_24(receiver, __call100140_23(p0, "logo", new moom.n3(__call100140_22(life7_67))));
    __call100140_26(p0, __fieldRead100140_25(receiver));
    __call100140_27(life7_67);
    life8_86 = __call100140_28();
    life9_89 = __call100140_29(life8_86);
    __call100140_32(life9_89, __invokedynamic100140_30(4575, (813571106182449483L ^ life2_3)), __fieldRead100140_31());
    __call100140_41(__call100140_40(__call100140_35(__call100140_34(life9_89, 0x0.0p0d, ((double) __fieldRead100140_33(receiver)), 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic100140_36(29823, (7235322749376376034L ^ life2_3)), __invokedynamic100140_37(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_38(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_39(16959, (8633661797279505055L ^ life2_3))));
    __call100140_51(__call100140_50(__call100140_45(__call100140_44(life9_89, ((double) __fieldRead100140_42(receiver)), ((double) __fieldRead100140_43(receiver)), 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic100140_46(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_47(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_48(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_49(16959, (8633661797279505055L ^ life2_3))));
    __call100140_60(__call100140_59(__call100140_54(__call100140_53(life9_89, ((double) __fieldRead100140_52(receiver)), 0x0.0p0d, 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic100140_55(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_56(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_57(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_58(16959, (8633661797279505055L ^ life2_3))));
    __call100140_68(__call100140_67(__call100140_62(__call100140_61(life9_89, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic100140_63(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_64(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_65(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_66(16959, (8633661797279505055L ^ life2_3))));
    spill100140_0 = 17470;
    __call100140_69(life8_86);
    spill100140_1 = (8346233788988693668L ^ life2_3);
    __call100140_70(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    life10_238 = __invokedynamic100140_71(spill100140_0, spill100140_1);
    life11_244 = __invokedynamic100140_72(17470, (8346233788988693668L ^ life2_3));
    __call100140_79(receiver, ((__call100140_73(life4_8) - life10_238) / 2), ((__call100140_74(life4_8) - life11_244) / 2), 0, 0, life10_238, life11_244, __invokedynamic100140_75(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_76(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_77(16959, (8633661797279505055L ^ life2_3)), __invokedynamic100140_78(16959, (8633661797279505055L ^ life2_3)));
    spill100140_2 = 10024;
    __call100140_80();
    spill100140_3 = (7088460525174751194L ^ life2_3);
    __call100140_81();
    __call100140_82(life6_24);
    __call100140_85(life6_24, (__call100140_83(life4_8) * life5_11), (__call100140_84(life4_8) * life5_11));
    __call100140_86();
    __call100140_88(__invokedynamic100140_87(spill100140_2, spill100140_3), 0x1.99999ap-4f);
    __call100140_89(receiver);
    return;
}
public static void h100140_0(java.io.IOException p0, net.minecraft.client.Minecraft p1, long p2, moom.ir p3, int p4, net.minecraft.client.shader.Framebuffer p5, java.io.InputStream p6) throws Throwable {
    int spill13014000_0;
    long spill13014000_1;
    int spill13014000_2;
    long spill13014000_3;
    java.io.IOException life8_2;
    net.minecraft.client.renderer.Tessellator life8_12;
    moom.lw life9_15;
    int life10_164;
    int life11_170;
    life8_2 = p0;
    __call13014000_3(__fieldRead13014000_0(), __invokedynamic13014000_2(__fieldRead13014000_1()), life8_2);
    __call13014000_4(p6);
    life8_12 = __call13014000_5();
    life9_15 = __call13014000_6(life8_12);
    __call13014000_9(life9_15, __invokedynamic13014000_7(4575, (813571106182449483L ^ p2)), __fieldRead13014000_8());
    __call13014000_18(__call13014000_17(__call13014000_12(__call13014000_11(life9_15, 0x0.0p0d, ((double) __fieldRead13014000_10(p1)), 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic13014000_13(29823, (7235322749376376034L ^ p2)), __invokedynamic13014000_14(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_15(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_16(16959, (8633661797279505055L ^ p2))));
    __call13014000_28(__call13014000_27(__call13014000_22(__call13014000_21(life9_15, ((double) __fieldRead13014000_19(p1)), ((double) __fieldRead13014000_20(p1)), 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic13014000_23(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_24(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_25(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_26(16959, (8633661797279505055L ^ p2))));
    __call13014000_37(__call13014000_36(__call13014000_31(__call13014000_30(life9_15, ((double) __fieldRead13014000_29(p1)), 0x0.0p0d, 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic13014000_32(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_33(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_34(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_35(16959, (8633661797279505055L ^ p2))));
    __call13014000_45(__call13014000_44(__call13014000_39(__call13014000_38(life9_15, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic13014000_40(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_41(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_42(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_43(16959, (8633661797279505055L ^ p2))));
    spill13014000_0 = 17470;
    __call13014000_46(life8_12);
    spill13014000_1 = (8346233788988693668L ^ p2);
    __call13014000_47(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    life10_164 = __invokedynamic13014000_48(spill13014000_0, spill13014000_1);
    life11_170 = __invokedynamic13014000_49(17470, (8346233788988693668L ^ p2));
    __call13014000_56(p1, ((__call13014000_50(p3) - life10_164) / 2), ((__call13014000_51(p3) - life11_170) / 2), 0, 0, life10_164, life11_170, __invokedynamic13014000_52(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_53(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_54(16959, (8633661797279505055L ^ p2)), __invokedynamic13014000_55(16959, (8633661797279505055L ^ p2)));
    spill13014000_2 = 10024;
    __call13014000_57();
    spill13014000_3 = (7088460525174751194L ^ p2);
    __call13014000_58();
    __call13014000_59(p5);
    __call13014000_62(p5, (__call13014000_60(p3) * p4), (__call13014000_61(p3) * p4));
    __call13014000_63();
    __call13014000_65(__invokedynamic13014000_64(spill13014000_2, spill13014000_3), 0x1.99999ap-4f);
    __call13014000_66(p1);
    return;
}
public static void h100140_1(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call13014001_0(p1);
    throw life2_2;
}
private static native long __fieldRead100140_0() throws Throwable;
private static native int __call100140_1(moom.ir a0) throws Throwable;
private static native int __call100140_2(moom.ir a0) throws Throwable;
private static native int __call100140_3(moom.ir a0) throws Throwable;
private static native void __call100140_4(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native int __invokedynamic100140_5(int a0, long a1) throws Throwable;
private static native void __call100140_6(int a0) throws Throwable;
private static native void __call100140_7() throws Throwable;
private static native int __call100140_8(moom.ir a0) throws Throwable;
private static native int __call100140_9(moom.ir a0) throws Throwable;
private static native void __call100140_10(double a0, double a1, double a2, double a3, double a4, double a5) throws Throwable;
private static native int __invokedynamic100140_11(int a0, long a1) throws Throwable;
private static native void __call100140_12(int a0) throws Throwable;
private static native void __call100140_13() throws Throwable;
private static native void __call100140_14(float a0, float a1, float a2) throws Throwable;
private static native void __call100140_15() throws Throwable;
private static native void __call100140_16() throws Throwable;
private static native void __call100140_17() throws Throwable;
private static native void __call100140_18() throws Throwable;
private static native moom.oK __fieldRead100140_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead100140_20() throws Throwable;
private static native java.io.InputStream __call100140_21(moom.oK a0, moom.DD a1) throws Throwable;
private static native java.awt.image.BufferedImage __call100140_22(java.io.InputStream a0) throws Throwable;
private static native moom.DD __call100140_23(net.minecraft.client.renderer.texture.TextureManager a0, java.lang.String a1, moom.n3 a2) throws Throwable;
private static native void __fieldWrite100140_24(net.minecraft.client.Minecraft a0, moom.DD a1) throws Throwable;
private static native moom.DD __fieldRead100140_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100140_26(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call100140_27(java.io.InputStream a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call100140_28() throws Throwable;
private static native moom.lw __call100140_29(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic100140_30(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead100140_31() throws Throwable;
private static native void __call100140_32(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __fieldRead100140_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.lw __call100140_34(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call100140_35(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic100140_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_39(int a0, long a1) throws Throwable;
private static native moom.lw __call100140_40(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call100140_41(moom.lw a0) throws Throwable;
private static native int __fieldRead100140_42(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead100140_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.lw __call100140_44(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call100140_45(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic100140_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_49(int a0, long a1) throws Throwable;
private static native moom.lw __call100140_50(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call100140_51(moom.lw a0) throws Throwable;
private static native int __fieldRead100140_52(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.lw __call100140_53(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call100140_54(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic100140_55(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_58(int a0, long a1) throws Throwable;
private static native moom.lw __call100140_59(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call100140_60(moom.lw a0) throws Throwable;
private static native moom.lw __call100140_61(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call100140_62(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic100140_63(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_64(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_65(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_66(int a0, long a1) throws Throwable;
private static native moom.lw __call100140_67(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call100140_68(moom.lw a0) throws Throwable;
private static native void __call100140_69(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call100140_70(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic100140_71(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_72(int a0, long a1) throws Throwable;
private static native int __call100140_73(moom.ir a0) throws Throwable;
private static native int __call100140_74(moom.ir a0) throws Throwable;
private static native int __invokedynamic100140_75(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_76(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_77(int a0, long a1) throws Throwable;
private static native int __invokedynamic100140_78(int a0, long a1) throws Throwable;
private static native void __call100140_79(net.minecraft.client.Minecraft a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10) throws Throwable;
private static native void __call100140_80() throws Throwable;
private static native void __call100140_81() throws Throwable;
private static native void __call100140_82(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __call100140_83(moom.ir a0) throws Throwable;
private static native int __call100140_84(moom.ir a0) throws Throwable;
private static native void __call100140_85(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws Throwable;
private static native void __call100140_86() throws Throwable;
private static native int __invokedynamic100140_87(int a0, long a1) throws Throwable;
private static native void __call100140_88(int a0, float a1) throws Throwable;
private static native void __call100140_89(net.minecraft.client.Minecraft a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead13014000_0() throws Throwable;
private static native moom.DD __fieldRead13014000_1() throws Throwable;
private static native java.lang.String __invokedynamic13014000_2(moom.DD a0) throws Throwable;
private static native void __call13014000_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native void __call13014000_4(java.io.InputStream a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call13014000_5() throws Throwable;
private static native moom.lw __call13014000_6(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic13014000_7(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead13014000_8() throws Throwable;
private static native void __call13014000_9(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native int __fieldRead13014000_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.lw __call13014000_11(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call13014000_12(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic13014000_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_16(int a0, long a1) throws Throwable;
private static native moom.lw __call13014000_17(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call13014000_18(moom.lw a0) throws Throwable;
private static native int __fieldRead13014000_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead13014000_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.lw __call13014000_21(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call13014000_22(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic13014000_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_26(int a0, long a1) throws Throwable;
private static native moom.lw __call13014000_27(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call13014000_28(moom.lw a0) throws Throwable;
private static native int __fieldRead13014000_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.lw __call13014000_30(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call13014000_31(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic13014000_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_35(int a0, long a1) throws Throwable;
private static native moom.lw __call13014000_36(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call13014000_37(moom.lw a0) throws Throwable;
private static native moom.lw __call13014000_38(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call13014000_39(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic13014000_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_43(int a0, long a1) throws Throwable;
private static native moom.lw __call13014000_44(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call13014000_45(moom.lw a0) throws Throwable;
private static native void __call13014000_46(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call13014000_47(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic13014000_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_49(int a0, long a1) throws Throwable;
private static native int __call13014000_50(moom.ir a0) throws Throwable;
private static native int __call13014000_51(moom.ir a0) throws Throwable;
private static native int __invokedynamic13014000_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_53(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic13014000_55(int a0, long a1) throws Throwable;
private static native void __call13014000_56(net.minecraft.client.Minecraft a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10) throws Throwable;
private static native void __call13014000_57() throws Throwable;
private static native void __call13014000_58() throws Throwable;
private static native void __call13014000_59(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __call13014000_60(moom.ir a0) throws Throwable;
private static native int __call13014000_61(moom.ir a0) throws Throwable;
private static native void __call13014000_62(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws Throwable;
private static native void __call13014000_63() throws Throwable;
private static native int __invokedynamic13014000_64(int a0, long a1) throws Throwable;
private static native void __call13014000_65(int a0, float a1) throws Throwable;
private static native void __call13014000_66(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call13014001_0(java.io.InputStream a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceHandlerCall_eab7c6e614f09989b934(net.minecraft.client.Minecraft a0, net.minecraft.item.Item a1, int a2, net.minecraft.tileentity.TileEntity a3) throws E;
private static final class __SourceHandler_eab7c6e614f09989b934 {

public static net.minecraft.item.ItemStack f1261(net.minecraft.client.Minecraft receiver, net.minecraft.item.Item p0, int p1, net.minecraft.tileentity.TileEntity p2) throws Throwable {
    net.minecraft.nbt.NBTTagCompound forwardValue1261_55_0;
    int[] spill1261_0;
    net.minecraft.nbt.NBTTagCompound spill1261_1;
    long life4_3;
    net.minecraft.item.ItemStack life7_11;
    net.minecraft.nbt.NBTTagCompound life8_15;
    int[] life6_16;
    net.minecraft.nbt.NBTTagCompound life9_43;
    net.minecraft.nbt.NBTTagCompound life10_47;
    net.minecraft.nbt.NBTTagCompound life9_64;
    net.minecraft.nbt.NBTTagList life10_68;
    forward_join_55: {
    forward_join_52: {
    forward_join_48: {
    life4_3 = (__fieldRead1261_0() ^ 48153855553037L);
    spill1261_0 = __call1261_1();
    life7_11 = new net.minecraft.item.ItemStack(p0, 1, p1);
    life8_15 = new net.minecraft.nbt.NBTTagCompound();
    life6_16 = spill1261_0;
    __call1261_2(p2, life8_15);
    if (!((life6_16 != null))) {
        break forward_join_52;
    }
    if (!((p0 == __fieldRead1261_3()))) {
        break forward_join_48;
    }
    spill1261_1 = life8_15;
    if (!((life6_16 != null))) {
        forwardValue1261_55_0 = spill1261_1;
        break forward_join_55;
    }
    if (!(__call1261_4(spill1261_1, "Owner"))) {
        break forward_join_48;
    }
    life9_43 = __call1261_5(life8_15, "Owner");
    life10_47 = new net.minecraft.nbt.NBTTagCompound();
    __call1261_6(life10_47, "SkullOwner", life9_43);
    __call1261_7(life7_11, life10_47);
    return life7_11;
    }
    __call1261_8(life7_11, "BlockEntityTag", life8_15);
    }
    forwardValue1261_55_0 = new net.minecraft.nbt.NBTTagCompound();
    }
    life9_64 = forwardValue1261_55_0;
    life10_68 = new net.minecraft.nbt.NBTTagList();
    __call1261_9(life10_68, new moom.yA("(+NBT)"));
    __call1261_10(life9_64, "Lore", life10_68);
    __call1261_11(life7_11, "display", life9_64);
    return life7_11;
}
public static void h1261_0(moom.Oo p0) throws Throwable {
    throw __call1126100_0(p0);
}
public static void h1261_1(moom.Oo p0) throws Throwable {
    throw __call1126101_0(p0);
}
public static void h1261_2(moom.Oo p0) throws Throwable {
    throw __call1126102_0(p0);
}
private static native long __fieldRead1261_0() throws Throwable;
private static native int[] __call1261_1() throws Throwable;
private static native void __call1261_2(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.item.Item __fieldRead1261_3() throws Throwable;
private static native boolean __call1261_4(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1261_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1261_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native void __call1261_7(net.minecraft.item.ItemStack a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1261_8(net.minecraft.item.ItemStack a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native void __call1261_9(net.minecraft.nbt.NBTTagList a0, moom.yA a1) throws Throwable;
private static native void __call1261_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native void __call1261_11(net.minecraft.item.ItemStack a0, java.lang.String a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native java.lang.Throwable __call1126100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c3b79a0253d68125a025(net.minecraft.client.Minecraft a0, net.minecraft.profiler.PlayerUsageSnooper a1) throws E;
private static final class __SourceHandler_c3b79a0253d68125a025 {

public static void f1262(net.minecraft.client.Minecraft receiver, net.minecraft.profiler.PlayerUsageSnooper p0) throws Throwable {
    net.minecraft.profiler.PlayerUsageSnooper lexicalValue1262_31_0;
    java.lang.String lexicalValue1262_31_1;
    net.minecraft.profiler.PlayerUsageSnooper lexicalValue1262_32_0;
    java.lang.String lexicalValue1262_32_1;
    java.lang.String lexicalValue1262_32_2;
    java.lang.String lexicalValue1262_64_0;
    net.minecraft.server.integrated.IntegratedServer lexicalValue1262_109_0;
    net.minecraft.profiler.PlayerUsageSnooper lexicalValue1262_114_0;
    int[] spill1262_0;
    net.minecraft.profiler.PlayerUsageSnooper spill1262_1;
    java.lang.String spill1262_2;
    net.minecraft.server.integrated.IntegratedServer spill1262_3;
    net.minecraft.profiler.PlayerUsageSnooper spill1262_4;
    long life2_3;
    int[] life4_10;
    java.lang.String life5_68;
    int life6_82;
    java.util.Iterator life7_87;
    net.minecraft.client.resources.ResourcePackRepository$Entry life8_94;
    lexical_join_120: {
    lexical_join_114: {
    lexical_join_109: {
    lexical_join_102: {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_32: {
    lexical_join_31: {
    life2_3 = (__fieldRead1262_0() ^ 30596384656274L);
    spill1262_0 = __call1262_1();
    __call1262_4(p0, "fps", __call1262_3(__fieldRead1262_2()));
    life4_10 = spill1262_0;
    __call1262_8(p0, "vsync_enabled", __call1262_7(__fieldRead1262_6(__fieldRead1262_5(receiver))));
    __call1262_12(p0, "display_frequency", __call1262_11(__call1262_10(__call1262_9())));
    spill1262_1 = p0;
    spill1262_2 = "display_type";
    if (!(__fieldRead1262_13(receiver))) {
        lexicalValue1262_31_0 = spill1262_1;
        lexicalValue1262_31_1 = spill1262_2;
        break lexical_join_31;
    }
    lexicalValue1262_32_0 = spill1262_1;
    lexicalValue1262_32_1 = spill1262_2;
    lexicalValue1262_32_2 = "fullscreen";
    break lexical_join_32;
    }
    lexicalValue1262_32_0 = lexicalValue1262_31_0;
    lexicalValue1262_32_1 = lexicalValue1262_31_1;
    lexicalValue1262_32_2 = "windowed";
    }
    __call1262_14(lexicalValue1262_32_0, lexicalValue1262_32_1, lexicalValue1262_32_2);
    __call1262_20(p0, "run_time", __call1262_19((((__call1262_15() - __call1262_16(p0)) / __invokedynamic1262_17(17921, (4801142090893637059L ^ life2_3))) * __invokedynamic1262_18(29745, (2821203373783222256L ^ life2_3)))));
    __call1262_22(p0, "current_action", __call1262_21(receiver));
    if (!((__call1262_23() == __fieldRead1262_24()))) {
        break lexical_join_63;
    }
    lexicalValue1262_64_0 = "little";
    break lexical_join_64;
    }
    lexicalValue1262_64_0 = "big";
    }
    life5_68 = lexicalValue1262_64_0;
    __call1262_25(p0, "endianness", life5_68);
    __call1262_30(p0, "resource_packs", __call1262_29(__call1262_28(__call1262_27(__fieldRead1262_26(receiver)))));
    life6_82 = 0;
    life7_87 = __call1262_33(__call1262_32(__fieldRead1262_31(receiver)));
    lexical_cycle_84: while (true) {
    if (!(__call1262_34(life7_87))) {
        break lexical_join_102;
    }
    life8_94 = __cast1262_36(__call1262_35(life7_87));
    __call1262_39(p0, __invokedynamic1262_37((life6_82++)), __call1262_38(life8_94));
    if (!((life4_10 != null))) {
        break lexical_join_120;
    }
    if (!((life4_10 == null))) { continue lexical_cycle_84; }
    break lexical_cycle_84;
    }
    }
    spill1262_3 = __fieldRead1262_40(receiver);
    if (!((life4_10 != null))) {
        lexicalValue1262_109_0 = spill1262_3;
        break lexical_join_109;
    }
    if (!((spill1262_3 != null))) {
        break lexical_join_120;
    }
    lexicalValue1262_109_0 = __fieldRead1262_41(receiver);
    }
    spill1262_4 = __call1262_42(lexicalValue1262_109_0);
    if (!((life4_10 != null))) {
        lexicalValue1262_114_0 = spill1262_4;
        break lexical_join_114;
    }
    if (!((spill1262_4 != null))) {
        break lexical_join_120;
    }
    lexicalValue1262_114_0 = p0;
    }
    __call1262_46(lexicalValue1262_114_0, "snooper_partner", __call1262_45(__call1262_44(__fieldRead1262_43(receiver))));
    }
    return;
}
public static void h1262_0(moom.Oo p0) throws Throwable {
    throw __call1126200_0(p0);
}
public static void h1262_1(moom.Oo p0) throws Throwable {
    throw __call1126201_0(p0);
}
public static void h1262_2(moom.Oo p0) throws Throwable {
    throw __call1126202_0(p0);
}
public static void h1262_3(moom.Oo p0) throws Throwable {
    throw __call1126203_0(p0);
}
public static void h1262_4(moom.Oo p0) throws Throwable {
    throw __call1126204_0(p0);
}
public static void h1262_5(moom.Oo p0) throws Throwable {
    throw __call1126205_0(p0);
}
private static native long __fieldRead1262_0() throws Throwable;
private static native int[] __call1262_1() throws Throwable;
private static native int __fieldRead1262_2() throws Throwable;
private static native java.lang.Integer __call1262_3(int a0) throws Throwable;
private static native void __call1262_4(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1262_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1262_6(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Boolean __call1262_7(boolean a0) throws Throwable;
private static native void __call1262_8(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call1262_9() throws Throwable;
private static native int __call1262_10(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native java.lang.Integer __call1262_11(int a0) throws Throwable;
private static native void __call1262_12(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native boolean __fieldRead1262_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1262_14(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native long __call1262_15() throws Throwable;
private static native long __call1262_16(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native long __invokedynamic1262_17(int a0, long a1) throws Throwable;
private static native long __invokedynamic1262_18(int a0, long a1) throws Throwable;
private static native java.lang.Long __call1262_19(long a0) throws Throwable;
private static native void __call1262_20(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Long a2) throws Throwable;
private static native java.lang.String __call1262_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1262_22(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.nio.ByteOrder __call1262_23() throws Throwable;
private static native java.nio.ByteOrder __fieldRead1262_24() throws Throwable;
private static native void __call1262_25(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead1262_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __call1262_27(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native int __call1262_28(java.util.List a0) throws Throwable;
private static native java.lang.Integer __call1262_29(int a0) throws Throwable;
private static native void __call1262_30(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead1262_31(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __call1262_32(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.Iterator __call1262_33(java.util.List a0) throws Throwable;
private static native boolean __call1262_34(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1262_35(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast1262_36(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic1262_37(int a0) throws Throwable;
private static native java.lang.String __call1262_38(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native void __call1262_39(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1262_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1262_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __call1262_42(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1262_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __call1262_44(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.lang.String __call1262_45(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native void __call1262_46(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Throwable __call1126200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126205_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_349445b6f5f746012230(net.minecraft.client.Minecraft a0, boolean a1) throws E;
private static final class __SourceHandler_349445b6f5f746012230 {

public static void f1263(net.minecraft.client.Minecraft receiver, boolean p0) throws Throwable {
    int forwardValue1263_15_0;
    int forwardValue1263_21_0;
    int forwardValue1263_25_0;
    net.minecraft.client.Minecraft forwardValue1263_53_0;
    net.minecraft.client.Minecraft forwardValue1263_70_0;
    net.minecraft.client.Minecraft forwardValue1263_75_0;
    boolean spill1263_0;
    net.minecraft.client.Minecraft spill1263_1;
    net.minecraft.client.Minecraft spill1263_2;
    net.minecraft.client.Minecraft spill1263_3;
    long life2_3;
    int[] life4_5;
    moom.DT life5_68;
    forward_join_77: {
    forward_join_75: {
    forward_join_74: {
    forward_join_72: {
    forward_join_70: {
    forward_join_53: {
    forward_join_25: {
    forward_join_21: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (__fieldRead1263_0() ^ 122420152122792L);
    life4_5 = __call1263_1();
    spill1263_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue1263_15_0 = __integerCategory1263_2(spill1263_0);
        break forward_join_15;
    }
    if (!((!spill1263_0))) {
        break forward_join_13;
    }
    __fieldWrite1263_3(receiver, 0);
    }
    forwardValue1263_15_0 = __fieldRead1263_4(receiver);
    }
    if (!((life4_5 != null))) {
        forwardValue1263_21_0 = forwardValue1263_15_0;
        break forward_join_21;
    }
    if (!((forwardValue1263_15_0 <= 0))) {
        break forward_join_77;
    }
    forwardValue1263_21_0 = __integerCategory1263_7(__call1263_6(__fieldRead1263_5(receiver)));
    }
    if (!((life4_5 != null))) {
        forwardValue1263_25_0 = forwardValue1263_21_0;
        break forward_join_25;
    }
    if (!((forwardValue1263_21_0 == 0))) {
        break forward_join_77;
    }
    forwardValue1263_25_0 = __integerCategory1263_8(p0);
    }
    if (!((forwardValue1263_25_0 != 0))) {
        break forward_join_74;
    }
    spill1263_1 = receiver;
    if (!((life4_5 != null))) {
        forwardValue1263_75_0 = spill1263_1;
        break forward_join_75;
    }
    if (!((__fieldRead1263_9(spill1263_1) != null))) {
        break forward_join_74;
    }
    spill1263_2 = receiver;
    if (!((life4_5 != null))) {
        forwardValue1263_75_0 = spill1263_2;
        break forward_join_75;
    }
    if (!((__fieldRead1263_11(__fieldRead1263_10(spill1263_2)) == __fieldRead1263_12()))) {
        break forward_join_74;
    }
    life5_68 = __call1263_14(__fieldRead1263_13(receiver));
    spill1263_3 = receiver;
    if (!((life4_5 != null))) {
        forwardValue1263_53_0 = spill1263_3;
        break forward_join_53;
    }
    if (!((__call1263_18(__call1263_17(__call1263_16(__fieldRead1263_15(spill1263_3), life5_68))) != __fieldRead1263_19()))) {
        break forward_join_72;
    }
    forwardValue1263_53_0 = receiver;
    }
    if (!((life4_5 != null))) {
        forwardValue1263_70_0 = forwardValue1263_53_0;
        break forward_join_70;
    }
    if (!(__call1263_23(__fieldRead1263_20(forwardValue1263_53_0), life5_68, __fieldRead1263_22(__fieldRead1263_21(receiver))))) {
        break forward_join_72;
    }
    __call1263_27(__fieldRead1263_24(receiver), life5_68, __fieldRead1263_26(__fieldRead1263_25(receiver)));
    forwardValue1263_70_0 = receiver;
    }
    __call1263_29(__fieldRead1263_28(forwardValue1263_70_0));
    }
    if (!((life4_5 == null))) {
        break forward_join_77;
    }
    }
    forwardValue1263_75_0 = receiver;
    }
    __call1263_31(__fieldRead1263_30(forwardValue1263_75_0));
    }
    return;
}
public static void h1263_0(moom.Oo p0) throws Throwable {
    throw __call1126300_0(p0);
}
public static void h1263_1(moom.Oo p0) throws Throwable {
    throw __call1126301_0(p0);
}
public static void h1263_2(moom.Oo p0) throws Throwable {
    throw __call1126302_0(p0);
}
public static void h1263_3(moom.Oo p0) throws Throwable {
    throw __call1126303_0(p0);
}
public static void h1263_4(moom.Oo p0) throws Throwable {
    throw __call1126304_0(p0);
}
public static void h1263_5(moom.Oo p0) throws Throwable {
    throw __call1126305_0(p0);
}
public static void h1263_6(moom.Oo p0) throws Throwable {
    throw __call1126306_0(p0);
}
public static void h1263_7(moom.Oo p0) throws Throwable {
    throw __call1126307_0(p0);
}
public static void h1263_8(moom.Oo p0) throws Throwable {
    throw __call1126308_0(p0);
}
public static void h1263_9(moom.Oo p0) throws Throwable {
    throw __call1126309_0(p0);
}
public static void h1263_10(moom.Oo p0) throws Throwable {
    throw __call1126310_0(p0);
}
public static void h1263_11(moom.Oo p0) throws Throwable {
    throw __call1126311_0(p0);
}
public static void h1263_12(moom.Oo p0) throws Throwable {
    throw __call1126312_0(p0);
}
public static void h1263_13(moom.Oo p0) throws Throwable {
    throw __call1126313_0(p0);
}
private static native long __fieldRead1263_0() throws Throwable;
private static native int[] __call1263_1() throws Throwable;
private static native int __integerCategory1263_2(boolean value) throws Throwable;
private static native void __fieldWrite1263_3(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __fieldRead1263_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1263_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1263_6(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory1263_7(boolean value) throws Throwable;
private static native int __integerCategory1263_8(boolean value) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1263_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1263_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead1263_11(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead1263_12() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1263_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call1263_14(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1263_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1263_16(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1263_17(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call1263_18(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1263_19() throws Throwable;
private static native moom.jI __fieldRead1263_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1263_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.bs __fieldRead1263_22(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native boolean __call1263_23(moom.jI a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead1263_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead1263_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.bs __fieldRead1263_26(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native void __call1263_27(net.minecraft.client.particle.EffectRenderer a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1263_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1263_29(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.jI __fieldRead1263_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1263_31(moom.jI a0) throws Throwable;
private static native java.lang.Throwable __call1126300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126311_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126312_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126313_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9bf8ccf640920d5f833a() throws E;
private static final class __SourceHandler_9bf8ccf640920d5f833a {

public static boolean f1264() throws Throwable {
    int lexicalValue1264_49_0;
    int[] spill1264_0;
    boolean spill1264_1;
    long life0_3;
    java.lang.String[] life3_19;
    int[] life2_20;
    java.lang.String[] life4_22;
    int life5_25;
    int life6_27;
    java.lang.String life7_34;
    java.lang.String life8_37;
    lexical_join_53: {
    life0_3 = (__fieldRead1264_0() ^ 49348780119301L);
    spill1264_0 = __call1264_1();
    life3_19 = new java.lang.String[] {"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
    life2_20 = spill1264_0;
    life4_22 = life3_19;
    life5_25 = (life4_22).length;
    life6_27 = 0;
    lexical_cycle_28: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    lexical_join_49: {
    if (!((life6_27 < life5_25))) {
        break lexical_join_53;
    }
    life7_34 = (life4_22)[life6_27];
    life8_37 = __call1264_2(life7_34);
    if (!((life2_20 != null))) {
        break lexical_join_51;
    }
    if (!((life8_37 != null))) {
        break lexical_join_50;
    }
    spill1264_1 = __call1264_3(life8_37, "64");
    if (!((life2_20 != null))) {
        lexicalValue1264_49_0 = __integerCategory1264_4(spill1264_1);
        break lexical_join_49;
    }
    if (!(spill1264_1)) {
        break lexical_join_50;
    }
    lexicalValue1264_49_0 = 1;
    }
    return __integerCategory1264_5(lexicalValue1264_49_0);
    }
    life6_27 += 1;
    }
    if (!((life2_20 == null))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return __integerCategory1264_6(0);
}
public static void h1264_0(moom.Oo p0) throws Throwable {
    throw __call1126400_0(p0);
}
public static void h1264_1(moom.Oo p0) throws Throwable {
    throw __call1126401_0(p0);
}
public static void h1264_2(moom.Oo p0) throws Throwable {
    throw __call1126402_0(p0);
}
private static native long __fieldRead1264_0() throws Throwable;
private static native int[] __call1264_1() throws Throwable;
private static native java.lang.String __call1264_2(java.lang.String a0) throws Throwable;
private static native boolean __call1264_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1264_4(boolean value) throws Throwable;
private static native boolean __integerCategory1264_5(int value) throws Throwable;
private static native boolean __integerCategory1264_6(int value) throws Throwable;
private static native java.lang.Throwable __call1126400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0f39cea714107e62ba7c() throws E;
private static final class __SourceHandler_0f39cea714107e62ba7c {

public static void f1265() throws Throwable {
    net.minecraft.client.Minecraft forwardValue1265_11_0;
    net.minecraft.server.integrated.IntegratedServer forwardValue1265_18_0;
    net.minecraft.client.Minecraft spill1265_0;
    net.minecraft.server.integrated.IntegratedServer spill1265_1;
    long life0_3;
    int[] life2_5;
    net.minecraft.server.integrated.IntegratedServer life3_15;
    forward_join_19: {
    forward_join_18: {
    forward_join_11: {
    life0_3 = (__fieldRead1265_0() ^ 93416201166456L);
    life2_5 = __call1265_1();
    spill1265_0 = __fieldRead1265_2();
    if (!((life2_5 != null))) {
        forwardValue1265_11_0 = spill1265_0;
        break forward_join_11;
    }
    if (!((spill1265_0 != null))) {
        break forward_join_19;
    }
    forwardValue1265_11_0 = __fieldRead1265_3();
    }
    life3_15 = __call1265_4(forwardValue1265_11_0);
    spill1265_1 = life3_15;
    if (!((life2_5 != null))) {
        forwardValue1265_18_0 = spill1265_1;
        break forward_join_18;
    }
    if (!((spill1265_1 != null))) {
        break forward_join_19;
    }
    forwardValue1265_18_0 = life3_15;
    }
    __call1265_5(forwardValue1265_18_0);
    }
    return;
}
public static void h1265_0(moom.Oo p0) throws Throwable {
    throw __call1126500_0(p0);
}
public static void h1265_1(moom.Oo p0) throws Throwable {
    throw __call1126501_0(p0);
}
private static native long __fieldRead1265_0() throws Throwable;
private static native int[] __call1265_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1265_2() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1265_3() throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __call1265_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1265_5(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native java.lang.Throwable __call1126500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.audio.MusicTicker$MusicType __sourceHandlerCall_a6ff6d72a6320238fc5f(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_a6ff6d72a6320238fc5f {

public static net.minecraft.client.audio.MusicTicker$MusicType f1266(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.entity.EntityPlayerSP forwardValue1266_13_0;
    int forwardValue1266_26_0;
    int forwardValue1266_41_0;
    int forwardValue1266_48_0;
    net.minecraft.client.audio.MusicTicker$MusicType forwardValue1266_54_0;
    net.minecraft.client.entity.EntityPlayerSP spill1266_0;
    int spill1266_1;
    long life1_3;
    int[] life3_5;
    forward_join_54: {
    forward_join_53: {
    forward_join_51: {
    forward_join_48: {
    forward_join_41: {
    forward_join_37: {
    forward_join_35: {
    forward_join_26: {
    forward_join_21: {
    forward_join_13: {
    life1_3 = (__fieldRead1266_0() ^ 62401428709817L);
    life3_5 = __call1266_1();
    spill1266_0 = __fieldRead1266_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1266_13_0 = spill1266_0;
        break forward_join_13;
    }
    if (!((spill1266_0 != null))) {
        break forward_join_53;
    }
    forwardValue1266_13_0 = __fieldRead1266_3(receiver);
    }
    spill1266_1 = __instanceOf1266_6(__fieldRead1266_5(__fieldRead1266_4(forwardValue1266_13_0)));
    if (!((life3_5 != null))) {
        forwardValue1266_26_0 = spill1266_1;
        break forward_join_26;
    }
    if (!((spill1266_1 != 0))) {
        break forward_join_21;
    }
    forwardValue1266_54_0 = __fieldRead1266_7();
    break forward_join_54;
    }
    forwardValue1266_26_0 = __instanceOf1266_11(__fieldRead1266_10(__fieldRead1266_9(__fieldRead1266_8(receiver))));
    }
    if (!((life3_5 != null))) {
        forwardValue1266_41_0 = forwardValue1266_26_0;
        break forward_join_41;
    }
    if (!((forwardValue1266_26_0 != 0))) {
        break forward_join_37;
    }
    if (!((__fieldRead1266_12() != null))) {
        break forward_join_35;
    }
    if (!((__fieldRead1266_13() > 0))) {
        break forward_join_35;
    }
    forwardValue1266_54_0 = __fieldRead1266_14();
    break forward_join_54;
    }
    forwardValue1266_54_0 = __fieldRead1266_15();
    break forward_join_54;
    }
    forwardValue1266_41_0 = __integerCategory1266_19(__fieldRead1266_18(__fieldRead1266_17(__fieldRead1266_16(receiver))));
    }
    if (!((life3_5 != null))) {
        forwardValue1266_48_0 = forwardValue1266_41_0;
        break forward_join_48;
    }
    if (!((forwardValue1266_41_0 != 0))) {
        break forward_join_51;
    }
    forwardValue1266_48_0 = __integerCategory1266_23(__fieldRead1266_22(__fieldRead1266_21(__fieldRead1266_20(receiver))));
    }
    if (!((forwardValue1266_48_0 != 0))) {
        break forward_join_51;
    }
    forwardValue1266_54_0 = __fieldRead1266_24();
    break forward_join_54;
    }
    forwardValue1266_54_0 = __fieldRead1266_25();
    break forward_join_54;
    }
    forwardValue1266_54_0 = __fieldRead1266_26();
    }
    return forwardValue1266_54_0;
}
public static void h1266_0(moom.Oo p0) throws Throwable {
    throw __call1126600_0(p0);
}
public static void h1266_1(moom.Oo p0) throws Throwable {
    throw __call1126601_0(p0);
}
public static void h1266_2(moom.Oo p0) throws Throwable {
    throw __call1126602_0(p0);
}
public static void h1266_3(moom.Oo p0) throws Throwable {
    throw __call1126603_0(p0);
}
public static void h1266_4(moom.Oo p0) throws Throwable {
    throw __call1126604_0(p0);
}
public static void h1266_5(moom.Oo p0) throws Throwable {
    throw __call1126605_0(p0);
}
public static void h1266_6(moom.Oo p0) throws Throwable {
    throw __call1126606_0(p0);
}
public static void h1266_7(moom.Oo p0) throws Throwable {
    throw __call1126607_0(p0);
}
public static void h1266_8(moom.Oo p0) throws Throwable {
    throw __call1126608_0(p0);
}
public static void h1266_9(moom.Oo p0) throws Throwable {
    throw __call1126609_0(p0);
}
public static void h1266_10(moom.Oo p0) throws Throwable {
    throw __call1126610_0(p0);
}
private static native long __fieldRead1266_0() throws Throwable;
private static native int[] __call1266_1() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1266_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1266_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1266_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.EA __fieldRead1266_5(net.minecraft.world.World a0) throws Throwable;
private static native int __instanceOf1266_6(moom.EA a0) throws Throwable;
private static native net.minecraft.client.audio.MusicTicker$MusicType __fieldRead1266_7() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1266_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1266_9(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native moom.EA __fieldRead1266_10(net.minecraft.world.World a0) throws Throwable;
private static native int __instanceOf1266_11(moom.EA a0) throws Throwable;
private static native java.lang.String __fieldRead1266_12() throws Throwable;
private static native int __fieldRead1266_13() throws Throwable;
private static native net.minecraft.client.audio.MusicTicker$MusicType __fieldRead1266_14() throws Throwable;
private static native net.minecraft.client.audio.MusicTicker$MusicType __fieldRead1266_15() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1266_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead1266_17(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __fieldRead1266_18(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory1266_19(boolean value) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1266_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead1266_21(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __fieldRead1266_22(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory1266_23(boolean value) throws Throwable;
private static native net.minecraft.client.audio.MusicTicker$MusicType __fieldRead1266_24() throws Throwable;
private static native net.minecraft.client.audio.MusicTicker$MusicType __fieldRead1266_25() throws Throwable;
private static native net.minecraft.client.audio.MusicTicker$MusicType __fieldRead1266_26() throws Throwable;
private static native java.lang.Throwable __call1126600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126610_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.network.NetHandlerPlayClient __sourceHandlerCall_42a8edfe927ae02b67b8(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_42a8edfe927ae02b67b8 {

public static net.minecraft.client.network.NetHandlerPlayClient f1267(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.entity.EntityPlayerSP forwardValue1267_13_0;
    net.minecraft.client.network.NetHandlerPlayClient forwardValue1267_16_0;
    net.minecraft.client.entity.EntityPlayerSP spill1267_0;
    long life1_3;
    int[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (__fieldRead1267_0() ^ 10025725705193L);
    life3_5 = __call1267_1();
    spill1267_0 = __fieldRead1267_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1267_13_0 = spill1267_0;
        break forward_join_13;
    }
    if (!((spill1267_0 != null))) {
        break forward_join_15;
    }
    forwardValue1267_13_0 = __fieldRead1267_3(receiver);
    }
    forwardValue1267_16_0 = __fieldRead1267_4(forwardValue1267_13_0);
    break forward_join_16;
    }
    forwardValue1267_16_0 = null;
    }
    return forwardValue1267_16_0;
}
public static void h1267_0(moom.Oo p0) throws Throwable {
    throw __call1126700_0(p0);
}
public static void h1267_1(moom.Oo p0) throws Throwable {
    throw __call1126701_0(p0);
}
private static native long __fieldRead1267_0() throws Throwable;
private static native int[] __call1267_1() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1267_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1267_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead1267_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.lang.Throwable __call1126700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2ae3022321a7b1f181f0(net.minecraft.client.Minecraft a0, int a1) throws E;
private static final class __SourceHandler_2ae3022321a7b1f181f0 {

public static void f1268(net.minecraft.client.Minecraft receiver, int p0) throws Throwable {
    net.minecraft.client.entity.EntityPlayerSP forwardValue1268_32_0;
    net.minecraft.client.Minecraft forwardValue1268_54_0;
    moom.jI forwardValue1268_54_1;
    net.minecraft.client.multiplayer.WorldClient forwardValue1268_54_2;
    net.minecraft.client.Minecraft forwardValue1268_56_0;
    moom.jI forwardValue1268_56_1;
    net.minecraft.client.multiplayer.WorldClient forwardValue1268_56_2;
    net.minecraft.client.entity.EntityPlayerSP forwardValue1268_56_3;
    net.minecraft.client.Minecraft forwardValue1268_57_0;
    moom.jI forwardValue1268_57_1;
    net.minecraft.client.multiplayer.WorldClient forwardValue1268_57_2;
    moom.B2 forwardValue1268_57_3;
    net.minecraft.client.Minecraft forwardValue1268_121_0;
    int[] spill1268_0;
    net.minecraft.client.entity.EntityPlayerSP spill1268_1;
    net.minecraft.client.Minecraft spill1268_2;
    moom.jI spill1268_3;
    net.minecraft.client.multiplayer.WorldClient spill1268_4;
    net.minecraft.client.entity.EntityPlayerSP spill1268_5;
    net.minecraft.client.Minecraft spill1268_6;
    long life2_3;
    int[] life4_11;
    int life5_13;
    java.lang.String life6_15;
    net.minecraft.client.entity.EntityPlayerSP life7_42;
    forward_join_123: {
    forward_join_121: {
    forward_join_57: {
    forward_join_56: {
    forward_join_54: {
    forward_join_34: {
    forward_join_32: {
    life2_3 = (__fieldRead1268_0() ^ 101781104680432L);
    __call1268_2(__fieldRead1268_1(receiver));
    spill1268_0 = __call1268_3();
    __call1268_5(__fieldRead1268_4(receiver));
    life4_11 = spill1268_0;
    life5_13 = 0;
    life6_15 = null;
    spill1268_1 = __fieldRead1268_6(receiver);
    if (!((life4_11 != null))) {
        forwardValue1268_32_0 = spill1268_1;
        break forward_join_32;
    }
    if (!((spill1268_1 != null))) {
        break forward_join_34;
    }
    life5_13 = __call1268_8(__fieldRead1268_7(receiver));
    __call1268_11(__fieldRead1268_9(receiver), __fieldRead1268_10(receiver));
    forwardValue1268_32_0 = __fieldRead1268_12(receiver);
    }
    life6_15 = __call1268_13(forwardValue1268_32_0);
    }
    __fieldWrite1268_14(receiver, null);
    life7_42 = __fieldRead1268_15(receiver);
    spill1268_2 = receiver;
    spill1268_3 = __fieldRead1268_16(receiver);
    spill1268_4 = __fieldRead1268_17(receiver);
    spill1268_5 = __fieldRead1268_18(receiver);
    if (!((life4_11 != null))) {
        forwardValue1268_56_0 = spill1268_2;
        forwardValue1268_56_1 = spill1268_3;
        forwardValue1268_56_2 = spill1268_4;
        forwardValue1268_56_3 = spill1268_5;
        break forward_join_56;
    }
    if (!((spill1268_5 == null))) {
        forwardValue1268_54_0 = spill1268_2;
        forwardValue1268_54_1 = spill1268_3;
        forwardValue1268_54_2 = spill1268_4;
        break forward_join_54;
    }
    forwardValue1268_57_0 = spill1268_2;
    forwardValue1268_57_1 = spill1268_3;
    forwardValue1268_57_2 = spill1268_4;
    forwardValue1268_57_3 = new moom.B2();
    break forward_join_57;
    }
    forwardValue1268_56_0 = forwardValue1268_54_0;
    forwardValue1268_56_1 = forwardValue1268_54_1;
    forwardValue1268_56_2 = forwardValue1268_54_2;
    forwardValue1268_56_3 = __fieldRead1268_19(receiver);
    }
    forwardValue1268_57_0 = forwardValue1268_56_0;
    forwardValue1268_57_1 = forwardValue1268_56_1;
    forwardValue1268_57_2 = forwardValue1268_56_2;
    forwardValue1268_57_3 = __call1268_20(forwardValue1268_56_3);
    }
    __fieldWrite1268_22(forwardValue1268_57_0, __call1268_21(forwardValue1268_57_1, forwardValue1268_57_2, forwardValue1268_57_3));
    __call1268_27(__call1268_24(__fieldRead1268_23(receiver)), __call1268_26(__call1268_25(life7_42)));
    __fieldWrite1268_29(__fieldRead1268_28(receiver), p0);
    __fieldWrite1268_31(receiver, __fieldRead1268_30(receiver));
    __call1268_33(__fieldRead1268_32(receiver));
    __call1268_35(__fieldRead1268_34(receiver), life6_15);
    __call1268_38(__fieldRead1268_36(receiver), __fieldRead1268_37(receiver));
    __call1268_41(__fieldRead1268_39(receiver), __fieldRead1268_40(receiver));
    __fieldWrite1268_44(__fieldRead1268_42(receiver), new moom.Dv(__fieldRead1268_43(receiver)));
    __call1268_46(__fieldRead1268_45(receiver), life5_13);
    __call1268_49(__fieldRead1268_47(receiver), __fieldRead1268_48(receiver));
    __call1268_52(__fieldRead1268_50(receiver), __call1268_51(life7_42));
    spill1268_6 = receiver;
    if (!((life4_11 != null))) {
        forwardValue1268_121_0 = spill1268_6;
        break forward_join_121;
    }
    if (!((__instanceOf1268_54(__fieldRead1268_53(spill1268_6)) != 0))) {
        break forward_join_123;
    }
    forwardValue1268_121_0 = receiver;
    }
    __call1268_55(forwardValue1268_121_0, null);
    }
    return;
}
public static void h1268_0(moom.Oo p0) throws Throwable {
    throw __call1126800_0(p0);
}
public static void h1268_1(moom.Oo p0) throws Throwable {
    throw __call1126801_0(p0);
}
public static void h1268_2(moom.Oo p0) throws Throwable {
    throw __call1126802_0(p0);
}
public static void h1268_3(moom.Oo p0) throws Throwable {
    throw __call1126803_0(p0);
}
public static void h1268_4(moom.Oo p0) throws Throwable {
    throw __call1126804_0(p0);
}
private static native long __fieldRead1268_0() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1268_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1268_2(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native int[] __call1268_3() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1268_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1268_5(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1268_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1268_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1268_11(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call1268_13(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __fieldWrite1268_14(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.jI __fieldRead1268_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1268_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.B2 __call1268_20(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __call1268_21(moom.jI a0, net.minecraft.client.multiplayer.WorldClient a1, moom.B2 a2) throws Throwable;
private static native void __fieldWrite1268_22(net.minecraft.client.Minecraft a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call1268_24(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.entity.DataWatcher __call1268_25(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.util.List __call1268_26(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native void __call1268_27(net.minecraft.entity.DataWatcher a0, java.util.List a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1268_29(net.minecraft.client.entity.EntityPlayerSP a0, int a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1268_31(net.minecraft.client.Minecraft a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1268_33(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1268_35(net.minecraft.client.entity.EntityPlayerSP a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1268_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_37(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1268_38(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native moom.jI __fieldRead1268_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1268_41(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_42(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1268_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1268_44(net.minecraft.client.entity.EntityPlayerSP a0, moom.Dv a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1268_46(net.minecraft.client.entity.EntityPlayerSP a0, int a1) throws Throwable;
private static native moom.jI __fieldRead1268_47(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1268_49(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead1268_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1268_51(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call1268_52(net.minecraft.client.entity.EntityPlayerSP a0, boolean a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1268_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf1268_54(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call1268_55(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Throwable __call1126800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c159689763ab28cd2eb2(net.minecraft.client.Minecraft a0, moom.qY a1) throws E;
private static final class __SourceHandler_c159689763ab28cd2eb2 {

public static void f1269(net.minecraft.client.Minecraft receiver, moom.qY p0) throws Throwable {
    moom.qY forwardValue1269_44_0;
    int forwardValue1269_64_0;
    int[] spill1269_0;
    moom.qY spill1269_1;
    boolean spill1269_2;
    long life2_3;
    java.io.File life5_11;
    int[] life4_12;
    java.io.File life6_26;
    forward_join_65: {
    forward_join_64: {
    forward_join_57: {
    forward_join_44: {
    forward_join_43: {
    life2_3 = (__fieldRead1269_0() ^ 110072715956957L);
    spill1269_0 = __call1269_1();
    life5_11 = new java.io.File(__fieldRead1269_3(__call1269_2()), "crash-reports");
    life4_12 = spill1269_0;
    life6_26 = new java.io.File(life5_11, __invokedynamic1269_5(__call1269_4(new java.text.SimpleDateFormat("yyyy-MM-dd_HH.mm.ss"), new java.util.Date())));
    __call1269_7(__call1269_6(p0));
    spill1269_1 = p0;
    if (!((life4_12 != null))) {
        forwardValue1269_44_0 = spill1269_1;
        break forward_join_44;
    }
    if (!((__call1269_8(spill1269_1) != null))) {
        break forward_join_43;
    }
    __call1269_11(__invokedynamic1269_10(__call1269_9(p0)));
    __call1269_12(-1);
    if (!((life4_12 == null))) {
        break forward_join_65;
    }
    }
    forwardValue1269_44_0 = p0;
    }
    spill1269_2 = __call1269_13(forwardValue1269_44_0, life6_26);
    if (!((life4_12 != null))) {
        forwardValue1269_64_0 = __integerCategory1269_14(spill1269_2);
        break forward_join_64;
    }
    if (!(spill1269_2)) {
        break forward_join_57;
    }
    __call1269_17(__invokedynamic1269_16(__call1269_15(life6_26)));
    __call1269_18(-1);
    if (!((life4_12 == null))) {
        break forward_join_65;
    }
    }
    __call1269_19("#@?@# Game crashed! Crash report could not be saved. #@?@#");
    forwardValue1269_64_0 = __invokedynamic1269_20(17202, (735835268388263518L ^ life2_3));
    }
    __call1269_21(forwardValue1269_64_0);
    }
    return;
}
public static void h1269_0(moom.Oo p0) throws Throwable {
    throw __call1126900_0(p0);
}
public static void h1269_1(moom.Oo p0) throws Throwable {
    throw __call1126901_0(p0);
}
public static void h1269_2(moom.Oo p0) throws Throwable {
    throw __call1126902_0(p0);
}
public static void h1269_3(moom.Oo p0) throws Throwable {
    throw __call1126903_0(p0);
}
public static void h1269_4(moom.Oo p0) throws Throwable {
    throw __call1126904_0(p0);
}
public static void h1269_5(moom.Oo p0) throws Throwable {
    throw __call1126905_0(p0);
}
private static native long __fieldRead1269_0() throws Throwable;
private static native int[] __call1269_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call1269_2() throws Throwable;
private static native java.io.File __fieldRead1269_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call1269_4(java.text.SimpleDateFormat a0, java.util.Date a1) throws Throwable;
private static native java.lang.String __invokedynamic1269_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1269_6(moom.qY a0) throws Throwable;
private static native void __call1269_7(java.lang.String a0) throws Throwable;
private static native java.io.File __call1269_8(moom.qY a0) throws Throwable;
private static native java.io.File __call1269_9(moom.qY a0) throws Throwable;
private static native java.lang.String __invokedynamic1269_10(java.io.File a0) throws Throwable;
private static native void __call1269_11(java.lang.String a0) throws Throwable;
private static native void __call1269_12(int a0) throws Throwable;
private static native boolean __call1269_13(moom.qY a0, java.io.File a1) throws Throwable;
private static native int __integerCategory1269_14(boolean value) throws Throwable;
private static native java.lang.String __call1269_15(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic1269_16(java.lang.String a0) throws Throwable;
private static native void __call1269_17(java.lang.String a0) throws Throwable;
private static native void __call1269_18(int a0) throws Throwable;
private static native void __call1269_19(java.lang.String a0) throws Throwable;
private static native int __invokedynamic1269_20(int a0, long a1) throws Throwable;
private static native void __call1269_21(int a0) throws Throwable;
private static native java.lang.Throwable __call1126900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1126905_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5cb7beb61f487a2f4278(net.minecraft.client.Minecraft a0, net.minecraft.profiler.PlayerUsageSnooper a1) throws E;
private static final class __SourceHandler_5cb7beb61f487a2f4278 {

public static void f100139(net.minecraft.client.Minecraft receiver, net.minecraft.profiler.PlayerUsageSnooper p0) throws Throwable {
    int[] spill100139_0;
    long life2_3;
    org.lwjgl.opengl.ContextCapabilities life5_32;
    int[] life4_190;
    forest_join_663: {
    life2_3 = (__fieldRead100139_0() ^ 44255978178045L);
    __call100139_3(p0, "opengl_version", __call100139_2(__invokedynamic100139_1(27400, (2730564759209617696L ^ life2_3))));
    __call100139_6(p0, "opengl_vendor", __call100139_5(__invokedynamic100139_4(2954, (8720121169022994921L ^ life2_3))));
    __call100139_8(p0, "client_brand", __call100139_7());
    __call100139_10(p0, "launched_version", __fieldRead100139_9(receiver));
    life5_32 = __call100139_11();
    __call100139_14(p0, "gl_caps[ARB_arrays_of_arrays]", __call100139_13(__fieldRead100139_12(life5_32)));
    __call100139_17(p0, "gl_caps[ARB_base_instance]", __call100139_16(__fieldRead100139_15(life5_32)));
    __call100139_20(p0, "gl_caps[ARB_blend_func_extended]", __call100139_19(__fieldRead100139_18(life5_32)));
    __call100139_23(p0, "gl_caps[ARB_clear_buffer_object]", __call100139_22(__fieldRead100139_21(life5_32)));
    __call100139_26(p0, "gl_caps[ARB_color_buffer_float]", __call100139_25(__fieldRead100139_24(life5_32)));
    __call100139_29(p0, "gl_caps[ARB_compatibility]", __call100139_28(__fieldRead100139_27(life5_32)));
    __call100139_32(p0, "gl_caps[ARB_compressed_texture_pixel_storage]", __call100139_31(__fieldRead100139_30(life5_32)));
    __call100139_35(p0, "gl_caps[ARB_compute_shader]", __call100139_34(__fieldRead100139_33(life5_32)));
    __call100139_38(p0, "gl_caps[ARB_copy_buffer]", __call100139_37(__fieldRead100139_36(life5_32)));
    __call100139_41(p0, "gl_caps[ARB_copy_image]", __call100139_40(__fieldRead100139_39(life5_32)));
    __call100139_44(p0, "gl_caps[ARB_depth_buffer_float]", __call100139_43(__fieldRead100139_42(life5_32)));
    __call100139_47(p0, "gl_caps[ARB_compute_shader]", __call100139_46(__fieldRead100139_45(life5_32)));
    __call100139_50(p0, "gl_caps[ARB_copy_buffer]", __call100139_49(__fieldRead100139_48(life5_32)));
    __call100139_53(p0, "gl_caps[ARB_copy_image]", __call100139_52(__fieldRead100139_51(life5_32)));
    __call100139_56(p0, "gl_caps[ARB_depth_buffer_float]", __call100139_55(__fieldRead100139_54(life5_32)));
    __call100139_59(p0, "gl_caps[ARB_depth_clamp]", __call100139_58(__fieldRead100139_57(life5_32)));
    __call100139_62(p0, "gl_caps[ARB_depth_texture]", __call100139_61(__fieldRead100139_60(life5_32)));
    __call100139_65(p0, "gl_caps[ARB_draw_buffers]", __call100139_64(__fieldRead100139_63(life5_32)));
    __call100139_68(p0, "gl_caps[ARB_draw_buffers_blend]", __call100139_67(__fieldRead100139_66(life5_32)));
    __call100139_71(p0, "gl_caps[ARB_draw_elements_base_vertex]", __call100139_70(__fieldRead100139_69(life5_32)));
    spill100139_0 = __call100139_72();
    __call100139_75(p0, "gl_caps[ARB_draw_indirect]", __call100139_74(__fieldRead100139_73(life5_32)));
    __call100139_78(p0, "gl_caps[ARB_draw_instanced]", __call100139_77(__fieldRead100139_76(life5_32)));
    __call100139_81(p0, "gl_caps[ARB_explicit_attrib_location]", __call100139_80(__fieldRead100139_79(life5_32)));
    __call100139_84(p0, "gl_caps[ARB_explicit_uniform_location]", __call100139_83(__fieldRead100139_82(life5_32)));
    __call100139_87(p0, "gl_caps[ARB_fragment_layer_viewport]", __call100139_86(__fieldRead100139_85(life5_32)));
    __call100139_90(p0, "gl_caps[ARB_fragment_program]", __call100139_89(__fieldRead100139_88(life5_32)));
    life4_190 = spill100139_0;
    __call100139_93(p0, "gl_caps[ARB_fragment_shader]", __call100139_92(__fieldRead100139_91(life5_32)));
    __call100139_96(p0, "gl_caps[ARB_fragment_program_shadow]", __call100139_95(__fieldRead100139_94(life5_32)));
    __call100139_99(p0, "gl_caps[ARB_framebuffer_object]", __call100139_98(__fieldRead100139_97(life5_32)));
    __call100139_102(p0, "gl_caps[ARB_framebuffer_sRGB]", __call100139_101(__fieldRead100139_100(life5_32)));
    __call100139_105(p0, "gl_caps[ARB_geometry_shader4]", __call100139_104(__fieldRead100139_103(life5_32)));
    __call100139_108(p0, "gl_caps[ARB_gpu_shader5]", __call100139_107(__fieldRead100139_106(life5_32)));
    __call100139_111(p0, "gl_caps[ARB_half_float_pixel]", __call100139_110(__fieldRead100139_109(life5_32)));
    __call100139_114(p0, "gl_caps[ARB_half_float_vertex]", __call100139_113(__fieldRead100139_112(life5_32)));
    __call100139_117(p0, "gl_caps[ARB_instanced_arrays]", __call100139_116(__fieldRead100139_115(life5_32)));
    __call100139_120(p0, "gl_caps[ARB_map_buffer_alignment]", __call100139_119(__fieldRead100139_118(life5_32)));
    __call100139_123(p0, "gl_caps[ARB_map_buffer_range]", __call100139_122(__fieldRead100139_121(life5_32)));
    __call100139_126(p0, "gl_caps[ARB_multisample]", __call100139_125(__fieldRead100139_124(life5_32)));
    __call100139_129(p0, "gl_caps[ARB_multitexture]", __call100139_128(__fieldRead100139_127(life5_32)));
    __call100139_132(p0, "gl_caps[ARB_occlusion_query2]", __call100139_131(__fieldRead100139_130(life5_32)));
    __call100139_135(p0, "gl_caps[ARB_pixel_buffer_object]", __call100139_134(__fieldRead100139_133(life5_32)));
    __call100139_138(p0, "gl_caps[ARB_seamless_cube_map]", __call100139_137(__fieldRead100139_136(life5_32)));
    __call100139_141(p0, "gl_caps[ARB_shader_objects]", __call100139_140(__fieldRead100139_139(life5_32)));
    __call100139_144(p0, "gl_caps[ARB_shader_stencil_export]", __call100139_143(__fieldRead100139_142(life5_32)));
    __call100139_147(p0, "gl_caps[ARB_shader_texture_lod]", __call100139_146(__fieldRead100139_145(life5_32)));
    __call100139_150(p0, "gl_caps[ARB_shadow]", __call100139_149(__fieldRead100139_148(life5_32)));
    __call100139_153(p0, "gl_caps[ARB_shadow_ambient]", __call100139_152(__fieldRead100139_151(life5_32)));
    __call100139_156(p0, "gl_caps[ARB_stencil_texturing]", __call100139_155(__fieldRead100139_154(life5_32)));
    __call100139_159(p0, "gl_caps[ARB_sync]", __call100139_158(__fieldRead100139_157(life5_32)));
    __call100139_162(p0, "gl_caps[ARB_tessellation_shader]", __call100139_161(__fieldRead100139_160(life5_32)));
    __call100139_165(p0, "gl_caps[ARB_texture_border_clamp]", __call100139_164(__fieldRead100139_163(life5_32)));
    __call100139_168(p0, "gl_caps[ARB_texture_buffer_object]", __call100139_167(__fieldRead100139_166(life5_32)));
    __call100139_171(p0, "gl_caps[ARB_texture_cube_map]", __call100139_170(__fieldRead100139_169(life5_32)));
    __call100139_174(p0, "gl_caps[ARB_texture_cube_map_array]", __call100139_173(__fieldRead100139_172(life5_32)));
    __call100139_177(p0, "gl_caps[ARB_texture_non_power_of_two]", __call100139_176(__fieldRead100139_175(life5_32)));
    __call100139_180(p0, "gl_caps[ARB_uniform_buffer_object]", __call100139_179(__fieldRead100139_178(life5_32)));
    __call100139_183(p0, "gl_caps[ARB_vertex_blend]", __call100139_182(__fieldRead100139_181(life5_32)));
    __call100139_186(p0, "gl_caps[ARB_vertex_buffer_object]", __call100139_185(__fieldRead100139_184(life5_32)));
    __call100139_189(p0, "gl_caps[ARB_vertex_program]", __call100139_188(__fieldRead100139_187(life5_32)));
    __call100139_192(p0, "gl_caps[ARB_vertex_shader]", __call100139_191(__fieldRead100139_190(life5_32)));
    __call100139_195(p0, "gl_caps[EXT_bindable_uniform]", __call100139_194(__fieldRead100139_193(life5_32)));
    __call100139_198(p0, "gl_caps[EXT_blend_equation_separate]", __call100139_197(__fieldRead100139_196(life5_32)));
    __call100139_201(p0, "gl_caps[EXT_blend_func_separate]", __call100139_200(__fieldRead100139_199(life5_32)));
    __call100139_204(p0, "gl_caps[EXT_blend_minmax]", __call100139_203(__fieldRead100139_202(life5_32)));
    __call100139_207(p0, "gl_caps[EXT_blend_subtract]", __call100139_206(__fieldRead100139_205(life5_32)));
    __call100139_210(p0, "gl_caps[EXT_draw_instanced]", __call100139_209(__fieldRead100139_208(life5_32)));
    __call100139_213(p0, "gl_caps[EXT_framebuffer_multisample]", __call100139_212(__fieldRead100139_211(life5_32)));
    __call100139_216(p0, "gl_caps[EXT_framebuffer_object]", __call100139_215(__fieldRead100139_214(life5_32)));
    __call100139_219(p0, "gl_caps[EXT_framebuffer_sRGB]", __call100139_218(__fieldRead100139_217(life5_32)));
    __call100139_222(p0, "gl_caps[EXT_geometry_shader4]", __call100139_221(__fieldRead100139_220(life5_32)));
    __call100139_225(p0, "gl_caps[EXT_gpu_program_parameters]", __call100139_224(__fieldRead100139_223(life5_32)));
    __call100139_228(p0, "gl_caps[EXT_gpu_shader4]", __call100139_227(__fieldRead100139_226(life5_32)));
    __call100139_231(p0, "gl_caps[EXT_multi_draw_arrays]", __call100139_230(__fieldRead100139_229(life5_32)));
    __call100139_234(p0, "gl_caps[EXT_packed_depth_stencil]", __call100139_233(__fieldRead100139_232(life5_32)));
    __call100139_237(p0, "gl_caps[EXT_paletted_texture]", __call100139_236(__fieldRead100139_235(life5_32)));
    __call100139_240(p0, "gl_caps[EXT_rescale_normal]", __call100139_239(__fieldRead100139_238(life5_32)));
    __call100139_243(p0, "gl_caps[EXT_separate_shader_objects]", __call100139_242(__fieldRead100139_241(life5_32)));
    __call100139_246(p0, "gl_caps[EXT_shader_image_load_store]", __call100139_245(__fieldRead100139_244(life5_32)));
    __call100139_249(p0, "gl_caps[EXT_shadow_funcs]", __call100139_248(__fieldRead100139_247(life5_32)));
    __call100139_252(p0, "gl_caps[EXT_shared_texture_palette]", __call100139_251(__fieldRead100139_250(life5_32)));
    __call100139_255(p0, "gl_caps[EXT_stencil_clear_tag]", __call100139_254(__fieldRead100139_253(life5_32)));
    __call100139_258(p0, "gl_caps[EXT_stencil_two_side]", __call100139_257(__fieldRead100139_256(life5_32)));
    __call100139_261(p0, "gl_caps[EXT_stencil_wrap]", __call100139_260(__fieldRead100139_259(life5_32)));
    __call100139_264(p0, "gl_caps[EXT_texture_3d]", __call100139_263(__fieldRead100139_262(life5_32)));
    __call100139_267(p0, "gl_caps[EXT_texture_array]", __call100139_266(__fieldRead100139_265(life5_32)));
    __call100139_270(p0, "gl_caps[EXT_texture_buffer_object]", __call100139_269(__fieldRead100139_268(life5_32)));
    __call100139_273(p0, "gl_caps[EXT_texture_integer]", __call100139_272(__fieldRead100139_271(life5_32)));
    __call100139_276(p0, "gl_caps[EXT_texture_lod_bias]", __call100139_275(__fieldRead100139_274(life5_32)));
    __call100139_279(p0, "gl_caps[EXT_texture_sRGB]", __call100139_278(__fieldRead100139_277(life5_32)));
    __call100139_282(p0, "gl_caps[EXT_vertex_shader]", __call100139_281(__fieldRead100139_280(life5_32)));
    __call100139_285(p0, "gl_caps[EXT_vertex_weighting]", __call100139_284(__fieldRead100139_283(life5_32)));
    __call100139_289(p0, "gl_caps[gl_max_vertex_uniforms]", __call100139_288(__call100139_287(__invokedynamic100139_286(15438, (6112547262187667059L ^ life2_3)))));
    __call100139_290();
    __call100139_294(p0, "gl_caps[gl_max_fragment_uniforms]", __call100139_293(__call100139_292(__invokedynamic100139_291(3594, (2585012593402825839L ^ life2_3)))));
    __call100139_295();
    __call100139_299(p0, "gl_caps[gl_max_vertex_attribs]", __call100139_298(__call100139_297(__invokedynamic100139_296(28228, (7087779899437493308L ^ life2_3)))));
    __call100139_300();
    __call100139_304(p0, "gl_caps[gl_max_vertex_texture_image_units]", __call100139_303(__call100139_302(__invokedynamic100139_301(12707, (1928149433728988103L ^ life2_3)))));
    __call100139_305();
    __call100139_309(p0, "gl_caps[gl_max_texture_image_units]", __call100139_308(__call100139_307(__invokedynamic100139_306(19134, (8557203606553790679L ^ life2_3)))));
    __call100139_310();
    __call100139_314(p0, "gl_caps[gl_max_texture_image_units]", __call100139_313(__call100139_312(__invokedynamic100139_311(15437, (5899220583223983668L ^ life2_3)))));
    __call100139_315();
    __call100139_318(p0, "gl_max_texture_size", __call100139_317(__call100139_316()));
    if (!((life4_190 == null))) {
        break forest_join_663;
    }
    __call100139_319(new java.lang.String[1]);
    }
    return;
}
public static void h100139_0(moom.Oo p0) throws Throwable {
    throw __call13013900_0(p0);
}
private static native long __fieldRead100139_0() throws Throwable;
private static native int __invokedynamic100139_1(int a0, long a1) throws Throwable;
private static native java.lang.String __call100139_2(int a0) throws Throwable;
private static native void __call100139_3(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __invokedynamic100139_4(int a0, long a1) throws Throwable;
private static native java.lang.String __call100139_5(int a0) throws Throwable;
private static native void __call100139_6(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call100139_7() throws Throwable;
private static native void __call100139_8(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __fieldRead100139_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call100139_10(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call100139_11() throws Throwable;
private static native boolean __fieldRead100139_12(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_13(boolean a0) throws Throwable;
private static native void __call100139_14(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_15(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_16(boolean a0) throws Throwable;
private static native void __call100139_17(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_18(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_19(boolean a0) throws Throwable;
private static native void __call100139_20(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_21(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_22(boolean a0) throws Throwable;
private static native void __call100139_23(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_24(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_25(boolean a0) throws Throwable;
private static native void __call100139_26(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_27(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_28(boolean a0) throws Throwable;
private static native void __call100139_29(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_30(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_31(boolean a0) throws Throwable;
private static native void __call100139_32(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_33(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_34(boolean a0) throws Throwable;
private static native void __call100139_35(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_36(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_37(boolean a0) throws Throwable;
private static native void __call100139_38(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_39(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_40(boolean a0) throws Throwable;
private static native void __call100139_41(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_42(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_43(boolean a0) throws Throwable;
private static native void __call100139_44(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_45(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_46(boolean a0) throws Throwable;
private static native void __call100139_47(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_48(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_49(boolean a0) throws Throwable;
private static native void __call100139_50(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_51(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_52(boolean a0) throws Throwable;
private static native void __call100139_53(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_54(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_55(boolean a0) throws Throwable;
private static native void __call100139_56(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_57(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_58(boolean a0) throws Throwable;
private static native void __call100139_59(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_60(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_61(boolean a0) throws Throwable;
private static native void __call100139_62(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_63(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_64(boolean a0) throws Throwable;
private static native void __call100139_65(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_66(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_67(boolean a0) throws Throwable;
private static native void __call100139_68(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_69(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_70(boolean a0) throws Throwable;
private static native void __call100139_71(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native int[] __call100139_72() throws Throwable;
private static native boolean __fieldRead100139_73(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_74(boolean a0) throws Throwable;
private static native void __call100139_75(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_76(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_77(boolean a0) throws Throwable;
private static native void __call100139_78(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_79(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_80(boolean a0) throws Throwable;
private static native void __call100139_81(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_82(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_83(boolean a0) throws Throwable;
private static native void __call100139_84(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_85(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_86(boolean a0) throws Throwable;
private static native void __call100139_87(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_88(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_89(boolean a0) throws Throwable;
private static native void __call100139_90(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_91(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_92(boolean a0) throws Throwable;
private static native void __call100139_93(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_94(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_95(boolean a0) throws Throwable;
private static native void __call100139_96(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_97(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_98(boolean a0) throws Throwable;
private static native void __call100139_99(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_100(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_101(boolean a0) throws Throwable;
private static native void __call100139_102(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_103(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_104(boolean a0) throws Throwable;
private static native void __call100139_105(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_106(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_107(boolean a0) throws Throwable;
private static native void __call100139_108(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_109(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_110(boolean a0) throws Throwable;
private static native void __call100139_111(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_112(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_113(boolean a0) throws Throwable;
private static native void __call100139_114(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_115(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_116(boolean a0) throws Throwable;
private static native void __call100139_117(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_118(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_119(boolean a0) throws Throwable;
private static native void __call100139_120(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_121(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_122(boolean a0) throws Throwable;
private static native void __call100139_123(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_124(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_125(boolean a0) throws Throwable;
private static native void __call100139_126(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_127(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_128(boolean a0) throws Throwable;
private static native void __call100139_129(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_130(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_131(boolean a0) throws Throwable;
private static native void __call100139_132(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_133(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_134(boolean a0) throws Throwable;
private static native void __call100139_135(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_136(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_137(boolean a0) throws Throwable;
private static native void __call100139_138(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_139(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_140(boolean a0) throws Throwable;
private static native void __call100139_141(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_142(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_143(boolean a0) throws Throwable;
private static native void __call100139_144(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_145(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_146(boolean a0) throws Throwable;
private static native void __call100139_147(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_148(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_149(boolean a0) throws Throwable;
private static native void __call100139_150(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_151(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_152(boolean a0) throws Throwable;
private static native void __call100139_153(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_154(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_155(boolean a0) throws Throwable;
private static native void __call100139_156(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_157(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_158(boolean a0) throws Throwable;
private static native void __call100139_159(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_160(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_161(boolean a0) throws Throwable;
private static native void __call100139_162(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_163(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_164(boolean a0) throws Throwable;
private static native void __call100139_165(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_166(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_167(boolean a0) throws Throwable;
private static native void __call100139_168(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_169(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_170(boolean a0) throws Throwable;
private static native void __call100139_171(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_172(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_173(boolean a0) throws Throwable;
private static native void __call100139_174(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_175(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_176(boolean a0) throws Throwable;
private static native void __call100139_177(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_178(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_179(boolean a0) throws Throwable;
private static native void __call100139_180(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_181(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_182(boolean a0) throws Throwable;
private static native void __call100139_183(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_184(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_185(boolean a0) throws Throwable;
private static native void __call100139_186(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_187(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_188(boolean a0) throws Throwable;
private static native void __call100139_189(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_190(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_191(boolean a0) throws Throwable;
private static native void __call100139_192(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_193(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_194(boolean a0) throws Throwable;
private static native void __call100139_195(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_196(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_197(boolean a0) throws Throwable;
private static native void __call100139_198(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_199(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_200(boolean a0) throws Throwable;
private static native void __call100139_201(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_202(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_203(boolean a0) throws Throwable;
private static native void __call100139_204(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_205(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_206(boolean a0) throws Throwable;
private static native void __call100139_207(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_208(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_209(boolean a0) throws Throwable;
private static native void __call100139_210(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_211(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_212(boolean a0) throws Throwable;
private static native void __call100139_213(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_214(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_215(boolean a0) throws Throwable;
private static native void __call100139_216(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_217(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_218(boolean a0) throws Throwable;
private static native void __call100139_219(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_220(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_221(boolean a0) throws Throwable;
private static native void __call100139_222(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_223(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_224(boolean a0) throws Throwable;
private static native void __call100139_225(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_226(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_227(boolean a0) throws Throwable;
private static native void __call100139_228(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_229(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_230(boolean a0) throws Throwable;
private static native void __call100139_231(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_232(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_233(boolean a0) throws Throwable;
private static native void __call100139_234(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_235(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_236(boolean a0) throws Throwable;
private static native void __call100139_237(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_238(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_239(boolean a0) throws Throwable;
private static native void __call100139_240(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_241(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_242(boolean a0) throws Throwable;
private static native void __call100139_243(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_244(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_245(boolean a0) throws Throwable;
private static native void __call100139_246(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_247(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_248(boolean a0) throws Throwable;
private static native void __call100139_249(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_250(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_251(boolean a0) throws Throwable;
private static native void __call100139_252(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_253(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_254(boolean a0) throws Throwable;
private static native void __call100139_255(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_256(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_257(boolean a0) throws Throwable;
private static native void __call100139_258(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_259(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_260(boolean a0) throws Throwable;
private static native void __call100139_261(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_262(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_263(boolean a0) throws Throwable;
private static native void __call100139_264(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_265(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_266(boolean a0) throws Throwable;
private static native void __call100139_267(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_268(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_269(boolean a0) throws Throwable;
private static native void __call100139_270(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_271(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_272(boolean a0) throws Throwable;
private static native void __call100139_273(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_274(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_275(boolean a0) throws Throwable;
private static native void __call100139_276(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_277(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_278(boolean a0) throws Throwable;
private static native void __call100139_279(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_280(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_281(boolean a0) throws Throwable;
private static native void __call100139_282(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead100139_283(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native java.lang.Boolean __call100139_284(boolean a0) throws Throwable;
private static native void __call100139_285(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native int __invokedynamic100139_286(int a0, long a1) throws Throwable;
private static native int __call100139_287(int a0) throws Throwable;
private static native java.lang.Integer __call100139_288(int a0) throws Throwable;
private static native void __call100139_289(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __call100139_290() throws Throwable;
private static native int __invokedynamic100139_291(int a0, long a1) throws Throwable;
private static native int __call100139_292(int a0) throws Throwable;
private static native java.lang.Integer __call100139_293(int a0) throws Throwable;
private static native void __call100139_294(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __call100139_295() throws Throwable;
private static native int __invokedynamic100139_296(int a0, long a1) throws Throwable;
private static native int __call100139_297(int a0) throws Throwable;
private static native java.lang.Integer __call100139_298(int a0) throws Throwable;
private static native void __call100139_299(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __call100139_300() throws Throwable;
private static native int __invokedynamic100139_301(int a0, long a1) throws Throwable;
private static native int __call100139_302(int a0) throws Throwable;
private static native java.lang.Integer __call100139_303(int a0) throws Throwable;
private static native void __call100139_304(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __call100139_305() throws Throwable;
private static native int __invokedynamic100139_306(int a0, long a1) throws Throwable;
private static native int __call100139_307(int a0) throws Throwable;
private static native java.lang.Integer __call100139_308(int a0) throws Throwable;
private static native void __call100139_309(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __call100139_310() throws Throwable;
private static native int __invokedynamic100139_311(int a0, long a1) throws Throwable;
private static native int __call100139_312(int a0) throws Throwable;
private static native java.lang.Integer __call100139_313(int a0) throws Throwable;
private static native void __call100139_314(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __call100139_315() throws Throwable;
private static native int __call100139_316() throws Throwable;
private static native java.lang.Integer __call100139_317(int a0) throws Throwable;
private static native void __call100139_318(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native void __call100139_319(java.lang.String[] a0) throws Throwable;
private static native java.lang.Throwable __call13013900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.mojang.authlib.properties.PropertyMap __sourceHandlerCall_6a0633ecbb21ecc3c31c(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_6a0633ecbb21ecc3c31c {

public static com.mojang.authlib.properties.PropertyMap f1270(net.minecraft.client.Minecraft receiver) throws Throwable {
    com.mojang.authlib.properties.PropertyMap forwardValue1270_28_0;
    com.mojang.authlib.properties.PropertyMap spill1270_0;
    long life1_3;
    int[] life3_5;
    com.mojang.authlib.GameProfile life4_22;
    forward_join_28: {
    forward_join_26: {
    life1_3 = (__fieldRead1270_0() ^ 56927018918919L);
    life3_5 = __call1270_1();
    spill1270_0 = __fieldRead1270_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1270_28_0 = spill1270_0;
        break forward_join_28;
    }
    if (!(__call1270_3(spill1270_0))) {
        break forward_join_26;
    }
    life4_22 = __call1270_7(__call1270_4(receiver), __call1270_6(__fieldRead1270_5(receiver)), 0);
    __call1270_10(__fieldRead1270_8(receiver), __call1270_9(life4_22));
    }
    forwardValue1270_28_0 = __fieldRead1270_11(receiver);
    }
    return forwardValue1270_28_0;
}
public static void h1270_0(moom.Oo p0) throws Throwable {
    throw __call1127000_0(p0);
}
private static native long __fieldRead1270_0() throws Throwable;
private static native int[] __call1270_1() throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __fieldRead1270_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1270_3(com.mojang.authlib.properties.PropertyMap a0) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __call1270_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.Session __fieldRead1270_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1270_6(net.minecraft.util.Session a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1270_7(com.mojang.authlib.minecraft.MinecraftSessionService a0, com.mojang.authlib.GameProfile a1, int a2) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __fieldRead1270_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __call1270_9(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native boolean __call1270_10(com.mojang.authlib.properties.PropertyMap a0, com.mojang.authlib.properties.PropertyMap a1) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __fieldRead1270_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Throwable __call1127000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_73f6e5211c4278abb0b8(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_73f6e5211c4278abb0b8 {

public static java.lang.String f1271(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.Minecraft forwardValue1271_20_0;
    moom.jL forwardValue1271_26_0;
    java.lang.String forwardValue1271_33_0;
    net.minecraft.client.Minecraft spill1271_0;
    moom.jL spill1271_1;
    long life1_3;
    int[] life3_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_30: {
    forward_join_26: {
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life1_3 = (__fieldRead1271_0() ^ 32359424256871L);
    life3_5 = __call1271_1();
    spill1271_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1271_20_0 = spill1271_0;
        break forward_join_20;
    }
    if (!((__fieldRead1271_2(spill1271_0) != null))) {
        break forward_join_19;
    }
    if (!(__call1271_4(__fieldRead1271_3(receiver)))) {
        break forward_join_17;
    }
    forwardValue1271_33_0 = "hosting_lan";
    break forward_join_33;
    }
    forwardValue1271_33_0 = "singleplayer";
    break forward_join_33;
    }
    forwardValue1271_20_0 = receiver;
    }
    spill1271_1 = __fieldRead1271_5(forwardValue1271_20_0);
    if (!((life3_5 != null))) {
        forwardValue1271_26_0 = spill1271_1;
        break forward_join_26;
    }
    if (!((spill1271_1 != null))) {
        break forward_join_32;
    }
    forwardValue1271_26_0 = __fieldRead1271_6(receiver);
    }
    if (!(__call1271_7(forwardValue1271_26_0))) {
        break forward_join_30;
    }
    forwardValue1271_33_0 = "playing_lan";
    break forward_join_33;
    }
    forwardValue1271_33_0 = "multiplayer";
    break forward_join_33;
    }
    forwardValue1271_33_0 = "out_of_game";
    }
    return forwardValue1271_33_0;
}
public static void h1271_0(moom.Oo p0) throws Throwable {
    throw __call1127100_0(p0);
}
public static void h1271_1(moom.Oo p0) throws Throwable {
    throw __call1127101_0(p0);
}
public static void h1271_2(moom.Oo p0) throws Throwable {
    throw __call1127102_0(p0);
}
public static void h1271_3(moom.Oo p0) throws Throwable {
    throw __call1127103_0(p0);
}
public static void h1271_4(moom.Oo p0) throws Throwable {
    throw __call1127104_0(p0);
}
public static void h1271_5(moom.Oo p0) throws Throwable {
    throw __call1127105_0(p0);
}
private static native long __fieldRead1271_0() throws Throwable;
private static native int[] __call1271_1() throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1271_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1271_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1271_4(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native moom.jL __fieldRead1271_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.jL __fieldRead1271_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1271_7(moom.jL a0) throws Throwable;
private static native java.lang.Throwable __call1127100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127105_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d12410510283321e6e5b(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_d12410510283321e6e5b {

public static void f535(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.Minecraft forestValue535_26_0;
    net.minecraft.client.Minecraft forestValue535_29_0;
    net.minecraft.client.Minecraft forestValue535_35_0;
    int[] spill535_0;
    net.minecraft.client.Minecraft spill535_1;
    net.minecraft.client.Minecraft spill535_2;
    int[] life1_7;
    forest_join_35: {
    forest_join_34: {
    spill535_0 = __call535_0();
    __fieldWrite535_1(receiver, 1);
    __fieldWrite535_3(receiver, __call535_2());
    life1_7 = spill535_0;
    __call535_4(receiver);
    forest_cycle_10: while (true) {
    forest_join_29: {
    forest_join_28: {
    forest_join_26: {
    forest_join_25: {
    if (!(__fieldRead535_5(receiver))) {
        break forest_join_34;
    }
    spill535_1 = receiver;
    if (!((life1_7 != null))) {
        forestValue535_35_0 = spill535_1;
        break forest_join_35;
    }
    if (!((life1_7 != null))) {
        forestValue535_26_0 = spill535_1;
        break forest_join_26;
    }
    if (!(__fieldRead535_6(spill535_1))) {
        break forest_join_25;
    }
    spill535_2 = receiver;
    if (!((life1_7 != null))) {
        forestValue535_29_0 = spill535_2;
        break forest_join_29;
    }
    if (!((__fieldRead535_7(spill535_2) == null))) {
        break forest_join_28;
    }
    }
    forestValue535_26_0 = receiver;
    }
    __call535_8(forestValue535_26_0);
    continue forest_cycle_10;
    }
    forestValue535_29_0 = receiver;
    }
    __call535_10(forestValue535_29_0, __fieldRead535_9(receiver));
    if (!((life1_7 == null))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    }
    forestValue535_35_0 = receiver;
    }
    __call535_11(forestValue535_35_0);
    return;
}
public static void h535_0(java.lang.Throwable p0, net.minecraft.client.Minecraft p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_8;
    life2_2 = p0;
    __call3053500_0(life2_2);
    life3_8 = __call3053500_1(life2_2, "Initializing game");
    __call3053500_2(life3_8, "Initialization");
    __call3053500_4(p1, __call3053500_3(p1, life3_8));
    return;
}
public static void h535_1(java.lang.Throwable p0) throws Throwable {
    throw __call3053501_0(p0);
}
public static void h535_2(java.lang.Throwable p0) throws Throwable {
    throw __call3053502_0(p0);
}
public static void h535_3(java.lang.Throwable p0) throws Throwable {
    throw __call3053503_0(p0);
}
public static void h535_4(java.lang.Throwable p0) throws Throwable {
    throw __call3053504_0(p0);
}
public static void h535_5(java.lang.Throwable p0) throws Throwable {
    throw __call3053505_0(p0);
}
public static void h535_6(java.lang.OutOfMemoryError p0, net.minecraft.client.Minecraft p1, int[] p2) throws Throwable {
    net.minecraft.client.Minecraft forestValue3053506_28_0;
    net.minecraft.client.Minecraft forestValue3053506_31_0;
    net.minecraft.client.Minecraft forestValue3053506_38_0;
    net.minecraft.client.Minecraft forestValue3053506_60_0;
    net.minecraft.client.Minecraft forestValue3053506_63_0;
    net.minecraft.client.Minecraft spill3053506_0;
    net.minecraft.client.Minecraft spill3053506_1;
    net.minecraft.client.Minecraft spill3053506_2;
    net.minecraft.client.Minecraft spill3053506_3;
    java.lang.OutOfMemoryError life3_2;
    forest_join_63: {
    forest_join_62: {
    forest_join_37: {
    forest_join_12: {
    life3_2 = p0;
    __call3053506_0(p1);
    __call3053506_1(p1, new moom.gW());
    if (!((p2 == null))) {
        break forest_join_12;
    }
    break forest_join_37;
    }
    forest_cycle_12: while (true) {
    forest_join_31: {
    forest_join_30: {
    forest_join_28: {
    forest_join_27: {
    if (!(__fieldRead3053506_2(p1))) {
        break forest_join_62;
    }
    spill3053506_0 = p1;
    if (!((p2 != null))) {
        forestValue3053506_63_0 = spill3053506_0;
        break forest_join_63;
    }
    if (!((p2 != null))) {
        forestValue3053506_28_0 = spill3053506_0;
        break forest_join_28;
    }
    if (!(__fieldRead3053506_3(spill3053506_0))) {
        break forest_join_27;
    }
    spill3053506_1 = p1;
    if (!((p2 != null))) {
        forestValue3053506_31_0 = spill3053506_1;
        break forest_join_31;
    }
    if (!((__fieldRead3053506_4(spill3053506_1) == null))) {
        break forest_join_30;
    }
    }
    forestValue3053506_28_0 = p1;
    }
    __call3053506_5(forestValue3053506_28_0);
    continue forest_cycle_12;
    }
    forestValue3053506_31_0 = p1;
    }
    __call3053506_7(forestValue3053506_31_0, __fieldRead3053506_6(p1));
    if (!((p2 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    break forest_join_62;
    }
    forest_cycle_37: while (true) {
    forestValue3053506_38_0 = p1;
    forest_cycle_38: while (true) {
    forest_join_44: {
    __call3053506_9(forestValue3053506_38_0, __fieldRead3053506_8(p1));
    if (!((p2 == null))) {
        break forest_join_44;
    }
    break forest_join_62;
    }
    forest_cycle_44: while (true) {
    forest_join_60: {
    forest_join_59: {
    if (!(__fieldRead3053506_10(p1))) {
        break forest_join_62;
    }
    spill3053506_2 = p1;
    if (!((p2 != null))) {
        forestValue3053506_63_0 = spill3053506_2;
        break forest_join_63;
    }
    if (!((p2 != null))) {
        forestValue3053506_60_0 = spill3053506_2;
        break forest_join_60;
    }
    if (!(__fieldRead3053506_11(spill3053506_2))) {
        break forest_join_59;
    }
    spill3053506_3 = p1;
    if (!((p2 != null))) {
        forestValue3053506_38_0 = spill3053506_3;
        continue forest_cycle_38;
    }
    if (!((__fieldRead3053506_12(spill3053506_3) == null))) {
        continue forest_cycle_37;
    }
    }
    forestValue3053506_60_0 = p1;
    }
    __call3053506_13(forestValue3053506_60_0);
    continue forest_cycle_44;
    }
    }
    }
    }
    forestValue3053506_63_0 = p1;
    }
    __call3053506_14(forestValue3053506_63_0);
    return;
}
public static void h535_7(net.minecraft.util.MinecraftError p0, net.minecraft.client.Minecraft p1) throws Throwable {
    net.minecraft.util.MinecraftError life2_2;
    life2_2 = p0;
    __call3053507_0(life2_2);
    __call3053507_1(p1);
    return;
}
public static void h535_8(moom.Oo p0, net.minecraft.client.Minecraft p1) throws Throwable {
    moom.Oo life2_2;
    life2_2 = p0;
    __call3053508_1(p1, __call3053508_0(life2_2));
    __call3053508_2(p1);
    __call3053508_4(__fieldRead3053508_3(), "Reported exception thrown!", life2_2);
    __call3053508_6(p1, __call3053508_5(life2_2));
    __call3053508_7(life2_2);
    __call3053508_8(p1);
    return;
}
public static void h535_9(java.lang.Throwable p0, net.minecraft.client.Minecraft p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_10;
    life2_2 = p0;
    life3_10 = __call3053509_0(p1, new moom.qY("Unexpected error", life2_2));
    __call3053509_1(p1);
    __call3053509_3(__fieldRead3053509_2(), "Unreported exception thrown!", life2_2);
    __call3053509_4(p1, life3_10);
    __call3053509_5(life2_2);
    __call3053509_6(p1);
    return;
}
public static void h535_10(java.lang.Throwable p0, net.minecraft.client.Minecraft p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3053510_0(p1);
    throw life2_2;
}
private static native int[] __call535_0() throws Throwable;
private static native void __fieldWrite535_1(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native java.lang.Thread __call535_2() throws Throwable;
private static native void __fieldWrite535_3(net.minecraft.client.Minecraft a0, java.lang.Thread a1) throws Throwable;
private static native void __call535_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead535_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead535_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qY __fieldRead535_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call535_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qY __fieldRead535_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call535_10(net.minecraft.client.Minecraft a0, moom.qY a1) throws Throwable;
private static native void __call535_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053500_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3053500_1(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3053500_2(moom.qY a0, java.lang.String a1) throws Throwable;
private static native moom.qY __call3053500_3(net.minecraft.client.Minecraft a0, moom.qY a1) throws Throwable;
private static native void __call3053500_4(net.minecraft.client.Minecraft a0, moom.qY a1) throws Throwable;
private static native java.lang.Throwable __call3053501_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053502_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053503_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053504_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3053505_0(java.lang.Throwable a0) throws Throwable;
private static native void __call3053506_0(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053506_1(net.minecraft.client.Minecraft a0, moom.gW a1) throws Throwable;
private static native boolean __fieldRead3053506_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead3053506_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qY __fieldRead3053506_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053506_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qY __fieldRead3053506_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053506_7(net.minecraft.client.Minecraft a0, moom.qY a1) throws Throwable;
private static native moom.qY __fieldRead3053506_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053506_9(net.minecraft.client.Minecraft a0, moom.qY a1) throws Throwable;
private static native boolean __fieldRead3053506_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead3053506_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qY __fieldRead3053506_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053506_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053506_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053507_0(net.minecraft.util.MinecraftError a0) throws Throwable;
private static native void __call3053507_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qY __call3053508_0(moom.Oo a0) throws Throwable;
private static native moom.qY __call3053508_1(net.minecraft.client.Minecraft a0, moom.qY a1) throws Throwable;
private static native void __call3053508_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3053508_3() throws Throwable;
private static native void __call3053508_4(org.apache.logging.log4j.Logger a0, java.lang.String a1, moom.Oo a2) throws Throwable;
private static native moom.qY __call3053508_5(moom.Oo a0) throws Throwable;
private static native void __call3053508_6(net.minecraft.client.Minecraft a0, moom.qY a1) throws Throwable;
private static native void __call3053508_7(moom.Oo a0) throws Throwable;
private static native void __call3053508_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qY __call3053509_0(net.minecraft.client.Minecraft a0, moom.qY a1) throws Throwable;
private static native void __call3053509_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3053509_2() throws Throwable;
private static native void __call3053509_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native void __call3053509_4(net.minecraft.client.Minecraft a0, moom.qY a1) throws Throwable;
private static native void __call3053509_5(java.lang.Throwable a0) throws Throwable;
private static native void __call3053509_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053510_0(net.minecraft.client.Minecraft a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_49934cb053984a19d793(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_49934cb053984a19d793 {

public static int f1272(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.Minecraft forwardValue1272_23_0;
    int forwardValue1272_25_0;
    net.minecraft.client.Minecraft spill1272_0;
    net.minecraft.client.Minecraft spill1272_1;
    long life1_3;
    int[] life3_5;
    forward_join_25: {
    forward_join_23: {
    forward_join_22: {
    life1_3 = (__fieldRead1272_0() ^ 72633472288138L);
    life3_5 = __call1272_1();
    spill1272_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1272_23_0 = spill1272_0;
        break forward_join_23;
    }
    if (!((__fieldRead1272_2(spill1272_0) == null))) {
        break forward_join_22;
    }
    spill1272_1 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1272_23_0 = spill1272_1;
        break forward_join_23;
    }
    if (!((__fieldRead1272_3(spill1272_1) != null))) {
        break forward_join_22;
    }
    forwardValue1272_25_0 = __invokedynamic1272_4(4868, (3246250318060491081L ^ life1_3));
    break forward_join_25;
    }
    forwardValue1272_23_0 = receiver;
    }
    forwardValue1272_25_0 = __fieldRead1272_6(__fieldRead1272_5(forwardValue1272_23_0));
    }
    return forwardValue1272_25_0;
}
public static void h1272_0(moom.Oo p0) throws Throwable {
    throw __call1127200_0(p0);
}
public static void h1272_1(moom.Oo p0) throws Throwable {
    throw __call1127201_0(p0);
}
public static void h1272_2(moom.Oo p0) throws Throwable {
    throw __call1127202_0(p0);
}
public static void h1272_3(moom.Oo p0) throws Throwable {
    throw __call1127203_0(p0);
}
private static native long __fieldRead1272_0() throws Throwable;
private static native int[] __call1272_1() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead1272_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1272_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic1272_4(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1272_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1272_6(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1127200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_09628cae6ef5b07badde(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_09628cae6ef5b07badde {

public static boolean f2157(net.minecraft.client.Minecraft receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2157_0() ^ 110235495528073L);
    return ((__call2157_1() == __fieldRead2157_2(receiver)) ? true : false);
}
public static void h2157_0(moom.Oo p0) throws Throwable {
    throw __call1215700_0(p0);
}
private static native long __fieldRead2157_0() throws Throwable;
private static native java.lang.Thread __call2157_1() throws Throwable;
private static native java.lang.Thread __fieldRead2157_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Throwable __call1215700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cf9d22946cf27734949b(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_cf9d22946cf27734949b {

public static void f536(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.settings.GameSettings forestValue536_215_0;
    net.minecraft.client.Minecraft forestValue536_347_0;
    net.minecraft.client.renderer.texture.TextureMap forestValue536_356_0;
    int forestValue536_356_1;
    int forestValue536_356_2;
    net.minecraft.client.renderer.texture.TextureMap forestValue536_357_0;
    int forestValue536_357_1;
    net.minecraft.client.renderer.texture.TextureMap forestValue536_358_0;
    int forestValue536_358_1;
    int forestValue536_358_2;
    int forestValue536_505_0;
    int[] spill536_0;
    net.minecraft.client.Minecraft spill536_1;
    net.minecraft.client.settings.GameSettings spill536_2;
    net.minecraft.client.settings.GameSettings spill536_3;
    net.minecraft.client.settings.GameSettings spill536_4;
    net.minecraft.client.Minecraft spill536_5;
    net.minecraft.client.shader.Framebuffer spill536_6;
    net.minecraft.client.Minecraft spill536_7;
    net.minecraft.client.resources.ResourcePackRepository spill536_8;
    net.minecraft.client.resources.ResourcePackRepository spill536_9;
    java.io.File spill536_10;
    java.io.File spill536_11;
    net.minecraft.client.Minecraft spill536_12;
    moom.o4 spill536_13;
    net.minecraft.client.Minecraft spill536_14;
    net.minecraft.client.resources.LanguageManager spill536_15;
    net.minecraft.client.Minecraft spill536_16;
    net.minecraft.client.renderer.texture.TextureManager spill536_17;
    net.minecraft.client.Minecraft spill536_18;
    moom.o6 spill536_19;
    moom.o6 spill536_20;
    net.minecraft.client.renderer.texture.TextureManager spill536_21;
    java.io.File spill536_22;
    net.minecraft.client.Minecraft spill536_23;
    net.minecraft.world.chunk.storage.AnvilSaveConverter spill536_24;
    net.minecraft.world.chunk.storage.AnvilSaveConverter spill536_25;
    java.io.File spill536_26;
    net.minecraft.client.Minecraft spill536_27;
    net.minecraft.client.audio.SoundHandler spill536_28;
    net.minecraft.client.Minecraft spill536_29;
    moom.fS spill536_30;
    net.minecraft.client.Minecraft spill536_31;
    net.minecraft.client.gui.FontRenderer spill536_32;
    net.minecraft.client.gui.FontRenderer spill536_33;
    net.minecraft.client.settings.GameSettings spill536_34;
    moom.DD spill536_35;
    net.minecraft.client.Minecraft spill536_36;
    net.minecraft.client.Minecraft spill536_37;
    net.minecraft.client.gui.FontRenderer spill536_38;
    net.minecraft.client.gui.FontRenderer spill536_39;
    net.minecraft.client.settings.GameSettings spill536_40;
    moom.DD spill536_41;
    int spill536_42;
    long spill536_43;
    moom.oP spill536_44;
    moom.oN spill536_45;
    moom.oP spill536_46;
    moom.oM spill536_47;
    net.minecraft.client.Minecraft spill536_48;
    moom.Dt spill536_49;
    int spill536_50;
    long spill536_51;
    int spill536_52;
    int spill536_53;
    net.minecraft.client.Minecraft spill536_54;
    net.minecraft.client.renderer.texture.TextureMap spill536_55;
    net.minecraft.client.renderer.texture.TextureMap spill536_56;
    int spill536_57;
    int spill536_58;
    net.minecraft.client.Minecraft spill536_59;
    net.minecraft.client.resources.model.ModelManager spill536_60;
    net.minecraft.client.Minecraft spill536_61;
    net.minecraft.client.renderer.entity.RenderItem spill536_62;
    net.minecraft.client.Minecraft spill536_63;
    net.minecraft.client.renderer.entity.RenderManager spill536_64;
    net.minecraft.client.Minecraft spill536_65;
    moom.lm spill536_66;
    net.minecraft.client.Minecraft spill536_67;
    net.minecraft.client.renderer.EntityRenderer spill536_68;
    net.minecraft.client.Minecraft spill536_69;
    net.minecraft.client.renderer.BlockRendererDispatcher spill536_70;
    net.minecraft.client.Minecraft spill536_71;
    net.minecraft.client.renderer.RenderGlobal spill536_72;
    net.minecraft.client.Minecraft spill536_73;
    moom.hK spill536_74;
    net.minecraft.client.Minecraft spill536_75;
    net.minecraft.client.particle.EffectRenderer spill536_76;
    net.minecraft.client.Minecraft spill536_77;
    net.minecraft.client.gui.GuiIngame spill536_78;
    net.minecraft.client.Minecraft spill536_79;
    com.moon.ph spill536_80;
    net.minecraft.client.Minecraft spill536_81;
    moom.fL spill536_82;
    boolean spill536_83;
    boolean spill536_84;
    long life1_3;
    int[] life3_13;
    forest_join_505: {
    forest_join_502: {
    forest_join_358: {
    forest_join_357: {
    forest_join_356: {
    forest_join_347: {
    forest_join_228: {
    forest_join_215: {
    forest_join_44: {
    life1_3 = (__fieldRead536_0() ^ 17938172033864L);
    spill536_0 = __call536_1();
    spill536_1 = receiver;
    net.minecraft.client.settings.GameSettings __stackOp536_3_0 = __sourceUninitializedNEW536_2();
    spill536_2 = __stackOp536_3_0;
    __explicitNewInit536_5(__stackOp536_3_0, receiver, __fieldRead536_4(receiver));
    __fieldWrite536_6(spill536_1, spill536_2);
    life3_13 = spill536_0;
    __call536_9(__fieldRead536_7(receiver), __fieldRead536_8(receiver));
    __call536_10(receiver);
    spill536_3 = __fieldRead536_11(receiver);
    if (!((life3_13 != null))) {
        forestValue536_215_0 = spill536_3;
        break forest_join_215;
    }
    if (!((__fieldRead536_12(spill536_3) > 0))) {
        break forest_join_44;
    }
    spill536_4 = __fieldRead536_13(receiver);
    if (!((life3_13 != null))) {
        forestValue536_215_0 = spill536_4;
        break forest_join_215;
    }
    if (!((__fieldRead536_14(spill536_4) > 0))) {
        break forest_join_44;
    }
    __fieldWrite536_17(receiver, __fieldRead536_16(__fieldRead536_15(receiver)));
    __fieldWrite536_20(receiver, __fieldRead536_19(__fieldRead536_18(receiver)));
    }
    __call536_24(__fieldRead536_21(), __invokedynamic536_23(__call536_22()));
    __call536_25(receiver);
    __call536_26(receiver);
    __call536_27(receiver);
    __call536_32(__fieldRead536_28(), __invokedynamic536_31(__call536_30(__invokedynamic536_29(27400, (2730538441168607125L ^ life1_3)))));
    __call536_37(__fieldRead536_33(), __invokedynamic536_36(__call536_35(__invokedynamic536_34(2534, (3084579239531722090L ^ life1_3)))));
    __call536_38();
    spill536_5 = receiver;
    net.minecraft.client.shader.Framebuffer __stackOp536_40_0 = __sourceUninitializedNEW536_39();
    spill536_6 = __stackOp536_40_0;
    __explicitNewInit536_43(__stackOp536_40_0, __fieldRead536_41(receiver), __fieldRead536_42(receiver), true);
    __fieldWrite536_44(spill536_5, spill536_6);
    __call536_46(__fieldRead536_45(receiver), 0x0.0p0f, 0x0.0p0f, 0x0.0p0f, 0x0.0p0f);
    __call536_47(receiver);
    spill536_7 = receiver;
    net.minecraft.client.resources.ResourcePackRepository __stackOp536_49_0 = __sourceUninitializedNEW536_48();
    spill536_8 = __stackOp536_49_0;
    spill536_9 = __stackOp536_49_0;
    spill536_10 = __fieldRead536_50(receiver);
    java.io.File __stackOp536_52_0 = __sourceUninitializedNEW536_51();
    spill536_11 = __stackOp536_52_0;
    __explicitNewInit536_54(__stackOp536_52_0, __fieldRead536_53(receiver), "server-resource-packs");
    __explicitNewInit536_58(spill536_9, spill536_10, spill536_11, __fieldRead536_55(receiver), __fieldRead536_56(receiver), __fieldRead536_57(receiver));
    __fieldWrite536_59(spill536_7, spill536_8);
    spill536_12 = receiver;
    moom.o4 __stackOp536_61_0 = __sourceUninitializedNEW536_60();
    spill536_13 = __stackOp536_61_0;
    __explicitNewInit536_63(__stackOp536_61_0, __fieldRead536_62(receiver));
    __fieldWrite536_64(spill536_12, spill536_13);
    spill536_14 = receiver;
    net.minecraft.client.resources.LanguageManager __stackOp536_66_0 = __sourceUninitializedNEW536_65();
    spill536_15 = __stackOp536_66_0;
    __explicitNewInit536_70(__stackOp536_66_0, __fieldRead536_67(receiver), __fieldRead536_69(__fieldRead536_68(receiver)));
    __fieldWrite536_71(spill536_14, spill536_15);
    __call536_74(__fieldRead536_72(receiver), __fieldRead536_73(receiver));
    __call536_75(receiver);
    spill536_16 = receiver;
    net.minecraft.client.renderer.texture.TextureManager __stackOp536_77_0 = __sourceUninitializedNEW536_76();
    spill536_17 = __stackOp536_77_0;
    __explicitNewInit536_79(__stackOp536_77_0, __fieldRead536_78(receiver));
    __fieldWrite536_80(spill536_16, spill536_17);
    __call536_83(__fieldRead536_81(receiver), __fieldRead536_82(receiver));
    __call536_85(receiver, __fieldRead536_84(receiver));
    spill536_18 = receiver;
    moom.o6 __stackOp536_87_0 = __sourceUninitializedNEW536_86();
    spill536_19 = __stackOp536_87_0;
    spill536_20 = __stackOp536_87_0;
    spill536_21 = __fieldRead536_88(receiver);
    java.io.File __stackOp536_90_0 = __sourceUninitializedNEW536_89();
    spill536_22 = __stackOp536_90_0;
    __explicitNewInit536_92(__stackOp536_90_0, __fieldRead536_91(receiver), "skins");
    __explicitNewInit536_94(spill536_20, spill536_21, spill536_22, __fieldRead536_93(receiver));
    __fieldWrite536_95(spill536_18, spill536_19);
    spill536_23 = receiver;
    net.minecraft.world.chunk.storage.AnvilSaveConverter __stackOp536_97_0 = __sourceUninitializedNEW536_96();
    spill536_24 = __stackOp536_97_0;
    spill536_25 = __stackOp536_97_0;
    java.io.File __stackOp536_99_0 = __sourceUninitializedNEW536_98();
    spill536_26 = __stackOp536_99_0;
    __explicitNewInit536_101(__stackOp536_99_0, __fieldRead536_100(receiver), "saves");
    __explicitNewInit536_102(spill536_25, spill536_26);
    __fieldWrite536_103(spill536_23, spill536_24);
    spill536_27 = receiver;
    net.minecraft.client.audio.SoundHandler __stackOp536_105_0 = __sourceUninitializedNEW536_104();
    spill536_28 = __stackOp536_105_0;
    __explicitNewInit536_108(__stackOp536_105_0, __fieldRead536_106(receiver), __fieldRead536_107(receiver));
    __fieldWrite536_109(spill536_27, spill536_28);
    __call536_112(__fieldRead536_110(receiver), __fieldRead536_111(receiver));
    spill536_29 = receiver;
    moom.fS __stackOp536_114_0 = __sourceUninitializedNEW536_113();
    spill536_30 = __stackOp536_114_0;
    __explicitNewInit536_115(__stackOp536_114_0, receiver);
    __fieldWrite536_116(spill536_29, spill536_30);
    spill536_31 = receiver;
    net.minecraft.client.gui.FontRenderer __stackOp536_118_0 = __sourceUninitializedNEW536_117();
    spill536_32 = __stackOp536_118_0;
    spill536_33 = __stackOp536_118_0;
    spill536_34 = __fieldRead536_119(receiver);
    moom.DD __stackOp536_121_0 = __sourceUninitializedNEW536_120();
    spill536_35 = __stackOp536_121_0;
    __explicitNewInit536_122(__stackOp536_121_0, "textures/font/ascii.png");
    __explicitNewInit536_124(spill536_33, spill536_34, spill536_35, __fieldRead536_123(receiver), false);
    __fieldWrite536_125(spill536_31, spill536_32);
    spill536_36 = receiver;
    if (!((life3_13 != null))) {
        forestValue536_347_0 = spill536_36;
        break forest_join_347;
    }
    forestValue536_215_0 = __fieldRead536_126(spill536_36);
    }
    if (!((__fieldRead536_127(forestValue536_215_0) != null))) {
        break forest_join_228;
    }
    __call536_130(__fieldRead536_128(receiver), __call536_129(receiver));
    __call536_134(__fieldRead536_131(receiver), __call536_133(__fieldRead536_132(receiver)));
    }
    spill536_37 = receiver;
    net.minecraft.client.gui.FontRenderer __stackOp536_136_0 = __sourceUninitializedNEW536_135();
    spill536_38 = __stackOp536_136_0;
    spill536_39 = __stackOp536_136_0;
    spill536_40 = __fieldRead536_137(receiver);
    moom.DD __stackOp536_139_0 = __sourceUninitializedNEW536_138();
    spill536_41 = __stackOp536_139_0;
    __explicitNewInit536_140(__stackOp536_139_0, "textures/font/ascii_sga.png");
    __explicitNewInit536_142(spill536_39, spill536_40, spill536_41, __fieldRead536_141(receiver), false);
    __fieldWrite536_143(spill536_37, spill536_38);
    spill536_42 = 19480;
    __call536_146(__fieldRead536_144(receiver), __fieldRead536_145(receiver));
    spill536_43 = (1766970400395096272L ^ life1_3);
    __call536_149(__fieldRead536_147(receiver), __fieldRead536_148(receiver));
    spill536_44 = __fieldRead536_150(receiver);
    moom.oN __stackOp536_152_0 = __sourceUninitializedNEW536_151();
    spill536_45 = __stackOp536_152_0;
    __explicitNewInit536_153(__stackOp536_152_0);
    __call536_154(spill536_44, spill536_45);
    spill536_46 = __fieldRead536_155(receiver);
    moom.oM __stackOp536_157_0 = __sourceUninitializedNEW536_156();
    spill536_47 = __stackOp536_157_0;
    __explicitNewInit536_158(__stackOp536_157_0);
    __call536_159(spill536_46, spill536_47);
    __call536_162(__fieldRead536_160(), __invokedynamic536_161(receiver));
    spill536_48 = receiver;
    moom.Dt __stackOp536_164_0 = __sourceUninitializedNEW536_163();
    spill536_49 = __stackOp536_164_0;
    __explicitNewInit536_165(__stackOp536_164_0);
    __fieldWrite536_166(spill536_48, spill536_49);
    __call536_167(receiver, "Pre startup");
    __call536_168();
    __call536_170(__invokedynamic536_169(spill536_42, spill536_43));
    spill536_50 = 15380;
    __call536_171(0x1.0p0d);
    spill536_51 = (6754105271397351565L ^ life1_3);
    __call536_172();
    __call536_174(__invokedynamic536_173(spill536_50, spill536_51));
    spill536_52 = 16191;
    __call536_175();
    __call536_177(__invokedynamic536_176(spill536_52, (3777204741754586110L ^ life1_3)), 0x1.99999ap-4f);
    __call536_179(__invokedynamic536_178(28466, (4610711292088636375L ^ life1_3)));
    __call536_181(__invokedynamic536_180(15494, (8002661051594440828L ^ life1_3)));
    spill536_53 = 25380;
    __call536_182();
    __call536_184(__invokedynamic536_183(spill536_53, (6028358763125759921L ^ life1_3)));
    __call536_185(receiver, "Startup");
    spill536_54 = receiver;
    net.minecraft.client.renderer.texture.TextureMap __stackOp536_187_0 = __sourceUninitializedNEW536_186();
    spill536_55 = __stackOp536_187_0;
    __explicitNewInit536_188(__stackOp536_187_0, "textures");
    __fieldWrite536_189(spill536_54, spill536_55);
    __call536_193(__fieldRead536_190(receiver), __fieldRead536_192(__fieldRead536_191(receiver)));
    __call536_197(__fieldRead536_194(receiver), __fieldRead536_195(), __fieldRead536_196(receiver));
    __call536_200(__fieldRead536_198(receiver), __fieldRead536_199());
    forestValue536_347_0 = receiver;
    }
    spill536_56 = __fieldRead536_201(forestValue536_347_0);
    spill536_57 = 0;
    spill536_58 = __fieldRead536_203(__fieldRead536_202(receiver));
    if (!((life3_13 != null))) {
        forestValue536_356_0 = spill536_56;
        forestValue536_356_1 = spill536_57;
        forestValue536_356_2 = spill536_58;
        break forest_join_356;
    }
    if (!((spill536_58 > 0))) {
        forestValue536_357_0 = spill536_56;
        forestValue536_357_1 = spill536_57;
        break forest_join_357;
    }
    forestValue536_356_0 = spill536_56;
    forestValue536_356_1 = spill536_57;
    forestValue536_356_2 = 1;
    }
    forestValue536_358_0 = forestValue536_356_0;
    forestValue536_358_1 = forestValue536_356_1;
    forestValue536_358_2 = forestValue536_356_2;
    break forest_join_358;
    }
    forestValue536_358_0 = forestValue536_357_0;
    forestValue536_358_1 = forestValue536_357_1;
    forestValue536_358_2 = 0;
    }
    __call536_204(forestValue536_358_0, forestValue536_358_1, forestValue536_358_2);
    spill536_59 = receiver;
    net.minecraft.client.resources.model.ModelManager __stackOp536_206_0 = __sourceUninitializedNEW536_205();
    spill536_60 = __stackOp536_206_0;
    __explicitNewInit536_208(__stackOp536_206_0, __fieldRead536_207(receiver));
    __fieldWrite536_209(spill536_59, spill536_60);
    __call536_212(__fieldRead536_210(receiver), __fieldRead536_211(receiver));
    spill536_61 = receiver;
    net.minecraft.client.renderer.entity.RenderItem __stackOp536_214_0 = __sourceUninitializedNEW536_213();
    spill536_62 = __stackOp536_214_0;
    __explicitNewInit536_217(__stackOp536_214_0, __fieldRead536_215(receiver), __fieldRead536_216(receiver));
    __fieldWrite536_218(spill536_61, spill536_62);
    spill536_63 = receiver;
    net.minecraft.client.renderer.entity.RenderManager __stackOp536_220_0 = __sourceUninitializedNEW536_219();
    spill536_64 = __stackOp536_220_0;
    __explicitNewInit536_223(__stackOp536_220_0, __fieldRead536_221(receiver), __fieldRead536_222(receiver));
    __fieldWrite536_224(spill536_63, spill536_64);
    spill536_65 = receiver;
    moom.lm __stackOp536_226_0 = __sourceUninitializedNEW536_225();
    spill536_66 = __stackOp536_226_0;
    __explicitNewInit536_227(__stackOp536_226_0, receiver);
    __fieldWrite536_228(spill536_65, spill536_66);
    __call536_231(__fieldRead536_229(receiver), __fieldRead536_230(receiver));
    spill536_67 = receiver;
    net.minecraft.client.renderer.EntityRenderer __stackOp536_233_0 = __sourceUninitializedNEW536_232();
    spill536_68 = __stackOp536_233_0;
    __explicitNewInit536_235(__stackOp536_233_0, receiver, __fieldRead536_234(receiver));
    __fieldWrite536_236(spill536_67, spill536_68);
    __call536_239(__fieldRead536_237(receiver), __fieldRead536_238(receiver));
    spill536_69 = receiver;
    net.minecraft.client.renderer.BlockRendererDispatcher __stackOp536_241_0 = __sourceUninitializedNEW536_240();
    spill536_70 = __stackOp536_241_0;
    __explicitNewInit536_245(__stackOp536_241_0, __call536_243(__fieldRead536_242(receiver)), __fieldRead536_244(receiver));
    __fieldWrite536_246(spill536_69, spill536_70);
    __call536_249(__fieldRead536_247(receiver), __fieldRead536_248(receiver));
    spill536_71 = receiver;
    net.minecraft.client.renderer.RenderGlobal __stackOp536_251_0 = __sourceUninitializedNEW536_250();
    spill536_72 = __stackOp536_251_0;
    __explicitNewInit536_252(__stackOp536_251_0, receiver);
    __fieldWrite536_253(spill536_71, spill536_72);
    __call536_256(__fieldRead536_254(receiver), __fieldRead536_255(receiver));
    spill536_73 = receiver;
    moom.hK __stackOp536_258_0 = __sourceUninitializedNEW536_257();
    spill536_74 = __stackOp536_258_0;
    __explicitNewInit536_259(__stackOp536_258_0, receiver);
    __fieldWrite536_260(spill536_73, spill536_74);
    __call536_263(0, 0, __fieldRead536_261(receiver), __fieldRead536_262(receiver));
    spill536_75 = receiver;
    net.minecraft.client.particle.EffectRenderer __stackOp536_265_0 = __sourceUninitializedNEW536_264();
    spill536_76 = __stackOp536_265_0;
    __explicitNewInit536_268(__stackOp536_265_0, __fieldRead536_266(receiver), __fieldRead536_267(receiver));
    __fieldWrite536_269(spill536_75, spill536_76);
    __call536_270(receiver, "Post startup");
    spill536_77 = receiver;
    net.minecraft.client.gui.GuiIngame __stackOp536_272_0 = __sourceUninitializedNEW536_271();
    spill536_78 = __stackOp536_272_0;
    __explicitNewInit536_273(__stackOp536_272_0, receiver);
    __fieldWrite536_274(spill536_77, spill536_78);
    spill536_79 = receiver;
    com.moon.ph __stackOp536_276_0 = __sourceUninitializedNEW536_275();
    spill536_80 = __stackOp536_276_0;
    __explicitNewInit536_277(__stackOp536_276_0);
    __call536_278(spill536_79, spill536_80);
    __call536_281(__fieldRead536_279(receiver), __fieldRead536_280(receiver));
    __fieldWrite536_282(receiver, null);
    spill536_81 = receiver;
    moom.fL __stackOp536_284_0 = __sourceUninitializedNEW536_283();
    spill536_82 = __stackOp536_284_0;
    __explicitNewInit536_285(__stackOp536_284_0, receiver);
    __fieldWrite536_286(spill536_81, spill536_82);
    spill536_83 = __fieldRead536_288(__fieldRead536_287(receiver));
    if (!((life3_13 != null))) {
        forestValue536_505_0 = __integerCategory536_289(spill536_83);
        break forest_join_505;
    }
    if (!(spill536_83)) {
        break forest_join_502;
    }
    spill536_84 = __fieldRead536_290(receiver);
    if (!((life3_13 != null))) {
        forestValue536_505_0 = __integerCategory536_291(spill536_84);
        break forest_join_505;
    }
    if (!((!spill536_84))) {
        break forest_join_502;
    }
    __call536_292(receiver);
    }
    forestValue536_505_0 = __integerCategory536_295(__fieldRead536_294(__fieldRead536_293(receiver)));
    }
    __call536_296(forestValue536_505_0);
    __call536_298(__fieldRead536_297(receiver));
    return;
}
public static void h536_0(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053600_0(p0);
}
public static void h536_1(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053601_0(p0);
}
public static void h536_2(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053602_0(p0);
}
public static void h536_3(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053603_0(p0);
}
public static void h536_4(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053604_0(p0);
}
public static void h536_5(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053605_0(p0);
}
public static void h536_6(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053606_0(p0);
}
public static void h536_7(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053607_0(p0);
}
public static void h536_8(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053608_0(p0);
}
public static void h536_9(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053609_0(p0);
}
public static void h536_10(org.lwjgl.opengl.OpenGLException p0) throws Throwable {
    throw __call3053610_0(p0);
}
public static void h536_11(org.lwjgl.opengl.OpenGLException p0, net.minecraft.client.Minecraft p1) throws Throwable {
    org.lwjgl.opengl.OpenGLException life2_2;
    life2_2 = p0;
    __fieldWrite3053611_1(__fieldRead3053611_0(p1), 0);
    __call3053611_3(__fieldRead3053611_2(p1));
    __call3053611_5(__fieldRead3053611_4(p1));
    return;
}
private static native long __fieldRead536_0() throws Throwable;
private static native int[] __call536_1() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __sourceUninitializedNEW536_2() throws Throwable;
private static native java.io.File __fieldRead536_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_5(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.Minecraft a1, java.io.File a2) throws Throwable;
private static native void __fieldWrite536_6(net.minecraft.client.Minecraft a0, net.minecraft.client.settings.GameSettings a1) throws Throwable;
private static native java.util.List __fieldRead536_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.oK __fieldRead536_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call536_9(java.util.List a0, moom.oK a1) throws Throwable;
private static native void __call536_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead536_12(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead536_14(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead536_16(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __fieldWrite536_17(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead536_19(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __fieldWrite536_20(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead536_21() throws Throwable;
private static native java.lang.String __call536_22() throws Throwable;
private static native java.lang.String __invokedynamic536_23(java.lang.String a0) throws Throwable;
private static native void __call536_24(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call536_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead536_28() throws Throwable;
private static native int __invokedynamic536_29(int a0, long a1) throws Throwable;
private static native java.lang.String __call536_30(int a0) throws Throwable;
private static native java.lang.String __invokedynamic536_31(java.lang.String a0) throws Throwable;
private static native void __call536_32(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead536_33() throws Throwable;
private static native int __invokedynamic536_34(int a0, long a1) throws Throwable;
private static native java.lang.String __call536_35(int a0) throws Throwable;
private static native java.lang.String __invokedynamic536_36(java.lang.String a0) throws Throwable;
private static native void __call536_37(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call536_38() throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __sourceUninitializedNEW536_39() throws Throwable;
private static native int __fieldRead536_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead536_42(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_43(net.minecraft.client.shader.Framebuffer a0, int a1, int a2, boolean a3) throws Throwable;
private static native void __fieldWrite536_44(net.minecraft.client.Minecraft a0, net.minecraft.client.shader.Framebuffer a1) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead536_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_46(net.minecraft.client.shader.Framebuffer a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call536_47(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __sourceUninitializedNEW536_48() throws Throwable;
private static native java.io.File __fieldRead536_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.io.File __sourceUninitializedNEW536_51() throws Throwable;
private static native java.io.File __fieldRead536_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_54(java.io.File a0, java.io.File a1, java.lang.String a2) throws Throwable;
private static native moom.oK __fieldRead536_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead536_56(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_57(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_58(net.minecraft.client.resources.ResourcePackRepository a0, java.io.File a1, java.io.File a2, net.minecraft.client.resources.IResourcePack a3, net.minecraft.client.resources.data.IMetadataSerializer a4, net.minecraft.client.settings.GameSettings a5) throws Throwable;
private static native void __fieldWrite536_59(net.minecraft.client.Minecraft a0, net.minecraft.client.resources.ResourcePackRepository a1) throws Throwable;
private static native moom.o4 __sourceUninitializedNEW536_60() throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead536_62(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_63(moom.o4 a0, net.minecraft.client.resources.data.IMetadataSerializer a1) throws Throwable;
private static native void __fieldWrite536_64(net.minecraft.client.Minecraft a0, moom.o4 a1) throws Throwable;
private static native net.minecraft.client.resources.LanguageManager __sourceUninitializedNEW536_65() throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead536_67(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_68(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead536_69(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __explicitNewInit536_70(net.minecraft.client.resources.LanguageManager a0, net.minecraft.client.resources.data.IMetadataSerializer a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite536_71(net.minecraft.client.Minecraft a0, net.minecraft.client.resources.LanguageManager a1) throws Throwable;
private static native moom.oP __fieldRead536_72(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.LanguageManager __fieldRead536_73(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_74(moom.oP a0, net.minecraft.client.resources.LanguageManager a1) throws Throwable;
private static native void __call536_75(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __sourceUninitializedNEW536_76() throws Throwable;
private static native moom.oP __fieldRead536_78(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_79(net.minecraft.client.renderer.texture.TextureManager a0, moom.oR a1) throws Throwable;
private static native void __fieldWrite536_80(net.minecraft.client.Minecraft a0, net.minecraft.client.renderer.texture.TextureManager a1) throws Throwable;
private static native moom.oP __fieldRead536_81(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_82(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_83(moom.oP a0, net.minecraft.client.renderer.texture.TextureManager a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_84(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_85(net.minecraft.client.Minecraft a0, net.minecraft.client.renderer.texture.TextureManager a1) throws Throwable;
private static native moom.o6 __sourceUninitializedNEW536_86() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_88(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.io.File __sourceUninitializedNEW536_89() throws Throwable;
private static native java.io.File __fieldRead536_91(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_92(java.io.File a0, java.io.File a1, java.lang.String a2) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __fieldRead536_93(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_94(moom.o6 a0, net.minecraft.client.renderer.texture.TextureManager a1, java.io.File a2, com.mojang.authlib.minecraft.MinecraftSessionService a3) throws Throwable;
private static native void __fieldWrite536_95(net.minecraft.client.Minecraft a0, moom.o6 a1) throws Throwable;
private static native net.minecraft.world.chunk.storage.AnvilSaveConverter __sourceUninitializedNEW536_96() throws Throwable;
private static native java.io.File __sourceUninitializedNEW536_98() throws Throwable;
private static native java.io.File __fieldRead536_100(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_101(java.io.File a0, java.io.File a1, java.lang.String a2) throws Throwable;
private static native void __explicitNewInit536_102(net.minecraft.world.chunk.storage.AnvilSaveConverter a0, java.io.File a1) throws Throwable;
private static native void __fieldWrite536_103(net.minecraft.client.Minecraft a0, net.minecraft.world.chunk.storage.AnvilSaveConverter a1) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __sourceUninitializedNEW536_104() throws Throwable;
private static native moom.oP __fieldRead536_106(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_107(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_108(net.minecraft.client.audio.SoundHandler a0, moom.oR a1, net.minecraft.client.settings.GameSettings a2) throws Throwable;
private static native void __fieldWrite536_109(net.minecraft.client.Minecraft a0, net.minecraft.client.audio.SoundHandler a1) throws Throwable;
private static native moom.oP __fieldRead536_110(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead536_111(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_112(moom.oP a0, net.minecraft.client.audio.SoundHandler a1) throws Throwable;
private static native moom.fS __sourceUninitializedNEW536_113() throws Throwable;
private static native void __explicitNewInit536_115(moom.fS a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native void __fieldWrite536_116(net.minecraft.client.Minecraft a0, moom.fS a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __sourceUninitializedNEW536_117() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_119(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __sourceUninitializedNEW536_120() throws Throwable;
private static native void __explicitNewInit536_122(moom.DD a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_123(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_124(net.minecraft.client.gui.FontRenderer a0, net.minecraft.client.settings.GameSettings a1, moom.DD a2, net.minecraft.client.renderer.texture.TextureManager a3, boolean a4) throws Throwable;
private static native void __fieldWrite536_125(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.FontRenderer a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_126(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead536_127(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead536_128(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call536_129(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_130(net.minecraft.client.gui.FontRenderer a0, boolean a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead536_131(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.LanguageManager __fieldRead536_132(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call536_133(net.minecraft.client.resources.LanguageManager a0) throws Throwable;
private static native void __call536_134(net.minecraft.client.gui.FontRenderer a0, boolean a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __sourceUninitializedNEW536_135() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_137(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __sourceUninitializedNEW536_138() throws Throwable;
private static native void __explicitNewInit536_140(moom.DD a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_141(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_142(net.minecraft.client.gui.FontRenderer a0, net.minecraft.client.settings.GameSettings a1, moom.DD a2, net.minecraft.client.renderer.texture.TextureManager a3, boolean a4) throws Throwable;
private static native void __fieldWrite536_143(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.FontRenderer a1) throws Throwable;
private static native moom.oP __fieldRead536_144(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead536_145(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_146(moom.oP a0, net.minecraft.client.gui.FontRenderer a1) throws Throwable;
private static native moom.oP __fieldRead536_147(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead536_148(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_149(moom.oP a0, net.minecraft.client.gui.FontRenderer a1) throws Throwable;
private static native moom.oP __fieldRead536_150(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.oN __sourceUninitializedNEW536_151() throws Throwable;
private static native void __explicitNewInit536_153(moom.oN a0) throws Throwable;
private static native void __call536_154(moom.oP a0, moom.oN a1) throws Throwable;
private static native moom.oP __fieldRead536_155(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.oM __sourceUninitializedNEW536_156() throws Throwable;
private static native void __explicitNewInit536_158(moom.oM a0) throws Throwable;
private static native void __call536_159(moom.oP a0, moom.oM a1) throws Throwable;
private static native moom.BZ __fieldRead536_160() throws Throwable;
private static native moom.BW __invokedynamic536_161(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.BZ __call536_162(moom.BZ a0, moom.BW a1) throws Throwable;
private static native moom.Dt __sourceUninitializedNEW536_163() throws Throwable;
private static native void __explicitNewInit536_165(moom.Dt a0) throws Throwable;
private static native void __fieldWrite536_166(net.minecraft.client.Minecraft a0, moom.Dt a1) throws Throwable;
private static native void __call536_167(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native void __call536_168() throws Throwable;
private static native int __invokedynamic536_169(int a0, long a1) throws Throwable;
private static native void __call536_170(int a0) throws Throwable;
private static native void __call536_171(double a0) throws Throwable;
private static native void __call536_172() throws Throwable;
private static native int __invokedynamic536_173(int a0, long a1) throws Throwable;
private static native void __call536_174(int a0) throws Throwable;
private static native void __call536_175() throws Throwable;
private static native int __invokedynamic536_176(int a0, long a1) throws Throwable;
private static native void __call536_177(int a0, float a1) throws Throwable;
private static native int __invokedynamic536_178(int a0, long a1) throws Throwable;
private static native void __call536_179(int a0) throws Throwable;
private static native int __invokedynamic536_180(int a0, long a1) throws Throwable;
private static native void __call536_181(int a0) throws Throwable;
private static native void __call536_182() throws Throwable;
private static native int __invokedynamic536_183(int a0, long a1) throws Throwable;
private static native void __call536_184(int a0) throws Throwable;
private static native void __call536_185(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __sourceUninitializedNEW536_186() throws Throwable;
private static native void __explicitNewInit536_188(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite536_189(net.minecraft.client.Minecraft a0, net.minecraft.client.renderer.texture.TextureMap a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __fieldRead536_190(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_191(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead536_192(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call536_193(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_194(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead536_195() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __fieldRead536_196(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call536_197(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, net.minecraft.client.renderer.texture.TextureMap a2) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_198(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead536_199() throws Throwable;
private static native void __call536_200(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __fieldRead536_201(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_202(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead536_203(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call536_204(net.minecraft.client.renderer.texture.TextureMap a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.resources.model.ModelManager __sourceUninitializedNEW536_205() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __fieldRead536_207(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_208(net.minecraft.client.resources.model.ModelManager a0, net.minecraft.client.renderer.texture.TextureMap a1) throws Throwable;
private static native void __fieldWrite536_209(net.minecraft.client.Minecraft a0, net.minecraft.client.resources.model.ModelManager a1) throws Throwable;
private static native moom.oP __fieldRead536_210(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.model.ModelManager __fieldRead536_211(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_212(moom.oP a0, net.minecraft.client.resources.model.ModelManager a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __sourceUninitializedNEW536_213() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_215(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.model.ModelManager __fieldRead536_216(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_217(net.minecraft.client.renderer.entity.RenderItem a0, net.minecraft.client.renderer.texture.TextureManager a1, net.minecraft.client.resources.model.ModelManager a2) throws Throwable;
private static native void __fieldWrite536_218(net.minecraft.client.Minecraft a0, net.minecraft.client.renderer.entity.RenderItem a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __sourceUninitializedNEW536_219() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_221(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead536_222(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_223(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.client.renderer.texture.TextureManager a1, net.minecraft.client.renderer.entity.RenderItem a2) throws Throwable;
private static native void __fieldWrite536_224(net.minecraft.client.Minecraft a0, net.minecraft.client.renderer.entity.RenderManager a1) throws Throwable;
private static native moom.lm __sourceUninitializedNEW536_225() throws Throwable;
private static native void __explicitNewInit536_227(moom.lm a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native void __fieldWrite536_228(net.minecraft.client.Minecraft a0, moom.lm a1) throws Throwable;
private static native moom.oP __fieldRead536_229(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderItem __fieldRead536_230(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_231(moom.oP a0, net.minecraft.client.renderer.entity.RenderItem a1) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __sourceUninitializedNEW536_232() throws Throwable;
private static native moom.oP __fieldRead536_234(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_235(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.client.Minecraft a1, moom.oR a2) throws Throwable;
private static native void __fieldWrite536_236(net.minecraft.client.Minecraft a0, net.minecraft.client.renderer.EntityRenderer a1) throws Throwable;
private static native moom.oP __fieldRead536_237(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead536_238(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_239(moom.oP a0, net.minecraft.client.renderer.EntityRenderer a1) throws Throwable;
private static native net.minecraft.client.renderer.BlockRendererDispatcher __sourceUninitializedNEW536_240() throws Throwable;
private static native net.minecraft.client.resources.model.ModelManager __fieldRead536_242(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.BlockModelShapes __call536_243(net.minecraft.client.resources.model.ModelManager a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_244(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_245(net.minecraft.client.renderer.BlockRendererDispatcher a0, net.minecraft.client.renderer.BlockModelShapes a1, net.minecraft.client.settings.GameSettings a2) throws Throwable;
private static native void __fieldWrite536_246(net.minecraft.client.Minecraft a0, net.minecraft.client.renderer.BlockRendererDispatcher a1) throws Throwable;
private static native moom.oP __fieldRead536_247(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.BlockRendererDispatcher __fieldRead536_248(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_249(moom.oP a0, net.minecraft.client.renderer.BlockRendererDispatcher a1) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __sourceUninitializedNEW536_250() throws Throwable;
private static native void __explicitNewInit536_252(net.minecraft.client.renderer.RenderGlobal a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native void __fieldWrite536_253(net.minecraft.client.Minecraft a0, net.minecraft.client.renderer.RenderGlobal a1) throws Throwable;
private static native moom.oP __fieldRead536_254(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead536_255(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_256(moom.oP a0, net.minecraft.client.renderer.RenderGlobal a1) throws Throwable;
private static native moom.hK __sourceUninitializedNEW536_257() throws Throwable;
private static native void __explicitNewInit536_259(moom.hK a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native void __fieldWrite536_260(net.minecraft.client.Minecraft a0, moom.hK a1) throws Throwable;
private static native int __fieldRead536_261(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead536_262(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_263(int a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __sourceUninitializedNEW536_264() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead536_266(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_267(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit536_268(net.minecraft.client.particle.EffectRenderer a0, net.minecraft.world.World a1, net.minecraft.client.renderer.texture.TextureManager a2) throws Throwable;
private static native void __fieldWrite536_269(net.minecraft.client.Minecraft a0, net.minecraft.client.particle.EffectRenderer a1) throws Throwable;
private static native void __call536_270(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __sourceUninitializedNEW536_271() throws Throwable;
private static native void __explicitNewInit536_273(net.minecraft.client.gui.GuiIngame a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native void __fieldWrite536_274(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiIngame a1) throws Throwable;
private static native com.moon.ph __sourceUninitializedNEW536_275() throws Throwable;
private static native void __explicitNewInit536_277(com.moon.ph a0) throws Throwable;
private static native void __call536_278(net.minecraft.client.Minecraft a0, com.moon.ph a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead536_279(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead536_280(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_281(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite536_282(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native moom.fL __sourceUninitializedNEW536_283() throws Throwable;
private static native void __explicitNewInit536_285(moom.fL a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native void __fieldWrite536_286(net.minecraft.client.Minecraft a0, moom.fL a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_287(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead536_288(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory536_289(boolean value) throws Throwable;
private static native boolean __fieldRead536_290(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory536_291(boolean value) throws Throwable;
private static native void __call536_292(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead536_293(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead536_294(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory536_295(boolean value) throws Throwable;
private static native void __call536_296(int a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead536_297(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call536_298(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Throwable __call3053600_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053601_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053602_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053603_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053604_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053605_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053606_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053607_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053608_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053609_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053610_0(org.lwjgl.opengl.OpenGLException a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3053611_0(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite3053611_1(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3053611_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053611_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead3053611_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053611_5(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0a76d2ead7e662491689() throws E;
private static final class __SourceHandler_0a76d2ead7e662491689 {

public static boolean f1273() throws Throwable {
    net.minecraft.client.Minecraft forwardValue1273_11_0;
    int forwardValue1273_17_0;
    int forwardValue1273_19_0;
    net.minecraft.client.Minecraft spill1273_0;
    boolean spill1273_1;
    long life0_3;
    int[] life2_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    forward_join_11: {
    life0_3 = (__fieldRead1273_0() ^ 39327812731676L);
    life2_5 = __call1273_1();
    spill1273_0 = __fieldRead1273_2();
    if (!((life2_5 != null))) {
        forwardValue1273_11_0 = spill1273_0;
        break forward_join_11;
    }
    if (!((spill1273_0 != null))) {
        break forward_join_16;
    }
    forwardValue1273_11_0 = __fieldRead1273_3();
    }
    spill1273_1 = __fieldRead1273_5(__fieldRead1273_4(forwardValue1273_11_0));
    if (!((life2_5 != null))) {
        forwardValue1273_17_0 = __integerCategory1273_6(spill1273_1);
        break forward_join_17;
    }
    if (!((!spill1273_1))) {
        break forward_join_18;
    }
    }
    forwardValue1273_17_0 = 1;
    }
    forwardValue1273_19_0 = forwardValue1273_17_0;
    break forward_join_19;
    }
    forwardValue1273_19_0 = 0;
    }
    return __integerCategory1273_7(forwardValue1273_19_0);
}
public static void h1273_0(moom.Oo p0) throws Throwable {
    throw __call1127300_0(p0);
}
public static void h1273_1(moom.Oo p0) throws Throwable {
    throw __call1127301_0(p0);
}
private static native long __fieldRead1273_0() throws Throwable;
private static native int[] __call1273_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1273_2() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1273_3() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1273_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1273_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory1273_6(boolean value) throws Throwable;
private static native boolean __integerCategory1273_7(int value) throws Throwable;
private static native java.lang.Throwable __call1127300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_22c54203b6ee91f4f7fe(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_22c54203b6ee91f4f7fe {

public static void f537(net.minecraft.client.Minecraft receiver) throws Throwable {
    int[] spill537_0;
    moom.fN spill537_1;
    org.lwjgl.opengl.PixelFormat spill537_2;
    org.lwjgl.opengl.DisplayMode spill537_3;
    long life1_3;
    int[] life3_10;
    life1_3 = (__fieldRead537_0() ^ 94116152302782L);
    spill537_0 = __call537_1();
    moom.fN __stackOp537_3_0 = __sourceUninitializedNEW537_2();
    spill537_1 = __stackOp537_3_0;
    __explicitNewInit537_4(__stackOp537_3_0, receiver);
    __fieldWrite537_5(spill537_1);
    life3_10 = spill537_0;
    __call537_6("Moon Client (BLEEDING EDGE)");
    __call537_7(1);
    org.lwjgl.opengl.PixelFormat __stackOp537_9_0 = __sourceUninitializedNEW537_8();
    spill537_2 = __stackOp537_9_0;
    __explicitNewInit537_10(__stackOp537_9_0);
    __call537_13(__call537_12(spill537_2, __invokedynamic537_11(1559, (1153203926876937501L ^ life1_3))));
    org.lwjgl.opengl.DisplayMode __stackOp537_15_0 = __sourceUninitializedNEW537_14();
    spill537_3 = __stackOp537_15_0;
    __explicitNewInit537_18(__stackOp537_15_0, __fieldRead537_16(receiver), __fieldRead537_17(receiver));
    __call537_19(spill537_3);
    return;
}
public static void h537_0(org.lwjgl.LWJGLException p0, net.minecraft.client.Minecraft p1, long p2, int[] p3) throws Throwable {
    net.minecraft.client.Minecraft forestValue3053700_18_0;
    net.minecraft.client.Minecraft spill3053700_0;
    org.lwjgl.LWJGLException life5_2;
    forest_join_19: {
    forest_join_18: {
    life5_2 = p0;
    __call3053700_1(__fieldRead3053700_0(), "Couldn't set pixel format", life5_2);
    __call3053700_3(__invokedynamic3053700_2(29745, (2821122329202610396L ^ p2)));
    spill3053700_0 = p1;
    if (!((p3 != null))) {
        forestValue3053700_18_0 = spill3053700_0;
        break forest_join_18;
    }
    if (!(__fieldRead3053700_4(spill3053700_0))) {
        break forest_join_19;
    }
    forestValue3053700_18_0 = p1;
    }
    __call3053700_5(forestValue3053700_18_0);
    }
    __call3053700_6();
    return;
}
public static void h537_1(java.lang.InterruptedException p0, net.minecraft.client.Minecraft p1, int[] p2) throws Throwable {
    net.minecraft.client.Minecraft forestValue3053701_8_0;
    net.minecraft.client.Minecraft spill3053701_0;
    java.lang.InterruptedException life3_2;
    forest_join_9: {
    forest_join_8: {
    life3_2 = p0;
    spill3053701_0 = p1;
    if (!((p2 != null))) {
        forestValue3053701_8_0 = spill3053701_0;
        break forest_join_8;
    }
    if (!(__fieldRead3053701_0(spill3053701_0))) {
        break forest_join_9;
    }
    forestValue3053701_8_0 = p1;
    }
    __call3053701_1(forestValue3053701_8_0);
    }
    __call3053701_2();
    return;
}
public static void h537_2(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call3053702_0(p0);
}
public static void h537_3(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call3053703_0(p0);
}
private static native long __fieldRead537_0() throws Throwable;
private static native int[] __call537_1() throws Throwable;
private static native moom.fN __sourceUninitializedNEW537_2() throws Throwable;
private static native void __explicitNewInit537_4(moom.fN a0, net.minecraft.client.Minecraft a1) throws Throwable;
private static native void __fieldWrite537_5(moom.fN a0) throws Throwable;
private static native void __call537_6(java.lang.String a0) throws Throwable;
private static native void __call537_7(int a0) throws Throwable;
private static native org.lwjgl.opengl.PixelFormat __sourceUninitializedNEW537_8() throws Throwable;
private static native void __explicitNewInit537_10(org.lwjgl.opengl.PixelFormat a0) throws Throwable;
private static native int __invokedynamic537_11(int a0, long a1) throws Throwable;
private static native org.lwjgl.opengl.PixelFormat __call537_12(org.lwjgl.opengl.PixelFormat a0, int a1) throws Throwable;
private static native void __call537_13(org.lwjgl.opengl.PixelFormat a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __sourceUninitializedNEW537_14() throws Throwable;
private static native int __fieldRead537_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead537_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit537_18(org.lwjgl.opengl.DisplayMode a0, int a1, int a2) throws Throwable;
private static native void __call537_19(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3053700_0() throws Throwable;
private static native void __call3053700_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, org.lwjgl.LWJGLException a2) throws Throwable;
private static native long __invokedynamic3053700_2(int a0, long a1) throws Throwable;
private static native void __call3053700_3(long a0) throws Throwable;
private static native boolean __fieldRead3053700_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053700_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053700_6() throws Throwable;
private static native boolean __fieldRead3053701_0(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053701_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053701_2() throws Throwable;
private static native java.lang.Throwable __call3053702_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call3053703_0(org.lwjgl.LWJGLException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f3a9df36496c9e23bcf2() throws E;
private static final class __SourceHandler_f3a9df36496c9e23bcf2 {

public static boolean f1274() throws Throwable {
    net.minecraft.client.Minecraft forwardValue1274_11_0;
    int forwardValue1274_17_0;
    int forwardValue1274_19_0;
    net.minecraft.client.Minecraft spill1274_0;
    boolean spill1274_1;
    long life0_3;
    int[] life2_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_11: {
    life0_3 = (__fieldRead1274_0() ^ 73668257946176L);
    life2_5 = __call1274_1();
    spill1274_0 = __fieldRead1274_2();
    if (!((life2_5 != null))) {
        forwardValue1274_11_0 = spill1274_0;
        break forward_join_11;
    }
    if (!((spill1274_0 != null))) {
        break forward_join_18;
    }
    forwardValue1274_11_0 = __fieldRead1274_3();
    }
    spill1274_1 = __fieldRead1274_5(__fieldRead1274_4(forwardValue1274_11_0));
    if (!((life2_5 != null))) {
        forwardValue1274_17_0 = __integerCategory1274_6(spill1274_1);
        break forward_join_17;
    }
    if (!(spill1274_1)) {
        break forward_join_18;
    }
    forwardValue1274_17_0 = 1;
    }
    forwardValue1274_19_0 = forwardValue1274_17_0;
    break forward_join_19;
    }
    forwardValue1274_19_0 = 0;
    }
    return __integerCategory1274_7(forwardValue1274_19_0);
}
public static void h1274_0(moom.Oo p0) throws Throwable {
    throw __call1127400_0(p0);
}
public static void h1274_1(moom.Oo p0) throws Throwable {
    throw __call1127401_0(p0);
}
private static native long __fieldRead1274_0() throws Throwable;
private static native int[] __call1274_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1274_2() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1274_3() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1274_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1274_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory1274_6(boolean value) throws Throwable;
private static native boolean __integerCategory1274_7(int value) throws Throwable;
private static native java.lang.Throwable __call1127400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_eb987554839f5f641cd0(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_eb987554839f5f641cd0 {

public static void f720006(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forestValue720006_12_0;
    boolean spill720006_0;
    org.lwjgl.opengl.DisplayMode spill720006_1;
    long life1_3;
    int[] life3_5;
    org.lwjgl.opengl.DisplayMode life4_15;
    forest_join_37: {
    forest_join_29: {
    forest_join_12: {
    life1_3 = (__fieldRead720006_0() ^ 79759495560536L);
    life3_5 = __call720006_1();
    spill720006_0 = __fieldRead720006_2(receiver);
    if (!((life3_5 != null))) {
        forestValue720006_12_0 = __integerCategory720006_3(spill720006_0);
        break forest_join_12;
    }
    if (!(spill720006_0)) {
        break forest_join_29;
    }
    forestValue720006_12_0 = 1;
    }
    __call720006_4(forestValue720006_12_0);
    life4_15 = __call720006_5();
    __fieldWrite720006_8(receiver, __call720006_7(1, __call720006_6(life4_15)));
    __fieldWrite720006_11(receiver, __call720006_10(1, __call720006_9(life4_15)));
    if (!((life3_5 == null))) {
        break forest_join_37;
    }
    }
    org.lwjgl.opengl.DisplayMode __stackOp720006_13_0 = __sourceUninitializedNEW720006_12();
    spill720006_1 = __stackOp720006_13_0;
    __explicitNewInit720006_16(__stackOp720006_13_0, __fieldRead720006_14(receiver), __fieldRead720006_15(receiver));
    __call720006_17(spill720006_1);
    }
    return;
}
public static void h720006_0(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call75000600_0(p0);
}
public static void h720006_1(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call75000601_0(p0);
}
private static native long __fieldRead720006_0() throws Throwable;
private static native int[] __call720006_1() throws Throwable;
private static native boolean __fieldRead720006_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory720006_3(boolean value) throws Throwable;
private static native void __call720006_4(int a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call720006_5() throws Throwable;
private static native int __call720006_6(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call720006_7(int a0, int a1) throws Throwable;
private static native void __fieldWrite720006_8(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __call720006_9(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call720006_10(int a0, int a1) throws Throwable;
private static native void __fieldWrite720006_11(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __sourceUninitializedNEW720006_12() throws Throwable;
private static native int __fieldRead720006_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead720006_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __explicitNewInit720006_16(org.lwjgl.opengl.DisplayMode a0, int a1, int a2) throws Throwable;
private static native void __call720006_17(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native java.lang.Throwable __call75000600_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call75000601_0(org.lwjgl.LWJGLException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d88ebcd5a855220b0fe4() throws E;
private static final class __SourceHandler_d88ebcd5a855220b0fe4 {

public static boolean f1276() throws Throwable {
    net.minecraft.client.Minecraft forwardValue1276_11_0;
    int forwardValue1276_17_0;
    int forwardValue1276_19_0;
    net.minecraft.client.Minecraft spill1276_0;
    int spill1276_1;
    long life0_3;
    int[] life2_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_11: {
    life0_3 = (__fieldRead1276_0() ^ 110045965777226L);
    life2_5 = __call1276_1();
    spill1276_0 = __fieldRead1276_2();
    if (!((life2_5 != null))) {
        forwardValue1276_11_0 = spill1276_0;
        break forward_join_11;
    }
    if (!((spill1276_0 != null))) {
        break forward_join_18;
    }
    forwardValue1276_11_0 = __fieldRead1276_3();
    }
    spill1276_1 = __fieldRead1276_5(__fieldRead1276_4(forwardValue1276_11_0));
    if (!((life2_5 != null))) {
        forwardValue1276_17_0 = spill1276_1;
        break forward_join_17;
    }
    if (!((spill1276_1 != 0))) {
        break forward_join_18;
    }
    forwardValue1276_17_0 = 1;
    }
    forwardValue1276_19_0 = forwardValue1276_17_0;
    break forward_join_19;
    }
    forwardValue1276_19_0 = 0;
    }
    return __integerCategory1276_6(forwardValue1276_19_0);
}
public static void h1276_0(moom.Oo p0) throws Throwable {
    throw __call1127600_0(p0);
}
public static void h1276_1(moom.Oo p0) throws Throwable {
    throw __call1127601_0(p0);
}
private static native long __fieldRead1276_0() throws Throwable;
private static native int[] __call1276_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1276_2() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1276_3() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1276_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1276_5(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __integerCategory1276_6(int value) throws Throwable;
private static native java.lang.Throwable __call1127600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d00d2cdff838282a1b3a(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_d00d2cdff838282a1b3a {

public static boolean f1277(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forwardValue1277_15_0;
    long life1_3;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (__fieldRead1277_0() ^ 108350092689104L);
    if (!((!__call1277_2(__fieldRead1277_1(receiver))))) {
        break forward_join_12;
    }
    if (!(__fieldRead1277_4(__fieldRead1277_3(receiver)))) {
        break forward_join_14;
    }
    }
    forwardValue1277_15_0 = 1;
    break forward_join_15;
    }
    forwardValue1277_15_0 = 0;
    }
    return __integerCategory1277_5(forwardValue1277_15_0);
}
public static void h1277_0(moom.Oo p0) throws Throwable {
    throw __call1127700_0(p0);
}
public static void h1277_1(moom.Oo p0) throws Throwable {
    throw __call1127701_0(p0);
}
private static native long __fieldRead1277_0() throws Throwable;
private static native net.minecraft.client.resources.LanguageManager __fieldRead1277_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1277_2(net.minecraft.client.resources.LanguageManager a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1277_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1277_4(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __integerCategory1277_5(int value) throws Throwable;
private static native java.lang.Throwable __call1127700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_4c0836f8eaab7444723c(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_4c0836f8eaab7444723c {

public static boolean f478(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forwardValue478_16_0;
    int forwardValue478_18_0;
    int spill478_0;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead478_0() ^ 104530629183721L);
    life3_5 = __call478_1();
    spill478_0 = __numericCompare478_5(((float) __call478_2(receiver)), __call478_4(__fieldRead478_3()));
    if (!((life3_5 != null))) {
        forwardValue478_16_0 = spill478_0;
        break forward_join_16;
    }
    if (!((spill478_0 < 0))) {
        break forward_join_17;
    }
    forwardValue478_16_0 = 1;
    }
    forwardValue478_18_0 = forwardValue478_16_0;
    break forward_join_18;
    }
    forwardValue478_18_0 = 0;
    }
    return __integerCategory478_6(forwardValue478_18_0);
}
public static boolean h478_0(moom.Oo p0) throws Throwable {
    throw __call2047800_0(p0);
}
private static native long __fieldRead478_0() throws Throwable;
private static native int[] __call478_1() throws Throwable;
private static native int __call478_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead478_3() throws Throwable;
private static native float __call478_4(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native int __numericCompare478_5(float a0, float a1) throws Throwable;
private static native boolean __integerCategory478_6(int value) throws Throwable;
private static native java.lang.Throwable __call2047800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ada95d5299df62b126e2(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_ada95d5299df62b126e2 {

public static void f539(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.Minecraft lexicalValue539_44_0;
    net.minecraft.client.renderer.RenderGlobal lexicalValue539_58_0;
    int[] spill539_0;
    net.minecraft.client.Minecraft spill539_1;
    net.minecraft.client.renderer.RenderGlobal spill539_2;
    long life1_3;
    java.util.ArrayList life4_7;
    java.util.Iterator life5_13;
    int[] life3_14;
    net.minecraft.client.resources.ResourcePackRepository$Entry life6_21;
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_47: {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_31: {
    life1_3 = (__fieldRead539_0() ^ 3876879556195L);
    life4_7 = __call539_2(__fieldRead539_1(receiver));
    spill539_0 = __call539_3();
    life5_13 = __call539_6(__call539_5(__fieldRead539_4(receiver)));
    life3_14 = spill539_0;
    lexical_cycle_15: while (true) {
    if (!(__call539_7(life5_13))) {
        break lexical_join_31;
    }
    life6_21 = __cast539_9(__call539_8(life5_13));
    __call539_11(life4_7, __call539_10(life6_21));
    if (!((life3_14 != null))) {
        break lexical_join_47;
    }
    if (!((life3_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    spill539_1 = receiver;
    if (!((life3_14 != null))) {
        lexicalValue539_44_0 = spill539_1;
        break lexical_join_44;
    }
    if (!((__call539_13(__fieldRead539_12(spill539_1)) != null))) {
        break lexical_join_43;
    }
    __call539_16(life4_7, __call539_15(__fieldRead539_14(receiver)));
    }
    lexicalValue539_44_0 = receiver;
    }
    __call539_18(__fieldRead539_17(lexicalValue539_44_0), life4_7);
    }
    __call539_20(__fieldRead539_19(receiver), life4_7);
    spill539_2 = __fieldRead539_21(receiver);
    if (!((life3_14 != null))) {
        lexicalValue539_58_0 = spill539_2;
        break lexical_join_58;
    }
    if (!((spill539_2 != null))) {
        break lexical_join_59;
    }
    lexicalValue539_58_0 = __fieldRead539_22(receiver);
    }
    __call539_23(lexicalValue539_58_0);
    }
    return;
}
public static void h539_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3053900_0(p0);
}
public static void h539_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3053901_0(p0);
}
public static void h539_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3053902_0(p0);
}
public static void h539_3(java.lang.RuntimeException p0, net.minecraft.client.Minecraft p1, int[] p2, java.util.ArrayList p3, java.util.Iterator p4) throws Throwable {
    net.minecraft.client.renderer.RenderGlobal forwardValue3053903_43_0;
    net.minecraft.client.renderer.RenderGlobal spill3053903_0;
    java.lang.RuntimeException life4_2;
    forward_join_44: {
    forward_join_43: {
    life4_2 = p0;
    __call3053903_1(__fieldRead3053903_0(), "Caught error stitching, removing all assigned resourcepacks", life4_2);
    __call3053903_2(p3);
    __call3053903_4(p3, __fieldRead3053903_3(p1));
    __call3053903_7(__fieldRead3053903_5(p1), __call3053903_6());
    __call3053903_9(__fieldRead3053903_8(p1), p3);
    __call3053903_12(__fieldRead3053903_11(__fieldRead3053903_10(p1)));
    __call3053903_15(__fieldRead3053903_14(__fieldRead3053903_13(p1)));
    __call3053903_17(__fieldRead3053903_16(p1));
    __call3053903_19(__fieldRead3053903_18(p1), p3);
    spill3053903_0 = __fieldRead3053903_20(p1);
    if (!((p2 != null))) {
        forwardValue3053903_43_0 = spill3053903_0;
        break forward_join_43;
    }
    if (!((spill3053903_0 != null))) {
        break forward_join_44;
    }
    forwardValue3053903_43_0 = __fieldRead3053903_21(p1);
    }
    __call3053903_22(forwardValue3053903_43_0);
    }
    return;
}
public static void h539_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3053904_0(p0);
}
public static void h539_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3053905_0(p0);
}
private static native long __fieldRead539_0() throws Throwable;
private static native java.util.List __fieldRead539_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.ArrayList __call539_2(java.util.List a0) throws Throwable;
private static native int[] __call539_3() throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead539_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __call539_5(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native java.util.Iterator __call539_6(java.util.List a0) throws Throwable;
private static native boolean __call539_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call539_8(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository$Entry __cast539_9(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call539_10(net.minecraft.client.resources.ResourcePackRepository$Entry a0) throws Throwable;
private static native boolean __call539_11(java.util.ArrayList a0, net.minecraft.client.resources.IResourcePack a1) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead539_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call539_13(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead539_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack __call539_15(net.minecraft.client.resources.ResourcePackRepository a0) throws Throwable;
private static native boolean __call539_16(java.util.ArrayList a0, net.minecraft.client.resources.IResourcePack a1) throws Throwable;
private static native moom.oP __fieldRead539_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call539_18(moom.oP a0, java.util.ArrayList a1) throws Throwable;
private static native net.minecraft.client.resources.LanguageManager __fieldRead539_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call539_20(net.minecraft.client.resources.LanguageManager a0, java.util.ArrayList a1) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead539_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead539_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call539_23(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Throwable __call3053900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3053901_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3053902_0(java.lang.RuntimeException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3053903_0() throws Throwable;
private static native void __call3053903_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.RuntimeException a2) throws Throwable;
private static native void __call3053903_2(java.util.ArrayList a0) throws Throwable;
private static native java.util.List __fieldRead3053903_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call3053903_4(java.util.ArrayList a0, java.util.List a1) throws Throwable;
private static native net.minecraft.client.resources.ResourcePackRepository __fieldRead3053903_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __call3053903_6() throws Throwable;
private static native void __call3053903_7(net.minecraft.client.resources.ResourcePackRepository a0, java.util.List a1) throws Throwable;
private static native moom.oP __fieldRead3053903_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053903_9(moom.oP a0, java.util.ArrayList a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3053903_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead3053903_11(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call3053903_12(java.util.List a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3053903_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead3053903_14(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call3053903_15(java.util.List a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead3053903_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053903_17(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.resources.LanguageManager __fieldRead3053903_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053903_19(net.minecraft.client.resources.LanguageManager a0, java.util.ArrayList a1) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead3053903_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead3053903_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3053903_22(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native java.lang.Throwable __call3053904_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Throwable __call3053905_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e0e4954f1d76eddf7a6c(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_e0e4954f1d76eddf7a6c {

public static void f100141(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forestValue100141_63_0;
    int forestValue100141_63_1;
    int forestValue100141_72_0;
    int forestValue100141_72_1;
    int forestValue100141_74_0;
    int forestValue100141_109_0;
    int forestValue100141_109_1;
    int forestValue100141_118_0;
    int forestValue100141_118_1;
    int forestValue100141_120_0;
    int forestValue100141_120_1;
    int forestValue100141_129_0;
    int forestValue100141_129_1;
    int forestValue100141_138_0;
    int forestValue100141_138_1;
    org.lwjgl.opengl.DisplayMode forestValue100141_164_0;
    int[] spill100141_0;
    int spill100141_1;
    int spill100141_2;
    int spill100141_3;
    int spill100141_4;
    int spill100141_5;
    int spill100141_6;
    int spill100141_7;
    org.lwjgl.opengl.DisplayMode spill100141_8;
    long life1_3;
    java.util.HashSet life4_5;
    org.lwjgl.opengl.DisplayMode life5_12;
    int[] life3_13;
    java.util.Iterator life6_30;
    org.lwjgl.opengl.DisplayMode life7_39;
    int life8_41;
    java.util.Iterator life9_47;
    org.lwjgl.opengl.DisplayMode life10_56;
    java.util.Iterator life9_111;
    forest_join_173: {
    forest_join_164: {
    forest_join_163: {
    life1_3 = (__fieldRead100141_0() ^ 136249735151022L);
    life4_5 = __call100141_1();
    __call100141_3(life4_5, __call100141_2());
    spill100141_0 = __call100141_4();
    life5_12 = __call100141_5();
    life3_13 = spill100141_0;
    if (!((life3_13 != null))) {
        break forest_join_173;
    }
    if (!((!__call100141_6(life4_5, life5_12)))) {
        break forest_join_163;
    }
    if (!((__call100141_7() == __fieldRead100141_8()))) {
        break forest_join_163;
    }
    life6_30 = __call100141_10(__fieldRead100141_9());
    forest_cycle_26: while (true) {
    forest_join_161: {
    forest_join_157: {
    forest_join_120: {
    forest_join_79: {
    if (!(__call100141_11(life6_30))) {
        break forest_join_163;
    }
    life7_39 = __cast100141_13(__call100141_12(life6_30));
    life8_41 = 1;
    if (!((life3_13 != null))) {
        break forest_join_173;
    }
    life9_47 = __call100141_14(life4_5);
    forest_cycle_40: while (true) {
    forest_join_77: {
    forest_join_74: {
    forest_join_72: {
    forest_join_63: {
    if (!(__call100141_15(life9_47))) {
        break forest_join_79;
    }
    life10_56 = __cast100141_17(__call100141_16(life9_47));
    spill100141_1 = __call100141_18(life10_56);
    spill100141_2 = __invokedynamic100141_19(10982, (7954089802849767670L ^ life1_3));
    if (!((life3_13 != null))) {
        forestValue100141_120_0 = spill100141_1;
        forestValue100141_120_1 = spill100141_2;
        break forest_join_120;
    }
    if (!((life3_13 != null))) {
        forestValue100141_63_0 = spill100141_1;
        forestValue100141_63_1 = spill100141_2;
        break forest_join_63;
    }
    if (!((spill100141_1 == spill100141_2))) {
        break forest_join_77;
    }
    forestValue100141_63_0 = __call100141_20(life10_56);
    forestValue100141_63_1 = __call100141_21(life7_39);
    }
    if (!((life3_13 != null))) {
        forestValue100141_72_0 = forestValue100141_63_0;
        forestValue100141_72_1 = forestValue100141_63_1;
        break forest_join_72;
    }
    if (!((forestValue100141_63_0 == forestValue100141_63_1))) {
        break forest_join_77;
    }
    spill100141_3 = __call100141_22(life10_56);
    if (!((life3_13 != null))) {
        forestValue100141_74_0 = spill100141_3;
        break forest_join_74;
    }
    forestValue100141_72_0 = spill100141_3;
    forestValue100141_72_1 = __call100141_23(life7_39);
    }
    if (!((forestValue100141_72_0 == forestValue100141_72_1))) {
        break forest_join_77;
    }
    forestValue100141_74_0 = 0;
    }
    life8_41 = forestValue100141_74_0;
    if (!((life3_13 == null))) {
        break forest_join_79;
    }
    }
    if (!((life3_13 == null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    }
    if (!((life8_41 == 0))) {
        break forest_join_161;
    }
    life9_111 = __call100141_24(life4_5);
    forest_cycle_84: while (true) {
    forest_join_118: {
    forest_join_109: {
    forest_join_89: {
    if (!((!__call100141_25(life9_111)))) {
        break forest_join_89;
    }
    if (!((life3_13 == null))) {
        continue forest_cycle_26;
    }
    }
    life10_56 = __cast100141_27(__call100141_26(life9_111));
    spill100141_4 = __call100141_28(life10_56);
    spill100141_5 = __invokedynamic100141_29(10982, (7954089802849767670L ^ life1_3));
    if (!((life3_13 != null))) {
        forestValue100141_109_0 = spill100141_4;
        forestValue100141_109_1 = spill100141_5;
        break forest_join_109;
    }
    if (!((spill100141_4 == spill100141_5))) {
        continue forest_cycle_84;
    }
    forestValue100141_109_0 = __call100141_30(life10_56);
    forestValue100141_109_1 = (__call100141_31(life7_39) / 2);
    }
    if (!((life3_13 != null))) {
        forestValue100141_118_0 = forestValue100141_109_0;
        forestValue100141_118_1 = forestValue100141_109_1;
        break forest_join_118;
    }
    if (!((forestValue100141_109_0 == forestValue100141_109_1))) {
        continue forest_cycle_84;
    }
    forestValue100141_118_0 = __call100141_32(life10_56);
    forestValue100141_118_1 = (__call100141_33(life7_39) / 2);
    }
    if (!((forestValue100141_118_0 == forestValue100141_118_1))) {
        continue forest_cycle_84;
    }
    break forest_cycle_84;
    }
    break forest_join_157;
    }
    forest_cycle_120: while (true) {
    forest_join_145: {
    forest_join_140: {
    forest_join_138: {
    forest_join_129: {
    if (!((life3_13 != null))) {
        forestValue100141_129_0 = forestValue100141_120_0;
        forestValue100141_129_1 = forestValue100141_120_1;
        break forest_join_129;
    }
    if (!((forestValue100141_120_0 == forestValue100141_120_1))) {
        break forest_join_140;
    }
    forestValue100141_129_0 = __call100141_34(life10_56);
    forestValue100141_129_1 = (__call100141_35(life7_39) / 2);
    }
    if (!((life3_13 != null))) {
        forestValue100141_138_0 = forestValue100141_129_0;
        forestValue100141_138_1 = forestValue100141_129_1;
        break forest_join_138;
    }
    if (!((forestValue100141_129_0 == forestValue100141_129_1))) {
        break forest_join_140;
    }
    forestValue100141_138_0 = __call100141_36(life10_56);
    forestValue100141_138_1 = (__call100141_37(life7_39) / 2);
    }
    if (!((forestValue100141_138_0 == forestValue100141_138_1))) {
        break forest_join_140;
    }
    break forest_join_157;
    }
    if (!((!__call100141_38(life9_47)))) {
        break forest_join_145;
    }
    if (!((life3_13 == null))) {
        continue forest_cycle_26;
    }
    }
    life10_56 = __cast100141_40(__call100141_39(life9_47));
    spill100141_6 = __call100141_41(life10_56);
    spill100141_7 = __invokedynamic100141_42(10982, (7954089802849767670L ^ life1_3));
    forestValue100141_120_0 = spill100141_6;
    forestValue100141_120_1 = spill100141_7;
    continue forest_cycle_120;
    }
    }
    spill100141_8 = life10_56;
    if (!((life3_13 != null))) {
        forestValue100141_164_0 = spill100141_8;
        break forest_join_164;
    }
    life5_12 = spill100141_8;
    }
    if (!((life3_13 == null))) {
        continue forest_cycle_26;
    }
    break forest_cycle_26;
    }
    }
    forestValue100141_164_0 = life5_12;
    }
    __call100141_43(forestValue100141_164_0);
    __fieldWrite100141_45(receiver, __call100141_44(life5_12));
    __fieldWrite100141_47(receiver, __call100141_46(life5_12));
    }
    return;
}
public static void h100141_0(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014100_0(p0);
}
public static void h100141_1(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014101_0(p0);
}
public static void h100141_2(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014102_0(p0);
}
public static void h100141_3(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014103_0(p0);
}
public static void h100141_4(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014104_0(p0);
}
public static void h100141_5(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014105_0(p0);
}
public static void h100141_6(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014106_0(p0);
}
public static void h100141_7(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014107_0(p0);
}
public static void h100141_8(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014108_0(p0);
}
public static void h100141_9(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014109_0(p0);
}
public static void h100141_10(org.lwjgl.LWJGLException p0) throws Throwable {
    throw __call13014110_0(p0);
}
private static native long __fieldRead100141_0() throws Throwable;
private static native java.util.HashSet __call100141_1() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode[] __call100141_2() throws Throwable;
private static native boolean __call100141_3(java.util.HashSet a0, org.lwjgl.opengl.DisplayMode[] a1) throws Throwable;
private static native int[] __call100141_4() throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call100141_5() throws Throwable;
private static native boolean __call100141_6(java.util.HashSet a0, org.lwjgl.opengl.DisplayMode a1) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __call100141_7() throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead100141_8() throws Throwable;
private static native java.util.List __fieldRead100141_9() throws Throwable;
private static native java.util.Iterator __call100141_10(java.util.List a0) throws Throwable;
private static native boolean __call100141_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100141_12(java.util.Iterator a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __cast100141_13(java.lang.Object a0) throws Throwable;
private static native java.util.Iterator __call100141_14(java.util.HashSet a0) throws Throwable;
private static native boolean __call100141_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100141_16(java.util.Iterator a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __cast100141_17(java.lang.Object a0) throws Throwable;
private static native int __call100141_18(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __invokedynamic100141_19(int a0, long a1) throws Throwable;
private static native int __call100141_20(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_21(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_22(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_23(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native java.util.Iterator __call100141_24(java.util.HashSet a0) throws Throwable;
private static native boolean __call100141_25(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100141_26(java.util.Iterator a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __cast100141_27(java.lang.Object a0) throws Throwable;
private static native int __call100141_28(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __invokedynamic100141_29(int a0, long a1) throws Throwable;
private static native int __call100141_30(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_31(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_32(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_33(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_34(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_35(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_36(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_37(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native boolean __call100141_38(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100141_39(java.util.Iterator a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __cast100141_40(java.lang.Object a0) throws Throwable;
private static native int __call100141_41(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __invokedynamic100141_42(int a0, long a1) throws Throwable;
private static native void __call100141_43(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __call100141_44(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native void __fieldWrite100141_45(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __call100141_46(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native void __fieldWrite100141_47(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native java.lang.Throwable __call13014100_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014101_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014102_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014103_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014104_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014105_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014106_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014107_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014108_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014109_0(org.lwjgl.LWJGLException a0) throws Throwable;
private static native java.lang.Throwable __call13014110_0(org.lwjgl.LWJGLException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5814106dd6803e495bff(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_5814106dd6803e495bff {

public static void f540(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forestValue540_20_0;
    boolean spill540_0;
    int[] life1_1;
    forest_join_21: {
    forest_join_20: {
    life1_1 = __call540_0();
    __call540_2(__fieldRead540_1(), "Stopping!");
    __call540_3(receiver, null);
    __call540_5(__fieldRead540_4(receiver));
    __call540_7(__call540_6());
    __call540_8();
    spill540_0 = __fieldRead540_9(receiver);
    if (!((life1_1 != null))) {
        forestValue540_20_0 = __integerCategory540_10(spill540_0);
        break forest_join_20;
    }
    if (!((!spill540_0))) {
        break forest_join_21;
    }
    forestValue540_20_0 = 0;
    }
    __call540_11(forestValue540_20_0);
    }
    return;
}
public static void h540_0(java.lang.Throwable p0, net.minecraft.client.Minecraft p1, int[] p2) throws Throwable {
    int forestValue3054000_14_0;
    boolean spill3054000_0;
    java.lang.Throwable life3_2;
    forest_join_15: {
    forest_join_14: {
    life3_2 = p0;
    __call3054000_1(__fieldRead3054000_0(p1));
    __call3054000_3(__call3054000_2());
    __call3054000_4();
    spill3054000_0 = __fieldRead3054000_5(p1);
    if (!((p2 != null))) {
        forestValue3054000_14_0 = __integerCategory3054000_6(spill3054000_0);
        break forest_join_14;
    }
    if (!((!spill3054000_0))) {
        break forest_join_15;
    }
    forestValue3054000_14_0 = 0;
    }
    __call3054000_7(forestValue3054000_14_0);
    }
    return;
}
public static void h540_1(java.lang.Throwable p0, net.minecraft.client.Minecraft p1, int[] p2) throws Throwable {
    int forestValue3054001_9_0;
    boolean spill3054001_0;
    java.lang.Throwable life3_2;
    forest_join_10: {
    forest_join_9: {
    life3_2 = p0;
    __call3054001_0();
    spill3054001_0 = __fieldRead3054001_1(p1);
    if (!((p2 != null))) {
        forestValue3054001_9_0 = __integerCategory3054001_2(spill3054001_0);
        break forest_join_9;
    }
    if (!((!spill3054001_0))) {
        break forest_join_10;
    }
    forestValue3054001_9_0 = 0;
    }
    __call3054001_3(forestValue3054001_9_0);
    }
    throw life3_2;
}
public static void h540_2(java.lang.Throwable p0) throws Throwable {
    throw __call3054002_0(p0);
}
private static native int[] __call540_0() throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead540_1() throws Throwable;
private static native void __call540_2(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call540_3(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead540_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call540_5(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call540_6() throws Throwable;
private static native void __call540_7(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call540_8() throws Throwable;
private static native boolean __fieldRead540_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory540_10(boolean value) throws Throwable;
private static native void __call540_11(int a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead3054000_0(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3054000_1(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call3054000_2() throws Throwable;
private static native void __call3054000_3(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call3054000_4() throws Throwable;
private static native boolean __fieldRead3054000_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory3054000_6(boolean value) throws Throwable;
private static native void __call3054000_7(int a0) throws Throwable;
private static native void __call3054001_0() throws Throwable;
private static native boolean __fieldRead3054001_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory3054001_2(boolean value) throws Throwable;
private static native void __call3054001_3(int a0) throws Throwable;
private static native java.lang.Throwable __call3054002_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1965165a7cc15eb90f3e(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_1965165a7cc15eb90f3e {

public static boolean f1278(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.Minecraft forwardValue1278_12_0;
    int forwardValue1278_17_0;
    net.minecraft.client.Minecraft spill1278_0;
    long life1_3;
    int[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (__fieldRead1278_0() ^ 40084443582818L);
    life3_5 = __call1278_1();
    spill1278_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1278_12_0 = spill1278_0;
        break forward_join_12;
    }
    if (!(__fieldRead1278_2(spill1278_0))) {
        break forward_join_16;
    }
    forwardValue1278_12_0 = receiver;
    }
    if (!((__fieldRead1278_3(forwardValue1278_12_0) != null))) {
        break forward_join_16;
    }
    forwardValue1278_17_0 = 1;
    break forward_join_17;
    }
    forwardValue1278_17_0 = 0;
    }
    return __integerCategory1278_4(forwardValue1278_17_0);
}
public static void h1278_0(moom.Oo p0) throws Throwable {
    throw __call1127800_0(p0);
}
public static void h1278_1(moom.Oo p0) throws Throwable {
    throw __call1127801_0(p0);
}
public static void h1278_2(moom.Oo p0) throws Throwable {
    throw __call1127802_0(p0);
}
private static native long __fieldRead1278_0() throws Throwable;
private static native int[] __call1278_1() throws Throwable;
private static native boolean __fieldRead1278_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1278_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __integerCategory1278_4(int value) throws Throwable;
private static native java.lang.Throwable __call1127800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1127802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_77e8b67ebfe68fc30090(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_77e8b67ebfe68fc30090 {

public static void f541(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forestValue541_33_0;
    net.minecraft.client.Minecraft forestValue541_53_0;
    int forestValue541_112_0;
    int forestValue541_116_0;
    int forestValue541_118_0;
    int forestValue541_132_0;
    net.minecraft.client.Minecraft forestValue541_208_0;
    int forestValue541_209_0;
    int forestValue541_234_0;
    moom.A9 forestValue541_258_0;
    net.minecraft.client.Minecraft forestValue541_270_0;
    net.minecraft.client.Minecraft forestValue541_342_0;
    net.minecraft.client.Minecraft forestValue541_342_1;
    net.minecraft.client.Minecraft forestValue541_348_0;
    net.minecraft.client.gui.GuiScreen forestValue541_348_1;
    net.minecraft.client.Minecraft forestValue541_355_0;
    int forestValue541_355_1;
    net.minecraft.client.Minecraft forestValue541_359_0;
    int forestValue541_359_1;
    net.minecraft.client.Minecraft forestValue541_360_0;
    net.minecraft.client.Minecraft forestValue541_361_0;
    int forestValue541_361_1;
    net.minecraft.client.Minecraft forestValue541_415_0;
    java.lang.String forestValue541_415_1;
    java.lang.Object[] forestValue541_415_2;
    java.lang.Object[] forestValue541_415_3;
    int forestValue541_415_4;
    net.minecraft.client.Minecraft forestValue541_416_0;
    java.lang.String forestValue541_416_1;
    java.lang.Object[] forestValue541_416_2;
    java.lang.Object[] forestValue541_416_3;
    int forestValue541_416_4;
    java.lang.String forestValue541_416_5;
    net.minecraft.client.Minecraft forestValue541_431_0;
    java.lang.String forestValue541_431_1;
    java.lang.Object[] forestValue541_431_2;
    java.lang.Object[] forestValue541_431_3;
    int forestValue541_431_4;
    net.minecraft.client.Minecraft forestValue541_434_0;
    java.lang.String forestValue541_434_1;
    java.lang.Object[] forestValue541_434_2;
    java.lang.Object[] forestValue541_434_3;
    int forestValue541_434_4;
    int forestValue541_434_5;
    net.minecraft.client.Minecraft forestValue541_435_0;
    java.lang.String forestValue541_435_1;
    java.lang.Object[] forestValue541_435_2;
    java.lang.Object[] forestValue541_435_3;
    int forestValue541_435_4;
    java.lang.Object forestValue541_435_5;
    net.minecraft.client.Minecraft forestValue541_444_0;
    java.lang.String forestValue541_444_1;
    java.lang.Object[] forestValue541_444_2;
    java.lang.Object[] forestValue541_444_3;
    int forestValue541_444_4;
    net.minecraft.client.Minecraft forestValue541_445_0;
    java.lang.String forestValue541_445_1;
    java.lang.Object[] forestValue541_445_2;
    java.lang.Object[] forestValue541_445_3;
    int forestValue541_445_4;
    java.lang.String forestValue541_445_5;
    net.minecraft.client.Minecraft forestValue541_454_0;
    java.lang.String forestValue541_454_1;
    java.lang.Object[] forestValue541_454_2;
    java.lang.Object[] forestValue541_454_3;
    int forestValue541_454_4;
    net.minecraft.client.Minecraft forestValue541_455_0;
    java.lang.String forestValue541_455_1;
    java.lang.Object[] forestValue541_455_2;
    java.lang.Object[] forestValue541_455_3;
    int forestValue541_455_4;
    java.lang.String forestValue541_455_5;
    net.minecraft.client.Minecraft forestValue541_470_0;
    java.lang.String forestValue541_470_1;
    java.lang.Object[] forestValue541_470_2;
    java.lang.Object[] forestValue541_470_3;
    int forestValue541_470_4;
    net.minecraft.client.Minecraft forestValue541_473_0;
    java.lang.String forestValue541_473_1;
    java.lang.Object[] forestValue541_473_2;
    java.lang.Object[] forestValue541_473_3;
    int forestValue541_473_4;
    int forestValue541_473_5;
    net.minecraft.client.Minecraft forestValue541_477_0;
    java.lang.String forestValue541_477_1;
    java.lang.Object[] forestValue541_477_2;
    java.lang.Object[] forestValue541_477_3;
    int forestValue541_477_4;
    net.minecraft.client.Minecraft forestValue541_478_0;
    java.lang.String forestValue541_478_1;
    java.lang.Object[] forestValue541_478_2;
    java.lang.Object[] forestValue541_478_3;
    int forestValue541_478_4;
    java.lang.String forestValue541_478_5;
    net.minecraft.client.Minecraft forestValue541_489_0;
    java.lang.String forestValue541_489_1;
    java.lang.Object[] forestValue541_489_2;
    java.lang.Object[] forestValue541_489_3;
    int forestValue541_489_4;
    net.minecraft.client.Minecraft forestValue541_490_0;
    java.lang.String forestValue541_490_1;
    java.lang.Object[] forestValue541_490_2;
    java.lang.Object[] forestValue541_490_3;
    int forestValue541_490_4;
    java.lang.String forestValue541_490_5;
    net.minecraft.profiler.PlayerUsageSnooper forestValue541_519_0;
    net.minecraft.client.Minecraft forestValue541_536_0;
    net.minecraft.client.Minecraft forestValue541_567_0;
    com.moon.events.EventBus spill541_0;
    com.moon.eQ spill541_1;
    int[] spill541_2;
    boolean spill541_3;
    boolean spill541_4;
    net.minecraft.client.Minecraft spill541_5;
    net.minecraft.client.Minecraft spill541_6;
    int spill541_7;
    int spill541_8;
    boolean spill541_9;
    int spill541_10;
    long spill541_11;
    net.minecraft.client.Minecraft spill541_12;
    boolean spill541_13;
    net.minecraft.client.Minecraft spill541_14;
    net.minecraft.client.Minecraft spill541_15;
    net.minecraft.client.Minecraft spill541_16;
    moom.A9 spill541_17;
    com.moon.d5 spill541_18;
    net.minecraft.client.Minecraft spill541_19;
    net.minecraft.client.Minecraft spill541_20;
    net.minecraft.client.gui.GuiScreen spill541_21;
    boolean spill541_22;
    net.minecraft.client.Minecraft spill541_23;
    java.lang.String spill541_24;
    java.lang.Object[] spill541_25;
    java.lang.Object[] spill541_26;
    java.lang.Object[] spill541_27;
    java.lang.Object[] spill541_28;
    int spill541_29;
    java.lang.Object[] spill541_30;
    java.lang.Object[] spill541_31;
    int spill541_32;
    int spill541_33;
    java.lang.Object[] spill541_34;
    java.lang.Object[] spill541_35;
    int spill541_36;
    java.lang.Object[] spill541_37;
    java.lang.Object[] spill541_38;
    int spill541_39;
    java.lang.Object[] spill541_40;
    java.lang.Object[] spill541_41;
    int spill541_42;
    int spill541_43;
    java.lang.Object[] spill541_44;
    java.lang.Object[] spill541_45;
    int spill541_46;
    net.minecraft.profiler.PlayerUsageSnooper spill541_47;
    net.minecraft.client.Minecraft spill541_48;
    net.minecraft.client.Minecraft spill541_49;
    com.moon.events.EventBus spill541_50;
    com.moon.eQ spill541_51;
    long life1_3;
    long life4_13;
    int[] life3_18;
    float life6_57;
    java.util.Queue life6_80;
    long life6_110;
    int life8_118;
    int life9_154;
    int life10_177;
    long life10_201;
    com.moon.d5 life12_360;
    long life13_470;
    forest_join_576: {
    forest_join_567: {
    forest_join_566: {
    forest_join_551: {
    forest_join_536: {
    forest_join_522: {
    forest_join_361: {
    forest_join_360: {
    forest_join_359: {
    forest_join_355: {
    forest_join_348: {
    forest_join_342: {
    forest_join_335: {
    forest_join_288: {
    forest_join_272: {
    forest_join_270: {
    forest_join_265: {
    forest_join_258: {
    forest_join_256: {
    forest_join_234: {
    forest_join_226: {
    forest_join_209: {
    forest_join_208: {
    forest_join_204: {
    forest_join_147: {
    forest_join_143: {
    forest_join_132: {
    forest_join_131: {
    forest_join_118: {
    forest_join_117: {
    forest_join_116: {
    forest_join_112: {
    forest_join_81: {
    forest_join_79: {
    forest_join_55: {
    forest_join_53: {
    forest_join_52: {
    forest_join_33: {
    forest_join_29: {
    life1_3 = (__fieldRead541_0() ^ 80966106553988L);
    spill541_0 = __call541_2(__call541_1());
    com.moon.eQ __stackOp541_4_0 = __sourceUninitializedNEW541_3();
    spill541_1 = __stackOp541_4_0;
    __explicitNewInit541_6(__stackOp541_4_0, __fieldRead541_5());
    __call541_7(spill541_0, spill541_1);
    spill541_2 = __call541_8();
    life4_13 = __call541_9();
    __call541_11(__fieldRead541_10(receiver), "root");
    life3_18 = spill541_2;
    spill541_3 = __call541_12();
    if (!((life3_18 != null))) {
        forestValue541_33_0 = __integerCategory541_13(spill541_3);
        break forest_join_33;
    }
    if (!(spill541_3)) {
        break forest_join_29;
    }
    spill541_4 = __call541_14();
    if (!((life3_18 != null))) {
        forestValue541_33_0 = __integerCategory541_15(spill541_4);
        break forest_join_33;
    }
    if (!(spill541_4)) {
        break forest_join_29;
    }
    __call541_16(receiver);
    }
    spill541_5 = receiver;
    if (!((life3_18 != null))) {
        forestValue541_53_0 = spill541_5;
        break forest_join_53;
    }
    forestValue541_33_0 = __integerCategory541_18(__fieldRead541_17(spill541_5));
    }
    if (!((forestValue541_33_0 != 0))) {
        break forest_join_52;
    }
    spill541_6 = receiver;
    if (!((life3_18 != null))) {
        forestValue541_53_0 = spill541_6;
        break forest_join_53;
    }
    if (!((__fieldRead541_19(spill541_6) != null))) {
        break forest_join_52;
    }
    life6_57 = __fieldRead541_21(__fieldRead541_20(receiver));
    __call541_23(__fieldRead541_22(receiver));
    __fieldWrite541_25(__fieldRead541_24(receiver), life6_57);
    if (!((life3_18 == null))) {
        break forest_join_55;
    }
    }
    forestValue541_53_0 = receiver;
    }
    __call541_27(__fieldRead541_26(forestValue541_53_0));
    }
    __call541_29(__fieldRead541_28(receiver), "scheduledExecutables");
    __monitorEnter541_31((life6_80 = __fieldRead541_30(receiver)));
    forest_cycle_64: while (true) {
    if (!((!__call541_33(__fieldRead541_32(receiver))))) {
        break forest_join_79;
    }
    __call541_38(__cast541_36(__call541_35(__fieldRead541_34(receiver))), __fieldRead541_37());
    if (!((life3_18 != null))) {
        break forest_join_81;
    }
    if (!((life3_18 == null))) {
        continue forest_cycle_64;
    }
    break forest_cycle_64;
    }
    }
    __monitorExit541_39(life6_80);
    }
    __call541_41(__fieldRead541_40(receiver));
    life6_110 = __call541_42();
    __call541_44(__fieldRead541_43(receiver), "tick");
    life8_118 = __fieldRead541_46(__fieldRead541_45(receiver));
    if (!((__call541_48(__call541_47()) == null))) {
        break forest_join_117;
    }
    spill541_7 = __numericCompare541_52((__call541_49() - __call541_50()), __invokedynamic541_51(18943, (1012700447662059311L ^ life1_3)));
    if (!((life3_18 != null))) {
        forestValue541_112_0 = spill541_7;
        break forest_join_112;
    }
    if (!((spill541_7 > 0))) {
        break forest_join_117;
    }
    forestValue541_112_0 = __instanceOf541_54(__fieldRead541_53(receiver));
    }
    if (!((life3_18 != null))) {
        forestValue541_116_0 = forestValue541_112_0;
        break forest_join_116;
    }
    if (!((forestValue541_112_0 == 0))) {
        break forest_join_117;
    }
    forestValue541_116_0 = 1;
    }
    forestValue541_118_0 = forestValue541_116_0;
    break forest_join_118;
    }
    forestValue541_118_0 = 0;
    }
    life9_154 = forestValue541_118_0;
    spill541_8 = life9_154;
    if (!((life3_18 != null))) {
        forestValue541_132_0 = spill541_8;
        break forest_join_132;
    }
    if (!((spill541_8 != 0))) {
        break forest_join_131;
    }
    spill541_9 = __call541_57(__call541_56(__call541_55()));
    if (!((life3_18 != null))) {
        forestValue541_132_0 = __integerCategory541_58(spill541_9);
        break forest_join_132;
    }
    if (!((!spill541_9))) {
        break forest_join_131;
    }
    life8_118 = 0;
    }
    forestValue541_132_0 = 0;
    }
    life10_177 = forestValue541_132_0;
    forest_cycle_133: while (true) {
    if (!((life10_177 < life8_118))) {
        break forest_join_143;
    }
    __call541_59(receiver);
    life10_177 += 1;
    if (!((life3_18 != null))) {
        break forest_join_147;
    }
    if (!((life3_18 == null))) {
        continue forest_cycle_133;
    }
    break forest_cycle_133;
    }
    }
    __call541_61(__fieldRead541_60(receiver), "preRenderErrors");
    }
    life10_201 = (__call541_62() - life6_110);
    __call541_63(receiver, "Pre render");
    spill541_10 = 11184;
    __call541_65(__fieldRead541_64(receiver), "sound");
    spill541_11 = (5349928564023440021L ^ life1_3);
    __call541_70(__fieldRead541_66(receiver), __fieldRead541_67(receiver), __fieldRead541_69(__fieldRead541_68(receiver)));
    __call541_72(__fieldRead541_71(receiver));
    __call541_74(__fieldRead541_73(receiver), "render");
    __call541_75();
    __call541_77(__invokedynamic541_76(spill541_10, spill541_11));
    __call541_79(__fieldRead541_78(receiver), 1);
    __call541_81(__fieldRead541_80(receiver), "display");
    __call541_82();
    spill541_12 = receiver;
    if (!((life3_18 != null))) {
        forestValue541_208_0 = spill541_12;
        break forest_join_208;
    }
    if (!((__fieldRead541_83(spill541_12) != null))) {
        break forest_join_204;
    }
    spill541_13 = __call541_85(__fieldRead541_84(receiver));
    if (!((life3_18 != null))) {
        forestValue541_209_0 = __integerCategory541_86(spill541_13);
        break forest_join_209;
    }
    if (!(spill541_13)) {
        break forest_join_204;
    }
    __fieldWrite541_88(__fieldRead541_87(receiver), 0);
    }
    __call541_90(__fieldRead541_89(receiver));
    forestValue541_208_0 = receiver;
    }
    forestValue541_209_0 = __integerCategory541_92(__fieldRead541_91(forestValue541_208_0));
    }
    if (!((life3_18 != null))) {
        forestValue541_234_0 = forestValue541_209_0;
        break forest_join_234;
    }
    if (!((forestValue541_209_0 == 0))) {
        break forest_join_226;
    }
    __call541_94(__fieldRead541_93(receiver), "gameRenderer");
    __call541_98(__fieldRead541_95(receiver), __fieldRead541_97(__fieldRead541_96(receiver)), life4_13);
    __call541_100(__fieldRead541_99(receiver));
    }
    __call541_102(__fieldRead541_101(receiver));
    spill541_14 = receiver;
    if (!((life3_18 != null))) {
        forestValue541_270_0 = spill541_14;
        break forest_join_270;
    }
    forestValue541_234_0 = __integerCategory541_105(__fieldRead541_104(__fieldRead541_103(spill541_14)));
    }
    if (!((forestValue541_234_0 != 0))) {
        break forest_join_265;
    }
    spill541_15 = receiver;
    if (!((life3_18 != null))) {
        forestValue541_270_0 = spill541_15;
        break forest_join_270;
    }
    if (!(__fieldRead541_107(__fieldRead541_106(spill541_15)))) {
        break forest_join_265;
    }
    spill541_16 = receiver;
    if (!((life3_18 != null))) {
        forestValue541_270_0 = spill541_16;
        break forest_join_270;
    }
    if (!((!__fieldRead541_109(__fieldRead541_108(spill541_16))))) {
        break forest_join_265;
    }
    spill541_17 = __fieldRead541_110(receiver);
    if (!((life3_18 != null))) {
        forestValue541_258_0 = spill541_17;
        break forest_join_258;
    }
    if (!((!__fieldRead541_111(spill541_17)))) {
        break forest_join_256;
    }
    __call541_113(__fieldRead541_112(receiver));
    }
    forestValue541_258_0 = __fieldRead541_114(receiver);
    }
    __fieldWrite541_115(forestValue541_258_0, 1);
    __call541_116(receiver, life10_201);
    if (!((life3_18 == null))) {
        break forest_join_272;
    }
    }
    __fieldWrite541_118(__fieldRead541_117(receiver), 0);
    forestValue541_270_0 = receiver;
    }
    __fieldWrite541_120(forestValue541_270_0, __call541_119());
    }
    com.moon.d5 __stackOp541_122_0 = __sourceUninitializedNEW541_121();
    spill541_18 = __stackOp541_122_0;
    __explicitNewInit541_123(__stackOp541_122_0);
    life12_360 = spill541_18;
    __call541_126(__call541_125(__call541_124()), life12_360);
    if (!((life3_18 != null))) {
        break forest_join_335;
    }
    if (!((!__call541_127(life12_360)))) {
        break forest_join_288;
    }
    __call541_129(__fieldRead541_128(receiver));
    }
    __call541_131(__fieldRead541_130(receiver));
    __call541_132();
    __call541_133();
    __call541_137(__fieldRead541_134(receiver), __fieldRead541_135(receiver), __fieldRead541_136(receiver));
    __call541_138();
    __call541_140(__fieldRead541_139(receiver), "root");
    __call541_141(receiver);
    __call541_142();
    __call541_144(__fieldRead541_143(receiver), "stream");
    __call541_146(__fieldRead541_145(receiver), "update");
    __call541_148(__fieldRead541_147(receiver), "submit");
    __call541_150(__fieldRead541_149(receiver));
    __call541_152(__fieldRead541_151(receiver));
    __call541_153(receiver, "Post render");
    net.minecraft.client.Minecraft __stackOp541_154_0 = receiver;
    __fieldWrite541_156(__stackOp541_154_0, (__fieldRead541_155(__stackOp541_154_0) + 1));
    }
    spill541_19 = receiver;
    spill541_20 = receiver;
    if (!((life3_18 != null))) {
        forestValue541_342_0 = spill541_19;
        forestValue541_342_1 = spill541_20;
        break forest_join_342;
    }
    if (!(__call541_157(spill541_20))) {
        forestValue541_360_0 = spill541_19;
        break forest_join_360;
    }
    forestValue541_342_0 = spill541_19;
    forestValue541_342_1 = receiver;
    }
    spill541_21 = __fieldRead541_158(forestValue541_342_1);
    if (!((life3_18 != null))) {
        forestValue541_348_0 = forestValue541_342_0;
        forestValue541_348_1 = spill541_21;
        break forest_join_348;
    }
    if (!((spill541_21 != null))) {
        forestValue541_360_0 = forestValue541_342_0;
        break forest_join_360;
    }
    forestValue541_348_0 = forestValue541_342_0;
    forestValue541_348_1 = __fieldRead541_159(receiver);
    }
    spill541_22 = __call541_160(forestValue541_348_1);
    if (!((life3_18 != null))) {
        forestValue541_355_0 = forestValue541_348_0;
        forestValue541_355_1 = __integerCategory541_161(spill541_22);
        break forest_join_355;
    }
    if (!(spill541_22)) {
        forestValue541_360_0 = forestValue541_348_0;
        break forest_join_360;
    }
    forestValue541_355_0 = forestValue541_348_0;
    forestValue541_355_1 = __integerCategory541_164(__call541_163(__fieldRead541_162(receiver)));
    }
    if (!((life3_18 != null))) {
        forestValue541_359_0 = forestValue541_355_0;
        forestValue541_359_1 = forestValue541_355_1;
        break forest_join_359;
    }
    if (!((forestValue541_355_1 == 0))) {
        forestValue541_360_0 = forestValue541_355_0;
        break forest_join_360;
    }
    forestValue541_359_0 = forestValue541_355_0;
    forestValue541_359_1 = 1;
    }
    forestValue541_361_0 = forestValue541_359_0;
    forestValue541_361_1 = forestValue541_359_1;
    break forest_join_361;
    }
    forestValue541_361_0 = forestValue541_360_0;
    forestValue541_361_1 = 0;
    }
    __fieldWrite541_165(forestValue541_361_0, forestValue541_361_1);
    life13_470 = __call541_166();
    __call541_169(__fieldRead541_167(receiver), (life13_470 - __fieldRead541_168(receiver)));
    __fieldWrite541_170(receiver, life13_470);
    forest_cycle_374: while (true) {
    forest_join_519: {
    forest_join_490: {
    forest_join_489: {
    forest_join_478: {
    forest_join_477: {
    forest_join_473: {
    forest_join_470: {
    forest_join_455: {
    forest_join_454: {
    forest_join_445: {
    forest_join_444: {
    forest_join_435: {
    forest_join_434: {
    forest_join_431: {
    forest_join_416: {
    forest_join_415: {
    if (!((__numericCompare541_174(__call541_171(), (__fieldRead541_172(receiver) + __invokedynamic541_173(27702, (8356632135910951657L ^ life1_3)))) >= 0))) {
        break forest_join_522;
    }
    __fieldWrite541_176(__fieldRead541_175(receiver));
    spill541_23 = receiver;
    if (!((life3_18 != null))) {
        forestValue541_536_0 = spill541_23;
        break forest_join_536;
    }
    spill541_24 = "%d fps (%d chunk update%s) T: %s%s%s%s%s";
    java.lang.Object[] __stackOp541_178_0 = new java.lang.Object[__invokedynamic541_177(265, (6225897745981642753L ^ life1_3))];
    spill541_25 = __stackOp541_178_0;
    (__stackOp541_178_0)[0] = __call541_180(__fieldRead541_179());
    java.lang.Object[] __stackOp541_181_0 = spill541_25;
    spill541_26 = __stackOp541_181_0;
    (__stackOp541_181_0)[1] = __call541_183(__fieldRead541_182());
    java.lang.Object[] __stackOp541_184_0 = spill541_26;
    spill541_27 = __stackOp541_184_0;
    spill541_28 = __stackOp541_184_0;
    spill541_29 = 2;
    if (!((__fieldRead541_185() != 1))) {
        forestValue541_415_0 = spill541_23;
        forestValue541_415_1 = spill541_24;
        forestValue541_415_2 = spill541_27;
        forestValue541_415_3 = spill541_28;
        forestValue541_415_4 = spill541_29;
        break forest_join_415;
    }
    forestValue541_416_0 = spill541_23;
    forestValue541_416_1 = spill541_24;
    forestValue541_416_2 = spill541_27;
    forestValue541_416_3 = spill541_28;
    forestValue541_416_4 = spill541_29;
    forestValue541_416_5 = "s";
    break forest_join_416;
    }
    forestValue541_416_0 = forestValue541_415_0;
    forestValue541_416_1 = forestValue541_415_1;
    forestValue541_416_2 = forestValue541_415_2;
    forestValue541_416_3 = forestValue541_415_3;
    forestValue541_416_4 = forestValue541_415_4;
    forestValue541_416_5 = "";
    }
    (forestValue541_416_3)[forestValue541_416_4] = forestValue541_416_5;
    java.lang.Object[] __stackOp541_186_0 = forestValue541_416_2;
    spill541_30 = __stackOp541_186_0;
    spill541_31 = __stackOp541_186_0;
    spill541_32 = 3;
    spill541_33 = __numericCompare541_191(((float) __fieldRead541_188(__fieldRead541_187(receiver))), __call541_190(__fieldRead541_189()));
    if (!((life3_18 != null))) {
        forestValue541_434_0 = forestValue541_416_0;
        forestValue541_434_1 = forestValue541_416_1;
        forestValue541_434_2 = spill541_30;
        forestValue541_434_3 = spill541_31;
        forestValue541_434_4 = spill541_32;
        forestValue541_434_5 = spill541_33;
        break forest_join_434;
    }
    if (!((spill541_33 == 0))) {
        forestValue541_431_0 = forestValue541_416_0;
        forestValue541_431_1 = forestValue541_416_1;
        forestValue541_431_2 = spill541_30;
        forestValue541_431_3 = spill541_31;
        forestValue541_431_4 = spill541_32;
        break forest_join_431;
    }
    forestValue541_435_0 = forestValue541_416_0;
    forestValue541_435_1 = forestValue541_416_1;
    forestValue541_435_2 = spill541_30;
    forestValue541_435_3 = spill541_31;
    forestValue541_435_4 = spill541_32;
    forestValue541_435_5 = "inf";
    break forest_join_435;
    }
    forestValue541_434_0 = forestValue541_431_0;
    forestValue541_434_1 = forestValue541_431_1;
    forestValue541_434_2 = forestValue541_431_2;
    forestValue541_434_3 = forestValue541_431_3;
    forestValue541_434_4 = forestValue541_431_4;
    forestValue541_434_5 = __fieldRead541_193(__fieldRead541_192(receiver));
    }
    forestValue541_435_0 = forestValue541_434_0;
    forestValue541_435_1 = forestValue541_434_1;
    forestValue541_435_2 = forestValue541_434_2;
    forestValue541_435_3 = forestValue541_434_3;
    forestValue541_435_4 = forestValue541_434_4;
    forestValue541_435_5 = __call541_194(forestValue541_434_5);
    }
    (forestValue541_435_3)[forestValue541_435_4] = forestValue541_435_5;
    java.lang.Object[] __stackOp541_195_0 = forestValue541_435_2;
    spill541_34 = __stackOp541_195_0;
    spill541_35 = __stackOp541_195_0;
    spill541_36 = 4;
    if (!(__fieldRead541_197(__fieldRead541_196(receiver)))) {
        forestValue541_444_0 = forestValue541_435_0;
        forestValue541_444_1 = forestValue541_435_1;
        forestValue541_444_2 = spill541_34;
        forestValue541_444_3 = spill541_35;
        forestValue541_444_4 = spill541_36;
        break forest_join_444;
    }
    forestValue541_445_0 = forestValue541_435_0;
    forestValue541_445_1 = forestValue541_435_1;
    forestValue541_445_2 = spill541_34;
    forestValue541_445_3 = spill541_35;
    forestValue541_445_4 = spill541_36;
    forestValue541_445_5 = " vsync";
    break forest_join_445;
    }
    forestValue541_445_0 = forestValue541_444_0;
    forestValue541_445_1 = forestValue541_444_1;
    forestValue541_445_2 = forestValue541_444_2;
    forestValue541_445_3 = forestValue541_444_3;
    forestValue541_445_4 = forestValue541_444_4;
    forestValue541_445_5 = "";
    }
    (forestValue541_445_3)[forestValue541_445_4] = forestValue541_445_5;
    java.lang.Object[] __stackOp541_198_0 = forestValue541_445_2;
    spill541_37 = __stackOp541_198_0;
    spill541_38 = __stackOp541_198_0;
    spill541_39 = 5;
    if (!(__fieldRead541_200(__fieldRead541_199(receiver)))) {
        forestValue541_454_0 = forestValue541_445_0;
        forestValue541_454_1 = forestValue541_445_1;
        forestValue541_454_2 = spill541_37;
        forestValue541_454_3 = spill541_38;
        forestValue541_454_4 = spill541_39;
        break forest_join_454;
    }
    forestValue541_455_0 = forestValue541_445_0;
    forestValue541_455_1 = forestValue541_445_1;
    forestValue541_455_2 = spill541_37;
    forestValue541_455_3 = spill541_38;
    forestValue541_455_4 = spill541_39;
    forestValue541_455_5 = "";
    break forest_join_455;
    }
    forestValue541_455_0 = forestValue541_454_0;
    forestValue541_455_1 = forestValue541_454_1;
    forestValue541_455_2 = forestValue541_454_2;
    forestValue541_455_3 = forestValue541_454_3;
    forestValue541_455_4 = forestValue541_454_4;
    forestValue541_455_5 = " fast";
    }
    (forestValue541_455_3)[forestValue541_455_4] = forestValue541_455_5;
    java.lang.Object[] __stackOp541_201_0 = forestValue541_455_2;
    spill541_40 = __stackOp541_201_0;
    spill541_41 = __stackOp541_201_0;
    spill541_42 = __invokedynamic541_202(26876, (5755870114452173291L ^ life1_3));
    spill541_43 = __fieldRead541_204(__fieldRead541_203(receiver));
    if (!((life3_18 != null))) {
        forestValue541_473_0 = forestValue541_455_0;
        forestValue541_473_1 = forestValue541_455_1;
        forestValue541_473_2 = spill541_40;
        forestValue541_473_3 = spill541_41;
        forestValue541_473_4 = spill541_42;
        forestValue541_473_5 = spill541_43;
        break forest_join_473;
    }
    if (!((spill541_43 == 0))) {
        forestValue541_470_0 = forestValue541_455_0;
        forestValue541_470_1 = forestValue541_455_1;
        forestValue541_470_2 = spill541_40;
        forestValue541_470_3 = spill541_41;
        forestValue541_470_4 = spill541_42;
        break forest_join_470;
    }
    forestValue541_478_0 = forestValue541_455_0;
    forestValue541_478_1 = forestValue541_455_1;
    forestValue541_478_2 = spill541_40;
    forestValue541_478_3 = spill541_41;
    forestValue541_478_4 = spill541_42;
    forestValue541_478_5 = "";
    break forest_join_478;
    }
    forestValue541_473_0 = forestValue541_470_0;
    forestValue541_473_1 = forestValue541_470_1;
    forestValue541_473_2 = forestValue541_470_2;
    forestValue541_473_3 = forestValue541_470_3;
    forestValue541_473_4 = forestValue541_470_4;
    forestValue541_473_5 = __fieldRead541_206(__fieldRead541_205(receiver));
    }
    if (!((forestValue541_473_5 == 1))) {
        forestValue541_477_0 = forestValue541_473_0;
        forestValue541_477_1 = forestValue541_473_1;
        forestValue541_477_2 = forestValue541_473_2;
        forestValue541_477_3 = forestValue541_473_3;
        forestValue541_477_4 = forestValue541_473_4;
        break forest_join_477;
    }
    forestValue541_478_0 = forestValue541_473_0;
    forestValue541_478_1 = forestValue541_473_1;
    forestValue541_478_2 = forestValue541_473_2;
    forestValue541_478_3 = forestValue541_473_3;
    forestValue541_478_4 = forestValue541_473_4;
    forestValue541_478_5 = " fast-clouds";
    break forest_join_478;
    }
    forestValue541_478_0 = forestValue541_477_0;
    forestValue541_478_1 = forestValue541_477_1;
    forestValue541_478_2 = forestValue541_477_2;
    forestValue541_478_3 = forestValue541_477_3;
    forestValue541_478_4 = forestValue541_477_4;
    forestValue541_478_5 = " fancy-clouds";
    }
    (forestValue541_478_3)[forestValue541_478_4] = forestValue541_478_5;
    java.lang.Object[] __stackOp541_207_0 = forestValue541_478_2;
    spill541_44 = __stackOp541_207_0;
    spill541_45 = __stackOp541_207_0;
    spill541_46 = __invokedynamic541_208(30632, (5496572377622671102L ^ life1_3));
    if (!(__call541_209())) {
        forestValue541_489_0 = forestValue541_478_0;
        forestValue541_489_1 = forestValue541_478_1;
        forestValue541_489_2 = spill541_44;
        forestValue541_489_3 = spill541_45;
        forestValue541_489_4 = spill541_46;
        break forest_join_489;
    }
    forestValue541_490_0 = forestValue541_478_0;
    forestValue541_490_1 = forestValue541_478_1;
    forestValue541_490_2 = spill541_44;
    forestValue541_490_3 = spill541_45;
    forestValue541_490_4 = spill541_46;
    forestValue541_490_5 = " vbo";
    break forest_join_490;
    }
    forestValue541_490_0 = forestValue541_489_0;
    forestValue541_490_1 = forestValue541_489_1;
    forestValue541_490_2 = forestValue541_489_2;
    forestValue541_490_3 = forestValue541_489_3;
    forestValue541_490_4 = forestValue541_489_4;
    forestValue541_490_5 = "";
    }
    (forestValue541_490_3)[forestValue541_490_4] = forestValue541_490_5;
    __fieldWrite541_211(forestValue541_490_0, __call541_210(forestValue541_490_1, forestValue541_490_2));
    __fieldWrite541_212(0);
    net.minecraft.client.Minecraft __stackOp541_213_0 = receiver;
    __fieldWrite541_216(__stackOp541_213_0, (__fieldRead541_214(__stackOp541_213_0) + __invokedynamic541_215(29745, (2821153278935241446L ^ life1_3))));
    __fieldWrite541_217(receiver, 0);
    __call541_219(__fieldRead541_218(receiver));
    spill541_47 = __fieldRead541_220(receiver);
    if (!((life3_18 != null))) {
        forestValue541_519_0 = spill541_47;
        break forest_join_519;
    }
    if (!((!__call541_221(spill541_47)))) {
        continue forest_cycle_374;
    }
    forestValue541_519_0 = __fieldRead541_222(receiver);
    }
    __call541_223(forestValue541_519_0);
    if (!((life3_18 == null))) {
        continue forest_cycle_374;
    }
    break forest_cycle_374;
    }
    }
    forest_cycle_522: while (true) {
    if (!((!__call541_225(__fieldRead541_224(receiver))))) {
        break forest_join_551;
    }
    __call541_229(__cast541_228(__call541_227(__fieldRead541_226(receiver))));
    if (!((life3_18 != null))) {
        break forest_join_576;
    }
    if (!((life3_18 == null))) {
        continue forest_cycle_522;
    }
    break forest_cycle_522;
    }
    break forest_join_551;
    }
    forest_cycle_536: while (true) {
    forest_join_549: {
    if (!((!__call541_231(__fieldRead541_230(forestValue541_536_0))))) {
        break forest_join_551;
    }
    __call541_235(__cast541_234(__call541_233(__fieldRead541_232(receiver))));
    if (!((life3_18 != null))) {
        break forest_join_576;
    }
    if (!((life3_18 == null))) {
        break forest_join_549;
    }
    break forest_join_551;
    }
    spill541_48 = receiver;
    forestValue541_536_0 = spill541_48;
    continue forest_cycle_536;
    }
    }
    spill541_49 = receiver;
    if (!((life3_18 != null))) {
        forestValue541_567_0 = spill541_49;
        break forest_join_567;
    }
    if (!(__call541_236(spill541_49))) {
        break forest_join_566;
    }
    __call541_238(__fieldRead541_237(receiver), "fpslimit_wait");
    __call541_240(__call541_239(receiver));
    __call541_242(__fieldRead541_241(receiver));
    }
    forestValue541_567_0 = receiver;
    }
    __call541_244(__fieldRead541_243(forestValue541_567_0));
    spill541_50 = __call541_246(__call541_245());
    com.moon.eQ __stackOp541_248_0 = __sourceUninitializedNEW541_247();
    spill541_51 = __stackOp541_248_0;
    __explicitNewInit541_250(__stackOp541_248_0, __fieldRead541_249());
    __call541_251(spill541_50, spill541_51);
    }
    return;
}
public static void h541_0(java.io.IOException p0) throws Throwable {
    throw __call3054100_0(p0);
}
public static void h541_1(java.io.IOException p0) throws Throwable {
    throw __call3054101_0(p0);
}
public static void h541_2(java.io.IOException p0) throws Throwable {
    throw __call3054102_0(p0);
}
public static void h541_3(java.io.IOException p0) throws Throwable {
    throw __call3054103_0(p0);
}
public static void h541_4(java.io.IOException p0) throws Throwable {
    throw __call3054104_0(p0);
}
public static void h541_5(java.io.IOException p0) throws Throwable {
    throw __call3054105_0(p0);
}
public static void h541_6(java.io.IOException p0) throws Throwable {
    throw __call3054106_0(p0);
}
public static void h541_7(java.io.IOException p0) throws Throwable {
    throw __call3054107_0(p0);
}
public static void h541_8(java.io.IOException p0) throws Throwable {
    throw __call3054108_0(p0);
}
public static void h541_9(java.lang.Throwable p0, java.util.Queue p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3054109_0(p1);
    throw life2_2;
}
public static void h541_10(java.io.IOException p0) throws Throwable {
    throw __call3054110_0(p0);
}
public static void h541_11(java.io.IOException p0) throws Throwable {
    throw __call3054111_0(p0);
}
public static void h541_12(java.io.IOException p0) throws Throwable {
    throw __call3054112_0(p0);
}
public static void h541_13(java.io.IOException p0) throws Throwable {
    throw __call3054113_0(p0);
}
public static void h541_14(java.io.IOException p0) throws Throwable {
    throw __call3054114_0(p0);
}
public static void h541_15(java.io.IOException p0) throws Throwable {
    throw __call3054115_0(p0);
}
public static void h541_16(java.io.IOException p0) throws Throwable {
    throw __call3054116_0(p0);
}
public static void h541_17(java.io.IOException p0) throws Throwable {
    throw __call3054117_0(p0);
}
public static void h541_18(java.io.IOException p0) throws Throwable {
    throw __call3054118_0(p0);
}
public static void h541_19(java.io.IOException p0) throws Throwable {
    throw __call3054119_0(p0);
}
public static void h541_20(java.io.IOException p0) throws Throwable {
    throw __call3054120_0(p0);
}
public static void h541_21(java.io.IOException p0) throws Throwable {
    throw __call3054121_0(p0);
}
public static void h541_22(java.io.IOException p0) throws Throwable {
    throw __call3054122_0(p0);
}
public static void h541_23(java.io.IOException p0) throws Throwable {
    throw __call3054123_0(p0);
}
public static void h541_24(java.io.IOException p0) throws Throwable {
    throw __call3054124_0(p0);
}
public static void h541_25(java.io.IOException p0) throws Throwable {
    throw __call3054125_0(p0);
}
public static void h541_26(java.io.IOException p0) throws Throwable {
    throw __call3054126_0(p0);
}
public static void h541_27(java.io.IOException p0) throws Throwable {
    throw __call3054127_0(p0);
}
public static void h541_28(java.io.IOException p0) throws Throwable {
    throw __call3054128_0(p0);
}
public static void h541_29(java.io.IOException p0) throws Throwable {
    throw __call3054129_0(p0);
}
public static void h541_30(java.io.IOException p0) throws Throwable {
    throw __call3054130_0(p0);
}
public static void h541_31(java.io.IOException p0) throws Throwable {
    throw __call3054131_0(p0);
}
public static void h541_32(java.io.IOException p0) throws Throwable {
    throw __call3054132_0(p0);
}
public static void h541_33(java.io.IOException p0) throws Throwable {
    throw __call3054133_0(p0);
}
public static void h541_34(java.io.IOException p0) throws Throwable {
    throw __call3054134_0(p0);
}
public static void h541_35(java.io.IOException p0) throws Throwable {
    throw __call3054135_0(p0);
}
public static void h541_36(java.io.IOException p0) throws Throwable {
    throw __call3054136_0(p0);
}
public static void h541_37(java.io.IOException p0) throws Throwable {
    throw __call3054137_0(p0);
}
public static void h541_38(java.io.IOException p0) throws Throwable {
    throw __call3054138_0(p0);
}
public static void h541_39(java.io.IOException p0) throws Throwable {
    throw __call3054139_0(p0);
}
public static void h541_40(java.io.IOException p0) throws Throwable {
    throw __call3054140_0(p0);
}
public static void h541_41(java.io.IOException p0) throws Throwable {
    throw __call3054141_0(p0);
}
public static void h541_42(java.io.IOException p0) throws Throwable {
    throw __call3054142_0(p0);
}
public static void h541_43(java.io.IOException p0) throws Throwable {
    throw __call3054143_0(p0);
}
public static void h541_44(java.io.IOException p0) throws Throwable {
    throw __call3054144_0(p0);
}
public static void h541_45(java.io.IOException p0) throws Throwable {
    throw __call3054145_0(p0);
}
public static void h541_46(java.io.IOException p0) throws Throwable {
    throw __call3054146_0(p0);
}
public static void h541_47(java.io.IOException p0) throws Throwable {
    throw __call3054147_0(p0);
}
public static void h541_48(java.io.IOException p0) throws Throwable {
    throw __call3054148_0(p0);
}
public static void h541_49(java.io.IOException p0) throws Throwable {
    throw __call3054149_0(p0);
}
public static void h541_50(java.io.IOException p0) throws Throwable {
    throw __call3054150_0(p0);
}
public static void h541_51(java.io.IOException p0) throws Throwable {
    throw __call3054151_0(p0);
}
public static void h541_52(java.io.IOException p0) throws Throwable {
    throw __call3054152_0(p0);
}
public static void h541_53(java.io.IOException p0) throws Throwable {
    throw __call3054153_0(p0);
}
public static void h541_54(java.io.IOException p0) throws Throwable {
    throw __call3054154_0(p0);
}
public static void h541_55(java.io.IOException p0) throws Throwable {
    throw __call3054155_0(p0);
}
public static void h541_56(java.io.IOException p0) throws Throwable {
    throw __call3054156_0(p0);
}
private static native long __fieldRead541_0() throws Throwable;
private static native com.moon.runtime.ClientContext __call541_1() throws Throwable;
private static native com.moon.events.EventBus __call541_2(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.eQ __sourceUninitializedNEW541_3() throws Throwable;
private static native com.moon.a1 __fieldRead541_5() throws Throwable;
private static native void __explicitNewInit541_6(com.moon.eQ a0, com.moon.a1 a1) throws Throwable;
private static native void __call541_7(com.moon.events.EventBus a0, com.moon.eQ a1) throws Throwable;
private static native int[] __call541_8() throws Throwable;
private static native long __call541_9() throws Throwable;
private static native moom.A9 __fieldRead541_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_11(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __call541_12() throws Throwable;
private static native int __integerCategory541_13(boolean value) throws Throwable;
private static native boolean __call541_14() throws Throwable;
private static native int __integerCategory541_15(boolean value) throws Throwable;
private static native void __call541_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead541_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory541_18(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead541_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DM __fieldRead541_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead541_21(moom.DM a0) throws Throwable;
private static native moom.DM __fieldRead541_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_23(moom.DM a0) throws Throwable;
private static native moom.DM __fieldRead541_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite541_25(moom.DM a0, float a1) throws Throwable;
private static native moom.DM __fieldRead541_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_27(moom.DM a0) throws Throwable;
private static native moom.A9 __fieldRead541_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_29(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native java.util.Queue __fieldRead541_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __monitorEnter541_31(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead541_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call541_33(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead541_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Object __call541_35(java.util.Queue a0) throws Throwable;
private static native java.util.concurrent.FutureTask __cast541_36(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead541_37() throws Throwable;
private static native java.lang.Object __call541_38(java.util.concurrent.FutureTask a0, org.apache.logging.log4j.Logger a1) throws Throwable;
private static native void __monitorExit541_39(java.util.Queue a0) throws Throwable;
private static native moom.A9 __fieldRead541_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_41(moom.A9 a0) throws Throwable;
private static native long __call541_42() throws Throwable;
private static native moom.A9 __fieldRead541_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_44(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.DM __fieldRead541_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead541_46(moom.DM a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call541_47() throws Throwable;
private static native com.moon.security.c __call541_48(com.moon.runtime.ClientContext a0) throws Throwable;
private static native long __call541_49() throws Throwable;
private static native long __call541_50() throws Throwable;
private static native long __invokedynamic541_51(int a0, long a1) throws Throwable;
private static native int __numericCompare541_52(long a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead541_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf541_54(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call541_55() throws Throwable;
private static native com.moon.security.c __call541_56(com.moon.runtime.ClientContext a0) throws Throwable;
private static native boolean __call541_57(com.moon.security.c a0) throws Throwable;
private static native int __integerCategory541_58(boolean value) throws Throwable;
private static native void __call541_59(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.A9 __fieldRead541_60(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_61(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native long __call541_62() throws Throwable;
private static native void __call541_63(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native moom.A9 __fieldRead541_64(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_65(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead541_66(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead541_67(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DM __fieldRead541_68(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead541_69(moom.DM a0) throws Throwable;
private static native void __call541_70(net.minecraft.client.audio.SoundHandler a0, net.minecraft.client.entity.EntityPlayerSP a1, float a2) throws Throwable;
private static native moom.A9 __fieldRead541_71(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_72(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead541_73(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_74(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call541_75() throws Throwable;
private static native int __invokedynamic541_76(int a0, long a1) throws Throwable;
private static native void __call541_77(int a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead541_78(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_79(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead541_80(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_81(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call541_82() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead541_83(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead541_84(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call541_85(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory541_86(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_87(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite541_88(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead541_89(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_90(moom.A9 a0) throws Throwable;
private static native boolean __fieldRead541_91(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory541_92(boolean value) throws Throwable;
private static native moom.A9 __fieldRead541_93(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_94(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead541_95(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DM __fieldRead541_96(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead541_97(moom.DM a0) throws Throwable;
private static native void __call541_98(net.minecraft.client.renderer.EntityRenderer a0, float a1, long a2) throws Throwable;
private static native moom.A9 __fieldRead541_99(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_100(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead541_101(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_102(moom.A9 a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_103(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead541_104(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory541_105(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_106(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead541_107(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_108(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead541_109(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native moom.A9 __fieldRead541_110(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead541_111(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead541_112(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_113(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead541_114(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite541_115(moom.A9 a0, int a1) throws Throwable;
private static native void __call541_116(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native moom.A9 __fieldRead541_117(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite541_118(moom.A9 a0, int a1) throws Throwable;
private static native long __call541_119() throws Throwable;
private static native void __fieldWrite541_120(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native com.moon.d5 __sourceUninitializedNEW541_121() throws Throwable;
private static native void __explicitNewInit541_123(com.moon.d5 a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call541_124() throws Throwable;
private static native com.moon.events.EventBus __call541_125(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call541_126(com.moon.events.EventBus a0, com.moon.d5 a1) throws Throwable;
private static native boolean __call541_127(com.moon.d5 a0) throws Throwable;
private static native moom.hK __fieldRead541_128(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_129(moom.hK a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead541_130(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_131(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call541_132() throws Throwable;
private static native void __call541_133() throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead541_134(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead541_135(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead541_136(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_137(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws Throwable;
private static native void __call541_138() throws Throwable;
private static native moom.A9 __fieldRead541_139(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_140(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native void __call541_141(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_142() throws Throwable;
private static native moom.A9 __fieldRead541_143(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_144(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.A9 __fieldRead541_145(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_146(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.A9 __fieldRead541_147(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_148(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native moom.A9 __fieldRead541_149(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_150(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead541_151(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_152(moom.A9 a0) throws Throwable;
private static native void __call541_153(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead541_155(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite541_156(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native boolean __call541_157(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead541_158(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead541_159(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call541_160(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __integerCategory541_161(boolean value) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead541_162(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call541_163(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __integerCategory541_164(boolean value) throws Throwable;
private static native void __fieldWrite541_165(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native long __call541_166() throws Throwable;
private static native moom.C3 __fieldRead541_167(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __fieldRead541_168(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_169(moom.C3 a0, long a1) throws Throwable;
private static native void __fieldWrite541_170(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native long __call541_171() throws Throwable;
private static native long __fieldRead541_172(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __invokedynamic541_173(int a0, long a1) throws Throwable;
private static native int __numericCompare541_174(long a0, long a1) throws Throwable;
private static native int __fieldRead541_175(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite541_176(int a0) throws Throwable;
private static native int __invokedynamic541_177(int a0, long a1) throws Throwable;
private static native int __fieldRead541_179() throws Throwable;
private static native java.lang.Integer __call541_180(int a0) throws Throwable;
private static native int __fieldRead541_182() throws Throwable;
private static native java.lang.Integer __call541_183(int a0) throws Throwable;
private static native int __fieldRead541_185() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_187(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead541_188(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead541_189() throws Throwable;
private static native float __call541_190(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native int __numericCompare541_191(float a0, float a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_192(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead541_193(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Integer __call541_194(int a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_196(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead541_197(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_199(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead541_200(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __invokedynamic541_202(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_203(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead541_204(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead541_205(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead541_206(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __invokedynamic541_208(int a0, long a1) throws Throwable;
private static native boolean __call541_209() throws Throwable;
private static native java.lang.String __call541_210(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite541_211(net.minecraft.client.Minecraft a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite541_212(int a0) throws Throwable;
private static native long __fieldRead541_214(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __invokedynamic541_215(int a0, long a1) throws Throwable;
private static native void __fieldWrite541_216(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native void __fieldWrite541_217(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead541_218(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_219(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead541_220(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call541_221(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead541_222(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_223(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.util.Queue __fieldRead541_224(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call541_225(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead541_226(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Object __call541_227(java.util.Queue a0) throws Throwable;
private static native java.lang.Runnable __cast541_228(java.lang.Object a0) throws Throwable;
private static native void __call541_229(java.lang.Runnable a0) throws Throwable;
private static native java.util.Queue __fieldRead541_230(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call541_231(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead541_232(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Object __call541_233(java.util.Queue a0) throws Throwable;
private static native java.lang.Runnable __cast541_234(java.lang.Object a0) throws Throwable;
private static native void __call541_235(java.lang.Runnable a0) throws Throwable;
private static native boolean __call541_236(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.A9 __fieldRead541_237(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_238(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native int __call541_239(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_240(int a0) throws Throwable;
private static native moom.A9 __fieldRead541_241(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_242(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead541_243(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call541_244(moom.A9 a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call541_245() throws Throwable;
private static native com.moon.events.EventBus __call541_246(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.eQ __sourceUninitializedNEW541_247() throws Throwable;
private static native com.moon.a1 __fieldRead541_249() throws Throwable;
private static native void __explicitNewInit541_250(com.moon.eQ a0, com.moon.a1 a1) throws Throwable;
private static native void __call541_251(com.moon.events.EventBus a0, com.moon.eQ a1) throws Throwable;
private static native java.lang.Throwable __call3054100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054103_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054104_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054105_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054106_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054107_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054108_0(java.io.IOException a0) throws Throwable;
private static native void __monitorExit3054109_0(java.util.Queue a0) throws Throwable;
private static native java.lang.Throwable __call3054110_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054111_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054112_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054113_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054114_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054115_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054116_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054117_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054118_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054119_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054120_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054121_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054122_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054123_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054124_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054125_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054126_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054127_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054128_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054129_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054130_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054131_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054132_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054133_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054134_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054135_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054136_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054137_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054138_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054139_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054140_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054141_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054142_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054143_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054144_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054145_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054146_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054147_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054148_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054149_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054150_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054151_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054152_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054153_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054154_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054155_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Throwable __call3054156_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_d8f96d39495f9c8f1dfa(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_d8f96d39495f9c8f1dfa {

public static java.lang.String f1279(net.minecraft.client.Minecraft receiver) throws Throwable {
    moom.A9 forwardValue1279_14_0;
    java.lang.String forwardValue1279_17_0;
    moom.A9 spill1279_0;
    long life1_3;
    int[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life1_3 = (__fieldRead1279_0() ^ 68625718530750L);
    life3_5 = __call1279_1();
    spill1279_0 = __fieldRead1279_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1279_14_0 = spill1279_0;
        break forward_join_14;
    }
    if (!(__fieldRead1279_3(spill1279_0))) {
        break forward_join_16;
    }
    forwardValue1279_14_0 = __fieldRead1279_4(receiver);
    }
    forwardValue1279_17_0 = __call1279_5(forwardValue1279_14_0);
    break forward_join_17;
    }
    forwardValue1279_17_0 = "N/A (disabled)";
    }
    return forwardValue1279_17_0;
}
public static void h1279_0(java.lang.Exception p0) throws Throwable {
    throw __call1127900_0(p0);
}
public static void h1279_1(java.lang.Exception p0) throws Throwable {
    throw __call1127901_0(p0);
}
private static native long __fieldRead1279_0() throws Throwable;
private static native int[] __call1279_1() throws Throwable;
private static native moom.A9 __fieldRead1279_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1279_3(moom.A9 a0) throws Throwable;
private static native moom.A9 __fieldRead1279_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call1279_5(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call1127900_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1127901_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_2cd3e8c50a5a41a2a00f(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_2cd3e8c50a5a41a2a00f {

public static java.lang.String f2173(net.minecraft.client.Minecraft receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2173_0() ^ 10439020293276L);
    return (__fieldRead2173_2(__fieldRead2173_1(receiver)) ? "Yes" : "No");
}
public static void h2173_0(java.lang.Exception p0) throws Throwable {
    throw __call1217300_0(p0);
}
private static native long __fieldRead2173_0() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2173_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead2173_2(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.Throwable __call1217300_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_c3221cbde87f77402f23() throws E;
private static final class __SourceHandler_c3221cbde87f77402f23 {

public static java.lang.String f1280() throws Throwable {
    java.lang.String forwardValue1280_16_0;
    java.lang.String forwardValue1280_23_0;
    int[] spill1280_0;
    java.lang.String spill1280_1;
    long life0_3;
    java.lang.String life3_6;
    int[] life2_7;
    forward_join_23: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life0_3 = (__fieldRead1280_0() ^ 20456508722079L);
    spill1280_0 = __call1280_1();
    life3_6 = __call1280_2();
    life2_7 = spill1280_0;
    spill1280_1 = life3_6;
    if (!((life2_7 != null))) {
        forwardValue1280_16_0 = spill1280_1;
        break forward_join_16;
    }
    if (!((!__call1280_3(spill1280_1, "vanilla")))) {
        break forward_join_17;
    }
    forwardValue1280_16_0 = __invokedynamic1280_4(life3_6);
    }
    forwardValue1280_23_0 = forwardValue1280_16_0;
    break forward_join_23;
    }
    if (!((__call1280_6(__classLiteral1280_5()) == null))) {
        break forward_join_22;
    }
    forwardValue1280_23_0 = "Very likely; Jar signature invalidated";
    break forward_join_23;
    }
    forwardValue1280_23_0 = "Probably not. Jar signature remains and client brand is untouched.";
    }
    return forwardValue1280_23_0;
}
public static void h1280_0(java.lang.Exception p0) throws Throwable {
    throw __call1128000_0(p0);
}
public static void h1280_1(java.lang.Exception p0) throws Throwable {
    throw __call1128001_0(p0);
}
public static void h1280_2(java.lang.Exception p0) throws Throwable {
    throw __call1128002_0(p0);
}
private static native long __fieldRead1280_0() throws Throwable;
private static native int[] __call1280_1() throws Throwable;
private static native java.lang.String __call1280_2() throws Throwable;
private static native boolean __call1280_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic1280_4(java.lang.String a0) throws Throwable;
private static native java.lang.Object __classLiteral1280_5() throws Throwable;
private static native java.lang.Object[] __call1280_6(java.lang.Object a0) throws Throwable;
private static native java.lang.Throwable __call1128000_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1128001_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1128002_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_ee8fc366c4f944b7caad(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_ee8fc366c4f944b7caad {

public static java.lang.String f194(net.minecraft.client.Minecraft receiver) throws Throwable {
    int lexicalValue194_44_0;
    java.lang.StringBuilder lexicalValue194_48_0;
    java.lang.StringBuilder lexicalValue194_52_0;
    int[] spill194_0;
    java.lang.StringBuilder spill194_1;
    int spill194_2;
    java.lang.StringBuilder spill194_3;
    long life1_3;
    java.lang.StringBuilder life4_8;
    java.util.Iterator life5_13;
    int[] life3_14;
    java.lang.String life6_21;
    lexical_join_52: {
    lexical_join_51: {
    life1_3 = (__fieldRead194_0() ^ 135289445344654L);
    spill194_0 = __call194_1();
    life4_8 = new java.lang.StringBuilder();
    life5_13 = __call194_4(__fieldRead194_3(__fieldRead194_2(receiver)));
    life3_14 = spill194_0;
    lexical_cycle_15: while (true) {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_44: {
    lexical_join_33: {
    if (!(__call194_5(life5_13))) {
        break lexical_join_51;
    }
    life6_21 = __cast194_7(__call194_6(life5_13));
    spill194_1 = life4_8;
    if (!((life3_14 != null))) {
        lexicalValue194_52_0 = spill194_1;
        break lexical_join_52;
    }
    spill194_2 = __call194_8(spill194_1);
    if (!((life3_14 != null))) {
        lexicalValue194_44_0 = spill194_2;
        break lexical_join_44;
    }
    if (!((spill194_2 > 0))) {
        break lexical_join_33;
    }
    __call194_9(life4_8, ", ");
    }
    spill194_3 = __call194_10(life4_8, life6_21);
    if (!((life3_14 != null))) {
        lexicalValue194_48_0 = spill194_3;
        break lexical_join_48;
    }
    __discardScalar194_11(spill194_3);
    lexicalValue194_44_0 = __integerCategory194_15(__call194_14(__fieldRead194_13(__fieldRead194_12(receiver)), life6_21));
    }
    if (!((lexicalValue194_44_0 != 0))) {
        break lexical_join_49;
    }
    lexicalValue194_48_0 = __call194_16(life4_8, " (incompatible)");
    }
    __discardScalar194_17(lexicalValue194_48_0);
    }
    if (!((life3_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue194_52_0 = life4_8;
    }
    return __call194_18(lexicalValue194_52_0);
}
public static void h194_0(java.lang.Exception p0) throws Throwable {
    throw __call1019400_0(p0);
}
public static void h194_1(java.lang.Exception p0) throws Throwable {
    throw __call1019401_0(p0);
}
public static void h194_2(java.lang.Exception p0) throws Throwable {
    throw __call1019402_0(p0);
}
public static void h194_3(java.lang.Exception p0) throws Throwable {
    throw __call1019403_0(p0);
}
public static void h194_4(java.lang.Exception p0) throws Throwable {
    throw __call1019404_0(p0);
}
private static native long __fieldRead194_0() throws Throwable;
private static native int[] __call194_1() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead194_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead194_3(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.util.Iterator __call194_4(java.util.List a0) throws Throwable;
private static native boolean __call194_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call194_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast194_7(java.lang.Object a0) throws Throwable;
private static native int __call194_8(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.StringBuilder __call194_9(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call194_10(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar194_11(java.lang.StringBuilder a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead194_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead194_13(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call194_14(java.util.List a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory194_15(boolean value) throws Throwable;
private static native java.lang.StringBuilder __call194_16(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar194_17(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.String __call194_18(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call1019400_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1019401_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1019402_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1019403_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1019404_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dd3e4849e396c264376c(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_dd3e4849e396c264376c {

public static void f1282(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forwardValue1282_12_0;
    int forwardValue1282_17_0;
    int forwardValue1282_41_0;
    int forwardValue1282_51_0;
    net.minecraft.client.Minecraft forwardValue1282_56_0;
    boolean spill1282_0;
    int spill1282_1;
    int spill1282_2;
    net.minecraft.client.Minecraft spill1282_3;
    long life1_3;
    int[] life3_5;
    int life4_26;
    int life5_29;
    forward_join_61: {
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_47: {
    forward_join_41: {
    forward_join_39: {
    forward_join_17: {
    forward_join_12: {
    life1_3 = (__fieldRead1282_0() ^ 52047896547952L);
    life3_5 = __call1282_1();
    spill1282_0 = __fieldRead1282_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1282_12_0 = __integerCategory1282_3(spill1282_0);
        break forward_join_12;
    }
    if (!((!spill1282_0))) {
        break forward_join_61;
    }
    forwardValue1282_12_0 = __integerCategory1282_5(__call1282_4());
    }
    if (!((life3_5 != null))) {
        forwardValue1282_17_0 = forwardValue1282_12_0;
        break forward_join_17;
    }
    if (!((forwardValue1282_12_0 != 0))) {
        break forward_join_61;
    }
    forwardValue1282_17_0 = __fieldRead1282_6(receiver);
    }
    life4_26 = forwardValue1282_17_0;
    life5_29 = __fieldRead1282_7(receiver);
    __fieldWrite1282_9(receiver, __call1282_8());
    __fieldWrite1282_11(receiver, __call1282_10());
    spill1282_1 = __fieldRead1282_12(receiver);
    if (!((life3_5 != null))) {
        forwardValue1282_41_0 = spill1282_1;
        break forward_join_41;
    }
    if (!((spill1282_1 == life4_26))) {
        break forward_join_39;
    }
    spill1282_2 = __fieldRead1282_13(receiver);
    if (!((life3_5 != null))) {
        forwardValue1282_41_0 = spill1282_2;
        break forward_join_41;
    }
    if (!((spill1282_2 != life5_29))) {
        break forward_join_61;
    }
    }
    forwardValue1282_41_0 = __fieldRead1282_14(receiver);
    }
    if (!((life3_5 != null))) {
        forwardValue1282_51_0 = forwardValue1282_41_0;
        break forward_join_51;
    }
    if (!((forwardValue1282_41_0 <= 0))) {
        break forward_join_47;
    }
    __fieldWrite1282_15(receiver, 1);
    }
    spill1282_3 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1282_56_0 = spill1282_3;
        break forward_join_56;
    }
    forwardValue1282_51_0 = __fieldRead1282_16(spill1282_3);
    }
    if (!((forwardValue1282_51_0 <= 0))) {
        break forward_join_55;
    }
    __fieldWrite1282_17(receiver, 1);
    }
    forwardValue1282_56_0 = receiver;
    }
    __call1282_20(forwardValue1282_56_0, __fieldRead1282_18(receiver), __fieldRead1282_19(receiver));
    }
    return;
}
public static void h1282_0(moom.Oo p0) throws Throwable {
    throw __call1128200_0(p0);
}
public static void h1282_1(moom.Oo p0) throws Throwable {
    throw __call1128201_0(p0);
}
public static void h1282_2(moom.Oo p0) throws Throwable {
    throw __call1128202_0(p0);
}
public static void h1282_3(moom.Oo p0) throws Throwable {
    throw __call1128203_0(p0);
}
public static void h1282_4(moom.Oo p0) throws Throwable {
    throw __call1128204_0(p0);
}
public static void h1282_5(moom.Oo p0) throws Throwable {
    throw __call1128205_0(p0);
}
public static void h1282_6(moom.Oo p0) throws Throwable {
    throw __call1128206_0(p0);
}
public static void h1282_7(moom.Oo p0) throws Throwable {
    throw __call1128207_0(p0);
}
public static void h1282_8(moom.Oo p0) throws Throwable {
    throw __call1128208_0(p0);
}
public static void h1282_9(moom.Oo p0) throws Throwable {
    throw __call1128209_0(p0);
}
public static void h1282_10(moom.Oo p0) throws Throwable {
    throw __call1128210_0(p0);
}
private static native long __fieldRead1282_0() throws Throwable;
private static native int[] __call1282_1() throws Throwable;
private static native boolean __fieldRead1282_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory1282_3(boolean value) throws Throwable;
private static native boolean __call1282_4() throws Throwable;
private static native int __integerCategory1282_5(boolean value) throws Throwable;
private static native int __fieldRead1282_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1282_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1282_8() throws Throwable;
private static native void __fieldWrite1282_9(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __call1282_10() throws Throwable;
private static native void __fieldWrite1282_11(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __fieldRead1282_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1282_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1282_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1282_15(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __fieldRead1282_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite1282_17(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __fieldRead1282_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1282_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1282_20(net.minecraft.client.Minecraft a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1128200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128210_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3bd7f968c9bbd85cb4e5(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_3bd7f968c9bbd85cb4e5 {

public static void f542(net.minecraft.client.Minecraft receiver) throws Throwable {
    __fieldWrite542_0(new byte[0]);
    __call542_2(__fieldRead542_1(receiver));
    __call542_3(receiver, null);
    return;
}
public static void h542_0(java.lang.Throwable p0, net.minecraft.client.Minecraft p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3054200_0(p1, null);
    return;
}
public static void h542_1(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    return;
}
private static native void __fieldWrite542_0(byte[] a0) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead542_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call542_2(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native void __call542_3(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native void __call3054200_0(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_62759a2fed459c7b5060(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_62759a2fed459c7b5060 {

public static boolean f2178(net.minecraft.client.Minecraft receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2178_0() ^ 93279619162765L);
    return ((__fieldRead2178_1(receiver) == __call2178_2()) ? true : false);
}
public static void h2178_0(moom.Oo p0) throws Throwable {
    throw __call1217800_0(p0);
}
private static native long __fieldRead2178_0() throws Throwable;
private static native java.lang.Thread __fieldRead2178_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Thread __call2178_2() throws Throwable;
private static native java.lang.Throwable __call1217800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a3c5b6eb684972586cd8(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_a3c5b6eb684972586cd8 {

public static void f1283(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forwardValue1283_14_0;
    net.minecraft.client.Minecraft forwardValue1283_25_0;
    boolean spill1283_0;
    net.minecraft.client.Minecraft spill1283_1;
    long life1_3;
    int[] life3_5;
    forward_join_31: {
    forward_join_25: {
    forward_join_14: {
    life1_3 = (__fieldRead1283_0() ^ 85074482269439L);
    life3_5 = __call1283_1();
    spill1283_0 = __call1283_2();
    if (!((life3_5 != null))) {
        forwardValue1283_14_0 = __integerCategory1283_3(spill1283_0);
        break forward_join_14;
    }
    if (!(spill1283_0)) {
        break forward_join_31;
    }
    spill1283_1 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1283_25_0 = spill1283_1;
        break forward_join_25;
    }
    forwardValue1283_14_0 = __integerCategory1283_5(__fieldRead1283_4(spill1283_1));
    }
    if (!((forwardValue1283_14_0 == 0))) {
        break forward_join_31;
    }
    __fieldWrite1283_6(receiver, 1);
    __call1283_8(__fieldRead1283_7(receiver));
    __call1283_9(receiver, null);
    forwardValue1283_25_0 = receiver;
    }
    __fieldWrite1283_11(forwardValue1283_25_0, __invokedynamic1283_10(12629, (5196827700904344073L ^ life1_3)));
    }
    return;
}
public static void h1283_0(moom.Oo p0) throws Throwable {
    throw __call1128300_0(p0);
}
public static void h1283_1(moom.Oo p0) throws Throwable {
    throw __call1128301_0(p0);
}
public static void h1283_2(moom.Oo p0) throws Throwable {
    throw __call1128302_0(p0);
}
public static void h1283_3(moom.Oo p0) throws Throwable {
    throw __call1128303_0(p0);
}
private static native long __fieldRead1283_0() throws Throwable;
private static native int[] __call1283_1() throws Throwable;
private static native boolean __call1283_2() throws Throwable;
private static native int __integerCategory1283_3(boolean value) throws Throwable;
private static native boolean __fieldRead1283_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory1283_5(boolean value) throws Throwable;
private static native void __fieldWrite1283_6(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native moom.Dt __fieldRead1283_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1283_8(moom.Dt a0) throws Throwable;
private static native void __call1283_9(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native int __invokedynamic1283_10(int a0, long a1) throws Throwable;
private static native void __fieldWrite1283_11(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1128300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128303_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8ef75a10d587996867ff(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_8ef75a10d587996867ff {

public static void f1284(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.Minecraft forwardValue1284_16_0;
    net.minecraft.client.Minecraft spill1284_0;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (__fieldRead1284_0() ^ 41408502599077L);
    life3_5 = __call1284_1();
    spill1284_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1284_16_0 = spill1284_0;
        break forward_join_16;
    }
    if (!(__fieldRead1284_2(spill1284_0))) {
        break forward_join_18;
    }
    __call1284_3();
    __fieldWrite1284_4(receiver, 0);
    forwardValue1284_16_0 = receiver;
    }
    __call1284_6(__fieldRead1284_5(forwardValue1284_16_0));
    }
    return;
}
public static void h1284_0(moom.Oo p0) throws Throwable {
    throw __call1128400_0(p0);
}
public static void h1284_1(moom.Oo p0) throws Throwable {
    throw __call1128401_0(p0);
}
private static native long __fieldRead1284_0() throws Throwable;
private static native int[] __call1284_1() throws Throwable;
private static native boolean __fieldRead1284_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1284_3() throws Throwable;
private static native void __fieldWrite1284_4(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native moom.Dt __fieldRead1284_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1284_6(moom.Dt a0) throws Throwable;
private static native java.lang.Throwable __call1128400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5ba5c93a00f45fbe3205(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_5ba5c93a00f45fbe3205 {

public static void f1285(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.Minecraft forwardValue1285_17_0;
    int forwardValue1285_26_0;
    net.minecraft.client.Minecraft forwardValue1285_28_0;
    net.minecraft.client.Minecraft spill1285_0;
    boolean spill1285_1;
    net.minecraft.client.Minecraft spill1285_2;
    long life1_3;
    int[] life3_5;
    forward_join_30: {
    forward_join_28: {
    forward_join_26: {
    forward_join_17: {
    life1_3 = (__fieldRead1285_0() ^ 5383100720737L);
    life3_5 = __call1285_1();
    spill1285_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1285_17_0 = spill1285_0;
        break forward_join_17;
    }
    if (!((__fieldRead1285_2(spill1285_0) == null))) {
        break forward_join_30;
    }
    __call1285_3(receiver, new net.minecraft.client.gui.GuiIngameMenu());
    forwardValue1285_17_0 = receiver;
    }
    spill1285_1 = __call1285_4(forwardValue1285_17_0);
    if (!((life3_5 != null))) {
        forwardValue1285_26_0 = __integerCategory1285_5(spill1285_1);
        break forward_join_26;
    }
    if (!(spill1285_1)) {
        break forward_join_30;
    }
    spill1285_2 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1285_28_0 = spill1285_2;
        break forward_join_28;
    }
    forwardValue1285_26_0 = __integerCategory1285_8(__call1285_7(__fieldRead1285_6(spill1285_2)));
    }
    if (!((forwardValue1285_26_0 == 0))) {
        break forward_join_30;
    }
    forwardValue1285_28_0 = receiver;
    }
    __call1285_10(__fieldRead1285_9(forwardValue1285_28_0));
    }
    return;
}
public static void h1285_0(moom.Oo p0) throws Throwable {
    throw __call1128500_0(p0);
}
public static void h1285_1(moom.Oo p0) throws Throwable {
    throw __call1128501_0(p0);
}
public static void h1285_2(moom.Oo p0) throws Throwable {
    throw __call1128502_0(p0);
}
public static void h1285_3(moom.Oo p0) throws Throwable {
    throw __call1128503_0(p0);
}
public static void h1285_4(moom.Oo p0) throws Throwable {
    throw __call1128504_0(p0);
}
private static native long __fieldRead1285_0() throws Throwable;
private static native int[] __call1285_1() throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1285_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1285_3(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiIngameMenu a1) throws Throwable;
private static native boolean __call1285_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory1285_5(boolean value) throws Throwable;
private static native net.minecraft.server.integrated.IntegratedServer __fieldRead1285_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call1285_7(net.minecraft.server.integrated.IntegratedServer a0) throws Throwable;
private static native int __integerCategory1285_8(boolean value) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead1285_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1285_10(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native java.lang.Throwable __call1128500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128504_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8c1da29ff810fcdadef5(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_8c1da29ff810fcdadef5 {

public static void f966(net.minecraft.client.Minecraft receiver) throws Throwable {
    com.moon.module.impl.AutoClicker forestValue966_20_0;
    com.moon.module.impl.AutoClicker forestValue966_25_0;
    int forestValue966_35_0;
    int forestValue966_39_0;
    int forestValue966_41_0;
    net.minecraft.client.Minecraft forestValue966_50_0;
    net.minecraft.util.MovingObjectPosition forestValue966_56_0;
    int forestValue966_78_0;
    net.minecraft.client.Minecraft forestValue966_96_0;
    net.minecraft.client.Minecraft forestValue966_154_0;
    int forestValue966_156_0;
    int forestValue966_168_0;
    com.moon.module.impl.AutoClicker spill966_0;
    boolean spill966_1;
    net.minecraft.client.Minecraft spill966_2;
    net.minecraft.util.MovingObjectPosition spill966_3;
    boolean spill966_4;
    net.minecraft.client.Minecraft spill966_5;
    boolean spill966_6;
    int spill966_7;
    net.minecraft.client.Minecraft spill966_8;
    long life1_3;
    int[] life3_5;
    int life4_48;
    com.moon.dM life5_77;
    moom.DT life5_152;
    forest_join_177: {
    forest_join_168: {
    forest_join_166: {
    forest_join_156: {
    forest_join_154: {
    forest_join_153: {
    forest_join_129: {
    forest_join_119: {
    forest_join_110: {
    forest_join_96: {
    forest_join_87: {
    forest_join_78: {
    forest_join_76: {
    forest_join_56: {
    forest_join_50: {
    forest_join_49: {
    forest_join_41: {
    forest_join_40: {
    forest_join_39: {
    forest_join_35: {
    forest_join_25: {
    forest_join_20: {
    forest_join_18: {
    life1_3 = (__fieldRead966_0() ^ 7336159018072L);
    life3_5 = __call966_1();
    spill966_0 = __fieldRead966_2(receiver);
    if (!((life3_5 != null))) {
        forestValue966_20_0 = spill966_0;
        break forest_join_20;
    }
    if (!((spill966_0 == null))) {
        break forest_join_18;
    }
    __fieldWrite966_8(receiver, __cast966_7(__call966_6(__call966_4(__call966_3()), __classLiteral966_5())));
    }
    forestValue966_20_0 = __fieldRead966_9(receiver);
    }
    if (!((life3_5 != null))) {
        forestValue966_25_0 = forestValue966_20_0;
        break forest_join_25;
    }
    if (!((forestValue966_20_0 != null))) {
        break forest_join_40;
    }
    forestValue966_25_0 = __fieldRead966_10(receiver);
    }
    spill966_1 = __call966_11(forestValue966_25_0);
    if (!((life3_5 != null))) {
        forestValue966_35_0 = __integerCategory966_12(spill966_1);
        break forest_join_35;
    }
    if (!(spill966_1)) {
        break forest_join_40;
    }
    forestValue966_35_0 = __integerCategory966_18(__call966_17(__cast966_16(__call966_15(__fieldRead966_14(__fieldRead966_13(receiver))))));
    }
    if (!((life3_5 != null))) {
        forestValue966_39_0 = forestValue966_35_0;
        break forest_join_39;
    }
    if (!((forestValue966_35_0 != 0))) {
        break forest_join_40;
    }
    forestValue966_39_0 = 1;
    }
    forestValue966_41_0 = forestValue966_39_0;
    break forest_join_41;
    }
    forestValue966_41_0 = 0;
    }
    life4_48 = forestValue966_41_0;
    spill966_2 = receiver;
    if (!((life3_5 != null))) {
        forestValue966_50_0 = spill966_2;
        break forest_join_50;
    }
    if (!((__fieldRead966_19(spill966_2) > 0))) {
        break forest_join_49;
    }
    if (!((life4_48 != 0))) {
        break forest_join_177;
    }
    }
    forestValue966_50_0 = receiver;
    }
    spill966_3 = __fieldRead966_20(forestValue966_50_0);
    if (!((life3_5 != null))) {
        forestValue966_56_0 = spill966_3;
        break forest_join_56;
    }
    if (!((spill966_3 != null))) {
        break forest_join_76;
    }
    forestValue966_56_0 = __fieldRead966_21(receiver);
    }
    if (!((__fieldRead966_22(forestValue966_56_0) == __fieldRead966_23()))) {
        break forest_join_76;
    }
    life5_77 = new com.moon.dM(__fieldRead966_25(__fieldRead966_24(receiver)));
    __call966_28(__call966_27(__call966_26()), life5_77);
    spill966_4 = __call966_29(life5_77);
    if (!((life3_5 != null))) {
        forestValue966_78_0 = __integerCategory966_30(spill966_4);
        break forest_join_78;
    }
    if (!(spill966_4)) {
        break forest_join_76;
    }
    return;
    }
    forestValue966_78_0 = __call966_32(__call966_31());
    }
    if (!((forestValue966_78_0 == __invokedynamic966_33(30071, (8047558777741610630L ^ life1_3))))) {
        break forest_join_87;
    }
    __call966_35(__fieldRead966_34(receiver));
    }
    spill966_5 = receiver;
    if (!((life3_5 != null))) {
        forestValue966_96_0 = spill966_5;
        break forest_join_96;
    }
    if (!((__fieldRead966_36(spill966_5) == null))) {
        break forest_join_110;
    }
    __call966_38(__fieldRead966_37(), "Null returned as 'hitResult', this shouldn't happen!");
    forestValue966_96_0 = receiver;
    }
    spill966_6 = __call966_40(__fieldRead966_39(forestValue966_96_0));
    if (!((life3_5 != null))) {
        forestValue966_168_0 = __integerCategory966_41(spill966_6);
        break forest_join_168;
    }
    if (!(spill966_6)) {
        break forest_join_166;
    }
    __fieldWrite966_43(receiver, __invokedynamic966_42(2274, (9111705401419461474L ^ life1_3)));
    if (!((life3_5 == null))) {
        break forest_join_166;
    }
    }
    spill966_7 = (__fieldRead966_44())[__call966_47(__fieldRead966_46(__fieldRead966_45(receiver)))];
    if (!((life3_5 != null))) {
        forestValue966_156_0 = spill966_7;
        break forest_join_156;
    }
    switch (spill966_7) {
case 1:
{
        break forest_join_119;
    }
case 2:
{
        break forest_join_129;
    }
case 3:
default:
{
        break forest_join_153;
    }
}
    }
    __call966_52(__fieldRead966_48(receiver), __fieldRead966_49(receiver), __fieldRead966_51(__fieldRead966_50(receiver)));
    if (!((life3_5 == null))) {
        break forest_join_166;
    }
    }
    life5_152 = __call966_54(__fieldRead966_53(receiver));
    spill966_8 = receiver;
    if (!((life3_5 != null))) {
        forestValue966_154_0 = spill966_8;
        break forest_join_154;
    }
    if (!((__call966_58(__call966_57(__call966_56(__fieldRead966_55(spill966_8), life5_152))) != __fieldRead966_59()))) {
        break forest_join_153;
    }
    __call966_63(__fieldRead966_60(receiver), life5_152, __fieldRead966_62(__fieldRead966_61(receiver)));
    if (!((life3_5 == null))) {
        break forest_join_166;
    }
    }
    forestValue966_154_0 = receiver;
    }
    forestValue966_156_0 = __integerCategory966_66(__call966_65(__fieldRead966_64(forestValue966_154_0)));
    }
    if (!((life3_5 != null))) {
        forestValue966_168_0 = forestValue966_156_0;
        break forest_join_168;
    }
    if (!((forestValue966_156_0 != 0))) {
        break forest_join_166;
    }
    __fieldWrite966_68(receiver, __invokedynamic966_67(17238, (496830183196342443L ^ life1_3)));
    }
    forestValue966_168_0 = __call966_70(__call966_69());
    }
    if (!((forestValue966_168_0 > __invokedynamic966_71(24262, (5004401053102843198L ^ life1_3))))) {
        break forest_join_177;
    }
    __call966_73(__fieldRead966_72(receiver));
    }
    return;
}
public static void h966_0(moom.Oo p0) throws Throwable {
    throw __call3096600_0(p0);
}
public static void h966_1(moom.Oo p0) throws Throwable {
    throw __call3096601_0(p0);
}
public static void h966_2(moom.Oo p0) throws Throwable {
    throw __call3096602_0(p0);
}
public static void h966_3(moom.Oo p0) throws Throwable {
    throw __call3096603_0(p0);
}
public static void h966_4(moom.Oo p0) throws Throwable {
    throw __call3096604_0(p0);
}
public static void h966_5(moom.Oo p0) throws Throwable {
    throw __call3096605_0(p0);
}
public static void h966_6(moom.Oo p0) throws Throwable {
    throw __call3096606_0(p0);
}
public static void h966_7(moom.Oo p0) throws Throwable {
    throw __call3096607_0(p0);
}
public static void h966_8(moom.Oo p0) throws Throwable {
    throw __call3096608_0(p0);
}
public static void h966_9(moom.Oo p0) throws Throwable {
    throw __call3096609_0(p0);
}
public static void h966_10(moom.Oo p0) throws Throwable {
    throw __call3096610_0(p0);
}
public static void h966_11(moom.Oo p0) throws Throwable {
    throw __call3096611_0(p0);
}
public static void h966_12(moom.Oo p0) throws Throwable {
    throw __call3096612_0(p0);
}
public static void h966_13(moom.Oo p0) throws Throwable {
    throw __call3096613_0(p0);
}
public static void h966_14(moom.Oo p0) throws Throwable {
    throw __call3096614_0(p0);
}
public static void h966_15(moom.Oo p0) throws Throwable {
    throw __call3096615_0(p0);
}
public static void h966_16(moom.Oo p0) throws Throwable {
    throw __call3096616_0(p0);
}
public static void h966_17(moom.Oo p0) throws Throwable {
    throw __call3096617_0(p0);
}
public static void h966_18(moom.Oo p0) throws Throwable {
    throw __call3096618_0(p0);
}
public static void h966_19(moom.Oo p0) throws Throwable {
    throw __call3096619_0(p0);
}
public static void h966_20(moom.Oo p0) throws Throwable {
    throw __call3096620_0(p0);
}
public static void h966_21(moom.Oo p0) throws Throwable {
    throw __call3096621_0(p0);
}
public static void h966_22(moom.Oo p0) throws Throwable {
    throw __call3096622_0(p0);
}
public static void h966_23(moom.Oo p0) throws Throwable {
    throw __call3096623_0(p0);
}
public static void h966_24(moom.Oo p0) throws Throwable {
    throw __call3096624_0(p0);
}
public static void h966_25(moom.Oo p0) throws Throwable {
    throw __call3096625_0(p0);
}
public static void h966_26(moom.Oo p0) throws Throwable {
    throw __call3096626_0(p0);
}
private static native long __fieldRead966_0() throws Throwable;
private static native int[] __call966_1() throws Throwable;
private static native com.moon.module.impl.AutoClicker __fieldRead966_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call966_3() throws Throwable;
private static native com.moon.fU __call966_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Class __classLiteral966_5() throws Throwable;
private static native com.moon.module.Module __call966_6(com.moon.fU a0, java.lang.Class a1) throws Throwable;
private static native com.moon.module.impl.AutoClicker __cast966_7(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite966_8(net.minecraft.client.Minecraft a0, com.moon.module.impl.AutoClicker a1) throws Throwable;
private static native com.moon.module.impl.AutoClicker __fieldRead966_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.module.impl.AutoClicker __fieldRead966_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call966_11(com.moon.module.impl.AutoClicker a0) throws Throwable;
private static native int __integerCategory966_12(boolean value) throws Throwable;
private static native com.moon.module.impl.AutoClicker __fieldRead966_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead966_14(com.moon.module.impl.AutoClicker a0) throws Throwable;
private static native java.lang.Object __call966_15(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast966_16(java.lang.Object a0) throws Throwable;
private static native boolean __call966_17(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory966_18(boolean value) throws Throwable;
private static native int __fieldRead966_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead966_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead966_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead966_22(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead966_23() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead966_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead966_25(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call966_26() throws Throwable;
private static native com.moon.events.EventBus __call966_27(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call966_28(com.moon.events.EventBus a0, com.moon.dM a1) throws Throwable;
private static native boolean __call966_29(com.moon.dM a0) throws Throwable;
private static native int __integerCategory966_30(boolean value) throws Throwable;
private static native com.moon.o4 __call966_31() throws Throwable;
private static native int __call966_32(com.moon.o4 a0) throws Throwable;
private static native int __invokedynamic966_33(int a0, long a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead966_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call966_35(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead966_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead966_37() throws Throwable;
private static native void __call966_38(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native moom.jI __fieldRead966_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call966_40(moom.jI a0) throws Throwable;
private static native int __integerCategory966_41(boolean value) throws Throwable;
private static native int __invokedynamic966_42(int a0, long a1) throws Throwable;
private static native void __fieldWrite966_43(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int[] __fieldRead966_44() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead966_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead966_46(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __call966_47(net.minecraft.util.MovingObjectPosition$MovingObjectType a0) throws Throwable;
private static native moom.jI __fieldRead966_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead966_49(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead966_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead966_51(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native void __call966_52(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead966_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call966_54(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead966_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call966_56(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call966_57(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call966_58(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead966_59() throws Throwable;
private static native moom.jI __fieldRead966_60(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead966_61(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.bs __fieldRead966_62(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native boolean __call966_63(moom.jI a0, moom.DT a1, moom.bs a2) throws Throwable;
private static native moom.jI __fieldRead966_64(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call966_65(moom.jI a0) throws Throwable;
private static native int __integerCategory966_66(boolean value) throws Throwable;
private static native int __invokedynamic966_67(int a0, long a1) throws Throwable;
private static native void __fieldWrite966_68(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native com.moon.o4 __call966_69() throws Throwable;
private static native int __call966_70(com.moon.o4 a0) throws Throwable;
private static native int __invokedynamic966_71(int a0, long a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead966_72(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call966_73(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.lang.Throwable __call3096600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096610_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096611_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096612_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096613_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096614_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096615_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096616_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096617_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096618_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096619_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096620_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096621_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096622_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096623_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096624_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096625_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3096626_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bde4c8cfda37ef2b9e17(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_bde4c8cfda37ef2b9e17 {

public static void f970(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forestValue970_20_0;
    int forestValue970_70_0;
    net.minecraft.item.ItemStack forestValue970_94_0;
    int forestValue970_97_0;
    int forestValue970_117_0;
    net.minecraft.item.ItemStack forestValue970_127_0;
    int forestValue970_145_0;
    int forestValue970_152_0;
    int forestValue970_160_0;
    net.minecraft.client.Minecraft forestValue970_180_0;
    boolean spill970_0;
    int spill970_1;
    boolean spill970_2;
    net.minecraft.item.ItemStack spill970_3;
    boolean spill970_4;
    net.minecraft.item.ItemStack spill970_5;
    int spill970_6;
    net.minecraft.client.Minecraft spill970_7;
    long life1_3;
    int[] life3_5;
    int life4_22;
    net.minecraft.item.ItemStack life5_27;
    moom.DT life6_89;
    int life7_108;
    net.minecraft.item.ItemStack life6_185;
    forest_join_183: {
    forest_join_180: {
    forest_join_160: {
    forest_join_159: {
    forest_join_155: {
    forest_join_152: {
    forest_join_145: {
    forest_join_143: {
    forest_join_127: {
    forest_join_126: {
    forest_join_121: {
    forest_join_117: {
    forest_join_97: {
    forest_join_96: {
    forest_join_94: {
    forest_join_77: {
    forest_join_70: {
    forest_join_62: {
    forest_join_45: {
    forest_join_36: {
    forest_join_34: {
    forest_join_20: {
    life1_3 = (__fieldRead970_0() ^ 6686190481323L);
    life3_5 = __call970_1();
    spill970_0 = __call970_3(__fieldRead970_2(receiver));
    if (!((life3_5 != null))) {
        forestValue970_20_0 = __integerCategory970_4(spill970_0);
        break forest_join_20;
    }
    if (!((!spill970_0))) {
        break forest_join_183;
    }
    __fieldWrite970_6(receiver, __invokedynamic970_5(18160, (6184857168013094611L ^ life1_3)));
    forestValue970_20_0 = 1;
    }
    life4_22 = forestValue970_20_0;
    life5_27 = __call970_9(__fieldRead970_8(__fieldRead970_7(receiver)));
    if (!((life3_5 != null))) {
        break forest_join_34;
    }
    if (!((__fieldRead970_10(receiver) == null))) {
        break forest_join_36;
    }
    __call970_12(__fieldRead970_11(), "Null returned as 'hitResult', this shouldn't happen!");
    }
    if (!((life3_5 == null))) {
        break forest_join_159;
    }
    }
    spill970_1 = (__fieldRead970_13())[__call970_16(__fieldRead970_15(__fieldRead970_14(receiver)))];
    if (!((life3_5 != null))) {
        forestValue970_160_0 = spill970_1;
        break forest_join_160;
    }
    switch (spill970_1) {
case 1:
{
        break forest_join_45;
    }
case 2:
{
        break forest_join_77;
    }
default:
{
        break forest_join_159;
    }
}
    }
    spill970_2 = __call970_22(__fieldRead970_17(receiver), __fieldRead970_18(receiver), __fieldRead970_20(__fieldRead970_19(receiver)), __fieldRead970_21(receiver));
    if (!((life3_5 != null))) {
        forestValue970_70_0 = __integerCategory970_23(spill970_2);
        break forest_join_70;
    }
    if (!(spill970_2)) {
        break forest_join_62;
    }
    life4_22 = 0;
    if (!((life3_5 == null))) {
        break forest_join_159;
    }
    }
    forestValue970_70_0 = __integerCategory970_29(__call970_28(__fieldRead970_24(receiver), __fieldRead970_25(receiver), __fieldRead970_27(__fieldRead970_26(receiver))));
    }
    if (!((life3_5 != null))) {
        forestValue970_160_0 = forestValue970_70_0;
        break forest_join_160;
    }
    if (!((forestValue970_70_0 != 0))) {
        break forest_join_159;
    }
    life4_22 = 0;
    if (!((life3_5 == null))) {
        break forest_join_159;
    }
    }
    life6_89 = __call970_31(__fieldRead970_30(receiver));
    if (!((__call970_35(__call970_34(__call970_33(__fieldRead970_32(receiver), life6_89))) != __fieldRead970_36()))) {
        break forest_join_159;
    }
    spill970_3 = life5_27;
    if (!((life3_5 != null))) {
        forestValue970_94_0 = spill970_3;
        break forest_join_94;
    }
    if (!((spill970_3 != null))) {
        break forest_join_96;
    }
    forestValue970_94_0 = life5_27;
    }
    forestValue970_97_0 = __fieldRead970_37(forestValue970_94_0);
    break forest_join_97;
    }
    forestValue970_97_0 = 0;
    }
    life7_108 = forestValue970_97_0;
    spill970_4 = __call970_45(__fieldRead970_38(receiver), __fieldRead970_39(receiver), __fieldRead970_40(receiver), life5_27, life6_89, __fieldRead970_42(__fieldRead970_41(receiver)), __fieldRead970_44(__fieldRead970_43(receiver)));
    if (!((life3_5 != null))) {
        forestValue970_117_0 = __integerCategory970_46(spill970_4);
        break forest_join_117;
    }
    if (!(spill970_4)) {
        break forest_join_121;
    }
    forestValue970_117_0 = 0;
    }
    life4_22 = forestValue970_117_0;
    __call970_48(__fieldRead970_47(receiver));
    }
    spill970_5 = life5_27;
    if (!((life3_5 != null))) {
        forestValue970_127_0 = spill970_5;
        break forest_join_127;
    }
    if (!((spill970_5 == null))) {
        break forest_join_126;
    }
    return;
    }
    forestValue970_127_0 = life5_27;
    }
    spill970_6 = __fieldRead970_49(forestValue970_127_0);
    if (!((life3_5 != null))) {
        forestValue970_145_0 = spill970_6;
        break forest_join_145;
    }
    if (!((spill970_6 == 0))) {
        break forest_join_143;
    }
    (__fieldRead970_52(__fieldRead970_51(__fieldRead970_50(receiver))))[__fieldRead970_55(__fieldRead970_54(__fieldRead970_53(receiver)))] = null;
    if (!((life3_5 == null))) {
        break forest_join_159;
    }
    }
    forestValue970_145_0 = __fieldRead970_56(life5_27);
    }
    if (!((life3_5 != null))) {
        forestValue970_152_0 = forestValue970_145_0;
        break forest_join_152;
    }
    if (!((forestValue970_145_0 == life7_108))) {
        break forest_join_155;
    }
    forestValue970_152_0 = __integerCategory970_59(__call970_58(__fieldRead970_57(receiver)));
    }
    if (!((life3_5 != null))) {
        forestValue970_160_0 = forestValue970_152_0;
        break forest_join_160;
    }
    if (!((forestValue970_152_0 != 0))) {
        break forest_join_159;
    }
    }
    __call970_62(__fieldRead970_61(__fieldRead970_60(receiver)));
    }
    forestValue970_160_0 = life4_22;
    }
    if (!((forestValue970_160_0 != 0))) {
        break forest_join_183;
    }
    life6_185 = __call970_65(__fieldRead970_64(__fieldRead970_63(receiver)));
    if (!((life6_185 != null))) {
        break forest_join_183;
    }
    spill970_7 = receiver;
    if (!((life3_5 != null))) {
        forestValue970_180_0 = spill970_7;
        break forest_join_180;
    }
    if (!(__call970_69(__fieldRead970_66(spill970_7), __fieldRead970_67(receiver), __fieldRead970_68(receiver), life6_185))) {
        break forest_join_183;
    }
    forestValue970_180_0 = receiver;
    }
    __call970_72(__fieldRead970_71(__fieldRead970_70(forestValue970_180_0)));
    }
    return;
}
public static void h970_0(moom.Oo p0) throws Throwable {
    throw __call3097000_0(p0);
}
public static void h970_1(moom.Oo p0) throws Throwable {
    throw __call3097001_0(p0);
}
public static void h970_2(moom.Oo p0) throws Throwable {
    throw __call3097002_0(p0);
}
public static void h970_3(moom.Oo p0) throws Throwable {
    throw __call3097003_0(p0);
}
public static void h970_4(moom.Oo p0) throws Throwable {
    throw __call3097004_0(p0);
}
public static void h970_5(moom.Oo p0) throws Throwable {
    throw __call3097005_0(p0);
}
public static void h970_6(moom.Oo p0) throws Throwable {
    throw __call3097006_0(p0);
}
public static void h970_7(moom.Oo p0) throws Throwable {
    throw __call3097007_0(p0);
}
public static void h970_8(moom.Oo p0) throws Throwable {
    throw __call3097008_0(p0);
}
public static void h970_9(moom.Oo p0) throws Throwable {
    throw __call3097009_0(p0);
}
public static void h970_10(moom.Oo p0) throws Throwable {
    throw __call3097010_0(p0);
}
public static void h970_11(moom.Oo p0) throws Throwable {
    throw __call3097011_0(p0);
}
public static void h970_12(moom.Oo p0) throws Throwable {
    throw __call3097012_0(p0);
}
public static void h970_13(moom.Oo p0) throws Throwable {
    throw __call3097013_0(p0);
}
public static void h970_14(moom.Oo p0) throws Throwable {
    throw __call3097014_0(p0);
}
public static void h970_15(moom.Oo p0) throws Throwable {
    throw __call3097015_0(p0);
}
public static void h970_16(moom.Oo p0) throws Throwable {
    throw __call3097016_0(p0);
}
public static void h970_17(moom.Oo p0) throws Throwable {
    throw __call3097017_0(p0);
}
public static void h970_18(moom.Oo p0) throws Throwable {
    throw __call3097018_0(p0);
}
public static void h970_19(moom.Oo p0) throws Throwable {
    throw __call3097019_0(p0);
}
public static void h970_20(moom.Oo p0) throws Throwable {
    throw __call3097020_0(p0);
}
public static void h970_21(moom.Oo p0) throws Throwable {
    throw __call3097021_0(p0);
}
public static void h970_22(moom.Oo p0) throws Throwable {
    throw __call3097022_0(p0);
}
public static void h970_23(moom.Oo p0) throws Throwable {
    throw __call3097023_0(p0);
}
private static native long __fieldRead970_0() throws Throwable;
private static native int[] __call970_1() throws Throwable;
private static native moom.jI __fieldRead970_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call970_3(moom.jI a0) throws Throwable;
private static native int __integerCategory970_4(boolean value) throws Throwable;
private static native int __invokedynamic970_5(int a0, long a1) throws Throwable;
private static native void __fieldWrite970_6(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead970_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead970_8(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call970_9(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead970_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead970_11() throws Throwable;
private static native void __call970_12(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native int[] __fieldRead970_13() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead970_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead970_15(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __call970_16(net.minecraft.util.MovingObjectPosition$MovingObjectType a0) throws Throwable;
private static native moom.jI __fieldRead970_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead970_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead970_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead970_20(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead970_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call970_22(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1, net.minecraft.entity.Entity a2, net.minecraft.util.MovingObjectPosition a3) throws Throwable;
private static native int __integerCategory970_23(boolean value) throws Throwable;
private static native moom.jI __fieldRead970_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead970_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead970_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead970_27(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native boolean __call970_28(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1, net.minecraft.entity.Entity a2) throws Throwable;
private static native int __integerCategory970_29(boolean value) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead970_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call970_31(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead970_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call970_33(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call970_34(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call970_35(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead970_36() throws Throwable;
private static native int __fieldRead970_37(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.jI __fieldRead970_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead970_39(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead970_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead970_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.bs __fieldRead970_42(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead970_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DR __fieldRead970_44(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native boolean __call970_45(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1, net.minecraft.client.multiplayer.WorldClient a2, net.minecraft.item.ItemStack a3, moom.DT a4, moom.bs a5, moom.DR a6) throws Throwable;
private static native int __integerCategory970_46(boolean value) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead970_47(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call970_48(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __fieldRead970_49(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead970_50(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead970_51(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack[] __fieldRead970_52(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead970_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead970_54(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __fieldRead970_55(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native int __fieldRead970_56(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.jI __fieldRead970_57(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call970_58(moom.jI a0) throws Throwable;
private static native int __integerCategory970_59(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead970_60(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.lm __fieldRead970_61(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call970_62(moom.lm a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead970_63(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead970_64(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call970_65(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.jI __fieldRead970_66(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead970_67(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead970_68(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call970_69(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1, net.minecraft.client.multiplayer.WorldClient a2, net.minecraft.item.ItemStack a3) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead970_70(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.lm __fieldRead970_71(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native void __call970_72(moom.lm a0) throws Throwable;
private static native java.lang.Throwable __call3097000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097021_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097022_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3097023_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_680d1de31633c7d095f1(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_680d1de31633c7d095f1 {

public static void f543(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.Minecraft forestValue543_13_0;
    int forestValue543_13_1;
    net.minecraft.client.Minecraft forestValue543_14_0;
    net.minecraft.client.Minecraft forestValue543_15_0;
    int forestValue543_15_1;
    net.minecraft.client.Minecraft forestValue543_51_0;
    int forestValue543_66_0;
    net.minecraft.client.Minecraft forestValue543_71_0;
    net.minecraft.client.Minecraft forestValue543_84_0;
    net.minecraft.client.Minecraft spill543_0;
    boolean spill543_1;
    net.minecraft.client.Minecraft spill543_2;
    int spill543_3;
    net.minecraft.client.Minecraft spill543_4;
    long life1_3;
    int[] life3_5;
    forest_join_85: {
    forest_join_84: {
    forest_join_83: {
    forest_join_71: {
    forest_join_70: {
    forest_join_66: {
    forest_join_62: {
    forest_join_54: {
    forest_join_51: {
    forest_join_38: {
    forest_join_15: {
    forest_join_14: {
    forest_join_13: {
    life1_3 = (__fieldRead543_0() ^ 49729387249798L);
    life3_5 = __call543_1();
    spill543_0 = receiver;
    spill543_1 = __fieldRead543_2(receiver);
    if (!((life3_5 != null))) {
        forestValue543_13_0 = spill543_0;
        forestValue543_13_1 = __integerCategory543_3(spill543_1);
        break forest_join_13;
    }
    if (!((!spill543_1))) {
        forestValue543_14_0 = spill543_0;
        break forest_join_14;
    }
    forestValue543_13_0 = spill543_0;
    forestValue543_13_1 = 1;
    }
    forestValue543_15_0 = forestValue543_13_0;
    forestValue543_15_1 = forestValue543_13_1;
    break forest_join_15;
    }
    forestValue543_15_0 = forestValue543_14_0;
    forestValue543_15_1 = 0;
    }
    __fieldWrite543_4(forestValue543_15_0, forestValue543_15_1);
    __fieldWrite543_7(__fieldRead543_5(receiver), __fieldRead543_6(receiver));
    spill543_2 = receiver;
    if (!((life3_5 != null))) {
        forestValue543_51_0 = spill543_2;
        break forest_join_51;
    }
    if (!(__fieldRead543_8(spill543_2))) {
        break forest_join_38;
    }
    __call543_9(receiver);
    __fieldWrite543_12(receiver, __call543_11(__call543_10()));
    __fieldWrite543_15(receiver, __call543_14(__call543_13()));
    if (!((life3_5 == null))) {
        break forest_join_54;
    }
    }
    __call543_18(new org.lwjgl.opengl.DisplayMode(__fieldRead543_16(receiver), __fieldRead543_17(receiver)));
    __fieldWrite543_20(receiver, __fieldRead543_19(receiver));
    forestValue543_51_0 = receiver;
    }
    __fieldWrite543_22(forestValue543_51_0, __fieldRead543_21(receiver));
    }
    spill543_3 = __fieldRead543_23(receiver);
    if (!((life3_5 != null))) {
        forestValue543_66_0 = spill543_3;
        break forest_join_66;
    }
    if (!((spill543_3 <= 0))) {
        break forest_join_62;
    }
    __fieldWrite543_24(receiver, 1);
    }
    spill543_4 = receiver;
    if (!((life3_5 != null))) {
        forestValue543_71_0 = spill543_4;
        break forest_join_71;
    }
    forestValue543_66_0 = __fieldRead543_25(spill543_4);
    }
    if (!((forestValue543_66_0 <= 0))) {
        break forest_join_70;
    }
    __fieldWrite543_26(receiver, 1);
    }
    forestValue543_71_0 = receiver;
    }
    if (!((life3_5 != null))) {
        forestValue543_84_0 = forestValue543_71_0;
        break forest_join_84;
    }
    if (!((__fieldRead543_27(forestValue543_71_0) != null))) {
        break forest_join_83;
    }
    __call543_30(receiver, __fieldRead543_28(receiver), __fieldRead543_29(receiver));
    if (!((life3_5 == null))) {
        break forest_join_85;
    }
    }
    forestValue543_84_0 = receiver;
    }
    __call543_31(forestValue543_84_0);
    }
    __call543_33(__fieldRead543_32(receiver));
    __call543_36(__fieldRead543_35(__fieldRead543_34(receiver)));
    __call543_39(__call543_38(__call543_37()), new com.moon.eS());
    __call543_40(receiver);
    return;
}
public static void h543_0(java.lang.Exception p0) throws Throwable {
    throw __call3054300_0(p0);
}
public static void h543_1(java.lang.Exception p0) throws Throwable {
    throw __call3054301_0(p0);
}
public static void h543_2(java.lang.Exception p0) throws Throwable {
    throw __call3054302_0(p0);
}
public static void h543_3(java.lang.Exception p0) throws Throwable {
    throw __call3054303_0(p0);
}
public static void h543_4(java.lang.Exception p0) throws Throwable {
    throw __call3054304_0(p0);
}
public static void h543_5(java.lang.Exception p0) throws Throwable {
    throw __call3054305_0(p0);
}
public static void h543_6(java.lang.Exception p0) throws Throwable {
    throw __call3054306_0(p0);
}
public static void h543_7(java.lang.Exception p0) throws Throwable {
    throw __call3054307_0(p0);
}
public static void h543_8(java.lang.Exception p0) throws Throwable {
    throw __call3054308_0(p0);
}
public static void h543_9(java.lang.Exception p0) throws Throwable {
    throw __call3054309_0(p0);
}
public static void h543_10(java.lang.Exception p0) throws Throwable {
    throw __call3054310_0(p0);
}
public static void h543_11(java.lang.Exception p0) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3054311_1(__fieldRead3054311_0(), "Couldn't toggle fullscreen", life1_2);
    return;
}
private static native long __fieldRead543_0() throws Throwable;
private static native int[] __call543_1() throws Throwable;
private static native boolean __fieldRead543_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory543_3(boolean value) throws Throwable;
private static native void __fieldWrite543_4(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead543_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead543_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite543_7(net.minecraft.client.settings.GameSettings a0, boolean a1) throws Throwable;
private static native boolean __fieldRead543_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call543_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call543_10() throws Throwable;
private static native int __call543_11(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native void __fieldWrite543_12(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native org.lwjgl.opengl.DisplayMode __call543_13() throws Throwable;
private static native int __call543_14(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native void __fieldWrite543_15(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __fieldRead543_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead543_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call543_18(org.lwjgl.opengl.DisplayMode a0) throws Throwable;
private static native int __fieldRead543_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite543_20(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __fieldRead543_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite543_22(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __fieldRead543_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite543_24(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __fieldRead543_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite543_26(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead543_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead543_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead543_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call543_30(net.minecraft.client.Minecraft a0, int a1, int a2) throws Throwable;
private static native void __call543_31(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead543_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call543_33(boolean a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead543_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead543_35(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __call543_36(boolean a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call543_37() throws Throwable;
private static native com.moon.events.EventBus __call543_38(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call543_39(com.moon.events.EventBus a0, com.moon.eS a1) throws Throwable;
private static native void __call543_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Throwable __call3054300_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054301_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054302_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054303_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054304_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054305_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054306_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054307_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054308_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054309_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3054310_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3054311_0() throws Throwable;
private static native void __call3054311_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c78864da5a55346cb76e(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_c78864da5a55346cb76e {

public static void f1288(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.renderer.EntityRenderer forwardValue1288_20_0;
    int[] spill1288_0;
    net.minecraft.client.renderer.EntityRenderer spill1288_1;
    long life1_3;
    int[] life3_12;
    forward_join_25: {
    forward_join_20: {
    life1_3 = (__fieldRead1288_0() ^ 59304882335236L);
    spill1288_0 = __call1288_1();
    __call1288_5(__fieldRead1288_2(receiver), __fieldRead1288_3(receiver), __fieldRead1288_4(receiver));
    life3_12 = spill1288_0;
    spill1288_1 = __fieldRead1288_6(receiver);
    if (!((life3_12 != null))) {
        forwardValue1288_20_0 = spill1288_1;
        break forward_join_20;
    }
    if (!((spill1288_1 != null))) {
        break forward_join_25;
    }
    forwardValue1288_20_0 = __fieldRead1288_7(receiver);
    }
    __call1288_10(forwardValue1288_20_0, __fieldRead1288_8(receiver), __fieldRead1288_9(receiver));
    }
    return;
}
public static void h1288_0(moom.Oo p0) throws Throwable {
    throw __call1128800_0(p0);
}
public static void h1288_1(moom.Oo p0) throws Throwable {
    throw __call1128801_0(p0);
}
private static native long __fieldRead1288_0() throws Throwable;
private static native int[] __call1288_1() throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead1288_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1288_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1288_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1288_5(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead1288_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead1288_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1288_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1288_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1288_10(net.minecraft.client.renderer.EntityRenderer a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1128800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e41db4bb41bca0b9b69e(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_e41db4bb41bca0b9b69e {

public static void f544(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forestValue544_21_0;
    int forestValue544_23_0;
    int forestValue544_41_0;
    int forestValue544_60_0;
    net.minecraft.client.Minecraft forestValue544_76_0;
    int forestValue544_79_0;
    net.minecraft.client.Minecraft forestValue544_84_0;
    int forestValue544_111_0;
    net.minecraft.client.Minecraft forestValue544_125_0;
    net.minecraft.client.gui.GuiScreen forestValue544_126_0;
    net.minecraft.client.Minecraft forestValue544_145_0;
    net.minecraft.client.gui.GuiScreen forestValue544_146_0;
    net.minecraft.client.gui.GuiScreen forestValue544_158_0;
    net.minecraft.client.gui.GuiScreen forestValue544_163_0;
    net.minecraft.client.gui.GuiScreen forestValue544_171_0;
    java.util.List forestValue544_197_0;
    int forestValue544_223_0;
    int forestValue544_227_0;
    net.minecraft.client.Minecraft forestValue544_231_0;
    net.minecraft.client.gui.GuiScreen forestValue544_234_0;
    net.minecraft.client.Minecraft forestValue544_242_0;
    int forestValue544_245_0;
    int forestValue544_274_0;
    int forestValue544_291_0;
    net.minecraft.client.Minecraft forestValue544_302_0;
    int forestValue544_344_0;
    int forestValue544_350_0;
    int forestValue544_370_0;
    int forestValue544_370_1;
    int forestValue544_371_0;
    int forestValue544_388_0;
    int forestValue544_398_0;
    int forestValue544_404_0;
    int forestValue544_406_0;
    net.minecraft.client.Minecraft forestValue544_423_0;
    net.minecraft.client.entity.EntityPlayerSP forestValue544_444_0;
    int forestValue544_458_0;
    net.minecraft.client.gui.GuiScreen forestValue544_465_0;
    net.minecraft.client.gui.GuiScreen forestValue544_470_0;
    int forestValue544_477_0;
    net.minecraft.client.Minecraft forestValue544_485_0;
    int forestValue544_507_0;
    int forestValue544_509_0;
    int forestValue544_535_0;
    int forestValue544_558_0;
    int forestValue544_567_0;
    int forestValue544_585_0;
    int forestValue544_603_0;
    int forestValue544_607_0;
    net.minecraft.client.Minecraft forestValue544_622_0;
    net.minecraft.client.gui.GuiScreen forestValue544_628_0;
    int forestValue544_644_0;
    int forestValue544_644_1;
    net.minecraft.client.gui.GuiIngame forestValue544_663_0;
    int forestValue544_666_0;
    int forestValue544_671_0;
    int forestValue544_671_1;
    int forestValue544_686_0;
    int forestValue544_691_0;
    int forestValue544_691_1;
    int forestValue544_706_0;
    int forestValue544_711_0;
    int forestValue544_711_1;
    net.minecraft.client.settings.GameSettings forestValue544_731_0;
    net.minecraft.client.settings.GameSettings$Options forestValue544_731_1;
    int forestValue544_731_2;
    net.minecraft.client.settings.GameSettings forestValue544_732_0;
    net.minecraft.client.settings.GameSettings$Options forestValue544_732_1;
    net.minecraft.client.settings.GameSettings forestValue544_733_0;
    net.minecraft.client.settings.GameSettings$Options forestValue544_733_1;
    int forestValue544_733_2;
    int forestValue544_735_0;
    int forestValue544_740_0;
    int forestValue544_740_1;
    int forestValue544_756_0;
    int forestValue544_761_0;
    int forestValue544_761_1;
    net.minecraft.client.settings.GameSettings forestValue544_782_0;
    int forestValue544_782_1;
    net.minecraft.client.settings.GameSettings forestValue544_783_0;
    net.minecraft.client.settings.GameSettings forestValue544_784_0;
    int forestValue544_784_1;
    int forestValue544_789_0;
    int forestValue544_794_0;
    int forestValue544_794_1;
    net.minecraft.client.renderer.entity.RenderManager forestValue544_815_0;
    int forestValue544_815_1;
    net.minecraft.client.renderer.entity.RenderManager forestValue544_816_0;
    net.minecraft.client.renderer.entity.RenderManager forestValue544_817_0;
    int forestValue544_817_1;
    int forestValue544_819_0;
    int forestValue544_824_0;
    int forestValue544_824_1;
    net.minecraft.client.settings.GameSettings forestValue544_845_0;
    int forestValue544_845_1;
    net.minecraft.client.settings.GameSettings forestValue544_846_0;
    net.minecraft.client.settings.GameSettings forestValue544_847_0;
    int forestValue544_847_1;
    int forestValue544_852_0;
    int forestValue544_857_0;
    int forestValue544_857_1;
    net.minecraft.client.settings.GameSettings forestValue544_869_0;
    int forestValue544_869_1;
    net.minecraft.client.settings.GameSettings forestValue544_870_0;
    net.minecraft.client.settings.GameSettings forestValue544_871_0;
    int forestValue544_871_1;
    int forestValue544_880_0;
    int forestValue544_880_1;
    net.minecraft.client.settings.GameSettings forestValue544_890_0;
    int forestValue544_890_1;
    net.minecraft.client.settings.GameSettings forestValue544_891_0;
    net.minecraft.client.settings.GameSettings forestValue544_892_0;
    int forestValue544_892_1;
    int forestValue544_905_0;
    int forestValue544_929_0;
    int forestValue544_944_0;
    net.minecraft.client.Minecraft forestValue544_951_0;
    int forestValue544_957_0;
    net.minecraft.client.settings.GameSettings forestValue544_969_0;
    int forestValue544_969_1;
    net.minecraft.client.settings.GameSettings forestValue544_970_0;
    net.minecraft.client.settings.GameSettings forestValue544_971_0;
    int forestValue544_971_1;
    int forestValue544_975_0;
    int forestValue544_981_0;
    int forestValue544_985_0;
    int forestValue544_997_0;
    int forestValue544_1035_0;
    int forestValue544_1059_0;
    net.minecraft.client.Minecraft forestValue544_1061_0;
    int forestValue544_1091_0;
    int forestValue544_1091_1;
    int forestValue544_1108_0;
    net.minecraft.client.Minecraft forestValue544_1110_0;
    int forestValue544_1155_0;
    net.minecraft.client.Minecraft forestValue544_1182_0;
    net.minecraft.client.entity.EntityPlayerSP forestValue544_1205_0;
    int forestValue544_1211_0;
    net.minecraft.client.entity.EntityPlayerSP forestValue544_1222_0;
    int forestValue544_1233_0;
    net.minecraft.client.Minecraft forestValue544_1274_0;
    int forestValue544_1281_0;
    int forestValue544_1341_0;
    int forestValue544_1368_0;
    int forestValue544_1416_0;
    int forestValue544_1476_0;
    int forestValue544_1511_0;
    net.minecraft.client.Minecraft forestValue544_1550_0;
    net.minecraft.client.Minecraft forestValue544_1556_0;
    net.minecraft.client.Minecraft forestValue544_1556_1;
    net.minecraft.client.Minecraft forestValue544_1566_0;
    net.minecraft.client.Minecraft forestValue544_1568_0;
    int forestValue544_1568_1;
    net.minecraft.client.Minecraft forestValue544_1572_0;
    int forestValue544_1572_1;
    net.minecraft.client.Minecraft forestValue544_1573_0;
    net.minecraft.client.Minecraft forestValue544_1574_0;
    int forestValue544_1574_1;
    net.minecraft.client.Minecraft forestValue544_1576_0;
    net.minecraft.client.Minecraft forestValue544_1614_0;
    int forestValue544_1615_0;
    int forestValue544_1627_0;
    int forestValue544_1639_0;
    net.minecraft.client.multiplayer.WorldClient forestValue544_1658_0;
    net.minecraft.client.Minecraft forestValue544_1662_0;
    int forestValue544_1664_0;
    int forestValue544_1674_0;
    net.minecraft.client.Minecraft forestValue544_1682_0;
    net.minecraft.client.multiplayer.WorldClient forestValue544_1700_0;
    net.minecraft.client.multiplayer.WorldClient forestValue544_1701_0;
    int forestValue544_1701_1;
    int forestValue544_1712_0;
    net.minecraft.client.Minecraft forestValue544_1740_0;
    int forestValue544_1743_0;
    net.minecraft.client.Minecraft forestValue544_1750_0;
    net.minecraft.client.Minecraft forestValue544_1765_0;
    int[] spill544_0;
    int spill544_1;
    int spill544_2;
    net.minecraft.client.Minecraft spill544_3;
    net.minecraft.client.gui.GuiScreen spill544_4;
    net.minecraft.client.Minecraft spill544_5;
    int spill544_6;
    net.minecraft.client.Minecraft spill544_7;
    net.minecraft.client.Minecraft spill544_8;
    net.minecraft.client.gui.GuiScreen spill544_9;
    net.minecraft.client.Minecraft spill544_10;
    net.minecraft.client.gui.GuiScreen spill544_11;
    net.minecraft.client.Minecraft spill544_12;
    net.minecraft.client.gui.GuiScreen spill544_13;
    java.util.List spill544_14;
    boolean spill544_15;
    net.minecraft.client.Minecraft spill544_16;
    int spill544_17;
    int spill544_18;
    net.minecraft.client.Minecraft spill544_19;
    int spill544_20;
    net.minecraft.client.Minecraft spill544_21;
    int spill544_22;
    int spill544_23;
    int spill544_24;
    int spill544_25;
    int spill544_26;
    int spill544_27;
    net.minecraft.client.entity.EntityPlayerSP spill544_28;
    int spill544_29;
    net.minecraft.client.Minecraft spill544_30;
    net.minecraft.client.gui.GuiScreen spill544_31;
    boolean spill544_32;
    net.minecraft.client.Minecraft spill544_33;
    int spill544_34;
    int spill544_35;
    int spill544_36;
    int spill544_37;
    boolean spill544_38;
    net.minecraft.client.Minecraft spill544_39;
    net.minecraft.client.gui.GuiScreen spill544_40;
    int spill544_41;
    int spill544_42;
    boolean spill544_43;
    net.minecraft.client.gui.GuiIngame spill544_44;
    boolean spill544_45;
    boolean spill544_46;
    boolean spill544_47;
    net.minecraft.client.settings.GameSettings spill544_48;
    net.minecraft.client.settings.GameSettings$Options spill544_49;
    boolean spill544_50;
    boolean spill544_51;
    boolean spill544_52;
    net.minecraft.client.settings.GameSettings spill544_53;
    boolean spill544_54;
    boolean spill544_55;
    net.minecraft.client.renderer.entity.RenderManager spill544_56;
    boolean spill544_57;
    boolean spill544_58;
    net.minecraft.client.settings.GameSettings spill544_59;
    boolean spill544_60;
    net.minecraft.client.settings.GameSettings spill544_61;
    boolean spill544_62;
    int spill544_63;
    net.minecraft.client.settings.GameSettings spill544_64;
    boolean spill544_65;
    int spill544_66;
    net.minecraft.client.Minecraft spill544_67;
    net.minecraft.client.settings.GameSettings spill544_68;
    boolean spill544_69;
    int spill544_70;
    int spill544_71;
    boolean spill544_72;
    net.minecraft.client.Minecraft spill544_73;
    boolean spill544_74;
    net.minecraft.client.Minecraft spill544_75;
    int spill544_76;
    int spill544_77;
    net.minecraft.client.Minecraft spill544_78;
    boolean spill544_79;
    net.minecraft.client.entity.EntityPlayerSP spill544_80;
    boolean spill544_81;
    net.minecraft.client.entity.EntityPlayerSP spill544_82;
    boolean spill544_83;
    boolean spill544_84;
    int spill544_85;
    boolean spill544_86;
    int spill544_87;
    net.minecraft.client.Minecraft spill544_88;
    boolean spill544_89;
    boolean spill544_90;
    boolean spill544_91;
    boolean spill544_92;
    boolean spill544_93;
    boolean spill544_94;
    boolean spill544_95;
    boolean spill544_96;
    boolean spill544_97;
    boolean spill544_98;
    boolean spill544_99;
    boolean spill544_100;
    boolean spill544_101;
    boolean spill544_102;
    net.minecraft.client.Minecraft spill544_103;
    net.minecraft.client.Minecraft spill544_104;
    net.minecraft.client.Minecraft spill544_105;
    net.minecraft.client.Minecraft spill544_106;
    boolean spill544_107;
    int spill544_108;
    net.minecraft.client.Minecraft spill544_109;
    int spill544_110;
    net.minecraft.client.multiplayer.WorldClient spill544_111;
    net.minecraft.client.Minecraft spill544_112;
    boolean spill544_113;
    net.minecraft.client.multiplayer.WorldClient spill544_114;
    net.minecraft.client.Minecraft spill544_115;
    long life1_3;
    com.moon.event.TickEvent life4_9;
    int[] life3_10;
    int life5_28;
    int life6_256;
    java.util.Iterator life7_292;
    java.lang.String life8_301;
    int life7_382;
    int life8_386;
    int life7_431;
    int life8_435;
    int life7_464;
    int life8_466;
    int life9_468;
    com.moon.eJ life10_491;
    long life10_547;
    int life12_563;
    float life13_628;
    int life7_742;
    int life8_747;
    com.moon.eI life9_753;
    int life10_1458;
    int life7_1507;
    com.moon.dN life8_1558;
    com.moon.dN life8_1625;
    int life7_1668;
    com.moon.eu life8_1856;
    com.moon.d0 life9_1906;
    com.moon.d0 life9_1935;
    com.moon.d1 life9_1960;
    com.moon.d1 life9_1996;
    com.moon.dP life9_2060;
    com.moon.d0 life10_2076;
    com.moon.dP life9_2096;
    com.moon.d0 life10_2112;
    forest_join_1765: {
    forest_join_1761: {
    forest_join_1750: {
    forest_join_1749: {
    forest_join_1743: {
    forest_join_1740: {
    forest_join_1735: {
    forest_join_1712: {
    forest_join_1706: {
    forest_join_1701: {
    forest_join_1700: {
    forest_join_1682: {
    forest_join_1681: {
    forest_join_1674: {
    forest_join_1670: {
    forest_join_1664: {
    forest_join_1662: {
    forest_join_1661: {
    forest_join_1658: {
    forest_join_1656: {
    forest_join_1639: {
    forest_join_1633: {
    forest_join_1627: {
    forest_join_1621: {
    forest_join_1615: {
    forest_join_1614: {
    forest_join_1609: {
    forest_join_1576: {
    forest_join_1575: {
    forest_join_1574: {
    forest_join_1573: {
    forest_join_1572: {
    forest_join_1568: {
    forest_join_1566: {
    forest_join_1556: {
    forest_join_1550: {
    forest_join_1549: {
    forest_join_1529: {
    forest_join_1523: {
    forest_join_1517: {
    forest_join_1511: {
    forest_join_1476: {
    forest_join_1442: {
    forest_join_1441: {
    forest_join_1430: {
    forest_join_1429: {
    forest_join_1416: {
    forest_join_1393: {
    forest_join_1392: {
    forest_join_1368: {
    forest_join_1341: {
    forest_join_1315: {
    forest_join_1288: {
    forest_join_1281: {
    forest_join_1274: {
    forest_join_1268: {
    forest_join_1252: {
    forest_join_1251: {
    forest_join_1233: {
    forest_join_1211: {
    forest_join_1190: {
    forest_join_1155: {
    forest_join_1154: {
    forest_join_1147: {
    forest_join_1091: {
    forest_join_1035: {
    forest_join_1034: {
    forest_join_1023: {
    forest_join_485: {
    forest_join_484: {
    forest_join_477: {
    forest_join_473: {
    forest_join_302: {
    forest_join_301: {
    forest_join_291: {
    forest_join_274: {
    forest_join_268: {
    forest_join_245: {
    forest_join_242: {
    forest_join_241: {
    forest_join_234: {
    forest_join_231: {
    forest_join_230: {
    forest_join_197: {
    forest_join_172: {
    forest_join_171: {
    forest_join_163: {
    forest_join_158: {
    forest_join_156: {
    forest_join_146: {
    forest_join_145: {
    forest_join_144: {
    forest_join_126: {
    forest_join_125: {
    forest_join_124: {
    forest_join_111: {
    forest_join_106: {
    forest_join_84: {
    forest_join_83: {
    forest_join_79: {
    forest_join_76: {
    forest_join_71: {
    forest_join_60: {
    forest_join_47: {
    forest_join_41: {
    forest_join_35: {
    forest_join_23: {
    forest_join_22: {
    forest_join_21: {
    life1_3 = (__fieldRead544_0() ^ 118819218334320L);
    spill544_0 = __call544_1();
    life4_9 = new com.moon.event.TickEvent(__fieldRead544_2());
    life3_10 = spill544_0;
    __call544_5(__call544_4(__call544_3()), life4_9);
    spill544_1 = __call544_6(life4_9);
    if (!((life3_10 != null))) {
        forestValue544_21_0 = spill544_1;
        break forest_join_21;
    }
    if (!((spill544_1 > 0))) {
        break forest_join_22;
    }
    forestValue544_21_0 = 1;
    }
    forestValue544_23_0 = forestValue544_21_0;
    break forest_join_23;
    }
    forestValue544_23_0 = 0;
    }
    life5_28 = forestValue544_23_0;
    spill544_2 = __fieldRead544_7(receiver);
    if (!((life3_10 != null))) {
        forestValue544_41_0 = spill544_2;
        break forest_join_41;
    }
    if (!((spill544_2 > 0))) {
        break forest_join_35;
    }
    net.minecraft.client.Minecraft __stackOp544_8_0 = receiver;
    __fieldWrite544_10(__stackOp544_8_0, (__fieldRead544_9(__stackOp544_8_0) - 1));
    }
    __call544_12(__fieldRead544_11(receiver), "gui");
    forestValue544_41_0 = __integerCategory544_14(__fieldRead544_13(receiver));
    }
    if (!((life3_10 != null))) {
        forestValue544_60_0 = forestValue544_41_0;
        break forest_join_60;
    }
    if (!((forestValue544_41_0 == 0))) {
        break forest_join_47;
    }
    __call544_16(__fieldRead544_15(receiver));
    }
    __call544_18(__fieldRead544_17(receiver));
    __call544_20(__fieldRead544_19(receiver), 0x1.0p0f);
    __call544_22(__fieldRead544_21(receiver), "gameMode");
    forestValue544_60_0 = __integerCategory544_24(__fieldRead544_23(receiver));
    }
    if (!((life3_10 != null))) {
        forestValue544_79_0 = forestValue544_60_0;
        break forest_join_79;
    }
    if (!((forestValue544_60_0 == 0))) {
        break forest_join_71;
    }
    spill544_3 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_76_0 = spill544_3;
        break forest_join_76;
    }
    if (!((__fieldRead544_25(spill544_3) != null))) {
        break forest_join_71;
    }
    __call544_27(__fieldRead544_26(receiver));
    }
    __call544_29(__fieldRead544_28(receiver), "textures");
    forestValue544_76_0 = receiver;
    }
    if (!((life3_10 != null))) {
        forestValue544_84_0 = forestValue544_76_0;
        break forest_join_84;
    }
    forestValue544_79_0 = __integerCategory544_31(__fieldRead544_30(forestValue544_76_0));
    }
    if (!((forestValue544_79_0 == 0))) {
        break forest_join_83;
    }
    __call544_33(__fieldRead544_32(receiver));
    }
    forestValue544_84_0 = receiver;
    }
    spill544_4 = __fieldRead544_34(forestValue544_84_0);
    if (!((life3_10 != null))) {
        forestValue544_126_0 = spill544_4;
        break forest_join_126;
    }
    if (!((spill544_4 == null))) {
        break forest_join_124;
    }
    spill544_5 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_125_0 = spill544_5;
        break forest_join_125;
    }
    if (!((__fieldRead544_35(spill544_5) != null))) {
        break forest_join_124;
    }
    spill544_6 = __numericCompare544_38(__call544_37(__fieldRead544_36(receiver)), 0x0.0p0f);
    if (!((life3_10 != null))) {
        forestValue544_111_0 = spill544_6;
        break forest_join_111;
    }
    if (!((spill544_6 <= 0))) {
        break forest_join_106;
    }
    __call544_39(receiver, null);
    if (!((life3_10 == null))) {
        break forest_join_144;
    }
    }
    spill544_7 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_145_0 = spill544_7;
        break forest_join_145;
    }
    forestValue544_111_0 = __integerCategory544_42(__call544_41(__fieldRead544_40(spill544_7)));
    }
    if (!((forestValue544_111_0 != 0))) {
        break forest_join_144;
    }
    spill544_8 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_145_0 = spill544_8;
        break forest_join_145;
    }
    if (!((__fieldRead544_43(spill544_8) != null))) {
        break forest_join_144;
    }
    __call544_44(receiver, new moom.gG());
    if (!((life3_10 == null))) {
        break forest_join_144;
    }
    }
    forestValue544_125_0 = receiver;
    }
    forestValue544_126_0 = __fieldRead544_45(forestValue544_125_0);
    }
    if (!((life3_10 != null))) {
        forestValue544_146_0 = forestValue544_126_0;
        break forest_join_146;
    }
    if (!((forestValue544_126_0 != null))) {
        break forest_join_144;
    }
    spill544_9 = __fieldRead544_46(receiver);
    if (!((life3_10 != null))) {
        forestValue544_146_0 = spill544_9;
        break forest_join_146;
    }
    if (!((__instanceOf544_47(spill544_9) != 0))) {
        break forest_join_144;
    }
    spill544_10 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_145_0 = spill544_10;
        break forest_join_145;
    }
    if (!((!__call544_49(__fieldRead544_48(spill544_10))))) {
        break forest_join_144;
    }
    __call544_50(receiver, null);
    }
    forestValue544_145_0 = receiver;
    }
    forestValue544_146_0 = __fieldRead544_51(forestValue544_145_0);
    }
    if (!((life3_10 != null))) {
        forestValue544_158_0 = forestValue544_146_0;
        break forest_join_158;
    }
    if (!((forestValue544_146_0 != null))) {
        break forest_join_156;
    }
    __fieldWrite544_53(receiver, __invokedynamic544_52(26945, (5676025928086604932L ^ life1_3)));
    }
    forestValue544_158_0 = __fieldRead544_54(receiver);
    }
    if (!((life3_10 != null))) {
        forestValue544_163_0 = forestValue544_158_0;
        break forest_join_163;
    }
    if (!((forestValue544_158_0 != null))) {
        break forest_join_172;
    }
    forestValue544_163_0 = __fieldRead544_55(receiver);
    }
    __call544_56(forestValue544_163_0);
    spill544_11 = __fieldRead544_57(receiver);
    if (!((life3_10 != null))) {
        forestValue544_171_0 = spill544_11;
        break forest_join_171;
    }
    if (!((spill544_11 != null))) {
        break forest_join_172;
    }
    forestValue544_171_0 = __fieldRead544_58(receiver);
    }
    __call544_59(forestValue544_171_0);
    }
    life6_256 = 1;
    spill544_12 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_231_0 = spill544_12;
        break forest_join_231;
    }
    if (!(__call544_62(__fieldRead544_60(spill544_12), __invokedynamic544_61(4013, (2230059249607103876L ^ life1_3))))) {
        break forest_join_230;
    }
    spill544_13 = __fieldRead544_63(receiver);
    if (!((life3_10 != null))) {
        forestValue544_234_0 = spill544_13;
        break forest_join_234;
    }
    if (!((spill544_13 == null))) {
        break forest_join_230;
    }
    life6_256 = 0;
    spill544_14 = __fieldRead544_64();
    if (!((life3_10 != null))) {
        forestValue544_197_0 = spill544_14;
        break forest_join_197;
    }
    if (!((spill544_14 != null))) {
        break forest_join_230;
    }
    forestValue544_197_0 = __fieldRead544_65();
    }
    life7_292 = __call544_66(forestValue544_197_0);
    forest_cycle_199: while (true) {
    forest_join_228: {
    forest_join_227: {
    forest_join_223: {
    forest_join_219: {
    if (!(__call544_67(life7_292))) {
        break forest_join_230;
    }
    life8_301 = __cast544_69(__call544_68(life7_292));
    spill544_15 = __call544_71(__call544_70(life8_301), "-disableattachmechanism");
    if (!((life3_10 != null))) {
        forestValue544_245_0 = __integerCategory544_72(spill544_15);
        break forest_join_245;
    }
    if (!((life3_10 != null))) {
        forestValue544_223_0 = __integerCategory544_73(spill544_15);
        break forest_join_223;
    }
    if (!(spill544_15)) {
        break forest_join_219;
    }
    life6_256 = 0;
    if (!((life3_10 == null))) {
        break forest_join_230;
    }
    }
    forestValue544_223_0 = __integerCategory544_76(__call544_75(__call544_74(life8_301), "+disableattachmechanism"));
    }
    if (!((life3_10 != null))) {
        forestValue544_227_0 = forestValue544_223_0;
        break forest_join_227;
    }
    if (!((forestValue544_223_0 != 0))) {
        break forest_join_228;
    }
    forestValue544_227_0 = 1;
    }
    life6_256 = forestValue544_227_0;
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_199;
    }
    break forest_cycle_199;
    }
    }
    forestValue544_231_0 = receiver;
    }
    if (!((life3_10 != null))) {
        forestValue544_242_0 = forestValue544_231_0;
        break forest_join_242;
    }
    forestValue544_234_0 = __fieldRead544_77(forestValue544_231_0);
    }
    if (!((forestValue544_234_0 != null))) {
        break forest_join_241;
    }
    spill544_16 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1576_0 = spill544_16;
        break forest_join_1576;
    }
    if (!(__fieldRead544_79(__fieldRead544_78(spill544_16)))) {
        break forest_join_1575;
    }
    }
    forestValue544_242_0 = receiver;
    }
    forestValue544_245_0 = __integerCategory544_83(__call544_82(__fieldRead544_81(__fieldRead544_80(forestValue544_242_0))));
    }
    if (!((life3_10 != null))) {
        forestValue544_274_0 = forestValue544_245_0;
        break forest_join_274;
    }
    if (!((forestValue544_245_0 != 0))) {
        break forest_join_268;
    }
    spill544_17 = life6_256;
    if (!((life3_10 != null))) {
        forestValue544_274_0 = spill544_17;
        break forest_join_274;
    }
    if (!((spill544_17 != 0))) {
        break forest_join_268;
    }
    life7_382 = __call544_86(__fieldRead544_85(__fieldRead544_84(receiver)));
    life8_386 = __call544_88(__call544_87(), life7_382);
    spill544_18 = life8_386;
    if (!((life3_10 != null))) {
        forestValue544_274_0 = spill544_18;
        break forest_join_274;
    }
    if (!((spill544_18 == 0))) {
        break forest_join_268;
    }
    __call544_89(life7_382, 0);
    }
    spill544_19 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_302_0 = spill544_19;
        break forest_join_302;
    }
    forestValue544_274_0 = __integerCategory544_93(__call544_92(__fieldRead544_91(__fieldRead544_90(spill544_19))));
    }
    if (!((forestValue544_274_0 != 0))) {
        break forest_join_301;
    }
    spill544_20 = life6_256;
    if (!((life3_10 != null))) {
        forestValue544_291_0 = spill544_20;
        break forest_join_291;
    }
    if (!((spill544_20 != 0))) {
        break forest_join_301;
    }
    spill544_21 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_302_0 = spill544_21;
        break forest_join_302;
    }
    forestValue544_291_0 = (__call544_96(__fieldRead544_95(__fieldRead544_94(spill544_21))) + __invokedynamic544_97(3952, (1382905838629431950L ^ life1_3)));
    }
    life7_431 = forestValue544_291_0;
    life8_435 = __call544_99(__call544_98(), life7_431);
    if (!((life8_435 == 0))) {
        break forest_join_301;
    }
    __call544_100(life7_431, 0);
    }
    forestValue544_302_0 = receiver;
    }
    __call544_102(__fieldRead544_101(forestValue544_302_0), "mouse");
    forest_cycle_305: while (true) {
    forest_join_471: {
    forest_join_470: {
    forest_join_465: {
    forest_join_463: {
    forest_join_458: {
    forest_join_447: {
    forest_join_444: {
    forest_join_442: {
    forest_join_423: {
    forest_join_422: {
    forest_join_406: {
    forest_join_405: {
    forest_join_404: {
    forest_join_398: {
    forest_join_388: {
    forest_join_372: {
    forest_join_371: {
    forest_join_370: {
    forest_join_364: {
    forest_join_350: {
    forest_join_344: {
    forest_join_343: {
    if (!(__call544_103())) {
        break forest_join_473;
    }
    spill544_22 = life6_256;
    if (!((life3_10 != null))) {
        forestValue544_477_0 = spill544_22;
        break forest_join_477;
    }
    if (!((life3_10 != null))) {
        forestValue544_477_0 = spill544_22;
        break forest_join_477;
    }
    if (!((spill544_22 != 0))) {
        break forest_join_473;
    }
    life7_464 = __call544_104();
    life8_466 = __integerCategory544_106(__call544_105());
    life9_468 = __integerCategory544_108(__call544_107());
    spill544_23 = life7_464;
    if (!((life3_10 != null))) {
        forestValue544_344_0 = spill544_23;
        break forest_join_344;
    }
    if (!((spill544_23 != -1))) {
        break forest_join_343;
    }
    __call544_110((life7_464 - __invokedynamic544_109(11479, (7144368578643331372L ^ life1_3))), life8_466);
    life10_491 = new com.moon.eJ(life7_464, __integerCategory544_111(life9_468));
    __call544_114(__call544_113(__call544_112()), life10_491);
    }
    forestValue544_344_0 = life9_468;
    }
    if (!((life3_10 != null))) {
        forestValue544_350_0 = forestValue544_344_0;
        break forest_join_350;
    }
    if (!((forestValue544_344_0 != 0))) {
        break forest_join_372;
    }
    forestValue544_350_0 = __integerCategory544_117(__call544_116(__fieldRead544_115(receiver)));
    }
    if (!((life3_10 != null))) {
        forestValue544_371_0 = forestValue544_350_0;
        break forest_join_371;
    }
    if (!((forestValue544_350_0 != 0))) {
        break forest_join_364;
    }
    spill544_24 = life7_464;
    spill544_25 = 2;
    if (!((life3_10 != null))) {
        forestValue544_370_0 = spill544_24;
        forestValue544_370_1 = spill544_25;
        break forest_join_370;
    }
    if (!((spill544_24 == spill544_25))) {
        break forest_join_364;
    }
    __call544_120(__call544_119(__fieldRead544_118(receiver)));
    if (!((life3_10 == null))) {
        break forest_join_372;
    }
    }
    forestValue544_370_0 = life7_464;
    forestValue544_370_1 = __invokedynamic544_121(11479, (7144368578643331372L ^ life1_3));
    }
    forestValue544_371_0 = (forestValue544_370_0 - forestValue544_370_1);
    }
    __call544_122(forestValue544_371_0);
    }
    life10_547 = (__call544_123() - __fieldRead544_124(receiver));
    spill544_26 = __numericCompare544_126(life10_547, __invokedynamic544_125(31287, (1509497791161704470L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_388_0 = spill544_26;
        break forest_join_388;
    }
    if (!((spill544_26 <= 0))) {
        break forest_join_471;
    }
    forestValue544_388_0 = __call544_127();
    }
    life12_563 = forestValue544_388_0;
    spill544_27 = life12_563;
    if (!((life3_10 != null))) {
        forestValue544_398_0 = spill544_27;
        break forest_join_398;
    }
    if (!((spill544_27 != 0))) {
        break forest_join_447;
    }
    spill544_28 = __fieldRead544_128(receiver);
    if (!((life3_10 != null))) {
        forestValue544_444_0 = spill544_28;
        break forest_join_444;
    }
    forestValue544_398_0 = __integerCategory544_130(__call544_129(spill544_28));
    }
    if (!((forestValue544_398_0 != 0))) {
        break forest_join_442;
    }
    spill544_29 = life12_563;
    if (!((life3_10 != null))) {
        forestValue544_404_0 = spill544_29;
        break forest_join_404;
    }
    if (!((spill544_29 < 0))) {
        break forest_join_405;
    }
    forestValue544_404_0 = -1;
    }
    forestValue544_406_0 = forestValue544_404_0;
    break forest_join_406;
    }
    forestValue544_406_0 = 1;
    }
    life12_563 = forestValue544_406_0;
    spill544_30 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_423_0 = spill544_30;
        break forest_join_423;
    }
    if (!(__call544_133(__call544_132(__fieldRead544_131(spill544_30))))) {
        break forest_join_422;
    }
    __call544_136(__call544_135(__fieldRead544_134(receiver)), (-life12_563));
    if (!((life3_10 == null))) {
        break forest_join_447;
    }
    }
    forestValue544_423_0 = receiver;
    }
    life13_628 = __call544_140((__call544_139(__fieldRead544_138(__fieldRead544_137(forestValue544_423_0))) + (((float) life12_563) * 0x1.47ae14p-8f)), 0x0.0p0f, 0x1.99999ap-3f);
    __call544_143(__fieldRead544_142(__fieldRead544_141(receiver)), life13_628);
    if (!((life3_10 == null))) {
        break forest_join_447;
    }
    }
    forestValue544_444_0 = __fieldRead544_144(receiver);
    }
    __call544_146(__fieldRead544_145(forestValue544_444_0), life12_563);
    }
    spill544_31 = __fieldRead544_147(receiver);
    if (!((life3_10 != null))) {
        forestValue544_465_0 = spill544_31;
        break forest_join_465;
    }
    if (!((spill544_31 == null))) {
        break forest_join_463;
    }
    spill544_32 = __fieldRead544_148(receiver);
    if (!((life3_10 != null))) {
        forestValue544_458_0 = __integerCategory544_149(spill544_32);
        break forest_join_458;
    }
    if (!((!spill544_32))) {
        break forest_join_471;
    }
    forestValue544_458_0 = __integerCategory544_151(__call544_150());
    }
    if (!((forestValue544_458_0 != 0))) {
        break forest_join_471;
    }
    __call544_152(receiver);
    if (!((life3_10 == null))) {
        break forest_join_471;
    }
    }
    forestValue544_465_0 = __fieldRead544_153(receiver);
    }
    if (!((life3_10 != null))) {
        forestValue544_470_0 = forestValue544_465_0;
        break forest_join_470;
    }
    if (!((forestValue544_465_0 != null))) {
        break forest_join_471;
    }
    forestValue544_470_0 = __fieldRead544_154(receiver);
    }
    __call544_155(forestValue544_470_0);
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_305;
    }
    break forest_cycle_305;
    }
    }
    spill544_33 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_485_0 = spill544_33;
        break forest_join_485;
    }
    forestValue544_477_0 = __fieldRead544_156(spill544_33);
    }
    if (!((forestValue544_477_0 > 0))) {
        break forest_join_484;
    }
    net.minecraft.client.Minecraft __stackOp544_157_0 = receiver;
    __fieldWrite544_159(__stackOp544_157_0, (__fieldRead544_158(__stackOp544_157_0) - 1));
    }
    forestValue544_485_0 = receiver;
    }
    __call544_161(__fieldRead544_160(forestValue544_485_0), "keyboard");
    forest_cycle_488: while (true) {
    forest_join_1020: {
    forest_join_997: {
    forest_join_996: {
    forest_join_985: {
    forest_join_981: {
    forest_join_975: {
    forest_join_972: {
    forest_join_971: {
    forest_join_970: {
    forest_join_969: {
    forest_join_957: {
    forest_join_953: {
    forest_join_951: {
    forest_join_950: {
    forest_join_944: {
    forest_join_939: {
    forest_join_929: {
    forest_join_926: {
    forest_join_905: {
    forest_join_901: {
    forest_join_892: {
    forest_join_891: {
    forest_join_890: {
    forest_join_880: {
    forest_join_872: {
    forest_join_871: {
    forest_join_870: {
    forest_join_869: {
    forest_join_857: {
    forest_join_852: {
    forest_join_851: {
    forest_join_847: {
    forest_join_846: {
    forest_join_845: {
    forest_join_824: {
    forest_join_819: {
    forest_join_818: {
    forest_join_817: {
    forest_join_816: {
    forest_join_815: {
    forest_join_794: {
    forest_join_789: {
    forest_join_788: {
    forest_join_784: {
    forest_join_783: {
    forest_join_782: {
    forest_join_761: {
    forest_join_756: {
    forest_join_755: {
    forest_join_740: {
    forest_join_735: {
    forest_join_734: {
    forest_join_733: {
    forest_join_732: {
    forest_join_731: {
    forest_join_711: {
    forest_join_706: {
    forest_join_705: {
    forest_join_691: {
    forest_join_686: {
    forest_join_685: {
    forest_join_671: {
    forest_join_666: {
    forest_join_665: {
    forest_join_663: {
    forest_join_644: {
    forest_join_638: {
    forest_join_631: {
    forest_join_628: {
    forest_join_622: {
    forest_join_621: {
    forest_join_607: {
    forest_join_603: {
    forest_join_600: {
    forest_join_585: {
    forest_join_579: {
    forest_join_570: {
    forest_join_567: {
    forest_join_558: {
    forest_join_552: {
    forest_join_535: {
    forest_join_531: {
    forest_join_509: {
    forest_join_508: {
    forest_join_507: {
    if (!(__call544_162())) {
        break forest_join_1034;
    }
    spill544_34 = life6_256;
    if (!((life3_10 != null))) {
        forestValue544_1035_0 = spill544_34;
        break forest_join_1035;
    }
    if (!((life3_10 != null))) {
        forestValue544_1035_0 = spill544_34;
        break forest_join_1035;
    }
    if (!((spill544_34 != 0))) {
        break forest_join_1034;
    }
    spill544_35 = __call544_163();
    if (!((life3_10 != null))) {
        forestValue544_507_0 = spill544_35;
        break forest_join_507;
    }
    if (!((spill544_35 == 0))) {
        break forest_join_508;
    }
    forestValue544_507_0 = (__call544_164() + __invokedynamic544_165(7405, (5557559254322657607L ^ life1_3)));
    }
    forestValue544_509_0 = forestValue544_507_0;
    break forest_join_509;
    }
    forestValue544_509_0 = __call544_166();
    }
    life7_742 = forestValue544_509_0;
    __call544_168(life7_742, __call544_167());
    life8_747 = __integerCategory544_170(__call544_169());
    life9_753 = new com.moon.eI(life7_742, __integerCategory544_171(life8_747));
    __call544_174(__call544_173(__call544_172()), life9_753);
    spill544_36 = life8_747;
    if (!((life3_10 != null))) {
        forestValue544_535_0 = spill544_36;
        break forest_join_535;
    }
    if (!((spill544_36 != 0))) {
        break forest_join_531;
    }
    __call544_175(life7_742);
    }
    forestValue544_535_0 = __numericCompare544_177(__fieldRead544_176(receiver), 0L);
    }
    if (!((life3_10 != null))) {
        forestValue544_585_0 = forestValue544_535_0;
        break forest_join_585;
    }
    if (!((forestValue544_535_0 > 0))) {
        break forest_join_579;
    }
    spill544_37 = __numericCompare544_181((__call544_178() - __fieldRead544_179(receiver)), __invokedynamic544_180(29918, (5697421215569620732L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_558_0 = spill544_37;
        break forest_join_558;
    }
    if (!((spill544_37 >= 0))) {
        break forest_join_552;
    }
    break forest_join_1023;
    }
    forestValue544_558_0 = __integerCategory544_184(__call544_183(__invokedynamic544_182(24754, (6455212897845265684L ^ life1_3))));
    }
    if (!((life3_10 != null))) {
        forestValue544_567_0 = forestValue544_558_0;
        break forest_join_567;
    }
    if (!((forestValue544_558_0 != 0))) {
        break forest_join_570;
    }
    forestValue544_567_0 = __integerCategory544_187(__call544_186(__invokedynamic544_185(7218, (8898691698156779932L ^ life1_3))));
    }
    if (!((life3_10 != null))) {
        forestValue544_603_0 = forestValue544_567_0;
        break forest_join_603;
    }
    if (!((forestValue544_567_0 == 0))) {
        break forest_join_600;
    }
    }
    __fieldWrite544_189(receiver, __invokedynamic544_188(9971, (8456025830815431892L ^ life1_3)));
    if (!((life3_10 == null))) {
        break forest_join_600;
    }
    }
    forestValue544_585_0 = __integerCategory544_192(__call544_191(__invokedynamic544_190(27919, (3686407997664774359L ^ life1_3))));
    }
    if (!((life3_10 != null))) {
        forestValue544_603_0 = forestValue544_585_0;
        break forest_join_603;
    }
    if (!((forestValue544_585_0 != 0))) {
        break forest_join_600;
    }
    spill544_38 = __call544_194(__invokedynamic544_193(17709, (7448441699479871680L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_603_0 = __integerCategory544_195(spill544_38);
        break forest_join_603;
    }
    if (!(spill544_38)) {
        break forest_join_600;
    }
    __fieldWrite544_197(receiver, __call544_196());
    }
    __call544_198(receiver);
    forestValue544_603_0 = __integerCategory544_200(__call544_199());
    }
    if (!((life3_10 != null))) {
        forestValue544_607_0 = forestValue544_603_0;
        break forest_join_607;
    }
    if (!((forestValue544_603_0 != 0))) {
        break forest_join_1020;
    }
    forestValue544_607_0 = life7_742;
    }
    if (!((forestValue544_607_0 == __invokedynamic544_201(25747, (754559866820870520L ^ life1_3))))) {
        break forest_join_621;
    }
    spill544_39 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_622_0 = spill544_39;
        break forest_join_622;
    }
    if (!((__fieldRead544_202(spill544_39) != null))) {
        break forest_join_621;
    }
    __call544_204(__fieldRead544_203(receiver));
    }
    forestValue544_622_0 = receiver;
    }
    spill544_40 = __fieldRead544_205(forestValue544_622_0);
    if (!((life3_10 != null))) {
        forestValue544_628_0 = spill544_40;
        break forest_join_628;
    }
    if (!((spill544_40 != null))) {
        break forest_join_631;
    }
    forestValue544_628_0 = __fieldRead544_206(receiver);
    }
    __call544_207(forestValue544_628_0);
    if (!((life3_10 == null))) {
        break forest_join_972;
    }
    }
    spill544_41 = life7_742;
    spill544_42 = 1;
    if (!((life3_10 != null))) {
        forestValue544_644_0 = spill544_41;
        forestValue544_644_1 = spill544_42;
        break forest_join_644;
    }
    if (!((spill544_41 == spill544_42))) {
        break forest_join_638;
    }
    __call544_208(receiver);
    }
    forestValue544_644_0 = life7_742;
    forestValue544_644_1 = __invokedynamic544_209(8825, (3785338005840496566L ^ life1_3));
    }
    if (!((life3_10 != null))) {
        forestValue544_671_0 = forestValue544_644_0;
        forestValue544_671_1 = forestValue544_644_1;
        break forest_join_671;
    }
    if (!((forestValue544_644_0 == forestValue544_644_1))) {
        break forest_join_665;
    }
    spill544_43 = __call544_211(__invokedynamic544_210(17709, (7448441699479871680L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_666_0 = __integerCategory544_212(spill544_43);
        break forest_join_666;
    }
    if (!(spill544_43)) {
        break forest_join_665;
    }
    spill544_44 = __fieldRead544_213(receiver);
    if (!((life3_10 != null))) {
        forestValue544_663_0 = spill544_44;
        break forest_join_663;
    }
    if (!((spill544_44 != null))) {
        break forest_join_665;
    }
    forestValue544_663_0 = __fieldRead544_214(receiver);
    }
    __call544_216(__call544_215(forestValue544_663_0));
    }
    forestValue544_666_0 = life7_742;
    }
    forestValue544_671_0 = forestValue544_666_0;
    forestValue544_671_1 = __invokedynamic544_217(18560, (2800050034818116917L ^ life1_3));
    }
    if (!((life3_10 != null))) {
        forestValue544_691_0 = forestValue544_671_0;
        forestValue544_691_1 = forestValue544_671_1;
        break forest_join_691;
    }
    if (!((forestValue544_671_0 == forestValue544_671_1))) {
        break forest_join_685;
    }
    spill544_45 = __call544_219(__invokedynamic544_218(17709, (7448441699479871680L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_686_0 = __integerCategory544_220(spill544_45);
        break forest_join_686;
    }
    if (!(spill544_45)) {
        break forest_join_685;
    }
    __call544_221(receiver);
    }
    forestValue544_686_0 = life7_742;
    }
    forestValue544_691_0 = forestValue544_686_0;
    forestValue544_691_1 = __invokedynamic544_222(25598, (2092810364581922321L ^ life1_3));
    }
    if (!((life3_10 != null))) {
        forestValue544_711_0 = forestValue544_691_0;
        forestValue544_711_1 = forestValue544_691_1;
        break forest_join_711;
    }
    if (!((forestValue544_691_0 == forestValue544_691_1))) {
        break forest_join_705;
    }
    spill544_46 = __call544_224(__invokedynamic544_223(17709, (7448441699479871680L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_706_0 = __integerCategory544_225(spill544_46);
        break forest_join_706;
    }
    if (!(spill544_46)) {
        break forest_join_705;
    }
    __call544_226(receiver);
    }
    forestValue544_706_0 = life7_742;
    }
    forestValue544_711_0 = forestValue544_706_0;
    forestValue544_711_1 = __invokedynamic544_227(30735, (9008171654317727189L ^ life1_3));
    }
    if (!((life3_10 != null))) {
        forestValue544_740_0 = forestValue544_711_0;
        forestValue544_740_1 = forestValue544_711_1;
        break forest_join_740;
    }
    if (!((forestValue544_711_0 == forestValue544_711_1))) {
        break forest_join_734;
    }
    spill544_47 = __call544_229(__invokedynamic544_228(17709, (7448441699479871680L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_735_0 = __integerCategory544_230(spill544_47);
        break forest_join_735;
    }
    if (!(spill544_47)) {
        break forest_join_734;
    }
    spill544_48 = __fieldRead544_231(receiver);
    spill544_49 = __fieldRead544_232();
    spill544_50 = __call544_233();
    if (!((life3_10 != null))) {
        forestValue544_731_0 = spill544_48;
        forestValue544_731_1 = spill544_49;
        forestValue544_731_2 = __integerCategory544_234(spill544_50);
        break forest_join_731;
    }
    if (!(spill544_50)) {
        forestValue544_732_0 = spill544_48;
        forestValue544_732_1 = spill544_49;
        break forest_join_732;
    }
    forestValue544_731_0 = spill544_48;
    forestValue544_731_1 = spill544_49;
    forestValue544_731_2 = -1;
    }
    forestValue544_733_0 = forestValue544_731_0;
    forestValue544_733_1 = forestValue544_731_1;
    forestValue544_733_2 = forestValue544_731_2;
    break forest_join_733;
    }
    forestValue544_733_0 = forestValue544_732_0;
    forestValue544_733_1 = forestValue544_732_1;
    forestValue544_733_2 = 1;
    }
    __call544_235(forestValue544_733_0, forestValue544_733_1, forestValue544_733_2);
    }
    forestValue544_735_0 = life7_742;
    }
    forestValue544_740_0 = forestValue544_735_0;
    forestValue544_740_1 = __invokedynamic544_236(16705, (2035115671354369159L ^ life1_3));
    }
    if (!((life3_10 != null))) {
        forestValue544_761_0 = forestValue544_740_0;
        forestValue544_761_1 = forestValue544_740_1;
        break forest_join_761;
    }
    if (!((forestValue544_740_0 == forestValue544_740_1))) {
        break forest_join_755;
    }
    spill544_51 = __call544_238(__invokedynamic544_237(17709, (7448441699479871680L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_756_0 = __integerCategory544_239(spill544_51);
        break forest_join_756;
    }
    if (!(spill544_51)) {
        break forest_join_755;
    }
    __call544_241(__fieldRead544_240(receiver));
    }
    forestValue544_756_0 = life7_742;
    }
    forestValue544_761_0 = forestValue544_756_0;
    forestValue544_761_1 = __invokedynamic544_242(4288, (5825844249799505255L ^ life1_3));
    }
    if (!((life3_10 != null))) {
        forestValue544_794_0 = forestValue544_761_0;
        forestValue544_794_1 = forestValue544_761_1;
        break forest_join_794;
    }
    if (!((forestValue544_761_0 == forestValue544_761_1))) {
        break forest_join_788;
    }
    spill544_52 = __call544_244(__invokedynamic544_243(17709, (7448441699479871680L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_789_0 = __integerCategory544_245(spill544_52);
        break forest_join_789;
    }
    if (!(spill544_52)) {
        break forest_join_788;
    }
    spill544_53 = __fieldRead544_246(receiver);
    spill544_54 = __fieldRead544_248(__fieldRead544_247(receiver));
    if (!((life3_10 != null))) {
        forestValue544_782_0 = spill544_53;
        forestValue544_782_1 = __integerCategory544_249(spill544_54);
        break forest_join_782;
    }
    if (!((!spill544_54))) {
        forestValue544_783_0 = spill544_53;
        break forest_join_783;
    }
    forestValue544_782_0 = spill544_53;
    forestValue544_782_1 = 1;
    }
    forestValue544_784_0 = forestValue544_782_0;
    forestValue544_784_1 = forestValue544_782_1;
    break forest_join_784;
    }
    forestValue544_784_0 = forestValue544_783_0;
    forestValue544_784_1 = 0;
    }
    __fieldWrite544_250(forestValue544_784_0, forestValue544_784_1);
    __call544_252(__fieldRead544_251(receiver));
    }
    forestValue544_789_0 = life7_742;
    }
    forestValue544_794_0 = forestValue544_789_0;
    forestValue544_794_1 = __invokedynamic544_253(20914, (5981300665407632414L ^ life1_3));
    }
    if (!((life3_10 != null))) {
        forestValue544_824_0 = forestValue544_794_0;
        forestValue544_824_1 = forestValue544_794_1;
        break forest_join_824;
    }
    if (!((forestValue544_794_0 == forestValue544_794_1))) {
        break forest_join_818;
    }
    spill544_55 = __call544_255(__invokedynamic544_254(17709, (7448441699479871680L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_819_0 = __integerCategory544_256(spill544_55);
        break forest_join_819;
    }
    if (!(spill544_55)) {
        break forest_join_818;
    }
    spill544_56 = __fieldRead544_257(receiver);
    spill544_57 = __call544_259(__fieldRead544_258(receiver));
    if (!((life3_10 != null))) {
        forestValue544_815_0 = spill544_56;
        forestValue544_815_1 = __integerCategory544_260(spill544_57);
        break forest_join_815;
    }
    if (!((!spill544_57))) {
        forestValue544_816_0 = spill544_56;
        break forest_join_816;
    }
    forestValue544_815_0 = spill544_56;
    forestValue544_815_1 = 1;
    }
    forestValue544_817_0 = forestValue544_815_0;
    forestValue544_817_1 = forestValue544_815_1;
    break forest_join_817;
    }
    forestValue544_817_0 = forestValue544_816_0;
    forestValue544_817_1 = 0;
    }
    __call544_261(forestValue544_817_0, forestValue544_817_1);
    }
    forestValue544_819_0 = life7_742;
    }
    forestValue544_824_0 = forestValue544_819_0;
    forestValue544_824_1 = __invokedynamic544_262(21988, (4925189577906286655L ^ life1_3));
    }
    if (!((life3_10 != null))) {
        forestValue544_857_0 = forestValue544_824_0;
        forestValue544_857_1 = forestValue544_824_1;
        break forest_join_857;
    }
    if (!((forestValue544_824_0 == forestValue544_824_1))) {
        break forest_join_851;
    }
    spill544_58 = __call544_264(__invokedynamic544_263(17709, (7448441699479871680L ^ life1_3)));
    if (!((life3_10 != null))) {
        forestValue544_852_0 = __integerCategory544_265(spill544_58);
        break forest_join_852;
    }
    if (!(spill544_58)) {
        break forest_join_851;
    }
    spill544_59 = __fieldRead544_266(receiver);
    spill544_60 = __fieldRead544_268(__fieldRead544_267(receiver));
    if (!((life3_10 != null))) {
        forestValue544_845_0 = spill544_59;
        forestValue544_845_1 = __integerCategory544_269(spill544_60);
        break forest_join_845;
    }
    if (!((!spill544_60))) {
        forestValue544_846_0 = spill544_59;
        break forest_join_846;
    }
    forestValue544_845_0 = spill544_59;
    forestValue544_845_1 = 1;
    }
    forestValue544_847_0 = forestValue544_845_0;
    forestValue544_847_1 = forestValue544_845_1;
    break forest_join_847;
    }
    forestValue544_847_0 = forestValue544_846_0;
    forestValue544_847_1 = 0;
    }
    __fieldWrite544_270(forestValue544_847_0, forestValue544_847_1);
    __call544_272(__fieldRead544_271(receiver));
    }
    forestValue544_852_0 = life7_742;
    }
    forestValue544_857_0 = forestValue544_852_0;
    forestValue544_857_1 = __invokedynamic544_273(25544, (392865690950649385L ^ life1_3));
    }
    if (!((life3_10 != null))) {
        forestValue544_880_0 = forestValue544_857_0;
        forestValue544_880_1 = forestValue544_857_1;
        break forest_join_880;
    }
    if (!((forestValue544_857_0 == forestValue544_857_1))) {
        break forest_join_872;
    }
    spill544_61 = __fieldRead544_274(receiver);
    spill544_62 = __fieldRead544_276(__fieldRead544_275(receiver));
    if (!((life3_10 != null))) {
        forestValue544_869_0 = spill544_61;
        forestValue544_869_1 = __integerCategory544_277(spill544_62);
        break forest_join_869;
    }
    if (!((!spill544_62))) {
        forestValue544_870_0 = spill544_61;
        break forest_join_870;
    }
    forestValue544_869_0 = spill544_61;
    forestValue544_869_1 = 1;
    }
    forestValue544_871_0 = forestValue544_869_0;
    forestValue544_871_1 = forestValue544_869_1;
    break forest_join_871;
    }
    forestValue544_871_0 = forestValue544_870_0;
    forestValue544_871_1 = 0;
    }
    __fieldWrite544_278(forestValue544_871_0, forestValue544_871_1);
    }
    spill544_63 = life7_742;
    if (!((life3_10 != null))) {
        forestValue544_905_0 = spill544_63;
        break forest_join_905;
    }
    forestValue544_880_0 = spill544_63;
    forestValue544_880_1 = __invokedynamic544_279(17709, (7448441699479871680L ^ life1_3));
    }
    if (!((forestValue544_880_0 == forestValue544_880_1))) {
        break forest_join_901;
    }
    spill544_64 = __fieldRead544_280(receiver);
    spill544_65 = __fieldRead544_282(__fieldRead544_281(receiver));
    if (!((life3_10 != null))) {
        forestValue544_890_0 = spill544_64;
        forestValue544_890_1 = __integerCategory544_283(spill544_65);
        break forest_join_890;
    }
    if (!((!spill544_65))) {
        forestValue544_891_0 = spill544_64;
        break forest_join_891;
    }
    forestValue544_890_0 = spill544_64;
    forestValue544_890_1 = 1;
    }
    forestValue544_892_0 = forestValue544_890_0;
    forestValue544_892_1 = forestValue544_890_1;
    break forest_join_892;
    }
    forestValue544_892_0 = forestValue544_891_0;
    forestValue544_892_1 = 0;
    }
    __fieldWrite544_284(forestValue544_892_0, forestValue544_892_1);
    __fieldWrite544_287(__fieldRead544_285(receiver), __call544_286());
    __fieldWrite544_290(__fieldRead544_288(receiver), __call544_289());
    }
    forestValue544_905_0 = __integerCategory544_294(__call544_293(__fieldRead544_292(__fieldRead544_291(receiver))));
    }
    if (!((life3_10 != null))) {
        forestValue544_957_0 = forestValue544_905_0;
        break forest_join_957;
    }
    if (!((forestValue544_905_0 != 0))) {
        break forest_join_953;
    }
    net.minecraft.client.settings.GameSettings __stackOp544_296_0 = __fieldRead544_295(receiver);
    __fieldWrite544_298(__stackOp544_296_0, (__fieldRead544_297(__stackOp544_296_0) + 1));
    spill544_66 = __fieldRead544_300(__fieldRead544_299(receiver));
    if (!((life3_10 != null))) {
        forestValue544_929_0 = spill544_66;
        break forest_join_929;
    }
    if (!((spill544_66 > 2))) {
        break forest_join_926;
    }
    __fieldWrite544_302(__fieldRead544_301(receiver), 0);
    }
    forestValue544_929_0 = __fieldRead544_304(__fieldRead544_303(receiver));
    }
    if (!((life3_10 != null))) {
        forestValue544_944_0 = forestValue544_929_0;
        break forest_join_944;
    }
    if (!((forestValue544_929_0 == 0))) {
        break forest_join_939;
    }
    __call544_307(__fieldRead544_305(receiver), __call544_306(receiver));
    if (!((life3_10 == null))) {
        break forest_join_950;
    }
    }
    spill544_67 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_951_0 = spill544_67;
        break forest_join_951;
    }
    forestValue544_944_0 = __fieldRead544_309(__fieldRead544_308(spill544_67));
    }
    if (!((forestValue544_944_0 == 1))) {
        break forest_join_950;
    }
    __call544_311(__fieldRead544_310(receiver), null);
    }
    forestValue544_951_0 = receiver;
    }
    __call544_313(__fieldRead544_312(forestValue544_951_0));
    }
    forestValue544_957_0 = __integerCategory544_317(__call544_316(__fieldRead544_315(__fieldRead544_314(receiver))));
    }
    if (!((life3_10 != null))) {
        forestValue544_975_0 = forestValue544_957_0;
        break forest_join_975;
    }
    if (!((forestValue544_957_0 != 0))) {
        break forest_join_972;
    }
    spill544_68 = __fieldRead544_318(receiver);
    spill544_69 = __fieldRead544_320(__fieldRead544_319(receiver));
    if (!((life3_10 != null))) {
        forestValue544_969_0 = spill544_68;
        forestValue544_969_1 = __integerCategory544_321(spill544_69);
        break forest_join_969;
    }
    if (!((!spill544_69))) {
        forestValue544_970_0 = spill544_68;
        break forest_join_970;
    }
    forestValue544_969_0 = spill544_68;
    forestValue544_969_1 = 1;
    }
    forestValue544_971_0 = forestValue544_969_0;
    forestValue544_971_1 = forestValue544_969_1;
    break forest_join_971;
    }
    forestValue544_971_0 = forestValue544_970_0;
    forestValue544_971_1 = 0;
    }
    __fieldWrite544_322(forestValue544_971_0, forestValue544_971_1);
    }
    forestValue544_975_0 = __integerCategory544_325(__fieldRead544_324(__fieldRead544_323(receiver)));
    }
    if (!((life3_10 != null))) {
        forestValue544_981_0 = forestValue544_975_0;
        break forest_join_981;
    }
    if (!((forestValue544_975_0 != 0))) {
        break forest_join_1020;
    }
    forestValue544_981_0 = __integerCategory544_328(__fieldRead544_327(__fieldRead544_326(receiver)));
    }
    if (!((life3_10 != null))) {
        forestValue544_985_0 = forestValue544_981_0;
        break forest_join_985;
    }
    if (!((forestValue544_981_0 != 0))) {
        break forest_join_1020;
    }
    forestValue544_985_0 = life7_742;
    }
    if (!((life3_10 != null))) {
        forestValue544_997_0 = forestValue544_985_0;
        break forest_join_997;
    }
    if (!((forestValue544_985_0 == __invokedynamic544_329(21138, (3050591644938434368L ^ life1_3))))) {
        break forest_join_996;
    }
    __call544_330(receiver, 0);
    }
    forestValue544_997_0 = 0;
    }
    life10_1458 = forestValue544_997_0;
    forest_cycle_998: while (true) {
    forest_join_1017: {
    if (!((life10_1458 < __invokedynamic544_331(5308, (3245483521171960144L ^ life1_3))))) {
        break forest_join_1020;
    }
    spill544_70 = life7_742;
    spill544_71 = (2 + life10_1458);
    if (!((life3_10 != null))) {
        forestValue544_1091_0 = spill544_70;
        forestValue544_1091_1 = spill544_71;
        break forest_join_1091;
    }
    if (!((spill544_70 == spill544_71))) {
        break forest_join_1017;
    }
    __call544_332(receiver, (life10_1458 + 1));
    }
    life10_1458 += 1;
    if (!((life3_10 == null))) {
        continue forest_cycle_998;
    }
    break forest_cycle_998;
    }
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_488;
    }
    break forest_cycle_488;
    }
    break forest_join_1034;
    }
    throw new moom.Oo(new moom.qY("Manually triggered debug crash", new java.lang.Throwable()));
    }
    forestValue544_1035_0 = 0;
    }
    life7_1507 = forestValue544_1035_0;
    forest_cycle_1036: while (true) {
    forest_join_1088: {
    forest_join_1087: {
    forest_join_1067: {
    forest_join_1061: {
    forest_join_1059: {
    if (!((life7_1507 < __invokedynamic544_333(5137, (8124830104883114461L ^ life1_3))))) {
        break forest_join_1147;
    }
    spill544_72 = __call544_336((__fieldRead544_335(__fieldRead544_334(receiver)))[life7_1507]);
    if (!((life3_10 != null))) {
        forestValue544_1155_0 = __integerCategory544_337(spill544_72);
        break forest_join_1155;
    }
    if (!((life3_10 != null))) {
        forestValue544_1059_0 = __integerCategory544_338(spill544_72);
        break forest_join_1059;
    }
    if (!(spill544_72)) {
        break forest_join_1087;
    }
    spill544_73 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1061_0 = spill544_73;
        break forest_join_1061;
    }
    forestValue544_1059_0 = __integerCategory544_341(__call544_340(__fieldRead544_339(spill544_73)));
    }
    if (!((forestValue544_1059_0 != 0))) {
        break forest_join_1067;
    }
    forestValue544_1061_0 = receiver;
    }
    __call544_344(__call544_343(__fieldRead544_342(forestValue544_1061_0)), life7_1507);
    if (!((life3_10 == null))) {
        break forest_join_1087;
    }
    }
    life8_1558 = new com.moon.dN(life7_1507);
    __call544_347(__call544_346(__call544_345()), life8_1558);
    if (!((life3_10 != null))) {
        break forest_join_1088;
    }
    if (!((!__call544_348(life8_1558)))) {
        break forest_join_1087;
    }
    __fieldWrite544_352(__fieldRead544_350(__fieldRead544_349(receiver)), __call544_351(life8_1558));
    }
    life7_1507 += 1;
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_1036;
    }
    break forest_cycle_1036;
    }
    break forest_join_1147;
    }
    forest_cycle_1091: while (true) {
    forest_join_1140: {
    forest_join_1137: {
    forest_join_1136: {
    forest_join_1116: {
    forest_join_1110: {
    forest_join_1108: {
    if (!((forestValue544_1091_0 < forestValue544_1091_1))) {
        break forest_join_1147;
    }
    spill544_74 = __call544_355((__fieldRead544_354(__fieldRead544_353(receiver)))[life7_742]);
    if (!((life3_10 != null))) {
        forestValue544_1155_0 = __integerCategory544_356(spill544_74);
        break forest_join_1155;
    }
    if (!((life3_10 != null))) {
        forestValue544_1108_0 = __integerCategory544_357(spill544_74);
        break forest_join_1108;
    }
    if (!(spill544_74)) {
        break forest_join_1136;
    }
    spill544_75 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1110_0 = spill544_75;
        break forest_join_1110;
    }
    forestValue544_1108_0 = __integerCategory544_360(__call544_359(__fieldRead544_358(spill544_75)));
    }
    if (!((forestValue544_1108_0 != 0))) {
        break forest_join_1116;
    }
    forestValue544_1110_0 = receiver;
    }
    __call544_363(__call544_362(__fieldRead544_361(forestValue544_1110_0)), life7_742);
    if (!((life3_10 == null))) {
        break forest_join_1136;
    }
    }
    life8_1625 = new com.moon.dN(life7_742);
    __call544_366(__call544_365(__call544_364()), life8_1625);
    if (!((life3_10 != null))) {
        break forest_join_1137;
    }
    if (!((!__call544_367(life8_1625)))) {
        break forest_join_1136;
    }
    __fieldWrite544_371(__fieldRead544_369(__fieldRead544_368(receiver)), __call544_370(life8_1625));
    }
    life7_742 += 1;
    }
    if (!((life3_10 == null))) {
        break forest_join_1140;
    }
    break forest_join_1147;
    }
    spill544_76 = life7_742;
    spill544_77 = __invokedynamic544_372(5137, (8124830104883114461L ^ life1_3));
    forestValue544_1091_0 = spill544_76;
    forestValue544_1091_1 = spill544_77;
    continue forest_cycle_1091;
    }
    }
    if (!((__fieldRead544_374(__fieldRead544_373(receiver)) != __fieldRead544_375()))) {
        break forest_join_1154;
    }
    forestValue544_1155_0 = 1;
    break forest_join_1155;
    }
    forestValue544_1155_0 = 0;
    }
    life7_1668 = forestValue544_1155_0;
    forest_cycle_1156: while (true) {
    forest_join_1182: {
    forest_join_1174: {
    if (!(__call544_378(__fieldRead544_377(__fieldRead544_376(receiver))))) {
        break forest_join_1190;
    }
    spill544_78 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1182_0 = spill544_78;
        break forest_join_1182;
    }
    spill544_79 = __call544_380(__fieldRead544_379(spill544_78));
    if (!((life3_10 != null))) {
        forestValue544_1211_0 = __integerCategory544_381(spill544_79);
        break forest_join_1211;
    }
    if (!(spill544_79)) {
        break forest_join_1174;
    }
    __call544_383(__fieldRead544_382(receiver));
    if (!((life3_10 == null))) {
        continue forest_cycle_1156;
    }
    }
    __call544_386(__call544_384(receiver), new moom.zp(__fieldRead544_385()));
    forestValue544_1182_0 = receiver;
    }
    __call544_388(forestValue544_1182_0, new moom.hu(__fieldRead544_387(receiver)));
    if (!((life3_10 == null))) {
        continue forest_cycle_1156;
    }
    break forest_cycle_1156;
    }
    }
    forest_cycle_1190: while (true) {
    forest_join_1205: {
    if (!(__call544_391(__fieldRead544_390(__fieldRead544_389(receiver))))) {
        break forest_join_1252;
    }
    spill544_80 = __fieldRead544_392(receiver);
    if (!((life3_10 != null))) {
        forestValue544_1205_0 = spill544_80;
        break forest_join_1205;
    }
    spill544_81 = __call544_393(spill544_80);
    if (!((life3_10 != null))) {
        forestValue544_1233_0 = __integerCategory544_394(spill544_81);
        break forest_join_1233;
    }
    if (!((!spill544_81))) {
        continue forest_cycle_1190;
    }
    forestValue544_1205_0 = __fieldRead544_395(receiver);
    }
    __call544_397(forestValue544_1205_0, __call544_396());
    if (!((life3_10 == null))) {
        continue forest_cycle_1190;
    }
    break forest_cycle_1190;
    }
    break forest_join_1252;
    }
    forest_cycle_1211: while (true) {
    forest_join_1228: {
    forest_join_1222: {
    if (!((forestValue544_1211_0 != 0))) {
        break forest_join_1252;
    }
    spill544_82 = __fieldRead544_398(receiver);
    if (!((life3_10 != null))) {
        forestValue544_1222_0 = spill544_82;
        break forest_join_1222;
    }
    spill544_83 = __call544_399(spill544_82);
    if (!((life3_10 != null))) {
        forestValue544_1233_0 = __integerCategory544_400(spill544_83);
        break forest_join_1233;
    }
    if (!((!spill544_83))) {
        break forest_join_1228;
    }
    forestValue544_1222_0 = __fieldRead544_401(receiver);
    }
    __call544_403(forestValue544_1222_0, __call544_402());
    if (!((life3_10 == null))) {
        break forest_join_1228;
    }
    break forest_join_1252;
    }
    spill544_84 = __call544_406(__fieldRead544_405(__fieldRead544_404(receiver)));
    forestValue544_1211_0 = __integerCategory544_407(spill544_84);
    continue forest_cycle_1211;
    }
    }
    forest_cycle_1233: while (true) {
    forest_join_1246: {
    if (!((forestValue544_1233_0 != 0))) {
        break forest_join_1268;
    }
    spill544_85 = life7_1668;
    if (!((life3_10 != null))) {
        forestValue544_1664_0 = spill544_85;
        break forest_join_1664;
    }
    if (!((spill544_85 != 0))) {
        break forest_join_1268;
    }
    __call544_408(receiver, new moom.gF());
    if (!((life3_10 == null))) {
        break forest_join_1246;
    }
    break forest_join_1251;
    }
    spill544_86 = __call544_411(__fieldRead544_410(__fieldRead544_409(receiver)));
    forestValue544_1233_0 = __integerCategory544_412(spill544_86);
    continue forest_cycle_1233;
    }
    }
    break forest_join_1268;
    }
    forest_cycle_1252: while (true) {
    if (!(__call544_415(__fieldRead544_414(__fieldRead544_413(receiver))))) {
        break forest_join_1268;
    }
    spill544_87 = life7_1668;
    if (!((life3_10 != null))) {
        forestValue544_1664_0 = spill544_87;
        break forest_join_1664;
    }
    if (!((spill544_87 != 0))) {
        break forest_join_1268;
    }
    __call544_416(receiver, new moom.gF());
    if (!((life3_10 == null))) {
        continue forest_cycle_1252;
    }
    break forest_cycle_1252;
    }
    }
    spill544_88 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1274_0 = spill544_88;
        break forest_join_1274;
    }
    if (!((__fieldRead544_417(spill544_88) == null))) {
        break forest_join_1288;
    }
    forestValue544_1274_0 = receiver;
    }
    spill544_89 = __call544_420(__fieldRead544_419(__fieldRead544_418(forestValue544_1274_0)));
    if (!((life3_10 != null))) {
        forestValue544_1281_0 = __integerCategory544_421(spill544_89);
        break forest_join_1281;
    }
    if (!(spill544_89)) {
        break forest_join_1288;
    }
    forestValue544_1281_0 = life7_1668;
    }
    if (!((forestValue544_1281_0 != 0))) {
        break forest_join_1288;
    }
    __call544_422(receiver, new moom.gF("/"));
    }
    life8_1856 = new com.moon.eu();
    __call544_425(__call544_424(__call544_423()), life8_1856);
    spill544_90 = __call544_427(__fieldRead544_426(receiver));
    if (!((life3_10 != null))) {
        forestValue544_1341_0 = __integerCategory544_428(spill544_90);
        break forest_join_1341;
    }
    if (!(spill544_90)) {
        break forest_join_1315;
    }
    spill544_91 = __call544_431(__fieldRead544_430(__fieldRead544_429(receiver)));
    if (!((life3_10 != null))) {
        forestValue544_1476_0 = __integerCategory544_432(spill544_91);
        break forest_join_1476;
    }
    if (!((!spill544_91))) {
        break forest_join_1442;
    }
    __call544_435(__fieldRead544_433(receiver), __fieldRead544_434(receiver));
    break forest_join_1442;
    }
    forest_cycle_1315: while (true) {
    forest_join_1338: {
    forest_join_1325: {
    if (!((!__call544_438(__fieldRead544_437(__fieldRead544_436(receiver)))))) {
        break forest_join_1325;
    }
    spill544_92 = __call544_439(life4_9);
    if (!((life3_10 != null))) {
        forestValue544_1368_0 = __integerCategory544_440(spill544_92);
        break forest_join_1368;
    }
    if (!(spill544_92)) {
        break forest_join_1393;
    }
    }
    life9_1906 = new com.moon.d0();
    __call544_443(__call544_442(__call544_441()), life9_1906);
    if (!((!__call544_444(life9_1906)))) {
        break forest_join_1338;
    }
    __call544_445(receiver);
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_1315;
    }
    break forest_cycle_1315;
    }
    break forest_join_1393;
    }
    forest_cycle_1341: while (true) {
    forest_join_1363: {
    forest_join_1360: {
    forest_join_1347: {
    if (!((forestValue544_1341_0 == 0))) {
        break forest_join_1347;
    }
    spill544_93 = __call544_446(life4_9);
    if (!((life3_10 != null))) {
        forestValue544_1368_0 = __integerCategory544_447(spill544_93);
        break forest_join_1368;
    }
    if (!(spill544_93)) {
        break forest_join_1393;
    }
    }
    life9_1935 = new com.moon.d0();
    __call544_450(__call544_449(__call544_448()), life9_1935);
    if (!((!__call544_451(life9_1935)))) {
        break forest_join_1360;
    }
    __call544_452(receiver);
    }
    if (!((life3_10 == null))) {
        break forest_join_1363;
    }
    break forest_join_1393;
    }
    spill544_94 = __call544_455(__fieldRead544_454(__fieldRead544_453(receiver)));
    forestValue544_1341_0 = __integerCategory544_456(spill544_94);
    continue forest_cycle_1341;
    }
    }
    forest_cycle_1368: while (true) {
    forest_join_1387: {
    forest_join_1384: {
    if (!((forestValue544_1368_0 != 0))) {
        break forest_join_1430;
    }
    life9_1960 = new com.moon.d1();
    __call544_459(__call544_458(__call544_457()), life9_1960);
    spill544_95 = __call544_460(life9_1960);
    if (!((life3_10 != null))) {
        forestValue544_1416_0 = __integerCategory544_461(spill544_95);
        break forest_join_1416;
    }
    if (!((!spill544_95))) {
        break forest_join_1384;
    }
    __call544_462(receiver);
    }
    if (!((life3_10 == null))) {
        break forest_join_1387;
    }
    break forest_join_1392;
    }
    spill544_96 = __call544_465(__fieldRead544_464(__fieldRead544_463(receiver)));
    forestValue544_1368_0 = __integerCategory544_466(spill544_96);
    continue forest_cycle_1368;
    }
    }
    break forest_join_1430;
    }
    forest_cycle_1393: while (true) {
    forest_join_1413: {
    if (!(__call544_469(__fieldRead544_468(__fieldRead544_467(receiver))))) {
        break forest_join_1430;
    }
    life9_1996 = new com.moon.d1();
    __call544_472(__call544_471(__call544_470()), life9_1996);
    spill544_97 = __call544_473(life9_1996);
    if (!((life3_10 != null))) {
        forestValue544_1416_0 = __integerCategory544_474(spill544_97);
        break forest_join_1416;
    }
    if (!((!spill544_97))) {
        break forest_join_1413;
    }
    __call544_475(receiver);
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_1393;
    }
    break forest_cycle_1393;
    }
    break forest_join_1430;
    }
    forest_cycle_1416: while (true) {
    forest_join_1424: {
    if (!((forestValue544_1416_0 != 0))) {
        break forest_join_1529;
    }
    __call544_476(receiver);
    if (!((life3_10 != null))) {
        break forest_join_1549;
    }
    if (!((life3_10 == null))) {
        break forest_join_1424;
    }
    break forest_join_1429;
    }
    spill544_98 = __call544_479(__fieldRead544_478(__fieldRead544_477(receiver)));
    forestValue544_1416_0 = __integerCategory544_480(spill544_98);
    continue forest_cycle_1416;
    }
    }
    break forest_join_1441;
    }
    forest_cycle_1430: while (true) {
    if (!(__call544_483(__fieldRead544_482(__fieldRead544_481(receiver))))) {
        break forest_join_1529;
    }
    __call544_484(receiver);
    if (!((life3_10 != null))) {
        break forest_join_1549;
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_1430;
    }
    break forest_cycle_1430;
    }
    }
    break forest_join_1529;
    }
    forest_cycle_1442: while (true) {
    forest_join_1473: {
    if (!(__call544_487(__fieldRead544_486(__fieldRead544_485(receiver))))) {
        break forest_join_1517;
    }
    life9_2060 = new com.moon.dP();
    __call544_490(__call544_489(__call544_488()), life9_2060);
    spill544_99 = __call544_491(life9_2060);
    if (!((life3_10 != null))) {
        forestValue544_1511_0 = __integerCategory544_492(spill544_99);
        break forest_join_1511;
    }
    if (!(spill544_99)) {
        break forest_join_1473;
    }
    life10_2076 = new com.moon.d0();
    __call544_495(__call544_494(__call544_493()), life10_2076);
    if (!((!__call544_496(life10_2076)))) {
        break forest_join_1473;
    }
    __call544_497(receiver);
    }
    if (!((life3_10 == null))) {
        continue forest_cycle_1442;
    }
    break forest_cycle_1442;
    }
    break forest_join_1517;
    }
    forest_cycle_1476: while (true) {
    forest_join_1506: {
    forest_join_1503: {
    if (!((forestValue544_1476_0 != 0))) {
        break forest_join_1517;
    }
    life9_2096 = new com.moon.dP();
    __call544_500(__call544_499(__call544_498()), life9_2096);
    spill544_100 = __call544_501(life9_2096);
    if (!((life3_10 != null))) {
        forestValue544_1511_0 = __integerCategory544_502(spill544_100);
        break forest_join_1511;
    }
    if (!(spill544_100)) {
        break forest_join_1503;
    }
    life10_2112 = new com.moon.d0();
    __call544_505(__call544_504(__call544_503()), life10_2112);
    if (!((!__call544_506(life10_2112)))) {
        break forest_join_1503;
    }
    __call544_507(receiver);
    }
    if (!((life3_10 == null))) {
        break forest_join_1506;
    }
    break forest_join_1517;
    }
    spill544_101 = __call544_510(__fieldRead544_509(__fieldRead544_508(receiver)));
    forestValue544_1476_0 = __integerCategory544_511(spill544_101);
    continue forest_cycle_1476;
    }
    }
    forest_cycle_1511: while (true) {
    if (!((forestValue544_1511_0 != 0))) {
        break forest_join_1523;
    }
    spill544_102 = __call544_514(__fieldRead544_513(__fieldRead544_512(receiver)));
    forestValue544_1511_0 = __integerCategory544_515(spill544_102);
    continue forest_cycle_1511;
    }
    }
    forest_cycle_1517: while (true) {
    if (!(__call544_518(__fieldRead544_517(__fieldRead544_516(receiver))))) {
        break forest_join_1523;
    }
    continue forest_cycle_1517;
    }
    }
    forest_cycle_1523: while (true) {
    if (!(__call544_521(__fieldRead544_520(__fieldRead544_519(receiver))))) {
        break forest_join_1529;
    }
    continue forest_cycle_1523;
    }
    }
    spill544_103 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1550_0 = spill544_103;
        break forest_join_1550;
    }
    if (!(__call544_524(__fieldRead544_523(__fieldRead544_522(spill544_103))))) {
        break forest_join_1549;
    }
    spill544_104 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1550_0 = spill544_104;
        break forest_join_1550;
    }
    if (!((__fieldRead544_525(spill544_104) == 0))) {
        break forest_join_1549;
    }
    spill544_105 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1550_0 = spill544_105;
        break forest_join_1550;
    }
    if (!((!__call544_527(__fieldRead544_526(spill544_105))))) {
        break forest_join_1549;
    }
    __call544_528(receiver);
    }
    forestValue544_1550_0 = receiver;
    }
    spill544_106 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1556_0 = forestValue544_1550_0;
        forestValue544_1556_1 = spill544_106;
        break forest_join_1556;
    }
    if (!((__fieldRead544_529(spill544_106) == null))) {
        forestValue544_1573_0 = forestValue544_1550_0;
        break forest_join_1573;
    }
    forestValue544_1556_0 = forestValue544_1550_0;
    forestValue544_1556_1 = receiver;
    }
    spill544_107 = __call544_532(__fieldRead544_531(__fieldRead544_530(forestValue544_1556_1)));
    if (!((life3_10 != null))) {
        forestValue544_1568_0 = forestValue544_1556_0;
        forestValue544_1568_1 = __integerCategory544_533(spill544_107);
        break forest_join_1568;
    }
    if (!((!spill544_107))) {
        forestValue544_1566_0 = forestValue544_1556_0;
        break forest_join_1566;
    }
    spill544_108 = life5_28;
    if (!((life3_10 != null))) {
        forestValue544_1568_0 = forestValue544_1556_0;
        forestValue544_1568_1 = spill544_108;
        break forest_join_1568;
    }
    if (!((spill544_108 != 0))) {
        forestValue544_1573_0 = forestValue544_1556_0;
        break forest_join_1573;
    }
    forestValue544_1566_0 = forestValue544_1556_0;
    }
    forestValue544_1568_0 = forestValue544_1566_0;
    forestValue544_1568_1 = __integerCategory544_535(__fieldRead544_534(receiver));
    }
    if (!((life3_10 != null))) {
        forestValue544_1572_0 = forestValue544_1568_0;
        forestValue544_1572_1 = forestValue544_1568_1;
        break forest_join_1572;
    }
    if (!((forestValue544_1568_1 != 0))) {
        forestValue544_1573_0 = forestValue544_1568_0;
        break forest_join_1573;
    }
    forestValue544_1572_0 = forestValue544_1568_0;
    forestValue544_1572_1 = 1;
    }
    forestValue544_1574_0 = forestValue544_1572_0;
    forestValue544_1574_1 = forestValue544_1572_1;
    break forest_join_1574;
    }
    forestValue544_1574_0 = forestValue544_1573_0;
    forestValue544_1574_1 = 0;
    }
    __call544_536(forestValue544_1574_0, forestValue544_1574_1);
    }
    forestValue544_1576_0 = receiver;
    }
    if (!((life3_10 != null))) {
        forestValue544_1662_0 = forestValue544_1576_0;
        break forest_join_1662;
    }
    if (!((__fieldRead544_537(forestValue544_1576_0) != null))) {
        break forest_join_1661;
    }
    spill544_109 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1614_0 = spill544_109;
        break forest_join_1614;
    }
    if (!((__fieldRead544_538(spill544_109) != null))) {
        break forest_join_1609;
    }
    net.minecraft.client.Minecraft __stackOp544_539_0 = receiver;
    __fieldWrite544_541(__stackOp544_539_0, (__fieldRead544_540(__stackOp544_539_0) + 1));
    spill544_110 = __fieldRead544_542(receiver);
    if (!((life3_10 != null))) {
        forestValue544_1615_0 = spill544_110;
        break forest_join_1615;
    }
    if (!((spill544_110 == __invokedynamic544_543(20640, (4286842225565234506L ^ life1_3))))) {
        break forest_join_1609;
    }
    __fieldWrite544_544(receiver, 0);
    __call544_547(__fieldRead544_545(receiver), __fieldRead544_546(receiver));
    }
    __call544_549(__fieldRead544_548(receiver), "gameRenderer");
    forestValue544_1614_0 = receiver;
    }
    forestValue544_1615_0 = __integerCategory544_551(__fieldRead544_550(forestValue544_1614_0));
    }
    if (!((life3_10 != null))) {
        forestValue544_1627_0 = forestValue544_1615_0;
        break forest_join_1627;
    }
    if (!((forestValue544_1615_0 == 0))) {
        break forest_join_1621;
    }
    __call544_553(__fieldRead544_552(receiver));
    }
    __call544_555(__fieldRead544_554(receiver), "levelRenderer");
    forestValue544_1627_0 = __integerCategory544_557(__fieldRead544_556(receiver));
    }
    if (!((life3_10 != null))) {
        forestValue544_1639_0 = forestValue544_1627_0;
        break forest_join_1639;
    }
    if (!((forestValue544_1627_0 == 0))) {
        break forest_join_1633;
    }
    __call544_559(__fieldRead544_558(receiver));
    }
    __call544_561(__fieldRead544_560(receiver), "level");
    forestValue544_1639_0 = __integerCategory544_563(__fieldRead544_562(receiver));
    }
    if (!((life3_10 != null))) {
        forestValue544_1674_0 = forestValue544_1639_0;
        break forest_join_1674;
    }
    if (!((forestValue544_1639_0 == 0))) {
        break forest_join_1670;
    }
    spill544_111 = __fieldRead544_564(receiver);
    if (!((life3_10 != null))) {
        forestValue544_1658_0 = spill544_111;
        break forest_join_1658;
    }
    if (!((__call544_565(spill544_111) > 0))) {
        break forest_join_1656;
    }
    __call544_569(__fieldRead544_566(receiver), (__call544_568(__fieldRead544_567(receiver)) - 1));
    }
    forestValue544_1658_0 = __fieldRead544_570(receiver);
    }
    __call544_571(forestValue544_1658_0);
    if (!((life3_10 == null))) {
        break forest_join_1670;
    }
    }
    forestValue544_1662_0 = receiver;
    }
    forestValue544_1664_0 = __integerCategory544_574(__call544_573(__fieldRead544_572(forestValue544_1662_0)));
    }
    if (!((life3_10 != null))) {
        forestValue544_1674_0 = forestValue544_1664_0;
        break forest_join_1674;
    }
    if (!((forestValue544_1664_0 != 0))) {
        break forest_join_1670;
    }
    __call544_576(__fieldRead544_575(receiver));
    }
    spill544_112 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1682_0 = spill544_112;
        break forest_join_1682;
    }
    forestValue544_1674_0 = __integerCategory544_578(__fieldRead544_577(spill544_112));
    }
    if (!((forestValue544_1674_0 == 0))) {
        break forest_join_1681;
    }
    __call544_580(__fieldRead544_579(receiver));
    __call544_582(__fieldRead544_581(receiver));
    }
    forestValue544_1682_0 = receiver;
    }
    if (!((life3_10 != null))) {
        forestValue544_1750_0 = forestValue544_1682_0;
        break forest_join_1750;
    }
    if (!((__fieldRead544_583(forestValue544_1682_0) != null))) {
        break forest_join_1749;
    }
    spill544_113 = __fieldRead544_584(receiver);
    if (!((life3_10 != null))) {
        forestValue544_1712_0 = __integerCategory544_585(spill544_113);
        break forest_join_1712;
    }
    if (!((!spill544_113))) {
        break forest_join_1706;
    }
    spill544_114 = __fieldRead544_586(receiver);
    if (!((__call544_588(__fieldRead544_587(receiver)) != __fieldRead544_589()))) {
        forestValue544_1700_0 = spill544_114;
        break forest_join_1700;
    }
    forestValue544_1701_0 = spill544_114;
    forestValue544_1701_1 = 1;
    break forest_join_1701;
    }
    forestValue544_1701_0 = forestValue544_1700_0;
    forestValue544_1701_1 = 0;
    }
    __call544_590(forestValue544_1701_0, forestValue544_1701_1, 1);
    __call544_592(__fieldRead544_591(receiver));
    }
    __call544_594(__fieldRead544_593(receiver), "animateTick");
    forestValue544_1712_0 = __integerCategory544_596(__fieldRead544_595(receiver));
    }
    if (!((life3_10 != null))) {
        forestValue544_1743_0 = forestValue544_1712_0;
        break forest_join_1743;
    }
    if (!((forestValue544_1712_0 == 0))) {
        break forest_join_1735;
    }
    spill544_115 = receiver;
    if (!((life3_10 != null))) {
        forestValue544_1740_0 = spill544_115;
        break forest_join_1740;
    }
    if (!((__fieldRead544_597(spill544_115) != null))) {
        break forest_join_1735;
    }
    __call544_608(__fieldRead544_598(receiver), __call544_601(__fieldRead544_600(__fieldRead544_599(receiver))), __call544_604(__fieldRead544_603(__fieldRead544_602(receiver))), __call544_607(__fieldRead544_606(__fieldRead544_605(receiver))));
    }
    __call544_610(__fieldRead544_609(receiver), "particles");
    forestValue544_1740_0 = receiver;
    }
    if (!((life3_10 != null))) {
        forestValue544_1765_0 = forestValue544_1740_0;
        break forest_join_1765;
    }
    forestValue544_1743_0 = __integerCategory544_612(__fieldRead544_611(forestValue544_1740_0));
    }
    if (!((forestValue544_1743_0 == 0))) {
        break forest_join_1761;
    }
    __call544_614(__fieldRead544_613(receiver));
    if (!((life3_10 == null))) {
        break forest_join_1761;
    }
    }
    forestValue544_1750_0 = receiver;
    }
    if (!((life3_10 != null))) {
        forestValue544_1765_0 = forestValue544_1750_0;
        break forest_join_1765;
    }
    if (!((__fieldRead544_615(forestValue544_1750_0) != null))) {
        break forest_join_1761;
    }
    __call544_617(__fieldRead544_616(receiver), "pendingConnection");
    __call544_619(__fieldRead544_618(receiver));
    }
    __call544_621(__fieldRead544_620(receiver));
    forestValue544_1765_0 = receiver;
    }
    __fieldWrite544_623(forestValue544_1765_0, __call544_622());
    __call544_627(__call544_625(__call544_624()), new com.moon.event.TickEvent(__fieldRead544_626()));
    return;
}
public static void h544_0(java.lang.Throwable p0) throws Throwable {
    throw __call3054400_0(p0);
}
public static void h544_1(java.lang.Throwable p0) throws Throwable {
    throw __call3054401_0(p0);
}
public static void h544_2(java.lang.Throwable p0) throws Throwable {
    throw __call3054402_0(p0);
}
public static void h544_3(java.lang.Throwable p0) throws Throwable {
    throw __call3054403_0(p0);
}
public static void h544_4(java.lang.Throwable p0) throws Throwable {
    throw __call3054404_0(p0);
}
public static void h544_5(java.lang.Throwable p0) throws Throwable {
    throw __call3054405_0(p0);
}
public static void h544_6(java.lang.Throwable p0) throws Throwable {
    throw __call3054406_0(p0);
}
public static void h544_7(java.lang.Throwable p0) throws Throwable {
    throw __call3054407_0(p0);
}
public static void h544_8(java.lang.Throwable p0) throws Throwable {
    throw __call3054408_0(p0);
}
public static void h544_9(java.lang.Throwable p0) throws Throwable {
    throw __call3054409_0(p0);
}
public static void h544_10(java.lang.Throwable p0) throws Throwable {
    throw __call3054410_0(p0);
}
public static void h544_11(java.lang.Throwable p0) throws Throwable {
    throw __call3054411_0(p0);
}
public static void h544_12(java.lang.Throwable p0) throws Throwable {
    throw __call3054412_0(p0);
}
public static void h544_13(java.lang.Throwable p0) throws Throwable {
    throw __call3054413_0(p0);
}
public static void h544_14(java.lang.Throwable p0) throws Throwable {
    throw __call3054414_0(p0);
}
public static void h544_15(java.lang.Throwable p0) throws Throwable {
    throw __call3054415_0(p0);
}
public static void h544_16(java.lang.Throwable p0) throws Throwable {
    throw __call3054416_0(p0);
}
public static void h544_17(java.lang.Throwable p0) throws Throwable {
    throw __call3054417_0(p0);
}
public static void h544_18(java.lang.Throwable p0) throws Throwable {
    throw __call3054418_0(p0);
}
public static void h544_19(java.lang.Throwable p0) throws Throwable {
    throw __call3054419_0(p0);
}
public static void h544_20(java.lang.Throwable p0) throws Throwable {
    throw __call3054420_0(p0);
}
public static void h544_21(java.lang.Throwable p0) throws Throwable {
    throw __call3054421_0(p0);
}
public static void h544_22(java.lang.Throwable p0) throws Throwable {
    throw __call3054422_0(p0);
}
public static void h544_23(java.lang.Throwable p0) throws Throwable {
    throw __call3054423_0(p0);
}
public static void h544_24(java.lang.Throwable p0) throws Throwable {
    throw __call3054424_0(p0);
}
public static void h544_25(java.lang.Throwable p0) throws Throwable {
    throw __call3054425_0(p0);
}
public static void h544_26(java.lang.Throwable p0) throws Throwable {
    throw __call3054426_0(p0);
}
public static void h544_27(java.lang.Throwable p0) throws Throwable {
    throw __call3054427_0(p0);
}
public static void h544_28(java.lang.Throwable p0) throws Throwable {
    throw __call3054428_0(p0);
}
public static void h544_29(java.lang.Throwable p0) throws Throwable {
    throw __call3054429_0(p0);
}
public static void h544_30(java.lang.Throwable p0) throws Throwable {
    throw __call3054430_0(p0);
}
public static void h544_31(java.lang.Throwable p0) throws Throwable {
    throw __call3054431_0(p0);
}
public static void h544_32(java.lang.Throwable p0, net.minecraft.client.Minecraft p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    moom.qZ life4_10;
    life2_2 = p0;
    life3_6 = __call3054432_0(life2_2, "Updating screen events");
    life4_10 = __call3054432_1(life3_6, "Affected screen");
    __call3054432_3(life4_10, "Screen name", __invokedynamic3054432_2(p1));
    throw new moom.Oo(life3_6);
}
public static void h544_33(java.lang.Throwable p0) throws Throwable {
    throw __call3054433_0(p0);
}
public static void h544_34(java.lang.Throwable p0, net.minecraft.client.Minecraft p1) throws Throwable {
    java.lang.Throwable life2_2;
    moom.qY life3_6;
    moom.qZ life4_10;
    life2_2 = p0;
    life3_6 = __call3054434_0(life2_2, "Ticking screen");
    life4_10 = __call3054434_1(life3_6, "Affected screen");
    __call3054434_3(life4_10, "Screen name", __invokedynamic3054434_2(p1));
    throw new moom.Oo(life3_6);
}
public static void h544_35(java.lang.Throwable p0) throws Throwable {
    throw __call3054435_0(p0);
}
public static void h544_36(java.lang.Throwable p0) throws Throwable {
    throw __call3054436_0(p0);
}
public static void h544_37(java.lang.Throwable p0) throws Throwable {
    throw __call3054437_0(p0);
}
public static void h544_38(java.lang.Throwable p0) throws Throwable {
    throw __call3054438_0(p0);
}
public static void h544_39(java.lang.Throwable p0) throws Throwable {
    throw __call3054439_0(p0);
}
public static void h544_40(java.lang.Throwable p0) throws Throwable {
    throw __call3054440_0(p0);
}
public static void h544_41(java.lang.Throwable p0) throws Throwable {
    throw __call3054441_0(p0);
}
public static void h544_42(java.lang.Throwable p0) throws Throwable {
    throw __call3054442_0(p0);
}
public static void h544_43(java.lang.Throwable p0) throws Throwable {
    throw __call3054443_0(p0);
}
public static void h544_44(java.lang.Throwable p0) throws Throwable {
    throw __call3054444_0(p0);
}
public static void h544_45(java.lang.Throwable p0) throws Throwable {
    throw __call3054445_0(p0);
}
public static void h544_46(java.lang.Throwable p0) throws Throwable {
    throw __call3054446_0(p0);
}
public static void h544_47(java.lang.Throwable p0) throws Throwable {
    throw __call3054447_0(p0);
}
public static void h544_48(java.lang.Throwable p0) throws Throwable {
    throw __call3054448_0(p0);
}
public static void h544_49(java.lang.Throwable p0) throws Throwable {
    throw __call3054449_0(p0);
}
public static void h544_50(java.lang.Throwable p0) throws Throwable {
    throw __call3054450_0(p0);
}
public static void h544_51(java.lang.Throwable p0) throws Throwable {
    throw __call3054451_0(p0);
}
public static void h544_52(java.lang.Throwable p0) throws Throwable {
    throw __call3054452_0(p0);
}
public static void h544_53(java.lang.Throwable p0) throws Throwable {
    throw __call3054453_0(p0);
}
public static void h544_54(java.lang.Throwable p0) throws Throwable {
    throw __call3054454_0(p0);
}
public static void h544_55(java.lang.Throwable p0) throws Throwable {
    throw __call3054455_0(p0);
}
public static void h544_56(java.lang.Throwable p0) throws Throwable {
    throw __call3054456_0(p0);
}
public static void h544_57(java.lang.Throwable p0) throws Throwable {
    throw __call3054457_0(p0);
}
public static void h544_58(java.lang.Throwable p0) throws Throwable {
    throw __call3054458_0(p0);
}
public static void h544_59(java.lang.Throwable p0) throws Throwable {
    throw __call3054459_0(p0);
}
public static void h544_60(java.lang.Throwable p0) throws Throwable {
    throw __call3054460_0(p0);
}
public static void h544_61(java.lang.Throwable p0) throws Throwable {
    throw __call3054461_0(p0);
}
public static void h544_62(java.lang.Throwable p0) throws Throwable {
    throw __call3054462_0(p0);
}
public static void h544_63(java.lang.Throwable p0) throws Throwable {
    throw __call3054463_0(p0);
}
public static void h544_64(java.lang.Throwable p0) throws Throwable {
    throw __call3054464_0(p0);
}
public static void h544_65(java.lang.Throwable p0) throws Throwable {
    throw __call3054465_0(p0);
}
public static void h544_66(java.lang.Throwable p0) throws Throwable {
    throw __call3054466_0(p0);
}
public static void h544_67(java.lang.Throwable p0) throws Throwable {
    throw __call3054467_0(p0);
}
public static void h544_68(java.lang.Throwable p0) throws Throwable {
    throw __call3054468_0(p0);
}
public static void h544_69(java.lang.Throwable p0) throws Throwable {
    throw __call3054469_0(p0);
}
public static void h544_70(java.lang.Throwable p0) throws Throwable {
    throw __call3054470_0(p0);
}
public static void h544_71(java.lang.Throwable p0) throws Throwable {
    throw __call3054471_0(p0);
}
public static void h544_72(java.lang.Throwable p0) throws Throwable {
    throw __call3054472_0(p0);
}
public static void h544_73(java.lang.Throwable p0) throws Throwable {
    throw __call3054473_0(p0);
}
public static void h544_74(java.lang.Throwable p0) throws Throwable {
    throw __call3054474_0(p0);
}
public static void h544_75(java.lang.Throwable p0) throws Throwable {
    throw __call3054475_0(p0);
}
public static void h544_76(java.lang.Throwable p0) throws Throwable {
    throw __call3054476_0(p0);
}
public static void h544_77(java.lang.Throwable p0) throws Throwable {
    throw __call3054477_0(p0);
}
public static void h544_78(java.lang.Throwable p0) throws Throwable {
    throw __call3054478_0(p0);
}
public static void h544_79(java.lang.Throwable p0) throws Throwable {
    throw __call3054479_0(p0);
}
public static void h544_80(java.lang.Throwable p0) throws Throwable {
    throw __call3054480_0(p0);
}
public static void h544_81(java.lang.Throwable p0) throws Throwable {
    throw __call3054481_0(p0);
}
public static void h544_82(java.lang.Throwable p0) throws Throwable {
    throw __call3054482_0(p0);
}
public static void h544_83(java.lang.Throwable p0) throws Throwable {
    throw __call3054483_0(p0);
}
public static void h544_84(java.lang.Throwable p0) throws Throwable {
    throw __call3054484_0(p0);
}
public static void h544_85(java.lang.Throwable p0) throws Throwable {
    throw __call3054485_0(p0);
}
public static void h544_86(java.lang.Throwable p0) throws Throwable {
    throw __call3054486_0(p0);
}
public static void h544_87(java.lang.Throwable p0) throws Throwable {
    throw __call3054487_0(p0);
}
public static void h544_88(java.lang.Throwable p0) throws Throwable {
    throw __call3054488_0(p0);
}
public static void h544_89(java.lang.Throwable p0) throws Throwable {
    throw __call3054489_0(p0);
}
public static void h544_90(java.lang.Throwable p0) throws Throwable {
    throw __call3054490_0(p0);
}
public static void h544_91(java.lang.Throwable p0) throws Throwable {
    throw __call3054491_0(p0);
}
public static void h544_92(java.lang.Throwable p0) throws Throwable {
    throw __call3054492_0(p0);
}
public static void h544_93(java.lang.Throwable p0) throws Throwable {
    throw __call3054493_0(p0);
}
public static void h544_94(java.lang.Throwable p0) throws Throwable {
    throw __call3054494_0(p0);
}
public static void h544_95(java.lang.Throwable p0) throws Throwable {
    throw __call3054495_0(p0);
}
public static void h544_96(java.lang.Throwable p0) throws Throwable {
    throw __call3054496_0(p0);
}
public static void h544_97(java.lang.Throwable p0) throws Throwable {
    throw __call3054497_0(p0);
}
public static void h544_98(java.lang.Throwable p0) throws Throwable {
    throw __call3054498_0(p0);
}
public static void h544_99(java.lang.Throwable p0) throws Throwable {
    throw __call3054499_0(p0);
}
public static void h544_100(java.lang.Throwable p0) throws Throwable {
    throw __call3054500_0(p0);
}
public static void h544_101(java.lang.Throwable p0) throws Throwable {
    throw __call3054501_0(p0);
}
public static void h544_102(java.lang.Throwable p0) throws Throwable {
    throw __call3054502_0(p0);
}
public static void h544_103(java.lang.Throwable p0) throws Throwable {
    throw __call3054503_0(p0);
}
public static void h544_104(java.lang.Throwable p0) throws Throwable {
    throw __call3054504_0(p0);
}
public static void h544_105(java.lang.Throwable p0) throws Throwable {
    throw __call3054505_0(p0);
}
public static void h544_106(java.lang.Throwable p0) throws Throwable {
    throw __call3054506_0(p0);
}
public static void h544_107(java.lang.Throwable p0) throws Throwable {
    throw __call3054507_0(p0);
}
public static void h544_108(java.lang.Throwable p0) throws Throwable {
    throw __call3054508_0(p0);
}
public static void h544_109(java.lang.Throwable p0) throws Throwable {
    throw __call3054509_0(p0);
}
public static void h544_110(java.lang.Throwable p0) throws Throwable {
    throw __call3054510_0(p0);
}
public static void h544_111(java.lang.Throwable p0) throws Throwable {
    throw __call3054511_0(p0);
}
public static void h544_112(java.lang.Throwable p0) throws Throwable {
    throw __call3054512_0(p0);
}
public static void h544_113(java.lang.Throwable p0) throws Throwable {
    throw __call3054513_0(p0);
}
public static void h544_114(java.lang.Throwable p0) throws Throwable {
    throw __call3054514_0(p0);
}
public static void h544_115(java.lang.Throwable p0) throws Throwable {
    throw __call3054515_0(p0);
}
public static void h544_116(java.lang.Throwable p0) throws Throwable {
    throw __call3054516_0(p0);
}
public static void h544_117(java.lang.Throwable p0) throws Throwable {
    throw __call3054517_0(p0);
}
public static void h544_118(java.lang.Throwable p0) throws Throwable {
    throw __call3054518_0(p0);
}
public static void h544_119(java.lang.Throwable p0) throws Throwable {
    throw __call3054519_0(p0);
}
public static void h544_120(java.lang.Throwable p0) throws Throwable {
    throw __call3054520_0(p0);
}
public static void h544_121(java.lang.Throwable p0) throws Throwable {
    throw __call3054521_0(p0);
}
public static void h544_122(java.lang.Throwable p0) throws Throwable {
    throw __call3054522_0(p0);
}
public static void h544_123(java.lang.Throwable p0) throws Throwable {
    throw __call3054523_0(p0);
}
public static void h544_124(java.lang.Throwable p0) throws Throwable {
    throw __call3054524_0(p0);
}
public static void h544_125(java.lang.Throwable p0) throws Throwable {
    throw __call3054525_0(p0);
}
public static void h544_126(java.lang.Throwable p0) throws Throwable {
    throw __call3054526_0(p0);
}
public static void h544_127(java.lang.Throwable p0) throws Throwable {
    throw __call3054527_0(p0);
}
public static void h544_128(java.lang.Throwable p0) throws Throwable {
    throw __call3054528_0(p0);
}
public static void h544_129(java.lang.Throwable p0) throws Throwable {
    throw __call3054529_0(p0);
}
public static void h544_130(java.lang.Throwable p0) throws Throwable {
    throw __call3054530_0(p0);
}
public static void h544_131(java.lang.Throwable p0) throws Throwable {
    throw __call3054531_0(p0);
}
public static void h544_132(java.lang.Throwable p0) throws Throwable {
    throw __call3054532_0(p0);
}
public static void h544_133(java.lang.Throwable p0) throws Throwable {
    throw __call3054533_0(p0);
}
public static void h544_134(java.lang.Throwable p0) throws Throwable {
    throw __call3054534_0(p0);
}
public static void h544_135(java.lang.Throwable p0) throws Throwable {
    throw __call3054535_0(p0);
}
public static void h544_136(java.lang.Throwable p0) throws Throwable {
    throw __call3054536_0(p0);
}
public static void h544_137(java.lang.Throwable p0) throws Throwable {
    throw __call3054537_0(p0);
}
public static void h544_138(java.lang.Throwable p0) throws Throwable {
    throw __call3054538_0(p0);
}
public static void h544_139(java.lang.Throwable p0) throws Throwable {
    throw __call3054539_0(p0);
}
public static void h544_140(java.lang.Throwable p0) throws Throwable {
    throw __call3054540_0(p0);
}
public static void h544_141(java.lang.Throwable p0) throws Throwable {
    throw __call3054541_0(p0);
}
public static void h544_142(java.lang.Throwable p0) throws Throwable {
    throw __call3054542_0(p0);
}
public static void h544_143(java.lang.Throwable p0) throws Throwable {
    throw __call3054543_0(p0);
}
public static void h544_144(java.lang.Throwable p0) throws Throwable {
    throw __call3054544_0(p0);
}
public static void h544_145(java.lang.Throwable p0) throws Throwable {
    throw __call3054545_0(p0);
}
public static void h544_146(java.lang.Throwable p0) throws Throwable {
    throw __call3054546_0(p0);
}
public static void h544_147(java.lang.Throwable p0) throws Throwable {
    throw __call3054547_0(p0);
}
public static void h544_148(java.lang.Throwable p0) throws Throwable {
    throw __call3054548_0(p0);
}
public static void h544_149(java.lang.Throwable p0) throws Throwable {
    throw __call3054549_0(p0);
}
public static void h544_150(java.lang.Throwable p0) throws Throwable {
    throw __call3054550_0(p0);
}
public static void h544_151(java.lang.Throwable p0) throws Throwable {
    throw __call3054551_0(p0);
}
public static void h544_152(java.lang.Throwable p0) throws Throwable {
    throw __call3054552_0(p0);
}
public static void h544_153(java.lang.Throwable p0) throws Throwable {
    throw __call3054553_0(p0);
}
public static void h544_154(java.lang.Throwable p0) throws Throwable {
    throw __call3054554_0(p0);
}
public static void h544_155(java.lang.Throwable p0) throws Throwable {
    throw __call3054555_0(p0);
}
public static void h544_156(java.lang.Throwable p0) throws Throwable {
    throw __call3054556_0(p0);
}
public static void h544_157(java.lang.Throwable p0) throws Throwable {
    throw __call3054557_0(p0);
}
public static void h544_158(java.lang.Throwable p0) throws Throwable {
    throw __call3054558_0(p0);
}
public static void h544_159(java.lang.Throwable p0) throws Throwable {
    throw __call3054559_0(p0);
}
public static void h544_160(java.lang.Throwable p0) throws Throwable {
    throw __call3054560_0(p0);
}
public static void h544_161(java.lang.Throwable p0) throws Throwable {
    throw __call3054561_0(p0);
}
public static void h544_162(java.lang.Throwable p0) throws Throwable {
    throw __call3054562_0(p0);
}
public static void h544_163(java.lang.Throwable p0) throws Throwable {
    throw __call3054563_0(p0);
}
public static void h544_164(java.lang.Throwable p0) throws Throwable {
    throw __call3054564_0(p0);
}
public static void h544_165(java.lang.Throwable p0) throws Throwable {
    throw __call3054565_0(p0);
}
public static void h544_166(java.lang.Throwable p0) throws Throwable {
    throw __call3054566_0(p0);
}
public static void h544_167(java.lang.Throwable p0) throws Throwable {
    throw __call3054567_0(p0);
}
public static void h544_168(java.lang.Throwable p0) throws Throwable {
    throw __call3054568_0(p0);
}
public static void h544_169(java.lang.Throwable p0) throws Throwable {
    throw __call3054569_0(p0);
}
public static void h544_170(java.lang.Throwable p0) throws Throwable {
    throw __call3054570_0(p0);
}
public static void h544_171(java.lang.Throwable p0) throws Throwable {
    throw __call3054571_0(p0);
}
public static void h544_172(java.lang.Throwable p0) throws Throwable {
    throw __call3054572_0(p0);
}
public static void h544_173(java.lang.Throwable p0) throws Throwable {
    throw __call3054573_0(p0);
}
public static void h544_174(java.lang.Throwable p0) throws Throwable {
    throw __call3054574_0(p0);
}
public static void h544_175(java.lang.Throwable p0) throws Throwable {
    throw __call3054575_0(p0);
}
public static void h544_176(java.lang.Throwable p0) throws Throwable {
    throw __call3054576_0(p0);
}
public static void h544_177(java.lang.Throwable p0) throws Throwable {
    throw __call3054577_0(p0);
}
public static void h544_178(java.lang.Throwable p0) throws Throwable {
    throw __call3054578_0(p0);
}
public static void h544_179(java.lang.Throwable p0) throws Throwable {
    throw __call3054579_0(p0);
}
public static void h544_180(java.lang.Throwable p0) throws Throwable {
    throw __call3054580_0(p0);
}
public static void h544_181(java.lang.Throwable p0) throws Throwable {
    throw __call3054581_0(p0);
}
public static void h544_182(java.lang.Throwable p0) throws Throwable {
    throw __call3054582_0(p0);
}
public static void h544_183(java.lang.Throwable p0) throws Throwable {
    throw __call3054583_0(p0);
}
public static void h544_184(java.lang.Throwable p0) throws Throwable {
    throw __call3054584_0(p0);
}
public static void h544_185(java.lang.Throwable p0) throws Throwable {
    throw __call3054585_0(p0);
}
public static void h544_186(java.lang.Throwable p0) throws Throwable {
    throw __call3054586_0(p0);
}
public static void h544_187(java.lang.Throwable p0) throws Throwable {
    throw __call3054587_0(p0);
}
public static void h544_188(java.lang.Throwable p0) throws Throwable {
    throw __call3054588_0(p0);
}
public static void h544_189(java.lang.Throwable p0) throws Throwable {
    throw __call3054589_0(p0);
}
public static void h544_190(java.lang.Throwable p0) throws Throwable {
    throw __call3054590_0(p0);
}
public static void h544_191(java.lang.Throwable p0) throws Throwable {
    throw __call3054591_0(p0);
}
public static void h544_192(java.lang.Throwable p0) throws Throwable {
    throw __call3054592_0(p0);
}
public static void h544_193(java.lang.Throwable p0) throws Throwable {
    throw __call3054593_0(p0);
}
public static void h544_194(java.lang.Throwable p0) throws Throwable {
    throw __call3054594_0(p0);
}
public static void h544_195(java.lang.Throwable p0) throws Throwable {
    throw __call3054595_0(p0);
}
public static void h544_196(java.lang.Throwable p0) throws Throwable {
    throw __call3054596_0(p0);
}
public static void h544_197(java.lang.Throwable p0) throws Throwable {
    throw __call3054597_0(p0);
}
public static void h544_198(java.lang.Throwable p0) throws Throwable {
    throw __call3054598_0(p0);
}
public static void h544_199(java.lang.Throwable p0) throws Throwable {
    throw __call3054599_0(p0);
}
public static void h544_200(java.lang.Throwable p0) throws Throwable {
    throw __call3054600_0(p0);
}
public static void h544_201(java.lang.Throwable p0) throws Throwable {
    throw __call3054601_0(p0);
}
public static void h544_202(java.lang.Throwable p0) throws Throwable {
    throw __call3054602_0(p0);
}
public static void h544_203(java.lang.Throwable p0) throws Throwable {
    throw __call3054603_0(p0);
}
public static void h544_204(java.lang.Throwable p0) throws Throwable {
    throw __call3054604_0(p0);
}
public static void h544_205(java.lang.Throwable p0) throws Throwable {
    throw __call3054605_0(p0);
}
public static void h544_206(java.lang.Throwable p0) throws Throwable {
    throw __call3054606_0(p0);
}
public static void h544_207(java.lang.Throwable p0) throws Throwable {
    throw __call3054607_0(p0);
}
public static void h544_208(java.lang.Throwable p0) throws Throwable {
    throw __call3054608_0(p0);
}
public static void h544_209(java.lang.Throwable p0) throws Throwable {
    throw __call3054609_0(p0);
}
public static void h544_210(java.lang.Throwable p0) throws Throwable {
    throw __call3054610_0(p0);
}
public static void h544_211(java.lang.Throwable p0) throws Throwable {
    throw __call3054611_0(p0);
}
public static void h544_212(java.lang.Throwable p0) throws Throwable {
    throw __call3054612_0(p0);
}
public static void h544_213(java.lang.Throwable p0) throws Throwable {
    throw __call3054613_0(p0);
}
public static void h544_214(java.lang.Throwable p0) throws Throwable {
    throw __call3054614_0(p0);
}
public static void h544_215(java.lang.Throwable p0) throws Throwable {
    throw __call3054615_0(p0);
}
public static void h544_216(java.lang.Throwable p0) throws Throwable {
    throw __call3054616_0(p0);
}
public static void h544_217(java.lang.Throwable p0) throws Throwable {
    throw __call3054617_0(p0);
}
public static void h544_218(java.lang.Throwable p0) throws Throwable {
    throw __call3054618_0(p0);
}
public static void h544_219(java.lang.Throwable p0) throws Throwable {
    throw __call3054619_0(p0);
}
public static void h544_220(java.lang.Throwable p0) throws Throwable {
    throw __call3054620_0(p0);
}
public static void h544_221(java.lang.Throwable p0) throws Throwable {
    throw __call3054621_0(p0);
}
public static void h544_222(java.lang.Throwable p0) throws Throwable {
    throw __call3054622_0(p0);
}
public static void h544_223(java.lang.Throwable p0) throws Throwable {
    throw __call3054623_0(p0);
}
public static void h544_224(java.lang.Throwable p0) throws Throwable {
    throw __call3054624_0(p0);
}
public static void h544_225(java.lang.Throwable p0) throws Throwable {
    throw __call3054625_0(p0);
}
public static void h544_226(java.lang.Throwable p0) throws Throwable {
    throw __call3054626_0(p0);
}
public static void h544_227(java.lang.Throwable p0) throws Throwable {
    throw __call3054627_0(p0);
}
public static void h544_228(java.lang.Throwable p0) throws Throwable {
    throw __call3054628_0(p0);
}
public static void h544_229(java.lang.Throwable p0) throws Throwable {
    throw __call3054629_0(p0);
}
public static void h544_230(java.lang.Throwable p0) throws Throwable {
    throw __call3054630_0(p0);
}
public static void h544_231(java.lang.Throwable p0) throws Throwable {
    throw __call3054631_0(p0);
}
public static void h544_232(java.lang.Throwable p0) throws Throwable {
    throw __call3054632_0(p0);
}
public static void h544_233(java.lang.Throwable p0) throws Throwable {
    throw __call3054633_0(p0);
}
public static void h544_234(java.lang.Throwable p0) throws Throwable {
    throw __call3054634_0(p0);
}
public static void h544_235(java.lang.Throwable p0) throws Throwable {
    throw __call3054635_0(p0);
}
public static void h544_236(java.lang.Throwable p0) throws Throwable {
    throw __call3054636_0(p0);
}
public static void h544_237(java.lang.Throwable p0) throws Throwable {
    throw __call3054637_0(p0);
}
public static void h544_238(java.lang.Throwable p0) throws Throwable {
    throw __call3054638_0(p0);
}
public static void h544_239(java.lang.Throwable p0) throws Throwable {
    throw __call3054639_0(p0);
}
public static void h544_240(java.lang.Throwable p0) throws Throwable {
    throw __call3054640_0(p0);
}
public static void h544_241(java.lang.Throwable p0) throws Throwable {
    throw __call3054641_0(p0);
}
public static void h544_242(java.lang.Throwable p0) throws Throwable {
    throw __call3054642_0(p0);
}
public static void h544_243(java.lang.Throwable p0) throws Throwable {
    throw __call3054643_0(p0);
}
public static void h544_244(java.lang.Throwable p0) throws Throwable {
    throw __call3054644_0(p0);
}
public static void h544_245(java.lang.Throwable p0) throws Throwable {
    throw __call3054645_0(p0);
}
public static void h544_246(java.lang.Throwable p0) throws Throwable {
    throw __call3054646_0(p0);
}
public static void h544_247(java.lang.Throwable p0) throws Throwable {
    throw __call3054647_0(p0);
}
public static void h544_248(java.lang.Throwable p0) throws Throwable {
    throw __call3054648_0(p0);
}
public static void h544_249(java.lang.Throwable p0) throws Throwable {
    throw __call3054649_0(p0);
}
public static void h544_250(java.lang.Throwable p0) throws Throwable {
    throw __call3054650_0(p0);
}
public static void h544_251(java.lang.Throwable p0, net.minecraft.client.Minecraft p1, int[] p2) throws Throwable {
    net.minecraft.client.multiplayer.WorldClient forestValue3054651_23_0;
    net.minecraft.client.multiplayer.WorldClient spill3054651_0;
    java.lang.Throwable life3_2;
    moom.qY life4_6;
    moom.qZ life5_16;
    forest_join_26: {
    forest_join_23: {
    forest_join_21: {
    life3_2 = p0;
    life4_6 = __call3054651_0(life3_2, "Exception in world tick");
    spill3054651_0 = __fieldRead3054651_1(p1);
    if (!((p2 != null))) {
        forestValue3054651_23_0 = spill3054651_0;
        break forest_join_23;
    }
    if (!((spill3054651_0 == null))) {
        break forest_join_21;
    }
    life5_16 = __call3054651_2(life4_6, "Affected level");
    __call3054651_3(life5_16, "Problem", "Level is null!");
    if (!((p2 == null))) {
        break forest_join_26;
    }
    }
    forestValue3054651_23_0 = __fieldRead3054651_4(p1);
    }
    __call3054651_5(forestValue3054651_23_0, life4_6);
    }
    throw new moom.Oo(life4_6);
}
public static void h544_252(java.lang.Throwable p0) throws Throwable {
    throw __call3054652_0(p0);
}
public static void h544_253(java.lang.Throwable p0) throws Throwable {
    throw __call3054653_0(p0);
}
public static void h544_254(java.lang.Throwable p0) throws Throwable {
    throw __call3054654_0(p0);
}
public static void h544_255(java.lang.Throwable p0) throws Throwable {
    throw __call3054655_0(p0);
}
public static void h544_256(java.lang.Throwable p0) throws Throwable {
    throw __call3054656_0(p0);
}
public static void h544_257(java.lang.Throwable p0) throws Throwable {
    throw __call3054657_0(p0);
}
public static void h544_258(java.lang.Throwable p0) throws Throwable {
    throw __call3054658_0(p0);
}
public static void h544_259(java.lang.Throwable p0) throws Throwable {
    throw __call3054659_0(p0);
}
public static void h544_260(java.lang.Throwable p0) throws Throwable {
    throw __call3054660_0(p0);
}
public static void h544_261(java.lang.Throwable p0) throws Throwable {
    throw __call3054661_0(p0);
}
public static void h544_262(java.lang.Throwable p0) throws Throwable {
    throw __call3054662_0(p0);
}
private static native long __fieldRead544_0() throws Throwable;
private static native int[] __call544_1() throws Throwable;
private static native com.moon.event.TickPhase __fieldRead544_2() throws Throwable;
private static native com.moon.runtime.ClientContext __call544_3() throws Throwable;
private static native com.moon.events.EventBus __call544_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_5(com.moon.events.EventBus a0, com.moon.event.TickEvent a1) throws Throwable;
private static native int __call544_6(com.moon.event.TickEvent a0) throws Throwable;
private static native int __fieldRead544_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead544_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite544_10(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead544_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_12(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead544_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_14(boolean value) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead544_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_16(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native moom.A9 __fieldRead544_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_18(moom.A9 a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead544_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_20(net.minecraft.client.renderer.EntityRenderer a0, float a1) throws Throwable;
private static native moom.A9 __fieldRead544_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_22(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead544_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_24(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.jI __fieldRead544_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_27(moom.jI a0) throws Throwable;
private static native moom.A9 __fieldRead544_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_29(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead544_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_31(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead544_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_33(net.minecraft.client.renderer.texture.TextureManager a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call544_37(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __numericCompare544_38(float a0, float a1) throws Throwable;
private static native void __call544_39(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_41(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory544_42(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_44(net.minecraft.client.Minecraft a0, moom.gG a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_45(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_46(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf544_47(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_48(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_49(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call544_50(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_51(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic544_52(int a0, long a1) throws Throwable;
private static native void __fieldWrite544_53(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_54(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_56(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_57(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_58(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_59(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native com.moon.nW __fieldRead544_60(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __invokedynamic544_61(int a0, long a1) throws Throwable;
private static native boolean __call544_62(com.moon.nW a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_63(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead544_64() throws Throwable;
private static native java.util.List __fieldRead544_65() throws Throwable;
private static native java.util.Iterator __call544_66(java.util.List a0) throws Throwable;
private static native boolean __call544_67(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call544_68(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast544_69(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call544_70(java.lang.String a0) throws Throwable;
private static native boolean __call544_71(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory544_72(boolean value) throws Throwable;
private static native int __integerCategory544_73(boolean value) throws Throwable;
private static native java.lang.String __call544_74(java.lang.String a0) throws Throwable;
private static native boolean __call544_75(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory544_76(boolean value) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_77(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_78(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_79(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_80(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_81(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_82(moom.pz a0) throws Throwable;
private static native int __integerCategory544_83(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_84(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_85(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call544_86(moom.pz a0) throws Throwable;
private static native long __call544_87() throws Throwable;
private static native int __call544_88(long a0, int a1) throws Throwable;
private static native void __call544_89(int a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_90(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_91(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_92(moom.pz a0) throws Throwable;
private static native int __integerCategory544_93(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_94(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_95(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call544_96(moom.pz a0) throws Throwable;
private static native int __invokedynamic544_97(int a0, long a1) throws Throwable;
private static native long __call544_98() throws Throwable;
private static native int __call544_99(long a0, int a1) throws Throwable;
private static native void __call544_100(int a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead544_101(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_102(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __call544_103() throws Throwable;
private static native int __call544_104() throws Throwable;
private static native boolean __call544_105() throws Throwable;
private static native int __integerCategory544_106(boolean value) throws Throwable;
private static native boolean __call544_107() throws Throwable;
private static native int __integerCategory544_108(boolean value) throws Throwable;
private static native int __invokedynamic544_109(int a0, long a1) throws Throwable;
private static native void __call544_110(int a0, int a1) throws Throwable;
private static native boolean __integerCategory544_111(int value) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_112() throws Throwable;
private static native com.moon.events.EventBus __call544_113(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_114(com.moon.events.EventBus a0, com.moon.eJ a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_115(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_116(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory544_117(boolean value) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead544_118(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.hI __call544_119(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call544_120(moom.hI a0) throws Throwable;
private static native int __invokedynamic544_121(int a0, long a1) throws Throwable;
private static native void __call544_122(int a0) throws Throwable;
private static native long __call544_123() throws Throwable;
private static native long __fieldRead544_124(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __invokedynamic544_125(int a0, long a1) throws Throwable;
private static native int __numericCompare544_126(long a0, long a1) throws Throwable;
private static native int __call544_127() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_128(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_129(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory544_130(boolean value) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead544_131(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.hI __call544_132(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native boolean __call544_133(moom.hI a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead544_134(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.hI __call544_135(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call544_136(moom.hI a0, int a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_137(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead544_138(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native float __call544_139(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native float __call544_140(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_141(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead544_142(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call544_143(net.minecraft.entity.player.PlayerCapabilities a0, float a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_144(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead544_145(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call544_146(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_147(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_148(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_149(boolean value) throws Throwable;
private static native boolean __call544_150() throws Throwable;
private static native int __integerCategory544_151(boolean value) throws Throwable;
private static native void __call544_152(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_153(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_154(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_155(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native int __fieldRead544_156(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead544_158(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite544_159(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native moom.A9 __fieldRead544_160(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_161(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __call544_162() throws Throwable;
private static native int __call544_163() throws Throwable;
private static native char __call544_164() throws Throwable;
private static native int __invokedynamic544_165(int a0, long a1) throws Throwable;
private static native int __call544_166() throws Throwable;
private static native boolean __call544_167() throws Throwable;
private static native void __call544_168(int a0, boolean a1) throws Throwable;
private static native boolean __call544_169() throws Throwable;
private static native int __integerCategory544_170(boolean value) throws Throwable;
private static native boolean __integerCategory544_171(int value) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_172() throws Throwable;
private static native com.moon.events.EventBus __call544_173(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_174(com.moon.events.EventBus a0, com.moon.eI a1) throws Throwable;
private static native void __call544_175(int a0) throws Throwable;
private static native long __fieldRead544_176(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __numericCompare544_177(long a0, long a1) throws Throwable;
private static native long __call544_178() throws Throwable;
private static native long __fieldRead544_179(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __invokedynamic544_180(int a0, long a1) throws Throwable;
private static native int __numericCompare544_181(long a0, long a1) throws Throwable;
private static native int __invokedynamic544_182(int a0, long a1) throws Throwable;
private static native boolean __call544_183(int a0) throws Throwable;
private static native int __integerCategory544_184(boolean value) throws Throwable;
private static native int __invokedynamic544_185(int a0, long a1) throws Throwable;
private static native boolean __call544_186(int a0) throws Throwable;
private static native int __integerCategory544_187(boolean value) throws Throwable;
private static native long __invokedynamic544_188(int a0, long a1) throws Throwable;
private static native void __fieldWrite544_189(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native int __invokedynamic544_190(int a0, long a1) throws Throwable;
private static native boolean __call544_191(int a0) throws Throwable;
private static native int __integerCategory544_192(boolean value) throws Throwable;
private static native int __invokedynamic544_193(int a0, long a1) throws Throwable;
private static native boolean __call544_194(int a0) throws Throwable;
private static native int __integerCategory544_195(boolean value) throws Throwable;
private static native long __call544_196() throws Throwable;
private static native void __fieldWrite544_197(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native void __call544_198(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_199() throws Throwable;
private static native int __integerCategory544_200(boolean value) throws Throwable;
private static native int __invokedynamic544_201(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead544_202(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead544_203(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_204(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_205(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_206(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_207(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native void __call544_208(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic544_209(int a0, long a1) throws Throwable;
private static native int __invokedynamic544_210(int a0, long a1) throws Throwable;
private static native boolean __call544_211(int a0) throws Throwable;
private static native int __integerCategory544_212(boolean value) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead544_213(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead544_214(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call544_215(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call544_216(moom.gB a0) throws Throwable;
private static native int __invokedynamic544_217(int a0, long a1) throws Throwable;
private static native int __invokedynamic544_218(int a0, long a1) throws Throwable;
private static native boolean __call544_219(int a0) throws Throwable;
private static native int __integerCategory544_220(boolean value) throws Throwable;
private static native void __call544_221(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic544_222(int a0, long a1) throws Throwable;
private static native int __invokedynamic544_223(int a0, long a1) throws Throwable;
private static native boolean __call544_224(int a0) throws Throwable;
private static native int __integerCategory544_225(boolean value) throws Throwable;
private static native void __call544_226(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic544_227(int a0, long a1) throws Throwable;
private static native int __invokedynamic544_228(int a0, long a1) throws Throwable;
private static native boolean __call544_229(int a0) throws Throwable;
private static native int __integerCategory544_230(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_231(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __fieldRead544_232() throws Throwable;
private static native boolean __call544_233() throws Throwable;
private static native int __integerCategory544_234(boolean value) throws Throwable;
private static native void __call544_235(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1, int a2) throws Throwable;
private static native int __invokedynamic544_236(int a0, long a1) throws Throwable;
private static native int __invokedynamic544_237(int a0, long a1) throws Throwable;
private static native boolean __call544_238(int a0) throws Throwable;
private static native int __integerCategory544_239(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead544_240(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_241(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native int __invokedynamic544_242(int a0, long a1) throws Throwable;
private static native int __invokedynamic544_243(int a0, long a1) throws Throwable;
private static native boolean __call544_244(int a0) throws Throwable;
private static native int __integerCategory544_245(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_246(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_247(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_248(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory544_249(boolean value) throws Throwable;
private static native void __fieldWrite544_250(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_251(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_252(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __invokedynamic544_253(int a0, long a1) throws Throwable;
private static native int __invokedynamic544_254(int a0, long a1) throws Throwable;
private static native boolean __call544_255(int a0) throws Throwable;
private static native int __integerCategory544_256(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead544_257(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead544_258(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_259(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native int __integerCategory544_260(boolean value) throws Throwable;
private static native void __call544_261(net.minecraft.client.renderer.entity.RenderManager a0, int a1) throws Throwable;
private static native int __invokedynamic544_262(int a0, long a1) throws Throwable;
private static native int __invokedynamic544_263(int a0, long a1) throws Throwable;
private static native boolean __call544_264(int a0) throws Throwable;
private static native int __integerCategory544_265(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_266(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_267(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_268(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory544_269(boolean value) throws Throwable;
private static native void __fieldWrite544_270(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_271(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_272(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __invokedynamic544_273(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_274(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_275(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_276(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory544_277(boolean value) throws Throwable;
private static native void __fieldWrite544_278(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native int __invokedynamic544_279(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_280(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_281(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_282(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory544_283(boolean value) throws Throwable;
private static native void __fieldWrite544_284(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_285(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_286() throws Throwable;
private static native void __fieldWrite544_287(net.minecraft.client.settings.GameSettings a0, boolean a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_288(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_289() throws Throwable;
private static native void __fieldWrite544_290(net.minecraft.client.settings.GameSettings a0, boolean a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_291(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_292(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_293(moom.pz a0) throws Throwable;
private static native int __integerCategory544_294(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_295(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead544_297(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native void __fieldWrite544_298(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_299(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead544_300(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_301(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite544_302(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_303(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead544_304(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead544_305(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __call544_306(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_307(net.minecraft.client.renderer.EntityRenderer a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_308(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead544_309(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead544_310(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_311(net.minecraft.client.renderer.EntityRenderer a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead544_312(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_313(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_314(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_315(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_316(moom.pz a0) throws Throwable;
private static native int __integerCategory544_317(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_318(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_319(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_320(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory544_321(boolean value) throws Throwable;
private static native void __fieldWrite544_322(net.minecraft.client.settings.GameSettings a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_323(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_324(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory544_325(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_326(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_327(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory544_328(boolean value) throws Throwable;
private static native int __invokedynamic544_329(int a0, long a1) throws Throwable;
private static native void __call544_330(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __invokedynamic544_331(int a0, long a1) throws Throwable;
private static native void __call544_332(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __invokedynamic544_333(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_334(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz[] __fieldRead544_335(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_336(moom.pz a0) throws Throwable;
private static native int __integerCategory544_337(boolean value) throws Throwable;
private static native int __integerCategory544_338(boolean value) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_339(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_340(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory544_341(boolean value) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead544_342(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.hI __call544_343(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call544_344(moom.hI a0, int a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_345() throws Throwable;
private static native com.moon.events.EventBus __call544_346(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_347(com.moon.events.EventBus a0, com.moon.dN a1) throws Throwable;
private static native boolean __call544_348(com.moon.dN a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_349(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead544_350(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call544_351(com.moon.dN a0) throws Throwable;
private static native void __fieldWrite544_352(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_353(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz[] __fieldRead544_354(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_355(moom.pz a0) throws Throwable;
private static native int __integerCategory544_356(boolean value) throws Throwable;
private static native int __integerCategory544_357(boolean value) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_358(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_359(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory544_360(boolean value) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead544_361(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.hI __call544_362(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native void __call544_363(moom.hI a0, int a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_364() throws Throwable;
private static native com.moon.events.EventBus __call544_365(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_366(com.moon.events.EventBus a0, com.moon.dN a1) throws Throwable;
private static native boolean __call544_367(com.moon.dN a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_368(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead544_369(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call544_370(com.moon.dN a0) throws Throwable;
private static native void __fieldWrite544_371(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native int __invokedynamic544_372(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_373(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer$EnumChatVisibility __fieldRead544_374(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer$EnumChatVisibility __fieldRead544_375() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_376(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_377(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_378(moom.pz a0) throws Throwable;
private static native moom.jI __fieldRead544_379(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_380(moom.jI a0) throws Throwable;
private static native int __integerCategory544_381(boolean value) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_382(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_383(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call544_384(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.network.play.client.C16PacketClientStatus$EnumState __fieldRead544_385() throws Throwable;
private static native void __call544_386(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zp a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_387(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_388(net.minecraft.client.Minecraft a0, moom.hu a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_389(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_390(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_391(moom.pz a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_392(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_393(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory544_394(boolean value) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_395(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_396() throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call544_397(net.minecraft.client.entity.EntityPlayerSP a0, boolean a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_398(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_399(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory544_400(boolean value) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_401(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_402() throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call544_403(net.minecraft.client.entity.EntityPlayerSP a0, boolean a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_404(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_405(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_406(moom.pz a0) throws Throwable;
private static native int __integerCategory544_407(boolean value) throws Throwable;
private static native void __call544_408(net.minecraft.client.Minecraft a0, moom.gF a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_409(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_410(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_411(moom.pz a0) throws Throwable;
private static native int __integerCategory544_412(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_413(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_414(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_415(moom.pz a0) throws Throwable;
private static native void __call544_416(net.minecraft.client.Minecraft a0, moom.gF a1) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_417(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_418(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_419(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_420(moom.pz a0) throws Throwable;
private static native int __integerCategory544_421(boolean value) throws Throwable;
private static native void __call544_422(net.minecraft.client.Minecraft a0, moom.gF a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_423() throws Throwable;
private static native com.moon.events.EventBus __call544_424(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_425(com.moon.events.EventBus a0, com.moon.eu a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_426(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_427(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory544_428(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_429(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_430(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_431(moom.pz a0) throws Throwable;
private static native int __integerCategory544_432(boolean value) throws Throwable;
private static native moom.jI __fieldRead544_433(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_434(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_435(moom.jI a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_436(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_437(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_438(moom.pz a0) throws Throwable;
private static native boolean __call544_439(com.moon.event.TickEvent a0) throws Throwable;
private static native int __integerCategory544_440(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_441() throws Throwable;
private static native com.moon.events.EventBus __call544_442(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_443(com.moon.events.EventBus a0, com.moon.d0 a1) throws Throwable;
private static native boolean __call544_444(com.moon.d0 a0) throws Throwable;
private static native void __call544_445(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_446(com.moon.event.TickEvent a0) throws Throwable;
private static native int __integerCategory544_447(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_448() throws Throwable;
private static native com.moon.events.EventBus __call544_449(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_450(com.moon.events.EventBus a0, com.moon.d0 a1) throws Throwable;
private static native boolean __call544_451(com.moon.d0 a0) throws Throwable;
private static native void __call544_452(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_453(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_454(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_455(moom.pz a0) throws Throwable;
private static native int __integerCategory544_456(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_457() throws Throwable;
private static native com.moon.events.EventBus __call544_458(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_459(com.moon.events.EventBus a0, com.moon.d1 a1) throws Throwable;
private static native boolean __call544_460(com.moon.d1 a0) throws Throwable;
private static native int __integerCategory544_461(boolean value) throws Throwable;
private static native void __call544_462(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_463(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_464(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_465(moom.pz a0) throws Throwable;
private static native int __integerCategory544_466(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_467(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_468(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_469(moom.pz a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_470() throws Throwable;
private static native com.moon.events.EventBus __call544_471(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_472(com.moon.events.EventBus a0, com.moon.d1 a1) throws Throwable;
private static native boolean __call544_473(com.moon.d1 a0) throws Throwable;
private static native int __integerCategory544_474(boolean value) throws Throwable;
private static native void __call544_475(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_476(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_477(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_478(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_479(moom.pz a0) throws Throwable;
private static native int __integerCategory544_480(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_481(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_482(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_483(moom.pz a0) throws Throwable;
private static native void __call544_484(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_485(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_486(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_487(moom.pz a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_488() throws Throwable;
private static native com.moon.events.EventBus __call544_489(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_490(com.moon.events.EventBus a0, com.moon.dP a1) throws Throwable;
private static native boolean __call544_491(com.moon.dP a0) throws Throwable;
private static native int __integerCategory544_492(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_493() throws Throwable;
private static native com.moon.events.EventBus __call544_494(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_495(com.moon.events.EventBus a0, com.moon.d0 a1) throws Throwable;
private static native boolean __call544_496(com.moon.d0 a0) throws Throwable;
private static native void __call544_497(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_498() throws Throwable;
private static native com.moon.events.EventBus __call544_499(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_500(com.moon.events.EventBus a0, com.moon.dP a1) throws Throwable;
private static native boolean __call544_501(com.moon.dP a0) throws Throwable;
private static native int __integerCategory544_502(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_503() throws Throwable;
private static native com.moon.events.EventBus __call544_504(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call544_505(com.moon.events.EventBus a0, com.moon.d0 a1) throws Throwable;
private static native boolean __call544_506(com.moon.d0 a0) throws Throwable;
private static native void __call544_507(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_508(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_509(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_510(moom.pz a0) throws Throwable;
private static native int __integerCategory544_511(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_512(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_513(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_514(moom.pz a0) throws Throwable;
private static native int __integerCategory544_515(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_516(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_517(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_518(moom.pz a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_519(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_520(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_521(moom.pz a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_522(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_523(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_524(moom.pz a0) throws Throwable;
private static native int __fieldRead544_525(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_526(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_527(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call544_528(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_529(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead544_530(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead544_531(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call544_532(moom.pz a0) throws Throwable;
private static native int __integerCategory544_533(boolean value) throws Throwable;
private static native boolean __fieldRead544_534(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_535(boolean value) throws Throwable;
private static native void __call544_536(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_537(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_538(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead544_540(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __fieldWrite544_541(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native int __fieldRead544_542(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic544_543(int a0, long a1) throws Throwable;
private static native void __fieldWrite544_544(net.minecraft.client.Minecraft a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_545(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_546(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_547(net.minecraft.client.multiplayer.WorldClient a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native moom.A9 __fieldRead544_548(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_549(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead544_550(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_551(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead544_552(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_553(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native moom.A9 __fieldRead544_554(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_555(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead544_556(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_557(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.RenderGlobal __fieldRead544_558(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_559(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.A9 __fieldRead544_560(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_561(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead544_562(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_563(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_564(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call544_565(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_566(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_567(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call544_568(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native void __call544_569(net.minecraft.client.multiplayer.WorldClient a0, int a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_570(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_571(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead544_572(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call544_573(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native int __integerCategory544_574(boolean value) throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead544_575(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_576(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native boolean __fieldRead544_577(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_578(boolean value) throws Throwable;
private static native moom.fS __fieldRead544_579(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_580(moom.fS a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead544_581(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_582(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_583(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead544_584(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_585(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_586(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_587(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call544_588(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead544_589() throws Throwable;
private static native void __call544_590(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_591(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_592(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native moom.A9 __fieldRead544_593(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_594(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead544_595(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_596(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_597(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead544_598(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_599(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead544_600(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call544_601(double a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_602(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead544_603(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call544_604(double a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead544_605(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead544_606(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __call544_607(double a0) throws Throwable;
private static native void __call544_608(net.minecraft.client.multiplayer.WorldClient a0, int a1, int a2, int a3) throws Throwable;
private static native moom.A9 __fieldRead544_609(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_610(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead544_611(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __integerCategory544_612(boolean value) throws Throwable;
private static native net.minecraft.client.particle.EffectRenderer __fieldRead544_613(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_614(net.minecraft.client.particle.EffectRenderer a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead544_615(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.A9 __fieldRead544_616(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_617(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.network.NetworkManager __fieldRead544_618(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_619(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native moom.A9 __fieldRead544_620(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call544_621(moom.A9 a0) throws Throwable;
private static native long __call544_622() throws Throwable;
private static native void __fieldWrite544_623(net.minecraft.client.Minecraft a0, long a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call544_624() throws Throwable;
private static native com.moon.events.EventBus __call544_625(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.event.TickPhase __fieldRead544_626() throws Throwable;
private static native void __call544_627(com.moon.events.EventBus a0, com.moon.event.TickEvent a1) throws Throwable;
private static native java.lang.Throwable __call3054400_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054401_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054402_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054403_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054404_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054405_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054406_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054407_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054408_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054409_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054410_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054411_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054412_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054413_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054414_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054415_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054416_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054417_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054418_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054419_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054420_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054421_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054422_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054423_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054424_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054425_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054426_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054427_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054428_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054429_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054430_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054431_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3054432_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3054432_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic3054432_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3054432_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.lang.Throwable __call3054433_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3054434_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3054434_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic3054434_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3054434_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.lang.Throwable __call3054435_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054436_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054437_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054438_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054439_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054440_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054441_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054442_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054443_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054444_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054445_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054446_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054447_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054448_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054449_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054450_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054451_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054452_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054453_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054454_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054455_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054456_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054457_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054458_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054459_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054460_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054461_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054462_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054463_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054464_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054465_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054466_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054467_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054468_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054469_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054470_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054471_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054472_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054473_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054474_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054475_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054476_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054477_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054478_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054479_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054480_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054481_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054482_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054483_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054484_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054485_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054486_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054487_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054488_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054489_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054490_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054491_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054492_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054493_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054494_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054495_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054496_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054497_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054498_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054499_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054500_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054501_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054502_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054503_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054504_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054505_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054506_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054507_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054508_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054509_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054510_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054511_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054512_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054513_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054514_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054515_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054516_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054517_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054518_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054519_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054520_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054521_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054522_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054523_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054524_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054525_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054526_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054527_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054528_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054529_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054530_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054531_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054532_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054533_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054534_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054535_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054536_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054537_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054538_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054539_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054540_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054541_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054542_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054543_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054544_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054545_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054546_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054547_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054548_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054549_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054550_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054551_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054552_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054553_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054554_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054555_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054556_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054557_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054558_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054559_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054560_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054561_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054562_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054563_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054564_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054565_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054566_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054567_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054568_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054569_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054570_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054571_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054572_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054573_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054574_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054575_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054576_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054577_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054578_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054579_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054580_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054581_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054582_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054583_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054584_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054585_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054586_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054587_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054588_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054589_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054590_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054591_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054592_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054593_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054594_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054595_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054596_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054597_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054598_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054599_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054600_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054601_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054602_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054603_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054604_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054605_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054606_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054607_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054608_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054609_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054610_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054611_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054612_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054613_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054614_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054615_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054616_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054617_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054618_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054619_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054620_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054621_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054622_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054623_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054624_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054625_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054626_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054627_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054628_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054629_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054630_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054631_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054632_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054633_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054634_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054635_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054636_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054637_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054638_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054639_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054640_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054641_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054642_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054643_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054644_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054645_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054646_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054647_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054648_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054649_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054650_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3054651_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead3054651_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qZ __call3054651_2(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3054651_3(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead3054651_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.qZ __call3054651_5(net.minecraft.client.multiplayer.WorldClient a0, moom.qY a1) throws Throwable;
private static native java.lang.Throwable __call3054652_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054653_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054654_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054655_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054656_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054657_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054658_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054659_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054660_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054661_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3054662_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_92afbaa84f9bf95d825f(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_92afbaa84f9bf95d825f {

public static void f53(net.minecraft.client.Minecraft receiver) throws Throwable {
    net.minecraft.client.Minecraft forestValue53_12_0;
    net.minecraft.block.Block forestValue53_47_0;
    int forestValue53_60_0;
    int forestValue53_75_0;
    net.minecraft.block.Block forestValue53_78_0;
    net.minecraft.block.Block forestValue53_80_0;
    net.minecraft.util.MovingObjectPosition$MovingObjectType forestValue53_97_0;
    net.minecraft.util.MovingObjectPosition$MovingObjectType forestValue53_97_1;
    net.minecraft.util.MovingObjectPosition forestValue53_100_0;
    int forestValue53_111_0;
    int forestValue53_124_0;
    net.minecraft.entity.Entity forestValue53_132_0;
    net.minecraft.item.ItemStack forestValue53_153_0;
    int forestValue53_167_0;
    int forestValue53_207_0;
    int forestValue53_218_0;
    int forestValue53_283_0;
    net.minecraft.client.Minecraft spill53_0;
    net.minecraft.util.MovingObjectPosition$MovingObjectType spill53_1;
    net.minecraft.util.MovingObjectPosition$MovingObjectType spill53_2;
    net.minecraft.block.Block spill53_3;
    int spill53_4;
    int spill53_5;
    net.minecraft.block.Block spill53_6;
    net.minecraft.util.MovingObjectPosition spill53_7;
    int spill53_8;
    net.minecraft.entity.Entity spill53_9;
    int spill53_10;
    net.minecraft.item.ItemStack spill53_11;
    int spill53_12;
    long life1_3;
    int[] life3_5;
    int life4_19;
    int life5_21;
    int life6_23;
    net.minecraft.tileentity.TileEntity life7_25;
    moom.DT life9_39;
    net.minecraft.block.Block life10_45;
    net.minecraft.item.Item life8_62;
    net.minecraft.block.Block life11_107;
    net.minecraft.entity.Entity life11_179;
    net.minecraft.entity.item.EntityItemFrame life9_190;
    net.minecraft.item.ItemStack life11_193;
    net.minecraft.entity.item.EntityMinecart life10_232;
    net.minecraft.entity.player.InventoryPlayer life9_316;
    net.minecraft.item.ItemStack life10_339;
    int life10_368;
    forest_join_292: {
    forest_join_283: {
    forest_join_265: {
    forest_join_254: {
    forest_join_252: {
    forest_join_238: {
    forest_join_223: {
    forest_join_218: {
    forest_join_214: {
    forest_join_207: {
    forest_join_203: {
    forest_join_199: {
    forest_join_195: {
    forest_join_191: {
    forest_join_187: {
    forest_join_183: {
    forest_join_179: {
    forest_join_167: {
    forest_join_161: {
    forest_join_160: {
    forest_join_153: {
    forest_join_152: {
    forest_join_132: {
    forest_join_129: {
    forest_join_124: {
    forest_join_118: {
    forest_join_111: {
    forest_join_107: {
    forest_join_106: {
    forest_join_100: {
    forest_join_97: {
    forest_join_91: {
    forest_join_80: {
    forest_join_79: {
    forest_join_78: {
    forest_join_75: {
    forest_join_66: {
    forest_join_60: {
    forest_join_55: {
    forest_join_47: {
    forest_join_46: {
    forest_join_12: {
    life1_3 = (__fieldRead53_0() ^ 97247123624420L);
    life3_5 = __call53_1();
    spill53_0 = receiver;
    if (!((life3_5 != null))) {
        forestValue53_12_0 = spill53_0;
        break forest_join_12;
    }
    if (!((__fieldRead53_2(spill53_0) != null))) {
        break forest_join_292;
    }
    forestValue53_12_0 = receiver;
    }
    life4_19 = __integerCategory53_6(__fieldRead53_5(__fieldRead53_4(__fieldRead53_3(forestValue53_12_0))));
    life5_21 = 0;
    life6_23 = 0;
    life7_25 = null;
    spill53_1 = __fieldRead53_8(__fieldRead53_7(receiver));
    spill53_2 = __fieldRead53_9();
    if (!((life3_5 != null))) {
        forestValue53_97_0 = spill53_1;
        forestValue53_97_1 = spill53_2;
        break forest_join_97;
    }
    if (!((spill53_1 == spill53_2))) {
        break forest_join_91;
    }
    life9_39 = __call53_11(__fieldRead53_10(receiver));
    life10_45 = __call53_14(__call53_13(__fieldRead53_12(receiver), life9_39));
    spill53_3 = life10_45;
    if (!((life3_5 != null))) {
        forestValue53_47_0 = spill53_3;
        break forest_join_47;
    }
    if (!((__call53_15(spill53_3) == __fieldRead53_16()))) {
        break forest_join_46;
    }
    return;
    }
    forestValue53_47_0 = life10_45;
    }
    life8_62 = __call53_18(forestValue53_47_0, __fieldRead53_17(receiver), life9_39);
    if (!((life8_62 == null))) {
        break forest_join_55;
    }
    return;
    }
    spill53_4 = life4_19;
    if (!((life3_5 != null))) {
        forestValue53_60_0 = spill53_4;
        break forest_join_60;
    }
    if (!((spill53_4 != 0))) {
        break forest_join_66;
    }
    forestValue53_60_0 = __integerCategory53_20(__call53_19());
    }
    if (!((forestValue53_60_0 != 0))) {
        break forest_join_66;
    }
    life7_25 = __call53_22(__fieldRead53_21(receiver), life9_39);
    }
    spill53_5 = __instanceOf53_23(life8_62);
    if (!((life3_5 != null))) {
        forestValue53_75_0 = spill53_5;
        break forest_join_75;
    }
    if (!((spill53_5 != 0))) {
        break forest_join_79;
    }
    spill53_6 = life10_45;
    if (!((life3_5 != null))) {
        forestValue53_78_0 = spill53_6;
        break forest_join_78;
    }
    forestValue53_75_0 = __integerCategory53_25(__call53_24(spill53_6));
    }
    if (!((forestValue53_75_0 == 0))) {
        break forest_join_79;
    }
    forestValue53_78_0 = __call53_26(life8_62);
    }
    forestValue53_80_0 = forestValue53_78_0;
    break forest_join_80;
    }
    forestValue53_80_0 = life10_45;
    }
    life11_107 = forestValue53_80_0;
    life5_21 = __call53_28(life11_107, __fieldRead53_27(receiver), life9_39);
    life6_23 = __integerCategory53_30(__call53_29(life8_62));
    break forest_join_238;
    }
    spill53_7 = __fieldRead53_31(receiver);
    if (!((life3_5 != null))) {
        forestValue53_100_0 = spill53_7;
        break forest_join_100;
    }
    forestValue53_97_0 = __fieldRead53_32(spill53_7);
    forestValue53_97_1 = __fieldRead53_33();
    }
    if (!((forestValue53_97_0 == forestValue53_97_1))) {
        break forest_join_106;
    }
    forestValue53_100_0 = __fieldRead53_34(receiver);
    }
    if (!((__fieldRead53_35(forestValue53_100_0) != null))) {
        break forest_join_106;
    }
    spill53_8 = life4_19;
    if (!((life3_5 != null))) {
        forestValue53_111_0 = spill53_8;
        break forest_join_111;
    }
    if (!((spill53_8 == 0))) {
        break forest_join_107;
    }
    }
    return;
    }
    forestValue53_111_0 = __instanceOf53_38(__fieldRead53_37(__fieldRead53_36(receiver)));
    }
    if (!((life3_5 != null))) {
        forestValue53_124_0 = forestValue53_111_0;
        break forest_join_124;
    }
    if (!((forestValue53_111_0 != 0))) {
        break forest_join_118;
    }
    life8_62 = __fieldRead53_39();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    spill53_9 = __fieldRead53_41(__fieldRead53_40(receiver));
    if (!((life3_5 != null))) {
        forestValue53_132_0 = spill53_9;
        break forest_join_132;
    }
    forestValue53_124_0 = __instanceOf53_42(spill53_9);
    }
    if (!((forestValue53_124_0 != 0))) {
        break forest_join_129;
    }
    life8_62 = __fieldRead53_43();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    forestValue53_132_0 = __fieldRead53_45(__fieldRead53_44(receiver));
    }
    life11_179 = forestValue53_132_0;
    spill53_10 = __instanceOf53_46(life11_179);
    if (!((life3_5 != null))) {
        forestValue53_167_0 = spill53_10;
        break forest_join_167;
    }
    if (!((spill53_10 != 0))) {
        break forest_join_161;
    }
    life9_190 = __cast53_47(life11_179);
    life11_193 = __call53_48(life9_190);
    spill53_11 = life11_193;
    if (!((life3_5 != null))) {
        forestValue53_153_0 = spill53_11;
        break forest_join_153;
    }
    if (!((spill53_11 == null))) {
        break forest_join_152;
    }
    life8_62 = __fieldRead53_49();
    if (!((life3_5 == null))) {
        break forest_join_160;
    }
    }
    forestValue53_153_0 = life11_193;
    }
    life8_62 = __call53_50(forestValue53_153_0);
    life5_21 = __call53_51(life11_193);
    life6_23 = 1;
    }
    break forest_join_238;
    }
    life11_179 = __fieldRead53_53(__fieldRead53_52(receiver));
    forestValue53_167_0 = __instanceOf53_54(life11_179);
    }
    if (!((life3_5 != null))) {
        forestValue53_207_0 = forestValue53_167_0;
        break forest_join_207;
    }
    if (!((forestValue53_167_0 != 0))) {
        break forest_join_203;
    }
    life10_232 = __cast53_55(life11_179);
    switch ((__fieldRead53_56())[__call53_58(__call53_57(life10_232))]) {
case 1:
{
        break forest_join_179;
    }
case 2:
{
        break forest_join_183;
    }
case 3:
{
        break forest_join_187;
    }
case 4:
{
        break forest_join_191;
    }
case 5:
{
        break forest_join_195;
    }
default:
{
        break forest_join_199;
    }
}
    }
    life8_62 = __fieldRead53_59();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    life8_62 = __fieldRead53_60();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    life8_62 = __fieldRead53_61();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    life8_62 = __fieldRead53_62();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    life8_62 = __fieldRead53_63();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    life8_62 = __fieldRead53_64();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    forestValue53_207_0 = __instanceOf53_67(__fieldRead53_66(__fieldRead53_65(receiver)));
    }
    if (!((life3_5 != null))) {
        forestValue53_218_0 = forestValue53_207_0;
        break forest_join_218;
    }
    if (!((forestValue53_207_0 != 0))) {
        break forest_join_214;
    }
    life8_62 = __fieldRead53_68();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    forestValue53_218_0 = __instanceOf53_71(__fieldRead53_70(__fieldRead53_69(receiver)));
    }
    if (!((forestValue53_218_0 != 0))) {
        break forest_join_223;
    }
    life8_62 = __fieldRead53_72();
    if (!((life3_5 == null))) {
        break forest_join_238;
    }
    }
    life8_62 = __fieldRead53_73();
    life5_21 = __call53_76(__fieldRead53_75(__fieldRead53_74(receiver)));
    life6_23 = 1;
    if (!((!__call53_79(__fieldRead53_77(), __call53_78(life5_21))))) {
        break forest_join_238;
    }
    return;
    }
    life9_316 = __fieldRead53_81(__fieldRead53_80(receiver));
    if (!((life3_5 != null))) {
        break forest_join_252;
    }
    if (!((life7_25 == null))) {
        break forest_join_254;
    }
    __call53_82(life9_316, life8_62, life5_21, life6_23, life4_19);
    }
    if (!((life3_5 == null))) {
        break forest_join_265;
    }
    }
    life10_339 = __call53_83(receiver, life8_62, life5_21, life7_25);
    __call53_85(life9_316, __fieldRead53_84(life9_316), life10_339);
    }
    spill53_12 = life4_19;
    if (!((life3_5 != null))) {
        forestValue53_283_0 = spill53_12;
        break forest_join_283;
    }
    if (!((spill53_12 != 0))) {
        break forest_join_292;
    }
    forestValue53_283_0 = ((__call53_89(__fieldRead53_88(__fieldRead53_87(__fieldRead53_86(receiver)))) - __invokedynamic53_90(5137, (8124781302562570825L ^ life1_3))) + __fieldRead53_91(life9_316));
    }
    life10_368 = forestValue53_283_0;
    __call53_95(__fieldRead53_92(receiver), __call53_94(life9_316, __fieldRead53_93(life9_316)), life10_368);
    }
    return;
}
public static void h53_0(moom.Oo p0) throws Throwable {
    throw __call3005300_0(p0);
}
public static void h53_1(moom.Oo p0) throws Throwable {
    throw __call3005301_0(p0);
}
public static void h53_2(moom.Oo p0) throws Throwable {
    throw __call3005302_0(p0);
}
public static void h53_3(moom.Oo p0) throws Throwable {
    throw __call3005303_0(p0);
}
public static void h53_4(moom.Oo p0) throws Throwable {
    throw __call3005304_0(p0);
}
public static void h53_5(moom.Oo p0) throws Throwable {
    throw __call3005305_0(p0);
}
public static void h53_6(moom.Oo p0) throws Throwable {
    throw __call3005306_0(p0);
}
public static void h53_7(moom.Oo p0) throws Throwable {
    throw __call3005307_0(p0);
}
public static void h53_8(moom.Oo p0) throws Throwable {
    throw __call3005308_0(p0);
}
public static void h53_9(moom.Oo p0) throws Throwable {
    throw __call3005309_0(p0);
}
public static void h53_10(moom.Oo p0) throws Throwable {
    throw __call3005310_0(p0);
}
public static void h53_11(moom.Oo p0) throws Throwable {
    throw __call3005311_0(p0);
}
public static void h53_12(moom.Oo p0) throws Throwable {
    throw __call3005312_0(p0);
}
public static void h53_13(moom.Oo p0) throws Throwable {
    throw __call3005313_0(p0);
}
public static void h53_14(moom.Oo p0) throws Throwable {
    throw __call3005314_0(p0);
}
public static void h53_15(moom.Oo p0) throws Throwable {
    throw __call3005315_0(p0);
}
public static void h53_16(moom.Oo p0) throws Throwable {
    throw __call3005316_0(p0);
}
public static void h53_17(moom.Oo p0) throws Throwable {
    throw __call3005317_0(p0);
}
public static void h53_18(moom.Oo p0) throws Throwable {
    throw __call3005318_0(p0);
}
public static void h53_19(moom.Oo p0) throws Throwable {
    throw __call3005319_0(p0);
}
public static void h53_20(moom.Oo p0) throws Throwable {
    throw __call3005320_0(p0);
}
public static void h53_21(moom.Oo p0) throws Throwable {
    throw __call3005321_0(p0);
}
public static void h53_22(moom.Oo p0) throws Throwable {
    throw __call3005322_0(p0);
}
public static void h53_23(moom.Oo p0) throws Throwable {
    throw __call3005323_0(p0);
}
public static void h53_24(moom.Oo p0) throws Throwable {
    throw __call3005324_0(p0);
}
public static void h53_25(moom.Oo p0) throws Throwable {
    throw __call3005325_0(p0);
}
public static void h53_26(moom.Oo p0) throws Throwable {
    throw __call3005326_0(p0);
}
public static void h53_27(moom.Oo p0) throws Throwable {
    throw __call3005327_0(p0);
}
public static void h53_28(moom.Oo p0) throws Throwable {
    throw __call3005328_0(p0);
}
public static void h53_29(moom.Oo p0) throws Throwable {
    throw __call3005329_0(p0);
}
public static void h53_30(moom.Oo p0) throws Throwable {
    throw __call3005330_0(p0);
}
private static native long __fieldRead53_0() throws Throwable;
private static native int[] __call53_1() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead53_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead53_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __fieldRead53_5(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory53_6(boolean value) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead53_8(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead53_9() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DT __call53_11(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead53_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call53_13(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call53_14(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call53_15(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead53_16() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead53_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.item.Item __call53_18(net.minecraft.block.Block a0, net.minecraft.client.multiplayer.WorldClient a1, moom.DT a2) throws Throwable;
private static native boolean __call53_19() throws Throwable;
private static native int __integerCategory53_20(boolean value) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead53_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call53_22(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native int __instanceOf53_23(net.minecraft.item.Item a0) throws Throwable;
private static native boolean __call53_24(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory53_25(boolean value) throws Throwable;
private static native net.minecraft.block.Block __call53_26(net.minecraft.item.Item a0) throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead53_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call53_28(net.minecraft.block.Block a0, net.minecraft.client.multiplayer.WorldClient a1, moom.DT a2) throws Throwable;
private static native boolean __call53_29(net.minecraft.item.Item a0) throws Throwable;
private static native int __integerCategory53_30(boolean value) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_31(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead53_32(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition$MovingObjectType __fieldRead53_33() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead53_35(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_36(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead53_37(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __instanceOf53_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_39() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead53_41(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __instanceOf53_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_43() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead53_45(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __instanceOf53_46(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItemFrame __cast53_47(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call53_48(net.minecraft.entity.item.EntityItemFrame a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_49() throws Throwable;
private static native net.minecraft.item.Item __call53_50(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call53_51(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_52(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead53_53(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __instanceOf53_54(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart __cast53_55(net.minecraft.entity.Entity a0) throws Throwable;
private static native int[] __fieldRead53_56() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __call53_57(net.minecraft.entity.item.EntityMinecart a0) throws Throwable;
private static native int __call53_58(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_59() throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_60() throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_61() throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_62() throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_63() throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_64() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_65(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead53_66(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __instanceOf53_67(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_68() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_69(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead53_70(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __instanceOf53_71(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.wS __fieldRead53_72() throws Throwable;
private static native net.minecraft.item.Item __fieldRead53_73() throws Throwable;
private static native net.minecraft.util.MovingObjectPosition __fieldRead53_74(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead53_75(net.minecraft.util.MovingObjectPosition a0) throws Throwable;
private static native int __call53_76(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.Map __fieldRead53_77() throws Throwable;
private static native java.lang.Integer __call53_78(int a0) throws Throwable;
private static native boolean __call53_79(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead53_80(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead53_81(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call53_82(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.item.ItemStack __call53_83(net.minecraft.client.Minecraft a0, net.minecraft.item.Item a1, int a2, net.minecraft.tileentity.TileEntity a3) throws Throwable;
private static native int __fieldRead53_84(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native void __call53_85(net.minecraft.entity.player.InventoryPlayer a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead53_86(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.v8 __fieldRead53_87(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.util.List __fieldRead53_88(moom.v8 a0) throws Throwable;
private static native int __call53_89(java.util.List a0) throws Throwable;
private static native int __invokedynamic53_90(int a0, long a1) throws Throwable;
private static native int __fieldRead53_91(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native moom.jI __fieldRead53_92(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead53_93(net.minecraft.entity.player.InventoryPlayer a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call53_94(net.minecraft.entity.player.InventoryPlayer a0, int a1) throws Throwable;
private static native void __call53_95(moom.jI a0, net.minecraft.item.ItemStack a1, int a2) throws Throwable;
private static native java.lang.Throwable __call3005300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005311_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005312_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005313_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005314_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005315_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005316_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005317_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005318_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005319_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005320_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005321_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005322_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005323_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005324_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005325_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005326_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005327_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005328_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005329_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3005330_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ffda589781fd42444c71(net.minecraft.client.Minecraft a0) throws E;
private static final class __SourceHandler_ffda589781fd42444c71 {

public static void f1289(net.minecraft.client.Minecraft receiver) throws Throwable {
    int forwardValue1289_11_0;
    int forwardValue1289_13_0;
    int forwardValue1289_19_0;
    int forwardValue1289_25_0;
    int forwardValue1289_44_0;
    int forwardValue1289_48_0;
    int forwardValue1289_64_0;
    int forwardValue1289_64_1;
    int spill1289_0;
    int spill1289_1;
    int spill1289_2;
    int spill1289_3;
    long life1_3;
    int[] life3_5;
    int life4_16;
    forward_join_78: {
    forward_join_64: {
    forward_join_59: {
    forward_join_48: {
    forward_join_44: {
    forward_join_43: {
    forward_join_25: {
    forward_join_19: {
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life1_3 = (__fieldRead1289_0() ^ 115454813494103L);
    life3_5 = __call1289_1();
    spill1289_0 = __call1289_2();
    if (!((life3_5 != null))) {
        forwardValue1289_11_0 = spill1289_0;
        break forward_join_11;
    }
    if (!((spill1289_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1289_11_0 = __integerCategory1289_4(__call1289_3());
    }
    forwardValue1289_13_0 = forwardValue1289_11_0;
    break forward_join_13;
    }
    forwardValue1289_13_0 = __call1289_5();
    }
    life4_16 = forwardValue1289_13_0;
    spill1289_1 = life4_16;
    if (!((life3_5 != null))) {
        forwardValue1289_19_0 = spill1289_1;
        break forward_join_19;
    }
    if (!((spill1289_1 != 0))) {
        break forward_join_78;
    }
    forwardValue1289_19_0 = __integerCategory1289_7(__call1289_6());
    }
    if (!((life3_5 != null))) {
        forwardValue1289_25_0 = forwardValue1289_19_0;
        break forward_join_25;
    }
    if (!((forwardValue1289_19_0 == 0))) {
        break forward_join_78;
    }
    forwardValue1289_25_0 = __instanceOf1289_9(__fieldRead1289_8(receiver));
    }
    if (!((life3_5 != null))) {
        forwardValue1289_44_0 = forwardValue1289_25_0;
        break forward_join_44;
    }
    if (!((forwardValue1289_25_0 != 0))) {
        break forward_join_43;
    }
    spill1289_2 = __numericCompare1289_15(__fieldRead1289_12(__cast1289_11(__fieldRead1289_10(receiver))), (__call1289_13() - __invokedynamic1289_14(6296, (7655704998101695385L ^ life1_3))));
    if (!((life3_5 != null))) {
        forwardValue1289_44_0 = spill1289_2;
        break forward_join_44;
    }
    if (!((spill1289_2 <= 0))) {
        break forward_join_78;
    }
    }
    forwardValue1289_44_0 = __integerCategory1289_17(__call1289_16());
    }
    if (!((life3_5 != null))) {
        forwardValue1289_48_0 = forwardValue1289_44_0;
        break forward_join_48;
    }
    if (!((forwardValue1289_44_0 != 0))) {
        break forward_join_78;
    }
    forwardValue1289_48_0 = life4_16;
    }
    spill1289_3 = __call1289_20(__fieldRead1289_19(__fieldRead1289_18(receiver)));
    if (!((life3_5 != null))) {
        forwardValue1289_64_0 = forwardValue1289_48_0;
        forwardValue1289_64_1 = spill1289_3;
        break forward_join_64;
    }
    if (!((forwardValue1289_48_0 == spill1289_3))) {
        break forward_join_59;
    }
    __call1289_21(receiver);
    if (!((life3_5 == null))) {
        break forward_join_78;
    }
    }
    forwardValue1289_64_0 = life4_16;
    forwardValue1289_64_1 = __call1289_24(__fieldRead1289_23(__fieldRead1289_22(receiver)));
    }
    if (!((forwardValue1289_64_0 == forwardValue1289_64_1))) {
        break forward_join_78;
    }
    __call1289_32(__call1289_26(__fieldRead1289_25(receiver)), __call1289_31(__fieldRead1289_27(receiver), __fieldRead1289_28(receiver), __fieldRead1289_29(receiver), __fieldRead1289_30(receiver)));
    }
    return;
}
public static void h1289_0(moom.Oo p0) throws Throwable {
    throw __call1128900_0(p0);
}
public static void h1289_1(moom.Oo p0) throws Throwable {
    throw __call1128901_0(p0);
}
public static void h1289_2(moom.Oo p0) throws Throwable {
    throw __call1128902_0(p0);
}
public static void h1289_3(moom.Oo p0) throws Throwable {
    throw __call1128903_0(p0);
}
public static void h1289_4(moom.Oo p0) throws Throwable {
    throw __call1128904_0(p0);
}
public static void h1289_5(moom.Oo p0) throws Throwable {
    throw __call1128905_0(p0);
}
public static void h1289_6(moom.Oo p0) throws Throwable {
    throw __call1128906_0(p0);
}
public static void h1289_7(moom.Oo p0) throws Throwable {
    throw __call1128907_0(p0);
}
public static void h1289_8(moom.Oo p0) throws Throwable {
    throw __call1128908_0(p0);
}
public static void h1289_9(moom.Oo p0) throws Throwable {
    throw __call1128909_0(p0);
}
public static void h1289_10(moom.Oo p0) throws Throwable {
    throw __call1128910_0(p0);
}
public static void h1289_11(moom.Oo p0) throws Throwable {
    throw __call1128911_0(p0);
}
private static native long __fieldRead1289_0() throws Throwable;
private static native int[] __call1289_1() throws Throwable;
private static native int __call1289_2() throws Throwable;
private static native char __call1289_3() throws Throwable;
private static native int __integerCategory1289_4(char value) throws Throwable;
private static native int __call1289_5() throws Throwable;
private static native boolean __call1289_6() throws Throwable;
private static native int __integerCategory1289_7(boolean value) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1289_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf1289_9(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1289_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.gui.GuiControls __cast1289_11(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native long __fieldRead1289_12(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native long __call1289_13() throws Throwable;
private static native long __invokedynamic1289_14(int a0, long a1) throws Throwable;
private static native int __numericCompare1289_15(long a0, long a1) throws Throwable;
private static native boolean __call1289_16() throws Throwable;
private static native int __integerCategory1289_17(boolean value) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1289_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1289_19(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1289_20(moom.pz a0) throws Throwable;
private static native void __call1289_21(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1289_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz __fieldRead1289_23(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call1289_24(moom.pz a0) throws Throwable;
private static native net.minecraft.client.gui.GuiIngame __fieldRead1289_25(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.gB __call1289_26(net.minecraft.client.gui.GuiIngame a0) throws Throwable;
private static native java.io.File __fieldRead1289_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1289_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1289_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead1289_30(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1289_31(java.io.File a0, int a1, int a2, net.minecraft.client.shader.Framebuffer a3) throws Throwable;
private static native void __call1289_32(moom.gB a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native java.lang.Throwable __call1128900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1128911_0(moom.Oo a0) throws Throwable;

}


public final boolean i__Boolean() {
return ((((this.x) ? 1 : 0)) != 0);
}


public void i() { __sourceHandlerCall_ada95d5299df62b126e2(this); }


public boolean b__Boolean() {
return ((((((net.minecraft.client.settings.GameSettings)(this.W)).C) ? 1 : 0)) != 0);
}


public void b(net.minecraft.profiler.PlayerUsageSnooper p0) { __sourceHandlerCall_5cb7beb61f487a2f4278(this, p0); }


public com.mojang.authlib.properties.PropertyMap b__PropertyMap() { return __sourceHandlerCall_6a0633ecbb21ecc3c31c(this); }


private java.lang.String b__String() { return __sourceHandlerCall_73f6e5211c4278abb0b8(this); }


public void b(int p0) { __sourceHandlerCall_2ae3022321a7b1f181f0(this, p0); }


public void b(moom.qY p0) { __sourceHandlerCall_c159689763ab28cd2eb2(this, p0); }


public static int[] b__ArrayInt() {
return net.minecraft.client.Minecraft.aV;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3784;
      if (hb[var3] == null) {
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
         long var5 = gb[var3];
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
         Object[] var9 = (Object[])ib.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               ib.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/fM", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         hb[var3] = var15;
      }

      return hb[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.Minecraft.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10079_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/fM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void b(int[] p0) {
aV = ((int[])(p0));
    return;
}


public net.minecraft.util.Session b__DH() {
return this.ak;
}


public void b(boolean p0) {
this.aq = ((boolean)(p0));
    return;
}


public void b__Void() { __sourceHandlerCall_d12410510283321e6e5b(this); }


public static int b() {
return net.minecraft.client.Minecraft.g;
}


private void e() throws org.lwjgl.LWJGLException { __sourceHandlerCall_22c54203b6ee91f4f7fe(this); }


public static boolean e__Boolean() { return __sourceHandlerCall_f3a9df36496c9e23bcf2(); }


public void x() throws java.io.IOException { __sourceHandlerCall_e41db4bb41bca0b9b69e(this); }


public void s() { __sourceHandlerCall_5ba5c93a00f45fbe3205(this); }


private synchronized void c__Void() throws org.lwjgl.LWJGLException, java.io.IOException { __sourceHandlerCall_cf9d22946cf27734949b(this); }


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral10086_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/fM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int c() { return __sourceHandlerCall_49934cb053984a19d793(this); }


public boolean c__Boolean() { return __sourceHandlerCall_09628cae6ef5b07badde(this); }


private static long c(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28943);
    if (((net.minecraft.client.Minecraft.kb)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.client.Minecraft.jb)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.client.Minecraft.lb)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.client.Minecraft.lb)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/fM", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.client.Minecraft.kb)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.client.Minecraft.kb)[life3_8])).longValue();
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.client.Minecraft.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean n__Boolean() {
return ((((this.av) ? 1 : 0)) != 0);
}


protected void n() { __sourceHandlerCall_dd3e4849e396c264376c(this); }


private void h() {
moom.Op local1 = new moom.Op(this, "Timer hack thread");
    ((java.lang.Thread)(local1)).setDaemon(((boolean)(true)));
    ((java.lang.Thread)(local1)).start();
    return;
}


public boolean h__Boolean() { return __sourceHandlerCall_4c0836f8eaab7444723c(this); }


private void f() throws org.lwjgl.LWJGLException { __sourceHandlerCall_eb987554839f5f641cd0(this); }


public static boolean f__Boolean() { return __sourceHandlerCall_d88ebcd5a855220b0fe4(); }


public boolean l__Boolean() {
return ((((this.an) ? 1 : 0)) != 0);
}


private void l() throws java.io.IOException { __sourceHandlerCall_77e8b67ebfe68fc30090(this); }


private void d() {
((net.minecraft.client.resources.data.IMetadataSerializer)(this.y)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pf())), ((java.lang.Class)(net.minecraft.client.resources.data.TextureMetadataSection.class)));
    ((net.minecraft.client.resources.data.IMetadataSerializer)(this.y)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pc())), ((java.lang.Class)(net.minecraft.client.resources.data.FontMetadataSection.class)));
    ((net.minecraft.client.resources.data.IMetadataSerializer)(this.y)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pb())), ((java.lang.Class)(net.minecraft.client.resources.data.AnimationMetadataSection.class)));
    ((net.minecraft.client.resources.data.IMetadataSerializer)(this.y)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pe())), ((java.lang.Class)(net.minecraft.client.resources.data.PackMetadataSection.class)));
    ((net.minecraft.client.resources.data.IMetadataSerializer)(this.y)).a(((net.minecraft.client.resources.data.IMetadataSectionSerializer)(new moom.pd())), ((java.lang.Class)(net.minecraft.client.resources.data.LanguageMetadataSection.class)));
    return;
}


public static boolean d__Boolean() { return __sourceHandlerCall_0a76d2ead7e662491689(); }


public com.mojang.authlib.minecraft.MinecraftSessionService a__MinecraftSessionService() {
return this.A;
}


public net.minecraft.profiler.PlayerUsageSnooper a__A8() {
return this.q;
}


public net.minecraft.client.audio.SoundHandler a__f1() {
return this.aM;
}


public net.minecraft.client.audio.MusicTicker$MusicType a__av() { return __sourceHandlerCall_a6ff6d72a6320238fc5f(this); }


public net.minecraft.server.integrated.IntegratedServer a__Bm() {
return this.ay;
}


public net.minecraft.client.renderer.texture.TextureManager a__ok() {
return this.am;
}


public java.net.Proxy a__Proxy() {
return this.v;
}


public net.minecraft.util.Session a__DH() {
return this.ak;
}


public com.mojang.authlib.properties.PropertyMap a__PropertyMap() {
return this.n;
}


public net.minecraft.client.renderer.texture.TextureMap a__n8() {
return this.aL;
}


public net.minecraft.client.resources.LanguageManager a__oV() {
return this.aJ;
}


public net.minecraft.client.resources.ResourcePackRepository a__o1() {
return this.aI;
}


public moom.oR a__oR() {
return this.aH;
}


public static void a__Void() { __sourceHandlerCall_0f39cea714107e62ba7c(); }


public net.minecraft.client.Minecraft a(net.minecraft.util.Session p0) {
this.ak = ((net.minecraft.util.Session)(p0));
    return this;
}


public java.util.Queue<java.lang.Runnable> a__Queue() {
return this.E;
}


public void a__Void(java.lang.Runnable p0) {
((java.util.Queue)(this.E)).add(((java.lang.Object)(p0)));
    return;
}


public static long a__Long() {
return java.lang.System.currentTimeMillis();
}


public net.minecraft.client.shader.Framebuffer a__pA() {
return this.aK;
}


private static boolean a__Boolean() { return __sourceHandlerCall_9bf8ccf640920d5f833a(); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public static net.minecraft.client.Minecraft a__fM() {
return net.minecraft.client.Minecraft.f;
}


public static int a() { return __sourceHandlerCall_6bf1ded848dcd087d19b(); }


public com.google.common.util.concurrent.ListenableFuture<java.lang.Object> a(java.lang.Runnable p0) {
org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(p0)));
    return ((net.minecraft.client.Minecraft)(this)).a(((java.util.concurrent.Callable)(java.util.concurrent.Executors.callable(((java.lang.Runnable)(p0))))));
}


public <V> com.google.common.util.concurrent.ListenableFuture<V> a(java.util.concurrent.Callable<V> p0) { return __sourceHandlerCall_73ba850a2e2ad5dea135(this, p0); }


public void a(net.minecraft.entity.Entity p0) {
this.au = ((net.minecraft.entity.Entity)(p0));
    ((net.minecraft.client.renderer.EntityRenderer)(this.R)).a(((net.minecraft.entity.Entity)(p0)));
    return;
}


public net.minecraft.entity.Entity a__r3() {
return this.au;
}


public moom.o6 a__o6() {
return this.aP;
}


public moom.C3 a__C3() {
return this.i;
}


public moom.lm a__lm() {
return this.at;
}


public net.minecraft.client.renderer.entity.RenderItem a__nv() {
return this.as;
}


public net.minecraft.client.renderer.entity.RenderManager a__nw() {
return this.ar;
}


public net.minecraft.client.renderer.BlockRendererDispatcher a__kP() {
return this.aR;
}


public void a(moom.yK p0) { __sourceHandlerCall_0c33137498cd063ee89b(this, p0); }


private void a(boolean p0) { __sourceHandlerCall_349445b6f5f746012230(this, p0); }


public java.lang.String a__String() {
return this.u;
}


private void a(int p0) { __sourceHandlerCall_5f14101fb414f99cf2df(this, p0); }


private void a(int p0, int p1) { __sourceHandlerCall_484c1813d48e365bbfc5(this, p0, p1); }


public moom.fS a__fS() {
return this.aN;
}


public void a(java.lang.String p0, java.lang.String p1, moom.EK p2) { __sourceHandlerCall_d510cf33735a15fc0135(this, p0, p1, p2); }


public void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {
long local11 = (net.minecraft.client.Minecraft.cb ^ 73391905187951L);
    float local13 = 0x1.0p-8f;
    float local14 = 0x1.0p-8f;
    moom.lw local15 = ((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__lw();
    ((moom.lw)(local15)).a(((int)(__sourceIntrinsic_8bf3499a1f62_originalDynamicSite1763_3(30632, (5496560229335783445L ^ local11)))), ((moom.oD)(moom.oB.k)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local15)).a(((double)(((double) p0))), ((double)(((double) (p1 + p5)))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) p2) * local13)))), ((double)(((double) (((float) (p3 + p5)) * local14))))))).a(((int)(p6)), ((int)(p7)), ((int)(p8)), ((int)(p9))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local15)).a(((double)(((double) (p0 + p4)))), ((double)(((double) (p1 + p5)))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) (p2 + p4)) * local13)))), ((double)(((double) (((float) (p3 + p5)) * local14))))))).a(((int)(p6)), ((int)(p7)), ((int)(p8)), ((int)(p9))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local15)).a(((double)(((double) (p0 + p4)))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) (p2 + p4)) * local13)))), ((double)(((double) (((float) p3) * local14))))))).a(((int)(p6)), ((int)(p7)), ((int)(p8)), ((int)(p9))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local15)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) p2) * local13)))), ((double)(((double) (((float) p3) * local14))))))).a(((int)(p6)), ((int)(p7)), ((int)(p8)), ((int)(p9))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(net.minecraft.client.renderer.Tessellator.a())).a__Void();
    return;
}


private void a(net.minecraft.client.renderer.texture.TextureManager p0) throws org.lwjgl.LWJGLException { __sourceHandlerCall_798cdf07f09b2e5c8fe7(this, p0); }


private java.nio.ByteBuffer a(java.io.InputStream p0) throws java.io.IOException { return __sourceHandlerCall_7d316aa8771f3ac4afe2(this, p0); }


public void a__Void(moom.qY p0) {
this.ao = ((boolean)(true));
    this.ap = ((moom.qY)(p0));
    return;
}


public net.minecraft.world.storage.ISaveFormat a__IK() {
return this.az;
}


public void a(net.minecraft.client.gui.GuiScreen p0) { __sourceHandlerCall_8334e3bab4640965b5d4(this, p0); }


public void a(java.lang.String p0) { __sourceHandlerCall_37b58dc0c53ca651bf7f(this, p0); }


public static java.util.Map<java.lang.String, java.lang.String> a__Map() {
java.lang.Object local0 = com.google.common.collect.Maps.newHashMap();
    ((java.util.Map)(local0)).put(((java.lang.Object)("X-Minecraft-Username")), ((java.lang.Object)(((net.minecraft.util.Session)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__DH())).c())));
    ((java.util.Map)(local0)).put(((java.lang.Object)("X-Minecraft-UUID")), ((java.lang.Object)(((net.minecraft.util.Session)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__DH())).b())));
    ((java.util.Map)(local0)).put(((java.lang.Object)("X-Minecraft-Version")), ((java.lang.Object)("1.8.9")));
    return ((java.util.Map<java.lang.String,java.lang.String>)(local0));
}


public void a(net.minecraft.profiler.PlayerUsageSnooper p0) { __sourceHandlerCall_c3b79a0253d68125a025(this, p0); }


public net.minecraft.client.network.NetHandlerPlayClient a__jS() { return __sourceHandlerCall_42a8edfe927ae02b67b8(this); }


public com.google.common.util.concurrent.ListenableFuture<java.lang.Object> a__ListenableFuture() {
return ((net.minecraft.client.Minecraft)(this)).a(((java.lang.Runnable)(__sourceIntrinsic_0c7dbd457ccd_originalDynamicSite1764_0(this))));
}


private net.minecraft.item.ItemStack a(net.minecraft.item.Item p0, int p1, net.minecraft.tileentity.TileEntity p2) { return __sourceHandlerCall_eab7c6e614f09989b934(this, p0, p1, p2); }


public moom.qY a(moom.qY p0) { return __sourceHandlerCall_ae36b49c998fc0c8198d(this, p0); }


public void a(net.minecraft.client.multiplayer.WorldClient p0, java.lang.String p1) { __sourceHandlerCall_bfebd81fe6ec8851c1aa(this, p0, p1); }


public moom.jL a__jL() {
return this.al;
}


private void a(long p0) { __sourceHandlerCall_20ea1058d105435a3ea6(this, p0); }


public void a(net.minecraft.client.multiplayer.WorldClient p0) {
((net.minecraft.client.Minecraft)(this)).a(((net.minecraft.client.multiplayer.WorldClient)(p0)), ((java.lang.String)("")));
    return;
}


public void a(moom.jL p0) {
this.al = ((moom.jL)(p0));
    return;
}


public void m() {
((moom.A9)(this.j)).a__Void(((java.lang.String)("display_update")));
    org.lwjgl.opengl.Display.update();
    ((moom.A9)(this.j)).b();
    ((net.minecraft.client.Minecraft)(this)).n();
    return;
}


public boolean m__Boolean() {
return ((((this.w) ? 1 : 0)) != 0);
}


public void o() { __sourceHandlerCall_3bd7f968c9bbd85cb4e5(this); }


public boolean o__Boolean() { return __sourceHandlerCall_62759a2fed459c7b5060(this); }


public boolean p__Boolean() {
return ((((this.aq) ? 1 : 0)) != 0);
}


public void p() {
this.ag = ((boolean)(false));
    return;
}


public void k() { __sourceHandlerCall_5814106dd6803e495bff(this); }


public boolean k__Boolean() { return __sourceHandlerCall_1965165a7cc15eb90f3e(this); }


public void t() { __sourceHandlerCall_8c1da29ff810fcdadef5(this); }


public void g() {
long var1 = net.minecraft.client.Minecraft.cb ^ 14551808812916L;
      int[] var3;
      int[] var10000 = net.minecraft.client.Minecraft.b__ArrayInt();
      net.minecraft.util.Util$EnumOS var4 = moom.DQ.a();
      var3 = var10000;
      if (var4 != net.minecraft.util.Util$EnumOS.OSX) {
         ByteBuffer var5;
         ByteBuffer var6;
         try {
            var5 = org.lwjgl.util.IOUtil.ioResourceToByteBuffer(((java.lang.String)("icon16x16.png")), ((int)(__sourceIntrinsic_5176b1a6fbd6_invokedynamic538_4(5240, 558352830389302403L ^ var1))));
            var6 = org.lwjgl.util.IOUtil.ioResourceToByteBuffer(((java.lang.String)("icon32x32.png")), ((int)(__sourceIntrinsic_5176b1a6fbd6_invokedynamic538_6(12884, 8312698603841884921L ^ var1))));
         } catch (Exception var14) {
            throw new RuntimeException(var14);
         }

         IntBuffer var7 = org.lwjgl.system.MemoryUtil.memAllocInt(((int)(1)));
         IntBuffer var8 = org.lwjgl.system.MemoryUtil.memAllocInt(((int)(1)));
         IntBuffer var9 = org.lwjgl.system.MemoryUtil.memAllocInt(((int)(1)));
         org.lwjgl.glfw.GLFWImage.Buffer var10 = org.lwjgl.glfw.GLFWImage.malloc(((int)(2)));

         try {
            ByteBuffer var11 = org.lwjgl.stb.STBImage.stbi_load_from_memory(((java.nio.ByteBuffer)(var5)), ((java.nio.IntBuffer)(var7)), ((java.nio.IntBuffer)(var8)), ((java.nio.IntBuffer)(var9)), ((int)(4)));
            ((org.lwjgl.glfw.GLFWImage.Buffer)(((org.lwjgl.glfw.GLFWImage.Buffer)(((org.lwjgl.glfw.GLFWImage.Buffer)(((org.lwjgl.glfw.GLFWImage.Buffer)(((org.lwjgl.glfw.GLFWImage.Buffer)(var10)).position(((int)(0))))))).width(((int)(((java.nio.IntBuffer)(var7)).get(((int)(0)))))))).height(((int)(((java.nio.IntBuffer)(var8)).get(((int)(0)))))))).pixels(((java.nio.ByteBuffer)(var11)));
            ByteBuffer var12 = org.lwjgl.stb.STBImage.stbi_load_from_memory(((java.nio.ByteBuffer)(var6)), ((java.nio.IntBuffer)(var7)), ((java.nio.IntBuffer)(var8)), ((java.nio.IntBuffer)(var9)), ((int)(4)));
            ((org.lwjgl.glfw.GLFWImage.Buffer)(((org.lwjgl.glfw.GLFWImage.Buffer)(((org.lwjgl.glfw.GLFWImage.Buffer)(((org.lwjgl.glfw.GLFWImage.Buffer)(((org.lwjgl.glfw.GLFWImage.Buffer)(var10)).position(((int)(1))))))).width(((int)(((java.nio.IntBuffer)(var7)).get(((int)(0)))))))).height(((int)(((java.nio.IntBuffer)(var8)).get(((int)(0)))))))).pixels(((java.nio.ByteBuffer)(var12)));
            ((org.lwjgl.glfw.GLFWImage.Buffer)(var10)).position(((int)(0)));
            org.lwjgl.glfw.GLFW.glfwSetWindowIcon(((long)(org.lwjgl.opengl.Display.getWindow())), ((org.lwjgl.glfw.GLFWImage.Buffer)(var10)));
            org.lwjgl.stb.STBImage.stbi_image_free(((java.nio.ByteBuffer)(var12)));
            org.lwjgl.stb.STBImage.stbi_image_free(((java.nio.ByteBuffer)(var11)));
         } catch (Throwable var17) {
            org.lwjgl.glfw.GLFWImage.Buffer var18;
            exception_exit: {
               guard_done: {
                  try {
                     var18 = var10;
                     if (var3 == null) break guard_done;
                     if (var18 == null) break exception_exit;
                  } catch (Exception var16) {
                     throw __sourceExactCall_f33a03b157dfaf(((java.lang.Throwable)(var16)));
                  }
                  var18 = var10;
               }
               try {
                  ((org.lwjgl.glfw.GLFWImage.Buffer)(var18)).close();
               } catch (Throwable var13) {
                  ((java.lang.Throwable)(var17)).addSuppressed(((java.lang.Throwable)(var13)));
               }
            }
            throw var17;
         }
         normal_done: {
            org.lwjgl.glfw.GLFWImage.Buffer var19;
            normal_guard: {
               var19 = var10;
               if (var3 == null) break normal_guard;
               if (var19 == null) break normal_done;
               var19 = var10;
            }
            ((org.lwjgl.glfw.GLFWImage.Buffer)(var19)).close();
         }
      }
}


public boolean g__Boolean() { return __sourceHandlerCall_d00d2cdff838282a1b3a(this); }


public void v() { __sourceHandlerCall_680d1de31633c7d095f1(this); }


private void j() throws org.lwjgl.LWJGLException { __sourceHandlerCall_e0e4954f1d76eddf7a6c(this); }


public boolean j__Boolean() {
return ((((this.aF) ? 1 : 0)) != 0);
}


public void q() { __sourceHandlerCall_a3c5b6eb684972586cd8(this); }


public void z() { __sourceHandlerCall_ffda589781fd42444c71(this); }


private void w() { __sourceHandlerCall_c78864da5a55346cb76e(this); }


public void u() { __sourceHandlerCall_bde4c8cfda37ef2b9e17(this); }


public void r() { __sourceHandlerCall_8ef75a10d587996867ff(this); }


private void y() { __sourceHandlerCall_92afbaa84f9bf95d825f(this); }


private java.lang.String lambda$runTick$2() throws java.lang.Exception {
return ((java.lang.Class)(((java.lang.Object)(this.P)).getClass())).getCanonicalName();
}


private java.lang.String lambda$runTick$1() throws java.lang.Exception {
return ((java.lang.Class)(((java.lang.Object)(this.P)).getClass())).getCanonicalName();
}


private java.lang.String lambda$startGame$0(java.lang.String p0) {
try {
        return java.lang.String.format(((java.lang.String)(p0)), ((java.lang.Object[])(new java.lang.Object[] {__sourceExactCall_8c6467d9b9664e(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(this.W)).as)).b())))})));
    } catch (java.lang.Exception caught2) {
        return __sourceIntrinsic_62d71096bc30_invokedynamic10131_6(((java.lang.Exception)(caught2)).getLocalizedMessage());
    }
}


private static java.lang.String lambda$addGraphicsAndWorldToCrashReport$6() throws java.lang.Exception { return __sourceHandlerCall_c3221cbde87f77402f23(); }


private java.lang.String lambda$addGraphicsAndWorldToCrashReport$3() throws java.lang.Exception {
return this.u;
}


private java.lang.String lambda$addGraphicsAndWorldToCrashReport$9() throws java.lang.Exception {
return ((moom.oU)(((net.minecraft.client.resources.LanguageManager)(this.aJ)).a__oU())).toString();
}


private java.lang.String lambda$addGraphicsAndWorldToCrashReport$5() throws java.lang.Exception { return __sourceHandlerCall_2cd3e8c50a5a41a2a00f(this); }


private static java.lang.String lambda$addGraphicsAndWorldToCrashReport$4() throws java.lang.Exception {
long local0_life2 = (net.minecraft.client.Minecraft.cb ^ 97943686211277L);
    return __sourceIntrinsic_28cc387169b2_originalDynamicSite786_12(org.lwjgl.opengl.GL11.glGetString(((int)(__sourceIntrinsic_28cc387169b2_originalDynamicSite786_4(2943, (4789411665843218959L ^ local0_life2))))), org.lwjgl.opengl.GL11.glGetString(((int)(__sourceIntrinsic_28cc387169b2_originalDynamicSite786_7(17930, (832712611965183764L ^ local0_life2))))), org.lwjgl.opengl.GL11.glGetString(((int)(__sourceIntrinsic_28cc387169b2_originalDynamicSite786_10(8905, (3804521884816884703L ^ local0_life2))))));
}


private java.lang.String lambda$addGraphicsAndWorldToCrashReport$8() throws java.lang.Exception { return __sourceHandlerCall_ee8fc366c4f944b7caad(this); }


private static java.lang.String lambda$addGraphicsAndWorldToCrashReport$7() throws java.lang.Exception {
return "Client (map_client.txt)";
}


private java.lang.String lambda$addGraphicsAndWorldToCrashReport$10() throws java.lang.Exception { return __sourceHandlerCall_d8f96d39495f9c8f1dfa(this); }


private static native <E extends Throwable> int __sourceIntrinsic_8bf3499a1f62_originalDynamicSite1763_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_0c7dbd457ccd_originalDynamicSite1764_0(net.minecraft.client.Minecraft a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10079_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral10086_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5176b1a6fbd6_invokedynamic538_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5176b1a6fbd6_invokedynamic538_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_28cc387169b2_originalDynamicSite786_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_28cc387169b2_originalDynamicSite786_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_28cc387169b2_originalDynamicSite786_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_28cc387169b2_originalDynamicSite786_12(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_62d71096bc30_invokedynamic10131_6(java.lang.String a0) throws E;

private static native <E extends Throwable> E __sourceExactCall_f33a03b157dfaf(java.lang.Throwable p0) throws E;
private static native java.lang.String __sourceExactCall_8c6467d9b9664e(int p0);
}
