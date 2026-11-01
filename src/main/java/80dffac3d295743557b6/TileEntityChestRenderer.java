package net.minecraft.client.renderer.tileentity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class TileEntityChestRenderer extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<net.minecraft.tileentity.TileEntityChest> {

private static moom.DD f;

private static moom.DD g;

private static moom.DD h;

private static moom.DD i;

private static moom.DD j;

private static moom.DD k;

public moom.i4 l;

public moom.i4 m;

private boolean n;

private static long o;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public TileEntityChestRenderer() { super(); }


private static void __sourceConstructorBody_6580fd8e73dc8f6d(net.minecraft.client.renderer.tileentity.TileEntityChestRenderer receiver) throws Throwable {

long local1_life1 = (net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.o ^ 1763257410947L);

    net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.__sourceConstructorInit_6580fd8e73dc8f6d_0(((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(receiver)));

    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(receiver)).l = ((moom.i4)(new moom.i4()));

    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(receiver)).m = ((moom.i4)(new moom.i5()));

    java.util.Calendar local3_life6 = java.util.Calendar.getInstance();

    if (((((java.util.Calendar)(local3_life6)).get(((int)(2))) + 1) == __sourceIntrinsic_6580fd8e73dc8f6d_originalDynamicSite912_8(18914, (183084742039100261L ^ local1_life1)))) {

        if ((((java.util.Calendar)(local3_life6)).get(((int)(5))) >= __sourceIntrinsic_6580fd8e73dc8f6d_originalDynamicSite912_10(15585, (7918971457765518955L ^ local1_life1)))) {

        if ((((java.util.Calendar)(local3_life6)).get(((int)(5))) <= __sourceIntrinsic_6580fd8e73dc8f6d_originalDynamicSite912_12(19473, (3886008336578076314L ^ local1_life1)))) {

        ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(receiver)).n = ((boolean)(true));

    }

    }

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6580fd8e73dc8f6d_0(net.minecraft.client.renderer.tileentity.TileEntityChestRenderer a0) throws E;

static {
o = ((long)(((moom._a)(moom._c.a(((long)(-1707101848665633104L)), ((long)(2079572661812365876L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(228003524165591L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.o ^ 4235754579593L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1823_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1823_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1823_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1823_14 = new byte[8];
    (__sourceSpill1823_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1823_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1823_16 = __sourceSpill1823_14;
    ((javax.crypto.Cipher)(__sourceSpill1823_11)).init(((int)(__sourceSpill1823_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1823_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1823_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Õ=ìÂî\004úu¨@äE\002Ö2HçÄ[ZÁLL.ë}ÞgÚ\002\f\004hðõ¶\032¨Üu\000\023ßjE#\007=¨\0016²ÊQ®¾\000ÔÃ©hD\027c¦q"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1823_25 = local6_life21;
        int __sourceSpill1823_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1823_25)).substring(((int)(__sourceSpill1823_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1823_30 = local8_life19;
        int __sourceSpill1823_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1823_33 = new byte[8];
        (__sourceSpill1823_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1823_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1823_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1823_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1823_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1823_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1823_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1823_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1823_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1823_34)).doFinal(((byte[])(__sourceSpill1823_33)));
        (__sourceSpill1823_30)[__sourceSpill1823_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "È\035vµ½Dä­×\025] Ñu"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1823_38 = local6_life21;
        int __sourceSpill1823_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1823_38)).substring(((int)(__sourceSpill1823_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1823_43 = local8_life19;
        int __sourceSpill1823_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1823_46 = new byte[8];
        (__sourceSpill1823_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1823_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1823_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1823_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1823_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1823_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1823_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1823_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1823_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1823_47)).doFinal(((byte[])(__sourceSpill1823_46)));
        (__sourceSpill1823_43)[__sourceSpill1823_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[11]));
    f = ((moom.DD)(new moom.DD("textures/entity/chest/trapped_double.png")));
    g = ((moom.DD)(new moom.DD("textures/entity/chest/christmas_double.png")));
    h = ((moom.DD)(new moom.DD("textures/entity/chest/normal_double.png")));
    i = ((moom.DD)(new moom.DD("textures/entity/chest/trapped.png")));
    j = ((moom.DD)(new moom.DD("textures/entity/chest/christmas.png")));
    k = ((moom.DD)(new moom.DD("textures/entity/chest/normal.png")));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10861_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ot"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9137;
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
            throw new RuntimeException("moom/ot", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


public void a(net.minecraft.tileentity.TileEntityChest p0, double p1, double p2, double p3, float p4, int p5) {
long life10_3;
    int life12_17;
    net.minecraft.block.Block life13_21;
    moom.i4 life13_74;
    int life14_217;
    float life15_302;
    float life16_319;
    float life16_342;
    float life15_352;
    float life15_360;
    forward_join_355: {
    forward_join_310: {
    forward_join_287: {
    forward_join_243: {
    forward_join_233: {
    forward_join_223: {
    forward_join_214: {
    forward_join_205: {
    forward_join_200: {
    forward_join_170: {
    forward_join_161: {
    forward_join_158: {
    forward_join_150: {
    forward_join_143: {
    forward_join_111: {
    forward_join_107: {
    forward_join_99: {
    forward_join_92: {
    forward_join_48: {
    forward_join_46: {
    forward_join_19: {
    life10_3 = (net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.o ^ 49131999041848L);
    moom.kZ.j();
    moom.kZ.c(((int)(__sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_2(7444, (4217947241132552999L ^ life10_3)))));
    moom.kZ.a(((boolean)(true)));
    if (!((!((net.minecraft.tileentity.TileEntityChest)(p0)).a__Boolean()))) { break forward_join_19; }
    life12_17 = 0;
    break forward_join_48;
    }
    life13_21 = ((net.minecraft.tileentity.TileEntityChest)(p0)).a__ch();
    life12_17 = ((net.minecraft.tileentity.TileEntityChest)(p0)).e();
    if (!((((life13_21 instanceof moom.cZ) ? 1 : 0) != 0))) { break forward_join_46; }
    if (!((life12_17 == 0))) { break forward_join_46; }
    ((moom.cZ)(((moom.cZ)(life13_21)))).a__sourceReturn_79273189a1(((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityChest)(p0)).c__sourceInterfaceWorld())), ((moom.DT)(((net.minecraft.tileentity.TileEntityChest)(p0)).a__DT())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityChest)(p0)).c__sourceInterfaceWorld())).a__fE(((moom.DT)(((net.minecraft.tileentity.TileEntityChest)(p0)).a__DT()))))));
    life12_17 = ((net.minecraft.tileentity.TileEntityChest)(p0)).e();
    }
    ((net.minecraft.tileentity.TileEntityChest)(p0)).g__sourceReturn_da8c82d5d4();
    }
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).p == null))) { break forward_join_355; }
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).r == null))) { break forward_join_355; }
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).q == null))) { break forward_join_111; }
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).s == null))) { break forward_join_111; }
    life13_74 = this.l;
    if (!((p5 >= 0))) { break forward_join_92; }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(this)).b(((moom.DD)((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.a)[p5])));
    moom.kZ.l(((int)(__sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_25(12477, (1087635285839797896L ^ life10_3)))));
    int spill5478_0 = 22484;
    moom.kZ.B();
    long spill5478_1 = (4886054310497958368L ^ life10_3);
    moom.kZ.a(((float)(0x1.0p2f)), ((float)(0x1.0p2f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x1.0p-4f)), ((float)(0x1.0p-4f)), ((float)(0x1.0p-4f)));
    moom.kZ.l(((int)(__sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_30(spill5478_0, spill5478_1))));
    break forward_join_161;
    }
    if (!(this.n)) { break forward_join_99; }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(this)).b(((moom.DD)(net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.j)));
    break forward_join_161;
    }
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).h() == 1))) { break forward_join_107; }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(this)).b(((moom.DD)(net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.i)));
    break forward_join_161;
    }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(this)).b(((moom.DD)(net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.k)));
    break forward_join_161;
    }
    life13_74 = this.m;
    if (!((p5 >= 0))) { break forward_join_143; }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(this)).b(((moom.DD)((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.a)[p5])));
    moom.kZ.l(((int)(__sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_43(18329, (2775884707974392238L ^ life10_3)))));
    int spill5478_2 = 32071;
    moom.kZ.B();
    long spill5478_3 = (8745536140660740984L ^ life10_3);
    moom.kZ.a(((float)(0x1.0p3f)), ((float)(0x1.0p2f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x1.0p-4f)), ((float)(0x1.0p-4f)), ((float)(0x1.0p-4f)));
    moom.kZ.l(((int)(__sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_48(spill5478_2, spill5478_3))));
    break forward_join_161;
    }
    if (!(this.n)) { break forward_join_150; }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(this)).b(((moom.DD)(net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.g)));
    break forward_join_161;
    }
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).h() == 1))) { break forward_join_158; }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(this)).b(((moom.DD)(net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.f)));
    break forward_join_161;
    }
    ((net.minecraft.client.renderer.tileentity.TileEntityChestRenderer)(this)).b(((moom.DD)(net.minecraft.client.renderer.tileentity.TileEntityChestRenderer.h)));
    }
    moom.kZ.B();
    moom.kZ.y();
    if (!((p5 < 0))) { break forward_join_170; }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    moom.kZ.b(((float)(((float) p1))), ((float)((((float) p2) + 0x1.0p0f))), ((float)((((float) p3) + 0x1.0p0f))));
    moom.kZ.a(((float)(0x1.0p0f)), ((float)(-0x1.0p0f)), ((float)(-0x1.0p0f)));
    moom.kZ.b(((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)));
    life14_217 = 0;
    if (!((life12_17 == 2))) { break forward_join_200; }
    life14_217 = __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_64(15800, (5898956878124209029L ^ life10_3));
    }
    if (!((life12_17 == 3))) { break forward_join_205; }
    life14_217 = 0;
    }
    if (!((life12_17 == 4))) { break forward_join_214; }
    life14_217 = __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_65(26769, (77840536522000035L ^ life10_3));
    }
    if (!((life12_17 == 5))) { break forward_join_223; }
    life14_217 = __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_66(31589, (5471328365369202003L ^ life10_3));
    }
    if (!((life12_17 == 2))) { break forward_join_233; }
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).q != null))) { break forward_join_233; }
    moom.kZ.b(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    }
    if (!((life12_17 == 5))) { break forward_join_243; }
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).s != null))) { break forward_join_243; }
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)));
    }
    moom.kZ.b(((float)(((float) life14_217))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(-0x1.0p-1f)), ((float)(-0x1.0p-1f)), ((float)(-0x1.0p-1f)));
    life15_302 = (((net.minecraft.tileentity.TileEntityChest)(p0)).u + ((((net.minecraft.tileentity.TileEntityChest)(p0)).t - ((net.minecraft.tileentity.TileEntityChest)(p0)).u) * p4));
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).p != null))) { break forward_join_287; }
    life16_319 = (((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(p0)).p)).u + ((((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(p0)).p)).t - ((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(p0)).p)).u) * p4));
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life16_319)), ((float)(life15_302))) > 0))) { break forward_join_287; }
    life15_302 = life16_319;
    }
    if (!((((net.minecraft.tileentity.TileEntityChest)(p0)).r != null))) { break forward_join_310; }
    life16_342 = (((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(p0)).r)).u + ((((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(p0)).r)).t - ((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(p0)).r)).u) * p4));
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life16_342)), ((float)(life15_302))) > 0))) { break forward_join_310; }
    life15_302 = life16_342;
    }
    life15_352 = (0x1.0p0f - life15_302);
    life15_360 = (0x1.0p0f - ((life15_352 * life15_352) * life15_352));
    ((moom.jD)(((moom.i4)(life13_74)).i)).h = ((float)((-((life15_360 * 0x1.921fb6p1f) / 0x1.0p1f))));
    ((moom.i4)(life13_74)).a();
    moom.kZ.z();
    moom.kZ.C();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((p5 >= 0))) { break forward_join_355; }
    moom.kZ.l(((int)(__sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_98(18329, (2775884707974392238L ^ life10_3)))));
    int spill5478_4 = 32071;
    moom.kZ.C();
    moom.kZ.l(((int)(__sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_101(spill5478_4, (8745536140660740984L ^ life10_3)))));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_6580fd8e73dc8f6d_originalDynamicSite912_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6580fd8e73dc8f6d_originalDynamicSite912_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6580fd8e73dc8f6d_originalDynamicSite912_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10861_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a0b242d0ffbb_invokedynamic5478_101(int a0, long a1) throws E;
}
