package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class r7 extends net.minecraft.client.particle.EntityFX {

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

protected r7(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.item.Item p4, int p5) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_937463b0b7266a09(moom.r7 receiver, net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.item.Item p4, int p5) throws Throwable {

moom.r7 spill492_0;

    moom.r7 spill492_1;

    float spill492_2;

    float spill492_3;

    moom.r7.__sourceConstructorInit_937463b0b7266a09_0(((moom.r7)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));

    ((moom.r7)(receiver)).a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((moom.ll)(((net.minecraft.client.renderer.entity.RenderItem)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nv())).a())).a__oh(((net.minecraft.item.Item)(p4)), ((int)(p5))))));

    spill492_0 = receiver;

    spill492_1 = receiver;

    moom.r7 __stackOp492_6_0 = receiver;

    float __stackOp492_6_1 = 0x1.0p0f;

    spill492_2 = __stackOp492_6_1;

    ((moom.r7)(__stackOp492_6_0)).aO = ((float)(__stackOp492_6_1));

    moom.r7 __stackOp492_8_0 = spill492_1;

    float __stackOp492_8_1 = spill492_2;

    spill492_3 = __stackOp492_8_1;

    ((moom.r7)(__stackOp492_8_0)).aN = ((float)(__stackOp492_8_1));

    ((moom.r7)(spill492_0)).aM = ((float)(spill492_3));

    ((moom.r7)(receiver)).aL = ((float)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aJ)).I));

    moom.r7 __stackOp492_14_0 = receiver;

    ((moom.r7)(__stackOp492_14_0)).aK = ((float)((((moom.r7)(__stackOp492_14_0)).aK / 0x1.0p1f)));

    return;

}



protected r7(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, net.minecraft.item.Item p7, int p8) {
this(((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((net.minecraft.item.Item)(p7)), ((int)(p8)));
    this.t *= 0x1.99999ap-4d;
    this.u *= 0x1.99999ap-4d;
    this.v *= 0x1.99999ap-4d;
    this.t += p4;
    this.u += p5;
    this.v += p6;
    return;
}


protected r7(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.item.Item p4) {
this(((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((net.minecraft.item.Item)(p4)), ((int)(0)));
    return;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-5477901615552400743L)), ((long)(-6574553260859413932L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(265481718681110L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.r7.bb ^ 46984298135976L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill979_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill979_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill979_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill979_14 = new byte[8];
    (__sourceSpill979_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill979_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation979_16 = __sourceSpill979_14;
    ((javax.crypto.Cipher)(__sourceSpill979_11)).init(((int)(__sourceSpill979_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill979_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation979_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "5&\005'ÈîE§ú`i¤+)}s÷U]½Qlþ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill979_25 = local6_life21;
        int __sourceSpill979_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill979_25)).substring(((int)(__sourceSpill979_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill979_30 = local8_life19;
        int __sourceSpill979_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill979_33 = new byte[8];
        (__sourceSpill979_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill979_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill979_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill979_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill979_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill979_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill979_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill979_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill979_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill979_34)).doFinal(((byte[])(__sourceSpill979_33)));
        (__sourceSpill979_30)[__sourceSpill979_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_937463b0b7266a09_0(moom.r7 a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.r7.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8903_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/r7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23278;
      if (ib[var3] == null) {
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
         long var5 = hb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/r7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


public int a__Int() {
return 1;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long local9 = (moom.r7.bb ^ 88929520449387L);
    float local11 = ((((float) this.aE) + (this.aG / 0x1.0p2f)) / 0x1.0p4f);
    float local12 = (local11 + 0x1.ff7ceep-7f);
    float local13 = ((((float) this.aF) + (this.aH / 0x1.0p2f)) / 0x1.0p4f);
    float local14 = (local13 + 0x1.ff7ceep-7f);
    float local15 = (0x1.99999ap-4f * this.aK);
    if ((this.aQ != null)) {
        local11 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).a(((double)(((double) ((this.aG / 0x1.0p2f) * 0x1.0p4f)))));
        local12 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).a(((double)(((double) (((this.aG + 0x1.0p0f) / 0x1.0p2f) * 0x1.0p4f)))));
        local13 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).b(((double)(((double) ((this.aH / 0x1.0p2f) * 0x1.0p4f)))));
        local14 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.aQ)).b(((double)(((double) (((this.aH + 0x1.0p0f) / 0x1.0p2f) * 0x1.0p4f)))));
    }
    float local16 = ((float) ((this.k + ((this.n - this.k) * ((double) p2))) - moom.r7.aR));
    float local17 = ((float) ((this.l + ((this.o - this.l) * ((double) p2))) - moom.r7.aS));
    float local18 = ((float) ((this.m + ((this.p - this.m) * ((double) p2))) - moom.r7.aT));
    int local19 = ((moom.r7)(this)).a__Int(((float)(p2)));
    int local20 = ((local19 >> __sourceIntrinsic_54c23c7634ff_invokedynamic7409_32(22788, (6082294514920057966L ^ local9))) & __sourceIntrinsic_54c23c7634ff_invokedynamic7409_33(27929, (8082126831179716720L ^ local9)));
    int local21 = (local19 & __sourceIntrinsic_54c23c7634ff_invokedynamic7409_34(19813, (4349758394225489934L ^ local9)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 - (p3 * local15)) - (p6 * local15))))), ((double)(((double) (local17 - (p4 * local15))))), ((double)(((double) ((local18 - (p5 * local15)) - (p7 * local15)))))))).a(((double)(((double) local11))), ((double)(((double) local14)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 - (p3 * local15)) + (p6 * local15))))), ((double)(((double) (local17 + (p4 * local15))))), ((double)(((double) ((local18 - (p5 * local15)) + (p7 * local15)))))))).a(((double)(((double) local11))), ((double)(((double) local13)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 + (p3 * local15)) + (p6 * local15))))), ((double)(((double) (local17 + (p4 * local15))))), ((double)(((double) ((local18 + (p5 * local15)) + (p7 * local15)))))))).a(((double)(((double) local12))), ((double)(((double) local13)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(p0)).a(((double)(((double) ((local16 + (p3 * local15)) - (p6 * local15))))), ((double)(((double) (local17 - (p4 * local15))))), ((double)(((double) ((local18 + (p5 * local15)) - (p7 * local15)))))))).a(((double)(((double) local12))), ((double)(((double) local14)))))).a(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)), ((float)(0x1.0p0f))))).a(((int)(local20)), ((int)(local21))))).c__Void();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7409_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7409_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7409_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8903_0() throws E;
}
