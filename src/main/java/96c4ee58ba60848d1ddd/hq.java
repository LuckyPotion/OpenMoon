package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hq extends moom.hg {

private static final moom.DD Z;

private final net.minecraft.entity.player.InventoryPlayer aa;

public net.minecraft.inventory.IInventory ab;

private static final long cb;

private static final long[] fb;

private static final java.lang.Integer[] pb;

private static final java.util.Map qb;

public hq(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1) {
super(new moom.wf(p0, p1));
    this.aa = p0;
    this.ab = p1;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-3912146526990917905L)), ((long)(5585427955052098432L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114622183489583L)))));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.hq.cb ^ 120273438151614L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1266_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1266_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1266_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1266_14 = new byte[8];
    (__sourceSpill1266_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1266_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1266_16 = __sourceSpill1266_14;
    ((javax.crypto.Cipher)(__sourceSpill1266_11)).init(((int)(__sourceSpill1266_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1266_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1266_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[17];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Që^e\177ItKå\001m\033õsÛu\r@%ì,T m8ÛGf\0221Ä\000Ç\030ÖCIVÈ-¤S8\024\003{>O\030Må`;!\0056Gl\0076ûHÛB\026üâ¤É@[e²,\034\033w9ÌÃ<èGì{l\016\036b\024Vp\0367X\006¿?óÏÀx\nî¡h"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1266_25 = local6_life21;
        int __sourceSpill1266_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1266_25)).substring(((int)(__sourceSpill1266_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1266_30 = local8_life19;
        int __sourceSpill1266_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1266_33 = new byte[8];
        (__sourceSpill1266_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1266_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1266_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1266_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1266_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1266_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1266_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1266_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1266_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1266_34)).doFinal(((byte[])(__sourceSpill1266_33)));
        (__sourceSpill1266_30)[__sourceSpill1266_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\n\0310}\022W>â\025}q\034C"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1266_38 = local6_life21;
        int __sourceSpill1266_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1266_38)).substring(((int)(__sourceSpill1266_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1266_43 = local8_life19;
        int __sourceSpill1266_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1266_46 = new byte[8];
        (__sourceSpill1266_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1266_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1266_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1266_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1266_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1266_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1266_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1266_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1266_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1266_47)).doFinal(((byte[])(__sourceSpill1266_46)));
        (__sourceSpill1266_43)[__sourceSpill1266_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    fb = ((long[])(local8_life19));
    pb = ((java.lang.Integer[])(new java.lang.Integer[17]));
    Z = ((moom.DD)(new moom.DD("textures/gui/container/furnace.png")));
}


private int b__sourceReturn_0f7a48eca2(int p0) {
long local2 = (moom.hq.cb ^ 112940307920513L);
    int local4 = __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.ab)), ((int)(1)));
    if ((local4 == 0)) {
        local4 = __sourceIntrinsic_ead3c349e325_invokedynamic7926_3(20121, (9157454878532922885L ^ local2));
    }
    return ((__sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.ab)), ((int)(0))) * p0) / local4);
}


protected void b(int p0, int p1) {
long local3 = (moom.hq.cb ^ 130159472121152L);
    java.lang.String local5 = ((net.minecraft.util.IChatComponent)(((net.minecraft.inventory.IInventory)(this.ab)).a__C5())).b();
    ((net.minecraft.client.gui.FontRenderer)(((moom.hq)(this)).p)).b(((java.lang.String)(local5)), ((float)(((float) ((((moom.hq)(this)).x / 2) - (((net.minecraft.client.gui.FontRenderer)(((moom.hq)(this)).p)).a(((java.lang.String)(local5))) / 2))))), ((float)(0x1.8p2f)), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1497_8(28760, (9089607223895421706L ^ local3)))));
    ((net.minecraft.client.gui.FontRenderer)(((moom.hq)(this)).p)).b(((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.entity.player.InventoryPlayer)(this.aa)).a__C5())).b())), ((float)(0x1.0p3f)), ((float)(((float) ((((moom.hq)(this)).y - __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1497_15(20299, (6600564885590789141L ^ local3))) + 2)))), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1497_16(2182, (7968470752554552277L ^ local3)))));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4742;
      if (pb[var3] == null) {
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
         long var5 = fb[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hq.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7927_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(float p0, int p1, int p2) {
long life4_3;
    int life6_21;
    int life7_29;
    int life8_51;
    int life8_103;
    life4_3 = (moom.hq.cb ^ 56388029463009L);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(((moom.hq)(this)).i)).a__ok())).a__Void(((moom.DD)(moom.hq.Z)));
    life6_21 = ((((moom.hq)(this)).k - ((moom.hq)(this)).x) / 2);
    life7_29 = ((((moom.hq)(this)).l - ((moom.hq)(this)).y) / 2);
    ((moom.hq)(this)).b(((int)(life6_21)), ((int)(life7_29)), ((int)(0)), ((int)(0)), ((int)(((moom.hq)(this)).x)), ((int)(((moom.hq)(this)).y)));
    if (net.minecraft.tileentity.TileEntityFurnace.a(((net.minecraft.inventory.IInventory)(this.ab)))) {
        life8_51 = ((moom.hq)(this)).b__sourceReturn_0f7a48eca2(((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic6576_15(29704, (9057471637411879929L ^ life4_3)))));
        ((moom.hq)(this)).b(((int)((life6_21 + __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_17(22200, (670104627050084675L ^ life4_3))))), ((int)((((life7_29 + __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_18(1252, (813103926123080465L ^ life4_3))) + __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_19(21119, (7111618769285119362L ^ life4_3))) - life8_51))), ((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic6576_20(29617, (4267096681009044549L ^ life4_3)))), ((int)((__sourceIntrinsic_3f29d380c6dd_invokedynamic6576_21(16077, (4327558677203423541L ^ life4_3)) - life8_51))), ((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic6576_22(5760, (1984100327575566718L ^ life4_3)))), ((int)((life8_51 + 1))));
    }
    life8_103 = ((moom.hq)(this)).a__sourceReturn_0f7a48eca2(((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic6576_24(11982, (9054888564662141219L ^ life4_3)))));
    ((moom.hq)(this)).b(((int)((life6_21 + __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_26(28065, (2435070388634534486L ^ life4_3))))), ((int)((life7_29 + __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_27(11932, (5128310073769918821L ^ life4_3))))), ((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic6576_28(7392, (6469178454833574672L ^ life4_3)))), ((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic6576_29(26584, (6310927924215597102L ^ life4_3)))), ((int)((life8_103 + 1))), ((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic6576_30(17245, (4200469287965650087L ^ life4_3)))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private int a__sourceReturn_0f7a48eca2(int p0) {
int forwardValue3609_21_0;
    int life2_4;
    int life3_9;
    forward_join_21: {
    forward_join_20: {
    life2_4 = __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.ab)), ((int)(2)));
    life3_9 = __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.ab)), ((int)(3)));
    if (!((life3_9 != 0))) {
        break forward_join_20;
    }
    if (!((life2_4 != 0))) {
        break forward_join_20;
    }
    forwardValue3609_21_0 = ((life2_4 * p0) / life3_9);
    break forward_join_21;
    }
    forwardValue3609_21_0 = 0;
    }
    return forwardValue3609_21_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_ead3c349e325_invokedynamic7926_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1497_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1497_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1497_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7927_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic6576_30(int a0, long a1) throws E;

private static native int __sourceExactCall_cdf7df5ac5b665(net.minecraft.inventory.IInventory p0, int p1);
}
