package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ha extends moom.G4 {

private java.util.List<moom.G2> e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public Ha() {
super();
    this.e = com.google.common.collect.Lists.newLinkedList();
}


public Ha(int p0, java.util.Random p1, int p2, int p3) { super(0); }


private static void __sourceConstructorBody_cc04bf766c8fe626(moom.Ha receiver, int p0, java.util.Random p1, int p2, int p3) throws Throwable {

long local5 = (moom.Ha.f ^ 86761117393294L);

    moom.Ha.__sourceConstructorInit_cc04bf766c8fe626_0(((moom.Ha)(receiver)), ((int)(p0)));

    ((moom.Ha)(receiver)).e = ((java.util.List)(com.google.common.collect.Lists.newLinkedList()));

    ((moom.Ha)(receiver)).a = ((moom.G2)(new moom.G2(p2, __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_4(10734, (9132624573717624442L ^ local5)), p3, ((p2 + __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_5(18045, (1566336737381013994L ^ local5))) + ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_6(2770, (7887098905908581703L ^ local5)))))), (__sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_8(14364, (2784667572796368781L ^ local5)) + ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_9(1638, (621257212731496950L ^ local5)))))), ((p3 + __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_11(9701, (4706186342128237175L ^ local5))) + ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_12(1638, (621257212731496950L ^ local5)))))))));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(3776295570091614277L)), ((long)(6219194111774486477L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189754635170859L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ha.f ^ 102657726715761L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill828_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill828_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill828_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill828_14 = new byte[8];
    (__sourceSpill828_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill828_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation828_16 = __sourceSpill828_14;
    ((javax.crypto.Cipher)(__sourceSpill828_11)).init(((int)(__sourceSpill828_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill828_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation828_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¡sÙá\003p¯Ú¸~Ò7$\025\b\022öÁÖA£M\001\024\177ßã2ÐHJ\000I\n\026"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill828_25 = local6_life21;
        int __sourceSpill828_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill828_25)).substring(((int)(__sourceSpill828_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill828_30 = local8_life19;
        int __sourceSpill828_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill828_33 = new byte[8];
        (__sourceSpill828_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill828_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill828_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill828_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill828_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill828_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill828_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill828_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill828_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill828_34)).doFinal(((byte[])(__sourceSpill828_33)));
        (__sourceSpill828_30)[__sourceSpill828_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "|\024\n¡\022JQ\tL¤7\b\034³"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill828_38 = local6_life21;
        int __sourceSpill828_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill828_38)).substring(((int)(__sourceSpill828_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill828_43 = local8_life19;
        int __sourceSpill828_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill828_46 = new byte[8];
        (__sourceSpill828_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill828_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill828_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill828_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill828_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill828_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill828_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill828_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill828_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill828_47)).doFinal(((byte[])(__sourceSpill828_46)));
        (__sourceSpill828_43)[__sourceSpill828_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_cc04bf766c8fe626_0(moom.Ha a0, int a1) throws E;

protected void b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.Entity[] spill754_0;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_13;
    net.minecraft.entity.Entity[] life4_14;
    int life6_16;
    lexical_join_34: {
    life2_3 = (moom.Ha.f ^ 28707164247969L);
    spill754_0 = moom.G4.b();
    life5_13 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Entrances")), ((int)(__sourceIntrinsic_ac4a479fad6b_invokedynamic754_2(30708, (8827731616694869576L ^ life2_3)))));
    life4_14 = spill754_0;
    life6_16 = 0;
    lexical_cycle_17: while (true) {
    if (!((life6_16 < ((net.minecraft.nbt.NBTTagList)(life5_13)).a__Int()))) {
        break lexical_join_34;
    }
    ((java.util.List)(this.e)).add(((java.lang.Object)(new moom.G2(((net.minecraft.nbt.NBTTagList)(life5_13)).a__ArrayInt(((int)(life6_16)))))));
    life6_16 += 1;
    if (!((life4_14 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6437;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Ha", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_0f2168b9d40216(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4807_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ha"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, int p2) {
net.minecraft.entity.Entity[] spill750_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_10;
    java.util.Iterator life7_14;
    moom.G2 life8_21;
    lexical_join_29: {
    life4_3 = (moom.Ha.f ^ 55968938636426L);
    spill750_0 = moom.G4.b();
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    life6_10 = spill750_0;
    life7_14 = ((java.util.List)(this.e)).iterator();
    lexical_cycle_15: while (true) {
    if (!(((java.util.Iterator)(life7_14)).hasNext())) {
        break lexical_join_29;
    }
    life8_21 = ((moom.G2)(((java.util.Iterator)(life7_14)).next()));
    ((moom.G2)(life8_21)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_10 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.Entity[] spill752_0;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_8;
    java.util.Iterator life6_12;
    net.minecraft.entity.Entity[] life4_13;
    moom.G2 life7_20;
    lexical_join_33: {
    lexical_join_29: {
    life2_3 = (moom.Ha.f ^ 68562319350743L);
    spill752_0 = moom.G4.b();
    life5_8 = new net.minecraft.nbt.NBTTagList();
    life6_12 = ((java.util.List)(this.e)).iterator();
    life4_13 = spill752_0;
    lexical_cycle_14: while (true) {
    if (!(((java.util.Iterator)(life6_12)).hasNext())) {
        break lexical_join_29;
    }
    life7_20 = ((moom.G2)(((java.util.Iterator)(life6_12)).next()));
    ((net.minecraft.nbt.NBTTagList)(life5_8)).a(((net.minecraft.nbt.NBTBase)(((moom.G2)(life7_20)).a__yy())));
    if (!((life4_13 != null))) {
        break lexical_join_33;
    }
    if (!((life4_13 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Entrances")), ((net.minecraft.nbt.NBTBase)(life5_8)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.Ha lexicalValue753_45_0;
    net.minecraft.world.World lexicalValue753_45_1;
    moom.G2 lexicalValue753_45_2;
    moom.Ha spill753_0;
    net.minecraft.world.World spill753_1;
    moom.G2 spill753_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    java.util.Iterator life7_85;
    moom.G2 life8_92;
    lexical_join_142: {
    lexical_join_115: {
    lexical_join_45: {
    lexical_join_15: {
    life4_3 = (moom.Ha.f ^ 34359518184465L);
    life6_5 = moom.G4.b();
    spill753_0 = this;
    spill753_1 = p0;
    spill753_2 = p2;
    if (!((life6_5 != null))) {
        lexicalValue753_45_0 = spill753_0;
        lexicalValue753_45_1 = spill753_1;
        lexicalValue753_45_2 = spill753_2;
        break lexical_join_45;
    }
    if (!(((moom.Ha)(spill753_0)).a(((net.minecraft.world.World)(spill753_1)), ((moom.G2)(spill753_2))))) {
        break lexical_join_15;
    }
    return ((0) != 0);
    }
    ((moom.Ha)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(((moom.G2)(this.a)).a)), ((int)(((moom.G2)(this.a)).b)), ((int)(((moom.G2)(this.a)).c)), ((int)(((moom.G2)(this.a)).d)), ((int)(((moom.G2)(this.a)).b)), ((int)(((moom.G2)(this.a)).f)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(true)));
    lexicalValue753_45_0 = this;
    lexicalValue753_45_1 = p0;
    lexicalValue753_45_2 = p2;
    }
    ((moom.Ha)(lexicalValue753_45_0)).a(((net.minecraft.world.World)(lexicalValue753_45_1)), ((moom.G2)(lexicalValue753_45_2)), ((int)(((moom.G2)(this.a)).a)), ((int)((((moom.G2)(this.a)).b + 1))), ((int)(((moom.G2)(this.a)).c)), ((int)(((moom.G2)(this.a)).d)), ((int)(java.lang.Math.min(((int)((((moom.G2)(this.a)).b + 3))), ((int)(((moom.G2)(this.a)).e))))), ((int)(((moom.G2)(this.a)).f)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    life7_85 = ((java.util.List)(this.e)).iterator();
    lexical_cycle_81: while (true) {
    if (!(((java.util.Iterator)(life7_85)).hasNext())) {
        break lexical_join_115;
    }
    life8_92 = ((moom.G2)(((java.util.Iterator)(life7_85)).next()));
    ((moom.Ha)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(((moom.G2)(life8_92)).a)), ((int)((((moom.G2)(life8_92)).e - 2))), ((int)(((moom.G2)(life8_92)).c)), ((int)(((moom.G2)(life8_92)).d)), ((int)(((moom.G2)(life8_92)).e)), ((int)(((moom.G2)(life8_92)).f)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    if (!((life6_5 != null))) {
        break lexical_join_142;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_81; }
    break lexical_cycle_81;
    }
    }
    ((moom.Ha)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(((moom.G2)(this.a)).a)), ((int)((((moom.G2)(this.a)).b + 4))), ((int)(((moom.G2)(this.a)).c)), ((int)(((moom.G2)(this.a)).d)), ((int)(((moom.G2)(this.a)).e)), ((int)(((moom.G2)(this.a)).f)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    return ((1) != 0);
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
int forestValue900072_24_0;
    int forestValue900072_200_0;
    int forestValue900072_200_1;
    int forestValue900072_288_0;
    int forestValue900072_288_1;
    int forestValue900072_466_0;
    int forestValue900072_466_1;
    net.minecraft.entity.Entity[] spill900072_0;
    int spill900072_1;
    int spill900072_2;
    int spill900072_3;
    int spill900072_4;
    int spill900072_5;
    int spill900072_6;
    int spill900072_7;
    int spill900072_8;
    int spill900072_9;
    int spill900072_10;
    int spill900072_11;
    int spill900072_12;
    int spill900072_13;
    int spill900072_14;
    int spill900072_15;
    int spill900072_16;
    int spill900072_17;
    long life4_3;
    int life7_6;
    int life8_15;
    net.minecraft.entity.Entity[] life6_16;
    int life9_29;
    moom.G4 life10_86;
    moom.G2 life11_96;
    moom.G4 life10_188;
    moom.G2 life11_198;
    moom.G4 life10_282;
    moom.G2 life11_292;
    moom.G4 life10_381;
    moom.G2 life11_391;
    moom.G4 life10_490;
    moom.G2 life11_500;
    moom.G4 life10_580;
    moom.G2 life11_590;
    int life9_631;
    moom.G4 life10_685;
    moom.G2 life11_695;
    forest_join_639: {
    forest_join_553: {
    forest_join_552: {
    forest_join_466: {
    forest_join_377: {
    forest_join_376: {
    forest_join_288: {
    forest_join_200: {
    forest_join_111: {
    forest_join_24: {
    forest_join_23: {
    life4_3 = (moom.Ha.f ^ 121734403886807L);
    life7_6 = ((moom.Ha)(this)).a();
    spill900072_0 = moom.G4.b();
    life8_15 = ((((moom.G2)(this.a)).b() - 3) - 1);
    life6_16 = spill900072_0;
    spill900072_1 = life8_15;
    if (!((life6_16 != null))) {
        forestValue900072_24_0 = spill900072_1;
        break forest_join_24;
    }
    if (!((spill900072_1 <= 0))) {
        break forest_join_23;
    }
    life8_15 = 1;
    }
    forestValue900072_24_0 = 0;
    }
    life9_29 = forestValue900072_24_0;
    forest_cycle_25: while (true) {
    forest_join_109: {
    forest_join_105: {
    forest_join_49: {
    if (!((life9_29 < ((moom.G2)(this.a)).a()))) {
        break forest_join_111;
    }
    life9_29 = (life9_29 + ((java.util.Random)(p2)).nextInt(((int)(((moom.G2)(this.a)).a()))));
    spill900072_2 = (life9_29 + 3);
    spill900072_3 = ((moom.G2)(this.a)).a();
    if (!((life6_16 != null))) {
        forestValue900072_200_0 = spill900072_2;
        forestValue900072_200_1 = spill900072_3;
        break forest_join_200;
    }
    if (!((spill900072_2 > spill900072_3))) {
        break forest_join_49;
    }
    if (!((life6_16 == null))) {
        break forest_join_111;
    }
    }
    life10_86 = __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + life9_29))), ((int)(((((moom.G2)(this.a)).b + ((java.util.Random)(p2)).nextInt(((int)(life8_15)))) + 1))), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(life7_6)));
    if (!((life6_16 != null))) {
        break forest_join_109;
    }
    if (!((life10_86 != null))) {
        break forest_join_105;
    }
    life11_96 = ((moom.G4)(life10_86)).a__G2();
    ((java.util.List)(this.e)).add(((java.lang.Object)(new moom.G2(((moom.G2)(life11_96)).a, ((moom.G2)(life11_96)).b, ((moom.G2)(this.a)).c, ((moom.G2)(life11_96)).d, ((moom.G2)(life11_96)).e, (((moom.G2)(this.a)).c + 1)))));
    }
    life9_29 = (life9_29 + 4);
    }
    if (!((life6_16 == null))) {
        continue forest_cycle_25;
    }
    break forest_cycle_25;
    }
    }
    life9_29 = 0;
    forest_cycle_113: while (true) {
    forest_join_197: {
    forest_join_193: {
    forest_join_137: {
    if (!((life9_29 < ((moom.G2)(this.a)).a()))) {
        break forest_join_377;
    }
    life9_29 = (life9_29 + ((java.util.Random)(p2)).nextInt(((int)(((moom.G2)(this.a)).a()))));
    spill900072_4 = (life9_29 + 3);
    spill900072_5 = ((moom.G2)(this.a)).a();
    if (!((life6_16 != null))) {
        forestValue900072_288_0 = spill900072_4;
        forestValue900072_288_1 = spill900072_5;
        break forest_join_288;
    }
    if (!((spill900072_4 > spill900072_5))) {
        break forest_join_137;
    }
    if (!((life6_16 == null))) {
        break forest_join_377;
    }
    }
    life10_188 = __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + life9_29))), ((int)(((((moom.G2)(this.a)).b + ((java.util.Random)(p2)).nextInt(((int)(life8_15)))) + 1))), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(life7_6)));
    if (!((life6_16 != null))) {
        break forest_join_197;
    }
    if (!((life10_188 != null))) {
        break forest_join_193;
    }
    life11_198 = ((moom.G4)(life10_188)).a__G2();
    ((java.util.List)(this.e)).add(((java.lang.Object)(new moom.G2(((moom.G2)(life11_198)).a, ((moom.G2)(life11_198)).b, (((moom.G2)(this.a)).f - 1), ((moom.G2)(life11_198)).d, ((moom.G2)(life11_198)).e, ((moom.G2)(this.a)).f))));
    }
    life9_29 = (life9_29 + 4);
    }
    if (!((life6_16 == null))) {
        continue forest_cycle_113;
    }
    break forest_cycle_113;
    }
    break forest_join_377;
    }
    forest_cycle_200: while (true) {
    forest_join_283: {
    forest_join_280: {
    forest_join_276: {
    forest_join_220: {
    if (!((forestValue900072_200_0 < forestValue900072_200_1))) {
        break forest_join_377;
    }
    life9_29 = (life9_29 + ((java.util.Random)(p2)).nextInt(((int)(((moom.G2)(this.a)).a()))));
    spill900072_6 = (life9_29 + 3);
    spill900072_7 = ((moom.G2)(this.a)).a();
    if (!((life6_16 != null))) {
        forestValue900072_288_0 = spill900072_6;
        forestValue900072_288_1 = spill900072_7;
        break forest_join_288;
    }
    if (!((spill900072_6 > spill900072_7))) {
        break forest_join_220;
    }
    if (!((life6_16 == null))) {
        break forest_join_377;
    }
    }
    life10_282 = __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a + life9_29))), ((int)(((((moom.G2)(this.a)).b + ((java.util.Random)(p2)).nextInt(((int)(life8_15)))) + 1))), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(life7_6)));
    if (!((life6_16 != null))) {
        break forest_join_280;
    }
    if (!((life10_282 != null))) {
        break forest_join_276;
    }
    life11_292 = ((moom.G4)(life10_282)).a__G2();
    ((java.util.List)(this.e)).add(((java.lang.Object)(new moom.G2(((moom.G2)(life11_292)).a, ((moom.G2)(life11_292)).b, (((moom.G2)(this.a)).f - 1), ((moom.G2)(life11_292)).d, ((moom.G2)(life11_292)).e, ((moom.G2)(this.a)).f))));
    }
    life9_29 = (life9_29 + 4);
    }
    if (!((life6_16 == null))) {
        break forest_join_283;
    }
    break forest_join_377;
    }
    spill900072_8 = life9_29;
    spill900072_9 = ((moom.G2)(this.a)).a();
    forestValue900072_200_0 = spill900072_8;
    forestValue900072_200_1 = spill900072_9;
    continue forest_cycle_200;
    }
    }
    forest_cycle_288: while (true) {
    forest_join_371: {
    forest_join_368: {
    forest_join_364: {
    forest_join_308: {
    if (!((forestValue900072_288_0 < forestValue900072_288_1))) {
        break forest_join_553;
    }
    life9_29 = (life9_29 + ((java.util.Random)(p2)).nextInt(((int)(((moom.G2)(this.a)).c()))));
    spill900072_10 = (life9_29 + 3);
    spill900072_11 = ((moom.G2)(this.a)).c();
    if (!((life6_16 != null))) {
        forestValue900072_466_0 = spill900072_10;
        forestValue900072_466_1 = spill900072_11;
        break forest_join_466;
    }
    if (!((spill900072_10 > spill900072_11))) {
        break forest_join_308;
    }
    if (!((life6_16 == null))) {
        break forest_join_553;
    }
    }
    life10_381 = __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((((moom.G2)(this.a)).b + ((java.util.Random)(p2)).nextInt(((int)(life8_15)))) + 1))), ((int)((((moom.G2)(this.a)).c + life9_29))), ((moom.bs)(moom.bs.WEST)), ((int)(life7_6)));
    if (!((life6_16 != null))) {
        break forest_join_368;
    }
    if (!((life10_381 != null))) {
        break forest_join_364;
    }
    life11_391 = ((moom.G4)(life10_381)).a__G2();
    ((java.util.List)(this.e)).add(((java.lang.Object)(new moom.G2(((moom.G2)(this.a)).a, ((moom.G2)(life11_391)).b, ((moom.G2)(life11_391)).c, (((moom.G2)(this.a)).a + 1), ((moom.G2)(life11_391)).e, ((moom.G2)(life11_391)).f))));
    }
    life9_29 = (life9_29 + 4);
    }
    if (!((life6_16 == null))) {
        break forest_join_371;
    }
    break forest_join_376;
    }
    spill900072_12 = life9_29;
    spill900072_13 = ((moom.G2)(this.a)).c();
    forestValue900072_288_0 = spill900072_12;
    forestValue900072_288_1 = spill900072_13;
    continue forest_cycle_288;
    }
    }
    break forest_join_553;
    }
    life9_29 = 0;
    forest_cycle_379: while (true) {
    forest_join_463: {
    forest_join_459: {
    forest_join_403: {
    if (!((life9_29 < ((moom.G2)(this.a)).c()))) {
        break forest_join_553;
    }
    life9_29 = (life9_29 + ((java.util.Random)(p2)).nextInt(((int)(((moom.G2)(this.a)).c()))));
    spill900072_14 = (life9_29 + 3);
    spill900072_15 = ((moom.G2)(this.a)).c();
    if (!((life6_16 != null))) {
        forestValue900072_466_0 = spill900072_14;
        forestValue900072_466_1 = spill900072_15;
        break forest_join_466;
    }
    if (!((spill900072_14 > spill900072_15))) {
        break forest_join_403;
    }
    if (!((life6_16 == null))) {
        break forest_join_553;
    }
    }
    life10_490 = __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((((moom.G2)(this.a)).b + ((java.util.Random)(p2)).nextInt(((int)(life8_15)))) + 1))), ((int)((((moom.G2)(this.a)).c + life9_29))), ((moom.bs)(moom.bs.WEST)), ((int)(life7_6)));
    if (!((life6_16 != null))) {
        break forest_join_463;
    }
    if (!((life10_490 != null))) {
        break forest_join_459;
    }
    life11_500 = ((moom.G4)(life10_490)).a__G2();
    ((java.util.List)(this.e)).add(((java.lang.Object)(new moom.G2(((moom.G2)(this.a)).a, ((moom.G2)(life11_500)).b, ((moom.G2)(life11_500)).c, (((moom.G2)(this.a)).a + 1), ((moom.G2)(life11_500)).e, ((moom.G2)(life11_500)).f))));
    }
    life9_29 = (life9_29 + 4);
    }
    if (!((life6_16 == null))) {
        continue forest_cycle_379;
    }
    break forest_cycle_379;
    }
    break forest_join_553;
    }
    forest_cycle_466: while (true) {
    forest_join_547: {
    forest_join_544: {
    forest_join_540: {
    forest_join_484: {
    if (!((forestValue900072_466_0 < forestValue900072_466_1))) {
        break forest_join_639;
    }
    life9_29 = (life9_29 + ((java.util.Random)(p2)).nextInt(((int)(((moom.G2)(this.a)).c()))));
    if (!(((life9_29 + 3) > ((moom.G2)(this.a)).c()))) {
        break forest_join_484;
    }
    if (!((life6_16 == null))) {
        break forest_join_639;
    }
    }
    life10_580 = __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((((moom.G2)(this.a)).b + ((java.util.Random)(p2)).nextInt(((int)(life8_15)))) + 1))), ((int)((((moom.G2)(this.a)).c + life9_29))), ((moom.bs)(moom.bs.EAST)), ((int)(life7_6)));
    if (!((life6_16 != null))) {
        break forest_join_544;
    }
    if (!((life10_580 != null))) {
        break forest_join_540;
    }
    life11_590 = ((moom.G4)(life10_580)).a__G2();
    ((java.util.List)(this.e)).add(((java.lang.Object)(new moom.G2((((moom.G2)(this.a)).d - 1), ((moom.G2)(life11_590)).b, ((moom.G2)(life11_590)).c, ((moom.G2)(this.a)).d, ((moom.G2)(life11_590)).e, ((moom.G2)(life11_590)).f))));
    }
    life9_29 = (life9_29 + 4);
    }
    if (!((life6_16 == null))) {
        break forest_join_547;
    }
    break forest_join_552;
    }
    spill900072_16 = life9_29;
    spill900072_17 = ((moom.G2)(this.a)).c();
    forestValue900072_466_0 = spill900072_16;
    forestValue900072_466_1 = spill900072_17;
    continue forest_cycle_466;
    }
    }
    break forest_join_639;
    }
    life9_631 = 0;
    forest_cycle_555: while (true) {
    forest_join_637: {
    forest_join_633: {
    forest_join_577: {
    if (!((life9_631 < ((moom.G2)(this.a)).c()))) {
        break forest_join_639;
    }
    life9_631 = (life9_631 + ((java.util.Random)(p2)).nextInt(((int)(((moom.G2)(this.a)).c()))));
    if (!(((life9_631 + 3) > ((moom.G2)(this.a)).c()))) {
        break forest_join_577;
    }
    if (!((life6_16 == null))) {
        break forest_join_639;
    }
    }
    life10_685 = __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((((moom.G2)(this.a)).b + ((java.util.Random)(p2)).nextInt(((int)(life8_15)))) + 1))), ((int)((((moom.G2)(this.a)).c + life9_631))), ((moom.bs)(moom.bs.EAST)), ((int)(life7_6)));
    if (!((life6_16 != null))) {
        break forest_join_637;
    }
    if (!((life10_685 != null))) {
        break forest_join_633;
    }
    life11_695 = ((moom.G4)(life10_685)).a__G2();
    ((java.util.List)(this.e)).add(((java.lang.Object)(new moom.G2((((moom.G2)(this.a)).d - 1), ((moom.G2)(life11_695)).b, ((moom.G2)(life11_695)).c, ((moom.G2)(this.a)).d, ((moom.G2)(life11_695)).e, ((moom.G2)(life11_695)).f))));
    }
    life9_631 = (life9_631 + 4);
    }
    if (!((life6_16 == null))) {
        continue forest_cycle_555;
    }
    break forest_cycle_555;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc04bf766c8fe626_originalDynamicSite2132_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4807_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac4a479fad6b_invokedynamic754_2(int a0, long a1) throws E;

private static native int __sourceExactCall_0f2168b9d40216(int p0, long p1);

private static native moom.G4 __sourceExactCall_a0a0ca1b2b95c9(moom.G4 p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7);
}
