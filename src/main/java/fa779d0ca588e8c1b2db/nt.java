package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nt extends net.minecraft.client.renderer.entity.Render<net.minecraft.entity.item.EntityItemFrame> {

private static final moom.DD h;

private final net.minecraft.client.Minecraft i;

private final moom.DE j;

private final moom.DE k;

private final net.minecraft.client.renderer.entity.RenderItem l;

private static double m;

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public nt(net.minecraft.client.renderer.entity.RenderManager p0, net.minecraft.client.renderer.entity.RenderItem p1) {
super(p0);
    this.i = net.minecraft.client.Minecraft.a__fM();
    this.j = new moom.DE("item_frame", "normal");
    this.k = new moom.DE("item_frame", "map");
    this.l = p1;
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-7447915037453476618L)), ((long)(-46127158503176343L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(145236297309179L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.nt.n ^ 78905417773359L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1432_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1432_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1432_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1432_14 = new byte[8];
    (__sourceSpill1432_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1432_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1432_16 = __sourceSpill1432_14;
    ((javax.crypto.Cipher)(__sourceSpill1432_11)).init(((int)(__sourceSpill1432_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1432_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1432_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "£\002Zé\025Ìc{yád\023¨ÕûImV»dª2çæÙË5¶ Qc"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1432_25 = local6_life21;
        int __sourceSpill1432_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1432_25)).substring(((int)(__sourceSpill1432_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1432_30 = local8_life19;
        int __sourceSpill1432_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1432_33 = new byte[8];
        (__sourceSpill1432_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1432_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1432_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1432_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1432_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1432_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1432_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1432_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1432_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1432_34)).doFinal(((byte[])(__sourceSpill1432_33)));
        (__sourceSpill1432_30)[__sourceSpill1432_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "KÂA3\\dÝ\b°>\020¯\027ø$þ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1432_38 = local6_life21;
        int __sourceSpill1432_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1432_38)).substring(((int)(__sourceSpill1432_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1432_43 = local8_life19;
        int __sourceSpill1432_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1432_46 = new byte[8];
        (__sourceSpill1432_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1432_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1432_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1432_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1432_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1432_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1432_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1432_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1432_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1432_47)).doFinal(((byte[])(__sourceSpill1432_46)));
        (__sourceSpill1432_43)[__sourceSpill1432_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[7]));
    h = ((moom.DD)(new moom.DD("textures/map/map_background.png")));
    m = ((double)(0x1.0p12d));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8522_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nt"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1170;
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
            throw new RuntimeException("moom/nt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.nt.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void a__Void(net.minecraft.entity.item.EntityItemFrame p0) {
long life2_3;
    net.minecraft.item.ItemStack life4_6;
    net.minecraft.client.entity.EntityPlayerSP life5_20;
    double life6_29;
    net.minecraft.entity.item.EntityItem life5_44;
    net.minecraft.item.Item life6_48;
    int life7_60;
    float life8_94;
    net.minecraft.world.storage.MapData life9_109;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life8_126;
    net.minecraft.client.renderer.texture.TextureCompass life9_146;
    double life10_149;
    double life12_152;
    forest_join_231: {
    forest_join_229: {
    forest_join_212: {
    forest_join_207: {
    forest_join_194: {
    forest_join_192: {
    forest_join_123: {
    forest_join_122: {
    forest_join_69: {
    forest_join_34: {
    forest_join_14: {
    life2_3 = (moom.nt.n ^ 135987550612719L);
    life4_6 = ((net.minecraft.entity.item.EntityItemFrame)(p0)).a__xW();
    if (!((life4_6 != null))) {
        break forest_join_231;
    }
    if (!((!((moom.nt)(this)).a__Boolean__sourceReturn_36675b6452(((net.minecraft.entity.item.EntityItemFrame)(p0)))))) {
        break forest_join_14;
    }
    return;
    }
    if (!((!moom.BU.u))) {
        break forest_join_34;
    }
    life5_20 = ((net.minecraft.client.Minecraft)(this.i)).K;
    life6_29 = ((net.minecraft.entity.item.EntityItemFrame)(p0)).a(((double)(((net.minecraft.entity.Entity)(life5_20)).n)), ((double)(((net.minecraft.entity.Entity)(life5_20)).o)), ((double)(((net.minecraft.entity.Entity)(life5_20)).p)));
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life6_29)), ((double)(0x1.0p12d))) > 0))) {
        break forest_join_34;
    }
    return;
    }
    life5_44 = new net.minecraft.entity.item.EntityItem(((net.minecraft.entity.item.EntityItemFrame)(p0)).i, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, life4_6);
    life6_48 = ((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItem)(life5_44)).a__xW())).a__wQ();
    ((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItem)(life5_44)).a__xW())).b = ((int)(1));
    ((net.minecraft.entity.item.EntityItem)(life5_44)).aK = ((float)(0x0.0p0f));
    moom.kZ.B();
    moom.kZ.f();
    life7_60 = ((net.minecraft.entity.item.EntityItemFrame)(p0)).c__Int();
    if (!((((life6_48 instanceof moom.xA) ? 1 : 0) != 0))) {
        break forest_join_69;
    }
    life7_60 = ((life7_60 % 4) * 2);
    }
    moom.kZ.b(((float)(((((float) life7_60) * 0x1.68p8f) / 0x1.0p3f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    if (!((((life6_48 instanceof moom.xA) ? 1 : 0) != 0))) {
        break forest_join_123;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).c)).a__Void(((moom.DD)(moom.nt.h)));
    moom.kZ.b(((float)(0x1.68p7f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life8_94 = 0x1.0p-7f;
    moom.kZ.a(((float)(life8_94)), ((float)(life8_94)), ((float)(life8_94)));
    moom.kZ.b(((float)(-0x1.0p6f)), ((float)(-0x1.0p6f)), ((float)(0x0.0p0f)));
    life9_109 = ((moom.xA)(net.minecraft.init.Items.a3)).a(((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItem)(life5_44)).a__xW())), ((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItemFrame)(p0)).i)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f)));
    if (!((life9_109 != null))) {
        break forest_join_122;
    }
    ((net.minecraft.client.gui.MapItemRenderer)(((net.minecraft.client.renderer.EntityRenderer)(((net.minecraft.client.Minecraft)(this.i)).R)).a__ip())).a(((net.minecraft.world.storage.MapData)(life9_109)), ((boolean)(true)));
    }
    break forest_join_229;
    }
    life8_126 = null;
    if (!((life6_48 == net.minecraft.init.Items.aQ))) {
        break forest_join_194;
    }
    life8_126 = ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.Minecraft)(this.i)).a__n8())).a(((java.lang.String)(net.minecraft.client.renderer.texture.TextureCompass.J)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    if (!((((life8_126 instanceof net.minecraft.client.renderer.texture.TextureCompass) ? 1 : 0) != 0))) {
        break forest_join_192;
    }
    life9_146 = ((net.minecraft.client.renderer.texture.TextureCompass)(life8_126));
    life10_149 = ((net.minecraft.client.renderer.texture.TextureCompass)(life9_146)).H;
    life12_152 = ((net.minecraft.client.renderer.texture.TextureCompass)(life9_146)).I;
    ((net.minecraft.client.renderer.texture.TextureCompass)(life9_146)).H = ((double)(0x0.0p0d));
    ((net.minecraft.client.renderer.texture.TextureCompass)(life9_146)).I = ((double)(0x0.0p0d));
    ((net.minecraft.client.renderer.texture.TextureCompass)(life9_146)).a(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityItemFrame)(p0)).i)), ((double)(((net.minecraft.entity.item.EntityItemFrame)(p0)).n)), ((double)(((net.minecraft.entity.item.EntityItemFrame)(p0)).p)), ((double)(((double) moom.Dr.e(((float)(((float) (__sourceIntrinsic_e40a0a0e56f3_invokedynamic901_57(13640, (7420561188062332L ^ life2_3)) + (((moom.bs)(((net.minecraft.entity.item.EntityItemFrame)(p0)).aG)).b() * __sourceIntrinsic_e40a0a0e56f3_invokedynamic901_60(13388, (7681493760162104700L ^ life2_3))))))))))), ((boolean)(false)), ((boolean)(true)));
    ((net.minecraft.client.renderer.texture.TextureCompass)(life9_146)).H = ((double)(life10_149));
    ((net.minecraft.client.renderer.texture.TextureCompass)(life9_146)).I = ((double)(life12_152));
    break forest_join_194;
    }
    life8_126 = null;
    }
    moom.kZ.a(((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)));
    if (!(((net.minecraft.client.renderer.entity.RenderItem)(this.l)).a__Boolean(((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItem)(life5_44)).a__xW()))))) {
        break forest_join_207;
    }
    if (!((((life6_48 instanceof net.minecraft.item.ItemSkull) ? 1 : 0) != 0))) {
        break forest_join_212;
    }
    }
    moom.kZ.b(((float)(0x1.68p7f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    }
    moom.kZ.a__Void();
    moom.lt.b();
    ((net.minecraft.client.renderer.entity.RenderItem)(this.l)).a(((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItem)(life5_44)).a__xW())), ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.FIXED)));
    moom.lt.a();
    moom.kZ.b__Void();
    if (!((life8_126 != null))) {
        break forest_join_229;
    }
    if (!((((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life8_126)).e() > 0))) {
        break forest_join_229;
    }
    ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life8_126)).a__Void();
    }
    moom.kZ.e();
    moom.kZ.C();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DD a(net.minecraft.entity.item.EntityItemFrame p0) {
return null;
}


public void a(net.minecraft.entity.item.EntityItemFrame p0, double p1, double p2, double p3, float p4, float p5) {
moom.DT life10_9;
    double life11_18;
    double life13_27;
    double life15_36;
    net.minecraft.client.renderer.BlockRendererDispatcher life17_63;
    net.minecraft.client.resources.model.ModelManager life18_67;
    net.minecraft.client.resources.model.IBakedModel life19_83;
    forward_join_85: {
    forward_join_80: {
    forward_join_4: {
    if (!(((net.minecraft.entity.item.EntityItemFrame)(p0)).aC)) { break forward_join_4; }
    return;
    }
    moom.kZ.B();
    life10_9 = ((net.minecraft.entity.item.EntityItemFrame)(p0)).b__DT();
    life11_18 = ((((double) ((moom.DT)(life10_9)).a()) - ((net.minecraft.entity.item.EntityItemFrame)(p0)).n) + p1);
    life13_27 = ((((double) ((moom.DT)(life10_9)).b()) - ((net.minecraft.entity.item.EntityItemFrame)(p0)).o) + p2);
    life15_36 = ((((double) ((moom.DT)(life10_9)).c()) - ((net.minecraft.entity.item.EntityItemFrame)(p0)).p) + p3);
    moom.kZ.b(((double)((life11_18 + 0x1.0p-1d))), ((double)((life13_27 + 0x1.0p-1d))), ((double)((life15_36 + 0x1.0p-1d))));
    moom.kZ.b(((float)((0x1.68p7f - ((net.minecraft.entity.item.EntityItemFrame)(p0)).w))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).c)).a__Void(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
    life17_63 = ((net.minecraft.client.Minecraft)(this.i)).a__kP();
    life18_67 = ((net.minecraft.client.renderer.BlockModelShapes)(((net.minecraft.client.renderer.BlockRendererDispatcher)(life17_63)).a__kN())).a__pr();
    if (!((((net.minecraft.entity.item.EntityItemFrame)(p0)).a__xW() != null))) { break forward_join_80; }
    if (!((((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItemFrame)(p0)).a__xW())).a__wQ() == net.minecraft.init.Items.a3))) { break forward_join_80; }
    life19_83 = ((net.minecraft.client.resources.model.ModelManager)(life18_67)).a(((moom.DE)(this.k)));
    break forward_join_85;
    }
    life19_83 = ((net.minecraft.client.resources.model.ModelManager)(life18_67)).a(((moom.DE)(this.j)));
    }
    moom.kZ.B();
    moom.kZ.b(((float)(-0x1.0p-1f)), ((float)(-0x1.0p-1f)), ((float)(-0x1.0p-1f)));
    ((moom.kK)(((net.minecraft.client.renderer.BlockRendererDispatcher)(life17_63)).a())).a(((net.minecraft.client.resources.model.IBakedModel)(life19_83)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.C();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.cp-2f)));
    ((moom.nt)(this)).a__Void(((net.minecraft.entity.item.EntityItemFrame)(p0)));
    moom.kZ.C();
    ((moom.nt)(this)).a(((net.minecraft.entity.item.EntityItemFrame)(p0)), ((double)((p1 + ((double) (((float) ((moom.bs)(((net.minecraft.entity.item.EntityItemFrame)(p0)).aG)).c()) * 0x1.333334p-2f))))), ((double)((p2 - 0x1.0p-2d))), ((double)((p3 + ((double) (((float) ((moom.bs)(((net.minecraft.entity.item.EntityItemFrame)(p0)).aG)).e()) * 0x1.333334p-2f))))));
    return;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.nt)(this)).a(((net.minecraft.entity.item.EntityItemFrame)(((net.minecraft.entity.item.EntityItemFrame)(p0)))));
}


private boolean a__Boolean__sourceReturn_36675b6452(net.minecraft.entity.item.EntityItemFrame p0) {
if (moom.MP.s) {
        return false;
    }
    if ((!moom.BU.u)) {
        net.minecraft.entity.Entity local2 = ((net.minecraft.client.Minecraft)(this.i)).a__r3();
        double local3 = ((net.minecraft.entity.item.EntityItemFrame)(p0)).a(((double)(((net.minecraft.entity.Entity)(local2)).n)), ((double)(((net.minecraft.entity.Entity)(local2)).o)), ((double)(((net.minecraft.entity.Entity)(local2)).p)));
        return ((!(local3 > moom.nt.m)) ? true : false);
    }
    return true;
}


public static void a__sourceReturn_da8c82d5d4() {
java.lang.Object local0 = moom.BU.a__fM();
    double local1 = ((double) moom.BU.a(((float)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(local0)).W)).aW)), ((float)(0x1.0p0f)), ((float)(0x1.ep6f))));
    double local3 = java.lang.Math.max(((double)(((0x1.8p2d * ((double) ((net.minecraft.client.Minecraft)(local0)).H)) / local1))), ((double)(0x1.0p4d)));
    m = ((double)((local3 * local3)));
    return;
}


protected void a(net.minecraft.entity.item.EntityItemFrame p0, double p1, double p2, double p3) {
long life8_3;
    float life10_28;
    float life11_32;
    double life12_38;
    float life14_47;
    java.lang.String life15_58;
    net.minecraft.client.gui.FontRenderer life16_64;
    net.minecraft.client.renderer.Tessellator life17_127;
    moom.lw life18_130;
    int life19_136;
    life8_3 = (moom.nt.n ^ 110238499392420L);
    if (net.minecraft.client.Minecraft.d__Boolean()) {
        if ((((net.minecraft.entity.item.EntityItemFrame)(p0)).a__xW() != null)) {
        if (((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItemFrame)(p0)).a__xW())).f__Boolean()) {
        if ((((net.minecraft.client.renderer.entity.RenderManager)(this.b)).f == p0)) {
        life10_28 = 0x1.99999ap0f;
        life11_32 = (0x1.111112p-6f * life10_28);
        life12_38 = __sourceExactCall_31993baa0e3e8e(((net.minecraft.entity.item.EntityItemFrame)(p0)), ((net.minecraft.entity.Entity)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).e)));
        life14_47 = (((net.minecraft.entity.item.EntityItemFrame)(p0)).t__Boolean() ? 0x1.0p5f : 0x1.0p6f);
        if ((recovery.source.CarrierOps.dcmpg(((double)(life12_38)), ((double)(((double) (life14_47 * life14_47))))) < 0)) {
        life15_58 = ((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItemFrame)(p0)).a__xW())).b__String();
        if (((net.minecraft.entity.item.EntityItemFrame)(p0)).t__Boolean()) {
        life16_64 = ((moom.nt)(this)).a__ga();
        int spill3790_0 = 25623;
        moom.kZ.B();
        long spill3790_1 = (8873377929804935790L ^ life8_3);
        moom.kZ.b(((float)((((float) p1) + 0x0.0p0f))), ((float)(((((float) p2) + ((net.minecraft.entity.item.EntityItemFrame)(p0)).H) + 0x1.0p-1f))), ((float)(((float) p3))));
        org.lwjgl.opengl.GL11.glNormal3f(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((-((net.minecraft.client.renderer.entity.RenderManager)(this.b)).g))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).h)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        __sourceExactCall_c87cfdff997c62(((float)((-life11_32))), ((float)((-life11_32))), ((float)(life11_32)));
        moom.kZ.f();
        moom.kZ.b(((float)(0x0.0p0f)), ((float)((0x1.0p-2f / life11_32))), ((float)(0x0.0p0f)));
        moom.kZ.a(((boolean)(false)));
        moom.kZ.l();
        moom.kZ.b(((int)(__sourceIntrinsic_4dfd807989a5_invokedynamic3790_31(spill3790_0, spill3790_1))), ((int)(__sourceIntrinsic_4dfd807989a5_invokedynamic3790_32(21652, (4226948308960920302L ^ life8_3)))));
        life17_127 = __sourceExactCall_607dff73cf88f9();
        life18_130 = ((net.minecraft.client.renderer.Tessellator)(life17_127)).a__lw();
        life19_136 = (__sourceExactCall_873511e0f5edfb(((net.minecraft.client.gui.FontRenderer)(life16_64)), ((java.lang.String)(life15_58))) / 2);
        moom.kZ.v();
        __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life18_130)), ((int)(__sourceIntrinsic_4dfd807989a5_invokedynamic3790_38(21415, (7687909466530596314L ^ life8_3)))), ((moom.oD)(moom.oB.h)));
        ((moom.lw)(__sourceExactCall_85687eb0b54e84(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life18_130)), ((double)(((double) ((-life19_136) - 1)))), ((double)(-0x1.0p0d)), ((double)(0x0.0p0d))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f))))).c__Void();
        ((moom.lw)(__sourceExactCall_85687eb0b54e84(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life18_130)), ((double)(((double) ((-life19_136) - 1)))), ((double)(0x1.0p3d)), ((double)(0x0.0p0d))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f))))).c__Void();
        ((moom.lw)(__sourceExactCall_85687eb0b54e84(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life18_130)), ((double)(((double) (life19_136 + 1)))), ((double)(0x1.0p3d)), ((double)(0x0.0p0d))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f))))).c__Void();
        ((moom.lw)(__sourceExactCall_85687eb0b54e84(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life18_130)), ((double)(((double) (life19_136 + 1)))), ((double)(-0x1.0p0d)), ((double)(0x0.0p0d))))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life17_127)).a__Void();
        moom.kZ.u();
        moom.kZ.a(((boolean)(true)));
        ((net.minecraft.client.gui.FontRenderer)(life16_64)).b(((java.lang.String)(life15_58)), ((float)(((float) ((-__sourceExactCall_873511e0f5edfb(((net.minecraft.client.gui.FontRenderer)(life16_64)), ((java.lang.String)(life15_58)))) / 2)))), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_4dfd807989a5_invokedynamic3790_57(11315, (5928115593160505931L ^ life8_3)))));
        moom.kZ.e();
        moom.kZ.k();
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.C();
    } else {
        __sourceExactCall_83f00063796475(((moom.nt)(this)), ((net.minecraft.entity.Entity)(p0)), ((java.lang.String)(life15_58)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((int)(__sourceIntrinsic_4dfd807989a5_invokedynamic3790_63(24013, (7714613316732865459L ^ life8_3)))));
    }
    }
    }
    }
    }
    }
    return;
}


protected void a__sourceBridge_9b564157f0(net.minecraft.entity.Entity p0, double p1, double p2, double p3) {
((moom.nt)(this)).a(((net.minecraft.entity.item.EntityItemFrame)(((net.minecraft.entity.item.EntityItemFrame)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.nt)(this)).a(((net.minecraft.entity.item.EntityItemFrame)(((net.minecraft.entity.item.EntityItemFrame)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private static native <E extends Throwable> int __sourceIntrinsic_4dfd807989a5_invokedynamic3790_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4dfd807989a5_invokedynamic3790_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4dfd807989a5_invokedynamic3790_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4dfd807989a5_invokedynamic3790_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4dfd807989a5_invokedynamic3790_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e40a0a0e56f3_invokedynamic901_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e40a0a0e56f3_invokedynamic901_60(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8522_0() throws E;



private static native double __sourceExactCall_31993baa0e3e8e(net.minecraft.entity.item.EntityItemFrame p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native net.minecraft.client.renderer.Tessellator __sourceExactCall_607dff73cf88f9();
private static native int __sourceExactCall_873511e0f5edfb(net.minecraft.client.gui.FontRenderer p0, java.lang.String p1);
private static native void __sourceExactCall_b6c6a7d43443b6(moom.lw p0, int p1, moom.oD p2);
private static native moom.lw __sourceExactCall_85687eb0b54e84(moom.lw p0, float p1, float p2, float p3, float p4);
private static native moom.lw __sourceExactCall_217a742e4be448(moom.lw p0, double p1, double p2, double p3);
private static native void __sourceExactCall_83f00063796475(moom.nt p0, net.minecraft.entity.Entity p1, java.lang.String p2, double p3, double p4, double p5, int p6);
}
