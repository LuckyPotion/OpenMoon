package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xh extends net.minecraft.item.Item {

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public xh() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.f);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-233664194405630122L)), ((long)(-7948734000345001275L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57072970869086L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xh.n ^ 82592301714674L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1111_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1111_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1111_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1111_14 = new byte[8];
    (__sourceSpill1111_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1111_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1111_16 = __sourceSpill1111_14;
    ((javax.crypto.Cipher)(__sourceSpill1111_11)).init(((int)(__sourceSpill1111_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1111_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1111_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "þÈOçÙõ2² >4~oª¢:r0¬[MßÛï"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1111_25 = local6_life21;
        int __sourceSpill1111_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1111_25)).substring(((int)(__sourceSpill1111_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1111_30 = local8_life19;
        int __sourceSpill1111_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1111_33 = new byte[8];
        (__sourceSpill1111_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1111_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1111_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1111_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1111_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1111_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1111_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1111_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1111_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1111_34)).doFinal(((byte[])(__sourceSpill1111_33)));
        (__sourceSpill1111_30)[__sourceSpill1111_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9736_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28294;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xh.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.util.MovingObjectPosition forwardValue4522_17_0;
    net.minecraft.world.World forwardValue4522_32_0;
    net.minecraft.world.World forwardValue4522_37_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4522_103_0;
    boolean spill4522_0;
    net.minecraft.util.MovingObjectPosition spill4522_1;
    net.minecraft.world.World spill4522_2;
    net.minecraft.entity.player.EntityPlayer spill4522_3;
    long life4_3;
    net.minecraft.util.MovingObjectPosition life7_10;
    int life6_11;
    moom.DT life8_60;
    moom.tx life9_73;
    forward_join_108: {
    forward_join_103: {
    forward_join_102: {
    forward_join_37: {
    forward_join_32: {
    forward_join_31: {
    forward_join_17: {
    life4_3 = (moom.xh.n ^ 86175525564768L);
    spill4522_0 = net.minecraft.item.ItemStack.m();
    life7_10 = ((moom.xh)(this)).a(((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)), ((boolean)(false)));
    life6_11 = ((spill4522_0) ? 1 : 0);
    spill4522_1 = life7_10;
    if (!((life6_11 != 0))) {
        forwardValue4522_17_0 = spill4522_1;
        break forward_join_17;
    }
    if (!((spill4522_1 != null))) {
        break forward_join_31;
    }
    forwardValue4522_17_0 = life7_10;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue4522_17_0)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break forward_join_31;
    }
    spill4522_2 = p1;
    if (!((life6_11 != 0))) {
        forwardValue4522_32_0 = spill4522_2;
        break forward_join_32;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4522_2)).a__fE(((moom.DT)(((net.minecraft.util.MovingObjectPosition)(life7_10)).a()))))).a__ch() == net.minecraft.init.Blocks.bv))) {
        break forward_join_31;
    }
    return p0;
    }
    forwardValue4522_32_0 = p1;
    }
    if (!((life6_11 != 0))) {
        forwardValue4522_37_0 = forwardValue4522_32_0;
        break forward_join_37;
    }
    if (!((!((net.minecraft.world.World)(forwardValue4522_32_0)).G))) {
        break forward_join_108;
    }
    forwardValue4522_37_0 = p1;
    }
    life8_60 = ((net.minecraft.world.World)(forwardValue4522_37_0)).a(((java.lang.String)("Stronghold")), ((moom.DT)(new moom.DT(p2))));
    if (!((life8_60 != null))) {
        break forward_join_108;
    }
    life9_73 = new moom.tx(p1, ((net.minecraft.entity.player.EntityPlayer)(p2)).n, ((net.minecraft.entity.player.EntityPlayer)(p2)).o, ((net.minecraft.entity.player.EntityPlayer)(p2)).p);
    ((moom.tx)(life9_73)).b__sourceReturn_8356fc462d(((moom.DT)(life8_60)));
    ((net.minecraft.world.World)(p1)).b__Boolean(((net.minecraft.entity.Entity)(life9_73)));
    ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.Entity)(p2)), ((java.lang.String)("random.bow")), ((float)(0x1.0p-1f)), ((float)((0x1.99999ap-2f / ((((java.util.Random)(moom.xh.e)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f)))));
    ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_69c34d036b8d_invokedynamic4522_20(17687, (8042350049621375823L ^ life4_3)))), ((moom.DT)(new moom.DT(p2))), ((int)(0)));
    spill4522_3 = p2;
    if (!((life6_11 != 0))) {
        forwardValue4522_103_0 = spill4522_3;
        break forward_join_103;
    }
    if (!((!((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill4522_3)).b1)).d))) {
        break forward_join_102;
    }
    net.minecraft.item.ItemStack __stackOp4522_24_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4522_24_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4522_24_0)).b - 1)));
    }
    forwardValue4522_103_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4522_103_0)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.block.state.IBlockState lexicalValue1417_27_0;
    int lexicalValue1417_183_0;
    int lexicalValue1417_238_0;
    int lexicalValue1417_291_0;
    int lexicalValue1417_301_0;
    int lexicalValue1417_342_0;
    int lexicalValue1417_344_0;
    boolean spill1417_0;
    boolean spill1417_1;
    net.minecraft.block.state.IBlockState spill1417_2;
    boolean spill1417_3;
    boolean spill1417_4;
    int spill1417_5;
    long spill1417_6;
    boolean spill1417_7;
    int spill1417_8;
    int spill1417_9;
    boolean spill1417_10;
    int spill1417_11;
    boolean spill1417_12;
    int spill1417_13;
    long life9_3;
    net.minecraft.block.state.IBlockState life12_8;
    int life11_9;
    int life13_80;
    double life14_101;
    double life16_108;
    double life18_122;
    double life20_124;
    double life22_126;
    double life24_128;
    moom.bs life13_152;
    int life14_155;
    int life15_160;
    int life16_162;
    int life17_164;
    moom.bs life18_167;
    int life19_169;
    moom.DT life20_177;
    net.minecraft.block.state.IBlockState life21_181;
    moom.DT life19_254;
    int life20_256;
    moom.DT life21_264;
    net.minecraft.block.state.IBlockState life22_268;
    moom.DT life19_320;
    int life21_324;
    moom.DT life22_332;
    net.minecraft.block.state.IBlockState life23_336;
    int life20_386;
    moom.DT life19_394;
    int life21_398;
    moom.DT life22_406;
    lexical_join_344: {
    lexical_join_343: {
    lexical_join_342: {
    lexical_join_341: {
    lexical_join_301: {
    lexical_join_300: {
    lexical_join_248: {
    lexical_join_244: {
    lexical_join_191: {
    lexical_join_124: {
    lexical_join_27: {
    life9_3 = (moom.xh.n ^ 61612067410395L);
    spill1417_0 = net.minecraft.item.ItemStack.m();
    life12_8 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life11_9 = ((spill1417_0) ? 1 : 0);
    spill1417_1 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(((moom.DT)(p3)).a(((moom.bs)(p4))))), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_9 != 0))) {
        lexicalValue1417_344_0 = ((spill1417_1) ? 1 : 0);
        break lexical_join_344;
    }
    if (!(spill1417_1)) {
        break lexical_join_343;
    }
    spill1417_2 = life12_8;
    if (!((life11_9 != 0))) {
        lexicalValue1417_27_0 = spill1417_2;
        break lexical_join_27;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill1417_2)).a__ch() == net.minecraft.init.Blocks.bv))) {
        break lexical_join_343;
    }
    lexicalValue1417_27_0 = life12_8;
    }
    spill1417_3 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(lexicalValue1417_27_0)).a(((net.minecraft.block.properties.IProperty)(moom.dt.R))))))).booleanValue();
    if (!((life11_9 != 0))) {
        lexicalValue1417_344_0 = ((spill1417_3) ? 1 : 0);
        break lexical_join_344;
    }
    if (!((!spill1417_3))) {
        break lexical_join_343;
    }
    spill1417_4 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_9 != 0))) {
        lexicalValue1417_342_0 = ((spill1417_4) ? 1 : 0);
        break lexical_join_342;
    }
    if (!((!spill1417_4))) {
        break lexical_join_341;
    }
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life12_8)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dt.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)));
    ((net.minecraft.world.World)(p2)).d(((moom.DT)(p3)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)));
    net.minecraft.item.ItemStack __stackOp1417_22_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp1417_22_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1417_22_0)).b - 1)));
    life13_80 = 0;
    lexical_cycle_60: while (true) {
    if (!((life13_80 < __sourceIntrinsic_e8125218b12d_invokedynamic1417_25(30398, (8274302983481911388L ^ life9_3))))) {
        break lexical_join_124;
    }
    life14_101 = ((double) (((float) ((moom.DT)(p3)).a()) + ((0x1.4p2f + (((java.util.Random)(moom.xh.e)).nextFloat() * 0x1.8p2f)) / 0x1.0p4f)));
    life16_108 = ((double) (((float) ((moom.DT)(p3)).b()) + 0x1.ap-1f));
    life18_122 = ((double) (((float) ((moom.DT)(p3)).c()) + ((0x1.4p2f + (((java.util.Random)(moom.xh.e)).nextFloat() * 0x1.8p2f)) / 0x1.0p4f)));
    life20_124 = 0x0.0p0d;
    life22_126 = 0x0.0p0d;
    life24_128 = 0x0.0p0d;
    ((net.minecraft.world.World)(p2)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(life14_101)), ((double)(life16_108)), ((double)(life18_122)), ((double)(life20_124)), ((double)(life22_126)), ((double)(life24_128)), ((int[])(new int[0])));
    life13_80 += 1;
    if (!((life11_9 != 0))) {
        break lexical_join_341;
    }
    if (!((life11_9 == 0))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    life13_152 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life12_8)).a(((net.minecraft.block.properties.IProperty)(moom.dt.Q)))));
    spill1417_5 = 14438;
    life14_155 = 0;
    spill1417_6 = (9132543610447177351L ^ life9_3);
    life15_160 = 0;
    life16_162 = 0;
    life17_164 = 1;
    life18_167 = ((moom.bs)(life13_152)).b__bs();
    life19_169 = __sourceIntrinsic_e8125218b12d_invokedynamic1417_39(spill1417_5, spill1417_6);
    lexical_cycle_146: while (true) {
    lexical_join_189: {
    lexical_join_188: {
    lexical_join_183: {
    lexical_join_178: {
    if (!((life19_169 <= 2))) {
        break lexical_join_191;
    }
    life20_177 = ((moom.DT)(p3)).a(((moom.bs)(life18_167)), ((int)(life19_169)));
    life21_181 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(life20_177)));
    if (!((life11_9 != 0))) {
        break lexical_join_341;
    }
    if (!((life11_9 != 0))) {
        break lexical_join_189;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life21_181)).a__ch() == net.minecraft.init.Blocks.bv))) {
        break lexical_join_188;
    }
    spill1417_7 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life21_181)).a(((net.minecraft.block.properties.IProperty)(moom.dt.R))))))).booleanValue();
    if (!((life11_9 != 0))) {
        lexicalValue1417_183_0 = ((spill1417_7) ? 1 : 0);
        break lexical_join_183;
    }
    if (!((!spill1417_7))) {
        break lexical_join_178;
    }
    life17_164 = 0;
    if (!((life11_9 == 0))) {
        break lexical_join_191;
    }
    }
    life15_160 = life19_169;
    if (!((life11_9 != 0))) {
        break lexical_join_189;
    }
    lexicalValue1417_183_0 = life16_162;
    }
    if (!((lexicalValue1417_183_0 == 0))) {
        break lexical_join_188;
    }
    life14_155 = life19_169;
    life16_162 = 1;
    }
    life19_169 += 1;
    }
    if (!((life11_9 == 0))) { continue lexical_cycle_146; }
    break lexical_cycle_146;
    }
    }
    spill1417_8 = life17_164;
    if (!((life11_9 != 0))) {
        lexicalValue1417_342_0 = spill1417_8;
        break lexical_join_342;
    }
    if (!((spill1417_8 != 0))) {
        break lexical_join_341;
    }
    spill1417_9 = life15_160;
    if (!((life11_9 != 0))) {
        lexicalValue1417_342_0 = spill1417_9;
        break lexical_join_342;
    }
    if (!((spill1417_9 == (life14_155 + 2)))) {
        break lexical_join_341;
    }
    life19_254 = ((moom.DT)(p3)).a(((moom.bs)(life13_152)), ((int)(4)));
    life20_256 = life14_155;
    lexical_cycle_209: while (true) {
    lexical_join_241: {
    lexical_join_239: {
    lexical_join_238: {
    lexical_join_237: {
    if (!((life20_256 <= life15_160))) {
        break lexical_join_244;
    }
    life21_264 = ((moom.DT)(life19_254)).a(((moom.bs)(life18_167)), ((int)(life20_256)));
    life22_268 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(life21_264)));
    if (!((life11_9 != 0))) {
        break lexical_join_248;
    }
    if (!((life11_9 != 0))) {
        break lexical_join_239;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life22_268)).a__ch() == net.minecraft.init.Blocks.bv))) {
        break lexical_join_237;
    }
    spill1417_10 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life22_268)).a(((net.minecraft.block.properties.IProperty)(moom.dt.R))))))).booleanValue();
    if (!((life11_9 != 0))) {
        lexicalValue1417_238_0 = ((spill1417_10) ? 1 : 0);
        break lexical_join_238;
    }
    if (!((!spill1417_10))) {
        break lexical_join_241;
    }
    }
    lexicalValue1417_238_0 = 0;
    }
    life17_164 = lexicalValue1417_238_0;
    }
    if (!((life11_9 == 0))) {
        break lexical_join_244;
    }
    }
    life20_256 += 1;
    if (!((life11_9 == 0))) { continue lexical_cycle_209; }
    break lexical_cycle_209;
    }
    }
    life20_256 = (life14_155 - 1);
    }
    lexical_cycle_248: while (true) {
    lexical_join_298: {
    lexical_join_297: {
    if (!((life20_256 <= (life15_160 + 1)))) {
        break lexical_join_300;
    }
    life19_320 = ((moom.DT)(p3)).a(((moom.bs)(life18_167)), ((int)(life20_256)));
    spill1417_11 = 1;
    if (!((life11_9 != 0))) {
        lexicalValue1417_301_0 = spill1417_11;
        break lexical_join_301;
    }
    life21_324 = spill1417_11;
    lexical_cycle_262: while (true) {
    lexical_join_294: {
    lexical_join_292: {
    lexical_join_291: {
    lexical_join_290: {
    if (!((life21_324 <= 3))) {
        break lexical_join_297;
    }
    life22_332 = ((moom.DT)(life19_320)).a(((moom.bs)(life13_152)), ((int)(life21_324)));
    life23_336 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(life22_332)));
    if (!((life11_9 != 0))) {
        break lexical_join_298;
    }
    if (!((life11_9 != 0))) {
        break lexical_join_292;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life23_336)).a__ch() == net.minecraft.init.Blocks.bv))) {
        break lexical_join_290;
    }
    spill1417_12 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life23_336)).a(((net.minecraft.block.properties.IProperty)(moom.dt.R))))))).booleanValue();
    if (!((life11_9 != 0))) {
        lexicalValue1417_291_0 = ((spill1417_12) ? 1 : 0);
        break lexical_join_291;
    }
    if (!((!spill1417_12))) {
        break lexical_join_294;
    }
    }
    lexicalValue1417_291_0 = 0;
    }
    life17_164 = lexicalValue1417_291_0;
    }
    if (!((life11_9 == 0))) {
        break lexical_join_297;
    }
    }
    life21_324 += 1;
    if (!((life11_9 == 0))) { continue lexical_cycle_262; }
    break lexical_cycle_262;
    }
    }
    life20_256 += 4;
    }
    if (!((life11_9 == 0))) { continue lexical_cycle_248; }
    break lexical_cycle_248;
    }
    }
    lexicalValue1417_301_0 = life17_164;
    }
    if (!((life11_9 != 0))) {
        lexicalValue1417_342_0 = lexicalValue1417_301_0;
        break lexical_join_342;
    }
    if (!((lexicalValue1417_301_0 != 0))) {
        break lexical_join_341;
    }
    life20_386 = life14_155;
    lexical_cycle_306: while (true) {
    lexical_join_339: {
    lexical_join_338: {
    if (!((life20_386 <= life15_160))) {
        break lexical_join_341;
    }
    life19_394 = ((moom.DT)(p3)).a(((moom.bs)(life18_167)), ((int)(life20_386)));
    spill1417_13 = 1;
    if (!((life11_9 != 0))) {
        lexicalValue1417_342_0 = spill1417_13;
        break lexical_join_342;
    }
    life21_398 = spill1417_13;
    lexical_cycle_318: while (true) {
    if (!((life21_398 <= 3))) {
        break lexical_join_338;
    }
    life22_406 = ((moom.DT)(life19_394)).a(((moom.bs)(life13_152)), ((int)(life21_398)));
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(life22_406)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bu)).a__fE())), ((int)(2)));
    life21_398 += 1;
    if (!((life11_9 != 0))) {
        break lexical_join_339;
    }
    if (!((life11_9 == 0))) { continue lexical_cycle_318; }
    break lexical_cycle_318;
    }
    }
    life20_386 += 1;
    }
    if (!((life11_9 == 0))) { continue lexical_cycle_306; }
    break lexical_cycle_306;
    }
    }
    lexicalValue1417_342_0 = 1;
    }
    return ((lexicalValue1417_342_0) != 0);
    }
    lexicalValue1417_344_0 = 0;
    }
    return ((lexicalValue1417_344_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9736_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69c34d036b8d_invokedynamic4522_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8125218b12d_invokedynamic1417_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8125218b12d_invokedynamic1417_39(int a0, long a1) throws E;
}
