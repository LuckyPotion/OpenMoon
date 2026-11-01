package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xd extends net.minecraft.item.Item {

public static final int[] n;

private static final long o;

private static final long[] p;

private static final java.lang.Integer[] q;

private static final java.util.Map r;

public xd() {
super();
    (this).a(true);
    (this).c(0);
    (this).a(net.minecraft.creativetab.CreativeTabs.l);
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(-3514234642785695259L)), ((long)(1250202871184523412L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78998802177926L)))));
    long local11_life6 = (moom.xd.o ^ 61299476776552L);
    r = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1684_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1684_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1684_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1684_14 = new byte[8];
    (__sourceSpill1684_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1684_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1684_16 = __sourceSpill1684_14;
    ((javax.crypto.Cipher)(__sourceSpill1684_11)).init(((int)(__sourceSpill1684_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1684_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1684_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[30];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\004j¼V¾û­¤^ÜN©ÇkY'äÊ\031yöîzSÓÁ\020\002FØá0}Ê×úç:ñ\r\005\\qC\004z¯÷í[¢ß\024\013¾¹¢}\f(ô ùÓx]È\016íkkå\026i$\000}µò`Zã)\032O)3ËyRÙ¥¿\034?Î\020é,mÿ,M\022\000.(}u©Ízñ ¡Ç÷y:ß¦ROÄeTVNeÜ¢äâ\"S=aIbP_º«^B\016\001+üñÜþõr%$ezæ0:öN\031½~ä*æl\005\031k\037ÇªW\0206§oÍ&1l\025,ñõ[B\026þµ´u"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1684_25 = local4_life21;
        int __sourceSpill1684_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1684_25)).substring(((int)(__sourceSpill1684_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1684_30 = local6_life19;
        int __sourceSpill1684_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1684_33 = new byte[8];
        (__sourceSpill1684_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1684_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1684_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1684_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1684_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1684_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1684_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1684_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1684_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1684_34)).doFinal(((byte[])(__sourceSpill1684_33)));
        (__sourceSpill1684_30)[__sourceSpill1684_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "ÚvÚ\007Ô[\r±^Ïu£ü²"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1684_38 = local4_life21;
        int __sourceSpill1684_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1684_38)).substring(((int)(__sourceSpill1684_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1684_43 = local6_life19;
        int __sourceSpill1684_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1684_46 = new byte[8];
        (__sourceSpill1684_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1684_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1684_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1684_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1684_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1684_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1684_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1684_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1684_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1684_47)).doFinal(((byte[])(__sourceSpill1684_46)));
        (__sourceSpill1684_43)[__sourceSpill1684_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    p = ((long[])(local6_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[30]));
    int[] __sourceSpill1684_54 = new int[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_52(9649, (5222951116739873961L ^ local11_life6))];
    (__sourceSpill1684_54)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_53(26110, (4994326597245717735L ^ local11_life6));
    (__sourceSpill1684_54)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_55(5336, (6541281508089839057L ^ local11_life6));
    (__sourceSpill1684_54)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_56(31274, (7822684953535501090L ^ local11_life6));
    (__sourceSpill1684_54)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_57(10704, (3262479752615166165L ^ local11_life6));
    (__sourceSpill1684_54)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_58(8087, (1378718814870386324L ^ local11_life6));
    (__sourceSpill1684_54)[5] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_59(7825, (8050984746678433691L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_60(24748, (3538285834123921835L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_61(3433, (82287252270851198L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_62(11459, (7847374984240760275L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_63(1529, (2816454633596431589L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_64(5907, (2809365524275445250L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_65(5034, (595786865045781160L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_66(19678, (5555530621616645568L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_67(29698, (1447315605549997324L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_68(4673, (1486724593328569164L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_69(3483, (9160291822927979677L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_70(21072, (5842608749887880002L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_71(15949, (6110696233594197837L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_72(8178, (4064910784317798137L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_73(18152, (65372761090584567L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_74(24242, (7687425199223502756L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_75(16110, (3782512117462243315L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_76(8626, (9135477542235343017L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_77(19936, (2124403620731413747L ^ local11_life6));
    (__sourceSpill1684_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_78(21136, (4781399799800855444L ^ local11_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_79(26439, (2793874885146299997L ^ local11_life6));
    n = ((int[])(__sourceSpill1684_54));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9717_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30241;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xd.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
int local2 = ((net.minecraft.item.ItemStack)(p0)).c();
    return __sourceIntrinsic_33df8f166dd6_originalDynamicSite1704_4(super.a__String(), ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.a(((int)(local2))))).b__String());
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4512_20_0;
    int forwardValue4512_49_0;
    net.minecraft.item.EnumDyeColor forwardValue4512_52_0;
    net.minecraft.item.EnumDyeColor forwardValue4512_52_1;
    moom.bs forwardValue4512_77_0;
    moom.bs forwardValue4512_77_1;
    int forwardValue4512_120_0;
    int forwardValue4512_122_0;
    boolean spill4512_0;
    net.minecraft.item.EnumDyeColor spill4512_1;
    net.minecraft.item.EnumDyeColor spill4512_2;
    boolean spill4512_3;
    boolean spill4512_4;
    moom.bs spill4512_5;
    moom.bs spill4512_6;
    boolean spill4512_7;
    boolean spill4512_8;
    long life9_3;
    int life11_5;
    net.minecraft.item.EnumDyeColor life12_26;
    net.minecraft.block.state.IBlockState life13_79;
    net.minecraft.block.Block life14_82;
    moom.DT life4_119;
    net.minecraft.block.state.IBlockState life15_139;
    forward_join_122: {
    forward_join_121: {
    forward_join_120: {
    forward_join_119: {
    forward_join_80: {
    forward_join_77: {
    forward_join_75: {
    forward_join_52: {
    forward_join_50: {
    forward_join_49: {
    forward_join_48: {
    forward_join_20: {
    forward_join_18: {
    life9_3 = (moom.xd.o ^ 107520527919398L);
    life11_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4512_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(((moom.DT)(p3)).a(((moom.bs)(p4))))), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_5 == 0))) {
        forwardValue4512_20_0 = ((spill4512_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill4512_0))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    forwardValue4512_20_0 = ((net.minecraft.item.ItemStack)(p0)).c();
    }
    life12_26 = net.minecraft.item.EnumDyeColor.a(((int)(forwardValue4512_20_0)));
    spill4512_1 = life12_26;
    spill4512_2 = net.minecraft.item.EnumDyeColor.WHITE;
    if (!((life11_5 == 0))) {
        forwardValue4512_52_0 = spill4512_1;
        forwardValue4512_52_1 = spill4512_2;
        break forward_join_52;
    }
    if (!((spill4512_1 == spill4512_2))) {
        break forward_join_50;
    }
    spill4512_3 = moom.xd.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p2)), ((moom.DT)(p3)));
    if (!((life11_5 == 0))) {
        forwardValue4512_122_0 = ((spill4512_3) ? 1 : 0);
        break forward_join_122;
    }
    if (!(spill4512_3)) {
        break forward_join_121;
    }
    spill4512_4 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_5 == 0))) {
        forwardValue4512_49_0 = ((spill4512_4) ? 1 : 0);
        break forward_join_49;
    }
    if (!((!spill4512_4))) {
        break forward_join_48;
    }
    ((net.minecraft.world.World)(p2)).b(((int)(__sourceIntrinsic_e8125218b12d_invokedynamic4512_14(24877, (8370244135279257455L ^ life9_3)))), ((moom.DT)(p3)), ((int)(0)));
    }
    forwardValue4512_49_0 = 1;
    }
    return ((forwardValue4512_49_0) != 0);
    }
    forwardValue4512_52_0 = life12_26;
    forwardValue4512_52_1 = net.minecraft.item.EnumDyeColor.BROWN;
    }
    if (!((forwardValue4512_52_0 == forwardValue4512_52_1))) {
        break forward_join_121;
    }
    life13_79 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life14_82 = ((net.minecraft.block.state.IBlockState)(life13_79)).a__ch();
    if (!((life14_82 == net.minecraft.init.Blocks.r))) {
        break forward_join_121;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life13_79)).a(((net.minecraft.block.properties.IProperty)(moom.dZ.Q))) == net.minecraft.block.BlockPlanks$EnumType.JUNGLE))) {
        break forward_join_121;
    }
    spill4512_5 = p4;
    spill4512_6 = moom.bs.DOWN;
    if (!((life11_5 == 0))) {
        forwardValue4512_77_0 = spill4512_5;
        forwardValue4512_77_1 = spill4512_6;
        break forward_join_77;
    }
    if (!((spill4512_5 == spill4512_6))) {
        break forward_join_75;
    }
    return ((0) != 0);
    }
    forwardValue4512_77_0 = p4;
    forwardValue4512_77_1 = moom.bs.UP;
    }
    if (!((forwardValue4512_77_0 == forwardValue4512_77_1))) {
        break forward_join_80;
    }
    return ((0) != 0);
    }
    life4_119 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    spill4512_7 = ((net.minecraft.world.World)(p2)).a__Boolean(((moom.DT)(life4_119)));
    if (!((life11_5 == 0))) {
        forwardValue4512_120_0 = ((spill4512_7) ? 1 : 0);
        break forward_join_120;
    }
    if (!(spill4512_7)) {
        break forward_join_119;
    }
    life15_139 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bC)).a(((net.minecraft.world.World)(p2)), ((moom.DT)(life4_119)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)), ((int)(0)), ((net.minecraft.entity.EntityLivingBase)(p1)));
    ((net.minecraft.world.World)(p2)).a(((moom.DT)(life4_119)), ((net.minecraft.block.state.IBlockState)(life15_139)), ((int)(2)));
    spill4512_8 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p1)).b1)).d;
    if (!((life11_5 == 0))) {
        forwardValue4512_120_0 = ((spill4512_8) ? 1 : 0);
        break forward_join_120;
    }
    if (!((!spill4512_8))) {
        break forward_join_119;
    }
    net.minecraft.item.ItemStack __stackOp4512_37_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4512_37_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4512_37_0)).b - 1)));
    }
    forwardValue4512_120_0 = 1;
    }
    return ((forwardValue4512_120_0) != 0);
    }
    forwardValue4512_122_0 = 0;
    }
    return ((forwardValue4512_122_0) != 0);
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
boolean spill1412_0;
    long life4_3;
    int life7_6;
    int life6_7;
    lexical_join_27: {
    life4_3 = (moom.xd.o ^ 44382804359958L);
    spill1412_0 = net.minecraft.item.ItemStack.l();
    life7_6 = 0;
    life6_7 = ((spill1412_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    if (!((life7_6 < __sourceIntrinsic_3e6a1ebf0001_invokedynamic1412_3(2428, (261696805583052035L ^ life4_3))))) {
        break lexical_join_27;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, life7_6))));
    life7_6 += 1;
    if (!((life6_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public static boolean a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, moom.DT p2) {
net.minecraft.block.IGrowable forwardValue4513_52_0;
    net.minecraft.world.World forwardValue4513_52_1;
    java.util.Random forwardValue4513_52_2;
    moom.DT forwardValue4513_52_3;
    net.minecraft.block.state.IBlockState forwardValue4513_52_4;
    int forwardValue4513_60_0;
    int forwardValue4513_62_0;
    boolean spill4513_0;
    int spill4513_1;
    boolean spill4513_2;
    boolean spill4513_3;
    net.minecraft.block.IGrowable spill4513_4;
    net.minecraft.world.World spill4513_5;
    java.util.Random spill4513_6;
    moom.DT spill4513_7;
    net.minecraft.block.state.IBlockState spill4513_8;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int life5_9;
    net.minecraft.block.Block life8_12;
    net.minecraft.block.IGrowable life7_23;
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_53: {
    forward_join_52: {
    life3_3 = (moom.xd.o ^ 87487216180352L);
    spill4513_0 = net.minecraft.item.ItemStack.m();
    life6_8 = ((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(p2)));
    life5_9 = ((spill4513_0) ? 1 : 0);
    life8_12 = ((net.minecraft.block.state.IBlockState)(life6_8)).a__ch();
    spill4513_1 = ((life8_12 instanceof net.minecraft.block.IGrowable) ? 1 : 0);
    if (!((life5_9 != 0))) {
        forwardValue4513_62_0 = spill4513_1;
        break forward_join_62;
    }
    if (!((spill4513_1 != 0))) {
        break forward_join_61;
    }
    life7_23 = ((net.minecraft.block.IGrowable)(life8_12));
    spill4513_2 = ((net.minecraft.block.IGrowable)(life7_23)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(life6_8)), ((boolean)(((net.minecraft.world.World)(p1)).G)));
    if (!((life5_9 != 0))) {
        forwardValue4513_62_0 = ((spill4513_2) ? 1 : 0);
        break forward_join_62;
    }
    if (!(spill4513_2)) {
        break forward_join_61;
    }
    spill4513_3 = ((net.minecraft.world.World)(p1)).G;
    if (!((life5_9 != 0))) {
        forwardValue4513_60_0 = ((spill4513_3) ? 1 : 0);
        break forward_join_60;
    }
    if (!((!spill4513_3))) {
        break forward_join_59;
    }
    spill4513_4 = life7_23;
    spill4513_5 = p1;
    spill4513_6 = ((net.minecraft.world.World)(p1)).u;
    spill4513_7 = p2;
    spill4513_8 = life6_8;
    if (!((life5_9 != 0))) {
        forwardValue4513_52_0 = spill4513_4;
        forwardValue4513_52_1 = spill4513_5;
        forwardValue4513_52_2 = spill4513_6;
        forwardValue4513_52_3 = spill4513_7;
        forwardValue4513_52_4 = spill4513_8;
        break forward_join_52;
    }
    if (!(((net.minecraft.block.IGrowable)(spill4513_4)).a__Boolean(((net.minecraft.world.World)(spill4513_5)), ((java.util.Random)(spill4513_6)), ((moom.DT)(spill4513_7)), ((net.minecraft.block.state.IBlockState)(spill4513_8))))) {
        break forward_join_53;
    }
    forwardValue4513_52_0 = life7_23;
    forwardValue4513_52_1 = p1;
    forwardValue4513_52_2 = ((net.minecraft.world.World)(p1)).u;
    forwardValue4513_52_3 = p2;
    forwardValue4513_52_4 = life6_8;
    }
    ((net.minecraft.block.IGrowable)(forwardValue4513_52_0)).a(((net.minecraft.world.World)(forwardValue4513_52_1)), ((java.util.Random)(forwardValue4513_52_2)), ((moom.DT)(forwardValue4513_52_3)), ((net.minecraft.block.state.IBlockState)(forwardValue4513_52_4)));
    }
    net.minecraft.item.ItemStack __stackOp4513_16_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4513_16_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4513_16_0)).b - 1)));
    }
    forwardValue4513_60_0 = 1;
    }
    return ((forwardValue4513_60_0) != 0);
    }
    forwardValue4513_62_0 = 0;
    }
    return ((forwardValue4513_62_0) != 0);
}


public static void a(net.minecraft.world.World p0, moom.DT p1, int p2) {
int lexicalValue1413_15_0;
    net.minecraft.block.Block lexicalValue1413_28_0;
    int spill1413_0;
    net.minecraft.block.Block spill1413_1;
    long life3_3;
    int life5_5;
    net.minecraft.block.Block life6_23;
    int life7_41;
    double life8_49;
    double life10_54;
    double life12_59;
    lexical_join_86: {
    lexical_join_28: {
    lexical_join_16: {
    lexical_join_15: {
    life3_3 = (moom.xd.o ^ 85315733863299L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill1413_0 = p2;
    if (!((life5_5 == 0))) {
        lexicalValue1413_15_0 = spill1413_0;
        break lexical_join_15;
    }
    if (!((spill1413_0 == 0))) {
        break lexical_join_16;
    }
    lexicalValue1413_15_0 = __sourceIntrinsic_4164adbd7d78_invokedynamic1413_3(23095, (5249281952416403155L ^ life3_3));
    }
    p2 = lexicalValue1413_15_0;
    }
    life6_23 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    spill1413_1 = life6_23;
    if (!((life5_5 == 0))) {
        lexicalValue1413_28_0 = spill1413_1;
        break lexical_join_28;
    }
    if (!((((net.minecraft.block.Block)(spill1413_1)).a__fn() != moom.fn.a))) {
        break lexical_join_86;
    }
    lexicalValue1413_28_0 = life6_23;
    }
    ((net.minecraft.block.Block)(lexicalValue1413_28_0)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    life7_41 = 0;
    lexical_cycle_33: while (true) {
    if (!((life7_41 < p2))) {
        break lexical_join_86;
    }
    life8_49 = (((java.util.Random)(moom.xd.e)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life10_54 = (((java.util.Random)(moom.xd.e)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life12_59 = (((java.util.Random)(moom.xd.e)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.VILLAGER_HAPPY)), ((double)(((double) (((float) ((moom.DT)(p1)).a()) + ((java.util.Random)(moom.xd.e)).nextFloat())))), ((double)((((double) ((moom.DT)(p1)).b()) + (((double) ((java.util.Random)(moom.xd.e)).nextFloat()) * ((net.minecraft.block.Block)(life6_23)).d())))), ((double)(((double) (((float) ((moom.DT)(p1)).c()) + ((java.util.Random)(moom.xd.e)).nextFloat())))), ((double)(life8_49)), ((double)(life10_54)), ((double)(life12_59)), ((int[])(new int[0])));
    life7_41 += 1;
    if (!((life5_5 != 0))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.entity.EntityLivingBase p2) {
net.minecraft.entity.passive.EntitySheep forwardValue4511_30_0;
    int forwardValue4511_39_0;
    int forwardValue4511_41_0;
    int spill4511_0;
    boolean spill4511_1;
    net.minecraft.entity.passive.EntitySheep spill4511_2;
    long life4_3;
    int life6_5;
    net.minecraft.entity.passive.EntitySheep life7_16;
    net.minecraft.item.EnumDyeColor life8_20;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_30: {
    life4_3 = (moom.xd.o ^ 20132612563310L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4511_0 = ((p2 instanceof net.minecraft.entity.passive.EntitySheep) ? 1 : 0);
    if (!((life6_5 != 0))) {
        forwardValue4511_41_0 = spill4511_0;
        break forward_join_41;
    }
    if (!((spill4511_0 != 0))) {
        break forward_join_40;
    }
    life7_16 = ((net.minecraft.entity.passive.EntitySheep)(p2));
    life8_20 = net.minecraft.item.EnumDyeColor.a(((int)(((net.minecraft.item.ItemStack)(p0)).c())));
    spill4511_1 = ((net.minecraft.entity.passive.EntitySheep)(life7_16)).ae();
    if (!((life6_5 != 0))) {
        forwardValue4511_39_0 = ((spill4511_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill4511_1))) {
        break forward_join_38;
    }
    spill4511_2 = life7_16;
    if (!((life6_5 != 0))) {
        forwardValue4511_30_0 = spill4511_2;
        break forward_join_30;
    }
    if (!((((net.minecraft.entity.passive.EntitySheep)(spill4511_2)).a__sourceReturn_d841ada59b() != life8_20))) {
        break forward_join_38;
    }
    forwardValue4511_30_0 = life7_16;
    }
    ((net.minecraft.entity.passive.EntitySheep)(forwardValue4511_30_0)).a(((net.minecraft.item.EnumDyeColor)(life8_20)));
    net.minecraft.item.ItemStack __stackOp4511_11_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4511_11_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4511_11_0)).b - 1)));
    }
    forwardValue4511_39_0 = 1;
    }
    return ((forwardValue4511_39_0) != 0);
    }
    forwardValue4511_41_0 = 0;
    }
    return ((forwardValue4511_41_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1684_79(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9717_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33df8f166dd6_originalDynamicSite1704_4(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8125218b12d_invokedynamic4512_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3e6a1ebf0001_invokedynamic1412_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4164adbd7d78_invokedynamic1413_3(int a0, long a1) throws E;
}
