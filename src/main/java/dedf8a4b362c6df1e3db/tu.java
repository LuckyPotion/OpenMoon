package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tu extends net.minecraft.entity.effect.EntityWeatherEffect {

private int aE;

public long aF;

private int aG;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public tu(net.minecraft.world.World p0, double p1, double p2, double p3) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_94d410bf2038f611(moom.tu receiver, net.minecraft.world.World p0, double p1, double p2, double p3) throws Throwable {

int forestValue508_52_0;

    net.minecraft.world.World forestValue508_54_0;

    net.minecraft.world.World forestValue508_66_0;

    net.minecraft.world.World forestValue508_78_0;

    moom.DT forestValue508_78_1;

    int forestValue508_97_0;

    int forestValue508_143_0;

    int[] spill508_0;

    boolean spill508_1;

    net.minecraft.world.World spill508_2;

    net.minecraft.world.World spill508_3;

    moom.DT spill508_4;

    boolean spill508_5;

    boolean spill508_6;

    long life8_3;

    int[] life10_22;

    moom.DT life11_40;

    int life12_109;

    moom.DT life13_133;

    forest_join_150: {

    forest_join_97: {

    forest_join_96: {

    forest_join_78: {

    forest_join_66: {

    forest_join_65: {

    forest_join_54: {

    forest_join_52: {

    life8_3 = (moom.tu.bb ^ 81534364053877L);

    moom.tu.__sourceConstructorInit_94d410bf2038f611_0(((moom.tu)(receiver)), ((net.minecraft.world.World)(p0)));

    spill508_0 = moom.G2.b__ArrayInt();

    ((moom.tu)(receiver)).c(((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));

    ((moom.tu)(receiver)).aE = ((int)(__sourceIntrinsic_94d410bf2038f611_invokedynamic508_4(18453, (9086601492409834556L ^ life8_3))));

    life10_22 = spill508_0;

    ((moom.tu)(receiver)).aF = ((long)(((java.util.Random)(((moom.tu)(receiver)).ah)).nextLong()));

    ((moom.tu)(receiver)).aG = ((int)((((java.util.Random)(((moom.tu)(receiver)).ah)).nextInt(((int)(3))) + 1)));

    life11_40 = new moom.DT(receiver);

    spill508_1 = ((net.minecraft.world.World)(p0)).G;

    if (!((life10_22 != null))) {

        forestValue508_52_0 = ((spill508_1) ? 1 : 0);

        break forest_join_52;

    }

    if (!((!spill508_1))) {

        break forest_join_150;

    }

    spill508_2 = p0;

    if (!((life10_22 != null))) {

        forestValue508_54_0 = spill508_2;

        break forest_join_54;

    }

    forestValue508_52_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(spill508_2)).a__Ej())).a__Boolean(((java.lang.String)("doFireTick")))) ? 1 : 0);

    }

    if (!((forestValue508_52_0 != 0))) {

        break forest_join_150;

    }

    forestValue508_54_0 = p0;

    }

    if (!((life10_22 != null))) {

        forestValue508_66_0 = forestValue508_54_0;

        break forest_join_66;

    }

    if (!((((net.minecraft.world.World)(forestValue508_54_0)).a__bB() != net.minecraft.world.EnumDifficulty.NORMAL))) {

        break forest_join_65;

    }

    spill508_3 = p0;

    if (!((life10_22 != null))) {

        forestValue508_66_0 = spill508_3;

        break forest_join_66;

    }

    if (!((((net.minecraft.world.World)(spill508_3)).a__bB() == net.minecraft.world.EnumDifficulty.HARD))) {

        break forest_join_150;

    }

    }

    forestValue508_66_0 = p0;

    }

    spill508_4 = life11_40;

    if (!((life10_22 != null))) {

        forestValue508_78_0 = forestValue508_66_0;

        forestValue508_78_1 = spill508_4;

        break forest_join_78;

    }

    if (!(((net.minecraft.world.World)(forestValue508_66_0)).a__Boolean(((moom.DT)(spill508_4)), ((int)(__sourceIntrinsic_94d410bf2038f611_invokedynamic508_21(11039, (2112997281697578805L ^ life8_3))))))) {

        break forest_join_150;

    }

    forestValue508_78_0 = p0;

    forestValue508_78_1 = life11_40;

    }

    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forestValue508_78_0)).a__fE(((moom.DT)(forestValue508_78_1))))).a__ch())).a__fn() == moom.fn.a))) {

        break forest_join_96;

    }

    spill508_5 = ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life11_40)));

    if (!((life10_22 != null))) {

        forestValue508_97_0 = ((spill508_5) ? 1 : 0);

        break forest_join_97;

    }

    if (!(spill508_5)) {

        break forest_join_96;

    }

    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life11_40)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())));

    }

    forestValue508_97_0 = 0;

    }

    life12_109 = forestValue508_97_0;

    forest_cycle_98: while (true) {

    forest_join_145: {

    forest_join_144: {

    forest_join_143: {

    if (!((life12_109 < 4))) {

        break forest_join_150;

    }

    life13_133 = ((moom.DT)(life11_40)).a(((int)((((java.util.Random)(((moom.tu)(receiver)).ah)).nextInt(((int)(3))) - 1))), ((int)((((java.util.Random)(((moom.tu)(receiver)).ah)).nextInt(((int)(3))) - 1))), ((int)((((java.util.Random)(((moom.tu)(receiver)).ah)).nextInt(((int)(3))) - 1))));

    if (!((life10_22 != null))) {

        break forest_join_145;

    }

    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life13_133))))).a__ch())).a__fn() == moom.fn.a))) {

        break forest_join_144;

    }

    spill508_6 = ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life13_133)));

    if (!((life10_22 != null))) {

        forestValue508_143_0 = ((spill508_6) ? 1 : 0);

        break forest_join_143;

    }

    if (!(spill508_6)) {

        break forest_join_144;

    }

    forestValue508_143_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_133)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())))) ? 1 : 0);

    }

    recovery.source.CarrierOps.discard(forestValue508_143_0);

    }

    life12_109 += 1;

    }

    if (!((life10_22 == null))) {

        continue forest_cycle_98;

    }

    break forest_cycle_98;

    }

    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));

    }

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(8269247315869367060L)), ((long)(-9138362730366679511L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(151984836972443L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tu.bb ^ 52867192799654L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1037_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1037_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1037_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1037_14 = new byte[8];
    (__sourceSpill1037_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1037_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1037_16 = __sourceSpill1037_14;
    ((javax.crypto.Cipher)(__sourceSpill1037_11)).init(((int)(__sourceSpill1037_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1037_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1037_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "þDUÒùø\f(\021áÓÛô¨¤\007¿ÿññ¡úN"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1037_25 = local6_life21;
        int __sourceSpill1037_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1037_25)).substring(((int)(__sourceSpill1037_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1037_30 = local8_life19;
        int __sourceSpill1037_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1037_33 = new byte[8];
        (__sourceSpill1037_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1037_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1037_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1037_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1037_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1037_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1037_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1037_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1037_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1037_34)).doFinal(((byte[])(__sourceSpill1037_33)));
        (__sourceSpill1037_30)[__sourceSpill1037_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_94d410bf2038f611_0(moom.tu a0, net.minecraft.world.World a1) throws E;

private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14510;
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
            throw new RuntimeException("moom/tu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tu.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9224_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected void d__Void() {
return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void g__Void() {
int lexicalValue1324_58_0;
    int lexicalValue1324_72_0;
    moom.tu lexicalValue1324_155_0;
    int lexicalValue1324_156_0;
    int lexicalValue1324_164_0;
    net.minecraft.world.World lexicalValue1324_167_0;
    int[] spill1324_0;
    int spill1324_1;
    int spill1324_2;
    boolean spill1324_3;
    boolean spill1324_4;
    boolean spill1324_5;
    moom.tu spill1324_6;
    boolean spill1324_7;
    net.minecraft.world.World spill1324_8;
    long life1_3;
    int[] life3_7;
    moom.DT life4_126;
    double life4_238;
    java.util.List life6_272;
    java.util.Iterator life7_275;
    net.minecraft.entity.Entity life8_282;
    lexical_join_227: {
    lexical_join_222: {
    lexical_join_171: {
    lexical_join_167: {
    lexical_join_164: {
    lexical_join_156: {
    lexical_join_155: {
    lexical_join_154: {
    lexical_join_72: {
    lexical_join_70: {
    lexical_join_58: {
    lexical_join_50: {
    life1_3 = (moom.tu.bb ^ 3636387007513L);
    spill1324_0 = moom.G2.b__ArrayInt();
    super.g__Void();
    life3_7 = spill1324_0;
    spill1324_1 = this.aE;
    if (!((life3_7 != null))) {
        lexicalValue1324_58_0 = spill1324_1;
        break lexical_join_58;
    }
    if (!((spill1324_1 == 2))) {
        break lexical_join_50;
    }
    ((net.minecraft.world.World)(this.i)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((java.lang.String)("ambient.weather.thunder")), ((float)(0x1.388p13f)), ((float)((0x1.99999ap-1f + (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    ((net.minecraft.world.World)(this.i)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((java.lang.String)("random.explode")), ((float)(0x1.0p1f)), ((float)((0x1.0p-1f + (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    }
    moom.tu __stackOp1324_18_0 = this;
    ((moom.tu)(__stackOp1324_18_0)).aE = ((int)((((moom.tu)(__stackOp1324_18_0)).aE - 1)));
    lexicalValue1324_58_0 = this.aE;
    }
    if (!((life3_7 != null))) {
        lexicalValue1324_156_0 = lexicalValue1324_58_0;
        break lexical_join_156;
    }
    if (!((lexicalValue1324_58_0 < 0))) {
        break lexical_join_154;
    }
    spill1324_2 = this.aG;
    if (!((life3_7 != null))) {
        lexicalValue1324_72_0 = spill1324_2;
        break lexical_join_72;
    }
    if (!((spill1324_2 == 0))) {
        break lexical_join_70;
    }
    ((moom.tu)(this)).f__Void();
    if (!((life3_7 == null))) {
        break lexical_join_154;
    }
    }
    lexicalValue1324_72_0 = this.aE;
    }
    if (!((life3_7 != null))) {
        lexicalValue1324_156_0 = lexicalValue1324_72_0;
        break lexical_join_156;
    }
    if (!((lexicalValue1324_72_0 < (-((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1324_26(14291, (4720055509080317588L ^ life1_3))))))))) {
        break lexical_join_154;
    }
    moom.tu __stackOp1324_28_0 = this;
    ((moom.tu)(__stackOp1324_28_0)).aG = ((int)((((moom.tu)(__stackOp1324_28_0)).aG - 1)));
    this.aE = ((int)(1));
    this.aF = ((long)(((java.util.Random)(this.ah)).nextLong()));
    life4_126 = new moom.DT(this);
    spill1324_3 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_7 != null))) {
        lexicalValue1324_156_0 = ((spill1324_3) ? 1 : 0);
        break lexical_join_156;
    }
    if (!((!spill1324_3))) {
        break lexical_join_154;
    }
    spill1324_4 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("doFireTick")));
    if (!((life3_7 != null))) {
        lexicalValue1324_156_0 = ((spill1324_4) ? 1 : 0);
        break lexical_join_156;
    }
    if (!(spill1324_4)) {
        break lexical_join_154;
    }
    spill1324_5 = ((net.minecraft.world.World)(this.i)).a__Boolean(((moom.DT)(life4_126)), ((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1324_43(11039, (2112916910356234841L ^ life1_3)))));
    if (!((life3_7 != null))) {
        lexicalValue1324_156_0 = ((spill1324_5) ? 1 : 0);
        break lexical_join_156;
    }
    if (!(spill1324_5)) {
        break lexical_join_154;
    }
    spill1324_6 = this;
    if (!((life3_7 != null))) {
        lexicalValue1324_155_0 = spill1324_6;
        break lexical_join_155;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.tu)(spill1324_6)).i)).a__fE(((moom.DT)(life4_126))))).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_154;
    }
    spill1324_7 = ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).b__Boolean(((net.minecraft.world.World)(this.i)), ((moom.DT)(life4_126)));
    if (!((life3_7 != null))) {
        lexicalValue1324_156_0 = ((spill1324_7) ? 1 : 0);
        break lexical_join_156;
    }
    if (!(spill1324_7)) {
        break lexical_join_154;
    }
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(life4_126)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())));
    }
    lexicalValue1324_155_0 = this;
    }
    lexicalValue1324_156_0 = ((moom.tu)(lexicalValue1324_155_0)).aE;
    }
    if (!((life3_7 != null))) {
        lexicalValue1324_164_0 = lexicalValue1324_156_0;
        break lexical_join_164;
    }
    if (!((lexicalValue1324_156_0 >= 0))) {
        break lexical_join_222;
    }
    spill1324_8 = this.i;
    if (!((life3_7 != null))) {
        lexicalValue1324_167_0 = spill1324_8;
        break lexical_join_167;
    }
    lexicalValue1324_164_0 = ((((net.minecraft.world.World)(spill1324_8)).G) ? 1 : 0);
    }
    if (!((lexicalValue1324_164_0 != 0))) {
        break lexical_join_171;
    }
    lexicalValue1324_167_0 = this.i;
    }
    ((net.minecraft.world.World)(lexicalValue1324_167_0)).c(((int)(2)));
    if (!((life3_7 == null))) {
        break lexical_join_222;
    }
    }
    life4_238 = 0x1.8p1d;
    life6_272 = ((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(new moom.CA((this.n - life4_238), (this.o - life4_238), (this.p - life4_238), (this.n + life4_238), ((this.o + 0x1.8p2d) + life4_238), (this.p + life4_238)))));
    life7_275 = ((java.util.List)(life6_272)).iterator();
    lexical_cycle_210: while (true) {
    if (!(((java.util.Iterator)(life7_275)).hasNext())) {
        break lexical_join_222;
    }
    life8_282 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life7_275)).next()));
    ((net.minecraft.entity.Entity)(life8_282)).a(((moom.tu)(this)));
    if (!((life3_7 == null))) { continue lexical_cycle_210; }
    break lexical_cycle_210;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_227;
    }
    moom.G2.b(((int[])(new int[5])));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_94d410bf2038f611_invokedynamic508_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94d410bf2038f611_invokedynamic508_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9224_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1324_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1324_43(int a0, long a1) throws E;
}
