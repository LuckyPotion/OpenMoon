package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;



















































































































import moom.ei;






























import net.minecraft.block.BlockPlanks$EnumType;






















import moom.DT;






















import net.minecraft.world.IBlockAccess;
import java.util.Map;
public class Block {

private static moom.DD a;

public static moom.DC<moom.DD, net.minecraft.block.Block> b;

public static moom.Dx<net.minecraft.block.state.IBlockState> c;

private net.minecraft.creativetab.CreativeTabs d;

public static moom.eJ e;

public static moom.eJ f;

public static moom.eJ g;

public static moom.eJ h;

public static moom.eJ i;

public static moom.eJ j;

public static moom.eJ k;

public static moom.eJ l;

public static moom.eJ m;

public static moom.eJ n;

public static moom.eJ o;

public static moom.eJ p;

public static moom.eJ q;

protected boolean r;

protected int s;

protected boolean t;

protected int u;

protected boolean v;

protected float w;

protected float x;

protected boolean y;

protected boolean z;

protected boolean A;

protected double B;

protected double C;

protected double D;

protected double E;

protected double F;

protected double G;

public moom.eJ H;

public float I;

protected moom.fn J;

protected moom.fm K;

public float L;

protected moom.fA M;

private net.minecraft.block.state.IBlockState N;

private java.lang.String O;

private static java.lang.String[] P;

private static long ab;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

protected Block(moom.fn p0) {
this(((moom.fn)(p0)), ((moom.fm)(((moom.fn)(p0)).a__fm())));
    return;
}


public Block(moom.fn p0, moom.fm p1) { super(); }

private static void __sourceConstructorBody_08327b0c3c869fd7(net.minecraft.block.Block receiver, moom.fn p0, moom.fm p1) throws Throwable {
net.minecraft.block.Block forwardValue524_49_0;
    int forwardValue524_49_1;
    net.minecraft.block.Block forwardValue524_50_0;
    net.minecraft.block.Block forwardValue524_51_0;
    int forwardValue524_51_1;
    net.minecraft.block.Block forwardValue524_59_0;
    int forwardValue524_59_1;
    net.minecraft.block.Block forwardValue524_60_0;
    net.minecraft.block.Block forwardValue524_61_0;
    int forwardValue524_61_1;
    int[] spill524_0;
    net.minecraft.block.Block spill524_1;
    boolean spill524_2;
    net.minecraft.block.Block spill524_3;
    boolean spill524_4;
    long life3_3;
    int[] life5_22;
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    life3_3 = (net.minecraft.block.Block.ab ^ 65827560363747L);
    net.minecraft.block.Block.__sourceConstructorInit_08327b0c3c869fd7_0(((net.minecraft.block.Block)(receiver)));
    ((net.minecraft.block.Block)(receiver)).y = ((boolean)(true));
    spill524_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    ((net.minecraft.block.Block)(receiver)).H = ((moom.eJ)(net.minecraft.block.Block.e));
    ((net.minecraft.block.Block)(receiver)).I = ((float)(0x1.0p0f));
    ((net.minecraft.block.Block)(receiver)).L = ((float)(0x1.333334p-1f));
    ((net.minecraft.block.Block)(receiver)).J = ((moom.fn)(p0));
    life5_22 = spill524_0;
    ((net.minecraft.block.Block)(receiver)).K = ((moom.fm)(p1));
    ((net.minecraft.block.Block)(receiver)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.block.Block)(receiver)).r = ((boolean)(((net.minecraft.block.Block)(receiver)).j()));
    spill524_1 = receiver;
    spill524_2 = ((net.minecraft.block.Block)(receiver)).j();
    if (!((life5_22 != null))) {
        forwardValue524_49_0 = spill524_1;
        forwardValue524_49_1 = ((spill524_2) ? 1 : 0);
        break forward_join_49;
    }
    if (!(spill524_2)) {
        forwardValue524_50_0 = spill524_1;
        break forward_join_50;
    }
    forwardValue524_49_0 = spill524_1;
    forwardValue524_49_1 = __sourceIntrinsic_08327b0c3c869fd7_invokedynamic524_15(20438, (7893741925519734585L ^ life3_3));
    }
    forwardValue524_51_0 = forwardValue524_49_0;
    forwardValue524_51_1 = forwardValue524_49_1;
    break forward_join_51;
    }
    forwardValue524_51_0 = forwardValue524_50_0;
    forwardValue524_51_1 = 0;
    }
    ((net.minecraft.block.Block)(forwardValue524_51_0)).s = ((int)(forwardValue524_51_1));
    spill524_3 = receiver;
    spill524_4 = ((moom.fn)(p0)).c__Boolean();
    if (!((life5_22 != null))) {
        forwardValue524_59_0 = spill524_3;
        forwardValue524_59_1 = ((spill524_4) ? 1 : 0);
        break forward_join_59;
    }
    if (!((!spill524_4))) {
        forwardValue524_60_0 = spill524_3;
        break forward_join_60;
    }
    forwardValue524_59_0 = spill524_3;
    forwardValue524_59_1 = 1;
    }
    forwardValue524_61_0 = forwardValue524_59_0;
    forwardValue524_61_1 = forwardValue524_59_1;
    break forward_join_61;
    }
    forwardValue524_61_0 = forwardValue524_60_0;
    forwardValue524_61_1 = 0;
    }
    ((net.minecraft.block.Block)(forwardValue524_61_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue524_61_1)));
    ((net.minecraft.block.Block)(receiver)).M = ((moom.fA)(((net.minecraft.block.Block)(receiver)).a__fA()));
    ((net.minecraft.block.Block)(receiver)).a__Void(((net.minecraft.block.state.IBlockState)(((moom.fA)(((net.minecraft.block.Block)(receiver)).M)).a__fE())));
    return;
}


static {
ab = ((long)(((moom._a)(moom._c.a(((long)(6166287703740779349L)), ((long)(-5625393944355862420L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(13660253262764L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.String[] __sourceSpill1741_7 = new java.lang.String[4];
    long local0_life8 = (net.minecraft.block.Block.ab ^ 33652290345449L);
    net.minecraft.block.Block.b(((java.lang.String[])(__sourceSpill1741_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1741_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1741_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1741_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1741_16 = new byte[8];
    (__sourceSpill1741_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1741_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1741_18 = __sourceSpill1741_16;
    ((javax.crypto.Cipher)(__sourceSpill1741_13)).init(((int)(__sourceSpill1741_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1741_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1741_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[200];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "§îð\031¡´*\021ò \021àÿüæÊJ[-jS±`ã$Z}`ðÌ\022´Ð±¯¯¦J\f ëð\"&ä9\027yÍ¾ ø1)\\+ú}z\035°O§çØÚ3»juÚJÈ;NÁñrÙ¦é\tnÏ\tÒ\025\013*,òaÜÑ\006\002uÎÊÛ¨ô{\037{\\z\020[mI)åÝt³+ ±oÞfg×,7h\013ß\020QÎte\006à¯!ß¬fÖä_È}857\004\017CêPÉ\026G'$7ú·ô»Ã\026k\rë\007òKv8{¯.ß¡ðUr;\030¡½w­þMjw«\017¹%\036ÙÇ1ä/ÔÍÏr²\033oü\007DÙx~t\036PÑ\"½ý\0375ÇÌ¢F\026Í¨]ð\030¼9{\016\nm´°ÏM×8\020\033W°£R\002çîÝúkj7EmÃñ\034[üëÊgú×ÖÌ\0277:\0364=0r!öcËÄ»xó0¶vR\001 ·\023\fi]ákjù*i÷¶åe3qÏ#Jø-\033zöÖ­--\"2ï¹uP±Î6\005/\034ÌF\020@ Í\026z+Ô¤\022ÙOoÊ@ö\017\034KÔit-hÖÌ5ípá(Íb²dáM9EgÊ«F½\007\001\t\rd@òÂ`NïÛ\"­¿Û%ÎÁ¶ÉÆöÑãkÍÉ~ü×¦ÊN\024ñôüU×=©Á\000G`¬÷¬dªùgÜ¹ñlñg[PMig1¡7£\002ù\034^ço¨¯î}Ò\022ªp{zVP97GÖmÛ§iZûâ7à}¸()ÁI\002¡\fÈ<\016Ò¿u#÷íÉQÆâ>Ð3+Á\024ü{²ñïúSú¦ \033÷ûq\036÷C@×)+³\fÚp\017ªçþN<À<h9zîÂÌ§±§\\\032\007µr\023HèÁ6èjõ{\016>n\020\037j/-k$æÏ`Ã$\036k\f\030fç¥É¼Q\002Ît¸\0372â\027n\027'6$\004·Ï³w®úDÂ1'Ô]8d2cðÂ\0373£}MÓ ó\006íÛRîÚåÁh­èËkýÛÍ:Xñ¦+¶\013$²f |\t\033YÕ´Ö·1\002{ÄØ\017±Ö0fÝö®³ /_\n`\rõÕ=(Ôú\022ªÜ\037Ø¯¨ù2«Çx!\035Þkûª;;E_»1#2êÅÆbGÀ\030½ÈÞûÑ$È4eWó\1777\005cJmÍ(ï,*è@20Û$(\"ßö9è5ÙÐíÙW¦N/ÊÊ«=\025ÍâJ3 ÐÖÅAÃ}V WúÏ\\la]\032äP\025÷«Ð\\ëUO15gº\035A\0049º3{K±\003Ëqí\017´Å/ëï¸mS5dU£ç[OÄl\t?ì¶YÆ\n<\013IîÞ³ ¶%]^Àø\rö*+ø³Ð°ànìhÊ©Ò­ô§\001L\026\003®\013*âL¸ 6¤ÕÜj\000/h\037\031×\006+Þ²\036©Þé\016A£]-¸½¿o<¸FÉ;àðÈÖä\b_ä'I\b¶¢G¬\bU(¬Úá\\\004#1>Jò¬ÎÜ&ÅöSnßòJ\000(£k\ný&b\023Ðçß/ñøÉ\022[$,\036*ÍæÿéömÞñ\fÆy¶#s÷_«+CÏ¾Iµ1X\004®ï?óõöÿ\000(_|iÿ¨ðXaCî¾}Ê\032Oßz\013qÇýëR¯ÈÌ¬Á©Û`É=Ù%q\007\013u®¸Ü*ÏvÓîp\"Qä\035?x%d¦\033±C\025 \033ªr«Ex\025ÛL¿e°H=qâïÞè_^é\0057t\0043Y³Ue£v¨\003^²V\023¬ñ^n7]\023pßÆe/\023\001yM\036ÝR.`»ÐÐO°\016±óô\030@äÓ)\036Zº\036ö¸QÚ\177;òd\006·Í5;ø\0227½±Ævö`»Ú\036{\017öÇö¶#w¢bº8RçlæÕë¥\002O\003ï(ÆñrFÿFB\fbMb\007p\026S¼ü\177/Ûúòì^\022\0047âÎò\006ÊgÆs¬\006¡iDÿ¼È}Y©\033ÞË\013;ðRÃÅ#Ç\037âÈ­è\000v&fg¼É\030ç\022¹ìÇaPþF6C\t_\033ÒñxN\036\"Æ¼c°ÄX\003\001):Tëí±üP@mé×\bóÚÖ¯W ?ÆJ=D\003\035Tv²[-ª¤f\f·n\031Ãúý\0206¦ªÖýÏ?åÖÙ\035äÎ°é³Í³>ø_EM¡îa"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1741_27 = local6_life23;
        int __sourceSpill1741_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1741_27)).substring(((int)(__sourceSpill1741_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1741_32 = local8_life21;
        int __sourceSpill1741_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1741_35 = new byte[8];
        (__sourceSpill1741_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1741_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1741_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1741_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1741_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1741_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1741_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1741_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1741_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1741_36)).doFinal(((byte[])(__sourceSpill1741_35)));
        (__sourceSpill1741_32)[__sourceSpill1741_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "°XPiÑÝFèÆt¶\f\034"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1741_40 = local6_life23;
        int __sourceSpill1741_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1741_40)).substring(((int)(__sourceSpill1741_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1741_45 = local8_life21;
        int __sourceSpill1741_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1741_48 = new byte[8];
        (__sourceSpill1741_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1741_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1741_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1741_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1741_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1741_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1741_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1741_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1741_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1741_49)).doFinal(((byte[])(__sourceSpill1741_48)));
        (__sourceSpill1741_45)[__sourceSpill1741_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    cb = ((long[])(local8_life21));
    db = ((java.lang.Integer[])(new java.lang.Integer[200]));
    a = ((moom.DD)(new moom.DD("air")));
    b = ((moom.DC)(new moom.DC(net.minecraft.block.Block.a)));
    c = ((moom.Dx)(new moom.Dx()));
    e = ((moom.eJ)(new moom.eJ("stone", 0x1.0p0f, 0x1.0p0f)));
    f = ((moom.eJ)(new moom.eJ("wood", 0x1.0p0f, 0x1.0p0f)));
    g = ((moom.eJ)(new moom.eJ("gravel", 0x1.0p0f, 0x1.0p0f)));
    h = ((moom.eJ)(new moom.eJ("grass", 0x1.0p0f, 0x1.0p0f)));
    i = ((moom.eJ)(new moom.eJ("stone", 0x1.0p0f, 0x1.0p0f)));
    j = ((moom.eJ)(new moom.eJ("stone", 0x1.0p0f, 0x1.8p0f)));
    k = ((moom.eJ)(new moom.eK("stone", 0x1.0p0f, 0x1.0p0f)));
    l = ((moom.eJ)(new moom.eJ("cloth", 0x1.0p0f, 0x1.0p0f)));
    m = ((moom.eJ)(new moom.eJ("sand", 0x1.0p0f, 0x1.0p0f)));
    n = ((moom.eJ)(new moom.eJ("snow", 0x1.0p0f, 0x1.0p0f)));
    o = ((moom.eJ)(new moom.eL("ladder", 0x1.0p0f, 0x1.0p0f)));
    p = ((moom.eJ)(new moom.eM("anvil", 0x1.333334p-2f, 0x1.0p0f)));
    q = ((moom.eJ)(new moom.eN("slime", 0x1.0p0f, 0x1.0p0f)));
}

private static native <E extends Throwable> void __sourceConstructorInit_08327b0c3c869fd7_0(net.minecraft.block.Block a0) throws E;
private static native <E extends Throwable> net.minecraft.block.Block __sourceHandlerCall_ff65c5c81fc033468a30(java.lang.String a0) throws E;
private static final class __SourceHandler_ff65c5c81fc033468a30 {

public static net.minecraft.block.Block f481(java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue481_26_0;
    int[] spill481_0;
    moom.DC spill481_1;
    long life1_3;
    moom.DD life4_9;
    int[] life3_10;
    forward_join_26: {
    forward_join_22: {
    life1_3 = (__fieldRead481_0() ^ 68456522886986L);
    spill481_0 = __call481_1();
    life4_9 = new moom.DD(p0);
    life3_10 = spill481_0;
    spill481_1 = __fieldRead481_2();
    if (!((life3_10 != null))) {
        forwardValue481_26_0 = spill481_1;
        break forward_join_26;
    }
    if (!(__call481_3(spill481_1, life4_9))) {
        break forward_join_22;
    }
    return __cast481_6(__call481_5(__fieldRead481_4(), life4_9));
    }
    forwardValue481_26_0 = __call481_9(__fieldRead481_7(), __call481_8(p0));
    }
    return __cast481_10(forwardValue481_26_0);
}
public static net.minecraft.block.Block h481_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2048100_0(p0);
}
public static net.minecraft.block.Block h481_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2048101_0(p0);
}
public static net.minecraft.block.Block h481_2(java.lang.NumberFormatException p0) throws Throwable {
    java.lang.NumberFormatException local1 = p0;
    return null;
}
private static native long __fieldRead481_0() throws Throwable;
private static native int[] __call481_1() throws Throwable;
private static native moom.DC __fieldRead481_2() throws Throwable;
private static native boolean __call481_3(moom.DC a0, moom.DD a1) throws Throwable;
private static native moom.DC __fieldRead481_4() throws Throwable;
private static native java.lang.Object __call481_5(moom.DC a0, moom.DD a1) throws Throwable;
private static native net.minecraft.block.Block __cast481_6(java.lang.Object a0) throws Throwable;
private static native moom.DC __fieldRead481_7() throws Throwable;
private static native int __call481_8(java.lang.String a0) throws Throwable;
private static native java.lang.Object __call481_9(moom.DC a0, int a1) throws Throwable;
private static native net.minecraft.block.Block __cast481_10(java.lang.Object a0) throws Throwable;
private static native java.lang.NumberFormatException __call2048100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call2048101_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8ab5fec3f2317524a5c7() throws E;
private static final class __SourceHandler_8ab5fec3f2317524a5c7 {

public static void f720005() throws Throwable {
    net.minecraft.block.Block forestValue720005_3428_0;
    int forestValue720005_3449_0;
    int forestValue720005_3459_0;
    int forestValue720005_3461_0;
    int forestValue720005_3483_0;
    java.lang.Object forestValue720005_3532_0;
    int spill720005_0;
    moom.DD spill720005_1;
    moom.ci spill720005_2;
    int spill720005_3;
    java.lang.String spill720005_4;
    moom.ex spill720005_5;
    int spill720005_6;
    java.lang.String spill720005_7;
    moom.dC spill720005_8;
    int spill720005_9;
    java.lang.String spill720005_10;
    moom.dq spill720005_11;
    net.minecraft.block.Block spill720005_12;
    moom.dZ spill720005_13;
    int spill720005_14;
    java.lang.String spill720005_15;
    moom.cG spill720005_16;
    int spill720005_17;
    java.lang.String spill720005_18;
    net.minecraft.block.Block spill720005_19;
    int spill720005_20;
    java.lang.String spill720005_21;
    moom.dM spill720005_22;
    int spill720005_23;
    java.lang.String spill720005_24;
    moom.dN spill720005_25;
    int spill720005_26;
    java.lang.String spill720005_27;
    moom.dM spill720005_28;
    int spill720005_29;
    java.lang.String spill720005_30;
    moom.dN spill720005_31;
    int spill720005_32;
    java.lang.String spill720005_33;
    moom.dx spill720005_34;
    int spill720005_35;
    java.lang.String spill720005_36;
    moom.dw spill720005_37;
    int spill720005_38;
    java.lang.String spill720005_39;
    moom.dT spill720005_40;
    int spill720005_41;
    java.lang.String spill720005_42;
    moom.dT spill720005_43;
    int spill720005_44;
    java.lang.String spill720005_45;
    moom.dT spill720005_46;
    int spill720005_47;
    java.lang.String spill720005_48;
    moom.ee spill720005_49;
    int spill720005_50;
    java.lang.String spill720005_51;
    moom.dJ spill720005_52;
    int spill720005_53;
    java.lang.String spill720005_54;
    moom.ev spill720005_55;
    int spill720005_56;
    java.lang.String spill720005_57;
    moom.cp spill720005_58;
    int spill720005_59;
    java.lang.String spill720005_60;
    moom.dT spill720005_61;
    int spill720005_62;
    java.lang.String spill720005_63;
    net.minecraft.block.Block spill720005_64;
    int spill720005_65;
    java.lang.String spill720005_66;
    moom.c2 spill720005_67;
    moom.ef spill720005_68;
    int spill720005_69;
    java.lang.String spill720005_70;
    net.minecraft.block.BlockNote spill720005_71;
    int[] spill720005_72;
    int spill720005_73;
    java.lang.String spill720005_74;
    net.minecraft.block.BlockBed spill720005_75;
    int spill720005_76;
    java.lang.String spill720005_77;
    moom.d5 spill720005_78;
    int spill720005_79;
    java.lang.String spill720005_80;
    moom.d4 spill720005_81;
    int spill720005_82;
    java.lang.String spill720005_83;
    net.minecraft.block.BlockPistonBase spill720005_84;
    int spill720005_85;
    java.lang.String spill720005_86;
    net.minecraft.block.BlockWeb spill720005_87;
    int spill720005_88;
    java.lang.String spill720005_89;
    moom.cI spill720005_90;
    int spill720005_91;
    java.lang.String spill720005_92;
    moom.cy spill720005_93;
    int spill720005_94;
    java.lang.String spill720005_95;
    net.minecraft.block.BlockPistonBase spill720005_96;
    int spill720005_97;
    java.lang.String spill720005_98;
    moom.dY spill720005_99;
    int spill720005_100;
    java.lang.String spill720005_101;
    moom.cR spill720005_102;
    int spill720005_103;
    java.lang.String spill720005_104;
    moom.dc spill720005_105;
    int spill720005_106;
    java.lang.String spill720005_107;
    moom.cC spill720005_108;
    int spill720005_109;
    java.lang.String spill720005_110;
    moom.cB spill720005_111;
    moom.cE spill720005_112;
    moom.cE spill720005_113;
    int spill720005_114;
    java.lang.String spill720005_115;
    net.minecraft.block.Block spill720005_116;
    int spill720005_117;
    java.lang.String spill720005_118;
    net.minecraft.block.Block spill720005_119;
    int spill720005_120;
    java.lang.String spill720005_121;
    moom.ek spill720005_122;
    int spill720005_123;
    java.lang.String spill720005_124;
    moom.el spill720005_125;
    net.minecraft.block.Block spill720005_126;
    int spill720005_127;
    java.lang.String spill720005_128;
    moom.ez spill720005_129;
    int spill720005_130;
    java.lang.String spill720005_131;
    moom.cn spill720005_132;
    int spill720005_133;
    java.lang.String spill720005_134;
    net.minecraft.block.Block spill720005_135;
    int spill720005_136;
    java.lang.String spill720005_137;
    net.minecraft.block.BlockObsidian spill720005_138;
    int spill720005_139;
    java.lang.String spill720005_140;
    moom.eA spill720005_141;
    int spill720005_142;
    java.lang.String spill720005_143;
    net.minecraft.block.BlockFire spill720005_144;
    int spill720005_145;
    java.lang.String spill720005_146;
    moom.da spill720005_147;
    int spill720005_148;
    java.lang.String spill720005_149;
    moom.ew spill720005_150;
    int spill720005_151;
    java.lang.String spill720005_152;
    moom.cZ spill720005_153;
    int spill720005_154;
    java.lang.String spill720005_155;
    moom.d9 spill720005_156;
    int spill720005_157;
    java.lang.String spill720005_158;
    moom.dT spill720005_159;
    int spill720005_160;
    java.lang.String spill720005_161;
    net.minecraft.block.Block spill720005_162;
    int spill720005_163;
    java.lang.String spill720005_164;
    moom.eI spill720005_165;
    int spill720005_166;
    java.lang.String spill720005_167;
    moom.cv spill720005_168;
    moom.dy spill720005_169;
    int spill720005_170;
    java.lang.String spill720005_171;
    moom.c8 spill720005_172;
    int spill720005_173;
    java.lang.String spill720005_174;
    moom.c8 spill720005_175;
    int spill720005_176;
    java.lang.String spill720005_177;
    moom.de spill720005_178;
    int spill720005_179;
    java.lang.String spill720005_180;
    net.minecraft.block.BlockDoor spill720005_181;
    int spill720005_182;
    java.lang.String spill720005_183;
    moom.dF spill720005_184;
    int spill720005_185;
    java.lang.String spill720005_186;
    moom.d3 spill720005_187;
    int spill720005_188;
    java.lang.String spill720005_189;
    moom.ew spill720005_190;
    int spill720005_191;
    java.lang.String spill720005_192;
    moom.df spill720005_193;
    int spill720005_194;
    java.lang.String spill720005_195;
    moom.dK spill720005_196;
    int spill720005_197;
    java.lang.String spill720005_198;
    moom.cl spill720005_199;
    int spill720005_200;
    java.lang.String spill720005_201;
    net.minecraft.block.BlockDoor spill720005_202;
    int spill720005_203;
    java.lang.String spill720005_204;
    moom.cl spill720005_205;
    int spill720005_206;
    java.lang.String spill720005_207;
    moom.d8 spill720005_208;
    int spill720005_209;
    java.lang.String spill720005_210;
    moom.d8 spill720005_211;
    int spill720005_212;
    java.lang.String spill720005_213;
    moom.eB spill720005_214;
    int spill720005_215;
    java.lang.String spill720005_216;
    moom.eB spill720005_217;
    int spill720005_218;
    java.lang.String spill720005_219;
    moom.cK spill720005_220;
    int spill720005_221;
    java.lang.String spill720005_222;
    moom.es spill720005_223;
    int spill720005_224;
    java.lang.String spill720005_225;
    moom.cq spill720005_226;
    int spill720005_227;
    java.lang.String spill720005_228;
    moom.et spill720005_229;
    int spill720005_230;
    java.lang.String spill720005_231;
    moom.cM spill720005_232;
    int spill720005_233;
    java.lang.String spill720005_234;
    moom.cQ spill720005_235;
    int spill720005_236;
    java.lang.String spill720005_237;
    moom.d_ spill720005_238;
    int spill720005_239;
    java.lang.String spill720005_240;
    moom.c_ spill720005_241;
    int spill720005_242;
    java.lang.String spill720005_243;
    moom.dz spill720005_244;
    moom.dl spill720005_245;
    int spill720005_246;
    java.lang.String spill720005_247;
    moom.dR spill720005_248;
    int spill720005_249;
    java.lang.String spill720005_250;
    moom.eu spill720005_251;
    int spill720005_252;
    java.lang.String spill720005_253;
    net.minecraft.block.BlockGlowstone spill720005_254;
    int spill720005_255;
    java.lang.String spill720005_256;
    moom.cr spill720005_257;
    int spill720005_258;
    java.lang.String spill720005_259;
    moom.dl spill720005_260;
    int spill720005_261;
    java.lang.String spill720005_262;
    moom.cN spill720005_263;
    int spill720005_264;
    java.lang.String spill720005_265;
    net.minecraft.block.BlockRedstoneRepeater spill720005_266;
    int spill720005_267;
    java.lang.String spill720005_268;
    net.minecraft.block.BlockRedstoneRepeater spill720005_269;
    int spill720005_270;
    java.lang.String spill720005_271;
    moom.ct spill720005_272;
    int spill720005_273;
    java.lang.String spill720005_274;
    moom.eC spill720005_275;
    int spill720005_276;
    java.lang.String spill720005_277;
    moom.eh spill720005_278;
    moom.ey spill720005_279;
    int spill720005_280;
    java.lang.String spill720005_281;
    moom.dE spill720005_282;
    int spill720005_283;
    java.lang.String spill720005_284;
    moom.dE spill720005_285;
    int spill720005_286;
    java.lang.String spill720005_287;
    moom.dV spill720005_288;
    int spill720005_289;
    java.lang.String spill720005_290;
    moom.dV spill720005_291;
    moom.dO spill720005_292;
    int spill720005_293;
    java.lang.String spill720005_294;
    moom.cH spill720005_295;
    int spill720005_296;
    java.lang.String spill720005_297;
    moom.cH spill720005_298;
    int spill720005_299;
    java.lang.String spill720005_300;
    moom.eF spill720005_301;
    int spill720005_302;
    java.lang.String spill720005_303;
    moom.dk spill720005_304;
    int spill720005_305;
    java.lang.String spill720005_306;
    moom.ew spill720005_307;
    int spill720005_308;
    java.lang.String spill720005_309;
    moom.ew spill720005_310;
    int spill720005_311;
    java.lang.String spill720005_312;
    moom.dP spill720005_313;
    int spill720005_314;
    java.lang.String spill720005_315;
    moom.cD spill720005_316;
    moom.dQ spill720005_317;
    int spill720005_318;
    java.lang.String spill720005_319;
    moom.dz spill720005_320;
    int spill720005_321;
    java.lang.String spill720005_322;
    moom.ew spill720005_323;
    int spill720005_324;
    java.lang.String spill720005_325;
    moom.cF spill720005_326;
    int spill720005_327;
    java.lang.String spill720005_328;
    moom.c4 spill720005_329;
    int spill720005_330;
    java.lang.String spill720005_331;
    net.minecraft.block.BlockBrewingStand spill720005_332;
    int spill720005_333;
    java.lang.String spill720005_334;
    moom.cP spill720005_335;
    int spill720005_336;
    java.lang.String spill720005_337;
    moom.c5 spill720005_338;
    int spill720005_339;
    java.lang.String spill720005_340;
    moom.dt spill720005_341;
    int spill720005_342;
    java.lang.String spill720005_343;
    net.minecraft.block.Block spill720005_344;
    int spill720005_345;
    java.lang.String spill720005_346;
    moom.ds spill720005_347;
    int spill720005_348;
    java.lang.String spill720005_349;
    moom.d7 spill720005_350;
    int spill720005_351;
    java.lang.String spill720005_352;
    moom.d7 spill720005_353;
    int spill720005_354;
    java.lang.String spill720005_355;
    moom.eq spill720005_356;
    int spill720005_357;
    java.lang.String spill720005_358;
    moom.er spill720005_359;
    int spill720005_360;
    java.lang.String spill720005_361;
    moom.dj spill720005_362;
    int spill720005_363;
    java.lang.String spill720005_364;
    moom.ew spill720005_365;
    int spill720005_366;
    java.lang.String spill720005_367;
    moom.dT spill720005_368;
    int spill720005_369;
    java.lang.String spill720005_370;
    moom.c6 spill720005_371;
    int spill720005_372;
    java.lang.String spill720005_373;
    moom.eE spill720005_374;
    int spill720005_375;
    java.lang.String spill720005_376;
    moom.eD spill720005_377;
    int spill720005_378;
    java.lang.String spill720005_379;
    net.minecraft.block.Block spill720005_380;
    int spill720005_381;
    java.lang.String spill720005_382;
    moom.ew spill720005_383;
    int spill720005_384;
    java.lang.String spill720005_385;
    moom.ew spill720005_386;
    int spill720005_387;
    java.lang.String spill720005_388;
    moom.ew spill720005_389;
    int spill720005_390;
    java.lang.String spill720005_391;
    moom.c0 spill720005_392;
    int spill720005_393;
    java.lang.String spill720005_394;
    moom.cX spill720005_395;
    int spill720005_396;
    java.lang.String spill720005_397;
    moom.eG spill720005_398;
    int spill720005_399;
    java.lang.String spill720005_400;
    net.minecraft.block.BlockFlowerPot spill720005_401;
    int spill720005_402;
    java.lang.String spill720005_403;
    moom.cw spill720005_404;
    int spill720005_405;
    java.lang.String spill720005_406;
    moom.cx spill720005_407;
    int spill720005_408;
    java.lang.String spill720005_409;
    moom.cL spill720005_410;
    int spill720005_411;
    java.lang.String spill720005_412;
    net.minecraft.block.BlockSkull spill720005_413;
    int spill720005_414;
    java.lang.String spill720005_415;
    moom.dv spill720005_416;
    int spill720005_417;
    java.lang.String spill720005_418;
    moom.cZ spill720005_419;
    int spill720005_420;
    java.lang.String spill720005_421;
    moom.cm spill720005_422;
    int spill720005_423;
    java.lang.String spill720005_424;
    moom.cm spill720005_425;
    int spill720005_426;
    java.lang.String spill720005_427;
    net.minecraft.block.BlockRedstoneComparator spill720005_428;
    int spill720005_429;
    java.lang.String spill720005_430;
    net.minecraft.block.BlockRedstoneComparator spill720005_431;
    int spill720005_432;
    java.lang.String spill720005_433;
    moom.c1 spill720005_434;
    int spill720005_435;
    java.lang.String spill720005_436;
    moom.cS spill720005_437;
    int spill720005_438;
    java.lang.String spill720005_439;
    moom.dT spill720005_440;
    int spill720005_441;
    java.lang.String spill720005_442;
    moom.c9 spill720005_443;
    moom.d1 spill720005_444;
    int spill720005_445;
    java.lang.String spill720005_446;
    moom.ew spill720005_447;
    int spill720005_448;
    java.lang.String spill720005_449;
    moom.d5 spill720005_450;
    int spill720005_451;
    java.lang.String spill720005_452;
    moom.c3 spill720005_453;
    int spill720005_454;
    java.lang.String spill720005_455;
    moom.cR spill720005_456;
    int spill720005_457;
    java.lang.String spill720005_458;
    moom.dW spill720005_459;
    int spill720005_460;
    java.lang.String spill720005_461;
    moom.dI spill720005_462;
    int spill720005_463;
    java.lang.String spill720005_464;
    moom.ed spill720005_465;
    int spill720005_466;
    java.lang.String spill720005_467;
    moom.ew spill720005_468;
    int spill720005_469;
    java.lang.String spill720005_470;
    moom.ew spill720005_471;
    int spill720005_472;
    java.lang.String spill720005_473;
    moom.cs spill720005_474;
    int spill720005_475;
    java.lang.String spill720005_476;
    net.minecraft.block.BlockBarrier spill720005_477;
    int spill720005_478;
    java.lang.String spill720005_479;
    moom.eC spill720005_480;
    int spill720005_481;
    java.lang.String spill720005_482;
    moom.d0 spill720005_483;
    int spill720005_484;
    java.lang.String spill720005_485;
    net.minecraft.block.BlockSeaLantern spill720005_486;
    int spill720005_487;
    java.lang.String spill720005_488;
    moom.eb spill720005_489;
    int spill720005_490;
    java.lang.String spill720005_491;
    moom.cO spill720005_492;
    int spill720005_493;
    java.lang.String spill720005_494;
    moom.dD spill720005_495;
    int spill720005_496;
    java.lang.String spill720005_497;
    net.minecraft.block.Block spill720005_498;
    int spill720005_499;
    java.lang.String spill720005_500;
    net.minecraft.block.BlockPackedIce spill720005_501;
    int spill720005_502;
    java.lang.String spill720005_503;
    moom.cz spill720005_504;
    int spill720005_505;
    java.lang.String spill720005_506;
    moom.cW spill720005_507;
    int spill720005_508;
    java.lang.String spill720005_509;
    moom.cV spill720005_510;
    int spill720005_511;
    java.lang.String spill720005_512;
    moom.c1 spill720005_513;
    moom.d6 spill720005_514;
    int spill720005_515;
    java.lang.String spill720005_516;
    moom.ew spill720005_517;
    int spill720005_518;
    java.lang.String spill720005_519;
    moom.en spill720005_520;
    int spill720005_521;
    java.lang.String spill720005_522;
    moom.eo spill720005_523;
    int spill720005_524;
    java.lang.String spill720005_525;
    moom.dk spill720005_526;
    int spill720005_527;
    java.lang.String spill720005_528;
    moom.dk spill720005_529;
    int spill720005_530;
    java.lang.String spill720005_531;
    moom.dk spill720005_532;
    int spill720005_533;
    java.lang.String spill720005_534;
    moom.dk spill720005_535;
    int spill720005_536;
    java.lang.String spill720005_537;
    moom.dk spill720005_538;
    int spill720005_539;
    java.lang.String spill720005_540;
    moom.dz spill720005_541;
    int spill720005_542;
    java.lang.String spill720005_543;
    moom.dz spill720005_544;
    int spill720005_545;
    java.lang.String spill720005_546;
    moom.dz spill720005_547;
    int spill720005_548;
    java.lang.String spill720005_549;
    moom.dz spill720005_550;
    int spill720005_551;
    java.lang.String spill720005_552;
    moom.dz spill720005_553;
    int spill720005_554;
    java.lang.String spill720005_555;
    net.minecraft.block.BlockDoor spill720005_556;
    int spill720005_557;
    java.lang.String spill720005_558;
    net.minecraft.block.BlockDoor spill720005_559;
    int spill720005_560;
    java.lang.String spill720005_561;
    net.minecraft.block.BlockDoor spill720005_562;
    int spill720005_563;
    java.lang.String spill720005_564;
    net.minecraft.block.BlockDoor spill720005_565;
    int spill720005_566;
    java.lang.String spill720005_567;
    net.minecraft.block.BlockDoor spill720005_568;
    net.minecraft.block.Block spill720005_569;
    moom.fn spill720005_570;
    int spill720005_571;
    int spill720005_572;
    int spill720005_573;
    int spill720005_574;
    int spill720005_575;
    int spill720005_576;
    java.lang.Object spill720005_577;
    long life0_3;
    net.minecraft.block.Block life3_64;
    net.minecraft.block.Block life4_80;
    net.minecraft.block.Block life5_403;
    net.minecraft.block.Block life6_632;
    net.minecraft.block.Block life7_650;
    net.minecraft.block.Block life8_754;
    net.minecraft.block.Block life9_1016;
    net.minecraft.block.Block life10_1476;
    net.minecraft.block.Block life11_1685;
    net.minecraft.block.Block life12_1779;
    net.minecraft.block.Block life13_1933;
    net.minecraft.block.Block life14_2666;
    int[] life2_2898;
    net.minecraft.block.Block life15_3055;
    java.util.Iterator life16_3411;
    net.minecraft.block.Block life17_3420;
    int life18_3446;
    int life19_3449;
    int life20_3452;
    int life21_3461;
    int life22_3464;
    int life23_3478;
    java.util.Iterator life16_3531;
    net.minecraft.block.Block life17_3541;
    com.google.common.collect.UnmodifiableIterator life18_3546;
    net.minecraft.block.state.IBlockState life19_3555;
    int life20_3565;
    net.minecraft.block.Block life17_3580;
    com.google.common.collect.UnmodifiableIterator life18_3585;
    net.minecraft.block.state.IBlockState life19_3594;
    int life20_3604;
    forest_join_3573: {
    forest_join_3532: {
    forest_join_3489: {
    life0_3 = (__fieldRead720005_0() ^ 83608607365460L);
    spill720005_0 = 0;
    spill720005_1 = __fieldRead720005_1();
    moom.ci __stackOp720005_3_0 = __sourceUninitializedNEW720005_2();
    spill720005_2 = __stackOp720005_3_0;
    __explicitNewInit720005_4(__stackOp720005_3_0);
    __call720005_6(spill720005_0, spill720005_1, __call720005_5(spill720005_2, "air"));
    spill720005_3 = 1;
    spill720005_4 = "stone";
    moom.ex __stackOp720005_8_0 = __sourceUninitializedNEW720005_7();
    spill720005_5 = __stackOp720005_8_0;
    __explicitNewInit720005_9(__stackOp720005_8_0);
    __call720005_15(spill720005_3, spill720005_4, __call720005_14(__call720005_13(__call720005_11(__call720005_10(spill720005_5, 0x1.8p0f), 0x1.4p3f), __fieldRead720005_12()), "stone"));
    spill720005_6 = 2;
    spill720005_7 = "grass";
    moom.dC __stackOp720005_17_0 = __sourceUninitializedNEW720005_16();
    spill720005_8 = __stackOp720005_17_0;
    __explicitNewInit720005_18(__stackOp720005_17_0);
    __call720005_23(spill720005_6, spill720005_7, __call720005_22(__call720005_21(__call720005_19(spill720005_8, 0x1.333334p-1f), __fieldRead720005_20()), "grass"));
    spill720005_9 = 3;
    spill720005_10 = "dirt";
    moom.dq __stackOp720005_25_0 = __sourceUninitializedNEW720005_24();
    spill720005_11 = __stackOp720005_25_0;
    __explicitNewInit720005_26(__stackOp720005_25_0);
    __call720005_31(spill720005_9, spill720005_10, __call720005_30(__call720005_29(__call720005_27(spill720005_11, 0x1.0p-1f), __fieldRead720005_28()), "dirt"));
    net.minecraft.block.Block __stackOp720005_33_0 = __sourceUninitializedNEW720005_32();
    spill720005_12 = __stackOp720005_33_0;
    __explicitNewInit720005_35(__stackOp720005_33_0, __fieldRead720005_34());
    life3_64 = __call720005_42(__call720005_40(__call720005_39(__call720005_37(__call720005_36(spill720005_12, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_38()), "stonebrick"), __fieldRead720005_41());
    __call720005_43(4, "cobblestone", life3_64);
    moom.dZ __stackOp720005_45_0 = __sourceUninitializedNEW720005_44();
    spill720005_13 = __stackOp720005_45_0;
    __explicitNewInit720005_46(__stackOp720005_45_0);
    life4_80 = __call720005_51(__call720005_50(__call720005_48(__call720005_47(spill720005_13, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_49()), "wood");
    __call720005_52(5, "planks", life4_80);
    spill720005_14 = __invokedynamic720005_53(23606, (5698480346388474771L ^ life0_3));
    spill720005_15 = "sapling";
    moom.cG __stackOp720005_55_0 = __sourceUninitializedNEW720005_54();
    spill720005_16 = __stackOp720005_55_0;
    __explicitNewInit720005_56(__stackOp720005_55_0);
    __call720005_61(spill720005_14, spill720005_15, __call720005_60(__call720005_59(__call720005_57(spill720005_16, 0x0.0p0f), __fieldRead720005_58()), "sapling"));
    spill720005_17 = __invokedynamic720005_62(7654, (5578207598566861360L ^ life0_3));
    spill720005_18 = "bedrock";
    net.minecraft.block.Block __stackOp720005_64_0 = __sourceUninitializedNEW720005_63();
    spill720005_19 = __stackOp720005_64_0;
    __explicitNewInit720005_66(__stackOp720005_64_0, __fieldRead720005_65());
    __call720005_75(spill720005_17, spill720005_18, __call720005_74(__call720005_72(__call720005_71(__call720005_70(__call720005_68(__call720005_67(spill720005_19), 0x1.6e36p22f), __fieldRead720005_69()), "bedrock")), __fieldRead720005_73()));
    spill720005_20 = __invokedynamic720005_76(20018, (2632568270993799428L ^ life0_3));
    spill720005_21 = "flowing_water";
    moom.dM __stackOp720005_78_0 = __sourceUninitializedNEW720005_77();
    spill720005_22 = __stackOp720005_78_0;
    __explicitNewInit720005_80(__stackOp720005_78_0, __fieldRead720005_79());
    __call720005_85(spill720005_20, spill720005_21, __call720005_84(__call720005_83(__call720005_82(__call720005_81(spill720005_22, 0x1.9p6f), 3), "water")));
    spill720005_23 = __invokedynamic720005_86(20488, (5659742075874650070L ^ life0_3));
    spill720005_24 = "water";
    moom.dN __stackOp720005_88_0 = __sourceUninitializedNEW720005_87();
    spill720005_25 = __stackOp720005_88_0;
    __explicitNewInit720005_90(__stackOp720005_88_0, __fieldRead720005_89());
    __call720005_95(spill720005_23, spill720005_24, __call720005_94(__call720005_93(__call720005_92(__call720005_91(spill720005_25, 0x1.9p6f), 3), "water")));
    spill720005_26 = __invokedynamic720005_96(10570, (1448303003078974976L ^ life0_3));
    spill720005_27 = "flowing_lava";
    moom.dM __stackOp720005_98_0 = __sourceUninitializedNEW720005_97();
    spill720005_28 = __stackOp720005_98_0;
    __explicitNewInit720005_100(__stackOp720005_98_0, __fieldRead720005_99());
    __call720005_105(spill720005_26, spill720005_27, __call720005_104(__call720005_103(__call720005_102(__call720005_101(spill720005_28, 0x1.9p6f), 0x1.0p0f), "lava")));
    spill720005_29 = __invokedynamic720005_106(11936, (4349165388368599391L ^ life0_3));
    spill720005_30 = "lava";
    moom.dN __stackOp720005_108_0 = __sourceUninitializedNEW720005_107();
    spill720005_31 = __stackOp720005_108_0;
    __explicitNewInit720005_110(__stackOp720005_108_0, __fieldRead720005_109());
    __call720005_115(spill720005_29, spill720005_30, __call720005_114(__call720005_113(__call720005_112(__call720005_111(spill720005_31, 0x1.9p6f), 0x1.0p0f), "lava")));
    spill720005_32 = __invokedynamic720005_116(9688, (3933868733558280828L ^ life0_3));
    spill720005_33 = "sand";
    moom.dx __stackOp720005_118_0 = __sourceUninitializedNEW720005_117();
    spill720005_34 = __stackOp720005_118_0;
    __explicitNewInit720005_119(__stackOp720005_118_0);
    __call720005_124(spill720005_32, spill720005_33, __call720005_123(__call720005_122(__call720005_120(spill720005_34, 0x1.0p-1f), __fieldRead720005_121()), "sand"));
    spill720005_35 = __invokedynamic720005_125(12613, (4427119673464735249L ^ life0_3));
    spill720005_36 = "gravel";
    moom.dw __stackOp720005_127_0 = __sourceUninitializedNEW720005_126();
    spill720005_37 = __stackOp720005_127_0;
    __explicitNewInit720005_128(__stackOp720005_127_0);
    __call720005_133(spill720005_35, spill720005_36, __call720005_132(__call720005_131(__call720005_129(spill720005_37, 0x1.333334p-1f), __fieldRead720005_130()), "gravel"));
    spill720005_38 = __invokedynamic720005_134(18501, (2955131109226561390L ^ life0_3));
    spill720005_39 = "gold_ore";
    moom.dT __stackOp720005_136_0 = __sourceUninitializedNEW720005_135();
    spill720005_40 = __stackOp720005_136_0;
    __explicitNewInit720005_137(__stackOp720005_136_0);
    __call720005_143(spill720005_38, spill720005_39, __call720005_142(__call720005_141(__call720005_139(__call720005_138(spill720005_40, 0x1.8p1f), 0x1.4p2f), __fieldRead720005_140()), "oreGold"));
    spill720005_41 = __invokedynamic720005_144(22985, (6716030442660933350L ^ life0_3));
    spill720005_42 = "iron_ore";
    moom.dT __stackOp720005_146_0 = __sourceUninitializedNEW720005_145();
    spill720005_43 = __stackOp720005_146_0;
    __explicitNewInit720005_147(__stackOp720005_146_0);
    __call720005_153(spill720005_41, spill720005_42, __call720005_152(__call720005_151(__call720005_149(__call720005_148(spill720005_43, 0x1.8p1f), 0x1.4p2f), __fieldRead720005_150()), "oreIron"));
    spill720005_44 = __invokedynamic720005_154(3141, (7306755082856627173L ^ life0_3));
    spill720005_45 = "coal_ore";
    moom.dT __stackOp720005_156_0 = __sourceUninitializedNEW720005_155();
    spill720005_46 = __stackOp720005_156_0;
    __explicitNewInit720005_157(__stackOp720005_156_0);
    __call720005_163(spill720005_44, spill720005_45, __call720005_162(__call720005_161(__call720005_159(__call720005_158(spill720005_46, 0x1.8p1f), 0x1.4p2f), __fieldRead720005_160()), "oreCoal"));
    spill720005_47 = __invokedynamic720005_164(22328, (5546025982753972289L ^ life0_3));
    spill720005_48 = "log";
    moom.ee __stackOp720005_166_0 = __sourceUninitializedNEW720005_165();
    spill720005_49 = __stackOp720005_166_0;
    __explicitNewInit720005_167(__stackOp720005_166_0);
    __call720005_169(spill720005_47, spill720005_48, __call720005_168(spill720005_49, "log"));
    spill720005_50 = __invokedynamic720005_170(26967, (9137308961647468141L ^ life0_3));
    spill720005_51 = "leaves";
    moom.dJ __stackOp720005_172_0 = __sourceUninitializedNEW720005_171();
    spill720005_52 = __stackOp720005_172_0;
    __explicitNewInit720005_173(__stackOp720005_172_0);
    __call720005_175(spill720005_50, spill720005_51, __call720005_174(spill720005_52, "leaves"));
    spill720005_53 = __invokedynamic720005_176(21170, (7596599574237357459L ^ life0_3));
    spill720005_54 = "sponge";
    moom.ev __stackOp720005_178_0 = __sourceUninitializedNEW720005_177();
    spill720005_55 = __stackOp720005_178_0;
    __explicitNewInit720005_179(__stackOp720005_178_0);
    __call720005_184(spill720005_53, spill720005_54, __call720005_183(__call720005_182(__call720005_180(spill720005_55, 0x1.333334p-1f), __fieldRead720005_181()), "sponge"));
    spill720005_56 = __invokedynamic720005_185(29339, (8409139176892073296L ^ life0_3));
    spill720005_57 = "glass";
    moom.cp __stackOp720005_187_0 = __sourceUninitializedNEW720005_186();
    spill720005_58 = __stackOp720005_187_0;
    __explicitNewInit720005_189(__stackOp720005_187_0, __fieldRead720005_188(), false);
    __call720005_194(spill720005_56, spill720005_57, __call720005_193(__call720005_192(__call720005_190(spill720005_58, 0x1.333334p-2f), __fieldRead720005_191()), "glass"));
    spill720005_59 = __invokedynamic720005_195(5764, (6287497420712108358L ^ life0_3));
    spill720005_60 = "lapis_ore";
    moom.dT __stackOp720005_197_0 = __sourceUninitializedNEW720005_196();
    spill720005_61 = __stackOp720005_197_0;
    __explicitNewInit720005_198(__stackOp720005_197_0);
    __call720005_204(spill720005_59, spill720005_60, __call720005_203(__call720005_202(__call720005_200(__call720005_199(spill720005_61, 0x1.8p1f), 0x1.4p2f), __fieldRead720005_201()), "oreLapis"));
    spill720005_62 = __invokedynamic720005_205(10727, (7783077937343094331L ^ life0_3));
    spill720005_63 = "lapis_block";
    net.minecraft.block.Block __stackOp720005_207_0 = __sourceUninitializedNEW720005_206();
    spill720005_64 = __stackOp720005_207_0;
    __explicitNewInit720005_210(__stackOp720005_207_0, __fieldRead720005_208(), __fieldRead720005_209());
    __call720005_218(spill720005_62, spill720005_63, __call720005_217(__call720005_215(__call720005_214(__call720005_212(__call720005_211(spill720005_64, 0x1.8p1f), 0x1.4p2f), __fieldRead720005_213()), "blockLapis"), __fieldRead720005_216()));
    spill720005_65 = __invokedynamic720005_219(32318, (5485768379711129916L ^ life0_3));
    spill720005_66 = "dispenser";
    moom.c2 __stackOp720005_221_0 = __sourceUninitializedNEW720005_220();
    spill720005_67 = __stackOp720005_221_0;
    __explicitNewInit720005_222(__stackOp720005_221_0);
    __call720005_227(spill720005_65, spill720005_66, __call720005_226(__call720005_225(__call720005_223(spill720005_67, 0x1.cp1f), __fieldRead720005_224()), "dispenser"));
    moom.ef __stackOp720005_229_0 = __sourceUninitializedNEW720005_228();
    spill720005_68 = __stackOp720005_229_0;
    __explicitNewInit720005_230(__stackOp720005_229_0);
    life5_403 = __call720005_234(__call720005_233(__call720005_232(spill720005_68, __fieldRead720005_231()), 0x1.99999ap-1f), "sandStone");
    __call720005_236(__invokedynamic720005_235(17634, (4748966286202450892L ^ life0_3)), "sandstone", life5_403);
    spill720005_69 = __invokedynamic720005_237(17836, (2356909433455391420L ^ life0_3));
    spill720005_70 = "noteblock";
    net.minecraft.block.BlockNote __stackOp720005_239_0 = __sourceUninitializedNEW720005_238();
    spill720005_71 = __stackOp720005_239_0;
    __explicitNewInit720005_240(__stackOp720005_239_0);
    __call720005_243(spill720005_69, spill720005_70, __call720005_242(__call720005_241(spill720005_71, 0x1.99999ap-1f), "musicBlock"));
    spill720005_72 = __call720005_244();
    spill720005_73 = __invokedynamic720005_245(2781, (1105990336616070406L ^ life0_3));
    spill720005_74 = "bed";
    net.minecraft.block.BlockBed __stackOp720005_247_0 = __sourceUninitializedNEW720005_246();
    spill720005_75 = __stackOp720005_247_0;
    __explicitNewInit720005_248(__stackOp720005_247_0);
    __call720005_254(spill720005_73, spill720005_74, __call720005_253(__call720005_252(__call720005_251(__call720005_250(spill720005_75, __fieldRead720005_249()), 0x1.99999ap-3f), "bed")));
    spill720005_76 = __invokedynamic720005_255(3592, (5198611581851072974L ^ life0_3));
    spill720005_77 = "golden_rail";
    moom.d5 __stackOp720005_257_0 = __sourceUninitializedNEW720005_256();
    spill720005_78 = __stackOp720005_257_0;
    __explicitNewInit720005_258(__stackOp720005_257_0);
    __call720005_263(spill720005_76, spill720005_77, __call720005_262(__call720005_261(__call720005_259(spill720005_78, 0x1.666666p-1f), __fieldRead720005_260()), "goldenRail"));
    spill720005_79 = __invokedynamic720005_264(12081, (2806792213485705330L ^ life0_3));
    spill720005_80 = "detector_rail";
    moom.d4 __stackOp720005_266_0 = __sourceUninitializedNEW720005_265();
    spill720005_81 = __stackOp720005_266_0;
    __explicitNewInit720005_267(__stackOp720005_266_0);
    __call720005_272(spill720005_79, spill720005_80, __call720005_271(__call720005_270(__call720005_268(spill720005_81, 0x1.666666p-1f), __fieldRead720005_269()), "detectorRail"));
    spill720005_82 = __invokedynamic720005_273(19637, (8754674027694472170L ^ life0_3));
    spill720005_83 = "sticky_piston";
    net.minecraft.block.BlockPistonBase __stackOp720005_275_0 = __sourceUninitializedNEW720005_274();
    spill720005_84 = __stackOp720005_275_0;
    __explicitNewInit720005_276(__stackOp720005_275_0, true);
    __call720005_278(spill720005_82, spill720005_83, __call720005_277(spill720005_84, "pistonStickyBase"));
    spill720005_85 = __invokedynamic720005_279(3267, (7777122326191733513L ^ life0_3));
    spill720005_86 = "web";
    net.minecraft.block.BlockWeb __stackOp720005_281_0 = __sourceUninitializedNEW720005_280();
    spill720005_87 = __stackOp720005_281_0;
    __explicitNewInit720005_282(__stackOp720005_281_0);
    __call720005_286(spill720005_85, spill720005_86, __call720005_285(__call720005_284(__call720005_283(spill720005_87, 1), 0x1.0p2f), "web"));
    spill720005_88 = __invokedynamic720005_287(27885, (447822039684094910L ^ life0_3));
    spill720005_89 = "tallgrass";
    moom.cI __stackOp720005_289_0 = __sourceUninitializedNEW720005_288();
    spill720005_90 = __stackOp720005_289_0;
    __explicitNewInit720005_290(__stackOp720005_289_0);
    __call720005_295(spill720005_88, spill720005_89, __call720005_294(__call720005_293(__call720005_291(spill720005_90, 0x0.0p0f), __fieldRead720005_292()), "tallgrass"));
    spill720005_91 = __invokedynamic720005_296(29128, (2295570648801806037L ^ life0_3));
    spill720005_92 = "deadbush";
    moom.cy __stackOp720005_298_0 = __sourceUninitializedNEW720005_297();
    spill720005_93 = __stackOp720005_298_0;
    __explicitNewInit720005_299(__stackOp720005_298_0);
    __call720005_304(spill720005_91, spill720005_92, __call720005_303(__call720005_302(__call720005_300(spill720005_93, 0x0.0p0f), __fieldRead720005_301()), "deadbush"));
    spill720005_94 = __invokedynamic720005_305(15169, (1323466232518659248L ^ life0_3));
    spill720005_95 = "piston";
    net.minecraft.block.BlockPistonBase __stackOp720005_307_0 = __sourceUninitializedNEW720005_306();
    spill720005_96 = __stackOp720005_307_0;
    __explicitNewInit720005_308(__stackOp720005_307_0, false);
    __call720005_310(spill720005_94, spill720005_95, __call720005_309(spill720005_96, "pistonBase"));
    spill720005_97 = __invokedynamic720005_311(32032, (32701834186033726L ^ life0_3));
    spill720005_98 = "piston_head";
    moom.dY __stackOp720005_313_0 = __sourceUninitializedNEW720005_312();
    spill720005_99 = __stackOp720005_313_0;
    __explicitNewInit720005_314(__stackOp720005_313_0);
    __call720005_316(spill720005_97, spill720005_98, __call720005_315(spill720005_99, "pistonBase"));
    spill720005_100 = __invokedynamic720005_317(11654, (2627530945945655905L ^ life0_3));
    spill720005_101 = "wool";
    moom.cR __stackOp720005_319_0 = __sourceUninitializedNEW720005_318();
    spill720005_102 = __stackOp720005_319_0;
    __explicitNewInit720005_321(__stackOp720005_319_0, __fieldRead720005_320());
    __call720005_326(spill720005_100, spill720005_101, __call720005_325(__call720005_324(__call720005_322(spill720005_102, 0x1.99999ap-1f), __fieldRead720005_323()), "cloth"));
    spill720005_103 = __invokedynamic720005_327(30332, (6986384678461079937L ^ life0_3));
    spill720005_104 = "piston_extension";
    moom.dc __stackOp720005_329_0 = __sourceUninitializedNEW720005_328();
    spill720005_105 = __stackOp720005_329_0;
    __explicitNewInit720005_330(__stackOp720005_329_0);
    __call720005_331(spill720005_103, spill720005_104, spill720005_105);
    spill720005_106 = __invokedynamic720005_332(11536, (2020733124640528941L ^ life0_3));
    spill720005_107 = "yellow_flower";
    moom.cC __stackOp720005_334_0 = __sourceUninitializedNEW720005_333();
    spill720005_108 = __stackOp720005_334_0;
    __explicitNewInit720005_335(__stackOp720005_334_0);
    __call720005_340(spill720005_106, spill720005_107, __call720005_339(__call720005_338(__call720005_336(spill720005_108, 0x0.0p0f), __fieldRead720005_337()), "flower1"));
    spill720005_109 = __invokedynamic720005_341(9110, (105953039190676637L ^ life0_3));
    spill720005_110 = "red_flower";
    moom.cB __stackOp720005_343_0 = __sourceUninitializedNEW720005_342();
    spill720005_111 = __stackOp720005_343_0;
    __explicitNewInit720005_344(__stackOp720005_343_0);
    __call720005_349(spill720005_109, spill720005_110, __call720005_348(__call720005_347(__call720005_345(spill720005_111, 0x0.0p0f), __fieldRead720005_346()), "flower2"));
    moom.cE __stackOp720005_351_0 = __sourceUninitializedNEW720005_350();
    spill720005_112 = __stackOp720005_351_0;
    __explicitNewInit720005_352(__stackOp720005_351_0);
    life6_632 = __call720005_357(__call720005_356(__call720005_355(__call720005_353(spill720005_112, 0x0.0p0f), __fieldRead720005_354()), 0x1.0p-3f), "mushroom");
    __call720005_359(__invokedynamic720005_358(20422, (6477146097503221968L ^ life0_3)), "brown_mushroom", life6_632);
    moom.cE __stackOp720005_361_0 = __sourceUninitializedNEW720005_360();
    spill720005_113 = __stackOp720005_361_0;
    __explicitNewInit720005_362(__stackOp720005_361_0);
    life7_650 = __call720005_366(__call720005_365(__call720005_363(spill720005_113, 0x0.0p0f), __fieldRead720005_364()), "mushroom");
    __call720005_368(__invokedynamic720005_367(20377, (4695379272064874614L ^ life0_3)), "red_mushroom", life7_650);
    spill720005_114 = __invokedynamic720005_369(13516, (8207052483601187738L ^ life0_3));
    spill720005_115 = "gold_block";
    net.minecraft.block.Block __stackOp720005_371_0 = __sourceUninitializedNEW720005_370();
    spill720005_116 = __stackOp720005_371_0;
    __explicitNewInit720005_374(__stackOp720005_371_0, __fieldRead720005_372(), __fieldRead720005_373());
    __call720005_382(spill720005_114, spill720005_115, __call720005_381(__call720005_379(__call720005_378(__call720005_376(__call720005_375(spill720005_116, 0x1.8p1f), 0x1.4p3f), __fieldRead720005_377()), "blockGold"), __fieldRead720005_380()));
    spill720005_117 = __invokedynamic720005_383(3819, (2979632701196237300L ^ life0_3));
    spill720005_118 = "iron_block";
    net.minecraft.block.Block __stackOp720005_385_0 = __sourceUninitializedNEW720005_384();
    spill720005_119 = __stackOp720005_385_0;
    __explicitNewInit720005_388(__stackOp720005_385_0, __fieldRead720005_386(), __fieldRead720005_387());
    __call720005_396(spill720005_117, spill720005_118, __call720005_395(__call720005_393(__call720005_392(__call720005_390(__call720005_389(spill720005_119, 0x1.4p2f), 0x1.4p3f), __fieldRead720005_391()), "blockIron"), __fieldRead720005_394()));
    spill720005_120 = __invokedynamic720005_397(9022, (2227545923927364622L ^ life0_3));
    spill720005_121 = "double_stone_slab";
    moom.ek __stackOp720005_399_0 = __sourceUninitializedNEW720005_398();
    spill720005_122 = __stackOp720005_399_0;
    __explicitNewInit720005_400(__stackOp720005_399_0);
    __call720005_406(spill720005_120, spill720005_121, __call720005_405(__call720005_404(__call720005_402(__call720005_401(spill720005_122, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_403()), "stoneSlab"));
    spill720005_123 = __invokedynamic720005_407(1781, (7720124815114105325L ^ life0_3));
    spill720005_124 = "stone_slab";
    moom.el __stackOp720005_409_0 = __sourceUninitializedNEW720005_408();
    spill720005_125 = __stackOp720005_409_0;
    __explicitNewInit720005_410(__stackOp720005_409_0);
    __call720005_416(spill720005_123, spill720005_124, __call720005_415(__call720005_414(__call720005_412(__call720005_411(spill720005_125, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_413()), "stoneSlab"));
    net.minecraft.block.Block __stackOp720005_418_0 = __sourceUninitializedNEW720005_417();
    spill720005_126 = __stackOp720005_418_0;
    __explicitNewInit720005_421(__stackOp720005_418_0, __fieldRead720005_419(), __fieldRead720005_420());
    life8_754 = __call720005_428(__call720005_426(__call720005_425(__call720005_423(__call720005_422(spill720005_126, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_424()), "brick"), __fieldRead720005_427());
    __call720005_430(__invokedynamic720005_429(10689, (6255619185527676598L ^ life0_3)), "brick_block", life8_754);
    spill720005_127 = __invokedynamic720005_431(18191, (1162003700930490458L ^ life0_3));
    spill720005_128 = "tnt";
    moom.ez __stackOp720005_433_0 = __sourceUninitializedNEW720005_432();
    spill720005_129 = __stackOp720005_433_0;
    __explicitNewInit720005_434(__stackOp720005_433_0);
    __call720005_439(spill720005_127, spill720005_128, __call720005_438(__call720005_437(__call720005_435(spill720005_129, 0x0.0p0f), __fieldRead720005_436()), "tnt"));
    spill720005_130 = __invokedynamic720005_440(12031, (8943288852120066358L ^ life0_3));
    spill720005_131 = "bookshelf";
    moom.cn __stackOp720005_442_0 = __sourceUninitializedNEW720005_441();
    spill720005_132 = __stackOp720005_442_0;
    __explicitNewInit720005_443(__stackOp720005_442_0);
    __call720005_448(spill720005_130, spill720005_131, __call720005_447(__call720005_446(__call720005_444(spill720005_132, 0x1.8p0f), __fieldRead720005_445()), "bookshelf"));
    spill720005_133 = __invokedynamic720005_449(24336, (59170108349491319L ^ life0_3));
    spill720005_134 = "mossy_cobblestone";
    net.minecraft.block.Block __stackOp720005_451_0 = __sourceUninitializedNEW720005_450();
    spill720005_135 = __stackOp720005_451_0;
    __explicitNewInit720005_453(__stackOp720005_451_0, __fieldRead720005_452());
    __call720005_461(spill720005_133, spill720005_134, __call720005_460(__call720005_458(__call720005_457(__call720005_455(__call720005_454(spill720005_135, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_456()), "stoneMoss"), __fieldRead720005_459()));
    spill720005_136 = __invokedynamic720005_462(12197, (502607016140069032L ^ life0_3));
    spill720005_137 = "obsidian";
    net.minecraft.block.BlockObsidian __stackOp720005_464_0 = __sourceUninitializedNEW720005_463();
    spill720005_138 = __stackOp720005_464_0;
    __explicitNewInit720005_465(__stackOp720005_464_0);
    __call720005_471(spill720005_136, spill720005_137, __call720005_470(__call720005_469(__call720005_467(__call720005_466(spill720005_138, 0x1.9p5f), 0x1.f4p10f), __fieldRead720005_468()), "obsidian"));
    spill720005_139 = __invokedynamic720005_472(10010, (5217895977988247638L ^ life0_3));
    spill720005_140 = "torch";
    moom.eA __stackOp720005_474_0 = __sourceUninitializedNEW720005_473();
    spill720005_141 = __stackOp720005_474_0;
    __explicitNewInit720005_475(__stackOp720005_474_0);
    __call720005_481(spill720005_139, spill720005_140, __call720005_480(__call720005_479(__call720005_477(__call720005_476(spill720005_141, 0x0.0p0f), 0x1.ep-1f), __fieldRead720005_478()), "torch"));
    spill720005_142 = __invokedynamic720005_482(19997, (7224098682727545304L ^ life0_3));
    spill720005_143 = "fire";
    net.minecraft.block.BlockFire __stackOp720005_484_0 = __sourceUninitializedNEW720005_483();
    spill720005_144 = __stackOp720005_484_0;
    __explicitNewInit720005_485(__stackOp720005_484_0);
    __call720005_492(spill720005_142, spill720005_143, __call720005_491(__call720005_490(__call720005_489(__call720005_487(__call720005_486(spill720005_144, 0x0.0p0f), 0x1.0p0f), __fieldRead720005_488()), "fire")));
    spill720005_145 = __invokedynamic720005_493(3323, (8123004234599267102L ^ life0_3));
    spill720005_146 = "mob_spawner";
    moom.da __stackOp720005_495_0 = __sourceUninitializedNEW720005_494();
    spill720005_147 = __stackOp720005_495_0;
    __explicitNewInit720005_496(__stackOp720005_495_0);
    __call720005_502(spill720005_145, spill720005_146, __call720005_501(__call720005_500(__call720005_499(__call720005_497(spill720005_147, 0x1.4p2f), __fieldRead720005_498()), "mobSpawner")));
    spill720005_148 = __invokedynamic720005_503(21829, (1402419254043026069L ^ life0_3));
    spill720005_149 = "oak_stairs";
    moom.ew __stackOp720005_505_0 = __sourceUninitializedNEW720005_504();
    spill720005_150 = __stackOp720005_505_0;
    __explicitNewInit720005_510(__stackOp720005_505_0, __call720005_509(__call720005_506(life4_80), __fieldRead720005_507(), __fieldRead720005_508()));
    __call720005_512(spill720005_148, spill720005_149, __call720005_511(spill720005_150, "stairsWood"));
    spill720005_151 = __invokedynamic720005_513(31481, (5701985949773794780L ^ life0_3));
    spill720005_152 = "chest";
    moom.cZ __stackOp720005_515_0 = __sourceUninitializedNEW720005_514();
    spill720005_153 = __stackOp720005_515_0;
    __explicitNewInit720005_516(__stackOp720005_515_0, 0);
    __call720005_521(spill720005_151, spill720005_152, __call720005_520(__call720005_519(__call720005_517(spill720005_153, 0x1.4p1f), __fieldRead720005_518()), "chest"));
    spill720005_154 = __invokedynamic720005_522(9998, (16349666639171654L ^ life0_3));
    spill720005_155 = "redstone_wire";
    moom.d9 __stackOp720005_524_0 = __sourceUninitializedNEW720005_523();
    spill720005_156 = __stackOp720005_524_0;
    __explicitNewInit720005_525(__stackOp720005_524_0);
    __call720005_531(spill720005_154, spill720005_155, __call720005_530(__call720005_529(__call720005_528(__call720005_526(spill720005_156, 0x0.0p0f), __fieldRead720005_527()), "redstoneDust")));
    spill720005_157 = __invokedynamic720005_532(16944, (1742242440658269535L ^ life0_3));
    spill720005_158 = "diamond_ore";
    moom.dT __stackOp720005_534_0 = __sourceUninitializedNEW720005_533();
    spill720005_159 = __stackOp720005_534_0;
    __explicitNewInit720005_535(__stackOp720005_534_0);
    __call720005_541(spill720005_157, spill720005_158, __call720005_540(__call720005_539(__call720005_537(__call720005_536(spill720005_159, 0x1.8p1f), 0x1.4p2f), __fieldRead720005_538()), "oreDiamond"));
    spill720005_160 = __invokedynamic720005_542(27212, (2837992445642317130L ^ life0_3));
    spill720005_161 = "diamond_block";
    net.minecraft.block.Block __stackOp720005_544_0 = __sourceUninitializedNEW720005_543();
    spill720005_162 = __stackOp720005_544_0;
    __explicitNewInit720005_547(__stackOp720005_544_0, __fieldRead720005_545(), __fieldRead720005_546());
    __call720005_555(spill720005_160, spill720005_161, __call720005_554(__call720005_552(__call720005_551(__call720005_549(__call720005_548(spill720005_162, 0x1.4p2f), 0x1.4p3f), __fieldRead720005_550()), "blockDiamond"), __fieldRead720005_553()));
    spill720005_163 = __invokedynamic720005_556(26792, (153899155590225835L ^ life0_3));
    spill720005_164 = "crafting_table";
    moom.eI __stackOp720005_558_0 = __sourceUninitializedNEW720005_557();
    spill720005_165 = __stackOp720005_558_0;
    __explicitNewInit720005_559(__stackOp720005_558_0);
    __call720005_564(spill720005_163, spill720005_164, __call720005_563(__call720005_562(__call720005_560(spill720005_165, 0x1.4p1f), __fieldRead720005_561()), "workbench"));
    spill720005_166 = __invokedynamic720005_565(12329, (8999227947200333616L ^ life0_3));
    spill720005_167 = "wheat";
    moom.cv __stackOp720005_567_0 = __sourceUninitializedNEW720005_566();
    spill720005_168 = __stackOp720005_567_0;
    __explicitNewInit720005_568(__stackOp720005_567_0);
    __call720005_570(spill720005_166, spill720005_167, __call720005_569(spill720005_168, "crops"));
    moom.dy __stackOp720005_572_0 = __sourceUninitializedNEW720005_571();
    spill720005_169 = __stackOp720005_572_0;
    __explicitNewInit720005_573(__stackOp720005_572_0);
    life9_1016 = __call720005_577(__call720005_576(__call720005_574(spill720005_169, 0x1.333334p-1f), __fieldRead720005_575()), "farmland");
    __call720005_579(__invokedynamic720005_578(5118, (75055164408980639L ^ life0_3)), "farmland", life9_1016);
    spill720005_170 = __invokedynamic720005_580(9041, (3171889780840453220L ^ life0_3));
    spill720005_171 = "furnace";
    moom.c8 __stackOp720005_582_0 = __sourceUninitializedNEW720005_581();
    spill720005_172 = __stackOp720005_582_0;
    __explicitNewInit720005_583(__stackOp720005_582_0, false);
    __call720005_590(spill720005_170, spill720005_171, __call720005_589(__call720005_587(__call720005_586(__call720005_584(spill720005_172, 0x1.cp1f), __fieldRead720005_585()), "furnace"), __fieldRead720005_588()));
    spill720005_173 = __invokedynamic720005_591(25019, (2008144995225933527L ^ life0_3));
    spill720005_174 = "lit_furnace";
    moom.c8 __stackOp720005_593_0 = __sourceUninitializedNEW720005_592();
    spill720005_175 = __stackOp720005_593_0;
    __explicitNewInit720005_594(__stackOp720005_593_0, true);
    __call720005_600(spill720005_173, spill720005_174, __call720005_599(__call720005_598(__call720005_597(__call720005_595(spill720005_175, 0x1.cp1f), __fieldRead720005_596()), 0x1.cp-1f), "furnace"));
    spill720005_176 = __invokedynamic720005_601(13616, (4026841909636285180L ^ life0_3));
    spill720005_177 = "standing_sign";
    moom.de __stackOp720005_603_0 = __sourceUninitializedNEW720005_602();
    spill720005_178 = __stackOp720005_603_0;
    __explicitNewInit720005_604(__stackOp720005_603_0);
    __call720005_610(spill720005_176, spill720005_177, __call720005_609(__call720005_608(__call720005_607(__call720005_605(spill720005_178, 0x1.0p0f), __fieldRead720005_606()), "sign")));
    spill720005_179 = __invokedynamic720005_611(11996, (7746533855272753555L ^ life0_3));
    spill720005_180 = "wooden_door";
    net.minecraft.block.BlockDoor __stackOp720005_613_0 = __sourceUninitializedNEW720005_612();
    spill720005_181 = __stackOp720005_613_0;
    __explicitNewInit720005_615(__stackOp720005_613_0, __fieldRead720005_614());
    __call720005_621(spill720005_179, spill720005_180, __call720005_620(__call720005_619(__call720005_618(__call720005_616(spill720005_181, 0x1.8p1f), __fieldRead720005_617()), "doorOak")));
    spill720005_182 = __invokedynamic720005_622(19131, (7946866971896429915L ^ life0_3));
    spill720005_183 = "ladder";
    moom.dF __stackOp720005_624_0 = __sourceUninitializedNEW720005_623();
    spill720005_184 = __stackOp720005_624_0;
    __explicitNewInit720005_625(__stackOp720005_624_0);
    __call720005_630(spill720005_182, spill720005_183, __call720005_629(__call720005_628(__call720005_626(spill720005_184, 0x1.99999ap-2f), __fieldRead720005_627()), "ladder"));
    spill720005_185 = __invokedynamic720005_631(5178, (8248448628022993872L ^ life0_3));
    spill720005_186 = "rail";
    moom.d3 __stackOp720005_633_0 = __sourceUninitializedNEW720005_632();
    spill720005_187 = __stackOp720005_633_0;
    __explicitNewInit720005_634(__stackOp720005_633_0);
    __call720005_639(spill720005_185, spill720005_186, __call720005_638(__call720005_637(__call720005_635(spill720005_187, 0x1.666666p-1f), __fieldRead720005_636()), "rail"));
    spill720005_188 = __invokedynamic720005_640(29027, (6289946799443478023L ^ life0_3));
    spill720005_189 = "stone_stairs";
    moom.ew __stackOp720005_642_0 = __sourceUninitializedNEW720005_641();
    spill720005_190 = __stackOp720005_642_0;
    __explicitNewInit720005_644(__stackOp720005_642_0, __call720005_643(life3_64));
    __call720005_646(spill720005_188, spill720005_189, __call720005_645(spill720005_190, "stairsStone"));
    spill720005_191 = __invokedynamic720005_647(18469, (8497170932761411354L ^ life0_3));
    spill720005_192 = "wall_sign";
    moom.df __stackOp720005_649_0 = __sourceUninitializedNEW720005_648();
    spill720005_193 = __stackOp720005_649_0;
    __explicitNewInit720005_650(__stackOp720005_649_0);
    __call720005_656(spill720005_191, spill720005_192, __call720005_655(__call720005_654(__call720005_653(__call720005_651(spill720005_193, 0x1.0p0f), __fieldRead720005_652()), "sign")));
    spill720005_194 = __invokedynamic720005_657(10340, (5386452260404453146L ^ life0_3));
    spill720005_195 = "lever";
    moom.dK __stackOp720005_659_0 = __sourceUninitializedNEW720005_658();
    spill720005_196 = __stackOp720005_659_0;
    __explicitNewInit720005_660(__stackOp720005_659_0);
    __call720005_665(spill720005_194, spill720005_195, __call720005_664(__call720005_663(__call720005_661(spill720005_196, 0x1.0p-1f), __fieldRead720005_662()), "lever"));
    spill720005_197 = __invokedynamic720005_666(26227, (7669744027514769726L ^ life0_3));
    spill720005_198 = "stone_pressure_plate";
    moom.cl __stackOp720005_668_0 = __sourceUninitializedNEW720005_667();
    spill720005_199 = __stackOp720005_668_0;
    __explicitNewInit720005_671(__stackOp720005_668_0, __fieldRead720005_669(), __fieldRead720005_670());
    __call720005_676(spill720005_197, spill720005_198, __call720005_675(__call720005_674(__call720005_672(spill720005_199, 0x1.0p-1f), __fieldRead720005_673()), "pressurePlateStone"));
    spill720005_200 = __invokedynamic720005_677(10155, (898972023733637279L ^ life0_3));
    spill720005_201 = "iron_door";
    net.minecraft.block.BlockDoor __stackOp720005_679_0 = __sourceUninitializedNEW720005_678();
    spill720005_202 = __stackOp720005_679_0;
    __explicitNewInit720005_681(__stackOp720005_679_0, __fieldRead720005_680());
    __call720005_687(spill720005_200, spill720005_201, __call720005_686(__call720005_685(__call720005_684(__call720005_682(spill720005_202, 0x1.4p2f), __fieldRead720005_683()), "doorIron")));
    spill720005_203 = __invokedynamic720005_688(10608, (1252663778141658667L ^ life0_3));
    spill720005_204 = "wooden_pressure_plate";
    moom.cl __stackOp720005_690_0 = __sourceUninitializedNEW720005_689();
    spill720005_205 = __stackOp720005_690_0;
    __explicitNewInit720005_693(__stackOp720005_690_0, __fieldRead720005_691(), __fieldRead720005_692());
    __call720005_698(spill720005_203, spill720005_204, __call720005_697(__call720005_696(__call720005_694(spill720005_205, 0x1.0p-1f), __fieldRead720005_695()), "pressurePlateWood"));
    spill720005_206 = __invokedynamic720005_699(26914, (3778970016702144123L ^ life0_3));
    spill720005_207 = "redstone_ore";
    moom.d8 __stackOp720005_701_0 = __sourceUninitializedNEW720005_700();
    spill720005_208 = __stackOp720005_701_0;
    __explicitNewInit720005_702(__stackOp720005_701_0, false);
    __call720005_710(spill720005_206, spill720005_207, __call720005_709(__call720005_707(__call720005_706(__call720005_704(__call720005_703(spill720005_208, 0x1.8p1f), 0x1.4p2f), __fieldRead720005_705()), "oreRedstone"), __fieldRead720005_708()));
    spill720005_209 = __invokedynamic720005_711(16598, (2652349286829635546L ^ life0_3));
    spill720005_210 = "lit_redstone_ore";
    moom.d8 __stackOp720005_713_0 = __sourceUninitializedNEW720005_712();
    spill720005_211 = __stackOp720005_713_0;
    __explicitNewInit720005_714(__stackOp720005_713_0, true);
    __call720005_721(spill720005_209, spill720005_210, __call720005_720(__call720005_719(__call720005_717(__call720005_716(__call720005_715(spill720005_211, 0x1.4p-1f), 0x1.8p1f), 0x1.4p2f), __fieldRead720005_718()), "oreRedstone"));
    spill720005_212 = __invokedynamic720005_722(19638, (1462838398280383423L ^ life0_3));
    spill720005_213 = "unlit_redstone_torch";
    moom.eB __stackOp720005_724_0 = __sourceUninitializedNEW720005_723();
    spill720005_214 = __stackOp720005_724_0;
    __explicitNewInit720005_725(__stackOp720005_724_0, false);
    __call720005_730(spill720005_212, spill720005_213, __call720005_729(__call720005_728(__call720005_726(spill720005_214, 0x0.0p0f), __fieldRead720005_727()), "notGate"));
    spill720005_215 = __invokedynamic720005_731(3234, (6425546305548909391L ^ life0_3));
    spill720005_216 = "redstone_torch";
    moom.eB __stackOp720005_733_0 = __sourceUninitializedNEW720005_732();
    spill720005_217 = __stackOp720005_733_0;
    __explicitNewInit720005_734(__stackOp720005_733_0, true);
    __call720005_742(spill720005_215, spill720005_216, __call720005_741(__call720005_739(__call720005_738(__call720005_736(__call720005_735(spill720005_217, 0x0.0p0f), 0x1.0p-1f), __fieldRead720005_737()), "notGate"), __fieldRead720005_740()));
    spill720005_218 = __invokedynamic720005_743(21555, (9182135896102904673L ^ life0_3));
    spill720005_219 = "stone_button";
    moom.cK __stackOp720005_745_0 = __sourceUninitializedNEW720005_744();
    spill720005_220 = __stackOp720005_745_0;
    __explicitNewInit720005_746(__stackOp720005_745_0);
    __call720005_751(spill720005_218, spill720005_219, __call720005_750(__call720005_749(__call720005_747(spill720005_220, 0x1.0p-1f), __fieldRead720005_748()), "button"));
    spill720005_221 = __invokedynamic720005_752(14920, (4030006293296631080L ^ life0_3));
    spill720005_222 = "snow_layer";
    moom.es __stackOp720005_754_0 = __sourceUninitializedNEW720005_753();
    spill720005_223 = __stackOp720005_754_0;
    __explicitNewInit720005_755(__stackOp720005_754_0);
    __call720005_761(spill720005_221, spill720005_222, __call720005_760(__call720005_759(__call720005_758(__call720005_756(spill720005_223, 0x1.99999ap-4f), __fieldRead720005_757()), "snow"), 0));
    spill720005_224 = __invokedynamic720005_762(5369, (6543794186721190659L ^ life0_3));
    spill720005_225 = "ice";
    moom.cq __stackOp720005_764_0 = __sourceUninitializedNEW720005_763();
    spill720005_226 = __stackOp720005_764_0;
    __explicitNewInit720005_765(__stackOp720005_764_0);
    __call720005_771(spill720005_224, spill720005_225, __call720005_770(__call720005_769(__call720005_767(__call720005_766(spill720005_226, 0x1.0p-1f), 3), __fieldRead720005_768()), "ice"));
    spill720005_227 = __invokedynamic720005_772(28655, (5098954168668756165L ^ life0_3));
    spill720005_228 = "snow";
    moom.et __stackOp720005_774_0 = __sourceUninitializedNEW720005_773();
    spill720005_229 = __stackOp720005_774_0;
    __explicitNewInit720005_775(__stackOp720005_774_0);
    __call720005_780(spill720005_227, spill720005_228, __call720005_779(__call720005_778(__call720005_776(spill720005_229, 0x1.99999ap-3f), __fieldRead720005_777()), "snow"));
    spill720005_230 = __invokedynamic720005_781(19786, (7607621486568159893L ^ life0_3));
    spill720005_231 = "cactus";
    moom.cM __stackOp720005_783_0 = __sourceUninitializedNEW720005_782();
    spill720005_232 = __stackOp720005_783_0;
    __explicitNewInit720005_784(__stackOp720005_783_0);
    __call720005_789(spill720005_230, spill720005_231, __call720005_788(__call720005_787(__call720005_785(spill720005_232, 0x1.99999ap-2f), __fieldRead720005_786()), "cactus"));
    spill720005_233 = __invokedynamic720005_790(29723, (2851002078964614121L ^ life0_3));
    spill720005_234 = "clay";
    moom.cQ __stackOp720005_792_0 = __sourceUninitializedNEW720005_791();
    spill720005_235 = __stackOp720005_792_0;
    __explicitNewInit720005_793(__stackOp720005_792_0);
    __call720005_798(spill720005_233, spill720005_234, __call720005_797(__call720005_796(__call720005_794(spill720005_235, 0x1.333334p-1f), __fieldRead720005_795()), "clay"));
    spill720005_236 = __invokedynamic720005_799(21388, (1215132586570097825L ^ life0_3));
    spill720005_237 = "reeds";
    moom.d_ __stackOp720005_801_0 = __sourceUninitializedNEW720005_800();
    spill720005_238 = __stackOp720005_801_0;
    __explicitNewInit720005_802(__stackOp720005_801_0);
    __call720005_808(spill720005_236, spill720005_237, __call720005_807(__call720005_806(__call720005_805(__call720005_803(spill720005_238, 0x0.0p0f), __fieldRead720005_804()), "reeds")));
    spill720005_239 = __invokedynamic720005_809(27758, (4571572315068504874L ^ life0_3));
    spill720005_240 = "jukebox";
    moom.c_ __stackOp720005_811_0 = __sourceUninitializedNEW720005_810();
    spill720005_241 = __stackOp720005_811_0;
    __explicitNewInit720005_812(__stackOp720005_811_0);
    __call720005_818(spill720005_239, spill720005_240, __call720005_817(__call720005_816(__call720005_814(__call720005_813(spill720005_241, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_815()), "jukebox"));
    spill720005_242 = __invokedynamic720005_819(7295, (7450726768706874328L ^ life0_3));
    spill720005_243 = "fence";
    moom.dz __stackOp720005_821_0 = __sourceUninitializedNEW720005_820();
    spill720005_244 = __stackOp720005_821_0;
    __explicitNewInit720005_825(__stackOp720005_821_0, __fieldRead720005_822(), __call720005_824(__fieldRead720005_823()));
    __call720005_831(spill720005_242, spill720005_243, __call720005_830(__call720005_829(__call720005_827(__call720005_826(spill720005_244, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_828()), "fence"));
    moom.dl __stackOp720005_833_0 = __sourceUninitializedNEW720005_832();
    spill720005_245 = __stackOp720005_833_0;
    __explicitNewInit720005_834(__stackOp720005_833_0);
    life10_1476 = __call720005_838(__call720005_837(__call720005_835(spill720005_245, 0x1.0p0f), __fieldRead720005_836()), "pumpkin");
    __call720005_840(__invokedynamic720005_839(18635, (400985996853198730L ^ life0_3)), "pumpkin", life10_1476);
    spill720005_246 = __invokedynamic720005_841(17422, (5274965821554602806L ^ life0_3));
    spill720005_247 = "netherrack";
    moom.dR __stackOp720005_843_0 = __sourceUninitializedNEW720005_842();
    spill720005_248 = __stackOp720005_843_0;
    __explicitNewInit720005_844(__stackOp720005_843_0);
    __call720005_849(spill720005_246, spill720005_247, __call720005_848(__call720005_847(__call720005_845(spill720005_248, 0x1.99999ap-2f), __fieldRead720005_846()), "hellrock"));
    spill720005_249 = __invokedynamic720005_850(36, (1264954146976069609L ^ life0_3));
    spill720005_250 = "soul_sand";
    moom.eu __stackOp720005_852_0 = __sourceUninitializedNEW720005_851();
    spill720005_251 = __stackOp720005_852_0;
    __explicitNewInit720005_853(__stackOp720005_852_0);
    __call720005_858(spill720005_249, spill720005_250, __call720005_857(__call720005_856(__call720005_854(spill720005_251, 0x1.0p-1f), __fieldRead720005_855()), "hellsand"));
    spill720005_252 = __invokedynamic720005_859(5888, (5828846271239315568L ^ life0_3));
    spill720005_253 = "glowstone";
    net.minecraft.block.BlockGlowstone __stackOp720005_861_0 = __sourceUninitializedNEW720005_860();
    spill720005_254 = __stackOp720005_861_0;
    __explicitNewInit720005_863(__stackOp720005_861_0, __fieldRead720005_862());
    __call720005_869(spill720005_252, spill720005_253, __call720005_868(__call720005_867(__call720005_866(__call720005_864(spill720005_254, 0x1.333334p-2f), __fieldRead720005_865()), 0x1.0p0f), "lightgem"));
    spill720005_255 = __invokedynamic720005_870(10845, (6081027866172579178L ^ life0_3));
    spill720005_256 = "portal";
    moom.cr __stackOp720005_872_0 = __sourceUninitializedNEW720005_871();
    spill720005_257 = __stackOp720005_872_0;
    __explicitNewInit720005_873(__stackOp720005_872_0);
    __call720005_879(spill720005_255, spill720005_256, __call720005_878(__call720005_877(__call720005_876(__call720005_874(spill720005_257, -0x1.0p0f), __fieldRead720005_875()), 0x1.8p-1f), "portal"));
    spill720005_258 = __invokedynamic720005_880(24764, (2034635563275687906L ^ life0_3));
    spill720005_259 = "lit_pumpkin";
    moom.dl __stackOp720005_882_0 = __sourceUninitializedNEW720005_881();
    spill720005_260 = __stackOp720005_882_0;
    __explicitNewInit720005_883(__stackOp720005_882_0);
    __call720005_889(spill720005_258, spill720005_259, __call720005_888(__call720005_887(__call720005_886(__call720005_884(spill720005_260, 0x1.0p0f), __fieldRead720005_885()), 0x1.0p0f), "litpumpkin"));
    spill720005_261 = __invokedynamic720005_890(11688, (6942924477327465146L ^ life0_3));
    spill720005_262 = "cake";
    moom.cN __stackOp720005_892_0 = __sourceUninitializedNEW720005_891();
    spill720005_263 = __stackOp720005_892_0;
    __explicitNewInit720005_893(__stackOp720005_892_0);
    __call720005_899(spill720005_261, spill720005_262, __call720005_898(__call720005_897(__call720005_896(__call720005_894(spill720005_263, 0x1.0p-1f), __fieldRead720005_895()), "cake")));
    spill720005_264 = __invokedynamic720005_900(30955, (7256741553174745047L ^ life0_3));
    spill720005_265 = "unpowered_repeater";
    net.minecraft.block.BlockRedstoneRepeater __stackOp720005_902_0 = __sourceUninitializedNEW720005_901();
    spill720005_266 = __stackOp720005_902_0;
    __explicitNewInit720005_903(__stackOp720005_902_0, false);
    __call720005_909(spill720005_264, spill720005_265, __call720005_908(__call720005_907(__call720005_906(__call720005_904(spill720005_266, 0x0.0p0f), __fieldRead720005_905()), "diode")));
    spill720005_267 = __invokedynamic720005_910(19107, (8960492931995745626L ^ life0_3));
    spill720005_268 = "powered_repeater";
    net.minecraft.block.BlockRedstoneRepeater __stackOp720005_912_0 = __sourceUninitializedNEW720005_911();
    spill720005_269 = __stackOp720005_912_0;
    __explicitNewInit720005_913(__stackOp720005_912_0, true);
    __call720005_919(spill720005_267, spill720005_268, __call720005_918(__call720005_917(__call720005_916(__call720005_914(spill720005_269, 0x0.0p0f), __fieldRead720005_915()), "diode")));
    spill720005_270 = __invokedynamic720005_920(26615, (7356925455938785419L ^ life0_3));
    spill720005_271 = "stained_glass";
    moom.ct __stackOp720005_922_0 = __sourceUninitializedNEW720005_921();
    spill720005_272 = __stackOp720005_922_0;
    __explicitNewInit720005_924(__stackOp720005_922_0, __fieldRead720005_923());
    __call720005_929(spill720005_270, spill720005_271, __call720005_928(__call720005_927(__call720005_925(spill720005_272, 0x1.333334p-2f), __fieldRead720005_926()), "stainedGlass"));
    spill720005_273 = __invokedynamic720005_930(2889, (5138454078886247663L ^ life0_3));
    spill720005_274 = "trapdoor";
    moom.eC __stackOp720005_932_0 = __sourceUninitializedNEW720005_931();
    spill720005_275 = __stackOp720005_932_0;
    __explicitNewInit720005_934(__stackOp720005_932_0, __fieldRead720005_933());
    __call720005_940(spill720005_273, spill720005_274, __call720005_939(__call720005_938(__call720005_937(__call720005_935(spill720005_275, 0x1.8p1f), __fieldRead720005_936()), "trapdoor")));
    spill720005_276 = __invokedynamic720005_941(15154, (6934738532073983071L ^ life0_3));
    spill720005_277 = "monster_egg";
    moom.eh __stackOp720005_943_0 = __sourceUninitializedNEW720005_942();
    spill720005_278 = __stackOp720005_943_0;
    __explicitNewInit720005_944(__stackOp720005_943_0);
    __call720005_947(spill720005_276, spill720005_277, __call720005_946(__call720005_945(spill720005_278, 0x1.8p-1f), "monsterStoneEgg"));
    moom.ey __stackOp720005_949_0 = __sourceUninitializedNEW720005_948();
    spill720005_279 = __stackOp720005_949_0;
    __explicitNewInit720005_950(__stackOp720005_949_0);
    life11_1685 = __call720005_955(__call720005_954(__call720005_952(__call720005_951(spill720005_279, 0x1.8p0f), 0x1.4p3f), __fieldRead720005_953()), "stonebricksmooth");
    __call720005_957(__invokedynamic720005_956(13032, (9014567614059267366L ^ life0_3)), "stonebrick", life11_1685);
    spill720005_280 = __invokedynamic720005_958(4465, (7026555103199618565L ^ life0_3));
    spill720005_281 = "brown_mushroom_block";
    moom.dE __stackOp720005_960_0 = __sourceUninitializedNEW720005_959();
    spill720005_282 = __stackOp720005_960_0;
    __explicitNewInit720005_963(__stackOp720005_960_0, __fieldRead720005_961(), __fieldRead720005_962(), life6_632);
    __call720005_968(spill720005_280, spill720005_281, __call720005_967(__call720005_966(__call720005_964(spill720005_282, 0x1.99999ap-3f), __fieldRead720005_965()), "mushroom"));
    spill720005_283 = __invokedynamic720005_969(21881, (6193203273198641816L ^ life0_3));
    spill720005_284 = "red_mushroom_block";
    moom.dE __stackOp720005_971_0 = __sourceUninitializedNEW720005_970();
    spill720005_285 = __stackOp720005_971_0;
    __explicitNewInit720005_974(__stackOp720005_971_0, __fieldRead720005_972(), __fieldRead720005_973(), life7_650);
    __call720005_979(spill720005_283, spill720005_284, __call720005_978(__call720005_977(__call720005_975(spill720005_285, 0x1.99999ap-3f), __fieldRead720005_976()), "mushroom"));
    spill720005_286 = __invokedynamic720005_980(22572, (7103915180934344504L ^ life0_3));
    spill720005_287 = "iron_bars";
    moom.dV __stackOp720005_982_0 = __sourceUninitializedNEW720005_981();
    spill720005_288 = __stackOp720005_982_0;
    __explicitNewInit720005_984(__stackOp720005_982_0, __fieldRead720005_983(), true);
    __call720005_990(spill720005_286, spill720005_287, __call720005_989(__call720005_988(__call720005_986(__call720005_985(spill720005_288, 0x1.4p2f), 0x1.4p3f), __fieldRead720005_987()), "fenceIron"));
    spill720005_289 = __invokedynamic720005_991(20664, (4073177923387795264L ^ life0_3));
    spill720005_290 = "glass_pane";
    moom.dV __stackOp720005_993_0 = __sourceUninitializedNEW720005_992();
    spill720005_291 = __stackOp720005_993_0;
    __explicitNewInit720005_995(__stackOp720005_993_0, __fieldRead720005_994(), false);
    __call720005_1000(spill720005_289, spill720005_290, __call720005_999(__call720005_998(__call720005_996(spill720005_291, 0x1.333334p-2f), __fieldRead720005_997()), "thinGlass"));
    moom.dO __stackOp720005_1002_0 = __sourceUninitializedNEW720005_1001();
    spill720005_292 = __stackOp720005_1002_0;
    __explicitNewInit720005_1003(__stackOp720005_1002_0);
    life12_1779 = __call720005_1007(__call720005_1006(__call720005_1004(spill720005_292, 0x1.0p0f), __fieldRead720005_1005()), "melon");
    __call720005_1009(__invokedynamic720005_1008(1729, (3000948700957897185L ^ life0_3)), "melon_block", life12_1779);
    spill720005_293 = __invokedynamic720005_1010(32350, (2920912607866521970L ^ life0_3));
    spill720005_294 = "pumpkin_stem";
    moom.cH __stackOp720005_1012_0 = __sourceUninitializedNEW720005_1011();
    spill720005_295 = __stackOp720005_1012_0;
    __explicitNewInit720005_1013(__stackOp720005_1012_0, life10_1476);
    __call720005_1018(spill720005_293, spill720005_294, __call720005_1017(__call720005_1016(__call720005_1014(spill720005_295, 0x0.0p0f), __fieldRead720005_1015()), "pumpkinStem"));
    spill720005_296 = __invokedynamic720005_1019(11133, (7204364228333526140L ^ life0_3));
    spill720005_297 = "melon_stem";
    moom.cH __stackOp720005_1021_0 = __sourceUninitializedNEW720005_1020();
    spill720005_298 = __stackOp720005_1021_0;
    __explicitNewInit720005_1022(__stackOp720005_1021_0, life12_1779);
    __call720005_1027(spill720005_296, spill720005_297, __call720005_1026(__call720005_1025(__call720005_1023(spill720005_298, 0x0.0p0f), __fieldRead720005_1024()), "pumpkinStem"));
    spill720005_299 = __invokedynamic720005_1028(12059, (8574148560532822116L ^ life0_3));
    spill720005_300 = "vine";
    moom.eF __stackOp720005_1030_0 = __sourceUninitializedNEW720005_1029();
    spill720005_301 = __stackOp720005_1030_0;
    __explicitNewInit720005_1031(__stackOp720005_1030_0);
    __call720005_1036(spill720005_299, spill720005_300, __call720005_1035(__call720005_1034(__call720005_1032(spill720005_301, 0x1.99999ap-3f), __fieldRead720005_1033()), "vine"));
    spill720005_302 = __invokedynamic720005_1037(5986, (1436125349347156108L ^ life0_3));
    spill720005_303 = "fence_gate";
    moom.dk __stackOp720005_1039_0 = __sourceUninitializedNEW720005_1038();
    spill720005_304 = __stackOp720005_1039_0;
    __explicitNewInit720005_1041(__stackOp720005_1039_0, __fieldRead720005_1040());
    __call720005_1047(spill720005_302, spill720005_303, __call720005_1046(__call720005_1045(__call720005_1043(__call720005_1042(spill720005_304, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1044()), "fenceGate"));
    spill720005_305 = __invokedynamic720005_1048(909, (5469837267656733950L ^ life0_3));
    spill720005_306 = "brick_stairs";
    moom.ew __stackOp720005_1050_0 = __sourceUninitializedNEW720005_1049();
    spill720005_307 = __stackOp720005_1050_0;
    __explicitNewInit720005_1052(__stackOp720005_1050_0, __call720005_1051(life8_754));
    __call720005_1054(spill720005_305, spill720005_306, __call720005_1053(spill720005_307, "stairsBrick"));
    spill720005_308 = __invokedynamic720005_1055(23533, (4531705038529604632L ^ life0_3));
    spill720005_309 = "stone_brick_stairs";
    moom.ew __stackOp720005_1057_0 = __sourceUninitializedNEW720005_1056();
    spill720005_310 = __stackOp720005_1057_0;
    __explicitNewInit720005_1062(__stackOp720005_1057_0, __call720005_1061(__call720005_1058(life11_1685), __fieldRead720005_1059(), __fieldRead720005_1060()));
    __call720005_1064(spill720005_308, spill720005_309, __call720005_1063(spill720005_310, "stairsStoneBrickSmooth"));
    spill720005_311 = __invokedynamic720005_1065(27142, (6131510188402777448L ^ life0_3));
    spill720005_312 = "mycelium";
    moom.dP __stackOp720005_1067_0 = __sourceUninitializedNEW720005_1066();
    spill720005_313 = __stackOp720005_1067_0;
    __explicitNewInit720005_1068(__stackOp720005_1067_0);
    __call720005_1073(spill720005_311, spill720005_312, __call720005_1072(__call720005_1071(__call720005_1069(spill720005_313, 0x1.333334p-1f), __fieldRead720005_1070()), "mycel"));
    spill720005_314 = __invokedynamic720005_1074(8174, (1232098469046183983L ^ life0_3));
    spill720005_315 = "waterlily";
    moom.cD __stackOp720005_1076_0 = __sourceUninitializedNEW720005_1075();
    spill720005_316 = __stackOp720005_1076_0;
    __explicitNewInit720005_1077(__stackOp720005_1076_0);
    __call720005_1082(spill720005_314, spill720005_315, __call720005_1081(__call720005_1080(__call720005_1078(spill720005_316, 0x0.0p0f), __fieldRead720005_1079()), "waterlily"));
    moom.dQ __stackOp720005_1084_0 = __sourceUninitializedNEW720005_1083();
    spill720005_317 = __stackOp720005_1084_0;
    __explicitNewInit720005_1085(__stackOp720005_1084_0);
    life13_1933 = __call720005_1092(__call720005_1090(__call720005_1089(__call720005_1087(__call720005_1086(spill720005_317, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_1088()), "netherBrick"), __fieldRead720005_1091());
    __call720005_1094(__invokedynamic720005_1093(5431, (2608232228989559491L ^ life0_3)), "nether_brick", life13_1933);
    spill720005_318 = __invokedynamic720005_1095(14472, (8848693309257699164L ^ life0_3));
    spill720005_319 = "nether_brick_fence";
    moom.dz __stackOp720005_1097_0 = __sourceUninitializedNEW720005_1096();
    spill720005_320 = __stackOp720005_1097_0;
    __explicitNewInit720005_1100(__stackOp720005_1097_0, __fieldRead720005_1098(), __fieldRead720005_1099());
    __call720005_1106(spill720005_318, spill720005_319, __call720005_1105(__call720005_1104(__call720005_1102(__call720005_1101(spill720005_320, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_1103()), "netherFence"));
    spill720005_321 = __invokedynamic720005_1107(16453, (4348942763517491038L ^ life0_3));
    spill720005_322 = "nether_brick_stairs";
    moom.ew __stackOp720005_1109_0 = __sourceUninitializedNEW720005_1108();
    spill720005_323 = __stackOp720005_1109_0;
    __explicitNewInit720005_1111(__stackOp720005_1109_0, __call720005_1110(life13_1933));
    __call720005_1113(spill720005_321, spill720005_322, __call720005_1112(spill720005_323, "stairsNetherBrick"));
    spill720005_324 = __invokedynamic720005_1114(28437, (5649768708177893574L ^ life0_3));
    spill720005_325 = "nether_wart";
    moom.cF __stackOp720005_1116_0 = __sourceUninitializedNEW720005_1115();
    spill720005_326 = __stackOp720005_1116_0;
    __explicitNewInit720005_1117(__stackOp720005_1116_0);
    __call720005_1119(spill720005_324, spill720005_325, __call720005_1118(spill720005_326, "netherStalk"));
    spill720005_327 = __invokedynamic720005_1120(5852, (4710880891893899706L ^ life0_3));
    spill720005_328 = "enchanting_table";
    moom.c4 __stackOp720005_1122_0 = __sourceUninitializedNEW720005_1121();
    spill720005_329 = __stackOp720005_1122_0;
    __explicitNewInit720005_1123(__stackOp720005_1122_0);
    __call720005_1127(spill720005_327, spill720005_328, __call720005_1126(__call720005_1125(__call720005_1124(spill720005_329, 0x1.4p2f), 0x1.f4p10f), "enchantmentTable"));
    spill720005_330 = __invokedynamic720005_1128(13598, (4618350714715456054L ^ life0_3));
    spill720005_331 = "brewing_stand";
    net.minecraft.block.BlockBrewingStand __stackOp720005_1130_0 = __sourceUninitializedNEW720005_1129();
    spill720005_332 = __stackOp720005_1130_0;
    __explicitNewInit720005_1131(__stackOp720005_1130_0);
    __call720005_1135(spill720005_330, spill720005_331, __call720005_1134(__call720005_1133(__call720005_1132(spill720005_332, 0x1.0p-1f), 0x1.0p-3f), "brewingStand"));
    spill720005_333 = __invokedynamic720005_1136(23939, (5820124911546215161L ^ life0_3));
    spill720005_334 = "cauldron";
    moom.cP __stackOp720005_1138_0 = __sourceUninitializedNEW720005_1137();
    spill720005_335 = __stackOp720005_1138_0;
    __explicitNewInit720005_1139(__stackOp720005_1138_0);
    __call720005_1142(spill720005_333, spill720005_334, __call720005_1141(__call720005_1140(spill720005_335, 0x1.0p1f), "cauldron"));
    spill720005_336 = __invokedynamic720005_1143(31991, (8722102762630351797L ^ life0_3));
    spill720005_337 = "end_portal";
    moom.c5 __stackOp720005_1145_0 = __sourceUninitializedNEW720005_1144();
    spill720005_338 = __stackOp720005_1145_0;
    __explicitNewInit720005_1147(__stackOp720005_1145_0, __fieldRead720005_1146());
    __call720005_1150(spill720005_336, spill720005_337, __call720005_1149(__call720005_1148(spill720005_338, -0x1.0p0f), 0x1.6e36p22f));
    spill720005_339 = __invokedynamic720005_1151(1950, (8758112079342137458L ^ life0_3));
    spill720005_340 = "end_portal_frame";
    moom.dt __stackOp720005_1153_0 = __sourceUninitializedNEW720005_1152();
    spill720005_341 = __stackOp720005_1153_0;
    __explicitNewInit720005_1154(__stackOp720005_1153_0);
    __call720005_1163(spill720005_339, spill720005_340, __call720005_1162(__call720005_1160(__call720005_1159(__call720005_1158(__call720005_1157(__call720005_1156(spill720005_341, __fieldRead720005_1155()), 0x1.0p-3f), -0x1.0p0f), "endPortalFrame"), 0x1.6e36p22f), __fieldRead720005_1161()));
    spill720005_342 = __invokedynamic720005_1164(29676, (775787634373067989L ^ life0_3));
    spill720005_343 = "end_stone";
    net.minecraft.block.Block __stackOp720005_1166_0 = __sourceUninitializedNEW720005_1165();
    spill720005_344 = __stackOp720005_1166_0;
    __explicitNewInit720005_1169(__stackOp720005_1166_0, __fieldRead720005_1167(), __fieldRead720005_1168());
    __call720005_1177(spill720005_342, spill720005_343, __call720005_1176(__call720005_1174(__call720005_1173(__call720005_1171(__call720005_1170(spill720005_344, 0x1.8p1f), 0x1.ep3f), __fieldRead720005_1172()), "whiteStone"), __fieldRead720005_1175()));
    spill720005_345 = __invokedynamic720005_1178(30862, (6579005594455871442L ^ life0_3));
    spill720005_346 = "dragon_egg";
    moom.ds __stackOp720005_1180_0 = __sourceUninitializedNEW720005_1179();
    spill720005_347 = __stackOp720005_1180_0;
    __explicitNewInit720005_1181(__stackOp720005_1180_0);
    __call720005_1188(spill720005_345, spill720005_346, __call720005_1187(__call720005_1186(__call720005_1185(__call720005_1183(__call720005_1182(spill720005_347, 0x1.8p1f), 0x1.ep3f), __fieldRead720005_1184()), 0x1.0p-3f), "dragonEgg"));
    spill720005_348 = __invokedynamic720005_1189(6318, (1266654542921494366L ^ life0_3));
    spill720005_349 = "redstone_lamp";
    moom.d7 __stackOp720005_1191_0 = __sourceUninitializedNEW720005_1190();
    spill720005_350 = __stackOp720005_1191_0;
    __explicitNewInit720005_1192(__stackOp720005_1191_0, false);
    __call720005_1199(spill720005_348, spill720005_349, __call720005_1198(__call720005_1196(__call720005_1195(__call720005_1193(spill720005_350, 0x1.333334p-2f), __fieldRead720005_1194()), "redstoneLight"), __fieldRead720005_1197()));
    spill720005_351 = __invokedynamic720005_1200(3692, (98472652379388295L ^ life0_3));
    spill720005_352 = "lit_redstone_lamp";
    moom.d7 __stackOp720005_1202_0 = __sourceUninitializedNEW720005_1201();
    spill720005_353 = __stackOp720005_1202_0;
    __explicitNewInit720005_1203(__stackOp720005_1202_0, true);
    __call720005_1208(spill720005_351, spill720005_352, __call720005_1207(__call720005_1206(__call720005_1204(spill720005_353, 0x1.333334p-2f), __fieldRead720005_1205()), "redstoneLight"));
    spill720005_354 = __invokedynamic720005_1209(14410, (16786341939793774L ^ life0_3));
    spill720005_355 = "double_wooden_slab";
    moom.eq __stackOp720005_1211_0 = __sourceUninitializedNEW720005_1210();
    spill720005_356 = __stackOp720005_1211_0;
    __explicitNewInit720005_1212(__stackOp720005_1211_0);
    __call720005_1218(spill720005_354, spill720005_355, __call720005_1217(__call720005_1216(__call720005_1214(__call720005_1213(spill720005_356, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1215()), "woodSlab"));
    spill720005_357 = __invokedynamic720005_1219(16069, (39841992668858657L ^ life0_3));
    spill720005_358 = "wooden_slab";
    moom.er __stackOp720005_1221_0 = __sourceUninitializedNEW720005_1220();
    spill720005_359 = __stackOp720005_1221_0;
    __explicitNewInit720005_1222(__stackOp720005_1221_0);
    __call720005_1228(spill720005_357, spill720005_358, __call720005_1227(__call720005_1226(__call720005_1224(__call720005_1223(spill720005_359, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1225()), "woodSlab"));
    spill720005_360 = __invokedynamic720005_1229(4681, (1670433821890471402L ^ life0_3));
    spill720005_361 = "cocoa";
    moom.dj __stackOp720005_1231_0 = __sourceUninitializedNEW720005_1230();
    spill720005_362 = __stackOp720005_1231_0;
    __explicitNewInit720005_1232(__stackOp720005_1231_0);
    __call720005_1238(spill720005_360, spill720005_361, __call720005_1237(__call720005_1236(__call720005_1234(__call720005_1233(spill720005_362, 0x1.99999ap-3f), 0x1.4p2f), __fieldRead720005_1235()), "cocoa"));
    spill720005_363 = __invokedynamic720005_1239(30107, (6299886108881519213L ^ life0_3));
    spill720005_364 = "sandstone_stairs";
    moom.ew __stackOp720005_1241_0 = __sourceUninitializedNEW720005_1240();
    spill720005_365 = __stackOp720005_1241_0;
    __explicitNewInit720005_1246(__stackOp720005_1241_0, __call720005_1245(__call720005_1242(life5_403), __fieldRead720005_1243(), __fieldRead720005_1244()));
    __call720005_1248(spill720005_363, spill720005_364, __call720005_1247(spill720005_365, "stairsSandStone"));
    spill720005_366 = __invokedynamic720005_1249(7315, (8752185391022566214L ^ life0_3));
    spill720005_367 = "emerald_ore";
    moom.dT __stackOp720005_1251_0 = __sourceUninitializedNEW720005_1250();
    spill720005_368 = __stackOp720005_1251_0;
    __explicitNewInit720005_1252(__stackOp720005_1251_0);
    __call720005_1258(spill720005_366, spill720005_367, __call720005_1257(__call720005_1256(__call720005_1254(__call720005_1253(spill720005_368, 0x1.8p1f), 0x1.4p2f), __fieldRead720005_1255()), "oreEmerald"));
    spill720005_369 = __invokedynamic720005_1259(28476, (3007514132775802934L ^ life0_3));
    spill720005_370 = "ender_chest";
    moom.c6 __stackOp720005_1261_0 = __sourceUninitializedNEW720005_1260();
    spill720005_371 = __stackOp720005_1261_0;
    __explicitNewInit720005_1262(__stackOp720005_1261_0);
    __call720005_1269(spill720005_369, spill720005_370, __call720005_1268(__call720005_1267(__call720005_1266(__call720005_1264(__call720005_1263(spill720005_371, 0x1.68p4f), 0x1.f4p9f), __fieldRead720005_1265()), "enderChest"), 0x1.0p-1f));
    spill720005_372 = __invokedynamic720005_1270(15236, (8485487603579702524L ^ life0_3));
    spill720005_373 = "tripwire_hook";
    moom.eE __stackOp720005_1272_0 = __sourceUninitializedNEW720005_1271();
    spill720005_374 = __stackOp720005_1272_0;
    __explicitNewInit720005_1273(__stackOp720005_1272_0);
    __call720005_1275(spill720005_372, spill720005_373, __call720005_1274(spill720005_374, "tripWireSource"));
    spill720005_375 = __invokedynamic720005_1276(6053, (3780605199557451983L ^ life0_3));
    spill720005_376 = "tripwire";
    moom.eD __stackOp720005_1278_0 = __sourceUninitializedNEW720005_1277();
    spill720005_377 = __stackOp720005_1278_0;
    __explicitNewInit720005_1279(__stackOp720005_1278_0);
    __call720005_1281(spill720005_375, spill720005_376, __call720005_1280(spill720005_377, "tripWire"));
    spill720005_378 = __invokedynamic720005_1282(24595, (5336802582083344137L ^ life0_3));
    spill720005_379 = "emerald_block";
    net.minecraft.block.Block __stackOp720005_1284_0 = __sourceUninitializedNEW720005_1283();
    spill720005_380 = __stackOp720005_1284_0;
    __explicitNewInit720005_1287(__stackOp720005_1284_0, __fieldRead720005_1285(), __fieldRead720005_1286());
    __call720005_1295(spill720005_378, spill720005_379, __call720005_1294(__call720005_1292(__call720005_1291(__call720005_1289(__call720005_1288(spill720005_380, 0x1.4p2f), 0x1.4p3f), __fieldRead720005_1290()), "blockEmerald"), __fieldRead720005_1293()));
    spill720005_381 = __invokedynamic720005_1296(29206, (2901292159455626695L ^ life0_3));
    spill720005_382 = "spruce_stairs";
    moom.ew __stackOp720005_1298_0 = __sourceUninitializedNEW720005_1297();
    spill720005_383 = __stackOp720005_1298_0;
    __explicitNewInit720005_1303(__stackOp720005_1298_0, __call720005_1302(__call720005_1299(life4_80), __fieldRead720005_1300(), __fieldRead720005_1301()));
    __call720005_1305(spill720005_381, spill720005_382, __call720005_1304(spill720005_383, "stairsWoodSpruce"));
    spill720005_384 = __invokedynamic720005_1306(2018, (2333981490493452318L ^ life0_3));
    spill720005_385 = "birch_stairs";
    moom.ew __stackOp720005_1308_0 = __sourceUninitializedNEW720005_1307();
    spill720005_386 = __stackOp720005_1308_0;
    __explicitNewInit720005_1313(__stackOp720005_1308_0, __call720005_1312(__call720005_1309(life4_80), __fieldRead720005_1310(), __fieldRead720005_1311()));
    __call720005_1315(spill720005_384, spill720005_385, __call720005_1314(spill720005_386, "stairsWoodBirch"));
    spill720005_387 = __invokedynamic720005_1316(27198, (2563506375944936896L ^ life0_3));
    spill720005_388 = "jungle_stairs";
    moom.ew __stackOp720005_1318_0 = __sourceUninitializedNEW720005_1317();
    spill720005_389 = __stackOp720005_1318_0;
    __explicitNewInit720005_1323(__stackOp720005_1318_0, __call720005_1322(__call720005_1319(life4_80), __fieldRead720005_1320(), __fieldRead720005_1321()));
    __call720005_1325(spill720005_387, spill720005_388, __call720005_1324(spill720005_389, "stairsWoodJungle"));
    spill720005_390 = __invokedynamic720005_1326(16928, (6318909887314474259L ^ life0_3));
    spill720005_391 = "command_block";
    moom.c0 __stackOp720005_1328_0 = __sourceUninitializedNEW720005_1327();
    spill720005_392 = __stackOp720005_1328_0;
    __explicitNewInit720005_1329(__stackOp720005_1328_0);
    __call720005_1333(spill720005_390, spill720005_391, __call720005_1332(__call720005_1331(__call720005_1330(spill720005_392), 0x1.6e36p22f), "commandBlock"));
    spill720005_393 = __invokedynamic720005_1334(11743, (6688991665865054760L ^ life0_3));
    spill720005_394 = "beacon";
    moom.cX __stackOp720005_1336_0 = __sourceUninitializedNEW720005_1335();
    spill720005_395 = __stackOp720005_1336_0;
    __explicitNewInit720005_1337(__stackOp720005_1336_0);
    __call720005_1340(spill720005_393, spill720005_394, __call720005_1339(__call720005_1338(spill720005_395, "beacon"), 0x1.0p0f));
    spill720005_396 = __invokedynamic720005_1341(20040, (6225996570271201620L ^ life0_3));
    spill720005_397 = "cobblestone_wall";
    moom.eG __stackOp720005_1343_0 = __sourceUninitializedNEW720005_1342();
    spill720005_398 = __stackOp720005_1343_0;
    __explicitNewInit720005_1344(__stackOp720005_1343_0, life3_64);
    __call720005_1346(spill720005_396, spill720005_397, __call720005_1345(spill720005_398, "cobbleWall"));
    spill720005_399 = __invokedynamic720005_1347(26747, (2681059003927535488L ^ life0_3));
    spill720005_400 = "flower_pot";
    net.minecraft.block.BlockFlowerPot __stackOp720005_1349_0 = __sourceUninitializedNEW720005_1348();
    spill720005_401 = __stackOp720005_1349_0;
    __explicitNewInit720005_1350(__stackOp720005_1349_0);
    __call720005_1355(spill720005_399, spill720005_400, __call720005_1354(__call720005_1353(__call720005_1351(spill720005_401, 0x0.0p0f), __fieldRead720005_1352()), "flowerPot"));
    spill720005_402 = __invokedynamic720005_1356(17297, (2337155588687180872L ^ life0_3));
    spill720005_403 = "carrots";
    moom.cw __stackOp720005_1358_0 = __sourceUninitializedNEW720005_1357();
    spill720005_404 = __stackOp720005_1358_0;
    __explicitNewInit720005_1359(__stackOp720005_1358_0);
    __call720005_1361(spill720005_402, spill720005_403, __call720005_1360(spill720005_404, "carrots"));
    spill720005_405 = __invokedynamic720005_1362(12914, (5481909425683055936L ^ life0_3));
    spill720005_406 = "potatoes";
    moom.cx __stackOp720005_1364_0 = __sourceUninitializedNEW720005_1363();
    spill720005_407 = __stackOp720005_1364_0;
    __explicitNewInit720005_1365(__stackOp720005_1364_0);
    __call720005_1367(spill720005_405, spill720005_406, __call720005_1366(spill720005_407, "potatoes"));
    spill720005_408 = __invokedynamic720005_1368(9127, (4614664525817533445L ^ life0_3));
    spill720005_409 = "wooden_button";
    moom.cL __stackOp720005_1370_0 = __sourceUninitializedNEW720005_1369();
    spill720005_410 = __stackOp720005_1370_0;
    __explicitNewInit720005_1371(__stackOp720005_1370_0);
    __call720005_1376(spill720005_408, spill720005_409, __call720005_1375(__call720005_1374(__call720005_1372(spill720005_410, 0x1.0p-1f), __fieldRead720005_1373()), "button"));
    spill720005_411 = __invokedynamic720005_1377(32547, (3393746225665509578L ^ life0_3));
    spill720005_412 = "skull";
    net.minecraft.block.BlockSkull __stackOp720005_1379_0 = __sourceUninitializedNEW720005_1378();
    spill720005_413 = __stackOp720005_1379_0;
    __explicitNewInit720005_1380(__stackOp720005_1379_0);
    __call720005_1385(spill720005_411, spill720005_412, __call720005_1384(__call720005_1383(__call720005_1381(spill720005_413, 0x1.0p0f), __fieldRead720005_1382()), "skull"));
    spill720005_414 = __invokedynamic720005_1386(18810, (5580015146734599899L ^ life0_3));
    spill720005_415 = "anvil";
    moom.dv __stackOp720005_1388_0 = __sourceUninitializedNEW720005_1387();
    spill720005_416 = __stackOp720005_1388_0;
    __explicitNewInit720005_1389(__stackOp720005_1388_0);
    __call720005_1395(spill720005_414, spill720005_415, __call720005_1394(__call720005_1393(__call720005_1392(__call720005_1390(spill720005_416, 0x1.4p2f), __fieldRead720005_1391()), 0x1.f4p10f), "anvil"));
    spill720005_417 = __invokedynamic720005_1396(3671, (6463060966038075698L ^ life0_3));
    spill720005_418 = "trapped_chest";
    moom.cZ __stackOp720005_1398_0 = __sourceUninitializedNEW720005_1397();
    spill720005_419 = __stackOp720005_1398_0;
    __explicitNewInit720005_1399(__stackOp720005_1398_0, 1);
    __call720005_1404(spill720005_417, spill720005_418, __call720005_1403(__call720005_1402(__call720005_1400(spill720005_419, 0x1.4p1f), __fieldRead720005_1401()), "chestTrap"));
    spill720005_420 = __invokedynamic720005_1405(8395, (8808063360090691496L ^ life0_3));
    spill720005_421 = "light_weighted_pressure_plate";
    moom.cm __stackOp720005_1407_0 = __sourceUninitializedNEW720005_1406();
    spill720005_422 = __stackOp720005_1407_0;
    __explicitNewInit720005_1411(__stackOp720005_1407_0, __fieldRead720005_1408(), __invokedynamic720005_1409(22985, (6716030442660933350L ^ life0_3)), __fieldRead720005_1410());
    __call720005_1416(spill720005_420, spill720005_421, __call720005_1415(__call720005_1414(__call720005_1412(spill720005_422, 0x1.0p-1f), __fieldRead720005_1413()), "weightedPlate_light"));
    spill720005_423 = __invokedynamic720005_1417(23591, (3232330338507795455L ^ life0_3));
    spill720005_424 = "heavy_weighted_pressure_plate";
    moom.cm __stackOp720005_1419_0 = __sourceUninitializedNEW720005_1418();
    spill720005_425 = __stackOp720005_1419_0;
    __explicitNewInit720005_1422(__stackOp720005_1419_0, __fieldRead720005_1420(), __invokedynamic720005_1421(13617, (4450796316052308544L ^ life0_3)));
    __call720005_1427(spill720005_423, spill720005_424, __call720005_1426(__call720005_1425(__call720005_1423(spill720005_425, 0x1.0p-1f), __fieldRead720005_1424()), "weightedPlate_heavy"));
    spill720005_426 = __invokedynamic720005_1428(28345, (3530534139061442929L ^ life0_3));
    spill720005_427 = "unpowered_comparator";
    net.minecraft.block.BlockRedstoneComparator __stackOp720005_1430_0 = __sourceUninitializedNEW720005_1429();
    spill720005_428 = __stackOp720005_1430_0;
    __explicitNewInit720005_1431(__stackOp720005_1430_0, false);
    __call720005_1437(spill720005_426, spill720005_427, __call720005_1436(__call720005_1435(__call720005_1434(__call720005_1432(spill720005_428, 0x0.0p0f), __fieldRead720005_1433()), "comparator")));
    spill720005_429 = __invokedynamic720005_1438(366, (356247257720092340L ^ life0_3));
    spill720005_430 = "powered_comparator";
    net.minecraft.block.BlockRedstoneComparator __stackOp720005_1440_0 = __sourceUninitializedNEW720005_1439();
    spill720005_431 = __stackOp720005_1440_0;
    __explicitNewInit720005_1441(__stackOp720005_1440_0, true);
    __call720005_1448(spill720005_429, spill720005_430, __call720005_1447(__call720005_1446(__call720005_1445(__call720005_1443(__call720005_1442(spill720005_431, 0x0.0p0f), 0x1.4p-1f), __fieldRead720005_1444()), "comparator")));
    spill720005_432 = __invokedynamic720005_1449(22104, (7999265511643586861L ^ life0_3));
    spill720005_433 = "daylight_detector";
    moom.c1 __stackOp720005_1451_0 = __sourceUninitializedNEW720005_1450();
    spill720005_434 = __stackOp720005_1451_0;
    __explicitNewInit720005_1452(__stackOp720005_1451_0, false);
    __call720005_1453(spill720005_432, spill720005_433, spill720005_434);
    spill720005_435 = __invokedynamic720005_1454(4324, (8051084936508565411L ^ life0_3));
    spill720005_436 = "redstone_block";
    moom.cS __stackOp720005_1456_0 = __sourceUninitializedNEW720005_1455();
    spill720005_437 = __stackOp720005_1456_0;
    __explicitNewInit720005_1459(__stackOp720005_1456_0, __fieldRead720005_1457(), __fieldRead720005_1458());
    __call720005_1467(spill720005_435, spill720005_436, __call720005_1466(__call720005_1464(__call720005_1463(__call720005_1461(__call720005_1460(spill720005_437, 0x1.4p2f), 0x1.4p3f), __fieldRead720005_1462()), "blockRedstone"), __fieldRead720005_1465()));
    spill720005_438 = __invokedynamic720005_1468(6183, (656904211122515824L ^ life0_3));
    spill720005_439 = "quartz_ore";
    moom.dT __stackOp720005_1470_0 = __sourceUninitializedNEW720005_1469();
    spill720005_440 = __stackOp720005_1470_0;
    __explicitNewInit720005_1472(__stackOp720005_1470_0, __fieldRead720005_1471());
    __call720005_1478(spill720005_438, spill720005_439, __call720005_1477(__call720005_1476(__call720005_1474(__call720005_1473(spill720005_440, 0x1.8p1f), 0x1.4p2f), __fieldRead720005_1475()), "netherquartz"));
    spill720005_441 = __invokedynamic720005_1479(1672, (1393531253540188559L ^ life0_3));
    spill720005_442 = "hopper";
    moom.c9 __stackOp720005_1481_0 = __sourceUninitializedNEW720005_1480();
    spill720005_443 = __stackOp720005_1481_0;
    __explicitNewInit720005_1482(__stackOp720005_1481_0);
    __call720005_1488(spill720005_441, spill720005_442, __call720005_1487(__call720005_1486(__call720005_1484(__call720005_1483(spill720005_443, 0x1.8p1f), 0x1.0p3f), __fieldRead720005_1485()), "hopper"));
    moom.d1 __stackOp720005_1490_0 = __sourceUninitializedNEW720005_1489();
    spill720005_444 = __stackOp720005_1490_0;
    __explicitNewInit720005_1491(__stackOp720005_1490_0);
    life14_2666 = __call720005_1495(__call720005_1494(__call720005_1493(spill720005_444, __fieldRead720005_1492()), 0x1.99999ap-1f), "quartzBlock");
    __call720005_1497(__invokedynamic720005_1496(22507, (7867104873262260418L ^ life0_3)), "quartz_block", life14_2666);
    spill720005_445 = __invokedynamic720005_1498(5332, (3121186963870704626L ^ life0_3));
    spill720005_446 = "quartz_stairs";
    moom.ew __stackOp720005_1500_0 = __sourceUninitializedNEW720005_1499();
    spill720005_447 = __stackOp720005_1500_0;
    __explicitNewInit720005_1505(__stackOp720005_1500_0, __call720005_1504(__call720005_1501(life14_2666), __fieldRead720005_1502(), __fieldRead720005_1503()));
    __call720005_1507(spill720005_445, spill720005_446, __call720005_1506(spill720005_447, "stairsQuartz"));
    spill720005_448 = __invokedynamic720005_1508(12087, (3830042764511172851L ^ life0_3));
    spill720005_449 = "activator_rail";
    moom.d5 __stackOp720005_1510_0 = __sourceUninitializedNEW720005_1509();
    spill720005_450 = __stackOp720005_1510_0;
    __explicitNewInit720005_1511(__stackOp720005_1510_0);
    __call720005_1516(spill720005_448, spill720005_449, __call720005_1515(__call720005_1514(__call720005_1512(spill720005_450, 0x1.666666p-1f), __fieldRead720005_1513()), "activatorRail"));
    spill720005_451 = __invokedynamic720005_1517(17233, (3883829914611889266L ^ life0_3));
    spill720005_452 = "dropper";
    moom.c3 __stackOp720005_1519_0 = __sourceUninitializedNEW720005_1518();
    spill720005_453 = __stackOp720005_1519_0;
    __explicitNewInit720005_1520(__stackOp720005_1519_0);
    __call720005_1525(spill720005_451, spill720005_452, __call720005_1524(__call720005_1523(__call720005_1521(spill720005_453, 0x1.cp1f), __fieldRead720005_1522()), "dropper"));
    spill720005_454 = __invokedynamic720005_1526(15464, (5466486820002712376L ^ life0_3));
    spill720005_455 = "stained_hardened_clay";
    moom.cR __stackOp720005_1528_0 = __sourceUninitializedNEW720005_1527();
    spill720005_456 = __stackOp720005_1528_0;
    __explicitNewInit720005_1530(__stackOp720005_1528_0, __fieldRead720005_1529());
    __call720005_1536(spill720005_454, spill720005_455, __call720005_1535(__call720005_1534(__call720005_1532(__call720005_1531(spill720005_456, 0x1.4p0f), 0x1.cp2f), __fieldRead720005_1533()), "clayHardenedStained"));
    spill720005_457 = __invokedynamic720005_1537(21581, (4650315163968775071L ^ life0_3));
    spill720005_458 = "stained_glass_pane";
    moom.dW __stackOp720005_1539_0 = __sourceUninitializedNEW720005_1538();
    spill720005_459 = __stackOp720005_1539_0;
    __explicitNewInit720005_1540(__stackOp720005_1539_0);
    __call720005_1545(spill720005_457, spill720005_458, __call720005_1544(__call720005_1543(__call720005_1541(spill720005_459, 0x1.333334p-2f), __fieldRead720005_1542()), "thinStainedGlass"));
    spill720005_460 = __invokedynamic720005_1546(28778, (3393996576361318254L ^ life0_3));
    spill720005_461 = "leaves2";
    moom.dI __stackOp720005_1548_0 = __sourceUninitializedNEW720005_1547();
    spill720005_462 = __stackOp720005_1548_0;
    __explicitNewInit720005_1549(__stackOp720005_1548_0);
    __call720005_1551(spill720005_460, spill720005_461, __call720005_1550(spill720005_462, "leaves"));
    spill720005_463 = __invokedynamic720005_1552(9457, (9102349082486657923L ^ life0_3));
    spill720005_464 = "log2";
    moom.ed __stackOp720005_1554_0 = __sourceUninitializedNEW720005_1553();
    spill720005_465 = __stackOp720005_1554_0;
    __explicitNewInit720005_1555(__stackOp720005_1554_0);
    __call720005_1557(spill720005_463, spill720005_464, __call720005_1556(spill720005_465, "log"));
    spill720005_466 = __invokedynamic720005_1558(25220, (4685910891237578221L ^ life0_3));
    spill720005_467 = "acacia_stairs";
    moom.ew __stackOp720005_1560_0 = __sourceUninitializedNEW720005_1559();
    spill720005_468 = __stackOp720005_1560_0;
    __explicitNewInit720005_1565(__stackOp720005_1560_0, __call720005_1564(__call720005_1561(life4_80), __fieldRead720005_1562(), __fieldRead720005_1563()));
    __call720005_1567(spill720005_466, spill720005_467, __call720005_1566(spill720005_468, "stairsWoodAcacia"));
    spill720005_469 = __invokedynamic720005_1568(12206, (5992957636961851532L ^ life0_3));
    spill720005_470 = "dark_oak_stairs";
    moom.ew __stackOp720005_1570_0 = __sourceUninitializedNEW720005_1569();
    spill720005_471 = __stackOp720005_1570_0;
    __explicitNewInit720005_1575(__stackOp720005_1570_0, __call720005_1574(__call720005_1571(life4_80), __fieldRead720005_1572(), __fieldRead720005_1573()));
    __call720005_1577(spill720005_469, spill720005_470, __call720005_1576(spill720005_471, "stairsWoodDarkOak"));
    spill720005_472 = __invokedynamic720005_1578(31905, (279093077747075937L ^ life0_3));
    spill720005_473 = "slime";
    moom.cs __stackOp720005_1580_0 = __sourceUninitializedNEW720005_1579();
    spill720005_474 = __stackOp720005_1580_0;
    __explicitNewInit720005_1581(__stackOp720005_1580_0);
    __call720005_1585(spill720005_472, spill720005_473, __call720005_1584(__call720005_1582(spill720005_474, "slime"), __fieldRead720005_1583()));
    spill720005_475 = __invokedynamic720005_1586(8944, (2510039193085597182L ^ life0_3));
    spill720005_476 = "barrier";
    net.minecraft.block.BlockBarrier __stackOp720005_1588_0 = __sourceUninitializedNEW720005_1587();
    spill720005_477 = __stackOp720005_1588_0;
    __explicitNewInit720005_1589(__stackOp720005_1588_0);
    __call720005_1591(spill720005_475, spill720005_476, __call720005_1590(spill720005_477, "barrier"));
    spill720005_478 = __invokedynamic720005_1592(18846, (2891960601546178168L ^ life0_3));
    spill720005_479 = "iron_trapdoor";
    moom.eC __stackOp720005_1594_0 = __sourceUninitializedNEW720005_1593();
    spill720005_480 = __stackOp720005_1594_0;
    __explicitNewInit720005_1596(__stackOp720005_1594_0, __fieldRead720005_1595());
    __call720005_1602(spill720005_478, spill720005_479, __call720005_1601(__call720005_1600(__call720005_1599(__call720005_1597(spill720005_480, 0x1.4p2f), __fieldRead720005_1598()), "ironTrapdoor")));
    spill720005_481 = __invokedynamic720005_1603(12961, (6305309629640787310L ^ life0_3));
    spill720005_482 = "prismarine";
    moom.d0 __stackOp720005_1605_0 = __sourceUninitializedNEW720005_1604();
    spill720005_483 = __stackOp720005_1605_0;
    __explicitNewInit720005_1606(__stackOp720005_1605_0);
    __call720005_1612(spill720005_481, spill720005_482, __call720005_1611(__call720005_1610(__call720005_1608(__call720005_1607(spill720005_483, 0x1.8p0f), 0x1.4p3f), __fieldRead720005_1609()), "prismarine"));
    spill720005_484 = __invokedynamic720005_1613(26799, (8665915554631229389L ^ life0_3));
    spill720005_485 = "sea_lantern";
    net.minecraft.block.BlockSeaLantern __stackOp720005_1615_0 = __sourceUninitializedNEW720005_1614();
    spill720005_486 = __stackOp720005_1615_0;
    __explicitNewInit720005_1617(__stackOp720005_1615_0, __fieldRead720005_1616());
    __call720005_1623(spill720005_484, spill720005_485, __call720005_1622(__call720005_1621(__call720005_1620(__call720005_1618(spill720005_486, 0x1.333334p-2f), __fieldRead720005_1619()), 0x1.0p0f), "seaLantern"));
    life2_2898 = spill720005_72;
    spill720005_487 = __invokedynamic720005_1624(32446, (4783723841018988969L ^ life0_3));
    spill720005_488 = "hay_block";
    moom.eb __stackOp720005_1626_0 = __sourceUninitializedNEW720005_1625();
    spill720005_489 = __stackOp720005_1626_0;
    __explicitNewInit720005_1627(__stackOp720005_1626_0);
    __call720005_1634(spill720005_487, spill720005_488, __call720005_1633(__call720005_1631(__call720005_1630(__call720005_1628(spill720005_489, 0x1.0p-1f), __fieldRead720005_1629()), "hayBlock"), __fieldRead720005_1632()));
    spill720005_490 = __invokedynamic720005_1635(25490, (4950683968258446458L ^ life0_3));
    spill720005_491 = "carpet";
    moom.cO __stackOp720005_1637_0 = __sourceUninitializedNEW720005_1636();
    spill720005_492 = __stackOp720005_1637_0;
    __explicitNewInit720005_1638(__stackOp720005_1637_0);
    __call720005_1644(spill720005_490, spill720005_491, __call720005_1643(__call720005_1642(__call720005_1641(__call720005_1639(spill720005_492, 0x1.99999ap-4f), __fieldRead720005_1640()), "woolCarpet"), 0));
    spill720005_493 = __invokedynamic720005_1645(979, (3314069392024597646L ^ life0_3));
    spill720005_494 = "hardened_clay";
    moom.dD __stackOp720005_1647_0 = __sourceUninitializedNEW720005_1646();
    spill720005_495 = __stackOp720005_1647_0;
    __explicitNewInit720005_1648(__stackOp720005_1647_0);
    __call720005_1654(spill720005_493, spill720005_494, __call720005_1653(__call720005_1652(__call720005_1650(__call720005_1649(spill720005_495, 0x1.4p0f), 0x1.cp2f), __fieldRead720005_1651()), "clayHardened"));
    spill720005_496 = __invokedynamic720005_1655(22080, (6742940484412219805L ^ life0_3));
    spill720005_497 = "coal_block";
    net.minecraft.block.Block __stackOp720005_1657_0 = __sourceUninitializedNEW720005_1656();
    spill720005_498 = __stackOp720005_1657_0;
    __explicitNewInit720005_1660(__stackOp720005_1657_0, __fieldRead720005_1658(), __fieldRead720005_1659());
    __call720005_1668(spill720005_496, spill720005_497, __call720005_1667(__call720005_1665(__call720005_1664(__call720005_1662(__call720005_1661(spill720005_498, 0x1.4p2f), 0x1.4p3f), __fieldRead720005_1663()), "blockCoal"), __fieldRead720005_1666()));
    spill720005_499 = __invokedynamic720005_1669(10103, (2118737565535752204L ^ life0_3));
    spill720005_500 = "packed_ice";
    net.minecraft.block.BlockPackedIce __stackOp720005_1671_0 = __sourceUninitializedNEW720005_1670();
    spill720005_501 = __stackOp720005_1671_0;
    __explicitNewInit720005_1672(__stackOp720005_1671_0);
    __call720005_1677(spill720005_499, spill720005_500, __call720005_1676(__call720005_1675(__call720005_1673(spill720005_501, 0x1.0p-1f), __fieldRead720005_1674()), "icePacked"));
    spill720005_502 = __invokedynamic720005_1678(22790, (7962884483835670039L ^ life0_3));
    spill720005_503 = "double_plant";
    moom.cz __stackOp720005_1680_0 = __sourceUninitializedNEW720005_1679();
    spill720005_504 = __stackOp720005_1680_0;
    __explicitNewInit720005_1681(__stackOp720005_1680_0);
    __call720005_1682(spill720005_502, spill720005_503, spill720005_504);
    spill720005_505 = __invokedynamic720005_1683(22698, (5821408854432722813L ^ life0_3));
    spill720005_506 = "standing_banner";
    moom.cW __stackOp720005_1685_0 = __sourceUninitializedNEW720005_1684();
    spill720005_507 = __stackOp720005_1685_0;
    __explicitNewInit720005_1686(__stackOp720005_1685_0);
    __call720005_1692(spill720005_505, spill720005_506, __call720005_1691(__call720005_1690(__call720005_1689(__call720005_1687(spill720005_507, 0x1.0p0f), __fieldRead720005_1688()), "banner")));
    spill720005_508 = __invokedynamic720005_1693(24390, (8681485003958954032L ^ life0_3));
    spill720005_509 = "wall_banner";
    moom.cV __stackOp720005_1695_0 = __sourceUninitializedNEW720005_1694();
    spill720005_510 = __stackOp720005_1695_0;
    __explicitNewInit720005_1696(__stackOp720005_1695_0);
    __call720005_1702(spill720005_508, spill720005_509, __call720005_1701(__call720005_1700(__call720005_1699(__call720005_1697(spill720005_510, 0x1.0p0f), __fieldRead720005_1698()), "banner")));
    spill720005_511 = __invokedynamic720005_1703(4673, (5616384872149607696L ^ life0_3));
    spill720005_512 = "daylight_detector_inverted";
    moom.c1 __stackOp720005_1705_0 = __sourceUninitializedNEW720005_1704();
    spill720005_513 = __stackOp720005_1705_0;
    __explicitNewInit720005_1706(__stackOp720005_1705_0, true);
    __call720005_1707(spill720005_511, spill720005_512, spill720005_513);
    moom.d6 __stackOp720005_1709_0 = __sourceUninitializedNEW720005_1708();
    spill720005_514 = __stackOp720005_1709_0;
    __explicitNewInit720005_1710(__stackOp720005_1709_0);
    life15_3055 = __call720005_1714(__call720005_1713(__call720005_1712(spill720005_514, __fieldRead720005_1711()), 0x1.99999ap-1f), "redSandStone");
    __call720005_1716(__invokedynamic720005_1715(31984, (483128711599033336L ^ life0_3)), "red_sandstone", life15_3055);
    spill720005_515 = __invokedynamic720005_1717(13532, (33032578489205551L ^ life0_3));
    spill720005_516 = "red_sandstone_stairs";
    moom.ew __stackOp720005_1719_0 = __sourceUninitializedNEW720005_1718();
    spill720005_517 = __stackOp720005_1719_0;
    __explicitNewInit720005_1724(__stackOp720005_1719_0, __call720005_1723(__call720005_1720(life15_3055), __fieldRead720005_1721(), __fieldRead720005_1722()));
    __call720005_1726(spill720005_515, spill720005_516, __call720005_1725(spill720005_517, "stairsRedSandStone"));
    spill720005_518 = __invokedynamic720005_1727(32492, (6883230058370304391L ^ life0_3));
    spill720005_519 = "double_stone_slab2";
    moom.en __stackOp720005_1729_0 = __sourceUninitializedNEW720005_1728();
    spill720005_520 = __stackOp720005_1729_0;
    __explicitNewInit720005_1730(__stackOp720005_1729_0);
    __call720005_1736(spill720005_518, spill720005_519, __call720005_1735(__call720005_1734(__call720005_1732(__call720005_1731(spill720005_520, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_1733()), "stoneSlab2"));
    spill720005_521 = __invokedynamic720005_1737(3893, (5298666622524389408L ^ life0_3));
    spill720005_522 = "stone_slab2";
    moom.eo __stackOp720005_1739_0 = __sourceUninitializedNEW720005_1738();
    spill720005_523 = __stackOp720005_1739_0;
    __explicitNewInit720005_1740(__stackOp720005_1739_0);
    __call720005_1746(spill720005_521, spill720005_522, __call720005_1745(__call720005_1744(__call720005_1742(__call720005_1741(spill720005_523, 0x1.0p1f), 0x1.4p3f), __fieldRead720005_1743()), "stoneSlab2"));
    spill720005_524 = __invokedynamic720005_1747(28557, (204897252344404166L ^ life0_3));
    spill720005_525 = "spruce_fence_gate";
    moom.dk __stackOp720005_1749_0 = __sourceUninitializedNEW720005_1748();
    spill720005_526 = __stackOp720005_1749_0;
    __explicitNewInit720005_1751(__stackOp720005_1749_0, __fieldRead720005_1750());
    __call720005_1757(spill720005_524, spill720005_525, __call720005_1756(__call720005_1755(__call720005_1753(__call720005_1752(spill720005_526, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1754()), "spruceFenceGate"));
    spill720005_527 = __invokedynamic720005_1758(28757, (6773327177798584247L ^ life0_3));
    spill720005_528 = "birch_fence_gate";
    moom.dk __stackOp720005_1760_0 = __sourceUninitializedNEW720005_1759();
    spill720005_529 = __stackOp720005_1760_0;
    __explicitNewInit720005_1762(__stackOp720005_1760_0, __fieldRead720005_1761());
    __call720005_1768(spill720005_527, spill720005_528, __call720005_1767(__call720005_1766(__call720005_1764(__call720005_1763(spill720005_529, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1765()), "birchFenceGate"));
    spill720005_530 = __invokedynamic720005_1769(17478, (8702900129621324663L ^ life0_3));
    spill720005_531 = "jungle_fence_gate";
    moom.dk __stackOp720005_1771_0 = __sourceUninitializedNEW720005_1770();
    spill720005_532 = __stackOp720005_1771_0;
    __explicitNewInit720005_1773(__stackOp720005_1771_0, __fieldRead720005_1772());
    __call720005_1779(spill720005_530, spill720005_531, __call720005_1778(__call720005_1777(__call720005_1775(__call720005_1774(spill720005_532, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1776()), "jungleFenceGate"));
    spill720005_533 = __invokedynamic720005_1780(4636, (6494589198973330773L ^ life0_3));
    spill720005_534 = "dark_oak_fence_gate";
    moom.dk __stackOp720005_1782_0 = __sourceUninitializedNEW720005_1781();
    spill720005_535 = __stackOp720005_1782_0;
    __explicitNewInit720005_1784(__stackOp720005_1782_0, __fieldRead720005_1783());
    __call720005_1790(spill720005_533, spill720005_534, __call720005_1789(__call720005_1788(__call720005_1786(__call720005_1785(spill720005_535, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1787()), "darkOakFenceGate"));
    spill720005_536 = __invokedynamic720005_1791(2915, (6499184755033734237L ^ life0_3));
    spill720005_537 = "acacia_fence_gate";
    moom.dk __stackOp720005_1793_0 = __sourceUninitializedNEW720005_1792();
    spill720005_538 = __stackOp720005_1793_0;
    __explicitNewInit720005_1795(__stackOp720005_1793_0, __fieldRead720005_1794());
    __call720005_1801(spill720005_536, spill720005_537, __call720005_1800(__call720005_1799(__call720005_1797(__call720005_1796(spill720005_538, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1798()), "acaciaFenceGate"));
    spill720005_539 = __invokedynamic720005_1802(3433, (8614809402853456425L ^ life0_3));
    spill720005_540 = "spruce_fence";
    moom.dz __stackOp720005_1804_0 = __sourceUninitializedNEW720005_1803();
    spill720005_541 = __stackOp720005_1804_0;
    __explicitNewInit720005_1808(__stackOp720005_1804_0, __fieldRead720005_1805(), __call720005_1807(__fieldRead720005_1806()));
    __call720005_1814(spill720005_539, spill720005_540, __call720005_1813(__call720005_1812(__call720005_1810(__call720005_1809(spill720005_541, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1811()), "spruceFence"));
    spill720005_542 = __invokedynamic720005_1815(29703, (318122278413173732L ^ life0_3));
    spill720005_543 = "birch_fence";
    moom.dz __stackOp720005_1817_0 = __sourceUninitializedNEW720005_1816();
    spill720005_544 = __stackOp720005_1817_0;
    __explicitNewInit720005_1821(__stackOp720005_1817_0, __fieldRead720005_1818(), __call720005_1820(__fieldRead720005_1819()));
    __call720005_1827(spill720005_542, spill720005_543, __call720005_1826(__call720005_1825(__call720005_1823(__call720005_1822(spill720005_544, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1824()), "birchFence"));
    spill720005_545 = __invokedynamic720005_1828(29492, (6306323813786944527L ^ life0_3));
    spill720005_546 = "jungle_fence";
    moom.dz __stackOp720005_1830_0 = __sourceUninitializedNEW720005_1829();
    spill720005_547 = __stackOp720005_1830_0;
    __explicitNewInit720005_1834(__stackOp720005_1830_0, __fieldRead720005_1831(), __call720005_1833(__fieldRead720005_1832()));
    __call720005_1840(spill720005_545, spill720005_546, __call720005_1839(__call720005_1838(__call720005_1836(__call720005_1835(spill720005_547, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1837()), "jungleFence"));
    spill720005_548 = __invokedynamic720005_1841(21143, (1181904994629002713L ^ life0_3));
    spill720005_549 = "dark_oak_fence";
    moom.dz __stackOp720005_1843_0 = __sourceUninitializedNEW720005_1842();
    spill720005_550 = __stackOp720005_1843_0;
    __explicitNewInit720005_1847(__stackOp720005_1843_0, __fieldRead720005_1844(), __call720005_1846(__fieldRead720005_1845()));
    __call720005_1853(spill720005_548, spill720005_549, __call720005_1852(__call720005_1851(__call720005_1849(__call720005_1848(spill720005_550, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1850()), "darkOakFence"));
    spill720005_551 = __invokedynamic720005_1854(28844, (8298671249086121867L ^ life0_3));
    spill720005_552 = "acacia_fence";
    moom.dz __stackOp720005_1856_0 = __sourceUninitializedNEW720005_1855();
    spill720005_553 = __stackOp720005_1856_0;
    __explicitNewInit720005_1860(__stackOp720005_1856_0, __fieldRead720005_1857(), __call720005_1859(__fieldRead720005_1858()));
    __call720005_1866(spill720005_551, spill720005_552, __call720005_1865(__call720005_1864(__call720005_1862(__call720005_1861(spill720005_553, 0x1.0p1f), 0x1.4p2f), __fieldRead720005_1863()), "acaciaFence"));
    spill720005_554 = __invokedynamic720005_1867(23228, (758166394778168764L ^ life0_3));
    spill720005_555 = "spruce_door";
    net.minecraft.block.BlockDoor __stackOp720005_1869_0 = __sourceUninitializedNEW720005_1868();
    spill720005_556 = __stackOp720005_1869_0;
    __explicitNewInit720005_1871(__stackOp720005_1869_0, __fieldRead720005_1870());
    __call720005_1877(spill720005_554, spill720005_555, __call720005_1876(__call720005_1875(__call720005_1874(__call720005_1872(spill720005_556, 0x1.8p1f), __fieldRead720005_1873()), "doorSpruce")));
    spill720005_557 = __invokedynamic720005_1878(5734, (4886716768207036837L ^ life0_3));
    spill720005_558 = "birch_door";
    net.minecraft.block.BlockDoor __stackOp720005_1880_0 = __sourceUninitializedNEW720005_1879();
    spill720005_559 = __stackOp720005_1880_0;
    __explicitNewInit720005_1882(__stackOp720005_1880_0, __fieldRead720005_1881());
    __call720005_1888(spill720005_557, spill720005_558, __call720005_1887(__call720005_1886(__call720005_1885(__call720005_1883(spill720005_559, 0x1.8p1f), __fieldRead720005_1884()), "doorBirch")));
    spill720005_560 = __invokedynamic720005_1889(27195, (1526356712798788990L ^ life0_3));
    spill720005_561 = "jungle_door";
    net.minecraft.block.BlockDoor __stackOp720005_1891_0 = __sourceUninitializedNEW720005_1890();
    spill720005_562 = __stackOp720005_1891_0;
    __explicitNewInit720005_1893(__stackOp720005_1891_0, __fieldRead720005_1892());
    __call720005_1899(spill720005_560, spill720005_561, __call720005_1898(__call720005_1897(__call720005_1896(__call720005_1894(spill720005_562, 0x1.8p1f), __fieldRead720005_1895()), "doorJungle")));
    spill720005_563 = __invokedynamic720005_1900(16167, (4464509000388167770L ^ life0_3));
    spill720005_564 = "acacia_door";
    net.minecraft.block.BlockDoor __stackOp720005_1902_0 = __sourceUninitializedNEW720005_1901();
    spill720005_565 = __stackOp720005_1902_0;
    __explicitNewInit720005_1904(__stackOp720005_1902_0, __fieldRead720005_1903());
    __call720005_1910(spill720005_563, spill720005_564, __call720005_1909(__call720005_1908(__call720005_1907(__call720005_1905(spill720005_565, 0x1.8p1f), __fieldRead720005_1906()), "doorAcacia")));
    spill720005_566 = __invokedynamic720005_1911(27246, (8996174584038628648L ^ life0_3));
    spill720005_567 = "dark_oak_door";
    net.minecraft.block.BlockDoor __stackOp720005_1913_0 = __sourceUninitializedNEW720005_1912();
    spill720005_568 = __stackOp720005_1913_0;
    __explicitNewInit720005_1915(__stackOp720005_1913_0, __fieldRead720005_1914());
    __call720005_1921(spill720005_566, spill720005_567, __call720005_1920(__call720005_1919(__call720005_1918(__call720005_1916(spill720005_568, 0x1.8p1f), __fieldRead720005_1917()), "doorDarkOak")));
    __call720005_1923(__fieldRead720005_1922());
    life16_3411 = __call720005_1925(__fieldRead720005_1924());
    forest_cycle_3412: while (true) {
    forest_join_3487: {
    forest_join_3484: {
    forest_join_3483: {
    forest_join_3482: {
    forest_join_3461: {
    forest_join_3460: {
    forest_join_3459: {
    forest_join_3449: {
    forest_join_3448: {
    forest_join_3435: {
    forest_join_3428: {
    if (!(__call720005_1926(life16_3411))) {
        break forest_join_3489;
    }
    life17_3420 = __cast720005_1928(__call720005_1927(life16_3411));
    spill720005_569 = life17_3420;
    if (!((life2_2898 != null))) {
        forestValue720005_3428_0 = spill720005_569;
        break forest_join_3428;
    }
    spill720005_570 = __fieldRead720005_1929(spill720005_569);
    if (!((life2_2898 != null))) {
        forestValue720005_3532_0 = spill720005_570;
        break forest_join_3532;
    }
    if (!((spill720005_570 == __fieldRead720005_1930()))) {
        break forest_join_3435;
    }
    forestValue720005_3428_0 = life17_3420;
    }
    __fieldWrite720005_1931(forestValue720005_3428_0, 0);
    if (!((life2_2898 == null))) {
        break forest_join_3487;
    }
    __call720005_1932(new java.lang.String[2]);
    }
    life18_3446 = 0;
    life19_3449 = __instanceOf720005_1933(life17_3420);
    life20_3452 = __instanceOf720005_1934(life17_3420);
    if (!((life17_3420 == life9_1016))) {
        break forest_join_3448;
    }
    forestValue720005_3449_0 = 1;
    break forest_join_3449;
    }
    forestValue720005_3449_0 = 0;
    }
    life21_3461 = forestValue720005_3449_0;
    life22_3464 = __integerCategory720005_1936(__fieldRead720005_1935(life17_3420));
    spill720005_571 = __fieldRead720005_1937(life17_3420);
    if (!((life2_2898 != null))) {
        forestValue720005_3459_0 = spill720005_571;
        break forest_join_3459;
    }
    if (!((spill720005_571 == 0))) {
        break forest_join_3460;
    }
    forestValue720005_3459_0 = 1;
    }
    forestValue720005_3461_0 = forestValue720005_3459_0;
    break forest_join_3461;
    }
    forestValue720005_3461_0 = 0;
    }
    life23_3478 = forestValue720005_3461_0;
    spill720005_572 = life19_3449;
    if (!((life2_2898 != null))) {
        forestValue720005_3483_0 = spill720005_572;
        break forest_join_3483;
    }
    if (!((spill720005_572 == 0))) {
        break forest_join_3482;
    }
    spill720005_573 = life20_3452;
    if (!((life2_2898 != null))) {
        forestValue720005_3483_0 = spill720005_573;
        break forest_join_3483;
    }
    if (!((spill720005_573 == 0))) {
        break forest_join_3482;
    }
    spill720005_574 = life21_3461;
    if (!((life2_2898 != null))) {
        forestValue720005_3483_0 = spill720005_574;
        break forest_join_3483;
    }
    if (!((spill720005_574 == 0))) {
        break forest_join_3482;
    }
    spill720005_575 = life22_3464;
    if (!((life2_2898 != null))) {
        forestValue720005_3483_0 = spill720005_575;
        break forest_join_3483;
    }
    if (!((spill720005_575 == 0))) {
        break forest_join_3482;
    }
    spill720005_576 = life23_3478;
    if (!((life2_2898 != null))) {
        forestValue720005_3483_0 = spill720005_576;
        break forest_join_3483;
    }
    if (!((spill720005_576 != 0))) {
        break forest_join_3484;
    }
    }
    forestValue720005_3483_0 = 1;
    }
    life18_3446 = forestValue720005_3483_0;
    }
    __fieldWrite720005_1938(life17_3420, life18_3446);
    }
    if (!((life2_2898 == null))) {
        continue forest_cycle_3412;
    }
    break forest_cycle_3412;
    }
    }
    life16_3531 = __call720005_1940(__fieldRead720005_1939());
    forest_cycle_3492: while (true) {
    forest_join_3529: {
    if (!(__call720005_1941(life16_3531))) {
        break forest_join_3573;
    }
    life17_3541 = __cast720005_1943(__call720005_1942(life16_3531));
    life18_3546 = __call720005_1946(__call720005_1945(__call720005_1944(life17_3541)));
    forest_cycle_3504: while (true) {
    if (!(__call720005_1947(life18_3546))) {
        break forest_join_3529;
    }
    life19_3555 = __cast720005_1949(__call720005_1948(life18_3546));
    life20_3565 = ((__call720005_1951(__fieldRead720005_1950(), life17_3541) << 4) | __call720005_1952(life17_3541, life19_3555));
    __call720005_1954(__fieldRead720005_1953(), life19_3555, life20_3565);
    if (!((life2_2898 != null))) {
        continue forest_cycle_3492;
    }
    if (!((life2_2898 == null))) {
        continue forest_cycle_3504;
    }
    break forest_cycle_3504;
    }
    }
    if (!((life2_2898 == null))) {
        continue forest_cycle_3492;
    }
    break forest_cycle_3492;
    }
    break forest_join_3573;
    }
    forest_cycle_3532: while (true) {
    forest_join_3567: {
    forest_join_3564: {
    life17_3580 = __cast720005_1955(forestValue720005_3532_0);
    life18_3585 = __call720005_1958(__call720005_1957(__call720005_1956(life17_3580)));
    forest_cycle_3539: while (true) {
    if (!(__call720005_1959(life18_3585))) {
        break forest_join_3564;
    }
    life19_3594 = __cast720005_1961(__call720005_1960(life18_3585));
    life20_3604 = ((__call720005_1963(__fieldRead720005_1962(), life17_3580) << 4) | __call720005_1964(life17_3580, life19_3594));
    __call720005_1966(__fieldRead720005_1965(), life19_3594, life20_3604);
    if (!((life2_2898 != null))) {
        break forest_join_3567;
    }
    if (!((life2_2898 == null))) {
        continue forest_cycle_3539;
    }
    break forest_cycle_3539;
    }
    }
    if (!((life2_2898 == null))) {
        break forest_join_3567;
    }
    break forest_join_3573;
    }
    if (!(__call720005_1967(life16_3411))) {
        break forest_join_3573;
    }
    spill720005_577 = __call720005_1968(life16_3411);
    forestValue720005_3532_0 = spill720005_577;
    continue forest_cycle_3532;
    }
    }
    return;
}
private static native long __fieldRead720005_0() throws Throwable;
private static native moom.DD __fieldRead720005_1() throws Throwable;
private static native moom.ci __sourceUninitializedNEW720005_2() throws Throwable;
private static native void __explicitNewInit720005_4(moom.ci a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_5(moom.ci a0, java.lang.String a1) throws Throwable;
private static native void __call720005_6(int a0, moom.DD a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.ex __sourceUninitializedNEW720005_7() throws Throwable;
private static native void __explicitNewInit720005_9(moom.ex a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_10(moom.ex a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_11(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_12() throws Throwable;
private static native net.minecraft.block.Block __call720005_13(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_14(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_15(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.dC __sourceUninitializedNEW720005_16() throws Throwable;
private static native void __explicitNewInit720005_18(moom.dC a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_19(moom.dC a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_20() throws Throwable;
private static native net.minecraft.block.Block __call720005_21(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_22(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_23(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.dq __sourceUninitializedNEW720005_24() throws Throwable;
private static native void __explicitNewInit720005_26(moom.dq a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_27(moom.dq a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_28() throws Throwable;
private static native net.minecraft.block.Block __call720005_29(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_30(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_31(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_32() throws Throwable;
private static native moom.fn __fieldRead720005_34() throws Throwable;
private static native void __explicitNewInit720005_35(net.minecraft.block.Block a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_36(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_37(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_38() throws Throwable;
private static native net.minecraft.block.Block __call720005_39(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_40(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_41() throws Throwable;
private static native net.minecraft.block.Block __call720005_42(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_43(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.dZ __sourceUninitializedNEW720005_44() throws Throwable;
private static native void __explicitNewInit720005_46(moom.dZ a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_47(moom.dZ a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_48(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_49() throws Throwable;
private static native net.minecraft.block.Block __call720005_50(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_51(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_52(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_53(int a0, long a1) throws Throwable;
private static native moom.cG __sourceUninitializedNEW720005_54() throws Throwable;
private static native void __explicitNewInit720005_56(moom.cG a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_57(moom.cG a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_58() throws Throwable;
private static native net.minecraft.block.Block __call720005_59(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_60(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_61(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_62(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_63() throws Throwable;
private static native moom.fn __fieldRead720005_65() throws Throwable;
private static native void __explicitNewInit720005_66(net.minecraft.block.Block a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_67(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_68(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_69() throws Throwable;
private static native net.minecraft.block.Block __call720005_70(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_71(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_72(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_73() throws Throwable;
private static native net.minecraft.block.Block __call720005_74(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_75(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_76(int a0, long a1) throws Throwable;
private static native moom.dM __sourceUninitializedNEW720005_77() throws Throwable;
private static native moom.fn __fieldRead720005_79() throws Throwable;
private static native void __explicitNewInit720005_80(moom.dM a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_81(moom.dM a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_82(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_83(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_84(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_85(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_86(int a0, long a1) throws Throwable;
private static native moom.dN __sourceUninitializedNEW720005_87() throws Throwable;
private static native moom.fn __fieldRead720005_89() throws Throwable;
private static native void __explicitNewInit720005_90(moom.dN a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_91(moom.dN a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_92(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_93(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_94(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_95(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_96(int a0, long a1) throws Throwable;
private static native moom.dM __sourceUninitializedNEW720005_97() throws Throwable;
private static native moom.fn __fieldRead720005_99() throws Throwable;
private static native void __explicitNewInit720005_100(moom.dM a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_101(moom.dM a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_102(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_103(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_104(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_105(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_106(int a0, long a1) throws Throwable;
private static native moom.dN __sourceUninitializedNEW720005_107() throws Throwable;
private static native moom.fn __fieldRead720005_109() throws Throwable;
private static native void __explicitNewInit720005_110(moom.dN a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_111(moom.dN a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_112(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_113(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_114(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_115(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_116(int a0, long a1) throws Throwable;
private static native moom.dx __sourceUninitializedNEW720005_117() throws Throwable;
private static native void __explicitNewInit720005_119(moom.dx a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_120(moom.dx a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_121() throws Throwable;
private static native net.minecraft.block.Block __call720005_122(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_123(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_124(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_125(int a0, long a1) throws Throwable;
private static native moom.dw __sourceUninitializedNEW720005_126() throws Throwable;
private static native void __explicitNewInit720005_128(moom.dw a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_129(moom.dw a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_130() throws Throwable;
private static native net.minecraft.block.Block __call720005_131(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_132(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_133(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_134(int a0, long a1) throws Throwable;
private static native moom.dT __sourceUninitializedNEW720005_135() throws Throwable;
private static native void __explicitNewInit720005_137(moom.dT a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_138(moom.dT a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_139(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_140() throws Throwable;
private static native net.minecraft.block.Block __call720005_141(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_142(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_143(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_144(int a0, long a1) throws Throwable;
private static native moom.dT __sourceUninitializedNEW720005_145() throws Throwable;
private static native void __explicitNewInit720005_147(moom.dT a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_148(moom.dT a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_149(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_150() throws Throwable;
private static native net.minecraft.block.Block __call720005_151(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_152(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_153(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_154(int a0, long a1) throws Throwable;
private static native moom.dT __sourceUninitializedNEW720005_155() throws Throwable;
private static native void __explicitNewInit720005_157(moom.dT a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_158(moom.dT a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_159(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_160() throws Throwable;
private static native net.minecraft.block.Block __call720005_161(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_162(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_163(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_164(int a0, long a1) throws Throwable;
private static native moom.ee __sourceUninitializedNEW720005_165() throws Throwable;
private static native void __explicitNewInit720005_167(moom.ee a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_168(moom.ee a0, java.lang.String a1) throws Throwable;
private static native void __call720005_169(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_170(int a0, long a1) throws Throwable;
private static native moom.dJ __sourceUninitializedNEW720005_171() throws Throwable;
private static native void __explicitNewInit720005_173(moom.dJ a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_174(moom.dJ a0, java.lang.String a1) throws Throwable;
private static native void __call720005_175(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_176(int a0, long a1) throws Throwable;
private static native moom.ev __sourceUninitializedNEW720005_177() throws Throwable;
private static native void __explicitNewInit720005_179(moom.ev a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_180(moom.ev a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_181() throws Throwable;
private static native net.minecraft.block.Block __call720005_182(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_183(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_184(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_185(int a0, long a1) throws Throwable;
private static native moom.cp __sourceUninitializedNEW720005_186() throws Throwable;
private static native moom.fn __fieldRead720005_188() throws Throwable;
private static native void __explicitNewInit720005_189(moom.cp a0, moom.fn a1, boolean a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_190(moom.cp a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_191() throws Throwable;
private static native net.minecraft.block.Block __call720005_192(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_193(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_194(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_195(int a0, long a1) throws Throwable;
private static native moom.dT __sourceUninitializedNEW720005_196() throws Throwable;
private static native void __explicitNewInit720005_198(moom.dT a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_199(moom.dT a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_200(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_201() throws Throwable;
private static native net.minecraft.block.Block __call720005_202(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_203(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_204(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_205(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_206() throws Throwable;
private static native moom.fn __fieldRead720005_208() throws Throwable;
private static native moom.fm __fieldRead720005_209() throws Throwable;
private static native void __explicitNewInit720005_210(net.minecraft.block.Block a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_211(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_212(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_213() throws Throwable;
private static native net.minecraft.block.Block __call720005_214(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_215(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_216() throws Throwable;
private static native net.minecraft.block.Block __call720005_217(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_218(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_219(int a0, long a1) throws Throwable;
private static native moom.c2 __sourceUninitializedNEW720005_220() throws Throwable;
private static native void __explicitNewInit720005_222(moom.c2 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_223(moom.c2 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_224() throws Throwable;
private static native net.minecraft.block.Block __call720005_225(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_226(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_227(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.ef __sourceUninitializedNEW720005_228() throws Throwable;
private static native void __explicitNewInit720005_230(moom.ef a0) throws Throwable;
private static native moom.eJ __fieldRead720005_231() throws Throwable;
private static native net.minecraft.block.Block __call720005_232(moom.ef a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_233(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_234(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic720005_235(int a0, long a1) throws Throwable;
private static native void __call720005_236(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_237(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockNote __sourceUninitializedNEW720005_238() throws Throwable;
private static native void __explicitNewInit720005_240(net.minecraft.block.BlockNote a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_241(net.minecraft.block.BlockNote a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_242(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_243(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int[] __call720005_244() throws Throwable;
private static native int __invokedynamic720005_245(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockBed __sourceUninitializedNEW720005_246() throws Throwable;
private static native void __explicitNewInit720005_248(net.minecraft.block.BlockBed a0) throws Throwable;
private static native moom.eJ __fieldRead720005_249() throws Throwable;
private static native net.minecraft.block.Block __call720005_250(net.minecraft.block.BlockBed a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_251(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_252(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_253(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_254(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_255(int a0, long a1) throws Throwable;
private static native moom.d5 __sourceUninitializedNEW720005_256() throws Throwable;
private static native void __explicitNewInit720005_258(moom.d5 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_259(moom.d5 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_260() throws Throwable;
private static native net.minecraft.block.Block __call720005_261(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_262(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_263(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_264(int a0, long a1) throws Throwable;
private static native moom.d4 __sourceUninitializedNEW720005_265() throws Throwable;
private static native void __explicitNewInit720005_267(moom.d4 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_268(moom.d4 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_269() throws Throwable;
private static native net.minecraft.block.Block __call720005_270(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_271(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_272(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_273(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockPistonBase __sourceUninitializedNEW720005_274() throws Throwable;
private static native void __explicitNewInit720005_276(net.minecraft.block.BlockPistonBase a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_277(net.minecraft.block.BlockPistonBase a0, java.lang.String a1) throws Throwable;
private static native void __call720005_278(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_279(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockWeb __sourceUninitializedNEW720005_280() throws Throwable;
private static native void __explicitNewInit720005_282(net.minecraft.block.BlockWeb a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_283(net.minecraft.block.BlockWeb a0, int a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_284(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_285(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_286(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_287(int a0, long a1) throws Throwable;
private static native moom.cI __sourceUninitializedNEW720005_288() throws Throwable;
private static native void __explicitNewInit720005_290(moom.cI a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_291(moom.cI a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_292() throws Throwable;
private static native net.minecraft.block.Block __call720005_293(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_294(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_295(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_296(int a0, long a1) throws Throwable;
private static native moom.cy __sourceUninitializedNEW720005_297() throws Throwable;
private static native void __explicitNewInit720005_299(moom.cy a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_300(moom.cy a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_301() throws Throwable;
private static native net.minecraft.block.Block __call720005_302(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_303(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_304(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_305(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockPistonBase __sourceUninitializedNEW720005_306() throws Throwable;
private static native void __explicitNewInit720005_308(net.minecraft.block.BlockPistonBase a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_309(net.minecraft.block.BlockPistonBase a0, java.lang.String a1) throws Throwable;
private static native void __call720005_310(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_311(int a0, long a1) throws Throwable;
private static native moom.dY __sourceUninitializedNEW720005_312() throws Throwable;
private static native void __explicitNewInit720005_314(moom.dY a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_315(moom.dY a0, java.lang.String a1) throws Throwable;
private static native void __call720005_316(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_317(int a0, long a1) throws Throwable;
private static native moom.cR __sourceUninitializedNEW720005_318() throws Throwable;
private static native moom.fn __fieldRead720005_320() throws Throwable;
private static native void __explicitNewInit720005_321(moom.cR a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_322(moom.cR a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_323() throws Throwable;
private static native net.minecraft.block.Block __call720005_324(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_325(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_326(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_327(int a0, long a1) throws Throwable;
private static native moom.dc __sourceUninitializedNEW720005_328() throws Throwable;
private static native void __explicitNewInit720005_330(moom.dc a0) throws Throwable;
private static native void __call720005_331(int a0, java.lang.String a1, moom.dc a2) throws Throwable;
private static native int __invokedynamic720005_332(int a0, long a1) throws Throwable;
private static native moom.cC __sourceUninitializedNEW720005_333() throws Throwable;
private static native void __explicitNewInit720005_335(moom.cC a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_336(moom.cC a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_337() throws Throwable;
private static native net.minecraft.block.Block __call720005_338(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_339(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_340(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_341(int a0, long a1) throws Throwable;
private static native moom.cB __sourceUninitializedNEW720005_342() throws Throwable;
private static native void __explicitNewInit720005_344(moom.cB a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_345(moom.cB a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_346() throws Throwable;
private static native net.minecraft.block.Block __call720005_347(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_348(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_349(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.cE __sourceUninitializedNEW720005_350() throws Throwable;
private static native void __explicitNewInit720005_352(moom.cE a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_353(moom.cE a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_354() throws Throwable;
private static native net.minecraft.block.Block __call720005_355(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_356(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_357(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic720005_358(int a0, long a1) throws Throwable;
private static native void __call720005_359(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.cE __sourceUninitializedNEW720005_360() throws Throwable;
private static native void __explicitNewInit720005_362(moom.cE a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_363(moom.cE a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_364() throws Throwable;
private static native net.minecraft.block.Block __call720005_365(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_366(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic720005_367(int a0, long a1) throws Throwable;
private static native void __call720005_368(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_369(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_370() throws Throwable;
private static native moom.fn __fieldRead720005_372() throws Throwable;
private static native moom.fm __fieldRead720005_373() throws Throwable;
private static native void __explicitNewInit720005_374(net.minecraft.block.Block a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_375(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_376(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_377() throws Throwable;
private static native net.minecraft.block.Block __call720005_378(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_379(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_380() throws Throwable;
private static native net.minecraft.block.Block __call720005_381(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_382(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_383(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_384() throws Throwable;
private static native moom.fn __fieldRead720005_386() throws Throwable;
private static native moom.fm __fieldRead720005_387() throws Throwable;
private static native void __explicitNewInit720005_388(net.minecraft.block.Block a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_389(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_390(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_391() throws Throwable;
private static native net.minecraft.block.Block __call720005_392(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_393(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_394() throws Throwable;
private static native net.minecraft.block.Block __call720005_395(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_396(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_397(int a0, long a1) throws Throwable;
private static native moom.ek __sourceUninitializedNEW720005_398() throws Throwable;
private static native void __explicitNewInit720005_400(moom.ek a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_401(moom.ek a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_402(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_403() throws Throwable;
private static native net.minecraft.block.Block __call720005_404(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_405(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_406(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_407(int a0, long a1) throws Throwable;
private static native moom.el __sourceUninitializedNEW720005_408() throws Throwable;
private static native void __explicitNewInit720005_410(moom.el a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_411(moom.el a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_412(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_413() throws Throwable;
private static native net.minecraft.block.Block __call720005_414(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_415(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_416(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_417() throws Throwable;
private static native moom.fn __fieldRead720005_419() throws Throwable;
private static native moom.fm __fieldRead720005_420() throws Throwable;
private static native void __explicitNewInit720005_421(net.minecraft.block.Block a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_422(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_423(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_424() throws Throwable;
private static native net.minecraft.block.Block __call720005_425(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_426(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_427() throws Throwable;
private static native net.minecraft.block.Block __call720005_428(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native int __invokedynamic720005_429(int a0, long a1) throws Throwable;
private static native void __call720005_430(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_431(int a0, long a1) throws Throwable;
private static native moom.ez __sourceUninitializedNEW720005_432() throws Throwable;
private static native void __explicitNewInit720005_434(moom.ez a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_435(moom.ez a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_436() throws Throwable;
private static native net.minecraft.block.Block __call720005_437(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_438(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_439(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_440(int a0, long a1) throws Throwable;
private static native moom.cn __sourceUninitializedNEW720005_441() throws Throwable;
private static native void __explicitNewInit720005_443(moom.cn a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_444(moom.cn a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_445() throws Throwable;
private static native net.minecraft.block.Block __call720005_446(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_447(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_448(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_449(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_450() throws Throwable;
private static native moom.fn __fieldRead720005_452() throws Throwable;
private static native void __explicitNewInit720005_453(net.minecraft.block.Block a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_454(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_455(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_456() throws Throwable;
private static native net.minecraft.block.Block __call720005_457(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_458(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_459() throws Throwable;
private static native net.minecraft.block.Block __call720005_460(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_461(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_462(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockObsidian __sourceUninitializedNEW720005_463() throws Throwable;
private static native void __explicitNewInit720005_465(net.minecraft.block.BlockObsidian a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_466(net.minecraft.block.BlockObsidian a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_467(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_468() throws Throwable;
private static native net.minecraft.block.Block __call720005_469(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_470(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_471(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_472(int a0, long a1) throws Throwable;
private static native moom.eA __sourceUninitializedNEW720005_473() throws Throwable;
private static native void __explicitNewInit720005_475(moom.eA a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_476(moom.eA a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_477(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_478() throws Throwable;
private static native net.minecraft.block.Block __call720005_479(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_480(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_481(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_482(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockFire __sourceUninitializedNEW720005_483() throws Throwable;
private static native void __explicitNewInit720005_485(net.minecraft.block.BlockFire a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_486(net.minecraft.block.BlockFire a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_487(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_488() throws Throwable;
private static native net.minecraft.block.Block __call720005_489(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_490(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_491(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_492(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_493(int a0, long a1) throws Throwable;
private static native moom.da __sourceUninitializedNEW720005_494() throws Throwable;
private static native void __explicitNewInit720005_496(moom.da a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_497(moom.da a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_498() throws Throwable;
private static native net.minecraft.block.Block __call720005_499(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_500(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_501(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_502(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_503(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_504() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_506(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_507() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_508() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_509(net.minecraft.block.state.IBlockState a0, moom.fw a1, net.minecraft.block.BlockPlanks$EnumType a2) throws Throwable;
private static native void __explicitNewInit720005_510(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_511(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_512(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_513(int a0, long a1) throws Throwable;
private static native moom.cZ __sourceUninitializedNEW720005_514() throws Throwable;
private static native void __explicitNewInit720005_516(moom.cZ a0, int a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_517(moom.cZ a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_518() throws Throwable;
private static native net.minecraft.block.Block __call720005_519(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_520(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_521(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_522(int a0, long a1) throws Throwable;
private static native moom.d9 __sourceUninitializedNEW720005_523() throws Throwable;
private static native void __explicitNewInit720005_525(moom.d9 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_526(moom.d9 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_527() throws Throwable;
private static native net.minecraft.block.Block __call720005_528(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_529(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_530(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_531(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_532(int a0, long a1) throws Throwable;
private static native moom.dT __sourceUninitializedNEW720005_533() throws Throwable;
private static native void __explicitNewInit720005_535(moom.dT a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_536(moom.dT a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_537(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_538() throws Throwable;
private static native net.minecraft.block.Block __call720005_539(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_540(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_541(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_542(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_543() throws Throwable;
private static native moom.fn __fieldRead720005_545() throws Throwable;
private static native moom.fm __fieldRead720005_546() throws Throwable;
private static native void __explicitNewInit720005_547(net.minecraft.block.Block a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_548(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_549(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_550() throws Throwable;
private static native net.minecraft.block.Block __call720005_551(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_552(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_553() throws Throwable;
private static native net.minecraft.block.Block __call720005_554(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_555(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_556(int a0, long a1) throws Throwable;
private static native moom.eI __sourceUninitializedNEW720005_557() throws Throwable;
private static native void __explicitNewInit720005_559(moom.eI a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_560(moom.eI a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_561() throws Throwable;
private static native net.minecraft.block.Block __call720005_562(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_563(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_564(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_565(int a0, long a1) throws Throwable;
private static native moom.cv __sourceUninitializedNEW720005_566() throws Throwable;
private static native void __explicitNewInit720005_568(moom.cv a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_569(moom.cv a0, java.lang.String a1) throws Throwable;
private static native void __call720005_570(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.dy __sourceUninitializedNEW720005_571() throws Throwable;
private static native void __explicitNewInit720005_573(moom.dy a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_574(moom.dy a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_575() throws Throwable;
private static native net.minecraft.block.Block __call720005_576(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_577(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic720005_578(int a0, long a1) throws Throwable;
private static native void __call720005_579(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_580(int a0, long a1) throws Throwable;
private static native moom.c8 __sourceUninitializedNEW720005_581() throws Throwable;
private static native void __explicitNewInit720005_583(moom.c8 a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_584(moom.c8 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_585() throws Throwable;
private static native net.minecraft.block.Block __call720005_586(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_587(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_588() throws Throwable;
private static native net.minecraft.block.Block __call720005_589(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_590(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_591(int a0, long a1) throws Throwable;
private static native moom.c8 __sourceUninitializedNEW720005_592() throws Throwable;
private static native void __explicitNewInit720005_594(moom.c8 a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_595(moom.c8 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_596() throws Throwable;
private static native net.minecraft.block.Block __call720005_597(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_598(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_599(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_600(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_601(int a0, long a1) throws Throwable;
private static native moom.de __sourceUninitializedNEW720005_602() throws Throwable;
private static native void __explicitNewInit720005_604(moom.de a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_605(moom.de a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_606() throws Throwable;
private static native net.minecraft.block.Block __call720005_607(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_608(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_609(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_610(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_611(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockDoor __sourceUninitializedNEW720005_612() throws Throwable;
private static native moom.fn __fieldRead720005_614() throws Throwable;
private static native void __explicitNewInit720005_615(net.minecraft.block.BlockDoor a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_616(net.minecraft.block.BlockDoor a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_617() throws Throwable;
private static native net.minecraft.block.Block __call720005_618(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_619(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_620(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_621(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_622(int a0, long a1) throws Throwable;
private static native moom.dF __sourceUninitializedNEW720005_623() throws Throwable;
private static native void __explicitNewInit720005_625(moom.dF a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_626(moom.dF a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_627() throws Throwable;
private static native net.minecraft.block.Block __call720005_628(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_629(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_630(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_631(int a0, long a1) throws Throwable;
private static native moom.d3 __sourceUninitializedNEW720005_632() throws Throwable;
private static native void __explicitNewInit720005_634(moom.d3 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_635(moom.d3 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_636() throws Throwable;
private static native net.minecraft.block.Block __call720005_637(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_638(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_639(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_640(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_641() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_643(net.minecraft.block.Block a0) throws Throwable;
private static native void __explicitNewInit720005_644(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_645(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_646(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_647(int a0, long a1) throws Throwable;
private static native moom.df __sourceUninitializedNEW720005_648() throws Throwable;
private static native void __explicitNewInit720005_650(moom.df a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_651(moom.df a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_652() throws Throwable;
private static native net.minecraft.block.Block __call720005_653(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_654(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_655(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_656(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_657(int a0, long a1) throws Throwable;
private static native moom.dK __sourceUninitializedNEW720005_658() throws Throwable;
private static native void __explicitNewInit720005_660(moom.dK a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_661(moom.dK a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_662() throws Throwable;
private static native net.minecraft.block.Block __call720005_663(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_664(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_665(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_666(int a0, long a1) throws Throwable;
private static native moom.cl __sourceUninitializedNEW720005_667() throws Throwable;
private static native moom.fn __fieldRead720005_669() throws Throwable;
private static native net.minecraft.block.BlockPressurePlate$Sensitivity __fieldRead720005_670() throws Throwable;
private static native void __explicitNewInit720005_671(moom.cl a0, moom.fn a1, net.minecraft.block.BlockPressurePlate$Sensitivity a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_672(moom.cl a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_673() throws Throwable;
private static native net.minecraft.block.Block __call720005_674(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_675(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_676(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_677(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockDoor __sourceUninitializedNEW720005_678() throws Throwable;
private static native moom.fn __fieldRead720005_680() throws Throwable;
private static native void __explicitNewInit720005_681(net.minecraft.block.BlockDoor a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_682(net.minecraft.block.BlockDoor a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_683() throws Throwable;
private static native net.minecraft.block.Block __call720005_684(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_685(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_686(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_687(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_688(int a0, long a1) throws Throwable;
private static native moom.cl __sourceUninitializedNEW720005_689() throws Throwable;
private static native moom.fn __fieldRead720005_691() throws Throwable;
private static native net.minecraft.block.BlockPressurePlate$Sensitivity __fieldRead720005_692() throws Throwable;
private static native void __explicitNewInit720005_693(moom.cl a0, moom.fn a1, net.minecraft.block.BlockPressurePlate$Sensitivity a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_694(moom.cl a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_695() throws Throwable;
private static native net.minecraft.block.Block __call720005_696(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_697(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_698(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_699(int a0, long a1) throws Throwable;
private static native moom.d8 __sourceUninitializedNEW720005_700() throws Throwable;
private static native void __explicitNewInit720005_702(moom.d8 a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_703(moom.d8 a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_704(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_705() throws Throwable;
private static native net.minecraft.block.Block __call720005_706(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_707(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_708() throws Throwable;
private static native net.minecraft.block.Block __call720005_709(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_710(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_711(int a0, long a1) throws Throwable;
private static native moom.d8 __sourceUninitializedNEW720005_712() throws Throwable;
private static native void __explicitNewInit720005_714(moom.d8 a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_715(moom.d8 a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_716(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_717(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_718() throws Throwable;
private static native net.minecraft.block.Block __call720005_719(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_720(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_721(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_722(int a0, long a1) throws Throwable;
private static native moom.eB __sourceUninitializedNEW720005_723() throws Throwable;
private static native void __explicitNewInit720005_725(moom.eB a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_726(moom.eB a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_727() throws Throwable;
private static native net.minecraft.block.Block __call720005_728(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_729(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_730(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_731(int a0, long a1) throws Throwable;
private static native moom.eB __sourceUninitializedNEW720005_732() throws Throwable;
private static native void __explicitNewInit720005_734(moom.eB a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_735(moom.eB a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_736(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_737() throws Throwable;
private static native net.minecraft.block.Block __call720005_738(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_739(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_740() throws Throwable;
private static native net.minecraft.block.Block __call720005_741(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_742(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_743(int a0, long a1) throws Throwable;
private static native moom.cK __sourceUninitializedNEW720005_744() throws Throwable;
private static native void __explicitNewInit720005_746(moom.cK a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_747(moom.cK a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_748() throws Throwable;
private static native net.minecraft.block.Block __call720005_749(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_750(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_751(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_752(int a0, long a1) throws Throwable;
private static native moom.es __sourceUninitializedNEW720005_753() throws Throwable;
private static native void __explicitNewInit720005_755(moom.es a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_756(moom.es a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_757() throws Throwable;
private static native net.minecraft.block.Block __call720005_758(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_759(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_760(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native void __call720005_761(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_762(int a0, long a1) throws Throwable;
private static native moom.cq __sourceUninitializedNEW720005_763() throws Throwable;
private static native void __explicitNewInit720005_765(moom.cq a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_766(moom.cq a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_767(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native moom.eJ __fieldRead720005_768() throws Throwable;
private static native net.minecraft.block.Block __call720005_769(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_770(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_771(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_772(int a0, long a1) throws Throwable;
private static native moom.et __sourceUninitializedNEW720005_773() throws Throwable;
private static native void __explicitNewInit720005_775(moom.et a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_776(moom.et a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_777() throws Throwable;
private static native net.minecraft.block.Block __call720005_778(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_779(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_780(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_781(int a0, long a1) throws Throwable;
private static native moom.cM __sourceUninitializedNEW720005_782() throws Throwable;
private static native void __explicitNewInit720005_784(moom.cM a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_785(moom.cM a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_786() throws Throwable;
private static native net.minecraft.block.Block __call720005_787(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_788(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_789(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_790(int a0, long a1) throws Throwable;
private static native moom.cQ __sourceUninitializedNEW720005_791() throws Throwable;
private static native void __explicitNewInit720005_793(moom.cQ a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_794(moom.cQ a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_795() throws Throwable;
private static native net.minecraft.block.Block __call720005_796(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_797(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_798(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_799(int a0, long a1) throws Throwable;
private static native moom.d_ __sourceUninitializedNEW720005_800() throws Throwable;
private static native void __explicitNewInit720005_802(moom.d_ a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_803(moom.d_ a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_804() throws Throwable;
private static native net.minecraft.block.Block __call720005_805(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_806(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_807(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_808(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_809(int a0, long a1) throws Throwable;
private static native moom.c_ __sourceUninitializedNEW720005_810() throws Throwable;
private static native void __explicitNewInit720005_812(moom.c_ a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_813(moom.c_ a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_814(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_815() throws Throwable;
private static native net.minecraft.block.Block __call720005_816(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_817(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_818(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_819(int a0, long a1) throws Throwable;
private static native moom.dz __sourceUninitializedNEW720005_820() throws Throwable;
private static native moom.fn __fieldRead720005_822() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_823() throws Throwable;
private static native moom.fm __call720005_824(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native void __explicitNewInit720005_825(moom.dz a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_826(moom.dz a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_827(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_828() throws Throwable;
private static native net.minecraft.block.Block __call720005_829(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_830(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_831(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.dl __sourceUninitializedNEW720005_832() throws Throwable;
private static native void __explicitNewInit720005_834(moom.dl a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_835(moom.dl a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_836() throws Throwable;
private static native net.minecraft.block.Block __call720005_837(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_838(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic720005_839(int a0, long a1) throws Throwable;
private static native void __call720005_840(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_841(int a0, long a1) throws Throwable;
private static native moom.dR __sourceUninitializedNEW720005_842() throws Throwable;
private static native void __explicitNewInit720005_844(moom.dR a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_845(moom.dR a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_846() throws Throwable;
private static native net.minecraft.block.Block __call720005_847(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_848(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_849(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_850(int a0, long a1) throws Throwable;
private static native moom.eu __sourceUninitializedNEW720005_851() throws Throwable;
private static native void __explicitNewInit720005_853(moom.eu a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_854(moom.eu a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_855() throws Throwable;
private static native net.minecraft.block.Block __call720005_856(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_857(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_858(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_859(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockGlowstone __sourceUninitializedNEW720005_860() throws Throwable;
private static native moom.fn __fieldRead720005_862() throws Throwable;
private static native void __explicitNewInit720005_863(net.minecraft.block.BlockGlowstone a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_864(net.minecraft.block.BlockGlowstone a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_865() throws Throwable;
private static native net.minecraft.block.Block __call720005_866(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_867(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_868(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_869(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_870(int a0, long a1) throws Throwable;
private static native moom.cr __sourceUninitializedNEW720005_871() throws Throwable;
private static native void __explicitNewInit720005_873(moom.cr a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_874(moom.cr a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_875() throws Throwable;
private static native net.minecraft.block.Block __call720005_876(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_877(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_878(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_879(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_880(int a0, long a1) throws Throwable;
private static native moom.dl __sourceUninitializedNEW720005_881() throws Throwable;
private static native void __explicitNewInit720005_883(moom.dl a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_884(moom.dl a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_885() throws Throwable;
private static native net.minecraft.block.Block __call720005_886(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_887(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_888(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_889(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_890(int a0, long a1) throws Throwable;
private static native moom.cN __sourceUninitializedNEW720005_891() throws Throwable;
private static native void __explicitNewInit720005_893(moom.cN a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_894(moom.cN a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_895() throws Throwable;
private static native net.minecraft.block.Block __call720005_896(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_897(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_898(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_899(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_900(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockRedstoneRepeater __sourceUninitializedNEW720005_901() throws Throwable;
private static native void __explicitNewInit720005_903(net.minecraft.block.BlockRedstoneRepeater a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_904(net.minecraft.block.BlockRedstoneRepeater a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_905() throws Throwable;
private static native net.minecraft.block.Block __call720005_906(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_907(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_908(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_909(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_910(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockRedstoneRepeater __sourceUninitializedNEW720005_911() throws Throwable;
private static native void __explicitNewInit720005_913(net.minecraft.block.BlockRedstoneRepeater a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_914(net.minecraft.block.BlockRedstoneRepeater a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_915() throws Throwable;
private static native net.minecraft.block.Block __call720005_916(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_917(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_918(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_919(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_920(int a0, long a1) throws Throwable;
private static native moom.ct __sourceUninitializedNEW720005_921() throws Throwable;
private static native moom.fn __fieldRead720005_923() throws Throwable;
private static native void __explicitNewInit720005_924(moom.ct a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_925(moom.ct a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_926() throws Throwable;
private static native net.minecraft.block.Block __call720005_927(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_928(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_929(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_930(int a0, long a1) throws Throwable;
private static native moom.eC __sourceUninitializedNEW720005_931() throws Throwable;
private static native moom.fn __fieldRead720005_933() throws Throwable;
private static native void __explicitNewInit720005_934(moom.eC a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_935(moom.eC a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_936() throws Throwable;
private static native net.minecraft.block.Block __call720005_937(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_938(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_939(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_940(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_941(int a0, long a1) throws Throwable;
private static native moom.eh __sourceUninitializedNEW720005_942() throws Throwable;
private static native void __explicitNewInit720005_944(moom.eh a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_945(moom.eh a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_946(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_947(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.ey __sourceUninitializedNEW720005_948() throws Throwable;
private static native void __explicitNewInit720005_950(moom.ey a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_951(moom.ey a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_952(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_953() throws Throwable;
private static native net.minecraft.block.Block __call720005_954(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_955(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic720005_956(int a0, long a1) throws Throwable;
private static native void __call720005_957(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_958(int a0, long a1) throws Throwable;
private static native moom.dE __sourceUninitializedNEW720005_959() throws Throwable;
private static native moom.fn __fieldRead720005_961() throws Throwable;
private static native moom.fm __fieldRead720005_962() throws Throwable;
private static native void __explicitNewInit720005_963(moom.dE a0, moom.fn a1, moom.fm a2, net.minecraft.block.Block a3) throws Throwable;
private static native net.minecraft.block.Block __call720005_964(moom.dE a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_965() throws Throwable;
private static native net.minecraft.block.Block __call720005_966(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_967(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_968(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_969(int a0, long a1) throws Throwable;
private static native moom.dE __sourceUninitializedNEW720005_970() throws Throwable;
private static native moom.fn __fieldRead720005_972() throws Throwable;
private static native moom.fm __fieldRead720005_973() throws Throwable;
private static native void __explicitNewInit720005_974(moom.dE a0, moom.fn a1, moom.fm a2, net.minecraft.block.Block a3) throws Throwable;
private static native net.minecraft.block.Block __call720005_975(moom.dE a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_976() throws Throwable;
private static native net.minecraft.block.Block __call720005_977(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_978(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_979(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_980(int a0, long a1) throws Throwable;
private static native moom.dV __sourceUninitializedNEW720005_981() throws Throwable;
private static native moom.fn __fieldRead720005_983() throws Throwable;
private static native void __explicitNewInit720005_984(moom.dV a0, moom.fn a1, boolean a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_985(moom.dV a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_986(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_987() throws Throwable;
private static native net.minecraft.block.Block __call720005_988(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_989(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_990(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_991(int a0, long a1) throws Throwable;
private static native moom.dV __sourceUninitializedNEW720005_992() throws Throwable;
private static native moom.fn __fieldRead720005_994() throws Throwable;
private static native void __explicitNewInit720005_995(moom.dV a0, moom.fn a1, boolean a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_996(moom.dV a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_997() throws Throwable;
private static native net.minecraft.block.Block __call720005_998(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_999(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1000(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.dO __sourceUninitializedNEW720005_1001() throws Throwable;
private static native void __explicitNewInit720005_1003(moom.dO a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1004(moom.dO a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1005() throws Throwable;
private static native net.minecraft.block.Block __call720005_1006(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1007(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic720005_1008(int a0, long a1) throws Throwable;
private static native void __call720005_1009(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1010(int a0, long a1) throws Throwable;
private static native moom.cH __sourceUninitializedNEW720005_1011() throws Throwable;
private static native void __explicitNewInit720005_1013(moom.cH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1014(moom.cH a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1015() throws Throwable;
private static native net.minecraft.block.Block __call720005_1016(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1017(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1018(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1019(int a0, long a1) throws Throwable;
private static native moom.cH __sourceUninitializedNEW720005_1020() throws Throwable;
private static native void __explicitNewInit720005_1022(moom.cH a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1023(moom.cH a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1024() throws Throwable;
private static native net.minecraft.block.Block __call720005_1025(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1026(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1027(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1028(int a0, long a1) throws Throwable;
private static native moom.eF __sourceUninitializedNEW720005_1029() throws Throwable;
private static native void __explicitNewInit720005_1031(moom.eF a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1032(moom.eF a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1033() throws Throwable;
private static native net.minecraft.block.Block __call720005_1034(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1035(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1036(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1037(int a0, long a1) throws Throwable;
private static native moom.dk __sourceUninitializedNEW720005_1038() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1040() throws Throwable;
private static native void __explicitNewInit720005_1041(moom.dk a0, net.minecraft.block.BlockPlanks$EnumType a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1042(moom.dk a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1043(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1044() throws Throwable;
private static native net.minecraft.block.Block __call720005_1045(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1046(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1047(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1048(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1049() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1051(net.minecraft.block.Block a0) throws Throwable;
private static native void __explicitNewInit720005_1052(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1053(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1054(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1055(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1056() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1058(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_1059() throws Throwable;
private static native net.minecraft.block.BlockStoneBrick$EnumType __fieldRead720005_1060() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1061(net.minecraft.block.state.IBlockState a0, moom.fw a1, net.minecraft.block.BlockStoneBrick$EnumType a2) throws Throwable;
private static native void __explicitNewInit720005_1062(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1063(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1064(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1065(int a0, long a1) throws Throwable;
private static native moom.dP __sourceUninitializedNEW720005_1066() throws Throwable;
private static native void __explicitNewInit720005_1068(moom.dP a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1069(moom.dP a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1070() throws Throwable;
private static native net.minecraft.block.Block __call720005_1071(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1072(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1073(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1074(int a0, long a1) throws Throwable;
private static native moom.cD __sourceUninitializedNEW720005_1075() throws Throwable;
private static native void __explicitNewInit720005_1077(moom.cD a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1078(moom.cD a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1079() throws Throwable;
private static native net.minecraft.block.Block __call720005_1080(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1081(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1082(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.dQ __sourceUninitializedNEW720005_1083() throws Throwable;
private static native void __explicitNewInit720005_1085(moom.dQ a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1086(moom.dQ a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1087(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1088() throws Throwable;
private static native net.minecraft.block.Block __call720005_1089(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1090(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_1091() throws Throwable;
private static native net.minecraft.block.Block __call720005_1092(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native int __invokedynamic720005_1093(int a0, long a1) throws Throwable;
private static native void __call720005_1094(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1095(int a0, long a1) throws Throwable;
private static native moom.dz __sourceUninitializedNEW720005_1096() throws Throwable;
private static native moom.fn __fieldRead720005_1098() throws Throwable;
private static native moom.fm __fieldRead720005_1099() throws Throwable;
private static native void __explicitNewInit720005_1100(moom.dz a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1101(moom.dz a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1102(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1103() throws Throwable;
private static native net.minecraft.block.Block __call720005_1104(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1105(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1106(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1107(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1108() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1110(net.minecraft.block.Block a0) throws Throwable;
private static native void __explicitNewInit720005_1111(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1112(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1113(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1114(int a0, long a1) throws Throwable;
private static native moom.cF __sourceUninitializedNEW720005_1115() throws Throwable;
private static native void __explicitNewInit720005_1117(moom.cF a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1118(moom.cF a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1119(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1120(int a0, long a1) throws Throwable;
private static native moom.c4 __sourceUninitializedNEW720005_1121() throws Throwable;
private static native void __explicitNewInit720005_1123(moom.c4 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1124(moom.c4 a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1125(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1126(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1127(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1128(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockBrewingStand __sourceUninitializedNEW720005_1129() throws Throwable;
private static native void __explicitNewInit720005_1131(net.minecraft.block.BlockBrewingStand a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1132(net.minecraft.block.BlockBrewingStand a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1133(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1134(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1135(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1136(int a0, long a1) throws Throwable;
private static native moom.cP __sourceUninitializedNEW720005_1137() throws Throwable;
private static native void __explicitNewInit720005_1139(moom.cP a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1140(moom.cP a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1141(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1142(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1143(int a0, long a1) throws Throwable;
private static native moom.c5 __sourceUninitializedNEW720005_1144() throws Throwable;
private static native moom.fn __fieldRead720005_1146() throws Throwable;
private static native void __explicitNewInit720005_1147(moom.c5 a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1148(moom.c5 a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1149(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native void __call720005_1150(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1151(int a0, long a1) throws Throwable;
private static native moom.dt __sourceUninitializedNEW720005_1152() throws Throwable;
private static native void __explicitNewInit720005_1154(moom.dt a0) throws Throwable;
private static native moom.eJ __fieldRead720005_1155() throws Throwable;
private static native net.minecraft.block.Block __call720005_1156(moom.dt a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1157(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1158(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1159(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1160(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_1161() throws Throwable;
private static native net.minecraft.block.Block __call720005_1162(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_1163(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1164(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_1165() throws Throwable;
private static native moom.fn __fieldRead720005_1167() throws Throwable;
private static native moom.fm __fieldRead720005_1168() throws Throwable;
private static native void __explicitNewInit720005_1169(net.minecraft.block.Block a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1170(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1171(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1172() throws Throwable;
private static native net.minecraft.block.Block __call720005_1173(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1174(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_1175() throws Throwable;
private static native net.minecraft.block.Block __call720005_1176(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_1177(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1178(int a0, long a1) throws Throwable;
private static native moom.ds __sourceUninitializedNEW720005_1179() throws Throwable;
private static native void __explicitNewInit720005_1181(moom.ds a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1182(moom.ds a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1183(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1184() throws Throwable;
private static native net.minecraft.block.Block __call720005_1185(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1186(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1187(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1188(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1189(int a0, long a1) throws Throwable;
private static native moom.d7 __sourceUninitializedNEW720005_1190() throws Throwable;
private static native void __explicitNewInit720005_1192(moom.d7 a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1193(moom.d7 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1194() throws Throwable;
private static native net.minecraft.block.Block __call720005_1195(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1196(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_1197() throws Throwable;
private static native net.minecraft.block.Block __call720005_1198(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_1199(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1200(int a0, long a1) throws Throwable;
private static native moom.d7 __sourceUninitializedNEW720005_1201() throws Throwable;
private static native void __explicitNewInit720005_1203(moom.d7 a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1204(moom.d7 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1205() throws Throwable;
private static native net.minecraft.block.Block __call720005_1206(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1207(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1208(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1209(int a0, long a1) throws Throwable;
private static native moom.eq __sourceUninitializedNEW720005_1210() throws Throwable;
private static native void __explicitNewInit720005_1212(moom.eq a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1213(moom.eq a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1214(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1215() throws Throwable;
private static native net.minecraft.block.Block __call720005_1216(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1217(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1218(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1219(int a0, long a1) throws Throwable;
private static native moom.er __sourceUninitializedNEW720005_1220() throws Throwable;
private static native void __explicitNewInit720005_1222(moom.er a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1223(moom.er a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1224(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1225() throws Throwable;
private static native net.minecraft.block.Block __call720005_1226(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1227(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1228(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1229(int a0, long a1) throws Throwable;
private static native moom.dj __sourceUninitializedNEW720005_1230() throws Throwable;
private static native void __explicitNewInit720005_1232(moom.dj a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1233(moom.dj a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1234(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1235() throws Throwable;
private static native net.minecraft.block.Block __call720005_1236(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1237(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1238(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1239(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1240() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1242(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_1243() throws Throwable;
private static native moom.ac __fieldRead720005_1244() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1245(net.minecraft.block.state.IBlockState a0, moom.fw a1, moom.ac a2) throws Throwable;
private static native void __explicitNewInit720005_1246(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1247(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1248(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1249(int a0, long a1) throws Throwable;
private static native moom.dT __sourceUninitializedNEW720005_1250() throws Throwable;
private static native void __explicitNewInit720005_1252(moom.dT a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1253(moom.dT a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1254(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1255() throws Throwable;
private static native net.minecraft.block.Block __call720005_1256(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1257(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1258(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1259(int a0, long a1) throws Throwable;
private static native moom.c6 __sourceUninitializedNEW720005_1260() throws Throwable;
private static native void __explicitNewInit720005_1262(moom.c6 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1263(moom.c6 a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1264(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1265() throws Throwable;
private static native net.minecraft.block.Block __call720005_1266(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1267(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1268(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native void __call720005_1269(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1270(int a0, long a1) throws Throwable;
private static native moom.eE __sourceUninitializedNEW720005_1271() throws Throwable;
private static native void __explicitNewInit720005_1273(moom.eE a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1274(moom.eE a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1275(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1276(int a0, long a1) throws Throwable;
private static native moom.eD __sourceUninitializedNEW720005_1277() throws Throwable;
private static native void __explicitNewInit720005_1279(moom.eD a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1280(moom.eD a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1281(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1282(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_1283() throws Throwable;
private static native moom.fn __fieldRead720005_1285() throws Throwable;
private static native moom.fm __fieldRead720005_1286() throws Throwable;
private static native void __explicitNewInit720005_1287(net.minecraft.block.Block a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1288(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1289(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1290() throws Throwable;
private static native net.minecraft.block.Block __call720005_1291(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1292(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_1293() throws Throwable;
private static native net.minecraft.block.Block __call720005_1294(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_1295(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1296(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1297() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1299(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_1300() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1301() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1302(net.minecraft.block.state.IBlockState a0, moom.fw a1, net.minecraft.block.BlockPlanks$EnumType a2) throws Throwable;
private static native void __explicitNewInit720005_1303(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1304(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1305(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1306(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1307() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1309(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_1310() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1311() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1312(net.minecraft.block.state.IBlockState a0, moom.fw a1, net.minecraft.block.BlockPlanks$EnumType a2) throws Throwable;
private static native void __explicitNewInit720005_1313(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1314(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1315(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1316(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1317() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1319(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_1320() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1321() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1322(net.minecraft.block.state.IBlockState a0, moom.fw a1, net.minecraft.block.BlockPlanks$EnumType a2) throws Throwable;
private static native void __explicitNewInit720005_1323(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1324(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1325(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1326(int a0, long a1) throws Throwable;
private static native moom.c0 __sourceUninitializedNEW720005_1327() throws Throwable;
private static native void __explicitNewInit720005_1329(moom.c0 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1330(moom.c0 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1331(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1332(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1333(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1334(int a0, long a1) throws Throwable;
private static native moom.cX __sourceUninitializedNEW720005_1335() throws Throwable;
private static native void __explicitNewInit720005_1337(moom.cX a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1338(moom.cX a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1339(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native void __call720005_1340(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1341(int a0, long a1) throws Throwable;
private static native moom.eG __sourceUninitializedNEW720005_1342() throws Throwable;
private static native void __explicitNewInit720005_1344(moom.eG a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1345(moom.eG a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1346(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1347(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockFlowerPot __sourceUninitializedNEW720005_1348() throws Throwable;
private static native void __explicitNewInit720005_1350(net.minecraft.block.BlockFlowerPot a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1351(net.minecraft.block.BlockFlowerPot a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1352() throws Throwable;
private static native net.minecraft.block.Block __call720005_1353(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1354(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1355(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1356(int a0, long a1) throws Throwable;
private static native moom.cw __sourceUninitializedNEW720005_1357() throws Throwable;
private static native void __explicitNewInit720005_1359(moom.cw a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1360(moom.cw a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1361(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1362(int a0, long a1) throws Throwable;
private static native moom.cx __sourceUninitializedNEW720005_1363() throws Throwable;
private static native void __explicitNewInit720005_1365(moom.cx a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1366(moom.cx a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1367(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1368(int a0, long a1) throws Throwable;
private static native moom.cL __sourceUninitializedNEW720005_1369() throws Throwable;
private static native void __explicitNewInit720005_1371(moom.cL a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1372(moom.cL a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1373() throws Throwable;
private static native net.minecraft.block.Block __call720005_1374(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1375(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1376(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1377(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockSkull __sourceUninitializedNEW720005_1378() throws Throwable;
private static native void __explicitNewInit720005_1380(net.minecraft.block.BlockSkull a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1381(net.minecraft.block.BlockSkull a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1382() throws Throwable;
private static native net.minecraft.block.Block __call720005_1383(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1384(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1385(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1386(int a0, long a1) throws Throwable;
private static native moom.dv __sourceUninitializedNEW720005_1387() throws Throwable;
private static native void __explicitNewInit720005_1389(moom.dv a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1390(moom.dv a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1391() throws Throwable;
private static native net.minecraft.block.Block __call720005_1392(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1393(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1394(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1395(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1396(int a0, long a1) throws Throwable;
private static native moom.cZ __sourceUninitializedNEW720005_1397() throws Throwable;
private static native void __explicitNewInit720005_1399(moom.cZ a0, int a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1400(moom.cZ a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1401() throws Throwable;
private static native net.minecraft.block.Block __call720005_1402(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1403(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1404(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1405(int a0, long a1) throws Throwable;
private static native moom.cm __sourceUninitializedNEW720005_1406() throws Throwable;
private static native moom.fn __fieldRead720005_1408() throws Throwable;
private static native int __invokedynamic720005_1409(int a0, long a1) throws Throwable;
private static native moom.fm __fieldRead720005_1410() throws Throwable;
private static native void __explicitNewInit720005_1411(moom.cm a0, moom.fn a1, int a2, moom.fm a3) throws Throwable;
private static native net.minecraft.block.Block __call720005_1412(moom.cm a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1413() throws Throwable;
private static native net.minecraft.block.Block __call720005_1414(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1415(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1416(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1417(int a0, long a1) throws Throwable;
private static native moom.cm __sourceUninitializedNEW720005_1418() throws Throwable;
private static native moom.fn __fieldRead720005_1420() throws Throwable;
private static native int __invokedynamic720005_1421(int a0, long a1) throws Throwable;
private static native void __explicitNewInit720005_1422(moom.cm a0, moom.fn a1, int a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1423(moom.cm a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1424() throws Throwable;
private static native net.minecraft.block.Block __call720005_1425(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1426(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1427(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1428(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockRedstoneComparator __sourceUninitializedNEW720005_1429() throws Throwable;
private static native void __explicitNewInit720005_1431(net.minecraft.block.BlockRedstoneComparator a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1432(net.minecraft.block.BlockRedstoneComparator a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1433() throws Throwable;
private static native net.minecraft.block.Block __call720005_1434(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1435(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1436(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1437(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1438(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockRedstoneComparator __sourceUninitializedNEW720005_1439() throws Throwable;
private static native void __explicitNewInit720005_1441(net.minecraft.block.BlockRedstoneComparator a0, boolean a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1442(net.minecraft.block.BlockRedstoneComparator a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1443(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1444() throws Throwable;
private static native net.minecraft.block.Block __call720005_1445(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1446(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1447(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1448(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1449(int a0, long a1) throws Throwable;
private static native moom.c1 __sourceUninitializedNEW720005_1450() throws Throwable;
private static native void __explicitNewInit720005_1452(moom.c1 a0, boolean a1) throws Throwable;
private static native void __call720005_1453(int a0, java.lang.String a1, moom.c1 a2) throws Throwable;
private static native int __invokedynamic720005_1454(int a0, long a1) throws Throwable;
private static native moom.cS __sourceUninitializedNEW720005_1455() throws Throwable;
private static native moom.fn __fieldRead720005_1457() throws Throwable;
private static native moom.fm __fieldRead720005_1458() throws Throwable;
private static native void __explicitNewInit720005_1459(moom.cS a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1460(moom.cS a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1461(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1462() throws Throwable;
private static native net.minecraft.block.Block __call720005_1463(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1464(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_1465() throws Throwable;
private static native net.minecraft.block.Block __call720005_1466(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_1467(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1468(int a0, long a1) throws Throwable;
private static native moom.dT __sourceUninitializedNEW720005_1469() throws Throwable;
private static native moom.fm __fieldRead720005_1471() throws Throwable;
private static native void __explicitNewInit720005_1472(moom.dT a0, moom.fm a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1473(moom.dT a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1474(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1475() throws Throwable;
private static native net.minecraft.block.Block __call720005_1476(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1477(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1478(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1479(int a0, long a1) throws Throwable;
private static native moom.c9 __sourceUninitializedNEW720005_1480() throws Throwable;
private static native void __explicitNewInit720005_1482(moom.c9 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1483(moom.c9 a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1484(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1485() throws Throwable;
private static native net.minecraft.block.Block __call720005_1486(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1487(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1488(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.d1 __sourceUninitializedNEW720005_1489() throws Throwable;
private static native void __explicitNewInit720005_1491(moom.d1 a0) throws Throwable;
private static native moom.eJ __fieldRead720005_1492() throws Throwable;
private static native net.minecraft.block.Block __call720005_1493(moom.d1 a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1494(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1495(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic720005_1496(int a0, long a1) throws Throwable;
private static native void __call720005_1497(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1498(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1499() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1501(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_1502() throws Throwable;
private static native net.minecraft.block.BlockQuartz$EnumType __fieldRead720005_1503() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1504(net.minecraft.block.state.IBlockState a0, moom.fw a1, net.minecraft.block.BlockQuartz$EnumType a2) throws Throwable;
private static native void __explicitNewInit720005_1505(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1506(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1507(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1508(int a0, long a1) throws Throwable;
private static native moom.d5 __sourceUninitializedNEW720005_1509() throws Throwable;
private static native void __explicitNewInit720005_1511(moom.d5 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1512(moom.d5 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1513() throws Throwable;
private static native net.minecraft.block.Block __call720005_1514(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1515(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1516(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1517(int a0, long a1) throws Throwable;
private static native moom.c3 __sourceUninitializedNEW720005_1518() throws Throwable;
private static native void __explicitNewInit720005_1520(moom.c3 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1521(moom.c3 a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1522() throws Throwable;
private static native net.minecraft.block.Block __call720005_1523(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1524(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1525(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1526(int a0, long a1) throws Throwable;
private static native moom.cR __sourceUninitializedNEW720005_1527() throws Throwable;
private static native moom.fn __fieldRead720005_1529() throws Throwable;
private static native void __explicitNewInit720005_1530(moom.cR a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1531(moom.cR a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1532(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1533() throws Throwable;
private static native net.minecraft.block.Block __call720005_1534(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1535(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1536(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1537(int a0, long a1) throws Throwable;
private static native moom.dW __sourceUninitializedNEW720005_1538() throws Throwable;
private static native void __explicitNewInit720005_1540(moom.dW a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1541(moom.dW a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1542() throws Throwable;
private static native net.minecraft.block.Block __call720005_1543(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1544(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1545(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1546(int a0, long a1) throws Throwable;
private static native moom.dI __sourceUninitializedNEW720005_1547() throws Throwable;
private static native void __explicitNewInit720005_1549(moom.dI a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1550(moom.dI a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1551(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1552(int a0, long a1) throws Throwable;
private static native moom.ed __sourceUninitializedNEW720005_1553() throws Throwable;
private static native void __explicitNewInit720005_1555(moom.ed a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1556(moom.ed a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1557(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1558(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1559() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1561(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_1562() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1563() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1564(net.minecraft.block.state.IBlockState a0, moom.fw a1, net.minecraft.block.BlockPlanks$EnumType a2) throws Throwable;
private static native void __explicitNewInit720005_1565(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1566(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1567(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1568(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1569() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1571(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_1572() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1573() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1574(net.minecraft.block.state.IBlockState a0, moom.fw a1, net.minecraft.block.BlockPlanks$EnumType a2) throws Throwable;
private static native void __explicitNewInit720005_1575(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1576(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1577(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1578(int a0, long a1) throws Throwable;
private static native moom.cs __sourceUninitializedNEW720005_1579() throws Throwable;
private static native void __explicitNewInit720005_1581(moom.cs a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1582(moom.cs a0, java.lang.String a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1583() throws Throwable;
private static native net.minecraft.block.Block __call720005_1584(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native void __call720005_1585(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1586(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockBarrier __sourceUninitializedNEW720005_1587() throws Throwable;
private static native void __explicitNewInit720005_1589(net.minecraft.block.BlockBarrier a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1590(net.minecraft.block.BlockBarrier a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1591(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1592(int a0, long a1) throws Throwable;
private static native moom.eC __sourceUninitializedNEW720005_1593() throws Throwable;
private static native moom.fn __fieldRead720005_1595() throws Throwable;
private static native void __explicitNewInit720005_1596(moom.eC a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1597(moom.eC a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1598() throws Throwable;
private static native net.minecraft.block.Block __call720005_1599(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1600(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1601(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1602(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1603(int a0, long a1) throws Throwable;
private static native moom.d0 __sourceUninitializedNEW720005_1604() throws Throwable;
private static native void __explicitNewInit720005_1606(moom.d0 a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1607(moom.d0 a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1608(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1609() throws Throwable;
private static native net.minecraft.block.Block __call720005_1610(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1611(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1612(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1613(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockSeaLantern __sourceUninitializedNEW720005_1614() throws Throwable;
private static native moom.fn __fieldRead720005_1616() throws Throwable;
private static native void __explicitNewInit720005_1617(net.minecraft.block.BlockSeaLantern a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1618(net.minecraft.block.BlockSeaLantern a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1619() throws Throwable;
private static native net.minecraft.block.Block __call720005_1620(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1621(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1622(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1623(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1624(int a0, long a1) throws Throwable;
private static native moom.eb __sourceUninitializedNEW720005_1625() throws Throwable;
private static native void __explicitNewInit720005_1627(moom.eb a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1628(moom.eb a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1629() throws Throwable;
private static native net.minecraft.block.Block __call720005_1630(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1631(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_1632() throws Throwable;
private static native net.minecraft.block.Block __call720005_1633(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_1634(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1635(int a0, long a1) throws Throwable;
private static native moom.cO __sourceUninitializedNEW720005_1636() throws Throwable;
private static native void __explicitNewInit720005_1638(moom.cO a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1639(moom.cO a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1640() throws Throwable;
private static native net.minecraft.block.Block __call720005_1641(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1642(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1643(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native void __call720005_1644(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1645(int a0, long a1) throws Throwable;
private static native moom.dD __sourceUninitializedNEW720005_1646() throws Throwable;
private static native void __explicitNewInit720005_1648(moom.dD a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1649(moom.dD a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1650(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1651() throws Throwable;
private static native net.minecraft.block.Block __call720005_1652(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1653(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1654(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1655(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __sourceUninitializedNEW720005_1656() throws Throwable;
private static native moom.fn __fieldRead720005_1658() throws Throwable;
private static native moom.fm __fieldRead720005_1659() throws Throwable;
private static native void __explicitNewInit720005_1660(net.minecraft.block.Block a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1661(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1662(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1663() throws Throwable;
private static native net.minecraft.block.Block __call720005_1664(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1665(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.creativetab.CreativeTabs __fieldRead720005_1666() throws Throwable;
private static native net.minecraft.block.Block __call720005_1667(net.minecraft.block.Block a0, net.minecraft.creativetab.CreativeTabs a1) throws Throwable;
private static native void __call720005_1668(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1669(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockPackedIce __sourceUninitializedNEW720005_1670() throws Throwable;
private static native void __explicitNewInit720005_1672(net.minecraft.block.BlockPackedIce a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1673(net.minecraft.block.BlockPackedIce a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1674() throws Throwable;
private static native net.minecraft.block.Block __call720005_1675(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1676(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1677(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1678(int a0, long a1) throws Throwable;
private static native moom.cz __sourceUninitializedNEW720005_1679() throws Throwable;
private static native void __explicitNewInit720005_1681(moom.cz a0) throws Throwable;
private static native void __call720005_1682(int a0, java.lang.String a1, moom.cz a2) throws Throwable;
private static native int __invokedynamic720005_1683(int a0, long a1) throws Throwable;
private static native moom.cW __sourceUninitializedNEW720005_1684() throws Throwable;
private static native void __explicitNewInit720005_1686(moom.cW a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1687(moom.cW a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1688() throws Throwable;
private static native net.minecraft.block.Block __call720005_1689(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1690(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1691(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1692(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1693(int a0, long a1) throws Throwable;
private static native moom.cV __sourceUninitializedNEW720005_1694() throws Throwable;
private static native void __explicitNewInit720005_1696(moom.cV a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1697(moom.cV a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1698() throws Throwable;
private static native net.minecraft.block.Block __call720005_1699(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1700(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1701(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1702(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1703(int a0, long a1) throws Throwable;
private static native moom.c1 __sourceUninitializedNEW720005_1704() throws Throwable;
private static native void __explicitNewInit720005_1706(moom.c1 a0, boolean a1) throws Throwable;
private static native void __call720005_1707(int a0, java.lang.String a1, moom.c1 a2) throws Throwable;
private static native moom.d6 __sourceUninitializedNEW720005_1708() throws Throwable;
private static native void __explicitNewInit720005_1710(moom.d6 a0) throws Throwable;
private static native moom.eJ __fieldRead720005_1711() throws Throwable;
private static native net.minecraft.block.Block __call720005_1712(moom.d6 a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1713(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1714(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic720005_1715(int a0, long a1) throws Throwable;
private static native void __call720005_1716(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1717(int a0, long a1) throws Throwable;
private static native moom.ew __sourceUninitializedNEW720005_1718() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1720(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fw __fieldRead720005_1721() throws Throwable;
private static native moom.Y __fieldRead720005_1722() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call720005_1723(net.minecraft.block.state.IBlockState a0, moom.fw a1, moom.Y a2) throws Throwable;
private static native void __explicitNewInit720005_1724(moom.ew a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1725(moom.ew a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1726(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1727(int a0, long a1) throws Throwable;
private static native moom.en __sourceUninitializedNEW720005_1728() throws Throwable;
private static native void __explicitNewInit720005_1730(moom.en a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1731(moom.en a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1732(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1733() throws Throwable;
private static native net.minecraft.block.Block __call720005_1734(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1735(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1736(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1737(int a0, long a1) throws Throwable;
private static native moom.eo __sourceUninitializedNEW720005_1738() throws Throwable;
private static native void __explicitNewInit720005_1740(moom.eo a0) throws Throwable;
private static native net.minecraft.block.Block __call720005_1741(moom.eo a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1742(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1743() throws Throwable;
private static native net.minecraft.block.Block __call720005_1744(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1745(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1746(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1747(int a0, long a1) throws Throwable;
private static native moom.dk __sourceUninitializedNEW720005_1748() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1750() throws Throwable;
private static native void __explicitNewInit720005_1751(moom.dk a0, net.minecraft.block.BlockPlanks$EnumType a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1752(moom.dk a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1753(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1754() throws Throwable;
private static native net.minecraft.block.Block __call720005_1755(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1756(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1757(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1758(int a0, long a1) throws Throwable;
private static native moom.dk __sourceUninitializedNEW720005_1759() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1761() throws Throwable;
private static native void __explicitNewInit720005_1762(moom.dk a0, net.minecraft.block.BlockPlanks$EnumType a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1763(moom.dk a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1764(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1765() throws Throwable;
private static native net.minecraft.block.Block __call720005_1766(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1767(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1768(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1769(int a0, long a1) throws Throwable;
private static native moom.dk __sourceUninitializedNEW720005_1770() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1772() throws Throwable;
private static native void __explicitNewInit720005_1773(moom.dk a0, net.minecraft.block.BlockPlanks$EnumType a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1774(moom.dk a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1775(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1776() throws Throwable;
private static native net.minecraft.block.Block __call720005_1777(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1778(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1779(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1780(int a0, long a1) throws Throwable;
private static native moom.dk __sourceUninitializedNEW720005_1781() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1783() throws Throwable;
private static native void __explicitNewInit720005_1784(moom.dk a0, net.minecraft.block.BlockPlanks$EnumType a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1785(moom.dk a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1786(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1787() throws Throwable;
private static native net.minecraft.block.Block __call720005_1788(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1789(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1790(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1791(int a0, long a1) throws Throwable;
private static native moom.dk __sourceUninitializedNEW720005_1792() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1794() throws Throwable;
private static native void __explicitNewInit720005_1795(moom.dk a0, net.minecraft.block.BlockPlanks$EnumType a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1796(moom.dk a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1797(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1798() throws Throwable;
private static native net.minecraft.block.Block __call720005_1799(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1800(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1801(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1802(int a0, long a1) throws Throwable;
private static native moom.dz __sourceUninitializedNEW720005_1803() throws Throwable;
private static native moom.fn __fieldRead720005_1805() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1806() throws Throwable;
private static native moom.fm __call720005_1807(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native void __explicitNewInit720005_1808(moom.dz a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1809(moom.dz a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1810(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1811() throws Throwable;
private static native net.minecraft.block.Block __call720005_1812(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1813(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1814(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1815(int a0, long a1) throws Throwable;
private static native moom.dz __sourceUninitializedNEW720005_1816() throws Throwable;
private static native moom.fn __fieldRead720005_1818() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1819() throws Throwable;
private static native moom.fm __call720005_1820(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native void __explicitNewInit720005_1821(moom.dz a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1822(moom.dz a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1823(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1824() throws Throwable;
private static native net.minecraft.block.Block __call720005_1825(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1826(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1827(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1828(int a0, long a1) throws Throwable;
private static native moom.dz __sourceUninitializedNEW720005_1829() throws Throwable;
private static native moom.fn __fieldRead720005_1831() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1832() throws Throwable;
private static native moom.fm __call720005_1833(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native void __explicitNewInit720005_1834(moom.dz a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1835(moom.dz a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1836(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1837() throws Throwable;
private static native net.minecraft.block.Block __call720005_1838(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1839(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1840(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1841(int a0, long a1) throws Throwable;
private static native moom.dz __sourceUninitializedNEW720005_1842() throws Throwable;
private static native moom.fn __fieldRead720005_1844() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1845() throws Throwable;
private static native moom.fm __call720005_1846(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native void __explicitNewInit720005_1847(moom.dz a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1848(moom.dz a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1849(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1850() throws Throwable;
private static native net.minecraft.block.Block __call720005_1851(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1852(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1853(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1854(int a0, long a1) throws Throwable;
private static native moom.dz __sourceUninitializedNEW720005_1855() throws Throwable;
private static native moom.fn __fieldRead720005_1857() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead720005_1858() throws Throwable;
private static native moom.fm __call720005_1859(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native void __explicitNewInit720005_1860(moom.dz a0, moom.fn a1, moom.fm a2) throws Throwable;
private static native net.minecraft.block.Block __call720005_1861(moom.dz a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1862(net.minecraft.block.Block a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1863() throws Throwable;
private static native net.minecraft.block.Block __call720005_1864(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1865(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native void __call720005_1866(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1867(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockDoor __sourceUninitializedNEW720005_1868() throws Throwable;
private static native moom.fn __fieldRead720005_1870() throws Throwable;
private static native void __explicitNewInit720005_1871(net.minecraft.block.BlockDoor a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1872(net.minecraft.block.BlockDoor a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1873() throws Throwable;
private static native net.minecraft.block.Block __call720005_1874(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1875(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1876(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1877(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1878(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockDoor __sourceUninitializedNEW720005_1879() throws Throwable;
private static native moom.fn __fieldRead720005_1881() throws Throwable;
private static native void __explicitNewInit720005_1882(net.minecraft.block.BlockDoor a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1883(net.minecraft.block.BlockDoor a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1884() throws Throwable;
private static native net.minecraft.block.Block __call720005_1885(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1886(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1887(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1888(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1889(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockDoor __sourceUninitializedNEW720005_1890() throws Throwable;
private static native moom.fn __fieldRead720005_1892() throws Throwable;
private static native void __explicitNewInit720005_1893(net.minecraft.block.BlockDoor a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1894(net.minecraft.block.BlockDoor a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1895() throws Throwable;
private static native net.minecraft.block.Block __call720005_1896(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1897(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1898(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1899(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1900(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockDoor __sourceUninitializedNEW720005_1901() throws Throwable;
private static native moom.fn __fieldRead720005_1903() throws Throwable;
private static native void __explicitNewInit720005_1904(net.minecraft.block.BlockDoor a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1905(net.minecraft.block.BlockDoor a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1906() throws Throwable;
private static native net.minecraft.block.Block __call720005_1907(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1908(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1909(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1910(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native int __invokedynamic720005_1911(int a0, long a1) throws Throwable;
private static native net.minecraft.block.BlockDoor __sourceUninitializedNEW720005_1912() throws Throwable;
private static native moom.fn __fieldRead720005_1914() throws Throwable;
private static native void __explicitNewInit720005_1915(net.minecraft.block.BlockDoor a0, moom.fn a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1916(net.minecraft.block.BlockDoor a0, float a1) throws Throwable;
private static native moom.eJ __fieldRead720005_1917() throws Throwable;
private static native net.minecraft.block.Block __call720005_1918(net.minecraft.block.Block a0, moom.eJ a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1919(net.minecraft.block.Block a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call720005_1920(net.minecraft.block.Block a0) throws Throwable;
private static native void __call720005_1921(int a0, java.lang.String a1, net.minecraft.block.Block a2) throws Throwable;
private static native moom.DC __fieldRead720005_1922() throws Throwable;
private static native void __call720005_1923(moom.DC a0) throws Throwable;
private static native moom.DC __fieldRead720005_1924() throws Throwable;
private static native java.util.Iterator __call720005_1925(moom.DC a0) throws Throwable;
private static native boolean __call720005_1926(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720005_1927(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.block.Block __cast720005_1928(java.lang.Object a0) throws Throwable;
private static native moom.fn __fieldRead720005_1929(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead720005_1930() throws Throwable;
private static native void __fieldWrite720005_1931(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native void __call720005_1932(java.lang.String[] a0) throws Throwable;
private static native int __instanceOf720005_1933(net.minecraft.block.Block a0) throws Throwable;
private static native int __instanceOf720005_1934(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __fieldRead720005_1935(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory720005_1936(boolean value) throws Throwable;
private static native int __fieldRead720005_1937(net.minecraft.block.Block a0) throws Throwable;
private static native void __fieldWrite720005_1938(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native moom.DC __fieldRead720005_1939() throws Throwable;
private static native java.util.Iterator __call720005_1940(moom.DC a0) throws Throwable;
private static native boolean __call720005_1941(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720005_1942(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.block.Block __cast720005_1943(java.lang.Object a0) throws Throwable;
private static native moom.fA __call720005_1944(net.minecraft.block.Block a0) throws Throwable;
private static native com.google.common.collect.ImmutableList __call720005_1945(moom.fA a0) throws Throwable;
private static native com.google.common.collect.UnmodifiableIterator __call720005_1946(com.google.common.collect.ImmutableList a0) throws Throwable;
private static native boolean __call720005_1947(com.google.common.collect.UnmodifiableIterator a0) throws Throwable;
private static native java.lang.Object __call720005_1948(com.google.common.collect.UnmodifiableIterator a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __cast720005_1949(java.lang.Object a0) throws Throwable;
private static native moom.DC __fieldRead720005_1950() throws Throwable;
private static native int __call720005_1951(moom.DC a0, net.minecraft.block.Block a1) throws Throwable;
private static native int __call720005_1952(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native moom.Dx __fieldRead720005_1953() throws Throwable;
private static native void __call720005_1954(moom.Dx a0, net.minecraft.block.state.IBlockState a1, int a2) throws Throwable;
private static native net.minecraft.block.Block __cast720005_1955(java.lang.Object a0) throws Throwable;
private static native moom.fA __call720005_1956(net.minecraft.block.Block a0) throws Throwable;
private static native com.google.common.collect.ImmutableList __call720005_1957(moom.fA a0) throws Throwable;
private static native com.google.common.collect.UnmodifiableIterator __call720005_1958(com.google.common.collect.ImmutableList a0) throws Throwable;
private static native boolean __call720005_1959(com.google.common.collect.UnmodifiableIterator a0) throws Throwable;
private static native java.lang.Object __call720005_1960(com.google.common.collect.UnmodifiableIterator a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __cast720005_1961(java.lang.Object a0) throws Throwable;
private static native moom.DC __fieldRead720005_1962() throws Throwable;
private static native int __call720005_1963(moom.DC a0, net.minecraft.block.Block a1) throws Throwable;
private static native int __call720005_1964(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native moom.Dx __fieldRead720005_1965() throws Throwable;
private static native void __call720005_1966(moom.Dx a0, net.minecraft.block.state.IBlockState a1, int a2) throws Throwable;
private static native boolean __call720005_1967(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call720005_1968(java.util.Iterator a0) throws Throwable;

}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1738_2(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(this))));
}


public boolean i() {
return ((((this.A) ? 1 : 0)) != 0);
}


public final int b(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return ((net.minecraft.block.Block)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((int)(0)));
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
return 0;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch())).J)).f__Boolean())) != 0);
}


public moom.fA b__fA() {
return this.M;
}


protected net.minecraft.block.Block b(float p0) {
this.x = ((float)((p0 * 0x1.8p1f)));
    return this;
}


protected net.minecraft.block.Block b(int p0) {
this.s = ((int)(p0));
    return this;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
return;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return;
}


protected net.minecraft.block.Block b__ch() {
this.y = ((boolean)(false));
    return this;
}


public net.minecraft.block.Block b(java.lang.String p0) {
this.O = ((java.lang.String)(p0));
    return this;
}


public java.lang.String b__String() {
return __sourceIntrinsic_d1398b4921c0_originalDynamicSite1739_1(this.O);
}


public boolean b(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
return (__sourceIntrinsic_booleanComparison((((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch())).a__fn())).b__Boolean())) != 0);
}


private boolean b(moom.DR p0) {
moom.DR forwardValue4631_11_0;
    int forwardValue4631_23_0;
    int forwardValue4631_31_0;
    int forwardValue4631_39_0;
    int forwardValue4631_43_0;
    int forwardValue4631_45_0;
    moom.DR spill4631_0;
    int spill4631_1;
    long life2_3;
    int[] life4_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_31: {
    forward_join_23: {
    forward_join_11: {
    life2_3 = (net.minecraft.block.Block.ab ^ 91314819039424L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4631_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue4631_11_0 = spill4631_0;
        break forward_join_11;
    }
    if (!((spill4631_0 != null))) {
        break forward_join_44;
    }
    forwardValue4631_11_0 = p0;
    }
    spill4631_1 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(forwardValue4631_11_0)).a)), ((double)(this.B)));
    if (!((life4_5 != null))) {
        forwardValue4631_23_0 = spill4631_1;
        break forward_join_23;
    }
    if (!((spill4631_1 >= 0))) {
        break forward_join_44;
    }
    forwardValue4631_23_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).a)), ((double)(this.E)));
    }
    if (!((life4_5 != null))) {
        forwardValue4631_31_0 = forwardValue4631_23_0;
        break forward_join_31;
    }
    if (!((forwardValue4631_23_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue4631_31_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(p0)).c)), ((double)(this.D)));
    }
    if (!((life4_5 != null))) {
        forwardValue4631_39_0 = forwardValue4631_31_0;
        break forward_join_39;
    }
    if (!((forwardValue4631_31_0 >= 0))) {
        break forward_join_44;
    }
    forwardValue4631_39_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).c)), ((double)(this.G)));
    }
    if (!((life4_5 != null))) {
        forwardValue4631_43_0 = forwardValue4631_39_0;
        break forward_join_43;
    }
    if (!((forwardValue4631_39_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue4631_43_0 = 1;
    }
    forwardValue4631_45_0 = forwardValue4631_43_0;
    break forward_join_45;
    }
    forwardValue4631_45_0 = 0;
    }
    return ((forwardValue4631_45_0) != 0);
}


public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
return 0;
}


public static java.lang.String[] b__ArrayString() {
return net.minecraft.block.Block.P;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.Block)(this)).a__fE();
}


public static void b(java.lang.String[] p0) {
P = ((java.lang.String[])(p0));
    return;
}


public static void b__Void() { __sourceHandlerCall_8ab5fec3f2317524a5c7(); }


public int b__Int() {
return this.u;
}


public boolean b__Boolean() {
return ((((this.t) ? 1 : 0)) != 0);
}


public int b(net.minecraft.block.state.IBlockState p0) {
long local2 = (net.minecraft.block.Block.ab ^ 4486335997415L);
    if ((p0 != null)) {
        if ((!((java.util.Collection)(((net.minecraft.block.state.IBlockState)(p0)).a__Collection())).isEmpty())) {
        throw new java.lang.IllegalArgumentException(__sourceIntrinsic_8db5871551d4_invokedynamic9914_3(p0));
    }
    }
    return 0;
}


public final double b() {
return this.E;
}


public boolean e__Boolean() {
int forwardValue4636_14_0;
    int forwardValue4636_19_0;
    int forwardValue4636_23_0;
    int forwardValue4636_25_0;
    boolean spill4636_0;
    long life1_3;
    int[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    forward_join_14: {
    life1_3 = (net.minecraft.block.Block.ab ^ 16020122346454L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4636_0 = ((moom.fn)(this.J)).g__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4636_14_0 = ((spill4636_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill4636_0)) {
        break forward_join_24;
    }
    forwardValue4636_14_0 = ((((net.minecraft.block.Block)(this)).g()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4636_19_0 = forwardValue4636_14_0;
        break forward_join_19;
    }
    if (!((forwardValue4636_14_0 != 0))) {
        break forward_join_24;
    }
    forwardValue4636_19_0 = ((((net.minecraft.block.Block)(this)).l()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4636_23_0 = forwardValue4636_19_0;
        break forward_join_23;
    }
    if (!((forwardValue4636_19_0 == 0))) {
        break forward_join_24;
    }
    forwardValue4636_23_0 = 1;
    }
    forwardValue4636_25_0 = forwardValue4636_23_0;
    break forward_join_25;
    }
    forwardValue4636_25_0 = 0;
    }
    return ((forwardValue4636_25_0) != 0);
}


public int e__Int() {
return ((moom.fn)(this.J)).a();
}


public final double e() {
return this.D;
}


public int c(net.minecraft.block.state.IBlockState p0) {
return 0;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
return;
}


private boolean c(moom.DR p0) {
moom.DR forwardValue4634_11_0;
    int forwardValue4634_23_0;
    int forwardValue4634_31_0;
    int forwardValue4634_39_0;
    int forwardValue4634_43_0;
    int forwardValue4634_45_0;
    moom.DR spill4634_0;
    int spill4634_1;
    long life2_3;
    int[] life4_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_31: {
    forward_join_23: {
    forward_join_11: {
    life2_3 = (net.minecraft.block.Block.ab ^ 29416118965451L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4634_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue4634_11_0 = spill4634_0;
        break forward_join_11;
    }
    if (!((spill4634_0 != null))) {
        break forward_join_44;
    }
    forwardValue4634_11_0 = p0;
    }
    spill4634_1 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(forwardValue4634_11_0)).a)), ((double)(this.B)));
    if (!((life4_5 != null))) {
        forwardValue4634_23_0 = spill4634_1;
        break forward_join_23;
    }
    if (!((spill4634_1 >= 0))) {
        break forward_join_44;
    }
    forwardValue4634_23_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).a)), ((double)(this.E)));
    }
    if (!((life4_5 != null))) {
        forwardValue4634_31_0 = forwardValue4634_23_0;
        break forward_join_31;
    }
    if (!((forwardValue4634_23_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue4634_31_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(p0)).b)), ((double)(this.C)));
    }
    if (!((life4_5 != null))) {
        forwardValue4634_39_0 = forwardValue4634_31_0;
        break forward_join_39;
    }
    if (!((forwardValue4634_31_0 >= 0))) {
        break forward_join_44;
    }
    forwardValue4634_39_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).b)), ((double)(this.F)));
    }
    if (!((life4_5 != null))) {
        forwardValue4634_43_0 = forwardValue4634_39_0;
        break forward_join_43;
    }
    if (!((forwardValue4634_39_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue4634_43_0 = 1;
    }
    forwardValue4634_45_0 = forwardValue4634_43_0;
    break forward_join_45;
    }
    forwardValue4634_45_0 = 0;
    }
    return ((forwardValue4634_45_0) != 0);
}


protected net.minecraft.block.Block c(float p0) {
net.minecraft.block.Block forwardValue4633_24_0;
    int[] spill4633_0;
    net.minecraft.block.Block spill4633_1;
    long life2_3;
    int[] life4_8;
    forward_join_24: {
    forward_join_23: {
    life2_3 = (net.minecraft.block.Block.ab ^ 19941285618417L);
    spill4633_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    this.w = ((float)(p0));
    life4_8 = spill4633_0;
    spill4633_1 = this;
    if (!((life4_8 != null))) {
        forwardValue4633_24_0 = spill4633_1;
        break forward_join_24;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.block.Block)(spill4633_1)).x)), ((float)((p0 * 0x1.4p2f)))) < 0))) {
        break forward_join_23;
    }
    this.x = ((float)((p0 * 0x1.4p2f)));
    }
    forwardValue4633_24_0 = this;
    }
    return forwardValue4633_24_0;
}


public boolean c__Boolean() {
return ((((this.v) ? 1 : 0)) != 0);
}


public int c__Int() {
return 3;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return;
}


public final double c() {
return this.C;
}


public boolean n() {
int forwardValue4639_15_0;
    int forwardValue4639_19_0;
    int forwardValue4639_21_0;
    boolean spill4639_0;
    long life1_3;
    int[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life1_3 = (net.minecraft.block.Block.ab ^ 64536758004928L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4639_0 = ((moom.fn)(this.J)).b__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4639_15_0 = ((spill4639_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill4639_0))) {
        break forward_join_20;
    }
    forwardValue4639_15_0 = ((((moom.fn)(this.J)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4639_19_0 = forwardValue4639_15_0;
        break forward_join_19;
    }
    if (!((forwardValue4639_15_0 == 0))) {
        break forward_join_20;
    }
    forwardValue4639_19_0 = 1;
    }
    forwardValue4639_21_0 = forwardValue4639_19_0;
    break forward_join_21;
    }
    forwardValue4639_21_0 = 0;
    }
    return ((forwardValue4639_21_0) != 0);
}


public boolean h() {
return ((((this.z) ? 1 : 0)) != 0);
}


public boolean f__Boolean() {
int forwardValue4637_14_0;
    int forwardValue4637_18_0;
    int forwardValue4637_20_0;
    boolean spill4637_0;
    long life1_3;
    int[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life1_3 = (net.minecraft.block.Block.ab ^ 75303874115462L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4637_0 = ((moom.fn)(this.J)).d__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4637_14_0 = ((spill4637_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill4637_0)) {
        break forward_join_19;
    }
    forwardValue4637_14_0 = ((((net.minecraft.block.Block)(this)).g()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4637_18_0 = forwardValue4637_14_0;
        break forward_join_18;
    }
    if (!((forwardValue4637_14_0 != 0))) {
        break forward_join_19;
    }
    forwardValue4637_18_0 = 1;
    }
    forwardValue4637_20_0 = forwardValue4637_18_0;
    break forward_join_20;
    }
    forwardValue4637_20_0 = 0;
    }
    return ((forwardValue4637_20_0) != 0);
}


public final double f() {
return this.G;
}


public boolean l() {
return ((0) != 0);
}


public final double d() {
return this.F;
}


public int d__Int() {
long local1 = (net.minecraft.block.Block.ab ^ 114518482993371L);
    return __sourceIntrinsic_c8a36ae237a7_originalDynamicSite1740_1(26092, (8133475093099858790L ^ local1));
}


public int d(net.minecraft.block.state.IBlockState p0) {
long local2 = (net.minecraft.block.Block.ab ^ 140071684345197L);
    return __sourceIntrinsic_ba4ebd9c343f_originalDynamicSite1741_1(26092, (8133500662927754960L ^ local2));
}


public boolean d__Boolean() {
int forwardValue4635_14_0;
    int forwardValue4635_18_0;
    int forwardValue4635_20_0;
    boolean spill4635_0;
    long life1_3;
    int[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life1_3 = (net.minecraft.block.Block.ab ^ 33523564493934L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4635_0 = ((moom.fn)(this.J)).d__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4635_14_0 = ((spill4635_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill4635_0)) {
        break forward_join_19;
    }
    forwardValue4635_14_0 = ((((net.minecraft.block.Block)(this)).g()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4635_18_0 = forwardValue4635_14_0;
        break forward_join_18;
    }
    if (!((forwardValue4635_14_0 != 0))) {
        break forward_join_19;
    }
    forwardValue4635_18_0 = 1;
    }
    forwardValue4635_20_0 = forwardValue4635_18_0;
    break forward_join_20;
    }
    forwardValue4635_20_0 = 0;
    }
    return ((forwardValue4635_20_0) != 0);
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
long local4 = (net.minecraft.block.Block.ab ^ 79088794083443L);
    return __sourceIntrinsic_cdd8da66b4ba_originalDynamicSite1742_1(1843, (236766043559741703L ^ local4));
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
return 0;
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_originalDynamicSite1743_1(((net.minecraft.block.Block)(this)).b__String()))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9921_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ch"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
net.minecraft.item.Item forwardValue4630_16_0;
    int forwardValue4630_23_0;
    int[] spill4630_0;
    net.minecraft.item.Item spill4630_1;
    boolean spill4630_2;
    long life2_3;
    int life5_6;
    net.minecraft.item.Item life6_9;
    int[] life4_10;
    forward_join_24: {
    forward_join_23: {
    forward_join_16: {
    life2_3 = (net.minecraft.block.Block.ab ^ 76689284165421L);
    spill4630_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life6_9 = __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(this)));
    life4_10 = spill4630_0;
    spill4630_1 = life6_9;
    if (!((life4_10 != null))) {
        forwardValue4630_16_0 = spill4630_1;
        break forward_join_16;
    }
    if (!((spill4630_1 != null))) {
        break forward_join_24;
    }
    forwardValue4630_16_0 = life6_9;
    }
    spill4630_2 = ((net.minecraft.item.Item)(forwardValue4630_16_0)).a__Boolean();
    if (!((life4_10 != null))) {
        forwardValue4630_23_0 = ((spill4630_2) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill4630_2)) {
        break forward_join_24;
    }
    forwardValue4630_23_0 = ((net.minecraft.block.Block)(this)).b(((net.minecraft.block.state.IBlockState)(p0)));
    }
    life5_6 = forwardValue4630_23_0;
    }
    return new net.minecraft.item.ItemStack(life6_9, 1, life5_6);
}


public int a(int p0, java.util.Random p1) {
return ((net.minecraft.block.Block)(this)).a(((java.util.Random)(p1)));
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
int forwardValue4627_39_0;
    int[] spill4627_0;
    boolean spill4627_1;
    boolean spill4627_2;
    long life6_3;
    int[] life8_11;
    net.minecraft.item.ItemStack life9_37;
    int life9_54;
    forward_join_46: {
    forward_join_39: {
    forward_join_37: {
    forward_join_35: {
    life6_3 = (net.minecraft.block.Block.ab ^ 100279489002614L);
    spill4627_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.BY)((net.minecraft.stats.StatList.ab)[__sourceExactCall_4be9acdbe11525(((net.minecraft.block.Block)(this)))])));
    life8_11 = spill4627_0;
    ((net.minecraft.entity.player.EntityPlayer)(p1)).h(((float)(0x1.99999ap-6f)));
    spill4627_1 = ((net.minecraft.block.Block)(this)).m();
    if (!((life8_11 != null))) {
        forwardValue4627_39_0 = ((spill4627_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill4627_1)) {
        break forward_join_37;
    }
    spill4627_2 = moom.rV.a__Boolean(((net.minecraft.entity.EntityLivingBase)(p1)));
    if (!((life8_11 != null))) {
        forwardValue4627_39_0 = ((spill4627_2) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill4627_2)) {
        break forward_join_37;
    }
    life9_37 = ((net.minecraft.block.Block)(this)).a__xW(((net.minecraft.block.state.IBlockState)(p3)));
    if (!((life9_37 != null))) {
        break forward_join_35;
    }
    __sourceExactCall_22126fbeda3024(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(life9_37)));
    }
    if (!((life8_11 == null))) {
        break forward_join_46;
    }
    }
    forwardValue4627_39_0 = moom.rV.d(((net.minecraft.entity.EntityLivingBase)(p1)));
    }
    life9_54 = forwardValue4627_39_0;
    ((net.minecraft.block.Block)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((int)(life9_54)));
    }
    return;
}


public void a__Void() {
return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
return;
}


public final net.minecraft.block.state.IBlockState a__fE() {
return this.N;
}


protected final void a__Void(net.minecraft.block.state.IBlockState p0) {
this.N = ((net.minecraft.block.state.IBlockState)(p0));
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[0]);
}


public net.minecraft.block.state.IBlockState a__fE(net.minecraft.block.state.IBlockState p0) {
return p0;
}


public static boolean a(net.minecraft.block.Block p0, net.minecraft.block.Block p1) {
net.minecraft.block.Block forwardValue4617_11_0;
    net.minecraft.block.Block forwardValue4617_15_0;
    net.minecraft.block.Block forwardValue4617_21_0;
    net.minecraft.block.Block forwardValue4617_21_1;
    int forwardValue4617_26_0;
    int forwardValue4617_28_0;
    net.minecraft.block.Block spill4617_0;
    net.minecraft.block.Block spill4617_1;
    boolean spill4617_2;
    long life2_3;
    int[] life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    forward_join_15: {
    forward_join_11: {
    life2_3 = (net.minecraft.block.Block.ab ^ 2078774201181L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4617_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue4617_11_0 = spill4617_0;
        break forward_join_11;
    }
    if (!((spill4617_0 != null))) {
        break forward_join_27;
    }
    forwardValue4617_11_0 = p1;
    }
    if (!((life4_5 != null))) {
        forwardValue4617_15_0 = forwardValue4617_11_0;
        break forward_join_15;
    }
    if (!((forwardValue4617_11_0 != null))) {
        break forward_join_27;
    }
    forwardValue4617_15_0 = p0;
    }
    spill4617_1 = p1;
    if (!((life4_5 != null))) {
        forwardValue4617_21_0 = forwardValue4617_15_0;
        forwardValue4617_21_1 = spill4617_1;
        break forward_join_21;
    }
    if (!((forwardValue4617_15_0 != spill4617_1))) {
        break forward_join_25;
    }
    forwardValue4617_21_0 = p0;
    forwardValue4617_21_1 = p1;
    }
    spill4617_2 = ((net.minecraft.block.Block)(forwardValue4617_21_0)).a__Boolean(((net.minecraft.block.Block)(forwardValue4617_21_1)));
    if (!((life4_5 != null))) {
        forwardValue4617_26_0 = ((spill4617_2) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill4617_2)) {
        break forward_join_27;
    }
    }
    forwardValue4617_26_0 = 1;
    }
    forwardValue4617_28_0 = forwardValue4617_26_0;
    break forward_join_28;
    }
    forwardValue4617_28_0 = 0;
    }
    return ((forwardValue4617_28_0) != 0);
}


public boolean a__Boolean(net.minecraft.block.Block p0) {
long local2 = (net.minecraft.block.Block.ab ^ 51614388258084L);
    return ((((this == p0) ? 1 : 0)) != 0);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_41c0ccbaa2b61d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23314;
      if (db[var3] == null) {
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
         long var5 = cb[var3];
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
         Object[] var9 = (Object[])eb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               eb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ch", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static java.lang.NumberFormatException a(java.lang.NumberFormatException p0) {
return p0;
}


private static void a(int p0, java.lang.String p1, net.minecraft.block.Block p2) {
__sourceExactCall_eec71e04382298(((int)(p0)), ((moom.DD)(new moom.DD(p1))), ((net.minecraft.block.Block)(p2)));
    return;
}


private static void a(int p0, moom.DD p1, net.minecraft.block.Block p2) {
((moom.DC)(net.minecraft.block.Block.b)).a(((int)(p0)), ((java.lang.Object)(p1)), ((java.lang.Object)(p2)));
    return;
}


public moom.F a__F() {
return moom.F.NONE;
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
return ((net.minecraft.block.Block)(this)).c(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))));
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(this)));
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.Entity p1) {
((net.minecraft.entity.Entity)(p1)).u = ((double)(0x0.0p0d));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2, float p3) {
((net.minecraft.entity.Entity)(p2)).d(((float)(p3)), ((float)(0x1.0p0f)));
    return;
}


public float a__Float() {
long local1 = (net.minecraft.block.Block.ab ^ 25691119112287L);
    return ((__sourceIntrinsic_booleanComparison(((net.minecraft.block.Block)(this)).d__Boolean()) != 0) ? 0x1.99999ap-3f : 0x1.0p0f);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3, int p4) {
return ((0) != 0);
}


public boolean a(moom.Ei p0) {
return ((1) != 0);
}


public void a__Void(net.minecraft.world.World p0, moom.DT p1) {
return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
return;
}


public net.minecraft.block.Block a(net.minecraft.creativetab.CreativeTabs p0) {
this.d = ((net.minecraft.creativetab.CreativeTabs)(p0));
    return this;
}


public net.minecraft.creativetab.CreativeTabs a__q1() {
return this.d;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 0))));
    return;
}


public float a(net.minecraft.world.World p0, moom.DT p1) {
return this.w;
}


protected net.minecraft.block.Block a(boolean p0) {
this.z = ((boolean)(p0));
    return this;
}


protected final void a(float p0, float p1, float p2, float p3, float p4, float p5) {
this.B = ((double)(((double) p0)));
    this.C = ((double)(((double) p1)));
    this.D = ((double)(((double) p2)));
    this.E = ((double)(((double) p3)));
    this.F = ((double)(((double) p4)));
    this.G = ((double)(((double) p5)));
    return;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
long l = net.minecraft.block.Block.ab ^ 0x485543FBBAE4L;
        Block block = p0.a__fE(p1).a__ch();
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        int n = p0.a(p1, block.b__Int());
        int n4 = n;
        if (nArray == null) return n4;
        if (n4 == 0) {
            n4 = (block instanceof ei ? 1 : 0);
            if (nArray == null) return n4;
            if (n4 != 0) {
                p1 = p1.b__DT();
                block = p0.a__fE(p1).a__ch();
                return p0.a(p1, block.b__Int());
            }
        }
        n4 = n;
        return n4;
}


protected net.minecraft.block.Block a__ch() {
((net.minecraft.block.Block)(this)).c(((float)(-0x1.0p0f)));
    return this;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return ((0) != 0);
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue4628_13_0;
    int forwardValue4628_15_0;
    boolean spill4628_0;
    long life3_3;
    int[] life5_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life3_3 = (net.minecraft.block.Block.ab ^ 121952383448437L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4628_0 = ((moom.fn)(this.J)).d__Boolean();
    if (!((life5_5 != null))) {
        forwardValue4628_13_0 = ((spill4628_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill4628_0))) {
        break forward_join_14;
    }
    forwardValue4628_13_0 = 1;
    }
    forwardValue4628_15_0 = forwardValue4628_13_0;
    break forward_join_15;
    }
    forwardValue4628_15_0 = 0;
    }
    return ((forwardValue4628_15_0) != 0);
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return new moom.CA((((double) ((moom.DT)(p1)).a()) + this.B), (((double) ((moom.DT)(p1)).b()) + this.C), (((double) ((moom.DT)(p1)).c()) + this.D), (((double) ((moom.DT)(p1)).a()) + this.E), (((double) ((moom.DT)(p1)).b()) + this.F), (((double) ((moom.DT)(p1)).c()) + this.G));
}


public boolean a(net.minecraft.block.state.IBlockState p0, boolean p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(this)).k())) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
((net.minecraft.block.Block)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    return;
}


public void a__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
moom.CA forwardValue4625_17_0;
    int forwardValue4625_25_0;
    int[] spill4625_0;
    moom.CA spill4625_1;
    boolean spill4625_2;
    long life7_3;
    moom.CA life10_10;
    int[] life9_11;
    forward_join_26: {
    forward_join_25: {
    forward_join_17: {
    life7_3 = (net.minecraft.block.Block.ab ^ 26112535206210L);
    spill4625_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life10_10 = ((net.minecraft.block.Block)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life9_11 = spill4625_0;
    spill4625_1 = life10_10;
    if (!((life9_11 != null))) {
        forwardValue4625_17_0 = spill4625_1;
        break forward_join_17;
    }
    if (!((spill4625_1 != null))) {
        break forward_join_26;
    }
    forwardValue4625_17_0 = p3;
    }
    spill4625_2 = ((moom.CA)(forwardValue4625_17_0)).a__Boolean(((moom.CA)(life10_10)));
    if (!((life9_11 != null))) {
        forwardValue4625_25_0 = ((spill4625_2) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill4625_2)) {
        break forward_join_26;
    }
    forwardValue4625_25_0 = ((((java.util.List)(p4)).add(((java.lang.Object)(life10_10)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4625_25_0);
    }
    return;
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
return new moom.CA((((double) ((moom.DT)(p1)).a()) + this.B), (((double) ((moom.DT)(p1)).b()) + this.C), (((double) ((moom.DT)(p1)).c()) + this.D), (((double) ((moom.DT)(p1)).a()) + this.E), (((double) ((moom.DT)(p1)).b()) + this.F), (((double) ((moom.DT)(p1)).c()) + this.G));
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
moom.bs forwardValue4629_20_0;
    moom.bs forwardValue4629_20_1;
    moom.bs forwardValue4629_32_0;
    moom.bs forwardValue4629_32_1;
    moom.bs forwardValue4629_44_0;
    moom.bs forwardValue4629_44_1;
    moom.bs forwardValue4629_56_0;
    moom.bs forwardValue4629_56_1;
    moom.bs forwardValue4629_68_0;
    moom.bs forwardValue4629_68_1;
    int forwardValue4629_85_0;
    int forwardValue4629_87_0;
    moom.bs spill4629_0;
    moom.bs spill4629_1;
    int spill4629_2;
    int spill4629_3;
    int spill4629_4;
    int spill4629_5;
    int spill4629_6;
    int spill4629_7;
    boolean spill4629_8;
    long life4_3;
    int[] life6_5;
    forward_join_87: {
    forward_join_86: {
    forward_join_85: {
    forward_join_84: {
    forward_join_76: {
    forward_join_68: {
    forward_join_66: {
    forward_join_56: {
    forward_join_54: {
    forward_join_44: {
    forward_join_42: {
    forward_join_32: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    life4_3 = (net.minecraft.block.Block.ab ^ 66406610023758L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4629_0 = p2;
    spill4629_1 = moom.bs.DOWN;
    if (!((life6_5 != null))) {
        forwardValue4629_20_0 = spill4629_0;
        forwardValue4629_20_1 = spill4629_1;
        break forward_join_20;
    }
    if (!((spill4629_0 == spill4629_1))) {
        break forward_join_18;
    }
    spill4629_2 = recovery.source.CarrierOps.dcmpl(((double)(this.C)), ((double)(0x0.0p0d)));
    if (!((life6_5 != null))) {
        forwardValue4629_85_0 = spill4629_2;
        break forward_join_85;
    }
    if (!((spill4629_2 <= 0))) {
        break forward_join_84;
    }
    }
    forwardValue4629_20_0 = p2;
    forwardValue4629_20_1 = moom.bs.UP;
    }
    if (!((life6_5 != null))) {
        forwardValue4629_32_0 = forwardValue4629_20_0;
        forwardValue4629_32_1 = forwardValue4629_20_1;
        break forward_join_32;
    }
    if (!((forwardValue4629_20_0 == forwardValue4629_20_1))) {
        break forward_join_30;
    }
    spill4629_3 = recovery.source.CarrierOps.dcmpg(((double)(this.F)), ((double)(0x1.0p0d)));
    if (!((life6_5 != null))) {
        forwardValue4629_85_0 = spill4629_3;
        break forward_join_85;
    }
    if (!((spill4629_3 >= 0))) {
        break forward_join_84;
    }
    }
    forwardValue4629_32_0 = p2;
    forwardValue4629_32_1 = moom.bs.NORTH;
    }
    if (!((life6_5 != null))) {
        forwardValue4629_44_0 = forwardValue4629_32_0;
        forwardValue4629_44_1 = forwardValue4629_32_1;
        break forward_join_44;
    }
    if (!((forwardValue4629_32_0 == forwardValue4629_32_1))) {
        break forward_join_42;
    }
    spill4629_4 = recovery.source.CarrierOps.dcmpl(((double)(this.D)), ((double)(0x0.0p0d)));
    if (!((life6_5 != null))) {
        forwardValue4629_85_0 = spill4629_4;
        break forward_join_85;
    }
    if (!((spill4629_4 <= 0))) {
        break forward_join_84;
    }
    }
    forwardValue4629_44_0 = p2;
    forwardValue4629_44_1 = moom.bs.SOUTH;
    }
    if (!((life6_5 != null))) {
        forwardValue4629_56_0 = forwardValue4629_44_0;
        forwardValue4629_56_1 = forwardValue4629_44_1;
        break forward_join_56;
    }
    if (!((forwardValue4629_44_0 == forwardValue4629_44_1))) {
        break forward_join_54;
    }
    spill4629_5 = recovery.source.CarrierOps.dcmpg(((double)(this.G)), ((double)(0x1.0p0d)));
    if (!((life6_5 != null))) {
        forwardValue4629_85_0 = spill4629_5;
        break forward_join_85;
    }
    if (!((spill4629_5 >= 0))) {
        break forward_join_84;
    }
    }
    forwardValue4629_56_0 = p2;
    forwardValue4629_56_1 = moom.bs.WEST;
    }
    if (!((life6_5 != null))) {
        forwardValue4629_68_0 = forwardValue4629_56_0;
        forwardValue4629_68_1 = forwardValue4629_56_1;
        break forward_join_68;
    }
    if (!((forwardValue4629_56_0 == forwardValue4629_56_1))) {
        break forward_join_66;
    }
    spill4629_6 = recovery.source.CarrierOps.dcmpl(((double)(this.B)), ((double)(0x0.0p0d)));
    if (!((life6_5 != null))) {
        forwardValue4629_85_0 = spill4629_6;
        break forward_join_85;
    }
    if (!((spill4629_6 <= 0))) {
        break forward_join_84;
    }
    }
    forwardValue4629_68_0 = p2;
    forwardValue4629_68_1 = moom.bs.EAST;
    }
    if (!((forwardValue4629_68_0 == forwardValue4629_68_1))) {
        break forward_join_76;
    }
    spill4629_7 = recovery.source.CarrierOps.dcmpg(((double)(this.E)), ((double)(0x1.0p0d)));
    if (!((life6_5 != null))) {
        forwardValue4629_85_0 = spill4629_7;
        break forward_join_85;
    }
    if (!((spill4629_7 >= 0))) {
        break forward_join_84;
    }
    }
    spill4629_8 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch())).j();
    if (!((life6_5 != null))) {
        forwardValue4629_85_0 = ((spill4629_8) ? 1 : 0);
        break forward_join_85;
    }
    if (!((!spill4629_8))) {
        break forward_join_86;
    }
    }
    forwardValue4629_85_0 = 1;
    }
    forwardValue4629_87_0 = forwardValue4629_85_0;
    break forward_join_87;
    }
    forwardValue4629_87_0 = 0;
    }
    return ((forwardValue4629_87_0) != 0);
}


public static net.minecraft.block.state.IBlockState a__fE(int p0) {
long local1 = (net.minecraft.block.Block.ab ^ 38295455342511L);
    int local3 = (p0 & __sourceIntrinsic_7ebb8315c49a_originalDynamicSite1744_1(15159, (4146883286814968515L ^ local1)));
    int local4 = ((p0 >> __sourceIntrinsic_7ebb8315c49a_originalDynamicSite1744_2(22146, (1537838498141710270L ^ local1))) & __sourceIntrinsic_7ebb8315c49a_originalDynamicSite1744_3(22914, (6231809925781792785L ^ local1)));
    return ((net.minecraft.block.Block)(__sourceExactCall_c520ab7951a8e1(((int)(local3))))).b__fE(((int)(local4)));
}


public static net.minecraft.block.Block a(net.minecraft.item.Item p0) {
net.minecraft.item.Item forwardValue4621_12_0;
    net.minecraft.block.Block forwardValue4621_16_0;
    net.minecraft.item.Item spill4621_0;
    long life1_3;
    int[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_12: {
    life1_3 = (net.minecraft.block.Block.ab ^ 135552783028885L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4621_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4621_12_0 = spill4621_0;
        break forward_join_12;
    }
    if (!((((spill4621_0 instanceof moom.wU) ? 1 : 0) != 0))) {
        break forward_join_15;
    }
    forwardValue4621_12_0 = p0;
    }
    forwardValue4621_16_0 = ((moom.wU)(((moom.wU)(forwardValue4621_12_0)))).a__ch();
    break forward_join_16;
    }
    forwardValue4621_16_0 = null;
    }
    return forwardValue4621_16_0;
}


public static net.minecraft.block.Block a(java.lang.String p0) { return __sourceHandlerCall_ff65c5c81fc033468a30(p0); }


public boolean a__Boolean() {
return ((((this.r) ? 1 : 0)) != 0);
}


public static net.minecraft.block.Block a(int p0) {
return ((net.minecraft.block.Block)(((moom.DC)(net.minecraft.block.Block.b)).a(((int)(p0)))));
}


public static int a(net.minecraft.block.state.IBlockState p0) {
long local1 = (net.minecraft.block.Block.ab ^ 133413240788592L);
    net.minecraft.block.Block local3 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    return (__sourceExactCall_4be9acdbe11525(((net.minecraft.block.Block)(local3))) + (((net.minecraft.block.Block)(local3)).b(((net.minecraft.block.state.IBlockState)(p0))) << __sourceIntrinsic_7fae34250687_originalDynamicSite1745_4(9688, (3933856450295962968L ^ local1))));
}


public static int a(net.minecraft.block.Block p0) {
return ((moom.DC)(net.minecraft.block.Block.b)).a(((java.lang.Object)(p0)));
}


protected net.minecraft.block.Block a(float p0) {
this.u = ((int)(((int) (0x1.ep3f * p0))));
    return this;
}


protected net.minecraft.block.Block a(moom.eJ p0) {
this.H = ((moom.eJ)(p0));
    return this;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
return p0;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return this.K;
}


public moom.fn a__fn() {
return this.J;
}


public int a__Int() {
return this.s;
}


private boolean a(moom.DR p0) {
moom.DR forwardValue4616_11_0;
    int forwardValue4616_23_0;
    int forwardValue4616_31_0;
    int forwardValue4616_39_0;
    int forwardValue4616_43_0;
    int forwardValue4616_45_0;
    moom.DR spill4616_0;
    int spill4616_1;
    long life2_3;
    int[] life4_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_31: {
    forward_join_23: {
    forward_join_11: {
    life2_3 = (net.minecraft.block.Block.ab ^ 55122588608214L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4616_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue4616_11_0 = spill4616_0;
        break forward_join_11;
    }
    if (!((spill4616_0 != null))) {
        break forward_join_44;
    }
    forwardValue4616_11_0 = p0;
    }
    spill4616_1 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(forwardValue4616_11_0)).b)), ((double)(this.C)));
    if (!((life4_5 != null))) {
        forwardValue4616_23_0 = spill4616_1;
        break forward_join_23;
    }
    if (!((spill4616_1 >= 0))) {
        break forward_join_44;
    }
    forwardValue4616_23_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).b)), ((double)(this.F)));
    }
    if (!((life4_5 != null))) {
        forwardValue4616_31_0 = forwardValue4616_23_0;
        break forward_join_31;
    }
    if (!((forwardValue4616_23_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue4616_31_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(p0)).c)), ((double)(this.D)));
    }
    if (!((life4_5 != null))) {
        forwardValue4616_39_0 = forwardValue4616_31_0;
        break forward_join_39;
    }
    if (!((forwardValue4616_31_0 >= 0))) {
        break forward_join_44;
    }
    forwardValue4616_39_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(p0)).c)), ((double)(this.G)));
    }
    if (!((life4_5 != null))) {
        forwardValue4616_43_0 = forwardValue4616_39_0;
        break forward_join_43;
    }
    if (!((forwardValue4616_39_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue4616_43_0 = 1;
    }
    forwardValue4616_45_0 = forwardValue4616_43_0;
    break forward_join_45;
    }
    forwardValue4616_45_0 = 0;
    }
    return ((forwardValue4616_45_0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, moom.Ei p2) {
return;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.SOLID;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, net.minecraft.item.ItemStack p3) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2))))) != 0);
}


public static void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.item.ItemStack p2) {
int forwardValue4626_15_0;
    boolean spill4626_0;
    long life3_3;
    int[] life5_5;
    float life6_23;
    double life7_37;
    double life9_51;
    double life11_65;
    net.minecraft.entity.item.EntityItem life13_86;
    forward_join_87: {
    forward_join_15: {
    life3_3 = (net.minecraft.block.Block.ab ^ 73931286486472L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4626_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life5_5 != null))) {
        forwardValue4626_15_0 = ((spill4626_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill4626_0))) {
        break forward_join_87;
    }
    forwardValue4626_15_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(p0)).a__Ej())).a__Boolean(((java.lang.String)("doTileDrops")))) ? 1 : 0);
    }
    if (!((forwardValue4626_15_0 != 0))) {
        break forward_join_87;
    }
    life6_23 = 0x1.0p-1f;
    life7_37 = (((double) (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * life6_23)) + (((double) (0x1.0p0f - life6_23)) * 0x1.0p-1d));
    life9_51 = (((double) (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * life6_23)) + (((double) (0x1.0p0f - life6_23)) * 0x1.0p-1d));
    life11_65 = (((double) (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * life6_23)) + (((double) (0x1.0p0f - life6_23)) * 0x1.0p-1d));
    life13_86 = new net.minecraft.entity.item.EntityItem(p0, (((double) ((moom.DT)(p1)).a()) + life7_37), (((double) ((moom.DT)(p1)).b()) + life9_51), (((double) ((moom.DT)(p1)).c()) + life11_65), p2);
    ((net.minecraft.entity.item.EntityItem)(life13_86)).w__sourceReturn_da8c82d5d4();
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life13_86)));
    }
    return;
}


protected void a(net.minecraft.world.World p0, moom.DT p1, int p2) {
int forestValue530_46_0;
    boolean spill530_0;
    int spill530_1;
    long life4_3;
    int[] life6_5;
    int life7_20;
    int life7_55;
    forest_join_82: {
    forest_join_46: {
    life4_3 = (net.minecraft.block.Block.ab ^ 2509599272858L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill530_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life6_5 != null))) {
        forestValue530_46_0 = ((spill530_0) ? 1 : 0);
        break forest_join_46;
    }
    if (!((!spill530_0))) {
        break forest_join_82;
    }
    forest_cycle_11: while (true) {
    if (!((p2 > 0))) {
        break forest_join_82;
    }
    life7_20 = __sourceExactCall_d69b06941ddd75(((int)(p2)));
    p2 = (p2 - life7_20);
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(p0, (((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d), (((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d), (((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d), life7_20))));
    if (!((life6_5 == null))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    break forest_join_82;
    }
    forest_cycle_46: while (true) {
    forest_join_80: {
    if (!((forestValue530_46_0 > 0))) {
        break forest_join_82;
    }
    life7_55 = __sourceExactCall_d69b06941ddd75(((int)(p2)));
    p2 = (p2 - life7_55);
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(p0, (((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d), (((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d), (((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d), life7_55))));
    if (!((life6_5 == null))) {
        break forest_join_80;
    }
    break forest_join_82;
    }
    spill530_1 = p2;
    forestValue530_46_0 = spill530_1;
    continue forest_cycle_46;
    }
    }
    return;
}


public float a(net.minecraft.entity.Entity p0) {
return (this.x / 0x1.4p2f);
}


public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World p0, moom.DT p1, moom.DR p2, moom.DR p3) {
int forwardValue4623_87_0;
    int forwardValue4623_95_0;
    int forwardValue4623_103_0;
    int forwardValue4623_111_0;
    int forwardValue4623_119_0;
    moom.DR forwardValue4623_139_0;
    moom.DR forwardValue4623_159_0;
    moom.DR forwardValue4623_161_0;
    moom.DR forwardValue4623_179_0;
    moom.DR forwardValue4623_181_0;
    moom.DR forwardValue4623_199_0;
    moom.DR forwardValue4623_201_0;
    moom.DR forwardValue4623_219_0;
    moom.DR forwardValue4623_221_0;
    moom.DR forwardValue4623_239_0;
    moom.DR forwardValue4623_241_0;
    moom.DR forwardValue4623_260_0;
    moom.DR forwardValue4623_260_1;
    moom.DR forwardValue4623_267_0;
    moom.DR forwardValue4623_267_1;
    moom.DR forwardValue4623_274_0;
    moom.DR forwardValue4623_274_1;
    moom.DR forwardValue4623_281_0;
    moom.DR forwardValue4623_281_1;
    int[] spill4623_0;
    boolean spill4623_1;
    moom.DR spill4623_2;
    moom.DR spill4623_3;
    moom.DR spill4623_4;
    moom.DR spill4623_5;
    moom.DR spill4623_6;
    moom.DR spill4623_7;
    moom.DR spill4623_8;
    moom.DR spill4623_9;
    moom.DR spill4623_10;
    moom.DR spill4623_11;
    moom.DR spill4623_12;
    moom.DR spill4623_13;
    moom.DR spill4623_14;
    moom.DR spill4623_15;
    long life5_3;
    moom.DR life3_23;
    moom.DR life4_38;
    moom.DR life8_44;
    moom.DR life9_50;
    int[] life7_51;
    moom.DR life10_57;
    moom.DR life11_63;
    moom.DR life12_69;
    moom.DR life13_75;
    moom.DR life14_138;
    moom.bs life15_364;
    forward_join_284: {
    forward_join_281: {
    forward_join_279: {
    forward_join_274: {
    forward_join_272: {
    forward_join_267: {
    forward_join_265: {
    forward_join_260: {
    forward_join_258: {
    forward_join_251: {
    forward_join_244: {
    forward_join_241: {
    forward_join_240: {
    forward_join_239: {
    forward_join_238: {
    forward_join_221: {
    forward_join_220: {
    forward_join_219: {
    forward_join_218: {
    forward_join_201: {
    forward_join_200: {
    forward_join_199: {
    forward_join_198: {
    forward_join_181: {
    forward_join_180: {
    forward_join_179: {
    forward_join_178: {
    forward_join_161: {
    forward_join_160: {
    forward_join_159: {
    forward_join_158: {
    forward_join_140: {
    forward_join_139: {
    forward_join_138: {
    forward_join_122: {
    forward_join_119: {
    forward_join_116: {
    forward_join_111: {
    forward_join_108: {
    forward_join_103: {
    forward_join_100: {
    forward_join_95: {
    forward_join_92: {
    forward_join_87: {
    forward_join_84: {
    life5_3 = (net.minecraft.block.Block.ab ^ 95055621718253L);
    ((net.minecraft.block.Block)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    spill4623_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life3_23 = ((moom.DR)(p2)).b(((double)(((double) (-((moom.DT)(p1)).a())))), ((double)(((double) (-((moom.DT)(p1)).b())))), ((double)(((double) (-((moom.DT)(p1)).c())))));
    life4_38 = ((moom.DR)(p3)).b(((double)(((double) (-((moom.DT)(p1)).a())))), ((double)(((double) (-((moom.DT)(p1)).b())))), ((double)(((double) (-((moom.DT)(p1)).c())))));
    life8_44 = ((moom.DR)(life3_23)).a(((moom.DR)(life4_38)), ((double)(this.B)));
    life9_50 = ((moom.DR)(life3_23)).a(((moom.DR)(life4_38)), ((double)(this.E)));
    life7_51 = spill4623_0;
    life10_57 = ((moom.DR)(life3_23)).b(((moom.DR)(life4_38)), ((double)(this.C)));
    life11_63 = ((moom.DR)(life3_23)).b(((moom.DR)(life4_38)), ((double)(this.F)));
    life12_69 = ((moom.DR)(life3_23)).c(((moom.DR)(life4_38)), ((double)(this.D)));
    life13_75 = ((moom.DR)(life3_23)).c(((moom.DR)(life4_38)), ((double)(this.G)));
    spill4623_1 = ((net.minecraft.block.Block)(this)).a(((moom.DR)(life8_44)));
    if (!((life7_51 != null))) {
        forwardValue4623_87_0 = ((spill4623_1) ? 1 : 0);
        break forward_join_87;
    }
    if (!((!spill4623_1))) {
        break forward_join_84;
    }
    life8_44 = null;
    }
    forwardValue4623_87_0 = ((((net.minecraft.block.Block)(this)).a(((moom.DR)(life9_50)))) ? 1 : 0);
    }
    if (!((life7_51 != null))) {
        forwardValue4623_95_0 = forwardValue4623_87_0;
        break forward_join_95;
    }
    if (!((forwardValue4623_87_0 == 0))) {
        break forward_join_92;
    }
    life9_50 = null;
    }
    forwardValue4623_95_0 = ((((net.minecraft.block.Block)(this)).b(((moom.DR)(life10_57)))) ? 1 : 0);
    }
    if (!((life7_51 != null))) {
        forwardValue4623_103_0 = forwardValue4623_95_0;
        break forward_join_103;
    }
    if (!((forwardValue4623_95_0 == 0))) {
        break forward_join_100;
    }
    life10_57 = null;
    }
    forwardValue4623_103_0 = ((((net.minecraft.block.Block)(this)).b(((moom.DR)(life11_63)))) ? 1 : 0);
    }
    if (!((life7_51 != null))) {
        forwardValue4623_111_0 = forwardValue4623_103_0;
        break forward_join_111;
    }
    if (!((forwardValue4623_103_0 == 0))) {
        break forward_join_108;
    }
    life11_63 = null;
    }
    forwardValue4623_111_0 = ((((net.minecraft.block.Block)(this)).c(((moom.DR)(life12_69)))) ? 1 : 0);
    }
    if (!((life7_51 != null))) {
        forwardValue4623_119_0 = forwardValue4623_111_0;
        break forward_join_119;
    }
    if (!((forwardValue4623_111_0 == 0))) {
        break forward_join_116;
    }
    life12_69 = null;
    }
    forwardValue4623_119_0 = ((((net.minecraft.block.Block)(this)).c(((moom.DR)(life13_75)))) ? 1 : 0);
    }
    if (!((forwardValue4623_119_0 == 0))) {
        break forward_join_122;
    }
    life13_75 = null;
    }
    life14_138 = null;
    if (!((life8_44 != null))) {
        break forward_join_140;
    }
    if (!((life14_138 != null))) {
        break forward_join_138;
    }
    spill4623_2 = life3_23;
    if (!((life7_51 != null))) {
        forwardValue4623_139_0 = spill4623_2;
        break forward_join_139;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill4623_2)).c(((moom.DR)(life8_44))))), ((double)(((moom.DR)(life3_23)).c(((moom.DR)(life14_138)))))) < 0))) {
        break forward_join_140;
    }
    }
    forwardValue4623_139_0 = life8_44;
    }
    life14_138 = forwardValue4623_139_0;
    }
    spill4623_3 = life9_50;
    if (!((life7_51 != null))) {
        forwardValue4623_161_0 = spill4623_3;
        break forward_join_161;
    }
    if (!((spill4623_3 != null))) {
        break forward_join_160;
    }
    spill4623_4 = life14_138;
    if (!((life7_51 != null))) {
        forwardValue4623_159_0 = spill4623_4;
        break forward_join_159;
    }
    if (!((spill4623_4 != null))) {
        break forward_join_158;
    }
    spill4623_5 = life3_23;
    if (!((life7_51 != null))) {
        forwardValue4623_161_0 = spill4623_5;
        break forward_join_161;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill4623_5)).c(((moom.DR)(life9_50))))), ((double)(((moom.DR)(life3_23)).c(((moom.DR)(life14_138)))))) < 0))) {
        break forward_join_160;
    }
    }
    forwardValue4623_159_0 = life9_50;
    }
    life14_138 = forwardValue4623_159_0;
    }
    forwardValue4623_161_0 = life10_57;
    }
    if (!((life7_51 != null))) {
        forwardValue4623_181_0 = forwardValue4623_161_0;
        break forward_join_181;
    }
    if (!((forwardValue4623_161_0 != null))) {
        break forward_join_180;
    }
    spill4623_6 = life14_138;
    if (!((life7_51 != null))) {
        forwardValue4623_179_0 = spill4623_6;
        break forward_join_179;
    }
    if (!((spill4623_6 != null))) {
        break forward_join_178;
    }
    spill4623_7 = life3_23;
    if (!((life7_51 != null))) {
        forwardValue4623_181_0 = spill4623_7;
        break forward_join_181;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill4623_7)).c(((moom.DR)(life10_57))))), ((double)(((moom.DR)(life3_23)).c(((moom.DR)(life14_138)))))) < 0))) {
        break forward_join_180;
    }
    }
    forwardValue4623_179_0 = life10_57;
    }
    life14_138 = forwardValue4623_179_0;
    }
    forwardValue4623_181_0 = life11_63;
    }
    if (!((life7_51 != null))) {
        forwardValue4623_201_0 = forwardValue4623_181_0;
        break forward_join_201;
    }
    if (!((forwardValue4623_181_0 != null))) {
        break forward_join_200;
    }
    spill4623_8 = life14_138;
    if (!((life7_51 != null))) {
        forwardValue4623_199_0 = spill4623_8;
        break forward_join_199;
    }
    if (!((spill4623_8 != null))) {
        break forward_join_198;
    }
    spill4623_9 = life3_23;
    if (!((life7_51 != null))) {
        forwardValue4623_201_0 = spill4623_9;
        break forward_join_201;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill4623_9)).c(((moom.DR)(life11_63))))), ((double)(((moom.DR)(life3_23)).c(((moom.DR)(life14_138)))))) < 0))) {
        break forward_join_200;
    }
    }
    forwardValue4623_199_0 = life11_63;
    }
    life14_138 = forwardValue4623_199_0;
    }
    forwardValue4623_201_0 = life12_69;
    }
    if (!((life7_51 != null))) {
        forwardValue4623_221_0 = forwardValue4623_201_0;
        break forward_join_221;
    }
    if (!((forwardValue4623_201_0 != null))) {
        break forward_join_220;
    }
    spill4623_10 = life14_138;
    if (!((life7_51 != null))) {
        forwardValue4623_219_0 = spill4623_10;
        break forward_join_219;
    }
    if (!((spill4623_10 != null))) {
        break forward_join_218;
    }
    spill4623_11 = life3_23;
    if (!((life7_51 != null))) {
        forwardValue4623_221_0 = spill4623_11;
        break forward_join_221;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill4623_11)).c(((moom.DR)(life12_69))))), ((double)(((moom.DR)(life3_23)).c(((moom.DR)(life14_138)))))) < 0))) {
        break forward_join_220;
    }
    }
    forwardValue4623_219_0 = life12_69;
    }
    life14_138 = forwardValue4623_219_0;
    }
    forwardValue4623_221_0 = life13_75;
    }
    if (!((life7_51 != null))) {
        forwardValue4623_241_0 = forwardValue4623_221_0;
        break forward_join_241;
    }
    if (!((forwardValue4623_221_0 != null))) {
        break forward_join_240;
    }
    spill4623_12 = life14_138;
    if (!((life7_51 != null))) {
        forwardValue4623_239_0 = spill4623_12;
        break forward_join_239;
    }
    if (!((spill4623_12 != null))) {
        break forward_join_238;
    }
    spill4623_13 = life3_23;
    if (!((life7_51 != null))) {
        forwardValue4623_241_0 = spill4623_13;
        break forward_join_241;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(spill4623_13)).c(((moom.DR)(life13_75))))), ((double)(((moom.DR)(life3_23)).c(((moom.DR)(life14_138)))))) < 0))) {
        break forward_join_240;
    }
    }
    forwardValue4623_239_0 = life13_75;
    }
    life14_138 = forwardValue4623_239_0;
    }
    forwardValue4623_241_0 = life14_138;
    }
    if (!((forwardValue4623_241_0 == null))) {
        break forward_join_244;
    }
    return null;
    }
    life15_364 = null;
    if (!((life14_138 == life8_44))) {
        break forward_join_251;
    }
    life15_364 = moom.bs.WEST;
    }
    spill4623_14 = life14_138;
    spill4623_15 = life9_50;
    if (!((life7_51 != null))) {
        forwardValue4623_260_0 = spill4623_14;
        forwardValue4623_260_1 = spill4623_15;
        break forward_join_260;
    }
    if (!((spill4623_14 == spill4623_15))) {
        break forward_join_258;
    }
    life15_364 = moom.bs.EAST;
    }
    forwardValue4623_260_0 = life14_138;
    forwardValue4623_260_1 = life10_57;
    }
    if (!((life7_51 != null))) {
        forwardValue4623_267_0 = forwardValue4623_260_0;
        forwardValue4623_267_1 = forwardValue4623_260_1;
        break forward_join_267;
    }
    if (!((forwardValue4623_260_0 == forwardValue4623_260_1))) {
        break forward_join_265;
    }
    life15_364 = moom.bs.DOWN;
    }
    forwardValue4623_267_0 = life14_138;
    forwardValue4623_267_1 = life11_63;
    }
    if (!((life7_51 != null))) {
        forwardValue4623_274_0 = forwardValue4623_267_0;
        forwardValue4623_274_1 = forwardValue4623_267_1;
        break forward_join_274;
    }
    if (!((forwardValue4623_267_0 == forwardValue4623_267_1))) {
        break forward_join_272;
    }
    life15_364 = moom.bs.UP;
    }
    forwardValue4623_274_0 = life14_138;
    forwardValue4623_274_1 = life12_69;
    }
    if (!((life7_51 != null))) {
        forwardValue4623_281_0 = forwardValue4623_274_0;
        forwardValue4623_281_1 = forwardValue4623_274_1;
        break forward_join_281;
    }
    if (!((forwardValue4623_274_0 == forwardValue4623_274_1))) {
        break forward_join_279;
    }
    life15_364 = moom.bs.NORTH;
    }
    forwardValue4623_281_0 = life14_138;
    forwardValue4623_281_1 = life13_75;
    }
    if (!((forwardValue4623_281_0 == forwardValue4623_281_1))) {
        break forward_join_284;
    }
    life15_364 = moom.bs.SOUTH;
    }
    return new net.minecraft.util.MovingObjectPosition(((moom.DR)(life14_138)).b(((double)(((double) ((moom.DT)(p1)).a()))), ((double)(((double) ((moom.DT)(p1)).b()))), ((double)(((double) ((moom.DT)(p1)).c())))), life15_364, p1);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.player.EntityPlayer p2) {
return;
}


public moom.DR a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2, moom.DR p3) {
return p3;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return;
}


public final double a() {
return this.B;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))))) != 0);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
return ((0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2) {
return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.Block)(this)).b__fE(((int)(p6)));
}


public float a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, moom.DT p2, boolean p3, int p4) {
int forwardValue4620_25_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4620_39_0;
    net.minecraft.block.Block forwardValue4620_39_1;
    int forwardValue4620_39_2;
    float forwardValue4620_45_0;
    int[] spill4620_0;
    int spill4620_1;
    net.minecraft.entity.player.EntityPlayer spill4620_2;
    net.minecraft.block.Block spill4620_3;
    int spill4620_4;
    long life6_3;
    float life9_9;
    int[] life8_10;
    forward_join_45: {
    forward_join_39: {
    forward_join_36: {
    forward_join_25: {
    forward_join_19: {
    life6_3 = (net.minecraft.block.Block.ab ^ 83479286127354L);
    spill4620_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_9 = ((net.minecraft.block.Block)(this)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p2)));
    life8_10 = spill4620_0;
    spill4620_1 = recovery.source.CarrierOps.fcmpg(((float)(life9_9)), ((float)(0x0.0p0f)));
    if (!((life8_10 != null))) {
        forwardValue4620_25_0 = spill4620_1;
        break forward_join_25;
    }
    if (!((spill4620_1 < 0))) {
        break forward_join_19;
    }
    forwardValue4620_45_0 = 0x0.0p0f;
    break forward_join_45;
    }
    spill4620_2 = p0;
    spill4620_3 = this;
    spill4620_4 = p4;
    if (!((life8_10 != null))) {
        forwardValue4620_39_0 = spill4620_2;
        forwardValue4620_39_1 = spill4620_3;
        forwardValue4620_39_2 = spill4620_4;
        break forward_join_39;
    }
    forwardValue4620_25_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill4620_2)).a__Boolean(((net.minecraft.block.Block)(spill4620_3)), ((int)(spill4620_4)))) ? 1 : 0);
    }
    if (!((forwardValue4620_25_0 == 0))) {
        break forward_join_36;
    }
    forwardValue4620_45_0 = ((((net.minecraft.entity.player.EntityPlayer)(p0)).b(((net.minecraft.block.Block)(this)), ((int)(p4)), ((boolean)(p3))) / life9_9) / 0x1.9p6f);
    break forward_join_45;
    }
    forwardValue4620_39_0 = p0;
    forwardValue4620_39_1 = this;
    forwardValue4620_39_2 = p4;
    }
    forwardValue4620_45_0 = ((((net.minecraft.entity.player.EntityPlayer)(forwardValue4620_39_0)).b(((net.minecraft.block.Block)(forwardValue4620_39_1)), ((int)(forwardValue4620_39_2)), ((boolean)(p3))) / life9_9) / 0x1.ep4f);
    }
    return forwardValue4620_45_0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
return;
}


public float a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, moom.DT p2) {
int forwardValue4618_37_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4618_52_0;
    net.minecraft.block.Block forwardValue4618_52_1;
    int forwardValue4618_52_2;
    float forwardValue4618_57_0;
    int[] spill4618_0;
    int spill4618_1;
    net.minecraft.entity.player.EntityPlayer spill4618_2;
    net.minecraft.block.Block spill4618_3;
    int spill4618_4;
    long life4_3;
    com.moon.er life7_11;
    int[] life6_12;
    float life8_21;
    forward_join_57: {
    forward_join_52: {
    forward_join_48: {
    forward_join_37: {
    forward_join_30: {
    life4_3 = (net.minecraft.block.Block.ab ^ 20871899857445L);
    spill4618_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_11 = new com.moon.er(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c);
    life6_12 = spill4618_0;
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life7_11)));
    life8_21 = ((net.minecraft.block.Block)(this)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p2)));
    spill4618_1 = recovery.source.CarrierOps.fcmpg(((float)(life8_21)), ((float)(0x0.0p0f)));
    if (!((life6_12 != null))) {
        forwardValue4618_37_0 = spill4618_1;
        break forward_join_37;
    }
    if (!((spill4618_1 < 0))) {
        break forward_join_30;
    }
    forwardValue4618_57_0 = 0x0.0p0f;
    break forward_join_57;
    }
    spill4618_2 = p0;
    spill4618_3 = this;
    spill4618_4 = ((com.moon.er)(life7_11)).a();
    if (!((life6_12 != null))) {
        forwardValue4618_52_0 = spill4618_2;
        forwardValue4618_52_1 = spill4618_3;
        forwardValue4618_52_2 = spill4618_4;
        break forward_join_52;
    }
    forwardValue4618_37_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill4618_2)).a__Boolean(((net.minecraft.block.Block)(spill4618_3)), ((int)(spill4618_4)))) ? 1 : 0);
    }
    if (!((forwardValue4618_37_0 == 0))) {
        break forward_join_48;
    }
    forwardValue4618_57_0 = ((((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.block.Block)(this)), ((int)(((com.moon.er)(life7_11)).a()))) / life8_21) / 0x1.9p6f);
    break forward_join_57;
    }
    forwardValue4618_52_0 = p0;
    forwardValue4618_52_1 = this;
    forwardValue4618_52_2 = ((com.moon.er)(life7_11)).a();
    }
    forwardValue4618_57_0 = ((((net.minecraft.entity.player.EntityPlayer)(forwardValue4618_52_0)).a(((net.minecraft.block.Block)(forwardValue4618_52_1)), ((int)(forwardValue4618_52_2))) / life8_21) / 0x1.ep4f);
    }
    return forwardValue4618_57_0;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(this)));
}


public int a(java.util.Random p0) {
return 1;
}


public int a(net.minecraft.world.World p0) {
long local2 = (net.minecraft.block.Block.ab ^ 36535783244308L);
    return __sourceIntrinsic_a3a6e3090437_originalDynamicSite1746_1(20259, (3289839617592943417L ^ local2));
}


public float a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, moom.DT p2, boolean p3) {
int forwardValue4619_37_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4619_53_0;
    net.minecraft.block.Block forwardValue4619_53_1;
    int forwardValue4619_53_2;
    float forwardValue4619_59_0;
    int[] spill4619_0;
    int spill4619_1;
    net.minecraft.entity.player.EntityPlayer spill4619_2;
    net.minecraft.block.Block spill4619_3;
    int spill4619_4;
    long life5_3;
    com.moon.er life8_11;
    int[] life7_16;
    float life9_21;
    forward_join_59: {
    forward_join_53: {
    forward_join_49: {
    forward_join_37: {
    forward_join_30: {
    life5_3 = (net.minecraft.block.Block.ab ^ 27704917605484L);
    spill4619_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_11 = new com.moon.er(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life8_11)));
    life7_16 = spill4619_0;
    life9_21 = ((net.minecraft.block.Block)(this)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p2)));
    spill4619_1 = recovery.source.CarrierOps.fcmpg(((float)(life9_21)), ((float)(0x0.0p0f)));
    if (!((life7_16 != null))) {
        forwardValue4619_37_0 = spill4619_1;
        break forward_join_37;
    }
    if (!((spill4619_1 < 0))) {
        break forward_join_30;
    }
    forwardValue4619_59_0 = 0x0.0p0f;
    break forward_join_59;
    }
    spill4619_2 = p0;
    spill4619_3 = this;
    spill4619_4 = ((com.moon.er)(life8_11)).a();
    if (!((life7_16 != null))) {
        forwardValue4619_53_0 = spill4619_2;
        forwardValue4619_53_1 = spill4619_3;
        forwardValue4619_53_2 = spill4619_4;
        break forward_join_53;
    }
    forwardValue4619_37_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill4619_2)).a__Boolean(((net.minecraft.block.Block)(spill4619_3)), ((int)(spill4619_4)))) ? 1 : 0);
    }
    if (!((forwardValue4619_37_0 == 0))) {
        break forward_join_49;
    }
    forwardValue4619_59_0 = ((((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.block.Block)(this)), ((int)(((com.moon.er)(life8_11)).a())), ((boolean)(p3))) / life9_21) / 0x1.9p6f);
    break forward_join_59;
    }
    forwardValue4619_53_0 = p0;
    forwardValue4619_53_1 = this;
    forwardValue4619_53_2 = ((com.moon.er)(life8_11)).a();
    }
    forwardValue4619_59_0 = ((((net.minecraft.entity.player.EntityPlayer)(forwardValue4619_53_0)).a(((net.minecraft.block.Block)(forwardValue4619_53_1)), ((int)(forwardValue4619_53_2)), ((boolean)(p3))) / life9_21) / 0x1.ep4f);
    }
    return forwardValue4619_59_0;
}


public final void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3) {
((net.minecraft.block.Block)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((float)(0x1.0p0f)), ((int)(p3)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
int lexicalValue1453_16_0;
    boolean spill1453_0;
    long life6_3;
    int[] life8_5;
    int life9_22;
    int life10_24;
    net.minecraft.item.Item life11_40;
    lexical_join_53: {
    lexical_join_16: {
    life6_3 = (net.minecraft.block.Block.ab ^ 49711550288158L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1453_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life8_5 != null))) {
        lexicalValue1453_16_0 = ((spill1453_0) ? 1 : 0);
        break lexical_join_16;
    }
    if (!((!spill1453_0))) {
        break lexical_join_53;
    }
    lexicalValue1453_16_0 = ((net.minecraft.block.Block)(this)).a(((int)(p4)), ((java.util.Random)(((net.minecraft.world.World)(p0)).u)));
    }
    life9_22 = lexicalValue1453_16_0;
    life10_24 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    if (!((life10_24 < life9_22))) {
        break lexical_join_53;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat())), ((float)(p3))) <= 0))) {
        break lexical_join_50;
    }
    life11_40 = ((net.minecraft.block.Block)(this)).a(((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(p4)));
    if (!((life8_5 != null))) {
        break lexical_join_51;
    }
    if (!((life11_40 != null))) {
        break lexical_join_50;
    }
    __sourceExactCall_22126fbeda3024(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life11_40, 1, ((net.minecraft.block.Block)(this)).c(((net.minecraft.block.state.IBlockState)(p2)))))));
    }
    life10_24 += 1;
    }
    if (!((life8_5 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}


protected boolean m() {
int forwardValue4638_13_0;
    int forwardValue4638_17_0;
    int forwardValue4638_19_0;
    boolean spill4638_0;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.block.Block.ab ^ 139603854583871L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4638_0 = ((net.minecraft.block.Block)(this)).g();
    if (!((life3_5 != null))) {
        forwardValue4638_13_0 = ((spill4638_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill4638_0)) {
        break forward_join_18;
    }
    forwardValue4638_13_0 = ((this.A) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4638_17_0 = forwardValue4638_13_0;
        break forward_join_17;
    }
    if (!((forwardValue4638_13_0 == 0))) {
        break forward_join_18;
    }
    forwardValue4638_17_0 = 1;
    }
    forwardValue4638_19_0 = forwardValue4638_17_0;
    break forward_join_19;
    }
    forwardValue4638_19_0 = 0;
    }
    return ((forwardValue4638_19_0) != 0);
}


public boolean o() {
return ((((this.y) ? 1 : 0)) != 0);
}


public boolean p() {
return ((0) != 0);
}


public boolean k() {
return ((1) != 0);
}


public boolean g() {
return ((1) != 0);
}


public boolean j() {
return ((1) != 0);
}


public boolean q() {
return ((1) != 0);
}


public boolean r() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_08327b0c3c869fd7_invokedynamic524_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9921_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7fae34250687_originalDynamicSite1745_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cdd8da66b4ba_originalDynamicSite1742_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a3a6e3090437_originalDynamicSite1746_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1743_1(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ebb8315c49a_originalDynamicSite1744_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ebb8315c49a_originalDynamicSite1744_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ebb8315c49a_originalDynamicSite1744_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8db5871551d4_invokedynamic9914_3(net.minecraft.block.state.IBlockState a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1398b4921c0_originalDynamicSite1739_1(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba4ebd9c343f_originalDynamicSite1741_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8a36ae237a7_originalDynamicSite1740_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1738_2(java.lang.Object a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
private static native int __sourceExactCall_4be9acdbe11525(net.minecraft.block.Block p0);
private static native void __sourceExactCall_22126fbeda3024(net.minecraft.world.World p0, moom.DT p1, net.minecraft.item.ItemStack p2);
private static native int __sourceExactCall_41c0ccbaa2b61d(int p0, long p1);
private static native void __sourceExactCall_eec71e04382298(int p0, moom.DD p1, net.minecraft.block.Block p2);
private static native net.minecraft.block.Block __sourceExactCall_c520ab7951a8e1(int p0);
private static native int __sourceExactCall_d69b06941ddd75(int p0);
}
