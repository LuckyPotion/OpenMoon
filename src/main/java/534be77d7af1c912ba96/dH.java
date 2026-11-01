package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class dH extends moom.dG {

public static final moom.fv R;

public static final moom.fv S;

int[] T;

protected int U;

protected boolean V;

private static final long X;

private static final long[] bb;

private static final java.lang.Integer[] fb;

private static final java.util.Map gb;

public dH() {
super(moom.fn.j, false);
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
    (this).c(0x1.99999a0000000p-3f);
    (this).b(1);
    (this).a(moom.dH.h);
}


static {
X = ((long)(((moom._a)(moom._c.a(((long)(-8070809250751764674L)), ((long)(3259752062578445492L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(142897064405231L)))));
    gb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dH.X ^ 6450974556855L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1150_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1150_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1150_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1150_14 = new byte[8];
    (__sourceSpill1150_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1150_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1150_16 = __sourceSpill1150_14;
    ((javax.crypto.Cipher)(__sourceSpill1150_11)).init(((int)(__sourceSpill1150_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1150_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1150_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "V<¨|¨¡\005\t´¬|ó\0317>¸\022×acEÙ\020ÁObc4=r34ù>0m\021­f;\017Ä¼\\§¤J£¿\021Ø\020I¤gÂD9ÕÉ7'$pH"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1150_25 = local6_life21;
        int __sourceSpill1150_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1150_25)).substring(((int)(__sourceSpill1150_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1150_30 = local8_life19;
        int __sourceSpill1150_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1150_33 = new byte[8];
        (__sourceSpill1150_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1150_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1150_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1150_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1150_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1150_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1150_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1150_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1150_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1150_34)).doFinal(((byte[])(__sourceSpill1150_33)));
        (__sourceSpill1150_30)[__sourceSpill1150_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ".F¼½ñPaÌC¬[3\0329\033"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1150_38 = local6_life21;
        int __sourceSpill1150_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1150_38)).substring(((int)(__sourceSpill1150_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1150_43 = local8_life19;
        int __sourceSpill1150_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1150_46 = new byte[8];
        (__sourceSpill1150_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1150_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1150_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1150_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1150_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1150_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1150_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1150_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1150_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1150_47)).doFinal(((byte[])(__sourceSpill1150_46)));
        (__sourceSpill1150_43)[__sourceSpill1150_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    bb = ((long[])(local8_life19));
    fb = ((java.lang.Integer[])(new java.lang.Integer[11]));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("decayable")))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("check_decay")))));
}


private void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
((moom.dH)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    return;
}


protected void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3) {
return;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4677;
      if (fb[var3] == null) {
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
         long var5 = bb[var3];
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
         Object[] var9 = (Object[])gb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               gb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dH", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         fb[var3] = var15;
      }

      return fb[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dH.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7272_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forestValue405_16_0;
    int forestValue405_24_0;
    int forestValue405_28_0;
    moom.dH forestValue405_62_0;
    int forestValue405_106_0;
    net.minecraft.block.Block forestValue405_150_0;
    net.minecraft.block.Block forestValue405_150_1;
    net.minecraft.block.Block forestValue405_152_0;
    int forestValue405_230_0;
    int forestValue405_232_0;
    int forestValue405_240_0;
    int forestValue405_249_0;
    int forestValue405_249_1;
    int forestValue405_309_0;
    int forestValue405_309_1;
    int forestValue405_358_0;
    int forestValue405_358_1;
    int forestValue405_407_0;
    int forestValue405_407_1;
    int forestValue405_456_0;
    int forestValue405_456_1;
    int forestValue405_505_0;
    int forestValue405_505_1;
    int forestValue405_556_0;
    int forestValue405_556_1;
    int[] forestValue405_576_0;
    int forestValue405_576_1;
    int forestValue405_602_0;
    int forestValue405_615_0;
    boolean spill405_0;
    int spill405_1;
    long spill405_2;
    moom.dH spill405_3;
    boolean spill405_4;
    int spill405_5;
    int spill405_6;
    net.minecraft.block.Block spill405_7;
    net.minecraft.block.Block spill405_8;
    net.minecraft.block.Block spill405_9;
    int spill405_10;
    int spill405_11;
    int spill405_12;
    int spill405_13;
    int spill405_14;
    int[] spill405_15;
    int spill405_16;
    int spill405_17;
    long life5_3;
    int[] life7_5;
    int life8_33;
    int life9_38;
    int life10_44;
    int life11_47;
    int life12_50;
    int life13_52;
    int life14_56;
    int life15_60;
    moom.DU life16_109;
    int life17_112;
    int life18_120;
    int life19_128;
    net.minecraft.block.Block life20_146;
    int life17_245;
    int life18_253;
    int life19_261;
    int life20_269;
    int life16_631;
    forest_join_622: {
    forest_join_618: {
    forest_join_615: {
    forest_join_602: {
    forest_join_590: {
    forest_join_230: {
    forest_join_229: {
    forest_join_69: {
    forest_join_62: {
    forest_join_28: {
    forest_join_24: {
    forest_join_16: {
    life5_3 = (moom.dH.X ^ 19469362375686L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill405_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forestValue405_16_0 = ((spill405_0) ? 1 : 0);
        break forest_join_16;
    }
    if (!((!spill405_0))) {
        break forest_join_622;
    }
    forestValue405_16_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dH.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue405_24_0 = forestValue405_16_0;
        break forest_join_24;
    }
    if (!((forestValue405_16_0 != 0))) {
        break forest_join_622;
    }
    forestValue405_24_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dH.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue405_28_0 = forestValue405_24_0;
        break forest_join_28;
    }
    if (!((forestValue405_24_0 != 0))) {
        break forest_join_622;
    }
    forestValue405_28_0 = 4;
    }
    life8_33 = forestValue405_28_0;
    spill405_1 = 23309;
    life9_38 = (life8_33 + 1);
    spill405_2 = (6162141983905562707L ^ life5_3);
    life10_44 = ((moom.DT)(p1)).a();
    life11_47 = ((moom.DT)(p1)).b();
    life12_50 = ((moom.DT)(p1)).c();
    life13_52 = __sourceIntrinsic_b4b54c999db9_invokedynamic405_17(spill405_1, spill405_2);
    life14_56 = (life13_52 * life13_52);
    life15_60 = (life13_52 / 2);
    spill405_3 = this;
    if (!((life7_5 != null))) {
        forestValue405_62_0 = spill405_3;
        break forest_join_62;
    }
    if (!((((moom.dH)(spill405_3)).T == null))) {
        break forest_join_69;
    }
    forestValue405_62_0 = this;
    }
    ((moom.dH)(forestValue405_62_0)).T = ((int[])(new int[((life13_52 * life13_52) * life13_52)]));
    }
    spill405_4 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(new moom.DT((life10_44 - life9_38), (life11_47 - life9_38), (life12_50 - life9_38)))), ((moom.DT)(new moom.DT((life10_44 + life9_38), (life11_47 + life9_38), (life12_50 + life9_38)))));
    if (!((life7_5 != null))) {
        forestValue405_602_0 = ((spill405_4) ? 1 : 0);
        break forest_join_602;
    }
    if (!(spill405_4)) {
        break forest_join_590;
    }
    life16_109 = new moom.DU();
    life17_112 = (-life8_33);
    forest_cycle_105: while (true) {
    forest_join_226: {
    forestValue405_106_0 = life17_112;
    forest_cycle_106: while (true) {
    if (!((forestValue405_106_0 <= life8_33))) {
        break forest_join_229;
    }
    spill405_5 = (-life8_33);
    if (!((life7_5 != null))) {
        forestValue405_230_0 = spill405_5;
        break forest_join_230;
    }
    life18_120 = spill405_5;
    forest_cycle_113: while (true) {
    forest_join_224: {
    forest_join_223: {
    if (!((life18_120 <= life8_33))) {
        break forest_join_226;
    }
    spill405_6 = (-life8_33);
    if (!((life7_5 != null))) {
        forestValue405_106_0 = spill405_6;
        continue forest_cycle_106;
    }
    life19_128 = spill405_6;
    forest_cycle_121: while (true) {
    forest_join_220: {
    forest_join_201: {
    forest_join_180: {
    forest_join_152: {
    forest_join_150: {
    if (!((life19_128 <= life8_33))) {
        break forest_join_223;
    }
    life20_146 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life16_109)).a(((int)((life10_44 + life17_112))), ((int)((life11_47 + life18_120))), ((int)((life12_50 + life19_128))))))))).a__ch();
    if (!((life7_5 != null))) {
        break forest_join_224;
    }
    spill405_7 = life20_146;
    spill405_8 = net.minecraft.init.Blocks.r;
    if (!((life7_5 != null))) {
        forestValue405_150_0 = spill405_7;
        forestValue405_150_1 = spill405_8;
        break forest_join_150;
    }
    if (!((spill405_7 != spill405_8))) {
        break forest_join_201;
    }
    spill405_9 = life20_146;
    if (!((life7_5 != null))) {
        forestValue405_152_0 = spill405_9;
        break forest_join_152;
    }
    forestValue405_150_0 = spill405_9;
    forestValue405_150_1 = net.minecraft.init.Blocks.s;
    }
    if (!((forestValue405_150_0 != forestValue405_150_1))) {
        break forest_join_201;
    }
    forestValue405_152_0 = life20_146;
    }
    if (!((((net.minecraft.block.Block)(forestValue405_152_0)).a__fn() == moom.fn.j))) {
        break forest_join_180;
    }
    (this.T)[(((((life17_112 + life15_60) * life14_56) + ((life18_120 + life15_60) * life13_52)) + life19_128) + life15_60)] = __sourceIntrinsic_b4b54c999db9_invokedynamic405_30(16979, (1409743652351727887L ^ life5_3));
    if (!((life7_5 == null))) {
        break forest_join_220;
    }
    }
    (this.T)[(((((life17_112 + life15_60) * life14_56) + ((life18_120 + life15_60) * life13_52)) + life19_128) + life15_60)] = -1;
    if (!((life7_5 == null))) {
        break forest_join_220;
    }
    }
    (this.T)[(((((life17_112 + life15_60) * life14_56) + ((life18_120 + life15_60) * life13_52)) + life19_128) + life15_60)] = 0;
    }
    life19_128 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_121;
    }
    break forest_cycle_121;
    }
    }
    life18_120 += 1;
    }
    if (!((life7_5 == null))) {
        continue forest_cycle_113;
    }
    break forest_cycle_113;
    }
    break forest_cycle_106;
    }
    }
    life17_112 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_105;
    }
    break forest_cycle_105;
    }
    }
    forestValue405_230_0 = 1;
    }
    life17_245 = forestValue405_230_0;
    forest_cycle_231: while (true) {
    forest_join_587: {
    forestValue405_232_0 = life17_245;
    forest_cycle_232: while (true) {
    if (!((forestValue405_232_0 <= 4))) {
        break forest_join_590;
    }
    spill405_10 = (-life8_33);
    if (!((life7_5 != null))) {
        forestValue405_602_0 = spill405_10;
        break forest_join_602;
    }
    life18_253 = spill405_10;
    forest_cycle_239: while (true) {
    forest_join_584: {
    forestValue405_240_0 = life18_253;
    forest_cycle_240: while (true) {
    if (!((forestValue405_240_0 <= life8_33))) {
        break forest_join_587;
    }
    spill405_11 = (-life8_33);
    if (!((life7_5 != null))) {
        forestValue405_232_0 = spill405_11;
        continue forest_cycle_232;
    }
    life19_261 = spill405_11;
    forest_cycle_247: while (true) {
    forest_join_581: {
    forestValue405_249_0 = life19_261;
    forestValue405_249_1 = life8_33;
    forest_cycle_249: while (true) {
    if (!((forestValue405_249_0 <= forestValue405_249_1))) {
        break forest_join_584;
    }
    spill405_12 = (-life8_33);
    if (!((life7_5 != null))) {
        forestValue405_240_0 = spill405_12;
        continue forest_cycle_240;
    }
    life20_269 = spill405_12;
    forest_cycle_255: while (true) {
    forest_join_578: {
    forest_join_576: {
    forest_join_556: {
    forest_join_529: {
    forest_join_505: {
    forest_join_480: {
    forest_join_456: {
    forest_join_431: {
    forest_join_407: {
    forest_join_382: {
    forest_join_358: {
    forest_join_333: {
    forest_join_309: {
    if (!((life20_269 <= life8_33))) {
        break forest_join_581;
    }
    spill405_13 = (this.T)[(((((life18_253 + life15_60) * life14_56) + ((life19_261 + life15_60) * life13_52)) + life20_269) + life15_60)];
    spill405_14 = (life17_245 - 1);
    if (!((life7_5 != null))) {
        forestValue405_249_0 = spill405_13;
        forestValue405_249_1 = spill405_14;
        continue forest_cycle_249;
    }
    if (!((life7_5 != null))) {
        forestValue405_309_0 = spill405_13;
        forestValue405_309_1 = spill405_14;
        break forest_join_309;
    }
    if (!((spill405_13 == spill405_14))) {
        break forest_join_578;
    }
    forestValue405_309_0 = (this.T)[((((((life18_253 + life15_60) - 1) * life14_56) + ((life19_261 + life15_60) * life13_52)) + life20_269) + life15_60)];
    forestValue405_309_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic405_35(1910, (2296607990739082273L ^ life5_3));
    }
    if (!((life7_5 != null))) {
        forestValue405_358_0 = forestValue405_309_0;
        forestValue405_358_1 = forestValue405_309_1;
        break forest_join_358;
    }
    if (!((forestValue405_309_0 == forestValue405_309_1))) {
        break forest_join_333;
    }
    (this.T)[((((((life18_253 + life15_60) - 1) * life14_56) + ((life19_261 + life15_60) * life13_52)) + life20_269) + life15_60)] = life17_245;
    }
    forestValue405_358_0 = (this.T)[((((((life18_253 + life15_60) + 1) * life14_56) + ((life19_261 + life15_60) * life13_52)) + life20_269) + life15_60)];
    forestValue405_358_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic405_38(1910, (2296607990739082273L ^ life5_3));
    }
    if (!((life7_5 != null))) {
        forestValue405_407_0 = forestValue405_358_0;
        forestValue405_407_1 = forestValue405_358_1;
        break forest_join_407;
    }
    if (!((forestValue405_358_0 == forestValue405_358_1))) {
        break forest_join_382;
    }
    (this.T)[((((((life18_253 + life15_60) + 1) * life14_56) + ((life19_261 + life15_60) * life13_52)) + life20_269) + life15_60)] = life17_245;
    }
    forestValue405_407_0 = (this.T)[(((((life18_253 + life15_60) * life14_56) + (((life19_261 + life15_60) - 1) * life13_52)) + life20_269) + life15_60)];
    forestValue405_407_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic405_41(1910, (2296607990739082273L ^ life5_3));
    }
    if (!((life7_5 != null))) {
        forestValue405_456_0 = forestValue405_407_0;
        forestValue405_456_1 = forestValue405_407_1;
        break forest_join_456;
    }
    if (!((forestValue405_407_0 == forestValue405_407_1))) {
        break forest_join_431;
    }
    (this.T)[(((((life18_253 + life15_60) * life14_56) + (((life19_261 + life15_60) - 1) * life13_52)) + life20_269) + life15_60)] = life17_245;
    }
    forestValue405_456_0 = (this.T)[(((((life18_253 + life15_60) * life14_56) + (((life19_261 + life15_60) + 1) * life13_52)) + life20_269) + life15_60)];
    forestValue405_456_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic405_44(1910, (2296607990739082273L ^ life5_3));
    }
    if (!((life7_5 != null))) {
        forestValue405_505_0 = forestValue405_456_0;
        forestValue405_505_1 = forestValue405_456_1;
        break forest_join_505;
    }
    if (!((forestValue405_456_0 == forestValue405_456_1))) {
        break forest_join_480;
    }
    (this.T)[(((((life18_253 + life15_60) * life14_56) + (((life19_261 + life15_60) + 1) * life13_52)) + life20_269) + life15_60)] = life17_245;
    }
    forestValue405_505_0 = (this.T)[((((life18_253 + life15_60) * life14_56) + ((life19_261 + life15_60) * life13_52)) + ((life20_269 + life15_60) - 1))];
    forestValue405_505_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic405_47(1910, (2296607990739082273L ^ life5_3));
    }
    if (!((life7_5 != null))) {
        forestValue405_556_0 = forestValue405_505_0;
        forestValue405_556_1 = forestValue405_505_1;
        break forest_join_556;
    }
    if (!((forestValue405_505_0 == forestValue405_505_1))) {
        break forest_join_529;
    }
    (this.T)[((((life18_253 + life15_60) * life14_56) + ((life19_261 + life15_60) * life13_52)) + ((life20_269 + life15_60) - 1))] = life17_245;
    }
    spill405_15 = this.T;
    spill405_16 = ((((((life18_253 + life15_60) * life14_56) + ((life19_261 + life15_60) * life13_52)) + life20_269) + life15_60) + 1);
    if (!((life7_5 != null))) {
        forestValue405_576_0 = spill405_15;
        forestValue405_576_1 = spill405_16;
        break forest_join_576;
    }
    forestValue405_556_0 = (spill405_15)[spill405_16];
    forestValue405_556_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic405_50(1910, (2296607990739082273L ^ life5_3));
    }
    if (!((forestValue405_556_0 == forestValue405_556_1))) {
        break forest_join_578;
    }
    forestValue405_576_0 = this.T;
    forestValue405_576_1 = ((((((life18_253 + life15_60) * life14_56) + ((life19_261 + life15_60) * life13_52)) + life20_269) + life15_60) + 1);
    }
    (forestValue405_576_0)[forestValue405_576_1] = life17_245;
    }
    life20_269 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_255;
    }
    break forest_cycle_255;
    }
    break forest_cycle_249;
    }
    }
    life19_261 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_247;
    }
    break forest_cycle_247;
    }
    break forest_cycle_240;
    }
    }
    life18_253 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_239;
    }
    break forest_cycle_239;
    }
    break forest_cycle_232;
    }
    }
    life17_245 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_231;
    }
    break forest_cycle_231;
    }
    }
    forestValue405_602_0 = (this.T)[(((life15_60 * life14_56) + (life15_60 * life13_52)) + life15_60)];
    }
    life16_631 = forestValue405_602_0;
    spill405_17 = life16_631;
    if (!((life7_5 != null))) {
        forestValue405_615_0 = spill405_17;
        break forest_join_615;
    }
    if (!((spill405_17 >= 0))) {
        break forest_join_618;
    }
    forestValue405_615_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue405_615_0);
    if (!((life7_5 == null))) {
        break forest_join_622;
    }
    }
    ((moom.dH)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    return;
}


protected int e(net.minecraft.block.state.IBlockState p0) {
long local2 = (moom.dH.X ^ 105762131436960L);
    return __sourceIntrinsic_5ac91b912065_originalDynamicSite1409_1(16458, (5588967479996289722L ^ local2));
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forestValue406_52_0;
    int forestValue406_54_0;
    int forestValue406_105_0;
    int[] spill406_0;
    boolean spill406_1;
    int spill406_2;
    boolean spill406_3;
    long life4_3;
    int life7_5;
    int life8_9;
    int life9_13;
    int[] life6_14;
    int life10_17;
    int life11_20;
    int life12_54;
    int life13_60;
    int life14_68;
    moom.DT life15_77;
    net.minecraft.block.state.IBlockState life16_81;
    forest_join_115: {
    forest_join_52: {
    life4_3 = (moom.dH.X ^ 133860498848357L);
    life7_5 = 1;
    life8_9 = (life7_5 + 1);
    spill406_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_13 = ((moom.DT)(p1)).a();
    life6_14 = spill406_0;
    life10_17 = ((moom.DT)(p1)).b();
    life11_20 = ((moom.DT)(p1)).c();
    spill406_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(new moom.DT((life9_13 - life8_9), (life10_17 - life8_9), (life11_20 - life8_9)))), ((moom.DT)(new moom.DT((life9_13 + life8_9), (life10_17 + life8_9), (life11_20 + life8_9)))));
    if (!((life6_14 != null))) {
        forestValue406_52_0 = ((spill406_1) ? 1 : 0);
        break forest_join_52;
    }
    if (!(spill406_1)) {
        break forest_join_115;
    }
    forestValue406_52_0 = (-life7_5);
    }
    life12_54 = forestValue406_52_0;
    forest_cycle_53: while (true) {
    forest_join_112: {
    forestValue406_54_0 = life12_54;
    forest_cycle_54: while (true) {
    if (!((forestValue406_54_0 <= life7_5))) {
        break forest_join_115;
    }
    life13_60 = (-life7_5);
    forest_cycle_59: while (true) {
    forest_join_110: {
    forest_join_109: {
    if (!((life13_60 <= life7_5))) {
        break forest_join_112;
    }
    spill406_2 = (-life7_5);
    if (!((life6_14 != null))) {
        forestValue406_54_0 = spill406_2;
        continue forest_cycle_54;
    }
    life14_68 = spill406_2;
    forest_cycle_67: while (true) {
    forest_join_107: {
    forest_join_106: {
    forest_join_105: {
    if (!((life14_68 <= life7_5))) {
        break forest_join_109;
    }
    life15_77 = ((moom.DT)(p1)).a(((int)(life12_54)), ((int)(life13_60)), ((int)(life14_68)));
    life16_81 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life15_77)));
    if (!((life6_14 != null))) {
        break forest_join_110;
    }
    if (!((life6_14 != null))) {
        break forest_join_107;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life16_81)).a__ch())).a__fn() == moom.fn.j))) {
        break forest_join_106;
    }
    spill406_3 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life16_81)).a(((net.minecraft.block.properties.IProperty)(moom.dH.S))))))).booleanValue();
    if (!((life6_14 != null))) {
        forestValue406_105_0 = ((spill406_3) ? 1 : 0);
        break forest_join_105;
    }
    if (!((!spill406_3))) {
        break forest_join_106;
    }
    forestValue406_105_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life15_77)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life16_81)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue406_105_0);
    }
    life14_68 += 1;
    }
    if (!((life6_14 == null))) {
        continue forest_cycle_67;
    }
    break forest_cycle_67;
    }
    }
    life13_60 += 1;
    }
    if (!((life6_14 == null))) {
        continue forest_cycle_59;
    }
    break forest_cycle_59;
    }
    break forest_cycle_54;
    }
    }
    life12_54 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_53;
    }
    break forest_cycle_53;
    }
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3236_17_0;
    int forwardValue3236_27_0;
    int forwardValue3236_33_0;
    boolean spill3236_0;
    long life5_3;
    int[] life7_5;
    double life8_56;
    double life10_62;
    double life12_70;
    forward_join_64: {
    forward_join_33: {
    forward_join_27: {
    forward_join_17: {
    life5_3 = (moom.dH.X ^ 97655678982758L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3236_0 = ((net.minecraft.world.World)(p0)).m(((moom.DT)(((moom.DT)(p1)).a__DT())));
    if (!((life7_5 != null))) {
        forwardValue3236_17_0 = ((spill3236_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill3236_0)) {
        break forward_join_64;
    }
    forwardValue3236_17_0 = ((net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3236_27_0 = forwardValue3236_17_0;
        break forward_join_27;
    }
    if (!((forwardValue3236_17_0 == 0))) {
        break forward_join_64;
    }
    forwardValue3236_27_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic3236_8(10214, (4741600027554204379L ^ life5_3)))));
    }
    if (!((life7_5 != null))) {
        forwardValue3236_33_0 = forwardValue3236_27_0;
        break forward_join_33;
    }
    if (!((forwardValue3236_27_0 == 1))) {
        break forward_join_64;
    }
    forwardValue3236_33_0 = ((moom.DT)(p1)).a();
    }
    life8_56 = ((double) (((float) forwardValue3236_33_0) + ((java.util.Random)(p3)).nextFloat()));
    life10_62 = (((double) ((moom.DT)(p1)).b()) - 0x1.999999999999ap-5d);
    life12_70 = ((double) (((float) ((moom.DT)(p1)).c()) + ((java.util.Random)(p3)).nextFloat()));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.DRIP_WATER)), ((double)(life8_56)), ((double)(life10_62)), ((double)(life12_70)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public boolean f__Boolean() {
return ((0) != 0);
}


public int d(net.minecraft.block.state.IBlockState p0) {
return moom.Ef.c();
}


public int d__Int() {
return moom.Ef.a(((double)(0x1.0p-1d)), ((double)(0x1.0p0d)));
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.g)));
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
return moom.EO.b(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
}


public int a(java.util.Random p0) {
int forwardValue3231_17_0;
    int forwardValue3231_19_0;
    int spill3231_0;
    long life2_3;
    int[] life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.dH.X ^ 71606353303694L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3231_0 = ((java.util.Random)(p0)).nextInt(((int)(__sourceIntrinsic_41d82141e1ef_invokedynamic3231_2(8841, (887027232773967193L ^ life2_3)))));
    if (!((life4_5 != null))) {
        forwardValue3231_17_0 = spill3231_0;
        break forward_join_17;
    }
    if (!((spill3231_0 == 0))) {
        break forward_join_18;
    }
    forwardValue3231_17_0 = 1;
    }
    forwardValue3231_19_0 = forwardValue3231_17_0;
    break forward_join_19;
    }
    forwardValue3231_19_0 = 0;
    }
    return forwardValue3231_19_0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
long local1 = (moom.dH.X ^ 119530602528554L);
    return ((((this.V) ? 1 : 0) != 0) ? net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED : net.minecraft.util.EnumWorldBlockLayer.SOLID);
}


public void a__sourceReturn_f633c984d8(boolean p0) {
moom.dH forwardValue3233_18_0;
    int forwardValue3233_18_1;
    moom.dH forwardValue3233_19_0;
    moom.dH forwardValue3233_20_0;
    int forwardValue3233_20_1;
    int[] spill3233_0;
    moom.dH spill3233_1;
    boolean spill3233_2;
    long life2_3;
    int[] life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.dH.X ^ 56423723243990L);
    this.V = ((boolean)(p0));
    spill3233_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    ((moom.dH)(this)).Q = ((boolean)(p0));
    life4_11 = spill3233_0;
    spill3233_1 = this;
    spill3233_2 = p0;
    if (!((life4_11 != null))) {
        forwardValue3233_18_0 = spill3233_1;
        forwardValue3233_18_1 = ((spill3233_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3233_2)) {
        forwardValue3233_19_0 = spill3233_1;
        break forward_join_19;
    }
    forwardValue3233_18_0 = spill3233_1;
    forwardValue3233_18_1 = 0;
    }
    forwardValue3233_20_0 = forwardValue3233_18_0;
    forwardValue3233_20_1 = forwardValue3233_18_1;
    break forward_join_20;
    }
    forwardValue3233_20_0 = forwardValue3233_19_0;
    forwardValue3233_20_1 = 1;
    }
    ((moom.dH)(forwardValue3233_20_0)).U = ((int)(forwardValue3233_20_1));
    return;
}


public abstract net.minecraft.block.BlockPlanks$EnumType a__sourceReturn_71725fcced(int p0);

public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
int forwardValue3232_14_0;
    int forwardValue3232_44_0;
    int forwardValue3232_72_0;
    int forwardValue3232_86_0;
    int forwardValue3232_99_0;
    boolean spill3232_0;
    int spill3232_1;
    int spill3232_2;
    long life6_3;
    int[] life8_5;
    int life9_20;
    net.minecraft.item.Item life10_68;
    forward_join_106: {
    forward_join_100: {
    forward_join_99: {
    forward_join_86: {
    forward_join_72: {
    forward_join_65: {
    forward_join_44: {
    forward_join_40: {
    forward_join_14: {
    life6_3 = (moom.dH.X ^ 29490049171746L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3232_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life8_5 != null))) {
        forwardValue3232_14_0 = ((spill3232_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill3232_0))) {
        break forward_join_106;
    }
    forwardValue3232_14_0 = ((moom.dH)(this)).e(((net.minecraft.block.state.IBlockState)(p2)));
    }
    life9_20 = forwardValue3232_14_0;
    spill3232_1 = p4;
    if (!((life8_5 != null))) {
        forwardValue3232_44_0 = spill3232_1;
        break forward_join_44;
    }
    if (!((spill3232_1 > 0))) {
        break forward_join_40;
    }
    life9_20 = (life9_20 - (2 << p4));
    spill3232_2 = life9_20;
    if (!((life8_5 != null))) {
        forwardValue3232_44_0 = spill3232_2;
        break forward_join_44;
    }
    if (!((spill3232_2 < __sourceIntrinsic_205edd9df212_invokedynamic3232_5(3074, (8216544307759479423L ^ life6_3))))) {
        break forward_join_40;
    }
    life9_20 = __sourceIntrinsic_205edd9df212_invokedynamic3232_6(31794, (5288415346542807625L ^ life6_3));
    }
    forwardValue3232_44_0 = ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(life9_20)));
    }
    if (!((life8_5 != null))) {
        forwardValue3232_72_0 = forwardValue3232_44_0;
        break forward_join_72;
    }
    if (!((forwardValue3232_44_0 == 0))) {
        break forward_join_65;
    }
    life10_68 = ((moom.dH)(this)).a(((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(p4)));
    moom.dH.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(life10_68, 1, ((moom.dH)(this)).c(((net.minecraft.block.state.IBlockState)(p2)))))));
    }
    life9_20 = __sourceIntrinsic_205edd9df212_invokedynamic3232_13(10728, (1237042539959771031L ^ life6_3));
    forwardValue3232_72_0 = p4;
    }
    if (!((life8_5 != null))) {
        forwardValue3232_86_0 = forwardValue3232_72_0;
        break forward_join_86;
    }
    if (!((forwardValue3232_72_0 > 0))) {
        break forward_join_100;
    }
    life9_20 = (life9_20 - (__sourceIntrinsic_205edd9df212_invokedynamic3232_14(31794, (5288415346542807625L ^ life6_3)) << p4));
    forwardValue3232_86_0 = life9_20;
    }
    if (!((life8_5 != null))) {
        forwardValue3232_99_0 = forwardValue3232_86_0;
        break forward_join_99;
    }
    if (!((forwardValue3232_86_0 < __sourceIntrinsic_205edd9df212_invokedynamic3232_15(5928, (797173263698878808L ^ life6_3))))) {
        break forward_join_100;
    }
    forwardValue3232_99_0 = __sourceIntrinsic_205edd9df212_invokedynamic3232_16(14291, (6173402039194599853L ^ life6_3));
    }
    life9_20 = forwardValue3232_99_0;
    }
    ((moom.dH)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(life9_20)));
    }
    return;
}


public boolean j() {
int forwardValue3237_12_0;
    int forwardValue3237_14_0;
    boolean spill3237_0;
    long life1_3;
    int[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.dH.X ^ 27390669839706L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3237_0 = ((moom.dH)(this)).Q;
    if (!((life3_5 != null))) {
        forwardValue3237_12_0 = ((spill3237_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill3237_0))) {
        break forward_join_13;
    }
    forwardValue3237_12_0 = 1;
    }
    forwardValue3237_14_0 = forwardValue3237_12_0;
    break forward_join_14;
    }
    forwardValue3237_14_0 = 0;
    }
    return ((forwardValue3237_14_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_41d82141e1ef_invokedynamic3231_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic3232_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic3232_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic3232_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic3232_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic3232_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic3232_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7272_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic405_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic405_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic405_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic405_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic405_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic405_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic405_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic405_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic3236_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac91b912065_originalDynamicSite1409_1(int a0, long a1) throws E;
}
