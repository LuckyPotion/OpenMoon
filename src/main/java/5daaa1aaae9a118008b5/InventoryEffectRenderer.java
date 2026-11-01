package net.minecraft.client.renderer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class InventoryEffectRenderer extends moom.hg {

private boolean Z;

private static final long fb;

private static final long[] pb;

private static final java.lang.Integer[] qb;

private static final java.util.Map rb;

public InventoryEffectRenderer(moom.v8 p0) {
super(p0);
}


static {
fb = ((long)(((moom._a)(moom._c.a(((long)(8074968839026304981L)), ((long)(8842267416497526328L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(79307688494934L)))));
    rb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.InventoryEffectRenderer.fb ^ 105437955078811L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1808_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1808_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1808_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1808_14 = new byte[8];
    (__sourceSpill1808_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1808_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1808_16 = __sourceSpill1808_14;
    ((javax.crypto.Cipher)(__sourceSpill1808_11)).init(((int)(__sourceSpill1808_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1808_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1808_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[21];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\0133\030·Q\035µoÒMðª®+ì×^\177\013g¶mºå½\023àF5ç\177é/wó>\0002ûô¾´#EK)yuI\003Ã^S»Ñ_\032éF|¾>ÌI_Þ£ÚNï2\r@þFÆÈ0Ç½B\bã\017\030k~(`VrfÅ\0257\000}\"ûtå\013÷º0Ô:ÇÑöi7X\037\näÄ´íU\032R¨þ!j%5MÀ\f3UÞ¿Êð"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1808_25 = local6_life21;
        int __sourceSpill1808_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1808_25)).substring(((int)(__sourceSpill1808_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1808_30 = local8_life19;
        int __sourceSpill1808_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1808_33 = new byte[8];
        (__sourceSpill1808_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1808_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1808_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1808_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1808_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1808_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1808_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1808_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1808_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1808_34)).doFinal(((byte[])(__sourceSpill1808_33)));
        (__sourceSpill1808_30)[__sourceSpill1808_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "í%\026T\n¢ØÒ7/2ù\036q"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1808_38 = local6_life21;
        int __sourceSpill1808_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1808_38)).substring(((int)(__sourceSpill1808_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1808_43 = local8_life19;
        int __sourceSpill1808_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1808_46 = new byte[8];
        (__sourceSpill1808_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1808_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1808_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1808_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1808_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1808_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1808_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1808_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1808_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1808_47)).doFinal(((byte[])(__sourceSpill1808_46)));
        (__sourceSpill1808_43)[__sourceSpill1808_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    pb = ((long[])(local8_life19));
    qb = ((java.lang.Integer[])(new java.lang.Integer[21]));
}


protected void b__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.client.renderer.InventoryEffectRenderer.fb ^ 3521927797471L);
    if ((!((java.util.Collection)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).i)).K)).a__Collection())).isEmpty())) {
        ((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).A = ((int)((__sourceIntrinsic_938da207dded_invokedynamic10597_5(10400, (8801865093638297587L ^ local1)) + (((((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).k - ((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).x) - __sourceIntrinsic_938da207dded_invokedynamic10597_8(4279, (999106293616029672L ^ local1))) / 2))));
        this.Z = ((boolean)(true));
    } else {
        ((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).A = ((int)(((((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).k - ((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).x) / 2)));
        this.Z = ((boolean)(false));
    }
    return;
}


public void c__Void() {
super.c__Void();
    ((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).b__sourceReturn_da8c82d5d4();
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10598_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hs"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11392;
      if (qb[var3] == null) {
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
         long var5 = pb[var3];
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
         Object[] var9 = (Object[])rb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               rb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hs", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         qb[var3] = var15;
      }

      return qb[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.InventoryEffectRenderer.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0, int p1, float p2) {
super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    if ((((this.Z) ? 1 : 0) != 0)) {
        ((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).j();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void j() {
long life1_3;
    int life3_12;
    int life4_15;
    int life5_21;
    java.util.Collection life6_26;
    int life7_41;
    java.util.Iterator life8_62;
    net.minecraft.potion.PotionEffect life9_69;
    net.minecraft.potion.Potion life10_74;
    int life11_115;
    java.lang.String life11_179;
    java.lang.String life12_249;
    life1_3 = (net.minecraft.client.renderer.InventoryEffectRenderer.fb ^ 41517407091951L);
    life3_12 = (((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).A - __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_2(28823, (6891068300974893548L ^ life1_3)));
    life4_15 = ((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).B;
    life5_21 = __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_4(27484, (6725914634800181814L ^ life1_3));
    life6_26 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).i)).K)).a__Collection();
    if ((!((java.util.Collection)(life6_26)).isEmpty())) {
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        int spill8385_0 = 9515;
        moom.kZ.f();
        life7_41 = __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_11(spill8385_0, (1838643539891125331L ^ life1_3));
        if ((((java.util.Collection)(life6_26)).size() > 5)) {
        life7_41 = (__sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_13(21556, (6363509976839818582L ^ life1_3)) / (((java.util.Collection)(life6_26)).size() - 1));
    }
        life8_62 = ((java.util.Collection)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).i)).K)).a__Collection())).iterator();
        loop_region_63: while (((java.util.Iterator)(life8_62)).hasNext()) {
        life9_69 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life8_62)).next()));
        life10_74 = (net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(life9_69)).a()];
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).i)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.renderer.InventoryEffectRenderer.w)));
        ((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).b(((int)(life3_12)), ((int)(life4_15)), ((int)(0)), ((int)(__sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_29(21415, (762761496643963591L ^ life1_3)))), ((int)(__sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_30(15387, (3101315297892361599L ^ life1_3)))), ((int)(__sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_31(7768, (5025097998576600883L ^ life1_3)))));
        if ((life10_74 == null)) {
        continue loop_region_63;
    }
        if (((net.minecraft.potion.Potion)(life10_74)).b__Boolean()) {
        life11_115 = ((net.minecraft.potion.Potion)(life10_74)).b();
        ((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).b(((int)((life3_12 + __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_35(21629, (8775995266172521747L ^ life1_3))))), ((int)((life4_15 + __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_36(12702, (697202578053687547L ^ life1_3))))), ((int)(((life11_115 % __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_37(19611, (5345313445482075634L ^ life1_3))) * __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_38(8911, (4353524236548045731L ^ life1_3))))), ((int)((__sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_39(19912, (5081837575780865198L ^ life1_3)) + ((life11_115 / __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_40(14643, (7162999967759884362L ^ life1_3))) * __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_41(12124, (4675378109885838897L ^ life1_3)))))), ((int)(__sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_42(12124, (4675378109885838897L ^ life1_3)))), ((int)(__sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_43(12124, (4675378109885838897L ^ life1_3)))));
    }
        life11_179 = moom.oO.a(((java.lang.String)(((net.minecraft.potion.Potion)(life10_74)).a__String())), ((java.lang.Object[])(new java.lang.Object[0])));
        if ((((net.minecraft.potion.PotionEffect)(life9_69)).c() == 1)) {
        life11_179 = __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_49(life11_179, moom.oO.a(((java.lang.String)("enchantment.level.2")), ((java.lang.Object[])(new java.lang.Object[0]))));
    } else {
        if ((((net.minecraft.potion.PotionEffect)(life9_69)).c() == 2)) {
        life11_179 = __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_52(life11_179, moom.oO.a(((java.lang.String)("enchantment.level.3")), ((java.lang.Object[])(new java.lang.Object[0]))));
    } else {
        if ((((net.minecraft.potion.PotionEffect)(life9_69)).c() == 3)) {
        life11_179 = __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_55(life11_179, moom.oO.a(((java.lang.String)("enchantment.level.4")), ((java.lang.Object[])(new java.lang.Object[0]))));
    }
    }
    }
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).p)).a(((java.lang.String)(life11_179)), ((float)(((float) ((life3_12 + __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_57(1452, (152171862884637899L ^ life1_3))) + __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_58(12124, (4675378109885838897L ^ life1_3)))))), ((float)(((float) (life4_15 + __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_59(16340, (6067889916066555566L ^ life1_3)))))), ((int)(__sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_60(22134, (6125517191487000343L ^ life1_3)))));
        life12_249 = net.minecraft.potion.Potion.a(((net.minecraft.potion.PotionEffect)(life9_69)));
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.renderer.InventoryEffectRenderer)(this)).p)).a(((java.lang.String)(life12_249)), ((float)(((float) ((life3_12 + __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_64(17440, (5981158464432545096L ^ life1_3))) + __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_65(12124, (4675378109885838897L ^ life1_3)))))), ((float)(((float) ((life4_15 + __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_66(16340, (6067889916066555566L ^ life1_3))) + __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_67(17440, (5981158464432545096L ^ life1_3)))))), ((int)(__sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_68(2996, (2377267775339778762L ^ life1_3)))));
        life4_15 = (life4_15 + life7_41);
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic10597_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic10597_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10598_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_49(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_52(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_55(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7f949c9ef6e_invokedynamic8385_68(int a0, long a1) throws E;
}
