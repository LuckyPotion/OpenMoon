package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fm {

public static moom.fm[] a;

public static moom.fm b;

public static moom.fm c;

public static moom.fm d;

public static moom.fm e;

public static moom.fm f;

public static moom.fm g;

public static moom.fm h;

public static moom.fm i;

public static moom.fm j;

public static moom.fm k;

public static moom.fm l;

public static moom.fm m;

public static moom.fm n;

public static moom.fm o;

public static moom.fm p;

public static moom.fm q;

public static moom.fm r;

public static moom.fm s;

public static moom.fm t;

public static moom.fm u;

public static moom.fm v;

public static moom.fm w;

public static moom.fm x;

public static moom.fm y;

public static moom.fm z;

public static moom.fm A;

public static moom.fm B;

public static moom.fm C;

public static moom.fm D;

public static moom.fm E;

public static moom.fm F;

public static moom.fm G;

public static moom.fm H;

public static moom.fm I;

public static moom.fm J;

public static moom.fm K;

public int L;

public int M;

private static int N;

private static long O;

private static long[] P;

private static java.lang.Integer[] Q;

private static java.util.Map R;

private fm(int p0, int p1) { super(); }


private static void __sourceConstructorBody_eb3f295e8380e1af(moom.fm receiver, int p0, int p1) throws Throwable {

forward_join_31: {

    forward_join_26: {

    long local3_life2 = (moom.fm.O ^ 59464584788593L);

    moom.fm.__sourceConstructorInit_eb3f295e8380e1af_0(((moom.fm)(receiver)));

    if (!((p0 >= 0))) { break forward_join_26; }

    if (!((p0 <= __sourceIntrinsic_eb3f295e8380e1af_originalDynamicSite651_5(7733, (3012810085622330186L ^ local3_life2))))) { break forward_join_26; }

    ((moom.fm)(receiver)).M = ((int)(p0));

    ((moom.fm)(receiver)).L = ((int)(p1));

    (moom.fm.a)[p0] = receiver;

    break forward_join_31;

    }

    throw new java.lang.IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_eb3f295e8380e1af_0(moom.fm a0) throws E;

static {
O = ((long)(((moom._a)(moom._c.a(((long)(-8727570317608556940L)), ((long)(6762517077712736777L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(160690713597168L)))));
    long local11_life6 = (moom.fm.O ^ 64459462133079L);
    int __sourceSpill1196_8 = 102;
    R = ((java.util.Map)(new java.util.HashMap(13)));
    moom.fm.b(((int)(__sourceSpill1196_8)));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill1196_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1196_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1196_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1196_16 = new byte[8];
    (__sourceSpill1196_16)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill1196_16)[local1_life17] = ((byte) ((int) ((local11_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation1196_18 = __sourceSpill1196_16;
    ((javax.crypto.Cipher)(__sourceSpill1196_13)).init(((int)(__sourceSpill1196_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1196_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1196_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life21 = new long[76];
    int local3_life22 = 0;
    java.lang.String local4_life23;
    int local5_life25 = ((java.lang.String)((local4_life23 = "Ú\033­\177n1À\025\fYd\021\025®ïý©B\004âÐé\036#\031jÓ1\001o'teb,\0177û¦»±MW\020Ìf¾xã\006f\037\177ÒòYÇ)óÏãÐÖÈOÉ\nqR8ÜõìS2üa×­.\025ø\032t\177%J.q°n§7\021$`úñÑ]yäÕ¨ç\003\005Ý=N\003*­OòK©ÐÔZa_0\035©În¤>â8û×à=ía\004+\0329¤\033t§*ß!ý\027\007M\0227\021Áwdî\r~Q{âÜ\025¤=¹]\0219#á\036T>%@Û=Ò }\"96>|D>«¨ì\005>ñ¼mÄi\002ÓÜ¯­!²YÌ>hüf±\005tÞ£\025,\032¬6LÞ/¢Ú\\\006óºÙÊÏ7\037¼\025&=j6ÂïbVÅô\031\036-.!fjÇ¹çYåRo½P4Ç\024·Ík\f*³²\020\177@\0242Òò°\006g\026Ð|FWp'ófô\b«&j£°ê#J¥¾ëÎ\006ô¼¢_EU`³à7ÏÇäWØ¢\005Ïå\000\005·({Ó&¹Æ\016ò\fÜ¹fÿ;ÌQ½oHvpC6OÚç\023+\005\004T¿RW\fð´róÁv\177bArîË£\000»\0234ùÌØùÑC»B£Ïºé\0225äj^ê\023ÇD\036Ogæ\026ÃGÃ6\033\022\034¾:\022ÍuÛÍ(\033³\033mNP»\025Àæ\t\037ÖtÉ!Z»hfÓ\004\016Wy®¾;Ø5\032?_>öè7®93}\n \024\021v+Ä\002Aû\022¿<Ì\023-C©¦ Z5FJ2°K\037¬pp\"{E\021ÕIUìæaÚ\022ôU¢*~ó¢5"))).length();
    int local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1196_27 = local4_life23;
        int __sourceSpill1196_28 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1196_27)).substring(((int)(__sourceSpill1196_28)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1196_32 = local6_life21;
        int __sourceSpill1196_33 = local3_life22;
        local3_life22 += 1;
        long local8_life34 = (((((((((((long) (local7_life31)[0]) & 255L) << 56) | ((((long) (local7_life31)[1]) & 255L) << 48)) | ((((long) (local7_life31)[2]) & 255L) << 40)) | ((((long) (local7_life31)[3]) & 255L) << 32)) | ((((long) (local7_life31)[4]) & 255L) << 24)) | ((((long) (local7_life31)[5]) & 255L) << 16)) | ((((long) (local7_life31)[6]) & 255L) << 8)) | (((long) (local7_life31)[7]) & 255L));
        byte[] __sourceSpill1196_35 = new byte[8];
        (__sourceSpill1196_35)[0] = ((byte) ((int) (local8_life34 >>> 56)));
        (__sourceSpill1196_35)[1] = ((byte) ((int) (local8_life34 >>> 48)));
        (__sourceSpill1196_35)[2] = ((byte) ((int) (local8_life34 >>> 40)));
        (__sourceSpill1196_35)[3] = ((byte) ((int) (local8_life34 >>> 32)));
        (__sourceSpill1196_35)[4] = ((byte) ((int) (local8_life34 >>> 24)));
        (__sourceSpill1196_35)[5] = ((byte) ((int) (local8_life34 >>> 16)));
        (__sourceSpill1196_35)[6] = ((byte) ((int) (local8_life34 >>> 8)));
        (__sourceSpill1196_35)[7] = ((byte) ((int) local8_life34));
        javax.crypto.Cipher __sourceSpill1196_36 = local0_life11;
        byte[] local10_life38 = ((javax.crypto.Cipher)(__sourceSpill1196_36)).doFinal(((byte[])(__sourceSpill1196_35)));
        (__sourceSpill1196_32)[__sourceSpill1196_33] = (((((((((((long) (local10_life38)[0]) & 255L) << 56) | ((((long) (local10_life38)[1]) & 255L) << 48)) | ((((long) (local10_life38)[2]) & 255L) << 40)) | ((((long) (local10_life38)[3]) & 255L) << 32)) | ((((long) (local10_life38)[4]) & 255L) << 24)) | ((((long) (local10_life38)[5]) & 255L) << 16)) | ((((long) (local10_life38)[6]) & 255L) << 8)) | (((long) (local10_life38)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    local5_life25 = ((java.lang.String)((local4_life23 = "\006Qsâ?§ÎSQ]l`>"))).length();
    local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1196_40 = local4_life23;
        int __sourceSpill1196_41 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1196_40)).substring(((int)(__sourceSpill1196_41)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1196_45 = local6_life21;
        int __sourceSpill1196_46 = local3_life22;
        local3_life22 += 1;
        long local8_life47 = (((((((((((long) (local7_life44)[0]) & 255L) << 56) | ((((long) (local7_life44)[1]) & 255L) << 48)) | ((((long) (local7_life44)[2]) & 255L) << 40)) | ((((long) (local7_life44)[3]) & 255L) << 32)) | ((((long) (local7_life44)[4]) & 255L) << 24)) | ((((long) (local7_life44)[5]) & 255L) << 16)) | ((((long) (local7_life44)[6]) & 255L) << 8)) | (((long) (local7_life44)[7]) & 255L));
        byte[] __sourceSpill1196_48 = new byte[8];
        (__sourceSpill1196_48)[0] = ((byte) ((int) (local8_life47 >>> 56)));
        (__sourceSpill1196_48)[1] = ((byte) ((int) (local8_life47 >>> 48)));
        (__sourceSpill1196_48)[2] = ((byte) ((int) (local8_life47 >>> 40)));
        (__sourceSpill1196_48)[3] = ((byte) ((int) (local8_life47 >>> 32)));
        (__sourceSpill1196_48)[4] = ((byte) ((int) (local8_life47 >>> 24)));
        (__sourceSpill1196_48)[5] = ((byte) ((int) (local8_life47 >>> 16)));
        (__sourceSpill1196_48)[6] = ((byte) ((int) (local8_life47 >>> 8)));
        (__sourceSpill1196_48)[7] = ((byte) ((int) local8_life47));
        javax.crypto.Cipher __sourceSpill1196_49 = local0_life11;
        byte[] local10_life51 = ((javax.crypto.Cipher)(__sourceSpill1196_49)).doFinal(((byte[])(__sourceSpill1196_48)));
        (__sourceSpill1196_45)[__sourceSpill1196_46] = (((((((((((long) (local10_life51)[0]) & 255L) << 56) | ((((long) (local10_life51)[1]) & 255L) << 48)) | ((((long) (local10_life51)[2]) & 255L) << 40)) | ((((long) (local10_life51)[3]) & 255L) << 32)) | ((((long) (local10_life51)[4]) & 255L) << 24)) | ((((long) (local10_life51)[5]) & 255L) << 16)) | ((((long) (local10_life51)[6]) & 255L) << 8)) | (((long) (local10_life51)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    P = ((long[])(local6_life21));
    Q = ((java.lang.Integer[])(new java.lang.Integer[76]));
    a = ((moom.fm[])(new moom.fm[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_54(30538, (9068386451560228178L ^ local11_life6))]));
    b = ((moom.fm)(new moom.fm(0, 0)));
    c = ((moom.fm)(new moom.fm(1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_57(25992, (5144119531391809508L ^ local11_life6)))));
    d = ((moom.fm)(new moom.fm(2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_59(19689, (3717499250641231522L ^ local11_life6)))));
    e = ((moom.fm)(new moom.fm(3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_61(13782, (3368131890107590589L ^ local11_life6)))));
    f = ((moom.fm)(new moom.fm(4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_63(19330, (7225145221569894898L ^ local11_life6)))));
    g = ((moom.fm)(new moom.fm(5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_65(31041, (2083932567665535788L ^ local11_life6)))));
    h = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_67(4019, (6800204735004089819L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_68(13804, (3450511300157548426L ^ local11_life6)))));
    i = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_70(27113, (40309803914820534L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_71(23672, (4851238782013656605L ^ local11_life6)))));
    j = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_73(16787, (5617305020378403725L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_74(16214, (8902523711212662039L ^ local11_life6)))));
    k = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_76(17881, (2711293819746539449L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_77(7116, (8329836667225835934L ^ local11_life6)))));
    l = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_79(9974, (8842956420854658226L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_80(27621, (8847151545562134957L ^ local11_life6)))));
    m = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_82(15613, (3482864122893741800L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_83(29282, (8059733346992414845L ^ local11_life6)))));
    n = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_85(4800, (3624510630310445238L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_86(29537, (4788628318525546799L ^ local11_life6)))));
    o = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_88(8363, (8646479654637220599L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_89(30405, (8445253409016046739L ^ local11_life6)))));
    p = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_91(15682, (2248389765179453269L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_92(10352, (6440832718365833836L ^ local11_life6)))));
    q = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_94(1116, (380027928094873147L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_95(22659, (4829512934079548159L ^ local11_life6)))));
    r = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_97(15226, (2430809303498631449L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_98(12590, (8384986616905376564L ^ local11_life6)))));
    s = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_100(817, (5432535015228805451L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_101(16651, (6077815186800759637L ^ local11_life6)))));
    t = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_103(24942, (1738383628653982518L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_104(22803, (4350175922106682207L ^ local11_life6)))));
    u = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_106(20328, (1428768424270585130L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_107(10576, (4538701153605106479L ^ local11_life6)))));
    v = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_109(26800, (4874534590098668263L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_110(10427, (3908872575467600544L ^ local11_life6)))));
    w = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_112(16895, (659704907571221429L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_113(19729, (2144940694975831884L ^ local11_life6)))));
    x = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_115(26123, (6538254923809420399L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_116(4138, (7100717260141789807L ^ local11_life6)))));
    y = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_118(18069, (1500218163124294894L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_119(20635, (5808809667692741365L ^ local11_life6)))));
    z = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_121(3896, (8927865653413223759L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_122(31407, (929652672138471675L ^ local11_life6)))));
    A = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_124(5698, (8121544448986776589L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_125(29258, (3518446001162346546L ^ local11_life6)))));
    B = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_127(15654, (8817084286619987814L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_128(19748, (5425627618391154512L ^ local11_life6)))));
    C = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_130(6648, (1489473970352491418L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_131(582, (765963415147712556L ^ local11_life6)))));
    D = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_133(27268, (5395363088502028445L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_134(8413, (7162110204461101756L ^ local11_life6)))));
    E = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_136(32171, (3926459459650416632L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_137(19412, (4713767144439208353L ^ local11_life6)))));
    F = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_139(15253, (8303688980281338319L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_140(2118, (39555141563914815L ^ local11_life6)))));
    G = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_142(1434, (7186422170438473693L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_143(26011, (9125027731022706665L ^ local11_life6)))));
    H = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_145(6235, (8884397991330089509L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_146(9460, (6171574776565511865L ^ local11_life6)))));
    I = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_148(30276, (1163190700717007961L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_149(30032, (8830918482499921709L ^ local11_life6)))));
    J = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_151(3887, (1241768170298121536L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_152(21741, (3743603591422232315L ^ local11_life6)))));
    K = ((moom.fm)(new moom.fm(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_154(31917, (3346358758074150653L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_155(19175, (5901935190329612449L ^ local11_life6)))));
}


public static void b(int p0) {
N = ((int)(p0));
    return;
}


public static int b() {
return moom.fm.N;
}


public static int c() {
int local0 = moom.fm.b();
    if ((local0 == 0)) {
        return 13;
    }
    return 0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7642_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/fm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.fm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6250;
      if (Q[var3] == null) {
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
         long var5 = P[var3];
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
         Object[] var9 = (Object[])R.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               R.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/fm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Q[var3] = var15;
      }

      return Q[var3];
}


private static java.lang.IndexOutOfBoundsException a(java.lang.IndexOutOfBoundsException p0) {
return p0;
}


public int a(int p0) {
int forwardValue3543_25_0;
    int forwardValue3543_25_1;
    int forwardValue3543_38_0;
    int forwardValue3543_38_1;
    int forwardValue3543_46_0;
    int forwardValue3543_77_0;
    int forwardValue3543_146_0;
    int spill3543_0;
    int spill3543_1;
    int spill3543_2;
    int spill3543_3;
    int spill3543_4;
    long life2_3;
    int life5_10;
    int life4_11;
    int life6_89;
    int life7_112;
    int life8_129;
    forward_join_146: {
    forward_join_77: {
    forward_join_55: {
    forward_join_46: {
    forward_join_45: {
    forward_join_38: {
    forward_join_34: {
    forward_join_25: {
    forward_join_23: {
    life2_3 = (moom.fm.O ^ 14339108907907L);
    spill3543_0 = moom.fm.b();
    life5_10 = __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_2(12275, (4555194987197092718L ^ life2_3));
    life4_11 = spill3543_0;
    spill3543_1 = p0;
    spill3543_2 = 3;
    if (!((life4_11 != 0))) {
        forwardValue3543_25_0 = spill3543_1;
        forwardValue3543_25_1 = spill3543_2;
        break forward_join_25;
    }
    if (!((spill3543_1 == spill3543_2))) {
        break forward_join_23;
    }
    life5_10 = __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_3(4446, (3602268444056677841L ^ life2_3));
    }
    forwardValue3543_25_0 = p0;
    forwardValue3543_25_1 = 2;
    }
    if (!((life4_11 != 0))) {
        forwardValue3543_38_0 = forwardValue3543_25_0;
        forwardValue3543_38_1 = forwardValue3543_25_1;
        break forward_join_38;
    }
    if (!((forwardValue3543_25_0 == forwardValue3543_25_1))) {
        break forward_join_34;
    }
    life5_10 = __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_4(7512, (4503755471873040893L ^ life2_3));
    }
    spill3543_3 = p0;
    if (!((life4_11 != 0))) {
        forwardValue3543_46_0 = spill3543_3;
        break forward_join_46;
    }
    forwardValue3543_38_0 = spill3543_3;
    forwardValue3543_38_1 = 1;
    }
    if (!((forwardValue3543_38_0 == forwardValue3543_38_1))) {
        break forward_join_45;
    }
    life5_10 = __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_5(30320, (3780208925289384693L ^ life2_3));
    }
    forwardValue3543_46_0 = p0;
    }
    if (!((life4_11 != 0))) {
        forwardValue3543_77_0 = forwardValue3543_46_0;
        break forward_join_77;
    }
    if (!((forwardValue3543_46_0 == 0))) {
        break forward_join_55;
    }
    life5_10 = __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_6(14739, (3962810887359087924L ^ life2_3));
    }
    forwardValue3543_77_0 = ((((this.L >> __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_8(30694, (1905574350908787547L ^ life2_3))) & __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_9(12711, (958805574076091751L ^ life2_3))) * life5_10) / __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_10(12711, (958805574076091751L ^ life2_3)));
    }
    life6_89 = forwardValue3543_77_0;
    life7_112 = ((((this.L >> __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_12(19978, (1909218636854178443L ^ life2_3))) & __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_13(12711, (958805574076091751L ^ life2_3))) * life5_10) / __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_14(12711, (958805574076091751L ^ life2_3)));
    life8_129 = (((this.L & __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_16(12711, (958805574076091751L ^ life2_3))) * life5_10) / __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_17(12711, (958805574076091751L ^ life2_3)));
    spill3543_4 = (((__sourceIntrinsic_5c51e7cdc795_invokedynamic3543_18(32264, (4224732599743611551L ^ life2_3)) | (life6_89 << __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_19(15226, (2430764589972572109L ^ life2_3)))) | (life7_112 << __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_20(16787, (5617284568983125337L ^ life2_3)))) | life8_129);
    if (!((life4_11 == 0))) {
        forwardValue3543_146_0 = spill3543_4;
        break forward_join_146;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    forwardValue3543_146_0 = spill3543_4;
    }
    return forwardValue3543_146_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb3f295e8380e1af_originalDynamicSite651_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1196_155(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7642_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3543_20(int a0, long a1) throws E;
}
