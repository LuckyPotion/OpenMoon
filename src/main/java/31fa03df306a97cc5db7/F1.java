package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;



















import moom.DT;





import net.minecraft.block.Block;



import moom.FY;



import net.minecraft.init.Blocks;
import java.util.Map;
public class F1 extends moom.F0 {

private java.util.Random c;

private net.minecraft.world.World d;

private moom.DT e;

int f;

int g;

double h;

double i;

double j;

double k;

int l;

int m;

int n;

java.util.List<moom.DW> o;

private static long q;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

public F1(boolean p0) { super(false); }


private static void __sourceConstructorBody_8d1c53d83667e021(moom.F1 receiver, boolean p0) throws Throwable {

long local2 = (moom.F1.q ^ 89722836801386L);

    moom.F1.__sourceConstructorInit_8d1c53d83667e021_0(((moom.F1)(receiver)), ((boolean)(p0)));

    ((moom.F1)(receiver)).e = ((moom.DT)(moom.DT.f));

    ((moom.F1)(receiver)).h = ((double)(0x1.3c6a7ef9db22dp-1d));

    ((moom.F1)(receiver)).i = ((double)(0x1.8624dd2f1a9fcp-2d));

    ((moom.F1)(receiver)).j = ((double)(0x1.0p0d));

    ((moom.F1)(receiver)).k = ((double)(0x1.0p0d));

    ((moom.F1)(receiver)).l = ((int)(1));

    ((moom.F1)(receiver)).m = ((int)(__sourceIntrinsic_8d1c53d83667e021_originalDynamicSite1982_9(29079, (6187566499499536740L ^ local2))));

    ((moom.F1)(receiver)).n = ((int)(__sourceIntrinsic_8d1c53d83667e021_originalDynamicSite1982_11(24746, (1059905173412864088L ^ local2))));

    return;

}



static {
q = ((long)(((moom._a)(moom._c.a(((long)(-103127196720919776L)), ((long)(-5551597232583429544L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(269688909487318L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.F1.q ^ 85715323827358L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill727_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill727_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill727_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill727_14 = new byte[8];
    (__sourceSpill727_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill727_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation727_16 = __sourceSpill727_14;
    ((javax.crypto.Cipher)(__sourceSpill727_11)).init(((int)(__sourceSpill727_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill727_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation727_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = " ¦èåÄ\022\"èçäúªÞr"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill727_25 = local6_life21;
        int __sourceSpill727_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill727_25)).substring(((int)(__sourceSpill727_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill727_30 = local8_life19;
        int __sourceSpill727_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill727_33 = new byte[8];
        (__sourceSpill727_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill727_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill727_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill727_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill727_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill727_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill727_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill727_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill727_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill727_34)).doFinal(((byte[])(__sourceSpill727_33)));
        (__sourceSpill727_30)[__sourceSpill727_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "kþ>þº^éÕ\rD_0\035Ìù"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill727_38 = local6_life21;
        int __sourceSpill727_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill727_38)).substring(((int)(__sourceSpill727_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill727_43 = local8_life19;
        int __sourceSpill727_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill727_46 = new byte[8];
        (__sourceSpill727_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill727_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill727_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill727_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill727_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill727_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill727_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill727_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill727_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill727_47)).doFinal(((byte[])(__sourceSpill727_46)));
        (__sourceSpill727_43)[__sourceSpill727_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_8d1c53d83667e021_0(moom.F1 a0, boolean a1) throws E;

float b(int p0) {
int forwardValue1865_11_0;
    int forwardValue1865_17_0;
    int forwardValue1865_21_0;
    float forwardValue1865_31_0;
    int spill1865_0;
    long life2_3;
    int[] life4_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_28: {
    forward_join_21: {
    forward_join_17: {
    forward_join_11: {
    life2_3 = (moom.F1.q ^ 69228600043375L);
    life4_5 = moom.FY.b();
    spill1865_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue1865_11_0 = spill1865_0;
        break forward_join_11;
    }
    if (!((spill1865_0 >= 0))) {
        break forward_join_30;
    }
    forwardValue1865_11_0 = p0;
    }
    if (!((life4_5 != null))) {
        forwardValue1865_17_0 = forwardValue1865_11_0;
        break forward_join_17;
    }
    if (!((forwardValue1865_11_0 < this.n))) {
        break forward_join_30;
    }
    forwardValue1865_17_0 = p0;
    }
    if (!((life4_5 != null))) {
        forwardValue1865_21_0 = forwardValue1865_17_0;
        break forward_join_21;
    }
    if (!((forwardValue1865_17_0 != 0))) {
        break forward_join_28;
    }
    forwardValue1865_21_0 = p0;
    }
    if (!((forwardValue1865_21_0 != (this.n - 1)))) {
        break forward_join_28;
    }
    forwardValue1865_31_0 = 0x1.8p1f;
    break forward_join_31;
    }
    forwardValue1865_31_0 = 0x1.0p1f;
    break forward_join_31;
    }
    forwardValue1865_31_0 = -0x1.0p0f;
    }
    return forwardValue1865_31_0;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


void b__sourceReturn_da8c82d5d4() {
int forestValue608_41_0;
    int forestValue608_54_0;
    int forestValue608_54_1;
    int forestValue608_93_0;
    int forestValue608_93_1;
    double forestValue608_196_0;
    int forestValue608_197_0;
    int[] spill608_0;
    int spill608_1;
    int spill608_2;
    int spill608_3;
    int spill608_4;
    int spill608_5;
    double spill608_6;
    long life1_3;
    int[] life3_14;
    int life4_43;
    int life5_58;
    int life6_64;
    float life7_85;
    int life8_94;
    double life9_110;
    double life11_119;
    double life13_126;
    double life15_133;
    moom.DT life17_143;
    moom.DT life18_148;
    int life19_166;
    int life20_173;
    double life21_190;
    int life23_203;
    moom.DT life24_214;
    forest_join_238: {
    forest_join_233: {
    forest_join_54: {
    forest_join_49: {
    forest_join_41: {
    forest_join_28: {
    life1_3 = (moom.F1.q ^ 95875245825780L);
    spill608_0 = moom.FY.b();
    this.g = ((int)(((int) (((double) this.f) * this.h))));
    life3_14 = spill608_0;
    spill608_1 = this.g;
    if (!((life3_14 != null))) {
        forestValue608_41_0 = spill608_1;
        break forest_join_41;
    }
    if (!((spill608_1 >= this.f))) {
        break forest_join_28;
    }
    this.g = ((int)((this.f - 1)));
    }
    forestValue608_41_0 = ((int) (0x1.61cac083126e9p0d + java.lang.Math.pow(((double)(((this.k * ((double) this.f)) / 0x1.ap3d))), ((double)(0x1.0p1d)))));
    }
    life4_43 = forestValue608_41_0;
    spill608_2 = life4_43;
    spill608_3 = 1;
    if (!((life3_14 != null))) {
        forestValue608_54_0 = spill608_2;
        forestValue608_54_1 = spill608_3;
        break forest_join_54;
    }
    if (!((spill608_2 < spill608_3))) {
        break forest_join_49;
    }
    life4_43 = 1;
    }
    forestValue608_54_0 = ((moom.DT)(this.e)).b();
    forestValue608_54_1 = this.g;
    }
    life5_58 = (forestValue608_54_0 + forestValue608_54_1);
    life6_64 = (this.f - this.n);
    this.o = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((java.util.List)(this.o)).add(((java.lang.Object)(new moom.DW(((moom.DT)(this.e)).a(((int)(life6_64))), life5_58))));
    forest_cycle_77: while (true) {
    forest_join_231: {
    forest_join_230: {
    if (!((life6_64 >= 0))) {
        break forest_join_233;
    }
    life7_85 = ((moom.F1)(this)).a(((int)(life6_64)));
    if (!((life3_14 != null))) {
        break forest_join_231;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life7_85)), ((float)(0x0.0p0f))) >= 0))) {
        break forest_join_230;
    }
    life8_94 = 0;
    forest_cycle_91: while (true) {
    forest_join_228: {
    forest_join_227: {
    forest_join_197: {
    forest_join_196: {
    forest_join_195: {
    forestValue608_93_0 = life8_94;
    forestValue608_93_1 = life4_43;
    forest_cycle_93: while (true) {
    if (!((forestValue608_93_0 < forestValue608_93_1))) {
        break forest_join_230;
    }
    life9_110 = ((this.j * ((double) life7_85)) * (((double) ((java.util.Random)(this.c)).nextFloat()) + 0x1.4fdf3b645a1cbp-2d));
    life11_119 = (((double) (((java.util.Random)(this.c)).nextFloat() * 0x1.0p1f)) * 0x1.921fb54442d18p1d);
    life13_126 = ((life9_110 * java.lang.Math.sin(((double)(life11_119)))) + 0x1.0p-1d);
    life15_133 = ((life9_110 * java.lang.Math.cos(((double)(life11_119)))) + 0x1.0p-1d);
    life17_143 = __sourceExactCall_85f83ee78344f7(((moom.DT)(this.e)), ((double)(life13_126)), ((double)(((double) (life6_64 - 1)))), ((double)(life15_133)));
    life18_148 = ((moom.DT)(life17_143)).a(((int)(this.n)));
    if (!((life3_14 != null))) {
        break forest_join_228;
    }
    spill608_4 = ((moom.F1)(this)).a(((moom.DT)(life17_143)), ((moom.DT)(life18_148)));
    spill608_5 = -1;
    if (!((life3_14 != null))) {
        forestValue608_93_0 = spill608_4;
        forestValue608_93_1 = spill608_5;
        continue forest_cycle_93;
    }
    break forest_cycle_93;
    }
    if (!((spill608_4 == spill608_5))) {
        break forest_join_227;
    }
    life19_166 = (((moom.DT)(this.e)).a() - ((moom.DT)(life17_143)).a());
    life20_173 = (((moom.DT)(this.e)).c() - ((moom.DT)(life17_143)).c());
    life21_190 = (((double) ((moom.DT)(life17_143)).b()) - (java.lang.Math.sqrt(((double)(((double) ((life19_166 * life19_166) + (life20_173 * life20_173)))))) * this.i));
    spill608_6 = life21_190;
    if (!((life3_14 != null))) {
        forestValue608_196_0 = spill608_6;
        break forest_join_196;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill608_6)), ((double)(((double) life5_58)))) > 0))) {
        break forest_join_195;
    }
    forestValue608_197_0 = life5_58;
    break forest_join_197;
    }
    forestValue608_196_0 = life21_190;
    }
    forestValue608_197_0 = ((int) forestValue608_196_0);
    }
    life23_203 = forestValue608_197_0;
    life24_214 = new moom.DT(((moom.DT)(this.e)).a(), life23_203, ((moom.DT)(this.e)).c());
    if (!((life3_14 != null))) {
        break forest_join_228;
    }
    if (!((((moom.F1)(this)).a(((moom.DT)(life24_214)), ((moom.DT)(life17_143))) == -1))) {
        break forest_join_227;
    }
    ((java.util.List)(this.o)).add(((java.lang.Object)(new moom.DW(life17_143, ((moom.DT)(life24_214)).b()))));
    }
    life8_94 += 1;
    }
    if (!((life3_14 == null))) {
        continue forest_cycle_91;
    }
    break forest_cycle_91;
    }
    }
    life6_64 += -1;
    }
    if (!((life3_14 == null))) {
        continue forest_cycle_77;
    }
    break forest_cycle_77;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forest_join_238;
    }
    moom.FY.b(((int[])(new int[3])));
    }
    return;
}


void e() {
int lexicalValue610_46_0;
    moom.F1 lexicalValue610_48_0;
    int[] spill610_0;
    boolean spill610_1;
    moom.F1 spill610_2;
    long life1_3;
    java.util.Iterator life4_8;
    int[] life3_9;
    moom.DW life5_16;
    int life6_19;
    moom.DT life7_30;
    lexical_join_54: {
    life1_3 = (moom.F1.q ^ 4274298051046L);
    spill610_0 = moom.FY.b();
    life4_8 = ((java.util.List)(this.o)).iterator();
    life3_9 = spill610_0;
    lexical_cycle_10: while (true) {
    lexical_join_52: {
    lexical_join_48: {
    lexical_join_46: {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_54;
    }
    life5_16 = ((moom.DW)(((java.util.Iterator)(life4_8)).next()));
    life6_19 = ((moom.DW)(life5_16)).d();
    life7_30 = new moom.DT(((moom.DT)(this.e)).a(), life6_19, ((moom.DT)(this.e)).c());
    spill610_1 = ((moom.DT)(life7_30)).equals(((java.lang.Object)(life5_16)));
    if (!((life3_9 != null))) {
        lexicalValue610_46_0 = ((spill610_1) ? 1 : 0);
        break lexical_join_46;
    }
    if (!((!spill610_1))) {
        break lexical_join_52;
    }
    spill610_2 = this;
    if (!((life3_9 != null))) {
        lexicalValue610_48_0 = spill610_2;
        break lexical_join_48;
    }
    lexicalValue610_46_0 = ((((moom.F1)(spill610_2)).a__Boolean(((int)((life6_19 - ((moom.DT)(this.e)).b()))))) ? 1 : 0);
    }
    if (!((lexicalValue610_46_0 != 0))) {
        break lexical_join_52;
    }
    lexicalValue610_48_0 = this;
    }
    ((moom.F1)(lexicalValue610_48_0)).a(((moom.DT)(life7_30)), ((moom.DT)(life5_16)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)));
    }
    if (!((life3_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


void c() {
int[] spill609_0;
    long life1_3;
    java.util.Iterator life4_8;
    int[] life3_9;
    moom.DW life5_16;
    lexical_join_22: {
    life1_3 = (moom.F1.q ^ 50176424495743L);
    spill609_0 = moom.FY.b();
    life4_8 = ((java.util.List)(this.o)).iterator();
    life3_9 = spill609_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_22;
    }
    life5_16 = ((moom.DW)(((java.util.Iterator)(life4_8)).next()));
    ((moom.F1)(this)).a__Void(((moom.DT)(life5_16)));
    if (!((life3_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


void d() {
block3: {
            F1 f1;
            Block block;
            DT dT;
            DT dT2;
            block2: {
                long l = moom.F1.q ^ 0x4DD23B9232E3L;
                dT2 = this.e;
                dT = this.e.a(this.g);
                int[] nArray = FY.b();
                block = Blocks.r;
                this.a(dT2, dT, block);
                int[] nArray2 = nArray;
                f1 = this;
                if (nArray2 == null) break block2;
                if (f1.l != 2) break block3;
                this.a(dT2.f(), dT.f(), block);
                this.a(dT2.f().d__DT(), dT.f().d__DT(), block);
                f1 = this;
            }
            f1.a(dT2.d__DT(), dT.d__DT(), block);
        }
}


void a(moom.DT p0, float p1, net.minecraft.block.state.IBlockState p2) {
int forestValue609_16_0;
    moom.fn forestValue609_67_0;
    moom.fn forestValue609_67_1;
    int[] spill609_0;
    int spill609_1;
    moom.fn spill609_2;
    moom.fn spill609_3;
    long life4_3;
    int life7_10;
    int[] life6_11;
    int life8_14;
    int life9_20;
    moom.DT life10_52;
    moom.fn life11_59;
    forest_join_80: {
    life4_3 = (moom.F1.q ^ 19075299776571L);
    spill609_0 = moom.FY.b();
    life7_10 = ((int) (((double) p1) + 0x1.3c6a7ef9db22dp-1d));
    life6_11 = spill609_0;
    life8_14 = (-life7_10);
    forest_cycle_15: while (true) {
    forest_join_77: {
    forestValue609_16_0 = life8_14;
    forest_cycle_16: while (true) {
    if (!((forestValue609_16_0 <= life7_10))) {
        break forest_join_80;
    }
    life9_20 = (-life7_10);
    forest_cycle_21: while (true) {
    forest_join_74: {
    forest_join_68: {
    forest_join_67: {
    if (!((life9_20 <= life7_10))) {
        break forest_join_77;
    }
    spill609_1 = recovery.source.CarrierOps.dcmpg(((double)((java.lang.Math.pow(((double)((((double) java.lang.Math.abs(((int)(life8_14)))) + 0x1.0p-1d))), ((double)(0x1.0p1d))) + java.lang.Math.pow(((double)((((double) java.lang.Math.abs(((int)(life9_20)))) + 0x1.0p-1d))), ((double)(0x1.0p1d)))))), ((double)(((double) (p1 * p1)))));
    if (!((life6_11 != null))) {
        forestValue609_16_0 = spill609_1;
        continue forest_cycle_16;
    }
    if (!((spill609_1 <= 0))) {
        break forest_join_74;
    }
    life10_52 = ((moom.DT)(p0)).a(((int)(life8_14)), ((int)(0)), ((int)(life9_20)));
    life11_59 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(life10_52))))).a__ch())).a__fn();
    spill609_2 = life11_59;
    spill609_3 = moom.fn.a;
    if (!((life6_11 != null))) {
        forestValue609_67_0 = spill609_2;
        forestValue609_67_1 = spill609_3;
        break forest_join_67;
    }
    if (!((spill609_2 != spill609_3))) {
        break forest_join_68;
    }
    forestValue609_67_0 = life11_59;
    forestValue609_67_1 = moom.fn.j;
    }
    if (!((forestValue609_67_0 == forestValue609_67_1))) {
        break forest_join_74;
    }
    }
    ((moom.F1)(this)).a(((net.minecraft.world.World)(this.d)), ((moom.DT)(life10_52)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    life9_20 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    break forest_cycle_16;
    }
    }
    life8_14 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    return;
}


float a(int p0) {
int forwardValue1854_21_0;
    int forwardValue1854_55_0;
    float forwardValue1854_60_0;
    float forwardValue1854_60_1;
    int spill1854_0;
    int spill1854_1;
    float spill1854_2;
    float spill1854_3;
    long life2_3;
    int[] life4_5;
    float life5_29;
    float life6_34;
    float life7_43;
    forward_join_60: {
    forward_join_58: {
    forward_join_55: {
    forward_join_49: {
    forward_join_21: {
    forward_join_19: {
    life2_3 = (moom.F1.q ^ 130127992011285L);
    life4_5 = moom.FY.b();
    spill1854_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p0))), ((float)((((float) this.f) * 0x1.333334p-2f))));
    if (!((life4_5 != null))) {
        forwardValue1854_21_0 = spill1854_0;
        break forward_join_21;
    }
    if (!((spill1854_0 < 0))) {
        break forward_join_19;
    }
    return -0x1.0p0f;
    }
    forwardValue1854_21_0 = this.f;
    }
    life5_29 = (((float) forwardValue1854_21_0) / 0x1.0p1f);
    life6_34 = (life5_29 - ((float) p0));
    life7_43 = moom.Dr.c(((float)(((life5_29 * life5_29) - (life6_34 * life6_34)))));
    spill1854_1 = recovery.source.CarrierOps.fcmpl(((float)(life6_34)), ((float)(0x0.0p0f)));
    if (!((life4_5 != null))) {
        forwardValue1854_55_0 = spill1854_1;
        break forward_join_55;
    }
    if (!((spill1854_1 == 0))) {
        break forward_join_49;
    }
    life7_43 = life5_29;
    if (!((life4_5 == null))) {
        break forward_join_58;
    }
    }
    spill1854_2 = java.lang.Math.abs(((float)(life6_34)));
    spill1854_3 = life5_29;
    if (!((life4_5 != null))) {
        forwardValue1854_60_0 = spill1854_2;
        forwardValue1854_60_1 = spill1854_3;
        break forward_join_60;
    }
    forwardValue1854_55_0 = recovery.source.CarrierOps.fcmpl(((float)(spill1854_2)), ((float)(spill1854_3)));
    }
    if (!((forwardValue1854_55_0 >= 0))) {
        break forward_join_58;
    }
    return 0x0.0p0f;
    }
    forwardValue1854_60_0 = life7_43;
    forwardValue1854_60_1 = 0x1.0p-1f;
    }
    return (forwardValue1854_60_0 * forwardValue1854_60_1);
}


private boolean a__Boolean() {
net.minecraft.block.Block forwardValue1859_20_0;
    net.minecraft.block.Block forwardValue1859_26_0;
    net.minecraft.block.Block forwardValue1859_26_1;
    int forwardValue1859_56_0;
    int forwardValue1859_56_1;
    int forwardValue1859_63_0;
    int[] spill1859_0;
    net.minecraft.block.Block spill1859_1;
    moom.dC spill1859_2;
    int spill1859_3;
    int spill1859_4;
    int spill1859_5;
    long life1_3;
    net.minecraft.block.Block life4_12;
    int[] life3_13;
    int life5_54;
    forward_join_63: {
    forward_join_59: {
    forward_join_56: {
    forward_join_48: {
    forward_join_29: {
    forward_join_26: {
    forward_join_20: {
    life1_3 = (moom.F1.q ^ 16142403970271L);
    spill1859_0 = moom.FY.b();
    life4_12 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(((moom.DT)(this.e)).b__DT()))))).a__ch();
    life3_13 = spill1859_0;
    spill1859_1 = life4_12;
    if (!((life3_13 != null))) {
        forwardValue1859_20_0 = spill1859_1;
        break forward_join_20;
    }
    if (!((spill1859_1 != net.minecraft.init.Blocks.d))) {
        break forward_join_29;
    }
    forwardValue1859_20_0 = life4_12;
    }
    spill1859_2 = net.minecraft.init.Blocks.c;
    if (!((life3_13 != null))) {
        forwardValue1859_26_0 = forwardValue1859_20_0;
        forwardValue1859_26_1 = spill1859_2;
        break forward_join_26;
    }
    if (!((forwardValue1859_20_0 != spill1859_2))) {
        break forward_join_29;
    }
    forwardValue1859_26_0 = life4_12;
    forwardValue1859_26_1 = net.minecraft.init.Blocks.ak;
    }
    if (!((forwardValue1859_26_0 != forwardValue1859_26_1))) {
        break forward_join_29;
    }
    return ((0) != 0);
    }
    life5_54 = ((moom.F1)(this)).a(((moom.DT)(this.e)), ((moom.DT)(((moom.DT)(this.e)).a(((int)((this.f - 1)))))));
    spill1859_3 = life5_54;
    spill1859_4 = -1;
    if (!((life3_13 != null))) {
        forwardValue1859_56_0 = spill1859_3;
        forwardValue1859_56_1 = spill1859_4;
        break forward_join_56;
    }
    if (!((spill1859_3 == spill1859_4))) {
        break forward_join_48;
    }
    return ((1) != 0);
    }
    spill1859_5 = life5_54;
    if (!((life3_13 != null))) {
        forwardValue1859_63_0 = spill1859_5;
        break forward_join_63;
    }
    forwardValue1859_56_0 = spill1859_5;
    forwardValue1859_56_1 = __sourceIntrinsic_1a14968dced5_invokedynamic1859_17(15006, (5242764587334257115L ^ life1_3));
    }
    if (!((forwardValue1859_56_0 < forwardValue1859_56_1))) {
        break forward_join_59;
    }
    return ((0) != 0);
    }
    this.f = ((int)(life5_54));
    forwardValue1859_63_0 = 1;
    }
    return ((forwardValue1859_63_0) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forwardValue1861_35_0;
    int forwardValue1861_49_0;
    int[] spill1861_0;
    int spill1861_1;
    long life4_3;
    int[] life6_18;
    forward_join_49: {
    forward_join_40: {
    forward_join_35: {
    forward_join_33: {
    life4_3 = (moom.F1.q ^ 55649120591032L);
    this.d = ((net.minecraft.world.World)(p0));
    spill1861_0 = moom.FY.b();
    this.e = ((moom.DT)(p2));
    this.c = ((java.util.Random)(new java.util.Random(((java.util.Random)(p1)).nextLong())));
    life6_18 = spill1861_0;
    spill1861_1 = this.f;
    if (!((life6_18 != null))) {
        forwardValue1861_35_0 = spill1861_1;
        break forward_join_35;
    }
    if (!((spill1861_1 == 0))) {
        break forward_join_33;
    }
    this.f = ((int)((5 + ((java.util.Random)(this.c)).nextInt(((int)(this.m))))));
    }
    forwardValue1861_35_0 = ((((moom.F1)(this)).a__Boolean()) ? 1 : 0);
    }
    if (!((life6_18 != null))) {
        forwardValue1861_49_0 = forwardValue1861_35_0;
        break forward_join_49;
    }
    if (!((forwardValue1861_35_0 == 0))) {
        break forward_join_40;
    }
    return ((0) != 0);
    }
    ((moom.F1)(this)).b__sourceReturn_da8c82d5d4();
    ((moom.F1)(this)).c();
    ((moom.F1)(this)).d();
    ((moom.F1)(this)).e();
    forwardValue1861_49_0 = 1;
    }
    return ((forwardValue1861_49_0) != 0);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20060;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/F1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_bbb09b73bb09f9(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4416_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/F1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


void a(moom.DT p0, moom.DT p1, net.minecraft.block.Block p2) {
int[] spill606_0;
    long life4_3;
    moom.DT life7_15;
    int life8_20;
    int[] life6_21;
    float life9_28;
    float life10_35;
    float life11_42;
    int life12_44;
    moom.DT life13_71;
    net.minecraft.block.BlockLog$EnumAxis life14_76;
    lexical_join_90: {
    life4_3 = (moom.F1.q ^ 2194661602344L);
    life7_15 = ((moom.DT)(p1)).a(((int)((-((moom.DT)(p0)).a()))), ((int)((-((moom.DT)(p0)).b()))), ((int)((-((moom.DT)(p0)).c()))));
    spill606_0 = moom.FY.b();
    life8_20 = ((moom.F1)(this)).a(((moom.DT)(life7_15)));
    life6_21 = spill606_0;
    life9_28 = (((float) ((moom.DT)(life7_15)).a()) / ((float) life8_20));
    life10_35 = (((float) ((moom.DT)(life7_15)).b()) / ((float) life8_20));
    life11_42 = (((float) ((moom.DT)(life7_15)).c()) / ((float) life8_20));
    life12_44 = 0;
    lexical_cycle_45: while (true) {
    if (!((life12_44 <= life8_20))) {
        break lexical_join_90;
    }
    life13_71 = __sourceExactCall_85f83ee78344f7(((moom.DT)(p0)), ((double)(((double) (0x1.0p-1f + (((float) life12_44) * life9_28))))), ((double)(((double) (0x1.0p-1f + (((float) life12_44) * life10_35))))), ((double)(((double) (0x1.0p-1f + (((float) life12_44) * life11_42))))));
    life14_76 = ((moom.F1)(this)).a__R(((moom.DT)(p0)), ((moom.DT)(life13_71)));
    ((moom.F1)(this)).a(((net.minecraft.world.World)(this.d)), ((moom.DT)(life13_71)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(p2)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ec.R)), ((java.lang.Comparable)(life14_76))))));
    life12_44 += 1;
    if (!((life6_21 == null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    return;
}


boolean a__Boolean(int p0) {
int forwardValue1860_18_0;
    int forwardValue1860_20_0;
    int spill1860_0;
    long life2_3;
    int[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.F1.q ^ 77008606807613L);
    life4_5 = moom.FY.b();
    spill1860_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) p0))), ((double)((((double) this.f) * 0x1.999999999999ap-3d))));
    if (!((life4_5 != null))) {
        forwardValue1860_18_0 = spill1860_0;
        break forward_join_18;
    }
    if (!((spill1860_0 >= 0))) {
        break forward_join_19;
    }
    forwardValue1860_18_0 = 1;
    }
    forwardValue1860_20_0 = forwardValue1860_18_0;
    break forward_join_20;
    }
    forwardValue1860_20_0 = 0;
    }
    return ((forwardValue1860_20_0) != 0);
}


private int a(moom.DT p0) {
int forwardValue1855_32_0;
    int forwardValue1855_32_1;
    int forwardValue1855_33_0;
    int[] spill1855_0;
    int spill1855_1;
    int spill1855_2;
    int spill1855_3;
    int spill1855_4;
    long life2_3;
    int life5_7;
    int life6_11;
    int life7_16;
    int[] life4_17;
    forward_join_33: {
    forward_join_32: {
    forward_join_30: {
    life2_3 = (moom.F1.q ^ 84743734193099L);
    life5_7 = moom.Dr.a(((int)(((moom.DT)(p0)).a())));
    life6_11 = moom.Dr.a(((int)(((moom.DT)(p0)).b())));
    spill1855_0 = moom.FY.b();
    life7_16 = moom.Dr.a(((int)(((moom.DT)(p0)).c())));
    life4_17 = spill1855_0;
    spill1855_1 = life7_16;
    spill1855_2 = life5_7;
    if (!((life4_17 != null))) {
        forwardValue1855_32_0 = spill1855_1;
        forwardValue1855_32_1 = spill1855_2;
        break forward_join_32;
    }
    if (!((spill1855_1 > spill1855_2))) {
        break forward_join_30;
    }
    spill1855_3 = life7_16;
    spill1855_4 = life6_11;
    if (!((life4_17 != null))) {
        forwardValue1855_32_0 = spill1855_3;
        forwardValue1855_32_1 = spill1855_4;
        break forward_join_32;
    }
    if (!((spill1855_3 > spill1855_4))) {
        break forward_join_30;
    }
    forwardValue1855_33_0 = life7_16;
    break forward_join_33;
    }
    forwardValue1855_32_0 = life6_11;
    forwardValue1855_32_1 = life5_7;
    }
    forwardValue1855_33_0 = java.lang.Math.max(((int)(forwardValue1855_32_0)), ((int)(forwardValue1855_32_1)));
    }
    return forwardValue1855_33_0;
}


private net.minecraft.block.BlockLog$EnumAxis a__R(moom.DT p0, moom.DT p1) {
int forwardValue1862_31_0;
    int forwardValue1862_41_0;
    int forwardValue1862_41_1;
    int[] spill1862_0;
    int spill1862_1;
    int spill1862_2;
    long life3_3;
    net.minecraft.block.BlockLog$EnumAxis life6_6;
    int life7_13;
    int life8_20;
    int[] life5_21;
    int life9_25;
    forward_join_44: {
    forward_join_41: {
    forward_join_39: {
    forward_join_31: {
    life3_3 = (moom.F1.q ^ 113852188366228L);
    spill1862_0 = moom.FY.b();
    life6_6 = net.minecraft.block.BlockLog$EnumAxis.Y;
    life7_13 = java.lang.Math.abs(((int)((((moom.DT)(p1)).a() - ((moom.DT)(p0)).a()))));
    life8_20 = java.lang.Math.abs(((int)((((moom.DT)(p1)).c() - ((moom.DT)(p0)).c()))));
    life5_21 = spill1862_0;
    life9_25 = java.lang.Math.max(((int)(life7_13)), ((int)(life8_20)));
    spill1862_1 = life9_25;
    if (!((life5_21 != null))) {
        forwardValue1862_31_0 = spill1862_1;
        break forward_join_31;
    }
    if (!((spill1862_1 > 0))) {
        break forward_join_44;
    }
    forwardValue1862_31_0 = life7_13;
    }
    spill1862_2 = life9_25;
    if (!((life5_21 != null))) {
        forwardValue1862_41_0 = forwardValue1862_31_0;
        forwardValue1862_41_1 = spill1862_2;
        break forward_join_41;
    }
    if (!((forwardValue1862_31_0 == spill1862_2))) {
        break forward_join_39;
    }
    life6_6 = net.minecraft.block.BlockLog$EnumAxis.X;
    if (!((life5_21 == null))) {
        break forward_join_44;
    }
    }
    forwardValue1862_41_0 = life8_20;
    forwardValue1862_41_1 = life9_25;
    }
    if (!((forwardValue1862_41_0 == forwardValue1862_41_1))) {
        break forward_join_44;
    }
    life6_6 = net.minecraft.block.BlockLog$EnumAxis.Z;
    }
    return life6_6;
}


void a__Void(moom.DT p0) {
int[] spill607_0;
    long life2_3;
    int life5_6;
    int[] life4_7;
    lexical_join_28: {
    life2_3 = (moom.F1.q ^ 92456557817663L);
    spill607_0 = moom.FY.b();
    life5_6 = 0;
    life4_7 = spill607_0;
    lexical_cycle_8: while (true) {
    if (!((life5_6 < this.n))) {
        break lexical_join_28;
    }
    ((moom.F1)(this)).a(((moom.DT)(((moom.DT)(p0)).a(((int)(life5_6))))), ((float)(((moom.F1)(this)).b(((int)(life5_6))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.t)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))));
    life5_6 += 1;
    if (!((life4_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


int a(moom.DT p0, moom.DT p1) {
int lexicalValue605_94_0;
    int[] spill605_0;
    int spill605_1;
    boolean spill605_2;
    long life3_3;
    moom.DT life6_16;
    int[] life5_17;
    int life7_21;
    float life8_28;
    float life9_35;
    float life10_42;
    int life11_51;
    moom.DT life12_78;
    lexical_join_94: {
    lexical_join_93: {
    life3_3 = (moom.F1.q ^ 83139030630477L);
    spill605_0 = moom.FY.b();
    life6_16 = ((moom.DT)(p1)).a(((int)((-((moom.DT)(p0)).a()))), ((int)((-((moom.DT)(p0)).b()))), ((int)((-((moom.DT)(p0)).c()))));
    life5_17 = spill605_0;
    life7_21 = ((moom.F1)(this)).a(((moom.DT)(life6_16)));
    life8_28 = (((float) ((moom.DT)(life6_16)).a()) / ((float) life7_21));
    life9_35 = (((float) ((moom.DT)(life6_16)).b()) / ((float) life7_21));
    life10_42 = (((float) ((moom.DT)(life6_16)).c()) / ((float) life7_21));
    spill605_1 = life7_21;
    if (!((life5_17 != null))) {
        lexicalValue605_94_0 = spill605_1;
        break lexical_join_94;
    }
    if (!((spill605_1 != 0))) {
        break lexical_join_93;
    }
    life11_51 = 0;
    lexical_cycle_49: while (true) {
    lexical_join_91: {
    lexical_join_90: {
    if (!((life11_51 <= life7_21))) {
        break lexical_join_93;
    }
    life12_78 = __sourceExactCall_85f83ee78344f7(((moom.DT)(p0)), ((double)(((double) (0x1.0p-1f + (((float) life11_51) * life8_28))))), ((double)(((double) (0x1.0p-1f + (((float) life11_51) * life9_35))))), ((double)(((double) (0x1.0p-1f + (((float) life11_51) * life10_42))))));
    if (!((life5_17 != null))) {
        break lexical_join_91;
    }
    spill605_2 = ((moom.F1)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(life12_78))))).a__ch())));
    if (!((life5_17 != null))) {
        lexicalValue605_94_0 = ((spill605_2) ? 1 : 0);
        break lexical_join_94;
    }
    if (!((!spill605_2))) {
        break lexical_join_90;
    }
    return life11_51;
    }
    life11_51 += 1;
    }
    if (!((life5_17 == null))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    lexicalValue605_94_0 = -1;
    }
    return lexicalValue605_94_0;
}


public void a() {
long local1 = (moom.F1.q ^ 47473618069642L);
    this.n = ((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite1145_1(14412, (4947046826571614045L ^ local1))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8d1c53d83667e021_originalDynamicSite1982_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d1c53d83667e021_originalDynamicSite1982_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite1145_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4416_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic1859_17(int a0, long a1) throws E;

private static native moom.DT __sourceExactCall_85f83ee78344f7(moom.DT p0, double p1, double p2, double p3);
private static native int __sourceExactCall_bbb09b73bb09f9(int p0, long p1);
}
