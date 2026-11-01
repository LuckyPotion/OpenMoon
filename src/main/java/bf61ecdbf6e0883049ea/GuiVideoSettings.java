package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiVideoSettings extends moom.hD {

private final net.minecraft.client.gui.GuiScreen w;

protected java.lang.String x;

private final net.minecraft.client.settings.GameSettings y;

private static final net.minecraft.client.settings.GameSettings$Options[] z;

private final moom.LI A;

private static final long B;

private static final long[] C;

private static final java.lang.Integer[] D;

private static final java.util.Map E;

public GuiVideoSettings(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.x = "Video Settings";
    this.A = new moom.LI(this, new moom.LL());
    this.w = p0;
    this.y = p1;
}


static {
B = ((long)(((moom._a)(moom._c.a(((long)(-2204425604515508692L)), ((long)(-132814201378754064L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(167056912136681L)))));
    long local11_life6 = (net.minecraft.client.gui.GuiVideoSettings.B ^ 24527164185842L);
    E = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1789_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1789_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1789_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1789_14 = new byte[8];
    (__sourceSpill1789_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1789_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1789_16 = __sourceSpill1789_14;
    ((javax.crypto.Cipher)(__sourceSpill1789_11)).init(((int)(__sourceSpill1789_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1789_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1789_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[37];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\027tb'E5Ý!!ÚS?DÇ\toÃbf´\"¢jU\ft^s\023sãÄxN Ã5U^ÔW&\032\016G*È#Æ\005ÜÛ\0033ÏCRîNòÎz4kÈªÒÝ¯akl&þ\031tþÕc\026+\004bZ1»y5½\022týf¤\007Îð&³ÉñÁð4WÅWcÌc©æ(&#ÿMÒÅÞ¥\036¹áJ\n\bfT\033E:*öÝÃnc'Sdó!o5õ\030W³Üóibcc¡}9ï\007kÏùS?®d\035Gß(µ°w=\033Û\006.\006¸\030Ã8çkÂÇ ß\006\\M¡µ#ÙÃáZ«zû§oò9¡¾Ìäßd\016ÔÁ%-çì«Ù×ZÄã¶ô?c{ÇÂQ[\030¯\006\030©¤"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1789_25 = local4_life21;
        int __sourceSpill1789_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1789_25)).substring(((int)(__sourceSpill1789_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1789_30 = local6_life19;
        int __sourceSpill1789_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1789_33 = new byte[8];
        (__sourceSpill1789_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1789_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1789_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1789_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1789_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1789_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1789_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1789_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1789_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1789_34)).doFinal(((byte[])(__sourceSpill1789_33)));
        (__sourceSpill1789_30)[__sourceSpill1789_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "\"q\004Wmë«sÄ=Ì/\t\n"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1789_38 = local4_life21;
        int __sourceSpill1789_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1789_38)).substring(((int)(__sourceSpill1789_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1789_43 = local6_life19;
        int __sourceSpill1789_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1789_46 = new byte[8];
        (__sourceSpill1789_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1789_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1789_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1789_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1789_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1789_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1789_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1789_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1789_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1789_47)).doFinal(((byte[])(__sourceSpill1789_46)));
        (__sourceSpill1789_43)[__sourceSpill1789_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    C = ((long[])(local6_life19));
    D = ((java.lang.Integer[])(new java.lang.Integer[37]));
    net.minecraft.client.settings.GameSettings$Options[] __sourceSpill1789_54 = new net.minecraft.client.settings.GameSettings$Options[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_52(2422, (3102573305266205147L ^ local11_life6))];
    (__sourceSpill1789_54)[0] = net.minecraft.client.settings.GameSettings$Options.GRAPHICS;
    (__sourceSpill1789_54)[1] = net.minecraft.client.settings.GameSettings$Options.RENDER_DISTANCE;
    (__sourceSpill1789_54)[2] = net.minecraft.client.settings.GameSettings$Options.AMBIENT_OCCLUSION;
    (__sourceSpill1789_54)[3] = net.minecraft.client.settings.GameSettings$Options.FRAMERATE_LIMIT;
    (__sourceSpill1789_54)[4] = net.minecraft.client.settings.GameSettings$Options.AO_LEVEL;
    (__sourceSpill1789_54)[5] = net.minecraft.client.settings.GameSettings$Options.VIEW_BOBBING;
    (__sourceSpill1789_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_60(7062, (2241044018014675712L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.GUI_SCALE;
    (__sourceSpill1789_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_62(23172, (6700720020197515799L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.USE_VBO;
    (__sourceSpill1789_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_64(30680, (8161997689398169434L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.GAMMA;
    (__sourceSpill1789_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_66(204, (4225559002114193483L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.BLOCK_ALTERNATIVES;
    (__sourceSpill1789_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_68(22314, (355682258513080250L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.DYNAMIC_LIGHTS;
    (__sourceSpill1789_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_70(31219, (1951002603074093424L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.DYNAMIC_FOV;
    z = ((net.minecraft.client.settings.GameSettings$Options[])(__sourceSpill1789_54));
}


protected void b__Void(moom.gc p0) {
if ((((moom.gc)(p0)).l == ((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.GUI_SCALE)).ordinal())) {
        ((net.minecraft.client.gui.GuiVideoSettings)(this)).a(((moom.gc)(p0)), ((int)(-1)));
    }
    return;
}


public static int b(moom.gc p0) {
return ((moom.gc)(p0)).h;
}


public void c__Void() {
long life1_3;
    int life3_14;
    net.minecraft.client.settings.GameSettings$Options life4_22;
    int life5_45;
    int life6_70;
    int life3_132;
    int life4_134;
    int life4_145;
    int life4_178;
    int life3_202;
    int life4_213;
    int life4_246;
    int life3_270;
    int life4_281;
    int life4_314;
    int life3_338;
    life1_3 = (net.minecraft.client.gui.GuiVideoSettings.B ^ 32865999704555L);
    this.x = ((java.lang.String)(moom.oO.a(((java.lang.String)("options.videoTitle")), ((java.lang.Object[])(new java.lang.Object[0])))));
    ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).clear();
    life3_14 = 0;
    while ((life3_14 < (net.minecraft.client.gui.GuiVideoSettings.z).length)) {
        life4_22 = (net.minecraft.client.gui.GuiVideoSettings.z)[life3_14];
        if ((life4_22 != null)) {
        life5_45 = (((((net.minecraft.client.gui.GuiVideoSettings)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_8(14875, (4623693241943920524L ^ life1_3))) + ((life3_14 % 2) * __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_9(6133, (1515854581701517892L ^ life1_3))));
        life6_70 = (((((net.minecraft.client.gui.GuiVideoSettings)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_11(28509, (9044837151020014277L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic8482_12(20340, (7121992368406756064L ^ life1_3)) * (life3_14 / 2))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_13(19585, (1022697402428029189L ^ life1_3)));
        if (((net.minecraft.client.settings.GameSettings$Options)(life4_22)).a__Boolean()) {
        ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).add(((java.lang.Object)(new moom.gl(((net.minecraft.client.settings.GameSettings$Options)(life4_22)).a__Int(), life5_45, life6_70, life4_22))));
    } else {
        ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).add(((java.lang.Object)(new moom.gj(((net.minecraft.client.settings.GameSettings$Options)(life4_22)).a__Int(), life5_45, life6_70, life4_22, ((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(life4_22)))))));
    }
    }
        life3_14 += 1;
    }
    life3_132 = (((((net.minecraft.client.gui.GuiVideoSettings)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_24(7062, (2241035610705047065L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic8482_25(27849, (380023997257439553L ^ life1_3)) * ((net.minecraft.client.gui.GuiVideoSettings.z).length / 2))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_27(2422, (3102564876775865538L ^ life1_3)));
    life4_134 = 0;
    life4_145 = ((((net.minecraft.client.gui.GuiVideoSettings)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_29(21615, (478935234163204602L ^ life1_3)));
    ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).add(((java.lang.Object)(new moom.gi(__sourceIntrinsic_7ac46ee229a8_invokedynamic8482_31(31330, (8125321942920712169L ^ life1_3)), life4_145, life3_132, moom.JM.a(((java.lang.String)("of.options.shaders")))))));
    life4_178 = (((((net.minecraft.client.gui.GuiVideoSettings)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_35(21615, (478935234163204602L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_36(2952, (1084561119792315965L ^ life1_3)));
    ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).add(((java.lang.Object)(new moom.gi(__sourceIntrinsic_7ac46ee229a8_invokedynamic8482_38(24000, (8249146407418751052L ^ life1_3)), life4_178, life3_132, moom.JM.a(((java.lang.String)("of.options.quality")))))));
    life3_202 = (life3_132 + __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_41(27849, (380023997257439553L ^ life1_3)));
    life4_213 = ((((net.minecraft.client.gui.GuiVideoSettings)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_43(21615, (478935234163204602L ^ life1_3)));
    ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).add(((java.lang.Object)(new moom.gi(__sourceIntrinsic_7ac46ee229a8_invokedynamic8482_45(14855, (7036516405245710208L ^ life1_3)), life4_213, life3_202, moom.JM.a(((java.lang.String)("of.options.details")))))));
    life4_246 = (((((net.minecraft.client.gui.GuiVideoSettings)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_49(21615, (478935234163204602L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_50(2952, (1084561119792315965L ^ life1_3)));
    ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).add(((java.lang.Object)(new moom.gi(__sourceIntrinsic_7ac46ee229a8_invokedynamic8482_52(17966, (7654546445291385768L ^ life1_3)), life4_246, life3_202, moom.JM.a(((java.lang.String)("of.options.performance")))))));
    life3_270 = (life3_202 + __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_55(27849, (380023997257439553L ^ life1_3)));
    life4_281 = ((((net.minecraft.client.gui.GuiVideoSettings)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_57(21615, (478935234163204602L ^ life1_3)));
    ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).add(((java.lang.Object)(new moom.gi(__sourceIntrinsic_7ac46ee229a8_invokedynamic8482_59(31717, (4561000098204307044L ^ life1_3)), life4_281, life3_270, moom.JM.a(((java.lang.String)("of.options.animations")))))));
    life4_314 = (((((net.minecraft.client.gui.GuiVideoSettings)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_63(21615, (478935234163204602L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_64(2952, (1084561119792315965L ^ life1_3)));
    ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).add(((java.lang.Object)(new moom.gi(__sourceIntrinsic_7ac46ee229a8_invokedynamic8482_66(8157, (8799991205036468812L ^ life1_3)), life4_314, life3_270, moom.JM.a(((java.lang.String)("of.options.other")))))));
    life3_338 = (life3_270 + __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_69(27849, (380023997257439553L ^ life1_3)));
    ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic8482_71(3469, (3930361164162578445L ^ life1_3)), ((((net.minecraft.client.gui.GuiVideoSettings)(this)).k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_73(1323, (7579634835790704796L ^ life1_3))), (((((net.minecraft.client.gui.GuiVideoSettings)(this)).l / __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_75(7062, (2241035610705047065L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_76(21860, (8432939068962595047L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_77(19670, (3982165432363153747L ^ life1_3))), moom.oO.a(((java.lang.String)("gui.done")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


public static java.lang.String a(moom.gF p0) {
return ((moom.hJ)(((moom.gF)(p0)).y)).a__String();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26338;
      if (D[var3] == null) {
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
         long var5 = C[var3];
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
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hE", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         D[var3] = var15;
      }

      return D[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiVideoSettings.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10392_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(moom.gc p0, int p1) {
long life3_3;
    int life5_10;
    moom.ir life6_73;
    int life7_76;
    int life8_79;
    moom.hy life6_110;
    moom.hC life6_133;
    moom.hx life6_156;
    moom.hB life6_179;
    moom.hA life6_202;
    moom.hH life6_264;
    forward_join_248: {
    forward_join_233: {
    forward_join_224: {
    forward_join_216: {
    forward_join_210: {
    forward_join_198: {
    forward_join_175: {
    forward_join_152: {
    forward_join_129: {
    forward_join_106: {
    forward_join_83: {
    forward_join_54: {
    forward_join_37: {
    life3_3 = (net.minecraft.client.gui.GuiVideoSettings.B ^ 69032324262253L);
    if (!(((moom.gc)(p0)).m)) { break forward_join_248; }
    life5_10 = ((net.minecraft.client.settings.GameSettings)(this.y)).aZ;
    if (!((((moom.gc)(p0)).l < __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_5(16814, (8920569146068946101L ^ life3_3))))) { break forward_join_37; }
    if (!((((p0 instanceof moom.gi) ? 1 : 0) != 0))) { break forward_join_37; }
    ((net.minecraft.client.settings.GameSettings)(this.y)).a(((net.minecraft.client.settings.GameSettings$Options)(((moom.gi)(((moom.gi)(p0)))).b())), ((int)(p1)));
    ((moom.gc)(p0)).k = ((java.lang.String)(((net.minecraft.client.settings.GameSettings)(this.y)).a__String(((net.minecraft.client.settings.GameSettings$Options)(net.minecraft.client.settings.GameSettings$Options.a(((int)(((moom.gc)(p0)).l))))))));
    }
    if (!((((moom.gc)(p0)).l == __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_17(16814, (8920569146068946101L ^ life3_3))))) { break forward_join_54; }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).W)).b();
    ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(this.w)));
    }
    if (!((((net.minecraft.client.settings.GameSettings)(this.y)).aZ != life5_10))) { break forward_join_83; }
    life6_73 = new moom.ir(((net.minecraft.client.gui.GuiVideoSettings)(this)).i);
    life7_76 = ((moom.ir)(life6_73)).a__Int();
    life8_79 = ((moom.ir)(life6_73)).b__Int();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.eM())));
    ((net.minecraft.client.gui.GuiVideoSettings)(this)).a(((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)), ((int)(life7_76)), ((int)(life8_79)));
    }
    if (!((((moom.gc)(p0)).l == __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_35(12610, (1097578628796398706L ^ life3_3))))) { break forward_join_106; }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).W)).b();
    life6_110 = new moom.hy(this, this.y);
    ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(life6_110)));
    }
    if (!((((moom.gc)(p0)).l == __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_43(20305, (3177582019596206657L ^ life3_3))))) { break forward_join_129; }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).W)).b();
    life6_133 = new moom.hC(this, this.y);
    ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(life6_133)));
    }
    if (!((((moom.gc)(p0)).l == __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_51(31652, (8279774558598788784L ^ life3_3))))) { break forward_join_152; }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).W)).b();
    life6_156 = new moom.hx(this, this.y);
    ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(life6_156)));
    }
    if (!((((moom.gc)(p0)).l == __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_59(7334, (8688648171853681069L ^ life3_3))))) { break forward_join_175; }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).W)).b();
    life6_179 = new moom.hB(this, this.y);
    ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(life6_179)));
    }
    if (!((((moom.gc)(p0)).l == __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_67(29798, (657248362983749998L ^ life3_3))))) { break forward_join_198; }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).W)).b();
    life6_202 = new moom.hA(this, this.y);
    ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(life6_202)));
    }
    if (!((((moom.gc)(p0)).l == __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_75(23816, (6389785559054405655L ^ life3_3))))) { break forward_join_248; }
    if (!((!moom.BU.W()))) { break forward_join_210; }
    if (!(moom.BU.X())) { break forward_join_216; }
    }
    moom.BU.a__Void(((java.lang.String)(moom.JM.a(((java.lang.String)("of.message.shaders.aa1"))))), ((java.lang.String)(moom.JM.a(((java.lang.String)("of.message.shaders.aa2"))))));
    return;
    }
    if (!(moom.BU.V())) { break forward_join_224; }
    moom.BU.a__Void(((java.lang.String)(moom.JM.a(((java.lang.String)("of.message.shaders.af1"))))), ((java.lang.String)(moom.JM.a(((java.lang.String)("of.message.shaders.af2"))))));
    return;
    }
    if (!(((net.minecraft.client.settings.GameSettings)(moom.BU.a__pw())).p)) { break forward_join_233; }
    moom.BU.a__Void(((java.lang.String)(moom.JM.a(((java.lang.String)("of.message.shaders.an1"))))), ((java.lang.String)(moom.JM.a(((java.lang.String)("of.message.shaders.an2"))))));
    return;
    }
    ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).W)).b();
    life6_264 = new moom.hH(this, this.y);
    ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiVideoSettings)(this)).i)).a(((net.minecraft.client.gui.GuiScreen)(life6_264)));
    }
    return;
}


public void a(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiVideoSettings.B ^ 35977716126829L);
    ((net.minecraft.client.gui.GuiVideoSettings)(this)).i();
    ((net.minecraft.client.gui.GuiVideoSettings)(this)).a(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiVideoSettings)(this)).p)), ((java.lang.String)(this.x)), ((int)((((net.minecraft.client.gui.GuiVideoSettings)(this)).k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_5(5845, (8947264517903722191L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_6(14826, (1240357985078544878L ^ local4)))));
    java.lang.String local6 = moom.BU.a__String();
    java.lang.String local7 = "HD_U";
    if (((java.lang.String)(local7)).equals(((java.lang.Object)("HD")))) {
        local6 = "OptiFine HD M5";
    }
    if (((java.lang.String)(local7)).equals(((java.lang.Object)("HD_U")))) {
        local6 = "OptiFine HD M5 Ultra";
    }
    if (((java.lang.String)(local7)).equals(((java.lang.Object)("L")))) {
        local6 = "OptiFine M5 Light";
    }
    ((net.minecraft.client.gui.GuiVideoSettings)(this)).b(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiVideoSettings)(this)).p)), ((java.lang.String)(local6)), ((int)(2)), ((int)((((net.minecraft.client.gui.GuiVideoSettings)(this)).l - __sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_14(16351, (6812111248849637322L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_15(28650, (1629413975631978483L ^ local4)))));
    java.lang.String local8 = "Moon Client";
    int local9 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiVideoSettings)(this)).p)).a(((java.lang.String)(local8)));
    ((net.minecraft.client.gui.GuiVideoSettings)(this)).b(((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiVideoSettings)(this)).p)), ((java.lang.String)(local8)), ((int)(((((net.minecraft.client.gui.GuiVideoSettings)(this)).k - local9) - 2))), ((int)((((net.minecraft.client.gui.GuiVideoSettings)(this)).l - __sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_22(22314, (355667647133738789L ^ local4))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_23(8668, (1282981822355018186L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.LI)(this.A)).a(((int)(p0)), ((int)(p1)), ((java.util.List)(((net.minecraft.client.gui.GuiVideoSettings)(this)).m)));
    return;
}


public static int a(moom.gc p0) {
return ((moom.gc)(p0)).g;
}


protected void a__Void(moom.gc p0) throws java.io.IOException {
((net.minecraft.client.gui.GuiVideoSettings)(this)).a(((moom.gc)(p0)), ((int)(1)));
    return;
}


public static void a(net.minecraft.client.gui.GuiScreen p0, int p1, int p2, int p3, int p4, int p5, int p6) {
((net.minecraft.client.gui.GuiScreen)(p0)).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1789_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic8565_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10392_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ffcde045ffb5_invokedynamic5427_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic8482_77(int a0, long a1) throws E;
}
