package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nr extends moom.mS<moom.to> {

private final boolean B;

private static final long C;

private static final long[] D;

private static final java.lang.Integer[] E;

private static final java.util.Map F;

public nr(net.minecraft.client.renderer.entity.RenderManager p0) {
this(p0, false);
}


public nr(net.minecraft.client.renderer.entity.RenderManager p0, boolean p1) {
super(p0, new moom.iX(0x0.0p+0f, p1), 0x1.0000000000000p-1f);
    this.B = p1;
    (this).a(new net.minecraft.client.renderer.entity.layers.LayerBipedArmor(this));
    (this).a(new moom.nQ(this));
    (this).a(new net.minecraft.client.renderer.entity.layers.LayerArrow(this));
    (this).a(new net.minecraft.client.renderer.entity.layers.LayerDeadmau5Head(this));
    (this).a(new net.minecraft.client.renderer.entity.layers.LayerCape(this));
    (this).a(new moom.nK((this).a__iX().i));
}


static {
C = ((long)(((moom._a)(moom._c.a(((long)(-1576376446331145401L)), ((long)(3083532616538988924L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(268439999831000L)))));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.nr.C ^ 35550189214845L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill947_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill947_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill947_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill947_14 = new byte[8];
    (__sourceSpill947_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill947_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation947_16 = __sourceSpill947_14;
    ((javax.crypto.Cipher)(__sourceSpill947_11)).init(((int)(__sourceSpill947_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill947_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation947_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "w¦DìÎá;ã<\tL:$"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill947_25 = local6_life21;
        int __sourceSpill947_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill947_25)).substring(((int)(__sourceSpill947_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill947_30 = local8_life19;
        int __sourceSpill947_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill947_33 = new byte[8];
        (__sourceSpill947_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill947_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill947_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill947_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill947_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill947_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill947_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill947_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill947_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill947_34)).doFinal(((byte[])(__sourceSpill947_33)));
        (__sourceSpill947_30)[__sourceSpill947_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    D = ((long[])(local8_life19));
    E = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b__sourceReturn_3624bf56ed(moom.to p0) {
float local2 = 0x1.0p0f;
    moom.kZ.c(((float)(local2)), ((float)(local2)), ((float)(local2)));
    java.lang.Object local3 = ((moom.nr)(this)).a__iX();
    ((moom.nr)(this)).a__Void(((moom.to)(p0)));
    ((moom.iX)(local3)).a = ((float)(0x0.0p0f));
    ((moom.iX)(local3)).r = ((boolean)(false));
    ((moom.iX)(local3)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.iX)(local3)).a();
    return;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13260;
      if (E[var3] == null) {
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
         long var5 = D[var3];
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
         Object[] var9 = (Object[])F.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               F.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/nr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         E[var3] = var15;
      }

      return E[var3];
}


public void c(moom.to p0) {
float local2 = 0x1.0p0f;
    moom.kZ.c(((float)(local2)), ((float)(local2)), ((float)(local2)));
    java.lang.Object local3 = ((moom.nr)(this)).a__iX();
    ((moom.nr)(this)).a__Void(((moom.to)(p0)));
    ((moom.iX)(local3)).r = ((boolean)(false));
    ((moom.iX)(local3)).a = ((float)(0x0.0p0f));
    ((moom.iX)(local3)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.iX)(local3)).b__sourceReturn_da8c82d5d4();
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8516_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.nr.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void a__Void(moom.to p0) {
long life2_3;
    moom.iX life4_6;
    net.minecraft.item.ItemStack life5_27;
    int life6_81;
    com.moon.et life7_86;
    moom.a1 life8_114;
    forward_join_125: {
    forward_join_119: {
    forward_join_99: {
    forward_join_95: {
    forward_join_22: {
    life2_3 = (moom.nr.C ^ 4456322931218L);
    life4_6 = ((moom.nr)(this)).a__iX();
    if (!(((moom.to)(p0)).U__Boolean())) { break forward_join_22; }
    ((moom.iX)(life4_6)).a(((boolean)(false)));
    ((moom.jD)(((moom.iX)(life4_6)).i)).n = ((boolean)(true));
    ((moom.jD)(((moom.iX)(life4_6)).j)).n = ((boolean)(true));
    break forward_join_125;
    }
    life5_27 = ((net.minecraft.entity.player.InventoryPlayer)(((moom.to)(p0)).bD)).a__xW();
    ((moom.iX)(life4_6)).a(((boolean)(true)));
    ((moom.jD)(((moom.iX)(life4_6)).j)).n = ((boolean)(((moom.to)(p0)).a(((net.minecraft.entity.player.EnumPlayerModelParts)(net.minecraft.entity.player.EnumPlayerModelParts.HAT)))));
    ((moom.jD)(((moom.iX)(life4_6)).x)).n = ((boolean)(((moom.to)(p0)).a(((net.minecraft.entity.player.EnumPlayerModelParts)(net.minecraft.entity.player.EnumPlayerModelParts.JACKET)))));
    ((moom.jD)(((moom.iX)(life4_6)).v)).n = ((boolean)(((moom.to)(p0)).a(((net.minecraft.entity.player.EnumPlayerModelParts)(net.minecraft.entity.player.EnumPlayerModelParts.LEFT_PANTS_LEG)))));
    ((moom.jD)(((moom.iX)(life4_6)).w)).n = ((boolean)(((moom.to)(p0)).a(((net.minecraft.entity.player.EnumPlayerModelParts)(net.minecraft.entity.player.EnumPlayerModelParts.RIGHT_PANTS_LEG)))));
    ((moom.jD)(((moom.iX)(life4_6)).t)).n = ((boolean)(((moom.to)(p0)).a(((net.minecraft.entity.player.EnumPlayerModelParts)(net.minecraft.entity.player.EnumPlayerModelParts.LEFT_SLEEVE)))));
    ((moom.jD)(((moom.iX)(life4_6)).u)).n = ((boolean)(((moom.to)(p0)).a(((net.minecraft.entity.player.EnumPlayerModelParts)(net.minecraft.entity.player.EnumPlayerModelParts.RIGHT_SLEEVE)))));
    ((moom.iX)(life4_6)).p = ((int)(0));
    ((moom.iX)(life4_6)).s = ((boolean)(false));
    ((moom.iX)(life4_6)).r = ((boolean)(((moom.to)(p0)).t__Boolean()));
    life6_81 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K)).bD)).c;
    life7_86 = new com.moon.et(life6_81);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life7_86)));
    if (!((life5_27 != null))) { break forward_join_95; }
    if (!((life6_81 != ((com.moon.et)(life7_86)).a()))) { break forward_join_99; }
    }
    ((moom.iX)(life4_6)).q = ((int)(0));
    break forward_join_125;
    }
    ((moom.iX)(life4_6)).q = ((int)(1));
    if (!((((moom.to)(p0)).l__Int() > 0))) { break forward_join_125; }
    life8_114 = ((net.minecraft.item.ItemStack)(life5_27)).a__a1();
    if (!((life8_114 == moom.a1.BLOCK))) { break forward_join_119; }
    ((moom.iX)(life4_6)).q = ((int)(__sourceIntrinsic_d55f02a04e83_invokedynamic4394_52(13903, (7822769938145450733L ^ life2_3))));
    break forward_join_125;
    }
    if (!((life8_114 == moom.a1.BOW))) { break forward_join_125; }
    ((moom.iX)(life4_6)).s = ((boolean)(true));
    }
    return;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.nr)(this)).a(((moom.to)(((moom.to)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected void a__sourceBridge_5cde8683ff(net.minecraft.entity.Entity p0, double p1, double p2, double p3, java.lang.String p4, float p5, double p6) {
((moom.nr)(this)).a(((moom.to)(((moom.to)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((java.lang.String)(p4)), ((float)(p5)), ((double)(p6)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.nr)(this)).a__sourceReturn_b316c2ba59(((moom.to)(((moom.to)(p0)))));
}


public moom.iQ a__iQ() {
return ((moom.nr)(this)).a__iX();
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.nr)(this)).a__sourceReturn_eebd32ddfb(((moom.to)(((moom.to)(p0)))), ((float)(p1)));
}


public moom.iX a__iX() {
return ((moom.iX)(super.a__iQ()));
}


public void a(moom.to p0, double p1, double p2, double p3, float p4, float p5) {
double life10_12;
    forward_join_31: {
    forward_join_20: {
    forward_join_8: {
    if (!(((moom.to)(p0)).O__Boolean())) { break forward_join_8; }
    if (!((((net.minecraft.client.renderer.entity.RenderManager)(this.b)).e == p0))) { break forward_join_31; }
    }
    life10_12 = p2;
    if (!(((moom.to)(p0)).t__Boolean())) { break forward_join_20; }
    if (!((((p0 instanceof net.minecraft.client.entity.EntityPlayerSP) ? 1 : 0) == 0))) { break forward_join_20; }
    life10_12 = (p2 - 0x1.0p-3d);
    }
    ((moom.nr)(this)).a__Void(((moom.to)(p0)));
    __sourceExactCall_b35d2442d1a9b1(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((double)(p1)), ((double)(life10_12)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(moom.to p0, float p1, float p2, float p3) {
forward_join_31: {
    forward_join_25: {
    if (!(((moom.to)(p0)).p__Boolean())) { break forward_join_25; }
    if (!(((moom.to)(p0)).K__Boolean())) { break forward_join_25; }
    __sourceExactCall_1335870edf69d2(((float)(__sourceExactCall_17d53c7ff89260(((moom.to)(p0))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_1335870edf69d2(((float)(((moom.nr)(this)).a__sourceReturn_fe6e998144(((p0))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    __sourceExactCall_1335870edf69d2(((float)(0x1.0ep8f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    break forward_join_31;
    }
    __sourceExactCall_5b0c97a9a0d465(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    }
    return;
}


protected void a(moom.to p0, double p1, double p2, double p3) {
forward_join_31: {
    forward_join_25: {
    if (!(((moom.to)(p0)).p__Boolean())) { break forward_join_25; }
    if (!(((moom.to)(p0)).K__Boolean())) { break forward_join_25; }
    __sourceExactCall_938d33ad9425f9(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((double)((p1 + ((double) ((moom.to)(p0)).bV)))), ((double)((p2 + ((double) ((moom.to)(p0)).bW)))), ((double)((p3 + ((double) ((moom.to)(p0)).bX)))));
    break forward_join_31;
    }
    __sourceExactCall_938d33ad9425f9(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)));
    }
    return;
}


public void a__Void() {
moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x1.8p-3f)), ((float)(0x0.0p0f)));
    return;
}


protected void a__sourceReturn_eebd32ddfb(moom.to p0, float p1) {
float local3 = 0x1.ep-1f;
    moom.kZ.a(((float)(local3)), ((float)(local3)), ((float)(local3)));
    return;
}


protected void a(moom.to p0, double p1, double p2, double p3, java.lang.String p4, float p5, double p6) {
long life12_3;
    net.minecraft.scoreboard.Scoreboard life14_10;
    net.minecraft.scoreboard.ScoreObjective life15_14;
    net.minecraft.scoreboard.Score life16_22;
    life12_3 = (moom.nr.C ^ 113842145561406L);
    if ((p6 < 0x1.9p6d)) {
        life14_10 = ((moom.to)(p0)).a__Bh();
        life15_14 = ((net.minecraft.scoreboard.Scoreboard)(life14_10)).a__Bg(((int)(2)));
        if ((life15_14 != null)) {
        life16_22 = __sourceExactCall_beaf34f2d4b213(((net.minecraft.scoreboard.Scoreboard)(life14_10)), ((java.lang.String)(((moom.to)(p0)).a__String())), ((net.minecraft.scoreboard.ScoreObjective)(life15_14)));
        __sourceExactCall_93ddb3241dd6ea(((moom.nr)(this)), ((net.minecraft.entity.Entity)(p0)), ((java.lang.String)(__sourceIntrinsic_1401b2719866_invokedynamic6931_7(__sourceExactCall_c367fdc5c8d0e1(((net.minecraft.scoreboard.Score)(life16_22))), ((net.minecraft.scoreboard.ScoreObjective)(life15_14)).b()))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((int)(__sourceIntrinsic_1401b2719866_invokedynamic6931_8(10057, (7611396148098734790L ^ life12_3)))));
        p2 = (p2 + ((double) ((((float) ((net.minecraft.client.gui.FontRenderer)(((moom.nr)(this)).a__ga())).c) * 0x1.266666p0f) * p5)));
    }
    }
    __sourceExactCall_39e7e379dc7ceb(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((java.lang.String)(p4)), ((float)(p5)), ((double)(p6)));
    return;
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((moom.nr)(this)).a(((moom.to)(((moom.to)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected void a__sourceBridge_1c9c2feff3(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3) {
((moom.nr)(this)).a(((moom.to)(((moom.to)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)));
}


protected void a__sourceBridge_e093c470d2(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
((moom.nr)(this)).a(((moom.to)(((moom.to)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)));
}


protected moom.DD a__sourceReturn_b316c2ba59(moom.to p0) {
return ((moom.to)(p0)).a__DD();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8516_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d55f02a04e83_invokedynamic4394_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1401b2719866_invokedynamic6931_7(int a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1401b2719866_invokedynamic6931_8(int a0, long a1) throws E;

public void a__Void(moom.to __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(moom.to __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native void __sourceExactCall_b35d2442d1a9b1(moom.mS p0, net.minecraft.entity.EntityLivingBase p1, double p2, double p3, double p4, float p5, float p6);
private static native void __sourceExactCall_5b0c97a9a0d465(moom.mS p0, net.minecraft.entity.EntityLivingBase p1, float p2, float p3, float p4);
private static native void __sourceExactCall_938d33ad9425f9(moom.mS p0, net.minecraft.entity.EntityLivingBase p1, double p2, double p3, double p4);
private static native net.minecraft.scoreboard.Score __sourceExactCall_beaf34f2d4b213(net.minecraft.scoreboard.Scoreboard p0, java.lang.String p1, net.minecraft.scoreboard.ScoreObjective p2);
private static native void __sourceExactCall_93ddb3241dd6ea(moom.nr p0, net.minecraft.entity.Entity p1, java.lang.String p2, double p3, double p4, double p5, int p6);
private static native int __sourceExactCall_c367fdc5c8d0e1(net.minecraft.scoreboard.Score p0);
private static native void __sourceExactCall_39e7e379dc7ceb(moom.mS p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, java.lang.String p5, float p6, double p7);

private static native void __sourceExactCall_1335870edf69d2(float p0, float p1, float p2, float p3);
private static native float __sourceExactCall_17d53c7ff89260(moom.to p0);
}
