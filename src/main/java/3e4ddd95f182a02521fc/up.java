package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class up extends moom.uc {

private static com.google.common.base.Predicate<net.minecraft.block.state.IBlockState> c;

private net.minecraft.entity.EntityLiving d;

private net.minecraft.world.World e;

int f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public up(net.minecraft.entity.EntityLiving p0) { super(); }


private static void __sourceConstructorBody_a5c39e5320e60add(moom.up receiver, net.minecraft.entity.EntityLiving p0) throws Throwable {

long local2 = (moom.up.g ^ 86961425367574L);

    moom.up.__sourceConstructorInit_a5c39e5320e60add_0(((moom.up)(receiver)));

    ((moom.up)(receiver)).d = ((net.minecraft.entity.EntityLiving)(p0));

    ((moom.up)(receiver)).e = ((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(p0)).i));

    ((moom.up)(receiver)).a(((int)(__sourceIntrinsic_a5c39e5320e60add_originalDynamicSite3422_5(29424, (5074337310894284221L ^ local2)))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a5c39e5320e60add_0(moom.up a0) throws E;

static {
g = ((long)(((moom._a)(moom._c.a(((long)(-4494899083241256500L)), ((long)(-7144174998895888640L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(235316839532650L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.up.g ^ 115356486471422L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1604_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1604_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1604_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1604_14 = new byte[8];
    (__sourceSpill1604_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1604_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1604_16 = __sourceSpill1604_14;
    ((javax.crypto.Cipher)(__sourceSpill1604_11)).init(((int)(__sourceSpill1604_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1604_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1604_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Kt4u\001ñ_þÅÚg 5\032Êç\0164ZMÒ/!ÃÐ$ê"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1604_25 = local6_life21;
        int __sourceSpill1604_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1604_25)).substring(((int)(__sourceSpill1604_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1604_30 = local8_life19;
        int __sourceSpill1604_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1604_33 = new byte[8];
        (__sourceSpill1604_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1604_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1604_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1604_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1604_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1604_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1604_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1604_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1604_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1604_34)).doFinal(((byte[])(__sourceSpill1604_33)));
        (__sourceSpill1604_30)[__sourceSpill1604_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "{zÎ\034¤*L\032÷èue\022\022"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1604_38 = local6_life21;
        int __sourceSpill1604_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1604_38)).substring(((int)(__sourceSpill1604_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1604_43 = local8_life19;
        int __sourceSpill1604_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1604_46 = new byte[8];
        (__sourceSpill1604_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1604_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1604_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1604_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1604_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1604_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1604_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1604_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1604_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1604_47)).doFinal(((byte[])(__sourceSpill1604_46)));
        (__sourceSpill1604_43)[__sourceSpill1604_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[6]));
    c = ((com.google.common.base.Predicate)(((moom.fI)(moom.fI.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.H))))).a(((net.minecraft.block.properties.IProperty)(moom.cI.R)), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.equalTo(((java.lang.Object)(moom.ar.GRASS))))))));
}


public boolean b__Boolean() {
int forwardValue4223_12_0;
    int forwardValue4223_14_0;
    int spill4223_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.up.g ^ 26607710491963L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4223_0 = this.f;
    if (!((life3_5 == 0))) {
        forwardValue4223_12_0 = spill4223_0;
        break forward_join_12;
    }
    if (!((spill4223_0 > 0))) {
        break forward_join_13;
    }
    forwardValue4223_12_0 = 1;
    }
    forwardValue4223_14_0 = forwardValue4223_12_0;
    break forward_join_14;
    }
    forwardValue4223_14_0 = 0;
    }
    return ((forwardValue4223_14_0) != 0);
}


public int b() {
return this.f;
}


public void b__Void() {
this.f = ((int)(0));
    return;
}


public void c() {
int forwardValue4224_47_0;
    moom.up forwardValue4224_55_0;
    net.minecraft.world.World forwardValue4224_75_0;
    moom.up forwardValue4224_99_0;
    boolean spill4224_0;
    boolean spill4224_1;
    moom.up spill4224_2;
    net.minecraft.world.World spill4224_3;
    moom.up spill4224_4;
    long life1_3;
    int life3_13;
    moom.DT life4_30;
    moom.DT life5_73;
    forward_join_101: {
    forward_join_99: {
    forward_join_98: {
    forward_join_75: {
    forward_join_59: {
    forward_join_55: {
    forward_join_54: {
    forward_join_47: {
    life1_3 = (moom.up.g ^ 84838106675096L);
    spill4224_0 = moom.uc.d();
    this.f = ((int)(java.lang.Math.max(((int)(0)), ((int)((this.f - 1))))));
    life3_13 = ((spill4224_0) ? 1 : 0);
    if (!((this.f == 4))) {
        break forward_join_101;
    }
    life4_30 = new moom.DT(((net.minecraft.entity.EntityLiving)(this.d)).n, ((net.minecraft.entity.EntityLiving)(this.d)).o, ((net.minecraft.entity.EntityLiving)(this.d)).p);
    spill4224_1 = ((com.google.common.base.Predicate)(moom.up.c)).apply(((java.lang.Object)(((net.minecraft.world.World)(this.e)).a__fE(((moom.DT)(life4_30))))));
    if (!((life3_13 != 0))) {
        forwardValue4224_47_0 = ((spill4224_1) ? 1 : 0);
        break forward_join_47;
    }
    if (!(spill4224_1)) {
        break forward_join_59;
    }
    spill4224_2 = this;
    if (!((life3_13 != 0))) {
        forwardValue4224_55_0 = spill4224_2;
        break forward_join_55;
    }
    forwardValue4224_47_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((moom.up)(spill4224_2)).e)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")))) ? 1 : 0);
    }
    if (!((forwardValue4224_47_0 != 0))) {
        break forward_join_54;
    }
    ((net.minecraft.world.World)(this.e)).b(((moom.DT)(life4_30)), ((boolean)(false)));
    }
    forwardValue4224_55_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(((moom.up)(forwardValue4224_55_0)).d)).N();
    if (!((life3_13 == 0))) {
        break forward_join_101;
    }
    }
    life5_73 = ((moom.DT)(life4_30)).b__DT();
    spill4224_3 = this.e;
    if (!((life3_13 != 0))) {
        forwardValue4224_75_0 = spill4224_3;
        break forward_join_75;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4224_3)).a__fE(((moom.DT)(life5_73))))).a__ch() == net.minecraft.init.Blocks.c))) {
        break forward_join_101;
    }
    spill4224_4 = this;
    if (!((life3_13 != 0))) {
        forwardValue4224_99_0 = spill4224_4;
        break forward_join_99;
    }
    forwardValue4224_75_0 = ((moom.up)(spill4224_4)).e;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(forwardValue4224_75_0)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing"))))) {
        break forward_join_98;
    }
    ((net.minecraft.world.World)(this.e)).b(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4224_35(22860, (7959815343110849416L ^ life1_3)))), ((moom.DT)(life5_73)), ((int)(net.minecraft.block.Block.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.c))))));
    ((net.minecraft.world.World)(this.e)).a(((moom.DT)(life5_73)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())), ((int)(2)));
    }
    forwardValue4224_99_0 = this;
    }
    ((net.minecraft.entity.EntityLiving)(((moom.up)(forwardValue4224_99_0)).d)).N();
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9378_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/up"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.up.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10244;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/up", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
java.util.Random forwardValue4222_20_0;
    int forwardValue4222_20_1;
    java.util.Random forwardValue4222_21_0;
    java.util.Random forwardValue4222_26_0;
    int forwardValue4222_26_1;
    int forwardValue4222_31_0;
    int forwardValue4222_63_0;
    int forwardValue4222_65_0;
    java.util.Random spill4222_0;
    boolean spill4222_1;
    int spill4222_2;
    boolean spill4222_3;
    long life1_3;
    int life3_5;
    moom.DT life4_50;
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_32: {
    forward_join_31: {
    forward_join_26: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (moom.up.g ^ 123696792419754L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4222_0 = ((net.minecraft.entity.EntityLiving)(this.d)).a__Random();
    spill4222_1 = ((net.minecraft.entity.EntityLiving)(this.d)).c__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4222_20_0 = spill4222_0;
        forwardValue4222_20_1 = ((spill4222_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4222_1)) {
        forwardValue4222_21_0 = spill4222_0;
        break forward_join_21;
    }
    forwardValue4222_20_0 = spill4222_0;
    forwardValue4222_20_1 = __sourceIntrinsic_1a14968dced5_invokedynamic4222_8(5624, (6936838651347322120L ^ life1_3));
    }
    forwardValue4222_26_0 = forwardValue4222_20_0;
    forwardValue4222_26_1 = forwardValue4222_20_1;
    break forward_join_26;
    }
    forwardValue4222_26_0 = forwardValue4222_21_0;
    forwardValue4222_26_1 = __sourceIntrinsic_1a14968dced5_invokedynamic4222_9(11270, (4922216736013090037L ^ life1_3));
    }
    spill4222_2 = ((java.util.Random)(forwardValue4222_26_0)).nextInt(((int)(forwardValue4222_26_1)));
    if (!((life3_5 == 0))) {
        forwardValue4222_31_0 = spill4222_2;
        break forward_join_31;
    }
    if (!((spill4222_2 != 0))) {
        break forward_join_32;
    }
    forwardValue4222_31_0 = 0;
    }
    return ((forwardValue4222_31_0) != 0);
    }
    life4_50 = new moom.DT(((net.minecraft.entity.EntityLiving)(this.d)).n, ((net.minecraft.entity.EntityLiving)(this.d)).o, ((net.minecraft.entity.EntityLiving)(this.d)).p);
    spill4222_3 = ((com.google.common.base.Predicate)(moom.up.c)).apply(((java.lang.Object)(((net.minecraft.world.World)(this.e)).a__fE(((moom.DT)(life4_50))))));
    if (!((life3_5 == 0))) {
        forwardValue4222_63_0 = ((spill4222_3) ? 1 : 0);
        break forward_join_63;
    }
    if (!((!spill4222_3))) {
        break forward_join_62;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.e)).a__fE(((moom.DT)(((moom.DT)(life4_50)).b__DT()))))).a__ch() == net.minecraft.init.Blocks.c))) {
        break forward_join_64;
    }
    }
    forwardValue4222_63_0 = 1;
    }
    forwardValue4222_65_0 = forwardValue4222_63_0;
    break forward_join_65;
    }
    forwardValue4222_65_0 = 0;
    }
    return ((forwardValue4222_65_0) != 0);
}


public void a__Void() {
long local1 = (moom.up.g ^ 130481518642582L);
    this.f = ((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1678_1(23164, (8930640477528470194L ^ local1))));
    ((net.minecraft.world.World)(this.e)).a(((net.minecraft.entity.Entity)(this.d)), ((byte)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1678_5(26923, (5189025162113909216L ^ local1)))));
    ((moom.AV)(((net.minecraft.entity.EntityLiving)(this.d)).a__sourceReturn_407923443b())).c();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_a5c39e5320e60add_originalDynamicSite3422_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4224_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9378_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4222_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4222_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1678_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1678_5(int a0, long a1) throws E;
}
