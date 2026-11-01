package net.minecraft.client.settings;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GameSettings$Options extends sourcebuild.EnumConstructor<net.minecraft.client.settings.GameSettings$Options> {

public static net.minecraft.client.settings.GameSettings$Options INVERT_MOUSE;

public static net.minecraft.client.settings.GameSettings$Options SENSITIVITY;

public static net.minecraft.client.settings.GameSettings$Options FOV;

public static net.minecraft.client.settings.GameSettings$Options GAMMA;

public static net.minecraft.client.settings.GameSettings$Options SATURATION;

public static net.minecraft.client.settings.GameSettings$Options RENDER_DISTANCE;

public static net.minecraft.client.settings.GameSettings$Options VIEW_BOBBING;

public static net.minecraft.client.settings.GameSettings$Options ANAGLYPH;

public static net.minecraft.client.settings.GameSettings$Options FRAMERATE_LIMIT;

public static net.minecraft.client.settings.GameSettings$Options FBO_ENABLE;

public static net.minecraft.client.settings.GameSettings$Options RENDER_CLOUDS;

public static net.minecraft.client.settings.GameSettings$Options GRAPHICS;

public static net.minecraft.client.settings.GameSettings$Options AMBIENT_OCCLUSION;

public static net.minecraft.client.settings.GameSettings$Options GUI_SCALE;

public static net.minecraft.client.settings.GameSettings$Options PARTICLES;

public static net.minecraft.client.settings.GameSettings$Options CHAT_VISIBILITY;

public static net.minecraft.client.settings.GameSettings$Options CHAT_COLOR;

public static net.minecraft.client.settings.GameSettings$Options CHAT_LINKS;

public static net.minecraft.client.settings.GameSettings$Options CHAT_OPACITY;

public static net.minecraft.client.settings.GameSettings$Options CHAT_LINKS_PROMPT;

public static net.minecraft.client.settings.GameSettings$Options SNOOPER_ENABLED;

public static net.minecraft.client.settings.GameSettings$Options USE_FULLSCREEN;

public static net.minecraft.client.settings.GameSettings$Options ENABLE_VSYNC;

public static net.minecraft.client.settings.GameSettings$Options USE_VBO;

public static net.minecraft.client.settings.GameSettings$Options TOUCHSCREEN;

public static net.minecraft.client.settings.GameSettings$Options CHAT_SCALE;

public static net.minecraft.client.settings.GameSettings$Options CHAT_WIDTH;

public static net.minecraft.client.settings.GameSettings$Options CHAT_HEIGHT_FOCUSED;

public static net.minecraft.client.settings.GameSettings$Options CHAT_HEIGHT_UNFOCUSED;

public static net.minecraft.client.settings.GameSettings$Options MIPMAP_LEVELS;

public static net.minecraft.client.settings.GameSettings$Options FORCE_UNICODE_FONT;

public static net.minecraft.client.settings.GameSettings$Options STREAM_BYTES_PER_PIXEL;

public static net.minecraft.client.settings.GameSettings$Options STREAM_VOLUME_MIC;

public static net.minecraft.client.settings.GameSettings$Options STREAM_VOLUME_SYSTEM;

public static net.minecraft.client.settings.GameSettings$Options STREAM_KBPS;

public static net.minecraft.client.settings.GameSettings$Options STREAM_FPS;

public static net.minecraft.client.settings.GameSettings$Options STREAM_COMPRESSION;

public static net.minecraft.client.settings.GameSettings$Options STREAM_SEND_METADATA;

public static net.minecraft.client.settings.GameSettings$Options STREAM_CHAT_ENABLED;

public static net.minecraft.client.settings.GameSettings$Options STREAM_CHAT_USER_FILTER;

public static net.minecraft.client.settings.GameSettings$Options STREAM_MIC_TOGGLE_BEHAVIOR;

public static net.minecraft.client.settings.GameSettings$Options BLOCK_ALTERNATIVES;

public static net.minecraft.client.settings.GameSettings$Options REDUCED_DEBUG_INFO;

public static net.minecraft.client.settings.GameSettings$Options ENTITY_SHADOWS;

public static net.minecraft.client.settings.GameSettings$Options REALMS_NOTIFICATIONS;

public static net.minecraft.client.settings.GameSettings$Options FOG_FANCY;

public static net.minecraft.client.settings.GameSettings$Options FOG_START;

public static net.minecraft.client.settings.GameSettings$Options MIPMAP_TYPE;

public static net.minecraft.client.settings.GameSettings$Options SMOOTH_FPS;

public static net.minecraft.client.settings.GameSettings$Options CLOUDS;

public static net.minecraft.client.settings.GameSettings$Options CLOUD_HEIGHT;

public static net.minecraft.client.settings.GameSettings$Options TREES;

public static net.minecraft.client.settings.GameSettings$Options RAIN;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_WATER;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_LAVA;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_FIRE;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_PORTAL;

public static net.minecraft.client.settings.GameSettings$Options AO_LEVEL;

public static net.minecraft.client.settings.GameSettings$Options LAGOMETER;

public static net.minecraft.client.settings.GameSettings$Options SHOW_FPS;

public static net.minecraft.client.settings.GameSettings$Options AUTOSAVE_TICKS;

public static net.minecraft.client.settings.GameSettings$Options BETTER_GRASS;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_REDSTONE;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_EXPLOSION;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_FLAME;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_SMOKE;

public static net.minecraft.client.settings.GameSettings$Options WEATHER;

public static net.minecraft.client.settings.GameSettings$Options SKY;

public static net.minecraft.client.settings.GameSettings$Options STARS;

public static net.minecraft.client.settings.GameSettings$Options SUN_MOON;

public static net.minecraft.client.settings.GameSettings$Options VIGNETTE;

public static net.minecraft.client.settings.GameSettings$Options CHUNK_UPDATES;

public static net.minecraft.client.settings.GameSettings$Options CHUNK_UPDATES_DYNAMIC;

public static net.minecraft.client.settings.GameSettings$Options TIME;

public static net.minecraft.client.settings.GameSettings$Options CLEAR_WATER;

public static net.minecraft.client.settings.GameSettings$Options SMOOTH_WORLD;

public static net.minecraft.client.settings.GameSettings$Options VOID_PARTICLES;

public static net.minecraft.client.settings.GameSettings$Options WATER_PARTICLES;

public static net.minecraft.client.settings.GameSettings$Options RAIN_SPLASH;

public static net.minecraft.client.settings.GameSettings$Options PORTAL_PARTICLES;

public static net.minecraft.client.settings.GameSettings$Options POTION_PARTICLES;

public static net.minecraft.client.settings.GameSettings$Options FIREWORK_PARTICLES;

public static net.minecraft.client.settings.GameSettings$Options PROFILER;

public static net.minecraft.client.settings.GameSettings$Options DRIPPING_WATER_LAVA;

public static net.minecraft.client.settings.GameSettings$Options BETTER_SNOW;

public static net.minecraft.client.settings.GameSettings$Options FULLSCREEN_MODE;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_TERRAIN;

public static net.minecraft.client.settings.GameSettings$Options SWAMP_COLORS;

public static net.minecraft.client.settings.GameSettings$Options RANDOM_ENTITIES;

public static net.minecraft.client.settings.GameSettings$Options SMOOTH_BIOMES;

public static net.minecraft.client.settings.GameSettings$Options CUSTOM_FONTS;

public static net.minecraft.client.settings.GameSettings$Options CUSTOM_COLORS;

public static net.minecraft.client.settings.GameSettings$Options SHOW_CAPES;

public static net.minecraft.client.settings.GameSettings$Options CONNECTED_TEXTURES;

public static net.minecraft.client.settings.GameSettings$Options CUSTOM_ITEMS;

public static net.minecraft.client.settings.GameSettings$Options AA_LEVEL;

public static net.minecraft.client.settings.GameSettings$Options AF_LEVEL;

public static net.minecraft.client.settings.GameSettings$Options ANIMATED_TEXTURES;

public static net.minecraft.client.settings.GameSettings$Options NATURAL_TEXTURES;

public static net.minecraft.client.settings.GameSettings$Options EMISSIVE_TEXTURES;

public static net.minecraft.client.settings.GameSettings$Options HELD_ITEM_TOOLTIPS;

public static net.minecraft.client.settings.GameSettings$Options DROPPED_ITEMS;

public static net.minecraft.client.settings.GameSettings$Options LAZY_CHUNK_LOADING;

public static net.minecraft.client.settings.GameSettings$Options CUSTOM_SKY;

public static net.minecraft.client.settings.GameSettings$Options FAST_MATH;

public static net.minecraft.client.settings.GameSettings$Options TRANSLUCENT_BLOCKS;

public static net.minecraft.client.settings.GameSettings$Options DYNAMIC_FOV;

public static net.minecraft.client.settings.GameSettings$Options DYNAMIC_LIGHTS;

public static net.minecraft.client.settings.GameSettings$Options ALTERNATE_BLOCKS;

public static net.minecraft.client.settings.GameSettings$Options CUSTOM_ENTITY_MODELS;

public static net.minecraft.client.settings.GameSettings$Options ADVANCED_TOOLTIPS;

public static net.minecraft.client.settings.GameSettings$Options SCREENSHOT_SIZE;

public static net.minecraft.client.settings.GameSettings$Options CUSTOM_GUIS;

public static net.minecraft.client.settings.GameSettings$Options RENDER_REGIONS;

public static net.minecraft.client.settings.GameSettings$Options SHOW_GL_ERRORS;

public static net.minecraft.client.settings.GameSettings$Options SMART_ANIMATIONS;

private boolean a;

private boolean b;

private java.lang.String c;

private float d;

private float e;

private float f;

private static net.minecraft.client.settings.GameSettings$Options[] g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

private GameSettings$Options(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4) {
this(p0, p1, p2, p3, p4, 0x0.0p0f, 0x1.0p0f, 0x0.0p0f);
    return;
}


private GameSettings$Options(java.lang.String p0, int p1, java.lang.String p2, boolean p3, boolean p4, float p5, float p6, float p7) {
super(p0, p1);
    this.c = p2;
    this.a = p3;
    this.b = p4;
    this.e = p5;
    this.f = p6;
    this.d = p7;
}


private static void initialize() {
javax.crypto.Cipher forestValue400022_36_0;
    int forestValue400022_36_1;
    javax.crypto.SecretKeyFactory forestValue400022_36_2;
    byte[] forestValue400022_36_3;
    javax.crypto.Cipher forestValue400022_53_0;
    int forestValue400022_53_1;
    javax.crypto.SecretKeyFactory forestValue400022_53_2;
    byte[] forestValue400022_53_3;
    long[] forestValue400022_157_0;
    int forestValue400022_157_1;
    long forestValue400022_157_2;
    int forestValue400022_157_3;
    long[] forestValue400022_300_0;
    int forestValue400022_300_1;
    long forestValue400022_300_2;
    long[] forestValue400022_312_0;
    int forestValue400022_312_1;
    long forestValue400022_312_2;
    javax.crypto.Cipher spill400022_0;
    int spill400022_1;
    javax.crypto.SecretKeyFactory spill400022_2;
    byte[] spill400022_3;
    byte[] spill400022_4;
    java.lang.String spill400022_5;
    int spill400022_6;
    int spill400022_7;
    long spill400022_8;
    long spill400022_9;
    int spill400022_10;
    java.lang.String spill400022_11;
    int spill400022_12;
    long[] spill400022_13;
    int spill400022_14;
    long spill400022_15;
    int spill400022_16;
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
    h = ((long)(((moom._a)(moom._c.a(((long)(4206427987652623017L)), ((long)(-3466624835283018799L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37428166632406L)))));
    life11_11 = (net.minecraft.client.settings.GameSettings$Options.h ^ 30441874822830L);
    k = ((java.util.Map)(new java.util.HashMap(13)));
    spill400022_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill400022_1 = 2;
    spill400022_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp400022_9_0 = new byte[8];
    spill400022_3 = __stackOp400022_9_0;
    (__stackOp400022_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue400022_36_0 = spill400022_0;
    forestValue400022_36_1 = spill400022_1;
    forestValue400022_36_2 = spill400022_2;
    forestValue400022_36_3 = spill400022_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue400022_53_0 = forestValue400022_36_0;
        forestValue400022_53_1 = forestValue400022_36_1;
        forestValue400022_53_2 = forestValue400022_36_2;
        forestValue400022_53_3 = forestValue400022_36_3;
        break forest_join_53;
    }
    byte[] __stackOp400022_10_0 = forestValue400022_36_3;
    spill400022_4 = __stackOp400022_10_0;
    (__stackOp400022_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue400022_36_3 = spill400022_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue400022_53_0)).init(((int)(forestValue400022_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue400022_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue400022_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[221];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "\004nxý\007àh\006efñyO¬«Q»R©»-iBÊûa2Z\007\005u/\000¨²x}¦WÌ{lyÖ ¬u¦¦Q¬¹wýyc N`«@»Ñ¶\037­Kà©{!ñ4+ÖÂ¢¶X\037\023 `Èªíp¬·âß\023¸Ô\177°Hauó·Ã¬üÇkdnQîÒù¼\034t¼ÈÏy¨<\"b$û¨L*\035ò\024¤cþ.®¬K\021\020À\025;Ýæúw1³Å)p¤\006\002PÄ4+è!±^ÛÙ¦qßÑ\026ã¹VðCÐvaÐÆ§¿³ô ½\ff1(Ç^\022L¬Ñv\\g,bÃ\001ZÓ\034ÄÚE4\021¬\003õÊ$\n¶rúÒ7\n ¬JÃo\020âN ½q\bfn? 'µÂålµø\017Cë)¶0éýªâ\177Ï¤æTn¾|JºÞ(<o\022Qê&ýN yqÌâëbU¶a\030Ó\006¸8WI\021º /á¹NT\n_²³qZãõÖscób_Q\025\004\001\tÄÊ\007\001æ0t;©Ów\n\037XÕ Aë£R`Éy¼\027Tùú`\000ùójÜ~\033¤°'ý6È£Uè]#ðN+\022j¡D¥Îâ¢?¬ÞÞ{óbÇ \025ÒÍ2êI\003[jÏ\030Ñ+m'í½L¿lA\020}\023i¹á\034«0}\016TÜ{ÂÈì6ý§ºIÌÐ160«à§{ÁUÿ4»÷){2Zéä(¢^û\017iG2¥p\005PHÝz÷Ð1,@ë\034!\034i`rÞÍ\002MF7EõÙ ùÐ<Ú\007>Hc\030ÙT\026Ã£-º%·vx²ùo&í]¢§\004ß\032¨m¸/ê¼{ô!¥\tÕÆ\fÉ^yÀçÅ,I²ný©ÿÄï\fÊ@æ/\005T9\016n\032¬*õð2¹í\177Îû³8\004nÑTJ« \020Ê\035Vq¸¦õ\027UPÞt®6\001ð»ï¦%Ëø]\016ZÃð&@Y'11%ê'jq·IÜæËªfkT;»²D±\b-YJÁÇv¾±3\025Û(º\027äê\027å\006{ºE|²\022ú\022F\rqî\034ä\016\017^\033ý\035½/x`qßDsQjg«K=\000)mBÛ·&i%~ö-Aeõ$Â\031\037ó\031Îa,_ü§(ãÍ5åI\003F5&\026\027ñáÇúZ\016AÛ²¼[/fWÙ½ÕÚ\"rþ\030¹æ¹Û¯ñ_«\023x\035<\037öÕö:\023\001#I ¡¥\036b=0FÞ­³\013×¾\022¬LoaWu³1Dá\007ÌÊ\025TMï\n|9ºL§è¼¹=b¡Ô±è+$<ñ·':wÄÂÈ~³©®ªq\037n$±Ú³¨Â;YZ?©`õ\005ü§¶cÇÒ}FC\n¤\027gí·´ \035Ë£tua©c©ê+)Ýª¦#À­H+yû®X\0064À&Fê\0334U×Bê_Zéç°dÏµr\t\016ò:\023V00÷`KÉµ9\tÚ×y_\030UØàr\003AlabVï Òeõ83n.c£<ªN1\\\\Xìq5\005û%P]Ópvpy\035h+´¥th­¸å%k\035+§Óµ\021MèæÈÈ¶ê \0047ñ7,\017ù\177øEAm®zJÕcÁÂÞì¥dnhÀÓPèÁX¼\005ß]ìÏÆõ7\030oÌ#}·ð\003nÂÃ³c¹k±ÐQ1°Ó\021÷JÍÖ\"74ZÑw9\000Zú0èäöRW6ar¢©{É\033ÃÛïe)¸\036\\â6;ãîÄ<ºº2}ÛI\033\030Ñ:ßÙBDø\023MMO§\023_6ý-,\002$rÒXB¶'G½Þ\031ìÄa±\"ÔÉ`&À(õ8ÅÇÿângÎ73å¤ÊúDjè\rÝ¹øñqa-æñÛèÑ\017ëP8n°BÎ@ÉJ\023¿¼»¶ì-P7q\006XÏoný\016l'Ë\004]ò§5<«/\036\177+föeª}¸õiÑî\001?\017\021Kµ5m${Ø.¦\0036\f{\034B×o´§=Güö6oZ¦«÷\023Å<<a¡Õ¯E\025¶>\024 z¾Z\002MzÿbÃV#óy\021X¢(\000ØAGdÄ®À×¸/ÃHÆ% Ïfúhµî\b\023KvÎ¡k\025¾\022-ò\t­ãß~Î\005Ìª»+ï®ÊïÛ\034ßÈý&=(ØÚÔDSj\033\013\030\f§\000aXz¨¤\006\004¢ñ]ª$$Ìx2x\037\020¤pP_\fÍf¦B6%«¼ÞÑä¦¶Mû¡?T\bX]âZ_ÜüLÚ+\rRyÜ\fø\0305)rrâÓþoû(ôíLYò\002Ü×¯zØÏÅ?q½\032h÷à\\\b'ï$h¶@}y\000<\023ß½O4\036=%¶\177{\022TÌ\0048b¥¿¢(\f\037µ¬ùo¥ÿV&WWê§Ât\022ì\005p¬å\035.¤Ã\b"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill400022_5 = life4_71;
    spill400022_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill400022_5)).substring(((int)(spill400022_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue400022_157_0 = life6_66;
    forestValue400022_157_1 = (life3_68++);
    forestValue400022_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue400022_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp400022_16_0 = forestValue400022_157_2;
    int __stackOp400022_16_1 = forestValue400022_157_3;
    spill400022_7 = __stackOp400022_16_1;
    spill400022_8 = __stackOp400022_16_0;
    recovery.source.CarrierOps.discard(__stackOp400022_16_1);
    life8_160 = spill400022_8;
    byte[] __stackOp400022_18_0 = new byte[] {((byte) ((int) (life8_160 >>> 56))), ((byte) ((int) (life8_160 >>> 48))), ((byte) ((int) (life8_160 >>> 40))), ((byte) ((int) (life8_160 >>> 32))), ((byte) ((int) (life8_160 >>> 24))), ((byte) ((int) (life8_160 >>> 16))), ((byte) ((int) (life8_160 >>> 8))), ((byte) ((int) life8_160))};
    javax.crypto.Cipher __stackOp400022_18_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp400022_18_1)).doFinal(((byte[])(__stackOp400022_18_0)));
    int __stackOp400022_20_0 = spill400022_7;
    long __stackOp400022_20_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill400022_9 = __stackOp400022_20_1;
    spill400022_10 = __stackOp400022_20_0;
    recovery.source.CarrierOps.discard(__stackOp400022_20_1);
    switch (spill400022_10) {
default:
{
        forestValue400022_300_0 = forestValue400022_157_0;
        forestValue400022_300_1 = forestValue400022_157_1;
        forestValue400022_300_2 = spill400022_9;
        break forest_join_300;
    }
case 0:
{
        forestValue400022_312_0 = forestValue400022_157_0;
        forestValue400022_312_1 = forestValue400022_157_1;
        forestValue400022_312_2 = spill400022_9;
        break forest_join_312;
    }
}
    }
    (forestValue400022_300_0)[forestValue400022_300_1] = forestValue400022_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "j¶ÕÂ¾P¨áøâKc\007ê"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue400022_312_0)[forestValue400022_312_1] = forestValue400022_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill400022_11 = life4_71;
    spill400022_12 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill400022_11)).substring(((int)(spill400022_12)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill400022_13 = life6_66;
    spill400022_14 = (life3_68++);
    spill400022_15 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill400022_16 = 0;
    forestValue400022_157_0 = spill400022_13;
    forestValue400022_157_1 = spill400022_14;
    forestValue400022_157_2 = spill400022_15;
    forestValue400022_157_3 = spill400022_16;
    continue forest_cycle_157;
    }
    }
    }
    i = ((long[])(life6_66));
    j = ((java.lang.Integer[])(new java.lang.Integer[221]));
    INVERT_MOUSE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("INVERT_MOUSE", 0, "options.invertMouse", false, true)));
    SENSITIVITY = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SENSITIVITY", 1, "options.sensitivity", true, false)));
    FOV = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("FOV", 2, "options.fov", true, false, 0x1.ep4f, 0x1.b8p6f, 0x1.0p0f)));
    GAMMA = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("GAMMA", 3, "options.gamma", true, false)));
    SATURATION = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SATURATION", 4, "options.saturation", true, false)));
    RENDER_DISTANCE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("RENDER_DISTANCE", 5, "options.renderDistance", true, false, 0x1.0p1f, 0x1.0p4f, 0x1.0p0f)));
    VIEW_BOBBING = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("VIEW_BOBBING", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_33(13776, (5905194505458723117L ^ life11_11)), "options.viewBobbing", false, true)));
    ANAGLYPH = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANAGLYPH", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_35(20652, (8651720600089709775L ^ life11_11)), "options.anaglyph", false, true)));
    FRAMERATE_LIMIT = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("FRAMERATE_LIMIT", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_37(5216, (2167145645396461580L ^ life11_11)), "options.framerateLimit", true, false, 0x0.0p0f, 0x1.04p8f, 0x1.4p2f)));
    FBO_ENABLE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("FBO_ENABLE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_39(27529, (7522328356790138790L ^ life11_11)), "options.fboEnable", false, true)));
    RENDER_CLOUDS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("RENDER_CLOUDS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_41(3509, (8150449483974578625L ^ life11_11)), "options.renderClouds", false, false)));
    GRAPHICS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("GRAPHICS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_43(7006, (1698351249049749262L ^ life11_11)), "options.graphics", false, false)));
    AMBIENT_OCCLUSION = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("AMBIENT_OCCLUSION", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_45(28624, (1909993146469872522L ^ life11_11)), "options.ao", false, false)));
    GUI_SCALE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("GUI_SCALE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_47(26922, (8564380170151032073L ^ life11_11)), "options.guiScale", false, false)));
    PARTICLES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("PARTICLES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_49(29736, (3200114637689677917L ^ life11_11)), "options.particles", false, false)));
    CHAT_VISIBILITY = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHAT_VISIBILITY", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_51(18229, (2904126894045027196L ^ life11_11)), "options.chat.visibility", false, false)));
    CHAT_COLOR = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHAT_COLOR", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_53(3331, (4253209091733360991L ^ life11_11)), "options.chat.color", false, true)));
    CHAT_LINKS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHAT_LINKS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_55(31282, (4838891138785437409L ^ life11_11)), "options.chat.links", false, true)));
    CHAT_OPACITY = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHAT_OPACITY", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_57(27933, (1861120540370366789L ^ life11_11)), "options.chat.opacity", true, false)));
    CHAT_LINKS_PROMPT = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHAT_LINKS_PROMPT", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_59(26853, (7598658457417381038L ^ life11_11)), "options.chat.links.prompt", false, true)));
    SNOOPER_ENABLED = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SNOOPER_ENABLED", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_61(17893, (2842069356425927047L ^ life11_11)), "options.snooper", false, true)));
    USE_FULLSCREEN = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("USE_FULLSCREEN", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_63(14406, (6317905137801012475L ^ life11_11)), "options.fullscreen", false, true)));
    ENABLE_VSYNC = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ENABLE_VSYNC", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_65(14119, (341536194879957954L ^ life11_11)), "options.vsync", false, true)));
    USE_VBO = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("USE_VBO", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_67(10340, (6780989399697503301L ^ life11_11)), "options.vbo", false, true)));
    TOUCHSCREEN = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("TOUCHSCREEN", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_69(636, (4092489178591534640L ^ life11_11)), "options.touchscreen", false, true)));
    CHAT_SCALE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHAT_SCALE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_71(27605, (6924545694740117399L ^ life11_11)), "options.chat.scale", true, false)));
    CHAT_WIDTH = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHAT_WIDTH", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_73(1593, (2562774586253351428L ^ life11_11)), "options.chat.width", true, false)));
    CHAT_HEIGHT_FOCUSED = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHAT_HEIGHT_FOCUSED", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_75(576, (460496064200154782L ^ life11_11)), "options.chat.height.focused", true, false)));
    CHAT_HEIGHT_UNFOCUSED = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHAT_HEIGHT_UNFOCUSED", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_77(8795, (7597583744757218957L ^ life11_11)), "options.chat.height.unfocused", true, false)));
    MIPMAP_LEVELS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("MIPMAP_LEVELS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_79(2778, (5748468449626265315L ^ life11_11)), "options.mipmapLevels", true, false, 0x0.0p0f, 0x1.0p2f, 0x1.0p0f)));
    FORCE_UNICODE_FONT = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("FORCE_UNICODE_FONT", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_81(20614, (8132958307925576806L ^ life11_11)), "options.forceUnicodeFont", false, true)));
    STREAM_BYTES_PER_PIXEL = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_BYTES_PER_PIXEL", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_83(2295, (4541385430151009287L ^ life11_11)), "options.stream.bytesPerPixel", true, false)));
    STREAM_VOLUME_MIC = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_VOLUME_MIC", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_85(32514, (3987353818789045162L ^ life11_11)), "options.stream.micVolumne", true, false)));
    STREAM_VOLUME_SYSTEM = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_VOLUME_SYSTEM", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_87(4235, (9172685297895214112L ^ life11_11)), "options.stream.systemVolume", true, false)));
    STREAM_KBPS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_KBPS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_89(29079, (6556050445791063464L ^ life11_11)), "options.stream.kbps", true, false)));
    STREAM_FPS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_FPS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_91(30231, (6780556665558133489L ^ life11_11)), "options.stream.fps", true, false)));
    STREAM_COMPRESSION = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_COMPRESSION", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_93(10694, (8479199384716424491L ^ life11_11)), "options.stream.compression", false, false)));
    STREAM_SEND_METADATA = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_SEND_METADATA", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_95(22651, (4657811812657349801L ^ life11_11)), "options.stream.sendMetadata", false, true)));
    STREAM_CHAT_ENABLED = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_CHAT_ENABLED", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_97(15068, (1629018685797934612L ^ life11_11)), "options.stream.chat.enabled", false, false)));
    STREAM_CHAT_USER_FILTER = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_CHAT_USER_FILTER", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_99(5726, (4316777377017793253L ^ life11_11)), "options.stream.chat.userFilter", false, false)));
    STREAM_MIC_TOGGLE_BEHAVIOR = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STREAM_MIC_TOGGLE_BEHAVIOR", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_101(30975, (874090210164958366L ^ life11_11)), "options.stream.micToggleBehavior", false, false)));
    BLOCK_ALTERNATIVES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("BLOCK_ALTERNATIVES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_103(16565, (5205951771212241921L ^ life11_11)), "options.blockAlternatives", false, true)));
    REDUCED_DEBUG_INFO = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("REDUCED_DEBUG_INFO", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_105(7682, (3191184529811243560L ^ life11_11)), "options.reducedDebugInfo", false, true)));
    ENTITY_SHADOWS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ENTITY_SHADOWS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_107(14528, (8095651189107401974L ^ life11_11)), "options.entityShadows", false, true)));
    REALMS_NOTIFICATIONS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("REALMS_NOTIFICATIONS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_109(32622, (2669369138059141904L ^ life11_11)), "options.realmsNotifications", false, true)));
    FOG_FANCY = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("FOG_FANCY", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_111(705, (5552880001740676859L ^ life11_11)), "of.options.FOG_FANCY", false, false)));
    FOG_START = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("FOG_START", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_113(8101, (7633139233970553729L ^ life11_11)), "of.options.FOG_START", false, false)));
    MIPMAP_TYPE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("MIPMAP_TYPE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_115(13950, (2709119959397149328L ^ life11_11)), "of.options.MIPMAP_TYPE", true, false, 0x0.0p0f, 0x1.8p1f, 0x1.0p0f)));
    SMOOTH_FPS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SMOOTH_FPS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_117(24908, (8909072307618217461L ^ life11_11)), "of.options.SMOOTH_FPS", false, false)));
    CLOUDS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CLOUDS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_119(19854, (8763347038620995912L ^ life11_11)), "of.options.CLOUDS", false, false)));
    CLOUD_HEIGHT = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CLOUD_HEIGHT", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_121(27199, (6623545633172780639L ^ life11_11)), "of.options.CLOUD_HEIGHT", true, false)));
    TREES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("TREES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_123(25832, (6396822456343427142L ^ life11_11)), "of.options.TREES", false, false)));
    RAIN = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("RAIN", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_125(28238, (3735536086053581343L ^ life11_11)), "of.options.RAIN", false, false)));
    ANIMATED_WATER = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_WATER", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_127(4991, (5189924869941301088L ^ life11_11)), "of.options.ANIMATED_WATER", false, false)));
    ANIMATED_LAVA = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_LAVA", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_129(25965, (7367461455230302567L ^ life11_11)), "of.options.ANIMATED_LAVA", false, false)));
    ANIMATED_FIRE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_FIRE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_131(26203, (9220445207249615546L ^ life11_11)), "of.options.ANIMATED_FIRE", false, false)));
    ANIMATED_PORTAL = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_PORTAL", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_133(28485, (555450026976834317L ^ life11_11)), "of.options.ANIMATED_PORTAL", false, false)));
    AO_LEVEL = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("AO_LEVEL", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_135(634, (8796879107225853651L ^ life11_11)), "of.options.AO_LEVEL", true, false)));
    LAGOMETER = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("LAGOMETER", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_137(25260, (5429366693352996423L ^ life11_11)), "of.options.LAGOMETER", false, false)));
    SHOW_FPS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SHOW_FPS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_139(21084, (9211701510995168914L ^ life11_11)), "of.options.SHOW_FPS", false, false)));
    AUTOSAVE_TICKS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("AUTOSAVE_TICKS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_141(5925, (4582558770432216007L ^ life11_11)), "of.options.AUTOSAVE_TICKS", false, false)));
    BETTER_GRASS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("BETTER_GRASS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_143(16361, (3834972463977702338L ^ life11_11)), "of.options.BETTER_GRASS", false, false)));
    ANIMATED_REDSTONE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_REDSTONE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_145(30723, (701010483790177313L ^ life11_11)), "of.options.ANIMATED_REDSTONE", false, false)));
    ANIMATED_EXPLOSION = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_EXPLOSION", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_147(2426, (3574769102143165871L ^ life11_11)), "of.options.ANIMATED_EXPLOSION", false, false)));
    ANIMATED_FLAME = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_FLAME", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_149(5497, (6514847257098979676L ^ life11_11)), "of.options.ANIMATED_FLAME", false, false)));
    ANIMATED_SMOKE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_SMOKE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_151(11955, (4721203655752790771L ^ life11_11)), "of.options.ANIMATED_SMOKE", false, false)));
    WEATHER = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("WEATHER", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_153(5816, (1009785524966591120L ^ life11_11)), "of.options.WEATHER", false, false)));
    SKY = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SKY", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_155(15553, (6917543739270930454L ^ life11_11)), "of.options.SKY", false, false)));
    STARS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("STARS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_157(23951, (5247942995890815484L ^ life11_11)), "of.options.STARS", false, false)));
    SUN_MOON = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SUN_MOON", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_159(28154, (8650090003664859560L ^ life11_11)), "of.options.SUN_MOON", false, false)));
    VIGNETTE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("VIGNETTE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_161(30985, (5996957405697467706L ^ life11_11)), "of.options.VIGNETTE", false, false)));
    CHUNK_UPDATES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHUNK_UPDATES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_163(31791, (7889764506808082576L ^ life11_11)), "of.options.CHUNK_UPDATES", false, false)));
    CHUNK_UPDATES_DYNAMIC = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CHUNK_UPDATES_DYNAMIC", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_165(23762, (4573624587186880625L ^ life11_11)), "of.options.CHUNK_UPDATES_DYNAMIC", false, false)));
    TIME = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("TIME", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_167(17462, (6115378811937642646L ^ life11_11)), "of.options.TIME", false, false)));
    CLEAR_WATER = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CLEAR_WATER", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_169(31640, (4151254171378739164L ^ life11_11)), "of.options.CLEAR_WATER", false, false)));
    SMOOTH_WORLD = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SMOOTH_WORLD", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_171(26146, (2111272977839880828L ^ life11_11)), "of.options.SMOOTH_WORLD", false, false)));
    VOID_PARTICLES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("VOID_PARTICLES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_173(24817, (8390185626501020921L ^ life11_11)), "of.options.VOID_PARTICLES", false, false)));
    WATER_PARTICLES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("WATER_PARTICLES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_175(18906, (6149669669059679498L ^ life11_11)), "of.options.WATER_PARTICLES", false, false)));
    RAIN_SPLASH = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("RAIN_SPLASH", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_177(19618, (6611711783479169215L ^ life11_11)), "of.options.RAIN_SPLASH", false, false)));
    PORTAL_PARTICLES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("PORTAL_PARTICLES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_179(19042, (1104279191454471846L ^ life11_11)), "of.options.PORTAL_PARTICLES", false, false)));
    POTION_PARTICLES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("POTION_PARTICLES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_181(10545, (3476100693293708559L ^ life11_11)), "of.options.POTION_PARTICLES", false, false)));
    FIREWORK_PARTICLES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("FIREWORK_PARTICLES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_183(28846, (494073616725896401L ^ life11_11)), "of.options.FIREWORK_PARTICLES", false, false)));
    PROFILER = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("PROFILER", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_185(12197, (5852173031815787293L ^ life11_11)), "of.options.PROFILER", false, false)));
    DRIPPING_WATER_LAVA = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("DRIPPING_WATER_LAVA", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_187(26995, (6306723782438188392L ^ life11_11)), "of.options.DRIPPING_WATER_LAVA", false, false)));
    BETTER_SNOW = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("BETTER_SNOW", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_189(29835, (5653710016966256739L ^ life11_11)), "of.options.BETTER_SNOW", false, false)));
    FULLSCREEN_MODE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("FULLSCREEN_MODE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_191(21509, (4332279587809478676L ^ life11_11)), "of.options.FULLSCREEN_MODE", true, false, 0x0.0p0f, ((float) (moom.BU.a__ArrayDisplayMode()).length), 0x1.0p0f)));
    ANIMATED_TERRAIN = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_TERRAIN", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_194(26261, (6066897631952501285L ^ life11_11)), "of.options.ANIMATED_TERRAIN", false, false)));
    SWAMP_COLORS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SWAMP_COLORS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_196(30801, (4385276680083498002L ^ life11_11)), "of.options.SWAMP_COLORS", false, false)));
    RANDOM_ENTITIES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("RANDOM_ENTITIES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_198(7946, (5797899619557213183L ^ life11_11)), "of.options.RANDOM_ENTITIES", false, false)));
    SMOOTH_BIOMES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SMOOTH_BIOMES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_200(13534, (6485450880019048498L ^ life11_11)), "of.options.SMOOTH_BIOMES", false, false)));
    CUSTOM_FONTS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CUSTOM_FONTS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_202(13437, (1543586045151062174L ^ life11_11)), "of.options.CUSTOM_FONTS", false, false)));
    CUSTOM_COLORS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CUSTOM_COLORS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_204(28846, (8525001750374149234L ^ life11_11)), "of.options.CUSTOM_COLORS", false, false)));
    SHOW_CAPES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SHOW_CAPES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_206(28983, (5042764344435862810L ^ life11_11)), "of.options.SHOW_CAPES", false, false)));
    CONNECTED_TEXTURES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CONNECTED_TEXTURES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_208(5878, (965657525572209281L ^ life11_11)), "of.options.CONNECTED_TEXTURES", false, false)));
    CUSTOM_ITEMS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CUSTOM_ITEMS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_210(16836, (5903408159773154767L ^ life11_11)), "of.options.CUSTOM_ITEMS", false, false)));
    AA_LEVEL = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("AA_LEVEL", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_212(19379, (8461108494141708223L ^ life11_11)), "of.options.AA_LEVEL", true, false, 0x0.0p0f, 0x1.0p4f, 0x1.0p0f)));
    AF_LEVEL = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("AF_LEVEL", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_214(264, (4722991249741159929L ^ life11_11)), "of.options.AF_LEVEL", true, false, 0x1.0p0f, 0x1.0p4f, 0x1.0p0f)));
    ANIMATED_TEXTURES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ANIMATED_TEXTURES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_216(26861, (1835283924802368747L ^ life11_11)), "of.options.ANIMATED_TEXTURES", false, false)));
    NATURAL_TEXTURES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("NATURAL_TEXTURES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_218(1099, (8169997549363697812L ^ life11_11)), "of.options.NATURAL_TEXTURES", false, false)));
    EMISSIVE_TEXTURES = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("EMISSIVE_TEXTURES", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_220(945, (1731085648529989592L ^ life11_11)), "of.options.EMISSIVE_TEXTURES", false, false)));
    HELD_ITEM_TOOLTIPS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("HELD_ITEM_TOOLTIPS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_222(27436, (608311623344257021L ^ life11_11)), "of.options.HELD_ITEM_TOOLTIPS", false, false)));
    DROPPED_ITEMS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("DROPPED_ITEMS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_224(32372, (8563597123461734995L ^ life11_11)), "of.options.DROPPED_ITEMS", false, false)));
    LAZY_CHUNK_LOADING = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("LAZY_CHUNK_LOADING", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_226(5900, (6985084212160400357L ^ life11_11)), "of.options.LAZY_CHUNK_LOADING", false, false)));
    CUSTOM_SKY = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CUSTOM_SKY", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_228(533, (1428360385846844961L ^ life11_11)), "of.options.CUSTOM_SKY", false, false)));
    FAST_MATH = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("FAST_MATH", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_230(31725, (5134776529613350784L ^ life11_11)), "of.options.FAST_MATH", false, false)));
    TRANSLUCENT_BLOCKS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("TRANSLUCENT_BLOCKS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_232(19581, (6231168153805541476L ^ life11_11)), "of.options.TRANSLUCENT_BLOCKS", false, false)));
    DYNAMIC_FOV = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("DYNAMIC_FOV", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_234(27825, (4823360453868843179L ^ life11_11)), "of.options.DYNAMIC_FOV", false, false)));
    DYNAMIC_LIGHTS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("DYNAMIC_LIGHTS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_236(14160, (6434142419242855230L ^ life11_11)), "of.options.DYNAMIC_LIGHTS", false, false)));
    ALTERNATE_BLOCKS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ALTERNATE_BLOCKS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_238(8348, (6143994084731567190L ^ life11_11)), "of.options.ALTERNATE_BLOCKS", false, false)));
    CUSTOM_ENTITY_MODELS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CUSTOM_ENTITY_MODELS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_240(11987, (2022003268948603422L ^ life11_11)), "of.options.CUSTOM_ENTITY_MODELS", false, false)));
    ADVANCED_TOOLTIPS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("ADVANCED_TOOLTIPS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_242(26101, (5384038491009022392L ^ life11_11)), "of.options.ADVANCED_TOOLTIPS", false, false)));
    SCREENSHOT_SIZE = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SCREENSHOT_SIZE", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_244(10879, (2397907260656039600L ^ life11_11)), "of.options.SCREENSHOT_SIZE", false, false)));
    CUSTOM_GUIS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("CUSTOM_GUIS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_246(6976, (2343560092226783034L ^ life11_11)), "of.options.CUSTOM_GUIS", false, false)));
    RENDER_REGIONS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("RENDER_REGIONS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_248(20486, (6788677748683197491L ^ life11_11)), "of.options.RENDER_REGIONS", false, false)));
    SHOW_GL_ERRORS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SHOW_GL_ERRORS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_250(12797, (4819540590008282426L ^ life11_11)), "of.options.SHOW_GL_ERRORS", false, false)));
    SMART_ANIMATIONS = ((net.minecraft.client.settings.GameSettings$Options)(new net.minecraft.client.settings.GameSettings$Options("SMART_ANIMATIONS", __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_252(31329, (6578365922114987524L ^ life11_11)), "of.options.SMART_ANIMATIONS", false, false)));
    g = ((net.minecraft.client.settings.GameSettings$Options[])(net.minecraft.client.settings.GameSettings$Options.a__ArrayaM()));
}


public static net.minecraft.client.settings.GameSettings$Options[] values() {
return ((net.minecraft.client.settings.GameSettings$Options[])(((net.minecraft.client.settings.GameSettings$Options[])(net.minecraft.client.settings.GameSettings$Options.g)).clone()));
}


public static net.minecraft.client.settings.GameSettings$Options valueOf(java.lang.String p0) {
return ((net.minecraft.client.settings.GameSettings$Options)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.settings.GameSettings$Options.class)), ((java.lang.String)(p0)))));
}


public boolean b() {
return ((((this.b) ? 1 : 0)) != 0);
}


public float b(float p0) {
return ((net.minecraft.client.settings.GameSettings$Options)(this)).c(((float)((this.e + ((this.f - this.e) * moom.Dr.a(((float)(p0)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))))));
}


public float c(float p0) {
p0 = ((net.minecraft.client.settings.GameSettings$Options)(this)).d(((float)(p0)));
    return moom.Dr.a(((float)(p0)), ((float)(this.e)), ((float)(this.f)));
}


private float d(float p0) {
float forwardValue4860_24_0;
    float spill4860_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_24: {
    forward_join_23: {
    life2_3 = (net.minecraft.client.settings.GameSettings$Options.h ^ 28960013614447L);
    life4_5 = net.minecraft.client.settings.GameSettings.b__Arrayr3();
    spill4860_0 = this.d;
    if (!((life4_5 != null))) {
        forwardValue4860_24_0 = spill4860_0;
        break forward_join_24;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill4860_0)), ((float)(0x0.0p0f))) > 0))) {
        break forward_join_23;
    }
    p0 = (this.d * ((float) java.lang.Math.round(((float)((p0 / this.d))))));
    }
    forwardValue4860_24_0 = p0;
    }
    return forwardValue4860_24_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10925_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12330;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/aM", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static net.minecraft.client.settings.GameSettings$Options[] a__ArrayaM() {
long local0_life1 = (net.minecraft.client.settings.GameSettings$Options.h ^ 52200663201754L);
    net.minecraft.client.settings.GameSettings$Options[] __sourceSharedArray1087_4 = new net.minecraft.client.settings.GameSettings$Options[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_2(17934, (3409777996872514413L ^ local0_life1))];
    __sourceSharedArray1087_4[0] = net.minecraft.client.settings.GameSettings$Options.INVERT_MOUSE;
    __sourceSharedArray1087_4[1] = net.minecraft.client.settings.GameSettings$Options.SENSITIVITY;
    __sourceSharedArray1087_4[2] = net.minecraft.client.settings.GameSettings$Options.FOV;
    __sourceSharedArray1087_4[3] = net.minecraft.client.settings.GameSettings$Options.GAMMA;
    __sourceSharedArray1087_4[4] = net.minecraft.client.settings.GameSettings$Options.SATURATION;
    __sourceSharedArray1087_4[5] = net.minecraft.client.settings.GameSettings$Options.RENDER_DISTANCE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_10(24443, (1269171889057456655L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.VIEW_BOBBING;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_12(19230, (7750605557648619186L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANAGLYPH;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_14(24724, (2256262446233115929L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.FRAMERATE_LIMIT;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_16(28743, (3311257123796176374L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.FBO_ENABLE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_18(15006, (7386047591086655430L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.RENDER_CLOUDS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_20(2106, (5626838239874135323L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.GRAPHICS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_22(25109, (2834379276762701766L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.AMBIENT_OCCLUSION;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_24(19955, (2810115322540290217L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.GUI_SCALE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_26(14723, (3097326962893816995L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.PARTICLES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_28(2661, (5034496835457431316L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHAT_VISIBILITY;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_30(30643, (6552297159318555348L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHAT_COLOR;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_32(25675, (516683115632351628L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHAT_LINKS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_34(28741, (7300238999804988748L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHAT_OPACITY;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_36(7031, (6596984561897449135L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHAT_LINKS_PROMPT;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_38(12650, (7424563524856777830L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SNOOPER_ENABLED;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_40(30727, (1721737287480886676L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.USE_FULLSCREEN;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_42(25130, (991713498035707740L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ENABLE_VSYNC;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_44(9177, (7444562382562729714L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.USE_VBO;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_46(22923, (5277259239299441840L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.TOUCHSCREEN;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_48(1658, (897445693838539521L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHAT_SCALE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_50(31057, (598867769807127600L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHAT_WIDTH;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_52(25392, (6869665459924098675L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHAT_HEIGHT_FOCUSED;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_54(27477, (6663163859913496134L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHAT_HEIGHT_UNFOCUSED;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_56(20739, (2805184347633872024L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.MIPMAP_LEVELS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_58(19510, (1224091129844527591L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.FORCE_UNICODE_FONT;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_60(30862, (4944427432190395797L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_BYTES_PER_PIXEL;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_62(8070, (4155728861507592857L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_VOLUME_MIC;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_64(6224, (3037621266215150870L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_VOLUME_SYSTEM;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_66(22074, (4062027033064958837L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_KBPS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_68(19965, (7072281614549676159L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_FPS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_70(10337, (6421749723229787592L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_COMPRESSION;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_72(27681, (6617316357394092454L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_SEND_METADATA;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_74(12792, (8510070745097768116L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_CHAT_ENABLED;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_76(6896, (799262552323500022L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_CHAT_USER_FILTER;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_78(25039, (1055810669369416827L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STREAM_MIC_TOGGLE_BEHAVIOR;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_80(29488, (5235455138666892884L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.BLOCK_ALTERNATIVES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_82(13971, (1852020626725473043L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.REDUCED_DEBUG_INFO;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_84(15180, (5312807648999999075L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ENTITY_SHADOWS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_86(12877, (8816073241121066785L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.REALMS_NOTIFICATIONS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_88(13505, (5259160359210387896L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.FOG_FANCY;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_90(12597, (1268235979191061675L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.FOG_START;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_92(13516, (6913455247253408121L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.MIPMAP_TYPE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_94(24447, (1602633985543135953L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SMOOTH_FPS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_96(18333, (2762324592695868151L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CLOUDS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_98(24147, (6724102641628111757L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CLOUD_HEIGHT;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_100(30798, (528510177850082692L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.TREES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_102(28891, (8468971283554192723L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.RAIN;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_104(10721, (8407249621413237809L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_WATER;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_106(14218, (3181624833729989262L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_LAVA;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_108(3838, (3815002998567777094L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_FIRE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_110(17521, (2872962503767161286L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_PORTAL;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_112(9725, (7121004049415477456L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.AO_LEVEL;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_114(1949, (2083973265720949379L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.LAGOMETER;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_116(9962, (4215471602323659569L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SHOW_FPS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_118(14278, (5194072526029097659L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.AUTOSAVE_TICKS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_120(860, (7421529264730914380L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.BETTER_GRASS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_122(20971, (300151522419403860L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_REDSTONE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_124(13673, (1593637413943478333L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_EXPLOSION;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_126(14233, (3324532099812461265L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_FLAME;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_128(16586, (3096144022407118148L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_SMOKE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_130(11386, (5336471545755603413L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.WEATHER;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_132(3397, (1823797954828939317L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SKY;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_134(11315, (1244663393598443793L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.STARS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_136(115, (8336385660905733542L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SUN_MOON;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_138(6312, (54466962970387922L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.VIGNETTE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_140(14436, (3312599647469536597L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHUNK_UPDATES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_142(17263, (1661210491911438079L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CHUNK_UPDATES_DYNAMIC;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_144(8611, (2157243608613100697L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.TIME;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_146(26548, (7259232079331547650L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CLEAR_WATER;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_148(7070, (7205823126474139373L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SMOOTH_WORLD;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_150(20350, (2373291552367866552L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.VOID_PARTICLES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_152(27991, (1302754229984776411L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.WATER_PARTICLES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_154(2172, (3714555184253449652L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.RAIN_SPLASH;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_156(31104, (8948408703302288553L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.PORTAL_PARTICLES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_158(20347, (285295698958545513L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.POTION_PARTICLES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_160(10306, (6710515213278647696L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.FIREWORK_PARTICLES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_162(19909, (9072862923069452539L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.PROFILER;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_164(18780, (4404646062371042305L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.DRIPPING_WATER_LAVA;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_166(378, (5354477376620510423L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.BETTER_SNOW;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_168(4793, (8369350019305353195L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.FULLSCREEN_MODE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_170(10032, (7059530712675261110L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_TERRAIN;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_172(17261, (9122493538260287144L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SWAMP_COLORS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_174(30840, (19942812822390190L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.RANDOM_ENTITIES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_176(31922, (8508738847354732928L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SMOOTH_BIOMES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_178(5712, (5112779265946856231L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_FONTS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_180(31735, (3854379736548165298L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_COLORS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_182(8006, (6060856372946903619L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SHOW_CAPES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_184(7224, (2237826944511254864L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CONNECTED_TEXTURES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_186(22073, (2161264973109488438L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_ITEMS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_188(13592, (2238220178024073381L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.AA_LEVEL;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_190(1995, (7470295243336399608L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.AF_LEVEL;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_192(22716, (6441113574340912447L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ANIMATED_TEXTURES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_194(29498, (4189917546657762831L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.NATURAL_TEXTURES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_196(15911, (3319633510425690927L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.EMISSIVE_TEXTURES;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_198(26335, (1217078287067142997L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.HELD_ITEM_TOOLTIPS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_200(14468, (5966932638802740708L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.DROPPED_ITEMS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_202(2868, (216396666233796283L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.LAZY_CHUNK_LOADING;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_204(28825, (7255006795581378013L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_SKY;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_206(25994, (2335112954320967849L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.FAST_MATH;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_208(21846, (8466979312876152916L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.TRANSLUCENT_BLOCKS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_210(3969, (3924952790819812071L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.DYNAMIC_FOV;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_212(25057, (8176061545322437763L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.DYNAMIC_LIGHTS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_214(9968, (1111911536374651710L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ALTERNATE_BLOCKS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_216(6824, (3332720977218643825L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_ENTITY_MODELS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_218(14725, (854958724531160200L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.ADVANCED_TOOLTIPS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_220(22769, (6413369660701533562L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SCREENSHOT_SIZE;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_222(16761, (5208961316808817765L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.CUSTOM_GUIS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_224(22915, (8990226220358132900L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.RENDER_REGIONS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_226(10491, (735872550961386894L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SHOW_GL_ERRORS;
    __sourceSharedArray1087_4[__sourceIntrinsic_caba56201fbd_originalDynamicSite1087_228(2440, (8257106906378941480L ^ local0_life1))] = net.minecraft.client.settings.GameSettings$Options.SMART_ANIMATIONS;
    return __sourceSharedArray1087_4;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.settings.GameSettings$Options.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String a__String() {
return this.c;
}


public int a__Int() {
return ((net.minecraft.client.settings.GameSettings$Options)(this)).ordinal();
}


public boolean a__Boolean() {
return ((((this.a) ? 1 : 0)) != 0);
}


public static net.minecraft.client.settings.GameSettings$Options a(int p0) {
net.minecraft.entity.Entity[] spill1510_0;
    long life1_3;
    net.minecraft.client.settings.GameSettings$Options[] life4_5;
    int life5_8;
    int life6_11;
    net.minecraft.entity.Entity[] life3_12;
    net.minecraft.client.settings.GameSettings$Options life7_19;
    lexical_join_31: {
    life1_3 = (net.minecraft.client.settings.GameSettings$Options.h ^ 99986070157574L);
    life4_5 = net.minecraft.client.settings.GameSettings$Options.values();
    life5_8 = (life4_5).length;
    spill1510_0 = net.minecraft.client.settings.GameSettings.b__Arrayr3();
    life6_11 = 0;
    life3_12 = spill1510_0;
    lexical_cycle_13: while (true) {
    lexical_join_29: {
    lexical_join_28: {
    if (!((life6_11 < life5_8))) {
        break lexical_join_31;
    }
    life7_19 = (life4_5)[life6_11];
    if (!((life3_12 != null))) {
        break lexical_join_29;
    }
    if (!((((net.minecraft.client.settings.GameSettings$Options)(life7_19)).a__Int() == p0))) {
        break lexical_join_28;
    }
    return life7_19;
    }
    life6_11 += 1;
    }
    if (!((life3_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return null;
}


public float a() {
return this.f;
}


public void a__Void(float p0) {
this.f = ((float)(p0));
    return;
}


public float a(float p0) {
return moom.Dr.a(((float)(((((net.minecraft.client.settings.GameSettings$Options)(this)).c(((float)(p0))) - this.e) / (this.f - this.e)))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_202(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_208(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_214(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_216(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_218(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_220(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_222(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_232(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_236(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_242(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_246(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_248(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_250(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic400022_252(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10925_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_202(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_208(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_214(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_216(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_218(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_220(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_222(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_caba56201fbd_originalDynamicSite1087_228(int a0, long a1) throws E;
}
