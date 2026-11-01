package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class Bs {

private java.util.List<net.minecraft.entity.player.EntityPlayerMP> a;

private moom.Ee b;

private short[] c;

private int d;

private int e;

private long f;

moom.Br g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

private static long[] l;

private static java.lang.Long[] m;

private static java.util.Map n;

public Bs(moom.Br p0, int p1, int p2) { super(); }


private static void __sourceConstructorBody_3b2f8815bf9e6b90(moom.Bs receiver, moom.Br p0, int p1, int p2) throws Throwable {

long local4 = (moom.Bs.h ^ 89226715131236L);

    ((moom.Bs)(receiver)).g = ((moom.Br)(p0));

    moom.Bs.__sourceConstructorInit_3b2f8815bf9e6b90_0(((moom.Bs)(receiver)));

    ((moom.Bs)(receiver)).a = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.Bs)(receiver)).c = ((short[])(new short[__sourceIntrinsic_3b2f8815bf9e6b90_originalDynamicSite1382_5(20587, (4031778241250238127L ^ local4))]));

    ((moom.Bs)(receiver)).b = ((moom.Ee)(new moom.Ee(p1, p2)));

    ((net.minecraft.world.gen.ChunkProviderServer)(((net.minecraft.world.WorldServer)(((moom.Br)(p0)).a())).Z)).b(((int)(p1)), ((int)(p2)));

    return;

}



static {
h = ((long)(((moom._a)(moom._c.a(((long)(510309337541366528L)), ((long)(-5449579247287671168L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9357670188905L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Bs.h ^ 21479656432426L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill495_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill495_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill495_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill495_14 = new byte[8];
    (__sourceSpill495_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill495_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation495_16 = __sourceSpill495_14;
    ((javax.crypto.Cipher)(__sourceSpill495_11)).init(((int)(__sourceSpill495_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill495_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation495_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[13];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "\003¯¼ÖÐ;\030,\023qB\000úÅ\033(\030\024;Ý4ûiÝú\f#9;ÂVÀ\034è¥\003\020>È\037ô9ôlqümO¬\n'\tã0äÀ\036¾*Ó¿ÈÀ§í`\002¾åÜ×?É³M;\177\036\006"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill495_25 = local17_life21;
        int __sourceSpill495_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill495_25)).substring(((int)(__sourceSpill495_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill495_30 = local19_life19;
        int __sourceSpill495_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill495_33 = new byte[8];
        (__sourceSpill495_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill495_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill495_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill495_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill495_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill495_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill495_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill495_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill495_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill495_34)).doFinal(((byte[])(__sourceSpill495_33)));
        (__sourceSpill495_30)[__sourceSpill495_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "\005½K(\030\002\026NFñqPÙÊ!"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill495_38 = local17_life21;
        int __sourceSpill495_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill495_38)).substring(((int)(__sourceSpill495_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill495_43 = local19_life19;
        int __sourceSpill495_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill495_46 = new byte[8];
        (__sourceSpill495_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill495_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill495_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill495_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill495_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill495_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill495_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill495_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill495_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill495_47)).doFinal(((byte[])(__sourceSpill495_46)));
        (__sourceSpill495_43)[__sourceSpill495_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    i = ((long[])(local19_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[13]));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill495_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill495_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill495_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill495_59 = new byte[8];
    (__sourceSpill495_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill495_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation495_61 = __sourceSpill495_59;
    ((javax.crypto.Cipher)(__sourceSpill495_56)).init(((int)(__sourceSpill495_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill495_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation495_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "ê\030S»þTÈÄ¿è Þò"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill495_70 = local4_life66;
        int __sourceSpill495_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill495_70)).substring(((int)(__sourceSpill495_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill495_75 = local6_life64;
        int __sourceSpill495_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill495_78 = new byte[8];
        (__sourceSpill495_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill495_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill495_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill495_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill495_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill495_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill495_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill495_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill495_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill495_79)).doFinal(((byte[])(__sourceSpill495_78)));
        (__sourceSpill495_75)[__sourceSpill495_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    l = ((long[])(local6_life64));
    m = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3b2f8815bf9e6b90_0(moom.Bs a0) throws E;

public void b() {
int lexicalValue519_13_0;
    moom.Bs lexicalValue519_109_0;
    int lexicalValue519_124_0;
    int lexicalValue519_124_1;
    int lexicalValue519_256_0;
    int lexicalValue519_256_1;
    int lexicalValue519_309_0;
    moom.Bs lexicalValue519_363_0;
    int spill519_0;
    int spill519_1;
    moom.Bs spill519_2;
    moom.Bs spill519_3;
    moom.Bs spill519_4;
    int spill519_5;
    long life1_3;
    int life3_5;
    int life4_52;
    int life5_63;
    int life6_90;
    moom.DT life7_97;
    int life4_168;
    int life5_199;
    int life6_210;
    int life7_237;
    moom.DT life8_244;
    int life4_290;
    int life5_300;
    int life6_320;
    int life7_351;
    java.util.List life8_380;
    java.util.Iterator life9_383;
    net.minecraft.tileentity.TileEntity life10_390;
    lexical_join_365: {
    lexical_join_363: {
    lexical_join_359: {
    lexical_join_256: {
    lexical_join_248: {
    lexical_join_246: {
    lexical_join_124: {
    lexical_join_117: {
    lexical_join_115: {
    lexical_join_109: {
    lexical_join_13: {
    life1_3 = (moom.Bs.h ^ 97038702829264L);
    life3_5 = ((net.minecraft.server.management.ServerConfigurationManager.c__Boolean()) ? 1 : 0);
    spill519_0 = this.d;
    if (!((life3_5 != 0))) {
        lexicalValue519_13_0 = spill519_0;
        break lexical_join_13;
    }
    if (!((spill519_0 != 0))) {
        break lexical_join_365;
    }
    lexicalValue519_13_0 = this.d;
    }
    spill519_1 = 1;
    if (!((life3_5 != 0))) {
        lexicalValue519_124_0 = lexicalValue519_13_0;
        lexicalValue519_124_1 = spill519_1;
        break lexical_join_124;
    }
    if (!((lexicalValue519_13_0 == spill519_1))) {
        break lexical_join_117;
    }
    life4_52 = ((((this.c)[0] >> __sourceIntrinsic_938da207dded_invokedynamic519_6(14772, (6561957519919006924L ^ life1_3))) & __sourceIntrinsic_938da207dded_invokedynamic519_7(20155, (36453311642022848L ^ life1_3))) + (((moom.Ee)(this.b)).a * __sourceIntrinsic_938da207dded_invokedynamic519_10(26968, (6945183941530424361L ^ life1_3))));
    life5_63 = ((this.c)[0] & __sourceIntrinsic_938da207dded_invokedynamic519_12(1103, (3358997268556347705L ^ life1_3)));
    life6_90 = ((((this.c)[0] >> __sourceIntrinsic_938da207dded_invokedynamic519_14(16210, (5343164932681089569L ^ life1_3))) & __sourceIntrinsic_938da207dded_invokedynamic519_15(10960, (4652620845900257194L ^ life1_3))) + (((moom.Ee)(this.b)).b * __sourceIntrinsic_938da207dded_invokedynamic519_18(11460, (5663432379520307638L ^ life1_3))));
    life7_97 = new moom.DT(life4_52, life5_63, life6_90);
    ((moom.Bs)(this)).a(((moom.yK)(new moom.z5(((moom.Br)(this.g)).b, life7_97))));
    spill519_2 = this;
    if (!((life3_5 != 0))) {
        lexicalValue519_109_0 = spill519_2;
        break lexical_join_109;
    }
    if (!(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.WorldServer)(((moom.Br)(((moom.Bs)(spill519_2)).g)).b)).a__fE(((moom.DT)(life7_97))))).a__ch())).i())) {
        break lexical_join_115;
    }
    lexicalValue519_109_0 = this;
    }
    ((moom.Bs)(lexicalValue519_109_0)).a(((net.minecraft.tileentity.TileEntity)(((net.minecraft.world.WorldServer)(((moom.Br)(this.g)).b)).a__B9(((moom.DT)(life7_97))))));
    }
    if (!((life3_5 == 0))) {
        break lexical_join_359;
    }
    }
    lexicalValue519_124_0 = this.d;
    lexicalValue519_124_1 = __sourceIntrinsic_938da207dded_invokedynamic519_32(31229, (3284473978861257865L ^ life1_3));
    }
    if (!((life3_5 != 0))) {
        lexicalValue519_256_0 = lexicalValue519_124_0;
        lexicalValue519_256_1 = lexicalValue519_124_1;
        break lexical_join_256;
    }
    if (!((lexicalValue519_124_0 != lexicalValue519_124_1))) {
        break lexical_join_248;
    }
    ((moom.Bs)(this)).a(((moom.yK)(new moom.z3(this.d, this.c, ((net.minecraft.world.WorldServer)(((moom.Br)(this.g)).b)).a__Fk(((int)(((moom.Ee)(this.b)).a)), ((int)(((moom.Ee)(this.b)).b)))))));
    life4_168 = 0;
    lexical_cycle_148: while (true) {
    lexical_join_244: {
    lexical_join_243: {
    if (!((life4_168 < this.d))) {
        break lexical_join_246;
    }
    life5_199 = ((((this.c)[life4_168] >> __sourceIntrinsic_938da207dded_invokedynamic519_45(6595, (5425830803598697663L ^ life1_3))) & __sourceIntrinsic_938da207dded_invokedynamic519_46(10960, (4652620845900257194L ^ life1_3))) + (((moom.Ee)(this.b)).a * __sourceIntrinsic_938da207dded_invokedynamic519_49(11460, (5663432379520307638L ^ life1_3))));
    life6_210 = ((this.c)[life4_168] & __sourceIntrinsic_938da207dded_invokedynamic519_51(31377, (7298687543135307748L ^ life1_3)));
    life7_237 = ((((this.c)[life4_168] >> __sourceIntrinsic_938da207dded_invokedynamic519_53(10195, (899845415734041258L ^ life1_3))) & __sourceIntrinsic_938da207dded_invokedynamic519_54(10960, (4652620845900257194L ^ life1_3))) + (((moom.Ee)(this.b)).b * __sourceIntrinsic_938da207dded_invokedynamic519_57(11460, (5663432379520307638L ^ life1_3))));
    life8_244 = new moom.DT(life5_199, life6_210, life7_237);
    if (!((life3_5 != 0))) {
        break lexical_join_244;
    }
    spill519_3 = this;
    if (!((life3_5 != 0))) {
        lexicalValue519_363_0 = spill519_3;
        break lexical_join_363;
    }
    if (!(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.WorldServer)(((moom.Br)(((moom.Bs)(spill519_3)).g)).b)).a__fE(((moom.DT)(life8_244))))).a__ch())).i())) {
        break lexical_join_243;
    }
    ((moom.Bs)(this)).a(((net.minecraft.tileentity.TileEntity)(((net.minecraft.world.WorldServer)(((moom.Br)(this.g)).b)).a__B9(((moom.DT)(life8_244))))));
    }
    life4_168 += 1;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_148; }
    break lexical_cycle_148;
    }
    }
    if (!((life3_5 == 0))) {
        break lexical_join_359;
    }
    }
    lexicalValue519_256_0 = ((moom.Ee)(this.b)).a;
    lexicalValue519_256_1 = __sourceIntrinsic_938da207dded_invokedynamic519_69(11460, (5663432379520307638L ^ life1_3));
    }
    life4_290 = (lexicalValue519_256_0 * lexicalValue519_256_1);
    life5_300 = (((moom.Ee)(this.b)).b * __sourceIntrinsic_938da207dded_invokedynamic519_72(11460, (5663432379520307638L ^ life1_3)));
    ((moom.Bs)(this)).a(((moom.yK)(new moom.z1(((net.minecraft.world.WorldServer)(((moom.Br)(this.g)).b)).a__Fk(((int)(((moom.Ee)(this.b)).a)), ((int)(((moom.Ee)(this.b)).b))), false, this.e))));
    life6_320 = 0;
    lexical_cycle_288: while (true) {
    lexical_join_357: {
    lexical_join_356: {
    lexical_join_309: {
    if (!((life6_320 < __sourceIntrinsic_938da207dded_invokedynamic519_82(11460, (5663432379520307638L ^ life1_3))))) {
        break lexical_join_359;
    }
    spill519_4 = this;
    if (!((life3_5 != 0))) {
        lexicalValue519_363_0 = spill519_4;
        break lexical_join_363;
    }
    spill519_5 = (((moom.Bs)(spill519_4)).e & (1 << life6_320));
    if (!((life3_5 != 0))) {
        lexicalValue519_309_0 = spill519_5;
        break lexical_join_309;
    }
    if (!((spill519_5 != 0))) {
        break lexical_join_356;
    }
    lexicalValue519_309_0 = (life6_320 << 4);
    }
    life7_351 = lexicalValue519_309_0;
    life8_380 = ((net.minecraft.world.WorldServer)(((moom.Br)(this.g)).b)).a__sourceReturn_f9b4ca7e0a(((int)(life4_290)), ((int)(life7_351)), ((int)(life5_300)), ((int)((life4_290 + __sourceIntrinsic_938da207dded_invokedynamic519_86(11460, (5663432379520307638L ^ life1_3))))), ((int)((life7_351 + __sourceIntrinsic_938da207dded_invokedynamic519_87(11460, (5663432379520307638L ^ life1_3))))), ((int)((life5_300 + __sourceIntrinsic_938da207dded_invokedynamic519_88(11460, (5663432379520307638L ^ life1_3))))));
    life9_383 = ((java.util.List)(life8_380)).iterator();
    lexical_cycle_342: while (true) {
    if (!(((java.util.Iterator)(life9_383)).hasNext())) {
        break lexical_join_356;
    }
    life10_390 = ((net.minecraft.tileentity.TileEntity)(((java.util.Iterator)(life9_383)).next()));
    ((moom.Bs)(this)).a(((net.minecraft.tileentity.TileEntity)(life10_390)));
    if (!((life3_5 != 0))) {
        break lexical_join_357;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_342; }
    break lexical_cycle_342;
    }
    }
    life6_320 += 1;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_288; }
    break lexical_cycle_288;
    }
    }
    this.d = ((int)(0));
    lexicalValue519_363_0 = this;
    }
    ((moom.Bs)(lexicalValue519_363_0)).e = ((int)(0));
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3987_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bs"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Bs.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10788);
    if (((moom.Bs.m)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Bs.l)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Bs.n)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Bs.n)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Bs", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Bs.m)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Bs.m)[life3_8])).longValue();
}


public void b(net.minecraft.entity.player.EntityPlayerMP p0) {
moom.Bs forwardValue1557_14_0;
    int forwardValue1557_52_0;
    int forwardValue1557_58_0;
    moom.Bs forwardValue1557_110_0;
    moom.Bs spill1557_0;
    boolean spill1557_1;
    moom.Bs spill1557_2;
    long life2_3;
    int life4_5;
    net.minecraft.world.chunk.Chunk life5_29;
    long life6_100;
    forward_join_120: {
    forward_join_110: {
    forward_join_109: {
    forward_join_58: {
    forward_join_52: {
    forward_join_38: {
    forward_join_14: {
    life2_3 = (moom.Bs.h ^ 138023249136642L);
    life4_5 = ((net.minecraft.server.management.ServerConfigurationManager.c__Boolean()) ? 1 : 0);
    spill1557_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue1557_14_0 = spill1557_0;
        break forward_join_14;
    }
    if (!(((java.util.List)(((moom.Bs)(spill1557_0)).a)).contains(((java.lang.Object)(p0))))) {
        break forward_join_120;
    }
    forwardValue1557_14_0 = this;
    }
    life5_29 = ((net.minecraft.world.WorldServer)(((moom.Br)(((moom.Bs)(forwardValue1557_14_0)).g)).b)).a__Fk(((int)(((moom.Ee)(this.b)).a)), ((int)(((moom.Ee)(this.b)).b)));
    spill1557_1 = ((net.minecraft.world.chunk.Chunk)(life5_29)).b__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue1557_52_0 = ((spill1557_1) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill1557_1)) {
        break forward_join_38;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.z1(life5_29, true, 0))));
    }
    ((java.util.List)(this.a)).remove(((java.lang.Object)(p0)));
    ((java.util.List)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cl)).remove(((java.lang.Object)(this.b)));
    forwardValue1557_52_0 = ((((java.util.List)(this.a)).isEmpty()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue1557_58_0 = forwardValue1557_52_0;
        break forward_join_58;
    }
    if (!((forwardValue1557_52_0 != 0))) {
        break forward_join_120;
    }
    forwardValue1557_58_0 = ((moom.Ee)(this.b)).a;
    }
    life6_100 = ((((long) forwardValue1557_58_0) + __sourceIntrinsic_a26650c7385b_invokedynamic1557_26(1958, (1692658017240368868L ^ life2_3))) | ((((long) ((moom.Ee)(this.b)).b) + __sourceIntrinsic_a26650c7385b_invokedynamic1557_29(11888, (6910446499926994739L ^ life2_3))) << __sourceIntrinsic_a26650c7385b_invokedynamic1557_30(29912, (9032948549385427837L ^ life2_3))));
    ((moom.Bs)(this)).a(((net.minecraft.world.chunk.Chunk)(life5_29)));
    ((moom.Do)(((moom.Br)(this.g)).d)).b(((long)(life6_100)));
    ((java.util.List)(((moom.Br)(this.g)).f)).remove(((java.lang.Object)(this)));
    spill1557_2 = this;
    if (!((life4_5 != 0))) {
        forwardValue1557_110_0 = spill1557_2;
        break forward_join_110;
    }
    if (!((((moom.Bs)(spill1557_2)).d > 0))) {
        break forward_join_109;
    }
    ((java.util.List)(((moom.Br)(this.g)).e)).remove(((java.lang.Object)(this)));
    }
    forwardValue1557_110_0 = this;
    }
    ((net.minecraft.world.gen.ChunkProviderServer)(((net.minecraft.world.WorldServer)(((moom.Br)(((moom.Bs)(forwardValue1557_110_0)).g)).a())).Z)).a__Void(((int)(((moom.Ee)(this.b)).a)), ((int)(((moom.Ee)(this.b)).b)));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3990_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bs"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4C4;
        if (j[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Bs", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Bs.j[n4] = n6;
        }
        return j[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Bs.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.entity.player.EntityPlayerMP p0) {
int forwardValue1554_41_0;
    int forwardValue1554_60_0;
    boolean spill1554_0;
    long life2_3;
    int life4_5;
    forward_join_61: {
    forward_join_60: {
    forward_join_50: {
    forward_join_41: {
    forward_join_38: {
    life2_3 = (moom.Bs.h ^ 1875899812549L);
    life4_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill1554_0 = ((java.util.List)(this.a)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue1554_41_0 = ((spill1554_0) ? 1 : 0);
        break forward_join_41;
    }
    if (!(spill1554_0)) {
        break forward_join_38;
    }
    ((org.apache.logging.log4j.Logger)(moom.Br.a)).debug(((java.lang.String)("Failed to add player. {} already is in chunk {}, {}")), ((java.lang.Object[])(new java.lang.Object[] {p0, java.lang.Integer.valueOf(((int)(((moom.Ee)(this.b)).a))), java.lang.Integer.valueOf(((int)(((moom.Ee)(this.b)).b)))})));
    if (!((life4_5 != 0))) {
        break forward_join_61;
    }
    }
    forwardValue1554_41_0 = ((((java.util.List)(this.a)).isEmpty()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue1554_60_0 = forwardValue1554_41_0;
        break forward_join_60;
    }
    if (!((forwardValue1554_41_0 != 0))) {
        break forward_join_50;
    }
    this.f = ((long)(((net.minecraft.world.WorldServer)(((moom.Br)(this.g)).b)).b__Long()));
    }
    ((java.util.List)(this.a)).add(((java.lang.Object)(p0)));
    forwardValue1554_60_0 = ((((java.util.List)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cl)).add(((java.lang.Object)(this.b)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1554_60_0);
    }
    return;
}


private void a(net.minecraft.tileentity.TileEntity p0) {
net.minecraft.tileentity.TileEntity forwardValue1555_11_0;
    net.minecraft.tileentity.TileEntity spill1555_0;
    long life2_3;
    int life4_5;
    moom.yK life5_15;
    forward_join_18: {
    forward_join_11: {
    life2_3 = (moom.Bs.h ^ 38507750203995L);
    life4_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill1555_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1555_11_0 = spill1555_0;
        break forward_join_11;
    }
    if (!((spill1555_0 != null))) {
        break forward_join_18;
    }
    forwardValue1555_11_0 = p0;
    }
    life5_15 = ((net.minecraft.tileentity.TileEntity)(forwardValue1555_11_0)).a__yK();
    if (!((life5_15 != null))) {
        break forward_join_18;
    }
    ((moom.Bs)(this)).a(((moom.yK)(life5_15)));
    }
    return;
}


public void a(moom.yK p0) {
net.minecraft.entity.player.EntityPlayerMP lexicalValue518_26_0;
    boolean spill518_0;
    net.minecraft.entity.player.EntityPlayerMP spill518_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    net.minecraft.entity.player.EntityPlayerMP life6_16;
    lexical_join_31: {
    life2_3 = (moom.Bs.h ^ 99095245852966L);
    spill518_0 = net.minecraft.server.management.ServerConfigurationManager.c__Boolean();
    life5_8 = ((java.util.List)(this.a)).iterator();
    life4_9 = ((spill518_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_29: {
    lexical_join_26: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_31;
    }
    life6_16 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life5_8)).next()));
    spill518_1 = life6_16;
    if (!((life4_9 != 0))) {
        lexicalValue518_26_0 = spill518_1;
        break lexical_join_26;
    }
    if (!((!((java.util.List)(((net.minecraft.entity.player.EntityPlayerMP)(spill518_1)).cl)).contains(((java.lang.Object)(this.b)))))) {
        break lexical_join_29;
    }
    lexicalValue518_26_0 = life6_16;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue518_26_0)).cg)).a(((moom.yK)(p0)));
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(int p0, int p1, int p2) {
int lexicalValue517_29_0;
    int lexicalValue517_53_0;
    int lexicalValue517_53_1;
    short[] lexicalValue517_83_0;
    int lexicalValue517_83_1;
    int spill517_0;
    int spill517_1;
    short[] spill517_2;
    int spill517_3;
    short[] spill517_4;
    int spill517_5;
    long life4_3;
    int life6_5;
    int life7_67;
    int life8_69;
    lexical_join_85: {
    lexical_join_83: {
    lexical_join_74: {
    lexical_join_53: {
    lexical_join_29: {
    lexical_join_17: {
    life4_3 = (moom.Bs.h ^ 38269118785538L);
    life6_5 = ((net.minecraft.server.management.ServerConfigurationManager.c__Boolean()) ? 1 : 0);
    spill517_0 = this.d;
    if (!((life6_5 != 0))) {
        lexicalValue517_29_0 = spill517_0;
        break lexical_join_29;
    }
    if (!((spill517_0 == 0))) {
        break lexical_join_17;
    }
    ((java.util.List)(((moom.Br)(this.g)).e)).add(((java.lang.Object)(this)));
    }
    moom.Bs __stackOp517_7_0 = this;
    ((moom.Bs)(__stackOp517_7_0)).e = ((int)((((moom.Bs)(__stackOp517_7_0)).e | (1 << (p1 >> 4)))));
    lexicalValue517_29_0 = this.d;
    }
    spill517_1 = __sourceIntrinsic_e4d4f5a69301_invokedynamic517_11(31229, (3284444784564400731L ^ life4_3));
    if (!((life6_5 != 0))) {
        lexicalValue517_53_0 = lexicalValue517_29_0;
        lexicalValue517_53_1 = spill517_1;
        break lexical_join_53;
    }
    if (!((lexicalValue517_29_0 < spill517_1))) {
        break lexical_join_85;
    }
    lexicalValue517_53_0 = ((p0 << __sourceIntrinsic_e4d4f5a69301_invokedynamic517_12(6595, (5425736742131798637L ^ life4_3))) | (p2 << __sourceIntrinsic_e4d4f5a69301_invokedynamic517_13(10195, (899767941573454968L ^ life4_3))));
    lexicalValue517_53_1 = p1;
    }
    life7_67 = ((short) (lexicalValue517_53_0 | lexicalValue517_53_1));
    life8_69 = 0;
    lexical_cycle_58: while (true) {
    lexical_join_71: {
    if (!((life8_69 < this.d))) {
        break lexical_join_74;
    }
    spill517_2 = this.c;
    spill517_3 = life8_69;
    if (!((life6_5 != 0))) {
        lexicalValue517_83_0 = spill517_2;
        lexicalValue517_83_1 = spill517_3;
        break lexical_join_83;
    }
    if (!(((spill517_2)[spill517_3] == life7_67))) {
        break lexical_join_71;
    }
    return;
    }
    life8_69 += 1;
    if (!((life6_5 == 0))) { continue lexical_cycle_58; }
    break lexical_cycle_58;
    }
    }
    spill517_4 = this.c;
    moom.Bs __stackOp517_17_0 = this;
    moom.Bs __stackOp517_19_0 = __stackOp517_17_0;
    int __stackOp517_19_1 = ((moom.Bs)(__stackOp517_17_0)).d;
    spill517_5 = __stackOp517_19_1;
    ((moom.Bs)(__stackOp517_19_0)).d = ((int)((__stackOp517_19_1 + 1)));
    lexicalValue517_83_0 = spill517_4;
    lexicalValue517_83_1 = spill517_5;
    }
    (lexicalValue517_83_0)[lexicalValue517_83_1] = ((short)(life7_67));
    }
    return;
}


private void a(net.minecraft.world.chunk.Chunk p0) {
((net.minecraft.world.chunk.Chunk)(p0)).b(((long)(((((net.minecraft.world.chunk.Chunk)(p0)).a__Long() + ((net.minecraft.world.WorldServer)(((moom.Br)(this.g)).b)).b__Long()) - this.f))));
    this.f = ((long)(((net.minecraft.world.WorldServer)(((moom.Br)(this.g)).b)).b__Long()));
    return;
}


public void a() {
((moom.Bs)(this)).a(((net.minecraft.world.chunk.Chunk)(((net.minecraft.world.WorldServer)(((moom.Br)(this.g)).b)).a__Fk(((int)(((moom.Ee)(this.b)).a)), ((int)(((moom.Ee)(this.b)).b))))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_3b2f8815bf9e6b90_originalDynamicSite1382_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic517_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic517_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic517_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3990_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic519_88(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3987_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a26650c7385b_invokedynamic1557_26(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a26650c7385b_invokedynamic1557_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a26650c7385b_invokedynamic1557_30(int a0, long a1) throws E;
}
