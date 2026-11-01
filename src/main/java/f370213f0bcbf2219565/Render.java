package net.minecraft.client.renderer.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class Render<T extends net.minecraft.entity.Entity> implements moom.Kl {

private static final moom.DD a;

protected final net.minecraft.client.renderer.entity.RenderManager b;

public float c;

protected float d;

private java.lang.Class e;

private moom.DD f;

private static net.minecraft.entity.Entity[] g;

private static final long L;

private static final long[] O;

private static final java.lang.Integer[] P;

private static final java.util.Map Q;

protected Render(net.minecraft.client.renderer.entity.RenderManager p0) {
super();
    this.d = 0x1.0000000000000p+0f;
    this.e = null;
    this.f = null;
    this.b = p0;
}


static {
L = ((long)(((moom._a)(moom._c.a(((long)(2785254381584455765L)), ((long)(8456581472104246173L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(35457992181808L)))));
    net.minecraft.entity.Entity[] __sourceSpill1815_6 = new net.minecraft.entity.Entity[5];
    Q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (net.minecraft.client.renderer.entity.Render.L ^ 73089185942647L);
    net.minecraft.client.renderer.entity.Render.b(((net.minecraft.entity.Entity[])(__sourceSpill1815_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1815_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1815_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1815_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1815_16 = new byte[8];
    (__sourceSpill1815_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1815_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1815_18 = __sourceSpill1815_16;
    ((javax.crypto.Cipher)(__sourceSpill1815_13)).init(((int)(__sourceSpill1815_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1815_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1815_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[12];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "¦ Kºa­\"ö\021)¨æZ\030¸L\002{ñÿøÆÀ\025Z¢p¸Ð\036ýÛ>\021h§%qû¸\000\035gù'IüèÉ\026\032[B.ÐkiNU#\000¦ÊñØ£ÕÐ³/¾q"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1815_27 = local6_life23;
        int __sourceSpill1815_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1815_27)).substring(((int)(__sourceSpill1815_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1815_32 = local8_life21;
        int __sourceSpill1815_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1815_35 = new byte[8];
        (__sourceSpill1815_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1815_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1815_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1815_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1815_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1815_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1815_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1815_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1815_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1815_36)).doFinal(((byte[])(__sourceSpill1815_35)));
        (__sourceSpill1815_32)[__sourceSpill1815_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "â\007Á}WÐM£\b\000B»"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1815_40 = local6_life23;
        int __sourceSpill1815_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1815_40)).substring(((int)(__sourceSpill1815_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1815_45 = local8_life21;
        int __sourceSpill1815_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1815_48 = new byte[8];
        (__sourceSpill1815_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1815_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1815_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1815_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1815_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1815_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1815_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1815_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1815_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1815_49)).doFinal(((byte[])(__sourceSpill1815_48)));
        (__sourceSpill1815_45)[__sourceSpill1815_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    O = ((long[])(local8_life21));
    P = ((java.lang.Integer[])(new java.lang.Integer[12]));
    a = ((moom.DD)(new moom.DD("textures/misc/shadow.png")));
}


public static void b(net.minecraft.entity.Entity[] p0) {
net.minecraft.client.renderer.entity.Render.g = ((net.minecraft.entity.Entity[])(p0));
    return;
}


protected boolean b(T p0) {
java.lang.Object local2 = __sourceExactCall_77974434d2c6ae(this, ((net.minecraft.entity.Entity)(p0)));
    if ((this.f != null)) {
        local2 = this.f;
    }
    if ((local2 == null)) {
        return ((0) != 0);
    }
    this.b(((moom.DD)(local2)));
    return ((1) != 0);
}


public void b(moom.DD p0) {
((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).c)).a__Void(((moom.DD)(p0)));
    return;
}


private void b(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    com.moon.ee life12_8;
    net.minecraft.world.World life13_41;
    float life14_46;
    net.minecraft.entity.EntityLiving life15_52;
    double life15_76;
    double life17_88;
    double life19_100;
    int life21_106;
    int life22_112;
    int life23_118;
    int life24_121;
    int life25_127;
    int life26_133;
    double life27_137;
    double life29_141;
    double life31_145;
    net.minecraft.client.renderer.Tessellator life33_147;
    moom.lw life34_150;
    java.util.Iterator life35_173;
    moom.DT life36_180;
    net.minecraft.block.Block life37_186;
    forest_join_218: {
    forest_join_208: {
    forest_join_64: {
    forest_join_21: {
    forest_join_17: {
    life10_3 = (net.minecraft.client.renderer.entity.Render.L ^ 3902382490000L);
    life12_8 = new com.moon.ee(p0);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life12_8)));
    if (!(((com.moon.ee)(life12_8)).isCancelled())) {
        break forest_join_17;
    }
    return;
    }
    if (!(moom.BU.ap())) {
        break forest_join_21;
    }
    if (!((!moom.MP.cy))) {
        break forest_join_218;
    }
    }
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_9da02166e535_invokedynamic1070_8(25588, (5973184837951390708L ^ life10_3)))), ((int)(__sourceIntrinsic_9da02166e535_invokedynamic1070_9(9107, (293558506821862302L ^ life10_3)))));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).c)).a__Void(((moom.DD)(net.minecraft.client.renderer.entity.Render.a)));
    life13_41 = ((net.minecraft.client.renderer.entity.Render)(this)).a__Eu();
    moom.kZ.a(((boolean)(false)));
    life14_46 = this.c;
    if (!((((p0 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0) != 0))) {
        break forest_join_64;
    }
    life15_52 = ((net.minecraft.entity.EntityLiving)(p0));
    life14_46 = (life14_46 * ((net.minecraft.entity.EntityLiving)(life15_52)).k());
    if (!(((net.minecraft.entity.EntityLiving)(life15_52)).c__Boolean())) {
        break forest_join_64;
    }
    life14_46 = (life14_46 * 0x1.0p-1f);
    }
    life15_76 = (((net.minecraft.entity.Entity)(p0)).M + ((((net.minecraft.entity.Entity)(p0)).n - ((net.minecraft.entity.Entity)(p0)).M) * ((double) p5)));
    life17_88 = (((net.minecraft.entity.Entity)(p0)).N + ((((net.minecraft.entity.Entity)(p0)).o - ((net.minecraft.entity.Entity)(p0)).N) * ((double) p5)));
    life19_100 = (((net.minecraft.entity.Entity)(p0)).O + ((((net.minecraft.entity.Entity)(p0)).p - ((net.minecraft.entity.Entity)(p0)).O) * ((double) p5)));
    life21_106 = moom.Dr.b__Int(((double)((life15_76 - ((double) life14_46)))));
    life22_112 = moom.Dr.b__Int(((double)((life15_76 + ((double) life14_46)))));
    life23_118 = moom.Dr.b__Int(((double)((life17_88 - ((double) life14_46)))));
    life24_121 = moom.Dr.b__Int(((double)(life17_88)));
    life25_127 = moom.Dr.b__Int(((double)((life19_100 - ((double) life14_46)))));
    life26_133 = moom.Dr.b__Int(((double)((life19_100 + ((double) life14_46)))));
    life27_137 = (p1 - life15_76);
    life29_141 = (p2 - life17_88);
    life31_145 = (p3 - life19_100);
    life33_147 = net.minecraft.client.renderer.Tessellator.a();
    life34_150 = ((net.minecraft.client.renderer.Tessellator)(life33_147)).a__lw();
    ((moom.lw)(life34_150)).a(((int)(__sourceIntrinsic_9da02166e535_invokedynamic1070_39(3380, (3743343405085519162L ^ life10_3)))), ((moom.oD)(moom.oB.k)));
    life35_173 = ((java.lang.Iterable)(moom.DT.b(((moom.DT)(new moom.DT(life21_106, life23_118, life25_127))), ((moom.DT)(new moom.DT(life22_112, life24_121, life26_133)))))).iterator();
    forest_cycle_173: while (true) {
    forest_join_207: {
    if (!(((java.util.Iterator)(life35_173)).hasNext())) {
        break forest_join_208;
    }
    life36_180 = ((moom.DT)(((java.util.Iterator)(life35_173)).next()));
    life37_186 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(life13_41)).a__fE(((moom.DT)(((moom.DT)(life36_180)).b__DT()))))).a__ch();
    if (!((((net.minecraft.block.Block)(life37_186)).c__Int() != -1))) {
        break forest_join_207;
    }
    if (!((((net.minecraft.world.World)(life13_41)).b(((moom.DT)(life36_180))) > 3))) {
        break forest_join_207;
    }
    this.a(((net.minecraft.block.Block)(life37_186)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((moom.DT)(life36_180)), ((float)(p4)), ((float)(life14_46)), ((double)(life27_137)), ((double)(life29_141)), ((double)(life31_145)));
    }
    continue forest_cycle_173;
    }
    }
    ((net.minecraft.client.renderer.Tessellator)(life33_147)).a__Void();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.k();
    moom.kZ.a(((boolean)(true)));
    }
    return;
}


public static net.minecraft.entity.Entity[] b() {
return net.minecraft.client.renderer.entity.Render.g;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
double life10_42;
    float life12_53;
    forward_join_71: {
    forward_join_64: {
    forward_join_54: {
    if (!((((net.minecraft.client.renderer.entity.RenderManager)(this.b)).i != null))) { break forward_join_71; }
    if (!(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).i)).aj)) { break forward_join_54; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(this.c)), ((float)(0x0.0p0f))) > 0))) { break forward_join_54; }
    if (!((!((net.minecraft.entity.Entity)(p0)).v__Boolean()))) { break forward_join_54; }
    if (!(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).a__Boolean())) { break forward_join_54; }
    life10_42 = ((net.minecraft.client.renderer.entity.RenderManager)(this.b)).a(((double)(((net.minecraft.entity.Entity)(p0)).n)), ((double)(((net.minecraft.entity.Entity)(p0)).o)), ((double)(((net.minecraft.entity.Entity)(p0)).p)));
    life12_53 = ((float) ((0x1.0p0d - (life10_42 / 0x1.0p8d)) * ((double) this.d)));
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life12_53)), ((float)(0x0.0p0f))) > 0))) { break forward_join_54; }
    this.b(((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(life12_53)), ((float)(p5)));
    }
    if (!(((net.minecraft.entity.Entity)(p0)).z())) { break forward_join_71; }
    if (!((((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) { break forward_join_64; }
    if (!((!((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)))).U__Boolean()))) { break forward_join_71; }
    }
    this.a(((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p5)));
    }
    return;
}


public void d(T p0, double p1, double p2, double p3, float p4, float p5) {
return;
}


public void a(java.lang.Class p0) {
this.e = ((java.lang.Class)(p0));
    return;
}


public java.lang.Class a() {
return this.e;
}


public net.minecraft.client.renderer.entity.RenderManager a__nw() {
return this.b;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a(moom.DD p0) {
this.f = ((moom.DD)(p0));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13316;
      if (P[var3] == null) {
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
         long var5 = O[var3];
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
         Object[] var9 = (Object[])Q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         P[var3] = var15;
      }

      return P[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.entity.Render.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.DD a__DD() {
return this.f;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10751_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(T p0, double p1, double p2, double p3, float p4, float p5) {
__sourceExactCall_42191567bfd133(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)));
    return;
}


protected void a(T p0, double p1, double p2, double p3) {
long local8 = (net.minecraft.client.renderer.entity.Render.L ^ 136259549201268L);
    if (__sourceExactCall_e04bc3ead2a304(((net.minecraft.client.renderer.entity.Render)(this)), ((net.minecraft.entity.Entity)(p0)))) {
        this.a(((p0)), ((java.lang.String)(__sourceExactCall_908b5ecf4f4648(((net.minecraft.util.IChatComponent)(__sourceExactCall_a3be8b76d22b9b(((net.minecraft.entity.Entity)(p0)))))))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((int)(__sourceIntrinsic_017642b5f933_invokedynamic10752_4(6621, (9000741708121127729L ^ local8)))));
    }
    return;
}


protected boolean a__Boolean(T p0) {
int forwardValue4831_9_0;
    forward_join_9: {
    forward_join_8: {
    if (!(((net.minecraft.entity.Entity)(p0)).C__Boolean())) {
        break forward_join_8;
    }
    if (!(((net.minecraft.entity.Entity)(p0)).e__Boolean())) {
        break forward_join_8;
    }
    forwardValue4831_9_0 = 1;
    break forward_join_9;
    }
    forwardValue4831_9_0 = 0;
    }
    return ((forwardValue4831_9_0) != 0);
}


protected void a(T p0, double p1, double p2, double p3, java.lang.String p4, float p5, double p6) {
long local12 = (net.minecraft.client.renderer.entity.Render.L ^ 45196818509824L);
    __sourceExactCall_479e494eedc827(this, ((net.minecraft.entity.Entity)(p0)), ((java.lang.String)(p4)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((int)(__sourceIntrinsic_d90f6988f816_originalDynamicSite1831_1(12779, (7887368047386746L ^ local12)))));
    return;
}


public boolean a(T p0, net.minecraft.client.renderer.culling.ICamera p1, double p2, double p3, double p4) {
int forwardValue4830_55_0;
    moom.CA life9_2;
    forward_join_55: {
    forward_join_54: {
    forward_join_52: {
    forward_join_39: {
    forward_join_11: {
    life9_2 = ((net.minecraft.entity.Entity)(p0)).b();
    if (!((!((moom.CA)(life9_2)).a__Boolean()))) {
        break forward_join_11;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.CA)(life9_2)).a())), ((double)(0x0.0p0d))) == 0))) {
        break forward_join_39;
    }
    }
    life9_2 = new moom.CA((((net.minecraft.entity.Entity)(p0)).n - 0x1.0p1d), (((net.minecraft.entity.Entity)(p0)).o - 0x1.0p1d), (((net.minecraft.entity.Entity)(p0)).p - 0x1.0p1d), (((net.minecraft.entity.Entity)(p0)).n + 0x1.0p1d), (((net.minecraft.entity.Entity)(p0)).o + 0x1.0p1d), (((net.minecraft.entity.Entity)(p0)).p + 0x1.0p1d));
    }
    if (!(((net.minecraft.entity.Entity)(p0)).b__Boolean(((double)(p2)), ((double)(p3)), ((double)(p4))))) {
        break forward_join_54;
    }
    if (!((!((net.minecraft.entity.Entity)(p0)).ac))) {
        break forward_join_52;
    }
    if (!(((net.minecraft.client.renderer.culling.ICamera)(p1)).a(((moom.CA)(life9_2))))) {
        break forward_join_54;
    }
    }
    forwardValue4830_55_0 = 1;
    break forward_join_55;
    }
    forwardValue4830_55_0 = 0;
    }
    return ((forwardValue4830_55_0) != 0);
}


public static void a(moom.mW p0, moom.iT p1) {
((moom.mW)(p0)).D = ((moom.iT)(p1));
    return;
}


public static void a(moom.CA p0, double p1, double p2, double p3) {
long local7 = (net.minecraft.client.renderer.entity.Render.L ^ 62366136930850L);
    moom.kZ.v();
    net.minecraft.client.renderer.Tessellator local9 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local10 = ((net.minecraft.client.renderer.Tessellator)(local9)).a__lw();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((moom.lw)(local10)).b(((double)(p1)), ((double)(p2)), ((double)(p3)));
    ((moom.lw)(local10)).a(((int)(__sourceIntrinsic_1c507d13b6e4_originalDynamicSite1832_6(3380, (3743403654326206088L ^ local7)))), ((moom.oD)(moom.oB.j)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local9)).a__Void();
    ((moom.lw)(local10)).b(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
    moom.kZ.u();
    return;
}


protected void a(T p0, java.lang.String p1, double p2, double p3, double p4, int p5) {
long life10_3;
    double life12_9;
    net.minecraft.client.gui.FontRenderer life14_19;
    float life15_22;
    float life16_29;
    net.minecraft.client.renderer.Tessellator life17_85;
    moom.lw life18_88;
    int life19_90;
    int life20_106;
    life10_3 = (net.minecraft.client.renderer.entity.Render.L ^ 83214410307793L);
    life12_9 = ((net.minecraft.entity.Entity)(p0)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).e)));
    if ((recovery.source.CarrierOps.dcmpg(((double)(life12_9)), ((double)(((double) (p5 * p5))))) <= 0)) {
        life14_19 = ((net.minecraft.client.renderer.entity.Render)(this)).a__ga();
        int spill4829_0 = 21498;
        life15_22 = 0x1.99999ap0f;
        long spill4829_1 = (3666632790793038513L ^ life10_3);
        life16_29 = (0x1.111112p-6f * life15_22);
        moom.kZ.B();
        moom.kZ.b(((float)((((float) p2) + 0x0.0p0f))), ((float)(((((float) p3) + ((net.minecraft.entity.Entity)(p0)).H) + 0x1.0p-1f))), ((float)(((float) p4))));
        org.lwjgl.opengl.GL11.glNormal3f(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((-((net.minecraft.client.renderer.entity.RenderManager)(this.b)).g))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).h)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.a(((float)((-life16_29))), ((float)((-life16_29))), ((float)(life16_29)));
        moom.kZ.f();
        moom.kZ.a(((boolean)(false)));
        moom.kZ.i();
        moom.kZ.l();
        moom.kZ.a(((int)(__sourceIntrinsic_5d8170397ccf_invokedynamic4829_21(spill4829_0, spill4829_1))), ((int)(__sourceIntrinsic_5d8170397ccf_invokedynamic4829_22(25507, (4331573981282343649L ^ life10_3)))), ((int)(1)), ((int)(0)));
        life17_85 = net.minecraft.client.renderer.Tessellator.a();
        life18_88 = ((net.minecraft.client.renderer.Tessellator)(life17_85)).a__lw();
        life19_90 = 0;
        if (((java.lang.String)(p1)).equals(((java.lang.Object)("deadmau5")))) {
        life19_90 = __sourceIntrinsic_5d8170397ccf_invokedynamic4829_27(13205, (5696080862428482264L ^ life10_3));
    }
        life20_106 = (((net.minecraft.client.gui.FontRenderer)(life14_19)).a(((java.lang.String)(p1))) / 2);
        moom.kZ.v();
        ((moom.lw)(life18_88)).a(((int)(__sourceIntrinsic_5d8170397ccf_invokedynamic4829_30(3525, (6482323231199491211L ^ life10_3)))), ((moom.oD)(moom.oB.h)));
        ((moom.lw)(((moom.lw)(((moom.lw)(life18_88)).a(((double)(((double) ((-life20_106) - 1)))), ((double)(((double) (-1 + life19_90)))), ((double)(0x0.0p0d))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life18_88)).a(((double)(((double) ((-life20_106) - 1)))), ((double)(((double) (__sourceIntrinsic_5d8170397ccf_invokedynamic4829_36(22957, (5148798164930240750L ^ life10_3)) + life19_90)))), ((double)(0x0.0p0d))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life18_88)).a(((double)(((double) (life20_106 + 1)))), ((double)(((double) (__sourceIntrinsic_5d8170397ccf_invokedynamic4829_40(5191, (3016907320293747981L ^ life10_3)) + life19_90)))), ((double)(0x0.0p0d))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life18_88)).a(((double)(((double) (life20_106 + 1)))), ((double)(((double) (-1 + life19_90)))), ((double)(0x0.0p0d))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life17_85)).a__Void();
        moom.kZ.u();
        ((net.minecraft.client.gui.FontRenderer)(life14_19)).b(((java.lang.String)(p1)), ((float)(((float) ((-((net.minecraft.client.gui.FontRenderer)(life14_19)).a(((java.lang.String)(p1)))) / 2)))), ((float)(((float) life19_90))), ((int)(__sourceIntrinsic_5d8170397ccf_invokedynamic4829_50(8587, (7550140848404977859L ^ life10_3)))));
        moom.kZ.j();
        moom.kZ.a(((boolean)(true)));
        ((net.minecraft.client.gui.FontRenderer)(life14_19)).b(((java.lang.String)(p1)), ((float)(((float) ((-((net.minecraft.client.gui.FontRenderer)(life14_19)).a(((java.lang.String)(p1)))) / 2)))), ((float)(((float) life19_90))), ((int)(-1)));
        moom.kZ.e();
        moom.kZ.k();
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.C();
    }
    return;
}


public net.minecraft.client.gui.FontRenderer a__ga() {
return ((net.minecraft.client.renderer.entity.RenderManager)(this.b)).a__ga();
}


private void a(net.minecraft.block.Block p0, double p1, double p2, double p3, moom.DT p4, float p5, float p6, double p7, double p8, double p9) {
net.minecraft.client.renderer.Tessellator life17_4;
    moom.lw life18_7;
    double life19_28;
    double life21_50;
    double life23_59;
    double life25_70;
    double life27_79;
    double life29_88;
    float life31_100;
    float life32_112;
    float life33_124;
    float life34_136;
    if (((net.minecraft.block.Block)(p0)).g()) {
        life17_4 = net.minecraft.client.renderer.Tessellator.a();
        life18_7 = ((net.minecraft.client.renderer.Tessellator)(life17_4)).a__lw();
        life19_28 = (((((double) p5) - ((p2 - (((double) ((moom.DT)(p4)).b()) + p8)) / 0x1.0p1d)) * 0x1.0p-1d) * ((double) ((net.minecraft.world.World)(((net.minecraft.client.renderer.entity.Render)(this)).a__Eu())).a(((moom.DT)(p4)))));
        if ((life19_28 >= 0x0.0p0d)) {
        if ((life19_28 > 0x1.0p0d)) {
        life19_28 = 0x1.0p0d;
    }
        life21_50 = ((((double) ((moom.DT)(p4)).a()) + ((net.minecraft.block.Block)(p0)).a()) + p7);
        life23_59 = ((((double) ((moom.DT)(p4)).a()) + ((net.minecraft.block.Block)(p0)).b()) + p7);
        life25_70 = (((((double) ((moom.DT)(p4)).b()) + ((net.minecraft.block.Block)(p0)).c()) + p8) + 0x1.0p-6d);
        life27_79 = ((((double) ((moom.DT)(p4)).c()) + ((net.minecraft.block.Block)(p0)).e()) + p9);
        life29_88 = ((((double) ((moom.DT)(p4)).c()) + ((net.minecraft.block.Block)(p0)).f()) + p9);
        life31_100 = ((float) ((((p1 - life21_50) / 0x1.0p1d) / ((double) p6)) + 0x1.0p-1d));
        life32_112 = ((float) ((((p1 - life23_59) / 0x1.0p1d) / ((double) p6)) + 0x1.0p-1d));
        life33_124 = ((float) ((((p3 - life27_79) / 0x1.0p1d) / ((double) p6)) + 0x1.0p-1d));
        life34_136 = ((float) ((((p3 - life29_88) / 0x1.0p1d) / ((double) p6)) + 0x1.0p-1d));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life18_7)).a(((double)(life21_50)), ((double)(life25_70)), ((double)(life27_79))))).a(((double)(((double) life31_100))), ((double)(((double) life33_124)))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(((float) life19_28)))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life18_7)).a(((double)(life21_50)), ((double)(life25_70)), ((double)(life29_88))))).a(((double)(((double) life31_100))), ((double)(((double) life34_136)))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(((float) life19_28)))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life18_7)).a(((double)(life23_59)), ((double)(life25_70)), ((double)(life29_88))))).a(((double)(((double) life32_112))), ((double)(((double) life34_136)))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(((float) life19_28)))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life18_7)).a(((double)(life23_59)), ((double)(life25_70)), ((double)(life27_79))))).a(((double)(((double) life32_112))), ((double)(((double) life33_124)))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(((float) life19_28)))))).c__Void();
    }
    }
    return;
}


private net.minecraft.world.World a__Eu() {
return ((net.minecraft.client.renderer.entity.RenderManager)(this.b)).d;
}


private void a(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4) {
long life9_3;
    net.minecraft.client.renderer.texture.TextureMap life11_7;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life12_11;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life13_15;
    float life14_26;
    com.moon.ec life15_36;
    float life15_51;
    net.minecraft.client.renderer.Tessellator life16_57;
    moom.lw life17_60;
    float life18_62;
    float life19_64;
    float life20_69;
    float life21_77;
    float life22_102;
    int life23_104;
    int life24_106;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life25_139;
    float life26_148;
    float life27_151;
    float life28_154;
    float life29_157;
    float life30_165;
    life9_3 = (net.minecraft.client.renderer.entity.Render.L ^ 115173916906475L);
    moom.kZ.f();
    life11_7 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__n8();
    life12_11 = ((net.minecraft.client.renderer.texture.TextureMap)(life11_7)).a(((java.lang.String)("minecraft:blocks/fire_layer_0")));
    life13_15 = ((net.minecraft.client.renderer.texture.TextureMap)(life11_7)).a(((java.lang.String)("minecraft:blocks/fire_layer_1")));
    moom.kZ.B();
    moom.kZ.b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
    life14_26 = ((net.minecraft.entity.Entity)(p0)).G;
    if ((((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0)) {
        life15_36 = new com.moon.ec(p0, false, false);
        ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life15_36)));
        if (((com.moon.ec)(life15_36)).c()) {
        life14_26 = (life14_26 * 0x1.0p-1f);
    }
    }
    life15_51 = (life14_26 * 0x1.666666p0f);
    moom.kZ.a(((float)(life15_51)), ((float)(life15_51)), ((float)(life15_51)));
    life16_57 = net.minecraft.client.renderer.Tessellator.a();
    life17_60 = ((net.minecraft.client.renderer.Tessellator)(life16_57)).a__lw();
    life18_62 = 0x1.0p-1f;
    life19_64 = 0x0.0p0f;
    life20_69 = (((net.minecraft.entity.Entity)(p0)).H / life15_51);
    life21_77 = ((float) (((net.minecraft.entity.Entity)(p0)).o - ((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).c));
    moom.kZ.b(((float)((-((net.minecraft.client.renderer.entity.RenderManager)(this.b)).g))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)((-0x1.333334p-2f + (((float) ((int) life20_69)) * 0x1.47ae14p-6f)))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    life22_102 = 0x0.0p0f;
    life23_104 = 0;
    life24_106 = ((moom.BU.Y()) ? 1 : 0);
    if ((life24_106 != 0)) {
        ((moom.lw)(life17_60)).a(((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.SOLID)));
    }
    ((moom.lw)(life17_60)).a(((int)(__sourceIntrinsic_d21a37ec40b6_invokedynamic8795_30(3380, (3743456330574511937L ^ life9_3)))), ((moom.oD)(moom.oB.i)));
    while ((life20_69 > 0x0.0p0f)) {
        life25_139 = (((life23_104 % 2) == 0) ? life12_11 : life13_15);
        ((moom.lw)(life17_60)).b(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life25_139)));
        this.b(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
        life26_148 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life25_139)).a();
        life27_151 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life25_139)).c();
        life28_154 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life25_139)).b();
        life29_157 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life25_139)).d();
        if ((((life23_104 / 2) % 2) == 0)) {
        life30_165 = life28_154;
        life28_154 = life26_148;
        life26_148 = life30_165;
    }
        ((moom.lw)(((moom.lw)(((moom.lw)(life17_60)).a(((double)(((double) (life18_62 - life19_64)))), ((double)(((double) (0x0.0p0f - life21_77)))), ((double)(((double) life22_102)))))).a(((double)(((double) life28_154))), ((double)(((double) life29_157)))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life17_60)).a(((double)(((double) ((-life18_62) - life19_64)))), ((double)(((double) (0x0.0p0f - life21_77)))), ((double)(((double) life22_102)))))).a(((double)(((double) life26_148))), ((double)(((double) life29_157)))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life17_60)).a(((double)(((double) ((-life18_62) - life19_64)))), ((double)(((double) (0x1.666666p0f - life21_77)))), ((double)(((double) life22_102)))))).a(((double)(((double) life26_148))), ((double)(((double) life27_151)))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life17_60)).a(((double)(((double) (life18_62 - life19_64)))), ((double)(((double) (0x1.666666p0f - life21_77)))), ((double)(((double) life22_102)))))).a(((double)(((double) life28_154))), ((double)(((double) life27_151)))))).c__Void();
        life20_69 = (life20_69 - 0x1.ccccccp-2f);
        life21_77 = (life21_77 - 0x1.ccccccp-2f);
        life18_62 = (life18_62 * 0x1.ccccccp-1f);
        life22_102 = (life22_102 + 0x1.eb851ep-6f);
        life23_104 += 1;
    }
    ((net.minecraft.client.renderer.Tessellator)(life16_57)).a__Void();
    if ((life24_106 != 0)) {
        ((moom.lw)(life17_60)).a(((net.minecraft.util.EnumWorldBlockLayer)(null)));
        moom.kZ.G();
    }
    moom.kZ.C();
    moom.kZ.e();
    return;
}


protected abstract moom.DD a(T p0);

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10751_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1c507d13b6e4_originalDynamicSite1832_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_017642b5f933_invokedynamic10752_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d21a37ec40b6_invokedynamic8795_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d90f6988f816_originalDynamicSite1831_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5d8170397ccf_invokedynamic4829_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5d8170397ccf_invokedynamic4829_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5d8170397ccf_invokedynamic4829_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5d8170397ccf_invokedynamic4829_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5d8170397ccf_invokedynamic4829_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5d8170397ccf_invokedynamic4829_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5d8170397ccf_invokedynamic4829_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9da02166e535_invokedynamic1070_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9da02166e535_invokedynamic1070_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9da02166e535_invokedynamic1070_39(int a0, long a1) throws E;

private static native boolean __sourceExactCall_e04bc3ead2a304(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1);
private static native java.lang.String __sourceExactCall_908b5ecf4f4648(net.minecraft.util.IChatComponent p0);
private static native net.minecraft.util.IChatComponent __sourceExactCall_a3be8b76d22b9b(net.minecraft.entity.Entity p0);

private static native moom.DD __sourceExactCall_77974434d2c6ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_42191567bfd133(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4);
private static native void __sourceExactCall_479e494eedc827(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, java.lang.String p2, double p3, double p4, double p5, int p6);
}
